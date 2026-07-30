package com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt;

import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.c */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0069c extends BaseInputConnection {

    /* JADX INFO: renamed from: a */
    public a f602a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.c$a */
    public interface a {
        boolean commitText(CharSequence charSequence, int i);
    }

    public C0069c(View view, boolean z) {
        super(view, z);
    }

    /* JADX INFO: renamed from: a */
    public void m589a(a aVar) {
        this.f602a = aVar;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i) {
        if (NullChecker.a(this.f602a)) {
            return this.f602a.commitText(charSequence, i);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        return sendKeyEvent(new KeyEvent(0, 67)) || super.deleteSurroundingText(i, i2);
    }
}
