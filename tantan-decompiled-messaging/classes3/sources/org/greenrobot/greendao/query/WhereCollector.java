package org.greenrobot.greendao.query;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.Property;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
class WhereCollector<T> {
    private final AbstractDao<T, ?> dao;
    private final String tablePrefix;
    private final List<WhereCondition> whereConditions = new ArrayList();

    public WhereCollector(AbstractDao<T, ?> abstractDao, String str) {
        this.dao = abstractDao;
        this.tablePrefix = str;
    }

    public void add(WhereCondition whereCondition, WhereCondition... whereConditionArr) {
        checkCondition(whereCondition);
        this.whereConditions.add(whereCondition);
        for (WhereCondition whereCondition2 : whereConditionArr) {
            checkCondition(whereCondition2);
            this.whereConditions.add(whereCondition2);
        }
    }

    public void addCondition(StringBuilder sb, List<Object> list, WhereCondition whereCondition) {
        checkCondition(whereCondition);
        whereCondition.appendTo(sb, this.tablePrefix);
        whereCondition.appendValuesTo(list);
    }

    public void appendWhereClause(StringBuilder sb, String str, List<Object> list) {
        ListIterator<WhereCondition> listIterator = this.whereConditions.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.hasPrevious()) {
                sb.append(" AND ");
            }
            WhereCondition next = listIterator.next();
            next.appendTo(sb, str);
            next.appendValuesTo(list);
        }
    }

    public void checkCondition(WhereCondition whereCondition) {
        if (whereCondition instanceof WhereCondition.PropertyCondition) {
            checkProperty(((WhereCondition.PropertyCondition) whereCondition).property);
        }
    }

    public void checkProperty(Property property) {
        AbstractDao<T, ?> abstractDao = this.dao;
        if (abstractDao != null) {
            for (Property property2 : abstractDao.getProperties()) {
                if (property == property2) {
                    return;
                }
            }
            throw new DaoException("Property '" + property.name + "' is not part of " + this.dao);
        }
    }

    public WhereCondition combineWhereConditions(String str, WhereCondition whereCondition, WhereCondition whereCondition2, WhereCondition... whereConditionArr) {
        StringBuilder sb = new StringBuilder("(");
        ArrayList arrayList = new ArrayList();
        addCondition(sb, arrayList, whereCondition);
        sb.append(str);
        addCondition(sb, arrayList, whereCondition2);
        for (WhereCondition whereCondition3 : whereConditionArr) {
            sb.append(str);
            addCondition(sb, arrayList, whereCondition3);
        }
        sb.append(')');
        return new WhereCondition.StringCondition(sb.toString(), arrayList.toArray());
    }

    public boolean isEmpty() {
        return this.whereConditions.isEmpty();
    }
}
