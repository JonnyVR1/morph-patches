package p153l;

import android.annotation.TargetApi;
import android.media.AudioTrack;
import com.immomo.mediabase.AudioParameter;
import com.immomo.mediacore.audio.AudioProcess;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public class xb1 {

    /* JADX INFO: renamed from: n */
    private AudioProcess f193112n;

    /* JADX INFO: renamed from: a */
    private int f193099a = 0;

    /* JADX INFO: renamed from: b */
    private int f193100b = 0;

    /* JADX INFO: renamed from: c */
    private int f193101c = 0;

    /* JADX INFO: renamed from: d */
    private int f193102d = 0;

    /* JADX INFO: renamed from: e */
    private AudioTrack f193103e = null;

    /* JADX INFO: renamed from: f */
    private int f193104f = 3;

    /* JADX INFO: renamed from: h */
    private int f193106h = 200;

    /* JADX INFO: renamed from: i */
    private boolean f193107i = false;

    /* JADX INFO: renamed from: j */
    private int f193108j = 2;

    /* JADX INFO: renamed from: k */
    private boolean f193109k = false;

    /* JADX INFO: renamed from: l */
    private boolean f193110l = false;

    /* JADX INFO: renamed from: m */
    private boolean f193111m = true;

    /* JADX INFO: renamed from: o */
    private yb1 f193113o = null;

    /* JADX INFO: renamed from: p */
    private C21275b f193114p = null;

    /* JADX INFO: renamed from: q */
    private boolean f193115q = false;

    /* JADX INFO: renamed from: r */
    private ByteBuffer f193116r = ByteBuffer.allocate(2048);

    /* JADX INFO: renamed from: g */
    private ra1 f193105g = new ra1();

    /* JADX INFO: renamed from: l.xb1$b */
    public class C21275b extends Thread {

        /* JADX INFO: renamed from: l.xb1$b$a */
        public class a implements ra1.InterfaceC19802a {
            public a() {
            }

            @Override // p153l.ra1.InterfaceC19802a
            /* JADX INFO: renamed from: a */
            public void mo180704a(ByteBuffer byteBuffer) {
                xb1.this.f193103e.write(byteBuffer.array(), 0, 2048);
            }

            @Override // p153l.ra1.InterfaceC19802a
            /* JADX INFO: renamed from: b */
            public void mo180705b(ByteBuffer byteBuffer) {
                xb1.this.m209937r(byteBuffer);
            }
        }

        private C21275b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        @TargetApi(3)
        public void run() {
            xb1.this.f193103e.play();
            a aVar = new a();
            while (true) {
                boolean z = xb1.this.f193115q;
                xb1 xb1Var = xb1.this;
                if (z) {
                    xb1Var.f193103e.stop();
                    return;
                }
                if (xb1Var.f193110l) {
                    xb1.this.f193103e.stop();
                    xb1.this.f193103e.release();
                    try {
                        int i = xb1.this.f193100b == 2 ? 12 : 4;
                        int i2 = xb1.this.f193101c != 16 ? 3 : 2;
                        xb1 xb1Var2 = xb1.this;
                        xb1Var2.f193102d = AudioTrack.getMinBufferSize(xb1Var2.f193099a, i, i2);
                        xb1.this.f193103e = new AudioTrack(xb1.this.f193104f, xb1.this.f193099a, i, i2, xb1.this.f193102d, 1);
                        xb1.this.f193103e.play();
                        xb1.this.f193110l = false;
                    } catch (Exception unused) {
                        xb1.this.f193103e = null;
                        return;
                    }
                }
                xb1.this.f193105g.m180697c(aVar);
            }
        }
    }

    public xb1(AudioProcess audioProcess) {
        this.f193112n = audioProcess;
    }

    /* JADX INFO: renamed from: v */
    public static byte[] m209931v(byte[] bArr, int i) {
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
    public boolean m209932m(int i, String str, long j, long j2, boolean z, boolean z2) {
        boolean zM180695a = this.f193105g.m180695a(i, str, j, j2, z, z2);
        if (zM180695a) {
            yb1 yb1Var = this.f193113o;
            if (yb1Var != null) {
                yb1Var.m214962a(i, str);
            }
            if (this.f193103e.getPlayState() != 3) {
                m209940u();
            }
        }
        return zM180695a;
    }

    /* JADX INFO: renamed from: n */
    public long m209933n(long j) {
        return ((long) (((j * 1.0f) * this.f193099a) / 1000.0f)) * ((long) this.f193100b) * 2;
    }

    @TargetApi(3)
    /* JADX INFO: renamed from: o */
    public boolean m209934o(int i, int i2, int i3) {
        if (i != 0 && i2 != 0 && i3 != 0) {
            this.f193099a = i;
            this.f193101c = i2;
            this.f193100b = i3;
            int i4 = i3 == 2 ? 12 : 4;
            int i5 = i2 != 16 ? 3 : 2;
            try {
                this.f193102d = AudioTrack.getMinBufferSize(i, i4, i5);
                this.f193103e = new AudioTrack(this.f193104f, this.f193099a, i4, i5, this.f193102d, 1);
                AudioParameter audioParameter = new AudioParameter();
                audioParameter.setNumChannels(i3);
                audioParameter.setSampleBits(i2);
                audioParameter.setSamplingRate(i);
                this.f193105g.m180703i(true, audioParameter);
                return true;
            } catch (Exception unused) {
                this.f193103e = null;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public void m209935p() {
        this.f193105g.m180700f();
        m209941w();
    }

    /* JADX INFO: renamed from: q */
    public void m209936q(int i) {
        this.f193105g.m180701g(i);
        yb1 yb1Var = this.f193113o;
        if (yb1Var != null) {
            yb1Var.m214971j(i);
        }
        if (this.f193105g.m180698d() <= 0) {
            m209941w();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m209937r(ByteBuffer byteBuffer) {
        AudioProcess audioProcess = this.f193112n;
        if (audioProcess == null) {
            return;
        }
        if (this.f193109k) {
            this.f193109k = false;
            audioProcess.clearSurroundExtraFrames2();
            this.f193116r.clear();
        }
        if (this.f193107i && this.f193111m) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2048);
            Arrays.fill(byteBufferAllocate.array(), (byte) 0);
            long jM209933n = m209933n(this.f193106h);
            if (this.f193108j == 1) {
                jM209933n /= 2;
            }
            oxd0 oxd0Var = new oxd0(byteBufferAllocate.array(), System.nanoTime() / 1000, this.f193100b);
            for (int i = 0; i < jM209933n / 2048; i++) {
                this.f193112n.putSurroundExtraData2(oxd0Var);
            }
            this.f193107i = false;
        }
        if (this.f193111m) {
            if (this.f193108j != 1) {
                this.f193112n.putSurroundExtraData2(new oxd0(byteBuffer.array(), System.nanoTime() / 1000, this.f193100b));
                return;
            }
            byte[] bArrM209931v = m209931v(byteBuffer.array(), 2048);
            if (this.f193116r.remaining() >= 1024) {
                this.f193116r.put(bArrM209931v, 0, 1024);
            }
            if (this.f193116r.remaining() <= 0) {
                this.f193116r.flip();
                byte[] bArr = new byte[2048];
                System.arraycopy(this.f193116r.array(), 0, bArr, 0, 2048);
                this.f193112n.putSurroundExtraData2(new oxd0(bArr, System.nanoTime() / 1000, this.f193108j));
                this.f193116r.clear();
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m209938s(yb1 yb1Var) {
        this.f193113o = yb1Var;
        ra1 ra1Var = this.f193105g;
        if (ra1Var != null) {
            ra1Var.m180702h(yb1Var);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m209939t(int i) {
        if (this.f193104f != i) {
            this.f193104f = i;
            this.f193110l = true;
        }
    }

    /* JADX INFO: renamed from: u */
    public void m209940u() {
        if (this.f193114p == null) {
            this.f193115q = false;
            C21275b c21275b = new C21275b();
            this.f193114p = c21275b;
            c21275b.start();
            yb1 yb1Var = this.f193113o;
            if (yb1Var != null) {
                yb1Var.m214969h();
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m209941w() {
        this.f193115q = true;
        C21275b c21275b = this.f193114p;
        if (c21275b != null) {
            try {
                c21275b.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.f193114p = null;
            yb1 yb1Var = this.f193113o;
            if (yb1Var != null) {
                yb1Var.m214967f();
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public void m209942x(AudioProcess audioProcess, int i) {
        if (audioProcess != null) {
            if (audioProcess == this.f193112n && i == this.f193108j) {
                return;
            }
            audioProcess.clearSurroundExtraFrames();
            this.f193112n = audioProcess;
            this.f193108j = i;
            this.f193109k = true;
        }
    }
}
