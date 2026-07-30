package com.clevertap.android.sdk.inapp.pipsdk.internal.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import com.clevertap.android.sdk.inapp.pipsdk.C1265a;
import com.clevertap.android.sdk.inapp.pipsdk.PIPMediaType;
import com.clevertap.android.sdk.inapp.pipsdk.internal.view.PIPMediaView;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.a460;
import p149l.clj;
import p149l.frc0;
import p149l.gim;
import p149l.h160;
import p149l.hal0;
import p149l.l9r;
import p149l.lux;
import p149l.w3g;
import p149l.x3g;
import p149l.y360;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 M2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\"\u0010 J\u000f\u0010#\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b#\u0010 R\u0018\u0010&\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R*\u00103\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R*\u00107\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010.\u001a\u0004\b5\u00100\"\u0004\b6\u00102R*\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010.\u001a\u0004\b9\u00100\"\u0004\b:\u00102R?\u0010F\u001a\u001f\u0012\u0013\u0012\u00110\f¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(?\u0012\u0004\u0012\u00020\u0011\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0011\u0010I\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0011\u0010?\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bJ\u0010HR\u0011\u0010L\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bK\u0010H¨\u0006N"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPMediaView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ll/y360;", "session", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "resourceProvider", "Ljava/util/concurrent/ExecutorService;", "mediaExecutor", "", "r", "(Ll/y360;Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;Ljava/util/concurrent/ExecutorService;)Z", "Ll/a460;", "wrapper", "", RXScreenCaptureService.KEY_INDEX, "(Ll/a460;)V", "Lcom/clevertap/android/sdk/inapp/pipsdk/PIPMediaType;", "mediaType", "Ll/lux;", "j", "(Lcom/clevertap/android/sdk/inapp/pipsdk/PIPMediaType;Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;Ljava/util/concurrent/ExecutorService;Ll/y360;)Ll/lux;", "Lcom/clevertap/android/sdk/inapp/pipsdk/a;", Constants.KEY_CONFIG, "k", "(Lcom/clevertap/android/sdk/inapp/pipsdk/a;Ll/y360;Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;Ljava/util/concurrent/ExecutorService;)V", "p", "(Ll/y360;Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;Ljava/util/concurrent/ExecutorService;)V", "q", "()Lkotlin/Unit;", "o", Constants.KEY_T, BLiveStormDanmakuGiftResourceType.f44446s, "a", "Ll/lux;", "renderer", "b", "Ll/y360;", "c", "Z", "fellBackToImage", "Lkotlin/Function0;", Constants.INAPP_DATA_TAG, "Lkotlin/jvm/functions/Function0;", "getOnVideoFallback", "()Lkotlin/jvm/functions/Function0;", "setOnVideoFallback", "(Lkotlin/jvm/functions/Function0;)V", "onVideoFallback", "e", "getOnMediaReady", "setOnMediaReady", "onMediaReady", "f", "getOnAllMediaFailed", "setOnAllMediaFailed", "onAllMediaFailed", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "isPlaying", "g", "Lkotlin/jvm/functions/Function1;", "getOnPlayStateChanged", "()Lkotlin/jvm/functions/Function1;", "setOnPlayStateChanged", "(Lkotlin/jvm/functions/Function1;)V", "onPlayStateChanged", "n", "()Z", "isVideoType", "m", BLiveStormDanmakuGiftResourceType.f44444l, "isMuted", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class PIPMediaView extends FrameLayout {

    @NotNull
    private static final C1270a Companion = new C1270a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private lux renderer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private y360 session;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean fellBackToImage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> onVideoFallback;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> onMediaReady;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> onAllMediaFailed;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Boolean, Unit> onPlayStateChanged;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.pipsdk.internal.view.PIPMediaView$a */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPMediaView$a;", "", "<init>", "()V", "", "SCRIM_SAFETY_TIMEOUT_MS", "J", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class C1270a {
        public /* synthetic */ C1270a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1270a() {
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.pipsdk.internal.view.PIPMediaView$b */
    @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
    public /* synthetic */ class C1271b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5236a;

        static {
            int[] iArr = new int[PIPMediaType.values().length];
            try {
                iArr[PIPMediaType.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PIPMediaType.GIF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PIPMediaType.VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f5236a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.pipsdk.internal.view.PIPMediaView$c */
    @Metadata(m87231d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, m87232d2 = {"com/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPMediaView$c", "Ll/frc0;", "Ll/a460;", "wrapper", "", "a", "(Ll/a460;)V", Constants.INAPP_DATA_TAG, "()V", "", "isPlaying", "isMuted", "", "positionMs", "e", "(ZZJ)V", "c", "(Z)V", "b", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class C1272c implements frc0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ y360 f5237a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ PIPMediaView f5238b;

        public C1272c(y360 y360Var, PIPMediaView pIPMediaView) {
            this.f5237a = y360Var;
            this.f5238b = pIPMediaView;
        }

        @Override // p149l.frc0
        /* JADX INFO: renamed from: a */
        public void mo6619a(a460 wrapper) {
            wrapper.getClass();
            this.f5237a.m212795v(wrapper);
        }

        @Override // p149l.frc0
        /* JADX INFO: renamed from: b */
        public void mo6620b(boolean isMuted) {
            this.f5237a.m212790q(isMuted);
        }

        @Override // p149l.frc0
        /* JADX INFO: renamed from: c */
        public void mo6621c(boolean isPlaying) {
            this.f5237a.m212794u(isPlaying);
            y360 y360Var = this.f5237a;
            if (isPlaying) {
                h160 callbacks = y360Var.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getCallbacks();
                if (callbacks != null) {
                    callbacks.mo6318g();
                }
            } else {
                h160 callbacks2 = y360Var.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getCallbacks();
                if (callbacks2 != null) {
                    callbacks2.mo6313b();
                }
            }
            Function1<Boolean, Unit> onPlayStateChanged = this.f5238b.getOnPlayStateChanged();
            if (onPlayStateChanged != null) {
                onPlayStateChanged.invoke(Boolean.valueOf(isPlaying));
            }
        }

        @Override // p149l.frc0
        /* JADX INFO: renamed from: d */
        public void mo6622d() {
            this.f5237a.m212795v(null);
        }

        @Override // p149l.frc0
        /* JADX INFO: renamed from: e */
        public void mo6623e(boolean isPlaying, boolean isMuted, long positionMs) {
            this.f5237a.m212794u(isPlaying);
            this.f5237a.m212790q(isMuted);
            this.f5237a.m212793t(positionMs);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PIPMediaView(@NotNull Context context) {
        super(context);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public static void m6599a(PIPMediaView pIPMediaView, View view) {
        pIPMediaView.getClass();
        view.getClass();
        pIPMediaView.removeView(view);
    }

    /* JADX INFO: renamed from: b */
    public static Unit m6600b(PIPMediaView pIPMediaView) {
        pIPMediaView.getClass();
        Function0<Unit> function0 = pIPMediaView.onMediaReady;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static Unit m6601c(PIPMediaView pIPMediaView) {
        pIPMediaView.getClass();
        Function0<Unit> function0 = pIPMediaView.onMediaReady;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static Unit m6602d(PIPMediaView pIPMediaView) {
        pIPMediaView.getClass();
        Function0<Unit> function0 = pIPMediaView.onAllMediaFailed;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static Unit m6603e(PIPMediaView pIPMediaView, Runnable runnable) {
        pIPMediaView.getClass();
        runnable.getClass();
        pIPMediaView.removeCallbacks(runnable);
        runnable.run();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static Unit m6604f(PIPMediaView pIPMediaView) {
        pIPMediaView.getClass();
        pIPMediaView.fellBackToImage = true;
        Function0<Unit> function0 = pIPMediaView.onVideoFallback;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static Unit m6605g(PIPMediaView pIPMediaView) {
        pIPMediaView.getClass();
        Function0<Unit> function0 = pIPMediaView.onAllMediaFailed;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m6606h() {
        return false;
    }

    /* JADX INFO: renamed from: i */
    private final void m6607i(a460 wrapper) {
        if (wrapper == null) {
            return;
        }
        final View view = new View(getContext());
        view.setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        addView(view, new FrameLayout.LayoutParams(-1, -1));
        final Runnable runnable = new Runnable() { // from class: l.d360
            @Override // java.lang.Runnable
            public final void run() {
                PIPMediaView.m6599a(this.f83466a, view);
            }
        };
        wrapper.m94818h(new Function0() { // from class: l.e360
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPMediaView.m6603e(this.f88992a, runnable);
            }
        });
        postDelayed(runnable, 3000L);
    }

    /* JADX INFO: renamed from: j */
    private final lux m6608j(PIPMediaType mediaType, FileResourceProvider resourceProvider, ExecutorService mediaExecutor, y360 session) {
        lux gimVar;
        int i = C1271b.f5236a[mediaType.ordinal()];
        if (i == 1) {
            gimVar = new gim(resourceProvider, mediaExecutor);
        } else if (i == 2) {
            gimVar = new clj(resourceProvider, mediaExecutor);
        } else {
            if (i != 3) {
                l9r.m149037a();
                return null;
            }
            hal0 hal0Var = new hal0(resourceProvider, mediaExecutor);
            hal0Var.m130150u(new Function0() { // from class: l.x260
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PIPMediaView.m6604f(this.f189131a);
                }
            });
            hal0Var.m130151v(new C1272c(session, this));
            gimVar = hal0Var;
        }
        gimVar.mo107486d(new Function0() { // from class: l.y260
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPMediaView.m6600b(this.f195495a);
            }
        });
        gimVar.mo107487e(new Function0() { // from class: l.z260
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPMediaView.m6602d(this.f201161a);
            }
        });
        return gimVar;
    }

    /* JADX INFO: renamed from: r */
    private final boolean m6609r(y360 session, FileResourceProvider resourceProvider, ExecutorService mediaExecutor) {
        if (session.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getMediaType() != PIPMediaType.VIDEO || session.getVideoPlayerWrapper() != null) {
            return false;
        }
        w3g.INSTANCE.m201315d(new x3g(this, session.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getFallbackUrl(), session.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getMediaUrl(), resourceProvider, mediaExecutor, new Function0() { // from class: l.a360
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(PIPMediaView.m6606h());
            }
        }, session.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getCallbacks(), "Fallback reload after rotation", null, new Function0() { // from class: l.b360
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPMediaView.m6601c(this.f72807a);
            }
        }, new Function0() { // from class: l.c360
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPMediaView.m6605g(this.f78438a);
            }
        }, 256, null));
        return true;
    }

    @Nullable
    public final Function0<Unit> getOnAllMediaFailed() {
        return this.onAllMediaFailed;
    }

    @Nullable
    public final Function0<Unit> getOnMediaReady() {
        return this.onMediaReady;
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnPlayStateChanged() {
        return this.onPlayStateChanged;
    }

    @Nullable
    public final Function0<Unit> getOnVideoFallback() {
        return this.onVideoFallback;
    }

    /* JADX INFO: renamed from: k */
    public final void m6610k(@NotNull C1265a config, @NotNull y360 session, @NotNull FileResourceProvider resourceProvider, @NotNull ExecutorService mediaExecutor) {
        config.getClass();
        session.getClass();
        resourceProvider.getClass();
        mediaExecutor.getClass();
        removeAllViews();
        this.session = session;
        this.fellBackToImage = false;
        lux luxVarM6608j = m6608j(config.getMediaType(), resourceProvider, mediaExecutor, session);
        this.renderer = luxVarM6608j;
        if (luxVarM6608j != null) {
            luxVarM6608j.mo107489g(this, config, session);
        }
        if (StringsKt.m93438e0(config.getMediaContentDescription())) {
            return;
        }
        setContentDescription(config.getMediaContentDescription());
    }

    /* JADX INFO: renamed from: l */
    public final boolean m6611l() {
        lux luxVar = this.renderer;
        if (luxVar != null) {
            return luxVar.get_isMuted();
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m6612m() {
        lux luxVar = this.renderer;
        if (luxVar != null) {
            return luxVar.getIsPlaying();
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m6613n() {
        return (this.renderer instanceof hal0) && !this.fellBackToImage;
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final Unit m6614o() {
        lux luxVar = this.renderer;
        if (luxVar == null) {
            return null;
        }
        luxVar.mo107490h();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public final void m6615p(@NotNull y360 session, @NotNull FileResourceProvider resourceProvider, @NotNull ExecutorService mediaExecutor) {
        session.getClass();
        resourceProvider.getClass();
        mediaExecutor.getClass();
        removeAllViews();
        this.session = session;
        if (m6609r(session, resourceProvider, mediaExecutor)) {
            return;
        }
        if (this.renderer == null) {
            this.renderer = m6608j(session.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getMediaType(), resourceProvider, mediaExecutor, session);
        }
        lux luxVar = this.renderer;
        if (luxVar != null) {
            luxVar.mo107483a(this, session);
        }
        m6607i(session.getVideoPlayerWrapper());
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public final Unit m6616q() {
        lux luxVar = this.renderer;
        if (luxVar == null) {
            return null;
        }
        luxVar.release();
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public final Unit m6617s() {
        lux luxVar = this.renderer;
        if (luxVar == null) {
            return null;
        }
        luxVar.mo107485c();
        return Unit.INSTANCE;
    }

    public final void setOnAllMediaFailed(@Nullable Function0<Unit> function0) {
        this.onAllMediaFailed = function0;
    }

    public final void setOnMediaReady(@Nullable Function0<Unit> function0) {
        this.onMediaReady = function0;
    }

    public final void setOnPlayStateChanged(@Nullable Function1<? super Boolean, Unit> function1) {
        this.onPlayStateChanged = function1;
    }

    public final void setOnVideoFallback(@Nullable Function0<Unit> function0) {
        this.onVideoFallback = function0;
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public final Unit m6618t() {
        lux luxVar = this.renderer;
        if (luxVar == null) {
            return null;
        }
        luxVar.mo107488f();
        return Unit.INSTANCE;
    }
}
