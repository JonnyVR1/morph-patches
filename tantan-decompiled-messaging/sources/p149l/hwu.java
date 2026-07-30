package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public class hwu {

    /* JADX INFO: renamed from: a */
    public static long f109801a;

    /* JADX INFO: renamed from: a */
    public static String m133265a(BLiveSuggestLive bLiveSuggestLive) {
        BLiveMultiCallInfo bLiveMultiCallInfo = bLiveSuggestLive.multiCallInfo;
        return j7d0.m140091b((bLiveMultiCallInfo == null || TextUtils.isEmpty(bLiveMultiCallInfo.role)) ? "" : bLiveSuggestLive.multiCallInfo.role, bLiveSuggestLive.state);
    }

    /* JADX INFO: renamed from: b */
    public static void m133266b(BLiveSuggestLive bLiveSuggestLive) {
        if (bLiveSuggestLive == null || bLiveSuggestLive.anchor == null || bLiveSuggestLive.recommendInfo == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("live_status", "on");
        map.put("is_gif", "1");
        map.put("liveId", bLiveSuggestLive.f44450id);
        map.put("live_room_live_type", m133265a(bLiveSuggestLive));
        map.put("module", "featured_page");
        map.put("on_live", "1");
        map.put("show_label", "NA");
        map.put("anchorId", bLiveSuggestLive.anchor.f44451id);
        map.put("redpacket_icon", "0");
        map.put("liveRecommendCategory", bLiveSuggestLive.recommendInfo.category);
        zvf0.m220397s("e_live_room_enter", "p_live_featured", map);
    }

    /* JADX INFO: renamed from: c */
    public static void m133267c(BLiveSuggestLive bLiveSuggestLive) {
        if (bLiveSuggestLive == null || bLiveSuggestLive.anchor == null || bLiveSuggestLive.recommendInfo == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("live_status", "on");
        map.put("is_gif", "1");
        map.put("liveId", bLiveSuggestLive.f44450id);
        map.put("live_room_live_type", m133265a(bLiveSuggestLive));
        map.put("module", "featured_page");
        map.put("on_live", "1");
        map.put("show_label", "NA");
        map.put("anchorId", bLiveSuggestLive.anchor.f44451id);
        map.put("redpacket_icon", "0");
        map.put("liveRecommendCategory", bLiveSuggestLive.recommendInfo.category);
        zvf0.m220403y("e_live_room_enter", "p_live_featured", map);
    }

    /* JADX INFO: renamed from: d */
    public static void m133268d(BLiveSuggestLive bLiveSuggestLive, long j, boolean z) {
        if (bLiveSuggestLive == null || bLiveSuggestLive.anchor == null || j >= 7200000 || j < 0) {
            return;
        }
        HashMap map = new HashMap();
        map.put("liveroomduration", String.valueOf(j));
        map.put("liveId", bLiveSuggestLive.f44450id);
        map.put("anchorId", bLiveSuggestLive.anchor.f44451id);
        map.put("roomId", bLiveSuggestLive.room.f44452id);
        map.put("is_fail", Boolean.valueOf(z));
        if (System.currentTimeMillis() - f109801a > 500) {
            f109801a = System.currentTimeMillis();
            zvf0.m220403y("e_live_featured", "p_live_featured", map);
        }
    }
}
