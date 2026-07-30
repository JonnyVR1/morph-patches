package com.p000p1.mobile.putong.core.p004ui.verification;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.utils.NullChecker;
import l.j760;
import l.vwb;
import p006l.dq4;
import p006l.iq4;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CertificationCenterFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public iq4 f6422A;

    /* JADX INFO: renamed from: z */
    public dq4 f6423z;

    /* JADX INFO: renamed from: M4 */
    public static CertificationCenterFrag m9403M4(String str) {
        CertificationCenterFrag certificationCenterFrag = new CertificationCenterFrag();
        Bundle bundle = new Bundle();
        bundle.putString("from", str);
        certificationCenterFrag.setArguments(bundle);
        return certificationCenterFrag;
    }

    /* JADX INFO: renamed from: N4 */
    public void m9404N4(String str) {
        this.f6423z.m14186n0(str);
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: d4 */
    public void mo1548d4() {
        super.mo1548d4();
        this.f6423z = new dq4(this);
        iq4 iq4Var = new iq4(this);
        this.f6422A = iq4Var;
        this.f6423z.C(iq4Var);
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: f4 */
    public void mo1549f4() {
        super.mo1549f4();
        this.f6423z.m14181a0();
    }

    /* JADX INFO: renamed from: g4 */
    public void m9405g4(Bundle bundle) {
        super.g4(bundle);
        this.f6422A.m16814r();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f6422A.inflateView(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n4 */
    public void m9406n4(Bundle bundle) {
        super.n4(bundle);
        this.pageHelper.q(pageId());
        Bundle arguments = getArguments();
        String string = NullChecker.a(arguments) ? arguments.getString("from") : null;
        if (TextUtils.isEmpty(string)) {
            string = "other";
        }
        this.pageHelper.p(new j760[]{vwb.Y("verification_source", string)});
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    public String pageId() {
        return "p_verification";
    }
}
