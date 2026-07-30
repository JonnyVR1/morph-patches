package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.data.UserId;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveOwner;
import com.p051p1.mobile.putong.live.base.data.BLiveStreamUrl;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class fgt {
    /* JADX INFO: renamed from: a */
    public static void m125529a(String str, boolean z, String str2, String str3, BLiveAbsData bLiveAbsData, y20<Map<String, Object>> y20Var) {
        if (vxr.m203876d().m171018q0()) {
            HashMap map = new HashMap();
            try {
                map.put("live_room_trace_id", str2);
                map.put("live_role", z ? "anchor" : "audience");
                map.put("live_source", str3);
                map.put(UserId.TYPE, zrv.f205799a.m207631D0());
                map.put("timestamp", String.valueOf(System.currentTimeMillis()));
                map.put("keypoint_action", str);
                if (bLiveAbsData != null) {
                    map.put("liveId", bLiveAbsData.f45171id);
                    BLiveOwner bLiveOwner = bLiveAbsData.room;
                    if (bLiveOwner != null) {
                        map.put("roomId", bLiveOwner.f45267id);
                    }
                    BLiveOwner bLiveOwner2 = bLiveAbsData.anchor;
                    if (bLiveOwner2 != null) {
                        map.put("anchorId", bLiveOwner2.f45267id);
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
                if (y20Var != null) {
                    y20Var.call(map);
                }
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
            q4f q4fVar = new q4f();
            q4fVar.f155576n = "";
            q4fVar.f155566d = EventNameEnum.SYS_CHECK;
            q4fVar.f155581s = "e_live_livingroom_key_point";
            i4g0.m138516n(q4fVar, map);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r7v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: b */
    public static void m125530b(i6t i6tVar, String str, y20<Map<String, Object>> y20Var) {
        if (vxr.m203876d().m171018q0() && i6tVar != null) {
            m125529a(str, i6tVar.m213815L2(), i6tVar.m213810E2().m202200x(), i6tVar.m213810E2().mo160117o0(), i6tVar.m213810E2().mo183435j(), y20Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m125531c(i6t i6tVar, String str, y20<Map<String, Object>> y20Var) {
        if (i6tVar.f113183g.contains(str)) {
            return;
        }
        i6tVar.f113183g.add(str);
        m125530b(i6tVar, str, y20Var);
    }
}
