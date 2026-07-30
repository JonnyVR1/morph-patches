package p153l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.tantanapp.common.utils.ConnectivityReceiver;

/* JADX INFO: loaded from: classes4.dex */
public class qg80 extends qct<dw40> implements c6m {

    /* JADX INFO: renamed from: i */
    public y2m f157385i;

    /* JADX INFO: renamed from: j */
    public int f157386j;

    /* JADX INFO: renamed from: k */
    public long f157387k;

    /* JADX INFO: renamed from: l */
    public String f157388l;

    public qg80(dum dumVar, y2m y2mVar) {
        super(dumVar);
        this.f157386j = 0;
        this.f157387k = 0L;
        this.f157388l = "";
        this.f157385i = y2mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R3, reason: merged with bridge method [inline-methods] */
    public final void m176447T3(BLive bLive, ugd0 ugd0Var) {
        nsh0.m164608j(v2t.f182113c, "changeLiveInfo. new address:" + ugd0Var.f138293c.streamUrl.pullFlv + ", ipv6 " + ugd0Var.f138293c.streamUrl.pullFlvIpv6);
        m213811F2().FragProxyEvent.changeRoomData().mo199273j(ugd0Var);
        ((dw40) m213810E2()).m168488W(ugd0Var.f138293c, TextUtils.equals(bLive.f45171id, ugd0Var.f138293c.f45171id) ? 0 : 2);
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m176446S3(NetworkInfo networkInfo) {
        m176450W3();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(ConnectivityReceiver.m82473m()).skip(1).filter(new qcj() { // from class: l.mg80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.ng80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141798a.m176446S3((NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m176448U3(vxj0 vxj0Var) {
        m176454a4();
    }

    /* JADX INFO: renamed from: V3 */
    public final void m176449V3() {
        m213811F2().FragProxyEvent.initRoomInfo().m199277p();
    }

    /* JADX INFO: renamed from: W3 */
    public final void m176450W3() {
        if (this.f157385i.mo139883M0().m120639h()) {
            m176453Z3(this.f157385i.mo139883M0().m120633b());
        }
    }

    /* JADX INFO: renamed from: X3 */
    public final void m176451X3(Throwable th) {
        nsh0.m164608j(v2t.f182113c, "refresh address fail");
        this.f157385i.mo139887P0(true, "0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public final void m176452Y3(BLive bLive) {
        if (bLive == null) {
            this.f157385i.mo139887P0(true, "0");
            return;
        }
        nsh0.m164608j(v2t.f182113c, "refresh address success:" + bLive.streamUrl.pullFlv + ", ipv6: " + bLive.streamUrl.pullFlvIpv6);
        int i = bLive.f45171id.equals(((dw40) m213810E2()).m202191k()) ? 0 : 2;
        ((dw40) m213810E2()).mo183431g(bLive);
        ((dw40) m213810E2()).m168488W(bLive, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z3 */
    public void m176453Z3(String str) {
        this.f157386j = 0;
        this.f157387k = pzi0.m174454o();
        final BLive bLiveMo122892l = ((dw40) m213810E2()).m118363A2().mo122892l();
        if (bLiveMo122892l == null) {
            m176449V3();
        } else {
            this.f157385i.mo139887P0(false, "0");
            duringCreated(LivingNormalApiProvider.m72674j5(bLiveMo122892l, str)).subscribe(dhw.m115826e(new y20() { // from class: l.jg80
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f120684a.m176447T3(bLiveMo122892l, (ugd0) obj);
                }
            }, new y20() { // from class: l.kg80
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f126585a.m176455b4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a4 */
    public void m176454a4() {
        duringCreated(LivingNormalApiProvider.m72468M6(((dw40) m213810E2()).m202191k(), this.f157388l)).subscribe(dhw.m115826e(new y20() { // from class: l.og80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147195a.m176452Y3((BLive) obj);
            }
        }, new y20() { // from class: l.pg80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152237a.m176451X3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b4 */
    public final void m176455b4(Throwable th) {
        this.f157385i.mo139887P0(true, "0");
        nsh0.m164608j(v2t.f182113c, " getLiveInfo fail. reason:" + r35.m179577b(th));
    }

    /* JADX INFO: renamed from: c4 */
    public void m176456c4() {
        int i = this.f157386j + 1;
        this.f157386j = i;
        if (i < zrv.m221193k().m203555X4()) {
            m176454a4();
        } else {
            this.f157385i.mo139887P0(true, "0");
        }
    }

    /* JADX INFO: renamed from: d4 */
    public void m176457d4(String str) {
        this.f157388l = str;
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().PlayerEvent.refreshPlayAddress().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.lg80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f131943a.m176448U3((vxj0) obj);
            }
        }));
    }
}
