package p133rx.internal.operators;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import p133rx.C22306c;
import p149l.d30;
import p149l.h4g0;
import p149l.m250;
import p149l.p3g0;
import p149l.z3g0;

/* JADX INFO: loaded from: classes3.dex */
public final class BufferUntilSubscriber<T> extends p3g0<T, T> {

    /* JADX INFO: renamed from: c */
    public static final m250 f207122c = new C22312a();

    /* JADX INFO: renamed from: a */
    public final State<T> f207123a;

    /* JADX INFO: renamed from: b */
    public boolean f207124b;

    public static final class State<T> extends AtomicReference<m250<? super T>> {
        private static final long serialVersionUID = 8026705089538090368L;
        boolean emitting;
        final Object guard = new Object();
        final ConcurrentLinkedQueue<Object> buffer = new ConcurrentLinkedQueue<>();

        /* JADX INFO: renamed from: nl */
        final NotificationLite<T> f207125nl = NotificationLite.m221335f();

        public boolean casObserverRef(m250<? super T> m250Var, m250<? super T> m250Var2) {
            return compareAndSet(m250Var, m250Var2);
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.BufferUntilSubscriber$a */
    public static class C22312a implements m250 {
        @Override // p149l.m250
        public void onCompleted() {
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
        }

        @Override // p149l.m250
        public void onNext(Object obj) {
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.BufferUntilSubscriber$b */
    public static final class C22313b<T> implements C22306c.a<T> {

        /* JADX INFO: renamed from: a */
        public final State<T> f207126a;

        /* JADX INFO: renamed from: rx.internal.operators.BufferUntilSubscriber$b$a */
        public class a implements d30 {
            public a() {
            }

            @Override // p149l.d30
            public void call() {
                C22313b.this.f207126a.set(BufferUntilSubscriber.f207122c);
            }
        }

        public C22313b(State<T> state) {
            this.f207126a = state;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super T> z3g0Var) {
            boolean z;
            if (!this.f207126a.casObserverRef(null, z3g0Var)) {
                z3g0Var.onError(new IllegalStateException("Only one subscriber allowed!"));
                return;
            }
            z3g0Var.m217046b(h4g0.m129240a(new a()));
            synchronized (this.f207126a.guard) {
                try {
                    State<T> state = this.f207126a;
                    if (state.emitting) {
                        z = false;
                    } else {
                        z = true;
                        state.emitting = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z) {
                return;
            }
            NotificationLite notificationLiteM221335f = NotificationLite.m221335f();
            while (true) {
                Object objPoll = this.f207126a.buffer.poll();
                State<T> state2 = this.f207126a;
                if (objPoll != null) {
                    notificationLiteM221335f.m221336a(state2.get(), objPoll);
                } else {
                    synchronized (state2.guard) {
                        try {
                            if (this.f207126a.buffer.isEmpty()) {
                                this.f207126a.emitting = false;
                                return;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }
    }

    public BufferUntilSubscriber(State<T> state) {
        super(new C22313b(state));
        this.f207123a = state;
    }

    /* JADX INFO: renamed from: b */
    public static <T> BufferUntilSubscriber<T> m221326b() {
        return new BufferUntilSubscriber<>(new State());
    }

    /* JADX INFO: renamed from: c */
    public final void m221327c(Object obj) {
        synchronized (this.f207123a.guard) {
            try {
                this.f207123a.buffer.add(obj);
                if (this.f207123a.get() != null) {
                    State<T> state = this.f207123a;
                    if (!state.emitting) {
                        this.f207124b = true;
                        state.emitting = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!this.f207124b) {
            return;
        }
        while (true) {
            Object objPoll = this.f207123a.buffer.poll();
            if (objPoll == null) {
                return;
            }
            State<T> state2 = this.f207123a;
            state2.f207125nl.m221336a(state2.get(), objPoll);
        }
    }

    @Override // p149l.m250
    public void onCompleted() {
        boolean z = this.f207124b;
        State<T> state = this.f207123a;
        if (z) {
            state.get().onCompleted();
        } else {
            m221327c(state.f207125nl.m221337b());
        }
    }

    @Override // p149l.m250
    public void onError(Throwable th) {
        boolean z = this.f207124b;
        State<T> state = this.f207123a;
        if (z) {
            state.get().onError(th);
        } else {
            m221327c(state.f207125nl.m221338c(th));
        }
    }

    @Override // p149l.m250
    public void onNext(T t) {
        boolean z = this.f207124b;
        State<T> state = this.f207123a;
        if (z) {
            state.get().onNext(t);
        } else {
            m221327c(state.f207125nl.m221344j(t));
        }
    }
}
