// Generated code from Butter Knife. Do not modify!
package edu.detectortroyano.com.tipcalc.activities;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class TipDetailActivity$$ViewBinder<T extends edu.detectortroyano.com.tipcalc.activities.TipDetailActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492971, "field 'txtBillTotal'");
    target.txtBillTotal = finder.castView(view, 2131492971, "field 'txtBillTotal'");
    view = finder.findRequiredView(source, 2131492972, "field 'txtTip'");
    target.txtTip = finder.castView(view, 2131492972, "field 'txtTip'");
    view = finder.findRequiredView(source, 2131492973, "field 'txtTimeStamp'");
    target.txtTimeStamp = finder.castView(view, 2131492973, "field 'txtTimeStamp'");
  }

  @Override public void unbind(T target) {
    target.txtBillTotal = null;
    target.txtTip = null;
    target.txtTimeStamp = null;
  }
}
