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
public class an70 extends h4t<pn40, PkFirstGiftView> {

    /* JADX INFO: renamed from: i */
    public final my70 f70713i;

    /* JADX INFO: renamed from: j */
    public hpd0 f70714j;

    /* JADX INFO: renamed from: k */
    public Dialog f70715k;

    /* JADX INFO: renamed from: l */
    public BLivePkFirstKillGift f70716l;

    public an70(bsm bsmVar, PkFirstGiftView pkFirstGiftView, my70 my70Var) {
        super(bsmVar);
        this.f70714j = new hpd0("pk_first_gift_dialog_show" + ypv.f199493a.m199309D0(), Boolean.FALSE);
        mo51532C(pkFirstGiftView);
        this.f70713i = my70Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public void m97724T3() {
        zvf0.m220397s("e_live_first_blood_popup", mo77274R2(), m97726V3());
        uep0.m193327n(this.f70715k);
        if (this.f70713i.m156987h4().booleanValue()) {
            m97730c4();
        } else {
            lsi0.m151593w(R$string.f47629xa);
        }
    }

    /* JADX INFO: renamed from: U3 */
    private cfe0 m97725U3() {
        return new cfe0.C16123a().m106530u(this.f70716l.giftId, new C15674a(), 1, "pk", "pk", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerLocation.get(BLiveTraceServerLocation.f44461PK), BLiveTraceServerBiz.get(BLiveTraceServerBiz.firstblood))).m106529t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    private Map<String, Object> m97726V3() {
        HashMap map = new HashMap();
        map.put("anchor_id", ((pn40) m206027E2()).m132146l0().f56011id);
        map.put("live_id", ((pn40) m206027E2()).mo149813j().f44323id);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public /* synthetic */ Boolean m97727Y3(BLivePkFirstKillGift bLivePkFirstKillGift) {
        return this.f70713i.m156987h4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ Boolean m97728Z3(bn70 bn70Var) {
        return this.f70713i.m156987h4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public void m97729a4(BLivePkFirstKillGift bLivePkFirstKillGift) {
        if (bLivePkFirstKillGift == null || TextUtils.isEmpty(bLivePkFirstKillGift.giftId)) {
            return;
        }
        ht70.m132853j("renderFirstKillGift id:" + bLivePkFirstKillGift.giftId);
        ((PkFirstGiftView) this.viewModel).m76167t0(bLivePkFirstKillGift);
        zvf0.m220403y("e_live_first_blood_button", mo77274R2(), m97726V3());
        zvf0.m220403y("e_live_first_blood_gift_icon", mo77274R2(), m97726V3());
    }

    /* JADX INFO: renamed from: c4 */
    private void m97730c4() {
        m206028F2().SendGiftEventGroup.sendGift().mo172463j(m97725U3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public void m97731d4(BLivePkFirstKillGift bLivePkFirstKillGift) {
        this.f70716l = bLivePkFirstKillGift;
        m206028F2().LivePkEvent.updateFirstGift().mo172463j(bLivePkFirstKillGift);
    }

    /* JADX INFO: renamed from: e4 */
    private void m97732e4() {
        if (this.f70716l == null) {
            return;
        }
        Dialog dialogM20567z = this.f188513f.dialog().m20504F(this.f70716l.firstKillDescription).m20556t0(R$string.f47514s5, new Runnable() { // from class: l.wm70
            @Override // java.lang.Runnable
            public final void run() {
                this.f187049a.m97724T3();
            }
        }).m20541k0(R$string.f47015V6).m20496B(false).m20567z();
        this.f70715k = dialogM20567z;
        dialogM20567z.show();
        zvf0.m220403y("e_live_first_blood_popup", mo77274R2(), m97726V3());
    }

    /* JADX INFO: renamed from: P3 */
    public void m97733P3() {
        zvf0.m220397s("e_live_first_blood_gift_icon", mo77274R2(), m97726V3());
        m97735S3();
    }

    /* JADX INFO: renamed from: R3 */
    public void m97734R3() {
        zvf0.m220397s("e_live_first_blood_button", mo77274R2(), m97726V3());
        m97735S3();
    }

    /* JADX INFO: renamed from: S3 */
    public void m97735S3() {
        if (this.f70714j.get().booleanValue()) {
            m97730c4();
        } else {
            m97732e4();
        }
    }

    /* JADX INFO: renamed from: W3 */
    public void m97736W3() {
        if (this.f70713i.m156987h4().booleanValue()) {
            m97738b4();
        } else {
            ((PkFirstGiftView) this.viewModel).m76165p0();
        }
    }

    /* JADX INFO: renamed from: X3 */
    public void m97737X3() {
        ((PkFirstGiftView) this.viewModel).m76165p0();
    }

    /* JADX INFO: renamed from: b4 */
    public void m97738b4() {
        BLivePkFirstKillGift bLivePkFirstKillGift = this.f70716l;
        if (bLivePkFirstKillGift != null) {
            m97729a4(bLivePkFirstKillGift);
        } else {
            duringCreated(LivingNormalApiProvider.m71239H5()).filter(new w9j() { // from class: l.xm70
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f193535a.m97727Y3((BLivePkFirstKillGift) obj);
                }
            }).doOnNext(new e30() { // from class: l.ym70
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f198966a.m97731d4((BLivePkFirstKillGift) obj);
                }
            }).subscribe(ffw.m121194e(new e30() { // from class: l.zm70
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f203700a.m97729a4((BLivePkFirstKillGift) obj);
                }
            }, new a280()));
        }
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        uep0.m193327n(this.f70715k);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m129301d3(bn70.class, new w9j() { // from class: l.vm70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f182084a.m97728Z3((bn70) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l.an70$a */
    public class C15674a implements zfv.C21687a.a {
        public C15674a() {
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: a */
        public void mo67166a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            an70.this.f70714j.put(Boolean.TRUE);
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
