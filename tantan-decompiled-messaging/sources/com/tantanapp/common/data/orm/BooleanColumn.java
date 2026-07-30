package com.tantanapp.common.data.orm;

import android.content.ContentValues;
import com.tantanapp.common.data.DbObject;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BooleanColumn<T> extends OrderedColumn<T, Boolean> {
    public BooleanColumn(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: F */
    public Filter<T> m81223F() {
        return EQ_CONSTANT(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: T */
    public Filter<T> m81224T() {
        return EQ_CONSTANT(Boolean.TRUE);
    }

    @Override // com.tantanapp.common.data.orm.ValueColumn
    public String asString(Boolean bool) {
        return bool.booleanValue() ? "1" : "0";
    }

    @Override // com.tantanapp.common.data.orm.Column
    public void put(ContentValues contentValues, Boolean bool) {
        DbObject.cvPut(contentValues, this.NAME, bool);
    }
}
