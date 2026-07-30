package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import l.j760;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ttn {
    /* JADX INFO: renamed from: a */
    public static void m22660a(String str, User user) {
        String userLiveId = CoreModule.Q().getUserLiveId(((DbObject) user).id);
        if (userLiveId == null) {
            userLiveId = "";
        }
        zvf0.u("e_live_room_enter", str, new j760[]{j760.a("other_user_id", ((DbObject) user).id), j760.a("sequence", Integer.valueOf(CoreModule.c.m0.z6(((DbObject) user).id))), j760.a("live_enter_source", "suggest_live_card"), j760.a("photos_number", Integer.valueOf(user.pictures.size())), j760.a("anchorId", ((DbObject) user).id), j760.a("index", "NA"), j760.a("liveId", userLiveId), j760.a("liveRecommendCategory", "basic"), j760.a("live_status", "on"), j760.a("module", "page"), j760.a("is_gif", 0), j760.a("trace_id", ""), j760.a("window_type", "full")});
    }
}
