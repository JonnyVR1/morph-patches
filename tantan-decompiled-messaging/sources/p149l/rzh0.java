package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p133rx.C22306c;
import p133rx.Notification;

/* JADX INFO: loaded from: classes11.dex */
public class rzh0 {

    /* JADX INFO: renamed from: a */
    public final Map<Long, Integer> f161661a;

    /* JADX INFO: renamed from: b */
    public volatile long f161662b;

    public rzh0() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f161661a = concurrentHashMap;
        concurrentHashMap.clear();
        this.f161662b = 0L;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Notification m181750b(Long l2, Notification notification) {
        CoreModule.f17545c.f19570H0.m210371p5(l2);
        return notification;
    }

    /* JADX INFO: renamed from: e */
    public static <T> C22306c.d<T, T> m181751e(final Long l2) {
        return new C22306c.d() { // from class: l.pzh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((C22306c) obj).materialize().map(new w9j() { // from class: l.qzh0
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return rzh0.m181750b(l, (Notification) obj2);
                    }
                }).dematerialize();
            }
        };
    }

    /* JADX INFO: renamed from: c */
    public long m181752c(long j) {
        if (this.f161662b > 0) {
            j -= this.f161662b;
        }
        if (j > 0) {
            return j;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: d */
    public synchronized Long m181753d(String str, int i) {
        if (!TextUtils.equals(str, xob.m210300i4(true))) {
            return null;
        }
        Long lValueOf = Long.valueOf(mqi0.m155944o());
        this.f161661a.put(lValueOf, Integer.valueOf(i));
        this.f161662b += (long) i;
        return lValueOf;
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m181754f(Long l2) {
        Integer numRemove;
        if (l2 != null) {
            if (this.f161661a.containsKey(l2) && (numRemove = this.f161661a.remove(l2)) != null) {
                this.f161662b -= (long) numRemove.intValue();
            }
        }
    }
}
