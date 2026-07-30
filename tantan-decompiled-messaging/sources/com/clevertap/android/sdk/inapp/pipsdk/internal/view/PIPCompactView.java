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
import com.clevertap.android.sdk.inapp.pipsdk.C1265a;
import com.clevertap.android.sdk.inapp.pipsdk.PIPMediaType;
import com.clevertap.android.sdk.inapp.pipsdk.PIPPosition;
import com.clevertap.android.sdk.inapp.pipsdk.internal.view.PIPCompactView;
import com.google.android.material.badge.BadgeDrawable;
import com.p046p1.mobile.putong.data.OMSMercuryType;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15167a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.h260;
import p149l.q3c0;
import p149l.qpf;
import p149l.rtm;
import p149l.x160;
import p149l.y360;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 W2\u00020\u0001:\u00010B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\t¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b%\u0010\u0015J\u0015\u0010&\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b&\u0010\u0015J\u0015\u0010'\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00122\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00122\u0006\u0010-\u001a\u00020)H\u0016¢\u0006\u0004\b.\u0010,J\r\u0010/\u001a\u00020\t¢\u0006\u0004\b/\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00107R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010A\u001a\u00020<8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010K\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010HR\u0018\u0010M\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010HR\u0018\u0010O\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010HR\u0018\u0010P\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010HR(\u0010V\u001a\b\u0012\u0004\u0012\u00020Q0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u00107\u001a\u0004\bR\u0010S\"\u0004\bT\u0010U¨\u0006X"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPCompactView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPMediaView;", "mediaView", "Ll/y360;", "session", "Lkotlin/Function0;", "", "onExpand", "onClose", "onAction", "Lkotlin/Function1;", "Lcom/clevertap/android/sdk/inapp/pipsdk/PIPPosition;", "onSnap", "<init>", "(Landroid/content/Context;Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPMediaView;Ll/y360;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "", "playing", ResourceDirection.f38808v, "(Z)V", "muted", "u", "", "pipWidthPx", "q", "(I)I", "Lcom/clevertap/android/sdk/inapp/pipsdk/a;", "cfg", "m", "(Lcom/clevertap/android/sdk/inapp/pipsdk/a;)V", OMSMercuryType.f38792mv, "n", "(Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPMediaView;)V", "p", "()V", BLiveStormDanmakuGiftResourceType.f44446s, "r", Constants.KEY_T, "(I)V", "Landroid/view/MotionEvent;", "ev", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", NotificationCompat.CATEGORY_EVENT, "onTouchEvent", "o", "a", "Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPMediaView;", "getMediaView", "()Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPMediaView;", "b", "Ll/y360;", "c", "Lkotlin/jvm/functions/Function0;", Constants.INAPP_DATA_TAG, "e", "f", "Lkotlin/jvm/functions/Function1;", "Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPControlsOverlay;", "g", "Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPControlsOverlay;", "getControlsOverlay$clevertap_core_release", "()Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPControlsOverlay;", "controlsOverlay", "Ll/x160;", "h", "Ll/x160;", "dragHandler", "Landroid/widget/ImageView;", RXScreenCaptureService.KEY_INDEX, "Landroid/widget/ImageView;", "closeBtn", "j", "playPauseBtn", "k", "deeplinkBtn", BLiveStormDanmakuGiftResourceType.f44444l, "muteBtn", "expandBtn", "Ll/rtm;", "getGetSafeInsets", "()Lkotlin/jvm/functions/Function0;", "setGetSafeInsets", "(Lkotlin/jvm/functions/Function0;)V", "getSafeInsets", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class PIPCompactView extends FrameLayout {

    @NotNull
    private static final C1266a Companion = new C1266a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final PIPMediaView mediaView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final y360 session;

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
    private final x160 dragHandler;

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
    private Function0<rtm> getSafeInsets;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.pipsdk.internal.view.PIPCompactView$a */
    @Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPCompactView$a;", "", "<init>", "()V", "", "ELEVATION_DP", "I", "ICON_GAP_DP", "ICON_MARGIN_DP", "", "ICON_SIZE_FRACTION", "F", "MIN_ICON_SIZE_DP", "MAX_ICON_SIZE_DP", "CENTER_ICON_SCALE", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class C1266a {
        public /* synthetic */ C1266a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1266a() {
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.pipsdk.internal.view.PIPCompactView$b */
    @Metadata(m87231d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"com/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPCompactView$b", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", OMSTemplateModeType.view, "Landroid/graphics/Outline;", "outline", "", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class C1267b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ float f5210a;

        public C1267b(float f) {
            this.f5210a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            view.getClass();
            outline.getClass();
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f5210a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PIPCompactView(@NotNull Context context, @NotNull PIPMediaView pIPMediaView, @NotNull y360 y360Var, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function1, @NotNull Function0<Unit> function2, @NotNull Function1<? super PIPPosition, Unit> function3) {
        super(context);
        context.getClass();
        pIPMediaView.getClass();
        y360Var.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        this.mediaView = pIPMediaView;
        this.session = y360Var;
        this.onExpand = function0;
        this.onClose = function1;
        this.onAction = function2;
        this.onSnap = function3;
        this.getSafeInsets = new Function0() { // from class: l.i160
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPCompactView.m6557d();
            }
        };
        C1265a c1265a = y360Var.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String();
        setElevation(qpf.m175834a(6, context));
        m6566m(c1265a);
        addView(pIPMediaView, new FrameLayout.LayoutParams(-1, -1));
        PIPControlsOverlay pIPControlsOverlay = new PIPControlsOverlay(context);
        this.controlsOverlay = pIPControlsOverlay;
        pIPControlsOverlay.setAlpha(0.0f);
        int iM175834a = qpf.m175834a(24, context);
        int i = (int) (iM175834a * 1.0f);
        int iM175834a2 = qpf.m175834a(8, context);
        int iM175834a3 = qpf.m175834a(4, context);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(q3c0.f152402c);
        imageView.setContentDescription(context.getString(R$string.f4825c));
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageView.setScaleType(scaleType);
        imageView.setVisibility(c1265a.getShowCloseButton() ? 0 : 8);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: l.l160
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PIPCompactView.m6554a(this.f125617a, view);
            }
        });
        this.closeBtn = imageView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM175834a, iM175834a, BadgeDrawable.TOP_END);
        layoutParams.setMargins(iM175834a3, iM175834a3, iM175834a3, iM175834a3);
        Unit unit = Unit.INSTANCE;
        pIPControlsOverlay.addView(imageView, layoutParams);
        ImageView imageView2 = new ImageView(context);
        h260 h260Var = h260.INSTANCE;
        imageView2.setImageResource(h260Var.m129093d(true));
        imageView2.setContentDescription(context.getString(h260Var.m129092c(true)));
        imageView2.setScaleType(scaleType);
        imageView2.setVisibility(8);
        this.playPauseBtn = imageView2;
        pIPControlsOverlay.addView(imageView2, new FrameLayout.LayoutParams(i, i, 17));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(q3c0.f152404e);
        imageView3.setContentDescription(context.getString(R$string.f4823a));
        imageView3.setScaleType(scaleType);
        imageView3.setVisibility(c1265a.getAction() != null ? 0 : 8);
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: l.m160
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PIPCompactView.m6560g(this.f130806a, view);
            }
        });
        this.deeplinkBtn = imageView3;
        linearLayout.addView(imageView3, new LinearLayout.LayoutParams(iM175834a, iM175834a));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(h260Var.m129091b(true));
        imageView4.setContentDescription(context.getString(h260Var.m129090a(true)));
        imageView4.setScaleType(scaleType);
        imageView4.setVisibility(8);
        this.muteBtn = imageView4;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iM175834a, iM175834a);
        layoutParams2.setMarginStart(iM175834a2);
        linearLayout.addView(imageView4, layoutParams2);
        ImageView imageView5 = new ImageView(context);
        imageView5.setImageResource(q3c0.f152405f);
        imageView5.setContentDescription(context.getString(R$string.f4831i));
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(c1265a.getShowExpandCollapseButton() ? 0 : 8);
        imageView5.setOnClickListener(new View.OnClickListener() { // from class: l.n160
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PIPCompactView.m6556c(this.f136615a, view);
            }
        });
        this.expandBtn = imageView5;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(iM175834a, iM175834a);
        layoutParams3.setMarginStart(iM175834a2);
        linearLayout.addView(imageView5, layoutParams3);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2, BadgeDrawable.BOTTOM_END);
        layoutParams4.setMargins(iM175834a3, iM175834a3, iM175834a3, iM175834a3);
        pIPControlsOverlay.addView(linearLayout, layoutParams4);
        addView(pIPControlsOverlay, new FrameLayout.LayoutParams(-1, -1));
        final int iM175834a4 = qpf.m175834a(80, context);
        this.dragHandler = new x160(this, c1265a.getDragEnabled(), new Function0() { // from class: l.o160
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(PIPCompactView.m6558e(this.f141407a));
            }
        }, new Function0() { // from class: l.p160
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(PIPCompactView.m6562i(this.f146654a));
            }
        }, new Function0() { // from class: l.q160
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPCompactView.m6561h(this.f152107a);
            }
        }, new Function0() { // from class: l.r160
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(PIPCompactView.m6565l(iM175834a4));
            }
        }, new Function1() { // from class: l.s160
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PIPCompactView.m6563j(this.f161865a, (PIPPosition) obj);
            }
        }, new Function0() { // from class: l.t160
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPCompactView.m6564k(this.f167289a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m6554a(PIPCompactView pIPCompactView, View view) {
        pIPCompactView.getClass();
        pIPCompactView.onClose.invoke();
    }

    /* JADX INFO: renamed from: b */
    public static void m6555b(PIPMediaView pIPMediaView, PIPCompactView pIPCompactView, View view) {
        pIPMediaView.getClass();
        pIPCompactView.getClass();
        pIPMediaView.m6618t();
        pIPCompactView.m6569v(pIPMediaView.m6612m());
        pIPCompactView.controlsOverlay.m6581e();
    }

    /* JADX INFO: renamed from: c */
    public static void m6556c(PIPCompactView pIPCompactView, View view) {
        pIPCompactView.getClass();
        pIPCompactView.onExpand.invoke();
    }

    /* JADX INFO: renamed from: d */
    public static rtm m6557d() {
        return rtm.f160971e;
    }

    /* JADX INFO: renamed from: e */
    public static int m6558e(PIPCompactView pIPCompactView) {
        pIPCompactView.getClass();
        return pIPCompactView.session.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getHorizontalEdgeMarginPercent();
    }

    /* JADX INFO: renamed from: f */
    public static void m6559f(PIPMediaView pIPMediaView, PIPCompactView pIPCompactView, View view) {
        pIPMediaView.getClass();
        pIPCompactView.getClass();
        pIPMediaView.m6617s();
        pIPCompactView.m6568u(pIPMediaView.m6611l());
        pIPCompactView.controlsOverlay.m6581e();
    }

    /* JADX INFO: renamed from: g */
    public static void m6560g(PIPCompactView pIPCompactView, View view) {
        pIPCompactView.getClass();
        pIPCompactView.onAction.invoke();
    }

    /* JADX INFO: renamed from: h */
    public static rtm m6561h(PIPCompactView pIPCompactView) {
        pIPCompactView.getClass();
        return pIPCompactView.getSafeInsets.invoke();
    }

    /* JADX INFO: renamed from: i */
    public static int m6562i(PIPCompactView pIPCompactView) {
        pIPCompactView.getClass();
        return pIPCompactView.session.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getVerticalEdgeMarginPercent();
    }

    /* JADX INFO: renamed from: j */
    public static Unit m6563j(PIPCompactView pIPCompactView, PIPPosition pIPPosition) {
        pIPCompactView.getClass();
        pIPPosition.getClass();
        pIPCompactView.session.m212786m(pIPPosition);
        pIPCompactView.onSnap.invoke(pIPPosition);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static Unit m6564k(PIPCompactView pIPCompactView) {
        pIPCompactView.getClass();
        PIPControlsOverlay.m6578g(pIPCompactView.controlsOverlay, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static int m6565l(int i) {
        return i;
    }

    /* JADX INFO: renamed from: m */
    private final void m6566m(C1265a cfg) {
        int iM175834a;
        if (cfg.getMediaType() == PIPMediaType.VIDEO || (cfg.getCornerRadiusDp() <= 0 && !cfg.getBorderEnabled())) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
            setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
            return;
        }
        int cornerRadiusDp = cfg.getCornerRadiusDp();
        Context context = getContext();
        context.getClass();
        float fM175834a = qpf.m175834a(cornerRadiusDp, context);
        if (!cfg.getBorderEnabled() || cfg.getBorderWidthDp() <= 0) {
            iM175834a = 0;
        } else {
            int borderWidthDp = cfg.getBorderWidthDp();
            Context context2 = getContext();
            context2.getClass();
            iM175834a = qpf.m175834a(borderWidthDp, context2);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        gradientDrawable.setCornerRadius(fM175834a);
        if (iM175834a > 0) {
            gradientDrawable.setStroke(iM175834a, cfg.getBorderColor());
        }
        setBackground(gradientDrawable);
        if (iM175834a > 0) {
            setPadding(iM175834a, iM175834a, iM175834a, iM175834a);
        }
        if (fM175834a > 0.0f) {
            setClipToOutline(true);
            setOutlineProvider(new C1267b(fM175834a));
        }
    }

    /* JADX INFO: renamed from: q */
    private final int m6567q(int pipWidthPx) {
        Context context = getContext();
        context.getClass();
        int iM175834a = qpf.m175834a(24, context);
        Context context2 = getContext();
        context2.getClass();
        return C15167a.m87601g((int) (pipWidthPx * 0.18f), iM175834a, qpf.m175834a(40, context2));
    }

    /* JADX INFO: renamed from: u */
    private final void m6568u(boolean muted) {
        Context context;
        ImageView imageView = this.muteBtn;
        if (imageView != null) {
            imageView.setImageResource(h260.INSTANCE.m129091b(muted));
        }
        ImageView imageView2 = this.muteBtn;
        if (imageView2 != null) {
            imageView2.setContentDescription((imageView2 == null || (context = imageView2.getContext()) == null) ? null : context.getString(h260.INSTANCE.m129090a(muted)));
        }
    }

    /* JADX INFO: renamed from: v */
    private final void m6569v(boolean playing) {
        Context context;
        ImageView imageView = this.playPauseBtn;
        if (imageView != null) {
            imageView.setImageResource(h260.INSTANCE.m129093d(playing));
        }
        ImageView imageView2 = this.playPauseBtn;
        if (imageView2 != null) {
            imageView2.setContentDescription((imageView2 == null || (context = imageView2.getContext()) == null) ? null : context.getString(h260.INSTANCE.m129092c(playing)));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getControlsOverlay$clevertap_core_release, reason: from getter */
    public final PIPControlsOverlay getControlsOverlay() {
        return this.controlsOverlay;
    }

    @NotNull
    public final Function0<rtm> getGetSafeInsets() {
        return this.getSafeInsets;
    }

    @NotNull
    public final PIPMediaView getMediaView() {
        return this.mediaView;
    }

    /* JADX INFO: renamed from: n */
    public final void m6570n(@NotNull final PIPMediaView mv) {
        mv.getClass();
        if (mv.m6613n()) {
            ImageView imageView = this.playPauseBtn;
            if (imageView != null) {
                imageView.setVisibility(this.session.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getShowPlayPauseButton() ? 0 : 8);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: l.j160
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PIPCompactView.m6555b(mv, this, view);
                    }
                });
            }
            m6569v(mv.m6612m());
            ImageView imageView2 = this.muteBtn;
            if (imageView2 != null) {
                imageView2.setVisibility(this.session.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getShowMuteButton() ? 0 : 8);
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: l.k160
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PIPCompactView.m6559f(mv, this, view);
                    }
                });
            }
            m6568u(mv.m6611l());
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m6571o() {
        this.controlsOverlay.m6579c();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        ev.getClass();
        int actionMasked = ev.getActionMasked();
        if (actionMasked == 0) {
            this.dragHandler.m206688b(ev);
            return false;
        }
        if (actionMasked != 2) {
            return false;
        }
        return this.dragHandler.m206690d(ev);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        event.getClass();
        if (event.getActionMasked() == 0) {
            return true;
        }
        return this.dragHandler.m206689c(event);
    }

    /* JADX INFO: renamed from: p */
    public final void m6572p() {
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
    public final void m6573r(boolean muted) {
        m6568u(muted);
    }

    /* JADX INFO: renamed from: s */
    public final void m6574s(boolean playing) {
        m6569v(playing);
    }

    public final void setGetSafeInsets(@NotNull Function0<rtm> function0) {
        function0.getClass();
        this.getSafeInsets = function0;
    }

    /* JADX INFO: renamed from: t */
    public final void m6575t(int pipWidthPx) {
        int iM6567q = m6567q(pipWidthPx);
        for (ImageView imageView : CollectionsKt.listOfNotNull((Object[]) new ImageView[]{this.deeplinkBtn, this.closeBtn, this.muteBtn, this.expandBtn})) {
            imageView.getLayoutParams().width = iM6567q;
            imageView.getLayoutParams().height = iM6567q;
        }
        ImageView imageView2 = this.playPauseBtn;
        if (imageView2 != null) {
            int i = (int) (iM6567q * 1.0f);
            imageView2.getLayoutParams().width = i;
            imageView2.getLayoutParams().height = i;
        }
    }
}
