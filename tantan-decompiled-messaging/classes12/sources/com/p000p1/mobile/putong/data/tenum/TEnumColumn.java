package com.p000p1.mobile.putong.data.tenum;

import android.content.ContentValues;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.orm.Column;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.IntegerColumn;
import com.tantanapp.common.data.orm.OrderedColumn;
import com.tantanapp.common.data.orm.StringColumn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public abstract class TEnumColumn<T, Enum extends TEnum> extends OrderedColumn<T, TEnum> {
    private final StringColumn<T> nameColumnInner;
    private final IntegerColumn<T> ordinalColumnInner;
    private final TEnumJsonAdapter tEnumJsonAdapter;

    public TEnumColumn(String str, String str2, final TEnumJsonAdapter tEnumJsonAdapter) {
        super(str);
        this.tEnumJsonAdapter = tEnumJsonAdapter;
        if (str2 != null) {
            this.ordinalColumnInner = new IntegerColumn<T>(str2) { // from class: com.p1.mobile.putong.data.tenum.TEnumColumn.1
                /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
                public Integer m19394get(T t) {
                    TEnum tEnum = (TEnum) TEnumColumn.this.get(t);
                    if (tEnum == null) {
                        return null;
                    }
                    return Integer.valueOf(tEnum.ordinal());
                }

                public void set(T t, Integer num) {
                }
            };
        } else {
            this.ordinalColumnInner = null;
        }
        this.nameColumnInner = new StringColumn<T>(str) { // from class: com.p1.mobile.putong.data.tenum.TEnumColumn.2
            public String get(T t) {
                TEnum tEnum = (TEnum) TEnumColumn.this.get(t);
                if (tEnum == null) {
                    return null;
                }
                return tEnum.name();
            }

            public void set(T t, String str3) {
                TEnumJsonAdapter tEnumJsonAdapter2 = tEnumJsonAdapter;
                TEnumColumn.this.set((Object) t, tEnumJsonAdapter2.newTEnum(str3, tEnumJsonAdapter2.getInteger(str3).intValue()));
            }
        };
    }

    public Filter<T> CONTAINS(String str) {
        throw new RuntimeException("not support!!!");
    }

    /* JADX INFO: renamed from: EQ */
    public Filter<T> m1094EQ(String str) {
        return (this.ordinalColumnInner == null || this.tEnumJsonAdapter.getInteger(str) == null) ? this.nameColumnInner.EQ(str) : Filter.OR(new Filter[]{Filter.AND(new Filter[]{this.nameColumnInner.NULL(), this.ordinalColumnInner.EQ(this.tEnumJsonAdapter.getInteger(str))}), Filter.AND(new Filter[]{this.nameColumnInner.NOT_NULL(), this.nameColumnInner.EQ(str)})});
    }

    public Filter<T> EQ_CONSTANT(String str) {
        if (this.ordinalColumnInner == null) {
            return this.nameColumnInner.EQ_CONSTANT(str);
        }
        Integer integer = this.tEnumJsonAdapter.getInteger(str);
        StringColumn<T> stringColumn = this.nameColumnInner;
        return integer == null ? stringColumn.EQ_CONSTANT(str) : Filter.OR(new Filter[]{Filter.AND(new Filter[]{stringColumn.NULL(), this.ordinalColumnInner.EQ_CONSTANT(this.tEnumJsonAdapter.getInteger(str))}), Filter.AND(new Filter[]{this.nameColumnInner.NOT_NULL(), this.nameColumnInner.EQ_CONSTANT(str)})});
    }

    /* JADX INFO: renamed from: IN */
    public Filter<T> m1095IN(List<String> list) {
        if (this.ordinalColumnInner == null) {
            return this.nameColumnInner.IN(list);
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Integer integer = this.tEnumJsonAdapter.getInteger(list.get(i));
            if (integer != null) {
                arrayList.add(this.ordinalColumnInner.EQ(integer));
            }
        }
        if (arrayList.size() == 0) {
            return this.nameColumnInner.IN(list);
        }
        return Filter.OR(new Filter[]{Filter.AND(new Filter[]{this.nameColumnInner.NOT_NULL(), this.nameColumnInner.IN(list)}), Filter.AND(new Filter[]{this.nameColumnInner.NULL(), Filter.OR((Filter[]) arrayList.toArray(new Filter[arrayList.size()]))})});
    }

    public Filter<T> IN_(List<TEnum> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<TEnum> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toString());
        }
        return m1095IN(arrayList);
    }

    public Filter<T> LEQ(String str) {
        throw new RuntimeException("not support!!!");
    }

    public Filter<T> NEQ(String str) {
        return (this.ordinalColumnInner == null || this.tEnumJsonAdapter.getInteger(str) == null) ? this.nameColumnInner.NEQ(str) : Filter.OR(new Filter[]{Filter.AND(new Filter[]{this.nameColumnInner.NULL(), this.ordinalColumnInner.NEQ(this.tEnumJsonAdapter.getInteger(str))}), Filter.AND(new Filter[]{this.nameColumnInner.NOT_NULL(), this.nameColumnInner.NEQ(str)})});
    }

    public Filter<T> NOT_IN(List<String> list) {
        if (this.ordinalColumnInner == null) {
            return this.nameColumnInner.NOT_IN(list);
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Integer integer = this.tEnumJsonAdapter.getInteger(list.get(i));
            if (integer != null) {
                arrayList.add(this.ordinalColumnInner.EQ(integer));
            }
        }
        if (arrayList.size() == 0) {
            return this.nameColumnInner.NOT_IN(list);
        }
        return Filter.OR(new Filter[]{Filter.AND(new Filter[]{this.nameColumnInner.NOT_NULL(), this.nameColumnInner.NOT_IN(list)}), Filter.AND(new Filter[]{this.nameColumnInner.NULL(), Filter.AND((Filter[]) arrayList.toArray(new Filter[arrayList.size()]))})});
    }

    public Filter<T> NOT_IN_(List<TEnum> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<TEnum> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toString());
        }
        return NOT_IN(arrayList);
    }

    public Filter<T> NOT_STARTS_WITH(String str) {
        throw new RuntimeException("not support!!!");
    }

    public Filter<T> REQ(String str) {
        throw new RuntimeException("not support!!!");
    }

    public Filter<T> STARTS_WITH(String str) {
        throw new RuntimeException("not support!!!");
    }

    public void put(ContentValues contentValues, TEnum tEnum) {
        if (tEnum != null) {
            IntegerColumn<T> integerColumn = this.ordinalColumnInner;
            if (integerColumn != null) {
                DbObject.cvPut(contentValues, ((Column) integerColumn).NAME, Integer.valueOf(tEnum.ordinal()));
            }
            DbObject.cvPut(contentValues, ((Column) this.nameColumnInner).NAME, tEnum.name());
            return;
        }
        DbObject.cvPut(contentValues, ((Column) this.nameColumnInner).NAME, (String) null);
        IntegerColumn<T> integerColumn2 = this.ordinalColumnInner;
        if (integerColumn2 != null) {
            DbObject.cvPut(contentValues, ((Column) integerColumn2).NAME, (Integer) null);
        }
    }

    public abstract void setTEnum(T t, Enum r2);

    public final void set(T t, TEnum tEnum) {
        setTEnum(t, tEnum);
    }

    /* JADX INFO: renamed from: EQ, reason: merged with bridge method [inline-methods] */
    public Filter<T> m1093EQ(TEnum tEnum) {
        return m1094EQ(tEnum.toString());
    }

    public Filter<T> NEQ(TEnum tEnum) {
        return NEQ(tEnum.toString());
    }

    public Filter<T> EQ_CONSTANT(TEnum tEnum) {
        return EQ_CONSTANT(tEnum.toString());
    }
}
