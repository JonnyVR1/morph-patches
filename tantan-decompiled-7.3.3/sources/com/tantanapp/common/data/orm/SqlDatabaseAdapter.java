package com.tantanapp.common.data.orm;

import android.content.ContentValues;
import android.database.Cursor;
import com.clevertap.android.sdk.Constants;
import p153l.jyb;

/* JADX INFO: loaded from: classes11.dex */
public abstract class SqlDatabaseAdapter<T> {
    public String CREATE_INDEX(DatabaseStore.Table table, Index index) {
        Filter filter = index.where;
        return SqlSegment.concat(jyb.m147507f0(new SqlSegment("CREATE INDEX IF NOT EXISTS " + table.tableName + "_" + jyb.m147491V(index.columns, "_") + " ON " + table.tableName + "(" + jyb.m147491V(index.columns, Constants.SEPARATOR_COMMA) + ")", null), filter == null ? SqlSegment.NULL : filter.emit()), " WHERE ").part;
    }

    public String CREATE_TABLE(DatabaseStore.Table table) {
        return null;
    }

    public abstract T read(Cursor cursor, int i);

    public abstract void write(T t, ContentValues contentValues);
}
