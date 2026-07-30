package p002l;

import android.content.Intent;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.archi.act.LiveBaseFrag;
import com.p000p1.mobile.putong.live.livingroom.base.live.LiveView;
import com.p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p1.mobile.putong.live.base.data.BLive;
import com.p1.mobile.putong.live.base.data.BLiveRoom;
import com.p1.mobile.putong.live.base.data.BLiveSettings;
import com.tantan.live.eventbus.LiveEventBus;
import l.bwr;
import l.c4g0;
import l.e30;
import l.ffw;
import l.kur;
import l.mkd0;
import l.ptn;
import l.t100;
import l.vdt;
import l.w9j;
import l.xdl0;
import l.ypv;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wat extends AbstractC0795r4<yl40, BLive, rn40, LiveView> {

    /* JADX INFO: renamed from: i */
    public final LiveBaseFrag f21593i;

    /* JADX INFO: renamed from: j */
    public final String f21594j;

    /* JADX INFO: renamed from: k */
    public yl40 f21595k;

    /* JADX INFO: renamed from: l */
    public AnchorStartData f21596l;

    /* JADX INFO: renamed from: m */
    public c4g0 f21597m;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public wat(LiveBaseFrag liveBaseFrag, String str, AnchorStartData anchorStartData) {
        super(new rn40(liveBaseFrag, new yl40(new qn40(), new zgt(str)), new LiveEventBus()));
        VFrame vFrame = (LiveView) liveBaseFrag.H2().inflate(t6c0.f19890j5, (ViewGroup) null, false);
        this.f22036e.m10575a(this, vFrame);
        C(vFrame);
        this.f21593i = liveBaseFrag;
        this.f21595k = (yl40) this.f22036e.f8339h;
        this.f21594j = str;
        this.f21596l = anchorStartData;
        ((yl40) m25547E2()).m26796S2(str);
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ void m24455V3(Throwable th) {
    }

    /* JADX INFO: renamed from: Z3 */
    private boolean m24456Z3() {
        return this.f21595k.m17237m().m15304g();
    }

    @Override // p002l.AbstractC0795r4
    /* JADX INFO: renamed from: N3 */
    public View mo21766N3() {
        return ((bwr) this).viewModel;
    }

    @Override // p002l.AbstractC0795r4
    /* JADX INFO: renamed from: O3 */
    public void mo21767O3(int i, int i2, Intent intent) {
        if (i == 100 && i2 == -1) {
            this.f21595k.mo14572i((BLiveRoom) intent.getSerializableExtra("room_tag"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002l.AbstractC0795r4
    /* JADX INFO: renamed from: P3 */
    public void mo21768P3() {
        kur.d();
        if (!vdt.b(2)) {
            ptn.c("live", new ptn.a());
        }
        ypv.r();
        this.f21595k.m14557c2();
        this.f21595k.m14520P1();
        l4t.m16945a(this, (rn40) m17947K3(), (LiveView) ((bwr) this).viewModel, this.f21596l);
        m17948L3();
        duringCreated(ypv.k().k()).subscribe(ffw.d(new e30() { // from class: l.rat
            public final void call(Object obj) {
                this.f18444a.m24461b4((BLiveSettings) obj);
            }
        }));
        duringCreated(this.f21595k.m17248y()).subscribe(ffw.d(new e30() { // from class: l.sat
            public final void call(Object obj) {
                this.f18902a.m24462c4((iqv) obj);
            }
        }));
        m24457W3();
        this.f21595k.mo17233h(xat.f22204b);
    }

    /* JADX INFO: renamed from: W3 */
    public void m24457W3() {
        mkd0.z(this.f21597m);
        this.f21597m = duringCreated(((LiveView) ((bwr) this).viewModel).getGiftWidthObs()).onBackpressureLatest().filter(new w9j() { // from class: l.tat
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() > 0);
            }
        }).distinctUntilChanged().subscribe(ffw.e(new e30() { // from class: l.uat
            public final void call(Object obj) {
                this.f20570a.m24460a4((Integer) obj);
            }
        }, new e30() { // from class: l.vat
            public final void call(Object obj) {
                wat.m24455V3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X3 */
    public void m24458X3() {
        m25548F2().LivePusherEvent.closeLive().p();
    }

    /* JADX INFO: renamed from: Y3 */
    public final boolean m24459Y3() {
        return this.f21595k.m17237m().m15301d();
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m24460a4(Integer num) {
        m25548F2().ChatEvent.changeInputSize().j(new Size((xdl0.y0() - num.intValue()) - t100.E, 0));
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m24461b4(BLiveSettings bLiveSettings) {
        this.f21595k.m14530T0();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m24462c4(iqv iqvVar) {
        m17949M3();
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        this.f22036e.f8341j.destroy();
        super.mo5949n();
        mkd0.z(this.f21597m);
        yl40 yl40Var = this.f21595k;
        yl40Var.m14568g2(yl40Var.m17234j());
        s2();
        this.f21595k.mo9891c0(false);
        kur.b();
    }

    @Override // p002l.AbstractC0795r4
    /* JADX INFO: renamed from: o */
    public boolean mo21769o() {
        if (m24459Y3() || m24456Z3()) {
            m24458X3();
            return true;
        }
        m25548F2().ObsPreviewEvent.onBackPressed().p();
        return false;
    }

    /* JADX INFO: renamed from: t */
    public void m24463t() {
        super.t();
        yl40 yl40Var = this.f21595k;
        yl40Var.mo9892e2(true, yl40Var.m17234j());
    }
}
