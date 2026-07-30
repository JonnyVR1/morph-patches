package p153l;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayDeque;
import org.aspectj.lang.JoinPoint;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(23)
public final class rvy0 extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b */
    public final HandlerThread f165075b;

    /* JADX INFO: renamed from: c */
    public Handler f165076c;

    /* JADX INFO: renamed from: h */
    @Nullable
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public MediaFormat f165081h;

    /* JADX INFO: renamed from: i */
    @Nullable
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public MediaFormat f165082i;

    /* JADX INFO: renamed from: j */
    @Nullable
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public MediaCodec.CodecException f165083j;

    /* JADX INFO: renamed from: k */
    @Nullable
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public MediaCodec.CryptoException f165084k;

    /* JADX INFO: renamed from: l */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public long f165085l;

    /* JADX INFO: renamed from: m */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public boolean f165086m;

    /* JADX INFO: renamed from: n */
    @Nullable
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public IllegalStateException f165087n;

    /* JADX INFO: renamed from: a */
    public final Object f165074a = new Object();

    /* JADX INFO: renamed from: d */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public final a55 f165077d = new a55();

    /* JADX INFO: renamed from: e */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public final a55 f165078e = new a55();

    /* JADX INFO: renamed from: f */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public final ArrayDeque f165079f = new ArrayDeque();

    /* JADX INFO: renamed from: g */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public final ArrayDeque f165080g = new ArrayDeque();

    public rvy0(HandlerThread handlerThread) {
        this.f165075b = handlerThread;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m183323d(rvy0 rvy0Var) {
        synchronized (rvy0Var.f165074a) {
            try {
                if (rvy0Var.f165086m) {
                    return;
                }
                long j = rvy0Var.f165085l - 1;
                rvy0Var.f165085l = j;
                if (j > 0) {
                    return;
                }
                if (j >= 0) {
                    rvy0Var.m183331i();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (rvy0Var.f165074a) {
                    rvy0Var.f165087n = illegalStateException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m183324a() {
        synchronized (this.f165074a) {
            try {
                m183332j();
                int iM96029e = -1;
                if (m183333k()) {
                    return -1;
                }
                if (!this.f165077d.m96028d()) {
                    iM96029e = this.f165077d.m96029e();
                }
                return iM96029e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m183325b(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f165074a) {
            try {
                m183332j();
                if (m183333k()) {
                    return -1;
                }
                if (this.f165078e.m96028d()) {
                    return -1;
                }
                int iM96029e = this.f165078e.m96029e();
                if (iM96029e >= 0) {
                    lev0.m153954b(this.f165081h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f165079f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iM96029e == -2) {
                    this.f165081h = (MediaFormat) this.f165080g.remove();
                    iM96029e = -2;
                }
                return iM96029e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final MediaFormat m183326c() {
        MediaFormat mediaFormat;
        synchronized (this.f165074a) {
            try {
                mediaFormat = this.f165081h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    /* JADX INFO: renamed from: e */
    public final void m183327e() {
        synchronized (this.f165074a) {
            this.f165085l++;
            Handler handler = this.f165076c;
            int i = mpw0.f137957a;
            handler.post(new Runnable() { // from class: l.pvy0
                @Override // java.lang.Runnable
                public final void run() {
                    rvy0.m183323d(this.f154349a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m183328f(MediaCodec mediaCodec) {
        lev0.m153958f(this.f165076c == null);
        this.f165075b.start();
        Handler handler = new Handler(this.f165075b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f165076c = handler;
    }

    /* JADX INFO: renamed from: g */
    public final void m183329g() {
        synchronized (this.f165074a) {
            this.f165086m = true;
            this.f165075b.quit();
            m183331i();
        }
    }

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    /* JADX INFO: renamed from: h */
    public final void m183330h(MediaFormat mediaFormat) {
        this.f165078e.m96025a(-2);
        this.f165080g.add(mediaFormat);
    }

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    /* JADX INFO: renamed from: i */
    public final void m183331i() {
        if (!this.f165080g.isEmpty()) {
            this.f165082i = (MediaFormat) this.f165080g.getLast();
        }
        this.f165077d.m96026b();
        this.f165078e.m96026b();
        this.f165079f.clear();
        this.f165080g.clear();
    }

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    /* JADX INFO: renamed from: j */
    public final void m183332j() {
        IllegalStateException illegalStateException = this.f165087n;
        if (illegalStateException != null) {
            this.f165087n = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.f165083j;
        if (codecException != null) {
            this.f165083j = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.f165084k;
        if (cryptoException == null) {
            return;
        }
        this.f165084k = null;
        throw cryptoException;
    }

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    /* JADX INFO: renamed from: k */
    public final boolean m183333k() {
        return this.f165085l > 0 || this.f165086m;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f165074a) {
            this.f165084k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f165074a) {
            this.f165083j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f165074a) {
            this.f165077d.m96025a(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f165074a) {
            try {
                MediaFormat mediaFormat = this.f165082i;
                if (mediaFormat != null) {
                    m183330h(mediaFormat);
                    this.f165082i = null;
                }
                this.f165078e.m96025a(i);
                this.f165079f.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f165074a) {
            m183330h(mediaFormat);
            this.f165082i = null;
        }
    }
}
