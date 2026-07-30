package p149l;

import com.google.common.primitives.Booleans;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zm5 {

    /* JADX INFO: renamed from: a */
    public static final zm5 f203693a = new C21727a();

    /* JADX INFO: renamed from: b */
    public static final zm5 f203694b = new C21728b(-1);

    /* JADX INFO: renamed from: c */
    public static final zm5 f203695c = new C21728b(1);

    /* JADX INFO: renamed from: l.zm5$a */
    public class C21727a extends zm5 {
        public C21727a() {
            super(null);
        }

        @Override // p149l.zm5
        /* JADX INFO: renamed from: d */
        public zm5 mo219306d(int i, int i2) {
            return m219313l(Ints.m16460e(i, i2));
        }

        @Override // p149l.zm5
        /* JADX INFO: renamed from: e */
        public zm5 mo219307e(long j, long j2) {
            return m219313l(Longs.m16472c(j, j2));
        }

        @Override // p149l.zm5
        /* JADX INFO: renamed from: f */
        public zm5 mo219308f(Comparable<?> comparable, Comparable<?> comparable2) {
            return m219313l(comparable.compareTo(comparable2));
        }

        @Override // p149l.zm5
        /* JADX INFO: renamed from: g */
        public <T> zm5 mo219309g(T t, T t2, Comparator<T> comparator) {
            return m219313l(comparator.compare(t, t2));
        }

        @Override // p149l.zm5
        /* JADX INFO: renamed from: h */
        public zm5 mo219310h(boolean z, boolean z2) {
            return m219313l(Booleans.m16381c(z, z2));
        }

        @Override // p149l.zm5
        /* JADX INFO: renamed from: i */
        public zm5 mo219311i(boolean z, boolean z2) {
            return m219313l(Booleans.m16381c(z2, z));
        }

        @Override // p149l.zm5
        /* JADX INFO: renamed from: j */
        public int mo219312j() {
            return 0;
        }

        /* JADX INFO: renamed from: l */
        public zm5 m219313l(int i) {
            if (i < 0) {
                return zm5.f203694b;
            }
            return i > 0 ? zm5.f203695c : zm5.f203693a;
        }
    }

    public /* synthetic */ zm5(C21727a c21727a) {
        this();
    }

    /* JADX INFO: renamed from: k */
    public static zm5 m219305k() {
        return f203693a;
    }

    /* JADX INFO: renamed from: d */
    public abstract zm5 mo219306d(int i, int i2);

    /* JADX INFO: renamed from: e */
    public abstract zm5 mo219307e(long j, long j2);

    /* JADX INFO: renamed from: f */
    public abstract zm5 mo219308f(Comparable<?> comparable, Comparable<?> comparable2);

    /* JADX INFO: renamed from: g */
    public abstract <T> zm5 mo219309g(T t, T t2, Comparator<T> comparator);

    /* JADX INFO: renamed from: h */
    public abstract zm5 mo219310h(boolean z, boolean z2);

    /* JADX INFO: renamed from: i */
    public abstract zm5 mo219311i(boolean z, boolean z2);

    /* JADX INFO: renamed from: j */
    public abstract int mo219312j();

    public zm5() {
    }

    /* JADX INFO: renamed from: l.zm5$b */
    public static final class C21728b extends zm5 {

        /* JADX INFO: renamed from: d */
        public final int f203696d;

        public C21728b(int i) {
            super(null);
            this.f203696d = i;
        }

        @Override // p149l.zm5
        /* JADX INFO: renamed from: j */
        public int mo219312j() {
            return this.f203696d;
        }

        @Override // p149l.zm5
        /* JADX INFO: renamed from: d */
        public zm5 mo219306d(int i, int i2) {
            return this;
        }

        @Override // p149l.zm5
        /* JADX INFO: renamed from: e */
        public zm5 mo219307e(long j, long j2) {
            return this;
        }

        @Override // p149l.zm5
        /* JADX INFO: renamed from: f */
        public zm5 mo219308f(Comparable<?> comparable, Comparable<?> comparable2) {
            return this;
        }

        @Override // p149l.zm5
        /* JADX INFO: renamed from: h */
        public zm5 mo219310h(boolean z, boolean z2) {
            return this;
        }

        @Override // p149l.zm5
        /* JADX INFO: renamed from: i */
        public zm5 mo219311i(boolean z, boolean z2) {
            return this;
        }

        @Override // p149l.zm5
        /* JADX INFO: renamed from: g */
        public <T> zm5 mo219309g(T t, T t2, Comparator<T> comparator) {
            return this;
        }
    }
}
