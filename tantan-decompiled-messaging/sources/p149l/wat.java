package p149l;

import android.content.Intent;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.livingroom.archi.act.LiveBaseFrag;
import com.p046p1.mobile.putong.live.livingroom.base.live.LiveView;
import com.tantan.live.eventbus.LiveEventBus;

/* JADX INFO: loaded from: classes4.dex */
public class wat extends AbstractC19634r4<yl40, BLive, rn40, LiveView> {

    /* JADX INFO: renamed from: i */
    public final LiveBaseFrag f185504i;

    /* JADX INFO: renamed from: j */
    public final String f185505j;

    /* JADX INFO: renamed from: k */
    public yl40 f185506k;

    /* JADX INFO: renamed from: l */
    public AnchorStartData f185507l;

    /* JADX INFO: renamed from: m */
    public c4g0 f185508m;

    /* JADX WARN: Multi-variable type inference failed */
    public wat(LiveBaseFrag liveBaseFrag, String str, AnchorStartData anchorStartData) {
        super(new rn40(liveBaseFrag, new yl40(new qn40(), new zgt(str)), new LiveEventBus()));
        LiveView liveView = (LiveView) liveBaseFrag.mo20578H2().inflate(t6c0.f168394j5, (ViewGroup) null, false);
        this.f188512e.m103722a(this, liveView);
        mo51532C(liveView);
        this.f185504i = liveBaseFrag;
        this.f185506k = (yl40) this.f188512e.f77102h;
        this.f185505j = str;
        this.f185507l = anchorStartData;
        ((yl40) m206027E2()).m215225S2(str);
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ void m202467V3(Throwable th) {
    }

    /* JADX INFO: renamed from: Z3 */
    private boolean m202468Z3() {
        return this.f185506k.m149816m().m137800g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.AbstractC19634r4
    /* JADX INFO: renamed from: N3 */
    public View mo177748N3() {
        return (View) this.viewModel;
    }

    @Override // p149l.AbstractC19634r4
    /* JADX INFO: renamed from: O3 */
    public void mo177749O3(int i, int i2, Intent intent) {
        if (i == 100 && i2 == -1) {
            this.f185506k.mo132136i((BLiveRoom) intent.getSerializableExtra("room_tag"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.AbstractC19634r4
    /* JADX INFO: renamed from: P3 */
    public void mo177750P3() {
        kur.m147299d();
        if (!vdt.m198092b(2)) {
            ptn.m171363c("live", new ptn.C19336a());
        }
        ypv.m215676r();
        this.f185506k.mo132121c2();
        this.f185506k.m132084P1();
        l4t.m148461a(this, (rn40) m154638K3(), (LiveView) this.viewModel, this.f185507l);
        m154639L3();
        duringCreated(ypv.m215672k().m121230k()).subscribe(ffw.m121193d(new e30() { // from class: l.rat
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158556a.m202473b4((BLiveSettings) obj);
            }
        }));
        duringCreated(this.f185506k.mo149827y()).subscribe(ffw.m121193d(new e30() { // from class: l.sat
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f163438a.m202474c4((iqv) obj);
            }
        }));
        m202469W3();
        this.f185506k.mo149812h(xat.f191815b);
    }

    /* JADX INFO: renamed from: W3 */
    public void m202469W3() {
        mkd0.m154992z(this.f185508m);
        this.f185508m = duringCreated(((LiveView) this.viewModel).getGiftWidthObs()).onBackpressureLatest().filter(new w9j() { // from class: l.tat
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() > 0);
            }
        }).distinctUntilChanged().subscribe(ffw.m121194e(new e30() { // from class: l.uat
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175633a.m202472a4((Integer) obj);
            }
        }, new e30() { // from class: l.vat
            @Override // p149l.e30
            public final void call(Object obj) {
                wat.m202467V3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X3 */
    public void m202470X3() {
        m206028F2().LivePusherEvent.closeLive().m172467p();
    }

    /* JADX INFO: renamed from: Y3 */
    public final boolean m202471Y3() {
        return this.f185506k.m149816m().m137797d();
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m202472a4(Integer num) {
        m206028F2().ChatEvent.changeInputSize().mo172463j(new Size((xdl0.m208412y0() - num.intValue()) - t100.f167230E, 0));
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m202473b4(BLiveSettings bLiveSettings) {
        this.f185506k.m132094T0();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m202474c4(iqv iqvVar) {
        m154640M3();
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        this.f188512e.f77104j.destroy();
        super.mo69117n();
        mkd0.m154992z(this.f185508m);
        yl40 yl40Var = this.f185506k;
        yl40Var.m132132g2(yl40Var.mo149813j());
        mo111727s2();
        this.f185506k.mo97488c0(false);
        kur.m147297b();
    }

    @Override // p149l.AbstractC19634r4
    /* JADX INFO: renamed from: o */
    public boolean mo177751o() {
        if (m202471Y3() || m202468Z3()) {
            m202470X3();
            return true;
        }
        m206028F2().ObsPreviewEvent.onBackPressed().m172467p();
        return false;
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        yl40 yl40Var = this.f185506k;
        yl40Var.mo97489e2(true, yl40Var.mo149813j());
    }
}
