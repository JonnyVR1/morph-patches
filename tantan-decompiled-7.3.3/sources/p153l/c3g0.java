package p153l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class c3g0 implements bsf {

    /* JADX INFO: renamed from: a */
    public final long f79602a;

    /* JADX INFO: renamed from: b */
    public final bsf f79603b;

    /* JADX INFO: renamed from: l.c3g0$a */
    public class C16172a implements mke0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ mke0 f79604a;

        public C16172a(mke0 mke0Var) {
            this.f79604a = mke0Var;
        }

        @Override // p153l.mke0
        /* JADX INFO: renamed from: d */
        public mke0.C18640a mo107791d(long j) {
            mke0.C18640a c18640aMo107791d = this.f79604a.mo107791d(j);
            oke0 oke0Var = c18640aMo107791d.f137283a;
            oke0 oke0Var2 = new oke0(oke0Var.f147751a, oke0Var.f147752b + c3g0.this.f79602a);
            oke0 oke0Var3 = c18640aMo107791d.f137284b;
            return new mke0.C18640a(oke0Var2, new oke0(oke0Var3.f147751a, oke0Var3.f147752b + c3g0.this.f79602a));
        }

        @Override // p153l.mke0
        /* JADX INFO: renamed from: e */
        public boolean mo107792e() {
            return this.f79604a.mo107792e();
        }

        @Override // p153l.mke0
        /* JADX INFO: renamed from: i */
        public long mo107793i() {
            return this.f79604a.mo107793i();
        }
    }

    public c3g0(long j, bsf bsfVar) {
        this.f79602a = j;
        this.f79603b = bsfVar;
    }

    @Override // p153l.bsf
    /* JADX INFO: renamed from: b */
    public qfj0 mo11416b(int i, int i2) {
        return this.f79603b.mo11416b(i, i2);
    }

    @Override // p153l.bsf
    /* JADX INFO: renamed from: k */
    public void mo11424k(mke0 mke0Var) {
        this.f79603b.mo11424k(new C16172a(mke0Var));
    }

    @Override // p153l.bsf
    /* JADX INFO: renamed from: l */
    public void mo11425l() {
        this.f79603b.mo11425l();
    }
}
