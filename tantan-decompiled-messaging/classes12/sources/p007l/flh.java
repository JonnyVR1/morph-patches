package p007l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.data.Counter;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentActivity;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumActivitiesView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.p1.mobile.android.app.c;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import l.d30;
import l.e30;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.s7m;
import l.vwb;
import l.w9j;
import l.xaj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class flh extends jq2<pjh> implements zkg {

    /* JADX INFO: renamed from: j */
    public static String f8138j = "interaction";

    /* JADX INFO: renamed from: k */
    public static String f8139k = "friend";

    /* JADX INFO: renamed from: l */
    public static int f8140l;

    /* JADX INFO: renamed from: a */
    public String f8141a;

    /* JADX INFO: renamed from: b */
    public int f8142b;

    /* JADX INFO: renamed from: c */
    public List<MomentActivity> f8143c;

    /* JADX INFO: renamed from: d */
    public List<MomentActivity> f8144d;

    /* JADX INFO: renamed from: e */
    public boolean f8145e;

    /* JADX INFO: renamed from: f */
    public boolean f8146f;

    /* JADX INFO: renamed from: g */
    public pv60 f8147g;

    /* JADX INFO: renamed from: h */
    public Links f8148h;

    /* JADX INFO: renamed from: i */
    public boolean f8149i;

    public flh(mcr mcrVar) {
        super(mcrVar);
        this.f8143c = new LinkedList();
        this.f8144d = new ArrayList();
        this.f8145e = false;
        this.f8147g = new pv60();
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ void m10129C0(Throwable th) {
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m10130D0(Throwable th) {
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m10141Q0(Throwable th) {
    }

    /* JADX INFO: renamed from: Q1 */
    private void m10142Q1(j760<Links, List<MomentActivity>> j760Var) {
        this.f8143c.clear();
        this.f8148h = m10199g1((Links) j760Var.a);
        if (m10200h1()) {
            this.f8143c.addAll(vwb.n((Collection) j760Var.b, new w9j() { // from class: l.zjh
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((MomentActivity) obj).action, "like"));
                }
            }));
        } else if ("activities".equals(this.f8141a) && NullChecker.a(j760Var.b)) {
            this.f8143c.addAll((Collection) j760Var.b);
        }
        ((pjh) ((jq2) this).viewModel).m13052I(this.f8143c.size() > 0);
        List<MomentActivity> list = this.f8143c;
        this.f8144d = list;
        ((pjh) ((jq2) this).viewModel).m13061x(list);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m10150e0(Throwable th) {
    }

    /* JADX INFO: renamed from: e1 */
    private boolean m10151e1(Links links) {
        return links == null || !TextUtils.isEmpty(links.next);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public /* synthetic */ void m10159l1(j760 j760Var) {
        ((pjh) ((jq2) this).viewModel).m13048E();
        m10142Q1(j760Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public /* synthetic */ void m10161m1(Throwable th) {
        ((pjh) ((jq2) this).viewModel).m13049F(false);
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m10163o0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public /* synthetic */ void m10165p1(Bundle bundle) {
        s7m s7mVar = ((jq2) this).viewModel;
        if (s7mVar instanceof bx60) {
            ((bx60) s7mVar).m9051r();
        }
        getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public /* synthetic */ void m10167q1() {
        if ("activities".equals(this.f8141a)) {
            act().setResult(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public /* synthetic */ void m10169r1(c cVar) {
        if (cVar == c.i && this.f8145e) {
            ((pjh) ((jq2) this).viewModel).m13053i();
            ((pjh) ((jq2) this).viewModel).m13059v();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public /* synthetic */ void m10172t1(Throwable th) {
        ((pjh) ((jq2) this).viewModel).m13049F(false);
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m10177B1(j760 j760Var) {
        this.f8148h = m10199g1((Links) j760Var.a);
        vwb.f0(new MomentActivity[0]);
        if (m10200h1()) {
            this.f8143c.addAll(vwb.n((Collection) j760Var.b, new w9j() { // from class: l.akh
                public final Object call(Object obj) {
                    return this.f5765a.m10209x1((MomentActivity) obj);
                }
            }));
        } else if ("activities".equals(this.f8141a)) {
            this.f8143c.addAll(vwb.n((Collection) j760Var.b, new w9j() { // from class: l.ckh
                public final Object call(Object obj) {
                    return this.f6665a.m10210z1((MomentActivity) obj);
                }
            }));
        }
        List<MomentActivity> list = this.f8143c;
        this.f8144d = list;
        ((pjh) ((jq2) this).viewModel).m13061x(list);
        this.f8149i = false;
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ void m10178C1(Throwable th) {
        this.f8149i = false;
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ void m10179D1(xaj0 xaj0Var) {
        m10192U1(((Integer) xaj0Var.c).intValue());
        ((pjh) ((jq2) this).viewModel).mo9206y((List) xaj0Var.b, ((Integer) xaj0Var.c).intValue());
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m10180E1(roj0 roj0Var) {
        m10197d1();
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m10181F1(roj0 roj0Var) {
        m10197d1();
    }

    @Override // p007l.zkg
    /* JADX INFO: renamed from: G3 */
    public void mo5853G3(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        duringCreated(this.f8147g.m13263u(str)).subscribe(mkd0.H(new e30() { // from class: l.vkh
            public final void call(Object obj) {
                this.f14183a.m10201i1(str, (roj0) obj);
            }
        }, new e30() { // from class: l.wkh
            public final void call(Object obj) {
                flh.m10141Q0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ Boolean m10182H1(MomentActivity momentActivity) {
        return Boolean.valueOf(!this.f8143c.contains(momentActivity));
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m10183I1(j760 j760Var) {
        this.f8148h = m10199g1((Links) j760Var.a);
        this.f8143c.addAll(vwb.n((Collection) j760Var.b, new w9j() { // from class: l.lkh
            public final Object call(Object obj) {
                return this.f10059a.m10182H1((MomentActivity) obj);
            }
        }));
        List<MomentActivity> list = this.f8143c;
        this.f8144d = list;
        ((pjh) ((jq2) this).viewModel).m13061x(list);
        this.f8149i = false;
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m10184J1(Throwable th) {
        this.f8149i = false;
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m10185L1(Integer num) {
        boolean zM10122d = flg.m10122d(num.intValue());
        boolean zM10121c = flg.m10121c(num.intValue(), m10196c1());
        if (!zM10122d && !zM10121c) {
            if (flg.m10120b(num.intValue())) {
                ((pjh) ((jq2) this).viewModel).m13046B();
            }
        } else {
            if (zM10122d) {
                ((pjh) ((jq2) this).viewModel).m13045A();
            }
            if (zM10121c) {
                ((pjh) ((jq2) this).viewModel).m13047C(m10196c1());
            }
        }
    }

    @Override // p007l.zkg
    /* JADX INFO: renamed from: L3 */
    public void mo5854L3() {
        boolean z = false;
        if (this.f8144d.size() > 0 && this.f8144d.size() > 0 && !((DbObject) this.f8144d.get(0)).id.equals(((DbObject) this.f8144d.get(0)).id)) {
            z = true;
        }
        ((pjh) ((jq2) this).viewModel).m13050G(z);
    }

    @Override // p007l.zkg
    /* JADX INFO: renamed from: M1 */
    public void mo5855M1(String str, int i) {
        if ("activities".equals(this.f8141a)) {
            duringCreated(this.f8147g.m13266x(f8138j, str, i)).subscribe(mkd0.H(new e30() { // from class: l.skh
                public final void call(Object obj) {
                    this.f12976a.m10186N1((String) obj);
                }
            }, new e30() { // from class: l.tkh
                public final void call(Object obj) {
                    flh.m10129C0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: N1 */
    public final /* synthetic */ void m10186N1(final String str) {
        MomentActivity momentActivity = (MomentActivity) vwb.r(this.f8143c, new w9j() { // from class: l.ukh
            public final Object call(Object obj) {
                return Boolean.valueOf(((DbObject) ((MomentActivity) obj)).id.equals(str));
            }
        });
        if (NullChecker.a(momentActivity)) {
            momentActivity.read = true;
            List<MomentActivity> list = this.f8143c;
            this.f8144d = list;
            ((pjh) ((jq2) this).viewModel).m13061x(list);
        }
    }

    /* JADX INFO: renamed from: O1 */
    public void m10187O1() {
        boolean zM10200h1 = m10200h1();
        pv60 pv60Var = this.f8147g;
        if (zM10200h1) {
            duringCreated(pv60Var.m13260K()).subscribe(mkd0.H(new e30() { // from class: l.qjh
                public final void call(Object obj) {
                    this.f12257a.m10206s1((j760) obj);
                }
            }, new e30() { // from class: l.bkh
                public final void call(Object obj) {
                    this.f6342a.m10172t1((Throwable) obj);
                }
            }));
        } else {
            duringCreated(pv60Var.m13255F(this.f8142b == 2 ? f8139k : f8138j)).subscribe(mkd0.H(new e30() { // from class: l.mkh
                public final void call(Object obj) {
                    this.f10484a.m10207u1((j760) obj);
                }
            }, new e30() { // from class: l.xkh
                public final void call(Object obj) {
                    this.f15030a.m10208v1((Throwable) obj);
                }
            }));
            m10188P1();
        }
    }

    /* JADX INFO: renamed from: P1 */
    public void m10188P1() {
        duringCreated(this.f8147g.m13257H()).subscribe(mkd0.H(new e30() { // from class: l.jkh
            public final void call(Object obj) {
                this.f9381a.m10179D1((xaj0) obj);
            }
        }, new e30() { // from class: l.kkh
            public final void call(Object obj) {
                flh.m10150e0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R1 */
    public void m10189R1() {
        if ("activities".equals(this.f8141a)) {
            boolean zIsEmpty = this.f8143c.isEmpty();
            pv60 pv60Var = this.f8147g;
            if (zIsEmpty) {
                duringCreated(pv60Var.m13264v("", f8138j)).subscribe(mkd0.H(new e30() { // from class: l.ujh
                    public final void call(Object obj) {
                        this.f13842a.m10181F1((roj0) obj);
                    }
                }, new e30() { // from class: l.vjh
                    public final void call(Object obj) {
                        flh.m10130D0((Throwable) obj);
                    }
                }));
            } else {
                duringCreated(pv60Var.m13264v(((DbObject) this.f8143c.get(0)).id, f8138j)).subscribe(mkd0.H(new e30() { // from class: l.sjh
                    public final void call(Object obj) {
                        this.f12967a.m10180E1((roj0) obj);
                    }
                }, new e30() { // from class: l.tjh
                    public final void call(Object obj) {
                        flh.m10163o0((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: S1 */
    public void m10190S1(final e30<Boolean> e30Var) {
        if ("activities".equals(this.f8141a)) {
            boolean zIsEmpty = this.f8143c.isEmpty();
            pv60 pv60Var = this.f8147g;
            if (zIsEmpty) {
                duringCreated(pv60Var.m13264v("", f8138j)).subscribe(mkd0.H(new e30() { // from class: l.qkh
                    public final void call(Object obj) {
                        e30Var.call(Boolean.TRUE);
                    }
                }, new e30() { // from class: l.rkh
                    public final void call(Object obj) {
                        e30Var.call(Boolean.FALSE);
                    }
                }));
            } else {
                duringCreated(pv60Var.m13264v(((DbObject) this.f8143c.get(0)).id, f8138j)).subscribe(mkd0.H(new e30() { // from class: l.okh
                    public final void call(Object obj) {
                        e30Var.call(Boolean.TRUE);
                    }
                }, new e30() { // from class: l.pkh
                    public final void call(Object obj) {
                        e30Var.call(Boolean.FALSE);
                    }
                }));
            }
        }
    }

    @Override // p007l.zkg
    /* JADX INFO: renamed from: T0 */
    public void mo5856T0(PhotoAlbumActivitiesView photoAlbumActivitiesView) {
        if (m10200h1()) {
            photoAlbumActivitiesView.setFrom(PhotoAlbumActivitiesAct.f3705j);
        } else {
            photoAlbumActivitiesView.setFrom("activities");
        }
    }

    /* JADX INFO: renamed from: T1 */
    public final void m10191T1() {
        if (this.f8149i) {
            return;
        }
        this.f8149i = true;
        duringCreated(this.f8147g.m13259J(this.f8148h)).subscribe(mkd0.H(new e30() { // from class: l.xjh
            public final void call(Object obj) {
                this.f15021a.m10183I1((j760) obj);
            }
        }, new e30() { // from class: l.yjh
            public final void call(Object obj) {
                this.f15455a.m10184J1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U1 */
    public final void m10192U1(int i) {
        f8140l = i;
    }

    /* JADX INFO: renamed from: V1 */
    public void m10193V1() {
        if (nkg.m12257p()) {
            duringCreated(ijb0.m10923j().distinctUntilChanged()).map(new w9j() { // from class: l.zkh
                public final Object call(Object obj) {
                    return Integer.valueOf(((Counter) obj).activities.unread);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.alh
                public final void call(Object obj) {
                    this.f5775a.m10185L1((Integer) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void mo8909a0() {
        creates(new e30() { // from class: l.blh
            public final void call(Object obj) {
                this.f6366a.m10165p1((Bundle) obj);
            }
        }, new d30() { // from class: l.clh
            public final void call() {
                this.f6682a.m10167q1();
            }
        });
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.dlh
            public final void call(Object obj) {
                this.f6989a.m10169r1((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m10207u1(j760<Links, List<MomentActivity>> j760Var) {
        ((pjh) ((jq2) this).viewModel).m13048E();
        m10142Q1(j760Var);
        ((pjh) ((jq2) this).viewModel).m13060w(this.f8145e);
    }

    /* JADX INFO: renamed from: b1 */
    public void m10195b1(final String str) {
        ArrayList arrayListN = vwb.n(this.f8143c, new w9j() { // from class: l.wjh
            public final Object call(Object obj) {
                return Boolean.valueOf(!((MomentActivity) obj).reference.f693id.equals(str));
            }
        });
        this.f8143c = arrayListN;
        this.f8144d = arrayListN;
        ((pjh) ((jq2) this).viewModel).m13061x(arrayListN);
    }

    /* JADX INFO: renamed from: c1 */
    public final int m10196c1() {
        return f8140l;
    }

    @Override // p007l.zkg
    /* JADX INFO: renamed from: d0 */
    public void mo5867d0() {
        ((pjh) ((jq2) this).viewModel).m13051H(m10151e1(this.f8148h));
    }

    /* JADX INFO: renamed from: d1 */
    public void m10197d1() {
        ((pjh) ((jq2) this).viewModel).mo9204n();
        Iterator<MomentActivity> it = this.f8143c.iterator();
        while (it.hasNext()) {
            it.next().read = true;
        }
        List<MomentActivity> list = this.f8143c;
        this.f8144d = list;
        ((pjh) ((jq2) this).viewModel).m13061x(list);
    }

    @Override // p007l.zkg
    /* JADX INFO: renamed from: e */
    public void mo5869e(int i) {
        if (i < this.f8144d.size() - 4 || this.f8144d.size() <= 0 || !m10151e1(this.f8148h)) {
            return;
        }
        if (nkg.m12225W() && m10200h1()) {
            m10191T1();
        } else {
            if (this.f8149i) {
                return;
            }
            this.f8149i = true;
            duringCreated(this.f8147g.m13254E(this.f8148h)).subscribe(mkd0.H(new e30() { // from class: l.elh
                public final void call(Object obj) {
                    this.f7419a.m10177B1((j760) obj);
                }
            }, new e30() { // from class: l.rjh
                public final void call(Object obj) {
                    this.f12660a.m10178C1((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: f1 */
    public void m10198f1(String str, boolean z, boolean z2) {
        this.f8141a = str;
        this.f8146f = z;
        this.f8145e = z2;
    }

    /* JADX INFO: renamed from: g1 */
    public Links m10199g1(Links links) {
        if (nkg.m12246j0() && !TextUtils.isEmpty(links.next) && !links.next.contains("filter")) {
            StringBuilder sb = new StringBuilder();
            sb.append(links.next);
            sb.append("&filter=");
            sb.append(this.f8142b == 2 ? f8139k : f8138j);
            links.next = sb.toString();
        }
        return links;
    }

    public void getData() {
        boolean zM10200h1 = m10200h1();
        pv60 pv60Var = this.f8147g;
        if (zM10200h1) {
            duringCreated(pv60Var.m13260K()).subscribe(mkd0.H(new e30() { // from class: l.dkh
                public final void call(Object obj) {
                    this.f6969a.m10202j1((j760) obj);
                }
            }, new e30() { // from class: l.ekh
                public final void call(Object obj) {
                    this.f7407a.m10203k1((Throwable) obj);
                }
            }));
            if (this.f8146f && !nkg.m12225W()) {
                this.f8147g.m13261L();
            }
        } else {
            duringCreated(pv60Var.m13255F(this.f8142b == 2 ? f8139k : f8138j)).subscribe(mkd0.H(new e30() { // from class: l.fkh
                public final void call(Object obj) {
                    this.f8124a.m10159l1((j760) obj);
                }
            }, new e30() { // from class: l.gkh
                public final void call(Object obj) {
                    this.f8471a.m10161m1((Throwable) obj);
                }
            }));
            m10188P1();
        }
        duringCreated(FeedModule.f316d.f14996p0).subscribe(mkd0.G(new e30() { // from class: l.hkh
            public final void call(Object obj) {
                this.f8759a.m10204n1((Moment) obj);
            }
        }));
        duringCreated(FeedModule.f316d.f14947Q0).subscribe(mkd0.G(new e30() { // from class: l.ikh
            public final void call(Object obj) {
                this.f9049a.m10205o1((j760) obj);
            }
        }));
    }

    @Override // p007l.zkg
    public String getFrom() {
        return this.f8141a;
    }

    /* JADX INFO: renamed from: h1 */
    public boolean m10200h1() {
        return PhotoAlbumActivitiesAct.f3705j.equals(this.f8141a);
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m10201i1(final String str, roj0 roj0Var) {
        this.f8143c.remove((MomentActivity) vwb.r(this.f8143c, new w9j() { // from class: l.ykh
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equals(((DbObject) ((MomentActivity) obj)).id));
            }
        }));
        List<MomentActivity> list = this.f8143c;
        this.f8144d = list;
        ((pjh) ((jq2) this).viewModel).m13061x(list);
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m10202j1(j760 j760Var) {
        ((pjh) ((jq2) this).viewModel).m13048E();
        m10142Q1(j760Var);
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m10203k1(Throwable th) {
        ((pjh) ((jq2) this).viewModel).m13049F(false);
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m10204n1(final Moment moment) {
        this.f8145e = false;
        ArrayList arrayListN = vwb.n(this.f8143c, new w9j() { // from class: l.nkh
            public final Object call(Object obj) {
                return Boolean.valueOf(!((MomentActivity) obj).reference.f693id.equals(((DbObject) moment).id));
            }
        });
        this.f8143c = arrayListN;
        this.f8144d = arrayListN;
        ((pjh) ((jq2) this).viewModel).m13061x(arrayListN);
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m10205o1(j760 j760Var) {
        List<MomentActivity> list = this.f8143c;
        this.f8144d = list;
        ((pjh) ((jq2) this).viewModel).m13061x(list);
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m10208v1(Throwable th) {
        ((pjh) ((jq2) this).viewModel).m13049F(false);
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ Boolean m10209x1(MomentActivity momentActivity) {
        return Boolean.valueOf(TEnum.equals(momentActivity.action, "like") && !this.f8143c.contains(momentActivity));
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ Boolean m10210z1(MomentActivity momentActivity) {
        return Boolean.valueOf(!this.f8143c.contains(momentActivity));
    }

    public void destroy() {
    }
}
