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
import p153l.p7f;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/SingleProcessDataStore$b;", "msg", "", "<anonymous>", "(Landroidx/datastore/core/SingleProcessDataStore$b;)V"}, m88122k = 3, m88123mv = {1, 5, 1})
@DebugMetadata(m88262c = "androidx.datastore.core.SingleProcessDataStore$actor$3", m88263f = "SingleProcessDataStore.kt", m88264l = {239, 242}, m88265m = "invokeSuspend")
public final class SingleProcessDataStore$actor$3<T> extends SuspendLambda implements Function2<SingleProcessDataStore.AbstractC0268b<T>, Continuation<? super Unit>, Object> {
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
    public final Object invoke(@NotNull SingleProcessDataStore.AbstractC0268b<T> abstractC0268b, @Nullable Continuation<? super Unit> continuation) {
        return ((SingleProcessDataStore$actor$3) create(abstractC0268b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r4.this$0.m1417r((androidx.datastore.core.SingleProcessDataStore.AbstractC0268b.a) r5, r4) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r4.this$0.m1418s((androidx.datastore.core.SingleProcessDataStore.AbstractC0268b.b) r5, r4) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            SingleProcessDataStore.AbstractC0268b abstractC0268b = (SingleProcessDataStore.AbstractC0268b) this.L$0;
            if (abstractC0268b instanceof SingleProcessDataStore.AbstractC0268b.a) {
                this.label = 1;
            } else if (abstractC0268b instanceof SingleProcessDataStore.AbstractC0268b.b) {
                this.label = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
        }
        return Unit.INSTANCE;
    }
}
