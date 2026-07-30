package p153l;

import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003¨\u0006\u0006"}, m88121d2 = {"Landroidx/room/RoomDatabase;", "Lkotlinx/coroutines/CoroutineDispatcher;", "a", "(Landroidx/room/RoomDatabase;)Lkotlinx/coroutines/CoroutineDispatcher;", "b", "transactionDispatcher", "room-ktx_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class erb {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final CoroutineDispatcher m122138a(@NotNull RoomDatabase roomDatabase) {
        Map<String, Object> backingFieldMap = roomDatabase.getBackingFieldMap();
        Object objM124439b = backingFieldMap.get("QueryDispatcher");
        if (objM124439b == null) {
            objM124439b = f7f.m124439b(roomDatabase.getQueryExecutor());
            backingFieldMap.put("QueryDispatcher", objM124439b);
        }
        objM124439b.getClass();
        return (CoroutineDispatcher) objM124439b;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final CoroutineDispatcher m122139b(@NotNull RoomDatabase roomDatabase) {
        Map<String, Object> backingFieldMap = roomDatabase.getBackingFieldMap();
        Object objM124439b = backingFieldMap.get("TransactionDispatcher");
        if (objM124439b == null) {
            objM124439b = f7f.m124439b(roomDatabase.getTransactionExecutor());
            backingFieldMap.put("TransactionDispatcher", objM124439b);
        }
        objM124439b.getClass();
        return (CoroutineDispatcher) objM124439b;
    }
}
