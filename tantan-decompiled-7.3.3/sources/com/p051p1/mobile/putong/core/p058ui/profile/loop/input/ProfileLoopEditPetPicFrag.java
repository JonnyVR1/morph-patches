package com.p051p1.mobile.putong.core.p058ui.profile.loop.input;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.mna0;
import p153l.pf60;
import p153l.rna0;
import p153l.xra;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopEditPetPicFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public mna0 f34355I;

    /* JADX INFO: renamed from: J */
    public rna0 f34356J;

    /* JADX INFO: renamed from: K */
    public String f34357K;

    /* JADX INFO: renamed from: h5 */
    private void m52830h5() {
        String strM159125i0 = this.f34355I.m159125i0();
        if (TextUtils.isEmpty(strM159125i0)) {
            return;
        }
        try {
            this.f34357K = new JSONObject(strM159125i0).optString("type");
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo52773P4(User user) {
        this.f34356J.m182139l(user);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: T4 */
    public boolean mo52777T4(boolean z) {
        return this.f34355I.m159126j0(z);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag, p153l.bqa0
    /* JADX INFO: renamed from: X */
    public boolean mo52781X() {
        if (this.f34356J.m182138k() <= 0) {
            return true;
        }
        this.f34356J.m182129B();
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo52783Y4(List<Media> list, int i) {
        if (i != -1) {
            this.f34356J.m182147x(list, i);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f34355I = new mna0(this);
        rna0 rna0Var = new rna0(act(), this);
        this.f34356J = rna0Var;
        this.f34355I.mo52715C(rna0Var);
        this.f34355I.mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: e5 */
    public void mo52789e5() {
        this.f34356J.m182132F();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f34355I.mo40473a0();
    }

    /* JADX INFO: renamed from: i5 */
    public void m52831i5(Media media) {
        this.f34356J.m182133G(media);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f34356J.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m52830h5();
        mo30636J4().m152781p(pf60.m172085a("continuous_edit_complete_count", Integer.valueOf(this.f34297C)), pf60.m172085a("continuous_edit_last_step", Boolean.valueOf(this.f34298D)), pf60.m172085a("continuous_edit_step_num", Integer.valueOf(this.f34296B)), pf60.m172085a("edit_specific_profile_show_from", this.f34299E), pf60.m172085a("tantanx_scene_name", this.f34357K), pf60.m172085a("is_test_field", xra.m212804w() ? "is_test_field_y" : "is_test_field_n"));
    }
}
