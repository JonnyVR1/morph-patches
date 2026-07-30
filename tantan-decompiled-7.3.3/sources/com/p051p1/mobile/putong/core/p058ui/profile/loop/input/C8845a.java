package com.p051p1.mobile.putong.core.p058ui.profile.loop.input;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.a */
/* JADX INFO: loaded from: classes4.dex */
public class C8845a extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public a f34399a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo52892a();
    }

    public C8845a(InputConnection inputConnection, boolean z) {
        super(inputConnection, z);
    }

    /* JADX INFO: renamed from: a */
    public void m52891a(a aVar) {
        this.f34399a = aVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        a aVar = this.f34399a;
        if (aVar == null || !aVar.mo52892a()) {
            return super.deleteSurroundingText(i, i2);
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        a aVar;
        if (keyEvent.getKeyCode() == 67 && keyEvent.getAction() == 0 && (aVar = this.f34399a) != null && aVar.mo52892a()) {
            return true;
        }
        return super.sendKeyEvent(keyEvent);
    }
}
