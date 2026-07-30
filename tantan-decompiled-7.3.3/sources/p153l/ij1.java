package p153l;

import com.p051p1.mobile.putong.live.base.util.IntSet;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ij1 {

    /* JADX INFO: renamed from: a */
    public j0u f115163a;

    /* JADX INFO: renamed from: b */
    public final String f115164b = getClass().getSimpleName();

    /* JADX INFO: renamed from: c */
    public boolean f115165c = true;

    /* JADX INFO: renamed from: d */
    public y20<d3q<?>> f115166d;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m140173a(List list, d3q d3qVar) {
        if (d3qVar instanceof z0u) {
            z0u z0uVar = (z0u) d3qVar;
            if (z0uVar.m218161H()) {
                list.add(z0uVar);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final List<z0u<?>> m140174b(IntSet intSet) {
        final ArrayList arrayList = new ArrayList();
        x7s.m209646s0(this.f115163a.m68538J(), intSet, new y20() { // from class: l.hj1
            @Override // p153l.y20
            public final void call(Object obj) {
                ij1.m140173a(arrayList, (d3q) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public z0u<?> m140175c(List<? extends d3q<?>> list) {
        for (d3q<?> d3qVar : list) {
            if (d3qVar instanceof z0u) {
                z0u<?> z0uVar = (z0u) d3qVar;
                if (z0uVar.f202388f) {
                    return z0uVar;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo118266d(IntSet intSet);

    /* JADX INFO: renamed from: e */
    public final void m140176e(j0u j0uVar) {
        this.f115163a = j0uVar;
    }

    /* JADX INFO: renamed from: f */
    public final void m140177f(d3q<?> d3qVar) {
        y20<d3q<?>> y20Var = this.f115166d;
        if (y20Var != null) {
            y20Var.call(d3qVar);
        }
        this.f115163a.m68544P(d3qVar, new gj1(true));
    }

    /* JADX INFO: renamed from: g */
    public final void m140178g(d3q<?> d3qVar) {
        this.f115163a.m68544P(d3qVar, new gj1(false));
    }

    /* JADX INFO: renamed from: h */
    public void mo118267h() {
        z0u<?> z0uVarM140175c = m140175c(this.f115163a.m68538J());
        if (z0uVarM140175c != null) {
            z0uVarM140175c.toString();
            z0uVarM140175c.m218163R();
            m140178g(z0uVarM140175c);
        }
    }
}
