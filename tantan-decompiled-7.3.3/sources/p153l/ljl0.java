package p153l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.media3.common.PlaybackException;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import com.clevertap.android.sdk.inapp.pipsdk.C1288a;
import com.clevertap.android.sdk.video.VideoLibraryIntegrated;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010&R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010-R*\u00106\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010>\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R*\u0010A\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u0001008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b?\u00101\u001a\u0004\b@\u00103\"\u0004\b)\u00105R*\u0010D\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u0001008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bB\u00101\u001a\u0004\bC\u00103\"\u0004\b,\u00105R\u0016\u0010F\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010-R\u0014\u0010H\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010GR\u0014\u0010I\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010G¨\u0006J"}, m88121d2 = {"Ll/ljl0;", "Ll/i3y;", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "resourceProvider", "Ljava/util/concurrent/ExecutorService;", "mediaExecutor", "<init>", "(Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;Ljava/util/concurrent/ExecutorService;)V", "Landroid/view/ViewGroup;", "container", "Lcom/clevertap/android/sdk/inapp/pipsdk/a;", Constants.KEY_CONFIG, "", "w", "(Landroid/view/ViewGroup;Lcom/clevertap/android/sdk/inapp/pipsdk/a;)V", "Landroidx/media3/common/PlaybackException;", "error", "", BLiveStormDanmakuGiftResourceType.f45294s, "(Landroidx/media3/common/PlaybackException;)Z", "", "errorMsg", Constants.KEY_T, "(Landroid/view/ViewGroup;Lcom/clevertap/android/sdk/inapp/pipsdk/a;Ljava/lang/String;)V", "Ll/dc60;", "session", "g", "(Landroid/view/ViewGroup;Lcom/clevertap/android/sdk/inapp/pipsdk/a;Ll/dc60;)V", "a", "(Landroid/view/ViewGroup;Ll/dc60;)V", "release", "()V", "f", "c", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "b", "Ljava/util/concurrent/ExecutorService;", "Ll/fc60;", "Ll/fc60;", "wrapper", "Ljava/lang/ref/WeakReference;", Constants.INAPP_DATA_TAG, "Ljava/lang/ref/WeakReference;", "containerRef", "e", "Z", "_isMuted", "_isPlaying", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "getOnFallbackToImage", "()Lkotlin/jvm/functions/Function0;", "u", "(Lkotlin/jvm/functions/Function0;)V", "onFallbackToImage", "Ll/kzc0;", "h", "Ll/kzc0;", "getStateListener", "()Ll/kzc0;", ResourceDirection.f39656v, "(Ll/kzc0;)V", "stateListener", RXScreenCaptureService.KEY_INDEX, "r", "onMediaReady", "j", "q", "onAllMediaFailed", "k", "released", "()Z", "isMuted", "isPlaying", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class ljl0 implements i3y {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final FileResourceProvider resourceProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ExecutorService mediaExecutor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private fc60 wrapper;

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
    private kzc0 stateListener;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> onMediaReady;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> onAllMediaFailed;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private volatile boolean released;

    public ljl0(@NotNull FileResourceProvider fileResourceProvider, @NotNull ExecutorService executorService) {
        fileResourceProvider.getClass();
        executorService.getClass();
        this.resourceProvider = fileResourceProvider;
        this.mediaExecutor = executorService;
        this._isMuted = true;
        this._isPlaying = true;
    }

    /* JADX INFO: renamed from: i */
    public static Unit m154512i(final ViewGroup viewGroup, final ljl0 ljl0Var, final C1288a c1288a, final PlaybackException playbackException) {
        viewGroup.getClass();
        ljl0Var.getClass();
        c1288a.getClass();
        playbackException.getClass();
        viewGroup.post(new Runnable() { // from class: l.kjl0
            @Override // java.lang.Runnable
            public final void run() {
                ljl0.m154523x(this.f127110a, playbackException, viewGroup, c1288a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static Unit m154513j(fc60 fc60Var, ljl0 ljl0Var) {
        fc60Var.getClass();
        ljl0Var.getClass();
        fc60Var.m124990c();
        Function0<Unit> function0M154525r = ljl0Var.m154525r();
        if (function0M154525r != null) {
            function0M154525r.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static Unit m154514k(ljl0 ljl0Var) {
        ljl0Var.getClass();
        Function0<Unit> function0M154524q = ljl0Var.m154524q();
        if (function0M154524q != null) {
            function0M154524q.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m154516m(ljl0 ljl0Var) {
        ljl0Var.getClass();
        return ljl0Var.released;
    }

    /* JADX INFO: renamed from: n */
    public static Unit m154517n(ljl0 ljl0Var, boolean z) {
        ljl0Var.getClass();
        ljl0Var._isPlaying = z;
        kzc0 kzc0Var = ljl0Var.stateListener;
        if (kzc0Var != null) {
            kzc0Var.mo6675c(z);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static Unit m154518o(ljl0 ljl0Var, boolean z) {
        ljl0Var.getClass();
        ljl0Var._isPlaying = z;
        kzc0 kzc0Var = ljl0Var.stateListener;
        if (kzc0Var != null) {
            kzc0Var.mo6675c(z);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static Unit m154519p(ljl0 ljl0Var) {
        ljl0Var.getClass();
        Function0<Unit> function0M154525r = ljl0Var.m154525r();
        if (function0M154525r != null) {
            function0M154525r.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    private final boolean m154520s(PlaybackException error) {
        error.getCause();
        return false;
    }

    /* JADX INFO: renamed from: t */
    private final void m154521t(ViewGroup container, C1288a config, String errorMsg) {
        container.removeAllViews();
        fc60 fc60Var = this.wrapper;
        if (fc60Var != null) {
            fc60Var.m124998m();
        }
        this.wrapper = null;
        kzc0 kzc0Var = this.stateListener;
        if (kzc0Var != null) {
            kzc0Var.mo6676d();
        }
        Function0<Unit> function0 = this.onFallbackToImage;
        if (function0 != null) {
            function0.invoke();
        }
        k5g.INSTANCE.m148362d(new l5g(container, config.getFallbackUrl(), config.getMediaUrl(), this.resourceProvider, this.mediaExecutor, new Function0() { // from class: l.gjl0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(ljl0.m154516m(this.f104636a));
            }
        }, config.getCallbacks(), errorMsg, null, new Function0() { // from class: l.hjl0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ljl0.m154519p(this.f110227a);
            }
        }, new Function0() { // from class: l.ijl0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ljl0.m154514k(this.f115240a);
            }
        }, 256, null));
    }

    /* JADX INFO: renamed from: w */
    private final void m154522w(final ViewGroup container, final C1288a config) {
        fc60 fc60Var = this.wrapper;
        if (fc60Var != null) {
            fc60Var.m125000o(new Function1() { // from class: l.jjl0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ljl0.m154512i(container, this, config, (PlaybackException) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final void m154523x(ljl0 ljl0Var, PlaybackException playbackException, ViewGroup viewGroup, C1288a c1288a) {
        fc60 fc60Var;
        ljl0Var.getClass();
        playbackException.getClass();
        viewGroup.getClass();
        c1288a.getClass();
        if (ljl0Var.m154520s(playbackException) && (fc60Var = ljl0Var.wrapper) != null && fc60Var.getNetworkRetryEnabled()) {
            fc60 fc60Var2 = ljl0Var.wrapper;
            if (fc60Var2 != null) {
                fc60Var2.m124999n();
                return;
            }
            return;
        }
        String message = playbackException.getMessage();
        if (message == null) {
            message = "Video playback error";
        }
        ljl0Var.m154521t(viewGroup, c1288a, message);
    }

    @Override // p153l.i3y
    /* JADX INFO: renamed from: a */
    public void mo138352a(@NotNull ViewGroup container, @NotNull dc60 session) {
        container.getClass();
        session.getClass();
        this.containerRef = new WeakReference<>(container);
        fc60 videoPlayerWrapper = session.getVideoPlayerWrapper();
        if (videoPlayerWrapper == null) {
            return;
        }
        this.wrapper = videoPlayerWrapper;
        Context context = container.getContext();
        context.getClass();
        View viewM124997j = videoPlayerWrapper.m124997j(context);
        if (viewM124997j == null) {
            return;
        }
        container.addView(viewM124997j, new ViewGroup.LayoutParams(-1, -1));
        this._isMuted = session.getIsMuted();
        this._isPlaying = session.getIsPlaying();
        videoPlayerWrapper.m125002q(new Function1() { // from class: l.fjl0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ljl0.m154517n(this.f99349a, ((Boolean) obj).booleanValue());
            }
        });
        m154522w(container, session.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String());
        Function0<Unit> function0M154525r = m154525r();
        if (function0M154525r != null) {
            function0M154525r.invoke();
        }
    }

    @Override // p153l.i3y
    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean get_isMuted() {
        return this._isMuted;
    }

    @Override // p153l.i3y
    /* JADX INFO: renamed from: c */
    public void mo138354c() {
        fc60 fc60Var = this.wrapper;
        if (fc60Var == null) {
            return;
        }
        fc60Var.m125004s();
        boolean z = fc60Var.get_isMuted();
        this._isMuted = z;
        kzc0 kzc0Var = this.stateListener;
        if (kzc0Var != null) {
            kzc0Var.mo6674b(z);
        }
    }

    @Override // p153l.i3y
    /* JADX INFO: renamed from: d */
    public void mo138355d(@Nullable Function0<Unit> function0) {
        this.onMediaReady = function0;
    }

    @Override // p153l.i3y
    /* JADX INFO: renamed from: e */
    public void mo138356e(@Nullable Function0<Unit> function0) {
        this.onAllMediaFailed = function0;
    }

    @Override // p153l.i3y
    /* JADX INFO: renamed from: f */
    public void mo138357f() {
        fc60 fc60Var = this.wrapper;
        if (fc60Var == null) {
            return;
        }
        if (fc60Var.m124994g()) {
            fc60Var.m125003r();
            this._isPlaying = false;
        } else {
            fc60Var.m124996i();
            this._isPlaying = true;
        }
        kzc0 kzc0Var = this.stateListener;
        if (kzc0Var != null) {
            kzc0Var.mo6675c(this._isPlaying);
        }
    }

    @Override // p153l.i3y
    /* JADX INFO: renamed from: g */
    public void mo138358g(@NotNull ViewGroup container, @NotNull C1288a config, @NotNull dc60 session) {
        container.getClass();
        config.getClass();
        session.getClass();
        this.released = false;
        this.containerRef = new WeakReference<>(container);
        this._isMuted = session.getIsMuted();
        this._isPlaying = session.getIsPlaying();
        if (xel0.mediaLibType != VideoLibraryIntegrated.MEDIA3) {
            m154521t(container, config, "Media3 video library not available");
            return;
        }
        fc60 videoPlayerWrapper = session.getVideoPlayerWrapper();
        if (videoPlayerWrapper != null) {
            this.wrapper = videoPlayerWrapper;
            View viewM125005t = videoPlayerWrapper.m125005t();
            ViewParent parent = viewM125005t.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(viewM125005t);
            }
            container.addView(viewM125005t, new ViewGroup.LayoutParams(-1, -1));
            Function0<Unit> function0M154525r = m154525r();
            if (function0M154525r != null) {
                function0M154525r.invoke();
                return;
            }
            return;
        }
        final fc60 fc60Var = new fc60();
        Context context = container.getContext();
        context.getClass();
        fc60Var.m124991d(context, config.getMediaUrl());
        Context context2 = container.getContext();
        context2.getClass();
        View viewM124988a = fc60Var.m124988a(context2);
        fc60Var.m125001p(true);
        this.wrapper = fc60Var;
        kzc0 kzc0Var = this.stateListener;
        if (kzc0Var != null) {
            kzc0Var.mo6673a(fc60Var);
        }
        kzc0 kzc0Var2 = this.stateListener;
        if (kzc0Var2 != null) {
            kzc0Var2.mo6677e(true, true, 0L);
        }
        fc60Var.m125002q(new Function1() { // from class: l.djl0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ljl0.m154518o(this.f88870a, ((Boolean) obj).booleanValue());
            }
        });
        container.addView(viewM124988a, new ViewGroup.LayoutParams(-1, -1));
        fc60Var.m124996i();
        fc60Var.m124995h(new Function0() { // from class: l.ejl0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ljl0.m154513j(fc60Var, this);
            }
        });
        m154522w(container, config);
    }

    @Override // p153l.i3y
    /* JADX INFO: renamed from: h */
    public void mo138359h() {
        i3y.C17632a.m138360a(this);
    }

    @Override // p153l.i3y
    public boolean isPlaying() {
        fc60 fc60Var = this.wrapper;
        return fc60Var != null ? fc60Var.m124994g() : this._isPlaying;
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public Function0<Unit> m154524q() {
        return this.onAllMediaFailed;
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public Function0<Unit> m154525r() {
        return this.onMediaReady;
    }

    @Override // p153l.i3y
    public void release() {
        this.released = true;
        fc60 fc60Var = this.wrapper;
        if (fc60Var != null) {
            fc60Var.m124998m();
        }
        kzc0 kzc0Var = this.stateListener;
        if (kzc0Var != null) {
            kzc0Var.mo6676d();
        }
        this.wrapper = null;
        this.containerRef = null;
        this.stateListener = null;
    }

    /* JADX INFO: renamed from: u */
    public final void m154526u(@Nullable Function0<Unit> function0) {
        this.onFallbackToImage = function0;
    }

    /* JADX INFO: renamed from: v */
    public final void m154527v(@Nullable kzc0 kzc0Var) {
        this.stateListener = kzc0Var;
    }
}
