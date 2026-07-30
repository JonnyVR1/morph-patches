package p149l;

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
public class t21 {

    /* JADX INFO: renamed from: g */
    @GuardedBy("MESSAGE_PARAMS_INSTANCE_POOL")
    public static final ArrayDeque<C20097b> f167418g = new ArrayDeque<>();

    /* JADX INFO: renamed from: h */
    public static final Object f167419h = new Object();

    /* JADX INFO: renamed from: a */
    public final MediaCodec f167420a;

    /* JADX INFO: renamed from: b */
    public final HandlerThread f167421b;

    /* JADX INFO: renamed from: c */
    public Handler f167422c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference<RuntimeException> f167423d;

    /* JADX INFO: renamed from: e */
    public final ss5 f167424e;

    /* JADX INFO: renamed from: f */
    public boolean f167425f;

    /* JADX INFO: renamed from: l.t21$a */
    public class HandlerC20096a extends Handler {
        public HandlerC20096a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            t21.this.m186943f(message);
        }
    }

    /* JADX INFO: renamed from: l.t21$b */
    public static class C20097b {

        /* JADX INFO: renamed from: a */
        public int f167427a;

        /* JADX INFO: renamed from: b */
        public int f167428b;

        /* JADX INFO: renamed from: c */
        public int f167429c;

        /* JADX INFO: renamed from: d */
        public final MediaCodec.CryptoInfo f167430d = new MediaCodec.CryptoInfo();

        /* JADX INFO: renamed from: e */
        public long f167431e;

        /* JADX INFO: renamed from: f */
        public int f167432f;

        /* JADX INFO: renamed from: a */
        public void m186954a(int i, int i2, int i3, long j, int i4) {
            this.f167427a = i;
            this.f167428b = i2;
            this.f167429c = i3;
            this.f167431e = j;
            this.f167432f = i4;
        }
    }

    @VisibleForTesting
    public t21(MediaCodec mediaCodec, HandlerThread handlerThread, ss5 ss5Var) {
        this.f167420a = mediaCodec;
        this.f167421b = handlerThread;
        this.f167424e = ss5Var;
        this.f167423d = new AtomicReference<>();
    }

    /* JADX INFO: renamed from: c */
    public static void m186937c(iwb iwbVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = iwbVar.f115250f;
        cryptoInfo.numBytesOfClearData = m186939e(iwbVar.f115248d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = m186939e(iwbVar.f115249e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) p11.m167011e(m186938d(iwbVar.f115246b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) p11.m167011e(m186938d(iwbVar.f115245a, cryptoInfo.iv));
        cryptoInfo.mode = iwbVar.f115247c;
        if (vck0.f180948a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(iwbVar.f115251g, iwbVar.f115252h));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static byte[] m186938d(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
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
    public static int[] m186939e(@Nullable int[] iArr, @Nullable int[] iArr2) {
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
    public static C20097b m186940k() {
        ArrayDeque<C20097b> arrayDeque = f167418g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new C20097b();
                }
                return arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m186941o(C20097b c20097b) {
        ArrayDeque<C20097b> arrayDeque = f167418g;
        synchronized (arrayDeque) {
            arrayDeque.add(c20097b);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m186942b() throws InterruptedException {
        this.f167424e.m185712c();
        ((Handler) p11.m167011e(this.f167422c)).obtainMessage(2).sendToTarget();
        this.f167424e.m185710a();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004b  */
    /* JADX WARN: Code duplicated, block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public final void m186943f(Message message) {
        C20097b c20097b;
        C20097b c20097b2;
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                c20097b2 = null;
                if (i != 2) {
                    f31.m119248a(this.f167423d, null, new IllegalStateException(String.valueOf(i)));
                } else {
                    this.f167424e.m185714e();
                }
            } else {
                c20097b = (C20097b) message.obj;
                m186945h(c20097b.f167427a, c20097b.f167428b, c20097b.f167430d, c20097b.f167431e, c20097b.f167432f);
            }
            if (c20097b2 != null) {
                m186941o(c20097b2);
            }
        }
        c20097b = (C20097b) message.obj;
        m186944g(c20097b.f167427a, c20097b.f167428b, c20097b.f167429c, c20097b.f167431e, c20097b.f167432f);
        c20097b2 = c20097b;
        if (c20097b2 != null) {
            m186941o(c20097b2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m186944g(int i, int i2, int i3, long j, int i4) {
        try {
            this.f167420a.queueInputBuffer(i, i2, i3, j, i4);
        } catch (RuntimeException e) {
            f31.m119248a(this.f167423d, null, e);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m186945h(int i, int i2, MediaCodec.CryptoInfo cryptoInfo, long j, int i3) {
        try {
            synchronized (f167419h) {
                this.f167420a.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
            }
        } catch (RuntimeException e) {
            f31.m119248a(this.f167423d, null, e);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m186946i() {
        if (this.f167425f) {
            try {
                m186947j();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                phg0.m168968a(e);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m186947j() throws InterruptedException {
        ((Handler) p11.m167011e(this.f167422c)).removeCallbacksAndMessages(null);
        m186942b();
    }

    /* JADX INFO: renamed from: l */
    public void m186948l() {
        RuntimeException andSet = this.f167423d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m186949m(int i, int i2, int i3, long j, int i4) {
        m186948l();
        C20097b c20097bM186940k = m186940k();
        c20097bM186940k.m186954a(i, i2, i3, j, i4);
        ((Handler) vck0.m197866j(this.f167422c)).obtainMessage(0, c20097bM186940k).sendToTarget();
    }

    /* JADX INFO: renamed from: n */
    public void m186950n(int i, int i2, iwb iwbVar, long j, int i3) {
        m186948l();
        C20097b c20097bM186940k = m186940k();
        c20097bM186940k.m186954a(i, i2, 0, j, i3);
        m186937c(iwbVar, c20097bM186940k.f167430d);
        ((Handler) vck0.m197866j(this.f167422c)).obtainMessage(1, c20097bM186940k).sendToTarget();
    }

    /* JADX INFO: renamed from: p */
    public void m186951p() {
        if (this.f167425f) {
            m186946i();
            this.f167421b.quit();
        }
        this.f167425f = false;
    }

    /* JADX INFO: renamed from: q */
    public void m186952q() {
        if (this.f167425f) {
            return;
        }
        this.f167421b.start();
        this.f167422c = new HandlerC20096a(this.f167421b.getLooper());
        this.f167425f = true;
    }

    /* JADX INFO: renamed from: r */
    public void m186953r() throws InterruptedException {
        m186942b();
    }

    public t21(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new ss5());
    }
}
