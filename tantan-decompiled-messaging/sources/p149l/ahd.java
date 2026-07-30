package p149l;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.data.GameIdentity;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 V2\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH&¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\fJ\u001d\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u0018J\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\fJ!\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010\fJ\u000f\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\fJ!\u0010(\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u00142\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b+\u0010,R$\u00103\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0017\u00108\u001a\u0002048\u0006¢\u0006\f\n\u0004\b\u001d\u00105\u001a\u0004\b6\u00107R\u0017\u0010:\u001a\u0002048\u0006¢\u0006\f\n\u0004\b!\u00105\u001a\u0004\b9\u00107R\u0016\u0010=\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010<R*\u0010E\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010<\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010H\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010<\u001a\u0004\bF\u0010B\"\u0004\bG\u0010DR\"\u0010M\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010I\u001a\u0004\bJ\u0010\u0010\"\u0004\bK\u0010LR\"\u0010P\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010I\u001a\u0004\bN\u0010\u0010\"\u0004\bO\u0010LR\u001b\u0010U\u001a\u00020Q8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bF\u0010R\u001a\u0004\bS\u0010T¨\u0006W"}, m87232d2 = {"Ll/ahd;", "Ll/jml;", "Ll/ep0;", GameIdentity.player, "<init>", "(Ll/ep0;)V", "Ll/irl;", "fileContainer", "", "A", "(Ll/irl;)V", "B", "()V", "h", "", "u", "()Z", "needYUV", Constants.KEY_T, "(Z)Z", "", "videoWidth", "videoHeight", BLiveStormDanmakuGiftResourceType.f44446s, "(II)V", RXScreenCaptureService.KEY_INDEX, "width", "height", "r", "c", "frameIndex", "Ll/no0;", Constants.KEY_CONFIG, Constants.INAPP_DATA_TAG, "(ILl/no0;)V", "f", "b", "errorType", "", "errorMsg", "a", "(ILjava/lang/String;)V", "Ll/ep0;", BLiveStormDanmakuGiftResourceType.f44444l, "()Ll/ep0;", "Ll/x1m;", "Ll/x1m;", "m", "()Ll/x1m;", BaseSei.f13930X, "(Ll/x1m;)V", "render", "Ll/yuk;", "Ll/yuk;", "n", "()Ll/yuk;", "renderThread", "j", "decodeThread", "e", "I", "surfaceWidth", "surfaceHeight", "value", "g", "getFps", "()I", ResourceDirection.f38808v, "(I)V", "fps", "k", "w", "playLoop", "Z", "p", BaseSei.f13931Y, "(Z)V", "isRunning", "q", BaseSei.f13932Z, "isStopReq", "Ll/inf0;", "Lkotlin/Lazy;", "o", "()Ll/inf0;", "speedControlUtil", "Companion", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public abstract class ahd implements jml {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ep0 player;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public x1m render;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final yuk renderThread;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final yuk decodeThread;

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

    public ahd(@NotNull ep0 ep0Var) {
        ep0Var.getClass();
        this.player = ep0Var;
        this.renderThread = new yuk(null, null);
        this.decodeThread = new yuk(null, null);
        this.speedControlUtil = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.wgd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ahd.m96421g();
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static inf0 m96421g() {
        return new inf0();
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo96422A(@NotNull irl fileContainer);

    /* JADX INFO: renamed from: B */
    public final void m96423B() {
        this.isStopReq = true;
    }

    @Override // p149l.jml
    /* JADX INFO: renamed from: a */
    public void mo68643a(int errorType, @Nullable String errorMsg) {
        C21588z0.INSTANCE.m216707b("AnimPlayer.Decoder", "onFailed errorType=" + errorType + ", errorMsg=" + errorMsg);
        jml animListener = this.player.getAnimListener();
        if (animListener != null) {
            animListener.mo68643a(errorType, errorMsg);
        }
    }

    @Override // p149l.jml
    /* JADX INFO: renamed from: b */
    public void mo68644b() {
        C21588z0.INSTANCE.m216709d("AnimPlayer.Decoder", "onVideoDestroy");
        jml animListener = this.player.getAnimListener();
        if (animListener != null) {
            animListener.mo68644b();
        }
    }

    @Override // p149l.jml
    /* JADX INFO: renamed from: c */
    public void mo68645c() {
        C21588z0.INSTANCE.m216709d("AnimPlayer.Decoder", "onVideoStart");
        jml animListener = this.player.getAnimListener();
        if (animListener != null) {
            animListener.mo68645c();
        }
    }

    @Override // p149l.jml
    /* JADX INFO: renamed from: d */
    public void mo68646d(int frameIndex, @Nullable no0 config) {
        C21588z0.INSTANCE.m216706a("AnimPlayer.Decoder", "onVideoRender");
        jml animListener = this.player.getAnimListener();
        if (animListener != null) {
            animListener.mo68646d(frameIndex, config);
        }
    }

    @Override // p149l.jml
    /* JADX INFO: renamed from: e */
    public /* bridge */ boolean mo68647e(@NotNull no0 no0Var) {
        return super.mo68647e(no0Var);
    }

    @Override // p149l.jml
    /* JADX INFO: renamed from: f */
    public void mo68648f() {
        C21588z0.INSTANCE.m216709d("AnimPlayer.Decoder", "onVideoComplete");
        jml animListener = this.player.getAnimListener();
        if (animListener != null) {
            animListener.mo68648f();
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo96424h();

    /* JADX INFO: renamed from: i */
    public final void m96425i() {
        if (this.player.getIsDetachedFromWindow()) {
            C21588z0.INSTANCE.m216709d("AnimPlayer.Decoder", "destroyThread");
            Handler handler = this.renderThread.getHandler();
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            Handler handler2 = this.decodeThread.getHandler();
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
            }
            yuk yukVar = this.renderThread;
            Companion companion = INSTANCE;
            yukVar.m216117d(companion.m96444b(yukVar.getThread()));
            yuk yukVar2 = this.decodeThread;
            yukVar2.m216117d(companion.m96444b(yukVar2.getThread()));
            this.renderThread.m216116c(null);
            this.decodeThread.m216116c(null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final yuk getDecodeThread() {
        return this.decodeThread;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getPlayLoop() {
        return this.playLoop;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final ep0 getPlayer() {
        return this.player;
    }

    @Nullable
    /* JADX INFO: renamed from: m, reason: from getter */
    public final x1m getRender() {
        return this.render;
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final yuk getRenderThread() {
        return this.renderThread;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final inf0 m96431o() {
        return (inf0) this.speedControlUtil.getValue();
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
    public final void m96434r(int width, int height) {
        this.surfaceWidth = width;
        this.surfaceHeight = height;
        x1m x1mVar = this.render;
        if (x1mVar != null) {
            x1mVar.mo98372c(width, height);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m96435s(int videoWidth, int videoHeight) {
        x1m x1mVar;
        this.player.getConfigManager().m165245a(videoWidth, videoHeight);
        no0 no0VarM165246b = this.player.getConfigManager().getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String();
        if (no0VarM165246b != null && (x1mVar = this.render) != null) {
            x1mVar.mo98371b(no0VarM165246b);
        }
        this.player.getPluginManager().m122552h();
    }

    /* JADX INFO: renamed from: t */
    public final boolean m96436t(boolean needYUV) {
        if (this.render == null) {
            C21588z0 c21588z0 = C21588z0.INSTANCE;
            c21588z0.m216709d("AnimPlayer.Decoder", "prepareRender");
            SurfaceTexture surfaceTexture = this.player.getAnimView().getSurfaceTexture();
            if (surfaceTexture != null) {
                if (needYUV) {
                    c21588z0.m216709d("AnimPlayer.Decoder", "use yuv render");
                    this.render = new mdq0(surfaceTexture);
                } else {
                    arc0 arc0Var = new arc0(surfaceTexture);
                    arc0Var.mo98372c(this.surfaceWidth, this.surfaceHeight);
                    this.render = arc0Var;
                }
            }
        }
        return this.render != null;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m96437u() {
        Companion companion = INSTANCE;
        return companion.m96443a(this.renderThread, "anim_render_thread") && companion.m96443a(this.decodeThread, "anim_decode_thread");
    }

    /* JADX INFO: renamed from: v */
    public final void m96438v(int i) {
        m96431o().m137139c(i);
        this.fps = i;
    }

    /* JADX INFO: renamed from: w */
    public final void m96439w(int i) {
        this.playLoop = i;
    }

    /* JADX INFO: renamed from: x */
    public final void m96440x(@Nullable x1m x1mVar) {
        this.render = x1mVar;
    }

    /* JADX INFO: renamed from: y */
    public final void m96441y(boolean z) {
        this.isRunning = z;
    }

    /* JADX INFO: renamed from: z */
    public final void m96442z(boolean z) {
        this.isStopReq = z;
    }

    /* JADX INFO: renamed from: l.ahd$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m87232d2 = {"Ll/ahd$a;", "", "<init>", "()V", "Ll/yuk;", "handlerHolder", "", AuthenticationTokenClaims.JSON_KEY_NAME, "", "a", "(Ll/yuk;Ljava/lang/String;)Z", "Landroid/os/HandlerThread;", "thread", "b", "(Landroid/os/HandlerThread;)Landroid/os/HandlerThread;", "TAG", "Ljava/lang/String;", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m96443a(@NotNull yuk handlerHolder, @NotNull String name) {
            HandlerThread thread;
            handlerHolder.getClass();
            name.getClass();
            try {
                if (handlerHolder.getThread() != null && ((thread = handlerHolder.getThread()) == null || thread.isAlive())) {
                    return true;
                }
                HandlerThread handlerThread = new HandlerThread(name);
                handlerThread.start();
                handlerHolder.m216116c(new Handler(handlerThread.getLooper()));
                handlerHolder.m216117d(handlerThread);
                return true;
            } catch (OutOfMemoryError e) {
                C21588z0.INSTANCE.m216708c("AnimPlayer.Decoder", "createThread OOM", e);
                return false;
            }
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final HandlerThread m96444b(@Nullable HandlerThread thread) {
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
