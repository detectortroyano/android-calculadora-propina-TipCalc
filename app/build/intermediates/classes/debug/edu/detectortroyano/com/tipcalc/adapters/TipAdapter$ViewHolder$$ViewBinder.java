// Generated code from Butter Knife. Do not modify!
package edu.detectortroyano.com.tipcalc.adapters;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class TipAdapter$ViewHolder$$ViewBinder<T extends edu.detectortroyano.com.tipcalc.adapters.TipAdapter.ViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492987, "field 'txtContent'");
    target.txtContent = finder.castView(view, 2131492987, "field 'txtContent'");
  }

  @Override public void unbind(T target) {
    target.txtContent = null;
  }
}
