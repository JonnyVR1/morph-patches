package p149l;

import Sudchar.Suddo;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import p133rx.C22306c;
import p133rx.internal.operators.NotificationLite;
import p133rx.internal.util.unsafe.SpscLinkedQueue;
import p133rx.internal.util.unsafe.UnsafeAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class vv50<R, T> implements C22306c.c<R, T> {

    /* JADX INFO: renamed from: c */
    public static final Object f183175c = new Object();

    /* JADX INFO: renamed from: a */
    public final v9j<R> f183176a;

    /* JADX INFO: renamed from: b */
    public final x9j<R, ? super T, R> f183177b;

    /* JADX INFO: renamed from: l.vv50$a */
    public class C20735a implements v9j<R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f183178a;

        public C20735a(Object obj) {
            this.f183178a = obj;
        }

        @Override // p149l.v9j, java.util.concurrent.Callable
        public R call() {
            return (R) this.f183178a;
        }
    }

    /* JADX INFO: renamed from: l.vv50$b */
    public class C20736b extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public boolean f183179e;

        /* JADX INFO: renamed from: f */
        public R f183180f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ z3g0 f183181g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20736b(z3g0 z3g0Var, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f183181g = z3g0Var2;
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f183181g.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f183181g.onError(th);
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
        @Override // p149l.m250
        public void onNext(T t) {
            if (this.f183179e) {
                try {
                    t = vv50.this.f183177b.call(this.f183180f, t);
                } catch (Throwable th) {
                    f5f.m119493g(th, this.f183181g, t);
                    return;
                }
            } else {
                this.f183179e = true;
            }
            this.f183180f = (R) t;
            this.f183181g.onNext(t);
        }
    }

    /* JADX INFO: renamed from: l.vv50$c */
    public class C20737c extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public R f183183e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Object f183184f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ C20738d f183185g;

        /* JADX WARN: Multi-variable type inference failed */
        public C20737c(Object obj, C20738d c20738d) {
            this.f183184f = obj;
            this.f183185g = c20738d;
            this.f183183e = obj;
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo106696f(rc90 rc90Var) {
            this.f183185g.m200180d(rc90Var);
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f183185g.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f183185g.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            try {
                R rCall = vv50.this.f183177b.call(this.f183183e, t);
                this.f183183e = rCall;
                this.f183185g.onNext(rCall);
            } catch (Throwable th) {
                f5f.m119493g(th, this, t);
            }
        }
    }

    /* JADX INFO: renamed from: l.vv50$d */
    public static final class C20738d<R> implements rc90, m250<R> {

        /* JADX INFO: renamed from: a */
        public final z3g0<? super R> f183187a;

        /* JADX INFO: renamed from: b */
        public final Queue<Object> f183188b;

        /* JADX INFO: renamed from: c */
        public boolean f183189c;

        /* JADX INFO: renamed from: d */
        public boolean f183190d;

        /* JADX INFO: renamed from: e */
        public long f183191e;

        /* JADX INFO: renamed from: f */
        public final AtomicLong f183192f;

        /* JADX INFO: renamed from: g */
        public volatile rc90 f183193g;

        /* JADX INFO: renamed from: h */
        public volatile boolean f183194h;

        /* JADX INFO: renamed from: i */
        public Throwable f183195i;

        public C20738d(R r, z3g0<? super R> z3g0Var) {
            this.f183187a = z3g0Var;
            Queue<Object> spscLinkedQueue = UnsafeAccess.isUnsafeAvailable() ? new SpscLinkedQueue<>() : new hrf0<>();
            this.f183188b = spscLinkedQueue;
            spscLinkedQueue.offer(NotificationLite.m221335f().m221344j(r));
            this.f183192f = new AtomicLong();
        }

        /* JADX INFO: renamed from: a */
        public boolean m200177a(boolean z, boolean z2, z3g0<? super R> z3g0Var) {
            if (z3g0Var.isUnsubscribed()) {
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.f183195i;
            if (th != null) {
                z3g0Var.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            z3g0Var.onCompleted();
            return true;
        }

        /* JADX INFO: renamed from: b */
        public void m200178b() {
            synchronized (this) {
                try {
                    if (this.f183189c) {
                        this.f183190d = true;
                    } else {
                        this.f183189c = true;
                        m200179c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m200179c() {
            z3g0<? super R> z3g0Var = this.f183187a;
            Queue<Object> queue = this.f183188b;
            NotificationLite notificationLiteM221335f = NotificationLite.m221335f();
            AtomicLong atomicLong = this.f183192f;
            long jM145343i = atomicLong.get();
            while (!m200177a(this.f183194h, queue.isEmpty(), z3g0Var)) {
                long j = 0;
                while (j != jM145343i) {
                    boolean z = this.f183194h;
                    Object objPoll = queue.poll();
                    boolean z2 = objPoll == null;
                    if (m200177a(z, z2, z3g0Var)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    Suddo suddo = (Object) notificationLiteM221335f.m221340e(objPoll);
                    try {
                        z3g0Var.onNext(suddo);
                        j++;
                    } catch (Throwable th) {
                        f5f.m119493g(th, z3g0Var, suddo);
                        return;
                    }
                }
                if (j != 0 && jM145343i != Long.MAX_VALUE) {
                    jM145343i = kc2.m145343i(atomicLong, j);
                }
                synchronized (this) {
                    try {
                        if (!this.f183190d) {
                            this.f183189c = false;
                            return;
                        }
                        this.f183190d = false;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public void m200180d(rc90 rc90Var) {
            long j;
            rc90Var.getClass();
            synchronized (this.f183192f) {
                if (this.f183193g != null) {
                    throw new IllegalStateException("Can't set more than one Producer!");
                }
                j = this.f183191e;
                if (j != Long.MAX_VALUE) {
                    j--;
                }
                this.f183191e = 0L;
                this.f183193g = rc90Var;
            }
            if (j > 0) {
                rc90Var.request(j);
            }
            m200178b();
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f183194h = true;
            m200178b();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f183195i = th;
            this.f183194h = true;
            m200178b();
        }

        @Override // p149l.m250
        public void onNext(R r) {
            this.f183188b.offer(NotificationLite.m221335f().m221344j(r));
            m200178b();
        }

        @Override // p149l.rc90
        public void request(long j) {
            if (j < 0) {
                y3g0.m212802a("n >= required but it was ", j);
                return;
            }
            if (j != 0) {
                kc2.m145336b(this.f183192f, j);
                rc90 rc90Var = this.f183193g;
                if (rc90Var == null) {
                    synchronized (this.f183192f) {
                        try {
                            rc90Var = this.f183193g;
                            if (rc90Var == null) {
                                this.f183191e = kc2.m145335a(this.f183191e, j);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (rc90Var != null) {
                    rc90Var.request(j);
                }
                m200178b();
            }
        }
    }

    public vv50(R r, x9j<R, ? super T, R> x9jVar) {
        this((v9j) new C20735a(r), (x9j) x9jVar);
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super R> z3g0Var) {
        R rCall = this.f183176a.call();
        if (rCall == f183175c) {
            return new C20736b(z3g0Var, z3g0Var);
        }
        C20738d c20738d = new C20738d(rCall, z3g0Var);
        C20737c c20737c = new C20737c(rCall, c20738d);
        z3g0Var.m217046b(c20737c);
        z3g0Var.mo106696f(c20738d);
        return c20737c;
    }

    public vv50(v9j<R> v9jVar, x9j<R, ? super T, R> x9jVar) {
        this.f183176a = v9jVar;
        this.f183177b = x9jVar;
    }

    public vv50(x9j<R, ? super T, R> x9jVar) {
        this(f183175c, x9jVar);
    }
}
