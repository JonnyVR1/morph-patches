package com.tantanapp.common.data.orm;

import android.content.ContentValues;
import android.database.Cursor;
import com.clevertap.android.sdk.Constants;
import p149l.vwb;

/* JADX INFO: loaded from: classes13.dex */
public abstract class SqlDatabaseAdapter<T> {
    public String CREATE_INDEX(DatabaseStore.Table table, Index index) {
        Filter filter = index.where;
        return SqlSegment.concat(vwb.m200324f0(new SqlSegment("CREATE INDEX IF NOT EXISTS " + table.tableName + "_" + vwb.m200308V(index.columns, "_") + " ON " + table.tableName + "(" + vwb.m200308V(index.columns, Constants.SEPARATOR_COMMA) + ")", null), filter == null ? SqlSegment.NULL : filter.emit()), " WHERE ").part;
    }

    public String CREATE_TABLE(DatabaseStore.Table table) {
        return null;
    }

    public abstract T read(Cursor cursor, int i);

    public abstract void write(T t, ContentValues contentValues);
}
