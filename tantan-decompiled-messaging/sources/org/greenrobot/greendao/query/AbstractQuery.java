package org.greenrobot.greendao.query;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.InternalQueryDaoAccess;

/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractQuery<T> {
    protected final AbstractDao<T, ?> dao;
    protected final InternalQueryDaoAccess<T> daoAccess;
    protected final Thread ownerThread = Thread.currentThread();
    protected final String[] parameters;
    protected final String sql;

    public AbstractQuery(AbstractDao<T, ?> abstractDao, String str, String[] strArr) {
        this.dao = abstractDao;
        this.daoAccess = new InternalQueryDaoAccess<>(abstractDao);
        this.sql = str;
        this.parameters = strArr;
    }

    public static String[] toStringArray(Object[] objArr) {
        int length = objArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            if (obj != null) {
                strArr[i] = obj.toString();
            } else {
                strArr[i] = null;
            }
        }
        return strArr;
    }

    public void checkThread() {
        if (Thread.currentThread() != this.ownerThread) {
            throw new DaoException("Method may be called only in owner thread, use forCurrentThread to get an instance for this thread");
        }
    }

    public AbstractQuery<T> setParameter(int i, Object obj) {
        checkThread();
        String[] strArr = this.parameters;
        if (obj != null) {
            strArr[i] = obj.toString();
            return this;
        }
        strArr[i] = null;
        return this;
    }
}
