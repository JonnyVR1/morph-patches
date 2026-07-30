package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import p133rx.C22306c;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
public class xsl0<D extends nnn0> extends x6s<D, msl0> {
    public xsl0(bsm<D> bsmVar) {
        super(bsmVar);
        mo51532C(new msl0(bsmVar.f77095a, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m210789a4(soj0 soj0Var) {
        ((msl0) this.viewModel).mo71838p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ C22306c m210790b4(roj0 roj0Var) {
        return m206027E2().m160255S3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public /* synthetic */ void m210791d4(Throwable th) {
        ((msl0) this.viewModel).m156162L();
    }

    private void init() {
        m207199N3(m206027E2().m132151m2().onErrorReturn(new w9j() { // from class: l.osl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).flatMap(new w9j() { // from class: l.psl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f151019a.m210790b4((roj0) obj);
            }
        })).filter(new w9j() { // from class: l.qsl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                lyn0 lyn0Var = (lyn0) obj;
                return Boolean.valueOf((lyn0Var == null || vwb.m200296J(lyn0Var.f130587a)) ? false : true);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.rsl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160879a.m210792c4((lyn0) obj);
            }
        }, new e30() { // from class: l.ssl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166224a.m210791d4((Throwable) obj);
            }
        }));
        m207199N3(m206027E2().m160255S3()).subscribe(ffw.m121194e(new e30() { // from class: l.tsl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f171943a.m210793e4((lyn0) obj);
            }
        }, new e30() { // from class: l.usl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177991a.m210794f4((Throwable) obj);
            }
        }));
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        init();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated((C22306c) m206028F2().MemberEvent.dismiss().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.vsl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182852a.m210789a4((soj0) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().MemberEvent.show().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.wsl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187948a.m210797i4(((Integer) obj).intValue());
            }
        }));
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m210792c4(lyn0 lyn0Var) {
        ((msl0) this.viewModel).m156163P(lyn0Var.f130587a);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m210793e4(lyn0 lyn0Var) {
        ((msl0) this.viewModel).m156163P(lyn0Var.f130587a);
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m210794f4(Throwable th) {
        ((msl0) this.viewModel).m156162L();
    }

    /* JADX INFO: renamed from: g4 */
    public void m210795g4() {
        BLiveVoice bLiveVoiceMo149813j = m206027E2().mo149813j();
        if (bLiveVoiceMo149813j == null) {
            return;
        }
        m206027E2().m160233D3(bLiveVoiceMo149813j.room.f44419id);
    }

    /* JADX INFO: renamed from: h4 */
    public void m210796h4() {
        BLiveVoice bLiveVoiceMo149813j = m206027E2().mo149813j();
        if (bLiveVoiceMo149813j == null) {
            return;
        }
        m206027E2().m132154n2();
        m206027E2().mo132080N1(bLiveVoiceMo149813j.room.f44419id);
    }

    /* JADX INFO: renamed from: i4 */
    public void m210797i4(int i) {
        ((msl0) this.viewModel).m156164Q();
        m210796h4();
    }
}
