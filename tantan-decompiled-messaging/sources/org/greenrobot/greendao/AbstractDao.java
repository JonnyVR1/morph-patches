package org.greenrobot.greendao;

import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.identityscope.IdentityScope;
import org.greenrobot.greendao.identityscope.IdentityScopeLong;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.internal.FastCursor;
import org.greenrobot.greendao.internal.TableStatements;
import org.greenrobot.greendao.query.Query;
import org.greenrobot.greendao.query.QueryBuilder;
import p149l.C16308d7;
import p149l.jfd0;
import p149l.vhf0;
import p149l.zw00;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractDao<T, K> {
    protected final DaoConfig config;

    /* JADX INFO: renamed from: db */
    protected final Database f205954db;
    protected final IdentityScope<K, T> identityScope;
    protected final IdentityScopeLong<T> identityScopeLong;
    protected final boolean isStandardSQLite;
    protected final int pkOrdinal;
    protected final AbstractDaoSession session;
    protected final zw00 statements;

    public AbstractDao(DaoConfig daoConfig, AbstractDaoSession abstractDaoSession) {
        this.config = daoConfig;
        this.session = abstractDaoSession;
        Database database = daoConfig.f205958db;
        this.f205954db = database;
        this.isStandardSQLite = database.getRawDatabase() instanceof SQLiteDatabase;
        IdentityScopeLong<T> identityScopeLong = (IdentityScope<K, T>) daoConfig.getIdentityScope();
        this.identityScope = identityScopeLong;
        if (identityScopeLong instanceof IdentityScopeLong) {
            this.identityScopeLong = identityScopeLong;
        } else {
            this.identityScopeLong = null;
        }
        this.statements = daoConfig.statements;
        Property property = daoConfig.pkProperty;
        this.pkOrdinal = property != null ? property.ordinal : -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void deleteByKeyInsideSynchronized(K k, DatabaseStatement databaseStatement) {
        if (k instanceof Long) {
            databaseStatement.bindLong(1, ((Long) k).longValue());
        } else {
            if (k == 0) {
                throw new DaoException("Cannot delete entity, key is null");
            }
            databaseStatement.bindString(1, k.toString());
        }
        databaseStatement.execute();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:12:0x0021, B:13:0x0025, B:15:0x002b, B:17:0x0038, B:21:0x0040, B:22:0x0044, B:24:0x004a, B:26:0x0053), top: B:51:0x0021, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x004a A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:12:0x0021, B:13:0x0025, B:15:0x002b, B:17:0x0038, B:21:0x0040, B:22:0x0044, B:24:0x004a, B:26:0x0053), top: B:51:0x0021, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0063 A[Catch: all -> 0x001c, TryCatch #2 {, blocks: (B:4:0x000f, B:6:0x0013, B:32:0x005f, B:34:0x0063, B:35:0x0066, B:28:0x0057, B:30:0x005b, B:31:0x005e, B:12:0x0021, B:13:0x0025, B:15:0x002b, B:17:0x0038, B:21:0x0040, B:22:0x0044, B:24:0x004a, B:26:0x0053), top: B:53:0x000f, outer: #0, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0044 A[SYNTHETIC] */
    private void deleteInTxInternal(Iterable<T> iterable, Iterable<K> iterable2) {
        ArrayList arrayList;
        IdentityScope<K, T> identityScope;
        IdentityScope<K, T> identityScope2;
        assertSinglePk();
        DatabaseStatement deleteStatement = this.statements.getDeleteStatement();
        this.f205954db.beginTransaction();
        try {
            synchronized (deleteStatement) {
                IdentityScope<K, T> identityScope3 = this.identityScope;
                if (identityScope3 != null) {
                    identityScope3.lock();
                    arrayList = new ArrayList();
                } else {
                    arrayList = null;
                }
                if (iterable != null) {
                    try {
                        Iterator<T> it = iterable.iterator();
                        while (it.hasNext()) {
                            K keyVerified = getKeyVerified(it.next());
                            deleteByKeyInsideSynchronized(keyVerified, deleteStatement);
                            if (arrayList != null) {
                                arrayList.add(keyVerified);
                            }
                        }
                        if (iterable2 != null) {
                            for (K k : iterable2) {
                                deleteByKeyInsideSynchronized(k, deleteStatement);
                                if (arrayList != null) {
                                    arrayList.add(k);
                                }
                            }
                        }
                        identityScope = this.identityScope;
                        if (identityScope != null) {
                            identityScope.unlock();
                        }
                    } catch (Throwable th) {
                        IdentityScope<K, T> identityScope4 = this.identityScope;
                        if (identityScope4 != null) {
                            identityScope4.unlock();
                        }
                        throw th;
                    }
                } else {
                    if (iterable2 != null) {
                        while (r4.hasNext()) {
                            deleteByKeyInsideSynchronized(k, deleteStatement);
                            if (arrayList != null) {
                                arrayList.add(k);
                            }
                        }
                    }
                    identityScope = this.identityScope;
                    if (identityScope != null) {
                        identityScope.unlock();
                    }
                }
                throw th;
            }
            this.f205954db.setTransactionSuccessful();
            if (arrayList != null && (identityScope2 = this.identityScope) != null) {
                identityScope2.remove((Iterable) arrayList);
            }
            this.f205954db.endTransaction();
        } catch (Throwable th2) {
            this.f205954db.endTransaction();
            throw th2;
        }
    }

    private long executeInsert(T t, DatabaseStatement databaseStatement, boolean z) {
        long jInsertInsideTx;
        if (this.f205954db.isDbLockedByCurrentThread()) {
            jInsertInsideTx = insertInsideTx(t, databaseStatement);
        } else {
            this.f205954db.beginTransaction();
            try {
                jInsertInsideTx = insertInsideTx(t, databaseStatement);
                this.f205954db.setTransactionSuccessful();
                this.f205954db.endTransaction();
            } catch (Throwable th) {
                this.f205954db.endTransaction();
                throw th;
            }
        }
        if (z) {
            updateKeyAfterInsertAndAttach(t, jInsertInsideTx, true);
        }
        return jInsertInsideTx;
    }

    private void executeInsertInTx(DatabaseStatement databaseStatement, Iterable<T> iterable, boolean z) {
        this.f205954db.beginTransaction();
        try {
            synchronized (databaseStatement) {
                IdentityScope<K, T> identityScope = this.identityScope;
                if (identityScope != null) {
                    identityScope.lock();
                }
                try {
                    if (this.isStandardSQLite) {
                        SQLiteStatement sQLiteStatement = (SQLiteStatement) databaseStatement.getRawStatement();
                        for (T t : iterable) {
                            bindValues(sQLiteStatement, t);
                            if (z) {
                                updateKeyAfterInsertAndAttach(t, sQLiteStatement.executeInsert(), false);
                            } else {
                                sQLiteStatement.execute();
                            }
                        }
                    } else {
                        for (T t2 : iterable) {
                            bindValues(databaseStatement, t2);
                            if (z) {
                                updateKeyAfterInsertAndAttach(t2, databaseStatement.executeInsert(), false);
                            } else {
                                databaseStatement.execute();
                            }
                        }
                    }
                    IdentityScope<K, T> identityScope2 = this.identityScope;
                    if (identityScope2 != null) {
                        identityScope2.unlock();
                    }
                } catch (Throwable th) {
                    IdentityScope<K, T> identityScope3 = this.identityScope;
                    if (identityScope3 != null) {
                        identityScope3.unlock();
                    }
                    throw th;
                }
            }
            this.f205954db.setTransactionSuccessful();
            this.f205954db.endTransaction();
        } catch (Throwable th2) {
            this.f205954db.endTransaction();
            throw th2;
        }
    }

    private long insertInsideTx(T t, DatabaseStatement databaseStatement) {
        synchronized (databaseStatement) {
            try {
                if (!this.isStandardSQLite) {
                    bindValues(databaseStatement, t);
                    return databaseStatement.executeInsert();
                }
                SQLiteStatement sQLiteStatement = (SQLiteStatement) databaseStatement.getRawStatement();
                bindValues(sQLiteStatement, t);
                return sQLiteStatement.executeInsert();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void loadAllUnlockOnWindowBounds(Cursor cursor, CursorWindow cursorWindow, List<T> list) {
        int startPosition = cursorWindow.getStartPosition() + cursorWindow.getNumRows();
        int i = 0;
        while (true) {
            list.add(loadCurrent(cursor, 0, false));
            if (i + 1 >= startPosition) {
                CursorWindow cursorWindowMoveToNextUnlocked = moveToNextUnlocked(cursor);
                if (cursorWindowMoveToNextUnlocked == null) {
                    return;
                } else {
                    startPosition = cursorWindowMoveToNextUnlocked.getStartPosition() + cursorWindowMoveToNextUnlocked.getNumRows();
                }
            } else if (!cursor.moveToNext()) {
                return;
            }
            i += 2;
        }
    }

    private CursorWindow moveToNextUnlocked(Cursor cursor) {
        this.identityScope.unlock();
        try {
            if (cursor.moveToNext()) {
                return ((CrossProcessCursor) cursor).getWindow();
            }
            return null;
        } finally {
            this.identityScope.lock();
        }
    }

    public List<String> arrayFiled(Property property, Property[] propertyArr, String[] strArr) {
        Cursor cursorRawQuery = this.f205954db.rawQuery(this.statements.m220501b(new Property[]{property}, propertyArr), strArr);
        ArrayList arrayList = new ArrayList();
        while (cursorRawQuery.moveToNext()) {
            arrayList.add(cursorRawQuery.getString(0));
        }
        cursorRawQuery.close();
        return arrayList;
    }

    public void assertSinglePk() {
        if (this.config.pkColumns.length == 1) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        String str = this.config.tablename;
        sb.append(" (");
        sb.append(str);
        sb.append(") does not have a single-column primary key");
        throw new DaoException(sb.toString());
    }

    public final void attachEntity(K k, T t, boolean z) {
        attachEntity(t);
        IdentityScope<K, T> identityScope = this.identityScope;
        if (identityScope == null || k == null) {
            return;
        }
        if (z) {
            identityScope.put(k, t);
        } else {
            identityScope.putNoLock(k, t);
        }
    }

    public abstract void bindValues(SQLiteStatement sQLiteStatement, T t);

    public abstract void bindValues(DatabaseStatement databaseStatement, T t);

    public long count() {
        return this.statements.getCountStatement().simpleQueryForLong();
    }

    public void delete(T t) {
        assertSinglePk();
        deleteByKey(getKeyVerified(t));
    }

    public void deleteAll() {
        this.f205954db.execSQL("DELETE FROM '" + this.config.tablename + "'");
        IdentityScope<K, T> identityScope = this.identityScope;
        if (identityScope != null) {
            identityScope.clear();
        }
    }

    public void deleteByKey(K k) {
        assertSinglePk();
        DatabaseStatement deleteStatement = this.statements.getDeleteStatement();
        if (this.f205954db.isDbLockedByCurrentThread()) {
            synchronized (deleteStatement) {
                deleteByKeyInsideSynchronized(k, deleteStatement);
            }
        } else {
            this.f205954db.beginTransaction();
            try {
                synchronized (deleteStatement) {
                    deleteByKeyInsideSynchronized(k, deleteStatement);
                }
                this.f205954db.setTransactionSuccessful();
                this.f205954db.endTransaction();
            } catch (Throwable th) {
                this.f205954db.endTransaction();
                throw th;
            }
        }
        IdentityScope<K, T> identityScope = this.identityScope;
        if (identityScope != null) {
            identityScope.remove(k);
        }
    }

    public void deleteByKeyInTx(K... kArr) {
        deleteInTxInternal(null, Arrays.asList(kArr));
    }

    public void deleteInTx(T... tArr) {
        deleteInTxInternal(Arrays.asList(tArr), null);
    }

    public boolean detach(T t) {
        if (this.identityScope == null) {
            return false;
        }
        return this.identityScope.detach(getKeyVerified(t), t);
    }

    public void detachAll() {
        IdentityScope<K, T> identityScope = this.identityScope;
        if (identityScope != null) {
            identityScope.clear();
        }
    }

    public String[] getAllColumns() {
        return this.config.allColumns;
    }

    public Database getDatabase() {
        return this.f205954db;
    }

    public String getFiled(Property property, Property[] propertyArr, String[] strArr) {
        Cursor cursorRawQuery = this.f205954db.rawQuery(this.statements.m220501b(new Property[]{property}, propertyArr), strArr);
        String string = cursorRawQuery.moveToNext() ? cursorRawQuery.getString(0) : null;
        cursorRawQuery.close();
        return string;
    }

    public abstract K getKey(T t);

    public K getKeyVerified(T t) {
        K key = getKey(t);
        if (key != null) {
            return key;
        }
        if (t != null) {
            throw new DaoException("Entity has no key");
        }
        jfd0.m141176a("Entity may not be null");
        return null;
    }

    public String[] getNonPkColumns() {
        return this.config.nonPkColumns;
    }

    public String[] getPkColumns() {
        return this.config.pkColumns;
    }

    public Property getPkProperty() {
        return this.config.pkProperty;
    }

    public Property[] getProperties() {
        return this.config.properties;
    }

    public AbstractDaoSession getSession() {
        return this.session;
    }

    public TableStatements getStatements() {
        return this.config.statements;
    }

    public String getTablename() {
        return this.config.tablename;
    }

    public abstract boolean hasKey(T t);

    public long insert(T t) {
        return executeInsert(t, this.statements.getInsertStatement(), true);
    }

    public void insertInTx(T... tArr) {
        insertInTx(Arrays.asList(tArr), isEntityUpdateable());
    }

    public long insertOrReplace(T t) {
        return executeInsert(t, this.statements.getInsertOrReplaceStatement(), true);
    }

    public void insertOrReplaceInTx(T... tArr) {
        insertOrReplaceInTx(Arrays.asList(tArr), isEntityUpdateable());
    }

    public long insertWithoutSettingPk(T t) {
        return executeInsert(t, this.statements.getInsertOrReplaceStatement(), false);
    }

    public abstract boolean isEntityUpdateable();

    public <T extends vhf0> List<T> listSimple(Property[] propertyArr, Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = this.f205954db.rawQuery(this.statements.m220502c(propertyArr), null);
        while (cursorRawQuery.moveToNext()) {
            try {
                try {
                    vhf0 vhf0Var = (vhf0) cls.newInstance();
                    vhf0Var.m198457a(cursorRawQuery, propertyArr);
                    arrayList.add(vhf0Var);
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th;
            }
        }
        cursorRawQuery.close();
        return arrayList;
    }

    public T load(K k) {
        T t;
        assertSinglePk();
        if (k == null) {
            return null;
        }
        IdentityScope<K, T> identityScope = this.identityScope;
        if (identityScope != null && (t = identityScope.get(k)) != null) {
            return t;
        }
        String selectByKey = this.statements.getSelectByKey();
        String[] strArr = {k.toString()};
        if (QueryBuilder.LOG_SQL) {
            DaoLog.m221099d("GreenDao Built SQL for query: " + selectByKey);
            DaoLog.m221099d("GreenDao Built Values for query: " + Arrays.asList(strArr));
        }
        return loadUniqueAndCloseCursor(this.f205954db.rawQuery(selectByKey, strArr));
    }

    public List<T> loadAll() {
        return loadAllAndCloseCursor(this.f205954db.rawQuery(this.statements.getSelectAll(), null));
    }

    public List<T> loadAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x007e A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:42:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.greenrobot.greendao.AbstractDao, org.greenrobot.greendao.AbstractDao<T, K>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [org.greenrobot.greendao.AbstractDao] */
    /* JADX WARN: Type inference failed for: r6v3, types: [org.greenrobot.greendao.identityscope.IdentityScope, org.greenrobot.greendao.identityscope.IdentityScope<K, T>] */
    public List<T> loadAllFromCursor(Cursor cursor) {
        CursorWindow window;
        boolean z;
        IdentityScope<K, T> identityScope;
        int count = cursor.getCount();
        if (count == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(count);
        if (cursor instanceof CrossProcessCursor) {
            window = ((CrossProcessCursor) cursor).getWindow();
            if (window != null) {
                if (window.getNumRows() == count) {
                    cursor = new FastCursor(window);
                    z = true;
                } else {
                    DaoLog.m221099d("Window vs. result size: " + window.getNumRows() + "/" + count);
                }
            }
            if (cursor.moveToFirst()) {
                identityScope = this.identityScope;
                if (identityScope != null) {
                    identityScope.lock();
                    this.identityScope.reserveRoom(count);
                }
                if (!z || window == null) {
                    do {
                        arrayList.add(loadCurrent(cursor, 0, false));
                    } while (cursor.moveToNext());
                    if (this != 0) {
                        return arrayList;
                    }
                } else {
                    try {
                        if (this.identityScope != null) {
                            loadAllUnlockOnWindowBounds(cursor, window, arrayList);
                        } else {
                            do {
                                arrayList.add(loadCurrent(cursor, 0, false));
                            } while (cursor.moveToNext());
                        }
                        if (this != 0) {
                            return arrayList;
                        }
                    } finally {
                        IdentityScope<K, T> identityScope2 = this.identityScope;
                        if (identityScope2 != null) {
                            identityScope2.unlock();
                        }
                    }
                }
            }
            return arrayList;
        }
        window = null;
        z = false;
        if (cursor.moveToFirst()) {
            identityScope = this.identityScope;
            if (identityScope != null) {
                identityScope.lock();
                this.identityScope.reserveRoom(count);
            }
            if (z) {
                do {
                    arrayList.add(loadCurrent(cursor, 0, false));
                } while (cursor.moveToNext());
                if (this != 0) {
                    return arrayList;
                }
            } else {
                do {
                    arrayList.add(loadCurrent(cursor, 0, false));
                } while (cursor.moveToNext());
                if (this != 0) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public T loadByRowId(long j) {
        return loadUniqueAndCloseCursor(this.f205954db.rawQuery(this.statements.getSelectByRowId(), new String[]{Long.toString(j)}));
    }

    public final T loadCurrent(Cursor cursor, int i, boolean z) {
        if (this.identityScopeLong != null) {
            if (i != 0 && cursor.isNull(this.pkOrdinal + i)) {
                return null;
            }
            long j = cursor.getLong(this.pkOrdinal + i);
            IdentityScopeLong<T> identityScopeLong = this.identityScopeLong;
            T t = z ? identityScopeLong.get2(j) : identityScopeLong.get2NoLock(j);
            if (t != null) {
                return t;
            }
            T entity = readEntity(cursor, i);
            attachEntity(entity);
            IdentityScopeLong<T> identityScopeLong2 = this.identityScopeLong;
            if (z) {
                identityScopeLong2.put2(j, entity);
                return entity;
            }
            identityScopeLong2.put2NoLock(j, entity);
            return entity;
        }
        if (this.identityScope == null) {
            if (i != 0 && readKey(cursor, i) == null) {
                return null;
            }
            T entity2 = readEntity(cursor, i);
            attachEntity(entity2);
            return entity2;
        }
        K key = readKey(cursor, i);
        if (i != 0 && key == null) {
            return null;
        }
        IdentityScope<K, T> identityScope = this.identityScope;
        T noLock = z ? identityScope.get(key) : identityScope.getNoLock(key);
        if (noLock != null) {
            return noLock;
        }
        T entity3 = readEntity(cursor, i);
        attachEntity(key, entity3, z);
        return entity3;
    }

    public final <O> O loadCurrentOther(AbstractDao<O, ?> abstractDao, Cursor cursor, int i) {
        return abstractDao.loadCurrent(cursor, i, true);
    }

    public T loadUnique(Cursor cursor) {
        if (!cursor.moveToFirst()) {
            return null;
        }
        if (cursor.isLast()) {
            return loadCurrent(cursor, 0, true);
        }
        throw new DaoException("Expected unique result, but count was " + cursor.getCount());
    }

    public T loadUniqueAndCloseCursor(Cursor cursor) {
        try {
            return loadUnique(cursor);
        } finally {
            cursor.close();
        }
    }

    public QueryBuilder<T> queryBuilder() {
        return QueryBuilder.internalCreate(this);
    }

    public List<T> queryRaw(String str, String... strArr) {
        return loadAllAndCloseCursor(this.f205954db.rawQuery(this.statements.getSelectAll() + str, strArr));
    }

    public Query<T> queryRawCreate(String str, Object... objArr) {
        return queryRawCreateListArgs(str, Arrays.asList(objArr));
    }

    public Query<T> queryRawCreateListArgs(String str, Collection<Object> collection) {
        return Query.internalCreate(this, this.statements.getSelectAll() + str, collection.toArray());
    }

    public abstract T readEntity(Cursor cursor, int i);

    public abstract void readEntity(Cursor cursor, T t, int i);

    public abstract K readKey(Cursor cursor, int i);

    public void refresh(T t) {
        assertSinglePk();
        K keyVerified = getKeyVerified(t);
        Cursor cursorRawQuery = this.f205954db.rawQuery(this.statements.getSelectByKey(), new String[]{keyVerified.toString()});
        try {
            if (!cursorRawQuery.moveToFirst()) {
                throw new DaoException("Entity does not exist in the database anymore: " + t.getClass() + " with key " + keyVerified);
            }
            if (!cursorRawQuery.isLast()) {
                throw new DaoException("Expected unique result, but count was " + cursorRawQuery.getCount());
            }
            readEntity(cursorRawQuery, t, 0);
            attachEntity(keyVerified, t, true);
            cursorRawQuery.close();
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    public void save(T t) {
        if (hasKey(t)) {
            update(t);
        } else {
            insert(t);
        }
    }

    public void saveInTx(Iterable<T> iterable) {
        Iterator<T> it = iterable.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            if (hasKey(it.next())) {
                i++;
            } else {
                i2++;
            }
        }
        if (i <= 0 || i2 <= 0) {
            if (i2 > 0) {
                insertInTx(iterable);
                return;
            } else {
                if (i > 0) {
                    updateInTx(iterable);
                    return;
                }
                return;
            }
        }
        ArrayList arrayList = new ArrayList(i);
        ArrayList arrayList2 = new ArrayList(i2);
        for (T t : iterable) {
            if (hasKey(t)) {
                arrayList.add(t);
            } else {
                arrayList2.add(t);
            }
        }
        this.f205954db.beginTransaction();
        try {
            updateInTx(arrayList);
            insertInTx(arrayList2);
            this.f205954db.setTransactionSuccessful();
        } finally {
            this.f205954db.endTransaction();
        }
    }

    public void update(T t) {
        assertSinglePk();
        DatabaseStatement updateStatement = this.statements.getUpdateStatement();
        if (this.f205954db.isDbLockedByCurrentThread()) {
            synchronized (updateStatement) {
                try {
                    if (this.isStandardSQLite) {
                        updateInsideSynchronized((Object) t, (SQLiteStatement) updateStatement.getRawStatement(), true);
                    } else {
                        updateInsideSynchronized((Object) t, updateStatement, true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        this.f205954db.beginTransaction();
        try {
            synchronized (updateStatement) {
                updateInsideSynchronized((Object) t, updateStatement, true);
            }
            this.f205954db.setTransactionSuccessful();
            this.f205954db.endTransaction();
        } catch (Throwable th2) {
            this.f205954db.endTransaction();
            throw th2;
        }
    }

    public void updateIn(Property[] propertyArr, Object[] objArr, Property property, Object obj, Property property2, Object[] objArr2) {
        if (property == null || obj == null) {
            updateIn(propertyArr, objArr, (Property[]) null, (Object[]) null, property2, objArr2);
        } else {
            updateIn(propertyArr, objArr, new Property[]{property}, new Object[]{obj}, property2, objArr2);
        }
    }

    public void updateInTx(Iterable<T> iterable) {
        DatabaseStatement updateStatement = this.statements.getUpdateStatement();
        this.f205954db.beginTransaction();
        try {
            synchronized (updateStatement) {
                IdentityScope<K, T> identityScope = this.identityScope;
                if (identityScope != null) {
                    identityScope.lock();
                }
                try {
                    if (this.isStandardSQLite) {
                        SQLiteStatement sQLiteStatement = (SQLiteStatement) updateStatement.getRawStatement();
                        Iterator<T> it = iterable.iterator();
                        while (it.hasNext()) {
                            updateInsideSynchronized((Object) it.next(), sQLiteStatement, false);
                        }
                    } else {
                        Iterator<T> it2 = iterable.iterator();
                        while (it2.hasNext()) {
                            updateInsideSynchronized((Object) it2.next(), updateStatement, false);
                        }
                    }
                    IdentityScope<K, T> identityScope2 = this.identityScope;
                    if (identityScope2 != null) {
                        identityScope2.unlock();
                    }
                } catch (Throwable th) {
                    IdentityScope<K, T> identityScope3 = this.identityScope;
                    if (identityScope3 != null) {
                        identityScope3.unlock();
                    }
                    throw th;
                }
            }
            this.f205954db.setTransactionSuccessful();
            this.f205954db.endTransaction();
        } catch (RuntimeException e) {
            try {
                this.f205954db.endTransaction();
            } catch (RuntimeException e2) {
                DaoLog.m221108w("Could not end transaction (rethrowing initial exception)", e2);
                throw e;
            }
        } catch (Throwable th2) {
            this.f205954db.endTransaction();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void updateInsideSynchronized(T t, DatabaseStatement databaseStatement, boolean z) {
        bindValues(databaseStatement, t);
        int length = this.config.allColumns.length + 1;
        Object key = getKey(t);
        if (key instanceof Long) {
            databaseStatement.bindLong(length, ((Long) key).longValue());
        } else {
            if (key == null) {
                throw new DaoException("Cannot update entity without key - was it inserted before?");
            }
            databaseStatement.bindString(length, key.toString());
        }
        databaseStatement.execute();
        attachEntity(key, t, z);
    }

    public abstract K updateKeyAfterInsert(T t, long j);

    public void updateKeyAfterInsertAndAttach(T t, long j, boolean z) {
        if (j != -1) {
            attachEntity(updateKeyAfterInsert(t, j), t, z);
        } else {
            DaoLog.m221107w("Could not insert row (executeInsert returned -1)");
        }
    }

    public void deleteByKeyInTx(Iterable<K> iterable) {
        deleteInTxInternal(null, iterable);
    }

    public void deleteInTx(Iterable<T> iterable) {
        deleteInTxInternal(iterable, null);
    }

    public void insertInTx(Iterable<T> iterable) {
        insertInTx(iterable, isEntityUpdateable());
    }

    public void insertOrReplaceInTx(Iterable<T> iterable) {
        insertOrReplaceInTx(iterable, isEntityUpdateable());
    }

    public void insertInTx(Iterable<T> iterable, boolean z) {
        executeInsertInTx(this.statements.getInsertStatement(), iterable, z);
    }

    public void insertOrReplaceInTx(Iterable<T> iterable, boolean z) {
        executeInsertInTx(this.statements.getInsertOrReplaceStatement(), iterable, z);
    }

    public void attachEntity(T t) {
    }

    public void updateIn(Property[] propertyArr, Object[] objArr, Property property, Object[] objArr2) {
        updateIn(propertyArr, objArr, (Property[]) null, (Object[]) null, property, objArr2);
    }

    public void updateIn(Property property, Object obj, Property property2, Object[] objArr) {
        updateIn(new Property[]{property}, new Object[]{obj}, property2, objArr);
    }

    public void updateIn(Property property, Object obj, Property property2, Object obj2, Property property3, Object[] objArr) {
        updateIn(new Property[]{property}, new Object[]{obj}, new Property[]{property2}, new Object[]{obj2}, property3, objArr);
    }

    public void updateIn(Property[] propertyArr, Object[] objArr, Property[] propertyArr2, Object[] objArr2, Property property, Object[] objArr3) {
        assertSinglePk();
        C16308d7.m110207b(this.f205954db, this.statements, this.isStandardSQLite, propertyArr, objArr, propertyArr2, objArr2, property, objArr3);
        detachAll();
    }

    public String getFiled(Property property, Property property2, String str) {
        return getFiled(property, new Property[]{property2}, new String[]{str});
    }

    public String getFiled(Property property, String str) {
        return getFiled(property, getPkProperty(), str);
    }

    public List<String> arrayFiled(Property property, Property property2, String str) {
        return arrayFiled(property, property2 != null ? new Property[]{property2} : null, str != null ? new String[]{str} : null);
    }

    public AbstractDao(DaoConfig daoConfig) {
        this(daoConfig, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void updateInsideSynchronized(T t, SQLiteStatement sQLiteStatement, boolean z) {
        bindValues(sQLiteStatement, t);
        int length = this.config.allColumns.length + 1;
        Object key = getKey(t);
        if (key instanceof Long) {
            sQLiteStatement.bindLong(length, ((Long) key).longValue());
        } else if (key != null) {
            sQLiteStatement.bindString(length, key.toString());
        } else {
            throw new DaoException("Cannot update entity without key - was it inserted before?");
        }
        sQLiteStatement.execute();
        attachEntity(key, t, z);
    }

    public void update(Property property, Object obj, Object obj2) {
        update(new Property[]{property}, new Object[]{obj}, obj2);
    }

    public void update(Property property, Object obj, Property property2, Object obj2) {
        update(new Property[]{property}, new Object[]{obj}, new Property[]{property2}, new Object[]{obj2});
    }

    public void update(Property property, Object obj, Property[] propertyArr, Object[] objArr) {
        update(new Property[]{property}, new Object[]{obj}, propertyArr, objArr);
    }

    public void update(Property[] propertyArr, Object[] objArr, Object obj) {
        update(propertyArr, objArr, new Property[]{getPkProperty()}, new Object[]{obj});
    }

    public void update(Property[] propertyArr, Object[] objArr, Property[] propertyArr2, Object[] objArr2) {
        assertSinglePk();
        C16308d7.m110206a(this.f205954db, this.statements, this.isStandardSQLite, propertyArr, objArr, propertyArr2, objArr2);
        detachAll();
    }

    public void saveInTx(T... tArr) {
        saveInTx(Arrays.asList(tArr));
    }

    public void updateInTx(T... tArr) {
        updateInTx(Arrays.asList(tArr));
    }
}
