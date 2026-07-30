package p153l;

import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes8.dex */
public class dc1 {

    /* JADX INFO: renamed from: a */
    private final int f87719a = 1;

    /* JADX INFO: renamed from: b */
    private final int f87720b = -12345;

    /* JADX INFO: renamed from: c */
    private LinkedBlockingQueue<oxd0> f87721c = new LinkedBlockingQueue<>();

    /* JADX INFO: renamed from: d */
    private LinkedBlockingQueue<oxd0> f87722d = new LinkedBlockingQueue<>();

    /* JADX INFO: renamed from: e */
    private LinkedBlockingQueue<oxd0> f87723e = new LinkedBlockingQueue<>();

    /* JADX INFO: renamed from: f */
    private int f87724f = 0;

    /* JADX INFO: renamed from: g */
    private RunnableC16497b f87725g = new RunnableC16497b();

    /* JADX INFO: renamed from: h */
    private Thread f87726h = new Thread(this.f87725g, "live-media-APro");

    /* JADX INFO: renamed from: i */
    private float f87727i = 0.5f;

    /* JADX INFO: renamed from: j */
    private float f87728j = 0.5f;

    /* JADX INFO: renamed from: k */
    private float f87729k = 1.0f;

    /* JADX INFO: renamed from: l */
    private float f87730l = 0.7f;

    /* JADX INFO: renamed from: m */
    private volatile boolean f87731m = false;

    /* JADX INFO: renamed from: l.dc1$b */
    public class RunnableC16497b implements Runnable {
        private RunnableC16497b() {
        }

        /* JADX INFO: renamed from: a */
        public void m115194a() {
            try {
                dc1.this.f87722d.clear();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m115195b(oxd0 oxd0Var) {
            try {
                if (dc1.this.f87722d.size() > 10) {
                    dc1.this.f87722d.clear();
                }
                dc1.this.f87722d.offer(oxd0Var);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            oxd0 oxd0Var;
            long jM169688d;
            int i;
            ByteBuffer byteBufferAllocate;
            while (dc1.this.f87731m) {
                t9c.m189745c("AudioQProcessThread", "mAudioFrames.take()");
                try {
                    oxd0 oxd0Var2 = (oxd0) dc1.this.f87721c.take();
                    long jM169688d2 = oxd0Var2.m169688d();
                    t9c.m189745c("AudioQProcessThread", "mAudioFrames.take() end");
                    if (dc1.this.f87722d.isEmpty()) {
                        oxd0Var = null;
                        jM169688d = 0;
                    } else {
                        oxd0Var = (oxd0) dc1.this.f87722d.take();
                        jM169688d = oxd0Var.m169688d();
                    }
                    t9c.m189745c("AudioQProcessThread", "mSurroundFrames.take() end");
                    if (jM169688d2 == -12345 || jM169688d == -12345) {
                        t9c.m189745c("AudioQProcessThread", "AudioProcessRunnable exit FINISH_ID");
                        dc1.this.f87731m = false;
                        return;
                    }
                    t9c.m189745c("AudioQProcessThread", "data = ByteBuffer.allocate");
                    t9c.m189745c("AudioQProcessThread", "outPutFrame = ByteBuffer.allocate");
                    if (oxd0Var != null) {
                        byteBufferAllocate = dc1.this.m115190h(oxd0Var2.m169687c(), oxd0Var.m169687c(), oxd0Var2.f149642e);
                        oxd0Var2.m169690f();
                        oxd0Var.m169690f();
                    } else {
                        byte[] bArrM169687c = oxd0Var2.m169687c();
                        int i2 = 0;
                        while (true) {
                            i = oxd0Var2.f149642e;
                            if (i2 >= i / 2) {
                                break;
                            }
                            int i3 = i2 * 2;
                            int i4 = i3 + 1;
                            short s = (short) (((short) (((bArrM169687c[i4] << 8) & 65280) | (bArrM169687c[i3] & 255))) * 1.0f);
                            bArrM169687c[i4] = (byte) ((s >> 8) & 255);
                            bArrM169687c[i3] = (byte) (s & 255);
                            i2++;
                        }
                        byteBufferAllocate = ByteBuffer.allocate(i);
                        byteBufferAllocate.put(bArrM169687c);
                        byteBufferAllocate.rewind();
                        oxd0Var2.m169690f();
                    }
                    oxd0 oxd0Var3 = new oxd0(byteBufferAllocate, jM169688d2, 0);
                    try {
                        t9c.m189745c("AudioQProcessThread", "AudioProcessRunnable offer begin");
                        dc1.this.f87723e.offer(oxd0Var3);
                        t9c.m189745c("AudioQProcessThread", "AudioProcessRunnable offer end");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } catch (InterruptedException unused) {
                }
            }
            t9c.m189745c("AudioQProcessThread", "AudioProcessRunnable exit");
        }
    }

    /* JADX INFO: renamed from: f */
    public void m115188f() {
        t9c.m189745c("AudioQProcessThread", "clearSurroundFrames begin");
        if (this.f87726h != null) {
            this.f87725g.m115194a();
        }
        t9c.m189745c("AudioQProcessThread", "clearSurroundFrames end");
    }

    /* JADX INFO: renamed from: g */
    public oxd0 m115189g() {
        try {
            if (this.f87722d.size() > 0) {
                return this.f87722d.poll();
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public ByteBuffer m115190h(byte[] bArr, byte[] bArr2, int i) {
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
            float f4 = ((short) (((bArr[i4] << 8) & 65280) | (bArr[i3] & 255))) * this.f87729k * this.f87727i;
            float f5 = ((short) (((bArr2[i4] << 8) & 65280) | (bArr2[i3] & 255))) * this.f87730l * this.f87728j;
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
    public void m115191i(oxd0 oxd0Var) {
        if (this.f87726h != null) {
            this.f87725g.m115195b(oxd0Var);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m115192j(float f) {
        this.f87727i = f;
    }

    /* JADX INFO: renamed from: k */
    public void m115193k(float f) {
        this.f87728j = f;
    }
}
