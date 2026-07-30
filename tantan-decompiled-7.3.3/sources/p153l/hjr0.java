package p153l;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class hjr0 implements ewr0 {

    /* JADX INFO: renamed from: a */
    public final boolean f110298a;

    public hjr0(Boolean bool) {
        if (bool == null) {
            this.f110298a = false;
        } else {
            this.f110298a = bool.booleanValue();
        }
    }

    @Override // p153l.ewr0
    /* JADX INFO: renamed from: c */
    public final ewr0 mo100514c(String str, gix0 gix0Var, List<ewr0> list) {
        boolean zEquals = "toString".equals(str);
        boolean z = this.f110298a;
        if (zEquals) {
            return new vyr0(Boolean.toString(z));
        }
        gzi0.m133102a("%s.%s is not a function.", new Object[]{Boolean.toString(z), str});
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hjr0) && this.f110298a == ((hjr0) obj).f110298a;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f110298a).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f110298a);
    }

    @Override // p153l.ewr0
    public final ewr0 zzc() {
        return new hjr0(Boolean.valueOf(this.f110298a));
    }

    @Override // p153l.ewr0
    public final Boolean zzd() {
        return Boolean.valueOf(this.f110298a);
    }

    @Override // p153l.ewr0
    public final Double zze() {
        return Double.valueOf(this.f110298a ? 1.0d : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    @Override // p153l.ewr0
    public final String zzf() {
        return Boolean.toString(this.f110298a);
    }

    @Override // p153l.ewr0
    public final Iterator<ewr0> zzh() {
        return null;
    }
}
