package com.p000p1.mobile.putong.p004ui.jsbridge.implement;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.SliderBridgeImplementation;
import com.p1.mobile.putong.data.Captcha;
import com.p1.mobile.putong.data.ChatAppealCheckData;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.SliderVerifyData;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.e51;
import l.j760;
import l.mkd0;
import l.qib0;
import l.vwb;
import l.zvf0;
import p009l.boq;
import p009l.ef2;
import p009l.liq;
import p009l.vjf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class SliderBridgeImplementation extends ef2 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m10134e(Envelope envelope) {
        if (NullChecker.a(envelope.data.getModuleData(CommonData.class)) && TextUtils.equals(envelope.data.getModuleData(CommonData.class).stage, "ready")) {
            qib0.b0.b.fp();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m10135f(String str, String str2, String str3, String str4, String str5, boq boqVar) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5)) {
            boqVar.mo12184c().finish();
            return;
        }
        Captcha captchaNew_ = Captcha.new_();
        captchaNew_.genTime = str3;
        captchaNew_.captchaID = str;
        captchaNew_.lotNumber = str4;
        captchaNew_.passToken = str5;
        captchaNew_.captchaOutput = str2;
        vjf0.m23406e().f21608b.onNext(captchaNew_);
        boqVar.mo12184c().finish();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m10136g(Throwable th) {
    }

    @liq(key = "clearClientSliderCache")
    public void clearClientSliderCache(@NonNull boq boqVar) {
        e51.G(new Runnable() { // from class: l.pjf0
            @Override // java.lang.Runnable
            public final void run() {
                vjf0.m23406e().m23426v(null);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m10137h(@NonNull boq boqVar, ChatAppealCheckData chatAppealCheckData) {
        qib0.N.userAppealCheck(chatAppealCheckData).subscribe(mkd0.H(new e30() { // from class: l.sjf0
            public final void call(Object obj) {
                SliderBridgeImplementation.m10134e((Envelope) obj);
            }
        }, new e30() { // from class: l.tjf0
            public final void call(Object obj) {
                SliderBridgeImplementation.m10136g((Throwable) obj);
            }
        }));
    }

    @liq(key = "setJiYanVerificationResult")
    public void setJiYanVerificationResult(@NonNull final boq boqVar, final String str, final String str2, final String str3, final String str4, final String str5) {
        e51.M(new Runnable() { // from class: l.rjf0
            @Override // java.lang.Runnable
            public final void run() {
                SliderBridgeImplementation.m10135f(str, str2, str3, str4, str5, boqVar);
            }
        });
    }

    @liq(key = "setSliderVerificationResult")
    public void setSliderVerificationResult(@NonNull boq boqVar, boolean z, String str, String str2, String str3, int i) {
        SliderVerifyData sliderVerifyDataNew_ = SliderVerifyData.new_();
        sliderVerifyDataNew_.verifyResult = z ? "pass" : "reject";
        sliderVerifyDataNew_.token = z ? str : "";
        zvf0.D("e_captcha_popup_finish", TextUtils.equals(vjf0.m23406e().m23415j(), "accountGetBackType") ? "p_bind_to_new_phone" : "p_captcha_popup", new j760[]{vwb.Y("captcha_supplier", vjf0.m23408l(i)), vwb.Y("captcha_popup_type", "slide"), vwb.Y("captcha_result_code", z ? "success" : str2), vwb.Y("captcha_popup_token", str3), vwb.Y("captcha_page_type", "other"), vwb.Y("captcha_popup_sence", "")});
        sliderVerifyDataNew_.supplier = i;
        sliderVerifyDataNew_.uuid = str3;
        if (!TextUtils.equals(vjf0.m23406e().m23415j(), "accountGetBackType")) {
            qib0.N.verifyContent(sliderVerifyDataNew_);
        } else {
            sliderVerifyDataNew_.validate = z ? str : "";
            vjf0.m23406e().f21613g.put(sliderVerifyDataNew_.toJson());
        }
    }

    @liq(key = "setSliderVerificationResultByType")
    public void setSliderVerificationResultByType(@NonNull boq boqVar, boolean z, String str, String str2, String str3, int i, String str4) {
        SliderVerifyData sliderVerifyDataNew_ = SliderVerifyData.new_();
        sliderVerifyDataNew_.verifyResult = z ? "pass" : "reject";
        sliderVerifyDataNew_.token = z ? str : "";
        sliderVerifyDataNew_.supplier = i;
        sliderVerifyDataNew_.uuid = str3;
        sliderVerifyDataNew_.validate = z ? str : "";
        zvf0.D("e_captcha_popup_finish", TextUtils.equals(vjf0.m23406e().m23415j(), "accountGetBackType") ? "p_bind_to_new_phone" : "p_captcha_popup", new j760[]{vwb.Y("captcha_supplier", vjf0.m23408l(i)), vwb.Y("captcha_popup_type", "slide"), vwb.Y("captcha_result_code", z ? "success" : str2), vwb.Y("captcha_popup_token", str3), vwb.Y("captcha_page_type", "other"), vwb.Y("captcha_popup_sence", str4)});
        vjf0.m23406e().f21607a.onNext(sliderVerifyDataNew_.toJson());
        if (!TextUtils.equals("forbid_chat_appeal", str4)) {
            if (TextUtils.equals(vjf0.m23406e().m23415j(), "accountGetBackType")) {
                vjf0.m23406e().f21613g.put(sliderVerifyDataNew_.toJson());
                return;
            } else {
                qib0.N.verifyContent(sliderVerifyDataNew_);
                return;
            }
        }
        if (z) {
            ChatAppealCheckData chatAppealCheckDataNew_ = ChatAppealCheckData.new_();
            chatAppealCheckDataNew_.uuid = str3;
            chatAppealCheckDataNew_.appeal_type = "jailed";
            chatAppealCheckDataNew_.ticketId = vjf0.m23406e().m23411d();
            chatAppealCheckDataNew_.token = str;
            m10137h(boqVar, chatAppealCheckDataNew_);
        }
    }

    @liq(key = "sliderLoadSuccess")
    public void sliderLoadSuccess(@NonNull boq boqVar) {
        e51.G(new Runnable() { // from class: l.qjf0
            @Override // java.lang.Runnable
            public final void run() {
                vjf0.m23406e().m23421q(false);
            }
        });
    }
}
