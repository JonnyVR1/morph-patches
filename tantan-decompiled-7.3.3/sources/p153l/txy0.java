package p153l;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes6.dex */
public abstract class txy0 implements mzy0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f176619a = new ArrayList(1);

    /* JADX INFO: renamed from: b */
    public final HashSet f176620b = new HashSet(1);

    /* JADX INFO: renamed from: c */
    public final l0z0 f176621c = new l0z0();

    /* JADX INFO: renamed from: d */
    public final zty0 f176622d = new zty0();

    /* JADX INFO: renamed from: e */
    @Nullable
    public Looper f176623e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public d0u0 f176624f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public voy0 f176625g;

    @Override // p153l.mzy0
    /* JADX INFO: renamed from: a */
    public final void mo160934a(buy0 buy0Var) {
        this.f176622d.m221580c(buy0Var);
    }

    @Override // p153l.mzy0
    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean mo160935b() {
        return true;
    }

    @Override // p153l.mzy0
    /* JADX INFO: renamed from: e */
    public final void mo160936e(m0z0 m0z0Var) {
        this.f176621c.m152414h(m0z0Var);
    }

    @Override // p153l.mzy0
    /* JADX INFO: renamed from: f */
    public final void mo160937f(Handler handler, m0z0 m0z0Var) {
        this.f176621c.m152408b(handler, m0z0Var);
    }

    @Override // p153l.mzy0
    /* JADX INFO: renamed from: g */
    public final void mo160938g(lzy0 lzy0Var, @Nullable btx0 btx0Var, voy0 voy0Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f176623e;
        boolean z = true;
        if (looper != null && looper != looperMyLooper) {
            z = false;
        }
        lev0.m153956d(z);
        this.f176625g = voy0Var;
        d0u0 d0u0Var = this.f176624f;
        this.f176619a.add(lzy0Var);
        if (this.f176623e == null) {
            this.f176623e = looperMyLooper;
            this.f176620b.add(lzy0Var);
            mo128583v(btx0Var);
        } else if (d0u0Var != null) {
            mo160942n(lzy0Var);
            lzy0Var.mo149093a(this, d0u0Var);
        }
    }

    @Override // p153l.mzy0
    /* JADX INFO: renamed from: h */
    public final void mo160939h(lzy0 lzy0Var) {
        this.f176619a.remove(lzy0Var);
        if (!this.f176619a.isEmpty()) {
            mo160941l(lzy0Var);
            return;
        }
        this.f176623e = null;
        this.f176624f = null;
        this.f176625g = null;
        this.f176620b.clear();
        mo128362x();
    }

    @Override // p153l.mzy0
    /* JADX INFO: renamed from: j */
    public final void mo160940j(Handler handler, buy0 buy0Var) {
        this.f176622d.m221579b(handler, buy0Var);
    }

    @Override // p153l.mzy0
    /* JADX INFO: renamed from: l */
    public final void mo160941l(lzy0 lzy0Var) {
        boolean zIsEmpty = this.f176620b.isEmpty();
        this.f176620b.remove(lzy0Var);
        if (zIsEmpty || !this.f176620b.isEmpty()) {
            return;
        }
        mo193548t();
    }

    @Override // p153l.mzy0
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void mo128361m(trs0 trs0Var) {
        throw null;
    }

    @Override // p153l.mzy0
    /* JADX INFO: renamed from: n */
    public final void mo160942n(lzy0 lzy0Var) {
        this.f176623e.getClass();
        HashSet hashSet = this.f176620b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(lzy0Var);
        if (zIsEmpty) {
            mo193549u();
        }
    }

    /* JADX INFO: renamed from: o */
    public final voy0 m193543o() {
        voy0 voy0Var = this.f176625g;
        lev0.m153954b(voy0Var);
        return voy0Var;
    }

    /* JADX INFO: renamed from: p */
    public final zty0 m193544p(@Nullable kzy0 kzy0Var) {
        return this.f176622d.m221578a(0, kzy0Var);
    }

    /* JADX INFO: renamed from: q */
    public final zty0 m193545q(int i, @Nullable kzy0 kzy0Var) {
        return this.f176622d.m221578a(0, kzy0Var);
    }

    /* JADX INFO: renamed from: r */
    public final l0z0 m193546r(@Nullable kzy0 kzy0Var) {
        return this.f176621c.m152407a(0, kzy0Var);
    }

    /* JADX INFO: renamed from: s */
    public final l0z0 m193547s(int i, @Nullable kzy0 kzy0Var) {
        return this.f176621c.m152407a(0, kzy0Var);
    }

    /* JADX INFO: renamed from: v */
    public abstract void mo128583v(@Nullable btx0 btx0Var);

    /* JADX INFO: renamed from: w */
    public final void m193550w(d0u0 d0u0Var) {
        this.f176624f = d0u0Var;
        ArrayList arrayList = this.f176619a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((lzy0) arrayList.get(i)).mo149093a(this, d0u0Var);
        }
    }

    /* JADX INFO: renamed from: x */
    public abstract void mo128362x();

    @Override // p153l.mzy0
    /* JADX INFO: renamed from: y */
    public /* synthetic */ d0u0 mo160943y() {
        return null;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m193551z() {
        return !this.f176620b.isEmpty();
    }

    /* JADX INFO: renamed from: t */
    public void mo193548t() {
    }

    /* JADX INFO: renamed from: u */
    public void mo193549u() {
    }
}
