package com.p046p1.mobile.putong.core.p053ui.profile.loop.input;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.ifa0;
import p149l.j760;
import p149l.lqa;
import p149l.nfa0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopEditPetPicFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public ifa0 f33507I;

    /* JADX INFO: renamed from: J */
    public nfa0 f33508J;

    /* JADX INFO: renamed from: K */
    public String f33509K;

    /* JADX INFO: renamed from: h5 */
    private void m51647h5() {
        String strM135892i0 = this.f33507I.m135892i0();
        if (TextUtils.isEmpty(strM135892i0)) {
            return;
        }
        try {
            this.f33509K = new JSONObject(strM135892i0).optString("type");
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo51590P4(User user) {
        this.f33508J.m159167l(user);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: T4 */
    public boolean mo51594T4(boolean z) {
        return this.f33507I.m135893j0(z);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag, p149l.xha0
    /* JADX INFO: renamed from: X */
    public boolean mo51598X() {
        if (this.f33508J.m159166k() <= 0) {
            return true;
        }
        this.f33508J.m159157B();
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo51600Y4(List<Media> list, int i) {
        if (i != -1) {
            this.f33508J.m159175x(list, i);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f33507I = new ifa0(this);
        nfa0 nfa0Var = new nfa0(act(), this);
        this.f33508J = nfa0Var;
        this.f33507I.mo51532C(nfa0Var);
        this.f33507I.mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: e5 */
    public void mo51606e5() {
        this.f33508J.m159160F();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f33507I.mo39470a0();
    }

    /* JADX INFO: renamed from: i5 */
    public void m51648i5(Media media) {
        this.f33508J.m159161G(media);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f33508J.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m51647h5();
        mo29638J4().m109040p(j760.m140076a("continuous_edit_complete_count", Integer.valueOf(this.f33449C)), j760.m140076a("continuous_edit_last_step", Boolean.valueOf(this.f33450D)), j760.m140076a("continuous_edit_step_num", Integer.valueOf(this.f33448B)), j760.m140076a("edit_specific_profile_show_from", this.f33451E), j760.m140076a("tantanx_scene_name", this.f33509K), j760.m140076a("is_test_field", lqa.m150985w() ? "is_test_field_y" : "is_test_field_n"));
    }
}
