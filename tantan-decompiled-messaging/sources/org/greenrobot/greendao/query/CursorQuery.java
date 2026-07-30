package org.greenrobot.greendao.query;

import android.database.Cursor;
import java.util.Date;
import org.greenrobot.greendao.AbstractDao;

/* JADX INFO: loaded from: classes3.dex */
public class CursorQuery<T> extends AbstractQueryWithLimit<T> {
    private final QueryData<T> queryData;

    public static final class QueryData<T2> extends AbstractQueryData<T2, CursorQuery<T2>> {
        private final int limitPosition;
        private final int offsetPosition;

        public QueryData(AbstractDao abstractDao, String str, String[] strArr, int i, int i2) {
            super(abstractDao, str, strArr);
            this.limitPosition = i;
            this.offsetPosition = i2;
        }

        @Override // org.greenrobot.greendao.query.AbstractQueryData
        public CursorQuery<T2> createQuery() {
            return new CursorQuery<>(this, this.dao, this.sql, (String[]) this.initialValues.clone(), this.limitPosition, this.offsetPosition);
        }
    }

    private CursorQuery(QueryData<T> queryData, AbstractDao<T, ?> abstractDao, String str, String[] strArr, int i, int i2) {
        super(abstractDao, str, strArr, i, i2);
        this.queryData = queryData;
    }

    public static <T2> CursorQuery<T2> create(AbstractDao<T2, ?> abstractDao, String str, Object[] objArr, int i, int i2) {
        return new QueryData(abstractDao, str, AbstractQuery.toStringArray(objArr), i, i2).forCurrentThread();
    }

    public static <T2> CursorQuery<T2> internalCreate(AbstractDao<T2, ?> abstractDao, String str, Object[] objArr) {
        return create(abstractDao, str, objArr, -1, -1);
    }

    public CursorQuery forCurrentThread() {
        return this.queryData.forCurrentThread(this);
    }

    public Cursor query() {
        checkThread();
        return this.dao.getDatabase().rawQuery(this.sql, this.parameters);
    }

    @Override // org.greenrobot.greendao.query.AbstractQueryWithLimit
    public /* bridge */ /* synthetic */ void setLimit(int i) {
        super.setLimit(i);
    }

    @Override // org.greenrobot.greendao.query.AbstractQueryWithLimit
    public /* bridge */ /* synthetic */ void setOffset(int i) {
        super.setOffset(i);
    }

    @Override // org.greenrobot.greendao.query.AbstractQueryWithLimit
    public /* bridge */ /* synthetic */ AbstractQueryWithLimit setParameter(int i, Boolean bool) {
        return super.setParameter(i, bool);
    }

    @Override // org.greenrobot.greendao.query.AbstractQueryWithLimit, org.greenrobot.greendao.query.AbstractQuery
    public /* bridge */ /* synthetic */ AbstractQueryWithLimit setParameter(int i, Object obj) {
        return super.setParameter(i, obj);
    }

    @Override // org.greenrobot.greendao.query.AbstractQueryWithLimit
    public /* bridge */ /* synthetic */ AbstractQueryWithLimit setParameter(int i, Date date) {
        return super.setParameter(i, date);
    }
}
