package com.tantanapp.common.data.orm;

import android.content.ContentValues;

/* JADX INFO: loaded from: classes13.dex */
public abstract class Column<T, C> {
    public static final String PREFIX = "$.";
    public final String NAME;

    public Column(String str) {
        this.NAME = str;
    }

    public Filter<T> NOT_NULL() {
        return new Filter<T>() { // from class: com.tantanapp.common.data.orm.Column.2
            @Override // com.tantanapp.common.data.orm.Filter
            public SqlSegment emit() {
                return new SqlSegment(Column.this.NAME + " IS NOT NULL", null);
            }

            @Override // com.tantanapp.common.data.orm.Filter
            public SqlSegment emitWithPrefix() {
                return new SqlSegment(Column.PREFIX + Column.this.NAME + " IS NOT NULL", null);
            }

            @Override // com.tantanapp.common.data.orm.Filter
            public boolean filter(T t) {
                return Column.this.get(t) != null;
            }
        };
    }

    public Filter<T> NULL() {
        return new Filter<T>() { // from class: com.tantanapp.common.data.orm.Column.1
            @Override // com.tantanapp.common.data.orm.Filter
            public SqlSegment emit() {
                return new SqlSegment(Column.this.NAME + " IS NULL", null);
            }

            @Override // com.tantanapp.common.data.orm.Filter
            public SqlSegment emitWithPrefix() {
                return new SqlSegment(Column.PREFIX + Column.this.NAME + " IS NULL", null);
            }

            @Override // com.tantanapp.common.data.orm.Filter
            public boolean filter(T t) {
                return Column.this.get(t) == null;
            }
        };
    }

    public abstract C get(T t);

    public void put(ContentValues contentValues, C c) {
        throw new IllegalStateException("");
    }

    public abstract void set(T t, C c);

    public String toString() {
        return this.NAME;
    }
}
