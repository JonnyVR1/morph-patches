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
import com.clevertap.android.sdk.inapp.pipsdk.C1288a;
import com.clevertap.android.sdk.inapp.pipsdk.PIPAnimation;
import com.clevertap.android.sdk.inapp.pipsdk.PIPAnimationConfig;
import com.clevertap.android.sdk.inapp.pipsdk.PIPMediaType;
import com.clevertap.android.sdk.inapp.pipsdk.PIPPosition;
import com.clevertap.android.sdk.inapp.pipsdk.internal.view.PIPRootContainer;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.OMSMercuryType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.c4s;
import p153l.dc60;
import p153l.dgq0;
import p153l.il50;
import p153l.jl50;
import p153l.kb60;
import p153l.kkl0;
import p153l.l960;
import p153l.m960;
import p153l.svm;
import p153l.xqf;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 [2\u00020\u0001:\u00014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J'\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u0014J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001f\u0010\u0014J7\u0010$\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u001b\u0010'\u001a\u00020\t2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\t2\b\b\u0002\u0010)\u001a\u00020\u0017¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\t2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u00172\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103R*\u00109\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u0010(R*\u0010=\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u00105\u001a\u0004\b;\u00107\"\u0004\b<\u0010(R$\u0010A\u001a\u00020\u00172\u0006\u0010>\u001a\u00020\u00178\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0018\u0010E\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010H\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010K\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010N\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010R\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010V\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010Z\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010Y¨\u0006\\"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPRootContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ll/dc60;", BLiveStormDanmakuGiftResourceType.f45294s, "Lkotlin/Function0;", "", "actionHandler", "Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPExpandedView;", BaseSei.f14625Y, "(Ll/dc60;Lkotlin/jvm/functions/Function0;)Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPExpandedView;", "Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPMediaView;", OMSMercuryType.f39640mv, "Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPCompactView;", BaseSei.f14624X, "(Ll/dc60;Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPMediaView;Lkotlin/jvm/functions/Function0;)Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPCompactView;", "D", "()V", "w", "cv", "", "isReattach", "E", "(Ll/dc60;Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPCompactView;Z)V", "F", "Lcom/clevertap/android/sdk/inapp/pipsdk/PIPAnimationConfig;", c4s.C_ZONE, "(Ll/dc60;)Lcom/clevertap/android/sdk/inapp/pipsdk/PIPAnimationConfig;", "onAttachedToWindow", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "resourceProvider", "Ljava/util/concurrent/ExecutorService;", "mediaExecutor", ResourceDirection.f39656v, "(Ll/dc60;ZLcom/clevertap/android/sdk/inapp/images/FileResourceProvider;Ljava/util/concurrent/ExecutorService;)V", "onDone", "B", "(Lkotlin/jvm/functions/Function0;)V", "releaseMedia", BaseSei.f14626Z, "(Z)V", "Landroid/app/Activity;", "activity", "setupBackPressCallback", "(Landroid/app/Activity;)V", "Landroid/view/MotionEvent;", "ev", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "a", "Lkotlin/jvm/functions/Function0;", "getOnDismissRequested", "()Lkotlin/jvm/functions/Function0;", "setOnDismissRequested", "onDismissRequested", "b", "getOnShowFailed", "setOnShowFailed", "onShowFailed", "value", "c", "Z", "isExpanded", "()Z", Constants.INAPP_DATA_TAG, "Ll/dc60;", "session", "e", "Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPCompactView;", "compactView", "f", "Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPExpandedView;", "expandedView", "g", "Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPMediaView;", "mediaView", "Ll/jl50;", "h", "Ll/jl50;", "backCallback", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", RXScreenCaptureService.KEY_INDEX, "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "layoutListener", "Ll/svm;", "j", "Ll/svm;", "safeInsets", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class PIPRootContainer extends FrameLayout {

    @NotNull
    private static final C1296a Companion = new C1296a(null);

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
    private dc60 session;

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
    private jl50 backCallback;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private ViewTreeObserver.OnGlobalLayoutListener layoutListener;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private svm safeInsets;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.pipsdk.internal.view.PIPRootContainer$a */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPRootContainer$a;", "", "<init>", "()V", "", "MAX_HEIGHT_PERCENT", "I", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C1296a {
        public /* synthetic */ C1296a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1296a() {
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.pipsdk.internal.view.PIPRootContainer$b */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"com/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPRootContainer$b", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "()V", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class ViewTreeObserverOnGlobalLayoutListenerC1297b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ PIPCompactView f5286a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ PIPRootContainer f5287b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f5288c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f5289d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f5290e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ dc60 f5291f;

        public ViewTreeObserverOnGlobalLayoutListenerC1297b(PIPCompactView pIPCompactView, PIPRootContainer pIPRootContainer, int i, int i2, int i3, dc60 dc60Var) {
            this.f5286a = pIPCompactView;
            this.f5287b = pIPRootContainer;
            this.f5288c = i;
            this.f5289d = i2;
            this.f5290e = i3;
            this.f5291f = dc60Var;
        }

        /* JADX INFO: renamed from: a */
        public static Unit m6710a(dc60 dc60Var) {
            dc60Var.getClass();
            m960 callbacks = dc60Var.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getCallbacks();
            if (callbacks != null) {
                callbacks.mo6369d();
            }
            return Unit.INSTANCE;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f5286a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f5287b.layoutListener = null;
            PointF pointF = kb60.INSTANCE.m149025b(this.f5287b.getWidth(), this.f5287b.getHeight(), this.f5286a.getWidth(), this.f5286a.getHeight(), this.f5288c, this.f5289d, this.f5287b.safeInsets, this.f5290e).get(this.f5291f.getCurrentPosition());
            if (pointF == null) {
                return;
            }
            this.f5286a.setVisibility(0);
            l960 l960Var = l960.INSTANCE;
            PIPCompactView pIPCompactView = this.f5286a;
            PIPAnimationConfig pIPAnimationConfigM6679C = this.f5287b.m6679C(this.f5291f);
            int width = this.f5287b.getWidth();
            int height = this.f5287b.getHeight();
            final dc60 dc60Var = this.f5291f;
            l960Var.m153343j(pIPCompactView, pointF, pIPAnimationConfigM6679C, width, height, new Function0() { // from class: l.cc60
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PIPRootContainer.ViewTreeObserverOnGlobalLayoutListenerC1297b.m6710a(dc60Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.pipsdk.internal.view.PIPRootContainer$c */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"com/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPRootContainer$c", "Ll/jl50;", "", "handleOnBackPressed", "()V", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C1298c extends jl50 {
        public C1298c() {
            super(false);
        }

        @Override // p153l.jl50
        public void handleOnBackPressed() {
            PIPRootContainer.this.m6704w();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PIPRootContainer(@NotNull Context context) {
        super(context);
        context.getClass();
        svm svmVar = svm.f170856e;
        svmVar.getClass();
        this.safeInsets = svmVar;
        kkl0.m150194y0(this, new il50() { // from class: l.tb60
            @Override // p153l.il50
            public final dgq0 onApplyWindowInsets(View view, dgq0 dgq0Var) {
                return PIPRootContainer.m6685c(this.f172834a, view, dgq0Var);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m6678A(PIPRootContainer pIPRootContainer, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        pIPRootContainer.m6709z(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public final PIPAnimationConfig m6679C(dc60 s) {
        PIPAnimationConfig animationConfig = s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getAnimationConfig();
        PIPMediaView pIPMediaView = this.mediaView;
        return (pIPMediaView != null && pIPMediaView.m6667n() && animationConfig.getType() == PIPAnimation.DISSOLVE) ? PIPAnimationConfig.m6579c(animationConfig, PIPAnimation.INSTANT, 0L, null, null, 14, null) : animationConfig;
    }

    /* JADX INFO: renamed from: D */
    private final void m6680D() {
        PIPCompactView pIPCompactView;
        final PIPExpandedView pIPExpandedView;
        final PIPMediaView pIPMediaView;
        final dc60 dc60Var = this.session;
        if (dc60Var == null || (pIPCompactView = this.compactView) == null || (pIPExpandedView = this.expandedView) == null || (pIPMediaView = this.mediaView) == null) {
            return;
        }
        this.isExpanded = true;
        dc60Var.m115230n(true);
        jl50 jl50Var = this.backCallback;
        if (jl50Var != null) {
            jl50Var.setEnabled(true);
        }
        pIPCompactView.setVisibility(4);
        pIPExpandedView.setAlpha(0.0f);
        pIPExpandedView.setVisibility(0);
        pIPCompactView.removeView(pIPMediaView);
        pIPExpandedView.m6649j(pIPMediaView, dc60Var, new Function0() { // from class: l.rb60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPRootContainer.m6691i(pIPMediaView, pIPExpandedView, dc60Var);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    private final void m6681E(dc60 s, PIPCompactView cv, boolean isReattach) {
        int iM212731a;
        int iM88486b = C15274a.m88486b((int) ((getWidth() * s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getWidthPercent()) / 100.0f), 1);
        int iM88486b2 = C15274a.m88486b((int) ((((double) iM88486b) * s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getAspectRatioDenominator()) / s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getAspectRatioNumerator()), 1);
        int iM212732b = xqf.m212732b(s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getHorizontalEdgeMarginPercent(), getWidth());
        int iM212732b2 = xqf.m212732b(s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getVerticalEdgeMarginPercent(), getHeight());
        Context context = getContext();
        context.getClass();
        int iM212731a2 = xqf.m212731a(80, context);
        int height = (int) ((getHeight() * 40) / 100.0f);
        if (iM88486b2 > height) {
            iM88486b2 = C15274a.m88486b(height, 1);
            iM88486b = C15274a.m88486b((int) ((((double) iM88486b2) * s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getAspectRatioNumerator()) / s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getAspectRatioDenominator()), 1);
        }
        if (!s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getBorderEnabled() || s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getBorderWidthDp() <= 0 || s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getMediaType() == PIPMediaType.VIDEO) {
            iM212731a = 0;
        } else {
            int borderWidthDp = s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getBorderWidthDp();
            Context context2 = getContext();
            context2.getClass();
            iM212731a = xqf.m212731a(borderWidthDp, context2);
        }
        if (iM212731a > 0) {
            int i = iM212731a * 2;
            iM88486b += i;
            iM88486b2 += i;
        }
        int i2 = iM88486b;
        int i3 = iM88486b2;
        cv.m6629t(i2);
        if (!isReattach) {
            cv.setLayoutParams(new FrameLayout.LayoutParams(i2, i3));
            ViewTreeObserverOnGlobalLayoutListenerC1297b viewTreeObserverOnGlobalLayoutListenerC1297b = new ViewTreeObserverOnGlobalLayoutListenerC1297b(cv, this, iM212732b, iM212732b2, iM212731a2, s);
            this.layoutListener = viewTreeObserverOnGlobalLayoutListenerC1297b;
            cv.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1297b);
            return;
        }
        cv.setLayoutParams(new FrameLayout.LayoutParams(i2, i3));
        PointF pointF = kb60.INSTANCE.m149025b(getWidth(), getHeight(), i2, i3, iM212732b, iM212732b2, this.safeInsets, iM212731a2).get(s.getCurrentPosition());
        if (pointF == null) {
            return;
        }
        cv.setX(pointF.x);
        cv.setY(pointF.y);
        cv.setVisibility(0);
    }

    /* JADX INFO: renamed from: F */
    private final void m6682F() {
        PIPCompactView pIPCompactView;
        dc60 dc60Var = this.session;
        if (dc60Var == null || (pIPCompactView = this.compactView) == null || pIPCompactView.getVisibility() != 0 || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        int iM212732b = xqf.m212732b(dc60Var.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getHorizontalEdgeMarginPercent(), getWidth());
        int iM212732b2 = xqf.m212732b(dc60Var.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getVerticalEdgeMarginPercent(), getHeight());
        Context context = getContext();
        context.getClass();
        PointF pointF = kb60.INSTANCE.m149025b(getWidth(), getHeight(), pIPCompactView.getWidth(), pIPCompactView.getHeight(), iM212732b, iM212732b2, this.safeInsets, xqf.m212731a(80, context)).get(dc60Var.getCurrentPosition());
        if (pointF == null) {
            return;
        }
        pIPCompactView.setX(pointF.x);
        pIPCompactView.setY(pointF.y);
    }

    /* JADX INFO: renamed from: a */
    public static Unit m6683a(final PIPRootContainer pIPRootContainer, final boolean z) {
        pIPRootContainer.getClass();
        pIPRootContainer.post(new Runnable() { // from class: l.zb60
            @Override // java.lang.Runnable
            public final void run() {
                PIPRootContainer.m6687e(z, pIPRootContainer);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m6684b(PIPCompactView pIPCompactView, PIPExpandedView pIPExpandedView, boolean z) {
        pIPCompactView.getClass();
        pIPExpandedView.getClass();
        pIPCompactView.m6628s(z);
        pIPExpandedView.m6652m(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static dgq0 m6685c(PIPRootContainer pIPRootContainer, View view, dgq0 dgq0Var) {
        pIPRootContainer.getClass();
        view.getClass();
        dgq0Var.getClass();
        svm svmVarM115680f = dgq0Var.m115680f(dgq0.C16531l.m115737f() | dgq0.C16531l.m115732a());
        svmVarM115680f.getClass();
        if (!Intrinsics.m88377d(svmVarM115680f, pIPRootContainer.safeInsets)) {
            pIPRootContainer.safeInsets = svmVarM115680f;
            pIPRootContainer.m6682F();
        }
        return dgq0Var;
    }

    /* JADX INFO: renamed from: d */
    public static Unit m6686d(PIPRootContainer pIPRootContainer) {
        pIPRootContainer.getClass();
        pIPRootContainer.m6680D();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static void m6687e(boolean z, PIPRootContainer pIPRootContainer) {
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
    public static Unit m6688f(PIPExpandedView pIPExpandedView, PIPMediaView pIPMediaView, PIPCompactView pIPCompactView, dc60 dc60Var) {
        pIPExpandedView.getClass();
        pIPMediaView.getClass();
        pIPCompactView.getClass();
        dc60Var.getClass();
        pIPExpandedView.getMediaContainer().removeView(pIPMediaView);
        pIPCompactView.addView(pIPMediaView, 0, new FrameLayout.LayoutParams(-1, -1));
        pIPMediaView.m6668o();
        pIPExpandedView.setVisibility(8);
        pIPCompactView.setVisibility(0);
        pIPCompactView.m6627r(pIPMediaView.m6665l());
        pIPCompactView.m6628s(pIPMediaView.m6666m());
        m960 callbacks = dc60Var.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getCallbacks();
        if (callbacks != null) {
            callbacks.mo6366a();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static void m6689g(PIPRootContainer pIPRootContainer, PIPCompactView pIPCompactView, PIPMediaView pIPMediaView, boolean z, dc60 dc60Var) {
        pIPRootContainer.getClass();
        pIPCompactView.getClass();
        pIPMediaView.getClass();
        dc60Var.getClass();
        if (pIPRootContainer.getWidth() == 0 || pIPRootContainer.getHeight() == 0) {
            return;
        }
        pIPCompactView.m6624n(pIPMediaView);
        if (!z || !dc60Var.getIsExpanded()) {
            pIPRootContainer.m6681E(dc60Var, pIPCompactView, z);
        } else {
            pIPRootContainer.m6681E(dc60Var, pIPCompactView, true);
            pIPRootContainer.m6680D();
        }
    }

    /* JADX INFO: renamed from: h */
    public static Unit m6690h(PIPRootContainer pIPRootContainer) {
        pIPRootContainer.getClass();
        Function0<Unit> function0 = pIPRootContainer.onDismissRequested;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static Unit m6691i(PIPMediaView pIPMediaView, PIPExpandedView pIPExpandedView, final dc60 dc60Var) {
        pIPMediaView.getClass();
        pIPExpandedView.getClass();
        dc60Var.getClass();
        pIPMediaView.m6668o();
        l960.INSTANCE.m153342i(pIPExpandedView, pIPExpandedView.getMediaContainer(), new Function0() { // from class: l.sb60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPRootContainer.m6696n(dc60Var);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static Unit m6692j(PIPRootContainer pIPRootContainer) {
        pIPRootContainer.getClass();
        pIPRootContainer.m6704w();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static svm m6693k(PIPRootContainer pIPRootContainer) {
        pIPRootContainer.getClass();
        return pIPRootContainer.safeInsets;
    }

    /* JADX INFO: renamed from: l */
    public static Unit m6694l(final PIPRootContainer pIPRootContainer, final PIPCompactView pIPCompactView, final PIPMediaView pIPMediaView, final boolean z, final dc60 dc60Var) {
        pIPRootContainer.getClass();
        pIPCompactView.getClass();
        pIPMediaView.getClass();
        dc60Var.getClass();
        pIPRootContainer.post(new Runnable() { // from class: l.ob60
            @Override // java.lang.Runnable
            public final void run() {
                PIPRootContainer.m6689g(this.f145940a, pIPCompactView, pIPMediaView, z, dc60Var);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static Unit m6695m(PIPPosition pIPPosition) {
        pIPPosition.getClass();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static Unit m6696n(dc60 dc60Var) {
        dc60Var.getClass();
        m960 callbacks = dc60Var.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getCallbacks();
        if (callbacks != null) {
            callbacks.mo6370e();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static Unit m6697o(PIPCompactView pIPCompactView, PIPExpandedView pIPExpandedView) {
        pIPCompactView.getClass();
        pIPExpandedView.getClass();
        pIPCompactView.m6626p();
        pIPExpandedView.m6651l();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static Unit m6698p(PIPRootContainer pIPRootContainer) {
        pIPRootContainer.getClass();
        Function0<Unit> function0 = pIPRootContainer.onDismissRequested;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static Unit m6699q(dc60 dc60Var, PIPRootContainer pIPRootContainer) {
        dc60Var.getClass();
        pIPRootContainer.getClass();
        m960 callbacks = dc60Var.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getCallbacks();
        if (callbacks != null) {
            callbacks.mo6373h();
        }
        Function0<Unit> function0 = pIPRootContainer.onDismissRequested;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public final void m6704w() {
        final PIPCompactView pIPCompactView;
        final PIPExpandedView pIPExpandedView;
        final PIPMediaView pIPMediaView;
        final dc60 dc60Var = this.session;
        if (dc60Var == null || (pIPCompactView = this.compactView) == null || (pIPExpandedView = this.expandedView) == null || (pIPMediaView = this.mediaView) == null) {
            return;
        }
        this.isExpanded = false;
        dc60Var.m115230n(false);
        jl50 jl50Var = this.backCallback;
        if (jl50Var != null) {
            jl50Var.setEnabled(false);
        }
        l960.INSTANCE.m153341h(pIPExpandedView, new Function0() { // from class: l.lb60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPRootContainer.m6688f(pIPExpandedView, pIPMediaView, pIPCompactView, dc60Var);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    private final PIPCompactView m6705x(dc60 s, PIPMediaView mv, Function0<Unit> actionHandler) {
        Context context = getContext();
        context.getClass();
        PIPCompactView pIPCompactView = new PIPCompactView(context, mv, s, new Function0() { // from class: l.ac60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPRootContainer.m6686d(this.f69678a);
            }
        }, new Function0() { // from class: l.bc60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPRootContainer.m6698p(this.f76103a);
            }
        }, actionHandler, new Function1() { // from class: l.mb60
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PIPRootContainer.m6695m((PIPPosition) obj);
            }
        });
        pIPCompactView.setGetSafeInsets(new Function0() { // from class: l.nb60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPRootContainer.m6693k(this.f141075a);
            }
        });
        this.compactView = pIPCompactView;
        pIPCompactView.setVisibility(4);
        addView(pIPCompactView);
        return pIPCompactView;
    }

    /* JADX INFO: renamed from: y */
    private final PIPExpandedView m6706y(dc60 s, Function0<Unit> actionHandler) {
        Context context = getContext();
        context.getClass();
        PIPExpandedView pIPExpandedView = new PIPExpandedView(context, s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getShowCloseButton(), s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getAction() != null, s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getShowExpandCollapseButton(), s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getShowPlayPauseButton(), s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getShowMuteButton(), new Function0() { // from class: l.pb60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPRootContainer.m6692j(this.f151349a);
            }
        }, new Function0() { // from class: l.qb60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPRootContainer.m6690h(this.f156456a);
            }
        }, actionHandler);
        this.expandedView = pIPExpandedView;
        pIPExpandedView.setVisibility(8);
        addView(pIPExpandedView, new FrameLayout.LayoutParams(-1, -1));
        return pIPExpandedView;
    }

    /* JADX INFO: renamed from: B */
    public final void m6707B(@NotNull Function0<Unit> onDone) {
        View view;
        onDone.getClass();
        dc60 dc60Var = this.session;
        if (dc60Var == null) {
            onDone.invoke();
            return;
        }
        if (!this.isExpanded ? (view = this.compactView) == null : (view = this.expandedView) == null) {
            view = this;
        }
        l960.INSTANCE.m153344k(view, m6679C(dc60Var), onDone);
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
        kkl0.m150158g0(this);
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
        C1298c c1298c = new C1298c();
        this.backCallback = c1298c;
        componentActivity.getOnBackPressedDispatcher().m197b(c1298c);
    }

    /* JADX INFO: renamed from: v */
    public final void m6708v(@NotNull final dc60 s, final boolean isReattach, @Nullable FileResourceProvider resourceProvider, @Nullable ExecutorService mediaExecutor) {
        s.getClass();
        this.session = s;
        Function0<Unit> function0 = new Function0() { // from class: l.ub60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPRootContainer.m6699q(s, this);
            }
        };
        final PIPExpandedView pIPExpandedViewM6706y = m6706y(s, function0);
        Context context = getContext();
        context.getClass();
        final PIPMediaView pIPMediaView = new PIPMediaView(context);
        this.mediaView = pIPMediaView;
        final PIPCompactView pIPCompactViewM6705x = m6705x(s, pIPMediaView, function0);
        pIPMediaView.setOnVideoFallback(new Function0() { // from class: l.vb60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPRootContainer.m6697o(pIPCompactViewM6705x, pIPExpandedViewM6706y);
            }
        });
        pIPMediaView.setOnPlayStateChanged(new Function1() { // from class: l.wb60
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PIPRootContainer.m6684b(pIPCompactViewM6705x, pIPExpandedViewM6706y, ((Boolean) obj).booleanValue());
            }
        });
        pIPMediaView.setOnMediaReady(new Function0() { // from class: l.xb60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPRootContainer.m6694l(this.f193129a, pIPCompactViewM6705x, pIPMediaView, isReattach, s);
            }
        });
        pIPMediaView.setOnAllMediaFailed(new Function0() { // from class: l.yb60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPRootContainer.m6683a(this.f198279a, isReattach);
            }
        });
        if (isReattach) {
            resourceProvider.getClass();
            mediaExecutor.getClass();
            pIPMediaView.m6669p(s, resourceProvider, mediaExecutor);
        } else {
            C1288a c1288aM115218b = s.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String();
            resourceProvider.getClass();
            mediaExecutor.getClass();
            pIPMediaView.m6664k(c1288aM115218b, s, resourceProvider, mediaExecutor);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m6709z(boolean releaseMedia) {
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
            pIPCompactView2.m6625o();
        }
        PIPExpandedView pIPExpandedView = this.expandedView;
        if (pIPExpandedView != null) {
            pIPExpandedView.m6650k();
        }
        if (releaseMedia && (pIPMediaView = this.mediaView) != null) {
            pIPMediaView.m6670q();
        }
        jl50 jl50Var = this.backCallback;
        if (jl50Var != null) {
            jl50Var.remove();
        }
    }
}
