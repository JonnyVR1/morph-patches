package com.p046p1.mobile.putong.core.p053ui.profile.loop.input;

import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p149l.jla0;
import p149l.lla0;
import p149l.lm90;
import p149l.vwb;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopSelectInputFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public jla0 f33528I;

    /* JADX INFO: renamed from: J */
    public lla0 f33529J;

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag, p149l.xha0
    /* JADX INFO: renamed from: H */
    public void mo51586H() {
        super.mo51586H();
        if (this.f33455z == LoopInputType.GROWTH_FOOD) {
            List<String> list = mo51592R4().profile.extensions.interest.taste;
            ArrayList arrayList = new ArrayList();
            if (!vwb.m200296J(list)) {
                for (String str : list) {
                    if (!TextUtils.isEmpty(str)) {
                        String strM150558a = lm90.m150558a(str);
                        if (!TextUtils.isEmpty(strM150558a)) {
                            arrayList.add(strM150558a);
                        }
                    }
                }
            }
            zvf0.m220399u("e_edit_specific_profile_next", this.f33455z.pageId, vwb.m200311Y("tantanx_card_eidt_info", arrayList));
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo51590P4(User user) {
        this.f33528I.m142045t0(user);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag, p149l.xha0
    /* JADX INFO: renamed from: X */
    public boolean mo51598X() {
        return this.f33528I.m142041p0();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo51600Y4(List<Media> list, int i) {
        this.f33529J.m150458m(list, i);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f33528I = new jla0(this);
        lla0 lla0Var = new lla0(act(), this);
        this.f33529J = lla0Var;
        this.f33528I.mo51532C(lla0Var);
        this.f33528I.mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f33528I.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f33529J.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && NullChecker.m81303a(intent) && NullChecker.m81303a(this.f33528I)) {
            this.f33528I.m142037J0(i, i2, intent);
        }
    }
}
