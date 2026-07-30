package p007l;

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
import l.mpd0;
import l.za1;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class r3r implements ngd.InterfaceC0623a {

    /* JADX INFO: renamed from: A */
    private static String f3991A = "";

    /* JADX INFO: renamed from: B */
    private static String f3992B = "";

    /* JADX INFO: renamed from: C */
    private static ngd f3993C = null;

    /* JADX INFO: renamed from: D */
    private static boolean f3994D = false;

    /* JADX INFO: renamed from: E */
    private static boolean f3995E = false;

    /* JADX INFO: renamed from: F */
    private static boolean f3996F = false;

    /* JADX INFO: renamed from: G */
    private static long f3997G = 0;

    /* JADX INFO: renamed from: H */
    private static int f3998H = 44100;

    /* JADX INFO: renamed from: I */
    private static int f3999I = 2;

    /* JADX INFO: renamed from: J */
    private static int f4000J = 16;

    /* JADX INFO: renamed from: K */
    private static boolean f4001K = false;

    /* JADX INFO: renamed from: L */
    private static int f4002L = 1;

    /* JADX INFO: renamed from: y */
    protected static za1 f4003y = null;

    /* JADX INFO: renamed from: z */
    private static String f4004z = "";

    /* JADX INFO: renamed from: d */
    private int f4008d;

    /* JADX INFO: renamed from: i */
    private C0681c f4013i;

    /* JADX INFO: renamed from: j */
    private C0680b f4014j;

    /* JADX INFO: renamed from: k */
    private AudioProcess f4015k;

    /* JADX INFO: renamed from: l */
    private AudioProcess f4016l;

    /* JADX INFO: renamed from: q */
    private int f4021q;

    /* JADX INFO: renamed from: a */
    RandomAccessFile f4005a = null;

    /* JADX INFO: renamed from: b */
    private boolean f4006b = true;

    /* JADX INFO: renamed from: c */
    private long f4007c = 0;

    /* JADX INFO: renamed from: e */
    private long f4009e = 0;

    /* JADX INFO: renamed from: f */
    private int f4010f = -1;

    /* JADX INFO: renamed from: g */
    private float f4011g = 1.0f;

    /* JADX INFO: renamed from: h */
    private int f4012h = 0;

    /* JADX INFO: renamed from: m */
    private int f4017m = 200;

    /* JADX INFO: renamed from: n */
    private int f4018n = 0;

    /* JADX INFO: renamed from: o */
    private boolean f4019o = false;

    /* JADX INFO: renamed from: p */
    private LinkedBlockingQueue<ByteBuffer> f4020p = new LinkedBlockingQueue<>();

    /* JADX INFO: renamed from: r */
    private boolean f4022r = true;

    /* JADX INFO: renamed from: s */
    private byte[] f4023s = null;

    /* JADX INFO: renamed from: t */
    private int f4024t = 0;

    /* JADX INFO: renamed from: u */
    private ByteBuffer f4025u = null;

    /* JADX INFO: renamed from: v */
    private ByteBuffer f4026v = ByteBuffer.allocate(2048);

    /* JADX INFO: renamed from: w */
    private boolean f4027w = false;

    /* JADX INFO: renamed from: x */
    private int f4028x = 3;

    /* JADX INFO: renamed from: l.r3r$a */
    public class C0679a implements ngd.InterfaceC0623a {
        @Override // p007l.ngd.InterfaceC0623a
        /* JADX INFO: renamed from: a */
        public void mo9989a() {
            boolean unused = r3r.f3995E = true;
            za1 za1Var = r3r.f4003y;
            if (za1Var != null) {
                za1Var.a((Object) null, 12, 0);
            }
            Log.e("HUOHL_KtvPlayer", "***********************伴奏文件解码OK: ");
        }

        @Override // p007l.ngd.InterfaceC0623a
        /* JADX INFO: renamed from: b */
        public void mo9990b() {
            boolean unused = r3r.f3994D = true;
            za1 za1Var = r3r.f4003y;
            if (za1Var != null) {
                za1Var.a((Object) null, 11, 0);
            }
            Log.e("HUOHL_KtvPlayer", "***********************伴奏文件开始解码: ");
        }

        @Override // p007l.ngd.InterfaceC0623a
        /* JADX INFO: renamed from: c */
        public void mo9991c(long j) {
            long unused = r3r.f3997G = j;
            za1 za1Var = r3r.f4003y;
            if (za1Var != null) {
                za1Var.a((Object) null, 10, (int) j);
            }
            Log.e("HUOHL_KtvPlayer", "***********************解码 获取伴奏时长: " + r3r.f3997G);
        }

        @Override // p007l.ngd.InterfaceC0623a
        /* JADX INFO: renamed from: d */
        public void mo9992d(int i, String str) {
            boolean unused = r3r.f3996F = true;
            za1 za1Var = r3r.f4003y;
            if (za1Var != null) {
                za1Var.a((Object) null, 25, 0);
            }
        }
    }

    /* JADX INFO: renamed from: l.r3r$b */
    public class C0680b extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f4029a = false;

        /* JADX INFO: renamed from: b */
        private boolean f4030b = false;

        /* JADX INFO: renamed from: c */
        private boolean f4031c = true;

        /* JADX INFO: renamed from: d */
        private boolean f4032d = false;

        /* JADX INFO: renamed from: e */
        private AudioPlayer f4033e = null;

        /* JADX INFO: renamed from: f */
        private int f4034f = 3;

        public C0680b() {
            setName("HUOHL_KtvPlayer_MusicData");
            start();
        }

        /* JADX INFO: renamed from: a */
        public void m10540a() {
            this.f4031c = true;
        }

        /* JADX INFO: renamed from: b */
        public void m10541b() {
            m10542c();
        }

        /* JADX INFO: renamed from: c */
        public void m10542c() {
            this.f4031c = false;
            this.f4032d = true;
        }

        /* JADX INFO: renamed from: d */
        public void m10543d() {
            this.f4029a = true;
            this.f4030b = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            if (this.f4033e == null) {
                this.f4033e = new AudioPlayer();
                int i = r3r.this.f4028x;
                this.f4034f = i;
                this.f4033e.setStreamType(i);
                this.f4033e.prepare(r3r.f3998H, r3r.f4000J, r3r.f3999I);
            }
            this.f4033e.reset();
            this.f4033e.resume();
            while (!this.f4030b && !this.f4029a) {
                if (this.f4031c) {
                    this.f4033e.pause();
                    this.f4033e.reset();
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException unused) {
                    }
                } else {
                    if (r3r.this.f4027w && this.f4034f != r3r.this.f4028x) {
                        this.f4033e.release();
                        int i2 = r3r.this.f4028x;
                        this.f4034f = i2;
                        this.f4033e.setStreamType(i2);
                        this.f4033e.prepare(r3r.f3998H, r3r.f4000J, r3r.f3999I);
                        r3r.this.f4027w = false;
                        Log.e("HUOHL_KtvPlayer", "run: audiotrack 更新OK： " + r3r.this.f4028x);
                    }
                    if (this.f4032d) {
                        this.f4032d = false;
                        this.f4033e.reset();
                        this.f4033e.resume();
                    }
                    if (r3r.this.f4020p.size() > 4) {
                        for (int i3 = 0; i3 < 4; i3++) {
                            ByteBuffer byteBuffer = (ByteBuffer) r3r.this.f4020p.take();
                            this.f4033e.writeAudio(byteBuffer.array(), byteBuffer.limit());
                            r3r.m10517x(r3r.this, byteBuffer.limit());
                        }
                    }
                }
            }
            this.f4033e.release();
            this.f4033e = null;
        }
    }

    /* JADX INFO: renamed from: l.r3r$c */
    public class C0681c extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f4036a = false;

        /* JADX INFO: renamed from: b */
        private boolean f4037b = false;

        /* JADX INFO: renamed from: c */
        private boolean f4038c = false;

        /* JADX INFO: renamed from: d */
        private boolean f4039d = false;

        /* JADX INFO: renamed from: e */
        private long f4040e = -1;

        /* JADX INFO: renamed from: f */
        private Lock f4041f;

        /* JADX INFO: renamed from: g */
        private Condition f4042g;

        /* JADX INFO: renamed from: h */
        private int f4043h;

        /* JADX INFO: renamed from: i */
        private boolean f4044i;

        /* JADX INFO: renamed from: j */
        private boolean f4045j;

        public C0681c() {
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f4041f = reentrantLock;
            this.f4042g = reentrantLock.newCondition();
            this.f4043h = 0;
            this.f4044i = false;
            this.f4045j = false;
            setName("HUOHL_KtvPlayer_MusicPlay");
            start();
        }

        /* JADX INFO: renamed from: a */
        public void m10544a() {
            this.f4037b = true;
            this.f4036a = true;
            this.f4041f.lock();
            this.f4042g.signalAll();
            this.f4041f.unlock();
            r3r.this.m10526J("===== 伴奏播放 退出");
        }

        /* JADX INFO: renamed from: b */
        public void m10545b(boolean z) {
            if (z) {
                r3r.this.m10526J("===== 伴奏播放 暂停");
            } else if (this.f4040e > 0) {
                r3r.this.m10526J("===== 伴奏继续播放, 伴奏文件恢复到位置：" + this.f4040e);
                this.f4040e = -1L;
            }
            this.f4038c = z;
            this.f4039d = !z;
        }

        /* JADX INFO: renamed from: c */
        public void m10546c(int i) {
            boolean z;
            za1 za1Var;
            while (true) {
                try {
                    z = this.f4045j;
                    if (z) {
                        break;
                    } else {
                        Thread.sleep(10L);
                    }
                } catch (InterruptedException unused) {
                }
            }
            if (!z && (za1Var = r3r.f4003y) != null) {
                za1Var.a((Object) null, 29, 0);
                return;
            }
            this.f4041f.lock();
            this.f4043h = i;
            r3r.this.f4009e = i;
            this.f4037b = false;
            this.f4038c = false;
            this.f4042g.signalAll();
            this.f4041f.unlock();
            r3r.this.m10526J("===== 开始伴奏播放, 开始时间：" + i);
        }

        /* JADX INFO: renamed from: d */
        public void m10547d() {
            this.f4041f.lock();
            this.f4037b = true;
            this.f4041f.unlock();
            r3r.this.m10526J("===== 伴奏播放 停止");
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
            byte[] bArr = new byte[r3r.this.f4008d * 4];
            while (!this.f4036a) {
                try {
                    if (!r3r.f4001K) {
                        if (r3r.f3994D) {
                            za1 za1Var2 = r3r.f4003y;
                            if (za1Var2 != null) {
                                za1Var2.a((Object) null, 14, 0);
                            }
                            boolean unused = r3r.f4001K = true;
                        } else {
                            try {
                                Thread.sleep(100L);
                            } catch (InterruptedException unused2) {
                                this.f4041f.lock();
                                this.f4045j = true;
                                Log.e("HUOHL_KtvPlayer", "***********伴奏播放:wait playMusic task***************");
                                this.f4042g.await();
                                Log.e("HUOHL_KtvPlayer", "***********伴奏播放:wait Signal*******************");
                                this.f4041f.unlock();
                                Log.e("HUOHL_KtvPlayer", "==============伴奏播放: PlayJob PlayStart================");
                                za1Var = r3r.f4003y;
                                if (za1Var != null) {
                                    za1Var.a((Object) null, 11, 0);
                                }
                                this.f4039d = true;
                                r3r.this.f4007c = 0L;
                                while (true) {
                                    if (this.f4037b) {
                                        if (r3r.this.f4006b) {
                                            Log.e("HUOHL_KtvPlayer", "===============伴奏播放: StopPlay ===============");
                                        }
                                        if (r3r.f4003y != null) {
                                            break;
                                        }
                                        r3r r3rVar3 = r3r.this;
                                        r3rVar3.m10521E(r3rVar3.f4007c);
                                        r3r.f4003y.a((Object) null, 18, 0);
                                        break;
                                    }
                                    if (this.f4038c) {
                                        try {
                                            if (this.f4040e < 0) {
                                                this.f4040e = r3r.this.f4005a.getFilePointer();
                                                r3r.this.m10526J("===== 伴奏暂停播放，当前播放位置：" + this.f4040e);
                                            }
                                            Thread.sleep(100L);
                                        } catch (IOException | InterruptedException | Exception unused3) {
                                        }
                                    } else {
                                        if (r3r.this.f4005a == null) {
                                            try {
                                                z = r3r.f3994D;
                                                r3rVar2 = r3r.this;
                                                if (z) {
                                                    r3rVar2.f4005a = new RandomAccessFile(new File(r3r.f3991A), "r");
                                                    r3r.this.m10526J("======打开PCM文件 开始读取。。。。");
                                                } else {
                                                    r3rVar2.m10526J("======解码未开始, PCM 文件不存在, " + r3r.f3991A);
                                                    Thread.sleep(500L);
                                                }
                                            } catch (Exception unused4) {
                                            }
                                        }
                                        i = this.f4043h;
                                        if (i > 0) {
                                            r3rVar = r3r.this;
                                            if (r3rVar.f4005a != null) {
                                                long jM10525I = (int) r3rVar.m10525I(i);
                                                r3r.this.f4005a.seek(jM10525I);
                                                r3r.this.f4007c = jM10525I;
                                                this.f4043h = 0;
                                            }
                                        }
                                        if (r3r.this.f4020p.size() < 20) {
                                            Thread.sleep(10L);
                                        } else if (r3r.this.m10530O() < 0) {
                                            break;
                                        }
                                    }
                                }
                                this.f4038c = false;
                                this.f4039d = false;
                                r3r.this.f4009e = 0L;
                                if (r3r.f4003y == null) {
                                }
                            }
                        }
                    }
                    this.f4045j = true;
                    Log.e("HUOHL_KtvPlayer", "***********伴奏播放:wait playMusic task***************");
                    this.f4042g.await();
                    Log.e("HUOHL_KtvPlayer", "***********伴奏播放:wait Signal*******************");
                    while (true) {
                        if (this.f4037b) {
                            if (r3r.this.f4006b) {
                                Log.e("HUOHL_KtvPlayer", "===============伴奏播放: StopPlay ===============");
                            }
                            if (r3r.f4003y != null) {
                                break;
                            }
                            r3r r3rVar4 = r3r.this;
                            r3rVar4.m10521E(r3rVar4.f4007c);
                            r3r.f4003y.a((Object) null, 18, 0);
                            break;
                        }
                        if (this.f4038c) {
                            if (this.f4040e < 0) {
                                this.f4040e = r3r.this.f4005a.getFilePointer();
                                r3r.this.m10526J("===== 伴奏暂停播放，当前播放位置：" + this.f4040e);
                            }
                            Thread.sleep(100L);
                        } else {
                            if (r3r.this.f4005a == null) {
                                z = r3r.f3994D;
                                r3rVar2 = r3r.this;
                                if (z) {
                                    r3rVar2.f4005a = new RandomAccessFile(new File(r3r.f3991A), "r");
                                    r3r.this.m10526J("======打开PCM文件 开始读取。。。。");
                                } else {
                                    r3rVar2.m10526J("======解码未开始, PCM 文件不存在, " + r3r.f3991A);
                                    Thread.sleep(500L);
                                }
                            }
                            i = this.f4043h;
                            if (i > 0) {
                                r3rVar = r3r.this;
                                if (r3rVar.f4005a != null) {
                                    long jM10525I2 = (int) r3rVar.m10525I(i);
                                    r3r.this.f4005a.seek(jM10525I2);
                                    r3r.this.f4007c = jM10525I2;
                                    this.f4043h = 0;
                                }
                            }
                            if (r3r.this.f4020p.size() < 20) {
                                Thread.sleep(10L);
                            } else if (r3r.this.m10530O() < 0) {
                                break;
                                break;
                            }
                        }
                    }
                } catch (Exception unused5) {
                } catch (Throwable th) {
                    this.f4041f.unlock();
                    throw th;
                }
                this.f4041f.lock();
                this.f4041f.unlock();
                Log.e("HUOHL_KtvPlayer", "==============伴奏播放: PlayJob PlayStart================");
                za1Var = r3r.f4003y;
                if (za1Var != null) {
                    za1Var.a((Object) null, 11, 0);
                }
                this.f4039d = true;
                r3r.this.f4007c = 0L;
                this.f4038c = false;
                this.f4039d = false;
                r3r.this.f4009e = 0L;
                if (r3r.f4003y == null && r3r.this.f4007c > 0 && !this.f4037b) {
                    r3r r3rVar5 = r3r.this;
                    r3rVar5.m10521E(r3rVar5.f4007c);
                    r3r.f4003y.a((Object) null, 19, 0);
                }
            }
            if (r3r.this.f4006b) {
                Log.e("HUOHL_KtvPlayer", "==================伴奏播放: Exit==================");
            }
            if (r3r.f4003y != null) {
                r3r r3rVar6 = r3r.this;
                r3rVar6.m10521E(r3rVar6.f4007c);
                r3r.f4003y.a((Object) null, 20, 0);
            }
        }
    }

    public r3r(String str, int i, int i2, AudioProcess audioProcess) {
        this.f4008d = 0;
        this.f4013i = null;
        this.f4014j = null;
        this.f4021q = 2;
        f4004z = str;
        f3998H = i;
        this.f4008d = f3999I * 2048;
        this.f4015k = audioProcess;
        AudioProcess audioProcess2 = new AudioProcess();
        this.f4016l = audioProcess2;
        audioProcess2.openSabineEf(f3998H, this.f4021q, 1024);
        this.f4021q = i2;
        Log.e("HUOHL_KtvPlayer", "KtvPlayer: 设置音频输出通道数：" + this.f4021q);
        f4001K = false;
        this.f4014j = new C0680b();
        this.f4013i = new C0681c();
    }

    /* JADX INFO: renamed from: B */
    public static String m10489B(String str, String str2) {
        return new File(new File(str), str2).getPath();
    }

    /* JADX INFO: renamed from: C */
    public static void m10490C(String str, String str2) {
        f4004z = str2;
        f3992B = str;
        f4001K = false;
        String str3 = m10492K(str) + ".pcm";
        String strM10489B = m10489B(str2, str3);
        if (strM10489B.equals(f3991A) && f3994D && f3995E) {
            Log.e("HUOHL_KtvPlayer", "=========== 伴奏文件的PCM已经存在，伴奏：" + str);
            Log.e("HUOHL_KtvPlayer", "=========== 伴奏文件的PCM已经存在，PCM文件：".concat(str3));
            return;
        }
        if (f3991A.length() > 0) {
            new File(f3991A).delete();
        }
        f3994D = false;
        f3995E = false;
        f3996F = false;
        f3991A = strM10489B;
        f3997G = 0L;
        m10493Q();
        m10491D().m9987b(new C0679a());
        m10491D().m9986a(str, f3991A, f3998H, f3999I, f4000J);
    }

    /* JADX INFO: renamed from: D */
    public static ngd m10491D() {
        if (f3993C == null) {
            f3993C = new ngd();
        }
        return f3993C;
    }

    /* JADX INFO: renamed from: K */
    public static String m10492K(String str) {
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
    public static void m10493Q() {
        ngd ngdVar = f3993C;
        if (ngdVar != null) {
            ngdVar.m9988c();
            f3993C = null;
        }
    }

    /* JADX INFO: renamed from: R */
    public static void m10494R(int i, int i2) {
        za1 za1Var = f4003y;
        if (za1Var != null) {
            za1Var.a((Object) null, i, i2);
        }
    }

    /* JADX INFO: renamed from: Y */
    public static void m10495Y(int i) {
        f4002L = i;
    }

    /* JADX INFO: renamed from: Z */
    public static void m10496Z(za1 za1Var) {
        f4003y = za1Var;
    }

    /* JADX INFO: renamed from: a0 */
    public static byte[] m10497a0(byte[] bArr, int i) {
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
    public static /* synthetic */ long m10517x(r3r r3rVar, long j) {
        long j2 = r3rVar.f4007c + j;
        r3rVar.f4007c = j2;
        return j2;
    }

    /* JADX INFO: renamed from: A */
    public ByteBuffer m10520A(byte[] bArr, int i) {
        AudioProcess audioProcess;
        ByteBuffer byteBuffer = this.f4025u;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.f4025u = ByteBuffer.allocate(i * 2);
        }
        this.f4025u.clear();
        if (this.f4015k == null) {
            this.f4025u.put(bArr, 0, i);
            this.f4025u.flip();
            return this.f4025u;
        }
        if (this.f4019o && this.f4022r) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2048);
            Arrays.fill(byteBufferAllocate.array(), (byte) 0);
            long jM10525I = m10525I(this.f4017m);
            if (this.f4021q == 1) {
                jM10525I /= 2;
            }
            mpd0 mpd0Var = new mpd0(byteBufferAllocate.array(), System.nanoTime() / 1000, f3999I);
            for (int i2 = 0; i2 < jM10525I / 2048; i2++) {
                this.f4015k.putSurroundExtraData(mpd0Var);
            }
            this.f4019o = false;
            this.f4024t = 0;
            this.f4026v.clear();
        }
        int i3 = 0;
        while (true) {
            int i4 = i3 * 2048;
            if (i4 >= i) {
                this.f4025u.flip();
                return this.f4025u;
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(2048);
            byteBufferAllocate2.clear();
            byteBufferAllocate2.put(bArr, i4, 2048);
            byteBufferAllocate2.flip();
            if (this.f4012h != 0 && (audioProcess = this.f4016l) != null) {
                audioProcess.processAudioPitch(byteBufferAllocate2.array(), 2048, this.f4012h);
            }
            ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(2048);
            byteBufferAllocate3.clear();
            AudioMixerNative.setVolume_Native(byteBufferAllocate2.array(), 2048, this.f4011g, byteBufferAllocate3.array());
            ByteBuffer byteBuffer2 = this.f4025u;
            if (byteBuffer2 != null && byteBuffer2.remaining() >= 2048) {
                this.f4025u.put(byteBufferAllocate3.array(), 0, 2048);
            }
            this.f4020p.offer(byteBufferAllocate3);
            i3++;
            this.f4024t++;
            if (this.f4022r) {
                if (this.f4021q == 1) {
                    this.f4026v.put(m10497a0(byteBufferAllocate3.array(), 2048), 0, 1024);
                    if (this.f4024t % 2 == 0) {
                        this.f4026v.flip();
                        byte[] bArr2 = new byte[2048];
                        System.arraycopy(this.f4026v.array(), 0, bArr2, 0, 2048);
                        this.f4015k.putSurroundExtraData(new mpd0(bArr2, System.nanoTime() / 1000, f3999I));
                        this.f4026v.clear();
                    }
                } else {
                    this.f4015k.putSurroundExtraData(new mpd0(byteBufferAllocate3.array(), System.nanoTime() / 1000, f3999I));
                }
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public long m10521E(long j) {
        return (long) ((j * 1000.0f) / ((f3998H * f3999I) * 2));
    }

    /* JADX INFO: renamed from: F */
    public long m10522F() {
        return this.f4009e;
    }

    /* JADX INFO: renamed from: G */
    public long m10523G() {
        RandomAccessFile randomAccessFile;
        long j = f3997G;
        if (j > 0 || !f3995E || (randomAccessFile = this.f4005a) == null) {
            return j;
        }
        try {
            return m10521E(randomAccessFile.length());
        } catch (IOException unused) {
            return j;
        }
    }

    /* JADX INFO: renamed from: H */
    public float m10524H() {
        return this.f4011g;
    }

    /* JADX INFO: renamed from: I */
    public long m10525I(long j) {
        return ((long) (((j * 1.0f) * f3998H) / 1000.0f)) * ((long) f3999I) * 2;
    }

    /* JADX INFO: renamed from: J */
    public void m10526J(String str) {
        if (this.f4006b) {
            Log.e("HUOHL_KtvPlayer", str);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m10527L() {
        C0681c c0681c = this.f4013i;
        if (c0681c != null) {
            c0681c.m10545b(true);
        }
        C0680b c0680b = this.f4014j;
        if (c0680b != null) {
            c0680b.m10540a();
        }
    }

    /* JADX INFO: renamed from: M */
    public void m10528M(int i) {
        this.f4019o = true;
        if (!f3994D) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
            }
        }
        C0681c c0681c = this.f4013i;
        if (c0681c != null && f3994D) {
            c0681c.m10546c(i);
        }
        C0680b c0680b = this.f4014j;
        if (c0680b != null) {
            c0680b.m10541b();
        }
    }

    /* JADX INFO: renamed from: N */
    public void m10529N(int i, boolean z) {
        this.f4022r = z;
        m10528M(i);
    }

    /* JADX INFO: renamed from: O */
    public int m10530O() {
        int i;
        za1 za1Var;
        RandomAccessFile randomAccessFile = this.f4005a;
        if (randomAccessFile == null) {
            za1 za1Var2 = f4003y;
            if (za1Var2 != null) {
                za1Var2.a((Object) null, 26, 0);
            }
            return -2;
        }
        try {
            if (randomAccessFile.length() <= 0 && (za1Var = f4003y) != null) {
                za1Var.a((Object) null, 27, 0);
            }
        } catch (IOException unused) {
        }
        if (this.f4023s == null) {
            this.f4023s = new byte[8192];
        }
        try {
            int i2 = this.f4010f;
            if (i2 >= 0) {
                if (this.f4005a != null) {
                    this.f4005a.seek(m10525I(i2));
                    m10526J("##### 伴奏文件 seek to: " + this.f4010f);
                    this.f4020p.clear();
                }
                this.f4010f = -1;
            }
        } catch (IOException e) {
            m10526J("##### 跳过前奏或者SEEK Error:" + e.toString());
        }
        try {
            RandomAccessFile randomAccessFile2 = this.f4005a;
            if (randomAccessFile2 != null) {
                this.f4009e = m10521E(randomAccessFile2.getFilePointer());
                i = this.f4005a.read(this.f4023s);
            } else {
                i = 0;
            }
        } catch (IOException e2) {
            m10526J("exception:" + e2.toString());
        }
        if (i == -1) {
            m10526J("##### 伴奏播放完成，readPCMData: BUFFER_FLAG_END_OF_STREAM");
            za1 za1Var3 = f4003y;
            if (za1Var3 != null) {
                za1Var3.a((Object) null, 19, 0);
            }
            return -1;
        }
        if (i == 0) {
            m10526J("##### Error When 伴奏播放读取文件，readPCMData: read error, no data");
            za1 za1Var4 = f4003y;
            if (za1Var4 != null) {
                za1Var4.a((Object) null, 28, 0);
            }
            return -2;
        }
        ByteBuffer byteBufferM10520A = m10520A(this.f4023s, i);
        if (byteBufferM10520A == null) {
            Log.e("HUOHL_KtvPlayer", "##### ERROR 应用声音特效失败========== ");
        } else if (byteBufferM10520A.limit() != i) {
            m10526J("^^^^^^^^^^^^^音效处理失败^^^^^^^^^^^^^^^^^^^^^^");
        } else {
            byteBufferM10520A.get(this.f4023s, 0, i);
        }
        return i;
    }

    /* JADX INFO: renamed from: P */
    public void m10531P() {
        C0681c c0681c = this.f4013i;
        if (c0681c != null) {
            c0681c.m10547d();
            this.f4013i.m10544a();
            try {
                this.f4013i.join();
                this.f4013i = null;
            } catch (InterruptedException unused) {
                m10526J("======= ERROR, RecordPcmEx2 播放线程退出异常..............");
            }
        }
        C0680b c0680b = this.f4014j;
        if (c0680b != null) {
            c0680b.m10543d();
            try {
                this.f4014j.join();
                this.f4014j = null;
            } catch (InterruptedException unused2) {
                m10526J("======= ERROR, RecordPcmEx2 播放线程退出异常..............");
            }
        }
        RandomAccessFile randomAccessFile = this.f4005a;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
                this.f4005a = null;
            } catch (IOException unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public void m10532S() {
        C0681c c0681c = this.f4013i;
        if (c0681c != null) {
            c0681c.m10545b(false);
        }
        C0680b c0680b = this.f4014j;
        if (c0680b != null) {
            c0680b.m10542c();
        }
    }

    /* JADX INFO: renamed from: T */
    public void m10533T(int i) {
        this.f4010f = i;
    }

    /* JADX INFO: renamed from: U */
    public void m10534U(int i) {
        if (this.f4028x != i) {
            this.f4028x = i;
            this.f4027w = true;
        }
    }

    /* JADX INFO: renamed from: V */
    public void m10535V(int i) {
        this.f4012h = i;
    }

    /* JADX INFO: renamed from: W */
    public void m10536W(float f) {
        this.f4011g = f;
    }

    /* JADX INFO: renamed from: X */
    public void m10537X(String str, String str2) {
        f4001K = false;
        Log.e("HUOHL_KtvPlayer", "setPlayURL: " + str);
        m10490C(str, str2);
        try {
            this.f4005a = new RandomAccessFile(new File(f3991A), "r");
        } catch (IOException unused) {
        }
    }

    @Override // p007l.ngd.InterfaceC0623a
    /* JADX INFO: renamed from: a */
    public void mo9989a() {
        f3995E = true;
        za1 za1Var = f4003y;
        if (za1Var != null) {
            za1Var.a((Object) null, 12, 0);
        }
    }

    @Override // p007l.ngd.InterfaceC0623a
    /* JADX INFO: renamed from: b */
    public void mo9990b() {
        f3994D = true;
        try {
            this.f4005a = new RandomAccessFile(new File(f3991A), "r");
        } catch (IOException unused) {
        }
        za1 za1Var = f4003y;
        if (za1Var != null) {
            za1Var.a((Object) null, 11, 0);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m10538b0() {
        C0681c c0681c = this.f4013i;
        if (c0681c != null) {
            c0681c.m10547d();
        }
    }

    @Override // p007l.ngd.InterfaceC0623a
    /* JADX INFO: renamed from: c */
    public void mo9991c(long j) {
        f3997G = j;
    }

    /* JADX INFO: renamed from: c0 */
    public void m10539c0(AudioProcess audioProcess, int i) {
        if (audioProcess != null) {
            if (audioProcess == this.f4015k && i == this.f4021q) {
                return;
            }
            audioProcess.clearSurroundExtraFrames();
            this.f4015k = audioProcess;
            this.f4021q = i;
            Log.e("HUOHL_KtvPlayer", "KtvPlayer: 更新音频输出通道数：" + this.f4021q);
        }
    }

    @Override // p007l.ngd.InterfaceC0623a
    /* JADX INFO: renamed from: d */
    public void mo9992d(int i, String str) {
        za1 za1Var = f4003y;
        if (za1Var != null) {
            za1Var.a((Object) null, 25, 0);
        }
    }
}
