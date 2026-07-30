package com.p046p1.mobile.putong.core.p053ui.profile.loop.input;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.ProfileInfoLoopEditAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p149l.xma0;
import p149l.yma0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopVerificationFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public yma0 f33534I;

    /* JADX INFO: renamed from: J */
    public xma0 f33535J;

    /* JADX INFO: renamed from: K */
    public boolean f33536K;

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag, p149l.xha0
    /* JADX INFO: renamed from: H */
    public void mo51586H() {
        if (this.f33536K || this.f33534I.m215343c()) {
            super.mo51586H();
            if (act() instanceof ProfileInfoLoopEditAct) {
                ((ProfileInfoLoopEditAct) act()).m51509a2().m51549X0(false);
            }
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo51590P4(User user) {
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f33535J = new xma0(this);
        yma0 yma0Var = new yma0(act(), this);
        this.f33534I = yma0Var;
        this.f33535J.mo51532C(yma0Var);
        this.f33535J.mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: e5 */
    public void mo51606e5() {
        super.mo51606e5();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f33535J.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag, p149l.xha0
    /* JADX INFO: renamed from: h1 */
    public void mo51609h1() {
        this.f33536K = true;
        super.mo51609h1();
        this.f33536K = false;
        if (act() instanceof ProfileInfoLoopEditAct) {
            ((ProfileInfoLoopEditAct) act()).m51509a2().m51549X0(false);
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f33534I.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && NullChecker.m81303a(intent) && NullChecker.m81303a(this.f33535J)) {
            this.f33535J.m210118g0(i, i2, intent);
        }
    }
}
