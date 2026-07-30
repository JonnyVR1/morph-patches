package com.p051p1.mobile.putong.core.p058ui.visitor;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.VisitorFilterSettings;
import com.p051p1.mobile.putong.core.data.VisitorSetting;
import com.p051p1.mobile.putong.core.p058ui.visitor.C9210c;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.NewVisitors;
import com.p051p1.mobile.putong.data.RecommendVisitors;
import com.p051p1.mobile.putong.data.UnPrivilegedVisitor;
import com.p051p1.mobile.putong.data.Visitor;
import com.p051p1.mobile.putong.data.VisitorCounter;
import com.p051p1.mobile.putong.data.VisitorInfo;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p153l.ar2;
import p153l.cfm0;
import p153l.joa;
import p153l.jyb;
import p153l.ner;
import p153l.pcj;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.r1j0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.c */
/* JADX INFO: loaded from: classes12.dex */
public class C9210c extends ar2<C9211d> implements AbstractC9208a.a {

    /* JADX INFO: renamed from: a */
    public final List<cfm0> f38990a;

    /* JADX INFO: renamed from: b */
    public boolean f38991b;

    /* JADX INFO: renamed from: c */
    public String f38992c;

    /* JADX INFO: renamed from: d */
    public Links f38993d;

    /* JADX INFO: renamed from: e */
    public boolean f38994e;

    /* JADX INFO: renamed from: f */
    public boolean f38995f;

    /* JADX INFO: renamed from: g */
    public final VisitorFilterSettings f38996g;

    /* JADX INFO: renamed from: h */
    public int f38997h;

    public C9210c(ner nerVar) {
        super(nerVar);
        this.f38990a = new ArrayList();
        this.f38995f = false;
        this.f38996g = CoreModule.f18264c.f20410n2.m121465K3().mo225055clone();
        this.f38997h = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public /* synthetic */ void m59056U0(Bundle bundle) {
        ((C9211d) this.viewModel).m59139y(this.f38995f);
        if (!this.f38991b) {
            if (CoreModule.m30933P().m143405a().mo180463f()) {
                m59086L0();
            }
        } else {
            getData();
            if (CoreModule.m30933P().m143405a().mo180463f() && !joa.m146357G3() && "p_see_who_likes_me_view_membership".equals(this.f38992c)) {
                ((C9211d) this.viewModel).m59125M("p_navigation_visit,button_pull");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public /* synthetic */ void m59057V0(Boolean bool) {
        if (this.f38991b) {
            ((C9211d) this.viewModel).m59135v();
            getData();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m59064k0() {
        if (CoreModule.m30933P().m143405a().mo180463f()) {
            CoreModule.f18264c.f20406m1.m35730s5();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m59065l0(Throwable th) {
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m59070q0(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m59072s0(Throwable th) {
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ void m59077z0(Throwable th) {
        if (th instanceof TantanException.Client.TantanForbidden) {
            r1j0.m179420g("此功能24小時只能修改一次");
        }
    }

    /* JADX INFO: renamed from: C0 */
    public boolean m59078C0() {
        return !this.f38996g.equals(CoreModule.f18264c.f20410n2.m121465K3());
    }

    /* JADX INFO: renamed from: D0 */
    public VisitorFilterSettings m59079D0() {
        return this.f38996g;
    }

    /* JADX INFO: renamed from: E0 */
    public final boolean m59080E0(VisitorInfo visitorInfo) {
        return !jyb.m147479J(visitorInfo.allVisitors.visitors);
    }

    /* JADX INFO: renamed from: F0 */
    public boolean m59081F0(Links links) {
        return (links == null || TextUtils.isEmpty(links.next)) ? false : true;
    }

    /* JADX INFO: renamed from: G0 */
    public final boolean m59082G0(VisitorInfo visitorInfo) {
        NewVisitors newVisitors = visitorInfo.newVisitors;
        return newVisitors.totalCount > 0 && newVisitors.visitors.size() > 0;
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m59083H0(VisitorInfo visitorInfo) {
        RecommendVisitors recommendVisitors = visitorInfo.recommendVisitors;
        return recommendVisitors.totalCount > 0 && recommendVisitors.visitors.size() > 0;
    }

    /* JADX INFO: renamed from: I0 */
    public final boolean m59084I0(VisitorInfo visitorInfo) {
        return visitorInfo.unprivilegedVisitors.size() > 0;
    }

    /* JADX INFO: renamed from: J0 */
    public void m59085J0(boolean z, String str, boolean z2) {
        this.f38991b = z;
        this.f38992c = str;
        this.f38995f = z2;
    }

    /* JADX INFO: renamed from: L0 */
    public void m59086L0() {
        if (!CoreModule.m30933P().m143405a().mo180463f() || joa.m146357G3()) {
            CoreModule.f18264c.f20410n2.m121481a4(CoreModule.m30929H().userId(), "list", "", true);
        } else {
            CoreModule.f18264c.f20410n2.m121497q4(true);
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m59087N0(pf60 pf60Var) {
        ((C9211d) this.viewModel).m59126N();
        m59100e1(pf60Var);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m59088O0(Throwable th) {
        ((C9211d) this.viewModel).m59127O(false);
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m59089P0(pf60 pf60Var) {
        ((C9211d) this.viewModel).m59126N();
        m59100e1(pf60Var);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m59090Q0(Throwable th) {
        ((C9211d) this.viewModel).m59127O(false);
        ((C9211d) this.viewModel).m59124L(this.f38990a);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m59091R0(VisitorSetting visitorSetting) {
        if (visitorSetting.userId.equals(CoreModule.m30929H().userId())) {
            boolean z = this.f38991b;
            boolean z2 = visitorSetting.visitorPermission;
            if (z ^ z2) {
                this.f38991b = z2;
                ((C9211d) this.viewModel).m59130R();
            }
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m59092S0(VisitorSetting visitorSetting) {
        if (visitorSetting.userId.equals(CoreModule.m30929H().userId())) {
            boolean z = this.f38991b;
            boolean z2 = visitorSetting.visitorPermission;
            if (z ^ z2) {
                this.f38991b = z2;
                ((C9211d) this.viewModel).m59130R();
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m59093W0(Boolean bool) {
        ((C9211d) this.viewModel).m59129Q(bool.booleanValue(), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m59094X0(pf60 pf60Var) {
        int i;
        this.f38993d = (Links) pf60Var.f152156a;
        VisitorInfo visitorInfo = (VisitorInfo) pf60Var.f152157b;
        if (NullChecker.m82486a(visitorInfo)) {
            visitorInfo.nullCheck();
            if (visitorInfo.allVisitors.visitors.size() + visitorInfo.newVisitors.visitors.size() + visitorInfo.recommendVisitors.visitors.size() > 10 || !m59081F0(this.f38993d) || (i = this.f38997h) >= 10) {
                this.f38997h = 0;
            } else {
                this.f38997h = i + 1;
                m59097b1();
            }
            if (m59082G0(visitorInfo)) {
                m59103h1("", visitorInfo.newVisitors.visitors, -1);
                if (m59080E0(visitorInfo)) {
                    m59103h1("全部", visitorInfo.allVisitors.visitors, -3);
                    this.f38994e = true;
                }
            } else if (m59080E0(visitorInfo)) {
                m59103h1(this.f38994e ? "" : "全部", visitorInfo.allVisitors.visitors, -3);
                this.f38994e = true;
            }
        } else {
            this.f38997h = 0;
        }
        ((C9211d) this.viewModel).m59124L(this.f38990a);
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m59095Y0(Throwable th) {
        this.f38997h = 0;
        ((C9211d) this.viewModel).m59124L(this.f38990a);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        if (CoreModule.m30933P().m143410g().mo36055d4()) {
            duringCreated(CoreModule.f18264c.f20410n2.f94740S).subscribe(psd0.m173597H(new y20() { // from class: l.hu00
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f111613a.m59091R0((VisitorSetting) obj);
                }
            }, new y20() { // from class: l.iu00
                @Override // p153l.y20
                public final void call(Object obj) {
                    C9210c.m59065l0((Throwable) obj);
                }
            }));
        }
        duringCreated(CoreModule.f18264c.f20410n2.m121464J3(CoreModule.m30929H().userId())).subscribe(psd0.m173597H(new y20() { // from class: l.ju00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122687a.m59092S0((VisitorSetting) obj);
            }
        }, new y20() { // from class: l.ku00
            @Override // p153l.y20
            public final void call(Object obj) {
                C9210c.m59072s0((Throwable) obj);
            }
        }));
        creates(new y20() { // from class: l.rt00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164762a.m59056U0((Bundle) obj);
            }
        }, new x20() { // from class: l.st00
            @Override // p153l.x20
            public final void call() {
                C9210c.m59064k0();
            }
        });
        duringCreated(CoreModule.m30930K().mo31762eb()).skip(1).subscribe(psd0.m173596G(new y20() { // from class: l.tt00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176048a.m59057V0((Boolean) obj);
            }
        }));
        if (CoreModule.m30933P().m143410g().mo36055d4()) {
            duringCreated(CoreModule.f18264c.f20410n2.m121499s4()).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.ut00
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f180885a.m59093W0((Boolean) obj);
                }
            }));
        }
        if (!CoreModule.m30933P().m143405a().mo34485dd() || CoreModule.m30933P().m143405a().mo180437a2()) {
            return;
        }
        CoreModule.m30933P().m143410g().mo36024Og(act(), "p_navigation_visit,default", new y20() { // from class: l.vt00
            @Override // p153l.y20
            public final void call(Object obj) {
                C9210c.m59070q0((PurchaseType) obj);
            }
        }, null, null, Privilege.oDiamondVisitor);
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m59096a1(VisitorSetting visitorSetting) {
        this.f38991b = visitorSetting.visitorPermission;
        ((C9211d) this.viewModel).m59128P();
        ((C9211d) this.viewModel).m59129Q(this.f38991b, true);
    }

    /* JADX INFO: renamed from: b1 */
    public final void m59097b1() {
        duringCreated(CoreModule.f18264c.f20410n2.m121482b4(CoreModule.m30929H().userId(), this.f38993d, "list", true)).subscribe(psd0.m173597H(new y20() { // from class: l.xt00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196177a.m59094X0((pf60) obj);
            }
        }, new y20() { // from class: l.yt00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201480a.m59095Y0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c1 */
    public void m59098c1() {
        this.f38997h = 0;
        this.f38993d = null;
        getData();
    }

    /* JADX INFO: renamed from: d1 */
    public void m59099d1(boolean z) {
        if (this.f38991b ^ z) {
            duringCreated(CoreModule.f18264c.f20410n2.m121488h4(CoreModule.m30929H().userId(), z)).subscribe(psd0.m173597H(new y20() { // from class: l.au00
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f73461a.m59096a1((VisitorSetting) obj);
                }
            }, new y20() { // from class: l.cu00
                @Override // p153l.y20
                public final void call(Object obj) {
                    C9210c.m59077z0((Throwable) obj);
                }
            }));
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.visitor.AbstractC9208a.a
    /* JADX INFO: renamed from: e */
    public void mo59048e(int i) {
        if (i < this.f38990a.size() - 4 || this.f38990a.size() <= 0 || !m59081F0(this.f38993d)) {
            return;
        }
        if ((!CoreModule.m30933P().m143405a().mo180463f() || joa.m146357G3()) && this.f38997h == 0) {
            m59097b1();
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final void m59100e1(pf60<Links, VisitorInfo> pf60Var) {
        this.f38990a.clear();
        this.f38993d = pf60Var.f152156a;
        if (NullChecker.m82486a(pf60Var.f152157b)) {
            VisitorInfo visitorInfo = pf60Var.f152157b;
            if (CoreModule.m30933P().m143405a().mo180463f() && !joa.m146357G3() && m59084I0(visitorInfo)) {
                m59102g1(pf60Var.f152157b.unprivilegedVisitors);
            } else if (m59082G0(visitorInfo)) {
                m59103h1("新访客", visitorInfo.newVisitors.visitors, -1);
                if (m59080E0(visitorInfo)) {
                    m59103h1("全部", visitorInfo.allVisitors.visitors, -3);
                    this.f38994e = true;
                }
            } else if (m59083H0(visitorInfo)) {
                if (!CoreModule.m30933P().m143405a().mo180463f() || !joa.m146357G3()) {
                    m59103h1("推荐", visitorInfo.recommendVisitors.visitors, -2);
                }
                if (m59080E0(visitorInfo)) {
                    m59103h1("全部", visitorInfo.allVisitors.visitors, -3);
                    this.f38994e = true;
                }
            } else if (m59080E0(visitorInfo)) {
                m59103h1("", visitorInfo.allVisitors.visitors, -3);
            }
        }
        ((C9211d) this.viewModel).m59124L(this.f38990a);
    }

    /* JADX INFO: renamed from: f1 */
    public void m59101f1() {
        CoreModule.f18264c.f20410n2.m121489i4(this.f38996g);
    }

    /* JADX INFO: renamed from: g1 */
    public final void m59102g1(List<UnPrivilegedVisitor> list) {
        int i = 0;
        while (i < list.size()) {
            final UnPrivilegedVisitor unPrivilegedVisitor = list.get(i);
            if (!jyb.m147520m(this.f38990a, new qcj() { // from class: l.wt00
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    cfm0 cfm0Var = (cfm0) obj;
                    return Boolean.valueOf(NullChecker.m82486a(cfm0Var.f81526d) && cfm0Var.f81526d.userId.equals(unPrivilegedVisitor.userId));
                }
            })) {
                this.f38990a.add(new cfm0(unPrivilegedVisitor, i != 0));
            }
            i++;
        }
        VisitorCounter visitorCounterMo31797mc = CoreModule.m30930K().mo31797mc();
        if (NullChecker.m82486a(visitorCounterMo31797mc)) {
            this.f38990a.add(new cfm0(String.format("%s人看过我 · 开通黑金会员一键解锁", Integer.valueOf(visitorCounterMo31797mc.totalCnt)), false));
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.visitor.AbstractC9208a.a
    public void getData() {
        if (CoreModule.m30933P().m143405a().mo180463f() && !joa.m146357G3()) {
            duringCreated(new pcj() { // from class: l.qt00
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return CoreModule.f18264c.f20410n2.m121497q4(true);
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.bu00
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f78420a.m59087N0((pf60) obj);
                }
            }, new y20() { // from class: l.du00
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f90665a.m59088O0((Throwable) obj);
                }
            }));
        } else {
            final String str = "";
            duringCreated(new pcj() { // from class: l.eu00
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return CoreModule.f18264c.f20410n2.m121481a4(CoreModule.m30929H().userId(), "list", str, true);
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.fu00
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f100832a.m59089P0((pf60) obj);
                }
            }, new y20() { // from class: l.gu00
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f106462a.m59090Q0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: h1 */
    public final void m59103h1(String str, List<Visitor> list, int i) {
        if (!TextUtils.isEmpty(str)) {
            this.f38990a.add(new cfm0(Visitor.new_(), str, i));
        }
        for (final Visitor visitor : list) {
            if (!jyb.m147520m(this.f38990a, new qcj() { // from class: l.zt00
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    cfm0 cfm0Var = (cfm0) obj;
                    return Boolean.valueOf(NullChecker.m82486a(cfm0Var.f81524b) && cfm0Var.f81524b.userId.equals(visitor.userId));
                }
            })) {
                this.f38990a.add(new cfm0(visitor, null, i));
            }
        }
    }
}
