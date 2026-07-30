package com.p051p1.mobile.putong.core.p058ui.profile.loop.input;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p153l.bva0;
import p153l.cva0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopVerificationFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public cva0 f34382I;

    /* JADX INFO: renamed from: J */
    public bva0 f34383J;

    /* JADX INFO: renamed from: K */
    public boolean f34384K;

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag, p153l.bqa0
    /* JADX INFO: renamed from: H */
    public void mo52769H() {
        if (this.f34384K || this.f34382I.m112785c()) {
            super.mo52769H();
            if (act() instanceof ProfileInfoLoopEditAct) {
                ((ProfileInfoLoopEditAct) act()).m52692b2().m52732X0(false);
            }
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo52773P4(User user) {
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f34383J = new bva0(this);
        cva0 cva0Var = new cva0(act(), this);
        this.f34382I = cva0Var;
        this.f34383J.mo52715C(cva0Var);
        this.f34383J.mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: e5 */
    public void mo52789e5() {
        super.mo52789e5();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f34383J.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag, p153l.bqa0
    /* JADX INFO: renamed from: h1 */
    public void mo52792h1() {
        this.f34384K = true;
        super.mo52792h1();
        this.f34384K = false;
        if (act() instanceof ProfileInfoLoopEditAct) {
            ((ProfileInfoLoopEditAct) act()).m52692b2().m52732X0(false);
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f34382I.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && NullChecker.m82486a(intent) && NullChecker.m82486a(this.f34383J)) {
            this.f34383J.m106557g0(i, i2, intent);
        }
    }
}
