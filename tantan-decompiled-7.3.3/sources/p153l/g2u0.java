package p153l;

import androidx.annotation.VisibleForTesting;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class g2u0 {

    /* JADX INFO: renamed from: a */
    public final Object f101890a = new Object();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f101891b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap f101892c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public final ConcurrentHashMap f101893d = new ConcurrentHashMap();

    @VisibleForTesting
    public g2u0() {
    }

    /* JADX INFO: renamed from: a */
    public final int m128661a(String str) {
        Integer num = (Integer) this.f101891b.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: b */
    public final long m128662b(String str) {
        Long l2 = (Long) this.f101893d.get(str);
        if (l2 == null) {
            return -1L;
        }
        return l2.longValue();
    }

    /* JADX INFO: renamed from: c */
    public final void m128663c(String str) {
        synchronized (this.f101890a) {
            try {
                Integer num = (Integer) this.f101891b.get(str);
                this.f101891b.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m128664d(String str, String str2, long j) {
        Long l2 = (Long) this.f101892c.get(str2);
        if (l2 == null) {
            return;
        }
        this.f101892c.remove(str2);
        this.f101893d.put(str, Long.valueOf(j - l2.longValue()));
    }

    /* JADX INFO: renamed from: e */
    public final void m128665e(String str, long j) {
        this.f101892c.put(str, Long.valueOf(j));
    }
}
