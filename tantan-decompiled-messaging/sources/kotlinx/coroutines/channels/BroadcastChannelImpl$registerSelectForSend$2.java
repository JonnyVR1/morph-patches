package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.bde0;
import p149l.ppb;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m87232d2 = {"E", "Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {1, 9, 0})
@DebugMetadata(m87373c = "kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2", m87374f = "BroadcastChannel.kt", m87375l = {288}, m87376m = "invokeSuspend")
@SourceDebugExtension
public final class BroadcastChannelImpl$registerSelectForSend$2 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    final /* synthetic */ Object $element;
    final /* synthetic */ bde0<?> $select;
    int label;
    final /* synthetic */ BroadcastChannelImpl<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastChannelImpl$registerSelectForSend$2(BroadcastChannelImpl<E> broadcastChannelImpl, Object obj, bde0<?> bde0Var, Continuation<? super BroadcastChannelImpl$registerSelectForSend$2> continuation) {
        super(2, continuation);
        this.this$0 = broadcastChannelImpl;
        this.$element = obj;
        this.$select = bde0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BroadcastChannelImpl$registerSelectForSend$2(this.this$0, this.$element, this.$select, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ppb ppbVar, @Nullable Continuation<? super Unit> continuation) {
        return ((BroadcastChannelImpl$registerSelectForSend$2) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2 for r4v3 'this'  kotlin.coroutines.Continuation
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = p149l.uwp.m196133e()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 != r2) goto L11
            kotlin.ResultKt.m87239b(r5)     // Catch: java.lang.Throwable -> Lf
            goto L3d
        Lf:
            r5 = move-exception
            goto L28
        L11:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            p149l.qkq0.m175383a(r4)
            r4 = 0
            return r4
        L18:
            kotlin.ResultKt.m87239b(r5)
            kotlinx.coroutines.channels.BroadcastChannelImpl<E> r5 = r4.this$0     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r1 = r4.$element     // Catch: java.lang.Throwable -> Lf
            r4.label = r2     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r5 = r5.mo93787E(r1, r4)     // Catch: java.lang.Throwable -> Lf
            if (r5 != r0) goto L3d
            return r0
        L28:
            kotlinx.coroutines.channels.BroadcastChannelImpl<E> r0 = r4.this$0
            boolean r0 = r0.mo93792s()
            if (r0 == 0) goto L7e
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.ClosedSendChannelException
            if (r0 != 0) goto L3c
            kotlinx.coroutines.channels.BroadcastChannelImpl<E> r0 = r4.this$0
            java.lang.Throwable r0 = r0.m93877f0()
            if (r0 != r5) goto L7e
        L3c:
            r2 = 0
        L3d:
            kotlinx.coroutines.channels.BroadcastChannelImpl<E> r5 = r4.this$0
            java.util.concurrent.locks.ReentrantLock r5 = kotlinx.coroutines.channels.BroadcastChannelImpl.m93783r1(r5)
            kotlinx.coroutines.channels.BroadcastChannelImpl<E> r0 = r4.this$0
            l.bde0<?> r4 = r4.$select
            r5.lock()
            java.util.HashMap r1 = kotlinx.coroutines.channels.BroadcastChannelImpl.m93784s1(r0)     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L55
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L53
            goto L59
        L53:
            r4 = move-exception
            goto L7a
        L55:
            l.yfh0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.m93950z()     // Catch: java.lang.Throwable -> L53
        L59:
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> L53
            r4.getClass()     // Catch: java.lang.Throwable -> L53
            r1 = r4
            kotlinx.coroutines.selects.SelectImplementation r1 = (kotlinx.coroutines.selects.SelectImplementation) r1     // Catch: java.lang.Throwable -> L53
            r1 = r4
            kotlinx.coroutines.selects.SelectImplementation r1 = (kotlinx.coroutines.selects.SelectImplementation) r1     // Catch: java.lang.Throwable -> L53
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L53
            kotlinx.coroutines.selects.TrySelectDetailedResult r1 = r1.m94323z(r0, r2)     // Catch: java.lang.Throwable -> L53
            kotlinx.coroutines.selects.TrySelectDetailedResult r3 = kotlinx.coroutines.selects.TrySelectDetailedResult.REREGISTER     // Catch: java.lang.Throwable -> L53
            if (r1 == r3) goto L76
            java.util.HashMap r0 = kotlinx.coroutines.channels.BroadcastChannelImpl.m93784s1(r0)     // Catch: java.lang.Throwable -> L53
            r0.remove(r4)     // Catch: java.lang.Throwable -> L53
        L76:
            r5.unlock()
            return r2
        L7a:
            r5.unlock()
            throw r4
        L7e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
