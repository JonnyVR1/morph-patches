package p149l;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class mqf0 {
    private static final mqf0 INSTANCE = new mqf0(true);

    /* JADX INFO: renamed from: a */
    public final Map<lqf0, String> f135217a = new HashMap();

    public mqf0(boolean z) {
        if (z) {
            m155890a(lqf0.f129333c, "default config");
        }
    }

    /* JADX INFO: renamed from: c */
    public static mqf0 m155889c() {
        return INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public boolean m155890a(lqf0 lqf0Var, String str) {
        if (lqf0Var == null) {
            ig3.m135964a("springConfig is required");
            return false;
        }
        if (str == null) {
            ig3.m135964a("configName is required");
            return false;
        }
        if (this.f135217a.containsKey(lqf0Var)) {
            return false;
        }
        this.f135217a.put(lqf0Var, str);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public Map<lqf0, String> m155891b() {
        return Collections.unmodifiableMap(this.f135217a);
    }
}
