package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.data.Message;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o000 implements twl {

    /* JADX INFO: renamed from: a */
    public ViewGroup f141274a;

    /* JADX INFO: renamed from: b */
    public swl f141275b;

    /* JADX INFO: renamed from: c */
    public List<View> f141276c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public List<View> f141277d = new ArrayList();

    public o000(ViewGroup viewGroup) {
        this.f141274a = viewGroup;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo139108a(View view, Message message, int i, int i2);

    /* JADX INFO: renamed from: b */
    public final void m162102b(swl swlVar) {
        this.f141275b = swlVar;
        swlVar.mo147989x(this.f141276c);
        swlVar.mo147982i(this.f141277d);
        this.f141276c.clear();
        this.f141277d.clear();
    }

    @Override // p149l.dml
    /* JADX INFO: renamed from: c */
    public <V> C22306c<V> mo67374c(mcr mcrVar, C22306c<V> c22306c) {
        return NullChecker.m81303a(this.f141275b) ? this.f141275b.mo67374c(mcrVar, c22306c) : C22393b.m221521b();
    }

    /* JADX INFO: renamed from: d */
    public abstract int mo139112d();

    @Override // p149l.dml
    /* JADX INFO: renamed from: g */
    public <V> C22306c<V> mo67378g(mcr mcrVar, C22306c<V> c22306c, boolean z) {
        return NullChecker.m81303a(this.f141275b) ? this.f141275b.mo67378g(mcrVar, c22306c, z) : C22393b.m221521b();
    }

    @Override // p149l.w1m
    /* JADX INFO: renamed from: j */
    public void mo147983j(View view) {
        if (NullChecker.m81303a(this.f141275b)) {
            this.f141275b.mo147983j(view);
        } else {
            this.f141276c.remove(view);
        }
    }

    /* JADX INFO: renamed from: m */
    public abstract Message mo139119m(int i);

    /* JADX INFO: renamed from: p */
    public abstract int mo139120p(int i);

    /* JADX INFO: renamed from: r */
    public final void m162103r() {
        if (NullChecker.m81303a(this.f141275b)) {
            this.f141275b.mo147986r();
        }
    }

    /* JADX INFO: renamed from: s */
    public abstract List<j760<Integer, Integer>> mo139121s();

    @Override // p149l.w1m
    /* JADX INFO: renamed from: t */
    public void mo147987t(View view) {
        if (NullChecker.m81303a(this.f141275b)) {
            this.f141275b.mo147987t(view);
        } else {
            this.f141276c.add(view);
        }
    }

    /* JADX INFO: renamed from: w */
    public abstract View mo139122w(ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: y */
    public void m162104y() {
        if (NullChecker.m81303a(this.f141275b)) {
            this.f141275b.mo147985n();
        }
    }

    /* JADX INFO: renamed from: z */
    public void m162105z() {
        if (NullChecker.m81303a(this.f141275b)) {
            this.f141275b.mo147988u();
        }
    }
}
