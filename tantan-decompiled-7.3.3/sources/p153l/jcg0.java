package p153l;

import com.tantan.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes11.dex */
public final class jcg0<E> {

    /* JADX INFO: renamed from: a */
    final String f120050a;

    /* JADX INFO: renamed from: c */
    final v3f.C20734b<E, ?> f120052c;

    /* JADX INFO: renamed from: d */
    final ThreadMode f120053d;

    /* JADX INFO: renamed from: e */
    final int f120054e;

    /* JADX INFO: renamed from: f */
    final boolean f120055f;

    /* JADX INFO: renamed from: g */
    private InterfaceC17923b<E> f120056g;

    /* JADX INFO: renamed from: b */
    final ab50<E> f120051b = new C17922a();

    /* JADX INFO: renamed from: h */
    volatile boolean f120057h = true;

    /* JADX INFO: renamed from: l.jcg0$a */
    public class C17922a implements ab50<E> {
        public C17922a() {
        }

        @Override // p153l.ab50
        public void onChanged(E e) {
            if (jcg0.this.f120056g != null) {
                jcg0.this.f120056g.onNext(e);
            }
        }
    }

    /* JADX INFO: renamed from: l.jcg0$b */
    public interface InterfaceC17923b<E> {
        void onNext(E e);
    }

    public jcg0(v3f.C20734b<E, ?> c20734b, String str, ncg0 ncg0Var) {
        this.f120050a = str;
        this.f120053d = ncg0Var.f141352a;
        this.f120054e = ncg0Var.f141353b;
        this.f120055f = ncg0Var.f141354c;
        this.f120052c = c20734b;
    }

    /* JADX INFO: renamed from: b */
    public void m144357b(InterfaceC17923b<E> interfaceC17923b) {
        this.f120056g = interfaceC17923b;
    }

    /* JADX INFO: renamed from: c */
    public void m144358c() {
        this.f120052c.m199275o(this);
    }
}
