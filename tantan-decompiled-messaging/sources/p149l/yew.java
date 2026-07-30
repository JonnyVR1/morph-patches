package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class yew<T, Y> {

    /* JADX INFO: renamed from: a */
    private final Map<T, Y> f197964a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b */
    private final long f197965b;

    /* JADX INFO: renamed from: c */
    private long f197966c;

    /* JADX INFO: renamed from: d */
    private long f197967d;

    public yew(long j) {
        this.f197965b = j;
        this.f197966c = j;
    }

    /* JADX INFO: renamed from: f */
    private void m214439f() {
        m214445m(this.f197966c);
    }

    /* JADX INFO: renamed from: b */
    public void m214440b() {
        m214445m(0L);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public synchronized Y m214441g(@NonNull T t) {
        return this.f197964a.get(t);
    }

    /* JADX INFO: renamed from: h */
    public synchronized long m214442h() {
        return this.f197966c;
    }

    /* JADX INFO: renamed from: i */
    public int mo111506i(@Nullable Y y) {
        return 1;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public synchronized Y m214443k(@NonNull T t, @Nullable Y y) {
        long jMo111506i = mo111506i(y);
        if (jMo111506i >= this.f197966c) {
            mo110110j(t, y);
            return null;
        }
        if (y != null) {
            this.f197967d += jMo111506i;
        }
        Y yPut = this.f197964a.put(t, y);
        if (yPut != null) {
            this.f197967d -= (long) mo111506i(yPut);
            if (!yPut.equals(y)) {
                mo110110j(t, yPut);
            }
        }
        m214439f();
        return yPut;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public synchronized Y m214444l(@NonNull T t) {
        Y yRemove;
        yRemove = this.f197964a.remove(t);
        if (yRemove != null) {
            this.f197967d -= (long) mo111506i(yRemove);
        }
        return yRemove;
    }

    /* JADX INFO: renamed from: m */
    public synchronized void m214445m(long j) {
        while (this.f197967d > j) {
            Iterator<Map.Entry<T, Y>> it = this.f197964a.entrySet().iterator();
            Map.Entry<T, Y> next = it.next();
            Y value = next.getValue();
            this.f197967d -= (long) mo111506i(value);
            T key = next.getKey();
            it.remove();
            mo110110j(key, value);
        }
    }

    /* JADX INFO: renamed from: j */
    public void mo110110j(@NonNull T t, @Nullable Y y) {
    }
}
