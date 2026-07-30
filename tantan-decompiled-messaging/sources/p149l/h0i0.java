package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p133rx.C22306c;
import p133rx.Notification;

/* JADX INFO: loaded from: classes11.dex */
public class h0i0 {

    /* JADX INFO: renamed from: a */
    public final Map<Long, Integer> f105220a;

    /* JADX INFO: renamed from: b */
    public volatile long f105221b;

    public h0i0() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f105220a = concurrentHashMap;
        concurrentHashMap.clear();
        this.f105221b = 0L;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Notification m128953a(Long l2, Notification notification) {
        CoreModule.f17545c.f19573I0.m140264R3(l2);
        return notification;
    }

    /* JADX INFO: renamed from: e */
    public static <T> C22306c.d<T, T> m128955e(final Long l2) {
        return new C22306c.d() { // from class: l.f0i0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((C22306c) obj).materialize().map(new w9j() { // from class: l.g0i0
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return h0i0.m128953a(l, (Notification) obj2);
                    }
                }).dematerialize();
            }
        };
    }

    /* JADX INFO: renamed from: c */
    public long m128956c(long j) {
        if (this.f105221b > 0) {
            j -= this.f105221b;
        }
        if (j > 0) {
            return j;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: d */
    public synchronized Long m128957d(String str, int i) {
        if (!TextUtils.equals(str, "diamond")) {
            return null;
        }
        Long lValueOf = Long.valueOf(mqi0.m155944o());
        this.f105220a.put(lValueOf, Integer.valueOf(i));
        this.f105221b += (long) i;
        return lValueOf;
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m128958f(Long l2) {
        Integer numRemove;
        if (l2 != null) {
            if (this.f105220a.containsKey(l2) && (numRemove = this.f105220a.remove(l2)) != null) {
                this.f105221b -= (long) numRemove.intValue();
            }
        }
    }
}
