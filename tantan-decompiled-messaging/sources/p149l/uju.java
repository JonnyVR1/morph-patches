package p149l;

import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveResourceInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveType;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftDialogContentView;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftItemView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.anim.GiftItemAnimType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p149l.jlu;

/* JADX INFO: loaded from: classes13.dex */
public class uju<T extends jlu> extends zeu<iiu> {

    /* JADX INFO: renamed from: f */
    public long f176825f;

    /* JADX INFO: renamed from: g */
    public String f176826g;

    /* JADX INFO: renamed from: h */
    public final Map<String, hvj> f176827h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public mnj f176828i;

    /* JADX INFO: renamed from: j */
    public Map<String, csl> f176829j;

    /* JADX INFO: renamed from: k */
    public String f176830k;

    /* JADX INFO: renamed from: l */
    public boolean f176831l;

    /* JADX INFO: renamed from: m */
    public gsj<?> f176832m;

    /* JADX INFO: renamed from: n */
    public Pair<BLiveResourceInfo, hvj> f176833n;

    public uju(jlu jluVar) {
        super(jluVar);
        this.f176826g = m194049n3();
        this.f176827h = new HashMap();
        this.f176831l = true;
        mo51532C(new iiu());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B3 */
    public /* synthetic */ void m194030B3(String str) {
        if (slk0.m184825a(m218409H2().m203901A())) {
            m194075b4();
        }
    }

    /* JADX INFO: renamed from: R2 */
    public static /* synthetic */ void m194031R2(List list) {
    }

    /* JADX INFO: renamed from: W2 */
    public static /* synthetic */ void m194036W2(Integer num) {
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ void m194040a3(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
    }

    /* JADX INFO: renamed from: n3 */
    private String m194049n3() {
        return "live";
    }

    /* JADX INFO: renamed from: w3 */
    private void m194050w3() {
        duringCreated((C22306c<T>) m218409H2().m203903C()).filter(new w9j() { // from class: l.eju
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f91782a.m194056H3((hvj) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.fju
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97865a.m194057I3((hvj) obj);
            }
        }));
        duringCreated((C22306c<T>) m218409H2().m203940q()).subscribe(ffw.m121193d(new e30() { // from class: l.gju
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103107a.m194055G3((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ void m194051C3(String str) {
        m194068U3(str, null);
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ void m194052D3(kze0 kze0Var) {
        m194074a4(kze0Var.m147944b(), kze0Var.m147943a(), kze0Var.m147945c());
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ Boolean m194053E3(hnj hnjVar) {
        return Boolean.valueOf(m194090x3(hnjVar.f108640c));
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ yr50 m194054F3(onj onjVar) {
        return ((iiu) this.viewModel).m136471p();
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ void m194055G3(Long l2) {
        this.f176825f = l2.longValue();
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ Boolean m194056H3(hvj hvjVar) {
        if (isShowing() && m194091y3(hvjVar)) {
            m194073Z3(true, true);
        }
        return Boolean.valueOf(hvjVar.m133177j());
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ void m194057I3(hvj hvjVar) {
        this.f176827h.put(hvjVar.m133174g(), hvjVar);
        if (isShowing()) {
            m194078e4(((iiu) this.viewModel).m136472q());
        }
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m194060L3(BLiveType bLiveType, Pair pair) {
        this.f176833n = pair;
        if (TextUtils.equals(bLiveType.toString(), "live")) {
            aqe.m98261i().m98276s(pair);
        }
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m194061M3(hvj hvjVar) {
        ((iiu) this.viewModel).m136478y(hvjVar);
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m194062N3(hvj hvjVar) {
        ((iiu) this.viewModel).m136478y(hvjVar);
    }

    /* JADX INFO: renamed from: O3 */
    public final void m194063O3() {
        Map<String, csl> map = this.f176829j;
        if (map == null) {
            return;
        }
        vwb.m200354z(map.values(), new aju());
    }

    /* JADX INFO: renamed from: P3 */
    public void m194064P3() {
        List<rwj> listM194085r3 = m194085r3();
        if (listM194085r3 != null) {
            nmj.m160113y(listM194085r3);
        }
        m218411K2().GiftDialogEventGroup.m69173a().mo172463j(Boolean.FALSE);
        this.f176830k = "";
        this.f176831l = true;
        wxj.m206018h();
        hu20.m132972s();
        System.gc();
    }

    /* JADX INFO: renamed from: R3 */
    public void m194065R3() {
        if (this.f176833n != null) {
            aqe.m98261i().mo98262a(this.f176833n, "");
        }
    }

    /* JADX INFO: renamed from: S3 */
    public void m194066S3(LiveVChatGiftDialogContentView liveVChatGiftDialogContentView) {
        m144512z2(new niu(m218413M2(), liveVChatGiftDialogContentView.f45155h));
        this.f176832m = (gsj) m144512z2(new gsj(m218413M2(), liveVChatGiftDialogContentView.f45157j, liveVChatGiftDialogContentView.f45156i));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        ((iiu) this.viewModel).m136473s(act());
        m218410I2(m218411K2().GiftDialogEventGroup.m69178f(), new e30() { // from class: l.lju
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128406a.m194092z3((fp50) obj);
            }
        });
        m218410I2(m218411K2().GiftDialogEventGroup.m69177e(), new e30() { // from class: l.mju
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134252a.m194087t3((ffe0) obj);
            }
        });
        m104250o2(m218409H2().m203948z(), false).distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.nju
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139334a.m194030B3((String) obj);
            }
        }));
        duringCreated((C22306c<T>) m218411K2().GiftDialogEventGroup.m69180h().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.oju
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144374a.m194051C3((String) obj);
            }
        }));
        duringCreated((C22306c<T>) m218411K2().GiftDialogEventGroup.m69181i().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.pju
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f149878a.m194052D3((kze0) obj);
            }
        }));
        m218408F2(hnj.class, new w9j() { // from class: l.qju
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f154990a.m194053E3((hnj) obj);
            }
        });
        m218408F2(onj.class, new w9j() { // from class: l.rju
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f159753a.m194054F3((onj) obj);
            }
        });
        wxj.m206015d();
    }

    /* JADX INFO: renamed from: T3 */
    public void m194067T3() {
        m194068U3(isShowing() ? this.f176830k : "", null);
    }

    /* JADX INFO: renamed from: U3 */
    public final void m194068U3(String str, d30 d30Var) {
        m218409H2().m203914N(new evj.C16689a(m218409H2().m203945v(), m194079j3(), this.f176826g).m118279h(str).m118278g(d30Var).m118277f(), new e30() { // from class: l.tju
            @Override // p149l.e30
            public final void call(Object obj) {
                uju.m194031R2((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public void m194069V3(final ihs ihsVar, final LiveVChatGiftItemView liveVChatGiftItemView, @Nullable final e30<BLiveGivenGiftBrief> e30Var, int i, final int i2, final boolean z) {
        final BLiveGiftItem bLiveGiftItemM136283h = ihsVar.m136283h();
        m194070W3(pge0.m168675d(String.valueOf(bLiveGiftItemM136283h.f44377id), bLiveGiftItemM136283h, new e30() { // from class: l.hju
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108120a.m194058J3(bLiveGiftItemM136283h, ihsVar, liveVChatGiftItemView, e30Var, i2, z, (BLiveGivenGiftBrief) obj);
            }
        }, new e30() { // from class: l.iju
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113610a.m194059K3(liveVChatGiftItemView, bLiveGiftItemM136283h, (Throwable) obj);
            }
        }, new e30() { // from class: l.jju
            @Override // p149l.e30
            public final void call(Object obj) {
                uju.m194036W2((Integer) obj);
            }
        }, false, i, this.f176826g, this.f176828i, nmj.m160110v(bLiveGiftItemM136283h, ihsVar, i2)));
    }

    /* JADX INFO: renamed from: W3 */
    public void m194070W3(pge0 pge0Var) {
        m218411K2().SendGiftEventGroup.m69203a().mo172463j(new cfe0.C16123a().m106534y(pge0Var));
    }

    /* JADX INFO: renamed from: X3 */
    public void m194071X3(String str) {
        this.f176830k = str;
    }

    /* JADX INFO: renamed from: Y3 */
    public void m194072Y3(fp50 fp50Var, boolean z) {
        zfv.m218577k1().subscribe(ffw.m121192c());
        ((iiu) this.viewModel).m136463A();
        q2f.C19397d<Boolean, C22306c<Boolean>> c19397dM69173a = m218411K2().GiftDialogEventGroup.m69173a();
        Boolean bool = Boolean.TRUE;
        c19397dM69173a.mo172463j(bool);
        m194077d4(fp50Var.m122561e(), z);
        m218411K2().GiftDialogEventGroup.m69174b().mo172463j(bool);
        if (this.f176831l) {
            m194067T3();
            this.f176831l = false;
        }
        m194089v3();
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m194073Z3(boolean z, boolean z2) {
        ((iiu) this.viewModel).m136478y(hvj.m133168b(z, false, z2));
    }

    /* JADX INFO: renamed from: a4 */
    public final void m194074a4(e30<Boolean> e30Var, e30<Boolean> e30Var2, long j) {
        ((iiu) this.viewModel).m136464B(act(), e30Var, e30Var2, j);
    }

    /* JADX INFO: renamed from: b4 */
    public void m194075b4() {
        m194067T3();
        m218409H2().m203917Q().subscribe(ffw.m121192c());
        final BLiveType bLiveType = BLiveType.get("live");
        aqe.m98261i().m98283z(m218409H2().m203945v(), m194079j3(), bLiveType);
        fld0<ggv> fld0Var = fld0.f98148c;
        duringCreated(C22306c.zip(((ggv) ypv.m215673l(fld0Var)).m126031q().onErrorReturn(null), ((ggv) ypv.m215673l(fld0Var)).m126033s().onErrorReturn(null), new cju()).observeOn(Schedulers.m221493io())).onBackpressureLatest().compose(mkd0.m154951C()).subscribe(ffw.m121197h(new e30() { // from class: l.dju
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f86568a.m194060L3(bLiveType, (Pair) obj);
            }
        }));
        m194050w3();
    }

    /* JADX INFO: renamed from: c4 */
    public void m194076c4(fp50 fp50Var, boolean z) {
        String strM122559c = fp50Var.m122559c();
        mnj mnjVarM122557a = fp50Var.m122557a();
        if (TextUtils.equals(strM122559c, "default")) {
            strM122559c = m194049n3();
            mnjVarM122557a = m194081m3();
        }
        if (fp50Var.m122558b() == 1000 && mnjVarM122557a != null) {
            mnjVarM122557a.m155518g().f134444e.f111520a = "";
        }
        if (!TextUtils.equals(this.f176826g, strM122559c)) {
            m194073Z3(false, z);
        }
        this.f176826g = strM122559c;
        this.f176828i = mnjVarM122557a;
        m194072Y3(fp50Var, z);
    }

    /* JADX INFO: renamed from: d4 */
    public final void m194077d4(List<Integer> list, boolean z) {
        final hvj hvjVarM194084q3 = m194084q3();
        if (hvjVarM194084q3 != null) {
            hvjVarM194084q3.m133181n(list);
            hvjVarM194084q3.m133178k(new hvj.C17412a(true, false, z));
            e51.m114742G(new Runnable() { // from class: l.sju
                @Override // java.lang.Runnable
                public final void run() {
                    this.f164912a.m194061M3(hvjVarM194084q3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e4 */
    public final void m194078e4(boolean z) {
        final hvj hvjVarM194084q3 = m194084q3();
        if (hvjVarM194084q3 != null) {
            hvjVarM194084q3.m133178k(new hvj.C17412a(true, z, true));
            e51.m114742G(new Runnable() { // from class: l.kju
                @Override // java.lang.Runnable
                public final void run() {
                    this.f123497a.m194062N3(hvjVarM194084q3);
                }
            });
        }
    }

    public boolean isShowing() {
        return ((iiu) this.viewModel).isShowing();
    }

    /* JADX INFO: renamed from: j3 */
    public String m194079j3() {
        return m218409H2().m203938o();
    }

    /* JADX INFO: renamed from: k3 */
    public int m194080k3() {
        return ((iiu) this.viewModel).m136470n();
    }

    @Nullable
    /* JADX INFO: renamed from: m3 */
    public mnj m194081m3() {
        return null;
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m194063O3();
        wxj.m206013b();
        ypj.m215637c().m215638a();
    }

    /* JADX INFO: renamed from: o3 */
    public yr50 m194082o3() {
        return ((iiu) this.viewModel).m136471p();
    }

    @Nullable
    /* JADX INFO: renamed from: p3 */
    public csl m194083p3(String str) {
        GiftItemAnimType giftItemAnimTypeValueOf;
        if (this.f176829j == null) {
            this.f176829j = new HashMap();
        }
        csl cslVar = this.f176829j.get(str);
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
        this.f176829j.put(str, controller);
        return controller;
    }

    @Nullable
    /* JADX INFO: renamed from: q3 */
    public final hvj m194084q3() {
        return this.f176827h.get(this.f176826g);
    }

    @Nullable
    /* JADX INFO: renamed from: r3 */
    public final List<rwj> m194085r3() {
        hvj hvjVarM194084q3 = m194084q3();
        if (hvjVarM194084q3 == null) {
            return null;
        }
        List<rwj> listM143509f = hvjVarM194084q3.m133172e().m143509f();
        if (vwb.m200296J(listM143509f)) {
            return null;
        }
        return listM143509f;
    }

    /* JADX INFO: renamed from: s3, reason: merged with bridge method [inline-methods] */
    public final void m194059K3(Throwable th, LiveVChatGiftItemView liveVChatGiftItemView, BLiveGiftItem bLiveGiftItem) {
        if (bLiveGiftItem.isPacketGift()) {
            boolean z = th instanceof TantanException.Client.CoreService;
            if (z && ((TantanException.Client.CoreService) th).code == 41201) {
                liveVChatGiftItemView.m69450l1(0);
            } else if (z && ((TantanException.Client.CoreService) th).code == 41202) {
                liveVChatGiftItemView.m69450l1(0);
            }
        }
    }

    /* JADX INFO: renamed from: t3 */
    public final void m194087t3(ffe0 ffe0Var) {
        ihs ihsVarM121158d = ffe0Var.m121158d();
        LiveVChatGiftItemView liveVChatGiftItemViewM121155a = ffe0Var.m121155a();
        int iM121157c = ffe0Var.m121157c();
        m194069V3(ihsVarM121158d, liveVChatGiftItemViewM121155a, new e30() { // from class: l.bju
            @Override // p149l.e30
            public final void call(Object obj) {
                uju.m194040a3((BLiveGivenGiftBrief) obj);
            }
        }, ffe0Var.m121156b(), iM121157c, false);
    }

    /* JADX INFO: renamed from: u3, reason: merged with bridge method [inline-methods] */
    public final void m194058J3(BLiveGiftItem bLiveGiftItem, ihs ihsVar, LiveVChatGiftItemView liveVChatGiftItemView, BLiveGivenGiftBrief bLiveGivenGiftBrief, @Nullable e30<BLiveGivenGiftBrief> e30Var, int i, boolean z) {
        ihsVar.m136298w(bLiveGivenGiftBrief);
        if (liveVChatGiftItemView != null) {
            ((iiu) this.viewModel).m136465C(ihsVar, bLiveGivenGiftBrief);
            liveVChatGiftItemView.m69446h1(ihsVar, bLiveGivenGiftBrief);
            if (e30Var != null) {
                e30Var.call(bLiveGivenGiftBrief);
            }
            nb0 nb0Var = new nb0(liveVChatGiftItemView, ihsVar, i, z, m194082o3());
            if (isShowing()) {
                this.f176832m.m127803a3(nb0Var);
            }
            if (bLiveGiftItem.mobileVibration) {
                xxj.m211506g(liveVChatGiftItemView.getContext());
            }
        }
    }

    /* JADX INFO: renamed from: v3 */
    public void m194089v3() {
        m218411K2().GiftDialogEventGroup.m69176d().m172467p();
    }

    /* JADX INFO: renamed from: x3 */
    public boolean m194090x3(double d) {
        return ((double) this.f176825f) >= d;
    }

    /* JADX INFO: renamed from: y3 */
    public final boolean m194091y3(hvj hvjVar) {
        hvj hvjVar2 = this.f176827h.get(hvjVar.m133174g());
        return hvjVar2 == null || vwb.m200296J(hvjVar2.m133171d().m143509f());
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ void m194092z3(fp50 fp50Var) {
        wrj.m205199F(fp50Var);
        m194065R3();
        m194076c4(fp50Var, false);
    }
}
