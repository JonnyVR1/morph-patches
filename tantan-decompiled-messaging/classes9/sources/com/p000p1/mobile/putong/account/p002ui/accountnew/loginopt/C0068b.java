package com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0068b extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public a f601a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo588a();
    }

    public C0068b(InputConnection inputConnection, boolean z) {
        super(inputConnection, z);
    }

    /* JADX INFO: renamed from: a */
    public void m587a(a aVar) {
        this.f601a = aVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        a aVar = this.f601a;
        if (aVar == null || !aVar.mo588a()) {
            return super.deleteSurroundingText(i, i2);
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        a aVar;
        if (keyEvent.getKeyCode() == 67 && keyEvent.getAction() == 0 && (aVar = this.f601a) != null && aVar.mo588a()) {
            return true;
        }
        return super.sendKeyEvent(keyEvent);
    }
}
