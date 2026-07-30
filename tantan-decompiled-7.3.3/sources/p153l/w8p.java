package p153l;

import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
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
import com.p051p1.mobile.putong.core.p058ui.purchase.intlpage.IntlPurchasePageTabsContainerView;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.Careers;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VPager;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ®\u00012\u00020\u0001:\u0004¯\u0001°\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\rJ\u000f\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\rJ\u0019\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0005H\u0002¢\u0006\u0004\b#\u0010!J\u000f\u0010$\u001a\u00020\u000bH\u0002¢\u0006\u0004\b$\u0010\rJ\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0005H\u0002¢\u0006\u0004\b%\u0010!J\u000f\u0010&\u001a\u00020\u000bH\u0002¢\u0006\u0004\b&\u0010\rJ\u001f\u0010)\u001a\u00020\u000b2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u0004H\u0002¢\u0006\u0004\b)\u0010*J\u001f\u00100\u001a\u00020/2\u0006\u0010,\u001a\u00020+2\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b0\u00101J\u0019\u00104\u001a\u00020\u000b2\b\u00103\u001a\u0004\u0018\u000102H\u0014¢\u0006\u0004\b4\u00105J\u0019\u00108\u001a\u00020\u000b2\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b8\u00109J+\u0010<\u001a\u00020\u000b2\u001c\u0010;\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010:¢\u0006\u0004\b<\u0010=J\u0015\u0010?\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u000f¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020\u000b2\b\u0010A\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020\u000b2\b\u0010E\u001a\u0004\u0018\u00010D¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\u000b2\b\u0010H\u001a\u0004\u0018\u00010D¢\u0006\u0004\bI\u0010GJ\u0017\u0010K\u001a\u00020\u000b2\b\u0010J\u001a\u0004\u0018\u00010D¢\u0006\u0004\bK\u0010GJ\u0015\u0010N\u001a\u00020\u000b2\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bN\u0010OJ\r\u0010P\u001a\u00020\u000f¢\u0006\u0004\bP\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\"\u0010^\u001a\u00020W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010f\u001a\u00020_8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010n\u001a\u00020g8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010r\u001a\u00020_8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bo\u0010a\u001a\u0004\bp\u0010c\"\u0004\bq\u0010eR\"\u0010z\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\"\u0010~\u001a\u00020_8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b{\u0010a\u001a\u0004\b|\u0010c\"\u0004\b}\u0010eR)\u0010\u0086\u0001\u001a\u00020\u007f8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R*\u0010\u008e\u0001\u001a\u00030\u0087\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001c\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001f\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010TR\u001a\u0010J\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001a\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010VR\u0017\u0010>\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010pR\u0018\u0010M\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R.\u0010;\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R-\u0010\u009e\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009c\u0001R\u001a\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u0095\u0001R\u001a\u0010H\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010\u0095\u0001R)\u0010\"\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0005\b¥\u0001\u0010!R&\u0010§\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¦\u0001\u0010p\u001a\u0005\b§\u0001\u0010\u0011\"\u0005\b¨\u0001\u0010@R'\u0010\u00ad\u0001\u001a\u0012\u0012\r\u0012\u000b ª\u0001*\u0004\u0018\u00010L0L0©\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001¨\u0006±\u0001"}, m88121d2 = {"Ll/w8p;", "Ll/g1e;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseTypes", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ljava/lang/String;)V", "", "z0", "()V", "q0", "", "y0", "()Z", "i0", "h0", "f0", "isFromPayFail", "A0", "(Z)Z", "isUltra", "C0", "(ZZ)Z", "Lcom/p1/mobile/putong/data/User;", Careers.f39580it, "w0", "(Lcom/p1/mobile/putong/data/User;Z)V", "purchaseType", "n0", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "currentPurchaseType", "m0", "g0", "l0", "k0", "Lcom/p1/mobile/putong/core/data/Privilege;", "privileges", "v0", "(Ljava/util/List;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "R", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", OMSTemplateType.dialog, "onShow", "(Landroid/content/DialogInterface;)V", "Ll/a30;", "onPaymentSuccess", "u0", "(Ll/a30;)V", "autoPay", "o0", "(Z)V", BLiveOperationTitleShowType.duration, "p0", "(Ljava/lang/String;)V", "Ll/x20;", "onKeyBackCallback", "t0", "(Ll/x20;)V", "onCloseCallback", "r0", SysnotifListener.ACTION_DISMISS, "s0", "", "selectedIdx", "x0", "(I)V", "j0", "j", "Lcom/p1/mobile/android/app/Act;", "k", "Ljava/util/List;", BLiveStormDanmakuGiftResourceType.f45292l, "Ljava/lang/String;", "Landroid/widget/FrameLayout;", "m", "Landroid/widget/FrameLayout;", "get_layoutrootview", "()Landroid/widget/FrameLayout;", "set_layoutrootview", "(Landroid/widget/FrameLayout;)V", "_layoutrootview", "Lv/VImage;", "n", "Lv/VImage;", "Y", "()Lv/VImage;", "set_bg", "(Lv/VImage;)V", "_bg", "Landroid/widget/LinearLayout;", "o", "Landroid/widget/LinearLayout;", "a0", "()Landroid/widget/LinearLayout;", "set_content", "(Landroid/widget/LinearLayout;)V", "_content", "p", "Z", "set_close", "_close", "Lv/VText;", "q", "Lv/VText;", "d0", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "r", "e0", "set_title_img", "_title_img", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePageTabsContainerView;", BLiveStormDanmakuGiftResourceType.f45294s, "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePageTabsContainerView;", "c0", "()Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePageTabsContainerView;", "set_tabs_container", "(Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePageTabsContainerView;)V", "_tabs_container", "Lv/VPager;", Constants.KEY_T, "Lv/VPager;", "b0", "()Lv/VPager;", "set_pager", "(Lv/VPager;)V", "_pager", "Ll/y8p;", "u", "Ll/y8p;", "purchasePageNewAdapter", ResourceDirection.f39656v, "w", "Ll/x20;", BaseSei.f14624X, "defaultSkuDuration", BaseSei.f14625Y, BaseSei.f14626Z, "I", "A", "Ll/a30;", "B", "onPaymentFailedAction", c4s.C_ZONE, "D", "E", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getCurrentPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "setCurrentPurchaseType", "F", "isSelectUpgrade", "setSelectUpgrade", "Ll/y20;", "kotlin.jvm.PlatformType", "G", "Ll/y20;", "dialogStateAction", "Companion", "b", "a", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class w8p extends g1e {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public a30<PurchaseType, Act, String> onPaymentSuccess;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public a30<PurchaseType, Act, String> onPaymentFailedAction;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public x20 onKeyBackCallback;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    public x20 onCloseCallback;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    public PurchaseType currentPurchaseType;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public boolean isSelectUpgrade;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
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
    public VImage _bg;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public LinearLayout _content;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public VImage _close;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public VImage _title_img;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public IntlPurchasePageTabsContainerView _tabs_container;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public VPager _pager;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public y8p purchasePageNewAdapter;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public List<? extends Privilege> privileges;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public x20 dismiss;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public String defaultSkuDuration;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public boolean autoPay;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public int selectedIdx;

    /* JADX INFO: renamed from: l.w8p$a */
    @Metadata(m88120d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0016\u0010\u0010J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001d\u001a\u00020\u00002\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b$\u0010\"J\u0017\u0010&\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b&\u0010\"J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\r\u0010+\u001a\u00020*¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010-R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010.R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010.R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010/R\u0018\u0010%\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u00100R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00101R,\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00102R\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00100R\u0018\u00103\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010/R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00104R\u0018\u0010#\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u00100¨\u00065"}, m88121d2 = {"Ll/w8p$a;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "types", "Lcom/p1/mobile/putong/core/data/Privilege;", "privileges", RXScreenCaptureService.KEY_INDEX, "(Ljava/util/List;Ljava/util/List;)Ll/w8p$a;", "", "from", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Ll/w8p$a;", "", "selectedIdx", "j", "(I)Ll/w8p$a;", BLiveOperationTitleShowType.duration, "c", "", "autoPay", "b", "(Z)Ll/w8p$a;", "Ll/a30;", "onPaymentSuccess", "h", "(Ll/a30;)Ll/w8p$a;", "Ll/x20;", "onKeyBackCallback", "g", "(Ll/x20;)Ll/w8p$a;", "onCloseCallback", "e", SysnotifListener.ACTION_DISMISS, "f", "Ll/w8p;", "a", "()Ll/w8p;", "", "k", "()V", "Lcom/p1/mobile/android/app/Act;", "Ljava/util/List;", "Ljava/lang/String;", "Ll/x20;", "I", "Ll/a30;", "defaultSkuDuration", "Z", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C21047a {

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
        public a30<PurchaseType, Act, String> onPaymentSuccess;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public x20 onKeyBackCallback;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public String defaultSkuDuration;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        public boolean autoPay;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @Nullable
        public x20 onCloseCallback;

        public C21047a(@NotNull Act act) {
            act.getClass();
            this.act = act;
            this.types = CollectionsKt.emptyList();
            this.privileges = CollectionsKt.emptyList();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final w8p m205512a() {
            w8p w8pVar = new w8p(this.act, this.types, this.from);
            w8pVar.m205487v0(this.privileges);
            w8pVar.m205508u0(this.onPaymentSuccess);
            w8pVar.m205507t0(this.onKeyBackCallback);
            w8pVar.m205505r0(this.onCloseCallback);
            w8pVar.m205506s0(this.dismiss);
            w8pVar.m205509x0(this.selectedIdx);
            w8pVar.m205504p0(this.defaultSkuDuration);
            w8pVar.m205503o0(this.autoPay);
            return w8pVar;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C21047a m205513b(boolean autoPay) {
            this.autoPay = autoPay;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final C21047a m205514c(@Nullable String duration) {
            this.defaultSkuDuration = duration;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final C21047a m205515d(@Nullable String from) {
            this.from = from;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final C21047a m205516e(@Nullable x20 onCloseCallback) {
            this.onCloseCallback = onCloseCallback;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final C21047a m205517f(@Nullable x20 dismiss) {
            this.dismiss = dismiss;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final C21047a m205518g(@Nullable x20 onKeyBackCallback) {
            this.onKeyBackCallback = onKeyBackCallback;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final C21047a m205519h(@Nullable a30<PurchaseType, Act, String> onPaymentSuccess) {
            this.onPaymentSuccess = onPaymentSuccess;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: i */
        public final C21047a m205520i(@NotNull List<? extends PurchaseType> types, @NotNull List<? extends Privilege> privileges) {
            types.getClass();
            privileges.getClass();
            this.types = types;
            this.privileges = privileges;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: j */
        public final C21047a m205521j(int selectedIdx) {
            this.selectedIdx = selectedIdx;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public final void m205522k() {
            m205512a().show();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w8p(@NotNull Act act, @NotNull List<? extends PurchaseType> list, @Nullable String str) {
        super(act, false, dgc0.f88277b);
        act.getClass();
        list.getClass();
        this.act = act;
        this.purchaseTypes = list;
        this.from = str;
        this.dialogStateAction = new y20() { // from class: l.j8p
            @Override // p153l.y20
            public final void call(Object obj) {
                w8p.m205466H(this.f118797a, ((Integer) obj).intValue());
            }
        };
    }

    /* JADX INFO: renamed from: B0 */
    public static /* synthetic */ boolean m205461B0(w8p w8pVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return w8pVar.m205489A0(z);
    }

    /* JADX INFO: renamed from: C0 */
    private final boolean m205462C0(boolean isFromPayFail, final boolean isUltra) {
        return isUltra ? ubp.INSTANCE.m195276D(this.act, new y20() { // from class: l.s8p
            @Override // p153l.y20
            public final void call(Object obj) {
                w8p.m205464F(this.f166837a, isUltra, (User) obj);
            }
        }, new y20() { // from class: l.t8p
            @Override // p153l.y20
            public final void call(Object obj) {
                w8p.m205465G(this.f172559a, isUltra, (User) obj);
            }
        }, new y20() { // from class: l.u8p
            @Override // p153l.y20
            public final void call(Object obj) {
                w8p.m205467I(this.f178064a, isUltra, (User) obj);
            }
        }, isFromPayFail, this.from, this, null) : ubp.INSTANCE.m195275C(this.act, new Runnable() { // from class: l.v8p
            @Override // java.lang.Runnable
            public final void run() {
                w8p.m205474P(this.f182886a, isUltra);
            }
        }, new y20() { // from class: l.k8p
            @Override // p153l.y20
            public final void call(Object obj) {
                w8p.m205470L(this.f124405a, isUltra, (User) obj);
            }
        }, new y20() { // from class: l.l8p
            @Override // p153l.y20
            public final void call(Object obj) {
                w8p.m205463E(this.f130505a, isUltra, (User) obj);
            }
        }, new y20() { // from class: l.m8p
            @Override // p153l.y20
            public final void call(Object obj) {
                w8p.m205468J(this.f135269a, isUltra, (User) obj);
            }
        }, isFromPayFail, this.from, this, null);
    }

    /* JADX INFO: renamed from: E */
    public static void m205463E(w8p w8pVar, boolean z, User user) {
        w8pVar.m205488w0(user, z);
        ubp.payFromSalvageAction = "liked";
    }

    /* JADX INFO: renamed from: F */
    public static void m205464F(w8p w8pVar, boolean z, User user) {
        w8pVar.m205488w0(user, z);
        ubp.payFromSalvageAction = user == null ? "" : "oneMath";
    }

    /* JADX INFO: renamed from: G */
    public static void m205465G(w8p w8pVar, boolean z, User user) {
        w8pVar.m205488w0(user, z);
        ubp.payFromSalvageAction = "oneMath";
    }

    /* JADX INFO: renamed from: H */
    public static void m205466H(w8p w8pVar, int i) {
        if (i == -1) {
            w8pVar.hide();
            return;
        }
        if (i != 0) {
            if (i == 1) {
                w8pVar.show();
                return;
            } else if (i != 2) {
                if (i != 5) {
                    return;
                }
                w8pVar.m205489A0(true);
                return;
            }
        }
        w8pVar.m205511z0();
        w8pVar.dismiss();
    }

    /* JADX INFO: renamed from: I */
    public static void m205467I(w8p w8pVar, boolean z, User user) {
        w8pVar.m205488w0(user, z);
        ubp.payFromSalvageAction = "seeProfile";
    }

    /* JADX INFO: renamed from: J */
    public static void m205468J(w8p w8pVar, boolean z, User user) {
        w8pVar.m205488w0(user, z);
        ubp.payFromSalvageAction = "seeProfile";
    }

    /* JADX INFO: renamed from: K */
    public static boolean m205469K(w8p w8pVar, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (i != 4 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 0) {
            return false;
        }
        if (!m205461B0(w8pVar, false, 1, null)) {
            w8pVar.dialogStateAction.call(0);
            x20 x20Var = w8pVar.onKeyBackCallback;
            if (x20Var != null) {
                x20Var.call();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: L */
    public static void m205470L(w8p w8pVar, boolean z, User user) {
        w8pVar.m205488w0(user, z);
        ubp.payFromSalvageAction = MatchFrom.superLiked;
    }

    /* JADX INFO: renamed from: M */
    public static void m205471M(w8p w8pVar, DialogInterface dialogInterface) {
        CoreModule.m30933P().m143405a().mo34311E9();
        int iMin = Math.min(w8pVar.m205494b0().getCurrentItem(), w8pVar.purchaseTypes.size() - 1);
        y8p y8pVar = w8pVar.purchasePageNewAdapter;
        if (y8pVar != null) {
            y8pVar.m214765r(iMin);
        }
        w8pVar.m205485k0();
        x20 x20Var = w8pVar.dismiss;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m205472N(w8p w8pVar, DialogInterface dialogInterface) {
        w8pVar.m205485k0();
    }

    /* JADX INFO: renamed from: O */
    public static void m205473O(w8p w8pVar, View view) {
        if (m205461B0(w8pVar, false, 1, null)) {
            return;
        }
        x20 x20Var = w8pVar.onCloseCallback;
        if (x20Var != null) {
            x20Var.call();
        }
        w8pVar.dialogStateAction.call(0);
        w8pVar.dismiss();
    }

    /* JADX INFO: renamed from: P */
    public static void m205474P(w8p w8pVar, boolean z) {
        w8pVar.m205488w0(null, z);
        ubp.payFromSalvageAction = "";
    }

    /* JADX INFO: renamed from: Q */
    public static void m205475Q(w8p w8pVar, boolean z) {
        w8pVar.isSelectUpgrade = z;
        PurchaseType purchaseType = w8pVar.currentPurchaseType;
        purchaseType.getClass();
        w8pVar.m205501m0(purchaseType);
    }

    /* JADX INFO: renamed from: f0 */
    private final void m205482f0() {
        m128501y();
        m128500x();
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.o8p
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return w8p.m205469K(this.f145454a, dialogInterface, i, keyEvent);
            }
        });
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.p8p
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                w8p.m205472N(this.f151053a, dialogInterface);
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.q8p
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w8p.m205471M(this.f156153a, dialogInterface);
            }
        });
        m205492Z().setOnClickListener(new View.OnClickListener() { // from class: l.r8p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w8p.m205473O(this.f161745a, view);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    private final void m205483g0() {
        if (ubp.INSTANCE.m195285t()) {
            CoreModule.f18264c.f20314H2.m108611j3();
        }
        duringCreated(CoreModule.f18264c.f20311G2.f131284S).subscribe(psd0.m173596G(new y20() { // from class: l.n8p
            @Override // p153l.y20
            public final void call(Object obj) {
                w8p.m205475Q(this.f140702a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    private final void m205484h0() {
        ViewGroup.LayoutParams layoutParams = m205493a0().getLayoutParams();
        layoutParams.getClass();
        ((FrameLayout.LayoutParams) layoutParams).topMargin = bnl0.m105511F0();
        PurchaseTrackPageType purchaseTrackPageType = PurchaseTrackPageType.page_fullscreen_one;
        if (this.purchaseTypes.size() > 1) {
            purchaseTrackPageType = PurchaseTrackPageType.page_fullscreen_two;
            bnl0.m105524M(m205495c0(), true);
        } else {
            bnl0.m105524M(m205495c0(), false);
        }
        m205495c0().m55120c(this.purchaseTypes);
        int iMin = Math.min(this.selectedIdx, this.purchaseTypes.size() - 1);
        ProductCategory productCategory = this.purchaseTypes.get(iMin).productCategory();
        productCategory.getClass();
        beb0 beb0Var = new beb0(productCategory, purchaseTrackPageType, this.from);
        y8p y8pVar = new y8p(this.act, this.purchaseTypes, this.privileges, this.from, beb0Var);
        this.purchasePageNewAdapter = y8pVar;
        y8pVar.m214770w(this.dialogStateAction);
        y8pVar.m214773z(this.onPaymentSuccess);
        y8pVar.m214772y(this.onPaymentFailedAction);
        if (iMin == 0) {
            ProductCategory productCategory2 = this.purchaseTypes.get(iMin).productCategory();
            productCategory2.getClass();
            beb0Var.m154344v(productCategory2);
        }
        y8pVar.m214771x(iMin);
        y8pVar.m214769v(this.defaultSkuDuration);
        y8pVar.m214768u(this.autoPay);
        m205494b0().setAdapter(this.purchasePageNewAdapter);
        m205494b0().setScrollble(false);
        m205494b0().m4187d(new C21049c());
        int iMin2 = Math.min(this.selectedIdx, this.purchaseTypes.size() - 1);
        PurchaseType purchaseType = this.purchaseTypes.get(iMin2);
        m205495c0().setupWithViewPager(m205494b0());
        m205494b0().setCurrentItem(iMin2);
        m205501m0(purchaseType);
        m205502n0(purchaseType);
        m205500l0(purchaseType);
        m205495c0().m55119b(purchaseType);
    }

    /* JADX INFO: renamed from: k0 */
    private final void m205485k0() {
        y8p y8pVar = this.purchasePageNewAdapter;
        if (y8pVar != null) {
            y8pVar.m214767t();
        }
    }

    /* JADX INFO: renamed from: q0 */
    private final void m205486q0() {
        Window window;
        Window window2 = getWindow();
        if (window2 != null) {
            window2.clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.addFlags(Integer.MIN_VALUE);
        }
        Window window4 = getWindow();
        if (window4 != null) {
            window4.setStatusBarColor(0);
        }
        PutongAct.setLightStatusBar(getWindow(), EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
        if (!m205510y0() || (window = getWindow()) == null) {
            return;
        }
        window.setWindowAnimations(dgc0.f88281f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public final void m205487v0(List<? extends Privilege> privileges) {
        this.privileges = privileges;
    }

    /* JADX INFO: renamed from: w0 */
    private final void m205488w0(User it, boolean isUltra) {
        y8p y8pVar = this.purchasePageNewAdapter;
        if (y8pVar != null) {
            PurchaseType purchaseType = this.currentPurchaseType;
            purchaseType.getClass();
            y8pVar.m214766s(purchaseType);
        }
        ubp.INSTANCE.m195273A(it);
    }

    /* JADX INFO: renamed from: A0 */
    public final boolean m205489A0(boolean isFromPayFail) {
        PurchaseType purchaseType = this.currentPurchaseType;
        PurchaseType purchaseType2 = PurchaseType.TYPE_ULTRA_PREMIUM;
        if (purchaseType == purchaseType2 || (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && !m205499j0())) {
            if (m205462C0(isFromPayFail, this.currentPurchaseType == purchaseType2)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final View m205490R(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM209749b = x8p.m209749b(this, inflater, parent);
        viewM209749b.getClass();
        return viewM209749b;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final VImage m205491Y() {
        VImage vImage = this._bg;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final VImage m205492Z() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final LinearLayout m205493a0() {
        LinearLayout linearLayout = this._content;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final VPager m205494b0() {
        VPager vPager = this._pager;
        if (vPager != null) {
            return vPager;
        }
        Intrinsics.m88391r("_pager");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final IntlPurchasePageTabsContainerView m205495c0() {
        IntlPurchasePageTabsContainerView intlPurchasePageTabsContainerView = this._tabs_container;
        if (intlPurchasePageTabsContainerView != null) {
            return intlPurchasePageTabsContainerView;
        }
        Intrinsics.m88391r("_tabs_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final VText m205496d0() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final VImage m205497e0() {
        VImage vImage = this._title_img;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_title_img");
        return null;
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m205498i0() {
        return CollectionsKt.firstOrNull((List) this.purchaseTypes) == PurchaseType.TYPE_GET_LIKERS;
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m205499j0() {
        if (jyb.m147479J(this.purchaseTypes)) {
            return false;
        }
        if (CoreModule.f18264c.f20396j0.m31611T4() && (this.purchaseTypes.get(0) == PurchaseType.TYPE_GET_VIP || this.purchaseTypes.get(0) == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE)) {
            return false;
        }
        if ((this.purchaseTypes.get(0) == PurchaseType.TYPE_GET_VIP || this.purchaseTypes.get(0) == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) && (CoreModule.f18264c.f20396j0.m31577B4() || CoreModule.f18264c.f20396j0.m31646y4())) {
            return true;
        }
        return this.purchaseTypes.get(0) == PurchaseType.TYPE_GET_LIKERS && CoreModule.f18264c.f20396j0.m31575A4();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m205500l0(PurchaseType currentPurchaseType) {
        int i;
        VImage vImageM205492Z = m205492Z();
        Application application = CoreModule.f18263b;
        if (wib0.m206573q(currentPurchaseType)) {
            i = jbc0.f119765t2;
        } else {
            i = wib0.m206578v(currentPurchaseType) ? jbc0.f119835y2 : jbc0.f119434V2;
        }
        vImageM205492Z.setImageDrawable(application.getDrawable(i));
    }

    /* JADX INFO: renamed from: m0 */
    public final void m205501m0(PurchaseType currentPurchaseType) {
        String string;
        int color;
        this.currentPurchaseType = currentPurchaseType;
        if (currentPurchaseType == PurchaseType.TYPE_GET_VIP) {
            bnl0.m105524M(m205497e0(), true);
            bnl0.m105524M(m205496d0(), false);
        } else {
            bnl0.m105524M(m205497e0(), false);
            bnl0.m105524M(m205496d0(), true);
            m205496d0().setTypeface(Typeface.defaultFromStyle(1));
            VText vTextM205496d0 = m205496d0();
            if (wib0.m206573q(currentPurchaseType)) {
                string = this.isSelectUpgrade ? getContext().getString(R$string.f28508y3) : getContext().getString(R$string.f28097O4);
            } else if (currentPurchaseType == PurchaseType.TYPE_GET_LIKERS) {
                string = getContext().getString(R$string.f28119Q4);
            } else if (wib0.m206578v(currentPurchaseType)) {
                string = this.isSelectUpgrade ? getContext().getString(R$string.f27942A3) : getContext().getString(R$string.f28163U4);
            } else {
                string = getContext().getString(R$string.f28010G5);
            }
            vTextM205496d0.setText(string);
            if (wib0.m206573q(currentPurchaseType)) {
                color = Color.parseColor("#EDD6A3");
            } else if (wib0.m206578v(currentPurchaseType)) {
                color = Color.parseColor("#F9E7FF");
            } else {
                color = currentPurchaseType == PurchaseType.TYPE_GET_LIKERS ? Color.parseColor("#cc000000") : Color.parseColor("#cc000000");
            }
            m205496d0().setTextColor(color);
        }
        i9b0.INSTANCE.m139092a(currentPurchaseType);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m205502n0(PurchaseType purchaseType) {
        String str;
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IldLWktPQlpEVkJXTVhBRTU3SUVQWE9aTzczV1lGWjE0IiwidyI6MTEyNSwiaCI6MjQzNiwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjExNTI5MzU2MDU5NjY4MTYwNTUxfQ.png";
        } else if (purchaseType == PurchaseType.TYPE_GET_LIKERS) {
            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IllCSjdWREtCWkZLRFNBVDZZM1BYU09WV04zTEFOWDE0IiwidyI6MTEyNSwiaCI6MjQzNiwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjQ2Mjk3MDA2OTE4MTUzMDEyNDh9.png";
        } else {
            str = wib0.m206578v(purchaseType) ? "https://auto.tancdn.com/v1/images/eyJpZCI6IllBSzNZV0RJT1hMWVNLQVdQSEJCM0MzTVlPRkdCNzE0IiwidyI6NzUwLCJoIjoxNjI0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTEzNTgxMjg0ODY4MDE1OH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IjNVNFdQSVA3UVI1WjdOQVU1N0JIMjRTSEpaVElLWDE0IiwidyI6MTEyNSwiaCI6MjQzNiwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjE2MjIwMDIzMDIwNzQzODg0OH0.png";
        }
        uqb0.f180374G.m127098D(m205491Y(), str);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m205503o0(boolean autoPay) {
        this.autoPay = autoPay;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0075a, p153l.nu0, android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater layoutInflater = this.act.getLayoutInflater();
        layoutInflater.getClass();
        View viewM205490R = m205490R(layoutInflater, null);
        m205483g0();
        m205484h0();
        setContentView(viewM205490R);
        m205486q0();
        m205482f0();
    }

    @Override // p153l.g1e, android.content.DialogInterface.OnShowListener
    public void onShow(@Nullable DialogInterface dialog) {
        super.onShow(dialog);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m205504p0(@Nullable String duration) {
        this.defaultSkuDuration = duration;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m205505r0(@Nullable x20 onCloseCallback) {
        this.onCloseCallback = onCloseCallback;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m205506s0(@Nullable x20 dismiss) {
        this.dismiss = dismiss;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m205507t0(@Nullable x20 onKeyBackCallback) {
        this.onKeyBackCallback = onKeyBackCallback;
    }

    /* JADX INFO: renamed from: u0 */
    public final void m205508u0(@Nullable a30<PurchaseType, Act, String> onPaymentSuccess) {
        this.onPaymentSuccess = onPaymentSuccess;
    }

    /* JADX INFO: renamed from: x0 */
    public final void m205509x0(int selectedIdx) {
        this.selectedIdx = selectedIdx;
    }

    /* JADX INFO: renamed from: y0 */
    public final boolean m205510y0() {
        if (m205498i0()) {
            return false;
        }
        return Intrinsics.m88377d(this.from, "p_navigation_view,e_intl_me_subscription_card,click") || Intrinsics.m88377d(this.from, "p_suggest_users_home_view,e_premium_promo_50off_card,click") || Intrinsics.m88377d(this.from, "p_navigation_view,e_intl_renew_guiding_banner,click") || Intrinsics.m88377d(this.from, "p_navigation_view,e_intl_me_tab_sub_privilege_list_click,click") || Intrinsics.m88377d(this.from, "p_navigation_view,e_intl_me_tab_sub_btn_click,click") || Intrinsics.m88377d(this.from, "p_navigation_view,e_intl_me_tab_consumables_sku_click,click");
    }

    /* JADX INFO: renamed from: z0 */
    public final void m205511z0() {
        if (m205499j0()) {
            Intent intentM81348b2 = WebViewAct.m81348b2(this.act, CoreModule.f18264c.f20396j0.m31579C4().titleText, CoreModule.f18264c.f20396j0.m31579C4().promotionUrl, true);
            intentM81348b2.putExtra("hideNavigationBar", true);
            this.act.startActivity(intentM81348b2);
        }
    }

    /* JADX INFO: renamed from: l.w8p$c */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, m88121d2 = {"l/w8p$c", "Landroidx/viewpager/widget/ViewPager$j;", "", "position", "", "positionOffset", "positionOffsetPixels", "", "onPageScrolled", "(IFI)V", "onPageSelected", "(I)V", "state", "onPageScrollStateChanged", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C21049c implements ViewPager.InterfaceC0718j {
        public C21049c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int position) {
            PurchaseType purchaseType = (PurchaseType) w8p.this.purchaseTypes.get(position);
            w8p.this.m205501m0(purchaseType);
            w8p.this.m205502n0(purchaseType);
            w8p.this.m205500l0(purchaseType);
            w8p.this.m205495c0().m55119b(purchaseType);
            y8p y8pVar = w8p.this.purchasePageNewAdapter;
            if (y8pVar != null) {
                y8pVar.m214764q(purchaseType);
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
