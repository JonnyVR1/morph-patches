package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.account.p050ui.accountnew.facebook.FacebookSignUpProfileImageAct;
import com.p046p1.mobile.putong.data.SignUpData;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import p147v.VButton_FakeShadow;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class ovf implements s7m<lvf> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f145799a;

    /* JADX INFO: renamed from: b */
    public VText f145800b;

    /* JADX INFO: renamed from: c */
    public VText f145801c;

    /* JADX INFO: renamed from: d */
    public VLinear f145802d;

    /* JADX INFO: renamed from: e */
    public VImage f145803e;

    /* JADX INFO: renamed from: f */
    public VImage f145804f;

    /* JADX INFO: renamed from: g */
    public VImage f145805g;

    /* JADX INFO: renamed from: h */
    public VButton_FakeShadow f145806h;

    /* JADX INFO: renamed from: i */
    public VText f145807i;

    /* JADX INFO: renamed from: j */
    public final FacebookSignUpProfileImageAct f145808j;

    /* JADX INFO: renamed from: k */
    public lvf f145809k;

    public ovf(FacebookSignUpProfileImageAct facebookSignUpProfileImageAct) {
        this.f145808j = facebookSignUpProfileImageAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return act();
    }

    /* JADX INFO: renamed from: c */
    public View m166174c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pvf.m171621b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public FacebookSignUpProfileImageAct act() {
        return this.f145808j;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(lvf lvfVar) {
        this.f145809k = lvfVar;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m166177f(View view) {
        zvf0.m220399u("e_fbimagepage_signup_value_button", this.f145808j.pageId(), vwb.m200311Y("fbimagepage_signup_value_button", "change"));
        this.f145809k.m151889F0();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m166178i(View view) {
        zvf0.m220399u("e_fbimagepage_signup_value_button", this.f145808j.pageId(), vwb.m200311Y("fbimagepage_signup_value_button", "upload"));
        this.f145809k.m151888E0();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM166174c = m166174c(layoutInflater, viewGroup);
        xdl0.m208329E0(this.f145807i, new View.OnClickListener() { // from class: l.mvf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135898a.m166177f(view);
            }
        });
        xdl0.m208329E0(this.f145806h, new View.OnClickListener() { // from class: l.nvf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140715a.m166178i(view);
            }
        });
        return viewM166174c;
    }

    /* JADX INFO: renamed from: j */
    public void m166179j(SignUpData signUpData) {
        m166180k(signUpData.profilePath);
        djj hierarchy = this.f145799a.getHierarchy();
        if (TEnum.equals(signUpData.gender, "female")) {
            hierarchy.m112049D(v2c0.f179436T1);
            this.f145803e.setImageResource(v2c0.f179427Q1);
        } else if (TEnum.equals(signUpData.gender, "male")) {
            hierarchy.m112049D(v2c0.f179439U1);
            this.f145803e.setImageResource(v2c0.f179430R1);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m166180k(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f145806h.setEnabled(false);
        } else {
            qib0.f154691G.m102367m0(this.f145799a, rhi.m179355B(str));
            this.f145806h.setEnabled(true);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
