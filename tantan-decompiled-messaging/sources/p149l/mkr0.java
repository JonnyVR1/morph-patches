package p149l;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class mkr0 implements ymr0 {
    @Override // p149l.ymr0
    /* JADX INFO: renamed from: c */
    public final ymr0 mo95833c(String str, a9x0 a9x0Var, List<ymr0> list) {
        throw new IllegalStateException(String.format("null has no function %s", str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof mkr0;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // p149l.ymr0
    public final ymr0 zzc() {
        return ymr0.f199052x0;
    }

    @Override // p149l.ymr0
    public final Boolean zzd() {
        return Boolean.FALSE;
    }

    @Override // p149l.ymr0
    public final Double zze() {
        return Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    @Override // p149l.ymr0
    public final String zzf() {
        return "null";
    }

    @Override // p149l.ymr0
    public final Iterator<ymr0> zzh() {
        return null;
    }
}
