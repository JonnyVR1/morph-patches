package p149l;

import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R$\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m87232d2 = {"Ll/cxp;", "", "Landroidx/room/RoomDatabase;", "database", "<init>", "(Landroidx/room/RoomDatabase;)V", "a", "Landroidx/room/RoomDatabase;", "", "Landroidx/lifecycle/LiveData;", "b", "Ljava/util/Set;", "getLiveDataSet$room_runtime_release", "()Ljava/util/Set;", "liveDataSet", "room-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class cxp {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final RoomDatabase database;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Set<LiveData<?>> liveDataSet;

    public cxp(@NotNull RoomDatabase roomDatabase) {
        roomDatabase.getClass();
        this.database = roomDatabase;
        Set<LiveData<?>> setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        setNewSetFromMap.getClass();
        this.liveDataSet = setNewSetFromMap;
    }
}
