package p149l;

import androidx.annotation.VisibleForTesting;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class att0 {

    /* JADX INFO: renamed from: a */
    public final Object f71675a = new Object();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f71676b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap f71677c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public final ConcurrentHashMap f71678d = new ConcurrentHashMap();

    @VisibleForTesting
    public att0() {
    }

    /* JADX INFO: renamed from: a */
    public final int m98879a(String str) {
        Integer num = (Integer) this.f71676b.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: b */
    public final long m98880b(String str) {
        Long l2 = (Long) this.f71678d.get(str);
        if (l2 == null) {
            return -1L;
        }
        return l2.longValue();
    }

    /* JADX INFO: renamed from: c */
    public final void m98881c(String str) {
        synchronized (this.f71675a) {
            try {
                Integer num = (Integer) this.f71676b.get(str);
                this.f71676b.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m98882d(String str, String str2, long j) {
        Long l2 = (Long) this.f71677c.get(str2);
        if (l2 == null) {
            return;
        }
        this.f71677c.remove(str2);
        this.f71678d.put(str, Long.valueOf(j - l2.longValue()));
    }

    /* JADX INFO: renamed from: e */
    public final void m98883e(String str, long j) {
        this.f71677c.put(str, Long.valueOf(j));
    }
}
