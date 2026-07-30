package p002l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.Gender;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import l.d30;
import l.e30;
import l.g30;
import l.mkd0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\n\u0010\tJi\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJK\u0010\u001c\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u008b\u0001\u0010$\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050 2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\u0007H\u0007¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Ll/kwo;", "", "<init>", "()V", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseTypeList", "", "r", "(Ljava/util/List;)Z", "k", "Lcom/p1/mobile/android/app/Act;", "act", "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/core/data/Privilege;", "primaryPrivileges", "", "from", "Ll/e30;", "afterPaySuccess", "Ll/d30;", "onDismiss", "onCancel", "defaultSkuDuration", "autoPay", "", "t", "(Lcom/p1/mobile/android/app/Act;Ljava/util/ArrayList;Ljava/lang/String;Ll/e30;Ll/d30;Ll/d30;Ljava/lang/String;Z)V", "l", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/e30;Ll/d30;Ll/d30;)V", "q", "()Ljava/util/ArrayList;", "", "", "selectedIdx", "skipDiscountFullscreen", "n", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ljava/util/ArrayList;Ljava/lang/String;Ll/e30;Ll/d30;Ll/d30;ILjava/lang/String;ZZ)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class kwo {

    @NotNull
    public static final kwo INSTANCE = new kwo();

    /* JADX INFO: renamed from: a */
    public static Unit m16838a(Act act, ArrayList arrayList, String str, e30 e30Var, d30 d30Var, d30 d30Var2, String str2, boolean z) {
        m16856t(act, arrayList, str, e30Var, d30Var, d30Var2, str2, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static void m16839b(Function0 function0, List list) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: d */
    public static Unit m16841d(Act act, ArrayList arrayList, String str, e30 e30Var, d30 d30Var, d30 d30Var2) {
        if (CoreModule.c.x0.N3()) {
            m16857u(act, arrayList, str, e30Var, d30Var, d30Var2, null, false, 192, null);
        } else {
            m16851o(act, CollectionsKt.mutableListOf(new PurchaseType[]{PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE}), arrayList, str, e30Var, d30Var, d30Var2, 0, null, false, false, 1024, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static void m16842e(Function0 function0, List list) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: f */
    public static Unit m16843f(boolean z, Function0 function0, List list, Function0 function1) {
        if (!z && m16854r(list)) {
            function1.invoke();
        } else {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static void m16844g(Function0 function0, Throwable th) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: h */
    public static void m16845h(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        if (e30Var != null) {
            e30Var.call(purchaseType);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m16846i(Function0 function0, Throwable th) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: j */
    public static Unit m16847j(Act act, List list, ArrayList arrayList, String str, int i, d30 d30Var, d30 d30Var2, String str2, boolean z, final e30 e30Var) {
        w6p.C0875a c0875aM24418e = new w6p.C0875a(act).m24422i(list, arrayList).m24417d(str).m24421h(new g30() { // from class: l.jwo
            /* JADX INFO: renamed from: a */
            public final void m16392a(Object obj, Object obj2, Object obj3) {
                kwo.m16852p(e30Var, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).m24423j(i).m24419f(d30Var).m24420g(d30Var2).m24418e(d30Var2);
        if (str2 != null && str2.length() != 0) {
            c0875aM24418e.m24416c(str2);
        }
        if (z) {
            c0875aM24418e.m24415b(true);
        }
        c0875aM24418e.m24424k();
        return Unit.INSTANCE;
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: l */
    public static final void m16848l(@NotNull final Act act, @Nullable final String from, @Nullable final e30<PurchaseType> afterPaySuccess, @Nullable final d30 onDismiss, @Nullable final d30 onCancel) {
        act.getClass();
        final ArrayList<Privilege> arrayListM16853q = m16853q();
        final Function0 function0 = new Function0() { // from class: l.bwo
            public final Object invoke() {
                return kwo.m16841d(act, arrayListM16853q, from, afterPaySuccess, onDismiss, onCancel);
            }
        };
        if (CoreModule.c.x0.N3()) {
            function0.invoke();
        } else {
            act.duringCreated(CoreModule.c.x0.w4()).subscribe(mkd0.H(new e30() { // from class: l.cwo
                public final void call(Object obj) {
                    kwo.m16839b(function0, (List) obj);
                }
            }, new e30() { // from class: l.dwo
                public final void call(Object obj) {
                    kwo.m16844g(function0, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m16849m(Act act, String str, e30 e30Var, d30 d30Var, d30 d30Var2, int i, Object obj) {
        if ((i & 4) != 0) {
            e30Var = null;
        }
        if ((i & 8) != 0) {
            d30Var = null;
        }
        if ((i & 16) != 0) {
            d30Var2 = null;
        }
        m16848l(act, str, e30Var, d30Var, d30Var2);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: n */
    public static final void m16850n(@NotNull final Act act, @NotNull final List<PurchaseType> purchaseTypeList, @NotNull final ArrayList<Privilege> primaryPrivileges, @Nullable final String from, @Nullable final e30<PurchaseType> afterPaySuccess, @Nullable final d30 onDismiss, @Nullable final d30 onCancel, final int selectedIdx, @Nullable final String defaultSkuDuration, final boolean autoPay, final boolean skipDiscountFullscreen) {
        act.getClass();
        purchaseTypeList.getClass();
        primaryPrivileges.getClass();
        final Function0 function0 = new Function0() { // from class: l.ewo
            public final Object invoke() {
                return kwo.m16847j(act, purchaseTypeList, primaryPrivileges, from, selectedIdx, onDismiss, onCancel, defaultSkuDuration, autoPay, afterPaySuccess);
            }
        };
        final Function0 function1 = new Function0() { // from class: l.fwo
            public final Object invoke() {
                return kwo.m16838a(act, primaryPrivileges, from, afterPaySuccess, onDismiss, onCancel, defaultSkuDuration, autoPay);
            }
        };
        final Function0 function2 = new Function0() { // from class: l.gwo
            public final Object invoke() {
                return kwo.m16843f(skipDiscountFullscreen, function0, purchaseTypeList, function1);
            }
        };
        if (purchaseTypeList.size() != 1 || purchaseTypeList.get(0) != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            function2.invoke();
        } else if (CoreModule.c.x0.N3()) {
            function2.invoke();
        } else {
            act.duringCreated(CoreModule.c.x0.w4()).subscribe(mkd0.H(new e30() { // from class: l.hwo
                public final void call(Object obj) {
                    kwo.m16842e(function2, (List) obj);
                }
            }, new e30() { // from class: l.iwo
                public final void call(Object obj) {
                    kwo.m16846i(function2, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m16851o(Act act, List list, ArrayList arrayList, String str, e30 e30Var, d30 d30Var, d30 d30Var2, int i, String str2, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 128) != 0) {
            i = 0;
        }
        if ((i2 & 256) != 0) {
            str2 = null;
        }
        if ((i2 & 512) != 0) {
            z = false;
        }
        if ((i2 & 1024) != 0) {
            z2 = false;
        }
        m16850n(act, list, arrayList, str, e30Var, d30Var, d30Var2, i, str2, z, z2);
    }

    /* JADX INFO: renamed from: p */
    public static final void m16852p(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        if (e30Var != null) {
            e30Var.call(purchaseType);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: q */
    public static final ArrayList<Privilege> m16853q() {
        ArrayList<Privilege> arrayList = new ArrayList<>();
        ArrayList privilegeDataForGP = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeDataForGP((Gender) null);
        if (privilegeDataForGP != null && !privilegeDataForGP.isEmpty()) {
            arrayList.add(privilegeDataForGP.get(0));
        }
        return arrayList;
    }

    @JvmStatic
    /* JADX INFO: renamed from: r */
    public static final boolean m16854r(@NotNull List<? extends PurchaseType> purchaseTypeList) {
        purchaseTypeList.getClass();
        return INSTANCE.m16858k(purchaseTypeList);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: s */
    public static final void m16855s(@NotNull Act act, @NotNull ArrayList<Privilege> arrayList, @Nullable String str, @Nullable e30<PurchaseType> e30Var, @Nullable d30 d30Var, @Nullable d30 d30Var2) {
        act.getClass();
        arrayList.getClass();
        m16857u(act, arrayList, str, e30Var, d30Var, d30Var2, null, false, 192, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: t */
    public static final void m16856t(@NotNull Act act, @NotNull ArrayList<Privilege> primaryPrivileges, @Nullable String from, @Nullable final e30<PurchaseType> afterPaySuccess, @Nullable d30 onDismiss, @Nullable d30 onCancel, @Nullable String defaultSkuDuration, boolean autoPay) {
        act.getClass();
        primaryPrivileges.getClass();
        zvo.C0945a c0945aM27661f = new zvo.C0945a(act).m27664i(primaryPrivileges).m27659d(from).m27663h(new g30() { // from class: l.awo
            /* JADX INFO: renamed from: a */
            public final void m10083a(Object obj, Object obj2, Object obj3) {
                kwo.m16845h(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).m27662g(onCancel).m27660e(onCancel).m27661f(onDismiss);
        if (defaultSkuDuration != null && defaultSkuDuration.length() != 0) {
            c0945aM27661f.m27658c(defaultSkuDuration);
        }
        if (autoPay) {
            c0945aM27661f.m27657b(true);
        }
        c0945aM27661f.m27665j();
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m16857u(Act act, ArrayList arrayList, String str, e30 e30Var, d30 d30Var, d30 d30Var2, String str2, boolean z, int i, Object obj) {
        m16856t(act, arrayList, str, e30Var, d30Var, d30Var2, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? false : z);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m16858k(List<? extends PurchaseType> purchaseTypeList) {
        return CoreModule.c.x0.N3() && purchaseTypeList.size() == 1 && purchaseTypeList.get(0) == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
    }
}
