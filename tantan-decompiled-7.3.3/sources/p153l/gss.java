package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.Link;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public class gss {
    /* JADX INFO: renamed from: a */
    public static void m132145a(String str, String str2, String str3, String str4, boolean z, String str5) {
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
        q4fVar.f155576n = "p_live_using_push_schema_trace";
        q4fVar.f155581s = "e_live_using_push_schema_trace";
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("intent", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            map.put("schema_path", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            map.put("go_data", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            map.put("type", str4);
        }
        map.put("is_new_framework", Boolean.valueOf(z));
        if (!TextUtils.isEmpty(str5)) {
            map.put(Link.TYPE, str5);
        }
        i4g0.m138516n(q4fVar, map);
    }

    /* JADX INFO: renamed from: b */
    public static void m132146b(String str, boolean z) {
        m132145a(null, null, str, "goAction", z, null);
    }

    /* JADX INFO: renamed from: c */
    public static void m132147c(String str, boolean z, String str2) {
        m132145a(str, null, null, "push", z, str2);
    }

    /* JADX INFO: renamed from: d */
    public static void m132148d(String str, boolean z) {
        m132145a(null, str, null, "schema", z, null);
    }
}
