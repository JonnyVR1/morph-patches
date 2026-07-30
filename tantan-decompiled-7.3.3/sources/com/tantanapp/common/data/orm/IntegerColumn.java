package com.tantanapp.common.data.orm;

import android.content.ContentValues;
import com.tantanapp.common.data.DbObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class IntegerColumn<T> extends OrderedColumn<T, Integer> {
    public IntegerColumn(String str) {
        super(str);
    }

    @Override // com.tantanapp.common.data.orm.Column
    public void put(ContentValues contentValues, Integer num) {
        DbObject.cvPut(contentValues, this.NAME, num);
    }
}
