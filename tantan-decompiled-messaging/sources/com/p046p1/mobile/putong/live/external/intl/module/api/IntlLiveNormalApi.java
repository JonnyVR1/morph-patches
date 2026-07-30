package com.p046p1.mobile.putong.live.external.intl.module.api;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonObject;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.external.intl.feedback.bean.IntlFeedbackPageData;
import com.p046p1.mobile.putong.live.external.intl.feedback.upload.C12539a;
import com.p046p1.mobile.putong.live.external.intl.module.api.IntlLiveNormalApi;
import com.p046p1.mobile.putong.live.external.module.api.LiveExternalApi;
import java.util.regex.Pattern;
import p133rx.C22306c;
import p149l.cll;
import p149l.e30;
import p149l.ffw;
import p149l.g7t;
import p149l.gld0;
import p149l.mt0;
import p149l.nj3;
import p149l.s9s;
import p149l.w9j;
import p149l.ytr;
import p149l.z6o;

/* JADX INFO: loaded from: classes13.dex */
public class IntlLiveNormalApi {
    private static final Pattern limitPattern = Pattern.compile("&limit=(\\d+)");

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m70217a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m70218b(BLiveEnvelope bLiveEnvelope) {
        gld0<nj3> gld0Var = gld0.f103312b;
        if (((nj3) s9s.m182763m(gld0Var)).f139184h.m221515e() == null) {
            ((nj3) s9s.m182763m(gld0Var)).f139184h.m132487l(bLiveEnvelope.data.monetizationConfig);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ z6o m70219c(BLiveEnvelope bLiveEnvelope) {
        z6o z6oVar = new z6o(bLiveEnvelope.data.suggestedLives, bLiveEnvelope.pagination);
        z6oVar.f201941d = bLiveEnvelope.data.bigTVLives;
        return z6oVar;
    }

    public static C22306c<BaseLiveListBean<C12539a>> fetchLiveQuestionTypes(String str) {
        cll.C16188a c16188aM107524p = LiveApiBuilder.m67315u(ytr.m216073b("/live/intl-feedback/question-types"), new mt0[0]).m107524p();
        c16188aM107524p.m107536c("liveType", str);
        return LiveExternalApi.buildLiveRead(c16188aM107524p.m107537d(), "fetchLiveQuestionTypes", g7t.m124728a(C12539a.class, "feedbackQuestionTypeList"));
    }

    public static C22306c<z6o> getLiveListV2(String str, String str2, @Nullable String str3, int i, String str4, boolean z, @Nullable String str5, boolean z2) {
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
        sb.append(cll.m107499l(ytr.m216073b(z2 ? "/feed/recommend/lives" : "/tiny/lives")).m107524p().m107536c(FirebaseAnalytics.Event.SEARCH, str).m107536c("source", str2).toString());
        sb.append(strReplaceAll);
        return LiveExternalApi.buildLiveReadReq(cll.m107499l(sb.toString()), "getLiveListV2" + str + str2 + strReplaceAll).map(new w9j() { // from class: l.gzn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlLiveNormalApi.m70219c((BLiveEnvelope) obj);
            }
        });
    }

    public static C22306c<z6o> getNextLiveListV2(String str, String str2, String str3, int i, Pagination pagination, String str4, boolean z) {
        return getLiveListV2(str, str2, str3, i, pagination.links.next, false, str4, z);
    }

    public static C22306c<IntlFeedbackPageData> reqFeedbackPageData() {
        return LiveExternalApi.buildLiveRead(LiveApiBuilder.m67315u(ytr.m216076e("/intl-customer/detail"), new mt0[0]), "reqFeedbackPageData", g7t.m124729b(IntlFeedbackPageData.class));
    }

    public static void requestBubble() {
        LiveExternalApi.buildLiveReadReq(cll.m107499l(ytr.m216073b("/intl-live-bubble-config")), "getIntlBubbleConfig").subscribe(ffw.m121194e(new e30() { // from class: l.hzn
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlLiveNormalApi.m70218b((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.izn
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlLiveNormalApi.m70217a((Throwable) obj);
            }
        }));
    }

    public static C22306c<BaseLiveBean> submitFeedback(String str, String str2, String str3, String str4, String str5, boolean z) {
        cll cllVarM107499l = cll.m107499l(ytr.m216073b("/live/intl-feedback/submit"));
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
        return LiveExternalApi.buildLivePost(cllVarM107499l, "submitFeedback", jsonObject.toString(), g7t.m124729b(BaseLiveListBean.class));
    }
}
