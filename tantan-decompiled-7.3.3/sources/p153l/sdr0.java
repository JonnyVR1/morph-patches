package p153l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class sdr0 {

    /* JADX INFO: renamed from: a */
    public efr0 f167457a;

    /* JADX INFO: renamed from: b */
    public efr0 f167458b;

    /* JADX INFO: renamed from: c */
    public List<efr0> f167459c;

    public sdr0() {
        this.f167457a = new efr0("", 0L, null);
        this.f167458b = new efr0("", 0L, null);
        this.f167459c = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final efr0 m185503a() {
        return this.f167457a;
    }

    /* JADX INFO: renamed from: b */
    public final void m185504b(String str, long j, Map<String, Object> map) {
        HashMap map2 = new HashMap();
        for (String str2 : map.keySet()) {
            map2.put(str2, efr0.m120709c(str2, this.f167457a.m120711b(str2), map.get(str2)));
        }
        this.f167459c.add(new efr0(str, j, map2));
    }

    /* JADX INFO: renamed from: c */
    public final void m185505c(efr0 efr0Var) {
        this.f167457a = efr0Var;
        this.f167458b = (efr0) efr0Var.clone();
        this.f167459c.clear();
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        sdr0 sdr0Var = new sdr0((efr0) this.f167457a.clone());
        Iterator<efr0> it = this.f167459c.iterator();
        while (it.hasNext()) {
            sdr0Var.f167459c.add((efr0) it.next().clone());
        }
        return sdr0Var;
    }

    /* JADX INFO: renamed from: d */
    public final efr0 m185506d() {
        return this.f167458b;
    }

    /* JADX INFO: renamed from: e */
    public final void m185507e(efr0 efr0Var) {
        this.f167458b = efr0Var;
    }

    /* JADX INFO: renamed from: f */
    public final List<efr0> m185508f() {
        return this.f167459c;
    }

    public sdr0(efr0 efr0Var) {
        this.f167457a = efr0Var;
        this.f167458b = (efr0) efr0Var.clone();
        this.f167459c = new ArrayList();
    }
}
