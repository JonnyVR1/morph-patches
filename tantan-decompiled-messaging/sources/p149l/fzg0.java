package p149l;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import com.p046p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.sina.weibo.sdk.constant.WBConstants;
import java.io.Closeable;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH'¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010$\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b$\u0010%J5\u0010*\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010\u00022\u0012\u0010)\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010(\u0018\u00010'H&¢\u0006\u0004\b*\u0010+JE\u0010,\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010\u00022\u0012\u0010)\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010(\u0018\u00010'H&¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b.\u0010/J)\u0010.\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u00100\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010(0'H&¢\u0006\u0004\b.\u00101J\u0017\u00103\u001a\u00020\r2\u0006\u00102\u001a\u00020 H&¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u00072\u0006\u00106\u001a\u000205H&¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00072\u0006\u00109\u001a\u00020 H&¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\rH'¢\u0006\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u000fR\u001c\u0010C\u001a\u00020 8&@&X¦\u000e¢\u0006\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010;R\u0014\u0010F\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u001c\u0010J\u001a\u00020\u00118&@&X¦\u000e¢\u0006\f\u001a\u0004\bG\u0010E\"\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u000fR\u0014\u0010L\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\u000fR\u0016\u0010O\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020\r8gX¦\u0004¢\u0006\u0006\u001a\u0004\bP\u0010\u000fR(\u0010U\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020R\u0018\u00010Q8fX¦\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bV\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006WÀ\u0006\u0001"}, m87232d2 = {"Ll/fzg0;", "Ljava/io/Closeable;", "", "sql", "Ll/jzg0;", "compileStatement", "(Ljava/lang/String;)Ll/jzg0;", "", "beginTransaction", "()V", "beginTransactionNonExclusive", "endTransaction", "setTransactionSuccessful", "", "inTransaction", "()Z", "yieldIfContendedSafely", "", "numBytes", "setMaximumSize", "(J)J", BLivePkInviteSource.query, "Landroid/database/Cursor;", "(Ljava/lang/String;)Landroid/database/Cursor;", "Ll/izg0;", "E", "(Ll/izg0;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "cancellationSignal", "b0", "(Ll/izg0;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "D", "(Ljava/lang/String;ILandroid/content/ContentValues;)J", "whereClause", "", "", "whereArgs", "f", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", j6f.GPS_MEASUREMENT_INTERRUPTED, "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "execSQL", "(Ljava/lang/String;)V", "bindArgs", "(Ljava/lang/String;[Ljava/lang/Object;)V", "newVersion", "needUpgrade", "(I)Z", "Ljava/util/Locale;", "locale", "setLocale", "(Ljava/util/Locale;)V", "cacheSize", "setMaxSqlCacheSize", "(I)V", "enabled", "setForeignKeyConstraintsEnabled", "(Z)V", "isDbLockedByCurrentThread", "getVersion", "()I", "setVersion", WBConstants.AUTH_PARAMS_VERSION, "getMaximumSize", "()J", "maximumSize", "getPageSize", "setPageSize", "(J)V", "pageSize", "isReadOnly", "isOpen", "getPath", "()Ljava/lang/String;", "path", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "getAttachedDbs", "()Ljava/util/List;", "attachedDbs", "isDatabaseIntegrityOk", "sqlite_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public interface fzg0 extends Closeable {
    /* JADX INFO: renamed from: D */
    long mo3893D(@NotNull String table, int conflictAlgorithm, @NotNull ContentValues values) throws SQLException;

    @NotNull
    /* JADX INFO: renamed from: E */
    Cursor mo3894E(@NotNull izg0 query);

    /* JADX INFO: renamed from: V */
    int mo3895V(@NotNull String table, int conflictAlgorithm, @NotNull ContentValues values, @Nullable String whereClause, @Nullable Object[] whereArgs);

    @RequiresApi(api = 16)
    @NotNull
    /* JADX INFO: renamed from: b0 */
    Cursor mo3896b0(@NotNull izg0 query, @Nullable CancellationSignal cancellationSignal);

    void beginTransaction();

    void beginTransactionNonExclusive();

    @NotNull
    jzg0 compileStatement(@NotNull String sql);

    void endTransaction();

    void execSQL(@NotNull String sql) throws SQLException;

    void execSQL(@NotNull String sql, @NotNull Object[] bindArgs) throws SQLException;

    /* JADX INFO: renamed from: f */
    int mo3897f(@NotNull String table, @Nullable String whereClause, @Nullable Object[] whereArgs);

    @Nullable
    List<Pair<String, String>> getAttachedDbs();

    long getMaximumSize();

    long getPageSize();

    @Nullable
    String getPath();

    int getVersion();

    boolean inTransaction();

    boolean isDatabaseIntegrityOk();

    boolean isDbLockedByCurrentThread();

    boolean isOpen();

    boolean isReadOnly();

    @RequiresApi(api = 16)
    boolean isWriteAheadLoggingEnabled();

    boolean needUpgrade(int newVersion);

    @NotNull
    Cursor query(@NotNull String query);

    @RequiresApi(api = 16)
    void setForeignKeyConstraintsEnabled(boolean enabled);

    void setLocale(@NotNull Locale locale);

    void setMaxSqlCacheSize(int cacheSize);

    long setMaximumSize(long numBytes);

    void setPageSize(long j);

    void setTransactionSuccessful();

    void setVersion(int i);

    boolean yieldIfContendedSafely();
}
