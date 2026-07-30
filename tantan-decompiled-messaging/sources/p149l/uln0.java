package p149l;

import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveBulletView;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes5.dex */
public class uln0 extends h4t<ho2, VoiceLiveBulletView> {

    /* JADX INFO: renamed from: i */
    public LinkedList<eln0> f177083i;

    /* JADX INFO: renamed from: j */
    public d30 f177084j;

    public uln0(bsm bsmVar, VoiceLiveBulletView voiceLiveBulletView) {
        super(bsmVar);
        this.f177083i = new LinkedList<>();
        this.f177084j = new d30() { // from class: l.iln0
            @Override // p149l.d30
            public final void call() {
                this.f113846a.m194250c4();
            }
        };
        mo51532C(voiceLiveBulletView);
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ dwn0 m194236J3(rgh0 rgh0Var) {
        return new dwn0(new ewn0(rgh0Var.m179166t().m184078i(), yh3.m214785c(rgh0Var.m179166t().m184077h())));
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m194237K3(Throwable th) {
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m194238L3(Throwable th) {
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ rgh0 m194242P3(if2 if2Var) {
        return (rgh0) if2Var;
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m194248W3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m194249a4(iqv iqvVar) {
        m194251X3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public void m194250c4() {
        if (((VoiceLiveBulletView) this.viewModel).m78207s() || this.f177083i.isEmpty()) {
            return;
        }
        ((VoiceLiveBulletView) this.viewModel).m78208v(this.f177083i.poll(), this.f177084j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206027E2().m149815l().filter(new w9j() { // from class: l.hln0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((iqv) obj).m137794a() == 4);
            }
        }).take(1)).subscribe(ffw.m121194e(new e30() { // from class: l.lln0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128737a.m194249a4((iqv) obj);
            }
        }, new e30() { // from class: l.mln0
            @Override // p149l.e30
            public final void call(Object obj) {
                uln0.m194238L3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X3 */
    public void m194251X3() {
        this.f177083i.clear();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    /* JADX INFO: renamed from: Y3 */
    public final void m194252Y3(eln0 eln0Var) {
        eln0Var.m117145c(this);
        vln0.m198815a(eln0Var);
        if (eln0Var instanceof dwn0) {
            dwn0 dwn0Var = (dwn0) eln0Var;
            if (dwn0Var.m113898n() == null || !dwn0Var.m113898n().m118483j()) {
                this.f177083i.add(eln0Var);
                vln0.m198821g(eln0Var, false, this.f177083i);
            } else {
                this.f177083i.addFirst(eln0Var);
                vln0.m198821g(eln0Var, true, this.f177083i);
            }
        } else {
            this.f177083i.add(eln0Var);
            vln0.m198821g(eln0Var, false, this.f177083i);
        }
        m194250c4();
    }

    /* JADX INFO: renamed from: Z3 */
    public void m194253Z3(String str, final String str2) {
        duringCreated(hrv.m132761w(str)).subscribe(ffw.m121194e(new e30() { // from class: l.jln0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118550a.m194254b4(str2, (r8d0) obj);
            }
        }, new e30() { // from class: l.kln0
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151578h(R$string.f46720H9);
            }
        }));
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m194254b4(String str, r8d0 r8d0Var) {
        int i = r8d0Var.f187610c.enterRoomType;
        if (i == 0) {
            mo129310p3(7004, str);
        } else if (i == 1) {
            lsi0.m151595y(ypv.f199497e.getString(R$string.f46642Dj));
        } else if (i == 2) {
            lsi0.m151595y(ypv.f199497e.getString(R$string.f47024Vf));
        }
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f177083i.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206027E2().m132160q1().m189057L0()).subscribe(ffw.m121194e(new e30() { // from class: l.nln0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139572a.m194252Y3((eln0) obj);
            }
        }, new e30() { // from class: l.oln0
            @Override // p149l.e30
            public final void call(Object obj) {
                uln0.m194237K3((Throwable) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().m189098e().filter(new w9j() { // from class: l.pln0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((if2) obj) instanceof rgh0);
            }
        }).map(new w9j() { // from class: l.qln0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return uln0.m194242P3((if2) obj);
            }
        }).map(new w9j() { // from class: l.rln0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return uln0.m194236J3((rgh0) obj);
            }
        })).subscribe(ffw.m121194e(new e30() { // from class: l.sln0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f165252a.m194252Y3((dwn0) obj);
            }
        }, new e30() { // from class: l.tln0
            @Override // p149l.e30
            public final void call(Object obj) {
                uln0.m194248W3((Throwable) obj);
            }
        }));
    }
}
