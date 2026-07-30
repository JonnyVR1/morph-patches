package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentActivity;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumActivitiesView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class umh extends ar2<elh> implements omg {

    /* JADX INFO: renamed from: j */
    public static String f179635j = "interaction";

    /* JADX INFO: renamed from: k */
    public static String f179636k = "friend";

    /* JADX INFO: renamed from: l */
    public static int f179637l;

    /* JADX INFO: renamed from: a */
    public String f179638a;

    /* JADX INFO: renamed from: b */
    public int f179639b;

    /* JADX INFO: renamed from: c */
    public List<MomentActivity> f179640c;

    /* JADX INFO: renamed from: d */
    public List<MomentActivity> f179641d;

    /* JADX INFO: renamed from: e */
    public boolean f179642e;

    /* JADX INFO: renamed from: f */
    public boolean f179643f;

    /* JADX INFO: renamed from: g */
    public v370 f179644g;

    /* JADX INFO: renamed from: h */
    public Links f179645h;

    /* JADX INFO: renamed from: i */
    public boolean f179646i;

    public umh(ner nerVar) {
        super(nerVar);
        this.f179640c = new LinkedList();
        this.f179641d = new ArrayList();
        this.f179642e = false;
        this.f179644g = new v370();
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ void m196674C0(Throwable th) {
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m196675D0(Throwable th) {
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m196686Q0(Throwable th) {
    }

    /* JADX INFO: renamed from: Q1 */
    private void m196687Q1(pf60<Links, List<MomentActivity>> pf60Var) {
        this.f179640c.clear();
        this.f179645h = m196744g1(pf60Var.f152156a);
        if (m196745h1()) {
            this.f179640c.addAll(jyb.m147522n(pf60Var.f152157b, new qcj() { // from class: l.olh
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((MomentActivity) obj).action, "like"));
                }
            }));
        } else if ("activities".equals(this.f179638a) && NullChecker.m82486a(pf60Var.f152157b)) {
            this.f179640c.addAll(pf60Var.f152157b);
        }
        ((elh) this.viewModel).m121162I(this.f179640c.size() > 0);
        List<MomentActivity> list = this.f179640c;
        this.f179641d = list;
        ((elh) this.viewModel).m121173x(list);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m196695e0(Throwable th) {
    }

    /* JADX INFO: renamed from: e1 */
    private boolean m196696e1(Links links) {
        return links == null || !TextUtils.isEmpty(links.next);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public /* synthetic */ void m196704l1(pf60 pf60Var) {
        ((elh) this.viewModel).m121158E();
        m196687Q1(pf60Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public /* synthetic */ void m196706m1(Throwable th) {
        ((elh) this.viewModel).m121159F(false);
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m196708o0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public /* synthetic */ void m196710p1(Bundle bundle) {
        V v2 = this.viewModel;
        if (v2 instanceof h570) {
            ((h570) v2).m133646r();
        }
        getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public /* synthetic */ void m196712q1() {
        if ("activities".equals(this.f179638a)) {
            act().setResult(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public /* synthetic */ void m196714r1(C4470c c4470c) {
        if (c4470c == C4470c.f16267i && this.f179642e) {
            ((elh) this.viewModel).m121163i();
            ((elh) this.viewModel).m121171v();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public /* synthetic */ void m196717t1(Throwable th) {
        ((elh) this.viewModel).m121159F(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m196722B1(pf60 pf60Var) {
        this.f179645h = m196744g1((Links) pf60Var.f152156a);
        jyb.m147507f0(new MomentActivity[0]);
        if (m196745h1()) {
            this.f179640c.addAll(jyb.m147522n((Collection) pf60Var.f152157b, new qcj() { // from class: l.plh
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f153032a.m196754x1((MomentActivity) obj);
                }
            }));
        } else if ("activities".equals(this.f179638a)) {
            this.f179640c.addAll(jyb.m147522n((Collection) pf60Var.f152157b, new qcj() { // from class: l.rlh
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f163761a.m196755z1((MomentActivity) obj);
                }
            }));
        }
        List<MomentActivity> list = this.f179640c;
        this.f179641d = list;
        ((elh) this.viewModel).m121173x(list);
        this.f179646i = false;
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ void m196723C1(Throwable th) {
        this.f179646i = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ void m196724D1(bkj0 bkj0Var) {
        m196737U1(((Integer) bkj0Var.f77083c).intValue());
        ((elh) this.viewModel).mo121174y((List) bkj0Var.f77082b, ((Integer) bkj0Var.f77083c).intValue());
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m196725E1(uxj0 uxj0Var) {
        m196742d1();
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m196726F1(uxj0 uxj0Var) {
        m196742d1();
    }

    @Override // p153l.omg
    /* JADX INFO: renamed from: G3 */
    public void mo65940G3(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        duringCreated(this.f179644g.m199243u(str)).subscribe(psd0.m173597H(new y20() { // from class: l.kmh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127478a.m196746i1(str, (uxj0) obj);
            }
        }, new y20() { // from class: l.lmh
            @Override // p153l.y20
            public final void call(Object obj) {
                umh.m196686Q0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ Boolean m196727H1(MomentActivity momentActivity) {
        return Boolean.valueOf(!this.f179640c.contains(momentActivity));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m196728I1(pf60 pf60Var) {
        this.f179645h = m196744g1((Links) pf60Var.f152156a);
        this.f179640c.addAll(jyb.m147522n((Collection) pf60Var.f152157b, new qcj() { // from class: l.amh
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f72223a.m196727H1((MomentActivity) obj);
            }
        }));
        List<MomentActivity> list = this.f179640c;
        this.f179641d = list;
        ((elh) this.viewModel).m121173x(list);
        this.f179646i = false;
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m196729J1(Throwable th) {
        this.f179646i = false;
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m196730L1(Integer num) {
        boolean zM196667d = umg.m196667d(num.intValue());
        boolean zM196666c = umg.m196666c(num.intValue(), m196741c1());
        if (!zM196667d && !zM196666c) {
            if (umg.m196665b(num.intValue())) {
                ((elh) this.viewModel).m121156B();
            }
        } else {
            if (zM196667d) {
                ((elh) this.viewModel).m121155A();
            }
            if (zM196666c) {
                ((elh) this.viewModel).m121157C(m196741c1());
            }
        }
    }

    @Override // p153l.omg
    /* JADX INFO: renamed from: L3 */
    public void mo65941L3() {
        boolean z = false;
        if (this.f179641d.size() > 0 && this.f179641d.size() > 0 && !this.f179641d.get(0).f56859id.equals(this.f179641d.get(0).f56859id)) {
            z = true;
        }
        ((elh) this.viewModel).m121160G(z);
    }

    @Override // p153l.omg
    /* JADX INFO: renamed from: M1 */
    public void mo65942M1(String str, int i) {
        if ("activities".equals(this.f179638a)) {
            duringCreated(this.f179644g.m199246x(f179635j, str, i)).subscribe(psd0.m173597H(new y20() { // from class: l.hmh
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f110626a.m196731N1((String) obj);
                }
            }, new y20() { // from class: l.imh
                @Override // p153l.y20
                public final void call(Object obj) {
                    umh.m196674C0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: N1 */
    public final /* synthetic */ void m196731N1(final String str) {
        MomentActivity momentActivity = (MomentActivity) jyb.m147529r(this.f179640c, new qcj() { // from class: l.jmh
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((MomentActivity) obj).f56859id.equals(str));
            }
        });
        if (NullChecker.m82486a(momentActivity)) {
            momentActivity.read = true;
            List<MomentActivity> list = this.f179640c;
            this.f179641d = list;
            ((elh) this.viewModel).m121173x(list);
        }
    }

    /* JADX INFO: renamed from: O1 */
    public void m196732O1() {
        boolean zM196745h1 = m196745h1();
        v370 v370Var = this.f179644g;
        if (zM196745h1) {
            duringCreated(v370Var.m199240K()).subscribe(psd0.m173597H(new y20() { // from class: l.flh
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f99656a.m196751s1((pf60) obj);
                }
            }, new y20() { // from class: l.qlh
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f158230a.m196717t1((Throwable) obj);
                }
            }));
        } else {
            duringCreated(v370Var.m199235F(this.f179639b == 2 ? f179636k : f179635j)).subscribe(psd0.m173597H(new y20() { // from class: l.bmh
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f77304a.m196752u1((pf60) obj);
                }
            }, new y20() { // from class: l.mmh
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f137569a.m196753v1((Throwable) obj);
                }
            }));
            m196733P1();
        }
    }

    /* JADX INFO: renamed from: P1 */
    public void m196733P1() {
        duringCreated(this.f179644g.m199237H()).subscribe(psd0.m173597H(new y20() { // from class: l.ylh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200553a.m196724D1((bkj0) obj);
            }
        }, new y20() { // from class: l.zlh
            @Override // p153l.y20
            public final void call(Object obj) {
                umh.m196695e0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R1 */
    public void m196734R1() {
        if ("activities".equals(this.f179638a)) {
            boolean zIsEmpty = this.f179640c.isEmpty();
            v370 v370Var = this.f179644g;
            if (zIsEmpty) {
                duringCreated(v370Var.m199244v("", f179635j)).subscribe(psd0.m173597H(new y20() { // from class: l.jlh
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f121553a.m196726F1((uxj0) obj);
                    }
                }, new y20() { // from class: l.klh
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        umh.m196675D0((Throwable) obj);
                    }
                }));
            } else {
                duringCreated(v370Var.m199244v(this.f179640c.get(0).f56859id, f179635j)).subscribe(psd0.m173597H(new y20() { // from class: l.hlh
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f110507a.m196725E1((uxj0) obj);
                    }
                }, new y20() { // from class: l.ilh
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        umh.m196708o0((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: S1 */
    public void m196735S1(final y20<Boolean> y20Var) {
        if ("activities".equals(this.f179638a)) {
            boolean zIsEmpty = this.f179640c.isEmpty();
            v370 v370Var = this.f179644g;
            if (zIsEmpty) {
                duringCreated(v370Var.m199244v("", f179635j)).subscribe(psd0.m173597H(new y20() { // from class: l.fmh
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        y20Var.call(Boolean.TRUE);
                    }
                }, new y20() { // from class: l.gmh
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        y20Var.call(Boolean.FALSE);
                    }
                }));
            } else {
                duringCreated(v370Var.m199244v(this.f179640c.get(0).f56859id, f179635j)).subscribe(psd0.m173597H(new y20() { // from class: l.dmh
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        y20Var.call(Boolean.TRUE);
                    }
                }, new y20() { // from class: l.emh
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        y20Var.call(Boolean.FALSE);
                    }
                }));
            }
        }
    }

    @Override // p153l.omg
    /* JADX INFO: renamed from: T0 */
    public void mo65943T0(PhotoAlbumActivitiesView photoAlbumActivitiesView) {
        if (m196745h1()) {
            photoAlbumActivitiesView.setFrom(PhotoAlbumActivitiesAct.f43092j);
        } else {
            photoAlbumActivitiesView.setFrom("activities");
        }
    }

    /* JADX INFO: renamed from: T1 */
    public final void m196736T1() {
        if (this.f179646i) {
            return;
        }
        this.f179646i = true;
        duringCreated(this.f179644g.m199239J(this.f179645h)).subscribe(psd0.m173597H(new y20() { // from class: l.mlh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137398a.m196728I1((pf60) obj);
            }
        }, new y20() { // from class: l.nlh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142543a.m196729J1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U1 */
    public final void m196737U1(int i) {
        f179637l = i;
    }

    /* JADX INFO: renamed from: V1 */
    public void m196738V1() {
        if (cmg.m111227p()) {
            duringCreated(mrb0.m159656j().distinctUntilChanged()).map(new qcj() { // from class: l.omh
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Integer.valueOf(((Counter) obj).activities.unread);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.pmh
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f153184a.m196730L1((Integer) obj);
                }
            }));
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.qmh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f158345a.m196710p1((Bundle) obj);
            }
        }, new x20() { // from class: l.rmh
            @Override // p153l.x20
            public final void call() {
                this.f163881a.m196712q1();
            }
        });
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.smh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169581a.m196714r1((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m196752u1(pf60<Links, List<MomentActivity>> pf60Var) {
        ((elh) this.viewModel).m121158E();
        m196687Q1(pf60Var);
        ((elh) this.viewModel).m121172w(this.f179642e);
    }

    /* JADX INFO: renamed from: b1 */
    public void m196740b1(final String str) {
        ArrayList arrayListM147522n = jyb.m147522n(this.f179640c, new qcj() { // from class: l.llh
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((MomentActivity) obj).reference.f40080id.equals(str));
            }
        });
        this.f179640c = arrayListM147522n;
        this.f179641d = arrayListM147522n;
        ((elh) this.viewModel).m121173x(arrayListM147522n);
    }

    /* JADX INFO: renamed from: c1 */
    public final int m196741c1() {
        return f179637l;
    }

    @Override // p153l.omg
    /* JADX INFO: renamed from: d0 */
    public void mo65954d0() {
        ((elh) this.viewModel).m121161H(m196696e1(this.f179645h));
    }

    /* JADX INFO: renamed from: d1 */
    public void m196742d1() {
        ((elh) this.viewModel).mo121166n();
        Iterator<MomentActivity> it = this.f179640c.iterator();
        while (it.hasNext()) {
            it.next().read = true;
        }
        List<MomentActivity> list = this.f179640c;
        this.f179641d = list;
        ((elh) this.viewModel).m121173x(list);
    }

    @Override // p153l.omg
    /* JADX INFO: renamed from: e */
    public void mo65956e(int i) {
        if (i < this.f179641d.size() - 4 || this.f179641d.size() <= 0 || !m196696e1(this.f179645h)) {
            return;
        }
        if (cmg.m111195W() && m196745h1()) {
            m196736T1();
        } else {
            if (this.f179646i) {
                return;
            }
            this.f179646i = true;
            duringCreated(this.f179644g.m199234E(this.f179645h)).subscribe(psd0.m173597H(new y20() { // from class: l.tmh
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f174929a.m196722B1((pf60) obj);
                }
            }, new y20() { // from class: l.glh
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f104851a.m196723C1((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: f1 */
    public void m196743f1(String str, boolean z, boolean z2) {
        this.f179638a = str;
        this.f179643f = z;
        this.f179642e = z2;
    }

    /* JADX INFO: renamed from: g1 */
    public Links m196744g1(Links links) {
        if (cmg.m111216j0() && !TextUtils.isEmpty(links.next) && !links.next.contains("filter")) {
            StringBuilder sb = new StringBuilder();
            sb.append(links.next);
            sb.append("&filter=");
            sb.append(this.f179639b == 2 ? f179636k : f179635j);
            links.next = sb.toString();
        }
        return links;
    }

    public void getData() {
        boolean zM196745h1 = m196745h1();
        v370 v370Var = this.f179644g;
        if (zM196745h1) {
            duringCreated(v370Var.m199240K()).subscribe(psd0.m173597H(new y20() { // from class: l.slh
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f169382a.m196747j1((pf60) obj);
                }
            }, new y20() { // from class: l.tlh
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f174829a.m196748k1((Throwable) obj);
                }
            }));
            if (this.f179643f && !cmg.m111195W()) {
                this.f179644g.m199241L();
            }
        } else {
            duringCreated(v370Var.m199235F(this.f179639b == 2 ? f179636k : f179635j)).subscribe(psd0.m173597H(new y20() { // from class: l.ulh
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f179511a.m196704l1((pf60) obj);
                }
            }, new y20() { // from class: l.vlh
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f184585a.m196706m1((Throwable) obj);
                }
            }));
            m196733P1();
        }
        duringCreated(FeedModule.f39703d.f121371p0).subscribe(psd0.m173596G(new y20() { // from class: l.wlh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189693a.m196749n1((Moment) obj);
            }
        }));
        duringCreated(FeedModule.f39703d.f121322Q0).subscribe(psd0.m173596G(new y20() { // from class: l.xlh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194970a.m196750o1((pf60) obj);
            }
        }));
    }

    @Override // p153l.omg
    public String getFrom() {
        return this.f179638a;
    }

    /* JADX INFO: renamed from: h1 */
    public boolean m196745h1() {
        return PhotoAlbumActivitiesAct.f43092j.equals(this.f179638a);
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m196746i1(final String str, uxj0 uxj0Var) {
        this.f179640c.remove((MomentActivity) jyb.m147529r(this.f179640c, new qcj() { // from class: l.nmh
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equals(((MomentActivity) obj).f56859id));
            }
        }));
        List<MomentActivity> list = this.f179640c;
        this.f179641d = list;
        ((elh) this.viewModel).m121173x(list);
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m196747j1(pf60 pf60Var) {
        ((elh) this.viewModel).m121158E();
        m196687Q1(pf60Var);
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m196748k1(Throwable th) {
        ((elh) this.viewModel).m121159F(false);
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m196749n1(final Moment moment) {
        this.f179642e = false;
        ArrayList arrayListM147522n = jyb.m147522n(this.f179640c, new qcj() { // from class: l.cmh
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((MomentActivity) obj).reference.f40080id.equals(moment.f56859id));
            }
        });
        this.f179640c = arrayListM147522n;
        this.f179641d = arrayListM147522n;
        ((elh) this.viewModel).m121173x(arrayListM147522n);
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m196750o1(pf60 pf60Var) {
        List<MomentActivity> list = this.f179640c;
        this.f179641d = list;
        ((elh) this.viewModel).m121173x(list);
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m196753v1(Throwable th) {
        ((elh) this.viewModel).m121159F(false);
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ Boolean m196754x1(MomentActivity momentActivity) {
        return Boolean.valueOf(TEnum.equals(momentActivity.action, "like") && !this.f179640c.contains(momentActivity));
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ Boolean m196755z1(MomentActivity momentActivity) {
        return Boolean.valueOf(!this.f179640c.contains(momentActivity));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
