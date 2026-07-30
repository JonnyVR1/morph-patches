package com.tantanapp.common.data.orm;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.tantanapp.common.data.DbObject;

/* JADX INFO: loaded from: classes13.dex */
public abstract class JoinFilter<K, V extends DbObject> extends Filter<K> {
    private static final String COUNT_MODEL = "SELECT count(t1._id) FROM ^1 AS t1, ^2 AS t2 WHERE ^3 ";
    private static final String QUERY_MODEL = "SELECT t1.* FROM ^1 AS t1, ^2 AS t2 WHERE ^3 ";

    public static <T extends DbObject, M extends DbObject> JoinFilter<T, M> AND(JoinFilter<T, M> joinFilter, Filter<T> filter) {
        joinFilter.setBaseFilter(Filter.AND(joinFilter.baseFilter(), filter));
        return joinFilter;
    }

    public static <T extends DbObject, M extends DbObject> JoinFilter<T, M> JOIN(@NonNull DatabaseStore.Table<T> table, Filter<T> filter, @NonNull StringColumn stringColumn, @NonNull DatabaseStore.Table<M> table2, @NonNull Filter<M> filter2) {
        return (JoinFilter<T, M>) new JoinFilter<T, M>(filter2, table, table2, stringColumn) { // from class: com.tantanapp.common.data.orm.JoinFilter.1
            private Filter<T> baseFilter;
            final /* synthetic */ DatabaseStore.Table val$baseTable;
            final /* synthetic */ StringColumn val$foreignC;
            final /* synthetic */ Filter val$joinFilter;
            final /* synthetic */ DatabaseStore.Table val$joinTable;

            {
                this.val$joinFilter = filter2;
                this.val$baseTable = table;
                this.val$joinTable = table2;
                this.val$foreignC = stringColumn;
                this.baseFilter = this.val$baseFilter_;
            }

            private String where() {
                StringBuilder sb = new StringBuilder();
                Filter<T> filter3 = this.baseFilter;
                if (filter3 != null) {
                    sb.append(filter3.emitWithPrefix().part.trim().replace(Column.PREFIX, "t1."));
                    sb.append(" AND ");
                }
                sb.append("t1.");
                sb.append(this.val$foreignC.NAME.trim());
                sb.append(" = t2.id_c AND ");
                sb.append(this.val$joinFilter.emitWithPrefix().part.trim().replace(Column.PREFIX, "t2."));
                return sb.toString();
            }

            @Override // com.tantanapp.common.data.orm.JoinFilter
            public Filter<T> baseFilter() {
                return this.baseFilter;
            }

            @Override // com.tantanapp.common.data.orm.JoinFilter
            public String countSql() {
                return TextUtils.expandTemplate(JoinFilter.COUNT_MODEL, this.val$baseTable.tableName, this.val$joinTable.tableName, where()).toString();
            }

            @Override // com.tantanapp.common.data.orm.Filter
            public SqlSegment emit() {
                Filter<T> filter3 = this.baseFilter;
                if (filter3 == null) {
                    return new SqlSegment(where(), this.val$joinFilter.emit().args);
                }
                String[] strArr = new String[filter3.emit().args.length + this.val$joinFilter.emit().args.length];
                String[] strArr2 = this.baseFilter.emit().args;
                int length = strArr2.length;
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    strArr[i3] = strArr2[i2];
                    i2++;
                    i3++;
                }
                String[] strArr3 = this.val$joinFilter.emit().args;
                int length2 = strArr3.length;
                while (i < length2) {
                    strArr[i3] = strArr3[i];
                    i++;
                    i3++;
                }
                return new SqlSegment(where(), strArr);
            }

            @Override // com.tantanapp.common.data.orm.Filter
            public SqlSegment emitWithPrefix() {
                return emit();
            }

            /* JADX WARN: Incorrect types in method signature: (TT;TM;)Z */
            @Override // com.tantanapp.common.data.orm.JoinFilter
            public boolean filter(DbObject dbObject, DbObject dbObject2) {
                Filter<T> filter3 = this.baseFilter;
                if (filter3 == null) {
                    return this.val$joinFilter.filter(dbObject2);
                }
                return filter3.filter(dbObject) && this.val$joinFilter.filter(dbObject2);
            }

            @Override // com.tantanapp.common.data.orm.JoinFilter
            public StringColumn foreignC() {
                return this.val$foreignC;
            }

            @Override // com.tantanapp.common.data.orm.JoinFilter
            public DatabaseStore.Table<M> joinTable() {
                return this.val$joinTable;
            }

            @Override // com.tantanapp.common.data.orm.JoinFilter
            public String querySql(Order<T> order, int i) {
                String string = TextUtils.expandTemplate(JoinFilter.QUERY_MODEL, this.val$baseTable.tableName, this.val$joinTable.tableName, where()).toString();
                if (order != null) {
                    string = string + " ORDER BY " + order.emit();
                }
                if (i <= 0) {
                    return string;
                }
                return string + " LIMIT " + String.valueOf(i);
            }

            @Override // com.tantanapp.common.data.orm.JoinFilter
            public void setBaseFilter(Filter<T> filter3) {
                this.baseFilter = filter3;
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)Z */
            @Override // com.tantanapp.common.data.orm.Filter
            public boolean filter(DbObject dbObject) {
                return false;
            }
        };
    }

    public abstract Filter<K> baseFilter();

    public abstract String countSql();

    public abstract boolean filter(K k, V v2);

    public abstract StringColumn foreignC();

    public abstract DatabaseStore.Table<V> joinTable();

    public abstract String querySql(Order<K> order, int i);

    public abstract void setBaseFilter(Filter<K> filter);
}
