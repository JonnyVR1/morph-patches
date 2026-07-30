package com.p051p1.mobile.putong.core.p058ui.verification;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.utils.NullChecker;
import p153l.cr4;
import p153l.hr4;
import p153l.jyb;

/* JADX INFO: loaded from: classes12.dex */
public class CertificationCenterFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public hr4 f37489A;

    /* JADX INFO: renamed from: z */
    public cr4 f37490z;

    /* JADX INFO: renamed from: M4 */
    public static CertificationCenterFrag m57168M4(String str) {
        CertificationCenterFrag certificationCenterFrag = new CertificationCenterFrag();
        Bundle bundle = new Bundle();
        bundle.putString("from", str);
        certificationCenterFrag.setArguments(bundle);
        return certificationCenterFrag;
    }

    /* JADX INFO: renamed from: N4 */
    public void m57169N4(String str) {
        this.f37490z.m112040n0(str);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f37490z = new cr4(this);
        hr4 hr4Var = new hr4(this);
        this.f37489A = hr4Var;
        this.f37490z.mo52715C(hr4Var);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f37490z.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f37489A.m136757r();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f37489A.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        super.mo21593n4(bundle);
        this.pageHelper.m152782q(pageId());
        Bundle arguments = getArguments();
        String string = NullChecker.m82486a(arguments) ? arguments.getString("from") : null;
        if (TextUtils.isEmpty(string)) {
            string = "other";
        }
        this.pageHelper.m152781p(jyb.m147494Y("verification_source", string));
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_verification";
    }
}
