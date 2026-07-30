package androidx.work.impl.constraints;

import com.p051p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import p153l.aui;
import p153l.bui;
import p153l.drb;
import p153l.mjq0;
import p153l.sl50;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {1, 8, 0})
@DebugMetadata(m88262c = "androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1", m88263f = "WorkConstraintsTracker.kt", m88264l = {67}, m88265m = "invokeSuspend")
public final class WorkConstraintsTrackerKt$listen$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ sl50 $listener;
    final /* synthetic */ mjq0 $spec;
    final /* synthetic */ WorkConstraintsTracker $this_listen;
    int label;

    /* JADX INFO: renamed from: androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1$a */
    @Metadata(m88120d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {"Landroidx/work/impl/constraints/a;", Careers.f39580it, "", "a", "(Landroidx/work/impl/constraints/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m88122k = 3, m88123mv = {1, 8, 0})
    public static final class C0788a<T> implements bui {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ sl50 f3587a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ mjq0 f3588b;

        public C0788a(sl50 sl50Var, mjq0 mjq0Var) {
            this.f3587a = sl50Var;
            this.f3588b = mjq0Var;
        }

        @Override // p153l.bui
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(AbstractC0789a abstractC0789a, Continuation<? super Unit> continuation) {
            this.f3587a.mo4548a(this.f3588b, abstractC0789a);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkConstraintsTrackerKt$listen$1(WorkConstraintsTracker workConstraintsTracker, mjq0 mjq0Var, sl50 sl50Var, Continuation<? super WorkConstraintsTrackerKt$listen$1> continuation) {
        super(2, continuation);
        this.$this_listen = workConstraintsTracker;
        this.$spec = mjq0Var;
        this.$listener = sl50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WorkConstraintsTrackerKt$listen$1(this.$this_listen, this.$spec, this.$listener, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((WorkConstraintsTrackerKt$listen$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            aui<AbstractC0789a> auiVarM4581b = this.$this_listen.m4581b(this.$spec);
            C0788a c0788a = new C0788a(this.$listener, this.$spec);
            this.label = 1;
            if (auiVarM4581b.collect(c0788a, this) == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
        }
        return Unit.INSTANCE;
    }
}
