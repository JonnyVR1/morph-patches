package com.p046p1.mobile.putong.core.p053ui.profile.loop.input;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.ProfileInfoLoopEditAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import p149l.ria0;
import p149l.xia0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopMyLifeFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public ria0 f33517I;

    /* JADX INFO: renamed from: J */
    public xia0 f33518J;

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag, p149l.xha0
    /* JADX INFO: renamed from: H */
    public void mo51586H() {
        super.mo51586H();
        this.f33518J.m209610A();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo51590P4(User user) {
        ria0 ria0Var = this.f33517I;
        if (ria0Var != null) {
            ria0Var.m179487k0();
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: R4 */
    public User mo51592R4() {
        return this.f33518J.m209627s();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: S4 */
    public User mo51593S4() {
        return this.f33518J.m209627s();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag, p149l.xha0
    /* JADX INFO: renamed from: X */
    public boolean mo51598X() {
        if (this.f33518J.m209623m() <= 0) {
            return !m51597W4() || this.f33518J.m209627s().pictures.size() >= 3;
        }
        this.f33518J.m209615G();
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo51600Y4(List<Media> list, int i) {
        this.f33518J.m209611B(list, i);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f33517I = new ria0(this);
        xia0 xia0Var = new xia0(act(), this);
        this.f33518J = xia0Var;
        this.f33517I.mo51532C(xia0Var);
        this.f33517I.mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: d5 */
    public void mo51605d5() {
        if (act() instanceof ProfileInfoLoopEditAct) {
            super.mo51605d5();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f33517I.mo39470a0();
    }

    /* JADX INFO: renamed from: h5 */
    public boolean m51656h5() {
        xia0 xia0Var = this.f33518J;
        if (xia0Var == null) {
            return false;
        }
        return xia0Var.m209622l();
    }

    /* JADX INFO: renamed from: i5 */
    public boolean m51657i5() {
        return TextUtils.equals(this.f33451E, "from_complete_equity_guide") || TextUtils.equals(this.f33451E, "from_complete_equity_guide_card");
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        xia0 xia0Var = this.f33518J;
        xia0Var.f193092j = this.f33452F;
        return xia0Var.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag, p149l.xha0
    public boolean isLast() {
        if (act() instanceof ProfileInfoLoopEditAct) {
            return super.isLast();
        }
        return true;
    }

    /* JADX INFO: renamed from: j5 */
    public void m51658j5() {
        xia0 xia0Var = this.f33518J;
        if (xia0Var == null) {
            return;
        }
        xia0Var.m209616H();
    }

    /* JADX INFO: renamed from: k5 */
    public void m51659k5() {
        xia0 xia0Var = this.f33518J;
        if (xia0Var == null) {
            return;
        }
        xia0Var.m209617I();
    }
}
