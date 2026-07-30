package p149l;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class jmg0 implements ujg0, ncg0 {

    /* JADX INFO: renamed from: a */
    public final k850 f118632a;

    /* JADX INFO: renamed from: b */
    public final stc0.C20027a f118633b;

    /* JADX INFO: renamed from: c */
    public stc0 f118634c;

    /* JADX INFO: renamed from: d */
    public exc0 f118635d;

    public jmg0(k850 k850Var, String str) {
        stc0.C20027a c20027aM185898q = new stc0.C20027a().m185898q(str);
        this.f118632a = k850Var;
        this.f118633b = c20027aM185898q;
    }

    /* JADX INFO: renamed from: a */
    public final String m142182a(String str) {
        exc0 exc0Var = this.f118635d;
        if (exc0Var == null) {
            return null;
        }
        return exc0Var.m118611u(str);
    }

    /* JADX INFO: renamed from: b */
    public final void m142183b(Map map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        for (Class cls : map.keySet()) {
            this.f118633b.m185896o(cls, map.get(cls));
        }
    }
}
