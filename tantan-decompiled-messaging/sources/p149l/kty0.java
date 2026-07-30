package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzgaa;

/* JADX INFO: loaded from: classes6.dex */
public final class kty0 {

    /* JADX INFO: renamed from: d */
    public static final kty0 f124626d = new kty0(new ntt0[0]);

    /* JADX INFO: renamed from: e */
    public static final String f124627e = Integer.toString(0, 36);

    /* JADX INFO: renamed from: f */
    @Deprecated
    public static final g8y0 f124628f = new g8y0() { // from class: l.jty0
    };

    /* JADX INFO: renamed from: a */
    public final int f124629a;

    /* JADX INFO: renamed from: b */
    public final zzgaa f124630b;

    /* JADX INFO: renamed from: c */
    public int f124631c;

    /* JADX WARN: Multi-variable type inference failed */
    public kty0(ntt0... ntt0VarArr) {
        this.f124630b = zzgaa.zzk(ntt0VarArr);
        this.f124629a = ntt0VarArr.length;
        int i = 0;
        while (i < this.f124630b.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f124630b.size(); i3++) {
                if (((ntt0) this.f124630b.get(i)).equals(this.f124630b.get(i3))) {
                    svv0.m186109d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m147223a(ntt0 ntt0Var) {
        int iIndexOf = this.f124630b.indexOf(ntt0Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final ntt0 m147224b(int i) {
        return (ntt0) this.f124630b.get(i);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kty0.class == obj.getClass()) {
            kty0 kty0Var = (kty0) obj;
            if (this.f124629a == kty0Var.f124629a && this.f124630b.equals(kty0Var.f124630b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f124631c;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f124630b.hashCode();
        this.f124631c = iHashCode;
        return iHashCode;
    }
}
