package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC15486o;
import p149l.dc60;
import p149l.hh3;
import p149l.j6f;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ll/ppb;", "<anonymous>"}, m87233k = 3, m87234mv = {2, 0, 0})
@DebugMetadata(m87373c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", m87374f = "PausingDispatcher.jvm.kt", m87375l = {213}, m87376m = "invokeSuspend")
public final class PausingDispatcherKt$whenStateAtLeast$2<T> extends SuspendLambda implements Function2<ppb, Continuation<? super T>, Object> {
    final /* synthetic */ Function2<ppb, Continuation<? super T>, Object> $block;
    final /* synthetic */ Lifecycle.State $minState;
    final /* synthetic */ Lifecycle $this_whenStateAtLeast;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PausingDispatcherKt$whenStateAtLeast$2(Lifecycle lifecycle, Lifecycle.State state, Function2<? super ppb, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super PausingDispatcherKt$whenStateAtLeast$2> continuation) {
        super(2, continuation);
        this.$this_whenStateAtLeast = lifecycle;
        this.$minState = state;
        this.$block = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.$this_whenStateAtLeast, this.$minState, this.$block, continuation);
        pausingDispatcherKt$whenStateAtLeast$2.L$0 = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ppb ppbVar, Continuation<? super T> continuation) {
        return ((PausingDispatcherKt$whenStateAtLeast$2) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C0476f c0476f;
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0476f = (C0476f) this.L$0;
            try {
                ResultKt.m87239b(obj);
                c0476f.m3021b();
                return obj;
            } catch (Throwable th) {
                th = th;
                c0476f.m3021b();
                throw th;
            }
        }
        ResultKt.m87239b(obj);
        InterfaceC15486o interfaceC15486o = (InterfaceC15486o) ((ppb) this.L$0).getCoroutineContext().get(InterfaceC15486o.INSTANCE);
        if (interfaceC15486o == null) {
            qkq0.m175383a("when[State] methods should have a parent job");
            return null;
        }
        dc60 dc60Var = new dc60();
        C0476f c0476f2 = new C0476f(this.$this_whenStateAtLeast, this.$minState, dc60Var.dispatchQueue, interfaceC15486o);
        try {
            Function2<ppb, Continuation<? super T>, Object> function2 = this.$block;
            this.L$0 = c0476f2;
            this.label = 1;
            obj = hh3.m130938g(dc60Var, function2, this);
            if (obj == objM196133e) {
                return objM196133e;
            }
            c0476f = c0476f2;
            c0476f.m3021b();
            return obj;
        } catch (Throwable th2) {
            th = th2;
            c0476f = c0476f2;
            c0476f.m3021b();
            throw th;
        }
    }
}
