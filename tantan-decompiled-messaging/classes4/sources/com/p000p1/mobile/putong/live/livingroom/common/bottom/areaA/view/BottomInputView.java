package com.p000p1.mobile.putong.live.livingroom.common.bottom.areaA.view;

import android.content.Context;
import android.util.AttributeSet;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.view.BottomView;
import l.e30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class BottomInputView extends BottomView {

    /* JADX INFO: renamed from: a */
    public e30<Integer> f4608a;

    public BottomInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        e30<Integer> e30Var = this.f4608a;
        if (e30Var != null) {
            e30Var.call(Integer.valueOf(i3 - i));
        }
    }

    public void setOnLayoutAction(e30<Integer> e30Var) {
        this.f4608a = e30Var;
    }
}
