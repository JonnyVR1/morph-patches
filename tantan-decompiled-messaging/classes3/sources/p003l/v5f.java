package p003l;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p014rx.internal.schedulers.C1149a;
import p014rx.internal.schedulers.ScheduledAction;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class v5f extends bud0 {

    /* JADX INFO: renamed from: b */
    public final Executor f8208b;

    /* JADX INFO: renamed from: l.v5f$a */
    public static final class RunnableC0597a extends bud0.AbstractC0185a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final Executor f8209a;

        /* JADX INFO: renamed from: c */
        public final ConcurrentLinkedQueue<ScheduledAction> f8211c = new ConcurrentLinkedQueue<>();

        /* JADX INFO: renamed from: d */
        public final AtomicInteger f8212d = new AtomicInteger();

        /* JADX INFO: renamed from: b */
        public final bs5 f8210b = new bs5();

        /* JADX INFO: renamed from: e */
        public final ScheduledExecutorService f8213e = C1149a.m9916a();

        /* JADX INFO: renamed from: l.v5f$a$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ em10 f8214a;

            public a(em10 em10Var) {
                this.f8214a = em10Var;
            }

            @Override // p003l.d30
            public void call() {
                RunnableC0597a.this.f8210b.m3167d(this.f8214a);
            }
        }

        /* JADX INFO: renamed from: l.v5f$a$b */
        public class b implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ em10 f8216a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ d30 f8217b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ c4g0 f8218c;

            public b(em10 em10Var, d30 d30Var, c4g0 c4g0Var) {
                this.f8216a = em10Var;
                this.f8217b = d30Var;
                this.f8218c = c4g0Var;
            }

            @Override // p003l.d30
            public void call() {
                if (this.f8216a.isUnsubscribed()) {
                    return;
                }
                c4g0 c4g0VarMo2914b = RunnableC0597a.this.mo2914b(this.f8217b);
                this.f8216a.m3901a(c4g0VarMo2914b);
                if (c4g0VarMo2914b.getClass() == ScheduledAction.class) {
                    ((ScheduledAction) c4g0VarMo2914b).add(this.f8218c);
                }
            }
        }

        public RunnableC0597a(Executor executor) {
            this.f8209a = executor;
        }

        @Override // p003l.bud0.AbstractC0185a
        /* JADX INFO: renamed from: b */
        public c4g0 mo2914b(d30 d30Var) {
            if (isUnsubscribed()) {
                return h4g0.m4917d();
            }
            ScheduledAction scheduledAction = new ScheduledAction(d30Var, this.f8210b);
            this.f8210b.m3164a(scheduledAction);
            this.f8211c.offer(scheduledAction);
            if (this.f8212d.getAndIncrement() != 0) {
                return scheduledAction;
            }
            try {
                this.f8209a.execute(this);
                return scheduledAction;
            } catch (RejectedExecutionException e) {
                this.f8210b.m3167d(scheduledAction);
                this.f8212d.decrementAndGet();
                ejd0.m3864j(e);
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
        @Override // p003l.bud0.AbstractC0185a
        /* JADX INFO: renamed from: c */
        public c4g0 mo2915c(d30 d30Var, long j, TimeUnit timeUnit) {
            if (j <= 0) {
                return mo2914b(d30Var);
            }
            if (isUnsubscribed()) {
                return h4g0.m4917d();
            }
            em10 em10Var = new em10();
            em10 em10Var2 = new em10();
            em10Var2.m3901a(em10Var);
            this.f8210b.m3164a(em10Var2);
            c4g0 c4g0VarM4914a = h4g0.m4914a(new a(em10Var2));
            ScheduledAction scheduledAction = new ScheduledAction(new b(em10Var2, d30Var, c4g0VarM4914a));
            em10Var.m3901a(scheduledAction);
            try {
                scheduledAction.add(this.f8213e.schedule(scheduledAction, j, timeUnit));
                return c4g0VarM4914a;
            } catch (RejectedExecutionException e) {
                ejd0.m3864j(e);
                throw e;
            }
        }

        @Override // p003l.c4g0
        public boolean isUnsubscribed() {
            return this.f8210b.isUnsubscribed();
        }

        @Override // java.lang.Runnable
        public void run() {
            do {
                boolean zIsUnsubscribed = this.f8210b.isUnsubscribed();
                ConcurrentLinkedQueue<ScheduledAction> concurrentLinkedQueue = this.f8211c;
                if (zIsUnsubscribed) {
                    concurrentLinkedQueue.clear();
                    return;
                }
                ScheduledAction scheduledActionPoll = concurrentLinkedQueue.poll();
                if (scheduledActionPoll == null) {
                    return;
                }
                if (!scheduledActionPoll.isUnsubscribed()) {
                    if (this.f8210b.isUnsubscribed()) {
                        this.f8211c.clear();
                        return;
                    }
                    scheduledActionPoll.run();
                }
            } while (this.f8212d.decrementAndGet() != 0);
        }

        @Override // p003l.c4g0
        public void unsubscribe() {
            this.f8210b.unsubscribe();
            this.f8211c.clear();
        }
    }

    public v5f(Executor executor) {
        this.f8208b = executor;
    }

    @Override // p003l.bud0
    public bud0.AbstractC0185a createWorker() {
        return new RunnableC0597a(this.f8208b);
    }
}
