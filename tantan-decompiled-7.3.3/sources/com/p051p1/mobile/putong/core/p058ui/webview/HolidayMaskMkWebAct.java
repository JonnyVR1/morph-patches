package com.p051p1.mobile.putong.core.p058ui.webview;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkDlgWebViewAct;
import p153l.ji30;
import p153l.pd00;
import p153l.u5l;
import p153l.w20;

/* JADX INFO: loaded from: classes12.dex */
public class HolidayMaskMkWebAct extends MkDlgWebViewAct {

    /* JADX INFO: renamed from: e */
    public u5l f39097e;

    @Override // com.p051p1.mobile.putong.p070ui.webview.p073mk.MkDlgWebViewAct
    /* JADX INFO: renamed from: b2 */
    public pd00 mo59322b2() {
        if (this.f39097e == null) {
            this.f39097e = new u5l(this);
        }
        return this.f39097e;
    }

    /* JADX INFO: renamed from: c2 */
    public void m59323c2() {
        this.f39097e.m194611c0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        super.onDestroyLifecycle();
        this.f39097e.m194610b0();
    }

    @Override // com.p051p1.mobile.putong.p070ui.webview.p073mk.MkDlgWebViewAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        if (CoreModule.m30930K().isMainPage(w20.m204489d()) && ji30.m144964h() == TabName.Card) {
            super.preCreateView(bundle);
        } else {
            m68056e2();
        }
    }
}
