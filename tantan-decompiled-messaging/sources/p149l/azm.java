package p149l;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class azm {
    /* JADX INFO: renamed from: a */
    public static void m99715a(PushMessageCustom pushMessageCustom, String str, String str2) {
        zvf0.m220401w("e_live_innerpush_close", "p_live_inner_push", vwb.m200311Y("anchor_id", pushMessageCustom.userId), vwb.m200311Y("close_kind", str), vwb.m200311Y("live_id", pushMessageCustom.liveId), vwb.m200311Y("live_push_page_id", str2), vwb.m200311Y("push_text", pushMessageCustom.content));
    }

    /* JADX INFO: renamed from: b */
    public static void m99716b(PushMessageCustom pushMessageCustom, String str) {
        zvf0.m220399u("e_live_room_enter", "p_live_inner_push", vwb.m200311Y("liveId", pushMessageCustom.liveId), vwb.m200311Y("anchorId", pushMessageCustom.userId), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, "NA"), vwb.m200311Y("show_label", ""), vwb.m200311Y("module", OMSTemplateModeType.page), vwb.m200311Y("right_recommend_type", ""), vwb.m200311Y("live_status", "on"), vwb.m200311Y("live_push_page_id", str), vwb.m200311Y("liveRecommendCategory", TextUtils.isEmpty(pushMessageCustom.category) ? "NA" : pushMessageCustom.category));
    }

    /* JADX INFO: renamed from: c */
    public static void m99717c(PushMessageCustom pushMessageCustom, String str) {
        zvf0.m220368A("e_live_room_enter", "p_live_inner_push", vwb.m200311Y(FirebaseAnalytics.Param.INDEX, "NA"), vwb.m200311Y("module", OMSTemplateModeType.page), vwb.m200311Y("liveId", pushMessageCustom.liveId), vwb.m200311Y("anchorId", pushMessageCustom.userId), vwb.m200311Y("trace_id", ""), vwb.m200311Y("show_label", ""), vwb.m200311Y("liveRecommendCategory", TextUtils.isEmpty(pushMessageCustom.category) ? "NA" : pushMessageCustom.category), vwb.m200311Y("live_status", "on"), vwb.m200311Y("live_push_page_id", str), vwb.m200311Y("right_recommend_type", ""));
    }

    /* JADX INFO: renamed from: d */
    public static void m99718d(PushMessage pushMessage, String str) {
        String string = pushMessage.messageCustom.category;
        try {
            string = new JSONObject(pushMessage.messageCustom.extra).getString(FirebaseAnalytics.Event.SEARCH);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        zvf0.m220399u("e_live_inner_push", str, vwb.m200311Y("push_category", string), vwb.m200311Y("push_id", pushMessage.messageCustom.traceId));
    }

    /* JADX INFO: renamed from: e */
    public static void m99719e(PushMessage pushMessage, String str) {
        String string = pushMessage.messageCustom.category;
        try {
            string = new JSONObject(pushMessage.messageCustom.extra).getString(FirebaseAnalytics.Event.SEARCH);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        zvf0.m220368A("e_live_inner_push", str, vwb.m200311Y("push_category", string), vwb.m200311Y("push_id", pushMessage.messageCustom.traceId));
    }

    /* JADX INFO: renamed from: f */
    public static void m99720f(String str, String str2) {
        zvf0.m220399u("e_live_room_enter", "p_live_inner_push", vwb.m200311Y("liveId", str), vwb.m200311Y("push_id", str2), vwb.m200311Y("liveRecommendCategory", "official_channel"));
        zvf0.m220368A("e_live_room_enter", "p_live_inner_push", vwb.m200311Y("liveId", str), vwb.m200311Y("push_id", str2), vwb.m200311Y("liveRecommendCategory", "official_channel"));
    }
}
