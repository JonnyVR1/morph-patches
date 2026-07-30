package com.p051p1.mobile.putong.core.p058ui.verification;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongFrag;

/* JADX INFO: loaded from: classes12.dex */
public class VerificationCenterFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public C9085a f37493A;

    /* JADX INFO: renamed from: z */
    public VerificationCenterPresenter f37494z;

    /* JADX INFO: renamed from: M4 */
    public void m57178M4(String str) {
        this.f37494z.m57193s0(str);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f37494z = new VerificationCenterPresenter(this);
        C9085a c9085a = new C9085a(this);
        this.f37493A = c9085a;
        this.f37494z.mo52715C(c9085a);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f37494z.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f37493A.m57244r();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f37493A.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_verification_center_view";
    }
}
