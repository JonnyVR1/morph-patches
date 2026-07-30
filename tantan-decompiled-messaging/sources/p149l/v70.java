package p149l;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.CheckResult;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.InterfaceC1863e;
import java.util.ArrayList;
import java.util.Arrays;
import org.spongycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class v70 implements InterfaceC1863e {

    /* JADX INFO: renamed from: g */
    public static final v70 f180250g = new v70(null, new C20589a[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: h */
    public static final C20589a f180251h = new C20589a(0).m197308k(0);

    /* JADX INFO: renamed from: i */
    public static final String f180252i = vck0.m197903z0(1);

    /* JADX INFO: renamed from: j */
    public static final String f180253j = vck0.m197903z0(2);

    /* JADX INFO: renamed from: k */
    public static final String f180254k = vck0.m197903z0(3);

    /* JADX INFO: renamed from: l */
    public static final String f180255l = vck0.m197903z0(4);

    /* JADX INFO: renamed from: m */
    public static final InterfaceC1863e.a<v70> f180256m = new InterfaceC1863e.a() { // from class: l.t70
        @Override // com.google.android.exoplayer2.InterfaceC1863e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1863e mo9980a(Bundle bundle) {
            return v70.m197292b(bundle);
        }
    };

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Object f180257a;

    /* JADX INFO: renamed from: b */
    public final int f180258b;

    /* JADX INFO: renamed from: c */
    public final long f180259c;

    /* JADX INFO: renamed from: d */
    public final long f180260d;

    /* JADX INFO: renamed from: e */
    public final int f180261e;

    /* JADX INFO: renamed from: f */
    public final C20589a[] f180262f;

    public v70(@Nullable Object obj, C20589a[] c20589aArr, long j, long j2, int i) {
        this.f180257a = obj;
        this.f180259c = j;
        this.f180260d = j2;
        this.f180258b = c20589aArr.length + i;
        this.f180262f = c20589aArr;
        this.f180261e = i;
    }

    /* JADX INFO: renamed from: b */
    public static v70 m197292b(Bundle bundle) {
        C20589a[] c20589aArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f180252i);
        if (parcelableArrayList == null) {
            c20589aArr = new C20589a[0];
        } else {
            C20589a[] c20589aArr2 = new C20589a[parcelableArrayList.size()];
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                c20589aArr2[i] = (C20589a) C20589a.f180271q.mo9980a((Bundle) parcelableArrayList.get(i));
            }
            c20589aArr = c20589aArr2;
        }
        String str = f180253j;
        v70 v70Var = f180250g;
        return new v70(null, c20589aArr, bundle.getLong(str, v70Var.f180259c), bundle.getLong(f180254k, v70Var.f180260d), bundle.getInt(f180255l, v70Var.f180261e));
    }

    /* JADX INFO: renamed from: c */
    public C20589a m197293c(@IntRange(from = 0) int i) {
        int i2 = this.f180261e;
        return i < i2 ? f180251h : this.f180262f[i - i2];
    }

    /* JADX INFO: renamed from: d */
    public int m197294d(long j, long j2) {
        if (j != Long.MIN_VALUE && (j2 == -9223372036854775807L || j < j2)) {
            int i = this.f180261e;
            while (i < this.f180258b && ((m197293c(i).f180272a != Long.MIN_VALUE && m197293c(i).f180272a <= j) || !m197293c(i).m197307j())) {
                i++;
            }
            if (i < this.f180258b) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public int m197295e(long j, long j2) {
        v70 v70Var;
        int i = this.f180258b - 1;
        int i2 = i - (m197296f(i) ? 1 : 0);
        while (true) {
            v70Var = this;
            if (i2 < 0) {
                break;
            }
            long j3 = j;
            long j4 = j2;
            if (!v70Var.m197297g(j3, j4, i2)) {
                break;
            }
            i2--;
            this = v70Var;
            j = j3;
            j2 = j4;
        }
        if (i2 < 0 || !v70Var.m197293c(i2).m197305h()) {
            return -1;
        }
        return i2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v70.class == obj.getClass()) {
            v70 v70Var = (v70) obj;
            if (vck0.m197845c(this.f180257a, v70Var.f180257a) && this.f180258b == v70Var.f180258b && this.f180259c == v70Var.f180259c && this.f180260d == v70Var.f180260d && this.f180261e == v70Var.f180261e && Arrays.equals(this.f180262f, v70Var.f180262f)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m197296f(int i) {
        return i == this.f180258b - 1 && m197293c(i).m197306i();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m197297g(long j, long j2, int i) {
        if (j == Long.MIN_VALUE) {
            return false;
        }
        C20589a c20589aM197293c = m197293c(i);
        long j3 = c20589aM197293c.f180272a;
        if (j3 == Long.MIN_VALUE) {
            return j2 == -9223372036854775807L || (c20589aM197293c.f180279h && c20589aM197293c.f180273b == -1) || j < j2;
        }
        return j < j3;
    }

    public int hashCode() {
        int i = this.f180258b * 31;
        Object obj = this.f180257a;
        return ((((((((i + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f180259c)) * 31) + ((int) this.f180260d)) * 31) + this.f180261e) * 31) + Arrays.hashCode(this.f180262f);
    }

    @Override // com.google.android.exoplayer2.InterfaceC1863e
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (C20589a c20589a : this.f180262f) {
            arrayList.add(c20589a.toBundle());
        }
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList(f180252i, arrayList);
        }
        long j = this.f180259c;
        v70 v70Var = f180250g;
        if (j != v70Var.f180259c) {
            bundle.putLong(f180253j, j);
        }
        long j2 = this.f180260d;
        if (j2 != v70Var.f180260d) {
            bundle.putLong(f180254k, j2);
        }
        int i = this.f180261e;
        if (i != v70Var.f180261e) {
            bundle.putInt(f180255l, i);
        }
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=");
        sb.append(this.f180257a);
        sb.append(", adResumePositionUs=");
        sb.append(this.f180259c);
        sb.append(", adGroups=[");
        for (int i = 0; i < this.f180262f.length; i++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.f180262f[i].f180272a);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < this.f180262f[i].f180276e.length; i2++) {
                sb.append("ad(state=");
                int i3 = this.f180262f[i].f180276e[i2];
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
                sb.append(this.f180262f[i].f180277f[i2]);
                sb.append(')');
                if (i2 < this.f180262f[i].f180276e.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < this.f180262f.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }

    /* JADX INFO: renamed from: l.v70$a */
    public static final class C20589a implements InterfaceC1863e {

        /* JADX INFO: renamed from: i */
        public static final String f180263i = vck0.m197903z0(0);

        /* JADX INFO: renamed from: j */
        public static final String f180264j = vck0.m197903z0(1);

        /* JADX INFO: renamed from: k */
        public static final String f180265k = vck0.m197903z0(2);

        /* JADX INFO: renamed from: l */
        public static final String f180266l = vck0.m197903z0(3);

        /* JADX INFO: renamed from: m */
        public static final String f180267m = vck0.m197903z0(4);

        /* JADX INFO: renamed from: n */
        public static final String f180268n = vck0.m197903z0(5);

        /* JADX INFO: renamed from: o */
        public static final String f180269o = vck0.m197903z0(6);

        /* JADX INFO: renamed from: p */
        public static final String f180270p = vck0.m197903z0(7);

        /* JADX INFO: renamed from: q */
        public static final InterfaceC1863e.a<C20589a> f180271q = new InterfaceC1863e.a() { // from class: l.u70
            @Override // com.google.android.exoplayer2.InterfaceC1863e.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC1863e mo9980a(Bundle bundle) {
                return v70.C20589a.m197302e(bundle);
            }
        };

        /* JADX INFO: renamed from: a */
        public final long f180272a;

        /* JADX INFO: renamed from: b */
        public final int f180273b;

        /* JADX INFO: renamed from: c */
        public final int f180274c;

        /* JADX INFO: renamed from: d */
        public final Uri[] f180275d;

        /* JADX INFO: renamed from: e */
        public final int[] f180276e;

        /* JADX INFO: renamed from: f */
        public final long[] f180277f;

        /* JADX INFO: renamed from: g */
        public final long f180278g;

        /* JADX INFO: renamed from: h */
        public final boolean f180279h;

        public C20589a(long j, int i, int i2, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
            p11.m167007a(iArr.length == uriArr.length);
            this.f180272a = j;
            this.f180273b = i;
            this.f180274c = i2;
            this.f180276e = iArr;
            this.f180275d = uriArr;
            this.f180277f = jArr;
            this.f180278g = j2;
            this.f180279h = z;
        }

        @CheckResult
        /* JADX INFO: renamed from: c */
        public static long[] m197300c(long[] jArr, int i) {
            int length = jArr.length;
            int iMax = Math.max(i, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, -9223372036854775807L);
            return jArrCopyOf;
        }

        @CheckResult
        /* JADX INFO: renamed from: d */
        public static int[] m197301d(int[] iArr, int i) {
            int length = iArr.length;
            int iMax = Math.max(i, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        /* JADX INFO: renamed from: e */
        public static C20589a m197302e(Bundle bundle) {
            long j = bundle.getLong(f180263i);
            int i = bundle.getInt(f180264j);
            int i2 = bundle.getInt(f180270p);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f180265k);
            int[] intArray = bundle.getIntArray(f180266l);
            long[] longArray = bundle.getLongArray(f180267m);
            long j2 = bundle.getLong(f180268n);
            boolean z = bundle.getBoolean(f180269o);
            int[] iArr = intArray;
            if (iArr == null) {
                iArr = new int[0];
            }
            Uri[] uriArr = parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]);
            if (longArray == null) {
                longArray = new long[0];
            }
            return new C20589a(j, i, i2, iArr, uriArr, longArray, j2, z);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C20589a.class == obj.getClass()) {
                C20589a c20589a = (C20589a) obj;
                if (this.f180272a == c20589a.f180272a && this.f180273b == c20589a.f180273b && this.f180274c == c20589a.f180274c && Arrays.equals(this.f180275d, c20589a.f180275d) && Arrays.equals(this.f180276e, c20589a.f180276e) && Arrays.equals(this.f180277f, c20589a.f180277f) && this.f180278g == c20589a.f180278g && this.f180279h == c20589a.f180279h) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public int m197303f() {
            return m197304g(-1);
        }

        /* JADX INFO: renamed from: g */
        public int m197304g(@IntRange(from = -1) int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.f180276e;
                if (i3 >= iArr.length || this.f180279h || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        /* JADX INFO: renamed from: h */
        public boolean m197305h() {
            if (this.f180273b == -1) {
                return true;
            }
            for (int i = 0; i < this.f180273b; i++) {
                int i2 = this.f180276e[i];
                if (i2 == 0 || i2 == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i = ((this.f180273b * 31) + this.f180274c) * 31;
            long j = this.f180272a;
            int iHashCode = (((((((i + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.f180275d)) * 31) + Arrays.hashCode(this.f180276e)) * 31) + Arrays.hashCode(this.f180277f)) * 31;
            long j2 = this.f180278g;
            return ((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f180279h ? 1 : 0);
        }

        /* JADX INFO: renamed from: i */
        public final boolean m197306i() {
            return this.f180279h && this.f180272a == Long.MIN_VALUE && this.f180273b == -1;
        }

        /* JADX INFO: renamed from: j */
        public boolean m197307j() {
            return this.f180273b == -1 || m197303f() < this.f180273b;
        }

        @CheckResult
        /* JADX INFO: renamed from: k */
        public C20589a m197308k(int i) {
            int[] iArrM197301d = m197301d(this.f180276e, i);
            long[] jArrM197300c = m197300c(this.f180277f, i);
            return new C20589a(this.f180272a, i, this.f180274c, iArrM197301d, (Uri[]) Arrays.copyOf(this.f180275d, i), jArrM197300c, this.f180278g, this.f180279h);
        }

        @Override // com.google.android.exoplayer2.InterfaceC1863e
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(f180263i, this.f180272a);
            bundle.putInt(f180264j, this.f180273b);
            bundle.putInt(f180270p, this.f180274c);
            bundle.putParcelableArrayList(f180265k, new ArrayList<>(Arrays.asList(this.f180275d)));
            bundle.putIntArray(f180266l, this.f180276e);
            bundle.putLongArray(f180267m, this.f180277f);
            bundle.putLong(f180268n, this.f180278g);
            bundle.putBoolean(f180269o, this.f180279h);
            return bundle;
        }

        public C20589a(long j) {
            this(j, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }
    }
}
