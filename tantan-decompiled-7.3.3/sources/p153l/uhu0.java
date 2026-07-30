package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class uhu0 {

    /* JADX INFO: renamed from: b */
    public static final uhu0 f179056b = new uhu0(zzgaa.zzl());

    /* JADX INFO: renamed from: c */
    public static final String f179057c = Integer.toString(0, 36);

    /* JADX INFO: renamed from: d */
    @Deprecated
    public static final mhy0 f179058d = new mhy0() { // from class: l.zdu0
    };

    /* JADX INFO: renamed from: a */
    public final zzgaa f179059a;

    public uhu0(List list) {
        this.f179059a = zzgaa.zzj(list);
    }

    /* JADX INFO: renamed from: a */
    public final zzgaa m196124a() {
        return this.f179059a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final boolean m196125b(int i) {
        for (int i2 = 0; i2 < this.f179059a.size(); i2++) {
            mgu0 mgu0Var = (mgu0) this.f179059a.get(i2);
            if (mgu0Var.m158389c() && mgu0Var.m158387a() == i) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uhu0.class != obj.getClass()) {
            return false;
        }
        return this.f179059a.equals(((uhu0) obj).f179059a);
    }

    public final int hashCode() {
        return this.f179059a.hashCode();
    }
}
