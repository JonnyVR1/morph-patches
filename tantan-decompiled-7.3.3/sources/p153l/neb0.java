package p153l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.alifree.AliFreeClipLinearLayout;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.core.p058ui.purchase.PurchaseTabViewContainer;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.C8940b;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p051p1.mobile.putong.core.p058ui.view.VPagerInPurchaseDialog;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u00011B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u0013J\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010\u0019J\u0019\u0010\"\u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J-\u0010&\u001a\u00020\u000f2\u001c\u0010%\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010$H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\u000f2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010(H\u0002¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020\u000f2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010(H\u0002¢\u0006\u0004\b-\u0010+J\u001f\u0010/\u001a\u00020\u000f2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010(H\u0002¢\u0006\u0004\b/\u0010+J\r\u00100\u001a\u00020\u000f¢\u0006\u0004\b0\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010F\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010Z\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010Q\u001a\u0004\bX\u0010S\"\u0004\bY\u0010UR\u0016\u0010^\u001a\u00020[8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\\\u0010]R\u001e\u0010a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010`R\u0018\u0010e\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010`R,\u0010%\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010l\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010o\u001a\u00020m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010nR\u0016\u0010r\u001a\u00020p8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bR\u0010qR\u0016\u0010s\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u00100R\"\u0010u\u001a\u0010\u0012\f\u0012\n t*\u0004\u0018\u00010\u00160\u00160(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010`¨\u0006v"}, m88121d2 = {"Ll/neb0;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseTypes", "Lcom/p1/mobile/putong/core/data/Privilege;", "firstPrivileges", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "f", "(Landroid/view/View;)V", BaseSei.f14624X, "()V", "w", BaseSei.f14625Y, "", "position", "A", "(I)V", "B", "q", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", BaseSei.f14626Z, "selectTabIndex", c4s.C_ZONE, "Ll/x20;", SysnotifListener.ACTION_DISMISS, "D", "(Ll/x20;)V", "Ll/a30;", "onPaymentSuccess", "G", "(Ll/a30;)V", "Ll/y20;", "onTouchOutsideListener", "H", "(Ll/y20;)V", "onKeyBackCallback", "E", "onNegativeClick", "F", "I", "a", "Lcom/p1/mobile/android/app/Act;", "b", "Ljava/util/List;", "c", Constants.INAPP_DATA_TAG, "Ljava/lang/String;", "Lcom/p1/mobile/putong/core/ui/alifree/AliFreeClipLinearLayout;", "e", "Lcom/p1/mobile/putong/core/ui/alifree/AliFreeClipLinearLayout;", Constants.KEY_T, "()Lcom/p1/mobile/putong/core/ui/alifree/AliFreeClipLinearLayout;", "set_content", "(Lcom/p1/mobile/putong/core/ui/alifree/AliFreeClipLinearLayout;)V", "_content", "Lcom/p1/mobile/putong/core/ui/purchase/PurchaseTabViewContainer;", "Lcom/p1/mobile/putong/core/ui/purchase/PurchaseTabViewContainer;", ResourceDirection.f39656v, "()Lcom/p1/mobile/putong/core/ui/purchase/PurchaseTabViewContainer;", "set_tabs_container", "(Lcom/p1/mobile/putong/core/ui/purchase/PurchaseTabViewContainer;)V", "_tabs_container", "Lcom/p1/mobile/putong/core/ui/view/VPagerInPurchaseDialog;", "g", "Lcom/p1/mobile/putong/core/ui/view/VPagerInPurchaseDialog;", "u", "()Lcom/p1/mobile/putong/core/ui/view/VPagerInPurchaseDialog;", "set_pager", "(Lcom/p1/mobile/putong/core/ui/view/VPagerInPurchaseDialog;)V", "_pager", "Landroid/widget/FrameLayout;", "h", "Landroid/widget/FrameLayout;", "r", "()Landroid/widget/FrameLayout;", "set_agreement_container_1", "(Landroid/widget/FrameLayout;)V", "_agreement_container_1", RXScreenCaptureService.KEY_INDEX, BLiveStormDanmakuGiftResourceType.f45294s, "set_agreement_container_2", "_agreement_container_2", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/b;", "j", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/b;", "mediatorsManager", "k", "Ll/y20;", "onTouchOutsideCallback", BLiveStormDanmakuGiftResourceType.f45292l, "m", "Ll/x20;", "onDismiss", "n", "o", "Ll/a30;", "Lcom/p1/mobile/android/app/Dialog;", "p", "Lcom/p1/mobile/android/app/Dialog;", OMSTemplateType.dialog, "", "Z", "shouldDismissCallback", "Ll/ceb0;", "Ll/ceb0;", "pagerAdapter", "initSelectTabIndex", "kotlin.jvm.PlatformType", "dialogStateAction", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class neb0 {

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
    public C8940b mediatorsManager;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public y20<PurchaseType> onTouchOutsideCallback;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public y20<PurchaseType> onKeyBackCallback;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public x20 onDismiss;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public y20<PurchaseType> onNegativeClick;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public a30<PurchaseType, Act, String> onPaymentSuccess;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public Dialog dialog;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public boolean shouldDismissCallback;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public ceb0 pagerAdapter;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public int initSelectTabIndex;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final y20<Integer> dialogStateAction;

    /* JADX INFO: renamed from: l.neb0$a */
    @Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0017\u001a\u00020\u00002\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u00002\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\u00002\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0019¢\u0006\u0004\b\u001e\u0010\u001cJ\u001d\u0010 \u001a\u00020\u00002\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0019¢\u0006\u0004\b \u0010\u001cJ\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010$R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010%R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010%R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u0016\u0010*\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010)R,\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010+R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010-¨\u00061"}, m88121d2 = {"Ll/neb0$a;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseTypes", "Lcom/p1/mobile/putong/core/data/Privilege;", "firstPrivileges", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "Ll/x20;", SysnotifListener.ACTION_DISMISS, "b", "(Ll/x20;)Ll/neb0$a;", "", "selectTabIndex", "a", "(I)Ll/neb0$a;", "Ll/a30;", "onPaymentSuccess", "e", "(Ll/a30;)Ll/neb0$a;", "Ll/y20;", "onKeyBackCallback", "c", "(Ll/y20;)Ll/neb0$a;", "onCloseClick", Constants.INAPP_DATA_TAG, "onTouchOutsideListener", "f", "Ll/neb0;", "g", "()Ll/neb0;", "Lcom/p1/mobile/android/app/Act;", "Ljava/util/List;", "Ljava/lang/String;", "Ll/x20;", "onDismiss", "I", "initSelectTabIndex", "Ll/a30;", "h", "Ll/y20;", "onNegativeClick", RXScreenCaptureService.KEY_INDEX, "j", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C18861a {

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
        public x20 onDismiss;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public int initSelectTabIndex;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public a30<PurchaseType, Act, String> onPaymentSuccess;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public y20<PurchaseType> onNegativeClick;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public y20<PurchaseType> onKeyBackCallback;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @Nullable
        public y20<PurchaseType> onTouchOutsideListener;

        /* JADX WARN: Multi-variable type inference failed */
        public C18861a(@NotNull Act act, @NotNull List<? extends PurchaseType> list, @Nullable List<? extends Privilege> list2, @Nullable String str) {
            act.getClass();
            list.getClass();
            this.act = act;
            this.purchaseTypes = list;
            this.firstPrivileges = list2;
            this.from = str;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C18861a m162852a(int selectTabIndex) {
            this.initSelectTabIndex = selectTabIndex;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C18861a m162853b(@Nullable x20 dismiss) {
            this.onDismiss = dismiss;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final C18861a m162854c(@Nullable y20<PurchaseType> onKeyBackCallback) {
            this.onKeyBackCallback = onKeyBackCallback;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final C18861a m162855d(@Nullable y20<PurchaseType> onCloseClick) {
            this.onNegativeClick = onCloseClick;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final C18861a m162856e(@Nullable a30<PurchaseType, Act, String> onPaymentSuccess) {
            this.onPaymentSuccess = onPaymentSuccess;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final C18861a m162857f(@Nullable y20<PurchaseType> onTouchOutsideListener) {
            this.onTouchOutsideListener = onTouchOutsideListener;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final neb0 m162858g() {
            neb0 neb0Var = new neb0(this.act, this.purchaseTypes, this.firstPrivileges, this.from);
            neb0Var.m162835D(this.onDismiss);
            neb0Var.m162834C(this.initSelectTabIndex);
            neb0Var.m162838G(this.onPaymentSuccess);
            neb0Var.m162836E(this.onKeyBackCallback);
            neb0Var.m162837F(this.onNegativeClick);
            neb0Var.m162839H(this.onTouchOutsideListener);
            neb0Var.m162840I();
            return neb0Var;
        }
    }

    /* JADX INFO: renamed from: l.neb0$b */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"l/neb0$b", "Landroidx/viewpager/widget/ViewPager$m;", "", "position", "", "positionOffset", "positionOffsetPixels", "", "onPageScrolled", "(IFI)V", "onPageSelected", "(I)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C18862b extends ViewPager.C0721m {
        public C18862b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.C0721m, androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            neb0.this.m162847v().m54308f(position, positionOffset);
        }

        @Override // androidx.viewpager.widget.ViewPager.C0721m, androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int position) {
            neb0.this.m162847v().m54310h((jyb.m147479J(neb0.this.purchaseTypes) || position >= neb0.this.purchaseTypes.size()) ? false : wib0.m206565i((PurchaseType) neb0.this.purchaseTypes.get(position)));
            neb0.this.m162833B(position);
        }
    }

    /* JADX INFO: renamed from: l.neb0$c */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m88121d2 = {"l/neb0$c", "Lcom/p1/mobile/putong/core/ui/purchase/PurchaseTabViewContainer$a;", "", "position", "", "b", "(I)V", "a", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C18863c implements PurchaseTabViewContainer.InterfaceC8919a {
        public C18863c() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.PurchaseTabViewContainer.InterfaceC8919a
        /* JADX INFO: renamed from: a */
        public void mo54312a(int position) {
            ceb0 ceb0Var = neb0.this.pagerAdapter;
            if (ceb0Var == null) {
                Intrinsics.m88391r("pagerAdapter");
                ceb0Var = null;
            }
            ceb0Var.m109344q(position);
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.PurchaseTabViewContainer.InterfaceC8919a
        /* JADX INFO: renamed from: b */
        public void mo54313b(int position) {
            neb0.this.m162846u().setCurrentItem(position);
            ceb0 ceb0Var = neb0.this.pagerAdapter;
            if (ceb0Var == null) {
                Intrinsics.m88391r("pagerAdapter");
                ceb0Var = null;
            }
            ceb0Var.m109345r(position);
            neb0.this.m162832A(position);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public neb0(@NotNull Act act, @NotNull List<? extends PurchaseType> list, @Nullable List<? extends Privilege> list2, @Nullable String str) {
        act.getClass();
        list.getClass();
        this.act = act;
        this.purchaseTypes = list;
        this.firstPrivileges = list2;
        this.from = str;
        this.shouldDismissCallback = true;
        this.dialogStateAction = new y20() { // from class: l.meb0
            @Override // p153l.y20
            public final void call(Object obj) {
                neb0.m162817a(this.f136455a, ((Integer) obj).intValue());
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static void m162817a(neb0 neb0Var, int i) {
        if (NullChecker.m82486a(neb0Var.dialog)) {
            if (i == -1) {
                Dialog dialog = neb0Var.dialog;
                if (dialog != null) {
                    dialog.hide();
                    return;
                }
                return;
            }
            if (i != 0) {
                if (i == 1) {
                    Dialog dialog2 = neb0Var.dialog;
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
                neb0Var.shouldDismissCallback = false;
            }
            Dialog dialog3 = neb0Var.dialog;
            if (dialog3 != null) {
                dialog3.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m162818b(neb0 neb0Var, Dialog dialog) {
        y20<PurchaseType> y20Var = neb0Var.onTouchOutsideCallback;
        if (y20Var != null) {
            y20Var.call(neb0Var.m162842q());
        }
        neb0Var.dialogStateAction.call(0);
    }

    /* JADX INFO: renamed from: c */
    public static void m162819c(neb0 neb0Var, DialogInterface dialogInterface) {
        x20 x20Var;
        CoreModule.m30933P().m143405a().mo34311E9();
        ceb0 ceb0Var = neb0Var.pagerAdapter;
        if (ceb0Var == null) {
            Intrinsics.m88391r("pagerAdapter");
            ceb0Var = null;
        }
        ceb0Var.m109344q(neb0Var.m162846u().getCurrentItem());
        neb0Var.m162851z();
        if (neb0Var.shouldDismissCallback && (x20Var = neb0Var.onDismiss) != null) {
            x20Var.call();
        }
        Dialog dialog = neb0Var.dialog;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m162820d(neb0 neb0Var, DialogInterface dialogInterface) {
        neb0Var.m162851z();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m162821e(neb0 neb0Var, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (keyEvent.getAction() == 0 && i == 4) {
            y20<PurchaseType> y20Var = neb0Var.onKeyBackCallback;
            if (y20Var != null) {
                y20Var.call(neb0Var.m162842q());
            }
            neb0Var.dialogStateAction.call(0);
        }
        return false;
    }

    /* JADX INFO: renamed from: A */
    public final void m162832A(int position) {
        bnl0.m105524M(m162843r(), position == 0);
        bnl0.m105524M(m162844s(), position != 0);
    }

    /* JADX INFO: renamed from: B */
    public final void m162833B(int position) {
        int i;
        if (jyb.m147479J(this.purchaseTypes) || position >= this.purchaseTypes.size()) {
            i = jbc0.f119264I9;
        } else {
            PurchaseType purchaseType = this.purchaseTypes.get(position);
            if (wib0.m206565i(purchaseType)) {
                i = jbc0.f119397S4;
            } else {
                i = (wib0.m206573q(purchaseType) || wib0.m206569m(purchaseType)) ? jbc0.f119278J9 : jbc0.f119264I9;
            }
        }
        m162845t().setBackgroundResource(i);
    }

    /* JADX INFO: renamed from: C */
    public final void m162834C(int selectTabIndex) {
        this.initSelectTabIndex = selectTabIndex;
    }

    /* JADX INFO: renamed from: D */
    public final void m162835D(x20 dismiss) {
        this.onDismiss = dismiss;
    }

    /* JADX INFO: renamed from: E */
    public final void m162836E(y20<PurchaseType> onKeyBackCallback) {
        this.onKeyBackCallback = onKeyBackCallback;
    }

    /* JADX INFO: renamed from: F */
    public final void m162837F(y20<PurchaseType> onNegativeClick) {
        this.onNegativeClick = onNegativeClick;
    }

    /* JADX INFO: renamed from: G */
    public final void m162838G(a30<PurchaseType, Act, String> onPaymentSuccess) {
        this.onPaymentSuccess = onPaymentSuccess;
    }

    /* JADX INFO: renamed from: H */
    public final void m162839H(y20<PurchaseType> onTouchOutsideListener) {
        this.onTouchOutsideCallback = onTouchOutsideListener;
    }

    /* JADX INFO: renamed from: I */
    public final void m162840I() {
        if (this.act.isFinishing()) {
            return;
        }
        m162849x();
        m162848w();
        m162850y();
    }

    /* JADX INFO: renamed from: f */
    public final void m162841f(View view) {
        oeb0.m167356a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public final PurchaseType m162842q() {
        return this.purchaseTypes.get(m162846u().getCurrentItem());
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final FrameLayout m162843r() {
        FrameLayout frameLayout = this._agreement_container_1;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_agreement_container_1");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final FrameLayout m162844s() {
        FrameLayout frameLayout = this._agreement_container_2;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_agreement_container_2");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final AliFreeClipLinearLayout m162845t() {
        AliFreeClipLinearLayout aliFreeClipLinearLayout = this._content;
        if (aliFreeClipLinearLayout != null) {
            return aliFreeClipLinearLayout;
        }
        Intrinsics.m88391r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final VPagerInPurchaseDialog m162846u() {
        VPagerInPurchaseDialog vPagerInPurchaseDialog = this._pager;
        if (vPagerInPurchaseDialog != null) {
            return vPagerInPurchaseDialog;
        }
        Intrinsics.m88391r("_pager");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final PurchaseTabViewContainer m162847v() {
        PurchaseTabViewContainer purchaseTabViewContainer = this._tabs_container;
        if (purchaseTabViewContainer != null) {
            return purchaseTabViewContainer;
        }
        Intrinsics.m88391r("_tabs_container");
        return null;
    }

    /* JADX INFO: renamed from: w */
    public final void m162848w() {
        View viewInflate = p9r.m171370a(this.act).inflate(rec0.f162427C1, (ViewGroup) null);
        viewInflate.getClass();
        m162841f(viewInflate);
        Dialog dialogM21566z = this.act.dialog().m21519P(viewInflate, false).m21515L(dgc0.f88285j).m21558v().m21493A(new DialogInterface.OnCancelListener() { // from class: l.ieb0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                neb0.m162820d(this.f114565a, dialogInterface);
            }
        }).m21525V(new DialogInterface.OnDismissListener() { // from class: l.jeb0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                neb0.m162819c(this.f120431a, dialogInterface);
            }
        }).m21538i0(new DialogInterface.OnKeyListener() { // from class: l.keb0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return neb0.m162821e(this.f125312a, dialogInterface, i, keyEvent);
            }
        }).m21514K0(new Dialog.InterfaceC4464i() { // from class: l.leb0
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4464i
            /* JADX INFO: renamed from: a */
            public final void mo21569a(Dialog dialog) {
                neb0.m162818b(this.f131724a, dialog);
            }
        }).m21565y0(g6e.f102427a).m21566z();
        this.dialog = dialogM21566z;
        if (dialogM21566z != null) {
            dialogM21566z.show();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m162849x() {
        C8940b c8940b = new C8940b(this.act, this.purchaseTypes, this.from);
        this.mediatorsManager = c8940b;
        c8940b.m55230b();
        C8940b c8940b2 = this.mediatorsManager;
        if (c8940b2 == null) {
            Intrinsics.m88391r("mediatorsManager");
            c8940b2 = null;
        }
        c8940b2.m55232d();
    }

    /* JADX INFO: renamed from: y */
    public final void m162850y() {
        ProductCategory productCategory = this.purchaseTypes.get(this.initSelectTabIndex).productCategory();
        productCategory.getClass();
        ceb0 ceb0Var = new ceb0(this.act, this.purchaseTypes, this.firstPrivileges, this.from, new beb0(productCategory, PurchaseTrackPageType.pop_two, this.from));
        this.pagerAdapter = ceb0Var;
        C8940b c8940b = this.mediatorsManager;
        ceb0 ceb0Var2 = null;
        if (c8940b == null) {
            Intrinsics.m88391r("mediatorsManager");
            c8940b = null;
        }
        ceb0Var.m109350w(c8940b);
        ceb0Var.m109349v(this.initSelectTabIndex);
        ceb0Var.m109352y(this.onPaymentSuccess);
        ceb0Var.m109351x(this.onNegativeClick);
        ceb0Var.m109348u(this.dialogStateAction);
        ArrayList arrayListM147507f0 = jyb.m147507f0(m162843r(), m162844s());
        arrayListM147507f0.getClass();
        ceb0Var.m109347t(arrayListM147507f0);
        VPagerInPurchaseDialog vPagerInPurchaseDialogM162846u = m162846u();
        ceb0 ceb0Var3 = this.pagerAdapter;
        if (ceb0Var3 == null) {
            Intrinsics.m88391r("pagerAdapter");
        } else {
            ceb0Var2 = ceb0Var3;
        }
        vPagerInPurchaseDialogM162846u.setAdapter(ceb0Var2);
        vPagerInPurchaseDialogM162846u.setOffscreenPageLimit(this.purchaseTypes.size());
        vPagerInPurchaseDialogM162846u.m4187d(new C18862b());
        PurchaseTabViewContainer purchaseTabViewContainerM162847v = m162847v();
        purchaseTabViewContainerM162847v.m54305c(this.purchaseTypes);
        purchaseTabViewContainerM162847v.m54304b(new C18863c());
        purchaseTabViewContainerM162847v.setSelectTabPosition(this.initSelectTabIndex);
        m162833B(this.initSelectTabIndex);
    }

    /* JADX INFO: renamed from: z */
    public final void m162851z() {
        ceb0 ceb0Var = this.pagerAdapter;
        if (ceb0Var == null) {
            Intrinsics.m88391r("pagerAdapter");
            ceb0Var = null;
        }
        ceb0Var.m109346s();
    }
}
