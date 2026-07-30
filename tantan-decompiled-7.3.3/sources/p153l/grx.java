package p153l;

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

/* JADX INFO: loaded from: classes8.dex */
public abstract class grx extends MediaBaseCodecFilter {

    /* JADX INFO: renamed from: k1 */
    public static int f106148k1 = 2048;

    /* JADX INFO: renamed from: E0 */
    private boolean f106149E0;

    /* JADX INFO: renamed from: F0 */
    protected boolean f106150F0;

    /* JADX INFO: renamed from: G0 */
    private Object f106151G0;

    /* JADX INFO: renamed from: H0 */
    protected boolean f106152H0;

    /* JADX INFO: renamed from: I0 */
    private C17286a f106153I0;

    /* JADX INFO: renamed from: J0 */
    private C17288c f106154J0;

    /* JADX INFO: renamed from: K0 */
    private C17289d f106155K0;

    /* JADX INFO: renamed from: L0 */
    private C17287b f106156L0;

    /* JADX INFO: renamed from: M0 */
    private LinkedList<ByteBuffer> f106157M0;

    /* JADX INFO: renamed from: N0 */
    private LinkedList<ByteBuffer> f106158N0;

    /* JADX INFO: renamed from: O0 */
    private LinkedList<oxd0> f106159O0;

    /* JADX INFO: renamed from: P0 */
    protected ByteBuffer f106160P0;

    /* JADX INFO: renamed from: Q0 */
    protected ByteBuffer f106161Q0;

    /* JADX INFO: renamed from: R0 */
    protected ByteBuffer f106162R0;

    /* JADX INFO: renamed from: S */
    private nsx f106163S;

    /* JADX INFO: renamed from: S0 */
    protected ByteBuffer f106164S0;

    /* JADX INFO: renamed from: T */
    private final String f106165T;

    /* JADX INFO: renamed from: T0 */
    protected ByteBuffer f106166T0;

    /* JADX INFO: renamed from: U */
    public boolean f106167U;

    /* JADX INFO: renamed from: U0 */
    protected ByteBuffer f106168U0;

    /* JADX INFO: renamed from: V */
    private g220 f106169V;

    /* JADX INFO: renamed from: V0 */
    protected ByteBuffer f106170V0;

    /* JADX INFO: renamed from: W */
    private Object f106171W;

    /* JADX INFO: renamed from: W0 */
    protected ByteBuffer f106172W0;

    /* JADX INFO: renamed from: X */
    private Object f106173X;

    /* JADX INFO: renamed from: X0 */
    public boolean f106174X0;

    /* JADX INFO: renamed from: Y */
    private Object f106175Y;

    /* JADX INFO: renamed from: Y0 */
    public boolean f106176Y0;

    /* JADX INFO: renamed from: Z */
    protected boolean f106177Z;

    /* JADX INFO: renamed from: Z0 */
    protected long f106178Z0;

    /* JADX INFO: renamed from: a1 */
    byte[] f106179a1;

    /* JADX INFO: renamed from: b1 */
    byte[] f106180b1;

    /* JADX INFO: renamed from: c1 */
    byte[] f106181c1;

    /* JADX INFO: renamed from: d1 */
    String f106182d1;

    /* JADX INFO: renamed from: e1 */
    protected String f106183e1;

    /* JADX INFO: renamed from: f1 */
    protected boolean f106184f1;

    /* JADX INFO: renamed from: g1 */
    private final String f106185g1;

    /* JADX INFO: renamed from: h1 */
    private final String f106186h1;

    /* JADX INFO: renamed from: i1 */
    uow f106187i1;

    /* JADX INFO: renamed from: j1 */
    private x264sdk f106188j1;

    /* JADX INFO: renamed from: k0 */
    protected int f106189k0;

    /* JADX INFO: renamed from: p0 */
    protected int f106190p0;

    /* JADX INFO: renamed from: l.grx$a */
    public class C17286a extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f106191a;

        /* JADX INFO: renamed from: b */
        private boolean f106192b;

        /* JADX INFO: renamed from: c */
        private x264sdk.listener f106193c;

        /* JADX INFO: renamed from: d */
        private x264sdk f106194d;

        /* JADX INFO: renamed from: e */
        private ByteBuffer f106195e;

        /* JADX INFO: renamed from: l.grx$a$a */
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
                oq70.m168791d().m168793a("MediaCodecFilter", "----h264data----len:" + i + ";idc:" + i3 + ";naltype:" + i4 + ":date:" + ((int) bArr[0]) + ":" + ((int) bArr[1]) + ":" + ((int) bArr[2]) + ":" + ((int) bArr[3]) + ":" + ((int) bArr[4]));
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
                byteBufferAllocate.position(0);
                byteBufferAllocate.put(bArr);
                if (!C17286a.this.f106192b && i4 == 7) {
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
                    if (grx.this.f106169V != null) {
                        grx.this.f106169V.mo20760f0(byteBufferAllocate2, i6);
                    }
                    C17286a.this.f106192b = true;
                }
                if (grx.this.f106169V == null || !C17286a.this.f106192b) {
                    return;
                }
                grx.this.f106169V.mo20759W(byteBufferAllocate);
            }
        }

        public C17286a(String str) {
            super(str);
            this.f106191a = false;
            this.f106192b = false;
            this.f106193c = new a();
            this.f106194d = null;
            this.f106195e = null;
            x264sdk x264sdkVar = new x264sdk(this.f106193c);
            this.f106194d = x264sdkVar;
            uow uowVar = grx.this.f106187i1;
            x264sdkVar.initEncode(uowVar.f175498o, uowVar.f175500p, 15, uowVar.f175452I);
            oq70.m168791d().m168793a("MediaCodecFilter", "----x264data listener:width=" + grx.this.f106187i1.f175498o + "; height=" + grx.this.f106187i1.f175500p + ";bitrate=" + grx.this.f106187i1.f175452I);
        }

        /* JADX INFO: renamed from: c */
        public void m131943c() {
            this.f106191a = true;
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "ExternSoftCodecThread quit");
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
            while (!Thread.interrupted() && !this.f106191a) {
                ByteBuffer byteBufferM131940T2 = grx.this.m131940T2();
                if (byteBufferM131940T2 != null && (x264sdkVar = this.f106194d) != null) {
                    x264sdkVar.PushOriStream(byteBufferM131940T2.array(), byteBufferM131940T2.limit(), 0L);
                }
            }
            synchronized (grx.this.f106173X) {
                try {
                    x264sdk x264sdkVar2 = this.f106194d;
                    if (x264sdkVar2 != null) {
                        x264sdkVar2.release();
                        this.f106194d = null;
                    }
                    if (grx.this.f106158N0 != null) {
                        grx.this.f106158N0.clear();
                        grx.this.f106158N0 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            oq70 oq70VarM168791d = oq70.m168791d();
            StringBuilder sb = new StringBuilder("ExternSoftCodecThread end interrupted");
            sb.append(!Thread.interrupted());
            sb.append(" shouldQuit:");
            sb.append(this.f106191a);
            sb.append(" mIsRunning:");
            sb.append(grx.this.f106174X0);
            oq70VarM168791d.m168795c("Pipeline_Normal_pip->PIPLINE", sb.toString());
        }
    }

    /* JADX INFO: renamed from: l.grx$b */
    public class C17287b extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f106198a;

        /* JADX INFO: renamed from: b */
        private VoAACEncoder f106199b;

        /* JADX INFO: renamed from: c */
        private boolean f106200c;

        public C17287b(String str) {
            super(str);
            this.f106198a = false;
            this.f106199b = null;
            this.f106200c = false;
            VoAACEncoder voAACEncoder = new VoAACEncoder();
            this.f106199b = voAACEncoder;
            uow uowVar = grx.this.f106187i1;
            voAACEncoder.InitEncoder(uowVar.f175459P, uowVar.f175462S, (short) uowVar.f175461R, (short) 0);
        }

        /* JADX INFO: renamed from: a */
        public void m131944a() {
            this.f106198a = true;
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "SoftAudioCodecThread quit");
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
                if (Thread.interrupted() || this.f106198a) {
                    break;
                }
                oxd0 oxd0VarM131939S2 = grx.this.m131939S2();
                if (oxd0VarM131939S2 != null && grx.this.f106169V != null) {
                    VoAACEncoder voAACEncoder = this.f106199b;
                    if (voAACEncoder != null && (bArr = oxd0VarM131939S2.f149638a) != null) {
                        bArrEncData = voAACEncoder.EncData(bArr);
                    }
                    if (bArrEncData != null) {
                        if (grx.this.f106169V != null && !this.f106200c) {
                            grx.this.f106169V.mo20763t1(ByteBuffer.wrap(pwk.f154408a), pwk.f154408a.length);
                            this.f106200c = true;
                        }
                        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "Mp4MuxerWrapper writeSoftAudioSample ");
                        if (grx.this.f106169V != null) {
                            grx.this.f106169V.mo20754K0(ByteBuffer.wrap(bArrEncData));
                        }
                    }
                }
            }
            synchronized (grx.this.f106175Y) {
                try {
                    VoAACEncoder voAACEncoder2 = this.f106199b;
                    if (voAACEncoder2 != null) {
                        voAACEncoder2.release();
                        this.f106199b = null;
                    }
                    if (grx.this.f106159O0 != null) {
                        grx.this.f106159O0.clear();
                        grx.this.f106159O0 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "SoftAudioCodecThread end interrupted" + (true ^ Thread.interrupted()) + " AudioshouldQuit:" + this.f106198a + " AudioIsRunning:" + grx.this.f106174X0);
        }
    }

    /* JADX INFO: renamed from: l.grx$c */
    public class C17288c extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f106202a;

        /* JADX INFO: renamed from: b */
        private boolean f106203b;

        /* JADX INFO: renamed from: c */
        private x264sdk.listener f106204c;

        /* JADX INFO: renamed from: d */
        private x264sdk f106205d;

        /* JADX INFO: renamed from: e */
        private ByteBuffer f106206e;

        /* JADX INFO: renamed from: l.grx$c$a */
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
                oq70.m168791d().m168793a("MediaCodecFilter", "----h264data----len:" + i + ";idc:" + i3 + ";naltype:" + i4 + ":date:" + ((int) bArr[0]) + ":" + ((int) bArr[1]) + ":" + ((int) bArr[2]) + ":" + ((int) bArr[3]) + ":" + ((int) bArr[4]));
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
                byteBufferAllocate.position(0);
                byteBufferAllocate.put(bArr);
                if (!C17288c.this.f106203b && i4 == 7) {
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
                    if (grx.this.f106169V != null) {
                        grx.this.f106169V.mo20765z0(byteBufferAllocate2, i6);
                    }
                    C17288c.this.f106203b = true;
                }
                if (grx.this.f106169V == null || !C17288c.this.f106203b) {
                    return;
                }
                grx.this.f106169V.mo20762p0(byteBufferAllocate);
            }
        }

        public C17288c(String str) {
            super(str);
            this.f106202a = false;
            this.f106203b = false;
            this.f106204c = new a();
            this.f106205d = null;
            this.f106206e = null;
            x264sdk x264sdkVar = new x264sdk(this.f106204c);
            this.f106205d = x264sdkVar;
            uow uowVar = grx.this.f106187i1;
            x264sdkVar.initEncode(uowVar.f175494m, uowVar.f175496n, 15, uowVar.f175451H);
            oq70.m168791d().m168793a("MediaCodecFilter", "----h264data listener:width=" + grx.this.f106187i1.f175494m + "; height=" + grx.this.f106187i1.f175496n + ";bitrate=" + grx.this.f106187i1.f175451H);
        }

        /* JADX INFO: renamed from: c */
        public void m131947c() {
            this.f106202a = true;
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "SoftCodecThread quit");
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
            while (!Thread.interrupted() && !this.f106202a) {
                ByteBuffer byteBufferM131938R2 = grx.this.m131938R2();
                if (byteBufferM131938R2 != null && (x264sdkVar = this.f106205d) != null) {
                    x264sdkVar.PushOriStream(byteBufferM131938R2.array(), byteBufferM131938R2.limit(), 0L);
                }
            }
            synchronized (grx.this.f106171W) {
                try {
                    x264sdk x264sdkVar2 = this.f106205d;
                    if (x264sdkVar2 != null) {
                        x264sdkVar2.release();
                        this.f106205d = null;
                    }
                    if (grx.this.f106157M0 != null) {
                        grx.this.f106157M0.clear();
                        grx.this.f106157M0 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            oq70 oq70VarM168791d = oq70.m168791d();
            StringBuilder sb = new StringBuilder("SoftCodecThread end interrupted");
            sb.append(!Thread.interrupted());
            sb.append(" shouldQuit:");
            sb.append(this.f106202a);
            sb.append(" mIsRunning:");
            sb.append(grx.this.f106174X0);
            oq70VarM168791d.m168795c("Pipeline_Normal_pip->PIPLINE", sb.toString());
        }
    }

    /* JADX INFO: renamed from: l.grx$d */
    public class C17289d extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f106209a;

        /* JADX INFO: renamed from: b */
        private boolean f106210b;

        /* JADX INFO: renamed from: c */
        private long f106211c;

        public C17289d(String str) {
            super(str);
            this.f106209a = false;
            this.f106210b = false;
            this.f106211c = 0L;
        }

        /* JADX INFO: renamed from: a */
        public void m131948a() {
            this.f106209a = true;
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "SoftCodecThread quit");
            try {
                join();
            } catch (InterruptedException unused) {
                interrupt();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!Thread.interrupted() && !this.f106209a) {
                if (grx.this.f106169V != null && !this.f106210b) {
                    grx.this.f106169V.mo20765z0(ByteBuffer.wrap(pwk.f154410c), pwk.f154410c.length);
                    this.f106210b = true;
                }
                try {
                    Thread.sleep(66L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (this.f106211c % 15 != 0) {
                    if (pwk.f154413f == null) {
                        uow uowVar = grx.this.f106187i1;
                        pwk.f154413f = new byte[((uowVar.f175494m * uowVar.f175496n) * 3) / 2];
                    }
                    byte[] bArr = pwk.f154413f;
                    if (bArr != null) {
                        grx.this.mo20666o1(ByteBuffer.wrap(bArr));
                    }
                    if (grx.this.f106169V != null) {
                        grx.this.f106169V.mo20762p0(ByteBuffer.wrap(pwk.f154411d));
                    }
                } else if (grx.this.f106169V != null) {
                    grx.this.f106169V.mo20762p0(ByteBuffer.wrap(pwk.f154412e));
                }
                this.f106211c++;
            }
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "SoftFakeCodecThread end interrupted" + (true ^ Thread.interrupted()) + " shouldQuit:" + this.f106209a + " mIsRunning:" + grx.this.f106174X0);
        }
    }

    public grx(Context context) {
        super(context == null ? l26.f129743a : context);
        this.f106163S = null;
        this.f106165T = "MediaCodecFilter";
        this.f106167U = true;
        this.f106173X = new Object();
        this.f106177Z = false;
        this.f106189k0 = 1;
        this.f106190p0 = -1;
        this.f106149E0 = false;
        this.f106150F0 = false;
        this.f106151G0 = new Object();
        this.f106155K0 = null;
        this.f106157M0 = new LinkedList<>();
        this.f106158N0 = new LinkedList<>();
        this.f106159O0 = new LinkedList<>();
        this.f106174X0 = false;
        this.f106176Y0 = false;
        this.f106178Z0 = System.currentTimeMillis();
        this.f106179a1 = new byte[]{0, 0, 0, 1, 6, 100, 46};
        this.f106180b1 = new byte[]{0, 0, 0, 1, 78, 1, 5, 46, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        this.f106181c1 = new byte[]{0, 0, 0, 1};
        this.f106182d1 = "momoa9a427d1andr22";
        this.f106183e1 = WeJson.EMPTY_MAP;
        this.f106184f1 = true;
        this.f106185g1 = YtVideoEncoder.MIME_TYPE;
        this.f106186h1 = "video/hevc";
        this.f106188j1 = null;
    }

    /* JADX INFO: renamed from: F2 */
    private int m131914F2(int i) {
        switch (i) {
            case 256:
                return csx.m112235R().m112329e();
            case 257:
                return csx.m112235R().m112341h();
            case 258:
                return csx.m112235R().m112325d();
            case 259:
                return csx.m112235R().m112337g();
            case 260:
                return csx.m112235R().m112333f();
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: H2 */
    private String m131915H2(int i) {
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
    private void m131916L2(oxd0 oxd0Var) {
        synchronized (this.f106175Y) {
            try {
                LinkedList<oxd0> linkedList = this.f106159O0;
                if (linkedList != null) {
                    linkedList.offerLast(oxd0Var);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: M2 */
    private void m131917M2(ByteBuffer byteBuffer) {
        synchronized (this.f106171W) {
            try {
                LinkedList<ByteBuffer> linkedList = this.f106157M0;
                if (linkedList != null) {
                    linkedList.offerLast(byteBuffer);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: N2 */
    private void m131918N2(ByteBuffer byteBuffer) {
        synchronized (this.f106173X) {
            try {
                try {
                    LinkedList<ByteBuffer> linkedList = this.f106158N0;
                    if (linkedList != null) {
                        if (linkedList.size() > 2) {
                            this.f106158N0.clear();
                        }
                        this.f106158N0.offerLast(byteBuffer);
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
        if (this.f106169V != null) {
            oq70.m168791d().m168795c("MediaCodecFilter", "mMuxerWrapper stop ##############");
            this.f106169V.mo20761k1();
        }
        if (this.f106163S != null) {
            oq70.m168791d().m168795c("MediaCodecFilter", "mMediaEncoder stop ##############");
            this.f106163S.m164655h();
            this.f106163S = null;
        }
        C17288c c17288c = this.f106154J0;
        if (c17288c != null) {
            c17288c.m131947c();
            this.f106154J0 = null;
        }
        C17286a c17286a = this.f106153I0;
        if (c17286a != null) {
            c17286a.m131943c();
            this.f106153I0 = null;
        }
        C17289d c17289d = this.f106155K0;
        if (c17289d != null) {
            c17289d.m131948a();
            this.f106155K0 = null;
        }
        C17287b c17287b = this.f106156L0;
        if (c17287b != null) {
            c17287b.m131944a();
            this.f106156L0 = null;
        }
        if (this.f106169V != null) {
            oq70.m168791d().m168795c("MediaCodecFilter", "mMuxerWrapper stop ##############");
            this.f106169V.mo20761k1();
            this.f106169V = null;
        }
        ByteBuffer byteBuffer = this.f106160P0;
        if (byteBuffer != null) {
            byteBuffer.clear();
            this.f106160P0 = null;
        }
        ByteBuffer byteBuffer2 = this.f106161Q0;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
            this.f106161Q0 = null;
        }
        ByteBuffer byteBuffer3 = this.f106162R0;
        if (byteBuffer3 != null) {
            byteBuffer3.clear();
            this.f106162R0 = null;
        }
        ByteBuffer byteBuffer4 = this.f106164S0;
        if (byteBuffer4 != null) {
            byteBuffer4.clear();
            this.f106164S0 = null;
        }
        ByteBuffer byteBuffer5 = this.f106166T0;
        if (byteBuffer5 != null) {
            byteBuffer5.clear();
            this.f106166T0 = null;
        }
        ByteBuffer byteBuffer6 = this.f106168U0;
        if (byteBuffer6 != null) {
            byteBuffer6.clear();
            this.f106168U0 = null;
        }
    }

    /* JADX INFO: renamed from: A2 */
    public ByteBuffer m131929A2(ByteBuffer byteBuffer, int i, boolean z, int i2) {
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
                    this.f106166T0 = byteBufferAllocate2;
                    byteBufferAllocate2.put(bArr, 0, i4);
                    break;
                }
                ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(i4);
                this.f106161Q0 = byteBufferAllocate3;
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
                        if (this.f106160P0 == null) {
                            int i7 = i5 - i4;
                            ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(i7);
                            this.f106160P0 = byteBufferAllocate4;
                            byteBufferAllocate4.put(bArr, i4, i7);
                        }
                    } else if (this.f106164S0 == null) {
                        int i8 = i5 - i4;
                        ByteBuffer byteBufferAllocate5 = ByteBuffer.allocate(i8);
                        this.f106164S0 = byteBufferAllocate5;
                        byteBufferAllocate5.put(bArr, i4, i8);
                    }
                    i6 = i5;
                    break;
                }
                if (i6 == 0) {
                    if (i2 == 0) {
                        if (this.f106160P0 == null) {
                            int i9 = i5 - i4;
                            ByteBuffer byteBufferAllocate6 = ByteBuffer.allocate(i9);
                            this.f106160P0 = byteBufferAllocate6;
                            byteBufferAllocate6.put(bArr, i4, i9);
                        }
                    } else if (this.f106164S0 == null) {
                        int i10 = i5 - i4;
                        ByteBuffer byteBufferAllocate7 = ByteBuffer.allocate(i10);
                        this.f106164S0 = byteBufferAllocate7;
                        byteBufferAllocate7.put(bArr, i4, i10);
                    }
                    i6 = i5;
                }
            }
            i5++;
        }
        byte[] bArrM131931C2 = m131931C2(this.f106184f1);
        ByteBuffer byteBufferAllocate8 = ByteBuffer.allocate(bArrM131931C2 != null ? bArrM131931C2.length + i : i);
        byteBufferAllocate8.position(0);
        byteBufferAllocate8.put(bArr, 0, i6);
        oq70.m168791d().m168795c("ContentValues", "keyframe put sei");
        byteBufferAllocate8.put(bArrM131931C2, 0, bArrM131931C2.length);
        byteBufferAllocate8.put(bArr, i5, i - i5);
        oq70.m168791d().m168795c("ContentValues", "merge keyframe compile");
        return byteBufferAllocate8;
    }

    /* JADX INFO: renamed from: B2 */
    public ByteBuffer m131930B2(ByteBuffer byteBuffer, int i, boolean z) {
        int i2;
        int i3;
        byte[] bArrM131932D2;
        int length = i;
        byte[] bArr = new byte[length];
        byteBuffer.get(bArr);
        long jCurrentTimeMillis = System.currentTimeMillis();
        ByteBuffer byteBuffer2 = this.f106162R0;
        int iLimit = byteBuffer2 != null ? byteBuffer2.limit() : 0;
        boolean z2 = iLimit != 0;
        if (z2) {
            i2 = (bArr[4] & 126) >> 1;
            t9c.m189743a("ContentValues", "decorateVideoBuffer isHevc " + iLimit + " nalu_type " + i2 + " isKey " + z);
            i3 = 34;
        } else {
            i2 = bArr[4] & 31;
            t9c.m189743a("ContentValues", "decorateVideoBuffer isH264 " + iLimit + " nalu_type " + i2 + " isKey " + z);
            i3 = 7;
        }
        if (z) {
            ByteBuffer byteBuffer3 = this.f106161Q0;
            int iLimit2 = byteBuffer3 != null ? byteBuffer3.limit() : 0;
            ByteBuffer byteBuffer4 = this.f106160P0;
            int iLimit3 = byteBuffer.limit() + iLimit2 + (byteBuffer4 != null ? byteBuffer4.limit() : 0) + iLimit;
            byte[] bArrM131932D3 = m131932D2(this.f106184f1, z2);
            if (bArrM131932D3 != null) {
                iLimit3 += bArrM131932D3.length;
            }
            int i4 = iLimit3;
            bArrM131932D2 = bArrM131932D3;
            length = i4;
        } else if (jCurrentTimeMillis - this.f106178Z0 >= 1500) {
            bArrM131932D2 = m131932D2(this.f106184f1, z2);
            if (bArrM131932D2 != null) {
                length += bArrM131932D2.length;
            }
        } else {
            bArrM131932D2 = null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.position(0);
        if (z) {
            ByteBuffer byteBuffer5 = this.f106161Q0;
            if (byteBuffer5 != null) {
                byteBuffer5.rewind();
                byteBufferAllocate.put(this.f106161Q0.array());
            }
            ByteBuffer byteBuffer6 = this.f106160P0;
            if (byteBuffer6 != null) {
                byteBuffer6.rewind();
                byteBufferAllocate.put(this.f106160P0.array());
            }
            ByteBuffer byteBuffer7 = this.f106162R0;
            if (byteBuffer7 != null) {
                byteBuffer7.rewind();
                byteBufferAllocate.put(this.f106162R0.array());
            }
        }
        if (bArrM131932D2 != null && i2 != i3) {
            byteBufferAllocate.put(bArrM131932D2);
            this.f106178Z0 = jCurrentTimeMillis;
        }
        ByteBuffer byteBuffer8 = this.f106161Q0;
        if (byteBuffer8 != null) {
            byteBuffer8.rewind();
        }
        ByteBuffer byteBuffer9 = this.f106160P0;
        if (byteBuffer9 != null) {
            byteBuffer9.rewind();
        }
        ByteBuffer byteBuffer10 = this.f106162R0;
        if (byteBuffer10 != null) {
            byteBuffer10.rewind();
        }
        byteBufferAllocate.put(bArr);
        return byteBufferAllocate;
    }

    /* JADX INFO: renamed from: C2 */
    public byte[] m131931C2(boolean z) {
        return m131932D2(z, false);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX INFO: renamed from: D2 */
    public byte[] m131932D2(boolean z, boolean z2) {
        boolean z3;
        String str;
        JSONObject jSONObject = null;
        if (z2 || !z) {
            z3 = true;
        } else {
            if (this.f106188j1 == null) {
                this.f106188j1 = new x264sdk(null);
            }
            if (this.f106188j1.getEnabled()) {
                z3 = false;
            } else {
                z3 = true;
            }
        }
        String str2 = new String(z2 ? this.f106180b1 : this.f106179a1);
        try {
            JSONObject jSONObject2 = new JSONObject(this.f106183e1);
            if (jSONObject2.has(Constants.f58037TS)) {
                jSONObject2.remove(Constants.f58037TS);
            }
            jSONObject2.put(Constants.f58037TS, m20727Y1());
            jSONObject = jSONObject2;
        } catch (Exception unused) {
        }
        if (jSONObject != null) {
            this.f106183e1 = jSONObject.toString();
        }
        short length = (short) this.f106183e1.getBytes().length;
        oq70.m168791d().m168795c("ContentValues", "genSei len :" + ((int) length) + "");
        if (z3) {
            str = str2 + this.f106182d1 + this.f106183e1;
        } else {
            str = this.f106182d1 + this.f106183e1;
        }
        byte[] bytes = str.getBytes();
        if (!z3) {
            bytes[17] = (byte) (length & 255);
            bytes[16] = (byte) ((length >> 8) & 255);
            byte[] bArrGenSEI = this.f106188j1.GenSEI(bytes, length);
            String str3 = new String(bArrGenSEI);
            oq70.m168791d().m168795c("ContentValues", "seiSei: length=" + bArrGenSEI.length + "; sei:" + str3);
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
        oq70.m168791d().m168795c("ContentValues", "seiSei: length=" + bytes.length + "sei:" + str);
        return bytes;
    }

    /* JADX INFO: renamed from: E2 */
    public abstract g220 mo20751E2();

    /* JADX INFO: renamed from: G2 */
    public abstract nsx mo20752G2();

    /* JADX INFO: renamed from: I2 */
    public boolean m131933I2(ByteBuffer byteBuffer, int i) {
        byteBuffer.position(0);
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        byteBuffer.rewind();
        byte b = bArr[4];
        int i2 = b & 31;
        int i3 = (b & 126) >> 1;
        if (this.f106162R0 == null || i3 < 16 || i3 > 21) {
            return this.f106161Q0 != null && i2 == 5;
        }
        return true;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: J */
    public void mo20650J(String str) {
        this.f14988I.m122843l("momopusher setSei", str);
        this.f106183e1 = str;
    }

    /* JADX INFO: renamed from: J2 */
    public boolean m131934J2(ByteBuffer byteBuffer, int i) {
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
        oq70.m168791d().m168793a("MediaCodecFilter", "sei found !");
        return false;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: K1 */
    public void mo20651K1(oxd0 oxd0Var) {
        uow uowVar = this.f15000s;
        if (uowVar != null && uowVar.f175475c0) {
            if (this.f106174X0) {
                m131916L2(oxd0Var);
            }
        } else {
            nsx nsxVar = this.f106163S;
            if (nsxVar != null) {
                nsxVar.m164649a(oxd0Var);
            }
        }
    }

    @RequiresApi(api = 16)
    /* JADX INFO: renamed from: K2 */
    public int m131935K2(MediaFormat mediaFormat, int i) {
        if (mediaFormat == null || i < 1 || i > 2) {
            Log4Cam.m7377e("ContentValues", "Add media track error ! Invalid parameter ! format=" + mediaFormat + " and track=" + i);
            return -1;
        }
        if (mediaFormat.getString(IMediaFormat.KEY_MIME).contains("audio")) {
            this.f106168U0 = mediaFormat.getByteBuffer("csd-0");
            return 1;
        }
        if (mediaFormat.getString(IMediaFormat.KEY_MIME).contains(YtVideoEncoder.MIME_TYPE)) {
            this.f106161Q0 = mediaFormat.getByteBuffer("csd-0");
            this.f106160P0 = mediaFormat.getByteBuffer("csd-1");
            return 2;
        }
        if (!mediaFormat.getString(IMediaFormat.KEY_MIME).contains("video/hevc")) {
            return -1;
        }
        this.f106162R0 = mediaFormat.getByteBuffer("csd-0");
        return 2;
    }

    /* JADX INFO: renamed from: O2 */
    public void m131936O2(boolean z) {
        this.f106177Z = z;
        if (z) {
            this.f106189k0 = 2;
        } else {
            this.f106189k0 = 1;
        }
    }

    @RequiresApi(api = 19)
    /* JADX INFO: renamed from: P2 */
    public void mo131937P2(int i) {
        uow uowVar = this.f15000s;
        if (uowVar != null) {
            uowVar.f175451H = i;
        }
        nsx nsxVar = this.f106163S;
        if (nsxVar != null) {
            nsxVar.m164652e(i);
        }
    }

    /* JADX INFO: renamed from: Q2 */
    public void mo20756Q2() {
        g220 g220Var = this.f106169V;
        if (g220Var != null) {
            g220Var.mo20755O1();
        }
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    @RequiresApi(api = 18)
    /* JADX INFO: renamed from: R0 */
    public void mo20654R0(uow uowVar, EGLContext eGLContext) {
        g220 g220Var;
        super.mo20654R0(uowVar, eGLContext);
        if (uowVar.f180156A0 == MomoPipeline.DecodeType.SOFT_DECODE) {
            this.f106176Y0 = true;
        }
        this.f106187i1 = uowVar;
        synchronized (this.f106151G0) {
            try {
                if (this.f106150F0 && !this.f106187i1.f180179X0) {
                    oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "startRecord error return 441");
                    return;
                }
                if (this.f106152H0 && (g220Var = this.f106169V) != null && !this.f106176Y0) {
                    int iMo164654g = this.f106163S.mo164654g(g220Var);
                    if (iMo164654g != 0) {
                        this.f14987H.f191117y0 = iMo164654g;
                        this.f106163S.m164655h();
                        this.f106169V = null;
                        this.f106163S = null;
                    }
                    oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "isPrepared:" + this.f106152H0 + " mMuxerWrapper:" + this.f106169V);
                    mo20756Q2();
                    return;
                }
                uow uowVar2 = this.f106187i1;
                int i = uowVar2.f175494m;
                int i2 = uowVar2.f175496n;
                int i3 = uowVar.f180160E0;
                int i4 = uowVar.f175451H;
                int i5 = uowVar.f175459P;
                int i6 = uowVar.f175461R;
                int i7 = uowVar.f175462S;
                f106148k1 = i6 * 1024;
                if (this.f106169V == null) {
                    this.f106169V = mo20751E2();
                }
                if (this.f106176Y0) {
                    oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "startRecord softcodec");
                    this.f106171W = new Object();
                    this.f106175Y = new Object();
                    if (this.f106187i1.f175471a0) {
                        if (this.f106155K0 == null) {
                            C17289d c17289d = new C17289d("live-media-FSCodec");
                            this.f106155K0 = c17289d;
                            c17289d.start();
                        }
                        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "startRecord softcodec usefakevideocodec");
                    } else {
                        if (this.f106154J0 == null) {
                            C17288c c17288c = new C17288c("live-media-x264codec");
                            this.f106154J0 = c17288c;
                            c17288c.start();
                        }
                        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "startRecord softcodec usesoftvideocodec");
                    }
                    if (uowVar.f175475c0) {
                        if (this.f106156L0 == null) {
                            C17287b c17287b = new C17287b("live-media-SACodec");
                            this.f106156L0 = c17287b;
                            c17287b.start();
                        }
                        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "startRecord softcodec usevoaac for aac");
                    } else {
                        if (this.f106163S == null) {
                            nsx nsxVarMo20752G2 = mo20752G2();
                            this.f106163S = nsxVarMo20752G2;
                            if (nsxVarMo20752G2 == null) {
                                return;
                            }
                            nsxVarMo20752G2.m164651d(i5, 16, i6, i7, f106148k1, 0);
                            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "startRecord softcodec usemediacodec audioSampleRate:" + i5 + ";audioChannels:" + i6 + ";audioBitrate:" + i7);
                            int iMo164654g2 = this.f106163S.mo164654g(this.f106169V);
                            if (iMo164654g2 != 0) {
                                this.f14987H.f191117y0 = iMo164654g2;
                                this.f106163S.m164655h();
                                this.f106169V = null;
                                this.f106163S = null;
                                return;
                            }
                        }
                        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "startRecord softcodec usemediacodec for aac");
                    }
                    mo20756Q2();
                } else {
                    oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "startRecord hardcodec");
                    if (this.f106163S == null) {
                        nsx nsxVarMo20752G3 = mo20752G2();
                        this.f106163S = nsxVarMo20752G3;
                        if (nsxVarMo20752G3 == null) {
                            return;
                        }
                        if (!this.f106177Z) {
                            if (this.f106187i1.f175471a0) {
                                if (this.f106155K0 == null) {
                                    C17289d c17289d2 = new C17289d("live-media-FSCodec");
                                    this.f106155K0 = c17289d2;
                                    c17289d2.start();
                                }
                                oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "startRecord hardcodec FakeSoftCodec");
                            } else {
                                nsxVarMo20752G3.m164653f(uowVar.f180163H0 ? "video/hevc" : YtVideoEncoder.MIME_TYPE, i, i2, i3, i4, 1, nsx.f143548k);
                            }
                        }
                        int iM131914F2 = m131914F2((int) this.f14987H.f191059d);
                        this.f106163S.m164651d(i5, 16, i6, i7, f106148k1, iM131914F2);
                        this.f14988I.m122843l("startRecord.base", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), 1, Integer.valueOf(i5), 16, Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(iM131914F2));
                        this.f14988I.m122842k("audioProfile", "[pub=" + m131915H2((int) this.f14987H.f191059d) + ",profile=" + iM131914F2 + com.clevertap.android.sdk.Constants.AES_SUFFIX);
                        int iMo164654g3 = this.f106163S.mo164654g(this.f106169V);
                        if (iMo164654g3 != 0) {
                            this.f14987H.f191117y0 = iMo164654g3;
                            this.f106163S.m164655h();
                            this.f106169V = null;
                            this.f106163S = null;
                            return;
                        }
                    }
                    mo20756Q2();
                }
                if (mo20658c1() == 2 && this.f106187i1.f175502q && this.f106153I0 == null) {
                    C17286a c17286a = new C17286a("live-media-EX264Codec");
                    this.f106153I0 = c17286a;
                    c17286a.start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: R2 */
    public ByteBuffer m131938R2() {
        ByteBuffer byteBuffer;
        synchronized (this.f106171W) {
            try {
                LinkedList<ByteBuffer> linkedList = this.f106157M0;
                byteBuffer = null;
                if (linkedList != null && this.f106176Y0) {
                    try {
                        ByteBuffer byteBufferPollLast = linkedList.pollLast();
                        Iterator<ByteBuffer> it = this.f106157M0.iterator();
                        while (it.hasNext()) {
                            it.next().clear();
                            it.remove();
                        }
                        this.f106157M0.clear();
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
    public oxd0 m131939S2() {
        oxd0 oxd0Var;
        synchronized (this.f106175Y) {
            LinkedList<oxd0> linkedList = this.f106159O0;
            oxd0Var = null;
            if (linkedList != null && this.f106176Y0) {
                try {
                    oxd0 oxd0VarPollLast = linkedList.pollLast();
                    this.f106159O0.iterator();
                    oxd0Var = oxd0VarPollLast;
                } catch (Exception unused) {
                    return null;
                }
            }
        }
        return oxd0Var;
    }

    /* JADX INFO: renamed from: T2 */
    public ByteBuffer m131940T2() {
        ByteBuffer byteBuffer;
        synchronized (this.f106173X) {
            try {
                LinkedList<ByteBuffer> linkedList = this.f106158N0;
                byteBuffer = null;
                if (linkedList != null) {
                    try {
                        ByteBuffer byteBufferPollLast = linkedList.pollLast();
                        Iterator<ByteBuffer> it = this.f106158N0.iterator();
                        while (it.hasNext()) {
                            it.next().clear();
                            it.remove();
                        }
                        this.f106158N0.clear();
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
    public void mo20656Y(g510 g510Var, uow uowVar) {
        int i;
        int i2;
        super.mo20656Y(g510Var, uowVar);
        if (uowVar == null) {
            return;
        }
        synchronized (this.f106151G0) {
            try {
                nsx nsxVar = this.f106163S;
                if (nsxVar != null) {
                    this.f106187i1 = uowVar;
                    nsxVar.m164655h();
                    this.f106163S = null;
                    uow uowVar2 = this.f106187i1;
                    int i3 = uowVar2.f175494m;
                    int i4 = uowVar2.f175496n;
                    if (uowVar.f180161F0) {
                        i2 = i3;
                        i = i4;
                    } else {
                        i = i3;
                        i2 = i4;
                    }
                    int i5 = uowVar2.f180160E0;
                    int i6 = uowVar2.f175451H;
                    int i7 = uowVar2.f175459P;
                    int i8 = uowVar2.f175461R;
                    int i9 = uowVar2.f175462S;
                    nsx nsxVarMo20752G2 = mo20752G2();
                    this.f106163S = nsxVarMo20752G2;
                    if (nsxVarMo20752G2 == null) {
                        return;
                    }
                    if (!this.f106177Z) {
                        nsxVarMo20752G2.m164653f(this.f15000s.f180163H0 ? "video/hevc" : YtVideoEncoder.MIME_TYPE, i, i2, i5, i6, 1, nsx.f143548k);
                    }
                    int iM131914F2 = m131914F2((int) this.f14987H.f191059d);
                    this.f106163S.m164651d(i7, 16, i8, i9, i8 * 1024, iM131914F2);
                    this.f14988I.m122843l("resetCodec.base", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i5), Integer.valueOf(i6), 1, Integer.valueOf(i7), 16, Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(iM131914F2));
                    int iMo164654g = this.f106163S.mo164654g(this.f106169V);
                    if (iMo164654g != 0) {
                        this.f14987H.f191117y0 = iMo164654g;
                        this.f106163S.m164655h();
                        this.f106169V = null;
                        this.f106163S = null;
                    }
                    g220 g220Var = this.f106169V;
                    if (g220Var != null) {
                        g220Var.mo20755O1();
                    }
                    this.f106149E0 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.zej, p153l.wej
    public void destroy() {
        super.destroy();
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: e0 */
    public Surface mo20659e0() {
        nsx nsxVar = this.f106163S;
        if (nsxVar == null) {
            return null;
        }
        this.f106149E0 = false;
        return nsxVar.m164650b();
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: f */
    public void mo20661f() {
        super.mo20661f();
        synchronized (this.f106151G0) {
            this.f106150F0 = true;
            release();
        }
    }

    /* JADX INFO: renamed from: m1 */
    public void mo20664m1(ByteBuffer byteBuffer) {
        if (this.f106187i1.f175502q) {
            m131918N2(byteBuffer);
        }
    }

    @Override // p153l.wej
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
    }

    /* JADX INFO: renamed from: v0 */
    public void mo20669v0(ByteBuffer byteBuffer) {
        uow uowVar;
        if (!this.f106174X0 || (uowVar = this.f106187i1) == null || uowVar.f175471a0) {
            return;
        }
        m131917M2(byteBuffer);
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: H0 */
    public void mo20649H0(boolean z) {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: y */
    public void mo20670y(int i, int i2) {
    }

    /* JADX INFO: renamed from: y0 */
    public void mo20671y0(int i, int i2, int i3) {
    }
}
