package com.p051p1.mobile.putong.core.p058ui.svip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.data.AccountRecord;
import p153l.pzi0;
import p153l.sud0;

/* JADX INFO: loaded from: classes12.dex */
public class SVIPRefundItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public TextView f37344d;

    /* JADX INFO: renamed from: e */
    public TextView f37345e;

    /* JADX INFO: renamed from: f */
    public TextView f37346f;

    /* JADX INFO: renamed from: g */
    public TextView f37347g;

    public SVIPRefundItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m57016h0(View view) {
        sud0.m188023a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m57017i0(AccountRecord accountRecord) {
        this.f37346f.setText(accountRecord.content);
        this.f37347g.setText(pzi0.f154857d.format(Double.valueOf(accountRecord.createdTime)));
        this.f37344d.setText(String.format("¥%s", accountRecord.amount));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57016h0(this);
    }

    public SVIPRefundItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SVIPRefundItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
