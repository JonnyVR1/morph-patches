package com.p046p1.mobile.putong.core.p053ui.profile.loop.input;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.ProfileInfoLoopEditAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.data.User;
import p149l.hja0;
import p149l.pja0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopMyQuestionInputFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public hja0 f33519I;

    /* JADX INFO: renamed from: J */
    public pja0 f33520J;

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag, p149l.xha0
    /* JADX INFO: renamed from: H */
    public void mo51586H() {
        super.mo51586H();
        this.f33520J.m169839z();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: M4 */
    public void mo51587M4() {
        this.f33520J.m169827k();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo51590P4(User user) {
        this.f33520J.m169830n(user);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag, p149l.xha0
    /* JADX INFO: renamed from: X */
    public boolean mo51598X() {
        return this.f33520J.m169829m();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f33519I = new hja0(this);
        pja0 pja0Var = new pja0(this);
        this.f33520J = pja0Var;
        this.f33519I.mo51532C(pja0Var);
        this.f33519I.mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f33519I.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f33520J.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag, p149l.xha0
    public boolean isLast() {
        if (act() instanceof ProfileInfoLoopEditAct) {
            return super.isLast();
        }
        return true;
    }
}
