package p153l;

import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes4.dex */
public class n210 implements wsl {

    /* JADX INFO: renamed from: a */
    public final u1f f139804a;

    /* JADX INFO: renamed from: b */
    public xpr f139805b;

    public n210(u1f u1fVar) {
        this.f139804a = u1fVar;
    }

    @Override // p153l.wsl
    /* JADX INFO: renamed from: a */
    public void mo161148a(w6m w6mVar) {
        this.f139805b.m212675f(w6mVar);
    }

    @Override // p153l.wsl
    /* JADX INFO: renamed from: b */
    public void mo161149b(w6m w6mVar) {
        this.f139805b.m212674e(w6mVar);
    }

    /* JADX INFO: renamed from: c */
    public void m161150c() {
        this.f139805b = new xpr(new eas());
        this.f139804a.f176994c.m101600p1((w6m) Proxy.newProxyInstance(eas.class.getClassLoader(), eas.class.getInterfaces(), this.f139805b));
        mo161149b(this.f139804a.f176994c);
        mo161149b(this.f139804a.f176995d);
        mo161149b(this.f139804a.f176996e);
    }

    /* JADX INFO: renamed from: d */
    public void m161151d() {
        this.f139804a.f176994c.m101600p1(null);
    }
}
