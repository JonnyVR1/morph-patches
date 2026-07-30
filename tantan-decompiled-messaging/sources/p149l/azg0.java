package p149l;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.CancellationSignal;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(16)
@Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJK\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0010\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00100\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\"\u0010#¨\u0006$"}, m87232d2 = {"Ll/azg0;", "", "<init>", "()V", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "a", "(Landroid/os/CancellationSignal;)V", "Ljava/io/File;", "file", "", "b", "(Ljava/io/File;)Z", "Landroid/database/sqlite/SQLiteDatabase;", "sQLiteDatabase", "", "sql", "", "selectionArgs", "editTable", "Landroid/database/sqlite/SQLiteDatabase$CursorFactory;", "cursorFactory", "Landroid/database/Cursor;", Constants.INAPP_DATA_TAG, "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/Cursor;", "enable", "e", "(Landroid/database/sqlite/SQLiteDatabase;Z)V", "c", "(Landroid/database/sqlite/SQLiteDatabase;)Z", "Landroid/database/sqlite/SQLiteOpenHelper;", "sQLiteOpenHelper", "enabled", "f", "(Landroid/database/sqlite/SQLiteOpenHelper;Z)V", "sqlite_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class azg0 {

    @NotNull
    public static final azg0 INSTANCE = new azg0();

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: a */
    public static final void m99664a(@NotNull CancellationSignal cancellationSignal) {
        cancellationSignal.getClass();
        cancellationSignal.cancel();
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: b */
    public static final boolean m99665b(@NotNull File file) {
        file.getClass();
        return SQLiteDatabase.deleteDatabase(file);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: c */
    public static final boolean m99666c(@NotNull SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final Cursor m99667d(@NotNull SQLiteDatabase sQLiteDatabase, @NotNull String sql, @NotNull String[] selectionArgs, @Nullable String editTable, @NotNull CancellationSignal cancellationSignal, @NotNull SQLiteDatabase.CursorFactory cursorFactory) {
        sQLiteDatabase.getClass();
        sql.getClass();
        selectionArgs.getClass();
        cancellationSignal.getClass();
        cursorFactory.getClass();
        Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, sql, selectionArgs, editTable, cancellationSignal);
        cursorRawQueryWithFactory.getClass();
        return cursorRawQueryWithFactory;
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: e */
    public static final void m99668e(@NotNull SQLiteDatabase sQLiteDatabase, boolean enable) {
        sQLiteDatabase.getClass();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(enable);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: f */
    public static final void m99669f(@NotNull SQLiteOpenHelper sQLiteOpenHelper, boolean enabled) {
        sQLiteOpenHelper.getClass();
        sQLiteOpenHelper.setWriteAheadLoggingEnabled(enabled);
    }
}
