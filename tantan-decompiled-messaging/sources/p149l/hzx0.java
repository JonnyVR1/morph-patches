package p149l;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class hzx0 {

    /* JADX INFO: renamed from: a */
    public Map<String, Callable<? extends ggr0>> f110237a = new HashMap();

    /* JADX INFO: renamed from: a */
    public final ymr0 m133724a(String str) {
        if (!this.f110237a.containsKey(str)) {
            return ymr0.f199051w0;
        }
        try {
            return this.f110237a.get(str).call();
        } catch (Exception unused) {
            rkq0.m179764a("Failed to create API implementation: ", str);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m133725b(String str, Callable<? extends ggr0> callable) {
        this.f110237a.put(str, callable);
    }
}
