package p149l;

import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class i3t {

    /* JADX INFO: renamed from: a */
    public static Map<String, Long> f111371a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static void m134299a(d30 d30Var, String str, String str2, boolean z, boolean z2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        d30Var.call();
        m134301c(String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), str, str2, z, z2);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m134300b(String str, boolean z) {
        if (z) {
            if (!f111371a.containsKey(str)) {
                f111371a.put(str, Long.valueOf(System.currentTimeMillis()));
                return true;
            }
            Long l2 = f111371a.get(str);
            if (l2 != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Long lValueOf = Long.valueOf(jCurrentTimeMillis);
                if (jCurrentTimeMillis - l2.longValue() <= 500) {
                    return false;
                }
                f111371a.put(str, lValueOf);
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static void m134301c(String str, String str2, String str3, boolean z, boolean z2) {
        if (m134300b(str2, z2)) {
            l3f l3fVar = new l3f();
            l3fVar.f125885d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            l3fVar.f125895n = z ? "p_anchor_live_room" : "p_user_live_room";
            l3fVar.f125900s = "e_method_execute_time";
            HashMap map = new HashMap();
            o4s o4sVarM196087d = uvr.m196087d();
            map.put("so_enable", Boolean.valueOf(NullChecker.m81303a(o4sVarM196087d) ? o4sVarM196087d.m162665E0() : false));
            map.put("execute_time", str);
            map.put("method_name", str2);
            map.put("live_type", str3);
            zvf0.m220392n(l3fVar, map);
            map.toString();
        }
    }
}
