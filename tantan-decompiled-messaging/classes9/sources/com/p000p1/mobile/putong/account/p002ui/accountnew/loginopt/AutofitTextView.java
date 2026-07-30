package com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AutofitTextView extends EditTextOpt implements C0066a.c {
    public AutofitTextView(Context context) {
        super(context);
        m492b(context, null, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    private void m492b(Context context, AttributeSet attributeSet, int i) {
        C0066a.m551f(this, attributeSet, i).m553c(this);
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.C0066a.c
    /* JADX INFO: renamed from: a */
    public void mo493a(float f, float f2) {
    }

    public AutofitTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m492b(context, attributeSet, 0);
    }

    public AutofitTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m492b(context, attributeSet, i);
    }
}
