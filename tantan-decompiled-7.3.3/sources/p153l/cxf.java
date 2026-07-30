package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.account.p055ui.accountnew.facebook.FacebookSignUpProfileImageAct;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import p151v.VButton_FakeShadow;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class cxf implements iam<zwf> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f84213a;

    /* JADX INFO: renamed from: b */
    public VText f84214b;

    /* JADX INFO: renamed from: c */
    public VText f84215c;

    /* JADX INFO: renamed from: d */
    public VLinear f84216d;

    /* JADX INFO: renamed from: e */
    public VImage f84217e;

    /* JADX INFO: renamed from: f */
    public VImage f84218f;

    /* JADX INFO: renamed from: g */
    public VImage f84219g;

    /* JADX INFO: renamed from: h */
    public VButton_FakeShadow f84220h;

    /* JADX INFO: renamed from: i */
    public VText f84221i;

    /* JADX INFO: renamed from: j */
    public final FacebookSignUpProfileImageAct f84222j;

    /* JADX INFO: renamed from: k */
    public zwf f84223k;

    public cxf(FacebookSignUpProfileImageAct facebookSignUpProfileImageAct) {
        this.f84222j = facebookSignUpProfileImageAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return act();
    }

    /* JADX INFO: renamed from: c */
    public View m112974c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dxf.m118467b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public FacebookSignUpProfileImageAct act() {
        return this.f84222j;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(zwf zwfVar) {
        this.f84223k = zwfVar;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m112977f(View view) {
        i4g0.m138523u("e_fbimagepage_signup_value_button", this.f84222j.pageId(), jyb.m147494Y("fbimagepage_signup_value_button", "change"));
        this.f84223k.m221892F0();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m112978i(View view) {
        i4g0.m138523u("e_fbimagepage_signup_value_button", this.f84222j.pageId(), jyb.m147494Y("fbimagepage_signup_value_button", "upload"));
        this.f84223k.m221891E0();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM112974c = m112974c(layoutInflater, viewGroup);
        bnl0.m105509E0(this.f84221i, new View.OnClickListener() { // from class: l.axf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73844a.m112977f(view);
            }
        });
        bnl0.m105509E0(this.f84220h, new View.OnClickListener() { // from class: l.bxf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f78866a.m112978i(view);
            }
        });
        return viewM112974c;
    }

    /* JADX INFO: renamed from: j */
    public void m112979j(SignUpData signUpData) {
        m112980k(signUpData.profilePath);
        wlj hierarchy = this.f84213a.getHierarchy();
        if (TEnum.equals(signUpData.gender, "female")) {
            hierarchy.m207041D(bbc0.f75842T1);
            this.f84217e.setImageResource(bbc0.f75833Q1);
        } else if (TEnum.equals(signUpData.gender, "male")) {
            hierarchy.m207041D(bbc0.f75845U1);
            this.f84217e.setImageResource(bbc0.f75836R1);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m112980k(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f84220h.setEnabled(false);
        } else {
            uqb0.f180374G.m127150m0(this.f84213a, oki.m168011B(str));
            this.f84220h.setEnabled(true);
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
