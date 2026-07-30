package p149l;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import p133rx.internal.util.UtilityFunctions;

/* JADX INFO: loaded from: classes3.dex */
public final class kc2 {
    /* JADX INFO: renamed from: a */
    public static long m145335a(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    /* JADX INFO: renamed from: b */
    public static long m145336b(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j2, m145335a(j2, j)));
        return j2;
    }

    /* JADX INFO: renamed from: c */
    public static long m145337c(long j, long j2) {
        long j3 = j * j2;
        if (((j | j2) >>> 31) == 0 || j2 == 0 || j3 / j2 == j) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: d */
    public static <T> void m145338d(AtomicLong atomicLong, Queue<T> queue, z3g0<? super T> z3g0Var) {
        m145339e(atomicLong, queue, z3g0Var, UtilityFunctions.m221487b());
    }

    /* JADX INFO: renamed from: e */
    public static <T, R> void m145339e(AtomicLong atomicLong, Queue<T> queue, z3g0<? super R> z3g0Var, w9j<? super T, ? extends R> w9jVar) {
        long j;
        do {
            j = atomicLong.get();
            if ((j & Long.MIN_VALUE) != 0) {
                return;
            }
        } while (!atomicLong.compareAndSet(j, Long.MIN_VALUE | j));
        if (j != 0) {
            m145340f(atomicLong, queue, z3g0Var, w9jVar);
        }
    }

    /* JADX INFO: renamed from: f */
    public static <T, R> void m145340f(AtomicLong atomicLong, Queue<T> queue, z3g0<? super R> z3g0Var, w9j<? super T, ? extends R> w9jVar) {
        long jAddAndGet = atomicLong.get();
        if (jAddAndGet == Long.MAX_VALUE) {
            while (!z3g0Var.isUnsubscribed()) {
                Object objPoll = queue.poll();
                if (objPoll == null) {
                    z3g0Var.onCompleted();
                    return;
                }
                z3g0Var.onNext(w9jVar.call(objPoll));
            }
            return;
        }
        do {
            long j = Long.MIN_VALUE;
            while (true) {
                if (j == jAddAndGet) {
                    if (j == jAddAndGet) {
                        if (z3g0Var.isUnsubscribed()) {
                            return;
                        }
                        if (queue.isEmpty()) {
                            z3g0Var.onCompleted();
                            return;
                        }
                    }
                    jAddAndGet = atomicLong.get();
                    if (jAddAndGet == j) {
                        break;
                    }
                } else {
                    if (z3g0Var.isUnsubscribed()) {
                        return;
                    }
                    Object objPoll2 = queue.poll();
                    if (objPoll2 == null) {
                        z3g0Var.onCompleted();
                        return;
                    } else {
                        z3g0Var.onNext(w9jVar.call(objPoll2));
                        j++;
                    }
                }
            }
            jAddAndGet = atomicLong.addAndGet(-(j & Long.MAX_VALUE));
        } while (jAddAndGet != Long.MIN_VALUE);
    }

    /* JADX INFO: renamed from: g */
    public static <T> boolean m145341g(AtomicLong atomicLong, long j, Queue<T> queue, z3g0<? super T> z3g0Var) {
        return m145342h(atomicLong, j, queue, z3g0Var, UtilityFunctions.m221487b());
    }

    /* JADX INFO: renamed from: h */
    public static <T, R> boolean m145342h(AtomicLong atomicLong, long j, Queue<T> queue, z3g0<? super R> z3g0Var, w9j<? super T, ? extends R> w9jVar) {
        long j2;
        long j3;
        if (j < 0) {
            y3g0.m212802a("n >= 0 required but it was ", j);
            return false;
        }
        if (j == 0) {
            return (atomicLong.get() & Long.MIN_VALUE) == 0;
        }
        do {
            j2 = atomicLong.get();
            j3 = j2 & Long.MIN_VALUE;
        } while (!atomicLong.compareAndSet(j2, m145335a(Long.MAX_VALUE & j2, j) | j3));
        if (j2 != Long.MIN_VALUE) {
            return j3 == 0;
        }
        m145340f(atomicLong, queue, z3g0Var, w9jVar);
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static long m145343i(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                jc2.m140849a("More produced than requested: ", j3);
                return 0L;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        return j3;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m145344j(long j) {
        if (j >= 0) {
            return j != 0;
        }
        y3g0.m212802a("n >= 0 required but it was ", j);
        return false;
    }
}
