package p153l;

import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes9.dex */
public class o210 {

    /* JADX INFO: renamed from: a */
    public final v1f f144703a;

    /* JADX INFO: renamed from: b */
    public ypr f144704b;

    public o210(v1f v1fVar) {
        this.f144703a = v1fVar;
    }

    /* JADX INFO: renamed from: a */
    public void m165686a() {
        this.f144704b = new ypr(new eas());
        this.f144703a.f181963c.m95608g1((w6m) Proxy.newProxyInstance(eas.class.getClassLoader(), eas.class.getInterfaces(), this.f144704b));
        m165687b(this.f144703a.f181963c);
        m165687b(this.f144703a.f181964d);
        m165687b(this.f144703a.f181965e);
    }

    /* JADX INFO: renamed from: b */
    public void m165687b(w6m w6mVar) {
        this.f144704b.m217030e(w6mVar);
    }

    /* JADX INFO: renamed from: c */
    public void m165688c() {
        this.f144703a.f181963c.m95608g1(null);
    }

    /* JADX INFO: renamed from: d */
    public void m165689d(w6m w6mVar) {
        this.f144704b.m217031f(w6mVar);
    }
}
