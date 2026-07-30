package com.p000p1.mobile.putong.core.p001ui.profile.loop.input;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0107a extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public a f1373a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo2231a();
    }

    public C0107a(InputConnection inputConnection, boolean z) {
        super(inputConnection, z);
    }

    /* JADX INFO: renamed from: a */
    public void m2230a(a aVar) {
        this.f1373a = aVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        a aVar = this.f1373a;
        if (aVar == null || !aVar.mo2231a()) {
            return super.deleteSurroundingText(i, i2);
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        a aVar;
        if (keyEvent.getKeyCode() == 67 && keyEvent.getAction() == 0 && (aVar = this.f1373a) != null && aVar.mo2231a()) {
            return true;
        }
        return super.sendKeyEvent(keyEvent);
    }
}
