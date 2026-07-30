package p014rx.internal.operators;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import l.ig3;
import p003l.bs5;
import p003l.f5f;
import p003l.frf0;
import p003l.irf0;
import p003l.k250;
import p003l.kc2;
import p003l.rc90;
import p003l.rjd0;
import p003l.z3g0;
import p014rx.C1099c;
import p014rx.exceptions.CompositeException;
import p014rx.exceptions.MissingBackpressureException;
import p014rx.exceptions.OnErrorThrowable;
import p014rx.internal.util.ScalarSynchronousObservable;
import p014rx.internal.util.atomic.SpscExactAtomicArrayQueue;
import p014rx.internal.util.unsafe.Pow2;
import p014rx.internal.util.unsafe.SpscArrayQueue;
import p014rx.internal.util.unsafe.UnsafeAccess;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class OperatorMerge<T> implements C1099c.c<T, C1099c<? extends T>> {

    /* JADX INFO: renamed from: a */
    public final boolean f10866a;

    /* JADX INFO: renamed from: b */
    public final int f10867b;

    public static final class MergeProducer<T> extends AtomicLong implements rc90 {
        private static final long serialVersionUID = -1214379189873595503L;
        final C1126d<T> subscriber;

        public MergeProducer(C1126d<T> c1126d) {
            this.subscriber = c1126d;
        }

        public long produced(int i) {
            return addAndGet(-i);
        }

        @Override // p003l.rc90
        public void request(long j) throws Throwable {
            if (j <= 0) {
                if (j >= 0) {
                    return;
                }
                ig3.a("n >= 0 required");
            } else {
                if (get() == Long.MAX_VALUE) {
                    return;
                }
                kc2.m5640b(this, j);
                this.subscriber.m9844i();
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorMerge$a */
    public static final class C1123a {
        static final OperatorMerge<Object> INSTANCE = new OperatorMerge<>(true, Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorMerge$b */
    public static final class C1124b {
        static final OperatorMerge<Object> INSTANCE = new OperatorMerge<>(false, Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorMerge$c */
    public static final class C1125c<T> extends z3g0<T> {

        /* JADX INFO: renamed from: j */
        public static final int f10868j = rjd0.f6938g / 4;

        /* JADX INFO: renamed from: e */
        public final C1126d<T> f10869e;

        /* JADX INFO: renamed from: f */
        public final long f10870f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f10871g;

        /* JADX INFO: renamed from: h */
        public volatile rjd0 f10872h;

        /* JADX INFO: renamed from: i */
        public int f10873i;

        public C1125c(C1126d<T> c1126d, long j) {
            this.f10869e = c1126d;
            this.f10870f = j;
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo2918d() {
            int i = rjd0.f6938g;
            this.f10873i = i;
            m9242e(i);
        }

        /* JADX INFO: renamed from: g */
        public void m9841g(long j) {
            int i = this.f10873i - ((int) j);
            if (i > f10868j) {
                this.f10873i = i;
                return;
            }
            int i2 = rjd0.f6938g;
            this.f10873i = i2;
            int i3 = i2 - i;
            if (i3 > 0) {
                m9242e(i3);
            }
        }

        @Override // p003l.m250
        public void onCompleted() throws Throwable {
            this.f10871g = true;
            this.f10869e.m9844i();
        }

        @Override // p003l.m250
        public void onError(Throwable th) throws Throwable {
            this.f10871g = true;
            this.f10869e.m9850o().offer(th);
            this.f10869e.m9844i();
        }

        @Override // p003l.m250
        public void onNext(T t) throws Throwable {
            this.f10869e.m9858w(this, t);
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorMerge$d */
    public static final class C1126d<T> extends z3g0<C1099c<? extends T>> {

        /* JADX INFO: renamed from: w */
        public static final C1125c<?>[] f10874w = new C1125c[0];

        /* JADX INFO: renamed from: e */
        public final z3g0<? super T> f10875e;

        /* JADX INFO: renamed from: f */
        public final boolean f10876f;

        /* JADX INFO: renamed from: g */
        public final int f10877g;

        /* JADX INFO: renamed from: h */
        public MergeProducer<T> f10878h;

        /* JADX INFO: renamed from: i */
        public volatile Queue<Object> f10879i;

        /* JADX INFO: renamed from: j */
        public volatile bs5 f10880j;

        /* JADX INFO: renamed from: k */
        public volatile ConcurrentLinkedQueue<Throwable> f10881k;

        /* JADX INFO: renamed from: m */
        public volatile boolean f10883m;

        /* JADX INFO: renamed from: n */
        public boolean f10884n;

        /* JADX INFO: renamed from: o */
        public boolean f10885o;

        /* JADX INFO: renamed from: r */
        public long f10888r;

        /* JADX INFO: renamed from: s */
        public long f10889s;

        /* JADX INFO: renamed from: t */
        public int f10890t;

        /* JADX INFO: renamed from: u */
        public final int f10891u;

        /* JADX INFO: renamed from: v */
        public int f10892v;

        /* JADX INFO: renamed from: l */
        public final NotificationLite<T> f10882l = NotificationLite.m9792f();

        /* JADX INFO: renamed from: p */
        public final Object f10886p = new Object();

        /* JADX INFO: renamed from: q */
        public volatile C1125c<?>[] f10887q = f10874w;

        public C1126d(z3g0<? super T> z3g0Var, boolean z, int i) {
            this.f10875e = z3g0Var;
            this.f10876f = z;
            this.f10877g = i;
            if (i == Integer.MAX_VALUE) {
                this.f10891u = Integer.MAX_VALUE;
                m9242e(Long.MAX_VALUE);
            } else {
                this.f10891u = Math.max(1, i >> 1);
                m9242e(i);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: g */
        public void m9842g(C1125c<T> c1125c) {
            m9849n().m3164a(c1125c);
            synchronized (this.f10886p) {
                C1125c<?>[] c1125cArr = this.f10887q;
                int length = c1125cArr.length;
                C1125c<?>[] c1125cArr2 = new C1125c[length + 1];
                System.arraycopy(c1125cArr, 0, c1125cArr2, 0, length);
                c1125cArr2[length] = c1125c;
                this.f10887q = c1125cArr2;
            }
        }

        /* JADX INFO: renamed from: h */
        public boolean m9843h() {
            if (this.f10875e.isUnsubscribed()) {
                return true;
            }
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue = this.f10881k;
            if (this.f10876f || concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
                return false;
            }
            try {
                m9855t();
                return true;
            } finally {
                unsubscribe();
            }
        }

        /* JADX INFO: renamed from: i */
        public void m9844i() throws Throwable {
            synchronized (this) {
                try {
                    if (this.f10884n) {
                        this.f10885o = true;
                    } else {
                        this.f10884n = true;
                        m9846k();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public void m9845j() {
            int i = this.f10892v + 1;
            if (i != this.f10891u) {
                this.f10892v = i;
            } else {
                this.f10892v = 0;
                m9856u(i);
            }
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x01a5 */
        /* JADX WARN: Code duplicated, block: B:109:0x013b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:110:0x013d A[Catch: all -> 0x005d, TRY_ENTER, TryCatch #7 {all -> 0x005d, blocks: (B:3:0x0003, B:4:0x0005, B:7:0x000c, B:17:0x0030, B:22:0x003f, B:36:0x0068, B:26:0x004a, B:28:0x004e, B:35:0x0061, B:40:0x007f, B:47:0x009a, B:50:0x00a5, B:53:0x00ad, B:55:0x00b1, B:58:0x00b8, B:59:0x00bc, B:62:0x00c2, B:64:0x00c9, B:72:0x00dc, B:75:0x00e5, B:78:0x00ea, B:79:0x00ed, B:82:0x00f9, B:85:0x0100, B:89:0x0108, B:92:0x010f, B:95:0x0114, B:98:0x011b, B:110:0x013d, B:112:0x0149, B:116:0x0153, B:119:0x015b, B:121:0x0161, B:124:0x016b, B:127:0x0171, B:130:0x0176, B:131:0x017a, B:134:0x0186, B:137:0x018e), top: B:177:0x0003 }] */
        /* JADX WARN: Code duplicated, block: B:111:0x0144  */
        /* JADX WARN: Code duplicated, block: B:115:0x0151 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:124:0x016b A[Catch: all -> 0x005d, TryCatch #7 {all -> 0x005d, blocks: (B:3:0x0003, B:4:0x0005, B:7:0x000c, B:17:0x0030, B:22:0x003f, B:36:0x0068, B:26:0x004a, B:28:0x004e, B:35:0x0061, B:40:0x007f, B:47:0x009a, B:50:0x00a5, B:53:0x00ad, B:55:0x00b1, B:58:0x00b8, B:59:0x00bc, B:62:0x00c2, B:64:0x00c9, B:72:0x00dc, B:75:0x00e5, B:78:0x00ea, B:79:0x00ed, B:82:0x00f9, B:85:0x0100, B:89:0x0108, B:92:0x010f, B:95:0x0114, B:98:0x011b, B:110:0x013d, B:112:0x0149, B:116:0x0153, B:119:0x015b, B:121:0x0161, B:124:0x016b, B:127:0x0171, B:130:0x0176, B:131:0x017a, B:134:0x0186, B:137:0x018e), top: B:177:0x0003 }] */
        /* JADX WARN: Code duplicated, block: B:127:0x0171 A[Catch: all -> 0x005d, TryCatch #7 {all -> 0x005d, blocks: (B:3:0x0003, B:4:0x0005, B:7:0x000c, B:17:0x0030, B:22:0x003f, B:36:0x0068, B:26:0x004a, B:28:0x004e, B:35:0x0061, B:40:0x007f, B:47:0x009a, B:50:0x00a5, B:53:0x00ad, B:55:0x00b1, B:58:0x00b8, B:59:0x00bc, B:62:0x00c2, B:64:0x00c9, B:72:0x00dc, B:75:0x00e5, B:78:0x00ea, B:79:0x00ed, B:82:0x00f9, B:85:0x0100, B:89:0x0108, B:92:0x010f, B:95:0x0114, B:98:0x011b, B:110:0x013d, B:112:0x0149, B:116:0x0153, B:119:0x015b, B:121:0x0161, B:124:0x016b, B:127:0x0171, B:130:0x0176, B:131:0x017a, B:134:0x0186, B:137:0x018e), top: B:177:0x0003 }] */
        /* JADX WARN: Code duplicated, block: B:129:0x0175  */
        /* JADX WARN: Code duplicated, block: B:157:0x01a9  */
        /* JADX WARN: Code duplicated, block: B:178:0x01aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:186:0x00ff A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:187:0x010e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:188:0x016a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:205:0x0170 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:207:0x0176 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:208:0x0153 A[EDGE_INSN: B:208:0x0153->B:116:0x0153 BREAK  A[LOOP:5: B:86:0x0103->B:210:?], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:82:0x00f9 A[Catch: all -> 0x005d, TryCatch #7 {all -> 0x005d, blocks: (B:3:0x0003, B:4:0x0005, B:7:0x000c, B:17:0x0030, B:22:0x003f, B:36:0x0068, B:26:0x004a, B:28:0x004e, B:35:0x0061, B:40:0x007f, B:47:0x009a, B:50:0x00a5, B:53:0x00ad, B:55:0x00b1, B:58:0x00b8, B:59:0x00bc, B:62:0x00c2, B:64:0x00c9, B:72:0x00dc, B:75:0x00e5, B:78:0x00ea, B:79:0x00ed, B:82:0x00f9, B:85:0x0100, B:89:0x0108, B:92:0x010f, B:95:0x0114, B:98:0x011b, B:110:0x013d, B:112:0x0149, B:116:0x0153, B:119:0x015b, B:121:0x0161, B:124:0x016b, B:127:0x0171, B:130:0x0176, B:131:0x017a, B:134:0x0186, B:137:0x018e), top: B:177:0x0003 }] */
        /* JADX WARN: Code duplicated, block: B:85:0x0100 A[Catch: all -> 0x005d, TryCatch #7 {all -> 0x005d, blocks: (B:3:0x0003, B:4:0x0005, B:7:0x000c, B:17:0x0030, B:22:0x003f, B:36:0x0068, B:26:0x004a, B:28:0x004e, B:35:0x0061, B:40:0x007f, B:47:0x009a, B:50:0x00a5, B:53:0x00ad, B:55:0x00b1, B:58:0x00b8, B:59:0x00bc, B:62:0x00c2, B:64:0x00c9, B:72:0x00dc, B:75:0x00e5, B:78:0x00ea, B:79:0x00ed, B:82:0x00f9, B:85:0x0100, B:89:0x0108, B:92:0x010f, B:95:0x0114, B:98:0x011b, B:110:0x013d, B:112:0x0149, B:116:0x0153, B:119:0x015b, B:121:0x0161, B:124:0x016b, B:127:0x0171, B:130:0x0176, B:131:0x017a, B:134:0x0186, B:137:0x018e), top: B:177:0x0003 }] */
        /* JADX WARN: Code duplicated, block: B:89:0x0108 A[Catch: all -> 0x005d, TryCatch #7 {all -> 0x005d, blocks: (B:3:0x0003, B:4:0x0005, B:7:0x000c, B:17:0x0030, B:22:0x003f, B:36:0x0068, B:26:0x004a, B:28:0x004e, B:35:0x0061, B:40:0x007f, B:47:0x009a, B:50:0x00a5, B:53:0x00ad, B:55:0x00b1, B:58:0x00b8, B:59:0x00bc, B:62:0x00c2, B:64:0x00c9, B:72:0x00dc, B:75:0x00e5, B:78:0x00ea, B:79:0x00ed, B:82:0x00f9, B:85:0x0100, B:89:0x0108, B:92:0x010f, B:95:0x0114, B:98:0x011b, B:110:0x013d, B:112:0x0149, B:116:0x0153, B:119:0x015b, B:121:0x0161, B:124:0x016b, B:127:0x0171, B:130:0x0176, B:131:0x017a, B:134:0x0186, B:137:0x018e), top: B:177:0x0003 }] */
        /* JADX WARN: Code duplicated, block: B:92:0x010f A[Catch: all -> 0x005d, TryCatch #7 {all -> 0x005d, blocks: (B:3:0x0003, B:4:0x0005, B:7:0x000c, B:17:0x0030, B:22:0x003f, B:36:0x0068, B:26:0x004a, B:28:0x004e, B:35:0x0061, B:40:0x007f, B:47:0x009a, B:50:0x00a5, B:53:0x00ad, B:55:0x00b1, B:58:0x00b8, B:59:0x00bc, B:62:0x00c2, B:64:0x00c9, B:72:0x00dc, B:75:0x00e5, B:78:0x00ea, B:79:0x00ed, B:82:0x00f9, B:85:0x0100, B:89:0x0108, B:92:0x010f, B:95:0x0114, B:98:0x011b, B:110:0x013d, B:112:0x0149, B:116:0x0153, B:119:0x015b, B:121:0x0161, B:124:0x016b, B:127:0x0171, B:130:0x0176, B:131:0x017a, B:134:0x0186, B:137:0x018e), top: B:177:0x0003 }] */
        /* JADX INFO: renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void m9846k() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 434
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p014rx.internal.operators.OperatorMerge.C1126d.m9846k():void");
        }

        /* JADX WARN: Code duplicated, block: B:38:0x0057  */
        /* JADX WARN: Code duplicated, block: B:50:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX INFO: renamed from: l */
        public void m9847l(T t, long j) throws Throwable {
            boolean z = true;
            try {
                try {
                    this.f10875e.onNext(t);
                } catch (Throwable th) {
                    try {
                        if (!this.f10876f) {
                            f5f.m3964e(th);
                            unsubscribe();
                            onError(th);
                            return;
                        }
                        m9850o().offer(th);
                    } catch (Throwable th2) {
                        th = th2;
                        z = false;
                        if (!z) {
                            synchronized (this) {
                                this.f10884n = false;
                            }
                        }
                        throw th;
                    }
                }
                if (j != Long.MAX_VALUE) {
                    this.f10878h.produced(1);
                }
                int i = this.f10892v + 1;
                if (i == this.f10891u) {
                    this.f10892v = 0;
                    m9856u(i);
                } else {
                    this.f10892v = i;
                }
                synchronized (this) {
                    try {
                        if (!this.f10885o) {
                            this.f10884n = false;
                        } else {
                            this.f10885o = false;
                            m9846k();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                if (!z) {
                    synchronized (this) {
                        this.f10884n = false;
                    }
                }
                throw th;
            }
        }

        /* JADX WARN: Code duplicated, block: B:35:0x004c  */
        /* JADX WARN: Code duplicated, block: B:43:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX INFO: renamed from: m */
        public void m9848m(C1125c<T> c1125c, T t, long j) throws Throwable {
            boolean z = true;
            try {
                try {
                    this.f10875e.onNext(t);
                } catch (Throwable th) {
                    try {
                        if (!this.f10876f) {
                            f5f.m3964e(th);
                            c1125c.unsubscribe();
                            c1125c.onError(th);
                            return;
                        }
                        m9850o().offer(th);
                    } catch (Throwable th2) {
                        th = th2;
                        z = false;
                        if (!z) {
                            synchronized (this) {
                                this.f10884n = false;
                            }
                        }
                        throw th;
                    }
                }
                if (j != Long.MAX_VALUE) {
                    this.f10878h.produced(1);
                }
                c1125c.m9841g(1L);
                synchronized (this) {
                    try {
                        if (!this.f10885o) {
                            this.f10884n = false;
                        } else {
                            this.f10885o = false;
                            m9846k();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                if (!z) {
                    synchronized (this) {
                        this.f10884n = false;
                    }
                }
                throw th;
            }
        }

        /* JADX INFO: renamed from: n */
        public bs5 m9849n() {
            bs5 bs5Var;
            boolean z;
            bs5 bs5Var2 = this.f10880j;
            if (bs5Var2 != null) {
                return bs5Var2;
            }
            synchronized (this) {
                try {
                    bs5Var = this.f10880j;
                    if (bs5Var == null) {
                        bs5Var = new bs5();
                        this.f10880j = bs5Var;
                        z = true;
                    } else {
                        z = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                m9240b(bs5Var);
            }
            return bs5Var;
        }

        /* JADX INFO: renamed from: o */
        public Queue<Throwable> m9850o() {
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue;
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue2 = this.f10881k;
            if (concurrentLinkedQueue2 != null) {
                return concurrentLinkedQueue2;
            }
            synchronized (this) {
                try {
                    concurrentLinkedQueue = this.f10881k;
                    if (concurrentLinkedQueue == null) {
                        concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
                        this.f10881k = concurrentLinkedQueue;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return concurrentLinkedQueue;
        }

        @Override // p003l.m250
        public void onCompleted() throws Throwable {
            this.f10883m = true;
            m9844i();
        }

        @Override // p003l.m250
        public void onError(Throwable th) throws Throwable {
            m9850o().offer(th);
            this.f10883m = true;
            m9844i();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p003l.m250
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void onNext(C1099c<? extends T> c1099c) throws Throwable {
            if (c1099c == null) {
                return;
            }
            if (c1099c == C1099c.empty()) {
                m9845j();
                return;
            }
            if (c1099c instanceof ScalarSynchronousObservable) {
                m9857v(((ScalarSynchronousObservable) c1099c).m9935c());
                return;
            }
            long j = this.f10888r;
            this.f10888r = 1 + j;
            C1125c c1125c = new C1125c(this, j);
            m9842g(c1125c);
            c1099c.unsafeSubscribe(c1125c);
            m9844i();
        }

        /* JADX INFO: renamed from: q */
        public void m9852q(T t) throws Throwable {
            Queue<Object> spscExactAtomicArrayQueue;
            Queue<Object> irf0Var = this.f10879i;
            if (irf0Var == null) {
                int i = this.f10877g;
                if (i == Integer.MAX_VALUE) {
                    irf0Var = new irf0<>(rjd0.f6938g);
                } else {
                    if (Pow2.isPowerOfTwo(i)) {
                        spscExactAtomicArrayQueue = UnsafeAccess.isUnsafeAvailable() ? new SpscArrayQueue<>(i) : new frf0<>(i);
                    } else {
                        spscExactAtomicArrayQueue = new SpscExactAtomicArrayQueue<>(i);
                    }
                    irf0Var = spscExactAtomicArrayQueue;
                }
                this.f10879i = irf0Var;
            }
            if (irf0Var.offer(this.f10882l.m9801j(t))) {
                m9844i();
            } else {
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(new MissingBackpressureException(), t));
            }
        }

        /* JADX INFO: renamed from: r */
        public void m9853r(C1125c<T> c1125c, T t) throws Throwable {
            rjd0 rjd0VarM7264b = c1125c.f10872h;
            if (rjd0VarM7264b == null) {
                rjd0VarM7264b = rjd0.m7264b();
                c1125c.m9240b(rjd0VarM7264b);
                c1125c.f10872h = rjd0VarM7264b;
            }
            try {
                rjd0VarM7264b.m7269g(this.f10882l.m9801j(t));
                m9844i();
            } catch (IllegalStateException e) {
                if (c1125c.isUnsubscribed()) {
                    return;
                }
                c1125c.unsubscribe();
                c1125c.onError(e);
            } catch (MissingBackpressureException e2) {
                c1125c.unsubscribe();
                c1125c.onError(e2);
            }
        }

        /* JADX INFO: renamed from: s */
        public void m9854s(C1125c<T> c1125c) {
            rjd0 rjd0Var = c1125c.f10872h;
            if (rjd0Var != null) {
                rjd0Var.m7272j();
            }
            this.f10880j.m3167d(c1125c);
            synchronized (this.f10886p) {
                try {
                    C1125c<?>[] c1125cArr = this.f10887q;
                    int length = c1125cArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        } else if (c1125c.equals(c1125cArr[i])) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i < 0) {
                        return;
                    }
                    if (length == 1) {
                        this.f10887q = f10874w;
                        return;
                    }
                    C1125c<?>[] c1125cArr2 = new C1125c[length - 1];
                    System.arraycopy(c1125cArr, 0, c1125cArr2, 0, i);
                    System.arraycopy(c1125cArr, i + 1, c1125cArr2, i, (length - i) - 1);
                    this.f10887q = c1125cArr2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: t */
        public final void m9855t() {
            ArrayList arrayList = new ArrayList(this.f10881k);
            int size = arrayList.size();
            z3g0<? super T> z3g0Var = this.f10875e;
            if (size == 1) {
                z3g0Var.onError((Throwable) arrayList.get(0));
            } else {
                z3g0Var.onError(new CompositeException(arrayList));
            }
        }

        /* JADX INFO: renamed from: u */
        public void m9856u(long j) {
            m9242e(j);
        }

        /* JADX INFO: renamed from: v */
        public void m9857v(T t) throws Throwable {
            long j = this.f10878h.get();
            boolean z = false;
            if (j != 0) {
                synchronized (this) {
                    try {
                        j = this.f10878h.get();
                        if (!this.f10884n && j != 0) {
                            z = true;
                            this.f10884n = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z) {
                m9847l(t, j);
            } else {
                m9852q(t);
            }
        }

        /* JADX INFO: renamed from: w */
        public void m9858w(C1125c<T> c1125c, T t) throws Throwable {
            long j = this.f10878h.get();
            boolean z = false;
            if (j != 0) {
                synchronized (this) {
                    try {
                        j = this.f10878h.get();
                        if (!this.f10884n && j != 0) {
                            z = true;
                            this.f10884n = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z) {
                m9848m(c1125c, t, j);
            } else {
                m9853r(c1125c, t);
            }
        }
    }

    public OperatorMerge(boolean z, int i) {
        this.f10866a = z;
        this.f10867b = i;
    }

    /* JADX INFO: renamed from: b */
    public static <T> OperatorMerge<T> m9838b(boolean z) {
        return z ? (OperatorMerge<T>) C1123a.INSTANCE : (OperatorMerge<T>) C1124b.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static <T> OperatorMerge<T> m9839c(boolean z, int i) {
        if (i > 0) {
            return i == Integer.MAX_VALUE ? m9838b(z) : new OperatorMerge<>(z, i);
        }
        k250.m5546a("maxConcurrent > 0 required but it was ", i);
        return null;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<C1099c<? extends T>> call(z3g0<? super T> z3g0Var) {
        C1126d c1126d = new C1126d(z3g0Var, this.f10866a, this.f10867b);
        MergeProducer<T> mergeProducer = new MergeProducer<>(c1126d);
        c1126d.f10878h = mergeProducer;
        z3g0Var.m9240b(c1126d);
        z3g0Var.mo3257f(mergeProducer);
        return c1126d;
    }
}
