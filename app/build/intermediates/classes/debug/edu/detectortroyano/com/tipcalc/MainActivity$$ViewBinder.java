// Generated code from Butter Knife. Do not modify!
package edu.detectortroyano.com.tipcalc;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends edu.detectortroyano.com.tipcalc.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492970, "field 'inputBill'");
    target.inputBill = finder.castView(view, 2131492970, "field 'inputBill'");
    view = finder.findRequiredView(source, 2131492971, "field 'btnSubmmit' and method 'handleClickSubmit'");
    target.btnSubmmit = finder.castView(view, 2131492971, "field 'btnSubmmit'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.handleClickSubmit();
        }
      });
    view = finder.findRequiredView(source, 2131492972, "field 'inputPercentaje'");
    target.inputPercentaje = finder.castView(view, 2131492972, "field 'inputPercentaje'");
    view = finder.findRequiredView(source, 2131492973, "field 'btnIncrease' and method 'handleClickIncrease'");
    target.btnIncrease = finder.castView(view, 2131492973, "field 'btnIncrease'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.handleClickIncrease();
        }
      });
    view = finder.findRequiredView(source, 2131492974, "field 'btnDecrease' and method 'handleClickDecrease'");
    target.btnDecrease = finder.castView(view, 2131492974, "field 'btnDecrease'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.handleClickDecrease();
        }
      });
    view = finder.findRequiredView(source, 2131492975, "field 'btnClear'");
    target.btnClear = finder.castView(view, 2131492975, "field 'btnClear'");
    view = finder.findRequiredView(source, 2131492977, "field 'txtTip'");
    target.txtTip = finder.castView(view, 2131492977, "field 'txtTip'");
  }

  @Override public void unbind(T target) {
    target.inputBill = null;
    target.btnSubmmit = null;
    target.inputPercentaje = null;
    target.btnIncrease = null;
    target.btnDecrease = null;
    target.btnClear = null;
    target.txtTip = null;
  }
}
