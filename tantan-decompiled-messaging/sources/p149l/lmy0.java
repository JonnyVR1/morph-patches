package p149l;

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
public final class lmy0 extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b */
    public final HandlerThread f128935b;

    /* JADX INFO: renamed from: c */
    public Handler f128936c;

    /* JADX INFO: renamed from: h */
    @Nullable
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public MediaFormat f128941h;

    /* JADX INFO: renamed from: i */
    @Nullable
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public MediaFormat f128942i;

    /* JADX INFO: renamed from: j */
    @Nullable
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public MediaCodec.CodecException f128943j;

    /* JADX INFO: renamed from: k */
    @Nullable
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public MediaCodec.CryptoException f128944k;

    /* JADX INFO: renamed from: l */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public long f128945l;

    /* JADX INFO: renamed from: m */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public boolean f128946m;

    /* JADX INFO: renamed from: n */
    @Nullable
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public IllegalStateException f128947n;

    /* JADX INFO: renamed from: a */
    public final Object f128934a = new Object();

    /* JADX INFO: renamed from: d */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public final z35 f128937d = new z35();

    /* JADX INFO: renamed from: e */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public final z35 f128938e = new z35();

    /* JADX INFO: renamed from: f */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public final ArrayDeque f128939f = new ArrayDeque();

    /* JADX INFO: renamed from: g */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public final ArrayDeque f128940g = new ArrayDeque();

    public lmy0(HandlerThread handlerThread) {
        this.f128935b = handlerThread;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m150620d(lmy0 lmy0Var) {
        synchronized (lmy0Var.f128934a) {
            try {
                if (lmy0Var.f128946m) {
                    return;
                }
                long j = lmy0Var.f128945l - 1;
                lmy0Var.f128945l = j;
                if (j > 0) {
                    return;
                }
                if (j >= 0) {
                    lmy0Var.m150628i();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (lmy0Var.f128934a) {
                    lmy0Var.f128947n = illegalStateException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m150621a() {
        synchronized (this.f128934a) {
            try {
                m150629j();
                int iM217018e = -1;
                if (m150630k()) {
                    return -1;
                }
                if (!this.f128937d.m217017d()) {
                    iM217018e = this.f128937d.m217018e();
                }
                return iM217018e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m150622b(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f128934a) {
            try {
                m150629j();
                if (m150630k()) {
                    return -1;
                }
                if (this.f128938e.m217017d()) {
                    return -1;
                }
                int iM217018e = this.f128938e.m217018e();
                if (iM217018e >= 0) {
                    f5v0.m119531b(this.f128941h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f128939f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iM217018e == -2) {
                    this.f128941h = (MediaFormat) this.f128940g.remove();
                    iM217018e = -2;
                }
                return iM217018e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final MediaFormat m150623c() {
        MediaFormat mediaFormat;
        synchronized (this.f128934a) {
            try {
                mediaFormat = this.f128941h;
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
    public final void m150624e() {
        synchronized (this.f128934a) {
            this.f128945l++;
            Handler handler = this.f128936c;
            int i = ggw0.f102568a;
            handler.post(new Runnable() { // from class: l.jmy0
                @Override // java.lang.Runnable
                public final void run() {
                    lmy0.m150620d(this.f118740a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m150625f(MediaCodec mediaCodec) {
        f5v0.m119535f(this.f128936c == null);
        this.f128935b.start();
        Handler handler = new Handler(this.f128935b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f128936c = handler;
    }

    /* JADX INFO: renamed from: g */
    public final void m150626g() {
        synchronized (this.f128934a) {
            this.f128946m = true;
            this.f128935b.quit();
            m150628i();
        }
    }

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    /* JADX INFO: renamed from: h */
    public final void m150627h(MediaFormat mediaFormat) {
        this.f128938e.m217014a(-2);
        this.f128940g.add(mediaFormat);
    }

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    /* JADX INFO: renamed from: i */
    public final void m150628i() {
        if (!this.f128940g.isEmpty()) {
            this.f128942i = (MediaFormat) this.f128940g.getLast();
        }
        this.f128937d.m217015b();
        this.f128938e.m217015b();
        this.f128939f.clear();
        this.f128940g.clear();
    }

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    /* JADX INFO: renamed from: j */
    public final void m150629j() {
        IllegalStateException illegalStateException = this.f128947n;
        if (illegalStateException != null) {
            this.f128947n = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.f128943j;
        if (codecException != null) {
            this.f128943j = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.f128944k;
        if (cryptoException == null) {
            return;
        }
        this.f128944k = null;
        throw cryptoException;
    }

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    /* JADX INFO: renamed from: k */
    public final boolean m150630k() {
        return this.f128945l > 0 || this.f128946m;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f128934a) {
            this.f128944k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f128934a) {
            this.f128943j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f128934a) {
            this.f128937d.m217014a(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f128934a) {
            try {
                MediaFormat mediaFormat = this.f128942i;
                if (mediaFormat != null) {
                    m150627h(mediaFormat);
                    this.f128942i = null;
                }
                this.f128938e.m217014a(i);
                this.f128939f.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f128934a) {
            m150627h(mediaFormat);
            this.f128942i = null;
        }
    }
}
