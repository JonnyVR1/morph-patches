package com.p051p1.mobile.putong.core.p058ui.profile.loop.ethnicitylanguage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.data.User;
import p153l.tpa0;
import p153l.upa0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopEthnicityLanguageFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public tpa0 f34304I;

    /* JADX INFO: renamed from: J */
    public upa0 f34305J;

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo52773P4(User user) {
        this.f34304I.m192124g0(user);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag, p153l.bqa0
    /* JADX INFO: renamed from: X */
    public boolean mo52781X() {
        return this.f34305J.m197058e();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f34304I = new tpa0(this);
        upa0 upa0Var = new upa0(this);
        this.f34305J = upa0Var;
        this.f34304I.mo52715C(upa0Var);
        this.f34304I.mo40472Z();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f34305J.inflateView(layoutInflater, viewGroup);
    }
}
