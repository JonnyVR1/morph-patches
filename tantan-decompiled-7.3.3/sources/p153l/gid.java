package p153l;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.data.GameIdentity;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 V2\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH&¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\fJ\u001d\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u0018J\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\fJ!\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010\fJ\u000f\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\fJ!\u0010(\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u00142\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b+\u0010,R$\u00103\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0017\u00108\u001a\u0002048\u0006¢\u0006\f\n\u0004\b\u001d\u00105\u001a\u0004\b6\u00107R\u0017\u0010:\u001a\u0002048\u0006¢\u0006\f\n\u0004\b!\u00105\u001a\u0004\b9\u00107R\u0016\u0010=\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010<R*\u0010E\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010<\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010H\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010<\u001a\u0004\bF\u0010B\"\u0004\bG\u0010DR\"\u0010M\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010I\u001a\u0004\bJ\u0010\u0010\"\u0004\bK\u0010LR\"\u0010P\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010I\u001a\u0004\bN\u0010\u0010\"\u0004\bO\u0010LR\u001b\u0010U\u001a\u00020Q8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bF\u0010R\u001a\u0004\bS\u0010T¨\u0006W"}, m88121d2 = {"Ll/gid;", "Ll/vol;", "Ll/ap0;", GameIdentity.player, "<init>", "(Ll/ap0;)V", "Ll/wtl;", "fileContainer", "", "A", "(Ll/wtl;)V", "B", "()V", "h", "", "u", "()Z", "needYUV", Constants.KEY_T, "(Z)Z", "", "videoWidth", "videoHeight", BLiveStormDanmakuGiftResourceType.f45294s, "(II)V", RXScreenCaptureService.KEY_INDEX, "width", "height", "r", "c", "frameIndex", "Ll/jo0;", Constants.KEY_CONFIG, Constants.INAPP_DATA_TAG, "(ILl/jo0;)V", "f", "b", "errorType", "", "errorMsg", "a", "(ILjava/lang/String;)V", "Ll/ap0;", BLiveStormDanmakuGiftResourceType.f45292l, "()Ll/ap0;", "Ll/q4m;", "Ll/q4m;", "m", "()Ll/q4m;", BaseSei.f14624X, "(Ll/q4m;)V", "render", "Ll/oxk;", "Ll/oxk;", "n", "()Ll/oxk;", "renderThread", "j", "decodeThread", "e", "I", "surfaceWidth", "surfaceHeight", "value", "g", "getFps", "()I", ResourceDirection.f39656v, "(I)V", "fps", "k", "w", "playLoop", "Z", "p", BaseSei.f14625Y, "(Z)V", "isRunning", "q", BaseSei.f14626Z, "isStopReq", "Ll/rvf0;", "Lkotlin/Lazy;", "o", "()Ll/rvf0;", "speedControlUtil", "Companion", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public abstract class gid implements vol {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ap0 player;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public q4m render;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final oxk renderThread;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final oxk decodeThread;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int surfaceWidth;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int surfaceHeight;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int fps;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int playLoop;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean isRunning;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean isStopReq;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy speedControlUtil;

    public gid(@NotNull ap0 ap0Var) {
        ap0Var.getClass();
        this.player = ap0Var;
        this.renderThread = new oxk(null, null);
        this.decodeThread = new oxk(null, null);
        this.speedControlUtil = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.cid
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return gid.m130301g();
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static rvf0 m130301g() {
        return new rvf0();
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo128111A(@NotNull wtl fileContainer);

    /* JADX INFO: renamed from: B */
    public final void m130302B() {
        this.isStopReq = true;
    }

    @Override // p153l.vol
    /* JADX INFO: renamed from: a */
    public void mo69826a(int errorType, @Nullable String errorMsg) {
        C21726z0.INSTANCE.m218093b("AnimPlayer.Decoder", "onFailed errorType=" + errorType + ", errorMsg=" + errorMsg);
        vol animListener = this.player.getAnimListener();
        if (animListener != null) {
            animListener.mo69826a(errorType, errorMsg);
        }
    }

    @Override // p153l.vol
    /* JADX INFO: renamed from: b */
    public void mo69827b() {
        C21726z0.INSTANCE.m218095d("AnimPlayer.Decoder", "onVideoDestroy");
        vol animListener = this.player.getAnimListener();
        if (animListener != null) {
            animListener.mo69827b();
        }
    }

    @Override // p153l.vol
    /* JADX INFO: renamed from: c */
    public void mo69828c() {
        C21726z0.INSTANCE.m218095d("AnimPlayer.Decoder", "onVideoStart");
        vol animListener = this.player.getAnimListener();
        if (animListener != null) {
            animListener.mo69828c();
        }
    }

    @Override // p153l.vol
    /* JADX INFO: renamed from: d */
    public void mo69829d(int frameIndex, @Nullable jo0 config) {
        C21726z0.INSTANCE.m218092a("AnimPlayer.Decoder", "onVideoRender");
        vol animListener = this.player.getAnimListener();
        if (animListener != null) {
            animListener.mo69829d(frameIndex, config);
        }
    }

    @Override // p153l.vol
    /* JADX INFO: renamed from: e */
    public /* bridge */ boolean mo69830e(@NotNull jo0 jo0Var) {
        return super.mo69830e(jo0Var);
    }

    @Override // p153l.vol
    /* JADX INFO: renamed from: f */
    public void mo69831f() {
        C21726z0.INSTANCE.m218095d("AnimPlayer.Decoder", "onVideoComplete");
        vol animListener = this.player.getAnimListener();
        if (animListener != null) {
            animListener.mo69831f();
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo128121h();

    /* JADX INFO: renamed from: i */
    public final void m130303i() {
        if (this.player.getIsDetachedFromWindow()) {
            C21726z0.INSTANCE.m218095d("AnimPlayer.Decoder", "destroyThread");
            Handler handler = this.renderThread.getHandler();
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            Handler handler2 = this.decodeThread.getHandler();
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
            }
            oxk oxkVar = this.renderThread;
            Companion companion = INSTANCE;
            oxkVar.m169722d(companion.m130322b(oxkVar.getThread()));
            oxk oxkVar2 = this.decodeThread;
            oxkVar2.m169722d(companion.m130322b(oxkVar2.getThread()));
            this.renderThread.m169721c(null);
            this.decodeThread.m169721c(null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final oxk getDecodeThread() {
        return this.decodeThread;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getPlayLoop() {
        return this.playLoop;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final ap0 getPlayer() {
        return this.player;
    }

    @Nullable
    /* JADX INFO: renamed from: m, reason: from getter */
    public final q4m getRender() {
        return this.render;
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final oxk getRenderThread() {
        return this.renderThread;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final rvf0 m130309o() {
        return (rvf0) this.speedControlUtil.getValue();
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getIsRunning() {
        return this.isRunning;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getIsStopReq() {
        return this.isStopReq;
    }

    /* JADX INFO: renamed from: r */
    public final void m130312r(int width, int height) {
        this.surfaceWidth = width;
        this.surfaceHeight = height;
        q4m q4mVar = this.render;
        if (q4mVar != null) {
            q4mVar.mo128150c(width, height);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m130313s(int videoWidth, int videoHeight) {
        q4m q4mVar;
        this.player.getConfigManager().m150556a(videoWidth, videoHeight);
        jo0 jo0VarM150557b = this.player.getConfigManager().getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String();
        if (jo0VarM150557b != null && (q4mVar = this.render) != null) {
            q4mVar.mo128149b(jo0VarM150557b);
        }
        this.player.getPluginManager().m105765h();
    }

    /* JADX INFO: renamed from: t */
    public final boolean m130314t(boolean needYUV) {
        if (this.render == null) {
            C21726z0 c21726z0 = C21726z0.INSTANCE;
            c21726z0.m218095d("AnimPlayer.Decoder", "prepareRender");
            SurfaceTexture surfaceTexture = this.player.getAnimView().getSurfaceTexture();
            if (surfaceTexture != null) {
                if (needYUV) {
                    c21726z0.m218095d("AnimPlayer.Decoder", "use yuv render");
                    this.render = new rmq0(surfaceTexture);
                } else {
                    fzc0 fzc0Var = new fzc0(surfaceTexture);
                    fzc0Var.mo128150c(this.surfaceWidth, this.surfaceHeight);
                    this.render = fzc0Var;
                }
            }
        }
        return this.render != null;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m130315u() {
        Companion companion = INSTANCE;
        return companion.m130321a(this.renderThread, "anim_render_thread") && companion.m130321a(this.decodeThread, "anim_decode_thread");
    }

    /* JADX INFO: renamed from: v */
    public final void m130316v(int i) {
        m130309o().m183267c(i);
        this.fps = i;
    }

    /* JADX INFO: renamed from: w */
    public final void m130317w(int i) {
        this.playLoop = i;
    }

    /* JADX INFO: renamed from: x */
    public final void m130318x(@Nullable q4m q4mVar) {
        this.render = q4mVar;
    }

    /* JADX INFO: renamed from: y */
    public final void m130319y(boolean z) {
        this.isRunning = z;
    }

    /* JADX INFO: renamed from: z */
    public final void m130320z(boolean z) {
        this.isStopReq = z;
    }

    /* JADX INFO: renamed from: l.gid$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"Ll/gid$a;", "", "<init>", "()V", "Ll/oxk;", "handlerHolder", "", AuthenticationTokenClaims.JSON_KEY_NAME, "", "a", "(Ll/oxk;Ljava/lang/String;)Z", "Landroid/os/HandlerThread;", "thread", "b", "(Landroid/os/HandlerThread;)Landroid/os/HandlerThread;", "TAG", "Ljava/lang/String;", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m130321a(@NotNull oxk handlerHolder, @NotNull String name) {
            HandlerThread thread;
            handlerHolder.getClass();
            name.getClass();
            try {
                if (handlerHolder.getThread() != null && ((thread = handlerHolder.getThread()) == null || thread.isAlive())) {
                    return true;
                }
                HandlerThread handlerThread = new HandlerThread(name);
                handlerThread.start();
                handlerHolder.m169721c(new Handler(handlerThread.getLooper()));
                handlerHolder.m169722d(handlerThread);
                return true;
            } catch (OutOfMemoryError e) {
                C21726z0.INSTANCE.m218094c("AnimPlayer.Decoder", "createThread OOM", e);
                return false;
            }
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final HandlerThread m130322b(@Nullable HandlerThread thread) {
            if (thread == null) {
                return null;
            }
            thread.quitSafely();
            return null;
        }

        public Companion() {
        }
    }
}
