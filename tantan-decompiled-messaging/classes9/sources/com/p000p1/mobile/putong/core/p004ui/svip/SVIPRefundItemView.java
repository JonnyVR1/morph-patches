package com.p000p1.mobile.putong.core.p004ui.svip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.core.data.AccountRecord;
import l.mqi0;
import l.qmd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SVIPRefundItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public TextView f6277d;

    /* JADX INFO: renamed from: e */
    public TextView f6278e;

    /* JADX INFO: renamed from: f */
    public TextView f6279f;

    /* JADX INFO: renamed from: g */
    public TextView f6280g;

    public SVIPRefundItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m9231h0(View view) {
        qmd0.a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m9232i0(AccountRecord accountRecord) {
        this.f6279f.setText(accountRecord.content);
        this.f6280g.setText(mqi0.d.format(Double.valueOf(accountRecord.createdTime)));
        this.f6277d.setText(String.format("¥%s", accountRecord.amount));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m9231h0(this);
    }

    public SVIPRefundItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SVIPRefundItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
