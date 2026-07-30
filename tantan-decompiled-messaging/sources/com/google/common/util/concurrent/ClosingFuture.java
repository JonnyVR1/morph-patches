package com.google.common.util.concurrent;

import com.google.common.base.C2654a;
import java.io.Closeable;
import java.io.IOException;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import p149l.f31;
import p149l.gnr;
import p149l.qkq0;
import p149l.sf80;
import p149l.shg0;

/* JADX INFO: loaded from: classes7.dex */
public final class ClosingFuture<V> {

    /* JADX INFO: renamed from: d */
    public static final Logger f11353d = Logger.getLogger(ClosingFuture.class.getName());

    /* JADX INFO: renamed from: a */
    public final AtomicReference<State> f11354a;

    /* JADX INFO: renamed from: b */
    public final CloseableList f11355b;

    /* JADX INFO: renamed from: c */
    public final AbstractC3079d<V> f11356c;

    public enum State {
        OPEN,
        SUBSUMED,
        WILL_CLOSE,
        CLOSING,
        CLOSED,
        WILL_CREATE_VALUE_AND_CLOSER
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$a */
    public class RunnableC3059a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Closeable f11357a;

        public RunnableC3059a(Closeable closeable) {
            this.f11357a = closeable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f11357a.close();
            } catch (IOException | RuntimeException e) {
                ClosingFuture.f11353d.log(Level.WARNING, "thrown by close()", e);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$b */
    public static /* synthetic */ class C3060b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11358a;

        static {
            int[] iArr = new int[State.values().length];
            f11358a = iArr;
            try {
                iArr[State.SUBSUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11358a[State.WILL_CREATE_VALUE_AND_CLOSER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11358a[State.WILL_CLOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11358a[State.CLOSING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11358a[State.CLOSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11358a[State.OPEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$c */
    public class RunnableC3061c implements Runnable {
        public RunnableC3061c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ClosingFuture closingFuture = ClosingFuture.this;
            State state = State.WILL_CLOSE;
            State state2 = State.CLOSING;
            closingFuture.m16631h(state, state2);
            ClosingFuture.this.m16632i();
            ClosingFuture.this.m16631h(state2, State.CLOSED);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$d */
    public interface InterfaceC3062d<T, U> {
        /* JADX INFO: renamed from: a */
        ClosingFuture<U> m16635a(C3064f c3064f, T t) throws Exception;
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$e */
    public interface InterfaceC3063e<T, U> {
        /* JADX INFO: renamed from: a */
        U m16636a(C3064f c3064f, T t) throws Exception;
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$f */
    public static final class C3064f {

        /* JADX INFO: renamed from: a */
        public final CloseableList f11360a;

        public C3064f(CloseableList closeableList) {
            this.f11360a = closeableList;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m16629j(Closeable closeable, Executor executor) {
        if (closeable == null) {
            return;
        }
        try {
            executor.execute(new RunnableC3059a(closeable));
        } catch (RejectedExecutionException e) {
            Logger logger = f11353d;
            Level level = Level.WARNING;
            if (logger.isLoggable(level)) {
                logger.log(level, String.format("while submitting close to %s; will close inline", executor), (Throwable) e);
            }
            m16629j(closeable, C3082g.m16659a());
        }
    }

    public void finalize() {
        if (this.f11354a.get().equals(State.OPEN)) {
            f11353d.log(Level.SEVERE, "Uh oh! An open ClosingFuture has leaked and will close: {0}", this);
            m16634l();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m16630g(CloseableList closeableList) {
        m16631h(State.OPEN, State.SUBSUMED);
        closeableList.add(this.f11355b, C3082g.m16659a());
    }

    /* JADX INFO: renamed from: h */
    public final void m16631h(State state, State state2) {
        sf80.m183878A(m16633k(state, state2), "Expected state to be %s, but it was %s", state, state2);
    }

    /* JADX INFO: renamed from: i */
    public final void m16632i() {
        f11353d.log(Level.FINER, "closing {0}", this);
        this.f11355b.close();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m16633k(State state, State state2) {
        return f31.m119248a(this.f11354a, state, state2);
    }

    /* JADX INFO: renamed from: l */
    public AbstractC3079d<V> m16634l() {
        if (!m16633k(State.OPEN, State.WILL_CLOSE)) {
            switch (C3060b.f11358a[this.f11354a.get().ordinal()]) {
                case 1:
                    qkq0.m175383a("Cannot call finishToFuture() after deriving another step");
                    return null;
                case 2:
                    qkq0.m175383a("Cannot call finishToFuture() after calling finishToValueAndCloser()");
                    return null;
                case 3:
                case 4:
                case 5:
                    qkq0.m175383a("Cannot call finishToFuture() twice");
                    return null;
                case 6:
                    shg0.m184191a();
                    return null;
            }
        }
        f11353d.log(Level.FINER, "will close {0}", this);
        this.f11356c.addListener(new RunnableC3061c(), C3082g.m16659a());
        return this.f11356c;
    }

    public String toString() {
        return C2654a.m15427b(this).m15432d("state", this.f11354a.get()).m15438j(this.f11356c).toString();
    }

    public static final class CloseableList extends IdentityHashMap<Closeable, Executor> implements Closeable {
        private volatile boolean closed;
        private final C3064f closer;
        private volatile CountDownLatch whenClosed;

        private CloseableList() {
            this.closer = new C3064f(this);
        }

        public void add(Closeable closeable, Executor executor) {
            sf80.m183894p(executor);
            if (closeable == null) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.closed) {
                        ClosingFuture.m16629j(closeable, executor);
                    } else {
                        put(closeable, executor);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public <V, U> AbstractC3079d<U> applyAsyncClosingFunction(InterfaceC3062d<V, U> interfaceC3062d, V v2) throws Exception {
            CloseableList closeableList = new CloseableList();
            try {
                ClosingFuture<U> closingFutureM16635a = interfaceC3062d.m16635a(closeableList.closer, v2);
                closingFutureM16635a.m16630g(closeableList);
                return closingFutureM16635a.f11356c;
            } finally {
                add(closeableList, C3082g.m16659a());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <V, U> gnr<U> applyClosingFunction(InterfaceC3063e<? super V, U> interfaceC3063e, V v2) throws Exception {
            CloseableList closeableList = new CloseableList();
            try {
                return C3080e.m16657d(interfaceC3063e.m16636a(closeableList.closer, v2));
            } finally {
                add(closeableList, C3082g.m16659a());
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.closed) {
                        return;
                    }
                    this.closed = true;
                    for (Map.Entry<Closeable, Executor> entry : entrySet()) {
                        ClosingFuture.m16629j(entry.getKey(), entry.getValue());
                    }
                    clear();
                    if (this.whenClosed != null) {
                        this.whenClosed.countDown();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public CountDownLatch whenClosedCountDown() {
            if (this.closed) {
                return new CountDownLatch(0);
            }
            synchronized (this) {
                try {
                    if (this.closed) {
                        return new CountDownLatch(0);
                    }
                    sf80.m183900v(this.whenClosed == null);
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    this.whenClosed = countDownLatch;
                    return countDownLatch;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public /* synthetic */ CloseableList(C3078c c3078c) {
            this();
        }
    }
}
