package p149l;

import com.p046p1.mobile.putong.live.base.util.IntSet;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class bj1 {

    /* JADX INFO: renamed from: a */
    public iyt f75853a;

    /* JADX INFO: renamed from: b */
    public final String f75854b = getClass().getSimpleName();

    /* JADX INFO: renamed from: c */
    public boolean f75855c = true;

    /* JADX INFO: renamed from: d */
    public e30<d1q<?>> f75856d;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m102136a(List list, d1q d1qVar) {
        if (d1qVar instanceof yyt) {
            yyt yytVar = (yyt) d1qVar;
            if (yytVar.m216564H()) {
                list.add(yytVar);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final List<yyt<?>> m102137b(IntSet intSet) {
        final ArrayList arrayList = new ArrayList();
        w5s.m201682s0(this.f75853a.m67355J(), intSet, new e30() { // from class: l.aj1
            @Override // p149l.e30
            public final void call(Object obj) {
                bj1.m102136a(arrayList, (d1q) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public yyt<?> m102138c(List<? extends d1q<?>> list) {
        for (d1q<?> d1qVar : list) {
            if (d1qVar instanceof yyt) {
                yyt<?> yytVar = (yyt) d1qVar;
                if (yytVar.f200811f) {
                    return yytVar;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo102139d(IntSet intSet);

    /* JADX INFO: renamed from: e */
    public final void m102140e(iyt iytVar) {
        this.f75853a = iytVar;
    }

    /* JADX INFO: renamed from: f */
    public final void m102141f(d1q<?> d1qVar) {
        e30<d1q<?>> e30Var = this.f75856d;
        if (e30Var != null) {
            e30Var.call(d1qVar);
        }
        this.f75853a.m67361P(d1qVar, new zi1(true));
    }

    /* JADX INFO: renamed from: g */
    public final void m102142g(d1q<?> d1qVar) {
        this.f75853a.m67361P(d1qVar, new zi1(false));
    }

    /* JADX INFO: renamed from: h */
    public void mo102143h() {
        yyt<?> yytVarM102138c = m102138c(this.f75853a.m67355J());
        if (yytVarM102138c != null) {
            yytVarM102138c.toString();
            yytVarM102138c.m216566R();
            m102142g(yytVarM102138c);
        }
    }
}
