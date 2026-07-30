package com.p046p1.mobile.putong.core.p053ui.account;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import p147v.VCheckBox;
import p147v.VText;
import p149l.C20482uq;

/* JADX INFO: loaded from: classes8.dex */
public class AccountInactiveDetailItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VCheckBox f28205a;

    /* JADX INFO: renamed from: b */
    public VText f28206b;

    public AccountInactiveDetailItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m44109a(View view) {
        C20482uq.m194949a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44109a(this);
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
