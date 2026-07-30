package com.p046p1.mobile.putong.core.p053ui.profile.loop.input;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.data.User;
import p149l.cia0;
import p149l.eia0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopMBTTestFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public cia0 f33514I;

    /* JADX INFO: renamed from: J */
    public eia0 f33515J;

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo51590P4(User user) {
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f33514I = new cia0(this);
        eia0 eia0Var = new eia0(this);
        this.f33515J = eia0Var;
        this.f33514I.mo51532C(eia0Var);
        this.f33514I.mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f33514I.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f33515J.inflateView(layoutInflater, viewGroup);
    }
}
