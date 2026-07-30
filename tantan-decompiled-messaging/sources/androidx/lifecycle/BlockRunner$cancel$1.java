package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;
import p149l.ppb;
import p149l.qkq0;
import p149l.u33;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {2, 0, 0})
@DebugMetadata(m87373c = "androidx.lifecycle.BlockRunner$cancel$1", m87374f = "CoroutineLiveData.kt", m87375l = {180}, m87376m = "invokeSuspend")
final class BlockRunner$cancel$1 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ u33<Object> this$0;

    public BlockRunner$cancel$1(u33<Object> u33Var, Continuation<? super BlockRunner$cancel$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BlockRunner$cancel$1(null, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
        return ((BlockRunner$cancel$1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            long jM191564d = u33.m191564d(null);
            this.label = 1;
            if (DelayKt.m93611b(jM191564d, this) == objM196133e) {
                return objM196133e;
            }
        } else {
            if (i != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m87239b(obj);
        }
        u33.m191562b(null);
        throw null;
    }
}
