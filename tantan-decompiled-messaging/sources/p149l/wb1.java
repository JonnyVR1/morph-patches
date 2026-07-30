package p149l;

import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes6.dex */
public class wb1 {

    /* JADX INFO: renamed from: a */
    private final int f185529a = 1;

    /* JADX INFO: renamed from: b */
    private final int f185530b = -12345;

    /* JADX INFO: renamed from: c */
    private LinkedBlockingQueue<mpd0> f185531c = new LinkedBlockingQueue<>();

    /* JADX INFO: renamed from: d */
    private LinkedBlockingQueue<mpd0> f185532d = new LinkedBlockingQueue<>();

    /* JADX INFO: renamed from: e */
    private LinkedBlockingQueue<mpd0> f185533e = new LinkedBlockingQueue<>();

    /* JADX INFO: renamed from: f */
    private int f185534f = 0;

    /* JADX INFO: renamed from: g */
    private RunnableC20844b f185535g = new RunnableC20844b();

    /* JADX INFO: renamed from: h */
    private Thread f185536h = new Thread(this.f185535g, "live-media-APro");

    /* JADX INFO: renamed from: i */
    private float f185537i = 0.5f;

    /* JADX INFO: renamed from: j */
    private float f185538j = 0.5f;

    /* JADX INFO: renamed from: k */
    private float f185539k = 1.0f;

    /* JADX INFO: renamed from: l */
    private float f185540l = 0.7f;

    /* JADX INFO: renamed from: m */
    private volatile boolean f185541m = false;

    /* JADX INFO: renamed from: l.wb1$b */
    public class RunnableC20844b implements Runnable {
        private RunnableC20844b() {
        }

        /* JADX INFO: renamed from: a */
        public void m202496a() {
            try {
                wb1.this.f185532d.clear();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m202497b(mpd0 mpd0Var) {
            try {
                if (wb1.this.f185532d.size() > 10) {
                    wb1.this.f185532d.clear();
                }
                wb1.this.f185532d.offer(mpd0Var);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            mpd0 mpd0Var;
            long jM155801d;
            int i;
            ByteBuffer byteBufferAllocate;
            while (wb1.this.f185541m) {
                n8c.m158485c("AudioQProcessThread", "mAudioFrames.take()");
                try {
                    mpd0 mpd0Var2 = (mpd0) wb1.this.f185531c.take();
                    long jM155801d2 = mpd0Var2.m155801d();
                    n8c.m158485c("AudioQProcessThread", "mAudioFrames.take() end");
                    if (wb1.this.f185532d.isEmpty()) {
                        mpd0Var = null;
                        jM155801d = 0;
                    } else {
                        mpd0Var = (mpd0) wb1.this.f185532d.take();
                        jM155801d = mpd0Var.m155801d();
                    }
                    n8c.m158485c("AudioQProcessThread", "mSurroundFrames.take() end");
                    if (jM155801d2 == -12345 || jM155801d == -12345) {
                        n8c.m158485c("AudioQProcessThread", "AudioProcessRunnable exit FINISH_ID");
                        wb1.this.f185541m = false;
                        return;
                    }
                    n8c.m158485c("AudioQProcessThread", "data = ByteBuffer.allocate");
                    n8c.m158485c("AudioQProcessThread", "outPutFrame = ByteBuffer.allocate");
                    if (mpd0Var != null) {
                        byteBufferAllocate = wb1.this.m202492h(mpd0Var2.m155800c(), mpd0Var.m155800c(), mpd0Var2.f135039e);
                        mpd0Var2.m155803f();
                        mpd0Var.m155803f();
                    } else {
                        byte[] bArrM155800c = mpd0Var2.m155800c();
                        int i2 = 0;
                        while (true) {
                            i = mpd0Var2.f135039e;
                            if (i2 >= i / 2) {
                                break;
                            }
                            int i3 = i2 * 2;
                            int i4 = i3 + 1;
                            short s = (short) (((short) (((bArrM155800c[i4] << 8) & 65280) | (bArrM155800c[i3] & 255))) * 1.0f);
                            bArrM155800c[i4] = (byte) ((s >> 8) & 255);
                            bArrM155800c[i3] = (byte) (s & 255);
                            i2++;
                        }
                        byteBufferAllocate = ByteBuffer.allocate(i);
                        byteBufferAllocate.put(bArrM155800c);
                        byteBufferAllocate.rewind();
                        mpd0Var2.m155803f();
                    }
                    mpd0 mpd0Var3 = new mpd0(byteBufferAllocate, jM155801d2, 0);
                    try {
                        n8c.m158485c("AudioQProcessThread", "AudioProcessRunnable offer begin");
                        wb1.this.f185533e.offer(mpd0Var3);
                        n8c.m158485c("AudioQProcessThread", "AudioProcessRunnable offer end");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } catch (InterruptedException unused) {
                }
            }
            n8c.m158485c("AudioQProcessThread", "AudioProcessRunnable exit");
        }
    }

    /* JADX INFO: renamed from: f */
    public void m202490f() {
        n8c.m158485c("AudioQProcessThread", "clearSurroundFrames begin");
        if (this.f185536h != null) {
            this.f185535g.m202496a();
        }
        n8c.m158485c("AudioQProcessThread", "clearSurroundFrames end");
    }

    /* JADX INFO: renamed from: g */
    public mpd0 m202491g() {
        try {
            if (this.f185532d.size() > 0) {
                return this.f185532d.poll();
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public ByteBuffer m202492h(byte[] bArr, byte[] bArr2, int i) {
        float f;
        float f2;
        float f3;
        if (bArr == null || bArr2 == null || i == 0 || bArr.length < i) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        byteBufferAllocate.clear();
        for (int i2 = 0; i2 < i / 2; i2++) {
            int i3 = i2 * 2;
            int i4 = i3 + 1;
            float f4 = ((short) (((bArr[i4] << 8) & 65280) | (bArr[i3] & 255))) * this.f185539k * this.f185537i;
            float f5 = ((short) (((bArr2[i4] << 8) & 65280) | (bArr2[i3] & 255))) * this.f185540l * this.f185538j;
            if (f4 >= 0.0f || f5 >= 0.0f) {
                f = f4 + f5;
                f2 = f4 * f5;
                f3 = 32767.0f;
            } else {
                f = f4 + f5;
                f2 = f4 * f5;
                f3 = -32767.0f;
            }
            short s = (short) (f - (f2 / f3));
            bArr[i4] = (byte) ((s >> 8) & 255);
            bArr[i3] = (byte) (s & 255);
        }
        byteBufferAllocate.put(bArr, 0, i);
        byteBufferAllocate.rewind();
        return byteBufferAllocate;
    }

    /* JADX INFO: renamed from: i */
    public void m202493i(mpd0 mpd0Var) {
        if (this.f185536h != null) {
            this.f185535g.m202497b(mpd0Var);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m202494j(float f) {
        this.f185537i = f;
    }

    /* JADX INFO: renamed from: k */
    public void m202495k(float f) {
        this.f185538j = f;
    }
}
