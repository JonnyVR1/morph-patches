package com.p046p1.mobile.putong.p065ui.jsbridge.implement;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.data.Captcha;
import com.p046p1.mobile.putong.data.ChatAppealCheckData;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.SliderVerifyData;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.SliderBridgeImplementation;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import p149l.boq;
import p149l.e30;
import p149l.e51;
import p149l.ef2;
import p149l.liq;
import p149l.mkd0;
import p149l.qib0;
import p149l.vjf0;
import p149l.vwb;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class SliderBridgeImplementation extends ef2 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m79811e(Envelope envelope) {
        if (NullChecker.m81303a(envelope.data.getModuleData(CommonData.class)) && TextUtils.equals(((CommonData) envelope.data.getModuleData(CommonData.class)).stage, "ready")) {
            qib0.f154713b0.f139231b.mo30763fp();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m79812f(String str, String str2, String str3, String str4, String str5, boq boqVar) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5)) {
            boqVar.mo102961c().m66873d2();
            return;
        }
        Captcha captchaNew_ = Captcha.new_();
        captchaNew_.genTime = str3;
        captchaNew_.captchaID = str;
        captchaNew_.lotNumber = str4;
        captchaNew_.passToken = str5;
        captchaNew_.captchaOutput = str2;
        vjf0.m198623e().f181687b.m132487l(captchaNew_);
        boqVar.mo102961c().m66873d2();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m79813g(Throwable th) {
    }

    @liq(key = "clearClientSliderCache")
    public void clearClientSliderCache(@NonNull boq boqVar) {
        e51.m114742G(new Runnable() { // from class: l.pjf0
            @Override // java.lang.Runnable
            public final void run() {
                vjf0.m198623e().m198643v(null);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m79814h(@NonNull boq boqVar, ChatAppealCheckData chatAppealCheckData) {
        qib0.f154699N.userAppealCheck(chatAppealCheckData).subscribe(mkd0.m154956H(new e30() { // from class: l.sjf0
            @Override // p149l.e30
            public final void call(Object obj) {
                SliderBridgeImplementation.m79811e((Envelope) obj);
            }
        }, new e30() { // from class: l.tjf0
            @Override // p149l.e30
            public final void call(Object obj) {
                SliderBridgeImplementation.m79813g((Throwable) obj);
            }
        }));
    }

    @liq(key = "setJiYanVerificationResult")
    public void setJiYanVerificationResult(@NonNull final boq boqVar, final String str, final String str2, final String str3, final String str4, final String str5) {
        e51.m114748M(new Runnable() { // from class: l.rjf0
            @Override // java.lang.Runnable
            public final void run() {
                SliderBridgeImplementation.m79812f(str, str2, str3, str4, str5, boqVar);
            }
        });
    }

    @liq(key = "setSliderVerificationResult")
    public void setSliderVerificationResult(@NonNull boq boqVar, boolean z, String str, String str2, String str3, int i) {
        SliderVerifyData sliderVerifyDataNew_ = SliderVerifyData.new_();
        sliderVerifyDataNew_.verifyResult = z ? StateEvent.ActionValue.STAGE_PASS : "reject";
        sliderVerifyDataNew_.token = z ? str : "";
        zvf0.m220371D("e_captcha_popup_finish", TextUtils.equals(vjf0.m198623e().m198632j(), "accountGetBackType") ? "p_bind_to_new_phone" : "p_captcha_popup", vwb.m200311Y("captcha_supplier", vjf0.m198625l(i)), vwb.m200311Y("captcha_popup_type", "slide"), vwb.m200311Y("captcha_result_code", z ? "success" : str2), vwb.m200311Y("captcha_popup_token", str3), vwb.m200311Y("captcha_page_type", "other"), vwb.m200311Y("captcha_popup_sence", ""));
        sliderVerifyDataNew_.supplier = i;
        sliderVerifyDataNew_.uuid = str3;
        if (!TextUtils.equals(vjf0.m198623e().m198632j(), "accountGetBackType")) {
            qib0.f154699N.verifyContent(sliderVerifyDataNew_);
        } else {
            sliderVerifyDataNew_.validate = z ? str : "";
            vjf0.m198623e().f181692g.put(sliderVerifyDataNew_.toJson());
        }
    }

    @liq(key = "setSliderVerificationResultByType")
    public void setSliderVerificationResultByType(@NonNull boq boqVar, boolean z, String str, String str2, String str3, int i, String str4) {
        SliderVerifyData sliderVerifyDataNew_ = SliderVerifyData.new_();
        sliderVerifyDataNew_.verifyResult = z ? StateEvent.ActionValue.STAGE_PASS : "reject";
        sliderVerifyDataNew_.token = z ? str : "";
        sliderVerifyDataNew_.supplier = i;
        sliderVerifyDataNew_.uuid = str3;
        sliderVerifyDataNew_.validate = z ? str : "";
        zvf0.m220371D("e_captcha_popup_finish", TextUtils.equals(vjf0.m198623e().m198632j(), "accountGetBackType") ? "p_bind_to_new_phone" : "p_captcha_popup", vwb.m200311Y("captcha_supplier", vjf0.m198625l(i)), vwb.m200311Y("captcha_popup_type", "slide"), vwb.m200311Y("captcha_result_code", z ? "success" : str2), vwb.m200311Y("captcha_popup_token", str3), vwb.m200311Y("captcha_page_type", "other"), vwb.m200311Y("captcha_popup_sence", str4));
        vjf0.m198623e().f181686a.m132487l(sliderVerifyDataNew_.toJson());
        if (!TextUtils.equals("forbid_chat_appeal", str4)) {
            if (TextUtils.equals(vjf0.m198623e().m198632j(), "accountGetBackType")) {
                vjf0.m198623e().f181692g.put(sliderVerifyDataNew_.toJson());
                return;
            } else {
                qib0.f154699N.verifyContent(sliderVerifyDataNew_);
                return;
            }
        }
        if (z) {
            ChatAppealCheckData chatAppealCheckDataNew_ = ChatAppealCheckData.new_();
            chatAppealCheckDataNew_.uuid = str3;
            chatAppealCheckDataNew_.appeal_type = "jailed";
            chatAppealCheckDataNew_.ticketId = vjf0.m198623e().m198628d();
            chatAppealCheckDataNew_.token = str;
            m79814h(boqVar, chatAppealCheckDataNew_);
        }
    }

    @liq(key = "sliderLoadSuccess")
    public void sliderLoadSuccess(@NonNull boq boqVar) {
        e51.m114742G(new Runnable() { // from class: l.qjf0
            @Override // java.lang.Runnable
            public final void run() {
                vjf0.m198623e().m198638q(false);
            }
        });
    }
}
