package com.p000p1.mobile.putong.core.p001ui.profile.loop.input;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import l.j760;
import l.lqa;
import org.json.JSONException;
import org.json.JSONObject;
import p002l.ifa0;
import p002l.nfa0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileLoopEditPetPicFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public ifa0 f1329I;

    /* JADX INFO: renamed from: J */
    public nfa0 f1330J;

    /* JADX INFO: renamed from: K */
    public String f1331K;

    /* JADX INFO: renamed from: h5 */
    private void m2140h5() {
        String strM15139i0 = this.f1329I.m15139i0();
        if (TextUtils.isEmpty(strM15139i0)) {
            return;
        }
        try {
            this.f1331K = new JSONObject(strM15139i0).optString("type");
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo2076P4(User user) {
        this.f1330J.m18721l(user);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: T4 */
    public boolean mo2080T4(boolean z) {
        return this.f1329I.m15140j0(z);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag, p002l.xha0
    /* JADX INFO: renamed from: X */
    public boolean mo2084X() {
        if (this.f1330J.m18720k() <= 0) {
            return true;
        }
        this.f1330J.m18709B();
        return false;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo2086Y4(List<Media> list, int i) {
        if (i != -1) {
            this.f1330J.m18729x(list, i);
        }
    }

    /* JADX INFO: renamed from: d4 */
    public void m2141d4() {
        super.d4();
        this.f1329I = new ifa0(this);
        nfa0 nfa0Var = new nfa0(act(), this);
        this.f1330J = nfa0Var;
        this.f1329I.C(nfa0Var);
        this.f1329I.m15137Z();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: e5 */
    public void mo2092e5() {
        this.f1330J.m18713F();
    }

    /* JADX INFO: renamed from: f4 */
    public void m2142f4() {
        super.f4();
        this.f1329I.m15138a0();
    }

    /* JADX INFO: renamed from: i5 */
    public void m2143i5(Media media) {
        this.f1330J.m18714G(media);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1330J.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m2140h5();
        J4().p(new j760[]{j760.a("continuous_edit_complete_count", Integer.valueOf(this.f1271C)), j760.a("continuous_edit_last_step", Boolean.valueOf(this.f1272D)), j760.a("continuous_edit_step_num", Integer.valueOf(this.f1270B)), j760.a("edit_specific_profile_show_from", this.f1273E), j760.a("tantanx_scene_name", this.f1331K), j760.a("is_test_field", lqa.w() ? "is_test_field_y" : "is_test_field_n")});
    }
}
