package com.tantanapp.common.data.orm;

import android.content.ContentValues;
import com.tantanapp.common.data.DbObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class FloatColumn<T> extends OrderedColumn<T, Float> {
    public FloatColumn(String str) {
        super(str);
    }

    @Override // com.tantanapp.common.data.orm.Column
    public void put(ContentValues contentValues, Float f) {
        DbObject.cvPut(contentValues, this.NAME, f);
    }
}
