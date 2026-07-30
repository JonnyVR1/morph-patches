package p149l;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.LiveUserLevel;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveHierarchyProgress;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.base.data.BLiveResourceInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveType;
import com.p046p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p046p1.mobile.putong.live.base.data.BLiveWealthButton;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.anim.GiftItemAnimType;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogContentView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ahs<T extends ho2> extends x6s<T, mfs> {

    /* JADX INFO: renamed from: j */
    public long f69686j;

    /* JADX INFO: renamed from: k */
    public a560 f69687k;

    /* JADX INFO: renamed from: l */
    public String f69688l;

    /* JADX INFO: renamed from: m */
    public final Map<String, hvj> f69689m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public mnj f69690n;

    /* JADX INFO: renamed from: o */
    public Map<String, csl> f69691o;

    /* JADX INFO: renamed from: p */
    public String f69692p;

    /* JADX INFO: renamed from: q */
    public boolean f69693q;

    /* JADX INFO: renamed from: r */
    public boolean f69694r;

    /* JADX INFO: renamed from: s */
    public fsj<?> f69695s;

    /* JADX INFO: renamed from: t */
    public yoj<?> f69696t;

    /* JADX INFO: renamed from: u */
    public boolean f69697u;

    /* JADX INFO: renamed from: v */
    public fp50 f69698v;

    /* JADX INFO: renamed from: w */
    public Pair<BLiveResourceInfo, hvj> f69699w;

    public ahs(bsm<T> bsmVar) {
        super(bsmVar);
        this.f69688l = mo96624K4();
        this.f69689m = new HashMap();
        this.f69694r = true;
        this.f69697u = false;
        mo51532C(new mfs());
    }

    /* JADX INFO: renamed from: J5 */
    private void m96558J5() {
        Map<String, csl> map = this.f69691o;
        if (map == null) {
            return;
        }
        vwb.m200354z(map.values(), new aju());
    }

    @Nullable
    /* JADX INFO: renamed from: Q4 */
    private hvj m96559Q4() {
        return this.f69689m.get(this.f69688l);
    }

    /* JADX INFO: renamed from: S4 */
    private Act m96561S4() {
        Act act = act();
        if (act == null || act.isFinishing()) {
            return null;
        }
        return act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U4, reason: merged with bridge method [inline-methods] */
    public void m96616F5(Throwable th, LiveGiftItemView liveGiftItemView, BLiveGiftItem bLiveGiftItem) {
        if (bLiveGiftItem.isPacketGift()) {
            boolean z = th instanceof TantanException.Client.CoreService;
            if (z && ((TantanException.Client.CoreService) th).code == 41201) {
                liveGiftItemView.m73487p1(0);
            } else if (z && ((TantanException.Client.CoreService) th).code == 41202) {
                liveGiftItemView.m73487p1(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W4, reason: merged with bridge method [inline-methods] */
    public void m96614E5(BLiveGiftItem bLiveGiftItem, ihs ihsVar, LiveGiftItemView liveGiftItemView, BLiveGivenGiftBrief bLiveGivenGiftBrief, @Nullable e30<BLiveGivenGiftBrief> e30Var, int i, boolean z) {
        ihsVar.m136298w(bLiveGivenGiftBrief);
        if (liveGiftItemView != null) {
            ((mfs) this.viewModel).m154459j0(ihsVar, bLiveGivenGiftBrief);
            liveGiftItemView.m73484l1(ihsVar, bLiveGivenGiftBrief);
            if (e30Var != null) {
                e30Var.call(bLiveGivenGiftBrief);
            }
            mb0 mb0Var = new mb0(liveGiftItemView, ihsVar, i, z, ((mfs) this.viewModel).m154431B());
            if (uvr.m196087d().m162673I0() && !ihsVar.m136294s()) {
                m206028F2().IntlGiftComboEvent.comboEvent().mo172463j(mb0Var);
            }
            if (isShowing()) {
                this.f69695s.m122949T3(mb0Var);
            }
            if (bLiveGiftItem.mobileVibration) {
                xxj.m211506g(liveGiftItemView.getContext());
            }
        }
    }

    /* JADX INFO: renamed from: Z4 */
    private void m96571Z4() {
        duringCreated((C22306c<T>) m206027E2().m132083P0()).filter(new w9j() { // from class: l.fgs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f97399a.m96681z5((hvj) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.ggs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102532a.m96607A5((hvj) obj);
            }
        }));
        duringCreated((C22306c<T>) m206027E2().m132166t1()).subscribe(ffw.m121193d(new e30() { // from class: l.hgs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f107644a.m96608B5((Long) obj);
            }
        }));
        duringCreated((C22306c<T>) m206027E2().m132085Q0()).subscribe(ffw.m121193d(new e30() { // from class: l.igs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113163a.m96636Q5((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b5 */
    private boolean m96574b5(hvj hvjVar) {
        hvj hvjVar2 = this.f69689m.get(hvjVar.m133174g());
        return hvjVar2 == null || vwb.m200296J(hvjVar2.m133171d().m143509f());
    }

    /* JADX INFO: renamed from: b6 */
    private void m96575b6(boolean z, boolean z2) {
        ((mfs) this.viewModel).m154450Y(hvj.m133168b(z, false, z2));
    }

    /* JADX INFO: renamed from: c5 */
    private boolean m96577c5() {
        return ((mfs) this.viewModel).m154441M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d5 */
    public /* synthetic */ void m96579d5(fp50 fp50Var) {
        wrj.m205199F(fp50Var);
        m96631N5();
        mo96659g6(fp50Var, false);
    }

    /* JADX INFO: renamed from: d6 */
    private void m96580d6(e30<Boolean> e30Var, e30<Boolean> e30Var2, long j) {
        ((mfs) this.viewModel).m154456g0(m206029H2().act(), e30Var, e30Var2, j);
    }

    /* JADX INFO: renamed from: h6 */
    private void m96585h6(List<Integer> list, boolean z) {
        final hvj hvjVarM96559Q4 = m96559Q4();
        if (hvjVarM96559Q4 != null) {
            hvjVarM96559Q4.m133181n(list);
            hvjVarM96559Q4.m133178k(new hvj.C17412a(true, false, z));
            e51.m114742G(new Runnable() { // from class: l.dgs
                @Override // java.lang.Runnable
                public final void run() {
                    this.f86163a.m96618G5(hvjVarM96559Q4);
                }
            });
        }
    }

    /* JADX INFO: renamed from: i6 */
    private void m96587i6(boolean z) {
        final hvj hvjVarM96559Q4 = m96559Q4();
        if (hvjVarM96559Q4 != null) {
            hvjVarM96559Q4.m133178k(new hvj.C17412a(true, z, true));
            e51.m114742G(new Runnable() { // from class: l.sgs
                @Override // java.lang.Runnable
                public final void run() {
                    this.f164476a.m96620H5(hvjVarM96559Q4);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m4 */
    public static /* synthetic */ void m96591m4(Integer num) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p5 */
    public /* synthetic */ void m96595p5(String str) {
        m96639S5(str, null, false, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r5 */
    public /* synthetic */ void m96598r5(kze0 kze0Var) {
        m96580d6(kze0Var.m147944b(), kze0Var.m147943a(), kze0Var.m147945c());
    }

    /* JADX INFO: renamed from: A5 */
    public final /* synthetic */ void m96607A5(hvj hvjVar) {
        this.f69689m.put(hvjVar.m133174g(), hvjVar);
        if (isShowing()) {
            m96587i6(((mfs) this.viewModel).m154436H());
        }
    }

    /* JADX INFO: renamed from: B5 */
    public final /* synthetic */ void m96608B5(Long l2) {
        this.f69686j = l2.longValue();
    }

    /* JADX INFO: renamed from: C4 */
    public final void m96609C4(List<rwj> list) {
        Iterator<rwj> it = list.iterator();
        while (it.hasNext()) {
            Iterator<ihs> it2 = it.next().f161338a.iterator();
            while (it2.hasNext()) {
                if (it2.next().m136283h().giftSource == 1) {
                    ((mfs) this.viewModel).m154457h0();
                    return;
                }
            }
        }
        lsi0.m151595y("糟糕，背包礼物已经过期了，送点别的吧");
    }

    /* JADX INFO: renamed from: C5 */
    public final /* synthetic */ void m96610C5(umj umjVar) {
        yoj<?> yojVar = this.f69696t;
        if (yojVar != null) {
            yojVar.m215524V3(umjVar);
            this.f69696t.m215521S3();
        }
        ((mfs) this.viewModel).m154458i0();
        ((mfs) this.viewModel).m154449X(umjVar);
        if (((mfs) this.viewModel).isShowing()) {
            m206028F2().GiftDialogEventGroup.giftDialogHeightChange().m172467p();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: D4 */
    public final nvj m96611D4(fp50 fp50Var) {
        String strM183906c = sfc0.m183906c(this, fp50Var, mo96662j3());
        String strM149814k = m206027E2().m149814k();
        String strM149818o = m206027E2().m149818o();
        if (NullChecker.m81303a(fp50Var.m122557a())) {
            q44 q44VarM155515d = fp50Var.m122557a().m155515d();
            if (!TextUtils.isEmpty(q44VarM155515d.f152543g)) {
                strM149814k = q44VarM155515d.f152543g;
            }
            if (!TextUtils.isEmpty(q44VarM155515d.f152542f)) {
                strM149818o = q44VarM155515d.f152542f;
            }
        }
        return new nvj(strM183906c, strM149814k, strM149818o, mmj.m155434u(this.f69688l), w220.m201015b() ? w220.m201014a() : "");
    }

    /* JADX INFO: renamed from: D5 */
    public final /* synthetic */ void m96612D5(boolean z, List list) {
        if (z) {
            m96609C4(list);
        }
    }

    /* JADX INFO: renamed from: E4 */
    public void m96613E4() {
        mo94471O3();
        ((mfs) this.viewModel).m154461v();
    }

    @Nullable
    /* JADX INFO: renamed from: F4 */
    public abstract List<mlj> mo96615F4();

    /* JADX INFO: renamed from: G4 */
    public Pair<String, mnj> mo96617G4(String str) {
        if (((mfs) this.viewModel).isShowing()) {
            return new Pair<>(this.f69688l, this.f69690n);
        }
        return null;
    }

    /* JADX INFO: renamed from: G5 */
    public final /* synthetic */ void m96618G5(hvj hvjVar) {
        ((mfs) this.viewModel).m154450Y(hvjVar);
    }

    /* JADX INFO: renamed from: H4 */
    public String m96619H4() {
        return this.f69688l;
    }

    /* JADX INFO: renamed from: H5 */
    public final /* synthetic */ void m96620H5(hvj hvjVar) {
        ((mfs) this.viewModel).m154450Y(hvjVar);
    }

    /* JADX INFO: renamed from: I4 */
    public int m96621I4() {
        return ((mfs) this.viewModel).m154463y();
    }

    /* JADX INFO: renamed from: I5 */
    public final /* synthetic */ void m96622I5(BLiveType bLiveType, Pair pair) {
        this.f69699w = pair;
        if (!TextUtils.equals(bLiveType.toString(), "live")) {
            aqe.m98261i().m98279v(pair);
        } else {
            ((hvj) this.f69699w.second).m133179l("live");
            aqe.m98261i().m98276s(pair);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: J4 */
    public mnj mo96623J4() {
        return null;
    }

    /* JADX INFO: renamed from: K4 */
    public abstract String mo96624K4();

    /* JADX INFO: renamed from: K5 */
    public void m96625K5() {
        if (((mfs) this.viewModel).isShowing()) {
            m206028F2().GiftDialogEventGroup.giftDialogHeightChange().m172467p();
        }
    }

    /* JADX INFO: renamed from: L4 */
    public yr50 m96626L4() {
        return ((mfs) this.viewModel).m154431B();
    }

    /* JADX INFO: renamed from: L5 */
    public void m96627L5(ihs ihsVar) {
        yoj<?> yojVar = this.f69696t;
        if (yojVar != null) {
            yojVar.m215522T3(ihsVar.m136283h().f44377id);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: M4 */
    public mnj m96628M4() {
        return this.f69690n;
    }

    /* JADX INFO: renamed from: M5 */
    public void m96629M5(int i, rwj rwjVar) {
        yoj<?> yojVar = this.f69696t;
        if (yojVar != null) {
            yojVar.m215523U3(rwjVar.f161339b);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: N4 */
    public final xnj.C21181a m96630N4() {
        yoj<?> yojVar;
        V v2 = this.viewModel;
        int iM186890d = (v2 == 0 || !((mfs) v2).m154438J()) ? 0 : t100.m186890d(46.0f);
        V v3 = this.viewModel;
        if (v3 != 0 && ((mfs) v3).m154435G() && (yojVar = this.f69696t) != null) {
            iM186890d += yojVar.m215518N3();
        }
        V v4 = this.viewModel;
        if (v4 != 0 && ((mfs) v4).m154439K()) {
            iM186890d += ((mfs) this.viewModel).m154434F();
        }
        V v5 = this.viewModel;
        if (v5 != 0 && ((mfs) v5).m154437I()) {
            iM186890d += ((mfs) this.viewModel).m154433E();
        }
        int iM186890d2 = iM186890d + t100.m186890d(10.0f);
        return new xnj.C21181a(t100.m186890d(318.0f) + iM186890d2, iM186890d2);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: N5 */
    public void m96631N5() {
        if (this.f69699w != null) {
            aqe.m98261i().mo98262a(this.f69699w, m206027E2().mo132054A0());
        }
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo94471O3() {
        super.mo94471O3();
        List<rwj> listM96637R4 = m96637R4(true);
        if (listM96637R4 != null) {
            mmj.m155412O(listM96637R4);
        }
        m206028F2().GiftDialogEventGroup.giftDialogStatus().mo172463j(Boolean.FALSE);
        this.f69692p = "";
        this.f69694r = true;
        vxj.m200568h();
        hu20.m132972s();
        System.gc();
    }

    @Nullable
    /* JADX INFO: renamed from: O4 */
    public csl m96632O4(String str) {
        GiftItemAnimType giftItemAnimTypeValueOf;
        if (this.f69691o == null) {
            this.f69691o = new HashMap();
        }
        csl cslVar = this.f69691o.get(str);
        if (cslVar != null) {
            return cslVar;
        }
        try {
            giftItemAnimTypeValueOf = GiftItemAnimType.valueOf(str);
        } catch (Exception unused) {
            giftItemAnimTypeValueOf = null;
        }
        if (giftItemAnimTypeValueOf == null) {
            return null;
        }
        csl controller = giftItemAnimTypeValueOf.getController();
        this.f69691o.put(str, controller);
        return controller;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: O5 */
    public final void m96633O5(fp50 fp50Var) {
        this.f69698v = fp50Var;
        duringCreated(C22306c.zip(zfv.m218586n1(m96611D4(fp50Var)), zfv.m218589o1(m206027E2().mo132054A0()), new x9j() { // from class: l.mgs
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return new umj((List) obj, (BLiveHierarchyProgress) obj2);
            }
        })).subscribe(ffw.m121197h(new e30() { // from class: l.ngs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138904a.m96610C5((umj) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P4 */
    public String m96634P4() {
        mnj mnjVar = this.f69690n;
        return (mnjVar == null || TextUtils.isEmpty(mnjVar.m155516e())) ? mo96662j3() : this.f69690n.m155516e();
    }

    /* JADX INFO: renamed from: P5 */
    public void mo96635P5(GiftDialogContentView giftDialogContentView) {
        m144512z2(new chs(this.f188512e, giftDialogContentView.f50275k));
        m144512z2(new fnj(this.f188512e, giftDialogContentView.f50281q));
        if (uvr.m196087d().m162673I0()) {
            m144512z2(new tjn(this.f188512e, this));
        }
        this.f69695s = (fsj) m144512z2(new fsj(this.f188512e, giftDialogContentView.f50283s, giftDialogContentView.f50282r));
        this.f69696t = (yoj) m144512z2(new yoj(this.f188512e, giftDialogContentView.f50269e, giftDialogContentView.f50270f, giftDialogContentView.f50271g));
    }

    /* JADX INFO: renamed from: Q5 */
    public final void m96636Q5(Long l2) {
        if (((mfs) this.viewModel).isShowing() && ((mfs) this.viewModel).m154442N()) {
            m96666k6(l2);
            return;
        }
        if (l2.longValue() <= ((bgv) ypv.m215673l(fld0.f98151f)).m101732l().longValue()) {
            m206028F2().BottomEvent.refreshGiftRedDot().mo172463j(Boolean.FALSE);
            ((mfs) this.viewModel).m154455f0(false);
        } else {
            m206028F2().BottomEvent.refreshGiftRedDot().mo172463j(Boolean.TRUE);
            ((mfs) this.viewModel).m154455f0(true);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: R4 */
    public final List<rwj> m96637R4(boolean z) {
        hvj hvjVarM96559Q4 = m96559Q4();
        if (hvjVarM96559Q4 == null) {
            return null;
        }
        List<rwj> listM143509f = z ? hvjVarM96559Q4.m133172e().m143509f() : hvjVarM96559Q4.m133171d().m143509f();
        if (vwb.m200296J(listM143509f)) {
            return null;
        }
        return listM143509f;
    }

    /* JADX INFO: renamed from: R5 */
    public void m96638R5() {
        fp50 fp50Var;
        if (!this.f69697u || (fp50Var = this.f69698v) == null) {
            return;
        }
        this.f69697u = false;
        m96633O5(fp50Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r8v1, types: [l.ho2] */
    /* JADX INFO: renamed from: S5 */
    public final void m96639S5(String str, d30 d30Var, final boolean z, int i) {
        m96644V5();
        String strM149818o = m206027E2().m149818o();
        String strMo96662j3 = mo96662j3();
        if (r610.m177979N(this) && NullChecker.m81303a(this.f69690n) && !TextUtils.isEmpty(this.f69690n.m155516e())) {
            strMo96662j3 = this.f69690n.m155516e();
            BLiveMultiCall bLiveMultiCallM177970E = r610.m177970E(this, strMo96662j3);
            if (NullChecker.m81303a(bLiveMultiCallM177970E)) {
                strM149818o = bLiveMultiCallM177970E.roomId;
            }
        }
        if (i == 1503) {
            ((mfs) this.viewModel).m154464z().m74400q0(false);
            ((mfs) this.viewModel).m154464z().m74407y0(true);
            m206028F2().GiftDialogEventGroup.onGiftDialogPanelSwitchChange().mo172463j(new mtj(true));
        }
        m206027E2().m132055A1(new evj.C16689a(strM149818o, x350.m206896R2(m206027E2(), strMo96662j3), this.f69688l).m118279h(str).m118278g(d30Var).m118277f(), new e30() { // from class: l.egs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90987a.m96612D5(z, (List) obj);
            }
        });
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        ((mfs) this.viewModel).m154440L(act());
        m129304h3(m206028F2().GiftDialogEventGroup.openGiftDialogEvent(), new e30() { // from class: l.ofs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143732a.m96579d5((fp50) obj);
            }
        });
        m129304h3(m206028F2().GiftDialogEventGroup.switchGiftDialogSourceEvent(), new e30() { // from class: l.qfs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f154166a.m96654e5((fp50) obj);
            }
        });
        duringCreated((C22306c<T>) m206028F2().GiftDialogEventGroup.reloadGiftByPositionGiftId().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.tfs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170017a.m96595p5((String) obj);
            }
        }));
        duringCreated((C22306c<T>) m206028F2().GiftDialogEventGroup.showSendFirstGiftDlg().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.ufs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176324a.m96598r5((kze0) obj);
            }
        }));
        duringCreated((C22306c<T>) m206028F2().GiftDialogEventGroup.reloadGift().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.vfs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181298a.m96674s5((Integer) obj);
            }
        }));
        duringCreated((C22306c<T>) m206028F2().GiftDialogEventGroup.reloadGiftWithAction().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.wfs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186111a.m96675t5((j760) obj);
            }
        }));
        duringCreated((C22306c<T>) m206028F2().GiftDialogEventGroup.dismissGiftDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.xfs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f192714a.m96676u5((Integer) obj);
            }
        }));
        duringCreated((C22306c<T>) m206028F2().GiftDialogEventGroup.switchPacketPanel().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.yfs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198084a.m96677v5((Integer) obj);
            }
        }));
        duringCreated((C22306c<T>) m206028F2().GiftDialogEventGroup.onSengGiftFromMultipleGift().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.ags
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f69394a.m96643V4((efe0) obj);
            }
        }));
        duringCreated((C22306c<T>) m206028F2().GiftDialogEventGroup.updateItemModelAfterSendGift().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.bgs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75496a.m96678w5((bsj0) obj);
            }
        }));
        m129301d3(zuj.class, new w9j() { // from class: l.zfs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f202977a.m96679x5((zuj) obj);
            }
        });
        m129301d3(iuj.class, new w9j() { // from class: l.kgs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f123068a.m96656f5((iuj) obj);
            }
        });
        m129301d3(ovj.class, new w9j() { // from class: l.tgs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f170126a.m96658g5((ovj) obj);
            }
        });
        m129301d3(hnj.class, new w9j() { // from class: l.ugs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f176421a.m96660h5((hnj) obj);
            }
        });
        m129301d3(hf3.C17297d.class, new w9j() { // from class: l.vgs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f181425a.m96661i5((hf3.C17297d) obj);
            }
        });
        m129301d3(xnj.class, new w9j() { // from class: l.wgs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f186215a.m96663j5((xnj) obj);
            }
        });
        m129301d3(mpj.class, new w9j() { // from class: l.xgs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f192793a.m96665k5((mpj) obj);
            }
        });
        m129301d3(ynj.class, new w9j() { // from class: l.ygs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f198237a.m96667l5((ynj) obj);
            }
        });
        m129301d3(onj.class, new w9j() { // from class: l.zgs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f203082a.m96669m5((onj) obj);
            }
        });
        m129301d3(znj.class, new w9j() { // from class: l.pfs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f148584a.m96671n5((znj) obj);
            }
        });
        m129301d3(gpj.class, new w9j() { // from class: l.rfs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f159195a.m96672o5((gpj) obj);
            }
        });
        m129301d3(x5s.class, new w9j() { // from class: l.sfs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f164334a.m96673q5((x5s) obj);
            }
        });
        vxj.m200565d();
        m96644V5();
    }

    /* JADX INFO: renamed from: T4 */
    public final void m96640T4() {
        if (!((Boolean) m129297F3(new bn70(700))).booleanValue() || this.f69693q) {
            return;
        }
        this.f69693q = true;
        lsi0.m151564B(ypv.m215672k().m195736T4(), false, true);
    }

    /* JADX INFO: renamed from: T5 */
    public void m96641T5(boolean z) {
        m96642U5(z, -1);
    }

    /* JADX INFO: renamed from: U5 */
    public void m96642U5(boolean z, int i) {
        m96639S5(isShowing() ? this.f69692p : "", null, z && (1501 == i || 1502 == i), i);
    }

    /* JADX INFO: renamed from: V4 */
    public final void m96643V4(efe0 efe0Var) {
        final ihs ihsVarM116035d = efe0Var.m116035d();
        LiveGiftItemView liveGiftItemViewM116032a = efe0Var.m116032a();
        final int iM116034c = efe0Var.m116034c();
        final int iM116033b = efe0Var.m116033b();
        String strValueOf = ihsVarM116035d.m136283h().isPaidGift() ? String.valueOf(m96651a5(r1e.m177455d(ihsVarM116035d.m136283h(), iM116033b))) : "NA";
        m96645W5(ihsVarM116035d, liveGiftItemViewM116032a, new e30() { // from class: l.lgs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128010a.m96680y5(ihsVarM116035d, iM116034c, iM116033b, (BLiveGivenGiftBrief) obj);
            }
        }, iM116033b, iM116034c, false, null);
        axj.m99436j(this, ihsVarM116035d, iM116034c, strValueOf, mo77274R2(), iM116033b, "batch", m96634P4(), false);
    }

    /* JADX INFO: renamed from: V5 */
    public final void m96644V5() {
        duringCreated((C22306c<T>) zfv.m218592p1()).subscribe(ffw.m121197h(new e30() { // from class: l.jgs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117826a.m96670m6((BLiveUserLevel) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W5 */
    public void m96645W5(final ihs ihsVar, final LiveGiftItemView liveGiftItemView, @Nullable final e30<BLiveGivenGiftBrief> e30Var, int i, final int i2, final boolean z, @Nullable crj crjVar) {
        final BLiveGiftItem bLiveGiftItemM136283h = ihsVar.m136283h();
        pge0 pge0VarM168675d = pge0.m168675d(String.valueOf(bLiveGiftItemM136283h.f44377id), bLiveGiftItemM136283h, new e30() { // from class: l.ogs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143909a.m96614E5(bLiveGiftItemM136283h, ihsVar, liveGiftItemView, e30Var, i2, z, (BLiveGivenGiftBrief) obj);
            }
        }, new e30() { // from class: l.pgs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148807a.m96616F5(liveGiftItemView, bLiveGiftItemM136283h, (Throwable) obj);
            }
        }, new e30() { // from class: l.qgs
            @Override // p149l.e30
            public final void call(Object obj) {
                ahs.m96591m4((Integer) obj);
            }
        }, false, i, this.f69688l, this.f69690n, mmj.m155405H(bLiveGiftItemM136283h, ihsVar, i2));
        if (crjVar != null) {
            oge0.m164197a(pge0VarM168675d, crjVar);
        }
        sge0.m184069a(this, pge0VarM168675d, new e30() { // from class: l.rgs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159286a.m96647X5((pge0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X4 */
    public boolean m96646X4() {
        yoj<?> yojVar = this.f69696t;
        return yojVar != null && yojVar.m215519O3();
    }

    /* JADX INFO: renamed from: X5 */
    public void m96647X5(pge0 pge0Var) {
        m206028F2().SendGiftEventGroup.sendGift().mo172463j(new cfe0.C16123a().m106534y(pge0Var));
    }

    /* JADX INFO: renamed from: Y4 */
    public void m96648Y4() {
        m206028F2().GiftDialogEventGroup.hideGiftOperationLayer().m172467p();
    }

    /* JADX INFO: renamed from: Y5 */
    public void m96649Y5(String str) {
        this.f69692p = str;
    }

    /* JADX INFO: renamed from: Z5 */
    public void m96650Z5(fp50 fp50Var, boolean z) {
        zfv.m218577k1().subscribe(ffw.m121192c());
        ((mfs) this.viewModel).m154454e0();
        mo99576P3();
        m96585h6(fp50Var.m122561e(), z);
        m96640T4();
        m206028F2().GiftDialogEventGroup.giftDialogStatus().mo172463j(Boolean.TRUE);
        if (this.f69694r) {
            m96642U5(true, fp50Var.m122558b());
            this.f69694r = false;
        }
        m96633O5(fp50Var);
        m96648Y4();
    }

    /* JADX INFO: renamed from: a5 */
    public boolean m96651a5(double d) {
        return ((double) this.f69686j) >= d;
    }

    /* JADX INFO: renamed from: a6 */
    public void m96652a6(ihs ihsVar) {
        ((mfs) this.viewModel).m154453d0(mmj.m155402E(ihsVar, m96637R4(false)), this.f69688l);
    }

    /* JADX INFO: renamed from: c6 */
    public void m96653c6(ihs ihsVar, LiveGiftItemView liveGiftItemView, int i) {
        if (m96561S4() == null) {
            return;
        }
        if (this.f69687k == null) {
            this.f69687k = new a560(this);
        }
        this.f69687k.m95018e(this.f188513f, ihsVar, liveGiftItemView, i);
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ void m96654e5(fp50 fp50Var) {
        mo96659g6(fp50Var, true);
        m96664j6();
    }

    /* JADX INFO: renamed from: e6 */
    public void m96655e6(ihs ihsVar, avj avjVar) {
        m206028F2().UpgradeGiftEvent.showUpgradeDialog().mo172463j(new usj0.C20500a(700).m195212d(ihsVar).m195213e(avjVar).m195211c());
    }

    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ String m96656f5(iuj iujVar) {
        return m96634P4();
    }

    /* JADX INFO: renamed from: f6 */
    public void m96657f6() {
        ((mfs) this.viewModel).m154457h0();
    }

    /* JADX INFO: renamed from: g5 */
    public final /* synthetic */ String m96658g5(ovj ovjVar) {
        return m96619H4();
    }

    /* JADX INFO: renamed from: g6 */
    public void mo96659g6(fp50 fp50Var, boolean z) {
        String strM122559c = fp50Var.m122559c();
        mnj mnjVarM122557a = fp50Var.m122557a();
        if (TextUtils.equals(strM122559c, "default")) {
            strM122559c = mo96624K4();
            mnjVarM122557a = mo96623J4();
        }
        if (fp50Var.m122558b() == 1000 && mnjVarM122557a != null) {
            mnjVarM122557a.m155518g().f134444e.f111520a = "";
        }
        ((mfs) this.viewModel).m154452c0(mnjVarM122557a, fp50Var.m122558b());
        if (!TextUtils.equals(this.f69688l, strM122559c)) {
            m96575b6(false, z);
        }
        this.f69688l = strM122559c;
        this.f69690n = mnjVarM122557a;
        m96650Z5(fp50Var, z);
    }

    /* JADX INFO: renamed from: h5 */
    public final /* synthetic */ Boolean m96660h5(hnj hnjVar) {
        return Boolean.valueOf(m96651a5(hnjVar.f108640c));
    }

    /* JADX INFO: renamed from: i5 */
    public final /* synthetic */ AbstractC16991g4.a m96661i5(hf3.C17297d c17297d) {
        return ((mfs) this.viewModel).m154462x();
    }

    public boolean isShowing() {
        return ((mfs) this.viewModel).isShowing();
    }

    @Override // p149l.h4t
    /* JADX INFO: renamed from: j3 */
    public abstract String mo96662j3();

    /* JADX INFO: renamed from: j5 */
    public final /* synthetic */ xnj.C21181a m96663j5(xnj xnjVar) {
        return m96630N4();
    }

    /* JADX INFO: renamed from: j6 */
    public void m96664j6() {
        if (m96559Q4() == null || r610.m177979N(this)) {
            m96641T5(false);
        }
    }

    /* JADX INFO: renamed from: k5 */
    public final /* synthetic */ gnj m96665k5(mpj mpjVar) {
        return new gnj(mo96624K4(), mo96623J4());
    }

    /* JADX INFO: renamed from: k6 */
    public final void m96666k6(Long l2) {
        ((bgv) ypv.m215673l(fld0.f98151f)).m101739s(l2);
    }

    /* JADX INFO: renamed from: l5 */
    public final /* synthetic */ Pair m96667l5(ynj ynjVar) {
        return mo96617G4(ynjVar.f199178c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: l6 */
    public void m96668l6() {
        m206027E2().m132078M1(m206027E2().m149814k(), m206027E2().m149818o());
    }

    /* JADX INFO: renamed from: m5 */
    public final /* synthetic */ yr50 m96669m5(onj onjVar) {
        return ((mfs) this.viewModel).m154431B();
    }

    /* JADX INFO: renamed from: m6 */
    public final void m96670m6(BLiveUserLevel bLiveUserLevel) {
        LiveUserLevel liveUserLevel;
        User userM135637i = ((idv) ypv.m215673l(fld0.f98147b)).m135637i(ypv.f199493a.m199309D0());
        if (userM135637i == null || (liveUserLevel = userM135637i.hierarchy) == null || bLiveUserLevel == null) {
            return;
        }
        liveUserLevel.grade = bLiveUserLevel.grade;
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m96558J5();
        this.f69693q = false;
        this.f69697u = false;
        this.f69698v = null;
        vxj.m200563b();
        ypj.m215637c().m215638a();
    }

    /* JADX INFO: renamed from: n5 */
    public final /* synthetic */ Boolean m96671n5(znj znjVar) {
        return Boolean.valueOf(isShowing());
    }

    /* JADX INFO: renamed from: o5 */
    public final /* synthetic */ View m96672o5(gpj gpjVar) {
        return ((mfs) this.viewModel).m154430A();
    }

    /* JADX INFO: renamed from: q5 */
    public final /* synthetic */ BLiveWealthButton m96673q5(x5s x5sVar) {
        return ((mfs) this.viewModel).m154432C();
    }

    /* JADX INFO: renamed from: s5 */
    public final /* synthetic */ void m96674s5(Integer num) {
        m96641T5(false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v0, types: [l.ho2, l.lh20] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m96641T5(false);
        m206027E2().m132072J1().subscribe(ffw.m121192c());
        fld0<ggv> fld0Var = fld0.f98148c;
        ((ggv) ypv.m215673l(fld0Var)).m126008B();
        final BLiveType bLiveType = m206027E2().mo132054A0().equals("live") ? BLiveType.get("live") : BLiveType.get(BLiveType.voiceLive);
        aqe.m98261i().m98283z(m206027E2().m149818o(), mo96662j3(), bLiveType);
        duringCreated(C22306c.zip(((ggv) ypv.m215673l(fld0Var)).m126031q().onErrorReturn(null), ((ggv) ypv.m215673l(fld0Var)).m126033s().onErrorReturn(null), new cju()).observeOn(Schedulers.m221493io())).onBackpressureLatest().compose(mkd0.m154951C()).subscribe(ffw.m121197h(new e30() { // from class: l.cgs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80791a.m96622I5(bLiveType, (Pair) obj);
            }
        }));
        m96571Z4();
    }

    /* JADX INFO: renamed from: t5 */
    public final /* synthetic */ void m96675t5(j760 j760Var) {
        m96639S5(isShowing() ? this.f69692p : "", (d30) j760Var.f116565b, false, -1);
    }

    /* JADX INFO: renamed from: u5 */
    public final /* synthetic */ void m96676u5(Integer num) {
        m96613E4();
    }

    /* JADX INFO: renamed from: v5 */
    public final /* synthetic */ void m96677v5(Integer num) {
        m96657f6();
    }

    /* JADX INFO: renamed from: w5 */
    public final /* synthetic */ void m96678w5(bsj0 bsj0Var) {
        ((mfs) this.viewModel).m154459j0(bsj0Var.getItemModel(), bsj0Var.getBrief());
    }

    /* JADX INFO: renamed from: x5 */
    public final /* synthetic */ Boolean m96679x5(zuj zujVar) {
        return Boolean.valueOf(m96577c5());
    }

    /* JADX INFO: renamed from: y5 */
    public final /* synthetic */ void m96680y5(ihs ihsVar, int i, int i2, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        axj.m99444r(this, ihsVar, i, bLiveGivenGiftBrief, mo77274R2(), i2, "batch", m96634P4(), false);
    }

    /* JADX INFO: renamed from: z5 */
    public final /* synthetic */ Boolean m96681z5(hvj hvjVar) {
        if (isShowing() && m96574b5(hvjVar)) {
            m96575b6(true, true);
        }
        return Boolean.valueOf(hvjVar.m133177j());
    }
}
