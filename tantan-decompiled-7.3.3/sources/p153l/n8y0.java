package p153l;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class n8y0 {

    /* JADX INFO: renamed from: a */
    public Map<String, Callable<? extends mpr0>> f140724a = new HashMap();

    /* JADX INFO: renamed from: a */
    public final ewr0 m161947a(String str) {
        if (!this.f140724a.containsKey(str)) {
            return ewr0.f96187w0;
        }
        try {
            return this.f140724a.get(str).call();
        } catch (Exception unused) {
            xtq0.m213103a("Failed to create API implementation: ", str);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m161948b(String str, Callable<? extends mpr0> callable) {
        this.f140724a.put(str, callable);
    }
}
