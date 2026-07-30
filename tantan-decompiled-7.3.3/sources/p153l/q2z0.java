package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzgaa;

/* JADX INFO: loaded from: classes6.dex */
public final class q2z0 {

    /* JADX INFO: renamed from: d */
    public static final q2z0 f155398d = new q2z0(new t2u0[0]);

    /* JADX INFO: renamed from: e */
    public static final String f155399e = Integer.toString(0, 36);

    /* JADX INFO: renamed from: f */
    @Deprecated
    public static final mhy0 f155400f = new mhy0() { // from class: l.p2z0
    };

    /* JADX INFO: renamed from: a */
    public final int f155401a;

    /* JADX INFO: renamed from: b */
    public final zzgaa f155402b;

    /* JADX INFO: renamed from: c */
    public int f155403c;

    /* JADX WARN: Multi-variable type inference failed */
    public q2z0(t2u0... t2u0VarArr) {
        this.f155402b = zzgaa.zzk(t2u0VarArr);
        this.f155401a = t2u0VarArr.length;
        int i = 0;
        while (i < this.f155402b.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f155402b.size(); i3++) {
                if (((t2u0) this.f155402b.get(i)).equals(this.f155402b.get(i3))) {
                    y4w0.m214276d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m175101a(t2u0 t2u0Var) {
        int iIndexOf = this.f155402b.indexOf(t2u0Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final t2u0 m175102b(int i) {
        return (t2u0) this.f155402b.get(i);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q2z0.class == obj.getClass()) {
            q2z0 q2z0Var = (q2z0) obj;
            if (this.f155401a == q2z0Var.f155401a && this.f155402b.equals(q2z0Var.f155402b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f155403c;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f155402b.hashCode();
        this.f155403c = iHashCode;
        return iHashCode;
    }
}
