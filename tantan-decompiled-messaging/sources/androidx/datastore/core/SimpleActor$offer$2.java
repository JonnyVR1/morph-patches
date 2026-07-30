package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.j6f;
import p149l.ppb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {1, 5, 1})
@DebugMetadata(m87373c = "androidx.datastore.core.SimpleActor$offer$2", m87374f = "SimpleActor.kt", m87375l = {122, 122}, m87376m = "invokeSuspend")
public final class SimpleActor$offer$2 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ SimpleActor<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleActor$offer$2(SimpleActor<T> simpleActor, Continuation<? super SimpleActor$offer$2> continuation) {
        super(2, continuation);
        this.this$0 = simpleActor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SimpleActor$offer$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ppb ppbVar, @Nullable Continuation<? super Unit> continuation) {
        return ((SimpleActor$offer$2) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0055 A[PHI: r1 r6
      0x0055: PHI (r1v1 kotlin.jvm.functions.Function2) = (r1v2 kotlin.jvm.functions.Function2), (r1v4 kotlin.jvm.functions.Function2) binds: [B:17:0x0052, B:10:0x0019] A[DONT_GENERATE, DONT_INLINE]
      0x0055: PHI (r6v7 java.lang.Object) = (r6v14 java.lang.Object), (r6v0 java.lang.Object) binds: [B:17:0x0052, B:10:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r1.invoke(r6, r5) == r0) goto L21;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005e -> B:22:0x0061). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.Object r0 = p149l.uwp.m196133e()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L21
            if (r1 == r3) goto L19
            if (r1 != r2) goto L12
            kotlin.ResultKt.m87239b(r6)
            goto L61
        L12:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p149l.qkq0.m175383a(r5)
        L17:
            r5 = 0
            return r5
        L19:
            java.lang.Object r1 = r5.L$0
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            kotlin.ResultKt.m87239b(r6)
            goto L55
        L21:
            kotlin.ResultKt.m87239b(r6)
            androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
            java.util.concurrent.atomic.AtomicInteger r6 = androidx.datastore.core.SimpleActor.m1396c(r6)
            int r6 = r6.get()
            if (r6 <= 0) goto L32
            r6 = r3
            goto L33
        L32:
            r6 = 0
        L33:
            if (r6 == 0) goto L70
        L35:
            androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
            l.ppb r6 = androidx.datastore.core.SimpleActor.m1397d(r6)
            kotlinx.coroutines.C15424f.m94060f(r6)
            androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
            kotlin.jvm.functions.Function2 r1 = androidx.datastore.core.SimpleActor.m1394a(r6)
            androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
            l.gr4 r6 = androidx.datastore.core.SimpleActor.m1395b(r6)
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r6 = r6.mo93835C(r5)
            if (r6 != r0) goto L55
            goto L60
        L55:
            r4 = 0
            r5.L$0 = r4
            r5.label = r2
            java.lang.Object r6 = r1.invoke(r6, r5)
            if (r6 != r0) goto L61
        L60:
            return r0
        L61:
            androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
            java.util.concurrent.atomic.AtomicInteger r6 = androidx.datastore.core.SimpleActor.m1396c(r6)
            int r6 = r6.decrementAndGet()
            if (r6 != 0) goto L35
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L70:
            java.lang.String r5 = "Check failed."
            p149l.qkq0.m175383a(r5)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SimpleActor$offer$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
