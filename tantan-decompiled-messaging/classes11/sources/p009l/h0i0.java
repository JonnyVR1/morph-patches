package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import l.w9j;
import rx.Notification;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class h0i0 {

    /* JADX INFO: renamed from: a */
    public final Map<Long, Integer> f13829a;

    /* JADX INFO: renamed from: b */
    public volatile long f13830b;

    public h0i0() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f13829a = concurrentHashMap;
        concurrentHashMap.clear();
        this.f13830b = 0L;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Notification m15374a(Long l2, Notification notification) {
        CoreModule.c.I0.R3(l2);
        return notification;
    }

    /* JADX INFO: renamed from: e */
    public static <T> c.d<T, T> m15376e(final Long l2) {
        return new c.d() { // from class: l.f0i0
            public final Object call(Object obj) {
                return ((c) obj).materialize().map(new w9j() { // from class: l.g0i0
                    public final Object call(Object obj2) {
                        return h0i0.m15374a(l, (Notification) obj2);
                    }
                }).dematerialize();
            }
        };
    }

    /* JADX INFO: renamed from: c */
    public long m15377c(long j) {
        if (this.f13830b > 0) {
            j -= this.f13830b;
        }
        if (j > 0) {
            return j;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: d */
    public synchronized Long m15378d(String str, int i) {
        if (!TextUtils.equals(str, "diamond")) {
            return null;
        }
        Long lValueOf = Long.valueOf(mqi0.m18550o());
        this.f13829a.put(lValueOf, Integer.valueOf(i));
        this.f13830b += (long) i;
        return lValueOf;
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m15379f(Long l2) {
        Integer numRemove;
        if (l2 != null) {
            if (this.f13829a.containsKey(l2) && (numRemove = this.f13829a.remove(l2)) != null) {
                this.f13830b -= (long) numRemove.intValue();
            }
        }
    }
}
