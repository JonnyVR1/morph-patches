package p002l;

import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.live.base.data.BLiveCoin;
import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveFirstChargeCampaign;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveMerchandise;
import java.util.ArrayList;
import java.util.List;
import l.bwr;
import l.c4g0;
import l.e30;
import l.e51;
import l.ffw;
import l.fld0;
import l.ggv;
import l.jo0;
import l.lsi0;
import l.mkd0;
import l.soj0;
import l.tpd0;
import l.u6n;
import l.vwb;
import l.w9j;
import l.y9j;
import l.ypv;
import l.ztr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class pl2 extends h4t<ho2, al2> {

    /* JADX INFO: renamed from: i */
    public boolean f17465i;

    /* JADX INFO: renamed from: j */
    public tpd0 f17466j;

    /* JADX INFO: renamed from: k */
    public List<BLiveMerchandise> f17467k;

    /* JADX INFO: renamed from: l */
    public BLiveMerchandise f17468l;

    /* JADX INFO: renamed from: m */
    public pge0 f17469m;

    /* JADX INFO: renamed from: n */
    public BLiveData f17470n;

    /* JADX INFO: renamed from: o */
    public int f17471o;

    /* JADX INFO: renamed from: p */
    public String f17472p;

    /* JADX INFO: renamed from: q */
    public String f17473q;

    /* JADX INFO: renamed from: r */
    public c4g0 f17474r;

    /* JADX INFO: renamed from: l.pl2$a */
    public class RunnableC0750a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ pge0 f17475a;

        public RunnableC0750a(pge0 pge0Var) {
            this.f17475a = pge0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            zgc0.m27329d(this.f17475a, pl2.this.mo21430R2(), false);
            this.f17475a.f17294s.call(2);
        }
    }

    /* JADX INFO: renamed from: l.pl2$b */
    public static class C0751b {

        /* JADX INFO: renamed from: a */
        public String f17477a;

        /* JADX INFO: renamed from: b */
        public int f17478b;

        /* JADX INFO: renamed from: c */
        public int f17479c;

        /* JADX INFO: renamed from: d */
        public int f17480d;

        /* JADX INFO: renamed from: e */
        public BLiveMerchandise f17481e;

        /* JADX INFO: renamed from: f */
        public PayMethod f17482f;
    }

    public pl2(bsm bsmVar) {
        super(bsmVar);
        this.f17465i = true;
        this.f17466j = new tpd0("live_ttb_recent_recharge_num", 0);
        mo13755u4();
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m20383J3(Throwable th) {
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ void m20391S3(BLiveCoin bLiveCoin) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public /* synthetic */ void m20393e4(Long l2) {
        ((al2) ((bwr) this).viewModel).m9865X(l2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g4 */
    public /* synthetic */ void m20394g4(soj0 soj0Var) {
        ((al2) ((bwr) this).viewModel).mo8809v();
    }

    /* JADX INFO: renamed from: A4 */
    public void m20395A4(nig nigVar, String str) {
        List<BLiveMerchandise> listM20398a4 = m20398a4();
        String strM27327b = zgc0.m27327b(nigVar.f16052c, m25552L2());
        this.f17473q = strM27327b;
        zgc0.m27334i(strM27327b, listM20398a4, this.f17465i, str);
    }

    /* JADX INFO: renamed from: T */
    public void mo13748T() {
        super.T();
        duringCreated(((ggv) ypv.l(fld0.c)).h()).subscribe(ffw.d(new e30() { // from class: l.dl2
            public final void call(Object obj) {
                this.f9316a.m20393e4((Long) obj);
            }
        }));
        mo13750W3();
        duringCreated(c.zip(mo13750W3(), mo13751X3(), mo13752Y3(), new y9j() { // from class: l.gl2
            /* JADX INFO: renamed from: a */
            public final Object m13877a(Object obj, Object obj2, Object obj3) {
                return this.f11490a.m20396U3((List) obj, (BLiveMerchandise) obj2, (BLiveData) obj3);
            }
        }).observeOn(jo0.a())).take(1).subscribe(ffw.e(new e30() { // from class: l.hl2
            public final void call(Object obj) {
                this.f12098a.m20402f4((List) obj);
            }
        }, new e30() { // from class: l.il2
            public final void call(Object obj) {
                lsi0.y(ypv.e.getString(R$string.f2915Ob));
            }
        }));
        duringCreated((c) m25548F2().FastRechargeEventGroup.showFastRechargeDialog().g()).onBackpressureLatest().subscribe(ffw.h(new e30() { // from class: l.jl2
            public final void call(Object obj) {
                this.f13854a.mo13756v4((nig) obj);
            }
        }));
        duringCreated((c) m25548F2().FastRechargeEventGroup.closeFastRechargeDialog().g()).onBackpressureLatest().subscribe(ffw.d(new e30() { // from class: l.kl2
            public final void call(Object obj) {
                this.f14370a.m20394g4((soj0) obj);
            }
        }));
    }

    @NotNull
    /* JADX INFO: renamed from: U3 */
    public List<BLiveMerchandise> m20396U3(List<BLiveMerchandise> list, BLiveMerchandise bLiveMerchandise, @Nullable BLiveData bLiveData) {
        this.f17467k = list;
        this.f17470n = bLiveData;
        this.f17468l = bLiveMerchandise;
        return mo13749V3(new ArrayList(list));
    }

    /* JADX INFO: renamed from: V3 */
    public abstract List<BLiveMerchandise> mo13749V3(List<BLiveMerchandise> list);

    /* JADX INFO: renamed from: W3 */
    public abstract c<List<BLiveMerchandise>> mo13750W3();

    /* JADX INFO: renamed from: X3 */
    public abstract c<BLiveMerchandise> mo13751X3();

    /* JADX INFO: renamed from: Y3 */
    public abstract c<BLiveData> mo13752Y3();

    /* JADX INFO: renamed from: Z3 */
    public final double m20397Z3(double d) {
        int iIntValue;
        tpd0 tpd0Var = this.f17466j;
        if (d == 0.0d) {
            if (((Integer) tpd0Var.get()).intValue() != 0) {
                iIntValue = ((Integer) this.f17466j.get()).intValue();
                return iIntValue;
            }
            return d;
        }
        if (d < ((Integer) tpd0Var.get()).intValue()) {
            iIntValue = ((Integer) this.f17466j.get()).intValue();
            return iIntValue;
        }
        return d;
    }

    /* JADX INFO: renamed from: a4 */
    public List<BLiveMerchandise> m20398a4() {
        return vwb.n(this.f17467k, new w9j() { // from class: l.fl2
            public final Object call(Object obj) {
                return Boolean.valueOf(!((BLiveMerchandise) obj).isCustomRecharge);
            }
        });
    }

    /* JADX INFO: renamed from: b4 */
    public boolean m20399b4() {
        BLiveFirstChargeCampaign bLiveFirstChargeCampaign;
        BLiveData bLiveData = this.f17470n;
        return (bLiveData == null || (bLiveFirstChargeCampaign = bLiveData.firstChargeCampaigns) == null || bLiveFirstChargeCampaign.isCoinRecharged) ? false : true;
    }

    /* JADX INFO: renamed from: c4 */
    public final boolean m20400c4() {
        Act act = act();
        return act == null || act.isFinishing() || act.isDestroyed();
    }

    /* JADX INFO: renamed from: d4 */
    public boolean m20401d4() {
        return this.f17471o == 2;
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m20402f4(List list) {
        ((al2) ((bwr) this).viewModel).m9863V(list);
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ BLiveCoin m20403h4(int i, BLiveCoin bLiveCoin) {
        lsi0.y(ypv.e.getString(u6n.a() ? R$string.f3202c2 : R$string.f3180b2, String.valueOf(i)));
        this.f17466j.put(Integer.valueOf(i));
        return bLiveCoin;
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m20405j4(pge0 pge0Var) {
        if (pge0Var.m20250k()) {
            pge0Var.f17280e = null;
        }
        m20411s4(pge0Var);
        zgc0.m27329d(pge0Var, mo21430R2(), true);
    }

    /* JADX INFO: renamed from: k4 */
    public void m20406k4(final int i, boolean z, final pge0 pge0Var) {
        this.f17474r = zfv.m27280k1().map(new w9j() { // from class: l.ll2
            public final Object call(Object obj) {
                return this.f14920a.m20403h4(i, (BLiveCoin) obj);
            }
        }).subscribe(ffw.e(new e30() { // from class: l.ml2
            public final void call(Object obj) {
                pl2.m20391S3((BLiveCoin) obj);
            }
        }, new e30() { // from class: l.nl2
            public final void call(Object obj) {
                pl2.m20383J3((Throwable) obj);
            }
        }));
        if (z) {
            e51.G(new Runnable() { // from class: l.ol2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16687a.m20404i4(pge0Var, i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l4 */
    public abstract void mo13753l4(C0751b c0751b);

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        mkd0.z(this.f17474r);
    }

    /* JADX INFO: renamed from: n4 */
    public void m20408n4() {
        m20407m4();
        ((al2) ((bwr) this).viewModel).mo8799U();
        if (this.f17465i) {
            ((al2) ((bwr) this).viewModel).mo8813y(true);
        }
        lsi0.h(R$string.f3477oe);
    }

    /* JADX INFO: renamed from: o4 */
    public void mo17460o4(int i, boolean z) {
        mo13754p4();
        int i2 = this.f17471o;
        if (i2 == 1 || i2 == 2) {
            m20406k4(i, z && i2 == 2, this.f17469m);
            ((al2) ((bwr) this).viewModel).mo8809v();
        } else {
            zfv.m27280k1().subscribe(ffw.c());
            lsi0.w(R$string.f3521qe);
        }
        m25548F2().BottomEvent.hideFirstRecharge().p();
        m20410r4();
    }

    /* JADX INFO: renamed from: q4 */
    public void m20409q4() {
        BLiveMerchandise bLiveMerchandise;
        if (vwb.J(this.f17467k) || (bLiveMerchandise = this.f17468l) == null) {
            return;
        }
        ((al2) ((bwr) this).viewModel).m9863V(m20396U3(this.f17467k, bLiveMerchandise, this.f17470n));
    }

    /* JADX INFO: renamed from: r4 */
    public final void m20410r4() {
        BLiveData bLiveData;
        BLiveFirstChargeCampaign bLiveFirstChargeCampaign;
        if (vwb.J(this.f17467k) || this.f17468l == null || !m20399b4() || (bLiveFirstChargeCampaign = (bLiveData = this.f17470n).firstChargeCampaigns) == null) {
            return;
        }
        bLiveFirstChargeCampaign.isCoinRecharged = true;
        ((al2) ((bwr) this).viewModel).m9863V(m20396U3(this.f17467k, this.f17468l, bLiveData));
    }

    /* JADX INFO: renamed from: s4 */
    public final void m20411s4(pge0 pge0Var) {
        m25548F2().SendGiftEventGroup.sendGift().j(new cfe0.C0512a().m10987y(pge0Var));
    }

    /* JADX INFO: renamed from: t4 */
    public void m20412t4(boolean z) {
        this.f17465i = z;
    }

    /* JADX INFO: renamed from: u4 */
    public abstract void mo13755u4();

    /* JADX INFO: renamed from: v4 */
    public abstract void mo13756v4(nig nigVar);

    /* JADX INFO: renamed from: w4, reason: merged with bridge method [inline-methods] */
    public final void m20404i4(final pge0 pge0Var, int i) {
        BLiveGiftItem bLiveGiftItem;
        Act act = act();
        if (act == null || pge0Var == null || (bLiveGiftItem = pge0Var.f17280e) == null) {
            return;
        }
        act.dialog().G0(ypv.e.getString(R$string.f3446n5)).F(ypv.e.getString(u6n.a() ? R$string.f2957Qb : R$string.f2936Pb, Integer.valueOf(i), bLiveGiftItem.localName.getLocalName())).v0(ypv.e.getString(R$string.f3424m5), new Runnable() { // from class: l.el2
            @Override // java.lang.Runnable
            public final void run() {
                this.f9843a.m20405j4(pge0Var);
            }
        }).n0(ypv.e.getString(R$string.f3249e5), new RunnableC0750a(pge0Var)).z().show();
        zgc0.m27330e(pge0Var, mo21430R2());
    }

    /* JADX INFO: renamed from: x4 */
    public void m20414x4(nig nigVar) {
        BLiveGiftItem bLiveGiftItem;
        int i = nigVar.f16050a;
        pge0 pge0Var = nigVar.f16051b;
        String str = nigVar.f16052c;
        zfv.m27280k1().subscribe(ffw.c());
        this.f17469m = pge0Var;
        this.f17471o = i;
        this.f17472p = zgc0.m27327b(str, m25552L2());
        if (!nigVar.m18774a()) {
            m25551K2().m22225m(LiveDialogEnum.WEBVIEW);
        }
        ((al2) ((bwr) this).viewModel).mo8800Z(m20397Z3((pge0Var == null || (bLiveGiftItem = pge0Var.f17280e) == null) ? 0.0d : bLiveGiftItem.purchasePrice * ((long) pge0Var.f17281f)), nigVar);
    }

    /* JADX INFO: renamed from: y4 */
    public void m20415y4() {
        gnj gnjVar = (gnj) m14184F3(new mpj(700));
        if (m20400c4()) {
            return;
        }
        if (gnjVar == null) {
            ztr.f();
        } else {
            m25548F2().GiftDialogEventGroup.openGiftDialogEvent().j(new fp50().m13445i(900).m13444h(gnjVar.m13974a()).m13446j(gnjVar.m13975b()));
        }
    }

    /* JADX INFO: renamed from: z4 */
    public abstract boolean mo13757z4();

    /* JADX INFO: renamed from: m4 */
    public void m20407m4() {
    }

    /* JADX INFO: renamed from: p4 */
    public void mo13754p4() {
    }
}
