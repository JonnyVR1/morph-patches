package p153l;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.AbstractC1857c0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.InterfaceC2090y;
import com.google.android.exoplayer2.source.InterfaceC1988i;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class nxw extends cgj0 {

    /* JADX INFO: renamed from: c */
    @Nullable
    public C18992a f144261c;

    /* JADX INFO: renamed from: l.nxw$a */
    public static final class C18992a {

        /* JADX INFO: renamed from: a */
        public final int f144262a;

        /* JADX INFO: renamed from: b */
        public final String[] f144263b;

        /* JADX INFO: renamed from: c */
        public final int[] f144264c;

        /* JADX INFO: renamed from: d */
        public final ffj0[] f144265d;

        /* JADX INFO: renamed from: e */
        public final int[] f144266e;

        /* JADX INFO: renamed from: f */
        public final int[][][] f144267f;

        /* JADX INFO: renamed from: g */
        public final ffj0 f144268g;

        @VisibleForTesting
        public C18992a(String[] strArr, int[] iArr, ffj0[] ffj0VarArr, int[] iArr2, int[][][] iArr3, ffj0 ffj0Var) {
            this.f144263b = strArr;
            this.f144264c = iArr;
            this.f144265d = ffj0VarArr;
            this.f144267f = iArr3;
            this.f144266e = iArr2;
            this.f144268g = ffj0Var;
            this.f144262a = iArr.length;
        }

        /* JADX INFO: renamed from: a */
        public int m165289a(int i, int i2, boolean z) {
            int i3 = this.f144265d[i].m125387b(i2).f88159a;
            int[] iArr = new int[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                int iM165295g = m165295g(i, i2, i5);
                if (iM165295g == 4 || (z && iM165295g == 3)) {
                    iArr[i4] = i5;
                    i4++;
                }
            }
            return m165290b(i, i2, Arrays.copyOf(iArr, i4));
        }

        /* JADX INFO: renamed from: b */
        public int m165290b(int i, int i2, int[] iArr) {
            int i3 = 0;
            int iMin = 16;
            String str = null;
            boolean z = false;
            int i4 = 0;
            while (i3 < iArr.length) {
                String str2 = this.f144265d[i].m125387b(i2).m115519c(iArr[i3]).f7785l;
                int i5 = i4 + 1;
                if (i4 == 0) {
                    str = str2;
                } else {
                    z |= !bmk0.m105123c(str, str2);
                }
                iMin = Math.min(iMin, InterfaceC2090y.m12259e(this.f144267f[i][i2][i3]));
                i3++;
                i4 = i5;
            }
            return z ? Math.min(iMin, this.f144266e[i]) : iMin;
        }

        /* JADX INFO: renamed from: c */
        public int m165291c(int i, int i2, int i3) {
            return this.f144267f[i][i2][i3];
        }

        /* JADX INFO: renamed from: d */
        public int m165292d() {
            return this.f144262a;
        }

        /* JADX INFO: renamed from: e */
        public int m165293e(int i) {
            return this.f144264c[i];
        }

        /* JADX INFO: renamed from: f */
        public ffj0 m165294f(int i) {
            return this.f144265d[i];
        }

        /* JADX INFO: renamed from: g */
        public int m165295g(int i, int i2, int i3) {
            return InterfaceC2090y.m12262p(m165291c(i, i2, i3));
        }

        /* JADX INFO: renamed from: h */
        public ffj0 m165296h() {
            return this.f144268g;
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m165286n(InterfaceC2090y[] interfaceC2090yArr, dfj0 dfj0Var, int[] iArr, boolean z) throws ExoPlaybackException {
        int length = interfaceC2090yArr.length;
        int i = 0;
        boolean z2 = true;
        for (int i2 = 0; i2 < interfaceC2090yArr.length; i2++) {
            InterfaceC2090y interfaceC2090y = interfaceC2090yArr[i2];
            int iMax = 0;
            for (int i3 = 0; i3 < dfj0Var.f88159a; i3++) {
                iMax = Math.max(iMax, InterfaceC2090y.m12262p(interfaceC2090y.mo10438a(dfj0Var.m115519c(i3))));
            }
            boolean z3 = iArr[i2] == 0;
            if (iMax > i || (iMax == i && z && !z2 && z3)) {
                length = i2;
                z2 = z3;
                i = iMax;
            }
        }
        return length;
    }

    /* JADX INFO: renamed from: o */
    public static int[] m165287o(InterfaceC2090y interfaceC2090y, dfj0 dfj0Var) throws ExoPlaybackException {
        int[] iArr = new int[dfj0Var.f88159a];
        for (int i = 0; i < dfj0Var.f88159a; i++) {
            iArr[i] = interfaceC2090y.mo10438a(dfj0Var.m115519c(i));
        }
        return iArr;
    }

    /* JADX INFO: renamed from: p */
    public static int[] m165288p(InterfaceC2090y[] interfaceC2090yArr) throws ExoPlaybackException {
        int length = interfaceC2090yArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = interfaceC2090yArr[i].mo9815C();
        }
        return iArr;
    }

    @Override // p153l.cgj0
    /* JADX INFO: renamed from: i */
    public final void mo109695i(@Nullable Object obj) {
        this.f144261c = (C18992a) obj;
    }

    @Override // p153l.cgj0
    /* JADX INFO: renamed from: k */
    public final dgj0 mo109696k(InterfaceC2090y[] interfaceC2090yArr, ffj0 ffj0Var, InterfaceC1988i.b bVar, AbstractC1857c0 abstractC1857c0) throws ExoPlaybackException {
        int[] iArr = new int[interfaceC2090yArr.length + 1];
        int length = interfaceC2090yArr.length + 1;
        dfj0[][] dfj0VarArr = new dfj0[length][];
        int[][][] iArr2 = new int[interfaceC2090yArr.length + 1][][];
        for (int i = 0; i < length; i++) {
            int i2 = ffj0Var.f98785a;
            dfj0VarArr[i] = new dfj0[i2];
            iArr2[i] = new int[i2][];
        }
        int[] iArrM165288p = m165288p(interfaceC2090yArr);
        for (int i3 = 0; i3 < ffj0Var.f98785a; i3++) {
            dfj0 dfj0VarM125387b = ffj0Var.m125387b(i3);
            int iM165286n = m165286n(interfaceC2090yArr, dfj0VarM125387b, iArr, dfj0VarM125387b.f88161c == 5);
            int[] iArrM165287o = iM165286n == interfaceC2090yArr.length ? new int[dfj0VarM125387b.f88159a] : m165287o(interfaceC2090yArr[iM165286n], dfj0VarM125387b);
            int i4 = iArr[iM165286n];
            dfj0VarArr[iM165286n][i4] = dfj0VarM125387b;
            iArr2[iM165286n][i4] = iArrM165287o;
            iArr[iM165286n] = i4 + 1;
        }
        ffj0[] ffj0VarArr = new ffj0[interfaceC2090yArr.length];
        String[] strArr = new String[interfaceC2090yArr.length];
        int[] iArr3 = new int[interfaceC2090yArr.length];
        for (int i5 = 0; i5 < interfaceC2090yArr.length; i5++) {
            int i6 = iArr[i5];
            ffj0VarArr[i5] = new ffj0((dfj0[]) bmk0.m105094O0(dfj0VarArr[i5], i6));
            iArr2[i5] = (int[][]) bmk0.m105094O0(iArr2[i5], i6);
            strArr[i5] = interfaceC2090yArr[i5].getName();
            iArr3[i5] = interfaceC2090yArr[i5].getTrackType();
        }
        C18992a c18992a = new C18992a(strArr, iArr3, ffj0VarArr, iArrM165288p, iArr2, new ffj0((dfj0[]) bmk0.m105094O0(dfj0VarArr[interfaceC2090yArr.length], iArr[interfaceC2090yArr.length])));
        Pair<jzc0[], u9f[]> pairMo100070q = mo100070q(c18992a, iArr2, iArrM165288p, bVar, abstractC1857c0);
        return new dgj0((jzc0[]) pairMo100070q.first, (u9f[]) pairMo100070q.second, bgj0.m104225b(c18992a, (vfj0[]) pairMo100070q.second), c18992a);
    }

    /* JADX INFO: renamed from: q */
    public abstract Pair<jzc0[], u9f[]> mo100070q(C18992a c18992a, int[][][] iArr, int[] iArr2, InterfaceC1988i.b bVar, AbstractC1857c0 abstractC1857c0) throws ExoPlaybackException;
}
