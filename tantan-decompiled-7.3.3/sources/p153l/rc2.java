package p153l;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import p137rx.internal.util.UtilityFunctions;

/* JADX INFO: loaded from: classes3.dex */
public final class rc2 {
    /* JADX INFO: renamed from: a */
    public static long m180769a(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    /* JADX INFO: renamed from: b */
    public static long m180770b(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j2, m180769a(j2, j)));
        return j2;
    }

    /* JADX INFO: renamed from: c */
    public static long m180771c(long j, long j2) {
        long j3 = j * j2;
        if (((j | j2) >>> 31) == 0 || j2 == 0 || j3 / j2 == j) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: d */
    public static <T> void m180772d(AtomicLong atomicLong, Queue<T> queue, gcg0<? super T> gcg0Var) {
        m180773e(atomicLong, queue, gcg0Var, UtilityFunctions.m222733b());
    }

    /* JADX INFO: renamed from: e */
    public static <T, R> void m180773e(AtomicLong atomicLong, Queue<T> queue, gcg0<? super R> gcg0Var, qcj<? super T, ? extends R> qcjVar) {
        long j;
        do {
            j = atomicLong.get();
            if ((j & Long.MIN_VALUE) != 0) {
                return;
            }
        } while (!atomicLong.compareAndSet(j, Long.MIN_VALUE | j));
        if (j != 0) {
            m180774f(atomicLong, queue, gcg0Var, qcjVar);
        }
    }

    /* JADX INFO: renamed from: f */
    public static <T, R> void m180774f(AtomicLong atomicLong, Queue<T> queue, gcg0<? super R> gcg0Var, qcj<? super T, ? extends R> qcjVar) {
        long jAddAndGet = atomicLong.get();
        if (jAddAndGet == Long.MAX_VALUE) {
            while (!gcg0Var.isUnsubscribed()) {
                Object objPoll = queue.poll();
                if (objPoll == null) {
                    gcg0Var.onCompleted();
                    return;
                }
                gcg0Var.onNext(qcjVar.call(objPoll));
            }
            return;
        }
        do {
            long j = Long.MIN_VALUE;
            while (true) {
                if (j == jAddAndGet) {
                    if (j == jAddAndGet) {
                        if (gcg0Var.isUnsubscribed()) {
                            return;
                        }
                        if (queue.isEmpty()) {
                            gcg0Var.onCompleted();
                            return;
                        }
                    }
                    jAddAndGet = atomicLong.get();
                    if (jAddAndGet == j) {
                        break;
                    }
                } else {
                    if (gcg0Var.isUnsubscribed()) {
                        return;
                    }
                    Object objPoll2 = queue.poll();
                    if (objPoll2 == null) {
                        gcg0Var.onCompleted();
                        return;
                    } else {
                        gcg0Var.onNext(qcjVar.call(objPoll2));
                        j++;
                    }
                }
            }
            jAddAndGet = atomicLong.addAndGet(-(j & Long.MAX_VALUE));
        } while (jAddAndGet != Long.MIN_VALUE);
    }

    /* JADX INFO: renamed from: g */
    public static <T> boolean m180775g(AtomicLong atomicLong, long j, Queue<T> queue, gcg0<? super T> gcg0Var) {
        return m180776h(atomicLong, j, queue, gcg0Var, UtilityFunctions.m222733b());
    }

    /* JADX INFO: renamed from: h */
    public static <T, R> boolean m180776h(AtomicLong atomicLong, long j, Queue<T> queue, gcg0<? super R> gcg0Var, qcj<? super T, ? extends R> qcjVar) {
        long j2;
        long j3;
        if (j < 0) {
            fcg0.m125008a("n >= 0 required but it was ", j);
            return false;
        }
        if (j == 0) {
            return (atomicLong.get() & Long.MIN_VALUE) == 0;
        }
        do {
            j2 = atomicLong.get();
            j3 = j2 & Long.MIN_VALUE;
        } while (!atomicLong.compareAndSet(j2, m180769a(Long.MAX_VALUE & j2, j) | j3));
        if (j2 != Long.MIN_VALUE) {
            return j3 == 0;
        }
        m180774f(atomicLong, queue, gcg0Var, qcjVar);
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static long m180777i(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                qc2.m176107a("More produced than requested: ", j3);
                return 0L;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        return j3;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m180778j(long j) {
        if (j >= 0) {
            return j != 0;
        }
        fcg0.m125008a("n >= 0 required but it was ", j);
        return false;
    }
}
