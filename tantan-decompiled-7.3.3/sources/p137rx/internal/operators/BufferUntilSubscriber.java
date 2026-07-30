package p137rx.internal.operators;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import p137rx.C22421c;
import p153l.bb50;
import p153l.gcg0;
import p153l.pcg0;
import p153l.wbg0;
import p153l.x20;

/* JADX INFO: loaded from: classes3.dex */
public final class BufferUntilSubscriber<T> extends wbg0<T, T> {

    /* JADX INFO: renamed from: c */
    public static final bb50 f208044c = new C22427a();

    /* JADX INFO: renamed from: a */
    public final State<T> f208045a;

    /* JADX INFO: renamed from: b */
    public boolean f208046b;

    public static final class State<T> extends AtomicReference<bb50<? super T>> {
        private static final long serialVersionUID = 8026705089538090368L;
        boolean emitting;
        final Object guard = new Object();
        final ConcurrentLinkedQueue<Object> buffer = new ConcurrentLinkedQueue<>();

        /* JADX INFO: renamed from: nl */
        final NotificationLite<T> f208047nl = NotificationLite.m222581f();

        public boolean casObserverRef(bb50<? super T> bb50Var, bb50<? super T> bb50Var2) {
            return compareAndSet(bb50Var, bb50Var2);
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.BufferUntilSubscriber$a */
    public static class C22427a implements bb50 {
        @Override // p153l.bb50
        public void onCompleted() {
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
        }

        @Override // p153l.bb50
        public void onNext(Object obj) {
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.BufferUntilSubscriber$b */
    public static final class C22428b<T> implements C22421c.a<T> {

        /* JADX INFO: renamed from: a */
        public final State<T> f208048a;

        /* JADX INFO: renamed from: rx.internal.operators.BufferUntilSubscriber$b$a */
        public class a implements x20 {
            public a() {
            }

            @Override // p153l.x20
            public void call() {
                C22428b.this.f208048a.set(BufferUntilSubscriber.f208044c);
            }
        }

        public C22428b(State<T> state) {
            this.f208048a = state;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(gcg0<? super T> gcg0Var) {
            boolean z;
            if (!this.f208048a.casObserverRef(null, gcg0Var)) {
                gcg0Var.onError(new IllegalStateException("Only one subscriber allowed!"));
                return;
            }
            gcg0Var.m129866b(pcg0.m171648a(new a()));
            synchronized (this.f208048a.guard) {
                try {
                    State<T> state = this.f208048a;
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
            NotificationLite notificationLiteM222581f = NotificationLite.m222581f();
            while (true) {
                Object objPoll = this.f208048a.buffer.poll();
                State<T> state2 = this.f208048a;
                if (objPoll != null) {
                    notificationLiteM222581f.m222582a(state2.get(), objPoll);
                } else {
                    synchronized (state2.guard) {
                        try {
                            if (this.f208048a.buffer.isEmpty()) {
                                this.f208048a.emitting = false;
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
        super(new C22428b(state));
        this.f208045a = state;
    }

    /* JADX INFO: renamed from: b */
    public static <T> BufferUntilSubscriber<T> m222572b() {
        return new BufferUntilSubscriber<>(new State());
    }

    /* JADX INFO: renamed from: c */
    public final void m222573c(Object obj) {
        synchronized (this.f208045a.guard) {
            try {
                this.f208045a.buffer.add(obj);
                if (this.f208045a.get() != null) {
                    State<T> state = this.f208045a;
                    if (!state.emitting) {
                        this.f208046b = true;
                        state.emitting = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!this.f208046b) {
            return;
        }
        while (true) {
            Object objPoll = this.f208045a.buffer.poll();
            if (objPoll == null) {
                return;
            }
            State<T> state2 = this.f208045a;
            state2.f208047nl.m222582a(state2.get(), objPoll);
        }
    }

    @Override // p153l.bb50
    public void onCompleted() {
        boolean z = this.f208046b;
        State<T> state = this.f208045a;
        if (z) {
            state.get().onCompleted();
        } else {
            m222573c(state.f208047nl.m222583b());
        }
    }

    @Override // p153l.bb50
    public void onError(Throwable th) {
        boolean z = this.f208046b;
        State<T> state = this.f208045a;
        if (z) {
            state.get().onError(th);
        } else {
            m222573c(state.f208047nl.m222584c(th));
        }
    }

    @Override // p153l.bb50
    public void onNext(T t) {
        boolean z = this.f208046b;
        State<T> state = this.f208045a;
        if (z) {
            state.get().onNext(t);
        } else {
            m222573c(state.f208047nl.m222590j(t));
        }
    }
}
