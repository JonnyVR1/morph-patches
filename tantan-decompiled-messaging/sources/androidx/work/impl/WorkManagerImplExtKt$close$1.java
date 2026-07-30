package androidx.work.impl;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC15486o;
import p149l.gnq;
import p149l.ppb;
import p149l.qkq0;
import p149l.s9q0;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {1, 8, 0})
@DebugMetadata(m87373c = "androidx.work.impl.WorkManagerImplExtKt$close$1", m87374f = "WorkManagerImplExt.kt", m87375l = {121}, m87376m = "invokeSuspend")
final class WorkManagerImplExtKt$close$1 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    final /* synthetic */ s9q0 $this_close;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkManagerImplExtKt$close$1(s9q0 s9q0Var, Continuation<? super WorkManagerImplExtKt$close$1> continuation) {
        super(2, continuation);
        this.$this_close = s9q0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WorkManagerImplExtKt$close$1(this.$this_close, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
        return ((WorkManagerImplExtKt$close$1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            CoroutineContext.Element element = this.$this_close.m182751v().getCoroutineContext().get(InterfaceC15486o.INSTANCE);
            element.getClass();
            this.label = 1;
            if (gnq.m127164e((InterfaceC15486o) element, this) == objM196133e) {
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
