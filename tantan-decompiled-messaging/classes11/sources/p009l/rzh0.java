package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import l.w9j;
import l.xob;
import rx.Notification;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class rzh0 {

    /* JADX INFO: renamed from: a */
    public final Map<Long, Integer> f20040a;

    /* JADX INFO: renamed from: b */
    public volatile long f20041b;

    public rzh0() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f20040a = concurrentHashMap;
        concurrentHashMap.clear();
        this.f20041b = 0L;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Notification m21938b(Long l2, Notification notification) {
        CoreModule.c.H0.p5(l2);
        return notification;
    }

    /* JADX INFO: renamed from: e */
    public static <T> c.d<T, T> m21939e(final Long l2) {
        return new c.d() { // from class: l.pzh0
            public final Object call(Object obj) {
                return ((c) obj).materialize().map(new w9j() { // from class: l.qzh0
                    public final Object call(Object obj2) {
                        return rzh0.m21938b(l, (Notification) obj2);
                    }
                }).dematerialize();
            }
        };
    }

    /* JADX INFO: renamed from: c */
    public long m21940c(long j) {
        if (this.f20041b > 0) {
            j -= this.f20041b;
        }
        if (j > 0) {
            return j;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: d */
    public synchronized Long m21941d(String str, int i) {
        if (!TextUtils.equals(str, xob.i4(true))) {
            return null;
        }
        Long lValueOf = Long.valueOf(mqi0.m18550o());
        this.f20040a.put(lValueOf, Integer.valueOf(i));
        this.f20041b += (long) i;
        return lValueOf;
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m21942f(Long l2) {
        Integer numRemove;
        if (l2 != null) {
            if (this.f20040a.containsKey(l2) && (numRemove = this.f20040a.remove(l2)) != null) {
                this.f20041b -= (long) numRemove.intValue();
            }
        }
    }
}
