package p153l;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class a1n {
    /* JADX INFO: renamed from: a */
    public static void m95518a(PushMessageCustom pushMessageCustom, String str, String str2) {
        i4g0.m138525w("e_live_innerpush_close", "p_live_inner_push", jyb.m147494Y("anchor_id", pushMessageCustom.userId), jyb.m147494Y("close_kind", str), jyb.m147494Y("live_id", pushMessageCustom.liveId), jyb.m147494Y("live_push_page_id", str2), jyb.m147494Y("push_text", pushMessageCustom.content));
    }

    /* JADX INFO: renamed from: b */
    public static void m95519b(PushMessageCustom pushMessageCustom, String str) {
        i4g0.m138523u("e_live_room_enter", "p_live_inner_push", jyb.m147494Y("liveId", pushMessageCustom.liveId), jyb.m147494Y("anchorId", pushMessageCustom.userId), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, "NA"), jyb.m147494Y("show_label", ""), jyb.m147494Y("module", OMSTemplateModeType.page), jyb.m147494Y("right_recommend_type", ""), jyb.m147494Y("live_status", "on"), jyb.m147494Y("live_push_page_id", str), jyb.m147494Y("liveRecommendCategory", TextUtils.isEmpty(pushMessageCustom.category) ? "NA" : pushMessageCustom.category));
    }

    /* JADX INFO: renamed from: c */
    public static void m95520c(PushMessageCustom pushMessageCustom, String str) {
        i4g0.m138492A("e_live_room_enter", "p_live_inner_push", jyb.m147494Y(FirebaseAnalytics.Param.INDEX, "NA"), jyb.m147494Y("module", OMSTemplateModeType.page), jyb.m147494Y("liveId", pushMessageCustom.liveId), jyb.m147494Y("anchorId", pushMessageCustom.userId), jyb.m147494Y("trace_id", ""), jyb.m147494Y("show_label", ""), jyb.m147494Y("liveRecommendCategory", TextUtils.isEmpty(pushMessageCustom.category) ? "NA" : pushMessageCustom.category), jyb.m147494Y("live_status", "on"), jyb.m147494Y("live_push_page_id", str), jyb.m147494Y("right_recommend_type", ""));
    }

    /* JADX INFO: renamed from: d */
    public static void m95521d(PushMessage pushMessage, String str) {
        String string = pushMessage.messageCustom.category;
        try {
            string = new JSONObject(pushMessage.messageCustom.extra).getString(FirebaseAnalytics.Event.SEARCH);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        i4g0.m138523u("e_live_inner_push", str, jyb.m147494Y("push_category", string), jyb.m147494Y("push_id", pushMessage.messageCustom.traceId));
    }

    /* JADX INFO: renamed from: e */
    public static void m95522e(PushMessage pushMessage, String str) {
        String string = pushMessage.messageCustom.category;
        try {
            string = new JSONObject(pushMessage.messageCustom.extra).getString(FirebaseAnalytics.Event.SEARCH);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        i4g0.m138492A("e_live_inner_push", str, jyb.m147494Y("push_category", string), jyb.m147494Y("push_id", pushMessage.messageCustom.traceId));
    }

    /* JADX INFO: renamed from: f */
    public static void m95523f(String str, String str2) {
        i4g0.m138523u("e_live_room_enter", "p_live_inner_push", jyb.m147494Y("liveId", str), jyb.m147494Y("push_id", str2), jyb.m147494Y("liveRecommendCategory", "official_channel"));
        i4g0.m138492A("e_live_room_enter", "p_live_inner_push", jyb.m147494Y("liveId", str), jyb.m147494Y("push_id", str2), jyb.m147494Y("liveRecommendCategory", "official_channel"));
    }
}
