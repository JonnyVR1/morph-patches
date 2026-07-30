package com.tencent.open.p106c;

import android.content.Context;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.tencent.open.log.SLog;
import com.tencent.open.web.security.C14400a;
import com.tencent.open.web.security.SecureJsInterface;

/* JADX INFO: renamed from: com.tencent.open.c.d */
/* JADX INFO: loaded from: classes2.dex */
public class C14371d extends C14369b {

    /* JADX INFO: renamed from: a */
    public static boolean f60238a;

    /* JADX INFO: renamed from: b */
    private KeyEvent f60239b;

    /* JADX INFO: renamed from: c */
    private C14400a f60240c;

    public C14371d(Context context) {
        super(context);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int unicodeChar;
        SLog.m84305d("openSDK_LOG.SecureWebView", "-->dispatchKeyEvent, is device support: " + f60238a);
        if (!f60238a) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 4) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyCode == 66) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyCode == 67) {
            C14400a.f60364b = true;
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getUnicodeChar() == 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!SecureJsInterface.isPWDEdit || (((unicodeChar = keyEvent.getUnicodeChar()) < 33 || unicodeChar > 95) && (unicodeChar < 97 || unicodeChar > 125))) {
            return super.dispatchKeyEvent(keyEvent);
        }
        KeyEvent keyEvent2 = new KeyEvent(0, 17);
        this.f60239b = keyEvent2;
        return super.dispatchKeyEvent(keyEvent2);
    }

    @Override // android.webkit.WebView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        SLog.m84309i("openSDK_LOG.SecureWebView", "-->create input connection, is edit: " + SecureJsInterface.isPWDEdit);
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        SLog.m84313v("openSDK_LOG.SecureWebView", "-->onCreateInputConnection, inputConn is " + inputConnectionOnCreateInputConnection);
        if (inputConnectionOnCreateInputConnection == null) {
            f60238a = false;
            return inputConnectionOnCreateInputConnection;
        }
        f60238a = true;
        C14400a c14400a = new C14400a(super.onCreateInputConnection(editorInfo), false);
        this.f60240c = c14400a;
        return c14400a;
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        int unicodeChar;
        SLog.m84305d("openSDK_LOG.SecureWebView", "-->onKeyDown, is device support: " + f60238a);
        if (!f60238a) {
            return super.onKeyDown(i, keyEvent);
        }
        if (keyEvent.getAction() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (keyCode == 66) {
            return super.onKeyDown(i, keyEvent);
        }
        if (keyCode == 67) {
            C14400a.f60364b = true;
            return super.onKeyDown(i, keyEvent);
        }
        if (keyEvent.getUnicodeChar() == 0) {
            return super.onKeyDown(i, keyEvent);
        }
        if (!SecureJsInterface.isPWDEdit || (((unicodeChar = keyEvent.getUnicodeChar()) < 33 || unicodeChar > 95) && (unicodeChar < 97 || unicodeChar > 125))) {
            return super.onKeyDown(i, keyEvent);
        }
        KeyEvent keyEvent2 = new KeyEvent(0, 17);
        this.f60239b = keyEvent2;
        return super.onKeyDown(keyEvent2.getKeyCode(), this.f60239b);
    }
}
