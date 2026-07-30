package p149l;

import com.tantan.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes13.dex */
public final class b4g0<E> {

    /* JADX INFO: renamed from: a */
    final String f73349a;

    /* JADX INFO: renamed from: c */
    final q2f.C19395b<E, ?> f73351c;

    /* JADX INFO: renamed from: d */
    final ThreadMode f73352d;

    /* JADX INFO: renamed from: e */
    final int f73353e;

    /* JADX INFO: renamed from: f */
    final boolean f73354f;

    /* JADX INFO: renamed from: g */
    private InterfaceC15799b<E> f73355g;

    /* JADX INFO: renamed from: b */
    final l250<E> f73350b = new C15798a();

    /* JADX INFO: renamed from: h */
    volatile boolean f73356h = true;

    /* JADX INFO: renamed from: l.b4g0$a */
    public class C15798a implements l250<E> {
        public C15798a() {
        }

        @Override // p149l.l250
        public void onChanged(E e) {
            if (b4g0.this.f73355g != null) {
                b4g0.this.f73355g.onNext(e);
            }
        }
    }

    /* JADX INFO: renamed from: l.b4g0$b */
    public interface InterfaceC15799b<E> {
        void onNext(E e);
    }

    public b4g0(q2f.C19395b<E, ?> c19395b, String str, f4g0 f4g0Var) {
        this.f73349a = str;
        this.f73352d = f4g0Var.f94819a;
        this.f73353e = f4g0Var.f94820b;
        this.f73354f = f4g0Var.f94821c;
        this.f73351c = c19395b;
    }

    /* JADX INFO: renamed from: b */
    public void m100252b(InterfaceC15799b<E> interfaceC15799b) {
        this.f73355g = interfaceC15799b;
    }

    /* JADX INFO: renamed from: c */
    public void m100253c() {
        this.f73351c.m172465o(this);
    }
}
