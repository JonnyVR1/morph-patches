package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p046p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.core.p053ui.purchase.intlpage.IntlPremiumDiscountPurchaseContentView;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u007fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\nJ\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\nJ\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\nJ\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\nJ\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\b2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010 H\u0014¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J+\u0010+\u001a\u00020\b2\u001c\u0010*\u001a\u0018\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010(¢\u0006\u0004\b+\u0010,J)\u0010.\u001a\u00020\b2\u001a\u0010-\u001a\u0016\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010(¢\u0006\u0004\b.\u0010,J\u0017\u00101\u001a\u00020\b2\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\b2\b\u00103\u001a\u0004\u0018\u00010/¢\u0006\u0004\b4\u00102J\u0017\u00106\u001a\u00020\b2\b\u00105\u001a\u0004\u0018\u00010/¢\u0006\u0004\b6\u00102J\u0017\u00108\u001a\u00020\b2\b\u00107\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b8\u00109J\u0015\u0010;\u001a\u00020\b2\u0006\u0010:\u001a\u00020\u0015¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010L\u001a\u00020I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010N\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bM\u0010GR\u0016\u0010R\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010T\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bS\u0010GR\u0016\u0010V\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bU\u0010CR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u00105\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010\\\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010@R\u0016\u0010:\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010\rR,\u0010*\u001a\u0018\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R*\u0010a\u001a\u0016\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010_R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010ZR\u0018\u00103\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010ZR\u0018\u0010g\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010k\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010o\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\"\u0010v\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u0016\u0010x\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010\rR\"\u0010~\u001a\u0010\u0012\f\u0012\n {*\u0004\u0018\u00010z0z0y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}¨\u0006\u0080\u0001"}, m87232d2 = {"Ll/zvo;", "Ll/szd;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "", "f0", "()V", "i0", "U", "Z", "W", "e0", "d0", "Y", j6f.GPS_MEASUREMENT_INTERRUPTED, "c0", "b0", "", "a0", "()Z", "isFromPayFail", "p0", "(Z)Z", "", "Lcom/p1/mobile/putong/core/data/Privilege;", "privileges", "o0", "(Ljava/util/List;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", OMSTemplateType.dialog, "onShow", "(Landroid/content/DialogInterface;)V", "Ll/g30;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "onPaymentSuccess", "n0", "(Ll/g30;)V", "onPaymentFailed", "m0", "Ll/d30;", "onKeyBackCallback", "l0", "(Ll/d30;)V", "onCloseCallback", "j0", SysnotifListener.ACTION_DISMISS, "k0", BLiveOperationTitleShowType.duration, "h0", "(Ljava/lang/String;)V", "autoPay", "g0", "(Z)V", "j", "Lcom/p1/mobile/android/app/Act;", "k", "Ljava/lang/String;", "Landroid/widget/FrameLayout;", BLiveStormDanmakuGiftResourceType.f44444l, "Landroid/widget/FrameLayout;", "_layoutrootview", "Lv/VImage;", "m", "Lv/VImage;", "_bg", "Landroid/widget/LinearLayout;", "n", "Landroid/widget/LinearLayout;", "_content", "o", "_close", "Lv/VText;", "p", "Lv/VText;", "_title", "q", "_title_img", "r", "_discountContentContainer", BLiveStormDanmakuGiftResourceType.f44446s, "Ljava/util/List;", Constants.KEY_T, "Ll/d30;", "u", "defaultSkuDuration", ResourceDirection.f38808v, "w", "Ll/g30;", BaseSei.f13930X, "onPaymentFailedAction", BaseSei.f13931Y, BaseSei.f13932Z, "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPremiumDiscountPurchaseContentView;", "A", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPremiumDiscountPurchaseContentView;", "discountContentView", "Ll/x5b0;", "B", "Ll/x5b0;", "purchasePageTrack", "Ljava/util/concurrent/atomic/AtomicBoolean;", b2s.C_ZONE, "Ljava/util/concurrent/atomic/AtomicBoolean;", "fallbackToStandardPremiumPurchaseStarted", "D", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getCurrentPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "setCurrentPurchaseType", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "currentPurchaseType", "E", "isSelectUpgrade", "Ll/e30;", "", "kotlin.jvm.PlatformType", "F", "Ll/e30;", "dialogStateAction", "a", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class zvo extends szd {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public IntlPremiumDiscountPurchaseContentView discountContentView;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public x5b0 purchasePageTrack;

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
    public final e30<Integer> dialogStateAction;

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
    public d30 dismiss;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public String defaultSkuDuration;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public boolean autoPay;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public g30<PurchaseType, Act, String> onPaymentSuccess;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public g30<PurchaseType, Act, String> onPaymentFailedAction;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    public d30 onKeyBackCallback;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public d30 onCloseCallback;

    /* JADX INFO: renamed from: l.zvo$a */
    @Metadata(m87231d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0012\u001a\u00020\u00002\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001b\u0010\u0017J\u0017\u0010\u001d\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001d\u0010\u000eJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\r\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010(R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010)R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010*R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010+R,\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010,R*\u0010-\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010,R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010*R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010/R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010+¨\u00060"}, m87232d2 = {"Ll/zvo$a;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "Lcom/p1/mobile/putong/core/data/Privilege;", "privileges", RXScreenCaptureService.KEY_INDEX, "(Ljava/util/List;)Ll/zvo$a;", "", "from", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Ll/zvo$a;", "Ll/g30;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "onPaymentSuccess", "h", "(Ll/g30;)Ll/zvo$a;", "Ll/d30;", "onKeyBackCallback", "g", "(Ll/d30;)Ll/zvo$a;", "onCloseCallback", "e", SysnotifListener.ACTION_DISMISS, "f", BLiveOperationTitleShowType.duration, "c", "", "autoPay", "b", "(Z)Ll/zvo$a;", "Ll/zvo;", "a", "()Ll/zvo;", "", "j", "()V", "Lcom/p1/mobile/android/app/Act;", "Ljava/util/List;", "Ljava/lang/String;", "Ll/d30;", "Ll/g30;", "onPaymentFailed", "defaultSkuDuration", "Z", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C21788a {

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
        public d30 dismiss;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public g30<PurchaseType, Act, String> onPaymentSuccess;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public g30<PurchaseType, Act, String> onPaymentFailed;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public d30 onKeyBackCallback;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public String defaultSkuDuration;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public boolean autoPay;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @Nullable
        public d30 onCloseCallback;

        public C21788a(@NotNull Act act) {
            act.getClass();
            this.act = act;
            this.privileges = CollectionsKt.emptyList();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final zvo m220454a() {
            zvo zvoVar = new zvo(this.act, this.from);
            zvoVar.m220452o0(this.privileges);
            zvoVar.m220451n0(this.onPaymentSuccess);
            zvoVar.m220450m0(this.onPaymentFailed);
            zvoVar.m220449l0(this.onKeyBackCallback);
            zvoVar.m220447j0(this.onCloseCallback);
            zvoVar.m220448k0(this.dismiss);
            zvoVar.m220446h0(this.defaultSkuDuration);
            zvoVar.m220445g0(this.autoPay);
            return zvoVar;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C21788a m220455b(boolean autoPay) {
            this.autoPay = autoPay;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final C21788a m220456c(@Nullable String duration) {
            this.defaultSkuDuration = duration;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final C21788a m220457d(@Nullable String from) {
            this.from = from;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final C21788a m220458e(@Nullable d30 onCloseCallback) {
            this.onCloseCallback = onCloseCallback;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final C21788a m220459f(@Nullable d30 dismiss) {
            this.dismiss = dismiss;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final C21788a m220460g(@Nullable d30 onKeyBackCallback) {
            this.onKeyBackCallback = onKeyBackCallback;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final C21788a m220461h(@Nullable g30<PurchaseType, Act, String> onPaymentSuccess) {
            this.onPaymentSuccess = onPaymentSuccess;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: i */
        public final C21788a m220462i(@NotNull List<? extends Privilege> privileges) {
            privileges.getClass();
            this.privileges = privileges;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public final void m220463j() {
            m220454a().show();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zvo(@NotNull Act act, @Nullable String str) {
        super(act, false, y7c0.f196692b);
        act.getClass();
        this.act = act;
        this.from = str;
        this.fallbackToStandardPremiumPurchaseStarted = new AtomicBoolean(false);
        this.currentPurchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        this.dialogStateAction = new e30() { // from class: l.xvo
            @Override // p149l.e30
            public final void call(Object obj) {
                zvo.m220416F(this.f194656a, ((Integer) obj).intValue());
            }
        };
    }

    /* JADX INFO: renamed from: F */
    public static void m220416F(zvo zvoVar, int i) {
        if (i == -1) {
            zvoVar.hide();
            return;
        }
        if (i != 0) {
            if (i == 1) {
                zvoVar.show();
                return;
            } else if (i != 2) {
                if (i == 5 && zvoVar.m220442a0()) {
                    zvoVar.m220453p0(true);
                    return;
                }
                return;
            }
        }
        zvoVar.dismiss();
    }

    /* JADX INFO: renamed from: G */
    public static void m220417G(final zvo zvoVar, DialogInterface dialogInterface) {
        CoreModule.m29935P().m94651a().mo33308E9();
        IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView = zvoVar.discountContentView;
        if (intlPremiumDiscountPurchaseContentView != null) {
            intlPremiumDiscountPurchaseContentView.m53825u0();
        }
        zvoVar.m220434b0();
        d30 d30Var = zvoVar.dismiss;
        if (d30Var != null) {
            d30Var.call();
        }
        e51.m114741F(zvoVar.act, new Runnable() { // from class: l.lvo
            @Override // java.lang.Runnable
            public final void run() {
                zvo.m220432X(this.f130180a);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public static void m220418H(zvo zvoVar, User user) {
        IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView = zvoVar.discountContentView;
        if (intlPremiumDiscountPurchaseContentView != null) {
            intlPremiumDiscountPurchaseContentView.m53829y0();
        }
        u9p.payFromSalvageAction = MatchFrom.superLiked;
    }

    /* JADX INFO: renamed from: I */
    public static y6q0 m220419I(View view, y6q0 y6q0Var) {
        view.getClass();
        y6q0Var.getClass();
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), y6q0Var.m213179f(y6q0.C21326l.m213234d()).f160975d);
        return y6q0Var;
    }

    /* JADX INFO: renamed from: J */
    public static void m220420J(zvo zvoVar, Long l2) {
        if (zvoVar.isShowing()) {
            CoreIntlAffiliatePromotions coreIntlAffiliatePromotions = CoreModule.f17545c.f19696x0;
            l2.getClass();
            IapAffiliatePromotion iapAffiliatePromotionM30223w3 = coreIntlAffiliatePromotions.m30223w3(l2.longValue());
            if (iapAffiliatePromotionM30223w3 == null || !CoreModule.f17545c.f19696x0.m30197f4(iapAffiliatePromotionM30223w3)) {
                zvoVar.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public static void m220421K(zvo zvoVar, User user) {
        IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView = zvoVar.discountContentView;
        if (intlPremiumDiscountPurchaseContentView != null) {
            intlPremiumDiscountPurchaseContentView.m53829y0();
        }
        u9p.payFromSalvageAction = "liked";
    }

    /* JADX INFO: renamed from: L */
    public static void m220422L(zvo zvoVar, View view) {
        if (zvoVar.m220442a0() && m220438q0(zvoVar, false, 1, null)) {
            return;
        }
        d30 d30Var = zvoVar.onCloseCallback;
        if (d30Var != null) {
            d30Var.call();
        }
        zvoVar.dialogStateAction.call(0);
        zvoVar.dismiss();
    }

    /* JADX INFO: renamed from: M */
    public static void m220423M(zvo zvoVar) {
        IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView = zvoVar.discountContentView;
        if (intlPremiumDiscountPurchaseContentView != null) {
            intlPremiumDiscountPurchaseContentView.m53829y0();
        }
        u9p.payFromSalvageAction = "";
    }

    /* JADX INFO: renamed from: N */
    public static boolean m220424N(zvo zvoVar, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (i != 4 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 0) {
            return false;
        }
        if (!zvoVar.m220442a0() || !m220438q0(zvoVar, false, 1, null)) {
            zvoVar.dialogStateAction.call(0);
            d30 d30Var = zvoVar.onKeyBackCallback;
            if (d30Var != null) {
                d30Var.call();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: O */
    public static void m220425O(zvo zvoVar) {
        if (zvoVar.isShowing()) {
            zvoVar.dismiss();
        }
    }

    /* JADX INFO: renamed from: P */
    public static void m220426P(zvo zvoVar, DialogInterface dialogInterface) {
        zvoVar.m220434b0();
    }

    /* JADX INFO: renamed from: Q */
    public static void m220427Q(zvo zvoVar, boolean z) {
        zvoVar.isSelectUpgrade = z;
        zvoVar.m220436d0();
    }

    /* JADX INFO: renamed from: R */
    public static void m220428R(zvo zvoVar) {
        zvoVar.m220444f0();
    }

    /* JADX INFO: renamed from: S */
    public static void m220429S(zvo zvoVar, User user) {
        IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView = zvoVar.discountContentView;
        if (intlPremiumDiscountPurchaseContentView != null) {
            intlPremiumDiscountPurchaseContentView.m53829y0();
        }
        u9p.payFromSalvageAction = "seeProfile";
    }

    /* JADX INFO: renamed from: W */
    private final void m220431W() {
        m186759y();
        m186758x();
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.rvo
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return zvo.m220424N(this.f161246a, dialogInterface, i, keyEvent);
            }
        });
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.svo
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                zvo.m220426P(this.f166584a, dialogInterface);
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.tvo
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                zvo.m220417G(this.f172330a, dialogInterface);
            }
        });
        VImage vImage = this._close;
        if (vImage == null) {
            Intrinsics.m87502r("_close");
            vImage = null;
        }
        vImage.setOnClickListener(new View.OnClickListener() { // from class: l.uvo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zvo.m220422L(this.f178549a, view);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public static final void m220432X(zvo zvoVar) {
        CoreModule.m29935P().m94651a().mo33571qk(zvoVar.act);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0075  */
    /* JADX WARN: Code duplicated, block: B:21:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b9  */
    /* JADX INFO: renamed from: Z */
    private final void m220433Z() {
        Privilege privilege;
        Privilege privilege2;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        LinearLayout linearLayout = this._content;
        FrameLayout frameLayout3 = null;
        if (linearLayout == null) {
            Intrinsics.m87502r("_content");
            linearLayout = null;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.getClass();
        ((FrameLayout.LayoutParams) layoutParams).topMargin = xdl0.m208331F0();
        String strM153083i = m4p.m153083i();
        PurchaseType purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        ProductCategory productCategory = purchaseType.productCategory();
        productCategory.getClass();
        x5b0 x5b0Var = new x5b0(productCategory, PurchaseTrackPageType.page_fullscreen_one, strM153083i);
        this.purchasePageTrack = x5b0Var;
        ProductCategory productCategory2 = purchaseType.productCategory();
        productCategory2.getClass();
        x5b0Var.m130122v(productCategory2);
        List<? extends Privilege> list = this.privileges;
        if (list == null || vwb.m200296J(list)) {
            ArrayList<Privilege> privilegeData = purchaseType.getPrivilegeData(null);
            if (vwb.m200296J(privilegeData)) {
                privilege = null;
            } else {
                privilege2 = privilegeData.get(0);
            }
            LayoutInflater layoutInflater = this.act.getLayoutInflater();
            int i = m6c0.f131473E;
            frameLayout = this._discountContentContainer;
            if (frameLayout == null) {
                Intrinsics.m87502r("_discountContentContainer");
                frameLayout = null;
            }
            View viewInflate = layoutInflater.inflate(i, (ViewGroup) frameLayout, false);
            viewInflate.getClass();
            IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView = (IntlPremiumDiscountPurchaseContentView) viewInflate;
            this.discountContentView = intlPremiumDiscountPurchaseContentView;
            intlPremiumDiscountPurchaseContentView.m53830z0(this.act, purchaseType, privilege, this.from, false);
            intlPremiumDiscountPurchaseContentView.setDialogStateAction(this.dialogStateAction);
            intlPremiumDiscountPurchaseContentView.setOnPaymentSuccess(this.onPaymentSuccess);
            intlPremiumDiscountPurchaseContentView.setOnPaymentFailed(this.onPaymentFailedAction);
            x5b0 x5b0Var2 = this.purchasePageTrack;
            x5b0Var2.getClass();
            intlPremiumDiscountPurchaseContentView.setPurchasePageTrack(x5b0Var2);
            intlPremiumDiscountPurchaseContentView.setAutoPay(this.autoPay);
            intlPremiumDiscountPurchaseContentView.setFallbackToStandardPremiumFullscreen(new d30() { // from class: l.vvo
                @Override // p149l.d30
                public final void call() {
                    zvo.m220428R(this.f183245a);
                }
            });
            frameLayout2 = this._discountContentContainer;
            if (frameLayout2 == null) {
                Intrinsics.m87502r("_discountContentContainer");
            } else {
                frameLayout3 = frameLayout2;
            }
            frameLayout3.addView(intlPremiumDiscountPurchaseContentView, new FrameLayout.LayoutParams(-1, -1));
            intlPremiumDiscountPurchaseContentView.m53790C0();
            m220436d0();
            m220443e0();
            m220435c0();
        }
        List<? extends Privilege> list2 = this.privileges;
        list2.getClass();
        privilege2 = list2.get(0);
        privilege = privilege2;
        LayoutInflater layoutInflater2 = this.act.getLayoutInflater();
        int i2 = m6c0.f131473E;
        frameLayout = this._discountContentContainer;
        if (frameLayout == null) {
            Intrinsics.m87502r("_discountContentContainer");
            frameLayout = null;
        }
        View viewInflate2 = layoutInflater2.inflate(i2, (ViewGroup) frameLayout, false);
        viewInflate2.getClass();
        IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView2 = (IntlPremiumDiscountPurchaseContentView) viewInflate2;
        this.discountContentView = intlPremiumDiscountPurchaseContentView2;
        intlPremiumDiscountPurchaseContentView2.m53830z0(this.act, purchaseType, privilege, this.from, false);
        intlPremiumDiscountPurchaseContentView2.setDialogStateAction(this.dialogStateAction);
        intlPremiumDiscountPurchaseContentView2.setOnPaymentSuccess(this.onPaymentSuccess);
        intlPremiumDiscountPurchaseContentView2.setOnPaymentFailed(this.onPaymentFailedAction);
        x5b0 x5b0Var3 = this.purchasePageTrack;
        x5b0Var3.getClass();
        intlPremiumDiscountPurchaseContentView2.setPurchasePageTrack(x5b0Var3);
        intlPremiumDiscountPurchaseContentView2.setAutoPay(this.autoPay);
        intlPremiumDiscountPurchaseContentView2.setFallbackToStandardPremiumFullscreen(new d30() { // from class: l.vvo
            @Override // p149l.d30
            public final void call() {
                zvo.m220428R(this.f183245a);
            }
        });
        frameLayout2 = this._discountContentContainer;
        if (frameLayout2 == null) {
            Intrinsics.m87502r("_discountContentContainer");
        } else {
            frameLayout3 = frameLayout2;
        }
        frameLayout3.addView(intlPremiumDiscountPurchaseContentView2, new FrameLayout.LayoutParams(-1, -1));
        intlPremiumDiscountPurchaseContentView2.m53790C0();
        m220436d0();
        m220443e0();
        m220435c0();
    }

    /* JADX INFO: renamed from: b0 */
    private final void m220434b0() {
        IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView = this.discountContentView;
        if (intlPremiumDiscountPurchaseContentView != null) {
            intlPremiumDiscountPurchaseContentView.m53789B0();
        }
        this.discountContentView = null;
    }

    /* JADX INFO: renamed from: c0 */
    private final void m220435c0() {
        VImage vImage = this._close;
        if (vImage == null) {
            Intrinsics.m87502r("_close");
            vImage = null;
        }
        vImage.setImageDrawable(CoreModule.f17544b.getDrawable(d3c0.f84110t2));
    }

    /* JADX INFO: renamed from: d0 */
    private final void m220436d0() {
        VImage vImage = this._title_img;
        VText vText = null;
        if (vImage == null) {
            Intrinsics.m87502r("_title_img");
            vImage = null;
        }
        xdl0.m208344M(vImage, false);
        VText vText2 = this._title;
        if (vText2 == null) {
            Intrinsics.m87502r("_title");
            vText2 = null;
        }
        xdl0.m208344M(vText2, true);
        VText vText3 = this._title;
        if (vText3 == null) {
            Intrinsics.m87502r("_title");
            vText3 = null;
        }
        vText3.setTextSize(2, 18.0f);
        VText vText4 = this._title;
        if (vText4 == null) {
            Intrinsics.m87502r("_title");
            vText4 = null;
        }
        vText4.setTypeface(eqh0.m117752c(3), 0);
        VText vText5 = this._title;
        if (vText5 == null) {
            Intrinsics.m87502r("_title");
            vText5 = null;
        }
        vText5.setText(this.isSelectUpgrade ? getContext().getString(R$string.f27660y3) : getContext().getString(R$string.f27249O4));
        VText vText6 = this._title;
        if (vText6 == null) {
            Intrinsics.m87502r("_title");
        } else {
            vText = vText6;
        }
        vText.setTextColor(Color.parseColor("#EDD6A3"));
        e1b0.INSTANCE.m114403a(this.currentPurchaseType);
    }

    /* JADX INFO: renamed from: i0 */
    private final void m220437i0() {
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        i6q0.m134631b(window, false);
        PutongAct.setLightStatusBar(window, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ boolean m220438q0(zvo zvoVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return zvoVar.m220453p0(z);
    }

    /* JADX INFO: renamed from: U */
    public final void m220439U() {
        LinearLayout linearLayout = this._content;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            Intrinsics.m87502r("_content");
            linearLayout = null;
        }
        gbl0.m125231y0(linearLayout, new bd50() { // from class: l.wvo
            @Override // p149l.bd50
            public final y6q0 onApplyWindowInsets(View view, y6q0 y6q0Var) {
                return zvo.m220419I(view, y6q0Var);
            }
        });
        LinearLayout linearLayout3 = this._content;
        if (linearLayout3 == null) {
            Intrinsics.m87502r("_content");
        } else {
            linearLayout2 = linearLayout3;
        }
        gbl0.m125195g0(linearLayout2);
    }

    /* JADX INFO: renamed from: V */
    public final void m220440V() {
        duringCreated(CoreModule.f17545c.f19696x0.m30214r4()).subscribe(mkd0.m154955G(new e30() { // from class: l.qvo
            @Override // p149l.e30
            public final void call(Object obj) {
                zvo.m220420J(this.f156615a, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y */
    public final void m220441Y() {
        duringCreated(CoreModule.f17545c.f19569G2.f80118S).subscribe(mkd0.m154955G(new e30() { // from class: l.kvo
            @Override // p149l.e30
            public final void call(Object obj) {
                zvo.m220427Q(this.f124784a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m220442a0() {
        return CoreModule.f17545c.f19696x0.m30195c4();
    }

    /* JADX INFO: renamed from: e0 */
    public final void m220443e0() {
        VImage vImage = this._bg;
        VImage vImage2 = null;
        if (vImage == null) {
            Intrinsics.m87502r("_bg");
            vImage = null;
        }
        vImage.setAdjustViewBounds(true);
        VImage vImage3 = this._bg;
        if (vImage3 == null) {
            Intrinsics.m87502r("_bg");
            vImage3 = null;
        }
        vImage3.setScaleType(ImageView.ScaleType.FIT_START);
        VImage vImage4 = this._bg;
        if (vImage4 == null) {
            Intrinsics.m87502r("_bg");
            vImage4 = null;
        }
        vImage4.setBackgroundResource(0);
        VImage vImage5 = this._bg;
        if (vImage5 == null) {
            Intrinsics.m87502r("_bg");
        } else {
            vImage2 = vImage5;
        }
        vImage2.setImageResource(d3c0.f83777V0);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m220444f0() {
        if (this.fallbackToStandardPremiumPurchaseStarted.compareAndSet(false, true)) {
            e51.m114741F(this.act, new Runnable() { // from class: l.yvo
                @Override // java.lang.Runnable
                public final void run() {
                    zvo.m220425O(this.f200284a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m220445g0(boolean autoPay) {
        this.autoPay = autoPay;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m220446h0(@Nullable String duration) {
        this.defaultSkuDuration = duration;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m220447j0(@Nullable d30 onCloseCallback) {
        this.onCloseCallback = onCloseCallback;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m220448k0(@Nullable d30 dismiss) {
        this.dismiss = dismiss;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m220449l0(@Nullable d30 onKeyBackCallback) {
        this.onKeyBackCallback = onKeyBackCallback;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m220450m0(@Nullable g30<PurchaseType, Act, String> onPaymentFailed) {
        this.onPaymentFailedAction = onPaymentFailed;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m220451n0(@Nullable g30<PurchaseType, Act, String> onPaymentSuccess) {
        this.onPaymentSuccess = onPaymentSuccess;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m220452o0(List<? extends Privilege> privileges) {
        this.privileges = privileges;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0074a, p149l.hu0, android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(m6c0.f131477F);
        View viewFindViewById = findViewById(z4c0.f201538j0);
        viewFindViewById.getClass();
        this._layoutrootview = (FrameLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(z4c0.f201543l);
        viewFindViewById2.getClass();
        this._bg = (VImage) viewFindViewById2;
        View viewFindViewById3 = findViewById(z4c0.f201570w);
        viewFindViewById3.getClass();
        this._content = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = findViewById(z4c0.f201564t);
        viewFindViewById4.getClass();
        this._close = (VImage) viewFindViewById4;
        View viewFindViewById5 = findViewById(z4c0.f201509Z0);
        viewFindViewById5.getClass();
        this._title = (VText) viewFindViewById5;
        View viewFindViewById6 = findViewById(z4c0.f201512a1);
        viewFindViewById6.getClass();
        this._title_img = (VImage) viewFindViewById6;
        View viewFindViewById7 = findViewById(z4c0.f201458A);
        viewFindViewById7.getClass();
        this._discountContentContainer = (FrameLayout) viewFindViewById7;
        m220441Y();
        m220440V();
        m220433Z();
        m220437i0();
        m220439U();
        m220431W();
    }

    @Override // p149l.szd, android.content.DialogInterface.OnShowListener
    public void onShow(@Nullable DialogInterface dialog) {
        super.onShow(dialog);
        IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView = this.discountContentView;
        if (intlPremiumDiscountPurchaseContentView != null) {
            intlPremiumDiscountPurchaseContentView.m53826v0();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final boolean m220453p0(boolean isFromPayFail) {
        return u9p.INSTANCE.m192607C(this.act, new Runnable() { // from class: l.mvo
            @Override // java.lang.Runnable
            public final void run() {
                zvo.m220423M(this.f135955a);
            }
        }, new e30() { // from class: l.nvo
            @Override // p149l.e30
            public final void call(Object obj) {
                zvo.m220418H(this.f140782a, (User) obj);
            }
        }, new e30() { // from class: l.ovo
            @Override // p149l.e30
            public final void call(Object obj) {
                zvo.m220421K(this.f145824a, (User) obj);
            }
        }, new e30() { // from class: l.pvo
            @Override // p149l.e30
            public final void call(Object obj) {
                zvo.m220429S(this.f151496a, (User) obj);
            }
        }, isFromPayFail, this.from, this, null);
    }
}
