package p153l;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(23)
@Deprecated
public class a31 {

    /* JADX INFO: renamed from: g */
    @GuardedBy("MESSAGE_PARAMS_INSTANCE_POOL")
    public static final ArrayDeque<C15629b> f68235g = new ArrayDeque<>();

    /* JADX INFO: renamed from: h */
    public static final Object f68236h = new Object();

    /* JADX INFO: renamed from: a */
    public final MediaCodec f68237a;

    /* JADX INFO: renamed from: b */
    public final HandlerThread f68238b;

    /* JADX INFO: renamed from: c */
    public Handler f68239c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference<RuntimeException> f68240d;

    /* JADX INFO: renamed from: e */
    public final wt5 f68241e;

    /* JADX INFO: renamed from: f */
    public boolean f68242f;

    /* JADX INFO: renamed from: l.a31$a */
    public class HandlerC15628a extends Handler {
        public HandlerC15628a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a31.this.m95743f(message);
        }
    }

    /* JADX INFO: renamed from: l.a31$b */
    public static class C15629b {

        /* JADX INFO: renamed from: a */
        public int f68244a;

        /* JADX INFO: renamed from: b */
        public int f68245b;

        /* JADX INFO: renamed from: c */
        public int f68246c;

        /* JADX INFO: renamed from: d */
        public final MediaCodec.CryptoInfo f68247d = new MediaCodec.CryptoInfo();

        /* JADX INFO: renamed from: e */
        public long f68248e;

        /* JADX INFO: renamed from: f */
        public int f68249f;

        /* JADX INFO: renamed from: a */
        public void m95754a(int i, int i2, int i3, long j, int i4) {
            this.f68244a = i;
            this.f68245b = i2;
            this.f68246c = i3;
            this.f68248e = j;
            this.f68249f = i4;
        }
    }

    @VisibleForTesting
    public a31(MediaCodec mediaCodec, HandlerThread handlerThread, wt5 wt5Var) {
        this.f68237a = mediaCodec;
        this.f68238b = handlerThread;
        this.f68241e = wt5Var;
        this.f68240d = new AtomicReference<>();
    }

    /* JADX INFO: renamed from: c */
    public static void m95737c(wxb wxbVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = wxbVar.f191474f;
        cryptoInfo.numBytesOfClearData = m95739e(wxbVar.f191472d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = m95739e(wxbVar.f191473e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) w11.m204369e(m95738d(wxbVar.f191470b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) w11.m204369e(m95738d(wxbVar.f191469a, cryptoInfo.iv));
        cryptoInfo.mode = wxbVar.f191471c;
        if (bmk0.f77313a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(wxbVar.f191475g, wxbVar.f191476h));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static byte[] m95738d(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static int[] m95739e(@Nullable int[] iArr, @Nullable int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* JADX INFO: renamed from: k */
    public static C15629b m95740k() {
        ArrayDeque<C15629b> arrayDeque = f68235g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new C15629b();
                }
                return arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m95741o(C15629b c15629b) {
        ArrayDeque<C15629b> arrayDeque = f68235g;
        synchronized (arrayDeque) {
            arrayDeque.add(c15629b);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m95742b() throws InterruptedException {
        this.f68241e.m207819c();
        ((Handler) w11.m204369e(this.f68239c)).obtainMessage(2).sendToTarget();
        this.f68241e.m207817a();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004b  */
    /* JADX WARN: Code duplicated, block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public final void m95743f(Message message) {
        C15629b c15629b;
        C15629b c15629b2;
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                c15629b2 = null;
                if (i != 2) {
                    m31.m156916a(this.f68240d, null, new IllegalStateException(String.valueOf(i)));
                } else {
                    this.f68241e.m207821e();
                }
            } else {
                c15629b = (C15629b) message.obj;
                m95745h(c15629b.f68244a, c15629b.f68245b, c15629b.f68247d, c15629b.f68248e, c15629b.f68249f);
            }
            if (c15629b2 != null) {
                m95741o(c15629b2);
            }
        }
        c15629b = (C15629b) message.obj;
        m95744g(c15629b.f68244a, c15629b.f68245b, c15629b.f68246c, c15629b.f68248e, c15629b.f68249f);
        c15629b2 = c15629b;
        if (c15629b2 != null) {
            m95741o(c15629b2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m95744g(int i, int i2, int i3, long j, int i4) {
        try {
            this.f68237a.queueInputBuffer(i, i2, i3, j, i4);
        } catch (RuntimeException e) {
            m31.m156916a(this.f68240d, null, e);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m95745h(int i, int i2, MediaCodec.CryptoInfo cryptoInfo, long j, int i3) {
        try {
            synchronized (f68236h) {
                this.f68237a.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
            }
        } catch (RuntimeException e) {
            m31.m156916a(this.f68240d, null, e);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m95746i() {
        if (this.f68242f) {
            try {
                m95747j();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                xpg0.m212648a(e);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m95747j() throws InterruptedException {
        ((Handler) w11.m204369e(this.f68239c)).removeCallbacksAndMessages(null);
        m95742b();
    }

    /* JADX INFO: renamed from: l */
    public void m95748l() {
        RuntimeException andSet = this.f68240d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m95749m(int i, int i2, int i3, long j, int i4) {
        m95748l();
        C15629b c15629bM95740k = m95740k();
        c15629bM95740k.m95754a(i, i2, i3, j, i4);
        ((Handler) bmk0.m105144j(this.f68239c)).obtainMessage(0, c15629bM95740k).sendToTarget();
    }

    /* JADX INFO: renamed from: n */
    public void m95750n(int i, int i2, wxb wxbVar, long j, int i3) {
        m95748l();
        C15629b c15629bM95740k = m95740k();
        c15629bM95740k.m95754a(i, i2, 0, j, i3);
        m95737c(wxbVar, c15629bM95740k.f68247d);
        ((Handler) bmk0.m105144j(this.f68239c)).obtainMessage(1, c15629bM95740k).sendToTarget();
    }

    /* JADX INFO: renamed from: p */
    public void m95751p() {
        if (this.f68242f) {
            m95746i();
            this.f68238b.quit();
        }
        this.f68242f = false;
    }

    /* JADX INFO: renamed from: q */
    public void m95752q() {
        if (this.f68242f) {
            return;
        }
        this.f68238b.start();
        this.f68239c = new HandlerC15628a(this.f68238b.getLooper());
        this.f68242f = true;
    }

    /* JADX INFO: renamed from: r */
    public void m95753r() throws InterruptedException {
        m95742b();
    }

    public a31(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new wt5());
    }
}
