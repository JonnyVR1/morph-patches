package org.greenrobot.greendao.query;

import java.util.Date;
import l.qkq0;
import org.greenrobot.greendao.AbstractDao;
import p003l.k250;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
abstract class AbstractQueryWithLimit<T> extends AbstractQuery<T> {
    protected final int limitPosition;
    protected final int offsetPosition;

    public AbstractQueryWithLimit(AbstractDao<T, ?> abstractDao, String str, String[] strArr, int i, int i2) {
        super(abstractDao, str, strArr);
        this.limitPosition = i;
        this.offsetPosition = i2;
    }

    public void setLimit(int i) {
        checkThread();
        int i2 = this.limitPosition;
        if (i2 != -1) {
            this.parameters[i2] = Integer.toString(i);
        } else {
            qkq0.a("Limit must be set with QueryBuilder before it can be used here");
        }
    }

    public void setOffset(int i) {
        checkThread();
        int i2 = this.offsetPosition;
        if (i2 != -1) {
            this.parameters[i2] = Integer.toString(i);
        } else {
            qkq0.a("Offset must be set with QueryBuilder before it can be used here");
        }
    }

    @Override // org.greenrobot.greendao.query.AbstractQuery
    public AbstractQueryWithLimit<T> setParameter(int i, Object obj) {
        if (i < 0 || !(i == this.limitPosition || i == this.offsetPosition)) {
            return (AbstractQueryWithLimit) super.setParameter(i, obj);
        }
        k250.m5546a("Illegal parameter index: ", i);
        return null;
    }

    public AbstractQueryWithLimit<T> setParameter(int i, Date date) {
        return setParameter(i, (Object) (date != null ? Long.valueOf(date.getTime()) : null));
    }

    public AbstractQueryWithLimit<T> setParameter(int i, Boolean bool) {
        return setParameter(i, (Object) (bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null));
    }
}
