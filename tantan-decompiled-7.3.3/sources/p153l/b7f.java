package p153l;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p137rx.internal.schedulers.C22471a;
import p137rx.internal.schedulers.ScheduledAction;

/* JADX INFO: loaded from: classes3.dex */
public final class b7f extends f2e0 {

    /* JADX INFO: renamed from: b */
    public final Executor f75284b;

    /* JADX INFO: renamed from: l.b7f$a */
    public static final class RunnableC15941a extends f2e0.AbstractC16877a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final Executor f75285a;

        /* JADX INFO: renamed from: c */
        public final ConcurrentLinkedQueue<ScheduledAction> f75287c = new ConcurrentLinkedQueue<>();

        /* JADX INFO: renamed from: d */
        public final AtomicInteger f75288d = new AtomicInteger();

        /* JADX INFO: renamed from: b */
        public final ft5 f75286b = new ft5();

        /* JADX INFO: renamed from: e */
        public final ScheduledExecutorService f75289e = C22471a.m222705a();

        /* JADX INFO: renamed from: l.b7f$a$a */
        public class a implements x20 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ mu10 f75290a;

            public a(mu10 mu10Var) {
                this.f75290a = mu10Var;
            }

            @Override // p153l.x20
            public void call() {
                RunnableC15941a.this.f75286b.m127300d(this.f75290a);
            }
        }

        /* JADX INFO: renamed from: l.b7f$a$b */
        public class b implements x20 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ mu10 f75292a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ x20 f75293b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ kcg0 f75294c;

            public b(mu10 mu10Var, x20 x20Var, kcg0 kcg0Var) {
                this.f75292a = mu10Var;
                this.f75293b = x20Var;
                this.f75294c = kcg0Var;
            }

            @Override // p153l.x20
            public void call() {
                if (this.f75292a.isUnsubscribed()) {
                    return;
                }
                kcg0 kcg0VarMo102836b = RunnableC15941a.this.mo102836b(this.f75293b);
                this.f75292a.m160064a(kcg0VarMo102836b);
                if (kcg0VarMo102836b.getClass() == ScheduledAction.class) {
                    ((ScheduledAction) kcg0VarMo102836b).add(this.f75294c);
                }
            }
        }

        public RunnableC15941a(Executor executor) {
            this.f75285a = executor;
        }

        @Override // p153l.f2e0.AbstractC16877a
        /* JADX INFO: renamed from: b */
        public kcg0 mo102836b(x20 x20Var) {
            if (isUnsubscribed()) {
                return pcg0.m171651d();
            }
            ScheduledAction scheduledAction = new ScheduledAction(x20Var, this.f75286b);
            this.f75286b.m127297a(scheduledAction);
            this.f75287c.offer(scheduledAction);
            if (this.f75288d.getAndIncrement() != 0) {
                return scheduledAction;
            }
            try {
                this.f75285a.execute(this);
                return scheduledAction;
            } catch (RejectedExecutionException e) {
                this.f75286b.m127300d(scheduledAction);
                this.f75288d.decrementAndGet();
                hrd0.m136792j(e);
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
        @Override // p153l.f2e0.AbstractC16877a
        /* JADX INFO: renamed from: c */
        public kcg0 mo102837c(x20 x20Var, long j, TimeUnit timeUnit) {
            if (j <= 0) {
                return mo102836b(x20Var);
            }
            if (isUnsubscribed()) {
                return pcg0.m171651d();
            }
            mu10 mu10Var = new mu10();
            mu10 mu10Var2 = new mu10();
            mu10Var2.m160064a(mu10Var);
            this.f75286b.m127297a(mu10Var2);
            kcg0 kcg0VarM171648a = pcg0.m171648a(new a(mu10Var2));
            ScheduledAction scheduledAction = new ScheduledAction(new b(mu10Var2, x20Var, kcg0VarM171648a));
            mu10Var.m160064a(scheduledAction);
            try {
                scheduledAction.add(this.f75289e.schedule(scheduledAction, j, timeUnit));
                return kcg0VarM171648a;
            } catch (RejectedExecutionException e) {
                hrd0.m136792j(e);
                throw e;
            }
        }

        @Override // p153l.kcg0
        public boolean isUnsubscribed() {
            return this.f75286b.isUnsubscribed();
        }

        @Override // java.lang.Runnable
        public void run() {
            do {
                boolean zIsUnsubscribed = this.f75286b.isUnsubscribed();
                ConcurrentLinkedQueue<ScheduledAction> concurrentLinkedQueue = this.f75287c;
                if (zIsUnsubscribed) {
                    concurrentLinkedQueue.clear();
                    return;
                }
                ScheduledAction scheduledActionPoll = concurrentLinkedQueue.poll();
                if (scheduledActionPoll == null) {
                    return;
                }
                if (!scheduledActionPoll.isUnsubscribed()) {
                    if (this.f75286b.isUnsubscribed()) {
                        this.f75287c.clear();
                        return;
                    }
                    scheduledActionPoll.run();
                }
            } while (this.f75288d.decrementAndGet() != 0);
        }

        @Override // p153l.kcg0
        public void unsubscribe() {
            this.f75286b.unsubscribe();
            this.f75287c.clear();
        }
    }

    public b7f(Executor executor) {
        this.f75284b = executor;
    }

    @Override // p153l.f2e0
    public f2e0.AbstractC16877a createWorker() {
        return new RunnableC15941a(this.f75284b);
    }
}
