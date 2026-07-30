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

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/SingleProcessDataStore$b;", "msg", "", "<anonymous>", "(Landroidx/datastore/core/SingleProcessDataStore$b;)V"}, m87233k = 3, m87234mv = {1, 5, 1})
@DebugMetadata(m87373c = "androidx.datastore.core.SingleProcessDataStore$actor$3", m87374f = "SingleProcessDataStore.kt", m87375l = {239, 242}, m87376m = "invokeSuspend")
public final class SingleProcessDataStore$actor$3<T> extends SuspendLambda implements Function2<SingleProcessDataStore.AbstractC0267b<T>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SingleProcessDataStore<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$actor$3(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super SingleProcessDataStore$actor$3> continuation) {
        super(2, continuation);
        this.this$0 = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        SingleProcessDataStore$actor$3 singleProcessDataStore$actor$3 = new SingleProcessDataStore$actor$3(this.this$0, continuation);
        singleProcessDataStore$actor$3.L$0 = obj;
        return singleProcessDataStore$actor$3;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull SingleProcessDataStore.AbstractC0267b<T> abstractC0267b, @Nullable Continuation<? super Unit> continuation) {
        return ((SingleProcessDataStore$actor$3) create(abstractC0267b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r4.this$0.m1416r((androidx.datastore.core.SingleProcessDataStore.AbstractC0267b.a) r5, r4) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r4.this$0.m1417s((androidx.datastore.core.SingleProcessDataStore.AbstractC0267b.b) r5, r4) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            java.lang.Object r0 = p149l.uwp.m196133e()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 == r3) goto L16
            if (r1 != r2) goto Lf
            goto L16
        Lf:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            p149l.qkq0.m175383a(r4)
            r4 = 0
            return r4
        L16:
            kotlin.ResultKt.m87239b(r5)
            goto L43
        L1a:
            kotlin.ResultKt.m87239b(r5)
            java.lang.Object r5 = r4.L$0
            androidx.datastore.core.SingleProcessDataStore$b r5 = (androidx.datastore.core.SingleProcessDataStore.AbstractC0267b) r5
            boolean r1 = r5 instanceof androidx.datastore.core.SingleProcessDataStore.AbstractC0267b.a
            if (r1 == 0) goto L32
            androidx.datastore.core.SingleProcessDataStore<T> r1 = r4.this$0
            androidx.datastore.core.SingleProcessDataStore$b$a r5 = (androidx.datastore.core.SingleProcessDataStore.AbstractC0267b.a) r5
            r4.label = r3
            java.lang.Object r4 = androidx.datastore.core.SingleProcessDataStore.m1405h(r1, r5, r4)
            if (r4 != r0) goto L43
            goto L42
        L32:
            boolean r1 = r5 instanceof androidx.datastore.core.SingleProcessDataStore.AbstractC0267b.b
            if (r1 == 0) goto L43
            androidx.datastore.core.SingleProcessDataStore<T> r1 = r4.this$0
            androidx.datastore.core.SingleProcessDataStore$b$b r5 = (androidx.datastore.core.SingleProcessDataStore.AbstractC0267b.b) r5
            r4.label = r2
            java.lang.Object r4 = androidx.datastore.core.SingleProcessDataStore.m1406i(r1, r5, r4)
            if (r4 != r0) goto L43
        L42:
            return r0
        L43:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore$actor$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
