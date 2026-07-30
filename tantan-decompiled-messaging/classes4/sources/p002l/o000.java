package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.data.Message;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.j760;
import l.mcr;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class o000 implements twl {

    /* JADX INFO: renamed from: a */
    public ViewGroup f16321a;

    /* JADX INFO: renamed from: b */
    public swl f16322b;

    /* JADX INFO: renamed from: c */
    public List<View> f16323c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public List<View> f16324d = new ArrayList();

    public o000(ViewGroup viewGroup) {
        this.f16321a = viewGroup;
    }

    /* JADX INFO: renamed from: a */
    public abstract void m19171a(View view, Message message, int i, int i2);

    /* JADX INFO: renamed from: b */
    public final void m19172b(swl swlVar) {
        this.f16322b = swlVar;
        swlVar.mo16923x(this.f16323c);
        swlVar.mo16916i(this.f16324d);
        this.f16323c.clear();
        this.f16324d.clear();
    }

    /* JADX INFO: renamed from: c */
    public <V> c<V> m19173c(mcr mcrVar, c<V> cVar) {
        return NullChecker.a(this.f16322b) ? this.f16322b.c(mcrVar, cVar) : b.b();
    }

    /* JADX INFO: renamed from: d */
    public abstract int m19174d();

    /* JADX INFO: renamed from: g */
    public <V> c<V> m19175g(mcr mcrVar, c<V> cVar, boolean z) {
        return NullChecker.a(this.f16322b) ? this.f16322b.g(mcrVar, cVar, z) : b.b();
    }

    @Override // p002l.w1m
    /* JADX INFO: renamed from: j */
    public void mo16917j(View view) {
        if (NullChecker.a(this.f16322b)) {
            this.f16322b.mo16917j(view);
        } else {
            this.f16323c.remove(view);
        }
    }

    /* JADX INFO: renamed from: m */
    public abstract Message m19176m(int i);

    /* JADX INFO: renamed from: p */
    public abstract int m19177p(int i);

    /* JADX INFO: renamed from: r */
    public final void m19178r() {
        if (NullChecker.a(this.f16322b)) {
            this.f16322b.mo16920r();
        }
    }

    /* JADX INFO: renamed from: s */
    public abstract List<j760<Integer, Integer>> m19179s();

    @Override // p002l.w1m
    /* JADX INFO: renamed from: t */
    public void mo16921t(View view) {
        if (NullChecker.a(this.f16322b)) {
            this.f16322b.mo16921t(view);
        } else {
            this.f16323c.add(view);
        }
    }

    /* JADX INFO: renamed from: w */
    public abstract View m19180w(ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: y */
    public void m19181y() {
        if (NullChecker.a(this.f16322b)) {
            this.f16322b.mo16919n();
        }
    }

    /* JADX INFO: renamed from: z */
    public void m19182z() {
        if (NullChecker.a(this.f16322b)) {
            this.f16322b.mo16922u();
        }
    }
}
