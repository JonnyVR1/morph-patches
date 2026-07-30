package androidx.room;

import androidx.annotation.RestrictTo;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p149l.eri;
import p149l.jri;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m87232d2 = {"Landroidx/room/CoroutinesRoom;", "", "Companion", "room-ktx_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class CoroutinesRoom {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JL\u0010\u0010\u001a\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000f0\u000e\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m87232d2 = {"Landroidx/room/CoroutinesRoom$Companion;", "", "<init>", "()V", "R", "Landroidx/room/RoomDatabase;", "db", "", "inTransaction", "", "", "tableNames", "Ljava/util/concurrent/Callable;", "callable", "Ll/eri;", "Lkotlin/jvm/JvmSuppressWildcards;", "a", "(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Ll/eri;", "room-ktx_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final <R> eri<R> m3905a(@NotNull RoomDatabase db, boolean inTransaction, @NotNull String[] tableNames, @NotNull Callable<R> callable) {
            return jri.m142964w(new CoroutinesRoom$Companion$createFlow$1(inTransaction, db, tableNames, callable, null));
        }

        public Companion() {
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <R> eri<R> m3904a(@NotNull RoomDatabase roomDatabase, boolean z, @NotNull String[] strArr, @NotNull Callable<R> callable) {
        return INSTANCE.m3905a(roomDatabase, z, strArr, callable);
    }
}
