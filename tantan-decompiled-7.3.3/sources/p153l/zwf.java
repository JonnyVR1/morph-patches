package p153l;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.appsflyer.AppsFlyerLib;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.api.C4726a;
import com.p051p1.mobile.putong.account.p055ui.accountnew.facebook.FacebookSignUpProfileImageAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class zwf extends ar2<cxf> {

    /* JADX INFO: renamed from: a */
    public SignUpData f206344a;

    /* JADX INFO: renamed from: b */
    public boolean f206345b;

    public zwf(FacebookSignUpProfileImageAct facebookSignUpProfileImageAct) {
        super(facebookSignUpProfileImageAct);
    }

    /* JADX INFO: renamed from: H0 */
    private void m221874H0() {
        Intent intentNewMainActClearStack = AccountModule.m29131H().newMainActClearStack(m221894o0(), true, false);
        intentNewMainActClearStack.putExtra("from_sign_up", true);
        m221894o0().startActivity(intentNewMainActClearStack);
        m221894o0().m68056e2();
        bsj0.m106261S(m221894o0());
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m221883m0(l4g0 l4g0Var) {
        w1e.m204401e(l4g0Var);
        i4g0.m138523u("e_signup_photo_alert_continue_button", "p_imagepage_signup_photo_alert", jyb.m147494Y("signup_source", AccountModule.f16756c.m29326d1()), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, AccountModule.f16756c.m29324c1().phoneNumber));
    }

    /* JADX INFO: renamed from: q0 */
    private void m221885q0() {
        if (!hve0.m137321w() || lifecycle_() == C4470c.f16267i) {
            m221874H0();
        } else {
            this.f206345b = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m221886u0(Bundle bundle) {
        ((cxf) this.viewModel).m112979j(this.f206344a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m221887y0(C4470c c4470c) {
        m221874H0();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m221888A0(SignUpData signUpData, uxj0 uxj0Var) {
        if (TEnum.equals(signUpData.gender, "male")) {
            uqb0.m197269e1("signup_male_fb", new Object[0]);
        } else if (TEnum.equals(signUpData.gender, "female")) {
            uqb0.m197269e1("signup_female_fb", new Object[0]);
        }
        m221894o0().progressDismiss();
        m221885q0();
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m221889C0(Throwable th) {
        m221894o0().progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m221890D0(l4g0 l4g0Var) {
        w1e.m204401e(l4g0Var);
        i4g0.m138523u("e_signup_photo_alert_change_button", "p_imagepage_signup_photo_alert", jyb.m147494Y("signup_source", AccountModule.f16756c.m29326d1()), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, AccountModule.f16756c.m29324c1().phoneNumber));
        FacebookSignUpProfileImageAct facebookSignUpProfileImageActM221894o0 = m221894o0();
        SignUpData signUpData = this.f206344a;
        facebookSignUpProfileImageActM221894o0.pickImagesWithPickerInFloatLayerExp(1, false, false, true, signUpData == null ? null : signUpData.gender);
    }

    /* JADX INFO: renamed from: E0 */
    public void m221891E0() {
        m221894o0().progress(R$string.f16946j0);
        final SignUpData signUpData = this.f206344a;
        signUpData.appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(m221894o0());
        C4726a.m29249q2(signUpData, new Runnable() { // from class: l.twf
            @Override // java.lang.Runnable
            public final void run() {
                this.f176394a.m221900z0();
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.uwf
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181258a.m221888A0(signUpData, (uxj0) obj);
            }
        }, new y20() { // from class: l.vwf
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186132a.m221889C0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F0 */
    public void m221892F0() {
        m221894o0().pickImagesWithPicker(1, false, false, true);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m221893G0() {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_imagepage_signup_photo_alert", Dialog.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Oauth2AccessToken.KEY_PHONE_NUM, AccountModule.f16756c.m29324c1().phoneNumber);
            jSONObject.put("signup_source", AccountModule.f16756c.m29326d1());
            i6e.m138809a(jSONObject, "passive", "alert", "alert_system", "null", "edit_profile_page", "guide");
            l4g0VarM204399c.m152780o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        l4g0VarM204399c.m152780o(jSONObject);
        w1e.m204402f(l4g0VarM204399c);
        ((cxf) this.viewModel).act().dialog().m21502E0(R$string.f16800H3).m21499D(R$string.f16795G3).m21555t0(R$string.f16903c, new Runnable() { // from class: l.xwf
            @Override // java.lang.Runnable
            public final void run() {
                zwf.m221883m0(l4g0VarM204399c);
            }
        }).m21541l0(R$string.f16790F3, new Runnable() { // from class: l.ywf
            @Override // java.lang.Runnable
            public final void run() {
                this.f201825a.m221890D0(l4g0VarM204399c);
            }
        }).m21566z().show();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.pwf
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154399a.m221886u0((Bundle) obj);
            }
        });
        if (hve0.m137321w()) {
            lifecycle().filter(new qcj() { // from class: l.qwf
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f159886a.m221899x0((C4470c) obj);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.rwf
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f165132a.m221887y0((C4470c) obj);
                }
            }));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: o0 */
    public FacebookSignUpProfileImageAct m221894o0() {
        return (FacebookSignUpProfileImageAct) super.act();
    }

    /* JADX INFO: renamed from: p0 */
    public void m221895p0(Media media) {
        final String strM168038z = oki.m168038z(media.url);
        cxf cxfVar = (cxf) this.viewModel;
        this.f206344a.profilePath = strM168038z;
        cxfVar.m112980k(strM168038z);
        m221894o0().progress(R$string.f16946j0);
        l51.m152919y(new Runnable() { // from class: l.swf
            @Override // java.lang.Runnable
            public final void run() {
                this.f170940a.m221898t0(strM168038z);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public void m221896r0(SignUpData signUpData) {
        this.f206344a = signUpData;
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m221897s0(boolean z) {
        m221894o0().progressDismiss();
        if (z) {
            return;
        }
        m221893G0();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m221898t0(String str) {
        final boolean zM198197b = uuf.m198197b(str);
        l51.m152887G(new Runnable() { // from class: l.wwf
            @Override // java.lang.Runnable
            public final void run() {
                this.f191265a.m221897s0(zM198197b);
            }
        });
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ Boolean m221899x0(C4470c c4470c) {
        return Boolean.valueOf(this.f206345b && c4470c == C4470c.f16267i);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m221900z0() {
        m221894o0().hideInput();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
