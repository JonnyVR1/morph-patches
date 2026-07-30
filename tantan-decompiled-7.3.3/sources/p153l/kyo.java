package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
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
@Metadata(m88120d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\n\u0010\tJi\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJK\u0010\u001c\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u008b\u0001\u0010$\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050 2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\u0007H\u0007¢\u0006\u0004\b$\u0010%¨\u0006&"}, m88121d2 = {"Ll/kyo;", "", "<init>", "()V", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseTypeList", "", "r", "(Ljava/util/List;)Z", "k", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/core/data/Privilege;", "primaryPrivileges", "", "from", "Ll/y20;", "afterPaySuccess", "Ll/x20;", "onDismiss", "onCancel", "defaultSkuDuration", "autoPay", "", Constants.KEY_T, "(Lcom/p1/mobile/android/app/Act;Ljava/util/ArrayList;Ljava/lang/String;Ll/y20;Ll/x20;Ll/x20;Ljava/lang/String;Z)V", BLiveStormDanmakuGiftResourceType.f45292l, "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/y20;Ll/x20;Ll/x20;)V", "q", "()Ljava/util/ArrayList;", "", "", "selectedIdx", "skipDiscountFullscreen", "n", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ljava/util/ArrayList;Ljava/lang/String;Ll/y20;Ll/x20;Ll/x20;ILjava/lang/String;ZZ)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class kyo {

    @NotNull
    public static final kyo INSTANCE = new kyo();

    /* JADX INFO: renamed from: a */
    public static Unit m152046a(Act act, ArrayList arrayList, String str, y20 y20Var, x20 x20Var, x20 x20Var2, String str2, boolean z) {
        m152064t(act, arrayList, str, y20Var, x20Var, x20Var2, str2, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static void m152047b(Function0 function0, List list) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: d */
    public static Unit m152049d(Act act, ArrayList arrayList, String str, y20 y20Var, x20 x20Var, x20 x20Var2) {
        if (CoreModule.f18264c.f20438x0.m31184N3()) {
            m152065u(act, arrayList, str, y20Var, x20Var, x20Var2, null, false, 192, null);
        } else {
            m152059o(act, CollectionsKt.mutableListOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE), arrayList, str, y20Var, x20Var, x20Var2, 0, null, false, false, 1024, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static void m152050e(Function0 function0, List list) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: f */
    public static Unit m152051f(boolean z, Function0 function0, List list, Function0 function1) {
        if (!z && m152062r(list)) {
            function1.invoke();
        } else {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static void m152052g(Function0 function0, Throwable th) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: h */
    public static void m152053h(y20 y20Var, PurchaseType purchaseType, Act act, String str) {
        if (y20Var != null) {
            y20Var.call(purchaseType);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m152054i(Function0 function0, Throwable th) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: j */
    public static Unit m152055j(Act act, List list, ArrayList arrayList, String str, int i, x20 x20Var, x20 x20Var2, String str2, boolean z, final y20 y20Var) {
        w8p.C21047a c21047aM205516e = new w8p.C21047a(act).m205520i(list, arrayList).m205515d(str).m205519h(new a30() { // from class: l.jyo
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                kyo.m152060p(y20Var, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).m205521j(i).m205517f(x20Var).m205518g(x20Var2).m205516e(x20Var2);
        if (str2 != null && str2.length() != 0) {
            c21047aM205516e.m205514c(str2);
        }
        if (z) {
            c21047aM205516e.m205513b(true);
        }
        c21047aM205516e.m205522k();
        return Unit.INSTANCE;
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: l */
    public static final void m152056l(@NotNull final Act act, @Nullable final String from, @Nullable final y20<PurchaseType> afterPaySuccess, @Nullable final x20 onDismiss, @Nullable final x20 onCancel) {
        act.getClass();
        final ArrayList<Privilege> arrayListM152061q = m152061q();
        final Function0 function0 = new Function0() { // from class: l.byo
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return kyo.m152049d(act, arrayListM152061q, from, afterPaySuccess, onDismiss, onCancel);
            }
        };
        if (CoreModule.f18264c.f20438x0.m31184N3()) {
            function0.invoke();
        } else {
            act.duringCreated(CoreModule.f18264c.f20438x0.m31222w4()).subscribe(psd0.m173597H(new y20() { // from class: l.cyo
                @Override // p153l.y20
                public final void call(Object obj) {
                    kyo.m152047b(function0, (List) obj);
                }
            }, new y20() { // from class: l.dyo
                @Override // p153l.y20
                public final void call(Object obj) {
                    kyo.m152052g(function0, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m152057m(Act act, String str, y20 y20Var, x20 x20Var, x20 x20Var2, int i, Object obj) {
        if ((i & 4) != 0) {
            y20Var = null;
        }
        if ((i & 8) != 0) {
            x20Var = null;
        }
        if ((i & 16) != 0) {
            x20Var2 = null;
        }
        m152056l(act, str, y20Var, x20Var, x20Var2);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: n */
    public static final void m152058n(@NotNull final Act act, @NotNull final List<PurchaseType> purchaseTypeList, @NotNull final ArrayList<Privilege> primaryPrivileges, @Nullable final String from, @Nullable final y20<PurchaseType> afterPaySuccess, @Nullable final x20 onDismiss, @Nullable final x20 onCancel, final int selectedIdx, @Nullable final String defaultSkuDuration, final boolean autoPay, final boolean skipDiscountFullscreen) {
        act.getClass();
        purchaseTypeList.getClass();
        primaryPrivileges.getClass();
        final Function0 function0 = new Function0() { // from class: l.eyo
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return kyo.m152055j(act, purchaseTypeList, primaryPrivileges, from, selectedIdx, onDismiss, onCancel, defaultSkuDuration, autoPay, afterPaySuccess);
            }
        };
        final Function0 function1 = new Function0() { // from class: l.fyo
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return kyo.m152046a(act, primaryPrivileges, from, afterPaySuccess, onDismiss, onCancel, defaultSkuDuration, autoPay);
            }
        };
        final Function0 function2 = new Function0() { // from class: l.gyo
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return kyo.m152051f(skipDiscountFullscreen, function0, purchaseTypeList, function1);
            }
        };
        if (purchaseTypeList.size() != 1 || purchaseTypeList.get(0) != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            function2.invoke();
        } else if (CoreModule.f18264c.f20438x0.m31184N3()) {
            function2.invoke();
        } else {
            act.duringCreated(CoreModule.f18264c.f20438x0.m31222w4()).subscribe(psd0.m173597H(new y20() { // from class: l.hyo
                @Override // p153l.y20
                public final void call(Object obj) {
                    kyo.m152050e(function2, (List) obj);
                }
            }, new y20() { // from class: l.iyo
                @Override // p153l.y20
                public final void call(Object obj) {
                    kyo.m152054i(function2, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m152059o(Act act, List list, ArrayList arrayList, String str, y20 y20Var, x20 x20Var, x20 x20Var2, int i, String str2, boolean z, boolean z2, int i2, Object obj) {
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
        m152058n(act, list, arrayList, str, y20Var, x20Var, x20Var2, i, str2, z, z2);
    }

    /* JADX INFO: renamed from: p */
    public static final void m152060p(y20 y20Var, PurchaseType purchaseType, Act act, String str) {
        if (y20Var != null) {
            y20Var.call(purchaseType);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: q */
    public static final ArrayList<Privilege> m152061q() {
        ArrayList<Privilege> arrayList = new ArrayList<>();
        ArrayList<Privilege> privilegeDataForGP = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeDataForGP(null);
        if (privilegeDataForGP != null && !privilegeDataForGP.isEmpty()) {
            arrayList.add(privilegeDataForGP.get(0));
        }
        return arrayList;
    }

    @JvmStatic
    /* JADX INFO: renamed from: r */
    public static final boolean m152062r(@NotNull List<? extends PurchaseType> purchaseTypeList) {
        purchaseTypeList.getClass();
        return INSTANCE.m152066k(purchaseTypeList);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: s */
    public static final void m152063s(@NotNull Act act, @NotNull ArrayList<Privilege> arrayList, @Nullable String str, @Nullable y20<PurchaseType> y20Var, @Nullable x20 x20Var, @Nullable x20 x20Var2) {
        act.getClass();
        arrayList.getClass();
        m152065u(act, arrayList, str, y20Var, x20Var, x20Var2, null, false, 192, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: t */
    public static final void m152064t(@NotNull Act act, @NotNull ArrayList<Privilege> primaryPrivileges, @Nullable String from, @Nullable final y20<PurchaseType> afterPaySuccess, @Nullable x20 onDismiss, @Nullable x20 onCancel, @Nullable String defaultSkuDuration, boolean autoPay) {
        act.getClass();
        primaryPrivileges.getClass();
        zxo.C21918a c21918aM222055f = new zxo.C21918a(act).m222058i(primaryPrivileges).m222053d(from).m222057h(new a30() { // from class: l.ayo
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                kyo.m152053h(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).m222056g(onCancel).m222054e(onCancel).m222055f(onDismiss);
        if (defaultSkuDuration != null && defaultSkuDuration.length() != 0) {
            c21918aM222055f.m222052c(defaultSkuDuration);
        }
        if (autoPay) {
            c21918aM222055f.m222051b(true);
        }
        c21918aM222055f.m222059j();
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m152065u(Act act, ArrayList arrayList, String str, y20 y20Var, x20 x20Var, x20 x20Var2, String str2, boolean z, int i, Object obj) {
        m152064t(act, arrayList, str, y20Var, x20Var, x20Var2, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? false : z);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m152066k(List<? extends PurchaseType> purchaseTypeList) {
        return CoreModule.f18264c.f20438x0.m31184N3() && purchaseTypeList.size() == 1 && purchaseTypeList.get(0) == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
    }
}
