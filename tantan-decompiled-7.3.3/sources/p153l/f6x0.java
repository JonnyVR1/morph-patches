package p153l;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class f6x0 {

    /* JADX INFO: renamed from: b */
    public static final f6x0 f97455b = new f6x0();

    /* JADX INFO: renamed from: a */
    public final Map f97456a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static f6x0 m124326b() {
        return f97455b;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized lxw0 m124327a(String str) throws GeneralSecurityException {
        if (!this.f97456a.containsKey("AES128_GCM")) {
            throw new GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (lxw0) this.f97456a.get("AES128_GCM");
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m124328c(String str, lxw0 lxw0Var) throws GeneralSecurityException {
        try {
            boolean zContainsKey = this.f97456a.containsKey(str);
            Map map = this.f97456a;
            if (!zContainsKey) {
                map.put(str, lxw0Var);
                return;
            }
            if (((lxw0) map.get(str)).equals(lxw0Var)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.f97456a.get(str)) + "), cannot insert " + String.valueOf(lxw0Var));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m124329d(Map map) throws GeneralSecurityException {
        for (Map.Entry entry : map.entrySet()) {
            m124328c((String) entry.getKey(), (lxw0) entry.getValue());
        }
    }
}
