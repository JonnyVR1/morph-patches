package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLivePkFirstKillGift;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.PkFirstGiftView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class av70 extends i6t<dw40, PkFirstGiftView> {

    /* JADX INFO: renamed from: i */
    public final sx70 f73591i;

    /* JADX INFO: renamed from: j */
    public jxd0 f73592j;

    /* JADX INFO: renamed from: k */
    public Dialog f73593k;

    /* JADX INFO: renamed from: l */
    public BLivePkFirstKillGift f73594l;

    public av70(dum dumVar, PkFirstGiftView pkFirstGiftView, sx70 sx70Var) {
        super(dumVar);
        this.f73592j = new jxd0("pk_first_gift_dialog_show_internal" + zrv.f205799a.m207631D0(), Boolean.FALSE);
        mo52715C(pkFirstGiftView);
        this.f73591i = sx70Var;
    }

    /* JADX INFO: renamed from: P3 */
    public void m100416P3() {
        i4g0.m138521s("e_live_first_blood_gift_icon", mo78457R2(), m100421V3());
        m100418S3();
    }

    /* JADX INFO: renamed from: R3 */
    public void m100417R3() {
        i4g0.m138521s("e_live_first_blood_button", mo78457R2(), m100421V3());
        m100418S3();
    }

    /* JADX INFO: renamed from: S3 */
    public void m100418S3() {
        if (this.f73592j.get().booleanValue()) {
            m100428c4();
        } else {
            m100430e4();
        }
    }

    /* JADX INFO: renamed from: T3 */
    public final void m100419T3() {
        i4g0.m138521s("e_live_first_blood_popup", mo78457R2(), m100421V3());
        ynp0.m216937n(this.f73593k);
        if (this.f73591i.m188457e4().booleanValue()) {
            m100428c4();
        } else {
            o1j0.m165649w(R$string.f48477xa);
        }
    }

    /* JADX INFO: renamed from: U3 */
    public final hne0 m100420U3() {
        return new hne0.C17513a().m136084u(this.f73594l.giftId, new C15845a(), 1, "pk", "pk", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerLocation.get(BLiveTraceServerLocation.f45309PK), BLiveTraceServerBiz.get(BLiveTraceServerBiz.firstblood))).m136083t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public final Map<String, Object> m100421V3() {
        HashMap map = new HashMap();
        map.put("anchor_id", ((dw40) m213810E2()).m168532l0().f56859id);
        map.put("live_id", ((dw40) m213810E2()).mo183435j().f45171id);
        return map;
    }

    /* JADX INFO: renamed from: W3 */
    public void m100422W3() {
        if (this.f73591i.m188457e4().booleanValue()) {
            m100427b4();
        } else {
            ((PkFirstGiftView) this.viewModel).m77348p0();
        }
    }

    /* JADX INFO: renamed from: X3 */
    public void m100423X3() {
        ((PkFirstGiftView) this.viewModel).m77348p0();
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ Boolean m100424Y3(BLivePkFirstKillGift bLivePkFirstKillGift) {
        return this.f73591i.m188457e4();
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ Boolean m100425Z3(hv70 hv70Var) {
        return this.f73591i.m188457e4();
    }

    /* JADX INFO: renamed from: a4 */
    public final void m100426a4(BLivePkFirstKillGift bLivePkFirstKillGift) {
        if (bLivePkFirstKillGift == null || TextUtils.isEmpty(bLivePkFirstKillGift.giftId)) {
            return;
        }
        n180.m161093j("renderFirstKillGift id:" + bLivePkFirstKillGift.giftId);
        ((PkFirstGiftView) this.viewModel).m77350t0(bLivePkFirstKillGift);
        i4g0.m138527y("e_live_first_blood_button", mo78457R2(), m100421V3());
        i4g0.m138527y("e_live_first_blood_gift_icon", mo78457R2(), m100421V3());
    }

    /* JADX INFO: renamed from: b4 */
    public void m100427b4() {
        BLivePkFirstKillGift bLivePkFirstKillGift = this.f73594l;
        if (bLivePkFirstKillGift != null) {
            m100426a4(bLivePkFirstKillGift);
        } else {
            duringCreated(LivingNormalApiProvider.m72422H5()).filter(new qcj() { // from class: l.xu70
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f196265a.m100424Y3((BLivePkFirstKillGift) obj);
                }
            }).doOnNext(new y20() { // from class: l.yu70
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f201595a.m100429d4((BLivePkFirstKillGift) obj);
                }
            }).subscribe(dhw.m115826e(new y20() { // from class: l.zu70
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f206096a.m100426a4((BLivePkFirstKillGift) obj);
                }
            }, new ga80()));
        }
    }

    /* JADX INFO: renamed from: c4 */
    public final void m100428c4() {
        m213811F2().SendGiftEventGroup.sendGift().mo199273j(m100420U3());
    }

    /* JADX INFO: renamed from: d4 */
    public final void m100429d4(BLivePkFirstKillGift bLivePkFirstKillGift) {
        this.f73594l = bLivePkFirstKillGift;
        m213811F2().LivePkEvent.updateFirstGift().mo199273j(bLivePkFirstKillGift);
    }

    /* JADX INFO: renamed from: e4 */
    public final void m100430e4() {
        if (this.f73594l == null) {
            return;
        }
        Dialog dialogM21566z = this.f196919f.dialog().m21503F(this.f73594l.firstKillDescription).m21555t0(R$string.f48362s5, new Runnable() { // from class: l.vu70
            @Override // java.lang.Runnable
            public final void run() {
                this.f185768a.m100419T3();
            }
        }).m21540k0(R$string.f47863V6).m21495B(false).m21566z();
        this.f73593k = dialogM21566z;
        dialogM21566z.show();
        i4g0.m138527y("e_live_first_blood_popup", mo78457R2(), m100421V3());
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        ynp0.m216937n(this.f73593k);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m138860d3(hv70.class, new qcj() { // from class: l.wu70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f190846a.m100425Z3((hv70) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l.av70$a */
    public class C15845a implements aiv.C15716a.a {
        public C15845a() {
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: a */
        public void mo68349a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            av70.this.f73592j.put(Boolean.TRUE);
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: b */
        public void mo68350b() {
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: c */
        public void mo68351c() {
        }
    }
}
