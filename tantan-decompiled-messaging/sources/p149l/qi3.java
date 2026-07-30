package p149l;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class qi3 implements uqf, o35 {

    /* JADX INFO: renamed from: j */
    public static final o35.InterfaceC18829a f154648j = new o35.InterfaceC18829a() { // from class: l.pi3
        @Override // p149l.o35.InterfaceC18829a
        /* JADX INFO: renamed from: a */
        public final o35 mo162410a(int i, C1871k c1871k, boolean z, List list, m6j0 m6j0Var, v680 v680Var) {
            return qi3.m174762f(i, c1871k, z, list, m6j0Var, v680Var);
        }
    };

    /* JADX INFO: renamed from: k */
    public static final fd80 f154649k = new fd80();

    /* JADX INFO: renamed from: a */
    public final sqf f154650a;

    /* JADX INFO: renamed from: b */
    public final int f154651b;

    /* JADX INFO: renamed from: c */
    public final C1871k f154652c;

    /* JADX INFO: renamed from: d */
    public final SparseArray<C19507a> f154653d = new SparseArray<>();

    /* JADX INFO: renamed from: e */
    public boolean f154654e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public o35.InterfaceC18830b f154655f;

    /* JADX INFO: renamed from: g */
    public long f154656g;

    /* JADX INFO: renamed from: h */
    public hce0 f154657h;

    /* JADX INFO: renamed from: i */
    public C1871k[] f154658i;

    /* JADX INFO: renamed from: l.qi3$a */
    public static final class C19507a implements m6j0 {

        /* JADX INFO: renamed from: a */
        public final int f154659a;

        /* JADX INFO: renamed from: b */
        public final int f154660b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final C1871k f154661c;

        /* JADX INFO: renamed from: d */
        public final nee f154662d = new nee();

        /* JADX INFO: renamed from: e */
        public C1871k f154663e;

        /* JADX INFO: renamed from: f */
        public m6j0 f154664f;

        /* JADX INFO: renamed from: g */
        public long f154665g;

        public C19507a(int i, int i2, @Nullable C1871k c1871k) {
            this.f154659a = i;
            this.f154660b = i2;
            this.f154661c = c1871k;
        }

        @Override // p149l.m6j0
        /* JADX INFO: renamed from: a */
        public void mo11109a(long j, int i, int i2, int i3, @Nullable m6j0.C18401a c18401a) {
            long j2 = this.f154665g;
            if (j2 != -9223372036854775807L && j >= j2) {
                this.f154664f = this.f154662d;
            }
            ((m6j0) vck0.m197866j(this.f154664f)).mo11109a(j, i, i2, i3, c18401a);
        }

        @Override // p149l.m6j0
        /* JADX INFO: renamed from: b */
        public void mo11110b(C1871k c1871k) {
            C1871k c1871k2 = this.f154661c;
            if (c1871k2 != null) {
                c1871k = c1871k.m10287k(c1871k2);
            }
            this.f154663e = c1871k;
            ((m6j0) vck0.m197866j(this.f154664f)).mo11110b(this.f154663e);
        }

        @Override // p149l.m6j0
        /* JADX INFO: renamed from: c */
        public int mo11111c(w4c w4cVar, int i, boolean z, int i2) throws IOException {
            return ((m6j0) vck0.m197866j(this.f154664f)).m153239e(w4cVar, i, z);
        }

        @Override // p149l.m6j0
        /* JADX INFO: renamed from: f */
        public void mo11112f(d860 d860Var, int i, int i2) {
            ((m6j0) vck0.m197866j(this.f154664f)).m153238d(d860Var, i);
        }

        /* JADX INFO: renamed from: g */
        public void m174763g(@Nullable o35.InterfaceC18830b interfaceC18830b, long j) {
            if (interfaceC18830b == null) {
                this.f154664f = this.f154662d;
                return;
            }
            this.f154665g = j;
            m6j0 m6j0VarMo160443b = interfaceC18830b.mo160443b(this.f154659a, this.f154660b);
            this.f154664f = m6j0VarMo160443b;
            C1871k c1871k = this.f154663e;
            if (c1871k != null) {
                m6j0VarMo160443b.mo11110b(c1871k);
            }
        }
    }

    public qi3(sqf sqfVar, int i, C1871k c1871k) {
        this.f154650a = sqfVar;
        this.f154651b = i;
        this.f154652c = c1871k;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ o35 m174762f(int i, C1871k c1871k, boolean z, List list, m6j0 m6j0Var, v680 v680Var) {
        sqf i3jVar;
        String str = c1871k.f7747k;
        if (n200.m157536r(str)) {
            return null;
        }
        if (n200.m157535q(str)) {
            i3jVar = new sex(1);
        } else {
            i3jVar = new i3j(z ? 4 : 0, null, null, list, m6j0Var);
        }
        return new qi3(i3jVar, i, c1871k);
    }

    @Override // p149l.o35
    /* JADX INFO: renamed from: a */
    public boolean mo162406a(tqf tqfVar) throws IOException {
        int iMo10978h = this.f154650a.mo10978h(tqfVar, f154649k);
        p11.m167013g(iMo10978h != 1);
        return iMo10978h == 0;
    }

    @Override // p149l.uqf
    /* JADX INFO: renamed from: b */
    public m6j0 mo11362b(int i, int i2) {
        C19507a c19507a = this.f154653d.get(i);
        if (c19507a == null) {
            p11.m167013g(this.f154658i == null);
            c19507a = new C19507a(i, i2, i2 == this.f154651b ? this.f154652c : null);
            c19507a.m174763g(this.f154655f, this.f154656g);
            this.f154653d.put(i, c19507a);
        }
        return c19507a;
    }

    @Override // p149l.o35
    /* JADX INFO: renamed from: c */
    public void mo162407c(@Nullable o35.InterfaceC18830b interfaceC18830b, long j, long j2) {
        this.f154655f = interfaceC18830b;
        this.f154656g = j2;
        boolean z = this.f154654e;
        sqf sqfVar = this.f154650a;
        if (!z) {
            sqfVar.mo10976b(this);
            if (j != -9223372036854775807L) {
                this.f154650a.mo10975a(0L, j);
            }
            this.f154654e = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        sqfVar.mo10975a(0L, j);
        for (int i = 0; i < this.f154653d.size(); i++) {
            this.f154653d.valueAt(i).m174763g(interfaceC18830b, j2);
        }
    }

    @Override // p149l.o35
    @Nullable
    /* JADX INFO: renamed from: d */
    public q35 mo162408d() {
        hce0 hce0Var = this.f154657h;
        if (hce0Var instanceof q35) {
            return (q35) hce0Var;
        }
        return null;
    }

    @Override // p149l.o35
    @Nullable
    /* JADX INFO: renamed from: e */
    public C1871k[] mo162409e() {
        return this.f154658i;
    }

    @Override // p149l.uqf
    /* JADX INFO: renamed from: k */
    public void mo11370k(hce0 hce0Var) {
        this.f154657h = hce0Var;
    }

    @Override // p149l.uqf
    /* JADX INFO: renamed from: l */
    public void mo11371l() {
        C1871k[] c1871kArr = new C1871k[this.f154653d.size()];
        for (int i = 0; i < this.f154653d.size(); i++) {
            c1871kArr[i] = (C1871k) p11.m167015i(this.f154653d.valueAt(i).f154663e);
        }
        this.f154658i = c1871kArr;
    }

    @Override // p149l.o35
    public void release() {
        this.f154650a.release();
    }
}
