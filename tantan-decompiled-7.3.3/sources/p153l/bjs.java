package p153l;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.LiveUserLevel;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveHierarchyProgress;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.base.data.BLiveResourceInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveType;
import com.p051p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p051p1.mobile.putong.live.base.data.BLiveWealthButton;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.anim.GiftItemAnimType;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogContentView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bjs<T extends oo2> extends y8s<T, nhs> {

    /* JADX INFO: renamed from: j */
    public long f77007j;

    /* JADX INFO: renamed from: k */
    public gd60 f77008k;

    /* JADX INFO: renamed from: l */
    public String f77009l;

    /* JADX INFO: renamed from: m */
    public final Map<String, xxj> f77010m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public cqj f77011n;

    /* JADX INFO: renamed from: o */
    public Map<String, qul> f77012o;

    /* JADX INFO: renamed from: p */
    public String f77013p;

    /* JADX INFO: renamed from: q */
    public boolean f77014q;

    /* JADX INFO: renamed from: r */
    public boolean f77015r;

    /* JADX INFO: renamed from: s */
    public vuj<?> f77016s;

    /* JADX INFO: renamed from: t */
    public orj<?> f77017t;

    /* JADX INFO: renamed from: u */
    public boolean f77018u;

    /* JADX INFO: renamed from: v */
    public lx50 f77019v;

    /* JADX INFO: renamed from: w */
    public Pair<BLiveResourceInfo, xxj> f77020w;

    public bjs(dum<T> dumVar) {
        super(dumVar);
        this.f77009l = mo104711K4();
        this.f77010m = new HashMap();
        this.f77015r = true;
        this.f77018u = false;
        mo52715C(new nhs());
    }

    /* JADX INFO: renamed from: J5 */
    private void m104645J5() {
        Map<String, qul> map = this.f77012o;
        if (map == null) {
            return;
        }
        jyb.m147537z(map.values(), new blu());
    }

    @Nullable
    /* JADX INFO: renamed from: Q4 */
    private xxj m104646Q4() {
        return this.f77010m.get(this.f77009l);
    }

    /* JADX INFO: renamed from: S4 */
    private Act m104648S4() {
        Act act = act();
        if (act == null || act.isFinishing()) {
            return null;
        }
        return act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U4, reason: merged with bridge method [inline-methods] */
    public void m104703F5(Throwable th, LiveGiftItemView liveGiftItemView, BLiveGiftItem bLiveGiftItem) {
        if (bLiveGiftItem.isPacketGift()) {
            boolean z = th instanceof TantanException.Client.CoreService;
            if (z && ((TantanException.Client.CoreService) th).code == 41201) {
                liveGiftItemView.m74670p1(0);
            } else if (z && ((TantanException.Client.CoreService) th).code == 41202) {
                liveGiftItemView.m74670p1(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W4, reason: merged with bridge method [inline-methods] */
    public void m104701E5(BLiveGiftItem bLiveGiftItem, jjs jjsVar, LiveGiftItemView liveGiftItemView, BLiveGivenGiftBrief bLiveGivenGiftBrief, @Nullable y20<BLiveGivenGiftBrief> y20Var, int i, boolean z) {
        jjsVar.m145137w(bLiveGivenGiftBrief);
        if (liveGiftItemView != null) {
            ((nhs) this.viewModel).m163228j0(jjsVar, bLiveGivenGiftBrief);
            liveGiftItemView.m74667l1(jjsVar, bLiveGivenGiftBrief);
            if (y20Var != null) {
                y20Var.call(bLiveGivenGiftBrief);
            }
            ib0 ib0Var = new ib0(liveGiftItemView, jjsVar, i, z, ((nhs) this.viewModel).m163200B());
            if (vxr.m203876d().m170980I0() && !jjsVar.m145133s()) {
                m213811F2().IntlGiftComboEvent.comboEvent().mo199273j(ib0Var);
            }
            if (isShowing()) {
                this.f77016s.m202803T3(ib0Var);
            }
            if (bLiveGiftItem.mobileVibration) {
                n0k.m161010g(liveGiftItemView.getContext());
            }
        }
    }

    /* JADX INFO: renamed from: Z4 */
    private void m104658Z4() {
        duringCreated((C22421c<T>) m213810E2().m168469P0()).filter(new qcj() { // from class: l.gis
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f104521a.m104768z5((xxj) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.his
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f110061a.m104694A5((xxj) obj);
            }
        }));
        duringCreated((C22421c<T>) m213810E2().m168550t1()).subscribe(dhw.m115825d(new y20() { // from class: l.iis
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f115122a.m104695B5((Long) obj);
            }
        }));
        duringCreated((C22421c<T>) m213810E2().m168471Q0()).subscribe(dhw.m115825d(new y20() { // from class: l.jis
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121118a.m104723Q5((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b5 */
    private boolean m104661b5(xxj xxjVar) {
        xxj xxjVar2 = this.f77010m.get(xxjVar.m213533g());
        return xxjVar2 == null || jyb.m147479J(xxjVar2.m213530d().m221999f());
    }

    /* JADX INFO: renamed from: b6 */
    private void m104662b6(boolean z, boolean z2) {
        ((nhs) this.viewModel).m163219Y(xxj.m213527b(z, false, z2));
    }

    /* JADX INFO: renamed from: c5 */
    private boolean m104664c5() {
        return ((nhs) this.viewModel).m163210M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d5 */
    public /* synthetic */ void m104666d5(lx50 lx50Var) {
        muj.m160163F(lx50Var);
        m104718N5();
        mo104746g6(lx50Var, false);
    }

    /* JADX INFO: renamed from: d6 */
    private void m104667d6(y20<Boolean> y20Var, y20<Boolean> y20Var2, long j) {
        ((nhs) this.viewModel).m163225g0(m213812H2().act(), y20Var, y20Var2, j);
    }

    /* JADX INFO: renamed from: h6 */
    private void m104672h6(List<Integer> list, boolean z) {
        final xxj xxjVarM104646Q4 = m104646Q4();
        if (xxjVarM104646Q4 != null) {
            xxjVarM104646Q4.m213540n(list);
            xxjVarM104646Q4.m213537k(new xxj.C21473a(true, false, z));
            l51.m152887G(new Runnable() { // from class: l.eis
                @Override // java.lang.Runnable
                public final void run() {
                    this.f94205a.m104705G5(xxjVarM104646Q4);
                }
            });
        }
    }

    /* JADX INFO: renamed from: i6 */
    private void m104674i6(boolean z) {
        final xxj xxjVarM104646Q4 = m104646Q4();
        if (xxjVarM104646Q4 != null) {
            xxjVarM104646Q4.m213537k(new xxj.C21473a(true, z, true));
            l51.m152887G(new Runnable() { // from class: l.tis
                @Override // java.lang.Runnable
                public final void run() {
                    this.f174502a.m104707H5(xxjVarM104646Q4);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m4 */
    public static /* synthetic */ void m104678m4(Integer num) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p5 */
    public /* synthetic */ void m104682p5(String str) {
        m104726S5(str, null, false, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r5 */
    public /* synthetic */ void m104685r5(r7f0 r7f0Var) {
        m104667d6(r7f0Var.m180142b(), r7f0Var.m180141a(), r7f0Var.m180143c());
    }

    /* JADX INFO: renamed from: A5 */
    public final /* synthetic */ void m104694A5(xxj xxjVar) {
        this.f77010m.put(xxjVar.m213533g(), xxjVar);
        if (isShowing()) {
            m104674i6(((nhs) this.viewModel).m163205H());
        }
    }

    /* JADX INFO: renamed from: B5 */
    public final /* synthetic */ void m104695B5(Long l2) {
        this.f77007j = l2.longValue();
    }

    /* JADX INFO: renamed from: C4 */
    public final void m104696C4(List<hzj> list) {
        Iterator<hzj> it = list.iterator();
        while (it.hasNext()) {
            Iterator<jjs> it2 = it.next().f112248a.iterator();
            while (it2.hasNext()) {
                if (it2.next().m145122h().giftSource == 1) {
                    ((nhs) this.viewModel).m163226h0();
                    return;
                }
            }
        }
        o1j0.m165651y("糟糕，背包礼物已经过期了，送点别的吧");
    }

    /* JADX INFO: renamed from: C5 */
    public final /* synthetic */ void m104697C5(kpj kpjVar) {
        orj<?> orjVar = this.f77017t;
        if (orjVar != null) {
            orjVar.m168939V3(kpjVar);
            this.f77017t.m168936S3();
        }
        ((nhs) this.viewModel).m163227i0();
        ((nhs) this.viewModel).m163218X(kpjVar);
        if (((nhs) this.viewModel).isShowing()) {
            m213811F2().GiftDialogEventGroup.giftDialogHeightChange().m199277p();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: D4 */
    public final dyj m104698D4(lx50 lx50Var) {
        String strM220589c = znc0.m220589c(this, lx50Var, mo104749j3());
        String strM202191k = m213810E2().m202191k();
        String strM202194o = m213810E2().m202194o();
        if (NullChecker.m82486a(lx50Var.m156151a())) {
            p54 p54VarM111915d = lx50Var.m156151a().m111915d();
            if (!TextUtils.isEmpty(p54VarM111915d.f150598g)) {
                strM202191k = p54VarM111915d.f150598g;
            }
            if (!TextUtils.isEmpty(p54VarM111915d.f150597f)) {
                strM202194o = p54VarM111915d.f150597f;
            }
        }
        return new dyj(strM220589c, strM202191k, strM202194o, cpj.m111801u(this.f77009l), eb20.m120149b() ? eb20.m120148a() : "");
    }

    /* JADX INFO: renamed from: D5 */
    public final /* synthetic */ void m104699D5(boolean z, List list) {
        if (z) {
            m104696C4(list);
        }
    }

    /* JADX INFO: renamed from: E4 */
    public void m104700E4() {
        mo96836O3();
        ((nhs) this.viewModel).m163230v();
    }

    @Nullable
    /* JADX INFO: renamed from: F4 */
    public abstract List<coj> mo104702F4();

    /* JADX INFO: renamed from: G4 */
    public Pair<String, cqj> mo104704G4(String str) {
        if (((nhs) this.viewModel).isShowing()) {
            return new Pair<>(this.f77009l, this.f77011n);
        }
        return null;
    }

    /* JADX INFO: renamed from: G5 */
    public final /* synthetic */ void m104705G5(xxj xxjVar) {
        ((nhs) this.viewModel).m163219Y(xxjVar);
    }

    /* JADX INFO: renamed from: H4 */
    public String m104706H4() {
        return this.f77009l;
    }

    /* JADX INFO: renamed from: H5 */
    public final /* synthetic */ void m104707H5(xxj xxjVar) {
        ((nhs) this.viewModel).m163219Y(xxjVar);
    }

    /* JADX INFO: renamed from: I4 */
    public int m104708I4() {
        return ((nhs) this.viewModel).m163232y();
    }

    /* JADX INFO: renamed from: I5 */
    public final /* synthetic */ void m104709I5(BLiveType bLiveType, Pair pair) {
        this.f77020w = pair;
        if (!TextUtils.equals(bLiveType.toString(), "live")) {
            ere.m122146i().m122164v(pair);
        } else {
            ((xxj) this.f77020w.second).m213538l("live");
            ere.m122146i().m122161s(pair);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: J4 */
    public cqj mo104710J4() {
        return null;
    }

    /* JADX INFO: renamed from: K4 */
    public abstract String mo104711K4();

    /* JADX INFO: renamed from: K5 */
    public void m104712K5() {
        if (((nhs) this.viewModel).isShowing()) {
            m213811F2().GiftDialogEventGroup.giftDialogHeightChange().m199277p();
        }
    }

    /* JADX INFO: renamed from: L4 */
    public e060 m104713L4() {
        return ((nhs) this.viewModel).m163200B();
    }

    /* JADX INFO: renamed from: L5 */
    public void m104714L5(jjs jjsVar) {
        orj<?> orjVar = this.f77017t;
        if (orjVar != null) {
            orjVar.m168937T3(jjsVar.m145122h().f45225id);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: M4 */
    public cqj m104715M4() {
        return this.f77011n;
    }

    /* JADX INFO: renamed from: M5 */
    public void m104716M5(int i, hzj hzjVar) {
        orj<?> orjVar = this.f77017t;
        if (orjVar != null) {
            orjVar.m168938U3(hzjVar.f112249b);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: N4 */
    public final nqj.C18926a m104717N4() {
        orj<?> orjVar;
        V v2 = this.viewModel;
        int iM175859d = (v2 == 0 || !((nhs) v2).m163207J()) ? 0 : qa00.m175859d(46.0f);
        V v3 = this.viewModel;
        if (v3 != 0 && ((nhs) v3).m163204G() && (orjVar = this.f77017t) != null) {
            iM175859d += orjVar.m168933N3();
        }
        V v4 = this.viewModel;
        if (v4 != 0 && ((nhs) v4).m163208K()) {
            iM175859d += ((nhs) this.viewModel).m163203F();
        }
        V v5 = this.viewModel;
        if (v5 != 0 && ((nhs) v5).m163206I()) {
            iM175859d += ((nhs) this.viewModel).m163202E();
        }
        int iM175859d2 = iM175859d + qa00.m175859d(10.0f);
        return new nqj.C18926a(qa00.m175859d(318.0f) + iM175859d2, iM175859d2);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2] */
    /* JADX INFO: renamed from: N5 */
    public void m104718N5() {
        if (this.f77020w != null) {
            ere.m122146i().mo122147a(this.f77020w, m213810E2().mo118362A0());
        }
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: O3 */
    public void mo96836O3() {
        super.mo96836O3();
        List<hzj> listM104724R4 = m104724R4(true);
        if (listM104724R4 != null) {
            cpj.m111779O(listM104724R4);
        }
        m213811F2().GiftDialogEventGroup.giftDialogStatus().mo199273j(Boolean.FALSE);
        this.f77013p = "";
        this.f77015r = true;
        l0k.m152354h();
        r230.m179477s();
        System.gc();
    }

    @Nullable
    /* JADX INFO: renamed from: O4 */
    public qul m104719O4(String str) {
        GiftItemAnimType giftItemAnimTypeValueOf;
        if (this.f77012o == null) {
            this.f77012o = new HashMap();
        }
        qul qulVar = this.f77012o.get(str);
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
        this.f77012o.put(str, controller);
        return controller;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX INFO: renamed from: O5 */
    public final void m104720O5(lx50 lx50Var) {
        this.f77019v = lx50Var;
        duringCreated(C22421c.zip(aiv.m98120n1(m104698D4(lx50Var)), aiv.m98123o1(m213810E2().mo118362A0()), new rcj() { // from class: l.nis
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return new kpj((List) obj, (BLiveHierarchyProgress) obj2);
            }
        })).subscribe(dhw.m115829h(new y20() { // from class: l.ois
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147578a.m104697C5((kpj) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P4 */
    public String m104721P4() {
        cqj cqjVar = this.f77011n;
        return (cqjVar == null || TextUtils.isEmpty(cqjVar.m111916e())) ? mo104749j3() : this.f77011n.m111916e();
    }

    /* JADX INFO: renamed from: P5 */
    public void mo104722P5(GiftDialogContentView giftDialogContentView) {
        m153103z2(new djs(this.f196918e, giftDialogContentView.f51123k));
        m153103z2(new vpj(this.f196918e, giftDialogContentView.f51129q));
        if (vxr.m203876d().m170980I0()) {
            m153103z2(new tln(this.f196918e, this));
        }
        this.f77016s = (vuj) m153103z2(new vuj(this.f196918e, giftDialogContentView.f51131s, giftDialogContentView.f51130r));
        this.f77017t = (orj) m153103z2(new orj(this.f196918e, giftDialogContentView.f51117e, giftDialogContentView.f51118f, giftDialogContentView.f51119g));
    }

    /* JADX INFO: renamed from: Q5 */
    public final void m104723Q5(Long l2) {
        if (((nhs) this.viewModel).isShowing() && ((nhs) this.viewModel).m163211N()) {
            m104753k6(l2);
            return;
        }
        if (l2.longValue() <= ((civ) zrv.m221194l(htd0.f111524f)).m109968l().longValue()) {
            m213811F2().BottomEvent.refreshGiftRedDot().mo199273j(Boolean.FALSE);
            ((nhs) this.viewModel).m163224f0(false);
        } else {
            m213811F2().BottomEvent.refreshGiftRedDot().mo199273j(Boolean.TRUE);
            ((nhs) this.viewModel).m163224f0(true);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: R4 */
    public final List<hzj> m104724R4(boolean z) {
        xxj xxjVarM104646Q4 = m104646Q4();
        if (xxjVarM104646Q4 == null) {
            return null;
        }
        List<hzj> listM221999f = z ? xxjVarM104646Q4.m213531e().m221999f() : xxjVarM104646Q4.m213530d().m221999f();
        if (jyb.m147479J(listM221999f)) {
            return null;
        }
        return listM221999f;
    }

    /* JADX INFO: renamed from: R5 */
    public void m104725R5() {
        lx50 lx50Var;
        if (!this.f77018u || (lx50Var = this.f77019v) == null) {
            return;
        }
        this.f77018u = false;
        m104720O5(lx50Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r8v1, types: [l.oo2] */
    /* JADX INFO: renamed from: S5 */
    public final void m104726S5(String str, x20 x20Var, final boolean z, int i) {
        m104731V5();
        String strM202194o = m213810E2().m202194o();
        String strMo104749j3 = mo104749j3();
        if (bf10.m103808N(this) && NullChecker.m82486a(this.f77011n) && !TextUtils.isEmpty(this.f77011n.m111916e())) {
            strMo104749j3 = this.f77011n.m111916e();
            BLiveMultiCall bLiveMultiCallM103799E = bf10.m103799E(this, strMo104749j3);
            if (NullChecker.m82486a(bLiveMultiCallM103799E)) {
                strM202194o = bLiveMultiCallM103799E.roomId;
            }
        }
        if (i == 1503) {
            ((nhs) this.viewModel).m163233z().m75583q0(false);
            ((nhs) this.viewModel).m163233z().m75590y0(true);
            m213811F2().GiftDialogEventGroup.onGiftDialogPanelSwitchChange().mo199273j(new cwj(true));
        }
        m213810E2().m168445A1(new uxj.C20693a(strM202194o, mc50.m157912R2(m213810E2(), strMo104749j3), this.f77009l).m198496h(str).m198495g(x20Var).m198494f(), new y20() { // from class: l.fis
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99234a.m104699D5(z, (List) obj);
            }
        });
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        ((nhs) this.viewModel).m163209L(act());
        m138863h3(m213811F2().GiftDialogEventGroup.openGiftDialogEvent(), new y20() { // from class: l.phs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152470a.m104666d5((lx50) obj);
            }
        });
        m138863h3(m213811F2().GiftDialogEventGroup.switchGiftDialogSourceEvent(), new y20() { // from class: l.rhs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163196a.m104741e5((lx50) obj);
            }
        });
        duringCreated((C22421c<T>) m213811F2().GiftDialogEventGroup.reloadGiftByPositionGiftId().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.uhs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179051a.m104682p5((String) obj);
            }
        }));
        duringCreated((C22421c<T>) m213811F2().GiftDialogEventGroup.showSendFirstGiftDlg().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.vhs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184188a.m104685r5((r7f0) obj);
            }
        }));
        duringCreated((C22421c<T>) m213811F2().GiftDialogEventGroup.reloadGift().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.whs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189191a.m104761s5((Integer) obj);
            }
        }));
        duringCreated((C22421c<T>) m213811F2().GiftDialogEventGroup.reloadGiftWithAction().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.xhs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194399a.m104762t5((pf60) obj);
            }
        }));
        duringCreated((C22421c<T>) m213811F2().GiftDialogEventGroup.dismissGiftDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.yhs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f199984a.m104763u5((Integer) obj);
            }
        }));
        duringCreated((C22421c<T>) m213811F2().GiftDialogEventGroup.switchPacketPanel().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.zhs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204458a.m104764v5((Integer) obj);
            }
        }));
        duringCreated((C22421c<T>) m213811F2().GiftDialogEventGroup.onSengGiftFromMultipleGift().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.bis
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76909a.m104730V4((jne0) obj);
            }
        }));
        duringCreated((C22421c<T>) m213811F2().GiftDialogEventGroup.updateItemModelAfterSendGift().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.cis
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f81983a.m104765w5((f1k0) obj);
            }
        }));
        m138860d3(pxj.class, new qcj() { // from class: l.ais
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f71573a.m104766x5((pxj) obj);
            }
        });
        m138860d3(ywj.class, new qcj() { // from class: l.lis
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f132248a.m104743f5((ywj) obj);
            }
        });
        m138860d3(eyj.class, new qcj() { // from class: l.uis
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f179143a.m104745g5((eyj) obj);
            }
        });
        m138860d3(xpj.class, new qcj() { // from class: l.vis
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f184299a.m104747h5((xpj) obj);
            }
        });
        m138860d3(vf3.C20828d.class, new qcj() { // from class: l.wis
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f189383a.m104748i5((vf3.C20828d) obj);
            }
        });
        m138860d3(nqj.class, new qcj() { // from class: l.xis
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f194493a.m104750j5((nqj) obj);
            }
        });
        m138860d3(csj.class, new qcj() { // from class: l.yis
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f200237a.m104752k5((csj) obj);
            }
        });
        m138860d3(oqj.class, new qcj() { // from class: l.zis
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f204601a.m104754l5((oqj) obj);
            }
        });
        m138860d3(eqj.class, new qcj() { // from class: l.ajs
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f71861a.m104756m5((eqj) obj);
            }
        });
        m138860d3(pqj.class, new qcj() { // from class: l.qhs
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f157749a.m104758n5((pqj) obj);
            }
        });
        m138860d3(wrj.class, new qcj() { // from class: l.shs
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f168741a.m104759o5((wrj) obj);
            }
        });
        m138860d3(y7s.class, new qcj() { // from class: l.ths
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f174412a.m104760q5((y7s) obj);
            }
        });
        l0k.m152351d();
        m104731V5();
    }

    /* JADX INFO: renamed from: T4 */
    public final void m104727T4() {
        if (!((Boolean) m138856F3(new hv70(700))).booleanValue() || this.f77014q) {
            return;
        }
        this.f77014q = true;
        o1j0.m165620B(zrv.m221193k().m203523T4(), false, true);
    }

    /* JADX INFO: renamed from: T5 */
    public void m104728T5(boolean z) {
        m104729U5(z, -1);
    }

    /* JADX INFO: renamed from: U5 */
    public void m104729U5(boolean z, int i) {
        m104726S5(isShowing() ? this.f77013p : "", null, z && (1501 == i || 1502 == i), i);
    }

    /* JADX INFO: renamed from: V4 */
    public final void m104730V4(jne0 jne0Var) {
        final jjs jjsVarM146241d = jne0Var.m146241d();
        LiveGiftItemView liveGiftItemViewM146238a = jne0Var.m146238a();
        final int iM146240c = jne0Var.m146240c();
        final int iM146239b = jne0Var.m146239b();
        String strValueOf = jjsVarM146241d.m145122h().isPaidGift() ? String.valueOf(m104738a5(f3e.m123725d(jjsVarM146241d.m145122h(), iM146239b))) : "NA";
        m104732W5(jjsVarM146241d, liveGiftItemViewM146238a, new y20() { // from class: l.mis
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137010a.m104767y5(jjsVarM146241d, iM146240c, iM146239b, (BLiveGivenGiftBrief) obj);
            }
        }, iM146239b, iM146240c, false, null);
        qzj.m178793j(this, jjsVarM146241d, iM146240c, strValueOf, mo78457R2(), iM146239b, "batch", m104721P4(), false);
    }

    /* JADX INFO: renamed from: V5 */
    public final void m104731V5() {
        duringCreated((C22421c<T>) aiv.m98126p1()).subscribe(dhw.m115829h(new y20() { // from class: l.kis
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127022a.m104757m6((BLiveUserLevel) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W5 */
    public void m104732W5(final jjs jjsVar, final LiveGiftItemView liveGiftItemView, @Nullable final y20<BLiveGivenGiftBrief> y20Var, int i, final int i2, final boolean z, @Nullable stj stjVar) {
        final BLiveGiftItem bLiveGiftItemM145122h = jjsVar.m145122h();
        uoe0 uoe0VarM196974d = uoe0.m196974d(String.valueOf(bLiveGiftItemM145122h.f45225id), bLiveGiftItemM145122h, new y20() { // from class: l.pis
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152604a.m104701E5(bLiveGiftItemM145122h, jjsVar, liveGiftItemView, y20Var, i2, z, (BLiveGivenGiftBrief) obj);
            }
        }, new y20() { // from class: l.qis
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157860a.m104703F5(liveGiftItemView, bLiveGiftItemM145122h, (Throwable) obj);
            }
        }, new y20() { // from class: l.ris
            @Override // p153l.y20
            public final void call(Object obj) {
                bjs.m104678m4((Integer) obj);
            }
        }, false, i, this.f77009l, this.f77011n, cpj.m111772H(bLiveGiftItemM145122h, jjsVar, i2));
        if (stjVar != null) {
            toe0.m192020a(uoe0VarM196974d, stjVar);
        }
        xoe0.m212465a(this, uoe0VarM196974d, new y20() { // from class: l.sis
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f168864a.m104734X5((uoe0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X4 */
    public boolean m104733X4() {
        orj<?> orjVar = this.f77017t;
        return orjVar != null && orjVar.m168934O3();
    }

    /* JADX INFO: renamed from: X5 */
    public void m104734X5(uoe0 uoe0Var) {
        m213811F2().SendGiftEventGroup.sendGift().mo199273j(new hne0.C17513a().m136088y(uoe0Var));
    }

    /* JADX INFO: renamed from: Y4 */
    public void m104735Y4() {
        m213811F2().GiftDialogEventGroup.hideGiftOperationLayer().m199277p();
    }

    /* JADX INFO: renamed from: Y5 */
    public void m104736Y5(String str) {
        this.f77013p = str;
    }

    /* JADX INFO: renamed from: Z5 */
    public void m104737Z5(lx50 lx50Var, boolean z) {
        aiv.m98111k1().subscribe(dhw.m115824c());
        ((nhs) this.viewModel).m163223e0();
        mo96837P3();
        m104672h6(lx50Var.m156155e(), z);
        m104727T4();
        m213811F2().GiftDialogEventGroup.giftDialogStatus().mo199273j(Boolean.TRUE);
        if (this.f77015r) {
            m104729U5(true, lx50Var.m156152b());
            this.f77015r = false;
        }
        m104720O5(lx50Var);
        m104735Y4();
    }

    /* JADX INFO: renamed from: a5 */
    public boolean m104738a5(double d) {
        return ((double) this.f77007j) >= d;
    }

    /* JADX INFO: renamed from: a6 */
    public void m104739a6(jjs jjsVar) {
        ((nhs) this.viewModel).m163222d0(cpj.m111769E(jjsVar, m104724R4(false)), this.f77009l);
    }

    /* JADX INFO: renamed from: c6 */
    public void m104740c6(jjs jjsVar, LiveGiftItemView liveGiftItemView, int i) {
        if (m104648S4() == null) {
            return;
        }
        if (this.f77008k == null) {
            this.f77008k = new gd60(this);
        }
        this.f77008k.m129920e(this.f196919f, jjsVar, liveGiftItemView, i);
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ void m104741e5(lx50 lx50Var) {
        mo104746g6(lx50Var, true);
        m104751j6();
    }

    /* JADX INFO: renamed from: e6 */
    public void m104742e6(jjs jjsVar, qxj qxjVar) {
        m213811F2().UpgradeGiftEvent.showUpgradeDialog().mo199273j(new x1k0.C21229a(700).m209090d(jjsVar).m209091e(qxjVar).m209089c());
    }

    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ String m104743f5(ywj ywjVar) {
        return m104721P4();
    }

    /* JADX INFO: renamed from: f6 */
    public void m104744f6() {
        ((nhs) this.viewModel).m163226h0();
    }

    /* JADX INFO: renamed from: g5 */
    public final /* synthetic */ String m104745g5(eyj eyjVar) {
        return m104706H4();
    }

    /* JADX INFO: renamed from: g6 */
    public void mo104746g6(lx50 lx50Var, boolean z) {
        String strM156153c = lx50Var.m156153c();
        cqj cqjVarM156151a = lx50Var.m156151a();
        if (TextUtils.equals(strM156153c, "default")) {
            strM156153c = mo104711K4();
            cqjVarM156151a = mo104710J4();
        }
        if (lx50Var.m156152b() == 1000 && cqjVarM156151a != null) {
            cqjVarM156151a.m111918g().f82889e.f107997a = "";
        }
        ((nhs) this.viewModel).m163221c0(cqjVarM156151a, lx50Var.m156152b());
        if (!TextUtils.equals(this.f77009l, strM156153c)) {
            m104662b6(false, z);
        }
        this.f77009l = strM156153c;
        this.f77011n = cqjVarM156151a;
        m104737Z5(lx50Var, z);
    }

    /* JADX INFO: renamed from: h5 */
    public final /* synthetic */ Boolean m104747h5(xpj xpjVar) {
        return Boolean.valueOf(m104738a5(xpjVar.f195711c));
    }

    /* JADX INFO: renamed from: i5 */
    public final /* synthetic */ AbstractC17128g4.a m104748i5(vf3.C20828d c20828d) {
        return ((nhs) this.viewModel).m163231x();
    }

    public boolean isShowing() {
        return ((nhs) this.viewModel).isShowing();
    }

    @Override // p153l.i6t
    /* JADX INFO: renamed from: j3 */
    public abstract String mo104749j3();

    /* JADX INFO: renamed from: j5 */
    public final /* synthetic */ nqj.C18926a m104750j5(nqj nqjVar) {
        return m104717N4();
    }

    /* JADX INFO: renamed from: j6 */
    public void m104751j6() {
        if (m104646Q4() == null || bf10.m103808N(this)) {
            m104728T5(false);
        }
    }

    /* JADX INFO: renamed from: k5 */
    public final /* synthetic */ wpj m104752k5(csj csjVar) {
        return new wpj(mo104711K4(), mo104710J4());
    }

    /* JADX INFO: renamed from: k6 */
    public final void m104753k6(Long l2) {
        ((civ) zrv.m221194l(htd0.f111524f)).m109975s(l2);
    }

    /* JADX INFO: renamed from: l5 */
    public final /* synthetic */ Pair m104754l5(oqj oqjVar) {
        return mo104704G4(oqjVar.f148597c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: l6 */
    public void m104755l6() {
        m213810E2().m168466M1(m213810E2().m202191k(), m213810E2().m202194o());
    }

    /* JADX INFO: renamed from: m5 */
    public final /* synthetic */ e060 m104756m5(eqj eqjVar) {
        return ((nhs) this.viewModel).m163200B();
    }

    /* JADX INFO: renamed from: m6 */
    public final void m104757m6(BLiveUserLevel bLiveUserLevel) {
        LiveUserLevel liveUserLevel;
        User userM144722i = ((jfv) zrv.m221194l(htd0.f111520b)).m144722i(zrv.f205799a.m207631D0());
        if (userM144722i == null || (liveUserLevel = userM144722i.hierarchy) == null || bLiveUserLevel == null) {
            return;
        }
        liveUserLevel.grade = bLiveUserLevel.grade;
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m104645J5();
        this.f77014q = false;
        this.f77018u = false;
        this.f77019v = null;
        l0k.m152349b();
        osj.m169050c().m169051a();
    }

    /* JADX INFO: renamed from: n5 */
    public final /* synthetic */ Boolean m104758n5(pqj pqjVar) {
        return Boolean.valueOf(isShowing());
    }

    /* JADX INFO: renamed from: o5 */
    public final /* synthetic */ View m104759o5(wrj wrjVar) {
        return ((nhs) this.viewModel).m163199A();
    }

    /* JADX INFO: renamed from: q5 */
    public final /* synthetic */ BLiveWealthButton m104760q5(y7s y7sVar) {
        return ((nhs) this.viewModel).m163201C();
    }

    /* JADX INFO: renamed from: s5 */
    public final /* synthetic */ void m104761s5(Integer num) {
        m104728T5(false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r3v0, types: [l.oo2, l.vp20] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m104728T5(false);
        m213810E2().m168461J1().subscribe(dhw.m115824c());
        htd0<hiv> htd0Var = htd0.f111521c;
        ((hiv) zrv.m221194l(htd0Var)).m135142B();
        final BLiveType bLiveType = m213810E2().mo118362A0().equals("live") ? BLiveType.get("live") : BLiveType.get(BLiveType.voiceLive);
        ere.m122146i().m122168z(m213810E2().m202194o(), mo104749j3(), bLiveType);
        duringCreated(C22421c.zip(((hiv) zrv.m221194l(htd0Var)).m135165q().onErrorReturn(null), ((hiv) zrv.m221194l(htd0Var)).m135167s().onErrorReturn(null), new dlu()).observeOn(Schedulers.m222739io())).onBackpressureLatest().compose(psd0.m173592C()).subscribe(dhw.m115829h(new y20() { // from class: l.dis
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f88705a.m104709I5(bLiveType, (Pair) obj);
            }
        }));
        m104658Z4();
    }

    /* JADX INFO: renamed from: t5 */
    public final /* synthetic */ void m104762t5(pf60 pf60Var) {
        m104726S5(isShowing() ? this.f77013p : "", (x20) pf60Var.f152157b, false, -1);
    }

    /* JADX INFO: renamed from: u5 */
    public final /* synthetic */ void m104763u5(Integer num) {
        m104700E4();
    }

    /* JADX INFO: renamed from: v5 */
    public final /* synthetic */ void m104764v5(Integer num) {
        m104744f6();
    }

    /* JADX INFO: renamed from: w5 */
    public final /* synthetic */ void m104765w5(f1k0 f1k0Var) {
        ((nhs) this.viewModel).m163228j0(f1k0Var.getItemModel(), f1k0Var.getBrief());
    }

    /* JADX INFO: renamed from: x5 */
    public final /* synthetic */ Boolean m104766x5(pxj pxjVar) {
        return Boolean.valueOf(m104664c5());
    }

    /* JADX INFO: renamed from: y5 */
    public final /* synthetic */ void m104767y5(jjs jjsVar, int i, int i2, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        qzj.m178801r(this, jjsVar, i, bLiveGivenGiftBrief, mo78457R2(), i2, "batch", m104721P4(), false);
    }

    /* JADX INFO: renamed from: z5 */
    public final /* synthetic */ Boolean m104768z5(xxj xxjVar) {
        if (isShowing() && m104661b5(xxjVar)) {
            m104662b6(true, true);
        }
        return Boolean.valueOf(xxjVar.m213536j());
    }
}
