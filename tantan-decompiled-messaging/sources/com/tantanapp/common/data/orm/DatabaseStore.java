package com.tantanapp.common.data.orm;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.data.orm.DatabaseStore;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.DBCorruptException;
import com.tantanapp.common.utils.ThreadUtil;
import com.tantanapp.common.utils.UpDateException;
import io.requery.android.database.DatabaseErrorHandler;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.c4g0;
import p149l.d30;
import p149l.du2;
import p149l.e01;
import p149l.e30;
import p149l.edk0;
import p149l.f30;
import p149l.j760;
import p149l.n11;
import p149l.ohg0;
import p149l.qkq0;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;
import p149l.xaj0;

/* JADX INFO: loaded from: classes13.dex */
public class DatabaseStore implements DatabaseErrorHandler {
    public static final boolean ASYNC_INIT = true;
    public static final boolean DETAILED_LOGGING = edk0.f90612b;
    public static final String TAG = "DatabaseStore";
    public static AtomicInteger debug_asyncFetchCount;
    public static boolean debug_delayTransaction10Seconds;
    public static boolean debug_omitPostingChanges;
    public final String dbName;
    private volatile SQLiteDatabase dbObj;
    public final File dbPath;
    public final List<Table> debug_tables;
    volatile boolean deleted;
    private C22306c<Boolean> foreground;
    private v9j<Long> getStartMillis;
    boolean hasDoneTruncateCheckpoint;
    private volatile c4g0 lifecycleSubs;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final List<Table> tables;
    private volatile Transaction transaction;
    boolean uiDeferredTransactionStarted;
    volatile boolean uiIsInForeground;
    public final int version;

    public static class Change {
        static final int DELETE = 0;
        static final int INSERT = 1;
        static final int UPDATE = 2;
        public final DbObject item;
        public final DbObject item2;
        public final int type;

        public Change(int i, DbObject dbObject, DbObject dbObject2) {
            this.type = i;
            this.item = dbObject;
            this.item2 = dbObject2;
        }
    }

    public class TableTrigger {
        d30 action;
        List<Column> watchColumns;

        public TableTrigger(@NonNull List<Column> list, d30 d30Var) {
            this.watchColumns = list;
            this.action = d30Var;
        }

        public boolean isTriggered(List<Change> list) {
            boolean z = false;
            for (Change change : list) {
                int i = change.type;
                if (i == 0 || i == 1) {
                    z = true;
                    break;
                }
                if (i != 2) {
                    qkq0.m175383a("wrong change type");
                    return false;
                }
                for (Column column : this.watchColumns) {
                    if (!ValueObject.util_equals(column.get(change.item), column.get(change.item2))) {
                        z = true;
                        break;
                        break;
                    }
                }
                if (z) {
                    break;
                }
            }
            return z;
        }
    }

    public static class Transaction extends HashMap<String, List<Change>> {
        public ArrayList<j760<d30, d30>> tickSynced = new ArrayList<>();

        private <T> void add(Table table, Change change) {
            String str = table.tableName;
            List<Change> arrayList = get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                put(str, arrayList);
            }
            arrayList.add(change);
        }

        public <T extends DbObject> void delete(Table table, T t) {
            add(table, new Change(0, t, null));
        }

        public <T extends DbObject> void insert(Table table, T t) {
            add(table, new Change(1, t, null));
        }

        public <T extends DbObject> void update(Table table, T t, T t2) {
            add(table, new Change(2, t, t2));
        }
    }

    static {
        System.loadLibrary("sqlite3x");
        debug_delayTransaction10Seconds = false;
        debug_omitPostingChanges = false;
        debug_asyncFetchCount = new AtomicInteger(0);
    }

    public DatabaseStore(String str, File file, int i, C22306c<Boolean> c22306c, v9j<Long> v9jVar) {
        ArrayList arrayList = new ArrayList();
        this.tables = arrayList;
        this.debug_tables = arrayList;
        this.uiIsInForeground = false;
        this.deleted = false;
        this.transaction = null;
        this.uiDeferredTransactionStarted = false;
        this.hasDoneTruncateCheckpoint = false;
        this.dbName = str;
        this.dbPath = file;
        this.version = i;
        this.foreground = c22306c;
        this.getStartMillis = v9jVar;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m81225a(final DatabaseStore databaseStore, Boolean bool) {
        databaseStore.getClass();
        databaseStore.uiIsInForeground = bool.booleanValue();
        if (databaseStore.uiIsInForeground) {
            return;
        }
        ThreadUtil.m81310e(new Runnable() { // from class: l.a6c
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                DatabaseStore.m81232g(this.f67755a);
            }
        }, false);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m81227c(final DatabaseStore databaseStore) {
        databaseStore.ensureMainThreadDeferredTransactionStarted();
        databaseStore.lifecycleSubs = databaseStore.foreground.subscribe(new e30() { // from class: l.z5c
            @Override // p149l.e30
            public final void call(Object obj) {
                DatabaseStore.m81225a(this.f201791a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m81228d(DatabaseStore databaseStore, boolean z, v9j v9jVar, e30 e30Var, final d30 d30Var) {
        databaseStore.getClass();
        try {
            if (edk0.f90612b) {
                debug_asyncFetchCount.incrementAndGet();
            }
            if (databaseStore.m81234db() != null) {
                ReadWriteLock readWriteLock = databaseStore.lock;
                if (!z) {
                    readWriteLock.readLock().lock();
                    databaseStore.asyncFetchInner(v9jVar, e30Var);
                } else if (readWriteLock.readLock().tryLock()) {
                    databaseStore.asyncFetchInner(v9jVar, e30Var);
                } else if (d30Var != null) {
                    ThreadUtil.m81312g(new Runnable() { // from class: l.w5c
                        @Override // java.lang.Runnable
                        public final void run() {
                            d30Var.call();
                        }
                    });
                }
            }
        } catch (SQLiteDatabaseCorruptException e) {
            CrashHelper.m81297d(e, 20);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m81230e() {
    }

    public static String explainQuery(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("EXPLAIN QUERY PLAN " + str, strArr);
        if (!cursorRawQuery.moveToFirst()) {
            cursorRawQuery.close();
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cursorRawQuery.getColumnCount(); i++) {
            sb.append(cursorRawQuery.getColumnName(i));
            sb.append(":");
            sb.append(cursorRawQuery.getString(i));
            sb.append(", ");
        }
        return "EXPLAIN: \n\t".concat(sb.toString());
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m81232g(DatabaseStore databaseStore) throws Throwable {
        databaseStore.getClass();
        databaseStore.transaction(new d30() { // from class: l.v5c
            @Override // p149l.d30
            public final void call() {
                DatabaseStore.m81230e();
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static void m81233i(String str) {
        String str2 = edk0.f90611a;
    }

    private void uiRunCheckpoint() {
        if (this.dbObj == null || !this.lock.writeLock().tryLock()) {
            return;
        }
        try {
            db_checkpoint(m81234db());
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public <T> void asyncFetch(final boolean z, final v9j<T> v9jVar, final e30<T> e30Var, final d30 d30Var, boolean z2) {
        ThreadUtil.m81310e(new Runnable() { // from class: l.x5c
            @Override // java.lang.Runnable
            public final void run() {
                DatabaseStore.m81228d(this.f191108a, z, v9jVar, e30Var, d30Var);
            }
        }, z2);
    }

    public <T> void asyncFetchInner(v9j<T> v9jVar, final e30<T> e30Var) {
        if (deleted()) {
            return;
        }
        m81234db().beginTransactionDeferredReadOnly();
        try {
            final T tCall = v9jVar.call();
            ThreadUtil.m81312g(new Runnable() { // from class: l.u5c
                @Override // java.lang.Runnable
                public final void run() {
                    e30Var.call(tCall);
                }
            });
            if (edk0.f90612b) {
                int iDecrementAndGet = debug_asyncFetchCount.decrementAndGet();
                if (DETAILED_LOGGING) {
                    m81229d("async fetch finished, currently has " + iDecrementAndGet);
                }
            }
            m81234db().setTransactionSuccessful();
        } finally {
            m81234db().endTransaction();
            this.lock.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: db */
    public SQLiteDatabase m81234db() {
        if (this.dbObj != null) {
            return this.dbObj;
        }
        this.lock.writeLock().lock();
        try {
            if (this.dbObj == null) {
                String str = edk0.f90611a;
                du2.m113670a("[common][DatabaseStore]", "inter create db");
                if (edk0.f90613c) {
                    SystemClock.uptimeMillis();
                }
                File file = this.dbPath;
                file.getParentFile().mkdirs();
                SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(file.getPath(), null, 805306368, true, this);
                du2.m113670a("[common][DatabaseStore]", "SQLiteDatabase openDatabase");
                sQLiteDatabaseOpenDatabase.acquirePrimaryConnection();
                try {
                    int version = sQLiteDatabaseOpenDatabase.getVersion();
                    if (version != this.version) {
                        if (version == 0) {
                            sQLiteDatabaseOpenDatabase.beginTransaction();
                            try {
                                if (edk0.f90612b) {
                                    m81229d("creating db");
                                }
                                try {
                                    onCreate(sQLiteDatabaseOpenDatabase);
                                } catch (Exception unused) {
                                    onCorruption(sQLiteDatabaseOpenDatabase);
                                }
                                du2.m113670a("[common][DatabaseStore]", "SQLiteDatabase onCreate");
                                sQLiteDatabaseOpenDatabase.setVersion(this.version);
                                sQLiteDatabaseOpenDatabase.setTransactionSuccessful();
                                sQLiteDatabaseOpenDatabase.endTransaction();
                                db_checkpoint(sQLiteDatabaseOpenDatabase);
                            } catch (Throwable th) {
                                sQLiteDatabaseOpenDatabase.endTransaction();
                                throw th;
                            }
                        } else {
                            db_checkpoint(sQLiteDatabaseOpenDatabase);
                            sQLiteDatabaseOpenDatabase.beginTransaction();
                            try {
                                if (version > this.version) {
                                    onCorruption(sQLiteDatabaseOpenDatabase);
                                    throw new DBCorruptException("new version is " + this.version + ", while old is" + version);
                                }
                                if (edk0.f90612b) {
                                    m81229d("updating db");
                                }
                                try {
                                    onUpgrade(sQLiteDatabaseOpenDatabase, version, this.version);
                                } catch (Exception unused2) {
                                    onCorruption(sQLiteDatabaseOpenDatabase);
                                }
                                du2.m113670a("[common][DatabaseStore]", "SQLiteDatabase onUpgrade");
                                sQLiteDatabaseOpenDatabase.setVersion(this.version);
                                sQLiteDatabaseOpenDatabase.setTransactionSuccessful();
                                sQLiteDatabaseOpenDatabase.endTransaction();
                                db_checkpoint(sQLiteDatabaseOpenDatabase);
                            } catch (Throwable th2) {
                                sQLiteDatabaseOpenDatabase.endTransaction();
                                throw th2;
                            }
                        }
                    }
                    sQLiteDatabaseOpenDatabase.releasePrimaryConnection();
                    this.dbObj = sQLiteDatabaseOpenDatabase;
                    if (edk0.f90613c) {
                        SystemClock.uptimeMillis();
                    }
                    ThreadUtil.m81313h(new Runnable() { // from class: l.y5c
                        @Override // java.lang.Runnable
                        public final void run() {
                            DatabaseStore.m81227c(this.f196406a);
                        }
                    }, 100L);
                } catch (Throwable th3) {
                    sQLiteDatabaseOpenDatabase.releasePrimaryConnection();
                    throw th3;
                }
            }
            this.lock.writeLock().unlock();
            return this.dbObj;
        } catch (Throwable th4) {
            this.lock.writeLock().unlock();
            throw th4;
        }
    }

    public void db_checkpoint(SQLiteDatabase sQLiteDatabase) {
        if (edk0.f90613c) {
            SystemClock.uptimeMillis();
        }
        StringBuilder sb = new StringBuilder("PRAGMA wal_checkpoint(");
        sb.append(this.hasDoneTruncateCheckpoint ? "PASSIVE" : "TRUNCATE");
        sb.append(");");
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
        this.hasDoneTruncateCheckpoint = true;
        cursorRawQuery.getCount();
        cursorRawQuery.close();
        if (edk0.f90613c) {
            SystemClock.uptimeMillis();
        }
    }

    public void debug_clear() {
        Iterator<Table> it = this.tables.iterator();
        while (it.hasNext()) {
            it.next().evictAll();
        }
    }

    public SQLiteDatabase debug_db() {
        return m81234db();
    }

    public void delete() {
        this.lock.writeLock().lock();
        this.deleted = true;
        try {
            if (this.dbObj != null) {
                if (this.dbObj.inTransaction()) {
                    this.dbObj.endTransaction();
                }
                du2.m113670a("[common][DatabaseStore]", "SQLiteDatabase close");
                this.dbObj.close();
                if (this.lifecycleSubs != null && !this.lifecycleSubs.isUnsubscribed()) {
                    this.lifecycleSubs.unsubscribe();
                }
                this.dbObj = null;
            }
            du2.m113670a("[common][DatabaseStore]", "SQLiteDatabase before delete");
            SQLiteDatabase.deleteDatabase(this.dbPath);
            du2.m113670a("[common][DatabaseStore]", "SQLiteDatabase after delete");
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public boolean deleted() {
        return this.deleted;
    }

    public void ensureMainThreadDeferredTransactionStarted() {
        if (edk0.f90613c) {
            n11.m157330c();
        }
        if (this.uiDeferredTransactionStarted) {
            return;
        }
        if (edk0.f90613c) {
            SystemClock.uptimeMillis();
        }
        m81234db().beginTransactionDeferredReadOnly();
        m81234db().getVersion();
        if (edk0.f90613c) {
            SystemClock.uptimeMillis();
        }
        this.uiDeferredTransactionStarted = true;
    }

    @Override // io.requery.android.database.DatabaseErrorHandler
    public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        if (edk0.f90612b) {
            m81229d("corruption!");
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        for (Table table : this.tables) {
            sQLiteDatabase.execSQL(table.adapter.CREATE_TABLE(table));
            for (int i = 0; i < table.indexes.size(); i++) {
                sQLiteDatabase.execSQL(table.adapter.CREATE_INDEX(table, table.indexes.get(i)));
            }
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public void syncUiCache(Transaction transaction) {
        long jNanoTime;
        Map<String, TableTrigger> map;
        if (edk0.f90613c) {
            n11.m157330c();
        }
        if (edk0.f90612b) {
            jNanoTime = System.nanoTime();
            m81233i("started sync ui cache");
        } else {
            jNanoTime = 0;
        }
        if (this.uiDeferredTransactionStarted) {
            try {
                m81234db().setTransactionSuccessful();
                m81234db().endTransaction();
                this.uiDeferredTransactionStarted = false;
                if (DETAILED_LOGGING) {
                    m81233i("ended previous deferred transaction " + (System.nanoTime() - jNanoTime));
                }
            } catch (Throwable th) {
                m81234db().endTransaction();
                this.uiDeferredTransactionStarted = false;
                throw th;
            }
        }
        if (!this.uiIsInForeground && this.getStartMillis.call().longValue() > Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) {
            uiRunCheckpoint();
        }
        Iterator<j760<d30, d30>> it = transaction.tickSynced.iterator();
        while (it.hasNext()) {
            it.next().f116564a.call();
        }
        for (Table table : this.tables) {
            table.syncUiCache(transaction.get(table.tableName));
        }
        ensureMainThreadDeferredTransactionStarted();
        if (DETAILED_LOGGING) {
            m81233i("ended sync");
        }
        Iterator<j760<d30, d30>> it2 = transaction.tickSynced.iterator();
        while (it2.hasNext()) {
            it2.next().f116565b.call();
        }
        for (Table table2 : this.tables) {
            if (transaction.get(table2.tableName) != null && (map = table2.triggers) != null) {
                Iterator<String> it3 = map.keySet().iterator();
                while (it3.hasNext()) {
                    TableTrigger tableTrigger = table2.triggers.get(it3.next());
                    if (tableTrigger.isTriggered(transaction.get(table2.tableName))) {
                        tableTrigger.action.call();
                    }
                }
            }
            table2.triggerMergeUpdates();
        }
        if (edk0.f90612b) {
            m81233i("ended trigger");
        }
    }

    public void tickSync(d30 d30Var, d30 d30Var2) {
        if (edk0.f90613c) {
            n11.m157333f();
            n11.m157335h(this.transaction != null);
        }
        this.transaction.tickSynced.add(vwb.m200311Y(d30Var, d30Var2));
    }

    public void transaction(d30 d30Var) throws Throwable {
        if (edk0.f90613c) {
            n11.m157333f();
        }
        if (deleted()) {
            if (edk0.f90612b) {
                m81229d("deleted database calling transaction");
                return;
            }
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.lock.writeLock().lock();
        m81234db().beginTransactionDeferredWrite();
        boolean z = false;
        try {
            if (edk0.f90613c) {
                n11.m157335h(this.transaction == null);
            }
            if (DETAILED_LOGGING) {
                m81229d("started transaction");
            }
            this.transaction = new Transaction();
            d30Var.call();
            m81234db().setTransactionSuccessful();
            try {
                if (edk0.f90612b) {
                    m81229d("time used: " + (SystemClock.uptimeMillis() - jUptimeMillis));
                }
                m81234db().endTransaction();
                if (edk0.f90612b && debug_delayTransaction10Seconds) {
                    String str = edk0.f90611a;
                    try {
                        Thread.sleep(10000L);
                    } catch (InterruptedException unused) {
                    }
                    String str2 = edk0.f90611a;
                }
                if (!debug_omitPostingChanges) {
                    if (DETAILED_LOGGING) {
                        m81229d("ended transaction, posting sync");
                    }
                    ThreadUtil.m81312g(new Runnable() { // from class: com.tantanapp.common.data.orm.DatabaseStore.1
                        public Transaction trans;

                        {
                            this.trans = DatabaseStore.this.transaction;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            Transaction transaction;
                            if (!DatabaseStore.this.deleted() && (transaction = this.trans) != null) {
                                DatabaseStore.this.syncUiCache(transaction);
                            }
                            this.trans = null;
                        }
                    });
                }
                this.transaction = null;
                this.lock.writeLock().unlock();
            } catch (Throwable th) {
                th = th;
                z = true;
                m81234db().endTransaction();
                if (edk0.f90612b && debug_delayTransaction10Seconds) {
                    String str3 = edk0.f90611a;
                    try {
                        Thread.sleep(10000L);
                    } catch (InterruptedException unused2) {
                    }
                    String str4 = edk0.f90611a;
                }
                if (z && !debug_omitPostingChanges) {
                    if (DETAILED_LOGGING) {
                        m81229d("ended transaction, posting sync");
                    }
                    ThreadUtil.m81312g(new Runnable() { // from class: com.tantanapp.common.data.orm.DatabaseStore.1
                        public Transaction trans;

                        {
                            this.trans = DatabaseStore.this.transaction;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            Transaction transaction;
                            if (!DatabaseStore.this.deleted() && (transaction = this.trans) != null) {
                                DatabaseStore.this.syncUiCache(transaction);
                            }
                            this.trans = null;
                        }
                    });
                }
                this.transaction = null;
                this.lock.writeLock().unlock();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public class Table<T extends DbObject> extends LruCache2<String, T> {
        public static final int STATUS_HAS_FETCHER = 1;
        public static final int STATUS_NONE = 0;
        public static final int STATUS_NO_FETCHER = 2;
        final SqlDatabaseAdapter<T> adapter;
        final List<Index> indexes;
        public ConcurrentHashMap<String, JoinFilter> joinFilterQueries;
        protected j760<Table, xaj0<w9j<List<T>, Filter>, v9j<Order>, Integer>> outerJoin;
        public final String tableName;
        protected Map<String, TableTrigger> triggers;
        public ConcurrentHashMap<String, Table<T>.UiGet> uiGets;
        public ConcurrentHashMap<String, Table<T>.UiQuery> uiQueries;

        public class UiGet {

            /* JADX INFO: renamed from: id */
            public final String f56018id;
            private AtomicInteger status = new AtomicInteger(0);
            boolean changed = false;

            /* JADX INFO: renamed from: bs */
            private final C22392a<T> f56017bs = C22392a.m221512b();

            public UiGet(String str) {
                this.f56018id = str;
            }

            /* JADX INFO: renamed from: a */
            public static /* synthetic */ void m81248a(UiGet uiGet, DbObject dbObject) {
                uiGet.status.set(2);
                if (dbObject != null) {
                    Table.this.cache(dbObject.f56011id, dbObject);
                }
                uiGet.f56017bs.onNext(dbObject);
            }

            public void triggerIfChanged() {
                if (this.changed) {
                    this.f56017bs.onNext((T) Table.this.queryCache(this.f56018id));
                    if (DatabaseStore.DETAILED_LOGGING) {
                        DatabaseStore.m81229d("triggered get " + this.f56018id);
                    }
                    this.changed = false;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public void tryInitiate(boolean z) {
                if (this.status.compareAndSet(0, 1)) {
                    DbObject dbObject = (DbObject) Table.this.cached(this.f56018id);
                    if (dbObject != null) {
                        this.status.set(2);
                        this.f56017bs.onNext((T) dbObject);
                    } else if (z && !DatabaseStore.debug_delayTransaction10Seconds) {
                        DatabaseStore.this.asyncFetch(false, new v9j() { // from class: l.n6c
                            @Override // p149l.v9j, java.util.concurrent.Callable
                            public final Object call() {
                                DatabaseStore.Table.UiGet uiGet = this.f137284a;
                                return DatabaseStore.Table.this.query(uiGet.f56018id);
                            }
                        }, new e30() { // from class: l.o6c
                            @Override // p149l.e30
                            public final void call(Object obj) {
                                DatabaseStore.Table.UiGet.m81248a(this.f141993a, (DbObject) obj);
                            }
                        }, null, true);
                    } else {
                        this.status.set(2);
                        this.f56017bs.onNext((T) Table.this.queryCache(this.f56018id));
                    }
                }
            }
        }

        public Table(String str, SqlDatabaseAdapter<T> sqlDatabaseAdapter, List<Index> list, int i) {
            super(i);
            this.outerJoin = null;
            this.triggers = null;
            this.uiQueries = new ConcurrentHashMap<>();
            this.joinFilterQueries = new ConcurrentHashMap<>();
            this.uiGets = new ConcurrentHashMap<>();
            this.tableName = str;
            this.adapter = sqlDatabaseAdapter;
            list = list == null ? new ArrayList<>() : list;
            this.indexes = list;
            list.add(new Index(DbObject.f56009ID));
            DatabaseStore.this.tables.add(this);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m81235a(Table table, String str, UiGet uiGet, boolean z) {
            table.uiGets.put(str, uiGet);
            uiGet.tryInitiate(z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public <K extends DbObject> int binarySearchUsingLocalId(List<K> list, K k, Order<K> order) {
            int iBinarySearch = Collections.binarySearch(list, k, order);
            if (iBinarySearch < 0) {
                return iBinarySearch;
            }
            for (int i = iBinarySearch; i >= 0; i--) {
                K k2 = list.get(i);
                if (k2 != null && k2._id == k._id) {
                    return i;
                }
                if (order.compare(k2, k) != 0) {
                    break;
                }
            }
            for (int i2 = iBinarySearch + 1; i2 < list.size(); i2++) {
                K k3 = list.get(i2);
                if (k3 != null && k3._id == k._id) {
                    return i2;
                }
                if (order.compare(k3, k) != 0) {
                    break;
                }
            }
            return (-iBinarySearch) - 1;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m81237c(final Table table, final String str) {
            table.getClass();
            ThreadUtil.m81313h(new Runnable() { // from class: l.b6c
                @Override // java.lang.Runnable
                public final void run() {
                    DatabaseStore.Table.m81238d(this.f73767a, str);
                }
            }, 1000L);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void cacheQueryJoinData(T t) {
            if (this.joinFilterQueries.size() > 0) {
                for (JoinFilter joinFilter : this.joinFilterQueries.values()) {
                    if (joinFilter.baseFilter().filter(t) && !TextUtils.isEmpty((String) joinFilter.foreignC().get(t))) {
                        DbObject dbObjectQuery = joinFilter.joinTable().query((String) joinFilter.foreignC().get(t));
                        if (edk0.f90612b) {
                            dbObjectQuery.toJson();
                        }
                        if (dbObjectQuery != null) {
                            joinFilter.joinTable().cache(dbObjectQuery.f56011id, dbObjectQuery);
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m81238d(Table table, String str) {
            Table<T>.UiGet uiGet = table.uiGets.get(str);
            if (uiGet == null || ((UiGet) uiGet).f56017bs.m221518h()) {
                return;
            }
            table.uiGets.remove(str);
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m81239e(Table table, List list) {
            table.getClass();
            if (edk0.f90613c) {
                table.size();
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DbObject dbObject = (DbObject) it.next();
                table.cache(dbObject.f56011id, dbObject);
            }
        }

        private void traceMeLog(String str, long j) {
            if ("users".equals(this.tableName) && str.equals(DatabaseStore.this.dbName.replace("core_v2_", ""))) {
                du2.m113670a("[common][DatabaseStore]", "me insert :" + str + " result:" + j);
            }
        }

        public Set<String> allIds() {
            long jNanoTime = System.nanoTime();
            Cursor cursorQuery = DatabaseStore.this.m81234db().query(this.tableName, new String[]{DbObject.f56009ID.NAME}, null, null, null, null, null);
            HashSet hashSet = new HashSet();
            while (cursorQuery.moveToNext()) {
                try {
                    hashSet.add(cursorQuery.getString(0));
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            cursorQuery.close();
            if (edk0.f90612b) {
                log(jNanoTime, "all ids");
            }
            return hashSet;
        }

        public int count(Filter<T> filter, int i) {
            String str;
            Cursor cursorRawQuery;
            long jNanoTime = System.nanoTime();
            SqlSegment sqlSegmentEmit = filter == null ? SqlSegment.NULL : filter.emit();
            boolean z = filter instanceof JoinFilter;
            DatabaseStore databaseStore = DatabaseStore.this;
            if (z) {
                cursorRawQuery = databaseStore.m81234db().rawQuery(((JoinFilter) filter).countSql(), sqlSegmentEmit.args);
            } else {
                SQLiteDatabase sQLiteDatabaseM81234db = databaseStore.m81234db();
                StringBuilder sb = new StringBuilder("select count(_id) from ");
                sb.append(this.tableName);
                sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                if (sqlSegmentEmit.part == null) {
                    str = "";
                } else {
                    str = " WHERE " + sqlSegmentEmit.part;
                }
                sb.append(str);
                cursorRawQuery = sQLiteDatabaseM81234db.rawQuery(sb.toString(), sqlSegmentEmit.args);
            }
            try {
                int i2 = cursorRawQuery.moveToFirst() ? cursorRawQuery.getInt(0) : -1;
                if (i <= 0 || i2 <= i) {
                    i = i2;
                }
                cursorRawQuery.close();
                if (edk0.f90612b) {
                    log(jNanoTime, "count " + sqlSegmentEmit.part + "\n\t\t" + Arrays.toString(sqlSegmentEmit.args) + "\n\t\tres: " + i);
                }
                return i;
            } catch (Throwable th) {
                cursorRawQuery.close();
                throw th;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void delete(Filter filter) {
            if (edk0.f90613c) {
                n11.m157333f();
                n11.m157335h(DatabaseStore.this.transaction != null);
            }
            long jNanoTime = System.nanoTime();
            SqlSegment sqlSegmentEmit = filter == null ? SqlSegment.NULL : filter.emit();
            boolean z = filter instanceof JoinFilter;
            DatabaseStore databaseStore = DatabaseStore.this;
            Cursor cursorRawQuery = z ? databaseStore.m81234db().rawQuery(((JoinFilter) filter).querySql(null, -1), sqlSegmentEmit.args) : databaseStore.m81234db().query(this.tableName, null, sqlSegmentEmit.part, sqlSegmentEmit.args, null, null, null);
            ArrayList arrayList = new ArrayList();
            while (cursorRawQuery.moveToNext()) {
                try {
                    arrayList.add(this.adapter.read(cursorRawQuery, 0));
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            }
            cursorRawQuery.close();
            int iDelete = DatabaseStore.this.m81234db().delete(this.tableName, sqlSegmentEmit.part, sqlSegmentEmit.args);
            if (edk0.f90613c) {
                n11.m157335h(iDelete == arrayList.size());
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                DatabaseStore.this.transaction.delete(this, (DbObject) it.next());
            }
            if (edk0.f90612b) {
                log(jNanoTime, "delete by where " + sqlSegmentEmit.part + "\n\t\t" + Arrays.toString(sqlSegmentEmit.args));
            }
        }

        public void deleteAll() {
            delete(Filter.TRUE);
        }

        public Map<String, Integer> groups(Filter<T> filter, DoubleOrder<T> doubleOrder) {
            String strValueOf;
            n11.m157329b(filter instanceof JoinFilter);
            long jNanoTime = System.nanoTime();
            SqlSegment sqlSegmentEmit = filter == null ? SqlSegment.NULL : filter.emit();
            Cursor cursorQuery = DatabaseStore.this.m81234db().query(this.tableName, new String[]{doubleOrder.getFirst().column().NAME, "count(" + doubleOrder.getFirst().column().NAME + ")"}, sqlSegmentEmit.part, sqlSegmentEmit.args, doubleOrder.getFirst().column().NAME, null, doubleOrder.getFirst().emit());
            e01 e01Var = new e01();
            while (cursorQuery.moveToNext()) {
                try {
                    if (doubleOrder.getFirst().column() instanceof DoubleColumn) {
                        strValueOf = String.valueOf(cursorQuery.getDouble(0));
                    } else if (doubleOrder.getFirst().column() instanceof IntegerColumn) {
                        strValueOf = String.valueOf(cursorQuery.getInt(0));
                    } else if (doubleOrder.getFirst().column() instanceof FloatColumn) {
                        strValueOf = String.valueOf(cursorQuery.getFloat(0));
                    } else if (doubleOrder.getFirst().column() instanceof BooleanColumn) {
                        strValueOf = String.valueOf(cursorQuery.getInt(0));
                    } else if (doubleOrder.getFirst().column() instanceof StringColumn) {
                        strValueOf = String.valueOf(cursorQuery.getString(0));
                    } else {
                        if (!(doubleOrder.getFirst().column() instanceof EnumColumn)) {
                            throw new IllegalArgumentException("check order column should ");
                        }
                        strValueOf = String.valueOf(cursorQuery.getInt(0));
                    }
                    e01Var.put(strValueOf, Integer.valueOf(cursorQuery.getInt(1)));
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            cursorQuery.close();
            if (edk0.f90612b) {
                log(jNanoTime, "groups " + doubleOrder.getFirst().column().NAME + "\n\t\t" + e01Var.size() + "\n\t\t: " + e01Var.toString());
            }
            return e01Var;
        }

        public void insert(T t) {
            if (edk0.f90613c) {
                n11.m157333f();
                n11.m157335h(DatabaseStore.this.transaction != null);
            }
            long jNanoTime = System.nanoTime();
            ContentValues contentValues = new ContentValues();
            this.adapter.write(t, contentValues);
            t._id = DatabaseStore.this.m81234db().insert(this.tableName, null, contentValues);
            if (edk0.f90612b) {
                log(jNanoTime, "insert " + t.f56011id);
            }
            DatabaseStore.this.transaction.insert(this, t);
            cacheQueryJoinData(t);
        }

        public void log(long j, String str, String str2) {
            if (edk0.f90612b) {
                long jNanoTime = System.nanoTime() - j;
                long j2 = jNanoTime / 1000000;
                String name = Thread.currentThread().getName();
                StringBuilder sb = new StringBuilder();
                sb.append(name);
                sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                sb.append(this.tableName);
                sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                sb.append(str);
                sb.append(SignParameters.NEW_LINE);
                sb.append(j2);
                sb.append("\t\t");
                sb.append(jNanoTime);
                if (j2 <= 0) {
                    String str3 = edk0.f90611a;
                    return;
                }
                if (j2 <= 10) {
                    if (name.equals(BLiveTraceServerLocation.main)) {
                        String str4 = edk0.f90611a;
                        return;
                    } else {
                        String str5 = edk0.f90611a;
                        return;
                    }
                }
                if (name.equals(BLiveTraceServerLocation.main)) {
                    String str6 = edk0.f90611a;
                } else {
                    String str7 = edk0.f90611a;
                }
            }
        }

        public List<T> query(Filter<T> filter, Order<T> order, int i) {
            String str;
            Cursor cursorQuery;
            String str2;
            if (edk0.f90613c) {
                n11.m157333f();
            }
            long jNanoTime = System.nanoTime();
            SqlSegment sqlSegmentEmit = filter == null ? SqlSegment.NULL : filter.emit();
            String strExplainQuery = null;
            String str3 = "";
            if (i > 0) {
                str = "" + i;
            } else {
                str = null;
            }
            boolean z = filter instanceof JoinFilter;
            DatabaseStore databaseStore = DatabaseStore.this;
            if (z) {
                cursorQuery = databaseStore.m81234db().rawQuery(((JoinFilter) filter).querySql(order, i), sqlSegmentEmit.args);
            } else {
                cursorQuery = databaseStore.m81234db().query(this.tableName, null, sqlSegmentEmit.part, sqlSegmentEmit.args, null, null, order == null ? null : order.emit(), str);
            }
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            if (DatabaseStore.DETAILED_LOGGING) {
                if (z) {
                    strExplainQuery = ((JoinFilter) filter).querySql(order, i);
                } else {
                    SQLiteDatabase sQLiteDatabaseM81234db = DatabaseStore.this.m81234db();
                    StringBuilder sb = new StringBuilder("SELECT * FROM ");
                    sb.append(this.tableName);
                    if (sqlSegmentEmit.part == null) {
                        str2 = "";
                    } else {
                        str2 = " WHERE " + sqlSegmentEmit.part;
                    }
                    sb.append(str2);
                    if (order != null) {
                        str3 = " ORDER BY " + order.emit();
                    }
                    sb.append(str3);
                    strExplainQuery = DatabaseStore.explainQuery(sQLiteDatabaseM81234db, sb.toString(), sqlSegmentEmit.args);
                }
            }
            while (cursorQuery.moveToNext()) {
                try {
                    arrayList.add(this.adapter.read(cursorQuery, 0));
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            cursorQuery.close();
            if (edk0.f90612b) {
                log(jNanoTime, "query " + sqlSegmentEmit.part + "\n\t\t" + Arrays.toString(sqlSegmentEmit.args) + "\n\t\tres: ", strExplainQuery);
            }
            return arrayList;
        }

        public List<T> queryCache(Filter<T> filter, Order<T> order, int i) {
            String str;
            Cursor cursorQuery;
            if (edk0.f90613c) {
                n11.m157330c();
            }
            long jNanoTime = System.nanoTime();
            SqlSegment sqlSegmentEmit = filter == null ? SqlSegment.NULL : filter.emit();
            if (i > 0) {
                str = "" + i;
            } else {
                str = null;
            }
            DatabaseStore.this.ensureMainThreadDeferredTransactionStarted();
            boolean z = filter instanceof JoinFilter;
            DatabaseStore databaseStore = DatabaseStore.this;
            if (z) {
                cursorQuery = databaseStore.m81234db().rawQuery(((JoinFilter) filter).querySql(order, i), sqlSegmentEmit.args);
            } else {
                cursorQuery = databaseStore.m81234db().query(this.tableName, null, sqlSegmentEmit.part, sqlSegmentEmit.args, null, null, order != null ? order.emit() : null, str);
            }
            ArrayList arrayList = new ArrayList(10);
            try {
                int columnIndex = cursorQuery.getColumnIndex(DbObject.f56009ID.NAME);
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(columnIndex);
                    T tCached = cached(string);
                    if (tCached == null) {
                        tCached = this.adapter.read(cursorQuery, 0);
                        cache(string, tCached);
                    }
                    arrayList.add(tCached);
                }
                cursorQuery.close();
                if (edk0.f90612b) {
                    log(jNanoTime, "query cache " + sqlSegmentEmit.part + "\n\t\t" + Arrays.toString(sqlSegmentEmit.args) + "\n\t\tres: ");
                }
                return arrayList;
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }

        public <E extends Comparable<E>> int sum(Filter<T> filter, OrderedColumn<T, E> orderedColumn) {
            String str;
            long jNanoTime = System.nanoTime();
            SqlSegment sqlSegmentEmit = filter == null ? SqlSegment.NULL : filter.emit();
            SQLiteDatabase sQLiteDatabaseM81234db = DatabaseStore.this.m81234db();
            StringBuilder sb = new StringBuilder("SELECT SUM(");
            sb.append(orderedColumn.NAME);
            sb.append(") FROM ");
            sb.append(this.tableName);
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            if (sqlSegmentEmit.part == null) {
                str = "";
            } else {
                str = " WHERE " + sqlSegmentEmit.part;
            }
            sb.append(str);
            Cursor cursorRawQuery = sQLiteDatabaseM81234db.rawQuery(sb.toString(), sqlSegmentEmit.args);
            try {
                int i = cursorRawQuery.moveToFirst() ? cursorRawQuery.getInt(0) : -1;
                cursorRawQuery.close();
                if (edk0.f90612b) {
                    log(jNanoTime, "sum " + sqlSegmentEmit.part + "\n\t\t" + Arrays.toString(sqlSegmentEmit.args) + "\n\t\tres: " + i);
                }
                return i;
            } catch (Throwable th) {
                cursorRawQuery.close();
                throw th;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void syncUiCache(List<Change> list) {
            DbObject dbObject;
            Table<T>.UiGet uiGet;
            DbObject dbObject2;
            if (list != null) {
                for (Change change : list) {
                    if (DatabaseStore.DETAILED_LOGGING) {
                        DatabaseStore.m81229d("syncing " + this.tableName + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + change.type);
                    }
                    int i = change.type;
                    if (i == 0) {
                        DbObject dbObject3 = change.item;
                        Iterator<Table<T>.UiQuery> it = this.uiQueries.values().iterator();
                        while (it.hasNext()) {
                            it.next().syncCacheDelete(dbObject3);
                        }
                        remove(dbObject3.f56011id);
                    } else if (i == 1) {
                        DbObject dbObject4 = change.item;
                        Iterator<Table<T>.UiQuery> it2 = this.uiQueries.values().iterator();
                        while (it2.hasNext()) {
                            it2.next().syncCacheInsert(dbObject4);
                        }
                        cache(dbObject4.f56011id, dbObject4);
                    } else if (i == 2) {
                        DbObject dbObject5 = change.item;
                        DbObject dbObject6 = change.item2;
                        Iterator<Table<T>.UiQuery> it3 = this.uiQueries.values().iterator();
                        while (it3.hasNext()) {
                            it3.next().syncCacheUpdate(dbObject5, dbObject6);
                        }
                        String str = dbObject5.f56011id;
                        if (str == null) {
                            throw new UpDateException("to.id  = " + dbObject6.f56011id + "db size:" + DatabaseStore.this.dbPath.length());
                        }
                        if (str.equals(dbObject6.f56011id)) {
                            cache(dbObject6.f56011id, dbObject6);
                        } else {
                            remove(dbObject5.f56011id);
                        }
                    }
                    DbObject dbObject7 = change.item;
                    if (dbObject7 != null && (uiGet = this.uiGets.get(dbObject7.f56011id)) != null && ((dbObject2 = change.item2) == null || !change.item.equals(dbObject2))) {
                        uiGet.changed = true;
                    }
                    DbObject dbObject8 = change.item2;
                    if (dbObject8 != null && ((dbObject = change.item) == null || !dbObject.f56011id.equals(dbObject8.f56011id))) {
                        Table<T>.UiGet uiGet2 = this.uiGets.get(change.item2.f56011id);
                        if (uiGet2 != null) {
                            DbObject dbObject9 = change.item;
                            if (dbObject9 == null) {
                                uiGet2.changed = true;
                            } else if (!change.item2.equals(dbObject9)) {
                                uiGet2.changed = true;
                            }
                        }
                    }
                }
            }
        }

        public void triggerMergeUpdates() {
            Iterator<Table<T>.UiQuery> it = this.uiQueries.values().iterator();
            while (it.hasNext()) {
                it.next().triggerIfChanged();
            }
            Iterator<Table<T>.UiGet> it2 = this.uiGets.values().iterator();
            while (it2.hasNext()) {
                it2.next().triggerIfChanged();
            }
        }

        public C22306c<T> uiGet(final String str, final boolean z) {
            n11.m157335h(str != null);
            final Table<T>.UiGet uiGet = this.uiGets.get(str);
            if (uiGet == null) {
                uiGet = new UiGet(str);
                this.uiGets.put(str, uiGet);
            }
            return ((UiGet) uiGet).f56017bs.doOnSubscribe(new d30() { // from class: l.f6c
                @Override // p149l.d30
                public final void call() {
                    DatabaseStore.Table.m81235a(this.f95262a, str, uiGet, z);
                }
            }).doOnUnsubscribe(new d30() { // from class: l.g6c
                @Override // p149l.d30
                public final void call() {
                    DatabaseStore.Table.m81237c(this.f101241a, str);
                }
            });
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void update(List<j760<Column, Object>> list, Filter filter) {
            if (edk0.f90613c) {
                n11.m157333f();
                n11.m157335h(DatabaseStore.this.transaction != null);
            }
            long jNanoTime = System.nanoTime();
            SqlSegment sqlSegmentEmit = filter == null ? SqlSegment.NULL : filter.emit();
            boolean z = filter instanceof JoinFilter;
            DatabaseStore databaseStore = DatabaseStore.this;
            Cursor cursorRawQuery = z ? databaseStore.m81234db().rawQuery(((JoinFilter) filter).querySql(null, -1), sqlSegmentEmit.args) : databaseStore.m81234db().query(this.tableName, null, sqlSegmentEmit.part, sqlSegmentEmit.args, null, null, null);
            ArrayList<DbObject> arrayList = new ArrayList();
            while (cursorRawQuery.moveToNext()) {
                try {
                    arrayList.add(this.adapter.read(cursorRawQuery, 0));
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            }
            cursorRawQuery.close();
            if (arrayList.size() <= 0) {
                if (edk0.f90612b) {
                    log(jNanoTime, "update by where no result " + sqlSegmentEmit.part + "\n\t\t" + Arrays.toString(sqlSegmentEmit.args));
                    return;
                }
                return;
            }
            ContentValues contentValues = new ContentValues();
            for (j760<Column, Object> j760Var : list) {
                j760Var.f116564a.put(contentValues, j760Var.f116565b);
            }
            int iUpdate = DatabaseStore.this.m81234db().update(this.tableName, contentValues, sqlSegmentEmit.part, sqlSegmentEmit.args);
            if (edk0.f90613c) {
                n11.m157335h(iUpdate == arrayList.size());
            }
            for (DbObject dbObject : arrayList) {
                try {
                    DbObject dbObject2 = (DbObject) dbObject.mo223809clone();
                    for (j760<Column, Object> j760Var2 : list) {
                        j760Var2.f116564a.set(dbObject2, j760Var2.f116565b);
                    }
                    DatabaseStore.this.transaction.update(this, dbObject, dbObject2);
                } catch (CloneNotSupportedException unused) {
                }
            }
            if (edk0.f90612b) {
                log(jNanoTime, "update by where " + sqlSegmentEmit.part + "\n\t\t" + Arrays.toString(sqlSegmentEmit.args));
            }
        }

        public void updateBy_id(T t) {
            if (edk0.f90613c) {
                n11.m157333f();
                n11.m157335h(DatabaseStore.this.transaction != null);
            }
            long jNanoTime = System.nanoTime();
            SQLiteDatabase sQLiteDatabaseM81234db = DatabaseStore.this.m81234db();
            String str = this.tableName;
            StringBuilder sb = new StringBuilder();
            LongColumn<DbObject> longColumn = DbObject._ID;
            sb.append(longColumn);
            sb.append(" = ?");
            Cursor cursorQuery = sQLiteDatabaseM81234db.query(str, null, sb.toString(), new String[]{Long.toString(t._id)}, null, null, null);
            try {
                T t2 = cursorQuery.moveToNext() ? this.adapter.read(cursorQuery, 0) : null;
                cursorQuery.close();
                if (t2 == null) {
                    if (edk0.f90612b) {
                        log(jNanoTime, "update by _id no result " + t._id);
                        return;
                    }
                    return;
                }
                ContentValues contentValues = new ContentValues();
                this.adapter.write(t, contentValues);
                DatabaseStore.this.m81234db().update(this.tableName, contentValues, longColumn + " = ?", new String[]{Long.toString(t._id)});
                DatabaseStore.this.transaction.update(this, t2, t);
                if (edk0.f90612b) {
                    log(jNanoTime, "update by _id " + t._id);
                }
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }

        public T upsert(T t, f30<T, T> f30Var) {
            if (edk0.f90613c) {
                n11.m157333f();
                n11.m157335h(DatabaseStore.this.transaction != null);
            }
            long jNanoTime = System.nanoTime();
            SQLiteDatabase sQLiteDatabaseM81234db = DatabaseStore.this.m81234db();
            String str = this.tableName;
            StringBuilder sb = new StringBuilder();
            StringColumn stringColumn = DbObject.f56009ID;
            sb.append(stringColumn);
            sb.append(" = ?");
            Cursor cursorQuery = sQLiteDatabaseM81234db.query(str, null, sb.toString(), new String[]{t.f56011id}, null, null, null);
            try {
                T t2 = cursorQuery.moveToNext() ? this.adapter.read(cursorQuery, 0) : null;
                cursorQuery.close();
                if (t2 == null) {
                    if (f30Var != null) {
                        f30Var.call(t, null);
                    }
                    ContentValues contentValues = new ContentValues();
                    this.adapter.write(t, contentValues);
                    long jInsert = DatabaseStore.this.m81234db().insert(this.tableName, null, contentValues);
                    t._id = jInsert;
                    traceMeLog(t.f56011id, jInsert);
                    if (edk0.f90612b) {
                        log(jNanoTime, "insert " + t.f56011id);
                    }
                    DatabaseStore.this.transaction.insert(this, t);
                    cacheQueryJoinData(t);
                    return t;
                }
                t._id = t2._id;
                if (f30Var != null) {
                    f30Var.call(t, t2);
                }
                t.mergeData(t2);
                if (!t2.equals(t)) {
                    ContentValues contentValues2 = new ContentValues();
                    this.adapter.write(t, contentValues2);
                    int iUpdate = DatabaseStore.this.m81234db().update(this.tableName, contentValues2, stringColumn + " = ?", new String[]{t.f56011id});
                    if (edk0.f90612b) {
                        log(jNanoTime, "update " + t.f56011id);
                    }
                    if (edk0.f90613c) {
                        n11.m157335h(iUpdate > 0);
                    }
                    if (iUpdate > 0) {
                        DatabaseStore.this.transaction.update(this, t2, t);
                    }
                }
                return t;
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }

        public void warmUp(final int i, int i2) {
            ThreadUtil.m81313h(new Runnable() { // from class: l.e6c
                @Override // java.lang.Runnable
                public final void run() {
                    DatabaseStore.Table table = this.f89517a;
                    DatabaseStore.this.asyncFetch(false, new v9j() { // from class: l.c6c
                        @Override // p149l.v9j, java.util.concurrent.Callable
                        public final Object call() {
                            return this.f79459a.query(null, null, i);
                        }
                    }, new e30() { // from class: l.d6c
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            DatabaseStore.Table.m81239e(this.f84611a, (List) obj);
                        }
                    }, null, false);
                }
            }, i2);
        }

        public class UiQuery {
            public Map<String, Integer> groups;
            final Table<T>.Query query;
            private Table<T>.UiQuery.UiQueryResult tempItems = null;
            private boolean changed = false;
            public AtomicInteger status = new AtomicInteger(0);

            /* JADX INFO: renamed from: bs */
            private C22392a<Table<T>.UiQuery.UiQueryResult> f56019bs = C22392a.m221512b();

            public UiQuery(Table<T>.Query query) {
                this.query = query;
                if (query.orderBy instanceof DoubleOrder) {
                    DatabaseStore.this.ensureMainThreadDeferredTransactionStarted();
                    this.groups = query.gruops();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: a */
            public static /* synthetic */ void m81250a(UiQuery uiQuery, xaj0 xaj0Var) {
                uiQuery.status.set(2);
                for (DbObject dbObject : (List) xaj0Var.f191752b) {
                    Table.this.cache(dbObject.f56011id, dbObject);
                }
                uiQuery.tryCacheOuterJoin((List) xaj0Var.f191753c);
                if (uiQuery.f56019bs.m221515e() == null) {
                    Table<T>.UiQuery.UiQueryResult uiQueryResult = uiQuery.new UiQueryResult();
                    uiQueryResult.base = (List) xaj0Var.f191752b;
                    uiQueryResult.size = ((Integer) xaj0Var.f191751a).intValue();
                    uiQueryResult.full = uiQueryResult.base.size() == uiQueryResult.size;
                    uiQuery.f56019bs.onNext(uiQueryResult);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: b */
            public static /* synthetic */ String m81251b(JoinFilter joinFilter, DbObject dbObject) {
                return (String) joinFilter.foreignC().get(dbObject);
            }

            /* JADX INFO: renamed from: c */
            public static /* synthetic */ xaj0 m81252c(UiQuery uiQuery) {
                ArrayList arrayList;
                Table<T>.Query query = uiQuery.query;
                int i = query.initPageSize;
                if (i <= 0) {
                    i = query.pageSize;
                }
                n11.m157335h(i > 0);
                Table table = Table.this;
                Table<T>.Query query2 = uiQuery.query;
                List<T> listQuery = table.query(query2.where, query2.orderBy, i);
                int size = listQuery.size() < i ? listQuery.size() : uiQuery.query.count();
                if (size == 0) {
                    arrayList = new ArrayList();
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    j760<Table, xaj0<w9j<List<T>, Filter>, v9j<Order>, Integer>> j760Var = Table.this.outerJoin;
                    if (j760Var != null) {
                        arrayList2.add(vwb.m200311Y(Table.this.outerJoin.f116564a, j760Var.f116564a.query(j760Var.f116565b.f191751a.call(listQuery), Table.this.outerJoin.f116565b.f191752b.call(), Table.this.outerJoin.f116565b.f191753c.intValue())));
                    }
                    j760<Table, List> j760VarQueryJoinData = uiQuery.queryJoinData(listQuery);
                    if (j760VarQueryJoinData != null) {
                        arrayList2.add(j760VarQueryJoinData);
                    }
                    arrayList = arrayList2;
                }
                return xaj0.m207578a(Integer.valueOf(size), listQuery, arrayList);
            }

            /* JADX WARN: Multi-variable type inference failed */
            private boolean filter(T t) {
                DbObject dbObjectQueryCache;
                Filter<T> filter = this.query.where;
                if (!(filter instanceof JoinFilter)) {
                    return filter == null || filter.filter(t);
                }
                JoinFilter joinFilter = (JoinFilter) filter;
                String str = (String) joinFilter.foreignC().get(t);
                if (TextUtils.isEmpty(str) || (dbObjectQueryCache = joinFilter.joinTable().queryCache(str)) == null) {
                    return false;
                }
                return joinFilter.filter(t, dbObjectQueryCache);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public j760<Table, List> queryJoinData(List<T> list) {
                Filter<T> filter = this.query.where;
                if (filter instanceof JoinFilter) {
                    final JoinFilter joinFilter = (JoinFilter) filter;
                    j760<Table, xaj0<w9j<List<T>, Filter>, v9j<Order>, Integer>> j760Var = Table.this.outerJoin;
                    if (j760Var == null || j760Var.f116564a != joinFilter.joinTable()) {
                        List<String> listM200306T = vwb.m200306T(vwb.m200339n(list, new w9j() { // from class: l.r6c
                            @Override // p149l.w9j
                            public final Object call(Object obj) {
                                return Boolean.valueOf(!TextUtils.isEmpty((String) joinFilter.foreignC().get((DbObject) obj)));
                            }
                        }), new w9j() { // from class: l.s6c
                            @Override // p149l.w9j
                            public final Object call(Object obj) {
                                return DatabaseStore.Table.UiQuery.m81251b(joinFilter, (DbObject) obj);
                            }
                        });
                        DatabaseStore.m81229d("cache join ids -> ids= " + TextUtils.join(Constants.SEPARATOR_COMMA, listM200306T));
                        List<T> listQuery = joinFilter.joinTable().query(DbObject.f56009ID.m81268IN(listM200306T), null, -1);
                        DatabaseStore.m81229d("cache join data size -> size " + listQuery.size());
                        return vwb.m200311Y(joinFilter.joinTable(), listQuery);
                    }
                }
                return null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void tryCacheOuterJoin(List<j760<Table, List>> list) {
                String str;
                if (list.size() > 0) {
                    for (j760<Table, List> j760Var : list) {
                        for (DbObject dbObject : j760Var.f116565b) {
                            if (dbObject != null && (str = dbObject.f56011id) != null) {
                                j760Var.f116564a.cache(str, dbObject);
                            }
                        }
                    }
                }
            }

            public List<T> debug_result() {
                return this.f56019bs.m221515e();
            }

            public Table<T>.UiQuery.UiQueryResult itemsRead() {
                Table<T>.UiQuery.UiQueryResult uiQueryResult = this.tempItems;
                return uiQueryResult == null ? this.f56019bs.m221515e() : uiQueryResult;
            }

            public Table<T>.UiQuery.UiQueryResult itemsWrite() {
                if (this.tempItems == null && this.f56019bs.m221515e() != null) {
                    this.tempItems = new UiQueryResult(this.f56019bs.m221515e());
                    if (DatabaseStore.DETAILED_LOGGING) {
                        DatabaseStore.m81229d(((Query) this.query).key + " temp items created for write");
                    }
                }
                return this.tempItems;
            }

            public void syncCacheDelete(T t) {
                Table<T>.UiQuery.UiQueryResult uiQueryResultItemsRead = itemsRead();
                boolean z = DatabaseStore.DETAILED_LOGGING;
                if (z) {
                    DatabaseStore.m81229d(((Query) this.query).key + " sync cache delete");
                }
                if (uiQueryResultItemsRead == null || !filter(t)) {
                    return;
                }
                if (z) {
                    uiQueryResultItemsRead.m81257dd("sync cache delete inside");
                }
                if (this.groups != null) {
                    String strValueOf = String.valueOf(((DoubleOrder) this.query.orderBy).getFirst().column().get(t));
                    Integer num = this.groups.get(strValueOf);
                    if (num != null && num.intValue() != 0) {
                        int iIntValue = num.intValue();
                        Map<String, Integer> map = this.groups;
                        if (iIntValue == 1) {
                            map.remove(strValueOf);
                        } else {
                            map.put(strValueOf, Integer.valueOf(num.intValue() - 1));
                        }
                    } else if (edk0.f90612b) {
                        qkq0.m175383a("there should be a value");
                        return;
                    }
                }
                this.changed = true;
                List<T> list = uiQueryResultItemsRead.base;
                if (list != null) {
                    int iBinarySearchUsingLocalId = Table.this.binarySearchUsingLocalId(list, t, this.query.orderBy);
                    if (iBinarySearchUsingLocalId >= 0) {
                        uiQueryResultItemsRead = itemsWrite();
                        uiQueryResultItemsRead.base.remove(iBinarySearchUsingLocalId);
                        if (uiQueryResultItemsRead.base.isEmpty() && !uiQueryResultItemsRead.full) {
                            uiQueryResultItemsRead.full = true;
                        }
                    }
                    if (z) {
                        uiQueryResultItemsRead.m81257dd("item removed");
                    }
                }
                if (uiQueryResultItemsRead.size >= 0) {
                    Table<T>.UiQuery.UiQueryResult uiQueryResultItemsWrite = itemsWrite();
                    int i = uiQueryResultItemsWrite.size - 1;
                    uiQueryResultItemsWrite.size = i;
                    if (i == -1) {
                        uiQueryResultItemsWrite.full = false;
                    }
                    if (z) {
                        uiQueryResultItemsWrite.m81257dd("size changed");
                    }
                }
            }

            public boolean syncCacheInsert(T t) {
                Table<T>.UiQuery.UiQueryResult uiQueryResultItemsRead = itemsRead();
                boolean z = DatabaseStore.DETAILED_LOGGING;
                if (z) {
                    DatabaseStore.m81229d(((Query) this.query).key + " sync cache insert");
                }
                if (uiQueryResultItemsRead != null && filter(t)) {
                    if (this.groups != null) {
                        String strValueOf = String.valueOf(((DoubleOrder) this.query.orderBy).getFirst().column().get(t));
                        Integer num = this.groups.get(strValueOf);
                        Map<String, Integer> map = this.groups;
                        if (num == null) {
                            map.put(strValueOf, 1);
                        } else {
                            map.put(strValueOf, Integer.valueOf(num.intValue() + 1));
                        }
                    }
                    this.changed = true;
                    List<T> list = uiQueryResultItemsRead.base;
                    if (list == null && uiQueryResultItemsRead.size <= 0 && !uiQueryResultItemsRead.full) {
                        if (z) {
                            uiQueryResultItemsRead.m81257dd("sync cache insert nothing");
                        }
                        return false;
                    }
                    if (list != null && !uiQueryResultItemsRead.full) {
                        if (z) {
                            uiQueryResultItemsRead.m81257dd("sync cache insert partial");
                        }
                        int iBinarySearchUsingLocalId = Table.this.binarySearchUsingLocalId(uiQueryResultItemsRead.base, t, this.query.orderBy);
                        if (iBinarySearchUsingLocalId < 0) {
                            iBinarySearchUsingLocalId = (-iBinarySearchUsingLocalId) - 1;
                        } else if (edk0.f90613c) {
                            DatabaseStore.m81229d(uiQueryResultItemsRead.base.get(iBinarySearchUsingLocalId).toJson() + "\n\n" + t.toJson());
                            ohg0.m164364a();
                            return false;
                        }
                        if (uiQueryResultItemsRead.size >= 0) {
                            uiQueryResultItemsRead = itemsWrite();
                            uiQueryResultItemsRead.size++;
                            if (z) {
                                uiQueryResultItemsRead.m81257dd("size updated");
                            }
                        }
                        if (iBinarySearchUsingLocalId >= uiQueryResultItemsRead.base.size()) {
                            return false;
                        }
                        Table<T>.UiQuery.UiQueryResult uiQueryResultItemsWrite = itemsWrite();
                        uiQueryResultItemsWrite.base.add(iBinarySearchUsingLocalId, t);
                        if (z) {
                            uiQueryResultItemsWrite.m81257dd("item inserted");
                        }
                        return true;
                    }
                    if (list == null && uiQueryResultItemsRead.size >= 0 && !uiQueryResultItemsRead.full) {
                        if (z) {
                            uiQueryResultItemsRead.m81257dd("sync cache insert size");
                        }
                        Table<T>.UiQuery.UiQueryResult uiQueryResultItemsWrite2 = itemsWrite();
                        uiQueryResultItemsWrite2.size++;
                        if (z) {
                            uiQueryResultItemsWrite2.m81257dd("size updated");
                        }
                        return false;
                    }
                    if (list != null && uiQueryResultItemsRead.size >= 0 && uiQueryResultItemsRead.full) {
                        if (z) {
                            uiQueryResultItemsRead.m81257dd("sync cache insert full");
                        }
                        int iBinarySearchUsingLocalId2 = Table.this.binarySearchUsingLocalId(uiQueryResultItemsRead.base, t, this.query.orderBy);
                        if (iBinarySearchUsingLocalId2 < 0) {
                            iBinarySearchUsingLocalId2 = (-iBinarySearchUsingLocalId2) - 1;
                        } else if (edk0.f90613c) {
                            DatabaseStore.m81229d(uiQueryResultItemsRead.base.get(iBinarySearchUsingLocalId2).toJson() + "\n\n" + t.toJson());
                            ohg0.m164364a();
                            return false;
                        }
                        Table<T>.UiQuery.UiQueryResult uiQueryResultItemsWrite3 = itemsWrite();
                        boolean z2 = iBinarySearchUsingLocalId2 == uiQueryResultItemsWrite3.base.size();
                        uiQueryResultItemsWrite3.size++;
                        if (!z2 || uiQueryResultItemsWrite3.getTop + (this.query.pageSize * 2) > uiQueryResultItemsWrite3.base.size()) {
                            uiQueryResultItemsWrite3.base.add(iBinarySearchUsingLocalId2, t);
                        } else {
                            uiQueryResultItemsWrite3.full = false;
                        }
                        if (z) {
                            uiQueryResultItemsWrite3.m81257dd("sync cache insert full end");
                        }
                        return true;
                    }
                    if (z) {
                        uiQueryResultItemsRead.m81257dd("what??");
                    }
                    ohg0.m164364a();
                }
                return false;
            }

            public boolean syncCacheUpdate(T t, T t2) {
                Order<T> order;
                int iBinarySearchUsingLocalId;
                Table<T>.UiQuery.UiQueryResult uiQueryResultItemsRead = itemsRead();
                if (uiQueryResultItemsRead == null || !((this.query.where == null || (filter(t) && filter(t2))) && (order = this.query.orderBy) != null && order.compare(t, t2) == 0)) {
                    syncCacheDelete(t);
                    return syncCacheInsert(t2);
                }
                this.changed = true;
                List<T> list = uiQueryResultItemsRead.base;
                if (list == null || (iBinarySearchUsingLocalId = Table.this.binarySearchUsingLocalId(list, t, this.query.orderBy)) < 0) {
                    return false;
                }
                itemsWrite().base.set(iBinarySearchUsingLocalId, t2);
                return true;
            }

            public void triggerIfChanged() {
                if (this.changed) {
                    Table<T>.UiQuery.UiQueryResult uiQueryResultItemsRead = itemsRead();
                    if (uiQueryResultItemsRead != null) {
                        this.f56019bs.onNext(uiQueryResultItemsRead);
                    }
                    if (DatabaseStore.DETAILED_LOGGING) {
                        DatabaseStore.m81229d("triggered query " + ((Query) this.query).key);
                    }
                    this.tempItems = null;
                    this.changed = false;
                }
            }

            public void tryInitiate(boolean z) {
                if (!z || DatabaseStore.debug_delayTransaction10Seconds) {
                    this.status.set(2);
                    this.f56019bs.onNext(new UiQueryResult());
                } else if (this.status.compareAndSet(0, 1)) {
                    DatabaseStore.this.asyncFetch(false, new v9j() { // from class: l.p6c
                        @Override // p149l.v9j, java.util.concurrent.Callable
                        public final Object call() {
                            return DatabaseStore.Table.UiQuery.m81252c(this.f147393a);
                        }
                    }, new e30() { // from class: l.q6c
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            DatabaseStore.Table.UiQuery.m81250a(this.f152861a, (xaj0) obj);
                        }
                    }, null, true);
                }
            }

            public class UiQueryResult extends AbstractList<T> {
                List<T> base;
                boolean full;
                int getTop;
                long previousPreloadTime;
                int size;

                public UiQueryResult(Table<T>.UiQuery.UiQueryResult uiQueryResult) {
                    this.size = -1;
                    this.base = null;
                    this.full = false;
                    this.getTop = -1;
                    this.previousPreloadTime = -1L;
                    this.size = uiQueryResult.size;
                    this.base = uiQueryResult.base != null ? new ArrayList(uiQueryResult.base) : null;
                    this.full = uiQueryResult.full;
                    this.getTop = uiQueryResult.getTop;
                }

                /* JADX INFO: renamed from: a */
                public static /* synthetic */ void m81254a(UiQueryResult uiQueryResult, UiQueryResult uiQueryResult2, int i, int i2, j760 j760Var) {
                    UiQuery.this.status.set(2);
                    for (DbObject dbObject : (List) j760Var.f116564a) {
                        Table.this.cache(dbObject.f56011id, dbObject);
                    }
                    UiQuery.this.tryCacheOuterJoin((List) j760Var.f116565b);
                    Table<T>.UiQuery.UiQueryResult uiQueryResultItemsRead = UiQuery.this.itemsRead();
                    if (uiQueryResultItemsRead == null || uiQueryResultItemsRead != uiQueryResult2) {
                        if (edk0.f90612b) {
                            new IllegalStateException("what");
                        }
                    } else if (uiQueryResultItemsRead.size() == i) {
                        uiQueryResult.base.addAll((Collection) j760Var.f116564a);
                        if (((List) j760Var.f116564a).size() != i2) {
                            uiQueryResult.size = uiQueryResult.base.size();
                            uiQueryResult.full = true;
                        }
                    }
                }

                /* JADX INFO: renamed from: c */
                public static /* synthetic */ j760 m81255c(UiQueryResult uiQueryResult, Filter filter, int i) {
                    UiQuery uiQuery = UiQuery.this;
                    List<T> listQuery = Table.this.query(filter, uiQuery.query.orderBy, i);
                    ArrayList arrayList = new ArrayList();
                    j760<Table, xaj0<w9j<List<T>, Filter>, v9j<Order>, Integer>> j760Var = Table.this.outerJoin;
                    if (j760Var != null) {
                        arrayList.add(vwb.m200311Y(Table.this.outerJoin.f116564a, j760Var.f116564a.query(j760Var.f116565b.f191751a.call(listQuery), Table.this.outerJoin.f116565b.f191752b.call(), Table.this.outerJoin.f116565b.f191753c.intValue())));
                    }
                    j760 j760VarQueryJoinData = UiQuery.this.queryJoinData(listQuery);
                    if (j760VarQueryJoinData != null) {
                        arrayList.add(j760VarQueryJoinData);
                    }
                    return vwb.m200311Y(listQuery, arrayList);
                }

                private void tryPreload(int i) {
                    List<T> list = this.base;
                    if (list == null || i < UiQuery.this.query.initPageSize || this.full || list.size() - i > UiQuery.this.query.pageSize / 2 || SystemClock.uptimeMillis() - this.previousPreloadTime <= 1) {
                        return;
                    }
                    this.previousPreloadTime = SystemClock.uptimeMillis();
                    final int size = this.base.size();
                    Table<T>.Query query = UiQuery.this.query;
                    int i2 = query.initPageSize;
                    if (i >= i2) {
                        i2 = query.pageSize;
                    }
                    final Filter<T> filterQueryFilter = query.queryFilter(this.base);
                    final int iQueryLimit = UiQuery.this.query.queryLimit(this.base, i, i2);
                    if (!UiQuery.this.status.compareAndSet(2, 1) || DatabaseStore.debug_delayTransaction10Seconds) {
                        return;
                    }
                    if (DatabaseStore.DETAILED_LOGGING) {
                        m81258ii("preloading");
                    }
                    DatabaseStore.this.asyncFetch(true, new v9j() { // from class: com.tantanapp.common.data.orm.b
                        @Override // p149l.v9j, java.util.concurrent.Callable
                        public final Object call() {
                            return DatabaseStore.Table.UiQuery.UiQueryResult.m81255c(this.f56021a, filterQueryFilter, iQueryLimit);
                        }
                    }, new e30() { // from class: com.tantanapp.common.data.orm.c
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            DatabaseStore.Table.UiQuery.UiQueryResult.m81254a(this.f56024a, this, size, iQueryLimit, (j760) obj);
                        }
                    }, new d30() { // from class: com.tantanapp.common.data.orm.d
                        @Override // p149l.d30
                        public final void call() {
                            DatabaseStore.Table.UiQuery.this.status.set(2);
                        }
                    }, false);
                }

                public void checkBigGap(int i) {
                    if (edk0.f90612b) {
                        List<T> list = this.base;
                        if (list != null) {
                            list.size();
                        }
                        int i2 = UiQuery.this.query.pageSize;
                    }
                }

                /* JADX INFO: renamed from: dd */
                public void m81257dd(String str) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Table.this.tableName);
                    sb.append("/");
                    sb.append(((Query) UiQuery.this.query).key);
                    sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    sb.append(str);
                    sb.append("\n\t\t\t\tbase:");
                    List<T> list = this.base;
                    sb.append(list == null ? "null" : Integer.valueOf(list.size()));
                    sb.append(", size: ");
                    sb.append(this.size);
                    sb.append(", full: ");
                    sb.append(this.full);
                    DatabaseStore.m81229d(sb.toString());
                }

                @Override // java.util.AbstractList, java.util.List
                public T get(int i) {
                    int iMin = Math.min(i, this.getTop - 1);
                    this.getTop = iMin;
                    if (iMin < -1) {
                        this.getTop = -1;
                    }
                    tryFillAt(i);
                    if (i >= UiQuery.this.query.initPageSize) {
                        tryPreload(i);
                    }
                    return this.base.get(i);
                }

                /* JADX INFO: renamed from: ii */
                public void m81258ii(String str) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Table.this.tableName);
                    sb.append("/");
                    sb.append(((Query) UiQuery.this.query).key);
                    sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    sb.append(str);
                    sb.append("\n\t\t\t\tbase:");
                    List<T> list = this.base;
                    sb.append(list == null ? "null" : Integer.valueOf(list.size()));
                    sb.append(", size: ");
                    sb.append(this.size);
                    sb.append(", full: ");
                    sb.append(this.full);
                    DatabaseStore.m81233i(sb.toString());
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public boolean isEmpty() {
                    if (this.base == null) {
                        tryFillAt(0);
                    }
                    return size() <= 0;
                }

                public void querySize() {
                    if (DatabaseStore.DETAILED_LOGGING && ThreadUtil.m81311f()) {
                        m81257dd("query size called");
                    }
                    DatabaseStore.this.ensureMainThreadDeferredTransactionStarted();
                    int iCount = UiQuery.this.query.count();
                    this.size = iCount;
                    List<T> list = this.base;
                    if (list != null) {
                        this.full = iCount == list.size();
                    } else if (iCount == 0) {
                        this.base = new ArrayList(0);
                        this.full = true;
                    }
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    if (DatabaseStore.DETAILED_LOGGING) {
                        DatabaseStore.m81229d("size called with " + this.size);
                    }
                    if (this.size == -1) {
                        querySize();
                    }
                    return this.size;
                }

                @Override // java.util.AbstractCollection
                public String toString() {
                    StringBuilder sb = new StringBuilder("size: ");
                    sb.append(this.size);
                    sb.append("\nfull: ");
                    sb.append(this.full);
                    sb.append("\nbase: ");
                    if (this.base == null) {
                        sb.append("null");
                    } else {
                        sb.append("size ");
                        sb.append(this.base.size());
                        sb.append("\n[");
                        sb.append(vwb.m200307U(this.base, "; "));
                        sb.append(Constants.AES_SUFFIX);
                    }
                    return sb.toString();
                }

                public void tryFillAt(int i) {
                    if (edk0.f90613c) {
                        n11.m157335h(this.base == null || i == 0 || this.size > 0);
                    }
                    if (this.base == null) {
                        this.base = new ArrayList();
                    }
                    if (i >= this.base.size()) {
                        checkBigGap(i);
                        int size = this.base.size();
                        Table<T>.Query query = UiQuery.this.query;
                        int i2 = query.initPageSize;
                        if (i >= i2) {
                            i2 = query.pageSize;
                        }
                        Filter<T> filterQueryFilter = query.queryFilter(this.base);
                        int iQueryLimit = UiQuery.this.query.queryLimit(this.base, i, i2);
                        boolean z = DatabaseStore.DETAILED_LOGGING;
                        if (z) {
                            m81257dd("query cache called " + iQueryLimit);
                        }
                        UiQuery uiQuery = UiQuery.this;
                        this.base.addAll(Table.this.queryCache(filterQueryFilter, uiQuery.query.orderBy, iQueryLimit));
                        if (this.base.size() < iQueryLimit + size) {
                            this.full = true;
                            this.size = this.base.size();
                        }
                        if (z && ThreadUtil.m81311f()) {
                            m81257dd("status updated");
                        }
                    }
                }

                public UiQueryResult() {
                    this.base = null;
                    this.full = false;
                    this.getTop = -1;
                    this.previousPreloadTime = -1L;
                    this.size = -1;
                }
            }
        }

        public C22306c<T> uiGet(String str) {
            return uiGet(str, true);
        }

        public class Query {
            protected final int initPageSize;
            private final String key;

            @NonNull
            protected final Order<T> orderBy;
            protected final int pageSize;
            protected final Filter<T> where;

            public Query(String str, @NonNull Filter<T> filter, Order<T> order, int i, int i2) {
                n11.m157331d(order);
                this.key = str;
                this.where = filter;
                this.orderBy = order;
                this.initPageSize = i;
                this.pageSize = i2;
            }

            /* JADX INFO: renamed from: a */
            public static /* synthetic */ void m81241a(Query query) {
                Table<T>.UiQuery uiQuery = Table.this.uiQueries.get(query.key);
                if (uiQuery == null || ((UiQuery) uiQuery).f56019bs.m221518h()) {
                    return;
                }
                if (DatabaseStore.DETAILED_LOGGING) {
                    String str = edk0.f90611a;
                }
                Table.this.uiQueries.remove(query.key);
            }

            /* JADX INFO: renamed from: b */
            public static /* synthetic */ void m81242b(final Query query) {
                query.getClass();
                ThreadUtil.m81313h(new Runnable() { // from class: l.h6c
                    @Override // java.lang.Runnable
                    public final void run() {
                        DatabaseStore.Table.Query.m81244d(this.f106015a);
                    }
                }, 1000L);
            }

            /* JADX INFO: renamed from: c */
            public static /* synthetic */ void m81243c(Query query, UiQuery uiQuery) {
                Table.this.uiQueries.put(query.key, uiQuery);
                uiQuery.tryInitiate(true);
            }

            /* JADX INFO: renamed from: d */
            public static /* synthetic */ void m81244d(Query query) {
                Table<T>.UiQuery uiQuery = Table.this.uiQueries.get(query.key);
                if (uiQuery == null || ((UiQuery) uiQuery).f56019bs.m221518h()) {
                    return;
                }
                if (DatabaseStore.DETAILED_LOGGING) {
                    String str = edk0.f90611a;
                }
                Table.this.uiQueries.remove(query.key);
            }

            /* JADX INFO: renamed from: e */
            public static /* synthetic */ void m81245e(final Query query) {
                query.getClass();
                ThreadUtil.m81313h(new Runnable() { // from class: l.i6c
                    @Override // java.lang.Runnable
                    public final void run() {
                        DatabaseStore.Table.Query.m81241a(this.f111704a);
                    }
                }, 1000L);
            }

            /* JADX INFO: renamed from: g */
            public static /* synthetic */ void m81247g(Query query, UiQuery uiQuery, boolean z) {
                Table.this.uiQueries.put(query.key, uiQuery);
                uiQuery.tryInitiate(z);
            }

            public int count() {
                return Table.this.count(this.where, -1);
            }

            public Map<String, Integer> gruops() {
                if (edk0.f90613c) {
                    n11.m157335h(this.orderBy instanceof DoubleOrder);
                }
                return Table.this.groups(this.where, (DoubleOrder) this.orderBy);
            }

            public boolean isEmpty() {
                return Table.this.query(this.where, this.orderBy, 1).size() == 0;
            }

            public List<T> query() {
                return new AbstractList<T>() { // from class: com.tantanapp.common.data.orm.DatabaseStore.Table.Query.1
                    List<T> base = new ArrayList();
                    int size = -1;

                    @Override // java.util.AbstractList, java.util.List
                    public T get(int i) {
                        if (this.base.size() <= i) {
                            List<T> list = this.base;
                            Query query = Query.this;
                            Table table = Table.this;
                            Filter<T> filterQueryFilter = query.queryFilter(list);
                            Query query2 = Query.this;
                            list.addAll(table.query(filterQueryFilter, query2.orderBy, query2.queryLimit(this.base, i, i == 0 ? 1 : 20)));
                        }
                        return this.base.get(i);
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public int size() {
                        if (this.size == -1) {
                            this.size = Query.this.count();
                        }
                        return this.size;
                    }
                };
            }

            public Filter<T> queryFilter(List<T> list) {
                if (list.size() == 0) {
                    return this.where;
                }
                T t = list.get(list.size() - 1);
                Filter<T> filter = this.where;
                return filter instanceof JoinFilter ? JoinFilter.AND((JoinFilter) filter, Filter.AND(this.orderBy.GT_EQ(list.get(list.size() - 1)), DbObject._ID.NEQ(Long.valueOf(t._id)))) : Filter.AND(filter, this.orderBy.GT_EQ(list.get(list.size() - 1)), DbObject._ID.NEQ(Long.valueOf(t._id)));
            }

            public int queryLimit(List<T> list, int i, int i2) {
                return Math.max(i2, (i - list.size()) + 1);
            }

            public C22306c<List<T>> uiQuery(final boolean z) {
                final Table<T>.UiQuery uiQuery = Table.this.uiQueries.get(this.key);
                if (uiQuery == null) {
                    uiQuery = new UiQuery(this);
                    Table.this.uiQueries.put(this.key, uiQuery);
                    Filter<T> filter = this.where;
                    if (filter instanceof JoinFilter) {
                        Table.this.joinFilterQueries.put(this.key, (JoinFilter) filter);
                    }
                }
                return ((UiQuery) uiQuery).f56019bs.doOnSubscribe(new d30() { // from class: l.l6c
                    @Override // p149l.d30
                    public final void call() {
                        DatabaseStore.Table.Query.m81247g(this.f126252a, uiQuery, z);
                    }
                }).doOnUnsubscribe(new d30() { // from class: l.m6c
                    @Override // p149l.d30
                    public final void call() {
                        DatabaseStore.Table.Query.m81245e(this.f131456a);
                    }
                });
            }

            public C22306c<j760<List<T>, Map<String, Integer>>> uiQueryWithGruops() {
                final Table<T>.UiQuery uiQuery = Table.this.uiQueries.get(this.key);
                if (uiQuery == null) {
                    uiQuery = new UiQuery(this);
                    Table.this.uiQueries.put(this.key, uiQuery);
                }
                return ((UiQuery) uiQuery).f56019bs.switchMap(new w9j() { // from class: com.tantanapp.common.data.orm.a
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C22306c.just(vwb.m200311Y((DatabaseStore.Table.UiQuery.UiQueryResult) obj, uiQuery.groups));
                    }
                }).doOnSubscribe(new d30() { // from class: l.j6c
                    @Override // p149l.d30
                    public final void call() {
                        DatabaseStore.Table.Query.m81243c(this.f116437a, uiQuery);
                    }
                }).doOnUnsubscribe(new d30() { // from class: l.k6c
                    @Override // p149l.d30
                    public final void call() {
                        DatabaseStore.Table.Query.m81242b(this.f121278a);
                    }
                });
            }

            public C22306c<List<T>> uiQuery() {
                return uiQuery(true);
            }
        }

        public void log(long j, String str) {
            log(j, str, null);
        }

        public void delete(String str) {
            delete(DbObject.f56009ID.mo60175EQ(str));
        }

        public T queryCache(String str) {
            if (edk0.f90613c) {
                n11.m157330c();
            }
            n11.m157335h(str != null);
            T tCached = cached(str);
            if (tCached == null) {
                if (edk0.f90612b) {
                    DatabaseStore.m81229d("miss cache  -> tablename: " + this.tableName + " ;  id : " + str);
                }
                DatabaseStore.this.ensureMainThreadDeferredTransactionStarted();
                tCached = null;
                List<T> listQueryCache = queryCache(DbObject.f56009ID.mo60175EQ(str), null, 1);
                if (listQueryCache != null && listQueryCache.size() != 0) {
                    return listQueryCache.get(0);
                }
            }
            return tCached;
        }

        public void delete(long j) {
            delete(DbObject._ID.mo60175EQ(Long.valueOf(j)));
        }

        public T query(long j) {
            List<T> listQuery = query(DbObject._ID.mo60175EQ(Long.valueOf(j)), null, 1);
            if (listQuery.isEmpty()) {
                return null;
            }
            return listQuery.get(0);
        }

        public T query(String str) {
            n11.m157335h(str != null);
            List<T> listQuery = query(DbObject.f56009ID.mo60175EQ(str), null, 1);
            if (listQuery.isEmpty()) {
                return null;
            }
            return listQuery.get(0);
        }

        public void upsert(T t) {
            upsert(t, null);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m81229d(String str) {
        String str2 = edk0.f90611a;
    }
}
