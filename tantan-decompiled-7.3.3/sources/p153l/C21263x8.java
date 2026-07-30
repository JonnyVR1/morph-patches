package p153l;

import java.io.IOException;

/* JADX INFO: renamed from: l.x8 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C21263x8 implements zrf {

    /* JADX INFO: renamed from: d */
    public static final esf f192770d = new esf() { // from class: l.w8
        @Override // p153l.esf
        /* JADX INFO: renamed from: b */
        public final zrf[] mo96504b() {
            return C21263x8.m209652c();
        }
    };

    /* JADX INFO: renamed from: a */
    public final C21540y8 f192771a = new C21540y8();

    /* JADX INFO: renamed from: b */
    public final ig60 f192772b = new ig60(2786);

    /* JADX INFO: renamed from: c */
    public boolean f192773c;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ zrf[] m209652c() {
        return new zrf[]{new C21263x8()};
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: a */
    public void mo11029a(long j, long j2) {
        this.f192773c = false;
        this.f192771a.mo108400b();
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: b */
    public void mo11030b(bsf bsfVar) {
        this.f192771a.mo108403e(bsfVar, new jkj0.C17969d(0, 1));
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
            asfVar.mo99900f(ig60Var.m139815e(), 0, 6);
            ig60Var.m139808U(0);
            if (ig60Var.m139801N() != 2935) {
                asfVar.mo99902h();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                asfVar.mo99904m(i3);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int iM218933g = C21775z8.m218933g(ig60Var.m139815e());
                if (iM218933g == -1) {
                    return false;
                }
                asfVar.mo99904m(iM218933g - 6);
            }
        }
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: h */
    public int mo11032h(asf asfVar, ll80 ll80Var) throws IOException {
        int i = asfVar.read(this.f192772b.m139815e(), 0, 2786);
        if (i == -1) {
            return -1;
        }
        this.f192772b.m139808U(0);
        this.f192772b.m139807T(i);
        if (!this.f192773c) {
            this.f192771a.mo108402d(0L, 4);
            this.f192773c = true;
        }
        this.f192771a.mo108399a(this.f192772b);
        return 0;
    }

    @Override // p153l.zrf
    public void release() {
    }
}
