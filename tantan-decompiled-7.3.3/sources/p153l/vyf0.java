package p153l;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class vyf0 {
    private static final vyf0 INSTANCE = new vyf0(true);

    /* JADX INFO: renamed from: a */
    public final Map<uyf0, String> f186371a = new HashMap();

    public vyf0(boolean z) {
        if (z) {
            m203994a(uyf0.f181593c, "default config");
        }
    }

    /* JADX INFO: renamed from: c */
    public static vyf0 m203993c() {
        return INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public boolean m203994a(uyf0 uyf0Var, String str) {
        if (uyf0Var == null) {
            wg3.m206174a("springConfig is required");
            return false;
        }
        if (str == null) {
            wg3.m206174a("configName is required");
            return false;
        }
        if (this.f186371a.containsKey(uyf0Var)) {
            return false;
        }
        this.f186371a.put(uyf0Var, str);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public Map<uyf0, String> m203995b() {
        return Collections.unmodifiableMap(this.f186371a);
    }
}
