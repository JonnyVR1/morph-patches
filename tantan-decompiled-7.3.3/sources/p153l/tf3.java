package p153l;

import androidx.annotation.MainThread;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes13.dex */
public class tf3<V> {

    /* JADX INFO: renamed from: a */
    public final C22507a<V> f173917a;

    public tf3(V v2) {
        this.f173917a = C22507a.m222759c(v2);
    }

    @MainThread
    /* JADX INFO: renamed from: a */
    public V m190908a(y20<V> y20Var) {
        m190909b();
        V vM190910c = m190910c();
        if (vM190910c != null) {
            y20Var.call(vM190910c);
            m190912e(vM190910c);
        }
        return vM190910c;
    }

    @MainThread
    /* JADX INFO: renamed from: c */
    public V m190910c() {
        m190909b();
        return this.f173917a.m222761e();
    }

    /* JADX INFO: renamed from: d */
    public C22421c<V> m190911d() {
        return this.f173917a.serialize();
    }

    @MainThread
    /* JADX INFO: renamed from: e */
    public void m190912e(V v2) {
        m190909b();
        this.f173917a.onNext(v2);
    }

    /* JADX INFO: renamed from: b */
    public final void m190909b() {
    }
}
