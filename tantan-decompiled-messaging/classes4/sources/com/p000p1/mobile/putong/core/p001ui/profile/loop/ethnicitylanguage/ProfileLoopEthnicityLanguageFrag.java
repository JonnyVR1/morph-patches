package com.p000p1.mobile.putong.core.p001ui.profile.loop.ethnicitylanguage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p1.mobile.putong.data.User;
import l.pha0;
import p002l.qha0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileLoopEthnicityLanguageFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public pha0 f1278I;

    /* JADX INFO: renamed from: J */
    public qha0 f1279J;

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo2076P4(User user) {
        this.f1278I.g0(user);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag, p002l.xha0
    /* JADX INFO: renamed from: X */
    public boolean mo2084X() {
        return this.f1279J.m21279e();
    }

    /* JADX INFO: renamed from: d4 */
    public void m2096d4() {
        super.d4();
        this.f1278I = new pha0(this);
        qha0 qha0Var = new qha0(this);
        this.f1279J = qha0Var;
        this.f1278I.f0(qha0Var);
        this.f1278I.Z();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1279J.inflateView(layoutInflater, viewGroup);
    }
}
