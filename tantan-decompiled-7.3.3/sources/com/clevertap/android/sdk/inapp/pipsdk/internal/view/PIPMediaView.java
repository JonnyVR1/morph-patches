package com.clevertap.android.sdk.inapp.pipsdk.internal.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import com.clevertap.android.sdk.inapp.pipsdk.C1288a;
import com.clevertap.android.sdk.inapp.pipsdk.PIPMediaType;
import com.clevertap.android.sdk.inapp.pipsdk.internal.view.PIPMediaView;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p153l.dc60;
import p153l.fc60;
import p153l.i3y;
import p153l.jkm;
import p153l.k5g;
import p153l.kzc0;
import p153l.l5g;
import p153l.ljl0;
import p153l.m960;
import p153l.nbr;
import p153l.snj;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 M2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\"\u0010 J\u000f\u0010#\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b#\u0010 R\u0018\u0010&\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R*\u00103\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R*\u00107\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010.\u001a\u0004\b5\u00100\"\u0004\b6\u00102R*\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010.\u001a\u0004\b9\u00100\"\u0004\b:\u00102R?\u0010F\u001a\u001f\u0012\u0013\u0012\u00110\f¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(?\u0012\u0004\u0012\u00020\u0011\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0011\u0010I\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0011\u0010?\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bJ\u0010HR\u0011\u0010L\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bK\u0010H¨\u0006N"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPMediaView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ll/dc60;", "session", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "resourceProvider", "Ljava/util/concurrent/ExecutorService;", "mediaExecutor", "", "r", "(Ll/dc60;Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;Ljava/util/concurrent/ExecutorService;)Z", "Ll/fc60;", "wrapper", "", RXScreenCaptureService.KEY_INDEX, "(Ll/fc60;)V", "Lcom/clevertap/android/sdk/inapp/pipsdk/PIPMediaType;", "mediaType", "Ll/i3y;", "j", "(Lcom/clevertap/android/sdk/inapp/pipsdk/PIPMediaType;Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;Ljava/util/concurrent/ExecutorService;Ll/dc60;)Ll/i3y;", "Lcom/clevertap/android/sdk/inapp/pipsdk/a;", Constants.KEY_CONFIG, "k", "(Lcom/clevertap/android/sdk/inapp/pipsdk/a;Ll/dc60;Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;Ljava/util/concurrent/ExecutorService;)V", "p", "(Ll/dc60;Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;Ljava/util/concurrent/ExecutorService;)V", "q", "()Lkotlin/Unit;", "o", Constants.KEY_T, BLiveStormDanmakuGiftResourceType.f45294s, "a", "Ll/i3y;", "renderer", "b", "Ll/dc60;", "c", "Z", "fellBackToImage", "Lkotlin/Function0;", Constants.INAPP_DATA_TAG, "Lkotlin/jvm/functions/Function0;", "getOnVideoFallback", "()Lkotlin/jvm/functions/Function0;", "setOnVideoFallback", "(Lkotlin/jvm/functions/Function0;)V", "onVideoFallback", "e", "getOnMediaReady", "setOnMediaReady", "onMediaReady", "f", "getOnAllMediaFailed", "setOnAllMediaFailed", "onAllMediaFailed", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "isPlaying", "g", "Lkotlin/jvm/functions/Function1;", "getOnPlayStateChanged", "()Lkotlin/jvm/functions/Function1;", "setOnPlayStateChanged", "(Lkotlin/jvm/functions/Function1;)V", "onPlayStateChanged", "n", "()Z", "isVideoType", "m", BLiveStormDanmakuGiftResourceType.f45292l, "isMuted", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class PIPMediaView extends FrameLayout {

    @NotNull
    private static final C1293a Companion = new C1293a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private i3y renderer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private dc60 session;

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
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPMediaView$a;", "", "<init>", "()V", "", "SCRIM_SAFETY_TIMEOUT_MS", "J", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C1293a {
        public /* synthetic */ C1293a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1293a() {
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.pipsdk.internal.view.PIPMediaView$b */
    @Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
    public /* synthetic */ class C1294b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5273a;

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
            f5273a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.pipsdk.internal.view.PIPMediaView$c */
    @Metadata(m88120d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, m88121d2 = {"com/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPMediaView$c", "Ll/kzc0;", "Ll/fc60;", "wrapper", "", "a", "(Ll/fc60;)V", Constants.INAPP_DATA_TAG, "()V", "", "isPlaying", "isMuted", "", "positionMs", "e", "(ZZJ)V", "c", "(Z)V", "b", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C1295c implements kzc0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ dc60 f5274a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ PIPMediaView f5275b;

        public C1295c(dc60 dc60Var, PIPMediaView pIPMediaView) {
            this.f5274a = dc60Var;
            this.f5275b = pIPMediaView;
        }

        @Override // p153l.kzc0
        /* JADX INFO: renamed from: a */
        public void mo6673a(fc60 wrapper) {
            wrapper.getClass();
            this.f5274a.m115238v(wrapper);
        }

        @Override // p153l.kzc0
        /* JADX INFO: renamed from: b */
        public void mo6674b(boolean isMuted) {
            this.f5274a.m115233q(isMuted);
        }

        @Override // p153l.kzc0
        /* JADX INFO: renamed from: c */
        public void mo6675c(boolean isPlaying) {
            this.f5274a.m115237u(isPlaying);
            dc60 dc60Var = this.f5274a;
            if (isPlaying) {
                m960 callbacks = dc60Var.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getCallbacks();
                if (callbacks != null) {
                    callbacks.mo6372g();
                }
            } else {
                m960 callbacks2 = dc60Var.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getCallbacks();
                if (callbacks2 != null) {
                    callbacks2.mo6367b();
                }
            }
            Function1<Boolean, Unit> onPlayStateChanged = this.f5275b.getOnPlayStateChanged();
            if (onPlayStateChanged != null) {
                onPlayStateChanged.invoke(Boolean.valueOf(isPlaying));
            }
        }

        @Override // p153l.kzc0
        /* JADX INFO: renamed from: d */
        public void mo6676d() {
            this.f5274a.m115238v(null);
        }

        @Override // p153l.kzc0
        /* JADX INFO: renamed from: e */
        public void mo6677e(boolean isPlaying, boolean isMuted, long positionMs) {
            this.f5274a.m115237u(isPlaying);
            this.f5274a.m115233q(isMuted);
            this.f5274a.m115236t(positionMs);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PIPMediaView(@NotNull Context context) {
        super(context);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public static void m6653a(PIPMediaView pIPMediaView, View view) {
        pIPMediaView.getClass();
        view.getClass();
        pIPMediaView.removeView(view);
    }

    /* JADX INFO: renamed from: b */
    public static Unit m6654b(PIPMediaView pIPMediaView) {
        pIPMediaView.getClass();
        Function0<Unit> function0 = pIPMediaView.onMediaReady;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static Unit m6655c(PIPMediaView pIPMediaView) {
        pIPMediaView.getClass();
        Function0<Unit> function0 = pIPMediaView.onMediaReady;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static Unit m6656d(PIPMediaView pIPMediaView) {
        pIPMediaView.getClass();
        Function0<Unit> function0 = pIPMediaView.onAllMediaFailed;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static Unit m6657e(PIPMediaView pIPMediaView, Runnable runnable) {
        pIPMediaView.getClass();
        runnable.getClass();
        pIPMediaView.removeCallbacks(runnable);
        runnable.run();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static Unit m6658f(PIPMediaView pIPMediaView) {
        pIPMediaView.getClass();
        pIPMediaView.fellBackToImage = true;
        Function0<Unit> function0 = pIPMediaView.onVideoFallback;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static Unit m6659g(PIPMediaView pIPMediaView) {
        pIPMediaView.getClass();
        Function0<Unit> function0 = pIPMediaView.onAllMediaFailed;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m6660h() {
        return false;
    }

    /* JADX INFO: renamed from: i */
    private final void m6661i(fc60 wrapper) {
        if (wrapper == null) {
            return;
        }
        final View view = new View(getContext());
        view.setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        addView(view, new FrameLayout.LayoutParams(-1, -1));
        final Runnable runnable = new Runnable() { // from class: l.ib60
            @Override // java.lang.Runnable
            public final void run() {
                PIPMediaView.m6653a(this.f113724a, view);
            }
        };
        wrapper.m124995h(new Function0() { // from class: l.jb60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPMediaView.m6657e(this.f119130a, runnable);
            }
        });
        postDelayed(runnable, 3000L);
    }

    /* JADX INFO: renamed from: j */
    private final i3y m6662j(PIPMediaType mediaType, FileResourceProvider resourceProvider, ExecutorService mediaExecutor, dc60 session) {
        i3y jkmVar;
        int i = C1294b.f5273a[mediaType.ordinal()];
        if (i == 1) {
            jkmVar = new jkm(resourceProvider, mediaExecutor);
        } else if (i == 2) {
            jkmVar = new snj(resourceProvider, mediaExecutor);
        } else {
            if (i != 3) {
                nbr.m162172a();
                return null;
            }
            ljl0 ljl0Var = new ljl0(resourceProvider, mediaExecutor);
            ljl0Var.m154526u(new Function0() { // from class: l.cb60
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PIPMediaView.m6658f(this.f80706a);
                }
            });
            ljl0Var.m154527v(new C1295c(session, this));
            jkmVar = ljl0Var;
        }
        jkmVar.mo138355d(new Function0() { // from class: l.db60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPMediaView.m6654b(this.f85967a);
            }
        });
        jkmVar.mo138356e(new Function0() { // from class: l.eb60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPMediaView.m6656d(this.f92833a);
            }
        });
        return jkmVar;
    }

    /* JADX INFO: renamed from: r */
    private final boolean m6663r(dc60 session, FileResourceProvider resourceProvider, ExecutorService mediaExecutor) {
        if (session.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getMediaType() != PIPMediaType.VIDEO || session.getVideoPlayerWrapper() != null) {
            return false;
        }
        k5g.INSTANCE.m148362d(new l5g(this, session.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getFallbackUrl(), session.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getMediaUrl(), resourceProvider, mediaExecutor, new Function0() { // from class: l.fb60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(PIPMediaView.m6660h());
            }
        }, session.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getCallbacks(), "Fallback reload after rotation", null, new Function0() { // from class: l.gb60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPMediaView.m6655c(this.f103057a);
            }
        }, new Function0() { // from class: l.hb60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PIPMediaView.m6659g(this.f108569a);
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
    public final void m6664k(@NotNull C1288a config, @NotNull dc60 session, @NotNull FileResourceProvider resourceProvider, @NotNull ExecutorService mediaExecutor) {
        config.getClass();
        session.getClass();
        resourceProvider.getClass();
        mediaExecutor.getClass();
        removeAllViews();
        this.session = session;
        this.fellBackToImage = false;
        i3y i3yVarM6662j = m6662j(config.getMediaType(), resourceProvider, mediaExecutor, session);
        this.renderer = i3yVarM6662j;
        if (i3yVarM6662j != null) {
            i3yVarM6662j.mo138358g(this, config, session);
        }
        if (StringsKt.m94329e0(config.getMediaContentDescription())) {
            return;
        }
        setContentDescription(config.getMediaContentDescription());
    }

    /* JADX INFO: renamed from: l */
    public final boolean m6665l() {
        i3y i3yVar = this.renderer;
        if (i3yVar != null) {
            return i3yVar.getIsMuted();
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m6666m() {
        i3y i3yVar = this.renderer;
        if (i3yVar != null) {
            return i3yVar.getIsPlaying();
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m6667n() {
        return (this.renderer instanceof ljl0) && !this.fellBackToImage;
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final Unit m6668o() {
        i3y i3yVar = this.renderer;
        if (i3yVar == null) {
            return null;
        }
        i3yVar.mo138359h();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public final void m6669p(@NotNull dc60 session, @NotNull FileResourceProvider resourceProvider, @NotNull ExecutorService mediaExecutor) {
        session.getClass();
        resourceProvider.getClass();
        mediaExecutor.getClass();
        removeAllViews();
        this.session = session;
        if (m6663r(session, resourceProvider, mediaExecutor)) {
            return;
        }
        if (this.renderer == null) {
            this.renderer = m6662j(session.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getMediaType(), resourceProvider, mediaExecutor, session);
        }
        i3y i3yVar = this.renderer;
        if (i3yVar != null) {
            i3yVar.mo138352a(this, session);
        }
        m6661i(session.getVideoPlayerWrapper());
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public final Unit m6670q() {
        i3y i3yVar = this.renderer;
        if (i3yVar == null) {
            return null;
        }
        i3yVar.release();
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public final Unit m6671s() {
        i3y i3yVar = this.renderer;
        if (i3yVar == null) {
            return null;
        }
        i3yVar.mo138354c();
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
    public final Unit m6672t() {
        i3y i3yVar = this.renderer;
        if (i3yVar == null) {
            return null;
        }
        i3yVar.mo138357f();
        return Unit.INSTANCE;
    }
}
