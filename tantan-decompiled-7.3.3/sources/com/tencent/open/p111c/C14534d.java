package com.tencent.open.p111c;

import android.content.Context;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.tencent.open.log.SLog;
import com.tencent.open.web.security.C14563a;
import com.tencent.open.web.security.SecureJsInterface;

/* JADX INFO: renamed from: com.tencent.open.c.d */
/* JADX INFO: loaded from: classes2.dex */
public class C14534d extends C14532b {

    /* JADX INFO: renamed from: a */
    public static boolean f61086a;

    /* JADX INFO: renamed from: b */
    private KeyEvent f61087b;

    /* JADX INFO: renamed from: c */
    private C14563a f61088c;

    public C14534d(Context context) {
        super(context);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int unicodeChar;
        SLog.m85488d("openSDK_LOG.SecureWebView", "-->dispatchKeyEvent, is device support: " + f61086a);
        if (!f61086a) {
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
            C14563a.f61212b = true;
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getUnicodeChar() == 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!SecureJsInterface.isPWDEdit || (((unicodeChar = keyEvent.getUnicodeChar()) < 33 || unicodeChar > 95) && (unicodeChar < 97 || unicodeChar > 125))) {
            return super.dispatchKeyEvent(keyEvent);
        }
        KeyEvent keyEvent2 = new KeyEvent(0, 17);
        this.f61087b = keyEvent2;
        return super.dispatchKeyEvent(keyEvent2);
    }

    @Override // android.webkit.WebView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        SLog.m85492i("openSDK_LOG.SecureWebView", "-->create input connection, is edit: " + SecureJsInterface.isPWDEdit);
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        SLog.m85496v("openSDK_LOG.SecureWebView", "-->onCreateInputConnection, inputConn is " + inputConnectionOnCreateInputConnection);
        if (inputConnectionOnCreateInputConnection == null) {
            f61086a = false;
            return inputConnectionOnCreateInputConnection;
        }
        f61086a = true;
        C14563a c14563a = new C14563a(super.onCreateInputConnection(editorInfo), false);
        this.f61088c = c14563a;
        return c14563a;
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        int unicodeChar;
        SLog.m85488d("openSDK_LOG.SecureWebView", "-->onKeyDown, is device support: " + f61086a);
        if (!f61086a) {
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
            C14563a.f61212b = true;
            return super.onKeyDown(i, keyEvent);
        }
        if (keyEvent.getUnicodeChar() == 0) {
            return super.onKeyDown(i, keyEvent);
        }
        if (!SecureJsInterface.isPWDEdit || (((unicodeChar = keyEvent.getUnicodeChar()) < 33 || unicodeChar > 95) && (unicodeChar < 97 || unicodeChar > 125))) {
            return super.onKeyDown(i, keyEvent);
        }
        KeyEvent keyEvent2 = new KeyEvent(0, 17);
        this.f61087b = keyEvent2;
        return super.onKeyDown(keyEvent2.getKeyCode(), this.f61087b);
    }
}
