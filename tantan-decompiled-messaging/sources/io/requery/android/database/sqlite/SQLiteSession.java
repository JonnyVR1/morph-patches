package io.requery.android.database.sqlite;

import android.annotation.SuppressLint;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.ParcelFileDescriptor;
import com.tantanapp.common.utils.CrashHelper;
import io.requery.android.database.CursorWindow;
import p149l.gf4;
import p149l.ig3;
import p149l.qkq0;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"Assert"})
public final class SQLiteSession {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int TRANSACTION_MODE_DEFERRED = 0;
    public static final int TRANSACTION_MODE_EXCLUSIVE = 2;
    public static final int TRANSACTION_MODE_IMMEDIATE = 1;
    private SQLiteConnection mConnection;
    private int mConnectionFlags;
    private final SQLiteConnectionPool mConnectionPool;
    private int mConnectionUseCount;
    private Transaction mTransactionPool;
    private Transaction mTransactionStack;

    public static final class Transaction {
        public boolean mChildFailed;
        public SQLiteTransactionListener mListener;
        public boolean mMarkedSuccessful;
        public int mMode;
        public Transaction mParent;

        private Transaction() {
        }
    }

    public SQLiteSession(SQLiteConnectionPool sQLiteConnectionPool) {
        if (sQLiteConnectionPool != null) {
            this.mConnectionPool = sQLiteConnectionPool;
        } else {
            ig3.m135964a("connectionPool must not be null");
            throw null;
        }
    }

    private void acquireConnection(String str, int i, gf4 gf4Var) {
        if (this.mConnection == null) {
            this.mConnection = this.mConnectionPool.acquireConnection(str, i, gf4Var);
            this.mConnectionFlags = i;
        }
        this.mConnectionUseCount++;
    }

    private void beginTransactionUnchecked(int i, SQLiteTransactionListener sQLiteTransactionListener, int i2, gf4 gf4Var) {
        if (gf4Var != null) {
            gf4Var.m125877e();
        }
        if (this.mTransactionStack == null) {
            acquireConnection(null, i2, gf4Var);
        }
        try {
            if (this.mTransactionStack == null) {
                if (i != 1) {
                    SQLiteConnection sQLiteConnection = this.mConnection;
                    if (i != 2) {
                        sQLiteConnection.execute("BEGIN;", null, gf4Var);
                    } else {
                        sQLiteConnection.execute("BEGIN EXCLUSIVE;", null, gf4Var);
                    }
                } else {
                    this.mConnection.execute("BEGIN IMMEDIATE;", null, gf4Var);
                }
            }
            if (sQLiteTransactionListener != null) {
                try {
                    sQLiteTransactionListener.onBegin();
                } catch (RuntimeException e) {
                    if (this.mTransactionStack == null) {
                        this.mConnection.execute("ROLLBACK;", null, gf4Var);
                    }
                    throw e;
                }
            }
            Transaction transactionObtainTransaction = obtainTransaction(i, sQLiteTransactionListener);
            transactionObtainTransaction.mParent = this.mTransactionStack;
            this.mTransactionStack = transactionObtainTransaction;
        } catch (Throwable th) {
            if (this.mTransactionStack == null) {
                releaseConnection();
            }
            throw th;
        }
    }

    private void endTransactionUnchecked(gf4 gf4Var, boolean z) {
        if (gf4Var != null) {
            gf4Var.m125877e();
        }
        Transaction transaction = this.mTransactionStack;
        boolean z2 = false;
        boolean z3 = (transaction.mMarkedSuccessful || z) && !transaction.mChildFailed;
        SQLiteTransactionListener sQLiteTransactionListener = transaction.mListener;
        if (sQLiteTransactionListener != null) {
            try {
                if (z3) {
                    sQLiteTransactionListener.onCommit();
                } else {
                    sQLiteTransactionListener.onRollback();
                }
            } catch (RuntimeException e) {
                e = e;
                CrashHelper.m81296c(e);
            }
        }
        z2 = z3;
        e = null;
        this.mTransactionStack = transaction.mParent;
        recycleTransaction(transaction);
        Transaction transaction2 = this.mTransactionStack;
        if (transaction2 == null) {
            SQLiteConnection sQLiteConnection = this.mConnection;
            try {
                if (z2) {
                    sQLiteConnection.execute("COMMIT;", null, gf4Var);
                } else {
                    sQLiteConnection.execute("ROLLBACK;", null, gf4Var);
                }
                releaseConnection();
            } catch (Throwable th) {
                releaseConnection();
                throw th;
            }
        } else if (!z2) {
            transaction2.mChildFailed = true;
        }
        if (e != null) {
            throw e;
        }
    }

    private boolean executeSpecial(String str, Object[] objArr, int i, gf4 gf4Var) {
        if (gf4Var != null) {
            gf4Var.m125877e();
        }
        int sqlStatementType = DatabaseUtils.getSqlStatementType(str);
        if (sqlStatementType == 4) {
            beginTransaction(2, null, i, gf4Var);
            return true;
        }
        if (sqlStatementType == 5) {
            setTransactionSuccessful();
            endTransaction(gf4Var);
            return true;
        }
        if (sqlStatementType != 6) {
            return false;
        }
        endTransaction(gf4Var);
        return true;
    }

    private Transaction obtainTransaction(int i, SQLiteTransactionListener sQLiteTransactionListener) {
        Transaction transaction = this.mTransactionPool;
        if (transaction != null) {
            this.mTransactionPool = transaction.mParent;
            transaction.mParent = null;
            transaction.mMarkedSuccessful = false;
            transaction.mChildFailed = false;
        } else {
            transaction = new Transaction();
        }
        transaction.mMode = i;
        transaction.mListener = sQLiteTransactionListener;
        return transaction;
    }

    private void recycleTransaction(Transaction transaction) {
        transaction.mParent = this.mTransactionPool;
        transaction.mListener = null;
        this.mTransactionPool = transaction;
    }

    private void releaseConnection() {
        int i = this.mConnectionUseCount - 1;
        this.mConnectionUseCount = i;
        if (i == 0) {
            try {
                this.mConnectionPool.releaseConnection(this.mConnection);
            } finally {
                this.mConnection = null;
            }
        }
    }

    private void throwIfNestedTransaction() {
        if (hasNestedTransaction()) {
            qkq0.m175383a("Cannot perform this operation because a nested transaction is in progress.");
        }
    }

    private void throwIfNoTransaction() {
        if (this.mTransactionStack != null) {
            return;
        }
        qkq0.m175383a("Cannot perform this operation because there is no current transaction.");
    }

    private void throwIfTransactionMarkedSuccessful() {
        Transaction transaction = this.mTransactionStack;
        if (transaction == null || !transaction.mMarkedSuccessful) {
            return;
        }
        qkq0.m175383a("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
    }

    private boolean yieldTransactionUnchecked(long j, gf4 gf4Var) {
        if (gf4Var != null) {
            gf4Var.m125877e();
        }
        if (!this.mConnectionPool.shouldYieldConnection(this.mConnection, this.mConnectionFlags)) {
            return false;
        }
        Transaction transaction = this.mTransactionStack;
        int i = transaction.mMode;
        SQLiteTransactionListener sQLiteTransactionListener = transaction.mListener;
        int i2 = this.mConnectionFlags;
        endTransactionUnchecked(gf4Var, true);
        if (j > 0) {
            try {
                Thread.sleep(j);
            } catch (InterruptedException unused) {
            }
        }
        beginTransactionUnchecked(i, sQLiteTransactionListener, i2, gf4Var);
        return true;
    }

    public void acquirePrimaryConnection() {
        acquireConnection(null, 2, null);
    }

    public void beginTransaction(int i, SQLiteTransactionListener sQLiteTransactionListener, int i2, gf4 gf4Var) {
        throwIfTransactionMarkedSuccessful();
        beginTransactionUnchecked(i, sQLiteTransactionListener, i2, gf4Var);
    }

    public void endTransaction(gf4 gf4Var) {
        throwIfNoTransaction();
        endTransactionUnchecked(gf4Var, false);
    }

    public void execute(String str, Object[] objArr, int i, gf4 gf4Var) {
        if (str == null) {
            ig3.m135964a("sql must not be null.");
        } else {
            if (executeSpecial(str, objArr, i, gf4Var)) {
                return;
            }
            acquireConnection(str, i, gf4Var);
            try {
                this.mConnection.execute(str, objArr, gf4Var);
            } finally {
                releaseConnection();
            }
        }
    }

    public ParcelFileDescriptor executeForBlobFileDescriptor(String str, Object[] objArr, int i, gf4 gf4Var) {
        if (str == null) {
            ig3.m135964a("sql must not be null.");
            return null;
        }
        if (executeSpecial(str, objArr, i, gf4Var)) {
            return null;
        }
        acquireConnection(str, i, gf4Var);
        try {
            return this.mConnection.executeForBlobFileDescriptor(str, objArr, gf4Var);
        } finally {
            releaseConnection();
        }
    }

    public int executeForChangedRowCount(String str, Object[] objArr, int i, gf4 gf4Var) {
        if (str == null) {
            ig3.m135964a("sql must not be null.");
            return 0;
        }
        if (executeSpecial(str, objArr, i, gf4Var)) {
            return 0;
        }
        acquireConnection(str, i, gf4Var);
        try {
            return this.mConnection.executeForChangedRowCount(str, objArr, gf4Var);
        } finally {
            releaseConnection();
        }
    }

    public int executeForCursorWindow(String str, Object[] objArr, CursorWindow cursorWindow, int i, int i2, boolean z, int i3, gf4 gf4Var) {
        if (str == null) {
            ig3.m135964a("sql must not be null.");
            return 0;
        }
        if (cursorWindow == null) {
            ig3.m135964a("window must not be null.");
            return 0;
        }
        if (executeSpecial(str, objArr, i3, gf4Var)) {
            cursorWindow.clear();
            return 0;
        }
        acquireConnection(str, i3, gf4Var);
        try {
            return this.mConnection.executeForCursorWindow(str, objArr, cursorWindow, i, i2, z, gf4Var);
        } finally {
            releaseConnection();
        }
    }

    public long executeForLastInsertedRowId(String str, Object[] objArr, int i, gf4 gf4Var) {
        if (str == null) {
            ig3.m135964a("sql must not be null.");
            return 0L;
        }
        if (executeSpecial(str, objArr, i, gf4Var)) {
            return 0L;
        }
        acquireConnection(str, i, gf4Var);
        try {
            return this.mConnection.executeForLastInsertedRowId(str, objArr, gf4Var);
        } finally {
            releaseConnection();
        }
    }

    public long executeForLong(String str, Object[] objArr, int i, gf4 gf4Var) {
        if (str == null) {
            ig3.m135964a("sql must not be null.");
            return 0L;
        }
        if (executeSpecial(str, objArr, i, gf4Var)) {
            return 0L;
        }
        acquireConnection(str, i, gf4Var);
        try {
            return this.mConnection.executeForLong(str, objArr, gf4Var);
        } finally {
            releaseConnection();
        }
    }

    public String executeForString(String str, Object[] objArr, int i, gf4 gf4Var) {
        if (str == null) {
            ig3.m135964a("sql must not be null.");
            return null;
        }
        if (executeSpecial(str, objArr, i, gf4Var)) {
            return null;
        }
        acquireConnection(str, i, gf4Var);
        try {
            return this.mConnection.executeForString(str, objArr, gf4Var);
        } finally {
            releaseConnection();
        }
    }

    public boolean hasConnection() {
        return this.mConnection != null;
    }

    public boolean hasNestedTransaction() {
        Transaction transaction = this.mTransactionStack;
        return (transaction == null || transaction.mParent == null) ? false : true;
    }

    public boolean hasTransaction() {
        return this.mTransactionStack != null;
    }

    public void prepare(String str, int i, gf4 gf4Var, SQLiteStatementInfo sQLiteStatementInfo) {
        if (str == null) {
            ig3.m135964a("sql must not be null.");
            return;
        }
        if (gf4Var != null) {
            gf4Var.m125877e();
        }
        acquireConnection(str, i, gf4Var);
        try {
            this.mConnection.prepare(str, sQLiteStatementInfo);
        } finally {
            releaseConnection();
        }
    }

    public void releasePrimaryConnection() {
        releaseConnection();
    }

    public void setTransactionSuccessful() {
        throwIfNoTransaction();
        throwIfTransactionMarkedSuccessful();
        this.mTransactionStack.mMarkedSuccessful = true;
    }

    public boolean yieldTransaction(long j, boolean z, gf4 gf4Var) {
        if (z) {
            throwIfNoTransaction();
            throwIfTransactionMarkedSuccessful();
            throwIfNestedTransaction();
        } else {
            Transaction transaction = this.mTransactionStack;
            if (transaction == null || transaction.mMarkedSuccessful || transaction.mParent != null) {
                return false;
            }
        }
        if (this.mTransactionStack.mChildFailed) {
            return false;
        }
        return yieldTransactionUnchecked(j, gf4Var);
    }
}
