package p153l;

import com.google.common.primitives.Booleans;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public abstract class do5 {

    /* JADX INFO: renamed from: a */
    public static final do5 f89871a = new C16589a();

    /* JADX INFO: renamed from: b */
    public static final do5 f89872b = new C16590b(-1);

    /* JADX INFO: renamed from: c */
    public static final do5 f89873c = new C16590b(1);

    /* JADX INFO: renamed from: l.do5$a */
    public class C16589a extends do5 {
        public C16589a() {
            super(null);
        }

        @Override // p153l.do5
        /* JADX INFO: renamed from: d */
        public do5 mo117167d(int i, int i2) {
            return m117174l(Ints.m16515e(i, i2));
        }

        @Override // p153l.do5
        /* JADX INFO: renamed from: e */
        public do5 mo117168e(long j, long j2) {
            return m117174l(Longs.m16527c(j, j2));
        }

        @Override // p153l.do5
        /* JADX INFO: renamed from: f */
        public do5 mo117169f(Comparable<?> comparable, Comparable<?> comparable2) {
            return m117174l(comparable.compareTo(comparable2));
        }

        @Override // p153l.do5
        /* JADX INFO: renamed from: g */
        public <T> do5 mo117170g(T t, T t2, Comparator<T> comparator) {
            return m117174l(comparator.compare(t, t2));
        }

        @Override // p153l.do5
        /* JADX INFO: renamed from: h */
        public do5 mo117171h(boolean z, boolean z2) {
            return m117174l(Booleans.m16436c(z, z2));
        }

        @Override // p153l.do5
        /* JADX INFO: renamed from: i */
        public do5 mo117172i(boolean z, boolean z2) {
            return m117174l(Booleans.m16436c(z2, z));
        }

        @Override // p153l.do5
        /* JADX INFO: renamed from: j */
        public int mo117173j() {
            return 0;
        }

        /* JADX INFO: renamed from: l */
        public do5 m117174l(int i) {
            if (i < 0) {
                return do5.f89872b;
            }
            return i > 0 ? do5.f89873c : do5.f89871a;
        }
    }

    public /* synthetic */ do5(C16589a c16589a) {
        this();
    }

    /* JADX INFO: renamed from: k */
    public static do5 m117166k() {
        return f89871a;
    }

    /* JADX INFO: renamed from: d */
    public abstract do5 mo117167d(int i, int i2);

    /* JADX INFO: renamed from: e */
    public abstract do5 mo117168e(long j, long j2);

    /* JADX INFO: renamed from: f */
    public abstract do5 mo117169f(Comparable<?> comparable, Comparable<?> comparable2);

    /* JADX INFO: renamed from: g */
    public abstract <T> do5 mo117170g(T t, T t2, Comparator<T> comparator);

    /* JADX INFO: renamed from: h */
    public abstract do5 mo117171h(boolean z, boolean z2);

    /* JADX INFO: renamed from: i */
    public abstract do5 mo117172i(boolean z, boolean z2);

    /* JADX INFO: renamed from: j */
    public abstract int mo117173j();

    public do5() {
    }

    /* JADX INFO: renamed from: l.do5$b */
    public static final class C16590b extends do5 {

        /* JADX INFO: renamed from: d */
        public final int f89874d;

        public C16590b(int i) {
            super(null);
            this.f89874d = i;
        }

        @Override // p153l.do5
        /* JADX INFO: renamed from: j */
        public int mo117173j() {
            return this.f89874d;
        }

        @Override // p153l.do5
        /* JADX INFO: renamed from: d */
        public do5 mo117167d(int i, int i2) {
            return this;
        }

        @Override // p153l.do5
        /* JADX INFO: renamed from: e */
        public do5 mo117168e(long j, long j2) {
            return this;
        }

        @Override // p153l.do5
        /* JADX INFO: renamed from: f */
        public do5 mo117169f(Comparable<?> comparable, Comparable<?> comparable2) {
            return this;
        }

        @Override // p153l.do5
        /* JADX INFO: renamed from: h */
        public do5 mo117171h(boolean z, boolean z2) {
            return this;
        }

        @Override // p153l.do5
        /* JADX INFO: renamed from: i */
        public do5 mo117172i(boolean z, boolean z2) {
            return this;
        }

        @Override // p153l.do5
        /* JADX INFO: renamed from: g */
        public <T> do5 mo117170g(T t, T t2, Comparator<T> comparator) {
            return this;
        }
    }
}
