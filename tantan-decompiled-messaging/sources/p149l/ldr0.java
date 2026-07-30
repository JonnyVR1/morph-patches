package p149l;

import java.util.Iterator;
import java.util.List;
import org.fourthline.cling.model.meta.QueryStateVariableAction;

/* JADX INFO: loaded from: classes6.dex */
public final class ldr0 implements ymr0 {

    /* JADX INFO: renamed from: a */
    public final ymr0 f127599a;

    /* JADX INFO: renamed from: b */
    public final String f127600b;

    public ldr0() {
        this.f127599a = ymr0.f199051w0;
        this.f127600b = QueryStateVariableAction.OUTPUT_ARG_RETURN;
    }

    /* JADX INFO: renamed from: a */
    public final ymr0 m149470a() {
        return this.f127599a;
    }

    /* JADX INFO: renamed from: b */
    public final String m149471b() {
        return this.f127600b;
    }

    @Override // p149l.ymr0
    /* JADX INFO: renamed from: c */
    public final ymr0 mo95833c(String str, a9x0 a9x0Var, List<ymr0> list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ldr0)) {
            return false;
        }
        ldr0 ldr0Var = (ldr0) obj;
        return this.f127600b.equals(ldr0Var.f127600b) && this.f127599a.equals(ldr0Var.f127599a);
    }

    public final int hashCode() {
        return (this.f127600b.hashCode() * 31) + this.f127599a.hashCode();
    }

    @Override // p149l.ymr0
    public final ymr0 zzc() {
        return new ldr0(this.f127600b, this.f127599a.zzc());
    }

    @Override // p149l.ymr0
    public final Boolean zzd() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // p149l.ymr0
    public final Double zze() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // p149l.ymr0
    public final String zzf() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // p149l.ymr0
    public final Iterator<ymr0> zzh() {
        return null;
    }

    public ldr0(String str) {
        this.f127599a = ymr0.f199051w0;
        this.f127600b = str;
    }

    public ldr0(String str, ymr0 ymr0Var) {
        this.f127599a = ymr0Var;
        this.f127600b = str;
    }
}
