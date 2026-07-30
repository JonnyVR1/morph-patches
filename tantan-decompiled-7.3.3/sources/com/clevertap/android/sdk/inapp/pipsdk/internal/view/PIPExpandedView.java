package com.clevertap.android.sdk.inapp.pipsdk.internal.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.R$string;
import com.clevertap.android.sdk.inapp.pipsdk.internal.view.PIPExpandedView;
import com.google.android.material.badge.BadgeDrawable;
import com.p051p1.mobile.putong.data.OMSMercuryType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.dc60;
import p153l.dgq0;
import p153l.il50;
import p153l.kkl0;
import p153l.ma60;
import p153l.svm;
import p153l.wbc0;
import p153l.xqf;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 ?2\u00020\u0001:\u0001\"Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J+\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010\u0012J\r\u0010 \u001a\u00020\u000b¢\u0006\u0004\b \u0010\u0012J\u0015\u0010!\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010#R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010#R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u001a\u00100\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00102R\u0014\u00106\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00105R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00105R\u0018\u00108\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00105R\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010:R\u0016\u0010>\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010=¨\u0006@"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPExpandedView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "", "showCloseButton", "hasAction", "showExpandCollapseButton", "showPlayPauseButton", "showMuteButton", "Lkotlin/Function0;", "", "onCollapse", "onClose", "onAction", "<init>", "(Landroid/content/Context;ZZZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "n", "()V", "playing", "p", "(Z)V", "muted", "o", "Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPMediaView;", OMSMercuryType.f39640mv, "Ll/dc60;", "session", "onReady", "j", "(Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPMediaView;Ll/dc60;Lkotlin/jvm/functions/Function0;)V", "k", BLiveStormDanmakuGiftResourceType.f45292l, "m", "a", "Z", "b", "c", Constants.INAPP_DATA_TAG, "e", "f", "Lkotlin/jvm/functions/Function0;", "g", "h", RXScreenCaptureService.KEY_INDEX, "Landroid/widget/FrameLayout;", "getMediaContainer$clevertap_core_release", "()Landroid/widget/FrameLayout;", "mediaContainer", "Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPControlsOverlay;", "Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPControlsOverlay;", "controlsOverlay", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "closeBtn", "playPauseBtn", "muteBtn", "Landroid/widget/LinearLayout;", "Landroid/widget/LinearLayout;", "bottomRow", "Ll/svm;", "Ll/svm;", "currentInsets", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class PIPExpandedView extends FrameLayout {

    @NotNull
    private static final C1292a Companion = new C1292a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean showCloseButton;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean hasAction;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean showExpandCollapseButton;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean showPlayPauseButton;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean showMuteButton;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> onCollapse;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> onClose;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> onAction;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final FrameLayout mediaContainer;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final PIPControlsOverlay controlsOverlay;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final ImageView closeBtn;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private ImageView playPauseBtn;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private ImageView muteBtn;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final LinearLayout bottomRow;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private svm currentInsets;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.pipsdk.internal.view.PIPExpandedView$a */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPExpandedView$a;", "", "<init>", "()V", "", "ICON_SIZE_DP", "I", "CENTER_ICON_SIZE_DP", "ICON_MARGIN_DP", "ROW_MARGIN_DP", "ICON_GAP_DP", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C1292a {
        public /* synthetic */ C1292a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1292a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PIPExpandedView(@NotNull Context context, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function1, @NotNull Function0<Unit> function2) {
        super(context);
        context.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        this.showCloseButton = z;
        this.hasAction = z2;
        this.showExpandCollapseButton = z3;
        this.showPlayPauseButton = z4;
        this.showMuteButton = z5;
        this.onCollapse = function0;
        this.onClose = function1;
        this.onAction = function2;
        svm svmVar = svm.f170856e;
        svmVar.getClass();
        this.currentInsets = svmVar;
        setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        FrameLayout frameLayout = new FrameLayout(context);
        this.mediaContainer = frameLayout;
        kkl0.m150194y0(frameLayout, new il50() { // from class: l.da60
            @Override // p153l.il50
            public final dgq0 onApplyWindowInsets(View view, dgq0 dgq0Var) {
                return PIPExpandedView.m6641e(view, dgq0Var);
            }
        });
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        PIPControlsOverlay pIPControlsOverlay = new PIPControlsOverlay(context);
        this.controlsOverlay = pIPControlsOverlay;
        pIPControlsOverlay.setAlpha(0.0f);
        kkl0.m150194y0(pIPControlsOverlay, new il50() { // from class: l.ea60
            @Override // p153l.il50
            public final dgq0 onApplyWindowInsets(View view, dgq0 dgq0Var) {
                return PIPExpandedView.m6642f(this.f92743a, view, dgq0Var);
            }
        });
        addView(pIPControlsOverlay, new FrameLayout.LayoutParams(-1, -1));
        int iM212731a = xqf.m212731a(48, context);
        int iM212731a2 = xqf.m212731a(48, context);
        int iM212731a3 = xqf.m212731a(8, context);
        int iM212731a4 = xqf.m212731a(12, context);
        int iM212731a5 = xqf.m212731a(12, context);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(wbc0.f188230c);
        imageView.setContentDescription(context.getString(R$string.f4862c));
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageView.setScaleType(scaleType);
        imageView.setVisibility(z ? 0 : 8);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: l.fa60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PIPExpandedView.m6640d(this.f97947a, view);
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
        pIPControlsOverlay.addView(imageView2, new FrameLayout.LayoutParams(iM212731a2, iM212731a2, 17));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        this.bottomRow = linearLayout;
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(wbc0.f188232e);
        imageView3.setContentDescription(context.getString(R$string.f4860a));
        imageView3.setScaleType(scaleType);
        imageView3.setVisibility(z2 ? 0 : 8);
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: l.ga60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PIPExpandedView.m6637a(this.f102961a, view);
            }
        });
        linearLayout.addView(imageView3, new LinearLayout.LayoutParams(iM212731a, iM212731a));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(ma60Var.m157638b(true));
        imageView4.setContentDescription(context.getString(ma60Var.m157637a(true)));
        imageView4.setScaleType(scaleType);
        imageView4.setVisibility(8);
        this.muteBtn = imageView4;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iM212731a, iM212731a);
        layoutParams2.setMarginStart(iM212731a5);
        linearLayout.addView(imageView4, layoutParams2);
        ImageView imageView5 = new ImageView(context);
        imageView5.setImageResource(wbc0.f188231d);
        imageView5.setContentDescription(context.getString(R$string.f4867h));
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(z3 ? 0 : 8);
        imageView5.setOnClickListener(new View.OnClickListener() { // from class: l.ha60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PIPExpandedView.m6644h(this.f108472a, view);
            }
        });
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(iM212731a, iM212731a);
        layoutParams3.setMarginStart(iM212731a5);
        linearLayout.addView(imageView5, layoutParams3);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2, BadgeDrawable.BOTTOM_END);
        layoutParams4.setMargins(iM212731a4, iM212731a4, iM212731a3, iM212731a4);
        pIPControlsOverlay.addView(linearLayout, layoutParams4);
        setOnClickListener(new View.OnClickListener() { // from class: l.ia60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PIPExpandedView.m6643g(this.f113560a, view);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m6637a(PIPExpandedView pIPExpandedView, View view) {
        pIPExpandedView.getClass();
        pIPExpandedView.onAction.invoke();
    }

    /* JADX INFO: renamed from: b */
    public static void m6638b(PIPMediaView pIPMediaView, PIPExpandedView pIPExpandedView, View view) {
        pIPMediaView.getClass();
        pIPExpandedView.getClass();
        pIPMediaView.m6672t();
        pIPExpandedView.m6648p(pIPMediaView.m6666m());
        pIPExpandedView.controlsOverlay.m6635e();
    }

    /* JADX INFO: renamed from: c */
    public static void m6639c(Function0 function0) {
        function0.getClass();
        function0.invoke();
    }

    /* JADX INFO: renamed from: d */
    public static void m6640d(PIPExpandedView pIPExpandedView, View view) {
        pIPExpandedView.getClass();
        pIPExpandedView.onClose.invoke();
    }

    /* JADX INFO: renamed from: e */
    public static dgq0 m6641e(View view, dgq0 dgq0Var) {
        view.getClass();
        dgq0Var.getClass();
        return dgq0.f88335b;
    }

    /* JADX INFO: renamed from: f */
    public static dgq0 m6642f(PIPExpandedView pIPExpandedView, View view, dgq0 dgq0Var) {
        pIPExpandedView.getClass();
        view.getClass();
        dgq0Var.getClass();
        svm svmVarM115680f = dgq0Var.m115680f(dgq0.C16531l.m115737f() | dgq0.C16531l.m115732a());
        svmVarM115680f.getClass();
        if (!Intrinsics.m88377d(svmVarM115680f, pIPExpandedView.currentInsets)) {
            pIPExpandedView.currentInsets = svmVarM115680f;
            pIPExpandedView.m6646n();
        }
        return dgq0.f88335b;
    }

    /* JADX INFO: renamed from: g */
    public static void m6643g(PIPExpandedView pIPExpandedView, View view) {
        pIPExpandedView.getClass();
        PIPControlsOverlay.m6632g(pIPExpandedView.controlsOverlay, false, 1, null);
    }

    /* JADX INFO: renamed from: h */
    public static void m6644h(PIPExpandedView pIPExpandedView, View view) {
        pIPExpandedView.getClass();
        pIPExpandedView.onCollapse.invoke();
    }

    /* JADX INFO: renamed from: i */
    public static void m6645i(PIPMediaView pIPMediaView, PIPExpandedView pIPExpandedView, View view) {
        pIPMediaView.getClass();
        pIPExpandedView.getClass();
        pIPMediaView.m6671s();
        pIPExpandedView.m6647o(pIPMediaView.m6665l());
        pIPExpandedView.controlsOverlay.m6635e();
    }

    /* JADX INFO: renamed from: n */
    private final void m6646n() {
        Context context = getContext();
        context.getClass();
        int iM212731a = xqf.m212731a(8, context);
        Context context2 = getContext();
        context2.getClass();
        int iM212731a2 = xqf.m212731a(12, context2);
        ViewGroup.LayoutParams layoutParams = this.closeBtn.getLayoutParams();
        layoutParams.getClass();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        svm svmVar = this.currentInsets;
        layoutParams2.topMargin = svmVar.f170858b + iM212731a;
        layoutParams2.rightMargin = svmVar.f170859c + iM212731a;
        layoutParams2.leftMargin = iM212731a;
        layoutParams2.bottomMargin = iM212731a;
        this.closeBtn.requestLayout();
        ViewGroup.LayoutParams layoutParams3 = this.bottomRow.getLayoutParams();
        layoutParams3.getClass();
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        svm svmVar2 = this.currentInsets;
        layoutParams4.bottomMargin = svmVar2.f170860d + iM212731a2;
        layoutParams4.rightMargin = svmVar2.f170859c + iM212731a;
        layoutParams4.topMargin = iM212731a2;
        layoutParams4.leftMargin = iM212731a2;
        this.bottomRow.requestLayout();
    }

    /* JADX INFO: renamed from: o */
    private final void m6647o(boolean muted) {
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

    /* JADX INFO: renamed from: p */
    private final void m6648p(boolean playing) {
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
    /* JADX INFO: renamed from: getMediaContainer$clevertap_core_release, reason: from getter */
    public final FrameLayout getMediaContainer() {
        return this.mediaContainer;
    }

    /* JADX INFO: renamed from: j */
    public final void m6649j(@NotNull final PIPMediaView mv, @NotNull dc60 session, @NotNull final Function0<Unit> onReady) {
        mv.getClass();
        session.getClass();
        onReady.getClass();
        this.mediaContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.mediaContainer.removeAllViews();
        this.mediaContainer.addView(mv, new FrameLayout.LayoutParams(-1, -1));
        boolean zM6667n = mv.m6667n();
        ImageView imageView = this.playPauseBtn;
        int i = 8;
        if (imageView != null) {
            imageView.setVisibility((zM6667n && this.showPlayPauseButton) ? 0 : 8);
        }
        ImageView imageView2 = this.muteBtn;
        if (imageView2 != null) {
            if (zM6667n && this.showMuteButton) {
                i = 0;
            }
            imageView2.setVisibility(i);
        }
        if (zM6667n) {
            m6648p(mv.m6666m());
            m6647o(mv.m6665l());
            ImageView imageView3 = this.playPauseBtn;
            if (imageView3 != null) {
                imageView3.setOnClickListener(new View.OnClickListener() { // from class: l.ja60
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PIPExpandedView.m6638b(mv, this, view);
                    }
                });
            }
            ImageView imageView4 = this.muteBtn;
            if (imageView4 != null) {
                imageView4.setOnClickListener(new View.OnClickListener() { // from class: l.ka60
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PIPExpandedView.m6645i(mv, this, view);
                    }
                });
            }
        }
        post(new Runnable() { // from class: l.la60
            @Override // java.lang.Runnable
            public final void run() {
                PIPExpandedView.m6639c(onReady);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m6650k() {
        this.controlsOverlay.m6633c();
    }

    /* JADX INFO: renamed from: l */
    public final void m6651l() {
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

    /* JADX INFO: renamed from: m */
    public final void m6652m(boolean playing) {
        m6648p(playing);
    }
}
