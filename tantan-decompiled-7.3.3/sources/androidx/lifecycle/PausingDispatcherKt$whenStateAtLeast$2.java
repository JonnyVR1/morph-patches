package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC15593o;
import p153l.drb;
import p153l.ik60;
import p153l.p7f;
import p153l.uyp;
import p153l.vh3;
import p153l.wtq0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Ll/drb;", "<anonymous>"}, m88122k = 3, m88123mv = {2, 0, 0})
@DebugMetadata(m88262c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", m88263f = "PausingDispatcher.jvm.kt", m88264l = {213}, m88265m = "invokeSuspend")
public final class PausingDispatcherKt$whenStateAtLeast$2<T> extends SuspendLambda implements Function2<drb, Continuation<? super T>, Object> {
    final /* synthetic */ Function2<drb, Continuation<? super T>, Object> $block;
    final /* synthetic */ Lifecycle.State $minState;
    final /* synthetic */ Lifecycle $this_whenStateAtLeast;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PausingDispatcherKt$whenStateAtLeast$2(Lifecycle lifecycle, Lifecycle.State state, Function2<? super drb, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super PausingDispatcherKt$whenStateAtLeast$2> continuation) {
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
    public final Object invoke(drb drbVar, Continuation<? super T> continuation) {
        return ((PausingDispatcherKt$whenStateAtLeast$2) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C0477f c0477f;
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0477f = (C0477f) this.L$0;
            try {
                ResultKt.m88128b(obj);
                c0477f.m3022b();
                return obj;
            } catch (Throwable th) {
                th = th;
                c0477f.m3022b();
                throw th;
            }
        }
        ResultKt.m88128b(obj);
        InterfaceC15593o interfaceC15593o = (InterfaceC15593o) ((drb) this.L$0).getCoroutineContext().get(InterfaceC15593o.INSTANCE);
        if (interfaceC15593o == null) {
            wtq0.m207906a("when[State] methods should have a parent job");
            return null;
        }
        ik60 ik60Var = new ik60();
        C0477f c0477f2 = new C0477f(this.$this_whenStateAtLeast, this.$minState, ik60Var.dispatchQueue, interfaceC15593o);
        try {
            Function2<drb, Continuation<? super T>, Object> function2 = this.$block;
            this.L$0 = c0477f2;
            this.label = 1;
            obj = vh3.m201255g(ik60Var, function2, this);
            if (obj == objM198688e) {
                return objM198688e;
            }
            c0477f = c0477f2;
            c0477f.m3022b();
            return obj;
        } catch (Throwable th2) {
            th = th2;
            c0477f = c0477f2;
            c0477f.m3022b();
            throw th;
        }
    }
}
