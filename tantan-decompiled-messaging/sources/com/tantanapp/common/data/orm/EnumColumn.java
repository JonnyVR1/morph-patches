package com.tantanapp.common.data.orm;

import android.content.ContentValues;
import com.tantanapp.common.data.DbObject;
import java.lang.Enum;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public abstract class EnumColumn<T, C extends Enum<C>> extends OrderedColumn<T, C> {
    private w9j<C, Integer> getOrdinal;

    public EnumColumn(String str, w9j<C, Integer> w9jVar) {
        super(str);
        this.getOrdinal = w9jVar;
    }

    @Override // com.tantanapp.common.data.orm.ValueColumn
    public String asString(C c) {
        return Integer.toString(this.getOrdinal.call(c).intValue());
    }

    @Override // com.tantanapp.common.data.orm.Column
    public void put(ContentValues contentValues, C c) {
        DbObject.cvPut(contentValues, this.NAME, this.getOrdinal.call(c));
    }
}
