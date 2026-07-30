package com.p046p1.mobile.putong.core.p053ui.verification;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.utils.NullChecker;
import p149l.dq4;
import p149l.iq4;
import p149l.vwb;

/* JADX INFO: loaded from: classes9.dex */
public class CertificationCenterFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public iq4 f36641A;

    /* JADX INFO: renamed from: z */
    public dq4 f36642z;

    /* JADX INFO: renamed from: M4 */
    public static CertificationCenterFrag m55985M4(String str) {
        CertificationCenterFrag certificationCenterFrag = new CertificationCenterFrag();
        Bundle bundle = new Bundle();
        bundle.putString("from", str);
        certificationCenterFrag.setArguments(bundle);
        return certificationCenterFrag;
    }

    /* JADX INFO: renamed from: N4 */
    public void m55986N4(String str) {
        this.f36642z.m112992n0(str);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f36642z = new dq4(this);
        iq4 iq4Var = new iq4(this);
        this.f36641A = iq4Var;
        this.f36642z.mo51532C(iq4Var);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f36642z.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f36641A.m137624r();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f36641A.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        super.mo20594n4(bundle);
        this.pageHelper.m109041q(pageId());
        Bundle arguments = getArguments();
        String string = NullChecker.m81303a(arguments) ? arguments.getString("from") : null;
        if (TextUtils.isEmpty(string)) {
            string = "other";
        }
        this.pageHelper.m109040p(vwb.m200311Y("verification_source", string));
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_verification";
    }
}
