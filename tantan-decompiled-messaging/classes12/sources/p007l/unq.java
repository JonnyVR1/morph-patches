package p007l;

import android.text.TextUtils;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.orm.Column;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.Order;
import com.tantanapp.common.data.orm.SqlSegment;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
@Deprecated
public class unq<T extends DbObject, J extends DbObject> extends Order<T> {

    /* JADX INFO: renamed from: a */
    public Order<T> f13893a;

    /* JADX INFO: renamed from: b */
    public Order<J> f13894b;

    /* JADX INFO: renamed from: c */
    public Class<J> f13895c;

    /* JADX INFO: renamed from: d */
    public boolean f13896d;

    /* JADX INFO: renamed from: l.unq$a */
    public class C2514a extends Filter<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DbObject f13897a;

        public C2514a(DbObject dbObject) {
            this.f13897a = dbObject;
        }

        public SqlSegment emit() {
            return unq.this.f13893a == null ? SqlSegment.TRUE : unq.this.f13893a.GT(this.f13897a).emit();
        }

        public SqlSegment emitWithPrefix() {
            return unq.this.f13893a == null ? SqlSegment.TRUE : unq.this.f13893a.GT(this.f13897a).emitWithPrefix();
        }

        public boolean filter(T t) {
            if (unq.this.f13893a == null) {
                return true;
            }
            return unq.this.f13893a.GT(this.f13897a).filter(t);
        }
    }

    /* JADX INFO: renamed from: l.unq$b */
    public class C2515b extends Filter<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DbObject f13899a;

        public C2515b(DbObject dbObject) {
            this.f13899a = dbObject;
        }

        public SqlSegment emit() {
            return unq.this.f13893a.GT(this.f13899a).emit();
        }

        public SqlSegment emitWithPrefix() {
            if (unq.this.f13893a == null || unq.this.f13894b == null) {
                Order unused = unq.this.f13893a;
                return unq.this.f13893a.GT_EQ(this.f13899a).emitWithPrefix();
            }
            DbObject dbObject = (DbObject) this.f13899a.getExtTabData(unq.this.f13895c);
            StringBuffer stringBuffer = new StringBuffer("( t2.");
            stringBuffer.append(unq.this.f13894b.column().NAME);
            stringBuffer.append(" > ? AND  t1.");
            stringBuffer.append(unq.this.f13893a.column().NAME);
            stringBuffer.append(" = ? ) OR  t1.");
            stringBuffer.append(unq.this.f13893a.column().NAME);
            stringBuffer.append(" > ?");
            return new SqlSegment(stringBuffer.toString(), new String[]{unq.this.f13894b.column().get(dbObject).toString(), unq.this.f13893a.column().get(this.f13899a).toString(), unq.this.f13893a.column().get(this.f13899a).toString()});
        }

        public boolean filter(T t) {
            if (unq.this.f13893a != null && unq.this.f13894b != null) {
                return (unq.this.f13894b.GT_EQ((DbObject) this.f13899a.getExtTabData(unq.this.f13895c)).filter((DbObject) t.getExtTabData(unq.this.f13895c)) && unq.this.f13893a.EQ(this.f13899a).filter(t)) || unq.this.f13893a.GT(this.f13899a).filter(t);
            }
            if (unq.this.f13893a != null) {
                return unq.this.f13893a.GT_EQ(this.f13899a).filter(t);
            }
            return unq.this.f13894b.GT_EQ((DbObject) this.f13899a.getExtTabData(unq.this.f13895c)).filter((DbObject) t.getExtTabData(unq.this.f13895c));
        }
    }

    /* JADX INFO: renamed from: l.unq$c */
    public class C2516c extends Filter<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DbObject f13901a;

        public C2516c(DbObject dbObject) {
            this.f13901a = dbObject;
        }

        public SqlSegment emit() {
            return unq.this.f13893a.EQ(this.f13901a).emit();
        }

        public SqlSegment emitWithPrefix() {
            return unq.this.f13893a.EQ(this.f13901a).emitWithPrefix();
        }

        public boolean filter(T t) {
            return unq.this.f13893a.EQ(this.f13901a).filter(t);
        }
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Filter<T> m15114EQ(T t) {
        return new C2516c(t);
    }

    public Column column() {
        return null;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Filter<T> m15115GT(T t) {
        return new C2514a(t);
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Filter<T> GT_EQ(T t) {
        return new C2515b(t);
    }

    public String emit() {
        if (this.f13896d) {
            Order<J> order = this.f13894b;
            String strEmit = order == null ? "1=1" : order.emit();
            Order<T> order2 = this.f13893a;
            return TextUtils.join(",", vwb.f0(new String[]{strEmit, order2 != null ? order2.emit() : "1=1"}));
        }
        Order<T> order3 = this.f13893a;
        String strEmit2 = order3 == null ? "1=1" : order3.emit();
        Order<J> order4 = this.f13894b;
        return TextUtils.join(",", vwb.f0(new String[]{strEmit2, order4 != null ? order4.emit() : "1=1"}));
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compare(T t, T t2) {
        Order<T> order = this.f13893a;
        if (order != null && this.f13894b != null) {
            int iCompare = order.compare(t, t2);
            if (iCompare == 0) {
                Object extTabData = t.getExtTabData(this.f13895c);
                Object extTabData2 = t2.getExtTabData(this.f13895c);
                if (extTabData == null && extTabData2 == null) {
                    return 0;
                }
                if (extTabData != null && extTabData2 != null) {
                    return this.f13894b.compare((DbObject) extTabData, (DbObject) extTabData2);
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
        if (this.f13894b != null) {
            Object extTabData3 = t.getExtTabData(this.f13895c);
            Object extTabData4 = t2.getExtTabData(this.f13895c);
            if (extTabData3 == null && extTabData4 == null) {
                return 0;
            }
            if (extTabData3 != null && extTabData4 != null) {
                return this.f13894b.compare((DbObject) extTabData3, (DbObject) extTabData4);
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
    public Order<J> m15120g() {
        return this.f13894b;
    }

    /* JADX INFO: renamed from: h */
    public Order<T> m15121h() {
        return this.f13893a;
    }
}
