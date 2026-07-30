package com.p046p1.mobile.putong.core.p053ui.svip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.data.AccountRecord;
import p149l.d8q0;
import p149l.mqi0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class WithdrawRecordsItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public TextView f36502d;

    /* JADX INFO: renamed from: e */
    public TextView f36503e;

    /* JADX INFO: renamed from: f */
    public View f36504f;

    public WithdrawRecordsItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m55840h0(View view) {
        d8q0.m110337a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m55841i0(AccountRecord accountRecord, boolean z) {
        this.f36502d.setText(mqi0.f135253e.format(Double.valueOf(accountRecord.createdTime)));
        this.f36503e.setText(String.format("¥%s", accountRecord.amount));
        xdl0.m208344M(this.f36504f, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55840h0(this);
    }

    public WithdrawRecordsItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WithdrawRecordsItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
