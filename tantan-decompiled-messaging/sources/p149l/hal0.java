package p149l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.media3.common.PlaybackException;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import com.clevertap.android.sdk.inapp.pipsdk.C1265a;
import com.clevertap.android.sdk.video.VideoLibraryIntegrated;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010&R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010-R*\u00106\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010>\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R*\u0010A\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u0001008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b?\u00101\u001a\u0004\b@\u00103\"\u0004\b)\u00105R*\u0010D\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u0001008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bB\u00101\u001a\u0004\bC\u00103\"\u0004\b,\u00105R\u0016\u0010F\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010-R\u0014\u0010H\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010GR\u0014\u0010I\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010G¨\u0006J"}, m87232d2 = {"Ll/hal0;", "Ll/lux;", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "resourceProvider", "Ljava/util/concurrent/ExecutorService;", "mediaExecutor", "<init>", "(Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;Ljava/util/concurrent/ExecutorService;)V", "Landroid/view/ViewGroup;", "container", "Lcom/clevertap/android/sdk/inapp/pipsdk/a;", Constants.KEY_CONFIG, "", "w", "(Landroid/view/ViewGroup;Lcom/clevertap/android/sdk/inapp/pipsdk/a;)V", "Landroidx/media3/common/PlaybackException;", "error", "", BLiveStormDanmakuGiftResourceType.f44446s, "(Landroidx/media3/common/PlaybackException;)Z", "", "errorMsg", Constants.KEY_T, "(Landroid/view/ViewGroup;Lcom/clevertap/android/sdk/inapp/pipsdk/a;Ljava/lang/String;)V", "Ll/y360;", "session", "g", "(Landroid/view/ViewGroup;Lcom/clevertap/android/sdk/inapp/pipsdk/a;Ll/y360;)V", "a", "(Landroid/view/ViewGroup;Ll/y360;)V", "release", "()V", "f", "c", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "b", "Ljava/util/concurrent/ExecutorService;", "Ll/a460;", "Ll/a460;", "wrapper", "Ljava/lang/ref/WeakReference;", Constants.INAPP_DATA_TAG, "Ljava/lang/ref/WeakReference;", "containerRef", "e", "Z", "_isMuted", "_isPlaying", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "getOnFallbackToImage", "()Lkotlin/jvm/functions/Function0;", "u", "(Lkotlin/jvm/functions/Function0;)V", "onFallbackToImage", "Ll/frc0;", "h", "Ll/frc0;", "getStateListener", "()Ll/frc0;", ResourceDirection.f38808v, "(Ll/frc0;)V", "stateListener", RXScreenCaptureService.KEY_INDEX, "r", "onMediaReady", "j", "q", "onAllMediaFailed", "k", "released", "()Z", "isMuted", "isPlaying", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class hal0 implements lux {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final FileResourceProvider resourceProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ExecutorService mediaExecutor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private a460 wrapper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private WeakReference<ViewGroup> containerRef;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean _isMuted;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean _isPlaying;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> onFallbackToImage;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private frc0 stateListener;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> onMediaReady;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> onAllMediaFailed;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private volatile boolean released;

    public hal0(@NotNull FileResourceProvider fileResourceProvider, @NotNull ExecutorService executorService) {
        fileResourceProvider.getClass();
        executorService.getClass();
        this.resourceProvider = fileResourceProvider;
        this.mediaExecutor = executorService;
        this._isMuted = true;
        this._isPlaying = true;
    }

    /* JADX INFO: renamed from: i */
    public static Unit m130136i(final ViewGroup viewGroup, final hal0 hal0Var, final C1265a c1265a, final PlaybackException playbackException) {
        viewGroup.getClass();
        hal0Var.getClass();
        c1265a.getClass();
        playbackException.getClass();
        viewGroup.post(new Runnable() { // from class: l.gal0
            @Override // java.lang.Runnable
            public final void run() {
                hal0.m130147x(this.f101678a, playbackException, viewGroup, c1265a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static Unit m130137j(a460 a460Var, hal0 hal0Var) {
        a460Var.getClass();
        hal0Var.getClass();
        a460Var.m94813c();
        Function0<Unit> function0M130149r = hal0Var.m130149r();
        if (function0M130149r != null) {
            function0M130149r.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static Unit m130138k(hal0 hal0Var) {
        hal0Var.getClass();
        Function0<Unit> function0M130148q = hal0Var.m130148q();
        if (function0M130148q != null) {
            function0M130148q.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m130140m(hal0 hal0Var) {
        hal0Var.getClass();
        return hal0Var.released;
    }

    /* JADX INFO: renamed from: n */
    public static Unit m130141n(hal0 hal0Var, boolean z) {
        hal0Var.getClass();
        hal0Var._isPlaying = z;
        frc0 frc0Var = hal0Var.stateListener;
        if (frc0Var != null) {
            frc0Var.mo6621c(z);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static Unit m130142o(hal0 hal0Var, boolean z) {
        hal0Var.getClass();
        hal0Var._isPlaying = z;
        frc0 frc0Var = hal0Var.stateListener;
        if (frc0Var != null) {
            frc0Var.mo6621c(z);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static Unit m130143p(hal0 hal0Var) {
        hal0Var.getClass();
        Function0<Unit> function0M130149r = hal0Var.m130149r();
        if (function0M130149r != null) {
            function0M130149r.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    private final boolean m130144s(PlaybackException error) {
        error.getCause();
        return false;
    }

    /* JADX INFO: renamed from: t */
    private final void m130145t(ViewGroup container, C1265a config, String errorMsg) {
        container.removeAllViews();
        a460 a460Var = this.wrapper;
        if (a460Var != null) {
            a460Var.m94821m();
        }
        this.wrapper = null;
        frc0 frc0Var = this.stateListener;
        if (frc0Var != null) {
            frc0Var.mo6622d();
        }
        Function0<Unit> function0 = this.onFallbackToImage;
        if (function0 != null) {
            function0.invoke();
        }
        w3g.INSTANCE.m201315d(new x3g(container, config.getFallbackUrl(), config.getMediaUrl(), this.resourceProvider, this.mediaExecutor, new Function0() { // from class: l.cal0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(hal0.m130140m(this.f80038a));
            }
        }, config.getCallbacks(), errorMsg, null, new Function0() { // from class: l.dal0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return hal0.m130143p(this.f85240a);
            }
        }, new Function0() { // from class: l.eal0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return hal0.m130138k(this.f90213a);
            }
        }, 256, null));
    }

    /* JADX INFO: renamed from: w */
    private final void m130146w(final ViewGroup container, final C1265a config) {
        a460 a460Var = this.wrapper;
        if (a460Var != null) {
            a460Var.m94823o(new Function1() { // from class: l.fal0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return hal0.m130136i(container, this, config, (PlaybackException) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final void m130147x(hal0 hal0Var, PlaybackException playbackException, ViewGroup viewGroup, C1265a c1265a) {
        a460 a460Var;
        hal0Var.getClass();
        playbackException.getClass();
        viewGroup.getClass();
        c1265a.getClass();
        if (hal0Var.m130144s(playbackException) && (a460Var = hal0Var.wrapper) != null && a460Var.getNetworkRetryEnabled()) {
            a460 a460Var2 = hal0Var.wrapper;
            if (a460Var2 != null) {
                a460Var2.m94822n();
                return;
            }
            return;
        }
        String message = playbackException.getMessage();
        if (message == null) {
            message = "Video playback error";
        }
        hal0Var.m130145t(viewGroup, c1265a, message);
    }

    @Override // p149l.lux
    /* JADX INFO: renamed from: a */
    public void mo107483a(@NotNull ViewGroup container, @NotNull y360 session) {
        container.getClass();
        session.getClass();
        this.containerRef = new WeakReference<>(container);
        a460 videoPlayerWrapper = session.getVideoPlayerWrapper();
        if (videoPlayerWrapper == null) {
            return;
        }
        this.wrapper = videoPlayerWrapper;
        Context context = container.getContext();
        context.getClass();
        View viewM94820j = videoPlayerWrapper.m94820j(context);
        if (viewM94820j == null) {
            return;
        }
        container.addView(viewM94820j, new ViewGroup.LayoutParams(-1, -1));
        this._isMuted = session.getIsMuted();
        this._isPlaying = session.getIsPlaying();
        videoPlayerWrapper.m94825q(new Function1() { // from class: l.bal0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return hal0.m130141n(this.f74702a, ((Boolean) obj).booleanValue());
            }
        });
        m130146w(container, session.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String());
        Function0<Unit> function0M130149r = m130149r();
        if (function0M130149r != null) {
            function0M130149r.invoke();
        }
    }

    @Override // p149l.lux
    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean get_isMuted() {
        return this._isMuted;
    }

    @Override // p149l.lux
    /* JADX INFO: renamed from: c */
    public void mo107485c() {
        a460 a460Var = this.wrapper;
        if (a460Var == null) {
            return;
        }
        a460Var.m94827s();
        boolean z = a460Var.get_isMuted();
        this._isMuted = z;
        frc0 frc0Var = this.stateListener;
        if (frc0Var != null) {
            frc0Var.mo6620b(z);
        }
    }

    @Override // p149l.lux
    /* JADX INFO: renamed from: d */
    public void mo107486d(@Nullable Function0<Unit> function0) {
        this.onMediaReady = function0;
    }

    @Override // p149l.lux
    /* JADX INFO: renamed from: e */
    public void mo107487e(@Nullable Function0<Unit> function0) {
        this.onAllMediaFailed = function0;
    }

    @Override // p149l.lux
    /* JADX INFO: renamed from: f */
    public void mo107488f() {
        a460 a460Var = this.wrapper;
        if (a460Var == null) {
            return;
        }
        if (a460Var.m94817g()) {
            a460Var.m94826r();
            this._isPlaying = false;
        } else {
            a460Var.m94819i();
            this._isPlaying = true;
        }
        frc0 frc0Var = this.stateListener;
        if (frc0Var != null) {
            frc0Var.mo6621c(this._isPlaying);
        }
    }

    @Override // p149l.lux
    /* JADX INFO: renamed from: g */
    public void mo107489g(@NotNull ViewGroup container, @NotNull C1265a config, @NotNull y360 session) {
        container.getClass();
        config.getClass();
        session.getClass();
        this.released = false;
        this.containerRef = new WeakReference<>(container);
        this._isMuted = session.getIsMuted();
        this._isPlaying = session.getIsPlaying();
        if (t5l0.mediaLibType != VideoLibraryIntegrated.MEDIA3) {
            m130145t(container, config, "Media3 video library not available");
            return;
        }
        a460 videoPlayerWrapper = session.getVideoPlayerWrapper();
        if (videoPlayerWrapper != null) {
            this.wrapper = videoPlayerWrapper;
            View viewM94828t = videoPlayerWrapper.m94828t();
            ViewParent parent = viewM94828t.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(viewM94828t);
            }
            container.addView(viewM94828t, new ViewGroup.LayoutParams(-1, -1));
            Function0<Unit> function0M130149r = m130149r();
            if (function0M130149r != null) {
                function0M130149r.invoke();
                return;
            }
            return;
        }
        final a460 a460Var = new a460();
        Context context = container.getContext();
        context.getClass();
        a460Var.m94814d(context, config.getMediaUrl());
        Context context2 = container.getContext();
        context2.getClass();
        View viewM94811a = a460Var.m94811a(context2);
        a460Var.m94824p(true);
        this.wrapper = a460Var;
        frc0 frc0Var = this.stateListener;
        if (frc0Var != null) {
            frc0Var.mo6619a(a460Var);
        }
        frc0 frc0Var2 = this.stateListener;
        if (frc0Var2 != null) {
            frc0Var2.mo6623e(true, true, 0L);
        }
        a460Var.m94825q(new Function1() { // from class: l.z9l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return hal0.m130142o(this.f202302a, ((Boolean) obj).booleanValue());
            }
        });
        container.addView(viewM94811a, new ViewGroup.LayoutParams(-1, -1));
        a460Var.m94819i();
        a460Var.m94818h(new Function0() { // from class: l.aal0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return hal0.m130137j(a460Var, this);
            }
        });
        m130146w(container, config);
    }

    @Override // p149l.lux
    /* JADX INFO: renamed from: h */
    public void mo107490h() {
        lux.C18319a.m151826a(this);
    }

    @Override // p149l.lux
    public boolean isPlaying() {
        a460 a460Var = this.wrapper;
        return a460Var != null ? a460Var.m94817g() : this._isPlaying;
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public Function0<Unit> m130148q() {
        return this.onAllMediaFailed;
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public Function0<Unit> m130149r() {
        return this.onMediaReady;
    }

    @Override // p149l.lux
    public void release() {
        this.released = true;
        a460 a460Var = this.wrapper;
        if (a460Var != null) {
            a460Var.m94821m();
        }
        frc0 frc0Var = this.stateListener;
        if (frc0Var != null) {
            frc0Var.mo6622d();
        }
        this.wrapper = null;
        this.containerRef = null;
        this.stateListener = null;
    }

    /* JADX INFO: renamed from: u */
    public final void m130150u(@Nullable Function0<Unit> function0) {
        this.onFallbackToImage = function0;
    }

    /* JADX INFO: renamed from: v */
    public final void m130151v(@Nullable frc0 frc0Var) {
        this.stateListener = frc0Var;
    }
}
