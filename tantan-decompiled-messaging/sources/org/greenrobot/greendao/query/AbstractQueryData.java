package org.greenrobot.greendao.query;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.query.AbstractQuery;

/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractQueryData<T, Q extends AbstractQuery<T>> {
    final AbstractDao<T, ?> dao;
    final String[] initialValues;
    final Map<Long, WeakReference<Q>> queriesForThreads = new HashMap();
    final String sql;

    public AbstractQueryData(AbstractDao<T, ?> abstractDao, String str, String[] strArr) {
        this.dao = abstractDao;
        this.sql = str;
        this.initialValues = strArr;
    }

    public abstract Q createQuery();

    public Q forCurrentThread() {
        Q q;
        long id = Thread.currentThread().getId();
        synchronized (this.queriesForThreads) {
            try {
                WeakReference<Q> weakReference = this.queriesForThreads.get(Long.valueOf(id));
                q = weakReference != null ? weakReference.get() : null;
                if (q == null) {
                    m221117gc();
                    q = (Q) createQuery();
                    this.queriesForThreads.put(Long.valueOf(id), new WeakReference<>(q));
                } else {
                    String[] strArr = this.initialValues;
                    System.arraycopy(strArr, 0, q.parameters, 0, strArr.length);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return q;
    }

    /* JADX INFO: renamed from: gc */
    public void m221117gc() {
        synchronized (this.queriesForThreads) {
            try {
                Iterator<Map.Entry<Long, WeakReference<Q>>> it = this.queriesForThreads.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getValue().get() == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Q forCurrentThread(Q q) {
        if (Thread.currentThread() == q.ownerThread) {
            String[] strArr = this.initialValues;
            System.arraycopy(strArr, 0, q.parameters, 0, strArr.length);
            return q;
        }
        return (Q) forCurrentThread();
    }
}
