package p006l;

import android.R;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.purchase.superlike.component.SuperlikeIapPaymentComponent;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.c4g0;
import l.cjy;
import l.cn5;
import l.cwf0;
import l.d30;
import l.e30;
import l.f30;
import l.g30;
import l.i0e;
import l.jo0;
import l.l5j0;
import l.m6c0;
import l.mkd0;
import l.s4e;
import l.vwb;
import l.w9j;
import l.y7c0;
import l.z4c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 i2\u00020\u0001:\u0002*-B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\fJ\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\fJ\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\fJ%\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\"\u001a\u00020\b2\u001a\u0010!\u001a\u0016\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001f¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0004¢\u0006\u0004\b(\u0010\fR\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00108\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00107R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010H\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010GR*\u0010!\u001a\u0016\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010R\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bW\u0010QR\u0016\u0010Y\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010QR\u0014\u0010\\\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010[R\u0014\u0010_\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010^R\"\u0010d\u001a\u0010\u0012\f\u0012\n b*\u0004\u0018\u00010a0a0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010cR0\u0010h\u001a\u001e\u0012\f\u0012\n b*\u0004\u0018\u00010f0f\u0012\f\u0012\n b*\u0004\u0018\u00010:0:0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010g¨\u0006j"}, d2 = {"Ll/kdp;", "", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "from", "", "x", "(Ljava/lang/String;)V", "A", "()V", "Landroid/view/View;", "view", "j", "(Landroid/view/View;)V", "s", "u", "w", "t", "p", "v", "q", "Lcom/p1/mobile/putong/core/data/ProductCategory;", "category", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "r", "(Lcom/p1/mobile/putong/core/data/ProductCategory;Ljava/util/List;)V", "Ll/g30;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "onPaymentSuccess", "z", "(Ll/g30;)V", "Ll/d30;", "onDismiss", "y", "(Ll/d30;)V", "B", "Ll/l5j0;", "a", "Ll/l5j0;", "dialog", "b", "Lcom/p1/mobile/android/app/Act;", "c", "Ljava/lang/String;", "purchaseshowfrom", "Ll/cwf0;", "d", "Ll/cwf0;", "statisticsPageHelper", "e", "Ll/d30;", "onCancel", "f", "", "g", "Z", "shouldDismissCallback", "Ll/hyg0;", "h", "Ll/hyg0;", "privilegeComponent", "Ll/kyg0;", "i", "Ll/kyg0;", "showcaseComponent", "Lcom/p1/mobile/putong/core/ui/purchase/superlike/component/SuperlikeIapPaymentComponent;", "Lcom/p1/mobile/putong/core/ui/purchase/superlike/component/SuperlikeIapPaymentComponent;", "paymentComponent", "k", "Ll/g30;", "Ll/c4g0;", "l", "Ll/c4g0;", "subscription", "Landroid/widget/LinearLayout;", "m", "Landroid/widget/LinearLayout;", "_root", "Landroid/widget/FrameLayout;", "n", "Landroid/widget/FrameLayout;", "_privilege_root", "o", "_showcase_root", "_payment_root", "Landroid/content/DialogInterface$OnDismissListener;", "Landroid/content/DialogInterface$OnDismissListener;", "onDismissListener", "Landroid/content/DialogInterface$OnCancelListener;", "Landroid/content/DialogInterface$OnCancelListener;", "onCancelListener", "Ll/e30;", "", "kotlin.jvm.PlatformType", "Ll/e30;", "dialogStateAction", "Ll/f30;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "Ll/f30;", "currentSelectPurchaseSectionAction", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class kdp {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public l5j0 dialog;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public String purchaseshowfrom;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public cwf0 statisticsPageHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public d30 onCancel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public d30 onDismiss;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean shouldDismissCallback;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public hyg0 privilegeComponent;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public kyg0 showcaseComponent;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public SuperlikeIapPaymentComponent paymentComponent;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public g30<PurchaseType, Act, String> onPaymentSuccess;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public c4g0 subscription;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public LinearLayout _root;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public FrameLayout _privilege_root;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public LinearLayout _showcase_root;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public LinearLayout _payment_root;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final DialogInterface.OnDismissListener onDismissListener;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final DialogInterface.OnCancelListener onCancelListener;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final e30<Integer> dialogStateAction;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final f30<d, Boolean> currentSelectPurchaseSectionAction;

    /* JADX INFO: renamed from: l.kdp$a */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Ll/kdp$a;", "Landroid/content/DialogInterface$OnDismissListener;", "Landroid/content/DialogInterface$OnCancelListener;", "Ll/kdp;", "dialog", "<init>", "(Ll/kdp;)V", "Landroid/content/DialogInterface;", "", "onDismiss", "(Landroid/content/DialogInterface;)V", "onCancel", "Ljava/lang/ref/WeakReference;", "a", "Ljava/lang/ref/WeakReference;", "dialogRef", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DialogInterfaceOnDismissListenerC0925a implements DialogInterface.OnDismissListener, DialogInterface.OnCancelListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final WeakReference<kdp> dialogRef;

        public DialogInterfaceOnDismissListenerC0925a(@NotNull kdp kdpVar) {
            kdpVar.getClass();
            this.dialogRef = new WeakReference<>(kdpVar);
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(@NotNull DialogInterface dialog) {
            dialog.getClass();
            kdp kdpVar = this.dialogRef.get();
            if (NullChecker.a(kdpVar)) {
                kdpVar.getClass();
                kdpVar.onCancelListener.onCancel(dialog);
            }
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(@NotNull DialogInterface dialog) {
            dialog.getClass();
            kdp kdpVar = this.dialogRef.get();
            if (NullChecker.a(kdpVar)) {
                kdpVar.getClass();
                kdpVar.onDismissListener.onDismiss(dialog);
            }
        }
    }

    /* JADX INFO: renamed from: l.kdp$c */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"l/kdp$c", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "()V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ViewTreeObserverOnGlobalLayoutListenerC0927c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior<FrameLayout> f15781a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ kdp f15782b;

        public ViewTreeObserverOnGlobalLayoutListenerC0927c(BottomSheetBehavior<FrameLayout> bottomSheetBehavior, kdp kdpVar) {
            this.f15781a = bottomSheetBehavior;
            this.f15782b = kdpVar;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f15781a;
            LinearLayout linearLayout = this.f15782b._root;
            LinearLayout linearLayout2 = null;
            if (linearLayout == null) {
                Intrinsics.r("_root");
                linearLayout = null;
            }
            bottomSheetBehavior.setPeekHeight(linearLayout.getHeight());
            LinearLayout linearLayout3 = this.f15782b._root;
            if (linearLayout3 == null) {
                Intrinsics.r("_root");
            } else {
                linearLayout2 = linearLayout3;
            }
            linearLayout2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: l.kdp$d */
    @Metadata(k = CameraSticker.STATE_COMPLETE, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class C0928d<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Merchandise merchandiseS = ((d) t2).d().s();
            Integer numValueOf = Integer.valueOf(merchandiseS != null ? merchandiseS.quantity : 0);
            Merchandise merchandiseS2 = ((d) t).d().s();
            return cn5.d(numValueOf, Integer.valueOf(merchandiseS2 != null ? merchandiseS2.quantity : 0));
        }
    }

    public kdp(@NotNull Act act) {
        act.getClass();
        this.purchaseshowfrom = "";
        this.shouldDismissCallback = true;
        this.onDismissListener = new DialogInterface.OnDismissListener() { // from class: l.gdp
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                kdp.m18075d(this.f13227a, dialogInterface);
            }
        };
        this.onCancelListener = new DialogInterface.OnCancelListener() { // from class: l.hdp
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                kdp.m18072a(this.f13847a, dialogInterface);
            }
        };
        this.dialogStateAction = new e30() { // from class: l.idp
            public final void call(Object obj) {
                kdp.m18078g(this.f14389a, ((Integer) obj).intValue());
            }
        };
        this.currentSelectPurchaseSectionAction = new f30() { // from class: l.jdp
            public final void call(Object obj, Object obj2) {
                kdp.m18080i(this.f15124a, (d) obj, ((Boolean) obj2).booleanValue());
            }
        };
        this.act = act;
    }

    /* JADX INFO: renamed from: a */
    public static void m18072a(kdp kdpVar, DialogInterface dialogInterface) {
        d30 d30Var;
        if (!NullChecker.a(kdpVar.onCancel) || (d30Var = kdpVar.onCancel) == null) {
            return;
        }
        d30Var.call();
    }

    /* JADX INFO: renamed from: b */
    public static void m18073b(kdp kdpVar, Throwable th) {
        kdpVar.m18090q();
    }

    /* JADX INFO: renamed from: c */
    public static void m18074c(kdp kdpVar, ProductCategory productCategory, List list) {
        productCategory.getClass();
        list.getClass();
        kdpVar.m18091r(productCategory, list);
        kdpVar.m18089p();
    }

    /* JADX INFO: renamed from: d */
    public static void m18075d(kdp kdpVar, DialogInterface dialogInterface) {
        d30 d30Var;
        if (kdpVar.shouldDismissCallback && NullChecker.a(kdpVar.onDismiss) && (d30Var = kdpVar.onDismiss) != null) {
            d30Var.call();
        }
        CoreModule.m1854P().m11706a().m5245E9();
        i0e.e(kdpVar.statisticsPageHelper);
        kdpVar.m18087B();
    }

    /* JADX INFO: renamed from: e */
    public static void m18076e(kdp kdpVar) {
        SuperlikeIapPaymentComponent superlikeIapPaymentComponent = kdpVar.paymentComponent;
        if (superlikeIapPaymentComponent != null) {
            superlikeIapPaymentComponent.m7759R();
        }
    }

    /* JADX INFO: renamed from: f */
    public static c m18077f(Function1 function1, Object obj) {
        return (c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g */
    public static void m18078g(kdp kdpVar, int i) {
        if (NullChecker.a(kdpVar.dialog)) {
            if (i == -1) {
                l5j0 l5j0Var = kdpVar.dialog;
                if (l5j0Var != null) {
                    l5j0Var.hide();
                    return;
                }
                return;
            }
            if (i != 0) {
                if (i == 1) {
                    l5j0 l5j0Var2 = kdpVar.dialog;
                    if (l5j0Var2 != null) {
                        l5j0Var2.show();
                        return;
                    }
                    return;
                }
                if (i != 2) {
                    return;
                }
            }
            if (i == 2) {
                kdpVar.shouldDismissCallback = false;
            }
            l5j0 l5j0Var3 = kdpVar.dialog;
            if (l5j0Var3 != null) {
                l5j0Var3.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static c m18079h(kdp kdpVar, List list) {
        if (!list.isEmpty()) {
            return CoreModule.m1854P().m11706a().m5441g5(kdpVar.act, list);
        }
        kdpVar.m18090q();
        return c.empty();
    }

    /* JADX INFO: renamed from: i */
    public static void m18080i(kdp kdpVar, d dVar, boolean z) {
        SuperlikeIapPaymentComponent superlikeIapPaymentComponent;
        dVar.getClass();
        if (!NullChecker.a(kdpVar.paymentComponent) || (superlikeIapPaymentComponent = kdpVar.paymentComponent) == null) {
            return;
        }
        superlikeIapPaymentComponent.m7747E(dVar);
    }

    /* JADX INFO: renamed from: A */
    public final void m18086A() {
        l5j0 l5j0Var = new l5j0(this.act, y7c0.f);
        this.dialog = l5j0Var;
        l5j0Var.u(s4e.c);
        l5j0 l5j0Var2 = this.dialog;
        if (l5j0Var2 != null) {
            l5j0Var2.setCancelable(false);
        }
        l5j0 l5j0Var3 = this.dialog;
        if (l5j0Var3 != null) {
            l5j0Var3.setCanceledOnTouchOutside(false);
        }
        LinearLayout linearLayout = null;
        View viewInflate = LayoutInflater.from(this.act).inflate(m6c0.Z, (ViewGroup) null);
        viewInflate.getClass();
        m18088j(viewInflate);
        LinearLayout linearLayout2 = this._root;
        if (linearLayout2 == null) {
            Intrinsics.r("_root");
            linearLayout2 = null;
        }
        if (linearLayout2 != null) {
            LinearLayout linearLayout3 = this._root;
            if (linearLayout3 == null) {
                Intrinsics.r("_root");
                linearLayout3 = null;
            }
            linearLayout3.setClipChildren(false);
            LinearLayout linearLayout4 = this._root;
            if (linearLayout4 == null) {
                Intrinsics.r("_root");
                linearLayout4 = null;
            }
            linearLayout4.setClipToPadding(false);
        }
        LinearLayout linearLayout5 = this._showcase_root;
        if (linearLayout5 == null) {
            Intrinsics.r("_showcase_root");
            linearLayout5 = null;
        }
        if (linearLayout5 != null) {
            LinearLayout linearLayout6 = this._showcase_root;
            if (linearLayout6 == null) {
                Intrinsics.r("_showcase_root");
                linearLayout6 = null;
            }
            linearLayout6.setClipChildren(false);
            LinearLayout linearLayout7 = this._showcase_root;
            if (linearLayout7 == null) {
                Intrinsics.r("_showcase_root");
            } else {
                linearLayout = linearLayout7;
            }
            linearLayout.setClipToPadding(false);
        }
        l5j0 l5j0Var4 = this.dialog;
        if (l5j0Var4 != null) {
            l5j0Var4.setContentView(viewInflate);
        }
        DialogInterfaceOnDismissListenerC0925a dialogInterfaceOnDismissListenerC0925a = new DialogInterfaceOnDismissListenerC0925a(this);
        l5j0 l5j0Var5 = this.dialog;
        if (l5j0Var5 != null) {
            l5j0Var5.setOnDismissListener(dialogInterfaceOnDismissListenerC0925a);
        }
        l5j0 l5j0Var6 = this.dialog;
        if (l5j0Var6 != null) {
            l5j0Var6.setOnCancelListener(dialogInterfaceOnDismissListenerC0925a);
        }
        this.statisticsPageHelper = i0e.c("p_intl_super_like_iap_view", kdp.class.getName());
        m18092s();
        l5j0 l5j0Var7 = this.dialog;
        if (l5j0Var7 != null) {
            l5j0Var7.show();
        }
        m18095v();
        CoreModule.f1534c.f3544C0.m27420u4();
        i0e.f(this.statisticsPageHelper);
    }

    /* JADX INFO: renamed from: B */
    public final void m18087B() {
        kyg0 kyg0Var;
        if (NullChecker.a(this.subscription)) {
            c4g0 c4g0Var = this.subscription;
            c4g0Var.getClass();
            if (!c4g0Var.isUnsubscribed()) {
                c4g0 c4g0Var2 = this.subscription;
                c4g0Var2.getClass();
                c4g0Var2.unsubscribe();
                this.subscription = null;
            }
        }
        if (!NullChecker.a(this.showcaseComponent) || (kyg0Var = this.showcaseComponent) == null) {
            return;
        }
        kyg0Var.m18391r();
    }

    /* JADX INFO: renamed from: j */
    public final void m18088j(View view) {
        View viewFindViewById = view.findViewById(z4c0.G0);
        viewFindViewById.getClass();
        this._root = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(z4c0.A0);
        viewFindViewById2.getClass();
        this._privilege_root = (FrameLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(z4c0.L0);
        viewFindViewById3.getClass();
        this._showcase_root = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(z4c0.u0);
        viewFindViewById4.getClass();
        this._payment_root = (LinearLayout) viewFindViewById4;
    }

    /* JADX INFO: renamed from: p */
    public final void m18089p() {
        l5j0 l5j0Var = this.dialog;
        LinearLayout linearLayout = null;
        Window window = l5j0Var != null ? l5j0Var.getWindow() : null;
        if (NullChecker.a(window)) {
            View viewFindViewById = window != null ? window.findViewById(R.id.content) : null;
            FrameLayout frameLayout = viewFindViewById != null ? (FrameLayout) viewFindViewById.findViewById(z4c0.y) : null;
            if (NullChecker.a(frameLayout)) {
                frameLayout.getClass();
                BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
                bottomSheetBehaviorFrom.getClass();
                bottomSheetBehaviorFrom.setState(3);
                LinearLayout linearLayout2 = this._root;
                if (linearLayout2 == null) {
                    Intrinsics.r("_root");
                } else {
                    linearLayout = linearLayout2;
                }
                linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0927c(bottomSheetBehaviorFrom, this));
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m18090q() {
        this.dialogStateAction.call(2);
        swh0.m24328x1(this.act, this.purchaseshowfrom, this.onPaymentSuccess);
    }

    /* JADX INFO: renamed from: r */
    public final void m18091r(ProductCategory category, List<? extends Merchandise> merchandises) {
        List listA = cjy.z(category).a(this.act, PurchaseType.TYPE_SUPERLIKE_PKG, category, merchandises);
        if (vwb.J(listA)) {
            return;
        }
        listA.getClass();
        List<? extends d> listSortedWith = CollectionsKt.sortedWith(listA, new C0928d());
        if (!listSortedWith.isEmpty() && NullChecker.b(listSortedWith)) {
            int iM20280c = nyg0.INSTANCE.m20280c(listSortedWith, CoreModule.f1534c.f3661p0.f19661R);
            int size = listSortedWith.size();
            int i = 0;
            while (i < size) {
                listSortedWith.get(i).v(i == iM20280c);
                i++;
            }
            kyg0 kyg0Var = this.showcaseComponent;
            if (kyg0Var != null) {
                kyg0Var.m18392s(listSortedWith, this.currentSelectPurchaseSectionAction, this.dialogStateAction);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m18092s() {
        m18094u();
        m18096w();
        m18093t();
    }

    /* JADX INFO: renamed from: t */
    public final void m18093t() {
        SuperlikeIapPaymentComponent superlikeIapPaymentComponent = new SuperlikeIapPaymentComponent(this.act);
        this.paymentComponent = superlikeIapPaymentComponent;
        LinearLayout linearLayout = this._payment_root;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            Intrinsics.r("_payment_root");
            linearLayout = null;
        }
        View viewM7765m = superlikeIapPaymentComponent.m7765m(linearLayout);
        if (NullChecker.a(viewM7765m)) {
            SuperlikeIapPaymentComponent superlikeIapPaymentComponent2 = this.paymentComponent;
            if (superlikeIapPaymentComponent2 != null) {
                superlikeIapPaymentComponent2.m7748F(this.dialogStateAction, this.onCancel);
            }
            SuperlikeIapPaymentComponent superlikeIapPaymentComponent3 = this.paymentComponent;
            if (superlikeIapPaymentComponent3 != null) {
                superlikeIapPaymentComponent3.m7751I(this.purchaseshowfrom);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            SuperlikeIapPaymentComponent superlikeIapPaymentComponent4 = this.paymentComponent;
            if (superlikeIapPaymentComponent4 != null) {
                superlikeIapPaymentComponent4.m7752J(this.onPaymentSuccess);
            }
            LinearLayout linearLayout3 = this._payment_root;
            if (linearLayout3 == null) {
                Intrinsics.r("_payment_root");
            } else {
                linearLayout2 = linearLayout3;
            }
            linearLayout2.addView(viewM7765m, layoutParams);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m18094u() {
        hyg0 hyg0Var = new hyg0(this.act);
        this.privilegeComponent = hyg0Var;
        Act act = this.act;
        FrameLayout frameLayout = this._privilege_root;
        FrameLayout frameLayout2 = null;
        if (frameLayout == null) {
            Intrinsics.r("_privilege_root");
            frameLayout = null;
        }
        View viewM16396b = hyg0Var.m16396b(act, frameLayout);
        if (NullChecker.a(viewM16396b)) {
            hyg0 hyg0Var2 = this.privilegeComponent;
            if (hyg0Var2 != null) {
                hyg0Var2.m16399e(this.dialogStateAction);
            }
            hyg0 hyg0Var3 = this.privilegeComponent;
            if (hyg0Var3 != null) {
                hyg0Var3.m16397c(this.act);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            FrameLayout frameLayout3 = this._privilege_root;
            if (frameLayout3 == null) {
                Intrinsics.r("_privilege_root");
            } else {
                frameLayout2 = frameLayout3;
            }
            frameLayout2.addView(viewM16396b, layoutParams);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m18095v() {
        final ProductCategory productCategory = ProductCategory.get("tttSuperLike");
        c<List<Merchandise>> cVarM2574z5 = CoreModule.f1534c.f3643j0.m2574z5(productCategory, false);
        final Function1 function1 = new Function1() { // from class: l.cdp
            public final Object invoke(Object obj) {
                return kdp.m18079h(this.f9603a, (List) obj);
            }
        };
        this.subscription = cVarM2574z5.switchMap(new w9j() { // from class: l.ddp
            public final Object call(Object obj) {
                return kdp.m18077f(function1, obj);
            }
        }).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.edp
            public final void call(Object obj) {
                kdp.m18074c(this.f11090a, productCategory, (List) obj);
            }
        }, new e30() { // from class: l.fdp
            public final void call(Object obj) {
                kdp.m18073b(this.f12668a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w */
    public final void m18096w() {
        View viewM18379f;
        kyg0 kyg0Var = new kyg0(this.act);
        this.showcaseComponent = kyg0Var;
        kyg0Var.m18393t(new d30() { // from class: l.bdp
            public final void call() {
                kdp.m18076e(this.f8831a);
            }
        });
        kyg0 kyg0Var2 = this.showcaseComponent;
        LinearLayout linearLayout = null;
        if (kyg0Var2 != null) {
            LinearLayout linearLayout2 = this._showcase_root;
            if (linearLayout2 == null) {
                Intrinsics.r("_showcase_root");
                linearLayout2 = null;
            }
            viewM18379f = kyg0Var2.m18379f(linearLayout2);
        } else {
            viewM18379f = null;
        }
        if (NullChecker.a(viewM18379f)) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            LinearLayout linearLayout3 = this._showcase_root;
            if (linearLayout3 == null) {
                Intrinsics.r("_showcase_root");
            } else {
                linearLayout = linearLayout3;
            }
            linearLayout.addView(viewM18379f, layoutParams);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m18097x(String from) {
        this.purchaseshowfrom = from;
    }

    /* JADX INFO: renamed from: y */
    public final void m18098y(@Nullable d30 onDismiss) {
        this.onDismiss = onDismiss;
    }

    /* JADX INFO: renamed from: z */
    public final void m18099z(@Nullable g30<PurchaseType, Act, String> onPaymentSuccess) {
        this.onPaymentSuccess = onPaymentSuccess;
    }

    /* JADX INFO: renamed from: l.kdp$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ll/kdp$b;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "ctx", "", "from", "Ll/g30;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "onPaymentSuccess", "Ll/d30;", "onDismiss", "Ll/kdp;", "a", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/g30;Ll/d30;)Ll/kdp;", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final kdp m18100a(@NotNull Act ctx, @NotNull String from, @Nullable g30<PurchaseType, Act, String> onPaymentSuccess, @Nullable d30 onDismiss) {
            ctx.getClass();
            from.getClass();
            kdp kdpVar = new kdp(ctx);
            kdpVar.m18097x(from);
            kdpVar.m18099z(onPaymentSuccess);
            kdpVar.m18098y(onDismiss);
            kdpVar.m18086A();
            return kdpVar;
        }

        public Companion() {
        }
    }
}
