package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class o8u0 {

    /* JADX INFO: renamed from: b */
    public static final o8u0 f142672b = new o8u0(zzgaa.zzl());

    /* JADX INFO: renamed from: c */
    public static final String f142673c = Integer.toString(0, 36);

    /* JADX INFO: renamed from: d */
    @Deprecated
    public static final g8y0 f142674d = new g8y0() { // from class: l.t4u0
    };

    /* JADX INFO: renamed from: a */
    public final zzgaa f142675a;

    public o8u0(List list) {
        this.f142675a = zzgaa.zzj(list);
    }

    /* JADX INFO: renamed from: a */
    public final zzgaa m163190a() {
        return this.f142675a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final boolean m163191b(int i) {
        for (int i2 = 0; i2 < this.f142675a.size(); i2++) {
            g7u0 g7u0Var = (g7u0) this.f142675a.get(i2);
            if (g7u0Var.m124736c() && g7u0Var.m124734a() == i) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o8u0.class != obj.getClass()) {
            return false;
        }
        return this.f142675a.equals(((o8u0) obj).f142675a);
    }

    public final int hashCode() {
        return this.f142675a.hashCode();
    }
}
