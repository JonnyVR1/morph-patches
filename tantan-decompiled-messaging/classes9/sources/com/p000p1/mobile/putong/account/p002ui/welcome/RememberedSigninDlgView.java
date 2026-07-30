package com.p000p1.mobile.putong.account.p002ui.welcome;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p006l.apc0;
import v.VButton;
import v.VCheckBox;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class RememberedSigninDlgView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f1021c;

    /* JADX INFO: renamed from: d */
    public VText f1022d;

    /* JADX INFO: renamed from: e */
    public VButton f1023e;

    /* JADX INFO: renamed from: f */
    public VButton f1024f;

    /* JADX INFO: renamed from: g */
    public VLinear f1025g;

    /* JADX INFO: renamed from: h */
    public VCheckBox f1026h;

    /* JADX INFO: renamed from: i */
    public VText f1027i;

    public RememberedSigninDlgView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m1100P(View view) {
        apc0.m12181a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m1100P(this);
    }

    public RememberedSigninDlgView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RememberedSigninDlgView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
