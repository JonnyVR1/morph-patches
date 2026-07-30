package com.p051p1.mobile.putong.core.p058ui.profile.loop.profession;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.data.User;
import p153l.tta0;
import p153l.zta0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopSelectProfessionFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public tta0 f34419I;

    /* JADX INFO: renamed from: J */
    public zta0 f34420J;

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag, p153l.bqa0
    /* JADX INFO: renamed from: H */
    public void mo52769H() {
        if (this.f34420J.m221479v()) {
            this.f34420J.m221477s();
        } else {
            super.mo52769H();
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo52773P4(User user) {
        this.f34420J.m221480w(user);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f34419I = new tta0(this);
        zta0 zta0Var = new zta0(act(), this);
        this.f34420J = zta0Var;
        this.f34419I.mo52715C(zta0Var);
        this.f34419I.mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f34419I.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f34420J.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f34420J.m221473H(getArguments().getBoolean("not_to_disclose_mode"));
        }
    }
}
