package com.p051p1.mobile.putong.core.p058ui.profile.loop.input;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import p153l.bra0;
import p153l.vqa0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopMyLifeFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public vqa0 f34365I;

    /* JADX INFO: renamed from: J */
    public bra0 f34366J;

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag, p153l.bqa0
    /* JADX INFO: renamed from: H */
    public void mo52769H() {
        super.mo52769H();
        this.f34366J.m106097A();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo52773P4(User user) {
        vqa0 vqa0Var = this.f34365I;
        if (vqa0Var != null) {
            vqa0Var.m202370k0();
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: R4 */
    public User mo52775R4() {
        return this.f34366J.m106115s();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: S4 */
    public User mo52776S4() {
        return this.f34366J.m106115s();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag, p153l.bqa0
    /* JADX INFO: renamed from: X */
    public boolean mo52781X() {
        if (this.f34366J.m106111m() <= 0) {
            return !m52780W4() || this.f34366J.m106115s().pictures.size() >= 3;
        }
        this.f34366J.m106102G();
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo52783Y4(List<Media> list, int i) {
        this.f34366J.m106098B(list, i);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f34365I = new vqa0(this);
        bra0 bra0Var = new bra0(act(), this);
        this.f34366J = bra0Var;
        this.f34365I.mo52715C(bra0Var);
        this.f34365I.mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: d5 */
    public void mo52788d5() {
        if (act() instanceof ProfileInfoLoopEditAct) {
            super.mo52788d5();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f34365I.mo40473a0();
    }

    /* JADX INFO: renamed from: h5 */
    public boolean m52839h5() {
        bra0 bra0Var = this.f34366J;
        if (bra0Var == null) {
            return false;
        }
        return bra0Var.m106110l();
    }

    /* JADX INFO: renamed from: i5 */
    public boolean m52840i5() {
        return TextUtils.equals(this.f34299E, "from_complete_equity_guide") || TextUtils.equals(this.f34299E, "from_complete_equity_guide_card");
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        bra0 bra0Var = this.f34366J;
        bra0Var.f78002j = this.f34300F;
        return bra0Var.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag, p153l.bqa0
    public boolean isLast() {
        if (act() instanceof ProfileInfoLoopEditAct) {
            return super.isLast();
        }
        return true;
    }

    /* JADX INFO: renamed from: j5 */
    public void m52841j5() {
        bra0 bra0Var = this.f34366J;
        if (bra0Var == null) {
            return;
        }
        bra0Var.m106103H();
    }

    /* JADX INFO: renamed from: k5 */
    public void m52842k5() {
        bra0 bra0Var = this.f34366J;
        if (bra0Var == null) {
            return;
        }
        bra0Var.m106104I();
    }
}
