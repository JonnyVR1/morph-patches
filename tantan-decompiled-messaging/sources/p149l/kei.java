package p149l;

import android.text.TextUtils;
import com.cosmos.mdlog.MDLog;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class kei {
    /* JADX INFO: renamed from: a */
    public static String m145782a(sei seiVar, String str, String str2) throws Exception {
        m400 m400Var = xtc0.f194368c;
        MDLog.m7395i("tantantest", "webConfig url: " + m400Var.m152986c());
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        HashMap<String, String> map = new HashMap<>();
        if (seiVar != null && seiVar.m183655d()) {
            map = seiVar.m183654c();
        }
        map.put("hash", str);
        map.put("pollType", str2);
        if (m400Var.m152985b() != null) {
            map.putAll(m400Var.m152985b());
        }
        return phw.m169153b().m169154a().mo87143a(m400Var.m152986c(), map, m400Var.m152984a());
    }
}
