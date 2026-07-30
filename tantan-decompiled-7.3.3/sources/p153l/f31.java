package p153l;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class f31 {

    /* JADX INFO: renamed from: a */
    public final int f96940a;

    /* JADX INFO: renamed from: l.f31$a */
    public static final class C16879a extends f31 {

        /* JADX INFO: renamed from: b */
        public final long f96941b;

        /* JADX INFO: renamed from: c */
        public final List<C16880b> f96942c;

        /* JADX INFO: renamed from: d */
        public final List<C16879a> f96943d;

        public C16879a(int i, long j) {
            super(i);
            this.f96941b = j;
            this.f96942c = new ArrayList();
            this.f96943d = new ArrayList();
        }

        /* JADX INFO: renamed from: d */
        public void m123700d(C16879a c16879a) {
            this.f96943d.add(c16879a);
        }

        /* JADX INFO: renamed from: e */
        public void m123701e(C16880b c16880b) {
            this.f96942c.add(c16880b);
        }

        @Nullable
        /* JADX INFO: renamed from: f */
        public C16879a m123702f(int i) {
            int size = this.f96943d.size();
            for (int i2 = 0; i2 < size; i2++) {
                C16879a c16879a = this.f96943d.get(i2);
                if (c16879a.f96940a == i) {
                    return c16879a;
                }
            }
            return null;
        }

        @Nullable
        /* JADX INFO: renamed from: g */
        public C16880b m123703g(int i) {
            int size = this.f96942c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C16880b c16880b = this.f96942c.get(i2);
                if (c16880b.f96940a == i) {
                    return c16880b;
                }
            }
            return null;
        }

        @Override // p153l.f31
        public String toString() {
            return f31.m123697a(this.f96940a) + " leaves: " + Arrays.toString(this.f96942c.toArray()) + " containers: " + Arrays.toString(this.f96943d.toArray());
        }
    }

    /* JADX INFO: renamed from: l.f31$b */
    public static final class C16880b extends f31 {

        /* JADX INFO: renamed from: b */
        public final ig60 f96944b;

        public C16880b(int i, ig60 ig60Var) {
            super(i);
            this.f96944b = ig60Var;
        }
    }

    public f31(int i) {
        this.f96940a = i;
    }

    /* JADX INFO: renamed from: a */
    public static String m123697a(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    /* JADX INFO: renamed from: b */
    public static int m123698b(int i) {
        return i & 16777215;
    }

    /* JADX INFO: renamed from: c */
    public static int m123699c(int i) {
        return (i >> 24) & 255;
    }

    public String toString() {
        return m123697a(this.f96940a);
    }
}
