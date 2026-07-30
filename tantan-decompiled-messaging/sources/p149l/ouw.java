package p149l;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.AbstractC1834c0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.InterfaceC2067y;
import com.google.android.exoplayer2.source.InterfaceC1965i;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class ouw extends y6j0 {

    /* JADX INFO: renamed from: c */
    @Nullable
    public C19047a f145742c;

    /* JADX INFO: renamed from: l.ouw$a */
    public static final class C19047a {

        /* JADX INFO: renamed from: a */
        public final int f145743a;

        /* JADX INFO: renamed from: b */
        public final String[] f145744b;

        /* JADX INFO: renamed from: c */
        public final int[] f145745c;

        /* JADX INFO: renamed from: d */
        public final b6j0[] f145746d;

        /* JADX INFO: renamed from: e */
        public final int[] f145747e;

        /* JADX INFO: renamed from: f */
        public final int[][][] f145748f;

        /* JADX INFO: renamed from: g */
        public final b6j0 f145749g;

        @VisibleForTesting
        public C19047a(String[] strArr, int[] iArr, b6j0[] b6j0VarArr, int[] iArr2, int[][][] iArr3, b6j0 b6j0Var) {
            this.f145744b = strArr;
            this.f145745c = iArr;
            this.f145746d = b6j0VarArr;
            this.f145748f = iArr3;
            this.f145747e = iArr2;
            this.f145749g = b6j0Var;
            this.f145743a = iArr.length;
        }

        /* JADX INFO: renamed from: a */
        public int m166138a(int i, int i2, boolean z) {
            int i3 = this.f145746d[i].m100410b(i2).f201817a;
            int[] iArr = new int[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                int iM166144g = m166144g(i, i2, i5);
                if (iM166144g == 4 || (z && iM166144g == 3)) {
                    iArr[i4] = i5;
                    i4++;
                }
            }
            return m166139b(i, i2, Arrays.copyOf(iArr, i4));
        }

        /* JADX INFO: renamed from: b */
        public int m166139b(int i, int i2, int[] iArr) {
            int i3 = 0;
            int iMin = 16;
            String str = null;
            boolean z = false;
            int i4 = 0;
            while (i3 < iArr.length) {
                String str2 = this.f145746d[i].m100410b(i2).m217358c(iArr[i3]).f7748l;
                int i5 = i4 + 1;
                if (i4 == 0) {
                    str = str2;
                } else {
                    z |= !vck0.m197845c(str, str2);
                }
                iMin = Math.min(iMin, InterfaceC2067y.m12205e(this.f145748f[i][i2][i3]));
                i3++;
                i4 = i5;
            }
            return z ? Math.min(iMin, this.f145747e[i]) : iMin;
        }

        /* JADX INFO: renamed from: c */
        public int m166140c(int i, int i2, int i3) {
            return this.f145748f[i][i2][i3];
        }

        /* JADX INFO: renamed from: d */
        public int m166141d() {
            return this.f145743a;
        }

        /* JADX INFO: renamed from: e */
        public int m166142e(int i) {
            return this.f145745c[i];
        }

        /* JADX INFO: renamed from: f */
        public b6j0 m166143f(int i) {
            return this.f145746d[i];
        }

        /* JADX INFO: renamed from: g */
        public int m166144g(int i, int i2, int i3) {
            return InterfaceC2067y.m12208p(m166140c(i, i2, i3));
        }

        /* JADX INFO: renamed from: h */
        public b6j0 m166145h() {
            return this.f145749g;
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m166133n(InterfaceC2067y[] interfaceC2067yArr, z5j0 z5j0Var, int[] iArr, boolean z) throws ExoPlaybackException {
        int length = interfaceC2067yArr.length;
        int i = 0;
        boolean z2 = true;
        for (int i2 = 0; i2 < interfaceC2067yArr.length; i2++) {
            InterfaceC2067y interfaceC2067y = interfaceC2067yArr[i2];
            int iMax = 0;
            for (int i3 = 0; i3 < z5j0Var.f201817a; i3++) {
                iMax = Math.max(iMax, InterfaceC2067y.m12208p(interfaceC2067y.mo10384a(z5j0Var.m217358c(i3))));
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
    public static int[] m166134o(InterfaceC2067y interfaceC2067y, z5j0 z5j0Var) throws ExoPlaybackException {
        int[] iArr = new int[z5j0Var.f201817a];
        for (int i = 0; i < z5j0Var.f201817a; i++) {
            iArr[i] = interfaceC2067y.mo10384a(z5j0Var.m217358c(i));
        }
        return iArr;
    }

    /* JADX INFO: renamed from: p */
    public static int[] m166135p(InterfaceC2067y[] interfaceC2067yArr) throws ExoPlaybackException {
        int length = interfaceC2067yArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = interfaceC2067yArr[i].mo9761C();
        }
        return iArr;
    }

    @Override // p149l.y6j0
    /* JADX INFO: renamed from: i */
    public final void mo166136i(@Nullable Object obj) {
        this.f145742c = (C19047a) obj;
    }

    @Override // p149l.y6j0
    /* JADX INFO: renamed from: k */
    public final z6j0 mo166137k(InterfaceC2067y[] interfaceC2067yArr, b6j0 b6j0Var, InterfaceC1965i.b bVar, AbstractC1834c0 abstractC1834c0) throws ExoPlaybackException {
        int[] iArr = new int[interfaceC2067yArr.length + 1];
        int length = interfaceC2067yArr.length + 1;
        z5j0[][] z5j0VarArr = new z5j0[length][];
        int[][][] iArr2 = new int[interfaceC2067yArr.length + 1][][];
        for (int i = 0; i < length; i++) {
            int i2 = b6j0Var.f73826a;
            z5j0VarArr[i] = new z5j0[i2];
            iArr2[i] = new int[i2][];
        }
        int[] iArrM166135p = m166135p(interfaceC2067yArr);
        for (int i3 = 0; i3 < b6j0Var.f73826a; i3++) {
            z5j0 z5j0VarM100410b = b6j0Var.m100410b(i3);
            int iM166133n = m166133n(interfaceC2067yArr, z5j0VarM100410b, iArr, z5j0VarM100410b.f201819c == 5);
            int[] iArrM166134o = iM166133n == interfaceC2067yArr.length ? new int[z5j0VarM100410b.f201817a] : m166134o(interfaceC2067yArr[iM166133n], z5j0VarM100410b);
            int i4 = iArr[iM166133n];
            z5j0VarArr[iM166133n][i4] = z5j0VarM100410b;
            iArr2[iM166133n][i4] = iArrM166134o;
            iArr[iM166133n] = i4 + 1;
        }
        b6j0[] b6j0VarArr = new b6j0[interfaceC2067yArr.length];
        String[] strArr = new String[interfaceC2067yArr.length];
        int[] iArr3 = new int[interfaceC2067yArr.length];
        for (int i5 = 0; i5 < interfaceC2067yArr.length; i5++) {
            int i6 = iArr[i5];
            b6j0VarArr[i5] = new b6j0((z5j0[]) vck0.m197816O0(z5j0VarArr[i5], i6));
            iArr2[i5] = (int[][]) vck0.m197816O0(iArr2[i5], i6);
            strArr[i5] = interfaceC2067yArr[i5].getName();
            iArr3[i5] = interfaceC2067yArr[i5].getTrackType();
        }
        C19047a c19047a = new C19047a(strArr, iArr3, b6j0VarArr, iArrM166135p, iArr2, new b6j0((z5j0[]) vck0.m197816O0(z5j0VarArr[interfaceC2067yArr.length], iArr[interfaceC2067yArr.length])));
        Pair<erc0[], o8f[]> pairMo151251q = mo151251q(c19047a, iArr2, iArrM166135p, bVar, abstractC1834c0);
        return new z6j0((erc0[]) pairMo151251q.first, (o8f[]) pairMo151251q.second, x6j0.m207177b(c19047a, (r6j0[]) pairMo151251q.second), c19047a);
    }

    /* JADX INFO: renamed from: q */
    public abstract Pair<erc0[], o8f[]> mo151251q(C19047a c19047a, int[][][] iArr, int[] iArr2, InterfaceC1965i.b bVar, AbstractC1834c0 abstractC1834c0) throws ExoPlaybackException;
}
