package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.data.PushMessage;
import com.p1.mobile.putong.data.PushMessageCustom;
import com.tantanapp.common.utils.CrashHelper;
import l.j760;
import l.vwb;
import l.zvf0;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class azm {
    /* JADX INFO: renamed from: a */
    public static void m11788a(PushMessageCustom pushMessageCustom, String str, String str2) {
        zvf0.w("e_live_innerpush_close", "p_live_inner_push", new j760[]{vwb.Y("anchor_id", pushMessageCustom.userId), vwb.Y("close_kind", str), vwb.Y("live_id", pushMessageCustom.liveId), vwb.Y("live_push_page_id", str2), vwb.Y("push_text", pushMessageCustom.content)});
    }

    /* JADX INFO: renamed from: b */
    public static void m11789b(PushMessageCustom pushMessageCustom, String str) {
        zvf0.u("e_live_room_enter", "p_live_inner_push", new j760[]{vwb.Y("liveId", pushMessageCustom.liveId), vwb.Y("anchorId", pushMessageCustom.userId), vwb.Y("index", "NA"), vwb.Y("show_label", ""), vwb.Y("module", "page"), vwb.Y("right_recommend_type", ""), vwb.Y("live_status", "on"), vwb.Y("live_push_page_id", str), vwb.Y("liveRecommendCategory", TextUtils.isEmpty(pushMessageCustom.category) ? "NA" : pushMessageCustom.category)});
    }

    /* JADX INFO: renamed from: c */
    public static void m11790c(PushMessageCustom pushMessageCustom, String str) {
        zvf0.A("e_live_room_enter", "p_live_inner_push", new j760[]{vwb.Y("index", "NA"), vwb.Y("module", "page"), vwb.Y("liveId", pushMessageCustom.liveId), vwb.Y("anchorId", pushMessageCustom.userId), vwb.Y("trace_id", ""), vwb.Y("show_label", ""), vwb.Y("liveRecommendCategory", TextUtils.isEmpty(pushMessageCustom.category) ? "NA" : pushMessageCustom.category), vwb.Y("live_status", "on"), vwb.Y("live_push_page_id", str), vwb.Y("right_recommend_type", "")});
    }

    /* JADX INFO: renamed from: d */
    public static void m11791d(PushMessage pushMessage, String str) {
        String string = pushMessage.messageCustom.category;
        try {
            string = new JSONObject(pushMessage.messageCustom.extra).getString("search");
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        zvf0.u("e_live_inner_push", str, new j760[]{vwb.Y("push_category", string), vwb.Y("push_id", pushMessage.messageCustom.traceId)});
    }

    /* JADX INFO: renamed from: e */
    public static void m11792e(PushMessage pushMessage, String str) {
        String string = pushMessage.messageCustom.category;
        try {
            string = new JSONObject(pushMessage.messageCustom.extra).getString("search");
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        zvf0.A("e_live_inner_push", str, new j760[]{vwb.Y("push_category", string), vwb.Y("push_id", pushMessage.messageCustom.traceId)});
    }

    /* JADX INFO: renamed from: f */
    public static void m11793f(String str, String str2) {
        zvf0.u("e_live_room_enter", "p_live_inner_push", new j760[]{vwb.Y("liveId", str), vwb.Y("push_id", str2), vwb.Y("liveRecommendCategory", "official_channel")});
        zvf0.A("e_live_room_enter", "p_live_inner_push", new j760[]{vwb.Y("liveId", str), vwb.Y("push_id", str2), vwb.Y("liveRecommendCategory", "official_channel")});
    }
}
