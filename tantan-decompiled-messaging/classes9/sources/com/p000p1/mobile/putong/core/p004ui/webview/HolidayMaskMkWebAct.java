package com.p000p1.mobile.putong.core.p004ui.webview;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.putong.ui.webview.mk.MkDlgWebViewAct;
import l.a500;
import l.c30;
import l.v930;
import p006l.e3l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class HolidayMaskMkWebAct extends MkDlgWebViewAct {

    /* JADX INFO: renamed from: e */
    public e3l f8030e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a2 */
    public a500 m11672a2() {
        if (this.f8030e == null) {
            this.f8030e = new e3l(this);
        }
        return this.f8030e;
    }

    /* JADX INFO: renamed from: b2 */
    public void m11673b2() {
        this.f8030e.m14391c0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyLifecycle() {
        super/*com.p1.mobile.putong.app.PutongAct*/.onDestroyLifecycle();
        this.f8030e.m14390b0();
    }

    public void preCreateView(Bundle bundle) {
        if (CoreModule.m1851K().isMainPage(c30.d()) && v930.h() == TabName.Card) {
            super.preCreateView(bundle);
        } else {
            finish();
        }
    }
}
