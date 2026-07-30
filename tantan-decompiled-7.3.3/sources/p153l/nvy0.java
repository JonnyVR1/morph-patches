package p153l;

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
public final class nvy0 implements dwy0 {

    /* JADX INFO: renamed from: g */
    @GuardedBy("MESSAGE_PARAMS_INSTANCE_POOL")
    public static final ArrayDeque f143896g = new ArrayDeque();

    /* JADX INFO: renamed from: h */
    public static final Object f143897h = new Object();

    /* JADX INFO: renamed from: a */
    public final MediaCodec f143898a;

    /* JADX INFO: renamed from: b */
    public final HandlerThread f143899b;

    /* JADX INFO: renamed from: c */
    public Handler f143900c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference f143901d;

    /* JADX INFO: renamed from: e */
    public final bjv0 f143902e;

    /* JADX INFO: renamed from: f */
    public boolean f143903f;

    public nvy0(MediaCodec mediaCodec, HandlerThread handlerThread) {
        bjv0 bjv0Var = new bjv0(mfv0.f136676a);
        this.f143898a = mediaCodec;
        this.f143899b = handlerThread;
        this.f143902e = bjv0Var;
        this.f143901d = new AtomicReference();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ void m164933d(nvy0 nvy0Var, Message message) {
        mvy0 mvy0Var;
        ArrayDeque arrayDeque;
        int i = message.what;
        mvy0 mvy0Var2 = null;
        if (i != 0) {
            if (i == 1) {
                mvy0Var = (mvy0) message.obj;
                int i2 = mvy0Var.f138985a;
                MediaCodec.CryptoInfo cryptoInfo = mvy0Var.f138988d;
                long j = mvy0Var.f138989e;
                int i3 = mvy0Var.f138990f;
                try {
                    synchronized (f143897h) {
                        nvy0Var.f143898a.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                    }
                } catch (RuntimeException e) {
                    kvy0.m151678a(nvy0Var.f143901d, null, e);
                }
            } else if (i == 2) {
                nvy0Var.f143902e.m104777e();
            } else if (i != 3) {
                kvy0.m151678a(nvy0Var.f143901d, null, new IllegalStateException(String.valueOf(i)));
            } else {
                try {
                    nvy0Var.f143898a.setParameters((Bundle) message.obj);
                } catch (RuntimeException e2) {
                    kvy0.m151678a(nvy0Var.f143901d, null, e2);
                }
            }
            if (mvy0Var2 != null) {
                arrayDeque = f143896g;
                synchronized (arrayDeque) {
                    arrayDeque.add(mvy0Var2);
                }
            }
        }
        mvy0Var = (mvy0) message.obj;
        try {
            nvy0Var.f143898a.queueInputBuffer(mvy0Var.f138985a, 0, mvy0Var.f138987c, mvy0Var.f138989e, mvy0Var.f138990f);
        } catch (RuntimeException e3) {
            kvy0.m151678a(nvy0Var.f143901d, null, e3);
        }
        mvy0Var2 = mvy0Var;
        if (mvy0Var2 != null) {
            arrayDeque = f143896g;
            synchronized (arrayDeque) {
                arrayDeque.add(mvy0Var2);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static mvy0 m164934e() {
        ArrayDeque arrayDeque = f143896g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new mvy0();
                }
                return (mvy0) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static byte[] m164935f(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
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
    public static int[] m164936g(@Nullable int[] iArr, @Nullable int[] iArr2) {
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

    @Override // p153l.dwy0
    /* JADX INFO: renamed from: a */
    public final void mo118424a(Bundle bundle) {
        zzc();
        Handler handler = this.f143900c;
        int i = mpw0.f137957a;
        handler.obtainMessage(3, bundle).sendToTarget();
    }

    @Override // p153l.dwy0
    /* JADX INFO: renamed from: b */
    public final void mo118425b(int i, int i2, tux0 tux0Var, long j, int i3) {
        zzc();
        mvy0 mvy0VarM164934e = m164934e();
        mvy0VarM164934e.m160359a(i, 0, 0, j, 0);
        MediaCodec.CryptoInfo cryptoInfo = mvy0VarM164934e.f138988d;
        cryptoInfo.numSubSamples = tux0Var.f176226f;
        cryptoInfo.numBytesOfClearData = m164936g(tux0Var.f176224d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = m164936g(tux0Var.f176225e, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrM164935f = m164935f(tux0Var.f176222b, cryptoInfo.key);
        bArrM164935f.getClass();
        cryptoInfo.key = bArrM164935f;
        byte[] bArrM164935f2 = m164935f(tux0Var.f176221a, cryptoInfo.iv);
        bArrM164935f2.getClass();
        cryptoInfo.iv = bArrM164935f2;
        cryptoInfo.mode = tux0Var.f176223c;
        if (mpw0.f137957a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(tux0Var.f176227g, tux0Var.f176228h));
        }
        this.f143900c.obtainMessage(1, mvy0VarM164934e).sendToTarget();
    }

    @Override // p153l.dwy0
    /* JADX INFO: renamed from: c */
    public final void mo118426c(int i, int i2, int i3, long j, int i4) {
        zzc();
        mvy0 mvy0VarM164934e = m164934e();
        mvy0VarM164934e.m160359a(i, 0, i3, j, i4);
        Handler handler = this.f143900c;
        int i5 = mpw0.f137957a;
        handler.obtainMessage(0, mvy0VarM164934e).sendToTarget();
    }

    @Override // p153l.dwy0
    public final void zzb() {
        if (this.f143903f) {
            try {
                Handler handler = this.f143900c;
                if (handler == null) {
                    throw null;
                }
                handler.removeCallbacksAndMessages(null);
                this.f143902e.m104775c();
                Handler handler2 = this.f143900c;
                if (handler2 == null) {
                    throw null;
                }
                handler2.obtainMessage(2).sendToTarget();
                this.f143902e.m104773a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                xpg0.m212648a(e);
            }
        }
    }

    @Override // p153l.dwy0
    public final void zzc() {
        RuntimeException runtimeException = (RuntimeException) this.f143901d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // p153l.dwy0
    public final void zzg() {
        if (this.f143903f) {
            zzb();
            this.f143899b.quit();
        }
        this.f143903f = false;
    }

    @Override // p153l.dwy0
    public final void zzh() {
        if (this.f143903f) {
            return;
        }
        this.f143899b.start();
        this.f143900c = new lvy0(this, this.f143899b.getLooper());
        this.f143903f = true;
    }
}
