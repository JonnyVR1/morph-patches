package com.p051p1.mobile.putong.core.p058ui.svip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.data.AccountRecord;
import p153l.bnl0;
import p153l.ihq0;
import p153l.pzi0;

/* JADX INFO: loaded from: classes12.dex */
public class WithdrawRecordsItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public TextView f37350d;

    /* JADX INFO: renamed from: e */
    public TextView f37351e;

    /* JADX INFO: renamed from: f */
    public View f37352f;

    public WithdrawRecordsItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m57023h0(View view) {
        ihq0.m140017a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m57024i0(AccountRecord accountRecord, boolean z) {
        this.f37350d.setText(pzi0.f154858e.format(Double.valueOf(accountRecord.createdTime)));
        this.f37351e.setText(String.format("¥%s", accountRecord.amount));
        bnl0.m105524M(this.f37352f, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57023h0(this);
    }

    public WithdrawRecordsItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WithdrawRecordsItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
