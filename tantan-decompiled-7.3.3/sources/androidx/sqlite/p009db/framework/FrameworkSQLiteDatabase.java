package androidx.sqlite.p009db.framework;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.sqlite.p009db.framework.FrameworkSQLiteDatabase;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.sina.weibo.sdk.constant.WBConstants;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.i7h0;
import p153l.m8j;
import p153l.n7h0;
import p153l.n8j;
import p153l.p7f;
import p153l.q7h0;
import p153l.r7h0;
import p153l.vpf0;
import p153l.wg3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 b2\u00020\u0001:\u0001GB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010!\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0017¢\u0006\u0004\b!\u0010\"J'\u0010(\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J5\u0010.\u001a\u00020$2\u0006\u0010#\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010\u00062\u0012\u0010-\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010,\u0018\u00010+H\u0016¢\u0006\u0004\b.\u0010/JE\u00100\u001a\u00020$2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\b\u0010*\u001a\u0004\u0018\u00010\u00062\u0012\u0010-\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010,\u0018\u00010+H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b2\u00103J)\u00102\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0010\u00104\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010,0+H\u0016¢\u0006\u0004\b2\u00105J\u0017\u00107\u001a\u00020\u00112\u0006\u00106\u001a\u00020$H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u000b2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020$H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u0011H\u0017¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u000bH\u0016¢\u0006\u0004\bC\u0010\rJ\u0015\u0010E\u001a\u00020\u00112\u0006\u0010D\u001a\u00020\u0002¢\u0006\u0004\bE\u0010FR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010\u0013R$\u0010N\u001a\u00020$2\u0006\u0010J\u001a\u00020$8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bK\u0010L\"\u0004\bM\u0010?R$\u0010R\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bO\u0010P\"\u0004\b\u0017\u0010QR$\u0010U\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bS\u0010P\"\u0004\bT\u0010QR\u0014\u0010V\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010\u0013R\u0014\u0010W\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010\u0013R\u0016\u0010Z\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\u0013R(\u0010`\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060]\u0018\u00010\\8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010\u0013¨\u0006c"}, m88121d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "Ll/n7h0;", "Landroid/database/sqlite/SQLiteDatabase;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;)V", "", "sql", "Ll/r7h0;", p7f.GPS_DIRECTION_TRUE, "(Ljava/lang/String;)Ll/r7h0;", "", "beginTransaction", "()V", "beginTransactionNonExclusive", "endTransaction", "setTransactionSuccessful", "", "inTransaction", "()Z", "yieldIfContendedSafely", "", "numBytes", "setMaximumSize", "(J)J", BLivePkInviteSource.query, "Landroid/database/Cursor;", "(Ljava/lang/String;)Landroid/database/Cursor;", "Ll/q7h0;", "E", "(Ll/q7h0;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "cancellationSignal", "c0", "(Ll/q7h0;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "D", "(Ljava/lang/String;ILandroid/content/ContentValues;)J", "whereClause", "", "", "whereArgs", "f", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "W", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "execSQL", "(Ljava/lang/String;)V", "bindArgs", "(Ljava/lang/String;[Ljava/lang/Object;)V", "newVersion", "needUpgrade", "(I)Z", "Ljava/util/Locale;", "locale", "setLocale", "(Ljava/util/Locale;)V", "cacheSize", "setMaxSqlCacheSize", "(I)V", "enabled", "setForeignKeyConstraintsEnabled", "(Z)V", "close", "sqLiteDatabase", "e", "(Landroid/database/sqlite/SQLiteDatabase;)Z", "a", "Landroid/database/sqlite/SQLiteDatabase;", "isDbLockedByCurrentThread", "value", "getVersion", "()I", "setVersion", WBConstants.AUTH_PARAMS_VERSION, "getMaximumSize", "()J", "(J)V", "maximumSize", "getPageSize", "setPageSize", "pageSize", "isReadOnly", "isOpen", "getPath", "()Ljava/lang/String;", "path", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "getAttachedDbs", "()Ljava/util/List;", "attachedDbs", "isDatabaseIntegrityOk", "Companion", "sqlite-framework_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class FrameworkSQLiteDatabase implements n7h0 {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final String[] f3101b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final String[] f3102c = new String[0];

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SQLiteDatabase delegate;

    public FrameworkSQLiteDatabase(@NotNull SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        this.delegate = sQLiteDatabase;
    }

    /* JADX INFO: renamed from: b */
    public static Cursor m4051b(q7h0 q7h0Var, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        q7h0Var.getClass();
        sQLiteQuery.getClass();
        q7h0Var.mo175654b(new m8j(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: renamed from: d */
    public static Cursor m4052d(Function4 function4, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        function4.getClass();
        return (Cursor) function4.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // p153l.n7h0
    /* JADX INFO: renamed from: D */
    public long mo3894D(@NotNull String table, int conflictAlgorithm, @NotNull ContentValues values) throws SQLException {
        table.getClass();
        values.getClass();
        return this.delegate.insertWithOnConflict(table, null, values, conflictAlgorithm);
    }

    @Override // p153l.n7h0
    @NotNull
    /* JADX INFO: renamed from: E */
    public Cursor mo3895E(@NotNull final q7h0 query) {
        query.getClass();
        final Function4<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor> function4 = new Function4<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor>() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$query$cursorFactory$1
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            @NotNull
            public final SQLiteCursor invoke(@Nullable SQLiteDatabase sQLiteDatabase, @Nullable SQLiteCursorDriver sQLiteCursorDriver, @Nullable String str, @Nullable SQLiteQuery sQLiteQuery) {
                q7h0 q7h0Var = query;
                sQLiteQuery.getClass();
                q7h0Var.mo175654b(new m8j(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        };
        Cursor cursorRawQueryWithFactory = this.delegate.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: l.j8j
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return FrameworkSQLiteDatabase.m4052d(function4, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, query.getCom.p1.mobile.putong.live.base.data.BLivePkInviteSource.query java.lang.String(), f3102c, null);
        cursorRawQueryWithFactory.getClass();
        return cursorRawQueryWithFactory;
    }

    @Override // p153l.n7h0
    @NotNull
    /* JADX INFO: renamed from: T */
    public r7h0 mo3896T(@NotNull String sql) {
        sql.getClass();
        SQLiteStatement sQLiteStatementCompileStatement = this.delegate.compileStatement(sql);
        sQLiteStatementCompileStatement.getClass();
        return new n8j(sQLiteStatementCompileStatement);
    }

    @Override // p153l.n7h0
    /* JADX INFO: renamed from: W */
    public int mo3897W(@NotNull String table, int conflictAlgorithm, @NotNull ContentValues values, @Nullable String whereClause, @Nullable Object[] whereArgs) {
        table.getClass();
        values.getClass();
        int i = 0;
        if (values.size() == 0) {
            wg3.m206174a("Empty values");
            return 0;
        }
        int size = values.size();
        int length = whereArgs == null ? size : whereArgs.length + size;
        Object[] objArr = new Object[length];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(f3101b[conflictAlgorithm]);
        sb.append(table);
        sb.append(" SET ");
        for (String str : values.keySet()) {
            sb.append(i > 0 ? Constants.SEPARATOR_COMMA : "");
            sb.append(str);
            objArr[i] = values.get(str);
            sb.append("=?");
            i++;
        }
        if (whereArgs != null) {
            for (int i2 = size; i2 < length; i2++) {
                objArr[i2] = whereArgs[i2 - size];
            }
        }
        if (!TextUtils.isEmpty(whereClause)) {
            sb.append(" WHERE ");
            sb.append(whereClause);
        }
        r7h0 r7h0VarMo3896T = mo3896T(sb.toString());
        vpf0.INSTANCE.m202235b(r7h0VarMo3896T, objArr);
        return r7h0VarMo3896T.executeUpdateDelete();
    }

    @Override // p153l.n7h0
    public void beginTransaction() {
        this.delegate.beginTransaction();
    }

    @Override // p153l.n7h0
    public void beginTransactionNonExclusive() {
        this.delegate.beginTransactionNonExclusive();
    }

    @Override // p153l.n7h0
    @RequiresApi(16)
    @NotNull
    /* JADX INFO: renamed from: c0 */
    public Cursor mo3898c0(@NotNull final q7h0 query, @Nullable CancellationSignal cancellationSignal) {
        query.getClass();
        SQLiteDatabase sQLiteDatabase = this.delegate;
        String query2 = query.getCom.p1.mobile.putong.live.base.data.BLivePkInviteSource.query java.lang.String();
        String[] strArr = f3102c;
        cancellationSignal.getClass();
        return i7h0.m138954d(sQLiteDatabase, query2, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: l.i8j
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return FrameworkSQLiteDatabase.m4051b(query, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4053e(@NotNull SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.getClass();
        return Intrinsics.m88377d(this.delegate, sqLiteDatabase);
    }

    @Override // p153l.n7h0
    public void endTransaction() {
        this.delegate.endTransaction();
    }

    @Override // p153l.n7h0
    public void execSQL(@NotNull String sql, @NotNull Object[] bindArgs) throws SQLException {
        sql.getClass();
        bindArgs.getClass();
        this.delegate.execSQL(sql, bindArgs);
    }

    @Override // p153l.n7h0
    /* JADX INFO: renamed from: f */
    public int mo3899f(@NotNull String table, @Nullable String whereClause, @Nullable Object[] whereArgs) {
        table.getClass();
        StringBuilder sb = new StringBuilder("DELETE FROM ");
        sb.append(table);
        if (whereClause != null && whereClause.length() != 0) {
            sb.append(" WHERE ");
            sb.append(whereClause);
        }
        r7h0 r7h0VarMo3896T = mo3896T(sb.toString());
        vpf0.INSTANCE.m202235b(r7h0VarMo3896T, whereArgs);
        return r7h0VarMo3896T.executeUpdateDelete();
    }

    @Override // p153l.n7h0
    @Nullable
    public List<Pair<String, String>> getAttachedDbs() {
        return this.delegate.getAttachedDbs();
    }

    @Override // p153l.n7h0
    public long getMaximumSize() {
        return this.delegate.getMaximumSize();
    }

    @Override // p153l.n7h0
    public long getPageSize() {
        return this.delegate.getPageSize();
    }

    @Override // p153l.n7h0
    @Nullable
    public String getPath() {
        return this.delegate.getPath();
    }

    @Override // p153l.n7h0
    public int getVersion() {
        return this.delegate.getVersion();
    }

    @Override // p153l.n7h0
    public boolean inTransaction() {
        return this.delegate.inTransaction();
    }

    @Override // p153l.n7h0
    public boolean isDatabaseIntegrityOk() {
        return this.delegate.isDatabaseIntegrityOk();
    }

    @Override // p153l.n7h0
    public boolean isDbLockedByCurrentThread() {
        return this.delegate.isDbLockedByCurrentThread();
    }

    @Override // p153l.n7h0
    public boolean isOpen() {
        return this.delegate.isOpen();
    }

    @Override // p153l.n7h0
    public boolean isReadOnly() {
        return this.delegate.isReadOnly();
    }

    @Override // p153l.n7h0
    @RequiresApi(api = 16)
    public boolean isWriteAheadLoggingEnabled() {
        return i7h0.m138953c(this.delegate);
    }

    @Override // p153l.n7h0
    public boolean needUpgrade(int newVersion) {
        return this.delegate.needUpgrade(newVersion);
    }

    @Override // p153l.n7h0
    @NotNull
    public Cursor query(@NotNull String query) {
        query.getClass();
        return mo3895E(new vpf0(query));
    }

    @Override // p153l.n7h0
    @RequiresApi(api = 16)
    public void setForeignKeyConstraintsEnabled(boolean enabled) {
        i7h0.m138955e(this.delegate, enabled);
    }

    @Override // p153l.n7h0
    public void setLocale(@NotNull Locale locale) {
        locale.getClass();
        this.delegate.setLocale(locale);
    }

    @Override // p153l.n7h0
    public void setMaxSqlCacheSize(int cacheSize) {
        this.delegate.setMaxSqlCacheSize(cacheSize);
    }

    @Override // p153l.n7h0
    public long setMaximumSize(long numBytes) {
        this.delegate.setMaximumSize(numBytes);
        return this.delegate.getMaximumSize();
    }

    @Override // p153l.n7h0
    public void setPageSize(long j) {
        this.delegate.setPageSize(j);
    }

    @Override // p153l.n7h0
    public void setTransactionSuccessful() {
        this.delegate.setTransactionSuccessful();
    }

    @Override // p153l.n7h0
    public void setVersion(int i) {
        this.delegate.setVersion(i);
    }

    @Override // p153l.n7h0
    public boolean yieldIfContendedSafely() {
        return this.delegate.yieldIfContendedSafely();
    }

    @Override // p153l.n7h0
    public void execSQL(@NotNull String sql) throws SQLException {
        sql.getClass();
        this.delegate.execSQL(sql);
    }
}
