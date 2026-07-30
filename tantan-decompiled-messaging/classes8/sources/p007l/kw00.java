package p007l;

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
import com.immomo.mediabase.Nalu;
import com.immomo.mediacore.sink.IjkWriter;
import com.immomo.mediacore.strinf.NotifyCenter;
import com.immomo.mediacore.strinf.VideoQuality;
import com.immomo.medialog.util.LimitedQueue;
import com.momo.pipline.MomoInterface.MomoCodec;
import com.momo.pipline.MomoInterface.MomoPipeline;
import com.momo.pipline.codec.MediaBaseCodecFilter;
import com.momo.piplinemomoext.input.audio.ExtAudioWrapper;
import com.momo.xeengine.gift.XEGiftErrorCode;
import com.p003p1.mobile.longlink.msg.connector.LongLinkMessage;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l.di70;
import l.dxl;
import l.ewl;
import l.eyx;
import l.fjx;
import l.gw00;
import l.hgb0;
import l.hmx;
import l.hu00;
import l.ii70;
import l.jix;
import l.mpd0;
import l.mvj0;
import l.n8c;
import l.qjx;
import l.rjx;
import l.st0;
import l.u3m;
import l.ulw;
import l.vlw;
import l.xxx;
import l.ya1;
import l.yt10;
import l.yw00;
import l.zmx;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class kw00 extends jix implements yt10, NotifyCenter, ya1, ewl, gw00.f {

    /* JADX INFO: renamed from: A1 */
    private int f3098A1;

    /* JADX INFO: renamed from: A2 */
    private boolean f3099A2;

    /* JADX INFO: renamed from: B1 */
    private int f3100B1;

    /* JADX INFO: renamed from: B2 */
    private volatile boolean f3101B2;

    /* JADX INFO: renamed from: C1 */
    private int f3102C1;

    /* JADX INFO: renamed from: C2 */
    private long f3103C2;

    /* JADX INFO: renamed from: D1 */
    private int f3104D1;

    /* JADX INFO: renamed from: D2 */
    private long f3105D2;

    /* JADX INFO: renamed from: E1 */
    private boolean f3106E1;

    /* JADX INFO: renamed from: E2 */
    private final Pattern f3107E2;

    /* JADX INFO: renamed from: F1 */
    private boolean f3108F1;

    /* JADX INFO: renamed from: F2 */
    private final Pattern f3109F2;

    /* JADX INFO: renamed from: G1 */
    private boolean f3110G1;

    /* JADX INFO: renamed from: G2 */
    private final Pattern f3111G2;

    /* JADX INFO: renamed from: H1 */
    private boolean f3112H1;

    /* JADX INFO: renamed from: H2 */
    private long f3113H2;

    /* JADX INFO: renamed from: I1 */
    private boolean f3114I1;

    /* JADX INFO: renamed from: I2 */
    private String f3115I2;

    /* JADX INFO: renamed from: J1 */
    private hu00.a f3116J1;

    /* JADX INFO: renamed from: J2 */
    private int f3117J2;

    /* JADX INFO: renamed from: K1 */
    public ya1 f3118K1;

    /* JADX INFO: renamed from: K2 */
    public HandlerThread f3119K2;

    /* JADX INFO: renamed from: L1 */
    private hgd0 f3120L1;

    /* JADX INFO: renamed from: L2 */
    public HandlerC0591c f3121L2;

    /* JADX INFO: renamed from: M1 */
    protected long f3122M1;

    /* JADX INFO: renamed from: M2 */
    public LimitedQueue<Integer> f3123M2;

    /* JADX INFO: renamed from: N1 */
    protected long f3124N1;

    /* JADX INFO: renamed from: N2 */
    private int f3125N2;

    /* JADX INFO: renamed from: O1 */
    private boolean f3126O1;

    /* JADX INFO: renamed from: O2 */
    private int f3127O2;

    /* JADX INFO: renamed from: P1 */
    private long f3128P1;

    /* JADX INFO: renamed from: Q1 */
    private long f3129Q1;

    /* JADX INFO: renamed from: R1 */
    private long f3130R1;

    /* JADX INFO: renamed from: S1 */
    private long f3131S1;

    /* JADX INFO: renamed from: T1 */
    private kp1 f3132T1;

    /* JADX INFO: renamed from: U1 */
    private long f3133U1;

    /* JADX INFO: renamed from: V1 */
    private long f3134V1;

    /* JADX INFO: renamed from: W1 */
    private int[] f3135W1;

    /* JADX INFO: renamed from: X1 */
    private int f3136X1;

    /* JADX INFO: renamed from: Y1 */
    private LimitedQueue<Integer> f3137Y1;

    /* JADX INFO: renamed from: Z1 */
    private hgb0 f3138Z1;

    /* JADX INFO: renamed from: a2 */
    private Handler f3139a2;

    /* JADX INFO: renamed from: b2 */
    private mvj0 f3140b2;

    /* JADX INFO: renamed from: c2 */
    private int f3141c2;

    /* JADX INFO: renamed from: d2 */
    private int f3142d2;

    /* JADX INFO: renamed from: e2 */
    private long f3143e2;

    /* JADX INFO: renamed from: f2 */
    private long f3144f2;

    /* JADX INFO: renamed from: g2 */
    private long f3145g2;

    /* JADX INFO: renamed from: h2 */
    private boolean f3146h2;

    /* JADX INFO: renamed from: i2 */
    private int f3147i2;

    /* JADX INFO: renamed from: j2 */
    private long f3148j2;

    /* JADX INFO: renamed from: k2 */
    private long f3149k2;

    /* JADX INFO: renamed from: l1 */
    IjkWriter f3150l1;

    /* JADX INFO: renamed from: l2 */
    private long f3151l2;

    /* JADX INFO: renamed from: m1 */
    private long f3152m1;

    /* JADX INFO: renamed from: m2 */
    private boolean f3153m2;

    /* JADX INFO: renamed from: n1 */
    private long f3154n1;

    /* JADX INFO: renamed from: n2 */
    private LinkedList<C0590b> f3155n2;

    /* JADX INFO: renamed from: o1 */
    private ByteBuffer f3156o1;

    /* JADX INFO: renamed from: o2 */
    private LinkedList<Long> f3157o2;

    /* JADX INFO: renamed from: p1 */
    boolean f3158p1;

    /* JADX INFO: renamed from: p2 */
    private int f3159p2;

    /* JADX INFO: renamed from: q1 */
    private int f3160q1;

    /* JADX INFO: renamed from: q2 */
    private long f3161q2;

    /* JADX INFO: renamed from: r1 */
    private String f3162r1;

    /* JADX INFO: renamed from: r2 */
    private long f3163r2;

    /* JADX INFO: renamed from: s1 */
    private String f3164s1;

    /* JADX INFO: renamed from: s2 */
    private long f3165s2;

    /* JADX INFO: renamed from: t1 */
    private long f3166t1;

    /* JADX INFO: renamed from: t2 */
    private long f3167t2;

    /* JADX INFO: renamed from: u1 */
    private long f3168u1;

    /* JADX INFO: renamed from: u2 */
    private long f3169u2;

    /* JADX INFO: renamed from: v1 */
    private long f3170v1;

    /* JADX INFO: renamed from: v2 */
    private long f3171v2;

    /* JADX INFO: renamed from: w1 */
    private long f3172w1;

    /* JADX INFO: renamed from: w2 */
    private boolean f3173w2;

    /* JADX INFO: renamed from: x1 */
    private long f3174x1;

    /* JADX INFO: renamed from: x2 */
    private long f3175x2;

    /* JADX INFO: renamed from: y1 */
    private long f3176y1;

    /* JADX INFO: renamed from: y2 */
    private int f3177y2;

    /* JADX INFO: renamed from: z1 */
    private int f3178z1;

    /* JADX INFO: renamed from: z2 */
    private C0592d f3179z2;

    /* JADX INFO: renamed from: l.kw00$b */
    public class C0590b {

        /* JADX INFO: renamed from: a */
        public ByteBuffer f3180a;

        /* JADX INFO: renamed from: b */
        public long f3181b;

        /* JADX INFO: renamed from: c */
        public long f3182c;

        /* JADX INFO: renamed from: d */
        public int f3183d;

        /* JADX INFO: renamed from: e */
        public long f3184e;

        private C0590b() {
        }
    }

    /* JADX INFO: renamed from: l.kw00$c */
    public class HandlerC0591c extends Handler {
        public HandlerC0591c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            if (message.what != 202) {
                return;
            }
            long jM9759i4 = kw00.this.m9759i4();
            long jM9743b1 = kw00.this.m9743b1();
            int i = (int) jM9759i4;
            int i2 = i - kw00.this.f3125N2;
            int i3 = (int) jM9743b1;
            int i4 = i3 - kw00.this.f3127O2;
            if (kw00.this.f3138Z1 != null) {
                kw00.this.f3138Z1.c(i2, i4);
            }
            kw00.this.f3123M2.add(Integer.valueOf(i2));
            kw00.this.f3125N2 = i;
            kw00.this.f3127O2 = i3;
            sendEmptyMessageDelayed(XEGiftErrorCode.ERROR_CODE_HTTP_ERROR, 1000L);
        }
    }

    /* JADX INFO: renamed from: l.kw00$d */
    public class C0592d {

        /* JADX INFO: renamed from: a */
        private int f3187a = -1;

        /* JADX INFO: renamed from: b */
        private int f3188b = -1;

        /* JADX INFO: renamed from: c */
        private int f3189c = -1;

        /* JADX INFO: renamed from: d */
        private int f3190d = -1;

        /* JADX INFO: renamed from: e */
        private int f3191e = -1;

        /* JADX INFO: renamed from: f */
        private int f3192f = -1;

        /* JADX INFO: renamed from: g */
        private long f3193g = 0;

        public C0592d() {
        }

        /* JADX WARN: Code duplicated, block: B:56:0x019c  */
        /* JADX WARN: Code duplicated, block: B:57:0x019d  */
        /* JADX WARN: Code duplicated, block: B:60:0x01a9 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x000f, B:12:0x001c, B:16:0x0028, B:18:0x002f, B:20:0x003b, B:22:0x0047, B:41:0x00b0, B:23:0x004b, B:25:0x0059, B:27:0x0063, B:29:0x0070, B:31:0x007d, B:32:0x0080, B:34:0x008a, B:36:0x0094, B:38:0x00a1, B:40:0x00ae, B:43:0x00ed, B:45:0x00f3, B:47:0x00f6, B:54:0x0168, B:58:0x019e, B:60:0x01a9, B:49:0x0134, B:51:0x0138, B:53:0x013d), top: B:65:0x0005 }] */
        /* JADX INFO: renamed from: e */
        private synchronized void m9792e(int i) {
            int iB;
            long j;
            if (((MediaBaseCodecFilter) kw00.this).s.M0 || kw00.this.f3173w2) {
                if (((MediaBaseCodecFilter) kw00.this).s.N0 <= 0) {
                    return;
                }
                int i2 = 1;
                if (this.f3187a == -1) {
                    if (((ulw) ((MediaBaseCodecFilter) kw00.this).s).m == 528 && ((ulw) ((MediaBaseCodecFilter) kw00.this).s).n == 960) {
                        this.f3187a = 2;
                    } else if (((ulw) ((MediaBaseCodecFilter) kw00.this).s).m == 352 && ((ulw) ((MediaBaseCodecFilter) kw00.this).s).n == 640 && (((ulw) ((MediaBaseCodecFilter) kw00.this).s).H == 750000 || ((ulw) ((MediaBaseCodecFilter) kw00.this).s).H == 768000)) {
                        this.f3187a = 1;
                    } else if (((ulw) ((MediaBaseCodecFilter) kw00.this).s).m == 352 && ((ulw) ((MediaBaseCodecFilter) kw00.this).s).n == 640 && (((ulw) ((MediaBaseCodecFilter) kw00.this).s).H == 500000 || ((ulw) ((MediaBaseCodecFilter) kw00.this).s).H == 512000)) {
                        this.f3187a = 0;
                    }
                    this.f3188b = this.f3187a;
                    ii70.d().a("Pipeline_Flow_pip->MOMO", "jzheng init current level " + this.f3188b + " " + ((ulw) ((MediaBaseCodecFilter) kw00.this).s).H + " " + ((ulw) ((MediaBaseCodecFilter) kw00.this).s).m);
                }
                if (i == 0) {
                    int i3 = this.f3187a;
                    int i4 = this.f3188b;
                    if (i3 != i4 && i4 + 1 <= i3) {
                        ii70.d().a("Pipeline_Flow_pip->MOMO", "jzheng 网络拥塞解除。" + kw00.this.f3169u2);
                        this.f3188b = this.f3188b + 1;
                        kw00 kw00Var = kw00.this;
                        kw00Var.f3117J2 = ((ulw) ((MediaBaseCodecFilter) kw00Var).s).H;
                        di70.a(((MediaBaseCodecFilter) kw00.this).s, this.f3188b);
                        kw00.this.m9688w4(0, 0);
                        kw00 kw00Var2 = kw00.this;
                        kw00Var2.f3141c2 = ((ulw) ((MediaBaseCodecFilter) kw00Var2).s).m;
                        kw00 kw00Var3 = kw00.this;
                        kw00Var3.f3142d2 = ((ulw) ((MediaBaseCodecFilter) kw00Var3).s).n;
                        kw00.this.f3169u2 = 0L;
                        kw00.m9665k3(kw00.this);
                        iB = ((MediaBaseCodecFilter) kw00.this).s.b();
                        if (kw00.this.f3173w2) {
                            i2 = iB;
                        }
                        j = i2;
                        if (kw00.this.f3171v2 > j) {
                            kw00.this.f3171v2 = j;
                        }
                    }
                } else if (i == 1 && this.f3187a != 0 && this.f3188b - 1 >= 0) {
                    ii70.d().a("Pipeline_Flow_pip->MOMO", "jzheng 进入拥塞。");
                    this.f3188b--;
                    kw00 kw00Var4 = kw00.this;
                    kw00Var4.f3117J2 = ((ulw) ((MediaBaseCodecFilter) kw00Var4).s).H;
                    di70.a(((MediaBaseCodecFilter) kw00.this).s, this.f3188b);
                    kw00.this.m9688w4(1, 0);
                    kw00 kw00Var5 = kw00.this;
                    kw00Var5.f3141c2 = ((ulw) ((MediaBaseCodecFilter) kw00Var5).s).m;
                    kw00 kw00Var6 = kw00.this;
                    kw00Var6.f3142d2 = ((ulw) ((MediaBaseCodecFilter) kw00Var6).s).n;
                    kw00.this.f3169u2 = 0L;
                    kw00.m9665k3(kw00.this);
                    iB = ((MediaBaseCodecFilter) kw00.this).s.b();
                    if (kw00.this.f3173w2) {
                        i2 = iB;
                    }
                    j = i2;
                    if (kw00.this.f3171v2 > j) {
                        kw00.this.f3171v2 = j;
                    }
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:47:0x0191  */
        /* JADX WARN: Code duplicated, block: B:48:0x0192 A[Catch: all -> 0x001f, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0013, B:12:0x0022, B:14:0x0027, B:17:0x006a, B:20:0x0072, B:22:0x0081, B:23:0x0083, B:45:0x0167, B:49:0x019c, B:51:0x01a7, B:48:0x0192, B:24:0x00a0, B:26:0x00d5, B:28:0x00dd, B:30:0x00e6, B:32:0x00f1, B:33:0x00f7, B:35:0x010c, B:39:0x011e, B:41:0x0122, B:44:0x0144, B:52:0x01ad), top: B:57:0x0005 }] */
        /* JADX WARN: Code duplicated, block: B:51:0x01a7 A[Catch: all -> 0x001f, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0013, B:12:0x0022, B:14:0x0027, B:17:0x006a, B:20:0x0072, B:22:0x0081, B:23:0x0083, B:45:0x0167, B:49:0x019c, B:51:0x01a7, B:48:0x0192, B:24:0x00a0, B:26:0x00d5, B:28:0x00dd, B:30:0x00e6, B:32:0x00f1, B:33:0x00f7, B:35:0x010c, B:39:0x011e, B:41:0x0122, B:44:0x0144, B:52:0x01ad), top: B:57:0x0005 }] */
        /* JADX INFO: renamed from: f */
        private synchronized void m9793f(int i) {
            int length;
            long j;
            if (((MediaBaseCodecFilter) kw00.this).H.s == 111 || !((MediaBaseCodecFilter) kw00.this).s.X0) {
                if (this.f3189c == -1) {
                    int i2 = ((ulw) kw00.this.Z1()).H;
                    this.f3189c = i2;
                    this.f3190d = i2;
                    n8c.a("newBitrate", "jzheng init  " + this.f3190d + " " + ((ulw) kw00.this.Z1()).H + " " + ((ulw) ((MediaBaseCodecFilter) kw00.this).s).m);
                }
                int iB = 1;
                if (i == 0) {
                    int i3 = this.f3189c;
                    int i4 = this.f3190d;
                    if (i3 == i4 || i4 >= i3) {
                        eyx.c().g(new Object[]{"NOT PUSH_LEVEL_CHANGE_UP origBitrate:" + this.f3189c + ", currBitrate:" + this.f3190d + ",audioBufCheckCount:" + kw00.this.f3169u2});
                    } else {
                        int iQ = i4 + fjx.R().Q();
                        this.f3190d = iQ;
                        int i5 = this.f3189c;
                        if (iQ > i5) {
                            this.f3190d = i5;
                        }
                        kw00 kw00Var = kw00.this;
                        kw00Var.f3117J2 = ((ulw) kw00Var.Z1()).H;
                        di70.c(((MediaBaseCodecFilter) kw00.this).s, this.f3190d);
                        kw00.this.m9688w4(0, 0);
                        kw00 kw00Var2 = kw00.this;
                        kw00Var2.f3141c2 = ((ulw) kw00Var2.Z1()).m;
                        kw00 kw00Var3 = kw00.this;
                        kw00Var3.f3142d2 = ((ulw) kw00Var3.Z1()).n;
                        kw00.this.f3169u2 = 0L;
                        kw00.m9665k3(kw00.this);
                        if (kw00.this.f3173w2) {
                            iB = kw00.this.Z1().b();
                        }
                        j = iB;
                        if (kw00.this.f3171v2 > j) {
                            kw00.this.f3171v2 = j;
                        }
                    }
                } else if (i == 1) {
                    if (kw00.this.f3135W1 == null || kw00.this.f3135W1.length <= 0) {
                        length = 0;
                    } else {
                        int i6 = 0;
                        for (int i7 : kw00.this.f3135W1) {
                            i6 += i7;
                        }
                        length = (int) (((double) (i6 / kw00.this.f3135W1.length)) * fjx.R().i());
                    }
                    kw00 kw00Var4 = kw00.this;
                    int iM9652a4 = kw00Var4.m9652a4(((MediaBaseCodecFilter) kw00Var4).s);
                    if (this.f3189c != 0 && length > 0 && length >= iM9652a4 && length < this.f3190d) {
                        this.f3190d = length;
                        kw00 kw00Var5 = kw00.this;
                        kw00Var5.f3117J2 = ((ulw) kw00Var5.Z1()).H;
                        di70.c(((MediaBaseCodecFilter) kw00.this).s, this.f3190d);
                        kw00.this.m9688w4(1, 0);
                    } else if (length < 0 || length >= iM9652a4) {
                        eyx.c().g(new Object[]{"videoDynamicScaling_2 newbitrate:" + length + ",curr_min_bit:" + iM9652a4 + ",currbit:" + this.f3190d});
                    } else {
                        this.f3190d = Math.min(iM9652a4, this.f3190d);
                        kw00 kw00Var6 = kw00.this;
                        kw00Var6.f3117J2 = ((ulw) kw00Var6.Z1()).H;
                        di70.c(((MediaBaseCodecFilter) kw00.this).s, this.f3190d);
                        kw00.this.m9688w4(1, 1);
                    }
                    kw00 kw00Var7 = kw00.this;
                    kw00Var7.f3141c2 = ((ulw) kw00Var7.Z1()).m;
                    kw00 kw00Var8 = kw00.this;
                    kw00Var8.f3142d2 = ((ulw) kw00Var8.Z1()).n;
                    kw00.this.f3169u2 = 0L;
                    kw00.m9665k3(kw00.this);
                    if (kw00.this.f3173w2) {
                        iB = kw00.this.Z1().b();
                    }
                    j = iB;
                    if (kw00.this.f3171v2 > j) {
                        kw00.this.f3171v2 = j;
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public synchronized void m9794g() {
            try {
                long j = this.f3193g + 1;
                this.f3193g = j;
                long j2 = j % 2;
                if (j2 == 0) {
                    n8c.a("newBitrate", "jzheng 网络拥塞解除。" + kw00.this.f3169u2);
                    kw00 kw00Var = kw00.this;
                    kw00Var.f3117J2 = ((ulw) kw00Var.Z1()).H;
                    ((ulw) ((MediaBaseCodecFilter) kw00.this).s).m = 528;
                    ((ulw) ((MediaBaseCodecFilter) kw00.this).s).n = 960;
                    ((ulw) ((MediaBaseCodecFilter) kw00.this).s).H = 1024000;
                    kw00.this.m9688w4(0, 0);
                } else if (j2 == 1) {
                    n8c.a("newBitrate", "jzheng 进入拥塞。");
                    kw00 kw00Var2 = kw00.this;
                    kw00Var2.f3117J2 = ((ulw) kw00Var2.Z1()).H;
                    ((ulw) ((MediaBaseCodecFilter) kw00.this).s).m = 352;
                    ((ulw) ((MediaBaseCodecFilter) kw00.this).s).n = 640;
                    ((ulw) ((MediaBaseCodecFilter) kw00.this).s).H = 750000;
                    kw00.this.m9688w4(1, 0);
                }
                kw00 kw00Var3 = kw00.this;
                kw00Var3.f3141c2 = ((ulw) kw00Var3.Z1()).m;
                kw00 kw00Var4 = kw00.this;
                kw00Var4.f3142d2 = ((ulw) kw00Var4.Z1()).n;
                kw00.this.f3169u2 = 0L;
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX WARN: Code duplicated, block: B:37:0x01a5  */
        /* JADX WARN: Code duplicated, block: B:38:0x01a6 A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:4:0x0009, B:6:0x0013, B:9:0x0023, B:11:0x0028, B:14:0x0069, B:16:0x006d, B:19:0x00a0, B:22:0x00c9, B:24:0x00dc, B:25:0x00df, B:35:0x017b, B:39:0x01b0, B:41:0x01bb, B:38:0x01a6, B:27:0x0100, B:29:0x0135, B:31:0x0141, B:33:0x0159, B:34:0x015e), top: B:48:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x01bb A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #0 {all -> 0x0066, blocks: (B:4:0x0009, B:6:0x0013, B:9:0x0023, B:11:0x0028, B:14:0x0069, B:16:0x006d, B:19:0x00a0, B:22:0x00c9, B:24:0x00dc, B:25:0x00df, B:35:0x017b, B:39:0x01b0, B:41:0x01bb, B:38:0x01a6, B:27:0x0100, B:29:0x0135, B:31:0x0141, B:33:0x0159, B:34:0x015e), top: B:48:0x0009 }] */
        /* JADX INFO: renamed from: h */
        private synchronized void m9795h(int i) {
            long j;
            try {
                if (kw00.this.Z1().M0 && ((MediaBaseCodecFilter) kw00.this).H.s == 111) {
                    if (this.f3189c == -1) {
                        this.f3189c = ((ulw) kw00.this.Z1()).H;
                        n8c.a("newBitrate", "jzheng init  " + this.f3190d + " " + ((ulw) kw00.this.Z1()).H + " " + ((ulw) ((MediaBaseCodecFilter) kw00.this).s).m);
                    }
                    if (this.f3191e == -1) {
                        int i2 = ((ulw) kw00.this.Z1()).F;
                        this.f3191e = i2;
                        this.f3192f = i2;
                        n8c.a("newBitrate", "jzheng fps  " + this.f3192f + " " + ((ulw) kw00.this.Z1()).F);
                    }
                    int iB = 1;
                    if (i == 0) {
                        ii70.d().c("Pipeline_Flow_pip->MOMO", "up：,origBitrate=" + this.f3189c + ",currBitrate=" + this.f3190d);
                        int i3 = this.f3189c;
                        int i4 = this.f3190d;
                        if (i3 != i4 && i4 < i3) {
                            ii70.d().c("Pipeline_Flow_pip->MOMO", "网络拥塞解除:----up");
                            int i5 = this.f3192f;
                            if (i5 + 1 <= this.f3191e) {
                                this.f3192f = i5 + 1;
                            }
                            kw00 kw00Var = kw00.this;
                            kw00Var.f3117J2 = ((ulw) kw00Var.Z1()).H;
                            di70.b(((MediaBaseCodecFilter) kw00.this).s, this.f3190d, this.f3192f);
                            kw00.this.m9688w4(0, 0);
                            kw00 kw00Var2 = kw00.this;
                            kw00Var2.f3141c2 = ((ulw) kw00Var2.Z1()).m;
                            kw00 kw00Var3 = kw00.this;
                            kw00Var3.f3142d2 = ((ulw) kw00Var3.Z1()).n;
                            kw00.this.f3169u2 = 0L;
                            kw00.m9665k3(kw00.this);
                            if (kw00.this.f3173w2) {
                                iB = kw00.this.Z1().b();
                            }
                            j = iB;
                            if (kw00.this.f3171v2 > j) {
                                kw00.this.f3171v2 = j;
                            }
                        }
                    } else if (i == 1) {
                        ii70.d().c("Pipeline_Flow_pip->MOMO", "down：,origBitrate=" + this.f3189c + ",currBitrate=" + this.f3190d + ",getAdapt_br_min()=" + fjx.R().l());
                        if (this.f3189c != 0 && this.f3190d >= fjx.R().l()) {
                            ii70.d().c("Pipeline_Flow_pip->MOMO", "进入拥塞: down");
                            if (this.f3192f - 1 >= fjx.R().n()) {
                                this.f3192f--;
                            }
                            kw00 kw00Var4 = kw00.this;
                            kw00Var4.f3117J2 = ((ulw) kw00Var4.Z1()).H;
                            di70.b(((MediaBaseCodecFilter) kw00.this).s, this.f3190d, this.f3192f);
                            kw00.this.m9688w4(1, 0);
                            kw00 kw00Var5 = kw00.this;
                            kw00Var5.f3141c2 = ((ulw) kw00Var5.Z1()).m;
                            kw00 kw00Var6 = kw00.this;
                            kw00Var6.f3142d2 = ((ulw) kw00Var6.Z1()).n;
                            kw00.this.f3169u2 = 0L;
                            kw00.m9665k3(kw00.this);
                            if (kw00.this.f3173w2) {
                                iB = kw00.this.Z1().b();
                            }
                            j = iB;
                            if (kw00.this.f3171v2 > j) {
                                kw00.this.f3171v2 = j;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX INFO: renamed from: c */
        public void m9796c(int i, boolean z) {
            if (z) {
                if (fjx.R().M0()) {
                    m9795h(i);
                }
            } else if (fjx.R().f0()) {
                m9793f(i);
            } else {
                m9792e(i);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m9797d() {
            this.f3189c = -1;
        }
    }

    public kw00(Context context, hu00.a aVar) {
        super(context);
        this.f3152m1 = 0L;
        this.f3154n1 = 0L;
        this.f3158p1 = false;
        this.f3166t1 = 0L;
        this.f3168u1 = 0L;
        this.f3170v1 = 0L;
        this.f3172w1 = 0L;
        this.f3174x1 = 0L;
        this.f3176y1 = 0L;
        this.f3178z1 = 0;
        this.f3098A1 = 0;
        this.f3100B1 = 0;
        this.f3102C1 = 0;
        this.f3104D1 = 0;
        this.f3106E1 = false;
        this.f3108F1 = false;
        this.f3110G1 = false;
        this.f3112H1 = false;
        this.f3114I1 = false;
        this.f3118K1 = null;
        this.f3122M1 = 0L;
        this.f3124N1 = 0L;
        this.f3126O1 = false;
        this.f3128P1 = 0L;
        this.f3129Q1 = -130L;
        this.f3130R1 = -1L;
        this.f3131S1 = -1L;
        this.f3133U1 = -1L;
        this.f3134V1 = 0L;
        this.f3136X1 = 0;
        this.f3139a2 = new Handler(Looper.getMainLooper());
        this.f3141c2 = 0;
        this.f3142d2 = 0;
        this.f3143e2 = 0L;
        this.f3144f2 = 0L;
        this.f3145g2 = 0L;
        this.f3146h2 = false;
        this.f3147i2 = 0;
        this.f3148j2 = -1L;
        this.f3149k2 = 0L;
        this.f3151l2 = 0L;
        this.f3153m2 = false;
        this.f3155n2 = new LinkedList<>();
        this.f3157o2 = new LinkedList<>();
        this.f3159p2 = 0;
        this.f3161q2 = -1L;
        this.f3163r2 = 0L;
        this.f3165s2 = 0L;
        this.f3167t2 = 0L;
        this.f3169u2 = 0L;
        this.f3171v2 = 0L;
        this.f3173w2 = false;
        this.f3175x2 = -1L;
        this.f3177y2 = 6;
        this.f3179z2 = new C0592d();
        this.f3099A2 = false;
        this.f3101B2 = false;
        this.f3103C2 = System.currentTimeMillis();
        this.f3105D2 = 0L;
        this.f3107E2 = Pattern.compile("^rtmp://(?:\\[([0-9a-fA-F:]+)\\]|([^/:]+))(:(\\d+))*/([^/]+)(/(.*))*$");
        this.f3109F2 = Pattern.compile("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
        this.f3111G2 = Pattern.compile("^([0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$|^(([0-9a-fA-F]{1,4}:)*[0-9a-fA-F]{1,4})?::(([0-9a-fA-F]{1,4}:)*[0-9a-fA-F]{1,4})?$");
        this.f3113H2 = 0L;
        this.f3115I2 = "0,-1,-1";
        this.f3117J2 = 0;
        this.f3123M2 = new LimitedQueue<>(5);
        this.f3125N2 = 0;
        this.f3127O2 = 0;
        this.f3116J1 = aVar;
        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
        zmxVar.d = 256L;
        zmxVar.e1 = String.valueOf(hashCode());
    }

    /* JADX INFO: renamed from: E4 */
    private static Map<String, String> m9620E4(String str) throws Exception {
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
    private void m9622F4() {
        if (this.f3119K2 == null) {
            HandlerThread handlerThread = new HandlerThread("PushDetailThread");
            this.f3119K2 = handlerThread;
            handlerThread.start();
            if (this.f3121L2 == null) {
                HandlerC0591c handlerC0591c = new HandlerC0591c(this.f3119K2.getLooper());
                this.f3121L2 = handlerC0591c;
                handlerC0591c.sendEmptyMessageDelayed(XEGiftErrorCode.ERROR_CODE_HTTP_ERROR, 1000L);
            }
            this.f3138Z1 = new hgb0(5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: G4 */
    private boolean m9624G4(boolean z) {
        long propertyLong;
        vlw vlwVar = ((MediaBaseCodecFilter) this).s;
        long j = vlwVar.J0;
        long propertyLong2 = 0;
        if (j > 0) {
            long j2 = vlwVar.K0;
            if (j2 <= 0 || j >= j2) {
                vlwVar.J0 = 2000L;
                vlwVar.K0 = 5000L;
            }
        } else {
            vlwVar.J0 = 2000L;
            vlwVar.K0 = 5000L;
        }
        IjkWriter ijkWriter = this.f3150l1;
        if (ijkWriter != null) {
            propertyLong2 = ijkWriter.getPropertyLong(20007, 0L);
            propertyLong = this.f3150l1.getPropertyLong(20008, 0L);
        } else {
            propertyLong = 0;
        }
        vlw vlwVar2 = ((MediaBaseCodecFilter) this).s;
        long j3 = vlwVar2.J0;
        long j4 = vlwVar2.K0;
        if (!this.f3146h2) {
            boolean z2 = vlwVar2.I0 && ((propertyLong2 > j4 ? 1 : (propertyLong2 == j4 ? 0 : -1)) >= 0 && ((propertyLong * 23) > j4 ? 1 : ((propertyLong * 23) == j4 ? 0 : -1)) >= 0);
            this.f3146h2 = z2;
            if (z2) {
                this.f3147i2 = 0;
                m9672n4(true);
                this.f3116J1.g(12300, 0, 0, this);
            }
        } else if ((propertyLong2 <= j3 || propertyLong * 23 <= j3) && z) {
            this.f3146h2 = false;
            m9672n4(false);
            this.f3116J1.g(12301, 0, 0, this);
        }
        return this.f3146h2;
    }

    /* JADX INFO: renamed from: H4 */
    private void m9626H4() {
        HandlerC0591c handlerC0591c = this.f3121L2;
        if (handlerC0591c == null || this.f3119K2 == null) {
            return;
        }
        handlerC0591c.removeCallbacksAndMessages(null);
        this.f3119K2.quit();
        this.f3121L2 = null;
        this.f3119K2 = null;
    }

    /* JADX INFO: renamed from: I4 */
    private void m9628I4(int i, long j) {
        long j2 = this.f3113H2;
        if (j2 != 0 && j > j2) {
            ((MediaBaseCodecFilter) this).H.R = j - j2;
        }
        this.f3113H2 = j;
    }

    /* JADX INFO: renamed from: J4 */
    private void m9630J4(long j, int i) {
        long jM9754g0 = m9754g0();
        long j2 = ((long) ((jM9754g0 - this.f3134V1) / (j / 1000.0f))) * 8;
        int[] iArr = this.f3135W1;
        if (iArr.length == 0) {
            return;
        }
        if (this.f3136X1 >= iArr.length) {
            this.f3136X1 = 0;
        }
        iArr[this.f3136X1] = (int) j2;
        this.f3137Y1.add(Integer.valueOf(i));
        this.f3136X1++;
        this.f3134V1 = jM9754g0;
    }

    /* JADX INFO: renamed from: K4 */
    private void m9632K4(boolean z) {
        if (this.f3155n2.size() <= 0 || this.f3157o2.size() <= 0) {
            return;
        }
        for (int i = 0; i < this.f3155n2.size(); i++) {
            C0590b c0590b = this.f3155n2.get(i);
            int i2 = c0590b.f3183d;
            if (i2 == 0 || i2 == 5) {
                c0590b.f3181b = this.f3157o2.removeLast().longValue();
            } else {
                c0590b.f3181b = this.f3157o2.removeFirst().longValue();
            }
            long j = c0590b.f3182c + this.f3129Q1;
            long j2 = c0590b.f3181b;
            if (j - j2 > this.f3128P1) {
                this.f3128P1 = j - j2;
            }
            Log.e("huohl", "writeSampleData 1: src dts:" + j + ", pts:" + (c0590b.f3181b + this.f3128P1) + ", deltaDts:" + this.f3129Q1 + ",diffdts: " + this.f3128P1 + ", frame Type: BP");
            ByteBuffer byteBuffer = c0590b.f3180a;
            ByteBuffer byteBufferB2 = B2(byteBuffer, byteBuffer.limit(), false);
            byteBufferB2.flip();
            this.f3150l1.writeVideoPacket2(j, c0590b.f3181b + this.f3128P1, byteBufferB2, byteBufferB2.limit(), z);
            this.f3166t1 = this.f3166t1 + ((long) byteBufferB2.limit());
            this.f3170v1 = this.f3170v1 + 1;
        }
        this.f3157o2.clear();
        this.f3155n2.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public int m9652a4(vlw vlwVar) {
        if (fjx.R().Z0()) {
            eyx.c().g(new Object[]{"isAdaptSizeListEmpty is null"});
        } else {
            for (fjx.b bVar : fjx.R().D0()) {
                if (((ulw) vlwVar).m == bVar.g() && ((ulw) vlwVar).n == bVar.f()) {
                    return bVar.b().intValue();
                }
            }
        }
        return ((ulw) vlwVar).H;
    }

    /* JADX INFO: renamed from: c4 */
    private String m9655c4() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = this.f3123M2.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(m9676p4(it.next()));
            i++;
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: d4 */
    private boolean m9657d4() {
        IjkWriter ijkWriter = this.f3150l1;
        return ijkWriter != null && ijkWriter.getAdapt() == 1;
    }

    /* JADX INFO: renamed from: h4 */
    private String m9662h4(int i, int i2) {
        return null;
    }

    /* JADX INFO: renamed from: k3 */
    public static /* synthetic */ long m9665k3(kw00 kw00Var) {
        long j = kw00Var.f3171v2;
        kw00Var.f3171v2 = 1 + j;
        return j;
    }

    /* JADX INFO: renamed from: k4 */
    private String m9666k4() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = this.f3137Y1.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append("(");
            sb.append(it.next());
            sb.append(")");
            i++;
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: l4 */
    private void m9668l4(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String str2 = m9620E4(str).get("mtag");
            if (str2 == null || str2.isEmpty()) {
                return;
            }
            m2(str2);
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"handleMtagFromUrl", "mtag=".concat(str2)});
        } catch (Exception e) {
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"handleMtagFromUrl", "parse failed: " + e.getMessage()});
        }
    }

    /* JADX INFO: renamed from: m4 */
    private boolean m9670m4(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return this.f3109F2.matcher(str).matches() || this.f3111G2.matcher(str).matches();
    }

    /* JADX INFO: renamed from: n4 */
    private void m9672n4(boolean z) {
        long jM9713J0 = m9713J0();
        long jM9735X0 = m9735X0();
        long jM9781u1 = m9781u1();
        long jM9702D0 = m9702D0();
        if (z) {
            ((MediaBaseCodecFilter) this).I.y(jM9713J0, jM9735X0, jM9781u1, jM9702D0);
        } else {
            ((MediaBaseCodecFilter) this).I.z(jM9713J0, jM9735X0, jM9781u1, jM9702D0, m9744b4());
        }
    }

    /* JADX INFO: renamed from: o4 */
    private void m9674o4(int i, int i2) {
        String str;
        if (i2 == 1) {
            str = "downshift";
        } else {
            str = i == 0 ? "up" : "down";
        }
        String str2 = str;
        int i3 = ((ulw) Z1()).m;
        int i4 = ((ulw) Z1()).n;
        int i5 = ((ulw) Z1()).H;
        int iM9738Y0 = m9738Y0() * LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON_VALUE;
        int i6 = this.f3179z2.f3189c;
        int i7 = Z1().E0;
        int iZ = fjx.R().z();
        int iV = fjx.R().v();
        int iS0 = fjx.R().s0();
        int iA = fjx.R().A();
        hgb0 hgb0Var = this.f3138Z1;
        ((MediaBaseCodecFilter) this).I.A(false, 0L, 0L, 0L, 0L, str2, i3, i4, i5, iM9738Y0, i6, i7, iZ, iV, iS0, iA, m9666k4(), hgb0Var == null ? "" : hgb0Var.a());
    }

    /* JADX INFO: renamed from: p4 */
    private String m9676p4(Object... objArr) {
        StringBuilder sb = new StringBuilder("(");
        if (objArr != null) {
            for (int i = 0; i < objArr.length; i++) {
                if (i != 0) {
                    sb.append(",");
                }
                sb.append(objArr[i]);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: r4 */
    private void m9679r4() {
        long j;
        if (!fjx.R().f0() || ((ulw) ((MediaBaseCodecFilter) this).s).F * 30 > this.f3170v1 || this.f3112H1 || ((MediaBaseCodecFilter) this).H.g1 >= 3) {
            if (this.f3112H1 && this.f3170v1 % 30 == 0) {
                ((MediaBaseCodecFilter) this).I.k("DynamicScaling", "mReplaceStreamMode:" + this.f3112H1);
            }
            if (((MediaBaseCodecFilter) this).H.g1 < 3 || this.f3170v1 % 75 != 0) {
                return;
            }
            ((MediaBaseCodecFilter) this).I.k("netSpeedCheck", "sendSize0cnt >= 3");
            return;
        }
        long propertyLong = -1;
        if (this.f3161q2 == -1) {
            this.f3161q2 = SystemClock.elapsedRealtime();
            this.f3175x2 = SystemClock.elapsedRealtime();
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f3161q2;
        if (jElapsedRealtime > 0 && jElapsedRealtime >= fjx.R().z()) {
            IjkWriter ijkWriter = this.f3150l1;
            if (ijkWriter != null) {
                propertyLong = ijkWriter.getPropertyLong(20008, 0L);
                this.f3150l1.getPropertyLong(20005, 0L);
            }
            long j2 = propertyLong * 23;
            boolean z = j2 >= ((long) fjx.R().v());
            int iS0 = fjx.R().s0();
            int iA = fjx.R().A();
            this.f3161q2 = SystemClock.elapsedRealtime();
            if ((j2 <= iA || j2 <= this.f3167t2) && !z) {
                j = 1;
                this.f3165s2 = 0L;
            } else {
                long j3 = this.f3165s2;
                j = 1;
                this.f3165s2 = j3 + 1;
                if (z) {
                    this.f3165s2 = j3 + 2;
                }
            }
            m9630J4(jElapsedRealtime, (int) j2);
            if (this.f3165s2 > fjx.R().U()) {
                this.f3165s2 = fjx.R().U();
            }
            this.f3167t2 = j2;
            if (j2 <= iS0) {
                this.f3169u2 += j;
            } else {
                this.f3169u2 = 0L;
            }
            if (!this.f3173w2) {
                long j4 = this.f3165s2;
                if (j4 != 0 && j4 % ((long) fjx.R().U()) == 0) {
                    if (((MediaBaseCodecFilter) this).s.c()) {
                        this.f3116J1.g(12299, 0, 0, this);
                        n8c.a("newBitrate", "MOMO_FILTER_INFO ");
                    }
                    this.f3179z2.m9796c(1, m9657d4());
                    this.f3165s2 = 0L;
                }
            }
            long jV = fjx.R().V();
            long j5 = this.f3171v2;
            long j6 = jV * j5;
            if (j5 != 0) {
                long j7 = this.f3169u2;
                if (j7 != 0 && j7 % j6 == 0) {
                    this.f3179z2.m9796c(0, m9657d4());
                }
            }
        }
        if (this.f3173w2) {
            long jElapsedRealtime2 = (SystemClock.elapsedRealtime() - this.f3175x2) / 1000;
            long j8 = ((MediaBaseCodecFilter) this).s.L0;
            if (jElapsedRealtime2 <= 0 || jElapsedRealtime2 % 10 != 0) {
                return;
            }
            this.f3175x2 = SystemClock.elapsedRealtime();
            n8c.a("jzheng", "ab " + jElapsedRealtime2 + "/" + fjx.R().M0() + "/" + fjx.R().l() + "/" + fjx.R().m() + "/" + fjx.R().n() + "/" + ((MediaBaseCodecFilter) this).s.M0);
            this.f3179z2.m9796c(1, m9657d4());
            if (((ulw) ((MediaBaseCodecFilter) this).s).H - fjx.R().l() < fjx.R().m()) {
                this.f3173w2 = false;
            }
        }
    }

    /* JADX INFO: renamed from: s4 */
    private void m9681s4() {
        if (this.f3175x2 == -1) {
            this.f3175x2 = SystemClock.elapsedRealtime();
        }
        long jElapsedRealtime = (SystemClock.elapsedRealtime() - this.f3175x2) / 1000;
        if (jElapsedRealtime <= 0 || jElapsedRealtime % 10 != 0) {
            return;
        }
        this.f3175x2 = SystemClock.elapsedRealtime();
        n8c.a("newBitrate", "ab " + jElapsedRealtime + "/" + fjx.R().M0() + "/" + fjx.R().l() + "/" + fjx.R().m() + "/" + fjx.R().n() + "/" + ((MediaBaseCodecFilter) this).s.M0);
        this.f3179z2.m9794g();
    }

    /* JADX INFO: renamed from: t4 */
    private String m9683t4(String str) {
        Matcher matcher;
        if (str == null || str.length() == 0 || (matcher = this.f3107E2.matcher(str)) == null || !matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        return strGroup != null ? strGroup : matcher.group(2);
    }

    /* JADX INFO: renamed from: v4 */
    private void m9686v4(int i) {
        if (!((MediaBaseCodecFilter) this).s.X0) {
            ((MediaBaseCodecFilter) this).H.y0 = i;
            this.f3116J1.g(12545, i, 0, this);
            ((MediaBaseCodecFilter) this).J = MomoCodec.MomoCodecState.WAIT;
            e2(12545, i);
            return;
        }
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"postNerworkErrorMessage", "local merge net error" + i + ",handler:" + this.f3120L1});
        hgd0 hgd0Var = this.f3120L1;
        if (hgd0Var != null) {
            hgd0Var.m9330p(((MediaBaseCodecFilter) this).s.v0, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4 */
    public void m9688w4(int i, int i2) {
        m9674o4(i, i2);
        this.f3116J1.g(12302, i, 0, this);
    }

    /* JADX INFO: renamed from: y4 */
    private void m9691y4() {
        MomoCodec.MomoCodecState momoCodecState = ((MediaBaseCodecFilter) this).J;
        MomoCodec.MomoCodecState momoCodecState2 = MomoCodec.MomoCodecState.WAIT;
        if (momoCodecState == momoCodecState2) {
            return;
        }
        int i = this.f3153m2 ? 4 : 2;
        if (this.f3148j2 == -1) {
            this.f3148j2 = SystemClock.elapsedRealtime();
        }
        long jElapsedRealtime = (SystemClock.elapsedRealtime() - this.f3148j2) / 1000;
        if (jElapsedRealtime <= 0 || jElapsedRealtime % ((long) i) != 0) {
            return;
        }
        this.f3148j2 = SystemClock.elapsedRealtime();
        long jM9754g0 = m9754g0();
        n8c.a("zhangjj", "from " + this.f3149k2 + " to " + jM9754g0 + " diff " + (jM9754g0 - this.f3149k2) + " cnt " + this.f3151l2);
        if (this.f3153m2) {
            jM9754g0 = 1;
        }
        if (this.f3149k2 != jM9754g0) {
            this.f3149k2 = jM9754g0;
            this.f3151l2 = 0L;
        } else {
            this.f3151l2++;
        }
        if (this.f3151l2 == 5) {
            this.f3151l2 = 0L;
            n8c.a("zhangjj", "get msg Error " + ((MediaBaseCodecFilter) this).J + "/-304/14");
            if (((MediaBaseCodecFilter) this).J == momoCodecState2 || this.f3112H1) {
                return;
            }
            ((MediaBaseCodecFilter) this).J = momoCodecState2;
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"MediaError", "14 sendsize 0 line 923"});
            m9686v4(14);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public int m9694A0() {
        return m9762k0();
    }

    /* JADX INFO: renamed from: A4 */
    public void m9695A4(int i) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setBusinessType", Integer.valueOf(i)});
        ((MediaBaseCodecFilter) this).H.s = i;
    }

    @RequiresApi(api = 16)
    /* JADX INFO: renamed from: B1 */
    public boolean m9696B1(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer byteBuffer2;
        if (!this.f3158p1) {
            return true;
        }
        m9691y4();
        if (this.f3099A2) {
            m9681s4();
        } else {
            m9679r4();
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
        if (((ulw) ((MediaBaseCodecFilter) this).s).b0) {
            m9714K0(byteBuffer2);
            return true;
        }
        if (m9624G4(this.f3146h2 && i == 2 && I2(byteBuffer, bufferInfo.size))) {
            if (i == 2) {
                this.f3147i2++;
                this.f3166t1 += (long) bufferInfo.size;
            } else {
                this.f3168u1 += (long) bufferInfo.size;
            }
            return true;
        }
        if (i == 1) {
            if (this.f3152m1 == 0) {
                this.f3152m1 = bufferInfo.presentationTimeUs;
            }
            long j = ((bufferInfo.presentationTimeUs - this.f3152m1) - this.f3122M1) / 1000;
            this.f3168u1 += (long) (bufferInfo.size - bufferInfo.offset);
            this.f3172w1++;
            if (this.f3176y1 == 0) {
                this.f3176y1 = System.currentTimeMillis();
            }
            IjkWriter ijkWriter = this.f3150l1;
            if (ijkWriter != null) {
                ijkWriter.writeAudioPacket(j + this.f3128P1, byteBuffer2, bufferInfo.size, 0);
            }
        } else if (i == 2) {
            if (this.f3154n1 == 0) {
                this.f3154n1 = bufferInfo.presentationTimeUs;
            }
            try {
                long j2 = ((bufferInfo.presentationTimeUs - this.f3154n1) - this.f3122M1) / 1000;
                if (this.f3130R1 < 0) {
                    this.f3130R1 = j2;
                }
                long jM9610a = this.f3132T1.m9610a(j2);
                long j3 = this.f3130R1;
                long j4 = j2 - j3 > 80 ? j3 + jM9610a : j2;
                if (this.f3131S1 < 0) {
                    this.f3131S1 = j4;
                }
                this.f3130R1 = j2;
                this.f3131S1 = j4;
                if (fjx.R().L() == 1) {
                    byteBuffer.position(0);
                    byte[] bArr = new byte[bufferInfo.size];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    int naluType = Nalu.getNaluType(bArr, bufferInfo.size);
                    if (naluType == 2 || naluType == 7) {
                        if (this.f3150l1 != null) {
                            ByteBuffer byteBufferB2 = B2(byteBuffer2, bufferInfo.size, true);
                            m9632K4(true);
                            this.f3150l1.writeVideoPacket2(j4 + this.f3129Q1, j4 + this.f3128P1, byteBufferB2, byteBufferB2.limit(), true);
                            this.f3166t1 += (long) (bufferInfo.size - bufferInfo.offset);
                            this.f3170v1++;
                        }
                        m9628I4(0, j4);
                    } else {
                        if (naluType == 0 || naluType == 5) {
                            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(byteBuffer2.limit());
                            byteBuffer2.position(0);
                            byteBufferAllocate2.put(byteBuffer2);
                            byteBufferAllocate2.flip();
                            C0590b c0590b = new C0590b();
                            c0590b.f3180a = byteBufferAllocate2;
                            c0590b.f3182c = j4;
                            c0590b.f3181b = j4;
                            c0590b.f3183d = naluType;
                            c0590b.f3184e = this.f3159p2;
                            m9632K4(false);
                            this.f3155n2.add(c0590b);
                            this.f3157o2.add(Long.valueOf(c0590b.f3182c));
                        } else if (naluType == 1 || naluType == 6) {
                            ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(byteBuffer2.limit());
                            byteBuffer2.position(0);
                            byteBufferAllocate3.put(byteBuffer2);
                            byteBufferAllocate3.flip();
                            C0590b c0590b2 = new C0590b();
                            c0590b2.f3180a = byteBufferAllocate3;
                            c0590b2.f3182c = j4;
                            c0590b2.f3181b = 0L;
                            c0590b2.f3183d = naluType;
                            c0590b2.f3184e = this.f3159p2;
                            this.f3155n2.add(c0590b2);
                            this.f3157o2.add(Long.valueOf(c0590b2.f3182c));
                        }
                    }
                } else {
                    long j5 = ((bufferInfo.presentationTimeUs - this.f3154n1) - this.f3122M1) / 1000;
                    boolean zI2 = I2(byteBuffer2, bufferInfo.size);
                    ByteBuffer byteBufferB3 = B2(byteBuffer2, bufferInfo.size, zI2);
                    this.f3166t1 += (long) (bufferInfo.size - bufferInfo.offset);
                    this.f3170v1++;
                    if (this.f3174x1 == 0) {
                        this.f3174x1 = System.currentTimeMillis();
                    }
                    IjkWriter ijkWriter2 = this.f3150l1;
                    if (ijkWriter2 != null) {
                        ijkWriter2.writeVideoPacket(j5, byteBufferB3, byteBufferB3.limit(), zI2);
                        if (zI2) {
                            m9628I4(0, j5);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: B4 */
    public void m9697B4(boolean z) {
        this.f3112H1 = z;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setReplaceStream" + z});
        IjkWriter ijkWriter = this.f3150l1;
        if (ijkWriter != null) {
            ijkWriter.setPropertyLong(30001, z ? 1L : 0L);
            ii70.d().c("Pipeline_Flow_pip->MOMO", getClass().getSimpleName() + "setReplaceStream:" + z);
        }
    }

    /* JADX INFO: renamed from: C */
    public mpd0 m9698C(mpd0 mpd0Var) {
        ya1 ya1Var = this.f3118K1;
        if (ya1Var != null) {
            return ya1Var.C(mpd0Var);
        }
        return null;
    }

    /* JADX INFO: renamed from: C4 */
    public void m9701C4(boolean z) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setReplaceStreamFix:" + z});
        this.f3114I1 = z;
    }

    /* JADX INFO: renamed from: D0 */
    public long m9702D0() {
        IjkWriter ijkWriter = this.f3150l1;
        if (ijkWriter != null) {
            return ijkWriter.getPropertyLong(20008, 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: D1 */
    public String m9703D1() {
        String str = ((MediaBaseCodecFilter) this).H.x;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: D4 */
    public void m9704D4(int i, String str, String str2) {
        this.f3160q1 = i;
        this.f3162r1 = str;
        this.f3164s1 = str2;
    }

    /* JADX INFO: renamed from: E0 */
    public void m9705E0(dxl dxlVar) {
        ((MediaBaseCodecFilter) this).F = dxlVar;
    }

    /* JADX INFO: renamed from: F0 */
    public int m9707F0() {
        return this.f3102C1;
    }

    /* JADX INFO: renamed from: F1 */
    public long m9708F1() {
        IjkWriter ijkWriter = this.f3150l1;
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

    /* JADX INFO: renamed from: G0 */
    public long m9709G0() {
        IjkWriter ijkWriter = this.f3150l1;
        if (ijkWriter != null) {
            return ijkWriter.getVideoCacheSize();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: G2 */
    public qjx m9710G2() {
        return new rjx(this.f3116J1);
    }

    /* JADX INFO: renamed from: H0 */
    public void m9711H0(boolean z) {
        this.f3106E1 = z;
    }

    /* JADX INFO: renamed from: J0 */
    public long m9713J0() {
        IjkWriter ijkWriter = this.f3150l1;
        if (ijkWriter != null) {
            return ijkWriter.getPropertyLong(20008, 0L) * 23;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: K0 */
    public boolean m9714K0(ByteBuffer byteBuffer) {
        return m9718L4(byteBuffer, 1);
    }

    /* JADX INFO: renamed from: K1 */
    public void m9715K1(mpd0 mpd0Var) {
        if (this.f3170v1 > 0 || ((jix) this).Z) {
            this.f3098A1++;
            u3m u3mVar = ((MediaBaseCodecFilter) this).K;
            if (u3mVar != null) {
                mpd0Var = ((ExtAudioWrapper) u3mVar).mo345C(mpd0Var);
            }
            super.K1(mpd0Var);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public long m9716L0() {
        IjkWriter ijkWriter = this.f3150l1;
        if (ijkWriter != null) {
            return ijkWriter.getAVDiff();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: L1 */
    public long m9717L1() {
        return m9740Z3();
    }

    /* JADX INFO: renamed from: L4 */
    public boolean m9718L4(ByteBuffer byteBuffer, int i) {
        if (m9624G4(this.f3146h2 && i == 2 && (I2(byteBuffer, byteBuffer.limit()) || J2(byteBuffer, byteBuffer.limit())))) {
            return true;
        }
        if (i == 2) {
            m9724N4(byteBuffer);
        } else {
            m9721M4(byteBuffer);
        }
        m9679r4();
        return true;
    }

    /* JADX INFO: renamed from: M0 */
    public int m9719M0() {
        return (int) ((MediaBaseCodecFilter) this).H.i;
    }

    /* JADX INFO: renamed from: M1 */
    public void m9720M1() {
        super/*l.nbj*/.M1();
        ii70.d().c("MomoSurfaceFilter", "rendFrameBufferToCodec");
    }

    /* JADX INFO: renamed from: M4 */
    public boolean m9721M4(ByteBuffer byteBuffer) {
        if (!this.f3158p1) {
            return true;
        }
        ii70.d().a("Pipeline_Flow_pip->MOMO", getClass().getSimpleName() + " writeSoftAudioSample:" + byteBuffer.limit());
        if (this.f3152m1 == 0) {
            this.f3152m1 = System.currentTimeMillis();
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f3152m1;
        this.f3168u1 += (long) byteBuffer.limit();
        this.f3172w1++;
        if (this.f3176y1 == 0) {
            this.f3176y1 = System.currentTimeMillis();
        }
        IjkWriter ijkWriter = this.f3150l1;
        if (ijkWriter != null) {
            ijkWriter.writeAudioPacket(jCurrentTimeMillis, byteBuffer, byteBuffer.limit(), 0);
        }
        return true;
    }

    /* JADX INFO: renamed from: N0 */
    public long m9722N0() {
        IjkWriter ijkWriter = this.f3150l1;
        return ijkWriter != null ? ijkWriter.getTxbytes() : ((MediaBaseCodecFilter) this).H.B;
    }

    /* JADX INFO: renamed from: N1 */
    public int m9723N1() {
        return 0;
    }

    /* JADX INFO: renamed from: N4 */
    public boolean m9724N4(ByteBuffer byteBuffer) {
        if (!this.f3158p1) {
            return true;
        }
        boolean zI2 = I2(byteBuffer, byteBuffer.limit());
        ByteBuffer byteBufferA2 = A2(byteBuffer, byteBuffer.limit(), zI2, 0);
        this.f3166t1 += (long) byteBuffer.capacity();
        this.f3170v1++;
        if (this.f3174x1 == 0) {
            this.f3174x1 = System.currentTimeMillis();
        }
        if (this.f3154n1 == 0) {
            this.f3154n1 = System.currentTimeMillis();
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f3154n1;
        ii70.d().a("Pipeline_Flow_pip->MOMO", getClass().getSimpleName() + " writeSoftVideoSample:" + byteBuffer.limit());
        boolean zJ2 = J2(byteBuffer, byteBuffer.limit()) | zI2;
        IjkWriter ijkWriter = this.f3150l1;
        if (zJ2) {
            if (ijkWriter != null) {
                ijkWriter.writeVideoPacket(jCurrentTimeMillis, byteBufferA2, byteBufferA2.limit(), 5);
            }
            m9628I4(0, jCurrentTimeMillis);
        } else if (ijkWriter != null) {
            ijkWriter.writeVideoPacket(jCurrentTimeMillis, byteBufferA2, byteBufferA2.limit(), 1);
        }
        return true;
    }

    /* JADX INFO: renamed from: O0 */
    public long m9725O0() {
        IjkWriter ijkWriter;
        return (!((jix) this).Y0 || (ijkWriter = this.f3150l1) == null) ? this.f3168u1 : ijkWriter.getPropertyLong(20010, 0L);
    }

    /* JADX INFO: renamed from: O1 */
    public void m9726O1() {
        ii70.d().c("Pipeline_Flow_pip->MOMO", "startMuxing !##########################");
        ((jix) this).X0 = true;
    }

    /* JADX INFO: renamed from: P0 */
    public void m9727P0(yw00 yw00Var, int i, int i2, int i3, int i4) {
        this.f3100B1 = i4;
        this.f3102C1 = i2;
        this.f3104D1 = i3;
    }

    @RequiresApi(api = 19)
    /* JADX INFO: renamed from: P2 */
    public void m9728P2(int i) {
        vlw vlwVar;
        IjkWriter ijkWriter = this.f3150l1;
        if (ijkWriter != null && (vlwVar = ((MediaBaseCodecFilter) this).s) != null) {
            ijkWriter.setVideoEncodingBitRate(((ulw) vlwVar).H);
        }
        super.P2(i);
        dxl dxlVar = ((MediaBaseCodecFilter) this).F;
        if (dxlVar != null) {
            dxlVar.t0(i);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public int m9729Q0() {
        return 0;
    }

    @RequiresApi(api = 18)
    /* JADX INFO: renamed from: R0 */
    public void m9730R0(vlw vlwVar, EGLContext eGLContext) {
        boolean zPrepare;
        ii70.d().c("Pipeline_Flow_pip->MOMO", "Momo startRecord !##########################");
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"momoPusher", "startRecord"});
        if (((jix) this).X0) {
            return;
        }
        if (this.f3132T1 == null) {
            this.f3132T1 = new kp1();
        }
        if (this.f3150l1 != null || vlwVar == null) {
            zPrepare = true;
        } else {
            IjkWriter ijkWriter = new IjkWriter(this, false);
            this.f3150l1 = ijkWriter;
            this.f3143e2 = 0L;
            this.f3144f2 = 0L;
            this.f3145g2 = 0L;
            ijkWriter.setAudioSource(1);
            this.f3150l1.setAudioEncoder(3);
            this.f3150l1.setBitRateAdaptEnable(0);
            this.f3150l1.setAudioSamplingRate(((ulw) vlwVar).P);
            this.f3150l1.setAudioEncodingBitRate(((ulw) vlwVar).S);
            if (!((jix) this).Z) {
                this.f3150l1.setVideoSource(1);
                boolean z = vlwVar.H0;
                IjkWriter ijkWriter2 = this.f3150l1;
                if (z) {
                    ijkWriter2.setVideoEncoder(5);
                } else {
                    ijkWriter2.setVideoEncoder(2);
                }
                this.f3150l1.setVideoSize(((ulw) vlwVar).m, ((ulw) vlwVar).n);
                this.f3150l1.setVideoEncodingBitRate(((ulw) vlwVar).H);
                this.f3150l1.setVideoFrameRate(20);
            }
            if (vlwVar.A0 == MomoPipeline.DecodeType.SOFT_DECODE) {
                ((jix) this).Y0 = false;
            }
            this.f3150l1.setPropertyLong(30000, 0L);
            String str = this.f3164s1;
            IjkWriter ijkWriter3 = this.f3150l1;
            if (str != null) {
                ijkWriter3.setStreamerInOutAndType(this.f3160q1, this.f3162r1, str);
                ((MediaBaseCodecFilter) this).H.x = this.f3164s1;
            } else {
                ijkWriter3.setStreamerInOutAndType(10, (String) null, vlwVar.v0);
                ((MediaBaseCodecFilter) this).H.x = vlwVar.v0;
            }
            m9668l4(((MediaBaseCodecFilter) this).H.x);
            this.f3140b2 = vlwVar.w0;
            ii70.d().c("Pipeline_Flow_pip->MOMO", "startRecord    " + vlwVar.v0);
            zPrepare = this.f3150l1.prepare();
            ((MediaBaseCodecFilter) this).H.x = this.f3150l1.getOutputUrl();
            ((MediaBaseCodecFilter) this).H.g = vlwVar.H0 ? 2L : 0L;
            ii70.d().c("Pipeline_Flow_pip->MOMO", "startRecord end!!!!!    " + vlwVar.v0);
            this.f3141c2 = ((ulw) vlwVar).m;
            this.f3142d2 = ((ulw) vlwVar).n;
            ii70.d().c("Pipeline_Flow_pip->MOMO", "videoWidth:" + ((ulw) vlwVar).s + ",videoHeight:" + ((ulw) vlwVar).t + ",visualWidth:" + ((ulw) vlwVar).u + ",visualHeight:" + ((ulw) vlwVar).v + ",encodeWidth:" + ((ulw) vlwVar).m + ",encodeHeight:" + ((ulw) vlwVar).n + ",videoBitrate:" + ((ulw) vlwVar).H + ",audioBitrate:" + ((ulw) vlwVar).S + ",videoFPS:" + ((ulw) vlwVar).F + ",codecFPS:" + vlwVar.E0 + ",isHard:" + vlwVar.A0);
        }
        ((MediaBaseCodecFilter) this).H.a = System.currentTimeMillis();
        ((MediaBaseCodecFilter) this).H.B0 = "nonConf";
        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
        zmxVar.b1 = ((ulw) vlwVar).b0 ? 1L : 0L;
        zmxVar.F0 = ((ulw) vlwVar).H;
        zmxVar.C0 = ((ulw) vlwVar).S;
        if (zPrepare) {
            ii70.d().c("Pipeline_Flow_pip->MOMO", "startRecord eglContext start!!!!!    " + vlwVar.v0);
            super.R0(vlwVar, eGLContext);
            st0.g().p(W1(), st0.e);
            IjkWriter ijkWriter4 = this.f3150l1;
            if (ijkWriter4 != null) {
                ((MediaBaseCodecFilter) this).H.Z = ijkWriter4.getServerIpAddr();
                ii70.d().c("Pipeline_Flow_pip->MOMO", "startRecord eglContext end!!!!!    " + vlwVar.v0 + " ip " + ((MediaBaseCodecFilter) this).H.Z);
            }
        }
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"startRecord, pushDrop " + fjx.R().R0() + ",flv :" + fjx.R().K0() + ",high:" + fjx.R().c0() + ",base:" + fjx.R().b0()});
        n8c.a("zhangjj", "startRecord mPolicyDropFrameEnable [" + vlwVar.I0 + "," + vlwVar.J0 + "," + vlwVar.K0 + "] vds " + vlwVar.M0 + "/" + vlwVar.N0);
        if (fjx.R().R0()) {
            vlwVar.I0 = false;
            this.f3150l1.setDropCache(1, fjx.R().c0(), fjx.R().b0());
        }
        if (this.f3150l1 != null) {
            this.f3150l1.setPropertyLong(30002, fjx.R().e());
            this.f3150l1.setPropertyLong(30003, fjx.R().K0() ? 1L : 0L);
        }
        this.f3135W1 = new int[fjx.R().j() / fjx.R().z()];
        this.f3137Y1 = new LimitedQueue<>(fjx.R().j() / fjx.R().z());
        fjx.R().C1(fjx.R().P0() ? 1 : 0);
        hmx hmxVar = ((MediaBaseCodecFilter) this).I;
        Boolean boolValueOf = Boolean.valueOf(vlwVar.I0);
        Long lValueOf = Long.valueOf(vlwVar.J0);
        Long lValueOf2 = Long.valueOf(vlwVar.K0);
        Boolean boolValueOf2 = Boolean.valueOf(fjx.R().R0());
        Integer numValueOf = Integer.valueOf(fjx.R().c0());
        Integer numValueOf2 = Integer.valueOf(fjx.R().b0());
        Boolean boolValueOf3 = Boolean.valueOf(fjx.R().P0());
        String str2 = this.f3164s1;
        if (str2 == null) {
            str2 = vlwVar.v0;
        }
        hmxVar.l(new Object[]{"mrCoreParameters", boolValueOf, lValueOf, lValueOf2, boolValueOf2, numValueOf, numValueOf2, boolValueOf3, str2});
        m9622F4();
    }

    /* JADX INFO: renamed from: T0 */
    public int m9731T0() {
        return (int) ((MediaBaseCodecFilter) this).H.Q;
    }

    /* JADX INFO: renamed from: V0 */
    public long m9732V0() {
        IjkWriter ijkWriter = this.f3150l1;
        if (ijkWriter != null) {
            return ijkWriter.getPropertyLong(20002, 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: W0 */
    public int m9734W0() {
        return 0;
    }

    /* JADX INFO: renamed from: X0 */
    public long m9735X0() {
        IjkWriter ijkWriter = this.f3150l1;
        if (ijkWriter != null) {
            return ijkWriter.getPropertyLong(20005, 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: X3 */
    public long m9736X3() {
        IjkWriter ijkWriter = this.f3150l1;
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

    /* JADX INFO: renamed from: Y */
    public void m9737Y(yw00 yw00Var, vlw vlwVar) {
        super.Y(yw00Var, vlwVar);
        if (vlwVar == null) {
            return;
        }
        int i = ((ulw) vlwVar).m;
        int i2 = ((ulw) vlwVar).n;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"resetCodec", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(((ulw) vlwVar).H), Integer.valueOf(((ulw) vlwVar).F)});
        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
        long j = ((ulw) vlwVar).H;
        zmxVar.F0 = j;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"resetCodec videoBitrateSetByuser", Long.valueOf(j)});
        if (vlwVar.F0) {
            i = ((ulw) vlwVar).n;
            i2 = ((ulw) vlwVar).m;
        }
        vlw vlwVar2 = ((MediaBaseCodecFilter) this).s;
        this.f3141c2 = ((ulw) vlwVar2).m;
        this.f3142d2 = ((ulw) vlwVar2).n;
        this.f3179z2.m9797d();
        IjkWriter ijkWriter = this.f3150l1;
        if (ijkWriter != null) {
            ijkWriter.setVideoSize(i, i2);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public int m9738Y0() {
        IjkWriter ijkWriter = this.f3150l1;
        if (ijkWriter != null) {
            return ijkWriter.getVideoBitRate();
        }
        return 0;
    }

    /* JADX INFO: renamed from: Y3 */
    public long m9739Y3() {
        IjkWriter ijkWriter = this.f3150l1;
        if (ijkWriter != null) {
            return ijkWriter.getAudioWritedDPackets();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: Z3 */
    public long m9740Z3() {
        IjkWriter ijkWriter = this.f3150l1;
        if (ijkWriter != null) {
            return ijkWriter.getAverageSendBitRateB();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: a0 */
    public long m9741a0() {
        return this.f3178z1;
    }

    /* JADX INFO: renamed from: b0 */
    public void m9742b0() {
        m9751f();
    }

    /* JADX INFO: renamed from: b1 */
    public long m9743b1() {
        IjkWriter ijkWriter;
        return (!((jix) this).Y0 || (ijkWriter = this.f3150l1) == null) ? this.f3170v1 + ((long) m9744b4()) : ijkWriter.getPropertyLong(20013, 0L);
    }

    /* JADX INFO: renamed from: b4 */
    public int m9744b4() {
        return this.f3147i2;
    }

    /* JADX INFO: renamed from: c0 */
    public long m9745c0() {
        IjkWriter ijkWriter = this.f3150l1;
        if (ijkWriter != null) {
            return ijkWriter.getAudioCacheSize();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: c2 */
    public void m9746c2() {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"logPushStart"});
        this.f3101B2 = false;
        ((MediaBaseCodecFilter) this).H.Z = getServerIpAddr();
        IjkWriter ijkWriter = this.f3150l1;
        if (ijkWriter != null) {
            ((MediaBaseCodecFilter) this).H.u0 = ijkWriter.getPropertyLong(20002, 0L);
        }
        ((MediaBaseCodecFilter) this).H.v0 = m9777r0();
        ((MediaBaseCodecFilter) this).H.w0 = m9765l1();
        ((MediaBaseCodecFilter) this).H.x0 = m9780u0();
        ((MediaBaseCodecFilter) this).H.v = getVideoWidth();
        ((MediaBaseCodecFilter) this).H.w = m9762k0();
        ((MediaBaseCodecFilter) this).H.z = m9774p1();
        ((MediaBaseCodecFilter) this).H.A = m9694A0();
        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
        zmxVar.s0 = 0;
        mvj0 mvj0Var = this.f3140b2;
        if (mvj0Var != null) {
            zmxVar.t0 = mvj0Var.a();
        }
        super/*com.momo.pipline.codec.MediaBaseCodecFilter*/.c2();
    }

    /* JADX INFO: renamed from: d1 */
    public void m9747d1() {
        if (((MediaBaseCodecFilter) this).H.g1 >= 3) {
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"mediaLogsValOfPush.sendSize0cnt " + ((MediaBaseCodecFilter) this).H.g1 + ", not send push watch"});
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jM9770o0 = m9770o0();
        ((MediaBaseCodecFilter) this).H.D = m9785x1();
        ((MediaBaseCodecFilter) this).H.Q0 = m9781u1();
        ((MediaBaseCodecFilter) this).H.F = m9725O0();
        ((MediaBaseCodecFilter) this).H.G = m9775q1();
        ((MediaBaseCodecFilter) this).H.H = m9743b1();
        ((MediaBaseCodecFilter) this).H.N0 = m9745c0();
        ((MediaBaseCodecFilter) this).H.O0 = m9709G0();
        ((MediaBaseCodecFilter) this).H.P0 = m9767n0();
        ((MediaBaseCodecFilter) this).H.R0 = m9754g0();
        ((MediaBaseCodecFilter) this).H.b0 = m9739Y3();
        ((MediaBaseCodecFilter) this).H.B = m9708F1();
        ((MediaBaseCodecFilter) this).H.U0 = m9768n1();
        ((MediaBaseCodecFilter) this).H.V0 = m9707F0();
        ((MediaBaseCodecFilter) this).H.W0 = m9716L0();
        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
        zmxVar.X0 = (jM9770o0 - this.f3105D2) - (jCurrentTimeMillis - this.f3103C2);
        this.f3105D2 = jM9770o0;
        this.f3103C2 = jCurrentTimeMillis;
        zmxVar.Y0 = m9713J0();
        ((MediaBaseCodecFilter) this).H.N = m9783w1();
        ((MediaBaseCodecFilter) this).H.O = m9758h1();
        ((MediaBaseCodecFilter) this).H.P = m9738Y0();
        ((MediaBaseCodecFilter) this).H.Q = m9766m0();
        ((MediaBaseCodecFilter) this).H.v = getVideoWidth();
        ((MediaBaseCodecFilter) this).H.w = m9762k0();
        zmx zmxVar2 = ((MediaBaseCodecFilter) this).H;
        zmxVar2.r = "[(0)]";
        zmxVar2.S = ((ulw) Z1()).w;
        ((MediaBaseCodecFilter) this).H.T = ((ulw) Z1()).x;
        ((MediaBaseCodecFilter) this).H.J0 = m9761j4();
        ((MediaBaseCodecFilter) this).H.I0 = m9736X3();
        ((MediaBaseCodecFilter) this).H.d0 = m9759i4();
        ((MediaBaseCodecFilter) this).H.i1 = m9655c4();
        ((MediaBaseCodecFilter) this).H.j1 = fjx.R().f0() ? 1 : 0;
        ((MediaBaseCodecFilter) this).H.l1 = xxx.F().a().getWidth();
        ((MediaBaseCodecFilter) this).H.m1 = xxx.F().a().getHeight();
        ((MediaBaseCodecFilter) this).H.n1 = xxx.F().w();
        ((MediaBaseCodecFilter) this).I.G();
        if (((MediaBaseCodecFilter) this).H.g1 != 3 || ((MediaBaseCodecFilter) this).J == MomoCodec.MomoCodecState.WAIT) {
            return;
        }
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"MediaError", "14 sendsize 0 line 1778"});
        m9686v4(14);
    }

    /* JADX INFO: renamed from: d2 */
    public void m9748d2() {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"momopusher logPushStop"});
        if (this.f3101B2) {
            return;
        }
        this.f3101B2 = true;
        if (this.f3126O1) {
            this.f3126O1 = false;
            ((MediaBaseCodecFilter) this).I.x(0L);
        }
        IjkWriter ijkWriter = this.f3150l1;
        if (ijkWriter != null) {
            ((MediaBaseCodecFilter) this).H.B = ijkWriter.getTxbytes();
        }
        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
        long j = zmxVar.z0;
        if (j != 0) {
            zmxVar.y0 = j;
        }
        zmxVar.Z = getServerIpAddr();
        zmx zmxVar2 = ((MediaBaseCodecFilter) this).H;
        if (zmxVar2.b) {
            zmxVar2.h = System.currentTimeMillis() - ((MediaBaseCodecFilter) this).H.a;
        }
        mvj0 mvj0Var = this.f3140b2;
        if (mvj0Var != null) {
            ((MediaBaseCodecFilter) this).H.t0 = mvj0Var.a();
        }
        super/*com.momo.pipline.codec.MediaBaseCodecFilter*/.d2();
    }

    /* JADX INFO: renamed from: e1 */
    public void m9749e1(@NonNull u3m u3mVar) {
        if (!(u3mVar instanceof ExtAudioWrapper)) {
            throw new InvalidParameterException("ISurroundMusic must implement by ExtAudioWrapper");
        }
        super/*com.momo.pipline.codec.MediaBaseCodecFilter*/.e1(u3mVar);
        u3m u3mVar2 = ((MediaBaseCodecFilter) this).K;
        if (u3mVar2 != null) {
            ((ExtAudioWrapper) u3mVar2).m354J2(new C0593e());
        }
    }

    /* JADX INFO: renamed from: e4 */
    public int m9750e4() {
        return (int) this.f3143e2;
    }

    /* JADX INFO: renamed from: f */
    public void m9751f() {
        ii70.d().a("Pipeline_Flow_pip->MOMO", getClass().getSimpleName().concat(" stopRecord"));
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"momopusher stopRecord"});
        super.f();
        this.f3158p1 = false;
        IjkWriter ijkWriter = this.f3150l1;
        if (ijkWriter != null) {
            this.f3143e2 = ijkWriter.getPropertyLong(20017, 0L);
            this.f3144f2 = this.f3150l1.getPropertyLong(20018, 0L);
            this.f3145g2 = this.f3150l1.getPropertyLong(20019, 0L);
            ((MediaBaseCodecFilter) this).H.B = this.f3150l1.getTxbytes();
            this.f3150l1.stopRecording();
            eyx.c().g(new Object[]{"enable_sync_streamreplace stopPsuh syncStreamRelace:" + this.f3114I1});
            m9697B4(this.f3114I1);
            this.f3150l1.release();
            this.f3150l1 = null;
        }
        m9763k1();
        m9626H4();
        m9748d2();
        super/*com.momo.pipline.codec.MediaBaseCodecFilter*/.p2();
        Handler handler = this.f3139a2;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        st0.g().q(st0.e);
        this.f3116J1.g(12289, 0, 0, this);
    }

    /* JADX INFO: renamed from: f4 */
    public int m9753f4() {
        return (int) this.f3145g2;
    }

    /* JADX INFO: renamed from: g0 */
    public long m9754g0() {
        IjkWriter ijkWriter = this.f3150l1;
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

    /* JADX INFO: renamed from: g1 */
    public String m9755g1(int i, int i2, Object obj) {
        return m9662h4(i, i2);
    }

    /* JADX INFO: renamed from: g4 */
    public int m9756g4() {
        return (int) this.f3144f2;
    }

    public PointF getPreviewScale() {
        return null;
    }

    public float getPreviewZoom() {
        return 0.0f;
    }

    public int getRoomType() {
        return -1;
    }

    public String getServerIpAddr() {
        IjkWriter ijkWriter = this.f3150l1;
        if (ijkWriter != null && ijkWriter.getServerIpAddr() != null) {
            return this.f3150l1.getServerIpAddr();
        }
        String str = ((MediaBaseCodecFilter) this).H.Z;
        if (str != null && !str.equals("0.0.0.0")) {
            return ((MediaBaseCodecFilter) this).H.Z;
        }
        String strM9683t4 = m9683t4(m9703D1());
        return (strM9683t4 == null || !m9670m4(strM9683t4)) ? "0.0.0.0" : strM9683t4;
    }

    public int getStreamerCaptureType(int i) {
        return 0;
    }

    public int getStreamerType() {
        return 0;
    }

    public VideoQuality getVideoQuality() {
        return null;
    }

    public int getVideoWidth() {
        int i = this.f3141c2;
        if (i != 0) {
            return i;
        }
        vlw vlwVar = ((MediaBaseCodecFilter) this).s;
        if (vlwVar != null) {
            return ((ulw) vlwVar).m;
        }
        return 0;
    }

    public Object getWriter() {
        return this.f3150l1;
    }

    /* JADX INFO: renamed from: h0 */
    public int m9757h0() {
        return 0;
    }

    /* JADX INFO: renamed from: h1 */
    public int m9758h1() {
        IjkWriter ijkWriter = this.f3150l1;
        if (ijkWriter != null) {
            return ijkWriter.getAudioBitRate();
        }
        return 0;
    }

    /* JADX INFO: renamed from: i4 */
    public long m9759i4() {
        IjkWriter ijkWriter = this.f3150l1;
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

    public boolean isStarting() {
        return ((jix) this).X0;
    }

    /* JADX INFO: renamed from: j1 */
    public long m9760j1(int i, int i2, Object obj) {
        return 0L;
    }

    /* JADX INFO: renamed from: j4 */
    public long m9761j4() {
        IjkWriter ijkWriter = this.f3150l1;
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

    /* JADX INFO: renamed from: k0 */
    public int m9762k0() {
        int i = this.f3142d2;
        if (i != 0) {
            return i;
        }
        vlw vlwVar = ((MediaBaseCodecFilter) this).s;
        if (vlwVar != null) {
            return ((ulw) vlwVar).n;
        }
        return 0;
    }

    /* JADX INFO: renamed from: k1 */
    public void m9763k1() {
        ii70.d().c("Pipeline_Flow_pip->MOMO", "stopMuxing !##########################");
        ((jix) this).X0 = false;
    }

    /* JADX INFO: renamed from: l1 */
    public long m9765l1() {
        long propertyLong;
        long propertyLong2;
        IjkWriter ijkWriter = this.f3150l1;
        if (ijkWriter == null) {
            return 0L;
        }
        if (((jix) this).Y0) {
            propertyLong = this.f3174x1;
            propertyLong2 = ((MediaBaseCodecFilter) this).H.a;
        } else {
            propertyLong = ijkWriter.getPropertyLong(20015, 0L);
            propertyLong2 = this.f3150l1.getPropertyLong(20000, 0L);
            if (propertyLong == 0 || propertyLong2 == 0) {
                propertyLong = this.f3174x1;
                propertyLong2 = ((MediaBaseCodecFilter) this).H.a;
            }
        }
        long j = propertyLong - propertyLong2;
        if (j < 0) {
            return 0L;
        }
        return j;
    }

    /* JADX INFO: renamed from: m0 */
    public int m9766m0() {
        return this.f3100B1;
    }

    /* JADX INFO: renamed from: n0 */
    public long m9767n0() {
        IjkWriter ijkWriter = this.f3150l1;
        if (ijkWriter != null) {
            return ijkWriter.getVideoPacketCache();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: n1 */
    public int m9768n1() {
        return this.f3104D1;
    }

    public void notify(int i, int i2, int i3, Object obj) {
        IjkWriter ijkWriter;
        if (i == 0) {
            this.f3116J1.g(12290, i2, i3, this);
        } else if (i == 300) {
            n8c.a("zhangjj", "get msg Error " + ((MediaBaseCodecFilter) this).J + "/" + i2 + "/" + i3);
            hmx hmxVar = ((MediaBaseCodecFilter) this).I;
            Integer numValueOf = Integer.valueOf(i2);
            Integer numValueOf2 = Integer.valueOf(i3);
            StringBuilder sb = new StringBuilder("state:");
            sb.append(((MediaBaseCodecFilter) this).J);
            hmxVar.l(new Object[]{"MEDIA_ERROR", numValueOf, numValueOf2, sb.toString()});
            MomoCodec.MomoCodecState momoCodecState = ((MediaBaseCodecFilter) this).J;
            MomoCodec.MomoCodecState momoCodecState2 = MomoCodec.MomoCodecState.WAIT;
            if (momoCodecState != momoCodecState2) {
                ((MediaBaseCodecFilter) this).J = momoCodecState2;
                if (i2 == -304) {
                    m9686v4(i3);
                    ii70.d().c("Pipeline_Flow_pip->MOMO", " MOMO_ERROR_NETWORK ");
                } else {
                    ii70.d().c("Pipeline_Flow_pip->MOMO", " MOMO_ERROR_SYSTEM ");
                    ((MediaBaseCodecFilter) this).I.l(new Object[]{"onPusherError", Integer.valueOf(i2), Integer.valueOf(i3), "state:" + ((MediaBaseCodecFilter) this).J});
                    ((MediaBaseCodecFilter) this).H.y0 = (long) i3;
                    this.f3116J1.g(12544, i2, i3, this);
                    e2(12544, i2);
                }
            }
        } else if (i == 200) {
            this.f3116J1.g(12291, i2, i3, this);
        } else if (i != 201) {
            switch (i) {
                case 100:
                    ((MediaBaseCodecFilter) this).I.l(new Object[]{"PREPARED"});
                    ii70.d().c("Pipeline_Flow_pip->MOMO", " MEDIA_RECORDER_PREPARED");
                    this.f3116J1.g(12288, i2, i3, this);
                    ((MediaBaseCodecFilter) this).J = MomoCodec.MomoCodecState.START;
                    ((MediaBaseCodecFilter) this).H.b = true;
                    break;
                case 101:
                    ((MediaBaseCodecFilter) this).I.l(new Object[]{"STOPED"});
                    m9748d2();
                    ((MediaBaseCodecFilter) this).J = MomoCodec.MomoCodecState.STOP;
                    ii70.d().c("Pipeline_Flow_pip->MOMO", " MEDIA_RECORDER_STOPED");
                    this.f3116J1.g(12289, i2, i3, this);
                    break;
                case 102:
                    ((MediaBaseCodecFilter) this).I.l(new Object[]{"PUBLISHING"});
                    ii70.d().c("Pipeline_Flow_pip->MOMO", " MEDIA_RECORDER_PUBLISHING");
                    this.f3116J1.g(12292, i2, i3, this);
                    m9746c2();
                    b2();
                    zmx zmxVar = ((MediaBaseCodecFilter) this).H;
                    if (zmxVar.c == 0) {
                        zmxVar.c = System.currentTimeMillis();
                    }
                    ii70.d().c("Pipeline_Flow_pip->MOMO", "IJK 推流器 报告： MOMO_PUBLISHING, 此时进入双推模式");
                    break;
                case 103:
                    this.f3126O1 = true;
                    ((MediaBaseCodecFilter) this).I.w(i2);
                    this.f3116J1.g(12295, i2, i3, this);
                    break;
                case 104:
                    this.f3116J1.g(12297, i2, i3, this);
                    break;
                case 105:
                    this.f3126O1 = false;
                    ((MediaBaseCodecFilter) this).I.x(i2);
                    this.f3116J1.g(12296, i2, i3, this);
                    break;
                case 106:
                    this.f3116J1.g(12293, i2, i3, this);
                    break;
                case 107:
                    this.f3116J1.g(12294, i2, i3, this);
                    break;
                case 108:
                    ((MediaBaseCodecFilter) this).I.l(new Object[]{"PUBLISHED"});
                    this.f3116J1.g(12305, i2, i3, this);
                    ii70.d().c("Pipeline_Flow_pip->MOMO", "IJK 推流器 报告： MOMO_PUBLISHED, 此时 IJK 已经推流 5 秒钟 推流成功，此时应该结束连麦推流");
                    break;
                case 109:
                    short s = (short) ((i2 >> 16) & 65535);
                    short s2 = (short) (i2 & 65535);
                    ((MediaBaseCodecFilter) this).I.v(s * 23, s2 * 23, s - s2, ((short) ((i3 >> 16) & 65535)) - ((short) (i3 & 65535)));
                    break;
            }
        } else {
            this.f3116J1.g(12298, i2, i3, this);
        }
        if (i != 100 || (ijkWriter = this.f3150l1) == null) {
            return;
        }
        ijkWriter.notifyPrepared();
        if (((jix) this).U0 != null) {
            ii70.d().c("Pipeline_Flow_pip->MOMO", "start Record writeAudioExtradata: mAudioHeader len " + ((jix) this).U0.limit() + ";isReadyToWrite:");
            IjkWriter ijkWriter2 = this.f3150l1;
            ByteBuffer byteBuffer = ((jix) this).U0;
            ijkWriter2.writeAudioExtradata(byteBuffer, (long) byteBuffer.limit());
        } else if (((jix) this).V0 != null) {
            ii70.d().c("Pipeline_Flow_pip->MOMO", "start Record writeAudioExtradata: mSoftAudioHeader len " + ((jix) this).V0.limit() + ";isReadyToWrite:");
            IjkWriter ijkWriter3 = this.f3150l1;
            ByteBuffer byteBuffer2 = ((jix) this).V0;
            ijkWriter3.writeAudioExtradata(byteBuffer2, (long) byteBuffer2.limit());
        }
        if (this.f3156o1 != null) {
            ii70.d().c("Pipeline_Flow_pip->MOMO", "start Record writeVideoExtradata: mVideoExtraData len " + this.f3156o1.limit() + ";isReadyToWrite:" + this.f3158p1);
            IjkWriter ijkWriter4 = this.f3150l1;
            ByteBuffer byteBuffer3 = this.f3156o1;
            ijkWriter4.writeVideoExtradata(byteBuffer3, (long) byteBuffer3.limit());
        } else if (((jix) this).W0 != null) {
            ii70.d().c("Pipeline_Flow_pip->MOMO", "start Record writeVideoExtradata: mSoftVideoHeader len " + ((jix) this).W0.limit() + ";isReadyToWrite:");
            IjkWriter ijkWriter5 = this.f3150l1;
            ByteBuffer byteBuffer4 = ((jix) this).W0;
            ijkWriter5.writeVideoExtradata(byteBuffer4, (long) byteBuffer4.limit());
        }
        this.f3158p1 = true;
    }

    public void notifyRecording() {
        ii70.d().c("Pipeline_Flow_pip->MOMO", "notifyRecording !##########################");
    }

    /* JADX INFO: renamed from: o0 */
    public long m9770o0() {
        IjkWriter ijkWriter = this.f3150l1;
        if (ijkWriter != null) {
            return ijkWriter.getVideoPts();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: o1 */
    public boolean m9771o1(ByteBuffer byteBuffer) {
        return false;
    }

    public void onDrawFrame() {
        super/*l.ccj*/.onDrawFrame();
        this.f3178z1++;
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m9773p0(ByteBuffer byteBuffer) {
        return m9718L4(byteBuffer, 2);
    }

    /* JADX INFO: renamed from: p1 */
    public int m9774p1() {
        return getVideoWidth();
    }

    /* JADX INFO: renamed from: q1 */
    public long m9775q1() {
        IjkWriter ijkWriter;
        return (!((jix) this).Y0 || (ijkWriter = this.f3150l1) == null) ? this.f3166t1 : ijkWriter.getPropertyLong(20012, 0L);
    }

    /* JADX INFO: renamed from: q4 */
    public void m9776q4(boolean z) {
        ((MediaBaseCodecFilter) this).H.V = z ? 1L : 0L;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"muteLocalAudioStream", Boolean.valueOf(z)});
    }

    /* JADX INFO: renamed from: r0 */
    public long m9777r0() {
        long propertyLong;
        long propertyLong2;
        IjkWriter ijkWriter = this.f3150l1;
        if (ijkWriter == null) {
            return 0L;
        }
        if (((jix) this).Y0) {
            propertyLong = this.f3176y1;
            propertyLong2 = ((MediaBaseCodecFilter) this).H.a;
        } else {
            propertyLong = ijkWriter.getPropertyLong(20016, 0L);
            propertyLong2 = this.f3150l1.getPropertyLong(20000, 0L);
            if (propertyLong == 0 || propertyLong2 == 0) {
                propertyLong = this.f3176y1;
                propertyLong2 = ((MediaBaseCodecFilter) this).H.a;
            }
        }
        long j = propertyLong - propertyLong2;
        if (j < 0) {
            return 0L;
        }
        return j;
    }

    /* JADX INFO: renamed from: s0 */
    public int m9778s0() {
        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
        if (zmxVar != null) {
            return (int) zmxVar.Y;
        }
        return 0;
    }

    /* JADX INFO: renamed from: t1 */
    public boolean m9779t1(ByteBuffer byteBuffer, long j) {
        ii70.d().c("Pipeline_Flow_pip->MOMO", "  writeAudioExtradata: len " + j + ";isReadyToWrite:" + this.f3158p1);
        if (!this.f3158p1) {
            ((jix) this).V0 = byteBuffer;
            return false;
        }
        IjkWriter ijkWriter = this.f3150l1;
        if (ijkWriter == null) {
            return true;
        }
        ijkWriter.writeAudioExtradata(byteBuffer, j);
        return true;
    }

    /* JADX INFO: renamed from: u0 */
    public long m9780u0() {
        IjkWriter ijkWriter = this.f3150l1;
        if (ijkWriter != null) {
            return ijkWriter.getPropertyLong(20003, 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: u1 */
    public long m9781u1() {
        IjkWriter ijkWriter = this.f3150l1;
        if (ijkWriter != null) {
            return ijkWriter.getPropertyLong(20007, 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: u4 */
    public void m9782u4() {
        this.f3124N1 = System.nanoTime() / 1000;
    }

    /* JADX INFO: renamed from: w1 */
    public String m9783w1() {
        return "M";
    }

    @RequiresApi(api = 16)
    /* JADX INFO: renamed from: x0 */
    public int m9784x0(MediaFormat mediaFormat, int i) {
        IjkWriter ijkWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        IjkWriter ijkWriter2;
        int iK2 = K2(mediaFormat, i);
        ii70.d().c("Pipeline_Flow_pip->MOMO", "addMediaTrack" + i);
        if (iK2 == 1) {
            ByteBuffer byteBuffer3 = ((jix) this).U0;
            if (byteBuffer3 != null) {
                byteBuffer3.rewind();
                ii70.d().c("Pipeline_Flow_pip->MOMO", "  writeAudioExtradata: len " + ((jix) this).U0.limit() + ";isReadyToWrite:" + this.f3158p1);
                if (this.f3158p1 && (ijkWriter2 = this.f3150l1) != null) {
                    ByteBuffer byteBuffer4 = ((jix) this).U0;
                    ijkWriter2.writeAudioExtradata(byteBuffer4, byteBuffer4.limit());
                }
                ((jix) this).U0.rewind();
                return iK2;
            }
        } else if (iK2 == 2) {
            ByteBuffer byteBuffer5 = ((jix) this).R0;
            int iLimit = byteBuffer5 != null ? byteBuffer5.limit() : 0;
            ByteBuffer byteBuffer6 = ((jix) this).Q0;
            int iLimit2 = byteBuffer6 != null ? byteBuffer6.limit() : 0;
            ByteBuffer byteBuffer7 = ((jix) this).P0;
            int iLimit3 = (byteBuffer7 != null ? byteBuffer7.limit() : 0) + iLimit2 + iLimit;
            if (iLimit3 != 0) {
                ByteBuffer byteBuffer8 = this.f3156o1;
                if (byteBuffer8 != null) {
                    byteBuffer8.clear();
                    this.f3156o1 = null;
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iLimit3);
                this.f3156o1 = byteBufferAllocate;
                if (byteBufferAllocate != null) {
                    byteBufferAllocate.rewind();
                    this.f3156o1.position(0);
                    ByteBuffer byteBuffer9 = ((jix) this).R0;
                    if (byteBuffer9 != null) {
                        byteBuffer9.rewind();
                        this.f3156o1.put(((jix) this).R0.array());
                        ((jix) this).R0.rewind();
                    } else if (((jix) this).Q0 != null && (byteBuffer2 = ((jix) this).P0) != null) {
                        byteBuffer2.rewind();
                        ((jix) this).Q0.rewind();
                        this.f3156o1.put(((jix) this).Q0.array());
                        this.f3156o1.put(((jix) this).P0.array());
                        ((jix) this).P0.rewind();
                        ((jix) this).Q0.rewind();
                    }
                    this.f3156o1.rewind();
                    ii70.d().c("Pipeline_Flow_pip->MOMO", "  writeVideoExtradata: len " + this.f3156o1.limit() + ";isReadyToWrite:" + this.f3158p1);
                }
                if (this.f3158p1 && (ijkWriter = this.f3150l1) != null && (byteBuffer = this.f3156o1) != null) {
                    ijkWriter.writeVideoExtradata(byteBuffer, byteBuffer.limit());
                }
            }
        }
        return iK2;
    }

    /* JADX INFO: renamed from: x1 */
    public long m9785x1() {
        return this.f3098A1 * 1024;
    }

    /* JADX INFO: renamed from: x4 */
    public void m9786x4() {
        if (this.f3124N1 != 0) {
            this.f3122M1 += (System.nanoTime() / 1000) - this.f3124N1;
            this.f3124N1 = 0L;
        }
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m9788z0(ByteBuffer byteBuffer, long j) {
        ii70.d().c("Pipeline_Flow_pip->MOMO", "  writeVideoExtradata: len " + j + ";isReadyToWrite:" + this.f3158p1);
        if (!this.f3158p1) {
            ((jix) this).W0 = byteBuffer;
            return false;
        }
        IjkWriter ijkWriter = this.f3150l1;
        if (ijkWriter == null) {
            return true;
        }
        ijkWriter.writeVideoExtradata(byteBuffer, j);
        return true;
    }

    /* JADX INFO: renamed from: z4 */
    public void m9789z4(int i) {
        ((MediaBaseCodecFilter) this).H.i = i;
    }

    /* JADX INFO: renamed from: l.kw00$e */
    public class C0593e implements ExtAudioWrapper.InterfaceC0020i {
        private C0593e() {
        }

        @Override // com.momo.piplinemomoext.input.audio.ExtAudioWrapper.InterfaceC0020i
        public int getStreamerType() {
            return 0;
        }

        @Override // com.momo.piplinemomoext.input.audio.ExtAudioWrapper.InterfaceC0020i
        /* JADX INFO: renamed from: b */
        public void mo325b() {
        }

        @Override // com.momo.piplinemomoext.input.audio.ExtAudioWrapper.InterfaceC0020i
        /* JADX INFO: renamed from: a */
        public void mo324a(String str) {
        }
    }

    /* JADX INFO: renamed from: A */
    public void m9693A() {
    }

    /* JADX INFO: renamed from: C0 */
    public void m9699C0() {
    }

    /* JADX INFO: renamed from: E2 */
    public yt10 m9706E2() {
        return this;
    }

    public MediaBaseCodecFilter getFilter() {
        return this;
    }

    public void notifyEffectReset() {
    }

    public void notifyExtralAudioLoss() {
    }

    public void notifyExtralAudioReady() {
    }

    public void notifyResumeRecording() {
    }

    public void notifyUpdateResolution() {
    }

    /* JADX INFO: renamed from: o */
    public void m9769o() {
    }

    public void setSourceSucess() {
    }

    public void stopSurroundMusic() {
    }

    /* JADX INFO: renamed from: C1 */
    public void m9700C1(String str) {
    }

    /* JADX INFO: renamed from: H1 */
    public void m9712H1(int i) {
    }

    /* JADX INFO: renamed from: W */
    public void m9733W(ByteBuffer byteBuffer) {
    }

    public void notifyEnableExtralAudio(boolean z) {
    }

    /* JADX INFO: renamed from: f0 */
    public void m9752f0(ByteBuffer byteBuffer, long j) {
    }

    /* JADX INFO: renamed from: l0 */
    public void m9764l0(vlw vlwVar, EGLContext eGLContext) {
    }

    public void notifyAdjustAef(int i, boolean z) {
    }

    public void notifyAdjustEQ(int i, boolean z) {
    }

    public void notifyAdjustEf(int i, int i2) {
    }

    public void notifyAdjustTune(int i, boolean z) {
    }

    /* JADX INFO: renamed from: p */
    public void m9772p(String str, int i) {
    }

    public void setStreamerCaptureType(int i, int i2) {
    }

    /* JADX INFO: renamed from: y */
    public void m9787y(int i, int i2) {
    }

    public void notifyEffectSet(int i, int i2, float f) {
    }

    public void startSurroundMusic(String str, int i, long j) {
    }
}
