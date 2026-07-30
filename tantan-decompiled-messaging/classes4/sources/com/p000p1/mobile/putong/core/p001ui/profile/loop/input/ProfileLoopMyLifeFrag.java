package com.p000p1.mobile.putong.core.p001ui.profile.loop.input;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.ProfileInfoLoopEditAct;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import java.util.List;
import p002l.ria0;
import p002l.xia0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileLoopMyLifeFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public ria0 f1339I;

    /* JADX INFO: renamed from: J */
    public xia0 f1340J;

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag, p002l.xha0
    /* JADX INFO: renamed from: H */
    public void mo2072H() {
        super.mo2072H();
        this.f1340J.m25952A();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo2076P4(User user) {
        ria0 ria0Var = this.f1339I;
        if (ria0Var != null) {
            ria0Var.m22007k0();
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: R4 */
    public User mo2078R4() {
        return this.f1340J.m25974s();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: S4 */
    public User mo2079S4() {
        return this.f1340J.m25974s();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag, p002l.xha0
    /* JADX INFO: renamed from: X */
    public boolean mo2084X() {
        if (this.f1340J.m25969m() <= 0) {
            return !m2083W4() || this.f1340J.m25974s().pictures.size() >= 3;
        }
        this.f1340J.m25958G();
        return false;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo2086Y4(List<Media> list, int i) {
        this.f1340J.m25953B(list, i);
    }

    /* JADX INFO: renamed from: d4 */
    public void m2161d4() {
        super.d4();
        this.f1339I = new ria0(this);
        xia0 xia0Var = new xia0(act(), this);
        this.f1340J = xia0Var;
        this.f1339I.C(xia0Var);
        this.f1339I.Z();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: d5 */
    public void mo2091d5() {
        if (act() instanceof ProfileInfoLoopEditAct) {
            super.mo2091d5();
        }
    }

    /* JADX INFO: renamed from: f4 */
    public void m2162f4() {
        super.f4();
        this.f1339I.m22006a0();
    }

    /* JADX INFO: renamed from: h5 */
    public boolean m2163h5() {
        xia0 xia0Var = this.f1340J;
        if (xia0Var == null) {
            return false;
        }
        return xia0Var.m25968l();
    }

    /* JADX INFO: renamed from: i5 */
    public boolean m2164i5() {
        return TextUtils.equals(this.f1273E, "from_complete_equity_guide") || TextUtils.equals(this.f1273E, "from_complete_equity_guide_card");
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        xia0 xia0Var = this.f1340J;
        xia0Var.f22302j = this.f1274F;
        return xia0Var.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag, p002l.xha0
    public boolean isLast() {
        if (act() instanceof ProfileInfoLoopEditAct) {
            return super.isLast();
        }
        return true;
    }

    /* JADX INFO: renamed from: j5 */
    public void m2165j5() {
        xia0 xia0Var = this.f1340J;
        if (xia0Var == null) {
            return;
        }
        xia0Var.m25959H();
    }

    /* JADX INFO: renamed from: k5 */
    public void m2166k5() {
        xia0 xia0Var = this.f1340J;
        if (xia0Var == null) {
            return;
        }
        xia0Var.m25960I();
    }
}
