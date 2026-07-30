package androidx.datastore.core;

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
import p153l.p7f;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Ll/drb;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 5, 1})
@DebugMetadata(m88262c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", m88263f = "SingleProcessDataStore.kt", m88264l = {402}, m88265m = "invokeSuspend")
public final class SingleProcessDataStore$transformAndWrite$newData$1<T> extends SuspendLambda implements Function2<drb, Continuation<? super T>, Object> {
    final /* synthetic */ T $curData;
    final /* synthetic */ Function2<T, Continuation<? super T>, Object> $transform;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SingleProcessDataStore$transformAndWrite$newData$1(Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, T t, Continuation<? super SingleProcessDataStore$transformAndWrite$newData$1> continuation) {
        super(2, continuation);
        this.$transform = function2;
        this.$curData = t;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SingleProcessDataStore$transformAndWrite$newData$1(this.$transform, this.$curData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull drb drbVar, @Nullable Continuation<? super T> continuation) {
        return ((SingleProcessDataStore$transformAndWrite$newData$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.m88128b(obj);
                return obj;
            }
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m88128b(obj);
        Function2<T, Continuation<? super T>, Object> function2 = this.$transform;
        T t = this.$curData;
        this.label = 1;
        Object objInvoke = function2.invoke(t, this);
        return objInvoke == objM198688e ? objM198688e : objInvoke;
    }
}
