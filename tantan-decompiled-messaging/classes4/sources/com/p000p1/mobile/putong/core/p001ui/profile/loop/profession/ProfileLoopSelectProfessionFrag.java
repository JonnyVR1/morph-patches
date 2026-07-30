package com.p000p1.mobile.putong.core.p001ui.profile.loop.profession;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p1.mobile.putong.data.User;
import p002l.pla0;
import p002l.vla0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileLoopSelectProfessionFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public pla0 f1393I;

    /* JADX INFO: renamed from: J */
    public vla0 f1394J;

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag, p002l.xha0
    /* JADX INFO: renamed from: H */
    public void mo2072H() {
        if (this.f1394J.m24049v()) {
            this.f1394J.m24047s();
        } else {
            super.mo2072H();
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo2076P4(User user) {
        this.f1394J.m24050w(user);
    }

    /* JADX INFO: renamed from: d4 */
    public void m2255d4() {
        super.d4();
        this.f1393I = new pla0(this);
        vla0 vla0Var = new vla0(act(), this);
        this.f1394J = vla0Var;
        this.f1393I.C(vla0Var);
        this.f1393I.m20420Z();
    }

    /* JADX INFO: renamed from: f4 */
    public void m2256f4() {
        super.f4();
        this.f1393I.m20421a0();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1394J.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f1394J.m24042H(getArguments().getBoolean("not_to_disclose_mode"));
        }
    }
}
