package com.p003p1.mobile.putong.core.p006ui.account;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import l.uq;
import v.VCheckBox;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class AccountInactiveDetailItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VCheckBox f1776a;

    /* JADX INFO: renamed from: b */
    public VText f1777b;

    public AccountInactiveDetailItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m8451a(View view) {
        uq.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8451a(this);
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
