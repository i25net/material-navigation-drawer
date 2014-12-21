package net.xpece.materialnavigationdrawer;

import android.content.Context;
import android.support.annotation.StringRes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pechanecjr on 14. 12. 2014.
 */
public class NavigationSectionDescriptor extends ArrayList<NavigationItemDescriptor> {
  private String heading;
  @StringRes
  private int headingId;

  public NavigationSectionDescriptor() {
  }

  public NavigationSectionDescriptor heading(String heading) {
    this.heading = heading;
    this.headingId = 0;
    return this;
  }

  public NavigationSectionDescriptor heading(@StringRes int heading) {
    this.headingId = heading;
    this.heading = null;
    return this;
  }

  public NavigationSectionDescriptor addItems(List<NavigationItemDescriptor> items) {
    this.addAll(items);
    return this;
  }

  public NavigationSectionDescriptor addItem(NavigationItemDescriptor item) {
    this.add(item);
    return this;
  }

  public String getHeading(Context context) {
    if (headingId != 0) {
      return context.getString(headingId);
    } else {
      return heading;
    }
  }

  public boolean hasHeading() {
    return heading != null || headingId != 0;
  }

  @Override
  public String toString() {
    return "NavigationSectionDescriptor{" +
        (heading == null ? "" : "heading='" + heading + '\'') +
        (headingId == 0 ? "" : ", headingId=" + headingId) +
        ", items=" + super.toString() +
        '}';
  }
}
