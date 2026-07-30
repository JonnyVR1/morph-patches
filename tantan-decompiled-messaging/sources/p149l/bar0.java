package p149l;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class bar0 implements ymr0 {

    /* JADX INFO: renamed from: a */
    public final boolean f74715a;

    public bar0(Boolean bool) {
        if (bool == null) {
            this.f74715a = false;
        } else {
            this.f74715a = bool.booleanValue();
        }
    }

    @Override // p149l.ymr0
    /* JADX INFO: renamed from: c */
    public final ymr0 mo95833c(String str, a9x0 a9x0Var, List<ymr0> list) {
        boolean zEquals = "toString".equals(str);
        boolean z = this.f74715a;
        if (zEquals) {
            return new ppr0(Boolean.toString(z));
        }
        dqi0.m113073a("%s.%s is not a function.", new Object[]{Boolean.toString(z), str});
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bar0) && this.f74715a == ((bar0) obj).f74715a;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f74715a).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f74715a);
    }

    @Override // p149l.ymr0
    public final ymr0 zzc() {
        return new bar0(Boolean.valueOf(this.f74715a));
    }

    @Override // p149l.ymr0
    public final Boolean zzd() {
        return Boolean.valueOf(this.f74715a);
    }

    @Override // p149l.ymr0
    public final Double zze() {
        return Double.valueOf(this.f74715a ? 1.0d : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    @Override // p149l.ymr0
    public final String zzf() {
        return Boolean.toString(this.f74715a);
    }

    @Override // p149l.ymr0
    public final Iterator<ymr0> zzh() {
        return null;
    }
}
