package p014rx.internal.util;

import java.util.concurrent.atomic.AtomicLong;
import p003l.rc90;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class BackpressureDrainManager extends AtomicLong implements rc90 {
    private static final long serialVersionUID = 2826241102729529449L;
    final InterfaceC1150a actual;
    boolean emitting;
    Throwable exception;
    volatile boolean terminated;

    /* JADX INFO: renamed from: rx.internal.util.BackpressureDrainManager$a */
    public interface InterfaceC1150a {
        /* JADX INFO: renamed from: a */
        void mo6925a(Throwable th);

        boolean accept(Object obj);

        Object peek();

        Object poll();
    }

    public BackpressureDrainManager(InterfaceC1150a interfaceC1150a) {
        this.actual = interfaceC1150a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0037 A[Catch: all -> 0x0034, TRY_ENTER, TryCatch #1 {all -> 0x0034, blocks: (B:12:0x0015, B:30:0x003d, B:18:0x0022, B:28:0x0037, B:63:0x007f), top: B:80:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x007f A[Catch: all -> 0x0034, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:12:0x0015, B:30:0x003d, B:18:0x0022, B:28:0x0037, B:63:0x007f), top: B:80:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0086 A[LOOP:1: B:14:0x0018->B:66:0x0086, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x0085 A[SYNTHETIC] */
    public void drain() throws Throwable {
        Object objPoll;
        synchronized (this) {
            try {
                if (this.emitting) {
                    return;
                }
                boolean z = true;
                this.emitting = true;
                boolean z2 = this.terminated;
                long j = get();
                try {
                    InterfaceC1150a interfaceC1150a = this.actual;
                    while (true) {
                        int i = 0;
                        while (true) {
                            try {
                                if (j <= 0 && !z2) {
                                    break;
                                }
                                if (!z2) {
                                    objPoll = interfaceC1150a.poll();
                                    if (objPoll != null) {
                                        break;
                                    }
                                    if (interfaceC1150a.accept(objPoll)) {
                                        return;
                                    }
                                    j--;
                                    i++;
                                } else if (interfaceC1150a.peek() != null) {
                                    if (j == 0) {
                                        break;
                                    }
                                    objPoll = interfaceC1150a.poll();
                                    if (objPoll != null) {
                                        break;
                                    }
                                    if (interfaceC1150a.accept(objPoll)) {
                                        return;
                                    }
                                    j--;
                                    i++;
                                } else {
                                    interfaceC1150a.mo6925a(this.exception);
                                    return;
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (!z) {
                                    synchronized (this) {
                                        this.emitting = false;
                                    }
                                }
                                throw th;
                            }
                        }
                        try {
                            synchronized (this) {
                                try {
                                    z2 = this.terminated;
                                    boolean z3 = interfaceC1150a.peek() != null;
                                    if (get() != Long.MAX_VALUE) {
                                        long jAddAndGet = addAndGet(-i);
                                        if ((jAddAndGet != 0 && z3) || (z2 && !z3)) {
                                            j = jAddAndGet;
                                        }
                                        this.emitting = false;
                                        return;
                                    }
                                    if (!z3 && !z2) {
                                        this.emitting = false;
                                        return;
                                    }
                                    j = Long.MAX_VALUE;
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    z = false;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    public boolean isTerminated() {
        return this.terminated;
    }

    @Override // p003l.rc90
    public void request(long j) throws Throwable {
        boolean z;
        long j2;
        if (j == 0) {
            return;
        }
        while (true) {
            long j3 = get();
            boolean z2 = true;
            z = j3 == 0;
            if (j3 == Long.MAX_VALUE) {
                break;
            }
            if (j == Long.MAX_VALUE) {
                j2 = j;
            } else {
                j2 = j3 <= Long.MAX_VALUE - j ? j3 + j : Long.MAX_VALUE;
                z2 = z;
            }
            if (compareAndSet(j3, j2)) {
                z = z2;
                break;
            }
        }
        if (z) {
            drain();
        }
    }

    public void terminate(Throwable th) {
        if (this.terminated) {
            return;
        }
        this.exception = th;
        this.terminated = true;
    }

    public void terminateAndDrain(Throwable th) throws Throwable {
        if (this.terminated) {
            return;
        }
        this.exception = th;
        this.terminated = true;
        drain();
    }

    public void terminate() {
        this.terminated = true;
    }

    public void terminateAndDrain() throws Throwable {
        this.terminated = true;
        drain();
    }
}
