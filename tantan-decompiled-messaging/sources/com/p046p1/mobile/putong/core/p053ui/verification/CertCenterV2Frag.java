package com.p046p1.mobile.putong.core.p053ui.verification;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.utils.NullChecker;
import p149l.ep4;
import p149l.so4;
import p149l.vwb;

/* JADX INFO: loaded from: classes9.dex */
public class CertCenterV2Frag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public ep4 f36634A;

    /* JADX INFO: renamed from: z */
    public so4 f36635z;

    /* JADX INFO: renamed from: M4 */
    public void m55979M4(String str) {
        this.f36635z.m185232x0(str);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f36635z = new so4(this);
        ep4 ep4Var = new ep4(this);
        this.f36634A = ep4Var;
        this.f36635z.mo51532C(ep4Var);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f36635z.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f36634A.m117591r();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f36634A.inflateView(layoutInflater, viewGroup);
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
