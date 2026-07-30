package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.orm.Column;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.Order;
import com.tantanapp.common.data.orm.SqlSegment;
import com.tantanapp.common.data.orm.StringColumn;

/* JADX INFO: loaded from: classes12.dex */
public abstract class tnq<K extends DbObject, V extends DbObject> extends Filter<K> {
    /* JADX INFO: renamed from: a */
    public static <T extends DbObject, M extends DbObject> tnq<T, M> m189809a(tnq<T, M> tnqVar, Filter<T> filter) {
        tnqVar.baseFilter();
        tnqVar.setBaseFilter(Filter.AND(tnqVar.baseFilter(), filter));
        return tnqVar;
    }

    /* JADX INFO: renamed from: b */
    public static <T extends DbObject, M extends DbObject> tnq<T, M> m189810b(tnq<T, M> tnqVar, Order order, T t) {
        tnq tnqVarM189811c = m189811c(tnqVar.mo189812d(), tnqVar.baseFilter(), tnqVar.foreignC(), tnqVar.mo189815g(), tnqVar.mo189814f(), tnqVar.mo189813e());
        return (!(order instanceof unq) || ((unq) order).m194474g() == null) ? m189809a(tnqVarM189811c, Filter.AND(order.GT_EQ(t), DbObject._ID.NEQ(Long.valueOf(t._id)))) : m189809a(tnqVarM189811c, Filter.AND(order.GT_EQ(t), DbObject._ID.NEQ(Long.valueOf(t._id))));
    }

    /* JADX INFO: renamed from: c */
    public static <T extends DbObject, M extends DbObject> tnq<T, M> m189811c(@NonNull orh0<T> orh0Var, Filter<T> filter, @NonNull StringColumn stringColumn, @NonNull orh0<M> orh0Var2, Filter<M> filter2, boolean z) {
        return new C20216a(filter, filter2, z, orh0Var, orh0Var2, stringColumn);
    }

    public abstract Filter<K> baseFilter();

    public abstract String countSql();

    /* JADX INFO: renamed from: d */
    public abstract orh0<K> mo189812d();

    /* JADX INFO: renamed from: e */
    public abstract boolean mo189813e();

    /* JADX INFO: renamed from: f */
    public abstract Filter<V> mo189814f();

    public abstract boolean filter(K k, V v2);

    public abstract StringColumn foreignC();

    /* JADX INFO: renamed from: g */
    public abstract orh0<V> mo189815g();

    public abstract String querySql(Order<K> order, int i);

    public abstract void setBaseFilter(Filter<K> filter);

    /* JADX INFO: Add missing generic type declarations: [T, M] */
    /* JADX INFO: renamed from: l.tnq$a */
    public class C20216a<M, T> extends tnq<T, M> {

        /* JADX INFO: renamed from: a */
        public Filter<T> f171262a;

        /* JADX INFO: renamed from: b */
        public Filter<M> f171263b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Filter f171264c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Filter f171265d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f171266e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ orh0 f171267f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ orh0 f171268g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ StringColumn f171269h;

        public C20216a(Filter filter, Filter filter2, boolean z, orh0 orh0Var, orh0 orh0Var2, StringColumn stringColumn) {
            this.f171264c = filter;
            this.f171265d = filter2;
            this.f171266e = z;
            this.f171267f = orh0Var;
            this.f171268g = orh0Var2;
            this.f171269h = stringColumn;
            this.f171262a = filter;
            this.f171263b = filter2;
        }

        @Override // p149l.tnq
        public Filter<T> baseFilter() {
            return this.f171262a;
        }

        @Override // p149l.tnq
        public String countSql() {
            return TextUtils.expandTemplate("SELECT count(t1._id) FROM ^1 AS t1 left join ^2 AS t2 ON ^3 ", this.f171267f.f145283d, this.f171268g.f145283d, where()).toString();
        }

        @Override // p149l.tnq
        /* JADX INFO: renamed from: d */
        public orh0<T> mo189812d() {
            return this.f171267f;
        }

        @Override // p149l.tnq
        /* JADX INFO: renamed from: e */
        public boolean mo189813e() {
            return this.f171266e;
        }

        @Override // com.tantanapp.common.data.orm.Filter
        public SqlSegment emit() {
            Filter<T> filter = this.f171262a;
            if (filter == null) {
                return this.f171263b != null ? new SqlSegment(where(), this.f171263b.emit().args) : SqlSegment.NULL;
            }
            String[] strArr = new String[filter.emit().args.length + this.f171263b.emit().args.length];
            String[] strArr2 = this.f171262a.emit().args;
            int length = strArr2.length;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                strArr[i3] = strArr2[i2];
                i2++;
                i3++;
            }
            String[] strArr3 = this.f171263b.emit().args;
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

        @Override // p149l.tnq
        /* JADX INFO: renamed from: f */
        public Filter<M> mo189814f() {
            return this.f171263b;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;TM;)Z */
        @Override // p149l.tnq
        public boolean filter(DbObject dbObject, DbObject dbObject2) {
            boolean zMo189813e = mo189813e();
            Filter<T> filter = this.f171262a;
            if (zMo189813e) {
                if (filter != null && this.f171263b != null) {
                    return filter.filter(dbObject) && this.f171263b.filter(dbObject2);
                }
                if (filter != null && !filter.filter(dbObject)) {
                    return false;
                }
                Filter<M> filter2 = this.f171263b;
                return filter2 == null || (dbObject2 != null && filter2.filter(dbObject2));
            }
            if (filter != null && this.f171263b != null) {
                return filter.filter(dbObject) && this.f171263b.filter(dbObject2);
            }
            if ((filter != null && !filter.filter(dbObject)) || dbObject2 == null) {
                return false;
            }
            Filter<M> filter3 = this.f171263b;
            return filter3 == null || filter3.filter(dbObject2);
        }

        @Override // p149l.tnq
        public StringColumn foreignC() {
            return this.f171269h;
        }

        @Override // p149l.tnq
        /* JADX INFO: renamed from: g */
        public orh0<M> mo189815g() {
            return this.f171268g;
        }

        @Override // p149l.tnq
        public String querySql(Order<T> order, int i) {
            String string = TextUtils.expandTemplate(this.f171266e ? "SELECT * FROM ^1 AS t1 left join ^2 AS t2 ON ^3 " : "SELECT * FROM ^1 AS t1, ^2 AS t2 WHERE ^3 ", this.f171267f.f145283d, this.f171268g.f145283d, where()).toString();
            if (order != null) {
                string = string + " ORDER BY " + order.emit();
            }
            if (i <= 0) {
                return string;
            }
            return string + " LIMIT " + String.valueOf(i);
        }

        @Override // p149l.tnq
        public void setBaseFilter(Filter<T> filter) {
            this.f171262a = filter;
        }

        public final String where() {
            boolean z;
            StringBuilder sb = new StringBuilder(" t1.");
            sb.append(this.f171269h.NAME.trim());
            sb.append(" = t2.id_c");
            if (this.f171262a != null) {
                sb.append(" where ");
                sb.append(this.f171262a.emitWithPrefix().part.trim().replace(Column.PREFIX, "t1."));
                z = true;
            } else {
                z = false;
            }
            if (this.f171263b != null) {
                if (z) {
                    sb.append(" AND ");
                } else {
                    sb.append(" where ");
                }
                sb.append(this.f171263b.emitWithPrefix().part.trim().replace(Column.PREFIX, "t2."));
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
