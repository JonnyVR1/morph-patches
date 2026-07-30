package com.google.android.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import p153l.bmk0;
import p153l.kyv;
import p153l.nej0;
import p153l.vtv;
import p153l.w11;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class Loader implements vtv {

    /* JADX INFO: renamed from: d */
    public static final C2065c f9493d = m12138h(false, -9223372036854775807L);

    /* JADX INFO: renamed from: e */
    public static final C2065c f9494e = m12138h(true, -9223372036854775807L);

    /* JADX INFO: renamed from: f */
    public static final C2065c f9495f;

    /* JADX INFO: renamed from: g */
    public static final C2065c f9496g;

    /* JADX INFO: renamed from: a */
    public final ExecutorService f9497a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public HandlerC2066d<? extends InterfaceC2067e> f9498b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public IOException f9499c;

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.Loader$b */
    public interface InterfaceC2064b<T extends InterfaceC2067e> {
        /* JADX INFO: renamed from: n */
        void mo11078n(T t, long j, long j2, boolean z);

        /* JADX INFO: renamed from: o */
        void mo11079o(T t, long j, long j2);

        /* JADX INFO: renamed from: q */
        C2065c mo11080q(T t, long j, long j2, IOException iOException, int i);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.Loader$c */
    public static final class C2065c {

        /* JADX INFO: renamed from: a */
        public final int f9500a;

        /* JADX INFO: renamed from: b */
        public final long f9501b;

        public C2065c(int i, long j) {
            this.f9500a = i;
            this.f9501b = j;
        }

        /* JADX INFO: renamed from: c */
        public boolean m12149c() {
            int i = this.f9500a;
            return i == 0 || i == 1;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.Loader$d */
    @SuppressLint({"HandlerLeak"})
    public final class HandlerC2066d<T extends InterfaceC2067e> extends Handler implements Runnable {

        /* JADX INFO: renamed from: a */
        public final int f9502a;

        /* JADX INFO: renamed from: b */
        public final T f9503b;

        /* JADX INFO: renamed from: c */
        public final long f9504c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public InterfaceC2064b<T> f9505d;

        /* JADX INFO: renamed from: e */
        @Nullable
        public IOException f9506e;

        /* JADX INFO: renamed from: f */
        public int f9507f;

        /* JADX INFO: renamed from: g */
        @Nullable
        public Thread f9508g;

        /* JADX INFO: renamed from: h */
        public boolean f9509h;

        /* JADX INFO: renamed from: i */
        public volatile boolean f9510i;

        public HandlerC2066d(Looper looper, T t, InterfaceC2064b<T> interfaceC2064b, int i, long j) {
            super(looper);
            this.f9503b = t;
            this.f9505d = interfaceC2064b;
            this.f9502a = i;
            this.f9504c = j;
        }

        /* JADX INFO: renamed from: a */
        public void m12150a(boolean z) {
            this.f9510i = z;
            this.f9506e = null;
            if (hasMessages(0)) {
                this.f9509h = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f9509h = true;
                        this.f9503b.mo11432c();
                        Thread thread = this.f9508g;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z) {
                m12152c();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((InterfaceC2064b) w11.m204369e(this.f9505d)).mo11078n(this.f9503b, jElapsedRealtime, jElapsedRealtime - this.f9504c, true);
                this.f9505d = null;
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m12151b() {
            this.f9506e = null;
            Loader.this.f9497a.execute((Runnable) w11.m204369e(Loader.this.f9498b));
        }

        /* JADX INFO: renamed from: c */
        public final void m12152c() {
            Loader.this.f9498b = null;
        }

        /* JADX INFO: renamed from: d */
        public final long m12153d() {
            return Math.min((this.f9507f - 1) * 1000, 5000);
        }

        /* JADX INFO: renamed from: e */
        public void m12154e(int i) throws IOException {
            IOException iOException = this.f9506e;
            if (iOException != null && this.f9507f > i) {
                throw iOException;
            }
        }

        /* JADX INFO: renamed from: f */
        public void m12155f(long j) {
            w11.m204371g(Loader.this.f9498b == null);
            Loader.this.f9498b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                m12151b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f9510i) {
                return;
            }
            int i = message.what;
            if (i == 0) {
                m12151b();
                return;
            }
            if (i == 3) {
                throw ((Error) message.obj);
            }
            m12152c();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.f9504c;
            InterfaceC2064b interfaceC2064b = (InterfaceC2064b) w11.m204369e(this.f9505d);
            if (this.f9509h) {
                interfaceC2064b.mo11078n(this.f9503b, jElapsedRealtime, j, false);
                return;
            }
            int i2 = message.what;
            if (i2 == 1) {
                try {
                    interfaceC2064b.mo11079o(this.f9503b, jElapsedRealtime, j);
                    return;
                } catch (RuntimeException e) {
                    kyv.m152146d("LoadTask", "Unexpected exception handling load completed", e);
                    Loader.this.f9499c = new UnexpectedLoaderException(e);
                    return;
                }
            }
            if (i2 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f9506e = iOException;
            int i3 = this.f9507f + 1;
            this.f9507f = i3;
            C2065c c2065cMo11080q = interfaceC2064b.mo11080q(this.f9503b, jElapsedRealtime, j, iOException, i3);
            if (c2065cMo11080q.f9500a == 3) {
                Loader.this.f9499c = this.f9506e;
            } else if (c2065cMo11080q.f9500a != 2) {
                if (c2065cMo11080q.f9500a == 1) {
                    this.f9507f = 1;
                }
                m12155f(c2065cMo11080q.f9501b != -9223372036854775807L ? c2065cMo11080q.f9501b : m12153d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = this.f9509h;
                    this.f9508g = Thread.currentThread();
                }
                if (!z) {
                    nej0.m162903a("load:".concat(this.f9503b.getClass().getSimpleName()));
                    try {
                        this.f9503b.mo11431a();
                        nej0.m162905c();
                    } catch (Throwable th) {
                        nej0.m162905c();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f9508g = null;
                    Thread.interrupted();
                }
                if (this.f9510i) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e) {
                if (this.f9510i) {
                    return;
                }
                obtainMessage(2, e).sendToTarget();
            } catch (Exception e2) {
                if (this.f9510i) {
                    return;
                }
                kyv.m152146d("LoadTask", "Unexpected exception loading stream", e2);
                obtainMessage(2, new UnexpectedLoaderException(e2)).sendToTarget();
            } catch (OutOfMemoryError e3) {
                if (this.f9510i) {
                    return;
                }
                kyv.m152146d("LoadTask", "OutOfMemory error loading stream", e3);
                obtainMessage(2, new UnexpectedLoaderException(e3)).sendToTarget();
            } catch (Error e4) {
                if (!this.f9510i) {
                    kyv.m152146d("LoadTask", "Unexpected error loading stream", e4);
                    obtainMessage(3, e4).sendToTarget();
                }
                throw e4;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.Loader$e */
    public interface InterfaceC2067e {
        /* JADX INFO: renamed from: a */
        void mo11431a() throws IOException;

        /* JADX INFO: renamed from: c */
        void mo11432c();
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.Loader$f */
    public interface InterfaceC2068f {
        /* JADX INFO: renamed from: j */
        void mo11423j();
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.Loader$g */
    public static final class RunnableC2069g implements Runnable {

        /* JADX INFO: renamed from: a */
        public final InterfaceC2068f f9512a;

        public RunnableC2069g(InterfaceC2068f interfaceC2068f) {
            this.f9512a = interfaceC2068f;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9512a.mo11423j();
        }
    }

    static {
        long j = -9223372036854775807L;
        f9495f = new C2065c(2, j);
        f9496g = new C2065c(3, j);
    }

    public Loader(String str) {
        this.f9497a = bmk0.m105086K0("ExoPlayer:Loader:" + str);
    }

    /* JADX INFO: renamed from: h */
    public static C2065c m12138h(boolean z, long j) {
        return new C2065c(z ? 1 : 0, j);
    }

    @Override // p153l.vtv
    /* JADX INFO: renamed from: a */
    public void mo11081a() throws IOException {
        m12143k(Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: f */
    public void m12139f() {
        ((HandlerC2066d) w11.m204373i(this.f9498b)).m12150a(false);
    }

    /* JADX INFO: renamed from: g */
    public void m12140g() {
        this.f9499c = null;
    }

    /* JADX INFO: renamed from: i */
    public boolean m12141i() {
        return this.f9499c != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m12142j() {
        return this.f9498b != null;
    }

    /* JADX INFO: renamed from: k */
    public void m12143k(int i) throws IOException {
        IOException iOException = this.f9499c;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC2066d<? extends InterfaceC2067e> handlerC2066d = this.f9498b;
        if (handlerC2066d != null) {
            if (i == Integer.MIN_VALUE) {
                i = handlerC2066d.f9502a;
            }
            handlerC2066d.m12154e(i);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m12144l() {
        m12145m(null);
    }

    /* JADX INFO: renamed from: m */
    public void m12145m(@Nullable InterfaceC2068f interfaceC2068f) {
        HandlerC2066d<? extends InterfaceC2067e> handlerC2066d = this.f9498b;
        if (handlerC2066d != null) {
            handlerC2066d.m12150a(true);
        }
        if (interfaceC2068f != null) {
            this.f9497a.execute(new RunnableC2069g(interfaceC2068f));
        }
        this.f9497a.shutdown();
    }

    /* JADX INFO: renamed from: n */
    public <T extends InterfaceC2067e> long m12146n(T t, InterfaceC2064b<T> interfaceC2064b, int i) {
        Looper looper = (Looper) w11.m204373i(Looper.myLooper());
        this.f9499c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC2066d(looper, t, interfaceC2064b, i, jElapsedRealtime).m12155f(0L);
        return jElapsedRealtime;
    }
}
