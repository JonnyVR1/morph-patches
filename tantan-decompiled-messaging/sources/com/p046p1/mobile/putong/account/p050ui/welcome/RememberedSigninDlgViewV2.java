package com.p046p1.mobile.putong.account.p050ui.welcome;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p147v.VButton;
import p147v.VCheckBox;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.zoc0;

/* JADX INFO: loaded from: classes9.dex */
public class RememberedSigninDlgViewV2 extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f17039c;

    /* JADX INFO: renamed from: d */
    public VText f17040d;

    /* JADX INFO: renamed from: e */
    public VButton f17041e;

    /* JADX INFO: renamed from: f */
    public VButton f17042f;

    /* JADX INFO: renamed from: g */
    public VLinear f17043g;

    /* JADX INFO: renamed from: h */
    public VCheckBox f17044h;

    /* JADX INFO: renamed from: i */
    public VText f17045i;

    public RememberedSigninDlgViewV2(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m29195P(View view) {
        zoc0.m219558a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m29195P(this);
    }

    public RememberedSigninDlgViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RememberedSigninDlgViewV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
