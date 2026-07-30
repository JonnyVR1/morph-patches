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
@Deprecated
public final class c31 extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b */
    public final HandlerThread f79560b;

    /* JADX INFO: renamed from: c */
    public Handler f79561c;

    /* JADX INFO: renamed from: h */
    @Nullable
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public MediaFormat f79566h;

    /* JADX INFO: renamed from: i */
    @Nullable
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public MediaFormat f79567i;

    /* JADX INFO: renamed from: j */
    @Nullable
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public MediaCodec.CodecException f79568j;

    /* JADX INFO: renamed from: k */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public long f79569k;

    /* JADX INFO: renamed from: l */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public boolean f79570l;

    /* JADX INFO: renamed from: m */
    @Nullable
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public IllegalStateException f79571m;

    /* JADX INFO: renamed from: a */
    public final Object f79559a = new Object();

    /* JADX INFO: renamed from: d */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public final lym f79562d = new lym();

    /* JADX INFO: renamed from: e */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public final lym f79563e = new lym();

    /* JADX INFO: renamed from: f */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public final ArrayDeque<MediaCodec.BufferInfo> f79564f = new ArrayDeque<>();

    /* JADX INFO: renamed from: g */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public final ArrayDeque<MediaFormat> f79565g = new ArrayDeque<>();

    public c31(HandlerThread handlerThread) {
        this.f79560b = handlerThread;
    }

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    /* JADX INFO: renamed from: b */
    public final void m107751b(MediaFormat mediaFormat) {
        this.f79563e.m156368a(-2);
        this.f79565g.add(mediaFormat);
    }

    /* JADX INFO: renamed from: c */
    public int m107752c() {
        synchronized (this.f79559a) {
            try {
                m107759j();
                int iM156372e = -1;
                if (m107758i()) {
                    return -1;
                }
                if (!this.f79562d.m156371d()) {
                    iM156372e = this.f79562d.m156372e();
                }
                return iM156372e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public int m107753d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f79559a) {
            try {
                m107759j();
                if (m107758i()) {
                    return -1;
                }
                if (this.f79563e.m156371d()) {
                    return -1;
                }
                int iM156372e = this.f79563e.m156372e();
                if (iM156372e >= 0) {
                    w11.m204373i(this.f79566h);
                    MediaCodec.BufferInfo bufferInfoRemove = this.f79564f.remove();
                    bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
                } else if (iM156372e == -2) {
                    this.f79566h = this.f79565g.remove();
                }
                return iM156372e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m107754e() {
        synchronized (this.f79559a) {
            this.f79569k++;
            ((Handler) bmk0.m105144j(this.f79561c)).post(new Runnable() { // from class: l.b31
                @Override // java.lang.Runnable
                public final void run() {
                    this.f74694a.m107762m();
                }
            });
        }
    }

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    /* JADX INFO: renamed from: f */
    public final void m107755f() {
        if (!this.f79565g.isEmpty()) {
            this.f79567i = this.f79565g.getLast();
        }
        this.f79562d.m156369b();
        this.f79563e.m156369b();
        this.f79564f.clear();
        this.f79565g.clear();
    }

    /* JADX INFO: renamed from: g */
    public MediaFormat m107756g() {
        MediaFormat mediaFormat;
        synchronized (this.f79559a) {
            try {
                mediaFormat = this.f79566h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    /* JADX INFO: renamed from: h */
    public void m107757h(MediaCodec mediaCodec) {
        w11.m204371g(this.f79561c == null);
        this.f79560b.start();
        Handler handler = new Handler(this.f79560b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f79561c = handler;
    }

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    /* JADX INFO: renamed from: i */
    public final boolean m107758i() {
        return this.f79569k > 0 || this.f79570l;
    }

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    /* JADX INFO: renamed from: j */
    public final void m107759j() {
        m107760k();
        m107761l();
    }

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    /* JADX INFO: renamed from: k */
    public final void m107760k() {
        IllegalStateException illegalStateException = this.f79571m;
        if (illegalStateException == null) {
            return;
        }
        this.f79571m = null;
        throw illegalStateException;
    }

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    /* JADX INFO: renamed from: l */
    public final void m107761l() {
        MediaCodec.CodecException codecException = this.f79568j;
        if (codecException == null) {
            return;
        }
        this.f79568j = null;
        throw codecException;
    }

    /* JADX INFO: renamed from: m */
    public final void m107762m() {
        synchronized (this.f79559a) {
            try {
                if (this.f79570l) {
                    return;
                }
                long j = this.f79569k - 1;
                this.f79569k = j;
                if (j > 0) {
                    return;
                }
                if (j < 0) {
                    m107763n(new IllegalStateException());
                } else {
                    m107755f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m107763n(IllegalStateException illegalStateException) {
        synchronized (this.f79559a) {
            this.f79571m = illegalStateException;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m107764o() {
        synchronized (this.f79559a) {
            this.f79570l = true;
            this.f79560b.quit();
            m107755f();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f79559a) {
            this.f79568j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f79559a) {
            this.f79562d.m156368a(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f79559a) {
            try {
                MediaFormat mediaFormat = this.f79567i;
                if (mediaFormat != null) {
                    m107751b(mediaFormat);
                    this.f79567i = null;
                }
                this.f79563e.m156368a(i);
                this.f79564f.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f79559a) {
            m107751b(mediaFormat);
            this.f79567i = null;
        }
    }
}
