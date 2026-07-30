package com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act;

import android.os.Bundle;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import p149l.njm;

/* JADX INFO: loaded from: classes9.dex */
public class WebViewActOpt extends WebViewAct {
    @Override // com.p046p1.mobile.putong.p065ui.webview.WebViewAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        alwaysHideInput();
        njm.m159746b(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientActionBar() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }
}
