package p153l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class xzr0 implements ewr0 {

    /* JADX INFO: renamed from: a */
    public final String f196916a;

    /* JADX INFO: renamed from: b */
    public final ArrayList<ewr0> f196917b;

    public xzr0(String str, List<ewr0> list) {
        this.f196916a = str;
        ArrayList<ewr0> arrayList = new ArrayList<>();
        this.f196917b = arrayList;
        arrayList.addAll(list);
    }

    /* JADX INFO: renamed from: a */
    public final String m213807a() {
        return this.f196916a;
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList<ewr0> m213808b() {
        return this.f196917b;
    }

    @Override // p153l.ewr0
    /* JADX INFO: renamed from: c */
    public final ewr0 mo100514c(String str, gix0 gix0Var, List<ewr0> list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzr0)) {
            return false;
        }
        xzr0 xzr0Var = (xzr0) obj;
        String str = this.f196916a;
        String str2 = xzr0Var.f196916a;
        if (str == null ? str2 != null : !str.equals(str2)) {
            return false;
        }
        ArrayList<ewr0> arrayList = this.f196917b;
        ArrayList<ewr0> arrayList2 = xzr0Var.f196917b;
        if (arrayList != null) {
            return arrayList.equals(arrayList2);
        }
        return arrayList2 == null;
    }

    public final int hashCode() {
        String str = this.f196916a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        ArrayList<ewr0> arrayList = this.f196917b;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @Override // p153l.ewr0
    public final Boolean zzd() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // p153l.ewr0
    public final Double zze() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // p153l.ewr0
    public final String zzf() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // p153l.ewr0
    public final Iterator<ewr0> zzh() {
        return null;
    }

    @Override // p153l.ewr0
    public final ewr0 zzc() {
        return this;
    }
}
