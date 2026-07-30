package com.p046p1.mobile.putong.core.p053ui.webview;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkDlgWebViewAct;
import p149l.a500;
import p149l.c30;
import p149l.e3l;
import p149l.v930;

/* JADX INFO: loaded from: classes9.dex */
public class HolidayMaskMkWebAct extends MkDlgWebViewAct {

    /* JADX INFO: renamed from: e */
    public e3l f38249e;

    @Override // com.p046p1.mobile.putong.p065ui.webview.p068mk.MkDlgWebViewAct
    /* JADX INFO: renamed from: a2 */
    public a500 mo58139a2() {
        if (this.f38249e == null) {
            this.f38249e = new e3l(this);
        }
        return this.f38249e;
    }

    /* JADX INFO: renamed from: b2 */
    public void m58140b2() {
        this.f38249e.m114606c0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        super.onDestroyLifecycle();
        this.f38249e.m114605b0();
    }

    @Override // com.p046p1.mobile.putong.p065ui.webview.p068mk.MkDlgWebViewAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        if (CoreModule.m29932K().isMainPage(c30.m104962d()) && v930.m197534h() == TabName.Card) {
            super.preCreateView(bundle);
        } else {
            m66873d2();
        }
    }
}
