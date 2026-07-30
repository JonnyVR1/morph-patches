package p153l;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.InterfaceC1886e;
import com.google.common.collect.ImmutableList;
import com.google.mlkit.p034nl.languageid.LanguageIdentifier;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class dfj0 implements InterfaceC1886e {

    /* JADX INFO: renamed from: f */
    public static final String f88156f = bmk0.m105181z0(0);

    /* JADX INFO: renamed from: g */
    public static final String f88157g = bmk0.m105181z0(1);

    /* JADX INFO: renamed from: h */
    public static final InterfaceC1886e.a<dfj0> f88158h = new InterfaceC1886e.a() { // from class: l.cfj0
        @Override // com.google.android.exoplayer2.InterfaceC1886e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1886e mo10034a(Bundle bundle) {
            return dfj0.m115514a(bundle);
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f88159a;

    /* JADX INFO: renamed from: b */
    public final String f88160b;

    /* JADX INFO: renamed from: c */
    public final int f88161c;

    /* JADX INFO: renamed from: d */
    public final C1894k[] f88162d;

    /* JADX INFO: renamed from: e */
    public int f88163e;

    public dfj0(String str, C1894k... c1894kArr) {
        w11.m204365a(c1894kArr.length > 0);
        this.f88160b = str;
        this.f88162d = c1894kArr;
        this.f88159a = c1894kArr.length;
        int iM149010k = kb00.m149010k(c1894kArr[0].f7785l);
        this.f88161c = iM149010k == -1 ? kb00.m149010k(c1894kArr[0].f7784k) : iM149010k;
        m115521h();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ dfj0 m115514a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f88156f);
        return new dfj0(bundle.getString(f88157g, ""), (C1894k[]) (parcelableArrayList == null ? ImmutableList.m15739of() : cj3.m110054d(C1894k.f7755R0, parcelableArrayList)).toArray(new C1894k[0]));
    }

    /* JADX INFO: renamed from: e */
    public static void m115515e(String str, @Nullable String str2, @Nullable String str3, int i) {
        kyv.m152146d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    /* JADX INFO: renamed from: f */
    public static String m115516f(@Nullable String str) {
        return (str == null || str.equals(LanguageIdentifier.UNDETERMINED_LANGUAGE_TAG)) ? "" : str;
    }

    /* JADX INFO: renamed from: g */
    public static int m115517g(int i) {
        return i | 16384;
    }

    @CheckResult
    /* JADX INFO: renamed from: b */
    public dfj0 m115518b(String str) {
        return new dfj0(str, this.f88162d);
    }

    /* JADX INFO: renamed from: c */
    public C1894k m115519c(int i) {
        return this.f88162d[i];
    }

    /* JADX INFO: renamed from: d */
    public int m115520d(C1894k c1894k) {
        int i = 0;
        while (true) {
            C1894k[] c1894kArr = this.f88162d;
            if (i >= c1894kArr.length) {
                return -1;
            }
            if (c1894k == c1894kArr[i]) {
                return i;
            }
            i++;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dfj0.class == obj.getClass()) {
            dfj0 dfj0Var = (dfj0) obj;
            if (this.f88160b.equals(dfj0Var.f88160b) && Arrays.equals(this.f88162d, dfj0Var.f88162d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final void m115521h() {
        String strM115516f = m115516f(this.f88162d[0].f7776c);
        int iM115517g = m115517g(this.f88162d[0].f7778e);
        int i = 1;
        while (true) {
            C1894k[] c1894kArr = this.f88162d;
            if (i >= c1894kArr.length) {
                return;
            }
            boolean zEquals = strM115516f.equals(m115516f(c1894kArr[i].f7776c));
            C1894k[] c1894kArr2 = this.f88162d;
            if (!zEquals) {
                m115515e("languages", c1894kArr2[0].f7776c, c1894kArr2[i].f7776c, i);
                return;
            } else {
                if (iM115517g != m115517g(c1894kArr2[i].f7778e)) {
                    m115515e("role flags", Integer.toBinaryString(this.f88162d[0].f7778e), Integer.toBinaryString(this.f88162d[i].f7778e), i);
                    return;
                }
                i++;
            }
        }
    }

    public int hashCode() {
        if (this.f88163e == 0) {
            this.f88163e = ((527 + this.f88160b.hashCode()) * 31) + Arrays.hashCode(this.f88162d);
        }
        return this.f88163e;
    }

    @Override // com.google.android.exoplayer2.InterfaceC1886e
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f88162d.length);
        for (C1894k c1894k : this.f88162d) {
            arrayList.add(c1894k.m10340i(true));
        }
        bundle.putParcelableArrayList(f88156f, arrayList);
        bundle.putString(f88157g, this.f88160b);
        return bundle;
    }

    public dfj0(C1894k... c1894kArr) {
        this("", c1894kArr);
    }
}
