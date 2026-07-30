package p014rx.internal.schedulers;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p003l.bud0;
import p003l.c4g0;
import p003l.d30;
import p003l.h4g0;
import p003l.m250;
import p003l.tie0;
import p003l.w9j;
import p014rx.C1098b;
import p014rx.C1099c;
import p014rx.internal.operators.BufferUntilSubscriber;
import p014rx.subjects.C1186b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SchedulerWhen extends bud0 implements c4g0 {

    /* JADX INFO: renamed from: e */
    public static final c4g0 f11012e = new C1148c();

    /* JADX INFO: renamed from: f */
    public static final c4g0 f11013f = h4g0.m4917d();

    /* JADX INFO: renamed from: b */
    public final bud0 f11014b;

    /* JADX INFO: renamed from: c */
    public final m250<C1099c<C1098b>> f11015c;

    /* JADX INFO: renamed from: d */
    public final c4g0 f11016d;

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
        public c4g0 callActual(bud0.AbstractC0185a abstractC0185a) {
            return abstractC0185a.mo2915c(this.action, this.delayTime, this.unit);
        }
    }

    public static class ImmediateAction extends ScheduledAction {
        private final d30 action;

        public ImmediateAction(d30 d30Var) {
            this.action = d30Var;
        }

        @Override // rx.internal.schedulers.SchedulerWhen.ScheduledAction
        public c4g0 callActual(bud0.AbstractC0185a abstractC0185a) {
            return abstractC0185a.mo2914b(this.action);
        }
    }

    public static abstract class ScheduledAction extends AtomicReference<c4g0> implements c4g0 {
        public ScheduledAction() {
            super(SchedulerWhen.f11012e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void call(bud0.AbstractC0185a abstractC0185a) {
            c4g0 c4g0Var = get();
            if (c4g0Var != SchedulerWhen.f11013f && c4g0Var == SchedulerWhen.f11012e) {
                c4g0 c4g0VarCallActual = callActual(abstractC0185a);
                if (compareAndSet(SchedulerWhen.f11012e, c4g0VarCallActual)) {
                    return;
                }
                c4g0VarCallActual.unsubscribe();
            }
        }

        public abstract c4g0 callActual(bud0.AbstractC0185a abstractC0185a);

        @Override // p003l.c4g0
        public boolean isUnsubscribed() {
            return get().isUnsubscribed();
        }

        @Override // p003l.c4g0
        public void unsubscribe() {
            c4g0 c4g0Var;
            c4g0 c4g0Var2 = SchedulerWhen.f11013f;
            do {
                c4g0Var = get();
                if (c4g0Var == SchedulerWhen.f11013f) {
                    return;
                }
            } while (!compareAndSet(c4g0Var, c4g0Var2));
            if (c4g0Var != SchedulerWhen.f11012e) {
                c4g0Var.unsubscribe();
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.schedulers.SchedulerWhen$a */
    public class C1146a implements w9j<ScheduledAction, C1098b> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bud0.AbstractC0185a f11017a;

        /* JADX INFO: renamed from: rx.internal.schedulers.SchedulerWhen$a$a */
        public class a implements C1098b.h {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ScheduledAction f11019a;

            public a(ScheduledAction scheduledAction) {
                this.f11019a = scheduledAction;
            }

            @Override // p003l.e30
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(C1098b.j jVar) {
                jVar.onSubscribe(this.f11019a);
                this.f11019a.call(C1146a.this.f11017a);
                jVar.onCompleted();
            }
        }

        public C1146a(bud0.AbstractC0185a abstractC0185a) {
            this.f11017a = abstractC0185a;
        }

        @Override // p003l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1098b call(ScheduledAction scheduledAction) {
            return C1098b.m9760c(new a(scheduledAction));
        }
    }

    /* JADX INFO: renamed from: rx.internal.schedulers.SchedulerWhen$b */
    public class C1147b extends bud0.AbstractC0185a {

        /* JADX INFO: renamed from: a */
        public final AtomicBoolean f11021a = new AtomicBoolean();

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ bud0.AbstractC0185a f11022b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ m250 f11023c;

        public C1147b(bud0.AbstractC0185a abstractC0185a, m250 m250Var) {
            this.f11022b = abstractC0185a;
            this.f11023c = m250Var;
        }

        @Override // p003l.bud0.AbstractC0185a
        /* JADX INFO: renamed from: b */
        public c4g0 mo2914b(d30 d30Var) {
            ImmediateAction immediateAction = new ImmediateAction(d30Var);
            this.f11023c.onNext(immediateAction);
            return immediateAction;
        }

        @Override // p003l.bud0.AbstractC0185a
        /* JADX INFO: renamed from: c */
        public c4g0 mo2915c(d30 d30Var, long j, TimeUnit timeUnit) {
            DelayedAction delayedAction = new DelayedAction(d30Var, j, timeUnit);
            this.f11023c.onNext(delayedAction);
            return delayedAction;
        }

        @Override // p003l.c4g0
        public boolean isUnsubscribed() {
            return this.f11021a.get();
        }

        @Override // p003l.c4g0
        public void unsubscribe() {
            if (this.f11021a.compareAndSet(false, true)) {
                this.f11022b.unsubscribe();
                this.f11023c.onCompleted();
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.schedulers.SchedulerWhen$c */
    public static class C1148c implements c4g0 {
        @Override // p003l.c4g0
        public boolean isUnsubscribed() {
            return false;
        }

        @Override // p003l.c4g0
        public void unsubscribe() {
        }
    }

    public SchedulerWhen(w9j<C1099c<C1099c<C1098b>>, C1098b> w9jVar, bud0 bud0Var) {
        this.f11014b = bud0Var;
        C1186b c1186bM9978b = C1186b.m9978b();
        this.f11015c = new tie0(c1186bM9978b);
        this.f11016d = w9jVar.call(c1186bM9978b.onBackpressureBuffer()).m9768i();
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
    @Override // p003l.bud0
    public bud0.AbstractC0185a createWorker() {
        bud0.AbstractC0185a abstractC0185aCreateWorker = this.f11014b.createWorker();
        BufferUntilSubscriber bufferUntilSubscriberM9783b = BufferUntilSubscriber.m9783b();
        tie0 tie0Var = new tie0(bufferUntilSubscriberM9783b);
        Object map = bufferUntilSubscriberM9783b.map(new C1146a(abstractC0185aCreateWorker));
        C1147b c1147b = new C1147b(abstractC0185aCreateWorker, tie0Var);
        this.f11015c.onNext(map);
        return c1147b;
    }

    @Override // p003l.c4g0
    public boolean isUnsubscribed() {
        return this.f11016d.isUnsubscribed();
    }

    @Override // p003l.c4g0
    public void unsubscribe() {
        this.f11016d.unsubscribe();
    }
}
