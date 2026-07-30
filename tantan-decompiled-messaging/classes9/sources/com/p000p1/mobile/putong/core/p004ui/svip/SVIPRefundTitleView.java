package com.p000p1.mobile.putong.core.p004ui.svip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.core.pay.R;
import l.dnd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SVIPRefundTitleView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public View f6281d;

    /* JADX INFO: renamed from: e */
    public TextView f6282e;

    public SVIPRefundTitleView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m9233h0(View view) {
        dnd0.a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m9234i0() {
        this.f6282e.setText(R.string.C1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m9233h0(this);
    }

    public SVIPRefundTitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SVIPRefundTitleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
