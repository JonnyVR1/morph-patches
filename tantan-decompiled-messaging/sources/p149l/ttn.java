package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class ttn {
    /* JADX INFO: renamed from: a */
    public static void m190607a(String str, User user) {
        String userLiveId = CoreModule.m29936Q().getUserLiveId(user.f56011id);
        if (userLiveId == null) {
            userLiveId = "";
        }
        zvf0.m220399u("e_live_room_enter", str, j760.m140076a("other_user_id", user.f56011id), j760.m140076a("sequence", Integer.valueOf(CoreModule.f17545c.f19663m0.m31166z6(user.f56011id))), j760.m140076a("live_enter_source", "suggest_live_card"), j760.m140076a("photos_number", Integer.valueOf(user.pictures.size())), j760.m140076a("anchorId", user.f56011id), j760.m140076a(FirebaseAnalytics.Param.INDEX, "NA"), j760.m140076a("liveId", userLiveId), j760.m140076a("liveRecommendCategory", "basic"), j760.m140076a("live_status", "on"), j760.m140076a("module", OMSTemplateModeType.page), j760.m140076a("is_gif", 0), j760.m140076a("trace_id", ""), j760.m140076a("window_type", "full"));
    }
}
