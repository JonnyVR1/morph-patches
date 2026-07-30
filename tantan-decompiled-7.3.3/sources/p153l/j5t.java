package p153l;

import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class j5t {

    /* JADX INFO: renamed from: a */
    public static Map<String, Long> f118499a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static void m143591a(x20 x20Var, String str, String str2, boolean z, boolean z2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        x20Var.call();
        m143593c(String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), str, str2, z, z2);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m143592b(String str, boolean z) {
        if (z) {
            if (!f118499a.containsKey(str)) {
                f118499a.put(str, Long.valueOf(System.currentTimeMillis()));
                return true;
            }
            Long l2 = f118499a.get(str);
            if (l2 != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Long lValueOf = Long.valueOf(jCurrentTimeMillis);
                if (jCurrentTimeMillis - l2.longValue() <= 500) {
                    return false;
                }
                f118499a.put(str, lValueOf);
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static void m143593c(String str, String str2, String str3, boolean z, boolean z2) {
        if (m143592b(str2, z2)) {
            q4f q4fVar = new q4f();
            q4fVar.f155566d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            q4fVar.f155576n = z ? "p_anchor_live_room" : "p_user_live_room";
            q4fVar.f155581s = "e_method_execute_time";
            HashMap map = new HashMap();
            p6s p6sVarM203876d = vxr.m203876d();
            map.put("so_enable", Boolean.valueOf(NullChecker.m82486a(p6sVarM203876d) ? p6sVarM203876d.m170972E0() : false));
            map.put("execute_time", str);
            map.put("method_name", str2);
            map.put("live_type", str3);
            i4g0.m138516n(q4fVar, map);
            map.toString();
        }
    }
}
