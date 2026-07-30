package com.tencent.wcdb.database;

import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.support.CancellationSignal;
import java.util.Arrays;
import p149l.ctq0;
import p149l.dkq;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SQLiteProgram extends SQLiteClosable {
    private static final String[] EMPTY_STRING_ARRAY = new String[0];
    private static final String TAG = "WCDB.SQLiteProgram";
    private final Object[] mBindArgs;
    private SQLiteSession mBoundSession;
    private final String[] mColumnNames;
    private final SQLiteDatabase mDatabase;
    private final int mNumParameters;
    protected SQLiteConnection.PreparedStatement mPreparedStatement;
    private final boolean mReadOnly;
    private final String mSql;

    public SQLiteProgram(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal) {
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
            sQLiteDatabase.getThreadSession().prepare(strTrim, sQLiteDatabase.getThreadDefaultConnectionFlags(z), cancellationSignal, sQLiteStatementInfo);
            this.mReadOnly = sqlStatementType != 8 && sQLiteStatementInfo.readOnly;
            this.mColumnNames = sQLiteStatementInfo.columnNames;
            this.mNumParameters = sQLiteStatementInfo.numParameters;
        }
        if (objArr != null && objArr.length > this.mNumParameters) {
            dkq.m112270a("Too many bind arguments.  ", objArr.length, " arguments were provided but the statement needs ", this.mNumParameters, " arguments.");
            throw null;
        }
        int i = this.mNumParameters;
        if (i != 0) {
            Object[] objArr2 = new Object[i];
            this.mBindArgs = objArr2;
            if (objArr != null) {
                System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            }
        } else {
            this.mBindArgs = null;
        }
        this.mPreparedStatement = null;
        this.mBoundSession = null;
    }

    private void bind(int i, Object obj) {
        if (i < 1 || i > this.mNumParameters) {
            dkq.m112270a("Cannot bind argument at index ", i, " because the index is out of range.  The statement has ", this.mNumParameters, " parameters.");
        } else {
            this.mBindArgs[i - 1] = obj;
        }
    }

    public synchronized boolean acquirePreparedStatement(boolean z) {
        SQLiteSession threadSession = this.mDatabase.getThreadSession();
        SQLiteSession sQLiteSession = this.mBoundSession;
        if (threadSession == sQLiteSession) {
            return false;
        }
        if (sQLiteSession != null) {
            throw new IllegalStateException("SQLiteProgram has bound to another thread.");
        }
        SQLiteConnection.PreparedStatement preparedStatementAcquirePreparedStatement = threadSession.acquirePreparedStatement(this.mSql, this.mDatabase.getThreadDefaultConnectionFlags(this.mReadOnly), z);
        this.mPreparedStatement = preparedStatementAcquirePreparedStatement;
        preparedStatementAcquirePreparedStatement.bindArguments(this.mBindArgs);
        this.mBoundSession = threadSession;
        return true;
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
            ctq0.m108694a("the bind value at index ", i, " is null");
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
            ctq0.m108694a("the bind value at index ", i, " is null");
        }
    }

    public final void checkCorruption(SQLiteException sQLiteException) {
        if ((sQLiteException instanceof SQLiteDatabaseCorruptException) || ((sQLiteException instanceof SQLiteFullException) && this.mReadOnly)) {
            SQLiteDebug.collectLastIOTraceStats(this.mDatabase);
            this.mDatabase.onCorruption();
        }
    }

    public void clearBindings() {
        Object[] objArr = this.mBindArgs;
        if (objArr != null) {
            Arrays.fill(objArr, (Object) null);
        }
    }

    public void finalize() throws Throwable {
        synchronized (this) {
            if (this.mBoundSession != null || this.mPreparedStatement != null) {
                throw new SQLiteMisuseException("Acquired prepared statement is not released.");
            }
        }
        super.finalize();
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

    @Deprecated
    public final int getUniqueId() {
        return -1;
    }

    @Override // com.tencent.wcdb.database.SQLiteClosable
    public void onAllReferencesReleased() {
        releasePreparedStatement();
        clearBindings();
    }

    public synchronized void releasePreparedStatement() {
        SQLiteSession sQLiteSession = this.mBoundSession;
        if (sQLiteSession == null && this.mPreparedStatement == null) {
            return;
        }
        if (sQLiteSession == null || this.mPreparedStatement == null) {
            throw new IllegalStateException("Internal state error.");
        }
        if (sQLiteSession != this.mDatabase.getThreadSession()) {
            throw new IllegalStateException("SQLiteProgram has bound to another thread.");
        }
        this.mBoundSession.releasePreparedStatement(this.mPreparedStatement);
        this.mPreparedStatement = null;
        this.mBoundSession = null;
    }
}
