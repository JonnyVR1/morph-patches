package p153l;

import android.R;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.superlike.component.SuperlikeIapPaymentComponent;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 i2\u00020\u0001:\u0002*-B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\fJ\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\fJ\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\fJ%\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\"\u001a\u00020\b2\u001a\u0010!\u001a\u0016\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001f¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0004¢\u0006\u0004\b(\u0010\fR\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00108\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00107R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010H\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010GR*\u0010!\u001a\u0016\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010R\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bW\u0010QR\u0016\u0010Y\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010QR\u0014\u0010\\\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010[R\u0014\u0010_\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010^R\"\u0010d\u001a\u0010\u0012\f\u0012\n b*\u0004\u0018\u00010a0a0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010cR0\u0010h\u001a\u001e\u0012\f\u0012\n b*\u0004\u0018\u00010f0f\u0012\f\u0012\n b*\u0004\u0018\u00010:0:0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010g¨\u0006j"}, m88121d2 = {"Ll/kfp;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "from", "", BaseSei.f14624X, "(Ljava/lang/String;)V", "A", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "j", "(Landroid/view/View;)V", BLiveStormDanmakuGiftResourceType.f45294s, "u", "w", Constants.KEY_T, "p", ResourceDirection.f39656v, "q", "Lcom/p1/mobile/putong/core/data/ProductCategory;", "category", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "r", "(Lcom/p1/mobile/putong/core/data/ProductCategory;Ljava/util/List;)V", "Ll/a30;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "onPaymentSuccess", BaseSei.f14626Z, "(Ll/a30;)V", "Ll/x20;", "onDismiss", BaseSei.f14625Y, "(Ll/x20;)V", "B", "Ll/pej0;", "a", "Ll/pej0;", OMSTemplateType.dialog, "b", "Lcom/p1/mobile/android/app/Act;", "c", "Ljava/lang/String;", "purchaseshowfrom", "Ll/l4g0;", Constants.INAPP_DATA_TAG, "Ll/l4g0;", "statisticsPageHelper", "e", "Ll/x20;", "onCancel", "f", "", "g", "Z", "shouldDismissCallback", "Ll/p6h0;", "h", "Ll/p6h0;", "privilegeComponent", "Ll/s6h0;", RXScreenCaptureService.KEY_INDEX, "Ll/s6h0;", "showcaseComponent", "Lcom/p1/mobile/putong/core/ui/purchase/superlike/component/SuperlikeIapPaymentComponent;", "Lcom/p1/mobile/putong/core/ui/purchase/superlike/component/SuperlikeIapPaymentComponent;", "paymentComponent", "k", "Ll/a30;", "Ll/kcg0;", BLiveStormDanmakuGiftResourceType.f45292l, "Ll/kcg0;", "subscription", "Landroid/widget/LinearLayout;", "m", "Landroid/widget/LinearLayout;", "_root", "Landroid/widget/FrameLayout;", "n", "Landroid/widget/FrameLayout;", "_privilege_root", "o", "_showcase_root", "_payment_root", "Landroid/content/DialogInterface$OnDismissListener;", "Landroid/content/DialogInterface$OnDismissListener;", "onDismissListener", "Landroid/content/DialogInterface$OnCancelListener;", "Landroid/content/DialogInterface$OnCancelListener;", "onCancelListener", "Ll/y20;", "", "kotlin.jvm.PlatformType", "Ll/y20;", "dialogStateAction", "Ll/z20;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "Ll/z20;", "currentSelectPurchaseSectionAction", "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class kfp {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public pej0 dialog;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public String purchaseshowfrom;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public l4g0 statisticsPageHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public x20 onCancel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public x20 onDismiss;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean shouldDismissCallback;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public p6h0 privilegeComponent;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public s6h0 showcaseComponent;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public SuperlikeIapPaymentComponent paymentComponent;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public a30<PurchaseType, Act, String> onPaymentSuccess;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public kcg0 subscription;

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
    public final y20<Integer> dialogStateAction;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final z20<C8928d, Boolean> currentSelectPurchaseSectionAction;

    /* JADX INFO: renamed from: l.kfp$a */
    @Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m88121d2 = {"Ll/kfp$a;", "Landroid/content/DialogInterface$OnDismissListener;", "Landroid/content/DialogInterface$OnCancelListener;", "Ll/kfp;", OMSTemplateType.dialog, "<init>", "(Ll/kfp;)V", "Landroid/content/DialogInterface;", "", "onDismiss", "(Landroid/content/DialogInterface;)V", "onCancel", "Ljava/lang/ref/WeakReference;", "a", "Ljava/lang/ref/WeakReference;", "dialogRef", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class DialogInterfaceOnDismissListenerC18153a implements DialogInterface.OnDismissListener, DialogInterface.OnCancelListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final WeakReference<kfp> dialogRef;

        public DialogInterfaceOnDismissListenerC18153a(@NotNull kfp kfpVar) {
            kfpVar.getClass();
            this.dialogRef = new WeakReference<>(kfpVar);
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(@NotNull DialogInterface dialog) {
            dialog.getClass();
            kfp kfpVar = this.dialogRef.get();
            if (NullChecker.m82486a(kfpVar)) {
                kfpVar.getClass();
                kfpVar.onCancelListener.onCancel(dialog);
            }
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(@NotNull DialogInterface dialog) {
            dialog.getClass();
            kfp kfpVar = this.dialogRef.get();
            if (NullChecker.m82486a(kfpVar)) {
                kfpVar.getClass();
                kfpVar.onDismissListener.onDismiss(dialog);
            }
        }
    }

    /* JADX INFO: renamed from: l.kfp$c */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"l/kfp$c", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "()V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class ViewTreeObserverOnGlobalLayoutListenerC18155c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior<FrameLayout> f126487a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ kfp f126488b;

        public ViewTreeObserverOnGlobalLayoutListenerC18155c(BottomSheetBehavior<FrameLayout> bottomSheetBehavior, kfp kfpVar) {
            this.f126487a = bottomSheetBehavior;
            this.f126488b = kfpVar;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f126487a;
            LinearLayout linearLayout = this.f126488b._root;
            LinearLayout linearLayout2 = null;
            if (linearLayout == null) {
                Intrinsics.m88391r("_root");
                linearLayout = null;
            }
            bottomSheetBehavior.setPeekHeight(linearLayout.getHeight());
            LinearLayout linearLayout3 = this.f126488b._root;
            if (linearLayout3 == null) {
                Intrinsics.m88391r("_root");
            } else {
                linearLayout2 = linearLayout3;
            }
            linearLayout2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: l.kfp$d */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C18156d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Merchandise merchandiseM54784s = ((C8928d) t2).m54705d().m54784s();
            Integer numValueOf = Integer.valueOf(merchandiseM54784s != null ? merchandiseM54784s.quantity : 0);
            Merchandise merchandiseM54784s2 = ((C8928d) t).m54705d().m54784s();
            return go5.m131087d(numValueOf, Integer.valueOf(merchandiseM54784s2 != null ? merchandiseM54784s2.quantity : 0));
        }
    }

    public kfp(@NotNull Act act) {
        act.getClass();
        this.purchaseshowfrom = "";
        this.shouldDismissCallback = true;
        this.onDismissListener = new DialogInterface.OnDismissListener() { // from class: l.gfp
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                kfp.m149593d(this.f103944a, dialogInterface);
            }
        };
        this.onCancelListener = new DialogInterface.OnCancelListener() { // from class: l.hfp
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                kfp.m149590a(this.f109339a, dialogInterface);
            }
        };
        this.dialogStateAction = new y20() { // from class: l.ifp
            @Override // p153l.y20
            public final void call(Object obj) {
                kfp.m149596g(this.f114682a, ((Integer) obj).intValue());
            }
        };
        this.currentSelectPurchaseSectionAction = new z20() { // from class: l.jfp
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                kfp.m149598i(this.f120610a, (C8928d) obj, ((Boolean) obj2).booleanValue());
            }
        };
        this.act = act;
    }

    /* JADX INFO: renamed from: a */
    public static void m149590a(kfp kfpVar, DialogInterface dialogInterface) {
        x20 x20Var;
        if (!NullChecker.m82486a(kfpVar.onCancel) || (x20Var = kfpVar.onCancel) == null) {
            return;
        }
        x20Var.call();
    }

    /* JADX INFO: renamed from: b */
    public static void m149591b(kfp kfpVar, Throwable th) {
        kfpVar.m149608q();
    }

    /* JADX INFO: renamed from: c */
    public static void m149592c(kfp kfpVar, ProductCategory productCategory, List list) {
        productCategory.getClass();
        list.getClass();
        kfpVar.m149609r(productCategory, list);
        kfpVar.m149607p();
    }

    /* JADX INFO: renamed from: d */
    public static void m149593d(kfp kfpVar, DialogInterface dialogInterface) {
        x20 x20Var;
        if (kfpVar.shouldDismissCallback && NullChecker.m82486a(kfpVar.onDismiss) && (x20Var = kfpVar.onDismiss) != null) {
            x20Var.call();
        }
        CoreModule.m30933P().m143405a().mo34311E9();
        w1e.m204401e(kfpVar.statisticsPageHelper);
        kfpVar.m149605B();
    }

    /* JADX INFO: renamed from: e */
    public static void m149594e(kfp kfpVar) {
        SuperlikeIapPaymentComponent superlikeIapPaymentComponent = kfpVar.paymentComponent;
        if (superlikeIapPaymentComponent != null) {
            superlikeIapPaymentComponent.m55607R();
        }
    }

    /* JADX INFO: renamed from: f */
    public static C22421c m149595f(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g */
    public static void m149596g(kfp kfpVar, int i) {
        if (NullChecker.m82486a(kfpVar.dialog)) {
            if (i == -1) {
                pej0 pej0Var = kfpVar.dialog;
                if (pej0Var != null) {
                    pej0Var.hide();
                    return;
                }
                return;
            }
            if (i != 0) {
                if (i == 1) {
                    pej0 pej0Var2 = kfpVar.dialog;
                    if (pej0Var2 != null) {
                        pej0Var2.show();
                        return;
                    }
                    return;
                }
                if (i != 2) {
                    return;
                }
            }
            if (i == 2) {
                kfpVar.shouldDismissCallback = false;
            }
            pej0 pej0Var3 = kfpVar.dialog;
            if (pej0Var3 != null) {
                pej0Var3.m176562T();
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static C22421c m149597h(kfp kfpVar, List list) {
        if (!list.isEmpty()) {
            return CoreModule.m30933P().m143405a().mo34507g5(kfpVar.act, list);
        }
        kfpVar.m149608q();
        return C22421c.empty();
    }

    /* JADX INFO: renamed from: i */
    public static void m149598i(kfp kfpVar, C8928d c8928d, boolean z) {
        SuperlikeIapPaymentComponent superlikeIapPaymentComponent;
        c8928d.getClass();
        if (!NullChecker.m82486a(kfpVar.paymentComponent) || (superlikeIapPaymentComponent = kfpVar.paymentComponent) == null) {
            return;
        }
        superlikeIapPaymentComponent.m55595E(c8928d);
    }

    /* JADX INFO: renamed from: A */
    public final void m149604A() {
        pej0 pej0Var = new pej0(this.act, dgc0.f88282g);
        this.dialog = pej0Var;
        pej0Var.m172032u(g6e.f102429c);
        pej0 pej0Var2 = this.dialog;
        if (pej0Var2 != null) {
            pej0Var2.setCancelable(false);
        }
        pej0 pej0Var3 = this.dialog;
        if (pej0Var3 != null) {
            pej0Var3.setCanceledOnTouchOutside(false);
        }
        LinearLayout linearLayout = null;
        View viewInflate = LayoutInflater.from(this.act).inflate(rec0.f162517Z, (ViewGroup) null);
        viewInflate.getClass();
        m149606j(viewInflate);
        LinearLayout linearLayout2 = this._root;
        if (linearLayout2 == null) {
            Intrinsics.m88391r("_root");
            linearLayout2 = null;
        }
        if (linearLayout2 != null) {
            LinearLayout linearLayout3 = this._root;
            if (linearLayout3 == null) {
                Intrinsics.m88391r("_root");
                linearLayout3 = null;
            }
            linearLayout3.setClipChildren(false);
            LinearLayout linearLayout4 = this._root;
            if (linearLayout4 == null) {
                Intrinsics.m88391r("_root");
                linearLayout4 = null;
            }
            linearLayout4.setClipToPadding(false);
        }
        LinearLayout linearLayout5 = this._showcase_root;
        if (linearLayout5 == null) {
            Intrinsics.m88391r("_showcase_root");
            linearLayout5 = null;
        }
        if (linearLayout5 != null) {
            LinearLayout linearLayout6 = this._showcase_root;
            if (linearLayout6 == null) {
                Intrinsics.m88391r("_showcase_root");
                linearLayout6 = null;
            }
            linearLayout6.setClipChildren(false);
            LinearLayout linearLayout7 = this._showcase_root;
            if (linearLayout7 == null) {
                Intrinsics.m88391r("_showcase_root");
            } else {
                linearLayout = linearLayout7;
            }
            linearLayout.setClipToPadding(false);
        }
        pej0 pej0Var4 = this.dialog;
        if (pej0Var4 != null) {
            pej0Var4.setContentView(viewInflate);
        }
        DialogInterfaceOnDismissListenerC18153a dialogInterfaceOnDismissListenerC18153a = new DialogInterfaceOnDismissListenerC18153a(this);
        pej0 pej0Var5 = this.dialog;
        if (pej0Var5 != null) {
            pej0Var5.setOnDismissListener(dialogInterfaceOnDismissListenerC18153a);
        }
        pej0 pej0Var6 = this.dialog;
        if (pej0Var6 != null) {
            pej0Var6.setOnCancelListener(dialogInterfaceOnDismissListenerC18153a);
        }
        this.statisticsPageHelper = w1e.m204399c("p_intl_super_like_iap_view", kfp.class.getName());
        m149610s();
        pej0 pej0Var7 = this.dialog;
        if (pej0Var7 != null) {
            pej0Var7.show();
        }
        m149613v();
        CoreModule.f18264c.f20297C0.m146425v4();
        w1e.m204402f(this.statisticsPageHelper);
    }

    /* JADX INFO: renamed from: B */
    public final void m149605B() {
        s6h0 s6h0Var;
        if (NullChecker.m82486a(this.subscription)) {
            kcg0 kcg0Var = this.subscription;
            kcg0Var.getClass();
            if (!kcg0Var.isUnsubscribed()) {
                kcg0 kcg0Var2 = this.subscription;
                kcg0Var2.getClass();
                kcg0Var2.unsubscribe();
                this.subscription = null;
            }
        }
        if (!NullChecker.m82486a(this.showcaseComponent) || (s6h0Var = this.showcaseComponent) == null) {
            return;
        }
        s6h0Var.m184903r();
    }

    /* JADX INFO: renamed from: j */
    public final void m149606j(View view) {
        View viewFindViewById = view.findViewById(fdc0.f98347G0);
        viewFindViewById.getClass();
        this._root = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(fdc0.f98335A0);
        viewFindViewById2.getClass();
        this._privilege_root = (FrameLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(fdc0.f98357L0);
        viewFindViewById3.getClass();
        this._showcase_root = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(fdc0.f98443u0);
        viewFindViewById4.getClass();
        this._payment_root = (LinearLayout) viewFindViewById4;
    }

    /* JADX INFO: renamed from: p */
    public final void m149607p() {
        pej0 pej0Var = this.dialog;
        LinearLayout linearLayout = null;
        Window window = pej0Var != null ? pej0Var.getWindow() : null;
        if (NullChecker.m82486a(window)) {
            View viewFindViewById = window != null ? window.findViewById(R.id.content) : null;
            FrameLayout frameLayout = viewFindViewById != null ? (FrameLayout) viewFindViewById.findViewById(fdc0.f98450y) : null;
            if (NullChecker.m82486a(frameLayout)) {
                frameLayout.getClass();
                BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
                bottomSheetBehaviorFrom.getClass();
                bottomSheetBehaviorFrom.setState(3);
                LinearLayout linearLayout2 = this._root;
                if (linearLayout2 == null) {
                    Intrinsics.m88391r("_root");
                } else {
                    linearLayout = linearLayout2;
                }
                linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC18155c(bottomSheetBehaviorFrom, this));
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m149608q() {
        this.dialogStateAction.call(2);
        a5i0.m96182x1(this.act, this.purchaseshowfrom, this.onPaymentSuccess);
    }

    /* JADX INFO: renamed from: r */
    public final void m149609r(ProductCategory category, List<? extends Merchandise> merchandises) {
        List<C8928d> listMo147671a = zry.m221275z(category).mo147671a(this.act, PurchaseType.TYPE_SUPERLIKE_PKG, category, merchandises);
        if (jyb.m147479J(listMo147671a)) {
            return;
        }
        listMo147671a.getClass();
        List<? extends C8928d> listSortedWith = CollectionsKt.sortedWith(listMo147671a, new C18156d());
        if (!listSortedWith.isEmpty() && NullChecker.m82487b(listSortedWith)) {
            int iM200063c = v6h0.INSTANCE.m200063c(listSortedWith, CoreModule.f18264c.f20414p0.f203451R);
            int size = listSortedWith.size();
            int i = 0;
            while (i < size) {
                listSortedWith.get(i).m54723v(i == iM200063c);
                i++;
            }
            s6h0 s6h0Var = this.showcaseComponent;
            if (s6h0Var != null) {
                s6h0Var.m184904s(listSortedWith, this.currentSelectPurchaseSectionAction, this.dialogStateAction);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m149610s() {
        m149612u();
        m149614w();
        m149611t();
    }

    /* JADX INFO: renamed from: t */
    public final void m149611t() {
        SuperlikeIapPaymentComponent superlikeIapPaymentComponent = new SuperlikeIapPaymentComponent(this.act);
        this.paymentComponent = superlikeIapPaymentComponent;
        LinearLayout linearLayout = this._payment_root;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            Intrinsics.m88391r("_payment_root");
            linearLayout = null;
        }
        View viewM55613m = superlikeIapPaymentComponent.m55613m(linearLayout);
        if (NullChecker.m82486a(viewM55613m)) {
            SuperlikeIapPaymentComponent superlikeIapPaymentComponent2 = this.paymentComponent;
            if (superlikeIapPaymentComponent2 != null) {
                superlikeIapPaymentComponent2.m55596F(this.dialogStateAction, this.onCancel);
            }
            SuperlikeIapPaymentComponent superlikeIapPaymentComponent3 = this.paymentComponent;
            if (superlikeIapPaymentComponent3 != null) {
                superlikeIapPaymentComponent3.m55599I(this.purchaseshowfrom);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            SuperlikeIapPaymentComponent superlikeIapPaymentComponent4 = this.paymentComponent;
            if (superlikeIapPaymentComponent4 != null) {
                superlikeIapPaymentComponent4.m55600J(this.onPaymentSuccess);
            }
            LinearLayout linearLayout3 = this._payment_root;
            if (linearLayout3 == null) {
                Intrinsics.m88391r("_payment_root");
            } else {
                linearLayout2 = linearLayout3;
            }
            linearLayout2.addView(viewM55613m, layoutParams);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m149612u() {
        p6h0 p6h0Var = new p6h0(this.act);
        this.privilegeComponent = p6h0Var;
        Act act = this.act;
        FrameLayout frameLayout = this._privilege_root;
        FrameLayout frameLayout2 = null;
        if (frameLayout == null) {
            Intrinsics.m88391r("_privilege_root");
            frameLayout = null;
        }
        View viewM170888b = p6h0Var.m170888b(act, frameLayout);
        if (NullChecker.m82486a(viewM170888b)) {
            p6h0 p6h0Var2 = this.privilegeComponent;
            if (p6h0Var2 != null) {
                p6h0Var2.m170891e(this.dialogStateAction);
            }
            p6h0 p6h0Var3 = this.privilegeComponent;
            if (p6h0Var3 != null) {
                p6h0Var3.m170889c(this.act);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            FrameLayout frameLayout3 = this._privilege_root;
            if (frameLayout3 == null) {
                Intrinsics.m88391r("_privilege_root");
            } else {
                frameLayout2 = frameLayout3;
            }
            frameLayout2.addView(viewM170888b, layoutParams);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m149613v() {
        final ProductCategory productCategory = ProductCategory.get(ProductCategory.tttSuperLike);
        C22421c<List<Merchandise>> c22421cM31649z5 = CoreModule.f18264c.f20396j0.m31649z5(productCategory, false);
        final Function1 function1 = new Function1() { // from class: l.cfp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return kfp.m149597h(this.f81544a, (List) obj);
            }
        };
        this.subscription = c22421cM31649z5.switchMap(new qcj() { // from class: l.dfp
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return kfp.m149595f(function1, obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.efp
            @Override // p153l.y20
            public final void call(Object obj) {
                kfp.m149592c(this.f93810a, productCategory, (List) obj);
            }
        }, new y20() { // from class: l.ffp
            @Override // p153l.y20
            public final void call(Object obj) {
                kfp.m149591b(this.f98818a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w */
    public final void m149614w() {
        View viewM184891f;
        s6h0 s6h0Var = new s6h0(this.act);
        this.showcaseComponent = s6h0Var;
        s6h0Var.m184905t(new x20() { // from class: l.bfp
            @Override // p153l.x20
            public final void call() {
                kfp.m149594e(this.f76528a);
            }
        });
        s6h0 s6h0Var2 = this.showcaseComponent;
        LinearLayout linearLayout = null;
        if (s6h0Var2 != null) {
            LinearLayout linearLayout2 = this._showcase_root;
            if (linearLayout2 == null) {
                Intrinsics.m88391r("_showcase_root");
                linearLayout2 = null;
            }
            viewM184891f = s6h0Var2.m184891f(linearLayout2);
        } else {
            viewM184891f = null;
        }
        if (NullChecker.m82486a(viewM184891f)) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            LinearLayout linearLayout3 = this._showcase_root;
            if (linearLayout3 == null) {
                Intrinsics.m88391r("_showcase_root");
            } else {
                linearLayout = linearLayout3;
            }
            linearLayout.addView(viewM184891f, layoutParams);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m149615x(String from) {
        this.purchaseshowfrom = from;
    }

    /* JADX INFO: renamed from: y */
    public final void m149616y(@Nullable x20 onDismiss) {
        this.onDismiss = onDismiss;
    }

    /* JADX INFO: renamed from: z */
    public final void m149617z(@Nullable a30<PurchaseType, Act, String> onPaymentSuccess) {
        this.onPaymentSuccess = onPaymentSuccess;
    }

    /* JADX INFO: renamed from: l.kfp$b, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Ll/kfp$b;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "ctx", "", "from", "Ll/a30;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "onPaymentSuccess", "Ll/x20;", "onDismiss", "Ll/kfp;", "a", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/a30;Ll/x20;)Ll/kfp;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final kfp m149618a(@NotNull Act ctx, @NotNull String from, @Nullable a30<PurchaseType, Act, String> onPaymentSuccess, @Nullable x20 onDismiss) {
            ctx.getClass();
            from.getClass();
            kfp kfpVar = new kfp(ctx);
            kfpVar.m149615x(from);
            kfpVar.m149617z(onPaymentSuccess);
            kfpVar.m149616y(onDismiss);
            kfpVar.m149604A();
            return kfpVar;
        }

        public Companion() {
        }
    }
}
