package com.xiaomi.push;

import com.core.glcore.util.DetectDelayStopHelper;
import com.xiaomi.push.service.C14853ax;
import com.xiaomi.push.service.XMPushService;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import p149l.aqq0;
import p149l.gkq0;
import p149l.ilq0;
import p149l.ouq0;
import p149l.quq0;
import p149l.wuq0;

/* JADX INFO: renamed from: com.xiaomi.push.h */
/* JADX INFO: loaded from: classes2.dex */
public class C14761h {

    /* JADX INFO: renamed from: a */
    private String f62307a;

    /* JADX INFO: renamed from: c */
    private int f62309c;

    /* JADX INFO: renamed from: d */
    private long f62310d;

    /* JADX INFO: renamed from: e */
    private C14736f f62311e;

    /* JADX INFO: renamed from: b */
    private boolean f62308b = false;

    /* JADX INFO: renamed from: f */
    private C14727a f62312f = C14727a.m85451b();

    /* JADX INFO: renamed from: com.xiaomi.push.h$a */
    public class a extends C14853ax.a {
        public a() {
        }

        @Override // com.xiaomi.push.service.C14853ax.a
        /* JADX INFO: renamed from: a */
        public void mo85884a(aqq0 aqq0Var) {
            if (aqq0Var.m98342w()) {
                C14761h.m85875f().m85879h(aqq0Var.m98341v());
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.h$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        static final C14761h f62314a = new C14761h();
    }

    /* JADX INFO: renamed from: b */
    private C14734ej m85872b(C14727a.a aVar) {
        if (aVar.f61639a == 0) {
            Object obj = aVar.f61641c;
            if (obj instanceof C14734ej) {
                return (C14734ej) obj;
            }
            return null;
        }
        C14734ej c14734ejM85877a = m85877a();
        c14734ejM85877a.m85531a(EnumC14733ei.CHANNEL_STATS_COUNTER.m85528a());
        c14734ejM85877a.m85543c(aVar.f61639a);
        c14734ejM85877a.m85544c(aVar.f61640b);
        return c14734ejM85877a;
    }

    /* JADX INFO: renamed from: d */
    private C14735ek m85873d(int i) {
        ArrayList arrayList = new ArrayList();
        C14735ek c14735ek = new C14735ek(this.f62307a, arrayList);
        if (!gkq0.m126695x(this.f62311e.f61756a)) {
            c14735ek.m85560a(ouq0.m166088B(this.f62311e.f61756a));
        }
        wuq0 wuq0Var = new wuq0(i);
        quq0 quq0VarMo86242a = new C14783ig.a().mo86242a(wuq0Var);
        try {
            c14735ek.mo85540b(quq0VarMo86242a);
        } catch (C14778hu unused) {
        }
        LinkedList<C14727a.a> linkedListM85454c = this.f62312f.m85454c();
        while (linkedListM85454c.size() > 0) {
            try {
                C14734ej c14734ejM85872b = m85872b(linkedListM85454c.getLast());
                if (c14734ejM85872b != null) {
                    c14734ejM85872b.mo85540b(quq0VarMo86242a);
                }
                if (wuq0Var.m205653h() > i) {
                    break;
                }
                if (c14734ejM85872b != null) {
                    arrayList.add(c14734ejM85872b);
                }
                linkedListM85454c.removeLast();
            } catch (C14778hu | NoSuchElementException unused2) {
            }
        }
        return c14735ek;
    }

    /* JADX INFO: renamed from: e */
    public static C14736f m85874e() {
        C14736f c14736f;
        C14761h c14761h = b.f62314a;
        synchronized (c14761h) {
            c14736f = c14761h.f62311e;
        }
        return c14736f;
    }

    /* JADX INFO: renamed from: f */
    public static C14761h m85875f() {
        return b.f62314a;
    }

    /* JADX INFO: renamed from: g */
    private void m85876g() {
        if (!this.f62308b || System.currentTimeMillis() - this.f62310d <= this.f62309c) {
            return;
        }
        this.f62308b = false;
        this.f62310d = 0L;
    }

    /* JADX INFO: renamed from: a */
    public synchronized C14734ej m85877a() {
        C14734ej c14734ej;
        c14734ej = new C14734ej();
        c14734ej.m85532a(gkq0.m126676e(this.f62311e.f61756a));
        c14734ej.f61738a = (byte) 0;
        c14734ej.f61742b = 1;
        c14734ej.m85547d((int) (System.currentTimeMillis() / 1000));
        return c14734ej;
    }

    /* JADX INFO: renamed from: c */
    public synchronized C14735ek m85878c() {
        C14735ek c14735ekM85873d;
        if (m85883l()) {
            c14735ekM85873d = m85873d(!gkq0.m126695x(this.f62311e.f61756a) ? 375 : DetectDelayStopHelper.TYPE_DETECT_PICKNOISE);
        } else {
            c14735ekM85873d = null;
        }
        return c14735ekM85873d;
    }

    /* JADX INFO: renamed from: h */
    public void m85879h(int i) {
        if (i > 0) {
            int i2 = i * 1000;
            if (i2 > 604800000) {
                i2 = 604800000;
            }
            if (this.f62309c == i2 && this.f62308b) {
                return;
            }
            this.f62308b = true;
            this.f62310d = System.currentTimeMillis();
            this.f62309c = i2;
            ilq0.m137053z("enable dot duration = " + i2 + " start = " + this.f62310d);
        }
    }

    /* JADX INFO: renamed from: i */
    public synchronized void m85880i(C14734ej c14734ej) {
        this.f62312f.m85455e(c14734ej);
    }

    /* JADX INFO: renamed from: j */
    public synchronized void m85881j(XMPushService xMPushService) {
        this.f62311e = new C14736f(xMPushService);
        this.f62307a = "";
        C14853ax.m86571a().m86585a(new a());
    }

    /* JADX INFO: renamed from: k */
    public boolean m85882k() {
        return this.f62308b;
    }

    /* JADX INFO: renamed from: l */
    public boolean m85883l() {
        m85876g();
        return this.f62308b && this.f62312f.m85453a() > 0;
    }
}
