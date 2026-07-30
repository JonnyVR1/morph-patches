package p149l;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.InterfaceC1863e;
import com.google.common.collect.ImmutableList;
import com.google.mlkit.p033nl.languageid.LanguageIdentifier;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class z5j0 implements InterfaceC1863e {

    /* JADX INFO: renamed from: f */
    public static final String f201814f = vck0.m197903z0(0);

    /* JADX INFO: renamed from: g */
    public static final String f201815g = vck0.m197903z0(1);

    /* JADX INFO: renamed from: h */
    public static final InterfaceC1863e.a<z5j0> f201816h = new InterfaceC1863e.a() { // from class: l.y5j0
        @Override // com.google.android.exoplayer2.InterfaceC1863e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1863e mo9980a(Bundle bundle) {
            return z5j0.m217353a(bundle);
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f201817a;

    /* JADX INFO: renamed from: b */
    public final String f201818b;

    /* JADX INFO: renamed from: c */
    public final int f201819c;

    /* JADX INFO: renamed from: d */
    public final C1871k[] f201820d;

    /* JADX INFO: renamed from: e */
    public int f201821e;

    public z5j0(String str, C1871k... c1871kArr) {
        p11.m167007a(c1871kArr.length > 0);
        this.f201818b = str;
        this.f201820d = c1871kArr;
        this.f201817a = c1871kArr.length;
        int iM157529k = n200.m157529k(c1871kArr[0].f7748l);
        this.f201819c = iM157529k == -1 ? n200.m157529k(c1871kArr[0].f7747k) : iM157529k;
        m217360h();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ z5j0 m217353a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f201814f);
        return new z5j0(bundle.getString(f201815g, ""), (C1871k[]) (parcelableArrayList == null ? ImmutableList.m15685of() : oi3.m164495d(C1871k.f7718R0, parcelableArrayList)).toArray(new C1871k[0]));
    }

    /* JADX INFO: renamed from: e */
    public static void m217354e(String str, @Nullable String str2, @Nullable String str3, int i) {
        jwv.m143684d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    /* JADX INFO: renamed from: f */
    public static String m217355f(@Nullable String str) {
        return (str == null || str.equals(LanguageIdentifier.UNDETERMINED_LANGUAGE_TAG)) ? "" : str;
    }

    /* JADX INFO: renamed from: g */
    public static int m217356g(int i) {
        return i | 16384;
    }

    @CheckResult
    /* JADX INFO: renamed from: b */
    public z5j0 m217357b(String str) {
        return new z5j0(str, this.f201820d);
    }

    /* JADX INFO: renamed from: c */
    public C1871k m217358c(int i) {
        return this.f201820d[i];
    }

    /* JADX INFO: renamed from: d */
    public int m217359d(C1871k c1871k) {
        int i = 0;
        while (true) {
            C1871k[] c1871kArr = this.f201820d;
            if (i >= c1871kArr.length) {
                return -1;
            }
            if (c1871k == c1871kArr[i]) {
                return i;
            }
            i++;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z5j0.class == obj.getClass()) {
            z5j0 z5j0Var = (z5j0) obj;
            if (this.f201818b.equals(z5j0Var.f201818b) && Arrays.equals(this.f201820d, z5j0Var.f201820d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final void m217360h() {
        String strM217355f = m217355f(this.f201820d[0].f7739c);
        int iM217356g = m217356g(this.f201820d[0].f7741e);
        int i = 1;
        while (true) {
            C1871k[] c1871kArr = this.f201820d;
            if (i >= c1871kArr.length) {
                return;
            }
            boolean zEquals = strM217355f.equals(m217355f(c1871kArr[i].f7739c));
            C1871k[] c1871kArr2 = this.f201820d;
            if (!zEquals) {
                m217354e("languages", c1871kArr2[0].f7739c, c1871kArr2[i].f7739c, i);
                return;
            } else {
                if (iM217356g != m217356g(c1871kArr2[i].f7741e)) {
                    m217354e("role flags", Integer.toBinaryString(this.f201820d[0].f7741e), Integer.toBinaryString(this.f201820d[i].f7741e), i);
                    return;
                }
                i++;
            }
        }
    }

    public int hashCode() {
        if (this.f201821e == 0) {
            this.f201821e = ((527 + this.f201818b.hashCode()) * 31) + Arrays.hashCode(this.f201820d);
        }
        return this.f201821e;
    }

    @Override // com.google.android.exoplayer2.InterfaceC1863e
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f201820d.length);
        for (C1871k c1871k : this.f201820d) {
            arrayList.add(c1871k.m10286i(true));
        }
        bundle.putParcelableArrayList(f201814f, arrayList);
        bundle.putString(f201815g, this.f201818b);
        return bundle;
    }

    public z5j0(C1871k... c1871kArr) {
        this("", c1871kArr);
    }
}
