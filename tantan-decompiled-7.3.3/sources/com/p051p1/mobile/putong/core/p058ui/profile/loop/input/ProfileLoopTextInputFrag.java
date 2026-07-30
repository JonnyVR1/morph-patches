package com.p051p1.mobile.putong.core.p058ui.profile.loop.input;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p153l.vua0;
import p153l.yua0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopTextInputFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public vua0 f34380I;

    /* JADX INFO: renamed from: J */
    public yua0 f34381J;

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: N4 */
    public boolean mo52771N4() {
        return this.f34381J.m217367f(this.f34303z);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo52773P4(User user) {
        this.f34381J.m217369j(user);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag, p153l.bqa0
    /* JADX INFO: renamed from: X */
    public boolean mo52781X() {
        return (m52779V4() || m52780W4()) ? this.f34381J.m217366e() : super.mo52781X();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f34380I = new vua0(this);
        yua0 yua0Var = new yua0(act(), this);
        this.f34381J = yua0Var;
        this.f34380I.mo52715C(yua0Var);
        this.f34380I.mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: e5 */
    public void mo52789e5() {
        this.f34381J.m217374q();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f34380I.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        yua0 yua0Var = this.f34381J;
        yua0Var.f201606h = this.f34300F;
        return yua0Var.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && NullChecker.m82486a(intent) && NullChecker.m82486a(this.f34380I)) {
            this.f34380I.m202784h0(i, i2, intent);
        }
    }
}
