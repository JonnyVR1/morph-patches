package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class tvn {
    /* JADX INFO: renamed from: a */
    public static void m192813a(String str, User user) {
        String userLiveId = CoreModule.m30934Q().getUserLiveId(user.f56859id);
        if (userLiveId == null) {
            userLiveId = "";
        }
        i4g0.m138523u("e_live_room_enter", str, pf60.m172085a("other_user_id", user.f56859id), pf60.m172085a("sequence", Integer.valueOf(CoreModule.f18264c.f20405m0.m32169z6(user.f56859id))), pf60.m172085a("live_enter_source", "suggest_live_card"), pf60.m172085a("photos_number", Integer.valueOf(user.pictures.size())), pf60.m172085a("anchorId", user.f56859id), pf60.m172085a(FirebaseAnalytics.Param.INDEX, "NA"), pf60.m172085a("liveId", userLiveId), pf60.m172085a("liveRecommendCategory", "basic"), pf60.m172085a("live_status", "on"), pf60.m172085a("module", OMSTemplateModeType.page), pf60.m172085a("is_gif", 0), pf60.m172085a("trace_id", ""), pf60.m172085a("window_type", "full"));
    }
}
