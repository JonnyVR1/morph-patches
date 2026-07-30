package p153l;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.live.base.data.BLiveCoin;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveFirstChargeCampaign;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveMerchandise;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xl2 extends i6t<oo2, il2> {

    /* JADX INFO: renamed from: i */
    public boolean f194837i;

    /* JADX INFO: renamed from: j */
    public vxd0 f194838j;

    /* JADX INFO: renamed from: k */
    public List<BLiveMerchandise> f194839k;

    /* JADX INFO: renamed from: l */
    public BLiveMerchandise f194840l;

    /* JADX INFO: renamed from: m */
    public uoe0 f194841m;

    /* JADX INFO: renamed from: n */
    public BLiveData f194842n;

    /* JADX INFO: renamed from: o */
    public int f194843o;

    /* JADX INFO: renamed from: p */
    public String f194844p;

    /* JADX INFO: renamed from: q */
    public String f194845q;

    /* JADX INFO: renamed from: r */
    public kcg0 f194846r;

    /* JADX INFO: renamed from: l.xl2$a */
    public class RunnableC21364a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ uoe0 f194847a;

        public RunnableC21364a(uoe0 uoe0Var) {
            this.f194847a = uoe0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            gpc0.m131244d(this.f194847a, xl2.this.mo78457R2(), false);
            this.f194847a.f180071s.call(2);
        }
    }

    /* JADX INFO: renamed from: l.xl2$b */
    public static class C21365b {

        /* JADX INFO: renamed from: a */
        public String f194849a;

        /* JADX INFO: renamed from: b */
        public int f194850b;

        /* JADX INFO: renamed from: c */
        public int f194851c;

        /* JADX INFO: renamed from: d */
        public int f194852d;

        /* JADX INFO: renamed from: e */
        public BLiveMerchandise f194853e;

        /* JADX INFO: renamed from: f */
        public PayMethod f194854f;
    }

    public xl2(dum dumVar) {
        super(dumVar);
        this.f194837i = true;
        this.f194838j = new vxd0("live_ttb_recent_recharge_num", 0);
        mo130115u4();
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m211459J3(Throwable th) {
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ void m211467S3(BLiveCoin bLiveCoin) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public /* synthetic */ void m211469e4(Long l2) {
        ((il2) this.viewModel).m140565X(l2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g4 */
    public /* synthetic */ void m211470g4(vxj0 vxj0Var) {
        ((il2) this.viewModel).mo76376v();
    }

    /* JADX INFO: renamed from: A4 */
    public void m211471A4(bkg bkgVar, String str) {
        List<BLiveMerchandise> listM211474a4 = m211474a4();
        String strM131242b = gpc0.m131242b(bkgVar.f77069c, m213815L2());
        this.f194845q = strM131242b;
        gpc0.m131249i(strM131242b, listM211474a4, this.f194837i, str);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(((hiv) zrv.m221194l(htd0.f111521c)).m135156h()).subscribe(dhw.m115825d(new y20() { // from class: l.ll2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132520a.m211469e4((Long) obj);
            }
        }));
        mo130110W3();
        duringCreated(C22421c.zip(mo130110W3(), mo130111X3(), mo130112Y3(), new scj() { // from class: l.ol2
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return this.f147809a.m211472U3((List) obj, (BLiveMerchandise) obj2, (BLiveData) obj3);
            }
        }).observeOn(fo0.m126432a())).take(1).subscribe(dhw.m115826e(new y20() { // from class: l.pl2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152982a.m211478f4((List) obj);
            }
        }, new y20() { // from class: l.ql2
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165651y(zrv.f205803e.getString(R$string.f47721Ob));
            }
        }));
        duringCreated(m213811F2().FastRechargeEventGroup.showFastRechargeDialog().m199270g()).onBackpressureLatest().subscribe(dhw.m115829h(new y20() { // from class: l.rl2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163684a.mo130116v4((bkg) obj);
            }
        }));
        duringCreated(m213811F2().FastRechargeEventGroup.closeFastRechargeDialog().m199270g()).onBackpressureLatest().subscribe(dhw.m115825d(new y20() { // from class: l.sl2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169346a.m211470g4((vxj0) obj);
            }
        }));
    }

    @NotNull
    /* JADX INFO: renamed from: U3 */
    public List<BLiveMerchandise> m211472U3(List<BLiveMerchandise> list, BLiveMerchandise bLiveMerchandise, @Nullable BLiveData bLiveData) {
        this.f194839k = list;
        this.f194842n = bLiveData;
        this.f194840l = bLiveMerchandise;
        return mo130109V3(new ArrayList(list));
    }

    /* JADX INFO: renamed from: V3 */
    public abstract List<BLiveMerchandise> mo130109V3(List<BLiveMerchandise> list);

    /* JADX INFO: renamed from: W3 */
    public abstract C22421c<List<BLiveMerchandise>> mo130110W3();

    /* JADX INFO: renamed from: X3 */
    public abstract C22421c<BLiveMerchandise> mo130111X3();

    /* JADX INFO: renamed from: Y3 */
    public abstract C22421c<BLiveData> mo130112Y3();

    /* JADX INFO: renamed from: Z3 */
    public final double m211473Z3(double d) {
        int iIntValue;
        vxd0 vxd0Var = this.f194838j;
        if (d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            if (vxd0Var.get().intValue() != 0) {
                iIntValue = this.f194838j.get().intValue();
                return iIntValue;
            }
            return d;
        }
        if (d < vxd0Var.get().intValue()) {
            iIntValue = this.f194838j.get().intValue();
            return iIntValue;
        }
        return d;
    }

    /* JADX INFO: renamed from: a4 */
    public List<BLiveMerchandise> m211474a4() {
        return jyb.m147522n(this.f194839k, new qcj() { // from class: l.nl2
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((BLiveMerchandise) obj).isCustomRecharge);
            }
        });
    }

    /* JADX INFO: renamed from: b4 */
    public boolean m211475b4() {
        BLiveFirstChargeCampaign bLiveFirstChargeCampaign;
        BLiveData bLiveData = this.f194842n;
        return (bLiveData == null || (bLiveFirstChargeCampaign = bLiveData.firstChargeCampaigns) == null || bLiveFirstChargeCampaign.isCoinRecharged) ? false : true;
    }

    /* JADX INFO: renamed from: c4 */
    public final boolean m211476c4() {
        Act act = act();
        return act == null || act.isFinishing() || act.isDestroyed();
    }

    /* JADX INFO: renamed from: d4 */
    public boolean m211477d4() {
        return this.f194843o == 2;
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m211478f4(List list) {
        ((il2) this.viewModel).m140563V(list);
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ BLiveCoin m211479h4(int i, BLiveCoin bLiveCoin) {
        o1j0.m165651y(zrv.f205803e.getString(u8n.m195065a() ? R$string.f48008c2 : R$string.f47986b2, String.valueOf(i)));
        this.f194838j.put(Integer.valueOf(i));
        return bLiveCoin;
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m211481j4(uoe0 uoe0Var) {
        if (uoe0Var.m196984k()) {
            uoe0Var.f180057e = null;
        }
        m211487s4(uoe0Var);
        gpc0.m131244d(uoe0Var, mo78457R2(), true);
    }

    /* JADX INFO: renamed from: k4 */
    public void m211482k4(final int i, boolean z, final uoe0 uoe0Var) {
        this.f194846r = aiv.m98111k1().map(new qcj() { // from class: l.tl2
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f174781a.m211479h4(i, (BLiveCoin) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.ul2
            @Override // p153l.y20
            public final void call(Object obj) {
                xl2.m211467S3((BLiveCoin) obj);
            }
        }, new y20() { // from class: l.vl2
            @Override // p153l.y20
            public final void call(Object obj) {
                xl2.m211459J3((Throwable) obj);
            }
        }));
        if (z) {
            l51.m152887G(new Runnable() { // from class: l.wl2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f189630a.m211480i4(uoe0Var, i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l4 */
    public abstract void mo130113l4(C21365b c21365b);

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        psd0.m173633z(this.f194846r);
    }

    /* JADX INFO: renamed from: n4 */
    public void m211484n4() {
        m211483m4();
        ((il2) this.viewModel).mo76366U();
        if (this.f194837i) {
            ((il2) this.viewModel).mo76380y(true);
        }
        o1j0.m165634h(R$string.f48283oe);
    }

    /* JADX INFO: renamed from: o4 */
    public void mo160358o4(int i, boolean z) {
        mo130114p4();
        int i2 = this.f194843o;
        if (i2 == 1 || i2 == 2) {
            m211482k4(i, z && i2 == 2, this.f194841m);
            ((il2) this.viewModel).mo76376v();
        } else {
            aiv.m98111k1().subscribe(dhw.m115824c());
            o1j0.m165649w(R$string.f48327qe);
        }
        m213811F2().BottomEvent.hideFirstRecharge().m199277p();
        m211486r4();
    }

    /* JADX INFO: renamed from: q4 */
    public void m211485q4() {
        BLiveMerchandise bLiveMerchandise;
        if (jyb.m147479J(this.f194839k) || (bLiveMerchandise = this.f194840l) == null) {
            return;
        }
        ((il2) this.viewModel).m140563V(m211472U3(this.f194839k, bLiveMerchandise, this.f194842n));
    }

    /* JADX INFO: renamed from: r4 */
    public final void m211486r4() {
        BLiveData bLiveData;
        BLiveFirstChargeCampaign bLiveFirstChargeCampaign;
        if (jyb.m147479J(this.f194839k) || this.f194840l == null || !m211475b4() || (bLiveFirstChargeCampaign = (bLiveData = this.f194842n).firstChargeCampaigns) == null) {
            return;
        }
        bLiveFirstChargeCampaign.isCoinRecharged = true;
        ((il2) this.viewModel).m140563V(m211472U3(this.f194839k, this.f194840l, bLiveData));
    }

    /* JADX INFO: renamed from: s4 */
    public final void m211487s4(uoe0 uoe0Var) {
        m213811F2().SendGiftEventGroup.sendGift().mo199273j(new hne0.C17513a().m136088y(uoe0Var));
    }

    /* JADX INFO: renamed from: t4 */
    public void m211488t4(boolean z) {
        this.f194837i = z;
    }

    /* JADX INFO: renamed from: u4 */
    public abstract void mo130115u4();

    /* JADX INFO: renamed from: v4 */
    public abstract void mo130116v4(bkg bkgVar);

    /* JADX INFO: renamed from: w4, reason: merged with bridge method [inline-methods] */
    public final void m211480i4(final uoe0 uoe0Var, int i) {
        BLiveGiftItem bLiveGiftItem;
        Act act = act();
        if (act == null || uoe0Var == null || (bLiveGiftItem = uoe0Var.f180057e) == null) {
            return;
        }
        act.dialog().m21506G0(zrv.f205803e.getString(R$string.f48252n5)).m21503F(zrv.f205803e.getString(u8n.m195065a() ? R$string.f47763Qb : R$string.f47742Pb, Integer.valueOf(i), bLiveGiftItem.localName.getLocalName())).m21559v0(zrv.f205803e.getString(R$string.f48230m5), new Runnable() { // from class: l.ml2
            @Override // java.lang.Runnable
            public final void run() {
                this.f137355a.m211481j4(uoe0Var);
            }
        }).m21543n0(zrv.f205803e.getString(R$string.f48055e5), new RunnableC21364a(uoe0Var)).m21566z().show();
        gpc0.m131245e(uoe0Var, mo78457R2());
    }

    /* JADX INFO: renamed from: x4 */
    public void m211490x4(bkg bkgVar) {
        BLiveGiftItem bLiveGiftItem;
        int i = bkgVar.f77067a;
        uoe0 uoe0Var = bkgVar.f77068b;
        String str = bkgVar.f77069c;
        aiv.m98111k1().subscribe(dhw.m115824c());
        this.f194841m = uoe0Var;
        this.f194843o = i;
        this.f194844p = gpc0.m131242b(str, m213815L2());
        if (!bkgVar.m104798a()) {
            m213814K2().m189706m(LiveDialogEnum.WEBVIEW);
        }
        ((il2) this.viewModel).mo76367Z(m211473Z3((uoe0Var == null || (bLiveGiftItem = uoe0Var.f180057e) == null) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : bLiveGiftItem.purchasePrice * ((long) uoe0Var.f180058f)), bkgVar);
    }

    /* JADX INFO: renamed from: y4 */
    public void m211491y4() {
        wpj wpjVar = (wpj) m138856F3(new csj(700));
        if (m211476c4()) {
            return;
        }
        if (wpjVar == null) {
            awr.m100712f();
        } else {
            m213811F2().GiftDialogEventGroup.openGiftDialogEvent().mo199273j(new lx50().m156159i(900).m156158h(wpjVar.m207463a()).m156160j(wpjVar.m207464b()));
        }
    }

    /* JADX INFO: renamed from: z4 */
    public abstract boolean mo130117z4();

    /* JADX INFO: renamed from: m4 */
    public void m211483m4() {
    }

    /* JADX INFO: renamed from: p4 */
    public void mo130114p4() {
    }
}
