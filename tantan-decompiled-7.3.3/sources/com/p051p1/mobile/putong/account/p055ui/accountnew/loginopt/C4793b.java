package com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.b */
/* JADX INFO: loaded from: classes9.dex */
public class C4793b extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public a f17331a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo29688a();
    }

    public C4793b(InputConnection inputConnection, boolean z) {
        super(inputConnection, z);
    }

    /* JADX INFO: renamed from: a */
    public void m29687a(a aVar) {
        this.f17331a = aVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        a aVar = this.f17331a;
        if (aVar == null || !aVar.mo29688a()) {
            return super.deleteSurroundingText(i, i2);
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        a aVar;
        if (keyEvent.getKeyCode() == 67 && keyEvent.getAction() == 0 && (aVar = this.f17331a) != null && aVar.mo29688a()) {
            return true;
        }
        return super.sendKeyEvent(keyEvent);
    }
}
