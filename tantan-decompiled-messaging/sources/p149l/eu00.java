package p149l;

import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes4.dex */
public class eu00 implements kql {

    /* JADX INFO: renamed from: a */
    public final q0f f93205a;

    /* JADX INFO: renamed from: b */
    public wnr f93206b;

    public eu00(q0f q0fVar) {
        this.f93205a = q0fVar;
    }

    @Override // p149l.kql
    /* JADX INFO: renamed from: a */
    public void mo118143a(g4m g4mVar) {
        this.f93206b.m204766f(g4mVar);
    }

    @Override // p149l.kql
    /* JADX INFO: renamed from: b */
    public void mo118144b(g4m g4mVar) {
        this.f93206b.m204765e(g4mVar);
    }

    /* JADX INFO: renamed from: c */
    public void m118145c() {
        this.f93206b = new wnr(new d8s());
        this.f93205a.f152051c.m185837p1((g4m) Proxy.newProxyInstance(d8s.class.getClassLoader(), d8s.class.getInterfaces(), this.f93206b));
        mo118144b(this.f93205a.f152051c);
        mo118144b(this.f93205a.f152052d);
        mo118144b(this.f93205a.f152053e);
    }

    /* JADX INFO: renamed from: d */
    public void m118146d() {
        this.f93205a.f152051c.m185837p1(null);
    }
}
