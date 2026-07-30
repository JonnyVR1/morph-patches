package org.greenrobot.greendao;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.greenrobot.greendao.async.AsyncSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.query.QueryBuilder;
import p003l.C0255e7;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class AbstractDaoSession {

    /* JADX INFO: renamed from: db */
    private final Database f9581db;
    private final Map<Class<?>, AbstractDao<?, ?>> entityToDao = new HashMap();

    public AbstractDaoSession(Database database) {
        this.f9581db = database;
    }

    public <V> V callInTx(Callable<V> callable) throws Exception {
        this.f9581db.beginTransaction();
        try {
            V vCall = callable.call();
            this.f9581db.setTransactionSuccessful();
            return vCall;
        } finally {
            this.f9581db.endTransaction();
        }
    }

    public <V> V callInTxNoException(Callable<V> callable) {
        this.f9581db.beginTransaction();
        try {
            try {
                V vCall = callable.call();
                this.f9581db.setTransactionSuccessful();
                this.f9581db.endTransaction();
                return vCall;
            } catch (Exception e) {
                throw new DaoException("Callable failed", e);
            }
        } catch (Throwable th) {
            this.f9581db.endTransaction();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void delete(T t) {
        getDao(t.getClass()).delete(t);
    }

    public <T> void deleteAll(Class<T> cls) {
        getDao(cls).deleteAll();
    }

    public Collection<AbstractDao<?, ?>> getAllDaos() {
        return Collections.unmodifiableCollection(this.entityToDao.values());
    }

    public AbstractDao<?, ?> getDao(Class<? extends Object> cls) {
        AbstractDao<?, ?> abstractDao = this.entityToDao.get(cls);
        if (abstractDao != null) {
            return abstractDao;
        }
        C0255e7.m3799a("No DAO registered for ", cls);
        return null;
    }

    public Database getDatabase() {
        return this.f9581db;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> long insert(T t) {
        return getDao(t.getClass()).insert(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> long insertOrReplace(T t) {
        return getDao(t.getClass()).insertOrReplace(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T, K> T load(Class<T> cls, K k) {
        return (T) getDao(cls).load(k);
    }

    public <T, K> List<T> loadAll(Class<T> cls) {
        return (List<T>) getDao(cls).loadAll();
    }

    public <T> QueryBuilder<T> queryBuilder(Class<T> cls) {
        return (QueryBuilder<T>) getDao(cls).queryBuilder();
    }

    public <T, K> List<T> queryRaw(Class<T> cls, String str, String... strArr) {
        return (List<T>) getDao(cls).queryRaw(str, strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void refresh(T t) {
        getDao(t.getClass()).refresh(t);
    }

    public <T> void registerDao(Class<T> cls, AbstractDao<T, ?> abstractDao) {
        this.entityToDao.put(cls, abstractDao);
    }

    public void runInTx(Runnable runnable) {
        this.f9581db.beginTransaction();
        try {
            runnable.run();
            this.f9581db.setTransactionSuccessful();
        } finally {
            this.f9581db.endTransaction();
        }
    }

    public AsyncSession startAsyncSession() {
        return new AsyncSession(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void update(T t) {
        getDao(t.getClass()).update(t);
    }
}
