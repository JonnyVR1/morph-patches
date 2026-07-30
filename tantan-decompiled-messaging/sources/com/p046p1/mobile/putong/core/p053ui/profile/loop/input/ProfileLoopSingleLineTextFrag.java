package com.p046p1.mobile.putong.core.p053ui.profile.loop.input;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.data.User;
import p149l.kma0;
import p149l.oma0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopSingleLineTextFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public kma0 f33530I;

    /* JADX INFO: renamed from: J */
    public oma0 f33531J;

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo51590P4(User user) {
        this.f33531J.m165019i(user);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f33530I = new kma0(this);
        oma0 oma0Var = new oma0(act(), this);
        this.f33531J = oma0Var;
        this.f33530I.mo51532C(oma0Var);
        this.f33530I.mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f33530I.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f33531J.inflateView(layoutInflater, viewGroup);
    }
}
