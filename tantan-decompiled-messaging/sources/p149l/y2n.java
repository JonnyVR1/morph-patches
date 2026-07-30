package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.boost.component.BoostIapPaymentComponent;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 i2\u00020\u0001:\u0002*-B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\fJ\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\fJ\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\fJ%\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\"\u001a\u00020\b2\u001a\u0010!\u001a\u0016\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001f¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0004¢\u0006\u0004\b(\u0010\fR\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00108\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00107R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010H\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010GR*\u0010!\u001a\u0016\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010R\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bW\u0010QR\u0016\u0010Y\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010QR\u0014\u0010\\\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010[R\u0014\u0010_\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010^R\"\u0010d\u001a\u0010\u0012\f\u0012\n b*\u0004\u0018\u00010a0a0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010cR0\u0010h\u001a\u001e\u0012\f\u0012\n b*\u0004\u0018\u00010f0f\u0012\f\u0012\n b*\u0004\u0018\u00010:0:0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010g¨\u0006j"}, m87232d2 = {"Ll/y2n;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "from", "", BaseSei.f13930X, "(Ljava/lang/String;)V", "A", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "j", "(Landroid/view/View;)V", BLiveStormDanmakuGiftResourceType.f44446s, "u", "w", Constants.KEY_T, "p", ResourceDirection.f38808v, "q", "Lcom/p1/mobile/putong/core/data/ProductCategory;", "category", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "r", "(Lcom/p1/mobile/putong/core/data/ProductCategory;Ljava/util/List;)V", "Ll/g30;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "onPaymentSuccess", BaseSei.f13932Z, "(Ll/g30;)V", "Ll/d30;", "onDismiss", BaseSei.f13931Y, "(Ll/d30;)V", "B", "Ll/l5j0;", "a", "Ll/l5j0;", OMSTemplateType.dialog, "b", "Lcom/p1/mobile/android/app/Act;", "c", "Ljava/lang/String;", "purchaseshowfrom", "Ll/cwf0;", Constants.INAPP_DATA_TAG, "Ll/cwf0;", "statisticsPageHelper", "e", "Ll/d30;", "onCancel", "f", "", "g", "Z", "shouldDismissCallback", "Ll/p83;", "h", "Ll/p83;", "privilegeComponent", "Ll/s83;", RXScreenCaptureService.KEY_INDEX, "Ll/s83;", "showcaseComponent", "Lcom/p1/mobile/putong/core/ui/purchase/boost/component/BoostIapPaymentComponent;", "Lcom/p1/mobile/putong/core/ui/purchase/boost/component/BoostIapPaymentComponent;", "paymentComponent", "k", "Ll/g30;", "Ll/c4g0;", BLiveStormDanmakuGiftResourceType.f44444l, "Ll/c4g0;", "subscription", "Landroid/widget/LinearLayout;", "m", "Landroid/widget/LinearLayout;", "_root", "Landroid/widget/FrameLayout;", "n", "Landroid/widget/FrameLayout;", "_privilege_root", "o", "_showcase_root", "_payment_root", "Landroid/content/DialogInterface$OnDismissListener;", "Landroid/content/DialogInterface$OnDismissListener;", "onDismissListener", "Landroid/content/DialogInterface$OnCancelListener;", "Landroid/content/DialogInterface$OnCancelListener;", "onCancelListener", "Ll/e30;", "", "kotlin.jvm.PlatformType", "Ll/e30;", "dialogStateAction", "Ll/f30;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "Ll/f30;", "currentSelectPurchaseSectionAction", "Companion", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public final f30<C8765d, Boolean> currentSelectPurchaseSectionAction;

    /* JADX INFO: renamed from: l.y2n$a */
    @Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m87232d2 = {"Ll/y2n$a;", "Landroid/content/DialogInterface$OnDismissListener;", "Landroid/content/DialogInterface$OnCancelListener;", "Ll/y2n;", OMSTemplateType.dialog, "<init>", "(Ll/y2n;)V", "Landroid/content/DialogInterface;", "", "onDismiss", "(Landroid/content/DialogInterface;)V", "onCancel", "Ljava/lang/ref/WeakReference;", "a", "Ljava/lang/ref/WeakReference;", "dialogRef", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class DialogInterfaceOnDismissListenerC21287a implements DialogInterface.OnDismissListener, DialogInterface.OnCancelListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final WeakReference<y2n> dialogRef;

        public DialogInterfaceOnDismissListenerC21287a(@NotNull y2n y2nVar) {
            y2nVar.getClass();
            this.dialogRef = new WeakReference<>(y2nVar);
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(@NotNull DialogInterface dialog) {
            dialog.getClass();
            y2n y2nVar = this.dialogRef.get();
            if (NullChecker.m81303a(y2nVar)) {
                y2nVar.getClass();
                y2nVar.onCancelListener.onCancel(dialog);
            }
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(@NotNull DialogInterface dialog) {
            dialog.getClass();
            y2n y2nVar = this.dialogRef.get();
            if (NullChecker.m81303a(y2nVar)) {
                y2nVar.getClass();
                y2nVar.onDismissListener.onDismiss(dialog);
            }
        }
    }

    /* JADX INFO: renamed from: l.y2n$c */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"l/y2n$c", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "()V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class ViewTreeObserverOnGlobalLayoutListenerC21289c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior<FrameLayout> f195657a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ y2n f195658b;

        public ViewTreeObserverOnGlobalLayoutListenerC21289c(BottomSheetBehavior<FrameLayout> bottomSheetBehavior, y2n y2nVar) {
            this.f195657a = bottomSheetBehavior;
            this.f195658b = y2nVar;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f195657a;
            LinearLayout linearLayout = this.f195658b._root;
            LinearLayout linearLayout2 = null;
            if (linearLayout == null) {
                Intrinsics.m87502r("_root");
                linearLayout = null;
            }
            bottomSheetBehavior.setPeekHeight(linearLayout.getHeight());
            LinearLayout linearLayout3 = this.f195658b._root;
            if (linearLayout3 == null) {
                Intrinsics.m87502r("_root");
            } else {
                linearLayout2 = linearLayout3;
            }
            linearLayout2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: l.y2n$d */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C21290d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Merchandise merchandiseM53601s;
            Merchandise merchandiseM53601s2;
            C8765d c8765d = (C8765d) t2;
            C8765d.a aVarM53522d = c8765d.m53522d();
            Merchandise merchandiseM53601s3 = null;
            if (aVarM53522d == null || (merchandiseM53601s = aVarM53522d.m53601s()) == null) {
                C8765d.a aVarM53520b = c8765d.m53520b();
                merchandiseM53601s = aVarM53520b != null ? aVarM53520b.m53601s() : null;
            }
            Integer numValueOf = Integer.valueOf(merchandiseM53601s != null ? merchandiseM53601s.quantity : 0);
            C8765d c8765d2 = (C8765d) t;
            C8765d.a aVarM53522d2 = c8765d2.m53522d();
            if (aVarM53522d2 == null || (merchandiseM53601s2 = aVarM53522d2.m53601s()) == null) {
                C8765d.a aVarM53520b2 = c8765d2.m53520b();
                if (aVarM53520b2 != null) {
                    merchandiseM53601s3 = aVarM53520b2.m53601s();
                }
            } else {
                merchandiseM53601s3 = merchandiseM53601s2;
            }
            return cn5.m107733d(numValueOf, Integer.valueOf(merchandiseM53601s3 != null ? merchandiseM53601s3.quantity : 0));
        }
    }

    public y2n(@NotNull Act act) {
        act.getClass();
        this.purchaseshowfrom = "";
        this.shouldDismissCallback = true;
        this.onDismissListener = new DialogInterface.OnDismissListener() { // from class: l.p2n
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                y2n.m212398c(this.f146901a, dialogInterface);
            }
        };
        this.onCancelListener = new DialogInterface.OnCancelListener() { // from class: l.q2n
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                y2n.m212402g(this.f152282a, dialogInterface);
            }
        };
        this.dialogStateAction = new e30() { // from class: l.r2n
            @Override // p149l.e30
            public final void call(Object obj) {
                y2n.m212403h(this.f157425a, ((Integer) obj).intValue());
            }
        };
        this.currentSelectPurchaseSectionAction = new f30() { // from class: l.s2n
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                y2n.m212396a(this.f161991a, (C8765d) obj, ((Boolean) obj2).booleanValue());
            }
        };
        this.act = act;
    }

    /* JADX INFO: renamed from: a */
    public static void m212396a(y2n y2nVar, C8765d c8765d, boolean z) {
        BoostIapPaymentComponent boostIapPaymentComponent;
        c8765d.getClass();
        if (!NullChecker.m81303a(y2nVar.paymentComponent) || (boostIapPaymentComponent = y2nVar.paymentComponent) == null) {
            return;
        }
        boostIapPaymentComponent.m53373z(c8765d);
    }

    /* JADX INFO: renamed from: b */
    public static void m212397b(y2n y2nVar, Throwable th) {
        y2nVar.m212414q();
    }

    /* JADX INFO: renamed from: c */
    public static void m212398c(y2n y2nVar, DialogInterface dialogInterface) {
        d30 d30Var;
        if (y2nVar.shouldDismissCallback && NullChecker.m81303a(y2nVar.onDismiss) && (d30Var = y2nVar.onDismiss) != null) {
            d30Var.call();
        }
        CoreModule.m29935P().m94651a().mo33308E9();
        i0e.m133796e(y2nVar.statisticsPageHelper);
        y2nVar.m212411B();
    }

    /* JADX INFO: renamed from: d */
    public static void m212399d(y2n y2nVar) {
        BoostIapPaymentComponent boostIapPaymentComponent = y2nVar.paymentComponent;
        if (boostIapPaymentComponent != null) {
            boostIapPaymentComponent.m53353L();
        }
    }

    /* JADX INFO: renamed from: e */
    public static C22306c m212400e(y2n y2nVar, List list) {
        if (!list.isEmpty()) {
            return CoreModule.m29935P().m94651a().mo33504g5(y2nVar.act, list);
        }
        y2nVar.m212414q();
        return C22306c.empty();
    }

    /* JADX INFO: renamed from: f */
    public static C22306c m212401f(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g */
    public static void m212402g(y2n y2nVar, DialogInterface dialogInterface) {
        d30 d30Var;
        if (!NullChecker.m81303a(y2nVar.onCancel) || (d30Var = y2nVar.onCancel) == null) {
            return;
        }
        d30Var.call();
    }

    /* JADX INFO: renamed from: h */
    public static void m212403h(y2n y2nVar, int i) {
        if (NullChecker.m81303a(y2nVar.dialog)) {
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
                l5j0Var3.m101651T();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m212404i(y2n y2nVar, ProductCategory productCategory, List list) {
        productCategory.getClass();
        list.getClass();
        y2nVar.m212415r(productCategory, list);
        y2nVar.m212413p();
    }

    /* JADX INFO: renamed from: A */
    public final void m212410A() {
        l5j0 l5j0Var = new l5j0(this.act, y7c0.f196696f);
        this.dialog = l5j0Var;
        l5j0Var.m148649u(s4e.f162377c);
        l5j0 l5j0Var2 = this.dialog;
        if (l5j0Var2 != null) {
            l5j0Var2.setCancelable(false);
        }
        l5j0 l5j0Var3 = this.dialog;
        if (l5j0Var3 != null) {
            l5j0Var3.setCanceledOnTouchOutside(false);
        }
        LinearLayout linearLayout = null;
        View viewInflate = LayoutInflater.from(this.act).inflate(m6c0.f131605j, (ViewGroup) null);
        viewInflate.getClass();
        m212412j(viewInflate);
        LinearLayout linearLayout2 = this._root;
        if (linearLayout2 == null) {
            Intrinsics.m87502r("_root");
            linearLayout2 = null;
        }
        if (linearLayout2 != null) {
            LinearLayout linearLayout3 = this._root;
            if (linearLayout3 == null) {
                Intrinsics.m87502r("_root");
                linearLayout3 = null;
            }
            linearLayout3.setClipChildren(false);
            LinearLayout linearLayout4 = this._root;
            if (linearLayout4 == null) {
                Intrinsics.m87502r("_root");
                linearLayout4 = null;
            }
            linearLayout4.setClipToPadding(false);
        }
        LinearLayout linearLayout5 = this._showcase_root;
        if (linearLayout5 == null) {
            Intrinsics.m87502r("_showcase_root");
            linearLayout5 = null;
        }
        if (linearLayout5 != null) {
            LinearLayout linearLayout6 = this._showcase_root;
            if (linearLayout6 == null) {
                Intrinsics.m87502r("_showcase_root");
                linearLayout6 = null;
            }
            linearLayout6.setClipChildren(false);
            LinearLayout linearLayout7 = this._showcase_root;
            if (linearLayout7 == null) {
                Intrinsics.m87502r("_showcase_root");
            } else {
                linearLayout = linearLayout7;
            }
            linearLayout.setClipToPadding(false);
        }
        l5j0 l5j0Var4 = this.dialog;
        if (l5j0Var4 != null) {
            l5j0Var4.setContentView(viewInflate);
        }
        DialogInterfaceOnDismissListenerC21287a dialogInterfaceOnDismissListenerC21287a = new DialogInterfaceOnDismissListenerC21287a(this);
        l5j0 l5j0Var5 = this.dialog;
        if (l5j0Var5 != null) {
            l5j0Var5.setOnDismissListener(dialogInterfaceOnDismissListenerC21287a);
        }
        l5j0 l5j0Var6 = this.dialog;
        if (l5j0Var6 != null) {
            l5j0Var6.setOnCancelListener(dialogInterfaceOnDismissListenerC21287a);
        }
        this.statisticsPageHelper = i0e.m133794c("p_intl_boost_iap_view", y2n.class.getName());
        m212416s();
        l5j0 l5j0Var7 = this.dialog;
        if (l5j0Var7 != null) {
            l5j0Var7.show();
        }
        m212419v();
        CoreModule.f17545c.f19555C0.m210112u4();
        i0e.m133797f(this.statisticsPageHelper);
    }

    /* JADX INFO: renamed from: B */
    public final void m212411B() {
        s83 s83Var;
        if (NullChecker.m81303a(this.subscription)) {
            c4g0 c4g0Var = this.subscription;
            c4g0Var.getClass();
            if (!c4g0Var.isUnsubscribed()) {
                c4g0 c4g0Var2 = this.subscription;
                c4g0Var2.getClass();
                c4g0Var2.unsubscribe();
                this.subscription = null;
            }
        }
        if (!NullChecker.m81303a(this.showcaseComponent) || (s83Var = this.showcaseComponent) == null) {
            return;
        }
        s83Var.m182571r();
    }

    /* JADX INFO: renamed from: j */
    public final void m212412j(View view) {
        View viewFindViewById = view.findViewById(z4c0.f201471G0);
        viewFindViewById.getClass();
        this._root = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(z4c0.f201459A0);
        viewFindViewById2.getClass();
        this._privilege_root = (FrameLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(z4c0.f201481L0);
        viewFindViewById3.getClass();
        this._showcase_root = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(z4c0.f201567u0);
        viewFindViewById4.getClass();
        this._payment_root = (LinearLayout) viewFindViewById4;
    }

    /* JADX INFO: renamed from: p */
    public final void m212413p() {
        l5j0 l5j0Var = this.dialog;
        LinearLayout linearLayout = null;
        Window window = l5j0Var != null ? l5j0Var.getWindow() : null;
        if (NullChecker.m81303a(window)) {
            View viewFindViewById = window != null ? window.findViewById(R.id.content) : null;
            FrameLayout frameLayout = viewFindViewById != null ? (FrameLayout) viewFindViewById.findViewById(z4c0.f201574y) : null;
            if (NullChecker.m81303a(frameLayout)) {
                frameLayout.getClass();
                BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
                bottomSheetBehaviorFrom.getClass();
                bottomSheetBehaviorFrom.setState(3);
                LinearLayout linearLayout2 = this._root;
                if (linearLayout2 == null) {
                    Intrinsics.m87502r("_root");
                } else {
                    linearLayout = linearLayout2;
                }
                linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC21289c(bottomSheetBehaviorFrom, this));
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m212414q() {
        this.dialogStateAction.call(2);
        swh0.m186247m1(this.act, this.purchaseshowfrom, null);
    }

    /* JADX INFO: renamed from: r */
    public final void m212415r(ProductCategory category, List<? extends Merchandise> merchandises) {
        List<C8765d> listMo107333a = cjy.m107330z(category).mo107333a(this.act, PurchaseType.TYPE_SPOTLIGHT, category, merchandises);
        if (vwb.m200296J(listMo107333a)) {
            return;
        }
        listMo107333a.getClass();
        List<? extends C8765d> listSortedWith = CollectionsKt.sortedWith(listMo107333a, new C21290d());
        if (!listSortedWith.isEmpty() && NullChecker.m81304b(listSortedWith)) {
            int iM173597c = q93.INSTANCE.m173597c(listSortedWith, CoreModule.f17545c.f19672p0.f153140R);
            int size = listSortedWith.size();
            int i = 0;
            while (i < size) {
                listSortedWith.get(i).m53540v(i == iM173597c);
                i++;
            }
            s83 s83Var = this.showcaseComponent;
            if (s83Var != null) {
                s83Var.m182572s(listSortedWith, this.currentSelectPurchaseSectionAction, this.dialogStateAction);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m212416s() {
        m212418u();
        m212420w();
        m212417t();
    }

    /* JADX INFO: renamed from: t */
    public final void m212417t() {
        BoostIapPaymentComponent boostIapPaymentComponent = new BoostIapPaymentComponent(this.act);
        this.paymentComponent = boostIapPaymentComponent;
        LinearLayout linearLayout = this._payment_root;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            Intrinsics.m87502r("_payment_root");
            linearLayout = null;
        }
        View viewM53358k = boostIapPaymentComponent.m53358k(linearLayout);
        if (NullChecker.m81303a(viewM53358k)) {
            BoostIapPaymentComponent boostIapPaymentComponent2 = this.paymentComponent;
            if (boostIapPaymentComponent2 != null) {
                boostIapPaymentComponent2.m53343A(this.dialogStateAction, this.onCancel);
            }
            BoostIapPaymentComponent boostIapPaymentComponent3 = this.paymentComponent;
            if (boostIapPaymentComponent3 != null) {
                boostIapPaymentComponent3.m53346D(this.purchaseshowfrom);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            BoostIapPaymentComponent boostIapPaymentComponent4 = this.paymentComponent;
            if (boostIapPaymentComponent4 != null) {
                boostIapPaymentComponent4.m53347E(this.onPaymentSuccess);
            }
            LinearLayout linearLayout3 = this._payment_root;
            if (linearLayout3 == null) {
                Intrinsics.m87502r("_payment_root");
            } else {
                linearLayout2 = linearLayout3;
            }
            linearLayout2.addView(viewM53358k, layoutParams);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m212418u() {
        p83 p83Var = new p83(this.act);
        this.privilegeComponent = p83Var;
        Act act = this.act;
        FrameLayout frameLayout = this._privilege_root;
        FrameLayout frameLayout2 = null;
        if (frameLayout == null) {
            Intrinsics.m87502r("_privilege_root");
            frameLayout = null;
        }
        View viewM167782b = p83Var.m167782b(act, frameLayout);
        if (NullChecker.m81303a(viewM167782b)) {
            p83 p83Var2 = this.privilegeComponent;
            if (p83Var2 != null) {
                p83Var2.m167785e(this.dialogStateAction);
            }
            p83 p83Var3 = this.privilegeComponent;
            if (p83Var3 != null) {
                p83Var3.m167783c(this.act);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            FrameLayout frameLayout3 = this._privilege_root;
            if (frameLayout3 == null) {
                Intrinsics.m87502r("_privilege_root");
            } else {
                frameLayout2 = frameLayout3;
            }
            frameLayout2.addView(viewM167782b, layoutParams);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m212419v() {
        final ProductCategory productCategory = ProductCategory.get(ProductCategory.tttBoost);
        C22306c<List<Merchandise>> c22306cM30646z5 = CoreModule.f17545c.f19654j0.m30646z5(productCategory, false);
        final Function1 function1 = new Function1() { // from class: l.t2n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y2n.m212400e(this.f167520a, (List) obj);
            }
        };
        this.subscription = c22306cM30646z5.switchMap(new w9j() { // from class: l.u2n
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return y2n.m212401f(function1, obj);
            }
        }).observeOn(jo0.m142408a()).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.v2n
            @Override // p149l.e30
            public final void call(Object obj) {
                y2n.m212404i(this.f179587a, productCategory, (List) obj);
            }
        }, new e30() { // from class: l.w2n
            @Override // p149l.e30
            public final void call(Object obj) {
                y2n.m212397b(this.f184258a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w */
    public final void m212420w() {
        View viewM182559f;
        s83 s83Var = new s83(this.act);
        this.showcaseComponent = s83Var;
        s83Var.m182573t(new d30() { // from class: l.x2n
            @Override // p149l.d30
            public final void call() {
                y2n.m212399d(this.f190807a);
            }
        });
        s83 s83Var2 = this.showcaseComponent;
        LinearLayout linearLayout = null;
        if (s83Var2 != null) {
            LinearLayout linearLayout2 = this._showcase_root;
            if (linearLayout2 == null) {
                Intrinsics.m87502r("_showcase_root");
                linearLayout2 = null;
            }
            viewM182559f = s83Var2.m182559f(linearLayout2);
        } else {
            viewM182559f = null;
        }
        if (NullChecker.m81303a(viewM182559f)) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            LinearLayout linearLayout3 = this._showcase_root;
            if (linearLayout3 == null) {
                Intrinsics.m87502r("_showcase_root");
            } else {
                linearLayout = linearLayout3;
            }
            linearLayout.addView(viewM182559f, layoutParams);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m212421x(String from) {
        this.purchaseshowfrom = from;
    }

    /* JADX INFO: renamed from: y */
    public final void m212422y(@Nullable d30 onDismiss) {
        this.onDismiss = onDismiss;
    }

    /* JADX INFO: renamed from: z */
    public final void m212423z(@Nullable g30<PurchaseType, Act, String> onPaymentSuccess) {
        this.onPaymentSuccess = onPaymentSuccess;
    }

    /* JADX INFO: renamed from: l.y2n$b, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"Ll/y2n$b;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "ctx", "", "from", "Ll/g30;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "onPaymentSuccess", "Ll/d30;", "onDismiss", "Ll/y2n;", "a", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/g30;Ll/d30;)Ll/y2n;", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final y2n m212424a(@NotNull Act ctx, @NotNull String from, @Nullable g30<PurchaseType, Act, String> onPaymentSuccess, @Nullable d30 onDismiss) {
            ctx.getClass();
            from.getClass();
            y2n y2nVar = new y2n(ctx);
            y2nVar.m212421x(from);
            y2nVar.m212423z(onPaymentSuccess);
            y2nVar.m212422y(onDismiss);
            y2nVar.m212410A();
            return y2nVar;
        }

        public Companion() {
        }
    }
}
