package com.tencent.wcdb.database;

import android.database.sqlite.SQLiteTransactionListener;
import android.util.Pair;
import com.tencent.wcdb.CursorWindow;
import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.support.CancellationSignal;
import p149l.ig3;
import p149l.qkq0;

/* JADX INFO: loaded from: classes2.dex */
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

    private void acquireConnection(String str, int i, boolean z, CancellationSignal cancellationSignal) throws Throwable {
        if (this.mConnection == null) {
            SQLiteConnection sQLiteConnectionAcquireConnection = this.mConnectionPool.acquireConnection(str, i, cancellationSignal);
            this.mConnection = sQLiteConnectionAcquireConnection;
            this.mConnectionFlags = i;
            sQLiteConnectionAcquireConnection.setAcquisitionState(true, z);
        }
        this.mConnectionUseCount++;
    }

    private void beginTransactionUnchecked(int i, SQLiteTransactionListener sQLiteTransactionListener, int i2, CancellationSignal cancellationSignal) throws Throwable {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        if (this.mTransactionStack == null) {
            acquireConnection(null, i2, true, cancellationSignal);
        }
        try {
            if (this.mTransactionStack == null) {
                if (i != 1) {
                    SQLiteConnection sQLiteConnection = this.mConnection;
                    if (i != 2) {
                        sQLiteConnection.execute("BEGIN;", null, cancellationSignal);
                    } else {
                        sQLiteConnection.execute("BEGIN EXCLUSIVE;", null, cancellationSignal);
                    }
                } else {
                    this.mConnection.execute("BEGIN IMMEDIATE;", null, cancellationSignal);
                }
            }
            if (sQLiteTransactionListener != null) {
                try {
                    sQLiteTransactionListener.onBegin();
                } catch (RuntimeException e) {
                    if (this.mTransactionStack == null) {
                        this.mConnection.execute("ROLLBACK;", null, cancellationSignal);
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

    private void endTransactionUnchecked(CancellationSignal cancellationSignal, boolean z) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
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
                    sQLiteConnection.execute("COMMIT;", null, cancellationSignal);
                } else {
                    sQLiteConnection.execute("ROLLBACK;", null, cancellationSignal);
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

    private boolean executeSpecial(String str, Object[] objArr, int i, CancellationSignal cancellationSignal) throws Throwable {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        int sqlStatementType = DatabaseUtils.getSqlStatementType(str);
        if (sqlStatementType == 4) {
            beginTransaction(2, null, i, cancellationSignal);
            return true;
        }
        if (sqlStatementType == 5) {
            setTransactionSuccessful();
            endTransaction(cancellationSignal);
            return true;
        }
        if (sqlStatementType != 6) {
            return false;
        }
        endTransaction(cancellationSignal);
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
                this.mConnection.setAcquisitionState(false, false);
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

    private boolean yieldTransactionUnchecked(long j, CancellationSignal cancellationSignal) throws Throwable {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        if (!this.mConnectionPool.shouldYieldConnection(this.mConnection, this.mConnectionFlags)) {
            return false;
        }
        Transaction transaction = this.mTransactionStack;
        int i = transaction.mMode;
        SQLiteTransactionListener sQLiteTransactionListener = transaction.mListener;
        int i2 = this.mConnectionFlags;
        endTransactionUnchecked(cancellationSignal, true);
        if (j > 0) {
            try {
                Thread.sleep(j);
            } catch (InterruptedException unused) {
            }
        }
        beginTransactionUnchecked(i, sQLiteTransactionListener, i2, cancellationSignal);
        return true;
    }

    public SQLiteConnection acquireConnectionForNativeHandle(int i) throws Throwable {
        acquireConnection(null, i, true, null);
        return this.mConnection;
    }

    public SQLiteConnection.PreparedStatement acquirePreparedStatement(String str, int i, boolean z) throws Throwable {
        acquireConnection(str, i, z, null);
        return this.mConnection.acquirePreparedStatement(str);
    }

    public void beginTransaction(int i, SQLiteTransactionListener sQLiteTransactionListener, int i2, CancellationSignal cancellationSignal) throws Throwable {
        throwIfTransactionMarkedSuccessful();
        beginTransactionUnchecked(i, sQLiteTransactionListener, i2, cancellationSignal);
    }

    public void endTransaction(CancellationSignal cancellationSignal) {
        throwIfNoTransaction();
        endTransactionUnchecked(cancellationSignal, false);
    }

    public void execute(String str, Object[] objArr, int i, CancellationSignal cancellationSignal) throws Throwable {
        if (str == null) {
            ig3.m135964a("sql must not be null.");
        } else {
            if (executeSpecial(str, objArr, i, cancellationSignal)) {
                return;
            }
            acquireConnection(str, i, false, cancellationSignal);
            try {
                this.mConnection.execute(str, objArr, cancellationSignal);
            } finally {
                releaseConnection();
            }
        }
    }

    public int executeForChangedRowCount(String str, Object[] objArr, int i, CancellationSignal cancellationSignal) throws Throwable {
        if (str == null) {
            ig3.m135964a("sql must not be null.");
            return 0;
        }
        if (executeSpecial(str, objArr, i, cancellationSignal)) {
            return 0;
        }
        acquireConnection(str, i, false, cancellationSignal);
        try {
            return this.mConnection.executeForChangedRowCount(str, objArr, cancellationSignal);
        } finally {
            releaseConnection();
        }
    }

    public int executeForCursorWindow(String str, Object[] objArr, CursorWindow cursorWindow, int i, int i2, boolean z, int i3, CancellationSignal cancellationSignal) throws Throwable {
        if (str == null) {
            ig3.m135964a("sql must not be null.");
            return 0;
        }
        if (cursorWindow == null) {
            ig3.m135964a("window must not be null.");
            return 0;
        }
        if (executeSpecial(str, objArr, i3, cancellationSignal)) {
            cursorWindow.clear();
            return 0;
        }
        acquireConnection(str, i3, false, cancellationSignal);
        try {
            return this.mConnection.executeForCursorWindow(str, objArr, cursorWindow, i, i2, z, cancellationSignal);
        } finally {
            releaseConnection();
        }
    }

    public long executeForLastInsertedRowId(String str, Object[] objArr, int i, CancellationSignal cancellationSignal) throws Throwable {
        if (str == null) {
            ig3.m135964a("sql must not be null.");
            return 0L;
        }
        if (executeSpecial(str, objArr, i, cancellationSignal)) {
            return 0L;
        }
        acquireConnection(str, i, false, cancellationSignal);
        try {
            return this.mConnection.executeForLastInsertedRowId(str, objArr, cancellationSignal);
        } finally {
            releaseConnection();
        }
    }

    public long executeForLong(String str, Object[] objArr, int i, CancellationSignal cancellationSignal) throws Throwable {
        if (str == null) {
            ig3.m135964a("sql must not be null.");
            return 0L;
        }
        if (executeSpecial(str, objArr, i, cancellationSignal)) {
            return 0L;
        }
        acquireConnection(str, i, false, cancellationSignal);
        try {
            return this.mConnection.executeForLong(str, objArr, cancellationSignal);
        } finally {
            releaseConnection();
        }
    }

    public String executeForString(String str, Object[] objArr, int i, CancellationSignal cancellationSignal) throws Throwable {
        if (str == null) {
            ig3.m135964a("sql must not be null.");
            return null;
        }
        if (executeSpecial(str, objArr, i, cancellationSignal)) {
            return null;
        }
        acquireConnection(str, i, false, cancellationSignal);
        try {
            return this.mConnection.executeForString(str, objArr, cancellationSignal);
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

    public void prepare(String str, int i, CancellationSignal cancellationSignal, SQLiteStatementInfo sQLiteStatementInfo) {
        if (str == null) {
            ig3.m135964a("sql must not be null.");
            return;
        }
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        acquireConnection(str, i, false, cancellationSignal);
        try {
            this.mConnection.prepare(str, sQLiteStatementInfo);
        } finally {
            releaseConnection();
        }
    }

    public void releaseConnectionForNativeHandle(Exception exc) {
        SQLiteConnection sQLiteConnection = this.mConnection;
        if (sQLiteConnection != null) {
            sQLiteConnection.endNativeHandle(exc);
        }
        releaseConnection();
    }

    public void releasePreparedStatement(SQLiteConnection.PreparedStatement preparedStatement) {
        SQLiteConnection sQLiteConnection = this.mConnection;
        if (sQLiteConnection != null) {
            sQLiteConnection.releasePreparedStatement(preparedStatement);
            releaseConnection();
        }
    }

    public void setTransactionSuccessful() {
        throwIfNoTransaction();
        throwIfTransactionMarkedSuccessful();
        this.mTransactionStack.mMarkedSuccessful = true;
    }

    public Pair<Integer, Integer> walCheckpoint(String str, int i) throws Throwable {
        acquireConnection(null, i, false, null);
        try {
            return this.mConnection.walCheckpoint(str);
        } finally {
            releaseConnection();
        }
    }

    public boolean yieldTransaction(long j, boolean z, CancellationSignal cancellationSignal) {
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
        return yieldTransactionUnchecked(j, cancellationSignal);
    }
}
