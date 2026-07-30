package com.tantanapp.common.data.orm;

/* JADX INFO: loaded from: classes11.dex */
public class Index {
    public final Column[] columns;
    public final Filter where;

    private Index(Filter filter, Column... columnArr) {
        this.columns = columnArr;
        this.where = filter;
    }

    public Index(Column... columnArr) {
        this(null, columnArr);
    }
}
