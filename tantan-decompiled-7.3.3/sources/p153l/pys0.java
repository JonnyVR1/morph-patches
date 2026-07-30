package p153l;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class pys0 extends qxs0 {

    /* JADX INFO: renamed from: a */
    public final nxj0 f154688a;

    public pys0(nxj0 nxj0Var) {
        this.f154688a = nxj0Var;
    }

    @Override // p153l.rxs0
    /* JADX INFO: renamed from: J */
    public final boolean mo174239J() {
        return this.f154688a.m165145m();
    }

    @Override // p153l.rxs0
    /* JADX INFO: renamed from: a */
    public final String mo174240a() {
        return this.f154688a.m165135c();
    }

    @Override // p153l.rxs0
    /* JADX INFO: renamed from: b */
    public final List mo174241b() {
        List<od20> listM165142j = this.f154688a.m165142j();
        ArrayList arrayList = new ArrayList();
        if (listM165142j != null) {
            for (od20 od20Var : listM165142j) {
                arrayList.add(new fks0(od20Var.mo104928a(), od20Var.mo104930c(), od20Var.mo104929b(), od20Var.mo104932e(), od20Var.mo104931d()));
            }
        }
        return arrayList;
    }

    @Override // p153l.rxs0
    /* JADX INFO: renamed from: g */
    public final void mo174242g() {
        this.f154688a.m165151s();
    }

    @Override // p153l.rxs0
    /* JADX INFO: renamed from: k7 */
    public final void mo174243k7(p1m p1mVar) {
        this.f154688a.m165149q((View) h950.m134037P2(p1mVar));
    }

    @Override // p153l.rxs0
    /* JADX INFO: renamed from: o1 */
    public final void mo174244o1(p1m p1mVar, p1m p1mVar2, p1m p1mVar3) {
        HashMap map = (HashMap) h950.m134037P2(p1mVar2);
        HashMap map2 = (HashMap) h950.m134037P2(p1mVar3);
        this.f154688a.mo143949E((View) h950.m134037P2(p1mVar), map, map2);
    }

    @Override // p153l.rxs0
    /* JADX INFO: renamed from: t */
    public final boolean mo174245t() {
        return this.f154688a.m165144l();
    }

    @Override // p153l.rxs0
    /* JADX INFO: renamed from: y7 */
    public final void mo174246y7(p1m p1mVar) {
        this.f154688a.m165127F((View) h950.m134037P2(p1mVar));
    }

    @Override // p153l.rxs0
    public final double zze() {
        if (this.f154688a.m165147o() != null) {
            return this.f154688a.m165147o().doubleValue();
        }
        return -1.0d;
    }

    @Override // p153l.rxs0
    public final float zzf() {
        return this.f154688a.m165143k();
    }

    @Override // p153l.rxs0
    public final float zzg() {
        return this.f154688a.m165137e();
    }

    @Override // p153l.rxs0
    public final float zzh() {
        return this.f154688a.m165138f();
    }

    @Override // p153l.rxs0
    public final Bundle zzi() {
        return this.f154688a.m165139g();
    }

    @Override // p153l.rxs0
    @Nullable
    public final lpu0 zzj() {
        if (this.f154688a.m165129H() != null) {
            return this.f154688a.m165129H().m200828b();
        }
        return null;
    }

    @Override // p153l.rxs0
    @Nullable
    public final tks0 zzk() {
        return null;
    }

    @Override // p153l.rxs0
    @Nullable
    public final als0 zzl() {
        od20 od20VarM165141i = this.f154688a.m165141i();
        if (od20VarM165141i != null) {
            return new fks0(od20VarM165141i.mo104928a(), od20VarM165141i.mo104930c(), od20VarM165141i.mo104929b(), od20VarM165141i.mo104932e(), od20VarM165141i.mo104931d());
        }
        return null;
    }

    @Override // p153l.rxs0
    @Nullable
    public final p1m zzm() {
        View viewM165133a = this.f154688a.m165133a();
        if (viewM165133a == null) {
            return null;
        }
        return h950.m134038Y2(viewM165133a);
    }

    @Override // p153l.rxs0
    @Nullable
    public final p1m zzn() {
        View viewM165128G = this.f154688a.m165128G();
        if (viewM165128G == null) {
            return null;
        }
        return h950.m134038Y2(viewM165128G);
    }

    @Override // p153l.rxs0
    @Nullable
    public final p1m zzo() {
        Object objM165130I = this.f154688a.m165130I();
        if (objM165130I == null) {
            return null;
        }
        return h950.m134038Y2(objM165130I);
    }

    @Override // p153l.rxs0
    public final String zzp() {
        return this.f154688a.m165134b();
    }

    @Override // p153l.rxs0
    public final String zzr() {
        return this.f154688a.m165136d();
    }

    @Override // p153l.rxs0
    public final String zzs() {
        return this.f154688a.m165140h();
    }

    @Override // p153l.rxs0
    public final String zzt() {
        return this.f154688a.m165146n();
    }

    @Override // p153l.rxs0
    public final String zzu() {
        return this.f154688a.m165148p();
    }
}
