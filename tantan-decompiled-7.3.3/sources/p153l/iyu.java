package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public class iyu {

    /* JADX INFO: renamed from: a */
    public static long f117637a;

    /* JADX INFO: renamed from: a */
    public static String m142722a(BLiveSuggestLive bLiveSuggestLive) {
        BLiveMultiCallInfo bLiveMultiCallInfo = bLiveSuggestLive.multiCallInfo;
        return mfd0.m158165b((bLiveMultiCallInfo == null || TextUtils.isEmpty(bLiveMultiCallInfo.role)) ? "" : bLiveSuggestLive.multiCallInfo.role, bLiveSuggestLive.state);
    }

    /* JADX INFO: renamed from: b */
    public static void m142723b(BLiveSuggestLive bLiveSuggestLive) {
        if (bLiveSuggestLive == null || bLiveSuggestLive.anchor == null || bLiveSuggestLive.recommendInfo == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("live_status", "on");
        map.put("is_gif", "1");
        map.put("liveId", bLiveSuggestLive.f45298id);
        map.put("live_room_live_type", m142722a(bLiveSuggestLive));
        map.put("module", "featured_page");
        map.put("on_live", "1");
        map.put("show_label", "NA");
        map.put("anchorId", bLiveSuggestLive.anchor.f45299id);
        map.put("redpacket_icon", "0");
        map.put("liveRecommendCategory", bLiveSuggestLive.recommendInfo.category);
        i4g0.m138521s("e_live_room_enter", "p_live_featured", map);
    }

    /* JADX INFO: renamed from: c */
    public static void m142724c(BLiveSuggestLive bLiveSuggestLive) {
        if (bLiveSuggestLive == null || bLiveSuggestLive.anchor == null || bLiveSuggestLive.recommendInfo == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("live_status", "on");
        map.put("is_gif", "1");
        map.put("liveId", bLiveSuggestLive.f45298id);
        map.put("live_room_live_type", m142722a(bLiveSuggestLive));
        map.put("module", "featured_page");
        map.put("on_live", "1");
        map.put("show_label", "NA");
        map.put("anchorId", bLiveSuggestLive.anchor.f45299id);
        map.put("redpacket_icon", "0");
        map.put("liveRecommendCategory", bLiveSuggestLive.recommendInfo.category);
        i4g0.m138527y("e_live_room_enter", "p_live_featured", map);
    }

    /* JADX INFO: renamed from: d */
    public static void m142725d(BLiveSuggestLive bLiveSuggestLive, long j, boolean z) {
        if (bLiveSuggestLive == null || bLiveSuggestLive.anchor == null || j >= 7200000 || j < 0) {
            return;
        }
        HashMap map = new HashMap();
        map.put("liveroomduration", String.valueOf(j));
        map.put("liveId", bLiveSuggestLive.f45298id);
        map.put("anchorId", bLiveSuggestLive.anchor.f45299id);
        map.put("roomId", bLiveSuggestLive.room.f45300id);
        map.put("is_fail", Boolean.valueOf(z));
        if (System.currentTimeMillis() - f117637a > 500) {
            f117637a = System.currentTimeMillis();
            i4g0.m138527y("e_live_featured", "p_live_featured", map);
        }
    }
}
