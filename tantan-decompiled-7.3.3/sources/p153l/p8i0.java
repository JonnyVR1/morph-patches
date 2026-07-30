package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p137rx.C22421c;
import p137rx.Notification;

/* JADX INFO: loaded from: classes11.dex */
public class p8i0 {

    /* JADX INFO: renamed from: a */
    public final Map<Long, Integer> f151034a;

    /* JADX INFO: renamed from: b */
    public volatile long f151035b;

    public p8i0() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f151034a = concurrentHashMap;
        concurrentHashMap.clear();
        this.f151035b = 0L;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Notification m171243a(Long l2, Notification notification) {
        CoreModule.f18264c.f20315I0.m144061R3(l2);
        return notification;
    }

    /* JADX INFO: renamed from: e */
    public static <T> C22421c.d<T, T> m171245e(final Long l2) {
        return new C22421c.d() { // from class: l.n8i0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((C22421c) obj).materialize().map(new qcj() { // from class: l.o8i0
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return p8i0.m171243a(l, (Notification) obj2);
                    }
                }).dematerialize();
            }
        };
    }

    /* JADX INFO: renamed from: c */
    public long m171246c(long j) {
        if (this.f151035b > 0) {
            j -= this.f151035b;
        }
        if (j > 0) {
            return j;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: d */
    public synchronized Long m171247d(String str, int i) {
        if (!TextUtils.equals(str, "diamond")) {
            return null;
        }
        Long lValueOf = Long.valueOf(pzi0.m174454o());
        this.f151034a.put(lValueOf, Integer.valueOf(i));
        this.f151035b += (long) i;
        return lValueOf;
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m171248f(Long l2) {
        Integer numRemove;
        if (l2 != null) {
            if (this.f151034a.containsKey(l2) && (numRemove = this.f151034a.remove(l2)) != null) {
                this.f151035b -= (long) numRemove.intValue();
            }
        }
    }
}
