package com.clevertap.android.sdk.inapp.pipsdk.internal.view;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.R$string;
import com.clevertap.android.sdk.inapp.pipsdk.C1288a;
import com.clevertap.android.sdk.inapp.pipsdk.PIPMediaType;
import com.clevertap.android.sdk.inapp.pipsdk.PIPPosition;
import com.clevertap.android.sdk.inapp.pipsdk.internal.view.PIPCompactView;
import com.google.android.material.badge.BadgeDrawable;
import com.p051p1.mobile.putong.data.OMSMercuryType;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ca60;
import p153l.dc60;
import p153l.ma60;
import p153l.svm;
import p153l.wbc0;
import p153l.xqf;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 W2\u00020\u0001:\u00010B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\t¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b%\u0010\u0015J\u0015\u0010&\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b&\u0010\u0015J\u0015\u0010'\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00122\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00122\u0006\u0010-\u001a\u00020)H\u0016¢\u0006\u0004\b.\u0010,J\r\u0010/\u001a\u00020\t¢\u0006\u0004\b/\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00107R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010A\u001a\u00020<8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010K\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010HR\u0018\u0010M\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010HR\u0018\u0010O\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010HR\u0018\u0010P\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010HR(\u0010V\u001a\b\u0012\u0004\u0012\u00020Q0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u00107\u001a\u0004\bR\u0010S\"\u0004\bT\u0010U¨\u0006X"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPCompactView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPMediaView;", "mediaView", "Ll/dc60;", "session", "Lkotlin/Function0;", "", "onExpand", "onClose", "onAction", "Lkotlin/Function1;", "Lcom/clevertap/android/sdk/inapp/pipsdk/PIPPosition;", "onSnap", "<init>", "(Landroid/content/Context;Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPMediaView;Ll/dc60;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "", "playing", ResourceDirection.f39656v, "(Z)V", "muted", "u", "", "pipWidthPx", "q", "(I)I", "Lcom/clevertap/android/sdk/inapp/pipsdk/a;", "cfg", "m", "(Lcom/clevertap/android/sdk/inapp/pipsdk/a;)V", OMSMercuryType.f39640mv, "n", "(Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPMediaView;)V", "p", "()V", BLiveStormDanmakuGiftResourceType.f45294s, "r", Constants.KEY_T, "(I)V", "Landroid/view/MotionEvent;", "ev", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", NotificationCompat.CATEGORY_EVENT, "onTouchEvent", "o", "a", "Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPMediaView;", "getMediaView", "()Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPMediaView;", "b", "Ll/dc60;", "c", "Lkotlin/jvm/functions/Function0;", Constants.INAPP_DATA_TAG, "e", "f", "Lkotlin/jvm/functions/Function1;", "Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPControlsOverlay;", "g", "Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPControlsOverlay;", "getControlsOverlay$clevertap_core_release", "()Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPControlsOverlay;", "controlsOverlay", "Ll/ca60;", "h", "Ll/ca60;", "dragHandler", "Landroid/widget/ImageView;", RXScreenCaptureService.KEY_INDEX, "Landroid/widget/ImageView;", "closeBtn", "j", "playPauseBtn", "k", "deeplinkBtn", BLiveStormDanmakuGiftResourceType.f45292l, "muteBtn", "expandBtn", "Ll/svm;", "getGetSafeInsets", "()Lkotlin/jvm/functions/Function0;", "setGetSafeInsets", "(Lkotlin/jvm/functions/Function0;)V", "getSafeInsets", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class PIPCompactView extends FrameLayout {

    @NotNull
    private static final C1289a Companion = new C1289a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final PIPMediaView mediaView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final dc60 session;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> onExpand;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> onClose;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> onAction;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Function1<PIPPosition, Unit> onSnap;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final PIPControlsOverlay controlsOverlay;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final ca60 dragHandler;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private ImageView closeBtn;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private ImageView playPauseBtn;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private ImageView deeplinkBtn;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private ImageView muteBtn;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private ImageView expandBtn;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private Function0<svm> getSafeInsets;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.pipsdk.internal.view.PIPCompactView$a */
    @Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPCompactView$a;", "", "<init>", "()V", "", "ELEVATION_DP", "I", "ICON_GAP_DP", "ICON_MARGIN_DP", "", "ICON_SIZE_FRACTION", "F", "MIN_ICON_SIZE_DP", "MAX_ICON_SIZE_DP", "CENTER_ICON_SCALE", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C1289a {
        public /* synthetic */ C1289a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1289a() {
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.pipsdk.internal.view.PIPCompactView$b */
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"com/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPCompactView$b", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", OMSTemplateModeType.view, "Landroid/graphics/Outline;", "outline", "", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C1290b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ float f5247a;

        public C1290b(float f) {
            this.f5247a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            view.getClass();
            outline.getClass();
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f5247a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PIPCompactView(@NotNull Context context, @NotNull PIPMediaView pIPMediaView, @NotNull dc60 dc60Var, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function1, @NotNull Function0<Unit> function2, @NotNull Function1<? super PIPPosition, Unit> function3) {
        super(context);
        context.getClass();
        pIPMediaView.getClass();
        dc60Var.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        this.mediaView = pIPMediaView;
        this.session = dc60Var;
        this.onExpand = function0;
        this.onClose = function1;
        this.onAction = function2;
        this.onSnap = function3;
        this.getSafeInsets = new Function0() { // from class: l.n960
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPCompactView.m6611d();
            }
        };
        C1288a c1288a = dc60Var.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String();
        setElevation(xqf.m212731a(6, context));
        m6620m(c1288a);
        addView(pIPMediaView, new FrameLayout.LayoutParams(-1, -1));
        PIPControlsOverlay pIPControlsOverlay = new PIPControlsOverlay(context);
        this.controlsOverlay = pIPControlsOverlay;
        pIPControlsOverlay.setAlpha(0.0f);
        int iM212731a = xqf.m212731a(24, context);
        int i = (int) (iM212731a * 1.0f);
        int iM212731a2 = xqf.m212731a(8, context);
        int iM212731a3 = xqf.m212731a(4, context);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(wbc0.f188230c);
        imageView.setContentDescription(context.getString(R$string.f4862c));
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageView.setScaleType(scaleType);
        imageView.setVisibility(c1288a.getShowCloseButton() ? 0 : 8);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: l.q960
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PIPCompactView.m6608a(this.f156198a, view);
            }
        });
        this.closeBtn = imageView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM212731a, iM212731a, BadgeDrawable.TOP_END);
        layoutParams.setMargins(iM212731a3, iM212731a3, iM212731a3, iM212731a3);
        Unit unit = Unit.INSTANCE;
        pIPControlsOverlay.addView(imageView, layoutParams);
        ImageView imageView2 = new ImageView(context);
        ma60 ma60Var = ma60.INSTANCE;
        imageView2.setImageResource(ma60Var.m157640d(true));
        imageView2.setContentDescription(context.getString(ma60Var.m157639c(true)));
        imageView2.setScaleType(scaleType);
        imageView2.setVisibility(8);
        this.playPauseBtn = imageView2;
        pIPControlsOverlay.addView(imageView2, new FrameLayout.LayoutParams(i, i, 17));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(wbc0.f188232e);
        imageView3.setContentDescription(context.getString(R$string.f4860a));
        imageView3.setScaleType(scaleType);
        imageView3.setVisibility(c1288a.getAction() != null ? 0 : 8);
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: l.r960
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PIPCompactView.m6614g(this.f161794a, view);
            }
        });
        this.deeplinkBtn = imageView3;
        linearLayout.addView(imageView3, new LinearLayout.LayoutParams(iM212731a, iM212731a));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(ma60Var.m157638b(true));
        imageView4.setContentDescription(context.getString(ma60Var.m157637a(true)));
        imageView4.setScaleType(scaleType);
        imageView4.setVisibility(8);
        this.muteBtn = imageView4;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iM212731a, iM212731a);
        layoutParams2.setMarginStart(iM212731a2);
        linearLayout.addView(imageView4, layoutParams2);
        ImageView imageView5 = new ImageView(context);
        imageView5.setImageResource(wbc0.f188233f);
        imageView5.setContentDescription(context.getString(R$string.f4868i));
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(c1288a.getShowExpandCollapseButton() ? 0 : 8);
        imageView5.setOnClickListener(new View.OnClickListener() { // from class: l.s960
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PIPCompactView.m6610c(this.f166908a, view);
            }
        });
        this.expandBtn = imageView5;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(iM212731a, iM212731a);
        layoutParams3.setMarginStart(iM212731a2);
        linearLayout.addView(imageView5, layoutParams3);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2, BadgeDrawable.BOTTOM_END);
        layoutParams4.setMargins(iM212731a3, iM212731a3, iM212731a3, iM212731a3);
        pIPControlsOverlay.addView(linearLayout, layoutParams4);
        addView(pIPControlsOverlay, new FrameLayout.LayoutParams(-1, -1));
        final int iM212731a4 = xqf.m212731a(80, context);
        this.dragHandler = new ca60(this, c1288a.getDragEnabled(), new Function0() { // from class: l.t960
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(PIPCompactView.m6612e(this.f172610a));
            }
        }, new Function0() { // from class: l.u960
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(PIPCompactView.m6616i(this.f178100a));
            }
        }, new Function0() { // from class: l.v960
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPCompactView.m6615h(this.f182959a);
            }
        }, new Function0() { // from class: l.w960
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(PIPCompactView.m6619l(iM212731a4));
            }
        }, new Function1() { // from class: l.x960
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PIPCompactView.m6617j(this.f192918a, (PIPPosition) obj);
            }
        }, new Function0() { // from class: l.y960
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPCompactView.m6618k(this.f198065a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m6608a(PIPCompactView pIPCompactView, View view) {
        pIPCompactView.getClass();
        pIPCompactView.onClose.invoke();
    }

    /* JADX INFO: renamed from: b */
    public static void m6609b(PIPMediaView pIPMediaView, PIPCompactView pIPCompactView, View view) {
        pIPMediaView.getClass();
        pIPCompactView.getClass();
        pIPMediaView.m6672t();
        pIPCompactView.m6623v(pIPMediaView.m6666m());
        pIPCompactView.controlsOverlay.m6635e();
    }

    /* JADX INFO: renamed from: c */
    public static void m6610c(PIPCompactView pIPCompactView, View view) {
        pIPCompactView.getClass();
        pIPCompactView.onExpand.invoke();
    }

    /* JADX INFO: renamed from: d */
    public static svm m6611d() {
        return svm.f170856e;
    }

    /* JADX INFO: renamed from: e */
    public static int m6612e(PIPCompactView pIPCompactView) {
        pIPCompactView.getClass();
        return pIPCompactView.session.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getHorizontalEdgeMarginPercent();
    }

    /* JADX INFO: renamed from: f */
    public static void m6613f(PIPMediaView pIPMediaView, PIPCompactView pIPCompactView, View view) {
        pIPMediaView.getClass();
        pIPCompactView.getClass();
        pIPMediaView.m6671s();
        pIPCompactView.m6622u(pIPMediaView.m6665l());
        pIPCompactView.controlsOverlay.m6635e();
    }

    /* JADX INFO: renamed from: g */
    public static void m6614g(PIPCompactView pIPCompactView, View view) {
        pIPCompactView.getClass();
        pIPCompactView.onAction.invoke();
    }

    /* JADX INFO: renamed from: h */
    public static svm m6615h(PIPCompactView pIPCompactView) {
        pIPCompactView.getClass();
        return pIPCompactView.getSafeInsets.invoke();
    }

    /* JADX INFO: renamed from: i */
    public static int m6616i(PIPCompactView pIPCompactView) {
        pIPCompactView.getClass();
        return pIPCompactView.session.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getVerticalEdgeMarginPercent();
    }

    /* JADX INFO: renamed from: j */
    public static Unit m6617j(PIPCompactView pIPCompactView, PIPPosition pIPPosition) {
        pIPCompactView.getClass();
        pIPPosition.getClass();
        pIPCompactView.session.m115229m(pIPPosition);
        pIPCompactView.onSnap.invoke(pIPPosition);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static Unit m6618k(PIPCompactView pIPCompactView) {
        pIPCompactView.getClass();
        PIPControlsOverlay.m6632g(pIPCompactView.controlsOverlay, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static int m6619l(int i) {
        return i;
    }

    /* JADX INFO: renamed from: m */
    private final void m6620m(C1288a cfg) {
        int iM212731a;
        if (cfg.getMediaType() == PIPMediaType.VIDEO || (cfg.getCornerRadiusDp() <= 0 && !cfg.getBorderEnabled())) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
            setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
            return;
        }
        int cornerRadiusDp = cfg.getCornerRadiusDp();
        Context context = getContext();
        context.getClass();
        float fM212731a = xqf.m212731a(cornerRadiusDp, context);
        if (!cfg.getBorderEnabled() || cfg.getBorderWidthDp() <= 0) {
            iM212731a = 0;
        } else {
            int borderWidthDp = cfg.getBorderWidthDp();
            Context context2 = getContext();
            context2.getClass();
            iM212731a = xqf.m212731a(borderWidthDp, context2);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        gradientDrawable.setCornerRadius(fM212731a);
        if (iM212731a > 0) {
            gradientDrawable.setStroke(iM212731a, cfg.getBorderColor());
        }
        setBackground(gradientDrawable);
        if (iM212731a > 0) {
            setPadding(iM212731a, iM212731a, iM212731a, iM212731a);
        }
        if (fM212731a > 0.0f) {
            setClipToOutline(true);
            setOutlineProvider(new C1290b(fM212731a));
        }
    }

    /* JADX INFO: renamed from: q */
    private final int m6621q(int pipWidthPx) {
        Context context = getContext();
        context.getClass();
        int iM212731a = xqf.m212731a(24, context);
        Context context2 = getContext();
        context2.getClass();
        return C15274a.m88492h((int) (pipWidthPx * 0.18f), iM212731a, xqf.m212731a(40, context2));
    }

    /* JADX INFO: renamed from: u */
    private final void m6622u(boolean muted) {
        Context context;
        ImageView imageView = this.muteBtn;
        if (imageView != null) {
            imageView.setImageResource(ma60.INSTANCE.m157638b(muted));
        }
        ImageView imageView2 = this.muteBtn;
        if (imageView2 != null) {
            imageView2.setContentDescription((imageView2 == null || (context = imageView2.getContext()) == null) ? null : context.getString(ma60.INSTANCE.m157637a(muted)));
        }
    }

    /* JADX INFO: renamed from: v */
    private final void m6623v(boolean playing) {
        Context context;
        ImageView imageView = this.playPauseBtn;
        if (imageView != null) {
            imageView.setImageResource(ma60.INSTANCE.m157640d(playing));
        }
        ImageView imageView2 = this.playPauseBtn;
        if (imageView2 != null) {
            imageView2.setContentDescription((imageView2 == null || (context = imageView2.getContext()) == null) ? null : context.getString(ma60.INSTANCE.m157639c(playing)));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getControlsOverlay$clevertap_core_release, reason: from getter */
    public final PIPControlsOverlay getControlsOverlay() {
        return this.controlsOverlay;
    }

    @NotNull
    public final Function0<svm> getGetSafeInsets() {
        return this.getSafeInsets;
    }

    @NotNull
    public final PIPMediaView getMediaView() {
        return this.mediaView;
    }

    /* JADX INFO: renamed from: n */
    public final void m6624n(@NotNull final PIPMediaView mv) {
        mv.getClass();
        if (mv.m6667n()) {
            ImageView imageView = this.playPauseBtn;
            if (imageView != null) {
                imageView.setVisibility(this.session.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getShowPlayPauseButton() ? 0 : 8);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: l.o960
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PIPCompactView.m6609b(mv, this, view);
                    }
                });
            }
            m6623v(mv.m6666m());
            ImageView imageView2 = this.muteBtn;
            if (imageView2 != null) {
                imageView2.setVisibility(this.session.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getShowMuteButton() ? 0 : 8);
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: l.p960
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PIPCompactView.m6613f(mv, this, view);
                    }
                });
            }
            m6622u(mv.m6665l());
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m6625o() {
        this.controlsOverlay.m6633c();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        ev.getClass();
        int actionMasked = ev.getActionMasked();
        if (actionMasked == 0) {
            this.dragHandler.m108476b(ev);
            return false;
        }
        if (actionMasked != 2) {
            return false;
        }
        return this.dragHandler.m108478d(ev);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        event.getClass();
        if (event.getActionMasked() == 0) {
            return true;
        }
        return this.dragHandler.m108477c(event);
    }

    /* JADX INFO: renamed from: p */
    public final void m6626p() {
        ImageView imageView = this.playPauseBtn;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ImageView imageView2 = this.playPauseBtn;
        if (imageView2 != null) {
            imageView2.setOnClickListener(null);
        }
        ImageView imageView3 = this.muteBtn;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
        ImageView imageView4 = this.muteBtn;
        if (imageView4 != null) {
            imageView4.setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m6627r(boolean muted) {
        m6622u(muted);
    }

    /* JADX INFO: renamed from: s */
    public final void m6628s(boolean playing) {
        m6623v(playing);
    }

    public final void setGetSafeInsets(@NotNull Function0<svm> function0) {
        function0.getClass();
        this.getSafeInsets = function0;
    }

    /* JADX INFO: renamed from: t */
    public final void m6629t(int pipWidthPx) {
        int iM6621q = m6621q(pipWidthPx);
        for (ImageView imageView : CollectionsKt.listOfNotNull((Object[]) new ImageView[]{this.deeplinkBtn, this.closeBtn, this.muteBtn, this.expandBtn})) {
            imageView.getLayoutParams().width = iM6621q;
            imageView.getLayoutParams().height = iM6621q;
        }
        ImageView imageView2 = this.playPauseBtn;
        if (imageView2 != null) {
            int i = (int) (iM6621q * 1.0f);
            imageView2.getLayoutParams().width = i;
            imageView2.getLayoutParams().height = i;
        }
    }
}
