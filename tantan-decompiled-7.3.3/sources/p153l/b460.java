package p153l;

import Sudchar.Suddo;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import p137rx.C22421c;
import p137rx.internal.operators.NotificationLite;
import p137rx.internal.util.unsafe.SpscLinkedQueue;
import p137rx.internal.util.unsafe.UnsafeAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class b460<R, T> implements C22421c.c<R, T> {

    /* JADX INFO: renamed from: c */
    public static final Object f74862c = new Object();

    /* JADX INFO: renamed from: a */
    public final pcj<R> f74863a;

    /* JADX INFO: renamed from: b */
    public final rcj<R, ? super T, R> f74864b;

    /* JADX INFO: renamed from: l.b460$a */
    public class C15918a implements pcj<R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f74865a;

        public C15918a(Object obj) {
            this.f74865a = obj;
        }

        @Override // p153l.pcj, java.util.concurrent.Callable
        public R call() {
            return (R) this.f74865a;
        }
    }

    /* JADX INFO: renamed from: l.b460$b */
    public class C15919b extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public boolean f74866e;

        /* JADX INFO: renamed from: f */
        public R f74867f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ gcg0 f74868g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15919b(gcg0 gcg0Var, gcg0 gcg0Var2) {
            super(gcg0Var);
            this.f74868g = gcg0Var2;
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f74868g.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f74868g.onError(th);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p153l.bb50
        public void onNext(T t) {
            if (this.f74866e) {
                try {
                    t = b460.this.f74864b.call(this.f74867f, t);
                } catch (Throwable th) {
                    j6f.m143665g(th, this.f74868g, t);
                    return;
                }
            } else {
                this.f74866e = true;
            }
            this.f74867f = (R) t;
            this.f74868g.onNext(t);
        }
    }

    /* JADX INFO: renamed from: l.b460$c */
    public class C15920c extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public R f74870e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Object f74871f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ C15921d f74872g;

        /* JADX WARN: Multi-variable type inference failed */
        public C15920c(Object obj, C15921d c15921d) {
            this.f74871f = obj;
            this.f74872g = c15921d;
            this.f74870e = obj;
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: f */
        public void mo95773f(vk90 vk90Var) {
            this.f74872g.m102404d(vk90Var);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f74872g.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f74872g.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            try {
                R rCall = b460.this.f74864b.call(this.f74870e, t);
                this.f74870e = rCall;
                this.f74872g.onNext(rCall);
            } catch (Throwable th) {
                j6f.m143665g(th, this, t);
            }
        }
    }

    /* JADX INFO: renamed from: l.b460$d */
    public static final class C15921d<R> implements vk90, bb50<R> {

        /* JADX INFO: renamed from: a */
        public final gcg0<? super R> f74874a;

        /* JADX INFO: renamed from: b */
        public final Queue<Object> f74875b;

        /* JADX INFO: renamed from: c */
        public boolean f74876c;

        /* JADX INFO: renamed from: d */
        public boolean f74877d;

        /* JADX INFO: renamed from: e */
        public long f74878e;

        /* JADX INFO: renamed from: f */
        public final AtomicLong f74879f;

        /* JADX INFO: renamed from: g */
        public volatile vk90 f74880g;

        /* JADX INFO: renamed from: h */
        public volatile boolean f74881h;

        /* JADX INFO: renamed from: i */
        public Throwable f74882i;

        public C15921d(R r, gcg0<? super R> gcg0Var) {
            this.f74874a = gcg0Var;
            Queue<Object> spscLinkedQueue = UnsafeAccess.isUnsafeAvailable() ? new SpscLinkedQueue<>() : new qzf0<>();
            this.f74875b = spscLinkedQueue;
            spscLinkedQueue.offer(NotificationLite.m222581f().m222590j(r));
            this.f74879f = new AtomicLong();
        }

        /* JADX INFO: renamed from: a */
        public boolean m102401a(boolean z, boolean z2, gcg0<? super R> gcg0Var) {
            if (gcg0Var.isUnsubscribed()) {
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.f74882i;
            if (th != null) {
                gcg0Var.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            gcg0Var.onCompleted();
            return true;
        }

        /* JADX INFO: renamed from: b */
        public void m102402b() {
            synchronized (this) {
                try {
                    if (this.f74876c) {
                        this.f74877d = true;
                    } else {
                        this.f74876c = true;
                        m102403c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m102403c() {
            gcg0<? super R> gcg0Var = this.f74874a;
            Queue<Object> queue = this.f74875b;
            NotificationLite notificationLiteM222581f = NotificationLite.m222581f();
            AtomicLong atomicLong = this.f74879f;
            long jM180777i = atomicLong.get();
            while (!m102401a(this.f74881h, queue.isEmpty(), gcg0Var)) {
                long j = 0;
                while (j != jM180777i) {
                    boolean z = this.f74881h;
                    Object objPoll = queue.poll();
                    boolean z2 = objPoll == null;
                    if (m102401a(z, z2, gcg0Var)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    Suddo suddo = (Object) notificationLiteM222581f.m222586e(objPoll);
                    try {
                        gcg0Var.onNext(suddo);
                        j++;
                    } catch (Throwable th) {
                        j6f.m143665g(th, gcg0Var, suddo);
                        return;
                    }
                }
                if (j != 0 && jM180777i != Long.MAX_VALUE) {
                    jM180777i = rc2.m180777i(atomicLong, j);
                }
                synchronized (this) {
                    try {
                        if (!this.f74877d) {
                            this.f74876c = false;
                            return;
                        }
                        this.f74877d = false;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public void m102404d(vk90 vk90Var) {
            long j;
            vk90Var.getClass();
            synchronized (this.f74879f) {
                if (this.f74880g != null) {
                    throw new IllegalStateException("Can't set more than one Producer!");
                }
                j = this.f74878e;
                if (j != Long.MAX_VALUE) {
                    j--;
                }
                this.f74878e = 0L;
                this.f74880g = vk90Var;
            }
            if (j > 0) {
                vk90Var.request(j);
            }
            m102402b();
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f74881h = true;
            m102402b();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f74882i = th;
            this.f74881h = true;
            m102402b();
        }

        @Override // p153l.bb50
        public void onNext(R r) {
            this.f74875b.offer(NotificationLite.m222581f().m222590j(r));
            m102402b();
        }

        @Override // p153l.vk90
        public void request(long j) {
            if (j < 0) {
                fcg0.m125008a("n >= required but it was ", j);
                return;
            }
            if (j != 0) {
                rc2.m180770b(this.f74879f, j);
                vk90 vk90Var = this.f74880g;
                if (vk90Var == null) {
                    synchronized (this.f74879f) {
                        try {
                            vk90Var = this.f74880g;
                            if (vk90Var == null) {
                                this.f74878e = rc2.m180769a(this.f74878e, j);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (vk90Var != null) {
                    vk90Var.request(j);
                }
                m102402b();
            }
        }
    }

    public b460(R r, rcj<R, ? super T, R> rcjVar) {
        this((pcj) new C15918a(r), (rcj) rcjVar);
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super R> gcg0Var) {
        R rCall = this.f74863a.call();
        if (rCall == f74862c) {
            return new C15919b(gcg0Var, gcg0Var);
        }
        C15921d c15921d = new C15921d(rCall, gcg0Var);
        C15920c c15920c = new C15920c(rCall, c15921d);
        gcg0Var.m129866b(c15920c);
        gcg0Var.mo95773f(c15921d);
        return c15920c;
    }

    public b460(pcj<R> pcjVar, rcj<R, ? super T, R> rcjVar) {
        this.f74863a = pcjVar;
        this.f74864b = rcjVar;
    }

    public b460(rcj<R, ? super T, R> rcjVar) {
        this(f74862c, rcjVar);
    }
}
