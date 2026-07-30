package com.p046p1.mobile.putong.core.p053ui.svip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.data.AccountRecord;
import p149l.mqi0;
import p149l.qmd0;

/* JADX INFO: loaded from: classes9.dex */
public class SVIPRefundItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public TextView f36496d;

    /* JADX INFO: renamed from: e */
    public TextView f36497e;

    /* JADX INFO: renamed from: f */
    public TextView f36498f;

    /* JADX INFO: renamed from: g */
    public TextView f36499g;

    public SVIPRefundItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m55833h0(View view) {
        qmd0.m175564a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m55834i0(AccountRecord accountRecord) {
        this.f36498f.setText(accountRecord.content);
        this.f36499g.setText(mqi0.f135252d.format(Double.valueOf(accountRecord.createdTime)));
        this.f36496d.setText(String.format("¥%s", accountRecord.amount));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55833h0(this);
    }

    public SVIPRefundItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SVIPRefundItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
