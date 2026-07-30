package com.google.android.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import p149l.j5j0;
import p149l.jwv;
import p149l.p11;
import p149l.urv;
import p149l.vck0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class Loader implements urv {

    /* JADX INFO: renamed from: d */
    public static final C2042c f9456d = m12084h(false, -9223372036854775807L);

    /* JADX INFO: renamed from: e */
    public static final C2042c f9457e = m12084h(true, -9223372036854775807L);

    /* JADX INFO: renamed from: f */
    public static final C2042c f9458f;

    /* JADX INFO: renamed from: g */
    public static final C2042c f9459g;

    /* JADX INFO: renamed from: a */
    public final ExecutorService f9460a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public HandlerC2043d<? extends InterfaceC2044e> f9461b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public IOException f9462c;

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.Loader$b */
    public interface InterfaceC2041b<T extends InterfaceC2044e> {
        /* JADX INFO: renamed from: n */
        void mo11024n(T t, long j, long j2, boolean z);

        /* JADX INFO: renamed from: o */
        void mo11025o(T t, long j, long j2);

        /* JADX INFO: renamed from: q */
        C2042c mo11026q(T t, long j, long j2, IOException iOException, int i);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.Loader$c */
    public static final class C2042c {

        /* JADX INFO: renamed from: a */
        public final int f9463a;

        /* JADX INFO: renamed from: b */
        public final long f9464b;

        public C2042c(int i, long j) {
            this.f9463a = i;
            this.f9464b = j;
        }

        /* JADX INFO: renamed from: c */
        public boolean m12095c() {
            int i = this.f9463a;
            return i == 0 || i == 1;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.Loader$d */
    @SuppressLint({"HandlerLeak"})
    public final class HandlerC2043d<T extends InterfaceC2044e> extends Handler implements Runnable {

        /* JADX INFO: renamed from: a */
        public final int f9465a;

        /* JADX INFO: renamed from: b */
        public final T f9466b;

        /* JADX INFO: renamed from: c */
        public final long f9467c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public InterfaceC2041b<T> f9468d;

        /* JADX INFO: renamed from: e */
        @Nullable
        public IOException f9469e;

        /* JADX INFO: renamed from: f */
        public int f9470f;

        /* JADX INFO: renamed from: g */
        @Nullable
        public Thread f9471g;

        /* JADX INFO: renamed from: h */
        public boolean f9472h;

        /* JADX INFO: renamed from: i */
        public volatile boolean f9473i;

        public HandlerC2043d(Looper looper, T t, InterfaceC2041b<T> interfaceC2041b, int i, long j) {
            super(looper);
            this.f9466b = t;
            this.f9468d = interfaceC2041b;
            this.f9465a = i;
            this.f9467c = j;
        }

        /* JADX INFO: renamed from: a */
        public void m12096a(boolean z) {
            this.f9473i = z;
            this.f9469e = null;
            if (hasMessages(0)) {
                this.f9472h = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f9472h = true;
                        this.f9466b.mo11378c();
                        Thread thread = this.f9471g;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z) {
                m12098c();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((InterfaceC2041b) p11.m167011e(this.f9468d)).mo11024n(this.f9466b, jElapsedRealtime, jElapsedRealtime - this.f9467c, true);
                this.f9468d = null;
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m12097b() {
            this.f9469e = null;
            Loader.this.f9460a.execute((Runnable) p11.m167011e(Loader.this.f9461b));
        }

        /* JADX INFO: renamed from: c */
        public final void m12098c() {
            Loader.this.f9461b = null;
        }

        /* JADX INFO: renamed from: d */
        public final long m12099d() {
            return Math.min((this.f9470f - 1) * 1000, 5000);
        }

        /* JADX INFO: renamed from: e */
        public void m12100e(int i) throws IOException {
            IOException iOException = this.f9469e;
            if (iOException != null && this.f9470f > i) {
                throw iOException;
            }
        }

        /* JADX INFO: renamed from: f */
        public void m12101f(long j) {
            p11.m167013g(Loader.this.f9461b == null);
            Loader.this.f9461b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                m12097b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f9473i) {
                return;
            }
            int i = message.what;
            if (i == 0) {
                m12097b();
                return;
            }
            if (i == 3) {
                throw ((Error) message.obj);
            }
            m12098c();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.f9467c;
            InterfaceC2041b interfaceC2041b = (InterfaceC2041b) p11.m167011e(this.f9468d);
            if (this.f9472h) {
                interfaceC2041b.mo11024n(this.f9466b, jElapsedRealtime, j, false);
                return;
            }
            int i2 = message.what;
            if (i2 == 1) {
                try {
                    interfaceC2041b.mo11025o(this.f9466b, jElapsedRealtime, j);
                    return;
                } catch (RuntimeException e) {
                    jwv.m143684d("LoadTask", "Unexpected exception handling load completed", e);
                    Loader.this.f9462c = new UnexpectedLoaderException(e);
                    return;
                }
            }
            if (i2 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f9469e = iOException;
            int i3 = this.f9470f + 1;
            this.f9470f = i3;
            C2042c c2042cMo11026q = interfaceC2041b.mo11026q(this.f9466b, jElapsedRealtime, j, iOException, i3);
            if (c2042cMo11026q.f9463a == 3) {
                Loader.this.f9462c = this.f9469e;
            } else if (c2042cMo11026q.f9463a != 2) {
                if (c2042cMo11026q.f9463a == 1) {
                    this.f9470f = 1;
                }
                m12101f(c2042cMo11026q.f9464b != -9223372036854775807L ? c2042cMo11026q.f9464b : m12099d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = this.f9472h;
                    this.f9471g = Thread.currentThread();
                }
                if (!z) {
                    j5j0.m139865a("load:".concat(this.f9466b.getClass().getSimpleName()));
                    try {
                        this.f9466b.mo11377a();
                        j5j0.m139867c();
                    } catch (Throwable th) {
                        j5j0.m139867c();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f9471g = null;
                    Thread.interrupted();
                }
                if (this.f9473i) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e) {
                if (this.f9473i) {
                    return;
                }
                obtainMessage(2, e).sendToTarget();
            } catch (Exception e2) {
                if (this.f9473i) {
                    return;
                }
                jwv.m143684d("LoadTask", "Unexpected exception loading stream", e2);
                obtainMessage(2, new UnexpectedLoaderException(e2)).sendToTarget();
            } catch (OutOfMemoryError e3) {
                if (this.f9473i) {
                    return;
                }
                jwv.m143684d("LoadTask", "OutOfMemory error loading stream", e3);
                obtainMessage(2, new UnexpectedLoaderException(e3)).sendToTarget();
            } catch (Error e4) {
                if (!this.f9473i) {
                    jwv.m143684d("LoadTask", "Unexpected error loading stream", e4);
                    obtainMessage(3, e4).sendToTarget();
                }
                throw e4;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.Loader$e */
    public interface InterfaceC2044e {
        /* JADX INFO: renamed from: a */
        void mo11377a() throws IOException;

        /* JADX INFO: renamed from: c */
        void mo11378c();
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.Loader$f */
    public interface InterfaceC2045f {
        /* JADX INFO: renamed from: j */
        void mo11369j();
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.Loader$g */
    public static final class RunnableC2046g implements Runnable {

        /* JADX INFO: renamed from: a */
        public final InterfaceC2045f f9475a;

        public RunnableC2046g(InterfaceC2045f interfaceC2045f) {
            this.f9475a = interfaceC2045f;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9475a.mo11369j();
        }
    }

    static {
        long j = -9223372036854775807L;
        f9458f = new C2042c(2, j);
        f9459g = new C2042c(3, j);
    }

    public Loader(String str) {
        this.f9460a = vck0.m197808K0("ExoPlayer:Loader:" + str);
    }

    /* JADX INFO: renamed from: h */
    public static C2042c m12084h(boolean z, long j) {
        return new C2042c(z ? 1 : 0, j);
    }

    @Override // p149l.urv
    /* JADX INFO: renamed from: a */
    public void mo11027a() throws IOException {
        m12089k(Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: f */
    public void m12085f() {
        ((HandlerC2043d) p11.m167015i(this.f9461b)).m12096a(false);
    }

    /* JADX INFO: renamed from: g */
    public void m12086g() {
        this.f9462c = null;
    }

    /* JADX INFO: renamed from: i */
    public boolean m12087i() {
        return this.f9462c != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m12088j() {
        return this.f9461b != null;
    }

    /* JADX INFO: renamed from: k */
    public void m12089k(int i) throws IOException {
        IOException iOException = this.f9462c;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC2043d<? extends InterfaceC2044e> handlerC2043d = this.f9461b;
        if (handlerC2043d != null) {
            if (i == Integer.MIN_VALUE) {
                i = handlerC2043d.f9465a;
            }
            handlerC2043d.m12100e(i);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m12090l() {
        m12091m(null);
    }

    /* JADX INFO: renamed from: m */
    public void m12091m(@Nullable InterfaceC2045f interfaceC2045f) {
        HandlerC2043d<? extends InterfaceC2044e> handlerC2043d = this.f9461b;
        if (handlerC2043d != null) {
            handlerC2043d.m12096a(true);
        }
        if (interfaceC2045f != null) {
            this.f9460a.execute(new RunnableC2046g(interfaceC2045f));
        }
        this.f9460a.shutdown();
    }

    /* JADX INFO: renamed from: n */
    public <T extends InterfaceC2044e> long m12092n(T t, InterfaceC2041b<T> interfaceC2041b, int i) {
        Looper looper = (Looper) p11.m167015i(Looper.myLooper());
        this.f9462c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC2043d(looper, t, interfaceC2041b, i, jElapsedRealtime).m12101f(0L);
        return jElapsedRealtime;
    }
}
