package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLivePkFirstKillGift;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.PkFirstGiftView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class um70 extends h4t<pn40, PkFirstGiftView> {

    /* JADX INFO: renamed from: i */
    public final mp70 f177200i;

    /* JADX INFO: renamed from: j */
    public hpd0 f177201j;

    /* JADX INFO: renamed from: k */
    public Dialog f177202k;

    /* JADX INFO: renamed from: l */
    public BLivePkFirstKillGift f177203l;

    public um70(bsm bsmVar, PkFirstGiftView pkFirstGiftView, mp70 mp70Var) {
        super(bsmVar);
        this.f177201j = new hpd0("pk_first_gift_dialog_show_internal" + ypv.f199493a.m199309D0(), Boolean.FALSE);
        mo51532C(pkFirstGiftView);
        this.f177200i = mp70Var;
    }

    /* JADX INFO: renamed from: P3 */
    public void m194311P3() {
        zvf0.m220397s("e_live_first_blood_gift_icon", mo77274R2(), m194316V3());
        m194313S3();
    }

    /* JADX INFO: renamed from: R3 */
    public void m194312R3() {
        zvf0.m220397s("e_live_first_blood_button", mo77274R2(), m194316V3());
        m194313S3();
    }

    /* JADX INFO: renamed from: S3 */
    public void m194313S3() {
        if (this.f177201j.get().booleanValue()) {
            m194323c4();
        } else {
            m194325e4();
        }
    }

    /* JADX INFO: renamed from: T3 */
    public final void m194314T3() {
        zvf0.m220397s("e_live_first_blood_popup", mo77274R2(), m194316V3());
        uep0.m193327n(this.f177202k);
        if (this.f177200i.m155790e4().booleanValue()) {
            m194323c4();
        } else {
            lsi0.m151593w(R$string.f47629xa);
        }
    }

    /* JADX INFO: renamed from: U3 */
    public final cfe0 m194315U3() {
        return new cfe0.C16123a().m106530u(this.f177203l.giftId, new C20457a(), 1, "pk", "pk", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerLocation.get(BLiveTraceServerLocation.f44461PK), BLiveTraceServerBiz.get(BLiveTraceServerBiz.firstblood))).m106529t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public final Map<String, Object> m194316V3() {
        HashMap map = new HashMap();
        map.put("anchor_id", ((pn40) m206027E2()).m132146l0().f56011id);
        map.put("live_id", ((pn40) m206027E2()).mo149813j().f44323id);
        return map;
    }

    /* JADX INFO: renamed from: W3 */
    public void m194317W3() {
        if (this.f177200i.m155790e4().booleanValue()) {
            m194322b4();
        } else {
            ((PkFirstGiftView) this.viewModel).m76165p0();
        }
    }

    /* JADX INFO: renamed from: X3 */
    public void m194318X3() {
        ((PkFirstGiftView) this.viewModel).m76165p0();
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ Boolean m194319Y3(BLivePkFirstKillGift bLivePkFirstKillGift) {
        return this.f177200i.m155790e4();
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ Boolean m194320Z3(bn70 bn70Var) {
        return this.f177200i.m155790e4();
    }

    /* JADX INFO: renamed from: a4 */
    public final void m194321a4(BLivePkFirstKillGift bLivePkFirstKillGift) {
        if (bLivePkFirstKillGift == null || TextUtils.isEmpty(bLivePkFirstKillGift.giftId)) {
            return;
        }
        ht70.m132853j("renderFirstKillGift id:" + bLivePkFirstKillGift.giftId);
        ((PkFirstGiftView) this.viewModel).m76167t0(bLivePkFirstKillGift);
        zvf0.m220403y("e_live_first_blood_button", mo77274R2(), m194316V3());
        zvf0.m220403y("e_live_first_blood_gift_icon", mo77274R2(), m194316V3());
    }

    /* JADX INFO: renamed from: b4 */
    public void m194322b4() {
        BLivePkFirstKillGift bLivePkFirstKillGift = this.f177203l;
        if (bLivePkFirstKillGift != null) {
            m194321a4(bLivePkFirstKillGift);
        } else {
            duringCreated(LivingNormalApiProvider.m71239H5()).filter(new w9j() { // from class: l.rm70
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f160067a.m194319Y3((BLivePkFirstKillGift) obj);
                }
            }).doOnNext(new e30() { // from class: l.sm70
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f165332a.m194324d4((BLivePkFirstKillGift) obj);
                }
            }).subscribe(ffw.m121194e(new e30() { // from class: l.tm70
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f171138a.m194321a4((BLivePkFirstKillGift) obj);
                }
            }, new a280()));
        }
    }

    /* JADX INFO: renamed from: c4 */
    public final void m194323c4() {
        m206028F2().SendGiftEventGroup.sendGift().mo172463j(m194315U3());
    }

    /* JADX INFO: renamed from: d4 */
    public final void m194324d4(BLivePkFirstKillGift bLivePkFirstKillGift) {
        this.f177203l = bLivePkFirstKillGift;
        m206028F2().LivePkEvent.updateFirstGift().mo172463j(bLivePkFirstKillGift);
    }

    /* JADX INFO: renamed from: e4 */
    public final void m194325e4() {
        if (this.f177203l == null) {
            return;
        }
        Dialog dialogM20567z = this.f188513f.dialog().m20504F(this.f177203l.firstKillDescription).m20556t0(R$string.f47514s5, new Runnable() { // from class: l.pm70
            @Override // java.lang.Runnable
            public final void run() {
                this.f150195a.m194314T3();
            }
        }).m20541k0(R$string.f47015V6).m20496B(false).m20567z();
        this.f177202k = dialogM20567z;
        dialogM20567z.show();
        zvf0.m220403y("e_live_first_blood_popup", mo77274R2(), m194316V3());
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        uep0.m193327n(this.f177202k);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m129301d3(bn70.class, new w9j() { // from class: l.qm70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f155286a.m194320Z3((bn70) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l.um70$a */
    public class C20457a implements zfv.C21687a.a {
        public C20457a() {
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: a */
        public void mo67166a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            um70.this.f177201j.put(Boolean.TRUE);
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: b */
        public void mo67167b() {
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: c */
        public void mo67168c() {
        }
    }
}
