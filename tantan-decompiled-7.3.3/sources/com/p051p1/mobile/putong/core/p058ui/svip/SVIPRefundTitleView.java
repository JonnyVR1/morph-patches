package com.p051p1.mobile.putong.core.p058ui.svip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.pay.R$string;
import p153l.fvd0;

/* JADX INFO: loaded from: classes12.dex */
public class SVIPRefundTitleView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public View f37348d;

    /* JADX INFO: renamed from: e */
    public TextView f37349e;

    public SVIPRefundTitleView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m57018h0(View view) {
        fvd0.m127608a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m57019i0() {
        this.f37349e.setText(R$string.f27962C1);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57018h0(this);
    }

    public SVIPRefundTitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SVIPRefundTitleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
