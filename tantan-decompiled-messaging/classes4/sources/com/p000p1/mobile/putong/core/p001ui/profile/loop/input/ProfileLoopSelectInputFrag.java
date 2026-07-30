package com.p000p1.mobile.putong.core.p001ui.profile.loop.input;

import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.j760;
import l.lm90;
import l.vwb;
import l.zvf0;
import p002l.jla0;
import p002l.lla0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileLoopSelectInputFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public jla0 f1350I;

    /* JADX INFO: renamed from: J */
    public lla0 f1351J;

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag, p002l.xha0
    /* JADX INFO: renamed from: H */
    public void mo2072H() {
        super.mo2072H();
        if (this.f1277z == LoopInputType.GROWTH_FOOD) {
            List<String> list = mo2078R4().profile.extensions.interest.taste;
            ArrayList arrayList = new ArrayList();
            if (!vwb.J(list)) {
                for (String str : list) {
                    if (!TextUtils.isEmpty(str)) {
                        String strA = lm90.a(str);
                        if (!TextUtils.isEmpty(strA)) {
                            arrayList.add(strA);
                        }
                    }
                }
            }
            zvf0.u("e_edit_specific_profile_next", this.f1277z.pageId, new j760[]{vwb.Y("tantanx_card_eidt_info", arrayList)});
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo2076P4(User user) {
        this.f1350I.m16029t0(user);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag, p002l.xha0
    /* JADX INFO: renamed from: X */
    public boolean mo2084X() {
        return this.f1350I.m16025p0();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo2086Y4(List<Media> list, int i) {
        this.f1351J.m17306m(list, i);
    }

    /* JADX INFO: renamed from: d4 */
    public void m2199d4() {
        super.d4();
        this.f1350I = new jla0(this);
        lla0 lla0Var = new lla0(act(), this);
        this.f1351J = lla0Var;
        this.f1350I.C(lla0Var);
        this.f1350I.m16023Z();
    }

    /* JADX INFO: renamed from: f4 */
    public void m2200f4() {
        super.f4();
        this.f1350I.m16024a0();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1351J.inflateView(layoutInflater, viewGroup);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super/*com.p1.mobile.android.app.Frag*/.onActivityResult(i, i2, intent);
        if (i2 == -1 && NullChecker.a(intent) && NullChecker.a(this.f1350I)) {
            this.f1350I.m16019J0(i, i2, intent);
        }
    }
}
