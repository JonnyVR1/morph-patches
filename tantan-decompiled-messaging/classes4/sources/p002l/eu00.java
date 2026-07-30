package p002l;

import java.lang.reflect.Proxy;
import l.d8s;
import l.g4m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class eu00 implements kql {

    /* JADX INFO: renamed from: a */
    public final q0f f9963a;

    /* JADX INFO: renamed from: b */
    public wnr f9964b;

    public eu00(q0f q0fVar) {
        this.f9963a = q0fVar;
    }

    @Override // p002l.kql
    /* JADX INFO: renamed from: a */
    public void mo12700a(g4m g4mVar) {
        this.f9964b.m25261f(g4mVar);
    }

    @Override // p002l.kql
    /* JADX INFO: renamed from: b */
    public void mo12701b(g4m g4mVar) {
        this.f9964b.m25260e(g4mVar);
    }

    /* JADX INFO: renamed from: c */
    public void m12702c() {
        this.f9964b = new wnr(new d8s());
        this.f9963a.f17744c.m22667p1((g4m) Proxy.newProxyInstance(d8s.class.getClassLoader(), d8s.class.getInterfaces(), this.f9964b));
        mo12701b(this.f9963a.f17744c);
        mo12701b(this.f9963a.f17745d);
        mo12701b(this.f9963a.f17746e);
    }

    /* JADX INFO: renamed from: d */
    public void m12703d() {
        this.f9963a.f17744c.m22667p1(null);
    }
}
