package org.greenrobot.greendao.query;

import android.database.Cursor;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.DaoException;

/* JADX INFO: loaded from: classes3.dex */
public class CountQuery<T> extends AbstractQuery<T> {
    private final QueryData<T> queryData;

    private CountQuery(QueryData<T> queryData, AbstractDao<T, ?> abstractDao, String str, String[] strArr) {
        super(abstractDao, str, strArr);
        this.queryData = queryData;
    }

    public static <T2> CountQuery<T2> create(AbstractDao<T2, ?> abstractDao, String str, Object[] objArr) {
        return new QueryData(abstractDao, str, AbstractQuery.toStringArray(objArr)).forCurrentThread();
    }

    public long count() {
        checkThread();
        Cursor cursorRawQuery = this.dao.getDatabase().rawQuery(this.sql, this.parameters);
        try {
            if (!cursorRawQuery.moveToNext()) {
                throw new DaoException("No result for count");
            }
            if (!cursorRawQuery.isLast()) {
                throw new DaoException("Unexpected row count: " + cursorRawQuery.getCount());
            }
            if (cursorRawQuery.getColumnCount() == 1) {
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j;
            }
            throw new DaoException("Unexpected column count: " + cursorRawQuery.getColumnCount());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    public CountQuery<T> forCurrentThread() {
        return (CountQuery) this.queryData.forCurrentThread(this);
    }

    @Override // org.greenrobot.greendao.query.AbstractQuery
    public /* bridge */ /* synthetic */ AbstractQuery setParameter(int i, Object obj) {
        return super.setParameter(i, obj);
    }

    public static final class QueryData<T2> extends AbstractQueryData<T2, CountQuery<T2>> {
        @Override // org.greenrobot.greendao.query.AbstractQueryData
        public CountQuery<T2> createQuery() {
            return new CountQuery<>(this, this.dao, this.sql, (String[]) this.initialValues.clone());
        }

        private QueryData(AbstractDao<T2, ?> abstractDao, String str, String[] strArr) {
            super(abstractDao, str, strArr);
        }
    }
}
