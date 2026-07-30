package io.requery.android.database.sqlite;

import android.database.DatabaseUtils;
import java.util.Arrays;
import p153l.cmq;
import p153l.fg4;
import p153l.i2r0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SQLiteProgram extends SQLiteClosable {
    private static final String[] EMPTY_STRING_ARRAY = new String[0];
    private final Object[] mBindArgs;
    private final String[] mColumnNames;
    private final SQLiteDatabase mDatabase;
    private final int mNumParameters;
    private final boolean mReadOnly;
    private final String mSql;

    public SQLiteProgram(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, fg4 fg4Var) {
        this.mDatabase = sQLiteDatabase;
        String strTrim = str.trim();
        this.mSql = strTrim;
        int sqlStatementType = DatabaseUtils.getSqlStatementType(strTrim);
        if (sqlStatementType == 4 || sqlStatementType == 5 || sqlStatementType == 6) {
            this.mReadOnly = false;
            this.mColumnNames = EMPTY_STRING_ARRAY;
            this.mNumParameters = 0;
        } else {
            boolean z = sqlStatementType == 1;
            SQLiteStatementInfo sQLiteStatementInfo = new SQLiteStatementInfo();
            sQLiteDatabase.getThreadSession().prepare(strTrim, sQLiteDatabase.getThreadDefaultConnectionFlags(z), fg4Var, sQLiteStatementInfo);
            this.mReadOnly = sQLiteStatementInfo.readOnly;
            this.mColumnNames = sQLiteStatementInfo.columnNames;
            this.mNumParameters = sQLiteStatementInfo.numParameters;
        }
        if (objArr != null && objArr.length > this.mNumParameters) {
            cmq.m111312a("Too many bind arguments.  ", objArr.length, " arguments were provided but the statement needs ", this.mNumParameters, " arguments.");
            throw null;
        }
        int i = this.mNumParameters;
        if (i == 0) {
            this.mBindArgs = null;
            return;
        }
        Object[] objArr2 = new Object[i];
        this.mBindArgs = objArr2;
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
    }

    private void bind(int i, Object obj) {
        if (i < 1 || i > this.mNumParameters) {
            cmq.m111312a("Cannot bind argument at index ", i, " because the index is out of range.  The statement has ", this.mNumParameters, " parameters.");
        } else {
            this.mBindArgs[i - 1] = obj;
        }
    }

    public void bindAllArgsAsStrings(String[] strArr) {
        if (strArr != null) {
            for (int length = strArr.length; length != 0; length--) {
                bindString(length, strArr[length - 1]);
            }
        }
    }

    public void bindBlob(int i, byte[] bArr) {
        if (bArr != null) {
            bind(i, bArr);
        } else {
            i2r0.m138234a("the bind value at index ", i, " is null");
        }
    }

    public void bindDouble(int i, double d) {
        bind(i, Double.valueOf(d));
    }

    public void bindLong(int i, long j) {
        bind(i, Long.valueOf(j));
    }

    public void bindNull(int i) {
        bind(i, null);
    }

    public void bindString(int i, String str) {
        if (str != null) {
            bind(i, str);
        } else {
            i2r0.m138234a("the bind value at index ", i, " is null");
        }
    }

    public void clearBindings() {
        Object[] objArr = this.mBindArgs;
        if (objArr != null) {
            Arrays.fill(objArr, (Object) null);
        }
    }

    public final Object[] getBindArgs() {
        return this.mBindArgs;
    }

    public final String[] getColumnNames() {
        return this.mColumnNames;
    }

    public final int getConnectionFlags() {
        return this.mDatabase.getThreadDefaultConnectionFlags(this.mReadOnly);
    }

    public final SQLiteDatabase getDatabase() {
        return this.mDatabase;
    }

    public final SQLiteSession getSession() {
        return this.mDatabase.getThreadSession();
    }

    public final String getSql() {
        return this.mSql;
    }

    @Override // io.requery.android.database.sqlite.SQLiteClosable
    public void onAllReferencesReleased() {
        clearBindings();
    }

    public final void onCorruption() {
        this.mDatabase.onCorruption();
    }
}
