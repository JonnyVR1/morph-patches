package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\n\u0010\tJi\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJK\u0010\u001c\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u008b\u0001\u0010$\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050 2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\u0007H\u0007¢\u0006\u0004\b$\u0010%¨\u0006&"}, m87232d2 = {"Ll/kwo;", "", "<init>", "()V", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseTypeList", "", "r", "(Ljava/util/List;)Z", "k", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/core/data/Privilege;", "primaryPrivileges", "", "from", "Ll/e30;", "afterPaySuccess", "Ll/d30;", "onDismiss", "onCancel", "defaultSkuDuration", "autoPay", "", Constants.KEY_T, "(Lcom/p1/mobile/android/app/Act;Ljava/util/ArrayList;Ljava/lang/String;Ll/e30;Ll/d30;Ll/d30;Ljava/lang/String;Z)V", BLiveStormDanmakuGiftResourceType.f44444l, "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/e30;Ll/d30;Ll/d30;)V", "q", "()Ljava/util/ArrayList;", "", "", "selectedIdx", "skipDiscountFullscreen", "n", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ljava/util/ArrayList;Ljava/lang/String;Ll/e30;Ll/d30;Ll/d30;ILjava/lang/String;ZZ)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class kwo {

    @NotNull
    public static final kwo INSTANCE = new kwo();

    /* JADX INFO: renamed from: a */
    public static Unit m147607a(Act act, ArrayList arrayList, String str, e30 e30Var, d30 d30Var, d30 d30Var2, String str2, boolean z) {
        m147625t(act, arrayList, str, e30Var, d30Var, d30Var2, str2, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static void m147608b(Function0 function0, List list) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: d */
    public static Unit m147610d(Act act, ArrayList arrayList, String str, e30 e30Var, d30 d30Var, d30 d30Var2) {
        if (CoreModule.f17545c.f19696x0.m30186N3()) {
            m147626u(act, arrayList, str, e30Var, d30Var, d30Var2, null, false, 192, null);
        } else {
            m147620o(act, CollectionsKt.mutableListOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE), arrayList, str, e30Var, d30Var, d30Var2, 0, null, false, false, 1024, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static void m147611e(Function0 function0, List list) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: f */
    public static Unit m147612f(boolean z, Function0 function0, List list, Function0 function1) {
        if (!z && m147623r(list)) {
            function1.invoke();
        } else {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static void m147613g(Function0 function0, Throwable th) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: h */
    public static void m147614h(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        if (e30Var != null) {
            e30Var.call(purchaseType);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m147615i(Function0 function0, Throwable th) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: j */
    public static Unit m147616j(Act act, List list, ArrayList arrayList, String str, int i, d30 d30Var, d30 d30Var2, String str2, boolean z, final e30 e30Var) {
        w6p.C20813a c20813aM201949e = new w6p.C20813a(act).m201953i(list, arrayList).m201948d(str).m201952h(new g30() { // from class: l.jwo
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                kwo.m147621p(e30Var, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).m201954j(i).m201950f(d30Var).m201951g(d30Var2).m201949e(d30Var2);
        if (str2 != null && str2.length() != 0) {
            c20813aM201949e.m201947c(str2);
        }
        if (z) {
            c20813aM201949e.m201946b(true);
        }
        c20813aM201949e.m201955k();
        return Unit.INSTANCE;
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: l */
    public static final void m147617l(@NotNull final Act act, @Nullable final String from, @Nullable final e30<PurchaseType> afterPaySuccess, @Nullable final d30 onDismiss, @Nullable final d30 onCancel) {
        act.getClass();
        final ArrayList<Privilege> arrayListM147622q = m147622q();
        final Function0 function0 = new Function0() { // from class: l.bwo
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return kwo.m147610d(act, arrayListM147622q, from, afterPaySuccess, onDismiss, onCancel);
            }
        };
        if (CoreModule.f17545c.f19696x0.m30186N3()) {
            function0.invoke();
        } else {
            act.duringCreated(CoreModule.f17545c.f19696x0.m30224w4()).subscribe(mkd0.m154956H(new e30() { // from class: l.cwo
                @Override // p149l.e30
                public final void call(Object obj) {
                    kwo.m147608b(function0, (List) obj);
                }
            }, new e30() { // from class: l.dwo
                @Override // p149l.e30
                public final void call(Object obj) {
                    kwo.m147613g(function0, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m147618m(Act act, String str, e30 e30Var, d30 d30Var, d30 d30Var2, int i, Object obj) {
        if ((i & 4) != 0) {
            e30Var = null;
        }
        if ((i & 8) != 0) {
            d30Var = null;
        }
        if ((i & 16) != 0) {
            d30Var2 = null;
        }
        m147617l(act, str, e30Var, d30Var, d30Var2);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: n */
    public static final void m147619n(@NotNull final Act act, @NotNull final List<PurchaseType> purchaseTypeList, @NotNull final ArrayList<Privilege> primaryPrivileges, @Nullable final String from, @Nullable final e30<PurchaseType> afterPaySuccess, @Nullable final d30 onDismiss, @Nullable final d30 onCancel, final int selectedIdx, @Nullable final String defaultSkuDuration, final boolean autoPay, final boolean skipDiscountFullscreen) {
        act.getClass();
        purchaseTypeList.getClass();
        primaryPrivileges.getClass();
        final Function0 function0 = new Function0() { // from class: l.ewo
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return kwo.m147616j(act, purchaseTypeList, primaryPrivileges, from, selectedIdx, onDismiss, onCancel, defaultSkuDuration, autoPay, afterPaySuccess);
            }
        };
        final Function0 function1 = new Function0() { // from class: l.fwo
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return kwo.m147607a(act, primaryPrivileges, from, afterPaySuccess, onDismiss, onCancel, defaultSkuDuration, autoPay);
            }
        };
        final Function0 function2 = new Function0() { // from class: l.gwo
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return kwo.m147612f(skipDiscountFullscreen, function0, purchaseTypeList, function1);
            }
        };
        if (purchaseTypeList.size() != 1 || purchaseTypeList.get(0) != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            function2.invoke();
        } else if (CoreModule.f17545c.f19696x0.m30186N3()) {
            function2.invoke();
        } else {
            act.duringCreated(CoreModule.f17545c.f19696x0.m30224w4()).subscribe(mkd0.m154956H(new e30() { // from class: l.hwo
                @Override // p149l.e30
                public final void call(Object obj) {
                    kwo.m147611e(function2, (List) obj);
                }
            }, new e30() { // from class: l.iwo
                @Override // p149l.e30
                public final void call(Object obj) {
                    kwo.m147615i(function2, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m147620o(Act act, List list, ArrayList arrayList, String str, e30 e30Var, d30 d30Var, d30 d30Var2, int i, String str2, boolean z, boolean z2, int i2, Object obj) {
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
        m147619n(act, list, arrayList, str, e30Var, d30Var, d30Var2, i, str2, z, z2);
    }

    /* JADX INFO: renamed from: p */
    public static final void m147621p(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        if (e30Var != null) {
            e30Var.call(purchaseType);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: q */
    public static final ArrayList<Privilege> m147622q() {
        ArrayList<Privilege> arrayList = new ArrayList<>();
        ArrayList<Privilege> privilegeDataForGP = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeDataForGP(null);
        if (privilegeDataForGP != null && !privilegeDataForGP.isEmpty()) {
            arrayList.add(privilegeDataForGP.get(0));
        }
        return arrayList;
    }

    @JvmStatic
    /* JADX INFO: renamed from: r */
    public static final boolean m147623r(@NotNull List<? extends PurchaseType> purchaseTypeList) {
        purchaseTypeList.getClass();
        return INSTANCE.m147627k(purchaseTypeList);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: s */
    public static final void m147624s(@NotNull Act act, @NotNull ArrayList<Privilege> arrayList, @Nullable String str, @Nullable e30<PurchaseType> e30Var, @Nullable d30 d30Var, @Nullable d30 d30Var2) {
        act.getClass();
        arrayList.getClass();
        m147626u(act, arrayList, str, e30Var, d30Var, d30Var2, null, false, 192, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: t */
    public static final void m147625t(@NotNull Act act, @NotNull ArrayList<Privilege> primaryPrivileges, @Nullable String from, @Nullable final e30<PurchaseType> afterPaySuccess, @Nullable d30 onDismiss, @Nullable d30 onCancel, @Nullable String defaultSkuDuration, boolean autoPay) {
        act.getClass();
        primaryPrivileges.getClass();
        zvo.C21788a c21788aM220459f = new zvo.C21788a(act).m220462i(primaryPrivileges).m220457d(from).m220461h(new g30() { // from class: l.awo
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                kwo.m147614h(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).m220460g(onCancel).m220458e(onCancel).m220459f(onDismiss);
        if (defaultSkuDuration != null && defaultSkuDuration.length() != 0) {
            c21788aM220459f.m220456c(defaultSkuDuration);
        }
        if (autoPay) {
            c21788aM220459f.m220455b(true);
        }
        c21788aM220459f.m220463j();
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m147626u(Act act, ArrayList arrayList, String str, e30 e30Var, d30 d30Var, d30 d30Var2, String str2, boolean z, int i, Object obj) {
        m147625t(act, arrayList, str, e30Var, d30Var, d30Var2, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? false : z);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m147627k(List<? extends PurchaseType> purchaseTypeList) {
        return CoreModule.f17545c.f19696x0.m30186N3() && purchaseTypeList.size() == 1 && purchaseTypeList.get(0) == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
    }
}
