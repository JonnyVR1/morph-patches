package com.google.common.util.concurrent;

import com.google.common.base.C2677a;
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
import p153l.aqg0;
import p153l.hpr;
import p153l.m31;
import p153l.wtq0;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public final class ClosingFuture<V> {

    /* JADX INFO: renamed from: d */
    public static final Logger f11390d = Logger.getLogger(ClosingFuture.class.getName());

    /* JADX INFO: renamed from: a */
    public final AtomicReference<State> f11391a;

    /* JADX INFO: renamed from: b */
    public final CloseableList f11392b;

    /* JADX INFO: renamed from: c */
    public final AbstractC3102d<V> f11393c;

    public enum State {
        OPEN,
        SUBSUMED,
        WILL_CLOSE,
        CLOSING,
        CLOSED,
        WILL_CREATE_VALUE_AND_CLOSER
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$a */
    public class RunnableC3082a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Closeable f11394a;

        public RunnableC3082a(Closeable closeable) {
            this.f11394a = closeable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f11394a.close();
            } catch (IOException | RuntimeException e) {
                ClosingFuture.f11390d.log(Level.WARNING, "thrown by close()", e);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$b */
    public static /* synthetic */ class C3083b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11395a;

        static {
            int[] iArr = new int[State.values().length];
            f11395a = iArr;
            try {
                iArr[State.SUBSUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11395a[State.WILL_CREATE_VALUE_AND_CLOSER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11395a[State.WILL_CLOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11395a[State.CLOSING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11395a[State.CLOSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11395a[State.OPEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$c */
    public class RunnableC3084c implements Runnable {
        public RunnableC3084c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ClosingFuture closingFuture = ClosingFuture.this;
            State state = State.WILL_CLOSE;
            State state2 = State.CLOSING;
            closingFuture.m16686h(state, state2);
            ClosingFuture.this.m16687i();
            ClosingFuture.this.m16686h(state2, State.CLOSED);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$d */
    public interface InterfaceC3085d<T, U> {
        /* JADX INFO: renamed from: a */
        ClosingFuture<U> m16690a(C3087f c3087f, T t) throws Exception;
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$e */
    public interface InterfaceC3086e<T, U> {
        /* JADX INFO: renamed from: a */
        U m16691a(C3087f c3087f, T t) throws Exception;
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$f */
    public static final class C3087f {

        /* JADX INFO: renamed from: a */
        public final CloseableList f11397a;

        public C3087f(CloseableList closeableList) {
            this.f11397a = closeableList;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m16684j(Closeable closeable, Executor executor) {
        if (closeable == null) {
            return;
        }
        try {
            executor.execute(new RunnableC3082a(closeable));
        } catch (RejectedExecutionException e) {
            Logger logger = f11390d;
            Level level = Level.WARNING;
            if (logger.isLoggable(level)) {
                logger.log(level, String.format("while submitting close to %s; will close inline", executor), (Throwable) e);
            }
            m16684j(closeable, C3105g.m16714a());
        }
    }

    public void finalize() {
        if (this.f11391a.get().equals(State.OPEN)) {
            f11390d.log(Level.SEVERE, "Uh oh! An open ClosingFuture has leaked and will close: {0}", this);
            m16689l();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m16685g(CloseableList closeableList) {
        m16686h(State.OPEN, State.SUBSUMED);
        closeableList.add(this.f11392b, C3105g.m16714a());
    }

    /* JADX INFO: renamed from: h */
    public final void m16686h(State state, State state2) {
        xn80.m212095A(m16688k(state, state2), "Expected state to be %s, but it was %s", state, state2);
    }

    /* JADX INFO: renamed from: i */
    public final void m16687i() {
        f11390d.log(Level.FINER, "closing {0}", this);
        this.f11392b.close();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m16688k(State state, State state2) {
        return m31.m156916a(this.f11391a, state, state2);
    }

    /* JADX INFO: renamed from: l */
    public AbstractC3102d<V> m16689l() {
        if (!m16688k(State.OPEN, State.WILL_CLOSE)) {
            switch (C3083b.f11395a[this.f11391a.get().ordinal()]) {
                case 1:
                    wtq0.m207906a("Cannot call finishToFuture() after deriving another step");
                    return null;
                case 2:
                    wtq0.m207906a("Cannot call finishToFuture() after calling finishToValueAndCloser()");
                    return null;
                case 3:
                case 4:
                case 5:
                    wtq0.m207906a("Cannot call finishToFuture() twice");
                    return null;
                case 6:
                    aqg0.m99478a();
                    return null;
            }
        }
        f11390d.log(Level.FINER, "will close {0}", this);
        this.f11393c.addListener(new RunnableC3084c(), C3105g.m16714a());
        return this.f11393c;
    }

    public String toString() {
        return C2677a.m15481b(this).m15486d("state", this.f11391a.get()).m15492j(this.f11393c).toString();
    }

    public static final class CloseableList extends IdentityHashMap<Closeable, Executor> implements Closeable {
        private volatile boolean closed;
        private final C3087f closer;
        private volatile CountDownLatch whenClosed;

        private CloseableList() {
            this.closer = new C3087f(this);
        }

        public void add(Closeable closeable, Executor executor) {
            xn80.m212111p(executor);
            if (closeable == null) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.closed) {
                        ClosingFuture.m16684j(closeable, executor);
                    } else {
                        put(closeable, executor);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public <V, U> AbstractC3102d<U> applyAsyncClosingFunction(InterfaceC3085d<V, U> interfaceC3085d, V v2) throws Exception {
            CloseableList closeableList = new CloseableList();
            try {
                ClosingFuture<U> closingFutureM16690a = interfaceC3085d.m16690a(closeableList.closer, v2);
                closingFutureM16690a.m16685g(closeableList);
                return closingFutureM16690a.f11393c;
            } finally {
                add(closeableList, C3105g.m16714a());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <V, U> hpr<U> applyClosingFunction(InterfaceC3086e<? super V, U> interfaceC3086e, V v2) throws Exception {
            CloseableList closeableList = new CloseableList();
            try {
                return C3103e.m16712d(interfaceC3086e.m16691a(closeableList.closer, v2));
            } finally {
                add(closeableList, C3105g.m16714a());
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
                        ClosingFuture.m16684j(entry.getKey(), entry.getValue());
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
                    xn80.m212117v(this.whenClosed == null);
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    this.whenClosed = countDownLatch;
                    return countDownLatch;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public /* synthetic */ CloseableList(C3101c c3101c) {
            this();
        }
    }
}
