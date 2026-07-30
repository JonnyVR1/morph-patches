package com.p046p1.mobile.putong.live.livingroom.common.bottom.areaA.view;

import android.content.Context;
import android.util.AttributeSet;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.view.BottomView;
import p149l.e30;

/* JADX INFO: loaded from: classes4.dex */
public class BottomInputView extends BottomView {

    /* JADX INFO: renamed from: a */
    public e30<Integer> f48566a;

    public BottomInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        e30<Integer> e30Var = this.f48566a;
        if (e30Var != null) {
            e30Var.call(Integer.valueOf(i3 - i));
        }
    }

    public void setOnLayoutAction(e30<Integer> e30Var) {
        this.f48566a = e30Var;
    }
}
