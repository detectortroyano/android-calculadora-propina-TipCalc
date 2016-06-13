// Generated code from Butter Knife. Do not modify!
package edu.detectortroyano.com.tipcalc.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class TipHistoryListFragment$$ViewBinder<T extends edu.detectortroyano.com.tipcalc.fragments.TipHistoryListFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492986, "field 'recyclerView'");
    target.recyclerView = finder.castView(view, 2131492986, "field 'recyclerView'");
  }

  @Override public void unbind(T target) {
    target.recyclerView = null;
  }
}
