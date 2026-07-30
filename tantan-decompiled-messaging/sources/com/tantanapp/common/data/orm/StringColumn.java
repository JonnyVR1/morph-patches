package com.tantanapp.common.data.orm;

import android.content.ContentValues;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import p149l.vwb;

/* JADX INFO: loaded from: classes13.dex */
public abstract class StringColumn<T> extends OrderedColumn<T, String> {
    public StringColumn(String str) {
        super(str);
    }

    public Filter<T> CONTAINS(final String str) {
        return new Filter<T>() { // from class: com.tantanapp.common.data.orm.StringColumn.3
            @Override // com.tantanapp.common.data.orm.Filter
            public SqlSegment emit() {
                return new SqlSegment(StringColumn.this.NAME + " LIKE ?", new String[]{"%" + str + "%"});
            }

            @Override // com.tantanapp.common.data.orm.Filter
            public SqlSegment emitWithPrefix() {
                return new SqlSegment(Column.PREFIX + StringColumn.this.NAME + " LIKE ?", new String[]{"%" + str + "%"});
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.tantanapp.common.data.orm.Filter
            public boolean filter(T t) {
                String str2 = (String) StringColumn.this.get(t);
                return str2 != null && str2.contains(str);
            }
        };
    }

    /* JADX INFO: renamed from: IN */
    public Filter<T> m81268IN(final List<String> list) {
        return new Filter<T>() { // from class: com.tantanapp.common.data.orm.StringColumn.4
            @Override // com.tantanapp.common.data.orm.Filter
            public SqlSegment emit() {
                String str;
                if (list.size() == 0) {
                    return SqlSegment.FALSE;
                }
                if (list.size() == 0) {
                    str = "";
                } else {
                    str = StringColumn.this.NAME + " IN ('" + vwb.m200307U(list, "', '") + "')";
                }
                return new SqlSegment(str, null);
            }

            @Override // com.tantanapp.common.data.orm.Filter
            public SqlSegment emitWithPrefix() {
                String str;
                if (list.size() == 0) {
                    return SqlSegment.FALSE;
                }
                if (list.size() == 0) {
                    str = "";
                } else {
                    str = Column.PREFIX + StringColumn.this.NAME + " IN ('" + vwb.m200307U(list, "', '") + "')";
                }
                return new SqlSegment(str, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.tantanapp.common.data.orm.Filter
            public boolean filter(T t) {
                return list.contains((String) StringColumn.this.get(t));
            }
        };
    }

    public Filter<T> NOT_IN(final List<String> list) {
        return new Filter<T>() { // from class: com.tantanapp.common.data.orm.StringColumn.5
            @Override // com.tantanapp.common.data.orm.Filter
            public SqlSegment emit() {
                String str;
                if (list.size() == 0) {
                    return SqlSegment.NULL;
                }
                if (list.size() == 0) {
                    str = "";
                } else {
                    str = StringColumn.this.NAME + " NOT IN ('" + vwb.m200307U(list, "', '") + "')";
                }
                return new SqlSegment(str, null);
            }

            @Override // com.tantanapp.common.data.orm.Filter
            public SqlSegment emitWithPrefix() {
                String str;
                if (list.size() == 0) {
                    return SqlSegment.NULL;
                }
                if (list.size() == 0) {
                    str = "";
                } else {
                    str = Column.PREFIX + StringColumn.this.NAME + " NOT IN ('" + vwb.m200307U(list, "', '") + "')";
                }
                return new SqlSegment(str, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.tantanapp.common.data.orm.Filter
            public boolean filter(T t) {
                return !list.contains((String) StringColumn.this.get(t));
            }
        };
    }

    public Filter<T> NOT_STARTS_WITH(final String str) {
        return new Filter<T>() { // from class: com.tantanapp.common.data.orm.StringColumn.1
            @Override // com.tantanapp.common.data.orm.Filter
            public SqlSegment emit() {
                return new SqlSegment(StringColumn.this.NAME + " NOT LIKE ?", new String[]{str + "%"});
            }

            @Override // com.tantanapp.common.data.orm.Filter
            public SqlSegment emitWithPrefix() {
                return new SqlSegment(Column.PREFIX + StringColumn.this.NAME + " NOT LIKE ?", new String[]{str + "%"});
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.tantanapp.common.data.orm.Filter
            public boolean filter(T t) {
                String str2 = (String) StringColumn.this.get(t);
                return str2 == null || !str2.startsWith(str);
            }
        };
    }

    public Filter<T> STARTS_WITH(final String str) {
        return new Filter<T>() { // from class: com.tantanapp.common.data.orm.StringColumn.2
            @Override // com.tantanapp.common.data.orm.Filter
            public SqlSegment emit() {
                return new SqlSegment(StringColumn.this.NAME + " LIKE ?", new String[]{str + "%"});
            }

            @Override // com.tantanapp.common.data.orm.Filter
            public SqlSegment emitWithPrefix() {
                return new SqlSegment(Column.PREFIX + StringColumn.this.NAME + " LIKE ?", new String[]{str + "%"});
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.tantanapp.common.data.orm.Filter
            public boolean filter(T t) {
                String str2 = (String) StringColumn.this.get(t);
                return str2 != null && str2.startsWith(str);
            }
        };
    }

    @Override // com.tantanapp.common.data.orm.Column
    public void put(ContentValues contentValues, String str) {
        DbObject.cvPut(contentValues, this.NAME, str);
    }
}
