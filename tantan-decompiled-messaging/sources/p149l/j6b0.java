package p149l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.alifree.AliFreeClipLinearLayout;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.core.p053ui.purchase.PurchaseTabViewContainer;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.C8777b;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p046p1.mobile.putong.core.p053ui.view.VPagerInPurchaseDialog;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u00011B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u0013J\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010\u0019J\u0019\u0010\"\u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J-\u0010&\u001a\u00020\u000f2\u001c\u0010%\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010$H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\u000f2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010(H\u0002¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020\u000f2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010(H\u0002¢\u0006\u0004\b-\u0010+J\u001f\u0010/\u001a\u00020\u000f2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010(H\u0002¢\u0006\u0004\b/\u0010+J\r\u00100\u001a\u00020\u000f¢\u0006\u0004\b0\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010F\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010Z\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010Q\u001a\u0004\bX\u0010S\"\u0004\bY\u0010UR\u0016\u0010^\u001a\u00020[8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\\\u0010]R\u001e\u0010a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010`R\u0018\u0010e\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010`R,\u0010%\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010l\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010o\u001a\u00020m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010nR\u0016\u0010r\u001a\u00020p8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bR\u0010qR\u0016\u0010s\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u00100R\"\u0010u\u001a\u0010\u0012\f\u0012\n t*\u0004\u0018\u00010\u00160\u00160(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010`¨\u0006v"}, m87232d2 = {"Ll/j6b0;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseTypes", "Lcom/p1/mobile/putong/core/data/Privilege;", "firstPrivileges", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "f", "(Landroid/view/View;)V", BaseSei.f13930X, "()V", "w", BaseSei.f13931Y, "", "position", "A", "(I)V", "B", "q", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", BaseSei.f13932Z, "selectTabIndex", b2s.C_ZONE, "Ll/d30;", SysnotifListener.ACTION_DISMISS, "D", "(Ll/d30;)V", "Ll/g30;", "onPaymentSuccess", "G", "(Ll/g30;)V", "Ll/e30;", "onTouchOutsideListener", "H", "(Ll/e30;)V", "onKeyBackCallback", "E", "onNegativeClick", "F", "I", "a", "Lcom/p1/mobile/android/app/Act;", "b", "Ljava/util/List;", "c", Constants.INAPP_DATA_TAG, "Ljava/lang/String;", "Lcom/p1/mobile/putong/core/ui/alifree/AliFreeClipLinearLayout;", "e", "Lcom/p1/mobile/putong/core/ui/alifree/AliFreeClipLinearLayout;", Constants.KEY_T, "()Lcom/p1/mobile/putong/core/ui/alifree/AliFreeClipLinearLayout;", "set_content", "(Lcom/p1/mobile/putong/core/ui/alifree/AliFreeClipLinearLayout;)V", "_content", "Lcom/p1/mobile/putong/core/ui/purchase/PurchaseTabViewContainer;", "Lcom/p1/mobile/putong/core/ui/purchase/PurchaseTabViewContainer;", ResourceDirection.f38808v, "()Lcom/p1/mobile/putong/core/ui/purchase/PurchaseTabViewContainer;", "set_tabs_container", "(Lcom/p1/mobile/putong/core/ui/purchase/PurchaseTabViewContainer;)V", "_tabs_container", "Lcom/p1/mobile/putong/core/ui/view/VPagerInPurchaseDialog;", "g", "Lcom/p1/mobile/putong/core/ui/view/VPagerInPurchaseDialog;", "u", "()Lcom/p1/mobile/putong/core/ui/view/VPagerInPurchaseDialog;", "set_pager", "(Lcom/p1/mobile/putong/core/ui/view/VPagerInPurchaseDialog;)V", "_pager", "Landroid/widget/FrameLayout;", "h", "Landroid/widget/FrameLayout;", "r", "()Landroid/widget/FrameLayout;", "set_agreement_container_1", "(Landroid/widget/FrameLayout;)V", "_agreement_container_1", RXScreenCaptureService.KEY_INDEX, BLiveStormDanmakuGiftResourceType.f44446s, "set_agreement_container_2", "_agreement_container_2", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/b;", "j", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/b;", "mediatorsManager", "k", "Ll/e30;", "onTouchOutsideCallback", BLiveStormDanmakuGiftResourceType.f44444l, "m", "Ll/d30;", "onDismiss", "n", "o", "Ll/g30;", "Lcom/p1/mobile/android/app/Dialog;", "p", "Lcom/p1/mobile/android/app/Dialog;", OMSTemplateType.dialog, "", "Z", "shouldDismissCallback", "Ll/y5b0;", "Ll/y5b0;", "pagerAdapter", "initSelectTabIndex", "kotlin.jvm.PlatformType", "dialogStateAction", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public C8777b mediatorsManager;

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
    @Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0017\u001a\u00020\u00002\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u00002\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\u00002\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0019¢\u0006\u0004\b\u001e\u0010\u001cJ\u001d\u0010 \u001a\u00020\u00002\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0019¢\u0006\u0004\b \u0010\u001cJ\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010$R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010%R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010%R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u0016\u0010*\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010)R,\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010+R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010-¨\u00061"}, m87232d2 = {"Ll/j6b0$a;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseTypes", "Lcom/p1/mobile/putong/core/data/Privilege;", "firstPrivileges", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "Ll/d30;", SysnotifListener.ACTION_DISMISS, "b", "(Ll/d30;)Ll/j6b0$a;", "", "selectTabIndex", "a", "(I)Ll/j6b0$a;", "Ll/g30;", "onPaymentSuccess", "e", "(Ll/g30;)Ll/j6b0$a;", "Ll/e30;", "onKeyBackCallback", "c", "(Ll/e30;)Ll/j6b0$a;", "onCloseClick", Constants.INAPP_DATA_TAG, "onTouchOutsideListener", "f", "Ll/j6b0;", "g", "()Ll/j6b0;", "Lcom/p1/mobile/android/app/Act;", "Ljava/util/List;", "Ljava/lang/String;", "Ll/d30;", "onDismiss", "I", "initSelectTabIndex", "Ll/g30;", "h", "Ll/e30;", "onNegativeClick", RXScreenCaptureService.KEY_INDEX, "j", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C17693a {

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

        /* JADX WARN: Multi-variable type inference failed */
        public C17693a(@NotNull Act act, @NotNull List<? extends PurchaseType> list, @Nullable List<? extends Privilege> list2, @Nullable String str) {
            act.getClass();
            list.getClass();
            this.act = act;
            this.purchaseTypes = list;
            this.firstPrivileges = list2;
            this.from = str;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C17693a m139941a(int selectTabIndex) {
            this.initSelectTabIndex = selectTabIndex;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C17693a m139942b(@Nullable d30 dismiss) {
            this.onDismiss = dismiss;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final C17693a m139943c(@Nullable e30<PurchaseType> onKeyBackCallback) {
            this.onKeyBackCallback = onKeyBackCallback;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final C17693a m139944d(@Nullable e30<PurchaseType> onCloseClick) {
            this.onNegativeClick = onCloseClick;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final C17693a m139945e(@Nullable g30<PurchaseType, Act, String> onPaymentSuccess) {
            this.onPaymentSuccess = onPaymentSuccess;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final C17693a m139946f(@Nullable e30<PurchaseType> onTouchOutsideListener) {
            this.onTouchOutsideListener = onTouchOutsideListener;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final j6b0 m139947g() {
            j6b0 j6b0Var = new j6b0(this.act, this.purchaseTypes, this.firstPrivileges, this.from);
            j6b0Var.m139924D(this.onDismiss);
            j6b0Var.m139923C(this.initSelectTabIndex);
            j6b0Var.m139927G(this.onPaymentSuccess);
            j6b0Var.m139925E(this.onKeyBackCallback);
            j6b0Var.m139926F(this.onNegativeClick);
            j6b0Var.m139928H(this.onTouchOutsideListener);
            j6b0Var.m139929I();
            return j6b0Var;
        }
    }

    /* JADX INFO: renamed from: l.j6b0$b */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"l/j6b0$b", "Landroidx/viewpager/widget/ViewPager$m;", "", "position", "", "positionOffset", "positionOffsetPixels", "", "onPageScrolled", "(IFI)V", "onPageSelected", "(I)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C17694b extends ViewPager.C0719m {
        public C17694b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.C0719m, androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            j6b0.this.m139936v().m53125f(position, positionOffset);
        }

        @Override // androidx.viewpager.widget.ViewPager.C0719m, androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int position) {
            j6b0.this.m139936v().m53127h((vwb.m200296J(j6b0.this.purchaseTypes) || position >= j6b0.this.purchaseTypes.size()) ? false : sab0.m182891i((PurchaseType) j6b0.this.purchaseTypes.get(position)));
            j6b0.this.m139922B(position);
        }
    }

    /* JADX INFO: renamed from: l.j6b0$c */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m87232d2 = {"l/j6b0$c", "Lcom/p1/mobile/putong/core/ui/purchase/PurchaseTabViewContainer$a;", "", "position", "", "b", "(I)V", "a", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C17695c implements PurchaseTabViewContainer.InterfaceC8756a {
        public C17695c() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.purchase.PurchaseTabViewContainer.InterfaceC8756a
        /* JADX INFO: renamed from: a */
        public void mo53129a(int position) {
            y5b0 y5b0Var = j6b0.this.pagerAdapter;
            if (y5b0Var == null) {
                Intrinsics.m87502r("pagerAdapter");
                y5b0Var = null;
            }
            y5b0Var.m212966q(position);
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.purchase.PurchaseTabViewContainer.InterfaceC8756a
        /* JADX INFO: renamed from: b */
        public void mo53130b(int position) {
            j6b0.this.m139935u().setCurrentItem(position);
            y5b0 y5b0Var = j6b0.this.pagerAdapter;
            if (y5b0Var == null) {
                Intrinsics.m87502r("pagerAdapter");
                y5b0Var = null;
            }
            y5b0Var.m212967r(position);
            j6b0.this.m139921A(position);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j6b0(@NotNull Act act, @NotNull List<? extends PurchaseType> list, @Nullable List<? extends Privilege> list2, @Nullable String str) {
        act.getClass();
        list.getClass();
        this.act = act;
        this.purchaseTypes = list;
        this.firstPrivileges = list2;
        this.from = str;
        this.shouldDismissCallback = true;
        this.dialogStateAction = new e30() { // from class: l.i6b0
            @Override // p149l.e30
            public final void call(Object obj) {
                j6b0.m139906a(this.f111703a, ((Integer) obj).intValue());
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static void m139906a(j6b0 j6b0Var, int i) {
        if (NullChecker.m81303a(j6b0Var.dialog)) {
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
    public static void m139907b(j6b0 j6b0Var, Dialog dialog) {
        e30<PurchaseType> e30Var = j6b0Var.onTouchOutsideCallback;
        if (e30Var != null) {
            e30Var.call(j6b0Var.m139931q());
        }
        j6b0Var.dialogStateAction.call(0);
    }

    /* JADX INFO: renamed from: c */
    public static void m139908c(j6b0 j6b0Var, DialogInterface dialogInterface) {
        d30 d30Var;
        CoreModule.m29935P().m94651a().mo33308E9();
        y5b0 y5b0Var = j6b0Var.pagerAdapter;
        if (y5b0Var == null) {
            Intrinsics.m87502r("pagerAdapter");
            y5b0Var = null;
        }
        y5b0Var.m212966q(j6b0Var.m139935u().getCurrentItem());
        j6b0Var.m139940z();
        if (j6b0Var.shouldDismissCallback && (d30Var = j6b0Var.onDismiss) != null) {
            d30Var.call();
        }
        Dialog dialog = j6b0Var.dialog;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m139909d(j6b0 j6b0Var, DialogInterface dialogInterface) {
        j6b0Var.m139940z();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m139910e(j6b0 j6b0Var, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (keyEvent.getAction() == 0 && i == 4) {
            e30<PurchaseType> e30Var = j6b0Var.onKeyBackCallback;
            if (e30Var != null) {
                e30Var.call(j6b0Var.m139931q());
            }
            j6b0Var.dialogStateAction.call(0);
        }
        return false;
    }

    /* JADX INFO: renamed from: A */
    public final void m139921A(int position) {
        xdl0.m208344M(m139932r(), position == 0);
        xdl0.m208344M(m139933s(), position != 0);
    }

    /* JADX INFO: renamed from: B */
    public final void m139922B(int position) {
        int i;
        if (vwb.m200296J(this.purchaseTypes) || position >= this.purchaseTypes.size()) {
            i = d3c0.f83609I9;
        } else {
            PurchaseType purchaseType = this.purchaseTypes.get(position);
            if (sab0.m182891i(purchaseType)) {
                i = d3c0.f83742S4;
            } else {
                i = (sab0.m182899q(purchaseType) || sab0.m182895m(purchaseType)) ? d3c0.f83623J9 : d3c0.f83609I9;
            }
        }
        m139934t().setBackgroundResource(i);
    }

    /* JADX INFO: renamed from: C */
    public final void m139923C(int selectTabIndex) {
        this.initSelectTabIndex = selectTabIndex;
    }

    /* JADX INFO: renamed from: D */
    public final void m139924D(d30 dismiss) {
        this.onDismiss = dismiss;
    }

    /* JADX INFO: renamed from: E */
    public final void m139925E(e30<PurchaseType> onKeyBackCallback) {
        this.onKeyBackCallback = onKeyBackCallback;
    }

    /* JADX INFO: renamed from: F */
    public final void m139926F(e30<PurchaseType> onNegativeClick) {
        this.onNegativeClick = onNegativeClick;
    }

    /* JADX INFO: renamed from: G */
    public final void m139927G(g30<PurchaseType, Act, String> onPaymentSuccess) {
        this.onPaymentSuccess = onPaymentSuccess;
    }

    /* JADX INFO: renamed from: H */
    public final void m139928H(e30<PurchaseType> onTouchOutsideListener) {
        this.onTouchOutsideCallback = onTouchOutsideListener;
    }

    /* JADX INFO: renamed from: I */
    public final void m139929I() {
        if (this.act.isFinishing()) {
            return;
        }
        m139938x();
        m139937w();
        m139939y();
    }

    /* JADX INFO: renamed from: f */
    public final void m139930f(View view) {
        k6b0.m144576a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public final PurchaseType m139931q() {
        return this.purchaseTypes.get(m139935u().getCurrentItem());
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final FrameLayout m139932r() {
        FrameLayout frameLayout = this._agreement_container_1;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_agreement_container_1");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final FrameLayout m139933s() {
        FrameLayout frameLayout = this._agreement_container_2;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_agreement_container_2");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final AliFreeClipLinearLayout m139934t() {
        AliFreeClipLinearLayout aliFreeClipLinearLayout = this._content;
        if (aliFreeClipLinearLayout != null) {
            return aliFreeClipLinearLayout;
        }
        Intrinsics.m87502r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final VPagerInPurchaseDialog m139935u() {
        VPagerInPurchaseDialog vPagerInPurchaseDialog = this._pager;
        if (vPagerInPurchaseDialog != null) {
            return vPagerInPurchaseDialog;
        }
        Intrinsics.m87502r("_pager");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final PurchaseTabViewContainer m139936v() {
        PurchaseTabViewContainer purchaseTabViewContainer = this._tabs_container;
        if (purchaseTabViewContainer != null) {
            return purchaseTabViewContainer;
        }
        Intrinsics.m87502r("_tabs_container");
        return null;
    }

    /* JADX INFO: renamed from: w */
    public final void m139937w() {
        View viewInflate = o7r.m163037a(this.act).inflate(m6c0.f131467C1, (ViewGroup) null);
        viewInflate.getClass();
        m139930f(viewInflate);
        Dialog dialogM20567z = this.act.dialog().m20520P(viewInflate, false).m20516L(y7c0.f196699i).m20559v().m20494A(new DialogInterface.OnCancelListener() { // from class: l.e6b0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                j6b0.m139909d(this.f89516a, dialogInterface);
            }
        }).m20526V(new DialogInterface.OnDismissListener() { // from class: l.f6b0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                j6b0.m139908c(this.f95261a, dialogInterface);
            }
        }).m20539i0(new DialogInterface.OnKeyListener() { // from class: l.g6b0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return j6b0.m139910e(this.f101240a, dialogInterface, i, keyEvent);
            }
        }).m20515K0(new Dialog.InterfaceC4313i() { // from class: l.h6b0
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4313i
            /* JADX INFO: renamed from: a */
            public final void mo20570a(Dialog dialog) {
                j6b0.m139907b(this.f106014a, dialog);
            }
        }).m20566y0(s4e.f162375a).m20567z();
        this.dialog = dialogM20567z;
        if (dialogM20567z != null) {
            dialogM20567z.show();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m139938x() {
        C8777b c8777b = new C8777b(this.act, this.purchaseTypes, this.from);
        this.mediatorsManager = c8777b;
        c8777b.m54047b();
        C8777b c8777b2 = this.mediatorsManager;
        if (c8777b2 == null) {
            Intrinsics.m87502r("mediatorsManager");
            c8777b2 = null;
        }
        c8777b2.m54049d();
    }

    /* JADX INFO: renamed from: y */
    public final void m139939y() {
        ProductCategory productCategory = this.purchaseTypes.get(this.initSelectTabIndex).productCategory();
        productCategory.getClass();
        y5b0 y5b0Var = new y5b0(this.act, this.purchaseTypes, this.firstPrivileges, this.from, new x5b0(productCategory, PurchaseTrackPageType.pop_two, this.from));
        this.pagerAdapter = y5b0Var;
        C8777b c8777b = this.mediatorsManager;
        y5b0 y5b0Var2 = null;
        if (c8777b == null) {
            Intrinsics.m87502r("mediatorsManager");
            c8777b = null;
        }
        y5b0Var.m212972w(c8777b);
        y5b0Var.m212971v(this.initSelectTabIndex);
        y5b0Var.m212974y(this.onPaymentSuccess);
        y5b0Var.m212973x(this.onNegativeClick);
        y5b0Var.m212970u(this.dialogStateAction);
        ArrayList arrayListM200324f0 = vwb.m200324f0(m139932r(), m139933s());
        arrayListM200324f0.getClass();
        y5b0Var.m212969t(arrayListM200324f0);
        VPagerInPurchaseDialog vPagerInPurchaseDialogM139935u = m139935u();
        y5b0 y5b0Var3 = this.pagerAdapter;
        if (y5b0Var3 == null) {
            Intrinsics.m87502r("pagerAdapter");
        } else {
            y5b0Var2 = y5b0Var3;
        }
        vPagerInPurchaseDialogM139935u.setAdapter(y5b0Var2);
        vPagerInPurchaseDialogM139935u.setOffscreenPageLimit(this.purchaseTypes.size());
        vPagerInPurchaseDialogM139935u.m4185d(new C17694b());
        PurchaseTabViewContainer purchaseTabViewContainerM139936v = m139936v();
        purchaseTabViewContainerM139936v.m53122c(this.purchaseTypes);
        purchaseTabViewContainerM139936v.m53121b(new C17695c());
        purchaseTabViewContainerM139936v.setSelectTabPosition(this.initSelectTabIndex);
        m139922B(this.initSelectTabIndex);
    }

    /* JADX INFO: renamed from: z */
    public final void m139940z() {
        y5b0 y5b0Var = this.pagerAdapter;
        if (y5b0Var == null) {
            Intrinsics.m87502r("pagerAdapter");
            y5b0Var = null;
        }
        y5b0Var.m212968s();
    }
}
