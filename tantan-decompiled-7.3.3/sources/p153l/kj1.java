package p153l;

import com.p051p1.mobile.putong.live.base.util.IntSet;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public abstract class kj1 {

    /* JADX INFO: renamed from: a */
    public r0u f127059a;

    /* JADX INFO: renamed from: b */
    public final String f127060b = getClass().getSimpleName();

    /* JADX INFO: renamed from: c */
    public boolean f127061c = true;

    /* JADX INFO: renamed from: d */
    public y20<d3q<?>> f127062d;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m149997a(List list, d3q d3qVar) {
        if (d3qVar instanceof uxr) {
            uxr uxrVar = (uxr) d3qVar;
            if (uxrVar.m198509H().m172320e()) {
                list.add(uxrVar);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final List<uxr<?>> m149998b(IntSet intSet) {
        final ArrayList arrayList = new ArrayList();
        x7s.m209646s0(this.f127059a.m68538J(), intSet, new y20() { // from class: l.jj1
            @Override // p153l.y20
            public final void call(Object obj) {
                kj1.m149997a(arrayList, (d3q) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public uxr<?> m149999c(List<? extends d3q<?>> list) {
        for (d3q<?> d3qVar : list) {
            if (d3qVar instanceof uxr) {
                uxr<?> uxrVar = (uxr) d3qVar;
                if (uxrVar.m198509H().m172319d()) {
                    return uxrVar;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo132518d(IntSet intSet);

    /* JADX INFO: renamed from: e */
    public final void m150000e(r0u r0uVar) {
        this.f127059a = r0uVar;
    }

    /* JADX INFO: renamed from: f */
    public final void m150001f(d3q<?> d3qVar) {
        y20<d3q<?>> y20Var = this.f127062d;
        if (y20Var != null) {
            y20Var.call(d3qVar);
        }
        this.f127059a.m68544P(d3qVar, new gj1(true));
    }

    /* JADX INFO: renamed from: g */
    public final void m150002g(d3q<?> d3qVar) {
        this.f127059a.m68544P(d3qVar, new gj1(false));
    }

    /* JADX INFO: renamed from: h */
    public void mo132519h() {
        uxr<?> uxrVarM149999c = m149999c(this.f127059a.m68538J());
        if (uxrVarM149999c != null) {
            uxrVarM149999c.toString();
            m150002g(uxrVarM149999c);
        }
    }
}
