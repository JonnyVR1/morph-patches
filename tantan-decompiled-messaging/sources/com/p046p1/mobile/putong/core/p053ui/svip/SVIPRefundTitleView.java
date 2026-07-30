package com.p046p1.mobile.putong.core.p053ui.svip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.pay.R$string;
import p149l.dnd0;

/* JADX INFO: loaded from: classes9.dex */
public class SVIPRefundTitleView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public View f36500d;

    /* JADX INFO: renamed from: e */
    public TextView f36501e;

    public SVIPRefundTitleView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m55835h0(View view) {
        dnd0.m112617a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m55836i0() {
        this.f36501e.setText(R$string.f27114C1);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55835h0(this);
    }

    public SVIPRefundTitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SVIPRefundTitleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
