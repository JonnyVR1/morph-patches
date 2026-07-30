package p149l;

import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H$¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Ll/p1f;", j6f.GPS_DIRECTION_TRUE, "Landroidx/room/SharedSQLiteStatement;", "Landroidx/room/RoomDatabase;", "database", "<init>", "(Landroidx/room/RoomDatabase;)V", "Ll/jzg0;", "statement", "entity", "", RXScreenCaptureService.KEY_INDEX, "(Ll/jzg0;Ljava/lang/Object;)V", "j", "(Ljava/lang/Object;)V", "room-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@SourceDebugExtension
public abstract class p1f<T> extends SharedSQLiteStatement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1f(@NotNull RoomDatabase roomDatabase) {
        super(roomDatabase);
        roomDatabase.getClass();
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo95569i(@NotNull jzg0 statement, T entity);

    /* JADX INFO: renamed from: j */
    public final void m167058j(T entity) {
        jzg0 jzg0VarM3929b = m3929b();
        try {
            mo95569i(jzg0VarM3929b, entity);
            jzg0VarM3929b.executeInsert();
        } finally {
            m3935h(jzg0VarM3929b);
        }
    }
}
