package p153l;

import android.content.Intent;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.livingroom.archi.act.LiveBaseFrag;
import com.p051p1.mobile.putong.live.livingroom.base.live.LiveView;
import com.tantan.live.eventbus.LiveEventBus;

/* JADX INFO: loaded from: classes4.dex */
public class xct extends AbstractC19518q4<mu40, BLive, fw40, LiveView> {

    /* JADX INFO: renamed from: i */
    public final LiveBaseFrag f193401i;

    /* JADX INFO: renamed from: j */
    public final String f193402j;

    /* JADX INFO: renamed from: k */
    public mu40 f193403k;

    /* JADX INFO: renamed from: l */
    public AnchorStartData f193404l;

    /* JADX INFO: renamed from: m */
    public kcg0 f193405m;

    /* JADX WARN: Multi-variable type inference failed */
    public xct(LiveBaseFrag liveBaseFrag, String str, AnchorStartData anchorStartData) {
        super(new fw40(liveBaseFrag, new mu40(new ew40(), new ajt(str)), new LiveEventBus()));
        LiveView liveView = (LiveView) liveBaseFrag.mo21577H2().inflate(yec0.f199126j5, (ViewGroup) null, false);
        this.f196918e.m118163a(this, liveView);
        mo52715C(liveView);
        this.f193401i = liveBaseFrag;
        this.f193403k = (mu40) this.f196918e.f90822h;
        this.f193402j = str;
        this.f193404l = anchorStartData;
        ((mu40) m213810E2()).m160114S2(str);
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ void m210271V3(Throwable th) {
    }

    /* JADX INFO: renamed from: Z3 */
    private boolean m210272Z3() {
        return this.f193403k.m202193m().m146881g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.AbstractC19518q4
    /* JADX INFO: renamed from: N3 */
    public View mo102503N3() {
        return (View) this.viewModel;
    }

    @Override // p153l.AbstractC19518q4
    /* JADX INFO: renamed from: O3 */
    public void mo102504O3(int i, int i2, Intent intent) {
        if (i == 100 && i2 == -1) {
            this.f193403k.mo168522i((BLiveRoom) intent.getSerializableExtra("room_tag"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.AbstractC19518q4
    /* JADX INFO: renamed from: P3 */
    public void mo102505P3() {
        lwr.m156096d();
        if (!wft.m206159b(2)) {
            pvn.m173968c("live", new pvn.C19456a());
        }
        zrv.m221197r();
        this.f193403k.mo168507c2();
        this.f193403k.m168470P1();
        m6t.m157265a(this, (fw40) m163462K3(), (LiveView) this.viewModel, this.f193404l);
        m163463L3();
        duringCreated(zrv.m221193k().m159274k()).subscribe(dhw.m115825d(new y20() { // from class: l.sct
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167282a.m210277b4((BLiveSettings) obj);
            }
        }));
        duringCreated(this.f193403k.mo183454y()).subscribe(dhw.m115825d(new y20() { // from class: l.tct
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f173272a.m210278c4((jsv) obj);
            }
        }));
        m210273W3();
        this.f193403k.mo160116h(yct.f198542b);
    }

    /* JADX INFO: renamed from: W3 */
    public void m210273W3() {
        psd0.m173633z(this.f193405m);
        this.f193405m = duringCreated(((LiveView) this.viewModel).getGiftWidthObs()).onBackpressureLatest().filter(new qcj() { // from class: l.uct
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() > 0);
            }
        }).distinctUntilChanged().subscribe(dhw.m115826e(new y20() { // from class: l.vct
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183484a.m210276a4((Integer) obj);
            }
        }, new y20() { // from class: l.wct
            @Override // p153l.y20
            public final void call(Object obj) {
                xct.m210271V3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X3 */
    public void m210274X3() {
        m213811F2().LivePusherEvent.closeLive().m199277p();
    }

    /* JADX INFO: renamed from: Y3 */
    public final boolean m210275Y3() {
        return this.f193403k.m202193m().m146878d();
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m210276a4(Integer num) {
        m213811F2().ChatEvent.changeInputSize().mo199273j(new Size((bnl0.m105592y0() - num.intValue()) - qa00.f156292E, 0));
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m210277b4(BLiveSettings bLiveSettings) {
        this.f193403k.m168480T0();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m210278c4(jsv jsvVar) {
        m163464M3();
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        this.f196918e.f90824j.destroy();
        super.mo70300n();
        psd0.m173633z(this.f193405m);
        mu40 mu40Var = this.f193403k;
        mu40Var.m168518g2(mu40Var.mo183435j());
        mo120629s2();
        this.f193403k.mo146610c0(false);
        lwr.m156094b();
    }

    @Override // p153l.AbstractC19518q4
    /* JADX INFO: renamed from: o */
    public boolean mo102507o() {
        if (m210275Y3() || m210272Z3()) {
            m210274X3();
            return true;
        }
        m213811F2().ObsPreviewEvent.onBackPressed().m199277p();
        return false;
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        mu40 mu40Var = this.f193403k;
        mu40Var.mo146096e2(true, mu40Var.mo183435j());
    }
}
