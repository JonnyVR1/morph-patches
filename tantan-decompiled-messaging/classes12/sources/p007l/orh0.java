package p007l;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.dbcenter.p002db.opt.TransactionOpt;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.data.orm.Column;
import com.tantanapp.common.data.orm.DoubleOrder;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.Index;
import com.tantanapp.common.data.orm.LongColumn;
import com.tantanapp.common.data.orm.LruCache2;
import com.tantanapp.common.data.orm.Order;
import com.tantanapp.common.data.orm.OrderedColumn;
import com.tantanapp.common.data.orm.SqlSegment;
import com.tantanapp.common.data.orm.StringColumn;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.common.utils.ThreadUtil;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import l.d30;
import l.e30;
import l.f30;
import l.j760;
import l.n11;
import l.ohg0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.xaj0;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class orh0<T extends DbObject> extends LruCache2<String, T> {

    /* JADX INFO: renamed from: l */
    public static boolean f11568l = false;

    /* JADX INFO: renamed from: a */
    public final List<Index> f11569a;

    /* JADX INFO: renamed from: b */
    public final mrf0<T> f11570b;

    /* JADX INFO: renamed from: c */
    public j760<orh0, xaj0<w9j<List<T>, Filter>, v9j<Order>, Integer>> f11571c;

    /* JADX INFO: renamed from: d */
    public final String f11572d;

    /* JADX INFO: renamed from: e */
    public Map<String, zrh0> f11573e;

    /* JADX INFO: renamed from: f */
    public boolean f11574f;

    /* JADX INFO: renamed from: g */
    public ConcurrentHashMap<String, orh0<T>.C2455d> f11575g;

    /* JADX INFO: renamed from: h */
    public ConcurrentHashMap<String, tnq> f11576h;

    /* JADX INFO: renamed from: i */
    public ConcurrentHashMap<String, tnq> f11577i;

    /* JADX INFO: renamed from: j */
    public ConcurrentHashMap<String, orh0<T>.C2454c> f11578j;

    /* JADX INFO: renamed from: k */
    public ConcurrentHashMap<String, orh0<T>.C2453b> f11579k;

    /* JADX INFO: renamed from: l.orh0$a */
    public class C2452a {

        /* JADX INFO: renamed from: a */
        public final String f11580a;

        /* JADX INFO: renamed from: b */
        public final Filter<T> f11581b;

        /* JADX INFO: renamed from: c */
        @NonNull
        public final Order<T> f11582c;

        /* JADX INFO: renamed from: d */
        public final int f11583d;

        /* JADX INFO: renamed from: e */
        public final int f11584e;

        /* JADX INFO: renamed from: f */
        public ConcurrentHashMap<String, orh0<T>.C2452a> f11585f = new ConcurrentHashMap<>();

        /* JADX INFO: renamed from: l.orh0$a$a */
        public class a extends AbstractList<T> {

            /* JADX INFO: renamed from: a */
            public List<T> f11587a = new ArrayList();

            /* JADX INFO: renamed from: b */
            public int f11588b = -1;

            public a() {
            }

            @Override // java.util.AbstractList, java.util.List
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public T get(int i) {
                if (this.f11587a.size() <= i) {
                    List<T> list = this.f11587a;
                    C2452a c2452a = C2452a.this;
                    orh0 orh0Var = orh0.this;
                    Filter<T> filterM12795k = c2452a.m12795k(list);
                    C2452a c2452a2 = C2452a.this;
                    list.addAll(orh0Var.query(filterM12795k, c2452a2.f11582c, c2452a2.m12796l(this.f11587a, i, i == 0 ? 1 : 20)));
                }
                return this.f11587a.get(i);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                if (this.f11588b == -1) {
                    this.f11588b = C2452a.this.m12789e();
                }
                return this.f11588b;
            }
        }

        public C2452a(String str, @NonNull Filter<T> filter, Order<T> order, int i, int i2) {
            n11.d(order);
            this.f11580a = str;
            this.f11581b = filter;
            this.f11582c = order;
            this.f11583d = i;
            this.f11584e = i2;
        }

        /* JADX INFO: renamed from: e */
        public int m12789e() {
            return orh0.this.count(this.f11581b, -1);
        }

        /* JADX INFO: renamed from: f */
        public boolean m12790f() {
            return orh0.this.query(this.f11581b, this.f11582c, 1).size() == 0;
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m12791g(C2455d c2455d, boolean z) {
            orh0.this.f11575g.put(this.f11580a, c2455d);
            c2455d.m12831t(z);
        }

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ void m12792h() {
            orh0<T>.C2455d c2455d = orh0.this.f11575g.get(this.f11580a);
            if (c2455d == null || c2455d.f11602d.h()) {
                return;
            }
            orh0.this.f11575g.remove(this.f11580a);
        }

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ void m12793i() {
            ThreadUtil.h(new Runnable() { // from class: l.nrh0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10857a.m12792h();
                }
            }, 1000L);
        }

        /* JADX INFO: renamed from: j */
        public List<T> m12794j() {
            return new a();
        }

        /* JADX INFO: renamed from: k */
        public Filter<T> m12795k(List<T> list) {
            if (list.size() == 0) {
                return this.f11581b;
            }
            T t = list.get(list.size() - 1);
            Filter<T> filter = this.f11581b;
            return filter instanceof tnq ? tnq.m14577b((tnq) filter, this.f11582c, list.get(list.size() - 1)) : Filter.AND(new Filter[]{filter, this.f11582c.GT_EQ(list.get(list.size() - 1)), DbObject._ID.NEQ(Long.valueOf(((DbObject) t)._id))});
        }

        /* JADX INFO: renamed from: l */
        public int m12796l(List<T> list, int i, int i2) {
            return Math.max(i2, (i - list.size()) + 1);
        }

        /* JADX INFO: renamed from: m */
        public c<List<T>> m12797m() {
            return m12798n(true);
        }

        /* JADX INFO: renamed from: n */
        public c<List<T>> m12798n(final boolean z) {
            final orh0<T>.C2455d c2455d = orh0.this.f11575g.get(this.f11580a);
            if (c2455d == null) {
                c2455d = new C2455d(this);
                orh0.this.f11575g.put(this.f11580a, c2455d);
                Filter<T> filter = this.f11581b;
                if (filter instanceof tnq) {
                    tnq tnqVar = (tnq) filter;
                    orh0.this.f11576h.put(this.f11580a, tnqVar);
                    tnqVar.mo14582g().f11577i.put(this.f11580a, tnqVar);
                }
            }
            return c2455d.f11602d.doOnSubscribe(new d30() { // from class: l.lrh0
                public final void call() {
                    this.f10121a.m12791g(c2455d, z);
                }
            }).doOnUnsubscribe(new d30() { // from class: l.mrh0
                public final void call() {
                    this.f10548a.m12793i();
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.orh0$b */
    public class C2453b {

        /* JADX INFO: renamed from: a */
        public final orh0<T>.C2452a f11590a;

        /* JADX INFO: renamed from: b */
        public final a<Integer> f11591b;

        /* JADX INFO: renamed from: c */
        public boolean f11592c;

        /* JADX INFO: renamed from: d */
        public int f11593d;

        /* JADX INFO: renamed from: a */
        public void m12800a(T t) {
            if (m12803d() == -99 || !this.f11590a.f11581b.filter(t)) {
                return;
            }
            this.f11592c = true;
            this.f11593d = m12803d() - 1;
        }

        /* JADX INFO: renamed from: b */
        public void m12801b(T t) {
            if (m12803d() == -99 || !this.f11590a.f11581b.filter(t)) {
                return;
            }
            this.f11592c = true;
            this.f11593d = m12803d() + 1;
        }

        /* JADX INFO: renamed from: c */
        public void m12802c(T t, T t2) {
            if (m12803d() != -99) {
                if (this.f11590a.f11581b.filter(t) && !this.f11590a.f11581b.filter(t2)) {
                    this.f11593d = m12803d() - 1;
                    this.f11592c = true;
                } else {
                    if (this.f11590a.f11581b.filter(t) || !this.f11590a.f11581b.filter(t2)) {
                        return;
                    }
                    this.f11593d = m12803d() + 1;
                    this.f11592c = true;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public int m12803d() {
            return (this.f11591b.e() == null || this.f11593d != -99) ? this.f11593d : ((Integer) this.f11591b.e()).intValue();
        }

        /* JADX INFO: renamed from: e */
        public void m12804e() {
            if (this.f11592c) {
                this.f11591b.onNext(Integer.valueOf(m12803d()));
                this.f11593d = -99;
                this.f11592c = false;
            }
        }
    }

    /* JADX INFO: renamed from: l.orh0$c */
    public class C2454c {

        /* JADX INFO: renamed from: a */
        public final String f11594a;

        /* JADX INFO: renamed from: c */
        public AtomicInteger f11596c = new AtomicInteger(0);

        /* JADX INFO: renamed from: d */
        public boolean f11597d = false;

        /* JADX INFO: renamed from: b */
        public final a<T> f11595b = a.b();

        public C2454c(String str) {
            this.f11594a = str;
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ DbObject m12808d() {
            return orh0.this.query(this.f11594a);
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m12809e(DbObject dbObject) {
            this.f11596c.set(2);
            if (dbObject != null) {
                orh0.this.cache(dbObject.id, dbObject);
            }
            this.f11595b.onNext(dbObject);
        }

        /* JADX INFO: renamed from: f */
        public void m12810f() {
            if (this.f11597d) {
                this.f11595b.onNext(orh0.this.queryCache(this.f11594a));
                orh0.m12762n("triggered get " + this.f11594a);
                this.f11597d = false;
            }
        }

        /* JADX INFO: renamed from: g */
        public void m12811g(boolean z) {
            if (this.f11596c.compareAndSet(0, 1)) {
                DbObject dbObject = (DbObject) orh0.this.cached(this.f11594a);
                if (dbObject != null) {
                    this.f11596c.set(2);
                    this.f11595b.onNext(dbObject);
                    return;
                }
                if (!z || orh0.f11568l) {
                    this.f11596c.set(2);
                    this.f11595b.onNext(orh0.this.queryCache(this.f11594a));
                    return;
                }
                orh0.this.m12771j(false, new v9j() { // from class: l.prh0
                    public final Object call() {
                        return this.f11970a.m12808d();
                    }
                }, new e30() { // from class: l.qrh0
                    public final void call(Object obj) {
                        this.f12355a.m12809e((DbObject) obj);
                    }
                }, null, true, "uiget_" + orh0.this.f11572d + "_" + this.f11594a);
            }
        }
    }

    public orh0(b8c b8cVar, String str, mrf0<T> mrf0Var, List<Index> list, int i) {
        super(i);
        this.f11571c = null;
        this.f11573e = null;
        this.f11574f = true;
        this.f11575g = new ConcurrentHashMap<>();
        this.f11576h = new ConcurrentHashMap<>();
        this.f11577i = new ConcurrentHashMap<>();
        this.f11578j = new ConcurrentHashMap<>();
        this.f11579k = new ConcurrentHashMap<>();
        this.f11572d = str;
        this.f11570b = mrf0Var;
        list = list == null ? new ArrayList<>() : list;
        this.f11569a = list;
        list.add(new Index(new Column[]{DbObject.ID}));
        if (b8cVar != null) {
            b8cVar.mo8748f().add(this);
        }
    }

    /* JADX INFO: renamed from: q */
    public static String m12763q(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("EXPLAIN QUERY PLAN " + str, strArr);
        if (!cursorRawQuery.moveToFirst()) {
            cursorRawQuery.close();
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cursorRawQuery.getColumnCount(); i++) {
            sb.append(cursorRawQuery.getColumnName(i));
            sb.append(":");
            sb.append(cursorRawQuery.getString(i));
            sb.append(", ");
        }
        return "EXPLAIN: \n\t".concat(sb.toString());
    }

    /* JADX INFO: renamed from: A */
    public TransactionOpt m12765A() {
        return f8c.m10082o().m10097q();
    }

    /* JADX INFO: renamed from: B */
    public final void m12766B(T t, T t2) {
        ConcurrentHashMap<String, tnq> concurrentHashMap = this.f11576h;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<String, tnq>> it = this.f11576h.entrySet().iterator();
        while (it.hasNext()) {
            tnq value = it.next().getValue();
            DbObject dbObjectQuery = value.mo14582g().query(((DbObject) t2).id);
            if (dbObjectQuery != null) {
                value.mo14582g().cache(dbObjectQuery.id, dbObjectQuery);
                if (t != null) {
                    t.addExtraData(dbObjectQuery);
                }
                t2.addExtraData(dbObjectQuery);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    public final void m12767C(T t, T t2) {
        ConcurrentHashMap<String, tnq> concurrentHashMap = this.f11577i;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<String, tnq>> it = this.f11577i.entrySet().iterator();
        while (it.hasNext()) {
            tnq value = it.next().getValue();
            DbObject dbObjectQuery = value.mo14579d().query(((DbObject) t2).id);
            if (m12774m(value.mo14581f(), t) || m12774m(value.mo14581f(), t2)) {
                if (dbObjectQuery != null && (value.baseFilter() == null || value.baseFilter().filter(dbObjectQuery))) {
                    try {
                        DbObject dbObjectClone = dbObjectQuery.clone();
                        dbObjectQuery.addExtraData(t2);
                        dbObjectClone.addExtraData(t);
                        m12765A().update(value.mo14579d(), dbObjectClone, dbObjectQuery);
                    } catch (Exception e) {
                        CrashHelper.c(e);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D */
    public final void m12768D(T t) {
        ConcurrentHashMap<String, tnq> concurrentHashMap = this.f11577i;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<String, tnq>> it = this.f11577i.entrySet().iterator();
        while (it.hasNext()) {
            tnq value = it.next().getValue();
            DbObject dbObjectQuery = (DbObject) value.mo14579d().cached(((DbObject) t).id);
            if (dbObjectQuery == null) {
                dbObjectQuery = value.mo14579d().query(((DbObject) t).id);
            }
            if (dbObjectQuery != null && (value.baseFilter() == null || value.baseFilter().filter(dbObjectQuery))) {
                try {
                    DbObject dbObjectClone = dbObjectQuery.clone();
                    DbObject dbObjectClone2 = dbObjectQuery.clone();
                    dbObjectClone.setExtList(dbObjectQuery.getExtList());
                    dbObjectClone2.setExtList(dbObjectQuery.getExtList());
                    dbObjectClone2.removeExtTable(t);
                    m12765A().joinUpdate(value.mo14579d(), dbObjectClone, dbObjectClone2);
                } catch (Exception e) {
                    CrashHelper.c(e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m12769E(T t) {
        DbObject dbObject;
        if (this.f11576h.size() > 0) {
            for (tnq tnqVar : this.f11576h.values()) {
                if (tnqVar.baseFilter() == null || tnqVar.baseFilter().filter(t)) {
                    if (!TextUtils.isEmpty((String) tnqVar.foreignC().get(t)) && (dbObject = (DbObject) tnqVar.mo14579d().cached(((DbObject) t).id)) != null) {
                        t.setExtTabList(dbObject.getExtList());
                    }
                }
            }
        }
    }

    public final <K extends DbObject> int binarySearchUsingLocalId(List<K> list, K k, Order<K> order) {
        int iBinarySearch = Collections.binarySearch(list, k, order);
        if (iBinarySearch < 0) {
            return iBinarySearch;
        }
        for (int i = iBinarySearch; i >= 0; i--) {
            K k2 = list.get(i);
            if (k2 != null && ((DbObject) k2)._id == ((DbObject) k)._id) {
                return i;
            }
            if (order.compare(k2, k) != 0) {
                break;
            }
        }
        for (int i2 = iBinarySearch + 1; i2 < list.size(); i2++) {
            K k3 = list.get(i2);
            if (k3 != null && ((DbObject) k3)._id == ((DbObject) k)._id) {
                return i2;
            }
            if (order.compare(k3, k) != 0) {
                break;
            }
        }
        return (-iBinarySearch) - 1;
    }

    public final void cacheQueryJoinData(T t) {
        DbObject dbObjectQuery;
        if (this.f11576h.size() > 0) {
            Iterator<Map.Entry<String, tnq>> it = this.f11576h.entrySet().iterator();
            while (it.hasNext()) {
                tnq value = it.next().getValue();
                if (value.baseFilter() == null || value.baseFilter().filter(t)) {
                    if (!TextUtils.isEmpty((String) value.foreignC().get(t)) && (dbObjectQuery = value.mo14582g().query((String) value.foreignC().get(t))) != null) {
                        t.addExtraData(dbObjectQuery);
                        value.mo14582g().cache(dbObjectQuery.id, dbObjectQuery);
                    }
                }
            }
            for (tnq tnqVar : this.f11576h.values()) {
            }
        }
    }

    public int count(Filter<T> filter, int i) {
        String str;
        Cursor cursorRawQuery;
        System.nanoTime();
        SqlSegment sqlSegmentEmit = filter == null ? SqlSegment.NULL : filter.emit();
        if (filter instanceof tnq) {
            cursorRawQuery = m12775o().rawQuery(((tnq) filter).countSql(), sqlSegmentEmit.args);
        } else {
            SQLiteDatabase sQLiteDatabaseM12775o = m12775o();
            StringBuilder sb = new StringBuilder("select count(_id) from ");
            sb.append(this.f11572d);
            sb.append(" ");
            if (sqlSegmentEmit.part == null) {
                str = "";
            } else {
                str = " WHERE " + sqlSegmentEmit.part;
            }
            sb.append(str);
            cursorRawQuery = sQLiteDatabaseM12775o.rawQuery(sb.toString(), sqlSegmentEmit.args);
        }
        try {
            int i2 = cursorRawQuery.moveToFirst() ? cursorRawQuery.getInt(0) : -1;
            if (i <= 0 || i2 <= i) {
                i = i2;
            }
            return i;
        } finally {
            cursorRawQuery.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void delete(Filter filter) {
        System.nanoTime();
        SqlSegment sqlSegmentEmit = filter == null ? SqlSegment.NULL : filter.emit();
        Cursor cursorRawQuery = filter instanceof tnq ? m12775o().rawQuery(((tnq) filter).querySql(null, -1), sqlSegmentEmit.args) : m12775o().query(this.f11572d, (String[]) null, sqlSegmentEmit.part, sqlSegmentEmit.args, (String) null, (String) null, (String) null);
        ArrayList<DbObject> arrayList = new ArrayList();
        while (cursorRawQuery.moveToNext()) {
            try {
                arrayList.add(this.f11570b.read(cursorRawQuery, 0));
            } catch (Throwable th) {
                cursorRawQuery.close();
                throw th;
            }
        }
        cursorRawQuery.close();
        m12775o().delete(this.f11572d, sqlSegmentEmit.part, sqlSegmentEmit.args);
        for (DbObject dbObject : arrayList) {
            m12768D(dbObject);
            m12769E(dbObject);
            m12765A().delete(this, dbObject);
        }
    }

    public void deleteAll() {
        delete(Filter.TRUE);
    }

    /* JADX INFO: renamed from: i */
    public <T> void m12770i(boolean z, v9j<T> v9jVar, e30<T> e30Var, d30 d30Var, String str) {
        f8c.m10082o().m10087d(z, v9jVar, e30Var, d30Var, str);
    }

    public void insert(T t) {
        m12777s(t, false);
    }

    /* JADX INFO: renamed from: j */
    public <T> void m12771j(boolean z, v9j<T> v9jVar, e30<T> e30Var, d30 d30Var, boolean z2, String str) {
        f8c.m10082o().m10088e(z, v9jVar, e30Var, d30Var, z2, str);
    }

    /* JADX INFO: renamed from: k */
    public final <K extends DbObject> int m12772k(List<K> list, K k, Order<K> order) {
        int iBinarySearch = Collections.binarySearch(list, k, order);
        if (iBinarySearch < 0) {
            return iBinarySearch;
        }
        for (int i = iBinarySearch; i >= 0; i--) {
            K k2 = list.get(i);
            if (k2 != null && ((DbObject) k2)._id == ((DbObject) k)._id) {
                return i;
            }
            if (order.compare(k2, k) != 0) {
                break;
            }
        }
        for (int i2 = iBinarySearch + 1; i2 < list.size(); i2++) {
            K k3 = list.get(i2);
            if (k3 != null && ((DbObject) k3)._id == ((DbObject) k)._id) {
                return i2;
            }
            if (order.compare(k3, k) != 0) {
                break;
            }
        }
        return (-iBinarySearch) - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public void m12773l(T t) {
        ConcurrentHashMap<String, tnq> concurrentHashMap = this.f11577i;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<String, tnq>> it = this.f11577i.entrySet().iterator();
        while (it.hasNext()) {
            tnq value = it.next().getValue();
            DbObject dbObjectQuery = (DbObject) value.mo14579d().cached(((DbObject) t).id);
            if (dbObjectQuery == null) {
                dbObjectQuery = value.mo14579d().query(((DbObject) t).id);
            }
            if (dbObjectQuery != null && (value.baseFilter() == null || value.baseFilter().filter(dbObjectQuery))) {
                try {
                    DbObject dbObjectClone = dbObjectQuery.clone();
                    DbObject dbObjectClone2 = dbObjectQuery.clone();
                    dbObjectClone.setExtList(dbObjectQuery.getExtList());
                    dbObjectClone2.setExtList(dbObjectQuery.getExtList());
                    dbObjectClone2.addExtraData(t);
                    m12765A().update(value.mo14579d(), dbObjectClone, dbObjectClone2);
                } catch (Exception e) {
                    CrashHelper.c(e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m12774m(Filter filter, T t) {
        if (filter == null) {
            return true;
        }
        if (t == null) {
            return false;
        }
        return filter.filter(t);
    }

    /* JADX INFO: renamed from: o */
    public SQLiteDatabase m12775o() {
        return f8c.m10082o().m10090h();
    }

    /* JADX INFO: renamed from: p */
    public void m12776p() {
        f8c.m10082o().m10095m();
    }

    public T query(String str) {
        n11.h(str != null);
        List<T> listQuery = query(DbObject.ID.EQ(str), null, 1);
        if (listQuery.isEmpty()) {
            return null;
        }
        return listQuery.get(0);
    }

    public List<T> queryCache(Filter<T> filter, Order<T> order, int i) {
        String str;
        Cursor cursorQuery;
        System.nanoTime();
        SqlSegment sqlSegmentEmit = filter == null ? SqlSegment.NULL : filter.emit();
        if (i > 0) {
            str = "" + i;
        } else {
            str = null;
        }
        m12776p();
        if (filter instanceof tnq) {
            cursorQuery = m12775o().rawQuery(((tnq) filter).querySql(order, i), sqlSegmentEmit.args);
        } else {
            cursorQuery = m12775o().query(this.f11572d, (String[]) null, sqlSegmentEmit.part, sqlSegmentEmit.args, (String) null, (String) null, order != null ? order.emit() : null, str);
        }
        ArrayList arrayList = new ArrayList(10);
        try {
            int columnIndex = cursorQuery.getColumnIndex(((Column) DbObject.ID).NAME);
            if (columnIndex >= 0) {
                while (cursorQuery.moveToNext()) {
                    if (!cursorQuery.isNull(columnIndex)) {
                        String string = cursorQuery.getString(columnIndex);
                        T t = (DbObject) cached(string);
                        if (t == null) {
                            t = this.f11570b.read(cursorQuery, 0);
                            if (filter instanceof tnq) {
                                tnq tnqVar = (tnq) filter;
                                ValueObject valueObject = tnqVar.mo14582g().f11570b.read(cursorQuery, this.f11570b.getReadIndex());
                                if (!tnqVar.mo14582g().f11570b.init().equals(valueObject)) {
                                    t.addExtraData(valueObject);
                                }
                            }
                            cache(string, t);
                        }
                        arrayList.add(t);
                    }
                }
            }
            return arrayList;
        } finally {
            cursorQuery.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public void m12777s(T t, boolean z) {
        if (z) {
            ArrayList<DbObject> extList = t.getExtList();
            if (!vwb.J(extList)) {
                for (DbObject dbObject : extList) {
                    orh0 orh0VarM10096n = f8c.m10082o().m10096n(this.f11572d, dbObject);
                    if (orh0VarM10096n != 0 && (dbObject instanceof DbObject)) {
                        orh0VarM10096n.insert(dbObject);
                    }
                }
            }
        }
        System.nanoTime();
        ContentValues contentValues = new ContentValues();
        this.f11570b.write(t, contentValues);
        ((DbObject) t)._id = m12775o().insert(this.f11572d, (String) null, contentValues);
        m12773l(t);
        m12765A().insert(this, t);
        cacheQueryJoinData(t);
    }

    public <E extends Comparable<E>> int sum(Filter<T> filter, OrderedColumn<T, E> orderedColumn) {
        String str;
        System.nanoTime();
        SqlSegment sqlSegmentEmit = filter == null ? SqlSegment.NULL : filter.emit();
        SQLiteDatabase sQLiteDatabaseM12775o = m12775o();
        StringBuilder sb = new StringBuilder("SELECT SUM(");
        sb.append(((Column) orderedColumn).NAME);
        sb.append(") FROM ");
        sb.append(this.f11572d);
        sb.append(" ");
        if (sqlSegmentEmit.part == null) {
            str = "";
        } else {
            str = " WHERE " + sqlSegmentEmit.part;
        }
        sb.append(str);
        Cursor cursorRawQuery = sQLiteDatabaseM12775o.rawQuery(sb.toString(), sqlSegmentEmit.args);
        try {
            return cursorRawQuery.moveToFirst() ? cursorRawQuery.getInt(0) : -1;
        } finally {
            cursorRawQuery.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void syncUiCache(List<er4> list) {
        DbObject dbObject;
        orh0<T>.C2454c c2454c;
        DbObject dbObject2;
        if (list != null) {
            try {
                for (er4 er4Var : list) {
                    m12762n("syncing " + this.f11572d + " " + er4Var.f7460a);
                    int i = er4Var.f7460a;
                    if (i == 0) {
                        DbObject dbObject3 = er4Var.f7461b;
                        Iterator<orh0<T>.C2455d> it = this.f11575g.values().iterator();
                        while (it.hasNext()) {
                            it.next().m12826o(dbObject3);
                        }
                        Iterator<orh0<T>.C2453b> it2 = this.f11579k.values().iterator();
                        while (it2.hasNext()) {
                            it2.next().m12800a(dbObject3);
                        }
                        remove(dbObject3.id);
                    } else if (i == 1) {
                        DbObject dbObject4 = er4Var.f7461b;
                        Iterator<orh0<T>.C2455d> it3 = this.f11575g.values().iterator();
                        while (it3.hasNext()) {
                            it3.next().m12827p(dbObject4);
                        }
                        Iterator<orh0<T>.C2453b> it4 = this.f11579k.values().iterator();
                        while (it4.hasNext()) {
                            it4.next().m12801b(dbObject4);
                        }
                        cache(dbObject4.id, dbObject4);
                    } else if (i == 2) {
                        DbObject dbObject5 = er4Var.f7461b;
                        DbObject dbObject6 = er4Var.f7462c;
                        Iterator<orh0<T>.C2455d> it5 = this.f11575g.values().iterator();
                        while (it5.hasNext()) {
                            it5.next().m12828q(dbObject5, dbObject6);
                        }
                        Iterator<orh0<T>.C2453b> it6 = this.f11579k.values().iterator();
                        while (it6.hasNext()) {
                            it6.next().m12802c(dbObject5, dbObject6);
                        }
                        if (NullChecker.a(dbObject5) && TextUtils.isEmpty(dbObject5.id)) {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("update table id error :" + this.f11572d);
                            stringBuffer.append(", detail: " + dbObject5.toJson());
                            stringBuffer.append(" , new id: ");
                            stringBuffer.append(dbObject6.id);
                            CrashHelper.c(new RuntimeException(stringBuffer.toString()));
                        }
                        if (TextUtils.isEmpty(dbObject5.id) || dbObject5.id.equals(dbObject6.id)) {
                            cache(dbObject6.id, dbObject6);
                        } else {
                            remove(dbObject5.id);
                        }
                    } else if (i == 3) {
                        DbObject dbObject7 = er4Var.f7461b;
                        DbObject dbObject8 = er4Var.f7462c;
                        Iterator<orh0<T>.C2455d> it7 = this.f11575g.values().iterator();
                        while (it7.hasNext()) {
                            it7.next().m12828q(dbObject7, dbObject8);
                        }
                        Iterator<orh0<T>.C2453b> it8 = this.f11579k.values().iterator();
                        while (it8.hasNext()) {
                            it8.next().m12802c(dbObject7, dbObject8);
                        }
                        if (!dbObject7.id.equals(dbObject8.id)) {
                            remove(dbObject7.id);
                        } else if (cached(dbObject8.id) != null) {
                            cache(dbObject8.id, dbObject8);
                        }
                    }
                    DbObject dbObject9 = er4Var.f7461b;
                    if (dbObject9 != null && !TextUtils.isEmpty(dbObject9.id) && (c2454c = this.f11578j.get(er4Var.f7461b.id)) != null && ((dbObject2 = er4Var.f7462c) == null || !er4Var.f7461b.equals(dbObject2))) {
                        c2454c.f11597d = true;
                    }
                    DbObject dbObject10 = er4Var.f7462c;
                    if (dbObject10 != null && ((dbObject = er4Var.f7461b) == null || !TextUtils.equals(dbObject.id, dbObject10.id))) {
                        orh0<T>.C2454c c2454c2 = this.f11578j.get(er4Var.f7462c.id);
                        if (c2454c2 != null) {
                            DbObject dbObject11 = er4Var.f7461b;
                            if (dbObject11 == null) {
                                c2454c2.f11597d = true;
                            } else if (!er4Var.f7462c.equals(dbObject11)) {
                                c2454c2.f11597d = true;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                CrashHelper.c(th);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m12778t(String str, C2454c c2454c, boolean z) {
        this.f11578j.put(str, c2454c);
        c2454c.m12811g(z);
    }

    public void triggerMergeUpdates() {
        Iterator<orh0<T>.C2455d> it = this.f11575g.values().iterator();
        while (it.hasNext()) {
            it.next().m12829r();
        }
        Iterator<orh0<T>.C2453b> it2 = this.f11579k.values().iterator();
        while (it2.hasNext()) {
            it2.next().m12804e();
        }
        Iterator<orh0<T>.C2454c> it3 = this.f11578j.values().iterator();
        while (it3.hasNext()) {
            it3.next().m12810f();
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m12779u(String str) {
        orh0<T>.C2454c c2454c = this.f11578j.get(str);
        if (c2454c == null || c2454c.f11595b.h()) {
            return;
        }
        this.f11578j.remove(str);
    }

    public c<T> uiGet(final String str, final boolean z) {
        n11.h(str != null);
        final orh0<T>.C2454c c2454c = this.f11578j.get(str);
        if (c2454c == null) {
            c2454c = new C2454c(str);
            this.f11578j.put(str, c2454c);
        }
        return c2454c.f11595b.doOnSubscribe(new d30() { // from class: l.frh0
            public final void call() {
                this.f8236a.m12778t(str, c2454c, z);
            }
        }).doOnUnsubscribe(new d30() { // from class: l.grh0
            public final void call() {
                this.f8506a.m12780v(str);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void update(List<j760<Column, Object>> list, Filter filter) {
        System.nanoTime();
        SqlSegment sqlSegmentEmit = filter == null ? SqlSegment.NULL : filter.emit();
        Cursor cursorRawQuery = filter instanceof tnq ? m12775o().rawQuery(((tnq) filter).querySql(null, -1), sqlSegmentEmit.args) : m12775o().query(this.f11572d, (String[]) null, sqlSegmentEmit.part, sqlSegmentEmit.args, (String) null, (String) null, (String) null);
        ArrayList<DbObject> arrayList = new ArrayList();
        while (cursorRawQuery.moveToNext()) {
            try {
                arrayList.add(this.f11570b.read(cursorRawQuery, 0));
            } catch (Throwable th) {
                cursorRawQuery.close();
                throw th;
            }
        }
        cursorRawQuery.close();
        if (arrayList.size() > 0) {
            ContentValues contentValues = new ContentValues();
            for (j760<Column, Object> j760Var : list) {
                ((Column) j760Var.a).put(contentValues, j760Var.b);
            }
            m12775o().update(this.f11572d, contentValues, sqlSegmentEmit.part, sqlSegmentEmit.args);
            for (DbObject dbObject : arrayList) {
                try {
                    DbObject dbObjectClone = dbObject.clone();
                    for (j760<Column, Object> j760Var2 : list) {
                        ((Column) j760Var2.a).set(dbObjectClone, j760Var2.b);
                    }
                    m12766B(dbObject, dbObjectClone);
                    m12767C(dbObject, dbObjectClone);
                    m12765A().update(this, dbObject, dbObjectClone);
                } catch (CloneNotSupportedException e) {
                    CrashHelper.c(e);
                }
            }
        }
    }

    public void updateBy_id(T t) {
        System.nanoTime();
        SQLiteDatabase sQLiteDatabaseM12775o = m12775o();
        String str = this.f11572d;
        StringBuilder sb = new StringBuilder();
        LongColumn longColumn = DbObject._ID;
        sb.append(longColumn);
        sb.append(" = ?");
        Cursor cursorQuery = sQLiteDatabaseM12775o.query(str, (String[]) null, sb.toString(), new String[]{Long.toString(((DbObject) t)._id)}, (String) null, (String) null, (String) null);
        try {
            T t2 = cursorQuery.moveToNext() ? this.f11570b.read(cursorQuery, 0) : null;
            cursorQuery.close();
            if (t2 != null) {
                ContentValues contentValues = new ContentValues();
                this.f11570b.write(t, contentValues);
                m12775o().update(this.f11572d, contentValues, longColumn + " = ?", new String[]{Long.toString(((DbObject) t)._id)});
                m12765A().update(this, t2, t);
            }
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    public T upsert(T t, f30<T, T> f30Var) {
        System.nanoTime();
        SQLiteDatabase sQLiteDatabaseM12775o = m12775o();
        String str = this.f11572d;
        StringBuilder sb = new StringBuilder();
        StringColumn stringColumn = DbObject.ID;
        sb.append(stringColumn);
        sb.append(" = ?");
        Cursor cursorQuery = sQLiteDatabaseM12775o.query(str, (String[]) null, sb.toString(), new String[]{((DbObject) t).id}, (String) null, (String) null, (String) null);
        try {
            T t2 = cursorQuery.moveToNext() ? this.f11570b.read(cursorQuery, 0) : null;
            cursorQuery.close();
            if (t2 == null) {
                if (f30Var != null) {
                    f30Var.call(t, (Object) null);
                }
                ContentValues contentValues = new ContentValues();
                this.f11570b.write(t, contentValues);
                ((DbObject) t)._id = m12775o().insert(this.f11572d, (String) null, contentValues);
                m12773l(t);
                m12765A().insert(this, t);
                cacheQueryJoinData(t);
                return t;
            }
            ((DbObject) t)._id = ((DbObject) t2)._id;
            if (f30Var != null) {
                f30Var.call(t, t2);
            }
            t.mergeData(t2);
            if (!t2.equals(t)) {
                ContentValues contentValues2 = new ContentValues();
                this.f11570b.write(t, contentValues2);
                if (m12775o().update(this.f11572d, contentValues2, stringColumn + " = ?", new String[]{((DbObject) t).id}) > 0) {
                    m12766B(t2, t);
                    m12767C(t2, t);
                    m12765A().update(this, t2, t);
                }
            }
            return t;
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m12780v(final String str) {
        ThreadUtil.h(new Runnable() { // from class: l.irh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9124a.m12779u(str);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ List m12781w(int i) {
        return query(null, null, i);
    }

    public void warmUp(final int i, int i2) {
        ThreadUtil.h(new Runnable() { // from class: l.hrh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8811a.m12783y(i);
            }
        }, i2);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m12782x(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DbObject dbObject = (DbObject) it.next();
            cache(dbObject.id, dbObject);
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m12783y(final int i) {
        f8c.m10082o().m10087d(false, new v9j() { // from class: l.jrh0
            public final Object call() {
                return this.f9509a.m12781w(i);
            }
        }, new e30() { // from class: l.krh0
            public final void call(Object obj) {
                this.f9781a.m12782x((List) obj);
            }
        }, null, "warmUp_" + this.f11572d);
    }

    /* JADX INFO: renamed from: z */
    public List<T> m12784z(Filter<T> filter, Order<T> order, int i, boolean z) {
        String str;
        Cursor cursorQuery;
        String str2;
        if (z && !f8c.m10082o().m10098r()) {
            return new ArrayList();
        }
        System.nanoTime();
        SqlSegment sqlSegmentEmit = filter == null ? SqlSegment.NULL : filter.emit();
        String str3 = "";
        if (i > 0) {
            str = "" + i;
        } else {
            str = null;
        }
        boolean z2 = filter instanceof tnq;
        if (z2) {
            cursorQuery = m12775o().rawQuery(((tnq) filter).querySql(order, i), sqlSegmentEmit.args);
        } else {
            cursorQuery = m12775o().query(this.f11572d, (String[]) null, sqlSegmentEmit.part, sqlSegmentEmit.args, (String) null, (String) null, order != null ? order.emit() : null, str);
        }
        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
        if (z2) {
            ((tnq) filter).querySql(order, i);
        } else {
            SQLiteDatabase sQLiteDatabaseM12775o = m12775o();
            StringBuilder sb = new StringBuilder("SELECT * FROM ");
            sb.append(this.f11572d);
            if (sqlSegmentEmit.part == null) {
                str2 = "";
            } else {
                str2 = " WHERE " + sqlSegmentEmit.part;
            }
            sb.append(str2);
            if (order != null) {
                str3 = " ORDER BY " + order.emit();
            }
            sb.append(str3);
            m12763q(sQLiteDatabaseM12775o, sb.toString(), sqlSegmentEmit.args);
        }
        while (cursorQuery.moveToNext()) {
            try {
                T t = this.f11570b.read(cursorQuery, 0);
                arrayList.add(t);
                if (filter instanceof tnq) {
                    tnq tnqVar = (tnq) filter;
                    ValueObject valueObject = tnqVar.mo14582g().f11570b.read(cursorQuery, this.f11570b.getReadIndex());
                    if (tnqVar.mo14582g().f11570b.init().equals(valueObject)) {
                        continue;
                    } else {
                        t.addExtraData(valueObject);
                    }
                }
            } finally {
                cursorQuery.close();
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l.orh0$d */
    public class C2455d {

        /* JADX INFO: renamed from: a */
        public final orh0<T>.C2452a f11599a;

        /* JADX INFO: renamed from: b */
        public orh0<T>.C2455d.a f11600b = null;

        /* JADX INFO: renamed from: c */
        public boolean f11601c = false;

        /* JADX INFO: renamed from: e */
        public AtomicInteger f11603e = new AtomicInteger(0);

        /* JADX INFO: renamed from: d */
        public rx.subjects.a<orh0<T>.C2455d.a> f11602d = rx.subjects.a.b();

        public C2455d(orh0<T>.C2452a c2452a) {
            this.f11599a = c2452a;
            if (c2452a.f11582c instanceof DoubleOrder) {
                orh0.this.m12776p();
            }
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ String m12814c(tnq tnqVar, DbObject dbObject) {
            return (String) tnqVar.foreignC().get(dbObject);
        }

        /* JADX INFO: renamed from: h */
        public final boolean m12819h(T t) {
            return m12820i(t, false);
        }

        /* JADX INFO: renamed from: i */
        public final boolean m12820i(T t, boolean z) {
            Filter<T> filter = this.f11599a.f11581b;
            if (!(filter instanceof tnq)) {
                return filter == null || filter.filter(t);
            }
            tnq tnqVar = (tnq) filter;
            if (TextUtils.isEmpty((String) tnqVar.foreignC().get(t))) {
                return false;
            }
            DbObject dbObject = (DbObject) t.getExtTabData(tnqVar.mo14582g().f11570b.getDataClass());
            tnqVar.mo14580e();
            if (!z) {
                return tnqVar.filter(t, dbObject);
            }
            if (tnqVar.baseFilter() == null) {
                return true;
            }
            return tnqVar.baseFilter().filter(t);
        }

        /* JADX INFO: renamed from: j */
        public orh0<T>.C2455d.a m12821j() {
            orh0<T>.C2455d.a aVar = this.f11600b;
            return aVar == null ? (a) this.f11602d.e() : aVar;
        }

        /* JADX INFO: renamed from: k */
        public orh0<T>.C2455d.a m12822k() {
            if (this.f11600b == null && this.f11602d.e() != null) {
                this.f11600b = new a((a) this.f11602d.e());
                orh0.m12762n(this.f11599a.f11580a + " temp items created for write");
            }
            return this.f11600b;
        }

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ xaj0 m12823l() {
            ArrayList arrayList;
            orh0<T>.C2452a c2452a = this.f11599a;
            int i = c2452a.f11583d;
            if (i <= 0) {
                i = c2452a.f11584e;
            }
            n11.h(i > 0);
            orh0 orh0Var = orh0.this;
            orh0<T>.C2452a c2452a2 = this.f11599a;
            List<T> listQuery = orh0Var.query(c2452a2.f11581b, c2452a2.f11582c, i);
            int size = listQuery.size() < i ? listQuery.size() : this.f11599a.m12789e();
            if (size == 0) {
                arrayList = new ArrayList();
            } else {
                ArrayList arrayList2 = new ArrayList();
                j760<orh0, xaj0<w9j<List<T>, Filter>, v9j<Order>, Integer>> j760Var = orh0.this.f11571c;
                if (j760Var != null) {
                    arrayList2.add(vwb.Y((orh0) orh0.this.f11571c.a, ((orh0) j760Var.a).query((Filter) ((w9j) ((xaj0) j760Var.b).a).call(listQuery), (Order) ((v9j) ((xaj0) orh0.this.f11571c.b).b).call(), ((Integer) ((xaj0) orh0.this.f11571c.b).c).intValue())));
                }
                j760<orh0, List> j760VarM12825n = m12825n(listQuery);
                if (j760VarM12825n != null) {
                    arrayList2.add(j760VarM12825n);
                }
                arrayList = arrayList2;
            }
            return xaj0.a(Integer.valueOf(size), listQuery, arrayList);
        }

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ void m12824m(xaj0 xaj0Var) {
            this.f11603e.set(2);
            for (DbObject dbObject : (List) xaj0Var.b) {
                orh0.this.cache(dbObject.id, dbObject);
            }
            m12830s((List) xaj0Var.c);
            if (this.f11602d.e() == null) {
                a aVar = new a();
                aVar.f11606b = (List) xaj0Var.b;
                aVar.f11605a = ((Integer) xaj0Var.a).intValue();
                aVar.f11607c = aVar.f11606b.size() == aVar.f11605a;
                this.f11602d.onNext(aVar);
            }
        }

        /* JADX INFO: renamed from: n */
        public final j760<orh0, List> m12825n(List<T> list) {
            Filter<T> filter = this.f11599a.f11581b;
            if (filter instanceof tnq) {
                final tnq tnqVar = (tnq) filter;
                j760<orh0, xaj0<w9j<List<T>, Filter>, v9j<Order>, Integer>> j760Var = orh0.this.f11571c;
                if (j760Var == null || j760Var.a != tnqVar.mo14582g()) {
                    List listT = vwb.T(vwb.n(list, new w9j() { // from class: l.trh0
                        public final Object call(Object obj) {
                            return Boolean.valueOf(!TextUtils.isEmpty((String) tnqVar.foreignC().get((DbObject) obj)));
                        }
                    }), new w9j() { // from class: l.urh0
                        public final Object call(Object obj) {
                            return orh0.C2455d.m12814c(tnqVar, (DbObject) obj);
                        }
                    });
                    orh0.m12762n("cache join ids -> ids= " + TextUtils.join(",", listT));
                    List<T> listQuery = tnqVar.mo14582g().query(DbObject.ID.IN(listT), null, -1);
                    orh0.m12762n("cache join data size -> size " + listQuery.size());
                    return vwb.Y(tnqVar.mo14582g(), listQuery);
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: o */
        public void m12826o(T t) {
            int iBinarySearchUsingLocalId;
            orh0<T>.C2455d.a aVarM12821j = m12821j();
            orh0.m12762n(this.f11599a.f11580a + " sync cache delete");
            Filter<T> filter = this.f11599a.f11581b;
            if (filter instanceof tnq) {
                ((tnq) filter).mo14582g().queryCache(((DbObject) t).id);
            }
            if (aVarM12821j == null || !m12820i(t, true)) {
                return;
            }
            aVarM12821j.m12836h("sync cache delete inside");
            this.f11601c = true;
            List<T> list = aVarM12821j.f11606b;
            if (list != null) {
                Order<T> order = this.f11599a.f11582c;
                if (order instanceof unq) {
                    iBinarySearchUsingLocalId = orh0.this.m12772k(aVarM12821j.f11606b, t, ((unq) order).m15121h());
                } else {
                    iBinarySearchUsingLocalId = orh0.this.binarySearchUsingLocalId(list, t, order);
                }
                if (iBinarySearchUsingLocalId >= 0) {
                    aVarM12821j = m12822k();
                    aVarM12821j.f11606b.remove(iBinarySearchUsingLocalId);
                    if (aVarM12821j.f11606b.isEmpty() && !aVarM12821j.f11607c) {
                        aVarM12821j.f11607c = true;
                    }
                }
                aVarM12821j.m12836h("item removed");
            }
            if (aVarM12821j.f11605a >= 0) {
                orh0<T>.C2455d.a aVarM12822k = m12822k();
                int i = aVarM12822k.f11605a - 1;
                aVarM12822k.f11605a = i;
                if (i == -1) {
                    aVarM12822k.f11607c = false;
                }
                aVarM12822k.m12836h("size changed");
            }
        }

        /* JADX INFO: renamed from: p */
        public boolean m12827p(T t) {
            orh0<T>.C2455d.a aVarM12821j = m12821j();
            orh0.m12762n(this.f11599a.f11580a + " sync cache insert");
            if (aVarM12821j != null && m12819h(t)) {
                this.f11601c = true;
                List<T> list = aVarM12821j.f11606b;
                if (list == null && aVarM12821j.f11605a <= 0 && !aVarM12821j.f11607c) {
                    aVarM12821j.m12836h("sync cache insert nothing");
                    return false;
                }
                if (list != null && !aVarM12821j.f11607c) {
                    aVarM12821j.m12836h("sync cache insert partial");
                    int iBinarySearchUsingLocalId = orh0.this.binarySearchUsingLocalId(aVarM12821j.f11606b, t, this.f11599a.f11582c);
                    if (iBinarySearchUsingLocalId < 0) {
                        iBinarySearchUsingLocalId = (-iBinarySearchUsingLocalId) - 1;
                    }
                    if (aVarM12821j.f11605a >= 0) {
                        aVarM12821j = m12822k();
                        aVarM12821j.f11605a++;
                        aVarM12821j.m12836h("size updated");
                    }
                    if (iBinarySearchUsingLocalId >= aVarM12821j.f11606b.size()) {
                        return false;
                    }
                    orh0<T>.C2455d.a aVarM12822k = m12822k();
                    aVarM12822k.f11606b.add(iBinarySearchUsingLocalId, t);
                    aVarM12822k.m12836h("item inserted");
                    return true;
                }
                if (list == null && aVarM12821j.f11605a >= 0 && !aVarM12821j.f11607c) {
                    aVarM12821j.m12836h("sync cache insert size");
                    orh0<T>.C2455d.a aVarM12822k2 = m12822k();
                    aVarM12822k2.f11605a++;
                    aVarM12822k2.m12836h("size updated");
                    return false;
                }
                if (list != null && aVarM12821j.f11605a >= 0 && aVarM12821j.f11607c) {
                    aVarM12821j.m12836h("sync cache insert full");
                    int iBinarySearchUsingLocalId2 = orh0.this.binarySearchUsingLocalId(aVarM12821j.f11606b, t, this.f11599a.f11582c);
                    if (iBinarySearchUsingLocalId2 < 0) {
                        iBinarySearchUsingLocalId2 = (-iBinarySearchUsingLocalId2) - 1;
                    }
                    orh0<T>.C2455d.a aVarM12822k3 = m12822k();
                    boolean z = iBinarySearchUsingLocalId2 == aVarM12822k3.f11606b.size();
                    aVarM12822k3.f11605a++;
                    if (!z || aVarM12822k3.f11608d + (this.f11599a.f11584e * 2) > aVarM12822k3.f11606b.size()) {
                        aVarM12822k3.f11606b.add(iBinarySearchUsingLocalId2, t);
                    } else {
                        aVarM12822k3.f11607c = false;
                    }
                    aVarM12822k3.m12836h("sync cache insert full end");
                    return true;
                }
                aVarM12821j.m12836h("what??");
                StringBuilder sb = new StringBuilder("syncCacheInsert IllegalStateException == ");
                sb.append(orh0.this.f11572d);
                sb.append("/");
                sb.append(this.f11599a.f11580a);
                sb.append("\n\t\t\t\tbase:");
                List<T> list2 = aVarM12821j.f11606b;
                sb.append(list2 == null ? "null" : Integer.valueOf(list2.size()));
                sb.append(", size: ");
                sb.append(aVarM12821j.f11605a);
                sb.append(", full: ");
                sb.append(aVarM12821j.f11607c);
                sb.append("\nnewItem:");
                sb.append(t.toJson());
                CrashHelper.c(new Exception(sb.toString()));
                ohg0.a();
            }
            return false;
        }

        /* JADX INFO: renamed from: q */
        public boolean m12828q(T t, T t2) {
            Order<T> order;
            int iBinarySearchUsingLocalId;
            orh0<T>.C2455d.a aVarM12821j = m12821j();
            if ((this.f11599a.f11581b instanceof tnq) && !vwb.J(t.getExtList())) {
                vwb.J(t2.getExtList());
            }
            if (aVarM12821j == null || !((this.f11599a.f11581b == null || (m12819h(t) && m12819h(t2))) && (order = this.f11599a.f11582c) != null && order.compare(t, t2) == 0)) {
                m12826o(t);
                return m12827p(t2);
            }
            this.f11601c = true;
            List<T> list = aVarM12821j.f11606b;
            if (list == null || (iBinarySearchUsingLocalId = orh0.this.binarySearchUsingLocalId(list, t, this.f11599a.f11582c)) < 0) {
                return false;
            }
            m12822k().f11606b.set(iBinarySearchUsingLocalId, t2);
            return true;
        }

        /* JADX INFO: renamed from: r */
        public void m12829r() {
            if (this.f11601c) {
                orh0<T>.C2455d.a aVarM12821j = m12821j();
                if (aVarM12821j != null) {
                    this.f11602d.onNext(aVarM12821j);
                }
                orh0.m12762n("triggered query " + this.f11599a.f11580a);
                this.f11600b = null;
                this.f11601c = false;
            }
        }

        /* JADX INFO: renamed from: s */
        public final void m12830s(List<j760<orh0, List>> list) {
            String str;
            if (list.size() > 0) {
                for (j760<orh0, List> j760Var : list) {
                    for (DbObject dbObject : (List) j760Var.b) {
                        if (dbObject != null && (str = dbObject.id) != null) {
                            ((orh0) j760Var.a).cache(str, dbObject);
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: t */
        public void m12831t(boolean z) {
            if (!z || orh0.f11568l) {
                this.f11603e.set(2);
                this.f11602d.onNext(new a());
            } else if (this.f11603e.compareAndSet(0, 1)) {
                orh0.this.m12771j(false, new v9j() { // from class: l.rrh0
                    public final Object call() {
                        return this.f12722a.m12823l();
                    }
                }, new e30() { // from class: l.srh0
                    public final void call(Object obj) {
                        this.f13044a.m12824m((xaj0) obj);
                    }
                }, null, true, "uiquery_" + orh0.this.f11572d + "_" + this.f11599a.f11580a);
            }
        }

        /* JADX INFO: renamed from: l.orh0$d$a */
        public class a extends AbstractList<T> {

            /* JADX INFO: renamed from: a */
            public int f11605a;

            /* JADX INFO: renamed from: b */
            public List<T> f11606b;

            /* JADX INFO: renamed from: c */
            public boolean f11607c;

            /* JADX INFO: renamed from: d */
            public int f11608d;

            /* JADX INFO: renamed from: e */
            public long f11609e;

            public a(orh0<T>.C2455d.a aVar) {
                this.f11605a = -1;
                this.f11606b = null;
                this.f11607c = false;
                this.f11608d = -1;
                this.f11609e = -1L;
                this.f11605a = aVar.f11605a;
                this.f11606b = aVar.f11606b != null ? new ArrayList(aVar.f11606b) : null;
                this.f11607c = aVar.f11607c;
                this.f11608d = aVar.f11608d;
            }

            @Override // java.util.AbstractList, java.util.Collection, java.util.List
            public boolean equals(@Nullable Object obj) {
                return super.equals(obj);
            }

            /* JADX INFO: renamed from: h */
            public void m12836h(String str) {
                StringBuilder sb = new StringBuilder();
                sb.append(orh0.this.f11572d);
                sb.append("/");
                sb.append(C2455d.this.f11599a.f11580a);
                sb.append(" ");
                sb.append(str);
                sb.append("\n\t\t\t\tbase:");
                List<T> list = this.f11606b;
                sb.append(list == null ? "null" : Integer.valueOf(list.size()));
                sb.append(", size: ");
                sb.append(this.f11605a);
                sb.append(", full: ");
                sb.append(this.f11607c);
                orh0.m12762n(sb.toString());
            }

            @Override // java.util.AbstractList, java.util.List
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public T get(int i) {
                int iMin = Math.min(i, this.f11608d - 1);
                this.f11608d = iMin;
                if (iMin < -1) {
                    this.f11608d = -1;
                }
                m12843s(i);
                if (i >= C2455d.this.f11599a.f11583d) {
                    m12844v(i);
                }
                return this.f11606b.get(i);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public boolean isEmpty() {
                if (this.f11606b == null) {
                    m12843s(0);
                }
                return size() <= 0;
            }

            @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
            @NonNull
            public Iterator<T> iterator() {
                return super.iterator();
            }

            /* JADX INFO: renamed from: j */
            public void m12838j(String str) {
                StringBuilder sb = new StringBuilder();
                sb.append(orh0.this.f11572d);
                sb.append("/");
                sb.append(C2455d.this.f11599a.f11580a);
                sb.append(" ");
                sb.append(str);
                sb.append("\n\t\t\t\tbase:");
                List<T> list = this.f11606b;
                sb.append(list == null ? "null" : Integer.valueOf(list.size()));
                sb.append(", size: ");
                sb.append(this.f11605a);
                sb.append(", full: ");
                sb.append(this.f11607c);
                orh0.m12764r(sb.toString());
            }

            /* JADX INFO: renamed from: l */
            public final /* synthetic */ j760 m12839l(Filter filter, int i) {
                C2455d c2455d = C2455d.this;
                List<T> listQuery = orh0.this.query(filter, c2455d.f11599a.f11582c, i);
                ArrayList arrayList = new ArrayList();
                j760<orh0, xaj0<w9j<List<T>, Filter>, v9j<Order>, Integer>> j760Var = orh0.this.f11571c;
                if (j760Var != null) {
                    arrayList.add(vwb.Y((orh0) orh0.this.f11571c.a, ((orh0) j760Var.a).query((Filter) ((w9j) ((xaj0) j760Var.b).a).call(listQuery), (Order) ((v9j) ((xaj0) orh0.this.f11571c.b).b).call(), ((Integer) ((xaj0) orh0.this.f11571c.b).c).intValue())));
                }
                j760 j760VarM12825n = C2455d.this.m12825n(listQuery);
                if (j760VarM12825n != null) {
                    arrayList.add(j760VarM12825n);
                }
                return vwb.Y(listQuery, arrayList);
            }

            /* JADX INFO: renamed from: o */
            public final /* synthetic */ void m12840o(a aVar, int i, int i2, j760 j760Var) {
                C2455d.this.f11603e.set(2);
                for (DbObject dbObject : (List) j760Var.a) {
                    orh0.this.cache(dbObject.id, dbObject);
                }
                C2455d.this.m12830s((List) j760Var.b);
                orh0<T>.C2455d.a aVarM12821j = C2455d.this.m12821j();
                if (aVarM12821j != null && aVarM12821j == aVar && aVarM12821j.size() == i) {
                    this.f11606b.addAll((Collection) j760Var.a);
                    if (((List) j760Var.a).size() != i2) {
                        this.f11605a = this.f11606b.size();
                        this.f11607c = true;
                    }
                }
            }

            /* JADX INFO: renamed from: p */
            public final /* synthetic */ void m12841p() {
                C2455d.this.f11603e.set(2);
            }

            /* JADX INFO: renamed from: r */
            public void m12842r() {
                if (ThreadUtil.f()) {
                    m12836h("query size called");
                }
                orh0.this.m12776p();
                int iM12789e = C2455d.this.f11599a.m12789e();
                this.f11605a = iM12789e;
                List<T> list = this.f11606b;
                if (list != null) {
                    this.f11607c = iM12789e == list.size();
                } else if (iM12789e == 0) {
                    this.f11606b = new ArrayList(0);
                    this.f11607c = true;
                }
            }

            /* JADX INFO: renamed from: s */
            public void m12843s(int i) {
                if (this.f11606b == null) {
                    this.f11606b = new ArrayList();
                }
                if (i >= this.f11606b.size()) {
                    m12835g(i);
                    int size = this.f11606b.size();
                    orh0<T>.C2452a c2452a = C2455d.this.f11599a;
                    int i2 = c2452a.f11583d;
                    if (i >= i2) {
                        i2 = c2452a.f11584e;
                    }
                    Filter<T> filterM12795k = c2452a.m12795k(this.f11606b);
                    int iMin = Math.min(C2455d.this.f11599a.m12796l(this.f11606b, i, i2), this.f11605a - this.f11606b.size());
                    m12836h("query cache called " + iMin);
                    C2455d c2455d = C2455d.this;
                    this.f11606b.addAll(orh0.this.queryCache(filterM12795k, c2455d.f11599a.f11582c, iMin));
                    if (this.f11606b.size() < iMin + size) {
                        this.f11607c = true;
                        this.f11605a = this.f11606b.size();
                    }
                    if (ThreadUtil.f()) {
                        m12836h("status updated");
                    }
                }
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                orh0.m12762n("size called with " + this.f11605a);
                if (this.f11605a == -1) {
                    m12842r();
                }
                return this.f11605a;
            }

            @Override // java.util.AbstractCollection
            public String toString() {
                StringBuilder sb = new StringBuilder("size: ");
                sb.append(this.f11605a);
                sb.append("\nfull: ");
                sb.append(this.f11607c);
                sb.append("\nbase: ");
                if (this.f11606b == null) {
                    sb.append("null");
                } else {
                    sb.append("size ");
                    sb.append(this.f11606b.size());
                    sb.append("\n[");
                    sb.append(vwb.U(this.f11606b, "; "));
                    sb.append("]");
                }
                return sb.toString();
            }

            /* JADX INFO: renamed from: v */
            public final void m12844v(int i) {
                List<T> list = this.f11606b;
                if (list == null || i < C2455d.this.f11599a.f11583d || this.f11607c || list.size() - i > C2455d.this.f11599a.f11584e / 2 || SystemClock.uptimeMillis() - this.f11609e <= 1) {
                    return;
                }
                this.f11609e = SystemClock.uptimeMillis();
                final int size = this.f11606b.size();
                orh0<T>.C2452a c2452a = C2455d.this.f11599a;
                int i2 = c2452a.f11583d;
                if (i >= i2) {
                    i2 = c2452a.f11584e;
                }
                final Filter<T> filterM12795k = c2452a.m12795k(this.f11606b);
                final int iM12796l = C2455d.this.f11599a.m12796l(this.f11606b, i, i2);
                if (!C2455d.this.f11603e.compareAndSet(2, 1) || orh0.f11568l) {
                    return;
                }
                m12838j("preloading");
                orh0.this.m12770i(true, new v9j() { // from class: l.vrh0
                    public final Object call() {
                        return this.f14288a.m12839l(filterM12795k, iM12796l);
                    }
                }, new e30() { // from class: l.wrh0
                    public final void call(Object obj) {
                        this.f14669a.m12840o(this, size, iM12796l, (j760) obj);
                    }
                }, new d30() { // from class: l.xrh0
                    public final void call() {
                        this.f15111a.m12841p();
                    }
                }, "uiquery_tryPreload_" + orh0.this.f11572d + "_" + C2455d.this.f11599a.f11580a);
            }

            /* JADX INFO: renamed from: g */
            public void m12835g(int i) {
            }

            public a() {
                this.f11606b = null;
                this.f11607c = false;
                this.f11608d = -1;
                this.f11609e = -1L;
                this.f11605a = -1;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m12762n(String str) {
    }

    /* JADX INFO: renamed from: r */
    public static void m12764r(String str) {
    }

    public T query(long j) {
        List<T> listQuery = query(DbObject._ID.EQ(Long.valueOf(j)), null, 1);
        if (listQuery.isEmpty()) {
            return null;
        }
        return listQuery.get(0);
    }

    public List<T> query(Filter<T> filter, Order<T> order, int i) {
        return m12784z(filter, order, i, true);
    }

    public c<T> uiGet(String str) {
        return uiGet(str, true);
    }

    public orh0(String str, mrf0<T> mrf0Var, List<Index> list, int i) {
        super(i);
        this.f11571c = null;
        this.f11573e = null;
        this.f11574f = true;
        this.f11575g = new ConcurrentHashMap<>();
        this.f11576h = new ConcurrentHashMap<>();
        this.f11577i = new ConcurrentHashMap<>();
        this.f11578j = new ConcurrentHashMap<>();
        this.f11579k = new ConcurrentHashMap<>();
        this.f11572d = str;
        this.f11570b = mrf0Var;
        list = list == null ? new ArrayList<>() : list;
        this.f11569a = list;
        list.add(new Index(new Column[]{DbObject.ID}));
    }

    public void delete(String str) {
        delete(DbObject.ID.EQ(str));
    }

    public void delete(long j) {
        delete(DbObject._ID.EQ(Long.valueOf(j)));
    }

    public void upsert(T t) {
        upsert(t, null);
    }

    public T queryCache(String str) {
        n11.h(str != null);
        T t = (T) cached(str);
        if (t == null) {
            m12776p();
            t = null;
            List<T> listQueryCache = queryCache(DbObject.ID.EQ(str), null, 1);
            if (listQueryCache != null && listQueryCache.size() != 0) {
                return listQueryCache.get(0);
            }
        }
        return t;
    }
}
