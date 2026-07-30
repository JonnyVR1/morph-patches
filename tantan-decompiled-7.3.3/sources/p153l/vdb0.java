package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.C8940b;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p051p1.mobile.putong.core.p058ui.purchase.page.PurchasePageTabsContainerView;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VPager;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u0089\u00012\u00020\u0001:\u0004\u008a\u0001\u008b\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\rJ\u001f\u0010\u0019\u001a\u00020\u000b2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0014¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b+\u0010,J+\u0010/\u001a\u00020\u000b2\u001c\u0010.\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010-¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u000b2\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u000b2\b\u00105\u001a\u0004\u0018\u000101¢\u0006\u0004\b6\u00104J\u0017\u00108\u001a\u00020\u000b2\b\u00107\u001a\u0004\u0018\u000101¢\u0006\u0004\b8\u00104J\u0015\u0010;\u001a\u00020\u000b2\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010b\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010f\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010M\u001a\u0004\bd\u0010O\"\u0004\be\u0010QR\"\u0010n\u001a\u00020g8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u0018\u0010r\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010v\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010@R\u0018\u00107\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0018\u0010}\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010BR,\u0010.\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR,\u0010\u0081\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u007fR\u0019\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010yR\u0019\u00105\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010yR'\u0010\u0088\u0001\u001a\u0012\u0012\r\u0012\u000b \u0085\u0001*\u0004\u0018\u000109090\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001¨\u0006\u008c\u0001"}, m88121d2 = {"Ll/vdb0;", "Ll/g1e;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseTypes", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ljava/lang/String;)V", "", "Z", "()V", "U", p7f.GPS_MEASUREMENT_INTERRUPTED, p7f.GPS_DIRECTION_TRUE, "purchaseType", "Y", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "currentPurchaseType", "X", "W", "Lcom/p1/mobile/putong/core/data/Privilege;", "privileges", "f0", "(Ljava/util/List;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "J", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", OMSTemplateType.dialog, "onShow", "(Landroid/content/DialogInterface;)V", "other", "e0", "(Ljava/lang/String;)V", "Ll/a30;", "onPaymentSuccess", "d0", "(Ll/a30;)V", "Ll/x20;", "onKeyBackCallback", "c0", "(Ll/x20;)V", "onCloseCallback", "a0", SysnotifListener.ACTION_DISMISS, "b0", "", "selectedIdx", "g0", "(I)V", "j", "Lcom/p1/mobile/android/app/Act;", "k", "Ljava/util/List;", BLiveStormDanmakuGiftResourceType.f45292l, "Ljava/lang/String;", "Landroid/widget/FrameLayout;", "m", "Landroid/widget/FrameLayout;", "get_layoutrootview", "()Landroid/widget/FrameLayout;", "set_layoutrootview", "(Landroid/widget/FrameLayout;)V", "_layoutrootview", "Lv/VImage;", "n", "Lv/VImage;", p7f.LATITUDE_SOUTH, "()Lv/VImage;", "set_top_bg", "(Lv/VImage;)V", "_top_bg", "Landroid/widget/LinearLayout;", "o", "Landroid/widget/LinearLayout;", "P", "()Landroid/widget/LinearLayout;", "set_content", "(Landroid/widget/LinearLayout;)V", "_content", "Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePageTabsContainerView;", "p", "Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePageTabsContainerView;", "R", "()Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePageTabsContainerView;", "set_tabs_container", "(Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePageTabsContainerView;)V", "_tabs_container", "q", BloodType.f39576O, "set_close", "_close", "Lv/VPager;", "r", "Lv/VPager;", "Q", "()Lv/VPager;", "set_pager", "(Lv/VPager;)V", "_pager", "Ll/xdb0;", BLiveStormDanmakuGiftResourceType.f45294s, "Ll/xdb0;", "purchasePageNewAdapter", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/b;", Constants.KEY_T, "Lcom/p1/mobile/putong/core/ui/purchase/mediator/b;", "mediatorsManager", "u", ResourceDirection.f39656v, "Ll/x20;", "w", "I", BaseSei.f14624X, "onlineMatchPushUser", BaseSei.f14625Y, "Ll/a30;", BaseSei.f14626Z, "onPaymentFailedAction", "A", "B", "Ll/y20;", "kotlin.jvm.PlatformType", c4s.C_ZONE, "Ll/y20;", "dialogStateAction", "Companion", "b", "a", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class vdb0 extends g1e {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public x20 onKeyBackCallback;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public x20 onCloseCallback;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public final y20<Integer> dialogStateAction;

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
    public xdb0 purchasePageNewAdapter;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public C8940b mediatorsManager;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public List<? extends Privilege> privileges;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public x20 dismiss;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public int selectedIdx;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public String onlineMatchPushUser;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    public a30<PurchaseType, Act, String> onPaymentSuccess;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public a30<PurchaseType, Act, String> onPaymentFailedAction;

    /* JADX INFO: renamed from: l.vdb0$a */
    @Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0016\u0010\u0010J+\u0010\u0019\u001a\u00020\u00002\u001c\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010\"\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\"\u0010\u001eJ\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%J\r\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010)R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010*R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010*R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010+R\u0018\u0010!\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010,R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010-R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010+R,\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010.R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010,R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010,¨\u0006/"}, m88121d2 = {"Ll/vdb0$a;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "types", "Lcom/p1/mobile/putong/core/data/Privilege;", "privileges", "h", "(Ljava/util/List;Ljava/util/List;)Ll/vdb0$a;", "", "from", "b", "(Ljava/lang/String;)Ll/vdb0$a;", "", "selectedIdx", RXScreenCaptureService.KEY_INDEX, "(I)Ll/vdb0$a;", "onlineMatchPushUser", "g", "Ll/a30;", "onPaymentSuccess", "f", "(Ll/a30;)Ll/vdb0$a;", "Ll/x20;", "onKeyBackCallback", "e", "(Ll/x20;)Ll/vdb0$a;", "onCloseCallback", "c", SysnotifListener.ACTION_DISMISS, Constants.INAPP_DATA_TAG, "Ll/vdb0;", "a", "()Ll/vdb0;", "", "j", "()V", "Lcom/p1/mobile/android/app/Act;", "Ljava/util/List;", "Ljava/lang/String;", "Ll/x20;", "I", "Ll/a30;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20815a {

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
        public x20 dismiss;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public int selectedIdx;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public String onlineMatchPushUser;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public a30<PurchaseType, Act, String> onPaymentSuccess;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public x20 onKeyBackCallback;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @Nullable
        public x20 onCloseCallback;

        public C20815a(@NotNull Act act) {
            act.getClass();
            this.act = act;
            this.types = CollectionsKt.emptyList();
            this.privileges = CollectionsKt.emptyList();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final vdb0 m200955a() {
            vdb0 vdb0Var = new vdb0(this.act, this.types, this.from);
            vdb0Var.m200942f0(this.privileges);
            vdb0Var.m200953e0(this.onlineMatchPushUser);
            vdb0Var.m200952d0(this.onPaymentSuccess);
            vdb0Var.m200951c0(this.onKeyBackCallback);
            vdb0Var.m200949a0(this.onCloseCallback);
            vdb0Var.m200950b0(this.dismiss);
            vdb0Var.m200954g0(this.selectedIdx);
            return vdb0Var;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C20815a m200956b(@Nullable String from) {
            this.from = from;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final C20815a m200957c(@Nullable x20 onCloseCallback) {
            this.onCloseCallback = onCloseCallback;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final C20815a m200958d(@Nullable x20 dismiss) {
            this.dismiss = dismiss;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final C20815a m200959e(@Nullable x20 onKeyBackCallback) {
            this.onKeyBackCallback = onKeyBackCallback;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final C20815a m200960f(@Nullable a30<PurchaseType, Act, String> onPaymentSuccess) {
            this.onPaymentSuccess = onPaymentSuccess;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final C20815a m200961g(@Nullable String onlineMatchPushUser) {
            this.onlineMatchPushUser = onlineMatchPushUser;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final C20815a m200962h(@NotNull List<? extends PurchaseType> types, @NotNull List<? extends Privilege> privileges) {
            types.getClass();
            privileges.getClass();
            this.types = types;
            this.privileges = privileges;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: i */
        public final C20815a m200963i(int selectedIdx) {
            this.selectedIdx = selectedIdx;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public final void m200964j() {
            m200955a().show();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public vdb0(@NotNull Act act, @NotNull List<? extends PurchaseType> list, @Nullable String str) {
        super(act, false, dgc0.f88277b);
        act.getClass();
        list.getClass();
        this.act = act;
        this.purchaseTypes = list;
        this.from = str;
        this.dialogStateAction = new y20() { // from class: l.qdb0
            @Override // p153l.y20
            public final void call(Object obj) {
                vdb0.m200928G(this.f156684a, ((Integer) obj).intValue());
            }
        };
    }

    /* JADX INFO: renamed from: E */
    public static void m200926E(vdb0 vdb0Var, View view) {
        x20 x20Var = vdb0Var.onCloseCallback;
        if (x20Var != null) {
            x20Var.call();
        }
        vdb0Var.dismiss();
    }

    /* JADX INFO: renamed from: F */
    public static void m200927F(vdb0 vdb0Var, DialogInterface dialogInterface) {
        vdb0Var.m200938W();
    }

    /* JADX INFO: renamed from: G */
    public static void m200928G(vdb0 vdb0Var, int i) {
        if (i == -1) {
            vdb0Var.hide();
            return;
        }
        if (i != 0) {
            if (i == 1) {
                vdb0Var.show();
                return;
            } else if (i != 2) {
                return;
            }
        }
        vdb0Var.dismiss();
    }

    /* JADX INFO: renamed from: H */
    public static boolean m200929H(vdb0 vdb0Var, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (i != 4 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 0) {
            return false;
        }
        vdb0Var.dialogStateAction.call(0);
        x20 x20Var = vdb0Var.onKeyBackCallback;
        if (x20Var == null) {
            return true;
        }
        x20Var.call();
        return true;
    }

    /* JADX INFO: renamed from: I */
    public static void m200930I(vdb0 vdb0Var, DialogInterface dialogInterface) {
        CoreModule.m30933P().m143405a().mo34311E9();
        int iMin = Math.min(vdb0Var.m200946Q().getCurrentItem(), vdb0Var.purchaseTypes.size() - 1);
        xdb0 xdb0Var = vdb0Var.purchasePageNewAdapter;
        if (xdb0Var != null) {
            xdb0Var.m210447r(iMin);
        }
        vdb0Var.m200938W();
        x20 x20Var = vdb0Var.dismiss;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: T */
    private final void m200935T() {
        m128501y();
        m128500x();
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.rdb0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return vdb0.m200929H(this.f162300a, dialogInterface, i, keyEvent);
            }
        });
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.sdb0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                vdb0.m200927F(this.f167394a, dialogInterface);
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.tdb0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                vdb0.m200930I(this.f173322a, dialogInterface);
            }
        });
        m200944O().setOnClickListener(new View.OnClickListener() { // from class: l.udb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vdb0.m200926E(this.f178515a, view);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    private final void m200936U() {
        C8940b c8940b = new C8940b(this.act, this.purchaseTypes, this.from);
        this.mediatorsManager = c8940b;
        c8940b.m55230b();
        C8940b c8940b2 = this.mediatorsManager;
        if (c8940b2 != null) {
            c8940b2.m55232d();
        }
    }

    /* JADX INFO: renamed from: V */
    private final void m200937V() {
        ViewGroup.LayoutParams layoutParams = m200945P().getLayoutParams();
        layoutParams.getClass();
        ((FrameLayout.LayoutParams) layoutParams).topMargin = bnl0.m105511F0();
        PurchaseTrackPageType purchaseTrackPageType = PurchaseTrackPageType.page_fullscreen_one;
        if (this.purchaseTypes.size() > 1) {
            purchaseTrackPageType = PurchaseTrackPageType.page_fullscreen_two;
            ViewGroup.LayoutParams layoutParams2 = m200947R().getLayoutParams();
            layoutParams2.getClass();
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
            int i = qa00.f156338y;
            layoutParams3.leftMargin = i;
            layoutParams3.rightMargin = i;
        }
        m200947R().m55355c(this.purchaseTypes);
        int iMin = Math.min(this.selectedIdx, this.purchaseTypes.size() - 1);
        ProductCategory productCategory = this.purchaseTypes.get(iMin).productCategory();
        productCategory.getClass();
        beb0 beb0Var = new beb0(productCategory, purchaseTrackPageType, this.from);
        xdb0 xdb0Var = new xdb0(this.act, this.purchaseTypes, this.privileges, this.from, beb0Var);
        this.purchasePageNewAdapter = xdb0Var;
        C8940b c8940b = this.mediatorsManager;
        if (c8940b != null) {
            xdb0Var.m210451v(c8940b);
        }
        xdb0Var.m210449t(this.dialogStateAction);
        xdb0Var.m210454y(this.onlineMatchPushUser);
        xdb0Var.m210453x(this.onPaymentSuccess);
        xdb0Var.m210452w(this.onPaymentFailedAction);
        if (iMin == 0) {
            ProductCategory productCategory2 = this.purchaseTypes.get(iMin).productCategory();
            productCategory2.getClass();
            beb0Var.m154344v(productCategory2);
        }
        xdb0Var.m210450u(iMin);
        m200946Q().setAdapter(this.purchasePageNewAdapter);
        m200946Q().m4187d(new C20817c());
        int iMin2 = Math.min(this.selectedIdx, this.purchaseTypes.size() - 1);
        PurchaseType purchaseType = this.purchaseTypes.get(iMin2);
        m200947R().setupWithViewPager(m200946Q());
        m200946Q().setCurrentItem(iMin2);
        m200940Y(purchaseType);
        m200939X(purchaseType);
        m200947R().m55354b(purchaseType);
    }

    /* JADX INFO: renamed from: W */
    private final void m200938W() {
        xdb0 xdb0Var = this.purchasePageNewAdapter;
        if (xdb0Var != null) {
            xdb0Var.m210448s();
        }
    }

    /* JADX INFO: renamed from: X */
    private final void m200939X(PurchaseType currentPurchaseType) {
        m200944O().setImageDrawable(CoreModule.f18263b.getDrawable(wib0.m206565i(currentPurchaseType) ? jbc0.f119386R6 : jbc0.f119289K6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public final void m200940Y(PurchaseType purchaseType) {
        if (wib0.m206580x(purchaseType)) {
            m200948S().setImageResource(jbc0.f119154Ab);
            return;
        }
        if (wib0.m206563g(purchaseType)) {
            m200948S().setImageResource(jbc0.f119405T);
            return;
        }
        if (!wib0.m206565i(purchaseType)) {
            if (wib0.m206573q(purchaseType)) {
                m200948S().setImageResource(jbc0.f119770t7);
                return;
            } else {
                m200948S().setImageResource(jbc0.f119784u7);
                return;
            }
        }
        m200948S().setImageResource(jbc0.f119756s7);
        ViewGroup.LayoutParams layoutParams = m200948S().getLayoutParams();
        layoutParams.height = -1;
        m200948S().setLayoutParams(layoutParams);
        m200948S().setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    /* JADX INFO: renamed from: Z */
    private final void m200941Z() {
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
    public final void m200942f0(List<? extends Privilege> privileges) {
        this.privileges = privileges;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final View m200943J(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM205854b = wdb0.m205854b(this, inflater, parent);
        viewM205854b.getClass();
        return viewM205854b;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final VImage m200944O() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final LinearLayout m200945P() {
        LinearLayout linearLayout = this._content;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final VPager m200946Q() {
        VPager vPager = this._pager;
        if (vPager != null) {
            return vPager;
        }
        Intrinsics.m88391r("_pager");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final PurchasePageTabsContainerView m200947R() {
        PurchasePageTabsContainerView purchasePageTabsContainerView = this._tabs_container;
        if (purchasePageTabsContainerView != null) {
            return purchasePageTabsContainerView;
        }
        Intrinsics.m88391r("_tabs_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final VImage m200948S() {
        VImage vImage = this._top_bg;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_top_bg");
        return null;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m200949a0(@Nullable x20 onCloseCallback) {
        this.onCloseCallback = onCloseCallback;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m200950b0(@Nullable x20 dismiss) {
        this.dismiss = dismiss;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m200951c0(@Nullable x20 onKeyBackCallback) {
        this.onKeyBackCallback = onKeyBackCallback;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m200952d0(@Nullable a30<PurchaseType, Act, String> onPaymentSuccess) {
        this.onPaymentSuccess = onPaymentSuccess;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m200953e0(@Nullable String other) {
        this.onlineMatchPushUser = other;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m200954g0(int selectedIdx) {
        this.selectedIdx = selectedIdx;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0075a, p153l.nu0, android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater layoutInflater = this.act.getLayoutInflater();
        layoutInflater.getClass();
        View viewM200943J = m200943J(layoutInflater, null);
        m200936U();
        m200937V();
        setContentView(viewM200943J);
        m200941Z();
        m200935T();
    }

    @Override // p153l.g1e, android.content.DialogInterface.OnShowListener
    public void onShow(@Nullable DialogInterface dialog) {
        super.onShow(dialog);
    }

    /* JADX INFO: renamed from: l.vdb0$c */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, m88121d2 = {"l/vdb0$c", "Landroidx/viewpager/widget/ViewPager$j;", "", "position", "", "positionOffset", "positionOffsetPixels", "", "onPageScrolled", "(IFI)V", "onPageSelected", "(I)V", "state", "onPageScrollStateChanged", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20817c implements ViewPager.InterfaceC0718j {
        public C20817c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int position) {
            PurchaseType purchaseType = (PurchaseType) vdb0.this.purchaseTypes.get(position);
            vdb0.this.m200940Y(purchaseType);
            vdb0.this.m200947R().m55354b(purchaseType);
            xdb0 xdb0Var = vdb0.this.purchasePageNewAdapter;
            if (xdb0Var != null) {
                xdb0Var.m210446q(purchaseType);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int state) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }
    }
}
