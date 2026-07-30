package com.p051p1.mobile.putong.core.p058ui.purchase.mediator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Property;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.DialogC8942d;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.PurchaseTrialSeePrivilegeView;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p151v.VImage;
import p153l.a30;
import p153l.a9b0;
import p153l.abb0;
import p153l.beb0;
import p153l.bnl0;
import p153l.c17;
import p153l.c4s;
import p153l.dgc0;
import p153l.g1e;
import p153l.gkc0;
import p153l.gt0;
import p153l.jbc0;
import p153l.jn60;
import p153l.jyb;
import p153l.l4g0;
import p153l.lib0;
import p153l.mfb0;
import p153l.mib0;
import p153l.ndb0;
import p153l.p7f;
import p153l.p9r;
import p153l.qa00;
import p153l.qcj;
import p153l.rec0;
import p153l.tab0;
import p153l.tib0;
import p153l.txq;
import p153l.ur2;
import p153l.w1e;
import p153l.w3m;
import p153l.x20;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.d */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\u0018\u0000 \u008e\u00012\u00020\u0001:\u0004\u008f\u0001\u0090\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u000f\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\fJ\u000f\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\fJ\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\fJ\u001d\u0010\u001c\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010&H\u0014¢\u0006\u0004\b(\u0010)J\u0019\u0010,\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\n2\b\u00102\u001a\u0004\u0018\u00010.¢\u0006\u0004\b3\u00101J+\u00106\u001a\u00020\n2\u001c\u00105\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u000104¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\n2\b\u00108\u001a\u0004\u0018\u00010.¢\u0006\u0004\b9\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010K\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010B\u001a\u0004\bI\u0010D\"\u0004\bJ\u0010FR\"\u0010S\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010W\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010N\u001a\u0004\bU\u0010P\"\u0004\bV\u0010RR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u0018\u0010j\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u00102\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010iR,\u00105\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010o\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010iR\u0018\u0010s\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u001c\u0010x\u001a\b\u0012\u0004\u0012\u00020u0t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010{\u001a\u00020y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010\rR\u0018\u0010\u007f\u001a\u0004\u0018\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u0018\u0010\u0083\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R)\u0010\u0089\u0001\u001a\u0014\u0012\u000f\u0012\r \u0086\u0001*\u0005\u0018\u00010\u0085\u00010\u0085\u00010\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001¨\u0006\u0091\u0001"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/mediator/d;", "Ll/g1e;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "", "a0", "()V", "Z", "b0", "()Ljava/lang/String;", "g0", "f0", "e0", "m0", "X", "Y", "h0", "W", "c0", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "P", "(Ljava/util/List;)V", "d0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "K", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", OMSTemplateType.dialog, "onShow", "(Landroid/content/DialogInterface;)V", "Ll/x20;", "onCloseCallback", "i0", "(Ll/x20;)V", "onKeyBackCallback", "k0", "Ll/a30;", "onPaymentSuccess", "l0", "(Ll/a30;)V", SysnotifListener.ACTION_DISMISS, "j0", "j", "Lcom/p1/mobile/android/app/Act;", "k", "Lcom/p1/mobile/putong/core/data/PurchaseType;", BLiveStormDanmakuGiftResourceType.f45292l, "Ljava/lang/String;", "Landroid/widget/FrameLayout;", "m", "Landroid/widget/FrameLayout;", p7f.LATITUDE_SOUTH, "()Landroid/widget/FrameLayout;", "set_root", "(Landroid/widget/FrameLayout;)V", "_root", "n", p7f.GPS_MEASUREMENT_INTERRUPTED, "set_svga_content", "_svga_content", "Lcom/tantan/library/svga/SVGAnimationView;", "o", "Lcom/tantan/library/svga/SVGAnimationView;", "U", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_svga_background", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_svga_background", "p", p7f.GPS_DIRECTION_TRUE, "set_svga_avatars", "_svga_avatars", "Lv/VImage;", "q", "Lv/VImage;", "Q", "()Lv/VImage;", "set_close", "(Lv/VImage;)V", "_close", "Landroid/widget/LinearLayout;", "r", "Landroid/widget/LinearLayout;", "R", "()Landroid/widget/LinearLayout;", "set_content", "(Landroid/widget/LinearLayout;)V", "_content", BLiveStormDanmakuGiftResourceType.f45294s, "Ll/x20;", "onCloseClick", Constants.KEY_T, "u", "Ll/a30;", ResourceDirection.f39656v, "onDismiss", "Ll/ndb0;", "w", "Ll/ndb0;", "mediator", "", "Ll/w3m;", BaseSei.f14624X, "Ljava/util/List;", "purchaseComponentsList", "", BaseSei.f14625Y, "isDialogShow", "Ll/lib0;", BaseSei.f14626Z, "Ll/lib0;", "purchasePageTrack", "Ll/l4g0;", "A", "Ll/l4g0;", "statisticsPageHelper", "Ll/y20;", "", "kotlin.jvm.PlatformType", "B", "Ll/y20;", "dialogStateAction", "", c4s.C_ZONE, "F", "contentTransY", "Companion", "b", "a", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class DialogC8942d extends g1e {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final l4g0 statisticsPageHelper;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final y20<Integer> dialogStateAction;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public final float contentTransY;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public final String from;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public FrameLayout _root;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public FrameLayout _svga_content;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public SVGAnimationView _svga_background;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public SVGAnimationView _svga_avatars;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public VImage _close;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public LinearLayout _content;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public x20 onCloseClick;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public x20 onKeyBackCallback;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public a30<PurchaseType, Act, String> onPaymentSuccess;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public x20 onDismiss;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public ndb0 mediator;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public List<w3m> purchaseComponentsList;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public boolean isDialogShow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public lib0 purchasePageTrack;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.d$a */
    @Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00002\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0014\u0010\u000bJ\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010 R\u0018\u0010\f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010 R,\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010 ¨\u0006%"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/mediator/d$a;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "Ll/x20;", "onCloseCallback", "a", "(Ll/x20;)Lcom/p1/mobile/putong/core/ui/purchase/mediator/d$a;", "onKeyBackCallback", "c", "Ll/a30;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "onPaymentSuccess", Constants.INAPP_DATA_TAG, "(Ll/a30;)Lcom/p1/mobile/putong/core/ui/purchase/mediator/d$a;", SysnotifListener.ACTION_DISMISS, "b", "", "e", "()V", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "Ll/x20;", "onCloseClick", "Ll/a30;", "f", "onDismiss", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Act act;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public String from;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public x20 onCloseClick;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public x20 onKeyBackCallback;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public a30<PurchaseType, Act, String> onPaymentSuccess;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public x20 onDismiss;

        public a(@NotNull Act act, @Nullable String str) {
            act.getClass();
            this.act = act;
            this.from = str;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final a m55314a(@Nullable x20 onCloseCallback) {
            this.onCloseClick = onCloseCallback;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final a m55315b(@Nullable x20 dismiss) {
            this.onDismiss = dismiss;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final a m55316c(@Nullable x20 onKeyBackCallback) {
            this.onKeyBackCallback = onKeyBackCallback;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final a m55317d(@Nullable a30<PurchaseType, Act, String> onPaymentSuccess) {
            this.onPaymentSuccess = onPaymentSuccess;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public final void m55318e() {
            DialogC8942d dialogC8942d = new DialogC8942d(this.act, PurchaseType.TYPE_LIMITED_TRIAL_SEE, this.from);
            dialogC8942d.m55309i0(this.onCloseClick);
            dialogC8942d.m55311k0(this.onKeyBackCallback);
            dialogC8942d.m55312l0(this.onPaymentSuccess);
            dialogC8942d.m55310j0(this.onDismiss);
            dialogC8942d.show();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.d$c */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"com/p1/mobile/putong/core/ui/purchase/mediator/d$c", "Lcom/tantan/library/svga/AnimListener;", "", "onFinished", "()V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class c extends AnimListener {
        public c() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            bnl0.m105525M0(DialogC8942d.this.m55299U(), true);
            bnl0.m105524M(DialogC8942d.this.m55298T(), false);
            DialogC8942d.this.m55299U().startAnimation();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.d$d */
    @Metadata(m88120d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"com/p1/mobile/putong/core/ui/purchase/mediator/d$d", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$e;", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "a", "(Ljava/util/List;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class d implements AbstractC8939a.e {
        public d() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.e
        /* JADX INFO: renamed from: a */
        public void mo55179a(List<? extends C8928d> sections) {
            sections.getClass();
            lib0 lib0Var = DialogC8942d.this.purchasePageTrack;
            if (lib0Var != null) {
                lib0Var.m154334C(sections);
            }
            if (DialogC8942d.this.isDialogShow) {
                return;
            }
            DialogC8942d.this.isDialogShow = true;
            DialogC8942d.this.m55294P(sections);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.d$e */
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"com/p1/mobile/putong/core/ui/purchase/mediator/d$e", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$b;", "Ll/jn60;", "paymentHandlerData", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "a", "(Ll/jn60;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class e implements AbstractC8939a.b {
        public e() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.b
        /* JADX INFO: renamed from: a */
        public void mo55181a(jn60 paymentHandlerData, PurchaseType purchaseType) {
            paymentHandlerData.getClass();
            purchaseType.getClass();
            lib0 lib0Var = DialogC8942d.this.purchasePageTrack;
            if (lib0Var != null) {
                lib0Var.m154346x(paymentHandlerData, purchaseType);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.d$f */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"com/p1/mobile/putong/core/ui/purchase/mediator/d$f", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            DialogC8942d.this.m55298T().startAnimation();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.d$g */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"com/p1/mobile/putong/core/ui/purchase/mediator/d$g", "Ll/ur2;", "", "pageId", "()Ljava/lang/String;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class g extends ur2 {
        @Override // p153l.e6m
        public String pageId() {
            return "p_purchase_page";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC8942d(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str) {
        super(act, false, dgc0.f88277b);
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.purchaseComponentsList = new ArrayList();
        this.statisticsPageHelper = new l4g0(new g());
        this.dialogStateAction = new y20() { // from class: l.nib0
            @Override // p153l.y20
            public final void call(Object obj) {
                DialogC8942d.m55281G(this.f142106a, ((Integer) obj).intValue());
            }
        };
        this.contentTransY = txq.m193530c(84);
    }

    /* JADX INFO: renamed from: E */
    public static Boolean m55279E(C8928d c8928d) {
        return Boolean.valueOf(c8928d.m54711j());
    }

    /* JADX INFO: renamed from: F */
    public static void m55280F(DialogC8942d dialogC8942d, View view) {
        x20 x20Var = dialogC8942d.onCloseClick;
        if (x20Var != null) {
            x20Var.call();
        }
        dialogC8942d.dialogStateAction.call(0);
    }

    /* JADX INFO: renamed from: G */
    public static void m55281G(DialogC8942d dialogC8942d, int i) {
        if (i == -1) {
            dialogC8942d.hide();
            return;
        }
        if (i != 0) {
            if (i == 1) {
                dialogC8942d.show();
                return;
            } else if (i != 2) {
                return;
            }
        }
        dialogC8942d.dismiss();
    }

    /* JADX INFO: renamed from: H */
    public static void m55282H(DialogC8942d dialogC8942d, DialogInterface dialogInterface) {
        dialogC8942d.m55291d0();
    }

    /* JADX INFO: renamed from: I */
    public static boolean m55283I(DialogC8942d dialogC8942d, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (i != 4 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 0) {
            return false;
        }
        dialogC8942d.dialogStateAction.call(0);
        x20 x20Var = dialogC8942d.onKeyBackCallback;
        if (x20Var == null) {
            return true;
        }
        x20Var.call();
        return true;
    }

    /* JADX INFO: renamed from: J */
    public static void m55284J(DialogC8942d dialogC8942d, DialogInterface dialogInterface) {
        if (dialogC8942d.isDialogShow) {
            w1e.m204401e(dialogC8942d.statisticsPageHelper);
        }
        x20 x20Var = dialogC8942d.onDismiss;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: X */
    private final void m55289X() {
        m128501y();
        m128500x();
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.pib0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return DialogC8942d.m55283I(this.f152523a, dialogInterface, i, keyEvent);
            }
        });
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.qib0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                DialogC8942d.m55282H(this.f157814a, dialogInterface);
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.rib0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                DialogC8942d.m55284J(this.f163350a, dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    private final void m55290a0() {
        m55297S().setAlpha(0.0f);
        int iM105592y0 = bnl0.m105592y0();
        ViewGroup.LayoutParams layoutParams = m55300V().getLayoutParams();
        layoutParams.getClass();
        layoutParams.height = (int) (iM105592y0 * 1.36f);
        m55300V().setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = m55295Q().getLayoutParams();
        layoutParams2.getClass();
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
        layoutParams3.topMargin = bnl0.m105511F0() + qa00.f156320g;
        m55295Q().setLayoutParams(layoutParams3);
        m55295Q().setImageResource(jbc0.f119473Y2);
        bnl0.m105509E0(m55295Q(), new View.OnClickListener() { // from class: l.sib0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC8942d.m55280F(this.f168813a, view);
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    private final void m55291d0() {
        ndb0 ndb0Var = this.mediator;
        if (ndb0Var != null) {
            ndb0Var.m55196K();
        }
        Iterator<w3m> it = this.purchaseComponentsList.iterator();
        while (it.hasNext()) {
            it.next().release();
        }
    }

    /* JADX INFO: renamed from: h0 */
    private final void m55292h0() {
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
        Window window4 = getWindow();
        if (window4 != null) {
            window4.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final View m55293K(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM191324b = tib0.m191324b(this, inflater, parent);
        viewM191324b.getClass();
        return viewM191324b;
    }

    /* JADX INFO: renamed from: P */
    public final void m55294P(List<? extends C8928d> sections) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseShowFrom", abb0.m96735b(this.from));
            ProductCategory productCategory = this.purchaseType.productCategory();
            jSONObject.put("productType", productCategory.name());
            jSONObject.put("skuGroup", jyb.m147490U(mib0.m158481j(sections), Constants.SEPARATOR_COMMA));
            jSONObject.put("default_product", productCategory.toString());
            jSONObject.put("default_duration", tab0.m189811h().m189825p(productCategory));
            boolean zM82486a = NullChecker.m82486a(jyb.m147529r(sections, new qcj() { // from class: l.oib0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return DialogC8942d.m55279E((C8928d) obj);
                }
            }));
            String str = "no";
            jSONObject.put("if_sale", zM82486a ? "yes" : "no");
            jSONObject.put("if_discount", zM82486a);
            boolean z = false;
            jSONObject.put("if_double_tab", false);
            jSONObject.put("function_type", "limitedSeeTrial");
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
            jSONObject.put("tooltips_type_ui", "alert_self_definition_business_a");
            jSONObject.put("tooltips_trigger_module", "purchase_button");
            jSONObject.put("tooltips_trigger_page", "anywhere");
            jSONObject.put("tooltips_type", "alert");
            jSONObject.put("tooltips_trigger_reason", FirebaseAnalytics.Event.PURCHASE);
            if (CoreModule.m30933P().m143405a().mo34428U() && CoreModule.f18264c.f20333O0.m31086w3()) {
                str = "yes";
            }
            jSONObject.put("no_secret_payment", str);
            jSONObject.put("user_secret_staus", str);
            if (CoreModule.m30933P().m143412i().mo180364N()) {
                if (CoreModule.f18264c.f20381e0.m116537Z7() && !CoreModule.f18264c.f20381e0.m116525W7() && !CoreModule.f18264c.f20381e0.m116579k8()) {
                    z = true;
                }
                jSONObject.put("is_fakeunreal", z);
            }
        } catch (JSONException e2) {
            CrashHelper.m82479c(e2);
        }
        this.statisticsPageHelper.m152780o(jSONObject);
        w1e.m204402f(this.statisticsPageHelper);
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final VImage m55295Q() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final LinearLayout m55296R() {
        LinearLayout linearLayout = this._content;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final FrameLayout m55297S() {
        FrameLayout frameLayout = this._root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final SVGAnimationView m55298T() {
        SVGAnimationView sVGAnimationView = this._svga_avatars;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m88391r("_svga_avatars");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final SVGAnimationView m55299U() {
        SVGAnimationView sVGAnimationView = this._svga_background;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m88391r("_svga_background");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final FrameLayout m55300V() {
        FrameLayout frameLayout = this._svga_content;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_svga_content");
        return null;
    }

    /* JADX INFO: renamed from: W */
    public final void m55301W() {
        m55308g0();
        m55307f0();
        m55306e0();
        m55305c0();
        ndb0 ndb0Var = this.mediator;
        if (ndb0Var != null) {
            ndb0Var.mo55223w();
        }
        Iterator<w3m> it = this.purchaseComponentsList.iterator();
        while (it.hasNext()) {
            it.next().mo152867b();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m55302Y() {
        ProductCategory productCategory = this.purchaseType.productCategory();
        productCategory.getClass();
        this.purchasePageTrack = new beb0(productCategory, PurchaseTrackPageType.page_discount_trial_see, this.from);
        ndb0 ndb0Var = new ndb0(this.act, this.purchaseType, this.from);
        this.mediator = ndb0Var;
        ndb0Var.m55201P(this.purchasePageTrack);
        lib0 lib0Var = this.purchasePageTrack;
        if (lib0Var != null) {
            ProductCategory productCategory2 = this.purchaseType.productCategory();
            productCategory2.getClass();
            lib0Var.m154344v(productCategory2);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m55303Z() {
        Picture pictureM61308fp;
        Picture.ImageUri imageUriProfileBig;
        m55296R().setAlpha(0.0f);
        m55296R().setTranslationY(this.contentTransY);
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        sVGADynamicEntity.setDynamicImage(m55304b0(), "head01");
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        String str = (userM116600p9 == null || (pictureM61308fp = userM116600p9.m61308fp()) == null || (imageUriProfileBig = pictureM61308fp.profileBig()) == null) ? null : imageUriProfileBig.formatted();
        if (str != null && str.length() != 0) {
            sVGADynamicEntity.setDynamicImage(str, "head02");
        }
        SVGALoader.with(this.act).from("https://auto.tancdn.com/v1/raw/ca9e7635-4202-4068-bac3-59f7e595137814.pdf").autoPlay(false).repeatCount(1).dynamic(sVGADynamicEntity).animListener(new c()).into(m55298T());
        SVGALoader.with(this.act).from("https://auto.tancdn.com/v1/raw/58851589-9e7e-4e75-bcc1-f74c4e36caf214.pdf").autoPlay(false).repeatCount(-1).dynamic(sVGADynamicEntity).into(m55299U());
    }

    /* JADX INFO: renamed from: b0 */
    public final String m55304b0() {
        return (String) (c17.m107528u0() ? CollectionsKt.listOf((Object[]) new String[]{"https://auto.tancdn.com/v1/images/eyJpZCI6IjRIV083REpVSFpVUTdQR0VTR0hYRkpFUDQzRTNDMjE0IiwidyI6MzYwLCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTExNjQ0NDcwNjMzMTA4MzAxfQ.png", "https://auto.tancdn.com/v1/images/eyJpZCI6Ik5aM1JWNVVXRzdJS1BINlJDR0pEN1JDRUpITDJMVzE0IiwidyI6MzYwLCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMjUyNTUxNzA0Mzk5MTUyNjYzfQ.png", "https://auto.tancdn.com/v1/images/eyJpZCI6IjNBSk9MTFkyVEI0Qk1HQ0dBNllYMllDQzVLTk9ZTTE0IiwidyI6MzYwLCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NzEyMjM3MTQ0OTEyODU5NDIxfQ.png", "https://auto.tancdn.com/v1/images/eyJpZCI6IlRYMlQ0SVBINjRJWk1JQlJWSTJHRDNJNTdINVhNRTE0IiwidyI6MzYwLCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyODIwNzUzMzU1NDM0NjY2MjY3fQ.png"}) : CollectionsKt.listOf((Object[]) new String[]{"https://auto.tancdn.com/v1/images/eyJpZCI6Ik9UT1lSUEZERkVFTDNWU09ZNExNUUQ3WVZBUjU3NjE0IiwidyI6MzYwLCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MjY1OTU2OTMzNjQxMjQ5MzIzfQ.png", "https://auto.tancdn.com/v1/images/eyJpZCI6IkpDS1RHT1lCMlM0RFJUM0NFSUdUQkgyQktCMjZORTE0IiwidyI6MzYwLCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMzk3MzAzNjQ2MzUxMzczMDk5fQ.png", "https://auto.tancdn.com/v1/images/eyJpZCI6IkRaRjdBVEJNR05WQlRUSk1GN1pTWE9HTkpJR1o3STE0IiwidyI6MzYwLCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NzQ0MTk1NzE4MDMzMDc0OTcxfQ.png", "https://auto.tancdn.com/v1/images/eyJpZCI6Ijc2RE4zWTJPSkJPNjQ1WlFKVUc1R0tUREVOS0JXWTE0IiwidyI6MzYwLCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyODYxMzU1MzgyODYxMzA0NjI5fQ.png"})).get(gkc0.m130573a(0, 4));
    }

    /* JADX INFO: renamed from: c0 */
    public final void m55305c0() {
        ndb0 ndb0Var = this.mediator;
        if (ndb0Var != null) {
            ndb0Var.m55195J(new d());
            ndb0Var.m55192G(new e());
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m55306e0() {
        a9b0 a9b0Var = new a9b0(this.act, this.purchaseType, this.from, this.mediator);
        m55296R().addView(a9b0Var.mo96551a(m55296R()));
        a9b0Var.register();
        this.purchaseComponentsList.add(a9b0Var);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m55307f0() {
        mfb0 mfb0Var = new mfb0(this.act, this.purchaseType, this.from, this.mediator);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = txq.m193530c(72);
        m55296R().addView(mfb0Var.mo96551a(m55296R()), layoutParams);
        mfb0Var.m152860O(this.dialogStateAction);
        mfb0Var.register();
        this.purchaseComponentsList.add(mfb0Var);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m55308g0() {
        View viewInflate = p9r.m171370a(this.act).inflate(rec0.f162543e1, (ViewGroup) m55296R(), false);
        PurchaseTrialSeePrivilegeView purchaseTrialSeePrivilegeView = viewInflate instanceof PurchaseTrialSeePrivilegeView ? (PurchaseTrialSeePrivilegeView) viewInflate : null;
        if (purchaseTrialSeePrivilegeView != null) {
            purchaseTrialSeePrivilegeView.m55479c();
            m55296R().addView(purchaseTrialSeePrivilegeView);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m55309i0(@Nullable x20 onCloseCallback) {
        this.onCloseClick = onCloseCallback;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m55310j0(@Nullable x20 dismiss) {
        this.onDismiss = dismiss;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m55311k0(@Nullable x20 onKeyBackCallback) {
        this.onKeyBackCallback = onKeyBackCallback;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m55312l0(@Nullable a30<PurchaseType, Act, String> onPaymentSuccess) {
        this.onPaymentSuccess = onPaymentSuccess;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m55313m0() {
        FrameLayout frameLayoutM55297S = m55297S();
        Property property = View.ALPHA;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(frameLayoutM55297S, (Property<FrameLayout, Float>) property, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(167L);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(m55296R(), PropertyValuesHolder.ofFloat((Property<?, Float>) property, 0.0f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, this.contentTransY, 0.0f));
        objectAnimatorOfPropertyValuesHolder.getClass();
        objectAnimatorOfPropertyValuesHolder.setStartDelay(100L);
        objectAnimatorOfPropertyValuesHolder.setDuration(333L);
        Animator animatorM132164j = gt0.m132164j(75);
        animatorM132164j.addListener(new f());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.play(objectAnimatorOfFloat).with(animatorM132164j).before(objectAnimatorOfPropertyValuesHolder);
        animatorSet.start();
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0075a, p153l.nu0, android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater layoutInflater = this.act.getLayoutInflater();
        layoutInflater.getClass();
        View viewM55293K = m55293K(layoutInflater, null);
        m55302Y();
        m55290a0();
        m55303Z();
        m55301W();
        m55292h0();
        m55289X();
        setContentView(viewM55293K);
    }

    @Override // p153l.g1e, android.content.DialogInterface.OnShowListener
    public void onShow(@Nullable DialogInterface dialog) {
        super.onShow(dialog);
        m55313m0();
    }
}
