package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.data.VisitorFilterSettings;
import com.p051p1.mobile.putong.core.data.VisitorSetting;
import com.p051p1.mobile.putong.core.p058ui.visitor.AbstractC9208a;
import com.p051p1.mobile.putong.core.p058ui.visitor.visitorsme.VisitorsMeFrag;
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
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 T2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00018B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00102\u0018\u0010\u0016\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\n2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J-\u0010&\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020#0\u001c2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\nH\u0016¢\u0006\u0004\b(\u0010\fJ\u000f\u0010)\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010\fJ\u0015\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u0010¢\u0006\u0004\b+\u0010\u001bJ\r\u0010,\u001a\u00020\n¢\u0006\u0004\b,\u0010\fJ\u000f\u0010-\u001a\u00020\nH\u0016¢\u0006\u0004\b-\u0010\fJ\u0017\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020$H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00102\b\u00101\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u0010¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\n¢\u0006\u0004\b6\u0010\fJ\u000f\u00107\u001a\u00020\nH\u0016¢\u0006\u0004\b7\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010*\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010(R\u0016\u0010<\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010(R\u0018\u0010?\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u00101\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010@R\u0016\u0010C\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0017\u0010I\u001a\u00020D8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020K0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR$\u0010S\u001a\u0012\u0012\u0004\u0012\u00020!0Oj\b\u0012\u0004\u0012\u00020!`P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006U"}, m88121d2 = {"Ll/mim0;", "Ll/ar2;", "Ll/vim0;", "Lcom/p1/mobile/putong/core/ui/visitor/a$a;", "Lcom/p1/mobile/putong/core/ui/visitor/visitorsme/VisitorsMeFrag;", "visitorsMeFrag", "Ll/ner;", "lifecycleProvider", "<init>", "(Lcom/p1/mobile/putong/core/ui/visitor/visitorsme/VisitorsMeFrag;Ll/ner;)V", "", "A0", "()V", "L0", "Lcom/p1/mobile/putong/data/VisitorInfo;", "visitorInfo", "", "J0", "(Lcom/p1/mobile/putong/data/VisitorInfo;)Z", "success", "Ll/pf60;", "Lcom/p1/mobile/putong/data/Links;", "pair", "G0", "(ZLl/pf60;)V", "loading", "H0", "(Z)V", "", "Lcom/p1/mobile/putong/data/UnPrivilegedVisitor;", SchemeKey.visitors, "E0", "(Ljava/util/List;)V", "", "moduleName", "Lcom/p1/mobile/putong/data/Visitor;", "", "part", "F0", "(Ljava/lang/String;Ljava/util/List;I)V", "Z", "a0", "visitorPermission", "D0", "C0", "getData", "position", "e", "(I)V", "links", "z0", "(Lcom/p1/mobile/putong/data/Links;)Z", "x0", "()Z", "I0", "destroy", "a", "Lcom/p1/mobile/putong/core/ui/visitor/visitorsme/VisitorsMeFrag;", "b", "c", "hideNavigation", Constants.INAPP_DATA_TAG, "Ljava/lang/String;", "from", "Lcom/p1/mobile/putong/data/Links;", "f", "I", "autoLoadMoreRetryCount", "Lcom/p1/mobile/putong/core/data/VisitorFilterSettings;", "g", "Lcom/p1/mobile/putong/core/data/VisitorFilterSettings;", "y0", "()Lcom/p1/mobile/putong/core/data/VisitorFilterSettings;", "currentVisitorFilterSettings", "", "Ll/cfm0;", "h", "Ljava/util/List;", "visitorItems", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", RXScreenCaptureService.KEY_INDEX, "Ljava/util/HashSet;", "visitorUidMap", "Companion", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class mim0 extends ar2<vim0> implements AbstractC9208a.a {

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
    public final List<cfm0> visitorItems;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final HashSet<String> visitorUidMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mim0(@NotNull VisitorsMeFrag visitorsMeFrag, @NotNull ner nerVar) {
        super(nerVar);
        visitorsMeFrag.getClass();
        nerVar.getClass();
        this.visitorsMeFrag = visitorsMeFrag;
        this.from = "";
        VisitorFilterSettings visitorFilterSettingsMo225055clone = CoreModule.f18264c.f20410n2.m121465K3().mo225055clone();
        visitorFilterSettingsMo225055clone.getClass();
        this.currentVisitorFilterSettings = visitorFilterSettingsMo225055clone;
        this.visitorItems = new ArrayList();
        this.visitorUidMap = new HashSet<>();
    }

    /* JADX INFO: renamed from: A0 */
    private final void m158522A0() {
        if (joa.m146357G3()) {
            CoreModule.f18264c.f20410n2.m121481a4(CoreModule.m30929H().userId(), "list", "", true);
        } else {
            CoreModule.f18264c.f20410n2.m121497q4(true);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static void m158523e0(mim0 mim0Var, pf60 pf60Var) {
        pf60Var.getClass();
        mim0Var.autoLoadMoreRetryCount = 0;
        mim0Var.links = null;
        mim0Var.m158544G0(true, pf60Var);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m158524f0(mim0 mim0Var, Throwable th) {
        mim0Var.m158544G0(false, null);
    }

    /* JADX INFO: renamed from: g0 */
    public static Boolean m158525g0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m158526h0(mim0 mim0Var, Boolean bool) {
        if (CoreModule.f18264c.f20410n2.m121466L3()) {
            ((vim0) mim0Var.viewModel).m201383R(mim0Var.hideNavigation, true);
            mim0Var.getData();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static C22421c m158527i0(String str) {
        return CoreModule.f18264c.f20410n2.m121481a4(CoreModule.m30929H().userId(), "list", str, true);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m158528j0(mim0 mim0Var, Throwable th) {
        mim0Var.m158544G0(false, null);
    }

    /* JADX INFO: renamed from: k0 */
    public static C22421c m158529k0() {
        return CoreModule.f18264c.f20410n2.m121497q4(true);
    }

    /* JADX INFO: renamed from: l0 */
    public static void m158530l0(mim0 mim0Var, pf60 pf60Var) {
        pf60Var.getClass();
        mim0Var.autoLoadMoreRetryCount = 0;
        mim0Var.links = null;
        mim0Var.m158544G0(true, pf60Var);
    }

    /* JADX INFO: renamed from: m0 */
    public static void m158531m0() {
        CoreModule.f18264c.f20406m1.m35730s5();
    }

    /* JADX INFO: renamed from: n0 */
    public static void m158532n0(mim0 mim0Var, Throwable th) {
        mim0Var.autoLoadMoreRetryCount = 0;
        mim0Var.m158545H0(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o0 */
    public static void m158533o0(mim0 mim0Var, pf60 pf60Var) {
        boolean zM158547J0;
        pf60Var.getClass();
        VisitorInfo visitorInfo = (VisitorInfo) pf60Var.f152157b;
        if (visitorInfo != null) {
            mim0Var.links = (Links) pf60Var.f152156a;
            NewVisitors newVisitors = visitorInfo.newVisitors;
            if (newVisitors.totalCount > 0 && newVisitors.visitors.size() > 0) {
                List<Visitor> list = visitorInfo.newVisitors.visitors;
                list.getClass();
                mim0Var.m158543F0("新访客", list, -1);
            }
            List<Visitor> list2 = visitorInfo.allVisitors.visitors;
            list2.getClass();
            mim0Var.m158543F0("全部", list2, -3);
            zM158547J0 = mim0Var.m158547J0(visitorInfo);
        } else {
            zM158547J0 = false;
        }
        mim0Var.m158545H0(zM158547J0);
    }

    /* JADX INFO: renamed from: p0 */
    public static void m158534p0(mim0 mim0Var, boolean z) {
        ((vim0) mim0Var.viewModel).m201383R(mim0Var.hideNavigation, z);
    }

    /* JADX INFO: renamed from: q0 */
    public static Boolean m158535q0(UserPrivilege userPrivilege) {
        return Boolean.valueOf(joa.m146369U3(userPrivilege));
    }

    /* JADX INFO: renamed from: r0 */
    public static void m158536r0(mim0 mim0Var, boolean z, VisitorSetting visitorSetting) {
        visitorSetting.getClass();
        mim0Var.visitorPermission = visitorSetting.visitorPermission;
        ((vim0) mim0Var.viewModel).m201383R(mim0Var.hideNavigation, z);
    }

    /* JADX INFO: renamed from: s0 */
    public static void m158537s0(Throwable th) {
        if (th instanceof TantanException.Client.TantanForbidden) {
            r1j0.m179420g("此功能24小時只能修改一次");
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static void m158538t0(mim0 mim0Var, Bundle bundle) {
        ((vim0) mim0Var.viewModel).m201382Q(mim0Var.hideNavigation);
        if (!mim0Var.visitorPermission) {
            if (CoreModule.m30933P().m143405a().mo34485dd() && !CoreModule.m30933P().m143405a().mo180437a2()) {
                ((vim0) mim0Var.viewModel).m201391Z("p_navigation_visit,default");
            }
            mim0Var.m158522A0();
            return;
        }
        mim0Var.getData();
        if (!joa.m146357G3() && TextUtils.equals(mim0Var.from, "p_see_who_likes_me_view_membership")) {
            ((vim0) mim0Var.viewModel).m201391Z("p_navigation_visit,button_pull");
        } else {
            if (!CoreModule.m30933P().m143405a().mo34485dd() || CoreModule.m30933P().m143405a().mo180437a2()) {
                return;
            }
            ((vim0) mim0Var.viewModel).m201391Z("p_navigation_visit,default");
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static void m158539u0(mim0 mim0Var, VisitorSetting visitorSetting) {
        visitorSetting.getClass();
        if (Intrinsics.m88377d(visitorSetting.userId, CoreModule.m30929H().userId())) {
            boolean z = visitorSetting.visitorPermission;
            if (mim0Var.visitorPermission ^ z) {
                mim0Var.visitorPermission = z;
                ((vim0) mim0Var.viewModel).m201383R(mim0Var.hideNavigation, z);
            }
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final void m158540C0() {
        getData();
    }

    /* JADX INFO: renamed from: D0 */
    public final void m158541D0(final boolean visitorPermission) {
        if (CoreModule.f18264c.f20410n2.m121466L3() ^ visitorPermission) {
            duringCreated(CoreModule.f18264c.f20410n2.m121488h4(CoreModule.m30929H().userId(), visitorPermission)).subscribe(psd0.m173597H(new y20() { // from class: l.bim0
                @Override // p153l.y20
                public final void call(Object obj) {
                    mim0.m158536r0(this.f76897a, visitorPermission, (VisitorSetting) obj);
                }
            }, new y20() { // from class: l.cim0
                @Override // p153l.y20
                public final void call(Object obj) {
                    mim0.m158537s0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m158542E0(List<? extends UnPrivilegedVisitor> visitors) {
        int size = visitors.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            UnPrivilegedVisitor unPrivilegedVisitor = visitors.get(i);
            if (!this.visitorUidMap.contains(unPrivilegedVisitor.userId)) {
                this.visitorItems.add(new cfm0(unPrivilegedVisitor, i != 0));
                this.visitorUidMap.add(unPrivilegedVisitor.userId);
            }
            i++;
        }
        VisitorCounter visitorCounterMo31797mc = CoreModule.m30930K().mo31797mc();
        if (visitorCounterMo31797mc != null) {
            List<cfm0> list = this.visitorItems;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            list.add(new cfm0(String.format("%s人看过我 · 开通黑金会员一键解锁", Arrays.copyOf(new Object[]{Integer.valueOf(visitorCounterMo31797mc.totalCnt)}, 1)), false));
            this.visitorUidMap.add("-4");
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    /* JADX INFO: renamed from: F0 */
    public final void m158543F0(String moduleName, List<? extends Visitor> visitors, int part) {
        ArrayList arrayList = new ArrayList();
        for (Visitor visitor : visitors) {
            if (!this.visitorUidMap.contains(visitor.userId)) {
                arrayList.add(new cfm0(visitor, null, part));
                this.visitorUidMap.add(visitor.userId);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (!TextUtils.isEmpty(moduleName) && (!this.visitorItems.isEmpty() || part != -3)) {
            if (this.visitorItems.isEmpty()) {
                this.visitorItems.add(new cfm0(Visitor.new_(), moduleName, part));
            } else {
                List<cfm0> list = this.visitorItems;
                if (list.get(list.size() - 1).f81523a != part) {
                    this.visitorItems.add(new cfm0(Visitor.new_(), moduleName, part));
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
    public final void m158544G0(boolean success, pf60<Links, VisitorInfo> pair) {
        boolean zM158547J0;
        VisitorInfo visitorInfo;
        NewVisitors newVisitors;
        RecommendVisitors recommendVisitors;
        if (pair == null || (visitorInfo = pair.f152157b) == null) {
            zM158547J0 = false;
        } else {
            this.visitorItems.clear();
            this.visitorUidMap.clear();
            this.links = pair.f152156a;
            if (joa.m146357G3()) {
                newVisitors = visitorInfo.newVisitors;
                if (newVisitors.totalCount > 0) {
                    recommendVisitors = visitorInfo.recommendVisitors;
                    if (recommendVisitors.totalCount > 0) {
                        List<Visitor> list = visitorInfo.allVisitors.visitors;
                        list.getClass();
                        m158543F0("全部", list, -3);
                    } else {
                        List<Visitor> list2 = visitorInfo.allVisitors.visitors;
                        list2.getClass();
                        m158543F0("全部", list2, -3);
                    }
                } else {
                    recommendVisitors = visitorInfo.recommendVisitors;
                    if (recommendVisitors.totalCount > 0) {
                        List<Visitor> list3 = visitorInfo.allVisitors.visitors;
                        list3.getClass();
                        m158543F0("全部", list3, -3);
                    } else {
                        List<Visitor> list4 = visitorInfo.allVisitors.visitors;
                        list4.getClass();
                        m158543F0("全部", list4, -3);
                    }
                }
            } else {
                List<UnPrivilegedVisitor> list5 = visitorInfo.unprivilegedVisitors;
                list5.getClass();
                if (list5.isEmpty()) {
                    newVisitors = visitorInfo.newVisitors;
                    if (newVisitors.totalCount > 0 || newVisitors.visitors.size() <= 0) {
                        recommendVisitors = visitorInfo.recommendVisitors;
                        if (recommendVisitors.totalCount > 0 || recommendVisitors.visitors.size() <= 0) {
                            List<Visitor> list6 = visitorInfo.allVisitors.visitors;
                            list6.getClass();
                            m158543F0("全部", list6, -3);
                        } else {
                            if (!joa.m146357G3()) {
                                List<Visitor> list7 = visitorInfo.recommendVisitors.visitors;
                                list7.getClass();
                                m158543F0("推荐", list7, -2);
                            }
                            List<Visitor> list8 = visitorInfo.allVisitors.visitors;
                            list8.getClass();
                            m158543F0("全部", list8, -3);
                        }
                    } else {
                        List<Visitor> list9 = visitorInfo.newVisitors.visitors;
                        list9.getClass();
                        m158543F0("新访客", list9, -1);
                        List<Visitor> list10 = visitorInfo.allVisitors.visitors;
                        list10.getClass();
                        m158543F0("全部", list10, -3);
                    }
                } else {
                    List<UnPrivilegedVisitor> list11 = visitorInfo.unprivilegedVisitors;
                    list11.getClass();
                    m158542E0(list11);
                }
            }
            zM158547J0 = m158547J0(visitorInfo);
        }
        ((vim0) this.viewModel).m201396u(success);
        m158545H0(zM158547J0);
    }

    /* JADX INFO: renamed from: H0 */
    public final void m158545H0(boolean loading) {
        boolean zM121466L3 = CoreModule.f18264c.f20410n2.m121466L3();
        V v2 = this.viewModel;
        if (zM121466L3) {
            ((vim0) v2).m201384S(this.visitorItems, loading);
        } else {
            ((vim0) v2).m201383R(this.hideNavigation, false);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final void m158546I0() {
        CoreModule.f18264c.f20410n2.m121489i4(this.currentVisitorFilterSettings);
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m158547J0(VisitorInfo visitorInfo) {
        int i;
        int size = visitorInfo != null ? visitorInfo.allVisitors.visitors.size() + visitorInfo.newVisitors.visitors.size() + visitorInfo.recommendVisitors.visitors.size() : 0;
        if (!m158551z0(this.links) || size > 4 || (i = this.autoLoadMoreRetryCount) >= 10) {
            this.autoLoadMoreRetryCount = 0;
            return false;
        }
        this.autoLoadMoreRetryCount = i + 1;
        m158548L0();
        return true;
    }

    /* JADX INFO: renamed from: L0 */
    public final void m158548L0() {
        duringCreated(CoreModule.f18264c.f20410n2.m121482b4(CoreModule.m30929H().userId(), this.links, "list", true)).subscribe(psd0.m173597H(new y20() { // from class: l.zhm0
            @Override // p153l.y20
            public final void call(Object obj) {
                mim0.m158533o0(this.f204435a, (pf60) obj);
            }
        }, new y20() { // from class: l.aim0
            @Override // p153l.y20
            public final void call(Object obj) {
                mim0.m158532n0(this.f71547a, (Throwable) obj);
            }
        }));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        Bundle arguments = this.visitorsMeFrag.getArguments();
        this.from = arguments != null ? arguments.getString("from") : null;
        this.hideNavigation = arguments != null ? arguments.getBoolean("hideNavigation", false) : false;
        this.visitorPermission = CoreModule.f18264c.f20410n2.m121466L3();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.vhm0
            @Override // p153l.y20
            public final void call(Object obj) {
                mim0.m158538t0(this.f184177a, (Bundle) obj);
            }
        }, new x20() { // from class: l.dim0
            @Override // p153l.x20
            public final void call() {
                mim0.m158531m0();
            }
        });
        duringCreated(CoreModule.f18264c.f20410n2.m121464J3(CoreModule.m30929H().userId())).subscribe(psd0.m173596G(new y20() { // from class: l.eim0
            @Override // p153l.y20
            public final void call(Object obj) {
                mim0.m158539u0(this.f94183a, (VisitorSetting) obj);
            }
        }));
        C22421c<UserPrivilege> c22421cM146424v3 = CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("oDiamond"));
        final Function1 function1 = new Function1() { // from class: l.fim0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return mim0.m158535q0((UserPrivilege) obj);
            }
        };
        duringCreated(c22421cM146424v3.map(new qcj() { // from class: l.gim0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return mim0.m158525g0(function1, obj);
            }
        }).distinctUntilChanged()).skip(1).subscribe(psd0.m173596G(new y20() { // from class: l.him0
            @Override // p153l.y20
            public final void call(Object obj) {
                mim0.m158526h0(this.f110039a, (Boolean) obj);
            }
        }));
        if (CoreModule.m30933P().m143410g().mo36055d4()) {
            duringCreated(CoreModule.f18264c.f20410n2.m121499s4()).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.iim0
                @Override // p153l.y20
                public final void call(Object obj) {
                    mim0.m158534p0(this.f115109a, ((Boolean) obj).booleanValue());
                }
            }));
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.visitor.AbstractC9208a.a
    /* JADX INFO: renamed from: e */
    public void mo59048e(int position) {
        if (position >= this.visitorItems.size() - 4 && this.visitorItems.size() > 0 && m158551z0(this.links) && joa.m146357G3() && this.autoLoadMoreRetryCount == 0) {
            m158548L0();
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.visitor.AbstractC9208a.a
    public void getData() {
        final String strM121458D3;
        CoreModule.f18264c.f20410n2.m121457C3(CoreModule.m30929H().userId());
        if (!joa.m146357G3()) {
            duringCreated(new pcj() { // from class: l.jim0
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return mim0.m158529k0();
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.kim0
                @Override // p153l.y20
                public final void call(Object obj) {
                    mim0.m158523e0(this.f127008a, (pf60) obj);
                }
            }, new y20() { // from class: l.lim0
                @Override // p153l.y20
                public final void call(Object obj) {
                    mim0.m158528j0(this.f132241a, (Throwable) obj);
                }
            }));
            return;
        }
        if (NullChecker.m82486a(this.currentVisitorFilterSettings)) {
            strM121458D3 = CoreModule.f18264c.f20410n2.m121458D3(this.currentVisitorFilterSettings);
            strM121458D3.getClass();
        } else {
            strM121458D3 = "";
        }
        duringCreated(new pcj() { // from class: l.whm0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return mim0.m158527i0(strM121458D3);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.xhm0
            @Override // p153l.y20
            public final void call(Object obj) {
                mim0.m158530l0(this.f194387a, (pf60) obj);
            }
        }, new y20() { // from class: l.yhm0
            @Override // p153l.y20
            public final void call(Object obj) {
                mim0.m158524f0(this.f199977a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x0 */
    public final boolean m158549x0() {
        return !Intrinsics.m88377d(this.currentVisitorFilterSettings, CoreModule.f18264c.f20410n2.m121465K3());
    }

    @NotNull
    /* JADX INFO: renamed from: y0, reason: from getter */
    public final VisitorFilterSettings getCurrentVisitorFilterSettings() {
        return this.currentVisitorFilterSettings;
    }

    /* JADX INFO: renamed from: z0 */
    public final boolean m158551z0(@Nullable Links links) {
        return !TextUtils.isEmpty(links != null ? links.next : null);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
