package p153l;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ypd0 {

    /* JADX INFO: renamed from: a */
    @GuardedBy("this")
    public final TreeSet<C21655a> f201055a = new TreeSet<>(new Comparator() { // from class: l.xpd0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ypd0.m217012c(((ypd0.C21655a) obj).f201059a.f190289g, ((ypd0.C21655a) obj2).f201059a.f190289g);
        }
    });

    /* JADX INFO: renamed from: b */
    @GuardedBy("this")
    public int f201056b;

    /* JADX INFO: renamed from: c */
    @GuardedBy("this")
    public int f201057c;

    /* JADX INFO: renamed from: d */
    @GuardedBy("this")
    public boolean f201058d;

    /* JADX INFO: renamed from: l.ypd0$a */
    public static final class C21655a {

        /* JADX INFO: renamed from: a */
        public final wpd0 f201059a;

        /* JADX INFO: renamed from: b */
        public final long f201060b;

        public C21655a(wpd0 wpd0Var, long j) {
            this.f201059a = wpd0Var;
            this.f201060b = j;
        }
    }

    public ypd0() {
        m217016f();
    }

    /* JADX INFO: renamed from: c */
    public static int m217012c(int i, int i2) {
        int iMin;
        int i3 = i - i2;
        if (Math.abs(i3) <= 1000 || (iMin = (Math.min(i, i2) - Math.max(i, i2)) + p7f.COLOR_SPACE_UNCALIBRATED) >= 1000) {
            return i3;
        }
        return i < i2 ? iMin : -iMin;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m217013b(C21655a c21655a) {
        this.f201056b = c21655a.f201059a.f190289g;
        this.f201055a.add(c21655a);
    }

    /* JADX INFO: renamed from: d */
    public synchronized boolean m217014d(wpd0 wpd0Var, long j) {
        if (this.f201055a.size() >= 5000) {
            throw new IllegalStateException("Queue size limit of 5000 reached.");
        }
        int i = wpd0Var.f190289g;
        if (!this.f201058d) {
            m217016f();
            this.f201057c = wpd0.m207435c(i);
            this.f201058d = true;
            m217013b(new C21655a(wpd0Var, j));
            return true;
        }
        if (Math.abs(m217012c(i, wpd0.m207434b(this.f201056b))) < 1000) {
            if (m217012c(i, this.f201057c) <= 0) {
                return false;
            }
            m217013b(new C21655a(wpd0Var, j));
            return true;
        }
        this.f201057c = wpd0.m207435c(i);
        this.f201055a.clear();
        m217013b(new C21655a(wpd0Var, j));
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public synchronized wpd0 m217015e(long j) {
        if (this.f201055a.isEmpty()) {
            return null;
        }
        C21655a c21655aFirst = this.f201055a.first();
        int i = c21655aFirst.f201059a.f190289g;
        if (i != wpd0.m207434b(this.f201057c) && j < c21655aFirst.f201060b) {
            return null;
        }
        this.f201055a.pollFirst();
        this.f201057c = i;
        return c21655aFirst.f201059a;
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m217016f() {
        this.f201055a.clear();
        this.f201058d = false;
        this.f201057c = -1;
        this.f201056b = -1;
    }
}
