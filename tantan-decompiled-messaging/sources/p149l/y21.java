package p149l;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class y21 {

    /* JADX INFO: renamed from: a */
    public final int f195476a;

    /* JADX INFO: renamed from: l.y21$a */
    public static final class C21284a extends y21 {

        /* JADX INFO: renamed from: b */
        public final long f195477b;

        /* JADX INFO: renamed from: c */
        public final List<C21285b> f195478c;

        /* JADX INFO: renamed from: d */
        public final List<C21284a> f195479d;

        public C21284a(int i, long j) {
            super(i);
            this.f195477b = j;
            this.f195478c = new ArrayList();
            this.f195479d = new ArrayList();
        }

        /* JADX INFO: renamed from: d */
        public void m212344d(C21284a c21284a) {
            this.f195479d.add(c21284a);
        }

        /* JADX INFO: renamed from: e */
        public void m212345e(C21285b c21285b) {
            this.f195478c.add(c21285b);
        }

        @Nullable
        /* JADX INFO: renamed from: f */
        public C21284a m212346f(int i) {
            int size = this.f195479d.size();
            for (int i2 = 0; i2 < size; i2++) {
                C21284a c21284a = this.f195479d.get(i2);
                if (c21284a.f195476a == i) {
                    return c21284a;
                }
            }
            return null;
        }

        @Nullable
        /* JADX INFO: renamed from: g */
        public C21285b m212347g(int i) {
            int size = this.f195478c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C21285b c21285b = this.f195478c.get(i2);
                if (c21285b.f195476a == i) {
                    return c21285b;
                }
            }
            return null;
        }

        @Override // p149l.y21
        public String toString() {
            return y21.m212341a(this.f195476a) + " leaves: " + Arrays.toString(this.f195478c.toArray()) + " containers: " + Arrays.toString(this.f195479d.toArray());
        }
    }

    /* JADX INFO: renamed from: l.y21$b */
    public static final class C21285b extends y21 {

        /* JADX INFO: renamed from: b */
        public final d860 f195480b;

        public C21285b(int i, d860 d860Var) {
            super(i);
            this.f195480b = d860Var;
        }
    }

    public y21(int i) {
        this.f195476a = i;
    }

    /* JADX INFO: renamed from: a */
    public static String m212341a(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    /* JADX INFO: renamed from: b */
    public static int m212342b(int i) {
        return i & 16777215;
    }

    /* JADX INFO: renamed from: c */
    public static int m212343c(int i) {
        return (i >> 24) & 255;
    }

    public String toString() {
        return m212341a(this.f195476a);
    }
}
