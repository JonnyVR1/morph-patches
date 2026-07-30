package com.p046p1.mobile.putong.core.p053ui.profile.loop.ethnicitylanguage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.data.User;
import p149l.pha0;
import p149l.qha0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopEthnicityLanguageFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public pha0 f33456I;

    /* JADX INFO: renamed from: J */
    public qha0 f33457J;

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo51590P4(User user) {
        this.f33456I.m168935g0(user);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag, p149l.xha0
    /* JADX INFO: renamed from: X */
    public boolean mo51598X() {
        return this.f33457J.m174519e();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f33456I = new pha0(this);
        qha0 qha0Var = new qha0(this);
        this.f33457J = qha0Var;
        this.f33456I.mo51532C(qha0Var);
        this.f33456I.mo39469Z();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f33457J.inflateView(layoutInflater, viewGroup);
    }
}
