package com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act;

import android.os.Bundle;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import p006l.njm;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class WebViewActOpt extends WebViewAct {
    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        alwaysHideInput();
        njm.m20154b(this);
    }

    public boolean shouldShowGradientActionBar() {
        return false;
    }

    public boolean shouldShowGradientStatusBar() {
        return false;
    }
}
