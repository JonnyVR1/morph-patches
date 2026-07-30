package p149l;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.appsflyer.AppsFlyerLib;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.api.C4575a;
import com.p046p1.mobile.putong.account.p050ui.accountnew.facebook.FacebookSignUpProfileImageAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.SignUpData;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class lvf extends jq2<ovf> {

    /* JADX INFO: renamed from: a */
    public SignUpData f130159a;

    /* JADX INFO: renamed from: b */
    public boolean f130160b;

    public lvf(FacebookSignUpProfileImageAct facebookSignUpProfileImageAct) {
        super(facebookSignUpProfileImageAct);
    }

    /* JADX INFO: renamed from: H0 */
    private void m151871H0() {
        Intent intentNewMainActClearStack = AccountModule.m28132H().newMainActClearStack(m151891o0(), true, false);
        intentNewMainActClearStack.putExtra("from_sign_up", true);
        m151891o0().startActivity(intentNewMainActClearStack);
        m151891o0().m66873d2();
        yij0.m214941S(m151891o0());
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m151880m0(cwf0 cwf0Var) {
        i0e.m133796e(cwf0Var);
        zvf0.m220399u("e_signup_photo_alert_continue_button", "p_imagepage_signup_photo_alert", vwb.m200311Y("signup_source", AccountModule.f16037c.m28327d1()), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, AccountModule.f16037c.m28325c1().phoneNumber));
    }

    /* JADX INFO: renamed from: q0 */
    private void m151882q0() {
        if (!ane0.m97751w() || lifecycle_() == C4319c.f15548i) {
            m151871H0();
        } else {
            this.f130160b = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m151883u0(Bundle bundle) {
        ((ovf) this.viewModel).m166179j(this.f130159a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m151884y0(C4319c c4319c) {
        m151871H0();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m151885A0(SignUpData signUpData, roj0 roj0Var) {
        if (TEnum.equals(signUpData.gender, "male")) {
            qib0.m174815e1("signup_male_fb", new Object[0]);
        } else if (TEnum.equals(signUpData.gender, "female")) {
            qib0.m174815e1("signup_female_fb", new Object[0]);
        }
        m151891o0().progressDismiss();
        m151882q0();
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m151886C0(Throwable th) {
        m151891o0().progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m151887D0(cwf0 cwf0Var) {
        i0e.m133796e(cwf0Var);
        zvf0.m220399u("e_signup_photo_alert_change_button", "p_imagepage_signup_photo_alert", vwb.m200311Y("signup_source", AccountModule.f16037c.m28327d1()), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, AccountModule.f16037c.m28325c1().phoneNumber));
        FacebookSignUpProfileImageAct facebookSignUpProfileImageActM151891o0 = m151891o0();
        SignUpData signUpData = this.f130159a;
        facebookSignUpProfileImageActM151891o0.pickImagesWithPickerInFloatLayerExp(1, false, false, true, signUpData == null ? null : signUpData.gender);
    }

    /* JADX INFO: renamed from: E0 */
    public void m151888E0() {
        m151891o0().progress(R$string.f16227j0);
        final SignUpData signUpData = this.f130159a;
        signUpData.appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(m151891o0());
        C4575a.m28250q2(signUpData, new Runnable() { // from class: l.fvf
            @Override // java.lang.Runnable
            public final void run() {
                this.f99421a.m151897z0();
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.gvf
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104569a.m151885A0(signUpData, (roj0) obj);
            }
        }, new e30() { // from class: l.hvf
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109640a.m151886C0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F0 */
    public void m151889F0() {
        m151891o0().pickImagesWithPicker(1, false, false, true);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m151890G0() {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_imagepage_signup_photo_alert", Dialog.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Oauth2AccessToken.KEY_PHONE_NUM, AccountModule.f16037c.m28325c1().phoneNumber);
            jSONObject.put("signup_source", AccountModule.f16037c.m28327d1());
            u4e.m191726a(jSONObject, "passive", "alert", "alert_system", "null", "edit_profile_page", "guide");
            cwf0VarM133794c.m109039o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        cwf0VarM133794c.m109039o(jSONObject);
        i0e.m133797f(cwf0VarM133794c);
        ((ovf) this.viewModel).act().dialog().m20503E0(R$string.f16081H3).m20500D(R$string.f16076G3).m20556t0(R$string.f16184c, new Runnable() { // from class: l.jvf
            @Override // java.lang.Runnable
            public final void run() {
                lvf.m151880m0(cwf0VarM133794c);
            }
        }).m20542l0(R$string.f16071F3, new Runnable() { // from class: l.kvf
            @Override // java.lang.Runnable
            public final void run() {
                this.f124770a.m151887D0(cwf0VarM133794c);
            }
        }).m20567z().show();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.bvf
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77437a.m151883u0((Bundle) obj);
            }
        });
        if (ane0.m97751w()) {
            lifecycle().filter(new w9j() { // from class: l.cvf
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f82660a.m151896x0((C4319c) obj);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.dvf
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f88054a.m151884y0((C4319c) obj);
                }
            }));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: o0 */
    public FacebookSignUpProfileImageAct m151891o0() {
        return (FacebookSignUpProfileImageAct) super.act();
    }

    /* JADX INFO: renamed from: p0 */
    public void m151892p0(Media media) {
        final String strM179382z = rhi.m179382z(media.url);
        ovf ovfVar = (ovf) this.viewModel;
        this.f130159a.profilePath = strM179382z;
        ovfVar.m166180k(strM179382z);
        m151891o0().progress(R$string.f16227j0);
        e51.m114774y(new Runnable() { // from class: l.evf
            @Override // java.lang.Runnable
            public final void run() {
                this.f93332a.m151895t0(strM179382z);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public void m151893r0(SignUpData signUpData) {
        this.f130159a = signUpData;
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m151894s0(boolean z) {
        m151891o0().progressDismiss();
        if (z) {
            return;
        }
        m151890G0();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m151895t0(String str) {
        final boolean zM127928b = gtf.m127928b(str);
        e51.m114742G(new Runnable() { // from class: l.ivf
            @Override // java.lang.Runnable
            public final void run() {
                this.f115160a.m151894s0(zM127928b);
            }
        });
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ Boolean m151896x0(C4319c c4319c) {
        return Boolean.valueOf(this.f130160b && c4319c == C4319c.f15548i);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m151897z0() {
        m151891o0().hideInput();
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
