package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface m6j0 {

    /* JADX INFO: renamed from: l.m6j0$a */
    public static final class C18401a {

        /* JADX INFO: renamed from: a */
        public final int f131700a;

        /* JADX INFO: renamed from: b */
        public final byte[] f131701b;

        /* JADX INFO: renamed from: c */
        public final int f131702c;

        /* JADX INFO: renamed from: d */
        public final int f131703d;

        public C18401a(int i, byte[] bArr, int i2, int i3) {
            this.f131700a = i;
            this.f131701b = bArr;
            this.f131702c = i2;
            this.f131703d = i3;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C18401a.class == obj.getClass()) {
                C18401a c18401a = (C18401a) obj;
                if (this.f131700a == c18401a.f131700a && this.f131702c == c18401a.f131702c && this.f131703d == c18401a.f131703d && Arrays.equals(this.f131701b, c18401a.f131701b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f131700a * 31) + Arrays.hashCode(this.f131701b)) * 31) + this.f131702c) * 31) + this.f131703d;
        }
    }

    /* JADX INFO: renamed from: a */
    void mo11109a(long j, int i, int i2, int i3, @Nullable C18401a c18401a);

    /* JADX INFO: renamed from: b */
    void mo11110b(C1871k c1871k);

    /* JADX INFO: renamed from: c */
    int mo11111c(w4c w4cVar, int i, boolean z, int i2) throws IOException;

    /* JADX INFO: renamed from: d */
    default void m153238d(d860 d860Var, int i) {
        mo11112f(d860Var, i, 0);
    }

    /* JADX INFO: renamed from: e */
    default int m153239e(w4c w4cVar, int i, boolean z) throws IOException {
        return mo11111c(w4cVar, i, z, 0);
    }

    /* JADX INFO: renamed from: f */
    void mo11112f(d860 d860Var, int i, int i2);
}
