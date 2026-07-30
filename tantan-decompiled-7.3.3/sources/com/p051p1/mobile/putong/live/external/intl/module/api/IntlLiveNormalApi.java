package com.p051p1.mobile.putong.live.external.intl.module.api;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonObject;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.external.intl.feedback.bean.IntlFeedbackPageData;
import com.p051p1.mobile.putong.live.external.intl.feedback.upload.C12702a;
import com.p051p1.mobile.putong.live.external.intl.module.api.IntlLiveNormalApi;
import com.p051p1.mobile.putong.live.external.module.api.LiveExternalApi;
import java.util.regex.Pattern;
import p137rx.C22421c;
import p153l.dhw;
import p153l.fk3;
import p153l.h9t;
import p153l.itd0;
import p153l.qcj;
import p153l.rnl;
import p153l.st0;
import p153l.tbs;
import p153l.y20;
import p153l.z8o;
import p153l.zvr;

/* JADX INFO: loaded from: classes9.dex */
public class IntlLiveNormalApi {
    private static final Pattern limitPattern = Pattern.compile("&limit=(\\d+)");

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m71400a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m71401b(BLiveEnvelope bLiveEnvelope) {
        itd0<fk3> itd0Var = itd0.f116820b;
        if (((fk3) tbs.m190077m(itd0Var)).f99457h.m222761e() == null) {
            ((fk3) tbs.m190077m(itd0Var)).f99457h.m137019l(bLiveEnvelope.data.monetizationConfig);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ z8o m71402c(BLiveEnvelope bLiveEnvelope) {
        z8o z8oVar = new z8o(bLiveEnvelope.data.suggestedLives, bLiveEnvelope.pagination);
        z8oVar.f203406d = bLiveEnvelope.data.bigTVLives;
        return z8oVar;
    }

    public static C22421c<BaseLiveListBean<C12702a>> fetchLiveQuestionTypes(String str) {
        rnl.C19886a c19886aM182288p = LiveApiBuilder.m68498u(zvr.m221802b("/live/intl-feedback/question-types"), new st0[0]).m182288p();
        c19886aM182288p.m182300c("liveType", str);
        return LiveExternalApi.buildLiveRead(c19886aM182288p.m182301d(), "fetchLiveQuestionTypes", h9t.m134084a(C12702a.class, "feedbackQuestionTypeList"));
    }

    public static C22421c<z8o> getLiveListV2(String str, String str2, @Nullable String str3, int i, String str4, boolean z, @Nullable String str5, boolean z2) {
        String strReplaceAll;
        if (TextUtils.isEmpty(str3)) {
            strReplaceAll = "";
        } else {
            strReplaceAll = "&action=" + str3;
        }
        if (!TextUtils.isEmpty(str4)) {
            strReplaceAll = strReplaceAll + "&" + str4;
        }
        if (i >= 0) {
            if (strReplaceAll.contains("&limit=")) {
                strReplaceAll = limitPattern.matcher(strReplaceAll).replaceAll("&limit=" + i);
            } else {
                strReplaceAll = strReplaceAll + "&limit=" + i;
            }
        }
        if (z) {
            strReplaceAll = strReplaceAll + "&expand=true";
        }
        if (!TextUtils.isEmpty(str5)) {
            strReplaceAll = strReplaceAll + "&" + str5;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(rnl.m182263l(zvr.m221802b(z2 ? "/feed/recommend/lives" : "/tiny/lives")).m182288p().m182300c(FirebaseAnalytics.Event.SEARCH, str).m182300c("source", str2).toString());
        sb.append(strReplaceAll);
        return LiveExternalApi.buildLiveReadReq(rnl.m182263l(sb.toString()), "getLiveListV2" + str + str2 + strReplaceAll).map(new qcj() { // from class: l.g1o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlLiveNormalApi.m71402c((BLiveEnvelope) obj);
            }
        });
    }

    public static C22421c<z8o> getNextLiveListV2(String str, String str2, String str3, int i, Pagination pagination, String str4, boolean z) {
        return getLiveListV2(str, str2, str3, i, pagination.links.next, false, str4, z);
    }

    public static C22421c<IntlFeedbackPageData> reqFeedbackPageData() {
        return LiveExternalApi.buildLiveRead(LiveApiBuilder.m68498u(zvr.m221805e("/intl-customer/detail"), new st0[0]), "reqFeedbackPageData", h9t.m134085b(IntlFeedbackPageData.class));
    }

    public static void requestBubble() {
        LiveExternalApi.buildLiveReadReq(rnl.m182263l(zvr.m221802b("/intl-live-bubble-config")), "getIntlBubbleConfig").subscribe(dhw.m115826e(new y20() { // from class: l.h1o
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlLiveNormalApi.m71401b((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.i1o
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlLiveNormalApi.m71400a((Throwable) obj);
            }
        }));
    }

    public static C22421c<BaseLiveBean> submitFeedback(String str, String str2, String str3, String str4, String str5, boolean z) {
        rnl rnlVarM182263l = rnl.m182263l(zvr.m221802b("/live/intl-feedback/submit"));
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("liveType", str);
        jsonObject.addProperty("questionType", str2);
        jsonObject.addProperty("content", str3);
        if (!TextUtils.isEmpty(str4)) {
            jsonObject.addProperty("picture", str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            jsonObject.addProperty("contacts", str5);
        }
        jsonObject.addProperty("isLog", Boolean.valueOf(z));
        return LiveExternalApi.buildLivePost(rnlVarM182263l, "submitFeedback", jsonObject.toString(), h9t.m134085b(BaseLiveListBean.class));
    }
}
