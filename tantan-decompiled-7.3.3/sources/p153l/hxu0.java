package p153l;

import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class hxu0 {

    /* JADX INFO: renamed from: e */
    public final String f112057e;

    /* JADX INFO: renamed from: f */
    public final cxu0 f112058f;

    /* JADX INFO: renamed from: b */
    @GuardedBy("this")
    public final List f112054b = new ArrayList();

    /* JADX INFO: renamed from: c */
    @GuardedBy("this")
    public boolean f112055c = false;

    /* JADX INFO: renamed from: d */
    @GuardedBy("this")
    public boolean f112056d = false;

    /* JADX INFO: renamed from: a */
    public final grw0 f112053a = bxy0.m106933q().m120264i();

    public hxu0(String str, cxu0 cxu0Var) {
        this.f112057e = str;
        this.f112058f = cxu0Var;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m137652a(String str) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168217Z1)).booleanValue()) {
            if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168554z8)).booleanValue()) {
                Map mapM137658g = m137658g();
                mapM137658g.put("action", "aaia");
                mapM137658g.put("aair", "MalformedJson");
                this.f112054b.add(mapM137658g);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m137653b(String str, String str2) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168217Z1)).booleanValue()) {
            if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168554z8)).booleanValue()) {
                Map mapM137658g = m137658g();
                mapM137658g.put("action", "adapter_init_finished");
                mapM137658g.put("ancn", str);
                mapM137658g.put("rqe", str2);
                this.f112054b.add(mapM137658g);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m137654c(String str) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168217Z1)).booleanValue()) {
            if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168554z8)).booleanValue()) {
                Map mapM137658g = m137658g();
                mapM137658g.put("action", "adapter_init_started");
                mapM137658g.put("ancn", str);
                this.f112054b.add(mapM137658g);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m137655d(String str) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168217Z1)).booleanValue()) {
            if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168554z8)).booleanValue()) {
                Map mapM137658g = m137658g();
                mapM137658g.put("action", "adapter_init_finished");
                mapM137658g.put("ancn", str);
                this.f112054b.add(mapM137658g);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m137656e() {
        try {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168217Z1)).booleanValue()) {
                if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168554z8)).booleanValue() && !this.f112056d) {
                    Map mapM137658g = m137658g();
                    mapM137658g.put("action", "init_finished");
                    this.f112054b.add(mapM137658g);
                    Iterator it = this.f112054b.iterator();
                    while (it.hasNext()) {
                        this.f112058f.m128028f((Map) it.next());
                    }
                    this.f112056d = true;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m137657f() {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168217Z1)).booleanValue()) {
            if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168554z8)).booleanValue() && !this.f112055c) {
                Map mapM137658g = m137658g();
                mapM137658g.put("action", "init_started");
                this.f112054b.add(mapM137658g);
                this.f112055c = true;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final Map m137658g() {
        Map mapM113068g = this.f112058f.m113068g();
        mapM113068g.put("tms", Long.toString(bxy0.m106918b().elapsedRealtime(), 10));
        mapM113068g.put("tid", this.f112053a.mo131896f() ? "" : this.f112057e);
        return mapM113068g;
    }
}
