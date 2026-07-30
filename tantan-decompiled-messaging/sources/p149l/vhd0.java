package p149l;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class vhd0 {

    /* JADX INFO: renamed from: a */
    @GuardedBy("this")
    public final TreeSet<C20645a> f181490a = new TreeSet<>(new Comparator() { // from class: l.uhd0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return vhd0.m198437c(((vhd0.C20645a) obj).f181494a.f170228g, ((vhd0.C20645a) obj2).f181494a.f170228g);
        }
    });

    /* JADX INFO: renamed from: b */
    @GuardedBy("this")
    public int f181491b;

    /* JADX INFO: renamed from: c */
    @GuardedBy("this")
    public int f181492c;

    /* JADX INFO: renamed from: d */
    @GuardedBy("this")
    public boolean f181493d;

    /* JADX INFO: renamed from: l.vhd0$a */
    public static final class C20645a {

        /* JADX INFO: renamed from: a */
        public final thd0 f181494a;

        /* JADX INFO: renamed from: b */
        public final long f181495b;

        public C20645a(thd0 thd0Var, long j) {
            this.f181494a = thd0Var;
            this.f181495b = j;
        }
    }

    public vhd0() {
        m198441f();
    }

    /* JADX INFO: renamed from: c */
    public static int m198437c(int i, int i2) {
        int iMin;
        int i3 = i - i2;
        if (Math.abs(i3) <= 1000 || (iMin = (Math.min(i, i2) - Math.max(i, i2)) + j6f.COLOR_SPACE_UNCALIBRATED) >= 1000) {
            return i3;
        }
        return i < i2 ? iMin : -iMin;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m198438b(C20645a c20645a) {
        this.f181491b = c20645a.f181494a.f170228g;
        this.f181490a.add(c20645a);
    }

    /* JADX INFO: renamed from: d */
    public synchronized boolean m198439d(thd0 thd0Var, long j) {
        if (this.f181490a.size() >= 5000) {
            throw new IllegalStateException("Queue size limit of 5000 reached.");
        }
        int i = thd0Var.f170228g;
        if (!this.f181493d) {
            m198441f();
            this.f181492c = thd0.m188882c(i);
            this.f181493d = true;
            m198438b(new C20645a(thd0Var, j));
            return true;
        }
        if (Math.abs(m198437c(i, thd0.m188881b(this.f181491b))) < 1000) {
            if (m198437c(i, this.f181492c) <= 0) {
                return false;
            }
            m198438b(new C20645a(thd0Var, j));
            return true;
        }
        this.f181492c = thd0.m188882c(i);
        this.f181490a.clear();
        m198438b(new C20645a(thd0Var, j));
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public synchronized thd0 m198440e(long j) {
        if (this.f181490a.isEmpty()) {
            return null;
        }
        C20645a c20645aFirst = this.f181490a.first();
        int i = c20645aFirst.f181494a.f170228g;
        if (i != thd0.m188881b(this.f181492c) && j < c20645aFirst.f181495b) {
            return null;
        }
        this.f181490a.pollFirst();
        this.f181492c = i;
        return c20645aFirst.f181494a;
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m198441f() {
        this.f181490a.clear();
        this.f181493d = false;
        this.f181492c = -1;
        this.f181491b = -1;
    }
}
