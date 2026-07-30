package com.xiaomi.push;

import com.core.glcore.util.DetectDelayStopHelper;
import com.xiaomi.push.service.C15001ax;
import com.xiaomi.push.service.XMPushService;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import p153l.c4r0;
import p153l.gzq0;
import p153l.mtq0;
import p153l.ouq0;
import p153l.u3r0;
import p153l.w3r0;

/* JADX INFO: renamed from: com.xiaomi.push.h */
/* JADX INFO: loaded from: classes2.dex */
public class C14909h {

    /* JADX INFO: renamed from: a */
    private String f63154a;

    /* JADX INFO: renamed from: c */
    private int f63156c;

    /* JADX INFO: renamed from: d */
    private long f63157d;

    /* JADX INFO: renamed from: e */
    private C14884f f63158e;

    /* JADX INFO: renamed from: b */
    private boolean f63155b = false;

    /* JADX INFO: renamed from: f */
    private C14875a f63159f = C14875a.m86622b();

    /* JADX INFO: renamed from: com.xiaomi.push.h$a */
    public class a extends C15001ax.a {
        public a() {
        }

        @Override // com.xiaomi.push.service.C15001ax.a
        /* JADX INFO: renamed from: a */
        public void mo87055a(gzq0 gzq0Var) {
            if (gzq0Var.m133121w()) {
                C14909h.m87046f().m87050h(gzq0Var.m133120v());
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.h$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        static final C14909h f63161a = new C14909h();
    }

    /* JADX INFO: renamed from: b */
    private C14882ej m87043b(C14875a.a aVar) {
        if (aVar.f62486a == 0) {
            Object obj = aVar.f62488c;
            if (obj instanceof C14882ej) {
                return (C14882ej) obj;
            }
            return null;
        }
        C14882ej c14882ejM87048a = m87048a();
        c14882ejM87048a.m86702a(EnumC14881ei.CHANNEL_STATS_COUNTER.m86699a());
        c14882ejM87048a.m86714c(aVar.f62486a);
        c14882ejM87048a.m86715c(aVar.f62487b);
        return c14882ejM87048a;
    }

    /* JADX INFO: renamed from: d */
    private C14883ek m87044d(int i) {
        ArrayList arrayList = new ArrayList();
        C14883ek c14883ek = new C14883ek(this.f63154a, arrayList);
        if (!mtq0.m160048x(this.f63158e.f62603a)) {
            c14883ek.m86731a(u3r0.m194389B(this.f63158e.f62603a));
        }
        c4r0 c4r0Var = new c4r0(i);
        w3r0 w3r0VarMo87413a = new C14931ig.a().mo87413a(c4r0Var);
        try {
            c14883ek.mo86711b(w3r0VarMo87413a);
        } catch (C14926hu unused) {
        }
        LinkedList<C14875a.a> linkedListM86625c = this.f63159f.m86625c();
        while (linkedListM86625c.size() > 0) {
            try {
                C14882ej c14882ejM87043b = m87043b(linkedListM86625c.getLast());
                if (c14882ejM87043b != null) {
                    c14882ejM87043b.mo86711b(w3r0VarMo87413a);
                }
                if (c4r0Var.m107957h() > i) {
                    break;
                }
                if (c14882ejM87043b != null) {
                    arrayList.add(c14882ejM87043b);
                }
                linkedListM86625c.removeLast();
            } catch (C14926hu | NoSuchElementException unused2) {
            }
        }
        return c14883ek;
    }

    /* JADX INFO: renamed from: e */
    public static C14884f m87045e() {
        C14884f c14884f;
        C14909h c14909h = b.f63161a;
        synchronized (c14909h) {
            c14884f = c14909h.f63158e;
        }
        return c14884f;
    }

    /* JADX INFO: renamed from: f */
    public static C14909h m87046f() {
        return b.f63161a;
    }

    /* JADX INFO: renamed from: g */
    private void m87047g() {
        if (!this.f63155b || System.currentTimeMillis() - this.f63157d <= this.f63156c) {
            return;
        }
        this.f63155b = false;
        this.f63157d = 0L;
    }

    /* JADX INFO: renamed from: a */
    public synchronized C14882ej m87048a() {
        C14882ej c14882ej;
        c14882ej = new C14882ej();
        c14882ej.m86703a(mtq0.m160029e(this.f63158e.f62603a));
        c14882ej.f62585a = (byte) 0;
        c14882ej.f62589b = 1;
        c14882ej.m86718d((int) (System.currentTimeMillis() / 1000));
        return c14882ej;
    }

    /* JADX INFO: renamed from: c */
    public synchronized C14883ek m87049c() {
        C14883ek c14883ekM87044d;
        if (m87054l()) {
            c14883ekM87044d = m87044d(!mtq0.m160048x(this.f63158e.f62603a) ? 375 : DetectDelayStopHelper.TYPE_DETECT_PICKNOISE);
        } else {
            c14883ekM87044d = null;
        }
        return c14883ekM87044d;
    }

    /* JADX INFO: renamed from: h */
    public void m87050h(int i) {
        if (i > 0) {
            int i2 = i * 1000;
            if (i2 > 604800000) {
                i2 = 604800000;
            }
            if (this.f63156c == i2 && this.f63155b) {
                return;
            }
            this.f63155b = true;
            this.f63157d = System.currentTimeMillis();
            this.f63156c = i2;
            ouq0.m169406z("enable dot duration = " + i2 + " start = " + this.f63157d);
        }
    }

    /* JADX INFO: renamed from: i */
    public synchronized void m87051i(C14882ej c14882ej) {
        this.f63159f.m86626e(c14882ej);
    }

    /* JADX INFO: renamed from: j */
    public synchronized void m87052j(XMPushService xMPushService) {
        this.f63158e = new C14884f(xMPushService);
        this.f63154a = "";
        C15001ax.m87742a().m87756a(new a());
    }

    /* JADX INFO: renamed from: k */
    public boolean m87053k() {
        return this.f63155b;
    }

    /* JADX INFO: renamed from: l */
    public boolean m87054l() {
        m87047g();
        return this.f63155b && this.f63159f.m86624a() > 0;
    }
}
