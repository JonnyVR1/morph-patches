package p149l;

import android.content.Context;
import android.media.MediaFormat;
import android.opengl.EGLContext;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import com.core.glcore.util.Log4Cam;
import com.momo.pipline.MomoInterface.MomoPipeline;
import com.momo.pipline.codec.MediaBaseCodecFilter;
import com.momo.voaac.VoAACEncoder;
import com.momo.x264.x264sdk;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import com.tencent.connect.common.Constants;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class jix extends MediaBaseCodecFilter {

    /* JADX INFO: renamed from: k1 */
    public static int f118143k1 = 2048;

    /* JADX INFO: renamed from: E0 */
    private boolean f118144E0;

    /* JADX INFO: renamed from: F0 */
    protected boolean f118145F0;

    /* JADX INFO: renamed from: G0 */
    private Object f118146G0;

    /* JADX INFO: renamed from: H0 */
    protected boolean f118147H0;

    /* JADX INFO: renamed from: I0 */
    private C17792a f118148I0;

    /* JADX INFO: renamed from: J0 */
    private C17794c f118149J0;

    /* JADX INFO: renamed from: K0 */
    private C17795d f118150K0;

    /* JADX INFO: renamed from: L0 */
    private C17793b f118151L0;

    /* JADX INFO: renamed from: M0 */
    private LinkedList<ByteBuffer> f118152M0;

    /* JADX INFO: renamed from: N0 */
    private LinkedList<ByteBuffer> f118153N0;

    /* JADX INFO: renamed from: O0 */
    private LinkedList<mpd0> f118154O0;

    /* JADX INFO: renamed from: P0 */
    protected ByteBuffer f118155P0;

    /* JADX INFO: renamed from: Q0 */
    protected ByteBuffer f118156Q0;

    /* JADX INFO: renamed from: R0 */
    protected ByteBuffer f118157R0;

    /* JADX INFO: renamed from: S */
    private qjx f118158S;

    /* JADX INFO: renamed from: S0 */
    protected ByteBuffer f118159S0;

    /* JADX INFO: renamed from: T */
    private final String f118160T;

    /* JADX INFO: renamed from: T0 */
    protected ByteBuffer f118161T0;

    /* JADX INFO: renamed from: U */
    public boolean f118162U;

    /* JADX INFO: renamed from: U0 */
    protected ByteBuffer f118163U0;

    /* JADX INFO: renamed from: V */
    private yt10 f118164V;

    /* JADX INFO: renamed from: V0 */
    protected ByteBuffer f118165V0;

    /* JADX INFO: renamed from: W */
    private Object f118166W;

    /* JADX INFO: renamed from: W0 */
    protected ByteBuffer f118167W0;

    /* JADX INFO: renamed from: X */
    private Object f118168X;

    /* JADX INFO: renamed from: X0 */
    public boolean f118169X0;

    /* JADX INFO: renamed from: Y */
    private Object f118170Y;

    /* JADX INFO: renamed from: Y0 */
    public boolean f118171Y0;

    /* JADX INFO: renamed from: Z */
    protected boolean f118172Z;

    /* JADX INFO: renamed from: Z0 */
    protected long f118173Z0;

    /* JADX INFO: renamed from: a1 */
    byte[] f118174a1;

    /* JADX INFO: renamed from: b1 */
    byte[] f118175b1;

    /* JADX INFO: renamed from: c1 */
    byte[] f118176c1;

    /* JADX INFO: renamed from: d1 */
    String f118177d1;

    /* JADX INFO: renamed from: e1 */
    protected String f118178e1;

    /* JADX INFO: renamed from: f1 */
    protected boolean f118179f1;

    /* JADX INFO: renamed from: g1 */
    private final String f118180g1;

    /* JADX INFO: renamed from: h1 */
    private final String f118181h1;

    /* JADX INFO: renamed from: i1 */
    vlw f118182i1;

    /* JADX INFO: renamed from: j1 */
    private x264sdk f118183j1;

    /* JADX INFO: renamed from: k0 */
    protected int f118184k0;

    /* JADX INFO: renamed from: p0 */
    protected int f118185p0;

    /* JADX INFO: renamed from: l.jix$a */
    public class C17792a extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f118186a;

        /* JADX INFO: renamed from: b */
        private boolean f118187b;

        /* JADX INFO: renamed from: c */
        private x264sdk.listener f118188c;

        /* JADX INFO: renamed from: d */
        private x264sdk f118189d;

        /* JADX INFO: renamed from: e */
        private ByteBuffer f118190e;

        /* JADX INFO: renamed from: l.jix$a$a */
        public class a implements x264sdk.listener {
            public a() {
            }

            @Override // com.momo.x264.x264sdk.listener
            public void h264data(byte[] bArr, int i) {
                int i2;
                System.currentTimeMillis();
                byte b = bArr[4];
                int i3 = b & 96;
                int i4 = b & 31;
                ii70.m136344d().m136346a("MediaCodecFilter", "----h264data----len:" + i + ";idc:" + i3 + ";naltype:" + i4 + ":date:" + ((int) bArr[0]) + ":" + ((int) bArr[1]) + ":" + ((int) bArr[2]) + ":" + ((int) bArr[3]) + ":" + ((int) bArr[4]));
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
                byteBufferAllocate.position(0);
                byteBufferAllocate.put(bArr);
                if (!C17792a.this.f118187b && i4 == 7) {
                    int i5 = 0;
                    while (true) {
                        i2 = i - 4;
                        if (i5 >= i2) {
                            i5 = 0;
                            break;
                        } else if (bArr[i5] == 0 && bArr[i5 + 1] == 0 && bArr[i5 + 2] == 0 && bArr[i5 + 3] == 1 && (bArr[i5 + 4] & 31) == 8) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                    int i6 = i5 + 4;
                    while (true) {
                        if (i6 >= i2) {
                            i6 = 0;
                            break;
                        } else if (bArr[i6] == 0 && bArr[i6 + 1] == 0 && bArr[i6 + 2] == 1) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i6);
                    byteBufferAllocate2.put(bArr, 0, i6);
                    if (jix.this.f118164V != null) {
                        jix.this.f118164V.mo19761f0(byteBufferAllocate2, i6);
                    }
                    C17792a.this.f118187b = true;
                }
                if (jix.this.f118164V == null || !C17792a.this.f118187b) {
                    return;
                }
                jix.this.f118164V.mo19760W(byteBufferAllocate);
            }
        }

        public C17792a(String str) {
            super(str);
            this.f118186a = false;
            this.f118187b = false;
            this.f118188c = new a();
            this.f118189d = null;
            this.f118190e = null;
            x264sdk x264sdkVar = new x264sdk(this.f118188c);
            this.f118189d = x264sdkVar;
            vlw vlwVar = jix.this.f118182i1;
            x264sdkVar.initEncode(vlwVar.f177156o, vlwVar.f177158p, 15, vlwVar.f177110I);
            ii70.m136344d().m136346a("MediaCodecFilter", "----x264data listener:width=" + jix.this.f118182i1.f177156o + "; height=" + jix.this.f118182i1.f177158p + ";bitrate=" + jix.this.f118182i1.f177110I);
        }

        /* JADX INFO: renamed from: c */
        public void m141710c() {
            this.f118186a = true;
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "ExternSoftCodecThread quit");
            try {
                join(3000L);
            } catch (Exception e) {
                interrupt();
                e.printStackTrace();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            x264sdk x264sdkVar;
            while (!Thread.interrupted() && !this.f118186a) {
                ByteBuffer byteBufferM141707T2 = jix.this.m141707T2();
                if (byteBufferM141707T2 != null && (x264sdkVar = this.f118189d) != null) {
                    x264sdkVar.PushOriStream(byteBufferM141707T2.array(), byteBufferM141707T2.limit(), 0L);
                }
            }
            synchronized (jix.this.f118168X) {
                try {
                    x264sdk x264sdkVar2 = this.f118189d;
                    if (x264sdkVar2 != null) {
                        x264sdkVar2.release();
                        this.f118189d = null;
                    }
                    if (jix.this.f118153N0 != null) {
                        jix.this.f118153N0.clear();
                        jix.this.f118153N0 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ii70 ii70VarM136344d = ii70.m136344d();
            StringBuilder sb = new StringBuilder("ExternSoftCodecThread end interrupted");
            sb.append(!Thread.interrupted());
            sb.append(" shouldQuit:");
            sb.append(this.f118186a);
            sb.append(" mIsRunning:");
            sb.append(jix.this.f118169X0);
            ii70VarM136344d.m136348c("Pipeline_Normal_pip->PIPLINE", sb.toString());
        }
    }

    /* JADX INFO: renamed from: l.jix$b */
    public class C17793b extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f118193a;

        /* JADX INFO: renamed from: b */
        private VoAACEncoder f118194b;

        /* JADX INFO: renamed from: c */
        private boolean f118195c;

        public C17793b(String str) {
            super(str);
            this.f118193a = false;
            this.f118194b = null;
            this.f118195c = false;
            VoAACEncoder voAACEncoder = new VoAACEncoder();
            this.f118194b = voAACEncoder;
            vlw vlwVar = jix.this.f118182i1;
            voAACEncoder.InitEncoder(vlwVar.f177117P, vlwVar.f177120S, (short) vlwVar.f177119R, (short) 0);
        }

        /* JADX INFO: renamed from: a */
        public void m141711a() {
            this.f118193a = true;
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "SoftAudioCodecThread quit");
            try {
                join();
            } catch (InterruptedException unused) {
                interrupt();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            byte[] bArr;
            while (true) {
                byte[] bArrEncData = null;
                if (Thread.interrupted() || this.f118193a) {
                    break;
                }
                mpd0 mpd0VarM141706S2 = jix.this.m141706S2();
                if (mpd0VarM141706S2 != null && jix.this.f118164V != null) {
                    VoAACEncoder voAACEncoder = this.f118194b;
                    if (voAACEncoder != null && (bArr = mpd0VarM141706S2.f135035a) != null) {
                        bArrEncData = voAACEncoder.EncData(bArr);
                    }
                    if (bArrEncData != null) {
                        if (jix.this.f118164V != null && !this.f118195c) {
                            jix.this.f118164V.mo19764t1(ByteBuffer.wrap(ztk.f204730a), ztk.f204730a.length);
                            this.f118195c = true;
                        }
                        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "Mp4MuxerWrapper writeSoftAudioSample ");
                        if (jix.this.f118164V != null) {
                            jix.this.f118164V.mo19755K0(ByteBuffer.wrap(bArrEncData));
                        }
                    }
                }
            }
            synchronized (jix.this.f118170Y) {
                try {
                    VoAACEncoder voAACEncoder2 = this.f118194b;
                    if (voAACEncoder2 != null) {
                        voAACEncoder2.release();
                        this.f118194b = null;
                    }
                    if (jix.this.f118154O0 != null) {
                        jix.this.f118154O0.clear();
                        jix.this.f118154O0 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "SoftAudioCodecThread end interrupted" + (true ^ Thread.interrupted()) + " AudioshouldQuit:" + this.f118193a + " AudioIsRunning:" + jix.this.f118169X0);
        }
    }

    /* JADX INFO: renamed from: l.jix$c */
    public class C17794c extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f118197a;

        /* JADX INFO: renamed from: b */
        private boolean f118198b;

        /* JADX INFO: renamed from: c */
        private x264sdk.listener f118199c;

        /* JADX INFO: renamed from: d */
        private x264sdk f118200d;

        /* JADX INFO: renamed from: e */
        private ByteBuffer f118201e;

        /* JADX INFO: renamed from: l.jix$c$a */
        public class a implements x264sdk.listener {
            public a() {
            }

            @Override // com.momo.x264.x264sdk.listener
            public void h264data(byte[] bArr, int i) {
                int i2;
                System.currentTimeMillis();
                byte b = bArr[4];
                int i3 = b & 96;
                int i4 = b & 31;
                ii70.m136344d().m136346a("MediaCodecFilter", "----h264data----len:" + i + ";idc:" + i3 + ";naltype:" + i4 + ":date:" + ((int) bArr[0]) + ":" + ((int) bArr[1]) + ":" + ((int) bArr[2]) + ":" + ((int) bArr[3]) + ":" + ((int) bArr[4]));
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
                byteBufferAllocate.position(0);
                byteBufferAllocate.put(bArr);
                if (!C17794c.this.f118198b && i4 == 7) {
                    int i5 = 0;
                    while (true) {
                        i2 = i - 4;
                        if (i5 >= i2) {
                            i5 = 0;
                            break;
                        } else if (bArr[i5] == 0 && bArr[i5 + 1] == 0 && bArr[i5 + 2] == 0 && bArr[i5 + 3] == 1 && (bArr[i5 + 4] & 31) == 8) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                    int i6 = i5 + 4;
                    while (true) {
                        if (i6 >= i2) {
                            i6 = 0;
                            break;
                        } else if (bArr[i6] == 0 && bArr[i6 + 1] == 0 && bArr[i6 + 2] == 1) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i6);
                    byteBufferAllocate2.put(bArr, 0, i6);
                    if (jix.this.f118164V != null) {
                        jix.this.f118164V.mo19766z0(byteBufferAllocate2, i6);
                    }
                    C17794c.this.f118198b = true;
                }
                if (jix.this.f118164V == null || !C17794c.this.f118198b) {
                    return;
                }
                jix.this.f118164V.mo19763p0(byteBufferAllocate);
            }
        }

        public C17794c(String str) {
            super(str);
            this.f118197a = false;
            this.f118198b = false;
            this.f118199c = new a();
            this.f118200d = null;
            this.f118201e = null;
            x264sdk x264sdkVar = new x264sdk(this.f118199c);
            this.f118200d = x264sdkVar;
            vlw vlwVar = jix.this.f118182i1;
            x264sdkVar.initEncode(vlwVar.f177152m, vlwVar.f177154n, 15, vlwVar.f177109H);
            ii70.m136344d().m136346a("MediaCodecFilter", "----h264data listener:width=" + jix.this.f118182i1.f177152m + "; height=" + jix.this.f118182i1.f177154n + ";bitrate=" + jix.this.f118182i1.f177109H);
        }

        /* JADX INFO: renamed from: c */
        public void m141714c() {
            this.f118197a = true;
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "SoftCodecThread quit");
            try {
                join(3000L);
            } catch (Exception e) {
                interrupt();
                e.printStackTrace();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            x264sdk x264sdkVar;
            while (!Thread.interrupted() && !this.f118197a) {
                ByteBuffer byteBufferM141705R2 = jix.this.m141705R2();
                if (byteBufferM141705R2 != null && (x264sdkVar = this.f118200d) != null) {
                    x264sdkVar.PushOriStream(byteBufferM141705R2.array(), byteBufferM141705R2.limit(), 0L);
                }
            }
            synchronized (jix.this.f118166W) {
                try {
                    x264sdk x264sdkVar2 = this.f118200d;
                    if (x264sdkVar2 != null) {
                        x264sdkVar2.release();
                        this.f118200d = null;
                    }
                    if (jix.this.f118152M0 != null) {
                        jix.this.f118152M0.clear();
                        jix.this.f118152M0 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ii70 ii70VarM136344d = ii70.m136344d();
            StringBuilder sb = new StringBuilder("SoftCodecThread end interrupted");
            sb.append(!Thread.interrupted());
            sb.append(" shouldQuit:");
            sb.append(this.f118197a);
            sb.append(" mIsRunning:");
            sb.append(jix.this.f118169X0);
            ii70VarM136344d.m136348c("Pipeline_Normal_pip->PIPLINE", sb.toString());
        }
    }

    /* JADX INFO: renamed from: l.jix$d */
    public class C17795d extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f118204a;

        /* JADX INFO: renamed from: b */
        private boolean f118205b;

        /* JADX INFO: renamed from: c */
        private long f118206c;

        public C17795d(String str) {
            super(str);
            this.f118204a = false;
            this.f118205b = false;
            this.f118206c = 0L;
        }

        /* JADX INFO: renamed from: a */
        public void m141715a() {
            this.f118204a = true;
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "SoftCodecThread quit");
            try {
                join();
            } catch (InterruptedException unused) {
                interrupt();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!Thread.interrupted() && !this.f118204a) {
                if (jix.this.f118164V != null && !this.f118205b) {
                    jix.this.f118164V.mo19766z0(ByteBuffer.wrap(ztk.f204732c), ztk.f204732c.length);
                    this.f118205b = true;
                }
                try {
                    Thread.sleep(66L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (this.f118206c % 15 != 0) {
                    if (ztk.f204735f == null) {
                        vlw vlwVar = jix.this.f118182i1;
                        ztk.f204735f = new byte[((vlwVar.f177152m * vlwVar.f177154n) * 3) / 2];
                    }
                    byte[] bArr = ztk.f204735f;
                    if (bArr != null) {
                        jix.this.mo19667o1(ByteBuffer.wrap(bArr));
                    }
                    if (jix.this.f118164V != null) {
                        jix.this.f118164V.mo19763p0(ByteBuffer.wrap(ztk.f204733d));
                    }
                } else if (jix.this.f118164V != null) {
                    jix.this.f118164V.mo19763p0(ByteBuffer.wrap(ztk.f204734e));
                }
                this.f118206c++;
            }
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "SoftFakeCodecThread end interrupted" + (true ^ Thread.interrupted()) + " shouldQuit:" + this.f118204a + " mIsRunning:" + jix.this.f118169X0);
        }
    }

    public jix(Context context) {
        super(context == null ? g16.f100119a : context);
        this.f118158S = null;
        this.f118160T = "MediaCodecFilter";
        this.f118162U = true;
        this.f118168X = new Object();
        this.f118172Z = false;
        this.f118184k0 = 1;
        this.f118185p0 = -1;
        this.f118144E0 = false;
        this.f118145F0 = false;
        this.f118146G0 = new Object();
        this.f118150K0 = null;
        this.f118152M0 = new LinkedList<>();
        this.f118153N0 = new LinkedList<>();
        this.f118154O0 = new LinkedList<>();
        this.f118169X0 = false;
        this.f118171Y0 = false;
        this.f118173Z0 = System.currentTimeMillis();
        this.f118174a1 = new byte[]{0, 0, 0, 1, 6, 100, 46};
        this.f118175b1 = new byte[]{0, 0, 0, 1, 78, 1, 5, 46, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        this.f118176c1 = new byte[]{0, 0, 0, 1};
        this.f118177d1 = "momoa9a427d1andr22";
        this.f118178e1 = WeJson.EMPTY_MAP;
        this.f118179f1 = true;
        this.f118180g1 = YtVideoEncoder.MIME_TYPE;
        this.f118181h1 = "video/hevc";
        this.f118183j1 = null;
    }

    /* JADX INFO: renamed from: F2 */
    private int m141681F2(int i) {
        switch (i) {
            case 256:
                return fjx.m121638R().m121732e();
            case 257:
                return fjx.m121638R().m121744h();
            case 258:
                return fjx.m121638R().m121728d();
            case 259:
                return fjx.m121638R().m121740g();
            case 260:
                return fjx.m121638R().m121736f();
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: H2 */
    private String m141682H2(int i) {
        switch (i) {
            case 256:
                return "ijk";
            case 257:
                return "weila";
            case 258:
                return "agora";
            case 259:
                return "tx";
            case 260:
                return "mmrtc";
            default:
                return "000";
        }
    }

    /* JADX INFO: renamed from: L2 */
    private void m141683L2(mpd0 mpd0Var) {
        synchronized (this.f118170Y) {
            try {
                LinkedList<mpd0> linkedList = this.f118154O0;
                if (linkedList != null) {
                    linkedList.offerLast(mpd0Var);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: M2 */
    private void m141684M2(ByteBuffer byteBuffer) {
        synchronized (this.f118166W) {
            try {
                LinkedList<ByteBuffer> linkedList = this.f118152M0;
                if (linkedList != null) {
                    linkedList.offerLast(byteBuffer);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: N2 */
    private void m141685N2(ByteBuffer byteBuffer) {
        synchronized (this.f118168X) {
            try {
                try {
                    LinkedList<ByteBuffer> linkedList = this.f118153N0;
                    if (linkedList != null) {
                        if (linkedList.size() > 2) {
                            this.f118153N0.clear();
                        }
                        this.f118153N0.offerLast(byteBuffer);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void release() {
        if (this.f118164V != null) {
            ii70.m136344d().m136348c("MediaCodecFilter", "mMuxerWrapper stop ##############");
            this.f118164V.mo19762k1();
        }
        if (this.f118158S != null) {
            ii70.m136344d().m136348c("MediaCodecFilter", "mMediaEncoder stop ##############");
            this.f118158S.m175046h();
            this.f118158S = null;
        }
        C17794c c17794c = this.f118149J0;
        if (c17794c != null) {
            c17794c.m141714c();
            this.f118149J0 = null;
        }
        C17792a c17792a = this.f118148I0;
        if (c17792a != null) {
            c17792a.m141710c();
            this.f118148I0 = null;
        }
        C17795d c17795d = this.f118150K0;
        if (c17795d != null) {
            c17795d.m141715a();
            this.f118150K0 = null;
        }
        C17793b c17793b = this.f118151L0;
        if (c17793b != null) {
            c17793b.m141711a();
            this.f118151L0 = null;
        }
        if (this.f118164V != null) {
            ii70.m136344d().m136348c("MediaCodecFilter", "mMuxerWrapper stop ##############");
            this.f118164V.mo19762k1();
            this.f118164V = null;
        }
        ByteBuffer byteBuffer = this.f118155P0;
        if (byteBuffer != null) {
            byteBuffer.clear();
            this.f118155P0 = null;
        }
        ByteBuffer byteBuffer2 = this.f118156Q0;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
            this.f118156Q0 = null;
        }
        ByteBuffer byteBuffer3 = this.f118157R0;
        if (byteBuffer3 != null) {
            byteBuffer3.clear();
            this.f118157R0 = null;
        }
        ByteBuffer byteBuffer4 = this.f118159S0;
        if (byteBuffer4 != null) {
            byteBuffer4.clear();
            this.f118159S0 = null;
        }
        ByteBuffer byteBuffer5 = this.f118161T0;
        if (byteBuffer5 != null) {
            byteBuffer5.clear();
            this.f118161T0 = null;
        }
        ByteBuffer byteBuffer6 = this.f118163U0;
        if (byteBuffer6 != null) {
            byteBuffer6.clear();
            this.f118163U0 = null;
        }
    }

    /* JADX INFO: renamed from: A2 */
    public ByteBuffer m141696A2(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        int i3;
        byte b;
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        System.currentTimeMillis();
        if ((bArr[4] & 31) != 7) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
            byteBufferAllocate.position(0);
            byteBufferAllocate.put(bArr, 0, i);
            return byteBufferAllocate;
        }
        int i4 = 0;
        while (true) {
            i3 = i - 4;
            if (i4 >= i3) {
                i4 = 0;
                break;
            }
            if (bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 0 && bArr[i4 + 3] == 1 && (bArr[i4 + 4] & 31) == 8) {
                if (i2 != 0) {
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i4);
                    this.f118161T0 = byteBufferAllocate2;
                    byteBufferAllocate2.put(bArr, 0, i4);
                    break;
                }
                ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(i4);
                this.f118156Q0 = byteBufferAllocate3;
                byteBufferAllocate3.put(bArr, 0, i4);
                break;
            }
            i4++;
        }
        int i5 = i4 + 4;
        int i6 = 0;
        while (true) {
            if (i5 >= i3) {
                i5 = 0;
                break;
            }
            if (bArr[i5] == 0 && bArr[i5 + 1] == 0 && bArr[i5 + 2] == 0 && (b = bArr[i5 + 3]) == 1) {
                if ((b & 31) != 6) {
                    if (i6 != 0) {
                        break;
                    }
                    if (i2 == 0) {
                        if (this.f118155P0 == null) {
                            int i7 = i5 - i4;
                            ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(i7);
                            this.f118155P0 = byteBufferAllocate4;
                            byteBufferAllocate4.put(bArr, i4, i7);
                        }
                    } else if (this.f118159S0 == null) {
                        int i8 = i5 - i4;
                        ByteBuffer byteBufferAllocate5 = ByteBuffer.allocate(i8);
                        this.f118159S0 = byteBufferAllocate5;
                        byteBufferAllocate5.put(bArr, i4, i8);
                    }
                    i6 = i5;
                    break;
                }
                if (i6 == 0) {
                    if (i2 == 0) {
                        if (this.f118155P0 == null) {
                            int i9 = i5 - i4;
                            ByteBuffer byteBufferAllocate6 = ByteBuffer.allocate(i9);
                            this.f118155P0 = byteBufferAllocate6;
                            byteBufferAllocate6.put(bArr, i4, i9);
                        }
                    } else if (this.f118159S0 == null) {
                        int i10 = i5 - i4;
                        ByteBuffer byteBufferAllocate7 = ByteBuffer.allocate(i10);
                        this.f118159S0 = byteBufferAllocate7;
                        byteBufferAllocate7.put(bArr, i4, i10);
                    }
                    i6 = i5;
                }
            }
            i5++;
        }
        byte[] bArrM141698C2 = m141698C2(this.f118179f1);
        ByteBuffer byteBufferAllocate8 = ByteBuffer.allocate(bArrM141698C2 != null ? bArrM141698C2.length + i : i);
        byteBufferAllocate8.position(0);
        byteBufferAllocate8.put(bArr, 0, i6);
        ii70.m136344d().m136348c("ContentValues", "keyframe put sei");
        byteBufferAllocate8.put(bArrM141698C2, 0, bArrM141698C2.length);
        byteBufferAllocate8.put(bArr, i5, i - i5);
        ii70.m136344d().m136348c("ContentValues", "merge keyframe compile");
        return byteBufferAllocate8;
    }

    /* JADX INFO: renamed from: B2 */
    public ByteBuffer m141697B2(ByteBuffer byteBuffer, int i, boolean z) {
        int i2;
        int i3;
        byte[] bArrM141699D2;
        int length = i;
        byte[] bArr = new byte[length];
        byteBuffer.get(bArr);
        long jCurrentTimeMillis = System.currentTimeMillis();
        ByteBuffer byteBuffer2 = this.f118157R0;
        int iLimit = byteBuffer2 != null ? byteBuffer2.limit() : 0;
        boolean z2 = iLimit != 0;
        if (z2) {
            i2 = (bArr[4] & 126) >> 1;
            n8c.m158483a("ContentValues", "decorateVideoBuffer isHevc " + iLimit + " nalu_type " + i2 + " isKey " + z);
            i3 = 34;
        } else {
            i2 = bArr[4] & 31;
            n8c.m158483a("ContentValues", "decorateVideoBuffer isH264 " + iLimit + " nalu_type " + i2 + " isKey " + z);
            i3 = 7;
        }
        if (z) {
            ByteBuffer byteBuffer3 = this.f118156Q0;
            int iLimit2 = byteBuffer3 != null ? byteBuffer3.limit() : 0;
            ByteBuffer byteBuffer4 = this.f118155P0;
            int iLimit3 = byteBuffer.limit() + iLimit2 + (byteBuffer4 != null ? byteBuffer4.limit() : 0) + iLimit;
            byte[] bArrM141699D3 = m141699D2(this.f118179f1, z2);
            if (bArrM141699D3 != null) {
                iLimit3 += bArrM141699D3.length;
            }
            int i4 = iLimit3;
            bArrM141699D2 = bArrM141699D3;
            length = i4;
        } else if (jCurrentTimeMillis - this.f118173Z0 >= 1500) {
            bArrM141699D2 = m141699D2(this.f118179f1, z2);
            if (bArrM141699D2 != null) {
                length += bArrM141699D2.length;
            }
        } else {
            bArrM141699D2 = null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.position(0);
        if (z) {
            ByteBuffer byteBuffer5 = this.f118156Q0;
            if (byteBuffer5 != null) {
                byteBuffer5.rewind();
                byteBufferAllocate.put(this.f118156Q0.array());
            }
            ByteBuffer byteBuffer6 = this.f118155P0;
            if (byteBuffer6 != null) {
                byteBuffer6.rewind();
                byteBufferAllocate.put(this.f118155P0.array());
            }
            ByteBuffer byteBuffer7 = this.f118157R0;
            if (byteBuffer7 != null) {
                byteBuffer7.rewind();
                byteBufferAllocate.put(this.f118157R0.array());
            }
        }
        if (bArrM141699D2 != null && i2 != i3) {
            byteBufferAllocate.put(bArrM141699D2);
            this.f118173Z0 = jCurrentTimeMillis;
        }
        ByteBuffer byteBuffer8 = this.f118156Q0;
        if (byteBuffer8 != null) {
            byteBuffer8.rewind();
        }
        ByteBuffer byteBuffer9 = this.f118155P0;
        if (byteBuffer9 != null) {
            byteBuffer9.rewind();
        }
        ByteBuffer byteBuffer10 = this.f118157R0;
        if (byteBuffer10 != null) {
            byteBuffer10.rewind();
        }
        byteBufferAllocate.put(bArr);
        return byteBufferAllocate;
    }

    /* JADX INFO: renamed from: C2 */
    public byte[] m141698C2(boolean z) {
        return m141699D2(z, false);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX INFO: renamed from: D2 */
    public byte[] m141699D2(boolean z, boolean z2) {
        boolean z3;
        String str;
        JSONObject jSONObject = null;
        if (z2 || !z) {
            z3 = true;
        } else {
            if (this.f118183j1 == null) {
                this.f118183j1 = new x264sdk(null);
            }
            if (this.f118183j1.getEnabled()) {
                z3 = false;
            } else {
                z3 = true;
            }
        }
        String str2 = new String(z2 ? this.f118175b1 : this.f118174a1);
        try {
            JSONObject jSONObject2 = new JSONObject(this.f118178e1);
            if (jSONObject2.has(Constants.f57189TS)) {
                jSONObject2.remove(Constants.f57189TS);
            }
            jSONObject2.put(Constants.f57189TS, m19728Y1());
            jSONObject = jSONObject2;
        } catch (Exception unused) {
        }
        if (jSONObject != null) {
            this.f118178e1 = jSONObject.toString();
        }
        short length = (short) this.f118178e1.getBytes().length;
        ii70.m136344d().m136348c("ContentValues", "genSei len :" + ((int) length) + "");
        if (z3) {
            str = str2 + this.f118177d1 + this.f118178e1;
        } else {
            str = this.f118177d1 + this.f118178e1;
        }
        byte[] bytes = str.getBytes();
        if (!z3) {
            bytes[17] = (byte) (length & 255);
            bytes[16] = (byte) ((length >> 8) & 255);
            byte[] bArrGenSEI = this.f118183j1.GenSEI(bytes, length);
            String str3 = new String(bArrGenSEI);
            ii70.m136344d().m136348c("ContentValues", "seiSei: length=" + bArrGenSEI.length + "; sei:" + str3);
            return bArrGenSEI;
        }
        if (z2) {
            bytes[41] = (byte) (length & 255);
            bytes[40] = (byte) ((length >> 8) & 255);
            bytes[7] = (byte) (((short) (length + 33)) & 255);
            bytes[6] = 5;
            bytes[8] = 44;
            bytes[9] = -94;
            bytes[10] = -34;
            bytes[11] = 9;
            bytes[12] = -75;
            bytes[13] = 23;
            bytes[14] = 71;
            bytes[15] = -37;
            bytes[16] = -69;
            bytes[17] = 85;
            bytes[18] = -92;
            bytes[19] = -2;
            bytes[20] = 127;
            bytes[21] = -62;
            bytes[22] = -4;
            bytes[23] = 78;
        } else {
            bytes[24] = (byte) (length & 255);
            bytes[23] = (byte) ((length >> 8) & 255);
            bytes[6] = (byte) (((short) (length + 17)) & 255);
            bytes[5] = -27;
        }
        ii70.m136344d().m136348c("ContentValues", "seiSei: length=" + bytes.length + "sei:" + str);
        return bytes;
    }

    /* JADX INFO: renamed from: E2 */
    public abstract yt10 mo19752E2();

    /* JADX INFO: renamed from: G2 */
    public abstract qjx mo19753G2();

    /* JADX INFO: renamed from: I2 */
    public boolean m141700I2(ByteBuffer byteBuffer, int i) {
        byteBuffer.position(0);
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        byteBuffer.rewind();
        byte b = bArr[4];
        int i2 = b & 31;
        int i3 = (b & 126) >> 1;
        if (this.f118157R0 == null || i3 < 16 || i3 > 21) {
            return this.f118156Q0 != null && i2 == 5;
        }
        return true;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: J */
    public void mo19651J(String str) {
        this.f14269I.m131787l("momopusher setSei", str);
        this.f118178e1 = str;
    }

    /* JADX INFO: renamed from: J2 */
    public boolean m141701J2(ByteBuffer byteBuffer, int i) {
        byteBuffer.position(0);
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        byteBuffer.rewind();
        byte b = bArr[4];
        int i2 = b & 96;
        int i3 = b & 31;
        if (i2 != 0 || i3 != 6) {
            return i3 == 7;
        }
        ii70.m136344d().m136346a("MediaCodecFilter", "sei found !");
        return false;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: K1 */
    public void mo19652K1(mpd0 mpd0Var) {
        vlw vlwVar = this.f14281s;
        if (vlwVar != null && vlwVar.f177133c0) {
            if (this.f118169X0) {
                m141683L2(mpd0Var);
            }
        } else {
            qjx qjxVar = this.f118158S;
            if (qjxVar != null) {
                qjxVar.m175040a(mpd0Var);
            }
        }
    }

    @RequiresApi(api = 16)
    /* JADX INFO: renamed from: K2 */
    public int m141702K2(MediaFormat mediaFormat, int i) {
        if (mediaFormat == null || i < 1 || i > 2) {
            Log4Cam.m7323e("ContentValues", "Add media track error ! Invalid parameter ! format=" + mediaFormat + " and track=" + i);
            return -1;
        }
        if (mediaFormat.getString(IMediaFormat.KEY_MIME).contains("audio")) {
            this.f118163U0 = mediaFormat.getByteBuffer("csd-0");
            return 1;
        }
        if (mediaFormat.getString(IMediaFormat.KEY_MIME).contains(YtVideoEncoder.MIME_TYPE)) {
            this.f118156Q0 = mediaFormat.getByteBuffer("csd-0");
            this.f118155P0 = mediaFormat.getByteBuffer("csd-1");
            return 2;
        }
        if (!mediaFormat.getString(IMediaFormat.KEY_MIME).contains("video/hevc")) {
            return -1;
        }
        this.f118157R0 = mediaFormat.getByteBuffer("csd-0");
        return 2;
    }

    /* JADX INFO: renamed from: O2 */
    public void m141703O2(boolean z) {
        this.f118172Z = z;
        if (z) {
            this.f118184k0 = 2;
        } else {
            this.f118184k0 = 1;
        }
    }

    @RequiresApi(api = 19)
    /* JADX INFO: renamed from: P2 */
    public void mo141704P2(int i) {
        vlw vlwVar = this.f14281s;
        if (vlwVar != null) {
            vlwVar.f177109H = i;
        }
        qjx qjxVar = this.f118158S;
        if (qjxVar != null) {
            qjxVar.m175043e(i);
        }
    }

    /* JADX INFO: renamed from: Q2 */
    public void mo19757Q2() {
        yt10 yt10Var = this.f118164V;
        if (yt10Var != null) {
            yt10Var.mo19756O1();
        }
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    @RequiresApi(api = 18)
    /* JADX INFO: renamed from: R0 */
    public void mo19655R0(vlw vlwVar, EGLContext eGLContext) {
        yt10 yt10Var;
        super.mo19655R0(vlwVar, eGLContext);
        if (vlwVar.f182012A0 == MomoPipeline.DecodeType.SOFT_DECODE) {
            this.f118171Y0 = true;
        }
        this.f118182i1 = vlwVar;
        synchronized (this.f118146G0) {
            try {
                if (this.f118145F0 && !this.f118182i1.f182035X0) {
                    ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "startRecord error return 441");
                    return;
                }
                if (this.f118147H0 && (yt10Var = this.f118164V) != null && !this.f118171Y0) {
                    int iMo175045g = this.f118158S.mo175045g(yt10Var);
                    if (iMo175045g != 0) {
                        this.f14268H.f203901y0 = iMo175045g;
                        this.f118158S.m175046h();
                        this.f118164V = null;
                        this.f118158S = null;
                    }
                    ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "isPrepared:" + this.f118147H0 + " mMuxerWrapper:" + this.f118164V);
                    mo19757Q2();
                    return;
                }
                vlw vlwVar2 = this.f118182i1;
                int i = vlwVar2.f177152m;
                int i2 = vlwVar2.f177154n;
                int i3 = vlwVar.f182016E0;
                int i4 = vlwVar.f177109H;
                int i5 = vlwVar.f177117P;
                int i6 = vlwVar.f177119R;
                int i7 = vlwVar.f177120S;
                f118143k1 = i6 * 1024;
                if (this.f118164V == null) {
                    this.f118164V = mo19752E2();
                }
                if (this.f118171Y0) {
                    ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "startRecord softcodec");
                    this.f118166W = new Object();
                    this.f118170Y = new Object();
                    if (this.f118182i1.f177129a0) {
                        if (this.f118150K0 == null) {
                            C17795d c17795d = new C17795d("live-media-FSCodec");
                            this.f118150K0 = c17795d;
                            c17795d.start();
                        }
                        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "startRecord softcodec usefakevideocodec");
                    } else {
                        if (this.f118149J0 == null) {
                            C17794c c17794c = new C17794c("live-media-x264codec");
                            this.f118149J0 = c17794c;
                            c17794c.start();
                        }
                        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "startRecord softcodec usesoftvideocodec");
                    }
                    if (vlwVar.f177133c0) {
                        if (this.f118151L0 == null) {
                            C17793b c17793b = new C17793b("live-media-SACodec");
                            this.f118151L0 = c17793b;
                            c17793b.start();
                        }
                        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "startRecord softcodec usevoaac for aac");
                    } else {
                        if (this.f118158S == null) {
                            qjx qjxVarMo19753G2 = mo19753G2();
                            this.f118158S = qjxVarMo19753G2;
                            if (qjxVarMo19753G2 == null) {
                                return;
                            }
                            qjxVarMo19753G2.m175042d(i5, 16, i6, i7, f118143k1, 0);
                            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "startRecord softcodec usemediacodec audioSampleRate:" + i5 + ";audioChannels:" + i6 + ";audioBitrate:" + i7);
                            int iMo175045g2 = this.f118158S.mo175045g(this.f118164V);
                            if (iMo175045g2 != 0) {
                                this.f14268H.f203901y0 = iMo175045g2;
                                this.f118158S.m175046h();
                                this.f118164V = null;
                                this.f118158S = null;
                                return;
                            }
                        }
                        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "startRecord softcodec usemediacodec for aac");
                    }
                    mo19757Q2();
                } else {
                    ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "startRecord hardcodec");
                    if (this.f118158S == null) {
                        qjx qjxVarMo19753G3 = mo19753G2();
                        this.f118158S = qjxVarMo19753G3;
                        if (qjxVarMo19753G3 == null) {
                            return;
                        }
                        if (!this.f118172Z) {
                            if (this.f118182i1.f177129a0) {
                                if (this.f118150K0 == null) {
                                    C17795d c17795d2 = new C17795d("live-media-FSCodec");
                                    this.f118150K0 = c17795d2;
                                    c17795d2.start();
                                }
                                ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "startRecord hardcodec FakeSoftCodec");
                            } else {
                                qjxVarMo19753G3.m175044f(vlwVar.f182019H0 ? "video/hevc" : YtVideoEncoder.MIME_TYPE, i, i2, i3, i4, 1, qjx.f155001k);
                            }
                        }
                        int iM141681F2 = m141681F2((int) this.f14268H.f203843d);
                        this.f118158S.m175042d(i5, 16, i6, i7, f118143k1, iM141681F2);
                        this.f14269I.m131787l("startRecord.base", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), 1, Integer.valueOf(i5), 16, Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(iM141681F2));
                        this.f14269I.m131786k("audioProfile", "[pub=" + m141682H2((int) this.f14268H.f203843d) + ",profile=" + iM141681F2 + com.clevertap.android.sdk.Constants.AES_SUFFIX);
                        int iMo175045g3 = this.f118158S.mo175045g(this.f118164V);
                        if (iMo175045g3 != 0) {
                            this.f14268H.f203901y0 = iMo175045g3;
                            this.f118158S.m175046h();
                            this.f118164V = null;
                            this.f118158S = null;
                            return;
                        }
                    }
                    mo19757Q2();
                }
                if (mo19659c1() == 2 && this.f118182i1.f177160q && this.f118148I0 == null) {
                    C17792a c17792a = new C17792a("live-media-EX264Codec");
                    this.f118148I0 = c17792a;
                    c17792a.start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: R2 */
    public ByteBuffer m141705R2() {
        ByteBuffer byteBuffer;
        synchronized (this.f118166W) {
            try {
                LinkedList<ByteBuffer> linkedList = this.f118152M0;
                byteBuffer = null;
                if (linkedList != null && this.f118171Y0) {
                    try {
                        ByteBuffer byteBufferPollLast = linkedList.pollLast();
                        Iterator<ByteBuffer> it = this.f118152M0.iterator();
                        while (it.hasNext()) {
                            it.next().clear();
                            it.remove();
                        }
                        this.f118152M0.clear();
                        byteBuffer = byteBufferPollLast;
                    } catch (Exception unused) {
                        return null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return byteBuffer;
    }

    /* JADX INFO: renamed from: S2 */
    public mpd0 m141706S2() {
        mpd0 mpd0Var;
        synchronized (this.f118170Y) {
            LinkedList<mpd0> linkedList = this.f118154O0;
            mpd0Var = null;
            if (linkedList != null && this.f118171Y0) {
                try {
                    mpd0 mpd0VarPollLast = linkedList.pollLast();
                    this.f118154O0.iterator();
                    mpd0Var = mpd0VarPollLast;
                } catch (Exception unused) {
                    return null;
                }
            }
        }
        return mpd0Var;
    }

    /* JADX INFO: renamed from: T2 */
    public ByteBuffer m141707T2() {
        ByteBuffer byteBuffer;
        synchronized (this.f118168X) {
            try {
                LinkedList<ByteBuffer> linkedList = this.f118153N0;
                byteBuffer = null;
                if (linkedList != null) {
                    try {
                        ByteBuffer byteBufferPollLast = linkedList.pollLast();
                        Iterator<ByteBuffer> it = this.f118153N0.iterator();
                        while (it.hasNext()) {
                            it.next().clear();
                            it.remove();
                        }
                        this.f118153N0.clear();
                        byteBuffer = byteBufferPollLast;
                    } catch (Exception unused) {
                        return null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return byteBuffer;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: Y */
    public void mo19657Y(yw00 yw00Var, vlw vlwVar) {
        int i;
        int i2;
        super.mo19657Y(yw00Var, vlwVar);
        if (vlwVar == null) {
            return;
        }
        synchronized (this.f118146G0) {
            try {
                qjx qjxVar = this.f118158S;
                if (qjxVar != null) {
                    this.f118182i1 = vlwVar;
                    qjxVar.m175046h();
                    this.f118158S = null;
                    vlw vlwVar2 = this.f118182i1;
                    int i3 = vlwVar2.f177152m;
                    int i4 = vlwVar2.f177154n;
                    if (vlwVar.f182017F0) {
                        i2 = i3;
                        i = i4;
                    } else {
                        i = i3;
                        i2 = i4;
                    }
                    int i5 = vlwVar2.f182016E0;
                    int i6 = vlwVar2.f177109H;
                    int i7 = vlwVar2.f177117P;
                    int i8 = vlwVar2.f177119R;
                    int i9 = vlwVar2.f177120S;
                    qjx qjxVarMo19753G2 = mo19753G2();
                    this.f118158S = qjxVarMo19753G2;
                    if (qjxVarMo19753G2 == null) {
                        return;
                    }
                    if (!this.f118172Z) {
                        qjxVarMo19753G2.m175044f(this.f14281s.f182019H0 ? "video/hevc" : YtVideoEncoder.MIME_TYPE, i, i2, i5, i6, 1, qjx.f155001k);
                    }
                    int iM141681F2 = m141681F2((int) this.f14268H.f203843d);
                    this.f118158S.m175042d(i7, 16, i8, i9, i8 * 1024, iM141681F2);
                    this.f14269I.m131787l("resetCodec.base", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i5), Integer.valueOf(i6), 1, Integer.valueOf(i7), 16, Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(iM141681F2));
                    int iMo175045g = this.f118158S.mo175045g(this.f118164V);
                    if (iMo175045g != 0) {
                        this.f14268H.f203901y0 = iMo175045g;
                        this.f118158S.m175046h();
                        this.f118164V = null;
                        this.f118158S = null;
                    }
                    yt10 yt10Var = this.f118164V;
                    if (yt10Var != null) {
                        yt10Var.mo19756O1();
                    }
                    this.f118144E0 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.fcj, p149l.ccj
    public void destroy() {
        super.destroy();
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: e0 */
    public Surface mo19660e0() {
        qjx qjxVar = this.f118158S;
        if (qjxVar == null) {
            return null;
        }
        this.f118144E0 = false;
        return qjxVar.m175041b();
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: f */
    public void mo19662f() {
        super.mo19662f();
        synchronized (this.f118146G0) {
            this.f118145F0 = true;
            release();
        }
    }

    /* JADX INFO: renamed from: m1 */
    public void mo19665m1(ByteBuffer byteBuffer) {
        if (this.f118182i1.f177160q) {
            m141685N2(byteBuffer);
        }
    }

    @Override // p149l.ccj
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
    }

    /* JADX INFO: renamed from: v0 */
    public void mo19670v0(ByteBuffer byteBuffer) {
        vlw vlwVar;
        if (!this.f118169X0 || (vlwVar = this.f118182i1) == null || vlwVar.f177129a0) {
            return;
        }
        m141684M2(byteBuffer);
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: H0 */
    public void mo19650H0(boolean z) {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: y */
    public void mo19671y(int i, int i2) {
    }

    /* JADX INFO: renamed from: y0 */
    public void mo19672y0(int i, int i2, int i3) {
    }
}
