package p153l;

import android.content.Context;
import android.graphics.PointF;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.opengl.EGLContext;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.heytap.mcssdk.mode.CommandMessage;
import com.immomo.mediabase.Nalu;
import com.immomo.mediacore.sink.IjkWriter;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.immomo.mediacore.strinf.NotifyCenter;
import com.immomo.mediacore.strinf.VideoQuality;
import com.immomo.medialog.util.LimitedQueue;
import com.momo.pipline.MomoInterface.MomoCodec;
import com.momo.pipline.MomoInterface.MomoPipeline;
import com.momo.pipline.codec.MediaBaseCodecFilter;
import com.momo.piplinemomoext.input.audio.ExtAudioWrapper;
import com.tencent.liteav.audio.TXEAudioDef;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.jetty.util.StringUtil;

/* JADX INFO: loaded from: classes8.dex */
public class s410 extends grx implements g220, NotifyCenter, fb1, wyl, o410.InterfaceC19026f {

    /* JADX INFO: renamed from: A1 */
    private int f166052A1;

    /* JADX INFO: renamed from: A2 */
    private boolean f166053A2;

    /* JADX INFO: renamed from: B1 */
    private int f166054B1;

    /* JADX INFO: renamed from: B2 */
    private volatile boolean f166055B2;

    /* JADX INFO: renamed from: C1 */
    private int f166056C1;

    /* JADX INFO: renamed from: C2 */
    private long f166057C2;

    /* JADX INFO: renamed from: D1 */
    private int f166058D1;

    /* JADX INFO: renamed from: D2 */
    private long f166059D2;

    /* JADX INFO: renamed from: E1 */
    private boolean f166060E1;

    /* JADX INFO: renamed from: E2 */
    private final Pattern f166061E2;

    /* JADX INFO: renamed from: F1 */
    private boolean f166062F1;

    /* JADX INFO: renamed from: F2 */
    private final Pattern f166063F2;

    /* JADX INFO: renamed from: G1 */
    private boolean f166064G1;

    /* JADX INFO: renamed from: G2 */
    private final Pattern f166065G2;

    /* JADX INFO: renamed from: H1 */
    private boolean f166066H1;

    /* JADX INFO: renamed from: H2 */
    private long f166067H2;

    /* JADX INFO: renamed from: I1 */
    private boolean f166068I1;

    /* JADX INFO: renamed from: I2 */
    private String f166069I2;

    /* JADX INFO: renamed from: J1 */
    private q210.InterfaceC19500a f166070J1;

    /* JADX INFO: renamed from: J2 */
    private int f166071J2;

    /* JADX INFO: renamed from: K1 */
    public fb1 f166072K1;

    /* JADX INFO: renamed from: K2 */
    public HandlerThread f166073K2;

    /* JADX INFO: renamed from: L1 */
    private kod0 f166074L1;

    /* JADX INFO: renamed from: L2 */
    public HandlerC19974c f166075L2;

    /* JADX INFO: renamed from: M1 */
    protected long f166076M1;

    /* JADX INFO: renamed from: M2 */
    public LimitedQueue<Integer> f166077M2;

    /* JADX INFO: renamed from: N1 */
    protected long f166078N1;

    /* JADX INFO: renamed from: N2 */
    private int f166079N2;

    /* JADX INFO: renamed from: O1 */
    private boolean f166080O1;

    /* JADX INFO: renamed from: O2 */
    private int f166081O2;

    /* JADX INFO: renamed from: P1 */
    private long f166082P1;

    /* JADX INFO: renamed from: Q1 */
    private long f166083Q1;

    /* JADX INFO: renamed from: R1 */
    private long f166084R1;

    /* JADX INFO: renamed from: S1 */
    private long f166085S1;

    /* JADX INFO: renamed from: T1 */
    private rp1 f166086T1;

    /* JADX INFO: renamed from: U1 */
    private long f166087U1;

    /* JADX INFO: renamed from: V1 */
    private long f166088V1;

    /* JADX INFO: renamed from: W1 */
    private int[] f166089W1;

    /* JADX INFO: renamed from: X1 */
    private int f166090X1;

    /* JADX INFO: renamed from: Y1 */
    private LimitedQueue<Integer> f166091Y1;

    /* JADX INFO: renamed from: Z1 */
    private lob0 f166092Z1;

    /* JADX INFO: renamed from: a2 */
    private Handler f166093a2;

    /* JADX INFO: renamed from: b2 */
    private p4k0 f166094b2;

    /* JADX INFO: renamed from: c2 */
    private int f166095c2;

    /* JADX INFO: renamed from: d2 */
    private int f166096d2;

    /* JADX INFO: renamed from: e2 */
    private long f166097e2;

    /* JADX INFO: renamed from: f2 */
    private long f166098f2;

    /* JADX INFO: renamed from: g2 */
    private long f166099g2;

    /* JADX INFO: renamed from: h2 */
    private boolean f166100h2;

    /* JADX INFO: renamed from: i2 */
    private int f166101i2;

    /* JADX INFO: renamed from: j2 */
    private long f166102j2;

    /* JADX INFO: renamed from: k2 */
    private long f166103k2;

    /* JADX INFO: renamed from: l1 */
    IjkWriter f166104l1;

    /* JADX INFO: renamed from: l2 */
    private long f166105l2;

    /* JADX INFO: renamed from: m1 */
    private long f166106m1;

    /* JADX INFO: renamed from: m2 */
    private boolean f166107m2;

    /* JADX INFO: renamed from: n1 */
    private long f166108n1;

    /* JADX INFO: renamed from: n2 */
    private LinkedList<C19973b> f166109n2;

    /* JADX INFO: renamed from: o1 */
    private ByteBuffer f166110o1;

    /* JADX INFO: renamed from: o2 */
    private LinkedList<Long> f166111o2;

    /* JADX INFO: renamed from: p1 */
    boolean f166112p1;

    /* JADX INFO: renamed from: p2 */
    private int f166113p2;

    /* JADX INFO: renamed from: q1 */
    private int f166114q1;

    /* JADX INFO: renamed from: q2 */
    private long f166115q2;

    /* JADX INFO: renamed from: r1 */
    private String f166116r1;

    /* JADX INFO: renamed from: r2 */
    private long f166117r2;

    /* JADX INFO: renamed from: s1 */
    private String f166118s1;

    /* JADX INFO: renamed from: s2 */
    private long f166119s2;

    /* JADX INFO: renamed from: t1 */
    private long f166120t1;

    /* JADX INFO: renamed from: t2 */
    private long f166121t2;

    /* JADX INFO: renamed from: u1 */
    private long f166122u1;

    /* JADX INFO: renamed from: u2 */
    private long f166123u2;

    /* JADX INFO: renamed from: v1 */
    private long f166124v1;

    /* JADX INFO: renamed from: v2 */
    private long f166125v2;

    /* JADX INFO: renamed from: w1 */
    private long f166126w1;

    /* JADX INFO: renamed from: w2 */
    private boolean f166127w2;

    /* JADX INFO: renamed from: x1 */
    private long f166128x1;

    /* JADX INFO: renamed from: x2 */
    private long f166129x2;

    /* JADX INFO: renamed from: y1 */
    private long f166130y1;

    /* JADX INFO: renamed from: y2 */
    private int f166131y2;

    /* JADX INFO: renamed from: z1 */
    private int f166132z1;

    /* JADX INFO: renamed from: z2 */
    private C19975d f166133z2;

    /* JADX INFO: renamed from: l.s410$b */
    public class C19973b {

        /* JADX INFO: renamed from: a */
        public ByteBuffer f166134a;

        /* JADX INFO: renamed from: b */
        public long f166135b;

        /* JADX INFO: renamed from: c */
        public long f166136c;

        /* JADX INFO: renamed from: d */
        public int f166137d;

        /* JADX INFO: renamed from: e */
        public long f166138e;

        private C19973b() {
        }
    }

    /* JADX INFO: renamed from: l.s410$c */
    public class HandlerC19974c extends Handler {
        public HandlerC19974c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            if (message.what != 202) {
                return;
            }
            long jM184418i4 = s410.this.m184418i4();
            long jMo21000b1 = s410.this.mo21000b1();
            int i = (int) jM184418i4;
            int i2 = i - s410.this.f166079N2;
            int i3 = (int) jMo21000b1;
            int i4 = i3 - s410.this.f166081O2;
            if (s410.this.f166092Z1 != null) {
                s410.this.f166092Z1.m155045c(i2, i4);
            }
            s410.this.f166077M2.add(Integer.valueOf(i2));
            s410.this.f166079N2 = i;
            s410.this.f166081O2 = i3;
            sendEmptyMessageDelayed(202, 1000L);
        }
    }

    /* JADX INFO: renamed from: l.s410$d */
    public class C19975d {

        /* JADX INFO: renamed from: a */
        private int f166141a = -1;

        /* JADX INFO: renamed from: b */
        private int f166142b = -1;

        /* JADX INFO: renamed from: c */
        private int f166143c = -1;

        /* JADX INFO: renamed from: d */
        private int f166144d = -1;

        /* JADX INFO: renamed from: e */
        private int f166145e = -1;

        /* JADX INFO: renamed from: f */
        private int f166146f = -1;

        /* JADX INFO: renamed from: g */
        private long f166147g = 0;

        public C19975d() {
        }

        /* JADX WARN: Code duplicated, block: B:56:0x019c  */
        /* JADX WARN: Code duplicated, block: B:57:0x019d  */
        /* JADX WARN: Code duplicated, block: B:60:0x01a9 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x000f, B:12:0x001c, B:16:0x0028, B:18:0x002f, B:20:0x003b, B:22:0x0047, B:41:0x00b0, B:23:0x004b, B:25:0x0059, B:27:0x0063, B:29:0x0070, B:31:0x007d, B:32:0x0080, B:34:0x008a, B:36:0x0094, B:38:0x00a1, B:40:0x00ae, B:43:0x00ed, B:45:0x00f3, B:47:0x00f6, B:54:0x0168, B:58:0x019e, B:60:0x01a9, B:49:0x0134, B:51:0x0138, B:53:0x013d), top: B:65:0x0005 }] */
        /* JADX INFO: renamed from: e */
        private synchronized void m184426e(int i) {
            int iM197025b;
            long j;
            if (((MediaBaseCodecFilter) s410.this).f15000s.f180168M0 || s410.this.f166127w2) {
                if (((MediaBaseCodecFilter) s410.this).f15000s.f180169N0 <= 0) {
                    return;
                }
                int i2 = 1;
                if (this.f166141a == -1) {
                    if (((MediaBaseCodecFilter) s410.this).f15000s.f175494m == 528 && ((MediaBaseCodecFilter) s410.this).f15000s.f175496n == 960) {
                        this.f166141a = 2;
                    } else if (((MediaBaseCodecFilter) s410.this).f15000s.f175494m == 352 && ((MediaBaseCodecFilter) s410.this).f15000s.f175496n == 640 && (((MediaBaseCodecFilter) s410.this).f15000s.f175451H == 750000 || ((MediaBaseCodecFilter) s410.this).f15000s.f175451H == 768000)) {
                        this.f166141a = 1;
                    } else if (((MediaBaseCodecFilter) s410.this).f15000s.f175494m == 352 && ((MediaBaseCodecFilter) s410.this).f15000s.f175496n == 640 && (((MediaBaseCodecFilter) s410.this).f15000s.f175451H == 500000 || ((MediaBaseCodecFilter) s410.this).f15000s.f175451H == 512000)) {
                        this.f166141a = 0;
                    }
                    this.f166142b = this.f166141a;
                    oq70.m168791d().m168793a("Pipeline_Flow_pip->MOMO", "jzheng init current level " + this.f166142b + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((MediaBaseCodecFilter) s410.this).f15000s.f175451H + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((MediaBaseCodecFilter) s410.this).f15000s.f175494m);
                }
                if (i == 0) {
                    int i3 = this.f166141a;
                    int i4 = this.f166142b;
                    if (i3 != i4 && i4 + 1 <= i3) {
                        oq70.m168791d().m168793a("Pipeline_Flow_pip->MOMO", "jzheng 网络拥塞解除。" + s410.this.f166123u2);
                        this.f166142b = this.f166142b + 1;
                        s410 s410Var = s410.this;
                        s410Var.f166071J2 = ((MediaBaseCodecFilter) s410Var).f15000s.f175451H;
                        jq70.m146555a(((MediaBaseCodecFilter) s410.this).f15000s, this.f166142b);
                        s410.this.m184399w4(0, 0);
                        s410 s410Var2 = s410.this;
                        s410Var2.f166095c2 = ((MediaBaseCodecFilter) s410Var2).f15000s.f175494m;
                        s410 s410Var3 = s410.this;
                        s410Var3.f166096d2 = ((MediaBaseCodecFilter) s410Var3).f15000s.f175496n;
                        s410.this.f166123u2 = 0L;
                        s410.m184376k3(s410.this);
                        iM197025b = ((MediaBaseCodecFilter) s410.this).f15000s.m197025b();
                        if (s410.this.f166127w2) {
                            i2 = iM197025b;
                        }
                        j = i2;
                        if (s410.this.f166125v2 > j) {
                            s410.this.f166125v2 = j;
                        }
                    }
                } else if (i == 1 && this.f166141a != 0 && this.f166142b - 1 >= 0) {
                    oq70.m168791d().m168793a("Pipeline_Flow_pip->MOMO", "jzheng 进入拥塞。");
                    this.f166142b--;
                    s410 s410Var4 = s410.this;
                    s410Var4.f166071J2 = ((MediaBaseCodecFilter) s410Var4).f15000s.f175451H;
                    jq70.m146555a(((MediaBaseCodecFilter) s410.this).f15000s, this.f166142b);
                    s410.this.m184399w4(1, 0);
                    s410 s410Var5 = s410.this;
                    s410Var5.f166095c2 = ((MediaBaseCodecFilter) s410Var5).f15000s.f175494m;
                    s410 s410Var6 = s410.this;
                    s410Var6.f166096d2 = ((MediaBaseCodecFilter) s410Var6).f15000s.f175496n;
                    s410.this.f166123u2 = 0L;
                    s410.m184376k3(s410.this);
                    iM197025b = ((MediaBaseCodecFilter) s410.this).f15000s.m197025b();
                    if (s410.this.f166127w2) {
                        i2 = iM197025b;
                    }
                    j = i2;
                    if (s410.this.f166125v2 > j) {
                        s410.this.f166125v2 = j;
                    }
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:47:0x0191  */
        /* JADX WARN: Code duplicated, block: B:48:0x0192 A[Catch: all -> 0x001f, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0013, B:12:0x0022, B:14:0x0027, B:17:0x006a, B:20:0x0072, B:22:0x0081, B:23:0x0083, B:45:0x0167, B:49:0x019c, B:51:0x01a7, B:48:0x0192, B:24:0x00a0, B:26:0x00d5, B:28:0x00dd, B:30:0x00e6, B:32:0x00f1, B:33:0x00f7, B:35:0x010c, B:39:0x011e, B:41:0x0122, B:44:0x0144, B:52:0x01ad), top: B:57:0x0005 }] */
        /* JADX WARN: Code duplicated, block: B:51:0x01a7 A[Catch: all -> 0x001f, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0013, B:12:0x0022, B:14:0x0027, B:17:0x006a, B:20:0x0072, B:22:0x0081, B:23:0x0083, B:45:0x0167, B:49:0x019c, B:51:0x01a7, B:48:0x0192, B:24:0x00a0, B:26:0x00d5, B:28:0x00dd, B:30:0x00e6, B:32:0x00f1, B:33:0x00f7, B:35:0x010c, B:39:0x011e, B:41:0x0122, B:44:0x0144, B:52:0x01ad), top: B:57:0x0005 }] */
        /* JADX INFO: renamed from: f */
        private synchronized void m184427f(int i) {
            int length;
            long j;
            if (((MediaBaseCodecFilter) s410.this).f14987H.f191104s == 111 || !((MediaBaseCodecFilter) s410.this).f15000s.f180179X0) {
                if (this.f166143c == -1) {
                    int i2 = s410.this.m20728Z1().f175451H;
                    this.f166143c = i2;
                    this.f166144d = i2;
                    t9c.m189743a("newBitrate", "jzheng init  " + this.f166144d + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + s410.this.m20728Z1().f175451H + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((MediaBaseCodecFilter) s410.this).f15000s.f175494m);
                }
                int iM197025b = 1;
                if (i == 0) {
                    int i3 = this.f166143c;
                    int i4 = this.f166144d;
                    if (i3 == i4 || i4 >= i3) {
                        b7y.m102882c().m102888g("NOT PUSH_LEVEL_CHANGE_UP origBitrate:" + this.f166143c + ", currBitrate:" + this.f166144d + ",audioBufCheckCount:" + s410.this.f166123u2);
                    } else {
                        int iM112284Q = i4 + csx.m112235R().m112284Q();
                        this.f166144d = iM112284Q;
                        int i5 = this.f166143c;
                        if (iM112284Q > i5) {
                            this.f166144d = i5;
                        }
                        s410 s410Var = s410.this;
                        s410Var.f166071J2 = s410Var.m20728Z1().f175451H;
                        jq70.m146557c(((MediaBaseCodecFilter) s410.this).f15000s, this.f166144d);
                        s410.this.m184399w4(0, 0);
                        s410 s410Var2 = s410.this;
                        s410Var2.f166095c2 = s410Var2.m20728Z1().f175494m;
                        s410 s410Var3 = s410.this;
                        s410Var3.f166096d2 = s410Var3.m20728Z1().f175496n;
                        s410.this.f166123u2 = 0L;
                        s410.m184376k3(s410.this);
                        if (s410.this.f166127w2) {
                            iM197025b = s410.this.m20728Z1().m197025b();
                        }
                        j = iM197025b;
                        if (s410.this.f166125v2 > j) {
                            s410.this.f166125v2 = j;
                        }
                    }
                } else if (i == 1) {
                    if (s410.this.f166089W1 == null || s410.this.f166089W1.length <= 0) {
                        length = 0;
                    } else {
                        int i6 = 0;
                        for (int i7 : s410.this.f166089W1) {
                            i6 += i7;
                        }
                        length = (int) (((double) (i6 / s410.this.f166089W1.length)) * csx.m112235R().m112345i());
                    }
                    s410 s410Var4 = s410.this;
                    int iM184363a4 = s410Var4.m184363a4(((MediaBaseCodecFilter) s410Var4).f15000s);
                    if (this.f166143c != 0 && length > 0 && length >= iM184363a4 && length < this.f166144d) {
                        this.f166144d = length;
                        s410 s410Var5 = s410.this;
                        s410Var5.f166071J2 = s410Var5.m20728Z1().f175451H;
                        jq70.m146557c(((MediaBaseCodecFilter) s410.this).f15000s, this.f166144d);
                        s410.this.m184399w4(1, 0);
                    } else if (length < 0 || length >= iM184363a4) {
                        b7y.m102882c().m102888g("videoDynamicScaling_2 newbitrate:" + length + ",curr_min_bit:" + iM184363a4 + ",currbit:" + this.f166144d);
                    } else {
                        this.f166144d = Math.min(iM184363a4, this.f166144d);
                        s410 s410Var6 = s410.this;
                        s410Var6.f166071J2 = s410Var6.m20728Z1().f175451H;
                        jq70.m146557c(((MediaBaseCodecFilter) s410.this).f15000s, this.f166144d);
                        s410.this.m184399w4(1, 1);
                    }
                    s410 s410Var7 = s410.this;
                    s410Var7.f166095c2 = s410Var7.m20728Z1().f175494m;
                    s410 s410Var8 = s410.this;
                    s410Var8.f166096d2 = s410Var8.m20728Z1().f175496n;
                    s410.this.f166123u2 = 0L;
                    s410.m184376k3(s410.this);
                    if (s410.this.f166127w2) {
                        iM197025b = s410.this.m20728Z1().m197025b();
                    }
                    j = iM197025b;
                    if (s410.this.f166125v2 > j) {
                        s410.this.f166125v2 = j;
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public synchronized void m184428g() {
            try {
                long j = this.f166147g + 1;
                this.f166147g = j;
                long j2 = j % 2;
                if (j2 == 0) {
                    t9c.m189743a("newBitrate", "jzheng 网络拥塞解除。" + s410.this.f166123u2);
                    s410 s410Var = s410.this;
                    s410Var.f166071J2 = s410Var.m20728Z1().f175451H;
                    ((MediaBaseCodecFilter) s410.this).f15000s.f175494m = 528;
                    ((MediaBaseCodecFilter) s410.this).f15000s.f175496n = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
                    ((MediaBaseCodecFilter) s410.this).f15000s.f175451H = 1024000;
                    s410.this.m184399w4(0, 0);
                } else if (j2 == 1) {
                    t9c.m189743a("newBitrate", "jzheng 进入拥塞。");
                    s410 s410Var2 = s410.this;
                    s410Var2.f166071J2 = s410Var2.m20728Z1().f175451H;
                    ((MediaBaseCodecFilter) s410.this).f15000s.f175494m = 352;
                    ((MediaBaseCodecFilter) s410.this).f15000s.f175496n = 640;
                    ((MediaBaseCodecFilter) s410.this).f15000s.f175451H = 750000;
                    s410.this.m184399w4(1, 0);
                }
                s410 s410Var3 = s410.this;
                s410Var3.f166095c2 = s410Var3.m20728Z1().f175494m;
                s410 s410Var4 = s410.this;
                s410Var4.f166096d2 = s410Var4.m20728Z1().f175496n;
                s410.this.f166123u2 = 0L;
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX WARN: Code duplicated, block: B:37:0x01a5  */
        /* JADX WARN: Code duplicated, block: B:38:0x01a6 A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:4:0x0009, B:6:0x0013, B:9:0x0023, B:11:0x0028, B:14:0x0069, B:16:0x006d, B:19:0x00a0, B:22:0x00c9, B:24:0x00dc, B:25:0x00df, B:35:0x017b, B:39:0x01b0, B:41:0x01bb, B:38:0x01a6, B:27:0x0100, B:29:0x0135, B:31:0x0141, B:33:0x0159, B:34:0x015e), top: B:48:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x01bb A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #0 {all -> 0x0066, blocks: (B:4:0x0009, B:6:0x0013, B:9:0x0023, B:11:0x0028, B:14:0x0069, B:16:0x006d, B:19:0x00a0, B:22:0x00c9, B:24:0x00dc, B:25:0x00df, B:35:0x017b, B:39:0x01b0, B:41:0x01bb, B:38:0x01a6, B:27:0x0100, B:29:0x0135, B:31:0x0141, B:33:0x0159, B:34:0x015e), top: B:48:0x0009 }] */
        /* JADX INFO: renamed from: h */
        private synchronized void m184429h(int i) {
            long j;
            try {
                if (s410.this.m20728Z1().f180168M0 && ((MediaBaseCodecFilter) s410.this).f14987H.f191104s == 111) {
                    if (this.f166143c == -1) {
                        this.f166143c = s410.this.m20728Z1().f175451H;
                        t9c.m189743a("newBitrate", "jzheng init  " + this.f166144d + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + s410.this.m20728Z1().f175451H + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((MediaBaseCodecFilter) s410.this).f15000s.f175494m);
                    }
                    if (this.f166145e == -1) {
                        int i2 = s410.this.m20728Z1().f175449F;
                        this.f166145e = i2;
                        this.f166146f = i2;
                        t9c.m189743a("newBitrate", "jzheng fps  " + this.f166146f + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + s410.this.m20728Z1().f175449F);
                    }
                    int iM197025b = 1;
                    if (i == 0) {
                        oq70.m168791d().m168795c("Pipeline_Flow_pip->MOMO", "up：,origBitrate=" + this.f166143c + ",currBitrate=" + this.f166144d);
                        int i3 = this.f166143c;
                        int i4 = this.f166144d;
                        if (i3 != i4 && i4 < i3) {
                            oq70.m168791d().m168795c("Pipeline_Flow_pip->MOMO", "网络拥塞解除:----up");
                            int i5 = this.f166146f;
                            if (i5 + 1 <= this.f166145e) {
                                this.f166146f = i5 + 1;
                            }
                            s410 s410Var = s410.this;
                            s410Var.f166071J2 = s410Var.m20728Z1().f175451H;
                            jq70.m146556b(((MediaBaseCodecFilter) s410.this).f15000s, this.f166144d, this.f166146f);
                            s410.this.m184399w4(0, 0);
                            s410 s410Var2 = s410.this;
                            s410Var2.f166095c2 = s410Var2.m20728Z1().f175494m;
                            s410 s410Var3 = s410.this;
                            s410Var3.f166096d2 = s410Var3.m20728Z1().f175496n;
                            s410.this.f166123u2 = 0L;
                            s410.m184376k3(s410.this);
                            if (s410.this.f166127w2) {
                                iM197025b = s410.this.m20728Z1().m197025b();
                            }
                            j = iM197025b;
                            if (s410.this.f166125v2 > j) {
                                s410.this.f166125v2 = j;
                            }
                        }
                    } else if (i == 1) {
                        oq70.m168791d().m168795c("Pipeline_Flow_pip->MOMO", "down：,origBitrate=" + this.f166143c + ",currBitrate=" + this.f166144d + ",getAdapt_br_min()=" + csx.m112235R().m112357l());
                        if (this.f166143c != 0 && this.f166144d >= csx.m112235R().m112357l()) {
                            oq70.m168791d().m168795c("Pipeline_Flow_pip->MOMO", "进入拥塞: down");
                            if (this.f166146f - 1 >= csx.m112235R().m112365n()) {
                                this.f166146f--;
                            }
                            s410 s410Var4 = s410.this;
                            s410Var4.f166071J2 = s410Var4.m20728Z1().f175451H;
                            jq70.m146556b(((MediaBaseCodecFilter) s410.this).f15000s, this.f166144d, this.f166146f);
                            s410.this.m184399w4(1, 0);
                            s410 s410Var5 = s410.this;
                            s410Var5.f166095c2 = s410Var5.m20728Z1().f175494m;
                            s410 s410Var6 = s410.this;
                            s410Var6.f166096d2 = s410Var6.m20728Z1().f175496n;
                            s410.this.f166123u2 = 0L;
                            s410.m184376k3(s410.this);
                            if (s410.this.f166127w2) {
                                iM197025b = s410.this.m20728Z1().m197025b();
                            }
                            j = iM197025b;
                            if (s410.this.f166125v2 > j) {
                                s410.this.f166125v2 = j;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX INFO: renamed from: c */
        public void m184430c(int i, boolean z) {
            if (z) {
                if (csx.m112235R().m112273M0()) {
                    m184429h(i);
                }
            } else if (csx.m112235R().m112334f0()) {
                m184427f(i);
            } else {
                m184426e(i);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m184431d() {
            this.f166143c = -1;
        }
    }

    public s410(Context context, q210.InterfaceC19500a interfaceC19500a) {
        super(context);
        this.f166106m1 = 0L;
        this.f166108n1 = 0L;
        this.f166112p1 = false;
        this.f166120t1 = 0L;
        this.f166122u1 = 0L;
        this.f166124v1 = 0L;
        this.f166126w1 = 0L;
        this.f166128x1 = 0L;
        this.f166130y1 = 0L;
        this.f166132z1 = 0;
        this.f166052A1 = 0;
        this.f166054B1 = 0;
        this.f166056C1 = 0;
        this.f166058D1 = 0;
        this.f166060E1 = false;
        this.f166062F1 = false;
        this.f166064G1 = false;
        this.f166066H1 = false;
        this.f166068I1 = false;
        this.f166072K1 = null;
        this.f166076M1 = 0L;
        this.f166078N1 = 0L;
        this.f166080O1 = false;
        this.f166082P1 = 0L;
        this.f166083Q1 = -130L;
        this.f166084R1 = -1L;
        this.f166085S1 = -1L;
        this.f166087U1 = -1L;
        this.f166088V1 = 0L;
        this.f166090X1 = 0;
        this.f166093a2 = new Handler(Looper.getMainLooper());
        this.f166095c2 = 0;
        this.f166096d2 = 0;
        this.f166097e2 = 0L;
        this.f166098f2 = 0L;
        this.f166099g2 = 0L;
        this.f166100h2 = false;
        this.f166101i2 = 0;
        this.f166102j2 = -1L;
        this.f166103k2 = 0L;
        this.f166105l2 = 0L;
        this.f166107m2 = false;
        this.f166109n2 = new LinkedList<>();
        this.f166111o2 = new LinkedList<>();
        this.f166113p2 = 0;
        this.f166115q2 = -1L;
        this.f166117r2 = 0L;
        this.f166119s2 = 0L;
        this.f166121t2 = 0L;
        this.f166123u2 = 0L;
        this.f166125v2 = 0L;
        this.f166127w2 = false;
        this.f166129x2 = -1L;
        this.f166131y2 = 6;
        this.f166133z2 = new C19975d();
        this.f166053A2 = false;
        this.f166055B2 = false;
        this.f166057C2 = System.currentTimeMillis();
        this.f166059D2 = 0L;
        this.f166061E2 = Pattern.compile("^rtmp://(?:\\[([0-9a-fA-F:]+)\\]|([^/:]+))(:(\\d+))*/([^/]+)(/(.*))*$");
        this.f166063F2 = Pattern.compile("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
        this.f166065G2 = Pattern.compile("^([0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$|^(([0-9a-fA-F]{1,4}:)*[0-9a-fA-F]{1,4})?::(([0-9a-fA-F]{1,4}:)*[0-9a-fA-F]{1,4})?$");
        this.f166067H2 = 0L;
        this.f166069I2 = "0,-1,-1";
        this.f166071J2 = 0;
        this.f166077M2 = new LimitedQueue<>(5);
        this.f166079N2 = 0;
        this.f166081O2 = 0;
        this.f166070J1 = interfaceC19500a;
        wvx wvxVar = this.f14987H;
        wvxVar.f191059d = 256L;
        wvxVar.f191064e1 = String.valueOf(hashCode());
    }

    /* JADX INFO: renamed from: E4 */
    private static Map<String, String> m184331E4(String str) throws Exception {
        int iIndexOf;
        HashMap map = new HashMap();
        if (str != null && !str.isEmpty() && (iIndexOf = str.indexOf(63)) != -1) {
            for (String str2 : str.substring(iIndexOf + 1).split("&")) {
                int iIndexOf2 = str2.indexOf("=");
                if (iIndexOf2 > 0) {
                    map.put(URLDecoder.decode(str2.substring(0, iIndexOf2), "UTF-8"), URLDecoder.decode(str2.substring(iIndexOf2 + 1), "UTF-8"));
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: F4 */
    private void m184333F4() {
        if (this.f166073K2 == null) {
            HandlerThread handlerThread = new HandlerThread("PushDetailThread");
            this.f166073K2 = handlerThread;
            handlerThread.start();
            if (this.f166075L2 == null) {
                HandlerC19974c handlerC19974c = new HandlerC19974c(this.f166073K2.getLooper());
                this.f166075L2 = handlerC19974c;
                handlerC19974c.sendEmptyMessageDelayed(202, 1000L);
            }
            this.f166092Z1 = new lob0(5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: G4 */
    private boolean m184335G4(boolean z) {
        long propertyLong;
        uow uowVar = this.f15000s;
        long j = uowVar.f180165J0;
        long propertyLong2 = 0;
        if (j > 0) {
            long j2 = uowVar.f180166K0;
            if (j2 <= 0 || j >= j2) {
                uowVar.f180165J0 = 2000L;
                uowVar.f180166K0 = Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;
            }
        } else {
            uowVar.f180165J0 = 2000L;
            uowVar.f180166K0 = Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;
        }
        IjkWriter ijkWriter = this.f166104l1;
        if (ijkWriter != null) {
            propertyLong2 = ijkWriter.getPropertyLong(20007, 0L);
            propertyLong = this.f166104l1.getPropertyLong(20008, 0L);
        } else {
            propertyLong = 0;
        }
        uow uowVar2 = this.f15000s;
        long j3 = uowVar2.f180165J0;
        long j4 = uowVar2.f180166K0;
        if (!this.f166100h2) {
            boolean z2 = uowVar2.f180164I0 && ((propertyLong2 > j4 ? 1 : (propertyLong2 == j4 ? 0 : -1)) >= 0 && ((propertyLong * 23) > j4 ? 1 : ((propertyLong * 23) == j4 ? 0 : -1)) >= 0);
            this.f166100h2 = z2;
            if (z2) {
                this.f166101i2 = 0;
                m184383n4(true);
                this.f166070J1.mo165950g(CommandMessage.COMMAND_RESUME_PUSH, 0, 0, this);
            }
        } else if ((propertyLong2 <= j3 || propertyLong * 23 <= j3) && z) {
            this.f166100h2 = false;
            m184383n4(false);
            this.f166070J1.mo165950g(CommandMessage.COMMAND_SET_ACCOUNTS, 0, 0, this);
        }
        return this.f166100h2;
    }

    /* JADX INFO: renamed from: H4 */
    private void m184337H4() {
        HandlerC19974c handlerC19974c = this.f166075L2;
        if (handlerC19974c == null || this.f166073K2 == null) {
            return;
        }
        handlerC19974c.removeCallbacksAndMessages(null);
        this.f166073K2.quit();
        this.f166075L2 = null;
        this.f166073K2 = null;
    }

    /* JADX INFO: renamed from: I4 */
    private void m184339I4(int i, long j) {
        long j2 = this.f166067H2;
        if (j2 != 0 && j > j2) {
            this.f14987H.f191032R = j - j2;
        }
        this.f166067H2 = j;
    }

    /* JADX INFO: renamed from: J4 */
    private void m184341J4(long j, int i) {
        long jMo21008g0 = mo21008g0();
        long j2 = ((long) ((jMo21008g0 - this.f166088V1) / (j / 1000.0f))) * 8;
        int[] iArr = this.f166089W1;
        if (iArr.length == 0) {
            return;
        }
        if (this.f166090X1 >= iArr.length) {
            this.f166090X1 = 0;
        }
        iArr[this.f166090X1] = (int) j2;
        this.f166091Y1.add(Integer.valueOf(i));
        this.f166090X1++;
        this.f166088V1 = jMo21008g0;
    }

    /* JADX INFO: renamed from: K4 */
    private void m184343K4(boolean z) {
        if (this.f166109n2.size() <= 0 || this.f166111o2.size() <= 0) {
            return;
        }
        for (int i = 0; i < this.f166109n2.size(); i++) {
            C19973b c19973b = this.f166109n2.get(i);
            int i2 = c19973b.f166137d;
            if (i2 == 0 || i2 == 5) {
                c19973b.f166135b = this.f166111o2.removeLast().longValue();
            } else {
                c19973b.f166135b = this.f166111o2.removeFirst().longValue();
            }
            long j = c19973b.f166136c + this.f166083Q1;
            long j2 = c19973b.f166135b;
            if (j - j2 > this.f166082P1) {
                this.f166082P1 = j - j2;
            }
            Log.e("huohl", "writeSampleData 1: src dts:" + j + ", pts:" + (c19973b.f166135b + this.f166082P1) + ", deltaDts:" + this.f166083Q1 + ",diffdts: " + this.f166082P1 + ", frame Type: BP");
            ByteBuffer byteBuffer = c19973b.f166134a;
            ByteBuffer byteBufferM131930B2 = m131930B2(byteBuffer, byteBuffer.limit(), false);
            byteBufferM131930B2.flip();
            this.f166104l1.writeVideoPacket2(j, c19973b.f166135b + this.f166082P1, byteBufferM131930B2, byteBufferM131930B2.limit(), z);
            this.f166120t1 = this.f166120t1 + ((long) byteBufferM131930B2.limit());
            this.f166124v1 = this.f166124v1 + 1;
        }
        this.f166111o2.clear();
        this.f166109n2.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public int m184363a4(uow uowVar) {
        if (csx.m112235R().m112311Z0()) {
            b7y.m102882c().m102888g("isAdaptSizeListEmpty is null");
        } else {
            for (csx.C16354b c16354b : csx.m112235R().m112246D0()) {
                if (uowVar.f175494m == c16354b.m112408g() && uowVar.f175496n == c16354b.m112407f()) {
                    return c16354b.m112406b().intValue();
                }
            }
        }
        return uowVar.f175451H;
    }

    /* JADX INFO: renamed from: c4 */
    private String m184366c4() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Integer> it = this.f166077M2.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (i != 0) {
                sb.append(Constants.SEPARATOR_COMMA);
            }
            sb.append(m184387p4(it.next()));
            i++;
        }
        sb.append(Constants.AES_SUFFIX);
        return sb.toString();
    }

    /* JADX INFO: renamed from: d4 */
    private boolean m184368d4() {
        IjkWriter ijkWriter = this.f166104l1;
        return ijkWriter != null && ijkWriter.getAdapt() == 1;
    }

    /* JADX INFO: renamed from: h4 */
    private String m184373h4(int i, int i2) {
        return null;
    }

    /* JADX INFO: renamed from: k3 */
    public static /* synthetic */ long m184376k3(s410 s410Var) {
        long j = s410Var.f166125v2;
        s410Var.f166125v2 = 1 + j;
        return j;
    }

    /* JADX INFO: renamed from: k4 */
    private String m184377k4() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Integer> it = this.f166091Y1.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (i != 0) {
                sb.append(Constants.SEPARATOR_COMMA);
            }
            sb.append("(");
            sb.append(it.next());
            sb.append(")");
            i++;
        }
        sb.append(Constants.AES_SUFFIX);
        return sb.toString();
    }

    /* JADX INFO: renamed from: l4 */
    private void m184379l4(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String str2 = m184331E4(str).get("mtag");
            if (str2 == null || str2.isEmpty()) {
                return;
            }
            m20744m2(str2);
            this.f14988I.m122843l("handleMtagFromUrl", "mtag=".concat(str2));
        } catch (Exception e) {
            this.f14988I.m122843l("handleMtagFromUrl", "parse failed: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: m4 */
    private boolean m184381m4(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return this.f166063F2.matcher(str).matches() || this.f166065G2.matcher(str).matches();
    }

    /* JADX INFO: renamed from: n4 */
    private void m184383n4(boolean z) {
        long jMo20936J0 = mo20936J0();
        long jMo20987X0 = mo20987X0();
        long jMo21047u1 = mo21047u1();
        long jMo20918D0 = mo20918D0();
        if (z) {
            this.f14988I.m122856y(jMo20936J0, jMo20987X0, jMo21047u1, jMo20918D0);
        } else {
            this.f14988I.m122857z(jMo20936J0, jMo20987X0, jMo21047u1, jMo20918D0, m184414b4());
        }
    }

    /* JADX INFO: renamed from: o4 */
    private void m184385o4(int i, int i2) {
        String str;
        if (i2 == 1) {
            str = "downshift";
        } else {
            str = i == 0 ? "up" : "down";
        }
        String str2 = str;
        int i3 = m20728Z1().f175494m;
        int i4 = m20728Z1().f175496n;
        int i5 = m20728Z1().f175451H;
        int iMo20991Y0 = mo20991Y0() * 1000;
        int i6 = this.f166133z2.f166143c;
        int i7 = m20728Z1().f180160E0;
        int iM112402z = csx.m112235R().m112402z();
        int iM112390v = csx.m112235R().m112390v();
        int iM112382s0 = csx.m112235R().m112382s0();
        int iM112236A = csx.m112235R().m112236A();
        lob0 lob0Var = this.f166092Z1;
        this.f14988I.m122819A(false, 0L, 0L, 0L, 0L, str2, i3, i4, i5, iMo20991Y0, i6, i7, iM112402z, iM112390v, iM112382s0, iM112236A, m184377k4(), lob0Var == null ? "" : lob0Var.m155044a());
    }

    /* JADX INFO: renamed from: p4 */
    private String m184387p4(Object... objArr) {
        StringBuilder sb = new StringBuilder("(");
        if (objArr != null) {
            for (int i = 0; i < objArr.length; i++) {
                if (i != 0) {
                    sb.append(Constants.SEPARATOR_COMMA);
                }
                sb.append(objArr[i]);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: r4 */
    private void m184390r4() {
        long j;
        if (!csx.m112235R().m112334f0() || this.f15000s.f175449F * 30 > this.f166124v1 || this.f166066H1 || this.f14987H.f191070g1 >= 3) {
            if (this.f166066H1 && this.f166124v1 % 30 == 0) {
                this.f14988I.m122842k("DynamicScaling", "mReplaceStreamMode:" + this.f166066H1);
            }
            if (this.f14987H.f191070g1 < 3 || this.f166124v1 % 75 != 0) {
                return;
            }
            this.f14988I.m122842k("netSpeedCheck", "sendSize0cnt >= 3");
            return;
        }
        long propertyLong = -1;
        if (this.f166115q2 == -1) {
            this.f166115q2 = SystemClock.elapsedRealtime();
            this.f166129x2 = SystemClock.elapsedRealtime();
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f166115q2;
        if (jElapsedRealtime > 0 && jElapsedRealtime >= csx.m112235R().m112402z()) {
            IjkWriter ijkWriter = this.f166104l1;
            if (ijkWriter != null) {
                propertyLong = ijkWriter.getPropertyLong(20008, 0L);
                this.f166104l1.getPropertyLong(20005, 0L);
            }
            long j2 = propertyLong * 23;
            boolean z = j2 >= ((long) csx.m112235R().m112390v());
            int iM112382s0 = csx.m112235R().m112382s0();
            int iM112236A = csx.m112235R().m112236A();
            this.f166115q2 = SystemClock.elapsedRealtime();
            if ((j2 <= iM112236A || j2 <= this.f166121t2) && !z) {
                j = 1;
                this.f166119s2 = 0L;
            } else {
                long j3 = this.f166119s2;
                j = 1;
                this.f166119s2 = j3 + 1;
                if (z) {
                    this.f166119s2 = j3 + 2;
                }
            }
            m184341J4(jElapsedRealtime, (int) j2);
            if (this.f166119s2 > csx.m112235R().m112295U()) {
                this.f166119s2 = csx.m112235R().m112295U();
            }
            this.f166121t2 = j2;
            if (j2 <= iM112382s0) {
                this.f166123u2 += j;
            } else {
                this.f166123u2 = 0L;
            }
            if (!this.f166127w2) {
                long j4 = this.f166119s2;
                if (j4 != 0 && j4 % ((long) csx.m112235R().m112295U()) == 0) {
                    if (this.f15000s.m197026c()) {
                        this.f166070J1.mo165950g(CommandMessage.COMMAND_PAUSE_PUSH, 0, 0, this);
                        t9c.m189743a("newBitrate", "MOMO_FILTER_INFO ");
                    }
                    this.f166133z2.m184430c(1, m184368d4());
                    this.f166119s2 = 0L;
                }
            }
            long jM112298V = csx.m112235R().m112298V();
            long j5 = this.f166125v2;
            long j6 = jM112298V * j5;
            if (j5 != 0) {
                long j7 = this.f166123u2;
                if (j7 != 0 && j7 % j6 == 0) {
                    this.f166133z2.m184430c(0, m184368d4());
                }
            }
        }
        if (this.f166127w2) {
            long jElapsedRealtime2 = (SystemClock.elapsedRealtime() - this.f166129x2) / 1000;
            long j8 = this.f15000s.f180167L0;
            if (jElapsedRealtime2 <= 0 || jElapsedRealtime2 % 10 != 0) {
                return;
            }
            this.f166129x2 = SystemClock.elapsedRealtime();
            t9c.m189743a("jzheng", "ab " + jElapsedRealtime2 + "/" + csx.m112235R().m112273M0() + "/" + csx.m112235R().m112357l() + "/" + csx.m112235R().m112361m() + "/" + csx.m112235R().m112365n() + "/" + this.f15000s.f180168M0);
            this.f166133z2.m184430c(1, m184368d4());
            if (this.f15000s.f175451H - csx.m112235R().m112357l() < csx.m112235R().m112361m()) {
                this.f166127w2 = false;
            }
        }
    }

    /* JADX INFO: renamed from: s4 */
    private void m184392s4() {
        if (this.f166129x2 == -1) {
            this.f166129x2 = SystemClock.elapsedRealtime();
        }
        long jElapsedRealtime = (SystemClock.elapsedRealtime() - this.f166129x2) / 1000;
        if (jElapsedRealtime <= 0 || jElapsedRealtime % 10 != 0) {
            return;
        }
        this.f166129x2 = SystemClock.elapsedRealtime();
        t9c.m189743a("newBitrate", "ab " + jElapsedRealtime + "/" + csx.m112235R().m112273M0() + "/" + csx.m112235R().m112357l() + "/" + csx.m112235R().m112361m() + "/" + csx.m112235R().m112365n() + "/" + this.f15000s.f180168M0);
        this.f166133z2.m184428g();
    }

    /* JADX INFO: renamed from: t4 */
    private String m184394t4(String str) {
        Matcher matcher;
        if (str == null || str.length() == 0 || (matcher = this.f166061E2.matcher(str)) == null || !matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        return strGroup != null ? strGroup : matcher.group(2);
    }

    /* JADX INFO: renamed from: v4 */
    private void m184397v4(int i) {
        if (!this.f15000s.f180179X0) {
            this.f14987H.f191117y0 = i;
            this.f166070J1.mo165950g(12545, i, 0, this);
            this.f14989J = MomoCodec.MomoCodecState.WAIT;
            m20735e2(12545, i);
            return;
        }
        this.f14988I.m122843l("postNerworkErrorMessage", "local merge net error" + i + ",handler:" + this.f166074L1);
        kod0 kod0Var = this.f166074L1;
        if (kod0Var != null) {
            kod0Var.mo20143p(this.f15000s.f180187v0, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4 */
    public void m184399w4(int i, int i2) {
        m184385o4(i, i2);
        this.f166070J1.mo165950g(CommandMessage.COMMAND_GET_ACCOUNTS, i, 0, this);
    }

    /* JADX INFO: renamed from: y4 */
    private void m184402y4() {
        MomoCodec.MomoCodecState momoCodecState = this.f14989J;
        MomoCodec.MomoCodecState momoCodecState2 = MomoCodec.MomoCodecState.WAIT;
        if (momoCodecState == momoCodecState2) {
            return;
        }
        int i = this.f166107m2 ? 4 : 2;
        if (this.f166102j2 == -1) {
            this.f166102j2 = SystemClock.elapsedRealtime();
        }
        long jElapsedRealtime = (SystemClock.elapsedRealtime() - this.f166102j2) / 1000;
        if (jElapsedRealtime <= 0 || jElapsedRealtime % ((long) i) != 0) {
            return;
        }
        this.f166102j2 = SystemClock.elapsedRealtime();
        long jMo21008g0 = mo21008g0();
        t9c.m189743a("zhangjj", "from " + this.f166103k2 + " to " + jMo21008g0 + " diff " + (jMo21008g0 - this.f166103k2) + " cnt " + this.f166105l2);
        if (this.f166107m2) {
            jMo21008g0 = 1;
        }
        if (this.f166103k2 != jMo21008g0) {
            this.f166103k2 = jMo21008g0;
            this.f166105l2 = 0L;
        } else {
            this.f166105l2++;
        }
        if (this.f166105l2 == 5) {
            this.f166105l2 = 0L;
            t9c.m189743a("zhangjj", "get msg Error " + this.f14989J + "/-304/14");
            if (this.f14989J == momoCodecState2 || this.f166066H1) {
                return;
            }
            this.f14989J = momoCodecState2;
            this.f14988I.m122843l("MediaError", "14 sendsize 0 line 923");
            m184397v4(14);
        }
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: A0 */
    public int mo20913A0() {
        return mo21021k0();
    }

    /* JADX INFO: renamed from: A4 */
    public void m184404A4(int i) {
        this.f14988I.m122843l("setBusinessType", Integer.valueOf(i));
        this.f14987H.f191104s = i;
    }

    @Override // p153l.g220
    @RequiresApi(api = 16)
    /* JADX INFO: renamed from: B1 */
    public boolean mo20750B1(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer byteBuffer2;
        if (!this.f166112p1) {
            return true;
        }
        m184402y4();
        if (this.f166053A2) {
            m184392s4();
        } else {
            m184390r4();
        }
        if (bufferInfo.size != byteBuffer.limit()) {
            byteBuffer.position(0);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bufferInfo.size);
            if (byteBufferAllocate != null) {
                byteBufferAllocate.clear();
                byteBufferAllocate.position(0);
                byteBuffer.get(byteBufferAllocate.array(), bufferInfo.offset, bufferInfo.size);
            }
            byteBuffer2 = byteBufferAllocate;
        } else {
            byteBuffer2 = byteBuffer;
        }
        if (this.f15000s.f175473b0) {
            mo20754K0(byteBuffer2);
            return true;
        }
        if (m184335G4(this.f166100h2 && i == 2 && m131933I2(byteBuffer, bufferInfo.size))) {
            if (i == 2) {
                this.f166101i2++;
                this.f166120t1 += (long) bufferInfo.size;
            } else {
                this.f166122u1 += (long) bufferInfo.size;
            }
            return true;
        }
        if (i == 1) {
            if (this.f166106m1 == 0) {
                this.f166106m1 = bufferInfo.presentationTimeUs;
            }
            long j = ((bufferInfo.presentationTimeUs - this.f166106m1) - this.f166076M1) / 1000;
            this.f166122u1 += (long) (bufferInfo.size - bufferInfo.offset);
            this.f166126w1++;
            if (this.f166130y1 == 0) {
                this.f166130y1 = System.currentTimeMillis();
            }
            IjkWriter ijkWriter = this.f166104l1;
            if (ijkWriter != null) {
                ijkWriter.writeAudioPacket(j + this.f166082P1, byteBuffer2, bufferInfo.size, 0);
            }
        } else if (i == 2) {
            if (this.f166108n1 == 0) {
                this.f166108n1 = bufferInfo.presentationTimeUs;
            }
            try {
                long j2 = ((bufferInfo.presentationTimeUs - this.f166108n1) - this.f166076M1) / 1000;
                if (this.f166084R1 < 0) {
                    this.f166084R1 = j2;
                }
                long jM182488a = this.f166086T1.m182488a(j2);
                long j3 = this.f166084R1;
                long j4 = j2 - j3 > 80 ? j3 + jM182488a : j2;
                if (this.f166085S1 < 0) {
                    this.f166085S1 = j4;
                }
                this.f166084R1 = j2;
                this.f166085S1 = j4;
                if (csx.m112235R().m112269L() == 1) {
                    byteBuffer.position(0);
                    byte[] bArr = new byte[bufferInfo.size];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    int naluType = Nalu.getNaluType(bArr, bufferInfo.size);
                    if (naluType == 2 || naluType == 7) {
                        if (this.f166104l1 != null) {
                            ByteBuffer byteBufferM131930B2 = m131930B2(byteBuffer2, bufferInfo.size, true);
                            m184343K4(true);
                            this.f166104l1.writeVideoPacket2(j4 + this.f166083Q1, j4 + this.f166082P1, byteBufferM131930B2, byteBufferM131930B2.limit(), true);
                            this.f166120t1 += (long) (bufferInfo.size - bufferInfo.offset);
                            this.f166124v1++;
                        }
                        m184339I4(0, j4);
                    } else {
                        if (naluType == 0 || naluType == 5) {
                            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(byteBuffer2.limit());
                            byteBuffer2.position(0);
                            byteBufferAllocate2.put(byteBuffer2);
                            byteBufferAllocate2.flip();
                            C19973b c19973b = new C19973b();
                            c19973b.f166134a = byteBufferAllocate2;
                            c19973b.f166136c = j4;
                            c19973b.f166135b = j4;
                            c19973b.f166137d = naluType;
                            c19973b.f166138e = this.f166113p2;
                            m184343K4(false);
                            this.f166109n2.add(c19973b);
                            this.f166111o2.add(Long.valueOf(c19973b.f166136c));
                        } else if (naluType == 1 || naluType == 6) {
                            ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(byteBuffer2.limit());
                            byteBuffer2.position(0);
                            byteBufferAllocate3.put(byteBuffer2);
                            byteBufferAllocate3.flip();
                            C19973b c19973b2 = new C19973b();
                            c19973b2.f166134a = byteBufferAllocate3;
                            c19973b2.f166136c = j4;
                            c19973b2.f166135b = 0L;
                            c19973b2.f166137d = naluType;
                            c19973b2.f166138e = this.f166113p2;
                            this.f166109n2.add(c19973b2);
                            this.f166111o2.add(Long.valueOf(c19973b2.f166136c));
                        }
                    }
                } else {
                    long j5 = ((bufferInfo.presentationTimeUs - this.f166108n1) - this.f166076M1) / 1000;
                    boolean zM131933I2 = m131933I2(byteBuffer2, bufferInfo.size);
                    ByteBuffer byteBufferM131930B3 = m131930B2(byteBuffer2, bufferInfo.size, zM131933I2);
                    this.f166120t1 += (long) (bufferInfo.size - bufferInfo.offset);
                    this.f166124v1++;
                    if (this.f166128x1 == 0) {
                        this.f166128x1 = System.currentTimeMillis();
                    }
                    IjkWriter ijkWriter2 = this.f166104l1;
                    if (ijkWriter2 != null) {
                        ijkWriter2.writeVideoPacket(j5, byteBufferM131930B3, byteBufferM131930B3.limit(), zM131933I2);
                        if (zM131933I2) {
                            m184339I4(0, j5);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: B4 */
    public void m184405B4(boolean z) {
        this.f166066H1 = z;
        this.f14988I.m122843l("setReplaceStream" + z);
        IjkWriter ijkWriter = this.f166104l1;
        if (ijkWriter != null) {
            ijkWriter.setPropertyLong(30001, z ? 1L : 0L);
            oq70.m168791d().m168795c("Pipeline_Flow_pip->MOMO", getClass().getSimpleName() + "setReplaceStream:" + z);
        }
    }

    @Override // p153l.fb1
    /* JADX INFO: renamed from: C */
    public oxd0 mo19373C(oxd0 oxd0Var) {
        fb1 fb1Var = this.f166072K1;
        if (fb1Var != null) {
            return fb1Var.mo19373C(oxd0Var);
        }
        return null;
    }

    /* JADX INFO: renamed from: C4 */
    public void m184406C4(boolean z) {
        this.f14988I.m122843l("setReplaceStreamFix:" + z);
        this.f166068I1 = z;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: D0 */
    public long mo20918D0() {
        IjkWriter ijkWriter = this.f166104l1;
        if (ijkWriter != null) {
            return ijkWriter.getPropertyLong(20008, 0L);
        }
        return 0L;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: D1 */
    public String mo20919D1() {
        String str = this.f14987H.f191114x;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: D4 */
    public void m184407D4(int i, String str, String str2) {
        this.f166114q1 = i;
        this.f166116r1 = str;
        this.f166118s1 = str2;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: E0 */
    public void mo20921E0(wzl wzlVar) {
        this.f14985F = wzlVar;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: F0 */
    public int mo20925F0() {
        return this.f166056C1;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: F1 */
    public long mo20926F1() {
        IjkWriter ijkWriter = this.f166104l1;
        if (ijkWriter == null) {
            return 0L;
        }
        try {
            return ijkWriter.getWriteByte();
        } catch (Error e) {
            e.printStackTrace();
            return 0L;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: G0 */
    public long mo20929G0() {
        IjkWriter ijkWriter = this.f166104l1;
        if (ijkWriter != null) {
            return ijkWriter.getVideoCacheSize();
        }
        return 0L;
    }

    @Override // p153l.grx
    /* JADX INFO: renamed from: G2 */
    public nsx mo20752G2() {
        return new osx(this.f166070J1);
    }

    @Override // p153l.grx, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: H0 */
    public void mo20649H0(boolean z) {
        this.f166060E1 = z;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: J0 */
    public long mo20936J0() {
        IjkWriter ijkWriter = this.f166104l1;
        if (ijkWriter != null) {
            return ijkWriter.getPropertyLong(20008, 0L) * 23;
        }
        return 0L;
    }

    @Override // p153l.g220
    /* JADX INFO: renamed from: K0 */
    public boolean mo20754K0(ByteBuffer byteBuffer) {
        return m184408L4(byteBuffer, 1);
    }

    @Override // p153l.grx, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: K1 */
    public void mo20651K1(oxd0 oxd0Var) {
        if (this.f166124v1 > 0 || this.f106177Z) {
            this.f166052A1++;
            l6m l6mVar = this.f14990K;
            if (l6mVar != null) {
                oxd0Var = ((ExtAudioWrapper) l6mVar).mo19373C(oxd0Var);
            }
            super.mo20651K1(oxd0Var);
        }
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: L0 */
    public long mo20942L0() {
        IjkWriter ijkWriter = this.f166104l1;
        if (ijkWriter != null) {
            return ijkWriter.getAVDiff();
        }
        return 0L;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: L1 */
    public long mo20943L1() {
        return m184413Z3();
    }

    /* JADX INFO: renamed from: L4 */
    public boolean m184408L4(ByteBuffer byteBuffer, int i) {
        if (m184335G4(this.f166100h2 && i == 2 && (m131933I2(byteBuffer, byteBuffer.limit()) || m131934J2(byteBuffer, byteBuffer.limit())))) {
            return true;
        }
        if (i == 2) {
            m184410N4(byteBuffer);
        } else {
            m184409M4(byteBuffer);
        }
        m184390r4();
        return true;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: M0 */
    public int mo20947M0() {
        return (int) this.f14987H.f191074i;
    }

    @Override // p153l.hej, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: M1 */
    public void mo20652M1() {
        super.mo20652M1();
        oq70.m168791d().m168795c("MomoSurfaceFilter", "rendFrameBufferToCodec");
    }

    /* JADX INFO: renamed from: M4 */
    public boolean m184409M4(ByteBuffer byteBuffer) {
        if (!this.f166112p1) {
            return true;
        }
        oq70.m168791d().m168793a("Pipeline_Flow_pip->MOMO", getClass().getSimpleName() + " writeSoftAudioSample:" + byteBuffer.limit());
        if (this.f166106m1 == 0) {
            this.f166106m1 = System.currentTimeMillis();
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f166106m1;
        this.f166122u1 += (long) byteBuffer.limit();
        this.f166126w1++;
        if (this.f166130y1 == 0) {
            this.f166130y1 = System.currentTimeMillis();
        }
        IjkWriter ijkWriter = this.f166104l1;
        if (ijkWriter != null) {
            ijkWriter.writeAudioPacket(jCurrentTimeMillis, byteBuffer, byteBuffer.limit(), 0);
        }
        return true;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: N0 */
    public long mo20951N0() {
        IjkWriter ijkWriter = this.f166104l1;
        return ijkWriter != null ? ijkWriter.getTxbytes() : this.f14987H.f191000B;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: N1 */
    public int mo20952N1() {
        return 0;
    }

    /* JADX INFO: renamed from: N4 */
    public boolean m184410N4(ByteBuffer byteBuffer) {
        if (!this.f166112p1) {
            return true;
        }
        boolean zM131933I2 = m131933I2(byteBuffer, byteBuffer.limit());
        ByteBuffer byteBufferM131929A2 = m131929A2(byteBuffer, byteBuffer.limit(), zM131933I2, 0);
        this.f166120t1 += (long) byteBuffer.capacity();
        this.f166124v1++;
        if (this.f166128x1 == 0) {
            this.f166128x1 = System.currentTimeMillis();
        }
        if (this.f166108n1 == 0) {
            this.f166108n1 = System.currentTimeMillis();
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f166108n1;
        oq70.m168791d().m168793a("Pipeline_Flow_pip->MOMO", getClass().getSimpleName() + " writeSoftVideoSample:" + byteBuffer.limit());
        boolean zM131934J2 = m131934J2(byteBuffer, byteBuffer.limit()) | zM131933I2;
        IjkWriter ijkWriter = this.f166104l1;
        if (zM131934J2) {
            if (ijkWriter != null) {
                ijkWriter.writeVideoPacket(jCurrentTimeMillis, byteBufferM131929A2, byteBufferM131929A2.limit(), 5);
            }
            m184339I4(0, jCurrentTimeMillis);
        } else if (ijkWriter != null) {
            ijkWriter.writeVideoPacket(jCurrentTimeMillis, byteBufferM131929A2, byteBufferM131929A2.limit(), 1);
        }
        return true;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: O0 */
    public long mo20955O0() {
        IjkWriter ijkWriter;
        return (!this.f106176Y0 || (ijkWriter = this.f166104l1) == null) ? this.f166122u1 : ijkWriter.getPropertyLong(20010, 0L);
    }

    @Override // p153l.g220
    /* JADX INFO: renamed from: O1 */
    public void mo20755O1() {
        oq70.m168791d().m168795c("Pipeline_Flow_pip->MOMO", "startMuxing !##########################");
        this.f106174X0 = true;
    }

    @Override // p153l.o410.InterfaceC19026f
    /* JADX INFO: renamed from: P0 */
    public void mo20958P0(g510 g510Var, int i, int i2, int i3, int i4) {
        this.f166054B1 = i4;
        this.f166056C1 = i2;
        this.f166058D1 = i3;
    }

    @Override // p153l.grx
    @RequiresApi(api = 19)
    /* JADX INFO: renamed from: P2 */
    public void mo131937P2(int i) {
        uow uowVar;
        IjkWriter ijkWriter = this.f166104l1;
        if (ijkWriter != null && (uowVar = this.f15000s) != null) {
            ijkWriter.setVideoEncodingBitRate(uowVar.f175451H);
        }
        super.mo131937P2(i);
        wzl wzlVar = this.f14985F;
        if (wzlVar != null) {
            wzlVar.mo143398t0(i);
        }
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: Q0 */
    public int mo20962Q0() {
        return 0;
    }

    @Override // p153l.grx, com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    @RequiresApi(api = 18)
    /* JADX INFO: renamed from: R0 */
    public void mo20654R0(uow uowVar, EGLContext eGLContext) {
        boolean zPrepare;
        oq70.m168791d().m168795c("Pipeline_Flow_pip->MOMO", "Momo startRecord !##########################");
        this.f14988I.m122843l("momoPusher", "startRecord");
        if (this.f106174X0) {
            return;
        }
        if (this.f166086T1 == null) {
            this.f166086T1 = new rp1();
        }
        if (this.f166104l1 != null || uowVar == null) {
            zPrepare = true;
        } else {
            IjkWriter ijkWriter = new IjkWriter(this, false);
            this.f166104l1 = ijkWriter;
            this.f166097e2 = 0L;
            this.f166098f2 = 0L;
            this.f166099g2 = 0L;
            ijkWriter.setAudioSource(1);
            this.f166104l1.setAudioEncoder(3);
            this.f166104l1.setBitRateAdaptEnable(0);
            this.f166104l1.setAudioSamplingRate(uowVar.f175459P);
            this.f166104l1.setAudioEncodingBitRate(uowVar.f175462S);
            if (!this.f106177Z) {
                this.f166104l1.setVideoSource(1);
                boolean z = uowVar.f180163H0;
                IjkWriter ijkWriter2 = this.f166104l1;
                if (z) {
                    ijkWriter2.setVideoEncoder(5);
                } else {
                    ijkWriter2.setVideoEncoder(2);
                }
                this.f166104l1.setVideoSize(uowVar.f175494m, uowVar.f175496n);
                this.f166104l1.setVideoEncodingBitRate(uowVar.f175451H);
                this.f166104l1.setVideoFrameRate(20);
            }
            if (uowVar.f180156A0 == MomoPipeline.DecodeType.SOFT_DECODE) {
                this.f106176Y0 = false;
            }
            this.f166104l1.setPropertyLong(30000, 0L);
            String str = this.f166118s1;
            IjkWriter ijkWriter3 = this.f166104l1;
            if (str != null) {
                ijkWriter3.setStreamerInOutAndType(this.f166114q1, this.f166116r1, str);
                this.f14987H.f191114x = this.f166118s1;
            } else {
                ijkWriter3.setStreamerInOutAndType(10, null, uowVar.f180187v0);
                this.f14987H.f191114x = uowVar.f180187v0;
            }
            m184379l4(this.f14987H.f191114x);
            this.f166094b2 = uowVar.f180188w0;
            oq70.m168791d().m168795c("Pipeline_Flow_pip->MOMO", "startRecord    " + uowVar.f180187v0);
            zPrepare = this.f166104l1.prepare();
            this.f14987H.f191114x = this.f166104l1.getOutputUrl();
            this.f14987H.f191068g = uowVar.f180163H0 ? 2L : 0L;
            oq70.m168791d().m168795c("Pipeline_Flow_pip->MOMO", "startRecord end!!!!!    " + uowVar.f180187v0);
            this.f166095c2 = uowVar.f175494m;
            this.f166096d2 = uowVar.f175496n;
            oq70.m168791d().m168795c("Pipeline_Flow_pip->MOMO", "videoWidth:" + uowVar.f175506s + ",videoHeight:" + uowVar.f175508t + ",visualWidth:" + uowVar.f175510u + ",visualHeight:" + uowVar.f175511v + ",encodeWidth:" + uowVar.f175494m + ",encodeHeight:" + uowVar.f175496n + ",videoBitrate:" + uowVar.f175451H + ",audioBitrate:" + uowVar.f175462S + ",videoFPS:" + uowVar.f175449F + ",codecFPS:" + uowVar.f180160E0 + ",isHard:" + uowVar.f180156A0);
        }
        this.f14987H.f191050a = System.currentTimeMillis();
        this.f14987H.f191001B0 = "nonConf";
        wvx wvxVar = this.f14987H;
        wvxVar.f191055b1 = uowVar.f175473b0 ? 1L : 0L;
        wvxVar.f191009F0 = uowVar.f175451H;
        wvxVar.f191003C0 = uowVar.f175462S;
        if (zPrepare) {
            oq70.m168791d().m168795c("Pipeline_Flow_pip->MOMO", "startRecord eglContext start!!!!!    " + uowVar.f180187v0);
            super.mo20654R0(uowVar, eGLContext);
            yt0.m217280g().m217295p(m20725W1(), yt0.f201474e);
            IjkWriter ijkWriter4 = this.f166104l1;
            if (ijkWriter4 != null) {
                this.f14987H.f191048Z = ijkWriter4.getServerIpAddr();
                oq70.m168791d().m168795c("Pipeline_Flow_pip->MOMO", "startRecord eglContext end!!!!!    " + uowVar.f180187v0 + " ip " + this.f14987H.f191048Z);
            }
        }
        this.f14988I.m122843l("startRecord, pushDrop " + csx.m112235R().m112287R0() + ",flv :" + csx.m112235R().m112267K0() + ",high:" + csx.m112235R().m112322c0() + ",base:" + csx.m112235R().m112318b0());
        t9c.m189743a("zhangjj", "startRecord mPolicyDropFrameEnable [" + uowVar.f180164I0 + Constants.SEPARATOR_COMMA + uowVar.f180165J0 + Constants.SEPARATOR_COMMA + uowVar.f180166K0 + "] vds " + uowVar.f180168M0 + "/" + uowVar.f180169N0);
        if (csx.m112235R().m112287R0()) {
            uowVar.f180164I0 = false;
            this.f166104l1.setDropCache(1, csx.m112235R().m112322c0(), csx.m112235R().m112318b0());
        }
        if (this.f166104l1 != null) {
            this.f166104l1.setPropertyLong(ijkStreamerUtil.FFS_PROP_INT64_AACPROFILE, csx.m112235R().m112329e());
            this.f166104l1.setPropertyLong(30003, csx.m112235R().m112267K0() ? 1L : 0L);
        }
        this.f166089W1 = new int[csx.m112235R().m112349j() / csx.m112235R().m112402z()];
        this.f166091Y1 = new LimitedQueue<>(csx.m112235R().m112349j() / csx.m112235R().m112402z());
        csx.m112235R().m112244C1(csx.m112235R().m112282P0() ? 1 : 0);
        evx evxVar = this.f14988I;
        Boolean boolValueOf = Boolean.valueOf(uowVar.f180164I0);
        Long lValueOf = Long.valueOf(uowVar.f180165J0);
        Long lValueOf2 = Long.valueOf(uowVar.f180166K0);
        Boolean boolValueOf2 = Boolean.valueOf(csx.m112235R().m112287R0());
        Integer numValueOf = Integer.valueOf(csx.m112235R().m112322c0());
        Integer numValueOf2 = Integer.valueOf(csx.m112235R().m112318b0());
        Boolean boolValueOf3 = Boolean.valueOf(csx.m112235R().m112282P0());
        String str2 = this.f166118s1;
        if (str2 == null) {
            str2 = uowVar.f180187v0;
        }
        evxVar.m122843l("mrCoreParameters", boolValueOf, lValueOf, lValueOf2, boolValueOf2, numValueOf, numValueOf2, boolValueOf3, str2);
        m184333F4();
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: T0 */
    public int mo20972T0() {
        return (int) this.f14987H.f191030Q;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: V0 */
    public long mo20979V0() {
        IjkWriter ijkWriter = this.f166104l1;
        if (ijkWriter != null) {
            return ijkWriter.getPropertyLong(20002, 0L);
        }
        return 0L;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: W0 */
    public int mo20982W0() {
        return 0;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: X0 */
    public long mo20987X0() {
        IjkWriter ijkWriter = this.f166104l1;
        if (ijkWriter != null) {
            return ijkWriter.getPropertyLong(20005, 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: X3 */
    public long m184411X3() {
        IjkWriter ijkWriter = this.f166104l1;
        if (ijkWriter != null) {
            try {
                return ijkWriter.getPropertyLong(20022, 0L);
            } catch (Error e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return 0L;
    }

    @Override // p153l.grx, com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: Y */
    public void mo20656Y(g510 g510Var, uow uowVar) {
        super.mo20656Y(g510Var, uowVar);
        if (uowVar == null) {
            return;
        }
        int i = uowVar.f175494m;
        int i2 = uowVar.f175496n;
        this.f14988I.m122843l("resetCodec", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(uowVar.f175451H), Integer.valueOf(uowVar.f175449F));
        wvx wvxVar = this.f14987H;
        long j = uowVar.f175451H;
        wvxVar.f191009F0 = j;
        this.f14988I.m122843l("resetCodec videoBitrateSetByuser", Long.valueOf(j));
        if (uowVar.f180161F0) {
            i = uowVar.f175496n;
            i2 = uowVar.f175494m;
        }
        uow uowVar2 = this.f15000s;
        this.f166095c2 = uowVar2.f175494m;
        this.f166096d2 = uowVar2.f175496n;
        this.f166133z2.m184431d();
        IjkWriter ijkWriter = this.f166104l1;
        if (ijkWriter != null) {
            ijkWriter.setVideoSize(i, i2);
        }
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: Y0 */
    public int mo20991Y0() {
        IjkWriter ijkWriter = this.f166104l1;
        if (ijkWriter != null) {
            return ijkWriter.getVideoBitRate();
        }
        return 0;
    }

    /* JADX INFO: renamed from: Y3 */
    public long m184412Y3() {
        IjkWriter ijkWriter = this.f166104l1;
        if (ijkWriter != null) {
            return ijkWriter.getAudioWritedDPackets();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: Z3 */
    public long m184413Z3() {
        IjkWriter ijkWriter = this.f166104l1;
        if (ijkWriter != null) {
            return ijkWriter.getAverageSendBitRateB();
        }
        return 0L;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: a0 */
    public long mo20997a0() {
        return this.f166132z1;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: b0 */
    public void mo20657b0() {
        mo20661f();
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: b1 */
    public long mo21000b1() {
        IjkWriter ijkWriter;
        return (!this.f106176Y0 || (ijkWriter = this.f166104l1) == null) ? this.f166124v1 + ((long) m184414b4()) : ijkWriter.getPropertyLong(20013, 0L);
    }

    /* JADX INFO: renamed from: b4 */
    public int m184414b4() {
        return this.f166101i2;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: c0 */
    public long mo21002c0() {
        IjkWriter ijkWriter = this.f166104l1;
        if (ijkWriter != null) {
            return ijkWriter.getAudioCacheSize();
        }
        return 0L;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: c2 */
    public void mo20731c2() {
        this.f14988I.m122843l("logPushStart");
        this.f166055B2 = false;
        this.f14987H.f191048Z = getServerIpAddr();
        IjkWriter ijkWriter = this.f166104l1;
        if (ijkWriter != null) {
            this.f14987H.f191109u0 = ijkWriter.getPropertyLong(20002, 0L);
        }
        this.f14987H.f191111v0 = mo21040r0();
        this.f14987H.f191113w0 = mo21024l1();
        this.f14987H.f191115x0 = mo21046u0();
        this.f14987H.f191110v = getVideoWidth();
        this.f14987H.f191112w = mo21021k0();
        this.f14987H.f191118z = mo21035p1();
        this.f14987H.f190998A = mo20913A0();
        wvx wvxVar = this.f14987H;
        wvxVar.f191105s0 = 0;
        p4k0 p4k0Var = this.f166094b2;
        if (p4k0Var != null) {
            wvxVar.f191107t0 = p4k0Var.m170571a();
        }
        super.mo20731c2();
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, p153l.evx.InterfaceC16844b
    /* JADX INFO: renamed from: d1 */
    public void mo20733d1() {
        if (this.f14987H.f191070g1 >= 3) {
            this.f14988I.m122843l("mediaLogsValOfPush.sendSize0cnt " + this.f14987H.f191070g1 + ", not send push watch");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jMo21033o0 = mo21033o0();
        this.f14987H.f191004D = mo21053x1();
        this.f14987H.f191031Q0 = mo21047u1();
        this.f14987H.f191008F = mo20955O0();
        this.f14987H.f191010G = mo21037q1();
        this.f14987H.f191012H = mo21000b1();
        this.f14987H.f191025N0 = mo21002c0();
        this.f14987H.f191027O0 = mo20929G0();
        this.f14987H.f191029P0 = mo21029n0();
        this.f14987H.f191033R0 = mo21008g0();
        this.f14987H.f191054b0 = m184412Y3();
        this.f14987H.f191000B = mo20926F1();
        this.f14987H.f191039U0 = mo21030n1();
        this.f14987H.f191041V0 = mo20925F0();
        this.f14987H.f191043W0 = mo20942L0();
        wvx wvxVar = this.f14987H;
        wvxVar.f191045X0 = (jMo21033o0 - this.f166059D2) - (jCurrentTimeMillis - this.f166057C2);
        this.f166059D2 = jMo21033o0;
        this.f166057C2 = jCurrentTimeMillis;
        wvxVar.f191047Y0 = mo20936J0();
        this.f14987H.f191024N = mo21051w1();
        this.f14987H.f191026O = mo21013h1();
        this.f14987H.f191028P = mo20991Y0();
        this.f14987H.f191030Q = mo21027m0();
        this.f14987H.f191110v = getVideoWidth();
        this.f14987H.f191112w = mo21021k0();
        wvx wvxVar2 = this.f14987H;
        wvxVar2.f191101r = "[(0)]";
        wvxVar2.f191034S = m20728Z1().f175512w;
        this.f14987H.f191036T = m20728Z1().f175513x;
        this.f14987H.f191017J0 = m184419j4();
        this.f14987H.f191015I0 = m184411X3();
        this.f14987H.f191060d0 = m184418i4();
        this.f14987H.f191076i1 = m184366c4();
        this.f14987H.f191079j1 = csx.m112235R().m112334f0() ? 1 : 0;
        this.f14987H.f191085l1 = u6y.m194722F().m194748a().getWidth();
        this.f14987H.f191088m1 = u6y.m194722F().m194748a().getHeight();
        this.f14987H.f191091n1 = u6y.m194722F().m194788w();
        this.f14988I.m122825G();
        if (this.f14987H.f191070g1 != 3 || this.f14989J == MomoCodec.MomoCodecState.WAIT) {
            return;
        }
        this.f14988I.m122843l("MediaError", "14 sendsize 0 line 1778");
        m184397v4(14);
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: d2 */
    public void mo20734d2() {
        this.f14988I.m122843l("momopusher logPushStop");
        if (this.f166055B2) {
            return;
        }
        this.f166055B2 = true;
        if (this.f166080O1) {
            this.f166080O1 = false;
            this.f14988I.m122855x(0L);
        }
        IjkWriter ijkWriter = this.f166104l1;
        if (ijkWriter != null) {
            this.f14987H.f191000B = ijkWriter.getTxbytes();
        }
        wvx wvxVar = this.f14987H;
        long j = wvxVar.f191119z0;
        if (j != 0) {
            wvxVar.f191117y0 = j;
        }
        wvxVar.f191048Z = getServerIpAddr();
        wvx wvxVar2 = this.f14987H;
        if (wvxVar2.f191053b) {
            wvxVar2.f191071h = System.currentTimeMillis() - this.f14987H.f191050a;
        }
        p4k0 p4k0Var = this.f166094b2;
        if (p4k0Var != null) {
            this.f14987H.f191107t0 = p4k0Var.m170571a();
        }
        super.mo20734d2();
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: e1 */
    public void mo20660e1(@NonNull l6m l6mVar) {
        if (!(l6mVar instanceof ExtAudioWrapper)) {
            throw new InvalidParameterException("ISurroundMusic must implement by ExtAudioWrapper");
        }
        super.mo20660e1(l6mVar);
        l6m l6mVar2 = this.f14990K;
        if (l6mVar2 != null) {
            ((ExtAudioWrapper) l6mVar2).m21087J2(new C19976e());
        }
    }

    /* JADX INFO: renamed from: e4 */
    public int m184415e4() {
        return (int) this.f166097e2;
    }

    @Override // p153l.grx, com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: f */
    public void mo20661f() {
        oq70.m168791d().m168793a("Pipeline_Flow_pip->MOMO", getClass().getSimpleName().concat(" stopRecord"));
        this.f14988I.m122843l("momopusher stopRecord");
        super.mo20661f();
        this.f166112p1 = false;
        IjkWriter ijkWriter = this.f166104l1;
        if (ijkWriter != null) {
            this.f166097e2 = ijkWriter.getPropertyLong(20017, 0L);
            this.f166098f2 = this.f166104l1.getPropertyLong(20018, 0L);
            this.f166099g2 = this.f166104l1.getPropertyLong(20019, 0L);
            this.f14987H.f191000B = this.f166104l1.getTxbytes();
            this.f166104l1.stopRecording();
            b7y.m102882c().m102888g("enable_sync_streamreplace stopPsuh syncStreamRelace:" + this.f166068I1);
            m184405B4(this.f166068I1);
            this.f166104l1.release();
            this.f166104l1 = null;
        }
        mo20761k1();
        m184337H4();
        mo20734d2();
        super.m20747p2();
        Handler handler = this.f166093a2;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        yt0.m217280g().m217296q(yt0.f201474e);
        this.f166070J1.mo165950g(CommandMessage.COMMAND_REGISTER, 0, 0, this);
    }

    /* JADX INFO: renamed from: f4 */
    public int m184416f4() {
        return (int) this.f166099g2;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: g0 */
    public long mo21008g0() {
        IjkWriter ijkWriter = this.f166104l1;
        if (ijkWriter == null) {
            return 0L;
        }
        try {
            return ijkWriter.getRtmpSendSize();
        } catch (Error e) {
            e.printStackTrace();
            return 0L;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: g1 */
    public String mo21009g1(int i, int i2, Object obj) {
        return m184373h4(i, i2);
    }

    /* JADX INFO: renamed from: g4 */
    public int m184417g4() {
        return (int) this.f166098f2;
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public PointF getPreviewScale() {
        return null;
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public float getPreviewZoom() {
        return 0.0f;
    }

    @Override // p153l.wyl
    public int getRoomType() {
        return -1;
    }

    @Override // p153l.wyl
    public String getServerIpAddr() {
        IjkWriter ijkWriter = this.f166104l1;
        if (ijkWriter != null && ijkWriter.getServerIpAddr() != null) {
            return this.f166104l1.getServerIpAddr();
        }
        String str = this.f14987H.f191048Z;
        if (str != null && !str.equals(StringUtil.ALL_INTERFACES)) {
            return this.f14987H.f191048Z;
        }
        String strM184394t4 = m184394t4(mo20919D1());
        return (strM184394t4 == null || !m184381m4(strM184394t4)) ? StringUtil.ALL_INTERFACES : strM184394t4;
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public int getStreamerCaptureType(int i) {
        return 0;
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public int getStreamerType() {
        return 0;
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public VideoQuality getVideoQuality() {
        return null;
    }

    @Override // p153l.wyl
    public int getVideoWidth() {
        int i = this.f166095c2;
        if (i != 0) {
            return i;
        }
        uow uowVar = this.f15000s;
        if (uowVar != null) {
            return uowVar.f175494m;
        }
        return 0;
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public Object getWriter() {
        return this.f166104l1;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: h0 */
    public int mo21012h0() {
        return 0;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: h1 */
    public int mo21013h1() {
        IjkWriter ijkWriter = this.f166104l1;
        if (ijkWriter != null) {
            return ijkWriter.getAudioBitRate();
        }
        return 0;
    }

    /* JADX INFO: renamed from: i4 */
    public long m184418i4() {
        IjkWriter ijkWriter = this.f166104l1;
        if (ijkWriter != null) {
            try {
                return ijkWriter.getPropertyLong(20023, 0L);
            } catch (Error e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return 0L;
    }

    @Override // p153l.g220
    public boolean isStarting() {
        return this.f106174X0;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: j1 */
    public long mo21018j1(int i, int i2, Object obj) {
        return 0L;
    }

    /* JADX INFO: renamed from: j4 */
    public long m184419j4() {
        IjkWriter ijkWriter = this.f166104l1;
        if (ijkWriter != null) {
            try {
                return ijkWriter.getPropertyLong(20021, 0L);
            } catch (Error e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return 0L;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: k0 */
    public int mo21021k0() {
        int i = this.f166096d2;
        if (i != 0) {
            return i;
        }
        uow uowVar = this.f15000s;
        if (uowVar != null) {
            return uowVar.f175496n;
        }
        return 0;
    }

    @Override // p153l.g220
    /* JADX INFO: renamed from: k1 */
    public void mo20761k1() {
        oq70.m168791d().m168795c("Pipeline_Flow_pip->MOMO", "stopMuxing !##########################");
        this.f106174X0 = false;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: l1 */
    public long mo21024l1() {
        long propertyLong;
        long propertyLong2;
        IjkWriter ijkWriter = this.f166104l1;
        if (ijkWriter == null) {
            return 0L;
        }
        if (this.f106176Y0) {
            propertyLong = this.f166128x1;
            propertyLong2 = this.f14987H.f191050a;
        } else {
            propertyLong = ijkWriter.getPropertyLong(20015, 0L);
            propertyLong2 = this.f166104l1.getPropertyLong(ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME, 0L);
            if (propertyLong == 0 || propertyLong2 == 0) {
                propertyLong = this.f166128x1;
                propertyLong2 = this.f14987H.f191050a;
            }
        }
        long j = propertyLong - propertyLong2;
        if (j < 0) {
            return 0L;
        }
        return j;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: m0 */
    public int mo21027m0() {
        return this.f166054B1;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: n0 */
    public long mo21029n0() {
        IjkWriter ijkWriter = this.f166104l1;
        if (ijkWriter != null) {
            return ijkWriter.getVideoPacketCache();
        }
        return 0L;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: n1 */
    public int mo21030n1() {
        return this.f166058D1;
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notify(int i, int i2, int i3, Object obj) {
        IjkWriter ijkWriter;
        if (i == 0) {
            this.f166070J1.mo165950g(CommandMessage.COMMAND_UNREGISTER, i2, i3, this);
        } else if (i == 300) {
            t9c.m189743a("zhangjj", "get msg Error " + this.f14989J + "/" + i2 + "/" + i3);
            evx evxVar = this.f14988I;
            Integer numValueOf = Integer.valueOf(i2);
            Integer numValueOf2 = Integer.valueOf(i3);
            StringBuilder sb = new StringBuilder("state:");
            sb.append(this.f14989J);
            evxVar.m122843l("MEDIA_ERROR", numValueOf, numValueOf2, sb.toString());
            MomoCodec.MomoCodecState momoCodecState = this.f14989J;
            MomoCodec.MomoCodecState momoCodecState2 = MomoCodec.MomoCodecState.WAIT;
            if (momoCodecState != momoCodecState2) {
                this.f14989J = momoCodecState2;
                if (i2 == -304) {
                    m184397v4(i3);
                    oq70.m168791d().m168795c("Pipeline_Flow_pip->MOMO", " MOMO_ERROR_NETWORK ");
                } else {
                    oq70.m168791d().m168795c("Pipeline_Flow_pip->MOMO", " MOMO_ERROR_SYSTEM ");
                    this.f14988I.m122843l("onPusherError", Integer.valueOf(i2), Integer.valueOf(i3), "state:" + this.f14989J);
                    this.f14987H.f191117y0 = (long) i3;
                    this.f166070J1.mo165950g(12544, i2, i3, this);
                    m20735e2(12544, i2);
                }
            }
        } else if (i == 200) {
            this.f166070J1.mo165950g(CommandMessage.COMMAND_STATISTIC, i2, i3, this);
        } else if (i != 201) {
            switch (i) {
                case 100:
                    this.f14988I.m122843l("PREPARED");
                    oq70.m168791d().m168795c("Pipeline_Flow_pip->MOMO", " MEDIA_RECORDER_PREPARED");
                    this.f166070J1.mo165950g(CommandMessage.COMMAND_BASE, i2, i3, this);
                    this.f14989J = MomoCodec.MomoCodecState.START;
                    this.f14987H.f191053b = true;
                    break;
                case 101:
                    this.f14988I.m122843l("STOPED");
                    mo20734d2();
                    this.f14989J = MomoCodec.MomoCodecState.STOP;
                    oq70.m168791d().m168795c("Pipeline_Flow_pip->MOMO", " MEDIA_RECORDER_STOPED");
                    this.f166070J1.mo165950g(CommandMessage.COMMAND_REGISTER, i2, i3, this);
                    break;
                case 102:
                    this.f14988I.m122843l("PUBLISHING");
                    oq70.m168791d().m168795c("Pipeline_Flow_pip->MOMO", " MEDIA_RECORDER_PUBLISHING");
                    this.f166070J1.mo165950g(CommandMessage.COMMAND_SET_ALIAS, i2, i3, this);
                    mo20731c2();
                    m20730b2();
                    wvx wvxVar = this.f14987H;
                    if (wvxVar.f191056c == 0) {
                        wvxVar.f191056c = System.currentTimeMillis();
                    }
                    oq70.m168791d().m168795c("Pipeline_Flow_pip->MOMO", "IJK 推流器 报告： MOMO_PUBLISHING, 此时进入双推模式");
                    break;
                case 103:
                    this.f166080O1 = true;
                    this.f14988I.m122854w(i2);
                    this.f166070J1.mo165950g(CommandMessage.COMMAND_SET_TAGS, i2, i3, this);
                    break;
                case 104:
                    this.f166070J1.mo165950g(CommandMessage.COMMAND_UNSET_TAGS, i2, i3, this);
                    break;
                case 105:
                    this.f166080O1 = false;
                    this.f14988I.m122855x(i2);
                    this.f166070J1.mo165950g(CommandMessage.COMMAND_GET_TAGS, i2, i3, this);
                    break;
                case 106:
                    this.f166070J1.mo165950g(CommandMessage.COMMAND_GET_ALIAS, i2, i3, this);
                    break;
                case 107:
                    this.f166070J1.mo165950g(CommandMessage.COMMAND_UNSET_ALIAS, i2, i3, this);
                    break;
                case 108:
                    this.f14988I.m122843l("PUBLISHED");
                    this.f166070J1.mo165950g(CommandMessage.COMMAND_CLEAR_ALL_NOTIFICATION, i2, i3, this);
                    oq70.m168791d().m168795c("Pipeline_Flow_pip->MOMO", "IJK 推流器 报告： MOMO_PUBLISHED, 此时 IJK 已经推流 5 秒钟 推流成功，此时应该结束连麦推流");
                    break;
                case 109:
                    short s = (short) ((i2 >> 16) & p7f.COLOR_SPACE_UNCALIBRATED);
                    short s2 = (short) (i2 & p7f.COLOR_SPACE_UNCALIBRATED);
                    this.f14988I.m122853v(s * 23, s2 * 23, s - s2, ((short) ((i3 >> 16) & p7f.COLOR_SPACE_UNCALIBRATED)) - ((short) (i3 & p7f.COLOR_SPACE_UNCALIBRATED)));
                    break;
            }
        } else {
            this.f166070J1.mo165950g(CommandMessage.COMMAND_SET_PUSH_TIME, i2, i3, this);
        }
        if (i != 100 || (ijkWriter = this.f166104l1) == null) {
            return;
        }
        ijkWriter.notifyPrepared();
        if (this.f106168U0 != null) {
            oq70.m168791d().m168795c("Pipeline_Flow_pip->MOMO", "start Record writeAudioExtradata: mAudioHeader len " + this.f106168U0.limit() + ";isReadyToWrite:");
            IjkWriter ijkWriter2 = this.f166104l1;
            ByteBuffer byteBuffer = this.f106168U0;
            ijkWriter2.writeAudioExtradata(byteBuffer, (long) byteBuffer.limit());
        } else if (this.f106170V0 != null) {
            oq70.m168791d().m168795c("Pipeline_Flow_pip->MOMO", "start Record writeAudioExtradata: mSoftAudioHeader len " + this.f106170V0.limit() + ";isReadyToWrite:");
            IjkWriter ijkWriter3 = this.f166104l1;
            ByteBuffer byteBuffer2 = this.f106170V0;
            ijkWriter3.writeAudioExtradata(byteBuffer2, (long) byteBuffer2.limit());
        }
        if (this.f166110o1 != null) {
            oq70.m168791d().m168795c("Pipeline_Flow_pip->MOMO", "start Record writeVideoExtradata: mVideoExtraData len " + this.f166110o1.limit() + ";isReadyToWrite:" + this.f166112p1);
            IjkWriter ijkWriter4 = this.f166104l1;
            ByteBuffer byteBuffer3 = this.f166110o1;
            ijkWriter4.writeVideoExtradata(byteBuffer3, (long) byteBuffer3.limit());
        } else if (this.f106172W0 != null) {
            oq70.m168791d().m168795c("Pipeline_Flow_pip->MOMO", "start Record writeVideoExtradata: mSoftVideoHeader len " + this.f106172W0.limit() + ";isReadyToWrite:");
            IjkWriter ijkWriter5 = this.f166104l1;
            ByteBuffer byteBuffer4 = this.f106172W0;
            ijkWriter5.writeVideoExtradata(byteBuffer4, (long) byteBuffer4.limit());
        }
        this.f166112p1 = true;
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyRecording() {
        oq70.m168791d().m168795c("Pipeline_Flow_pip->MOMO", "notifyRecording !##########################");
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: o0 */
    public long mo21033o0() {
        IjkWriter ijkWriter = this.f166104l1;
        if (ijkWriter != null) {
            return ijkWriter.getVideoPts();
        }
        return 0L;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: o1 */
    public boolean mo20666o1(ByteBuffer byteBuffer) {
        return false;
    }

    @Override // p153l.wej
    public void onDrawFrame() {
        super.onDrawFrame();
        this.f166132z1++;
    }

    @Override // p153l.g220
    /* JADX INFO: renamed from: p0 */
    public boolean mo20762p0(ByteBuffer byteBuffer) {
        return m184408L4(byteBuffer, 2);
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: p1 */
    public int mo21035p1() {
        return getVideoWidth();
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: q1 */
    public long mo21037q1() {
        IjkWriter ijkWriter;
        return (!this.f106176Y0 || (ijkWriter = this.f166104l1) == null) ? this.f166120t1 : ijkWriter.getPropertyLong(20012, 0L);
    }

    /* JADX INFO: renamed from: q4 */
    public void m184420q4(boolean z) {
        this.f14987H.f191040V = z ? 1L : 0L;
        this.f14988I.m122843l("muteLocalAudioStream", Boolean.valueOf(z));
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: r0 */
    public long mo21040r0() {
        long propertyLong;
        long propertyLong2;
        IjkWriter ijkWriter = this.f166104l1;
        if (ijkWriter == null) {
            return 0L;
        }
        if (this.f106176Y0) {
            propertyLong = this.f166130y1;
            propertyLong2 = this.f14987H.f191050a;
        } else {
            propertyLong = ijkWriter.getPropertyLong(20016, 0L);
            propertyLong2 = this.f166104l1.getPropertyLong(ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME, 0L);
            if (propertyLong == 0 || propertyLong2 == 0) {
                propertyLong = this.f166130y1;
                propertyLong2 = this.f14987H.f191050a;
            }
        }
        long j = propertyLong - propertyLong2;
        if (j < 0) {
            return 0L;
        }
        return j;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: s0 */
    public int mo21043s0() {
        wvx wvxVar = this.f14987H;
        if (wvxVar != null) {
            return (int) wvxVar.f191046Y;
        }
        return 0;
    }

    @Override // p153l.g220
    /* JADX INFO: renamed from: t1 */
    public boolean mo20763t1(ByteBuffer byteBuffer, long j) {
        oq70.m168791d().m168795c("Pipeline_Flow_pip->MOMO", "  writeAudioExtradata: len " + j + ";isReadyToWrite:" + this.f166112p1);
        if (!this.f166112p1) {
            this.f106170V0 = byteBuffer;
            return false;
        }
        IjkWriter ijkWriter = this.f166104l1;
        if (ijkWriter == null) {
            return true;
        }
        ijkWriter.writeAudioExtradata(byteBuffer, j);
        return true;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: u0 */
    public long mo21046u0() {
        IjkWriter ijkWriter = this.f166104l1;
        if (ijkWriter != null) {
            return ijkWriter.getPropertyLong(20003, 0L);
        }
        return 0L;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: u1 */
    public long mo21047u1() {
        IjkWriter ijkWriter = this.f166104l1;
        if (ijkWriter != null) {
            return ijkWriter.getPropertyLong(20007, 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: u4 */
    public void m184421u4() {
        this.f166078N1 = System.nanoTime() / 1000;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: w1 */
    public String mo21051w1() {
        return "M";
    }

    @Override // p153l.g220
    @RequiresApi(api = 16)
    /* JADX INFO: renamed from: x0 */
    public int mo20764x0(MediaFormat mediaFormat, int i) {
        IjkWriter ijkWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        IjkWriter ijkWriter2;
        int iM131935K2 = m131935K2(mediaFormat, i);
        oq70.m168791d().m168795c("Pipeline_Flow_pip->MOMO", "addMediaTrack" + i);
        if (iM131935K2 == 1) {
            ByteBuffer byteBuffer3 = this.f106168U0;
            if (byteBuffer3 != null) {
                byteBuffer3.rewind();
                oq70.m168791d().m168795c("Pipeline_Flow_pip->MOMO", "  writeAudioExtradata: len " + this.f106168U0.limit() + ";isReadyToWrite:" + this.f166112p1);
                if (this.f166112p1 && (ijkWriter2 = this.f166104l1) != null) {
                    ByteBuffer byteBuffer4 = this.f106168U0;
                    ijkWriter2.writeAudioExtradata(byteBuffer4, byteBuffer4.limit());
                }
                this.f106168U0.rewind();
                return iM131935K2;
            }
        } else if (iM131935K2 == 2) {
            ByteBuffer byteBuffer5 = this.f106162R0;
            int iLimit = byteBuffer5 != null ? byteBuffer5.limit() : 0;
            ByteBuffer byteBuffer6 = this.f106161Q0;
            int iLimit2 = byteBuffer6 != null ? byteBuffer6.limit() : 0;
            ByteBuffer byteBuffer7 = this.f106160P0;
            int iLimit3 = (byteBuffer7 != null ? byteBuffer7.limit() : 0) + iLimit2 + iLimit;
            if (iLimit3 != 0) {
                ByteBuffer byteBuffer8 = this.f166110o1;
                if (byteBuffer8 != null) {
                    byteBuffer8.clear();
                    this.f166110o1 = null;
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iLimit3);
                this.f166110o1 = byteBufferAllocate;
                if (byteBufferAllocate != null) {
                    byteBufferAllocate.rewind();
                    this.f166110o1.position(0);
                    ByteBuffer byteBuffer9 = this.f106162R0;
                    if (byteBuffer9 != null) {
                        byteBuffer9.rewind();
                        this.f166110o1.put(this.f106162R0.array());
                        this.f106162R0.rewind();
                    } else if (this.f106161Q0 != null && (byteBuffer2 = this.f106160P0) != null) {
                        byteBuffer2.rewind();
                        this.f106161Q0.rewind();
                        this.f166110o1.put(this.f106161Q0.array());
                        this.f166110o1.put(this.f106160P0.array());
                        this.f106160P0.rewind();
                        this.f106161Q0.rewind();
                    }
                    this.f166110o1.rewind();
                    oq70.m168791d().m168795c("Pipeline_Flow_pip->MOMO", "  writeVideoExtradata: len " + this.f166110o1.limit() + ";isReadyToWrite:" + this.f166112p1);
                }
                if (this.f166112p1 && (ijkWriter = this.f166104l1) != null && (byteBuffer = this.f166110o1) != null) {
                    ijkWriter.writeVideoExtradata(byteBuffer, byteBuffer.limit());
                }
            }
        }
        return iM131935K2;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: x1 */
    public long mo21053x1() {
        return this.f166052A1 * 1024;
    }

    /* JADX INFO: renamed from: x4 */
    public void m184422x4() {
        if (this.f166078N1 != 0) {
            this.f166076M1 += (System.nanoTime() / 1000) - this.f166078N1;
            this.f166078N1 = 0L;
        }
    }

    @Override // p153l.g220
    /* JADX INFO: renamed from: z0 */
    public boolean mo20765z0(ByteBuffer byteBuffer, long j) {
        oq70.m168791d().m168795c("Pipeline_Flow_pip->MOMO", "  writeVideoExtradata: len " + j + ";isReadyToWrite:" + this.f166112p1);
        if (!this.f166112p1) {
            this.f106172W0 = byteBuffer;
            return false;
        }
        IjkWriter ijkWriter = this.f166104l1;
        if (ijkWriter == null) {
            return true;
        }
        ijkWriter.writeVideoExtradata(byteBuffer, j);
        return true;
    }

    /* JADX INFO: renamed from: z4 */
    public void m184423z4(int i) {
        this.f14987H.f191074i = i;
    }

    /* JADX INFO: renamed from: l.s410$e */
    public class C19976e implements ExtAudioWrapper.InterfaceC4259i {
        private C19976e() {
        }

        @Override // com.momo.piplinemomoext.input.audio.ExtAudioWrapper.InterfaceC4259i
        public int getStreamerType() {
            return 0;
        }

        @Override // com.momo.piplinemomoext.input.audio.ExtAudioWrapper.InterfaceC4259i
        /* JADX INFO: renamed from: b */
        public void mo21060b() {
        }

        @Override // com.momo.piplinemomoext.input.audio.ExtAudioWrapper.InterfaceC4259i
        /* JADX INFO: renamed from: a */
        public void mo21059a(String str) {
        }
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: A */
    public void mo20645A() {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: C0 */
    public void mo20646C0() {
    }

    @Override // p153l.grx
    /* JADX INFO: renamed from: E2 */
    public g220 mo20751E2() {
        return this;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    public MediaBaseCodecFilter getFilter() {
        return this;
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyEffectReset() {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyExtralAudioLoss() {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyExtralAudioReady() {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyResumeRecording() {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyUpdateResolution() {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: o */
    public void mo20665o() {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void setSourceSucess() {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void stopSurroundMusic() {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: C1 */
    public void mo20647C1(String str) {
    }

    @Override // p153l.g220
    /* JADX INFO: renamed from: H1 */
    public void mo20753H1(int i) {
    }

    @Override // p153l.g220
    /* JADX INFO: renamed from: W */
    public void mo20759W(ByteBuffer byteBuffer) {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyEnableExtralAudio(boolean z) {
    }

    @Override // p153l.g220
    /* JADX INFO: renamed from: f0 */
    public void mo20760f0(ByteBuffer byteBuffer, long j) {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: l0 */
    public void mo20663l0(uow uowVar, EGLContext eGLContext) {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyAdjustAef(int i, boolean z) {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyAdjustEQ(int i, boolean z) {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyAdjustEf(int i, int i2) {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyAdjustTune(int i, boolean z) {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: p */
    public void mo20667p(String str, int i) {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void setStreamerCaptureType(int i, int i2) {
    }

    @Override // p153l.grx, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: y */
    public void mo20670y(int i, int i2) {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyEffectSet(int i, int i2, float f) {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void startSurroundMusic(String str, int i, long j) {
    }
}
