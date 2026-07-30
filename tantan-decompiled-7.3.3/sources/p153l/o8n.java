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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 i2\u00020\u0001:\u0002*-B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\fJ\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\fJ\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\fJ%\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\"\u001a\u00020\b2\u001a\u0010!\u001a\u0016\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001f¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0004¢\u0006\u0004\b(\u0010\fR\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00108\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00107R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010H\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010GR*\u0010!\u001a\u0016\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010R\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bW\u0010QR\u0016\u0010Y\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010QR\u0014\u0010\\\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010[R\u0014\u0010_\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010^R\"\u0010d\u001a\u0010\u0012\f\u0012\n b*\u0004\u0018\u00010a0a0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010cR0\u0010h\u001a\u001e\u0012\f\u0012\n b*\u0004\u0018\u00010f0f\u0012\f\u0012\n b*\u0004\u0018\u00010:0:0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010g¨\u0006j"}, m88121d2 = {"Ll/o8n;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "from", "", BaseSei.f14624X, "(Ljava/lang/String;)V", "B", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "j", "(Landroid/view/View;)V", BLiveStormDanmakuGiftResourceType.f45294s, "u", "w", Constants.KEY_T, "p", ResourceDirection.f39656v, "q", "Lcom/p1/mobile/putong/core/data/ProductCategory;", "category", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "r", "(Lcom/p1/mobile/putong/core/data/ProductCategory;Ljava/util/List;)V", "Ll/a30;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "onPaymentSuccess", BaseSei.f14626Z, "(Ll/a30;)V", "Ll/x20;", "onDismiss", BaseSei.f14625Y, "(Ll/x20;)V", c4s.C_ZONE, "Ll/pej0;", "a", "Ll/pej0;", OMSTemplateType.dialog, "b", "Lcom/p1/mobile/android/app/Act;", "c", "Ljava/lang/String;", "purchaseshowfrom", "Ll/l4g0;", Constants.INAPP_DATA_TAG, "Ll/l4g0;", "statisticsPageHelper", "e", "Ll/x20;", "onCancel", "f", "", "g", "Z", "shouldDismissCallback", "Ll/tr5;", "h", "Ll/tr5;", "privilegeComponent", "Ll/wr5;", RXScreenCaptureService.KEY_INDEX, "Ll/wr5;", "showcaseComponent", "Ll/rr5;", "Ll/rr5;", "paymentComponent", "k", "Ll/a30;", "Ll/kcg0;", BLiveStormDanmakuGiftResourceType.f45292l, "Ll/kcg0;", "subscription", "Landroid/widget/LinearLayout;", "m", "Landroid/widget/LinearLayout;", "_root", "Landroid/widget/FrameLayout;", "n", "Landroid/widget/FrameLayout;", "_privilege_root", "o", "_showcase_root", "_payment_root", "Landroid/content/DialogInterface$OnDismissListener;", "Landroid/content/DialogInterface$OnDismissListener;", "onDismissListener", "Landroid/content/DialogInterface$OnCancelListener;", "Landroid/content/DialogInterface$OnCancelListener;", "onCancelListener", "Ll/y20;", "", "kotlin.jvm.PlatformType", "Ll/y20;", "dialogStateAction", "Ll/z20;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "Ll/z20;", "currentSelectPurchaseSectionAction", "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class o8n {

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
    public tr5 privilegeComponent;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public wr5 showcaseComponent;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public rr5 paymentComponent;

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

    /* JADX INFO: renamed from: l.o8n$a */
    @Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m88121d2 = {"Ll/o8n$a;", "Landroid/content/DialogInterface$OnDismissListener;", "Landroid/content/DialogInterface$OnCancelListener;", "Ll/o8n;", OMSTemplateType.dialog, "<init>", "(Ll/o8n;)V", "Landroid/content/DialogInterface;", "", "onDismiss", "(Landroid/content/DialogInterface;)V", "onCancel", "Ljava/lang/ref/WeakReference;", "a", "Ljava/lang/ref/WeakReference;", "dialogRef", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class DialogInterfaceOnDismissListenerC19053a implements DialogInterface.OnDismissListener, DialogInterface.OnCancelListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final WeakReference<o8n> dialogRef;

        public DialogInterfaceOnDismissListenerC19053a(@NotNull o8n o8nVar) {
            o8nVar.getClass();
            this.dialogRef = new WeakReference<>(o8nVar);
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(@NotNull DialogInterface dialog) {
            dialog.getClass();
            o8n o8nVar = this.dialogRef.get();
            if (NullChecker.m82486a(o8nVar)) {
                o8nVar.getClass();
                o8nVar.onCancelListener.onCancel(dialog);
            }
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(@NotNull DialogInterface dialog) {
            dialog.getClass();
            o8n o8nVar = this.dialogRef.get();
            if (NullChecker.m82486a(o8nVar)) {
                o8nVar.getClass();
                o8nVar.onDismissListener.onDismiss(dialog);
            }
        }
    }

    /* JADX INFO: renamed from: l.o8n$c */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"l/o8n$c", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "()V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class ViewTreeObserverOnGlobalLayoutListenerC19055c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior<FrameLayout> f145449a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ o8n f145450b;

        public ViewTreeObserverOnGlobalLayoutListenerC19055c(BottomSheetBehavior<FrameLayout> bottomSheetBehavior, o8n o8nVar) {
            this.f145449a = bottomSheetBehavior;
            this.f145450b = o8nVar;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f145449a;
            LinearLayout linearLayout = this.f145450b._root;
            LinearLayout linearLayout2 = null;
            if (linearLayout == null) {
                Intrinsics.m88391r("_root");
                linearLayout = null;
            }
            bottomSheetBehavior.setPeekHeight(linearLayout.getHeight());
            LinearLayout linearLayout3 = this.f145450b._root;
            if (linearLayout3 == null) {
                Intrinsics.m88391r("_root");
            } else {
                linearLayout2 = linearLayout3;
            }
            linearLayout2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: l.o8n$d */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C19056d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Merchandise merchandiseM54784s;
            Merchandise merchandiseM54784s2;
            C8928d c8928d = (C8928d) t2;
            C8928d.a aVarM54705d = c8928d.m54705d();
            Merchandise merchandiseM54784s3 = null;
            if (aVarM54705d == null || (merchandiseM54784s = aVarM54705d.m54784s()) == null) {
                C8928d.a aVarM54703b = c8928d.m54703b();
                merchandiseM54784s = aVarM54703b != null ? aVarM54703b.m54784s() : null;
            }
            Integer numValueOf = Integer.valueOf(merchandiseM54784s != null ? merchandiseM54784s.quantity : 0);
            C8928d c8928d2 = (C8928d) t;
            C8928d.a aVarM54705d2 = c8928d2.m54705d();
            if (aVarM54705d2 == null || (merchandiseM54784s2 = aVarM54705d2.m54784s()) == null) {
                C8928d.a aVarM54703b2 = c8928d2.m54703b();
                if (aVarM54703b2 != null) {
                    merchandiseM54784s3 = aVarM54703b2.m54784s();
                }
            } else {
                merchandiseM54784s3 = merchandiseM54784s2;
            }
            return go5.m131087d(numValueOf, Integer.valueOf(merchandiseM54784s3 != null ? merchandiseM54784s3.quantity : 0));
        }
    }

    public o8n(@NotNull Act act) {
        act.getClass();
        this.purchaseshowfrom = "";
        this.shouldDismissCallback = true;
        this.onDismissListener = new DialogInterface.OnDismissListener() { // from class: l.k8n
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                o8n.m166582d(this.f124395a, dialogInterface);
            }
        };
        this.onCancelListener = new DialogInterface.OnCancelListener() { // from class: l.l8n
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                o8n.m166587i(this.f130502a, dialogInterface);
            }
        };
        this.dialogStateAction = new y20() { // from class: l.m8n
            @Override // p153l.y20
            public final void call(Object obj) {
                o8n.m166584f(this.f135265a, ((Integer) obj).intValue());
            }
        };
        this.currentSelectPurchaseSectionAction = new z20() { // from class: l.n8n
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                o8n.m166585g(this.f140698a, (C8928d) obj, ((Boolean) obj2).booleanValue());
            }
        };
        this.act = act;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: A */
    public static final o8n m166578A(@NotNull Act act, @NotNull String str, @Nullable a30<PurchaseType, Act, String> a30Var, @Nullable x20 x20Var) {
        return INSTANCE.m166608a(act, str, a30Var, x20Var);
    }

    /* JADX INFO: renamed from: a */
    public static C22421c m166579a(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b */
    public static C22421c m166580b(o8n o8nVar, List list) {
        if (!list.isEmpty()) {
            return CoreModule.m30933P().m143405a().mo34507g5(o8nVar.act, list);
        }
        o8nVar.m166597q();
        return C22421c.empty();
    }

    /* JADX INFO: renamed from: c */
    public static void m166581c(o8n o8nVar, Throwable th) {
        o8nVar.m166597q();
    }

    /* JADX INFO: renamed from: d */
    public static void m166582d(o8n o8nVar, DialogInterface dialogInterface) {
        x20 x20Var;
        if (o8nVar.shouldDismissCallback && NullChecker.m82486a(o8nVar.onDismiss) && (x20Var = o8nVar.onDismiss) != null) {
            x20Var.call();
        }
        CoreModule.m30933P().m143405a().mo34311E9();
        w1e.m204401e(o8nVar.statisticsPageHelper);
        o8nVar.m166594C();
    }

    /* JADX INFO: renamed from: e */
    public static void m166583e(o8n o8nVar, ProductCategory productCategory, List list) {
        productCategory.getClass();
        list.getClass();
        o8nVar.m166598r(productCategory, list);
        o8nVar.m166596p();
    }

    /* JADX INFO: renamed from: f */
    public static void m166584f(o8n o8nVar, int i) {
        if (NullChecker.m82486a(o8nVar.dialog)) {
            if (i == -1) {
                pej0 pej0Var = o8nVar.dialog;
                if (pej0Var != null) {
                    pej0Var.hide();
                    return;
                }
                return;
            }
            if (i != 0) {
                if (i == 1) {
                    pej0 pej0Var2 = o8nVar.dialog;
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
                o8nVar.shouldDismissCallback = false;
            }
            pej0 pej0Var3 = o8nVar.dialog;
            if (pej0Var3 != null) {
                pej0Var3.m176562T();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m166585g(o8n o8nVar, C8928d c8928d, boolean z) {
        rr5 rr5Var;
        c8928d.getClass();
        if (!NullChecker.m82486a(o8nVar.paymentComponent) || (rr5Var = o8nVar.paymentComponent) == null) {
            return;
        }
        rr5Var.m182707q(c8928d);
    }

    /* JADX INFO: renamed from: h */
    public static void m166586h(o8n o8nVar) {
        rr5 rr5Var = o8nVar.paymentComponent;
        if (rr5Var != null) {
            rr5Var.m182695A();
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m166587i(o8n o8nVar, DialogInterface dialogInterface) {
        x20 x20Var;
        if (!NullChecker.m82486a(o8nVar.onCancel) || (x20Var = o8nVar.onCancel) == null) {
            return;
        }
        x20Var.call();
    }

    /* JADX INFO: renamed from: B */
    public final void m166593B() {
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
        View viewInflate = LayoutInflater.from(this.act).inflate(rec0.f162601s, (ViewGroup) null);
        viewInflate.getClass();
        m166595j(viewInflate);
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
        DialogInterfaceOnDismissListenerC19053a dialogInterfaceOnDismissListenerC19053a = new DialogInterfaceOnDismissListenerC19053a(this);
        pej0 pej0Var5 = this.dialog;
        if (pej0Var5 != null) {
            pej0Var5.setOnDismissListener(dialogInterfaceOnDismissListenerC19053a);
        }
        pej0 pej0Var6 = this.dialog;
        if (pej0Var6 != null) {
            pej0Var6.setOnCancelListener(dialogInterfaceOnDismissListenerC19053a);
        }
        this.statisticsPageHelper = w1e.m204399c("p_intl_compliment_iap_view", o8n.class.getName());
        m166599s();
        pej0 pej0Var7 = this.dialog;
        if (pej0Var7 != null) {
            pej0Var7.show();
        }
        m166602v();
        CoreModule.f18264c.f20297C0.m146425v4();
        w1e.m204402f(this.statisticsPageHelper);
    }

    /* JADX INFO: renamed from: C */
    public final void m166594C() {
        wr5 wr5Var;
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
        if (!NullChecker.m82486a(this.showcaseComponent) || (wr5Var = this.showcaseComponent) == null) {
            return;
        }
        wr5Var.m207569r();
    }

    /* JADX INFO: renamed from: j */
    public final void m166595j(View view) {
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
    public final void m166596p() {
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
                linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC19055c(bottomSheetBehaviorFrom, this));
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m166597q() {
        this.dialogStateAction.call(2);
    }

    /* JADX INFO: renamed from: r */
    public final void m166598r(ProductCategory category, List<? extends Merchandise> merchandises) {
        List<C8928d> listMo147671a = zry.m221275z(category).mo147671a(this.act, PurchaseType.TYPE_COMPLIMENT, category, merchandises);
        if (jyb.m147479J(listMo147671a)) {
            return;
        }
        listMo147671a.getClass();
        List<? extends C8928d> listSortedWith = CollectionsKt.sortedWith(listMo147671a, new C19056d());
        if (!listSortedWith.isEmpty() && NullChecker.m82487b(listSortedWith)) {
            int iM155681b = ls5.INSTANCE.m155681b(listSortedWith);
            int size = listSortedWith.size();
            int i = 0;
            while (i < size) {
                listSortedWith.get(i).m54723v(i == iM155681b);
                i++;
            }
            wr5 wr5Var = this.showcaseComponent;
            if (wr5Var != null) {
                wr5Var.m207570s(listSortedWith, this.currentSelectPurchaseSectionAction, this.dialogStateAction);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m166599s() {
        m166601u();
        m166603w();
        m166600t();
    }

    /* JADX INFO: renamed from: t */
    public final void m166600t() {
        rr5 rr5Var = new rr5(this.act);
        this.paymentComponent = rr5Var;
        LinearLayout linearLayout = this._payment_root;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            Intrinsics.m88391r("_payment_root");
            linearLayout = null;
        }
        View viewM182697g = rr5Var.m182697g(linearLayout);
        if (NullChecker.m82486a(viewM182697g)) {
            rr5 rr5Var2 = this.paymentComponent;
            if (rr5Var2 != null) {
                rr5Var2.m182708r(this.dialogStateAction, this.onCancel);
            }
            rr5 rr5Var3 = this.paymentComponent;
            if (rr5Var3 != null) {
                rr5Var3.m182711u(this.purchaseshowfrom);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            rr5 rr5Var4 = this.paymentComponent;
            if (rr5Var4 != null) {
                rr5Var4.m182712v(this.onPaymentSuccess);
            }
            LinearLayout linearLayout3 = this._payment_root;
            if (linearLayout3 == null) {
                Intrinsics.m88391r("_payment_root");
            } else {
                linearLayout2 = linearLayout3;
            }
            linearLayout2.addView(viewM182697g, layoutParams);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m166601u() {
        tr5 tr5Var = new tr5(this.act);
        this.privilegeComponent = tr5Var;
        Act act = this.act;
        FrameLayout frameLayout = this._privilege_root;
        FrameLayout frameLayout2 = null;
        if (frameLayout == null) {
            Intrinsics.m88391r("_privilege_root");
            frameLayout = null;
        }
        View viewM192406b = tr5Var.m192406b(act, frameLayout);
        if (NullChecker.m82486a(viewM192406b)) {
            tr5 tr5Var2 = this.privilegeComponent;
            if (tr5Var2 != null) {
                tr5Var2.m192409e(this.dialogStateAction);
            }
            tr5 tr5Var3 = this.privilegeComponent;
            if (tr5Var3 != null) {
                tr5Var3.m192407c(this.act);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            FrameLayout frameLayout3 = this._privilege_root;
            if (frameLayout3 == null) {
                Intrinsics.m88391r("_privilege_root");
            } else {
                frameLayout2 = frameLayout3;
            }
            frameLayout2.addView(viewM192406b, layoutParams);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m166602v() {
        final ProductCategory productCategory = ProductCategory.get(ProductCategory.tttCompliment);
        C22421c<List<Merchandise>> c22421cM31649z5 = CoreModule.f18264c.f20396j0.m31649z5(productCategory, false);
        final Function1 function1 = new Function1() { // from class: l.g8n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o8n.m166580b(this.f102700a, (List) obj);
            }
        };
        this.subscription = c22421cM31649z5.switchMap(new qcj() { // from class: l.h8n
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return o8n.m166579a(function1, obj);
            }
        }).observeOn(fo0.m126432a()).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.i8n
            @Override // p153l.y20
            public final void call(Object obj) {
                o8n.m166583e(this.f113360a, productCategory, (List) obj);
            }
        }, new y20() { // from class: l.j8n
            @Override // p153l.y20
            public final void call(Object obj) {
                o8n.m166581c(this.f118793a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w */
    public final void m166603w() {
        View viewM207557f;
        wr5 wr5Var = new wr5(this.act);
        this.showcaseComponent = wr5Var;
        wr5Var.m207571t(new x20() { // from class: l.f8n
            @Override // p153l.x20
            public final void call() {
                o8n.m166586h(this.f97749a);
            }
        });
        wr5 wr5Var2 = this.showcaseComponent;
        LinearLayout linearLayout = null;
        if (wr5Var2 != null) {
            LinearLayout linearLayout2 = this._showcase_root;
            if (linearLayout2 == null) {
                Intrinsics.m88391r("_showcase_root");
                linearLayout2 = null;
            }
            viewM207557f = wr5Var2.m207557f(linearLayout2);
        } else {
            viewM207557f = null;
        }
        if (NullChecker.m82486a(viewM207557f)) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            LinearLayout linearLayout3 = this._showcase_root;
            if (linearLayout3 == null) {
                Intrinsics.m88391r("_showcase_root");
            } else {
                linearLayout = linearLayout3;
            }
            linearLayout.addView(viewM207557f, layoutParams);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m166604x(String from) {
        this.purchaseshowfrom = from;
    }

    /* JADX INFO: renamed from: y */
    public final void m166605y(@Nullable x20 onDismiss) {
        this.onDismiss = onDismiss;
    }

    /* JADX INFO: renamed from: z */
    public final void m166606z(@Nullable a30<PurchaseType, Act, String> onPaymentSuccess) {
        this.onPaymentSuccess = onPaymentSuccess;
    }

    /* JADX INFO: renamed from: l.o8n$b, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Ll/o8n$b;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "ctx", "", "from", "Ll/a30;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "onPaymentSuccess", "Ll/x20;", "onDismiss", "Ll/o8n;", "a", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/a30;Ll/x20;)Ll/o8n;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ o8n m166607b(Companion companion, Act act, String str, a30 a30Var, x20 x20Var, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            if ((i & 4) != 0) {
                a30Var = null;
            }
            if ((i & 8) != 0) {
                x20Var = null;
            }
            return companion.m166608a(act, str, a30Var, x20Var);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final o8n m166608a(@NotNull Act ctx, @NotNull String from, @Nullable a30<PurchaseType, Act, String> onPaymentSuccess, @Nullable x20 onDismiss) {
            ctx.getClass();
            from.getClass();
            o8n o8nVar = new o8n(ctx);
            o8nVar.m166604x(from);
            o8nVar.m166606z(onPaymentSuccess);
            o8nVar.m166605y(onDismiss);
            o8nVar.m166593B();
            return o8nVar;
        }

        public Companion() {
        }
    }
}
