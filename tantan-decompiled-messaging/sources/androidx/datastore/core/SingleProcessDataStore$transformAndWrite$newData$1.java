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
import p149l.j6f;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ll/ppb;", "<anonymous>"}, m87233k = 3, m87234mv = {1, 5, 1})
@DebugMetadata(m87373c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", m87374f = "SingleProcessDataStore.kt", m87375l = {402}, m87376m = "invokeSuspend")
public final class SingleProcessDataStore$transformAndWrite$newData$1<T> extends SuspendLambda implements Function2<ppb, Continuation<? super T>, Object> {
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
    public final Object invoke(@NotNull ppb ppbVar, @Nullable Continuation<? super T> continuation) {
        return ((SingleProcessDataStore$transformAndWrite$newData$1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.m87239b(obj);
                return obj;
            }
            qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m87239b(obj);
        Function2<T, Continuation<? super T>, Object> function2 = this.$transform;
        T t = this.$curData;
        this.label = 1;
        Object objInvoke = function2.invoke(t, this);
        return objInvoke == objM196133e ? objM196133e : objInvoke;
    }
}
