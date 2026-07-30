package p014rx.internal.operators;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import p003l.d30;
import p003l.h4g0;
import p003l.m250;
import p003l.p3g0;
import p003l.z3g0;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class BufferUntilSubscriber<T> extends p3g0<T, T> {

    /* JADX INFO: renamed from: c */
    public static final m250 f10747c = new C1105a();

    /* JADX INFO: renamed from: a */
    public final State<T> f10748a;

    /* JADX INFO: renamed from: b */
    public boolean f10749b;

    public static final class State<T> extends AtomicReference<m250<? super T>> {
        private static final long serialVersionUID = 8026705089538090368L;
        boolean emitting;
        final Object guard = new Object();
        final ConcurrentLinkedQueue<Object> buffer = new ConcurrentLinkedQueue<>();

        /* JADX INFO: renamed from: nl */
        final NotificationLite<T> f10750nl = NotificationLite.m9792f();

        public boolean casObserverRef(m250<? super T> m250Var, m250<? super T> m250Var2) {
            return compareAndSet(m250Var, m250Var2);
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.BufferUntilSubscriber$a */
    public static class C1105a implements m250 {
        @Override // p003l.m250
        public void onCompleted() {
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
        }

        @Override // p003l.m250
        public void onNext(Object obj) {
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.BufferUntilSubscriber$b */
    public static final class C1106b<T> implements C1099c.a<T> {

        /* JADX INFO: renamed from: a */
        public final State<T> f10751a;

        /* JADX INFO: renamed from: rx.internal.operators.BufferUntilSubscriber$b$a */
        public class a implements d30 {
            public a() {
            }

            @Override // p003l.d30
            public void call() {
                C1106b.this.f10751a.set(BufferUntilSubscriber.f10747c);
            }
        }

        public C1106b(State<T> state) {
            this.f10751a = state;
        }

        @Override // p003l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super T> z3g0Var) {
            boolean z;
            if (!this.f10751a.casObserverRef(null, z3g0Var)) {
                z3g0Var.onError(new IllegalStateException("Only one subscriber allowed!"));
                return;
            }
            z3g0Var.m9240b(h4g0.m4914a(new a()));
            synchronized (this.f10751a.guard) {
                try {
                    State<T> state = this.f10751a;
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
            NotificationLite notificationLiteM9792f = NotificationLite.m9792f();
            while (true) {
                Object objPoll = this.f10751a.buffer.poll();
                State<T> state2 = this.f10751a;
                if (objPoll != null) {
                    notificationLiteM9792f.m9793a(state2.get(), objPoll);
                } else {
                    synchronized (state2.guard) {
                        try {
                            if (this.f10751a.buffer.isEmpty()) {
                                this.f10751a.emitting = false;
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
        super(new C1106b(state));
        this.f10748a = state;
    }

    /* JADX INFO: renamed from: b */
    public static <T> BufferUntilSubscriber<T> m9783b() {
        return new BufferUntilSubscriber<>(new State());
    }

    /* JADX INFO: renamed from: c */
    public final void m9784c(Object obj) {
        synchronized (this.f10748a.guard) {
            try {
                this.f10748a.buffer.add(obj);
                if (this.f10748a.get() != null) {
                    State<T> state = this.f10748a;
                    if (!state.emitting) {
                        this.f10749b = true;
                        state.emitting = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!this.f10749b) {
            return;
        }
        while (true) {
            Object objPoll = this.f10748a.buffer.poll();
            if (objPoll == null) {
                return;
            }
            State<T> state2 = this.f10748a;
            state2.f10750nl.m9793a(state2.get(), objPoll);
        }
    }

    @Override // p003l.m250
    public void onCompleted() {
        boolean z = this.f10749b;
        State<T> state = this.f10748a;
        if (z) {
            state.get().onCompleted();
        } else {
            m9784c(state.f10750nl.m9794b());
        }
    }

    @Override // p003l.m250
    public void onError(Throwable th) {
        boolean z = this.f10749b;
        State<T> state = this.f10748a;
        if (z) {
            state.get().onError(th);
        } else {
            m9784c(state.f10750nl.m9795c(th));
        }
    }

    @Override // p003l.m250
    public void onNext(T t) {
        boolean z = this.f10749b;
        State<T> state = this.f10748a;
        if (z) {
            state.get().onNext(t);
        } else {
            m9784c(state.f10750nl.m9801j(t));
        }
    }
}
