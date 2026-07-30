package org.greenrobot.greendao.query;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.database.Database;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DeleteQuery<T> extends AbstractQuery<T> {
    private final QueryData<T> queryData;

    private DeleteQuery(QueryData<T> queryData, AbstractDao<T, ?> abstractDao, String str, String[] strArr) {
        super(abstractDao, str, strArr);
        this.queryData = queryData;
    }

    public static <T2> DeleteQuery<T2> create(AbstractDao<T2, ?> abstractDao, String str, Object[] objArr) {
        return new QueryData(abstractDao, str, AbstractQuery.toStringArray(objArr)).forCurrentThread();
    }

    public void executeDeleteWithoutDetachingEntities() {
        checkThread();
        Database database = this.dao.getDatabase();
        if (database.isDbLockedByCurrentThread()) {
            this.dao.getDatabase().execSQL(this.sql, this.parameters);
            return;
        }
        database.beginTransaction();
        try {
            this.dao.getDatabase().execSQL(this.sql, this.parameters);
            database.setTransactionSuccessful();
        } finally {
            database.endTransaction();
        }
    }

    public DeleteQuery<T> forCurrentThread() {
        return (DeleteQuery) this.queryData.forCurrentThread(this);
    }

    @Override // org.greenrobot.greendao.query.AbstractQuery
    public /* bridge */ /* synthetic */ AbstractQuery setParameter(int i, Object obj) {
        return super.setParameter(i, obj);
    }

    public static final class QueryData<T2> extends AbstractQueryData<T2, DeleteQuery<T2>> {
        @Override // org.greenrobot.greendao.query.AbstractQueryData
        public DeleteQuery<T2> createQuery() {
            return new DeleteQuery<>(this, this.dao, this.sql, (String[]) this.initialValues.clone());
        }

        private QueryData(AbstractDao<T2, ?> abstractDao, String str, String[] strArr) {
            super(abstractDao, str, strArr);
        }
    }
}
