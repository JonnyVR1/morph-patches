package com.clevertap.android.sdk.inapp.pipsdk.internal.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import com.clevertap.android.sdk.inapp.pipsdk.C1265a;
import com.clevertap.android.sdk.inapp.pipsdk.PIPAnimation;
import com.clevertap.android.sdk.inapp.pipsdk.PIPAnimationConfig;
import com.clevertap.android.sdk.inapp.pipsdk.PIPMediaType;
import com.clevertap.android.sdk.inapp.pipsdk.PIPPosition;
import com.clevertap.android.sdk.inapp.pipsdk.internal.view.PIPRootContainer;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.OMSMercuryType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15167a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b2s;
import p149l.bd50;
import p149l.cd50;
import p149l.f360;
import p149l.g160;
import p149l.gbl0;
import p149l.h160;
import p149l.qpf;
import p149l.rtm;
import p149l.y360;
import p149l.y6q0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 [2\u00020\u0001:\u00014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J'\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u0014J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001f\u0010\u0014J7\u0010$\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u001b\u0010'\u001a\u00020\t2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\t2\b\b\u0002\u0010)\u001a\u00020\u0017¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\t2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u00172\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103R*\u00109\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u0010(R*\u0010=\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u00105\u001a\u0004\b;\u00107\"\u0004\b<\u0010(R$\u0010A\u001a\u00020\u00172\u0006\u0010>\u001a\u00020\u00178\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0018\u0010E\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010H\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010K\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010N\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010R\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010V\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010Z\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010Y¨\u0006\\"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPRootContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ll/y360;", BLiveStormDanmakuGiftResourceType.f44446s, "Lkotlin/Function0;", "", "actionHandler", "Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPExpandedView;", BaseSei.f13931Y, "(Ll/y360;Lkotlin/jvm/functions/Function0;)Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPExpandedView;", "Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPMediaView;", OMSMercuryType.f38792mv, "Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPCompactView;", BaseSei.f13930X, "(Ll/y360;Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPMediaView;Lkotlin/jvm/functions/Function0;)Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPCompactView;", "D", "()V", "w", "cv", "", "isReattach", "E", "(Ll/y360;Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPCompactView;Z)V", "F", "Lcom/clevertap/android/sdk/inapp/pipsdk/PIPAnimationConfig;", b2s.C_ZONE, "(Ll/y360;)Lcom/clevertap/android/sdk/inapp/pipsdk/PIPAnimationConfig;", "onAttachedToWindow", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "resourceProvider", "Ljava/util/concurrent/ExecutorService;", "mediaExecutor", ResourceDirection.f38808v, "(Ll/y360;ZLcom/clevertap/android/sdk/inapp/images/FileResourceProvider;Ljava/util/concurrent/ExecutorService;)V", "onDone", "B", "(Lkotlin/jvm/functions/Function0;)V", "releaseMedia", BaseSei.f13932Z, "(Z)V", "Landroid/app/Activity;", "activity", "setupBackPressCallback", "(Landroid/app/Activity;)V", "Landroid/view/MotionEvent;", "ev", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "a", "Lkotlin/jvm/functions/Function0;", "getOnDismissRequested", "()Lkotlin/jvm/functions/Function0;", "setOnDismissRequested", "onDismissRequested", "b", "getOnShowFailed", "setOnShowFailed", "onShowFailed", "value", "c", "Z", "isExpanded", "()Z", Constants.INAPP_DATA_TAG, "Ll/y360;", "session", "e", "Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPCompactView;", "compactView", "f", "Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPExpandedView;", "expandedView", "g", "Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPMediaView;", "mediaView", "Ll/cd50;", "h", "Ll/cd50;", "backCallback", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", RXScreenCaptureService.KEY_INDEX, "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "layoutListener", "Ll/rtm;", "j", "Ll/rtm;", "safeInsets", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class PIPRootContainer extends FrameLayout {

    @NotNull
    private static final C1273a Companion = new C1273a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> onDismissRequested;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> onShowFailed;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isExpanded;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private y360 session;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private PIPCompactView compactView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private PIPExpandedView expandedView;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private PIPMediaView mediaView;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private cd50 backCallback;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private ViewTreeObserver.OnGlobalLayoutListener layoutListener;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private rtm safeInsets;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.pipsdk.internal.view.PIPRootContainer$a */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPRootContainer$a;", "", "<init>", "()V", "", "MAX_HEIGHT_PERCENT", "I", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class C1273a {
        public /* synthetic */ C1273a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1273a() {
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.pipsdk.internal.view.PIPRootContainer$b */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"com/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPRootContainer$b", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "()V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class ViewTreeObserverOnGlobalLayoutListenerC1274b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ PIPCompactView f5249a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ PIPRootContainer f5250b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f5251c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f5252d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f5253e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ y360 f5254f;

        public ViewTreeObserverOnGlobalLayoutListenerC1274b(PIPCompactView pIPCompactView, PIPRootContainer pIPRootContainer, int i, int i2, int i3, y360 y360Var) {
            this.f5249a = pIPCompactView;
            this.f5250b = pIPRootContainer;
            this.f5251c = i;
            this.f5252d = i2;
            this.f5253e = i3;
            this.f5254f = y360Var;
        }

        /* JADX INFO: renamed from: a */
        public static Unit m6656a(y360 y360Var) {
            y360Var.getClass();
            h160 callbacks = y360Var.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getCallbacks();
            if (callbacks != null) {
                callbacks.mo6315d();
            }
            return Unit.INSTANCE;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f5249a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f5250b.layoutListener = null;
            PointF pointF = f360.INSTANCE.m119250b(this.f5250b.getWidth(), this.f5250b.getHeight(), this.f5249a.getWidth(), this.f5249a.getHeight(), this.f5251c, this.f5252d, this.f5250b.safeInsets, this.f5253e).get(this.f5254f.getCurrentPosition());
            if (pointF == null) {
                return;
            }
            this.f5249a.setVisibility(0);
            g160 g160Var = g160.INSTANCE;
            PIPCompactView pIPCompactView = this.f5249a;
            PIPAnimationConfig pIPAnimationConfigM6625C = this.f5250b.m6625C(this.f5254f);
            int width = this.f5250b.getWidth();
            int height = this.f5250b.getHeight();
            final y360 y360Var = this.f5254f;
            g160Var.m124066j(pIPCompactView, pointF, pIPAnimationConfigM6625C, width, height, new Function0() { // from class: l.x360
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PIPRootContainer.ViewTreeObserverOnGlobalLayoutListenerC1274b.m6656a(y360Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.pipsdk.internal.view.PIPRootContainer$c */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"com/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPRootContainer$c", "Ll/cd50;", "", "handleOnBackPressed", "()V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class C1275c extends cd50 {
        public C1275c() {
            super(false);
        }

        @Override // p149l.cd50
        public void handleOnBackPressed() {
            PIPRootContainer.this.m6650w();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PIPRootContainer(@NotNull Context context) {
        super(context);
        context.getClass();
        rtm rtmVar = rtm.f160971e;
        rtmVar.getClass();
        this.safeInsets = rtmVar;
        gbl0.m125231y0(this, new bd50() { // from class: l.o360
            @Override // p149l.bd50
            public final y6q0 onApplyWindowInsets(View view, y6q0 y6q0Var) {
                return PIPRootContainer.m6631c(this.f141624a, view, y6q0Var);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m6624A(PIPRootContainer pIPRootContainer, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        pIPRootContainer.m6655z(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public final PIPAnimationConfig m6625C(y360 s) {
        PIPAnimationConfig animationConfig = s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getAnimationConfig();
        PIPMediaView pIPMediaView = this.mediaView;
        return (pIPMediaView != null && pIPMediaView.m6613n() && animationConfig.getType() == PIPAnimation.DISSOLVE) ? PIPAnimationConfig.m6525c(animationConfig, PIPAnimation.INSTANT, 0L, null, null, 14, null) : animationConfig;
    }

    /* JADX INFO: renamed from: D */
    private final void m6626D() {
        PIPCompactView pIPCompactView;
        final PIPExpandedView pIPExpandedView;
        final PIPMediaView pIPMediaView;
        final y360 y360Var = this.session;
        if (y360Var == null || (pIPCompactView = this.compactView) == null || (pIPExpandedView = this.expandedView) == null || (pIPMediaView = this.mediaView) == null) {
            return;
        }
        this.isExpanded = true;
        y360Var.m212787n(true);
        cd50 cd50Var = this.backCallback;
        if (cd50Var != null) {
            cd50Var.setEnabled(true);
        }
        pIPCompactView.setVisibility(4);
        pIPExpandedView.setAlpha(0.0f);
        pIPExpandedView.setVisibility(0);
        pIPCompactView.removeView(pIPMediaView);
        pIPExpandedView.m6595j(pIPMediaView, y360Var, new Function0() { // from class: l.m360
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPRootContainer.m6637i(pIPMediaView, pIPExpandedView, y360Var);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    private final void m6627E(y360 s, PIPCompactView cv, boolean isReattach) {
        int iM175834a;
        int iM87596b = C15167a.m87596b((int) ((getWidth() * s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getWidthPercent()) / 100.0f), 1);
        int iM87596b2 = C15167a.m87596b((int) ((((double) iM87596b) * s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getAspectRatioDenominator()) / s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getAspectRatioNumerator()), 1);
        int iM175835b = qpf.m175835b(s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getHorizontalEdgeMarginPercent(), getWidth());
        int iM175835b2 = qpf.m175835b(s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getVerticalEdgeMarginPercent(), getHeight());
        Context context = getContext();
        context.getClass();
        int iM175834a2 = qpf.m175834a(80, context);
        int height = (int) ((getHeight() * 40) / 100.0f);
        if (iM87596b2 > height) {
            iM87596b2 = C15167a.m87596b(height, 1);
            iM87596b = C15167a.m87596b((int) ((((double) iM87596b2) * s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getAspectRatioNumerator()) / s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getAspectRatioDenominator()), 1);
        }
        if (!s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getBorderEnabled() || s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getBorderWidthDp() <= 0 || s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getMediaType() == PIPMediaType.VIDEO) {
            iM175834a = 0;
        } else {
            int borderWidthDp = s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getBorderWidthDp();
            Context context2 = getContext();
            context2.getClass();
            iM175834a = qpf.m175834a(borderWidthDp, context2);
        }
        if (iM175834a > 0) {
            int i = iM175834a * 2;
            iM87596b += i;
            iM87596b2 += i;
        }
        int i2 = iM87596b;
        int i3 = iM87596b2;
        cv.m6575t(i2);
        if (!isReattach) {
            cv.setLayoutParams(new FrameLayout.LayoutParams(i2, i3));
            ViewTreeObserverOnGlobalLayoutListenerC1274b viewTreeObserverOnGlobalLayoutListenerC1274b = new ViewTreeObserverOnGlobalLayoutListenerC1274b(cv, this, iM175835b, iM175835b2, iM175834a2, s);
            this.layoutListener = viewTreeObserverOnGlobalLayoutListenerC1274b;
            cv.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1274b);
            return;
        }
        cv.setLayoutParams(new FrameLayout.LayoutParams(i2, i3));
        PointF pointF = f360.INSTANCE.m119250b(getWidth(), getHeight(), i2, i3, iM175835b, iM175835b2, this.safeInsets, iM175834a2).get(s.getCurrentPosition());
        if (pointF == null) {
            return;
        }
        cv.setX(pointF.x);
        cv.setY(pointF.y);
        cv.setVisibility(0);
    }

    /* JADX INFO: renamed from: F */
    private final void m6628F() {
        PIPCompactView pIPCompactView;
        y360 y360Var = this.session;
        if (y360Var == null || (pIPCompactView = this.compactView) == null || pIPCompactView.getVisibility() != 0 || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        int iM175835b = qpf.m175835b(y360Var.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getHorizontalEdgeMarginPercent(), getWidth());
        int iM175835b2 = qpf.m175835b(y360Var.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getVerticalEdgeMarginPercent(), getHeight());
        Context context = getContext();
        context.getClass();
        PointF pointF = f360.INSTANCE.m119250b(getWidth(), getHeight(), pIPCompactView.getWidth(), pIPCompactView.getHeight(), iM175835b, iM175835b2, this.safeInsets, qpf.m175834a(80, context)).get(y360Var.getCurrentPosition());
        if (pointF == null) {
            return;
        }
        pIPCompactView.setX(pointF.x);
        pIPCompactView.setY(pointF.y);
    }

    /* JADX INFO: renamed from: a */
    public static Unit m6629a(final PIPRootContainer pIPRootContainer, final boolean z) {
        pIPRootContainer.getClass();
        pIPRootContainer.post(new Runnable() { // from class: l.u360
            @Override // java.lang.Runnable
            public final void run() {
                PIPRootContainer.m6633e(z, pIPRootContainer);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m6630b(PIPCompactView pIPCompactView, PIPExpandedView pIPExpandedView, boolean z) {
        pIPCompactView.getClass();
        pIPExpandedView.getClass();
        pIPCompactView.m6574s(z);
        pIPExpandedView.m6598m(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static y6q0 m6631c(PIPRootContainer pIPRootContainer, View view, y6q0 y6q0Var) {
        pIPRootContainer.getClass();
        view.getClass();
        y6q0Var.getClass();
        rtm rtmVarM213179f = y6q0Var.m213179f(y6q0.C21326l.m213236f() | y6q0.C21326l.m213231a());
        rtmVarM213179f.getClass();
        if (!Intrinsics.m87488d(rtmVarM213179f, pIPRootContainer.safeInsets)) {
            pIPRootContainer.safeInsets = rtmVarM213179f;
            pIPRootContainer.m6628F();
        }
        return y6q0Var;
    }

    /* JADX INFO: renamed from: d */
    public static Unit m6632d(PIPRootContainer pIPRootContainer) {
        pIPRootContainer.getClass();
        pIPRootContainer.m6626D();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static void m6633e(boolean z, PIPRootContainer pIPRootContainer) {
        pIPRootContainer.getClass();
        if (z) {
            Function0<Unit> function0 = pIPRootContainer.onDismissRequested;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        Function0<Unit> function1 = pIPRootContainer.onShowFailed;
        if (function1 != null) {
            function1.invoke();
        }
    }

    /* JADX INFO: renamed from: f */
    public static Unit m6634f(PIPExpandedView pIPExpandedView, PIPMediaView pIPMediaView, PIPCompactView pIPCompactView, y360 y360Var) {
        pIPExpandedView.getClass();
        pIPMediaView.getClass();
        pIPCompactView.getClass();
        y360Var.getClass();
        pIPExpandedView.getMediaContainer().removeView(pIPMediaView);
        pIPCompactView.addView(pIPMediaView, 0, new FrameLayout.LayoutParams(-1, -1));
        pIPMediaView.m6614o();
        pIPExpandedView.setVisibility(8);
        pIPCompactView.setVisibility(0);
        pIPCompactView.m6573r(pIPMediaView.m6611l());
        pIPCompactView.m6574s(pIPMediaView.m6612m());
        h160 callbacks = y360Var.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getCallbacks();
        if (callbacks != null) {
            callbacks.mo6312a();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static void m6635g(PIPRootContainer pIPRootContainer, PIPCompactView pIPCompactView, PIPMediaView pIPMediaView, boolean z, y360 y360Var) {
        pIPRootContainer.getClass();
        pIPCompactView.getClass();
        pIPMediaView.getClass();
        y360Var.getClass();
        if (pIPRootContainer.getWidth() == 0 || pIPRootContainer.getHeight() == 0) {
            return;
        }
        pIPCompactView.m6570n(pIPMediaView);
        if (!z || !y360Var.getIsExpanded()) {
            pIPRootContainer.m6627E(y360Var, pIPCompactView, z);
        } else {
            pIPRootContainer.m6627E(y360Var, pIPCompactView, true);
            pIPRootContainer.m6626D();
        }
    }

    /* JADX INFO: renamed from: h */
    public static Unit m6636h(PIPRootContainer pIPRootContainer) {
        pIPRootContainer.getClass();
        Function0<Unit> function0 = pIPRootContainer.onDismissRequested;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static Unit m6637i(PIPMediaView pIPMediaView, PIPExpandedView pIPExpandedView, final y360 y360Var) {
        pIPMediaView.getClass();
        pIPExpandedView.getClass();
        y360Var.getClass();
        pIPMediaView.m6614o();
        g160.INSTANCE.m124065i(pIPExpandedView, pIPExpandedView.getMediaContainer(), new Function0() { // from class: l.n360
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPRootContainer.m6642n(y360Var);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static Unit m6638j(PIPRootContainer pIPRootContainer) {
        pIPRootContainer.getClass();
        pIPRootContainer.m6650w();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static rtm m6639k(PIPRootContainer pIPRootContainer) {
        pIPRootContainer.getClass();
        return pIPRootContainer.safeInsets;
    }

    /* JADX INFO: renamed from: l */
    public static Unit m6640l(final PIPRootContainer pIPRootContainer, final PIPCompactView pIPCompactView, final PIPMediaView pIPMediaView, final boolean z, final y360 y360Var) {
        pIPRootContainer.getClass();
        pIPCompactView.getClass();
        pIPMediaView.getClass();
        y360Var.getClass();
        pIPRootContainer.post(new Runnable() { // from class: l.j360
            @Override // java.lang.Runnable
            public final void run() {
                PIPRootContainer.m6635g(this.f116005a, pIPCompactView, pIPMediaView, z, y360Var);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static Unit m6641m(PIPPosition pIPPosition) {
        pIPPosition.getClass();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static Unit m6642n(y360 y360Var) {
        y360Var.getClass();
        h160 callbacks = y360Var.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getCallbacks();
        if (callbacks != null) {
            callbacks.mo6316e();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static Unit m6643o(PIPCompactView pIPCompactView, PIPExpandedView pIPExpandedView) {
        pIPCompactView.getClass();
        pIPExpandedView.getClass();
        pIPCompactView.m6572p();
        pIPExpandedView.m6597l();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static Unit m6644p(PIPRootContainer pIPRootContainer) {
        pIPRootContainer.getClass();
        Function0<Unit> function0 = pIPRootContainer.onDismissRequested;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static Unit m6645q(y360 y360Var, PIPRootContainer pIPRootContainer) {
        y360Var.getClass();
        pIPRootContainer.getClass();
        h160 callbacks = y360Var.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getCallbacks();
        if (callbacks != null) {
            callbacks.mo6319h();
        }
        Function0<Unit> function0 = pIPRootContainer.onDismissRequested;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public final void m6650w() {
        final PIPCompactView pIPCompactView;
        final PIPExpandedView pIPExpandedView;
        final PIPMediaView pIPMediaView;
        final y360 y360Var = this.session;
        if (y360Var == null || (pIPCompactView = this.compactView) == null || (pIPExpandedView = this.expandedView) == null || (pIPMediaView = this.mediaView) == null) {
            return;
        }
        this.isExpanded = false;
        y360Var.m212787n(false);
        cd50 cd50Var = this.backCallback;
        if (cd50Var != null) {
            cd50Var.setEnabled(false);
        }
        g160.INSTANCE.m124064h(pIPExpandedView, new Function0() { // from class: l.g360
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPRootContainer.m6634f(pIPExpandedView, pIPMediaView, pIPCompactView, y360Var);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    private final PIPCompactView m6651x(y360 s, PIPMediaView mv, Function0<Unit> actionHandler) {
        Context context = getContext();
        context.getClass();
        PIPCompactView pIPCompactView = new PIPCompactView(context, mv, s, new Function0() { // from class: l.v360
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPRootContainer.m6632d(this.f179749a);
            }
        }, new Function0() { // from class: l.w360
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPRootContainer.m6644p(this.f184311a);
            }
        }, actionHandler, new Function1() { // from class: l.h360
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PIPRootContainer.m6641m((PIPPosition) obj);
            }
        });
        pIPCompactView.setGetSafeInsets(new Function0() { // from class: l.i360
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPRootContainer.m6639k(this.f110616a);
            }
        });
        this.compactView = pIPCompactView;
        pIPCompactView.setVisibility(4);
        addView(pIPCompactView);
        return pIPCompactView;
    }

    /* JADX INFO: renamed from: y */
    private final PIPExpandedView m6652y(y360 s, Function0<Unit> actionHandler) {
        Context context = getContext();
        context.getClass();
        PIPExpandedView pIPExpandedView = new PIPExpandedView(context, s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getShowCloseButton(), s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getAction() != null, s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getShowExpandCollapseButton(), s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getShowPlayPauseButton(), s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getShowMuteButton(), new Function0() { // from class: l.k360
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPRootContainer.m6638j(this.f120797a);
            }
        }, new Function0() { // from class: l.l360
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPRootContainer.m6636h(this.f125845a);
            }
        }, actionHandler);
        this.expandedView = pIPExpandedView;
        pIPExpandedView.setVisibility(8);
        addView(pIPExpandedView, new FrameLayout.LayoutParams(-1, -1));
        return pIPExpandedView;
    }

    /* JADX INFO: renamed from: B */
    public final void m6653B(@NotNull Function0<Unit> onDone) {
        View view;
        onDone.getClass();
        y360 y360Var = this.session;
        if (y360Var == null) {
            onDone.invoke();
            return;
        }
        if (!this.isExpanded ? (view = this.compactView) == null : (view = this.expandedView) == null) {
            view = this;
        }
        g160.INSTANCE.m124067k(view, m6625C(y360Var), onDone);
    }

    @Nullable
    public final Function0<Unit> getOnDismissRequested() {
        return this.onDismissRequested;
    }

    @Nullable
    public final Function0<Unit> getOnShowFailed() {
        return this.onShowFailed;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        gbl0.m125195g0(this);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        ev.getClass();
        return false;
    }

    public final void setOnDismissRequested(@Nullable Function0<Unit> function0) {
        this.onDismissRequested = function0;
    }

    public final void setOnShowFailed(@Nullable Function0<Unit> function0) {
        this.onShowFailed = function0;
    }

    public final void setupBackPressCallback(@NotNull Activity activity) {
        activity.getClass();
        ComponentActivity componentActivity = activity instanceof ComponentActivity ? (ComponentActivity) activity : null;
        if (componentActivity == null) {
            return;
        }
        C1275c c1275c = new C1275c();
        this.backCallback = c1275c;
        componentActivity.getOnBackPressedDispatcher().m196b(c1275c);
    }

    /* JADX INFO: renamed from: v */
    public final void m6654v(@NotNull final y360 s, final boolean isReattach, @Nullable FileResourceProvider resourceProvider, @Nullable ExecutorService mediaExecutor) {
        s.getClass();
        this.session = s;
        Function0<Unit> function0 = new Function0() { // from class: l.p360
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPRootContainer.m6645q(s, this);
            }
        };
        final PIPExpandedView pIPExpandedViewM6652y = m6652y(s, function0);
        Context context = getContext();
        context.getClass();
        final PIPMediaView pIPMediaView = new PIPMediaView(context);
        this.mediaView = pIPMediaView;
        final PIPCompactView pIPCompactViewM6651x = m6651x(s, pIPMediaView, function0);
        pIPMediaView.setOnVideoFallback(new Function0() { // from class: l.q360
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPRootContainer.m6643o(pIPCompactViewM6651x, pIPExpandedViewM6652y);
            }
        });
        pIPMediaView.setOnPlayStateChanged(new Function1() { // from class: l.r360
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PIPRootContainer.m6630b(pIPCompactViewM6651x, pIPExpandedViewM6652y, ((Boolean) obj).booleanValue());
            }
        });
        pIPMediaView.setOnMediaReady(new Function0() { // from class: l.s360
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPRootContainer.m6640l(this.f162071a, pIPCompactViewM6651x, pIPMediaView, isReattach, s);
            }
        });
        pIPMediaView.setOnAllMediaFailed(new Function0() { // from class: l.t360
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPRootContainer.m6629a(this.f167594a, isReattach);
            }
        });
        if (isReattach) {
            resourceProvider.getClass();
            mediaExecutor.getClass();
            pIPMediaView.m6615p(s, resourceProvider, mediaExecutor);
        } else {
            C1265a c1265aM212775b = s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String();
            resourceProvider.getClass();
            mediaExecutor.getClass();
            pIPMediaView.m6610k(c1265aM212775b, s, resourceProvider, mediaExecutor);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m6655z(boolean releaseMedia) {
        PIPMediaView pIPMediaView;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.layoutListener;
        if (onGlobalLayoutListener != null) {
            PIPCompactView pIPCompactView = this.compactView;
            if (pIPCompactView != null && (viewTreeObserver = pIPCompactView.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.layoutListener = null;
        }
        PIPCompactView pIPCompactView2 = this.compactView;
        if (pIPCompactView2 != null) {
            pIPCompactView2.m6571o();
        }
        PIPExpandedView pIPExpandedView = this.expandedView;
        if (pIPExpandedView != null) {
            pIPExpandedView.m6596k();
        }
        if (releaseMedia && (pIPMediaView = this.mediaView) != null) {
            pIPMediaView.m6616q();
        }
        cd50 cd50Var = this.backCallback;
        if (cd50Var != null) {
            cd50Var.remove();
        }
    }
}
