package com.p046p1.mobile.putong.core.p053ui.purchase.mediator;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.DialogC8779d;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p046p1.mobile.putong.core.p053ui.purchase.privilege.PurchaseTrialSeePrivilegeView;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
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
import p147v.VImage;
import p149l.b2s;
import p149l.bt0;
import p149l.cwf0;
import p149l.d1m;
import p149l.d30;
import p149l.d3c0;
import p149l.e30;
import p149l.ef60;
import p149l.er2;
import p149l.g30;
import p149l.hab0;
import p149l.i0e;
import p149l.i7b0;
import p149l.iab0;
import p149l.j5b0;
import p149l.j6f;
import p149l.m6c0;
import p149l.o7r;
import p149l.p2b0;
import p149l.pab0;
import p149l.svq;
import p149l.szd;
import p149l.t100;
import p149l.vwb;
import p149l.w0b0;
import p149l.w2b0;
import p149l.w9j;
import p149l.x5b0;
import p149l.xdl0;
import p149l.y7c0;
import p149l.zbc0;
import p149l.zz6;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\u0018\u0000 \u008e\u00012\u00020\u0001:\u0004\u008f\u0001\u0090\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u000f\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\fJ\u000f\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\fJ\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\fJ\u001d\u0010\u001c\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010&H\u0014¢\u0006\u0004\b(\u0010)J\u0019\u0010,\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\n2\b\u00102\u001a\u0004\u0018\u00010.¢\u0006\u0004\b3\u00101J+\u00106\u001a\u00020\n2\u001c\u00105\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u000104¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\n2\b\u00108\u001a\u0004\u0018\u00010.¢\u0006\u0004\b9\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010K\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010B\u001a\u0004\bI\u0010D\"\u0004\bJ\u0010FR\"\u0010S\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010W\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010N\u001a\u0004\bU\u0010P\"\u0004\bV\u0010RR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u0018\u0010j\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u00102\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010iR,\u00105\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010o\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010iR\u0018\u0010s\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u001c\u0010x\u001a\b\u0012\u0004\u0012\u00020u0t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010{\u001a\u00020y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010\rR\u0018\u0010\u007f\u001a\u0004\u0018\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u0018\u0010\u0083\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R)\u0010\u0089\u0001\u001a\u0014\u0012\u000f\u0012\r \u0086\u0001*\u0005\u0018\u00010\u0085\u00010\u0085\u00010\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001¨\u0006\u0091\u0001"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/mediator/d;", "Ll/szd;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "", "a0", "()V", "Z", "b0", "()Ljava/lang/String;", "g0", "f0", "e0", "m0", "X", "Y", "h0", "W", "c0", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "P", "(Ljava/util/List;)V", "d0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "K", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", OMSTemplateType.dialog, "onShow", "(Landroid/content/DialogInterface;)V", "Ll/d30;", "onCloseCallback", "i0", "(Ll/d30;)V", "onKeyBackCallback", "k0", "Ll/g30;", "onPaymentSuccess", "l0", "(Ll/g30;)V", SysnotifListener.ACTION_DISMISS, "j0", "j", "Lcom/p1/mobile/android/app/Act;", "k", "Lcom/p1/mobile/putong/core/data/PurchaseType;", BLiveStormDanmakuGiftResourceType.f44444l, "Ljava/lang/String;", "Landroid/widget/FrameLayout;", "m", "Landroid/widget/FrameLayout;", j6f.LATITUDE_SOUTH, "()Landroid/widget/FrameLayout;", "set_root", "(Landroid/widget/FrameLayout;)V", "_root", "n", j6f.GPS_MEASUREMENT_INTERRUPTED, "set_svga_content", "_svga_content", "Lcom/tantan/library/svga/SVGAnimationView;", "o", "Lcom/tantan/library/svga/SVGAnimationView;", "U", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_svga_background", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_svga_background", "p", j6f.GPS_DIRECTION_TRUE, "set_svga_avatars", "_svga_avatars", "Lv/VImage;", "q", "Lv/VImage;", "Q", "()Lv/VImage;", "set_close", "(Lv/VImage;)V", "_close", "Landroid/widget/LinearLayout;", "r", "Landroid/widget/LinearLayout;", "R", "()Landroid/widget/LinearLayout;", "set_content", "(Landroid/widget/LinearLayout;)V", "_content", BLiveStormDanmakuGiftResourceType.f44446s, "Ll/d30;", "onCloseClick", Constants.KEY_T, "u", "Ll/g30;", ResourceDirection.f38808v, "onDismiss", "Ll/j5b0;", "w", "Ll/j5b0;", "mediator", "", "Ll/d1m;", BaseSei.f13930X, "Ljava/util/List;", "purchaseComponentsList", "", BaseSei.f13931Y, "isDialogShow", "Ll/hab0;", BaseSei.f13932Z, "Ll/hab0;", "purchasePageTrack", "Ll/cwf0;", "A", "Ll/cwf0;", "statisticsPageHelper", "Ll/e30;", "", "kotlin.jvm.PlatformType", "B", "Ll/e30;", "dialogStateAction", "", b2s.C_ZONE, "F", "contentTransY", "Companion", "b", "a", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class DialogC8779d extends szd {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final cwf0 statisticsPageHelper;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final e30<Integer> dialogStateAction;

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
    public d30 onCloseClick;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public d30 onKeyBackCallback;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public g30<PurchaseType, Act, String> onPaymentSuccess;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public d30 onDismiss;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public j5b0 mediator;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public List<d1m> purchaseComponentsList;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public boolean isDialogShow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public hab0 purchasePageTrack;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.d$a */
    @Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00002\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0014\u0010\u000bJ\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010 R\u0018\u0010\f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010 R,\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010 ¨\u0006%"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/mediator/d$a;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "Ll/d30;", "onCloseCallback", "a", "(Ll/d30;)Lcom/p1/mobile/putong/core/ui/purchase/mediator/d$a;", "onKeyBackCallback", "c", "Ll/g30;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "onPaymentSuccess", Constants.INAPP_DATA_TAG, "(Ll/g30;)Lcom/p1/mobile/putong/core/ui/purchase/mediator/d$a;", SysnotifListener.ACTION_DISMISS, "b", "", "e", "()V", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "Ll/d30;", "onCloseClick", "Ll/g30;", "f", "onDismiss", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Act act;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public String from;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public d30 onCloseClick;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public d30 onKeyBackCallback;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public g30<PurchaseType, Act, String> onPaymentSuccess;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public d30 onDismiss;

        public a(@NotNull Act act, @Nullable String str) {
            act.getClass();
            this.act = act;
            this.from = str;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final a m54131a(@Nullable d30 onCloseCallback) {
            this.onCloseClick = onCloseCallback;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final a m54132b(@Nullable d30 dismiss) {
            this.onDismiss = dismiss;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final a m54133c(@Nullable d30 onKeyBackCallback) {
            this.onKeyBackCallback = onKeyBackCallback;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final a m54134d(@Nullable g30<PurchaseType, Act, String> onPaymentSuccess) {
            this.onPaymentSuccess = onPaymentSuccess;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public final void m54135e() {
            DialogC8779d dialogC8779d = new DialogC8779d(this.act, PurchaseType.TYPE_LIMITED_TRIAL_SEE, this.from);
            dialogC8779d.m54126i0(this.onCloseClick);
            dialogC8779d.m54128k0(this.onKeyBackCallback);
            dialogC8779d.m54129l0(this.onPaymentSuccess);
            dialogC8779d.m54127j0(this.onDismiss);
            dialogC8779d.show();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.d$c */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"com/p1/mobile/putong/core/ui/purchase/mediator/d$c", "Lcom/tantan/library/svga/AnimListener;", "", "onFinished", "()V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class c extends AnimListener {
        public c() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            xdl0.m208345M0(DialogC8779d.this.m54116U(), true);
            xdl0.m208344M(DialogC8779d.this.m54115T(), false);
            DialogC8779d.this.m54116U().startAnimation();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.d$d */
    @Metadata(m87231d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"com/p1/mobile/putong/core/ui/purchase/mediator/d$d", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$e;", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "a", "(Ljava/util/List;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class d implements AbstractC8776a.e {
        public d() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.purchase.mediator.AbstractC8776a.e
        /* JADX INFO: renamed from: a */
        public void mo53996a(List<? extends C8765d> sections) {
            sections.getClass();
            hab0 hab0Var = DialogC8779d.this.purchasePageTrack;
            if (hab0Var != null) {
                hab0Var.m130100C(sections);
            }
            if (DialogC8779d.this.isDialogShow) {
                return;
            }
            DialogC8779d.this.isDialogShow = true;
            DialogC8779d.this.m54111P(sections);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.d$e */
    @Metadata(m87231d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"com/p1/mobile/putong/core/ui/purchase/mediator/d$e", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$b;", "Ll/ef60;", "paymentHandlerData", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "a", "(Ll/ef60;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class e implements AbstractC8776a.b {
        public e() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.purchase.mediator.AbstractC8776a.b
        /* JADX INFO: renamed from: a */
        public void mo53998a(ef60 paymentHandlerData, PurchaseType purchaseType) {
            paymentHandlerData.getClass();
            purchaseType.getClass();
            hab0 hab0Var = DialogC8779d.this.purchasePageTrack;
            if (hab0Var != null) {
                hab0Var.m130124x(paymentHandlerData, purchaseType);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.d$f */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"com/p1/mobile/putong/core/ui/purchase/mediator/d$f", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            DialogC8779d.this.m54115T().startAnimation();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.d$g */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"com/p1/mobile/putong/core/ui/purchase/mediator/d$g", "Ll/er2;", "", "pageId", "()Ljava/lang/String;", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class g extends er2 {
        @Override // p149l.n3m
        public String pageId() {
            return "p_purchase_page";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC8779d(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str) {
        super(act, false, y7c0.f196692b);
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.purchaseComponentsList = new ArrayList();
        this.statisticsPageHelper = new cwf0(new g());
        this.dialogStateAction = new e30() { // from class: l.jab0
            @Override // p149l.e30
            public final void call(Object obj) {
                DialogC8779d.m54098G(this.f117077a, ((Integer) obj).intValue());
            }
        };
        this.contentTransY = svq.m186103c(84);
    }

    /* JADX INFO: renamed from: E */
    public static Boolean m54096E(C8765d c8765d) {
        return Boolean.valueOf(c8765d.m53528j());
    }

    /* JADX INFO: renamed from: F */
    public static void m54097F(DialogC8779d dialogC8779d, View view) {
        d30 d30Var = dialogC8779d.onCloseClick;
        if (d30Var != null) {
            d30Var.call();
        }
        dialogC8779d.dialogStateAction.call(0);
    }

    /* JADX INFO: renamed from: G */
    public static void m54098G(DialogC8779d dialogC8779d, int i) {
        if (i == -1) {
            dialogC8779d.hide();
            return;
        }
        if (i != 0) {
            if (i == 1) {
                dialogC8779d.show();
                return;
            } else if (i != 2) {
                return;
            }
        }
        dialogC8779d.dismiss();
    }

    /* JADX INFO: renamed from: H */
    public static void m54099H(DialogC8779d dialogC8779d, DialogInterface dialogInterface) {
        dialogC8779d.m54108d0();
    }

    /* JADX INFO: renamed from: I */
    public static boolean m54100I(DialogC8779d dialogC8779d, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (i != 4 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 0) {
            return false;
        }
        dialogC8779d.dialogStateAction.call(0);
        d30 d30Var = dialogC8779d.onKeyBackCallback;
        if (d30Var == null) {
            return true;
        }
        d30Var.call();
        return true;
    }

    /* JADX INFO: renamed from: J */
    public static void m54101J(DialogC8779d dialogC8779d, DialogInterface dialogInterface) {
        if (dialogC8779d.isDialogShow) {
            i0e.m133796e(dialogC8779d.statisticsPageHelper);
        }
        d30 d30Var = dialogC8779d.onDismiss;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: X */
    private final void m54106X() {
        m186759y();
        m186758x();
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.lab0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return DialogC8779d.m54100I(this.f127180a, dialogInterface, i, keyEvent);
            }
        });
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.mab0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                DialogC8779d.m54099H(this.f132841a, dialogInterface);
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.nab0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                DialogC8779d.m54101J(this.f137875a, dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    private final void m54107a0() {
        m54114S().setAlpha(0.0f);
        int iM208412y0 = xdl0.m208412y0();
        ViewGroup.LayoutParams layoutParams = m54117V().getLayoutParams();
        layoutParams.getClass();
        layoutParams.height = (int) (iM208412y0 * 1.36f);
        m54117V().setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = m54112Q().getLayoutParams();
        layoutParams2.getClass();
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
        layoutParams3.topMargin = xdl0.m208331F0() + t100.f167258g;
        m54112Q().setLayoutParams(layoutParams3);
        m54112Q().setImageResource(d3c0.f83818Y2);
        xdl0.m208329E0(m54112Q(), new View.OnClickListener() { // from class: l.oab0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC8779d.m54097F(this.f142798a, view);
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    private final void m54108d0() {
        j5b0 j5b0Var = this.mediator;
        if (j5b0Var != null) {
            j5b0Var.m54013K();
        }
        Iterator<d1m> it = this.purchaseComponentsList.iterator();
        while (it.hasNext()) {
            it.next().release();
        }
    }

    /* JADX INFO: renamed from: h0 */
    private final void m54109h0() {
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
    public final View m54110K(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM168084b = pab0.m168084b(this, inflater, parent);
        viewM168084b.getClass();
        return viewM168084b;
    }

    /* JADX INFO: renamed from: P */
    public final void m54111P(List<? extends C8765d> sections) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseShowFrom", w2b0.m201088b(this.from));
            ProductCategory productCategory = this.purchaseType.productCategory();
            jSONObject.put("productType", productCategory.name());
            jSONObject.put("skuGroup", vwb.m200307U(iab0.m135149j(sections), Constants.SEPARATOR_COMMA));
            jSONObject.put("default_product", productCategory.toString());
            jSONObject.put("default_duration", p2b0.m167133h().m167147p(productCategory));
            boolean zM81303a = NullChecker.m81303a(vwb.m200346r(sections, new w9j() { // from class: l.kab0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return DialogC8779d.m54096E((C8765d) obj);
                }
            }));
            String str = "no";
            jSONObject.put("if_sale", zM81303a ? "yes" : "no");
            jSONObject.put("if_discount", zM81303a);
            boolean z = false;
            jSONObject.put("if_double_tab", false);
            jSONObject.put("function_type", "limitedSeeTrial");
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
            jSONObject.put("tooltips_type_ui", "alert_self_definition_business_a");
            jSONObject.put("tooltips_trigger_module", "purchase_button");
            jSONObject.put("tooltips_trigger_page", "anywhere");
            jSONObject.put("tooltips_type", "alert");
            jSONObject.put("tooltips_trigger_reason", FirebaseAnalytics.Event.PURCHASE);
            if (CoreModule.m29935P().m94651a().mo33425U() && CoreModule.f17545c.f19591O0.m30088w3()) {
                str = "yes";
            }
            jSONObject.put("no_secret_payment", str);
            jSONObject.put("user_secret_staus", str);
            if (CoreModule.m29935P().m94658i().mo158272N()) {
                if (CoreModule.f17545c.f19639e0.m169464Z7() && !CoreModule.f17545c.f19639e0.m169452W7() && !CoreModule.f17545c.f19639e0.m169506k8()) {
                    z = true;
                }
                jSONObject.put("is_fakeunreal", z);
            }
        } catch (JSONException e2) {
            CrashHelper.m81296c(e2);
        }
        this.statisticsPageHelper.m109039o(jSONObject);
        i0e.m133797f(this.statisticsPageHelper);
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final VImage m54112Q() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final LinearLayout m54113R() {
        LinearLayout linearLayout = this._content;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final FrameLayout m54114S() {
        FrameLayout frameLayout = this._root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final SVGAnimationView m54115T() {
        SVGAnimationView sVGAnimationView = this._svga_avatars;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m87502r("_svga_avatars");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final SVGAnimationView m54116U() {
        SVGAnimationView sVGAnimationView = this._svga_background;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m87502r("_svga_background");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final FrameLayout m54117V() {
        FrameLayout frameLayout = this._svga_content;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_svga_content");
        return null;
    }

    /* JADX INFO: renamed from: W */
    public final void m54118W() {
        m54125g0();
        m54124f0();
        m54123e0();
        m54122c0();
        j5b0 j5b0Var = this.mediator;
        if (j5b0Var != null) {
            j5b0Var.mo54040w();
        }
        Iterator<d1m> it = this.purchaseComponentsList.iterator();
        while (it.hasNext()) {
            it.next().mo100278b();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m54119Y() {
        ProductCategory productCategory = this.purchaseType.productCategory();
        productCategory.getClass();
        this.purchasePageTrack = new x5b0(productCategory, PurchaseTrackPageType.page_discount_trial_see, this.from);
        j5b0 j5b0Var = new j5b0(this.act, this.purchaseType, this.from);
        this.mediator = j5b0Var;
        j5b0Var.m54018P(this.purchasePageTrack);
        hab0 hab0Var = this.purchasePageTrack;
        if (hab0Var != null) {
            ProductCategory productCategory2 = this.purchaseType.productCategory();
            productCategory2.getClass();
            hab0Var.m130122v(productCategory2);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m54120Z() {
        Picture pictureM60124fp;
        Picture.ImageUri imageUriProfileBig;
        m54113R().setAlpha(0.0f);
        m54113R().setTranslationY(this.contentTransY);
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        sVGADynamicEntity.setDynamicImage(m54121b0(), "head01");
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        String str = (userM169527p9 == null || (pictureM60124fp = userM169527p9.m60124fp()) == null || (imageUriProfileBig = pictureM60124fp.profileBig()) == null) ? null : imageUriProfileBig.formatted();
        if (str != null && str.length() != 0) {
            sVGADynamicEntity.setDynamicImage(str, "head02");
        }
        SVGALoader.with(this.act).from("https://auto.tancdn.com/v1/raw/ca9e7635-4202-4068-bac3-59f7e595137814.pdf").autoPlay(false).repeatCount(1).dynamic(sVGADynamicEntity).animListener(new c()).into(m54115T());
        SVGALoader.with(this.act).from("https://auto.tancdn.com/v1/raw/58851589-9e7e-4e75-bcc1-f74c4e36caf214.pdf").autoPlay(false).repeatCount(-1).dynamic(sVGADynamicEntity).into(m54116U());
    }

    /* JADX INFO: renamed from: b0 */
    public final String m54121b0() {
        return (String) (zz6.m221004u0() ? CollectionsKt.listOf((Object[]) new String[]{"https://auto.tancdn.com/v1/images/eyJpZCI6IjRIV083REpVSFpVUTdQR0VTR0hYRkpFUDQzRTNDMjE0IiwidyI6MzYwLCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTExNjQ0NDcwNjMzMTA4MzAxfQ.png", "https://auto.tancdn.com/v1/images/eyJpZCI6Ik5aM1JWNVVXRzdJS1BINlJDR0pEN1JDRUpITDJMVzE0IiwidyI6MzYwLCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMjUyNTUxNzA0Mzk5MTUyNjYzfQ.png", "https://auto.tancdn.com/v1/images/eyJpZCI6IjNBSk9MTFkyVEI0Qk1HQ0dBNllYMllDQzVLTk9ZTTE0IiwidyI6MzYwLCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NzEyMjM3MTQ0OTEyODU5NDIxfQ.png", "https://auto.tancdn.com/v1/images/eyJpZCI6IlRYMlQ0SVBINjRJWk1JQlJWSTJHRDNJNTdINVhNRTE0IiwidyI6MzYwLCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyODIwNzUzMzU1NDM0NjY2MjY3fQ.png"}) : CollectionsKt.listOf((Object[]) new String[]{"https://auto.tancdn.com/v1/images/eyJpZCI6Ik9UT1lSUEZERkVFTDNWU09ZNExNUUQ3WVZBUjU3NjE0IiwidyI6MzYwLCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MjY1OTU2OTMzNjQxMjQ5MzIzfQ.png", "https://auto.tancdn.com/v1/images/eyJpZCI6IkpDS1RHT1lCMlM0RFJUM0NFSUdUQkgyQktCMjZORTE0IiwidyI6MzYwLCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMzk3MzAzNjQ2MzUxMzczMDk5fQ.png", "https://auto.tancdn.com/v1/images/eyJpZCI6IkRaRjdBVEJNR05WQlRUSk1GN1pTWE9HTkpJR1o3STE0IiwidyI6MzYwLCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NzQ0MTk1NzE4MDMzMDc0OTcxfQ.png", "https://auto.tancdn.com/v1/images/eyJpZCI6Ijc2RE4zWTJPSkJPNjQ1WlFKVUc1R0tUREVOS0JXWTE0IiwidyI6MzYwLCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyODYxMzU1MzgyODYxMzA0NjI5fQ.png"})).get(zbc0.m217835a(0, 4));
    }

    /* JADX INFO: renamed from: c0 */
    public final void m54122c0() {
        j5b0 j5b0Var = this.mediator;
        if (j5b0Var != null) {
            j5b0Var.m54012J(new d());
            j5b0Var.m54009G(new e());
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m54123e0() {
        w0b0 w0b0Var = new w0b0(this.act, this.purchaseType, this.from, this.mediator);
        m54113R().addView(w0b0Var.mo95244a(m54113R()));
        w0b0Var.register();
        this.purchaseComponentsList.add(w0b0Var);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m54124f0() {
        i7b0 i7b0Var = new i7b0(this.act, this.purchaseType, this.from, this.mediator);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = svq.m186103c(72);
        m54113R().addView(i7b0Var.mo95244a(m54113R()), layoutParams);
        i7b0Var.m157939O(this.dialogStateAction);
        i7b0Var.register();
        this.purchaseComponentsList.add(i7b0Var);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m54125g0() {
        View viewInflate = o7r.m163037a(this.act).inflate(m6c0.f131583e1, (ViewGroup) m54113R(), false);
        PurchaseTrialSeePrivilegeView purchaseTrialSeePrivilegeView = viewInflate instanceof PurchaseTrialSeePrivilegeView ? (PurchaseTrialSeePrivilegeView) viewInflate : null;
        if (purchaseTrialSeePrivilegeView != null) {
            purchaseTrialSeePrivilegeView.m54296c();
            m54113R().addView(purchaseTrialSeePrivilegeView);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m54126i0(@Nullable d30 onCloseCallback) {
        this.onCloseClick = onCloseCallback;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m54127j0(@Nullable d30 dismiss) {
        this.onDismiss = dismiss;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m54128k0(@Nullable d30 onKeyBackCallback) {
        this.onKeyBackCallback = onKeyBackCallback;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m54129l0(@Nullable g30<PurchaseType, Act, String> onPaymentSuccess) {
        this.onPaymentSuccess = onPaymentSuccess;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m54130m0() {
        FrameLayout frameLayoutM54114S = m54114S();
        Property property = View.ALPHA;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(frameLayoutM54114S, (Property<FrameLayout, Float>) property, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(167L);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(m54113R(), PropertyValuesHolder.ofFloat((Property<?, Float>) property, 0.0f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, this.contentTransY, 0.0f));
        objectAnimatorOfPropertyValuesHolder.getClass();
        objectAnimatorOfPropertyValuesHolder.setStartDelay(100L);
        objectAnimatorOfPropertyValuesHolder.setDuration(333L);
        Animator animatorM103737j = bt0.m103737j(75);
        animatorM103737j.addListener(new f());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.play(objectAnimatorOfFloat).with(animatorM103737j).before(objectAnimatorOfPropertyValuesHolder);
        animatorSet.start();
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0074a, p149l.hu0, android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater layoutInflater = this.act.getLayoutInflater();
        layoutInflater.getClass();
        View viewM54110K = m54110K(layoutInflater, null);
        m54119Y();
        m54107a0();
        m54120Z();
        m54118W();
        m54109h0();
        m54106X();
        setContentView(viewM54110K);
    }

    @Override // p149l.szd, android.content.DialogInterface.OnShowListener
    public void onShow(@Nullable DialogInterface dialog) {
        super.onShow(dialog);
        m54130m0();
    }
}
