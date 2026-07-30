package p149l;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(23)
public final class hmy0 implements xmy0 {

    /* JADX INFO: renamed from: g */
    @GuardedBy("MESSAGE_PARAMS_INSTANCE_POOL")
    public static final ArrayDeque f108510g = new ArrayDeque();

    /* JADX INFO: renamed from: h */
    public static final Object f108511h = new Object();

    /* JADX INFO: renamed from: a */
    public final MediaCodec f108512a;

    /* JADX INFO: renamed from: b */
    public final HandlerThread f108513b;

    /* JADX INFO: renamed from: c */
    public Handler f108514c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference f108515d;

    /* JADX INFO: renamed from: e */
    public final v9v0 f108516e;

    /* JADX INFO: renamed from: f */
    public boolean f108517f;

    public hmy0(MediaCodec mediaCodec, HandlerThread handlerThread) {
        v9v0 v9v0Var = new v9v0(g6v0.f101315a);
        this.f108512a = mediaCodec;
        this.f108513b = handlerThread;
        this.f108516e = v9v0Var;
        this.f108515d = new AtomicReference();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ void m131802d(hmy0 hmy0Var, Message message) {
        gmy0 gmy0Var;
        ArrayDeque arrayDeque;
        int i = message.what;
        gmy0 gmy0Var2 = null;
        if (i != 0) {
            if (i == 1) {
                gmy0Var = (gmy0) message.obj;
                int i2 = gmy0Var.f103554a;
                MediaCodec.CryptoInfo cryptoInfo = gmy0Var.f103557d;
                long j = gmy0Var.f103558e;
                int i3 = gmy0Var.f103559f;
                try {
                    synchronized (f108511h) {
                        hmy0Var.f108512a.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                    }
                } catch (RuntimeException e) {
                    emy0.m117249a(hmy0Var.f108515d, null, e);
                }
            } else if (i == 2) {
                hmy0Var.f108516e.m197605e();
            } else if (i != 3) {
                emy0.m117249a(hmy0Var.f108515d, null, new IllegalStateException(String.valueOf(i)));
            } else {
                try {
                    hmy0Var.f108512a.setParameters((Bundle) message.obj);
                } catch (RuntimeException e2) {
                    emy0.m117249a(hmy0Var.f108515d, null, e2);
                }
            }
            if (gmy0Var2 != null) {
                arrayDeque = f108510g;
                synchronized (arrayDeque) {
                    arrayDeque.add(gmy0Var2);
                }
            }
        }
        gmy0Var = (gmy0) message.obj;
        try {
            hmy0Var.f108512a.queueInputBuffer(gmy0Var.f103554a, 0, gmy0Var.f103556c, gmy0Var.f103558e, gmy0Var.f103559f);
        } catch (RuntimeException e3) {
            emy0.m117249a(hmy0Var.f108515d, null, e3);
        }
        gmy0Var2 = gmy0Var;
        if (gmy0Var2 != null) {
            arrayDeque = f108510g;
            synchronized (arrayDeque) {
                arrayDeque.add(gmy0Var2);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static gmy0 m131803e() {
        ArrayDeque arrayDeque = f108510g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new gmy0();
                }
                return (gmy0) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static byte[] m131804f(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static int[] m131805g(@Nullable int[] iArr, @Nullable int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    @Override // p149l.xmy0
    /* JADX INFO: renamed from: a */
    public final void mo131806a(Bundle bundle) {
        zzc();
        Handler handler = this.f108514c;
        int i = ggw0.f102568a;
        handler.obtainMessage(3, bundle).sendToTarget();
    }

    @Override // p149l.xmy0
    /* JADX INFO: renamed from: b */
    public final void mo131807b(int i, int i2, nlx0 nlx0Var, long j, int i3) {
        zzc();
        gmy0 gmy0VarM131803e = m131803e();
        gmy0VarM131803e.m127088a(i, 0, 0, j, 0);
        MediaCodec.CryptoInfo cryptoInfo = gmy0VarM131803e.f103557d;
        cryptoInfo.numSubSamples = nlx0Var.f139597f;
        cryptoInfo.numBytesOfClearData = m131805g(nlx0Var.f139595d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = m131805g(nlx0Var.f139596e, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrM131804f = m131804f(nlx0Var.f139593b, cryptoInfo.key);
        bArrM131804f.getClass();
        cryptoInfo.key = bArrM131804f;
        byte[] bArrM131804f2 = m131804f(nlx0Var.f139592a, cryptoInfo.iv);
        bArrM131804f2.getClass();
        cryptoInfo.iv = bArrM131804f2;
        cryptoInfo.mode = nlx0Var.f139594c;
        if (ggw0.f102568a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(nlx0Var.f139598g, nlx0Var.f139599h));
        }
        this.f108514c.obtainMessage(1, gmy0VarM131803e).sendToTarget();
    }

    @Override // p149l.xmy0
    /* JADX INFO: renamed from: c */
    public final void mo131808c(int i, int i2, int i3, long j, int i4) {
        zzc();
        gmy0 gmy0VarM131803e = m131803e();
        gmy0VarM131803e.m127088a(i, 0, i3, j, i4);
        Handler handler = this.f108514c;
        int i5 = ggw0.f102568a;
        handler.obtainMessage(0, gmy0VarM131803e).sendToTarget();
    }

    @Override // p149l.xmy0
    public final void zzb() {
        if (this.f108517f) {
            try {
                Handler handler = this.f108514c;
                if (handler == null) {
                    throw null;
                }
                handler.removeCallbacksAndMessages(null);
                this.f108516e.m197603c();
                Handler handler2 = this.f108514c;
                if (handler2 == null) {
                    throw null;
                }
                handler2.obtainMessage(2).sendToTarget();
                this.f108516e.m197601a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                phg0.m168968a(e);
            }
        }
    }

    @Override // p149l.xmy0
    public final void zzc() {
        RuntimeException runtimeException = (RuntimeException) this.f108515d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // p149l.xmy0
    public final void zzg() {
        if (this.f108517f) {
            zzb();
            this.f108513b.quit();
        }
        this.f108517f = false;
    }

    @Override // p149l.xmy0
    public final void zzh() {
        if (this.f108517f) {
            return;
        }
        this.f108513b.start();
        this.f108514c = new fmy0(this, this.f108513b.getLooper());
        this.f108517f = true;
    }
}
