package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentActivity;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumActivitiesView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class flh extends jq2<pjh> implements zkg {

    /* JADX INFO: renamed from: j */
    public static String f98171j = "interaction";

    /* JADX INFO: renamed from: k */
    public static String f98172k = "friend";

    /* JADX INFO: renamed from: l */
    public static int f98173l;

    /* JADX INFO: renamed from: a */
    public String f98174a;

    /* JADX INFO: renamed from: b */
    public int f98175b;

    /* JADX INFO: renamed from: c */
    public List<MomentActivity> f98176c;

    /* JADX INFO: renamed from: d */
    public List<MomentActivity> f98177d;

    /* JADX INFO: renamed from: e */
    public boolean f98178e;

    /* JADX INFO: renamed from: f */
    public boolean f98179f;

    /* JADX INFO: renamed from: g */
    public pv60 f98180g;

    /* JADX INFO: renamed from: h */
    public Links f98181h;

    /* JADX INFO: renamed from: i */
    public boolean f98182i;

    public flh(mcr mcrVar) {
        super(mcrVar);
        this.f98176c = new LinkedList();
        this.f98177d = new ArrayList();
        this.f98178e = false;
        this.f98180g = new pv60();
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ void m121986C0(Throwable th) {
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m121987D0(Throwable th) {
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m121998Q0(Throwable th) {
    }

    /* JADX INFO: renamed from: Q1 */
    private void m121999Q1(j760<Links, List<MomentActivity>> j760Var) {
        this.f98176c.clear();
        this.f98181h = m122056g1(j760Var.f116564a);
        if (m122057h1()) {
            this.f98176c.addAll(vwb.m200339n(j760Var.f116565b, new w9j() { // from class: l.zjh
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((MomentActivity) obj).action, "like"));
                }
            }));
        } else if ("activities".equals(this.f98174a) && NullChecker.m81303a(j760Var.f116565b)) {
            this.f98176c.addAll(j760Var.f116565b);
        }
        ((pjh) this.viewModel).m169855I(this.f98176c.size() > 0);
        List<MomentActivity> list = this.f98176c;
        this.f98177d = list;
        ((pjh) this.viewModel).m169864x(list);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m122007e0(Throwable th) {
    }

    /* JADX INFO: renamed from: e1 */
    private boolean m122008e1(Links links) {
        return links == null || !TextUtils.isEmpty(links.next);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public /* synthetic */ void m122016l1(j760 j760Var) {
        ((pjh) this.viewModel).m169851E();
        m121999Q1(j760Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public /* synthetic */ void m122018m1(Throwable th) {
        ((pjh) this.viewModel).m169852F(false);
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m122020o0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public /* synthetic */ void m122022p1(Bundle bundle) {
        V v2 = this.viewModel;
        if (v2 instanceof bx60) {
            ((bx60) v2).m104306r();
        }
        getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public /* synthetic */ void m122024q1() {
        if ("activities".equals(this.f98174a)) {
            act().setResult(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public /* synthetic */ void m122026r1(C4319c c4319c) {
        if (c4319c == C4319c.f15548i && this.f98178e) {
            ((pjh) this.viewModel).m169856i();
            ((pjh) this.viewModel).m169862v();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public /* synthetic */ void m122029t1(Throwable th) {
        ((pjh) this.viewModel).m169852F(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m122034B1(j760 j760Var) {
        this.f98181h = m122056g1((Links) j760Var.f116564a);
        vwb.m200324f0(new MomentActivity[0]);
        if (m122057h1()) {
            this.f98176c.addAll(vwb.m200339n((Collection) j760Var.f116565b, new w9j() { // from class: l.akh
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f70275a.m122066x1((MomentActivity) obj);
                }
            }));
        } else if ("activities".equals(this.f98174a)) {
            this.f98176c.addAll(vwb.m200339n((Collection) j760Var.f116565b, new w9j() { // from class: l.ckh
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f81334a.m122067z1((MomentActivity) obj);
                }
            }));
        }
        List<MomentActivity> list = this.f98176c;
        this.f98177d = list;
        ((pjh) this.viewModel).m169864x(list);
        this.f98182i = false;
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ void m122035C1(Throwable th) {
        this.f98182i = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ void m122036D1(xaj0 xaj0Var) {
        m122049U1(((Integer) xaj0Var.f191753c).intValue());
        ((pjh) this.viewModel).mo107468y((List) xaj0Var.f191752b, ((Integer) xaj0Var.f191753c).intValue());
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m122037E1(roj0 roj0Var) {
        m122054d1();
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m122038F1(roj0 roj0Var) {
        m122054d1();
    }

    @Override // p149l.zkg
    /* JADX INFO: renamed from: G3 */
    public void mo64757G3(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        duringCreated(this.f98180g.m171610u(str)).subscribe(mkd0.m154956H(new e30() { // from class: l.vkh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181799a.m122058i1(str, (roj0) obj);
            }
        }, new e30() { // from class: l.wkh
            @Override // p149l.e30
            public final void call(Object obj) {
                flh.m121998Q0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ Boolean m122039H1(MomentActivity momentActivity) {
        return Boolean.valueOf(!this.f98176c.contains(momentActivity));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m122040I1(j760 j760Var) {
        this.f98181h = m122056g1((Links) j760Var.f116564a);
        this.f98176c.addAll(vwb.m200339n((Collection) j760Var.f116565b, new w9j() { // from class: l.lkh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f128534a.m122039H1((MomentActivity) obj);
            }
        }));
        List<MomentActivity> list = this.f98176c;
        this.f98177d = list;
        ((pjh) this.viewModel).m169864x(list);
        this.f98182i = false;
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m122041J1(Throwable th) {
        this.f98182i = false;
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m122042L1(Integer num) {
        boolean zM121979d = flg.m121979d(num.intValue());
        boolean zM121978c = flg.m121978c(num.intValue(), m122053c1());
        if (!zM121979d && !zM121978c) {
            if (flg.m121977b(num.intValue())) {
                ((pjh) this.viewModel).m169849B();
            }
        } else {
            if (zM121979d) {
                ((pjh) this.viewModel).m169848A();
            }
            if (zM121978c) {
                ((pjh) this.viewModel).m169850C(m122053c1());
            }
        }
    }

    @Override // p149l.zkg
    /* JADX INFO: renamed from: L3 */
    public void mo64758L3() {
        boolean z = false;
        if (this.f98177d.size() > 0 && this.f98177d.size() > 0 && !this.f98177d.get(0).f56011id.equals(this.f98177d.get(0).f56011id)) {
            z = true;
        }
        ((pjh) this.viewModel).m169853G(z);
    }

    @Override // p149l.zkg
    /* JADX INFO: renamed from: M1 */
    public void mo64759M1(String str, int i) {
        if ("activities".equals(this.f98174a)) {
            duringCreated(this.f98180g.m171613x(f98171j, str, i)).subscribe(mkd0.m154956H(new e30() { // from class: l.skh
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f164970a.m122043N1((String) obj);
                }
            }, new e30() { // from class: l.tkh
                @Override // p149l.e30
                public final void call(Object obj) {
                    flh.m121986C0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: N1 */
    public final /* synthetic */ void m122043N1(final String str) {
        MomentActivity momentActivity = (MomentActivity) vwb.m200346r(this.f98176c, new w9j() { // from class: l.ukh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((MomentActivity) obj).f56011id.equals(str));
            }
        });
        if (NullChecker.m81303a(momentActivity)) {
            momentActivity.read = true;
            List<MomentActivity> list = this.f98176c;
            this.f98177d = list;
            ((pjh) this.viewModel).m169864x(list);
        }
    }

    /* JADX INFO: renamed from: O1 */
    public void m122044O1() {
        boolean zM122057h1 = m122057h1();
        pv60 pv60Var = this.f98180g;
        if (zM122057h1) {
            duringCreated(pv60Var.m171607K()).subscribe(mkd0.m154956H(new e30() { // from class: l.qjh
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f154925a.m122063s1((j760) obj);
                }
            }, new e30() { // from class: l.bkh
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f76021a.m122029t1((Throwable) obj);
                }
            }));
        } else {
            duringCreated(pv60Var.m171602F(this.f98175b == 2 ? f98172k : f98171j)).subscribe(mkd0.m154956H(new e30() { // from class: l.mkh
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f134328a.m122064u1((j760) obj);
                }
            }, new e30() { // from class: l.xkh
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f193299a.m122065v1((Throwable) obj);
                }
            }));
            m122045P1();
        }
    }

    /* JADX INFO: renamed from: P1 */
    public void m122045P1() {
        duringCreated(this.f98180g.m171604H()).subscribe(mkd0.m154956H(new e30() { // from class: l.jkh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118380a.m122036D1((xaj0) obj);
            }
        }, new e30() { // from class: l.kkh
            @Override // p149l.e30
            public final void call(Object obj) {
                flh.m122007e0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R1 */
    public void m122046R1() {
        if ("activities".equals(this.f98174a)) {
            boolean zIsEmpty = this.f98176c.isEmpty();
            pv60 pv60Var = this.f98180g;
            if (zIsEmpty) {
                duringCreated(pv60Var.m171611v("", f98171j)).subscribe(mkd0.m154956H(new e30() { // from class: l.ujh
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f176767a.m122038F1((roj0) obj);
                    }
                }, new e30() { // from class: l.vjh
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        flh.m121987D0((Throwable) obj);
                    }
                }));
            } else {
                duringCreated(pv60Var.m171611v(this.f98176c.get(0).f56011id, f98171j)).subscribe(mkd0.m154956H(new e30() { // from class: l.sjh
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f164838a.m122037E1((roj0) obj);
                    }
                }, new e30() { // from class: l.tjh
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        flh.m122020o0((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: S1 */
    public void m122047S1(final e30<Boolean> e30Var) {
        if ("activities".equals(this.f98174a)) {
            boolean zIsEmpty = this.f98176c.isEmpty();
            pv60 pv60Var = this.f98180g;
            if (zIsEmpty) {
                duringCreated(pv60Var.m171611v("", f98171j)).subscribe(mkd0.m154956H(new e30() { // from class: l.qkh
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        e30Var.call(Boolean.TRUE);
                    }
                }, new e30() { // from class: l.rkh
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        e30Var.call(Boolean.FALSE);
                    }
                }));
            } else {
                duringCreated(pv60Var.m171611v(this.f98176c.get(0).f56011id, f98171j)).subscribe(mkd0.m154956H(new e30() { // from class: l.okh
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        e30Var.call(Boolean.TRUE);
                    }
                }, new e30() { // from class: l.pkh
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        e30Var.call(Boolean.FALSE);
                    }
                }));
            }
        }
    }

    @Override // p149l.zkg
    /* JADX INFO: renamed from: T0 */
    public void mo64760T0(PhotoAlbumActivitiesView photoAlbumActivitiesView) {
        if (m122057h1()) {
            photoAlbumActivitiesView.setFrom(PhotoAlbumActivitiesAct.f42244j);
        } else {
            photoAlbumActivitiesView.setFrom("activities");
        }
    }

    /* JADX INFO: renamed from: T1 */
    public final void m122048T1() {
        if (this.f98182i) {
            return;
        }
        this.f98182i = true;
        duringCreated(this.f98180g.m171606J(this.f98181h)).subscribe(mkd0.m154956H(new e30() { // from class: l.xjh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193215a.m122040I1((j760) obj);
            }
        }, new e30() { // from class: l.yjh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198634a.m122041J1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U1 */
    public final void m122049U1(int i) {
        f98173l = i;
    }

    /* JADX INFO: renamed from: V1 */
    public void m122050V1() {
        if (nkg.m159898p()) {
            duringCreated(ijb0.m136570j().distinctUntilChanged()).map(new w9j() { // from class: l.zkh
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Integer.valueOf(((Counter) obj).activities.unread);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.alh
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f70434a.m122042L1((Integer) obj);
                }
            }));
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.blh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76186a.m122022p1((Bundle) obj);
            }
        }, new d30() { // from class: l.clh
            @Override // p149l.d30
            public final void call() {
                this.f81412a.m122024q1();
            }
        });
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.dlh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f86805a.m122026r1((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m122064u1(j760<Links, List<MomentActivity>> j760Var) {
        ((pjh) this.viewModel).m169851E();
        m121999Q1(j760Var);
        ((pjh) this.viewModel).m169863w(this.f98178e);
    }

    /* JADX INFO: renamed from: b1 */
    public void m122052b1(final String str) {
        ArrayList arrayListM200339n = vwb.m200339n(this.f98176c, new w9j() { // from class: l.wjh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((MomentActivity) obj).reference.f39232id.equals(str));
            }
        });
        this.f98176c = arrayListM200339n;
        this.f98177d = arrayListM200339n;
        ((pjh) this.viewModel).m169864x(arrayListM200339n);
    }

    /* JADX INFO: renamed from: c1 */
    public final int m122053c1() {
        return f98173l;
    }

    @Override // p149l.zkg
    /* JADX INFO: renamed from: d0 */
    public void mo64771d0() {
        ((pjh) this.viewModel).m169854H(m122008e1(this.f98181h));
    }

    /* JADX INFO: renamed from: d1 */
    public void m122054d1() {
        ((pjh) this.viewModel).mo107467n();
        Iterator<MomentActivity> it = this.f98176c.iterator();
        while (it.hasNext()) {
            it.next().read = true;
        }
        List<MomentActivity> list = this.f98176c;
        this.f98177d = list;
        ((pjh) this.viewModel).m169864x(list);
    }

    @Override // p149l.zkg
    /* JADX INFO: renamed from: e */
    public void mo64773e(int i) {
        if (i < this.f98177d.size() - 4 || this.f98177d.size() <= 0 || !m122008e1(this.f98181h)) {
            return;
        }
        if (nkg.m159866W() && m122057h1()) {
            m122048T1();
        } else {
            if (this.f98182i) {
                return;
            }
            this.f98182i = true;
            duringCreated(this.f98180g.m171601E(this.f98181h)).subscribe(mkd0.m154956H(new e30() { // from class: l.elh
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f92097a.m122034B1((j760) obj);
                }
            }, new e30() { // from class: l.rjh
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f159688a.m122035C1((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: f1 */
    public void m122055f1(String str, boolean z, boolean z2) {
        this.f98174a = str;
        this.f98179f = z;
        this.f98178e = z2;
    }

    /* JADX INFO: renamed from: g1 */
    public Links m122056g1(Links links) {
        if (nkg.m159887j0() && !TextUtils.isEmpty(links.next) && !links.next.contains("filter")) {
            StringBuilder sb = new StringBuilder();
            sb.append(links.next);
            sb.append("&filter=");
            sb.append(this.f98175b == 2 ? f98172k : f98171j);
            links.next = sb.toString();
        }
        return links;
    }

    public void getData() {
        boolean zM122057h1 = m122057h1();
        pv60 pv60Var = this.f98180g;
        if (zM122057h1) {
            duringCreated(pv60Var.m171607K()).subscribe(mkd0.m154956H(new e30() { // from class: l.dkh
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f86647a.m122059j1((j760) obj);
                }
            }, new e30() { // from class: l.ekh
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f91978a.m122060k1((Throwable) obj);
                }
            }));
            if (this.f98179f && !nkg.m159866W()) {
                this.f98180g.m171608L();
            }
        } else {
            duringCreated(pv60Var.m171602F(this.f98175b == 2 ? f98172k : f98171j)).subscribe(mkd0.m154956H(new e30() { // from class: l.fkh
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f98067a.m122016l1((j760) obj);
                }
            }, new e30() { // from class: l.gkh
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f103195a.m122018m1((Throwable) obj);
                }
            }));
            m122045P1();
        }
        duringCreated(FeedModule.f38855d.f193061p0).subscribe(mkd0.m154955G(new e30() { // from class: l.hkh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108194a.m122061n1((Moment) obj);
            }
        }));
        duringCreated(FeedModule.f38855d.f193012Q0).subscribe(mkd0.m154955G(new e30() { // from class: l.ikh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113673a.m122062o1((j760) obj);
            }
        }));
    }

    @Override // p149l.zkg
    public String getFrom() {
        return this.f98174a;
    }

    /* JADX INFO: renamed from: h1 */
    public boolean m122057h1() {
        return PhotoAlbumActivitiesAct.f42244j.equals(this.f98174a);
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m122058i1(final String str, roj0 roj0Var) {
        this.f98176c.remove((MomentActivity) vwb.m200346r(this.f98176c, new w9j() { // from class: l.ykh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equals(((MomentActivity) obj).f56011id));
            }
        }));
        List<MomentActivity> list = this.f98176c;
        this.f98177d = list;
        ((pjh) this.viewModel).m169864x(list);
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m122059j1(j760 j760Var) {
        ((pjh) this.viewModel).m169851E();
        m121999Q1(j760Var);
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m122060k1(Throwable th) {
        ((pjh) this.viewModel).m169852F(false);
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m122061n1(final Moment moment) {
        this.f98178e = false;
        ArrayList arrayListM200339n = vwb.m200339n(this.f98176c, new w9j() { // from class: l.nkh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((MomentActivity) obj).reference.f39232id.equals(moment.f56011id));
            }
        });
        this.f98176c = arrayListM200339n;
        this.f98177d = arrayListM200339n;
        ((pjh) this.viewModel).m169864x(arrayListM200339n);
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m122062o1(j760 j760Var) {
        List<MomentActivity> list = this.f98176c;
        this.f98177d = list;
        ((pjh) this.viewModel).m169864x(list);
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m122065v1(Throwable th) {
        ((pjh) this.viewModel).m169852F(false);
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ Boolean m122066x1(MomentActivity momentActivity) {
        return Boolean.valueOf(TEnum.equals(momentActivity.action, "like") && !this.f98176c.contains(momentActivity));
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ Boolean m122067z1(MomentActivity momentActivity) {
        return Boolean.valueOf(!this.f98176c.contains(momentActivity));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
