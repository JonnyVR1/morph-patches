package p149l;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class zww0 {

    /* JADX INFO: renamed from: b */
    public static final zww0 f205327b = new zww0();

    /* JADX INFO: renamed from: a */
    public final Map f205328a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static zww0 m220732b() {
        return f205327b;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized fow0 m220733a(String str) throws GeneralSecurityException {
        if (!this.f205328a.containsKey("AES128_GCM")) {
            throw new GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (fow0) this.f205328a.get("AES128_GCM");
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m220734c(String str, fow0 fow0Var) throws GeneralSecurityException {
        try {
            boolean zContainsKey = this.f205328a.containsKey(str);
            Map map = this.f205328a;
            if (!zContainsKey) {
                map.put(str, fow0Var);
                return;
            }
            if (((fow0) map.get(str)).equals(fow0Var)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.f205328a.get(str)) + "), cannot insert " + String.valueOf(fow0Var));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m220735d(Map map) throws GeneralSecurityException {
        for (Map.Entry entry : map.entrySet()) {
            m220734c((String) entry.getKey(), (fow0) entry.getValue());
        }
    }
}
