package com.tantanapp.common.data.orm;

import android.content.ContentValues;
import com.tantanapp.common.data.DbObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class DoubleColumn<T> extends OrderedColumn<T, Double> {
    public DoubleColumn(String str) {
        super(str);
    }

    @Override // com.tantanapp.common.data.orm.Column
    public void put(ContentValues contentValues, Double d) {
        DbObject.cvPut(contentValues, this.NAME, d);
    }
}
