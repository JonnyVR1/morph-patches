package com.p051p1.mobile.putong.core.p058ui.visitor.frag;

import android.os.Bundle;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.VisitorSetting;
import com.p051p1.mobile.putong.core.p058ui.visitor.AbstractC9208a;
import com.p051p1.mobile.putong.core.p058ui.visitor.frag.VisitorTabPresenter;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.NewVisitors;
import com.p051p1.mobile.putong.data.RecommendVisitors;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.UnPrivilegedVisitor;
import com.p051p1.mobile.putong.data.Visitor;
import com.p051p1.mobile.putong.data.VisitorCounter;
import com.p051p1.mobile.putong.data.VisitorInfo;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p153l.ar2;
import p153l.cfm0;
import p153l.e7d0;
import p153l.joa;
import p153l.jyb;
import p153l.pcj;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.sgm0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\f2\u0016\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0012J-\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00132\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010\u0012J\u0017\u0010!\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\u0012J\u000f\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\fH\u0016¢\u0006\u0004\b$\u0010#J\r\u0010%\u001a\u00020\f¢\u0006\u0004\b%\u0010#J\u000f\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010#J\u000f\u0010'\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010#J\u0017\u0010)\u001a\u00020\f2\b\b\u0002\u0010(\u001a\u00020\u0010¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\f¢\u0006\u0004\b+\u0010#J\u0017\u0010-\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u001cH\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00102\b\u0010/\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b0\u00101R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0016\u00108\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R$\u0010>\u001a\u0012\u0012\u0004\u0012\u00020:09j\b\u0012\u0004\u0012\u00020:`;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010/\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u00107R\u0016\u0010D\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR(\u0010G\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabPresenter;", "Ll/ar2;", "Ll/sgm0;", "Lcom/p1/mobile/putong/core/ui/visitor/a$a;", "Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabFragment;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabFragment;)V", "Ll/pf60;", "Lcom/p1/mobile/putong/data/Links;", "Lcom/p1/mobile/putong/data/VisitorInfo;", "pair", "", "S0", "(Ll/pf60;)V", "visitorInfo", "", "O0", "(Lcom/p1/mobile/putong/data/VisitorInfo;)Z", "", "Lcom/p1/mobile/putong/data/UnPrivilegedVisitor;", SchemeKey.visitors, "U0", "(Ljava/util/List;)V", "L0", "", "moduleName", "Lcom/p1/mobile/putong/data/Visitor;", "", "part", "V0", "(Ljava/lang/String;Ljava/util/List;I)V", "I0", "N0", "Q0", "()V", "destroy", "P0", "a0", "getData", "updateLastVisitTime", "H0", "(Z)V", "R0", RXScreenCaptureService.KEY_INDEX, "e", "(I)V", "links", "J0", "(Lcom/p1/mobile/putong/data/Links;)Z", "a", "Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabFragment;", "getFrag", "()Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabFragment;", "b", "Z", "hasPermission", "Ljava/util/ArrayList;", "Ll/cfm0;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "visitorItems", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/data/Links;", "hasShowAllModuleName", "f", "I", "autoLoadMoreRetryCount", "g", "Ll/pf60;", "pairCached", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class VisitorTabPresenter extends ar2<sgm0> implements AbstractC9208a.a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final VisitorTabFragment frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean hasPermission;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<cfm0> visitorItems;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Links links;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean hasShowAllModuleName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int autoLoadMoreRetryCount;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public pf60<Links, VisitorInfo> pairCached;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VisitorTabPresenter(@NotNull VisitorTabFragment visitorTabFragment) {
        super(visitorTabFragment);
        visitorTabFragment.getClass();
        this.frag = visitorTabFragment;
        this.visitorItems = new ArrayList<>();
    }

    /* JADX INFO: renamed from: A0 */
    public static void m59168A0(VisitorTabPresenter visitorTabPresenter, Bundle bundle) {
        ((sgm0) visitorTabPresenter.viewModel).m185814r();
        if (visitorTabPresenter.hasPermission) {
            visitorTabPresenter.getData();
        } else {
            ((sgm0) visitorTabPresenter.viewModel).m185807C(true);
        }
    }

    /* JADX INFO: renamed from: C0 */
    public static C22421c m59169C0(boolean z) {
        return CoreModule.f18264c.f20410n2.m121497q4(z);
    }

    /* JADX INFO: renamed from: D0 */
    public static void m59170D0() {
        e7d0.Companion companion = e7d0.INSTANCE;
        if (companion.m119703d()) {
            companion.m119701b().m119699g(Visitor.TYPE);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public static C22421c m59171E0() {
        return CoreModule.f18264c.f20406m1.m35708Q4();
    }

    /* JADX INFO: renamed from: F0 */
    public static Boolean m59172F0(VisitorSetting visitorSetting) {
        visitorSetting.getClass();
        return Boolean.valueOf(visitorSetting.visitorPermission);
    }

    /* JADX INFO: renamed from: G0 */
    public static Boolean m59173G0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I0 */
    private final boolean m59174I0(VisitorInfo visitorInfo) {
        return !jyb.m147479J(visitorInfo.allVisitors.visitors);
    }

    /* JADX INFO: renamed from: L0 */
    private final boolean m59175L0(VisitorInfo visitorInfo) {
        NewVisitors newVisitors = visitorInfo.newVisitors;
        return newVisitors.totalCount > 0 && newVisitors.visitors.size() > 0;
    }

    /* JADX INFO: renamed from: N0 */
    private final boolean m59176N0(VisitorInfo visitorInfo) {
        RecommendVisitors recommendVisitors = visitorInfo.recommendVisitors;
        return recommendVisitors.totalCount > 0 && recommendVisitors.visitors.size() > 0;
    }

    /* JADX INFO: renamed from: O0 */
    private final boolean m59177O0(VisitorInfo visitorInfo) {
        return visitorInfo.unprivilegedVisitors.size() > 0;
    }

    /* JADX INFO: renamed from: Q0 */
    private final void m59178Q0() {
        duringCreated(CoreModule.f18264c.f20410n2.m121482b4(CoreModule.m30929H().userId(), this.links, "list", true)).subscribe(psd0.m173597H(new y20() { // from class: l.cgm0
            @Override // p153l.y20
            public final void call(Object obj) {
                VisitorTabPresenter.m59199x0(this.f81687a, (pf60) obj);
            }
        }, new y20() { // from class: l.dgm0
            @Override // p153l.y20
            public final void call(Object obj) {
                VisitorTabPresenter.m59200y0(this.f88318a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S0 */
    private final void m59179S0(pf60<Links, VisitorInfo> pair) {
        this.pairCached = pair;
        this.visitorItems.clear();
        this.links = pair.f152156a;
        VisitorInfo visitorInfo = pair.f152157b;
        if (visitorInfo != null) {
            if (CoreModule.m30933P().m143405a().mo180463f() && !joa.m146357G3() && m59177O0(visitorInfo)) {
                List<UnPrivilegedVisitor> list = visitorInfo.unprivilegedVisitors;
                list.getClass();
                m59180U0(list);
            } else if (m59175L0(visitorInfo)) {
                List<Visitor> list2 = visitorInfo.newVisitors.visitors;
                list2.getClass();
                m59181V0("新访客", list2, -1);
                if (m59174I0(visitorInfo)) {
                    List<Visitor> list3 = visitorInfo.allVisitors.visitors;
                    list3.getClass();
                    m59181V0("全部", list3, -3);
                    this.hasShowAllModuleName = true;
                }
            } else if (m59176N0(visitorInfo)) {
                if (!CoreModule.m30933P().m143405a().mo180463f() || !joa.m146357G3()) {
                    List<Visitor> list4 = visitorInfo.recommendVisitors.visitors;
                    list4.getClass();
                    m59181V0("推荐", list4, -2);
                }
                if (m59174I0(visitorInfo)) {
                    List<Visitor> list5 = visitorInfo.allVisitors.visitors;
                    list5.getClass();
                    m59181V0("全部", list5, -3);
                    this.hasShowAllModuleName = true;
                }
            } else if (m59174I0(visitorInfo)) {
                List<Visitor> list6 = visitorInfo.allVisitors.visitors;
                list6.getClass();
                m59181V0("", list6, -3);
            }
        }
        ((sgm0) this.viewModel).m185821z(this.visitorItems);
    }

    /* JADX INFO: renamed from: U0 */
    private final void m59180U0(List<? extends UnPrivilegedVisitor> visitors) {
        int size = visitors.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            final UnPrivilegedVisitor unPrivilegedVisitor = visitors.get(i);
            if (!jyb.m147520m(this.visitorItems, new qcj() { // from class: l.bgm0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return VisitorTabPresenter.m59188k0(unPrivilegedVisitor, (cfm0) obj);
                }
            })) {
                this.visitorItems.add(new cfm0(unPrivilegedVisitor, i != 0));
            }
            i++;
        }
        VisitorCounter visitorCounterM35703N4 = CoreModule.f18264c.f20406m1.m35703N4();
        if (NullChecker.m82486a(visitorCounterM35703N4)) {
            ArrayList<cfm0> arrayList = this.visitorItems;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            visitorCounterM35703N4.getClass();
            arrayList.add(new cfm0(String.format("%s人看过我 · 开通黑金会员一键解锁", Arrays.copyOf(new Object[]{Integer.valueOf(visitorCounterM35703N4.totalCnt)}, 1)), true));
        }
    }

    /* JADX INFO: renamed from: V0 */
    private final void m59181V0(String moduleName, List<? extends Visitor> visitors, int part) {
        if (!TextUtils.isEmpty(moduleName)) {
            this.visitorItems.add(new cfm0(Visitor.new_(), moduleName, part));
        }
        for (final Visitor visitor : visitors) {
            if (!jyb.m147520m(this.visitorItems, new qcj() { // from class: l.egm0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return VisitorTabPresenter.m59190m0(visitor, (cfm0) obj);
                }
            })) {
                this.visitorItems.add(new cfm0(visitor, null, part));
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static void m59182e0(boolean z, VisitorTabPresenter visitorTabPresenter, pf60 pf60Var) {
        if (z) {
            CoreModule.f18264c.f20406m1.m35730s5();
        }
        if (!visitorTabPresenter.hasPermission) {
            ((sgm0) visitorTabPresenter.viewModel).m185807C(true);
        } else {
            pf60Var.getClass();
            visitorTabPresenter.m59179S0(pf60Var);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static void m59183f0(VisitorTabPresenter visitorTabPresenter, String str) {
        if ("visitor_update_time".equals(str)) {
            visitorTabPresenter.m59202H0(true);
        } else {
            visitorTabPresenter.getData();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static Boolean m59184g0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m59185h0(Throwable th) {
    }

    /* JADX INFO: renamed from: i0 */
    public static void m59186i0(boolean z, VisitorTabPresenter visitorTabPresenter, pf60 pf60Var) {
        if (z) {
            CoreModule.f18264c.f20406m1.m35730s5();
        }
        if (!visitorTabPresenter.hasPermission) {
            ((sgm0) visitorTabPresenter.viewModel).m185807C(true);
        } else {
            pf60Var.getClass();
            visitorTabPresenter.m59179S0(pf60Var);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static Boolean m59187j0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k0 */
    public static Boolean m59188k0(UnPrivilegedVisitor unPrivilegedVisitor, cfm0 cfm0Var) {
        cfm0Var.getClass();
        return Boolean.valueOf(NullChecker.m82486a(cfm0Var.f81526d) && Intrinsics.m88377d(cfm0Var.f81526d.userId, unPrivilegedVisitor.userId));
    }

    /* JADX INFO: renamed from: l0 */
    public static Boolean m59189l0(String str) {
        return Boolean.valueOf("all".equals(str) || Visitor.TYPE.equals(str) || "visitor_update_time".equals(str));
    }

    /* JADX INFO: renamed from: m0 */
    public static Boolean m59190m0(Visitor visitor, cfm0 cfm0Var) {
        cfm0Var.getClass();
        return Boolean.valueOf(NullChecker.m82486a(cfm0Var.f81524b) && Intrinsics.m88377d(cfm0Var.f81524b.userId, visitor.userId));
    }

    /* JADX INFO: renamed from: n0 */
    public static void m59191n0(VisitorTabPresenter visitorTabPresenter, Boolean bool) {
        if (visitorTabPresenter.hasPermission) {
            visitorTabPresenter.getData();
        } else {
            ((sgm0) visitorTabPresenter.viewModel).m185807C(true);
        }
        if (joa.m146357G3()) {
            ((sgm0) visitorTabPresenter.viewModel).m185809H(false);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static void m59192o0(Throwable th) {
    }

    /* JADX INFO: renamed from: p0 */
    public static Boolean m59193p0(VisitorTabPresenter visitorTabPresenter, VisitorCounter visitorCounter) {
        return Boolean.valueOf(!joa.m146357G3() && NullChecker.m82486a(visitorTabPresenter.pairCached));
    }

    /* JADX INFO: renamed from: q0 */
    public static C22421c m59194q0(boolean z) {
        return CoreModule.f18264c.f20410n2.m121481a4(CoreModule.m30929H().userId(), "list", "", z);
    }

    /* JADX INFO: renamed from: r0 */
    public static void m59195r0(Throwable th) {
    }

    /* JADX INFO: renamed from: s0 */
    public static void m59196s0(VisitorTabPresenter visitorTabPresenter, VisitorSetting visitorSetting) {
        boolean z = visitorSetting.visitorPermission;
        visitorTabPresenter.hasPermission = z;
        ((sgm0) visitorTabPresenter.viewModel).m185805A(z ? "滑卡让更多人看到我" : "开启后可查看谁看过我");
        if (visitorTabPresenter.hasPermission) {
            visitorTabPresenter.getData();
        } else {
            ((sgm0) visitorTabPresenter.viewModel).m185807C(true);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static void m59197t0(Throwable th) {
    }

    /* JADX INFO: renamed from: u0 */
    public static Boolean m59198u0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x0 */
    public static void m59199x0(VisitorTabPresenter visitorTabPresenter, pf60 pf60Var) {
        int i;
        pf60Var.getClass();
        visitorTabPresenter.links = (Links) pf60Var.f152156a;
        VisitorInfo visitorInfo = (VisitorInfo) pf60Var.f152157b;
        if (NullChecker.m82486a(visitorInfo)) {
            visitorInfo.getClass();
            visitorInfo.nullCheck();
            if (visitorInfo.allVisitors.visitors.size() + visitorInfo.newVisitors.visitors.size() + visitorInfo.recommendVisitors.visitors.size() > 10 || !visitorTabPresenter.m59203J0(visitorTabPresenter.links) || (i = visitorTabPresenter.autoLoadMoreRetryCount) >= 10) {
                visitorTabPresenter.autoLoadMoreRetryCount = 0;
            } else {
                visitorTabPresenter.autoLoadMoreRetryCount = i + 1;
                visitorTabPresenter.m59178Q0();
            }
            if (visitorTabPresenter.m59175L0(visitorInfo)) {
                List<Visitor> list = visitorInfo.newVisitors.visitors;
                list.getClass();
                visitorTabPresenter.m59181V0("", list, -1);
                if (visitorTabPresenter.m59174I0(visitorInfo)) {
                    List<Visitor> list2 = visitorInfo.allVisitors.visitors;
                    list2.getClass();
                    visitorTabPresenter.m59181V0("全部", list2, -3);
                    visitorTabPresenter.hasShowAllModuleName = true;
                }
            } else if (visitorTabPresenter.m59174I0(visitorInfo)) {
                String str = visitorTabPresenter.hasShowAllModuleName ? "" : "全部";
                List<Visitor> list3 = visitorInfo.allVisitors.visitors;
                list3.getClass();
                visitorTabPresenter.m59181V0(str, list3, -3);
                visitorTabPresenter.hasShowAllModuleName = true;
            }
        } else {
            visitorTabPresenter.autoLoadMoreRetryCount = 0;
        }
        ((sgm0) visitorTabPresenter.viewModel).m185821z(visitorTabPresenter.visitorItems);
    }

    /* JADX INFO: renamed from: y0 */
    public static void m59200y0(VisitorTabPresenter visitorTabPresenter, Throwable th) {
        visitorTabPresenter.autoLoadMoreRetryCount = 0;
        ((sgm0) visitorTabPresenter.viewModel).m185821z(visitorTabPresenter.visitorItems);
    }

    /* JADX INFO: renamed from: z0 */
    public static void m59201z0(VisitorTabPresenter visitorTabPresenter, VisitorCounter visitorCounter) {
        if (!visitorTabPresenter.hasPermission) {
            ((sgm0) visitorTabPresenter.viewModel).m185807C(true);
            return;
        }
        pf60<Links, VisitorInfo> pf60Var = visitorTabPresenter.pairCached;
        if (pf60Var != null) {
            visitorTabPresenter.m59179S0(pf60Var);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m59202H0(final boolean updateLastVisitTime) {
        if (joa.m146357G3()) {
            duringCreated(new pcj() { // from class: l.xfm0
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return VisitorTabPresenter.m59194q0(updateLastVisitTime);
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.zfm0
                @Override // p153l.y20
                public final void call(Object obj) {
                    VisitorTabPresenter.m59182e0(updateLastVisitTime, this, (pf60) obj);
                }
            }, new y20() { // from class: l.agm0
                @Override // p153l.y20
                public final void call(Object obj) {
                    VisitorTabPresenter.m59192o0((Throwable) obj);
                }
            }));
        } else {
            duringCreated(new pcj() { // from class: l.ufm0
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return VisitorTabPresenter.m59169C0(updateLastVisitTime);
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.vfm0
                @Override // p153l.y20
                public final void call(Object obj) {
                    VisitorTabPresenter.m59186i0(updateLastVisitTime, this, (pf60) obj);
                }
            }, new y20() { // from class: l.wfm0
                @Override // p153l.y20
                public final void call(Object obj) {
                    VisitorTabPresenter.m59197t0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m59203J0(@Nullable Links links) {
        return !TextUtils.isEmpty(links != null ? links.next : null);
    }

    /* JADX INFO: renamed from: P0 */
    public final void m59204P0() {
    }

    /* JADX INFO: renamed from: R0 */
    public final void m59205R0() {
        this.autoLoadMoreRetryCount = 0;
        this.links = null;
        getData();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        C22421c<T> c22421cDuringCreated = duringCreated(CoreModule.f18264c.f20410n2.f94740S);
        final Function1 function1 = new Function1() { // from class: l.nfm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VisitorTabPresenter.m59172F0((VisitorSetting) obj);
            }
        };
        c22421cDuringCreated.distinctUntilChanged(new qcj() { // from class: l.kgm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VisitorTabPresenter.m59198u0(function1, obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.lgm0
            @Override // p153l.y20
            public final void call(Object obj) {
                VisitorTabPresenter.m59196s0(this.f131987a, (VisitorSetting) obj);
            }
        }));
        creates(new y20() { // from class: l.mgm0
            @Override // p153l.y20
            public final void call(Object obj) {
                VisitorTabPresenter.m59168A0(this.f136760a, (Bundle) obj);
            }
        }, new x20() { // from class: l.ofm0
            @Override // p153l.x20
            public final void call() {
                VisitorTabPresenter.m59170D0();
            }
        });
        e7d0.Companion companion = e7d0.INSTANCE;
        C22421c<T> c22421cDuringCreated2 = duringCreated(companion.m119701b().m119698d());
        final Function1 function2 = new Function1() { // from class: l.pfm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VisitorTabPresenter.m59189l0((String) obj);
            }
        };
        c22421cDuringCreated2.filter(new qcj() { // from class: l.qfm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VisitorTabPresenter.m59173G0(function2, obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.rfm0
            @Override // p153l.y20
            public final void call(Object obj) {
                VisitorTabPresenter.m59183f0(this.f162811a, (String) obj);
            }
        }, new y20() { // from class: l.sfm0
            @Override // p153l.y20
            public final void call(Object obj) {
                VisitorTabPresenter.m59195r0((Throwable) obj);
            }
        }));
        if (CoreModule.m30930K().isNewMainActContext(act()) && companion.m119703d()) {
            C22421c c22421cDistinctUntilChanged = duringCreated(new pcj() { // from class: l.tfm0
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return VisitorTabPresenter.m59171E0();
                }
            }).distinctUntilChanged();
            final Function1 function3 = new Function1() { // from class: l.yfm0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return VisitorTabPresenter.m59193p0(this.f199644a, (VisitorCounter) obj);
                }
            };
            c22421cDistinctUntilChanged.filter(new qcj() { // from class: l.fgm0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return VisitorTabPresenter.m59184g0(function3, obj);
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.ggm0
                @Override // p153l.y20
                public final void call(Object obj) {
                    VisitorTabPresenter.m59201z0(this.f104029a, (VisitorCounter) obj);
                }
            }, new y20() { // from class: l.hgm0
                @Override // p153l.y20
                public final void call(Object obj) {
                    VisitorTabPresenter.m59185h0((Throwable) obj);
                }
            }));
        }
        C22421c<T> c22421cDuringCreated3 = duringCreated(CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("oDiamond")));
        final VisitorTabPresenter$initSubscription$12 visitorTabPresenter$initSubscription$12 = VisitorTabPresenter$initSubscription$12.INSTANCE;
        c22421cDuringCreated3.map(new qcj() { // from class: l.igm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VisitorTabPresenter.m59187j0(visitorTabPresenter$initSubscription$12, obj);
            }
        }).distinctUntilChanged().skip(1).subscribe(psd0.m173596G(new y20() { // from class: l.jgm0
            @Override // p153l.y20
            public final void call(Object obj) {
                VisitorTabPresenter.m59191n0(this.f120746a, (Boolean) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.visitor.AbstractC9208a.a
    /* JADX INFO: renamed from: e */
    public void mo59048e(int i) {
        if (i < this.visitorItems.size() - 4 || this.visitorItems.size() <= 0 || !m59203J0(this.links)) {
            return;
        }
        if ((!CoreModule.m30933P().m143405a().mo180463f() || joa.m146357G3()) && this.autoLoadMoreRetryCount == 0) {
            m59178Q0();
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.visitor.AbstractC9208a.a
    public void getData() {
        m59202H0(false);
    }
}
