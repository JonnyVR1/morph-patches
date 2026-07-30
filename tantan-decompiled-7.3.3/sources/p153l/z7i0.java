package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p137rx.C22421c;
import p137rx.Notification;

/* JADX INFO: loaded from: classes11.dex */
public class z7i0 {

    /* JADX INFO: renamed from: a */
    public final Map<Long, Integer> f203248a;

    /* JADX INFO: renamed from: b */
    public volatile long f203249b;

    public z7i0() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f203248a = concurrentHashMap;
        concurrentHashMap.clear();
        this.f203249b = 0L;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Notification m218892b(Long l2, Notification notification) {
        CoreModule.f18264c.f20312H0.m155459p5(l2);
        return notification;
    }

    /* JADX INFO: renamed from: e */
    public static <T> C22421c.d<T, T> m218893e(final Long l2) {
        return new C22421c.d() { // from class: l.x7i0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((C22421c) obj).materialize().map(new qcj() { // from class: l.y7i0
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return z7i0.m218892b(l, (Notification) obj2);
                    }
                }).dematerialize();
            }
        };
    }

    /* JADX INFO: renamed from: c */
    public long m218894c(long j) {
        if (this.f203249b > 0) {
            j -= this.f203249b;
        }
        if (j > 0) {
            return j;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: d */
    public synchronized Long m218895d(String str, int i) {
        if (!TextUtils.equals(str, lqb.m155388i4(true))) {
            return null;
        }
        Long lValueOf = Long.valueOf(pzi0.m174454o());
        this.f203248a.put(lValueOf, Integer.valueOf(i));
        this.f203249b += (long) i;
        return lValueOf;
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m218896f(Long l2) {
        Integer numRemove;
        if (l2 != null) {
            if (this.f203248a.containsKey(l2) && (numRemove = this.f203248a.remove(l2)) != null) {
                this.f203249b -= (long) numRemove.intValue();
            }
        }
    }
}
