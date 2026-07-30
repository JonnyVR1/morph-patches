package p149l;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p133rx.internal.schedulers.C22356a;
import p133rx.internal.schedulers.ScheduledAction;

/* JADX INFO: loaded from: classes3.dex */
public final class v5f extends bud0 {

    /* JADX INFO: renamed from: b */
    public final Executor f180026b;

    /* JADX INFO: renamed from: l.v5f$a */
    public static final class RunnableC20580a extends bud0.AbstractC15976a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final Executor f180027a;

        /* JADX INFO: renamed from: c */
        public final ConcurrentLinkedQueue<ScheduledAction> f180029c = new ConcurrentLinkedQueue<>();

        /* JADX INFO: renamed from: d */
        public final AtomicInteger f180030d = new AtomicInteger();

        /* JADX INFO: renamed from: b */
        public final bs5 f180028b = new bs5();

        /* JADX INFO: renamed from: e */
        public final ScheduledExecutorService f180031e = C22356a.m221459a();

        /* JADX INFO: renamed from: l.v5f$a$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ em10 f180032a;

            public a(em10 em10Var) {
                this.f180032a = em10Var;
            }

            @Override // p149l.d30
            public void call() {
                RunnableC20580a.this.f180028b.m103658d(this.f180032a);
            }
        }

        /* JADX INFO: renamed from: l.v5f$a$b */
        public class b implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ em10 f180034a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ d30 f180035b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ c4g0 f180036c;

            public b(em10 em10Var, d30 d30Var, c4g0 c4g0Var) {
                this.f180034a = em10Var;
                this.f180035b = d30Var;
                this.f180036c = c4g0Var;
            }

            @Override // p149l.d30
            public void call() {
                if (this.f180034a.isUnsubscribed()) {
                    return;
                }
                c4g0 c4g0VarMo99201b = RunnableC20580a.this.mo99201b(this.f180035b);
                this.f180034a.m117195a(c4g0VarMo99201b);
                if (c4g0VarMo99201b.getClass() == ScheduledAction.class) {
                    ((ScheduledAction) c4g0VarMo99201b).add(this.f180036c);
                }
            }
        }

        public RunnableC20580a(Executor executor) {
            this.f180027a = executor;
        }

        @Override // p149l.bud0.AbstractC15976a
        /* JADX INFO: renamed from: b */
        public c4g0 mo99201b(d30 d30Var) {
            if (isUnsubscribed()) {
                return h4g0.m129243d();
            }
            ScheduledAction scheduledAction = new ScheduledAction(d30Var, this.f180028b);
            this.f180028b.m103655a(scheduledAction);
            this.f180029c.offer(scheduledAction);
            if (this.f180030d.getAndIncrement() != 0) {
                return scheduledAction;
            }
            try {
                this.f180027a.execute(this);
                return scheduledAction;
            } catch (RejectedExecutionException e) {
                this.f180028b.m103658d(scheduledAction);
                this.f180030d.decrementAndGet();
                ejd0.m116793j(e);
                throw e;
            }
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
        @Override // p149l.bud0.AbstractC15976a
        /* JADX INFO: renamed from: c */
        public c4g0 mo99202c(d30 d30Var, long j, TimeUnit timeUnit) {
            if (j <= 0) {
                return mo99201b(d30Var);
            }
            if (isUnsubscribed()) {
                return h4g0.m129243d();
            }
            em10 em10Var = new em10();
            em10 em10Var2 = new em10();
            em10Var2.m117195a(em10Var);
            this.f180028b.m103655a(em10Var2);
            c4g0 c4g0VarM129240a = h4g0.m129240a(new a(em10Var2));
            ScheduledAction scheduledAction = new ScheduledAction(new b(em10Var2, d30Var, c4g0VarM129240a));
            em10Var.m117195a(scheduledAction);
            try {
                scheduledAction.add(this.f180031e.schedule(scheduledAction, j, timeUnit));
                return c4g0VarM129240a;
            } catch (RejectedExecutionException e) {
                ejd0.m116793j(e);
                throw e;
            }
        }

        @Override // p149l.c4g0
        public boolean isUnsubscribed() {
            return this.f180028b.isUnsubscribed();
        }

        @Override // java.lang.Runnable
        public void run() {
            do {
                boolean zIsUnsubscribed = this.f180028b.isUnsubscribed();
                ConcurrentLinkedQueue<ScheduledAction> concurrentLinkedQueue = this.f180029c;
                if (zIsUnsubscribed) {
                    concurrentLinkedQueue.clear();
                    return;
                }
                ScheduledAction scheduledActionPoll = concurrentLinkedQueue.poll();
                if (scheduledActionPoll == null) {
                    return;
                }
                if (!scheduledActionPoll.isUnsubscribed()) {
                    if (this.f180028b.isUnsubscribed()) {
                        this.f180029c.clear();
                        return;
                    }
                    scheduledActionPoll.run();
                }
            } while (this.f180030d.decrementAndGet() != 0);
        }

        @Override // p149l.c4g0
        public void unsubscribe() {
            this.f180028b.unsubscribe();
            this.f180029c.clear();
        }
    }

    public v5f(Executor executor) {
        this.f180026b = executor;
    }

    @Override // p149l.bud0
    public bud0.AbstractC15976a createWorker() {
        return new RunnableC20580a(this.f180026b);
    }
}
