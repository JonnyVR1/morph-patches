package com.p051p1.mobile.putong.account.p055ui.welcome;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p151v.VButton;
import p151v.VCheckBox;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.fxc0;

/* JADX INFO: loaded from: classes9.dex */
public class RememberedSigninDlgView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f17751c;

    /* JADX INFO: renamed from: d */
    public VText f17752d;

    /* JADX INFO: renamed from: e */
    public VButton f17753e;

    /* JADX INFO: renamed from: f */
    public VButton f17754f;

    /* JADX INFO: renamed from: g */
    public VLinear f17755g;

    /* JADX INFO: renamed from: h */
    public VCheckBox f17756h;

    /* JADX INFO: renamed from: i */
    public VText f17757i;

    public RememberedSigninDlgView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m30192P(View view) {
        fxc0.m127972a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m30192P(this);
    }

    public RememberedSigninDlgView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RememberedSigninDlgView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
