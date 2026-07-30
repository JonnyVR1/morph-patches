package p149l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class m4r0 {

    /* JADX INFO: renamed from: a */
    public y5r0 f131320a;

    /* JADX INFO: renamed from: b */
    public y5r0 f131321b;

    /* JADX INFO: renamed from: c */
    public List<y5r0> f131322c;

    public m4r0() {
        this.f131320a = new y5r0("", 0L, null);
        this.f131321b = new y5r0("", 0L, null);
        this.f131322c = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final y5r0 m153091a() {
        return this.f131320a;
    }

    /* JADX INFO: renamed from: b */
    public final void m153092b(String str, long j, Map<String, Object> map) {
        HashMap map2 = new HashMap();
        for (String str2 : map.keySet()) {
            map2.put(str2, y5r0.m213010c(str2, this.f131320a.m213012b(str2), map.get(str2)));
        }
        this.f131322c.add(new y5r0(str, j, map2));
    }

    /* JADX INFO: renamed from: c */
    public final void m153093c(y5r0 y5r0Var) {
        this.f131320a = y5r0Var;
        this.f131321b = (y5r0) y5r0Var.clone();
        this.f131322c.clear();
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        m4r0 m4r0Var = new m4r0((y5r0) this.f131320a.clone());
        Iterator<y5r0> it = this.f131322c.iterator();
        while (it.hasNext()) {
            m4r0Var.f131322c.add((y5r0) it.next().clone());
        }
        return m4r0Var;
    }

    /* JADX INFO: renamed from: d */
    public final y5r0 m153094d() {
        return this.f131321b;
    }

    /* JADX INFO: renamed from: e */
    public final void m153095e(y5r0 y5r0Var) {
        this.f131321b = y5r0Var;
    }

    /* JADX INFO: renamed from: f */
    public final List<y5r0> m153096f() {
        return this.f131322c;
    }

    public m4r0(y5r0 y5r0Var) {
        this.f131320a = y5r0Var;
        this.f131321b = (y5r0) y5r0Var.clone();
        this.f131322c = new ArrayList();
    }
}
