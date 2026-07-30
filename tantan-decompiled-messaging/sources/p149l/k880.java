package p149l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.tantanapp.common.utils.ConnectivityReceiver;

/* JADX INFO: loaded from: classes4.dex */
public class k880 extends pat<pn40> implements l3m {

    /* JADX INFO: renamed from: i */
    public e0m f121784i;

    /* JADX INFO: renamed from: j */
    public int f121785j;

    /* JADX INFO: renamed from: k */
    public long f121786k;

    /* JADX INFO: renamed from: l */
    public String f121787l;

    public k880(bsm bsmVar, e0m e0mVar) {
        super(bsmVar);
        this.f121785j = 0;
        this.f121786k = 0L;
        this.f121787l = "";
        this.f121784i = e0mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R3, reason: merged with bridge method [inline-methods] */
    public final void m144914T3(BLive bLive, r8d0 r8d0Var) {
        gkh0.m126627j(u0t.f172944c, "changeLiveInfo. new address:" + r8d0Var.f187610c.streamUrl.pullFlv + ", ipv6 " + r8d0Var.f187610c.streamUrl.pullFlvIpv6);
        m206028F2().FragProxyEvent.changeRoomData().mo172463j(r8d0Var);
        ((pn40) m206027E2()).m132102W(r8d0Var.f187610c, TextUtils.equals(bLive.f44323id, r8d0Var.f187610c.f44323id) ? 0 : 2);
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m144913S3(NetworkInfo networkInfo) {
        m144917W3();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(ConnectivityReceiver.m81290m()).skip(1).filter(new w9j() { // from class: l.g880
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.h880
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f106397a.m144913S3((NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m144915U3(soj0 soj0Var) {
        m144921a4();
    }

    /* JADX INFO: renamed from: V3 */
    public final void m144916V3() {
        m206028F2().FragProxyEvent.initRoomInfo().m172467p();
    }

    /* JADX INFO: renamed from: W3 */
    public final void m144917W3() {
        if (this.f121784i.mo105721M0().m213101h()) {
            m144920Z3(this.f121784i.mo105721M0().m213095b());
        }
    }

    /* JADX INFO: renamed from: X3 */
    public final void m144918X3(Throwable th) {
        gkh0.m126627j(u0t.f172944c, "refresh address fail");
        this.f121784i.mo105724P0(true, "0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public final void m144919Y3(BLive bLive) {
        if (bLive == null) {
            this.f121784i.mo105724P0(true, "0");
            return;
        }
        gkh0.m126627j(u0t.f172944c, "refresh address success:" + bLive.streamUrl.pullFlv + ", ipv6: " + bLive.streamUrl.pullFlvIpv6);
        int i = bLive.f44323id.equals(((pn40) m206027E2()).m149814k()) ? 0 : 2;
        ((pn40) m206027E2()).mo149811g(bLive);
        ((pn40) m206027E2()).m132102W(bLive, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z3 */
    public void m144920Z3(String str) {
        this.f121785j = 0;
        this.f121786k = mqi0.m155944o();
        final BLive bLiveMo165470l = ((pn40) m206027E2()).m170393A2().mo165470l();
        if (bLiveMo165470l == null) {
            m144916V3();
        } else {
            this.f121784i.mo105724P0(false, "0");
            duringCreated(LivingNormalApiProvider.m71491j5(bLiveMo165470l, str)).subscribe(ffw.m121194e(new e30() { // from class: l.d880
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f84837a.m144914T3(bLiveMo165470l, (r8d0) obj);
                }
            }, new e30() { // from class: l.e880
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f89812a.m144922b4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a4 */
    public void m144921a4() {
        duringCreated(LivingNormalApiProvider.m71285M6(((pn40) m206027E2()).m149814k(), this.f121787l)).subscribe(ffw.m121194e(new e30() { // from class: l.i880
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f111995a.m144919Y3((BLive) obj);
            }
        }, new e30() { // from class: l.j880
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116687a.m144918X3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b4 */
    public final void m144922b4(Throwable th) {
        this.f121784i.mo105724P0(true, "0");
        gkh0.m126627j(u0t.f172944c, " getLiveInfo fail. reason:" + s25.m182057b(th));
    }

    /* JADX INFO: renamed from: c4 */
    public void m144923c4() {
        int i = this.f121785j + 1;
        this.f121785j = i;
        if (i < ypv.m215672k().m195768X4()) {
            m144921a4();
        } else {
            this.f121784i.mo105724P0(true, "0");
        }
    }

    /* JADX INFO: renamed from: d4 */
    public void m144924d4(String str) {
        this.f121787l = str;
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().PlayerEvent.refreshPlayAddress().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.f880
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96323a.m144915U3((soj0) obj);
            }
        }));
    }
}
