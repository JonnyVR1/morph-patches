package p149l;

import androidx.annotation.MainThread;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes13.dex */
public class ff3<V> {

    /* JADX INFO: renamed from: a */
    public final C22392a<V> f97181a;

    public ff3(V v2) {
        this.f97181a = C22392a.m221513c(v2);
    }

    @MainThread
    /* JADX INFO: renamed from: a */
    public V m121100a(e30<V> e30Var) {
        m121101b();
        V vM121102c = m121102c();
        if (vM121102c != null) {
            e30Var.call(vM121102c);
            m121104e(vM121102c);
        }
        return vM121102c;
    }

    @MainThread
    /* JADX INFO: renamed from: c */
    public V m121102c() {
        m121101b();
        return this.f97181a.m221515e();
    }

    /* JADX INFO: renamed from: d */
    public C22306c<V> m121103d() {
        return this.f97181a.serialize();
    }

    @MainThread
    /* JADX INFO: renamed from: e */
    public void m121104e(V v2) {
        m121101b();
        this.f97181a.onNext(v2);
    }

    /* JADX INFO: renamed from: b */
    public final void m121101b() {
    }
}
