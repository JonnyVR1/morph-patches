package com.p051p1.mobile.putong.core.p058ui.profile.loop.input;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.data.User;
import p153l.gqa0;
import p153l.iqa0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopMBTTestFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public gqa0 f34362I;

    /* JADX INFO: renamed from: J */
    public iqa0 f34363J;

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo52773P4(User user) {
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f34362I = new gqa0(this);
        iqa0 iqa0Var = new iqa0(this);
        this.f34363J = iqa0Var;
        this.f34362I.mo52715C(iqa0Var);
        this.f34362I.mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f34362I.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f34363J.inflateView(layoutInflater, viewGroup);
    }
}
