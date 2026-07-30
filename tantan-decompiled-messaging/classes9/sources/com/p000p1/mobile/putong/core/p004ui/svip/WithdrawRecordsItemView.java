package com.p000p1.mobile.putong.core.p004ui.svip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.core.data.AccountRecord;
import l.d8q0;
import l.mqi0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class WithdrawRecordsItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public TextView f6283d;

    /* JADX INFO: renamed from: e */
    public TextView f6284e;

    /* JADX INFO: renamed from: f */
    public View f6285f;

    public WithdrawRecordsItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m9238h0(View view) {
        d8q0.a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m9239i0(AccountRecord accountRecord, boolean z) {
        this.f6283d.setText(mqi0.e.format(Double.valueOf(accountRecord.createdTime)));
        this.f6284e.setText(String.format("¥%s", accountRecord.amount));
        xdl0.M(this.f6285f, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m9238h0(this);
    }

    public WithdrawRecordsItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WithdrawRecordsItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
