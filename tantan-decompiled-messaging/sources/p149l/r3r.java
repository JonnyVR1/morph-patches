package p149l;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.immomo.mediabase.AudioMixerNative;
import com.immomo.mediabase.AudioPlayer;
import com.immomo.mediacore.audio.AudioProcess;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes8.dex */
public class r3r implements ngd.InterfaceC18692a {

    /* JADX INFO: renamed from: A */
    private static String f157553A = "";

    /* JADX INFO: renamed from: B */
    private static String f157554B = "";

    /* JADX INFO: renamed from: C */
    private static ngd f157555C = null;

    /* JADX INFO: renamed from: D */
    private static boolean f157556D = false;

    /* JADX INFO: renamed from: E */
    private static boolean f157557E = false;

    /* JADX INFO: renamed from: F */
    private static boolean f157558F = false;

    /* JADX INFO: renamed from: G */
    private static long f157559G = 0;

    /* JADX INFO: renamed from: H */
    private static int f157560H = 44100;

    /* JADX INFO: renamed from: I */
    private static int f157561I = 2;

    /* JADX INFO: renamed from: J */
    private static int f157562J = 16;

    /* JADX INFO: renamed from: K */
    private static boolean f157563K = false;

    /* JADX INFO: renamed from: L */
    private static int f157564L = 1;

    /* JADX INFO: renamed from: y */
    protected static za1 f157565y = null;

    /* JADX INFO: renamed from: z */
    private static String f157566z = "";

    /* JADX INFO: renamed from: d */
    private int f157570d;

    /* JADX INFO: renamed from: i */
    private C19633c f157575i;

    /* JADX INFO: renamed from: j */
    private C19632b f157576j;

    /* JADX INFO: renamed from: k */
    private AudioProcess f157577k;

    /* JADX INFO: renamed from: l */
    private AudioProcess f157578l;

    /* JADX INFO: renamed from: q */
    private int f157583q;

    /* JADX INFO: renamed from: a */
    RandomAccessFile f157567a = null;

    /* JADX INFO: renamed from: b */
    private boolean f157568b = true;

    /* JADX INFO: renamed from: c */
    private long f157569c = 0;

    /* JADX INFO: renamed from: e */
    private long f157571e = 0;

    /* JADX INFO: renamed from: f */
    private int f157572f = -1;

    /* JADX INFO: renamed from: g */
    private float f157573g = 1.0f;

    /* JADX INFO: renamed from: h */
    private int f157574h = 0;

    /* JADX INFO: renamed from: m */
    private int f157579m = 200;

    /* JADX INFO: renamed from: n */
    private int f157580n = 0;

    /* JADX INFO: renamed from: o */
    private boolean f157581o = false;

    /* JADX INFO: renamed from: p */
    private LinkedBlockingQueue<ByteBuffer> f157582p = new LinkedBlockingQueue<>();

    /* JADX INFO: renamed from: r */
    private boolean f157584r = true;

    /* JADX INFO: renamed from: s */
    private byte[] f157585s = null;

    /* JADX INFO: renamed from: t */
    private int f157586t = 0;

    /* JADX INFO: renamed from: u */
    private ByteBuffer f157587u = null;

    /* JADX INFO: renamed from: v */
    private ByteBuffer f157588v = ByteBuffer.allocate(2048);

    /* JADX INFO: renamed from: w */
    private boolean f157589w = false;

    /* JADX INFO: renamed from: x */
    private int f157590x = 3;

    /* JADX INFO: renamed from: l.r3r$a */
    public class C19631a implements ngd.InterfaceC18692a {
        @Override // p149l.ngd.InterfaceC18692a
        /* JADX INFO: renamed from: a */
        public void mo159298a() {
            boolean unused = r3r.f157557E = true;
            za1 za1Var = r3r.f157565y;
            if (za1Var != null) {
                za1Var.mo18373a(null, 12, 0);
            }
            Log.e("HUOHL_KtvPlayer", "***********************伴奏文件解码OK: ");
        }

        @Override // p149l.ngd.InterfaceC18692a
        /* JADX INFO: renamed from: b */
        public void mo159299b() {
            boolean unused = r3r.f157556D = true;
            za1 za1Var = r3r.f157565y;
            if (za1Var != null) {
                za1Var.mo18373a(null, 11, 0);
            }
            Log.e("HUOHL_KtvPlayer", "***********************伴奏文件开始解码: ");
        }

        @Override // p149l.ngd.InterfaceC18692a
        /* JADX INFO: renamed from: c */
        public void mo159300c(long j) {
            long unused = r3r.f157559G = j;
            za1 za1Var = r3r.f157565y;
            if (za1Var != null) {
                za1Var.mo18373a(null, 10, (int) j);
            }
            Log.e("HUOHL_KtvPlayer", "***********************解码 获取伴奏时长: " + r3r.f157559G);
        }

        @Override // p149l.ngd.InterfaceC18692a
        /* JADX INFO: renamed from: d */
        public void mo159301d(int i, String str) {
            boolean unused = r3r.f157558F = true;
            za1 za1Var = r3r.f157565y;
            if (za1Var != null) {
                za1Var.mo18373a(null, 25, 0);
            }
        }
    }

    /* JADX INFO: renamed from: l.r3r$b */
    public class C19632b extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f157591a = false;

        /* JADX INFO: renamed from: b */
        private boolean f157592b = false;

        /* JADX INFO: renamed from: c */
        private boolean f157593c = true;

        /* JADX INFO: renamed from: d */
        private boolean f157594d = false;

        /* JADX INFO: renamed from: e */
        private AudioPlayer f157595e = null;

        /* JADX INFO: renamed from: f */
        private int f157596f = 3;

        public C19632b() {
            setName("HUOHL_KtvPlayer_MusicData");
            start();
        }

        /* JADX INFO: renamed from: a */
        public void m177738a() {
            this.f157593c = true;
        }

        /* JADX INFO: renamed from: b */
        public void m177739b() {
            m177740c();
        }

        /* JADX INFO: renamed from: c */
        public void m177740c() {
            this.f157593c = false;
            this.f157594d = true;
        }

        /* JADX INFO: renamed from: d */
        public void m177741d() {
            this.f157591a = true;
            this.f157592b = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            if (this.f157595e == null) {
                this.f157595e = new AudioPlayer();
                int i = r3r.this.f157590x;
                this.f157596f = i;
                this.f157595e.setStreamType(i);
                this.f157595e.prepare(r3r.f157560H, r3r.f157562J, r3r.f157561I);
            }
            this.f157595e.reset();
            this.f157595e.resume();
            while (!this.f157592b && !this.f157591a) {
                if (this.f157593c) {
                    this.f157595e.pause();
                    this.f157595e.reset();
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException unused) {
                    }
                } else {
                    if (r3r.this.f157589w && this.f157596f != r3r.this.f157590x) {
                        this.f157595e.release();
                        int i2 = r3r.this.f157590x;
                        this.f157596f = i2;
                        this.f157595e.setStreamType(i2);
                        this.f157595e.prepare(r3r.f157560H, r3r.f157562J, r3r.f157561I);
                        r3r.this.f157589w = false;
                        Log.e("HUOHL_KtvPlayer", "run: audiotrack 更新OK： " + r3r.this.f157590x);
                    }
                    if (this.f157594d) {
                        this.f157594d = false;
                        this.f157595e.reset();
                        this.f157595e.resume();
                    }
                    if (r3r.this.f157582p.size() > 4) {
                        for (int i3 = 0; i3 < 4; i3++) {
                            ByteBuffer byteBuffer = (ByteBuffer) r3r.this.f157582p.take();
                            this.f157595e.writeAudio(byteBuffer.array(), byteBuffer.limit());
                            r3r.m177715x(r3r.this, byteBuffer.limit());
                        }
                    }
                }
            }
            this.f157595e.release();
            this.f157595e = null;
        }
    }

    /* JADX INFO: renamed from: l.r3r$c */
    public class C19633c extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f157598a = false;

        /* JADX INFO: renamed from: b */
        private boolean f157599b = false;

        /* JADX INFO: renamed from: c */
        private boolean f157600c = false;

        /* JADX INFO: renamed from: d */
        private boolean f157601d = false;

        /* JADX INFO: renamed from: e */
        private long f157602e = -1;

        /* JADX INFO: renamed from: f */
        private Lock f157603f;

        /* JADX INFO: renamed from: g */
        private Condition f157604g;

        /* JADX INFO: renamed from: h */
        private int f157605h;

        /* JADX INFO: renamed from: i */
        private boolean f157606i;

        /* JADX INFO: renamed from: j */
        private boolean f157607j;

        public C19633c() {
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f157603f = reentrantLock;
            this.f157604g = reentrantLock.newCondition();
            this.f157605h = 0;
            this.f157606i = false;
            this.f157607j = false;
            setName("HUOHL_KtvPlayer_MusicPlay");
            start();
        }

        /* JADX INFO: renamed from: a */
        public void m177742a() {
            this.f157599b = true;
            this.f157598a = true;
            this.f157603f.lock();
            this.f157604g.signalAll();
            this.f157603f.unlock();
            r3r.this.m177724J("===== 伴奏播放 退出");
        }

        /* JADX INFO: renamed from: b */
        public void m177743b(boolean z) {
            if (z) {
                r3r.this.m177724J("===== 伴奏播放 暂停");
            } else if (this.f157602e > 0) {
                r3r.this.m177724J("===== 伴奏继续播放, 伴奏文件恢复到位置：" + this.f157602e);
                this.f157602e = -1L;
            }
            this.f157600c = z;
            this.f157601d = !z;
        }

        /* JADX INFO: renamed from: c */
        public void m177744c(int i) {
            boolean z;
            za1 za1Var;
            while (true) {
                try {
                    z = this.f157607j;
                    if (z) {
                        break;
                    } else {
                        Thread.sleep(10L);
                    }
                } catch (InterruptedException unused) {
                }
            }
            if (!z && (za1Var = r3r.f157565y) != null) {
                za1Var.mo18373a(null, 29, 0);
                return;
            }
            this.f157603f.lock();
            this.f157605h = i;
            r3r.this.f157571e = i;
            this.f157599b = false;
            this.f157600c = false;
            this.f157604g.signalAll();
            this.f157603f.unlock();
            r3r.this.m177724J("===== 开始伴奏播放, 开始时间：" + i);
        }

        /* JADX INFO: renamed from: d */
        public void m177745d() {
            this.f157603f.lock();
            this.f157599b = true;
            this.f157603f.unlock();
            r3r.this.m177724J("===== 伴奏播放 停止");
            Log.e("HUOHL_KtvPlayer", "not playMusic at now");
        }

        /* JADX WARN: Code duplicated, block: B:100:0x013f A[EDGE_INSN: B:100:0x013f->B:57:0x013f BREAK  A[LOOP:1: B:25:0x006e->B:107:0x006e], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:101:0x0072 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:102:0x0137 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:103:0x010c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:104:0x00d3 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:105:0x00c5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:111:0x006e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:23:0x0060  */
        /* JADX WARN: Code duplicated, block: B:29:0x007a  */
        /* JADX WARN: Code duplicated, block: B:32:0x0083 A[EDGE_INSN: B:32:0x0083->B:57:0x013f BREAK  A[LOOP:1: B:25:0x006e->B:107:0x006e]] */
        /* JADX WARN: Code duplicated, block: B:33:0x0095  */
        /* JADX WARN: Code duplicated, block: B:37:0x009f A[Catch: IOException | InterruptedException | Exception -> 0x006e, TryCatch #3 {IOException | InterruptedException | Exception -> 0x006e, blocks: (B:35:0x0099, B:37:0x009f, B:38:0x00c1, B:65:0x016e), top: B:82:0x0099 }] */
        /* JADX WARN: Code duplicated, block: B:50:0x0110  */
        /* JADX WARN: Code duplicated, block: B:52:0x0116  */
        /* JADX WARN: Code duplicated, block: B:80:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:82:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:98:0x00ed A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:99:0x016c A[SYNTHETIC] */
        /* JADX WARN: Instruction removed from duplicated block: B:37:0x009f, please report this as an issue */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws IOException {
            za1 za1Var;
            int i;
            r3r r3rVar;
            boolean z;
            r3r r3rVar2;
            byte[] bArr = new byte[r3r.this.f157570d * 4];
            while (!this.f157598a) {
                try {
                    if (!r3r.f157563K) {
                        if (r3r.f157556D) {
                            za1 za1Var2 = r3r.f157565y;
                            if (za1Var2 != null) {
                                za1Var2.mo18373a(null, 14, 0);
                            }
                            boolean unused = r3r.f157563K = true;
                        } else {
                            try {
                                Thread.sleep(100L);
                            } catch (InterruptedException unused2) {
                                this.f157603f.lock();
                                this.f157607j = true;
                                Log.e("HUOHL_KtvPlayer", "***********伴奏播放:wait playMusic task***************");
                                this.f157604g.await();
                                Log.e("HUOHL_KtvPlayer", "***********伴奏播放:wait Signal*******************");
                                this.f157603f.unlock();
                                Log.e("HUOHL_KtvPlayer", "==============伴奏播放: PlayJob PlayStart================");
                                za1Var = r3r.f157565y;
                                if (za1Var != null) {
                                    za1Var.mo18373a(null, 11, 0);
                                }
                                this.f157601d = true;
                                r3r.this.f157569c = 0L;
                                while (true) {
                                    if (this.f157599b) {
                                        if (r3r.this.f157568b) {
                                            Log.e("HUOHL_KtvPlayer", "===============伴奏播放: StopPlay ===============");
                                        }
                                        if (r3r.f157565y != null) {
                                            break;
                                        }
                                        r3r r3rVar3 = r3r.this;
                                        r3rVar3.m177719E(r3rVar3.f157569c);
                                        r3r.f157565y.mo18373a(null, 18, 0);
                                        break;
                                    }
                                    if (this.f157600c) {
                                        try {
                                            if (this.f157602e < 0) {
                                                this.f157602e = r3r.this.f157567a.getFilePointer();
                                                r3r.this.m177724J("===== 伴奏暂停播放，当前播放位置：" + this.f157602e);
                                            }
                                            Thread.sleep(100L);
                                        } catch (IOException | InterruptedException | Exception unused3) {
                                        }
                                    } else {
                                        if (r3r.this.f157567a == null) {
                                            try {
                                                z = r3r.f157556D;
                                                r3rVar2 = r3r.this;
                                                if (z) {
                                                    r3rVar2.f157567a = new RandomAccessFile(new File(r3r.f157553A), "r");
                                                    r3r.this.m177724J("======打开PCM文件 开始读取。。。。");
                                                } else {
                                                    r3rVar2.m177724J("======解码未开始, PCM 文件不存在, " + r3r.f157553A);
                                                    Thread.sleep(500L);
                                                }
                                            } catch (Exception unused4) {
                                            }
                                        }
                                        i = this.f157605h;
                                        if (i > 0) {
                                            r3rVar = r3r.this;
                                            if (r3rVar.f157567a != null) {
                                                long jM177723I = (int) r3rVar.m177723I(i);
                                                r3r.this.f157567a.seek(jM177723I);
                                                r3r.this.f157569c = jM177723I;
                                                this.f157605h = 0;
                                            }
                                        }
                                        if (r3r.this.f157582p.size() < 20) {
                                            Thread.sleep(10L);
                                        } else if (r3r.this.m177728O() < 0) {
                                            break;
                                        }
                                    }
                                }
                                this.f157600c = false;
                                this.f157601d = false;
                                r3r.this.f157571e = 0L;
                                if (r3r.f157565y == null) {
                                }
                            }
                        }
                    }
                    this.f157607j = true;
                    Log.e("HUOHL_KtvPlayer", "***********伴奏播放:wait playMusic task***************");
                    this.f157604g.await();
                    Log.e("HUOHL_KtvPlayer", "***********伴奏播放:wait Signal*******************");
                    while (true) {
                        if (this.f157599b) {
                            if (r3r.this.f157568b) {
                                Log.e("HUOHL_KtvPlayer", "===============伴奏播放: StopPlay ===============");
                            }
                            if (r3r.f157565y != null) {
                                break;
                            }
                            r3r r3rVar4 = r3r.this;
                            r3rVar4.m177719E(r3rVar4.f157569c);
                            r3r.f157565y.mo18373a(null, 18, 0);
                            break;
                        }
                        if (this.f157600c) {
                            if (this.f157602e < 0) {
                                this.f157602e = r3r.this.f157567a.getFilePointer();
                                r3r.this.m177724J("===== 伴奏暂停播放，当前播放位置：" + this.f157602e);
                            }
                            Thread.sleep(100L);
                        } else {
                            if (r3r.this.f157567a == null) {
                                z = r3r.f157556D;
                                r3rVar2 = r3r.this;
                                if (z) {
                                    r3rVar2.f157567a = new RandomAccessFile(new File(r3r.f157553A), "r");
                                    r3r.this.m177724J("======打开PCM文件 开始读取。。。。");
                                } else {
                                    r3rVar2.m177724J("======解码未开始, PCM 文件不存在, " + r3r.f157553A);
                                    Thread.sleep(500L);
                                }
                            }
                            i = this.f157605h;
                            if (i > 0) {
                                r3rVar = r3r.this;
                                if (r3rVar.f157567a != null) {
                                    long jM177723I2 = (int) r3rVar.m177723I(i);
                                    r3r.this.f157567a.seek(jM177723I2);
                                    r3r.this.f157569c = jM177723I2;
                                    this.f157605h = 0;
                                }
                            }
                            if (r3r.this.f157582p.size() < 20) {
                                Thread.sleep(10L);
                            } else if (r3r.this.m177728O() < 0) {
                                break;
                                break;
                            }
                        }
                    }
                } catch (Exception unused5) {
                } catch (Throwable th) {
                    this.f157603f.unlock();
                    throw th;
                }
                this.f157603f.lock();
                this.f157603f.unlock();
                Log.e("HUOHL_KtvPlayer", "==============伴奏播放: PlayJob PlayStart================");
                za1Var = r3r.f157565y;
                if (za1Var != null) {
                    za1Var.mo18373a(null, 11, 0);
                }
                this.f157601d = true;
                r3r.this.f157569c = 0L;
                this.f157600c = false;
                this.f157601d = false;
                r3r.this.f157571e = 0L;
                if (r3r.f157565y == null && r3r.this.f157569c > 0 && !this.f157599b) {
                    r3r r3rVar5 = r3r.this;
                    r3rVar5.m177719E(r3rVar5.f157569c);
                    r3r.f157565y.mo18373a(null, 19, 0);
                }
            }
            if (r3r.this.f157568b) {
                Log.e("HUOHL_KtvPlayer", "==================伴奏播放: Exit==================");
            }
            if (r3r.f157565y != null) {
                r3r r3rVar6 = r3r.this;
                r3rVar6.m177719E(r3rVar6.f157569c);
                r3r.f157565y.mo18373a(null, 20, 0);
            }
        }
    }

    public r3r(String str, int i, int i2, AudioProcess audioProcess) {
        this.f157570d = 0;
        this.f157575i = null;
        this.f157576j = null;
        this.f157583q = 2;
        f157566z = str;
        f157560H = i;
        this.f157570d = f157561I * 2048;
        this.f157577k = audioProcess;
        AudioProcess audioProcess2 = new AudioProcess();
        this.f157578l = audioProcess2;
        audioProcess2.openSabineEf(f157560H, this.f157583q, 1024);
        this.f157583q = i2;
        Log.e("HUOHL_KtvPlayer", "KtvPlayer: 设置音频输出通道数：" + this.f157583q);
        f157563K = false;
        this.f157576j = new C19632b();
        this.f157575i = new C19633c();
    }

    /* JADX INFO: renamed from: B */
    public static String m177687B(String str, String str2) {
        return new File(new File(str), str2).getPath();
    }

    /* JADX INFO: renamed from: C */
    public static void m177688C(String str, String str2) {
        f157566z = str2;
        f157554B = str;
        f157563K = false;
        String str3 = m177690K(str) + ".pcm";
        String strM177687B = m177687B(str2, str3);
        if (strM177687B.equals(f157553A) && f157556D && f157557E) {
            Log.e("HUOHL_KtvPlayer", "=========== 伴奏文件的PCM已经存在，伴奏：" + str);
            Log.e("HUOHL_KtvPlayer", "=========== 伴奏文件的PCM已经存在，PCM文件：".concat(str3));
            return;
        }
        if (f157553A.length() > 0) {
            new File(f157553A).delete();
        }
        f157556D = false;
        f157557E = false;
        f157558F = false;
        f157553A = strM177687B;
        f157559G = 0L;
        m177691Q();
        m177689D().m159296b(new C19631a());
        m177689D().m159295a(str, f157553A, f157560H, f157561I, f157562J);
    }

    /* JADX INFO: renamed from: D */
    public static ngd m177689D() {
        if (f157555C == null) {
            f157555C = new ngd();
        }
        return f157555C;
    }

    /* JADX INFO: renamed from: K */
    public static String m177690K(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String str2 = "";
            for (byte b : MessageDigest.getInstance("MD5").digest(str.getBytes())) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    hexString = "0" + hexString;
                }
                str2 = str2 + hexString;
            }
            return str2;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    @RequiresApi(api = 16)
    /* JADX INFO: renamed from: Q */
    public static void m177691Q() {
        ngd ngdVar = f157555C;
        if (ngdVar != null) {
            ngdVar.m159297c();
            f157555C = null;
        }
    }

    /* JADX INFO: renamed from: R */
    public static void m177692R(int i, int i2) {
        za1 za1Var = f157565y;
        if (za1Var != null) {
            za1Var.mo18373a(null, i, i2);
        }
    }

    /* JADX INFO: renamed from: Y */
    public static void m177693Y(int i) {
        f157564L = i;
    }

    /* JADX INFO: renamed from: Z */
    public static void m177694Z(za1 za1Var) {
        f157565y = za1Var;
    }

    /* JADX INFO: renamed from: a0 */
    public static byte[] m177695a0(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i / 2];
        for (int i2 = 0; i2 < i / 4; i2++) {
            int i3 = i2 * 2;
            int i4 = i2 * 4;
            bArr2[i3] = bArr[i4];
            bArr2[i3 + 1] = bArr[i4 + 1];
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ long m177715x(r3r r3rVar, long j) {
        long j2 = r3rVar.f157569c + j;
        r3rVar.f157569c = j2;
        return j2;
    }

    /* JADX INFO: renamed from: A */
    public ByteBuffer m177718A(byte[] bArr, int i) {
        AudioProcess audioProcess;
        ByteBuffer byteBuffer = this.f157587u;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.f157587u = ByteBuffer.allocate(i * 2);
        }
        this.f157587u.clear();
        if (this.f157577k == null) {
            this.f157587u.put(bArr, 0, i);
            this.f157587u.flip();
            return this.f157587u;
        }
        if (this.f157581o && this.f157584r) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2048);
            Arrays.fill(byteBufferAllocate.array(), (byte) 0);
            long jM177723I = m177723I(this.f157579m);
            if (this.f157583q == 1) {
                jM177723I /= 2;
            }
            mpd0 mpd0Var = new mpd0(byteBufferAllocate.array(), System.nanoTime() / 1000, f157561I);
            for (int i2 = 0; i2 < jM177723I / 2048; i2++) {
                this.f157577k.putSurroundExtraData(mpd0Var);
            }
            this.f157581o = false;
            this.f157586t = 0;
            this.f157588v.clear();
        }
        int i3 = 0;
        while (true) {
            int i4 = i3 * 2048;
            if (i4 >= i) {
                this.f157587u.flip();
                return this.f157587u;
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(2048);
            byteBufferAllocate2.clear();
            byteBufferAllocate2.put(bArr, i4, 2048);
            byteBufferAllocate2.flip();
            if (this.f157574h != 0 && (audioProcess = this.f157578l) != null) {
                audioProcess.processAudioPitch(byteBufferAllocate2.array(), 2048, this.f157574h);
            }
            ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(2048);
            byteBufferAllocate3.clear();
            AudioMixerNative.setVolume_Native(byteBufferAllocate2.array(), 2048, this.f157573g, byteBufferAllocate3.array());
            ByteBuffer byteBuffer2 = this.f157587u;
            if (byteBuffer2 != null && byteBuffer2.remaining() >= 2048) {
                this.f157587u.put(byteBufferAllocate3.array(), 0, 2048);
            }
            this.f157582p.offer(byteBufferAllocate3);
            i3++;
            this.f157586t++;
            if (this.f157584r) {
                if (this.f157583q == 1) {
                    this.f157588v.put(m177695a0(byteBufferAllocate3.array(), 2048), 0, 1024);
                    if (this.f157586t % 2 == 0) {
                        this.f157588v.flip();
                        byte[] bArr2 = new byte[2048];
                        System.arraycopy(this.f157588v.array(), 0, bArr2, 0, 2048);
                        this.f157577k.putSurroundExtraData(new mpd0(bArr2, System.nanoTime() / 1000, f157561I));
                        this.f157588v.clear();
                    }
                } else {
                    this.f157577k.putSurroundExtraData(new mpd0(byteBufferAllocate3.array(), System.nanoTime() / 1000, f157561I));
                }
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public long m177719E(long j) {
        return (long) ((j * 1000.0f) / ((f157560H * f157561I) * 2));
    }

    /* JADX INFO: renamed from: F */
    public long m177720F() {
        return this.f157571e;
    }

    /* JADX INFO: renamed from: G */
    public long m177721G() {
        RandomAccessFile randomAccessFile;
        long j = f157559G;
        if (j > 0 || !f157557E || (randomAccessFile = this.f157567a) == null) {
            return j;
        }
        try {
            return m177719E(randomAccessFile.length());
        } catch (IOException unused) {
            return j;
        }
    }

    /* JADX INFO: renamed from: H */
    public float m177722H() {
        return this.f157573g;
    }

    /* JADX INFO: renamed from: I */
    public long m177723I(long j) {
        return ((long) (((j * 1.0f) * f157560H) / 1000.0f)) * ((long) f157561I) * 2;
    }

    /* JADX INFO: renamed from: J */
    public void m177724J(String str) {
        if (this.f157568b) {
            Log.e("HUOHL_KtvPlayer", str);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m177725L() {
        C19633c c19633c = this.f157575i;
        if (c19633c != null) {
            c19633c.m177743b(true);
        }
        C19632b c19632b = this.f157576j;
        if (c19632b != null) {
            c19632b.m177738a();
        }
    }

    /* JADX INFO: renamed from: M */
    public void m177726M(int i) {
        this.f157581o = true;
        if (!f157556D) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
            }
        }
        C19633c c19633c = this.f157575i;
        if (c19633c != null && f157556D) {
            c19633c.m177744c(i);
        }
        C19632b c19632b = this.f157576j;
        if (c19632b != null) {
            c19632b.m177739b();
        }
    }

    /* JADX INFO: renamed from: N */
    public void m177727N(int i, boolean z) {
        this.f157584r = z;
        m177726M(i);
    }

    /* JADX INFO: renamed from: O */
    public int m177728O() {
        int i;
        za1 za1Var;
        RandomAccessFile randomAccessFile = this.f157567a;
        if (randomAccessFile == null) {
            za1 za1Var2 = f157565y;
            if (za1Var2 != null) {
                za1Var2.mo18373a(null, 26, 0);
            }
            return -2;
        }
        try {
            if (randomAccessFile.length() <= 0 && (za1Var = f157565y) != null) {
                za1Var.mo18373a(null, 27, 0);
            }
        } catch (IOException unused) {
        }
        if (this.f157585s == null) {
            this.f157585s = new byte[8192];
        }
        try {
            int i2 = this.f157572f;
            if (i2 >= 0) {
                if (this.f157567a != null) {
                    this.f157567a.seek(m177723I(i2));
                    m177724J("##### 伴奏文件 seek to: " + this.f157572f);
                    this.f157582p.clear();
                }
                this.f157572f = -1;
            }
        } catch (IOException e) {
            m177724J("##### 跳过前奏或者SEEK Error:" + e.toString());
        }
        try {
            RandomAccessFile randomAccessFile2 = this.f157567a;
            if (randomAccessFile2 != null) {
                this.f157571e = m177719E(randomAccessFile2.getFilePointer());
                i = this.f157567a.read(this.f157585s);
            } else {
                i = 0;
            }
        } catch (IOException e2) {
            m177724J("exception:" + e2.toString());
        }
        if (i == -1) {
            m177724J("##### 伴奏播放完成，readPCMData: BUFFER_FLAG_END_OF_STREAM");
            za1 za1Var3 = f157565y;
            if (za1Var3 != null) {
                za1Var3.mo18373a(null, 19, 0);
            }
            return -1;
        }
        if (i == 0) {
            m177724J("##### Error When 伴奏播放读取文件，readPCMData: read error, no data");
            za1 za1Var4 = f157565y;
            if (za1Var4 != null) {
                za1Var4.mo18373a(null, 28, 0);
            }
            return -2;
        }
        ByteBuffer byteBufferM177718A = m177718A(this.f157585s, i);
        if (byteBufferM177718A == null) {
            Log.e("HUOHL_KtvPlayer", "##### ERROR 应用声音特效失败========== ");
        } else if (byteBufferM177718A.limit() != i) {
            m177724J("^^^^^^^^^^^^^音效处理失败^^^^^^^^^^^^^^^^^^^^^^");
        } else {
            byteBufferM177718A.get(this.f157585s, 0, i);
        }
        return i;
    }

    /* JADX INFO: renamed from: P */
    public void m177729P() {
        C19633c c19633c = this.f157575i;
        if (c19633c != null) {
            c19633c.m177745d();
            this.f157575i.m177742a();
            try {
                this.f157575i.join();
                this.f157575i = null;
            } catch (InterruptedException unused) {
                m177724J("======= ERROR, RecordPcmEx2 播放线程退出异常..............");
            }
        }
        C19632b c19632b = this.f157576j;
        if (c19632b != null) {
            c19632b.m177741d();
            try {
                this.f157576j.join();
                this.f157576j = null;
            } catch (InterruptedException unused2) {
                m177724J("======= ERROR, RecordPcmEx2 播放线程退出异常..............");
            }
        }
        RandomAccessFile randomAccessFile = this.f157567a;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
                this.f157567a = null;
            } catch (IOException unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public void m177730S() {
        C19633c c19633c = this.f157575i;
        if (c19633c != null) {
            c19633c.m177743b(false);
        }
        C19632b c19632b = this.f157576j;
        if (c19632b != null) {
            c19632b.m177740c();
        }
    }

    /* JADX INFO: renamed from: T */
    public void m177731T(int i) {
        this.f157572f = i;
    }

    /* JADX INFO: renamed from: U */
    public void m177732U(int i) {
        if (this.f157590x != i) {
            this.f157590x = i;
            this.f157589w = true;
        }
    }

    /* JADX INFO: renamed from: V */
    public void m177733V(int i) {
        this.f157574h = i;
    }

    /* JADX INFO: renamed from: W */
    public void m177734W(float f) {
        this.f157573g = f;
    }

    /* JADX INFO: renamed from: X */
    public void m177735X(String str, String str2) {
        f157563K = false;
        Log.e("HUOHL_KtvPlayer", "setPlayURL: " + str);
        m177688C(str, str2);
        try {
            this.f157567a = new RandomAccessFile(new File(f157553A), "r");
        } catch (IOException unused) {
        }
    }

    @Override // p149l.ngd.InterfaceC18692a
    /* JADX INFO: renamed from: a */
    public void mo159298a() {
        f157557E = true;
        za1 za1Var = f157565y;
        if (za1Var != null) {
            za1Var.mo18373a(null, 12, 0);
        }
    }

    @Override // p149l.ngd.InterfaceC18692a
    /* JADX INFO: renamed from: b */
    public void mo159299b() {
        f157556D = true;
        try {
            this.f157567a = new RandomAccessFile(new File(f157553A), "r");
        } catch (IOException unused) {
        }
        za1 za1Var = f157565y;
        if (za1Var != null) {
            za1Var.mo18373a(null, 11, 0);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m177736b0() {
        C19633c c19633c = this.f157575i;
        if (c19633c != null) {
            c19633c.m177745d();
        }
    }

    @Override // p149l.ngd.InterfaceC18692a
    /* JADX INFO: renamed from: c */
    public void mo159300c(long j) {
        f157559G = j;
    }

    /* JADX INFO: renamed from: c0 */
    public void m177737c0(AudioProcess audioProcess, int i) {
        if (audioProcess != null) {
            if (audioProcess == this.f157577k && i == this.f157583q) {
                return;
            }
            audioProcess.clearSurroundExtraFrames();
            this.f157577k = audioProcess;
            this.f157583q = i;
            Log.e("HUOHL_KtvPlayer", "KtvPlayer: 更新音频输出通道数：" + this.f157583q);
        }
    }

    @Override // p149l.ngd.InterfaceC18692a
    /* JADX INFO: renamed from: d */
    public void mo159301d(int i, String str) {
        za1 za1Var = f157565y;
        if (za1Var != null) {
            za1Var.mo18373a(null, 25, 0);
        }
    }
}
