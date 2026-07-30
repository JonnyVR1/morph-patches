package p149l;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes6.dex */
public abstract class noy0 implements gqy0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f139891a = new ArrayList(1);

    /* JADX INFO: renamed from: b */
    public final HashSet f139892b = new HashSet(1);

    /* JADX INFO: renamed from: c */
    public final fry0 f139893c = new fry0();

    /* JADX INFO: renamed from: d */
    public final tky0 f139894d = new tky0();

    /* JADX INFO: renamed from: e */
    @Nullable
    public Looper f139895e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public xqt0 f139896f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public pfy0 f139897g;

    @Override // p149l.gqy0
    /* JADX INFO: renamed from: a */
    public final void mo127636a(vky0 vky0Var) {
        this.f139894d.m189543c(vky0Var);
    }

    @Override // p149l.gqy0
    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean mo127637b() {
        return true;
    }

    @Override // p149l.gqy0
    /* JADX INFO: renamed from: e */
    public final void mo127638e(gry0 gry0Var) {
        this.f139893c.m122914h(gry0Var);
    }

    @Override // p149l.gqy0
    /* JADX INFO: renamed from: f */
    public final void mo127639f(Handler handler, gry0 gry0Var) {
        this.f139893c.m122908b(handler, gry0Var);
    }

    @Override // p149l.gqy0
    /* JADX INFO: renamed from: g */
    public final void mo127640g(fqy0 fqy0Var, @Nullable vjx0 vjx0Var, pfy0 pfy0Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f139895e;
        boolean z = true;
        if (looper != null && looper != looperMyLooper) {
            z = false;
        }
        f5v0.m119533d(z);
        this.f139897g = pfy0Var;
        xqt0 xqt0Var = this.f139896f;
        this.f139891a.add(fqy0Var);
        if (this.f139895e == null) {
            this.f139895e = looperMyLooper;
            this.f139892b.add(fqy0Var);
            mo98646v(vjx0Var);
        } else if (xqt0Var != null) {
            mo127644n(fqy0Var);
            fqy0Var.mo114572a(this, xqt0Var);
        }
    }

    @Override // p149l.gqy0
    /* JADX INFO: renamed from: h */
    public final void mo127641h(fqy0 fqy0Var) {
        this.f139891a.remove(fqy0Var);
        if (!this.f139891a.isEmpty()) {
            mo127643l(fqy0Var);
            return;
        }
        this.f139895e = null;
        this.f139896f = null;
        this.f139897g = null;
        this.f139892b.clear();
        mo98647x();
    }

    @Override // p149l.gqy0
    /* JADX INFO: renamed from: j */
    public final void mo127642j(Handler handler, vky0 vky0Var) {
        this.f139894d.m189542b(handler, vky0Var);
    }

    @Override // p149l.gqy0
    /* JADX INFO: renamed from: l */
    public final void mo127643l(fqy0 fqy0Var) {
        boolean zIsEmpty = this.f139892b.isEmpty();
        this.f139892b.remove(fqy0Var);
        if (zIsEmpty || !this.f139892b.isEmpty()) {
            return;
        }
        mo160436t();
    }

    @Override // p149l.gqy0
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void mo98645m(nis0 nis0Var) {
        throw null;
    }

    @Override // p149l.gqy0
    /* JADX INFO: renamed from: n */
    public final void mo127644n(fqy0 fqy0Var) {
        this.f139895e.getClass();
        HashSet hashSet = this.f139892b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(fqy0Var);
        if (zIsEmpty) {
            mo160437u();
        }
    }

    /* JADX INFO: renamed from: o */
    public final pfy0 m160431o() {
        pfy0 pfy0Var = this.f139897g;
        f5v0.m119531b(pfy0Var);
        return pfy0Var;
    }

    /* JADX INFO: renamed from: p */
    public final tky0 m160432p(@Nullable eqy0 eqy0Var) {
        return this.f139894d.m189541a(0, eqy0Var);
    }

    /* JADX INFO: renamed from: q */
    public final tky0 m160433q(int i, @Nullable eqy0 eqy0Var) {
        return this.f139894d.m189541a(0, eqy0Var);
    }

    /* JADX INFO: renamed from: r */
    public final fry0 m160434r(@Nullable eqy0 eqy0Var) {
        return this.f139893c.m122907a(0, eqy0Var);
    }

    /* JADX INFO: renamed from: s */
    public final fry0 m160435s(int i, @Nullable eqy0 eqy0Var) {
        return this.f139893c.m122907a(0, eqy0Var);
    }

    /* JADX INFO: renamed from: v */
    public abstract void mo98646v(@Nullable vjx0 vjx0Var);

    /* JADX INFO: renamed from: w */
    public final void m160438w(xqt0 xqt0Var) {
        this.f139896f = xqt0Var;
        ArrayList arrayList = this.f139891a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((fqy0) arrayList.get(i)).mo114572a(this, xqt0Var);
        }
    }

    /* JADX INFO: renamed from: x */
    public abstract void mo98647x();

    @Override // p149l.gqy0
    /* JADX INFO: renamed from: y */
    public /* synthetic */ xqt0 mo127645y() {
        return null;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m160439z() {
        return !this.f139892b.isEmpty();
    }

    /* JADX INFO: renamed from: t */
    public void mo160436t() {
    }

    /* JADX INFO: renamed from: u */
    public void mo160437u() {
    }
}
