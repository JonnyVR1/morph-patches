package p149l;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.dbcenter.p057db.opt.TransactionOpt;
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
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes12.dex */
public class orh0<T extends DbObject> extends LruCache2<String, T> {

    /* JADX INFO: renamed from: l */
    public static boolean f145279l = false;

    /* JADX INFO: renamed from: a */
    public final List<Index> f145280a;

    /* JADX INFO: renamed from: b */
    public final mrf0<T> f145281b;

    /* JADX INFO: renamed from: c */
    public j760<orh0, xaj0<w9j<List<T>, Filter>, v9j<Order>, Integer>> f145282c;

    /* JADX INFO: renamed from: d */
    public final String f145283d;

    /* JADX INFO: renamed from: e */
    public Map<String, zrh0> f145284e;

    /* JADX INFO: renamed from: f */
    public boolean f145285f;

    /* JADX INFO: renamed from: g */
    public ConcurrentHashMap<String, orh0<T>.C19011d> f145286g;

    /* JADX INFO: renamed from: h */
    public ConcurrentHashMap<String, tnq> f145287h;

    /* JADX INFO: renamed from: i */
    public ConcurrentHashMap<String, tnq> f145288i;

    /* JADX INFO: renamed from: j */
    public ConcurrentHashMap<String, orh0<T>.C19010c> f145289j;

    /* JADX INFO: renamed from: k */
    public ConcurrentHashMap<String, orh0<T>.C19009b> f145290k;

    /* JADX INFO: renamed from: l.orh0$a */
    public class C19008a {

        /* JADX INFO: renamed from: a */
        public final String f145291a;

        /* JADX INFO: renamed from: b */
        public final Filter<T> f145292b;

        /* JADX INFO: renamed from: c */
        @NonNull
        public final Order<T> f145293c;

        /* JADX INFO: renamed from: d */
        public final int f145294d;

        /* JADX INFO: renamed from: e */
        public final int f145295e;

        /* JADX INFO: renamed from: f */
        public ConcurrentHashMap<String, orh0<T>.C19008a> f145296f = new ConcurrentHashMap<>();

        /* JADX INFO: renamed from: l.orh0$a$a */
        public class a extends AbstractList<T> {

            /* JADX INFO: renamed from: a */
            public List<T> f145298a = new ArrayList();

            /* JADX INFO: renamed from: b */
            public int f145299b = -1;

            public a() {
            }

            @Override // java.util.AbstractList, java.util.List
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public T get(int i) {
                if (this.f145298a.size() <= i) {
                    List<T> list = this.f145298a;
                    C19008a c19008a = C19008a.this;
                    orh0 orh0Var = orh0.this;
                    Filter<T> filterM165618k = c19008a.m165618k(list);
                    C19008a c19008a2 = C19008a.this;
                    list.addAll(orh0Var.query(filterM165618k, c19008a2.f145293c, c19008a2.m165619l(this.f145298a, i, i == 0 ? 1 : 20)));
                }
                return this.f145298a.get(i);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                if (this.f145299b == -1) {
                    this.f145299b = C19008a.this.m165612e();
                }
                return this.f145299b;
            }
        }

        public C19008a(String str, @NonNull Filter<T> filter, Order<T> order, int i, int i2) {
            n11.m157331d(order);
            this.f145291a = str;
            this.f145292b = filter;
            this.f145293c = order;
            this.f145294d = i;
            this.f145295e = i2;
        }

        /* JADX INFO: renamed from: e */
        public int m165612e() {
            return orh0.this.count(this.f145292b, -1);
        }

        /* JADX INFO: renamed from: f */
        public boolean m165613f() {
            return orh0.this.query(this.f145292b, this.f145293c, 1).size() == 0;
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m165614g(C19011d c19011d, boolean z) {
            orh0.this.f145286g.put(this.f145291a, c19011d);
            c19011d.m165654t(z);
        }

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ void m165615h() {
            orh0<T>.C19011d c19011d = orh0.this.f145286g.get(this.f145291a);
            if (c19011d == null || c19011d.f145313d.m221518h()) {
                return;
            }
            orh0.this.f145286g.remove(this.f145291a);
        }

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ void m165616i() {
            ThreadUtil.m81313h(new Runnable() { // from class: l.nrh0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f140188a.m165615h();
                }
            }, 1000L);
        }

        /* JADX INFO: renamed from: j */
        public List<T> m165617j() {
            return new a();
        }

        /* JADX INFO: renamed from: k */
        public Filter<T> m165618k(List<T> list) {
            if (list.size() == 0) {
                return this.f145292b;
            }
            T t = list.get(list.size() - 1);
            Filter<T> filter = this.f145292b;
            return filter instanceof tnq ? tnq.m189810b((tnq) filter, this.f145293c, list.get(list.size() - 1)) : Filter.AND(filter, this.f145293c.GT_EQ(list.get(list.size() - 1)), DbObject._ID.NEQ(Long.valueOf(t._id)));
        }

        /* JADX INFO: renamed from: l */
        public int m165619l(List<T> list, int i, int i2) {
            return Math.max(i2, (i - list.size()) + 1);
        }

        /* JADX INFO: renamed from: m */
        public C22306c<List<T>> m165620m() {
            return m165621n(true);
        }

        /* JADX INFO: renamed from: n */
        public C22306c<List<T>> m165621n(final boolean z) {
            final orh0<T>.C19011d c19011d = orh0.this.f145286g.get(this.f145291a);
            if (c19011d == null) {
                c19011d = new C19011d(this);
                orh0.this.f145286g.put(this.f145291a, c19011d);
                Filter<T> filter = this.f145292b;
                if (filter instanceof tnq) {
                    tnq tnqVar = (tnq) filter;
                    orh0.this.f145287h.put(this.f145291a, tnqVar);
                    tnqVar.mo189815g().f145288i.put(this.f145291a, tnqVar);
                }
            }
            return c19011d.f145313d.doOnSubscribe(new d30() { // from class: l.lrh0
                @Override // p149l.d30
                public final void call() {
                    this.f129708a.m165614g(c19011d, z);
                }
            }).doOnUnsubscribe(new d30() { // from class: l.mrh0
                @Override // p149l.d30
                public final void call() {
                    this.f135365a.m165616i();
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.orh0$b */
    public class C19009b {

        /* JADX INFO: renamed from: a */
        public final orh0<T>.C19008a f145301a;

        /* JADX INFO: renamed from: b */
        public final C22392a<Integer> f145302b;

        /* JADX INFO: renamed from: c */
        public boolean f145303c;

        /* JADX INFO: renamed from: d */
        public int f145304d;

        /* JADX INFO: renamed from: a */
        public void m165623a(T t) {
            if (m165626d() == -99 || !this.f145301a.f145292b.filter(t)) {
                return;
            }
            this.f145303c = true;
            this.f145304d = m165626d() - 1;
        }

        /* JADX INFO: renamed from: b */
        public void m165624b(T t) {
            if (m165626d() == -99 || !this.f145301a.f145292b.filter(t)) {
                return;
            }
            this.f145303c = true;
            this.f145304d = m165626d() + 1;
        }

        /* JADX INFO: renamed from: c */
        public void m165625c(T t, T t2) {
            if (m165626d() != -99) {
                if (this.f145301a.f145292b.filter(t) && !this.f145301a.f145292b.filter(t2)) {
                    this.f145304d = m165626d() - 1;
                    this.f145303c = true;
                } else {
                    if (this.f145301a.f145292b.filter(t) || !this.f145301a.f145292b.filter(t2)) {
                        return;
                    }
                    this.f145304d = m165626d() + 1;
                    this.f145303c = true;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public int m165626d() {
            return (this.f145302b.m221515e() == null || this.f145304d != -99) ? this.f145304d : this.f145302b.m221515e().intValue();
        }

        /* JADX INFO: renamed from: e */
        public void m165627e() {
            if (this.f145303c) {
                this.f145302b.onNext(Integer.valueOf(m165626d()));
                this.f145304d = -99;
                this.f145303c = false;
            }
        }
    }

    /* JADX INFO: renamed from: l.orh0$c */
    public class C19010c {

        /* JADX INFO: renamed from: a */
        public final String f145305a;

        /* JADX INFO: renamed from: c */
        public AtomicInteger f145307c = new AtomicInteger(0);

        /* JADX INFO: renamed from: d */
        public boolean f145308d = false;

        /* JADX INFO: renamed from: b */
        public final C22392a<T> f145306b = C22392a.m221512b();

        public C19010c(String str) {
            this.f145305a = str;
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ DbObject m165631d() {
            return orh0.this.query(this.f145305a);
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m165632e(DbObject dbObject) {
            this.f145307c.set(2);
            if (dbObject != null) {
                orh0.this.cache(dbObject.f56011id, dbObject);
            }
            this.f145306b.onNext(dbObject);
        }

        /* JADX INFO: renamed from: f */
        public void m165633f() {
            if (this.f145308d) {
                this.f145306b.onNext((T) orh0.this.queryCache(this.f145305a));
                orh0.m165585n("triggered get " + this.f145305a);
                this.f145308d = false;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: g */
        public void m165634g(boolean z) {
            if (this.f145307c.compareAndSet(0, 1)) {
                DbObject dbObject = (DbObject) orh0.this.cached(this.f145305a);
                if (dbObject != null) {
                    this.f145307c.set(2);
                    this.f145306b.onNext((T) dbObject);
                    return;
                }
                if (!z || orh0.f145279l) {
                    this.f145307c.set(2);
                    this.f145306b.onNext((T) orh0.this.queryCache(this.f145305a));
                    return;
                }
                orh0.this.m165594j(false, new v9j() { // from class: l.prh0
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return this.f150911a.m165631d();
                    }
                }, new e30() { // from class: l.qrh0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f155990a.m165632e((DbObject) obj);
                    }
                }, null, true, "uiget_" + orh0.this.f145283d + "_" + this.f145305a);
            }
        }
    }

    public orh0(b8c b8cVar, String str, mrf0<T> mrf0Var, List<Index> list, int i) {
        super(i);
        this.f145282c = null;
        this.f145284e = null;
        this.f145285f = true;
        this.f145286g = new ConcurrentHashMap<>();
        this.f145287h = new ConcurrentHashMap<>();
        this.f145288i = new ConcurrentHashMap<>();
        this.f145289j = new ConcurrentHashMap<>();
        this.f145290k = new ConcurrentHashMap<>();
        this.f145283d = str;
        this.f145281b = mrf0Var;
        list = list == null ? new ArrayList<>() : list;
        this.f145280a = list;
        list.add(new Index(DbObject.f56009ID));
        if (b8cVar != null) {
            b8cVar.mo100764f().add(this);
        }
    }

    /* JADX INFO: renamed from: q */
    public static String m165586q(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
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
    public TransactionOpt m165588A() {
        return f8c.m119878o().m119893q();
    }

    /* JADX INFO: renamed from: B */
    public final void m165589B(T t, T t2) {
        ConcurrentHashMap<String, tnq> concurrentHashMap = this.f145287h;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<String, tnq>> it = this.f145287h.entrySet().iterator();
        while (it.hasNext()) {
            tnq value = it.next().getValue();
            DbObject dbObjectQuery = value.mo189815g().query(t2.f56011id);
            if (dbObjectQuery != null) {
                value.mo189815g().cache(dbObjectQuery.f56011id, dbObjectQuery);
                if (t != null) {
                    t.addExtraData(dbObjectQuery);
                }
                t2.addExtraData(dbObjectQuery);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    public final void m165590C(T t, T t2) {
        ConcurrentHashMap<String, tnq> concurrentHashMap = this.f145288i;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<String, tnq>> it = this.f145288i.entrySet().iterator();
        while (it.hasNext()) {
            tnq value = it.next().getValue();
            DbObject dbObjectQuery = value.mo189812d().query(t2.f56011id);
            if (m165597m(value.mo189814f(), t) || m165597m(value.mo189814f(), t2)) {
                if (dbObjectQuery != null && (value.baseFilter() == null || value.baseFilter().filter(dbObjectQuery))) {
                    try {
                        DbObject dbObject = (DbObject) dbObjectQuery.mo223809clone();
                        dbObjectQuery.addExtraData(t2);
                        dbObject.addExtraData(t);
                        m165588A().update(value.mo189812d(), dbObject, dbObjectQuery);
                    } catch (Exception e) {
                        CrashHelper.m81296c(e);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D */
    public final void m165591D(T t) {
        ConcurrentHashMap<String, tnq> concurrentHashMap = this.f145288i;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<String, tnq>> it = this.f145288i.entrySet().iterator();
        while (it.hasNext()) {
            tnq value = it.next().getValue();
            DbObject dbObjectQuery = (DbObject) value.mo189812d().cached(t.f56011id);
            if (dbObjectQuery == null) {
                dbObjectQuery = value.mo189812d().query(t.f56011id);
            }
            if (dbObjectQuery != null && (value.baseFilter() == null || value.baseFilter().filter(dbObjectQuery))) {
                try {
                    DbObject dbObject = (DbObject) dbObjectQuery.mo223809clone();
                    DbObject dbObject2 = (DbObject) dbObjectQuery.mo223809clone();
                    dbObject.setExtList(dbObjectQuery.getExtList());
                    dbObject2.setExtList(dbObjectQuery.getExtList());
                    dbObject2.removeExtTable(t);
                    m165588A().joinUpdate(value.mo189812d(), dbObject, dbObject2);
                } catch (Exception e) {
                    CrashHelper.m81296c(e);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public final void m165592E(T t) {
        DbObject dbObject;
        if (this.f145287h.size() > 0) {
            for (tnq tnqVar : this.f145287h.values()) {
                if (tnqVar.baseFilter() == null || tnqVar.baseFilter().filter(t)) {
                    if (!TextUtils.isEmpty((String) tnqVar.foreignC().get(t)) && (dbObject = (DbObject) tnqVar.mo189812d().cached(t.f56011id)) != null) {
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
            if (k2 != null && k2._id == k._id) {
                return i;
            }
            if (order.compare(k2, k) != 0) {
                break;
            }
        }
        for (int i2 = iBinarySearch + 1; i2 < list.size(); i2++) {
            K k3 = list.get(i2);
            if (k3 != null && k3._id == k._id) {
                return i2;
            }
            if (order.compare(k3, k) != 0) {
                break;
            }
        }
        return (-iBinarySearch) - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void cacheQueryJoinData(T t) {
        DbObject dbObjectQuery;
        if (this.f145287h.size() > 0) {
            Iterator<Map.Entry<String, tnq>> it = this.f145287h.entrySet().iterator();
            while (it.hasNext()) {
                tnq value = it.next().getValue();
                if (value.baseFilter() == null || value.baseFilter().filter(t)) {
                    if (!TextUtils.isEmpty((String) value.foreignC().get(t)) && (dbObjectQuery = value.mo189815g().query((String) value.foreignC().get(t))) != null) {
                        t.addExtraData(dbObjectQuery);
                        value.mo189815g().cache(dbObjectQuery.f56011id, dbObjectQuery);
                    }
                }
            }
            for (tnq tnqVar : this.f145287h.values()) {
            }
        }
    }

    public int count(Filter<T> filter, int i) {
        String str;
        Cursor cursorRawQuery;
        System.nanoTime();
        SqlSegment sqlSegmentEmit = filter == null ? SqlSegment.NULL : filter.emit();
        if (filter instanceof tnq) {
            cursorRawQuery = m165598o().rawQuery(((tnq) filter).countSql(), sqlSegmentEmit.args);
        } else {
            SQLiteDatabase sQLiteDatabaseM165598o = m165598o();
            StringBuilder sb = new StringBuilder("select count(_id) from ");
            sb.append(this.f145283d);
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            if (sqlSegmentEmit.part == null) {
                str = "";
            } else {
                str = " WHERE " + sqlSegmentEmit.part;
            }
            sb.append(str);
            cursorRawQuery = sQLiteDatabaseM165598o.rawQuery(sb.toString(), sqlSegmentEmit.args);
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
        Cursor cursorRawQuery = filter instanceof tnq ? m165598o().rawQuery(((tnq) filter).querySql(null, -1), sqlSegmentEmit.args) : m165598o().query(this.f145283d, null, sqlSegmentEmit.part, sqlSegmentEmit.args, null, null, null);
        ArrayList<DbObject> arrayList = new ArrayList();
        while (cursorRawQuery.moveToNext()) {
            try {
                arrayList.add(this.f145281b.read(cursorRawQuery, 0));
            } catch (Throwable th) {
                cursorRawQuery.close();
                throw th;
            }
        }
        cursorRawQuery.close();
        m165598o().delete(this.f145283d, sqlSegmentEmit.part, sqlSegmentEmit.args);
        for (DbObject dbObject : arrayList) {
            m165591D(dbObject);
            m165592E(dbObject);
            m165588A().delete(this, dbObject);
        }
    }

    public void deleteAll() {
        delete(Filter.TRUE);
    }

    /* JADX INFO: renamed from: i */
    public <T> void m165593i(boolean z, v9j<T> v9jVar, e30<T> e30Var, d30 d30Var, String str) {
        f8c.m119878o().m119883d(z, v9jVar, e30Var, d30Var, str);
    }

    public void insert(T t) {
        m165600s(t, false);
    }

    /* JADX INFO: renamed from: j */
    public <T> void m165594j(boolean z, v9j<T> v9jVar, e30<T> e30Var, d30 d30Var, boolean z2, String str) {
        f8c.m119878o().m119884e(z, v9jVar, e30Var, d30Var, z2, str);
    }

    /* JADX INFO: renamed from: k */
    public final <K extends DbObject> int m165595k(List<K> list, K k, Order<K> order) {
        int iBinarySearch = Collections.binarySearch(list, k, order);
        if (iBinarySearch < 0) {
            return iBinarySearch;
        }
        for (int i = iBinarySearch; i >= 0; i--) {
            K k2 = list.get(i);
            if (k2 != null && k2._id == k._id) {
                return i;
            }
            if (order.compare(k2, k) != 0) {
                break;
            }
        }
        for (int i2 = iBinarySearch + 1; i2 < list.size(); i2++) {
            K k3 = list.get(i2);
            if (k3 != null && k3._id == k._id) {
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
    public void m165596l(T t) {
        ConcurrentHashMap<String, tnq> concurrentHashMap = this.f145288i;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<String, tnq>> it = this.f145288i.entrySet().iterator();
        while (it.hasNext()) {
            tnq value = it.next().getValue();
            DbObject dbObjectQuery = (DbObject) value.mo189812d().cached(t.f56011id);
            if (dbObjectQuery == null) {
                dbObjectQuery = value.mo189812d().query(t.f56011id);
            }
            if (dbObjectQuery != null && (value.baseFilter() == null || value.baseFilter().filter(dbObjectQuery))) {
                try {
                    DbObject dbObject = (DbObject) dbObjectQuery.mo223809clone();
                    DbObject dbObject2 = (DbObject) dbObjectQuery.mo223809clone();
                    dbObject.setExtList(dbObjectQuery.getExtList());
                    dbObject2.setExtList(dbObjectQuery.getExtList());
                    dbObject2.addExtraData(t);
                    m165588A().update(value.mo189812d(), dbObject, dbObject2);
                } catch (Exception e) {
                    CrashHelper.m81296c(e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m165597m(Filter filter, T t) {
        if (filter == null) {
            return true;
        }
        if (t == null) {
            return false;
        }
        return filter.filter(t);
    }

    /* JADX INFO: renamed from: o */
    public SQLiteDatabase m165598o() {
        return f8c.m119878o().m119886h();
    }

    /* JADX INFO: renamed from: p */
    public void m165599p() {
        f8c.m119878o().m119891m();
    }

    public T query(String str) {
        n11.m157335h(str != null);
        List<T> listQuery = query(DbObject.f56009ID.mo60175EQ(str), null, 1);
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
        m165599p();
        if (filter instanceof tnq) {
            cursorQuery = m165598o().rawQuery(((tnq) filter).querySql(order, i), sqlSegmentEmit.args);
        } else {
            cursorQuery = m165598o().query(this.f145283d, null, sqlSegmentEmit.part, sqlSegmentEmit.args, null, null, order != null ? order.emit() : null, str);
        }
        ArrayList arrayList = new ArrayList(10);
        try {
            int columnIndex = cursorQuery.getColumnIndex(DbObject.f56009ID.NAME);
            if (columnIndex >= 0) {
                while (cursorQuery.moveToNext()) {
                    if (!cursorQuery.isNull(columnIndex)) {
                        String string = cursorQuery.getString(columnIndex);
                        T tCached = cached(string);
                        if (tCached == null) {
                            tCached = this.f145281b.read(cursorQuery, 0);
                            if (filter instanceof tnq) {
                                tnq tnqVar = (tnq) filter;
                                T t = tnqVar.mo189815g().f145281b.read(cursorQuery, this.f145281b.getReadIndex());
                                if (!tnqVar.mo189815g().f145281b.init().equals(t)) {
                                    tCached.addExtraData(t);
                                }
                            }
                            cache(string, tCached);
                        }
                        arrayList.add(tCached);
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
    public void m165600s(T t, boolean z) {
        if (z) {
            ArrayList<ValueObject> extList = t.getExtList();
            if (!vwb.m200296J(extList)) {
                for (ValueObject valueObject : extList) {
                    orh0 orh0VarM119892n = f8c.m119878o().m119892n(this.f145283d, valueObject);
                    if (orh0VarM119892n != 0 && (valueObject instanceof DbObject)) {
                        orh0VarM119892n.insert((DbObject) valueObject);
                    }
                }
            }
        }
        System.nanoTime();
        ContentValues contentValues = new ContentValues();
        this.f145281b.write(t, contentValues);
        t._id = m165598o().insert(this.f145283d, null, contentValues);
        m165596l(t);
        m165588A().insert(this, t);
        cacheQueryJoinData(t);
    }

    public <E extends Comparable<E>> int sum(Filter<T> filter, OrderedColumn<T, E> orderedColumn) {
        String str;
        System.nanoTime();
        SqlSegment sqlSegmentEmit = filter == null ? SqlSegment.NULL : filter.emit();
        SQLiteDatabase sQLiteDatabaseM165598o = m165598o();
        StringBuilder sb = new StringBuilder("SELECT SUM(");
        sb.append(orderedColumn.NAME);
        sb.append(") FROM ");
        sb.append(this.f145283d);
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        if (sqlSegmentEmit.part == null) {
            str = "";
        } else {
            str = " WHERE " + sqlSegmentEmit.part;
        }
        sb.append(str);
        Cursor cursorRawQuery = sQLiteDatabaseM165598o.rawQuery(sb.toString(), sqlSegmentEmit.args);
        try {
            return cursorRawQuery.moveToFirst() ? cursorRawQuery.getInt(0) : -1;
        } finally {
            cursorRawQuery.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void syncUiCache(List<er4> list) {
        DbObject dbObject;
        orh0<T>.C19010c c19010c;
        DbObject dbObject2;
        if (list != null) {
            try {
                for (er4 er4Var : list) {
                    m165585n("syncing " + this.f145283d + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + er4Var.f92880a);
                    int i = er4Var.f92880a;
                    if (i == 0) {
                        DbObject dbObject3 = er4Var.f92881b;
                        Iterator<orh0<T>.C19011d> it = this.f145286g.values().iterator();
                        while (it.hasNext()) {
                            it.next().m165649o(dbObject3);
                        }
                        Iterator<orh0<T>.C19009b> it2 = this.f145290k.values().iterator();
                        while (it2.hasNext()) {
                            it2.next().m165623a(dbObject3);
                        }
                        remove(dbObject3.f56011id);
                    } else if (i == 1) {
                        DbObject dbObject4 = er4Var.f92881b;
                        Iterator<orh0<T>.C19011d> it3 = this.f145286g.values().iterator();
                        while (it3.hasNext()) {
                            it3.next().m165650p(dbObject4);
                        }
                        Iterator<orh0<T>.C19009b> it4 = this.f145290k.values().iterator();
                        while (it4.hasNext()) {
                            it4.next().m165624b(dbObject4);
                        }
                        cache(dbObject4.f56011id, dbObject4);
                    } else if (i == 2) {
                        DbObject dbObject5 = er4Var.f92881b;
                        DbObject dbObject6 = er4Var.f92882c;
                        Iterator<orh0<T>.C19011d> it5 = this.f145286g.values().iterator();
                        while (it5.hasNext()) {
                            it5.next().m165651q(dbObject5, dbObject6);
                        }
                        Iterator<orh0<T>.C19009b> it6 = this.f145290k.values().iterator();
                        while (it6.hasNext()) {
                            it6.next().m165625c(dbObject5, dbObject6);
                        }
                        if (NullChecker.m81303a(dbObject5) && TextUtils.isEmpty(dbObject5.f56011id)) {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("update table id error :" + this.f145283d);
                            stringBuffer.append(", detail: " + dbObject5.toJson());
                            stringBuffer.append(" , new id: ");
                            stringBuffer.append(dbObject6.f56011id);
                            CrashHelper.m81296c(new RuntimeException(stringBuffer.toString()));
                        }
                        if (TextUtils.isEmpty(dbObject5.f56011id) || dbObject5.f56011id.equals(dbObject6.f56011id)) {
                            cache(dbObject6.f56011id, dbObject6);
                        } else {
                            remove(dbObject5.f56011id);
                        }
                    } else if (i == 3) {
                        DbObject dbObject7 = er4Var.f92881b;
                        DbObject dbObject8 = er4Var.f92882c;
                        Iterator<orh0<T>.C19011d> it7 = this.f145286g.values().iterator();
                        while (it7.hasNext()) {
                            it7.next().m165651q(dbObject7, dbObject8);
                        }
                        Iterator<orh0<T>.C19009b> it8 = this.f145290k.values().iterator();
                        while (it8.hasNext()) {
                            it8.next().m165625c(dbObject7, dbObject8);
                        }
                        if (!dbObject7.f56011id.equals(dbObject8.f56011id)) {
                            remove(dbObject7.f56011id);
                        } else if (cached(dbObject8.f56011id) != null) {
                            cache(dbObject8.f56011id, dbObject8);
                        }
                    }
                    DbObject dbObject9 = er4Var.f92881b;
                    if (dbObject9 != null && !TextUtils.isEmpty(dbObject9.f56011id) && (c19010c = this.f145289j.get(er4Var.f92881b.f56011id)) != null && ((dbObject2 = er4Var.f92882c) == null || !er4Var.f92881b.equals(dbObject2))) {
                        c19010c.f145308d = true;
                    }
                    DbObject dbObject10 = er4Var.f92882c;
                    if (dbObject10 != null && ((dbObject = er4Var.f92881b) == null || !TextUtils.equals(dbObject.f56011id, dbObject10.f56011id))) {
                        orh0<T>.C19010c c19010c2 = this.f145289j.get(er4Var.f92882c.f56011id);
                        if (c19010c2 != null) {
                            DbObject dbObject11 = er4Var.f92881b;
                            if (dbObject11 == null) {
                                c19010c2.f145308d = true;
                            } else if (!er4Var.f92882c.equals(dbObject11)) {
                                c19010c2.f145308d = true;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                CrashHelper.m81296c(th);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m165601t(String str, C19010c c19010c, boolean z) {
        this.f145289j.put(str, c19010c);
        c19010c.m165634g(z);
    }

    public void triggerMergeUpdates() {
        Iterator<orh0<T>.C19011d> it = this.f145286g.values().iterator();
        while (it.hasNext()) {
            it.next().m165652r();
        }
        Iterator<orh0<T>.C19009b> it2 = this.f145290k.values().iterator();
        while (it2.hasNext()) {
            it2.next().m165627e();
        }
        Iterator<orh0<T>.C19010c> it3 = this.f145289j.values().iterator();
        while (it3.hasNext()) {
            it3.next().m165633f();
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m165602u(String str) {
        orh0<T>.C19010c c19010c = this.f145289j.get(str);
        if (c19010c == null || c19010c.f145306b.m221518h()) {
            return;
        }
        this.f145289j.remove(str);
    }

    public C22306c<T> uiGet(final String str, final boolean z) {
        n11.m157335h(str != null);
        final orh0<T>.C19010c c19010c = this.f145289j.get(str);
        if (c19010c == null) {
            c19010c = new C19010c(str);
            this.f145289j.put(str, c19010c);
        }
        return c19010c.f145306b.doOnSubscribe(new d30() { // from class: l.frh0
            @Override // p149l.d30
            public final void call() {
                this.f98974a.m165601t(str, c19010c, z);
            }
        }).doOnUnsubscribe(new d30() { // from class: l.grh0
            @Override // p149l.d30
            public final void call() {
                this.f104065a.m165603v(str);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void update(List<j760<Column, Object>> list, Filter filter) {
        System.nanoTime();
        SqlSegment sqlSegmentEmit = filter == null ? SqlSegment.NULL : filter.emit();
        Cursor cursorRawQuery = filter instanceof tnq ? m165598o().rawQuery(((tnq) filter).querySql(null, -1), sqlSegmentEmit.args) : m165598o().query(this.f145283d, null, sqlSegmentEmit.part, sqlSegmentEmit.args, null, null, null);
        ArrayList<DbObject> arrayList = new ArrayList();
        while (cursorRawQuery.moveToNext()) {
            try {
                arrayList.add(this.f145281b.read(cursorRawQuery, 0));
            } catch (Throwable th) {
                cursorRawQuery.close();
                throw th;
            }
        }
        cursorRawQuery.close();
        if (arrayList.size() > 0) {
            ContentValues contentValues = new ContentValues();
            for (j760<Column, Object> j760Var : list) {
                j760Var.f116564a.put(contentValues, j760Var.f116565b);
            }
            m165598o().update(this.f145283d, contentValues, sqlSegmentEmit.part, sqlSegmentEmit.args);
            for (DbObject dbObject : arrayList) {
                try {
                    DbObject dbObject2 = (DbObject) dbObject.mo223809clone();
                    for (j760<Column, Object> j760Var2 : list) {
                        j760Var2.f116564a.set(dbObject2, j760Var2.f116565b);
                    }
                    m165589B(dbObject, dbObject2);
                    m165590C(dbObject, dbObject2);
                    m165588A().update(this, dbObject, dbObject2);
                } catch (CloneNotSupportedException e) {
                    CrashHelper.m81296c(e);
                }
            }
        }
    }

    public void updateBy_id(T t) {
        System.nanoTime();
        SQLiteDatabase sQLiteDatabaseM165598o = m165598o();
        String str = this.f145283d;
        StringBuilder sb = new StringBuilder();
        LongColumn<DbObject> longColumn = DbObject._ID;
        sb.append(longColumn);
        sb.append(" = ?");
        Cursor cursorQuery = sQLiteDatabaseM165598o.query(str, null, sb.toString(), new String[]{Long.toString(t._id)}, null, null, null);
        try {
            T t2 = cursorQuery.moveToNext() ? this.f145281b.read(cursorQuery, 0) : null;
            cursorQuery.close();
            if (t2 != null) {
                ContentValues contentValues = new ContentValues();
                this.f145281b.write(t, contentValues);
                m165598o().update(this.f145283d, contentValues, longColumn + " = ?", new String[]{Long.toString(t._id)});
                m165588A().update(this, t2, t);
            }
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    public T upsert(T t, f30<T, T> f30Var) {
        System.nanoTime();
        SQLiteDatabase sQLiteDatabaseM165598o = m165598o();
        String str = this.f145283d;
        StringBuilder sb = new StringBuilder();
        StringColumn stringColumn = DbObject.f56009ID;
        sb.append(stringColumn);
        sb.append(" = ?");
        Cursor cursorQuery = sQLiteDatabaseM165598o.query(str, null, sb.toString(), new String[]{t.f56011id}, null, null, null);
        try {
            T t2 = cursorQuery.moveToNext() ? this.f145281b.read(cursorQuery, 0) : null;
            cursorQuery.close();
            if (t2 == null) {
                if (f30Var != null) {
                    f30Var.call(t, null);
                }
                ContentValues contentValues = new ContentValues();
                this.f145281b.write(t, contentValues);
                t._id = m165598o().insert(this.f145283d, null, contentValues);
                m165596l(t);
                m165588A().insert(this, t);
                cacheQueryJoinData(t);
                return t;
            }
            t._id = t2._id;
            if (f30Var != null) {
                f30Var.call(t, t2);
            }
            t.mergeData(t2);
            if (!t2.equals(t)) {
                ContentValues contentValues2 = new ContentValues();
                this.f145281b.write(t, contentValues2);
                if (m165598o().update(this.f145283d, contentValues2, stringColumn + " = ?", new String[]{t.f56011id}) > 0) {
                    m165589B(t2, t);
                    m165590C(t2, t);
                    m165588A().update(this, t2, t);
                }
            }
            return t;
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m165603v(final String str) {
        ThreadUtil.m81313h(new Runnable() { // from class: l.irh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f114642a.m165602u(str);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ List m165604w(int i) {
        return query(null, null, i);
    }

    public void warmUp(final int i, int i2) {
        ThreadUtil.m81313h(new Runnable() { // from class: l.hrh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f109223a.m165606y(i);
            }
        }, i2);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m165605x(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DbObject dbObject = (DbObject) it.next();
            cache(dbObject.f56011id, dbObject);
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m165606y(final int i) {
        f8c.m119878o().m119883d(false, new v9j() { // from class: l.jrh0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f119411a.m165604w(i);
            }
        }, new e30() { // from class: l.krh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f124355a.m165605x((List) obj);
            }
        }, null, "warmUp_" + this.f145283d);
    }

    /* JADX INFO: renamed from: z */
    public List<T> m165607z(Filter<T> filter, Order<T> order, int i, boolean z) {
        String str;
        Cursor cursorQuery;
        String str2;
        if (z && !f8c.m119878o().m119894r()) {
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
            cursorQuery = m165598o().rawQuery(((tnq) filter).querySql(order, i), sqlSegmentEmit.args);
        } else {
            cursorQuery = m165598o().query(this.f145283d, null, sqlSegmentEmit.part, sqlSegmentEmit.args, null, null, order != null ? order.emit() : null, str);
        }
        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
        if (z2) {
            ((tnq) filter).querySql(order, i);
        } else {
            SQLiteDatabase sQLiteDatabaseM165598o = m165598o();
            StringBuilder sb = new StringBuilder("SELECT * FROM ");
            sb.append(this.f145283d);
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
            m165586q(sQLiteDatabaseM165598o, sb.toString(), sqlSegmentEmit.args);
        }
        while (cursorQuery.moveToNext()) {
            try {
                T t = this.f145281b.read(cursorQuery, 0);
                arrayList.add(t);
                if (filter instanceof tnq) {
                    tnq tnqVar = (tnq) filter;
                    T t2 = tnqVar.mo189815g().f145281b.read(cursorQuery, this.f145281b.getReadIndex());
                    if (tnqVar.mo189815g().f145281b.init().equals(t2)) {
                        continue;
                    } else {
                        t.addExtraData(t2);
                    }
                }
            } finally {
                cursorQuery.close();
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l.orh0$d */
    public class C19011d {

        /* JADX INFO: renamed from: a */
        public final orh0<T>.C19008a f145310a;

        /* JADX INFO: renamed from: b */
        public orh0<T>.C19011d.a f145311b = null;

        /* JADX INFO: renamed from: c */
        public boolean f145312c = false;

        /* JADX INFO: renamed from: e */
        public AtomicInteger f145314e = new AtomicInteger(0);

        /* JADX INFO: renamed from: d */
        public C22392a<orh0<T>.C19011d.a> f145313d = C22392a.m221512b();

        public C19011d(orh0<T>.C19008a c19008a) {
            this.f145310a = c19008a;
            if (c19008a.f145293c instanceof DoubleOrder) {
                orh0.this.m165599p();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: c */
        public static /* synthetic */ String m165637c(tnq tnqVar, DbObject dbObject) {
            return (String) tnqVar.foreignC().get(dbObject);
        }

        /* JADX INFO: renamed from: h */
        public final boolean m165642h(T t) {
            return m165643i(t, false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: i */
        public final boolean m165643i(T t, boolean z) {
            Filter<T> filter = this.f145310a.f145292b;
            if (!(filter instanceof tnq)) {
                return filter == null || filter.filter(t);
            }
            tnq tnqVar = (tnq) filter;
            if (TextUtils.isEmpty((String) tnqVar.foreignC().get(t))) {
                return false;
            }
            DbObject dbObject = (DbObject) t.getExtTabData(tnqVar.mo189815g().f145281b.getDataClass());
            tnqVar.mo189813e();
            if (!z) {
                return tnqVar.filter(t, dbObject);
            }
            if (tnqVar.baseFilter() == null) {
                return true;
            }
            return tnqVar.baseFilter().filter(t);
        }

        /* JADX INFO: renamed from: j */
        public orh0<T>.C19011d.a m165644j() {
            orh0<T>.C19011d.a aVar = this.f145311b;
            return aVar == null ? this.f145313d.m221515e() : aVar;
        }

        /* JADX INFO: renamed from: k */
        public orh0<T>.C19011d.a m165645k() {
            if (this.f145311b == null && this.f145313d.m221515e() != null) {
                this.f145311b = new a(this.f145313d.m221515e());
                orh0.m165585n(this.f145310a.f145291a + " temp items created for write");
            }
            return this.f145311b;
        }

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ xaj0 m165646l() {
            ArrayList arrayList;
            orh0<T>.C19008a c19008a = this.f145310a;
            int i = c19008a.f145294d;
            if (i <= 0) {
                i = c19008a.f145295e;
            }
            n11.m157335h(i > 0);
            orh0 orh0Var = orh0.this;
            orh0<T>.C19008a c19008a2 = this.f145310a;
            List<T> listQuery = orh0Var.query(c19008a2.f145292b, c19008a2.f145293c, i);
            int size = listQuery.size() < i ? listQuery.size() : this.f145310a.m165612e();
            if (size == 0) {
                arrayList = new ArrayList();
            } else {
                ArrayList arrayList2 = new ArrayList();
                j760<orh0, xaj0<w9j<List<T>, Filter>, v9j<Order>, Integer>> j760Var = orh0.this.f145282c;
                if (j760Var != null) {
                    arrayList2.add(vwb.m200311Y(orh0.this.f145282c.f116564a, j760Var.f116564a.query(j760Var.f116565b.f191751a.call(listQuery), orh0.this.f145282c.f116565b.f191752b.call(), orh0.this.f145282c.f116565b.f191753c.intValue())));
                }
                j760<orh0, List> j760VarM165648n = m165648n(listQuery);
                if (j760VarM165648n != null) {
                    arrayList2.add(j760VarM165648n);
                }
                arrayList = arrayList2;
            }
            return xaj0.m207578a(Integer.valueOf(size), listQuery, arrayList);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: m */
        public final /* synthetic */ void m165647m(xaj0 xaj0Var) {
            this.f145314e.set(2);
            for (DbObject dbObject : (List) xaj0Var.f191752b) {
                orh0.this.cache(dbObject.f56011id, dbObject);
            }
            m165653s((List) xaj0Var.f191753c);
            if (this.f145313d.m221515e() == null) {
                orh0<T>.C19011d.a aVar = new a();
                aVar.f145317b = (List) xaj0Var.f191752b;
                aVar.f145316a = ((Integer) xaj0Var.f191751a).intValue();
                aVar.f145318c = aVar.f145317b.size() == aVar.f145316a;
                this.f145313d.onNext(aVar);
            }
        }

        /* JADX INFO: renamed from: n */
        public final j760<orh0, List> m165648n(List<T> list) {
            Filter<T> filter = this.f145310a.f145292b;
            if (filter instanceof tnq) {
                final tnq tnqVar = (tnq) filter;
                j760<orh0, xaj0<w9j<List<T>, Filter>, v9j<Order>, Integer>> j760Var = orh0.this.f145282c;
                if (j760Var == null || j760Var.f116564a != tnqVar.mo189815g()) {
                    List<String> listM200306T = vwb.m200306T(vwb.m200339n(list, new w9j() { // from class: l.trh0
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return Boolean.valueOf(!TextUtils.isEmpty((String) tnqVar.foreignC().get((DbObject) obj)));
                        }
                    }), new w9j() { // from class: l.urh0
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return orh0.C19011d.m165637c(tnqVar, (DbObject) obj);
                        }
                    });
                    orh0.m165585n("cache join ids -> ids= " + TextUtils.join(Constants.SEPARATOR_COMMA, listM200306T));
                    List<T> listQuery = tnqVar.mo189815g().query(DbObject.f56009ID.m81268IN(listM200306T), null, -1);
                    orh0.m165585n("cache join data size -> size " + listQuery.size());
                    return vwb.m200311Y(tnqVar.mo189815g(), listQuery);
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: o */
        public void m165649o(T t) {
            int iBinarySearchUsingLocalId;
            orh0<T>.C19011d.a aVarM165644j = m165644j();
            orh0.m165585n(this.f145310a.f145291a + " sync cache delete");
            Filter<T> filter = this.f145310a.f145292b;
            if (filter instanceof tnq) {
                ((tnq) filter).mo189815g().queryCache(t.f56011id);
            }
            if (aVarM165644j == null || !m165643i(t, true)) {
                return;
            }
            aVarM165644j.m165659h("sync cache delete inside");
            this.f145312c = true;
            List<T> list = aVarM165644j.f145317b;
            if (list != null) {
                Order<T> order = this.f145310a.f145293c;
                if (order instanceof unq) {
                    iBinarySearchUsingLocalId = orh0.this.m165595k(aVarM165644j.f145317b, t, ((unq) order).m194475h());
                } else {
                    iBinarySearchUsingLocalId = orh0.this.binarySearchUsingLocalId(list, t, order);
                }
                if (iBinarySearchUsingLocalId >= 0) {
                    aVarM165644j = m165645k();
                    aVarM165644j.f145317b.remove(iBinarySearchUsingLocalId);
                    if (aVarM165644j.f145317b.isEmpty() && !aVarM165644j.f145318c) {
                        aVarM165644j.f145318c = true;
                    }
                }
                aVarM165644j.m165659h("item removed");
            }
            if (aVarM165644j.f145316a >= 0) {
                orh0<T>.C19011d.a aVarM165645k = m165645k();
                int i = aVarM165645k.f145316a - 1;
                aVarM165645k.f145316a = i;
                if (i == -1) {
                    aVarM165645k.f145318c = false;
                }
                aVarM165645k.m165659h("size changed");
            }
        }

        /* JADX INFO: renamed from: p */
        public boolean m165650p(T t) {
            orh0<T>.C19011d.a aVarM165644j = m165644j();
            orh0.m165585n(this.f145310a.f145291a + " sync cache insert");
            if (aVarM165644j != null && m165642h(t)) {
                this.f145312c = true;
                List<T> list = aVarM165644j.f145317b;
                if (list == null && aVarM165644j.f145316a <= 0 && !aVarM165644j.f145318c) {
                    aVarM165644j.m165659h("sync cache insert nothing");
                    return false;
                }
                if (list != null && !aVarM165644j.f145318c) {
                    aVarM165644j.m165659h("sync cache insert partial");
                    int iBinarySearchUsingLocalId = orh0.this.binarySearchUsingLocalId(aVarM165644j.f145317b, t, this.f145310a.f145293c);
                    if (iBinarySearchUsingLocalId < 0) {
                        iBinarySearchUsingLocalId = (-iBinarySearchUsingLocalId) - 1;
                    }
                    if (aVarM165644j.f145316a >= 0) {
                        aVarM165644j = m165645k();
                        aVarM165644j.f145316a++;
                        aVarM165644j.m165659h("size updated");
                    }
                    if (iBinarySearchUsingLocalId >= aVarM165644j.f145317b.size()) {
                        return false;
                    }
                    orh0<T>.C19011d.a aVarM165645k = m165645k();
                    aVarM165645k.f145317b.add(iBinarySearchUsingLocalId, t);
                    aVarM165645k.m165659h("item inserted");
                    return true;
                }
                if (list == null && aVarM165644j.f145316a >= 0 && !aVarM165644j.f145318c) {
                    aVarM165644j.m165659h("sync cache insert size");
                    orh0<T>.C19011d.a aVarM165645k2 = m165645k();
                    aVarM165645k2.f145316a++;
                    aVarM165645k2.m165659h("size updated");
                    return false;
                }
                if (list != null && aVarM165644j.f145316a >= 0 && aVarM165644j.f145318c) {
                    aVarM165644j.m165659h("sync cache insert full");
                    int iBinarySearchUsingLocalId2 = orh0.this.binarySearchUsingLocalId(aVarM165644j.f145317b, t, this.f145310a.f145293c);
                    if (iBinarySearchUsingLocalId2 < 0) {
                        iBinarySearchUsingLocalId2 = (-iBinarySearchUsingLocalId2) - 1;
                    }
                    orh0<T>.C19011d.a aVarM165645k3 = m165645k();
                    boolean z = iBinarySearchUsingLocalId2 == aVarM165645k3.f145317b.size();
                    aVarM165645k3.f145316a++;
                    if (!z || aVarM165645k3.f145319d + (this.f145310a.f145295e * 2) > aVarM165645k3.f145317b.size()) {
                        aVarM165645k3.f145317b.add(iBinarySearchUsingLocalId2, t);
                    } else {
                        aVarM165645k3.f145318c = false;
                    }
                    aVarM165645k3.m165659h("sync cache insert full end");
                    return true;
                }
                aVarM165644j.m165659h("what??");
                StringBuilder sb = new StringBuilder("syncCacheInsert IllegalStateException == ");
                sb.append(orh0.this.f145283d);
                sb.append("/");
                sb.append(this.f145310a.f145291a);
                sb.append("\n\t\t\t\tbase:");
                List<T> list2 = aVarM165644j.f145317b;
                sb.append(list2 == null ? "null" : Integer.valueOf(list2.size()));
                sb.append(", size: ");
                sb.append(aVarM165644j.f145316a);
                sb.append(", full: ");
                sb.append(aVarM165644j.f145318c);
                sb.append("\nnewItem:");
                sb.append(t.toJson());
                CrashHelper.m81296c(new Exception(sb.toString()));
                ohg0.m164364a();
            }
            return false;
        }

        /* JADX INFO: renamed from: q */
        public boolean m165651q(T t, T t2) {
            Order<T> order;
            int iBinarySearchUsingLocalId;
            orh0<T>.C19011d.a aVarM165644j = m165644j();
            if ((this.f145310a.f145292b instanceof tnq) && !vwb.m200296J(t.getExtList())) {
                vwb.m200296J(t2.getExtList());
            }
            if (aVarM165644j == null || !((this.f145310a.f145292b == null || (m165642h(t) && m165642h(t2))) && (order = this.f145310a.f145293c) != null && order.compare(t, t2) == 0)) {
                m165649o(t);
                return m165650p(t2);
            }
            this.f145312c = true;
            List<T> list = aVarM165644j.f145317b;
            if (list == null || (iBinarySearchUsingLocalId = orh0.this.binarySearchUsingLocalId(list, t, this.f145310a.f145293c)) < 0) {
                return false;
            }
            m165645k().f145317b.set(iBinarySearchUsingLocalId, t2);
            return true;
        }

        /* JADX INFO: renamed from: r */
        public void m165652r() {
            if (this.f145312c) {
                orh0<T>.C19011d.a aVarM165644j = m165644j();
                if (aVarM165644j != null) {
                    this.f145313d.onNext(aVarM165644j);
                }
                orh0.m165585n("triggered query " + this.f145310a.f145291a);
                this.f145311b = null;
                this.f145312c = false;
            }
        }

        /* JADX INFO: renamed from: s */
        public final void m165653s(List<j760<orh0, List>> list) {
            String str;
            if (list.size() > 0) {
                for (j760<orh0, List> j760Var : list) {
                    for (DbObject dbObject : j760Var.f116565b) {
                        if (dbObject != null && (str = dbObject.f56011id) != null) {
                            j760Var.f116564a.cache(str, dbObject);
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: t */
        public void m165654t(boolean z) {
            if (!z || orh0.f145279l) {
                this.f145314e.set(2);
                this.f145313d.onNext(new a());
            } else if (this.f145314e.compareAndSet(0, 1)) {
                orh0.this.m165594j(false, new v9j() { // from class: l.rrh0
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return this.f160749a.m165646l();
                    }
                }, new e30() { // from class: l.srh0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f166096a.m165647m((xaj0) obj);
                    }
                }, null, true, "uiquery_" + orh0.this.f145283d + "_" + this.f145310a.f145291a);
            }
        }

        /* JADX INFO: renamed from: l.orh0$d$a */
        public class a extends AbstractList<T> {

            /* JADX INFO: renamed from: a */
            public int f145316a;

            /* JADX INFO: renamed from: b */
            public List<T> f145317b;

            /* JADX INFO: renamed from: c */
            public boolean f145318c;

            /* JADX INFO: renamed from: d */
            public int f145319d;

            /* JADX INFO: renamed from: e */
            public long f145320e;

            public a(orh0<T>.C19011d.a aVar) {
                this.f145316a = -1;
                this.f145317b = null;
                this.f145318c = false;
                this.f145319d = -1;
                this.f145320e = -1L;
                this.f145316a = aVar.f145316a;
                this.f145317b = aVar.f145317b != null ? new ArrayList(aVar.f145317b) : null;
                this.f145318c = aVar.f145318c;
                this.f145319d = aVar.f145319d;
            }

            @Override // java.util.AbstractList, java.util.Collection, java.util.List
            public boolean equals(@Nullable Object obj) {
                return super.equals(obj);
            }

            /* JADX INFO: renamed from: h */
            public void m165659h(String str) {
                StringBuilder sb = new StringBuilder();
                sb.append(orh0.this.f145283d);
                sb.append("/");
                sb.append(C19011d.this.f145310a.f145291a);
                sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                sb.append(str);
                sb.append("\n\t\t\t\tbase:");
                List<T> list = this.f145317b;
                sb.append(list == null ? "null" : Integer.valueOf(list.size()));
                sb.append(", size: ");
                sb.append(this.f145316a);
                sb.append(", full: ");
                sb.append(this.f145318c);
                orh0.m165585n(sb.toString());
            }

            @Override // java.util.AbstractList, java.util.List
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public T get(int i) {
                int iMin = Math.min(i, this.f145319d - 1);
                this.f145319d = iMin;
                if (iMin < -1) {
                    this.f145319d = -1;
                }
                m165666s(i);
                if (i >= C19011d.this.f145310a.f145294d) {
                    m165667v(i);
                }
                return this.f145317b.get(i);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public boolean isEmpty() {
                if (this.f145317b == null) {
                    m165666s(0);
                }
                return size() <= 0;
            }

            @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
            @NonNull
            public Iterator<T> iterator() {
                return super.iterator();
            }

            /* JADX INFO: renamed from: j */
            public void m165661j(String str) {
                StringBuilder sb = new StringBuilder();
                sb.append(orh0.this.f145283d);
                sb.append("/");
                sb.append(C19011d.this.f145310a.f145291a);
                sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                sb.append(str);
                sb.append("\n\t\t\t\tbase:");
                List<T> list = this.f145317b;
                sb.append(list == null ? "null" : Integer.valueOf(list.size()));
                sb.append(", size: ");
                sb.append(this.f145316a);
                sb.append(", full: ");
                sb.append(this.f145318c);
                orh0.m165587r(sb.toString());
            }

            /* JADX INFO: renamed from: l */
            public final /* synthetic */ j760 m165662l(Filter filter, int i) {
                C19011d c19011d = C19011d.this;
                List<T> listQuery = orh0.this.query(filter, c19011d.f145310a.f145293c, i);
                ArrayList arrayList = new ArrayList();
                j760<orh0, xaj0<w9j<List<T>, Filter>, v9j<Order>, Integer>> j760Var = orh0.this.f145282c;
                if (j760Var != null) {
                    arrayList.add(vwb.m200311Y(orh0.this.f145282c.f116564a, j760Var.f116564a.query(j760Var.f116565b.f191751a.call(listQuery), orh0.this.f145282c.f116565b.f191752b.call(), orh0.this.f145282c.f116565b.f191753c.intValue())));
                }
                j760 j760VarM165648n = C19011d.this.m165648n(listQuery);
                if (j760VarM165648n != null) {
                    arrayList.add(j760VarM165648n);
                }
                return vwb.m200311Y(listQuery, arrayList);
            }

            /* JADX INFO: renamed from: o */
            public final /* synthetic */ void m165663o(a aVar, int i, int i2, j760 j760Var) {
                C19011d.this.f145314e.set(2);
                for (DbObject dbObject : (List) j760Var.f116564a) {
                    orh0.this.cache(dbObject.f56011id, dbObject);
                }
                C19011d.this.m165653s((List) j760Var.f116565b);
                orh0<T>.C19011d.a aVarM165644j = C19011d.this.m165644j();
                if (aVarM165644j != null && aVarM165644j == aVar && aVarM165644j.size() == i) {
                    this.f145317b.addAll((Collection) j760Var.f116564a);
                    if (((List) j760Var.f116564a).size() != i2) {
                        this.f145316a = this.f145317b.size();
                        this.f145318c = true;
                    }
                }
            }

            /* JADX INFO: renamed from: p */
            public final /* synthetic */ void m165664p() {
                C19011d.this.f145314e.set(2);
            }

            /* JADX INFO: renamed from: r */
            public void m165665r() {
                if (ThreadUtil.m81311f()) {
                    m165659h("query size called");
                }
                orh0.this.m165599p();
                int iM165612e = C19011d.this.f145310a.m165612e();
                this.f145316a = iM165612e;
                List<T> list = this.f145317b;
                if (list != null) {
                    this.f145318c = iM165612e == list.size();
                } else if (iM165612e == 0) {
                    this.f145317b = new ArrayList(0);
                    this.f145318c = true;
                }
            }

            /* JADX INFO: renamed from: s */
            public void m165666s(int i) {
                if (this.f145317b == null) {
                    this.f145317b = new ArrayList();
                }
                if (i >= this.f145317b.size()) {
                    m165658g(i);
                    int size = this.f145317b.size();
                    orh0<T>.C19008a c19008a = C19011d.this.f145310a;
                    int i2 = c19008a.f145294d;
                    if (i >= i2) {
                        i2 = c19008a.f145295e;
                    }
                    Filter<T> filterM165618k = c19008a.m165618k(this.f145317b);
                    int iMin = Math.min(C19011d.this.f145310a.m165619l(this.f145317b, i, i2), this.f145316a - this.f145317b.size());
                    m165659h("query cache called " + iMin);
                    C19011d c19011d = C19011d.this;
                    this.f145317b.addAll(orh0.this.queryCache(filterM165618k, c19011d.f145310a.f145293c, iMin));
                    if (this.f145317b.size() < iMin + size) {
                        this.f145318c = true;
                        this.f145316a = this.f145317b.size();
                    }
                    if (ThreadUtil.m81311f()) {
                        m165659h("status updated");
                    }
                }
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                orh0.m165585n("size called with " + this.f145316a);
                if (this.f145316a == -1) {
                    m165665r();
                }
                return this.f145316a;
            }

            @Override // java.util.AbstractCollection
            public String toString() {
                StringBuilder sb = new StringBuilder("size: ");
                sb.append(this.f145316a);
                sb.append("\nfull: ");
                sb.append(this.f145318c);
                sb.append("\nbase: ");
                if (this.f145317b == null) {
                    sb.append("null");
                } else {
                    sb.append("size ");
                    sb.append(this.f145317b.size());
                    sb.append("\n[");
                    sb.append(vwb.m200307U(this.f145317b, "; "));
                    sb.append(Constants.AES_SUFFIX);
                }
                return sb.toString();
            }

            /* JADX INFO: renamed from: v */
            public final void m165667v(int i) {
                List<T> list = this.f145317b;
                if (list == null || i < C19011d.this.f145310a.f145294d || this.f145318c || list.size() - i > C19011d.this.f145310a.f145295e / 2 || SystemClock.uptimeMillis() - this.f145320e <= 1) {
                    return;
                }
                this.f145320e = SystemClock.uptimeMillis();
                final int size = this.f145317b.size();
                orh0<T>.C19008a c19008a = C19011d.this.f145310a;
                int i2 = c19008a.f145294d;
                if (i >= i2) {
                    i2 = c19008a.f145295e;
                }
                final Filter<T> filterM165618k = c19008a.m165618k(this.f145317b);
                final int iM165619l = C19011d.this.f145310a.m165619l(this.f145317b, i, i2);
                if (!C19011d.this.f145314e.compareAndSet(2, 1) || orh0.f145279l) {
                    return;
                }
                m165661j("preloading");
                orh0.this.m165593i(true, new v9j() { // from class: l.vrh0
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return this.f182725a.m165662l(filterM165618k, iM165619l);
                    }
                }, new e30() { // from class: l.wrh0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f187797a.m165663o(this, size, iM165619l, (j760) obj);
                    }
                }, new d30() { // from class: l.xrh0
                    @Override // p149l.d30
                    public final void call() {
                        this.f194146a.m165664p();
                    }
                }, "uiquery_tryPreload_" + orh0.this.f145283d + "_" + C19011d.this.f145310a.f145291a);
            }

            /* JADX INFO: renamed from: g */
            public void m165658g(int i) {
            }

            public a() {
                this.f145317b = null;
                this.f145318c = false;
                this.f145319d = -1;
                this.f145320e = -1L;
                this.f145316a = -1;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m165585n(String str) {
    }

    /* JADX INFO: renamed from: r */
    public static void m165587r(String str) {
    }

    public T query(long j) {
        List<T> listQuery = query(DbObject._ID.mo60175EQ(Long.valueOf(j)), null, 1);
        if (listQuery.isEmpty()) {
            return null;
        }
        return listQuery.get(0);
    }

    public List<T> query(Filter<T> filter, Order<T> order, int i) {
        return m165607z(filter, order, i, true);
    }

    public C22306c<T> uiGet(String str) {
        return uiGet(str, true);
    }

    public orh0(String str, mrf0<T> mrf0Var, List<Index> list, int i) {
        super(i);
        this.f145282c = null;
        this.f145284e = null;
        this.f145285f = true;
        this.f145286g = new ConcurrentHashMap<>();
        this.f145287h = new ConcurrentHashMap<>();
        this.f145288i = new ConcurrentHashMap<>();
        this.f145289j = new ConcurrentHashMap<>();
        this.f145290k = new ConcurrentHashMap<>();
        this.f145283d = str;
        this.f145281b = mrf0Var;
        list = list == null ? new ArrayList<>() : list;
        this.f145280a = list;
        list.add(new Index(DbObject.f56009ID));
    }

    public void delete(String str) {
        delete(DbObject.f56009ID.mo60175EQ(str));
    }

    public void delete(long j) {
        delete(DbObject._ID.mo60175EQ(Long.valueOf(j)));
    }

    public void upsert(T t) {
        upsert(t, null);
    }

    public T queryCache(String str) {
        n11.m157335h(str != null);
        T tCached = cached(str);
        if (tCached == null) {
            m165599p();
            tCached = null;
            List<T> listQueryCache = queryCache(DbObject.f56009ID.mo60175EQ(str), null, 1);
            if (listQueryCache != null && listQueryCache.size() != 0) {
                return listQueryCache.get(0);
            }
        }
        return tCached;
    }
}
