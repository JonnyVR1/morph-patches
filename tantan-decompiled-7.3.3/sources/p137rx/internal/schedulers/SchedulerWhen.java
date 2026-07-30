package p137rx.internal.schedulers;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p137rx.C22420b;
import p137rx.C22421c;
import p137rx.internal.operators.BufferUntilSubscriber;
import p137rx.subjects.C22508b;
import p153l.bb50;
import p153l.f2e0;
import p153l.kcg0;
import p153l.pcg0;
import p153l.qcj;
import p153l.x20;
import p153l.yqe0;

/* JADX INFO: loaded from: classes3.dex */
public class SchedulerWhen extends f2e0 implements kcg0 {

    /* JADX INFO: renamed from: e */
    public static final kcg0 f208309e = new C22470c();

    /* JADX INFO: renamed from: f */
    public static final kcg0 f208310f = pcg0.m171651d();

    /* JADX INFO: renamed from: b */
    public final f2e0 f208311b;

    /* JADX INFO: renamed from: c */
    public final bb50<C22421c<C22420b>> f208312c;

    /* JADX INFO: renamed from: d */
    public final kcg0 f208313d;

    public static class DelayedAction extends ScheduledAction {
        private final x20 action;
        private final long delayTime;
        private final TimeUnit unit;

        public DelayedAction(x20 x20Var, long j, TimeUnit timeUnit) {
            this.action = x20Var;
            this.delayTime = j;
            this.unit = timeUnit;
        }

        @Override // rx.internal.schedulers.SchedulerWhen.ScheduledAction
        public kcg0 callActual(f2e0.AbstractC16877a abstractC16877a) {
            return abstractC16877a.mo102837c(this.action, this.delayTime, this.unit);
        }
    }

    public static class ImmediateAction extends ScheduledAction {
        private final x20 action;

        public ImmediateAction(x20 x20Var) {
            this.action = x20Var;
        }

        @Override // rx.internal.schedulers.SchedulerWhen.ScheduledAction
        public kcg0 callActual(f2e0.AbstractC16877a abstractC16877a) {
            return abstractC16877a.mo102836b(this.action);
        }
    }

    public static abstract class ScheduledAction extends AtomicReference<kcg0> implements kcg0 {
        public ScheduledAction() {
            super(SchedulerWhen.f208309e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void call(f2e0.AbstractC16877a abstractC16877a) {
            kcg0 kcg0Var = get();
            if (kcg0Var != SchedulerWhen.f208310f && kcg0Var == SchedulerWhen.f208309e) {
                kcg0 kcg0VarCallActual = callActual(abstractC16877a);
                if (compareAndSet(SchedulerWhen.f208309e, kcg0VarCallActual)) {
                    return;
                }
                kcg0VarCallActual.unsubscribe();
            }
        }

        public abstract kcg0 callActual(f2e0.AbstractC16877a abstractC16877a);

        @Override // p153l.kcg0
        public boolean isUnsubscribed() {
            return get().isUnsubscribed();
        }

        @Override // p153l.kcg0
        public void unsubscribe() {
            kcg0 kcg0Var;
            kcg0 kcg0Var2 = SchedulerWhen.f208310f;
            do {
                kcg0Var = get();
                if (kcg0Var == SchedulerWhen.f208310f) {
                    return;
                }
            } while (!compareAndSet(kcg0Var, kcg0Var2));
            if (kcg0Var != SchedulerWhen.f208309e) {
                kcg0Var.unsubscribe();
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.schedulers.SchedulerWhen$a */
    public class C22468a implements qcj<ScheduledAction, C22420b> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f2e0.AbstractC16877a f208314a;

        /* JADX INFO: renamed from: rx.internal.schedulers.SchedulerWhen$a$a */
        public class a implements C22420b.h {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ScheduledAction f208316a;

            public a(ScheduledAction scheduledAction) {
                this.f208316a = scheduledAction;
            }

            @Override // p153l.y20
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(C22420b.j jVar) {
                jVar.onSubscribe(this.f208316a);
                this.f208316a.call(C22468a.this.f208314a);
                jVar.onCompleted();
            }
        }

        public C22468a(f2e0.AbstractC16877a abstractC16877a) {
            this.f208314a = abstractC16877a;
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22420b call(ScheduledAction scheduledAction) {
            return C22420b.m222549c(new a(scheduledAction));
        }
    }

    /* JADX INFO: renamed from: rx.internal.schedulers.SchedulerWhen$b */
    public class C22469b extends f2e0.AbstractC16877a {

        /* JADX INFO: renamed from: a */
        public final AtomicBoolean f208318a = new AtomicBoolean();

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ f2e0.AbstractC16877a f208319b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ bb50 f208320c;

        public C22469b(f2e0.AbstractC16877a abstractC16877a, bb50 bb50Var) {
            this.f208319b = abstractC16877a;
            this.f208320c = bb50Var;
        }

        @Override // p153l.f2e0.AbstractC16877a
        /* JADX INFO: renamed from: b */
        public kcg0 mo102836b(x20 x20Var) {
            ImmediateAction immediateAction = new ImmediateAction(x20Var);
            this.f208320c.onNext(immediateAction);
            return immediateAction;
        }

        @Override // p153l.f2e0.AbstractC16877a
        /* JADX INFO: renamed from: c */
        public kcg0 mo102837c(x20 x20Var, long j, TimeUnit timeUnit) {
            DelayedAction delayedAction = new DelayedAction(x20Var, j, timeUnit);
            this.f208320c.onNext(delayedAction);
            return delayedAction;
        }

        @Override // p153l.kcg0
        public boolean isUnsubscribed() {
            return this.f208318a.get();
        }

        @Override // p153l.kcg0
        public void unsubscribe() {
            if (this.f208318a.compareAndSet(false, true)) {
                this.f208319b.unsubscribe();
                this.f208320c.onCompleted();
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.schedulers.SchedulerWhen$c */
    public static class C22470c implements kcg0 {
        @Override // p153l.kcg0
        public boolean isUnsubscribed() {
            return false;
        }

        @Override // p153l.kcg0
        public void unsubscribe() {
        }
    }

    public SchedulerWhen(qcj<C22421c<C22421c<C22420b>>, C22420b> qcjVar, f2e0 f2e0Var) {
        this.f208311b = f2e0Var;
        C22508b c22508bM222767b = C22508b.m222767b();
        this.f208312c = new yqe0(c22508bM222767b);
        this.f208313d = qcjVar.call(c22508bM222767b.onBackpressureBuffer()).m222557i();
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
    @Override // p153l.f2e0
    public f2e0.AbstractC16877a createWorker() {
        f2e0.AbstractC16877a abstractC16877aCreateWorker = this.f208311b.createWorker();
        BufferUntilSubscriber bufferUntilSubscriberM222572b = BufferUntilSubscriber.m222572b();
        yqe0 yqe0Var = new yqe0(bufferUntilSubscriberM222572b);
        Object map = bufferUntilSubscriberM222572b.map(new C22468a(abstractC16877aCreateWorker));
        C22469b c22469b = new C22469b(abstractC16877aCreateWorker, yqe0Var);
        this.f208312c.onNext(map);
        return c22469b;
    }

    @Override // p153l.kcg0
    public boolean isUnsubscribed() {
        return this.f208313d.isUnsubscribed();
    }

    @Override // p153l.kcg0
    public void unsubscribe() {
        this.f208313d.unsubscribe();
    }
}
