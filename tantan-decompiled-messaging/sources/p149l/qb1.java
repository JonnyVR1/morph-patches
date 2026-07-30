package p149l;

import android.annotation.TargetApi;
import android.media.AudioTrack;
import com.immomo.mediabase.AudioParameter;
import com.immomo.mediacore.audio.AudioProcess;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public class qb1 {

    /* JADX INFO: renamed from: n */
    private AudioProcess f153606n;

    /* JADX INFO: renamed from: a */
    private int f153593a = 0;

    /* JADX INFO: renamed from: b */
    private int f153594b = 0;

    /* JADX INFO: renamed from: c */
    private int f153595c = 0;

    /* JADX INFO: renamed from: d */
    private int f153596d = 0;

    /* JADX INFO: renamed from: e */
    private AudioTrack f153597e = null;

    /* JADX INFO: renamed from: f */
    private int f153598f = 3;

    /* JADX INFO: renamed from: h */
    private int f153600h = 200;

    /* JADX INFO: renamed from: i */
    private boolean f153601i = false;

    /* JADX INFO: renamed from: j */
    private int f153602j = 2;

    /* JADX INFO: renamed from: k */
    private boolean f153603k = false;

    /* JADX INFO: renamed from: l */
    private boolean f153604l = false;

    /* JADX INFO: renamed from: m */
    private boolean f153605m = true;

    /* JADX INFO: renamed from: o */
    private rb1 f153607o = null;

    /* JADX INFO: renamed from: p */
    private C19455b f153608p = null;

    /* JADX INFO: renamed from: q */
    private boolean f153609q = false;

    /* JADX INFO: renamed from: r */
    private ByteBuffer f153610r = ByteBuffer.allocate(2048);

    /* JADX INFO: renamed from: g */
    private ka1 f153599g = new ka1();

    /* JADX INFO: renamed from: l.qb1$b */
    public class C19455b extends Thread {

        /* JADX INFO: renamed from: l.qb1$b$a */
        public class a implements ka1.InterfaceC17964a {
            public a() {
            }

            @Override // p149l.ka1.InterfaceC17964a
            /* JADX INFO: renamed from: a */
            public void mo145140a(ByteBuffer byteBuffer) {
                qb1.this.f153597e.write(byteBuffer.array(), 0, 2048);
            }

            @Override // p149l.ka1.InterfaceC17964a
            /* JADX INFO: renamed from: b */
            public void mo145141b(ByteBuffer byteBuffer) {
                qb1.this.m173804r(byteBuffer);
            }
        }

        private C19455b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        @TargetApi(3)
        public void run() {
            qb1.this.f153597e.play();
            a aVar = new a();
            while (true) {
                boolean z = qb1.this.f153609q;
                qb1 qb1Var = qb1.this;
                if (z) {
                    qb1Var.f153597e.stop();
                    return;
                }
                if (qb1Var.f153604l) {
                    qb1.this.f153597e.stop();
                    qb1.this.f153597e.release();
                    try {
                        int i = qb1.this.f153594b == 2 ? 12 : 4;
                        int i2 = qb1.this.f153595c != 16 ? 3 : 2;
                        qb1 qb1Var2 = qb1.this;
                        qb1Var2.f153596d = AudioTrack.getMinBufferSize(qb1Var2.f153593a, i, i2);
                        qb1.this.f153597e = new AudioTrack(qb1.this.f153598f, qb1.this.f153593a, i, i2, qb1.this.f153596d, 1);
                        qb1.this.f153597e.play();
                        qb1.this.f153604l = false;
                    } catch (Exception unused) {
                        qb1.this.f153597e = null;
                        return;
                    }
                }
                qb1.this.f153599g.m145133c(aVar);
            }
        }
    }

    public qb1(AudioProcess audioProcess) {
        this.f153606n = audioProcess;
    }

    /* JADX INFO: renamed from: v */
    public static byte[] m173798v(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i / 2];
        for (int i2 = 0; i2 < i / 4; i2++) {
            int i3 = i2 * 2;
            int i4 = i2 * 4;
            bArr2[i3] = bArr[i4];
            bArr2[i3 + 1] = bArr[i4 + 1];
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: m */
    public boolean m173799m(int i, String str, long j, long j2, boolean z, boolean z2) {
        boolean zM145131a = this.f153599g.m145131a(i, str, j, j2, z, z2);
        if (zM145131a) {
            rb1 rb1Var = this.f153607o;
            if (rb1Var != null) {
                rb1Var.m178542a(i, str);
            }
            if (this.f153597e.getPlayState() != 3) {
                m173807u();
            }
        }
        return zM145131a;
    }

    /* JADX INFO: renamed from: n */
    public long m173800n(long j) {
        return ((long) (((j * 1.0f) * this.f153593a) / 1000.0f)) * ((long) this.f153594b) * 2;
    }

    @TargetApi(3)
    /* JADX INFO: renamed from: o */
    public boolean m173801o(int i, int i2, int i3) {
        if (i != 0 && i2 != 0 && i3 != 0) {
            this.f153593a = i;
            this.f153595c = i2;
            this.f153594b = i3;
            int i4 = i3 == 2 ? 12 : 4;
            int i5 = i2 != 16 ? 3 : 2;
            try {
                this.f153596d = AudioTrack.getMinBufferSize(i, i4, i5);
                this.f153597e = new AudioTrack(this.f153598f, this.f153593a, i4, i5, this.f153596d, 1);
                AudioParameter audioParameter = new AudioParameter();
                audioParameter.setNumChannels(i3);
                audioParameter.setSampleBits(i2);
                audioParameter.setSamplingRate(i);
                this.f153599g.m145139i(true, audioParameter);
                return true;
            } catch (Exception unused) {
                this.f153597e = null;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public void m173802p() {
        this.f153599g.m145136f();
        m173808w();
    }

    /* JADX INFO: renamed from: q */
    public void m173803q(int i) {
        this.f153599g.m145137g(i);
        rb1 rb1Var = this.f153607o;
        if (rb1Var != null) {
            rb1Var.m178551j(i);
        }
        if (this.f153599g.m145134d() <= 0) {
            m173808w();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m173804r(ByteBuffer byteBuffer) {
        AudioProcess audioProcess = this.f153606n;
        if (audioProcess == null) {
            return;
        }
        if (this.f153603k) {
            this.f153603k = false;
            audioProcess.clearSurroundExtraFrames2();
            this.f153610r.clear();
        }
        if (this.f153601i && this.f153605m) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2048);
            Arrays.fill(byteBufferAllocate.array(), (byte) 0);
            long jM173800n = m173800n(this.f153600h);
            if (this.f153602j == 1) {
                jM173800n /= 2;
            }
            mpd0 mpd0Var = new mpd0(byteBufferAllocate.array(), System.nanoTime() / 1000, this.f153594b);
            for (int i = 0; i < jM173800n / 2048; i++) {
                this.f153606n.putSurroundExtraData2(mpd0Var);
            }
            this.f153601i = false;
        }
        if (this.f153605m) {
            if (this.f153602j != 1) {
                this.f153606n.putSurroundExtraData2(new mpd0(byteBuffer.array(), System.nanoTime() / 1000, this.f153594b));
                return;
            }
            byte[] bArrM173798v = m173798v(byteBuffer.array(), 2048);
            if (this.f153610r.remaining() >= 1024) {
                this.f153610r.put(bArrM173798v, 0, 1024);
            }
            if (this.f153610r.remaining() <= 0) {
                this.f153610r.flip();
                byte[] bArr = new byte[2048];
                System.arraycopy(this.f153610r.array(), 0, bArr, 0, 2048);
                this.f153606n.putSurroundExtraData2(new mpd0(bArr, System.nanoTime() / 1000, this.f153602j));
                this.f153610r.clear();
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m173805s(rb1 rb1Var) {
        this.f153607o = rb1Var;
        ka1 ka1Var = this.f153599g;
        if (ka1Var != null) {
            ka1Var.m145138h(rb1Var);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m173806t(int i) {
        if (this.f153598f != i) {
            this.f153598f = i;
            this.f153604l = true;
        }
    }

    /* JADX INFO: renamed from: u */
    public void m173807u() {
        if (this.f153608p == null) {
            this.f153609q = false;
            C19455b c19455b = new C19455b();
            this.f153608p = c19455b;
            c19455b.start();
            rb1 rb1Var = this.f153607o;
            if (rb1Var != null) {
                rb1Var.m178549h();
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m173808w() {
        this.f153609q = true;
        C19455b c19455b = this.f153608p;
        if (c19455b != null) {
            try {
                c19455b.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.f153608p = null;
            rb1 rb1Var = this.f153607o;
            if (rb1Var != null) {
                rb1Var.m178547f();
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public void m173809x(AudioProcess audioProcess, int i) {
        if (audioProcess != null) {
            if (audioProcess == this.f153606n && i == this.f153602j) {
                return;
            }
            audioProcess.clearSurroundExtraFrames();
            this.f153606n = audioProcess;
            this.f153602j = i;
            this.f153603k = true;
        }
    }
}
