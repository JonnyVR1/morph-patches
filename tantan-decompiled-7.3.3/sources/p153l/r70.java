package p153l;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.CheckResult;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.InterfaceC1886e;
import java.util.ArrayList;
import java.util.Arrays;
import org.spongycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class r70 implements InterfaceC1886e {

    /* JADX INFO: renamed from: g */
    public static final r70 f161545g = new r70(null, new C19783a[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: h */
    public static final C19783a f161546h = new C19783a(0).m180083k(0);

    /* JADX INFO: renamed from: i */
    public static final String f161547i = bmk0.m105181z0(1);

    /* JADX INFO: renamed from: j */
    public static final String f161548j = bmk0.m105181z0(2);

    /* JADX INFO: renamed from: k */
    public static final String f161549k = bmk0.m105181z0(3);

    /* JADX INFO: renamed from: l */
    public static final String f161550l = bmk0.m105181z0(4);

    /* JADX INFO: renamed from: m */
    public static final InterfaceC1886e.a<r70> f161551m = new InterfaceC1886e.a() { // from class: l.p70
        @Override // com.google.android.exoplayer2.InterfaceC1886e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1886e mo10034a(Bundle bundle) {
            return r70.m180067b(bundle);
        }
    };

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Object f161552a;

    /* JADX INFO: renamed from: b */
    public final int f161553b;

    /* JADX INFO: renamed from: c */
    public final long f161554c;

    /* JADX INFO: renamed from: d */
    public final long f161555d;

    /* JADX INFO: renamed from: e */
    public final int f161556e;

    /* JADX INFO: renamed from: f */
    public final C19783a[] f161557f;

    public r70(@Nullable Object obj, C19783a[] c19783aArr, long j, long j2, int i) {
        this.f161552a = obj;
        this.f161554c = j;
        this.f161555d = j2;
        this.f161553b = c19783aArr.length + i;
        this.f161557f = c19783aArr;
        this.f161556e = i;
    }

    /* JADX INFO: renamed from: b */
    public static r70 m180067b(Bundle bundle) {
        C19783a[] c19783aArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f161547i);
        if (parcelableArrayList == null) {
            c19783aArr = new C19783a[0];
        } else {
            C19783a[] c19783aArr2 = new C19783a[parcelableArrayList.size()];
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                c19783aArr2[i] = (C19783a) C19783a.f161566q.mo10034a((Bundle) parcelableArrayList.get(i));
            }
            c19783aArr = c19783aArr2;
        }
        String str = f161548j;
        r70 r70Var = f161545g;
        return new r70(null, c19783aArr, bundle.getLong(str, r70Var.f161554c), bundle.getLong(f161549k, r70Var.f161555d), bundle.getInt(f161550l, r70Var.f161556e));
    }

    /* JADX INFO: renamed from: c */
    public C19783a m180068c(@IntRange(from = 0) int i) {
        int i2 = this.f161556e;
        return i < i2 ? f161546h : this.f161557f[i - i2];
    }

    /* JADX INFO: renamed from: d */
    public int m180069d(long j, long j2) {
        if (j != Long.MIN_VALUE && (j2 == -9223372036854775807L || j < j2)) {
            int i = this.f161556e;
            while (i < this.f161553b && ((m180068c(i).f161567a != Long.MIN_VALUE && m180068c(i).f161567a <= j) || !m180068c(i).m180082j())) {
                i++;
            }
            if (i < this.f161553b) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public int m180070e(long j, long j2) {
        r70 r70Var;
        int i = this.f161553b - 1;
        int i2 = i - (m180071f(i) ? 1 : 0);
        while (true) {
            r70Var = this;
            if (i2 < 0) {
                break;
            }
            long j3 = j;
            long j4 = j2;
            if (!r70Var.m180072g(j3, j4, i2)) {
                break;
            }
            i2--;
            this = r70Var;
            j = j3;
            j2 = j4;
        }
        if (i2 < 0 || !r70Var.m180068c(i2).m180080h()) {
            return -1;
        }
        return i2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r70.class == obj.getClass()) {
            r70 r70Var = (r70) obj;
            if (bmk0.m105123c(this.f161552a, r70Var.f161552a) && this.f161553b == r70Var.f161553b && this.f161554c == r70Var.f161554c && this.f161555d == r70Var.f161555d && this.f161556e == r70Var.f161556e && Arrays.equals(this.f161557f, r70Var.f161557f)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m180071f(int i) {
        return i == this.f161553b - 1 && m180068c(i).m180081i();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m180072g(long j, long j2, int i) {
        if (j == Long.MIN_VALUE) {
            return false;
        }
        C19783a c19783aM180068c = m180068c(i);
        long j3 = c19783aM180068c.f161567a;
        if (j3 == Long.MIN_VALUE) {
            return j2 == -9223372036854775807L || (c19783aM180068c.f161574h && c19783aM180068c.f161568b == -1) || j < j2;
        }
        return j < j3;
    }

    public int hashCode() {
        int i = this.f161553b * 31;
        Object obj = this.f161552a;
        return ((((((((i + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f161554c)) * 31) + ((int) this.f161555d)) * 31) + this.f161556e) * 31) + Arrays.hashCode(this.f161557f);
    }

    @Override // com.google.android.exoplayer2.InterfaceC1886e
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (C19783a c19783a : this.f161557f) {
            arrayList.add(c19783a.toBundle());
        }
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList(f161547i, arrayList);
        }
        long j = this.f161554c;
        r70 r70Var = f161545g;
        if (j != r70Var.f161554c) {
            bundle.putLong(f161548j, j);
        }
        long j2 = this.f161555d;
        if (j2 != r70Var.f161555d) {
            bundle.putLong(f161549k, j2);
        }
        int i = this.f161556e;
        if (i != r70Var.f161556e) {
            bundle.putInt(f161550l, i);
        }
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=");
        sb.append(this.f161552a);
        sb.append(", adResumePositionUs=");
        sb.append(this.f161554c);
        sb.append(", adGroups=[");
        for (int i = 0; i < this.f161557f.length; i++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.f161557f[i].f161567a);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < this.f161557f[i].f161571e.length; i2++) {
                sb.append("ad(state=");
                int i3 = this.f161557f[i].f161571e[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append(Matrix.MATRIX_TYPE_RANDOM_REGULAR);
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(this.f161557f[i].f161572f[i2]);
                sb.append(')');
                if (i2 < this.f161557f[i].f161571e.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < this.f161557f.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }

    /* JADX INFO: renamed from: l.r70$a */
    public static final class C19783a implements InterfaceC1886e {

        /* JADX INFO: renamed from: i */
        public static final String f161558i = bmk0.m105181z0(0);

        /* JADX INFO: renamed from: j */
        public static final String f161559j = bmk0.m105181z0(1);

        /* JADX INFO: renamed from: k */
        public static final String f161560k = bmk0.m105181z0(2);

        /* JADX INFO: renamed from: l */
        public static final String f161561l = bmk0.m105181z0(3);

        /* JADX INFO: renamed from: m */
        public static final String f161562m = bmk0.m105181z0(4);

        /* JADX INFO: renamed from: n */
        public static final String f161563n = bmk0.m105181z0(5);

        /* JADX INFO: renamed from: o */
        public static final String f161564o = bmk0.m105181z0(6);

        /* JADX INFO: renamed from: p */
        public static final String f161565p = bmk0.m105181z0(7);

        /* JADX INFO: renamed from: q */
        public static final InterfaceC1886e.a<C19783a> f161566q = new InterfaceC1886e.a() { // from class: l.q70
            @Override // com.google.android.exoplayer2.InterfaceC1886e.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC1886e mo10034a(Bundle bundle) {
                return r70.C19783a.m180077e(bundle);
            }
        };

        /* JADX INFO: renamed from: a */
        public final long f161567a;

        /* JADX INFO: renamed from: b */
        public final int f161568b;

        /* JADX INFO: renamed from: c */
        public final int f161569c;

        /* JADX INFO: renamed from: d */
        public final Uri[] f161570d;

        /* JADX INFO: renamed from: e */
        public final int[] f161571e;

        /* JADX INFO: renamed from: f */
        public final long[] f161572f;

        /* JADX INFO: renamed from: g */
        public final long f161573g;

        /* JADX INFO: renamed from: h */
        public final boolean f161574h;

        public C19783a(long j, int i, int i2, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
            w11.m204365a(iArr.length == uriArr.length);
            this.f161567a = j;
            this.f161568b = i;
            this.f161569c = i2;
            this.f161571e = iArr;
            this.f161570d = uriArr;
            this.f161572f = jArr;
            this.f161573g = j2;
            this.f161574h = z;
        }

        @CheckResult
        /* JADX INFO: renamed from: c */
        public static long[] m180075c(long[] jArr, int i) {
            int length = jArr.length;
            int iMax = Math.max(i, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, -9223372036854775807L);
            return jArrCopyOf;
        }

        @CheckResult
        /* JADX INFO: renamed from: d */
        public static int[] m180076d(int[] iArr, int i) {
            int length = iArr.length;
            int iMax = Math.max(i, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        /* JADX INFO: renamed from: e */
        public static C19783a m180077e(Bundle bundle) {
            long j = bundle.getLong(f161558i);
            int i = bundle.getInt(f161559j);
            int i2 = bundle.getInt(f161565p);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f161560k);
            int[] intArray = bundle.getIntArray(f161561l);
            long[] longArray = bundle.getLongArray(f161562m);
            long j2 = bundle.getLong(f161563n);
            boolean z = bundle.getBoolean(f161564o);
            int[] iArr = intArray;
            if (iArr == null) {
                iArr = new int[0];
            }
            Uri[] uriArr = parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]);
            if (longArray == null) {
                longArray = new long[0];
            }
            return new C19783a(j, i, i2, iArr, uriArr, longArray, j2, z);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C19783a.class == obj.getClass()) {
                C19783a c19783a = (C19783a) obj;
                if (this.f161567a == c19783a.f161567a && this.f161568b == c19783a.f161568b && this.f161569c == c19783a.f161569c && Arrays.equals(this.f161570d, c19783a.f161570d) && Arrays.equals(this.f161571e, c19783a.f161571e) && Arrays.equals(this.f161572f, c19783a.f161572f) && this.f161573g == c19783a.f161573g && this.f161574h == c19783a.f161574h) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public int m180078f() {
            return m180079g(-1);
        }

        /* JADX INFO: renamed from: g */
        public int m180079g(@IntRange(from = -1) int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.f161571e;
                if (i3 >= iArr.length || this.f161574h || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        /* JADX INFO: renamed from: h */
        public boolean m180080h() {
            if (this.f161568b == -1) {
                return true;
            }
            for (int i = 0; i < this.f161568b; i++) {
                int i2 = this.f161571e[i];
                if (i2 == 0 || i2 == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i = ((this.f161568b * 31) + this.f161569c) * 31;
            long j = this.f161567a;
            int iHashCode = (((((((i + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.f161570d)) * 31) + Arrays.hashCode(this.f161571e)) * 31) + Arrays.hashCode(this.f161572f)) * 31;
            long j2 = this.f161573g;
            return ((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f161574h ? 1 : 0);
        }

        /* JADX INFO: renamed from: i */
        public final boolean m180081i() {
            return this.f161574h && this.f161567a == Long.MIN_VALUE && this.f161568b == -1;
        }

        /* JADX INFO: renamed from: j */
        public boolean m180082j() {
            return this.f161568b == -1 || m180078f() < this.f161568b;
        }

        @CheckResult
        /* JADX INFO: renamed from: k */
        public C19783a m180083k(int i) {
            int[] iArrM180076d = m180076d(this.f161571e, i);
            long[] jArrM180075c = m180075c(this.f161572f, i);
            return new C19783a(this.f161567a, i, this.f161569c, iArrM180076d, (Uri[]) Arrays.copyOf(this.f161570d, i), jArrM180075c, this.f161573g, this.f161574h);
        }

        @Override // com.google.android.exoplayer2.InterfaceC1886e
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(f161558i, this.f161567a);
            bundle.putInt(f161559j, this.f161568b);
            bundle.putInt(f161565p, this.f161569c);
            bundle.putParcelableArrayList(f161560k, new ArrayList<>(Arrays.asList(this.f161570d)));
            bundle.putIntArray(f161561l, this.f161571e);
            bundle.putLongArray(f161562m, this.f161572f);
            bundle.putLong(f161563n, this.f161573g);
            bundle.putBoolean(f161564o, this.f161574h);
            return bundle;
        }

        public C19783a(long j) {
            this(j, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }
    }
}
