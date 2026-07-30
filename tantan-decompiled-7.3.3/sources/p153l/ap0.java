package p153l;

import android.os.Handler;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 i2\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ\u001d\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\nJ\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\fJ\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR$\u0010$\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010+\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u00102\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R*\u0010:\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010=\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u00105\u001a\u0004\b;\u00107\"\u0004\b<\u00109R*\u0010A\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b>\u00105\u001a\u0004\b?\u00107\"\u0004\b@\u00109R\"\u0010G\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010\u0018\"\u0004\bE\u0010FR\"\u0010I\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010C\u001a\u0004\bB\u0010\u0018\"\u0004\bH\u0010FR\"\u0010L\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010C\u001a\u0004\b>\u0010\u0018\"\u0004\bK\u0010FR\"\u0010O\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u00105\u001a\u0004\bM\u00107\"\u0004\bN\u00109R\"\u0010R\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010C\u001a\u0004\bP\u0010\u0018\"\u0004\bQ\u0010FR\"\u0010T\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010C\u001a\u0004\bT\u0010\u0018\"\u0004\bU\u0010FR$\u0010\\\u001a\u0004\u0018\u00010V8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010]\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010C\u001a\u0004\b]\u0010\u0018\"\u0004\b^\u0010FR\"\u0010_\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010C\u001a\u0004\b_\u0010\u0018\"\u0004\b`\u0010FR\u0017\u0010d\u001a\u00020a8\u0006¢\u0006\f\n\u0004\b\r\u0010b\u001a\u0004\b4\u0010cR\u0017\u0010h\u001a\u00020e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010f\u001a\u0004\bJ\u0010g¨\u0006j"}, m88121d2 = {"Ll/ap0;", "", "Ll/xol;", "animView", "<init>", "(Ll/xol;)V", "Ll/wtl;", "fileContainer", "", BLiveStormDanmakuGiftResourceType.f45292l, "(Ll/wtl;)V", BLiveStormDanmakuGiftResourceType.f45294s, "()V", "q", "", "width", "height", "p", "(II)V", "r", "B", c4s.C_ZONE, "", "o", "()Z", "a", "Ll/xol;", Constants.INAPP_DATA_TAG, "()Ll/xol;", "Ll/vol;", "b", "Ll/vol;", "c", "()Ll/vol;", Constants.KEY_T, "(Ll/vol;)V", "animListener", "Ll/gid;", "Ll/gid;", "f", "()Ll/gid;", "setDecoder", "(Ll/gid;)V", "decoder", "Ll/wb1;", "Ll/wb1;", "getAudioPlayer", "()Ll/wb1;", "setAudioPlayer", "(Ll/wb1;)V", "audioPlayer", "value", "e", "I", "getFps", "()I", BaseSei.f14624X, "(I)V", "fps", "getDefaultFps", "u", "defaultFps", "g", RXScreenCaptureService.KEY_INDEX, BaseSei.f14626Z, "playLoop", "h", "Z", "k", "setSupportMaskBoolean", "(Z)V", "supportMaskBoolean", "setMaskEdgeBlurBoolean", "maskEdgeBlurBoolean", "j", "w", "enableVersion1", "getVideoMode", "A", "videoMode", "n", ResourceDirection.f39656v, "isDetachedFromWindow", "m", "isSurfaceAvailable", "setSurfaceAvailable", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "getStartRunnable", "()Ljava/lang/Runnable;", "setStartRunnable", "(Ljava/lang/Runnable;)V", "startRunnable", "isStartRunning", "setStartRunning", "isMute", BaseSei.f14625Y, "Ll/ko0;", "Ll/ko0;", "()Ll/ko0;", "configManager", "Ll/bp0;", "Ll/bp0;", "()Ll/bp0;", "pluginManager", "Companion", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ap0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final xol animView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public vol animListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public gid decoder;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public wb1 audioPlayer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int fps;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int defaultFps;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int playLoop;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean supportMaskBoolean;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean maskEdgeBlurBoolean;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean enableVersion1;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int videoMode;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public boolean isDetachedFromWindow;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean isSurfaceAvailable;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public Runnable startRunnable;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean isStartRunning;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public boolean isMute;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final ko0 configManager;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final bp0 pluginManager;

    public ap0(@NotNull xol xolVar) {
        xolVar.getClass();
        this.animView = xolVar;
        this.videoMode = 1;
        this.configManager = new ko0(this);
        this.pluginManager = new bp0(this);
    }

    /* JADX INFO: renamed from: b */
    public static void m99237b(ap0 ap0Var, wtl wtlVar) {
        vol volVar;
        int iM150560e = ap0Var.configManager.m150560e(wtlVar, ap0Var.enableVersion1, ap0Var.videoMode, ap0Var.defaultFps);
        if (iM150560e != 0) {
            ap0Var.isStartRunning = false;
            gid gidVar = ap0Var.decoder;
            if (gidVar != null) {
                gidVar.mo69826a(iM150560e, ay5.m100864b(ay5.INSTANCE, iM150560e, null, 2, null));
            }
            gid gidVar2 = ap0Var.decoder;
            if (gidVar2 != null) {
                gidVar2.mo69831f();
                return;
            }
            return;
        }
        C21726z0 c21726z0 = C21726z0.INSTANCE;
        c21726z0.m218095d("AnimPlayer.AnimPlayer", "parse " + ap0Var.configManager.getConfig());
        jo0 jo0VarM150557b = ap0Var.configManager.getConfig();
        if (jo0VarM150557b == null || (!jo0VarM150557b.getIsDefaultConfig() && ((volVar = ap0Var.animListener) == null || !volVar.mo69830e(jo0VarM150557b)))) {
            c21726z0.m218095d("AnimPlayer.AnimPlayer", "onVideoConfigReady return false");
        } else {
            ap0Var.m99251l(wtlVar);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m99238m(ap0 ap0Var, wtl wtlVar) {
        ap0Var.m99251l(wtlVar);
    }

    /* JADX INFO: renamed from: A */
    public final void m99239A(int i) {
        this.videoMode = i;
    }

    /* JADX INFO: renamed from: B */
    public final void m99240B(@NotNull final wtl fileContainer) {
        oxk oxkVarM130308n;
        Handler handler;
        fileContainer.getClass();
        this.isStartRunning = true;
        m99257s();
        gid gidVar = this.decoder;
        if (gidVar == null || gidVar.m130315u()) {
            gid gidVar2 = this.decoder;
            if (gidVar2 == null || (oxkVarM130308n = gidVar2.getRenderThread()) == null || (handler = oxkVarM130308n.getHandler()) == null) {
                return;
            }
            handler.post(new Runnable() { // from class: l.yo0
                @Override // java.lang.Runnable
                public final void run() {
                    ap0.m99237b(this.f200940a, fileContainer);
                }
            });
            return;
        }
        this.isStartRunning = false;
        gid gidVar3 = this.decoder;
        if (gidVar3 != null) {
            gidVar3.mo69826a(10003, "0x3 thread create fail");
        }
        gid gidVar4 = this.decoder;
        if (gidVar4 != null) {
            gidVar4.mo69831f();
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m99241C() {
        gid gidVar = this.decoder;
        if (gidVar != null) {
            gidVar.m130302B();
        }
        wb1 wb1Var = this.audioPlayer;
        if (wb1Var != null) {
            wb1Var.m205699j();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final vol getAnimListener() {
        return this.animListener;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final xol getAnimView() {
        return this.animView;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final ko0 getConfigManager() {
        return this.configManager;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final gid getDecoder() {
        return this.decoder;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getEnableVersion1() {
        return this.enableVersion1;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getMaskEdgeBlurBoolean() {
        return this.maskEdgeBlurBoolean;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getPlayLoop() {
        return this.playLoop;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final bp0 getPluginManager() {
        return this.pluginManager;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getSupportMaskBoolean() {
        return this.supportMaskBoolean;
    }

    /* JADX INFO: renamed from: l */
    public final void m99251l(final wtl fileContainer) {
        wb1 wb1Var;
        synchronized (ap0.class) {
            try {
                if (this.isSurfaceAvailable) {
                    this.isStartRunning = false;
                    gid gidVar = this.decoder;
                    if (gidVar != null) {
                        gidVar.mo128111A(fileContainer);
                    }
                    if (!this.isMute && (wb1Var = this.audioPlayer) != null) {
                        wb1Var.m205697h(fileContainer);
                    }
                } else {
                    this.startRunnable = new Runnable() { // from class: l.zo0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ap0.m99238m(this.f205264a, fileContainer);
                        }
                    };
                    this.animView.mo69817a();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getIsDetachedFromWindow() {
        return this.isDetachedFromWindow;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m99253o() {
        if (this.isStartRunning) {
            return true;
        }
        gid gidVar = this.decoder;
        return gidVar != null ? gidVar.getIsRunning() : false;
    }

    /* JADX INFO: renamed from: p */
    public final void m99254p(int width, int height) {
        this.isSurfaceAvailable = true;
        Runnable runnable = this.startRunnable;
        if (runnable != null) {
            runnable.run();
        }
        this.startRunnable = null;
    }

    /* JADX INFO: renamed from: q */
    public final void m99255q() {
        this.isSurfaceAvailable = false;
        this.isStartRunning = false;
        gid gidVar = this.decoder;
        if (gidVar != null) {
            gidVar.mo128121h();
        }
        wb1 wb1Var = this.audioPlayer;
        if (wb1Var != null) {
            wb1Var.m205691b();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m99256r(int width, int height) {
        gid gidVar = this.decoder;
        if (gidVar != null) {
            gidVar.m130312r(width, height);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m99257s() {
        if (this.decoder == null) {
            fyk fykVar = new fyk(this);
            fykVar.m130317w(this.playLoop);
            fykVar.m130316v(this.fps);
            this.decoder = fykVar;
        }
        if (this.audioPlayer == null) {
            wb1 wb1Var = new wb1(this);
            wb1Var.m205696g(this.playLoop);
            this.audioPlayer = wb1Var;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m99258t(@Nullable vol volVar) {
        this.animListener = volVar;
    }

    /* JADX INFO: renamed from: u */
    public final void m99259u(int i) {
        this.defaultFps = i;
    }

    /* JADX INFO: renamed from: v */
    public final void m99260v(boolean z) {
        this.isDetachedFromWindow = z;
    }

    /* JADX INFO: renamed from: w */
    public final void m99261w(boolean z) {
        this.enableVersion1 = z;
    }

    /* JADX INFO: renamed from: x */
    public final void m99262x(int i) {
        gid gidVar = this.decoder;
        if (gidVar != null) {
            gidVar.m130316v(i);
        }
        this.fps = i;
    }

    /* JADX INFO: renamed from: y */
    public final void m99263y(boolean z) {
        this.isMute = z;
    }

    /* JADX INFO: renamed from: z */
    public final void m99264z(int i) {
        gid gidVar = this.decoder;
        if (gidVar != null) {
            gidVar.m130317w(i);
        }
        wb1 wb1Var = this.audioPlayer;
        if (wb1Var != null) {
            wb1Var.m205696g(i);
        }
        this.playLoop = i;
    }
}
