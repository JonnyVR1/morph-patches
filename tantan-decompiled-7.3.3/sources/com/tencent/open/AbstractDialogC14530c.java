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
public abstract class AbstractDialogC14530c extends Dialog {

    /* JADX INFO: renamed from: a */
    protected C14521b f61079a;

    /* JADX INFO: renamed from: b */
    @SuppressLint({"NewApi"})
    protected final WebChromeClient f61080b;

    public AbstractDialogC14530c(Context context, int i) {
        super(context, i);
        this.f61080b = new WebChromeClient() { // from class: com.tencent.open.c.1
            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                if (consoleMessage == null) {
                    return false;
                }
                SLog.m85492i("openSDK_LOG.JsDialog", "WebChromeClient onConsoleMessage" + consoleMessage.message() + " -- From  111 line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
                AbstractDialogC14530c.this.mo85389a(consoleMessage.message());
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public void onConsoleMessage(String str, int i2, String str2) {
                SLog.m85492i("openSDK_LOG.JsDialog", "WebChromeClient onConsoleMessage" + str + " -- From 222 line " + i2 + " of " + str2);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo85389a(String str);

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f61079a = new C14521b();
    }
}
