package com.tencent.wcdb;

import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.os.Parcel;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.tencent.wcdb.database.SQLiteAbortException;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.database.SQLiteConstraintException;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDatabaseCorruptException;
import com.tencent.wcdb.database.SQLiteDiskIOException;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.database.SQLiteFullException;
import com.tencent.wcdb.database.SQLiteProgram;
import com.tencent.wcdb.database.SQLiteStatement;
import com.tencent.wcdb.support.Log;
import com.tencent.wcdb.support.OperationCanceledException;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.Collator;
import java.util.HashMap;
import java.util.Map;
import p149l.ig3;
import p149l.qkq0;
import p149l.qq3;
import p149l.qtc0;

/* JADX INFO: loaded from: classes2.dex */
public final class DatabaseUtils {
    private static final boolean DEBUG = false;
    private static final int EX_HAS_REPLY_HEADER = -128;
    public static final int STATEMENT_ABORT = 6;
    public static final int STATEMENT_ATTACH = 3;
    public static final int STATEMENT_BEGIN = 4;
    public static final int STATEMENT_COMMIT = 5;
    public static final int STATEMENT_DDL = 8;
    public static final int STATEMENT_OTHER = 99;
    public static final int STATEMENT_PRAGMA = 7;
    public static final int STATEMENT_SELECT = 1;
    public static final int STATEMENT_UNPREPARED = 9;
    public static final int STATEMENT_UPDATE = 2;
    private static final String TAG = "WCDB.DatabaseUtils";
    private static final char[] DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f'};
    private static Collator mColl = null;

    public static void appendEscapedSQLString(StringBuilder sb, String str) {
        sb.append('\'');
        if (str.indexOf(39) != -1) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt == '\'') {
                    sb.append('\'');
                }
                sb.append(cCharAt);
            }
        } else {
            sb.append(str);
        }
        sb.append('\'');
    }

    public static String[] appendSelectionArgs(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr.length == 0) {
            return strArr2;
        }
        String[] strArr3 = new String[strArr.length + strArr2.length];
        System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }

    public static final void appendValueToSql(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("NULL");
            return;
        }
        if (!(obj instanceof Boolean)) {
            appendEscapedSQLString(sb, obj.toString());
        } else if (((Boolean) obj).booleanValue()) {
            sb.append('1');
        } else {
            sb.append('0');
        }
    }

    public static void bindObjectToProgram(SQLiteProgram sQLiteProgram, int i, Object obj) {
        if (obj == null) {
            sQLiteProgram.bindNull(i);
            return;
        }
        if ((obj instanceof Double) || (obj instanceof Float)) {
            sQLiteProgram.bindDouble(i, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Number) {
            sQLiteProgram.bindLong(i, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                sQLiteProgram.bindLong(i, 1L);
                return;
            } else {
                sQLiteProgram.bindLong(i, 0L);
                return;
            }
        }
        if (obj instanceof byte[]) {
            sQLiteProgram.bindBlob(i, (byte[]) obj);
        } else {
            sQLiteProgram.bindString(i, obj.toString());
        }
    }

    public static String concatenateWhere(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return "(" + str + ") AND (" + str2 + ")";
    }

    public static void createDbFromSqlStatements(Context context, String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, int i, String str2) {
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = com.tencent.wcdb.support.Context.openOrCreateDatabase(context, str, bArr, sQLiteCipherSpec, 0, null);
        for (String str3 : TextUtils.split(str2, ";\n")) {
            if (!TextUtils.isEmpty(str3)) {
                sQLiteDatabaseOpenOrCreateDatabase.execSQL(str3);
            }
        }
        sQLiteDatabaseOpenOrCreateDatabase.setVersion(i);
        sQLiteDatabaseOpenOrCreateDatabase.close();
    }

    public static void cursorDoubleToContentValues(Cursor cursor, String str, ContentValues contentValues, String str2) {
        int columnIndex = cursor.getColumnIndex(str);
        if (cursor.isNull(columnIndex)) {
            contentValues.put(str2, (Double) null);
        } else {
            contentValues.put(str2, Double.valueOf(cursor.getDouble(columnIndex)));
        }
    }

    public static void cursorDoubleToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1 || cursor.isNull(columnIndex)) {
            return;
        }
        contentValues.put(str, Double.valueOf(cursor.getDouble(columnIndex)));
    }

    public static void cursorDoubleToCursorValues(Cursor cursor, String str, ContentValues contentValues) {
        cursorDoubleToContentValues(cursor, str, contentValues, str);
    }

    public static void cursorFillWindow(Cursor cursor, int i, CursorWindow cursorWindow) {
        boolean zPutNull;
        if (i < 0 || i >= cursor.getCount()) {
            return;
        }
        int position = cursor.getPosition();
        int columnCount = cursor.getColumnCount();
        cursorWindow.clear();
        cursorWindow.setStartPosition(i);
        cursorWindow.setNumColumns(columnCount);
        if (cursor.moveToPosition(i)) {
            while (cursorWindow.allocRow()) {
                for (int i2 = 0; i2 < columnCount; i2++) {
                    int type = cursor.getType(i2);
                    if (type == 0) {
                        zPutNull = cursorWindow.putNull(i, i2);
                    } else if (type == 1) {
                        zPutNull = cursorWindow.putLong(cursor.getLong(i2), i, i2);
                    } else if (type == 2) {
                        zPutNull = cursorWindow.putDouble(cursor.getDouble(i2), i, i2);
                    } else if (type != 4) {
                        String string = cursor.getString(i2);
                        zPutNull = string != null ? cursorWindow.putString(string, i, i2) : cursorWindow.putNull(i, i2);
                    } else {
                        byte[] blob = cursor.getBlob(i2);
                        zPutNull = blob != null ? cursorWindow.putBlob(blob, i, i2) : cursorWindow.putNull(i, i2);
                    }
                    if (!zPutNull) {
                        cursorWindow.freeLastRow();
                        break;
                    }
                }
                i++;
                if (!cursor.moveToNext()) {
                    break;
                }
            }
        }
        cursor.moveToPosition(position);
    }

    public static void cursorFloatToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1 || cursor.isNull(columnIndex)) {
            return;
        }
        contentValues.put(str, Float.valueOf(cursor.getFloat(columnIndex)));
    }

    public static void cursorIntToContentValues(Cursor cursor, String str, ContentValues contentValues, String str2) {
        int columnIndex = cursor.getColumnIndex(str);
        if (cursor.isNull(columnIndex)) {
            contentValues.put(str2, (Integer) null);
        } else {
            contentValues.put(str2, Integer.valueOf(cursor.getInt(columnIndex)));
        }
    }

    public static void cursorIntToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1 || cursor.isNull(columnIndex)) {
            return;
        }
        contentValues.put(str, Integer.valueOf(cursor.getInt(columnIndex)));
    }

    public static void cursorLongToContentValues(Cursor cursor, String str, ContentValues contentValues, String str2) {
        int columnIndex = cursor.getColumnIndex(str);
        if (cursor.isNull(columnIndex)) {
            contentValues.put(str2, (Long) null);
        } else {
            contentValues.put(str2, Long.valueOf(cursor.getLong(columnIndex)));
        }
    }

    public static void cursorLongToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1 || cursor.isNull(columnIndex)) {
            return;
        }
        contentValues.put(str, Long.valueOf(cursor.getLong(columnIndex)));
    }

    public static int cursorPickFillWindowStartPosition(int i, int i2) {
        return Math.max(i - (i2 / 3), 0);
    }

    public static void cursorRowToContentValues(Cursor cursor, ContentValues contentValues) {
        AbstractWindowedCursor abstractWindowedCursor = cursor instanceof AbstractWindowedCursor ? (AbstractWindowedCursor) cursor : null;
        String[] columnNames = cursor.getColumnNames();
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            if (abstractWindowedCursor == null || !abstractWindowedCursor.isBlob(i)) {
                contentValues.put(columnNames[i], cursor.getString(i));
            } else {
                contentValues.put(columnNames[i], cursor.getBlob(i));
            }
        }
    }

    public static void cursorShortToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1 || cursor.isNull(columnIndex)) {
            return;
        }
        contentValues.put(str, Short.valueOf(cursor.getShort(columnIndex)));
    }

    public static void cursorStringToContentValues(Cursor cursor, String str, ContentValues contentValues, String str2) {
        contentValues.put(str2, cursor.getString(cursor.getColumnIndexOrThrow(str)));
    }

    public static void cursorStringToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1 || cursor.isNull(columnIndex)) {
            return;
        }
        contentValues.put(str, cursor.getString(columnIndex));
    }

    public static void cursorStringToInsertHelper(Cursor cursor, String str, InsertHelper insertHelper, int i) {
        insertHelper.bind(i, cursor.getString(cursor.getColumnIndexOrThrow(str)));
    }

    public static void dumpCurrentRow(Cursor cursor, StringBuilder sb) {
        String string;
        String[] columnNames = cursor.getColumnNames();
        sb.append("" + cursor.getPosition() + " {\n");
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            try {
                string = cursor.getString(i);
            } catch (SQLiteException unused) {
                string = "<unprintable>";
            }
            sb.append("   " + columnNames[i] + '=' + string + SignParameters.NEW_LINE);
        }
        sb.append("}\n");
    }

    public static String dumpCurrentRowToString(Cursor cursor) {
        StringBuilder sb = new StringBuilder();
        dumpCurrentRow(cursor, sb);
        return sb.toString();
    }

    public static void dumpCursor(Cursor cursor, StringBuilder sb) {
        sb.append(">>>>> Dumping cursor " + cursor + SignParameters.NEW_LINE);
        if (cursor != null) {
            int position = cursor.getPosition();
            cursor.moveToPosition(-1);
            while (cursor.moveToNext()) {
                dumpCurrentRow(cursor, sb);
            }
            cursor.moveToPosition(position);
        }
        sb.append("<<<<<\n");
    }

    public static String dumpCursorToString(Cursor cursor) {
        StringBuilder sb = new StringBuilder();
        dumpCursor(cursor, sb);
        return sb.toString();
    }

    private static char[] encodeHex(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = DIGITS;
            cArr[i] = cArr2[(b & 240) >>> 4];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return cArr;
    }

    private static int extractSqlCode(String str) {
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            int iCharAt = str.charAt(i2);
            if (iCharAt >= 97 && iCharAt <= 122) {
                iCharAt -= 32;
            } else if (iCharAt >= 128) {
                return 0;
            }
            i |= (iCharAt & 127) << (i2 * 8);
        }
        return i;
    }

    public static int findRowIdColumnIndex(String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (strArr[i].equals("_id")) {
                return i;
            }
        }
        return -1;
    }

    public static String getCollationKey(String str) {
        byte[] collationKeyInBytes = getCollationKeyInBytes(str);
        try {
            return new String(collationKeyInBytes, 0, getKeyLen(collationKeyInBytes), "ISO8859_1");
        } catch (Exception unused) {
            return "";
        }
    }

    private static byte[] getCollationKeyInBytes(String str) {
        if (mColl == null) {
            Collator collator = Collator.getInstance();
            mColl = collator;
            collator.setStrength(0);
        }
        return mColl.getCollationKey(str).toByteArray();
    }

    public static String getHexCollationKey(String str) {
        byte[] collationKeyInBytes = getCollationKeyInBytes(str);
        return new String(encodeHex(collationKeyInBytes), 0, getKeyLen(collationKeyInBytes) * 2);
    }

    private static int getKeyLen(byte[] bArr) {
        return bArr[bArr.length + (-1)] != 0 ? bArr.length : bArr.length - 1;
    }

    public static int getSqlStatementType(String str) {
        String strTrim = str.trim();
        if (strTrim.length() < 3) {
            return 99;
        }
        switch (extractSqlCode(strTrim)) {
            case 4279873:
            case 5522756:
                return 9;
            case 4280912:
                return 7;
            case 4476485:
            case 5066563:
                return 5;
            case 4477013:
            case 4998468:
            case 5260626:
            case 5459529:
                return 2;
            case 4543043:
            case 5198404:
            case 5524545:
                return 8;
            case 4670786:
                return 4;
            case 4998483:
                return 1;
            case 5001042:
                return 6;
            case 5526593:
                return 3;
            default:
                return 99;
        }
    }

    public static int getTypeOfObject(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof byte[]) {
            return 4;
        }
        if ((obj instanceof Float) || (obj instanceof Double)) {
            return 2;
        }
        return ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) ? 1 : 3;
    }

    public static long longForQuery(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        SQLiteStatement sQLiteStatementCompileStatement = sQLiteDatabase.compileStatement(str);
        try {
            return longForQuery(sQLiteStatementCompileStatement, strArr);
        } finally {
            sQLiteStatementCompileStatement.close();
        }
    }

    public static boolean objectEquals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static boolean queryIsEmpty(SQLiteDatabase sQLiteDatabase, String str) {
        StringBuilder sb = new StringBuilder("select exists(select 1 from ");
        sb.append(str);
        sb.append(")");
        return longForQuery(sQLiteDatabase, sb.toString(), null) == 0;
    }

    public static long queryNumEntries(SQLiteDatabase sQLiteDatabase, String str, String str2, String[] strArr) {
        String str3;
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = " where " + str2;
        }
        return longForQuery(sQLiteDatabase, "select count(*) from " + str + str3, strArr);
    }

    private static final int readExceptionCode(Parcel parcel) {
        int i = parcel.readInt();
        if (i != EX_HAS_REPLY_HEADER) {
            return i;
        }
        if (parcel.readInt() != 0) {
            return 0;
        }
        Log.m84619e(TAG, "Unexpected zero-sized Parcel reply header.");
        return 0;
    }

    private static final void readExceptionFromParcel(Parcel parcel, String str, int i) {
        switch (i) {
            case 2:
                ig3.m135964a(str);
                return;
            case 3:
                qq3.m175877a(str);
                return;
            case 4:
                throw new SQLiteAbortException(str);
            case 5:
                throw new SQLiteConstraintException(str);
            case 6:
                throw new SQLiteDatabaseCorruptException(str);
            case 7:
                throw new SQLiteFullException(str);
            case 8:
                throw new SQLiteDiskIOException(str);
            case 9:
                throw new SQLiteException(str);
            case 10:
            default:
                parcel.readException(i, str);
                return;
            case 11:
                throw new OperationCanceledException(str);
        }
    }

    public static void readExceptionWithFileNotFoundExceptionFromParcel(Parcel parcel) throws FileNotFoundException {
        int exceptionCode = readExceptionCode(parcel);
        if (exceptionCode == 0) {
            return;
        }
        String string = parcel.readString();
        if (exceptionCode == 1) {
            throw new FileNotFoundException(string);
        }
        readExceptionFromParcel(parcel, string, exceptionCode);
    }

    public static void readExceptionWithOperationApplicationExceptionFromParcel(Parcel parcel) throws OperationApplicationException {
        int exceptionCode = readExceptionCode(parcel);
        if (exceptionCode == 0) {
            return;
        }
        String string = parcel.readString();
        if (exceptionCode == 10) {
            throw new OperationApplicationException(string);
        }
        readExceptionFromParcel(parcel, string, exceptionCode);
    }

    public static String sqlEscapeString(String str) {
        StringBuilder sb = new StringBuilder();
        appendEscapedSQLString(sb, str);
        return sb.toString();
    }

    public static String stringForQuery(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        SQLiteStatement sQLiteStatementCompileStatement = sQLiteDatabase.compileStatement(str);
        try {
            return stringForQuery(sQLiteStatementCompileStatement, strArr);
        } finally {
            sQLiteStatementCompileStatement.close();
        }
    }

    public static final void writeExceptionToParcel(Parcel parcel, Exception exc) {
        int i;
        boolean z = false;
        int i2 = 1;
        if (!(exc instanceof FileNotFoundException)) {
            if (exc instanceof IllegalArgumentException) {
                i = 2;
            } else if (exc instanceof UnsupportedOperationException) {
                i = 3;
            } else if (exc instanceof SQLiteAbortException) {
                i = 4;
            } else if (exc instanceof SQLiteConstraintException) {
                i = 5;
            } else if (exc instanceof SQLiteDatabaseCorruptException) {
                i = 6;
            } else if (exc instanceof SQLiteFullException) {
                i = 7;
            } else if (exc instanceof SQLiteDiskIOException) {
                i = 8;
            } else if (exc instanceof SQLiteException) {
                i = 9;
            } else if (exc instanceof OperationApplicationException) {
                i = 10;
            } else {
                if (!(exc instanceof OperationCanceledException)) {
                    parcel.writeException(exc);
                    Log.m84620e(TAG, "Writing exception to parcel", exc);
                    return;
                }
                i2 = 11;
            }
            z = true;
            i2 = i;
        }
        parcel.writeInt(i2);
        parcel.writeString(exc.getMessage());
        if (z) {
            Log.m84620e(TAG, "Writing exception to parcel", exc);
        }
    }

    @Deprecated
    public static class InsertHelper {
        public static final int TABLE_INFO_PRAGMA_COLUMNNAME_INDEX = 1;
        public static final int TABLE_INFO_PRAGMA_DEFAULT_INDEX = 4;
        private HashMap<String, Integer> mColumns;
        private final SQLiteDatabase mDb;
        private final String mTableName;
        private String mInsertSQL = null;
        private SQLiteStatement mInsertStatement = null;
        private SQLiteStatement mReplaceStatement = null;
        private SQLiteStatement mPreparedStatement = null;

        public InsertHelper(SQLiteDatabase sQLiteDatabase, String str) {
            this.mDb = sQLiteDatabase;
            this.mTableName = str;
        }

        private void buildSQL() throws SQLException {
            StringBuilder sb = new StringBuilder(128);
            sb.append("INSERT INTO ");
            sb.append(this.mTableName);
            sb.append(" (");
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("VALUES (");
            Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = this.mDb.rawQuery("PRAGMA table_info(" + this.mTableName + ")", null);
                this.mColumns = new HashMap<>(cursorRawQuery.getCount());
                int i = 1;
                while (cursorRawQuery.moveToNext()) {
                    String string = cursorRawQuery.getString(1);
                    String string2 = cursorRawQuery.getString(4);
                    this.mColumns.put(string, Integer.valueOf(i));
                    sb.append("'");
                    sb.append(string);
                    sb.append("'");
                    if (string2 == null) {
                        sb2.append("?");
                    } else {
                        sb2.append("COALESCE(?, ");
                        sb2.append(string2);
                        sb2.append(")");
                    }
                    sb.append(i == cursorRawQuery.getCount() ? ") " : ", ");
                    sb2.append(i == cursorRawQuery.getCount() ? ");" : ", ");
                    i++;
                }
                cursorRawQuery.close();
                sb.append((CharSequence) sb2);
                this.mInsertSQL = sb.toString();
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th;
            }
        }

        private SQLiteStatement getStatement(boolean z) throws SQLException {
            if (!z) {
                if (this.mInsertStatement == null) {
                    if (this.mInsertSQL == null) {
                        buildSQL();
                    }
                    this.mInsertStatement = this.mDb.compileStatement(this.mInsertSQL);
                }
                return this.mInsertStatement;
            }
            if (this.mReplaceStatement == null) {
                if (this.mInsertSQL == null) {
                    buildSQL();
                }
                this.mReplaceStatement = this.mDb.compileStatement("INSERT OR REPLACE".concat(this.mInsertSQL.substring(6)));
            }
            return this.mReplaceStatement;
        }

        private long insertInternal(ContentValues contentValues, boolean z) {
            this.mDb.beginTransactionNonExclusive();
            try {
                SQLiteStatement statement = getStatement(z);
                statement.clearBindings();
                for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                    DatabaseUtils.bindObjectToProgram(statement, getColumnIndex(entry.getKey()), entry.getValue());
                }
                long jExecuteInsert = statement.executeInsert();
                this.mDb.setTransactionSuccessful();
                return jExecuteInsert;
            } catch (SQLException e) {
                Log.m84620e(DatabaseUtils.TAG, "Error inserting " + contentValues + " into table  " + this.mTableName, e);
                return -1L;
            } finally {
                this.mDb.endTransaction();
            }
        }

        public void bind(int i, boolean z) {
            this.mPreparedStatement.bindLong(i, z ? 1L : 0L);
        }

        public void bindNull(int i) {
            this.mPreparedStatement.bindNull(i);
        }

        public void close() {
            SQLiteStatement sQLiteStatement = this.mInsertStatement;
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
                this.mInsertStatement = null;
            }
            SQLiteStatement sQLiteStatement2 = this.mReplaceStatement;
            if (sQLiteStatement2 != null) {
                sQLiteStatement2.close();
                this.mReplaceStatement = null;
            }
            this.mInsertSQL = null;
            this.mColumns = null;
        }

        public long execute() {
            SQLiteStatement sQLiteStatement = this.mPreparedStatement;
            if (sQLiteStatement == null) {
                qkq0.m175383a("you must prepare this inserter before calling execute");
                return 0L;
            }
            try {
                return sQLiteStatement.executeInsert();
            } catch (SQLException e) {
                Log.m84620e(DatabaseUtils.TAG, "Error executing InsertHelper with table " + this.mTableName, e);
                return -1L;
            } finally {
                this.mPreparedStatement = null;
            }
        }

        public int getColumnIndex(String str) {
            getStatement(false);
            Integer num = this.mColumns.get(str);
            if (num != null) {
                return num.intValue();
            }
            qtc0.m176411a("column '", str, "' is invalid");
            return 0;
        }

        public long insert(ContentValues contentValues) {
            return insertInternal(contentValues, false);
        }

        public void prepareForInsert() {
            SQLiteStatement statement = getStatement(false);
            this.mPreparedStatement = statement;
            statement.clearBindings();
        }

        public void prepareForReplace() {
            SQLiteStatement statement = getStatement(true);
            this.mPreparedStatement = statement;
            statement.clearBindings();
        }

        public long replace(ContentValues contentValues) {
            return insertInternal(contentValues, true);
        }

        public void bind(int i, float f) {
            this.mPreparedStatement.bindDouble(i, f);
        }

        public void bind(int i, long j) {
            this.mPreparedStatement.bindLong(i, j);
        }

        public void bind(int i, int i2) {
            this.mPreparedStatement.bindLong(i, i2);
        }

        public void bind(int i, double d) {
            this.mPreparedStatement.bindDouble(i, d);
        }

        public void bind(int i, byte[] bArr) {
            SQLiteStatement sQLiteStatement = this.mPreparedStatement;
            if (bArr == null) {
                sQLiteStatement.bindNull(i);
            } else {
                sQLiteStatement.bindBlob(i, bArr);
            }
        }

        public void bind(int i, String str) {
            SQLiteStatement sQLiteStatement = this.mPreparedStatement;
            if (str == null) {
                sQLiteStatement.bindNull(i);
            } else {
                sQLiteStatement.bindString(i, str);
            }
        }
    }

    public static void cursorStringToContentValues(Cursor cursor, String str, ContentValues contentValues) {
        cursorStringToContentValues(cursor, str, contentValues, str);
    }

    public static long longForQuery(SQLiteStatement sQLiteStatement, String[] strArr) {
        sQLiteStatement.bindAllArgsAsStrings(strArr);
        return sQLiteStatement.simpleQueryForLong();
    }

    public static String stringForQuery(SQLiteStatement sQLiteStatement, String[] strArr) {
        sQLiteStatement.bindAllArgsAsStrings(strArr);
        return sQLiteStatement.simpleQueryForString();
    }

    public static void cursorIntToContentValues(Cursor cursor, String str, ContentValues contentValues) {
        cursorIntToContentValues(cursor, str, contentValues, str);
    }

    public static void cursorLongToContentValues(Cursor cursor, String str, ContentValues contentValues) {
        cursorLongToContentValues(cursor, str, contentValues, str);
    }

    public static void createDbFromSqlStatements(Context context, String str, int i, String str2) {
        createDbFromSqlStatements(context, str, null, null, i, str2);
    }

    public static long queryNumEntries(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        return queryNumEntries(sQLiteDatabase, str, str2, null);
    }

    public static long queryNumEntries(SQLiteDatabase sQLiteDatabase, String str) {
        return queryNumEntries(sQLiteDatabase, str, null, null);
    }

    public static void dumpCursor(Cursor cursor, PrintStream printStream) {
        printStream.println(">>>>> Dumping cursor " + cursor);
        if (cursor != null) {
            int position = cursor.getPosition();
            cursor.moveToPosition(-1);
            while (cursor.moveToNext()) {
                dumpCurrentRow(cursor, printStream);
            }
            cursor.moveToPosition(position);
        }
        printStream.println("<<<<<");
    }

    public static void dumpCursor(Cursor cursor) {
        dumpCursor(cursor, System.out);
    }

    public static final void readExceptionFromParcel(Parcel parcel) {
        int exceptionCode = readExceptionCode(parcel);
        if (exceptionCode == 0) {
            return;
        }
        readExceptionFromParcel(parcel, parcel.readString(), exceptionCode);
    }

    public static void dumpCurrentRow(Cursor cursor, PrintStream printStream) {
        String string;
        String[] columnNames = cursor.getColumnNames();
        printStream.println("" + cursor.getPosition() + " {");
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            try {
                string = cursor.getString(i);
            } catch (SQLiteException unused) {
                string = "<unprintable>";
            }
            printStream.println("   " + columnNames[i] + '=' + string);
        }
        printStream.println("}");
    }

    public static void dumpCurrentRow(Cursor cursor) {
        dumpCurrentRow(cursor, System.out);
    }
}
