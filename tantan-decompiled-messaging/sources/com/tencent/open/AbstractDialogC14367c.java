package com.tencent.open;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import com.tencent.open.log.SLog;

/* JADX INFO: renamed from: com.tencent.open.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractDialogC14367c extends Dialog {

    /* JADX INFO: renamed from: a */
    protected C14358b f60231a;

    /* JADX INFO: renamed from: b */
    @SuppressLint({"NewApi"})
    protected final WebChromeClient f60232b;

    public AbstractDialogC14367c(Context context, int i) {
        super(context, i);
        this.f60232b = new WebChromeClient() { // from class: com.tencent.open.c.1
            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                if (consoleMessage == null) {
                    return false;
                }
                SLog.m84309i("openSDK_LOG.JsDialog", "WebChromeClient onConsoleMessage" + consoleMessage.message() + " -- From  111 line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
                AbstractDialogC14367c.this.mo84206a(consoleMessage.message());
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public void onConsoleMessage(String str, int i2, String str2) {
                SLog.m84309i("openSDK_LOG.JsDialog", "WebChromeClient onConsoleMessage" + str + " -- From 222 line " + i2 + " of " + str2);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo84206a(String str);

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f60231a = new C14358b();
    }
}
