package p006l;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.appsflyer.AppsFlyerLib;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.api.C0001a;
import com.p000p1.mobile.putong.account.p002ui.accountnew.facebook.FacebookSignUpProfileImageAct;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import l.ane0;
import l.cwf0;
import l.e30;
import l.e51;
import l.gtf;
import l.i0e;
import l.j760;
import l.jq2;
import l.mkd0;
import l.rhi;
import l.roj0;
import l.u4e;
import l.vwb;
import l.w9j;
import l.yij0;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class lvf extends jq2<ovf> {

    /* JADX INFO: renamed from: a */
    public SignUpData f16674a;

    /* JADX INFO: renamed from: b */
    public boolean f16675b;

    public lvf(FacebookSignUpProfileImageAct facebookSignUpProfileImageAct) {
        super(facebookSignUpProfileImageAct);
    }

    /* JADX INFO: renamed from: H0 */
    private void m19048H0() {
        Intent intentNewMainActClearStack = AccountModule.m27H().newMainActClearStack(m19069o0(), true, false);
        intentNewMainActClearStack.putExtra("from_sign_up", true);
        m19069o0().startActivity(intentNewMainActClearStack);
        m19069o0().finish();
        yij0.S(m19069o0());
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m19057m0(cwf0 cwf0Var) {
        i0e.e(cwf0Var);
        zvf0.u("e_signup_photo_alert_continue_button", "p_imagepage_signup_photo_alert", new j760[]{vwb.Y("signup_source", AccountModule.f26c.m222d1()), vwb.Y("phone_num", AccountModule.f26c.m220c1().phoneNumber)});
    }

    /* JADX INFO: renamed from: q0 */
    private void m19059q0() {
        if (!ane0.w() || lifecycle_() == c.i) {
            m19048H0();
        } else {
            this.f16675b = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m19060u0(Bundle bundle) {
        ((ovf) ((jq2) this).viewModel).m20841j(this.f16674a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m19061y0(c cVar) {
        m19048H0();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m19062A0(SignUpData signUpData, roj0 roj0Var) {
        if (TEnum.equals(signUpData.gender, "male")) {
            qib0.m22159e1("signup_male_fb", new Object[0]);
        } else if (TEnum.equals(signUpData.gender, "female")) {
            qib0.m22159e1("signup_female_fb", new Object[0]);
        }
        m19069o0().progressDismiss();
        m19059q0();
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m19063C0(Throwable th) {
        m19069o0().progressDismiss();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m19064D0(cwf0 cwf0Var) {
        i0e.e(cwf0Var);
        zvf0.u("e_signup_photo_alert_change_button", "p_imagepage_signup_photo_alert", new j760[]{vwb.Y("signup_source", AccountModule.f26c.m222d1()), vwb.Y("phone_num", AccountModule.f26c.m220c1().phoneNumber)});
        FacebookSignUpProfileImageAct facebookSignUpProfileImageActM19069o0 = m19069o0();
        SignUpData signUpData = this.f16674a;
        facebookSignUpProfileImageActM19069o0.pickImagesWithPickerInFloatLayerExp(1, false, false, true, signUpData == null ? null : signUpData.gender);
    }

    /* JADX INFO: renamed from: E0 */
    public void m19065E0() {
        m19069o0().progress(R$string.f216j0);
        final SignUpData signUpData = this.f16674a;
        signUpData.appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(m19069o0());
        C0001a.m145q2(signUpData, new Runnable() { // from class: l.fvf
            @Override // java.lang.Runnable
            public final void run() {
                this.f12936a.m19075z0();
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.gvf
            public final void call(Object obj) {
                this.f13532a.m19062A0(signUpData, (roj0) obj);
            }
        }, new e30() { // from class: l.hvf
            public final void call(Object obj) {
                this.f14100a.m19063C0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F0 */
    public void m19066F0() {
        m19069o0().pickImagesWithPicker(1, false, false, true);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m19067G0() {
        final cwf0 cwf0VarC = i0e.c("p_imagepage_signup_photo_alert", Dialog.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("phone_num", AccountModule.f26c.m220c1().phoneNumber);
            jSONObject.put("signup_source", AccountModule.f26c.m222d1());
            u4e.a(jSONObject, "passive", "alert", "alert_system", "null", "edit_profile_page", "guide");
            cwf0VarC.o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        cwf0VarC.o(jSONObject);
        i0e.f(cwf0VarC);
        ((ovf) ((jq2) this).viewModel).act().dialog().E0(R$string.f70H3).D(R$string.f65G3).t0(R$string.f173c, new Runnable() { // from class: l.jvf
            @Override // java.lang.Runnable
            public final void run() {
                lvf.m19057m0(cwf0VarC);
            }
        }).l0(R$string.f60F3, new Runnable() { // from class: l.kvf
            @Override // java.lang.Runnable
            public final void run() {
                this.f16008a.m19064D0(cwf0VarC);
            }
        }).z().show();
    }

    /* JADX INFO: renamed from: a0 */
    public void m19068a0() {
        super.a0();
        creates(new e30() { // from class: l.bvf
            public final void call(Object obj) {
                this.f9107a.m19060u0((Bundle) obj);
            }
        });
        if (ane0.w()) {
            lifecycle().filter(new w9j() { // from class: l.cvf
                public final Object call(Object obj) {
                    return this.f9876a.m19074x0((c) obj);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.dvf
                public final void call(Object obj) {
                    this.f10614a.m19061y0((c) obj);
                }
            }));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: o0 */
    public FacebookSignUpProfileImageAct m19069o0() {
        return (FacebookSignUpProfileImageAct) super.act();
    }

    /* JADX INFO: renamed from: p0 */
    public void m19070p0(Media media) {
        final String strZ = rhi.z(media.url);
        ovf ovfVar = (ovf) ((jq2) this).viewModel;
        this.f16674a.profilePath = strZ;
        ovfVar.m20842k(strZ);
        m19069o0().progress(R$string.f216j0);
        e51.y(new Runnable() { // from class: l.evf
            @Override // java.lang.Runnable
            public final void run() {
                this.f11461a.m19073t0(strZ);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public void m19071r0(SignUpData signUpData) {
        this.f16674a = signUpData;
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m19072s0(boolean z) {
        m19069o0().progressDismiss();
        if (z) {
            return;
        }
        m19067G0();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m19073t0(String str) {
        final boolean zB = gtf.b(str);
        e51.G(new Runnable() { // from class: l.ivf
            @Override // java.lang.Runnable
            public final void run() {
                this.f14841a.m19072s0(zB);
            }
        });
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ Boolean m19074x0(c cVar) {
        return Boolean.valueOf(this.f16675b && cVar == c.i);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m19075z0() {
        m19069o0().hideInput();
    }

    public void destroy() {
    }
}
