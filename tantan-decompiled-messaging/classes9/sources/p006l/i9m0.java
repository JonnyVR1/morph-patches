package p006l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.visitor.AbstractC0481a;
import com.p000p1.mobile.putong.core.p004ui.visitor.visitorsme.VisitorsMeFrag;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.UserPrivilege;
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
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import l.d30;
import l.e30;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.osi0;
import l.s7m;
import l.v9j;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 T2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00018B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00102\u0018\u0010\u0016\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\n2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J-\u0010&\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020#0\u001c2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\nH\u0016¢\u0006\u0004\b(\u0010\fJ\u000f\u0010)\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010\fJ\u0015\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u0010¢\u0006\u0004\b+\u0010\u001bJ\r\u0010,\u001a\u00020\n¢\u0006\u0004\b,\u0010\fJ\u000f\u0010-\u001a\u00020\nH\u0016¢\u0006\u0004\b-\u0010\fJ\u0017\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020$H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00102\b\u00101\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u0010¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\n¢\u0006\u0004\b6\u0010\fJ\u000f\u00107\u001a\u00020\nH\u0016¢\u0006\u0004\b7\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010*\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010(R\u0016\u0010<\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010(R\u0018\u0010?\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u00101\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010@R\u0016\u0010C\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0017\u0010I\u001a\u00020D8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020K0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR$\u0010S\u001a\u0012\u0012\u0004\u0012\u00020!0Oj\b\u0012\u0004\u0012\u00020!`P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006U"}, d2 = {"Ll/i9m0;", "Ll/jq2;", "Ll/r9m0;", "Lcom/p1/mobile/putong/core/ui/visitor/a$a;", "Lcom/p1/mobile/putong/core/ui/visitor/visitorsme/VisitorsMeFrag;", "visitorsMeFrag", "Ll/mcr;", "lifecycleProvider", "<init>", "(Lcom/p1/mobile/putong/core/ui/visitor/visitorsme/VisitorsMeFrag;Ll/mcr;)V", "", "A0", "()V", "L0", "Lcom/p1/mobile/putong/data/VisitorInfo;", "visitorInfo", "", "J0", "(Lcom/p1/mobile/putong/data/VisitorInfo;)Z", "success", "Ll/j760;", "Lcom/p1/mobile/putong/data/Links;", "pair", "G0", "(ZLl/j760;)V", "loading", "H0", "(Z)V", "", "Lcom/p1/mobile/putong/data/UnPrivilegedVisitor;", "visitors", "E0", "(Ljava/util/List;)V", "", "moduleName", "Lcom/p1/mobile/putong/data/Visitor;", "", "part", "F0", "(Ljava/lang/String;Ljava/util/List;I)V", "Z", "a0", "visitorPermission", "D0", "C0", "getData", "position", "e", "(I)V", "links", "z0", "(Lcom/p1/mobile/putong/data/Links;)Z", "x0", "()Z", "I0", "destroy", "a", "Lcom/p1/mobile/putong/core/ui/visitor/visitorsme/VisitorsMeFrag;", "b", "c", "hideNavigation", "d", "Ljava/lang/String;", "from", "Lcom/p1/mobile/putong/data/Links;", "f", "I", "autoLoadMoreRetryCount", "Lcom/p1/mobile/putong/core/data/VisitorFilterSettings;", "g", "Lcom/p1/mobile/putong/core/data/VisitorFilterSettings;", "y0", "()Lcom/p1/mobile/putong/core/data/VisitorFilterSettings;", "currentVisitorFilterSettings", "", "Ll/y5m0;", "h", "Ljava/util/List;", "visitorItems", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "i", "Ljava/util/HashSet;", "visitorUidMap", "Companion", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i9m0 extends jq2<r9m0> implements AbstractC0481a.a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final VisitorsMeFrag visitorsMeFrag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean visitorPermission;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean hideNavigation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public String from;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public Links links;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int autoLoadMoreRetryCount;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final VisitorFilterSettings currentVisitorFilterSettings;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final List<y5m0> visitorItems;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final HashSet<String> visitorUidMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9m0(@NotNull VisitorsMeFrag visitorsMeFrag, @NotNull mcr mcrVar) {
        super(mcrVar);
        visitorsMeFrag.getClass();
        mcrVar.getClass();
        this.visitorsMeFrag = visitorsMeFrag;
        this.from = "";
        VisitorFilterSettings visitorFilterSettingsClone = CoreModule.f1534c.f3657n2.m22250K3().clone();
        visitorFilterSettingsClone.getClass();
        this.currentVisitorFilterSettings = visitorFilterSettingsClone;
        this.visitorItems = new ArrayList();
        this.visitorUidMap = new HashSet<>();
    }

    /* JADX INFO: renamed from: A0 */
    private final void m16535A0() {
        if (xma.m27351F3()) {
            CoreModule.f1534c.f3657n2.m22266a4(CoreModule.m1850H().userId(), "list", "", true);
        } else {
            CoreModule.f1534c.f3657n2.m22282q4(true);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static void m16536e0(i9m0 i9m0Var, j760 j760Var) {
        j760Var.getClass();
        i9m0Var.autoLoadMoreRetryCount = 0;
        i9m0Var.links = null;
        i9m0Var.m16557G0(true, j760Var);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m16537f0(i9m0 i9m0Var, Throwable th) {
        i9m0Var.m16557G0(false, null);
    }

    /* JADX INFO: renamed from: g0 */
    public static Boolean m16538g0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m16539h0(i9m0 i9m0Var, Boolean bool) {
        if (CoreModule.f1534c.f3657n2.m22251L3()) {
            ((r9m0) ((jq2) i9m0Var).viewModel).m22760R(i9m0Var.hideNavigation, true);
            i9m0Var.getData();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static c m16540i0(String str) {
        return CoreModule.f1534c.f3657n2.m22266a4(CoreModule.m1850H().userId(), "list", str, true);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m16541j0(i9m0 i9m0Var, Throwable th) {
        i9m0Var.m16557G0(false, null);
    }

    /* JADX INFO: renamed from: k0 */
    public static c m16542k0() {
        return CoreModule.f1534c.f3657n2.m22282q4(true);
    }

    /* JADX INFO: renamed from: l0 */
    public static void m16543l0(i9m0 i9m0Var, j760 j760Var) {
        j760Var.getClass();
        i9m0Var.autoLoadMoreRetryCount = 0;
        i9m0Var.links = null;
        i9m0Var.m16557G0(true, j760Var);
    }

    /* JADX INFO: renamed from: m0 */
    public static void m16544m0() {
        CoreModule.f1534c.f3653m1.m6664s5();
    }

    /* JADX INFO: renamed from: n0 */
    public static void m16545n0(i9m0 i9m0Var, Throwable th) {
        i9m0Var.autoLoadMoreRetryCount = 0;
        i9m0Var.m16558H0(false);
    }

    /* JADX INFO: renamed from: o0 */
    public static void m16546o0(i9m0 i9m0Var, j760 j760Var) {
        boolean zM16560J0;
        j760Var.getClass();
        VisitorInfo visitorInfo = (VisitorInfo) j760Var.b;
        if (visitorInfo != null) {
            i9m0Var.links = (Links) j760Var.a;
            NewVisitors newVisitors = visitorInfo.newVisitors;
            if (newVisitors.totalCount > 0 && newVisitors.visitors.size() > 0) {
                List<? extends Visitor> list = visitorInfo.newVisitors.visitors;
                list.getClass();
                i9m0Var.m16556F0("新访客", list, -1);
            }
            List<? extends Visitor> list2 = visitorInfo.allVisitors.visitors;
            list2.getClass();
            i9m0Var.m16556F0("全部", list2, -3);
            zM16560J0 = i9m0Var.m16560J0(visitorInfo);
        } else {
            zM16560J0 = false;
        }
        i9m0Var.m16558H0(zM16560J0);
    }

    /* JADX INFO: renamed from: p0 */
    public static void m16547p0(i9m0 i9m0Var, boolean z) {
        ((r9m0) ((jq2) i9m0Var).viewModel).m22760R(i9m0Var.hideNavigation, z);
    }

    /* JADX INFO: renamed from: q0 */
    public static Boolean m16548q0(UserPrivilege userPrivilege) {
        return Boolean.valueOf(xma.m27363T3(userPrivilege));
    }

    /* JADX INFO: renamed from: r0 */
    public static void m16549r0(i9m0 i9m0Var, boolean z, VisitorSetting visitorSetting) {
        visitorSetting.getClass();
        i9m0Var.visitorPermission = visitorSetting.visitorPermission;
        ((r9m0) ((jq2) i9m0Var).viewModel).m22760R(i9m0Var.hideNavigation, z);
    }

    /* JADX INFO: renamed from: s0 */
    public static void m16550s0(Throwable th) {
        if (th instanceof TantanException.Client.TantanForbidden) {
            osi0.g("此功能24小時只能修改一次");
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static void m16551t0(i9m0 i9m0Var, Bundle bundle) {
        ((r9m0) ((jq2) i9m0Var).viewModel).m22759Q(i9m0Var.hideNavigation);
        if (!i9m0Var.visitorPermission) {
            if (CoreModule.m1854P().m11706a().m5419dd() && !CoreModule.m1854P().m11706a().m19853a2()) {
                ((r9m0) ((jq2) i9m0Var).viewModel).m22768Z("p_navigation_visit,default");
            }
            i9m0Var.m16535A0();
            return;
        }
        i9m0Var.getData();
        if (!xma.m27351F3() && TextUtils.equals(i9m0Var.from, "p_see_who_likes_me_view_membership")) {
            ((r9m0) ((jq2) i9m0Var).viewModel).m22768Z("p_navigation_visit,button_pull");
        } else {
            if (!CoreModule.m1854P().m11706a().m5419dd() || CoreModule.m1854P().m11706a().m19853a2()) {
                return;
            }
            ((r9m0) ((jq2) i9m0Var).viewModel).m22768Z("p_navigation_visit,default");
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static void m16552u0(i9m0 i9m0Var, VisitorSetting visitorSetting) {
        visitorSetting.getClass();
        if (Intrinsics.d(visitorSetting.userId, CoreModule.m1850H().userId())) {
            boolean z = visitorSetting.visitorPermission;
            if (i9m0Var.visitorPermission ^ z) {
                i9m0Var.visitorPermission = z;
                ((r9m0) ((jq2) i9m0Var).viewModel).m22760R(i9m0Var.hideNavigation, z);
            }
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final void m16553C0() {
        getData();
    }

    /* JADX INFO: renamed from: D0 */
    public final void m16554D0(final boolean visitorPermission) {
        if (CoreModule.f1534c.f3657n2.m22251L3() ^ visitorPermission) {
            duringCreated(CoreModule.f1534c.f3657n2.m22273h4(CoreModule.m1850H().userId(), visitorPermission)).subscribe(mkd0.H(new e30() { // from class: l.x8m0
                public final void call(Object obj) {
                    i9m0.m16549r0(this.f27391a, visitorPermission, (VisitorSetting) obj);
                }
            }, new e30() { // from class: l.y8m0
                public final void call(Object obj) {
                    i9m0.m16550s0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m16555E0(List<? extends UnPrivilegedVisitor> visitors) {
        int size = visitors.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            UnPrivilegedVisitor unPrivilegedVisitor = visitors.get(i);
            if (!this.visitorUidMap.contains(unPrivilegedVisitor.userId)) {
                this.visitorItems.add(new y5m0(unPrivilegedVisitor, i != 0));
                this.visitorUidMap.add(unPrivilegedVisitor.userId);
            }
            i++;
        }
        VisitorCounter visitorCounterMc = CoreModule.m1851K().mc();
        if (visitorCounterMc != null) {
            List<y5m0> list = this.visitorItems;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            list.add(new y5m0(String.format("%s人看过我 · 开通黑金会员一键解锁", Arrays.copyOf(new Object[]{Integer.valueOf(visitorCounterMc.totalCnt)}, 1)), false));
            this.visitorUidMap.add("-4");
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    /* JADX INFO: renamed from: F0 */
    public final void m16556F0(String moduleName, List<? extends Visitor> visitors, int part) {
        ArrayList arrayList = new ArrayList();
        for (Visitor visitor : visitors) {
            if (!this.visitorUidMap.contains(visitor.userId)) {
                arrayList.add(new y5m0(visitor, null, part));
                this.visitorUidMap.add(visitor.userId);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (!TextUtils.isEmpty(moduleName) && (!this.visitorItems.isEmpty() || part != -3)) {
            if (this.visitorItems.isEmpty()) {
                this.visitorItems.add(new y5m0(Visitor.new_(), moduleName, part));
            } else {
                List<y5m0> list = this.visitorItems;
                if (list.get(list.size() - 1).f28033a != part) {
                    this.visitorItems.add(new y5m0(Visitor.new_(), moduleName, part));
                }
            }
        }
        this.visitorItems.addAll(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0034  */
    /* JADX WARN: Code duplicated, block: B:15:0x005d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:23:0x0089  */
    /* JADX INFO: renamed from: G0 */
    public final void m16557G0(boolean success, j760<Links, VisitorInfo> pair) {
        boolean zM16560J0;
        VisitorInfo visitorInfo;
        NewVisitors newVisitors;
        RecommendVisitors recommendVisitors;
        if (pair == null || (visitorInfo = (VisitorInfo) pair.b) == null) {
            zM16560J0 = false;
        } else {
            this.visitorItems.clear();
            this.visitorUidMap.clear();
            this.links = (Links) pair.a;
            if (xma.m27351F3()) {
                newVisitors = visitorInfo.newVisitors;
                if (newVisitors.totalCount > 0) {
                    recommendVisitors = visitorInfo.recommendVisitors;
                    if (recommendVisitors.totalCount > 0) {
                        List<? extends Visitor> list = visitorInfo.allVisitors.visitors;
                        list.getClass();
                        m16556F0("全部", list, -3);
                    } else {
                        List<? extends Visitor> list2 = visitorInfo.allVisitors.visitors;
                        list2.getClass();
                        m16556F0("全部", list2, -3);
                    }
                } else {
                    recommendVisitors = visitorInfo.recommendVisitors;
                    if (recommendVisitors.totalCount > 0) {
                        List<? extends Visitor> list3 = visitorInfo.allVisitors.visitors;
                        list3.getClass();
                        m16556F0("全部", list3, -3);
                    } else {
                        List<? extends Visitor> list4 = visitorInfo.allVisitors.visitors;
                        list4.getClass();
                        m16556F0("全部", list4, -3);
                    }
                }
            } else {
                List list5 = visitorInfo.unprivilegedVisitors;
                list5.getClass();
                if (list5.isEmpty()) {
                    newVisitors = visitorInfo.newVisitors;
                    if (newVisitors.totalCount > 0 || newVisitors.visitors.size() <= 0) {
                        recommendVisitors = visitorInfo.recommendVisitors;
                        if (recommendVisitors.totalCount > 0 || recommendVisitors.visitors.size() <= 0) {
                            List<? extends Visitor> list6 = visitorInfo.allVisitors.visitors;
                            list6.getClass();
                            m16556F0("全部", list6, -3);
                        } else {
                            if (!xma.m27351F3()) {
                                List<? extends Visitor> list7 = visitorInfo.recommendVisitors.visitors;
                                list7.getClass();
                                m16556F0("推荐", list7, -2);
                            }
                            List<? extends Visitor> list8 = visitorInfo.allVisitors.visitors;
                            list8.getClass();
                            m16556F0("全部", list8, -3);
                        }
                    } else {
                        List<? extends Visitor> list9 = visitorInfo.newVisitors.visitors;
                        list9.getClass();
                        m16556F0("新访客", list9, -1);
                        List<? extends Visitor> list10 = visitorInfo.allVisitors.visitors;
                        list10.getClass();
                        m16556F0("全部", list10, -3);
                    }
                } else {
                    List<? extends UnPrivilegedVisitor> list11 = visitorInfo.unprivilegedVisitors;
                    list11.getClass();
                    m16555E0(list11);
                }
            }
            zM16560J0 = m16560J0(visitorInfo);
        }
        ((r9m0) ((jq2) this).viewModel).m22774u(success);
        m16558H0(zM16560J0);
    }

    /* JADX INFO: renamed from: H0 */
    public final void m16558H0(boolean loading) {
        boolean zM22251L3 = CoreModule.f1534c.f3657n2.m22251L3();
        s7m s7mVar = ((jq2) this).viewModel;
        if (zM22251L3) {
            ((r9m0) s7mVar).m22761S(this.visitorItems, loading);
        } else {
            ((r9m0) s7mVar).m22760R(this.hideNavigation, false);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final void m16559I0() {
        CoreModule.f1534c.f3657n2.m22274i4(this.currentVisitorFilterSettings);
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m16560J0(VisitorInfo visitorInfo) {
        int i;
        int size = visitorInfo != null ? visitorInfo.allVisitors.visitors.size() + visitorInfo.newVisitors.visitors.size() + visitorInfo.recommendVisitors.visitors.size() : 0;
        if (!m16566z0(this.links) || size > 4 || (i = this.autoLoadMoreRetryCount) >= 10) {
            this.autoLoadMoreRetryCount = 0;
            return false;
        }
        this.autoLoadMoreRetryCount = i + 1;
        m16561L0();
        return true;
    }

    /* JADX INFO: renamed from: L0 */
    public final void m16561L0() {
        duringCreated(CoreModule.f1534c.f3657n2.m22267b4(CoreModule.m1850H().userId(), this.links, "list", true)).subscribe(mkd0.H(new e30() { // from class: l.v8m0
            public final void call(Object obj) {
                i9m0.m16546o0(this.f24221a, (j760) obj);
            }
        }, new e30() { // from class: l.w8m0
            public final void call(Object obj) {
                i9m0.m16545n0(this.f25031a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    public void m16562Z() {
        super.Z();
        Bundle arguments = this.visitorsMeFrag.getArguments();
        this.from = arguments != null ? arguments.getString("from") : null;
        this.hideNavigation = arguments != null ? arguments.getBoolean("hideNavigation", false) : false;
        this.visitorPermission = CoreModule.f1534c.f3657n2.m22251L3();
    }

    /* JADX INFO: renamed from: a0 */
    public void m16563a0() {
        super.a0();
        creates(new e30() { // from class: l.r8m0
            public final void call(Object obj) {
                i9m0.m16551t0(this.f20412a, (Bundle) obj);
            }
        }, new d30() { // from class: l.z8m0
            public final void call() {
                i9m0.m16544m0();
            }
        });
        duringCreated(CoreModule.f1534c.f3657n2.m22249J3(CoreModule.m1850H().userId())).subscribe(mkd0.G(new e30() { // from class: l.a9m0
            public final void call(Object obj) {
                i9m0.m16552u0(this.f8171a, (VisitorSetting) obj);
            }
        }));
        c<UserPrivilege> cVarM27419u3 = CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("oDiamond"));
        final Function1 function1 = new Function1() { // from class: l.b9m0
            public final Object invoke(Object obj) {
                return i9m0.m16548q0((UserPrivilege) obj);
            }
        };
        duringCreated(cVarM27419u3.map(new w9j() { // from class: l.c9m0
            public final Object call(Object obj) {
                return i9m0.m16538g0(function1, obj);
            }
        }).distinctUntilChanged()).skip(1).subscribe(mkd0.G(new e30() { // from class: l.d9m0
            public final void call(Object obj) {
                i9m0.m16539h0(this.f10240a, (Boolean) obj);
            }
        }));
        if (CoreModule.m1854P().m11711g().m6989d4()) {
            duringCreated(CoreModule.f1534c.f3657n2.m22284s4()).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.e9m0
                public final void call(Object obj) {
                    i9m0.m16547p0(this.f11022a, ((Boolean) obj).booleanValue());
                }
            }));
        }
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.visitor.AbstractC0481a.a
    /* JADX INFO: renamed from: e */
    public void mo11374e(int position) {
        if (position >= this.visitorItems.size() - 4 && this.visitorItems.size() > 0 && m16566z0(this.links) && xma.m27351F3() && this.autoLoadMoreRetryCount == 0) {
            m16561L0();
        }
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.visitor.AbstractC0481a.a
    public void getData() {
        final String strM22243D3;
        CoreModule.f1534c.f3657n2.m22242C3(CoreModule.m1850H().userId());
        if (!xma.m27351F3()) {
            duringCreated(new v9j() { // from class: l.f9m0
                public final Object call() {
                    return i9m0.m16542k0();
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.g9m0
                public final void call(Object obj) {
                    i9m0.m16536e0(this.f13119a, (j760) obj);
                }
            }, new e30() { // from class: l.h9m0
                public final void call(Object obj) {
                    i9m0.m16541j0(this.f13766a, (Throwable) obj);
                }
            }));
            return;
        }
        if (NullChecker.a(this.currentVisitorFilterSettings)) {
            strM22243D3 = CoreModule.f1534c.f3657n2.m22243D3(this.currentVisitorFilterSettings);
            strM22243D3.getClass();
        } else {
            strM22243D3 = "";
        }
        duringCreated(new v9j() { // from class: l.s8m0
            public final Object call() {
                return i9m0.m16540i0(strM22243D3);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.t8m0
            public final void call(Object obj) {
                i9m0.m16543l0(this.f21956a, (j760) obj);
            }
        }, new e30() { // from class: l.u8m0
            public final void call(Object obj) {
                i9m0.m16537f0(this.f23431a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x0 */
    public final boolean m16564x0() {
        return !Intrinsics.d(this.currentVisitorFilterSettings, CoreModule.f1534c.f3657n2.m22250K3());
    }

    @NotNull
    /* JADX INFO: renamed from: y0, reason: from getter */
    public final VisitorFilterSettings getCurrentVisitorFilterSettings() {
        return this.currentVisitorFilterSettings;
    }

    /* JADX INFO: renamed from: z0 */
    public final boolean m16566z0(@Nullable Links links) {
        return !TextUtils.isEmpty(links != null ? links.next : null);
    }

    public void destroy() {
    }
}
