package p149l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class rqr0 implements ymr0 {

    /* JADX INFO: renamed from: a */
    public final String f160690a;

    /* JADX INFO: renamed from: b */
    public final ArrayList<ymr0> f160691b;

    public rqr0(String str, List<ymr0> list) {
        this.f160690a = str;
        ArrayList<ymr0> arrayList = new ArrayList<>();
        this.f160691b = arrayList;
        arrayList.addAll(list);
    }

    /* JADX INFO: renamed from: a */
    public final String m180491a() {
        return this.f160690a;
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList<ymr0> m180492b() {
        return this.f160691b;
    }

    @Override // p149l.ymr0
    /* JADX INFO: renamed from: c */
    public final ymr0 mo95833c(String str, a9x0 a9x0Var, List<ymr0> list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rqr0)) {
            return false;
        }
        rqr0 rqr0Var = (rqr0) obj;
        String str = this.f160690a;
        String str2 = rqr0Var.f160690a;
        if (str == null ? str2 != null : !str.equals(str2)) {
            return false;
        }
        ArrayList<ymr0> arrayList = this.f160691b;
        ArrayList<ymr0> arrayList2 = rqr0Var.f160691b;
        if (arrayList != null) {
            return arrayList.equals(arrayList2);
        }
        return arrayList2 == null;
    }

    public final int hashCode() {
        String str = this.f160690a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        ArrayList<ymr0> arrayList = this.f160691b;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @Override // p149l.ymr0
    public final Boolean zzd() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // p149l.ymr0
    public final Double zze() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // p149l.ymr0
    public final String zzf() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // p149l.ymr0
    public final Iterator<ymr0> zzh() {
        return null;
    }

    @Override // p149l.ymr0
    public final ymr0 zzc() {
        return this;
    }
}
