package com.p051p1.mobile.putong.core.p058ui.profile.loop.house;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import p153l.ssa0;
import p153l.vsa0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopSelectHouseFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public ssa0 f34308I;

    /* JADX INFO: renamed from: J */
    public vsa0 f34309J;

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo52773P4(User user) {
        this.f34309J.m202597q(user);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo52783Y4(List<Media> list, int i) {
        this.f34309J.m202591A(list, i);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f34308I = new ssa0(this);
        vsa0 vsa0Var = new vsa0(act(), this);
        this.f34309J = vsa0Var;
        this.f34308I.mo52715C(vsa0Var);
        this.f34308I.mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f34308I.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f34309J.inflateView(layoutInflater, viewGroup);
    }
}
