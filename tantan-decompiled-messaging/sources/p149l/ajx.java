package p149l;

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
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.InterfaceC2067y;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.mediacodec.C1885d;
import com.google.android.exoplayer2.mediacodec.InterfaceC1884c;
import com.google.android.exoplayer2.mediacodec.InterfaceC1886e;
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
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class ajx extends MediaCodecRenderer {

    /* JADX INFO: renamed from: Q1 */
    public static final int[] f70145Q1 = {WBConstants.SDK_NEW_PAY_VERSION, MMConstants.ERR_VCM_UNKNOWN_ERROR, 1440, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK, TXEAudioDef.TXE_OPUS_SAMPLE_NUM, 854, 640, 540, 480};

    /* JADX INFO: renamed from: R1 */
    public static boolean f70146R1;

    /* JADX INFO: renamed from: S1 */
    public static boolean f70147S1;

    /* JADX INFO: renamed from: A1 */
    public long f70148A1;

    /* JADX INFO: renamed from: B1 */
    public long f70149B1;

    /* JADX INFO: renamed from: C1 */
    public int f70150C1;

    /* JADX INFO: renamed from: D1 */
    public int f70151D1;

    /* JADX INFO: renamed from: E1 */
    public int f70152E1;

    /* JADX INFO: renamed from: F1 */
    public long f70153F1;

    /* JADX INFO: renamed from: G1 */
    public long f70154G1;

    /* JADX INFO: renamed from: H1 */
    public long f70155H1;

    /* JADX INFO: renamed from: I1 */
    public int f70156I1;

    /* JADX INFO: renamed from: J1 */
    public long f70157J1;

    /* JADX INFO: renamed from: K1 */
    public val0 f70158K1;

    /* JADX INFO: renamed from: L1 */
    @Nullable
    public val0 f70159L1;

    /* JADX INFO: renamed from: M1 */
    public boolean f70160M1;

    /* JADX INFO: renamed from: N1 */
    public int f70161N1;

    /* JADX INFO: renamed from: O1 */
    @Nullable
    public C15641c f70162O1;

    /* JADX INFO: renamed from: P1 */
    @Nullable
    public e5l0 f70163P1;

    /* JADX INFO: renamed from: i1 */
    public final Context f70164i1;

    /* JADX INFO: renamed from: j1 */
    public final i5l0 f70165j1;

    /* JADX INFO: renamed from: k1 */
    public final sal0.C19893a f70166k1;

    /* JADX INFO: renamed from: l1 */
    public final C15642d f70167l1;

    /* JADX INFO: renamed from: m1 */
    public final long f70168m1;

    /* JADX INFO: renamed from: n1 */
    public final int f70169n1;

    /* JADX INFO: renamed from: o1 */
    public final boolean f70170o1;

    /* JADX INFO: renamed from: p1 */
    public C15640b f70171p1;

    /* JADX INFO: renamed from: q1 */
    public boolean f70172q1;

    /* JADX INFO: renamed from: r1 */
    public boolean f70173r1;

    /* JADX INFO: renamed from: s1 */
    @Nullable
    public Surface f70174s1;

    /* JADX INFO: renamed from: t1 */
    @Nullable
    public PlaceholderSurface f70175t1;

    /* JADX INFO: renamed from: u1 */
    public boolean f70176u1;

    /* JADX INFO: renamed from: v1 */
    public int f70177v1;

    /* JADX INFO: renamed from: w1 */
    public boolean f70178w1;

    /* JADX INFO: renamed from: x1 */
    public boolean f70179x1;

    /* JADX INFO: renamed from: y1 */
    public boolean f70180y1;

    /* JADX INFO: renamed from: z1 */
    public long f70181z1;

    /* JADX INFO: renamed from: l.ajx$a */
    @RequiresApi(26)
    public static final class C15639a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static boolean m97069a(Context context) {
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

    /* JADX INFO: renamed from: l.ajx$b */
    public static final class C15640b {

        /* JADX INFO: renamed from: a */
        public final int f70182a;

        /* JADX INFO: renamed from: b */
        public final int f70183b;

        /* JADX INFO: renamed from: c */
        public final int f70184c;

        public C15640b(int i, int i2, int i3) {
            this.f70182a = i;
            this.f70183b = i2;
            this.f70184c = i3;
        }
    }

    /* JADX INFO: renamed from: l.ajx$c */
    @RequiresApi(23)
    public final class C15641c implements InterfaceC1884c.c, Handler.Callback {

        /* JADX INFO: renamed from: a */
        public final Handler f70185a;

        public C15641c(InterfaceC1884c interfaceC1884c) {
            Handler handlerM197898x = vck0.m197898x(this);
            this.f70185a = handlerM197898x;
            interfaceC1884c.mo10482d(this, handlerM197898x);
        }

        @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c.c
        /* JADX INFO: renamed from: a */
        public void mo10492a(InterfaceC1884c interfaceC1884c, long j, long j2) {
            if (vck0.f180948a >= 30) {
                m97070b(j);
            } else {
                this.f70185a.sendMessageAtFrontOfQueue(Message.obtain(this.f70185a, 0, (int) (j >> 32), (int) j));
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m97070b(long j) {
            ajx ajxVar = ajx.this;
            if (this != ajxVar.f70162O1 || ajxVar.m10415v0() == null) {
                return;
            }
            ajx ajxVar2 = ajx.this;
            if (j == Long.MAX_VALUE) {
                ajxVar2.m97056m2();
                return;
            }
            try {
                ajxVar2.m97055l2(j);
            } catch (ExoPlaybackException e) {
                ajx.this.m10403n1(e);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            m97070b(vck0.m197868j1(message.arg1, message.arg2));
            return true;
        }
    }

    /* JADX INFO: renamed from: l.ajx$d */
    public static final class C15642d {

        /* JADX INFO: renamed from: a */
        public final i5l0 f70187a;

        /* JADX INFO: renamed from: b */
        public final ajx f70188b;

        /* JADX INFO: renamed from: e */
        public Handler f70191e;

        /* JADX INFO: renamed from: f */
        @Nullable
        public f5l0 f70192f;

        /* JADX INFO: renamed from: g */
        @Nullable
        public CopyOnWriteArrayList<uoe> f70193g;

        /* JADX INFO: renamed from: h */
        @Nullable
        public C1871k f70194h;

        /* JADX INFO: renamed from: i */
        public Pair<Long, C1871k> f70195i;

        /* JADX INFO: renamed from: j */
        @Nullable
        public Pair<Surface, sif0> f70196j;

        /* JADX INFO: renamed from: m */
        public boolean f70199m;

        /* JADX INFO: renamed from: n */
        public boolean f70200n;

        /* JADX INFO: renamed from: o */
        public boolean f70201o;

        /* JADX INFO: renamed from: c */
        public final ArrayDeque<Long> f70189c = new ArrayDeque<>();

        /* JADX INFO: renamed from: d */
        public final ArrayDeque<Pair<Long, C1871k>> f70190d = new ArrayDeque<>();

        /* JADX INFO: renamed from: k */
        public int f70197k = -1;

        /* JADX INFO: renamed from: l */
        public boolean f70198l = true;

        /* JADX INFO: renamed from: p */
        public long f70202p = -9223372036854775807L;

        /* JADX INFO: renamed from: q */
        public val0 f70203q = val0.f180759e;

        /* JADX INFO: renamed from: r */
        public long f70204r = -9223372036854775807L;

        /* JADX INFO: renamed from: s */
        public long f70205s = -9223372036854775807L;

        /* JADX INFO: renamed from: l.ajx$d$a */
        public class a implements f5l0.InterfaceC16763b {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C1871k f70206a;

            public a(C1871k c1871k) {
                this.f70206a = c1871k;
            }
        }

        /* JADX INFO: renamed from: l.ajx$d$b */
        public static final class b {

            /* JADX INFO: renamed from: a */
            public static Constructor<?> f70208a;

            /* JADX INFO: renamed from: b */
            public static Method f70209b;

            /* JADX INFO: renamed from: c */
            public static Method f70210c;

            /* JADX INFO: renamed from: d */
            public static Constructor<?> f70211d;

            /* JADX INFO: renamed from: e */
            public static Method f70212e;

            /* JADX INFO: renamed from: a */
            public static uoe m97088a(float f) throws Exception {
                m97090c();
                Object objNewInstance = f70208a.newInstance(null);
                f70209b.invoke(objNewInstance, Float.valueOf(f));
                return (uoe) p11.m167011e(f70210c.invoke(objNewInstance, null));
            }

            /* JADX INFO: renamed from: b */
            public static f5l0.InterfaceC16762a m97089b() throws Exception {
                m97090c();
                return (f5l0.InterfaceC16762a) p11.m167011e(f70212e.invoke(f70211d.newInstance(null), null));
            }

            @EnsuresNonNull({"scaleAndRotateTransformationBuilderConstructor", "setRotationMethod", "buildScaleAndRotateTransformationMethod", "videoFrameProcessorFactoryBuilderConstructor", "buildVideoFrameProcessorFactoryMethod"})
            /* JADX INFO: renamed from: c */
            public static void m97090c() throws Exception {
                if (f70208a == null || f70209b == null || f70210c == null) {
                    Class<?> cls = Class.forName("com.google.android.exoplayer2.effect.ScaleAndRotateTransformation$Builder");
                    f70208a = cls.getConstructor(null);
                    f70209b = cls.getMethod("setRotationDegrees", Float.TYPE);
                    f70210c = cls.getMethod("build", null);
                }
                if (f70211d == null || f70212e == null) {
                    Class<?> cls2 = Class.forName("com.google.android.exoplayer2.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    f70211d = cls2.getConstructor(null);
                    f70212e = cls2.getMethod("build", null);
                }
            }
        }

        public C15642d(i5l0 i5l0Var, ajx ajxVar) {
            this.f70187a = i5l0Var;
            this.f70188b = ajxVar;
        }

        /* JADX INFO: renamed from: a */
        public MediaFormat m97071a(MediaFormat mediaFormat) {
            if (vck0.f180948a >= 29 && this.f70188b.f70164i1.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
                mediaFormat.setInteger("allow-frame-drop", 0);
            }
            return mediaFormat;
        }

        /* JADX INFO: renamed from: b */
        public void m97072b() {
            ((f5l0) p11.m167011e(this.f70192f)).m119507a(null);
            this.f70196j = null;
        }

        /* JADX INFO: renamed from: c */
        public void m97073c() {
            p11.m167015i(this.f70192f);
            this.f70192f.flush();
            this.f70189c.clear();
            this.f70191e.removeCallbacksAndMessages(null);
            if (this.f70199m) {
                this.f70199m = false;
                this.f70200n = false;
                this.f70201o = false;
            }
        }

        /* JADX INFO: renamed from: d */
        public long m97074d(long j, long j2) {
            p11.m167013g(this.f70205s != -9223372036854775807L);
            return (j + j2) - this.f70205s;
        }

        /* JADX INFO: renamed from: e */
        public Surface m97075e() {
            return ((f5l0) p11.m167011e(this.f70192f)).m119508b();
        }

        /* JADX INFO: renamed from: f */
        public boolean m97076f() {
            return this.f70192f != null;
        }

        /* JADX INFO: renamed from: g */
        public boolean m97077g() {
            Pair<Surface, sif0> pair = this.f70196j;
            return pair == null || !((sif0) pair.second).equals(sif0.f164712c);
        }

        /* JADX INFO: renamed from: h */
        public boolean m97078h(C1871k c1871k, long j) throws ExoPlaybackException {
            int i;
            p11.m167013g(!m97076f());
            if (!this.f70198l) {
                return false;
            }
            if (this.f70193g == null) {
                this.f70198l = false;
                return false;
            }
            this.f70191e = vck0.m197896w();
            Pair<de5, de5> pairM97044T1 = this.f70188b.m97044T1(c1871k.f7760x);
            try {
                if (!ajx.m97022N1() && (i = c1871k.f7756t) != 0) {
                    this.f70193g.add(0, b.m97088a(i));
                }
                f5l0.InterfaceC16762a interfaceC16762aM97089b = b.m97089b();
                Context context = this.f70188b.f70164i1;
                List<uoe> list = (List) p11.m167011e(this.f70193g);
                kgd kgdVar = kgd.f123023a;
                de5 de5Var = (de5) pairM97044T1.first;
                de5 de5Var2 = (de5) pairM97044T1.second;
                Handler handler = this.f70191e;
                Objects.requireNonNull(handler);
                f5l0 f5l0VarM119514a = interfaceC16762aM97089b.m119514a(context, list, kgdVar, de5Var, de5Var2, false, new gld(handler), new a(c1871k));
                this.f70192f = f5l0VarM119514a;
                f5l0VarM119514a.m119509c(1);
                this.f70205s = j;
                Pair<Surface, sif0> pair = this.f70196j;
                if (pair != null) {
                    sif0 sif0Var = (sif0) pair.second;
                    this.f70192f.m119507a(new u1h0((Surface) pair.first, sif0Var.m184338b(), sif0Var.m184337a()));
                }
                m97085o(c1871k);
                return true;
            } catch (Exception e) {
                throw this.f70188b.m9762D(e, c1871k, PlaybackException.ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED);
            }
        }

        /* JADX INFO: renamed from: i */
        public boolean m97079i(C1871k c1871k, long j, boolean z) {
            p11.m167015i(this.f70192f);
            p11.m167013g(this.f70197k != -1);
            if (this.f70192f.m119513g() >= this.f70197k) {
                return false;
            }
            this.f70192f.m119512f();
            Pair<Long, C1871k> pair = this.f70195i;
            if (pair == null) {
                this.f70195i = Pair.create(Long.valueOf(j), c1871k);
            } else if (!vck0.m197845c(c1871k, pair.second)) {
                this.f70190d.add(Pair.create(Long.valueOf(j), c1871k));
            }
            if (z) {
                this.f70199m = true;
                this.f70202p = j;
            }
            return true;
        }

        /* JADX INFO: renamed from: j */
        public void m97080j(String str) {
            this.f70197k = vck0.m197846c0(this.f70188b.f70164i1, str, false);
        }

        /* JADX INFO: renamed from: k */
        public final void m97081k(long j, boolean z) {
            p11.m167015i(this.f70192f);
            this.f70192f.m119511e(j);
            this.f70189c.remove();
            this.f70188b.f70154G1 = SystemClock.elapsedRealtime() * 1000;
            if (j != -2) {
                this.f70188b.m97049f2();
            }
            if (z) {
                this.f70201o = true;
            }
        }

        /* JADX INFO: renamed from: l */
        public void m97082l(long j, long j2) {
            p11.m167015i(this.f70192f);
            while (!this.f70189c.isEmpty()) {
                boolean z = false;
                boolean z2 = this.f70188b.getState() == 2;
                long jLongValue = ((Long) p11.m167011e(this.f70189c.peek())).longValue();
                long j3 = jLongValue + this.f70205s;
                long jM97039K1 = this.f70188b.m97039K1(j, j2, SystemClock.elapsedRealtime() * 1000, j3, z2);
                if (this.f70200n && this.f70189c.size() == 1) {
                    z = true;
                }
                if (this.f70188b.m97066x2(j, jM97039K1)) {
                    m97081k(-1L, z);
                    return;
                }
                if (!z2 || j == this.f70188b.f70181z1 || jM97039K1 > 50000) {
                    return;
                }
                this.f70187a.m134495h(j3);
                long jM134492b = this.f70187a.m134492b(System.nanoTime() + (jM97039K1 * 1000));
                if (this.f70188b.m97065w2((jM134492b - System.nanoTime()) / 1000, j2, z)) {
                    m97081k(-2L, z);
                } else {
                    if (!this.f70190d.isEmpty() && j3 > ((Long) this.f70190d.peek().first).longValue()) {
                        this.f70195i = this.f70190d.remove();
                    }
                    this.f70188b.m97054k2(jLongValue, jM134492b, (C1871k) this.f70195i.second);
                    if (this.f70204r >= j3) {
                        this.f70204r = -9223372036854775807L;
                        this.f70188b.m97051h2(this.f70203q);
                    }
                    m97081k(jM134492b, z);
                }
            }
        }

        /* JADX INFO: renamed from: m */
        public boolean m97083m() {
            return this.f70201o;
        }

        /* JADX INFO: renamed from: n */
        public void m97084n() {
            ((f5l0) p11.m167011e(this.f70192f)).release();
            this.f70192f = null;
            Handler handler = this.f70191e;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            CopyOnWriteArrayList<uoe> copyOnWriteArrayList = this.f70193g;
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.clear();
            }
            this.f70189c.clear();
            this.f70198l = true;
        }

        /* JADX INFO: renamed from: o */
        public void m97085o(C1871k c1871k) {
            ((f5l0) p11.m167011e(this.f70192f)).m119510d(new u3j.C20344b(c1871k.f7753q, c1871k.f7754r).m191576b(c1871k.f7757u).m191575a());
            this.f70194h = c1871k;
            if (this.f70199m) {
                this.f70199m = false;
                this.f70200n = false;
                this.f70201o = false;
            }
        }

        /* JADX INFO: renamed from: p */
        public void m97086p(Surface surface, sif0 sif0Var) {
            Pair<Surface, sif0> pair = this.f70196j;
            if (pair != null && ((Surface) pair.first).equals(surface) && ((sif0) this.f70196j.second).equals(sif0Var)) {
                return;
            }
            this.f70196j = Pair.create(surface, sif0Var);
            if (m97076f()) {
                ((f5l0) p11.m167011e(this.f70192f)).m119507a(new u1h0(surface, sif0Var.m184338b(), sif0Var.m184337a()));
            }
        }

        /* JADX INFO: renamed from: q */
        public void m97087q(List<uoe> list) {
            CopyOnWriteArrayList<uoe> copyOnWriteArrayList = this.f70193g;
            if (copyOnWriteArrayList == null) {
                this.f70193g = new CopyOnWriteArrayList<>(list);
            } else {
                copyOnWriteArrayList.clear();
                this.f70193g.addAll(list);
            }
        }
    }

    public ajx(Context context, InterfaceC1884c.b bVar, InterfaceC1886e interfaceC1886e, long j, boolean z, @Nullable Handler handler, @Nullable sal0 sal0Var, int i, float f) {
        super(2, bVar, interfaceC1886e, z, f);
        this.f70168m1 = j;
        this.f70169n1 = i;
        Context applicationContext = context.getApplicationContext();
        this.f70164i1 = applicationContext;
        i5l0 i5l0Var = new i5l0(applicationContext);
        this.f70165j1 = i5l0Var;
        this.f70166k1 = new sal0.C19893a(handler, sal0Var);
        this.f70167l1 = new C15642d(i5l0Var, this);
        this.f70170o1 = m97024Q1();
        this.f70148A1 = -9223372036854775807L;
        this.f70177v1 = 1;
        this.f70158K1 = val0.f180759e;
        this.f70161N1 = 0;
        m97041M1();
    }

    /* JADX INFO: renamed from: N1 */
    public static boolean m97022N1() {
        return vck0.f180948a >= 21;
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: P1 */
    public static void m97023P1(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    /* JADX INFO: renamed from: Q1 */
    public static boolean m97024Q1() {
        return "NVIDIA".equals(vck0.f180950c);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: S1 */
    public static boolean m97025S1() {
        int i = vck0.f180948a;
        byte b = 7;
        if (i <= 28) {
            String str = vck0.f180949b;
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
        if (i <= 27 && "HWEML".equals(vck0.f180949b)) {
            return true;
        }
        String str2 = vck0.f180951d;
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
                    String str3 = vck0.f180949b;
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
    public static int m97026U1(C1885d c1885d, C1871k c1871k) {
        int iIntValue;
        int i = c1871k.f7753q;
        int i2 = c1871k.f7754r;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        String str = c1871k.f7748l;
        if ("video/dolby-vision".equals(str)) {
            Pair<Integer, Integer> pairM10456r = MediaCodecUtil.m10456r(c1871k);
            str = (pairM10456r == null || !((iIntValue = ((Integer) pairM10456r.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : YtVideoEncoder.MIME_TYPE;
        }
        str.getClass();
        switch (str) {
            case "video/3gpp":
            case "video/av01":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                return m97030Z1(i * i2, 2);
            case "video/hevc":
                return Math.max(2097152, m97030Z1(i * i2, 2));
            case "video/avc":
                String str2 = vck0.f180951d;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(vck0.f180950c) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && c1885d.f7905g)))) {
                    return -1;
                }
                return m97030Z1(vck0.m197872l(i, 16) * vck0.m197872l(i2, 16) * 256, 2);
            case "video/x-vnd.on2.vp9":
                return m97030Z1(i * i2, 4);
            default:
                return -1;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: V1 */
    public static Point m97027V1(C1885d c1885d, C1871k c1871k) {
        int i = c1871k.f7754r;
        int i2 = c1871k.f7753q;
        boolean z = i > i2;
        int i3 = z ? i : i2;
        if (z) {
            i = i2;
        }
        float f = i / i3;
        for (int i4 : f70145Q1) {
            int i5 = (int) (i4 * f);
            if (i4 <= i3 || i5 <= i) {
                break;
            }
            if (vck0.f180948a >= 21) {
                int i6 = z ? i5 : i4;
                if (!z) {
                    i4 = i5;
                }
                Point pointM10511c = c1885d.m10511c(i6, i4);
                if (c1885d.m10522w(pointM10511c.x, pointM10511c.y, c1871k.f7755s)) {
                    return pointM10511c;
                }
            } else {
                try {
                    int iM197872l = vck0.m197872l(i4, 16) * 16;
                    int iM197872l2 = vck0.m197872l(i5, 16) * 16;
                    if (iM197872l * iM197872l2 <= MediaCodecUtil.m10434L()) {
                        int i7 = z ? iM197872l2 : iM197872l;
                        if (!z) {
                            iM197872l = iM197872l2;
                        }
                        return new Point(i7, iM197872l);
                    }
                } catch (MediaCodecUtil.DecoderQueryException unused) {
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: X1 */
    public static List<C1885d> m97028X1(Context context, InterfaceC1886e interfaceC1886e, C1871k c1871k, boolean z, boolean z2) throws MediaCodecUtil.DecoderQueryException {
        String str = c1871k.f7748l;
        if (str == null) {
            return ImmutableList.m15685of();
        }
        if (vck0.f180948a >= 26 && "video/dolby-vision".equals(str) && !C15639a.m97069a(context)) {
            List<C1885d> listM10452n = MediaCodecUtil.m10452n(interfaceC1886e, c1871k, z, z2);
            if (!listM10452n.isEmpty()) {
                return listM10452n;
            }
        }
        return MediaCodecUtil.m10460v(interfaceC1886e, c1871k, z, z2);
    }

    /* JADX INFO: renamed from: Y1 */
    public static int m97029Y1(C1885d c1885d, C1871k c1871k) {
        if (c1871k.f7749m == -1) {
            return m97026U1(c1885d, c1871k);
        }
        int size = c1871k.f7750n.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += c1871k.f7750n.get(i).length;
        }
        return c1871k.f7749m + length;
    }

    /* JADX INFO: renamed from: Z1 */
    public static int m97030Z1(int i, int i2) {
        return (i * 3) / (i2 * 2);
    }

    /* JADX INFO: renamed from: b2 */
    public static boolean m97031b2(long j) {
        return j < -30000;
    }

    /* JADX INFO: renamed from: c2 */
    public static boolean m97032c2(long j) {
        return j < -500000;
    }

    @RequiresApi(29)
    /* JADX INFO: renamed from: r2 */
    public static void m97033r2(InterfaceC1884c interfaceC1884c, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        interfaceC1884c.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.InterfaceC2066x
    /* JADX INFO: renamed from: A */
    public void mo10368A(float f, float f2) throws ExoPlaybackException {
        super.mo10368A(f, f2);
        this.f70165j1.m134496i(f);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: A0 */
    public List<C1885d> mo9630A0(InterfaceC1886e interfaceC1886e, C1871k c1871k, boolean z) throws MediaCodecUtil.DecoderQueryException {
        return MediaCodecUtil.m10461w(m97028X1(this.f70164i1, interfaceC1886e, c1871k, z, this.f70160M1), c1871k);
    }

    /* JADX INFO: renamed from: A2 */
    public void m97036A2(InterfaceC1884c interfaceC1884c, int i, long j) {
        j5j0.m139865a("skipVideoBuffer");
        interfaceC1884c.releaseOutputBuffer(i, false);
        j5j0.m139867c();
        this.f7852d1.f86267f++;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @TargetApi(17)
    /* JADX INFO: renamed from: B0 */
    public InterfaceC1884c.a mo9631B0(C1885d c1885d, C1871k c1871k, @Nullable MediaCrypto mediaCrypto, float f) {
        PlaceholderSurface placeholderSurface = this.f70175t1;
        if (placeholderSurface != null && placeholderSurface.secure != c1885d.f7905g) {
            m97057n2();
        }
        String str = c1885d.f7901c;
        C15640b c15640bM97045W1 = m97045W1(c1885d, c1871k, m9768J());
        this.f70171p1 = c15640bM97045W1;
        MediaFormat mediaFormatM97046a2 = m97046a2(c1871k, str, c15640bM97045W1, f, this.f70170o1, this.f70160M1 ? this.f70161N1 : 0);
        if (this.f70174s1 == null) {
            if (!m97068z2(c1885d)) {
                ohg0.m164364a();
                return null;
            }
            if (this.f70175t1 == null) {
                this.f70175t1 = PlaceholderSurface.m12179c(this.f70164i1, c1885d.f7905g);
            }
            this.f70174s1 = this.f70175t1;
        }
        if (this.f70167l1.m97076f()) {
            mediaFormatM97046a2 = this.f70167l1.m97071a(mediaFormatM97046a2);
        }
        return InterfaceC1884c.a.m10491b(c1885d, mediaFormatM97046a2, c1871k, this.f70167l1.m97076f() ? this.f70167l1.m97075e() : this.f70174s1, mediaCrypto);
    }

    /* JADX INFO: renamed from: B2 */
    public void m97037B2(int i, int i2) {
        dhd dhdVar = this.f7852d1;
        dhdVar.f86269h += i;
        int i3 = i + i2;
        dhdVar.f86268g += i3;
        this.f70150C1 += i3;
        int i4 = this.f70151D1 + i3;
        this.f70151D1 = i4;
        dhdVar.f86270i = Math.max(i4, dhdVar.f86270i);
        int i5 = this.f70169n1;
        if (i5 <= 0 || this.f70150C1 < i5) {
            return;
        }
        m97048e2();
    }

    /* JADX INFO: renamed from: C2 */
    public void m97038C2(long j) {
        this.f7852d1.m111815a(j);
        this.f70155H1 += j;
        this.f70156I1++;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @TargetApi(29)
    /* JADX INFO: renamed from: E0 */
    public void mo10371E0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        if (this.f70173r1) {
            ByteBuffer byteBuffer = (ByteBuffer) p11.m167011e(decoderInputBuffer.f7378f);
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
                        m97033r2(m10415v0(), bArr);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: K1 */
    public final long m97039K1(long j, long j2, long j3, long j4, boolean z) {
        long jM10370D0 = (long) ((j4 - j) / ((double) m10370D0()));
        return z ? jM10370D0 - (j3 - j2) : jM10370D0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC1837d
    /* JADX INFO: renamed from: L */
    public void mo9636L() {
        m97041M1();
        m97040L1();
        this.f70176u1 = false;
        this.f70162O1 = null;
        try {
            super.mo9636L();
        } finally {
            this.f70166k1.m183080m(this.f7852d1);
            this.f70166k1.m183087t(val0.f180759e);
        }
    }

    /* JADX INFO: renamed from: L1 */
    public final void m97040L1() {
        InterfaceC1884c interfaceC1884cM10415v0;
        this.f70178w1 = false;
        if (vck0.f180948a < 23 || !this.f70160M1 || (interfaceC1884cM10415v0 = m10415v0()) == null) {
            return;
        }
        this.f70162O1 = new C15641c(interfaceC1884cM10415v0);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC1837d
    /* JADX INFO: renamed from: M */
    public void mo9637M(boolean z, boolean z2) throws ExoPlaybackException {
        super.mo9637M(z, z2);
        boolean z3 = m9764F().f92903a;
        p11.m167013g((z3 && this.f70161N1 == 0) ? false : true);
        if (this.f70160M1 != z3) {
            this.f70160M1 = z3;
            m10389e1();
        }
        this.f70166k1.m183082o(this.f7852d1);
        this.f70179x1 = z2;
        this.f70180y1 = false;
    }

    /* JADX INFO: renamed from: M1 */
    public final void m97041M1() {
        this.f70159L1 = null;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC1837d
    /* JADX INFO: renamed from: N */
    public void mo9638N(long j, boolean z) throws ExoPlaybackException {
        super.mo9638N(j, z);
        if (this.f70167l1.m97076f()) {
            this.f70167l1.m97073c();
        }
        m97040L1();
        this.f70165j1.m134497j();
        this.f70153F1 = -9223372036854775807L;
        this.f70181z1 = -9223372036854775807L;
        this.f70151D1 = 0;
        if (z) {
            m97061s2();
        } else {
            this.f70148A1 = -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: O1 */
    public boolean m97042O1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (ajx.class) {
            try {
                if (!f70146R1) {
                    f70147S1 = m97025S1();
                    f70146R1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f70147S1;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: P0 */
    public void mo9640P0(Exception exc) {
        jwv.m143684d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f70166k1.m183086s(exc);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC1837d
    @TargetApi(17)
    /* JADX INFO: renamed from: Q */
    public void mo9641Q() {
        try {
            super.mo9641Q();
        } finally {
            if (this.f70167l1.m97076f()) {
                this.f70167l1.m97084n();
            }
            if (this.f70175t1 != null) {
                m97057n2();
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: Q0 */
    public void mo9642Q0(String str, InterfaceC1884c.a aVar, long j, long j2) {
        this.f70166k1.m183078k(str, j, j2);
        this.f70172q1 = m97042O1(str);
        this.f70173r1 = ((C1885d) p11.m167011e(m10417w0())).m10519p();
        if (vck0.f180948a >= 23 && this.f70160M1) {
            this.f70162O1 = new C15641c((InterfaceC1884c) p11.m167011e(m10415v0()));
        }
        this.f70167l1.m97080j(str);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC1837d
    /* JADX INFO: renamed from: R */
    public void mo9643R() {
        super.mo9643R();
        this.f70150C1 = 0;
        this.f70149B1 = SystemClock.elapsedRealtime();
        this.f70154G1 = SystemClock.elapsedRealtime() * 1000;
        this.f70155H1 = 0L;
        this.f70156I1 = 0;
        this.f70165j1.m134498k();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: R0 */
    public void mo9644R0(String str) {
        this.f70166k1.m183079l(str);
    }

    /* JADX INFO: renamed from: R1 */
    public void m97043R1(InterfaceC1884c interfaceC1884c, int i, long j) {
        j5j0.m139865a("dropVideoBuffer");
        interfaceC1884c.releaseOutputBuffer(i, false);
        j5j0.m139867c();
        m97037B2(0, 1);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC1837d
    /* JADX INFO: renamed from: S */
    public void mo9645S() {
        this.f70148A1 = -9223372036854775807L;
        m97048e2();
        m97050g2();
        this.f70165j1.m134499l();
        super.mo9645S();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @Nullable
    /* JADX INFO: renamed from: S0 */
    public hhd mo9646S0(uyi uyiVar) throws ExoPlaybackException {
        hhd hhdVarMo9646S0 = super.mo9646S0(uyiVar);
        this.f70166k1.m183083p(uyiVar.f178866b, hhdVarMo9646S0);
        return hhdVarMo9646S0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: T0 */
    public void mo9647T0(C1871k c1871k, @Nullable MediaFormat mediaFormat) {
        int integer;
        int i;
        InterfaceC1884c interfaceC1884cM10415v0 = m10415v0();
        if (interfaceC1884cM10415v0 != null) {
            interfaceC1884cM10415v0.setVideoScalingMode(this.f70177v1);
        }
        int i2 = 0;
        if (this.f70160M1) {
            i = c1871k.f7753q;
            integer = c1871k.f7754r;
        } else {
            p11.m167011e(mediaFormat);
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i = integer2;
        }
        float f = c1871k.f7757u;
        if (m97022N1()) {
            int i3 = c1871k.f7756t;
            if (i3 == 90 || i3 == 270) {
                f = 1.0f / f;
                int i4 = integer;
                integer = i;
                i = i4;
            }
        } else if (!this.f70167l1.m97076f()) {
            i2 = c1871k.f7756t;
        }
        this.f70158K1 = new val0(i, integer, i2, f);
        this.f70165j1.m134494g(c1871k.f7755s);
        if (this.f70167l1.m97076f()) {
            this.f70167l1.m97085o(c1871k.m10282b().m10353n0(i).m10332S(integer).m10345f0(i2).m10342c0(f).m10320G());
        }
    }

    /* JADX INFO: renamed from: T1 */
    public Pair<de5, de5> m97044T1(@Nullable de5 de5Var) {
        if (de5.m111098f(de5Var)) {
            return de5Var.f85710c == 7 ? Pair.create(de5Var, de5Var.m111101b().m111107d(6).m111104a()) : Pair.create(de5Var, de5Var);
        }
        de5 de5Var2 = de5.f85701f;
        return Pair.create(de5Var2, de5Var2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @CallSuper
    /* JADX INFO: renamed from: V0 */
    public void mo10379V0(long j) {
        super.mo10379V0(j);
        if (this.f70160M1) {
            return;
        }
        this.f70152E1--;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: W0 */
    public void mo9649W0() {
        super.mo9649W0();
        m97040L1();
    }

    /* JADX INFO: renamed from: W1 */
    public C15640b m97045W1(C1885d c1885d, C1871k c1871k, C1871k[] c1871kArr) {
        int iM97026U1;
        int iMax = c1871k.f7753q;
        int iMax2 = c1871k.f7754r;
        int iM97029Y1 = m97029Y1(c1885d, c1871k);
        if (c1871kArr.length == 1) {
            if (iM97029Y1 != -1 && (iM97026U1 = m97026U1(c1885d, c1871k)) != -1) {
                iM97029Y1 = Math.min((int) (iM97029Y1 * 1.5f), iM97026U1);
            }
            return new C15640b(iMax, iMax2, iM97029Y1);
        }
        int length = c1871kArr.length;
        boolean z = false;
        for (int i = 0; i < length; i++) {
            C1871k c1871kM10320G = c1871kArr[i];
            if (c1871k.f7760x != null && c1871kM10320G.f7760x == null) {
                c1871kM10320G = c1871kM10320G.m10282b().m10325L(c1871k.f7760x).m10320G();
            }
            if (c1885d.m10512f(c1871k, c1871kM10320G).f107702d != 0) {
                int i2 = c1871kM10320G.f7753q;
                z |= i2 == -1 || c1871kM10320G.f7754r == -1;
                iMax = Math.max(iMax, i2);
                iMax2 = Math.max(iMax2, c1871kM10320G.f7754r);
                iM97029Y1 = Math.max(iM97029Y1, m97029Y1(c1885d, c1871kM10320G));
            }
        }
        if (z) {
            jwv.m143689i("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + BaseSei.f13930X + iMax2);
            Point pointM97027V1 = m97027V1(c1885d, c1871k);
            if (pointM97027V1 != null) {
                iMax = Math.max(iMax, pointM97027V1.x);
                iMax2 = Math.max(iMax2, pointM97027V1.y);
                iM97029Y1 = Math.max(iM97029Y1, m97026U1(c1885d, c1871k.m10282b().m10353n0(iMax).m10332S(iMax2).m10320G()));
                jwv.m143689i("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + BaseSei.f13930X + iMax2);
            }
        }
        return new C15640b(iMax, iMax2, iM97029Y1);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @CallSuper
    /* JADX INFO: renamed from: X0 */
    public void mo9650X0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        boolean z = this.f70160M1;
        if (!z) {
            this.f70152E1++;
        }
        if (vck0.f180948a >= 23 || !z) {
            return;
        }
        m97055l2(decoderInputBuffer.f7377e);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @CallSuper
    /* JADX INFO: renamed from: Y0 */
    public void mo10382Y0(C1871k c1871k) throws ExoPlaybackException {
        if (this.f70167l1.m97076f()) {
            return;
        }
        this.f70167l1.m97078h(c1871k, m10369C0());
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: Z */
    public hhd mo9651Z(C1885d c1885d, C1871k c1871k, C1871k c1871k2) {
        hhd hhdVarM10512f = c1885d.m10512f(c1871k, c1871k2);
        int i = hhdVarM10512f.f107703e;
        int i2 = c1871k2.f7753q;
        C15640b c15640b = this.f70171p1;
        if (i2 > c15640b.f70182a || c1871k2.f7754r > c15640b.f70183b) {
            i |= 256;
        }
        if (m97029Y1(c1885d, c1871k2) > this.f70171p1.f70184c) {
            i |= 64;
        }
        int i3 = i;
        return new hhd(c1885d.f7899a, c1871k, c1871k2, i3 != 0 ? 0 : hhdVarM10512f.f107702d, i3);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: a1 */
    public boolean mo9652a1(long j, long j2, @Nullable InterfaceC1884c interfaceC1884c, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C1871k c1871k) throws ExoPlaybackException {
        long j4;
        boolean z3;
        p11.m167011e(interfaceC1884c);
        if (this.f70181z1 == -9223372036854775807L) {
            this.f70181z1 = j;
        }
        if (j3 != this.f70153F1) {
            if (!this.f70167l1.m97076f()) {
                this.f70165j1.m134495h(j3);
            }
            this.f70153F1 = j3;
        }
        long jM10369C0 = j3 - m10369C0();
        if (z && !z2) {
            m97036A2(interfaceC1884c, i, jM10369C0);
            return true;
        }
        boolean z4 = getState() == 2;
        long jM97039K1 = m97039K1(j, j2, SystemClock.elapsedRealtime() * 1000, j3, z4);
        if (this.f70174s1 == this.f70175t1) {
            if (!m97031b2(jM97039K1)) {
                return false;
            }
            m97036A2(interfaceC1884c, i, jM10369C0);
            m97038C2(jM97039K1);
            return true;
        }
        if (m97066x2(j, jM97039K1)) {
            if (!this.f70167l1.m97076f()) {
                z3 = true;
            } else {
                if (!this.f70167l1.m97079i(c1871k, jM10369C0, z2)) {
                    return false;
                }
                z3 = false;
            }
            m97059p2(interfaceC1884c, c1871k, i, jM10369C0, z3);
            m97038C2(jM97039K1);
            return true;
        }
        if (z4 && j != this.f70181z1) {
            long jNanoTime = System.nanoTime();
            long jM134492b = this.f70165j1.m134492b((jM97039K1 * 1000) + jNanoTime);
            if (!this.f70167l1.m97076f()) {
                jM97039K1 = (jM134492b - jNanoTime) / 1000;
            }
            boolean z5 = this.f70148A1 != -9223372036854775807L;
            long j5 = jM97039K1;
            if (m97064v2(j5, j2, z2) && m97047d2(j, z5)) {
                return false;
            }
            if (m97065w2(j5, j2, z2)) {
                if (z5) {
                    m97036A2(interfaceC1884c, i, jM10369C0);
                } else {
                    m97043R1(interfaceC1884c, i, jM10369C0);
                }
                m97038C2(j5);
                return true;
            }
            if (this.f70167l1.m97076f()) {
                this.f70167l1.m97082l(j, j2);
                if (!this.f70167l1.m97079i(c1871k, jM10369C0, z2)) {
                    return false;
                }
                m97059p2(interfaceC1884c, c1871k, i, jM10369C0, false);
                return true;
            }
            if (vck0.f180948a >= 21) {
                if (j5 < 50000) {
                    if (jM134492b == this.f70157J1) {
                        m97036A2(interfaceC1884c, i, jM10369C0);
                        j4 = jM134492b;
                    } else {
                        m97054k2(jM10369C0, jM134492b, c1871k);
                        m97060q2(interfaceC1884c, i, jM10369C0, jM134492b);
                        j4 = jM134492b;
                    }
                    m97038C2(j5);
                    this.f70157J1 = j4;
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
                m97054k2(jM10369C0, jM134492b, c1871k);
                m97058o2(interfaceC1884c, i, jM10369C0);
                m97038C2(j5);
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(21)
    /* JADX INFO: renamed from: a2 */
    public MediaFormat m97046a2(C1871k c1871k, String str, C15640b c15640b, float f, boolean z, int i) {
        Pair<Integer, Integer> pairM10456r;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(IMediaFormat.KEY_MIME, str);
        mediaFormat.setInteger("width", c1871k.f7753q);
        mediaFormat.setInteger("height", c1871k.f7754r);
        tjx.m189419e(mediaFormat, c1871k.f7750n);
        tjx.m189417c(mediaFormat, "frame-rate", c1871k.f7755s);
        tjx.m189418d(mediaFormat, "rotation-degrees", c1871k.f7756t);
        tjx.m189416b(mediaFormat, c1871k.f7760x);
        if ("video/dolby-vision".equals(c1871k.f7748l) && (pairM10456r = MediaCodecUtil.m10456r(c1871k)) != null) {
            tjx.m189418d(mediaFormat, "profile", ((Integer) pairM10456r.first).intValue());
        }
        mediaFormat.setInteger("max-width", c15640b.f70182a);
        mediaFormat.setInteger("max-height", c15640b.f70183b);
        tjx.m189418d(mediaFormat, "max-input-size", c15640b.f70184c);
        if (vck0.f180948a >= 23) {
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
            m97023P1(mediaFormat, i);
        }
        return mediaFormat;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.InterfaceC2066x
    /* JADX INFO: renamed from: b */
    public boolean mo9653b() {
        PlaceholderSurface placeholderSurface;
        if (super.mo9653b() && ((!this.f70167l1.m97076f() || this.f70167l1.m97077g()) && (this.f70178w1 || (((placeholderSurface = this.f70175t1) != null && this.f70174s1 == placeholderSurface) || m10415v0() == null || this.f70160M1)))) {
            this.f70148A1 = -9223372036854775807L;
            return true;
        }
        if (this.f70148A1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f70148A1) {
            return true;
        }
        this.f70148A1 = -9223372036854775807L;
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.InterfaceC2066x
    /* JADX INFO: renamed from: c */
    public boolean mo9654c() {
        boolean zMo9654c = super.mo9654c();
        return this.f70167l1.m97076f() ? this.f70167l1.m97083m() & zMo9654c : zMo9654c;
    }

    /* JADX INFO: renamed from: d2 */
    public boolean m97047d2(long j, boolean z) throws ExoPlaybackException {
        int iM9774W = m9774W(j);
        if (iM9774W == 0) {
            return false;
        }
        dhd dhdVar = this.f7852d1;
        if (z) {
            dhdVar.f86265d += iM9774W;
            dhdVar.f86267f += this.f70152E1;
        } else {
            dhdVar.f86271j++;
            m97037B2(iM9774W, this.f70152E1);
        }
        m10412s0();
        if (this.f70167l1.m97076f()) {
            this.f70167l1.m97073c();
        }
        return true;
    }

    /* JADX INFO: renamed from: e2 */
    public final void m97048e2() {
        if (this.f70150C1 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f70166k1.m183081n(this.f70150C1, jElapsedRealtime - this.f70149B1);
            this.f70150C1 = 0;
            this.f70149B1 = jElapsedRealtime;
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC1837d, com.google.android.exoplayer2.C2004u.b
    /* JADX INFO: renamed from: f */
    public void mo9655f(int i, @Nullable Object obj) throws ExoPlaybackException {
        Surface surface;
        if (i == 1) {
            m97062t2(obj);
            return;
        }
        if (i == 7) {
            this.f70163P1 = (e5l0) obj;
            return;
        }
        if (i == 10) {
            int iIntValue = ((Integer) obj).intValue();
            if (this.f70161N1 != iIntValue) {
                this.f70161N1 = iIntValue;
                if (this.f70160M1) {
                    m10389e1();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            this.f70177v1 = ((Integer) obj).intValue();
            InterfaceC1884c interfaceC1884cM10415v0 = m10415v0();
            if (interfaceC1884cM10415v0 != null) {
                interfaceC1884cM10415v0.setVideoScalingMode(this.f70177v1);
                return;
            }
            return;
        }
        if (i == 5) {
            this.f70165j1.m134502o(((Integer) obj).intValue());
            return;
        }
        if (i == 13) {
            this.f70167l1.m97087q((List) p11.m167011e(obj));
            return;
        }
        if (i != 14) {
            super.mo9655f(i, obj);
            return;
        }
        sif0 sif0Var = (sif0) p11.m167011e(obj);
        if (sif0Var.m184338b() == 0 || sif0Var.m184337a() == 0 || (surface = this.f70174s1) == null) {
            return;
        }
        this.f70167l1.m97086p(surface, sif0Var);
    }

    /* JADX INFO: renamed from: f2 */
    public void m97049f2() {
        this.f70180y1 = true;
        if (this.f70178w1) {
            return;
        }
        this.f70178w1 = true;
        this.f70166k1.m183084q(this.f70174s1);
        this.f70176u1 = true;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @CallSuper
    /* JADX INFO: renamed from: g1 */
    public void mo10390g1() {
        super.mo10390g1();
        this.f70152E1 = 0;
    }

    /* JADX INFO: renamed from: g2 */
    public final void m97050g2() {
        int i = this.f70156I1;
        if (i != 0) {
            this.f70166k1.m183085r(this.f70155H1, i);
            this.f70155H1 = 0L;
            this.f70156I1 = 0;
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x, com.google.android.exoplayer2.InterfaceC2067y
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    /* JADX INFO: renamed from: h2 */
    public final void m97051h2(val0 val0Var) {
        if (val0Var.equals(val0.f180759e) || val0Var.equals(this.f70159L1)) {
            return;
        }
        this.f70159L1 = val0Var;
        this.f70166k1.m183087t(val0Var);
    }

    /* JADX INFO: renamed from: i2 */
    public final void m97052i2() {
        if (this.f70176u1) {
            this.f70166k1.m183084q(this.f70174s1);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.InterfaceC2066x
    @CallSuper
    /* JADX INFO: renamed from: j */
    public void mo10393j(long j, long j2) throws ExoPlaybackException {
        super.mo10393j(j, j2);
        if (this.f70167l1.m97076f()) {
            this.f70167l1.m97082l(j, j2);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: j0 */
    public MediaCodecDecoderException mo10394j0(Throwable th, @Nullable C1885d c1885d) {
        return new MediaCodecVideoDecoderException(th, c1885d, this.f70174s1);
    }

    /* JADX INFO: renamed from: j2 */
    public final void m97053j2() {
        val0 val0Var = this.f70159L1;
        if (val0Var != null) {
            this.f70166k1.m183087t(val0Var);
        }
    }

    /* JADX INFO: renamed from: k2 */
    public final void m97054k2(long j, long j2, C1871k c1871k) {
        e5l0 e5l0Var = this.f70163P1;
        if (e5l0Var != null) {
            e5l0Var.mo10130a(j, j2, c1871k, m10421z0());
        }
    }

    /* JADX INFO: renamed from: l2 */
    public void m97055l2(long j) throws ExoPlaybackException {
        m10420x1(j);
        m97051h2(this.f70158K1);
        this.f7852d1.f86266e++;
        m97049f2();
        mo10379V0(j);
    }

    /* JADX INFO: renamed from: m2 */
    public final void m97056m2() {
        m10401m1();
    }

    @RequiresApi(17)
    /* JADX INFO: renamed from: n2 */
    public final void m97057n2() {
        Surface surface = this.f70174s1;
        PlaceholderSurface placeholderSurface = this.f70175t1;
        if (surface == placeholderSurface) {
            this.f70174s1 = null;
        }
        placeholderSurface.release();
        this.f70175t1 = null;
    }

    /* JADX INFO: renamed from: o2 */
    public void m97058o2(InterfaceC1884c interfaceC1884c, int i, long j) {
        j5j0.m139865a("releaseOutputBuffer");
        interfaceC1884c.releaseOutputBuffer(i, true);
        j5j0.m139867c();
        this.f7852d1.f86266e++;
        this.f70151D1 = 0;
        if (this.f70167l1.m97076f()) {
            return;
        }
        this.f70154G1 = SystemClock.elapsedRealtime() * 1000;
        m97051h2(this.f70158K1);
        m97049f2();
    }

    /* JADX INFO: renamed from: p2 */
    public final void m97059p2(InterfaceC1884c interfaceC1884c, C1871k c1871k, int i, long j, boolean z) {
        long j2;
        long jM97074d = this.f70167l1.m97076f() ? this.f70167l1.m97074d(j, m10369C0()) * 1000 : System.nanoTime();
        if (z) {
            j2 = j;
            m97054k2(j2, jM97074d, c1871k);
        } else {
            j2 = j;
        }
        if (vck0.f180948a >= 21) {
            m97060q2(interfaceC1884c, i, j2, jM97074d);
        } else {
            m97058o2(interfaceC1884c, i, j2);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: q1 */
    public boolean mo10409q1(C1885d c1885d) {
        return this.f70174s1 != null || m97068z2(c1885d);
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: q2 */
    public void m97060q2(InterfaceC1884c interfaceC1884c, int i, long j, long j2) {
        j5j0.m139865a("releaseOutputBuffer");
        interfaceC1884c.releaseOutputBuffer(i, j2);
        j5j0.m139867c();
        this.f7852d1.f86266e++;
        this.f70151D1 = 0;
        if (this.f70167l1.m97076f()) {
            return;
        }
        this.f70154G1 = SystemClock.elapsedRealtime() * 1000;
        m97051h2(this.f70158K1);
        m97049f2();
    }

    /* JADX INFO: renamed from: s2 */
    public final void m97061s2() {
        this.f70148A1 = this.f70168m1 > 0 ? SystemClock.elapsedRealtime() + this.f70168m1 : -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: t1 */
    public int mo9659t1(InterfaceC1886e interfaceC1886e, C1871k c1871k) throws MediaCodecUtil.DecoderQueryException {
        boolean z;
        int i = 0;
        if (!n200.m157537s(c1871k.f7748l)) {
            return InterfaceC2067y.m12212v(0);
        }
        boolean z2 = c1871k.f7751o != null;
        List<C1885d> listM97028X1 = m97028X1(this.f70164i1, interfaceC1886e, c1871k, z2, false);
        if (z2 && listM97028X1.isEmpty()) {
            listM97028X1 = m97028X1(this.f70164i1, interfaceC1886e, c1871k, false, false);
        }
        if (listM97028X1.isEmpty()) {
            return InterfaceC2067y.m12212v(1);
        }
        if (!MediaCodecRenderer.m10367u1(c1871k)) {
            return InterfaceC2067y.m12212v(2);
        }
        C1885d c1885d = listM97028X1.get(0);
        boolean zM10518o = c1885d.m10518o(c1871k);
        if (!zM10518o) {
            int i2 = 1;
            while (true) {
                if (i2 >= listM97028X1.size()) {
                    z = true;
                    break;
                }
                C1885d c1885d2 = listM97028X1.get(i2);
                if (c1885d2.m10518o(c1871k)) {
                    z = false;
                    zM10518o = true;
                    c1885d = c1885d2;
                    break;
                }
                i2++;
            }
        } else {
            z = true;
            break;
        }
        int i3 = zM10518o ? 4 : 3;
        int i4 = c1885d.m10521r(c1871k) ? 16 : 8;
        int i5 = c1885d.f7906h ? 64 : 0;
        int i6 = z ? 128 : 0;
        if (vck0.f180948a >= 26 && "video/dolby-vision".equals(c1871k.f7748l) && !C15639a.m97069a(this.f70164i1)) {
            i6 = 256;
        }
        if (zM10518o) {
            List<C1885d> listM97028X2 = m97028X1(this.f70164i1, interfaceC1886e, c1871k, z2, true);
            if (!listM97028X2.isEmpty()) {
                C1885d c1885d3 = MediaCodecUtil.m10461w(listM97028X2, c1871k).get(0);
                if (c1885d3.m10518o(c1871k) && c1885d3.m10521r(c1871k)) {
                    i = 32;
                }
            }
        }
        return InterfaceC2067y.m12210t(i3, i4, i, i5, i6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.i5l0] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.exoplayer2.d, com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, l.ajx] */
    /* JADX WARN: Type inference failed for: r4v2, types: [l.ajx$d] */
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
    public final void m97062t2(@Nullable Object obj) throws ExoPlaybackException {
        ?? M12179c;
        Surface surface;
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            M12179c = 0;
        }
        if (M12179c == 0) {
            PlaceholderSurface placeholderSurface = this.f70175t1;
            if (placeholderSurface != null) {
                M12179c = surface;
                M12179c = placeholderSurface;
            } else {
                C1885d c1885dM10417w0 = m10417w0();
                if (c1885dM10417w0 != null && m97068z2(c1885dM10417w0)) {
                    M12179c = surface;
                    M12179c = PlaceholderSurface.m12179c(this.f70164i1, c1885dM10417w0.f7905g);
                    this.f70175t1 = M12179c;
                }
            }
        }
        M12179c = surface;
        M12179c = surface;
        M12179c = surface;
        if (this.f70174s1 == M12179c) {
            if (M12179c == 0 || M12179c == this.f70175t1) {
                return;
            }
            m97053j2();
            m97052i2();
            return;
        }
        this.f70174s1 = M12179c;
        this.f70165j1.m134500m(M12179c);
        this.f70176u1 = false;
        int state = getState();
        InterfaceC1884c interfaceC1884cM10415v0 = m10415v0();
        if (interfaceC1884cM10415v0 != null && !this.f70167l1.m97076f()) {
            if (vck0.f180948a < 23 || M12179c == 0 || this.f70172q1) {
                m10389e1();
                m10377N0();
            } else {
                m97063u2(interfaceC1884cM10415v0, M12179c);
            }
        }
        if (M12179c == 0 || M12179c == this.f70175t1) {
            m97041M1();
            m97040L1();
            if (this.f70167l1.m97076f()) {
                this.f70167l1.m97072b();
                return;
            }
            return;
        }
        m97053j2();
        m97040L1();
        if (state == 2) {
            m97061s2();
        }
        if (this.f70167l1.m97076f()) {
            this.f70167l1.m97086p(M12179c, sif0.f164712c);
        }
    }

    @RequiresApi(23)
    /* JADX INFO: renamed from: u2 */
    public void m97063u2(InterfaceC1884c interfaceC1884c, Surface surface) {
        interfaceC1884c.setOutputSurface(surface);
    }

    /* JADX INFO: renamed from: v2 */
    public boolean m97064v2(long j, long j2, boolean z) {
        return m97032c2(j) && !z;
    }

    /* JADX INFO: renamed from: w2 */
    public boolean m97065w2(long j, long j2, boolean z) {
        return m97031b2(j) && !z;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: x0 */
    public boolean mo10419x0() {
        return this.f70160M1 && vck0.f180948a < 23;
    }

    /* JADX INFO: renamed from: x2 */
    public final boolean m97066x2(long j, long j2) {
        boolean z = getState() == 2;
        return this.f70148A1 == -9223372036854775807L && j >= m10369C0() && ((this.f70180y1 ? !this.f70178w1 : !(!z && !this.f70179x1)) || (z && m97067y2(j2, (SystemClock.elapsedRealtime() * 1000) - this.f70154G1)));
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: y0 */
    public float mo9660y0(float f, C1871k c1871k, C1871k[] c1871kArr) {
        float fMax = -1.0f;
        for (C1871k c1871k2 : c1871kArr) {
            float f2 = c1871k2.f7755s;
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
    public boolean m97067y2(long j, long j2) {
        return m97031b2(j) && j2 > 100000;
    }

    /* JADX INFO: renamed from: z2 */
    public final boolean m97068z2(C1885d c1885d) {
        if (vck0.f180948a < 23 || this.f70160M1 || m97042O1(c1885d.f7899a)) {
            return false;
        }
        return !c1885d.f7905g || PlaceholderSurface.m12178b(this.f70164i1);
    }

    public ajx(Context context, InterfaceC1884c.b bVar, InterfaceC1886e interfaceC1886e, long j, boolean z, @Nullable Handler handler, @Nullable sal0 sal0Var, int i) {
        this(context, bVar, interfaceC1886e, j, z, handler, sal0Var, i, 30.0f);
    }
}
