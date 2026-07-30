package com.p000p1.mobile.putong.core.p004ui.visitor.frag;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.visitor.AbstractC0481a;
import com.p000p1.mobile.putong.core.p004ui.visitor.frag.VisitorTabPresenter;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
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
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import l.d30;
import l.e30;
import l.j760;
import l.jq2;
import l.mkd0;
import l.v9j;
import l.vwb;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.bzc0;
import p006l.o7m0;
import p006l.xma;
import p006l.y5m0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\f2\u0016\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0012J-\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00132\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010\u0012J\u0017\u0010!\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\u0012J\u000f\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\fH\u0016¢\u0006\u0004\b$\u0010#J\r\u0010%\u001a\u00020\f¢\u0006\u0004\b%\u0010#J\u000f\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010#J\u000f\u0010'\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010#J\u0017\u0010)\u001a\u00020\f2\b\b\u0002\u0010(\u001a\u00020\u0010¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\f¢\u0006\u0004\b+\u0010#J\u0017\u0010-\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u001cH\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00102\b\u0010/\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b0\u00101R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0016\u00108\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R$\u0010>\u001a\u0012\u0012\u0004\u0012\u00020:09j\b\u0012\u0004\u0012\u00020:`;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010/\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u00107R\u0016\u0010D\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR(\u0010G\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H"}, d2 = {"Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabPresenter;", "Ll/jq2;", "Ll/o7m0;", "Lcom/p1/mobile/putong/core/ui/visitor/a$a;", "Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabFragment;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabFragment;)V", "Ll/j760;", "Lcom/p1/mobile/putong/data/Links;", "Lcom/p1/mobile/putong/data/VisitorInfo;", "pair", "", "S0", "(Ll/j760;)V", "visitorInfo", "", "O0", "(Lcom/p1/mobile/putong/data/VisitorInfo;)Z", "", "Lcom/p1/mobile/putong/data/UnPrivilegedVisitor;", "visitors", "U0", "(Ljava/util/List;)V", "L0", "", "moduleName", "Lcom/p1/mobile/putong/data/Visitor;", "", "part", "V0", "(Ljava/lang/String;Ljava/util/List;I)V", "I0", "N0", "Q0", "()V", "destroy", "P0", "a0", "getData", "updateLastVisitTime", "H0", "(Z)V", "R0", "i", "e", "(I)V", "links", "J0", "(Lcom/p1/mobile/putong/data/Links;)Z", "a", "Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabFragment;", "getFrag", "()Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabFragment;", "b", "Z", "hasPermission", "Ljava/util/ArrayList;", "Ll/y5m0;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "visitorItems", "d", "Lcom/p1/mobile/putong/data/Links;", "hasShowAllModuleName", "f", "I", "autoLoadMoreRetryCount", "g", "Ll/j760;", "pairCached", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class VisitorTabPresenter extends jq2<o7m0> implements AbstractC0481a.a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final VisitorTabFragment frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean hasPermission;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<y5m0> visitorItems;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Links links;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean hasShowAllModuleName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int autoLoadMoreRetryCount;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public j760<Links, VisitorInfo> pairCached;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VisitorTabPresenter(@NotNull VisitorTabFragment visitorTabFragment) {
        super(visitorTabFragment);
        visitorTabFragment.getClass();
        this.frag = visitorTabFragment;
        this.visitorItems = new ArrayList<>();
    }

    /* JADX INFO: renamed from: A0 */
    public static void m11508A0(VisitorTabPresenter visitorTabPresenter, Bundle bundle) {
        ((o7m0) ((jq2) visitorTabPresenter).viewModel).m20406r();
        if (visitorTabPresenter.hasPermission) {
            visitorTabPresenter.getData();
        } else {
            ((o7m0) ((jq2) visitorTabPresenter).viewModel).m20397C(true);
        }
    }

    /* JADX INFO: renamed from: C0 */
    public static c m11509C0(boolean z) {
        return CoreModule.f1534c.f3657n2.m22282q4(z);
    }

    /* JADX INFO: renamed from: D0 */
    public static void m11510D0() {
        bzc0.Companion companion = bzc0.INSTANCE;
        if (companion.m13046d()) {
            companion.m13044b().m13042g("visitor");
        }
    }

    /* JADX INFO: renamed from: E0 */
    public static c m11511E0() {
        return CoreModule.f1534c.f3653m1.m6642Q4();
    }

    /* JADX INFO: renamed from: F0 */
    public static Boolean m11512F0(VisitorSetting visitorSetting) {
        visitorSetting.getClass();
        return Boolean.valueOf(visitorSetting.visitorPermission);
    }

    /* JADX INFO: renamed from: G0 */
    public static Boolean m11513G0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I0 */
    private final boolean m11514I0(VisitorInfo visitorInfo) {
        return !vwb.J(visitorInfo.allVisitors.visitors);
    }

    /* JADX INFO: renamed from: L0 */
    private final boolean m11515L0(VisitorInfo visitorInfo) {
        NewVisitors newVisitors = visitorInfo.newVisitors;
        return newVisitors.totalCount > 0 && newVisitors.visitors.size() > 0;
    }

    /* JADX INFO: renamed from: N0 */
    private final boolean m11516N0(VisitorInfo visitorInfo) {
        RecommendVisitors recommendVisitors = visitorInfo.recommendVisitors;
        return recommendVisitors.totalCount > 0 && recommendVisitors.visitors.size() > 0;
    }

    /* JADX INFO: renamed from: O0 */
    private final boolean m11517O0(VisitorInfo visitorInfo) {
        return visitorInfo.unprivilegedVisitors.size() > 0;
    }

    /* JADX INFO: renamed from: Q0 */
    private final void m11518Q0() {
        duringCreated(CoreModule.f1534c.f3657n2.m22267b4(CoreModule.m1850H().userId(), this.links, "list", true)).subscribe(mkd0.H(new e30() { // from class: l.y6m0
            public final void call(Object obj) {
                VisitorTabPresenter.m11539x0(this.f28062a, (j760) obj);
            }
        }, new e30() { // from class: l.z6m0
            public final void call(Object obj) {
                VisitorTabPresenter.m11540y0(this.f28660a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S0 */
    private final void m11519S0(j760<Links, VisitorInfo> pair) {
        this.pairCached = pair;
        this.visitorItems.clear();
        this.links = (Links) pair.a;
        VisitorInfo visitorInfo = (VisitorInfo) pair.b;
        if (visitorInfo != null) {
            if (CoreModule.m1854P().m11706a().m19879f() && !xma.m27351F3() && m11517O0(visitorInfo)) {
                List<? extends UnPrivilegedVisitor> list = visitorInfo.unprivilegedVisitors;
                list.getClass();
                m11520U0(list);
            } else if (m11515L0(visitorInfo)) {
                List<? extends Visitor> list2 = visitorInfo.newVisitors.visitors;
                list2.getClass();
                m11521V0("新访客", list2, -1);
                if (m11514I0(visitorInfo)) {
                    List<? extends Visitor> list3 = visitorInfo.allVisitors.visitors;
                    list3.getClass();
                    m11521V0("全部", list3, -3);
                    this.hasShowAllModuleName = true;
                }
            } else if (m11516N0(visitorInfo)) {
                if (!CoreModule.m1854P().m11706a().m19879f() || !xma.m27351F3()) {
                    List<? extends Visitor> list4 = visitorInfo.recommendVisitors.visitors;
                    list4.getClass();
                    m11521V0("推荐", list4, -2);
                }
                if (m11514I0(visitorInfo)) {
                    List<? extends Visitor> list5 = visitorInfo.allVisitors.visitors;
                    list5.getClass();
                    m11521V0("全部", list5, -3);
                    this.hasShowAllModuleName = true;
                }
            } else if (m11514I0(visitorInfo)) {
                List<? extends Visitor> list6 = visitorInfo.allVisitors.visitors;
                list6.getClass();
                m11521V0("", list6, -3);
            }
        }
        ((o7m0) ((jq2) this).viewModel).m20414z(this.visitorItems);
    }

    /* JADX INFO: renamed from: U0 */
    private final void m11520U0(List<? extends UnPrivilegedVisitor> visitors) {
        int size = visitors.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            final UnPrivilegedVisitor unPrivilegedVisitor = visitors.get(i);
            if (!vwb.m(this.visitorItems, new w9j() { // from class: l.x6m0
                public final Object call(Object obj) {
                    return VisitorTabPresenter.m11528k0(unPrivilegedVisitor, (y5m0) obj);
                }
            })) {
                this.visitorItems.add(new y5m0(unPrivilegedVisitor, i != 0));
            }
            i++;
        }
        VisitorCounter visitorCounterM6637N4 = CoreModule.f1534c.f3653m1.m6637N4();
        if (NullChecker.a(visitorCounterM6637N4)) {
            ArrayList<y5m0> arrayList = this.visitorItems;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            visitorCounterM6637N4.getClass();
            arrayList.add(new y5m0(String.format("%s人看过我 · 开通黑金会员一键解锁", Arrays.copyOf(new Object[]{Integer.valueOf(visitorCounterM6637N4.totalCnt)}, 1)), true));
        }
    }

    /* JADX INFO: renamed from: V0 */
    private final void m11521V0(String moduleName, List<? extends Visitor> visitors, int part) {
        if (!TextUtils.isEmpty(moduleName)) {
            this.visitorItems.add(new y5m0(Visitor.new_(), moduleName, part));
        }
        for (final Visitor visitor : visitors) {
            if (!vwb.m(this.visitorItems, new w9j() { // from class: l.a7m0
                public final Object call(Object obj) {
                    return VisitorTabPresenter.m11530m0(visitor, (y5m0) obj);
                }
            })) {
                this.visitorItems.add(new y5m0(visitor, null, part));
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static void m11522e0(boolean z, VisitorTabPresenter visitorTabPresenter, j760 j760Var) {
        if (z) {
            CoreModule.f1534c.f3653m1.m6664s5();
        }
        if (!visitorTabPresenter.hasPermission) {
            ((o7m0) ((jq2) visitorTabPresenter).viewModel).m20397C(true);
        } else {
            j760Var.getClass();
            visitorTabPresenter.m11519S0(j760Var);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static void m11523f0(VisitorTabPresenter visitorTabPresenter, String str) {
        if ("visitor_update_time".equals(str)) {
            visitorTabPresenter.m11542H0(true);
        } else {
            visitorTabPresenter.getData();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static Boolean m11524g0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m11525h0(Throwable th) {
    }

    /* JADX INFO: renamed from: i0 */
    public static void m11526i0(boolean z, VisitorTabPresenter visitorTabPresenter, j760 j760Var) {
        if (z) {
            CoreModule.f1534c.f3653m1.m6664s5();
        }
        if (!visitorTabPresenter.hasPermission) {
            ((o7m0) ((jq2) visitorTabPresenter).viewModel).m20397C(true);
        } else {
            j760Var.getClass();
            visitorTabPresenter.m11519S0(j760Var);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static Boolean m11527j0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k0 */
    public static Boolean m11528k0(UnPrivilegedVisitor unPrivilegedVisitor, y5m0 y5m0Var) {
        y5m0Var.getClass();
        return Boolean.valueOf(NullChecker.a(y5m0Var.f28036d) && Intrinsics.d(y5m0Var.f28036d.userId, unPrivilegedVisitor.userId));
    }

    /* JADX INFO: renamed from: l0 */
    public static Boolean m11529l0(String str) {
        return Boolean.valueOf("all".equals(str) || "visitor".equals(str) || "visitor_update_time".equals(str));
    }

    /* JADX INFO: renamed from: m0 */
    public static Boolean m11530m0(Visitor visitor, y5m0 y5m0Var) {
        y5m0Var.getClass();
        return Boolean.valueOf(NullChecker.a(y5m0Var.f28034b) && Intrinsics.d(y5m0Var.f28034b.userId, visitor.userId));
    }

    /* JADX INFO: renamed from: n0 */
    public static void m11531n0(VisitorTabPresenter visitorTabPresenter, Boolean bool) {
        if (visitorTabPresenter.hasPermission) {
            visitorTabPresenter.getData();
        } else {
            ((o7m0) ((jq2) visitorTabPresenter).viewModel).m20397C(true);
        }
        if (xma.m27351F3()) {
            ((o7m0) ((jq2) visitorTabPresenter).viewModel).m20400H(false);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static void m11532o0(Throwable th) {
    }

    /* JADX INFO: renamed from: p0 */
    public static Boolean m11533p0(VisitorTabPresenter visitorTabPresenter, VisitorCounter visitorCounter) {
        return Boolean.valueOf(!xma.m27351F3() && NullChecker.a(visitorTabPresenter.pairCached));
    }

    /* JADX INFO: renamed from: q0 */
    public static c m11534q0(boolean z) {
        return CoreModule.f1534c.f3657n2.m22266a4(CoreModule.m1850H().userId(), "list", "", z);
    }

    /* JADX INFO: renamed from: r0 */
    public static void m11535r0(Throwable th) {
    }

    /* JADX INFO: renamed from: s0 */
    public static void m11536s0(VisitorTabPresenter visitorTabPresenter, VisitorSetting visitorSetting) {
        boolean z = visitorSetting.visitorPermission;
        visitorTabPresenter.hasPermission = z;
        ((o7m0) ((jq2) visitorTabPresenter).viewModel).m20395A(z ? "滑卡让更多人看到我" : "开启后可查看谁看过我");
        if (visitorTabPresenter.hasPermission) {
            visitorTabPresenter.getData();
        } else {
            ((o7m0) ((jq2) visitorTabPresenter).viewModel).m20397C(true);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static void m11537t0(Throwable th) {
    }

    /* JADX INFO: renamed from: u0 */
    public static Boolean m11538u0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: x0 */
    public static void m11539x0(VisitorTabPresenter visitorTabPresenter, j760 j760Var) {
        int i;
        j760Var.getClass();
        visitorTabPresenter.links = (Links) j760Var.a;
        VisitorInfo visitorInfo = (VisitorInfo) j760Var.b;
        if (NullChecker.a(visitorInfo)) {
            visitorInfo.getClass();
            visitorInfo.nullCheck();
            if (visitorInfo.allVisitors.visitors.size() + visitorInfo.newVisitors.visitors.size() + visitorInfo.recommendVisitors.visitors.size() > 10 || !visitorTabPresenter.m11543J0(visitorTabPresenter.links) || (i = visitorTabPresenter.autoLoadMoreRetryCount) >= 10) {
                visitorTabPresenter.autoLoadMoreRetryCount = 0;
            } else {
                visitorTabPresenter.autoLoadMoreRetryCount = i + 1;
                visitorTabPresenter.m11518Q0();
            }
            if (visitorTabPresenter.m11515L0(visitorInfo)) {
                List<? extends Visitor> list = visitorInfo.newVisitors.visitors;
                list.getClass();
                visitorTabPresenter.m11521V0("", list, -1);
                if (visitorTabPresenter.m11514I0(visitorInfo)) {
                    List<? extends Visitor> list2 = visitorInfo.allVisitors.visitors;
                    list2.getClass();
                    visitorTabPresenter.m11521V0("全部", list2, -3);
                    visitorTabPresenter.hasShowAllModuleName = true;
                }
            } else if (visitorTabPresenter.m11514I0(visitorInfo)) {
                String str = visitorTabPresenter.hasShowAllModuleName ? "" : "全部";
                List<? extends Visitor> list3 = visitorInfo.allVisitors.visitors;
                list3.getClass();
                visitorTabPresenter.m11521V0(str, list3, -3);
                visitorTabPresenter.hasShowAllModuleName = true;
            }
        } else {
            visitorTabPresenter.autoLoadMoreRetryCount = 0;
        }
        ((o7m0) ((jq2) visitorTabPresenter).viewModel).m20414z(visitorTabPresenter.visitorItems);
    }

    /* JADX INFO: renamed from: y0 */
    public static void m11540y0(VisitorTabPresenter visitorTabPresenter, Throwable th) {
        visitorTabPresenter.autoLoadMoreRetryCount = 0;
        ((o7m0) ((jq2) visitorTabPresenter).viewModel).m20414z(visitorTabPresenter.visitorItems);
    }

    /* JADX INFO: renamed from: z0 */
    public static void m11541z0(VisitorTabPresenter visitorTabPresenter, VisitorCounter visitorCounter) {
        if (!visitorTabPresenter.hasPermission) {
            ((o7m0) ((jq2) visitorTabPresenter).viewModel).m20397C(true);
            return;
        }
        j760<Links, VisitorInfo> j760Var = visitorTabPresenter.pairCached;
        if (j760Var != null) {
            visitorTabPresenter.m11519S0(j760Var);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m11542H0(final boolean updateLastVisitTime) {
        if (xma.m27351F3()) {
            duringCreated(new v9j() { // from class: l.t6m0
                public final Object call() {
                    return VisitorTabPresenter.m11534q0(updateLastVisitTime);
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.v6m0
                public final void call(Object obj) {
                    VisitorTabPresenter.m11522e0(updateLastVisitTime, this, (j760) obj);
                }
            }, new e30() { // from class: l.w6m0
                public final void call(Object obj) {
                    VisitorTabPresenter.m11532o0((Throwable) obj);
                }
            }));
        } else {
            duringCreated(new v9j() { // from class: l.q6m0
                public final Object call() {
                    return VisitorTabPresenter.m11509C0(updateLastVisitTime);
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.r6m0
                public final void call(Object obj) {
                    VisitorTabPresenter.m11526i0(updateLastVisitTime, this, (j760) obj);
                }
            }, new e30() { // from class: l.s6m0
                public final void call(Object obj) {
                    VisitorTabPresenter.m11537t0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m11543J0(@Nullable Links links) {
        return !TextUtils.isEmpty(links != null ? links.next : null);
    }

    /* JADX INFO: renamed from: P0 */
    public final void m11544P0() {
    }

    /* JADX INFO: renamed from: R0 */
    public final void m11545R0() {
        this.autoLoadMoreRetryCount = 0;
        this.links = null;
        getData();
    }

    /* JADX INFO: renamed from: a0 */
    public void m11546a0() {
        c cVarDuringCreated = duringCreated(CoreModule.f1534c.f3657n2.f19889S);
        final Function1 function1 = new Function1() { // from class: l.j6m0
            public final Object invoke(Object obj) {
                return VisitorTabPresenter.m11512F0((VisitorSetting) obj);
            }
        };
        cVarDuringCreated.distinctUntilChanged(new w9j() { // from class: l.g7m0
            public final Object call(Object obj) {
                return VisitorTabPresenter.m11538u0(function1, obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.h7m0
            public final void call(Object obj) {
                VisitorTabPresenter.m11536s0(this.f13739a, (VisitorSetting) obj);
            }
        }));
        creates(new e30() { // from class: l.i7m0
            public final void call(Object obj) {
                VisitorTabPresenter.m11508A0(this.f14295a, (Bundle) obj);
            }
        }, new d30() { // from class: l.k6m0
            public final void call() {
                VisitorTabPresenter.m11510D0();
            }
        });
        bzc0.Companion companion = bzc0.INSTANCE;
        c cVarDuringCreated2 = duringCreated(companion.m13044b().m13041d());
        final Function1 function2 = new Function1() { // from class: l.l6m0
            public final Object invoke(Object obj) {
                return VisitorTabPresenter.m11529l0((String) obj);
            }
        };
        cVarDuringCreated2.filter(new w9j() { // from class: l.m6m0
            public final Object call(Object obj) {
                return VisitorTabPresenter.m11513G0(function2, obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.n6m0
            public final void call(Object obj) {
                VisitorTabPresenter.m11523f0(this.f17517a, (String) obj);
            }
        }, new e30() { // from class: l.o6m0
            public final void call(Object obj) {
                VisitorTabPresenter.m11535r0((Throwable) obj);
            }
        }));
        if (CoreModule.m1851K().isNewMainActContext(act()) && companion.m13046d()) {
            c cVarDistinctUntilChanged = duringCreated(new v9j() { // from class: l.p6m0
                public final Object call() {
                    return VisitorTabPresenter.m11511E0();
                }
            }).distinctUntilChanged();
            final Function1 function3 = new Function1() { // from class: l.u6m0
                public final Object invoke(Object obj) {
                    return VisitorTabPresenter.m11533p0(this.f23379a, (VisitorCounter) obj);
                }
            };
            cVarDistinctUntilChanged.filter(new w9j() { // from class: l.b7m0
                public final Object call(Object obj) {
                    return VisitorTabPresenter.m11524g0(function3, obj);
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.c7m0
                public final void call(Object obj) {
                    VisitorTabPresenter.m11541z0(this.f9475a, (VisitorCounter) obj);
                }
            }, new e30() { // from class: l.d7m0
                public final void call(Object obj) {
                    VisitorTabPresenter.m11525h0((Throwable) obj);
                }
            }));
        }
        c cVarDuringCreated3 = duringCreated(CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("oDiamond")));
        final VisitorTabPresenter$initSubscription$12 visitorTabPresenter$initSubscription$12 = VisitorTabPresenter$initSubscription$12.INSTANCE;
        cVarDuringCreated3.map(new w9j() { // from class: l.e7m0
            public final Object call(Object obj) {
                return VisitorTabPresenter.m11527j0(visitorTabPresenter$initSubscription$12, obj);
            }
        }).distinctUntilChanged().skip(1).subscribe(mkd0.G(new e30() { // from class: l.f7m0
            public final void call(Object obj) {
                VisitorTabPresenter.m11531n0(this.f12549a, (Boolean) obj);
            }
        }));
    }

    public void destroy() {
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.visitor.AbstractC0481a.a
    /* JADX INFO: renamed from: e */
    public void mo11374e(int i) {
        if (i < this.visitorItems.size() - 4 || this.visitorItems.size() <= 0 || !m11543J0(this.links)) {
            return;
        }
        if ((!CoreModule.m1854P().m11706a().m19879f() || xma.m27351F3()) && this.autoLoadMoreRetryCount == 0) {
            m11518Q0();
        }
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.visitor.AbstractC0481a.a
    public void getData() {
        m11542H0(false);
    }
}
