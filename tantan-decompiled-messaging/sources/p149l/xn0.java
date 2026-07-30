package p149l;

/* JADX INFO: loaded from: classes8.dex */
public class xn0 implements sml {

    /* JADX INFO: renamed from: a */
    sml.InterfaceC19992a f193629a;

    /* JADX INFO: renamed from: c */
    private vlw f193631c;

    /* JADX INFO: renamed from: e */
    private hu00.InterfaceC17392a f193633e;

    /* JADX INFO: renamed from: b */
    private jc1 f193630b = null;

    /* JADX INFO: renamed from: d */
    private boolean f193632d = false;

    /* JADX INFO: renamed from: l.xn0$b */
    public class C21179b implements ya1 {
        private C21179b() {
        }

        @Override // p149l.ya1
        /* JADX INFO: renamed from: C */
        public mpd0 mo18364C(mpd0 mpd0Var) {
            sml.InterfaceC19992a interfaceC19992a = xn0.this.f193629a;
            return interfaceC19992a != null ? interfaceC19992a.mo128315C(mpd0Var) : mpd0Var;
        }
    }

    public xn0(vlw vlwVar, hu00.InterfaceC17392a interfaceC17392a) {
        this.f193631c = vlwVar;
        this.f193633e = interfaceC17392a;
    }

    @Override // p149l.sml
    /* JADX INFO: renamed from: F */
    public boolean mo19925F() {
        return this.f193630b != null;
    }

    @Override // p149l.sml
    /* JADX INFO: renamed from: I1 */
    public synchronized void mo19935I1() {
        try {
            if (this.f193630b == null) {
                ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", " startAudioRecord");
                vlw vlwVar = this.f193631c;
                int i = vlwVar.f177117P;
                int i2 = vlwVar.f177119R;
                int i3 = vlwVar.f177120S;
                jc1 jc1Var = new jc1(i, i2, 2048);
                this.f193630b = jc1Var;
                jc1Var.m140848z2(i);
                this.f193630b.m140844A2(this.f193633e);
                boolean zM140847y2 = this.f193630b.m140847y2("", i, 16, i2, 2048);
                hu00.InterfaceC17392a interfaceC17392a = this.f193633e;
                if (interfaceC17392a != null && !zM140847y2) {
                    interfaceC17392a.mo128349g(37120, 0, 0, null);
                }
                this.f193630b.m152747R(new C21179b());
                this.f193630b.m140845B2();
                eyx.m118802c().m118808g("startAudioRecord");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.sml
    /* JADX INFO: renamed from: L */
    public void mo19942L(sml.InterfaceC19992a interfaceC19992a) {
        this.f193629a = interfaceC19992a;
    }

    @Override // p149l.sml
    /* JADX INFO: renamed from: X */
    public synchronized void mo19987X() {
        if (this.f193630b != null) {
            ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", " stopAudioRecord");
            this.f193630b.m140846C2();
            this.f193630b.mo20124p2();
            this.f193630b = null;
            this.f193629a = null;
            eyx.m118802c().m118808g("stopAudioRecord");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m210152a(vlw vlwVar) {
        this.f193631c = vlwVar;
    }
}
