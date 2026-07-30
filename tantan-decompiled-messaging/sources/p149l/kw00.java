package p149l;

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
public class kw00 extends jix implements yt10, NotifyCenter, ya1, ewl, gw00.InterfaceC17174f {

    /* JADX INFO: renamed from: A1 */
    private int f124816A1;

    /* JADX INFO: renamed from: A2 */
    private boolean f124817A2;

    /* JADX INFO: renamed from: B1 */
    private int f124818B1;

    /* JADX INFO: renamed from: B2 */
    private volatile boolean f124819B2;

    /* JADX INFO: renamed from: C1 */
    private int f124820C1;

    /* JADX INFO: renamed from: C2 */
    private long f124821C2;

    /* JADX INFO: renamed from: D1 */
    private int f124822D1;

    /* JADX INFO: renamed from: D2 */
    private long f124823D2;

    /* JADX INFO: renamed from: E1 */
    private boolean f124824E1;

    /* JADX INFO: renamed from: E2 */
    private final Pattern f124825E2;

    /* JADX INFO: renamed from: F1 */
    private boolean f124826F1;

    /* JADX INFO: renamed from: F2 */
    private final Pattern f124827F2;

    /* JADX INFO: renamed from: G1 */
    private boolean f124828G1;

    /* JADX INFO: renamed from: G2 */
    private final Pattern f124829G2;

    /* JADX INFO: renamed from: H1 */
    private boolean f124830H1;

    /* JADX INFO: renamed from: H2 */
    private long f124831H2;

    /* JADX INFO: renamed from: I1 */
    private boolean f124832I1;

    /* JADX INFO: renamed from: I2 */
    private String f124833I2;

    /* JADX INFO: renamed from: J1 */
    private hu00.InterfaceC17392a f124834J1;

    /* JADX INFO: renamed from: J2 */
    private int f124835J2;

    /* JADX INFO: renamed from: K1 */
    public ya1 f124836K1;

    /* JADX INFO: renamed from: K2 */
    public HandlerThread f124837K2;

    /* JADX INFO: renamed from: L1 */
    private hgd0 f124838L1;

    /* JADX INFO: renamed from: L2 */
    public HandlerC18095c f124839L2;

    /* JADX INFO: renamed from: M1 */
    protected long f124840M1;

    /* JADX INFO: renamed from: M2 */
    public LimitedQueue<Integer> f124841M2;

    /* JADX INFO: renamed from: N1 */
    protected long f124842N1;

    /* JADX INFO: renamed from: N2 */
    private int f124843N2;

    /* JADX INFO: renamed from: O1 */
    private boolean f124844O1;

    /* JADX INFO: renamed from: O2 */
    private int f124845O2;

    /* JADX INFO: renamed from: P1 */
    private long f124846P1;

    /* JADX INFO: renamed from: Q1 */
    private long f124847Q1;

    /* JADX INFO: renamed from: R1 */
    private long f124848R1;

    /* JADX INFO: renamed from: S1 */
    private long f124849S1;

    /* JADX INFO: renamed from: T1 */
    private kp1 f124850T1;

    /* JADX INFO: renamed from: U1 */
    private long f124851U1;

    /* JADX INFO: renamed from: V1 */
    private long f124852V1;

    /* JADX INFO: renamed from: W1 */
    private int[] f124853W1;

    /* JADX INFO: renamed from: X1 */
    private int f124854X1;

    /* JADX INFO: renamed from: Y1 */
    private LimitedQueue<Integer> f124855Y1;

    /* JADX INFO: renamed from: Z1 */
    private hgb0 f124856Z1;

    /* JADX INFO: renamed from: a2 */
    private Handler f124857a2;

    /* JADX INFO: renamed from: b2 */
    private mvj0 f124858b2;

    /* JADX INFO: renamed from: c2 */
    private int f124859c2;

    /* JADX INFO: renamed from: d2 */
    private int f124860d2;

    /* JADX INFO: renamed from: e2 */
    private long f124861e2;

    /* JADX INFO: renamed from: f2 */
    private long f124862f2;

    /* JADX INFO: renamed from: g2 */
    private long f124863g2;

    /* JADX INFO: renamed from: h2 */
    private boolean f124864h2;

    /* JADX INFO: renamed from: i2 */
    private int f124865i2;

    /* JADX INFO: renamed from: j2 */
    private long f124866j2;

    /* JADX INFO: renamed from: k2 */
    private long f124867k2;

    /* JADX INFO: renamed from: l1 */
    IjkWriter f124868l1;

    /* JADX INFO: renamed from: l2 */
    private long f124869l2;

    /* JADX INFO: renamed from: m1 */
    private long f124870m1;

    /* JADX INFO: renamed from: m2 */
    private boolean f124871m2;

    /* JADX INFO: renamed from: n1 */
    private long f124872n1;

    /* JADX INFO: renamed from: n2 */
    private LinkedList<C18094b> f124873n2;

    /* JADX INFO: renamed from: o1 */
    private ByteBuffer f124874o1;

    /* JADX INFO: renamed from: o2 */
    private LinkedList<Long> f124875o2;

    /* JADX INFO: renamed from: p1 */
    boolean f124876p1;

    /* JADX INFO: renamed from: p2 */
    private int f124877p2;

    /* JADX INFO: renamed from: q1 */
    private int f124878q1;

    /* JADX INFO: renamed from: q2 */
    private long f124879q2;

    /* JADX INFO: renamed from: r1 */
    private String f124880r1;

    /* JADX INFO: renamed from: r2 */
    private long f124881r2;

    /* JADX INFO: renamed from: s1 */
    private String f124882s1;

    /* JADX INFO: renamed from: s2 */
    private long f124883s2;

    /* JADX INFO: renamed from: t1 */
    private long f124884t1;

    /* JADX INFO: renamed from: t2 */
    private long f124885t2;

    /* JADX INFO: renamed from: u1 */
    private long f124886u1;

    /* JADX INFO: renamed from: u2 */
    private long f124887u2;

    /* JADX INFO: renamed from: v1 */
    private long f124888v1;

    /* JADX INFO: renamed from: v2 */
    private long f124889v2;

    /* JADX INFO: renamed from: w1 */
    private long f124890w1;

    /* JADX INFO: renamed from: w2 */
    private boolean f124891w2;

    /* JADX INFO: renamed from: x1 */
    private long f124892x1;

    /* JADX INFO: renamed from: x2 */
    private long f124893x2;

    /* JADX INFO: renamed from: y1 */
    private long f124894y1;

    /* JADX INFO: renamed from: y2 */
    private int f124895y2;

    /* JADX INFO: renamed from: z1 */
    private int f124896z1;

    /* JADX INFO: renamed from: z2 */
    private C18096d f124897z2;

    /* JADX INFO: renamed from: l.kw00$b */
    public class C18094b {

        /* JADX INFO: renamed from: a */
        public ByteBuffer f124898a;

        /* JADX INFO: renamed from: b */
        public long f124899b;

        /* JADX INFO: renamed from: c */
        public long f124900c;

        /* JADX INFO: renamed from: d */
        public int f124901d;

        /* JADX INFO: renamed from: e */
        public long f124902e;

        private C18094b() {
        }
    }

    /* JADX INFO: renamed from: l.kw00$c */
    public class HandlerC18095c extends Handler {
        public HandlerC18095c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            if (message.what != 202) {
                return;
            }
            long jM147500i4 = kw00.this.m147500i4();
            long jMo20001b1 = kw00.this.mo20001b1();
            int i = (int) jM147500i4;
            int i2 = i - kw00.this.f124843N2;
            int i3 = (int) jMo20001b1;
            int i4 = i3 - kw00.this.f124845O2;
            if (kw00.this.f124856Z1 != null) {
                kw00.this.f124856Z1.m130812c(i2, i4);
            }
            kw00.this.f124841M2.add(Integer.valueOf(i2));
            kw00.this.f124843N2 = i;
            kw00.this.f124845O2 = i3;
            sendEmptyMessageDelayed(202, 1000L);
        }
    }

    /* JADX INFO: renamed from: l.kw00$d */
    public class C18096d {

        /* JADX INFO: renamed from: a */
        private int f124905a = -1;

        /* JADX INFO: renamed from: b */
        private int f124906b = -1;

        /* JADX INFO: renamed from: c */
        private int f124907c = -1;

        /* JADX INFO: renamed from: d */
        private int f124908d = -1;

        /* JADX INFO: renamed from: e */
        private int f124909e = -1;

        /* JADX INFO: renamed from: f */
        private int f124910f = -1;

        /* JADX INFO: renamed from: g */
        private long f124911g = 0;

        public C18096d() {
        }

        /* JADX WARN: Code duplicated, block: B:56:0x019c  */
        /* JADX WARN: Code duplicated, block: B:57:0x019d  */
        /* JADX WARN: Code duplicated, block: B:60:0x01a9 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x000f, B:12:0x001c, B:16:0x0028, B:18:0x002f, B:20:0x003b, B:22:0x0047, B:41:0x00b0, B:23:0x004b, B:25:0x0059, B:27:0x0063, B:29:0x0070, B:31:0x007d, B:32:0x0080, B:34:0x008a, B:36:0x0094, B:38:0x00a1, B:40:0x00ae, B:43:0x00ed, B:45:0x00f3, B:47:0x00f6, B:54:0x0168, B:58:0x019e, B:60:0x01a9, B:49:0x0134, B:51:0x0138, B:53:0x013d), top: B:65:0x0005 }] */
        /* JADX INFO: renamed from: e */
        private synchronized void m147508e(int i) {
            int iM198868b;
            long j;
            if (((MediaBaseCodecFilter) kw00.this).f14281s.f182024M0 || kw00.this.f124891w2) {
                if (((MediaBaseCodecFilter) kw00.this).f14281s.f182025N0 <= 0) {
                    return;
                }
                int i2 = 1;
                if (this.f124905a == -1) {
                    if (((MediaBaseCodecFilter) kw00.this).f14281s.f177152m == 528 && ((MediaBaseCodecFilter) kw00.this).f14281s.f177154n == 960) {
                        this.f124905a = 2;
                    } else if (((MediaBaseCodecFilter) kw00.this).f14281s.f177152m == 352 && ((MediaBaseCodecFilter) kw00.this).f14281s.f177154n == 640 && (((MediaBaseCodecFilter) kw00.this).f14281s.f177109H == 750000 || ((MediaBaseCodecFilter) kw00.this).f14281s.f177109H == 768000)) {
                        this.f124905a = 1;
                    } else if (((MediaBaseCodecFilter) kw00.this).f14281s.f177152m == 352 && ((MediaBaseCodecFilter) kw00.this).f14281s.f177154n == 640 && (((MediaBaseCodecFilter) kw00.this).f14281s.f177109H == 500000 || ((MediaBaseCodecFilter) kw00.this).f14281s.f177109H == 512000)) {
                        this.f124905a = 0;
                    }
                    this.f124906b = this.f124905a;
                    ii70.m136344d().m136346a("Pipeline_Flow_pip->MOMO", "jzheng init current level " + this.f124906b + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((MediaBaseCodecFilter) kw00.this).f14281s.f177109H + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((MediaBaseCodecFilter) kw00.this).f14281s.f177152m);
                }
                if (i == 0) {
                    int i3 = this.f124905a;
                    int i4 = this.f124906b;
                    if (i3 != i4 && i4 + 1 <= i3) {
                        ii70.m136344d().m136346a("Pipeline_Flow_pip->MOMO", "jzheng 网络拥塞解除。" + kw00.this.f124887u2);
                        this.f124906b = this.f124906b + 1;
                        kw00 kw00Var = kw00.this;
                        kw00Var.f124835J2 = ((MediaBaseCodecFilter) kw00Var).f14281s.f177109H;
                        di70.m111864a(((MediaBaseCodecFilter) kw00.this).f14281s, this.f124906b);
                        kw00.this.m147481w4(0, 0);
                        kw00 kw00Var2 = kw00.this;
                        kw00Var2.f124859c2 = ((MediaBaseCodecFilter) kw00Var2).f14281s.f177152m;
                        kw00 kw00Var3 = kw00.this;
                        kw00Var3.f124860d2 = ((MediaBaseCodecFilter) kw00Var3).f14281s.f177154n;
                        kw00.this.f124887u2 = 0L;
                        kw00.m147458k3(kw00.this);
                        iM198868b = ((MediaBaseCodecFilter) kw00.this).f14281s.m198868b();
                        if (kw00.this.f124891w2) {
                            i2 = iM198868b;
                        }
                        j = i2;
                        if (kw00.this.f124889v2 > j) {
                            kw00.this.f124889v2 = j;
                        }
                    }
                } else if (i == 1 && this.f124905a != 0 && this.f124906b - 1 >= 0) {
                    ii70.m136344d().m136346a("Pipeline_Flow_pip->MOMO", "jzheng 进入拥塞。");
                    this.f124906b--;
                    kw00 kw00Var4 = kw00.this;
                    kw00Var4.f124835J2 = ((MediaBaseCodecFilter) kw00Var4).f14281s.f177109H;
                    di70.m111864a(((MediaBaseCodecFilter) kw00.this).f14281s, this.f124906b);
                    kw00.this.m147481w4(1, 0);
                    kw00 kw00Var5 = kw00.this;
                    kw00Var5.f124859c2 = ((MediaBaseCodecFilter) kw00Var5).f14281s.f177152m;
                    kw00 kw00Var6 = kw00.this;
                    kw00Var6.f124860d2 = ((MediaBaseCodecFilter) kw00Var6).f14281s.f177154n;
                    kw00.this.f124887u2 = 0L;
                    kw00.m147458k3(kw00.this);
                    iM198868b = ((MediaBaseCodecFilter) kw00.this).f14281s.m198868b();
                    if (kw00.this.f124891w2) {
                        i2 = iM198868b;
                    }
                    j = i2;
                    if (kw00.this.f124889v2 > j) {
                        kw00.this.f124889v2 = j;
                    }
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:47:0x0191  */
        /* JADX WARN: Code duplicated, block: B:48:0x0192 A[Catch: all -> 0x001f, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0013, B:12:0x0022, B:14:0x0027, B:17:0x006a, B:20:0x0072, B:22:0x0081, B:23:0x0083, B:45:0x0167, B:49:0x019c, B:51:0x01a7, B:48:0x0192, B:24:0x00a0, B:26:0x00d5, B:28:0x00dd, B:30:0x00e6, B:32:0x00f1, B:33:0x00f7, B:35:0x010c, B:39:0x011e, B:41:0x0122, B:44:0x0144, B:52:0x01ad), top: B:57:0x0005 }] */
        /* JADX WARN: Code duplicated, block: B:51:0x01a7 A[Catch: all -> 0x001f, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0013, B:12:0x0022, B:14:0x0027, B:17:0x006a, B:20:0x0072, B:22:0x0081, B:23:0x0083, B:45:0x0167, B:49:0x019c, B:51:0x01a7, B:48:0x0192, B:24:0x00a0, B:26:0x00d5, B:28:0x00dd, B:30:0x00e6, B:32:0x00f1, B:33:0x00f7, B:35:0x010c, B:39:0x011e, B:41:0x0122, B:44:0x0144, B:52:0x01ad), top: B:57:0x0005 }] */
        /* JADX INFO: renamed from: f */
        private synchronized void m147509f(int i) {
            int length;
            long j;
            if (((MediaBaseCodecFilter) kw00.this).f14268H.f203888s == 111 || !((MediaBaseCodecFilter) kw00.this).f14281s.f182035X0) {
                if (this.f124907c == -1) {
                    int i2 = kw00.this.m19729Z1().f177109H;
                    this.f124907c = i2;
                    this.f124908d = i2;
                    n8c.m158483a("newBitrate", "jzheng init  " + this.f124908d + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + kw00.this.m19729Z1().f177109H + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((MediaBaseCodecFilter) kw00.this).f14281s.f177152m);
                }
                int iM198868b = 1;
                if (i == 0) {
                    int i3 = this.f124907c;
                    int i4 = this.f124908d;
                    if (i3 == i4 || i4 >= i3) {
                        eyx.m118802c().m118808g("NOT PUSH_LEVEL_CHANGE_UP origBitrate:" + this.f124907c + ", currBitrate:" + this.f124908d + ",audioBufCheckCount:" + kw00.this.f124887u2);
                    } else {
                        int iM121687Q = i4 + fjx.m121638R().m121687Q();
                        this.f124908d = iM121687Q;
                        int i5 = this.f124907c;
                        if (iM121687Q > i5) {
                            this.f124908d = i5;
                        }
                        kw00 kw00Var = kw00.this;
                        kw00Var.f124835J2 = kw00Var.m19729Z1().f177109H;
                        di70.m111866c(((MediaBaseCodecFilter) kw00.this).f14281s, this.f124908d);
                        kw00.this.m147481w4(0, 0);
                        kw00 kw00Var2 = kw00.this;
                        kw00Var2.f124859c2 = kw00Var2.m19729Z1().f177152m;
                        kw00 kw00Var3 = kw00.this;
                        kw00Var3.f124860d2 = kw00Var3.m19729Z1().f177154n;
                        kw00.this.f124887u2 = 0L;
                        kw00.m147458k3(kw00.this);
                        if (kw00.this.f124891w2) {
                            iM198868b = kw00.this.m19729Z1().m198868b();
                        }
                        j = iM198868b;
                        if (kw00.this.f124889v2 > j) {
                            kw00.this.f124889v2 = j;
                        }
                    }
                } else if (i == 1) {
                    if (kw00.this.f124853W1 == null || kw00.this.f124853W1.length <= 0) {
                        length = 0;
                    } else {
                        int i6 = 0;
                        for (int i7 : kw00.this.f124853W1) {
                            i6 += i7;
                        }
                        length = (int) (((double) (i6 / kw00.this.f124853W1.length)) * fjx.m121638R().m121748i());
                    }
                    kw00 kw00Var4 = kw00.this;
                    int iM147445a4 = kw00Var4.m147445a4(((MediaBaseCodecFilter) kw00Var4).f14281s);
                    if (this.f124907c != 0 && length > 0 && length >= iM147445a4 && length < this.f124908d) {
                        this.f124908d = length;
                        kw00 kw00Var5 = kw00.this;
                        kw00Var5.f124835J2 = kw00Var5.m19729Z1().f177109H;
                        di70.m111866c(((MediaBaseCodecFilter) kw00.this).f14281s, this.f124908d);
                        kw00.this.m147481w4(1, 0);
                    } else if (length < 0 || length >= iM147445a4) {
                        eyx.m118802c().m118808g("videoDynamicScaling_2 newbitrate:" + length + ",curr_min_bit:" + iM147445a4 + ",currbit:" + this.f124908d);
                    } else {
                        this.f124908d = Math.min(iM147445a4, this.f124908d);
                        kw00 kw00Var6 = kw00.this;
                        kw00Var6.f124835J2 = kw00Var6.m19729Z1().f177109H;
                        di70.m111866c(((MediaBaseCodecFilter) kw00.this).f14281s, this.f124908d);
                        kw00.this.m147481w4(1, 1);
                    }
                    kw00 kw00Var7 = kw00.this;
                    kw00Var7.f124859c2 = kw00Var7.m19729Z1().f177152m;
                    kw00 kw00Var8 = kw00.this;
                    kw00Var8.f124860d2 = kw00Var8.m19729Z1().f177154n;
                    kw00.this.f124887u2 = 0L;
                    kw00.m147458k3(kw00.this);
                    if (kw00.this.f124891w2) {
                        iM198868b = kw00.this.m19729Z1().m198868b();
                    }
                    j = iM198868b;
                    if (kw00.this.f124889v2 > j) {
                        kw00.this.f124889v2 = j;
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public synchronized void m147510g() {
            try {
                long j = this.f124911g + 1;
                this.f124911g = j;
                long j2 = j % 2;
                if (j2 == 0) {
                    n8c.m158483a("newBitrate", "jzheng 网络拥塞解除。" + kw00.this.f124887u2);
                    kw00 kw00Var = kw00.this;
                    kw00Var.f124835J2 = kw00Var.m19729Z1().f177109H;
                    ((MediaBaseCodecFilter) kw00.this).f14281s.f177152m = 528;
                    ((MediaBaseCodecFilter) kw00.this).f14281s.f177154n = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
                    ((MediaBaseCodecFilter) kw00.this).f14281s.f177109H = 1024000;
                    kw00.this.m147481w4(0, 0);
                } else if (j2 == 1) {
                    n8c.m158483a("newBitrate", "jzheng 进入拥塞。");
                    kw00 kw00Var2 = kw00.this;
                    kw00Var2.f124835J2 = kw00Var2.m19729Z1().f177109H;
                    ((MediaBaseCodecFilter) kw00.this).f14281s.f177152m = 352;
                    ((MediaBaseCodecFilter) kw00.this).f14281s.f177154n = 640;
                    ((MediaBaseCodecFilter) kw00.this).f14281s.f177109H = 750000;
                    kw00.this.m147481w4(1, 0);
                }
                kw00 kw00Var3 = kw00.this;
                kw00Var3.f124859c2 = kw00Var3.m19729Z1().f177152m;
                kw00 kw00Var4 = kw00.this;
                kw00Var4.f124860d2 = kw00Var4.m19729Z1().f177154n;
                kw00.this.f124887u2 = 0L;
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX WARN: Code duplicated, block: B:37:0x01a5  */
        /* JADX WARN: Code duplicated, block: B:38:0x01a6 A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:4:0x0009, B:6:0x0013, B:9:0x0023, B:11:0x0028, B:14:0x0069, B:16:0x006d, B:19:0x00a0, B:22:0x00c9, B:24:0x00dc, B:25:0x00df, B:35:0x017b, B:39:0x01b0, B:41:0x01bb, B:38:0x01a6, B:27:0x0100, B:29:0x0135, B:31:0x0141, B:33:0x0159, B:34:0x015e), top: B:48:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x01bb A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #0 {all -> 0x0066, blocks: (B:4:0x0009, B:6:0x0013, B:9:0x0023, B:11:0x0028, B:14:0x0069, B:16:0x006d, B:19:0x00a0, B:22:0x00c9, B:24:0x00dc, B:25:0x00df, B:35:0x017b, B:39:0x01b0, B:41:0x01bb, B:38:0x01a6, B:27:0x0100, B:29:0x0135, B:31:0x0141, B:33:0x0159, B:34:0x015e), top: B:48:0x0009 }] */
        /* JADX INFO: renamed from: h */
        private synchronized void m147511h(int i) {
            long j;
            try {
                if (kw00.this.m19729Z1().f182024M0 && ((MediaBaseCodecFilter) kw00.this).f14268H.f203888s == 111) {
                    if (this.f124907c == -1) {
                        this.f124907c = kw00.this.m19729Z1().f177109H;
                        n8c.m158483a("newBitrate", "jzheng init  " + this.f124908d + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + kw00.this.m19729Z1().f177109H + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((MediaBaseCodecFilter) kw00.this).f14281s.f177152m);
                    }
                    if (this.f124909e == -1) {
                        int i2 = kw00.this.m19729Z1().f177107F;
                        this.f124909e = i2;
                        this.f124910f = i2;
                        n8c.m158483a("newBitrate", "jzheng fps  " + this.f124910f + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + kw00.this.m19729Z1().f177107F);
                    }
                    int iM198868b = 1;
                    if (i == 0) {
                        ii70.m136344d().m136348c("Pipeline_Flow_pip->MOMO", "up：,origBitrate=" + this.f124907c + ",currBitrate=" + this.f124908d);
                        int i3 = this.f124907c;
                        int i4 = this.f124908d;
                        if (i3 != i4 && i4 < i3) {
                            ii70.m136344d().m136348c("Pipeline_Flow_pip->MOMO", "网络拥塞解除:----up");
                            int i5 = this.f124910f;
                            if (i5 + 1 <= this.f124909e) {
                                this.f124910f = i5 + 1;
                            }
                            kw00 kw00Var = kw00.this;
                            kw00Var.f124835J2 = kw00Var.m19729Z1().f177109H;
                            di70.m111865b(((MediaBaseCodecFilter) kw00.this).f14281s, this.f124908d, this.f124910f);
                            kw00.this.m147481w4(0, 0);
                            kw00 kw00Var2 = kw00.this;
                            kw00Var2.f124859c2 = kw00Var2.m19729Z1().f177152m;
                            kw00 kw00Var3 = kw00.this;
                            kw00Var3.f124860d2 = kw00Var3.m19729Z1().f177154n;
                            kw00.this.f124887u2 = 0L;
                            kw00.m147458k3(kw00.this);
                            if (kw00.this.f124891w2) {
                                iM198868b = kw00.this.m19729Z1().m198868b();
                            }
                            j = iM198868b;
                            if (kw00.this.f124889v2 > j) {
                                kw00.this.f124889v2 = j;
                            }
                        }
                    } else if (i == 1) {
                        ii70.m136344d().m136348c("Pipeline_Flow_pip->MOMO", "down：,origBitrate=" + this.f124907c + ",currBitrate=" + this.f124908d + ",getAdapt_br_min()=" + fjx.m121638R().m121760l());
                        if (this.f124907c != 0 && this.f124908d >= fjx.m121638R().m121760l()) {
                            ii70.m136344d().m136348c("Pipeline_Flow_pip->MOMO", "进入拥塞: down");
                            if (this.f124910f - 1 >= fjx.m121638R().m121768n()) {
                                this.f124910f--;
                            }
                            kw00 kw00Var4 = kw00.this;
                            kw00Var4.f124835J2 = kw00Var4.m19729Z1().f177109H;
                            di70.m111865b(((MediaBaseCodecFilter) kw00.this).f14281s, this.f124908d, this.f124910f);
                            kw00.this.m147481w4(1, 0);
                            kw00 kw00Var5 = kw00.this;
                            kw00Var5.f124859c2 = kw00Var5.m19729Z1().f177152m;
                            kw00 kw00Var6 = kw00.this;
                            kw00Var6.f124860d2 = kw00Var6.m19729Z1().f177154n;
                            kw00.this.f124887u2 = 0L;
                            kw00.m147458k3(kw00.this);
                            if (kw00.this.f124891w2) {
                                iM198868b = kw00.this.m19729Z1().m198868b();
                            }
                            j = iM198868b;
                            if (kw00.this.f124889v2 > j) {
                                kw00.this.f124889v2 = j;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX INFO: renamed from: c */
        public void m147512c(int i, boolean z) {
            if (z) {
                if (fjx.m121638R().m121676M0()) {
                    m147511h(i);
                }
            } else if (fjx.m121638R().m121737f0()) {
                m147509f(i);
            } else {
                m147508e(i);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m147513d() {
            this.f124907c = -1;
        }
    }

    public kw00(Context context, hu00.InterfaceC17392a interfaceC17392a) {
        super(context);
        this.f124870m1 = 0L;
        this.f124872n1 = 0L;
        this.f124876p1 = false;
        this.f124884t1 = 0L;
        this.f124886u1 = 0L;
        this.f124888v1 = 0L;
        this.f124890w1 = 0L;
        this.f124892x1 = 0L;
        this.f124894y1 = 0L;
        this.f124896z1 = 0;
        this.f124816A1 = 0;
        this.f124818B1 = 0;
        this.f124820C1 = 0;
        this.f124822D1 = 0;
        this.f124824E1 = false;
        this.f124826F1 = false;
        this.f124828G1 = false;
        this.f124830H1 = false;
        this.f124832I1 = false;
        this.f124836K1 = null;
        this.f124840M1 = 0L;
        this.f124842N1 = 0L;
        this.f124844O1 = false;
        this.f124846P1 = 0L;
        this.f124847Q1 = -130L;
        this.f124848R1 = -1L;
        this.f124849S1 = -1L;
        this.f124851U1 = -1L;
        this.f124852V1 = 0L;
        this.f124854X1 = 0;
        this.f124857a2 = new Handler(Looper.getMainLooper());
        this.f124859c2 = 0;
        this.f124860d2 = 0;
        this.f124861e2 = 0L;
        this.f124862f2 = 0L;
        this.f124863g2 = 0L;
        this.f124864h2 = false;
        this.f124865i2 = 0;
        this.f124866j2 = -1L;
        this.f124867k2 = 0L;
        this.f124869l2 = 0L;
        this.f124871m2 = false;
        this.f124873n2 = new LinkedList<>();
        this.f124875o2 = new LinkedList<>();
        this.f124877p2 = 0;
        this.f124879q2 = -1L;
        this.f124881r2 = 0L;
        this.f124883s2 = 0L;
        this.f124885t2 = 0L;
        this.f124887u2 = 0L;
        this.f124889v2 = 0L;
        this.f124891w2 = false;
        this.f124893x2 = -1L;
        this.f124895y2 = 6;
        this.f124897z2 = new C18096d();
        this.f124817A2 = false;
        this.f124819B2 = false;
        this.f124821C2 = System.currentTimeMillis();
        this.f124823D2 = 0L;
        this.f124825E2 = Pattern.compile("^rtmp://(?:\\[([0-9a-fA-F:]+)\\]|([^/:]+))(:(\\d+))*/([^/]+)(/(.*))*$");
        this.f124827F2 = Pattern.compile("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
        this.f124829G2 = Pattern.compile("^([0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$|^(([0-9a-fA-F]{1,4}:)*[0-9a-fA-F]{1,4})?::(([0-9a-fA-F]{1,4}:)*[0-9a-fA-F]{1,4})?$");
        this.f124831H2 = 0L;
        this.f124833I2 = "0,-1,-1";
        this.f124835J2 = 0;
        this.f124841M2 = new LimitedQueue<>(5);
        this.f124843N2 = 0;
        this.f124845O2 = 0;
        this.f124834J1 = interfaceC17392a;
        zmx zmxVar = this.f14268H;
        zmxVar.f203843d = 256L;
        zmxVar.f203848e1 = String.valueOf(hashCode());
    }

    /* JADX INFO: renamed from: E4 */
    private static Map<String, String> m147413E4(String str) throws Exception {
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
    private void m147415F4() {
        if (this.f124837K2 == null) {
            HandlerThread handlerThread = new HandlerThread("PushDetailThread");
            this.f124837K2 = handlerThread;
            handlerThread.start();
            if (this.f124839L2 == null) {
                HandlerC18095c handlerC18095c = new HandlerC18095c(this.f124837K2.getLooper());
                this.f124839L2 = handlerC18095c;
                handlerC18095c.sendEmptyMessageDelayed(202, 1000L);
            }
            this.f124856Z1 = new hgb0(5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: G4 */
    private boolean m147417G4(boolean z) {
        long propertyLong;
        vlw vlwVar = this.f14281s;
        long j = vlwVar.f182021J0;
        long propertyLong2 = 0;
        if (j > 0) {
            long j2 = vlwVar.f182022K0;
            if (j2 <= 0 || j >= j2) {
                vlwVar.f182021J0 = 2000L;
                vlwVar.f182022K0 = Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;
            }
        } else {
            vlwVar.f182021J0 = 2000L;
            vlwVar.f182022K0 = Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;
        }
        IjkWriter ijkWriter = this.f124868l1;
        if (ijkWriter != null) {
            propertyLong2 = ijkWriter.getPropertyLong(20007, 0L);
            propertyLong = this.f124868l1.getPropertyLong(20008, 0L);
        } else {
            propertyLong = 0;
        }
        vlw vlwVar2 = this.f14281s;
        long j3 = vlwVar2.f182021J0;
        long j4 = vlwVar2.f182022K0;
        if (!this.f124864h2) {
            boolean z2 = vlwVar2.f182020I0 && ((propertyLong2 > j4 ? 1 : (propertyLong2 == j4 ? 0 : -1)) >= 0 && ((propertyLong * 23) > j4 ? 1 : ((propertyLong * 23) == j4 ? 0 : -1)) >= 0);
            this.f124864h2 = z2;
            if (z2) {
                this.f124865i2 = 0;
                m147465n4(true);
                this.f124834J1.mo128349g(CommandMessage.COMMAND_RESUME_PUSH, 0, 0, this);
            }
        } else if ((propertyLong2 <= j3 || propertyLong * 23 <= j3) && z) {
            this.f124864h2 = false;
            m147465n4(false);
            this.f124834J1.mo128349g(CommandMessage.COMMAND_SET_ACCOUNTS, 0, 0, this);
        }
        return this.f124864h2;
    }

    /* JADX INFO: renamed from: H4 */
    private void m147419H4() {
        HandlerC18095c handlerC18095c = this.f124839L2;
        if (handlerC18095c == null || this.f124837K2 == null) {
            return;
        }
        handlerC18095c.removeCallbacksAndMessages(null);
        this.f124837K2.quit();
        this.f124839L2 = null;
        this.f124837K2 = null;
    }

    /* JADX INFO: renamed from: I4 */
    private void m147421I4(int i, long j) {
        long j2 = this.f124831H2;
        if (j2 != 0 && j > j2) {
            this.f14268H.f203816R = j - j2;
        }
        this.f124831H2 = j;
    }

    /* JADX INFO: renamed from: J4 */
    private void m147423J4(long j, int i) {
        long jMo20009g0 = mo20009g0();
        long j2 = ((long) ((jMo20009g0 - this.f124852V1) / (j / 1000.0f))) * 8;
        int[] iArr = this.f124853W1;
        if (iArr.length == 0) {
            return;
        }
        if (this.f124854X1 >= iArr.length) {
            this.f124854X1 = 0;
        }
        iArr[this.f124854X1] = (int) j2;
        this.f124855Y1.add(Integer.valueOf(i));
        this.f124854X1++;
        this.f124852V1 = jMo20009g0;
    }

    /* JADX INFO: renamed from: K4 */
    private void m147425K4(boolean z) {
        if (this.f124873n2.size() <= 0 || this.f124875o2.size() <= 0) {
            return;
        }
        for (int i = 0; i < this.f124873n2.size(); i++) {
            C18094b c18094b = this.f124873n2.get(i);
            int i2 = c18094b.f124901d;
            if (i2 == 0 || i2 == 5) {
                c18094b.f124899b = this.f124875o2.removeLast().longValue();
            } else {
                c18094b.f124899b = this.f124875o2.removeFirst().longValue();
            }
            long j = c18094b.f124900c + this.f124847Q1;
            long j2 = c18094b.f124899b;
            if (j - j2 > this.f124846P1) {
                this.f124846P1 = j - j2;
            }
            Log.e("huohl", "writeSampleData 1: src dts:" + j + ", pts:" + (c18094b.f124899b + this.f124846P1) + ", deltaDts:" + this.f124847Q1 + ",diffdts: " + this.f124846P1 + ", frame Type: BP");
            ByteBuffer byteBuffer = c18094b.f124898a;
            ByteBuffer byteBufferM141697B2 = m141697B2(byteBuffer, byteBuffer.limit(), false);
            byteBufferM141697B2.flip();
            this.f124868l1.writeVideoPacket2(j, c18094b.f124899b + this.f124846P1, byteBufferM141697B2, byteBufferM141697B2.limit(), z);
            this.f124884t1 = this.f124884t1 + ((long) byteBufferM141697B2.limit());
            this.f124888v1 = this.f124888v1 + 1;
        }
        this.f124875o2.clear();
        this.f124873n2.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public int m147445a4(vlw vlwVar) {
        if (fjx.m121638R().m121714Z0()) {
            eyx.m118802c().m118808g("isAdaptSizeListEmpty is null");
        } else {
            for (fjx.C16863b c16863b : fjx.m121638R().m121649D0()) {
                if (vlwVar.f177152m == c16863b.m121811g() && vlwVar.f177154n == c16863b.m121810f()) {
                    return c16863b.m121809b().intValue();
                }
            }
        }
        return vlwVar.f177109H;
    }

    /* JADX INFO: renamed from: c4 */
    private String m147448c4() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Integer> it = this.f124841M2.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (i != 0) {
                sb.append(Constants.SEPARATOR_COMMA);
            }
            sb.append(m147469p4(it.next()));
            i++;
        }
        sb.append(Constants.AES_SUFFIX);
        return sb.toString();
    }

    /* JADX INFO: renamed from: d4 */
    private boolean m147450d4() {
        IjkWriter ijkWriter = this.f124868l1;
        return ijkWriter != null && ijkWriter.getAdapt() == 1;
    }

    /* JADX INFO: renamed from: h4 */
    private String m147455h4(int i, int i2) {
        return null;
    }

    /* JADX INFO: renamed from: k3 */
    public static /* synthetic */ long m147458k3(kw00 kw00Var) {
        long j = kw00Var.f124889v2;
        kw00Var.f124889v2 = 1 + j;
        return j;
    }

    /* JADX INFO: renamed from: k4 */
    private String m147459k4() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Integer> it = this.f124855Y1.iterator();
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
    private void m147461l4(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String str2 = m147413E4(str).get("mtag");
            if (str2 == null || str2.isEmpty()) {
                return;
            }
            m19745m2(str2);
            this.f14269I.m131787l("handleMtagFromUrl", "mtag=".concat(str2));
        } catch (Exception e) {
            this.f14269I.m131787l("handleMtagFromUrl", "parse failed: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: m4 */
    private boolean m147463m4(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return this.f124827F2.matcher(str).matches() || this.f124829G2.matcher(str).matches();
    }

    /* JADX INFO: renamed from: n4 */
    private void m147465n4(boolean z) {
        long jMo19937J0 = mo19937J0();
        long jMo19988X0 = mo19988X0();
        long jMo20048u1 = mo20048u1();
        long jMo19919D0 = mo19919D0();
        if (z) {
            this.f14269I.m131800y(jMo19937J0, jMo19988X0, jMo20048u1, jMo19919D0);
        } else {
            this.f14269I.m131801z(jMo19937J0, jMo19988X0, jMo20048u1, jMo19919D0, m147496b4());
        }
    }

    /* JADX INFO: renamed from: o4 */
    private void m147467o4(int i, int i2) {
        String str;
        if (i2 == 1) {
            str = "downshift";
        } else {
            str = i == 0 ? "up" : "down";
        }
        String str2 = str;
        int i3 = m19729Z1().f177152m;
        int i4 = m19729Z1().f177154n;
        int i5 = m19729Z1().f177109H;
        int iMo19992Y0 = mo19992Y0() * 1000;
        int i6 = this.f124897z2.f124907c;
        int i7 = m19729Z1().f182016E0;
        int iM121805z = fjx.m121638R().m121805z();
        int iM121793v = fjx.m121638R().m121793v();
        int iM121785s0 = fjx.m121638R().m121785s0();
        int iM121639A = fjx.m121638R().m121639A();
        hgb0 hgb0Var = this.f124856Z1;
        this.f14269I.m131763A(false, 0L, 0L, 0L, 0L, str2, i3, i4, i5, iMo19992Y0, i6, i7, iM121805z, iM121793v, iM121785s0, iM121639A, m147459k4(), hgb0Var == null ? "" : hgb0Var.m130811a());
    }

    /* JADX INFO: renamed from: p4 */
    private String m147469p4(Object... objArr) {
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
    private void m147472r4() {
        long j;
        if (!fjx.m121638R().m121737f0() || this.f14281s.f177107F * 30 > this.f124888v1 || this.f124830H1 || this.f14268H.f203854g1 >= 3) {
            if (this.f124830H1 && this.f124888v1 % 30 == 0) {
                this.f14269I.m131786k("DynamicScaling", "mReplaceStreamMode:" + this.f124830H1);
            }
            if (this.f14268H.f203854g1 < 3 || this.f124888v1 % 75 != 0) {
                return;
            }
            this.f14269I.m131786k("netSpeedCheck", "sendSize0cnt >= 3");
            return;
        }
        long propertyLong = -1;
        if (this.f124879q2 == -1) {
            this.f124879q2 = SystemClock.elapsedRealtime();
            this.f124893x2 = SystemClock.elapsedRealtime();
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f124879q2;
        if (jElapsedRealtime > 0 && jElapsedRealtime >= fjx.m121638R().m121805z()) {
            IjkWriter ijkWriter = this.f124868l1;
            if (ijkWriter != null) {
                propertyLong = ijkWriter.getPropertyLong(20008, 0L);
                this.f124868l1.getPropertyLong(20005, 0L);
            }
            long j2 = propertyLong * 23;
            boolean z = j2 >= ((long) fjx.m121638R().m121793v());
            int iM121785s0 = fjx.m121638R().m121785s0();
            int iM121639A = fjx.m121638R().m121639A();
            this.f124879q2 = SystemClock.elapsedRealtime();
            if ((j2 <= iM121639A || j2 <= this.f124885t2) && !z) {
                j = 1;
                this.f124883s2 = 0L;
            } else {
                long j3 = this.f124883s2;
                j = 1;
                this.f124883s2 = j3 + 1;
                if (z) {
                    this.f124883s2 = j3 + 2;
                }
            }
            m147423J4(jElapsedRealtime, (int) j2);
            if (this.f124883s2 > fjx.m121638R().m121698U()) {
                this.f124883s2 = fjx.m121638R().m121698U();
            }
            this.f124885t2 = j2;
            if (j2 <= iM121785s0) {
                this.f124887u2 += j;
            } else {
                this.f124887u2 = 0L;
            }
            if (!this.f124891w2) {
                long j4 = this.f124883s2;
                if (j4 != 0 && j4 % ((long) fjx.m121638R().m121698U()) == 0) {
                    if (this.f14281s.m198869c()) {
                        this.f124834J1.mo128349g(CommandMessage.COMMAND_PAUSE_PUSH, 0, 0, this);
                        n8c.m158483a("newBitrate", "MOMO_FILTER_INFO ");
                    }
                    this.f124897z2.m147512c(1, m147450d4());
                    this.f124883s2 = 0L;
                }
            }
            long jM121701V = fjx.m121638R().m121701V();
            long j5 = this.f124889v2;
            long j6 = jM121701V * j5;
            if (j5 != 0) {
                long j7 = this.f124887u2;
                if (j7 != 0 && j7 % j6 == 0) {
                    this.f124897z2.m147512c(0, m147450d4());
                }
            }
        }
        if (this.f124891w2) {
            long jElapsedRealtime2 = (SystemClock.elapsedRealtime() - this.f124893x2) / 1000;
            long j8 = this.f14281s.f182023L0;
            if (jElapsedRealtime2 <= 0 || jElapsedRealtime2 % 10 != 0) {
                return;
            }
            this.f124893x2 = SystemClock.elapsedRealtime();
            n8c.m158483a("jzheng", "ab " + jElapsedRealtime2 + "/" + fjx.m121638R().m121676M0() + "/" + fjx.m121638R().m121760l() + "/" + fjx.m121638R().m121764m() + "/" + fjx.m121638R().m121768n() + "/" + this.f14281s.f182024M0);
            this.f124897z2.m147512c(1, m147450d4());
            if (this.f14281s.f177109H - fjx.m121638R().m121760l() < fjx.m121638R().m121764m()) {
                this.f124891w2 = false;
            }
        }
    }

    /* JADX INFO: renamed from: s4 */
    private void m147474s4() {
        if (this.f124893x2 == -1) {
            this.f124893x2 = SystemClock.elapsedRealtime();
        }
        long jElapsedRealtime = (SystemClock.elapsedRealtime() - this.f124893x2) / 1000;
        if (jElapsedRealtime <= 0 || jElapsedRealtime % 10 != 0) {
            return;
        }
        this.f124893x2 = SystemClock.elapsedRealtime();
        n8c.m158483a("newBitrate", "ab " + jElapsedRealtime + "/" + fjx.m121638R().m121676M0() + "/" + fjx.m121638R().m121760l() + "/" + fjx.m121638R().m121764m() + "/" + fjx.m121638R().m121768n() + "/" + this.f14281s.f182024M0);
        this.f124897z2.m147510g();
    }

    /* JADX INFO: renamed from: t4 */
    private String m147476t4(String str) {
        Matcher matcher;
        if (str == null || str.length() == 0 || (matcher = this.f124825E2.matcher(str)) == null || !matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        return strGroup != null ? strGroup : matcher.group(2);
    }

    /* JADX INFO: renamed from: v4 */
    private void m147479v4(int i) {
        if (!this.f14281s.f182035X0) {
            this.f14268H.f203901y0 = i;
            this.f124834J1.mo128349g(12545, i, 0, this);
            this.f14270J = MomoCodec.MomoCodecState.WAIT;
            m19736e2(12545, i);
            return;
        }
        this.f14269I.m131787l("postNerworkErrorMessage", "local merge net error" + i + ",handler:" + this.f124838L1);
        hgd0 hgd0Var = this.f124838L1;
        if (hgd0Var != null) {
            hgd0Var.mo19163p(this.f14281s.f182043v0, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4 */
    public void m147481w4(int i, int i2) {
        m147467o4(i, i2);
        this.f124834J1.mo128349g(CommandMessage.COMMAND_GET_ACCOUNTS, i, 0, this);
    }

    /* JADX INFO: renamed from: y4 */
    private void m147484y4() {
        MomoCodec.MomoCodecState momoCodecState = this.f14270J;
        MomoCodec.MomoCodecState momoCodecState2 = MomoCodec.MomoCodecState.WAIT;
        if (momoCodecState == momoCodecState2) {
            return;
        }
        int i = this.f124871m2 ? 4 : 2;
        if (this.f124866j2 == -1) {
            this.f124866j2 = SystemClock.elapsedRealtime();
        }
        long jElapsedRealtime = (SystemClock.elapsedRealtime() - this.f124866j2) / 1000;
        if (jElapsedRealtime <= 0 || jElapsedRealtime % ((long) i) != 0) {
            return;
        }
        this.f124866j2 = SystemClock.elapsedRealtime();
        long jMo20009g0 = mo20009g0();
        n8c.m158483a("zhangjj", "from " + this.f124867k2 + " to " + jMo20009g0 + " diff " + (jMo20009g0 - this.f124867k2) + " cnt " + this.f124869l2);
        if (this.f124871m2) {
            jMo20009g0 = 1;
        }
        if (this.f124867k2 != jMo20009g0) {
            this.f124867k2 = jMo20009g0;
            this.f124869l2 = 0L;
        } else {
            this.f124869l2++;
        }
        if (this.f124869l2 == 5) {
            this.f124869l2 = 0L;
            n8c.m158483a("zhangjj", "get msg Error " + this.f14270J + "/-304/14");
            if (this.f14270J == momoCodecState2 || this.f124830H1) {
                return;
            }
            this.f14270J = momoCodecState2;
            this.f14269I.m131787l("MediaError", "14 sendsize 0 line 923");
            m147479v4(14);
        }
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: A0 */
    public int mo19914A0() {
        return mo20022k0();
    }

    /* JADX INFO: renamed from: A4 */
    public void m147486A4(int i) {
        this.f14269I.m131787l("setBusinessType", Integer.valueOf(i));
        this.f14268H.f203888s = i;
    }

    @Override // p149l.yt10
    @RequiresApi(api = 16)
    /* JADX INFO: renamed from: B1 */
    public boolean mo19751B1(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer byteBuffer2;
        if (!this.f124876p1) {
            return true;
        }
        m147484y4();
        if (this.f124817A2) {
            m147474s4();
        } else {
            m147472r4();
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
        if (this.f14281s.f177131b0) {
            mo19755K0(byteBuffer2);
            return true;
        }
        if (m147417G4(this.f124864h2 && i == 2 && m141700I2(byteBuffer, bufferInfo.size))) {
            if (i == 2) {
                this.f124865i2++;
                this.f124884t1 += (long) bufferInfo.size;
            } else {
                this.f124886u1 += (long) bufferInfo.size;
            }
            return true;
        }
        if (i == 1) {
            if (this.f124870m1 == 0) {
                this.f124870m1 = bufferInfo.presentationTimeUs;
            }
            long j = ((bufferInfo.presentationTimeUs - this.f124870m1) - this.f124840M1) / 1000;
            this.f124886u1 += (long) (bufferInfo.size - bufferInfo.offset);
            this.f124890w1++;
            if (this.f124894y1 == 0) {
                this.f124894y1 = System.currentTimeMillis();
            }
            IjkWriter ijkWriter = this.f124868l1;
            if (ijkWriter != null) {
                ijkWriter.writeAudioPacket(j + this.f124846P1, byteBuffer2, bufferInfo.size, 0);
            }
        } else if (i == 2) {
            if (this.f124872n1 == 0) {
                this.f124872n1 = bufferInfo.presentationTimeUs;
            }
            try {
                long j2 = ((bufferInfo.presentationTimeUs - this.f124872n1) - this.f124840M1) / 1000;
                if (this.f124848R1 < 0) {
                    this.f124848R1 = j2;
                }
                long jM146803a = this.f124850T1.m146803a(j2);
                long j3 = this.f124848R1;
                long j4 = j2 - j3 > 80 ? j3 + jM146803a : j2;
                if (this.f124849S1 < 0) {
                    this.f124849S1 = j4;
                }
                this.f124848R1 = j2;
                this.f124849S1 = j4;
                if (fjx.m121638R().m121672L() == 1) {
                    byteBuffer.position(0);
                    byte[] bArr = new byte[bufferInfo.size];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    int naluType = Nalu.getNaluType(bArr, bufferInfo.size);
                    if (naluType == 2 || naluType == 7) {
                        if (this.f124868l1 != null) {
                            ByteBuffer byteBufferM141697B2 = m141697B2(byteBuffer2, bufferInfo.size, true);
                            m147425K4(true);
                            this.f124868l1.writeVideoPacket2(j4 + this.f124847Q1, j4 + this.f124846P1, byteBufferM141697B2, byteBufferM141697B2.limit(), true);
                            this.f124884t1 += (long) (bufferInfo.size - bufferInfo.offset);
                            this.f124888v1++;
                        }
                        m147421I4(0, j4);
                    } else {
                        if (naluType == 0 || naluType == 5) {
                            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(byteBuffer2.limit());
                            byteBuffer2.position(0);
                            byteBufferAllocate2.put(byteBuffer2);
                            byteBufferAllocate2.flip();
                            C18094b c18094b = new C18094b();
                            c18094b.f124898a = byteBufferAllocate2;
                            c18094b.f124900c = j4;
                            c18094b.f124899b = j4;
                            c18094b.f124901d = naluType;
                            c18094b.f124902e = this.f124877p2;
                            m147425K4(false);
                            this.f124873n2.add(c18094b);
                            this.f124875o2.add(Long.valueOf(c18094b.f124900c));
                        } else if (naluType == 1 || naluType == 6) {
                            ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(byteBuffer2.limit());
                            byteBuffer2.position(0);
                            byteBufferAllocate3.put(byteBuffer2);
                            byteBufferAllocate3.flip();
                            C18094b c18094b2 = new C18094b();
                            c18094b2.f124898a = byteBufferAllocate3;
                            c18094b2.f124900c = j4;
                            c18094b2.f124899b = 0L;
                            c18094b2.f124901d = naluType;
                            c18094b2.f124902e = this.f124877p2;
                            this.f124873n2.add(c18094b2);
                            this.f124875o2.add(Long.valueOf(c18094b2.f124900c));
                        }
                    }
                } else {
                    long j5 = ((bufferInfo.presentationTimeUs - this.f124872n1) - this.f124840M1) / 1000;
                    boolean zM141700I2 = m141700I2(byteBuffer2, bufferInfo.size);
                    ByteBuffer byteBufferM141697B3 = m141697B2(byteBuffer2, bufferInfo.size, zM141700I2);
                    this.f124884t1 += (long) (bufferInfo.size - bufferInfo.offset);
                    this.f124888v1++;
                    if (this.f124892x1 == 0) {
                        this.f124892x1 = System.currentTimeMillis();
                    }
                    IjkWriter ijkWriter2 = this.f124868l1;
                    if (ijkWriter2 != null) {
                        ijkWriter2.writeVideoPacket(j5, byteBufferM141697B3, byteBufferM141697B3.limit(), zM141700I2);
                        if (zM141700I2) {
                            m147421I4(0, j5);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: B4 */
    public void m147487B4(boolean z) {
        this.f124830H1 = z;
        this.f14269I.m131787l("setReplaceStream" + z);
        IjkWriter ijkWriter = this.f124868l1;
        if (ijkWriter != null) {
            ijkWriter.setPropertyLong(30001, z ? 1L : 0L);
            ii70.m136344d().m136348c("Pipeline_Flow_pip->MOMO", getClass().getSimpleName() + "setReplaceStream:" + z);
        }
    }

    @Override // p149l.ya1
    /* JADX INFO: renamed from: C */
    public mpd0 mo18364C(mpd0 mpd0Var) {
        ya1 ya1Var = this.f124836K1;
        if (ya1Var != null) {
            return ya1Var.mo18364C(mpd0Var);
        }
        return null;
    }

    /* JADX INFO: renamed from: C4 */
    public void m147488C4(boolean z) {
        this.f14269I.m131787l("setReplaceStreamFix:" + z);
        this.f124832I1 = z;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: D0 */
    public long mo19919D0() {
        IjkWriter ijkWriter = this.f124868l1;
        if (ijkWriter != null) {
            return ijkWriter.getPropertyLong(20008, 0L);
        }
        return 0L;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: D1 */
    public String mo19920D1() {
        String str = this.f14268H.f203898x;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: D4 */
    public void m147489D4(int i, String str, String str2) {
        this.f124878q1 = i;
        this.f124880r1 = str;
        this.f124882s1 = str2;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: E0 */
    public void mo19922E0(dxl dxlVar) {
        this.f14266F = dxlVar;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: F0 */
    public int mo19926F0() {
        return this.f124820C1;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: F1 */
    public long mo19927F1() {
        IjkWriter ijkWriter = this.f124868l1;
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

    @Override // p149l.ewl
    /* JADX INFO: renamed from: G0 */
    public long mo19930G0() {
        IjkWriter ijkWriter = this.f124868l1;
        if (ijkWriter != null) {
            return ijkWriter.getVideoCacheSize();
        }
        return 0L;
    }

    @Override // p149l.jix
    /* JADX INFO: renamed from: G2 */
    public qjx mo19753G2() {
        return new rjx(this.f124834J1);
    }

    @Override // p149l.jix, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: H0 */
    public void mo19650H0(boolean z) {
        this.f124824E1 = z;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: J0 */
    public long mo19937J0() {
        IjkWriter ijkWriter = this.f124868l1;
        if (ijkWriter != null) {
            return ijkWriter.getPropertyLong(20008, 0L) * 23;
        }
        return 0L;
    }

    @Override // p149l.yt10
    /* JADX INFO: renamed from: K0 */
    public boolean mo19755K0(ByteBuffer byteBuffer) {
        return m147490L4(byteBuffer, 1);
    }

    @Override // p149l.jix, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: K1 */
    public void mo19652K1(mpd0 mpd0Var) {
        if (this.f124888v1 > 0 || this.f118172Z) {
            this.f124816A1++;
            u3m u3mVar = this.f14271K;
            if (u3mVar != null) {
                mpd0Var = ((ExtAudioWrapper) u3mVar).mo18364C(mpd0Var);
            }
            super.mo19652K1(mpd0Var);
        }
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: L0 */
    public long mo19943L0() {
        IjkWriter ijkWriter = this.f124868l1;
        if (ijkWriter != null) {
            return ijkWriter.getAVDiff();
        }
        return 0L;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: L1 */
    public long mo19944L1() {
        return m147495Z3();
    }

    /* JADX INFO: renamed from: L4 */
    public boolean m147490L4(ByteBuffer byteBuffer, int i) {
        if (m147417G4(this.f124864h2 && i == 2 && (m141700I2(byteBuffer, byteBuffer.limit()) || m141701J2(byteBuffer, byteBuffer.limit())))) {
            return true;
        }
        if (i == 2) {
            m147492N4(byteBuffer);
        } else {
            m147491M4(byteBuffer);
        }
        m147472r4();
        return true;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: M0 */
    public int mo19948M0() {
        return (int) this.f14268H.f203858i;
    }

    @Override // p149l.nbj, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: M1 */
    public void mo19653M1() {
        super.mo19653M1();
        ii70.m136344d().m136348c("MomoSurfaceFilter", "rendFrameBufferToCodec");
    }

    /* JADX INFO: renamed from: M4 */
    public boolean m147491M4(ByteBuffer byteBuffer) {
        if (!this.f124876p1) {
            return true;
        }
        ii70.m136344d().m136346a("Pipeline_Flow_pip->MOMO", getClass().getSimpleName() + " writeSoftAudioSample:" + byteBuffer.limit());
        if (this.f124870m1 == 0) {
            this.f124870m1 = System.currentTimeMillis();
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f124870m1;
        this.f124886u1 += (long) byteBuffer.limit();
        this.f124890w1++;
        if (this.f124894y1 == 0) {
            this.f124894y1 = System.currentTimeMillis();
        }
        IjkWriter ijkWriter = this.f124868l1;
        if (ijkWriter != null) {
            ijkWriter.writeAudioPacket(jCurrentTimeMillis, byteBuffer, byteBuffer.limit(), 0);
        }
        return true;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: N0 */
    public long mo19952N0() {
        IjkWriter ijkWriter = this.f124868l1;
        return ijkWriter != null ? ijkWriter.getTxbytes() : this.f14268H.f203784B;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: N1 */
    public int mo19953N1() {
        return 0;
    }

    /* JADX INFO: renamed from: N4 */
    public boolean m147492N4(ByteBuffer byteBuffer) {
        if (!this.f124876p1) {
            return true;
        }
        boolean zM141700I2 = m141700I2(byteBuffer, byteBuffer.limit());
        ByteBuffer byteBufferM141696A2 = m141696A2(byteBuffer, byteBuffer.limit(), zM141700I2, 0);
        this.f124884t1 += (long) byteBuffer.capacity();
        this.f124888v1++;
        if (this.f124892x1 == 0) {
            this.f124892x1 = System.currentTimeMillis();
        }
        if (this.f124872n1 == 0) {
            this.f124872n1 = System.currentTimeMillis();
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f124872n1;
        ii70.m136344d().m136346a("Pipeline_Flow_pip->MOMO", getClass().getSimpleName() + " writeSoftVideoSample:" + byteBuffer.limit());
        boolean zM141701J2 = m141701J2(byteBuffer, byteBuffer.limit()) | zM141700I2;
        IjkWriter ijkWriter = this.f124868l1;
        if (zM141701J2) {
            if (ijkWriter != null) {
                ijkWriter.writeVideoPacket(jCurrentTimeMillis, byteBufferM141696A2, byteBufferM141696A2.limit(), 5);
            }
            m147421I4(0, jCurrentTimeMillis);
        } else if (ijkWriter != null) {
            ijkWriter.writeVideoPacket(jCurrentTimeMillis, byteBufferM141696A2, byteBufferM141696A2.limit(), 1);
        }
        return true;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: O0 */
    public long mo19956O0() {
        IjkWriter ijkWriter;
        return (!this.f118171Y0 || (ijkWriter = this.f124868l1) == null) ? this.f124886u1 : ijkWriter.getPropertyLong(20010, 0L);
    }

    @Override // p149l.yt10
    /* JADX INFO: renamed from: O1 */
    public void mo19756O1() {
        ii70.m136344d().m136348c("Pipeline_Flow_pip->MOMO", "startMuxing !##########################");
        this.f118169X0 = true;
    }

    @Override // p149l.gw00.InterfaceC17174f
    /* JADX INFO: renamed from: P0 */
    public void mo19959P0(yw00 yw00Var, int i, int i2, int i3, int i4) {
        this.f124818B1 = i4;
        this.f124820C1 = i2;
        this.f124822D1 = i3;
    }

    @Override // p149l.jix
    @RequiresApi(api = 19)
    /* JADX INFO: renamed from: P2 */
    public void mo141704P2(int i) {
        vlw vlwVar;
        IjkWriter ijkWriter = this.f124868l1;
        if (ijkWriter != null && (vlwVar = this.f14281s) != null) {
            ijkWriter.setVideoEncodingBitRate(vlwVar.f177109H);
        }
        super.mo141704P2(i);
        dxl dxlVar = this.f14266F;
        if (dxlVar != null) {
            dxlVar.mo104124t0(i);
        }
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: Q0 */
    public int mo19963Q0() {
        return 0;
    }

    @Override // p149l.jix, com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    @RequiresApi(api = 18)
    /* JADX INFO: renamed from: R0 */
    public void mo19655R0(vlw vlwVar, EGLContext eGLContext) {
        boolean zPrepare;
        ii70.m136344d().m136348c("Pipeline_Flow_pip->MOMO", "Momo startRecord !##########################");
        this.f14269I.m131787l("momoPusher", "startRecord");
        if (this.f118169X0) {
            return;
        }
        if (this.f124850T1 == null) {
            this.f124850T1 = new kp1();
        }
        if (this.f124868l1 != null || vlwVar == null) {
            zPrepare = true;
        } else {
            IjkWriter ijkWriter = new IjkWriter(this, false);
            this.f124868l1 = ijkWriter;
            this.f124861e2 = 0L;
            this.f124862f2 = 0L;
            this.f124863g2 = 0L;
            ijkWriter.setAudioSource(1);
            this.f124868l1.setAudioEncoder(3);
            this.f124868l1.setBitRateAdaptEnable(0);
            this.f124868l1.setAudioSamplingRate(vlwVar.f177117P);
            this.f124868l1.setAudioEncodingBitRate(vlwVar.f177120S);
            if (!this.f118172Z) {
                this.f124868l1.setVideoSource(1);
                boolean z = vlwVar.f182019H0;
                IjkWriter ijkWriter2 = this.f124868l1;
                if (z) {
                    ijkWriter2.setVideoEncoder(5);
                } else {
                    ijkWriter2.setVideoEncoder(2);
                }
                this.f124868l1.setVideoSize(vlwVar.f177152m, vlwVar.f177154n);
                this.f124868l1.setVideoEncodingBitRate(vlwVar.f177109H);
                this.f124868l1.setVideoFrameRate(20);
            }
            if (vlwVar.f182012A0 == MomoPipeline.DecodeType.SOFT_DECODE) {
                this.f118171Y0 = false;
            }
            this.f124868l1.setPropertyLong(30000, 0L);
            String str = this.f124882s1;
            IjkWriter ijkWriter3 = this.f124868l1;
            if (str != null) {
                ijkWriter3.setStreamerInOutAndType(this.f124878q1, this.f124880r1, str);
                this.f14268H.f203898x = this.f124882s1;
            } else {
                ijkWriter3.setStreamerInOutAndType(10, null, vlwVar.f182043v0);
                this.f14268H.f203898x = vlwVar.f182043v0;
            }
            m147461l4(this.f14268H.f203898x);
            this.f124858b2 = vlwVar.f182044w0;
            ii70.m136344d().m136348c("Pipeline_Flow_pip->MOMO", "startRecord    " + vlwVar.f182043v0);
            zPrepare = this.f124868l1.prepare();
            this.f14268H.f203898x = this.f124868l1.getOutputUrl();
            this.f14268H.f203852g = vlwVar.f182019H0 ? 2L : 0L;
            ii70.m136344d().m136348c("Pipeline_Flow_pip->MOMO", "startRecord end!!!!!    " + vlwVar.f182043v0);
            this.f124859c2 = vlwVar.f177152m;
            this.f124860d2 = vlwVar.f177154n;
            ii70.m136344d().m136348c("Pipeline_Flow_pip->MOMO", "videoWidth:" + vlwVar.f177164s + ",videoHeight:" + vlwVar.f177166t + ",visualWidth:" + vlwVar.f177168u + ",visualHeight:" + vlwVar.f177169v + ",encodeWidth:" + vlwVar.f177152m + ",encodeHeight:" + vlwVar.f177154n + ",videoBitrate:" + vlwVar.f177109H + ",audioBitrate:" + vlwVar.f177120S + ",videoFPS:" + vlwVar.f177107F + ",codecFPS:" + vlwVar.f182016E0 + ",isHard:" + vlwVar.f182012A0);
        }
        this.f14268H.f203834a = System.currentTimeMillis();
        this.f14268H.f203785B0 = "nonConf";
        zmx zmxVar = this.f14268H;
        zmxVar.f203839b1 = vlwVar.f177131b0 ? 1L : 0L;
        zmxVar.f203793F0 = vlwVar.f177109H;
        zmxVar.f203787C0 = vlwVar.f177120S;
        if (zPrepare) {
            ii70.m136344d().m136348c("Pipeline_Flow_pip->MOMO", "startRecord eglContext start!!!!!    " + vlwVar.f182043v0);
            super.mo19655R0(vlwVar, eGLContext);
            st0.m185792g().m185807p(m19726W1(), st0.f166269e);
            IjkWriter ijkWriter4 = this.f124868l1;
            if (ijkWriter4 != null) {
                this.f14268H.f203832Z = ijkWriter4.getServerIpAddr();
                ii70.m136344d().m136348c("Pipeline_Flow_pip->MOMO", "startRecord eglContext end!!!!!    " + vlwVar.f182043v0 + " ip " + this.f14268H.f203832Z);
            }
        }
        this.f14269I.m131787l("startRecord, pushDrop " + fjx.m121638R().m121690R0() + ",flv :" + fjx.m121638R().m121670K0() + ",high:" + fjx.m121638R().m121725c0() + ",base:" + fjx.m121638R().m121721b0());
        n8c.m158483a("zhangjj", "startRecord mPolicyDropFrameEnable [" + vlwVar.f182020I0 + Constants.SEPARATOR_COMMA + vlwVar.f182021J0 + Constants.SEPARATOR_COMMA + vlwVar.f182022K0 + "] vds " + vlwVar.f182024M0 + "/" + vlwVar.f182025N0);
        if (fjx.m121638R().m121690R0()) {
            vlwVar.f182020I0 = false;
            this.f124868l1.setDropCache(1, fjx.m121638R().m121725c0(), fjx.m121638R().m121721b0());
        }
        if (this.f124868l1 != null) {
            this.f124868l1.setPropertyLong(ijkStreamerUtil.FFS_PROP_INT64_AACPROFILE, fjx.m121638R().m121732e());
            this.f124868l1.setPropertyLong(30003, fjx.m121638R().m121670K0() ? 1L : 0L);
        }
        this.f124853W1 = new int[fjx.m121638R().m121752j() / fjx.m121638R().m121805z()];
        this.f124855Y1 = new LimitedQueue<>(fjx.m121638R().m121752j() / fjx.m121638R().m121805z());
        fjx.m121638R().m121647C1(fjx.m121638R().m121685P0() ? 1 : 0);
        hmx hmxVar = this.f14269I;
        Boolean boolValueOf = Boolean.valueOf(vlwVar.f182020I0);
        Long lValueOf = Long.valueOf(vlwVar.f182021J0);
        Long lValueOf2 = Long.valueOf(vlwVar.f182022K0);
        Boolean boolValueOf2 = Boolean.valueOf(fjx.m121638R().m121690R0());
        Integer numValueOf = Integer.valueOf(fjx.m121638R().m121725c0());
        Integer numValueOf2 = Integer.valueOf(fjx.m121638R().m121721b0());
        Boolean boolValueOf3 = Boolean.valueOf(fjx.m121638R().m121685P0());
        String str2 = this.f124882s1;
        if (str2 == null) {
            str2 = vlwVar.f182043v0;
        }
        hmxVar.m131787l("mrCoreParameters", boolValueOf, lValueOf, lValueOf2, boolValueOf2, numValueOf, numValueOf2, boolValueOf3, str2);
        m147415F4();
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: T0 */
    public int mo19973T0() {
        return (int) this.f14268H.f203814Q;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: V0 */
    public long mo19980V0() {
        IjkWriter ijkWriter = this.f124868l1;
        if (ijkWriter != null) {
            return ijkWriter.getPropertyLong(20002, 0L);
        }
        return 0L;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: W0 */
    public int mo19983W0() {
        return 0;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: X0 */
    public long mo19988X0() {
        IjkWriter ijkWriter = this.f124868l1;
        if (ijkWriter != null) {
            return ijkWriter.getPropertyLong(20005, 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: X3 */
    public long m147493X3() {
        IjkWriter ijkWriter = this.f124868l1;
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

    @Override // p149l.jix, com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: Y */
    public void mo19657Y(yw00 yw00Var, vlw vlwVar) {
        super.mo19657Y(yw00Var, vlwVar);
        if (vlwVar == null) {
            return;
        }
        int i = vlwVar.f177152m;
        int i2 = vlwVar.f177154n;
        this.f14269I.m131787l("resetCodec", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(vlwVar.f177109H), Integer.valueOf(vlwVar.f177107F));
        zmx zmxVar = this.f14268H;
        long j = vlwVar.f177109H;
        zmxVar.f203793F0 = j;
        this.f14269I.m131787l("resetCodec videoBitrateSetByuser", Long.valueOf(j));
        if (vlwVar.f182017F0) {
            i = vlwVar.f177154n;
            i2 = vlwVar.f177152m;
        }
        vlw vlwVar2 = this.f14281s;
        this.f124859c2 = vlwVar2.f177152m;
        this.f124860d2 = vlwVar2.f177154n;
        this.f124897z2.m147513d();
        IjkWriter ijkWriter = this.f124868l1;
        if (ijkWriter != null) {
            ijkWriter.setVideoSize(i, i2);
        }
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: Y0 */
    public int mo19992Y0() {
        IjkWriter ijkWriter = this.f124868l1;
        if (ijkWriter != null) {
            return ijkWriter.getVideoBitRate();
        }
        return 0;
    }

    /* JADX INFO: renamed from: Y3 */
    public long m147494Y3() {
        IjkWriter ijkWriter = this.f124868l1;
        if (ijkWriter != null) {
            return ijkWriter.getAudioWritedDPackets();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: Z3 */
    public long m147495Z3() {
        IjkWriter ijkWriter = this.f124868l1;
        if (ijkWriter != null) {
            return ijkWriter.getAverageSendBitRateB();
        }
        return 0L;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: a0 */
    public long mo19998a0() {
        return this.f124896z1;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: b0 */
    public void mo19658b0() {
        mo19662f();
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: b1 */
    public long mo20001b1() {
        IjkWriter ijkWriter;
        return (!this.f118171Y0 || (ijkWriter = this.f124868l1) == null) ? this.f124888v1 + ((long) m147496b4()) : ijkWriter.getPropertyLong(20013, 0L);
    }

    /* JADX INFO: renamed from: b4 */
    public int m147496b4() {
        return this.f124865i2;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: c0 */
    public long mo20003c0() {
        IjkWriter ijkWriter = this.f124868l1;
        if (ijkWriter != null) {
            return ijkWriter.getAudioCacheSize();
        }
        return 0L;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: c2 */
    public void mo19732c2() {
        this.f14269I.m131787l("logPushStart");
        this.f124819B2 = false;
        this.f14268H.f203832Z = getServerIpAddr();
        IjkWriter ijkWriter = this.f124868l1;
        if (ijkWriter != null) {
            this.f14268H.f203893u0 = ijkWriter.getPropertyLong(20002, 0L);
        }
        this.f14268H.f203895v0 = mo20041r0();
        this.f14268H.f203897w0 = mo20025l1();
        this.f14268H.f203899x0 = mo20047u0();
        this.f14268H.f203894v = getVideoWidth();
        this.f14268H.f203896w = mo20022k0();
        this.f14268H.f203902z = mo20036p1();
        this.f14268H.f203782A = mo19914A0();
        zmx zmxVar = this.f14268H;
        zmxVar.f203889s0 = 0;
        mvj0 mvj0Var = this.f124858b2;
        if (mvj0Var != null) {
            zmxVar.f203891t0 = mvj0Var.m156527a();
        }
        super.mo19732c2();
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, p149l.hmx.InterfaceC17343b
    /* JADX INFO: renamed from: d1 */
    public void mo19734d1() {
        if (this.f14268H.f203854g1 >= 3) {
            this.f14269I.m131787l("mediaLogsValOfPush.sendSize0cnt " + this.f14268H.f203854g1 + ", not send push watch");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jMo20034o0 = mo20034o0();
        this.f14268H.f203788D = mo20054x1();
        this.f14268H.f203815Q0 = mo20048u1();
        this.f14268H.f203792F = mo19956O0();
        this.f14268H.f203794G = mo20038q1();
        this.f14268H.f203796H = mo20001b1();
        this.f14268H.f203809N0 = mo20003c0();
        this.f14268H.f203811O0 = mo19930G0();
        this.f14268H.f203813P0 = mo20030n0();
        this.f14268H.f203817R0 = mo20009g0();
        this.f14268H.f203838b0 = m147494Y3();
        this.f14268H.f203784B = mo19927F1();
        this.f14268H.f203823U0 = mo20031n1();
        this.f14268H.f203825V0 = mo19926F0();
        this.f14268H.f203827W0 = mo19943L0();
        zmx zmxVar = this.f14268H;
        zmxVar.f203829X0 = (jMo20034o0 - this.f124823D2) - (jCurrentTimeMillis - this.f124821C2);
        this.f124823D2 = jMo20034o0;
        this.f124821C2 = jCurrentTimeMillis;
        zmxVar.f203831Y0 = mo19937J0();
        this.f14268H.f203808N = mo20052w1();
        this.f14268H.f203810O = mo20014h1();
        this.f14268H.f203812P = mo19992Y0();
        this.f14268H.f203814Q = mo20028m0();
        this.f14268H.f203894v = getVideoWidth();
        this.f14268H.f203896w = mo20022k0();
        zmx zmxVar2 = this.f14268H;
        zmxVar2.f203885r = "[(0)]";
        zmxVar2.f203818S = m19729Z1().f177170w;
        this.f14268H.f203820T = m19729Z1().f177171x;
        this.f14268H.f203801J0 = m147501j4();
        this.f14268H.f203799I0 = m147493X3();
        this.f14268H.f203844d0 = m147500i4();
        this.f14268H.f203860i1 = m147448c4();
        this.f14268H.f203863j1 = fjx.m121638R().m121737f0() ? 1 : 0;
        this.f14268H.f203869l1 = xxx.m211572F().m211598a().getWidth();
        this.f14268H.f203872m1 = xxx.m211572F().m211598a().getHeight();
        this.f14268H.f203875n1 = xxx.m211572F().m211638w();
        this.f14269I.m131769G();
        if (this.f14268H.f203854g1 != 3 || this.f14270J == MomoCodec.MomoCodecState.WAIT) {
            return;
        }
        this.f14269I.m131787l("MediaError", "14 sendsize 0 line 1778");
        m147479v4(14);
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: d2 */
    public void mo19735d2() {
        this.f14269I.m131787l("momopusher logPushStop");
        if (this.f124819B2) {
            return;
        }
        this.f124819B2 = true;
        if (this.f124844O1) {
            this.f124844O1 = false;
            this.f14269I.m131799x(0L);
        }
        IjkWriter ijkWriter = this.f124868l1;
        if (ijkWriter != null) {
            this.f14268H.f203784B = ijkWriter.getTxbytes();
        }
        zmx zmxVar = this.f14268H;
        long j = zmxVar.f203903z0;
        if (j != 0) {
            zmxVar.f203901y0 = j;
        }
        zmxVar.f203832Z = getServerIpAddr();
        zmx zmxVar2 = this.f14268H;
        if (zmxVar2.f203837b) {
            zmxVar2.f203855h = System.currentTimeMillis() - this.f14268H.f203834a;
        }
        mvj0 mvj0Var = this.f124858b2;
        if (mvj0Var != null) {
            this.f14268H.f203891t0 = mvj0Var.m156527a();
        }
        super.mo19735d2();
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: e1 */
    public void mo19661e1(@NonNull u3m u3mVar) {
        if (!(u3mVar instanceof ExtAudioWrapper)) {
            throw new InvalidParameterException("ISurroundMusic must implement by ExtAudioWrapper");
        }
        super.mo19661e1(u3mVar);
        u3m u3mVar2 = this.f14271K;
        if (u3mVar2 != null) {
            ((ExtAudioWrapper) u3mVar2).m20088J2(new C18097e());
        }
    }

    /* JADX INFO: renamed from: e4 */
    public int m147497e4() {
        return (int) this.f124861e2;
    }

    @Override // p149l.jix, com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: f */
    public void mo19662f() {
        ii70.m136344d().m136346a("Pipeline_Flow_pip->MOMO", getClass().getSimpleName().concat(" stopRecord"));
        this.f14269I.m131787l("momopusher stopRecord");
        super.mo19662f();
        this.f124876p1 = false;
        IjkWriter ijkWriter = this.f124868l1;
        if (ijkWriter != null) {
            this.f124861e2 = ijkWriter.getPropertyLong(20017, 0L);
            this.f124862f2 = this.f124868l1.getPropertyLong(20018, 0L);
            this.f124863g2 = this.f124868l1.getPropertyLong(20019, 0L);
            this.f14268H.f203784B = this.f124868l1.getTxbytes();
            this.f124868l1.stopRecording();
            eyx.m118802c().m118808g("enable_sync_streamreplace stopPsuh syncStreamRelace:" + this.f124832I1);
            m147487B4(this.f124832I1);
            this.f124868l1.release();
            this.f124868l1 = null;
        }
        mo19762k1();
        m147419H4();
        mo19735d2();
        super.m19748p2();
        Handler handler = this.f124857a2;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        st0.m185792g().m185808q(st0.f166269e);
        this.f124834J1.mo128349g(CommandMessage.COMMAND_REGISTER, 0, 0, this);
    }

    /* JADX INFO: renamed from: f4 */
    public int m147498f4() {
        return (int) this.f124863g2;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: g0 */
    public long mo20009g0() {
        IjkWriter ijkWriter = this.f124868l1;
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

    @Override // p149l.ewl
    /* JADX INFO: renamed from: g1 */
    public String mo20010g1(int i, int i2, Object obj) {
        return m147455h4(i, i2);
    }

    /* JADX INFO: renamed from: g4 */
    public int m147499g4() {
        return (int) this.f124862f2;
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public PointF getPreviewScale() {
        return null;
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public float getPreviewZoom() {
        return 0.0f;
    }

    @Override // p149l.ewl
    public int getRoomType() {
        return -1;
    }

    @Override // p149l.ewl
    public String getServerIpAddr() {
        IjkWriter ijkWriter = this.f124868l1;
        if (ijkWriter != null && ijkWriter.getServerIpAddr() != null) {
            return this.f124868l1.getServerIpAddr();
        }
        String str = this.f14268H.f203832Z;
        if (str != null && !str.equals(StringUtil.ALL_INTERFACES)) {
            return this.f14268H.f203832Z;
        }
        String strM147476t4 = m147476t4(mo19920D1());
        return (strM147476t4 == null || !m147463m4(strM147476t4)) ? StringUtil.ALL_INTERFACES : strM147476t4;
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

    @Override // p149l.ewl
    public int getVideoWidth() {
        int i = this.f124859c2;
        if (i != 0) {
            return i;
        }
        vlw vlwVar = this.f14281s;
        if (vlwVar != null) {
            return vlwVar.f177152m;
        }
        return 0;
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public Object getWriter() {
        return this.f124868l1;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: h0 */
    public int mo20013h0() {
        return 0;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: h1 */
    public int mo20014h1() {
        IjkWriter ijkWriter = this.f124868l1;
        if (ijkWriter != null) {
            return ijkWriter.getAudioBitRate();
        }
        return 0;
    }

    /* JADX INFO: renamed from: i4 */
    public long m147500i4() {
        IjkWriter ijkWriter = this.f124868l1;
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

    @Override // p149l.yt10
    public boolean isStarting() {
        return this.f118169X0;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: j1 */
    public long mo20019j1(int i, int i2, Object obj) {
        return 0L;
    }

    /* JADX INFO: renamed from: j4 */
    public long m147501j4() {
        IjkWriter ijkWriter = this.f124868l1;
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

    @Override // p149l.ewl
    /* JADX INFO: renamed from: k0 */
    public int mo20022k0() {
        int i = this.f124860d2;
        if (i != 0) {
            return i;
        }
        vlw vlwVar = this.f14281s;
        if (vlwVar != null) {
            return vlwVar.f177154n;
        }
        return 0;
    }

    @Override // p149l.yt10
    /* JADX INFO: renamed from: k1 */
    public void mo19762k1() {
        ii70.m136344d().m136348c("Pipeline_Flow_pip->MOMO", "stopMuxing !##########################");
        this.f118169X0 = false;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: l1 */
    public long mo20025l1() {
        long propertyLong;
        long propertyLong2;
        IjkWriter ijkWriter = this.f124868l1;
        if (ijkWriter == null) {
            return 0L;
        }
        if (this.f118171Y0) {
            propertyLong = this.f124892x1;
            propertyLong2 = this.f14268H.f203834a;
        } else {
            propertyLong = ijkWriter.getPropertyLong(20015, 0L);
            propertyLong2 = this.f124868l1.getPropertyLong(ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME, 0L);
            if (propertyLong == 0 || propertyLong2 == 0) {
                propertyLong = this.f124892x1;
                propertyLong2 = this.f14268H.f203834a;
            }
        }
        long j = propertyLong - propertyLong2;
        if (j < 0) {
            return 0L;
        }
        return j;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: m0 */
    public int mo20028m0() {
        return this.f124818B1;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: n0 */
    public long mo20030n0() {
        IjkWriter ijkWriter = this.f124868l1;
        if (ijkWriter != null) {
            return ijkWriter.getVideoPacketCache();
        }
        return 0L;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: n1 */
    public int mo20031n1() {
        return this.f124822D1;
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notify(int i, int i2, int i3, Object obj) {
        IjkWriter ijkWriter;
        if (i == 0) {
            this.f124834J1.mo128349g(CommandMessage.COMMAND_UNREGISTER, i2, i3, this);
        } else if (i == 300) {
            n8c.m158483a("zhangjj", "get msg Error " + this.f14270J + "/" + i2 + "/" + i3);
            hmx hmxVar = this.f14269I;
            Integer numValueOf = Integer.valueOf(i2);
            Integer numValueOf2 = Integer.valueOf(i3);
            StringBuilder sb = new StringBuilder("state:");
            sb.append(this.f14270J);
            hmxVar.m131787l("MEDIA_ERROR", numValueOf, numValueOf2, sb.toString());
            MomoCodec.MomoCodecState momoCodecState = this.f14270J;
            MomoCodec.MomoCodecState momoCodecState2 = MomoCodec.MomoCodecState.WAIT;
            if (momoCodecState != momoCodecState2) {
                this.f14270J = momoCodecState2;
                if (i2 == -304) {
                    m147479v4(i3);
                    ii70.m136344d().m136348c("Pipeline_Flow_pip->MOMO", " MOMO_ERROR_NETWORK ");
                } else {
                    ii70.m136344d().m136348c("Pipeline_Flow_pip->MOMO", " MOMO_ERROR_SYSTEM ");
                    this.f14269I.m131787l("onPusherError", Integer.valueOf(i2), Integer.valueOf(i3), "state:" + this.f14270J);
                    this.f14268H.f203901y0 = (long) i3;
                    this.f124834J1.mo128349g(12544, i2, i3, this);
                    m19736e2(12544, i2);
                }
            }
        } else if (i == 200) {
            this.f124834J1.mo128349g(CommandMessage.COMMAND_STATISTIC, i2, i3, this);
        } else if (i != 201) {
            switch (i) {
                case 100:
                    this.f14269I.m131787l("PREPARED");
                    ii70.m136344d().m136348c("Pipeline_Flow_pip->MOMO", " MEDIA_RECORDER_PREPARED");
                    this.f124834J1.mo128349g(CommandMessage.COMMAND_BASE, i2, i3, this);
                    this.f14270J = MomoCodec.MomoCodecState.START;
                    this.f14268H.f203837b = true;
                    break;
                case 101:
                    this.f14269I.m131787l("STOPED");
                    mo19735d2();
                    this.f14270J = MomoCodec.MomoCodecState.STOP;
                    ii70.m136344d().m136348c("Pipeline_Flow_pip->MOMO", " MEDIA_RECORDER_STOPED");
                    this.f124834J1.mo128349g(CommandMessage.COMMAND_REGISTER, i2, i3, this);
                    break;
                case 102:
                    this.f14269I.m131787l("PUBLISHING");
                    ii70.m136344d().m136348c("Pipeline_Flow_pip->MOMO", " MEDIA_RECORDER_PUBLISHING");
                    this.f124834J1.mo128349g(CommandMessage.COMMAND_SET_ALIAS, i2, i3, this);
                    mo19732c2();
                    m19731b2();
                    zmx zmxVar = this.f14268H;
                    if (zmxVar.f203840c == 0) {
                        zmxVar.f203840c = System.currentTimeMillis();
                    }
                    ii70.m136344d().m136348c("Pipeline_Flow_pip->MOMO", "IJK 推流器 报告： MOMO_PUBLISHING, 此时进入双推模式");
                    break;
                case 103:
                    this.f124844O1 = true;
                    this.f14269I.m131798w(i2);
                    this.f124834J1.mo128349g(CommandMessage.COMMAND_SET_TAGS, i2, i3, this);
                    break;
                case 104:
                    this.f124834J1.mo128349g(CommandMessage.COMMAND_UNSET_TAGS, i2, i3, this);
                    break;
                case 105:
                    this.f124844O1 = false;
                    this.f14269I.m131799x(i2);
                    this.f124834J1.mo128349g(CommandMessage.COMMAND_GET_TAGS, i2, i3, this);
                    break;
                case 106:
                    this.f124834J1.mo128349g(CommandMessage.COMMAND_GET_ALIAS, i2, i3, this);
                    break;
                case 107:
                    this.f124834J1.mo128349g(CommandMessage.COMMAND_UNSET_ALIAS, i2, i3, this);
                    break;
                case 108:
                    this.f14269I.m131787l("PUBLISHED");
                    this.f124834J1.mo128349g(CommandMessage.COMMAND_CLEAR_ALL_NOTIFICATION, i2, i3, this);
                    ii70.m136344d().m136348c("Pipeline_Flow_pip->MOMO", "IJK 推流器 报告： MOMO_PUBLISHED, 此时 IJK 已经推流 5 秒钟 推流成功，此时应该结束连麦推流");
                    break;
                case 109:
                    short s = (short) ((i2 >> 16) & j6f.COLOR_SPACE_UNCALIBRATED);
                    short s2 = (short) (i2 & j6f.COLOR_SPACE_UNCALIBRATED);
                    this.f14269I.m131797v(s * 23, s2 * 23, s - s2, ((short) ((i3 >> 16) & j6f.COLOR_SPACE_UNCALIBRATED)) - ((short) (i3 & j6f.COLOR_SPACE_UNCALIBRATED)));
                    break;
            }
        } else {
            this.f124834J1.mo128349g(CommandMessage.COMMAND_SET_PUSH_TIME, i2, i3, this);
        }
        if (i != 100 || (ijkWriter = this.f124868l1) == null) {
            return;
        }
        ijkWriter.notifyPrepared();
        if (this.f118163U0 != null) {
            ii70.m136344d().m136348c("Pipeline_Flow_pip->MOMO", "start Record writeAudioExtradata: mAudioHeader len " + this.f118163U0.limit() + ";isReadyToWrite:");
            IjkWriter ijkWriter2 = this.f124868l1;
            ByteBuffer byteBuffer = this.f118163U0;
            ijkWriter2.writeAudioExtradata(byteBuffer, (long) byteBuffer.limit());
        } else if (this.f118165V0 != null) {
            ii70.m136344d().m136348c("Pipeline_Flow_pip->MOMO", "start Record writeAudioExtradata: mSoftAudioHeader len " + this.f118165V0.limit() + ";isReadyToWrite:");
            IjkWriter ijkWriter3 = this.f124868l1;
            ByteBuffer byteBuffer2 = this.f118165V0;
            ijkWriter3.writeAudioExtradata(byteBuffer2, (long) byteBuffer2.limit());
        }
        if (this.f124874o1 != null) {
            ii70.m136344d().m136348c("Pipeline_Flow_pip->MOMO", "start Record writeVideoExtradata: mVideoExtraData len " + this.f124874o1.limit() + ";isReadyToWrite:" + this.f124876p1);
            IjkWriter ijkWriter4 = this.f124868l1;
            ByteBuffer byteBuffer3 = this.f124874o1;
            ijkWriter4.writeVideoExtradata(byteBuffer3, (long) byteBuffer3.limit());
        } else if (this.f118167W0 != null) {
            ii70.m136344d().m136348c("Pipeline_Flow_pip->MOMO", "start Record writeVideoExtradata: mSoftVideoHeader len " + this.f118167W0.limit() + ";isReadyToWrite:");
            IjkWriter ijkWriter5 = this.f124868l1;
            ByteBuffer byteBuffer4 = this.f118167W0;
            ijkWriter5.writeVideoExtradata(byteBuffer4, (long) byteBuffer4.limit());
        }
        this.f124876p1 = true;
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyRecording() {
        ii70.m136344d().m136348c("Pipeline_Flow_pip->MOMO", "notifyRecording !##########################");
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: o0 */
    public long mo20034o0() {
        IjkWriter ijkWriter = this.f124868l1;
        if (ijkWriter != null) {
            return ijkWriter.getVideoPts();
        }
        return 0L;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: o1 */
    public boolean mo19667o1(ByteBuffer byteBuffer) {
        return false;
    }

    @Override // p149l.ccj
    public void onDrawFrame() {
        super.onDrawFrame();
        this.f124896z1++;
    }

    @Override // p149l.yt10
    /* JADX INFO: renamed from: p0 */
    public boolean mo19763p0(ByteBuffer byteBuffer) {
        return m147490L4(byteBuffer, 2);
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: p1 */
    public int mo20036p1() {
        return getVideoWidth();
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: q1 */
    public long mo20038q1() {
        IjkWriter ijkWriter;
        return (!this.f118171Y0 || (ijkWriter = this.f124868l1) == null) ? this.f124884t1 : ijkWriter.getPropertyLong(20012, 0L);
    }

    /* JADX INFO: renamed from: q4 */
    public void m147502q4(boolean z) {
        this.f14268H.f203824V = z ? 1L : 0L;
        this.f14269I.m131787l("muteLocalAudioStream", Boolean.valueOf(z));
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: r0 */
    public long mo20041r0() {
        long propertyLong;
        long propertyLong2;
        IjkWriter ijkWriter = this.f124868l1;
        if (ijkWriter == null) {
            return 0L;
        }
        if (this.f118171Y0) {
            propertyLong = this.f124894y1;
            propertyLong2 = this.f14268H.f203834a;
        } else {
            propertyLong = ijkWriter.getPropertyLong(20016, 0L);
            propertyLong2 = this.f124868l1.getPropertyLong(ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME, 0L);
            if (propertyLong == 0 || propertyLong2 == 0) {
                propertyLong = this.f124894y1;
                propertyLong2 = this.f14268H.f203834a;
            }
        }
        long j = propertyLong - propertyLong2;
        if (j < 0) {
            return 0L;
        }
        return j;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: s0 */
    public int mo20044s0() {
        zmx zmxVar = this.f14268H;
        if (zmxVar != null) {
            return (int) zmxVar.f203830Y;
        }
        return 0;
    }

    @Override // p149l.yt10
    /* JADX INFO: renamed from: t1 */
    public boolean mo19764t1(ByteBuffer byteBuffer, long j) {
        ii70.m136344d().m136348c("Pipeline_Flow_pip->MOMO", "  writeAudioExtradata: len " + j + ";isReadyToWrite:" + this.f124876p1);
        if (!this.f124876p1) {
            this.f118165V0 = byteBuffer;
            return false;
        }
        IjkWriter ijkWriter = this.f124868l1;
        if (ijkWriter == null) {
            return true;
        }
        ijkWriter.writeAudioExtradata(byteBuffer, j);
        return true;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: u0 */
    public long mo20047u0() {
        IjkWriter ijkWriter = this.f124868l1;
        if (ijkWriter != null) {
            return ijkWriter.getPropertyLong(20003, 0L);
        }
        return 0L;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: u1 */
    public long mo20048u1() {
        IjkWriter ijkWriter = this.f124868l1;
        if (ijkWriter != null) {
            return ijkWriter.getPropertyLong(20007, 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: u4 */
    public void m147503u4() {
        this.f124842N1 = System.nanoTime() / 1000;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: w1 */
    public String mo20052w1() {
        return "M";
    }

    @Override // p149l.yt10
    @RequiresApi(api = 16)
    /* JADX INFO: renamed from: x0 */
    public int mo19765x0(MediaFormat mediaFormat, int i) {
        IjkWriter ijkWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        IjkWriter ijkWriter2;
        int iM141702K2 = m141702K2(mediaFormat, i);
        ii70.m136344d().m136348c("Pipeline_Flow_pip->MOMO", "addMediaTrack" + i);
        if (iM141702K2 == 1) {
            ByteBuffer byteBuffer3 = this.f118163U0;
            if (byteBuffer3 != null) {
                byteBuffer3.rewind();
                ii70.m136344d().m136348c("Pipeline_Flow_pip->MOMO", "  writeAudioExtradata: len " + this.f118163U0.limit() + ";isReadyToWrite:" + this.f124876p1);
                if (this.f124876p1 && (ijkWriter2 = this.f124868l1) != null) {
                    ByteBuffer byteBuffer4 = this.f118163U0;
                    ijkWriter2.writeAudioExtradata(byteBuffer4, byteBuffer4.limit());
                }
                this.f118163U0.rewind();
                return iM141702K2;
            }
        } else if (iM141702K2 == 2) {
            ByteBuffer byteBuffer5 = this.f118157R0;
            int iLimit = byteBuffer5 != null ? byteBuffer5.limit() : 0;
            ByteBuffer byteBuffer6 = this.f118156Q0;
            int iLimit2 = byteBuffer6 != null ? byteBuffer6.limit() : 0;
            ByteBuffer byteBuffer7 = this.f118155P0;
            int iLimit3 = (byteBuffer7 != null ? byteBuffer7.limit() : 0) + iLimit2 + iLimit;
            if (iLimit3 != 0) {
                ByteBuffer byteBuffer8 = this.f124874o1;
                if (byteBuffer8 != null) {
                    byteBuffer8.clear();
                    this.f124874o1 = null;
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iLimit3);
                this.f124874o1 = byteBufferAllocate;
                if (byteBufferAllocate != null) {
                    byteBufferAllocate.rewind();
                    this.f124874o1.position(0);
                    ByteBuffer byteBuffer9 = this.f118157R0;
                    if (byteBuffer9 != null) {
                        byteBuffer9.rewind();
                        this.f124874o1.put(this.f118157R0.array());
                        this.f118157R0.rewind();
                    } else if (this.f118156Q0 != null && (byteBuffer2 = this.f118155P0) != null) {
                        byteBuffer2.rewind();
                        this.f118156Q0.rewind();
                        this.f124874o1.put(this.f118156Q0.array());
                        this.f124874o1.put(this.f118155P0.array());
                        this.f118155P0.rewind();
                        this.f118156Q0.rewind();
                    }
                    this.f124874o1.rewind();
                    ii70.m136344d().m136348c("Pipeline_Flow_pip->MOMO", "  writeVideoExtradata: len " + this.f124874o1.limit() + ";isReadyToWrite:" + this.f124876p1);
                }
                if (this.f124876p1 && (ijkWriter = this.f124868l1) != null && (byteBuffer = this.f124874o1) != null) {
                    ijkWriter.writeVideoExtradata(byteBuffer, byteBuffer.limit());
                }
            }
        }
        return iM141702K2;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: x1 */
    public long mo20054x1() {
        return this.f124816A1 * 1024;
    }

    /* JADX INFO: renamed from: x4 */
    public void m147504x4() {
        if (this.f124842N1 != 0) {
            this.f124840M1 += (System.nanoTime() / 1000) - this.f124842N1;
            this.f124842N1 = 0L;
        }
    }

    @Override // p149l.yt10
    /* JADX INFO: renamed from: z0 */
    public boolean mo19766z0(ByteBuffer byteBuffer, long j) {
        ii70.m136344d().m136348c("Pipeline_Flow_pip->MOMO", "  writeVideoExtradata: len " + j + ";isReadyToWrite:" + this.f124876p1);
        if (!this.f124876p1) {
            this.f118167W0 = byteBuffer;
            return false;
        }
        IjkWriter ijkWriter = this.f124868l1;
        if (ijkWriter == null) {
            return true;
        }
        ijkWriter.writeVideoExtradata(byteBuffer, j);
        return true;
    }

    /* JADX INFO: renamed from: z4 */
    public void m147505z4(int i) {
        this.f14268H.f203858i = i;
    }

    /* JADX INFO: renamed from: l.kw00$e */
    public class C18097e implements ExtAudioWrapper.InterfaceC4108i {
        private C18097e() {
        }

        @Override // com.momo.piplinemomoext.input.audio.ExtAudioWrapper.InterfaceC4108i
        public int getStreamerType() {
            return 0;
        }

        @Override // com.momo.piplinemomoext.input.audio.ExtAudioWrapper.InterfaceC4108i
        /* JADX INFO: renamed from: b */
        public void mo20061b() {
        }

        @Override // com.momo.piplinemomoext.input.audio.ExtAudioWrapper.InterfaceC4108i
        /* JADX INFO: renamed from: a */
        public void mo20060a(String str) {
        }
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: A */
    public void mo19646A() {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: C0 */
    public void mo19647C0() {
    }

    @Override // p149l.jix
    /* JADX INFO: renamed from: E2 */
    public yt10 mo19752E2() {
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
    public void mo19666o() {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void setSourceSucess() {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void stopSurroundMusic() {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: C1 */
    public void mo19648C1(String str) {
    }

    @Override // p149l.yt10
    /* JADX INFO: renamed from: H1 */
    public void mo19754H1(int i) {
    }

    @Override // p149l.yt10
    /* JADX INFO: renamed from: W */
    public void mo19760W(ByteBuffer byteBuffer) {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyEnableExtralAudio(boolean z) {
    }

    @Override // p149l.yt10
    /* JADX INFO: renamed from: f0 */
    public void mo19761f0(ByteBuffer byteBuffer, long j) {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: l0 */
    public void mo19664l0(vlw vlwVar, EGLContext eGLContext) {
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
    public void mo19668p(String str, int i) {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void setStreamerCaptureType(int i, int i2) {
    }

    @Override // p149l.jix, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: y */
    public void mo19671y(int i, int i2) {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyEffectSet(int i, int i2, float f) {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void startSurroundMusic(String str, int i, long j) {
    }
}
