package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface qfj0 {

    /* JADX INFO: renamed from: l.qfj0$a */
    public static final class C19562a {

        /* JADX INFO: renamed from: a */
        public final int f157305a;

        /* JADX INFO: renamed from: b */
        public final byte[] f157306b;

        /* JADX INFO: renamed from: c */
        public final int f157307c;

        /* JADX INFO: renamed from: d */
        public final int f157308d;

        public C19562a(int i, byte[] bArr, int i2, int i3) {
            this.f157305a = i;
            this.f157306b = bArr;
            this.f157307c = i2;
            this.f157308d = i3;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C19562a.class == obj.getClass()) {
                C19562a c19562a = (C19562a) obj;
                if (this.f157305a == c19562a.f157305a && this.f157307c == c19562a.f157307c && this.f157308d == c19562a.f157308d && Arrays.equals(this.f157306b, c19562a.f157306b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f157305a * 31) + Arrays.hashCode(this.f157306b)) * 31) + this.f157307c) * 31) + this.f157308d;
        }
    }

    /* JADX INFO: renamed from: a */
    void mo11163a(long j, int i, int i2, int i3, @Nullable C19562a c19562a);

    /* JADX INFO: renamed from: b */
    void mo11164b(C1894k c1894k);

    /* JADX INFO: renamed from: c */
    int mo11165c(e6c e6cVar, int i, boolean z, int i2) throws IOException;

    /* JADX INFO: renamed from: d */
    default void m176370d(ig60 ig60Var, int i) {
        mo11166f(ig60Var, i, 0);
    }

    /* JADX INFO: renamed from: e */
    default int m176371e(e6c e6cVar, int i, boolean z) throws IOException {
        return mo11165c(e6cVar, i, z, 0);
    }

    /* JADX INFO: renamed from: f */
    void mo11166f(ig60 ig60Var, int i, int i2);
}
