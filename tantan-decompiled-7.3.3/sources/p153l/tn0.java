package p153l;

/* JADX INFO: loaded from: classes8.dex */
public class tn0 implements dpl {

    /* JADX INFO: renamed from: a */
    dpl.InterfaceC16599a f175207a;

    /* JADX INFO: renamed from: c */
    private uow f175209c;

    /* JADX INFO: renamed from: e */
    private q210.InterfaceC19500a f175211e;

    /* JADX INFO: renamed from: b */
    private qc1 f175208b = null;

    /* JADX INFO: renamed from: d */
    private boolean f175210d = false;

    /* JADX INFO: renamed from: l.tn0$b */
    public class C20350b implements fb1 {
        private C20350b() {
        }

        @Override // p153l.fb1
        /* JADX INFO: renamed from: C */
        public oxd0 mo19373C(oxd0 oxd0Var) {
            dpl.InterfaceC16599a interfaceC16599a = tn0.this.f175207a;
            return interfaceC16599a != null ? interfaceC16599a.mo109339C(oxd0Var) : oxd0Var;
        }
    }

    public tn0(uow uowVar, q210.InterfaceC19500a interfaceC19500a) {
        this.f175209c = uowVar;
        this.f175211e = interfaceC19500a;
    }

    @Override // p153l.dpl
    /* JADX INFO: renamed from: F */
    public boolean mo20924F() {
        return this.f175208b != null;
    }

    @Override // p153l.dpl
    /* JADX INFO: renamed from: I1 */
    public synchronized void mo20934I1() {
        try {
            if (this.f175208b == null) {
                oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", " startAudioRecord");
                uow uowVar = this.f175209c;
                int i = uowVar.f175459P;
                int i2 = uowVar.f175461R;
                int i3 = uowVar.f175462S;
                qc1 qc1Var = new qc1(i, i2, 2048);
                this.f175208b = qc1Var;
                qc1Var.m176106z2(i);
                this.f175208b.m176102A2(this.f175211e);
                boolean zM176105y2 = this.f175208b.m176105y2("", i, 16, i2, 2048);
                q210.InterfaceC19500a interfaceC19500a = this.f175211e;
                if (interfaceC19500a != null && !zM176105y2) {
                    interfaceC19500a.mo165950g(37120, 0, 0, null);
                }
                this.f175208b.m144339R(new C20350b());
                this.f175208b.m176103B2();
                b7y.m102882c().m102888g("startAudioRecord");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.dpl
    /* JADX INFO: renamed from: L */
    public void mo20941L(dpl.InterfaceC16599a interfaceC16599a) {
        this.f175207a = interfaceC16599a;
    }

    @Override // p153l.dpl
    /* JADX INFO: renamed from: X */
    public synchronized void mo20986X() {
        if (this.f175208b != null) {
            oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", " stopAudioRecord");
            this.f175208b.m176104C2();
            this.f175208b.mo21123p2();
            this.f175208b = null;
            this.f175207a = null;
            b7y.m102882c().m102888g("stopAudioRecord");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m191874a(uow uowVar) {
        this.f175209c = uowVar;
    }
}
