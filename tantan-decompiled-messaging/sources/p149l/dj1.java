package p149l;

import com.p046p1.mobile.putong.live.base.util.IntSet;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class dj1 {

    /* JADX INFO: renamed from: a */
    public qyt f86472a;

    /* JADX INFO: renamed from: b */
    public final String f86473b = getClass().getSimpleName();

    /* JADX INFO: renamed from: c */
    public boolean f86474c = true;

    /* JADX INFO: renamed from: d */
    public e30<d1q<?>> f86475d;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m111970a(List list, d1q d1qVar) {
        if (d1qVar instanceof tvr) {
            tvr tvrVar = (tvr) d1qVar;
            if (tvrVar.m190776H().m174383e()) {
                list.add(tvrVar);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final List<tvr<?>> m111971b(IntSet intSet) {
        final ArrayList arrayList = new ArrayList();
        w5s.m201682s0(this.f86472a.m67355J(), intSet, new e30() { // from class: l.cj1
            @Override // p149l.e30
            public final void call(Object obj) {
                dj1.m111970a(arrayList, (d1q) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public tvr<?> m111972c(List<? extends d1q<?>> list) {
        for (d1q<?> d1qVar : list) {
            if (d1qVar instanceof tvr) {
                tvr<?> tvrVar = (tvr) d1qVar;
                if (tvrVar.m190776H().m174382d()) {
                    return tvrVar;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo107739d(IntSet intSet);

    /* JADX INFO: renamed from: e */
    public final void m111973e(qyt qytVar) {
        this.f86472a = qytVar;
    }

    /* JADX INFO: renamed from: f */
    public final void m111974f(d1q<?> d1qVar) {
        e30<d1q<?>> e30Var = this.f86475d;
        if (e30Var != null) {
            e30Var.call(d1qVar);
        }
        this.f86472a.m67361P(d1qVar, new zi1(true));
    }

    /* JADX INFO: renamed from: g */
    public final void m111975g(d1q<?> d1qVar) {
        this.f86472a.m67361P(d1qVar, new zi1(false));
    }

    /* JADX INFO: renamed from: h */
    public void mo107740h() {
        tvr<?> tvrVarM111972c = m111972c(this.f86472a.m67355J());
        if (tvrVarM111972c != null) {
            tvrVarM111972c.toString();
            m111975g(tvrVarM111972c);
        }
    }
}
