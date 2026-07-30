package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.orm.Column;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.Order;
import com.tantanapp.common.data.orm.SqlSegment;

/* JADX INFO: loaded from: classes12.dex */
@Deprecated
public class tpq<T extends DbObject, J extends DbObject> extends Order<T> {

    /* JADX INFO: renamed from: a */
    public Order<T> f175627a;

    /* JADX INFO: renamed from: b */
    public Order<J> f175628b;

    /* JADX INFO: renamed from: c */
    public Class<J> f175629c;

    /* JADX INFO: renamed from: d */
    public boolean f175630d;

    /* JADX INFO: renamed from: l.tpq$a */
    public class C20373a extends Filter<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DbObject f175631a;

        public C20373a(DbObject dbObject) {
            this.f175631a = dbObject;
        }

        @Override // com.tantanapp.common.data.orm.Filter
        public SqlSegment emit() {
            return tpq.this.f175627a == null ? SqlSegment.TRUE : tpq.this.f175627a.mo82443GT(this.f175631a).emit();
        }

        @Override // com.tantanapp.common.data.orm.Filter
        public SqlSegment emitWithPrefix() {
            return tpq.this.f175627a == null ? SqlSegment.TRUE : tpq.this.f175627a.mo82443GT(this.f175631a).emitWithPrefix();
        }

        @Override // com.tantanapp.common.data.orm.Filter
        public boolean filter(T t) {
            if (tpq.this.f175627a == null) {
                return true;
            }
            return tpq.this.f175627a.mo82443GT(this.f175631a).filter(t);
        }
    }

    /* JADX INFO: renamed from: l.tpq$b */
    public class C20374b extends Filter<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DbObject f175633a;

        public C20374b(DbObject dbObject) {
            this.f175633a = dbObject;
        }

        @Override // com.tantanapp.common.data.orm.Filter
        public SqlSegment emit() {
            return tpq.this.f175627a.mo82443GT(this.f175633a).emit();
        }

        @Override // com.tantanapp.common.data.orm.Filter
        public SqlSegment emitWithPrefix() {
            if (tpq.this.f175627a == null || tpq.this.f175628b == null) {
                Order unused = tpq.this.f175627a;
                return tpq.this.f175627a.GT_EQ(this.f175633a).emitWithPrefix();
            }
            DbObject dbObject = (DbObject) this.f175633a.getExtTabData(tpq.this.f175629c);
            StringBuffer stringBuffer = new StringBuffer("( t2.");
            stringBuffer.append(tpq.this.f175628b.column().NAME);
            stringBuffer.append(" > ? AND  t1.");
            stringBuffer.append(tpq.this.f175627a.column().NAME);
            stringBuffer.append(" = ? ) OR  t1.");
            stringBuffer.append(tpq.this.f175627a.column().NAME);
            stringBuffer.append(" > ?");
            return new SqlSegment(stringBuffer.toString(), new String[]{tpq.this.f175628b.column().get(dbObject).toString(), tpq.this.f175627a.column().get(this.f175633a).toString(), tpq.this.f175627a.column().get(this.f175633a).toString()});
        }

        @Override // com.tantanapp.common.data.orm.Filter
        public boolean filter(T t) {
            if (tpq.this.f175627a != null && tpq.this.f175628b != null) {
                return (tpq.this.f175628b.GT_EQ((DbObject) this.f175633a.getExtTabData(tpq.this.f175629c)).filter((DbObject) t.getExtTabData(tpq.this.f175629c)) && tpq.this.f175627a.mo82442EQ(this.f175633a).filter(t)) || tpq.this.f175627a.mo82443GT(this.f175633a).filter(t);
            }
            if (tpq.this.f175627a != null) {
                return tpq.this.f175627a.GT_EQ(this.f175633a).filter(t);
            }
            return tpq.this.f175628b.GT_EQ((DbObject) this.f175633a.getExtTabData(tpq.this.f175629c)).filter((DbObject) t.getExtTabData(tpq.this.f175629c));
        }
    }

    /* JADX INFO: renamed from: l.tpq$c */
    public class C20375c extends Filter<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DbObject f175635a;

        public C20375c(DbObject dbObject) {
            this.f175635a = dbObject;
        }

        @Override // com.tantanapp.common.data.orm.Filter
        public SqlSegment emit() {
            return tpq.this.f175627a.mo82442EQ(this.f175635a).emit();
        }

        @Override // com.tantanapp.common.data.orm.Filter
        public SqlSegment emitWithPrefix() {
            return tpq.this.f175627a.mo82442EQ(this.f175635a).emitWithPrefix();
        }

        @Override // com.tantanapp.common.data.orm.Filter
        public boolean filter(T t) {
            return tpq.this.f175627a.mo82442EQ(this.f175635a).filter(t);
        }
    }

    @Override // com.tantanapp.common.data.orm.Order
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Filter<T> mo82442EQ(T t) {
        return new C20375c(t);
    }

    @Override // com.tantanapp.common.data.orm.Order
    public Column column() {
        return null;
    }

    @Override // com.tantanapp.common.data.orm.Order
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Filter<T> mo82443GT(T t) {
        return new C20373a(t);
    }

    @Override // com.tantanapp.common.data.orm.Order
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Filter<T> GT_EQ(T t) {
        return new C20374b(t);
    }

    @Override // com.tantanapp.common.data.orm.Order
    public String emit() {
        if (this.f175630d) {
            Order<J> order = this.f175628b;
            String strEmit = order == null ? "1=1" : order.emit();
            Order<T> order2 = this.f175627a;
            return TextUtils.join(Constants.SEPARATOR_COMMA, jyb.m147507f0(strEmit, order2 != null ? order2.emit() : "1=1"));
        }
        Order<T> order3 = this.f175627a;
        String strEmit2 = order3 == null ? "1=1" : order3.emit();
        Order<J> order4 = this.f175628b;
        return TextUtils.join(Constants.SEPARATOR_COMMA, jyb.m147507f0(strEmit2, order4 != null ? order4.emit() : "1=1"));
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compare(T t, T t2) {
        Order<T> order = this.f175627a;
        if (order != null && this.f175628b != null) {
            int iCompare = order.compare(t, t2);
            if (iCompare == 0) {
                Object extTabData = t.getExtTabData(this.f175629c);
                Object extTabData2 = t2.getExtTabData(this.f175629c);
                if (extTabData == null && extTabData2 == null) {
                    return 0;
                }
                if (extTabData != null && extTabData2 != null) {
                    return this.f175628b.compare((J) ((DbObject) extTabData), (J) ((DbObject) extTabData2));
                }
                if (extTabData != null) {
                    return 1;
                }
                if (extTabData2 != null) {
                    return -1;
                }
            }
            return iCompare;
        }
        if (order != null) {
            return order.compare(t, t2);
        }
        if (this.f175628b != null) {
            Object extTabData3 = t.getExtTabData(this.f175629c);
            Object extTabData4 = t2.getExtTabData(this.f175629c);
            if (extTabData3 == null && extTabData4 == null) {
                return 0;
            }
            if (extTabData3 != null && extTabData4 != null) {
                return this.f175628b.compare((J) ((DbObject) extTabData3), (J) ((DbObject) extTabData4));
            }
            if (extTabData3 != null) {
                return 1;
            }
            if (extTabData4 != null) {
                return -1;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public Order<J> m192202g() {
        return this.f175628b;
    }

    /* JADX INFO: renamed from: h */
    public Order<T> m192203h() {
        return this.f175627a;
    }
}
