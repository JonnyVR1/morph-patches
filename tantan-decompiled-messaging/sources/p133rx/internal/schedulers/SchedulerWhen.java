package p133rx.internal.schedulers;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p133rx.C22305b;
import p133rx.C22306c;
import p133rx.internal.operators.BufferUntilSubscriber;
import p133rx.subjects.C22393b;
import p149l.bud0;
import p149l.c4g0;
import p149l.d30;
import p149l.h4g0;
import p149l.m250;
import p149l.tie0;
import p149l.w9j;

/* JADX INFO: loaded from: classes3.dex */
public class SchedulerWhen extends bud0 implements c4g0 {

    /* JADX INFO: renamed from: e */
    public static final c4g0 f207387e = new C22355c();

    /* JADX INFO: renamed from: f */
    public static final c4g0 f207388f = h4g0.m129243d();

    /* JADX INFO: renamed from: b */
    public final bud0 f207389b;

    /* JADX INFO: renamed from: c */
    public final m250<C22306c<C22305b>> f207390c;

    /* JADX INFO: renamed from: d */
    public final c4g0 f207391d;

    public static class DelayedAction extends ScheduledAction {
        private final d30 action;
        private final long delayTime;
        private final TimeUnit unit;

        public DelayedAction(d30 d30Var, long j, TimeUnit timeUnit) {
            this.action = d30Var;
            this.delayTime = j;
            this.unit = timeUnit;
        }

        @Override // rx.internal.schedulers.SchedulerWhen.ScheduledAction
        public c4g0 callActual(bud0.AbstractC15976a abstractC15976a) {
            return abstractC15976a.mo99202c(this.action, this.delayTime, this.unit);
        }
    }

    public static class ImmediateAction extends ScheduledAction {
        private final d30 action;

        public ImmediateAction(d30 d30Var) {
            this.action = d30Var;
        }

        @Override // rx.internal.schedulers.SchedulerWhen.ScheduledAction
        public c4g0 callActual(bud0.AbstractC15976a abstractC15976a) {
            return abstractC15976a.mo99201b(this.action);
        }
    }

    public static abstract class ScheduledAction extends AtomicReference<c4g0> implements c4g0 {
        public ScheduledAction() {
            super(SchedulerWhen.f207387e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void call(bud0.AbstractC15976a abstractC15976a) {
            c4g0 c4g0Var = get();
            if (c4g0Var != SchedulerWhen.f207388f && c4g0Var == SchedulerWhen.f207387e) {
                c4g0 c4g0VarCallActual = callActual(abstractC15976a);
                if (compareAndSet(SchedulerWhen.f207387e, c4g0VarCallActual)) {
                    return;
                }
                c4g0VarCallActual.unsubscribe();
            }
        }

        public abstract c4g0 callActual(bud0.AbstractC15976a abstractC15976a);

        @Override // p149l.c4g0
        public boolean isUnsubscribed() {
            return get().isUnsubscribed();
        }

        @Override // p149l.c4g0
        public void unsubscribe() {
            c4g0 c4g0Var;
            c4g0 c4g0Var2 = SchedulerWhen.f207388f;
            do {
                c4g0Var = get();
                if (c4g0Var == SchedulerWhen.f207388f) {
                    return;
                }
            } while (!compareAndSet(c4g0Var, c4g0Var2));
            if (c4g0Var != SchedulerWhen.f207387e) {
                c4g0Var.unsubscribe();
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.schedulers.SchedulerWhen$a */
    public class C22353a implements w9j<ScheduledAction, C22305b> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bud0.AbstractC15976a f207392a;

        /* JADX INFO: renamed from: rx.internal.schedulers.SchedulerWhen$a$a */
        public class a implements C22305b.h {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ScheduledAction f207394a;

            public a(ScheduledAction scheduledAction) {
                this.f207394a = scheduledAction;
            }

            @Override // p149l.e30
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(C22305b.j jVar) {
                jVar.onSubscribe(this.f207394a);
                this.f207394a.call(C22353a.this.f207392a);
                jVar.onCompleted();
            }
        }

        public C22353a(bud0.AbstractC15976a abstractC15976a) {
            this.f207392a = abstractC15976a;
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22305b call(ScheduledAction scheduledAction) {
            return C22305b.m221303c(new a(scheduledAction));
        }
    }

    /* JADX INFO: renamed from: rx.internal.schedulers.SchedulerWhen$b */
    public class C22354b extends bud0.AbstractC15976a {

        /* JADX INFO: renamed from: a */
        public final AtomicBoolean f207396a = new AtomicBoolean();

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ bud0.AbstractC15976a f207397b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ m250 f207398c;

        public C22354b(bud0.AbstractC15976a abstractC15976a, m250 m250Var) {
            this.f207397b = abstractC15976a;
            this.f207398c = m250Var;
        }

        @Override // p149l.bud0.AbstractC15976a
        /* JADX INFO: renamed from: b */
        public c4g0 mo99201b(d30 d30Var) {
            ImmediateAction immediateAction = new ImmediateAction(d30Var);
            this.f207398c.onNext(immediateAction);
            return immediateAction;
        }

        @Override // p149l.bud0.AbstractC15976a
        /* JADX INFO: renamed from: c */
        public c4g0 mo99202c(d30 d30Var, long j, TimeUnit timeUnit) {
            DelayedAction delayedAction = new DelayedAction(d30Var, j, timeUnit);
            this.f207398c.onNext(delayedAction);
            return delayedAction;
        }

        @Override // p149l.c4g0
        public boolean isUnsubscribed() {
            return this.f207396a.get();
        }

        @Override // p149l.c4g0
        public void unsubscribe() {
            if (this.f207396a.compareAndSet(false, true)) {
                this.f207397b.unsubscribe();
                this.f207398c.onCompleted();
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.schedulers.SchedulerWhen$c */
    public static class C22355c implements c4g0 {
        @Override // p149l.c4g0
        public boolean isUnsubscribed() {
            return false;
        }

        @Override // p149l.c4g0
        public void unsubscribe() {
        }
    }

    public SchedulerWhen(w9j<C22306c<C22306c<C22305b>>, C22305b> w9jVar, bud0 bud0Var) {
        this.f207389b = bud0Var;
        C22393b c22393bM221521b = C22393b.m221521b();
        this.f207390c = new tie0(c22393bM221521b);
        this.f207391d = w9jVar.call(c22393bM221521b.onBackpressureBuffer()).m221311i();
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // p149l.bud0
    public bud0.AbstractC15976a createWorker() {
        bud0.AbstractC15976a abstractC15976aCreateWorker = this.f207389b.createWorker();
        BufferUntilSubscriber bufferUntilSubscriberM221326b = BufferUntilSubscriber.m221326b();
        tie0 tie0Var = new tie0(bufferUntilSubscriberM221326b);
        Object map = bufferUntilSubscriberM221326b.map(new C22353a(abstractC15976aCreateWorker));
        C22354b c22354b = new C22354b(abstractC15976aCreateWorker, tie0Var);
        this.f207390c.onNext(map);
        return c22354b;
    }

    @Override // p149l.c4g0
    public boolean isUnsubscribed() {
        return this.f207391d.isUnsubscribed();
    }

    @Override // p149l.c4g0
    public void unsubscribe() {
        this.f207391d.unsubscribe();
    }
}
