package org.greenrobot.greendao;

import java.util.Collection;
import org.greenrobot.greendao.internal.SqlUtils;
import org.greenrobot.greendao.query.WhereCondition;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Property {
    public final String columnName;
    public final String name;
    public final int ordinal;
    public final boolean primaryKey;
    public final Class<?> type;

    public Property(int i, Class<?> cls, String str, boolean z, String str2) {
        this.ordinal = i;
        this.type = cls;
        this.name = str;
        this.primaryKey = z;
        this.columnName = str2;
    }

    public WhereCondition between(Object obj, Object obj2) {
        return new WhereCondition.PropertyCondition(this, " BETWEEN ? AND ?", new Object[]{obj, obj2});
    }

    /* JADX INFO: renamed from: eq */
    public WhereCondition m9567eq(Object obj) {
        return new WhereCondition.PropertyCondition(this, "=?", obj);
    }

    /* JADX INFO: renamed from: ge */
    public WhereCondition m9568ge(Object obj) {
        return new WhereCondition.PropertyCondition(this, ">=?", obj);
    }

    /* JADX INFO: renamed from: gt */
    public WhereCondition m9569gt(Object obj) {
        return new WhereCondition.PropertyCondition(this, ">?", obj);
    }

    /* JADX INFO: renamed from: in */
    public WhereCondition m9571in(Object... objArr) {
        StringBuilder sb = new StringBuilder(" IN (");
        SqlUtils.appendPlaceholders(sb, objArr.length).append(')');
        return new WhereCondition.PropertyCondition(this, sb.toString(), objArr);
    }

    public WhereCondition isNotNull() {
        return new WhereCondition.PropertyCondition(this, " IS NOT NULL");
    }

    public WhereCondition isNull() {
        return new WhereCondition.PropertyCondition(this, " IS NULL");
    }

    /* JADX INFO: renamed from: le */
    public WhereCondition m9572le(Object obj) {
        return new WhereCondition.PropertyCondition(this, "<=?", obj);
    }

    public WhereCondition like(String str) {
        return new WhereCondition.PropertyCondition(this, " LIKE ?", str);
    }

    /* JADX INFO: renamed from: lt */
    public WhereCondition m9573lt(Object obj) {
        return new WhereCondition.PropertyCondition(this, "<?", obj);
    }

    public WhereCondition notEq(Object obj) {
        return new WhereCondition.PropertyCondition(this, "<>?", obj);
    }

    public WhereCondition notIn(Object... objArr) {
        StringBuilder sb = new StringBuilder(" NOT IN (");
        SqlUtils.appendPlaceholders(sb, objArr.length).append(')');
        return new WhereCondition.PropertyCondition(this, sb.toString(), objArr);
    }

    /* JADX INFO: renamed from: in */
    public WhereCondition m9570in(Collection<?> collection) {
        return m9571in(collection.toArray());
    }

    public WhereCondition notIn(Collection<?> collection) {
        return notIn(collection.toArray());
    }
}
