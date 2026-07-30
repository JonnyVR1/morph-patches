package com.tencent.open.web.security;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.tencent.open.log.SLog;

/* JADX INFO: renamed from: com.tencent.open.web.security.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14400a extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public static String f60363a = null;

    /* JADX INFO: renamed from: b */
    public static boolean f60364b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f60365c = false;

    public C14400a(InputConnection inputConnection, boolean z) {
        super(inputConnection, z);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i) {
        f60365c = true;
        f60363a = charSequence.toString();
        SLog.m84313v("openSDK_LOG.CaptureInputConnection", "-->commitText: " + charSequence.toString());
        return super.commitText(charSequence, i);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            SLog.m84309i("openSDK_LOG.CaptureInputConnection", "sendKeyEvent");
            f60363a = String.valueOf((char) keyEvent.getUnicodeChar());
            f60365c = true;
            SLog.m84305d("openSDK_LOG.CaptureInputConnection", "s: " + f60363a);
        }
        SLog.m84305d("openSDK_LOG.CaptureInputConnection", "-->sendKeyEvent: " + f60363a);
        return super.sendKeyEvent(keyEvent);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i) {
        f60365c = true;
        f60363a = charSequence.toString();
        SLog.m84313v("openSDK_LOG.CaptureInputConnection", "-->setComposingText: " + charSequence.toString());
        return super.setComposingText(charSequence, i);
    }
}
