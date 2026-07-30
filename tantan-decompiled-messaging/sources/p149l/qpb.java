package p149l;

import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003¨\u0006\u0006"}, m87232d2 = {"Landroidx/room/RoomDatabase;", "Lkotlinx/coroutines/CoroutineDispatcher;", "a", "(Landroidx/room/RoomDatabase;)Lkotlinx/coroutines/CoroutineDispatcher;", "b", "transactionDispatcher", "room-ktx_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class qpb {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final CoroutineDispatcher m175820a(@NotNull RoomDatabase roomDatabase) {
        Map<String, Object> backingFieldMap = roomDatabase.getBackingFieldMap();
        Object objM217297b = backingFieldMap.get("QueryDispatcher");
        if (objM217297b == null) {
            objM217297b = z5f.m217297b(roomDatabase.getQueryExecutor());
            backingFieldMap.put("QueryDispatcher", objM217297b);
        }
        objM217297b.getClass();
        return (CoroutineDispatcher) objM217297b;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final CoroutineDispatcher m175821b(@NotNull RoomDatabase roomDatabase) {
        Map<String, Object> backingFieldMap = roomDatabase.getBackingFieldMap();
        Object objM217297b = backingFieldMap.get("TransactionDispatcher");
        if (objM217297b == null) {
            objM217297b = z5f.m217297b(roomDatabase.getTransactionExecutor());
            backingFieldMap.put("TransactionDispatcher", objM217297b);
        }
        objM217297b.getClass();
        return (CoroutineDispatcher) objM217297b;
    }
}
