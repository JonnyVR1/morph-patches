package com.p046p1.mobile.putong.account.p050ui.welcome;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p147v.VButton;
import p147v.VCheckBox;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.apc0;

/* JADX INFO: loaded from: classes9.dex */
public class RememberedSigninDlgView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f17032c;

    /* JADX INFO: renamed from: d */
    public VText f17033d;

    /* JADX INFO: renamed from: e */
    public VButton f17034e;

    /* JADX INFO: renamed from: f */
    public VButton f17035f;

    /* JADX INFO: renamed from: g */
    public VLinear f17036g;

    /* JADX INFO: renamed from: h */
    public VCheckBox f17037h;

    /* JADX INFO: renamed from: i */
    public VText f17038i;

    public RememberedSigninDlgView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m29194P(View view) {
        apc0.m98107a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m29194P(this);
    }

    public RememberedSigninDlgView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RememberedSigninDlgView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
