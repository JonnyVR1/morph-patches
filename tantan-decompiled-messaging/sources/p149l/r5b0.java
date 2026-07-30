package p149l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.Constants;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.C8777b;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p046p1.mobile.putong.core.p053ui.purchase.page.PurchasePageTabsContainerView;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VImage;
import p147v.VPager;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u0089\u00012\u00020\u0001:\u0004\u008a\u0001\u008b\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\rJ\u001f\u0010\u0019\u001a\u00020\u000b2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0014¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b+\u0010,J+\u0010/\u001a\u00020\u000b2\u001c\u0010.\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010-¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u000b2\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u000b2\b\u00105\u001a\u0004\u0018\u000101¢\u0006\u0004\b6\u00104J\u0017\u00108\u001a\u00020\u000b2\b\u00107\u001a\u0004\u0018\u000101¢\u0006\u0004\b8\u00104J\u0015\u0010;\u001a\u00020\u000b2\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010b\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010f\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010M\u001a\u0004\bd\u0010O\"\u0004\be\u0010QR\"\u0010n\u001a\u00020g8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u0018\u0010r\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010v\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010@R\u0018\u00107\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0018\u0010}\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010BR,\u0010.\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR,\u0010\u0081\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u007fR\u0019\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010yR\u0019\u00105\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010yR'\u0010\u0088\u0001\u001a\u0012\u0012\r\u0012\u000b \u0085\u0001*\u0004\u0018\u000109090\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001¨\u0006\u008c\u0001"}, m87232d2 = {"Ll/r5b0;", "Ll/szd;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseTypes", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ljava/lang/String;)V", "", "Z", "()V", "U", j6f.GPS_MEASUREMENT_INTERRUPTED, j6f.GPS_DIRECTION_TRUE, "purchaseType", "Y", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "currentPurchaseType", "X", "W", "Lcom/p1/mobile/putong/core/data/Privilege;", "privileges", "f0", "(Ljava/util/List;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "J", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", OMSTemplateType.dialog, "onShow", "(Landroid/content/DialogInterface;)V", "other", "e0", "(Ljava/lang/String;)V", "Ll/g30;", "onPaymentSuccess", "d0", "(Ll/g30;)V", "Ll/d30;", "onKeyBackCallback", "c0", "(Ll/d30;)V", "onCloseCallback", "a0", SysnotifListener.ACTION_DISMISS, "b0", "", "selectedIdx", "g0", "(I)V", "j", "Lcom/p1/mobile/android/app/Act;", "k", "Ljava/util/List;", BLiveStormDanmakuGiftResourceType.f44444l, "Ljava/lang/String;", "Landroid/widget/FrameLayout;", "m", "Landroid/widget/FrameLayout;", "get_layoutrootview", "()Landroid/widget/FrameLayout;", "set_layoutrootview", "(Landroid/widget/FrameLayout;)V", "_layoutrootview", "Lv/VImage;", "n", "Lv/VImage;", j6f.LATITUDE_SOUTH, "()Lv/VImage;", "set_top_bg", "(Lv/VImage;)V", "_top_bg", "Landroid/widget/LinearLayout;", "o", "Landroid/widget/LinearLayout;", "P", "()Landroid/widget/LinearLayout;", "set_content", "(Landroid/widget/LinearLayout;)V", "_content", "Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePageTabsContainerView;", "p", "Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePageTabsContainerView;", "R", "()Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePageTabsContainerView;", "set_tabs_container", "(Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePageTabsContainerView;)V", "_tabs_container", "q", BloodType.f38728O, "set_close", "_close", "Lv/VPager;", "r", "Lv/VPager;", "Q", "()Lv/VPager;", "set_pager", "(Lv/VPager;)V", "_pager", "Ll/t5b0;", BLiveStormDanmakuGiftResourceType.f44446s, "Ll/t5b0;", "purchasePageNewAdapter", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/b;", Constants.KEY_T, "Lcom/p1/mobile/putong/core/ui/purchase/mediator/b;", "mediatorsManager", "u", ResourceDirection.f38808v, "Ll/d30;", "w", "I", BaseSei.f13930X, "onlineMatchPushUser", BaseSei.f13931Y, "Ll/g30;", BaseSei.f13932Z, "onPaymentFailedAction", "A", "B", "Ll/e30;", "kotlin.jvm.PlatformType", b2s.C_ZONE, "Ll/e30;", "dialogStateAction", "Companion", "b", "a", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class r5b0 extends szd {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public d30 onKeyBackCallback;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public d30 onCloseCallback;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public final e30<Integer> dialogStateAction;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final List<PurchaseType> purchaseTypes;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public final String from;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public FrameLayout _layoutrootview;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VImage _top_bg;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public LinearLayout _content;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public PurchasePageTabsContainerView _tabs_container;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public VImage _close;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public VPager _pager;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public t5b0 purchasePageNewAdapter;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public C8777b mediatorsManager;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public List<? extends Privilege> privileges;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public d30 dismiss;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public int selectedIdx;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public String onlineMatchPushUser;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    public g30<PurchaseType, Act, String> onPaymentSuccess;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public g30<PurchaseType, Act, String> onPaymentFailedAction;

    /* JADX INFO: renamed from: l.r5b0$a */
    @Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0016\u0010\u0010J+\u0010\u0019\u001a\u00020\u00002\u001c\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010\"\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\"\u0010\u001eJ\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%J\r\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010)R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010*R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010*R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010+R\u0018\u0010!\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010,R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010-R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010+R,\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010.R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010,R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010,¨\u0006/"}, m87232d2 = {"Ll/r5b0$a;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "types", "Lcom/p1/mobile/putong/core/data/Privilege;", "privileges", "h", "(Ljava/util/List;Ljava/util/List;)Ll/r5b0$a;", "", "from", "b", "(Ljava/lang/String;)Ll/r5b0$a;", "", "selectedIdx", RXScreenCaptureService.KEY_INDEX, "(I)Ll/r5b0$a;", "onlineMatchPushUser", "g", "Ll/g30;", "onPaymentSuccess", "f", "(Ll/g30;)Ll/r5b0$a;", "Ll/d30;", "onKeyBackCallback", "e", "(Ll/d30;)Ll/r5b0$a;", "onCloseCallback", "c", SysnotifListener.ACTION_DISMISS, Constants.INAPP_DATA_TAG, "Ll/r5b0;", "a", "()Ll/r5b0;", "", "j", "()V", "Lcom/p1/mobile/android/app/Act;", "Ljava/util/List;", "Ljava/lang/String;", "Ll/d30;", "I", "Ll/g30;", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C19640a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Act act;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public List<? extends PurchaseType> types;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public List<? extends Privilege> privileges;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public String from;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public d30 dismiss;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public int selectedIdx;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public String onlineMatchPushUser;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public g30<PurchaseType, Act, String> onPaymentSuccess;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public d30 onKeyBackCallback;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @Nullable
        public d30 onCloseCallback;

        public C19640a(@NotNull Act act) {
            act.getClass();
            this.act = act;
            this.types = CollectionsKt.emptyList();
            this.privileges = CollectionsKt.emptyList();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final r5b0 m177917a() {
            r5b0 r5b0Var = new r5b0(this.act, this.types, this.from);
            r5b0Var.m177904f0(this.privileges);
            r5b0Var.m177915e0(this.onlineMatchPushUser);
            r5b0Var.m177914d0(this.onPaymentSuccess);
            r5b0Var.m177913c0(this.onKeyBackCallback);
            r5b0Var.m177911a0(this.onCloseCallback);
            r5b0Var.m177912b0(this.dismiss);
            r5b0Var.m177916g0(this.selectedIdx);
            return r5b0Var;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C19640a m177918b(@Nullable String from) {
            this.from = from;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final C19640a m177919c(@Nullable d30 onCloseCallback) {
            this.onCloseCallback = onCloseCallback;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final C19640a m177920d(@Nullable d30 dismiss) {
            this.dismiss = dismiss;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final C19640a m177921e(@Nullable d30 onKeyBackCallback) {
            this.onKeyBackCallback = onKeyBackCallback;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final C19640a m177922f(@Nullable g30<PurchaseType, Act, String> onPaymentSuccess) {
            this.onPaymentSuccess = onPaymentSuccess;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final C19640a m177923g(@Nullable String onlineMatchPushUser) {
            this.onlineMatchPushUser = onlineMatchPushUser;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final C19640a m177924h(@NotNull List<? extends PurchaseType> types, @NotNull List<? extends Privilege> privileges) {
            types.getClass();
            privileges.getClass();
            this.types = types;
            this.privileges = privileges;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: i */
        public final C19640a m177925i(int selectedIdx) {
            this.selectedIdx = selectedIdx;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public final void m177926j() {
            m177917a().show();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r5b0(@NotNull Act act, @NotNull List<? extends PurchaseType> list, @Nullable String str) {
        super(act, false, y7c0.f196692b);
        act.getClass();
        list.getClass();
        this.act = act;
        this.purchaseTypes = list;
        this.from = str;
        this.dialogStateAction = new e30() { // from class: l.m5b0
            @Override // p149l.e30
            public final void call(Object obj) {
                r5b0.m177890G(this.f131386a, ((Integer) obj).intValue());
            }
        };
    }

    /* JADX INFO: renamed from: E */
    public static void m177888E(r5b0 r5b0Var, View view) {
        d30 d30Var = r5b0Var.onCloseCallback;
        if (d30Var != null) {
            d30Var.call();
        }
        r5b0Var.dismiss();
    }

    /* JADX INFO: renamed from: F */
    public static void m177889F(r5b0 r5b0Var, DialogInterface dialogInterface) {
        r5b0Var.m177900W();
    }

    /* JADX INFO: renamed from: G */
    public static void m177890G(r5b0 r5b0Var, int i) {
        if (i == -1) {
            r5b0Var.hide();
            return;
        }
        if (i != 0) {
            if (i == 1) {
                r5b0Var.show();
                return;
            } else if (i != 2) {
                return;
            }
        }
        r5b0Var.dismiss();
    }

    /* JADX INFO: renamed from: H */
    public static boolean m177891H(r5b0 r5b0Var, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (i != 4 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 0) {
            return false;
        }
        r5b0Var.dialogStateAction.call(0);
        d30 d30Var = r5b0Var.onKeyBackCallback;
        if (d30Var == null) {
            return true;
        }
        d30Var.call();
        return true;
    }

    /* JADX INFO: renamed from: I */
    public static void m177892I(r5b0 r5b0Var, DialogInterface dialogInterface) {
        CoreModule.m29935P().m94651a().mo33308E9();
        int iMin = Math.min(r5b0Var.m177908Q().getCurrentItem(), r5b0Var.purchaseTypes.size() - 1);
        t5b0 t5b0Var = r5b0Var.purchasePageNewAdapter;
        if (t5b0Var != null) {
            t5b0Var.m187279r(iMin);
        }
        r5b0Var.m177900W();
        d30 d30Var = r5b0Var.dismiss;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: T */
    private final void m177897T() {
        m186759y();
        m186758x();
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.n5b0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return r5b0.m177891H(this.f137201a, dialogInterface, i, keyEvent);
            }
        });
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.o5b0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                r5b0.m177889F(this.f141888a, dialogInterface);
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.p5b0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                r5b0.m177892I(this.f147276a, dialogInterface);
            }
        });
        m177906O().setOnClickListener(new View.OnClickListener() { // from class: l.q5b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r5b0.m177888E(this.f152753a, view);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    private final void m177898U() {
        C8777b c8777b = new C8777b(this.act, this.purchaseTypes, this.from);
        this.mediatorsManager = c8777b;
        c8777b.m54047b();
        C8777b c8777b2 = this.mediatorsManager;
        if (c8777b2 != null) {
            c8777b2.m54049d();
        }
    }

    /* JADX INFO: renamed from: V */
    private final void m177899V() {
        ViewGroup.LayoutParams layoutParams = m177907P().getLayoutParams();
        layoutParams.getClass();
        ((FrameLayout.LayoutParams) layoutParams).topMargin = xdl0.m208331F0();
        PurchaseTrackPageType purchaseTrackPageType = PurchaseTrackPageType.page_fullscreen_one;
        if (this.purchaseTypes.size() > 1) {
            purchaseTrackPageType = PurchaseTrackPageType.page_fullscreen_two;
            ViewGroup.LayoutParams layoutParams2 = m177909R().getLayoutParams();
            layoutParams2.getClass();
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
            int i = t100.f167276y;
            layoutParams3.leftMargin = i;
            layoutParams3.rightMargin = i;
        }
        m177909R().m54172c(this.purchaseTypes);
        int iMin = Math.min(this.selectedIdx, this.purchaseTypes.size() - 1);
        ProductCategory productCategory = this.purchaseTypes.get(iMin).productCategory();
        productCategory.getClass();
        x5b0 x5b0Var = new x5b0(productCategory, purchaseTrackPageType, this.from);
        t5b0 t5b0Var = new t5b0(this.act, this.purchaseTypes, this.privileges, this.from, x5b0Var);
        this.purchasePageNewAdapter = t5b0Var;
        C8777b c8777b = this.mediatorsManager;
        if (c8777b != null) {
            t5b0Var.m187283v(c8777b);
        }
        t5b0Var.m187281t(this.dialogStateAction);
        t5b0Var.m187286y(this.onlineMatchPushUser);
        t5b0Var.m187285x(this.onPaymentSuccess);
        t5b0Var.m187284w(this.onPaymentFailedAction);
        if (iMin == 0) {
            ProductCategory productCategory2 = this.purchaseTypes.get(iMin).productCategory();
            productCategory2.getClass();
            x5b0Var.m130122v(productCategory2);
        }
        t5b0Var.m187282u(iMin);
        m177908Q().setAdapter(this.purchasePageNewAdapter);
        m177908Q().m4185d(new C19642c());
        int iMin2 = Math.min(this.selectedIdx, this.purchaseTypes.size() - 1);
        PurchaseType purchaseType = this.purchaseTypes.get(iMin2);
        m177909R().setupWithViewPager(m177908Q());
        m177908Q().setCurrentItem(iMin2);
        m177902Y(purchaseType);
        m177901X(purchaseType);
        m177909R().m54171b(purchaseType);
    }

    /* JADX INFO: renamed from: W */
    private final void m177900W() {
        t5b0 t5b0Var = this.purchasePageNewAdapter;
        if (t5b0Var != null) {
            t5b0Var.m187280s();
        }
    }

    /* JADX INFO: renamed from: X */
    private final void m177901X(PurchaseType currentPurchaseType) {
        m177906O().setImageDrawable(CoreModule.f17544b.getDrawable(sab0.m182891i(currentPurchaseType) ? d3c0.f83731R6 : d3c0.f83634K6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public final void m177902Y(PurchaseType purchaseType) {
        if (sab0.m182906x(purchaseType)) {
            m177910S().setImageResource(d3c0.f83499Ab);
            return;
        }
        if (sab0.m182889g(purchaseType)) {
            m177910S().setImageResource(d3c0.f83750T);
            return;
        }
        if (!sab0.m182891i(purchaseType)) {
            if (sab0.m182899q(purchaseType)) {
                m177910S().setImageResource(d3c0.f84115t7);
                return;
            } else {
                m177910S().setImageResource(d3c0.f84129u7);
                return;
            }
        }
        m177910S().setImageResource(d3c0.f84101s7);
        ViewGroup.LayoutParams layoutParams = m177910S().getLayoutParams();
        layoutParams.height = -1;
        m177910S().setLayoutParams(layoutParams);
        m177910S().setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    /* JADX INFO: renamed from: Z */
    private final void m177903Z() {
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(Integer.MIN_VALUE);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setStatusBarColor(0);
        }
        PutongAct.setLightStatusBar(getWindow(), EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public final void m177904f0(List<? extends Privilege> privileges) {
        this.privileges = privileges;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final View m177905J(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM182326b = s5b0.m182326b(this, inflater, parent);
        viewM182326b.getClass();
        return viewM182326b;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final VImage m177906O() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final LinearLayout m177907P() {
        LinearLayout linearLayout = this._content;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final VPager m177908Q() {
        VPager vPager = this._pager;
        if (vPager != null) {
            return vPager;
        }
        Intrinsics.m87502r("_pager");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final PurchasePageTabsContainerView m177909R() {
        PurchasePageTabsContainerView purchasePageTabsContainerView = this._tabs_container;
        if (purchasePageTabsContainerView != null) {
            return purchasePageTabsContainerView;
        }
        Intrinsics.m87502r("_tabs_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final VImage m177910S() {
        VImage vImage = this._top_bg;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_top_bg");
        return null;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m177911a0(@Nullable d30 onCloseCallback) {
        this.onCloseCallback = onCloseCallback;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m177912b0(@Nullable d30 dismiss) {
        this.dismiss = dismiss;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m177913c0(@Nullable d30 onKeyBackCallback) {
        this.onKeyBackCallback = onKeyBackCallback;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m177914d0(@Nullable g30<PurchaseType, Act, String> onPaymentSuccess) {
        this.onPaymentSuccess = onPaymentSuccess;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m177915e0(@Nullable String other) {
        this.onlineMatchPushUser = other;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m177916g0(int selectedIdx) {
        this.selectedIdx = selectedIdx;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0074a, p149l.hu0, android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater layoutInflater = this.act.getLayoutInflater();
        layoutInflater.getClass();
        View viewM177905J = m177905J(layoutInflater, null);
        m177898U();
        m177899V();
        setContentView(viewM177905J);
        m177903Z();
        m177897T();
    }

    @Override // p149l.szd, android.content.DialogInterface.OnShowListener
    public void onShow(@Nullable DialogInterface dialog) {
        super.onShow(dialog);
    }

    /* JADX INFO: renamed from: l.r5b0$c */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, m87232d2 = {"l/r5b0$c", "Landroidx/viewpager/widget/ViewPager$j;", "", "position", "", "positionOffset", "positionOffsetPixels", "", "onPageScrolled", "(IFI)V", "onPageSelected", "(I)V", "state", "onPageScrollStateChanged", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C19642c implements ViewPager.InterfaceC0716j {
        public C19642c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int position) {
            PurchaseType purchaseType = (PurchaseType) r5b0.this.purchaseTypes.get(position);
            r5b0.this.m177902Y(purchaseType);
            r5b0.this.m177909R().m54171b(purchaseType);
            t5b0 t5b0Var = r5b0.this.purchasePageNewAdapter;
            if (t5b0Var != null) {
                t5b0Var.m187278q(purchaseType);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int state) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }
    }
}
