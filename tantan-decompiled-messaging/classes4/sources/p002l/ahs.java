package p002l;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.anim.GiftItemAnimType;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogContentView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.data.LiveUserLevel;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p1.mobile.putong.live.base.data.BLiveHierarchyProgress;
import com.p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p1.mobile.putong.live.base.data.BLiveResourceInfo;
import com.p1.mobile.putong.live.base.data.BLiveType;
import com.p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p1.mobile.putong.live.base.data.BLiveWealthButton;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.aju;
import l.bgv;
import l.bn70;
import l.bwr;
import l.cju;
import l.d30;
import l.e30;
import l.e51;
import l.ffw;
import l.fld0;
import l.ggv;
import l.hu20;
import l.idv;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.nvj;
import l.r610;
import l.s7m;
import l.t100;
import l.uvr;
import l.vwb;
import l.w9j;
import l.x9j;
import l.ynj;
import l.ypv;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p002l.ho2;
import rx.c;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class ahs<T extends ho2> extends x6s<T, mfs> {

    /* JADX INFO: renamed from: j */
    public long f7624j;

    /* JADX INFO: renamed from: k */
    public a560 f7625k;

    /* JADX INFO: renamed from: l */
    public String f7626l;

    /* JADX INFO: renamed from: m */
    public final Map<String, hvj> f7627m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public mnj f7628n;

    /* JADX INFO: renamed from: o */
    public Map<String, csl> f7629o;

    /* JADX INFO: renamed from: p */
    public String f7630p;

    /* JADX INFO: renamed from: q */
    public boolean f7631q;

    /* JADX INFO: renamed from: r */
    public boolean f7632r;

    /* JADX INFO: renamed from: s */
    public fsj<?> f7633s;

    /* JADX INFO: renamed from: t */
    public yoj<?> f7634t;

    /* JADX INFO: renamed from: u */
    public boolean f7635u;

    /* JADX INFO: renamed from: v */
    public fp50 f7636v;

    /* JADX INFO: renamed from: w */
    public Pair<BLiveResourceInfo, hvj> f7637w;

    public ahs(bsm<T> bsmVar) {
        super(bsmVar);
        this.f7626l = mo9720K4();
        this.f7627m = new HashMap();
        this.f7632r = true;
        this.f7635u = false;
        C(new mfs());
    }

    /* JADX INFO: renamed from: J5 */
    private void m9654J5() {
        Map<String, csl> map = this.f7629o;
        if (map == null) {
            return;
        }
        vwb.z(map.values(), new aju());
    }

    @Nullable
    /* JADX INFO: renamed from: Q4 */
    private hvj m9655Q4() {
        return this.f7627m.get(this.f7626l);
    }

    /* JADX INFO: renamed from: S4 */
    private Act m9657S4() {
        Act act = act();
        if (act == null || act.isFinishing()) {
            return null;
        }
        return act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U4, reason: merged with bridge method [inline-methods] */
    public void m9712F5(Throwable th, LiveGiftItemView liveGiftItemView, BLiveGiftItem bLiveGiftItem) {
        if (bLiveGiftItem.isPacketGift()) {
            boolean z = th instanceof TantanException.Client.CoreService;
            if (z && ((TantanException.Client.CoreService) th).code == 41201) {
                liveGiftItemView.m7029p1(0);
            } else if (z && ((TantanException.Client.CoreService) th).code == 41202) {
                liveGiftItemView.m7029p1(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W4, reason: merged with bridge method [inline-methods] */
    public void m9710E5(BLiveGiftItem bLiveGiftItem, ihs ihsVar, LiveGiftItemView liveGiftItemView, BLiveGivenGiftBrief bLiveGivenGiftBrief, @Nullable e30<BLiveGivenGiftBrief> e30Var, int i, boolean z) {
        ihsVar.m15175w(bLiveGivenGiftBrief);
        if (liveGiftItemView != 0) {
            ((mfs) ((bwr) this).viewModel).m17902j0(ihsVar, bLiveGivenGiftBrief);
            liveGiftItemView.m7026l1(ihsVar, bLiveGivenGiftBrief);
            if (e30Var != null) {
                e30Var.call(bLiveGivenGiftBrief);
            }
            mb0 mb0Var = new mb0(liveGiftItemView, ihsVar, i, z, ((mfs) ((bwr) this).viewModel).m17872B());
            if (uvr.d().I0() && !ihsVar.m15171s()) {
                m25548F2().IntlGiftComboEvent.comboEvent().j(mb0Var);
            }
            if (isShowing()) {
                this.f7633s.m13479T3(mb0Var);
            }
            if (bLiveGiftItem.mobileVibration) {
                xxj.m26170g(liveGiftItemView.getContext());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v7, types: [l.ho2] */
    /* JADX INFO: renamed from: Z4 */
    private void m9667Z4() {
        duringCreated(m25547E2().m14519P0()).filter(new w9j() { // from class: l.fgs
            public final Object call(Object obj) {
                return this.f10338a.m9779z5((hvj) obj);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.ggs
            public final void call(Object obj) {
                this.f11408a.m9703A5((hvj) obj);
            }
        }));
        duringCreated(m25547E2().m14602t1()).subscribe(ffw.d(new e30() { // from class: l.hgs
            public final void call(Object obj) {
                this.f12028a.m9704B5((Long) obj);
            }
        }));
        duringCreated(m25547E2().m14521Q0()).subscribe(ffw.d(new e30() { // from class: l.igs
            public final void call(Object obj) {
                this.f13234a.m9732Q5((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b5 */
    private boolean m9670b5(hvj hvjVar) {
        hvj hvjVar2 = this.f7627m.get(hvjVar.m14842g());
        return hvjVar2 == null || vwb.J(hvjVar2.m14839d().m16344f());
    }

    /* JADX INFO: renamed from: b6 */
    private void m9671b6(boolean z, boolean z2) {
        ((mfs) ((bwr) this).viewModel).m17892Y(hvj.m14836b(z, false, z2));
    }

    /* JADX INFO: renamed from: c5 */
    private boolean m9673c5() {
        return ((mfs) ((bwr) this).viewModel).m17883M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d5 */
    public /* synthetic */ void m9675d5(fp50 fp50Var) {
        wrj.m25371F(fp50Var);
        m9727N5();
        mo9756g6(fp50Var, false);
    }

    /* JADX INFO: renamed from: d6 */
    private void m9676d6(e30<Boolean> e30Var, e30<Boolean> e30Var2, long j) {
        ((mfs) ((bwr) this).viewModel).m17898g0(m25549H2().act(), e30Var, e30Var2, j);
    }

    /* JADX INFO: renamed from: h6 */
    private void m9681h6(List<Integer> list, boolean z) {
        final hvj hvjVarM9655Q4 = m9655Q4();
        if (hvjVarM9655Q4 != null) {
            hvjVarM9655Q4.m14849n(list);
            hvjVarM9655Q4.m14846k(new hvj.C0611a(true, false, z));
            e51.G(new Runnable() { // from class: l.dgs
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9254a.m9714G5(hvjVarM9655Q4);
                }
            });
        }
    }

    /* JADX INFO: renamed from: i6 */
    private void m9683i6(boolean z) {
        final hvj hvjVarM9655Q4 = m9655Q4();
        if (hvjVarM9655Q4 != null) {
            hvjVarM9655Q4.m14846k(new hvj.C0611a(true, z, true));
            e51.G(new Runnable() { // from class: l.sgs
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19015a.m9716H5(hvjVarM9655Q4);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m4 */
    public static /* synthetic */ void m9687m4(Integer num) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p5 */
    public /* synthetic */ void m9691p5(String str) {
        m9735S5(str, null, false, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r5 */
    public /* synthetic */ void m9694r5(kze0 kze0Var) {
        m9676d6(kze0Var.m16893b(), kze0Var.m16892a(), kze0Var.m16894c());
    }

    /* JADX INFO: renamed from: A5 */
    public final /* synthetic */ void m9703A5(hvj hvjVar) {
        this.f7627m.put(hvjVar.m14842g(), hvjVar);
        if (isShowing()) {
            m9683i6(((mfs) ((bwr) this).viewModel).m17878H());
        }
    }

    /* JADX INFO: renamed from: B5 */
    public final /* synthetic */ void m9704B5(Long l2) {
        this.f7624j = l2.longValue();
    }

    /* JADX INFO: renamed from: C4 */
    public final void m9705C4(List<rwj> list) {
        Iterator<rwj> it = list.iterator();
        while (it.hasNext()) {
            Iterator<ihs> it2 = it.next().f18703a.iterator();
            while (it2.hasNext()) {
                if (it2.next().m15160h().giftSource == 1) {
                    ((mfs) ((bwr) this).viewModel).m17899h0();
                    return;
                }
            }
        }
        lsi0.y("糟糕，背包礼物已经过期了，送点别的吧");
    }

    /* JADX INFO: renamed from: C5 */
    public final /* synthetic */ void m9706C5(umj umjVar) {
        yoj<?> yojVar = this.f7634t;
        if (yojVar != null) {
            yojVar.m26858V3(umjVar);
            this.f7634t.m26854S3();
        }
        ((mfs) ((bwr) this).viewModel).m17900i0();
        ((mfs) ((bwr) this).viewModel).m17891X(umjVar);
        if (((mfs) ((bwr) this).viewModel).isShowing()) {
            m25548F2().GiftDialogEventGroup.giftDialogHeightChange().p();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: D4 */
    public final nvj m9707D4(fp50 fp50Var) {
        String strM22413c = sfc0.m22413c(this, fp50Var, mo9759j3());
        String strM17235k = m25547E2().m17235k();
        String strM17239o = m25547E2().m17239o();
        if (NullChecker.a(fp50Var.m13437a())) {
            q44 q44VarM18092d = fp50Var.m13437a().m18092d();
            if (!TextUtils.isEmpty(q44VarM18092d.f17806g)) {
                strM17235k = q44VarM18092d.f17806g;
            }
            if (!TextUtils.isEmpty(q44VarM18092d.f17805f)) {
                strM17239o = q44VarM18092d.f17805f;
            }
        }
        return new nvj(strM22413c, strM17235k, strM17239o, mmj.m18076u(this.f7626l), w220.m24291b() ? w220.m24290a() : "");
    }

    /* JADX INFO: renamed from: D5 */
    public final /* synthetic */ void m9708D5(boolean z, List list) {
        if (z) {
            m9705C4(list);
        }
    }

    /* JADX INFO: renamed from: E4 */
    public void m9709E4() {
        mo9256O3();
        ((mfs) ((bwr) this).viewModel).m17904v();
    }

    @Nullable
    /* JADX INFO: renamed from: F4 */
    public abstract List<mlj> mo9711F4();

    /* JADX INFO: renamed from: G4 */
    public Pair<String, mnj> mo9713G4(String str) {
        if (((mfs) ((bwr) this).viewModel).isShowing()) {
            return new Pair<>(this.f7626l, this.f7628n);
        }
        return null;
    }

    /* JADX INFO: renamed from: G5 */
    public final /* synthetic */ void m9714G5(hvj hvjVar) {
        ((mfs) ((bwr) this).viewModel).m17892Y(hvjVar);
    }

    /* JADX INFO: renamed from: H4 */
    public String m9715H4() {
        return this.f7626l;
    }

    /* JADX INFO: renamed from: H5 */
    public final /* synthetic */ void m9716H5(hvj hvjVar) {
        ((mfs) ((bwr) this).viewModel).m17892Y(hvjVar);
    }

    /* JADX INFO: renamed from: I4 */
    public int m9717I4() {
        return ((mfs) ((bwr) this).viewModel).m17906y();
    }

    /* JADX INFO: renamed from: I5 */
    public final /* synthetic */ void m9718I5(BLiveType bLiveType, Pair pair) {
        this.f7637w = pair;
        if (!TextUtils.equals(bLiveType.toString(), "live")) {
            aqe.m10039i().m10057v(pair);
        } else {
            ((hvj) this.f7637w.second).m14847l("live");
            aqe.m10039i().m10054s(pair);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: J4 */
    public mnj mo9719J4() {
        return null;
    }

    /* JADX INFO: renamed from: K4 */
    public abstract String mo9720K4();

    /* JADX INFO: renamed from: K5 */
    public void m9721K5() {
        if (((mfs) ((bwr) this).viewModel).isShowing()) {
            m25548F2().GiftDialogEventGroup.giftDialogHeightChange().p();
        }
    }

    /* JADX INFO: renamed from: L4 */
    public yr50 m9722L4() {
        return ((mfs) ((bwr) this).viewModel).m17872B();
    }

    /* JADX INFO: renamed from: L5 */
    public void m9723L5(ihs ihsVar) {
        yoj<?> yojVar = this.f7634t;
        if (yojVar != null) {
            yojVar.m26856T3(ihsVar.m15160h().id);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: M4 */
    public mnj m9724M4() {
        return this.f7628n;
    }

    /* JADX INFO: renamed from: M5 */
    public void m9725M5(int i, rwj rwjVar) {
        yoj<?> yojVar = this.f7634t;
        if (yojVar != null) {
            yojVar.m26857U3(rwjVar.f18704b);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: N4 */
    public final xnj.C0900a m9726N4() {
        yoj<?> yojVar;
        s7m s7mVar = ((bwr) this).viewModel;
        int iD = (s7mVar == null || !((mfs) s7mVar).m17880J()) ? 0 : t100.d(46.0f);
        s7m s7mVar2 = ((bwr) this).viewModel;
        if (s7mVar2 != null && ((mfs) s7mVar2).m17877G() && (yojVar = this.f7634t) != null) {
            iD += yojVar.m26851N3();
        }
        s7m s7mVar3 = ((bwr) this).viewModel;
        if (s7mVar3 != null && ((mfs) s7mVar3).m17881K()) {
            iD += ((mfs) ((bwr) this).viewModel).m17876F();
        }
        s7m s7mVar4 = ((bwr) this).viewModel;
        if (s7mVar4 != null && ((mfs) s7mVar4).m17879I()) {
            iD += ((mfs) ((bwr) this).viewModel).m17875E();
        }
        int iD2 = iD + t100.d(10.0f);
        return new xnj.C0900a(t100.d(318.0f) + iD2, iD2);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: N5 */
    public void m9727N5() {
        if (this.f7637w != null) {
            aqe.m10039i().mo10040a(this.f7637w, m25547E2().mo14489A0());
        }
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo9256O3() {
        super.mo9256O3();
        List<rwj> listM9733R4 = m9733R4(true);
        if (listM9733R4 != null) {
            mmj.m18054O(listM9733R4);
        }
        m25548F2().GiftDialogEventGroup.giftDialogStatus().j(Boolean.FALSE);
        this.f7630p = "";
        this.f7632r = true;
        vxj.m24199h();
        hu20.s();
        System.gc();
    }

    @Nullable
    /* JADX INFO: renamed from: O4 */
    public csl m9728O4(String str) {
        GiftItemAnimType giftItemAnimTypeValueOf;
        if (this.f7629o == null) {
            this.f7629o = new HashMap();
        }
        csl cslVar = this.f7629o.get(str);
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
        this.f7629o.put(str, controller);
        return controller;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: O5 */
    public final void m9729O5(fp50 fp50Var) {
        this.f7636v = fp50Var;
        duringCreated(c.zip(zfv.m27289n1(m9707D4(fp50Var)), zfv.m27292o1(m25547E2().mo14489A0()), new x9j() { // from class: l.mgs
            public final Object call(Object obj, Object obj2) {
                return new umj((List) obj, (BLiveHierarchyProgress) obj2);
            }
        })).subscribe(ffw.h(new e30() { // from class: l.ngs
            public final void call(Object obj) {
                this.f16024a.m9706C5((umj) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P4 */
    public String m9730P4() {
        mnj mnjVar = this.f7628n;
        return (mnjVar == null || TextUtils.isEmpty(mnjVar.m18093e())) ? mo9759j3() : this.f7628n.m18093e();
    }

    /* JADX INFO: renamed from: P5 */
    public void mo9731P5(GiftDialogContentView giftDialogContentView) {
        z2(new chs(this.f22036e, giftDialogContentView.f6317k));
        z2(new fnj(this.f22036e, giftDialogContentView.f6323q));
        if (uvr.d().I0()) {
            z2(new tjn(this.f22036e, this));
        }
        this.f7633s = (fsj) z2(new fsj(this.f22036e, giftDialogContentView.f6325s, giftDialogContentView.f6324r));
        this.f7634t = (yoj) z2(new yoj(this.f22036e, giftDialogContentView.f6311e, giftDialogContentView.f6312f, giftDialogContentView.f6313g));
    }

    /* JADX INFO: renamed from: Q5 */
    public final void m9732Q5(Long l2) {
        if (((mfs) ((bwr) this).viewModel).isShowing() && ((mfs) ((bwr) this).viewModel).m17884N()) {
            m9763k6(l2);
            return;
        }
        if (l2.longValue() <= ((bgv) ypv.l(fld0.f)).l().longValue()) {
            m25548F2().BottomEvent.refreshGiftRedDot().j(Boolean.FALSE);
            ((mfs) ((bwr) this).viewModel).m17897f0(false);
        } else {
            m25548F2().BottomEvent.refreshGiftRedDot().j(Boolean.TRUE);
            ((mfs) ((bwr) this).viewModel).m17897f0(true);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: R4 */
    public final List<rwj> m9733R4(boolean z) {
        hvj hvjVarM9655Q4 = m9655Q4();
        if (hvjVarM9655Q4 == null) {
            return null;
        }
        List<rwj> listM16344f = z ? hvjVarM9655Q4.m14840e().m16344f() : hvjVarM9655Q4.m14839d().m16344f();
        if (vwb.J(listM16344f)) {
            return null;
        }
        return listM16344f;
    }

    /* JADX INFO: renamed from: R5 */
    public void m9734R5() {
        fp50 fp50Var;
        if (!this.f7635u || (fp50Var = this.f7636v) == null) {
            return;
        }
        this.f7635u = false;
        m9729O5(fp50Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r8v1, types: [l.ho2] */
    /* JADX INFO: renamed from: S5 */
    public final void m9735S5(String str, d30 d30Var, final boolean z, int i) {
        m9741V5();
        String strM17239o = m25547E2().m17239o();
        String strMo9759j3 = mo9759j3();
        if (r610.N(this) && NullChecker.a(this.f7628n) && !TextUtils.isEmpty(this.f7628n.m18093e())) {
            strMo9759j3 = this.f7628n.m18093e();
            BLiveMultiCall bLiveMultiCallE = r610.E(this, strMo9759j3);
            if (NullChecker.a(bLiveMultiCallE)) {
                strM17239o = bLiveMultiCallE.roomId;
            }
        }
        if (i == 1503) {
            ((mfs) ((bwr) this).viewModel).m17907z().m7984q0(false);
            ((mfs) ((bwr) this).viewModel).m17907z().m7991y0(true);
            m25548F2().GiftDialogEventGroup.onGiftDialogPanelSwitchChange().j(new mtj(true));
        }
        m25547E2().m14490A1(new evj.C0549a(strM17239o, x350.m25673R2(m25547E2(), strMo9759j3), this.f7626l).m12719h(str).m12718g(d30Var).m12717f(), new e30() { // from class: l.egs
            public final void call(Object obj) {
                this.f9769a.m9708D5(z, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public void mo9736T() {
        super.T();
        ((mfs) ((bwr) this).viewModel).m17882L(act());
        m14191h3(m25548F2().GiftDialogEventGroup.openGiftDialogEvent(), new e30() { // from class: l.ofs
            public final void call(Object obj) {
                this.f16558a.m9675d5((fp50) obj);
            }
        });
        m14191h3(m25548F2().GiftDialogEventGroup.switchGiftDialogSourceEvent(), new e30() { // from class: l.qfs
            public final void call(Object obj) {
                this.f17972a.m9751e5((fp50) obj);
            }
        });
        duringCreated((c) m25548F2().GiftDialogEventGroup.reloadGiftByPositionGiftId().g()).subscribe(ffw.d(new e30() { // from class: l.tfs
            public final void call(Object obj) {
                this.f20222a.m9691p5((String) obj);
            }
        }));
        duringCreated((c) m25548F2().GiftDialogEventGroup.showSendFirstGiftDlg().g()).subscribe(ffw.d(new e30() { // from class: l.ufs
            public final void call(Object obj) {
                this.f20626a.m9694r5((kze0) obj);
            }
        }));
        duringCreated((c) m25548F2().GiftDialogEventGroup.reloadGift().g()).subscribe(ffw.d(new e30() { // from class: l.vfs
            public final void call(Object obj) {
                this.f21113a.m9771s5((Integer) obj);
            }
        }));
        duringCreated((c) m25548F2().GiftDialogEventGroup.reloadGiftWithAction().g()).subscribe(ffw.d(new e30() { // from class: l.wfs
            public final void call(Object obj) {
                this.f21722a.m9773t5((j760) obj);
            }
        }));
        duringCreated((c) m25548F2().GiftDialogEventGroup.dismissGiftDialog().g()).subscribe(ffw.d(new e30() { // from class: l.xfs
            public final void call(Object obj) {
                this.f22261a.m9774u5((Integer) obj);
            }
        }));
        duringCreated((c) m25548F2().GiftDialogEventGroup.switchPacketPanel().g()).subscribe(ffw.d(new e30() { // from class: l.yfs
            public final void call(Object obj) {
                this.f22849a.m9775v5((Integer) obj);
            }
        }));
        duringCreated((c) m25548F2().GiftDialogEventGroup.onSengGiftFromMultipleGift().g()).subscribe(ffw.d(new e30() { // from class: l.ags
            public final void call(Object obj) {
                this.f7603a.m9740V4((efe0) obj);
            }
        }));
        duringCreated((c) m25548F2().GiftDialogEventGroup.updateItemModelAfterSendGift().g()).subscribe(ffw.h(new e30() { // from class: l.bgs
            public final void call(Object obj) {
                this.f8122a.m9776w5((bsj0) obj);
            }
        }));
        m14188d3(zuj.class, new w9j() { // from class: l.zfs
            public final Object call(Object obj) {
                return this.f23383a.m9777x5((zuj) obj);
            }
        });
        m14188d3(iuj.class, new w9j() { // from class: l.kgs
            public final Object call(Object obj) {
                return this.f14324a.m9753f5((iuj) obj);
            }
        });
        m14188d3(ovj.class, new w9j() { // from class: l.tgs
            public final Object call(Object obj) {
                return this.f20232a.m9755g5((ovj) obj);
            }
        });
        m14188d3(hnj.class, new w9j() { // from class: l.ugs
            public final Object call(Object obj) {
                return this.f20649a.m9757h5((hnj) obj);
            }
        });
        m14188d3(hf3.C0606d.class, new w9j() { // from class: l.vgs
            public final Object call(Object obj) {
                return this.f21122a.m9758i5((hf3.C0606d) obj);
            }
        });
        m14188d3(xnj.class, new w9j() { // from class: l.wgs
            public final Object call(Object obj) {
                return this.f21762a.m9760j5((xnj) obj);
            }
        });
        m14188d3(mpj.class, new w9j() { // from class: l.xgs
            public final Object call(Object obj) {
                return this.f22280a.m9762k5((mpj) obj);
            }
        });
        m14188d3(ynj.class, new w9j() { // from class: l.ygs
            public final Object call(Object obj) {
                return this.f22882a.m9764l5((ynj) obj);
            }
        });
        m14188d3(onj.class, new w9j() { // from class: l.zgs
            public final Object call(Object obj) {
                return this.f23404a.m9766m5((onj) obj);
            }
        });
        m14188d3(znj.class, new w9j() { // from class: l.pfs
            public final Object call(Object obj) {
                return this.f17257a.m9768n5((znj) obj);
            }
        });
        m14188d3(gpj.class, new w9j() { // from class: l.rfs
            public final Object call(Object obj) {
                return this.f18499a.m9769o5((gpj) obj);
            }
        });
        m14188d3(x5s.class, new w9j() { // from class: l.sfs
            public final Object call(Object obj) {
                return this.f19003a.m9770q5((x5s) obj);
            }
        });
        vxj.m24196d();
        m9741V5();
    }

    /* JADX INFO: renamed from: T4 */
    public final void m9737T4() {
        if (!((Boolean) m14184F3(new bn70(700))).booleanValue() || this.f7631q) {
            return;
        }
        this.f7631q = true;
        lsi0.B(ypv.k().T4(), false, true);
    }

    /* JADX INFO: renamed from: T5 */
    public void m9738T5(boolean z) {
        m9739U5(z, -1);
    }

    /* JADX INFO: renamed from: U5 */
    public void m9739U5(boolean z, int i) {
        m9735S5(isShowing() ? this.f7630p : "", null, z && (1501 == i || 1502 == i), i);
    }

    /* JADX INFO: renamed from: V4 */
    public final void m9740V4(efe0 efe0Var) {
        final ihs ihsVarM12454d = efe0Var.m12454d();
        LiveGiftItemView liveGiftItemViewM12451a = efe0Var.m12451a();
        final int iM12453c = efe0Var.m12453c();
        final int iM12452b = efe0Var.m12452b();
        String strValueOf = ihsVarM12454d.m15160h().isPaidGift() ? String.valueOf(m9748a5(r1e.m21717d(ihsVarM12454d.m15160h(), iM12452b))) : "NA";
        m9742W5(ihsVarM12454d, liveGiftItemViewM12451a, new e30() { // from class: l.lgs
            public final void call(Object obj) {
                this.f14860a.m9778y5(ihsVarM12454d, iM12453c, iM12452b, (BLiveGivenGiftBrief) obj);
            }
        }, iM12452b, iM12453c, false, null);
        axj.m10096j(this, ihsVarM12454d, iM12453c, strValueOf, mo21430R2(), iM12452b, "batch", m9730P4(), false);
    }

    /* JADX INFO: renamed from: V5 */
    public final void m9741V5() {
        duringCreated(zfv.m27295p1()).subscribe(ffw.h(new e30() { // from class: l.jgs
            public final void call(Object obj) {
                this.f13769a.m9767m6((BLiveUserLevel) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W5 */
    public void m9742W5(final ihs ihsVar, final LiveGiftItemView liveGiftItemView, @Nullable final e30<BLiveGivenGiftBrief> e30Var, int i, final int i2, final boolean z, @Nullable crj crjVar) {
        final BLiveGiftItem bLiveGiftItemM15160h = ihsVar.m15160h();
        pge0 pge0VarM20240d = pge0.m20240d(String.valueOf(bLiveGiftItemM15160h.id), bLiveGiftItemM15160h, new e30() { // from class: l.ogs
            public final void call(Object obj) {
                this.f16587a.m9710E5(bLiveGiftItemM15160h, ihsVar, liveGiftItemView, e30Var, i2, z, (BLiveGivenGiftBrief) obj);
            }
        }, new e30() { // from class: l.pgs
            public final void call(Object obj) {
                this.f17319a.m9712F5(liveGiftItemView, bLiveGiftItemM15160h, (Throwable) obj);
            }
        }, new e30() { // from class: l.qgs
            public final void call(Object obj) {
                ahs.m9687m4((Integer) obj);
            }
        }, false, i, this.f7626l, this.f7628n, mmj.m18047H(bLiveGiftItemM15160h, ihsVar, i2));
        if (crjVar != null) {
            oge0.m19470a(pge0VarM20240d, crjVar);
        }
        sge0.m22452a(this, pge0VarM20240d, new e30() { // from class: l.rgs
            public final void call(Object obj) {
                this.f18512a.m9744X5((pge0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X4 */
    public boolean m9743X4() {
        yoj<?> yojVar = this.f7634t;
        return yojVar != null && yojVar.m26852O3();
    }

    /* JADX INFO: renamed from: X5 */
    public void m9744X5(pge0 pge0Var) {
        m25548F2().SendGiftEventGroup.sendGift().j(new cfe0.C0512a().m10987y(pge0Var));
    }

    /* JADX INFO: renamed from: Y4 */
    public void m9745Y4() {
        m25548F2().GiftDialogEventGroup.hideGiftOperationLayer().p();
    }

    /* JADX INFO: renamed from: Y5 */
    public void m9746Y5(String str) {
        this.f7630p = str;
    }

    /* JADX INFO: renamed from: Z5 */
    public void m9747Z5(fp50 fp50Var, boolean z) {
        zfv.m27280k1().subscribe(ffw.c());
        ((mfs) ((bwr) this).viewModel).m17896e0();
        mo10254P3();
        m9681h6(fp50Var.m13441e(), z);
        m9737T4();
        m25548F2().GiftDialogEventGroup.giftDialogStatus().j(Boolean.TRUE);
        if (this.f7632r) {
            m9739U5(true, fp50Var.m13438b());
            this.f7632r = false;
        }
        m9729O5(fp50Var);
        m9745Y4();
    }

    /* JADX INFO: renamed from: a5 */
    public boolean m9748a5(double d) {
        return ((double) this.f7624j) >= d;
    }

    /* JADX INFO: renamed from: a6 */
    public void m9749a6(ihs ihsVar) {
        ((mfs) ((bwr) this).viewModel).m17895d0(mmj.m18044E(ihsVar, m9733R4(false)), this.f7626l);
    }

    /* JADX INFO: renamed from: c6 */
    public void m9750c6(ihs ihsVar, LiveGiftItemView liveGiftItemView, int i) {
        if (m9657S4() == null) {
            return;
        }
        if (this.f7625k == null) {
            this.f7625k = new a560(this);
        }
        this.f7625k.m9394e(this.f22037f, ihsVar, liveGiftItemView, i);
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ void m9751e5(fp50 fp50Var) {
        mo9756g6(fp50Var, true);
        m9761j6();
    }

    /* JADX INFO: renamed from: e6 */
    public void m9752e6(ihs ihsVar, avj avjVar) {
        m25548F2().UpgradeGiftEvent.showUpgradeDialog().j(new usj0.C0855a(700).m23595d(ihsVar).m23596e(avjVar).m23594c());
    }

    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ String m9753f5(iuj iujVar) {
        return m9730P4();
    }

    /* JADX INFO: renamed from: f6 */
    public void m9754f6() {
        ((mfs) ((bwr) this).viewModel).m17899h0();
    }

    /* JADX INFO: renamed from: g5 */
    public final /* synthetic */ String m9755g5(ovj ovjVar) {
        return m9715H4();
    }

    /* JADX INFO: renamed from: g6 */
    public void mo9756g6(fp50 fp50Var, boolean z) {
        String strM13439c = fp50Var.m13439c();
        mnj mnjVarM13437a = fp50Var.m13437a();
        if (TextUtils.equals(strM13439c, "default")) {
            strM13439c = mo9720K4();
            mnjVarM13437a = mo9719J4();
        }
        if (fp50Var.m13438b() == 1000 && mnjVarM13437a != null) {
            mnjVarM13437a.m18095g().f15446e.a = "";
        }
        ((mfs) ((bwr) this).viewModel).m17894c0(mnjVarM13437a, fp50Var.m13438b());
        if (!TextUtils.equals(this.f7626l, strM13439c)) {
            m9671b6(false, z);
        }
        this.f7626l = strM13439c;
        this.f7628n = mnjVarM13437a;
        m9747Z5(fp50Var, z);
    }

    /* JADX INFO: renamed from: h5 */
    public final /* synthetic */ Boolean m9757h5(hnj hnjVar) {
        return Boolean.valueOf(m9748a5(hnjVar.f12137c));
    }

    /* JADX INFO: renamed from: i5 */
    public final /* synthetic */ AbstractC0583g4.a m9758i5(hf3.C0606d c0606d) {
        return ((mfs) ((bwr) this).viewModel).m17905x();
    }

    public boolean isShowing() {
        return ((mfs) ((bwr) this).viewModel).isShowing();
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: j3 */
    public abstract String mo9759j3();

    /* JADX INFO: renamed from: j5 */
    public final /* synthetic */ xnj.C0900a m9760j5(xnj xnjVar) {
        return m9726N4();
    }

    /* JADX INFO: renamed from: j6 */
    public void m9761j6() {
        if (m9655Q4() == null || r610.N(this)) {
            m9738T5(false);
        }
    }

    /* JADX INFO: renamed from: k5 */
    public final /* synthetic */ gnj m9762k5(mpj mpjVar) {
        return new gnj(mo9720K4(), mo9719J4());
    }

    /* JADX INFO: renamed from: k6 */
    public final void m9763k6(Long l2) {
        ((bgv) ypv.l(fld0.f)).s(l2);
    }

    /* JADX INFO: renamed from: l5 */
    public final /* synthetic */ Pair m9764l5(ynj ynjVar) {
        return mo9713G4(ynjVar.c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: l6 */
    public void m9765l6() {
        m25547E2().m14514M1(m25547E2().m17235k(), m25547E2().m17239o());
    }

    /* JADX INFO: renamed from: m5 */
    public final /* synthetic */ yr50 m9766m5(onj onjVar) {
        return ((mfs) ((bwr) this).viewModel).m17872B();
    }

    /* JADX INFO: renamed from: m6 */
    public final void m9767m6(BLiveUserLevel bLiveUserLevel) {
        LiveUserLevel liveUserLevel;
        User userI = ((idv) ypv.l(fld0.b)).i(ypv.a.D0());
        if (userI == null || (liveUserLevel = userI.hierarchy) == null || bLiveUserLevel == null) {
            return;
        }
        liveUserLevel.grade = bLiveUserLevel.grade;
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        m9654J5();
        this.f7631q = false;
        this.f7635u = false;
        this.f7636v = null;
        vxj.m24194b();
        ypj.m26870c().m26871a();
    }

    /* JADX INFO: renamed from: n5 */
    public final /* synthetic */ Boolean m9768n5(znj znjVar) {
        return Boolean.valueOf(isShowing());
    }

    /* JADX INFO: renamed from: o5 */
    public final /* synthetic */ View m9769o5(gpj gpjVar) {
        return ((mfs) ((bwr) this).viewModel).m17871A();
    }

    /* JADX INFO: renamed from: q5 */
    public final /* synthetic */ BLiveWealthButton m9770q5(x5s x5sVar) {
        return ((mfs) ((bwr) this).viewModel).m17873C();
    }

    /* JADX INFO: renamed from: s5 */
    public final /* synthetic */ void m9771s5(Integer num) {
        m9738T5(false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: t */
    public void mo9772t() {
        super.t();
        m9738T5(false);
        m25547E2().m14508J1().subscribe(ffw.c());
        fld0 fld0Var = fld0.c;
        ((ggv) ypv.l(fld0Var)).B();
        final BLiveType bLiveType = m25547E2().mo14489A0().equals("live") ? BLiveType.get("live") : BLiveType.get("voiceLive");
        aqe.m10039i().m10061z(m25547E2().m17239o(), mo9759j3(), bLiveType);
        duringCreated(c.zip(((ggv) ypv.l(fld0Var)).q().onErrorReturn((w9j) null), ((ggv) ypv.l(fld0Var)).s().onErrorReturn((w9j) null), new cju()).observeOn(Schedulers.io())).onBackpressureLatest().compose(mkd0.C()).subscribe(ffw.h(new e30() { // from class: l.cgs
            public final void call(Object obj) {
                this.f8664a.m9718I5(bLiveType, (Pair) obj);
            }
        }));
        m9667Z4();
    }

    /* JADX INFO: renamed from: t5 */
    public final /* synthetic */ void m9773t5(j760 j760Var) {
        m9735S5(isShowing() ? this.f7630p : "", (d30) j760Var.b, false, -1);
    }

    /* JADX INFO: renamed from: u5 */
    public final /* synthetic */ void m9774u5(Integer num) {
        m9709E4();
    }

    /* JADX INFO: renamed from: v5 */
    public final /* synthetic */ void m9775v5(Integer num) {
        m9754f6();
    }

    /* JADX INFO: renamed from: w5 */
    public final /* synthetic */ void m9776w5(bsj0 bsj0Var) {
        ((mfs) ((bwr) this).viewModel).m17902j0(bsj0Var.getItemModel(), bsj0Var.getBrief());
    }

    /* JADX INFO: renamed from: x5 */
    public final /* synthetic */ Boolean m9777x5(zuj zujVar) {
        return Boolean.valueOf(m9673c5());
    }

    /* JADX INFO: renamed from: y5 */
    public final /* synthetic */ void m9778y5(ihs ihsVar, int i, int i2, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        axj.m10104r(this, ihsVar, i, bLiveGivenGiftBrief, mo21430R2(), i2, "batch", m9730P4(), false);
    }

    /* JADX INFO: renamed from: z5 */
    public final /* synthetic */ Boolean m9779z5(hvj hvjVar) {
        if (isShowing() && m9670b5(hvjVar)) {
            m9671b6(true, true);
        }
        return Boolean.valueOf(hvjVar.m14845j());
    }
}
