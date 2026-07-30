package immomo.com.mklibrary.fep.download;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.cql;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;
import p149l.y750;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m87232d2 = {"Ll/ppb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "immomo/com/mklibrary/fep/download/PreOfflineDownloader$download$1$1", "<anonymous>"}, m87233k = 3, m87234mv = {1, 4, 0})
public final class PreOfflineDownloader$download$$inlined$forEach$lambda$1 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    final /* synthetic */ cql $it;
    final /* synthetic */ y750 $offlineResponse$inlined;
    int label;

    /* JADX INFO: renamed from: p$ */
    private ppb f63321p$;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreOfflineDownloader$download$$inlined$forEach$lambda$1(cql cqlVar, Continuation continuation, y750 y750Var) {
        super(2, continuation);
        this.$it = cqlVar;
        this.$offlineResponse$inlined = y750Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        continuation.getClass();
        PreOfflineDownloader$download$$inlined$forEach$lambda$1 preOfflineDownloader$download$$inlined$forEach$lambda$1 = new PreOfflineDownloader$download$$inlined$forEach$lambda$1(this.$it, continuation, this.$offlineResponse$inlined);
        preOfflineDownloader$download$$inlined$forEach$lambda$1.f63321p$ = (ppb) obj;
        return preOfflineDownloader$download$$inlined$forEach$lambda$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
        return ((PreOfflineDownloader$download$$inlined$forEach$lambda$1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        uwp.m196133e();
        if (this.label != 0) {
            qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m87239b(obj);
        this.$it.mo108277a(this.$offlineResponse$inlined);
        return Unit.INSTANCE;
    }
}
