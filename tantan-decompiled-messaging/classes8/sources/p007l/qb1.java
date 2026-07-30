package p007l;

import android.annotation.TargetApi;
import android.media.AudioTrack;
import com.immomo.mediabase.AudioParameter;
import com.immomo.mediacore.audio.AudioProcess;
import java.nio.ByteBuffer;
import java.util.Arrays;
import l.mpd0;
import l.rb1;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class qb1 {

    /* JADX INFO: renamed from: n */
    private AudioProcess f3840n;

    /* JADX INFO: renamed from: a */
    private int f3827a = 0;

    /* JADX INFO: renamed from: b */
    private int f3828b = 0;

    /* JADX INFO: renamed from: c */
    private int f3829c = 0;

    /* JADX INFO: renamed from: d */
    private int f3830d = 0;

    /* JADX INFO: renamed from: e */
    private AudioTrack f3831e = null;

    /* JADX INFO: renamed from: f */
    private int f3832f = 3;

    /* JADX INFO: renamed from: h */
    private int f3834h = 200;

    /* JADX INFO: renamed from: i */
    private boolean f3835i = false;

    /* JADX INFO: renamed from: j */
    private int f3836j = 2;

    /* JADX INFO: renamed from: k */
    private boolean f3837k = false;

    /* JADX INFO: renamed from: l */
    private boolean f3838l = false;

    /* JADX INFO: renamed from: m */
    private boolean f3839m = true;

    /* JADX INFO: renamed from: o */
    private rb1 f3841o = null;

    /* JADX INFO: renamed from: p */
    private C0667b f3842p = null;

    /* JADX INFO: renamed from: q */
    private boolean f3843q = false;

    /* JADX INFO: renamed from: r */
    private ByteBuffer f3844r = ByteBuffer.allocate(2048);

    /* JADX INFO: renamed from: g */
    private ka1 f3833g = new ka1();

    /* JADX INFO: renamed from: l.qb1$b */
    public class C0667b extends Thread {

        /* JADX INFO: renamed from: l.qb1$b$a */
        public class a implements ka1.InterfaceC0584a {
            public a() {
            }

            @Override // p007l.ka1.InterfaceC0584a
            /* JADX INFO: renamed from: a */
            public void mo9586a(ByteBuffer byteBuffer) {
                qb1.this.f3831e.write(byteBuffer.array(), 0, 2048);
            }

            @Override // p007l.ka1.InterfaceC0584a
            /* JADX INFO: renamed from: b */
            public void mo9587b(ByteBuffer byteBuffer) {
                qb1.this.m10327r(byteBuffer);
            }
        }

        private C0667b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        @TargetApi(3)
        public void run() {
            qb1.this.f3831e.play();
            a aVar = new a();
            while (true) {
                boolean z = qb1.this.f3843q;
                qb1 qb1Var = qb1.this;
                if (z) {
                    qb1Var.f3831e.stop();
                    return;
                }
                if (qb1Var.f3838l) {
                    qb1.this.f3831e.stop();
                    qb1.this.f3831e.release();
                    try {
                        int i = qb1.this.f3828b == 2 ? 12 : 4;
                        int i2 = qb1.this.f3829c != 16 ? 3 : 2;
                        qb1 qb1Var2 = qb1.this;
                        qb1Var2.f3830d = AudioTrack.getMinBufferSize(qb1Var2.f3827a, i, i2);
                        qb1.this.f3831e = new AudioTrack(qb1.this.f3832f, qb1.this.f3827a, i, i2, qb1.this.f3830d, 1);
                        qb1.this.f3831e.play();
                        qb1.this.f3838l = false;
                    } catch (Exception unused) {
                        qb1.this.f3831e = null;
                        return;
                    }
                }
                qb1.this.f3833g.m9579c(aVar);
            }
        }
    }

    public qb1(AudioProcess audioProcess) {
        this.f3840n = audioProcess;
    }

    /* JADX INFO: renamed from: v */
    public static byte[] m10321v(byte[] bArr, int i) {
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
    public boolean m10322m(int i, String str, long j, long j2, boolean z, boolean z2) {
        boolean zM9577a = this.f3833g.m9577a(i, str, j, j2, z, z2);
        if (zM9577a) {
            rb1 rb1Var = this.f3841o;
            if (rb1Var != null) {
                rb1Var.a(i, str);
            }
            if (this.f3831e.getPlayState() != 3) {
                m10330u();
            }
        }
        return zM9577a;
    }

    /* JADX INFO: renamed from: n */
    public long m10323n(long j) {
        return ((long) (((j * 1.0f) * this.f3827a) / 1000.0f)) * ((long) this.f3828b) * 2;
    }

    @TargetApi(3)
    /* JADX INFO: renamed from: o */
    public boolean m10324o(int i, int i2, int i3) {
        if (i != 0 && i2 != 0 && i3 != 0) {
            this.f3827a = i;
            this.f3829c = i2;
            this.f3828b = i3;
            int i4 = i3 == 2 ? 12 : 4;
            int i5 = i2 != 16 ? 3 : 2;
            try {
                this.f3830d = AudioTrack.getMinBufferSize(i, i4, i5);
                this.f3831e = new AudioTrack(this.f3832f, this.f3827a, i4, i5, this.f3830d, 1);
                AudioParameter audioParameter = new AudioParameter();
                audioParameter.setNumChannels(i3);
                audioParameter.setSampleBits(i2);
                audioParameter.setSamplingRate(i);
                this.f3833g.m9585i(true, audioParameter);
                return true;
            } catch (Exception unused) {
                this.f3831e = null;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public void m10325p() {
        this.f3833g.m9582f();
        m10331w();
    }

    /* JADX INFO: renamed from: q */
    public void m10326q(int i) {
        this.f3833g.m9583g(i);
        rb1 rb1Var = this.f3841o;
        if (rb1Var != null) {
            rb1Var.j(i);
        }
        if (this.f3833g.m9580d() <= 0) {
            m10331w();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m10327r(ByteBuffer byteBuffer) {
        AudioProcess audioProcess = this.f3840n;
        if (audioProcess == null) {
            return;
        }
        if (this.f3837k) {
            this.f3837k = false;
            audioProcess.clearSurroundExtraFrames2();
            this.f3844r.clear();
        }
        if (this.f3835i && this.f3839m) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2048);
            Arrays.fill(byteBufferAllocate.array(), (byte) 0);
            long jM10323n = m10323n(this.f3834h);
            if (this.f3836j == 1) {
                jM10323n /= 2;
            }
            mpd0 mpd0Var = new mpd0(byteBufferAllocate.array(), System.nanoTime() / 1000, this.f3828b);
            for (int i = 0; i < jM10323n / 2048; i++) {
                this.f3840n.putSurroundExtraData2(mpd0Var);
            }
            this.f3835i = false;
        }
        if (this.f3839m) {
            if (this.f3836j != 1) {
                this.f3840n.putSurroundExtraData2(new mpd0(byteBuffer.array(), System.nanoTime() / 1000, this.f3828b));
                return;
            }
            byte[] bArrM10321v = m10321v(byteBuffer.array(), 2048);
            if (this.f3844r.remaining() >= 1024) {
                this.f3844r.put(bArrM10321v, 0, 1024);
            }
            if (this.f3844r.remaining() <= 0) {
                this.f3844r.flip();
                byte[] bArr = new byte[2048];
                System.arraycopy(this.f3844r.array(), 0, bArr, 0, 2048);
                this.f3840n.putSurroundExtraData2(new mpd0(bArr, System.nanoTime() / 1000, this.f3836j));
                this.f3844r.clear();
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m10328s(rb1 rb1Var) {
        this.f3841o = rb1Var;
        ka1 ka1Var = this.f3833g;
        if (ka1Var != null) {
            ka1Var.m9584h(rb1Var);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m10329t(int i) {
        if (this.f3832f != i) {
            this.f3832f = i;
            this.f3838l = true;
        }
    }

    /* JADX INFO: renamed from: u */
    public void m10330u() {
        if (this.f3842p == null) {
            this.f3843q = false;
            C0667b c0667b = new C0667b();
            this.f3842p = c0667b;
            c0667b.start();
            rb1 rb1Var = this.f3841o;
            if (rb1Var != null) {
                rb1Var.h();
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m10331w() {
        this.f3843q = true;
        C0667b c0667b = this.f3842p;
        if (c0667b != null) {
            try {
                c0667b.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.f3842p = null;
            rb1 rb1Var = this.f3841o;
            if (rb1Var != null) {
                rb1Var.f();
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public void m10332x(AudioProcess audioProcess, int i) {
        if (audioProcess != null) {
            if (audioProcess == this.f3840n && i == this.f3836j) {
                return;
            }
            audioProcess.clearSurroundExtraFrames();
            this.f3840n = audioProcess;
            this.f3836j = i;
            this.f3837k = true;
        }
    }
}
