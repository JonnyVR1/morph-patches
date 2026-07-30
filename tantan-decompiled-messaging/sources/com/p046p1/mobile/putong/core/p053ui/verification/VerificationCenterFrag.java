package com.p046p1.mobile.putong.core.p053ui.verification;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongFrag;

/* JADX INFO: loaded from: classes9.dex */
public class VerificationCenterFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public C8922a f36645A;

    /* JADX INFO: renamed from: z */
    public VerificationCenterPresenter f36646z;

    /* JADX INFO: renamed from: M4 */
    public void m55995M4(String str) {
        this.f36646z.m56010s0(str);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f36646z = new VerificationCenterPresenter(this);
        C8922a c8922a = new C8922a(this);
        this.f36645A = c8922a;
        this.f36646z.mo51532C(c8922a);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f36646z.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f36645A.m56061r();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f36645A.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_verification_center_view";
    }
}
