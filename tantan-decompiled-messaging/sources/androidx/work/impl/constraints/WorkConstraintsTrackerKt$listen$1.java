package androidx.work.impl.constraints;

import com.p046p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import p149l.eri;
import p149l.fri;
import p149l.haq0;
import p149l.ld50;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {1, 8, 0})
@DebugMetadata(m87373c = "androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1", m87374f = "WorkConstraintsTracker.kt", m87375l = {67}, m87376m = "invokeSuspend")
public final class WorkConstraintsTrackerKt$listen$1 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    final /* synthetic */ ld50 $listener;
    final /* synthetic */ haq0 $spec;
    final /* synthetic */ WorkConstraintsTracker $this_listen;
    int label;

    /* JADX INFO: renamed from: androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1$a */
    @Metadata(m87231d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m87232d2 = {"Landroidx/work/impl/constraints/a;", Careers.f38732it, "", "a", "(Landroidx/work/impl/constraints/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m87233k = 3, m87234mv = {1, 8, 0})
    public static final class C0786a<T> implements fri {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ld50 f3587a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ haq0 f3588b;

        public C0786a(ld50 ld50Var, haq0 haq0Var) {
            this.f3587a = ld50Var;
            this.f3588b = haq0Var;
        }

        @Override // p149l.fri
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(AbstractC0787a abstractC0787a, Continuation<? super Unit> continuation) {
            this.f3587a.mo4546a(this.f3588b, abstractC0787a);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkConstraintsTrackerKt$listen$1(WorkConstraintsTracker workConstraintsTracker, haq0 haq0Var, ld50 ld50Var, Continuation<? super WorkConstraintsTrackerKt$listen$1> continuation) {
        super(2, continuation);
        this.$this_listen = workConstraintsTracker;
        this.$spec = haq0Var;
        this.$listener = ld50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WorkConstraintsTrackerKt$listen$1(this.$this_listen, this.$spec, this.$listener, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
        return ((WorkConstraintsTrackerKt$listen$1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            eri<AbstractC0787a> eriVarM4579b = this.$this_listen.m4579b(this.$spec);
            C0786a c0786a = new C0786a(this.$listener, this.$spec);
            this.label = 1;
            if (eriVarM4579b.collect(c0786a, this) == objM196133e) {
                return objM196133e;
            }
        } else {
            if (i != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m87239b(obj);
        }
        return Unit.INSTANCE;
    }
}
