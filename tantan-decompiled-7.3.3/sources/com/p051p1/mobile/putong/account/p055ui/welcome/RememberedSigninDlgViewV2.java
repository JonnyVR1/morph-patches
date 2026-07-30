package com.p051p1.mobile.putong.account.p055ui.welcome;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p151v.VButton;
import p151v.VCheckBox;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.exc0;

/* JADX INFO: loaded from: classes9.dex */
public class RememberedSigninDlgViewV2 extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f17758c;

    /* JADX INFO: renamed from: d */
    public VText f17759d;

    /* JADX INFO: renamed from: e */
    public VButton f17760e;

    /* JADX INFO: renamed from: f */
    public VButton f17761f;

    /* JADX INFO: renamed from: g */
    public VLinear f17762g;

    /* JADX INFO: renamed from: h */
    public VCheckBox f17763h;

    /* JADX INFO: renamed from: i */
    public VText f17764i;

    public RememberedSigninDlgViewV2(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m30193P(View view) {
        exc0.m123048a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m30193P(this);
    }

    public RememberedSigninDlgViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RememberedSigninDlgViewV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
