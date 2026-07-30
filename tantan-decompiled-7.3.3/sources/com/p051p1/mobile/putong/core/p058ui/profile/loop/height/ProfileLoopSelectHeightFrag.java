package com.p051p1.mobile.putong.core.p058ui.profile.loop.height;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import p153l.nsa0;
import p153l.qsa0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopSelectHeightFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public nsa0 f34306I;

    /* JADX INFO: renamed from: J */
    public qsa0 f34307J;

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag, p153l.bqa0
    /* JADX INFO: renamed from: H */
    public void mo52769H() {
        super.mo52769H();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo52773P4(User user) {
        this.f34307J.m177746m(user);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo52783Y4(List<Media> list, int i) {
        this.f34307J.m177750u(list, i);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f34306I = new nsa0(this);
        qsa0 qsa0Var = new qsa0(act(), this);
        this.f34307J = qsa0Var;
        this.f34306I.mo52715C(qsa0Var);
        this.f34306I.mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f34306I.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f34307J.inflateView(layoutInflater, viewGroup);
    }
}
