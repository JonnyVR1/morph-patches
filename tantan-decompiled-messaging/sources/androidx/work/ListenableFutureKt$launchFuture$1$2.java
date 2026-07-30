package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import p149l.j6f;
import p149l.ppb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {1, 8, 0})
@DebugMetadata(m87373c = "androidx.work.ListenableFutureKt$launchFuture$1$2", m87374f = "ListenableFuture.kt", m87375l = {42}, m87376m = "invokeSuspend")
public final class ListenableFutureKt$launchFuture$1$2 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<ppb, Continuation<? super T>, Object> $block;
    final /* synthetic */ CallbackToFutureAdapter.C0201a<T> $completer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ListenableFutureKt$launchFuture$1$2(Function2<? super ppb, ? super Continuation<? super T>, ? extends Object> function2, CallbackToFutureAdapter.C0201a<T> c0201a, Continuation<? super ListenableFutureKt$launchFuture$1$2> continuation) {
        super(2, continuation);
        this.$block = function2;
        this.$completer = c0201a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ListenableFutureKt$launchFuture$1$2 listenableFutureKt$launchFuture$1$2 = new ListenableFutureKt$launchFuture$1$2(this.$block, this.$completer, continuation);
        listenableFutureKt$launchFuture$1$2.L$0 = obj;
        return listenableFutureKt$launchFuture$1$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
        return ((ListenableFutureKt$launchFuture$1$2) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.work.ListenableFutureKt$launchFuture$1$2 for r3v4 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = p149l.uwp.m196133e()
            int r1 = r3.label
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 != r2) goto L11
            kotlin.ResultKt.m87239b(r4)     // Catch: java.lang.Throwable -> Lf java.util.concurrent.CancellationException -> L36
            goto L2a
        Lf:
            r4 = move-exception
            goto L30
        L11:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            p149l.qkq0.m175383a(r3)
            r3 = 0
            return r3
        L18:
            kotlin.ResultKt.m87239b(r4)
            java.lang.Object r4 = r3.L$0
            l.ppb r4 = (p149l.ppb) r4
            kotlin.jvm.functions.Function2<l.ppb, kotlin.coroutines.Continuation<? super T>, java.lang.Object> r1 = r3.$block     // Catch: java.lang.Throwable -> Lf java.util.concurrent.CancellationException -> L36
            r3.label = r2     // Catch: java.lang.Throwable -> Lf java.util.concurrent.CancellationException -> L36
            java.lang.Object r4 = r1.invoke(r4, r3)     // Catch: java.lang.Throwable -> Lf java.util.concurrent.CancellationException -> L36
            if (r4 != r0) goto L2a
            return r0
        L2a:
            androidx.concurrent.futures.CallbackToFutureAdapter$a<T> r0 = r3.$completer     // Catch: java.lang.Throwable -> Lf java.util.concurrent.CancellationException -> L36
            r0.m867c(r4)     // Catch: java.lang.Throwable -> Lf java.util.concurrent.CancellationException -> L36
            goto L3b
        L30:
            androidx.concurrent.futures.CallbackToFutureAdapter$a<T> r3 = r3.$completer
            r3.m870f(r4)
            goto L3b
        L36:
            androidx.concurrent.futures.CallbackToFutureAdapter$a<T> r3 = r3.$completer
            r3.m868d()
        L3b:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.ListenableFutureKt$launchFuture$1$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
