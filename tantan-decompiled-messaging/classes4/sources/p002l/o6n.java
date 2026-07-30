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
import l.vwb;
import l.w9j;
import l.y7c0;
import l.z4c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 i2\u00020\u0001:\u0002*-B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\fJ\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\fJ\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\fJ%\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\"\u001a\u00020\b2\u001a\u0010!\u001a\u0016\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001f¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0004¢\u0006\u0004\b(\u0010\fR\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00108\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00107R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010H\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010GR*\u0010!\u001a\u0016\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010R\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bW\u0010QR\u0016\u0010Y\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010QR\u0014\u0010\\\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010[R\u0014\u0010_\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010^R\"\u0010d\u001a\u0010\u0012\f\u0012\n b*\u0004\u0018\u00010a0a0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010cR0\u0010h\u001a\u001e\u0012\f\u0012\n b*\u0004\u0018\u00010f0f\u0012\f\u0012\n b*\u0004\u0018\u00010:0:0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010g¨\u0006j"}, d2 = {"Ll/o6n;", "", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "from", "", "x", "(Ljava/lang/String;)V", "B", "()V", "Landroid/view/View;", "view", "j", "(Landroid/view/View;)V", "s", "u", "w", "t", "p", "v", "q", "Lcom/p1/mobile/putong/core/data/ProductCategory;", "category", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "r", "(Lcom/p1/mobile/putong/core/data/ProductCategory;Ljava/util/List;)V", "Ll/g30;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "onPaymentSuccess", "z", "(Ll/g30;)V", "Ll/d30;", "onDismiss", "y", "(Ll/d30;)V", "C", "Ll/l5j0;", "a", "Ll/l5j0;", "dialog", "b", "Lcom/p1/mobile/android/app/Act;", "c", "Ljava/lang/String;", "purchaseshowfrom", "Ll/cwf0;", "d", "Ll/cwf0;", "statisticsPageHelper", "e", "Ll/d30;", "onCancel", "f", "", "g", "Z", "shouldDismissCallback", "Ll/pq5;", "h", "Ll/pq5;", "privilegeComponent", "Ll/sq5;", "i", "Ll/sq5;", "showcaseComponent", "Ll/nq5;", "Ll/nq5;", "paymentComponent", "k", "Ll/g30;", "Ll/c4g0;", "l", "Ll/c4g0;", "subscription", "Landroid/widget/LinearLayout;", "m", "Landroid/widget/LinearLayout;", "_root", "Landroid/widget/FrameLayout;", "n", "Landroid/widget/FrameLayout;", "_privilege_root", "o", "_showcase_root", "_payment_root", "Landroid/content/DialogInterface$OnDismissListener;", "Landroid/content/DialogInterface$OnDismissListener;", "onDismissListener", "Landroid/content/DialogInterface$OnCancelListener;", "Landroid/content/DialogInterface$OnCancelListener;", "onCancelListener", "Ll/e30;", "", "kotlin.jvm.PlatformType", "Ll/e30;", "dialogStateAction", "Ll/f30;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "Ll/f30;", "currentSelectPurchaseSectionAction", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class o6n {

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
    public pq5 privilegeComponent;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public sq5 showcaseComponent;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public nq5 paymentComponent;

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

    /* JADX INFO: renamed from: l.o6n$a */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Ll/o6n$a;", "Landroid/content/DialogInterface$OnDismissListener;", "Landroid/content/DialogInterface$OnCancelListener;", "Ll/o6n;", "dialog", "<init>", "(Ll/o6n;)V", "Landroid/content/DialogInterface;", "", "onDismiss", "(Landroid/content/DialogInterface;)V", "onCancel", "Ljava/lang/ref/WeakReference;", "a", "Ljava/lang/ref/WeakReference;", "dialogRef", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DialogInterfaceOnDismissListenerC0713a implements DialogInterface.OnDismissListener, DialogInterface.OnCancelListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final WeakReference<o6n> dialogRef;

        public DialogInterfaceOnDismissListenerC0713a(@NotNull o6n o6nVar) {
            o6nVar.getClass();
            this.dialogRef = new WeakReference<>(o6nVar);
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(@NotNull DialogInterface dialog) {
            dialog.getClass();
            o6n o6nVar = this.dialogRef.get();
            if (NullChecker.a(o6nVar)) {
                o6nVar.getClass();
                o6nVar.onCancelListener.onCancel(dialog);
            }
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(@NotNull DialogInterface dialog) {
            dialog.getClass();
            o6n o6nVar = this.dialogRef.get();
            if (NullChecker.a(o6nVar)) {
                o6nVar.getClass();
                o6nVar.onDismissListener.onDismiss(dialog);
            }
        }
    }

    /* JADX INFO: renamed from: l.o6n$c */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"l/o6n$c", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "()V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ViewTreeObserverOnGlobalLayoutListenerC0715c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior<FrameLayout> f16398a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ o6n f16399b;

        public ViewTreeObserverOnGlobalLayoutListenerC0715c(BottomSheetBehavior<FrameLayout> bottomSheetBehavior, o6n o6nVar) {
            this.f16398a = bottomSheetBehavior;
            this.f16399b = o6nVar;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f16398a;
            LinearLayout linearLayout = this.f16399b._root;
            LinearLayout linearLayout2 = null;
            if (linearLayout == null) {
                Intrinsics.r("_root");
                linearLayout = null;
            }
            bottomSheetBehavior.setPeekHeight(linearLayout.getHeight());
            LinearLayout linearLayout3 = this.f16399b._root;
            if (linearLayout3 == null) {
                Intrinsics.r("_root");
            } else {
                linearLayout2 = linearLayout3;
            }
            linearLayout2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: l.o6n$d */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class C0716d<T> implements Comparator {
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

    public o6n(@NotNull Act act) {
        act.getClass();
        this.purchaseshowfrom = "";
        this.shouldDismissCallback = true;
        this.onDismissListener = new DialogInterface.OnDismissListener() { // from class: l.k6n
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                o6n.m19229d(this.f14220a, dialogInterface);
            }
        };
        this.onCancelListener = new DialogInterface.OnCancelListener() { // from class: l.l6n
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                o6n.m19234i(this.f14689a, dialogInterface);
            }
        };
        this.dialogStateAction = new e30() { // from class: l.m6n
            public final void call(Object obj) {
                o6n.m19231f(this.f15254a, ((Integer) obj).intValue());
            }
        };
        this.currentSelectPurchaseSectionAction = new f30() { // from class: l.n6n
            public final void call(Object obj, Object obj2) {
                o6n.m19232g(this.f15845a, (C0190d) obj, ((Boolean) obj2).booleanValue());
            }
        };
        this.act = act;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: A */
    public static final o6n m19225A(@NotNull Act act, @NotNull String str, @Nullable g30<PurchaseType, Act, String> g30Var, @Nullable d30 d30Var) {
        return INSTANCE.m19254a(act, str, g30Var, d30Var);
    }

    /* JADX INFO: renamed from: a */
    public static c m19226a(Function1 function1, Object obj) {
        return (c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b */
    public static c m19227b(o6n o6nVar, List list) {
        if (!list.isEmpty()) {
            return CoreModule.P().a().g5(o6nVar.act, list);
        }
        o6nVar.m19244q();
        return c.empty();
    }

    /* JADX INFO: renamed from: c */
    public static void m19228c(o6n o6nVar, Throwable th) {
        o6nVar.m19244q();
    }

    /* JADX INFO: renamed from: d */
    public static void m19229d(o6n o6nVar, DialogInterface dialogInterface) {
        d30 d30Var;
        if (o6nVar.shouldDismissCallback && NullChecker.a(o6nVar.onDismiss) && (d30Var = o6nVar.onDismiss) != null) {
            d30Var.call();
        }
        CoreModule.P().a().E9();
        i0e.e(o6nVar.statisticsPageHelper);
        o6nVar.m19241C();
    }

    /* JADX INFO: renamed from: e */
    public static void m19230e(o6n o6nVar, ProductCategory productCategory, List list) {
        productCategory.getClass();
        list.getClass();
        o6nVar.m19245r(productCategory, list);
        o6nVar.m19243p();
    }

    /* JADX INFO: renamed from: f */
    public static void m19231f(o6n o6nVar, int i) {
        if (NullChecker.a(o6nVar.dialog)) {
            if (i == -1) {
                l5j0 l5j0Var = o6nVar.dialog;
                if (l5j0Var != null) {
                    l5j0Var.hide();
                    return;
                }
                return;
            }
            if (i != 0) {
                if (i == 1) {
                    l5j0 l5j0Var2 = o6nVar.dialog;
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
                o6nVar.shouldDismissCallback = false;
            }
            l5j0 l5j0Var3 = o6nVar.dialog;
            if (l5j0Var3 != null) {
                l5j0Var3.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m19232g(o6n o6nVar, C0190d c0190d, boolean z) {
        nq5 nq5Var;
        c0190d.getClass();
        if (!NullChecker.a(o6nVar.paymentComponent) || (nq5Var = o6nVar.paymentComponent) == null) {
            return;
        }
        nq5Var.m18929q(c0190d);
    }

    /* JADX INFO: renamed from: h */
    public static void m19233h(o6n o6nVar) {
        nq5 nq5Var = o6nVar.paymentComponent;
        if (nq5Var != null) {
            nq5Var.m18917A();
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m19234i(o6n o6nVar, DialogInterface dialogInterface) {
        d30 d30Var;
        if (!NullChecker.a(o6nVar.onCancel) || (d30Var = o6nVar.onCancel) == null) {
            return;
        }
        d30Var.call();
    }

    /* JADX INFO: renamed from: B */
    public final void m19240B() {
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
        View viewInflate = LayoutInflater.from(this.act).inflate(m6c0.s, (ViewGroup) null);
        viewInflate.getClass();
        m19242j(viewInflate);
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
        DialogInterfaceOnDismissListenerC0713a dialogInterfaceOnDismissListenerC0713a = new DialogInterfaceOnDismissListenerC0713a(this);
        l5j0 l5j0Var5 = this.dialog;
        if (l5j0Var5 != null) {
            l5j0Var5.setOnDismissListener(dialogInterfaceOnDismissListenerC0713a);
        }
        l5j0 l5j0Var6 = this.dialog;
        if (l5j0Var6 != null) {
            l5j0Var6.setOnCancelListener(dialogInterfaceOnDismissListenerC0713a);
        }
        this.statisticsPageHelper = i0e.c("p_intl_compliment_iap_view", o6n.class.getName());
        m19246s();
        l5j0 l5j0Var7 = this.dialog;
        if (l5j0Var7 != null) {
            l5j0Var7.show();
        }
        m19249v();
        CoreModule.c.C0.u4();
        i0e.f(this.statisticsPageHelper);
    }

    /* JADX INFO: renamed from: C */
    public final void m19241C() {
        sq5 sq5Var;
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
        if (!NullChecker.a(this.showcaseComponent) || (sq5Var = this.showcaseComponent) == null) {
            return;
        }
        sq5Var.m22624r();
    }

    /* JADX INFO: renamed from: j */
    public final void m19242j(View view) {
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
    public final void m19243p() {
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
                linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0715c(bottomSheetBehaviorFrom, this));
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m19244q() {
        this.dialogStateAction.call(2);
    }

    /* JADX INFO: renamed from: r */
    public final void m19245r(ProductCategory category, List<? extends Merchandise> merchandises) {
        List listA = cjy.z(category).a(this.act, PurchaseType.TYPE_COMPLIMENT, category, merchandises);
        if (vwb.J(listA)) {
            return;
        }
        listA.getClass();
        List<? extends C0190d> listSortedWith = CollectionsKt.sortedWith(listA, new C0716d());
        if (!listSortedWith.isEmpty() && NullChecker.b(listSortedWith)) {
            int iM14735b = hr5.INSTANCE.m14735b(listSortedWith);
            int size = listSortedWith.size();
            int i = 0;
            while (i < size) {
                listSortedWith.get(i).m4106v(i == iM14735b);
                i++;
            }
            sq5 sq5Var = this.showcaseComponent;
            if (sq5Var != null) {
                sq5Var.m22625s(listSortedWith, this.currentSelectPurchaseSectionAction, this.dialogStateAction);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m19246s() {
        m19248u();
        m19250w();
        m19247t();
    }

    /* JADX INFO: renamed from: t */
    public final void m19247t() {
        nq5 nq5Var = new nq5(this.act);
        this.paymentComponent = nq5Var;
        LinearLayout linearLayout = this._payment_root;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            Intrinsics.r("_payment_root");
            linearLayout = null;
        }
        View viewM18919g = nq5Var.m18919g(linearLayout);
        if (NullChecker.a(viewM18919g)) {
            nq5 nq5Var2 = this.paymentComponent;
            if (nq5Var2 != null) {
                nq5Var2.m18930r(this.dialogStateAction, this.onCancel);
            }
            nq5 nq5Var3 = this.paymentComponent;
            if (nq5Var3 != null) {
                nq5Var3.m18933u(this.purchaseshowfrom);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            nq5 nq5Var4 = this.paymentComponent;
            if (nq5Var4 != null) {
                nq5Var4.m18934v(this.onPaymentSuccess);
            }
            LinearLayout linearLayout3 = this._payment_root;
            if (linearLayout3 == null) {
                Intrinsics.r("_payment_root");
            } else {
                linearLayout2 = linearLayout3;
            }
            linearLayout2.addView(viewM18919g, layoutParams);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m19248u() {
        pq5 pq5Var = new pq5(this.act);
        this.privilegeComponent = pq5Var;
        Act act = this.act;
        FrameLayout frameLayout = this._privilege_root;
        FrameLayout frameLayout2 = null;
        if (frameLayout == null) {
            Intrinsics.r("_privilege_root");
            frameLayout = null;
        }
        View viewM20621b = pq5Var.m20621b(act, frameLayout);
        if (NullChecker.a(viewM20621b)) {
            pq5 pq5Var2 = this.privilegeComponent;
            if (pq5Var2 != null) {
                pq5Var2.m20624e(this.dialogStateAction);
            }
            pq5 pq5Var3 = this.privilegeComponent;
            if (pq5Var3 != null) {
                pq5Var3.m20622c(this.act);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            FrameLayout frameLayout3 = this._privilege_root;
            if (frameLayout3 == null) {
                Intrinsics.r("_privilege_root");
            } else {
                frameLayout2 = frameLayout3;
            }
            frameLayout2.addView(viewM20621b, layoutParams);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m19249v() {
        final ProductCategory productCategory = ProductCategory.get("tttCompliment");
        c cVarZ5 = CoreModule.c.j0.z5(productCategory, false);
        final Function1 function1 = new Function1() { // from class: l.g6n
            public final Object invoke(Object obj) {
                return o6n.m19227b(this.f11287a, (List) obj);
            }
        };
        this.subscription = cVarZ5.switchMap(new w9j() { // from class: l.h6n
            public final Object call(Object obj) {
                return o6n.m19226a(function1, obj);
            }
        }).observeOn(jo0.a()).take(1).subscribe(mkd0.H(new e30() { // from class: l.i6n
            public final void call(Object obj) {
                o6n.m19230e(this.f13081a, productCategory, (List) obj);
            }
        }, new e30() { // from class: l.j6n
            public final void call(Object obj) {
                o6n.m19228c(this.f13610a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w */
    public final void m19250w() {
        View viewM22612f;
        sq5 sq5Var = new sq5(this.act);
        this.showcaseComponent = sq5Var;
        sq5Var.m22626t(new d30() { // from class: l.f6n
            public final void call() {
                o6n.m19233h(this.f10151a);
            }
        });
        sq5 sq5Var2 = this.showcaseComponent;
        LinearLayout linearLayout = null;
        if (sq5Var2 != null) {
            LinearLayout linearLayout2 = this._showcase_root;
            if (linearLayout2 == null) {
                Intrinsics.r("_showcase_root");
                linearLayout2 = null;
            }
            viewM22612f = sq5Var2.m22612f(linearLayout2);
        } else {
            viewM22612f = null;
        }
        if (NullChecker.a(viewM22612f)) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            LinearLayout linearLayout3 = this._showcase_root;
            if (linearLayout3 == null) {
                Intrinsics.r("_showcase_root");
            } else {
                linearLayout = linearLayout3;
            }
            linearLayout.addView(viewM22612f, layoutParams);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m19251x(String from) {
        this.purchaseshowfrom = from;
    }

    /* JADX INFO: renamed from: y */
    public final void m19252y(@Nullable d30 onDismiss) {
        this.onDismiss = onDismiss;
    }

    /* JADX INFO: renamed from: z */
    public final void m19253z(@Nullable g30<PurchaseType, Act, String> onPaymentSuccess) {
        this.onPaymentSuccess = onPaymentSuccess;
    }

    /* JADX INFO: renamed from: l.o6n$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ll/o6n$b;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "ctx", "", "from", "Ll/g30;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "onPaymentSuccess", "Ll/d30;", "onDismiss", "Ll/o6n;", "a", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/g30;Ll/d30;)Ll/o6n;", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final o6n m19254a(@NotNull Act ctx, @NotNull String from, @Nullable g30<PurchaseType, Act, String> onPaymentSuccess, @Nullable d30 onDismiss) {
            ctx.getClass();
            from.getClass();
            o6n o6nVar = new o6n(ctx);
            o6nVar.m19251x(from);
            o6nVar.m19253z(onPaymentSuccess);
            o6nVar.m19252y(onDismiss);
            o6nVar.m19240B();
            return o6nVar;
        }

        public Companion() {
        }
    }
}
