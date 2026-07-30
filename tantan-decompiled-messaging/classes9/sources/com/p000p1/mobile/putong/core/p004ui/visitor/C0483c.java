package com.p000p1.mobile.putong.core.p004ui.visitor;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.visitor.C0483c;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.VisitorFilterSettings;
import com.p1.mobile.putong.core.data.VisitorSetting;
import com.p1.mobile.putong.data.Links;
import com.p1.mobile.putong.data.NewVisitors;
import com.p1.mobile.putong.data.RecommendVisitors;
import com.p1.mobile.putong.data.UnPrivilegedVisitor;
import com.p1.mobile.putong.data.Visitor;
import com.p1.mobile.putong.data.VisitorCounter;
import com.p1.mobile.putong.data.VisitorInfo;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.e30;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.osi0;
import l.v9j;
import l.vwb;
import l.w9j;
import p006l.xma;
import p006l.y5m0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.c */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0483c extends jq2<C0484d> implements AbstractC0481a.a {

    /* JADX INFO: renamed from: a */
    public final List<y5m0> f7923a;

    /* JADX INFO: renamed from: b */
    public boolean f7924b;

    /* JADX INFO: renamed from: c */
    public String f7925c;

    /* JADX INFO: renamed from: d */
    public Links f7926d;

    /* JADX INFO: renamed from: e */
    public boolean f7927e;

    /* JADX INFO: renamed from: f */
    public boolean f7928f;

    /* JADX INFO: renamed from: g */
    public final VisitorFilterSettings f7929g;

    /* JADX INFO: renamed from: h */
    public int f7930h;

    public C0483c(mcr mcrVar) {
        super(mcrVar);
        this.f7923a = new ArrayList();
        this.f7928f = false;
        this.f7929g = CoreModule.f1534c.f3657n2.m22250K3().clone();
        this.f7930h = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public /* synthetic */ void m11386U0(Bundle bundle) {
        ((C0484d) ((jq2) this).viewModel).m11472y(this.f7928f);
        if (!this.f7924b) {
            if (CoreModule.m1854P().m11706a().m19879f()) {
                m11416L0();
            }
        } else {
            getData();
            if (CoreModule.m1854P().m11706a().m19879f() && !xma.m27351F3() && "p_see_who_likes_me_view_membership".equals(this.f7925c)) {
                ((C0484d) ((jq2) this).viewModel).m11457M("p_navigation_visit,button_pull");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public /* synthetic */ void m11387V0(Boolean bool) {
        if (this.f7924b) {
            ((C0484d) ((jq2) this).viewModel).m11468v();
            getData();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m11394k0() {
        if (CoreModule.m1854P().m11706a().m19879f()) {
            CoreModule.f1534c.f3653m1.m6664s5();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m11395l0(Throwable th) {
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m11400q0(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m11402s0(Throwable th) {
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ void m11407z0(Throwable th) {
        if (th instanceof TantanException.Client.TantanForbidden) {
            osi0.g("此功能24小時只能修改一次");
        }
    }

    /* JADX INFO: renamed from: C0 */
    public boolean m11408C0() {
        return !this.f7929g.equals(CoreModule.f1534c.f3657n2.m22250K3());
    }

    /* JADX INFO: renamed from: D0 */
    public VisitorFilterSettings m11409D0() {
        return this.f7929g;
    }

    /* JADX INFO: renamed from: E0 */
    public final boolean m11410E0(VisitorInfo visitorInfo) {
        return !vwb.J(visitorInfo.allVisitors.visitors);
    }

    /* JADX INFO: renamed from: F0 */
    public boolean m11411F0(Links links) {
        return (links == null || TextUtils.isEmpty(links.next)) ? false : true;
    }

    /* JADX INFO: renamed from: G0 */
    public final boolean m11412G0(VisitorInfo visitorInfo) {
        NewVisitors newVisitors = visitorInfo.newVisitors;
        return newVisitors.totalCount > 0 && newVisitors.visitors.size() > 0;
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m11413H0(VisitorInfo visitorInfo) {
        RecommendVisitors recommendVisitors = visitorInfo.recommendVisitors;
        return recommendVisitors.totalCount > 0 && recommendVisitors.visitors.size() > 0;
    }

    /* JADX INFO: renamed from: I0 */
    public final boolean m11414I0(VisitorInfo visitorInfo) {
        return visitorInfo.unprivilegedVisitors.size() > 0;
    }

    /* JADX INFO: renamed from: J0 */
    public void m11415J0(boolean z, String str, boolean z2) {
        this.f7924b = z;
        this.f7925c = str;
        this.f7928f = z2;
    }

    /* JADX INFO: renamed from: L0 */
    public void m11416L0() {
        if (!CoreModule.m1854P().m11706a().m19879f() || xma.m27351F3()) {
            CoreModule.f1534c.f3657n2.m22266a4(CoreModule.m1850H().userId(), "list", "", true);
        } else {
            CoreModule.f1534c.f3657n2.m22282q4(true);
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m11417N0(j760 j760Var) {
        ((C0484d) ((jq2) this).viewModel).m11458N();
        m11431e1(j760Var);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m11418O0(Throwable th) {
        ((C0484d) ((jq2) this).viewModel).m11459O(false);
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m11419P0(j760 j760Var) {
        ((C0484d) ((jq2) this).viewModel).m11458N();
        m11431e1(j760Var);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m11420Q0(Throwable th) {
        ((C0484d) ((jq2) this).viewModel).m11459O(false);
        ((C0484d) ((jq2) this).viewModel).m11456L(this.f7923a);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m11421R0(VisitorSetting visitorSetting) {
        if (visitorSetting.userId.equals(CoreModule.m1850H().userId())) {
            boolean z = this.f7924b;
            boolean z2 = visitorSetting.visitorPermission;
            if (z ^ z2) {
                this.f7924b = z2;
                ((C0484d) ((jq2) this).viewModel).m11462R();
            }
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m11422S0(VisitorSetting visitorSetting) {
        if (visitorSetting.userId.equals(CoreModule.m1850H().userId())) {
            boolean z = this.f7924b;
            boolean z2 = visitorSetting.visitorPermission;
            if (z ^ z2) {
                this.f7924b = z2;
                ((C0484d) ((jq2) this).viewModel).m11462R();
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m11423W0(Boolean bool) {
        ((C0484d) ((jq2) this).viewModel).m11461Q(bool.booleanValue(), false);
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m11424X0(j760 j760Var) {
        int i;
        this.f7926d = (Links) j760Var.a;
        VisitorInfo visitorInfo = (VisitorInfo) j760Var.b;
        if (NullChecker.a(visitorInfo)) {
            visitorInfo.nullCheck();
            if (visitorInfo.allVisitors.visitors.size() + visitorInfo.newVisitors.visitors.size() + visitorInfo.recommendVisitors.visitors.size() > 10 || !m11411F0(this.f7926d) || (i = this.f7930h) >= 10) {
                this.f7930h = 0;
            } else {
                this.f7930h = i + 1;
                m11428b1();
            }
            if (m11412G0(visitorInfo)) {
                m11434h1("", visitorInfo.newVisitors.visitors, -1);
                if (m11410E0(visitorInfo)) {
                    m11434h1("全部", visitorInfo.allVisitors.visitors, -3);
                    this.f7927e = true;
                }
            } else if (m11410E0(visitorInfo)) {
                m11434h1(this.f7927e ? "" : "全部", visitorInfo.allVisitors.visitors, -3);
                this.f7927e = true;
            }
        } else {
            this.f7930h = 0;
        }
        ((C0484d) ((jq2) this).viewModel).m11456L(this.f7923a);
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m11425Y0(Throwable th) {
        this.f7930h = 0;
        ((C0484d) ((jq2) this).viewModel).m11456L(this.f7923a);
    }

    /* JADX INFO: renamed from: a0 */
    public void m11426a0() {
        if (CoreModule.m1854P().m11711g().m6989d4()) {
            duringCreated(CoreModule.f1534c.f3657n2.f19889S).subscribe(mkd0.H(new e30() { // from class: l.yl00
                public final void call(Object obj) {
                    this.f28281a.m11421R0((VisitorSetting) obj);
                }
            }, new e30() { // from class: l.zl00
                public final void call(Object obj) {
                    C0483c.m11395l0((Throwable) obj);
                }
            }));
        }
        duringCreated(CoreModule.f1534c.f3657n2.m22249J3(CoreModule.m1850H().userId())).subscribe(mkd0.H(new e30() { // from class: l.am00
            public final void call(Object obj) {
                this.f8353a.m11422S0((VisitorSetting) obj);
            }
        }, new e30() { // from class: l.bm00
            public final void call(Object obj) {
                C0483c.m11402s0((Throwable) obj);
            }
        }));
        creates(new e30() { // from class: l.il00
            public final void call(Object obj) {
                this.f14538a.m11386U0((Bundle) obj);
            }
        }, new d30() { // from class: l.jl00
            public final void call() {
                C0483c.m11394k0();
            }
        });
        duringCreated(CoreModule.m1851K().eb()).skip(1).subscribe(mkd0.G(new e30() { // from class: l.kl00
            public final void call(Object obj) {
                this.f15871a.m11387V0((Boolean) obj);
            }
        }));
        if (CoreModule.m1854P().m11711g().m6989d4()) {
            duringCreated(CoreModule.f1534c.f3657n2.m22284s4()).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.ll00
                public final void call(Object obj) {
                    this.f16486a.m11423W0((Boolean) obj);
                }
            }));
        }
        if (!CoreModule.m1854P().m11706a().m5419dd() || CoreModule.m1854P().m11706a().m19853a2()) {
            return;
        }
        CoreModule.m1854P().m11711g().m6958Og(act(), "p_navigation_visit,default", new e30() { // from class: l.ml00
            public final void call(Object obj) {
                C0483c.m11400q0((PurchaseType) obj);
            }
        }, null, null, Privilege.oDiamondVisitor);
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m11427a1(VisitorSetting visitorSetting) {
        this.f7924b = visitorSetting.visitorPermission;
        ((C0484d) ((jq2) this).viewModel).m11460P();
        ((C0484d) ((jq2) this).viewModel).m11461Q(this.f7924b, true);
    }

    /* JADX INFO: renamed from: b1 */
    public final void m11428b1() {
        duringCreated(CoreModule.f1534c.f3657n2.m22267b4(CoreModule.m1850H().userId(), this.f7926d, "list", true)).subscribe(mkd0.H(new e30() { // from class: l.ol00
            public final void call(Object obj) {
                this.f18270a.m11424X0((j760) obj);
            }
        }, new e30() { // from class: l.pl00
            public final void call(Object obj) {
                this.f19181a.m11425Y0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c1 */
    public void m11429c1() {
        this.f7930h = 0;
        this.f7926d = null;
        getData();
    }

    /* JADX INFO: renamed from: d1 */
    public void m11430d1(boolean z) {
        if (this.f7924b ^ z) {
            duringCreated(CoreModule.f1534c.f3657n2.m22273h4(CoreModule.m1850H().userId(), z)).subscribe(mkd0.H(new e30() { // from class: l.rl00
                public final void call(Object obj) {
                    this.f20599a.m11427a1((VisitorSetting) obj);
                }
            }, new e30() { // from class: l.tl00
                public final void call(Object obj) {
                    C0483c.m11407z0((Throwable) obj);
                }
            }));
        }
    }

    public void destroy() {
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.visitor.AbstractC0481a.a
    /* JADX INFO: renamed from: e */
    public void mo11374e(int i) {
        if (i < this.f7923a.size() - 4 || this.f7923a.size() <= 0 || !m11411F0(this.f7926d)) {
            return;
        }
        if ((!CoreModule.m1854P().m11706a().m19879f() || xma.m27351F3()) && this.f7930h == 0) {
            m11428b1();
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final void m11431e1(j760<Links, VisitorInfo> j760Var) {
        this.f7923a.clear();
        this.f7926d = (Links) j760Var.a;
        if (NullChecker.a(j760Var.b)) {
            VisitorInfo visitorInfo = (VisitorInfo) j760Var.b;
            if (CoreModule.m1854P().m11706a().m19879f() && !xma.m27351F3() && m11414I0(visitorInfo)) {
                m11433g1(((VisitorInfo) j760Var.b).unprivilegedVisitors);
            } else if (m11412G0(visitorInfo)) {
                m11434h1("新访客", visitorInfo.newVisitors.visitors, -1);
                if (m11410E0(visitorInfo)) {
                    m11434h1("全部", visitorInfo.allVisitors.visitors, -3);
                    this.f7927e = true;
                }
            } else if (m11413H0(visitorInfo)) {
                if (!CoreModule.m1854P().m11706a().m19879f() || !xma.m27351F3()) {
                    m11434h1("推荐", visitorInfo.recommendVisitors.visitors, -2);
                }
                if (m11410E0(visitorInfo)) {
                    m11434h1("全部", visitorInfo.allVisitors.visitors, -3);
                    this.f7927e = true;
                }
            } else if (m11410E0(visitorInfo)) {
                m11434h1("", visitorInfo.allVisitors.visitors, -3);
            }
        }
        ((C0484d) ((jq2) this).viewModel).m11456L(this.f7923a);
    }

    /* JADX INFO: renamed from: f1 */
    public void m11432f1() {
        CoreModule.f1534c.f3657n2.m22274i4(this.f7929g);
    }

    /* JADX INFO: renamed from: g1 */
    public final void m11433g1(List<UnPrivilegedVisitor> list) {
        int i = 0;
        while (i < list.size()) {
            final UnPrivilegedVisitor unPrivilegedVisitor = list.get(i);
            if (!vwb.m(this.f7923a, new w9j() { // from class: l.nl00
                public final Object call(Object obj) {
                    y5m0 y5m0Var = (y5m0) obj;
                    return Boolean.valueOf(NullChecker.a(y5m0Var.f28036d) && y5m0Var.f28036d.userId.equals(unPrivilegedVisitor.userId));
                }
            })) {
                this.f7923a.add(new y5m0(unPrivilegedVisitor, i != 0));
            }
            i++;
        }
        VisitorCounter visitorCounterMc = CoreModule.m1851K().mc();
        if (NullChecker.a(visitorCounterMc)) {
            this.f7923a.add(new y5m0(String.format("%s人看过我 · 开通黑金会员一键解锁", Integer.valueOf(visitorCounterMc.totalCnt)), false));
        }
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.visitor.AbstractC0481a.a
    public void getData() {
        if (CoreModule.m1854P().m11706a().m19879f() && !xma.m27351F3()) {
            duringCreated(new v9j() { // from class: l.hl00
                public final Object call() {
                    return CoreModule.f1534c.f3657n2.m22282q4(true);
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.sl00
                public final void call(Object obj) {
                    this.f21411a.m11417N0((j760) obj);
                }
            }, new e30() { // from class: l.ul00
                public final void call(Object obj) {
                    this.f23596a.m11418O0((Throwable) obj);
                }
            }));
        } else {
            final String str = "";
            duringCreated(new v9j() { // from class: l.vl00
                public final Object call() {
                    return CoreModule.f1534c.f3657n2.m22266a4(CoreModule.m1850H().userId(), "list", str, true);
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.wl00
                public final void call(Object obj) {
                    this.f25211a.m11419P0((j760) obj);
                }
            }, new e30() { // from class: l.xl00
                public final void call(Object obj) {
                    this.f27576a.m11420Q0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: h1 */
    public final void m11434h1(String str, List<Visitor> list, int i) {
        if (!TextUtils.isEmpty(str)) {
            this.f7923a.add(new y5m0(Visitor.new_(), str, i));
        }
        for (final Visitor visitor : list) {
            if (!vwb.m(this.f7923a, new w9j() { // from class: l.ql00
                public final Object call(Object obj) {
                    y5m0 y5m0Var = (y5m0) obj;
                    return Boolean.valueOf(NullChecker.a(y5m0Var.f28034b) && y5m0Var.f28034b.userId.equals(visitor.userId));
                }
            })) {
                this.f7923a.add(new y5m0(visitor, null, i));
            }
        }
    }
}
