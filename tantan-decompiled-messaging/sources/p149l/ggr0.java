package p149l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ggr0 implements yer0, ymr0 {

    /* JADX INFO: renamed from: a */
    public final String f102530a;

    /* JADX INFO: renamed from: b */
    public final Map<String, ymr0> f102531b = new HashMap();

    public ggr0(String str) {
        this.f102530a = str;
    }

    @Override // p149l.yer0
    /* JADX INFO: renamed from: a */
    public final void mo126000a(String str, ymr0 ymr0Var) {
        Map<String, ymr0> map = this.f102531b;
        if (ymr0Var == null) {
            map.remove(str);
        } else {
            map.put(str, ymr0Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m126001b() {
        return this.f102530a;
    }

    @Override // p149l.ymr0
    /* JADX INFO: renamed from: c */
    public final ymr0 mo95833c(String str, a9x0 a9x0Var, List<ymr0> list) {
        return "toString".equals(str) ? new ppr0(this.f102530a) : bjr0.m102227b(this, new ppr0(str), a9x0Var, list);
    }

    /* JADX INFO: renamed from: d */
    public abstract ymr0 mo108642d(a9x0 a9x0Var, List<ymr0> list);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggr0)) {
            return false;
        }
        ggr0 ggr0Var = (ggr0) obj;
        String str = this.f102530a;
        if (str != null) {
            return str.equals(ggr0Var.f102530a);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f102530a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // p149l.yer0
    public final ymr0 zza(String str) {
        return this.f102531b.containsKey(str) ? this.f102531b.get(str) : ymr0.f199051w0;
    }

    @Override // p149l.yer0
    public final boolean zzc(String str) {
        return this.f102531b.containsKey(str);
    }

    @Override // p149l.ymr0
    public final Boolean zzd() {
        return Boolean.TRUE;
    }

    @Override // p149l.ymr0
    public final Double zze() {
        return Double.valueOf(Double.NaN);
    }

    @Override // p149l.ymr0
    public final String zzf() {
        return this.f102530a;
    }

    @Override // p149l.ymr0
    public final Iterator<ymr0> zzh() {
        return bjr0.m102226a(this.f102531b);
    }

    @Override // p149l.ymr0
    public ymr0 zzc() {
        return this;
    }
}
