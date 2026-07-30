package com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt;

import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.c */
/* JADX INFO: loaded from: classes9.dex */
public class C4643c extends BaseInputConnection {

    /* JADX INFO: renamed from: a */
    public a f16613a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.c$a */
    public interface a {
        boolean commitText(CharSequence charSequence, int i);
    }

    public C4643c(View view, boolean z) {
        super(view, z);
    }

    /* JADX INFO: renamed from: a */
    public void m28690a(a aVar) {
        this.f16613a = aVar;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i) {
        if (NullChecker.m81303a(this.f16613a)) {
            return this.f16613a.commitText(charSequence, i);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        return sendKeyEvent(new KeyEvent(0, 67)) || super.deleteSurroundingText(i, i2);
    }
}
