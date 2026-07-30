package p006l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.account.p002ui.accountnew.facebook.FacebookSignUpProfileImageAct;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.data.tenum.TEnum;
import l.djj;
import l.j760;
import l.rhi;
import l.s7m;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VButton_FakeShadow;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ovf implements s7m<lvf> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f18398a;

    /* JADX INFO: renamed from: b */
    public VText f18399b;

    /* JADX INFO: renamed from: c */
    public VText f18400c;

    /* JADX INFO: renamed from: d */
    public VLinear f18401d;

    /* JADX INFO: renamed from: e */
    public VImage f18402e;

    /* JADX INFO: renamed from: f */
    public VImage f18403f;

    /* JADX INFO: renamed from: g */
    public VImage f18404g;

    /* JADX INFO: renamed from: h */
    public VButton_FakeShadow f18405h;

    /* JADX INFO: renamed from: i */
    public VText f18406i;

    /* JADX INFO: renamed from: j */
    public final FacebookSignUpProfileImageAct f18407j;

    /* JADX INFO: renamed from: k */
    public lvf f18408k;

    public ovf(FacebookSignUpProfileImageAct facebookSignUpProfileImageAct) {
        this.f18407j = facebookSignUpProfileImageAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m20834C0() {
        return act();
    }

    /* JADX INFO: renamed from: c */
    public View m20835c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pvf.m21770b(this, layoutInflater, viewGroup);
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public FacebookSignUpProfileImageAct act() {
        return this.f18407j;
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m20840i1(lvf lvfVar) {
        this.f18408k = lvfVar;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m20838f(View view) {
        zvf0.u("e_fbimagepage_signup_value_button", this.f18407j.pageId(), new j760[]{vwb.Y("fbimagepage_signup_value_button", "change")});
        this.f18408k.m19066F0();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m20839i(View view) {
        zvf0.u("e_fbimagepage_signup_value_button", this.f18407j.pageId(), new j760[]{vwb.Y("fbimagepage_signup_value_button", "upload")});
        this.f18408k.m19065E0();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM20835c = m20835c(layoutInflater, viewGroup);
        xdl0.E0(this.f18406i, new View.OnClickListener() { // from class: l.mvf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17312a.m20838f(view);
            }
        });
        xdl0.E0(this.f18405h, new View.OnClickListener() { // from class: l.nvf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17892a.m20839i(view);
            }
        });
        return viewM20835c;
    }

    /* JADX INFO: renamed from: j */
    public void m20841j(SignUpData signUpData) {
        m20842k(signUpData.profilePath);
        djj hierarchy = this.f18398a.getHierarchy();
        if (TEnum.equals(signUpData.gender, "female")) {
            hierarchy.D(v2c0.f24000T1);
            this.f18402e.setImageResource(v2c0.f23991Q1);
        } else if (TEnum.equals(signUpData.gender, "male")) {
            hierarchy.D(v2c0.f24003U1);
            this.f18402e.setImageResource(v2c0.f23994R1);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m20842k(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f18405h.setEnabled(false);
        } else {
            qib0.f19782G.m12780m0(this.f18398a, rhi.B(str));
            this.f18405h.setEnabled(true);
        }
    }

    public void destroy() {
    }
}
