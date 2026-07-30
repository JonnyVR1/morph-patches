package com.tantanapp.common.data.orm;

import android.content.ContentValues;
import com.tantanapp.common.data.DbObject;
import java.lang.Enum;
import p153l.qcj;

/* JADX INFO: loaded from: classes11.dex */
public abstract class EnumColumn<T, C extends Enum<C>> extends OrderedColumn<T, C> {
    private qcj<C, Integer> getOrdinal;

    public EnumColumn(String str, qcj<C, Integer> qcjVar) {
        super(str);
        this.getOrdinal = qcjVar;
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
