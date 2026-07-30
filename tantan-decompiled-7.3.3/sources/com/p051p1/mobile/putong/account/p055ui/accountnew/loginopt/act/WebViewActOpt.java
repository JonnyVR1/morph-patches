package com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act;

import android.os.Bundle;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import p153l.plm;

/* JADX INFO: loaded from: classes9.dex */
public class WebViewActOpt extends WebViewAct {
    @Override // com.p051p1.mobile.putong.p070ui.webview.WebViewAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        alwaysHideInput();
        plm.m172839b(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientActionBar() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }
}
