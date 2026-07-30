package com.p051p1.mobile.putong.core.p058ui.account;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import p151v.VCheckBox;
import p151v.VText;
import p153l.C19416pq;

/* JADX INFO: loaded from: classes9.dex */
public class AccountInactiveDetailItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VCheckBox f29053a;

    /* JADX INFO: renamed from: b */
    public VText f29054b;

    public AccountInactiveDetailItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m45292a(View view) {
        C19416pq.m173270a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45292a(this);
    }

    public AccountInactiveDetailItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AccountInactiveDetailItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AccountInactiveDetailItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
