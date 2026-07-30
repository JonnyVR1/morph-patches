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
@Deprecated
public final class v21 extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b */
    public final HandlerThread f179327b;

    /* JADX INFO: renamed from: c */
    public Handler f179328c;

    /* JADX INFO: renamed from: h */
    @Nullable
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public MediaFormat f179333h;

    /* JADX INFO: renamed from: i */
    @Nullable
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public MediaFormat f179334i;

    /* JADX INFO: renamed from: j */
    @Nullable
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public MediaCodec.CodecException f179335j;

    /* JADX INFO: renamed from: k */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public long f179336k;

    /* JADX INFO: renamed from: l */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public boolean f179337l;

    /* JADX INFO: renamed from: m */
    @Nullable
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public IllegalStateException f179338m;

    /* JADX INFO: renamed from: a */
    public final Object f179326a = new Object();

    /* JADX INFO: renamed from: d */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public final kwm f179329d = new kwm();

    /* JADX INFO: renamed from: e */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public final kwm f179330e = new kwm();

    /* JADX INFO: renamed from: f */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public final ArrayDeque<MediaCodec.BufferInfo> f179331f = new ArrayDeque<>();

    /* JADX INFO: renamed from: g */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public final ArrayDeque<MediaFormat> f179332g = new ArrayDeque<>();

    public v21(HandlerThread handlerThread) {
        this.f179327b = handlerThread;
    }

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    /* JADX INFO: renamed from: b */
    public final void m196690b(MediaFormat mediaFormat) {
        this.f179330e.m147594a(-2);
        this.f179332g.add(mediaFormat);
    }

    /* JADX INFO: renamed from: c */
    public int m196691c() {
        synchronized (this.f179326a) {
            try {
                m196698j();
                int iM147598e = -1;
                if (m196697i()) {
                    return -1;
                }
                if (!this.f179329d.m147597d()) {
                    iM147598e = this.f179329d.m147598e();
                }
                return iM147598e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public int m196692d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f179326a) {
            try {
                m196698j();
                if (m196697i()) {
                    return -1;
                }
                if (this.f179330e.m147597d()) {
                    return -1;
                }
                int iM147598e = this.f179330e.m147598e();
                if (iM147598e >= 0) {
                    p11.m167015i(this.f179333h);
                    MediaCodec.BufferInfo bufferInfoRemove = this.f179331f.remove();
                    bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
                } else if (iM147598e == -2) {
                    this.f179333h = this.f179332g.remove();
                }
                return iM147598e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m196693e() {
        synchronized (this.f179326a) {
            this.f179336k++;
            ((Handler) vck0.m197866j(this.f179328c)).post(new Runnable() { // from class: l.u21
                @Override // java.lang.Runnable
                public final void run() {
                    this.f173059a.m196701m();
                }
            });
        }
    }

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    /* JADX INFO: renamed from: f */
    public final void m196694f() {
        if (!this.f179332g.isEmpty()) {
            this.f179334i = this.f179332g.getLast();
        }
        this.f179329d.m147595b();
        this.f179330e.m147595b();
        this.f179331f.clear();
        this.f179332g.clear();
    }

    /* JADX INFO: renamed from: g */
    public MediaFormat m196695g() {
        MediaFormat mediaFormat;
        synchronized (this.f179326a) {
            try {
                mediaFormat = this.f179333h;
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
    public void m196696h(MediaCodec mediaCodec) {
        p11.m167013g(this.f179328c == null);
        this.f179327b.start();
        Handler handler = new Handler(this.f179327b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f179328c = handler;
    }

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    /* JADX INFO: renamed from: i */
    public final boolean m196697i() {
        return this.f179336k > 0 || this.f179337l;
    }

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    /* JADX INFO: renamed from: j */
    public final void m196698j() {
        m196699k();
        m196700l();
    }

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    /* JADX INFO: renamed from: k */
    public final void m196699k() {
        IllegalStateException illegalStateException = this.f179338m;
        if (illegalStateException == null) {
            return;
        }
        this.f179338m = null;
        throw illegalStateException;
    }

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    /* JADX INFO: renamed from: l */
    public final void m196700l() {
        MediaCodec.CodecException codecException = this.f179335j;
        if (codecException == null) {
            return;
        }
        this.f179335j = null;
        throw codecException;
    }

    /* JADX INFO: renamed from: m */
    public final void m196701m() {
        synchronized (this.f179326a) {
            try {
                if (this.f179337l) {
                    return;
                }
                long j = this.f179336k - 1;
                this.f179336k = j;
                if (j > 0) {
                    return;
                }
                if (j < 0) {
                    m196702n(new IllegalStateException());
                } else {
                    m196694f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m196702n(IllegalStateException illegalStateException) {
        synchronized (this.f179326a) {
            this.f179338m = illegalStateException;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m196703o() {
        synchronized (this.f179326a) {
            this.f179337l = true;
            this.f179327b.quit();
            m196694f();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f179326a) {
            this.f179335j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f179326a) {
            this.f179329d.m147594a(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f179326a) {
            try {
                MediaFormat mediaFormat = this.f179334i;
                if (mediaFormat != null) {
                    m196690b(mediaFormat);
                    this.f179334i = null;
                }
                this.f179330e.m147594a(i);
                this.f179331f.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f179326a) {
            m196690b(mediaFormat);
            this.f179334i = null;
        }
    }
}
