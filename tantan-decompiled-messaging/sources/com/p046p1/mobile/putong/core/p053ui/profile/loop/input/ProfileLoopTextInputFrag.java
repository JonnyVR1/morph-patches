package com.p046p1.mobile.putong.core.p053ui.profile.loop.input;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p149l.rma0;
import p149l.uma0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopTextInputFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public rma0 f33532I;

    /* JADX INFO: renamed from: J */
    public uma0 f33533J;

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: N4 */
    public boolean mo51588N4() {
        return this.f33533J.m194333f(this.f33455z);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo51590P4(User user) {
        this.f33533J.m194335j(user);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag, p149l.xha0
    /* JADX INFO: renamed from: X */
    public boolean mo51598X() {
        return (m51596V4() || m51597W4()) ? this.f33533J.m194332e() : super.mo51598X();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f33532I = new rma0(this);
        uma0 uma0Var = new uma0(act(), this);
        this.f33533J = uma0Var;
        this.f33532I.mo51532C(uma0Var);
        this.f33532I.mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: e5 */
    public void mo51606e5() {
        this.f33533J.m194340q();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f33532I.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        uma0 uma0Var = this.f33533J;
        uma0Var.f177218h = this.f33452F;
        return uma0Var.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && NullChecker.m81303a(intent) && NullChecker.m81303a(this.f33532I)) {
            this.f33532I.m179974h0(i, i2, intent);
        }
    }
}
