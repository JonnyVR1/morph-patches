package androidx.room;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.drb;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m88121d2 = {"R", "Ll/drb;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 8, 0})
@DebugMetadata(m88262c = "androidx.room.RoomDatabaseKt$withTransaction$transactionBlock$1", m88263f = "RoomDatabaseExt.kt", m88264l = {62}, m88265m = "invokeSuspend")
final class RoomDatabaseKt$withTransaction$transactionBlock$1 extends SuspendLambda implements Function2<drb, Continuation<Object>, Object> {
    final /* synthetic */ Function1<Continuation<Object>, Object> $block;
    final /* synthetic */ RoomDatabase $this_withTransaction;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RoomDatabaseKt$withTransaction$transactionBlock$1(RoomDatabase roomDatabase, Function1<? super Continuation<Object>, ? extends Object> function1, Continuation<? super RoomDatabaseKt$withTransaction$transactionBlock$1> continuation) {
        super(2, continuation);
        this.$this_withTransaction = roomDatabase;
        this.$block = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        RoomDatabaseKt$withTransaction$transactionBlock$1 roomDatabaseKt$withTransaction$transactionBlock$1 = new RoomDatabaseKt$withTransaction$transactionBlock$1(this.$this_withTransaction, this.$block, continuation);
        roomDatabaseKt$withTransaction$transactionBlock$1.L$0 = obj;
        return roomDatabaseKt$withTransaction$transactionBlock$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull drb drbVar, @Nullable Continuation<Object> continuation) {
        return ((RoomDatabaseKt$withTransaction$transactionBlock$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        C0676k c0676k;
        Throwable th;
        C0676k c0676k2;
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.m88128b(obj);
                CoroutineContext.Element element = ((drb) this.L$0).getCoroutineContext().get(C0676k.INSTANCE);
                element.getClass();
                c0676k = (C0676k) element;
                c0676k.m4019a();
                try {
                    this.$this_withTransaction.beginTransaction();
                    try {
                        Function1<Continuation<Object>, Object> function1 = this.$block;
                        this.L$0 = c0676k;
                        this.label = 1;
                        Object objInvoke = function1.invoke(this);
                        if (objInvoke == objM198688e) {
                            return objM198688e;
                        }
                        c0676k2 = c0676k;
                        obj = objInvoke;
                    } catch (Throwable th2) {
                        th = th2;
                        this.$this_withTransaction.endTransaction();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c0676k.m4021d();
                    throw th;
                }
            } else {
                if (i != 1) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                C0676k c0676k3 = (C0676k) this.L$0;
                try {
                    ResultKt.m88128b(obj);
                    c0676k2 = c0676k3;
                } catch (Throwable th4) {
                    th = th4;
                    this.$this_withTransaction.endTransaction();
                    throw th;
                }
            }
            this.$this_withTransaction.setTransactionSuccessful();
            this.$this_withTransaction.endTransaction();
            c0676k2.m4021d();
            return obj;
        } catch (Throwable th5) {
            th = th5;
            c0676k = objM198688e;
        }
    }
}
