package p006l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.alifree.AliFreeClipLinearLayout;
import com.p000p1.mobile.putong.core.p004ui.purchase.mediator.C0213b;
import com.p000p1.mobile.putong.core.p004ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p000p1.mobile.putong.core.p004ui.view.VPagerInPurchaseDialog;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.PurchaseTabViewContainer;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.d30;
import l.d3c0;
import l.e30;
import l.g30;
import l.k6b0;
import l.m6c0;
import l.o7r;
import l.s4e;
import l.sab0;
import l.vwb;
import l.w660;
import l.xdl0;
import l.y7c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u00011B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u0013J\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010\u0019J\u0019\u0010\"\u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J-\u0010&\u001a\u00020\u000f2\u001c\u0010%\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010$H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\u000f2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010(H\u0002¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020\u000f2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010(H\u0002¢\u0006\u0004\b-\u0010+J\u001f\u0010/\u001a\u00020\u000f2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010(H\u0002¢\u0006\u0004\b/\u0010+J\r\u00100\u001a\u00020\u000f¢\u0006\u0004\b0\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010F\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010Z\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010Q\u001a\u0004\bX\u0010S\"\u0004\bY\u0010UR\u0016\u0010^\u001a\u00020[8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\\\u0010]R\u001e\u0010a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010`R\u0018\u0010e\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010`R,\u0010%\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010l\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010o\u001a\u00020m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010nR\u0016\u0010r\u001a\u00020p8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bR\u0010qR\u0016\u0010s\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u00100R\"\u0010u\u001a\u0010\u0012\f\u0012\n t*\u0004\u0018\u00010\u00160\u00160(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010`¨\u0006v"}, d2 = {"Ll/j6b0;", "", "Lcom/p1/mobile/android/app/Act;", "act", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseTypes", "Lcom/p1/mobile/putong/core/data/Privilege;", "firstPrivileges", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "Landroid/view/View;", "view", "", "f", "(Landroid/view/View;)V", "x", "()V", "w", "y", "", "position", "A", "(I)V", "B", "q", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "z", "selectTabIndex", "C", "Ll/d30;", "dismiss", "D", "(Ll/d30;)V", "Ll/g30;", "onPaymentSuccess", "G", "(Ll/g30;)V", "Ll/e30;", "onTouchOutsideListener", "H", "(Ll/e30;)V", "onKeyBackCallback", "E", "onNegativeClick", "F", "I", "a", "Lcom/p1/mobile/android/app/Act;", "b", "Ljava/util/List;", "c", "d", "Ljava/lang/String;", "Lcom/p1/mobile/putong/core/ui/alifree/AliFreeClipLinearLayout;", "e", "Lcom/p1/mobile/putong/core/ui/alifree/AliFreeClipLinearLayout;", "t", "()Lcom/p1/mobile/putong/core/ui/alifree/AliFreeClipLinearLayout;", "set_content", "(Lcom/p1/mobile/putong/core/ui/alifree/AliFreeClipLinearLayout;)V", "_content", "Lcom/p1/mobile/putong/core/ui/purchase/PurchaseTabViewContainer;", "Lcom/p1/mobile/putong/core/ui/purchase/PurchaseTabViewContainer;", "v", "()Lcom/p1/mobile/putong/core/ui/purchase/PurchaseTabViewContainer;", "set_tabs_container", "(Lcom/p1/mobile/putong/core/ui/purchase/PurchaseTabViewContainer;)V", "_tabs_container", "Lcom/p1/mobile/putong/core/ui/view/VPagerInPurchaseDialog;", "g", "Lcom/p1/mobile/putong/core/ui/view/VPagerInPurchaseDialog;", "u", "()Lcom/p1/mobile/putong/core/ui/view/VPagerInPurchaseDialog;", "set_pager", "(Lcom/p1/mobile/putong/core/ui/view/VPagerInPurchaseDialog;)V", "_pager", "Landroid/widget/FrameLayout;", "h", "Landroid/widget/FrameLayout;", "r", "()Landroid/widget/FrameLayout;", "set_agreement_container_1", "(Landroid/widget/FrameLayout;)V", "_agreement_container_1", "i", "s", "set_agreement_container_2", "_agreement_container_2", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/b;", "j", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/b;", "mediatorsManager", "k", "Ll/e30;", "onTouchOutsideCallback", "l", "m", "Ll/d30;", "onDismiss", "n", "o", "Ll/g30;", "Lcom/p1/mobile/android/app/Dialog;", "p", "Lcom/p1/mobile/android/app/Dialog;", "dialog", "", "Z", "shouldDismissCallback", "Ll/y5b0;", "Ll/y5b0;", "pagerAdapter", "initSelectTabIndex", "kotlin.jvm.PlatformType", "dialogStateAction", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j6b0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<PurchaseType> purchaseTypes;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final List<Privilege> firstPrivileges;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final String from;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public AliFreeClipLinearLayout _content;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public PurchaseTabViewContainer _tabs_container;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VPagerInPurchaseDialog _pager;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public FrameLayout _agreement_container_1;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public FrameLayout _agreement_container_2;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public C0213b mediatorsManager;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public e30<PurchaseType> onTouchOutsideCallback;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public e30<PurchaseType> onKeyBackCallback;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public d30 onDismiss;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public e30<PurchaseType> onNegativeClick;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public g30<PurchaseType, Act, String> onPaymentSuccess;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public Dialog dialog;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public boolean shouldDismissCallback;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public y5b0 pagerAdapter;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public int initSelectTabIndex;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final e30<Integer> dialogStateAction;

    /* JADX INFO: renamed from: l.j6b0$a */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0017\u001a\u00020\u00002\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u00002\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\u00002\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0019¢\u0006\u0004\b\u001e\u0010\u001cJ\u001d\u0010 \u001a\u00020\u00002\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0019¢\u0006\u0004\b \u0010\u001cJ\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010$R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010%R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010%R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u0016\u0010*\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010)R,\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010+R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010-¨\u00061"}, d2 = {"Ll/j6b0$a;", "", "Lcom/p1/mobile/android/app/Act;", "act", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseTypes", "Lcom/p1/mobile/putong/core/data/Privilege;", "firstPrivileges", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "Ll/d30;", "dismiss", "b", "(Ll/d30;)Ll/j6b0$a;", "", "selectTabIndex", "a", "(I)Ll/j6b0$a;", "Ll/g30;", "onPaymentSuccess", "e", "(Ll/g30;)Ll/j6b0$a;", "Ll/e30;", "onKeyBackCallback", "c", "(Ll/e30;)Ll/j6b0$a;", "onCloseClick", "d", "onTouchOutsideListener", "f", "Ll/j6b0;", "g", "()Ll/j6b0;", "Lcom/p1/mobile/android/app/Act;", "Ljava/util/List;", "Ljava/lang/String;", "Ll/d30;", "onDismiss", "I", "initSelectTabIndex", "Ll/g30;", "h", "Ll/e30;", "onNegativeClick", "i", "j", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0873a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Act act;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final List<PurchaseType> purchaseTypes;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final List<Privilege> firstPrivileges;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public String from;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public d30 onDismiss;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public int initSelectTabIndex;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public g30<PurchaseType, Act, String> onPaymentSuccess;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public e30<PurchaseType> onNegativeClick;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public e30<PurchaseType> onKeyBackCallback;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @Nullable
        public e30<PurchaseType> onTouchOutsideListener;

        public C0873a(@NotNull Act act, @NotNull List<? extends PurchaseType> list, @Nullable List<? extends Privilege> list2, @Nullable String str) {
            act.getClass();
            list.getClass();
            this.act = act;
            this.purchaseTypes = list;
            this.firstPrivileges = list2;
            this.from = str;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C0873a m17318a(int selectTabIndex) {
            this.initSelectTabIndex = selectTabIndex;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C0873a m17319b(@Nullable d30 dismiss) {
            this.onDismiss = dismiss;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final C0873a m17320c(@Nullable e30<PurchaseType> onKeyBackCallback) {
            this.onKeyBackCallback = onKeyBackCallback;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final C0873a m17321d(@Nullable e30<PurchaseType> onCloseClick) {
            this.onNegativeClick = onCloseClick;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final C0873a m17322e(@Nullable g30<PurchaseType, Act, String> onPaymentSuccess) {
            this.onPaymentSuccess = onPaymentSuccess;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final C0873a m17323f(@Nullable e30<PurchaseType> onTouchOutsideListener) {
            this.onTouchOutsideListener = onTouchOutsideListener;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final j6b0 m17324g() {
            j6b0 j6b0Var = new j6b0(this.act, this.purchaseTypes, this.firstPrivileges, this.from);
            j6b0Var.m17301D(this.onDismiss);
            j6b0Var.m17300C(this.initSelectTabIndex);
            j6b0Var.m17304G(this.onPaymentSuccess);
            j6b0Var.m17302E(this.onKeyBackCallback);
            j6b0Var.m17303F(this.onNegativeClick);
            j6b0Var.m17305H(this.onTouchOutsideListener);
            j6b0Var.m17306I();
            return j6b0Var;
        }
    }

    /* JADX INFO: renamed from: l.j6b0$b */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"l/j6b0$b", "Landroidx/viewpager/widget/ViewPager$m;", "", "position", "", "positionOffset", "positionOffsetPixels", "", "onPageScrolled", "(IFI)V", "onPageSelected", "(I)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0874b extends ViewPager.m {
        public C0874b() {
        }

        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            j6b0.this.m17313v().f(position, positionOffset);
        }

        public void onPageSelected(int position) {
            j6b0.this.m17313v().h((vwb.J(j6b0.this.purchaseTypes) || position >= j6b0.this.purchaseTypes.size()) ? false : sab0.i((PurchaseType) j6b0.this.purchaseTypes.get(position)));
            j6b0.this.m17299B(position);
        }
    }

    /* JADX INFO: renamed from: l.j6b0$c */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"l/j6b0$c", "Lcom/p1/mobile/putong/core/ui/purchase/PurchaseTabViewContainer$a;", "", "position", "", "b", "(I)V", "a", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0875c implements PurchaseTabViewContainer.a {
        public C0875c() {
        }

        /* JADX INFO: renamed from: a */
        public void m17325a(int position) {
            y5b0 y5b0Var = j6b0.this.pagerAdapter;
            if (y5b0Var == null) {
                Intrinsics.r("pagerAdapter");
                y5b0Var = null;
            }
            y5b0Var.m28069q(position);
        }

        /* JADX INFO: renamed from: b */
        public void m17326b(int position) {
            j6b0.this.m17312u().setCurrentItem(position);
            y5b0 y5b0Var = j6b0.this.pagerAdapter;
            if (y5b0Var == null) {
                Intrinsics.r("pagerAdapter");
                y5b0Var = null;
            }
            y5b0Var.m28070r(position);
            j6b0.this.m17298A(position);
        }
    }

    public j6b0(@NotNull Act act, @NotNull List<? extends PurchaseType> list, @Nullable List<? extends Privilege> list2, @Nullable String str) {
        act.getClass();
        list.getClass();
        this.act = act;
        this.purchaseTypes = list;
        this.firstPrivileges = list2;
        this.from = str;
        this.shouldDismissCallback = true;
        this.dialogStateAction = new e30() { // from class: l.i6b0
            public final void call(Object obj) {
                j6b0.m17283a(this.f14238a, ((Integer) obj).intValue());
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static void m17283a(j6b0 j6b0Var, int i) {
        if (NullChecker.a(j6b0Var.dialog)) {
            if (i == -1) {
                Dialog dialog = j6b0Var.dialog;
                if (dialog != null) {
                    dialog.hide();
                    return;
                }
                return;
            }
            if (i != 0) {
                if (i == 1) {
                    Dialog dialog2 = j6b0Var.dialog;
                    if (dialog2 != null) {
                        dialog2.show();
                        return;
                    }
                    return;
                }
                if (i != 2) {
                    return;
                }
            }
            if (i == 2) {
                j6b0Var.shouldDismissCallback = false;
            }
            Dialog dialog3 = j6b0Var.dialog;
            if (dialog3 != null) {
                dialog3.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m17284b(j6b0 j6b0Var, Dialog dialog) {
        e30<PurchaseType> e30Var = j6b0Var.onTouchOutsideCallback;
        if (e30Var != null) {
            e30Var.call(j6b0Var.m17308q());
        }
        j6b0Var.dialogStateAction.call(0);
    }

    /* JADX INFO: renamed from: c */
    public static void m17285c(j6b0 j6b0Var, DialogInterface dialogInterface) {
        d30 d30Var;
        CoreModule.m1854P().m11706a().m5245E9();
        y5b0 y5b0Var = j6b0Var.pagerAdapter;
        if (y5b0Var == null) {
            Intrinsics.r("pagerAdapter");
            y5b0Var = null;
        }
        y5b0Var.m28069q(j6b0Var.m17312u().getCurrentItem());
        j6b0Var.m17317z();
        if (j6b0Var.shouldDismissCallback && (d30Var = j6b0Var.onDismiss) != null) {
            d30Var.call();
        }
        Dialog dialog = j6b0Var.dialog;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m17286d(j6b0 j6b0Var, DialogInterface dialogInterface) {
        j6b0Var.m17317z();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m17287e(j6b0 j6b0Var, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (keyEvent.getAction() == 0 && i == 4) {
            e30<PurchaseType> e30Var = j6b0Var.onKeyBackCallback;
            if (e30Var != null) {
                e30Var.call(j6b0Var.m17308q());
            }
            j6b0Var.dialogStateAction.call(0);
        }
        return false;
    }

    /* JADX INFO: renamed from: A */
    public final void m17298A(int position) {
        xdl0.M(m17309r(), position == 0);
        xdl0.M(m17310s(), position != 0);
    }

    /* JADX INFO: renamed from: B */
    public final void m17299B(int position) {
        int i;
        if (vwb.J(this.purchaseTypes) || position >= this.purchaseTypes.size()) {
            i = d3c0.I9;
        } else {
            PurchaseType purchaseType = this.purchaseTypes.get(position);
            if (sab0.i(purchaseType)) {
                i = d3c0.S4;
            } else {
                i = (sab0.q(purchaseType) || sab0.m(purchaseType)) ? d3c0.J9 : d3c0.I9;
            }
        }
        m17311t().setBackgroundResource(i);
    }

    /* JADX INFO: renamed from: C */
    public final void m17300C(int selectTabIndex) {
        this.initSelectTabIndex = selectTabIndex;
    }

    /* JADX INFO: renamed from: D */
    public final void m17301D(d30 dismiss) {
        this.onDismiss = dismiss;
    }

    /* JADX INFO: renamed from: E */
    public final void m17302E(e30<PurchaseType> onKeyBackCallback) {
        this.onKeyBackCallback = onKeyBackCallback;
    }

    /* JADX INFO: renamed from: F */
    public final void m17303F(e30<PurchaseType> onNegativeClick) {
        this.onNegativeClick = onNegativeClick;
    }

    /* JADX INFO: renamed from: G */
    public final void m17304G(g30<PurchaseType, Act, String> onPaymentSuccess) {
        this.onPaymentSuccess = onPaymentSuccess;
    }

    /* JADX INFO: renamed from: H */
    public final void m17305H(e30<PurchaseType> onTouchOutsideListener) {
        this.onTouchOutsideCallback = onTouchOutsideListener;
    }

    /* JADX INFO: renamed from: I */
    public final void m17306I() {
        if (this.act.isFinishing()) {
            return;
        }
        m17315x();
        m17314w();
        m17316y();
    }

    /* JADX INFO: renamed from: f */
    public final void m17307f(View view) {
        k6b0.a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public final PurchaseType m17308q() {
        return this.purchaseTypes.get(m17312u().getCurrentItem());
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final FrameLayout m17309r() {
        FrameLayout frameLayout = this._agreement_container_1;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_agreement_container_1");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final FrameLayout m17310s() {
        FrameLayout frameLayout = this._agreement_container_2;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_agreement_container_2");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final AliFreeClipLinearLayout m17311t() {
        AliFreeClipLinearLayout aliFreeClipLinearLayout = this._content;
        if (aliFreeClipLinearLayout != null) {
            return aliFreeClipLinearLayout;
        }
        Intrinsics.r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final VPagerInPurchaseDialog m17312u() {
        VPagerInPurchaseDialog vPagerInPurchaseDialog = this._pager;
        if (vPagerInPurchaseDialog != null) {
            return vPagerInPurchaseDialog;
        }
        Intrinsics.r("_pager");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final PurchaseTabViewContainer m17313v() {
        PurchaseTabViewContainer purchaseTabViewContainer = this._tabs_container;
        if (purchaseTabViewContainer != null) {
            return purchaseTabViewContainer;
        }
        Intrinsics.r("_tabs_container");
        return null;
    }

    /* JADX INFO: renamed from: w */
    public final void m17314w() {
        View viewInflate = o7r.a(this.act).inflate(m6c0.C1, (ViewGroup) null);
        viewInflate.getClass();
        m17307f(viewInflate);
        Dialog dialogZ = this.act.dialog().P(viewInflate, false).L(y7c0.i).v().A(new DialogInterface.OnCancelListener() { // from class: l.e6b0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                j6b0.m17286d(this.f10777a, dialogInterface);
            }
        }).V(new DialogInterface.OnDismissListener() { // from class: l.f6b0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                j6b0.m17285c(this.f11679a, dialogInterface);
            }
        }).i0(new DialogInterface.OnKeyListener() { // from class: l.g6b0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return j6b0.m17287e(this.f13067a, dialogInterface, i, keyEvent);
            }
        }).K0(new Dialog.i() { // from class: l.h6b0
            /* JADX INFO: renamed from: a */
            public final void m16062a(Dialog dialog) {
                j6b0.m17284b(this.f13683a, dialog);
            }
        }).y0(s4e.a).z();
        this.dialog = dialogZ;
        if (dialogZ != null) {
            dialogZ.show();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m17315x() {
        C0213b c0213b = new C0213b(this.act, this.purchaseTypes, this.from);
        this.mediatorsManager = c0213b;
        c0213b.m7382b();
        C0213b c0213b2 = this.mediatorsManager;
        if (c0213b2 == null) {
            Intrinsics.r("mediatorsManager");
            c0213b2 = null;
        }
        c0213b2.m7384d();
    }

    /* JADX INFO: renamed from: y */
    public final void m17316y() {
        ProductCategory productCategory = this.purchaseTypes.get(this.initSelectTabIndex).productCategory();
        productCategory.getClass();
        y5b0 y5b0Var = new y5b0(this.act, this.purchaseTypes, this.firstPrivileges, this.from, new x5b0(productCategory, PurchaseTrackPageType.pop_two, this.from));
        this.pagerAdapter = y5b0Var;
        C0213b c0213b = this.mediatorsManager;
        w660 w660Var = null;
        if (c0213b == null) {
            Intrinsics.r("mediatorsManager");
            c0213b = null;
        }
        y5b0Var.m28075w(c0213b);
        y5b0Var.m28074v(this.initSelectTabIndex);
        y5b0Var.m28077y(this.onPaymentSuccess);
        y5b0Var.m28076x(this.onNegativeClick);
        y5b0Var.m28073u(this.dialogStateAction);
        ArrayList arrayListF0 = vwb.f0(new FrameLayout[]{m17309r(), m17310s()});
        arrayListF0.getClass();
        y5b0Var.m28072t(arrayListF0);
        VPagerInPurchaseDialog vPagerInPurchaseDialogM17312u = m17312u();
        w660 w660Var2 = this.pagerAdapter;
        if (w660Var2 == null) {
            Intrinsics.r("pagerAdapter");
        } else {
            w660Var = w660Var2;
        }
        vPagerInPurchaseDialogM17312u.setAdapter(w660Var);
        vPagerInPurchaseDialogM17312u.setOffscreenPageLimit(this.purchaseTypes.size());
        vPagerInPurchaseDialogM17312u.d(new C0874b());
        PurchaseTabViewContainer purchaseTabViewContainerM17313v = m17313v();
        purchaseTabViewContainerM17313v.c(this.purchaseTypes);
        purchaseTabViewContainerM17313v.b(new C0875c());
        purchaseTabViewContainerM17313v.setSelectTabPosition(this.initSelectTabIndex);
        m17299B(this.initSelectTabIndex);
    }

    /* JADX INFO: renamed from: z */
    public final void m17317z() {
        y5b0 y5b0Var = this.pagerAdapter;
        if (y5b0Var == null) {
            Intrinsics.r("pagerAdapter");
            y5b0Var = null;
        }
        y5b0Var.m28071s();
    }
}
