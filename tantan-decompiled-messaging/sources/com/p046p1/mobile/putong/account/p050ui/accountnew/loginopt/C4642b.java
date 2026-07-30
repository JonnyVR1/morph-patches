package com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.b */
/* JADX INFO: loaded from: classes9.dex */
public class C4642b extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public a f16612a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo28689a();
    }

    public C4642b(InputConnection inputConnection, boolean z) {
        super(inputConnection, z);
    }

    /* JADX INFO: renamed from: a */
    public void m28688a(a aVar) {
        this.f16612a = aVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        a aVar = this.f16612a;
        if (aVar == null || !aVar.mo28689a()) {
            return super.deleteSurroundingText(i, i2);
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        a aVar;
        if (keyEvent.getKeyCode() == 67 && keyEvent.getAction() == 0 && (aVar = this.f16612a) != null && aVar.mo28689a()) {
            return true;
        }
        return super.sendKeyEvent(keyEvent);
    }
}
