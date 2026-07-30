package com.p000p1.mobile.putong.account.p002ui.welcome;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p006l.zoc0;
import v.VButton;
import v.VCheckBox;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class RememberedSigninDlgViewV2 extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f1028c;

    /* JADX INFO: renamed from: d */
    public VText f1029d;

    /* JADX INFO: renamed from: e */
    public VButton f1030e;

    /* JADX INFO: renamed from: f */
    public VButton f1031f;

    /* JADX INFO: renamed from: g */
    public VLinear f1032g;

    /* JADX INFO: renamed from: h */
    public VCheckBox f1033h;

    /* JADX INFO: renamed from: i */
    public VText f1034i;

    public RememberedSigninDlgViewV2(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m1101P(View view) {
        zoc0.m28754a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m1101P(this);
    }

    public RememberedSigninDlgViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RememberedSigninDlgViewV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
