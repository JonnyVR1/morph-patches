package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.drb;
import p153l.ole0;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {"R", "Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
@DebugMetadata(m88262c = "kotlinx.coroutines.selects.SelectBuilderImpl$getResult$1", m88263f = "SelectOld.kt", m88264l = {39}, m88265m = "invokeSuspend")
final class SelectBuilderImpl$getResult$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C15603a<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectBuilderImpl$getResult$1(C15603a<Object> c15603a, Continuation<? super SelectBuilderImpl$getResult$1> continuation) {
        super(2, continuation);
        this.this$0 = c15603a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SelectBuilderImpl$getResult$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull drb drbVar, @Nullable Continuation<? super Unit> continuation) {
        return ((SelectBuilderImpl$getResult$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kotlin.Unit] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.m88128b(obj);
                C15603a<Object> c15603a = this.this$0;
                this.label = 1;
                obj = c15603a.mo95209p(this);
                if (obj == objM198688e) {
                    return objM198688e;
                }
            } else {
                if (i != 1) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m88128b(obj);
            }
            ole0.m168106c(this.this$0.cont, obj);
            this = Unit.INSTANCE;
            return this;
        } catch (Throwable th) {
            ole0.m168107d(this.this$0.cont, th);
            return Unit.INSTANCE;
        }
    }
}
