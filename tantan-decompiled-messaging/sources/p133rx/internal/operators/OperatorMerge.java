package p133rx.internal.operators;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import p133rx.C22306c;
import p133rx.exceptions.CompositeException;
import p133rx.exceptions.MissingBackpressureException;
import p133rx.exceptions.OnErrorThrowable;
import p133rx.internal.util.ScalarSynchronousObservable;
import p133rx.internal.util.atomic.SpscExactAtomicArrayQueue;
import p133rx.internal.util.unsafe.Pow2;
import p133rx.internal.util.unsafe.SpscArrayQueue;
import p133rx.internal.util.unsafe.UnsafeAccess;
import p149l.bs5;
import p149l.f5f;
import p149l.frf0;
import p149l.ig3;
import p149l.irf0;
import p149l.k250;
import p149l.kc2;
import p149l.rc90;
import p149l.rjd0;
import p149l.z3g0;

/* JADX INFO: loaded from: classes3.dex */
public final class OperatorMerge<T> implements C22306c.c<T, C22306c<? extends T>> {

    /* JADX INFO: renamed from: a */
    public final boolean f207241a;

    /* JADX INFO: renamed from: b */
    public final int f207242b;

    public static final class MergeProducer<T> extends AtomicLong implements rc90 {
        private static final long serialVersionUID = -1214379189873595503L;
        final C22333d<T> subscriber;

        public MergeProducer(C22333d<T> c22333d) {
            this.subscriber = c22333d;
        }

        public long produced(int i) {
            return addAndGet(-i);
        }

        @Override // p149l.rc90
        public void request(long j) throws Throwable {
            if (j <= 0) {
                if (j >= 0) {
                    return;
                }
                ig3.m135964a("n >= 0 required");
            } else {
                if (get() == Long.MAX_VALUE) {
                    return;
                }
                kc2.m145336b(this, j);
                this.subscriber.m221387i();
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorMerge$a */
    public static final class C22330a {
        static final OperatorMerge<Object> INSTANCE = new OperatorMerge<>(true, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorMerge$b */
    public static final class C22331b {
        static final OperatorMerge<Object> INSTANCE = new OperatorMerge<>(false, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorMerge$c */
    public static final class C22332c<T> extends z3g0<T> {

        /* JADX INFO: renamed from: j */
        public static final int f207243j = rjd0.f159670g / 4;

        /* JADX INFO: renamed from: e */
        public final C22333d<T> f207244e;

        /* JADX INFO: renamed from: f */
        public final long f207245f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f207246g;

        /* JADX INFO: renamed from: h */
        public volatile rjd0 f207247h;

        /* JADX INFO: renamed from: i */
        public int f207248i;

        public C22332c(C22333d<T> c22333d, long j) {
            this.f207244e = c22333d;
            this.f207245f = j;
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo99382d() {
            int i = rjd0.f159670g;
            this.f207248i = i;
            m217048e(i);
        }

        /* JADX INFO: renamed from: g */
        public void m221384g(long j) {
            int i = this.f207248i - ((int) j);
            if (i > f207243j) {
                this.f207248i = i;
                return;
            }
            int i2 = rjd0.f159670g;
            this.f207248i = i2;
            int i3 = i2 - i;
            if (i3 > 0) {
                m217048e(i3);
            }
        }

        @Override // p149l.m250
        public void onCompleted() throws Throwable {
            this.f207246g = true;
            this.f207244e.m221387i();
        }

        @Override // p149l.m250
        public void onError(Throwable th) throws Throwable {
            this.f207246g = true;
            this.f207244e.m221393o().offer(th);
            this.f207244e.m221387i();
        }

        @Override // p149l.m250
        public void onNext(T t) throws Throwable {
            this.f207244e.m221401w(this, t);
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorMerge$d */
    public static final class C22333d<T> extends z3g0<C22306c<? extends T>> {

        /* JADX INFO: renamed from: w */
        public static final C22332c<?>[] f207249w = new C22332c[0];

        /* JADX INFO: renamed from: e */
        public final z3g0<? super T> f207250e;

        /* JADX INFO: renamed from: f */
        public final boolean f207251f;

        /* JADX INFO: renamed from: g */
        public final int f207252g;

        /* JADX INFO: renamed from: h */
        public MergeProducer<T> f207253h;

        /* JADX INFO: renamed from: i */
        public volatile Queue<Object> f207254i;

        /* JADX INFO: renamed from: j */
        public volatile bs5 f207255j;

        /* JADX INFO: renamed from: k */
        public volatile ConcurrentLinkedQueue<Throwable> f207256k;

        /* JADX INFO: renamed from: m */
        public volatile boolean f207258m;

        /* JADX INFO: renamed from: n */
        public boolean f207259n;

        /* JADX INFO: renamed from: o */
        public boolean f207260o;

        /* JADX INFO: renamed from: r */
        public long f207263r;

        /* JADX INFO: renamed from: s */
        public long f207264s;

        /* JADX INFO: renamed from: t */
        public int f207265t;

        /* JADX INFO: renamed from: u */
        public final int f207266u;

        /* JADX INFO: renamed from: v */
        public int f207267v;

        /* JADX INFO: renamed from: l */
        public final NotificationLite<T> f207257l = NotificationLite.m221335f();

        /* JADX INFO: renamed from: p */
        public final Object f207261p = new Object();

        /* JADX INFO: renamed from: q */
        public volatile C22332c<?>[] f207262q = f207249w;

        public C22333d(z3g0<? super T> z3g0Var, boolean z, int i) {
            this.f207250e = z3g0Var;
            this.f207251f = z;
            this.f207252g = i;
            if (i == Integer.MAX_VALUE) {
                this.f207266u = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                m217048e(Long.MAX_VALUE);
            } else {
                this.f207266u = Math.max(1, i >> 1);
                m217048e(i);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: g */
        public void m221385g(C22332c<T> c22332c) {
            m221392n().m103655a(c22332c);
            synchronized (this.f207261p) {
                C22332c<?>[] c22332cArr = this.f207262q;
                int length = c22332cArr.length;
                C22332c<?>[] c22332cArr2 = new C22332c[length + 1];
                System.arraycopy(c22332cArr, 0, c22332cArr2, 0, length);
                c22332cArr2[length] = c22332c;
                this.f207262q = c22332cArr2;
            }
        }

        /* JADX INFO: renamed from: h */
        public boolean m221386h() {
            if (this.f207250e.isUnsubscribed()) {
                return true;
            }
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue = this.f207256k;
            if (this.f207251f || concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
                return false;
            }
            try {
                m221398t();
                return true;
            } finally {
                unsubscribe();
            }
        }

        /* JADX INFO: renamed from: i */
        public void m221387i() throws Throwable {
            synchronized (this) {
                try {
                    if (this.f207259n) {
                        this.f207260o = true;
                    } else {
                        this.f207259n = true;
                        m221389k();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public void m221388j() {
            int i = this.f207267v + 1;
            if (i != this.f207266u) {
                this.f207267v = i;
            } else {
                this.f207267v = 0;
                m221399u(i);
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
        public void m221389k() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 434
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p133rx.internal.operators.OperatorMerge.C22333d.m221389k():void");
        }

        /* JADX WARN: Code duplicated, block: B:38:0x0057  */
        /* JADX WARN: Code duplicated, block: B:50:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX INFO: renamed from: l */
        public void m221390l(T t, long j) throws Throwable {
            boolean z = true;
            try {
                try {
                    this.f207250e.onNext(t);
                } catch (Throwable th) {
                    try {
                        if (!this.f207251f) {
                            f5f.m119491e(th);
                            unsubscribe();
                            onError(th);
                            return;
                        }
                        m221393o().offer(th);
                    } catch (Throwable th2) {
                        th = th2;
                        z = false;
                        if (!z) {
                            synchronized (this) {
                                this.f207259n = false;
                            }
                        }
                        throw th;
                    }
                }
                if (j != Long.MAX_VALUE) {
                    this.f207253h.produced(1);
                }
                int i = this.f207267v + 1;
                if (i == this.f207266u) {
                    this.f207267v = 0;
                    m221399u(i);
                } else {
                    this.f207267v = i;
                }
                synchronized (this) {
                    try {
                        if (!this.f207260o) {
                            this.f207259n = false;
                        } else {
                            this.f207260o = false;
                            m221389k();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                if (!z) {
                    synchronized (this) {
                        this.f207259n = false;
                    }
                }
                throw th;
            }
        }

        /* JADX WARN: Code duplicated, block: B:35:0x004c  */
        /* JADX WARN: Code duplicated, block: B:43:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX INFO: renamed from: m */
        public void m221391m(C22332c<T> c22332c, T t, long j) throws Throwable {
            boolean z = true;
            try {
                try {
                    this.f207250e.onNext(t);
                } catch (Throwable th) {
                    try {
                        if (!this.f207251f) {
                            f5f.m119491e(th);
                            c22332c.unsubscribe();
                            c22332c.onError(th);
                            return;
                        }
                        m221393o().offer(th);
                    } catch (Throwable th2) {
                        th = th2;
                        z = false;
                        if (!z) {
                            synchronized (this) {
                                this.f207259n = false;
                            }
                        }
                        throw th;
                    }
                }
                if (j != Long.MAX_VALUE) {
                    this.f207253h.produced(1);
                }
                c22332c.m221384g(1L);
                synchronized (this) {
                    try {
                        if (!this.f207260o) {
                            this.f207259n = false;
                        } else {
                            this.f207260o = false;
                            m221389k();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                if (!z) {
                    synchronized (this) {
                        this.f207259n = false;
                    }
                }
                throw th;
            }
        }

        /* JADX INFO: renamed from: n */
        public bs5 m221392n() {
            bs5 bs5Var;
            boolean z;
            bs5 bs5Var2 = this.f207255j;
            if (bs5Var2 != null) {
                return bs5Var2;
            }
            synchronized (this) {
                try {
                    bs5Var = this.f207255j;
                    if (bs5Var == null) {
                        bs5Var = new bs5();
                        this.f207255j = bs5Var;
                        z = true;
                    } else {
                        z = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                m217046b(bs5Var);
            }
            return bs5Var;
        }

        /* JADX INFO: renamed from: o */
        public Queue<Throwable> m221393o() {
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue;
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue2 = this.f207256k;
            if (concurrentLinkedQueue2 != null) {
                return concurrentLinkedQueue2;
            }
            synchronized (this) {
                try {
                    concurrentLinkedQueue = this.f207256k;
                    if (concurrentLinkedQueue == null) {
                        concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
                        this.f207256k = concurrentLinkedQueue;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return concurrentLinkedQueue;
        }

        @Override // p149l.m250
        public void onCompleted() throws Throwable {
            this.f207258m = true;
            m221387i();
        }

        @Override // p149l.m250
        public void onError(Throwable th) throws Throwable {
            m221393o().offer(th);
            this.f207258m = true;
            m221387i();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p149l.m250
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void onNext(C22306c<? extends T> c22306c) throws Throwable {
            if (c22306c == null) {
                return;
            }
            if (c22306c == C22306c.empty()) {
                m221388j();
                return;
            }
            if (c22306c instanceof ScalarSynchronousObservable) {
                m221400v(((ScalarSynchronousObservable) c22306c).m221478c());
                return;
            }
            long j = this.f207263r;
            this.f207263r = 1 + j;
            C22332c c22332c = new C22332c(this, j);
            m221385g(c22332c);
            c22306c.unsafeSubscribe(c22332c);
            m221387i();
        }

        /* JADX INFO: renamed from: q */
        public void m221395q(T t) throws Throwable {
            Queue<Object> spscExactAtomicArrayQueue;
            Queue<Object> irf0Var = this.f207254i;
            if (irf0Var == null) {
                int i = this.f207252g;
                if (i == Integer.MAX_VALUE) {
                    irf0Var = new irf0<>(rjd0.f159670g);
                } else {
                    if (Pow2.isPowerOfTwo(i)) {
                        spscExactAtomicArrayQueue = UnsafeAccess.isUnsafeAvailable() ? new SpscArrayQueue<>(i) : new frf0<>(i);
                    } else {
                        spscExactAtomicArrayQueue = new SpscExactAtomicArrayQueue<>(i);
                    }
                    irf0Var = spscExactAtomicArrayQueue;
                }
                this.f207254i = irf0Var;
            }
            if (irf0Var.offer(this.f207257l.m221344j(t))) {
                m221387i();
            } else {
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(new MissingBackpressureException(), t));
            }
        }

        /* JADX INFO: renamed from: r */
        public void m221396r(C22332c<T> c22332c, T t) throws Throwable {
            rjd0 rjd0VarM179581b = c22332c.f207247h;
            if (rjd0VarM179581b == null) {
                rjd0VarM179581b = rjd0.m179581b();
                c22332c.m217046b(rjd0VarM179581b);
                c22332c.f207247h = rjd0VarM179581b;
            }
            try {
                rjd0VarM179581b.m179586g(this.f207257l.m221344j(t));
                m221387i();
            } catch (IllegalStateException e) {
                if (c22332c.isUnsubscribed()) {
                    return;
                }
                c22332c.unsubscribe();
                c22332c.onError(e);
            } catch (MissingBackpressureException e2) {
                c22332c.unsubscribe();
                c22332c.onError(e2);
            }
        }

        /* JADX INFO: renamed from: s */
        public void m221397s(C22332c<T> c22332c) {
            rjd0 rjd0Var = c22332c.f207247h;
            if (rjd0Var != null) {
                rjd0Var.m179589j();
            }
            this.f207255j.m103658d(c22332c);
            synchronized (this.f207261p) {
                try {
                    C22332c<?>[] c22332cArr = this.f207262q;
                    int length = c22332cArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        } else if (c22332c.equals(c22332cArr[i])) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i < 0) {
                        return;
                    }
                    if (length == 1) {
                        this.f207262q = f207249w;
                        return;
                    }
                    C22332c<?>[] c22332cArr2 = new C22332c[length - 1];
                    System.arraycopy(c22332cArr, 0, c22332cArr2, 0, i);
                    System.arraycopy(c22332cArr, i + 1, c22332cArr2, i, (length - i) - 1);
                    this.f207262q = c22332cArr2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: t */
        public final void m221398t() {
            ArrayList arrayList = new ArrayList(this.f207256k);
            int size = arrayList.size();
            z3g0<? super T> z3g0Var = this.f207250e;
            if (size == 1) {
                z3g0Var.onError((Throwable) arrayList.get(0));
            } else {
                z3g0Var.onError(new CompositeException(arrayList));
            }
        }

        /* JADX INFO: renamed from: u */
        public void m221399u(long j) {
            m217048e(j);
        }

        /* JADX INFO: renamed from: v */
        public void m221400v(T t) throws Throwable {
            long j = this.f207253h.get();
            boolean z = false;
            if (j != 0) {
                synchronized (this) {
                    try {
                        j = this.f207253h.get();
                        if (!this.f207259n && j != 0) {
                            z = true;
                            this.f207259n = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z) {
                m221390l(t, j);
            } else {
                m221395q(t);
            }
        }

        /* JADX INFO: renamed from: w */
        public void m221401w(C22332c<T> c22332c, T t) throws Throwable {
            long j = this.f207253h.get();
            boolean z = false;
            if (j != 0) {
                synchronized (this) {
                    try {
                        j = this.f207253h.get();
                        if (!this.f207259n && j != 0) {
                            z = true;
                            this.f207259n = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z) {
                m221391m(c22332c, t, j);
            } else {
                m221396r(c22332c, t);
            }
        }
    }

    public OperatorMerge(boolean z, int i) {
        this.f207241a = z;
        this.f207242b = i;
    }

    /* JADX INFO: renamed from: b */
    public static <T> OperatorMerge<T> m221381b(boolean z) {
        return z ? (OperatorMerge<T>) C22330a.INSTANCE : (OperatorMerge<T>) C22331b.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static <T> OperatorMerge<T> m221382c(boolean z, int i) {
        if (i > 0) {
            return i == Integer.MAX_VALUE ? m221381b(z) : new OperatorMerge<>(z, i);
        }
        k250.m144273a("maxConcurrent > 0 required but it was ", i);
        return null;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<C22306c<? extends T>> call(z3g0<? super T> z3g0Var) {
        C22333d c22333d = new C22333d(z3g0Var, this.f207241a, this.f207242b);
        MergeProducer<T> mergeProducer = new MergeProducer<>(c22333d);
        c22333d.f207253h = mergeProducer;
        z3g0Var.m217046b(c22333d);
        z3g0Var.mo106696f(mergeProducer);
        return c22333d;
    }
}
