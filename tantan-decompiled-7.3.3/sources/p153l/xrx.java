package p153l;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.alibaba.fastjson.asm.Opcodes;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.InterfaceC2090y;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.mediacodec.C1908d;
import com.google.android.exoplayer2.mediacodec.InterfaceC1907c;
import com.google.android.exoplayer2.mediacodec.InterfaceC1909e;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.video.MediaCodecVideoDecoderException;
import com.google.android.exoplayer2.video.PlaceholderSurface;
import com.google.common.collect.ImmutableList;
import com.google.firebase.messaging.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.momo.momortc.MMConstants;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import okio.Utf8;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class xrx extends MediaCodecRenderer {

    /* JADX INFO: renamed from: Q1 */
    public static final int[] f195980Q1 = {WBConstants.SDK_NEW_PAY_VERSION, MMConstants.ERR_VCM_UNKNOWN_ERROR, 1440, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK, TXEAudioDef.TXE_OPUS_SAMPLE_NUM, 854, 640, 540, 480};

    /* JADX INFO: renamed from: R1 */
    public static boolean f195981R1;

    /* JADX INFO: renamed from: S1 */
    public static boolean f195982S1;

    /* JADX INFO: renamed from: A1 */
    public long f195983A1;

    /* JADX INFO: renamed from: B1 */
    public long f195984B1;

    /* JADX INFO: renamed from: C1 */
    public int f195985C1;

    /* JADX INFO: renamed from: D1 */
    public int f195986D1;

    /* JADX INFO: renamed from: E1 */
    public int f195987E1;

    /* JADX INFO: renamed from: F1 */
    public long f195988F1;

    /* JADX INFO: renamed from: G1 */
    public long f195989G1;

    /* JADX INFO: renamed from: H1 */
    public long f195990H1;

    /* JADX INFO: renamed from: I1 */
    public int f195991I1;

    /* JADX INFO: renamed from: J1 */
    public long f195992J1;

    /* JADX INFO: renamed from: K1 */
    public zjl0 f195993K1;

    /* JADX INFO: renamed from: L1 */
    @Nullable
    public zjl0 f195994L1;

    /* JADX INFO: renamed from: M1 */
    public boolean f195995M1;

    /* JADX INFO: renamed from: N1 */
    public int f195996N1;

    /* JADX INFO: renamed from: O1 */
    @Nullable
    public C21434c f195997O1;

    /* JADX INFO: renamed from: P1 */
    @Nullable
    public iel0 f195998P1;

    /* JADX INFO: renamed from: i1 */
    public final Context f195999i1;

    /* JADX INFO: renamed from: j1 */
    public final mel0 f196000j1;

    /* JADX INFO: renamed from: k1 */
    public final wjl0.C21131a f196001k1;

    /* JADX INFO: renamed from: l1 */
    public final C21435d f196002l1;

    /* JADX INFO: renamed from: m1 */
    public final long f196003m1;

    /* JADX INFO: renamed from: n1 */
    public final int f196004n1;

    /* JADX INFO: renamed from: o1 */
    public final boolean f196005o1;

    /* JADX INFO: renamed from: p1 */
    public C21433b f196006p1;

    /* JADX INFO: renamed from: q1 */
    public boolean f196007q1;

    /* JADX INFO: renamed from: r1 */
    public boolean f196008r1;

    /* JADX INFO: renamed from: s1 */
    @Nullable
    public Surface f196009s1;

    /* JADX INFO: renamed from: t1 */
    @Nullable
    public PlaceholderSurface f196010t1;

    /* JADX INFO: renamed from: u1 */
    public boolean f196011u1;

    /* JADX INFO: renamed from: v1 */
    public int f196012v1;

    /* JADX INFO: renamed from: w1 */
    public boolean f196013w1;

    /* JADX INFO: renamed from: x1 */
    public boolean f196014x1;

    /* JADX INFO: renamed from: y1 */
    public boolean f196015y1;

    /* JADX INFO: renamed from: z1 */
    public long f196016z1;

    /* JADX INFO: renamed from: l.xrx$a */
    @RequiresApi(26)
    public static final class C21432a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static boolean m212923a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null && display.isHdr()) {
                for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
                    if (i == 1) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: l.xrx$b */
    public static final class C21433b {

        /* JADX INFO: renamed from: a */
        public final int f196017a;

        /* JADX INFO: renamed from: b */
        public final int f196018b;

        /* JADX INFO: renamed from: c */
        public final int f196019c;

        public C21433b(int i, int i2, int i3) {
            this.f196017a = i;
            this.f196018b = i2;
            this.f196019c = i3;
        }
    }

    /* JADX INFO: renamed from: l.xrx$c */
    @RequiresApi(23)
    public final class C21434c implements InterfaceC1907c.c, Handler.Callback {

        /* JADX INFO: renamed from: a */
        public final Handler f196020a;

        public C21434c(InterfaceC1907c interfaceC1907c) {
            Handler handlerM105176x = bmk0.m105176x(this);
            this.f196020a = handlerM105176x;
            interfaceC1907c.mo10536d(this, handlerM105176x);
        }

        @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c.c
        /* JADX INFO: renamed from: a */
        public void mo10546a(InterfaceC1907c interfaceC1907c, long j, long j2) {
            if (bmk0.f77313a >= 30) {
                m212924b(j);
            } else {
                this.f196020a.sendMessageAtFrontOfQueue(Message.obtain(this.f196020a, 0, (int) (j >> 32), (int) j));
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m212924b(long j) {
            xrx xrxVar = xrx.this;
            if (this != xrxVar.f195997O1 || xrxVar.m10469v0() == null) {
                return;
            }
            xrx xrxVar2 = xrx.this;
            if (j == Long.MAX_VALUE) {
                xrxVar2.m212910m2();
                return;
            }
            try {
                xrxVar2.m212909l2(j);
            } catch (ExoPlaybackException e) {
                xrx.this.m10457n1(e);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            m212924b(bmk0.m105146j1(message.arg1, message.arg2));
            return true;
        }
    }

    /* JADX INFO: renamed from: l.xrx$d */
    public static final class C21435d {

        /* JADX INFO: renamed from: a */
        public final mel0 f196022a;

        /* JADX INFO: renamed from: b */
        public final xrx f196023b;

        /* JADX INFO: renamed from: e */
        public Handler f196026e;

        /* JADX INFO: renamed from: f */
        @Nullable
        public jel0 f196027f;

        /* JADX INFO: renamed from: g */
        @Nullable
        public CopyOnWriteArrayList<ype> f196028g;

        /* JADX INFO: renamed from: h */
        @Nullable
        public C1894k f196029h;

        /* JADX INFO: renamed from: i */
        public Pair<Long, C1894k> f196030i;

        /* JADX INFO: renamed from: j */
        @Nullable
        public Pair<Surface, brf0> f196031j;

        /* JADX INFO: renamed from: m */
        public boolean f196034m;

        /* JADX INFO: renamed from: n */
        public boolean f196035n;

        /* JADX INFO: renamed from: o */
        public boolean f196036o;

        /* JADX INFO: renamed from: c */
        public final ArrayDeque<Long> f196024c = new ArrayDeque<>();

        /* JADX INFO: renamed from: d */
        public final ArrayDeque<Pair<Long, C1894k>> f196025d = new ArrayDeque<>();

        /* JADX INFO: renamed from: k */
        public int f196032k = -1;

        /* JADX INFO: renamed from: l */
        public boolean f196033l = true;

        /* JADX INFO: renamed from: p */
        public long f196037p = -9223372036854775807L;

        /* JADX INFO: renamed from: q */
        public zjl0 f196038q = zjl0.f204676e;

        /* JADX INFO: renamed from: r */
        public long f196039r = -9223372036854775807L;

        /* JADX INFO: renamed from: s */
        public long f196040s = -9223372036854775807L;

        /* JADX INFO: renamed from: l.xrx$d$a */
        public class a implements jel0.InterfaceC17936b {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C1894k f196041a;

            public a(C1894k c1894k) {
                this.f196041a = c1894k;
            }
        }

        /* JADX INFO: renamed from: l.xrx$d$b */
        public static final class b {

            /* JADX INFO: renamed from: a */
            public static Constructor<?> f196043a;

            /* JADX INFO: renamed from: b */
            public static Method f196044b;

            /* JADX INFO: renamed from: c */
            public static Method f196045c;

            /* JADX INFO: renamed from: d */
            public static Constructor<?> f196046d;

            /* JADX INFO: renamed from: e */
            public static Method f196047e;

            /* JADX INFO: renamed from: a */
            public static ype m212942a(float f) throws Exception {
                m212944c();
                Object objNewInstance = f196043a.newInstance(null);
                f196044b.invoke(objNewInstance, Float.valueOf(f));
                return (ype) w11.m204369e(f196045c.invoke(objNewInstance, null));
            }

            /* JADX INFO: renamed from: b */
            public static jel0.InterfaceC17935a m212943b() throws Exception {
                m212944c();
                return (jel0.InterfaceC17935a) w11.m204369e(f196047e.invoke(f196046d.newInstance(null), null));
            }

            @EnsuresNonNull({"scaleAndRotateTransformationBuilderConstructor", "setRotationMethod", "buildScaleAndRotateTransformationMethod", "videoFrameProcessorFactoryBuilderConstructor", "buildVideoFrameProcessorFactoryMethod"})
            /* JADX INFO: renamed from: c */
            public static void m212944c() throws Exception {
                if (f196043a == null || f196044b == null || f196045c == null) {
                    Class<?> cls = Class.forName("com.google.android.exoplayer2.effect.ScaleAndRotateTransformation$Builder");
                    f196043a = cls.getConstructor(null);
                    f196044b = cls.getMethod("setRotationDegrees", Float.TYPE);
                    f196045c = cls.getMethod("build", null);
                }
                if (f196046d == null || f196047e == null) {
                    Class<?> cls2 = Class.forName("com.google.android.exoplayer2.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    f196046d = cls2.getConstructor(null);
                    f196047e = cls2.getMethod("build", null);
                }
            }
        }

        public C21435d(mel0 mel0Var, xrx xrxVar) {
            this.f196022a = mel0Var;
            this.f196023b = xrxVar;
        }

        /* JADX INFO: renamed from: a */
        public MediaFormat m212925a(MediaFormat mediaFormat) {
            if (bmk0.f77313a >= 29 && this.f196023b.f195999i1.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
                mediaFormat.setInteger("allow-frame-drop", 0);
            }
            return mediaFormat;
        }

        /* JADX INFO: renamed from: b */
        public void m212926b() {
            ((jel0) w11.m204369e(this.f196027f)).m144593a(null);
            this.f196031j = null;
        }

        /* JADX INFO: renamed from: c */
        public void m212927c() {
            w11.m204373i(this.f196027f);
            this.f196027f.flush();
            this.f196024c.clear();
            this.f196026e.removeCallbacksAndMessages(null);
            if (this.f196034m) {
                this.f196034m = false;
                this.f196035n = false;
                this.f196036o = false;
            }
        }

        /* JADX INFO: renamed from: d */
        public long m212928d(long j, long j2) {
            w11.m204371g(this.f196040s != -9223372036854775807L);
            return (j + j2) - this.f196040s;
        }

        /* JADX INFO: renamed from: e */
        public Surface m212929e() {
            return ((jel0) w11.m204369e(this.f196027f)).m144594b();
        }

        /* JADX INFO: renamed from: f */
        public boolean m212930f() {
            return this.f196027f != null;
        }

        /* JADX INFO: renamed from: g */
        public boolean m212931g() {
            Pair<Surface, brf0> pair = this.f196031j;
            return pair == null || !((brf0) pair.second).equals(brf0.f78020c);
        }

        /* JADX INFO: renamed from: h */
        public boolean m212932h(C1894k c1894k, long j) throws ExoPlaybackException {
            int i;
            w11.m204371g(!m212930f());
            if (!this.f196033l) {
                return false;
            }
            if (this.f196028g == null) {
                this.f196033l = false;
                return false;
            }
            this.f196026e = bmk0.m105174w();
            Pair<df5, df5> pairM212898T1 = this.f196023b.m212898T1(c1894k.f7797x);
            try {
                if (!xrx.m212876N1() && (i = c1894k.f7793t) != 0) {
                    this.f196028g.add(0, b.m212942a(i));
                }
                jel0.InterfaceC17935a interfaceC17935aM212943b = b.m212943b();
                Context context = this.f196023b.f195999i1;
                List<ype> list = (List) w11.m204369e(this.f196028g);
                qhd qhdVar = qhd.f157665a;
                df5 df5Var = (df5) pairM212898T1.first;
                df5 df5Var2 = (df5) pairM212898T1.second;
                Handler handler = this.f196026e;
                Objects.requireNonNull(handler);
                jel0 jel0VarM144600a = interfaceC17935aM212943b.m144600a(context, list, qhdVar, df5Var, df5Var2, false, new mmd(handler), new a(c1894k));
                this.f196027f = jel0VarM144600a;
                jel0VarM144600a.m144595c(1);
                this.f196040s = j;
                Pair<Surface, brf0> pair = this.f196031j;
                if (pair != null) {
                    brf0 brf0Var = (brf0) pair.second;
                    this.f196027f.m144593a(new cah0((Surface) pair.first, brf0Var.m106135b(), brf0Var.m106134a()));
                }
                m212939o(c1894k);
                return true;
            } catch (Exception e) {
                throw this.f196023b.m9816D(e, c1894k, PlaybackException.ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED);
            }
        }

        /* JADX INFO: renamed from: i */
        public boolean m212933i(C1894k c1894k, long j, boolean z) {
            w11.m204373i(this.f196027f);
            w11.m204371g(this.f196032k != -1);
            if (this.f196027f.m144599g() >= this.f196032k) {
                return false;
            }
            this.f196027f.m144598f();
            Pair<Long, C1894k> pair = this.f196030i;
            if (pair == null) {
                this.f196030i = Pair.create(Long.valueOf(j), c1894k);
            } else if (!bmk0.m105123c(c1894k, pair.second)) {
                this.f196025d.add(Pair.create(Long.valueOf(j), c1894k));
            }
            if (z) {
                this.f196034m = true;
                this.f196037p = j;
            }
            return true;
        }

        /* JADX INFO: renamed from: j */
        public void m212934j(String str) {
            this.f196032k = bmk0.m105124c0(this.f196023b.f195999i1, str, false);
        }

        /* JADX INFO: renamed from: k */
        public final void m212935k(long j, boolean z) {
            w11.m204373i(this.f196027f);
            this.f196027f.m144597e(j);
            this.f196024c.remove();
            this.f196023b.f195989G1 = SystemClock.elapsedRealtime() * 1000;
            if (j != -2) {
                this.f196023b.m212903f2();
            }
            if (z) {
                this.f196036o = true;
            }
        }

        /* JADX INFO: renamed from: l */
        public void m212936l(long j, long j2) {
            w11.m204373i(this.f196027f);
            while (!this.f196024c.isEmpty()) {
                boolean z = false;
                boolean z2 = this.f196023b.getState() == 2;
                long jLongValue = ((Long) w11.m204369e(this.f196024c.peek())).longValue();
                long j3 = jLongValue + this.f196040s;
                long jM212893K1 = this.f196023b.m212893K1(j, j2, SystemClock.elapsedRealtime() * 1000, j3, z2);
                if (this.f196035n && this.f196024c.size() == 1) {
                    z = true;
                }
                if (this.f196023b.m212920x2(j, jM212893K1)) {
                    m212935k(-1L, z);
                    return;
                }
                if (!z2 || j == this.f196023b.f196016z1 || jM212893K1 > 50000) {
                    return;
                }
                this.f196022a.m158041h(j3);
                long jM158038b = this.f196022a.m158038b(System.nanoTime() + (jM212893K1 * 1000));
                if (this.f196023b.m212919w2((jM158038b - System.nanoTime()) / 1000, j2, z)) {
                    m212935k(-2L, z);
                } else {
                    if (!this.f196025d.isEmpty() && j3 > ((Long) this.f196025d.peek().first).longValue()) {
                        this.f196030i = this.f196025d.remove();
                    }
                    this.f196023b.m212908k2(jLongValue, jM158038b, (C1894k) this.f196030i.second);
                    if (this.f196039r >= j3) {
                        this.f196039r = -9223372036854775807L;
                        this.f196023b.m212905h2(this.f196038q);
                    }
                    m212935k(jM158038b, z);
                }
            }
        }

        /* JADX INFO: renamed from: m */
        public boolean m212937m() {
            return this.f196036o;
        }

        /* JADX INFO: renamed from: n */
        public void m212938n() {
            ((jel0) w11.m204369e(this.f196027f)).release();
            this.f196027f = null;
            Handler handler = this.f196026e;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            CopyOnWriteArrayList<ype> copyOnWriteArrayList = this.f196028g;
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.clear();
            }
            this.f196024c.clear();
            this.f196033l = true;
        }

        /* JADX INFO: renamed from: o */
        public void m212939o(C1894k c1894k) {
            ((jel0) w11.m204369e(this.f196027f)).m144596d(new p6j.C19308b(c1894k.f7790q, c1894k.f7791r).m170911b(c1894k.f7794u).m170910a());
            this.f196029h = c1894k;
            if (this.f196034m) {
                this.f196034m = false;
                this.f196035n = false;
                this.f196036o = false;
            }
        }

        /* JADX INFO: renamed from: p */
        public void m212940p(Surface surface, brf0 brf0Var) {
            Pair<Surface, brf0> pair = this.f196031j;
            if (pair != null && ((Surface) pair.first).equals(surface) && ((brf0) this.f196031j.second).equals(brf0Var)) {
                return;
            }
            this.f196031j = Pair.create(surface, brf0Var);
            if (m212930f()) {
                ((jel0) w11.m204369e(this.f196027f)).m144593a(new cah0(surface, brf0Var.m106135b(), brf0Var.m106134a()));
            }
        }

        /* JADX INFO: renamed from: q */
        public void m212941q(List<ype> list) {
            CopyOnWriteArrayList<ype> copyOnWriteArrayList = this.f196028g;
            if (copyOnWriteArrayList == null) {
                this.f196028g = new CopyOnWriteArrayList<>(list);
            } else {
                copyOnWriteArrayList.clear();
                this.f196028g.addAll(list);
            }
        }
    }

    public xrx(Context context, InterfaceC1907c.b bVar, InterfaceC1909e interfaceC1909e, long j, boolean z, @Nullable Handler handler, @Nullable wjl0 wjl0Var, int i, float f) {
        super(2, bVar, interfaceC1909e, z, f);
        this.f196003m1 = j;
        this.f196004n1 = i;
        Context applicationContext = context.getApplicationContext();
        this.f195999i1 = applicationContext;
        mel0 mel0Var = new mel0(applicationContext);
        this.f196000j1 = mel0Var;
        this.f196001k1 = new wjl0.C21131a(handler, wjl0Var);
        this.f196002l1 = new C21435d(mel0Var, this);
        this.f196005o1 = m212878Q1();
        this.f195983A1 = -9223372036854775807L;
        this.f196012v1 = 1;
        this.f195993K1 = zjl0.f204676e;
        this.f195996N1 = 0;
        m212895M1();
    }

    /* JADX INFO: renamed from: N1 */
    public static boolean m212876N1() {
        return bmk0.f77313a >= 21;
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: P1 */
    public static void m212877P1(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    /* JADX INFO: renamed from: Q1 */
    public static boolean m212878Q1() {
        return "NVIDIA".equals(bmk0.f77315c);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: S1 */
    public static boolean m212879S1() {
        int i = bmk0.f77313a;
        byte b = 7;
        if (i <= 28) {
            String str = bmk0.f77314b;
            str.getClass();
            switch (str) {
                case "dangal":
                case "dangalFHD":
                case "dangalUHD":
                case "oneday":
                case "aquaman":
                case "magnolia":
                case "once":
                case "machuca":
                    return true;
            }
        }
        if (i <= 27 && "HWEML".equals(bmk0.f77314b)) {
            return true;
        }
        String str2 = bmk0.f77316d;
        str2.getClass();
        switch (str2) {
            case "AFTJMST12":
            case "AFTKMST12":
            case "AFTA":
            case "AFTN":
            case "AFTR":
            case "AFTEU011":
            case "AFTEU014":
            case "AFTSO001":
            case "AFTEUFF014":
                return true;
            default:
                if (i <= 26) {
                    String str3 = bmk0.f77314b;
                    str3.getClass();
                    switch (str3.hashCode()) {
                        case -2144781245:
                            b = !str3.equals("GIONEE_SWW1609") ? (byte) -1 : (byte) 0;
                            break;
                        case -2144781185:
                            b = !str3.equals("GIONEE_SWW1627") ? (byte) -1 : (byte) 1;
                            break;
                        case -2144781160:
                            b = !str3.equals("GIONEE_SWW1631") ? (byte) -1 : (byte) 2;
                            break;
                        case -2097309513:
                            b = !str3.equals("K50a40") ? (byte) -1 : (byte) 3;
                            break;
                        case -2022874474:
                            b = !str3.equals("CP8676_I02") ? (byte) -1 : (byte) 4;
                            break;
                        case -1978993182:
                            b = !str3.equals("NX541J") ? (byte) -1 : (byte) 5;
                            break;
                        case -1978990237:
                            b = !str3.equals("NX573J") ? (byte) -1 : (byte) 6;
                            break;
                        case -1936688988:
                            if (!str3.equals("PGN528")) {
                                b = -1;
                            }
                            break;
                        case -1936688066:
                            b = !str3.equals("PGN610") ? (byte) -1 : (byte) 8;
                            break;
                        case -1936688065:
                            b = !str3.equals("PGN611") ? (byte) -1 : (byte) 9;
                            break;
                        case -1931988508:
                            b = !str3.equals("AquaPowerM") ? (byte) -1 : (byte) 10;
                            break;
                        case -1885099851:
                            b = !str3.equals("RAIJIN") ? (byte) -1 : (byte) 11;
                            break;
                        case -1696512866:
                            b = !str3.equals("XT1663") ? (byte) -1 : (byte) 12;
                            break;
                        case -1680025915:
                            b = !str3.equals("ComioS1") ? (byte) -1 : HttpTokens.CARRIAGE_RETURN;
                            break;
                        case -1615810839:
                            b = !str3.equals("Phantom6") ? (byte) -1 : (byte) 14;
                            break;
                        case -1600724499:
                            b = !str3.equals("pacificrim") ? (byte) -1 : (byte) 15;
                            break;
                        case -1554255044:
                            b = !str3.equals("vernee_M5") ? (byte) -1 : Tnaf.POW_2_WIDTH;
                            break;
                        case -1481772737:
                            b = !str3.equals("panell_dl") ? (byte) -1 : (byte) 17;
                            break;
                        case -1481772730:
                            b = !str3.equals("panell_ds") ? (byte) -1 : (byte) 18;
                            break;
                        case -1481772729:
                            b = !str3.equals("panell_dt") ? (byte) -1 : (byte) 19;
                            break;
                        case -1320080169:
                            b = !str3.equals("GiONEE_GBL7319") ? (byte) -1 : (byte) 20;
                            break;
                        case -1217592143:
                            b = !str3.equals("BRAVIA_ATV2") ? (byte) -1 : (byte) 21;
                            break;
                        case -1180384755:
                            b = !str3.equals("iris60") ? (byte) -1 : (byte) 22;
                            break;
                        case -1139198265:
                            b = !str3.equals("Slate_Pro") ? (byte) -1 : (byte) 23;
                            break;
                        case -1052835013:
                            b = !str3.equals("namath") ? (byte) -1 : (byte) 24;
                            break;
                        case -993250464:
                            b = !str3.equals("A10-70F") ? (byte) -1 : (byte) 25;
                            break;
                        case -993250458:
                            b = !str3.equals("A10-70L") ? (byte) -1 : (byte) 26;
                            break;
                        case -965403638:
                            b = !str3.equals("s905x018") ? (byte) -1 : (byte) 27;
                            break;
                        case -958336948:
                            b = !str3.equals("ELUGA_Ray_X") ? (byte) -1 : (byte) 28;
                            break;
                        case -879245230:
                            b = !str3.equals("tcl_eu") ? (byte) -1 : (byte) 29;
                            break;
                        case -842500323:
                            b = !str3.equals("nicklaus_f") ? (byte) -1 : (byte) 30;
                            break;
                        case -821392978:
                            b = !str3.equals("A7000-a") ? (byte) -1 : (byte) 31;
                            break;
                        case -797483286:
                            b = !str3.equals("SVP-DTV15") ? (byte) -1 : HttpTokens.SPACE;
                            break;
                        case -794946968:
                            b = !str3.equals("watson") ? (byte) -1 : (byte) 33;
                            break;
                        case -788334647:
                            b = !str3.equals("whyred") ? (byte) -1 : (byte) 34;
                            break;
                        case -782144577:
                            b = !str3.equals("OnePlus5T") ? (byte) -1 : (byte) 35;
                            break;
                        case -575125681:
                            b = !str3.equals("GiONEE_CBL7513") ? (byte) -1 : (byte) 36;
                            break;
                        case -521118391:
                            b = !str3.equals("GIONEE_GBL7360") ? (byte) -1 : (byte) 37;
                            break;
                        case -430914369:
                            b = !str3.equals("Pixi4-7_3G") ? (byte) -1 : (byte) 38;
                            break;
                        case -290434366:
                            b = !str3.equals("taido_row") ? (byte) -1 : (byte) 39;
                            break;
                        case -282781963:
                            b = !str3.equals("BLACK-1X") ? (byte) -1 : (byte) 40;
                            break;
                        case -277133239:
                            b = !str3.equals("Z12_PRO") ? (byte) -1 : (byte) 41;
                            break;
                        case -173639913:
                            b = !str3.equals("ELUGA_A3_Pro") ? (byte) -1 : (byte) 42;
                            break;
                        case -56598463:
                            b = !str3.equals("woods_fn") ? (byte) -1 : (byte) 43;
                            break;
                        case 2126:
                            b = !str3.equals("C1") ? (byte) -1 : (byte) 44;
                            break;
                        case 2564:
                            b = !str3.equals("Q5") ? (byte) -1 : (byte) 45;
                            break;
                        case 2715:
                            b = !str3.equals("V1") ? (byte) -1 : (byte) 46;
                            break;
                        case 2719:
                            b = !str3.equals("V5") ? (byte) -1 : (byte) 47;
                            break;
                        case 3091:
                            b = !str3.equals("b5") ? (byte) -1 : (byte) 48;
                            break;
                        case 3483:
                            b = !str3.equals("mh") ? (byte) -1 : (byte) 49;
                            break;
                        case 73405:
                            b = !str3.equals("JGZ") ? (byte) -1 : (byte) 50;
                            break;
                        case 75537:
                            b = !str3.equals("M04") ? (byte) -1 : (byte) 51;
                            break;
                        case 75739:
                            b = !str3.equals("M5c") ? (byte) -1 : (byte) 52;
                            break;
                        case 76779:
                            b = !str3.equals("MX6") ? (byte) -1 : (byte) 53;
                            break;
                        case 78669:
                            b = !str3.equals("P85") ? (byte) -1 : (byte) 54;
                            break;
                        case 79305:
                            b = !str3.equals("PLE") ? (byte) -1 : (byte) 55;
                            break;
                        case 80618:
                            b = !str3.equals("QX1") ? (byte) -1 : (byte) 56;
                            break;
                        case 88274:
                            b = !str3.equals("Z80") ? (byte) -1 : (byte) 57;
                            break;
                        case 98846:
                            b = !str3.equals("cv1") ? (byte) -1 : HttpTokens.COLON;
                            break;
                        case 98848:
                            b = !str3.equals("cv3") ? (byte) -1 : HttpTokens.SEMI_COLON;
                            break;
                        case 99329:
                            b = !str3.equals("deb") ? (byte) -1 : (byte) 60;
                            break;
                        case 101481:
                            b = !str3.equals("flo") ? (byte) -1 : (byte) 61;
                            break;
                        case 1513190:
                            b = !str3.equals("1601") ? (byte) -1 : (byte) 62;
                            break;
                        case 1514184:
                            b = !str3.equals("1713") ? (byte) -1 : Utf8.REPLACEMENT_BYTE;
                            break;
                        case 1514185:
                            b = !str3.equals("1714") ? (byte) -1 : (byte) 64;
                            break;
                        case 2133089:
                            b = !str3.equals("F01H") ? (byte) -1 : (byte) 65;
                            break;
                        case 2133091:
                            b = !str3.equals("F01J") ? (byte) -1 : (byte) 66;
                            break;
                        case 2133120:
                            b = !str3.equals("F02H") ? (byte) -1 : (byte) 67;
                            break;
                        case 2133151:
                            b = !str3.equals("F03H") ? (byte) -1 : (byte) 68;
                            break;
                        case 2133182:
                            b = !str3.equals("F04H") ? (byte) -1 : (byte) 69;
                            break;
                        case 2133184:
                            b = !str3.equals("F04J") ? (byte) -1 : (byte) 70;
                            break;
                        case 2436959:
                            b = !str3.equals("P681") ? (byte) -1 : (byte) 71;
                            break;
                        case 2463773:
                            b = !str3.equals("Q350") ? (byte) -1 : (byte) 72;
                            break;
                        case 2464648:
                            b = !str3.equals("Q427") ? (byte) -1 : (byte) 73;
                            break;
                        case 2689555:
                            b = !str3.equals("XE2X") ? (byte) -1 : (byte) 74;
                            break;
                        case 3154429:
                            b = !str3.equals("fugu") ? (byte) -1 : (byte) 75;
                            break;
                        case 3284551:
                            b = !str3.equals("kate") ? (byte) -1 : (byte) 76;
                            break;
                        case 3351335:
                            b = !str3.equals("mido") ? (byte) -1 : (byte) 77;
                            break;
                        case 3386211:
                            b = !str3.equals("p212") ? (byte) -1 : (byte) 78;
                            break;
                        case 41325051:
                            b = !str3.equals("MEIZU_M5") ? (byte) -1 : (byte) 79;
                            break;
                        case 51349633:
                            b = !str3.equals("601LV") ? (byte) -1 : (byte) 80;
                            break;
                        case 51350594:
                            b = !str3.equals("602LV") ? (byte) -1 : (byte) 81;
                            break;
                        case 55178625:
                            b = !str3.equals("Aura_Note_2") ? (byte) -1 : (byte) 82;
                            break;
                        case 61542055:
                            b = !str3.equals("A1601") ? (byte) -1 : (byte) 83;
                            break;
                        case 65355429:
                            b = !str3.equals("E5643") ? (byte) -1 : (byte) 84;
                            break;
                        case 66214468:
                            b = !str3.equals("F3111") ? (byte) -1 : (byte) 85;
                            break;
                        case 66214470:
                            b = !str3.equals("F3113") ? (byte) -1 : (byte) 86;
                            break;
                        case 66214473:
                            b = !str3.equals("F3116") ? (byte) -1 : (byte) 87;
                            break;
                        case 66215429:
                            b = !str3.equals("F3211") ? (byte) -1 : (byte) 88;
                            break;
                        case 66215431:
                            b = !str3.equals("F3213") ? (byte) -1 : (byte) 89;
                            break;
                        case 66215433:
                            b = !str3.equals("F3215") ? (byte) -1 : (byte) 90;
                            break;
                        case 66216390:
                            b = !str3.equals("F3311") ? (byte) -1 : (byte) 91;
                            break;
                        case 76402249:
                            b = !str3.equals("PRO7S") ? (byte) -1 : (byte) 92;
                            break;
                        case 76404105:
                            b = !str3.equals("Q4260") ? (byte) -1 : (byte) 93;
                            break;
                        case 76404911:
                            b = !str3.equals("Q4310") ? (byte) -1 : (byte) 94;
                            break;
                        case 80963634:
                            b = !str3.equals("V23GB") ? (byte) -1 : (byte) 95;
                            break;
                        case 82882791:
                            b = !str3.equals("X3_HK") ? (byte) -1 : (byte) 96;
                            break;
                        case 98715550:
                            b = !str3.equals("i9031") ? (byte) -1 : (byte) 97;
                            break;
                        case 101370885:
                            b = !str3.equals("l5460") ? (byte) -1 : (byte) 98;
                            break;
                        case 102844228:
                            b = !str3.equals("le_x6") ? (byte) -1 : (byte) 99;
                            break;
                        case 165221241:
                            b = !str3.equals("A2016a40") ? (byte) -1 : (byte) 100;
                            break;
                        case 182191441:
                            b = !str3.equals("CPY83_I00") ? (byte) -1 : (byte) 101;
                            break;
                        case 245388979:
                            b = !str3.equals("marino_f") ? (byte) -1 : (byte) 102;
                            break;
                        case 287431619:
                            b = !str3.equals("griffin") ? (byte) -1 : (byte) 103;
                            break;
                        case 307593612:
                            b = !str3.equals("A7010a48") ? (byte) -1 : (byte) 104;
                            break;
                        case 308517133:
                            b = !str3.equals("A7020a48") ? (byte) -1 : (byte) 105;
                            break;
                        case 316215098:
                            b = !str3.equals("TB3-730F") ? (byte) -1 : (byte) 106;
                            break;
                        case 316215116:
                            b = !str3.equals("TB3-730X") ? (byte) -1 : (byte) 107;
                            break;
                        case 316246811:
                            b = !str3.equals("TB3-850F") ? (byte) -1 : (byte) 108;
                            break;
                        case 316246818:
                            b = !str3.equals("TB3-850M") ? (byte) -1 : (byte) 109;
                            break;
                        case 407160593:
                            b = !str3.equals("Pixi5-10_4G") ? (byte) -1 : (byte) 110;
                            break;
                        case 507412548:
                            b = !str3.equals("QM16XE_U") ? (byte) -1 : (byte) 111;
                            break;
                        case 793982701:
                            b = !str3.equals("GIONEE_WBL5708") ? (byte) -1 : (byte) 112;
                            break;
                        case 794038622:
                            b = !str3.equals("GIONEE_WBL7365") ? (byte) -1 : (byte) 113;
                            break;
                        case 794040393:
                            b = !str3.equals("GIONEE_WBL7519") ? (byte) -1 : (byte) 114;
                            break;
                        case 835649806:
                            b = !str3.equals("manning") ? (byte) -1 : (byte) 115;
                            break;
                        case 917340916:
                            b = !str3.equals("A7000plus") ? (byte) -1 : (byte) 116;
                            break;
                        case 958008161:
                            b = !str3.equals("j2xlteins") ? (byte) -1 : (byte) 117;
                            break;
                        case 1060579533:
                            b = !str3.equals("panell_d") ? (byte) -1 : (byte) 118;
                            break;
                        case 1150207623:
                            b = !str3.equals("LS-5017") ? (byte) -1 : (byte) 119;
                            break;
                        case 1176899427:
                            b = !str3.equals("itel_S41") ? (byte) -1 : (byte) 120;
                            break;
                        case 1280332038:
                            b = !str3.equals("hwALE-H") ? (byte) -1 : (byte) 121;
                            break;
                        case 1306947716:
                            b = !str3.equals("EverStar_S") ? (byte) -1 : (byte) 122;
                            break;
                        case 1349174697:
                            b = !str3.equals("htc_e56ml_dtul") ? (byte) -1 : (byte) 123;
                            break;
                        case 1522194893:
                            b = !str3.equals("woods_f") ? (byte) -1 : (byte) 124;
                            break;
                        case 1691543273:
                            b = !str3.equals("CPH1609") ? (byte) -1 : (byte) 125;
                            break;
                        case 1691544261:
                            b = !str3.equals("CPH1715") ? (byte) -1 : (byte) 126;
                            break;
                        case 1709443163:
                            b = !str3.equals("iball8735_9806") ? (byte) -1 : (byte) 127;
                            break;
                        case 1865889110:
                            b = !str3.equals("santoni") ? (byte) -1 : (byte) 128;
                            break;
                        case 1906253259:
                            b = !str3.equals("PB2-670M") ? (byte) -1 : (byte) 129;
                            break;
                        case 1977196784:
                            b = !str3.equals("Infinix-X572") ? (byte) -1 : (byte) 130;
                            break;
                        case 2006372676:
                            b = !str3.equals("BRAVIA_ATV3_4K") ? (byte) -1 : (byte) 131;
                            break;
                        case 2019281702:
                            b = !str3.equals("DM-01K") ? (byte) -1 : (byte) 132;
                            break;
                        case 2029784656:
                            b = !str3.equals("HWBLN-H") ? (byte) -1 : (byte) 133;
                            break;
                        case 2030379515:
                            b = !str3.equals("HWCAM-H") ? (byte) -1 : (byte) 134;
                            break;
                        case 2033393791:
                            b = !str3.equals("ASUS_X00AD_2") ? (byte) -1 : (byte) 135;
                            break;
                        case 2047190025:
                            b = !str3.equals("ELUGA_Note") ? (byte) -1 : (byte) 136;
                            break;
                        case 2047252157:
                            b = !str3.equals("ELUGA_Prim") ? (byte) -1 : (byte) 137;
                            break;
                        case 2048319463:
                            b = !str3.equals("HWVNS-H") ? (byte) -1 : (byte) 138;
                            break;
                        case 2048855701:
                            b = !str3.equals("HWWAS-H") ? (byte) -1 : (byte) 139;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        default:
                            str2.getClass();
                            if (!str2.equals("JSN-L21")) {
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE /* 73 */:
                        case 74:
                        case 75:
                        case 76:
                        case 77:
                        case 78:
                        case 79:
                        case 80:
                        case EACTags.FILE_REFERENCE /* 81 */:
                        case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        case EACTags.DISCRETIONARY_DATA /* 83 */:
                        case EACTags.OFFSET_DATA_OBJECT /* 84 */:
                        case 85:
                        case EACTags.TRACK1_APPLICATION /* 86 */:
                        case 87:
                        case 88:
                        case 89:
                        case 90:
                        case EACTags.NAME /* 91 */:
                        case EACTags.TAG_LIST /* 92 */:
                        case EACTags.HEADER_LIST /* 93 */:
                        case EACTags.LOGIN_DATA /* 94 */:
                        case 95:
                        case Opcodes.IADD /* 96 */:
                        case EACTags.APPLICATION_TEMPLATE /* 97 */:
                        case EACTags.FCP_TEMPLATE /* 98 */:
                        case 99:
                        case 100:
                        case 101:
                        case 102:
                        case 103:
                        case 104:
                        case 105:
                        case 106:
                        case 107:
                        case 108:
                        case 109:
                        case 110:
                        case 111:
                        case 112:
                        case 113:
                        case 114:
                        case 115:
                        case 116:
                        case 117:
                        case 118:
                        case 119:
                        case 120:
                        case 121:
                        case 122:
                        case 123:
                        case 124:
                        case 125:
                        case 126:
                        case 127:
                        case 128:
                        case MMConstants.ERR_WATERMARK_READ /* 129 */:
                        case 130:
                        case 131:
                        case CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA /* 132 */:
                        case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA /* 133 */:
                        case 134:
                        case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA /* 135 */:
                        case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA /* 136 */:
                        case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA /* 137 */:
                        case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                        case CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA /* 139 */:
                            return true;
                    }
                }
                return false;
        }
    }

    /* JADX INFO: renamed from: U1 */
    public static int m212880U1(C1908d c1908d, C1894k c1894k) {
        int iIntValue;
        int i = c1894k.f7790q;
        int i2 = c1894k.f7791r;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        String str = c1894k.f7785l;
        if ("video/dolby-vision".equals(str)) {
            Pair<Integer, Integer> pairM10510r = MediaCodecUtil.m10510r(c1894k);
            str = (pairM10510r == null || !((iIntValue = ((Integer) pairM10510r.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : YtVideoEncoder.MIME_TYPE;
        }
        str.getClass();
        switch (str) {
            case "video/3gpp":
            case "video/av01":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                return m212884Z1(i * i2, 2);
            case "video/hevc":
                return Math.max(2097152, m212884Z1(i * i2, 2));
            case "video/avc":
                String str2 = bmk0.f77316d;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(bmk0.f77315c) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && c1908d.f7942g)))) {
                    return -1;
                }
                return m212884Z1(bmk0.m105150l(i, 16) * bmk0.m105150l(i2, 16) * 256, 2);
            case "video/x-vnd.on2.vp9":
                return m212884Z1(i * i2, 4);
            default:
                return -1;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: V1 */
    public static Point m212881V1(C1908d c1908d, C1894k c1894k) {
        int i = c1894k.f7791r;
        int i2 = c1894k.f7790q;
        boolean z = i > i2;
        int i3 = z ? i : i2;
        if (z) {
            i = i2;
        }
        float f = i / i3;
        for (int i4 : f195980Q1) {
            int i5 = (int) (i4 * f);
            if (i4 <= i3 || i5 <= i) {
                break;
            }
            if (bmk0.f77313a >= 21) {
                int i6 = z ? i5 : i4;
                if (!z) {
                    i4 = i5;
                }
                Point pointM10565c = c1908d.m10565c(i6, i4);
                if (c1908d.m10576w(pointM10565c.x, pointM10565c.y, c1894k.f7792s)) {
                    return pointM10565c;
                }
            } else {
                try {
                    int iM105150l = bmk0.m105150l(i4, 16) * 16;
                    int iM105150l2 = bmk0.m105150l(i5, 16) * 16;
                    if (iM105150l * iM105150l2 <= MediaCodecUtil.m10488L()) {
                        int i7 = z ? iM105150l2 : iM105150l;
                        if (!z) {
                            iM105150l = iM105150l2;
                        }
                        return new Point(i7, iM105150l);
                    }
                } catch (MediaCodecUtil.DecoderQueryException unused) {
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: X1 */
    public static List<C1908d> m212882X1(Context context, InterfaceC1909e interfaceC1909e, C1894k c1894k, boolean z, boolean z2) throws MediaCodecUtil.DecoderQueryException {
        String str = c1894k.f7785l;
        if (str == null) {
            return ImmutableList.m15739of();
        }
        if (bmk0.f77313a >= 26 && "video/dolby-vision".equals(str) && !C21432a.m212923a(context)) {
            List<C1908d> listM10506n = MediaCodecUtil.m10506n(interfaceC1909e, c1894k, z, z2);
            if (!listM10506n.isEmpty()) {
                return listM10506n;
            }
        }
        return MediaCodecUtil.m10514v(interfaceC1909e, c1894k, z, z2);
    }

    /* JADX INFO: renamed from: Y1 */
    public static int m212883Y1(C1908d c1908d, C1894k c1894k) {
        if (c1894k.f7786m == -1) {
            return m212880U1(c1908d, c1894k);
        }
        int size = c1894k.f7787n.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += c1894k.f7787n.get(i).length;
        }
        return c1894k.f7786m + length;
    }

    /* JADX INFO: renamed from: Z1 */
    public static int m212884Z1(int i, int i2) {
        return (i * 3) / (i2 * 2);
    }

    /* JADX INFO: renamed from: b2 */
    public static boolean m212885b2(long j) {
        return j < -30000;
    }

    /* JADX INFO: renamed from: c2 */
    public static boolean m212886c2(long j) {
        return j < -500000;
    }

    @RequiresApi(29)
    /* JADX INFO: renamed from: r2 */
    public static void m212887r2(InterfaceC1907c interfaceC1907c, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        interfaceC1907c.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.InterfaceC2089x
    /* JADX INFO: renamed from: A */
    public void mo10422A(float f, float f2) throws ExoPlaybackException {
        super.mo10422A(f, f2);
        this.f196000j1.m158042i(f);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: A0 */
    public List<C1908d> mo9684A0(InterfaceC1909e interfaceC1909e, C1894k c1894k, boolean z) throws MediaCodecUtil.DecoderQueryException {
        return MediaCodecUtil.m10515w(m212882X1(this.f195999i1, interfaceC1909e, c1894k, z, this.f195995M1), c1894k);
    }

    /* JADX INFO: renamed from: A2 */
    public void m212890A2(InterfaceC1907c interfaceC1907c, int i, long j) {
        nej0.m162903a("skipVideoBuffer");
        interfaceC1907c.releaseOutputBuffer(i, false);
        nej0.m162905c();
        this.f7889d1.f121068f++;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @TargetApi(17)
    /* JADX INFO: renamed from: B0 */
    public InterfaceC1907c.a mo9685B0(C1908d c1908d, C1894k c1894k, @Nullable MediaCrypto mediaCrypto, float f) {
        PlaceholderSurface placeholderSurface = this.f196010t1;
        if (placeholderSurface != null && placeholderSurface.secure != c1908d.f7942g) {
            m212911n2();
        }
        String str = c1908d.f7938c;
        C21433b c21433bM212899W1 = m212899W1(c1908d, c1894k, m9822J());
        this.f196006p1 = c21433bM212899W1;
        MediaFormat mediaFormatM212900a2 = m212900a2(c1894k, str, c21433bM212899W1, f, this.f196005o1, this.f195995M1 ? this.f195996N1 : 0);
        if (this.f196009s1 == null) {
            if (!m212922z2(c1908d)) {
                wpg0.m207458a();
                return null;
            }
            if (this.f196010t1 == null) {
                this.f196010t1 = PlaceholderSurface.m12233c(this.f195999i1, c1908d.f7942g);
            }
            this.f196009s1 = this.f196010t1;
        }
        if (this.f196002l1.m212930f()) {
            mediaFormatM212900a2 = this.f196002l1.m212925a(mediaFormatM212900a2);
        }
        return InterfaceC1907c.a.m10545b(c1908d, mediaFormatM212900a2, c1894k, this.f196002l1.m212930f() ? this.f196002l1.m212929e() : this.f196009s1, mediaCrypto);
    }

    /* JADX INFO: renamed from: B2 */
    public void m212891B2(int i, int i2) {
        jid jidVar = this.f7889d1;
        jidVar.f121070h += i;
        int i3 = i + i2;
        jidVar.f121069g += i3;
        this.f195985C1 += i3;
        int i4 = this.f195986D1 + i3;
        this.f195986D1 = i4;
        jidVar.f121071i = Math.max(i4, jidVar.f121071i);
        int i5 = this.f196004n1;
        if (i5 <= 0 || this.f195985C1 < i5) {
            return;
        }
        m212902e2();
    }

    /* JADX INFO: renamed from: C2 */
    public void m212892C2(long j) {
        this.f7889d1.m144976a(j);
        this.f195990H1 += j;
        this.f195991I1++;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @TargetApi(29)
    /* JADX INFO: renamed from: E0 */
    public void mo10425E0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        if (this.f196008r1) {
            ByteBuffer byteBuffer = (ByteBuffer) w11.m204369e(decoderInputBuffer.f7415f);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        m212887r2(m10469v0(), bArr);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: K1 */
    public final long m212893K1(long j, long j2, long j3, long j4, boolean z) {
        long jM10424D0 = (long) ((j4 - j) / ((double) m10424D0()));
        return z ? jM10424D0 - (j3 - j2) : jM10424D0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC1860d
    /* JADX INFO: renamed from: L */
    public void mo9690L() {
        m212895M1();
        m212894L1();
        this.f196011u1 = false;
        this.f195997O1 = null;
        try {
            super.mo9690L();
        } finally {
            this.f196001k1.m206704m(this.f7889d1);
            this.f196001k1.m206711t(zjl0.f204676e);
        }
    }

    /* JADX INFO: renamed from: L1 */
    public final void m212894L1() {
        InterfaceC1907c interfaceC1907cM10469v0;
        this.f196013w1 = false;
        if (bmk0.f77313a < 23 || !this.f195995M1 || (interfaceC1907cM10469v0 = m10469v0()) == null) {
            return;
        }
        this.f195997O1 = new C21434c(interfaceC1907cM10469v0);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC1860d
    /* JADX INFO: renamed from: M */
    public void mo9691M(boolean z, boolean z2) throws ExoPlaybackException {
        super.mo9691M(z, z2);
        boolean z3 = m9818F().f123255a;
        w11.m204371g((z3 && this.f195996N1 == 0) ? false : true);
        if (this.f195995M1 != z3) {
            this.f195995M1 = z3;
            m10443e1();
        }
        this.f196001k1.m206706o(this.f7889d1);
        this.f196014x1 = z2;
        this.f196015y1 = false;
    }

    /* JADX INFO: renamed from: M1 */
    public final void m212895M1() {
        this.f195994L1 = null;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC1860d
    /* JADX INFO: renamed from: N */
    public void mo9692N(long j, boolean z) throws ExoPlaybackException {
        super.mo9692N(j, z);
        if (this.f196002l1.m212930f()) {
            this.f196002l1.m212927c();
        }
        m212894L1();
        this.f196000j1.m158043j();
        this.f195988F1 = -9223372036854775807L;
        this.f196016z1 = -9223372036854775807L;
        this.f195986D1 = 0;
        if (z) {
            m212915s2();
        } else {
            this.f195983A1 = -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: O1 */
    public boolean m212896O1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (xrx.class) {
            try {
                if (!f195981R1) {
                    f195982S1 = m212879S1();
                    f195981R1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f195982S1;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: P0 */
    public void mo9694P0(Exception exc) {
        kyv.m152146d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f196001k1.m206710s(exc);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC1860d
    @TargetApi(17)
    /* JADX INFO: renamed from: Q */
    public void mo9695Q() {
        try {
            super.mo9695Q();
        } finally {
            if (this.f196002l1.m212930f()) {
                this.f196002l1.m212938n();
            }
            if (this.f196010t1 != null) {
                m212911n2();
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: Q0 */
    public void mo9696Q0(String str, InterfaceC1907c.a aVar, long j, long j2) {
        this.f196001k1.m206702k(str, j, j2);
        this.f196007q1 = m212896O1(str);
        this.f196008r1 = ((C1908d) w11.m204369e(m10471w0())).m10573p();
        if (bmk0.f77313a >= 23 && this.f195995M1) {
            this.f195997O1 = new C21434c((InterfaceC1907c) w11.m204369e(m10469v0()));
        }
        this.f196002l1.m212934j(str);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC1860d
    /* JADX INFO: renamed from: R */
    public void mo9697R() {
        super.mo9697R();
        this.f195985C1 = 0;
        this.f195984B1 = SystemClock.elapsedRealtime();
        this.f195989G1 = SystemClock.elapsedRealtime() * 1000;
        this.f195990H1 = 0L;
        this.f195991I1 = 0;
        this.f196000j1.m158044k();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: R0 */
    public void mo9698R0(String str) {
        this.f196001k1.m206703l(str);
    }

    /* JADX INFO: renamed from: R1 */
    public void m212897R1(InterfaceC1907c interfaceC1907c, int i, long j) {
        nej0.m162903a("dropVideoBuffer");
        interfaceC1907c.releaseOutputBuffer(i, false);
        nej0.m162905c();
        m212891B2(0, 1);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC1860d
    /* JADX INFO: renamed from: S */
    public void mo9699S() {
        this.f195983A1 = -9223372036854775807L;
        m212902e2();
        m212904g2();
        this.f196000j1.m158045l();
        super.mo9699S();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @Nullable
    /* JADX INFO: renamed from: S0 */
    public nid mo9700S0(p1j p1jVar) throws ExoPlaybackException {
        nid nidVarMo9700S0 = super.mo9700S0(p1jVar);
        this.f196001k1.m206707p(p1jVar.f150174b, nidVarMo9700S0);
        return nidVarMo9700S0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: T0 */
    public void mo9701T0(C1894k c1894k, @Nullable MediaFormat mediaFormat) {
        int integer;
        int i;
        InterfaceC1907c interfaceC1907cM10469v0 = m10469v0();
        if (interfaceC1907cM10469v0 != null) {
            interfaceC1907cM10469v0.setVideoScalingMode(this.f196012v1);
        }
        int i2 = 0;
        if (this.f195995M1) {
            i = c1894k.f7790q;
            integer = c1894k.f7791r;
        } else {
            w11.m204369e(mediaFormat);
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i = integer2;
        }
        float f = c1894k.f7794u;
        if (m212876N1()) {
            int i3 = c1894k.f7793t;
            if (i3 == 90 || i3 == 270) {
                f = 1.0f / f;
                int i4 = integer;
                integer = i;
                i = i4;
            }
        } else if (!this.f196002l1.m212930f()) {
            i2 = c1894k.f7793t;
        }
        this.f195993K1 = new zjl0(i, integer, i2, f);
        this.f196000j1.m158040g(c1894k.f7792s);
        if (this.f196002l1.m212930f()) {
            this.f196002l1.m212939o(c1894k.m10336b().m10407n0(i).m10386S(integer).m10399f0(i2).m10396c0(f).m10374G());
        }
    }

    /* JADX INFO: renamed from: T1 */
    public Pair<df5, df5> m212898T1(@Nullable df5 df5Var) {
        if (df5.m115495f(df5Var)) {
            return df5Var.f88125c == 7 ? Pair.create(df5Var, df5Var.m115498b().m115504d(6).m115501a()) : Pair.create(df5Var, df5Var);
        }
        df5 df5Var2 = df5.f88116f;
        return Pair.create(df5Var2, df5Var2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @CallSuper
    /* JADX INFO: renamed from: V0 */
    public void mo10433V0(long j) {
        super.mo10433V0(j);
        if (this.f195995M1) {
            return;
        }
        this.f195987E1--;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: W0 */
    public void mo9703W0() {
        super.mo9703W0();
        m212894L1();
    }

    /* JADX INFO: renamed from: W1 */
    public C21433b m212899W1(C1908d c1908d, C1894k c1894k, C1894k[] c1894kArr) {
        int iM212880U1;
        int iMax = c1894k.f7790q;
        int iMax2 = c1894k.f7791r;
        int iM212883Y1 = m212883Y1(c1908d, c1894k);
        if (c1894kArr.length == 1) {
            if (iM212883Y1 != -1 && (iM212880U1 = m212880U1(c1908d, c1894k)) != -1) {
                iM212883Y1 = Math.min((int) (iM212883Y1 * 1.5f), iM212880U1);
            }
            return new C21433b(iMax, iMax2, iM212883Y1);
        }
        int length = c1894kArr.length;
        boolean z = false;
        for (int i = 0; i < length; i++) {
            C1894k c1894kM10374G = c1894kArr[i];
            if (c1894k.f7797x != null && c1894kM10374G.f7797x == null) {
                c1894kM10374G = c1894kM10374G.m10336b().m10379L(c1894k.f7797x).m10374G();
            }
            if (c1908d.m10566f(c1894k, c1894kM10374G).f142115d != 0) {
                int i2 = c1894kM10374G.f7790q;
                z |= i2 == -1 || c1894kM10374G.f7791r == -1;
                iMax = Math.max(iMax, i2);
                iMax2 = Math.max(iMax2, c1894kM10374G.f7791r);
                iM212883Y1 = Math.max(iM212883Y1, m212883Y1(c1908d, c1894kM10374G));
            }
        }
        if (z) {
            kyv.m152151i("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + BaseSei.f14624X + iMax2);
            Point pointM212881V1 = m212881V1(c1908d, c1894k);
            if (pointM212881V1 != null) {
                iMax = Math.max(iMax, pointM212881V1.x);
                iMax2 = Math.max(iMax2, pointM212881V1.y);
                iM212883Y1 = Math.max(iM212883Y1, m212880U1(c1908d, c1894k.m10336b().m10407n0(iMax).m10386S(iMax2).m10374G()));
                kyv.m152151i("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + BaseSei.f14624X + iMax2);
            }
        }
        return new C21433b(iMax, iMax2, iM212883Y1);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @CallSuper
    /* JADX INFO: renamed from: X0 */
    public void mo9704X0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        boolean z = this.f195995M1;
        if (!z) {
            this.f195987E1++;
        }
        if (bmk0.f77313a >= 23 || !z) {
            return;
        }
        m212909l2(decoderInputBuffer.f7414e);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @CallSuper
    /* JADX INFO: renamed from: Y0 */
    public void mo10436Y0(C1894k c1894k) throws ExoPlaybackException {
        if (this.f196002l1.m212930f()) {
            return;
        }
        this.f196002l1.m212932h(c1894k, m10423C0());
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: Z */
    public nid mo9705Z(C1908d c1908d, C1894k c1894k, C1894k c1894k2) {
        nid nidVarM10566f = c1908d.m10566f(c1894k, c1894k2);
        int i = nidVarM10566f.f142116e;
        int i2 = c1894k2.f7790q;
        C21433b c21433b = this.f196006p1;
        if (i2 > c21433b.f196017a || c1894k2.f7791r > c21433b.f196018b) {
            i |= 256;
        }
        if (m212883Y1(c1908d, c1894k2) > this.f196006p1.f196019c) {
            i |= 64;
        }
        int i3 = i;
        return new nid(c1908d.f7936a, c1894k, c1894k2, i3 != 0 ? 0 : nidVarM10566f.f142115d, i3);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: a1 */
    public boolean mo9706a1(long j, long j2, @Nullable InterfaceC1907c interfaceC1907c, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C1894k c1894k) throws ExoPlaybackException {
        long j4;
        boolean z3;
        w11.m204369e(interfaceC1907c);
        if (this.f196016z1 == -9223372036854775807L) {
            this.f196016z1 = j;
        }
        if (j3 != this.f195988F1) {
            if (!this.f196002l1.m212930f()) {
                this.f196000j1.m158041h(j3);
            }
            this.f195988F1 = j3;
        }
        long jM10423C0 = j3 - m10423C0();
        if (z && !z2) {
            m212890A2(interfaceC1907c, i, jM10423C0);
            return true;
        }
        boolean z4 = getState() == 2;
        long jM212893K1 = m212893K1(j, j2, SystemClock.elapsedRealtime() * 1000, j3, z4);
        if (this.f196009s1 == this.f196010t1) {
            if (!m212885b2(jM212893K1)) {
                return false;
            }
            m212890A2(interfaceC1907c, i, jM10423C0);
            m212892C2(jM212893K1);
            return true;
        }
        if (m212920x2(j, jM212893K1)) {
            if (!this.f196002l1.m212930f()) {
                z3 = true;
            } else {
                if (!this.f196002l1.m212933i(c1894k, jM10423C0, z2)) {
                    return false;
                }
                z3 = false;
            }
            m212913p2(interfaceC1907c, c1894k, i, jM10423C0, z3);
            m212892C2(jM212893K1);
            return true;
        }
        if (z4 && j != this.f196016z1) {
            long jNanoTime = System.nanoTime();
            long jM158038b = this.f196000j1.m158038b((jM212893K1 * 1000) + jNanoTime);
            if (!this.f196002l1.m212930f()) {
                jM212893K1 = (jM158038b - jNanoTime) / 1000;
            }
            boolean z5 = this.f195983A1 != -9223372036854775807L;
            long j5 = jM212893K1;
            if (m212918v2(j5, j2, z2) && m212901d2(j, z5)) {
                return false;
            }
            if (m212919w2(j5, j2, z2)) {
                if (z5) {
                    m212890A2(interfaceC1907c, i, jM10423C0);
                } else {
                    m212897R1(interfaceC1907c, i, jM10423C0);
                }
                m212892C2(j5);
                return true;
            }
            if (this.f196002l1.m212930f()) {
                this.f196002l1.m212936l(j, j2);
                if (!this.f196002l1.m212933i(c1894k, jM10423C0, z2)) {
                    return false;
                }
                m212913p2(interfaceC1907c, c1894k, i, jM10423C0, false);
                return true;
            }
            if (bmk0.f77313a >= 21) {
                if (j5 < 50000) {
                    if (jM158038b == this.f195992J1) {
                        m212890A2(interfaceC1907c, i, jM10423C0);
                        j4 = jM158038b;
                    } else {
                        m212908k2(jM10423C0, jM158038b, c1894k);
                        m212914q2(interfaceC1907c, i, jM10423C0, jM158038b);
                        j4 = jM158038b;
                    }
                    m212892C2(j5);
                    this.f195992J1 = j4;
                    return true;
                }
            } else if (j5 < HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT) {
                if (j5 > 11000) {
                    try {
                        Thread.sleep((j5 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                m212908k2(jM10423C0, jM158038b, c1894k);
                m212912o2(interfaceC1907c, i, jM10423C0);
                m212892C2(j5);
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(21)
    /* JADX INFO: renamed from: a2 */
    public MediaFormat m212900a2(C1894k c1894k, String str, C21433b c21433b, float f, boolean z, int i) {
        Pair<Integer, Integer> pairM10510r;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(IMediaFormat.KEY_MIME, str);
        mediaFormat.setInteger("width", c1894k.f7790q);
        mediaFormat.setInteger("height", c1894k.f7791r);
        qsx.m177825e(mediaFormat, c1894k.f7787n);
        qsx.m177823c(mediaFormat, "frame-rate", c1894k.f7792s);
        qsx.m177824d(mediaFormat, "rotation-degrees", c1894k.f7793t);
        qsx.m177822b(mediaFormat, c1894k.f7797x);
        if ("video/dolby-vision".equals(c1894k.f7785l) && (pairM10510r = MediaCodecUtil.m10510r(c1894k)) != null) {
            qsx.m177824d(mediaFormat, "profile", ((Integer) pairM10510r.first).intValue());
        }
        mediaFormat.setInteger("max-width", c21433b.f196017a);
        mediaFormat.setInteger("max-height", c21433b.f196018b);
        qsx.m177824d(mediaFormat, "max-input-size", c21433b.f196019c);
        if (bmk0.f77313a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            m212877P1(mediaFormat, i);
        }
        return mediaFormat;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.InterfaceC2089x
    /* JADX INFO: renamed from: b */
    public boolean mo9707b() {
        PlaceholderSurface placeholderSurface;
        if (super.mo9707b() && ((!this.f196002l1.m212930f() || this.f196002l1.m212931g()) && (this.f196013w1 || (((placeholderSurface = this.f196010t1) != null && this.f196009s1 == placeholderSurface) || m10469v0() == null || this.f195995M1)))) {
            this.f195983A1 = -9223372036854775807L;
            return true;
        }
        if (this.f195983A1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f195983A1) {
            return true;
        }
        this.f195983A1 = -9223372036854775807L;
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.InterfaceC2089x
    /* JADX INFO: renamed from: c */
    public boolean mo9708c() {
        boolean zMo9708c = super.mo9708c();
        return this.f196002l1.m212930f() ? this.f196002l1.m212937m() & zMo9708c : zMo9708c;
    }

    /* JADX INFO: renamed from: d2 */
    public boolean m212901d2(long j, boolean z) throws ExoPlaybackException {
        int iM9828W = m9828W(j);
        if (iM9828W == 0) {
            return false;
        }
        jid jidVar = this.f7889d1;
        if (z) {
            jidVar.f121066d += iM9828W;
            jidVar.f121068f += this.f195987E1;
        } else {
            jidVar.f121072j++;
            m212891B2(iM9828W, this.f195987E1);
        }
        m10466s0();
        if (this.f196002l1.m212930f()) {
            this.f196002l1.m212927c();
        }
        return true;
    }

    /* JADX INFO: renamed from: e2 */
    public final void m212902e2() {
        if (this.f195985C1 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f196001k1.m206705n(this.f195985C1, jElapsedRealtime - this.f195984B1);
            this.f195985C1 = 0;
            this.f195984B1 = jElapsedRealtime;
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC1860d, com.google.android.exoplayer2.C2027u.b
    /* JADX INFO: renamed from: f */
    public void mo9709f(int i, @Nullable Object obj) throws ExoPlaybackException {
        Surface surface;
        if (i == 1) {
            m212916t2(obj);
            return;
        }
        if (i == 7) {
            this.f195998P1 = (iel0) obj;
            return;
        }
        if (i == 10) {
            int iIntValue = ((Integer) obj).intValue();
            if (this.f195996N1 != iIntValue) {
                this.f195996N1 = iIntValue;
                if (this.f195995M1) {
                    m10443e1();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            this.f196012v1 = ((Integer) obj).intValue();
            InterfaceC1907c interfaceC1907cM10469v0 = m10469v0();
            if (interfaceC1907cM10469v0 != null) {
                interfaceC1907cM10469v0.setVideoScalingMode(this.f196012v1);
                return;
            }
            return;
        }
        if (i == 5) {
            this.f196000j1.m158048o(((Integer) obj).intValue());
            return;
        }
        if (i == 13) {
            this.f196002l1.m212941q((List) w11.m204369e(obj));
            return;
        }
        if (i != 14) {
            super.mo9709f(i, obj);
            return;
        }
        brf0 brf0Var = (brf0) w11.m204369e(obj);
        if (brf0Var.m106135b() == 0 || brf0Var.m106134a() == 0 || (surface = this.f196009s1) == null) {
            return;
        }
        this.f196002l1.m212940p(surface, brf0Var);
    }

    /* JADX INFO: renamed from: f2 */
    public void m212903f2() {
        this.f196015y1 = true;
        if (this.f196013w1) {
            return;
        }
        this.f196013w1 = true;
        this.f196001k1.m206708q(this.f196009s1);
        this.f196011u1 = true;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @CallSuper
    /* JADX INFO: renamed from: g1 */
    public void mo10444g1() {
        super.mo10444g1();
        this.f195987E1 = 0;
    }

    /* JADX INFO: renamed from: g2 */
    public final void m212904g2() {
        int i = this.f195991I1;
        if (i != 0) {
            this.f196001k1.m206709r(this.f195990H1, i);
            this.f195990H1 = 0L;
            this.f195991I1 = 0;
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x, com.google.android.exoplayer2.InterfaceC2090y
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    /* JADX INFO: renamed from: h2 */
    public final void m212905h2(zjl0 zjl0Var) {
        if (zjl0Var.equals(zjl0.f204676e) || zjl0Var.equals(this.f195994L1)) {
            return;
        }
        this.f195994L1 = zjl0Var;
        this.f196001k1.m206711t(zjl0Var);
    }

    /* JADX INFO: renamed from: i2 */
    public final void m212906i2() {
        if (this.f196011u1) {
            this.f196001k1.m206708q(this.f196009s1);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.InterfaceC2089x
    @CallSuper
    /* JADX INFO: renamed from: j */
    public void mo10447j(long j, long j2) throws ExoPlaybackException {
        super.mo10447j(j, j2);
        if (this.f196002l1.m212930f()) {
            this.f196002l1.m212936l(j, j2);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: j0 */
    public MediaCodecDecoderException mo10448j0(Throwable th, @Nullable C1908d c1908d) {
        return new MediaCodecVideoDecoderException(th, c1908d, this.f196009s1);
    }

    /* JADX INFO: renamed from: j2 */
    public final void m212907j2() {
        zjl0 zjl0Var = this.f195994L1;
        if (zjl0Var != null) {
            this.f196001k1.m206711t(zjl0Var);
        }
    }

    /* JADX INFO: renamed from: k2 */
    public final void m212908k2(long j, long j2, C1894k c1894k) {
        iel0 iel0Var = this.f195998P1;
        if (iel0Var != null) {
            iel0Var.mo10184a(j, j2, c1894k, m10475z0());
        }
    }

    /* JADX INFO: renamed from: l2 */
    public void m212909l2(long j) throws ExoPlaybackException {
        m10474x1(j);
        m212905h2(this.f195993K1);
        this.f7889d1.f121067e++;
        m212903f2();
        mo10433V0(j);
    }

    /* JADX INFO: renamed from: m2 */
    public final void m212910m2() {
        m10455m1();
    }

    @RequiresApi(17)
    /* JADX INFO: renamed from: n2 */
    public final void m212911n2() {
        Surface surface = this.f196009s1;
        PlaceholderSurface placeholderSurface = this.f196010t1;
        if (surface == placeholderSurface) {
            this.f196009s1 = null;
        }
        placeholderSurface.release();
        this.f196010t1 = null;
    }

    /* JADX INFO: renamed from: o2 */
    public void m212912o2(InterfaceC1907c interfaceC1907c, int i, long j) {
        nej0.m162903a("releaseOutputBuffer");
        interfaceC1907c.releaseOutputBuffer(i, true);
        nej0.m162905c();
        this.f7889d1.f121067e++;
        this.f195986D1 = 0;
        if (this.f196002l1.m212930f()) {
            return;
        }
        this.f195989G1 = SystemClock.elapsedRealtime() * 1000;
        m212905h2(this.f195993K1);
        m212903f2();
    }

    /* JADX INFO: renamed from: p2 */
    public final void m212913p2(InterfaceC1907c interfaceC1907c, C1894k c1894k, int i, long j, boolean z) {
        long j2;
        long jM212928d = this.f196002l1.m212930f() ? this.f196002l1.m212928d(j, m10423C0()) * 1000 : System.nanoTime();
        if (z) {
            j2 = j;
            m212908k2(j2, jM212928d, c1894k);
        } else {
            j2 = j;
        }
        if (bmk0.f77313a >= 21) {
            m212914q2(interfaceC1907c, i, j2, jM212928d);
        } else {
            m212912o2(interfaceC1907c, i, j2);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: q1 */
    public boolean mo10463q1(C1908d c1908d) {
        return this.f196009s1 != null || m212922z2(c1908d);
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: q2 */
    public void m212914q2(InterfaceC1907c interfaceC1907c, int i, long j, long j2) {
        nej0.m162903a("releaseOutputBuffer");
        interfaceC1907c.releaseOutputBuffer(i, j2);
        nej0.m162905c();
        this.f7889d1.f121067e++;
        this.f195986D1 = 0;
        if (this.f196002l1.m212930f()) {
            return;
        }
        this.f195989G1 = SystemClock.elapsedRealtime() * 1000;
        m212905h2(this.f195993K1);
        m212903f2();
    }

    /* JADX INFO: renamed from: s2 */
    public final void m212915s2() {
        this.f195983A1 = this.f196003m1 > 0 ? SystemClock.elapsedRealtime() + this.f196003m1 : -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: t1 */
    public int mo9713t1(InterfaceC1909e interfaceC1909e, C1894k c1894k) throws MediaCodecUtil.DecoderQueryException {
        boolean z;
        int i = 0;
        if (!kb00.m149018s(c1894k.f7785l)) {
            return InterfaceC2090y.m12266v(0);
        }
        boolean z2 = c1894k.f7788o != null;
        List<C1908d> listM212882X1 = m212882X1(this.f195999i1, interfaceC1909e, c1894k, z2, false);
        if (z2 && listM212882X1.isEmpty()) {
            listM212882X1 = m212882X1(this.f195999i1, interfaceC1909e, c1894k, false, false);
        }
        if (listM212882X1.isEmpty()) {
            return InterfaceC2090y.m12266v(1);
        }
        if (!MediaCodecRenderer.m10421u1(c1894k)) {
            return InterfaceC2090y.m12266v(2);
        }
        C1908d c1908d = listM212882X1.get(0);
        boolean zM10572o = c1908d.m10572o(c1894k);
        if (!zM10572o) {
            int i2 = 1;
            while (true) {
                if (i2 >= listM212882X1.size()) {
                    z = true;
                    break;
                }
                C1908d c1908d2 = listM212882X1.get(i2);
                if (c1908d2.m10572o(c1894k)) {
                    z = false;
                    zM10572o = true;
                    c1908d = c1908d2;
                    break;
                }
                i2++;
            }
        } else {
            z = true;
            break;
        }
        int i3 = zM10572o ? 4 : 3;
        int i4 = c1908d.m10575r(c1894k) ? 16 : 8;
        int i5 = c1908d.f7943h ? 64 : 0;
        int i6 = z ? 128 : 0;
        if (bmk0.f77313a >= 26 && "video/dolby-vision".equals(c1894k.f7785l) && !C21432a.m212923a(this.f195999i1)) {
            i6 = 256;
        }
        if (zM10572o) {
            List<C1908d> listM212882X2 = m212882X1(this.f195999i1, interfaceC1909e, c1894k, z2, true);
            if (!listM212882X2.isEmpty()) {
                C1908d c1908d3 = MediaCodecUtil.m10515w(listM212882X2, c1894k).get(0);
                if (c1908d3.m10572o(c1894k) && c1908d3.m10575r(c1894k)) {
                    i = 32;
                }
            }
        }
        return InterfaceC2090y.m12264t(i3, i4, i, i5, i6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.mel0] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.exoplayer2.d, com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, l.xrx] */
    /* JADX WARN: Type inference failed for: r4v2, types: [l.xrx$d] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.google.android.exoplayer2.video.PlaceholderSurface] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: t2 */
    public final void m212916t2(@Nullable Object obj) throws ExoPlaybackException {
        ?? M12233c;
        Surface surface;
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            M12233c = 0;
        }
        if (M12233c == 0) {
            PlaceholderSurface placeholderSurface = this.f196010t1;
            if (placeholderSurface != null) {
                M12233c = surface;
                M12233c = placeholderSurface;
            } else {
                C1908d c1908dM10471w0 = m10471w0();
                if (c1908dM10471w0 != null && m212922z2(c1908dM10471w0)) {
                    M12233c = surface;
                    M12233c = PlaceholderSurface.m12233c(this.f195999i1, c1908dM10471w0.f7942g);
                    this.f196010t1 = M12233c;
                }
            }
        }
        M12233c = surface;
        M12233c = surface;
        M12233c = surface;
        if (this.f196009s1 == M12233c) {
            if (M12233c == 0 || M12233c == this.f196010t1) {
                return;
            }
            m212907j2();
            m212906i2();
            return;
        }
        this.f196009s1 = M12233c;
        this.f196000j1.m158046m(M12233c);
        this.f196011u1 = false;
        int state = getState();
        InterfaceC1907c interfaceC1907cM10469v0 = m10469v0();
        if (interfaceC1907cM10469v0 != null && !this.f196002l1.m212930f()) {
            if (bmk0.f77313a < 23 || M12233c == 0 || this.f196007q1) {
                m10443e1();
                m10431N0();
            } else {
                m212917u2(interfaceC1907cM10469v0, M12233c);
            }
        }
        if (M12233c == 0 || M12233c == this.f196010t1) {
            m212895M1();
            m212894L1();
            if (this.f196002l1.m212930f()) {
                this.f196002l1.m212926b();
                return;
            }
            return;
        }
        m212907j2();
        m212894L1();
        if (state == 2) {
            m212915s2();
        }
        if (this.f196002l1.m212930f()) {
            this.f196002l1.m212940p(M12233c, brf0.f78020c);
        }
    }

    @RequiresApi(23)
    /* JADX INFO: renamed from: u2 */
    public void m212917u2(InterfaceC1907c interfaceC1907c, Surface surface) {
        interfaceC1907c.setOutputSurface(surface);
    }

    /* JADX INFO: renamed from: v2 */
    public boolean m212918v2(long j, long j2, boolean z) {
        return m212886c2(j) && !z;
    }

    /* JADX INFO: renamed from: w2 */
    public boolean m212919w2(long j, long j2, boolean z) {
        return m212885b2(j) && !z;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: x0 */
    public boolean mo10473x0() {
        return this.f195995M1 && bmk0.f77313a < 23;
    }

    /* JADX INFO: renamed from: x2 */
    public final boolean m212920x2(long j, long j2) {
        boolean z = getState() == 2;
        return this.f195983A1 == -9223372036854775807L && j >= m10423C0() && ((this.f196015y1 ? !this.f196013w1 : !(!z && !this.f196014x1)) || (z && m212921y2(j2, (SystemClock.elapsedRealtime() * 1000) - this.f195989G1)));
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: y0 */
    public float mo9714y0(float f, C1894k c1894k, C1894k[] c1894kArr) {
        float fMax = -1.0f;
        for (C1894k c1894k2 : c1894kArr) {
            float f2 = c1894k2.f7792s;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    /* JADX INFO: renamed from: y2 */
    public boolean m212921y2(long j, long j2) {
        return m212885b2(j) && j2 > 100000;
    }

    /* JADX INFO: renamed from: z2 */
    public final boolean m212922z2(C1908d c1908d) {
        if (bmk0.f77313a < 23 || this.f195995M1 || m212896O1(c1908d.f7936a)) {
            return false;
        }
        return !c1908d.f7942g || PlaceholderSurface.m12232b(this.f195999i1);
    }

    public xrx(Context context, InterfaceC1907c.b bVar, InterfaceC1909e interfaceC1909e, long j, boolean z, @Nullable Handler handler, @Nullable wjl0 wjl0Var, int i) {
        this(context, bVar, interfaceC1909e, j, z, handler, wjl0Var, i, 30.0f);
    }
}
