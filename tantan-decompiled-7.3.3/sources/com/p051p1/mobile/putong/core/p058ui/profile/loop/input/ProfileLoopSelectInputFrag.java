package com.p051p1.mobile.putong.core.p058ui.profile.loop.input;

import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p153l.i4g0;
import p153l.jyb;
import p153l.nta0;
import p153l.pta0;
import p153l.pu90;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopSelectInputFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public nta0 f34376I;

    /* JADX INFO: renamed from: J */
    public pta0 f34377J;

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag, p153l.bqa0
    /* JADX INFO: renamed from: H */
    public void mo52769H() {
        super.mo52769H();
        if (this.f34303z == LoopInputType.GROWTH_FOOD) {
            List<String> list = mo52775R4().profile.extensions.interest.taste;
            ArrayList arrayList = new ArrayList();
            if (!jyb.m147479J(list)) {
                for (String str : list) {
                    if (!TextUtils.isEmpty(str)) {
                        String strM173837a = pu90.m173837a(str);
                        if (!TextUtils.isEmpty(strM173837a)) {
                            arrayList.add(strM173837a);
                        }
                    }
                }
            }
            i4g0.m138523u("e_edit_specific_profile_next", this.f34303z.pageId, jyb.m147494Y("tantanx_card_eidt_info", arrayList));
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo52773P4(User user) {
        this.f34376I.m164718t0(user);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag, p153l.bqa0
    /* JADX INFO: renamed from: X */
    public boolean mo52781X() {
        return this.f34376I.m164714p0();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo52783Y4(List<Media> list, int i) {
        this.f34377J.m173745m(list, i);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f34376I = new nta0(this);
        pta0 pta0Var = new pta0(act(), this);
        this.f34377J = pta0Var;
        this.f34376I.mo52715C(pta0Var);
        this.f34376I.mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f34376I.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f34377J.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && NullChecker.m82486a(intent) && NullChecker.m82486a(this.f34376I)) {
            this.f34376I.m164710J0(i, i2, intent);
        }
    }
}
