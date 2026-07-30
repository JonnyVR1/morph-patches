package p153l;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ej3 implements bsf, p45 {

    /* JADX INFO: renamed from: j */
    public static final p45.InterfaceC19291a f94248j = new p45.InterfaceC19291a() { // from class: l.dj3
        @Override // p153l.p45.InterfaceC19291a
        /* JADX INFO: renamed from: a */
        public final p45 mo116023a(int i, C1894k c1894k, boolean z, List list, qfj0 qfj0Var, bf80 bf80Var) {
            return ej3.m120969f(i, c1894k, z, list, qfj0Var, bf80Var);
        }
    };

    /* JADX INFO: renamed from: k */
    public static final ll80 f94249k = new ll80();

    /* JADX INFO: renamed from: a */
    public final zrf f94250a;

    /* JADX INFO: renamed from: b */
    public final int f94251b;

    /* JADX INFO: renamed from: c */
    public final C1894k f94252c;

    /* JADX INFO: renamed from: d */
    public final SparseArray<C16784a> f94253d = new SparseArray<>();

    /* JADX INFO: renamed from: e */
    public boolean f94254e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public p45.InterfaceC19292b f94255f;

    /* JADX INFO: renamed from: g */
    public long f94256g;

    /* JADX INFO: renamed from: h */
    public mke0 f94257h;

    /* JADX INFO: renamed from: i */
    public C1894k[] f94258i;

    /* JADX INFO: renamed from: l.ej3$a */
    public static final class C16784a implements qfj0 {

        /* JADX INFO: renamed from: a */
        public final int f94259a;

        /* JADX INFO: renamed from: b */
        public final int f94260b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final C1894k f94261c;

        /* JADX INFO: renamed from: d */
        public final rfe f94262d = new rfe();

        /* JADX INFO: renamed from: e */
        public C1894k f94263e;

        /* JADX INFO: renamed from: f */
        public qfj0 f94264f;

        /* JADX INFO: renamed from: g */
        public long f94265g;

        public C16784a(int i, int i2, @Nullable C1894k c1894k) {
            this.f94259a = i;
            this.f94260b = i2;
            this.f94261c = c1894k;
        }

        @Override // p153l.qfj0
        /* JADX INFO: renamed from: a */
        public void mo11163a(long j, int i, int i2, int i3, @Nullable qfj0.C19562a c19562a) {
            long j2 = this.f94265g;
            if (j2 != -9223372036854775807L && j >= j2) {
                this.f94264f = this.f94262d;
            }
            ((qfj0) bmk0.m105144j(this.f94264f)).mo11163a(j, i, i2, i3, c19562a);
        }

        @Override // p153l.qfj0
        /* JADX INFO: renamed from: b */
        public void mo11164b(C1894k c1894k) {
            C1894k c1894k2 = this.f94261c;
            if (c1894k2 != null) {
                c1894k = c1894k.m10341k(c1894k2);
            }
            this.f94263e = c1894k;
            ((qfj0) bmk0.m105144j(this.f94264f)).mo11164b(this.f94263e);
        }

        @Override // p153l.qfj0
        /* JADX INFO: renamed from: c */
        public int mo11165c(e6c e6cVar, int i, boolean z, int i2) throws IOException {
            return ((qfj0) bmk0.m105144j(this.f94264f)).m176371e(e6cVar, i, z);
        }

        @Override // p153l.qfj0
        /* JADX INFO: renamed from: f */
        public void mo11166f(ig60 ig60Var, int i, int i2) {
            ((qfj0) bmk0.m105144j(this.f94264f)).m176370d(ig60Var, i);
        }

        /* JADX INFO: renamed from: g */
        public void m120974g(@Nullable p45.InterfaceC19292b interfaceC19292b, long j) {
            if (interfaceC19292b == null) {
                this.f94264f = this.f94262d;
                return;
            }
            this.f94265g = j;
            qfj0 qfj0VarMo121890b = interfaceC19292b.mo121890b(this.f94259a, this.f94260b);
            this.f94264f = qfj0VarMo121890b;
            C1894k c1894k = this.f94263e;
            if (c1894k != null) {
                qfj0VarMo121890b.mo11164b(c1894k);
            }
        }
    }

    public ej3(zrf zrfVar, int i, C1894k c1894k) {
        this.f94250a = zrfVar;
        this.f94251b = i;
        this.f94252c = c1894k;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ p45 m120969f(int i, C1894k c1894k, boolean z, List list, qfj0 qfj0Var, bf80 bf80Var) {
        zrf d6jVar;
        String str = c1894k.f7784k;
        if (kb00.m149017r(str)) {
            return null;
        }
        if (kb00.m149016q(str)) {
            d6jVar = new rhx(1);
        } else {
            d6jVar = new d6j(z ? 4 : 0, null, null, list, qfj0Var);
        }
        return new ej3(d6jVar, i, c1894k);
    }

    @Override // p153l.p45
    /* JADX INFO: renamed from: a */
    public boolean mo120970a(asf asfVar) throws IOException {
        int iMo11032h = this.f94250a.mo11032h(asfVar, f94249k);
        w11.m204371g(iMo11032h != 1);
        return iMo11032h == 0;
    }

    @Override // p153l.bsf
    /* JADX INFO: renamed from: b */
    public qfj0 mo11416b(int i, int i2) {
        C16784a c16784a = this.f94253d.get(i);
        if (c16784a == null) {
            w11.m204371g(this.f94258i == null);
            c16784a = new C16784a(i, i2, i2 == this.f94251b ? this.f94252c : null);
            c16784a.m120974g(this.f94255f, this.f94256g);
            this.f94253d.put(i, c16784a);
        }
        return c16784a;
    }

    @Override // p153l.p45
    /* JADX INFO: renamed from: c */
    public void mo120971c(@Nullable p45.InterfaceC19292b interfaceC19292b, long j, long j2) {
        this.f94255f = interfaceC19292b;
        this.f94256g = j2;
        boolean z = this.f94254e;
        zrf zrfVar = this.f94250a;
        if (!z) {
            zrfVar.mo11030b(this);
            if (j != -9223372036854775807L) {
                this.f94250a.mo11029a(0L, j);
            }
            this.f94254e = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        zrfVar.mo11029a(0L, j);
        for (int i = 0; i < this.f94253d.size(); i++) {
            this.f94253d.valueAt(i).m120974g(interfaceC19292b, j2);
        }
    }

    @Override // p153l.p45
    @Nullable
    /* JADX INFO: renamed from: d */
    public r45 mo120972d() {
        mke0 mke0Var = this.f94257h;
        if (mke0Var instanceof r45) {
            return (r45) mke0Var;
        }
        return null;
    }

    @Override // p153l.p45
    @Nullable
    /* JADX INFO: renamed from: e */
    public C1894k[] mo120973e() {
        return this.f94258i;
    }

    @Override // p153l.bsf
    /* JADX INFO: renamed from: k */
    public void mo11424k(mke0 mke0Var) {
        this.f94257h = mke0Var;
    }

    @Override // p153l.bsf
    /* JADX INFO: renamed from: l */
    public void mo11425l() {
        C1894k[] c1894kArr = new C1894k[this.f94253d.size()];
        for (int i = 0; i < this.f94253d.size(); i++) {
            c1894kArr[i] = (C1894k) w11.m204373i(this.f94253d.valueAt(i).f94263e);
        }
        this.f94258i = c1894kArr;
    }

    @Override // p153l.p45
    public void release() {
        this.f94250a.release();
    }
}
