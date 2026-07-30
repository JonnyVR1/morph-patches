package com.p046p1.mobile.putong.core.p053ui.profile.loop.profession;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.data.User;
import p149l.pla0;
import p149l.vla0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopSelectProfessionFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public pla0 f33571I;

    /* JADX INFO: renamed from: J */
    public vla0 f33572J;

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag, p149l.xha0
    /* JADX INFO: renamed from: H */
    public void mo51586H() {
        if (this.f33572J.m198787v()) {
            this.f33572J.m198785s();
        } else {
            super.mo51586H();
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo51590P4(User user) {
        this.f33572J.m198788w(user);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f33571I = new pla0(this);
        vla0 vla0Var = new vla0(act(), this);
        this.f33572J = vla0Var;
        this.f33571I.mo51532C(vla0Var);
        this.f33571I.mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f33571I.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f33572J.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f33572J.m198781H(getArguments().getBoolean("not_to_disclose_mode"));
        }
    }
}
