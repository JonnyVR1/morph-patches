package p153l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p051p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.core.p058ui.purchase.intlpage.IntlPremiumDiscountPurchaseContentView;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u007fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\nJ\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\nJ\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\nJ\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\nJ\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\b2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010 H\u0014¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J+\u0010+\u001a\u00020\b2\u001c\u0010*\u001a\u0018\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010(¢\u0006\u0004\b+\u0010,J)\u0010.\u001a\u00020\b2\u001a\u0010-\u001a\u0016\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010(¢\u0006\u0004\b.\u0010,J\u0017\u00101\u001a\u00020\b2\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\b2\b\u00103\u001a\u0004\u0018\u00010/¢\u0006\u0004\b4\u00102J\u0017\u00106\u001a\u00020\b2\b\u00105\u001a\u0004\u0018\u00010/¢\u0006\u0004\b6\u00102J\u0017\u00108\u001a\u00020\b2\b\u00107\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b8\u00109J\u0015\u0010;\u001a\u00020\b2\u0006\u0010:\u001a\u00020\u0015¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010L\u001a\u00020I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010N\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bM\u0010GR\u0016\u0010R\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010T\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bS\u0010GR\u0016\u0010V\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bU\u0010CR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u00105\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010\\\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010@R\u0016\u0010:\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010\rR,\u0010*\u001a\u0018\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R*\u0010a\u001a\u0016\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010_R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010ZR\u0018\u00103\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010ZR\u0018\u0010g\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010k\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010o\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\"\u0010v\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u0016\u0010x\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010\rR\"\u0010~\u001a\u0010\u0012\f\u0012\n {*\u0004\u0018\u00010z0z0y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}¨\u0006\u0080\u0001"}, m88121d2 = {"Ll/zxo;", "Ll/g1e;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "", "f0", "()V", "i0", "U", "Z", "W", "e0", "d0", "Y", p7f.GPS_MEASUREMENT_INTERRUPTED, "c0", "b0", "", "a0", "()Z", "isFromPayFail", "p0", "(Z)Z", "", "Lcom/p1/mobile/putong/core/data/Privilege;", "privileges", "o0", "(Ljava/util/List;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", OMSTemplateType.dialog, "onShow", "(Landroid/content/DialogInterface;)V", "Ll/a30;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "onPaymentSuccess", "n0", "(Ll/a30;)V", "onPaymentFailed", "m0", "Ll/x20;", "onKeyBackCallback", "l0", "(Ll/x20;)V", "onCloseCallback", "j0", SysnotifListener.ACTION_DISMISS, "k0", BLiveOperationTitleShowType.duration, "h0", "(Ljava/lang/String;)V", "autoPay", "g0", "(Z)V", "j", "Lcom/p1/mobile/android/app/Act;", "k", "Ljava/lang/String;", "Landroid/widget/FrameLayout;", BLiveStormDanmakuGiftResourceType.f45292l, "Landroid/widget/FrameLayout;", "_layoutrootview", "Lv/VImage;", "m", "Lv/VImage;", "_bg", "Landroid/widget/LinearLayout;", "n", "Landroid/widget/LinearLayout;", "_content", "o", "_close", "Lv/VText;", "p", "Lv/VText;", "_title", "q", "_title_img", "r", "_discountContentContainer", BLiveStormDanmakuGiftResourceType.f45294s, "Ljava/util/List;", Constants.KEY_T, "Ll/x20;", "u", "defaultSkuDuration", ResourceDirection.f39656v, "w", "Ll/a30;", BaseSei.f14624X, "onPaymentFailedAction", BaseSei.f14625Y, BaseSei.f14626Z, "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPremiumDiscountPurchaseContentView;", "A", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPremiumDiscountPurchaseContentView;", "discountContentView", "Ll/beb0;", "B", "Ll/beb0;", "purchasePageTrack", "Ljava/util/concurrent/atomic/AtomicBoolean;", c4s.C_ZONE, "Ljava/util/concurrent/atomic/AtomicBoolean;", "fallbackToStandardPremiumPurchaseStarted", "D", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getCurrentPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "setCurrentPurchaseType", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "currentPurchaseType", "E", "isSelectUpgrade", "Ll/y20;", "", "kotlin.jvm.PlatformType", "F", "Ll/y20;", "dialogStateAction", "a", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class zxo extends g1e {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public IntlPremiumDiscountPurchaseContentView discountContentView;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public beb0 purchasePageTrack;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean fallbackToStandardPremiumPurchaseStarted;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public PurchaseType currentPurchaseType;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public boolean isSelectUpgrade;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public final y20<Integer> dialogStateAction;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public final String from;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public FrameLayout _layoutrootview;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VImage _bg;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public LinearLayout _content;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VImage _close;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public VImage _title_img;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public FrameLayout _discountContentContainer;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public List<? extends Privilege> privileges;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public x20 dismiss;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public String defaultSkuDuration;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public boolean autoPay;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public a30<PurchaseType, Act, String> onPaymentSuccess;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public a30<PurchaseType, Act, String> onPaymentFailedAction;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    public x20 onKeyBackCallback;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public x20 onCloseCallback;

    /* JADX INFO: renamed from: l.zxo$a */
    @Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0012\u001a\u00020\u00002\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001b\u0010\u0017J\u0017\u0010\u001d\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001d\u0010\u000eJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\r\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010(R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010)R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010*R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010+R,\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010,R*\u0010-\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010,R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010*R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010/R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010+¨\u00060"}, m88121d2 = {"Ll/zxo$a;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "Lcom/p1/mobile/putong/core/data/Privilege;", "privileges", RXScreenCaptureService.KEY_INDEX, "(Ljava/util/List;)Ll/zxo$a;", "", "from", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Ll/zxo$a;", "Ll/a30;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "onPaymentSuccess", "h", "(Ll/a30;)Ll/zxo$a;", "Ll/x20;", "onKeyBackCallback", "g", "(Ll/x20;)Ll/zxo$a;", "onCloseCallback", "e", SysnotifListener.ACTION_DISMISS, "f", BLiveOperationTitleShowType.duration, "c", "", "autoPay", "b", "(Z)Ll/zxo$a;", "Ll/zxo;", "a", "()Ll/zxo;", "", "j", "()V", "Lcom/p1/mobile/android/app/Act;", "Ljava/util/List;", "Ljava/lang/String;", "Ll/x20;", "Ll/a30;", "onPaymentFailed", "defaultSkuDuration", "Z", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C21918a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Act act;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public List<? extends Privilege> privileges;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public String from;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public x20 dismiss;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public a30<PurchaseType, Act, String> onPaymentSuccess;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public a30<PurchaseType, Act, String> onPaymentFailed;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public x20 onKeyBackCallback;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public String defaultSkuDuration;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public boolean autoPay;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @Nullable
        public x20 onCloseCallback;

        public C21918a(@NotNull Act act) {
            act.getClass();
            this.act = act;
            this.privileges = CollectionsKt.emptyList();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final zxo m222050a() {
            zxo zxoVar = new zxo(this.act, this.from);
            zxoVar.m222048o0(this.privileges);
            zxoVar.m222047n0(this.onPaymentSuccess);
            zxoVar.m222046m0(this.onPaymentFailed);
            zxoVar.m222045l0(this.onKeyBackCallback);
            zxoVar.m222043j0(this.onCloseCallback);
            zxoVar.m222044k0(this.dismiss);
            zxoVar.m222042h0(this.defaultSkuDuration);
            zxoVar.m222041g0(this.autoPay);
            return zxoVar;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C21918a m222051b(boolean autoPay) {
            this.autoPay = autoPay;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final C21918a m222052c(@Nullable String duration) {
            this.defaultSkuDuration = duration;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final C21918a m222053d(@Nullable String from) {
            this.from = from;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final C21918a m222054e(@Nullable x20 onCloseCallback) {
            this.onCloseCallback = onCloseCallback;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final C21918a m222055f(@Nullable x20 dismiss) {
            this.dismiss = dismiss;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final C21918a m222056g(@Nullable x20 onKeyBackCallback) {
            this.onKeyBackCallback = onKeyBackCallback;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final C21918a m222057h(@Nullable a30<PurchaseType, Act, String> onPaymentSuccess) {
            this.onPaymentSuccess = onPaymentSuccess;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: i */
        public final C21918a m222058i(@NotNull List<? extends Privilege> privileges) {
            privileges.getClass();
            this.privileges = privileges;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public final void m222059j() {
            m222050a().show();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zxo(@NotNull Act act, @Nullable String str) {
        super(act, false, dgc0.f88277b);
        act.getClass();
        this.act = act;
        this.from = str;
        this.fallbackToStandardPremiumPurchaseStarted = new AtomicBoolean(false);
        this.currentPurchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        this.dialogStateAction = new y20() { // from class: l.xxo
            @Override // p153l.y20
            public final void call(Object obj) {
                zxo.m222012F(this.f196670a, ((Integer) obj).intValue());
            }
        };
    }

    /* JADX INFO: renamed from: F */
    public static void m222012F(zxo zxoVar, int i) {
        if (i == -1) {
            zxoVar.hide();
            return;
        }
        if (i != 0) {
            if (i == 1) {
                zxoVar.show();
                return;
            } else if (i != 2) {
                if (i == 5 && zxoVar.m222038a0()) {
                    zxoVar.m222049p0(true);
                    return;
                }
                return;
            }
        }
        zxoVar.dismiss();
    }

    /* JADX INFO: renamed from: G */
    public static void m222013G(final zxo zxoVar, DialogInterface dialogInterface) {
        CoreModule.m30933P().m143405a().mo34311E9();
        IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView = zxoVar.discountContentView;
        if (intlPremiumDiscountPurchaseContentView != null) {
            intlPremiumDiscountPurchaseContentView.m55008u0();
        }
        zxoVar.m222030b0();
        x20 x20Var = zxoVar.dismiss;
        if (x20Var != null) {
            x20Var.call();
        }
        l51.m152886F(zxoVar.act, new Runnable() { // from class: l.lxo
            @Override // java.lang.Runnable
            public final void run() {
                zxo.m222028X(this.f133974a);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public static void m222014H(zxo zxoVar, User user) {
        IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView = zxoVar.discountContentView;
        if (intlPremiumDiscountPurchaseContentView != null) {
            intlPremiumDiscountPurchaseContentView.m55012y0();
        }
        ubp.payFromSalvageAction = MatchFrom.superLiked;
    }

    /* JADX INFO: renamed from: I */
    public static dgq0 m222015I(View view, dgq0 dgq0Var) {
        view.getClass();
        dgq0Var.getClass();
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), dgq0Var.m115680f(dgq0.C16531l.m115735d()).f170860d);
        return dgq0Var;
    }

    /* JADX INFO: renamed from: J */
    public static void m222016J(zxo zxoVar, Long l2) {
        if (zxoVar.isShowing()) {
            CoreIntlAffiliatePromotions coreIntlAffiliatePromotions = CoreModule.f18264c.f20438x0;
            l2.getClass();
            IapAffiliatePromotion iapAffiliatePromotionM31221w3 = coreIntlAffiliatePromotions.m31221w3(l2.longValue());
            if (iapAffiliatePromotionM31221w3 == null || !CoreModule.f18264c.f20438x0.m31195f4(iapAffiliatePromotionM31221w3)) {
                zxoVar.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public static void m222017K(zxo zxoVar, User user) {
        IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView = zxoVar.discountContentView;
        if (intlPremiumDiscountPurchaseContentView != null) {
            intlPremiumDiscountPurchaseContentView.m55012y0();
        }
        ubp.payFromSalvageAction = "liked";
    }

    /* JADX INFO: renamed from: L */
    public static void m222018L(zxo zxoVar, View view) {
        if (zxoVar.m222038a0() && m222034q0(zxoVar, false, 1, null)) {
            return;
        }
        x20 x20Var = zxoVar.onCloseCallback;
        if (x20Var != null) {
            x20Var.call();
        }
        zxoVar.dialogStateAction.call(0);
        zxoVar.dismiss();
    }

    /* JADX INFO: renamed from: M */
    public static void m222019M(zxo zxoVar) {
        IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView = zxoVar.discountContentView;
        if (intlPremiumDiscountPurchaseContentView != null) {
            intlPremiumDiscountPurchaseContentView.m55012y0();
        }
        ubp.payFromSalvageAction = "";
    }

    /* JADX INFO: renamed from: N */
    public static boolean m222020N(zxo zxoVar, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (i != 4 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 0) {
            return false;
        }
        if (!zxoVar.m222038a0() || !m222034q0(zxoVar, false, 1, null)) {
            zxoVar.dialogStateAction.call(0);
            x20 x20Var = zxoVar.onKeyBackCallback;
            if (x20Var != null) {
                x20Var.call();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: O */
    public static void m222021O(zxo zxoVar) {
        if (zxoVar.isShowing()) {
            zxoVar.dismiss();
        }
    }

    /* JADX INFO: renamed from: P */
    public static void m222022P(zxo zxoVar, DialogInterface dialogInterface) {
        zxoVar.m222030b0();
    }

    /* JADX INFO: renamed from: Q */
    public static void m222023Q(zxo zxoVar, boolean z) {
        zxoVar.isSelectUpgrade = z;
        zxoVar.m222032d0();
    }

    /* JADX INFO: renamed from: R */
    public static void m222024R(zxo zxoVar) {
        zxoVar.m222040f0();
    }

    /* JADX INFO: renamed from: S */
    public static void m222025S(zxo zxoVar, User user) {
        IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView = zxoVar.discountContentView;
        if (intlPremiumDiscountPurchaseContentView != null) {
            intlPremiumDiscountPurchaseContentView.m55012y0();
        }
        ubp.payFromSalvageAction = "seeProfile";
    }

    /* JADX INFO: renamed from: W */
    private final void m222027W() {
        m128501y();
        m128500x();
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.rxo
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return zxo.m222020N(this.f165362a, dialogInterface, i, keyEvent);
            }
        });
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.sxo
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                zxo.m222022P(this.f171152a, dialogInterface);
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.txo
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                zxo.m222013G(this.f176587a, dialogInterface);
            }
        });
        VImage vImage = this._close;
        if (vImage == null) {
            Intrinsics.m88391r("_close");
            vImage = null;
        }
        vImage.setOnClickListener(new View.OnClickListener() { // from class: l.uxo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zxo.m222018L(this.f181486a, view);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public static final void m222028X(zxo zxoVar) {
        CoreModule.m30933P().m143405a().mo34574qk(zxoVar.act);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0075  */
    /* JADX WARN: Code duplicated, block: B:21:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b9  */
    /* JADX INFO: renamed from: Z */
    private final void m222029Z() {
        Privilege privilege;
        Privilege privilege2;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        LinearLayout linearLayout = this._content;
        FrameLayout frameLayout3 = null;
        if (linearLayout == null) {
            Intrinsics.m88391r("_content");
            linearLayout = null;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.getClass();
        ((FrameLayout.LayoutParams) layoutParams).topMargin = bnl0.m105511F0();
        String strM157249i = m6p.m157249i();
        PurchaseType purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        ProductCategory productCategory = purchaseType.productCategory();
        productCategory.getClass();
        beb0 beb0Var = new beb0(productCategory, PurchaseTrackPageType.page_fullscreen_one, strM157249i);
        this.purchasePageTrack = beb0Var;
        ProductCategory productCategory2 = purchaseType.productCategory();
        productCategory2.getClass();
        beb0Var.m154344v(productCategory2);
        List<? extends Privilege> list = this.privileges;
        if (list == null || jyb.m147479J(list)) {
            ArrayList<Privilege> privilegeData = purchaseType.getPrivilegeData(null);
            if (jyb.m147479J(privilegeData)) {
                privilege = null;
            } else {
                privilege2 = privilegeData.get(0);
            }
            LayoutInflater layoutInflater = this.act.getLayoutInflater();
            int i = rec0.f162433E;
            frameLayout = this._discountContentContainer;
            if (frameLayout == null) {
                Intrinsics.m88391r("_discountContentContainer");
                frameLayout = null;
            }
            View viewInflate = layoutInflater.inflate(i, (ViewGroup) frameLayout, false);
            viewInflate.getClass();
            IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView = (IntlPremiumDiscountPurchaseContentView) viewInflate;
            this.discountContentView = intlPremiumDiscountPurchaseContentView;
            intlPremiumDiscountPurchaseContentView.m55013z0(this.act, purchaseType, privilege, this.from, false);
            intlPremiumDiscountPurchaseContentView.setDialogStateAction(this.dialogStateAction);
            intlPremiumDiscountPurchaseContentView.setOnPaymentSuccess(this.onPaymentSuccess);
            intlPremiumDiscountPurchaseContentView.setOnPaymentFailed(this.onPaymentFailedAction);
            beb0 beb0Var2 = this.purchasePageTrack;
            beb0Var2.getClass();
            intlPremiumDiscountPurchaseContentView.setPurchasePageTrack(beb0Var2);
            intlPremiumDiscountPurchaseContentView.setAutoPay(this.autoPay);
            intlPremiumDiscountPurchaseContentView.setFallbackToStandardPremiumFullscreen(new x20() { // from class: l.vxo
                @Override // p153l.x20
                public final void call() {
                    zxo.m222024R(this.f186286a);
                }
            });
            frameLayout2 = this._discountContentContainer;
            if (frameLayout2 == null) {
                Intrinsics.m88391r("_discountContentContainer");
            } else {
                frameLayout3 = frameLayout2;
            }
            frameLayout3.addView(intlPremiumDiscountPurchaseContentView, new FrameLayout.LayoutParams(-1, -1));
            intlPremiumDiscountPurchaseContentView.m54973C0();
            m222032d0();
            m222039e0();
            m222031c0();
        }
        List<? extends Privilege> list2 = this.privileges;
        list2.getClass();
        privilege2 = list2.get(0);
        privilege = privilege2;
        LayoutInflater layoutInflater2 = this.act.getLayoutInflater();
        int i2 = rec0.f162433E;
        frameLayout = this._discountContentContainer;
        if (frameLayout == null) {
            Intrinsics.m88391r("_discountContentContainer");
            frameLayout = null;
        }
        View viewInflate2 = layoutInflater2.inflate(i2, (ViewGroup) frameLayout, false);
        viewInflate2.getClass();
        IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView2 = (IntlPremiumDiscountPurchaseContentView) viewInflate2;
        this.discountContentView = intlPremiumDiscountPurchaseContentView2;
        intlPremiumDiscountPurchaseContentView2.m55013z0(this.act, purchaseType, privilege, this.from, false);
        intlPremiumDiscountPurchaseContentView2.setDialogStateAction(this.dialogStateAction);
        intlPremiumDiscountPurchaseContentView2.setOnPaymentSuccess(this.onPaymentSuccess);
        intlPremiumDiscountPurchaseContentView2.setOnPaymentFailed(this.onPaymentFailedAction);
        beb0 beb0Var3 = this.purchasePageTrack;
        beb0Var3.getClass();
        intlPremiumDiscountPurchaseContentView2.setPurchasePageTrack(beb0Var3);
        intlPremiumDiscountPurchaseContentView2.setAutoPay(this.autoPay);
        intlPremiumDiscountPurchaseContentView2.setFallbackToStandardPremiumFullscreen(new x20() { // from class: l.vxo
            @Override // p153l.x20
            public final void call() {
                zxo.m222024R(this.f186286a);
            }
        });
        frameLayout2 = this._discountContentContainer;
        if (frameLayout2 == null) {
            Intrinsics.m88391r("_discountContentContainer");
        } else {
            frameLayout3 = frameLayout2;
        }
        frameLayout3.addView(intlPremiumDiscountPurchaseContentView2, new FrameLayout.LayoutParams(-1, -1));
        intlPremiumDiscountPurchaseContentView2.m54973C0();
        m222032d0();
        m222039e0();
        m222031c0();
    }

    /* JADX INFO: renamed from: b0 */
    private final void m222030b0() {
        IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView = this.discountContentView;
        if (intlPremiumDiscountPurchaseContentView != null) {
            intlPremiumDiscountPurchaseContentView.m54972B0();
        }
        this.discountContentView = null;
    }

    /* JADX INFO: renamed from: c0 */
    private final void m222031c0() {
        VImage vImage = this._close;
        if (vImage == null) {
            Intrinsics.m88391r("_close");
            vImage = null;
        }
        vImage.setImageDrawable(CoreModule.f18263b.getDrawable(jbc0.f119765t2));
    }

    /* JADX INFO: renamed from: d0 */
    private final void m222032d0() {
        VImage vImage = this._title_img;
        VText vText = null;
        if (vImage == null) {
            Intrinsics.m88391r("_title_img");
            vImage = null;
        }
        bnl0.m105524M(vImage, false);
        VText vText2 = this._title;
        if (vText2 == null) {
            Intrinsics.m88391r("_title");
            vText2 = null;
        }
        bnl0.m105524M(vText2, true);
        VText vText3 = this._title;
        if (vText3 == null) {
            Intrinsics.m88391r("_title");
            vText3 = null;
        }
        vText3.setTextSize(2, 18.0f);
        VText vText4 = this._title;
        if (vText4 == null) {
            Intrinsics.m88391r("_title");
            vText4 = null;
        }
        vText4.setTypeface(lyh0.m156283c(3), 0);
        VText vText5 = this._title;
        if (vText5 == null) {
            Intrinsics.m88391r("_title");
            vText5 = null;
        }
        vText5.setText(this.isSelectUpgrade ? getContext().getString(R$string.f28508y3) : getContext().getString(R$string.f28097O4));
        VText vText6 = this._title;
        if (vText6 == null) {
            Intrinsics.m88391r("_title");
        } else {
            vText = vText6;
        }
        vText.setTextColor(Color.parseColor("#EDD6A3"));
        i9b0.INSTANCE.m139092a(this.currentPurchaseType);
    }

    /* JADX INFO: renamed from: i0 */
    private final void m222033i0() {
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        nfq0.m162936b(window, false);
        PutongAct.setLightStatusBar(window, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ boolean m222034q0(zxo zxoVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return zxoVar.m222049p0(z);
    }

    /* JADX INFO: renamed from: U */
    public final void m222035U() {
        LinearLayout linearLayout = this._content;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            Intrinsics.m88391r("_content");
            linearLayout = null;
        }
        kkl0.m150194y0(linearLayout, new il50() { // from class: l.wxo
            @Override // p153l.il50
            public final dgq0 onApplyWindowInsets(View view, dgq0 dgq0Var) {
                return zxo.m222015I(view, dgq0Var);
            }
        });
        LinearLayout linearLayout3 = this._content;
        if (linearLayout3 == null) {
            Intrinsics.m88391r("_content");
        } else {
            linearLayout2 = linearLayout3;
        }
        kkl0.m150158g0(linearLayout2);
    }

    /* JADX INFO: renamed from: V */
    public final void m222036V() {
        duringCreated(CoreModule.f18264c.f20438x0.m31212r4()).subscribe(psd0.m173596G(new y20() { // from class: l.qxo
            @Override // p153l.y20
            public final void call(Object obj) {
                zxo.m222016J(this.f160067a, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y */
    public final void m222037Y() {
        duringCreated(CoreModule.f18264c.f20311G2.f131284S).subscribe(psd0.m173596G(new y20() { // from class: l.kxo
            @Override // p153l.y20
            public final void call(Object obj) {
                zxo.m222023Q(this.f129218a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m222038a0() {
        return CoreModule.f18264c.f20438x0.m31193c4();
    }

    /* JADX INFO: renamed from: e0 */
    public final void m222039e0() {
        VImage vImage = this._bg;
        VImage vImage2 = null;
        if (vImage == null) {
            Intrinsics.m88391r("_bg");
            vImage = null;
        }
        vImage.setAdjustViewBounds(true);
        VImage vImage3 = this._bg;
        if (vImage3 == null) {
            Intrinsics.m88391r("_bg");
            vImage3 = null;
        }
        vImage3.setScaleType(ImageView.ScaleType.FIT_START);
        VImage vImage4 = this._bg;
        if (vImage4 == null) {
            Intrinsics.m88391r("_bg");
            vImage4 = null;
        }
        vImage4.setBackgroundResource(0);
        VImage vImage5 = this._bg;
        if (vImage5 == null) {
            Intrinsics.m88391r("_bg");
        } else {
            vImage2 = vImage5;
        }
        vImage2.setImageResource(jbc0.f119432V0);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m222040f0() {
        if (this.fallbackToStandardPremiumPurchaseStarted.compareAndSet(false, true)) {
            l51.m152886F(this.act, new Runnable() { // from class: l.yxo
                @Override // java.lang.Runnable
                public final void run() {
                    zxo.m222021O(this.f201998a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m222041g0(boolean autoPay) {
        this.autoPay = autoPay;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m222042h0(@Nullable String duration) {
        this.defaultSkuDuration = duration;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m222043j0(@Nullable x20 onCloseCallback) {
        this.onCloseCallback = onCloseCallback;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m222044k0(@Nullable x20 dismiss) {
        this.dismiss = dismiss;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m222045l0(@Nullable x20 onKeyBackCallback) {
        this.onKeyBackCallback = onKeyBackCallback;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m222046m0(@Nullable a30<PurchaseType, Act, String> onPaymentFailed) {
        this.onPaymentFailedAction = onPaymentFailed;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m222047n0(@Nullable a30<PurchaseType, Act, String> onPaymentSuccess) {
        this.onPaymentSuccess = onPaymentSuccess;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m222048o0(List<? extends Privilege> privileges) {
        this.privileges = privileges;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0075a, p153l.nu0, android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(rec0.f162437F);
        View viewFindViewById = findViewById(fdc0.f98414j0);
        viewFindViewById.getClass();
        this._layoutrootview = (FrameLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(fdc0.f98419l);
        viewFindViewById2.getClass();
        this._bg = (VImage) viewFindViewById2;
        View viewFindViewById3 = findViewById(fdc0.f98446w);
        viewFindViewById3.getClass();
        this._content = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = findViewById(fdc0.f98440t);
        viewFindViewById4.getClass();
        this._close = (VImage) viewFindViewById4;
        View viewFindViewById5 = findViewById(fdc0.f98385Z0);
        viewFindViewById5.getClass();
        this._title = (VText) viewFindViewById5;
        View viewFindViewById6 = findViewById(fdc0.f98388a1);
        viewFindViewById6.getClass();
        this._title_img = (VImage) viewFindViewById6;
        View viewFindViewById7 = findViewById(fdc0.f98334A);
        viewFindViewById7.getClass();
        this._discountContentContainer = (FrameLayout) viewFindViewById7;
        m222037Y();
        m222036V();
        m222029Z();
        m222033i0();
        m222035U();
        m222027W();
    }

    @Override // p153l.g1e, android.content.DialogInterface.OnShowListener
    public void onShow(@Nullable DialogInterface dialog) {
        super.onShow(dialog);
        IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView = this.discountContentView;
        if (intlPremiumDiscountPurchaseContentView != null) {
            intlPremiumDiscountPurchaseContentView.m55009v0();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final boolean m222049p0(boolean isFromPayFail) {
        return ubp.INSTANCE.m195275C(this.act, new Runnable() { // from class: l.mxo
            @Override // java.lang.Runnable
            public final void run() {
                zxo.m222019M(this.f139258a);
            }
        }, new y20() { // from class: l.nxo
            @Override // p153l.y20
            public final void call(Object obj) {
                zxo.m222014H(this.f144199a, (User) obj);
            }
        }, new y20() { // from class: l.oxo
            @Override // p153l.y20
            public final void call(Object obj) {
                zxo.m222017K(this.f149675a, (User) obj);
            }
        }, new y20() { // from class: l.pxo
            @Override // p153l.y20
            public final void call(Object obj) {
                zxo.m222025S(this.f154584a, (User) obj);
            }
        }, isFromPayFail, this.from, this, null);
    }
}
