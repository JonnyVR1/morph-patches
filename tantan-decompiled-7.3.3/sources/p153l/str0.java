package p153l;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class str0 implements ewr0 {
    @Override // p153l.ewr0
    /* JADX INFO: renamed from: c */
    public final ewr0 mo100514c(String str, gix0 gix0Var, List<ewr0> list) {
        throw new IllegalStateException(String.format("null has no function %s", str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof str0;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // p153l.ewr0
    public final ewr0 zzc() {
        return ewr0.f96188x0;
    }

    @Override // p153l.ewr0
    public final Boolean zzd() {
        return Boolean.FALSE;
    }

    @Override // p153l.ewr0
    public final Double zze() {
        return Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    @Override // p153l.ewr0
    public final String zzf() {
        return "null";
    }

    @Override // p153l.ewr0
    public final Iterator<ewr0> zzh() {
        return null;
    }
}
