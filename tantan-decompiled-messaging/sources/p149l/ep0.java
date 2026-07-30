package p149l;

import android.os.Handler;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 i2\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ\u001d\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\nJ\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\fJ\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR$\u0010$\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010+\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u00102\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R*\u0010:\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010=\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u00105\u001a\u0004\b;\u00107\"\u0004\b<\u00109R*\u0010A\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b>\u00105\u001a\u0004\b?\u00107\"\u0004\b@\u00109R\"\u0010G\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010\u0018\"\u0004\bE\u0010FR\"\u0010I\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010C\u001a\u0004\bB\u0010\u0018\"\u0004\bH\u0010FR\"\u0010L\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010C\u001a\u0004\b>\u0010\u0018\"\u0004\bK\u0010FR\"\u0010O\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u00105\u001a\u0004\bM\u00107\"\u0004\bN\u00109R\"\u0010R\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010C\u001a\u0004\bP\u0010\u0018\"\u0004\bQ\u0010FR\"\u0010T\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010C\u001a\u0004\bT\u0010\u0018\"\u0004\bU\u0010FR$\u0010\\\u001a\u0004\u0018\u00010V8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010]\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010C\u001a\u0004\b]\u0010\u0018\"\u0004\b^\u0010FR\"\u0010_\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010C\u001a\u0004\b_\u0010\u0018\"\u0004\b`\u0010FR\u0017\u0010d\u001a\u00020a8\u0006¢\u0006\f\n\u0004\b\r\u0010b\u001a\u0004\b4\u0010cR\u0017\u0010h\u001a\u00020e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010f\u001a\u0004\bJ\u0010g¨\u0006j"}, m87232d2 = {"Ll/ep0;", "", "Ll/lml;", "animView", "<init>", "(Ll/lml;)V", "Ll/irl;", "fileContainer", "", BLiveStormDanmakuGiftResourceType.f44444l, "(Ll/irl;)V", BLiveStormDanmakuGiftResourceType.f44446s, "()V", "q", "", "width", "height", "p", "(II)V", "r", "B", b2s.C_ZONE, "", "o", "()Z", "a", "Ll/lml;", Constants.INAPP_DATA_TAG, "()Ll/lml;", "Ll/jml;", "b", "Ll/jml;", "c", "()Ll/jml;", Constants.KEY_T, "(Ll/jml;)V", "animListener", "Ll/ahd;", "Ll/ahd;", "f", "()Ll/ahd;", "setDecoder", "(Ll/ahd;)V", "decoder", "Ll/pb1;", "Ll/pb1;", "getAudioPlayer", "()Ll/pb1;", "setAudioPlayer", "(Ll/pb1;)V", "audioPlayer", "value", "e", "I", "getFps", "()I", BaseSei.f13930X, "(I)V", "fps", "getDefaultFps", "u", "defaultFps", "g", RXScreenCaptureService.KEY_INDEX, BaseSei.f13932Z, "playLoop", "h", "Z", "k", "setSupportMaskBoolean", "(Z)V", "supportMaskBoolean", "setMaskEdgeBlurBoolean", "maskEdgeBlurBoolean", "j", "w", "enableVersion1", "getVideoMode", "A", "videoMode", "n", ResourceDirection.f38808v, "isDetachedFromWindow", "m", "isSurfaceAvailable", "setSurfaceAvailable", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "getStartRunnable", "()Ljava/lang/Runnable;", "setStartRunnable", "(Ljava/lang/Runnable;)V", "startRunnable", "isStartRunning", "setStartRunning", "isMute", BaseSei.f13931Y, "Ll/oo0;", "Ll/oo0;", "()Ll/oo0;", "configManager", "Ll/fp0;", "Ll/fp0;", "()Ll/fp0;", "pluginManager", "Companion", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ep0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final lml animView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public jml animListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public ahd decoder;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public pb1 audioPlayer;

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
    public final oo0 configManager;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final fp0 pluginManager;

    public ep0(@NotNull lml lmlVar) {
        lmlVar.getClass();
        this.animView = lmlVar;
        this.videoMode = 1;
        this.configManager = new oo0(this);
        this.pluginManager = new fp0(this);
    }

    /* JADX INFO: renamed from: b */
    public static void m117526b(ep0 ep0Var, irl irlVar) {
        jml jmlVar;
        int iM165249e = ep0Var.configManager.m165249e(irlVar, ep0Var.enableVersion1, ep0Var.videoMode, ep0Var.defaultFps);
        if (iM165249e != 0) {
            ep0Var.isStartRunning = false;
            ahd ahdVar = ep0Var.decoder;
            if (ahdVar != null) {
                ahdVar.mo68643a(iM165249e, vw5.m200283b(vw5.INSTANCE, iM165249e, null, 2, null));
            }
            ahd ahdVar2 = ep0Var.decoder;
            if (ahdVar2 != null) {
                ahdVar2.mo68648f();
                return;
            }
            return;
        }
        C21588z0 c21588z0 = C21588z0.INSTANCE;
        c21588z0.m216709d("AnimPlayer.AnimPlayer", "parse " + ep0Var.configManager.getConfig());
        no0 no0VarM165246b = ep0Var.configManager.getConfig();
        if (no0VarM165246b == null || (!no0VarM165246b.getIsDefaultConfig() && ((jmlVar = ep0Var.animListener) == null || !jmlVar.mo68647e(no0VarM165246b)))) {
            c21588z0.m216709d("AnimPlayer.AnimPlayer", "onVideoConfigReady return false");
        } else {
            ep0Var.m117540l(irlVar);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m117527m(ep0 ep0Var, irl irlVar) {
        ep0Var.m117540l(irlVar);
    }

    /* JADX INFO: renamed from: A */
    public final void m117528A(int i) {
        this.videoMode = i;
    }

    /* JADX INFO: renamed from: B */
    public final void m117529B(@NotNull final irl fileContainer) {
        yuk yukVarM96430n;
        Handler handler;
        fileContainer.getClass();
        this.isStartRunning = true;
        m117546s();
        ahd ahdVar = this.decoder;
        if (ahdVar == null || ahdVar.m96437u()) {
            ahd ahdVar2 = this.decoder;
            if (ahdVar2 == null || (yukVarM96430n = ahdVar2.getRenderThread()) == null || (handler = yukVarM96430n.getHandler()) == null) {
                return;
            }
            handler.post(new Runnable() { // from class: l.cp0
                @Override // java.lang.Runnable
                public final void run() {
                    ep0.m117526b(this.f81893a, fileContainer);
                }
            });
            return;
        }
        this.isStartRunning = false;
        ahd ahdVar3 = this.decoder;
        if (ahdVar3 != null) {
            ahdVar3.mo68643a(10003, "0x3 thread create fail");
        }
        ahd ahdVar4 = this.decoder;
        if (ahdVar4 != null) {
            ahdVar4.mo68648f();
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m117530C() {
        ahd ahdVar = this.decoder;
        if (ahdVar != null) {
            ahdVar.m96423B();
        }
        pb1 pb1Var = this.audioPlayer;
        if (pb1Var != null) {
            pb1Var.m168118j();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final jml getAnimListener() {
        return this.animListener;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final lml getAnimView() {
        return this.animView;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final oo0 getConfigManager() {
        return this.configManager;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final ahd getDecoder() {
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
    public final fp0 getPluginManager() {
        return this.pluginManager;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getSupportMaskBoolean() {
        return this.supportMaskBoolean;
    }

    /* JADX INFO: renamed from: l */
    public final void m117540l(final irl fileContainer) {
        pb1 pb1Var;
        synchronized (ep0.class) {
            try {
                if (this.isSurfaceAvailable) {
                    this.isStartRunning = false;
                    ahd ahdVar = this.decoder;
                    if (ahdVar != null) {
                        ahdVar.mo96422A(fileContainer);
                    }
                    if (!this.isMute && (pb1Var = this.audioPlayer) != null) {
                        pb1Var.m168116h(fileContainer);
                    }
                } else {
                    this.startRunnable = new Runnable() { // from class: l.dp0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ep0.m117527m(this.f87220a, fileContainer);
                        }
                    };
                    this.animView.mo68634a();
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
    public final boolean m117542o() {
        if (this.isStartRunning) {
            return true;
        }
        ahd ahdVar = this.decoder;
        return ahdVar != null ? ahdVar.getIsRunning() : false;
    }

    /* JADX INFO: renamed from: p */
    public final void m117543p(int width, int height) {
        this.isSurfaceAvailable = true;
        Runnable runnable = this.startRunnable;
        if (runnable != null) {
            runnable.run();
        }
        this.startRunnable = null;
    }

    /* JADX INFO: renamed from: q */
    public final void m117544q() {
        this.isSurfaceAvailable = false;
        this.isStartRunning = false;
        ahd ahdVar = this.decoder;
        if (ahdVar != null) {
            ahdVar.mo96424h();
        }
        pb1 pb1Var = this.audioPlayer;
        if (pb1Var != null) {
            pb1Var.m168110b();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m117545r(int width, int height) {
        ahd ahdVar = this.decoder;
        if (ahdVar != null) {
            ahdVar.m96434r(width, height);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m117546s() {
        if (this.decoder == null) {
            pvk pvkVar = new pvk(this);
            pvkVar.m96439w(this.playLoop);
            pvkVar.m96438v(this.fps);
            this.decoder = pvkVar;
        }
        if (this.audioPlayer == null) {
            pb1 pb1Var = new pb1(this);
            pb1Var.m168115g(this.playLoop);
            this.audioPlayer = pb1Var;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m117547t(@Nullable jml jmlVar) {
        this.animListener = jmlVar;
    }

    /* JADX INFO: renamed from: u */
    public final void m117548u(int i) {
        this.defaultFps = i;
    }

    /* JADX INFO: renamed from: v */
    public final void m117549v(boolean z) {
        this.isDetachedFromWindow = z;
    }

    /* JADX INFO: renamed from: w */
    public final void m117550w(boolean z) {
        this.enableVersion1 = z;
    }

    /* JADX INFO: renamed from: x */
    public final void m117551x(int i) {
        ahd ahdVar = this.decoder;
        if (ahdVar != null) {
            ahdVar.m96438v(i);
        }
        this.fps = i;
    }

    /* JADX INFO: renamed from: y */
    public final void m117552y(boolean z) {
        this.isMute = z;
    }

    /* JADX INFO: renamed from: z */
    public final void m117553z(int i) {
        ahd ahdVar = this.decoder;
        if (ahdVar != null) {
            ahdVar.m96439w(i);
        }
        pb1 pb1Var = this.audioPlayer;
        if (pb1Var != null) {
            pb1Var.m168115g(i);
        }
        this.playLoop = i;
    }
}
