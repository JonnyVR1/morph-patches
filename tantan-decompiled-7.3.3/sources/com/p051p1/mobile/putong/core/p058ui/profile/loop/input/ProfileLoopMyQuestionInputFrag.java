package com.p051p1.mobile.putong.core.p058ui.profile.loop.input;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.data.User;
import p153l.lra0;
import p153l.tra0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopMyQuestionInputFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public lra0 f34367I;

    /* JADX INFO: renamed from: J */
    public tra0 f34368J;

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag, p153l.bqa0
    /* JADX INFO: renamed from: H */
    public void mo52769H() {
        super.mo52769H();
        this.f34368J.m192464z();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: M4 */
    public void mo52770M4() {
        this.f34368J.m192452k();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo52773P4(User user) {
        this.f34368J.m192455n(user);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag, p153l.bqa0
    /* JADX INFO: renamed from: X */
    public boolean mo52781X() {
        return this.f34368J.m192454m();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f34367I = new lra0(this);
        tra0 tra0Var = new tra0(this);
        this.f34368J = tra0Var;
        this.f34367I.mo52715C(tra0Var);
        this.f34367I.mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f34367I.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f34368J.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag, p153l.bqa0
    public boolean isLast() {
        if (act() instanceof ProfileInfoLoopEditAct) {
            return super.isLast();
        }
        return true;
    }
}
