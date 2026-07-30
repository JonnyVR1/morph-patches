package p153l;

import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.C1894k;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class gj3 implements k5l {

    /* JADX INFO: renamed from: d */
    public static final ll80 f104549d = new ll80();

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final zrf f104550a;

    /* JADX INFO: renamed from: b */
    public final C1894k f104551b;

    /* JADX INFO: renamed from: c */
    public final h0j0 f104552c;

    public gj3(zrf zrfVar, C1894k c1894k, h0j0 h0j0Var) {
        this.f104550a = zrfVar;
        this.f104551b = c1894k;
        this.f104552c = h0j0Var;
    }

    @Override // p153l.k5l
    /* JADX INFO: renamed from: a */
    public boolean mo130402a(asf asfVar) throws IOException {
        return this.f104550a.mo11032h(asfVar, f104549d) == 0;
    }

    @Override // p153l.k5l
    /* JADX INFO: renamed from: b */
    public void mo130403b(bsf bsfVar) {
        this.f104550a.mo11030b(bsfVar);
    }

    @Override // p153l.k5l
    /* JADX INFO: renamed from: c */
    public void mo130404c() {
        this.f104550a.mo11029a(0L, 0L);
    }

    @Override // p153l.k5l
    /* JADX INFO: renamed from: d */
    public boolean mo130405d() {
        zrf zrfVar = this.f104550a;
        return (zrfVar instanceof ikj0) || (zrfVar instanceof d6j);
    }

    @Override // p153l.k5l
    /* JADX INFO: renamed from: e */
    public boolean mo130406e() {
        zrf zrfVar = this.f104550a;
        return (zrfVar instanceof v90) || (zrfVar instanceof C21263x8) || (zrfVar instanceof C15947b9) || (zrfVar instanceof z610);
    }

    @Override // p153l.k5l
    /* JADX INFO: renamed from: f */
    public k5l mo130407f() {
        zrf z610Var;
        w11.m204371g(!mo130405d());
        zrf zrfVar = this.f104550a;
        if (zrfVar instanceof fvp0) {
            z610Var = new fvp0(this.f104551b.f7776c, this.f104552c);
        } else if (zrfVar instanceof v90) {
            z610Var = new v90();
        } else if (zrfVar instanceof C21263x8) {
            z610Var = new C21263x8();
        } else if (zrfVar instanceof C15947b9) {
            z610Var = new C15947b9();
        } else {
            if (!(zrfVar instanceof z610)) {
                wtq0.m207906a("Unexpected extractor type for recreation: ".concat(zrfVar.getClass().getSimpleName()));
                return null;
            }
            z610Var = new z610();
        }
        return new gj3(z610Var, this.f104551b, this.f104552c);
    }
}
