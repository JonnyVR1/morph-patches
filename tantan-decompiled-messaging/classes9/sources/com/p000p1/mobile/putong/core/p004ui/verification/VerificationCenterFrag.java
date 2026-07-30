package com.p000p1.mobile.putong.core.p004ui.verification;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.app.PutongFrag;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VerificationCenterFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public C0358a f6426A;

    /* JADX INFO: renamed from: z */
    public VerificationCenterPresenter f6427z;

    /* JADX INFO: renamed from: M4 */
    public void m9416M4(String str) {
        this.f6427z.m9433s0(str);
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: d4 */
    public void mo1548d4() {
        super.mo1548d4();
        this.f6427z = new VerificationCenterPresenter(this);
        C0358a c0358a = new C0358a(this);
        this.f6426A = c0358a;
        this.f6427z.C(c0358a);
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: f4 */
    public void mo1549f4() {
        super.mo1549f4();
        this.f6427z.m9430a0();
    }

    /* JADX INFO: renamed from: g4 */
    public void m9417g4(Bundle bundle) {
        super.g4(bundle);
        this.f6426A.m9486r();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f6426A.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    public String pageId() {
        return "p_verification_center_view";
    }
}
