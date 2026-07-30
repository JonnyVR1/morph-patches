package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.orm.Column;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.Order;
import com.tantanapp.common.data.orm.SqlSegment;

/* JADX INFO: loaded from: classes12.dex */
@Deprecated
public class unq<T extends DbObject, J extends DbObject> extends Order<T> {

    /* JADX INFO: renamed from: a */
    public Order<T> f177411a;

    /* JADX INFO: renamed from: b */
    public Order<J> f177412b;

    /* JADX INFO: renamed from: c */
    public Class<J> f177413c;

    /* JADX INFO: renamed from: d */
    public boolean f177414d;

    /* JADX INFO: renamed from: l.unq$a */
    public class C20466a extends Filter<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DbObject f177415a;

        public C20466a(DbObject dbObject) {
            this.f177415a = dbObject;
        }

        @Override // com.tantanapp.common.data.orm.Filter
        public SqlSegment emit() {
            return unq.this.f177411a == null ? SqlSegment.TRUE : unq.this.f177411a.mo81260GT(this.f177415a).emit();
        }

        @Override // com.tantanapp.common.data.orm.Filter
        public SqlSegment emitWithPrefix() {
            return unq.this.f177411a == null ? SqlSegment.TRUE : unq.this.f177411a.mo81260GT(this.f177415a).emitWithPrefix();
        }

        @Override // com.tantanapp.common.data.orm.Filter
        public boolean filter(T t) {
            if (unq.this.f177411a == null) {
                return true;
            }
            return unq.this.f177411a.mo81260GT(this.f177415a).filter(t);
        }
    }

    /* JADX INFO: renamed from: l.unq$b */
    public class C20467b extends Filter<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DbObject f177417a;

        public C20467b(DbObject dbObject) {
            this.f177417a = dbObject;
        }

        @Override // com.tantanapp.common.data.orm.Filter
        public SqlSegment emit() {
            return unq.this.f177411a.mo81260GT(this.f177417a).emit();
        }

        @Override // com.tantanapp.common.data.orm.Filter
        public SqlSegment emitWithPrefix() {
            if (unq.this.f177411a == null || unq.this.f177412b == null) {
                Order unused = unq.this.f177411a;
                return unq.this.f177411a.GT_EQ(this.f177417a).emitWithPrefix();
            }
            DbObject dbObject = (DbObject) this.f177417a.getExtTabData(unq.this.f177413c);
            StringBuffer stringBuffer = new StringBuffer("( t2.");
            stringBuffer.append(unq.this.f177412b.column().NAME);
            stringBuffer.append(" > ? AND  t1.");
            stringBuffer.append(unq.this.f177411a.column().NAME);
            stringBuffer.append(" = ? ) OR  t1.");
            stringBuffer.append(unq.this.f177411a.column().NAME);
            stringBuffer.append(" > ?");
            return new SqlSegment(stringBuffer.toString(), new String[]{unq.this.f177412b.column().get(dbObject).toString(), unq.this.f177411a.column().get(this.f177417a).toString(), unq.this.f177411a.column().get(this.f177417a).toString()});
        }

        @Override // com.tantanapp.common.data.orm.Filter
        public boolean filter(T t) {
            if (unq.this.f177411a != null && unq.this.f177412b != null) {
                return (unq.this.f177412b.GT_EQ((DbObject) this.f177417a.getExtTabData(unq.this.f177413c)).filter((DbObject) t.getExtTabData(unq.this.f177413c)) && unq.this.f177411a.mo81259EQ(this.f177417a).filter(t)) || unq.this.f177411a.mo81260GT(this.f177417a).filter(t);
            }
            if (unq.this.f177411a != null) {
                return unq.this.f177411a.GT_EQ(this.f177417a).filter(t);
            }
            return unq.this.f177412b.GT_EQ((DbObject) this.f177417a.getExtTabData(unq.this.f177413c)).filter((DbObject) t.getExtTabData(unq.this.f177413c));
        }
    }

    /* JADX INFO: renamed from: l.unq$c */
    public class C20468c extends Filter<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DbObject f177419a;

        public C20468c(DbObject dbObject) {
            this.f177419a = dbObject;
        }

        @Override // com.tantanapp.common.data.orm.Filter
        public SqlSegment emit() {
            return unq.this.f177411a.mo81259EQ(this.f177419a).emit();
        }

        @Override // com.tantanapp.common.data.orm.Filter
        public SqlSegment emitWithPrefix() {
            return unq.this.f177411a.mo81259EQ(this.f177419a).emitWithPrefix();
        }

        @Override // com.tantanapp.common.data.orm.Filter
        public boolean filter(T t) {
            return unq.this.f177411a.mo81259EQ(this.f177419a).filter(t);
        }
    }

    @Override // com.tantanapp.common.data.orm.Order
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Filter<T> mo81259EQ(T t) {
        return new C20468c(t);
    }

    @Override // com.tantanapp.common.data.orm.Order
    public Column column() {
        return null;
    }

    @Override // com.tantanapp.common.data.orm.Order
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Filter<T> mo81260GT(T t) {
        return new C20466a(t);
    }

    @Override // com.tantanapp.common.data.orm.Order
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Filter<T> GT_EQ(T t) {
        return new C20467b(t);
    }

    @Override // com.tantanapp.common.data.orm.Order
    public String emit() {
        if (this.f177414d) {
            Order<J> order = this.f177412b;
            String strEmit = order == null ? "1=1" : order.emit();
            Order<T> order2 = this.f177411a;
            return TextUtils.join(Constants.SEPARATOR_COMMA, vwb.m200324f0(strEmit, order2 != null ? order2.emit() : "1=1"));
        }
        Order<T> order3 = this.f177411a;
        String strEmit2 = order3 == null ? "1=1" : order3.emit();
        Order<J> order4 = this.f177412b;
        return TextUtils.join(Constants.SEPARATOR_COMMA, vwb.m200324f0(strEmit2, order4 != null ? order4.emit() : "1=1"));
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compare(T t, T t2) {
        Order<T> order = this.f177411a;
        if (order != null && this.f177412b != null) {
            int iCompare = order.compare(t, t2);
            if (iCompare == 0) {
                Object extTabData = t.getExtTabData(this.f177413c);
                Object extTabData2 = t2.getExtTabData(this.f177413c);
                if (extTabData == null && extTabData2 == null) {
                    return 0;
                }
                if (extTabData != null && extTabData2 != null) {
                    return this.f177412b.compare((J) ((DbObject) extTabData), (J) ((DbObject) extTabData2));
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
        if (this.f177412b != null) {
            Object extTabData3 = t.getExtTabData(this.f177413c);
            Object extTabData4 = t2.getExtTabData(this.f177413c);
            if (extTabData3 == null && extTabData4 == null) {
                return 0;
            }
            if (extTabData3 != null && extTabData4 != null) {
                return this.f177412b.compare((J) ((DbObject) extTabData3), (J) ((DbObject) extTabData4));
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
    public Order<J> m194474g() {
        return this.f177412b;
    }

    /* JADX INFO: renamed from: h */
    public Order<T> m194475h() {
        return this.f177411a;
    }
}
