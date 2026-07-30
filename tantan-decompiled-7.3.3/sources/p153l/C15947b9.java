package p153l;

import java.io.IOException;

/* JADX INFO: renamed from: l.b9 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C15947b9 implements zrf {

    /* JADX INFO: renamed from: d */
    public static final esf f75494d = new esf() { // from class: l.a9
        @Override // p153l.esf
        /* JADX INFO: renamed from: b */
        public final zrf[] mo96504b() {
            return C15947b9.m103050c();
        }
    };

    /* JADX INFO: renamed from: a */
    public final C16211c9 f75495a = new C16211c9();

    /* JADX INFO: renamed from: b */
    public final ig60 f75496b = new ig60(16384);

    /* JADX INFO: renamed from: c */
    public boolean f75497c;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ zrf[] m103050c() {
        return new zrf[]{new C15947b9()};
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: a */
    public void mo11029a(long j, long j2) {
        this.f75497c = false;
        this.f75495a.mo108400b();
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: b */
    public void mo11030b(bsf bsfVar) {
        this.f75495a.mo108403e(bsfVar, new jkj0.C17969d(0, 1));
        bsfVar.mo11425l();
        bsfVar.mo11424k(new mke0.C18641b(-9223372036854775807L));
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: f */
    public boolean mo11031f(asf asfVar) throws IOException {
        ig60 ig60Var = new ig60(10);
        int i = 0;
        while (true) {
            asfVar.mo99900f(ig60Var.m139815e(), 0, 10);
            ig60Var.m139808U(0);
            if (ig60Var.m139798K() != 4801587) {
                break;
            }
            ig60Var.m139809V(3);
            int iM139794G = ig60Var.m139794G();
            i += iM139794G + 10;
            asfVar.mo99904m(iM139794G);
        }
        asfVar.mo99902h();
        asfVar.mo99904m(i);
        int i2 = 0;
        int i3 = i;
        while (true) {
            asfVar.mo99900f(ig60Var.m139815e(), 0, 7);
            ig60Var.m139808U(0);
            int iM139801N = ig60Var.m139801N();
            if (iM139801N == 44096 || iM139801N == 44097) {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int iM114992e = C16484d9.m114992e(ig60Var.m139815e(), iM139801N);
                if (iM114992e == -1) {
                    return false;
                }
                asfVar.mo99904m(iM114992e - 7);
            } else {
                asfVar.mo99902h();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                asfVar.mo99904m(i3);
                i2 = 0;
            }
        }
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: h */
    public int mo11032h(asf asfVar, ll80 ll80Var) throws IOException {
        int i = asfVar.read(this.f75496b.m139815e(), 0, 16384);
        if (i == -1) {
            return -1;
        }
        this.f75496b.m139808U(0);
        this.f75496b.m139807T(i);
        if (!this.f75497c) {
            this.f75495a.mo108402d(0L, 4);
            this.f75497c = true;
        }
        this.f75495a.mo108399a(this.f75496b);
        return 0;
    }

    @Override // p153l.zrf
    public void release() {
    }
}
