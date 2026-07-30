package p153l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class mpr0 implements eor0, ewr0 {

    /* JADX INFO: renamed from: a */
    public final String f137945a;

    /* JADX INFO: renamed from: b */
    public final Map<String, ewr0> f137946b = new HashMap();

    public mpr0(String str) {
        this.f137945a = str;
    }

    @Override // p153l.eor0
    /* JADX INFO: renamed from: a */
    public final void mo100512a(String str, ewr0 ewr0Var) {
        Map<String, ewr0> map = this.f137946b;
        if (ewr0Var == null) {
            map.remove(str);
        } else {
            map.put(str, ewr0Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m159380b() {
        return this.f137945a;
    }

    @Override // p153l.ewr0
    /* JADX INFO: renamed from: c */
    public final ewr0 mo100514c(String str, gix0 gix0Var, List<ewr0> list) {
        return "toString".equals(str) ? new vyr0(this.f137945a) : hsr0.m137036b(this, new vyr0(str), gix0Var, list);
    }

    /* JADX INFO: renamed from: d */
    public abstract ewr0 mo107102d(gix0 gix0Var, List<ewr0> list);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mpr0)) {
            return false;
        }
        mpr0 mpr0Var = (mpr0) obj;
        String str = this.f137945a;
        if (str != null) {
            return str.equals(mpr0Var.f137945a);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f137945a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // p153l.eor0
    public final ewr0 zza(String str) {
        return this.f137946b.containsKey(str) ? this.f137946b.get(str) : ewr0.f96187w0;
    }

    @Override // p153l.eor0
    public final boolean zzc(String str) {
        return this.f137946b.containsKey(str);
    }

    @Override // p153l.ewr0
    public final Boolean zzd() {
        return Boolean.TRUE;
    }

    @Override // p153l.ewr0
    public final Double zze() {
        return Double.valueOf(Double.NaN);
    }

    @Override // p153l.ewr0
    public final String zzf() {
        return this.f137945a;
    }

    @Override // p153l.ewr0
    public final Iterator<ewr0> zzh() {
        return hsr0.m137035a(this.f137946b);
    }

    @Override // p153l.ewr0
    public ewr0 zzc() {
        return this;
    }
}
