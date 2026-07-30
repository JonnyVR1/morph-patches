package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020.0\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R(\u00106\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b2\u00100\u001a\u0004\b3\u00104\"\u0004\b5\u0010\u0011R\"\u0010=\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001a0>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00100¨\u0006@"}, m88121d2 = {"Ll/pbb0;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "", "k", "()V", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "g", "(Ljava/util/List;)V", "n", "origin", RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/putong/core/ui/purchase/d;)Lcom/p1/mobile/putong/core/ui/purchase/d;", "", FirebaseAnalytics.Param.QUANTITY, "h", "(I)Lcom/p1/mobile/putong/core/ui/purchase/d;", "Ll/pbb0$a;", "iPurchaseExtraSectionsRefreshListener", "m", "(Ll/pbb0$a;)V", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "Ll/kcg0;", Constants.INAPP_DATA_TAG, "Ll/kcg0;", "merchandiseSubs", "Lcom/p1/mobile/putong/core/data/Merchandise;", "e", "Ljava/util/List;", "merchandises", "f", "j", "()Ljava/util/List;", "p", "purchaseSectionsSource", "", "Z", BLiveStormDanmakuGiftResourceType.f45292l, "()Z", "o", "(Z)V", "isExtraSelected", "", "purchaseExtraSectionsRefreshListeners", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class pbb0 {

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
    public kcg0 merchandiseSubs;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public List<? extends Merchandise> merchandises;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public List<? extends C8928d> purchaseSectionsSource;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean isExtraSelected;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public List<InterfaceC19335a> purchaseExtraSectionsRefreshListeners;

    /* JADX INFO: renamed from: l.pbb0$a */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, m88121d2 = {"Ll/pbb0$a;", "", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "a", "(Ljava/util/List;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface InterfaceC19335a {
        /* JADX INFO: renamed from: a */
        void mo114112a(@NotNull List<? extends C8928d> sections);
    }

    public pbb0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.purchaseExtraSectionsRefreshListeners = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static void m171493a(pbb0 pbb0Var, List list) {
        list.getClass();
        pbb0Var.merchandises = list;
        pbb0Var.m171508p(new ory(pbb0Var.act, pbb0Var.purchaseType).m168946c(list));
        pbb0Var.m171499g(pbb0Var.m171502j());
        Iterator<InterfaceC19335a> it = pbb0Var.purchaseExtraSectionsRefreshListeners.iterator();
        while (it.hasNext()) {
            it.next().mo114112a(pbb0Var.m171502j());
        }
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m171494b(int i, C8928d c8928d) {
        return Boolean.valueOf(c8928d.m54714m() && c8928d.m54703b().m54784s().quantity == i && c8928d.m54703b().m54784s().monthType());
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m171495c(C8928d c8928d, C8928d c8928d2) {
        return Boolean.valueOf(c8928d2.m54714m() && c8928d2.m54703b().m54784s().quantity == c8928d.m54703b().m54784s().quantity);
    }

    /* JADX INFO: renamed from: d */
    public static Boolean m171496d(List list) {
        list.getClass();
        return Boolean.valueOf(!list.isEmpty());
    }

    /* JADX INFO: renamed from: e */
    public static Boolean m171497e(C8928d c8928d, C8928d c8928d2) {
        return Boolean.valueOf(!c8928d2.m54714m() && c8928d2.m54705d().m54784s().quantity == c8928d.m54705d().m54784s().quantity);
    }

    /* JADX INFO: renamed from: f */
    public static Boolean m171498f(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g */
    public final void m171499g(@NotNull List<? extends C8928d> sections) {
        sections.getClass();
        Iterator<? extends C8928d> it = sections.iterator();
        while (it.hasNext()) {
            it.next().m54724w(true);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final C8928d m171500h(final int quantity) {
        return (C8928d) jyb.m147529r(m171502j(), new qcj() { // from class: l.obb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return pbb0.m171494b(quantity, (C8928d) obj);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final C8928d m171501i(@NotNull final C8928d origin) {
        origin.getClass();
        return origin.m54714m() ? (C8928d) jyb.m147529r(m171502j(), new qcj() { // from class: l.mbb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return pbb0.m171495c(origin, (C8928d) obj);
            }
        }) : (C8928d) jyb.m147529r(m171502j(), new qcj() { // from class: l.nbb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return pbb0.m171497e(origin, (C8928d) obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final List<C8928d> m171502j() {
        List list = this.purchaseSectionsSource;
        if (list != null) {
            return list;
        }
        Intrinsics.m88391r("purchaseSectionsSource");
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m171503k() {
        m171506n();
        C22421c c22421cDuringCreated = this.act.duringCreated(CoreModule.f18264c.f20396j0.m31647y5(this.purchaseType.productCategory()));
        final Function1 function1 = new Function1() { // from class: l.jbb0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return pbb0.m171496d((List) obj);
            }
        };
        this.merchandiseSubs = c22421cDuringCreated.filter(new qcj() { // from class: l.kbb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return pbb0.m171498f(function1, obj);
            }
        }).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.lbb0
            @Override // p153l.y20
            public final void call(Object obj) {
                pbb0.m171493a(this.f130797a, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsExtraSelected() {
        return this.isExtraSelected;
    }

    /* JADX INFO: renamed from: m */
    public final void m171505m(@NotNull InterfaceC19335a iPurchaseExtraSectionsRefreshListener) {
        iPurchaseExtraSectionsRefreshListener.getClass();
        if (this.purchaseExtraSectionsRefreshListeners.contains(iPurchaseExtraSectionsRefreshListener)) {
            return;
        }
        this.purchaseExtraSectionsRefreshListeners.add(iPurchaseExtraSectionsRefreshListener);
    }

    /* JADX INFO: renamed from: n */
    public final void m171506n() {
        psd0.m173633z(this.merchandiseSubs);
        this.merchandiseSubs = null;
    }

    /* JADX INFO: renamed from: o */
    public final void m171507o(boolean z) {
        this.isExtraSelected = z;
    }

    /* JADX INFO: renamed from: p */
    public final void m171508p(@NotNull List<? extends C8928d> list) {
        list.getClass();
        this.purchaseSectionsSource = list;
    }
}
