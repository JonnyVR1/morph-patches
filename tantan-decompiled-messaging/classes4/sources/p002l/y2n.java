package p002l;

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
import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p000p1.mobile.putong.core.p001ui.purchase.boost.component.BoostIapPaymentComponent;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
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
import l.swh0;
import l.vwb;
import l.w9j;
import l.y7c0;
import l.z4c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 i2\u00020\u0001:\u0002*-B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\fJ\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\fJ\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\fJ%\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\"\u001a\u00020\b2\u001a\u0010!\u001a\u0016\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001f¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0004¢\u0006\u0004\b(\u0010\fR\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00108\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00107R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010H\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010GR*\u0010!\u001a\u0016\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010R\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bW\u0010QR\u0016\u0010Y\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010QR\u0014\u0010\\\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010[R\u0014\u0010_\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010^R\"\u0010d\u001a\u0010\u0012\f\u0012\n b*\u0004\u0018\u00010a0a0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010cR0\u0010h\u001a\u001e\u0012\f\u0012\n b*\u0004\u0018\u00010f0f\u0012\f\u0012\n b*\u0004\u0018\u00010:0:0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010g¨\u0006j"}, d2 = {"Ll/y2n;", "", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "from", "", "x", "(Ljava/lang/String;)V", "A", "()V", "Landroid/view/View;", "view", "j", "(Landroid/view/View;)V", "s", "u", "w", "t", "p", "v", "q", "Lcom/p1/mobile/putong/core/data/ProductCategory;", "category", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "r", "(Lcom/p1/mobile/putong/core/data/ProductCategory;Ljava/util/List;)V", "Ll/g30;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "onPaymentSuccess", "z", "(Ll/g30;)V", "Ll/d30;", "onDismiss", "y", "(Ll/d30;)V", "B", "Ll/l5j0;", "a", "Ll/l5j0;", "dialog", "b", "Lcom/p1/mobile/android/app/Act;", "c", "Ljava/lang/String;", "purchaseshowfrom", "Ll/cwf0;", "d", "Ll/cwf0;", "statisticsPageHelper", "e", "Ll/d30;", "onCancel", "f", "", "g", "Z", "shouldDismissCallback", "Ll/p83;", "h", "Ll/p83;", "privilegeComponent", "Ll/s83;", "i", "Ll/s83;", "showcaseComponent", "Lcom/p1/mobile/putong/core/ui/purchase/boost/component/BoostIapPaymentComponent;", "Lcom/p1/mobile/putong/core/ui/purchase/boost/component/BoostIapPaymentComponent;", "paymentComponent", "k", "Ll/g30;", "Ll/c4g0;", "l", "Ll/c4g0;", "subscription", "Landroid/widget/LinearLayout;", "m", "Landroid/widget/LinearLayout;", "_root", "Landroid/widget/FrameLayout;", "n", "Landroid/widget/FrameLayout;", "_privilege_root", "o", "_showcase_root", "_payment_root", "Landroid/content/DialogInterface$OnDismissListener;", "Landroid/content/DialogInterface$OnDismissListener;", "onDismissListener", "Landroid/content/DialogInterface$OnCancelListener;", "Landroid/content/DialogInterface$OnCancelListener;", "onCancelListener", "Ll/e30;", "", "kotlin.jvm.PlatformType", "Ll/e30;", "dialogStateAction", "Ll/f30;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "Ll/f30;", "currentSelectPurchaseSectionAction", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class y2n {

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
    public p83 privilegeComponent;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public s83 showcaseComponent;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public BoostIapPaymentComponent paymentComponent;

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
    public final f30<C0190d, Boolean> currentSelectPurchaseSectionAction;

    /* JADX INFO: renamed from: l.y2n$a */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Ll/y2n$a;", "Landroid/content/DialogInterface$OnDismissListener;", "Landroid/content/DialogInterface$OnCancelListener;", "Ll/y2n;", "dialog", "<init>", "(Ll/y2n;)V", "Landroid/content/DialogInterface;", "", "onDismiss", "(Landroid/content/DialogInterface;)V", "onCancel", "Ljava/lang/ref/WeakReference;", "a", "Ljava/lang/ref/WeakReference;", "dialogRef", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DialogInterfaceOnDismissListenerC0906a implements DialogInterface.OnDismissListener, DialogInterface.OnCancelListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final WeakReference<y2n> dialogRef;

        public DialogInterfaceOnDismissListenerC0906a(@NotNull y2n y2nVar) {
            y2nVar.getClass();
            this.dialogRef = new WeakReference<>(y2nVar);
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(@NotNull DialogInterface dialog) {
            dialog.getClass();
            y2n y2nVar = this.dialogRef.get();
            if (NullChecker.a(y2nVar)) {
                y2nVar.getClass();
                y2nVar.onCancelListener.onCancel(dialog);
            }
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(@NotNull DialogInterface dialog) {
            dialog.getClass();
            y2n y2nVar = this.dialogRef.get();
            if (NullChecker.a(y2nVar)) {
                y2nVar.getClass();
                y2nVar.onDismissListener.onDismiss(dialog);
            }
        }
    }

    /* JADX INFO: renamed from: l.y2n$c */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"l/y2n$c", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "()V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ViewTreeObserverOnGlobalLayoutListenerC0908c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior<FrameLayout> f22636a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ y2n f22637b;

        public ViewTreeObserverOnGlobalLayoutListenerC0908c(BottomSheetBehavior<FrameLayout> bottomSheetBehavior, y2n y2nVar) {
            this.f22636a = bottomSheetBehavior;
            this.f22637b = y2nVar;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f22636a;
            LinearLayout linearLayout = this.f22637b._root;
            LinearLayout linearLayout2 = null;
            if (linearLayout == null) {
                Intrinsics.r("_root");
                linearLayout = null;
            }
            bottomSheetBehavior.setPeekHeight(linearLayout.getHeight());
            LinearLayout linearLayout3 = this.f22637b._root;
            if (linearLayout3 == null) {
                Intrinsics.r("_root");
            } else {
                linearLayout2 = linearLayout3;
            }
            linearLayout2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: l.y2n$d */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class C0909d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Merchandise merchandiseM4167s;
            Merchandise merchandiseM4167s2;
            C0190d c0190d = (C0190d) t2;
            C0190d.a aVarM4088d = c0190d.m4088d();
            Merchandise merchandiseM4167s3 = null;
            if (aVarM4088d == null || (merchandiseM4167s = aVarM4088d.m4167s()) == null) {
                C0190d.a aVarM4086b = c0190d.m4086b();
                merchandiseM4167s = aVarM4086b != null ? aVarM4086b.m4167s() : null;
            }
            Integer numValueOf = Integer.valueOf(merchandiseM4167s != null ? merchandiseM4167s.quantity : 0);
            C0190d c0190d2 = (C0190d) t;
            C0190d.a aVarM4088d2 = c0190d2.m4088d();
            if (aVarM4088d2 == null || (merchandiseM4167s2 = aVarM4088d2.m4167s()) == null) {
                C0190d.a aVarM4086b2 = c0190d2.m4086b();
                if (aVarM4086b2 != null) {
                    merchandiseM4167s3 = aVarM4086b2.m4167s();
                }
            } else {
                merchandiseM4167s3 = merchandiseM4167s2;
            }
            return cn5.d(numValueOf, Integer.valueOf(merchandiseM4167s3 != null ? merchandiseM4167s3.quantity : 0));
        }
    }

    public y2n(@NotNull Act act) {
        act.getClass();
        this.purchaseshowfrom = "";
        this.shouldDismissCallback = true;
        this.onDismissListener = new DialogInterface.OnDismissListener() { // from class: l.p2n
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                y2n.m26310c(this.f16990a, dialogInterface);
            }
        };
        this.onCancelListener = new DialogInterface.OnCancelListener() { // from class: l.q2n
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                y2n.m26314g(this.f17768a, dialogInterface);
            }
        };
        this.dialogStateAction = new e30() { // from class: l.r2n
            public final void call(Object obj) {
                y2n.m26315h(this.f18332a, ((Integer) obj).intValue());
            }
        };
        this.currentSelectPurchaseSectionAction = new f30() { // from class: l.s2n
            public final void call(Object obj, Object obj2) {
                y2n.m26308a(this.f18766a, (C0190d) obj, ((Boolean) obj2).booleanValue());
            }
        };
        this.act = act;
    }

    /* JADX INFO: renamed from: a */
    public static void m26308a(y2n y2nVar, C0190d c0190d, boolean z) {
        BoostIapPaymentComponent boostIapPaymentComponent;
        c0190d.getClass();
        if (!NullChecker.a(y2nVar.paymentComponent) || (boostIapPaymentComponent = y2nVar.paymentComponent) == null) {
            return;
        }
        boostIapPaymentComponent.m3939z(c0190d);
    }

    /* JADX INFO: renamed from: b */
    public static void m26309b(y2n y2nVar, Throwable th) {
        y2nVar.m26326q();
    }

    /* JADX INFO: renamed from: c */
    public static void m26310c(y2n y2nVar, DialogInterface dialogInterface) {
        d30 d30Var;
        if (y2nVar.shouldDismissCallback && NullChecker.a(y2nVar.onDismiss) && (d30Var = y2nVar.onDismiss) != null) {
            d30Var.call();
        }
        CoreModule.P().a().E9();
        i0e.e(y2nVar.statisticsPageHelper);
        y2nVar.m26323B();
    }

    /* JADX INFO: renamed from: d */
    public static void m26311d(y2n y2nVar) {
        BoostIapPaymentComponent boostIapPaymentComponent = y2nVar.paymentComponent;
        if (boostIapPaymentComponent != null) {
            boostIapPaymentComponent.m3919L();
        }
    }

    /* JADX INFO: renamed from: e */
    public static c m26312e(y2n y2nVar, List list) {
        if (!list.isEmpty()) {
            return CoreModule.P().a().g5(y2nVar.act, list);
        }
        y2nVar.m26326q();
        return c.empty();
    }

    /* JADX INFO: renamed from: f */
    public static c m26313f(Function1 function1, Object obj) {
        return (c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g */
    public static void m26314g(y2n y2nVar, DialogInterface dialogInterface) {
        d30 d30Var;
        if (!NullChecker.a(y2nVar.onCancel) || (d30Var = y2nVar.onCancel) == null) {
            return;
        }
        d30Var.call();
    }

    /* JADX INFO: renamed from: h */
    public static void m26315h(y2n y2nVar, int i) {
        if (NullChecker.a(y2nVar.dialog)) {
            if (i == -1) {
                l5j0 l5j0Var = y2nVar.dialog;
                if (l5j0Var != null) {
                    l5j0Var.hide();
                    return;
                }
                return;
            }
            if (i != 0) {
                if (i == 1) {
                    l5j0 l5j0Var2 = y2nVar.dialog;
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
                y2nVar.shouldDismissCallback = false;
            }
            l5j0 l5j0Var3 = y2nVar.dialog;
            if (l5j0Var3 != null) {
                l5j0Var3.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m26316i(y2n y2nVar, ProductCategory productCategory, List list) {
        productCategory.getClass();
        list.getClass();
        y2nVar.m26327r(productCategory, list);
        y2nVar.m26325p();
    }

    /* JADX INFO: renamed from: A */
    public final void m26322A() {
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
        View viewInflate = LayoutInflater.from(this.act).inflate(m6c0.j, (ViewGroup) null);
        viewInflate.getClass();
        m26324j(viewInflate);
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
        DialogInterfaceOnDismissListenerC0906a dialogInterfaceOnDismissListenerC0906a = new DialogInterfaceOnDismissListenerC0906a(this);
        l5j0 l5j0Var5 = this.dialog;
        if (l5j0Var5 != null) {
            l5j0Var5.setOnDismissListener(dialogInterfaceOnDismissListenerC0906a);
        }
        l5j0 l5j0Var6 = this.dialog;
        if (l5j0Var6 != null) {
            l5j0Var6.setOnCancelListener(dialogInterfaceOnDismissListenerC0906a);
        }
        this.statisticsPageHelper = i0e.c("p_intl_boost_iap_view", y2n.class.getName());
        m26328s();
        l5j0 l5j0Var7 = this.dialog;
        if (l5j0Var7 != null) {
            l5j0Var7.show();
        }
        m26331v();
        CoreModule.c.C0.u4();
        i0e.f(this.statisticsPageHelper);
    }

    /* JADX INFO: renamed from: B */
    public final void m26323B() {
        s83 s83Var;
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
        if (!NullChecker.a(this.showcaseComponent) || (s83Var = this.showcaseComponent) == null) {
            return;
        }
        s83Var.m22244r();
    }

    /* JADX INFO: renamed from: j */
    public final void m26324j(View view) {
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
    public final void m26325p() {
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
                linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0908c(bottomSheetBehaviorFrom, this));
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m26326q() {
        this.dialogStateAction.call(2);
        swh0.m1(this.act, this.purchaseshowfrom, (e30) null);
    }

    /* JADX INFO: renamed from: r */
    public final void m26327r(ProductCategory category, List<? extends Merchandise> merchandises) {
        List listA = cjy.z(category).a(this.act, PurchaseType.TYPE_SPOTLIGHT, category, merchandises);
        if (vwb.J(listA)) {
            return;
        }
        listA.getClass();
        List<? extends C0190d> listSortedWith = CollectionsKt.sortedWith(listA, new C0909d());
        if (!listSortedWith.isEmpty() && NullChecker.b(listSortedWith)) {
            int iM21113c = q93.INSTANCE.m21113c(listSortedWith, CoreModule.c.p0.R);
            int size = listSortedWith.size();
            int i = 0;
            while (i < size) {
                listSortedWith.get(i).m4106v(i == iM21113c);
                i++;
            }
            s83 s83Var = this.showcaseComponent;
            if (s83Var != null) {
                s83Var.m22245s(listSortedWith, this.currentSelectPurchaseSectionAction, this.dialogStateAction);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m26328s() {
        m26330u();
        m26332w();
        m26329t();
    }

    /* JADX INFO: renamed from: t */
    public final void m26329t() {
        BoostIapPaymentComponent boostIapPaymentComponent = new BoostIapPaymentComponent(this.act);
        this.paymentComponent = boostIapPaymentComponent;
        LinearLayout linearLayout = this._payment_root;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            Intrinsics.r("_payment_root");
            linearLayout = null;
        }
        View viewM3924k = boostIapPaymentComponent.m3924k(linearLayout);
        if (NullChecker.a(viewM3924k)) {
            BoostIapPaymentComponent boostIapPaymentComponent2 = this.paymentComponent;
            if (boostIapPaymentComponent2 != null) {
                boostIapPaymentComponent2.m3909A(this.dialogStateAction, this.onCancel);
            }
            BoostIapPaymentComponent boostIapPaymentComponent3 = this.paymentComponent;
            if (boostIapPaymentComponent3 != null) {
                boostIapPaymentComponent3.m3912D(this.purchaseshowfrom);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            BoostIapPaymentComponent boostIapPaymentComponent4 = this.paymentComponent;
            if (boostIapPaymentComponent4 != null) {
                boostIapPaymentComponent4.m3913E(this.onPaymentSuccess);
            }
            LinearLayout linearLayout3 = this._payment_root;
            if (linearLayout3 == null) {
                Intrinsics.r("_payment_root");
            } else {
                linearLayout2 = linearLayout3;
            }
            linearLayout2.addView(viewM3924k, layoutParams);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m26330u() {
        p83 p83Var = new p83(this.act);
        this.privilegeComponent = p83Var;
        Act act = this.act;
        FrameLayout frameLayout = this._privilege_root;
        FrameLayout frameLayout2 = null;
        if (frameLayout == null) {
            Intrinsics.r("_privilege_root");
            frameLayout = null;
        }
        View viewM20123b = p83Var.m20123b(act, frameLayout);
        if (NullChecker.a(viewM20123b)) {
            p83 p83Var2 = this.privilegeComponent;
            if (p83Var2 != null) {
                p83Var2.m20126e(this.dialogStateAction);
            }
            p83 p83Var3 = this.privilegeComponent;
            if (p83Var3 != null) {
                p83Var3.m20124c(this.act);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            FrameLayout frameLayout3 = this._privilege_root;
            if (frameLayout3 == null) {
                Intrinsics.r("_privilege_root");
            } else {
                frameLayout2 = frameLayout3;
            }
            frameLayout2.addView(viewM20123b, layoutParams);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m26331v() {
        final ProductCategory productCategory = ProductCategory.get("tttBoost");
        c cVarZ5 = CoreModule.c.j0.z5(productCategory, false);
        final Function1 function1 = new Function1() { // from class: l.t2n
            public final Object invoke(Object obj) {
                return y2n.m26312e(this.f19403a, (List) obj);
            }
        };
        this.subscription = cVarZ5.switchMap(new w9j() { // from class: l.u2n
            public final Object call(Object obj) {
                return y2n.m26313f(function1, obj);
            }
        }).observeOn(jo0.a()).take(1).subscribe(mkd0.H(new e30() { // from class: l.v2n
            public final void call(Object obj) {
                y2n.m26316i(this.f20932a, productCategory, (List) obj);
            }
        }, new e30() { // from class: l.w2n
            public final void call(Object obj) {
                y2n.m26309b(this.f21428a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w */
    public final void m26332w() {
        View viewM22232f;
        s83 s83Var = new s83(this.act);
        this.showcaseComponent = s83Var;
        s83Var.m22246t(new d30() { // from class: l.x2n
            public final void call() {
                y2n.m26311d(this.f22097a);
            }
        });
        s83 s83Var2 = this.showcaseComponent;
        LinearLayout linearLayout = null;
        if (s83Var2 != null) {
            LinearLayout linearLayout2 = this._showcase_root;
            if (linearLayout2 == null) {
                Intrinsics.r("_showcase_root");
                linearLayout2 = null;
            }
            viewM22232f = s83Var2.m22232f(linearLayout2);
        } else {
            viewM22232f = null;
        }
        if (NullChecker.a(viewM22232f)) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            LinearLayout linearLayout3 = this._showcase_root;
            if (linearLayout3 == null) {
                Intrinsics.r("_showcase_root");
            } else {
                linearLayout = linearLayout3;
            }
            linearLayout.addView(viewM22232f, layoutParams);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m26333x(String from) {
        this.purchaseshowfrom = from;
    }

    /* JADX INFO: renamed from: y */
    public final void m26334y(@Nullable d30 onDismiss) {
        this.onDismiss = onDismiss;
    }

    /* JADX INFO: renamed from: z */
    public final void m26335z(@Nullable g30<PurchaseType, Act, String> onPaymentSuccess) {
        this.onPaymentSuccess = onPaymentSuccess;
    }

    /* JADX INFO: renamed from: l.y2n$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ll/y2n$b;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "ctx", "", "from", "Ll/g30;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "onPaymentSuccess", "Ll/d30;", "onDismiss", "Ll/y2n;", "a", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/g30;Ll/d30;)Ll/y2n;", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final y2n m26336a(@NotNull Act ctx, @NotNull String from, @Nullable g30<PurchaseType, Act, String> onPaymentSuccess, @Nullable d30 onDismiss) {
            ctx.getClass();
            from.getClass();
            y2n y2nVar = new y2n(ctx);
            y2nVar.m26333x(from);
            y2nVar.m26335z(onPaymentSuccess);
            y2nVar.m26334y(onDismiss);
            y2nVar.m26322A();
            return y2nVar;
        }

        public Companion() {
        }
    }
}
