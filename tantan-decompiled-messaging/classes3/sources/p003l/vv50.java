package p003l;

import android.R;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import p014rx.C1099c;
import p014rx.internal.operators.NotificationLite;
import p014rx.internal.util.unsafe.SpscLinkedQueue;
import p014rx.internal.util.unsafe.UnsafeAccess;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class vv50<R, T> implements C1099c.c<R, T> {

    /* JADX INFO: renamed from: c */
    public static final Object f8412c = new Object();

    /* JADX INFO: renamed from: a */
    public final v9j<R> f8413a;

    /* JADX INFO: renamed from: b */
    public final x9j<R, ? super T, R> f8414b;

    /* JADX INFO: renamed from: l.vv50$a */
    public class C0599a implements v9j<R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f8415a;

        public C0599a(Object obj) {
            this.f8415a = obj;
        }

        @Override // p003l.v9j, java.util.concurrent.Callable
        public R call() {
            return (R) this.f8415a;
        }
    }

    /* JADX INFO: renamed from: l.vv50$b */
    public class C0600b extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public boolean f8416e;

        /* JADX INFO: renamed from: f */
        public R f8417f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ z3g0 f8418g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0600b(z3g0 z3g0Var, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f8418g = z3g0Var2;
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f8418g.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f8418g.onError(th);
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
        @Override // p003l.m250
        public void onNext(T t) {
            if (this.f8416e) {
                try {
                    t = vv50.this.f8414b.call(this.f8417f, t);
                } catch (Throwable th) {
                    f5f.m3966g(th, this.f8418g, t);
                    return;
                }
            } else {
                this.f8416e = true;
            }
            this.f8417f = (R) t;
            this.f8418g.onNext(t);
        }
    }

    /* JADX INFO: renamed from: l.vv50$c */
    public class C0601c extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public R f8420e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Object f8421f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ C0602d f8422g;

        /* JADX WARN: Multi-variable type inference failed */
        public C0601c(Object obj, C0602d c0602d) {
            this.f8421f = obj;
            this.f8422g = c0602d;
            this.f8420e = obj;
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo3257f(rc90 rc90Var) {
            this.f8422g.m8410d(rc90Var);
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f8422g.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f8422g.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            try {
                R rCall = vv50.this.f8414b.call(this.f8420e, t);
                this.f8420e = rCall;
                this.f8422g.onNext(rCall);
            } catch (Throwable th) {
                f5f.m3966g(th, this, t);
            }
        }
    }

    /* JADX INFO: renamed from: l.vv50$d */
    public static final class C0602d<R> implements rc90, m250<R> {

        /* JADX INFO: renamed from: a */
        public final z3g0<? super R> f8424a;

        /* JADX INFO: renamed from: b */
        public final Queue<Object> f8425b;

        /* JADX INFO: renamed from: c */
        public boolean f8426c;

        /* JADX INFO: renamed from: d */
        public boolean f8427d;

        /* JADX INFO: renamed from: e */
        public long f8428e;

        /* JADX INFO: renamed from: f */
        public final AtomicLong f8429f;

        /* JADX INFO: renamed from: g */
        public volatile rc90 f8430g;

        /* JADX INFO: renamed from: h */
        public volatile boolean f8431h;

        /* JADX INFO: renamed from: i */
        public Throwable f8432i;

        public C0602d(R r, z3g0<? super R> z3g0Var) {
            this.f8424a = z3g0Var;
            Queue<Object> spscLinkedQueue = UnsafeAccess.isUnsafeAvailable() ? new SpscLinkedQueue<>() : new hrf0<>();
            this.f8425b = spscLinkedQueue;
            spscLinkedQueue.offer(NotificationLite.m9792f().m9801j(r));
            this.f8429f = new AtomicLong();
        }

        /* JADX INFO: renamed from: a */
        public boolean m8407a(boolean z, boolean z2, z3g0<? super R> z3g0Var) {
            if (z3g0Var.isUnsubscribed()) {
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.f8432i;
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
        public void m8408b() {
            synchronized (this) {
                try {
                    if (this.f8426c) {
                        this.f8427d = true;
                    } else {
                        this.f8426c = true;
                        m8409c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m8409c() {
            z3g0<? super R> z3g0Var = this.f8424a;
            Queue<Object> queue = this.f8425b;
            NotificationLite notificationLiteM9792f = NotificationLite.m9792f();
            AtomicLong atomicLong = this.f8429f;
            long jM5647i = atomicLong.get();
            while (!m8407a(this.f8431h, queue.isEmpty(), z3g0Var)) {
                long j = 0;
                while (j != jM5647i) {
                    boolean z = this.f8431h;
                    Object objPoll = queue.poll();
                    boolean z2 = objPoll == null;
                    if (m8407a(z, z2, z3g0Var)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    R.bool boolVar = (Object) notificationLiteM9792f.m9797e(objPoll);
                    try {
                        z3g0Var.onNext(boolVar);
                        j++;
                    } catch (Throwable th) {
                        f5f.m3966g(th, z3g0Var, boolVar);
                        return;
                    }
                }
                if (j != 0 && jM5647i != Long.MAX_VALUE) {
                    jM5647i = kc2.m5647i(atomicLong, j);
                }
                synchronized (this) {
                    try {
                        if (!this.f8427d) {
                            this.f8426c = false;
                            return;
                        }
                        this.f8427d = false;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public void m8410d(rc90 rc90Var) {
            long j;
            rc90Var.getClass();
            synchronized (this.f8429f) {
                if (this.f8430g != null) {
                    throw new IllegalStateException("Can't set more than one Producer!");
                }
                j = this.f8428e;
                if (j != Long.MAX_VALUE) {
                    j--;
                }
                this.f8428e = 0L;
                this.f8430g = rc90Var;
            }
            if (j > 0) {
                rc90Var.request(j);
            }
            m8408b();
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f8431h = true;
            m8408b();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f8432i = th;
            this.f8431h = true;
            m8408b();
        }

        @Override // p003l.m250
        public void onNext(R r) {
            this.f8425b.offer(NotificationLite.m9792f().m9801j(r));
            m8408b();
        }

        @Override // p003l.rc90
        public void request(long j) {
            if (j < 0) {
                y3g0.m8887a("n >= required but it was ", j);
                return;
            }
            if (j != 0) {
                kc2.m5640b(this.f8429f, j);
                rc90 rc90Var = this.f8430g;
                if (rc90Var == null) {
                    synchronized (this.f8429f) {
                        try {
                            rc90Var = this.f8430g;
                            if (rc90Var == null) {
                                this.f8428e = kc2.m5639a(this.f8428e, j);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (rc90Var != null) {
                    rc90Var.request(j);
                }
                m8408b();
            }
        }
    }

    public vv50(R r, x9j<R, ? super T, R> x9jVar) {
        this((v9j) new C0599a(r), (x9j) x9jVar);
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super R> z3g0Var) {
        R rCall = this.f8413a.call();
        if (rCall == f8412c) {
            return new C0600b(z3g0Var, z3g0Var);
        }
        C0602d c0602d = new C0602d(rCall, z3g0Var);
        C0601c c0601c = new C0601c(rCall, c0602d);
        z3g0Var.m9240b(c0601c);
        z3g0Var.mo3257f(c0602d);
        return c0601c;
    }

    public vv50(v9j<R> v9jVar, x9j<R, ? super T, R> x9jVar) {
        this.f8413a = v9jVar;
        this.f8414b = x9jVar;
    }

    public vv50(x9j<R, ? super T, R> x9jVar) {
        this(f8412c, x9jVar);
    }
}
