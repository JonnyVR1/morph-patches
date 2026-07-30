package p137rx.internal.operators;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import p137rx.C22421c;
import p137rx.exceptions.CompositeException;
import p137rx.exceptions.MissingBackpressureException;
import p137rx.exceptions.OnErrorThrowable;
import p137rx.internal.util.ScalarSynchronousObservable;
import p137rx.internal.util.atomic.SpscExactAtomicArrayQueue;
import p137rx.internal.util.unsafe.Pow2;
import p137rx.internal.util.unsafe.SpscArrayQueue;
import p137rx.internal.util.unsafe.UnsafeAccess;
import p153l.ft5;
import p153l.gcg0;
import p153l.j6f;
import p153l.ozf0;
import p153l.rc2;
import p153l.rzf0;
import p153l.urd0;
import p153l.vk90;
import p153l.wg3;
import p153l.za50;

/* JADX INFO: loaded from: classes3.dex */
public final class OperatorMerge<T> implements C22421c.c<T, C22421c<? extends T>> {

    /* JADX INFO: renamed from: a */
    public final boolean f208163a;

    /* JADX INFO: renamed from: b */
    public final int f208164b;

    public static final class MergeProducer<T> extends AtomicLong implements vk90 {
        private static final long serialVersionUID = -1214379189873595503L;
        final C22448d<T> subscriber;

        public MergeProducer(C22448d<T> c22448d) {
            this.subscriber = c22448d;
        }

        public long produced(int i) {
            return addAndGet(-i);
        }

        @Override // p153l.vk90
        public void request(long j) throws Throwable {
            if (j <= 0) {
                if (j >= 0) {
                    return;
                }
                wg3.m206174a("n >= 0 required");
            } else {
                if (get() == Long.MAX_VALUE) {
                    return;
                }
                rc2.m180770b(this, j);
                this.subscriber.m222633i();
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorMerge$a */
    public static final class C22445a {
        static final OperatorMerge<Object> INSTANCE = new OperatorMerge<>(true, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorMerge$b */
    public static final class C22446b {
        static final OperatorMerge<Object> INSTANCE = new OperatorMerge<>(false, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorMerge$c */
    public static final class C22447c<T> extends gcg0<T> {

        /* JADX INFO: renamed from: j */
        public static final int f208165j = urd0.f180601g / 4;

        /* JADX INFO: renamed from: e */
        public final C22448d<T> f208166e;

        /* JADX INFO: renamed from: f */
        public final long f208167f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f208168g;

        /* JADX INFO: renamed from: h */
        public volatile urd0 f208169h;

        /* JADX INFO: renamed from: i */
        public int f208170i;

        public C22447c(C22448d<T> c22448d, long j) {
            this.f208166e = c22448d;
            this.f208167f = j;
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: d */
        public void mo95884d() {
            int i = urd0.f180601g;
            this.f208170i = i;
            m129868e(i);
        }

        /* JADX INFO: renamed from: g */
        public void m222630g(long j) {
            int i = this.f208170i - ((int) j);
            if (i > f208165j) {
                this.f208170i = i;
                return;
            }
            int i2 = urd0.f180601g;
            this.f208170i = i2;
            int i3 = i2 - i;
            if (i3 > 0) {
                m129868e(i3);
            }
        }

        @Override // p153l.bb50
        public void onCompleted() throws Throwable {
            this.f208168g = true;
            this.f208166e.m222633i();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) throws Throwable {
            this.f208168g = true;
            this.f208166e.m222639o().offer(th);
            this.f208166e.m222633i();
        }

        @Override // p153l.bb50
        public void onNext(T t) throws Throwable {
            this.f208166e.m222647w(this, t);
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorMerge$d */
    public static final class C22448d<T> extends gcg0<C22421c<? extends T>> {

        /* JADX INFO: renamed from: w */
        public static final C22447c<?>[] f208171w = new C22447c[0];

        /* JADX INFO: renamed from: e */
        public final gcg0<? super T> f208172e;

        /* JADX INFO: renamed from: f */
        public final boolean f208173f;

        /* JADX INFO: renamed from: g */
        public final int f208174g;

        /* JADX INFO: renamed from: h */
        public MergeProducer<T> f208175h;

        /* JADX INFO: renamed from: i */
        public volatile Queue<Object> f208176i;

        /* JADX INFO: renamed from: j */
        public volatile ft5 f208177j;

        /* JADX INFO: renamed from: k */
        public volatile ConcurrentLinkedQueue<Throwable> f208178k;

        /* JADX INFO: renamed from: m */
        public volatile boolean f208180m;

        /* JADX INFO: renamed from: n */
        public boolean f208181n;

        /* JADX INFO: renamed from: o */
        public boolean f208182o;

        /* JADX INFO: renamed from: r */
        public long f208185r;

        /* JADX INFO: renamed from: s */
        public long f208186s;

        /* JADX INFO: renamed from: t */
        public int f208187t;

        /* JADX INFO: renamed from: u */
        public final int f208188u;

        /* JADX INFO: renamed from: v */
        public int f208189v;

        /* JADX INFO: renamed from: l */
        public final NotificationLite<T> f208179l = NotificationLite.m222581f();

        /* JADX INFO: renamed from: p */
        public final Object f208183p = new Object();

        /* JADX INFO: renamed from: q */
        public volatile C22447c<?>[] f208184q = f208171w;

        public C22448d(gcg0<? super T> gcg0Var, boolean z, int i) {
            this.f208172e = gcg0Var;
            this.f208173f = z;
            this.f208174g = i;
            if (i == Integer.MAX_VALUE) {
                this.f208188u = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                m129868e(Long.MAX_VALUE);
            } else {
                this.f208188u = Math.max(1, i >> 1);
                m129868e(i);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: g */
        public void m222631g(C22447c<T> c22447c) {
            m222638n().m127297a(c22447c);
            synchronized (this.f208183p) {
                C22447c<?>[] c22447cArr = this.f208184q;
                int length = c22447cArr.length;
                C22447c<?>[] c22447cArr2 = new C22447c[length + 1];
                System.arraycopy(c22447cArr, 0, c22447cArr2, 0, length);
                c22447cArr2[length] = c22447c;
                this.f208184q = c22447cArr2;
            }
        }

        /* JADX INFO: renamed from: h */
        public boolean m222632h() {
            if (this.f208172e.isUnsubscribed()) {
                return true;
            }
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue = this.f208178k;
            if (this.f208173f || concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
                return false;
            }
            try {
                m222644t();
                return true;
            } finally {
                unsubscribe();
            }
        }

        /* JADX INFO: renamed from: i */
        public void m222633i() throws Throwable {
            synchronized (this) {
                try {
                    if (this.f208181n) {
                        this.f208182o = true;
                    } else {
                        this.f208181n = true;
                        m222635k();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public void m222634j() {
            int i = this.f208189v + 1;
            if (i != this.f208188u) {
                this.f208189v = i;
            } else {
                this.f208189v = 0;
                m222645u(i);
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
        */
        public void m222635k() throws Throwable {
            boolean z;
            long jProduced;
            int i;
            boolean z2;
            long j;
            int i2;
            C22447c<?> c22447c;
            Object objM197512i;
            int i3;
            boolean z3;
            urd0 urd0Var;
            try {
                gcg0<? super T> gcg0Var = this.f208172e;
                while (!m222632h()) {
                    Queue<Object> queue = this.f208176i;
                    long j2 = this.f208175h.get();
                    boolean z4 = j2 == Long.MAX_VALUE;
                    if (queue != null) {
                        int i4 = 0;
                        while (true) {
                            jProduced = j2;
                            i = i4;
                            int i5 = 0;
                            Object obj = null;
                            while (jProduced > 0) {
                                Object objPoll = queue.poll();
                                if (m222632h()) {
                                    return;
                                }
                                if (objPoll == null) {
                                    obj = objPoll;
                                    break;
                                }
                                try {
                                    gcg0Var.onNext(this.f208179l.m222586e(objPoll));
                                } catch (Throwable th) {
                                    if (!this.f208173f) {
                                        j6f.m143663e(th);
                                        unsubscribe();
                                        gcg0Var.onError(th);
                                        return;
                                    }
                                    m222639o().offer(th);
                                }
                                i++;
                                i5++;
                                jProduced--;
                                obj = objPoll;
                                th = th;
                                z = true;
                                if (!z) {
                                    synchronized (this) {
                                        this.f208181n = false;
                                    }
                                }
                                throw th;
                            }
                            if (i5 > 0) {
                                jProduced = z4 ? Long.MAX_VALUE : this.f208175h.produced(i5);
                            }
                            if (jProduced == 0 || obj == null) {
                                break;
                                break;
                            } else {
                                i4 = i;
                                j2 = jProduced;
                            }
                        }
                    } else {
                        jProduced = j2;
                        i = 0;
                    }
                    boolean z5 = this.f208180m;
                    Queue<Object> queue2 = this.f208176i;
                    C22447c<?>[] c22447cArr = this.f208184q;
                    int length = c22447cArr.length;
                    if (z5 && ((queue2 == null || queue2.isEmpty()) && length == 0)) {
                        ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue = this.f208178k;
                        if (concurrentLinkedQueue != null && !concurrentLinkedQueue.isEmpty()) {
                            m222644t();
                            return;
                        }
                        gcg0Var.onCompleted();
                        return;
                    }
                    if (length > 0) {
                        boolean z6 = z4;
                        long j3 = this.f208186s;
                        int i6 = this.f208187t;
                        if (length > i6) {
                            j = 1;
                            if (c22447cArr[i6].f208167f == j3) {
                                z2 = false;
                                for (i2 = 0; i2 < length; i2++) {
                                    if (m222632h()) {
                                        return;
                                    }
                                    c22447c = c22447cArr[i6];
                                    objM197512i = null;
                                    do {
                                        i3 = 0;
                                        while (jProduced > 0) {
                                            if (m222632h()) {
                                                return;
                                            }
                                            urd0Var = c22447c.f208169h;
                                            if (urd0Var != null || (objM197512i = urd0Var.m197512i()) == null) {
                                                break;
                                                break;
                                            }
                                            try {
                                                try {
                                                    gcg0Var.onNext(this.f208179l.m222586e(objM197512i));
                                                    jProduced -= j;
                                                    i3++;
                                                } catch (Throwable th2) {
                                                    j6f.m143663e(th2);
                                                    try {
                                                        gcg0Var.onError(th2);
                                                        return;
                                                    } finally {
                                                        unsubscribe();
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                z = true;
                                            }
                                        }
                                        if (i3 > 0) {
                                            if (z6) {
                                                jProduced = Long.MAX_VALUE;
                                            } else {
                                                jProduced = this.f208175h.produced(i3);
                                            }
                                            c22447c.m222630g(i3);
                                        }
                                        if (jProduced != 0) {
                                            break;
                                        }
                                    } while (objM197512i != null);
                                    z3 = c22447c.f208168g;
                                    urd0 urd0Var2 = c22447c.f208169h;
                                    if (z3 && (urd0Var2 == null || urd0Var2.m197508e())) {
                                        m222643s(c22447c);
                                        if (m222632h()) {
                                            return;
                                        }
                                        i++;
                                        z2 = true;
                                    }
                                    if (jProduced == 0) {
                                        break;
                                    }
                                    i6++;
                                    if (i6 == length) {
                                        i6 = 0;
                                    }
                                }
                                this.f208187t = i6;
                                this.f208186s = c22447cArr[i6].f208167f;
                            }
                            th = th3;
                            z = true;
                            if (!z) {
                                synchronized (this) {
                                    this.f208181n = false;
                                }
                            }
                            throw th;
                        }
                        j = 1;
                        if (length <= i6) {
                            i6 = 0;
                        }
                        for (int i7 = 0; i7 < length && c22447cArr[i6].f208167f != j3; i7++) {
                            i6++;
                            if (i6 == length) {
                                i6 = 0;
                            }
                        }
                        this.f208187t = i6;
                        this.f208186s = c22447cArr[i6].f208167f;
                        z2 = false;
                        while (i2 < length) {
                            if (m222632h()) {
                                return;
                            }
                            c22447c = c22447cArr[i6];
                            objM197512i = null;
                            do {
                                i3 = 0;
                                while (jProduced > 0) {
                                    if (m222632h()) {
                                        return;
                                    }
                                    urd0Var = c22447c.f208169h;
                                    if (urd0Var != null) {
                                        break;
                                    }
                                    gcg0Var.onNext(this.f208179l.m222586e(objM197512i));
                                    jProduced -= j;
                                    i3++;
                                }
                                if (i3 > 0) {
                                    if (z6) {
                                        jProduced = this.f208175h.produced(i3);
                                    } else {
                                        jProduced = Long.MAX_VALUE;
                                    }
                                    c22447c.m222630g(i3);
                                }
                                if (jProduced != 0) {
                                    break;
                                    break;
                                }
                            } while (objM197512i != null);
                            z3 = c22447c.f208168g;
                            urd0 urd0Var3 = c22447c.f208169h;
                            if (z3) {
                                m222643s(c22447c);
                                if (m222632h()) {
                                    return;
                                }
                                i++;
                                z2 = true;
                            }
                            if (jProduced == 0) {
                                break;
                                break;
                            }
                            i6++;
                            if (i6 == length) {
                                i6 = 0;
                            }
                        }
                        this.f208187t = i6;
                        this.f208186s = c22447cArr[i6].f208167f;
                    } else {
                        z2 = false;
                    }
                    if (i > 0) {
                        m129868e(i);
                    }
                    if (!z2) {
                        try {
                            synchronized (this) {
                                try {
                                    if (this.f208182o) {
                                        this.f208182o = false;
                                    } else {
                                        try {
                                            this.f208181n = false;
                                            return;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            z = true;
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    z = false;
                                }
                                while (true) {
                                }
                                throw th;
                            }
                            throw th;
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                z = false;
            }
        }

        /* JADX WARN: Code duplicated, block: B:38:0x0057  */
        /* JADX WARN: Code duplicated, block: B:50:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX INFO: renamed from: l */
        public void m222636l(T t, long j) throws Throwable {
            boolean z = true;
            try {
                try {
                    this.f208172e.onNext(t);
                } catch (Throwable th) {
                    try {
                        if (!this.f208173f) {
                            j6f.m143663e(th);
                            unsubscribe();
                            onError(th);
                            return;
                        }
                        m222639o().offer(th);
                    } catch (Throwable th2) {
                        th = th2;
                        z = false;
                        if (!z) {
                            synchronized (this) {
                                this.f208181n = false;
                            }
                        }
                        throw th;
                    }
                }
                if (j != Long.MAX_VALUE) {
                    this.f208175h.produced(1);
                }
                int i = this.f208189v + 1;
                if (i == this.f208188u) {
                    this.f208189v = 0;
                    m222645u(i);
                } else {
                    this.f208189v = i;
                }
                synchronized (this) {
                    try {
                        if (!this.f208182o) {
                            this.f208181n = false;
                        } else {
                            this.f208182o = false;
                            m222635k();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                if (!z) {
                    synchronized (this) {
                        this.f208181n = false;
                    }
                }
                throw th;
            }
        }

        /* JADX WARN: Code duplicated, block: B:35:0x004c  */
        /* JADX WARN: Code duplicated, block: B:43:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX INFO: renamed from: m */
        public void m222637m(C22447c<T> c22447c, T t, long j) throws Throwable {
            boolean z = true;
            try {
                try {
                    this.f208172e.onNext(t);
                } catch (Throwable th) {
                    try {
                        if (!this.f208173f) {
                            j6f.m143663e(th);
                            c22447c.unsubscribe();
                            c22447c.onError(th);
                            return;
                        }
                        m222639o().offer(th);
                    } catch (Throwable th2) {
                        th = th2;
                        z = false;
                        if (!z) {
                            synchronized (this) {
                                this.f208181n = false;
                            }
                        }
                        throw th;
                    }
                }
                if (j != Long.MAX_VALUE) {
                    this.f208175h.produced(1);
                }
                c22447c.m222630g(1L);
                synchronized (this) {
                    try {
                        if (!this.f208182o) {
                            this.f208181n = false;
                        } else {
                            this.f208182o = false;
                            m222635k();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                if (!z) {
                    synchronized (this) {
                        this.f208181n = false;
                    }
                }
                throw th;
            }
        }

        /* JADX INFO: renamed from: n */
        public ft5 m222638n() {
            ft5 ft5Var;
            boolean z;
            ft5 ft5Var2 = this.f208177j;
            if (ft5Var2 != null) {
                return ft5Var2;
            }
            synchronized (this) {
                try {
                    ft5Var = this.f208177j;
                    if (ft5Var == null) {
                        ft5Var = new ft5();
                        this.f208177j = ft5Var;
                        z = true;
                    } else {
                        z = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                m129866b(ft5Var);
            }
            return ft5Var;
        }

        /* JADX INFO: renamed from: o */
        public Queue<Throwable> m222639o() {
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue;
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue2 = this.f208178k;
            if (concurrentLinkedQueue2 != null) {
                return concurrentLinkedQueue2;
            }
            synchronized (this) {
                try {
                    concurrentLinkedQueue = this.f208178k;
                    if (concurrentLinkedQueue == null) {
                        concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
                        this.f208178k = concurrentLinkedQueue;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return concurrentLinkedQueue;
        }

        @Override // p153l.bb50
        public void onCompleted() throws Throwable {
            this.f208180m = true;
            m222633i();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) throws Throwable {
            m222639o().offer(th);
            this.f208180m = true;
            m222633i();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p153l.bb50
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void onNext(C22421c<? extends T> c22421c) throws Throwable {
            if (c22421c == null) {
                return;
            }
            if (c22421c == C22421c.empty()) {
                m222634j();
                return;
            }
            if (c22421c instanceof ScalarSynchronousObservable) {
                m222646v(((ScalarSynchronousObservable) c22421c).m222724c());
                return;
            }
            long j = this.f208185r;
            this.f208185r = 1 + j;
            C22447c c22447c = new C22447c(this, j);
            m222631g(c22447c);
            c22421c.unsafeSubscribe(c22447c);
            m222633i();
        }

        /* JADX INFO: renamed from: q */
        public void m222641q(T t) throws Throwable {
            Queue<Object> spscExactAtomicArrayQueue;
            Queue<Object> rzf0Var = this.f208176i;
            if (rzf0Var == null) {
                int i = this.f208174g;
                if (i == Integer.MAX_VALUE) {
                    rzf0Var = new rzf0<>(urd0.f180601g);
                } else {
                    if (Pow2.isPowerOfTwo(i)) {
                        spscExactAtomicArrayQueue = UnsafeAccess.isUnsafeAvailable() ? new SpscArrayQueue<>(i) : new ozf0<>(i);
                    } else {
                        spscExactAtomicArrayQueue = new SpscExactAtomicArrayQueue<>(i);
                    }
                    rzf0Var = spscExactAtomicArrayQueue;
                }
                this.f208176i = rzf0Var;
            }
            if (rzf0Var.offer(this.f208179l.m222590j(t))) {
                m222633i();
            } else {
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(new MissingBackpressureException(), t));
            }
        }

        /* JADX INFO: renamed from: r */
        public void m222642r(C22447c<T> c22447c, T t) throws Throwable {
            urd0 urd0VarM197505b = c22447c.f208169h;
            if (urd0VarM197505b == null) {
                urd0VarM197505b = urd0.m197505b();
                c22447c.m129866b(urd0VarM197505b);
                c22447c.f208169h = urd0VarM197505b;
            }
            try {
                urd0VarM197505b.m197510g(this.f208179l.m222590j(t));
                m222633i();
            } catch (IllegalStateException e) {
                if (c22447c.isUnsubscribed()) {
                    return;
                }
                c22447c.unsubscribe();
                c22447c.onError(e);
            } catch (MissingBackpressureException e2) {
                c22447c.unsubscribe();
                c22447c.onError(e2);
            }
        }

        /* JADX INFO: renamed from: s */
        public void m222643s(C22447c<T> c22447c) {
            urd0 urd0Var = c22447c.f208169h;
            if (urd0Var != null) {
                urd0Var.m197513j();
            }
            this.f208177j.m127300d(c22447c);
            synchronized (this.f208183p) {
                try {
                    C22447c<?>[] c22447cArr = this.f208184q;
                    int length = c22447cArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        } else if (c22447c.equals(c22447cArr[i])) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i < 0) {
                        return;
                    }
                    if (length == 1) {
                        this.f208184q = f208171w;
                        return;
                    }
                    C22447c<?>[] c22447cArr2 = new C22447c[length - 1];
                    System.arraycopy(c22447cArr, 0, c22447cArr2, 0, i);
                    System.arraycopy(c22447cArr, i + 1, c22447cArr2, i, (length - i) - 1);
                    this.f208184q = c22447cArr2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: t */
        public final void m222644t() {
            ArrayList arrayList = new ArrayList(this.f208178k);
            int size = arrayList.size();
            gcg0<? super T> gcg0Var = this.f208172e;
            if (size == 1) {
                gcg0Var.onError((Throwable) arrayList.get(0));
            } else {
                gcg0Var.onError(new CompositeException(arrayList));
            }
        }

        /* JADX INFO: renamed from: u */
        public void m222645u(long j) {
            m129868e(j);
        }

        /* JADX INFO: renamed from: v */
        public void m222646v(T t) throws Throwable {
            long j = this.f208175h.get();
            boolean z = false;
            if (j != 0) {
                synchronized (this) {
                    try {
                        j = this.f208175h.get();
                        if (!this.f208181n && j != 0) {
                            z = true;
                            this.f208181n = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z) {
                m222636l(t, j);
            } else {
                m222641q(t);
            }
        }

        /* JADX INFO: renamed from: w */
        public void m222647w(C22447c<T> c22447c, T t) throws Throwable {
            long j = this.f208175h.get();
            boolean z = false;
            if (j != 0) {
                synchronized (this) {
                    try {
                        j = this.f208175h.get();
                        if (!this.f208181n && j != 0) {
                            z = true;
                            this.f208181n = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z) {
                m222637m(c22447c, t, j);
            } else {
                m222642r(c22447c, t);
            }
        }
    }

    public OperatorMerge(boolean z, int i) {
        this.f208163a = z;
        this.f208164b = i;
    }

    /* JADX INFO: renamed from: b */
    public static <T> OperatorMerge<T> m222627b(boolean z) {
        return z ? (OperatorMerge<T>) C22445a.INSTANCE : (OperatorMerge<T>) C22446b.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static <T> OperatorMerge<T> m222628c(boolean z, int i) {
        if (i > 0) {
            return i == Integer.MAX_VALUE ? m222627b(z) : new OperatorMerge<>(z, i);
        }
        za50.m219101a("maxConcurrent > 0 required but it was ", i);
        return null;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<C22421c<? extends T>> call(gcg0<? super T> gcg0Var) {
        C22448d c22448d = new C22448d(gcg0Var, this.f208163a, this.f208164b);
        MergeProducer<T> mergeProducer = new MergeProducer<>(c22448d);
        c22448d.f208175h = mergeProducer;
        gcg0Var.m129866b(c22448d);
        gcg0Var.mo95773f(mergeProducer);
        return c22448d;
    }
}
