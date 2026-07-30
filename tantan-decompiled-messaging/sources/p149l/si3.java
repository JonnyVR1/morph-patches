package p149l;

import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.C1871k;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class si3 implements u2l {

    /* JADX INFO: renamed from: d */
    public static final fd80 f164676d = new fd80();

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final sqf f164677a;

    /* JADX INFO: renamed from: b */
    public final C1871k f164678b;

    /* JADX INFO: renamed from: c */
    public final eri0 f164679c;

    public si3(sqf sqfVar, C1871k c1871k, eri0 eri0Var) {
        this.f164677a = sqfVar;
        this.f164678b = c1871k;
        this.f164679c = eri0Var;
    }

    @Override // p149l.u2l
    /* JADX INFO: renamed from: a */
    public boolean mo184314a(tqf tqfVar) throws IOException {
        return this.f164677a.mo10978h(tqfVar, f164676d) == 0;
    }

    @Override // p149l.u2l
    /* JADX INFO: renamed from: b */
    public void mo184315b(uqf uqfVar) {
        this.f164677a.mo10976b(uqfVar);
    }

    @Override // p149l.u2l
    /* JADX INFO: renamed from: c */
    public void mo184316c() {
        this.f164677a.mo10975a(0L, 0L);
    }

    @Override // p149l.u2l
    /* JADX INFO: renamed from: d */
    public boolean mo184317d() {
        sqf sqfVar = this.f164677a;
        return (sqfVar instanceof ebj0) || (sqfVar instanceof i3j);
    }

    @Override // p149l.u2l
    /* JADX INFO: renamed from: e */
    public boolean mo184318e() {
        sqf sqfVar = this.f164677a;
        return (sqfVar instanceof z90) || (sqfVar instanceof C16095c9) || (sqfVar instanceof C17024g9) || (sqfVar instanceof py00);
    }

    @Override // p149l.u2l
    /* JADX INFO: renamed from: f */
    public u2l mo184319f() {
        sqf py00Var;
        p11.m167013g(!mo184317d());
        sqf sqfVar = this.f164677a;
        if (sqfVar instanceof bmp0) {
            py00Var = new bmp0(this.f164678b.f7739c, this.f164679c);
        } else if (sqfVar instanceof z90) {
            py00Var = new z90();
        } else if (sqfVar instanceof C16095c9) {
            py00Var = new C16095c9();
        } else if (sqfVar instanceof C17024g9) {
            py00Var = new C17024g9();
        } else {
            if (!(sqfVar instanceof py00)) {
                qkq0.m175383a("Unexpected extractor type for recreation: ".concat(sqfVar.getClass().getSimpleName()));
                return null;
            }
            py00Var = new py00();
        }
        return new si3(py00Var, this.f164678b, this.f164679c);
    }
}
