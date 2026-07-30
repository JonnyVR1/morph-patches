package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class wgw<T, Y> {

    /* JADX INFO: renamed from: a */
    private final Map<T, C21105a<Y>> f189012a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b */
    private final long f189013b;

    /* JADX INFO: renamed from: c */
    private long f189014c;

    /* JADX INFO: renamed from: d */
    private long f189015d;

    /* JADX INFO: renamed from: l.wgw$a */
    public static final class C21105a<Y> {

        /* JADX INFO: renamed from: a */
        final Y f189016a;

        /* JADX INFO: renamed from: b */
        final int f189017b;

        public C21105a(Y y, int i) {
            this.f189016a = y;
            this.f189017b = i;
        }
    }

    public wgw(long j) {
        this.f189013b = j;
        this.f189014c = j;
    }

    /* JADX INFO: renamed from: f */
    private void m206265f() {
        m206271m(this.f189014c);
    }

    /* JADX INFO: renamed from: b */
    public void m206266b() {
        m206271m(0L);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public synchronized Y m206267g(@NonNull T t) {
        C21105a<Y> c21105a;
        c21105a = this.f189012a.get(t);
        return c21105a != null ? c21105a.f189016a : null;
    }

    /* JADX INFO: renamed from: h */
    public synchronized long m206268h() {
        return this.f189014c;
    }

    /* JADX INFO: renamed from: i */
    public int mo104374i(@Nullable Y y) {
        return 1;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public synchronized Y m206269k(@NonNull T t, @Nullable Y y) {
        int iMo104374i = mo104374i(y);
        long j = iMo104374i;
        if (j >= this.f189014c) {
            mo104375j(t, y);
            return null;
        }
        if (y != null) {
            this.f189015d += j;
        }
        C21105a<Y> c21105aPut = this.f189012a.put(t, y == null ? null : new C21105a<>(y, iMo104374i));
        if (c21105aPut != null) {
            this.f189015d -= (long) c21105aPut.f189017b;
            if (!c21105aPut.f189016a.equals(y)) {
                mo104375j(t, c21105aPut.f189016a);
            }
        }
        m206265f();
        return c21105aPut != null ? c21105aPut.f189016a : null;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public synchronized Y m206270l(@NonNull T t) {
        C21105a<Y> c21105aRemove = this.f189012a.remove(t);
        if (c21105aRemove == null) {
            return null;
        }
        this.f189015d -= (long) c21105aRemove.f189017b;
        return c21105aRemove.f189016a;
    }

    /* JADX INFO: renamed from: m */
    public synchronized void m206271m(long j) {
        while (this.f189015d > j) {
            Iterator<Map.Entry<T, C21105a<Y>>> it = this.f189012a.entrySet().iterator();
            Map.Entry<T, C21105a<Y>> next = it.next();
            C21105a<Y> value = next.getValue();
            this.f189015d -= (long) value.f189017b;
            T key = next.getKey();
            it.remove();
            mo104375j(key, value.f189016a);
        }
    }

    /* JADX INFO: renamed from: j */
    public void mo104375j(@NonNull T t, @Nullable Y y) {
    }
}
