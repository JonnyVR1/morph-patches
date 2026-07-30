package com.p046p1.mobile.putong.core.p053ui.account;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import p147v.VText;
import p149l.C20716vq;

/* JADX INFO: loaded from: classes8.dex */
public class AccountInactiveMainItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VText f28207a;

    /* JADX INFO: renamed from: b */
    public ImageView f28208b;

    public AccountInactiveMainItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m44110a(View view) {
        C20716vq.m199392a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44110a(this);
    }

    public AccountInactiveMainItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AccountInactiveMainItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AccountInactiveMainItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
