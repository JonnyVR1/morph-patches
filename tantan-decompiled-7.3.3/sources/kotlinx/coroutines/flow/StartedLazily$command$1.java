package kotlinx.coroutines.flow;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bui;
import p153l.p3g0;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {"Ll/bui;", "Lkotlinx/coroutines/flow/SharingCommand;", "", "<anonymous>", "(Ll/bui;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
@DebugMetadata(m88262c = "kotlinx.coroutines.flow.StartedLazily$command$1", m88263f = "SharingStarted.kt", m88264l = {151}, m88265m = "invokeSuspend")
public final class StartedLazily$command$1 extends SuspendLambda implements Function2<bui<? super SharingCommand>, Continuation<? super Unit>, Object> {
    final /* synthetic */ p3g0<Integer> $subscriptionCount;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StartedLazily$command$1$1 */
    @Metadata(m88120d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {"", "count", "", "a", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m88122k = 3, m88123mv = {1, 9, 0})
    public static final class C155731<T> implements bui {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref.BooleanRef f67542a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ bui<SharingCommand> f67543b;

        /* JADX WARN: Multi-variable type inference failed */
        public C155731(Ref.BooleanRef booleanRef, bui<? super SharingCommand> buiVar) {
            this.f67542a = booleanRef;
            this.f67543b = buiVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Nullable
        /* JADX INFO: renamed from: a */
        public final Object m95048a(int i, @NotNull Continuation<? super Unit> continuation) throws Throwable {
            StartedLazily$command$1$1$emit$1 startedLazily$command$1$1$emit$1;
            if (continuation instanceof StartedLazily$command$1$1$emit$1) {
                startedLazily$command$1$1$emit$1 = (StartedLazily$command$1$1$emit$1) continuation;
                int i2 = startedLazily$command$1$1$emit$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    startedLazily$command$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                } else {
                    startedLazily$command$1$1$emit$1 = new StartedLazily$command$1$1$emit$1(this, continuation);
                }
            } else {
                startedLazily$command$1$1$emit$1 = new StartedLazily$command$1$1$emit$1(this, continuation);
            }
            Object obj = startedLazily$command$1$1$emit$1.result;
            Object objM198688e = uyp.m198688e();
            int i3 = startedLazily$command$1$1$emit$1.label;
            if (i3 == 0) {
                ResultKt.m88128b(obj);
                if (i > 0) {
                    Ref.BooleanRef booleanRef = this.f67542a;
                    if (!booleanRef.element) {
                        booleanRef.element = true;
                        bui<SharingCommand> buiVar = this.f67543b;
                        SharingCommand sharingCommand = SharingCommand.START;
                        startedLazily$command$1$1$emit$1.label = 1;
                        if (buiVar.emit(sharingCommand, startedLazily$command$1$1$emit$1) == objM198688e) {
                            return objM198688e;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            if (i3 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
            return Unit.INSTANCE;
        }

        @Override // p153l.bui
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return m95048a(((Number) obj).intValue(), continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedLazily$command$1(p3g0<Integer> p3g0Var, Continuation<? super StartedLazily$command$1> continuation) {
        super(2, continuation);
        this.$subscriptionCount = p3g0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        StartedLazily$command$1 startedLazily$command$1 = new StartedLazily$command$1(this.$subscriptionCount, continuation);
        startedLazily$command$1.L$0 = obj;
        return startedLazily$command$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull bui<? super SharingCommand> buiVar, @Nullable Continuation<? super Unit> continuation) {
        return ((StartedLazily$command$1) create(buiVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            bui buiVar = (bui) this.L$0;
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            p3g0<Integer> p3g0Var = this.$subscriptionCount;
            C155731 c155731 = new C155731(booleanRef, buiVar);
            this.label = 1;
            if (p3g0Var.collect(c155731, this) == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
