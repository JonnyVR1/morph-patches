package p149l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020.0\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R(\u00106\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b2\u00100\u001a\u0004\b3\u00104\"\u0004\b5\u0010\u0011R\"\u0010=\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001a0>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00100¨\u0006@"}, m87232d2 = {"Ll/l3b0;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "", "k", "()V", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "g", "(Ljava/util/List;)V", "n", "origin", RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/putong/core/ui/purchase/d;)Lcom/p1/mobile/putong/core/ui/purchase/d;", "", FirebaseAnalytics.Param.QUANTITY, "h", "(I)Lcom/p1/mobile/putong/core/ui/purchase/d;", "Ll/l3b0$a;", "iPurchaseExtraSectionsRefreshListener", "m", "(Ll/l3b0$a;)V", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "Ll/c4g0;", Constants.INAPP_DATA_TAG, "Ll/c4g0;", "merchandiseSubs", "Lcom/p1/mobile/putong/core/data/Merchandise;", "e", "Ljava/util/List;", "merchandises", "f", "j", "()Ljava/util/List;", "p", "purchaseSectionsSource", "", "Z", BLiveStormDanmakuGiftResourceType.f44444l, "()Z", "o", "(Z)V", "isExtraSelected", "", "purchaseExtraSectionsRefreshListeners", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class l3b0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String from;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public c4g0 merchandiseSubs;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public List<? extends Merchandise> merchandises;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public List<? extends C8765d> purchaseSectionsSource;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean isExtraSelected;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public List<InterfaceC18144a> purchaseExtraSectionsRefreshListeners;

    /* JADX INFO: renamed from: l.l3b0$a */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, m87232d2 = {"Ll/l3b0$a;", "", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "a", "(Ljava/util/List;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public interface InterfaceC18144a {
        /* JADX INFO: renamed from: a */
        void mo148388a(@NotNull List<? extends C8765d> sections);
    }

    public l3b0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.purchaseExtraSectionsRefreshListeners = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static void m148372a(l3b0 l3b0Var, List list) {
        list.getClass();
        l3b0Var.merchandises = list;
        l3b0Var.m148387p(new riy(l3b0Var.act, l3b0Var.purchaseType).m179537c(list));
        l3b0Var.m148378g(l3b0Var.m148381j());
        Iterator<InterfaceC18144a> it = l3b0Var.purchaseExtraSectionsRefreshListeners.iterator();
        while (it.hasNext()) {
            it.next().mo148388a(l3b0Var.m148381j());
        }
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m148373b(int i, C8765d c8765d) {
        return Boolean.valueOf(c8765d.m53531m() && c8765d.m53520b().m53601s().quantity == i && c8765d.m53520b().m53601s().monthType());
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m148374c(C8765d c8765d, C8765d c8765d2) {
        return Boolean.valueOf(c8765d2.m53531m() && c8765d2.m53520b().m53601s().quantity == c8765d.m53520b().m53601s().quantity);
    }

    /* JADX INFO: renamed from: d */
    public static Boolean m148375d(List list) {
        list.getClass();
        return Boolean.valueOf(!list.isEmpty());
    }

    /* JADX INFO: renamed from: e */
    public static Boolean m148376e(C8765d c8765d, C8765d c8765d2) {
        return Boolean.valueOf(!c8765d2.m53531m() && c8765d2.m53522d().m53601s().quantity == c8765d.m53522d().m53601s().quantity);
    }

    /* JADX INFO: renamed from: f */
    public static Boolean m148377f(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g */
    public final void m148378g(@NotNull List<? extends C8765d> sections) {
        sections.getClass();
        Iterator<? extends C8765d> it = sections.iterator();
        while (it.hasNext()) {
            it.next().m53541w(true);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final C8765d m148379h(final int quantity) {
        return (C8765d) vwb.m200346r(m148381j(), new w9j() { // from class: l.k3b0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return l3b0.m148373b(quantity, (C8765d) obj);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final C8765d m148380i(@NotNull final C8765d origin) {
        origin.getClass();
        return origin.m53531m() ? (C8765d) vwb.m200346r(m148381j(), new w9j() { // from class: l.i3b0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return l3b0.m148374c(origin, (C8765d) obj);
            }
        }) : (C8765d) vwb.m200346r(m148381j(), new w9j() { // from class: l.j3b0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return l3b0.m148376e(origin, (C8765d) obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final List<C8765d> m148381j() {
        List list = this.purchaseSectionsSource;
        if (list != null) {
            return list;
        }
        Intrinsics.m87502r("purchaseSectionsSource");
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m148382k() {
        m148385n();
        C22306c c22306cDuringCreated = this.act.duringCreated(CoreModule.f17545c.f19654j0.m30644y5(this.purchaseType.productCategory()));
        final Function1 function1 = new Function1() { // from class: l.f3b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l3b0.m148375d((List) obj);
            }
        };
        this.merchandiseSubs = c22306cDuringCreated.filter(new w9j() { // from class: l.g3b0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return l3b0.m148377f(function1, obj);
            }
        }).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.h3b0
            @Override // p149l.e30
            public final void call(Object obj) {
                l3b0.m148372a(this.f105591a, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsExtraSelected() {
        return this.isExtraSelected;
    }

    /* JADX INFO: renamed from: m */
    public final void m148384m(@NotNull InterfaceC18144a iPurchaseExtraSectionsRefreshListener) {
        iPurchaseExtraSectionsRefreshListener.getClass();
        if (this.purchaseExtraSectionsRefreshListeners.contains(iPurchaseExtraSectionsRefreshListener)) {
            return;
        }
        this.purchaseExtraSectionsRefreshListeners.add(iPurchaseExtraSectionsRefreshListener);
    }

    /* JADX INFO: renamed from: n */
    public final void m148385n() {
        mkd0.m154992z(this.merchandiseSubs);
        this.merchandiseSubs = null;
    }

    /* JADX INFO: renamed from: o */
    public final void m148386o(boolean z) {
        this.isExtraSelected = z;
    }

    /* JADX INFO: renamed from: p */
    public final void m148387p(@NotNull List<? extends C8765d> list) {
        list.getClass();
        this.purchaseSectionsSource = list;
    }
}
