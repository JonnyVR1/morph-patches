package androidx.datastore.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ism;
import p149l.j6f;
import p149l.qkq0;
import p149l.r4c;
import p149l.uwp;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ll/ism;", "api", "", "<anonymous>", "(Ll/ism;)V"}, m87233k = 3, m87234mv = {1, 5, 1})
@DebugMetadata(m87373c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", m87374f = "DataMigrationInitializer.kt", m87375l = {33}, m87376m = "invokeSuspend")
public final class DataMigrationInitializer$Companion$getInitializer$1<T> extends SuspendLambda implements Function2<ism<T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<r4c<T>> $migrations;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DataMigrationInitializer$Companion$getInitializer$1(List<? extends r4c<T>> list, Continuation<? super DataMigrationInitializer$Companion$getInitializer$1> continuation) {
        super(2, continuation);
        this.$migrations = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        DataMigrationInitializer$Companion$getInitializer$1 dataMigrationInitializer$Companion$getInitializer$1 = new DataMigrationInitializer$Companion$getInitializer$1(this.$migrations, continuation);
        dataMigrationInitializer$Companion$getInitializer$1.L$0 = obj;
        return dataMigrationInitializer$Companion$getInitializer$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ism<T> ismVar, @Nullable Continuation<? super Unit> continuation) {
        return ((DataMigrationInitializer$Companion$getInitializer$1) create(ismVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            ism ismVar = (ism) this.L$0;
            DataMigrationInitializer.Companion companion = DataMigrationInitializer.INSTANCE;
            List<r4c<T>> list = this.$migrations;
            this.label = 1;
            if (companion.m1393c(list, ismVar, this) == objM196133e) {
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
