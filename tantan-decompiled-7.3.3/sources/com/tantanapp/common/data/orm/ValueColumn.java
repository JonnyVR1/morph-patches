package com.tantanapp.common.data.orm;

import com.tantanapp.common.data.ValueObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ValueColumn<T, C> extends Column<T, C> {
    public ValueColumn(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: EQ */
    public Filter<T> mo61359EQ(final C c) {
        return new Filter<T>() { // from class: com.tantanapp.common.data.orm.ValueColumn.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.tantanapp.common.data.orm.Filter
            public SqlSegment emit() {
                return new SqlSegment(ValueColumn.this.NAME + " = ?", new String[]{ValueColumn.this.asString(c)});
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.tantanapp.common.data.orm.Filter
            public SqlSegment emitWithPrefix() {
                return new SqlSegment(Column.PREFIX + ValueColumn.this.NAME + " = ?", new String[]{ValueColumn.this.asString(c)});
            }

            @Override // com.tantanapp.common.data.orm.Filter
            public boolean filter(T t) {
                return ValueObject.util_equals(ValueColumn.this.get(t), c);
            }
        };
    }

    public Filter<T> EQ_CONSTANT(final C c) {
        return new Filter<T>() { // from class: com.tantanapp.common.data.orm.ValueColumn.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.tantanapp.common.data.orm.Filter
            public SqlSegment emit() {
                return new SqlSegment(ValueColumn.this.NAME + " = " + ValueColumn.this.asString(c), null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.tantanapp.common.data.orm.Filter
            public SqlSegment emitWithPrefix() {
                return new SqlSegment(Column.PREFIX + ValueColumn.this.NAME + " = " + ValueColumn.this.asString(c), null);
            }

            @Override // com.tantanapp.common.data.orm.Filter
            public boolean filter(T t) {
                return ValueObject.util_equals(ValueColumn.this.get(t), c);
            }
        };
    }

    public Filter<T> NEQ(final C c) {
        return new Filter<T>() { // from class: com.tantanapp.common.data.orm.ValueColumn.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.tantanapp.common.data.orm.Filter
            public SqlSegment emit() {
                return new SqlSegment(ValueColumn.this.NAME + " != ?", new String[]{ValueColumn.this.asString(c)});
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.tantanapp.common.data.orm.Filter
            public SqlSegment emitWithPrefix() {
                return new SqlSegment(Column.PREFIX + ValueColumn.this.NAME + " != ?", new String[]{ValueColumn.this.asString(c)});
            }

            @Override // com.tantanapp.common.data.orm.Filter
            public boolean filter(T t) {
                return !ValueObject.util_equals(ValueColumn.this.get(t), c);
            }
        };
    }

    public String asString(C c) {
        return c.toString();
    }
}
