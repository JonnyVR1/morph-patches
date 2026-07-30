package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveOwner;
import com.p1.mobile.putong.live.base.data.BLiveStreamUrl;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.HashMap;
import java.util.Map;
import l.e30;
import l.l3f;
import l.uvr;
import l.ypv;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class eet {
    /* JADX INFO: renamed from: a */
    public static void m12447a(String str, boolean z, String str2, String str3, BLiveAbsData bLiveAbsData, e30<Map<String, Object>> e30Var) {
        if (uvr.d().q0()) {
            HashMap map = new HashMap();
            try {
                map.put("live_room_trace_id", str2);
                map.put("live_role", z ? "anchor" : "audience");
                map.put("live_source", str3);
                map.put("userid", ypv.a.D0());
                map.put("timestamp", String.valueOf(System.currentTimeMillis()));
                map.put("keypoint_action", str);
                if (bLiveAbsData != null) {
                    map.put("liveId", bLiveAbsData.id);
                    BLiveOwner bLiveOwner = bLiveAbsData.room;
                    if (bLiveOwner != null) {
                        map.put("roomId", bLiveOwner.id);
                    }
                    BLiveOwner bLiveOwner2 = bLiveAbsData.anchor;
                    if (bLiveOwner2 != null) {
                        map.put("anchorId", bLiveOwner2.id);
                    }
                    if (TextUtils.isEmpty(bLiveAbsData.liveMode)) {
                        bLiveAbsData.liveMode = "normal";
                    }
                    map.put("live_room_live_type", bLiveAbsData.liveMode);
                    BLiveStreamUrl bLiveStreamUrl = bLiveAbsData.streamUrl;
                    if (bLiveStreamUrl != null) {
                        map.put("pull_url", bLiveStreamUrl.pullFlv);
                        map.put("push_url", bLiveAbsData.streamUrl.push);
                    }
                }
                if (e30Var != null) {
                    e30Var.call(map);
                }
            } catch (Exception e) {
                CrashHelper.c(e);
            }
            l3f l3fVar = new l3f();
            l3fVar.n = "";
            l3fVar.d = EventNameEnum.SYS_CHECK;
            l3fVar.s = "e_live_livingroom_key_point";
            zvf0.n(l3fVar, map);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r7v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: b */
    public static void m12448b(h4t h4tVar, String str, e30<Map<String, Object>> e30Var) {
        if (uvr.d().q0() && h4tVar != null) {
            m12447a(str, h4tVar.m25552L2(), h4tVar.m25547E2().m17247x(), h4tVar.m25547E2().mo14591o0(), h4tVar.m25547E2().m17234j(), e30Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m12449c(h4t h4tVar, String str, e30<Map<String, Object>> e30Var) {
        if (h4tVar.f11874g.contains(str)) {
            return;
        }
        h4tVar.f11874g.add(str);
        m12448b(h4tVar, str, e30Var);
    }
}
