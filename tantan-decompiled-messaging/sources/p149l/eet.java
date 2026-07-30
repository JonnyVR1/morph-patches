package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.data.UserId;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveOwner;
import com.p046p1.mobile.putong.live.base.data.BLiveStreamUrl;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class eet {
    /* JADX INFO: renamed from: a */
    public static void m116002a(String str, boolean z, String str2, String str3, BLiveAbsData bLiveAbsData, e30<Map<String, Object>> e30Var) {
        if (uvr.m196087d().m162711q0()) {
            HashMap map = new HashMap();
            try {
                map.put("live_room_trace_id", str2);
                map.put("live_role", z ? "anchor" : "audience");
                map.put("live_source", str3);
                map.put(UserId.TYPE, ypv.f199493a.m199309D0());
                map.put("timestamp", String.valueOf(System.currentTimeMillis()));
                map.put("keypoint_action", str);
                if (bLiveAbsData != null) {
                    map.put("liveId", bLiveAbsData.f44323id);
                    BLiveOwner bLiveOwner = bLiveAbsData.room;
                    if (bLiveOwner != null) {
                        map.put("roomId", bLiveOwner.f44419id);
                    }
                    BLiveOwner bLiveOwner2 = bLiveAbsData.anchor;
                    if (bLiveOwner2 != null) {
                        map.put("anchorId", bLiveOwner2.f44419id);
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
                CrashHelper.m81296c(e);
            }
            l3f l3fVar = new l3f();
            l3fVar.f125895n = "";
            l3fVar.f125885d = EventNameEnum.SYS_CHECK;
            l3fVar.f125900s = "e_live_livingroom_key_point";
            zvf0.m220392n(l3fVar, map);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r7v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: b */
    public static void m116003b(h4t h4tVar, String str, e30<Map<String, Object>> e30Var) {
        if (uvr.m196087d().m162711q0() && h4tVar != null) {
            m116002a(str, h4tVar.m206032L2(), h4tVar.m206027E2().m149826x(), h4tVar.m206027E2().mo132155o0(), h4tVar.m206027E2().mo149813j(), e30Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m116004c(h4t h4tVar, String str, e30<Map<String, Object>> e30Var) {
        if (h4tVar.f105872g.contains(str)) {
            return;
        }
        h4tVar.f105872g.add(str);
        m116003b(h4tVar, str, e30Var);
    }
}
