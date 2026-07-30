package com.tencent.open.web.security;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.tencent.open.log.SLog;

/* JADX INFO: renamed from: com.tencent.open.web.security.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14563a extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public static String f61211a = null;

    /* JADX INFO: renamed from: b */
    public static boolean f61212b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f61213c = false;

    public C14563a(InputConnection inputConnection, boolean z) {
        super(inputConnection, z);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i) {
        f61213c = true;
        f61211a = charSequence.toString();
        SLog.m85496v("openSDK_LOG.CaptureInputConnection", "-->commitText: " + charSequence.toString());
        return super.commitText(charSequence, i);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            SLog.m85492i("openSDK_LOG.CaptureInputConnection", "sendKeyEvent");
            f61211a = String.valueOf((char) keyEvent.getUnicodeChar());
            f61213c = true;
            SLog.m85488d("openSDK_LOG.CaptureInputConnection", "s: " + f61211a);
        }
        SLog.m85488d("openSDK_LOG.CaptureInputConnection", "-->sendKeyEvent: " + f61211a);
        return super.sendKeyEvent(keyEvent);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i) {
        f61213c = true;
        f61211a = charSequence.toString();
        SLog.m85496v("openSDK_LOG.CaptureInputConnection", "-->setComposingText: " + charSequence.toString());
        return super.setComposingText(charSequence, i);
    }
}
