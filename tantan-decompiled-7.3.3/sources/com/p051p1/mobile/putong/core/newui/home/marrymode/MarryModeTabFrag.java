package com.p051p1.mobile.putong.core.newui.home.marrymode;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.main.NewMainContextFrag;
import p153l.f4x;
import p153l.psd0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class MarryModeTabFrag extends NewMainContextFrag {

    /* JADX INFO: renamed from: B */
    public f4x f24013B;

    /* JADX INFO: renamed from: C */
    public C8181a f24014C;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W4 */
    public /* synthetic */ void m39771W4(Boolean bool) {
        if (bool.booleanValue()) {
            mo30636J4().m152777l();
        } else {
            mo30636J4().m152776k();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        CoreModule.f18264c.f20381e0.f89290n4.put(Boolean.TRUE);
        this.f24013B = new f4x(this);
        C8181a c8181a = new C8181a(act(), this);
        this.f24014C = c8181a;
        c8181a.mo22064i1(this.f24013B);
        this.f24013B.mo52715C(this.f24014C);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f24013B.mo40473a0();
        m30638L4().subscribe(psd0.m173596G(new y20() { // from class: l.v3x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182307a.m39771W4((Boolean) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f24014C.m39788r();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f24014C.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        super.mo21593n4(bundle);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f24014C.m39785n();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStop() {
        this.f24014C.m39786p();
        super.onStop();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_marriage_home";
    }
}
