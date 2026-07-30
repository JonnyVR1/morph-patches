package com.p051p1.mobile.putong.p070ui.jsbridge.implement;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.data.Captcha;
import com.p051p1.mobile.putong.data.ChatAppealCheckData;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.SliderVerifyData;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.SliderBridgeImplementation;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import p153l.aqq;
import p153l.esf0;
import p153l.i4g0;
import p153l.jyb;
import p153l.l51;
import p153l.lf2;
import p153l.lkq;
import p153l.psd0;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes10.dex */
public class SliderBridgeImplementation extends lf2 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m80994e(Envelope envelope) {
        if (NullChecker.m82486a(envelope.data.getModuleData(CommonData.class)) && TextUtils.equals(((CommonData) envelope.data.getModuleData(CommonData.class)).stage, "ready")) {
            uqb0.f180396b0.f170325b.mo31766fp();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m80995f(String str, String str2, String str3, String str4, String str5, aqq aqqVar) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5)) {
            aqqVar.mo99543c().m68056e2();
            return;
        }
        Captcha captchaNew_ = Captcha.new_();
        captchaNew_.genTime = str3;
        captchaNew_.captchaID = str;
        captchaNew_.lotNumber = str4;
        captchaNew_.passToken = str5;
        captchaNew_.captchaOutput = str2;
        esf0.m122324e().f95596b.m137019l(captchaNew_);
        aqqVar.mo99543c().m68056e2();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m80996g(Throwable th) {
    }

    @lkq(key = "clearClientSliderCache")
    public void clearClientSliderCache(@NonNull aqq aqqVar) {
        l51.m152887G(new Runnable() { // from class: l.yrf0
            @Override // java.lang.Runnable
            public final void run() {
                esf0.m122324e().m122344v(null);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m80997h(@NonNull aqq aqqVar, ChatAppealCheckData chatAppealCheckData) {
        uqb0.f180382N.userAppealCheck(chatAppealCheckData).subscribe(psd0.m173597H(new y20() { // from class: l.bsf0
            @Override // p153l.y20
            public final void call(Object obj) {
                SliderBridgeImplementation.m80994e((Envelope) obj);
            }
        }, new y20() { // from class: l.csf0
            @Override // p153l.y20
            public final void call(Object obj) {
                SliderBridgeImplementation.m80996g((Throwable) obj);
            }
        }));
    }

    @lkq(key = "setJiYanVerificationResult")
    public void setJiYanVerificationResult(@NonNull final aqq aqqVar, final String str, final String str2, final String str3, final String str4, final String str5) {
        l51.m152893M(new Runnable() { // from class: l.asf0
            @Override // java.lang.Runnable
            public final void run() {
                SliderBridgeImplementation.m80995f(str, str2, str3, str4, str5, aqqVar);
            }
        });
    }

    @lkq(key = "setSliderVerificationResult")
    public void setSliderVerificationResult(@NonNull aqq aqqVar, boolean z, String str, String str2, String str3, int i) {
        SliderVerifyData sliderVerifyDataNew_ = SliderVerifyData.new_();
        sliderVerifyDataNew_.verifyResult = z ? StateEvent.ActionValue.STAGE_PASS : "reject";
        sliderVerifyDataNew_.token = z ? str : "";
        i4g0.m138495D("e_captcha_popup_finish", TextUtils.equals(esf0.m122324e().m122333j(), "accountGetBackType") ? "p_bind_to_new_phone" : "p_captcha_popup", jyb.m147494Y("captcha_supplier", esf0.m122326l(i)), jyb.m147494Y("captcha_popup_type", "slide"), jyb.m147494Y("captcha_result_code", z ? "success" : str2), jyb.m147494Y("captcha_popup_token", str3), jyb.m147494Y("captcha_page_type", "other"), jyb.m147494Y("captcha_popup_sence", ""));
        sliderVerifyDataNew_.supplier = i;
        sliderVerifyDataNew_.uuid = str3;
        if (!TextUtils.equals(esf0.m122324e().m122333j(), "accountGetBackType")) {
            uqb0.f180382N.verifyContent(sliderVerifyDataNew_);
        } else {
            sliderVerifyDataNew_.validate = z ? str : "";
            esf0.m122324e().f95601g.put(sliderVerifyDataNew_.toJson());
        }
    }

    @lkq(key = "setSliderVerificationResultByType")
    public void setSliderVerificationResultByType(@NonNull aqq aqqVar, boolean z, String str, String str2, String str3, int i, String str4) {
        SliderVerifyData sliderVerifyDataNew_ = SliderVerifyData.new_();
        sliderVerifyDataNew_.verifyResult = z ? StateEvent.ActionValue.STAGE_PASS : "reject";
        sliderVerifyDataNew_.token = z ? str : "";
        sliderVerifyDataNew_.supplier = i;
        sliderVerifyDataNew_.uuid = str3;
        sliderVerifyDataNew_.validate = z ? str : "";
        i4g0.m138495D("e_captcha_popup_finish", TextUtils.equals(esf0.m122324e().m122333j(), "accountGetBackType") ? "p_bind_to_new_phone" : "p_captcha_popup", jyb.m147494Y("captcha_supplier", esf0.m122326l(i)), jyb.m147494Y("captcha_popup_type", "slide"), jyb.m147494Y("captcha_result_code", z ? "success" : str2), jyb.m147494Y("captcha_popup_token", str3), jyb.m147494Y("captcha_page_type", "other"), jyb.m147494Y("captcha_popup_sence", str4));
        esf0.m122324e().f95595a.m137019l(sliderVerifyDataNew_.toJson());
        if (!TextUtils.equals("forbid_chat_appeal", str4)) {
            if (TextUtils.equals(esf0.m122324e().m122333j(), "accountGetBackType")) {
                esf0.m122324e().f95601g.put(sliderVerifyDataNew_.toJson());
                return;
            } else {
                uqb0.f180382N.verifyContent(sliderVerifyDataNew_);
                return;
            }
        }
        if (z) {
            ChatAppealCheckData chatAppealCheckDataNew_ = ChatAppealCheckData.new_();
            chatAppealCheckDataNew_.uuid = str3;
            chatAppealCheckDataNew_.appeal_type = "jailed";
            chatAppealCheckDataNew_.ticketId = esf0.m122324e().m122329d();
            chatAppealCheckDataNew_.token = str;
            m80997h(aqqVar, chatAppealCheckDataNew_);
        }
    }

    @lkq(key = "sliderLoadSuccess")
    public void sliderLoadSuccess(@NonNull aqq aqqVar) {
        l51.m152887G(new Runnable() { // from class: l.zrf0
            @Override // java.lang.Runnable
            public final void run() {
                esf0.m122324e().m122339q(false);
            }
        });
    }
}
