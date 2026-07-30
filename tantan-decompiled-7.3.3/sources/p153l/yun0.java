package p153l;

import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveBulletView;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes5.dex */
public class yun0 extends i6t<oo2, VoiceLiveBulletView> {

    /* JADX INFO: renamed from: i */
    public LinkedList<iun0> f201651i;

    /* JADX INFO: renamed from: j */
    public x20 f201652j;

    public yun0(dum dumVar, VoiceLiveBulletView voiceLiveBulletView) {
        super(dumVar);
        this.f201651i = new LinkedList<>();
        this.f201652j = new x20() { // from class: l.mun0
            @Override // p153l.x20
            public final void call() {
                this.f138828a.m217457c4();
            }
        };
        mo52715C(voiceLiveBulletView);
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ h5o0 m217443J3(yoh0 yoh0Var) {
        return new h5o0(new i5o0(yoh0Var.m216977t().m220773i(), mi3.m158464c(yoh0Var.m216977t().m220772h())));
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m217444K3(Throwable th) {
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m217445L3(Throwable th) {
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ yoh0 m217449P3(pf2 pf2Var) {
        return (yoh0) pf2Var;
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m217455W3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m217456a4(jsv jsvVar) {
        m217458X3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public void m217457c4() {
        if (((VoiceLiveBulletView) this.viewModel).m79390s() || this.f201651i.isEmpty()) {
            return;
        }
        ((VoiceLiveBulletView) this.viewModel).m79391v(this.f201651i.poll(), this.f201652j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213810E2().m202192l().filter(new qcj() { // from class: l.lun0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((jsv) obj).m146875a() == 4);
            }
        }).take(1)).subscribe(dhw.m115826e(new y20() { // from class: l.pun0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154206a.m217456a4((jsv) obj);
            }
        }, new y20() { // from class: l.qun0
            @Override // p153l.y20
            public final void call(Object obj) {
                yun0.m217445L3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X3 */
    public void m217458X3() {
        this.f201651i.clear();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    /* JADX INFO: renamed from: Y3 */
    public final void m217459Y3(iun0 iun0Var) {
        iun0Var.m142201c(this);
        zun0.m221677a(iun0Var);
        if (iun0Var instanceof h5o0) {
            h5o0 h5o0Var = (h5o0) iun0Var;
            if (h5o0Var.m133668n() == null || !h5o0Var.m133668n().m138760j()) {
                this.f201651i.add(iun0Var);
                zun0.m221683g(iun0Var, false, this.f201651i);
            } else {
                this.f201651i.addFirst(iun0Var);
                zun0.m221683g(iun0Var, true, this.f201651i);
            }
        } else {
            this.f201651i.add(iun0Var);
            zun0.m221683g(iun0Var, false, this.f201651i);
        }
        m217457c4();
    }

    /* JADX INFO: renamed from: Z3 */
    public void m217460Z3(String str, final String str2) {
        duringCreated(itv.m142120w(str)).subscribe(dhw.m115826e(new y20() { // from class: l.nun0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143721a.m217461b4(str2, (ugd0) obj);
            }
        }, new y20() { // from class: l.oun0
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165634h(R$string.f47568H9);
            }
        }));
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m217461b4(String str, ugd0 ugd0Var) {
        int i = ugd0Var.f138293c.enterRoomType;
        if (i == 0) {
            mo138869p3(7004, str);
        } else if (i == 1) {
            o1j0.m165651y(zrv.f205803e.getString(R$string.f47490Dj));
        } else if (i == 2) {
            o1j0.m165651y(zrv.f205803e.getString(R$string.f47872Vf));
        }
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f201651i.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213810E2().m168545q1().m98239L0()).subscribe(dhw.m115826e(new y20() { // from class: l.run0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164927a.m217459Y3((iun0) obj);
            }
        }, new y20() { // from class: l.sun0
            @Override // p153l.y20
            public final void call(Object obj) {
                yun0.m217444K3((Throwable) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().m98280e().filter(new qcj() { // from class: l.tun0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((pf2) obj) instanceof yoh0);
            }
        }).map(new qcj() { // from class: l.uun0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return yun0.m217449P3((pf2) obj);
            }
        }).map(new qcj() { // from class: l.vun0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return yun0.m217443J3((yoh0) obj);
            }
        })).subscribe(dhw.m115826e(new y20() { // from class: l.wun0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190877a.m217459Y3((h5o0) obj);
            }
        }, new y20() { // from class: l.xun0
            @Override // p153l.y20
            public final void call(Object obj) {
                yun0.m217455W3((Throwable) obj);
            }
        }));
    }
}
