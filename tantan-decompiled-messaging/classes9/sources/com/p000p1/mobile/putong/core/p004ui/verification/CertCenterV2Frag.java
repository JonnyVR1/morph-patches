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
import p006l.ep4;
import p006l.so4;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CertCenterV2Frag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public ep4 f6415A;

    /* JADX INFO: renamed from: z */
    public so4 f6416z;

    /* JADX INFO: renamed from: M4 */
    public void m9395M4(String str) {
        this.f6416z.m23949x0(str);
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: d4 */
    public void mo1548d4() {
        super.mo1548d4();
        this.f6416z = new so4(this);
        ep4 ep4Var = new ep4(this);
        this.f6415A = ep4Var;
        this.f6416z.C(ep4Var);
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: f4 */
    public void mo1549f4() {
        super.mo1549f4();
        this.f6416z.m23940a0();
    }

    /* JADX INFO: renamed from: g4 */
    public void m9396g4(Bundle bundle) {
        super.g4(bundle);
        this.f6415A.m14794r();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f6415A.inflateView(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n4 */
    public void m9397n4(Bundle bundle) {
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
