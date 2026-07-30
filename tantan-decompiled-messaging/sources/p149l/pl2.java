package p149l;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.live.base.data.BLiveCoin;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveFirstChargeCampaign;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveMerchandise;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public abstract class pl2 extends h4t<ho2, al2> {

    /* JADX INFO: renamed from: i */
    public boolean f150053i;

    /* JADX INFO: renamed from: j */
    public tpd0 f150054j;

    /* JADX INFO: renamed from: k */
    public List<BLiveMerchandise> f150055k;

    /* JADX INFO: renamed from: l */
    public BLiveMerchandise f150056l;

    /* JADX INFO: renamed from: m */
    public pge0 f150057m;

    /* JADX INFO: renamed from: n */
    public BLiveData f150058n;

    /* JADX INFO: renamed from: o */
    public int f150059o;

    /* JADX INFO: renamed from: p */
    public String f150060p;

    /* JADX INFO: renamed from: q */
    public String f150061q;

    /* JADX INFO: renamed from: r */
    public c4g0 f150062r;

    /* JADX INFO: renamed from: l.pl2$a */
    public class RunnableC19262a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ pge0 f150063a;

        public RunnableC19262a(pge0 pge0Var) {
            this.f150063a = pge0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            zgc0.m218632d(this.f150063a, pl2.this.mo77274R2(), false);
            this.f150063a.f148670s.call(2);
        }
    }

    /* JADX INFO: renamed from: l.pl2$b */
    public static class C19263b {

        /* JADX INFO: renamed from: a */
        public String f150065a;

        /* JADX INFO: renamed from: b */
        public int f150066b;

        /* JADX INFO: renamed from: c */
        public int f150067c;

        /* JADX INFO: renamed from: d */
        public int f150068d;

        /* JADX INFO: renamed from: e */
        public BLiveMerchandise f150069e;

        /* JADX INFO: renamed from: f */
        public PayMethod f150070f;
    }

    public pl2(bsm bsmVar) {
        super(bsmVar);
        this.f150053i = true;
        this.f150054j = new tpd0("live_ttb_recent_recharge_num", 0);
        mo125580u4();
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m170079J3(Throwable th) {
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ void m170087S3(BLiveCoin bLiveCoin) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public /* synthetic */ void m170089e4(Long l2) {
        ((al2) this.viewModel).m97254X(l2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g4 */
    public /* synthetic */ void m170090g4(soj0 soj0Var) {
        ((al2) this.viewModel).mo75193v();
    }

    /* JADX INFO: renamed from: A4 */
    public void m170091A4(nig nigVar, String str) {
        List<BLiveMerchandise> listM170094a4 = m170094a4();
        String strM218630b = zgc0.m218630b(nigVar.f139090c, m206032L2());
        this.f150061q = strM218630b;
        zgc0.m218637i(strM218630b, listM170094a4, this.f150053i, str);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(((ggv) ypv.m215673l(fld0.f98148c)).m126022h()).subscribe(ffw.m121193d(new e30() { // from class: l.dl2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f86775a.m170089e4((Long) obj);
            }
        }));
        mo125575W3();
        duringCreated(C22306c.zip(mo125575W3(), mo125576X3(), mo125577Y3(), new y9j() { // from class: l.gl2
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return this.f103278a.m170092U3((List) obj, (BLiveMerchandise) obj2, (BLiveData) obj3);
            }
        }).observeOn(jo0.m142408a())).take(1).subscribe(ffw.m121194e(new e30() { // from class: l.hl2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108306a.m170098f4((List) obj);
            }
        }, new e30() { // from class: l.il2
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151595y(ypv.f199497e.getString(R$string.f46873Ob));
            }
        }));
        duringCreated(m206028F2().FastRechargeEventGroup.showFastRechargeDialog().m172460g()).onBackpressureLatest().subscribe(ffw.m121197h(new e30() { // from class: l.jl2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118445a.mo125581v4((nig) obj);
            }
        }));
        duringCreated(m206028F2().FastRechargeEventGroup.closeFastRechargeDialog().m172460g()).onBackpressureLatest().subscribe(ffw.m121193d(new e30() { // from class: l.kl2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123634a.m170090g4((soj0) obj);
            }
        }));
    }

    @NotNull
    /* JADX INFO: renamed from: U3 */
    public List<BLiveMerchandise> m170092U3(List<BLiveMerchandise> list, BLiveMerchandise bLiveMerchandise, @Nullable BLiveData bLiveData) {
        this.f150055k = list;
        this.f150058n = bLiveData;
        this.f150056l = bLiveMerchandise;
        return mo125574V3(new ArrayList(list));
    }

    /* JADX INFO: renamed from: V3 */
    public abstract List<BLiveMerchandise> mo125574V3(List<BLiveMerchandise> list);

    /* JADX INFO: renamed from: W3 */
    public abstract C22306c<List<BLiveMerchandise>> mo125575W3();

    /* JADX INFO: renamed from: X3 */
    public abstract C22306c<BLiveMerchandise> mo125576X3();

    /* JADX INFO: renamed from: Y3 */
    public abstract C22306c<BLiveData> mo125577Y3();

    /* JADX INFO: renamed from: Z3 */
    public final double m170093Z3(double d) {
        int iIntValue;
        tpd0 tpd0Var = this.f150054j;
        if (d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            if (tpd0Var.get().intValue() != 0) {
                iIntValue = this.f150054j.get().intValue();
                return iIntValue;
            }
            return d;
        }
        if (d < tpd0Var.get().intValue()) {
            iIntValue = this.f150054j.get().intValue();
            return iIntValue;
        }
        return d;
    }

    /* JADX INFO: renamed from: a4 */
    public List<BLiveMerchandise> m170094a4() {
        return vwb.m200339n(this.f150055k, new w9j() { // from class: l.fl2
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((BLiveMerchandise) obj).isCustomRecharge);
            }
        });
    }

    /* JADX INFO: renamed from: b4 */
    public boolean m170095b4() {
        BLiveFirstChargeCampaign bLiveFirstChargeCampaign;
        BLiveData bLiveData = this.f150058n;
        return (bLiveData == null || (bLiveFirstChargeCampaign = bLiveData.firstChargeCampaigns) == null || bLiveFirstChargeCampaign.isCoinRecharged) ? false : true;
    }

    /* JADX INFO: renamed from: c4 */
    public final boolean m170096c4() {
        Act act = act();
        return act == null || act.isFinishing() || act.isDestroyed();
    }

    /* JADX INFO: renamed from: d4 */
    public boolean m170097d4() {
        return this.f150059o == 2;
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m170098f4(List list) {
        ((al2) this.viewModel).m97252V(list);
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ BLiveCoin m170099h4(int i, BLiveCoin bLiveCoin) {
        lsi0.m151595y(ypv.f199497e.getString(u6n.m192015a() ? R$string.f47160c2 : R$string.f47138b2, String.valueOf(i)));
        this.f150054j.put(Integer.valueOf(i));
        return bLiveCoin;
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m170101j4(pge0 pge0Var) {
        if (pge0Var.m168685k()) {
            pge0Var.f148656e = null;
        }
        m170107s4(pge0Var);
        zgc0.m218632d(pge0Var, mo77274R2(), true);
    }

    /* JADX INFO: renamed from: k4 */
    public void m170102k4(final int i, boolean z, final pge0 pge0Var) {
        this.f150062r = zfv.m218577k1().map(new w9j() { // from class: l.ll2
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f128632a.m170099h4(i, (BLiveCoin) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.ml2
            @Override // p149l.e30
            public final void call(Object obj) {
                pl2.m170087S3((BLiveCoin) obj);
            }
        }, new e30() { // from class: l.nl2
            @Override // p149l.e30
            public final void call(Object obj) {
                pl2.m170079J3((Throwable) obj);
            }
        }));
        if (z) {
            e51.m114742G(new Runnable() { // from class: l.ol2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f144474a.m170100i4(pge0Var, i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l4 */
    public abstract void mo125578l4(C19263b c19263b);

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        mkd0.m154992z(this.f150062r);
    }

    /* JADX INFO: renamed from: n4 */
    public void m170104n4() {
        m170103m4();
        ((al2) this.viewModel).mo75183U();
        if (this.f150053i) {
            ((al2) this.viewModel).mo75197y(true);
        }
        lsi0.m151578h(R$string.f47435oe);
    }

    /* JADX INFO: renamed from: o4 */
    public void mo151756o4(int i, boolean z) {
        mo125579p4();
        int i2 = this.f150059o;
        if (i2 == 1 || i2 == 2) {
            m170102k4(i, z && i2 == 2, this.f150057m);
            ((al2) this.viewModel).mo75193v();
        } else {
            zfv.m218577k1().subscribe(ffw.m121192c());
            lsi0.m151593w(R$string.f47479qe);
        }
        m206028F2().BottomEvent.hideFirstRecharge().m172467p();
        m170106r4();
    }

    /* JADX INFO: renamed from: q4 */
    public void m170105q4() {
        BLiveMerchandise bLiveMerchandise;
        if (vwb.m200296J(this.f150055k) || (bLiveMerchandise = this.f150056l) == null) {
            return;
        }
        ((al2) this.viewModel).m97252V(m170092U3(this.f150055k, bLiveMerchandise, this.f150058n));
    }

    /* JADX INFO: renamed from: r4 */
    public final void m170106r4() {
        BLiveData bLiveData;
        BLiveFirstChargeCampaign bLiveFirstChargeCampaign;
        if (vwb.m200296J(this.f150055k) || this.f150056l == null || !m170095b4() || (bLiveFirstChargeCampaign = (bLiveData = this.f150058n).firstChargeCampaigns) == null) {
            return;
        }
        bLiveFirstChargeCampaign.isCoinRecharged = true;
        ((al2) this.viewModel).m97252V(m170092U3(this.f150055k, this.f150056l, bLiveData));
    }

    /* JADX INFO: renamed from: s4 */
    public final void m170107s4(pge0 pge0Var) {
        m206028F2().SendGiftEventGroup.sendGift().mo172463j(new cfe0.C16123a().m106534y(pge0Var));
    }

    /* JADX INFO: renamed from: t4 */
    public void m170108t4(boolean z) {
        this.f150053i = z;
    }

    /* JADX INFO: renamed from: u4 */
    public abstract void mo125580u4();

    /* JADX INFO: renamed from: v4 */
    public abstract void mo125581v4(nig nigVar);

    /* JADX INFO: renamed from: w4, reason: merged with bridge method [inline-methods] */
    public final void m170100i4(final pge0 pge0Var, int i) {
        BLiveGiftItem bLiveGiftItem;
        Act act = act();
        if (act == null || pge0Var == null || (bLiveGiftItem = pge0Var.f148656e) == null) {
            return;
        }
        act.dialog().m20507G0(ypv.f199497e.getString(R$string.f47404n5)).m20504F(ypv.f199497e.getString(u6n.m192015a() ? R$string.f46915Qb : R$string.f46894Pb, Integer.valueOf(i), bLiveGiftItem.localName.getLocalName())).m20560v0(ypv.f199497e.getString(R$string.f47382m5), new Runnable() { // from class: l.el2
            @Override // java.lang.Runnable
            public final void run() {
                this.f92056a.m170101j4(pge0Var);
            }
        }).m20544n0(ypv.f199497e.getString(R$string.f47207e5), new RunnableC19262a(pge0Var)).m20567z().show();
        zgc0.m218633e(pge0Var, mo77274R2());
    }

    /* JADX INFO: renamed from: x4 */
    public void m170110x4(nig nigVar) {
        BLiveGiftItem bLiveGiftItem;
        int i = nigVar.f139088a;
        pge0 pge0Var = nigVar.f139089b;
        String str = nigVar.f139090c;
        zfv.m218577k1().subscribe(ffw.m121192c());
        this.f150057m = pge0Var;
        this.f150059o = i;
        this.f150060p = zgc0.m218630b(str, m206032L2());
        if (!nigVar.m159500a()) {
            m206031K2().m182470m(LiveDialogEnum.WEBVIEW);
        }
        ((al2) this.viewModel).mo75184Z(m170093Z3((pge0Var == null || (bLiveGiftItem = pge0Var.f148656e) == null) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : bLiveGiftItem.purchasePrice * ((long) pge0Var.f148657f)), nigVar);
    }

    /* JADX INFO: renamed from: y4 */
    public void m170111y4() {
        gnj gnjVar = (gnj) m129297F3(new mpj(700));
        if (m170096c4()) {
            return;
        }
        if (gnjVar == null) {
            ztr.m220141f();
        } else {
            m206028F2().GiftDialogEventGroup.openGiftDialogEvent().mo172463j(new fp50().m122565i(900).m122564h(gnjVar.m127139a()).m122566j(gnjVar.m127140b()));
        }
    }

    /* JADX INFO: renamed from: z4 */
    public abstract boolean mo125582z4();

    /* JADX INFO: renamed from: m4 */
    public void m170103m4() {
    }

    /* JADX INFO: renamed from: p4 */
    public void mo125579p4() {
    }
}
