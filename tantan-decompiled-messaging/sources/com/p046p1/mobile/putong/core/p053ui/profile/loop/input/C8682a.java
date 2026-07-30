package com.p046p1.mobile.putong.core.p053ui.profile.loop.input;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.a */
/* JADX INFO: loaded from: classes4.dex */
public class C8682a extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public a f33551a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo51709a();
    }

    public C8682a(InputConnection inputConnection, boolean z) {
        super(inputConnection, z);
    }

    /* JADX INFO: renamed from: a */
    public void m51708a(a aVar) {
        this.f33551a = aVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        a aVar = this.f33551a;
        if (aVar == null || !aVar.mo51709a()) {
            return super.deleteSurroundingText(i, i2);
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        a aVar;
        if (keyEvent.getKeyCode() == 67 && keyEvent.getAction() == 0 && (aVar = this.f33551a) != null && aVar.mo51709a()) {
            return true;
        }
        return super.sendKeyEvent(keyEvent);
    }
}
