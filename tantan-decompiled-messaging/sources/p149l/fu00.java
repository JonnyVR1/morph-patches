package p149l;

import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes13.dex */
public class fu00 {

    /* JADX INFO: renamed from: a */
    public final r0f f99296a;

    /* JADX INFO: renamed from: b */
    public xnr f99297b;

    public fu00(r0f r0fVar) {
        this.f99296a = r0fVar;
    }

    /* JADX INFO: renamed from: a */
    public void m123130a() {
        this.f99297b = new xnr(new d8s());
        this.f99296a.f157168c.m180768g1((g4m) Proxy.newProxyInstance(d8s.class.getClassLoader(), d8s.class.getInterfaces(), this.f99297b));
        m123131b(this.f99296a.f157168c);
        m123131b(this.f99296a.f157169d);
        m123131b(this.f99296a.f157170e);
    }

    /* JADX INFO: renamed from: b */
    public void m123131b(g4m g4mVar) {
        this.f99297b.m210204e(g4mVar);
    }

    /* JADX INFO: renamed from: c */
    public void m123132c() {
        this.f99296a.f157168c.m180768g1(null);
    }

    /* JADX INFO: renamed from: d */
    public void m123133d(g4m g4mVar) {
        this.f99297b.m210205f(g4mVar);
    }
}
