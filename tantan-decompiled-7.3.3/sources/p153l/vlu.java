package p153l;

import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveResourceInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveType;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftDialogContentView;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftItemView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.anim.GiftItemAnimType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p153l.knu;

/* JADX INFO: loaded from: classes9.dex */
public class vlu<T extends knu> extends ahu<jku> {

    /* JADX INFO: renamed from: f */
    public long f184638f;

    /* JADX INFO: renamed from: g */
    public String f184639g;

    /* JADX INFO: renamed from: h */
    public final Map<String, xxj> f184640h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public cqj f184641i;

    /* JADX INFO: renamed from: j */
    public Map<String, qul> f184642j;

    /* JADX INFO: renamed from: k */
    public String f184643k;

    /* JADX INFO: renamed from: l */
    public boolean f184644l;

    /* JADX INFO: renamed from: m */
    public wuj<?> f184645m;

    /* JADX INFO: renamed from: n */
    public Pair<BLiveResourceInfo, xxj> f184646n;

    public vlu(knu knuVar) {
        super(knuVar);
        this.f184639g = m201679n3();
        this.f184640h = new HashMap();
        this.f184644l = true;
        mo52715C(new jku());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B3 */
    public /* synthetic */ void m201660B3(String str) {
        if (yuk0.m217435a(m97926H2().m212308A())) {
            m201705b4();
        }
    }

    /* JADX INFO: renamed from: R2 */
    public static /* synthetic */ void m201661R2(List list) {
    }

    /* JADX INFO: renamed from: W2 */
    public static /* synthetic */ void m201666W2(Integer num) {
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ void m201670a3(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
    }

    /* JADX INFO: renamed from: n3 */
    private String m201679n3() {
        return "live";
    }

    /* JADX INFO: renamed from: w3 */
    private void m201680w3() {
        duringCreated((C22421c<T>) m97926H2().m212310C()).filter(new qcj() { // from class: l.flu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f99692a.m201686H3((xxj) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.glu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f104886a.m201687I3((xxj) obj);
            }
        }));
        duringCreated((C22421c<T>) m97926H2().m212347q()).subscribe(dhw.m115825d(new y20() { // from class: l.hlu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f110536a.m201685G3((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ void m201681C3(String str) {
        m201698U3(str, null);
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ void m201682D3(r7f0 r7f0Var) {
        m201704a4(r7f0Var.m180142b(), r7f0Var.m180141a(), r7f0Var.m180143c());
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ Boolean m201683E3(xpj xpjVar) {
        return Boolean.valueOf(m201720x3(xpjVar.f195711c));
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ e060 m201684F3(eqj eqjVar) {
        return ((jku) this.viewModel).m145919p();
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ void m201685G3(Long l2) {
        this.f184638f = l2.longValue();
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ Boolean m201686H3(xxj xxjVar) {
        if (isShowing() && m201721y3(xxjVar)) {
            m201703Z3(true, true);
        }
        return Boolean.valueOf(xxjVar.m213536j());
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ void m201687I3(xxj xxjVar) {
        this.f184640h.put(xxjVar.m213533g(), xxjVar);
        if (isShowing()) {
            m201708e4(((jku) this.viewModel).m145920q());
        }
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m201690L3(BLiveType bLiveType, Pair pair) {
        this.f184646n = pair;
        if (TextUtils.equals(bLiveType.toString(), "live")) {
            ere.m122146i().m122161s(pair);
        }
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m201691M3(xxj xxjVar) {
        ((jku) this.viewModel).m145926y(xxjVar);
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m201692N3(xxj xxjVar) {
        ((jku) this.viewModel).m145926y(xxjVar);
    }

    /* JADX INFO: renamed from: O3 */
    public final void m201693O3() {
        Map<String, qul> map = this.f184642j;
        if (map == null) {
            return;
        }
        jyb.m147537z(map.values(), new blu());
    }

    /* JADX INFO: renamed from: P3 */
    public void m201694P3() {
        List<hzj> listM201715r3 = m201715r3();
        if (listM201715r3 != null) {
            dpj.m117405y(listM201715r3);
        }
        m97928K2().GiftDialogEventGroup.m70356a().mo199273j(Boolean.FALSE);
        this.f184643k = "";
        this.f184644l = true;
        m0k.m156519h();
        r230.m179477s();
        System.gc();
    }

    /* JADX INFO: renamed from: R3 */
    public void m201695R3() {
        if (this.f184646n != null) {
            ere.m122146i().mo122147a(this.f184646n, "");
        }
    }

    /* JADX INFO: renamed from: S3 */
    public void m201696S3(LiveVChatGiftDialogContentView liveVChatGiftDialogContentView) {
        m153103z2(new oku(m97930M2(), liveVChatGiftDialogContentView.f46003h));
        this.f184645m = (wuj) m153103z2(new wuj(m97930M2(), liveVChatGiftDialogContentView.f46005j, liveVChatGiftDialogContentView.f46004i));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        ((jku) this.viewModel).m145921s(act());
        m97927I2(m97928K2().GiftDialogEventGroup.m70361f(), new y20() { // from class: l.mlu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137449a.m201722z3((lx50) obj);
            }
        });
        m97927I2(m97928K2().GiftDialogEventGroup.m70360e(), new y20() { // from class: l.nlu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142594a.m201717t3((kne0) obj);
            }
        });
        m113231o2(m97926H2().m212355z(), false).distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.olu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147876a.m201660B3((String) obj);
            }
        }));
        duringCreated((C22421c<T>) m97928K2().GiftDialogEventGroup.m70363h().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.plu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153094a.m201681C3((String) obj);
            }
        }));
        duringCreated((C22421c<T>) m97928K2().GiftDialogEventGroup.m70364i().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.qlu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f158275a.m201682D3((r7f0) obj);
            }
        }));
        m97925F2(xpj.class, new qcj() { // from class: l.rlu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f163803a.m201683E3((xpj) obj);
            }
        });
        m97925F2(eqj.class, new qcj() { // from class: l.slu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f169460a.m201684F3((eqj) obj);
            }
        });
        m0k.m156516d();
    }

    /* JADX INFO: renamed from: T3 */
    public void m201697T3() {
        m201698U3(isShowing() ? this.f184643k : "", null);
    }

    /* JADX INFO: renamed from: U3 */
    public final void m201698U3(String str, x20 x20Var) {
        m97926H2().m212321N(new uxj.C20693a(m97926H2().m212352v(), m201709j3(), this.f184639g).m198496h(str).m198495g(x20Var).m198494f(), new y20() { // from class: l.ulu
            @Override // p153l.y20
            public final void call(Object obj) {
                vlu.m201661R2((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public void m201699V3(final jjs jjsVar, final LiveVChatGiftItemView liveVChatGiftItemView, @Nullable final y20<BLiveGivenGiftBrief> y20Var, int i, final int i2, final boolean z) {
        final BLiveGiftItem bLiveGiftItemM145122h = jjsVar.m145122h();
        m201700W3(uoe0.m196974d(String.valueOf(bLiveGiftItemM145122h.f45225id), bLiveGiftItemM145122h, new y20() { // from class: l.ilu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f115603a.m201688J3(bLiveGiftItemM145122h, jjsVar, liveVChatGiftItemView, y20Var, i2, z, (BLiveGivenGiftBrief) obj);
            }
        }, new y20() { // from class: l.jlu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121596a.m201689K3(liveVChatGiftItemView, bLiveGiftItemM145122h, (Throwable) obj);
            }
        }, new y20() { // from class: l.klu
            @Override // p153l.y20
            public final void call(Object obj) {
                vlu.m201666W2((Integer) obj);
            }
        }, false, i, this.f184639g, this.f184641i, dpj.m117402v(bLiveGiftItemM145122h, jjsVar, i2)));
    }

    /* JADX INFO: renamed from: W3 */
    public void m201700W3(uoe0 uoe0Var) {
        m97928K2().SendGiftEventGroup.m70386a().mo199273j(new hne0.C17513a().m136088y(uoe0Var));
    }

    /* JADX INFO: renamed from: X3 */
    public void m201701X3(String str) {
        this.f184643k = str;
    }

    /* JADX INFO: renamed from: Y3 */
    public void m201702Y3(lx50 lx50Var, boolean z) {
        aiv.m98111k1().subscribe(dhw.m115824c());
        ((jku) this.viewModel).m145911A();
        v3f.C20736d<Boolean, C22421c<Boolean>> c20736dM70356a = m97928K2().GiftDialogEventGroup.m70356a();
        Boolean bool = Boolean.TRUE;
        c20736dM70356a.mo199273j(bool);
        m201707d4(lx50Var.m156155e(), z);
        m97928K2().GiftDialogEventGroup.m70357b().mo199273j(bool);
        if (this.f184644l) {
            m201697T3();
            this.f184644l = false;
        }
        m201719v3();
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m201703Z3(boolean z, boolean z2) {
        ((jku) this.viewModel).m145926y(xxj.m213527b(z, false, z2));
    }

    /* JADX INFO: renamed from: a4 */
    public final void m201704a4(y20<Boolean> y20Var, y20<Boolean> y20Var2, long j) {
        ((jku) this.viewModel).m145912B(act(), y20Var, y20Var2, j);
    }

    /* JADX INFO: renamed from: b4 */
    public void m201705b4() {
        m201697T3();
        m97926H2().m212324Q().subscribe(dhw.m115824c());
        final BLiveType bLiveType = BLiveType.get("live");
        ere.m122146i().m122168z(m97926H2().m212352v(), m201709j3(), bLiveType);
        htd0<hiv> htd0Var = htd0.f111521c;
        duringCreated(C22421c.zip(((hiv) zrv.m221194l(htd0Var)).m135165q().onErrorReturn(null), ((hiv) zrv.m221194l(htd0Var)).m135167s().onErrorReturn(null), new dlu()).observeOn(Schedulers.m222739io())).onBackpressureLatest().compose(psd0.m173592C()).subscribe(dhw.m115829h(new y20() { // from class: l.elu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94585a.m201690L3(bLiveType, (Pair) obj);
            }
        }));
        m201680w3();
    }

    /* JADX INFO: renamed from: c4 */
    public void m201706c4(lx50 lx50Var, boolean z) {
        String strM156153c = lx50Var.m156153c();
        cqj cqjVarM156151a = lx50Var.m156151a();
        if (TextUtils.equals(strM156153c, "default")) {
            strM156153c = m201679n3();
            cqjVarM156151a = m201711m3();
        }
        if (lx50Var.m156152b() == 1000 && cqjVarM156151a != null) {
            cqjVarM156151a.m111918g().f82889e.f107997a = "";
        }
        if (!TextUtils.equals(this.f184639g, strM156153c)) {
            m201703Z3(false, z);
        }
        this.f184639g = strM156153c;
        this.f184641i = cqjVarM156151a;
        m201702Y3(lx50Var, z);
    }

    /* JADX INFO: renamed from: d4 */
    public final void m201707d4(List<Integer> list, boolean z) {
        final xxj xxjVarM201714q3 = m201714q3();
        if (xxjVarM201714q3 != null) {
            xxjVarM201714q3.m213540n(list);
            xxjVarM201714q3.m213537k(new xxj.C21473a(true, false, z));
            l51.m152887G(new Runnable() { // from class: l.tlu
                @Override // java.lang.Runnable
                public final void run() {
                    this.f174865a.m201691M3(xxjVarM201714q3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e4 */
    public final void m201708e4(boolean z) {
        final xxj xxjVarM201714q3 = m201714q3();
        if (xxjVarM201714q3 != null) {
            xxjVarM201714q3.m213537k(new xxj.C21473a(true, z, true));
            l51.m152887G(new Runnable() { // from class: l.llu
                @Override // java.lang.Runnable
                public final void run() {
                    this.f132605a.m201692N3(xxjVarM201714q3);
                }
            });
        }
    }

    public boolean isShowing() {
        return ((jku) this.viewModel).isShowing();
    }

    /* JADX INFO: renamed from: j3 */
    public String m201709j3() {
        return m97926H2().m212345o();
    }

    /* JADX INFO: renamed from: k3 */
    public int m201710k3() {
        return ((jku) this.viewModel).m145918n();
    }

    @Nullable
    /* JADX INFO: renamed from: m3 */
    public cqj m201711m3() {
        return null;
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m201693O3();
        m0k.m156514b();
        osj.m169050c().m169051a();
    }

    /* JADX INFO: renamed from: o3 */
    public e060 m201712o3() {
        return ((jku) this.viewModel).m145919p();
    }

    @Nullable
    /* JADX INFO: renamed from: p3 */
    public qul m201713p3(String str) {
        GiftItemAnimType giftItemAnimTypeValueOf;
        if (this.f184642j == null) {
            this.f184642j = new HashMap();
        }
        qul qulVar = this.f184642j.get(str);
        if (qulVar != null) {
            return qulVar;
        }
        try {
            giftItemAnimTypeValueOf = GiftItemAnimType.valueOf(str);
        } catch (Exception unused) {
            giftItemAnimTypeValueOf = null;
        }
        if (giftItemAnimTypeValueOf == null) {
            return null;
        }
        qul controller = giftItemAnimTypeValueOf.getController();
        this.f184642j.put(str, controller);
        return controller;
    }

    @Nullable
    /* JADX INFO: renamed from: q3 */
    public final xxj m201714q3() {
        return this.f184640h.get(this.f184639g);
    }

    @Nullable
    /* JADX INFO: renamed from: r3 */
    public final List<hzj> m201715r3() {
        xxj xxjVarM201714q3 = m201714q3();
        if (xxjVarM201714q3 == null) {
            return null;
        }
        List<hzj> listM221999f = xxjVarM201714q3.m213531e().m221999f();
        if (jyb.m147479J(listM221999f)) {
            return null;
        }
        return listM221999f;
    }

    /* JADX INFO: renamed from: s3, reason: merged with bridge method [inline-methods] */
    public final void m201689K3(Throwable th, LiveVChatGiftItemView liveVChatGiftItemView, BLiveGiftItem bLiveGiftItem) {
        if (bLiveGiftItem.isPacketGift()) {
            boolean z = th instanceof TantanException.Client.CoreService;
            if (z && ((TantanException.Client.CoreService) th).code == 41201) {
                liveVChatGiftItemView.m70633l1(0);
            } else if (z && ((TantanException.Client.CoreService) th).code == 41202) {
                liveVChatGiftItemView.m70633l1(0);
            }
        }
    }

    /* JADX INFO: renamed from: t3 */
    public final void m201717t3(kne0 kne0Var) {
        jjs jjsVarM150506d = kne0Var.m150506d();
        LiveVChatGiftItemView liveVChatGiftItemViewM150503a = kne0Var.m150503a();
        int iM150505c = kne0Var.m150505c();
        m201699V3(jjsVarM150506d, liveVChatGiftItemViewM150503a, new y20() { // from class: l.clu
            @Override // p153l.y20
            public final void call(Object obj) {
                vlu.m201670a3((BLiveGivenGiftBrief) obj);
            }
        }, kne0Var.m150504b(), iM150505c, false);
    }

    /* JADX INFO: renamed from: u3, reason: merged with bridge method [inline-methods] */
    public final void m201688J3(BLiveGiftItem bLiveGiftItem, jjs jjsVar, LiveVChatGiftItemView liveVChatGiftItemView, BLiveGivenGiftBrief bLiveGivenGiftBrief, @Nullable y20<BLiveGivenGiftBrief> y20Var, int i, boolean z) {
        jjsVar.m145137w(bLiveGivenGiftBrief);
        if (liveVChatGiftItemView != null) {
            ((jku) this.viewModel).m145913C(jjsVar, bLiveGivenGiftBrief);
            liveVChatGiftItemView.m70629h1(jjsVar, bLiveGivenGiftBrief);
            if (y20Var != null) {
                y20Var.call(bLiveGivenGiftBrief);
            }
            jb0 jb0Var = new jb0(liveVChatGiftItemView, jjsVar, i, z, m201712o3());
            if (isShowing()) {
                this.f184645m.m207960a3(jb0Var);
            }
            if (bLiveGiftItem.mobileVibration) {
                n0k.m161010g(liveVChatGiftItemView.getContext());
            }
        }
    }

    /* JADX INFO: renamed from: v3 */
    public void m201719v3() {
        m97928K2().GiftDialogEventGroup.m70359d().m199277p();
    }

    /* JADX INFO: renamed from: x3 */
    public boolean m201720x3(double d) {
        return ((double) this.f184638f) >= d;
    }

    /* JADX INFO: renamed from: y3 */
    public final boolean m201721y3(xxj xxjVar) {
        xxj xxjVar2 = this.f184640h.get(xxjVar.m213533g());
        return xxjVar2 == null || jyb.m147479J(xxjVar2.m213530d().m221999f());
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ void m201722z3(lx50 lx50Var) {
        muj.m160163F(lx50Var);
        m201695R3();
        m201706c4(lx50Var, false);
    }
}
