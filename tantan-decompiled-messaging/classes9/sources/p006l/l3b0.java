package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.c4g0;
import l.e30;
import l.mkd0;
import l.riy;
import l.vwb;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020.0\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R(\u00106\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b2\u00100\u001a\u0004\b3\u00104\"\u0004\b5\u0010\u0011R\"\u0010=\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001a0>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00100¨\u0006@"}, d2 = {"Ll/l3b0;", "", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "", "k", "()V", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "g", "(Ljava/util/List;)V", "n", "origin", "i", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)Lcom/p1/mobile/putong/core/ui/purchase/d;", "", "quantity", "h", "(I)Lcom/p1/mobile/putong/core/ui/purchase/d;", "Ll/l3b0$a;", "iPurchaseExtraSectionsRefreshListener", "m", "(Ll/l3b0$a;)V", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "Ll/c4g0;", "d", "Ll/c4g0;", "merchandiseSubs", "Lcom/p1/mobile/putong/core/data/Merchandise;", "e", "Ljava/util/List;", "merchandises", "f", "j", "()Ljava/util/List;", "p", "purchaseSectionsSource", "", "Z", "l", "()Z", "o", "(Z)V", "isExtraSelected", "", "purchaseExtraSectionsRefreshListeners", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public List<? extends d> purchaseSectionsSource;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean isExtraSelected;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public List<InterfaceC0962a> purchaseExtraSectionsRefreshListeners;

    /* JADX INFO: renamed from: l.l3b0$a */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Ll/l3b0$a;", "", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "a", "(Ljava/util/List;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC0962a {
        /* JADX INFO: renamed from: a */
        void mo18562a(@NotNull List<? extends d> sections);
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
    public static void m18546a(l3b0 l3b0Var, List list) {
        list.getClass();
        l3b0Var.merchandises = list;
        l3b0Var.m18561p(new riy(l3b0Var.act, l3b0Var.purchaseType).c(list));
        l3b0Var.m18552g(l3b0Var.m18555j());
        Iterator<InterfaceC0962a> it = l3b0Var.purchaseExtraSectionsRefreshListeners.iterator();
        while (it.hasNext()) {
            it.next().mo18562a(l3b0Var.m18555j());
        }
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m18547b(int i, d dVar) {
        return Boolean.valueOf(dVar.m() && dVar.b().s().quantity == i && dVar.b().s().monthType());
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m18548c(d dVar, d dVar2) {
        return Boolean.valueOf(dVar2.m() && dVar2.b().s().quantity == dVar.b().s().quantity);
    }

    /* JADX INFO: renamed from: d */
    public static Boolean m18549d(List list) {
        list.getClass();
        return Boolean.valueOf(!list.isEmpty());
    }

    /* JADX INFO: renamed from: e */
    public static Boolean m18550e(d dVar, d dVar2) {
        return Boolean.valueOf(!dVar2.m() && dVar2.d().s().quantity == dVar.d().s().quantity);
    }

    /* JADX INFO: renamed from: f */
    public static Boolean m18551f(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g */
    public final void m18552g(@NotNull List<? extends d> sections) {
        sections.getClass();
        Iterator<? extends d> it = sections.iterator();
        while (it.hasNext()) {
            it.next().w(true);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final d m18553h(final int quantity) {
        return (d) vwb.r(m18555j(), new w9j() { // from class: l.k3b0
            public final Object call(Object obj) {
                return l3b0.m18547b(quantity, (d) obj);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final d m18554i(@NotNull final d origin) {
        origin.getClass();
        return origin.m() ? (d) vwb.r(m18555j(), new w9j() { // from class: l.i3b0
            public final Object call(Object obj) {
                return l3b0.m18548c(origin, (d) obj);
            }
        }) : (d) vwb.r(m18555j(), new w9j() { // from class: l.j3b0
            public final Object call(Object obj) {
                return l3b0.m18550e(origin, (d) obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final List<d> m18555j() {
        List<? extends d> list = this.purchaseSectionsSource;
        if (list != null) {
            return list;
        }
        Intrinsics.r("purchaseSectionsSource");
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m18556k() {
        m18559n();
        c cVarDuringCreated = this.act.duringCreated(CoreModule.f1534c.f3643j0.m2572y5(this.purchaseType.productCategory()));
        final Function1 function1 = new Function1() { // from class: l.f3b0
            public final Object invoke(Object obj) {
                return l3b0.m18549d((List) obj);
            }
        };
        this.merchandiseSubs = cVarDuringCreated.filter(new w9j() { // from class: l.g3b0
            public final Object call(Object obj) {
                return l3b0.m18551f(function1, obj);
            }
        }).take(1).subscribe(mkd0.G(new e30() { // from class: l.h3b0
            public final void call(Object obj) {
                l3b0.m18546a(this.f13669a, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsExtraSelected() {
        return this.isExtraSelected;
    }

    /* JADX INFO: renamed from: m */
    public final void m18558m(@NotNull InterfaceC0962a iPurchaseExtraSectionsRefreshListener) {
        iPurchaseExtraSectionsRefreshListener.getClass();
        if (this.purchaseExtraSectionsRefreshListeners.contains(iPurchaseExtraSectionsRefreshListener)) {
            return;
        }
        this.purchaseExtraSectionsRefreshListeners.add(iPurchaseExtraSectionsRefreshListener);
    }

    /* JADX INFO: renamed from: n */
    public final void m18559n() {
        mkd0.z(this.merchandiseSubs);
        this.merchandiseSubs = null;
    }

    /* JADX INFO: renamed from: o */
    public final void m18560o(boolean z) {
        this.isExtraSelected = z;
    }

    /* JADX INFO: renamed from: p */
    public final void m18561p(@NotNull List<? extends d> list) {
        list.getClass();
        this.purchaseSectionsSource = list;
    }
}
