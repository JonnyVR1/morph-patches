package p007l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.orm.Column;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.Order;
import com.tantanapp.common.data.orm.SqlSegment;
import com.tantanapp.common.data.orm.StringColumn;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public abstract class tnq<K extends DbObject, V extends DbObject> extends Filter<K> {
    /* JADX INFO: renamed from: a */
    public static <T extends DbObject, M extends DbObject> tnq<T, M> m14576a(tnq<T, M> tnqVar, Filter<T> filter) {
        tnqVar.baseFilter();
        tnqVar.setBaseFilter(Filter.AND(new Filter[]{tnqVar.baseFilter(), filter}));
        return tnqVar;
    }

    /* JADX INFO: renamed from: b */
    public static <T extends DbObject, M extends DbObject> tnq<T, M> m14577b(tnq<T, M> tnqVar, Order order, T t) {
        tnq tnqVarM14578c = m14578c(tnqVar.mo14579d(), tnqVar.baseFilter(), tnqVar.foreignC(), tnqVar.mo14582g(), tnqVar.mo14581f(), tnqVar.mo14580e());
        return (!(order instanceof unq) || ((unq) order).m15120g() == null) ? m14576a(tnqVarM14578c, Filter.AND(new Filter[]{order.GT_EQ(t), DbObject._ID.NEQ(Long.valueOf(((DbObject) t)._id))})) : m14576a(tnqVarM14578c, Filter.AND(new Filter[]{order.GT_EQ(t), DbObject._ID.NEQ(Long.valueOf(((DbObject) t)._id))}));
    }

    /* JADX INFO: renamed from: c */
    public static <T extends DbObject, M extends DbObject> tnq<T, M> m14578c(@NonNull orh0<T> orh0Var, Filter<T> filter, @NonNull StringColumn stringColumn, @NonNull orh0<M> orh0Var2, Filter<M> filter2, boolean z) {
        return new C2499a(filter, filter2, z, orh0Var, orh0Var2, stringColumn);
    }

    public abstract Filter<K> baseFilter();

    public abstract String countSql();

    /* JADX INFO: renamed from: d */
    public abstract orh0<K> mo14579d();

    /* JADX INFO: renamed from: e */
    public abstract boolean mo14580e();

    /* JADX INFO: renamed from: f */
    public abstract Filter<V> mo14581f();

    public abstract boolean filter(K k, V v);

    public abstract StringColumn foreignC();

    /* JADX INFO: renamed from: g */
    public abstract orh0<V> mo14582g();

    public abstract String querySql(Order<K> order, int i);

    public abstract void setBaseFilter(Filter<K> filter);

    /* JADX INFO: Add missing generic type declarations: [T, M] */
    /* JADX INFO: renamed from: l.tnq$a */
    public class C2499a<M, T> extends tnq<T, M> {

        /* JADX INFO: renamed from: a */
        public Filter<T> f13350a;

        /* JADX INFO: renamed from: b */
        public Filter<M> f13351b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Filter f13352c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Filter f13353d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f13354e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ orh0 f13355f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ orh0 f13356g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ StringColumn f13357h;

        public C2499a(Filter filter, Filter filter2, boolean z, orh0 orh0Var, orh0 orh0Var2, StringColumn stringColumn) {
            this.f13352c = filter;
            this.f13353d = filter2;
            this.f13354e = z;
            this.f13355f = orh0Var;
            this.f13356g = orh0Var2;
            this.f13357h = stringColumn;
            this.f13350a = filter;
            this.f13351b = filter2;
        }

        @Override // p007l.tnq
        public Filter<T> baseFilter() {
            return this.f13350a;
        }

        @Override // p007l.tnq
        public String countSql() {
            return TextUtils.expandTemplate("SELECT count(t1._id) FROM ^1 AS t1 left join ^2 AS t2 ON ^3 ", this.f13355f.f11572d, this.f13356g.f11572d, where()).toString();
        }

        @Override // p007l.tnq
        /* JADX INFO: renamed from: d */
        public orh0<T> mo14579d() {
            return this.f13355f;
        }

        @Override // p007l.tnq
        /* JADX INFO: renamed from: e */
        public boolean mo14580e() {
            return this.f13354e;
        }

        public SqlSegment emit() {
            Filter<T> filter = this.f13350a;
            if (filter == null) {
                return this.f13351b != null ? new SqlSegment(where(), this.f13351b.emit().args) : SqlSegment.NULL;
            }
            String[] strArr = new String[filter.emit().args.length + this.f13351b.emit().args.length];
            String[] strArr2 = this.f13350a.emit().args;
            int length = strArr2.length;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                strArr[i3] = strArr2[i2];
                i2++;
                i3++;
            }
            String[] strArr3 = this.f13351b.emit().args;
            int length2 = strArr3.length;
            while (i < length2) {
                strArr[i3] = strArr3[i];
                i++;
                i3++;
            }
            return new SqlSegment(where(), strArr);
        }

        public SqlSegment emitWithPrefix() {
            return emit();
        }

        @Override // p007l.tnq
        /* JADX INFO: renamed from: f */
        public Filter<M> mo14581f() {
            return this.f13351b;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;TM;)Z */
        @Override // p007l.tnq
        public boolean filter(DbObject dbObject, DbObject dbObject2) {
            boolean zMo14580e = mo14580e();
            Filter<T> filter = this.f13350a;
            if (zMo14580e) {
                if (filter != null && this.f13351b != null) {
                    return filter.filter(dbObject) && this.f13351b.filter(dbObject2);
                }
                if (filter != null && !filter.filter(dbObject)) {
                    return false;
                }
                Filter<M> filter2 = this.f13351b;
                return filter2 == null || (dbObject2 != null && filter2.filter(dbObject2));
            }
            if (filter != null && this.f13351b != null) {
                return filter.filter(dbObject) && this.f13351b.filter(dbObject2);
            }
            if ((filter != null && !filter.filter(dbObject)) || dbObject2 == null) {
                return false;
            }
            Filter<M> filter3 = this.f13351b;
            return filter3 == null || filter3.filter(dbObject2);
        }

        @Override // p007l.tnq
        public StringColumn foreignC() {
            return this.f13357h;
        }

        @Override // p007l.tnq
        /* JADX INFO: renamed from: g */
        public orh0<M> mo14582g() {
            return this.f13356g;
        }

        @Override // p007l.tnq
        public String querySql(Order<T> order, int i) {
            String string = TextUtils.expandTemplate(this.f13354e ? "SELECT * FROM ^1 AS t1 left join ^2 AS t2 ON ^3 " : "SELECT * FROM ^1 AS t1, ^2 AS t2 WHERE ^3 ", this.f13355f.f11572d, this.f13356g.f11572d, where()).toString();
            if (order != null) {
                string = string + " ORDER BY " + order.emit();
            }
            if (i <= 0) {
                return string;
            }
            return string + " LIMIT " + String.valueOf(i);
        }

        @Override // p007l.tnq
        public void setBaseFilter(Filter<T> filter) {
            this.f13350a = filter;
        }

        public final String where() {
            boolean z;
            StringBuilder sb = new StringBuilder(" t1.");
            sb.append(((Column) this.f13357h).NAME.trim());
            sb.append(" = t2.id_c");
            if (this.f13350a != null) {
                sb.append(" where ");
                sb.append(this.f13350a.emitWithPrefix().part.trim().replace("$.", "t1."));
                z = true;
            } else {
                z = false;
            }
            if (this.f13351b != null) {
                if (z) {
                    sb.append(" AND ");
                } else {
                    sb.append(" where ");
                }
                sb.append(this.f13351b.emitWithPrefix().part.trim().replace("$.", "t2."));
            }
            return sb.toString();
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Z */
        public boolean filter(DbObject dbObject) {
            return false;
        }
    }
}
