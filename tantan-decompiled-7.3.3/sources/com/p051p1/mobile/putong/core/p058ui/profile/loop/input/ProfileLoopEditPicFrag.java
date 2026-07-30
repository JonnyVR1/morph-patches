package com.p051p1.mobile.putong.core.p058ui.profile.loop.input;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import p153l.poa0;
import p153l.soa0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopEditPicFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public poa0 f34358I;

    /* JADX INFO: renamed from: J */
    public soa0 f34359J;

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo52773P4(User user) {
        this.f34359J.m187168i(user);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: T4 */
    public boolean mo52777T4(boolean z) {
        return this.f34358I.m173103i0(z);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag, p153l.bqa0
    /* JADX INFO: renamed from: X */
    public boolean mo52781X() {
        if (this.f34359J.m187167f() <= 0) {
            return true;
        }
        this.f34359J.m187176u();
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo52783Y4(List<Media> list, int i) {
        if (i != -1) {
            this.f34359J.m187174p(list, i);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f34358I = new poa0(this);
        soa0 soa0Var = new soa0(act(), this);
        this.f34359J = soa0Var;
        this.f34358I.mo52715C(soa0Var);
        this.f34358I.mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: e5 */
    public void mo52789e5() {
        this.f34359J.m187178w();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f34358I.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f34359J.inflateView(layoutInflater, viewGroup);
    }
}
