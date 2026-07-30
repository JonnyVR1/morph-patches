package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.orm.Column;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.Order;
import com.tantanapp.common.data.orm.SqlSegment;
import com.tantanapp.common.data.orm.StringColumn;

/* JADX INFO: loaded from: classes12.dex */
public abstract class spq<K extends DbObject, V extends DbObject> extends Filter<K> {
    /* JADX INFO: renamed from: a */
    public static <T extends DbObject, M extends DbObject> spq<T, M> m187433a(spq<T, M> spqVar, Filter<T> filter) {
        spqVar.baseFilter();
        spqVar.setBaseFilter(Filter.AND(spqVar.baseFilter(), filter));
        return spqVar;
    }

    /* JADX INFO: renamed from: b */
    public static <T extends DbObject, M extends DbObject> spq<T, M> m187434b(spq<T, M> spqVar, Order order, T t) {
        spq spqVarM187435c = m187435c(spqVar.mo187436d(), spqVar.baseFilter(), spqVar.foreignC(), spqVar.mo187439g(), spqVar.mo187438f(), spqVar.mo187437e());
        return (!(order instanceof tpq) || ((tpq) order).m192202g() == null) ? m187433a(spqVarM187435c, Filter.AND(order.GT_EQ(t), DbObject._ID.NEQ(Long.valueOf(t._id)))) : m187433a(spqVarM187435c, Filter.AND(order.GT_EQ(t), DbObject._ID.NEQ(Long.valueOf(t._id))));
    }

    /* JADX INFO: renamed from: c */
    public static <T extends DbObject, M extends DbObject> spq<T, M> m187435c(@NonNull wzh0<T> wzh0Var, Filter<T> filter, @NonNull StringColumn stringColumn, @NonNull wzh0<M> wzh0Var2, Filter<M> filter2, boolean z) {
        return new C20130a(filter, filter2, z, wzh0Var, wzh0Var2, stringColumn);
    }

    public abstract Filter<K> baseFilter();

    public abstract String countSql();

    /* JADX INFO: renamed from: d */
    public abstract wzh0<K> mo187436d();

    /* JADX INFO: renamed from: e */
    public abstract boolean mo187437e();

    /* JADX INFO: renamed from: f */
    public abstract Filter<V> mo187438f();

    public abstract boolean filter(K k, V v2);

    public abstract StringColumn foreignC();

    /* JADX INFO: renamed from: g */
    public abstract wzh0<V> mo187439g();

    public abstract String querySql(Order<K> order, int i);

    public abstract void setBaseFilter(Filter<K> filter);

    /* JADX INFO: Add missing generic type declarations: [T, M] */
    /* JADX INFO: renamed from: l.spq$a */
    public class C20130a<M, T> extends spq<T, M> {

        /* JADX INFO: renamed from: a */
        public Filter<T> f170077a;

        /* JADX INFO: renamed from: b */
        public Filter<M> f170078b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Filter f170079c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Filter f170080d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f170081e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ wzh0 f170082f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ wzh0 f170083g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ StringColumn f170084h;

        public C20130a(Filter filter, Filter filter2, boolean z, wzh0 wzh0Var, wzh0 wzh0Var2, StringColumn stringColumn) {
            this.f170079c = filter;
            this.f170080d = filter2;
            this.f170081e = z;
            this.f170082f = wzh0Var;
            this.f170083g = wzh0Var2;
            this.f170084h = stringColumn;
            this.f170077a = filter;
            this.f170078b = filter2;
        }

        @Override // p153l.spq
        public Filter<T> baseFilter() {
            return this.f170077a;
        }

        @Override // p153l.spq
        public String countSql() {
            return TextUtils.expandTemplate("SELECT count(t1._id) FROM ^1 AS t1 left join ^2 AS t2 ON ^3 ", this.f170082f.f191760d, this.f170083g.f191760d, where()).toString();
        }

        @Override // p153l.spq
        /* JADX INFO: renamed from: d */
        public wzh0<T> mo187436d() {
            return this.f170082f;
        }

        @Override // p153l.spq
        /* JADX INFO: renamed from: e */
        public boolean mo187437e() {
            return this.f170081e;
        }

        @Override // com.tantanapp.common.data.orm.Filter
        public SqlSegment emit() {
            Filter<T> filter = this.f170077a;
            if (filter == null) {
                return this.f170078b != null ? new SqlSegment(where(), this.f170078b.emit().args) : SqlSegment.NULL;
            }
            String[] strArr = new String[filter.emit().args.length + this.f170078b.emit().args.length];
            String[] strArr2 = this.f170077a.emit().args;
            int length = strArr2.length;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                strArr[i3] = strArr2[i2];
                i2++;
                i3++;
            }
            String[] strArr3 = this.f170078b.emit().args;
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

        @Override // p153l.spq
        /* JADX INFO: renamed from: f */
        public Filter<M> mo187438f() {
            return this.f170078b;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;TM;)Z */
        @Override // p153l.spq
        public boolean filter(DbObject dbObject, DbObject dbObject2) {
            boolean zMo187437e = mo187437e();
            Filter<T> filter = this.f170077a;
            if (zMo187437e) {
                if (filter != null && this.f170078b != null) {
                    return filter.filter(dbObject) && this.f170078b.filter(dbObject2);
                }
                if (filter != null && !filter.filter(dbObject)) {
                    return false;
                }
                Filter<M> filter2 = this.f170078b;
                return filter2 == null || (dbObject2 != null && filter2.filter(dbObject2));
            }
            if (filter != null && this.f170078b != null) {
                return filter.filter(dbObject) && this.f170078b.filter(dbObject2);
            }
            if ((filter != null && !filter.filter(dbObject)) || dbObject2 == null) {
                return false;
            }
            Filter<M> filter3 = this.f170078b;
            return filter3 == null || filter3.filter(dbObject2);
        }

        @Override // p153l.spq
        public StringColumn foreignC() {
            return this.f170084h;
        }

        @Override // p153l.spq
        /* JADX INFO: renamed from: g */
        public wzh0<M> mo187439g() {
            return this.f170083g;
        }

        @Override // p153l.spq
        public String querySql(Order<T> order, int i) {
            String string = TextUtils.expandTemplate(this.f170081e ? "SELECT * FROM ^1 AS t1 left join ^2 AS t2 ON ^3 " : "SELECT * FROM ^1 AS t1, ^2 AS t2 WHERE ^3 ", this.f170082f.f191760d, this.f170083g.f191760d, where()).toString();
            if (order != null) {
                string = string + " ORDER BY " + order.emit();
            }
            if (i <= 0) {
                return string;
            }
            return string + " LIMIT " + String.valueOf(i);
        }

        @Override // p153l.spq
        public void setBaseFilter(Filter<T> filter) {
            this.f170077a = filter;
        }

        public final String where() {
            boolean z;
            StringBuilder sb = new StringBuilder(" t1.");
            sb.append(this.f170084h.NAME.trim());
            sb.append(" = t2.id_c");
            if (this.f170077a != null) {
                sb.append(" where ");
                sb.append(this.f170077a.emitWithPrefix().part.trim().replace(Column.PREFIX, "t1."));
                z = true;
            } else {
                z = false;
            }
            if (this.f170078b != null) {
                if (z) {
                    sb.append(" AND ");
                } else {
                    sb.append(" where ");
                }
                sb.append(this.f170078b.emitWithPrefix().part.trim().replace(Column.PREFIX, "t2."));
            }
            return sb.toString();
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Z */
        @Override // com.tantanapp.common.data.orm.Filter
        public boolean filter(DbObject dbObject) {
            return false;
        }
    }
}
