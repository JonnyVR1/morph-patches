package com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes9.dex */
public class AutofitTextView extends EditTextOpt implements C4640a.c {
    public AutofitTextView(Context context) {
        super(context);
        m28595b(context, null, 0);
    }

    /* JADX INFO: renamed from: b */
    private void m28595b(Context context, AttributeSet attributeSet, int i) {
        C4640a.m28652f(this, attributeSet, i).m28654c(this);
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.C4640a.c
    /* JADX INFO: renamed from: a */
    public void mo28596a(float f, float f2) {
    }

    public AutofitTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m28595b(context, attributeSet, 0);
    }

    public AutofitTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m28595b(context, attributeSet, i);
    }
}
