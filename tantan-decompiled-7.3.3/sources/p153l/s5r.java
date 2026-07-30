package p153l;

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
public class s5r implements thd.InterfaceC20318a {

    /* JADX INFO: renamed from: A */
    private static String f166448A = "";

    /* JADX INFO: renamed from: B */
    private static String f166449B = "";

    /* JADX INFO: renamed from: C */
    private static thd f166450C = null;

    /* JADX INFO: renamed from: D */
    private static boolean f166451D = false;

    /* JADX INFO: renamed from: E */
    private static boolean f166452E = false;

    /* JADX INFO: renamed from: F */
    private static boolean f166453F = false;

    /* JADX INFO: renamed from: G */
    private static long f166454G = 0;

    /* JADX INFO: renamed from: H */
    private static int f166455H = 44100;

    /* JADX INFO: renamed from: I */
    private static int f166456I = 2;

    /* JADX INFO: renamed from: J */
    private static int f166457J = 16;

    /* JADX INFO: renamed from: K */
    private static boolean f166458K = false;

    /* JADX INFO: renamed from: L */
    private static int f166459L = 1;

    /* JADX INFO: renamed from: y */
    protected static gb1 f166460y = null;

    /* JADX INFO: renamed from: z */
    private static String f166461z = "";

    /* JADX INFO: renamed from: d */
    private int f166465d;

    /* JADX INFO: renamed from: i */
    private C19991c f166470i;

    /* JADX INFO: renamed from: j */
    private C19990b f166471j;

    /* JADX INFO: renamed from: k */
    private AudioProcess f166472k;

    /* JADX INFO: renamed from: l */
    private AudioProcess f166473l;

    /* JADX INFO: renamed from: q */
    private int f166478q;

    /* JADX INFO: renamed from: a */
    RandomAccessFile f166462a = null;

    /* JADX INFO: renamed from: b */
    private boolean f166463b = true;

    /* JADX INFO: renamed from: c */
    private long f166464c = 0;

    /* JADX INFO: renamed from: e */
    private long f166466e = 0;

    /* JADX INFO: renamed from: f */
    private int f166467f = -1;

    /* JADX INFO: renamed from: g */
    private float f166468g = 1.0f;

    /* JADX INFO: renamed from: h */
    private int f166469h = 0;

    /* JADX INFO: renamed from: m */
    private int f166474m = 200;

    /* JADX INFO: renamed from: n */
    private int f166475n = 0;

    /* JADX INFO: renamed from: o */
    private boolean f166476o = false;

    /* JADX INFO: renamed from: p */
    private LinkedBlockingQueue<ByteBuffer> f166477p = new LinkedBlockingQueue<>();

    /* JADX INFO: renamed from: r */
    private boolean f166479r = true;

    /* JADX INFO: renamed from: s */
    private byte[] f166480s = null;

    /* JADX INFO: renamed from: t */
    private int f166481t = 0;

    /* JADX INFO: renamed from: u */
    private ByteBuffer f166482u = null;

    /* JADX INFO: renamed from: v */
    private ByteBuffer f166483v = ByteBuffer.allocate(2048);

    /* JADX INFO: renamed from: w */
    private boolean f166484w = false;

    /* JADX INFO: renamed from: x */
    private int f166485x = 3;

    /* JADX INFO: renamed from: l.s5r$a */
    public class C19989a implements thd.InterfaceC20318a {
        @Override // p153l.thd.InterfaceC20318a
        /* JADX INFO: renamed from: a */
        public void mo184792a() {
            boolean unused = s5r.f166452E = true;
            gb1 gb1Var = s5r.f166460y;
            if (gb1Var != null) {
                gb1Var.mo19382a(null, 12, 0);
            }
            Log.e("HUOHL_KtvPlayer", "***********************伴奏文件解码OK: ");
        }

        @Override // p153l.thd.InterfaceC20318a
        /* JADX INFO: renamed from: b */
        public void mo184793b() {
            boolean unused = s5r.f166451D = true;
            gb1 gb1Var = s5r.f166460y;
            if (gb1Var != null) {
                gb1Var.mo19382a(null, 11, 0);
            }
            Log.e("HUOHL_KtvPlayer", "***********************伴奏文件开始解码: ");
        }

        @Override // p153l.thd.InterfaceC20318a
        /* JADX INFO: renamed from: c */
        public void mo184795c(long j) {
            long unused = s5r.f166454G = j;
            gb1 gb1Var = s5r.f166460y;
            if (gb1Var != null) {
                gb1Var.mo19382a(null, 10, (int) j);
            }
            Log.e("HUOHL_KtvPlayer", "***********************解码 获取伴奏时长: " + s5r.f166454G);
        }

        @Override // p153l.thd.InterfaceC20318a
        /* JADX INFO: renamed from: d */
        public void mo184797d(int i, String str) {
            boolean unused = s5r.f166453F = true;
            gb1 gb1Var = s5r.f166460y;
            if (gb1Var != null) {
                gb1Var.mo19382a(null, 25, 0);
            }
        }
    }

    /* JADX INFO: renamed from: l.s5r$b */
    public class C19990b extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f166486a = false;

        /* JADX INFO: renamed from: b */
        private boolean f166487b = false;

        /* JADX INFO: renamed from: c */
        private boolean f166488c = true;

        /* JADX INFO: renamed from: d */
        private boolean f166489d = false;

        /* JADX INFO: renamed from: e */
        private AudioPlayer f166490e = null;

        /* JADX INFO: renamed from: f */
        private int f166491f = 3;

        public C19990b() {
            setName("HUOHL_KtvPlayer_MusicData");
            start();
        }

        /* JADX INFO: renamed from: a */
        public void m184798a() {
            this.f166488c = true;
        }

        /* JADX INFO: renamed from: b */
        public void m184799b() {
            m184800c();
        }

        /* JADX INFO: renamed from: c */
        public void m184800c() {
            this.f166488c = false;
            this.f166489d = true;
        }

        /* JADX INFO: renamed from: d */
        public void m184801d() {
            this.f166486a = true;
            this.f166487b = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            if (this.f166490e == null) {
                this.f166490e = new AudioPlayer();
                int i = s5r.this.f166485x;
                this.f166491f = i;
                this.f166490e.setStreamType(i);
                this.f166490e.prepare(s5r.f166455H, s5r.f166457J, s5r.f166456I);
            }
            this.f166490e.reset();
            this.f166490e.resume();
            while (!this.f166487b && !this.f166486a) {
                if (this.f166488c) {
                    this.f166490e.pause();
                    this.f166490e.reset();
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException unused) {
                    }
                } else {
                    if (s5r.this.f166484w && this.f166491f != s5r.this.f166485x) {
                        this.f166490e.release();
                        int i2 = s5r.this.f166485x;
                        this.f166491f = i2;
                        this.f166490e.setStreamType(i2);
                        this.f166490e.prepare(s5r.f166455H, s5r.f166457J, s5r.f166456I);
                        s5r.this.f166484w = false;
                        Log.e("HUOHL_KtvPlayer", "run: audiotrack 更新OK： " + s5r.this.f166485x);
                    }
                    if (this.f166489d) {
                        this.f166489d = false;
                        this.f166490e.reset();
                        this.f166490e.resume();
                    }
                    if (s5r.this.f166477p.size() > 4) {
                        for (int i3 = 0; i3 < 4; i3++) {
                            ByteBuffer byteBuffer = (ByteBuffer) s5r.this.f166477p.take();
                            this.f166490e.writeAudio(byteBuffer.array(), byteBuffer.limit());
                            s5r.m184771x(s5r.this, byteBuffer.limit());
                        }
                    }
                }
            }
            this.f166490e.release();
            this.f166490e = null;
        }
    }

    /* JADX INFO: renamed from: l.s5r$c */
    public class C19991c extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f166493a = false;

        /* JADX INFO: renamed from: b */
        private boolean f166494b = false;

        /* JADX INFO: renamed from: c */
        private boolean f166495c = false;

        /* JADX INFO: renamed from: d */
        private boolean f166496d = false;

        /* JADX INFO: renamed from: e */
        private long f166497e = -1;

        /* JADX INFO: renamed from: f */
        private Lock f166498f;

        /* JADX INFO: renamed from: g */
        private Condition f166499g;

        /* JADX INFO: renamed from: h */
        private int f166500h;

        /* JADX INFO: renamed from: i */
        private boolean f166501i;

        /* JADX INFO: renamed from: j */
        private boolean f166502j;

        public C19991c() {
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f166498f = reentrantLock;
            this.f166499g = reentrantLock.newCondition();
            this.f166500h = 0;
            this.f166501i = false;
            this.f166502j = false;
            setName("HUOHL_KtvPlayer_MusicPlay");
            start();
        }

        /* JADX INFO: renamed from: a */
        public void m184802a() {
            this.f166494b = true;
            this.f166493a = true;
            this.f166498f.lock();
            this.f166499g.signalAll();
            this.f166498f.unlock();
            s5r.this.m184780J("===== 伴奏播放 退出");
        }

        /* JADX INFO: renamed from: b */
        public void m184803b(boolean z) {
            if (z) {
                s5r.this.m184780J("===== 伴奏播放 暂停");
            } else if (this.f166497e > 0) {
                s5r.this.m184780J("===== 伴奏继续播放, 伴奏文件恢复到位置：" + this.f166497e);
                this.f166497e = -1L;
            }
            this.f166495c = z;
            this.f166496d = !z;
        }

        /* JADX INFO: renamed from: c */
        public void m184804c(int i) {
            boolean z;
            gb1 gb1Var;
            while (true) {
                try {
                    z = this.f166502j;
                    if (z) {
                        break;
                    } else {
                        Thread.sleep(10L);
                    }
                } catch (InterruptedException unused) {
                }
            }
            if (!z && (gb1Var = s5r.f166460y) != null) {
                gb1Var.mo19382a(null, 29, 0);
                return;
            }
            this.f166498f.lock();
            this.f166500h = i;
            s5r.this.f166466e = i;
            this.f166494b = false;
            this.f166495c = false;
            this.f166499g.signalAll();
            this.f166498f.unlock();
            s5r.this.m184780J("===== 开始伴奏播放, 开始时间：" + i);
        }

        /* JADX INFO: renamed from: d */
        public void m184805d() {
            this.f166498f.lock();
            this.f166494b = true;
            this.f166498f.unlock();
            s5r.this.m184780J("===== 伴奏播放 停止");
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
            gb1 gb1Var;
            int i;
            s5r s5rVar;
            boolean z;
            s5r s5rVar2;
            byte[] bArr = new byte[s5r.this.f166465d * 4];
            while (!this.f166493a) {
                try {
                    if (!s5r.f166458K) {
                        if (s5r.f166451D) {
                            gb1 gb1Var2 = s5r.f166460y;
                            if (gb1Var2 != null) {
                                gb1Var2.mo19382a(null, 14, 0);
                            }
                            boolean unused = s5r.f166458K = true;
                        } else {
                            try {
                                Thread.sleep(100L);
                            } catch (InterruptedException unused2) {
                                this.f166498f.lock();
                                this.f166502j = true;
                                Log.e("HUOHL_KtvPlayer", "***********伴奏播放:wait playMusic task***************");
                                this.f166499g.await();
                                Log.e("HUOHL_KtvPlayer", "***********伴奏播放:wait Signal*******************");
                                this.f166498f.unlock();
                                Log.e("HUOHL_KtvPlayer", "==============伴奏播放: PlayJob PlayStart================");
                                gb1Var = s5r.f166460y;
                                if (gb1Var != null) {
                                    gb1Var.mo19382a(null, 11, 0);
                                }
                                this.f166496d = true;
                                s5r.this.f166464c = 0L;
                                while (true) {
                                    if (this.f166494b) {
                                        if (s5r.this.f166463b) {
                                            Log.e("HUOHL_KtvPlayer", "===============伴奏播放: StopPlay ===============");
                                        }
                                        if (s5r.f166460y != null) {
                                            break;
                                        }
                                        s5r s5rVar3 = s5r.this;
                                        s5rVar3.m184775E(s5rVar3.f166464c);
                                        s5r.f166460y.mo19382a(null, 18, 0);
                                        break;
                                    }
                                    if (this.f166495c) {
                                        try {
                                            if (this.f166497e < 0) {
                                                this.f166497e = s5r.this.f166462a.getFilePointer();
                                                s5r.this.m184780J("===== 伴奏暂停播放，当前播放位置：" + this.f166497e);
                                            }
                                            Thread.sleep(100L);
                                        } catch (IOException | InterruptedException | Exception unused3) {
                                        }
                                    } else {
                                        if (s5r.this.f166462a == null) {
                                            try {
                                                z = s5r.f166451D;
                                                s5rVar2 = s5r.this;
                                                if (z) {
                                                    s5rVar2.f166462a = new RandomAccessFile(new File(s5r.f166448A), "r");
                                                    s5r.this.m184780J("======打开PCM文件 开始读取。。。。");
                                                } else {
                                                    s5rVar2.m184780J("======解码未开始, PCM 文件不存在, " + s5r.f166448A);
                                                    Thread.sleep(500L);
                                                }
                                            } catch (Exception unused4) {
                                            }
                                        }
                                        i = this.f166500h;
                                        if (i > 0) {
                                            s5rVar = s5r.this;
                                            if (s5rVar.f166462a != null) {
                                                long jM184779I = (int) s5rVar.m184779I(i);
                                                s5r.this.f166462a.seek(jM184779I);
                                                s5r.this.f166464c = jM184779I;
                                                this.f166500h = 0;
                                            }
                                        }
                                        if (s5r.this.f166477p.size() < 20) {
                                            Thread.sleep(10L);
                                        } else if (s5r.this.m184784O() < 0) {
                                            break;
                                        }
                                    }
                                }
                                this.f166495c = false;
                                this.f166496d = false;
                                s5r.this.f166466e = 0L;
                                if (s5r.f166460y == null) {
                                }
                            }
                        }
                    }
                    this.f166502j = true;
                    Log.e("HUOHL_KtvPlayer", "***********伴奏播放:wait playMusic task***************");
                    this.f166499g.await();
                    Log.e("HUOHL_KtvPlayer", "***********伴奏播放:wait Signal*******************");
                    while (true) {
                        if (this.f166494b) {
                            if (s5r.this.f166463b) {
                                Log.e("HUOHL_KtvPlayer", "===============伴奏播放: StopPlay ===============");
                            }
                            if (s5r.f166460y != null) {
                                break;
                            }
                            s5r s5rVar4 = s5r.this;
                            s5rVar4.m184775E(s5rVar4.f166464c);
                            s5r.f166460y.mo19382a(null, 18, 0);
                            break;
                        }
                        if (this.f166495c) {
                            if (this.f166497e < 0) {
                                this.f166497e = s5r.this.f166462a.getFilePointer();
                                s5r.this.m184780J("===== 伴奏暂停播放，当前播放位置：" + this.f166497e);
                            }
                            Thread.sleep(100L);
                        } else {
                            if (s5r.this.f166462a == null) {
                                z = s5r.f166451D;
                                s5rVar2 = s5r.this;
                                if (z) {
                                    s5rVar2.f166462a = new RandomAccessFile(new File(s5r.f166448A), "r");
                                    s5r.this.m184780J("======打开PCM文件 开始读取。。。。");
                                } else {
                                    s5rVar2.m184780J("======解码未开始, PCM 文件不存在, " + s5r.f166448A);
                                    Thread.sleep(500L);
                                }
                            }
                            i = this.f166500h;
                            if (i > 0) {
                                s5rVar = s5r.this;
                                if (s5rVar.f166462a != null) {
                                    long jM184779I2 = (int) s5rVar.m184779I(i);
                                    s5r.this.f166462a.seek(jM184779I2);
                                    s5r.this.f166464c = jM184779I2;
                                    this.f166500h = 0;
                                }
                            }
                            if (s5r.this.f166477p.size() < 20) {
                                Thread.sleep(10L);
                            } else if (s5r.this.m184784O() < 0) {
                                break;
                                break;
                            }
                        }
                    }
                } catch (Exception unused5) {
                } catch (Throwable th) {
                    this.f166498f.unlock();
                    throw th;
                }
                this.f166498f.lock();
                this.f166498f.unlock();
                Log.e("HUOHL_KtvPlayer", "==============伴奏播放: PlayJob PlayStart================");
                gb1Var = s5r.f166460y;
                if (gb1Var != null) {
                    gb1Var.mo19382a(null, 11, 0);
                }
                this.f166496d = true;
                s5r.this.f166464c = 0L;
                this.f166495c = false;
                this.f166496d = false;
                s5r.this.f166466e = 0L;
                if (s5r.f166460y == null && s5r.this.f166464c > 0 && !this.f166494b) {
                    s5r s5rVar5 = s5r.this;
                    s5rVar5.m184775E(s5rVar5.f166464c);
                    s5r.f166460y.mo19382a(null, 19, 0);
                }
            }
            if (s5r.this.f166463b) {
                Log.e("HUOHL_KtvPlayer", "==================伴奏播放: Exit==================");
            }
            if (s5r.f166460y != null) {
                s5r s5rVar6 = s5r.this;
                s5rVar6.m184775E(s5rVar6.f166464c);
                s5r.f166460y.mo19382a(null, 20, 0);
            }
        }
    }

    public s5r(String str, int i, int i2, AudioProcess audioProcess) {
        this.f166465d = 0;
        this.f166470i = null;
        this.f166471j = null;
        this.f166478q = 2;
        f166461z = str;
        f166455H = i;
        this.f166465d = f166456I * 2048;
        this.f166472k = audioProcess;
        AudioProcess audioProcess2 = new AudioProcess();
        this.f166473l = audioProcess2;
        audioProcess2.openSabineEf(f166455H, this.f166478q, 1024);
        this.f166478q = i2;
        Log.e("HUOHL_KtvPlayer", "KtvPlayer: 设置音频输出通道数：" + this.f166478q);
        f166458K = false;
        this.f166471j = new C19990b();
        this.f166470i = new C19991c();
    }

    /* JADX INFO: renamed from: B */
    public static String m184743B(String str, String str2) {
        return new File(new File(str), str2).getPath();
    }

    /* JADX INFO: renamed from: C */
    public static void m184744C(String str, String str2) {
        f166461z = str2;
        f166449B = str;
        f166458K = false;
        String str3 = m184746K(str) + ".pcm";
        String strM184743B = m184743B(str2, str3);
        if (strM184743B.equals(f166448A) && f166451D && f166452E) {
            Log.e("HUOHL_KtvPlayer", "=========== 伴奏文件的PCM已经存在，伴奏：" + str);
            Log.e("HUOHL_KtvPlayer", "=========== 伴奏文件的PCM已经存在，PCM文件：".concat(str3));
            return;
        }
        if (f166448A.length() > 0) {
            new File(f166448A).delete();
        }
        f166451D = false;
        f166452E = false;
        f166453F = false;
        f166448A = strM184743B;
        f166454G = 0L;
        m184747Q();
        m184745D().m191237b(new C19989a());
        m184745D().m191236a(str, f166448A, f166455H, f166456I, f166457J);
    }

    /* JADX INFO: renamed from: D */
    public static thd m184745D() {
        if (f166450C == null) {
            f166450C = new thd();
        }
        return f166450C;
    }

    /* JADX INFO: renamed from: K */
    public static String m184746K(String str) {
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
    public static void m184747Q() {
        thd thdVar = f166450C;
        if (thdVar != null) {
            thdVar.m191238c();
            f166450C = null;
        }
    }

    /* JADX INFO: renamed from: R */
    public static void m184748R(int i, int i2) {
        gb1 gb1Var = f166460y;
        if (gb1Var != null) {
            gb1Var.mo19382a(null, i, i2);
        }
    }

    /* JADX INFO: renamed from: Y */
    public static void m184749Y(int i) {
        f166459L = i;
    }

    /* JADX INFO: renamed from: Z */
    public static void m184750Z(gb1 gb1Var) {
        f166460y = gb1Var;
    }

    /* JADX INFO: renamed from: a0 */
    public static byte[] m184751a0(byte[] bArr, int i) {
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
    public static /* synthetic */ long m184771x(s5r s5rVar, long j) {
        long j2 = s5rVar.f166464c + j;
        s5rVar.f166464c = j2;
        return j2;
    }

    /* JADX INFO: renamed from: A */
    public ByteBuffer m184774A(byte[] bArr, int i) {
        AudioProcess audioProcess;
        ByteBuffer byteBuffer = this.f166482u;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.f166482u = ByteBuffer.allocate(i * 2);
        }
        this.f166482u.clear();
        if (this.f166472k == null) {
            this.f166482u.put(bArr, 0, i);
            this.f166482u.flip();
            return this.f166482u;
        }
        if (this.f166476o && this.f166479r) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2048);
            Arrays.fill(byteBufferAllocate.array(), (byte) 0);
            long jM184779I = m184779I(this.f166474m);
            if (this.f166478q == 1) {
                jM184779I /= 2;
            }
            oxd0 oxd0Var = new oxd0(byteBufferAllocate.array(), System.nanoTime() / 1000, f166456I);
            for (int i2 = 0; i2 < jM184779I / 2048; i2++) {
                this.f166472k.putSurroundExtraData(oxd0Var);
            }
            this.f166476o = false;
            this.f166481t = 0;
            this.f166483v.clear();
        }
        int i3 = 0;
        while (true) {
            int i4 = i3 * 2048;
            if (i4 >= i) {
                this.f166482u.flip();
                return this.f166482u;
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(2048);
            byteBufferAllocate2.clear();
            byteBufferAllocate2.put(bArr, i4, 2048);
            byteBufferAllocate2.flip();
            if (this.f166469h != 0 && (audioProcess = this.f166473l) != null) {
                audioProcess.processAudioPitch(byteBufferAllocate2.array(), 2048, this.f166469h);
            }
            ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(2048);
            byteBufferAllocate3.clear();
            AudioMixerNative.setVolume_Native(byteBufferAllocate2.array(), 2048, this.f166468g, byteBufferAllocate3.array());
            ByteBuffer byteBuffer2 = this.f166482u;
            if (byteBuffer2 != null && byteBuffer2.remaining() >= 2048) {
                this.f166482u.put(byteBufferAllocate3.array(), 0, 2048);
            }
            this.f166477p.offer(byteBufferAllocate3);
            i3++;
            this.f166481t++;
            if (this.f166479r) {
                if (this.f166478q == 1) {
                    this.f166483v.put(m184751a0(byteBufferAllocate3.array(), 2048), 0, 1024);
                    if (this.f166481t % 2 == 0) {
                        this.f166483v.flip();
                        byte[] bArr2 = new byte[2048];
                        System.arraycopy(this.f166483v.array(), 0, bArr2, 0, 2048);
                        this.f166472k.putSurroundExtraData(new oxd0(bArr2, System.nanoTime() / 1000, f166456I));
                        this.f166483v.clear();
                    }
                } else {
                    this.f166472k.putSurroundExtraData(new oxd0(byteBufferAllocate3.array(), System.nanoTime() / 1000, f166456I));
                }
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public long m184775E(long j) {
        return (long) ((j * 1000.0f) / ((f166455H * f166456I) * 2));
    }

    /* JADX INFO: renamed from: F */
    public long m184776F() {
        return this.f166466e;
    }

    /* JADX INFO: renamed from: G */
    public long m184777G() {
        RandomAccessFile randomAccessFile;
        long j = f166454G;
        if (j > 0 || !f166452E || (randomAccessFile = this.f166462a) == null) {
            return j;
        }
        try {
            return m184775E(randomAccessFile.length());
        } catch (IOException unused) {
            return j;
        }
    }

    /* JADX INFO: renamed from: H */
    public float m184778H() {
        return this.f166468g;
    }

    /* JADX INFO: renamed from: I */
    public long m184779I(long j) {
        return ((long) (((j * 1.0f) * f166455H) / 1000.0f)) * ((long) f166456I) * 2;
    }

    /* JADX INFO: renamed from: J */
    public void m184780J(String str) {
        if (this.f166463b) {
            Log.e("HUOHL_KtvPlayer", str);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m184781L() {
        C19991c c19991c = this.f166470i;
        if (c19991c != null) {
            c19991c.m184803b(true);
        }
        C19990b c19990b = this.f166471j;
        if (c19990b != null) {
            c19990b.m184798a();
        }
    }

    /* JADX INFO: renamed from: M */
    public void m184782M(int i) {
        this.f166476o = true;
        if (!f166451D) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
            }
        }
        C19991c c19991c = this.f166470i;
        if (c19991c != null && f166451D) {
            c19991c.m184804c(i);
        }
        C19990b c19990b = this.f166471j;
        if (c19990b != null) {
            c19990b.m184799b();
        }
    }

    /* JADX INFO: renamed from: N */
    public void m184783N(int i, boolean z) {
        this.f166479r = z;
        m184782M(i);
    }

    /* JADX INFO: renamed from: O */
    public int m184784O() {
        int i;
        gb1 gb1Var;
        RandomAccessFile randomAccessFile = this.f166462a;
        if (randomAccessFile == null) {
            gb1 gb1Var2 = f166460y;
            if (gb1Var2 != null) {
                gb1Var2.mo19382a(null, 26, 0);
            }
            return -2;
        }
        try {
            if (randomAccessFile.length() <= 0 && (gb1Var = f166460y) != null) {
                gb1Var.mo19382a(null, 27, 0);
            }
        } catch (IOException unused) {
        }
        if (this.f166480s == null) {
            this.f166480s = new byte[8192];
        }
        try {
            int i2 = this.f166467f;
            if (i2 >= 0) {
                if (this.f166462a != null) {
                    this.f166462a.seek(m184779I(i2));
                    m184780J("##### 伴奏文件 seek to: " + this.f166467f);
                    this.f166477p.clear();
                }
                this.f166467f = -1;
            }
        } catch (IOException e) {
            m184780J("##### 跳过前奏或者SEEK Error:" + e.toString());
        }
        try {
            RandomAccessFile randomAccessFile2 = this.f166462a;
            if (randomAccessFile2 != null) {
                this.f166466e = m184775E(randomAccessFile2.getFilePointer());
                i = this.f166462a.read(this.f166480s);
            } else {
                i = 0;
            }
        } catch (IOException e2) {
            m184780J("exception:" + e2.toString());
        }
        if (i == -1) {
            m184780J("##### 伴奏播放完成，readPCMData: BUFFER_FLAG_END_OF_STREAM");
            gb1 gb1Var3 = f166460y;
            if (gb1Var3 != null) {
                gb1Var3.mo19382a(null, 19, 0);
            }
            return -1;
        }
        if (i == 0) {
            m184780J("##### Error When 伴奏播放读取文件，readPCMData: read error, no data");
            gb1 gb1Var4 = f166460y;
            if (gb1Var4 != null) {
                gb1Var4.mo19382a(null, 28, 0);
            }
            return -2;
        }
        ByteBuffer byteBufferM184774A = m184774A(this.f166480s, i);
        if (byteBufferM184774A == null) {
            Log.e("HUOHL_KtvPlayer", "##### ERROR 应用声音特效失败========== ");
        } else if (byteBufferM184774A.limit() != i) {
            m184780J("^^^^^^^^^^^^^音效处理失败^^^^^^^^^^^^^^^^^^^^^^");
        } else {
            byteBufferM184774A.get(this.f166480s, 0, i);
        }
        return i;
    }

    /* JADX INFO: renamed from: P */
    public void m184785P() {
        C19991c c19991c = this.f166470i;
        if (c19991c != null) {
            c19991c.m184805d();
            this.f166470i.m184802a();
            try {
                this.f166470i.join();
                this.f166470i = null;
            } catch (InterruptedException unused) {
                m184780J("======= ERROR, RecordPcmEx2 播放线程退出异常..............");
            }
        }
        C19990b c19990b = this.f166471j;
        if (c19990b != null) {
            c19990b.m184801d();
            try {
                this.f166471j.join();
                this.f166471j = null;
            } catch (InterruptedException unused2) {
                m184780J("======= ERROR, RecordPcmEx2 播放线程退出异常..............");
            }
        }
        RandomAccessFile randomAccessFile = this.f166462a;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
                this.f166462a = null;
            } catch (IOException unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public void m184786S() {
        C19991c c19991c = this.f166470i;
        if (c19991c != null) {
            c19991c.m184803b(false);
        }
        C19990b c19990b = this.f166471j;
        if (c19990b != null) {
            c19990b.m184800c();
        }
    }

    /* JADX INFO: renamed from: T */
    public void m184787T(int i) {
        this.f166467f = i;
    }

    /* JADX INFO: renamed from: U */
    public void m184788U(int i) {
        if (this.f166485x != i) {
            this.f166485x = i;
            this.f166484w = true;
        }
    }

    /* JADX INFO: renamed from: V */
    public void m184789V(int i) {
        this.f166469h = i;
    }

    /* JADX INFO: renamed from: W */
    public void m184790W(float f) {
        this.f166468g = f;
    }

    /* JADX INFO: renamed from: X */
    public void m184791X(String str, String str2) {
        f166458K = false;
        Log.e("HUOHL_KtvPlayer", "setPlayURL: " + str);
        m184744C(str, str2);
        try {
            this.f166462a = new RandomAccessFile(new File(f166448A), "r");
        } catch (IOException unused) {
        }
    }

    @Override // p153l.thd.InterfaceC20318a
    /* JADX INFO: renamed from: a */
    public void mo184792a() {
        f166452E = true;
        gb1 gb1Var = f166460y;
        if (gb1Var != null) {
            gb1Var.mo19382a(null, 12, 0);
        }
    }

    @Override // p153l.thd.InterfaceC20318a
    /* JADX INFO: renamed from: b */
    public void mo184793b() {
        f166451D = true;
        try {
            this.f166462a = new RandomAccessFile(new File(f166448A), "r");
        } catch (IOException unused) {
        }
        gb1 gb1Var = f166460y;
        if (gb1Var != null) {
            gb1Var.mo19382a(null, 11, 0);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m184794b0() {
        C19991c c19991c = this.f166470i;
        if (c19991c != null) {
            c19991c.m184805d();
        }
    }

    @Override // p153l.thd.InterfaceC20318a
    /* JADX INFO: renamed from: c */
    public void mo184795c(long j) {
        f166454G = j;
    }

    /* JADX INFO: renamed from: c0 */
    public void m184796c0(AudioProcess audioProcess, int i) {
        if (audioProcess != null) {
            if (audioProcess == this.f166472k && i == this.f166478q) {
                return;
            }
            audioProcess.clearSurroundExtraFrames();
            this.f166472k = audioProcess;
            this.f166478q = i;
            Log.e("HUOHL_KtvPlayer", "KtvPlayer: 更新音频输出通道数：" + this.f166478q);
        }
    }

    @Override // p153l.thd.InterfaceC20318a
    /* JADX INFO: renamed from: d */
    public void mo184797d(int i, String str) {
        gb1 gb1Var = f166460y;
        if (gb1Var != null) {
            gb1Var.mo19382a(null, 25, 0);
        }
    }
}
