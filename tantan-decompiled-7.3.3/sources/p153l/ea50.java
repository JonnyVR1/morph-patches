package p153l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.tantanapp.common.utils.ConnectivityReceiver;

/* JADX INFO: loaded from: classes5.dex */
public class ea50 extends qct<dw40> {

    /* JADX INFO: renamed from: i */
    public y2m f92741i;

    /* JADX INFO: renamed from: j */
    public String f92742j;

    public ea50(dum dumVar, y2m y2mVar) {
        super(dumVar);
        this.f92742j = "";
        this.f92741i = y2mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3, reason: merged with bridge method [inline-methods] */
    public void m120031Z3(BLive bLive, ugd0 ugd0Var) {
        fhw.m125605a(v2t.f182113c, "changeLiveInfo. new address:" + ugd0Var.f138293c.streamUrl.pullFlv + ",ipv6: " + ugd0Var.f138293c.streamUrl.pullFlvIpv6);
        m213811F2().FragProxyEvent.changeRoomData().mo199273j(ugd0Var);
        ((dw40) m213810E2()).m168488W(ugd0Var.f138293c, TextUtils.equals(bLive.f45171id, ugd0Var.f138293c.f45171id) ? 0 : 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public /* synthetic */ void m120022W3(NetworkInfo networkInfo) {
        m120025e4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m120023c4(vxj0 vxj0Var) {
        m120035i4();
    }

    /* JADX INFO: renamed from: d4 */
    private void m120024d4() {
        m213811F2().FragProxyEvent.initRoomInfo().m199277p();
    }

    /* JADX INFO: renamed from: e4 */
    private void m120025e4() {
        if (this.f92741i.mo139883M0().m120639h()) {
            m120034h4(this.f92741i.mo139883M0().m120633b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public void m120026f4(Throwable th) {
        fhw.m125605a(v2t.f182113c, "refresh address fail");
        this.f92741i.mo139887P0(true, "0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public void m120027g4(BLive bLive) {
        if (bLive == null) {
            this.f92741i.mo139887P0(true, "0");
            return;
        }
        fhw.m125605a(v2t.f182113c, "refresh address success:" + bLive.streamUrl.pullFlv + ",ipv6: " + bLive.streamUrl.pullFlvIpv6);
        int i = bLive.f45171id.equals(((dw40) m213810E2()).m202191k()) ? 0 : 2;
        ((dw40) m213810E2()).mo183431g(bLive);
        ((dw40) m213810E2()).m168488W(bLive, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j4 */
    public void m120028j4(Throwable th) {
        this.f92741i.mo139887P0(true, "0");
        fhw.m125605a(v2t.f182113c, " getLiveInfo fail. reason:" + r35.m179577b(th));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(ConnectivityReceiver.m82473m()).skip(1).filter(new qcj() { // from class: l.y950
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.z950
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203445a.m120022W3((NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m120029X3() {
        this.f92741i.mo139897m(true);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m120030Y3() {
        this.f92741i.mo139897m(false);
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m120032a4() {
        this.f92741i.mo139897m(true);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m120033b4() {
        this.f92741i.mo139897m(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public void m120034h4(String str) {
        final BLive bLiveMo122892l = ((dw40) m213810E2()).m118363A2().mo122892l();
        if (bLiveMo122892l == null) {
            m120024d4();
        } else {
            this.f92741i.mo139887P0(false, "0");
            duringCreated(LivingNormalApiProvider.m72674j5(bLiveMo122892l, str)).doOnSubscribe(new x20() { // from class: l.ba50
                @Override // p153l.x20
                public final void call() {
                    this.f75645a.m120029X3();
                }
            }).doOnUnsubscribe(new x20() { // from class: l.ca50
                @Override // p153l.x20
                public final void call() {
                    this.f80544a.m120030Y3();
                }
            }).subscribe(dhw.m115826e(new y20() { // from class: l.da50
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f85843a.m120031Z3(bLiveMo122892l, (ugd0) obj);
                }
            }, new y20() { // from class: l.u950
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f178099a.m120028j4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public void m120035i4() {
        duringCreated(LivingNormalApiProvider.m72468M6(((dw40) m213810E2()).m202191k(), this.f92742j)).doOnSubscribe(new x20() { // from class: l.t950
            @Override // p153l.x20
            public final void call() {
                this.f172609a.m120032a4();
            }
        }).doOnUnsubscribe(new x20() { // from class: l.v950
            @Override // p153l.x20
            public final void call() {
                this.f182956a.m120033b4();
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.w950
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187976a.m120027g4((BLive) obj);
            }
        }, new y20() { // from class: l.x950
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192917a.m120026f4((Throwable) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().PlayerEvent.refreshPlayAddress().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.aa50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f69105a.m120023c4((vxj0) obj);
            }
        }));
    }
}
