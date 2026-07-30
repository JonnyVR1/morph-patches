package p149l;

import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class bou0 {

    /* JADX INFO: renamed from: e */
    public final String f76565e;

    /* JADX INFO: renamed from: f */
    public final wnu0 f76566f;

    /* JADX INFO: renamed from: b */
    @GuardedBy("this")
    public final List f76562b = new ArrayList();

    /* JADX INFO: renamed from: c */
    @GuardedBy("this")
    public boolean f76563c = false;

    /* JADX INFO: renamed from: d */
    @GuardedBy("this")
    public boolean f76564d = false;

    /* JADX INFO: renamed from: a */
    public final aiw0 f76561a = vny0.m199079q().m212279i();

    public bou0(String str, wnu0 wnu0Var) {
        this.f76565e = str;
        this.f76566f = wnu0Var;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m102984a(String str) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132146Z1)).booleanValue()) {
            if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132483z8)).booleanValue()) {
                Map mapM102990g = m102990g();
                mapM102990g.put("action", "aaia");
                mapM102990g.put("aair", "MalformedJson");
                this.f76562b.add(mapM102990g);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m102985b(String str, String str2) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132146Z1)).booleanValue()) {
            if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132483z8)).booleanValue()) {
                Map mapM102990g = m102990g();
                mapM102990g.put("action", "adapter_init_finished");
                mapM102990g.put("ancn", str);
                mapM102990g.put("rqe", str2);
                this.f76562b.add(mapM102990g);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m102986c(String str) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132146Z1)).booleanValue()) {
            if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132483z8)).booleanValue()) {
                Map mapM102990g = m102990g();
                mapM102990g.put("action", "adapter_init_started");
                mapM102990g.put("ancn", str);
                this.f76562b.add(mapM102990g);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m102987d(String str) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132146Z1)).booleanValue()) {
            if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132483z8)).booleanValue()) {
                Map mapM102990g = m102990g();
                mapM102990g.put("action", "adapter_init_finished");
                mapM102990g.put("ancn", str);
                this.f76562b.add(mapM102990g);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m102988e() {
        try {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132146Z1)).booleanValue()) {
                if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132483z8)).booleanValue() && !this.f76564d) {
                    Map mapM102990g = m102990g();
                    mapM102990g.put("action", "init_finished");
                    this.f76562b.add(mapM102990g);
                    Iterator it = this.f76562b.iterator();
                    while (it.hasNext()) {
                        this.f76566f.m219493f((Map) it.next());
                    }
                    this.f76564d = true;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m102989f() {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132146Z1)).booleanValue()) {
            if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132483z8)).booleanValue() && !this.f76563c) {
                Map mapM102990g = m102990g();
                mapM102990g.put("action", "init_started");
                this.f76562b.add(mapM102990g);
                this.f76563c = true;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final Map m102990g() {
        Map mapM204781g = this.f76566f.m204781g();
        mapM204781g.put("tms", Long.toString(vny0.m199064b().elapsedRealtime(), 10));
        mapM204781g.put("tid", this.f76561a.mo96947f() ? "" : this.f76565e);
        return mapM204781g;
    }
}
