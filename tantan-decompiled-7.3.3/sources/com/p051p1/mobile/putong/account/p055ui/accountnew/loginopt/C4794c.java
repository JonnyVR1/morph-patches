package com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt;

import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.c */
/* JADX INFO: loaded from: classes9.dex */
public class C4794c extends BaseInputConnection {

    /* JADX INFO: renamed from: a */
    public a f17332a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.c$a */
    public interface a {
        boolean commitText(CharSequence charSequence, int i);
    }

    public C4794c(View view, boolean z) {
        super(view, z);
    }

    /* JADX INFO: renamed from: a */
    public void m29689a(a aVar) {
        this.f17332a = aVar;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i) {
        if (NullChecker.m82486a(this.f17332a)) {
            return this.f17332a.commitText(charSequence, i);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        return sendKeyEvent(new KeyEvent(0, 67)) || super.deleteSurroundingText(i, i2);
    }
}
