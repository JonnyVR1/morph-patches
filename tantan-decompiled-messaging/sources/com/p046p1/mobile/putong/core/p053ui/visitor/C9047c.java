package com.p046p1.mobile.putong.core.p053ui.visitor;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.VisitorFilterSettings;
import com.p046p1.mobile.putong.core.data.VisitorSetting;
import com.p046p1.mobile.putong.core.p053ui.visitor.C9047c;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.NewVisitors;
import com.p046p1.mobile.putong.data.RecommendVisitors;
import com.p046p1.mobile.putong.data.UnPrivilegedVisitor;
import com.p046p1.mobile.putong.data.Visitor;
import com.p046p1.mobile.putong.data.VisitorCounter;
import com.p046p1.mobile.putong.data.VisitorInfo;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p149l.d30;
import p149l.e30;
import p149l.j760;
import p149l.jq2;
import p149l.mcr;
import p149l.mkd0;
import p149l.osi0;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;
import p149l.xma;
import p149l.y5m0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.c */
/* JADX INFO: loaded from: classes9.dex */
public class C9047c extends jq2<C9048d> implements AbstractC9045a.a {

    /* JADX INFO: renamed from: a */
    public final List<y5m0> f38142a;

    /* JADX INFO: renamed from: b */
    public boolean f38143b;

    /* JADX INFO: renamed from: c */
    public String f38144c;

    /* JADX INFO: renamed from: d */
    public Links f38145d;

    /* JADX INFO: renamed from: e */
    public boolean f38146e;

    /* JADX INFO: renamed from: f */
    public boolean f38147f;

    /* JADX INFO: renamed from: g */
    public final VisitorFilterSettings f38148g;

    /* JADX INFO: renamed from: h */
    public int f38149h;

    public C9047c(mcr mcrVar) {
        super(mcrVar);
        this.f38142a = new ArrayList();
        this.f38147f = false;
        this.f38148g = CoreModule.f17545c.f19668n2.m175434K3().mo223809clone();
        this.f38149h = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public /* synthetic */ void m57873U0(Bundle bundle) {
        ((C9048d) this.viewModel).m57956y(this.f38147f);
        if (!this.f38143b) {
            if (CoreModule.m29935P().m94651a().mo158371f()) {
                m57903L0();
            }
        } else {
            getData();
            if (CoreModule.m29935P().m94651a().mo158371f() && !xma.m210043F3() && "p_see_who_likes_me_view_membership".equals(this.f38144c)) {
                ((C9048d) this.viewModel).m57942M("p_navigation_visit,button_pull");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public /* synthetic */ void m57874V0(Boolean bool) {
        if (this.f38143b) {
            ((C9048d) this.viewModel).m57952v();
            getData();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m57881k0() {
        if (CoreModule.m29935P().m94651a().mo158371f()) {
            CoreModule.f17545c.f19664m1.m34727s5();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m57882l0(Throwable th) {
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m57887q0(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m57889s0(Throwable th) {
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ void m57894z0(Throwable th) {
        if (th instanceof TantanException.Client.TantanForbidden) {
            osi0.m165783g("此功能24小時只能修改一次");
        }
    }

    /* JADX INFO: renamed from: C0 */
    public boolean m57895C0() {
        return !this.f38148g.equals(CoreModule.f17545c.f19668n2.m175434K3());
    }

    /* JADX INFO: renamed from: D0 */
    public VisitorFilterSettings m57896D0() {
        return this.f38148g;
    }

    /* JADX INFO: renamed from: E0 */
    public final boolean m57897E0(VisitorInfo visitorInfo) {
        return !vwb.m200296J(visitorInfo.allVisitors.visitors);
    }

    /* JADX INFO: renamed from: F0 */
    public boolean m57898F0(Links links) {
        return (links == null || TextUtils.isEmpty(links.next)) ? false : true;
    }

    /* JADX INFO: renamed from: G0 */
    public final boolean m57899G0(VisitorInfo visitorInfo) {
        NewVisitors newVisitors = visitorInfo.newVisitors;
        return newVisitors.totalCount > 0 && newVisitors.visitors.size() > 0;
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m57900H0(VisitorInfo visitorInfo) {
        RecommendVisitors recommendVisitors = visitorInfo.recommendVisitors;
        return recommendVisitors.totalCount > 0 && recommendVisitors.visitors.size() > 0;
    }

    /* JADX INFO: renamed from: I0 */
    public final boolean m57901I0(VisitorInfo visitorInfo) {
        return visitorInfo.unprivilegedVisitors.size() > 0;
    }

    /* JADX INFO: renamed from: J0 */
    public void m57902J0(boolean z, String str, boolean z2) {
        this.f38143b = z;
        this.f38144c = str;
        this.f38147f = z2;
    }

    /* JADX INFO: renamed from: L0 */
    public void m57903L0() {
        if (!CoreModule.m29935P().m94651a().mo158371f() || xma.m210043F3()) {
            CoreModule.f17545c.f19668n2.m175450a4(CoreModule.m29931H().userId(), "list", "", true);
        } else {
            CoreModule.f17545c.f19668n2.m175466q4(true);
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m57904N0(j760 j760Var) {
        ((C9048d) this.viewModel).m57943N();
        m57917e1(j760Var);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m57905O0(Throwable th) {
        ((C9048d) this.viewModel).m57944O(false);
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m57906P0(j760 j760Var) {
        ((C9048d) this.viewModel).m57943N();
        m57917e1(j760Var);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m57907Q0(Throwable th) {
        ((C9048d) this.viewModel).m57944O(false);
        ((C9048d) this.viewModel).m57941L(this.f38142a);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m57908R0(VisitorSetting visitorSetting) {
        if (visitorSetting.userId.equals(CoreModule.m29931H().userId())) {
            boolean z = this.f38143b;
            boolean z2 = visitorSetting.visitorPermission;
            if (z ^ z2) {
                this.f38143b = z2;
                ((C9048d) this.viewModel).m57947R();
            }
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m57909S0(VisitorSetting visitorSetting) {
        if (visitorSetting.userId.equals(CoreModule.m29931H().userId())) {
            boolean z = this.f38143b;
            boolean z2 = visitorSetting.visitorPermission;
            if (z ^ z2) {
                this.f38143b = z2;
                ((C9048d) this.viewModel).m57947R();
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m57910W0(Boolean bool) {
        ((C9048d) this.viewModel).m57946Q(bool.booleanValue(), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m57911X0(j760 j760Var) {
        int i;
        this.f38145d = (Links) j760Var.f116564a;
        VisitorInfo visitorInfo = (VisitorInfo) j760Var.f116565b;
        if (NullChecker.m81303a(visitorInfo)) {
            visitorInfo.nullCheck();
            if (visitorInfo.allVisitors.visitors.size() + visitorInfo.newVisitors.visitors.size() + visitorInfo.recommendVisitors.visitors.size() > 10 || !m57898F0(this.f38145d) || (i = this.f38149h) >= 10) {
                this.f38149h = 0;
            } else {
                this.f38149h = i + 1;
                m57914b1();
            }
            if (m57899G0(visitorInfo)) {
                m57920h1("", visitorInfo.newVisitors.visitors, -1);
                if (m57897E0(visitorInfo)) {
                    m57920h1("全部", visitorInfo.allVisitors.visitors, -3);
                    this.f38146e = true;
                }
            } else if (m57897E0(visitorInfo)) {
                m57920h1(this.f38146e ? "" : "全部", visitorInfo.allVisitors.visitors, -3);
                this.f38146e = true;
            }
        } else {
            this.f38149h = 0;
        }
        ((C9048d) this.viewModel).m57941L(this.f38142a);
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m57912Y0(Throwable th) {
        this.f38149h = 0;
        ((C9048d) this.viewModel).m57941L(this.f38142a);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        if (CoreModule.m29935P().m94656g().mo35052d4()) {
            duringCreated(CoreModule.f17545c.f19668n2.f155205S).subscribe(mkd0.m154956H(new e30() { // from class: l.yl00
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f198853a.m57908R0((VisitorSetting) obj);
                }
            }, new e30() { // from class: l.zl00
                @Override // p149l.e30
                public final void call(Object obj) {
                    C9047c.m57882l0((Throwable) obj);
                }
            }));
        }
        duringCreated(CoreModule.f17545c.f19668n2.m175433J3(CoreModule.m29931H().userId())).subscribe(mkd0.m154956H(new e30() { // from class: l.am00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70539a.m57909S0((VisitorSetting) obj);
            }
        }, new e30() { // from class: l.bm00
            @Override // p149l.e30
            public final void call(Object obj) {
                C9047c.m57889s0((Throwable) obj);
            }
        }));
        creates(new e30() { // from class: l.il00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113759a.m57873U0((Bundle) obj);
            }
        }, new d30() { // from class: l.jl00
            @Override // p149l.d30
            public final void call() {
                C9047c.m57881k0();
            }
        });
        duringCreated(CoreModule.m29932K().mo30759eb()).skip(1).subscribe(mkd0.m154955G(new e30() { // from class: l.kl00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123617a.m57874V0((Boolean) obj);
            }
        }));
        if (CoreModule.m29935P().m94656g().mo35052d4()) {
            duringCreated(CoreModule.f17545c.f19668n2.m175468s4()).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.ll00
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f128630a.m57910W0((Boolean) obj);
                }
            }));
        }
        if (!CoreModule.m29935P().m94651a().mo33482dd() || CoreModule.m29935P().m94651a().mo158345a2()) {
            return;
        }
        CoreModule.m29935P().m94656g().mo35021Og(act(), "p_navigation_visit,default", new e30() { // from class: l.ml00
            @Override // p149l.e30
            public final void call(Object obj) {
                C9047c.m57887q0((PurchaseType) obj);
            }
        }, null, null, Privilege.oDiamondVisitor);
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m57913a1(VisitorSetting visitorSetting) {
        this.f38143b = visitorSetting.visitorPermission;
        ((C9048d) this.viewModel).m57945P();
        ((C9048d) this.viewModel).m57946Q(this.f38143b, true);
    }

    /* JADX INFO: renamed from: b1 */
    public final void m57914b1() {
        duringCreated(CoreModule.f17545c.f19668n2.m175451b4(CoreModule.m29931H().userId(), this.f38145d, "list", true)).subscribe(mkd0.m154956H(new e30() { // from class: l.ol00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144472a.m57911X0((j760) obj);
            }
        }, new e30() { // from class: l.pl00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150050a.m57912Y0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c1 */
    public void m57915c1() {
        this.f38149h = 0;
        this.f38145d = null;
        getData();
    }

    /* JADX INFO: renamed from: d1 */
    public void m57916d1(boolean z) {
        if (this.f38143b ^ z) {
            duringCreated(CoreModule.f17545c.f19668n2.m175457h4(CoreModule.m29931H().userId(), z)).subscribe(mkd0.m154956H(new e30() { // from class: l.rl00
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f159920a.m57913a1((VisitorSetting) obj);
                }
            }, new e30() { // from class: l.tl00
                @Override // p149l.e30
                public final void call(Object obj) {
                    C9047c.m57894z0((Throwable) obj);
                }
            }));
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.visitor.AbstractC9045a.a
    /* JADX INFO: renamed from: e */
    public void mo57865e(int i) {
        if (i < this.f38142a.size() - 4 || this.f38142a.size() <= 0 || !m57898F0(this.f38145d)) {
            return;
        }
        if ((!CoreModule.m29935P().m94651a().mo158371f() || xma.m210043F3()) && this.f38149h == 0) {
            m57914b1();
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final void m57917e1(j760<Links, VisitorInfo> j760Var) {
        this.f38142a.clear();
        this.f38145d = j760Var.f116564a;
        if (NullChecker.m81303a(j760Var.f116565b)) {
            VisitorInfo visitorInfo = j760Var.f116565b;
            if (CoreModule.m29935P().m94651a().mo158371f() && !xma.m210043F3() && m57901I0(visitorInfo)) {
                m57919g1(j760Var.f116565b.unprivilegedVisitors);
            } else if (m57899G0(visitorInfo)) {
                m57920h1("新访客", visitorInfo.newVisitors.visitors, -1);
                if (m57897E0(visitorInfo)) {
                    m57920h1("全部", visitorInfo.allVisitors.visitors, -3);
                    this.f38146e = true;
                }
            } else if (m57900H0(visitorInfo)) {
                if (!CoreModule.m29935P().m94651a().mo158371f() || !xma.m210043F3()) {
                    m57920h1("推荐", visitorInfo.recommendVisitors.visitors, -2);
                }
                if (m57897E0(visitorInfo)) {
                    m57920h1("全部", visitorInfo.allVisitors.visitors, -3);
                    this.f38146e = true;
                }
            } else if (m57897E0(visitorInfo)) {
                m57920h1("", visitorInfo.allVisitors.visitors, -3);
            }
        }
        ((C9048d) this.viewModel).m57941L(this.f38142a);
    }

    /* JADX INFO: renamed from: f1 */
    public void m57918f1() {
        CoreModule.f17545c.f19668n2.m175458i4(this.f38148g);
    }

    /* JADX INFO: renamed from: g1 */
    public final void m57919g1(List<UnPrivilegedVisitor> list) {
        int i = 0;
        while (i < list.size()) {
            final UnPrivilegedVisitor unPrivilegedVisitor = list.get(i);
            if (!vwb.m200337m(this.f38142a, new w9j() { // from class: l.nl00
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    y5m0 y5m0Var = (y5m0) obj;
                    return Boolean.valueOf(NullChecker.m81303a(y5m0Var.f196457d) && y5m0Var.f196457d.userId.equals(unPrivilegedVisitor.userId));
                }
            })) {
                this.f38142a.add(new y5m0(unPrivilegedVisitor, i != 0));
            }
            i++;
        }
        VisitorCounter visitorCounterMo30794mc = CoreModule.m29932K().mo30794mc();
        if (NullChecker.m81303a(visitorCounterMo30794mc)) {
            this.f38142a.add(new y5m0(String.format("%s人看过我 · 开通黑金会员一键解锁", Integer.valueOf(visitorCounterMo30794mc.totalCnt)), false));
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.visitor.AbstractC9045a.a
    public void getData() {
        if (CoreModule.m29935P().m94651a().mo158371f() && !xma.m210043F3()) {
            duringCreated(new v9j() { // from class: l.hl00
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return CoreModule.f17545c.f19668n2.m175466q4(true);
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.sl00
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f165053a.m57904N0((j760) obj);
                }
            }, new e30() { // from class: l.ul00
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f177005a.m57905O0((Throwable) obj);
                }
            }));
        } else {
            final String str = "";
            duringCreated(new v9j() { // from class: l.vl00
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return CoreModule.f17545c.f19668n2.m175450a4(CoreModule.m29931H().userId(), "list", str, true);
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.wl00
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f186855a.m57906P0((j760) obj);
                }
            }, new e30() { // from class: l.xl00
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f193370a.m57907Q0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: h1 */
    public final void m57920h1(String str, List<Visitor> list, int i) {
        if (!TextUtils.isEmpty(str)) {
            this.f38142a.add(new y5m0(Visitor.new_(), str, i));
        }
        for (final Visitor visitor : list) {
            if (!vwb.m200337m(this.f38142a, new w9j() { // from class: l.ql00
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    y5m0 y5m0Var = (y5m0) obj;
                    return Boolean.valueOf(NullChecker.m81303a(y5m0Var.f196455b) && y5m0Var.f196455b.userId.equals(visitor.userId));
                }
            })) {
                this.f38142a.add(new y5m0(visitor, null, i));
            }
        }
    }
}
