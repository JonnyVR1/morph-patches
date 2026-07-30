package p149l;

/* JADX INFO: loaded from: classes4.dex */
public class ubg extends lk2<obg> {

    /* JADX INFO: renamed from: j */
    public String f175687j;

    public ubg(bsm bsmVar) {
        super(bsmVar);
        mo51532C(new obg(bsmVar.f77095a, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q4 */
    public /* synthetic */ void m192825q4(soj0 soj0Var) {
        m192826m4();
    }

    /* JADX INFO: renamed from: m4 */
    public void m192826m4() {
        ((obg) this.viewModel).mo71838p();
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m192828o4() {
        edg.m115802g(this, ((obg) this.viewModel).f142925m.getHeight());
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m192829p4(a5g a5gVar) {
        if (a5gVar.m95021a() != null) {
            this.f175687j = "fanbase_page";
            m192827n4(a5gVar.m95022b(), a5gVar.m95021a(), true);
        } else {
            this.f175687j = "other";
            m192830r4(a5gVar.m95022b(), false);
        }
        edg.m115803h(this, mo77274R2(), this.f175687j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: r4 */
    public final void m192830r4(final boolean z, final boolean z2) {
        duringCreated(m206027E2().f108741B.m140020T()).subscribe(ffw.m121197h(new e30() { // from class: l.tbg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169255a.m192827n4(z, z2, (mcg) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s4 */
    public void m192831s4() {
        bsm<? extends T> bsmVar = this.f188512e;
        V v2 = this.viewModel;
        m144512z2(new z4g(bsmVar, this, ((obg) v2).f142929q, ((obg) v2).f142911B, ((obg) v2).f142912C));
        bsm<? extends T> bsmVar2 = this.f188512e;
        V v3 = this.viewModel;
        m144512z2(new h5g(bsmVar2, this, ((obg) v3).f142919J, ((obg) v3).f142920K, ((obg) v3).f142922M));
        bsm<? extends T> bsmVar3 = this.f188512e;
        V v4 = this.viewModel;
        m144512z2(new c5g(bsmVar3, ((obg) v4).f142935w, ((obg) v4).f142937y, ((obg) v4).f142938z, ((obg) v4).f142910A, true));
        bsm<? extends T> bsmVar4 = this.f188512e;
        V v5 = this.viewModel;
        m144512z2(new j5g(bsmVar4, this, ((obg) v5).f142915F, ((obg) v5).f142916G, ((obg) v5).f142917H, ((obg) v5).f142918I, this.f175687j));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().FansClubEvent.showFansClubCompanyDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.qbg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153646a.m192829p4((a5g) obj);
            }
        }));
        duringCreated(m206028F2().FansClubEvent.hideFansClubCompanyDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.rbg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158608a.m192825q4((soj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4, reason: merged with bridge method [inline-methods] */
    public final void m192827n4(boolean z, mcg mcgVar, boolean z2) {
        ((obg) this.viewModel).m71834E();
        ((obg) this.viewModel).m163441N(z, z2);
        m150137f4(mcgVar);
    }

    /* JADX INFO: renamed from: u4 */
    public void m192833u4() {
        ((obg) this.viewModel).f142925m.post(new Runnable() { // from class: l.sbg
            @Override // java.lang.Runnable
            public final void run() {
                this.f163533a.m192828o4();
            }
        });
    }
}
