package com.p051p1.mobile.putong.live.livingroom.common.bottom.areaA.view;

import android.content.Context;
import android.util.AttributeSet;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.view.BottomView;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class BottomInputView extends BottomView {

    /* JADX INFO: renamed from: a */
    public y20<Integer> f49414a;

    public BottomInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        y20<Integer> y20Var = this.f49414a;
        if (y20Var != null) {
            y20Var.call(Integer.valueOf(i3 - i));
        }
    }

    public void setOnLayoutAction(y20<Integer> y20Var) {
        this.f49414a = y20Var;
    }
}
