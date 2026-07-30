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
import p149l.fri;
import p149l.gvf0;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m87232d2 = {"Ll/fri;", "Lkotlinx/coroutines/flow/SharingCommand;", "", "<anonymous>", "(Ll/fri;)V"}, m87233k = 3, m87234mv = {1, 9, 0})
@DebugMetadata(m87373c = "kotlinx.coroutines.flow.StartedLazily$command$1", m87374f = "SharingStarted.kt", m87375l = {151}, m87376m = "invokeSuspend")
public final class StartedLazily$command$1 extends SuspendLambda implements Function2<fri<? super SharingCommand>, Continuation<? super Unit>, Object> {
    final /* synthetic */ gvf0<Integer> $subscriptionCount;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StartedLazily$command$1$1 */
    @Metadata(m87231d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m87232d2 = {"", "count", "", "a", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m87233k = 3, m87234mv = {1, 9, 0})
    public static final class C154661<T> implements fri {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref.BooleanRef f66868a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ fri<SharingCommand> f66869b;

        /* JADX WARN: Multi-variable type inference failed */
        public C154661(Ref.BooleanRef booleanRef, fri<? super SharingCommand> friVar) {
            this.f66868a = booleanRef;
            this.f66869b = friVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Nullable
        /* JADX INFO: renamed from: a */
        public final Object m94155a(int i, @NotNull Continuation<? super Unit> continuation) throws Throwable {
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
            Object objM196133e = uwp.m196133e();
            int i3 = startedLazily$command$1$1$emit$1.label;
            if (i3 == 0) {
                ResultKt.m87239b(obj);
                if (i > 0) {
                    Ref.BooleanRef booleanRef = this.f66868a;
                    if (!booleanRef.element) {
                        booleanRef.element = true;
                        fri<SharingCommand> friVar = this.f66869b;
                        SharingCommand sharingCommand = SharingCommand.START;
                        startedLazily$command$1$1$emit$1.label = 1;
                        if (friVar.emit(sharingCommand, startedLazily$command$1$1$emit$1) == objM196133e) {
                            return objM196133e;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            if (i3 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m87239b(obj);
            return Unit.INSTANCE;
        }

        @Override // p149l.fri
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return m94155a(((Number) obj).intValue(), continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedLazily$command$1(gvf0<Integer> gvf0Var, Continuation<? super StartedLazily$command$1> continuation) {
        super(2, continuation);
        this.$subscriptionCount = gvf0Var;
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
    public final Object invoke(@NotNull fri<? super SharingCommand> friVar, @Nullable Continuation<? super Unit> continuation) {
        return ((StartedLazily$command$1) create(friVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            fri friVar = (fri) this.L$0;
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            gvf0<Integer> gvf0Var = this.$subscriptionCount;
            C154661 c154661 = new C154661(booleanRef, friVar);
            this.label = 1;
            if (gvf0Var.collect(c154661, this) == objM196133e) {
                return objM196133e;
            }
        } else {
            if (i != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m87239b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
