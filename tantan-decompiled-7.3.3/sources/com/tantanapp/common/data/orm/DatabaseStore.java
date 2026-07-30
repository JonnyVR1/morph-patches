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
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
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
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.bkj0;
import p153l.jyb;
import p153l.kcg0;
import p153l.kmk0;
import p153l.l01;
import p153l.pcj;
import p153l.pf60;
import p153l.qcj;
import p153l.tu2;
import p153l.u11;
import p153l.wpg0;
import p153l.wtq0;
import p153l.x20;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes11.dex */
public class DatabaseStore implements DatabaseErrorHandler {
    public static final boolean ASYNC_INIT = true;
    public static final boolean DETAILED_LOGGING = kmk0.f127509b;
    public static final String TAG = "DatabaseStore";
    public static AtomicInteger debug_asyncFetchCount;
    public static boolean debug_delayTransaction10Seconds;
    public static boolean debug_omitPostingChanges;
    public final String dbName;
    private volatile SQLiteDatabase dbObj;
    public final File dbPath;
    public final List<Table> debug_tables;
    volatile boolean deleted;
    private C22421c<Boolean> foreground;
    private pcj<Long> getStartMillis;
    boolean hasDoneTruncateCheckpoint;
    private volatile kcg0 lifecycleSubs;
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
        x20 action;
        List<Column> watchColumns;

        public TableTrigger(@NonNull List<Column> list, x20 x20Var) {
            this.watchColumns = list;
            this.action = x20Var;
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
                    wtq0.m207906a("wrong change type");
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
        public ArrayList<pf60<x20, x20>> tickSynced = new ArrayList<>();

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

    public DatabaseStore(String str, File file, int i, C22421c<Boolean> c22421c, pcj<Long> pcjVar) {
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
        this.foreground = c22421c;
        this.getStartMillis = pcjVar;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m82408a(final DatabaseStore databaseStore, Boolean bool) {
        databaseStore.getClass();
        databaseStore.uiIsInForeground = bool.booleanValue();
        if (databaseStore.uiIsInForeground) {
            return;
        }
        ThreadUtil.m82493e(new Runnable() { // from class: l.g7c
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                DatabaseStore.m82415g(this.f102526a);
            }
        }, false);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m82410c(final DatabaseStore databaseStore) {
        databaseStore.ensureMainThreadDeferredTransactionStarted();
        databaseStore.lifecycleSubs = databaseStore.foreground.subscribe(new y20() { // from class: l.f7c
            @Override // p153l.y20
            public final void call(Object obj) {
                DatabaseStore.m82408a(this.f97550a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m82411d(DatabaseStore databaseStore, boolean z, pcj pcjVar, y20 y20Var, final x20 x20Var) {
        databaseStore.getClass();
        try {
            if (kmk0.f127509b) {
                debug_asyncFetchCount.incrementAndGet();
            }
            if (databaseStore.m82417db() != null) {
                ReadWriteLock readWriteLock = databaseStore.lock;
                if (!z) {
                    readWriteLock.readLock().lock();
                    databaseStore.asyncFetchInner(pcjVar, y20Var);
                } else if (readWriteLock.readLock().tryLock()) {
                    databaseStore.asyncFetchInner(pcjVar, y20Var);
                } else if (x20Var != null) {
                    ThreadUtil.m82495g(new Runnable() { // from class: l.c7c
                        @Override // java.lang.Runnable
                        public final void run() {
                            x20Var.call();
                        }
                    });
                }
            }
        } catch (SQLiteDatabaseCorruptException e) {
            CrashHelper.m82480d(e, 20);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m82413e() {
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
    public static /* synthetic */ void m82415g(DatabaseStore databaseStore) throws Throwable {
        databaseStore.getClass();
        databaseStore.transaction(new x20() { // from class: l.b7c
            @Override // p153l.x20
            public final void call() {
                DatabaseStore.m82413e();
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static void m82416i(String str) {
        String str2 = kmk0.f127508a;
    }

    private void uiRunCheckpoint() {
        if (this.dbObj == null || !this.lock.writeLock().tryLock()) {
            return;
        }
        try {
            db_checkpoint(m82417db());
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public <T> void asyncFetch(final boolean z, final pcj<T> pcjVar, final y20<T> y20Var, final x20 x20Var, boolean z2) {
        ThreadUtil.m82493e(new Runnable() { // from class: l.d7c
            @Override // java.lang.Runnable
            public final void run() {
                DatabaseStore.m82411d(this.f85498a, z, pcjVar, y20Var, x20Var);
            }
        }, z2);
    }

    public <T> void asyncFetchInner(pcj<T> pcjVar, final y20<T> y20Var) {
        if (deleted()) {
            return;
        }
        m82417db().beginTransactionDeferredReadOnly();
        try {
            final T tCall = pcjVar.call();
            ThreadUtil.m82495g(new Runnable() { // from class: l.a7c
                @Override // java.lang.Runnable
                public final void run() {
                    y20Var.call(tCall);
                }
            });
            if (kmk0.f127509b) {
                int iDecrementAndGet = debug_asyncFetchCount.decrementAndGet();
                if (DETAILED_LOGGING) {
                    m82412d("async fetch finished, currently has " + iDecrementAndGet);
                }
            }
            m82417db().setTransactionSuccessful();
        } finally {
            m82417db().endTransaction();
            this.lock.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: db */
    public SQLiteDatabase m82417db() {
        if (this.dbObj != null) {
            return this.dbObj;
        }
        this.lock.writeLock().lock();
        try {
            if (this.dbObj == null) {
                String str = kmk0.f127508a;
                tu2.m192703a("[common][DatabaseStore]", "inter create db");
                if (kmk0.f127510c) {
                    SystemClock.uptimeMillis();
                }
                File file = this.dbPath;
                file.getParentFile().mkdirs();
                SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(file.getPath(), null, 805306368, true, this);
                tu2.m192703a("[common][DatabaseStore]", "SQLiteDatabase openDatabase");
                sQLiteDatabaseOpenDatabase.acquirePrimaryConnection();
                try {
                    int version = sQLiteDatabaseOpenDatabase.getVersion();
                    if (version != this.version) {
                        if (version == 0) {
                            sQLiteDatabaseOpenDatabase.beginTransaction();
                            try {
                                if (kmk0.f127509b) {
                                    m82412d("creating db");
                                }
                                try {
                                    onCreate(sQLiteDatabaseOpenDatabase);
                                } catch (Exception unused) {
                                    onCorruption(sQLiteDatabaseOpenDatabase);
                                }
                                tu2.m192703a("[common][DatabaseStore]", "SQLiteDatabase onCreate");
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
                                if (kmk0.f127509b) {
                                    m82412d("updating db");
                                }
                                try {
                                    onUpgrade(sQLiteDatabaseOpenDatabase, version, this.version);
                                } catch (Exception unused2) {
                                    onCorruption(sQLiteDatabaseOpenDatabase);
                                }
                                tu2.m192703a("[common][DatabaseStore]", "SQLiteDatabase onUpgrade");
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
                    if (kmk0.f127510c) {
                        SystemClock.uptimeMillis();
                    }
                    ThreadUtil.m82496h(new Runnable() { // from class: l.e7c
                        @Override // java.lang.Runnable
                        public final void run() {
                            DatabaseStore.m82410c(this.f92417a);
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
        if (kmk0.f127510c) {
            SystemClock.uptimeMillis();
        }
        StringBuilder sb = new StringBuilder("PRAGMA wal_checkpoint(");
        sb.append(this.hasDoneTruncateCheckpoint ? "PASSIVE" : "TRUNCATE");
        sb.append(");");
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
        this.hasDoneTruncateCheckpoint = true;
        cursorRawQuery.getCount();
        cursorRawQuery.close();
        if (kmk0.f127510c) {
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
        return m82417db();
    }

    public void delete() {
        this.lock.writeLock().lock();
        this.deleted = true;
        try {
            if (this.dbObj != null) {
                if (this.dbObj.inTransaction()) {
                    this.dbObj.endTransaction();
                }
                tu2.m192703a("[common][DatabaseStore]", "SQLiteDatabase close");
                this.dbObj.close();
                if (this.lifecycleSubs != null && !this.lifecycleSubs.isUnsubscribed()) {
                    this.lifecycleSubs.unsubscribe();
                }
                this.dbObj = null;
            }
            tu2.m192703a("[common][DatabaseStore]", "SQLiteDatabase before delete");
            SQLiteDatabase.deleteDatabase(this.dbPath);
            tu2.m192703a("[common][DatabaseStore]", "SQLiteDatabase after delete");
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public boolean deleted() {
        return this.deleted;
    }

    public void ensureMainThreadDeferredTransactionStarted() {
        if (kmk0.f127510c) {
            u11.m193889c();
        }
        if (this.uiDeferredTransactionStarted) {
            return;
        }
        if (kmk0.f127510c) {
            SystemClock.uptimeMillis();
        }
        m82417db().beginTransactionDeferredReadOnly();
        m82417db().getVersion();
        if (kmk0.f127510c) {
            SystemClock.uptimeMillis();
        }
        this.uiDeferredTransactionStarted = true;
    }

    @Override // io.requery.android.database.DatabaseErrorHandler
    public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        if (kmk0.f127509b) {
            m82412d("corruption!");
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
        if (kmk0.f127510c) {
            u11.m193889c();
        }
        if (kmk0.f127509b) {
            jNanoTime = System.nanoTime();
            m82416i("started sync ui cache");
        } else {
            jNanoTime = 0;
        }
        if (this.uiDeferredTransactionStarted) {
            try {
                m82417db().setTransactionSuccessful();
                m82417db().endTransaction();
                this.uiDeferredTransactionStarted = false;
                if (DETAILED_LOGGING) {
                    m82416i("ended previous deferred transaction " + (System.nanoTime() - jNanoTime));
                }
            } catch (Throwable th) {
                m82417db().endTransaction();
                this.uiDeferredTransactionStarted = false;
                throw th;
            }
        }
        if (!this.uiIsInForeground && this.getStartMillis.call().longValue() > Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) {
            uiRunCheckpoint();
        }
        Iterator<pf60<x20, x20>> it = transaction.tickSynced.iterator();
        while (it.hasNext()) {
            it.next().f152156a.call();
        }
        for (Table table : this.tables) {
            table.syncUiCache(transaction.get(table.tableName));
        }
        ensureMainThreadDeferredTransactionStarted();
        if (DETAILED_LOGGING) {
            m82416i("ended sync");
        }
        Iterator<pf60<x20, x20>> it2 = transaction.tickSynced.iterator();
        while (it2.hasNext()) {
            it2.next().f152157b.call();
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
        if (kmk0.f127509b) {
            m82416i("ended trigger");
        }
    }

    public void tickSync(x20 x20Var, x20 x20Var2) {
        if (kmk0.f127510c) {
            u11.m193892f();
            u11.m193894h(this.transaction != null);
        }
        this.transaction.tickSynced.add(jyb.m147494Y(x20Var, x20Var2));
    }

    public void transaction(x20 x20Var) throws Throwable {
        if (kmk0.f127510c) {
            u11.m193892f();
        }
        if (deleted()) {
            if (kmk0.f127509b) {
                m82412d("deleted database calling transaction");
                return;
            }
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.lock.writeLock().lock();
        m82417db().beginTransactionDeferredWrite();
        boolean z = false;
        try {
            if (kmk0.f127510c) {
                u11.m193894h(this.transaction == null);
            }
            if (DETAILED_LOGGING) {
                m82412d("started transaction");
            }
            this.transaction = new Transaction();
            x20Var.call();
            m82417db().setTransactionSuccessful();
            try {
                if (kmk0.f127509b) {
                    m82412d("time used: " + (SystemClock.uptimeMillis() - jUptimeMillis));
                }
                m82417db().endTransaction();
                if (kmk0.f127509b && debug_delayTransaction10Seconds) {
                    String str = kmk0.f127508a;
                    try {
                        Thread.sleep(10000L);
                    } catch (InterruptedException unused) {
                    }
                    String str2 = kmk0.f127508a;
                }
                if (!debug_omitPostingChanges) {
                    if (DETAILED_LOGGING) {
                        m82412d("ended transaction, posting sync");
                    }
                    ThreadUtil.m82495g(new Runnable() { // from class: com.tantanapp.common.data.orm.DatabaseStore.1
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
                m82417db().endTransaction();
                if (kmk0.f127509b && debug_delayTransaction10Seconds) {
                    String str3 = kmk0.f127508a;
                    try {
                        Thread.sleep(10000L);
                    } catch (InterruptedException unused2) {
                    }
                    String str4 = kmk0.f127508a;
                }
                if (z && !debug_omitPostingChanges) {
                    if (DETAILED_LOGGING) {
                        m82412d("ended transaction, posting sync");
                    }
                    ThreadUtil.m82495g(new Runnable() { // from class: com.tantanapp.common.data.orm.DatabaseStore.1
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
        protected pf60<Table, bkj0<qcj<List<T>, Filter>, pcj<Order>, Integer>> outerJoin;
        public final String tableName;
        protected Map<String, TableTrigger> triggers;
        public ConcurrentHashMap<String, Table<T>.UiGet> uiGets;
        public ConcurrentHashMap<String, Table<T>.UiQuery> uiQueries;

        public class UiGet {

            /* JADX INFO: renamed from: id */
            public final String f56866id;
            private AtomicInteger status = new AtomicInteger(0);
            boolean changed = false;

            /* JADX INFO: renamed from: bs */
            private final C22507a<T> f56865bs = C22507a.m222758b();

            public UiGet(String str) {
                this.f56866id = str;
            }

            /* JADX INFO: renamed from: a */
            public static /* synthetic */ void m82431a(UiGet uiGet, DbObject dbObject) {
                uiGet.status.set(2);
                if (dbObject != null) {
                    Table.this.cache(dbObject.f56859id, dbObject);
                }
                uiGet.f56865bs.onNext(dbObject);
            }

            public void triggerIfChanged() {
                if (this.changed) {
                    this.f56865bs.onNext((T) Table.this.queryCache(this.f56866id));
                    if (DatabaseStore.DETAILED_LOGGING) {
                        DatabaseStore.m82412d("triggered get " + this.f56866id);
                    }
                    this.changed = false;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public void tryInitiate(boolean z) {
                if (this.status.compareAndSet(0, 1)) {
                    DbObject dbObject = (DbObject) Table.this.cached(this.f56866id);
                    if (dbObject != null) {
                        this.status.set(2);
                        this.f56865bs.onNext((T) dbObject);
                    } else if (z && !DatabaseStore.debug_delayTransaction10Seconds) {
                        DatabaseStore.this.asyncFetch(false, new pcj() { // from class: l.t7c
                            @Override // p153l.pcj, java.util.concurrent.Callable
                            public final Object call() {
                                DatabaseStore.Table.UiGet uiGet = this.f172415a;
                                return DatabaseStore.Table.this.query(uiGet.f56866id);
                            }
                        }, new y20() { // from class: l.u7c
                            @Override // p153l.y20
                            public final void call(Object obj) {
                                DatabaseStore.Table.UiGet.m82431a(this.f177894a, (DbObject) obj);
                            }
                        }, null, true);
                    } else {
                        this.status.set(2);
                        this.f56865bs.onNext((T) Table.this.queryCache(this.f56866id));
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
            list.add(new Index(DbObject.f56857ID));
            DatabaseStore.this.tables.add(this);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m82418a(Table table, String str, UiGet uiGet, boolean z) {
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
        public static /* synthetic */ void m82420c(final Table table, final String str) {
            table.getClass();
            ThreadUtil.m82496h(new Runnable() { // from class: l.h7c
                @Override // java.lang.Runnable
                public final void run() {
                    DatabaseStore.Table.m82421d(this.f108105a, str);
                }
            }, 1000L);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void cacheQueryJoinData(T t) {
            if (this.joinFilterQueries.size() > 0) {
                for (JoinFilter joinFilter : this.joinFilterQueries.values()) {
                    if (joinFilter.baseFilter().filter(t) && !TextUtils.isEmpty((String) joinFilter.foreignC().get(t))) {
                        DbObject dbObjectQuery = joinFilter.joinTable().query((String) joinFilter.foreignC().get(t));
                        if (kmk0.f127509b) {
                            dbObjectQuery.toJson();
                        }
                        if (dbObjectQuery != null) {
                            joinFilter.joinTable().cache(dbObjectQuery.f56859id, dbObjectQuery);
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m82421d(Table table, String str) {
            Table<T>.UiGet uiGet = table.uiGets.get(str);
            if (uiGet == null || ((UiGet) uiGet).f56865bs.m222764h()) {
                return;
            }
            table.uiGets.remove(str);
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m82422e(Table table, List list) {
            table.getClass();
            if (kmk0.f127510c) {
                table.size();
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DbObject dbObject = (DbObject) it.next();
                table.cache(dbObject.f56859id, dbObject);
            }
        }

        private void traceMeLog(String str, long j) {
            if ("users".equals(this.tableName) && str.equals(DatabaseStore.this.dbName.replace("core_v2_", ""))) {
                tu2.m192703a("[common][DatabaseStore]", "me insert :" + str + " result:" + j);
            }
        }

        public Set<String> allIds() {
            long jNanoTime = System.nanoTime();
            Cursor cursorQuery = DatabaseStore.this.m82417db().query(this.tableName, new String[]{DbObject.f56857ID.NAME}, null, null, null, null, null);
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
            if (kmk0.f127509b) {
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
                cursorRawQuery = databaseStore.m82417db().rawQuery(((JoinFilter) filter).countSql(), sqlSegmentEmit.args);
            } else {
                SQLiteDatabase sQLiteDatabaseM82417db = databaseStore.m82417db();
                StringBuilder sb = new StringBuilder("select count(_id) from ");
                sb.append(this.tableName);
                sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                if (sqlSegmentEmit.part == null) {
                    str = "";
                } else {
                    str = " WHERE " + sqlSegmentEmit.part;
                }
                sb.append(str);
                cursorRawQuery = sQLiteDatabaseM82417db.rawQuery(sb.toString(), sqlSegmentEmit.args);
            }
            try {
                int i2 = cursorRawQuery.moveToFirst() ? cursorRawQuery.getInt(0) : -1;
                if (i <= 0 || i2 <= i) {
                    i = i2;
                }
                cursorRawQuery.close();
                if (kmk0.f127509b) {
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
            if (kmk0.f127510c) {
                u11.m193892f();
                u11.m193894h(DatabaseStore.this.transaction != null);
            }
            long jNanoTime = System.nanoTime();
            SqlSegment sqlSegmentEmit = filter == null ? SqlSegment.NULL : filter.emit();
            boolean z = filter instanceof JoinFilter;
            DatabaseStore databaseStore = DatabaseStore.this;
            Cursor cursorRawQuery = z ? databaseStore.m82417db().rawQuery(((JoinFilter) filter).querySql(null, -1), sqlSegmentEmit.args) : databaseStore.m82417db().query(this.tableName, null, sqlSegmentEmit.part, sqlSegmentEmit.args, null, null, null);
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
            int iDelete = DatabaseStore.this.m82417db().delete(this.tableName, sqlSegmentEmit.part, sqlSegmentEmit.args);
            if (kmk0.f127510c) {
                u11.m193894h(iDelete == arrayList.size());
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                DatabaseStore.this.transaction.delete(this, (DbObject) it.next());
            }
            if (kmk0.f127509b) {
                log(jNanoTime, "delete by where " + sqlSegmentEmit.part + "\n\t\t" + Arrays.toString(sqlSegmentEmit.args));
            }
        }

        public void deleteAll() {
            delete(Filter.TRUE);
        }

        public Map<String, Integer> groups(Filter<T> filter, DoubleOrder<T> doubleOrder) {
            String strValueOf;
            u11.m193888b(filter instanceof JoinFilter);
            long jNanoTime = System.nanoTime();
            SqlSegment sqlSegmentEmit = filter == null ? SqlSegment.NULL : filter.emit();
            Cursor cursorQuery = DatabaseStore.this.m82417db().query(this.tableName, new String[]{doubleOrder.getFirst().column().NAME, "count(" + doubleOrder.getFirst().column().NAME + ")"}, sqlSegmentEmit.part, sqlSegmentEmit.args, doubleOrder.getFirst().column().NAME, null, doubleOrder.getFirst().emit());
            l01 l01Var = new l01();
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
                    l01Var.put(strValueOf, Integer.valueOf(cursorQuery.getInt(1)));
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            cursorQuery.close();
            if (kmk0.f127509b) {
                log(jNanoTime, "groups " + doubleOrder.getFirst().column().NAME + "\n\t\t" + l01Var.size() + "\n\t\t: " + l01Var.toString());
            }
            return l01Var;
        }

        public void insert(T t) {
            if (kmk0.f127510c) {
                u11.m193892f();
                u11.m193894h(DatabaseStore.this.transaction != null);
            }
            long jNanoTime = System.nanoTime();
            ContentValues contentValues = new ContentValues();
            this.adapter.write(t, contentValues);
            t._id = DatabaseStore.this.m82417db().insert(this.tableName, null, contentValues);
            if (kmk0.f127509b) {
                log(jNanoTime, "insert " + t.f56859id);
            }
            DatabaseStore.this.transaction.insert(this, t);
            cacheQueryJoinData(t);
        }

        public void log(long j, String str, String str2) {
            if (kmk0.f127509b) {
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
                    String str3 = kmk0.f127508a;
                    return;
                }
                if (j2 <= 10) {
                    if (name.equals(BLiveTraceServerLocation.main)) {
                        String str4 = kmk0.f127508a;
                        return;
                    } else {
                        String str5 = kmk0.f127508a;
                        return;
                    }
                }
                if (name.equals(BLiveTraceServerLocation.main)) {
                    String str6 = kmk0.f127508a;
                } else {
                    String str7 = kmk0.f127508a;
                }
            }
        }

        public List<T> query(Filter<T> filter, Order<T> order, int i) {
            String str;
            Cursor cursorQuery;
            String str2;
            if (kmk0.f127510c) {
                u11.m193892f();
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
                cursorQuery = databaseStore.m82417db().rawQuery(((JoinFilter) filter).querySql(order, i), sqlSegmentEmit.args);
            } else {
                cursorQuery = databaseStore.m82417db().query(this.tableName, null, sqlSegmentEmit.part, sqlSegmentEmit.args, null, null, order == null ? null : order.emit(), str);
            }
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            if (DatabaseStore.DETAILED_LOGGING) {
                if (z) {
                    strExplainQuery = ((JoinFilter) filter).querySql(order, i);
                } else {
                    SQLiteDatabase sQLiteDatabaseM82417db = DatabaseStore.this.m82417db();
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
                    strExplainQuery = DatabaseStore.explainQuery(sQLiteDatabaseM82417db, sb.toString(), sqlSegmentEmit.args);
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
            if (kmk0.f127509b) {
                log(jNanoTime, "query " + sqlSegmentEmit.part + "\n\t\t" + Arrays.toString(sqlSegmentEmit.args) + "\n\t\tres: ", strExplainQuery);
            }
            return arrayList;
        }

        public List<T> queryCache(Filter<T> filter, Order<T> order, int i) {
            String str;
            Cursor cursorQuery;
            if (kmk0.f127510c) {
                u11.m193889c();
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
                cursorQuery = databaseStore.m82417db().rawQuery(((JoinFilter) filter).querySql(order, i), sqlSegmentEmit.args);
            } else {
                cursorQuery = databaseStore.m82417db().query(this.tableName, null, sqlSegmentEmit.part, sqlSegmentEmit.args, null, null, order != null ? order.emit() : null, str);
            }
            ArrayList arrayList = new ArrayList(10);
            try {
                int columnIndex = cursorQuery.getColumnIndex(DbObject.f56857ID.NAME);
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
                if (kmk0.f127509b) {
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
            SQLiteDatabase sQLiteDatabaseM82417db = DatabaseStore.this.m82417db();
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
            Cursor cursorRawQuery = sQLiteDatabaseM82417db.rawQuery(sb.toString(), sqlSegmentEmit.args);
            try {
                int i = cursorRawQuery.moveToFirst() ? cursorRawQuery.getInt(0) : -1;
                cursorRawQuery.close();
                if (kmk0.f127509b) {
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
                        DatabaseStore.m82412d("syncing " + this.tableName + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + change.type);
                    }
                    int i = change.type;
                    if (i == 0) {
                        DbObject dbObject3 = change.item;
                        Iterator<Table<T>.UiQuery> it = this.uiQueries.values().iterator();
                        while (it.hasNext()) {
                            it.next().syncCacheDelete(dbObject3);
                        }
                        remove(dbObject3.f56859id);
                    } else if (i == 1) {
                        DbObject dbObject4 = change.item;
                        Iterator<Table<T>.UiQuery> it2 = this.uiQueries.values().iterator();
                        while (it2.hasNext()) {
                            it2.next().syncCacheInsert(dbObject4);
                        }
                        cache(dbObject4.f56859id, dbObject4);
                    } else if (i == 2) {
                        DbObject dbObject5 = change.item;
                        DbObject dbObject6 = change.item2;
                        Iterator<Table<T>.UiQuery> it3 = this.uiQueries.values().iterator();
                        while (it3.hasNext()) {
                            it3.next().syncCacheUpdate(dbObject5, dbObject6);
                        }
                        String str = dbObject5.f56859id;
                        if (str == null) {
                            throw new UpDateException("to.id  = " + dbObject6.f56859id + "db size:" + DatabaseStore.this.dbPath.length());
                        }
                        if (str.equals(dbObject6.f56859id)) {
                            cache(dbObject6.f56859id, dbObject6);
                        } else {
                            remove(dbObject5.f56859id);
                        }
                    }
                    DbObject dbObject7 = change.item;
                    if (dbObject7 != null && (uiGet = this.uiGets.get(dbObject7.f56859id)) != null && ((dbObject2 = change.item2) == null || !change.item.equals(dbObject2))) {
                        uiGet.changed = true;
                    }
                    DbObject dbObject8 = change.item2;
                    if (dbObject8 != null && ((dbObject = change.item) == null || !dbObject.f56859id.equals(dbObject8.f56859id))) {
                        Table<T>.UiGet uiGet2 = this.uiGets.get(change.item2.f56859id);
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

        public C22421c<T> uiGet(final String str, final boolean z) {
            u11.m193894h(str != null);
            final Table<T>.UiGet uiGet = this.uiGets.get(str);
            if (uiGet == null) {
                uiGet = new UiGet(str);
                this.uiGets.put(str, uiGet);
            }
            return ((UiGet) uiGet).f56865bs.doOnSubscribe(new x20() { // from class: l.l7c
                @Override // p153l.x20
                public final void call() {
                    DatabaseStore.Table.m82418a(this.f130336a, str, uiGet, z);
                }
            }).doOnUnsubscribe(new x20() { // from class: l.m7c
                @Override // p153l.x20
                public final void call() {
                    DatabaseStore.Table.m82420c(this.f135066a, str);
                }
            });
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void update(List<pf60<Column, Object>> list, Filter filter) {
            if (kmk0.f127510c) {
                u11.m193892f();
                u11.m193894h(DatabaseStore.this.transaction != null);
            }
            long jNanoTime = System.nanoTime();
            SqlSegment sqlSegmentEmit = filter == null ? SqlSegment.NULL : filter.emit();
            boolean z = filter instanceof JoinFilter;
            DatabaseStore databaseStore = DatabaseStore.this;
            Cursor cursorRawQuery = z ? databaseStore.m82417db().rawQuery(((JoinFilter) filter).querySql(null, -1), sqlSegmentEmit.args) : databaseStore.m82417db().query(this.tableName, null, sqlSegmentEmit.part, sqlSegmentEmit.args, null, null, null);
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
                if (kmk0.f127509b) {
                    log(jNanoTime, "update by where no result " + sqlSegmentEmit.part + "\n\t\t" + Arrays.toString(sqlSegmentEmit.args));
                    return;
                }
                return;
            }
            ContentValues contentValues = new ContentValues();
            for (pf60<Column, Object> pf60Var : list) {
                pf60Var.f152156a.put(contentValues, pf60Var.f152157b);
            }
            int iUpdate = DatabaseStore.this.m82417db().update(this.tableName, contentValues, sqlSegmentEmit.part, sqlSegmentEmit.args);
            if (kmk0.f127510c) {
                u11.m193894h(iUpdate == arrayList.size());
            }
            for (DbObject dbObject : arrayList) {
                try {
                    DbObject dbObject2 = (DbObject) dbObject.mo225055clone();
                    for (pf60<Column, Object> pf60Var2 : list) {
                        pf60Var2.f152156a.set(dbObject2, pf60Var2.f152157b);
                    }
                    DatabaseStore.this.transaction.update(this, dbObject, dbObject2);
                } catch (CloneNotSupportedException unused) {
                }
            }
            if (kmk0.f127509b) {
                log(jNanoTime, "update by where " + sqlSegmentEmit.part + "\n\t\t" + Arrays.toString(sqlSegmentEmit.args));
            }
        }

        public void updateBy_id(T t) {
            if (kmk0.f127510c) {
                u11.m193892f();
                u11.m193894h(DatabaseStore.this.transaction != null);
            }
            long jNanoTime = System.nanoTime();
            SQLiteDatabase sQLiteDatabaseM82417db = DatabaseStore.this.m82417db();
            String str = this.tableName;
            StringBuilder sb = new StringBuilder();
            LongColumn<DbObject> longColumn = DbObject._ID;
            sb.append(longColumn);
            sb.append(" = ?");
            Cursor cursorQuery = sQLiteDatabaseM82417db.query(str, null, sb.toString(), new String[]{Long.toString(t._id)}, null, null, null);
            try {
                T t2 = cursorQuery.moveToNext() ? this.adapter.read(cursorQuery, 0) : null;
                cursorQuery.close();
                if (t2 == null) {
                    if (kmk0.f127509b) {
                        log(jNanoTime, "update by _id no result " + t._id);
                        return;
                    }
                    return;
                }
                ContentValues contentValues = new ContentValues();
                this.adapter.write(t, contentValues);
                DatabaseStore.this.m82417db().update(this.tableName, contentValues, longColumn + " = ?", new String[]{Long.toString(t._id)});
                DatabaseStore.this.transaction.update(this, t2, t);
                if (kmk0.f127509b) {
                    log(jNanoTime, "update by _id " + t._id);
                }
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }

        public T upsert(T t, z20<T, T> z20Var) {
            if (kmk0.f127510c) {
                u11.m193892f();
                u11.m193894h(DatabaseStore.this.transaction != null);
            }
            long jNanoTime = System.nanoTime();
            SQLiteDatabase sQLiteDatabaseM82417db = DatabaseStore.this.m82417db();
            String str = this.tableName;
            StringBuilder sb = new StringBuilder();
            StringColumn stringColumn = DbObject.f56857ID;
            sb.append(stringColumn);
            sb.append(" = ?");
            Cursor cursorQuery = sQLiteDatabaseM82417db.query(str, null, sb.toString(), new String[]{t.f56859id}, null, null, null);
            try {
                T t2 = cursorQuery.moveToNext() ? this.adapter.read(cursorQuery, 0) : null;
                cursorQuery.close();
                if (t2 == null) {
                    if (z20Var != null) {
                        z20Var.call(t, null);
                    }
                    ContentValues contentValues = new ContentValues();
                    this.adapter.write(t, contentValues);
                    long jInsert = DatabaseStore.this.m82417db().insert(this.tableName, null, contentValues);
                    t._id = jInsert;
                    traceMeLog(t.f56859id, jInsert);
                    if (kmk0.f127509b) {
                        log(jNanoTime, "insert " + t.f56859id);
                    }
                    DatabaseStore.this.transaction.insert(this, t);
                    cacheQueryJoinData(t);
                    return t;
                }
                t._id = t2._id;
                if (z20Var != null) {
                    z20Var.call(t, t2);
                }
                t.mergeData(t2);
                if (!t2.equals(t)) {
                    ContentValues contentValues2 = new ContentValues();
                    this.adapter.write(t, contentValues2);
                    int iUpdate = DatabaseStore.this.m82417db().update(this.tableName, contentValues2, stringColumn + " = ?", new String[]{t.f56859id});
                    if (kmk0.f127509b) {
                        log(jNanoTime, "update " + t.f56859id);
                    }
                    if (kmk0.f127510c) {
                        u11.m193894h(iUpdate > 0);
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
            ThreadUtil.m82496h(new Runnable() { // from class: l.k7c
                @Override // java.lang.Runnable
                public final void run() {
                    DatabaseStore.Table table = this.f124257a;
                    DatabaseStore.this.asyncFetch(false, new pcj() { // from class: l.i7c
                        @Override // p153l.pcj, java.util.concurrent.Callable
                        public final Object call() {
                            return this.f113249a.query(null, null, i);
                        }
                    }, new y20() { // from class: l.j7c
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            DatabaseStore.Table.m82422e(this.f118672a, (List) obj);
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
            private C22507a<Table<T>.UiQuery.UiQueryResult> f56867bs = C22507a.m222758b();

            public UiQuery(Table<T>.Query query) {
                this.query = query;
                if (query.orderBy instanceof DoubleOrder) {
                    DatabaseStore.this.ensureMainThreadDeferredTransactionStarted();
                    this.groups = query.gruops();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: a */
            public static /* synthetic */ void m82433a(UiQuery uiQuery, bkj0 bkj0Var) {
                uiQuery.status.set(2);
                for (DbObject dbObject : (List) bkj0Var.f77082b) {
                    Table.this.cache(dbObject.f56859id, dbObject);
                }
                uiQuery.tryCacheOuterJoin((List) bkj0Var.f77083c);
                if (uiQuery.f56867bs.m222761e() == null) {
                    Table<T>.UiQuery.UiQueryResult uiQueryResult = uiQuery.new UiQueryResult();
                    uiQueryResult.base = (List) bkj0Var.f77082b;
                    uiQueryResult.size = ((Integer) bkj0Var.f77081a).intValue();
                    uiQueryResult.full = uiQueryResult.base.size() == uiQueryResult.size;
                    uiQuery.f56867bs.onNext(uiQueryResult);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: b */
            public static /* synthetic */ String m82434b(JoinFilter joinFilter, DbObject dbObject) {
                return (String) joinFilter.foreignC().get(dbObject);
            }

            /* JADX INFO: renamed from: c */
            public static /* synthetic */ bkj0 m82435c(UiQuery uiQuery) {
                ArrayList arrayList;
                Table<T>.Query query = uiQuery.query;
                int i = query.initPageSize;
                if (i <= 0) {
                    i = query.pageSize;
                }
                u11.m193894h(i > 0);
                Table table = Table.this;
                Table<T>.Query query2 = uiQuery.query;
                List<T> listQuery = table.query(query2.where, query2.orderBy, i);
                int size = listQuery.size() < i ? listQuery.size() : uiQuery.query.count();
                if (size == 0) {
                    arrayList = new ArrayList();
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    pf60<Table, bkj0<qcj<List<T>, Filter>, pcj<Order>, Integer>> pf60Var = Table.this.outerJoin;
                    if (pf60Var != null) {
                        arrayList2.add(jyb.m147494Y(Table.this.outerJoin.f152156a, pf60Var.f152156a.query(pf60Var.f152157b.f77081a.call(listQuery), Table.this.outerJoin.f152157b.f77082b.call(), Table.this.outerJoin.f152157b.f77083c.intValue())));
                    }
                    pf60<Table, List> pf60VarQueryJoinData = uiQuery.queryJoinData(listQuery);
                    if (pf60VarQueryJoinData != null) {
                        arrayList2.add(pf60VarQueryJoinData);
                    }
                    arrayList = arrayList2;
                }
                return bkj0.m104818a(Integer.valueOf(size), listQuery, arrayList);
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
            public pf60<Table, List> queryJoinData(List<T> list) {
                Filter<T> filter = this.query.where;
                if (filter instanceof JoinFilter) {
                    final JoinFilter joinFilter = (JoinFilter) filter;
                    pf60<Table, bkj0<qcj<List<T>, Filter>, pcj<Order>, Integer>> pf60Var = Table.this.outerJoin;
                    if (pf60Var == null || pf60Var.f152156a != joinFilter.joinTable()) {
                        List<String> listM147489T = jyb.m147489T(jyb.m147522n(list, new qcj() { // from class: l.x7c
                            @Override // p153l.qcj
                            public final Object call(Object obj) {
                                return Boolean.valueOf(!TextUtils.isEmpty((String) joinFilter.foreignC().get((DbObject) obj)));
                            }
                        }), new qcj() { // from class: l.y7c
                            @Override // p153l.qcj
                            public final Object call(Object obj) {
                                return DatabaseStore.Table.UiQuery.m82434b(joinFilter, (DbObject) obj);
                            }
                        });
                        DatabaseStore.m82412d("cache join ids -> ids= " + TextUtils.join(Constants.SEPARATOR_COMMA, listM147489T));
                        List<T> listQuery = joinFilter.joinTable().query(DbObject.f56857ID.m82451IN(listM147489T), null, -1);
                        DatabaseStore.m82412d("cache join data size -> size " + listQuery.size());
                        return jyb.m147494Y(joinFilter.joinTable(), listQuery);
                    }
                }
                return null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void tryCacheOuterJoin(List<pf60<Table, List>> list) {
                String str;
                if (list.size() > 0) {
                    for (pf60<Table, List> pf60Var : list) {
                        for (DbObject dbObject : pf60Var.f152157b) {
                            if (dbObject != null && (str = dbObject.f56859id) != null) {
                                pf60Var.f152156a.cache(str, dbObject);
                            }
                        }
                    }
                }
            }

            public List<T> debug_result() {
                return this.f56867bs.m222761e();
            }

            public Table<T>.UiQuery.UiQueryResult itemsRead() {
                Table<T>.UiQuery.UiQueryResult uiQueryResult = this.tempItems;
                return uiQueryResult == null ? this.f56867bs.m222761e() : uiQueryResult;
            }

            public Table<T>.UiQuery.UiQueryResult itemsWrite() {
                if (this.tempItems == null && this.f56867bs.m222761e() != null) {
                    this.tempItems = new UiQueryResult(this.f56867bs.m222761e());
                    if (DatabaseStore.DETAILED_LOGGING) {
                        DatabaseStore.m82412d(((Query) this.query).key + " temp items created for write");
                    }
                }
                return this.tempItems;
            }

            public void syncCacheDelete(T t) {
                Table<T>.UiQuery.UiQueryResult uiQueryResultItemsRead = itemsRead();
                boolean z = DatabaseStore.DETAILED_LOGGING;
                if (z) {
                    DatabaseStore.m82412d(((Query) this.query).key + " sync cache delete");
                }
                if (uiQueryResultItemsRead == null || !filter(t)) {
                    return;
                }
                if (z) {
                    uiQueryResultItemsRead.m82440dd("sync cache delete inside");
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
                    } else if (kmk0.f127509b) {
                        wtq0.m207906a("there should be a value");
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
                        uiQueryResultItemsRead.m82440dd("item removed");
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
                        uiQueryResultItemsWrite.m82440dd("size changed");
                    }
                }
            }

            public boolean syncCacheInsert(T t) {
                Table<T>.UiQuery.UiQueryResult uiQueryResultItemsRead = itemsRead();
                boolean z = DatabaseStore.DETAILED_LOGGING;
                if (z) {
                    DatabaseStore.m82412d(((Query) this.query).key + " sync cache insert");
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
                            uiQueryResultItemsRead.m82440dd("sync cache insert nothing");
                        }
                        return false;
                    }
                    if (list != null && !uiQueryResultItemsRead.full) {
                        if (z) {
                            uiQueryResultItemsRead.m82440dd("sync cache insert partial");
                        }
                        int iBinarySearchUsingLocalId = Table.this.binarySearchUsingLocalId(uiQueryResultItemsRead.base, t, this.query.orderBy);
                        if (iBinarySearchUsingLocalId < 0) {
                            iBinarySearchUsingLocalId = (-iBinarySearchUsingLocalId) - 1;
                        } else if (kmk0.f127510c) {
                            DatabaseStore.m82412d(uiQueryResultItemsRead.base.get(iBinarySearchUsingLocalId).toJson() + "\n\n" + t.toJson());
                            wpg0.m207458a();
                            return false;
                        }
                        if (uiQueryResultItemsRead.size >= 0) {
                            uiQueryResultItemsRead = itemsWrite();
                            uiQueryResultItemsRead.size++;
                            if (z) {
                                uiQueryResultItemsRead.m82440dd("size updated");
                            }
                        }
                        if (iBinarySearchUsingLocalId >= uiQueryResultItemsRead.base.size()) {
                            return false;
                        }
                        Table<T>.UiQuery.UiQueryResult uiQueryResultItemsWrite = itemsWrite();
                        uiQueryResultItemsWrite.base.add(iBinarySearchUsingLocalId, t);
                        if (z) {
                            uiQueryResultItemsWrite.m82440dd("item inserted");
                        }
                        return true;
                    }
                    if (list == null && uiQueryResultItemsRead.size >= 0 && !uiQueryResultItemsRead.full) {
                        if (z) {
                            uiQueryResultItemsRead.m82440dd("sync cache insert size");
                        }
                        Table<T>.UiQuery.UiQueryResult uiQueryResultItemsWrite2 = itemsWrite();
                        uiQueryResultItemsWrite2.size++;
                        if (z) {
                            uiQueryResultItemsWrite2.m82440dd("size updated");
                        }
                        return false;
                    }
                    if (list != null && uiQueryResultItemsRead.size >= 0 && uiQueryResultItemsRead.full) {
                        if (z) {
                            uiQueryResultItemsRead.m82440dd("sync cache insert full");
                        }
                        int iBinarySearchUsingLocalId2 = Table.this.binarySearchUsingLocalId(uiQueryResultItemsRead.base, t, this.query.orderBy);
                        if (iBinarySearchUsingLocalId2 < 0) {
                            iBinarySearchUsingLocalId2 = (-iBinarySearchUsingLocalId2) - 1;
                        } else if (kmk0.f127510c) {
                            DatabaseStore.m82412d(uiQueryResultItemsRead.base.get(iBinarySearchUsingLocalId2).toJson() + "\n\n" + t.toJson());
                            wpg0.m207458a();
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
                            uiQueryResultItemsWrite3.m82440dd("sync cache insert full end");
                        }
                        return true;
                    }
                    if (z) {
                        uiQueryResultItemsRead.m82440dd("what??");
                    }
                    wpg0.m207458a();
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
                        this.f56867bs.onNext(uiQueryResultItemsRead);
                    }
                    if (DatabaseStore.DETAILED_LOGGING) {
                        DatabaseStore.m82412d("triggered query " + ((Query) this.query).key);
                    }
                    this.tempItems = null;
                    this.changed = false;
                }
            }

            public void tryInitiate(boolean z) {
                if (!z || DatabaseStore.debug_delayTransaction10Seconds) {
                    this.status.set(2);
                    this.f56867bs.onNext(new UiQueryResult());
                } else if (this.status.compareAndSet(0, 1)) {
                    DatabaseStore.this.asyncFetch(false, new pcj() { // from class: l.v7c
                        @Override // p153l.pcj, java.util.concurrent.Callable
                        public final Object call() {
                            return DatabaseStore.Table.UiQuery.m82435c(this.f182747a);
                        }
                    }, new y20() { // from class: l.w7c
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            DatabaseStore.Table.UiQuery.m82433a(this.f187730a, (bkj0) obj);
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
                public static /* synthetic */ void m82437a(UiQueryResult uiQueryResult, UiQueryResult uiQueryResult2, int i, int i2, pf60 pf60Var) {
                    UiQuery.this.status.set(2);
                    for (DbObject dbObject : (List) pf60Var.f152156a) {
                        Table.this.cache(dbObject.f56859id, dbObject);
                    }
                    UiQuery.this.tryCacheOuterJoin((List) pf60Var.f152157b);
                    Table<T>.UiQuery.UiQueryResult uiQueryResultItemsRead = UiQuery.this.itemsRead();
                    if (uiQueryResultItemsRead == null || uiQueryResultItemsRead != uiQueryResult2) {
                        if (kmk0.f127509b) {
                            new IllegalStateException("what");
                        }
                    } else if (uiQueryResultItemsRead.size() == i) {
                        uiQueryResult.base.addAll((Collection) pf60Var.f152156a);
                        if (((List) pf60Var.f152156a).size() != i2) {
                            uiQueryResult.size = uiQueryResult.base.size();
                            uiQueryResult.full = true;
                        }
                    }
                }

                /* JADX INFO: renamed from: c */
                public static /* synthetic */ pf60 m82438c(UiQueryResult uiQueryResult, Filter filter, int i) {
                    UiQuery uiQuery = UiQuery.this;
                    List<T> listQuery = Table.this.query(filter, uiQuery.query.orderBy, i);
                    ArrayList arrayList = new ArrayList();
                    pf60<Table, bkj0<qcj<List<T>, Filter>, pcj<Order>, Integer>> pf60Var = Table.this.outerJoin;
                    if (pf60Var != null) {
                        arrayList.add(jyb.m147494Y(Table.this.outerJoin.f152156a, pf60Var.f152156a.query(pf60Var.f152157b.f77081a.call(listQuery), Table.this.outerJoin.f152157b.f77082b.call(), Table.this.outerJoin.f152157b.f77083c.intValue())));
                    }
                    pf60 pf60VarQueryJoinData = UiQuery.this.queryJoinData(listQuery);
                    if (pf60VarQueryJoinData != null) {
                        arrayList.add(pf60VarQueryJoinData);
                    }
                    return jyb.m147494Y(listQuery, arrayList);
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
                        m82441ii("preloading");
                    }
                    DatabaseStore.this.asyncFetch(true, new pcj() { // from class: com.tantanapp.common.data.orm.b
                        @Override // p153l.pcj, java.util.concurrent.Callable
                        public final Object call() {
                            return DatabaseStore.Table.UiQuery.UiQueryResult.m82438c(this.f56869a, filterQueryFilter, iQueryLimit);
                        }
                    }, new y20() { // from class: com.tantanapp.common.data.orm.c
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            DatabaseStore.Table.UiQuery.UiQueryResult.m82437a(this.f56872a, this, size, iQueryLimit, (pf60) obj);
                        }
                    }, new x20() { // from class: com.tantanapp.common.data.orm.d
                        @Override // p153l.x20
                        public final void call() {
                            DatabaseStore.Table.UiQuery.this.status.set(2);
                        }
                    }, false);
                }

                public void checkBigGap(int i) {
                    if (kmk0.f127509b) {
                        List<T> list = this.base;
                        if (list != null) {
                            list.size();
                        }
                        int i2 = UiQuery.this.query.pageSize;
                    }
                }

                /* JADX INFO: renamed from: dd */
                public void m82440dd(String str) {
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
                    DatabaseStore.m82412d(sb.toString());
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
                public void m82441ii(String str) {
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
                    DatabaseStore.m82416i(sb.toString());
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public boolean isEmpty() {
                    if (this.base == null) {
                        tryFillAt(0);
                    }
                    return size() <= 0;
                }

                public void querySize() {
                    if (DatabaseStore.DETAILED_LOGGING && ThreadUtil.m82494f()) {
                        m82440dd("query size called");
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
                        DatabaseStore.m82412d("size called with " + this.size);
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
                        sb.append(jyb.m147490U(this.base, "; "));
                        sb.append(Constants.AES_SUFFIX);
                    }
                    return sb.toString();
                }

                public void tryFillAt(int i) {
                    if (kmk0.f127510c) {
                        u11.m193894h(this.base == null || i == 0 || this.size > 0);
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
                            m82440dd("query cache called " + iQueryLimit);
                        }
                        UiQuery uiQuery = UiQuery.this;
                        this.base.addAll(Table.this.queryCache(filterQueryFilter, uiQuery.query.orderBy, iQueryLimit));
                        if (this.base.size() < iQueryLimit + size) {
                            this.full = true;
                            this.size = this.base.size();
                        }
                        if (z && ThreadUtil.m82494f()) {
                            m82440dd("status updated");
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

        public C22421c<T> uiGet(String str) {
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
                u11.m193890d(order);
                this.key = str;
                this.where = filter;
                this.orderBy = order;
                this.initPageSize = i;
                this.pageSize = i2;
            }

            /* JADX INFO: renamed from: a */
            public static /* synthetic */ void m82424a(Query query) {
                Table<T>.UiQuery uiQuery = Table.this.uiQueries.get(query.key);
                if (uiQuery == null || ((UiQuery) uiQuery).f56867bs.m222764h()) {
                    return;
                }
                if (DatabaseStore.DETAILED_LOGGING) {
                    String str = kmk0.f127508a;
                }
                Table.this.uiQueries.remove(query.key);
            }

            /* JADX INFO: renamed from: b */
            public static /* synthetic */ void m82425b(final Query query) {
                query.getClass();
                ThreadUtil.m82496h(new Runnable() { // from class: l.n7c
                    @Override // java.lang.Runnable
                    public final void run() {
                        DatabaseStore.Table.Query.m82427d(this.f140591a);
                    }
                }, 1000L);
            }

            /* JADX INFO: renamed from: c */
            public static /* synthetic */ void m82426c(Query query, UiQuery uiQuery) {
                Table.this.uiQueries.put(query.key, uiQuery);
                uiQuery.tryInitiate(true);
            }

            /* JADX INFO: renamed from: d */
            public static /* synthetic */ void m82427d(Query query) {
                Table<T>.UiQuery uiQuery = Table.this.uiQueries.get(query.key);
                if (uiQuery == null || ((UiQuery) uiQuery).f56867bs.m222764h()) {
                    return;
                }
                if (DatabaseStore.DETAILED_LOGGING) {
                    String str = kmk0.f127508a;
                }
                Table.this.uiQueries.remove(query.key);
            }

            /* JADX INFO: renamed from: e */
            public static /* synthetic */ void m82428e(final Query query) {
                query.getClass();
                ThreadUtil.m82496h(new Runnable() { // from class: l.o7c
                    @Override // java.lang.Runnable
                    public final void run() {
                        DatabaseStore.Table.Query.m82424a(this.f145258a);
                    }
                }, 1000L);
            }

            /* JADX INFO: renamed from: g */
            public static /* synthetic */ void m82430g(Query query, UiQuery uiQuery, boolean z) {
                Table.this.uiQueries.put(query.key, uiQuery);
                uiQuery.tryInitiate(z);
            }

            public int count() {
                return Table.this.count(this.where, -1);
            }

            public Map<String, Integer> gruops() {
                if (kmk0.f127510c) {
                    u11.m193894h(this.orderBy instanceof DoubleOrder);
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

            public C22421c<List<T>> uiQuery(final boolean z) {
                final Table<T>.UiQuery uiQuery = Table.this.uiQueries.get(this.key);
                if (uiQuery == null) {
                    uiQuery = new UiQuery(this);
                    Table.this.uiQueries.put(this.key, uiQuery);
                    Filter<T> filter = this.where;
                    if (filter instanceof JoinFilter) {
                        Table.this.joinFilterQueries.put(this.key, (JoinFilter) filter);
                    }
                }
                return ((UiQuery) uiQuery).f56867bs.doOnSubscribe(new x20() { // from class: l.r7c
                    @Override // p153l.x20
                    public final void call() {
                        DatabaseStore.Table.Query.m82430g(this.f161597a, uiQuery, z);
                    }
                }).doOnUnsubscribe(new x20() { // from class: l.s7c
                    @Override // p153l.x20
                    public final void call() {
                        DatabaseStore.Table.Query.m82428e(this.f166679a);
                    }
                });
            }

            public C22421c<pf60<List<T>, Map<String, Integer>>> uiQueryWithGruops() {
                final Table<T>.UiQuery uiQuery = Table.this.uiQueries.get(this.key);
                if (uiQuery == null) {
                    uiQuery = new UiQuery(this);
                    Table.this.uiQueries.put(this.key, uiQuery);
                }
                return ((UiQuery) uiQuery).f56867bs.switchMap(new qcj() { // from class: com.tantanapp.common.data.orm.a
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C22421c.just(jyb.m147494Y((DatabaseStore.Table.UiQuery.UiQueryResult) obj, uiQuery.groups));
                    }
                }).doOnSubscribe(new x20() { // from class: l.p7c
                    @Override // p153l.x20
                    public final void call() {
                        DatabaseStore.Table.Query.m82426c(this.f150912a, uiQuery);
                    }
                }).doOnUnsubscribe(new x20() { // from class: l.q7c
                    @Override // p153l.x20
                    public final void call() {
                        DatabaseStore.Table.Query.m82425b(this.f155951a);
                    }
                });
            }

            public C22421c<List<T>> uiQuery() {
                return uiQuery(true);
            }
        }

        public void log(long j, String str) {
            log(j, str, null);
        }

        public void delete(String str) {
            delete(DbObject.f56857ID.mo61359EQ(str));
        }

        public T queryCache(String str) {
            if (kmk0.f127510c) {
                u11.m193889c();
            }
            u11.m193894h(str != null);
            T tCached = cached(str);
            if (tCached == null) {
                if (kmk0.f127509b) {
                    DatabaseStore.m82412d("miss cache  -> tablename: " + this.tableName + " ;  id : " + str);
                }
                DatabaseStore.this.ensureMainThreadDeferredTransactionStarted();
                tCached = null;
                List<T> listQueryCache = queryCache(DbObject.f56857ID.mo61359EQ(str), null, 1);
                if (listQueryCache != null && listQueryCache.size() != 0) {
                    return listQueryCache.get(0);
                }
            }
            return tCached;
        }

        public void delete(long j) {
            delete(DbObject._ID.mo61359EQ(Long.valueOf(j)));
        }

        public T query(long j) {
            List<T> listQuery = query(DbObject._ID.mo61359EQ(Long.valueOf(j)), null, 1);
            if (listQuery.isEmpty()) {
                return null;
            }
            return listQuery.get(0);
        }

        public T query(String str) {
            u11.m193894h(str != null);
            List<T> listQuery = query(DbObject.f56857ID.mo61359EQ(str), null, 1);
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
    public static void m82412d(String str) {
        String str2 = kmk0.f127508a;
    }
}
