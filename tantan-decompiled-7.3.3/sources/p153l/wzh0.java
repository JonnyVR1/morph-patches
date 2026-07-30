package p153l;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.dbcenter.p062db.opt.TransactionOpt;
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
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes12.dex */
public class wzh0<T extends DbObject> extends LruCache2<String, T> {

    /* JADX INFO: renamed from: l */
    public static boolean f191756l = false;

    /* JADX INFO: renamed from: a */
    public final List<Index> f191757a;

    /* JADX INFO: renamed from: b */
    public final vzf0<T> f191758b;

    /* JADX INFO: renamed from: c */
    public pf60<wzh0, bkj0<qcj<List<T>, Filter>, pcj<Order>, Integer>> f191759c;

    /* JADX INFO: renamed from: d */
    public final String f191760d;

    /* JADX INFO: renamed from: e */
    public Map<String, h0i0> f191761e;

    /* JADX INFO: renamed from: f */
    public boolean f191762f;

    /* JADX INFO: renamed from: g */
    public ConcurrentHashMap<String, wzh0<T>.C21216d> f191763g;

    /* JADX INFO: renamed from: h */
    public ConcurrentHashMap<String, spq> f191764h;

    /* JADX INFO: renamed from: i */
    public ConcurrentHashMap<String, spq> f191765i;

    /* JADX INFO: renamed from: j */
    public ConcurrentHashMap<String, wzh0<T>.C21215c> f191766j;

    /* JADX INFO: renamed from: k */
    public ConcurrentHashMap<String, wzh0<T>.C21214b> f191767k;

    /* JADX INFO: renamed from: l.wzh0$a */
    public class C21213a {

        /* JADX INFO: renamed from: a */
        public final String f191768a;

        /* JADX INFO: renamed from: b */
        public final Filter<T> f191769b;

        /* JADX INFO: renamed from: c */
        @NonNull
        public final Order<T> f191770c;

        /* JADX INFO: renamed from: d */
        public final int f191771d;

        /* JADX INFO: renamed from: e */
        public final int f191772e;

        /* JADX INFO: renamed from: f */
        public ConcurrentHashMap<String, wzh0<T>.C21213a> f191773f = new ConcurrentHashMap<>();

        /* JADX INFO: renamed from: l.wzh0$a$a */
        public class a extends AbstractList<T> {

            /* JADX INFO: renamed from: a */
            public List<T> f191775a = new ArrayList();

            /* JADX INFO: renamed from: b */
            public int f191776b = -1;

            public a() {
            }

            @Override // java.util.AbstractList, java.util.List
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public T get(int i) {
                if (this.f191775a.size() <= i) {
                    List<T> list = this.f191775a;
                    C21213a c21213a = C21213a.this;
                    wzh0 wzh0Var = wzh0.this;
                    Filter<T> filterM208675k = c21213a.m208675k(list);
                    C21213a c21213a2 = C21213a.this;
                    list.addAll(wzh0Var.query(filterM208675k, c21213a2.f191770c, c21213a2.m208676l(this.f191775a, i, i == 0 ? 1 : 20)));
                }
                return this.f191775a.get(i);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                if (this.f191776b == -1) {
                    this.f191776b = C21213a.this.m208669e();
                }
                return this.f191776b;
            }
        }

        public C21213a(String str, @NonNull Filter<T> filter, Order<T> order, int i, int i2) {
            u11.m193890d(order);
            this.f191768a = str;
            this.f191769b = filter;
            this.f191770c = order;
            this.f191771d = i;
            this.f191772e = i2;
        }

        /* JADX INFO: renamed from: e */
        public int m208669e() {
            return wzh0.this.count(this.f191769b, -1);
        }

        /* JADX INFO: renamed from: f */
        public boolean m208670f() {
            return wzh0.this.query(this.f191769b, this.f191770c, 1).size() == 0;
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m208671g(C21216d c21216d, boolean z) {
            wzh0.this.f191763g.put(this.f191768a, c21216d);
            c21216d.m208711t(z);
        }

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ void m208672h() {
            wzh0<T>.C21216d c21216d = wzh0.this.f191763g.get(this.f191768a);
            if (c21216d == null || c21216d.f191790d.m222764h()) {
                return;
            }
            wzh0.this.f191763g.remove(this.f191768a);
        }

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ void m208673i() {
            ThreadUtil.m82496h(new Runnable() { // from class: l.vzh0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f186486a.m208672h();
                }
            }, 1000L);
        }

        /* JADX INFO: renamed from: j */
        public List<T> m208674j() {
            return new a();
        }

        /* JADX INFO: renamed from: k */
        public Filter<T> m208675k(List<T> list) {
            if (list.size() == 0) {
                return this.f191769b;
            }
            T t = list.get(list.size() - 1);
            Filter<T> filter = this.f191769b;
            return filter instanceof spq ? spq.m187434b((spq) filter, this.f191770c, list.get(list.size() - 1)) : Filter.AND(filter, this.f191770c.GT_EQ(list.get(list.size() - 1)), DbObject._ID.NEQ(Long.valueOf(t._id)));
        }

        /* JADX INFO: renamed from: l */
        public int m208676l(List<T> list, int i, int i2) {
            return Math.max(i2, (i - list.size()) + 1);
        }

        /* JADX INFO: renamed from: m */
        public C22421c<List<T>> m208677m() {
            return m208678n(true);
        }

        /* JADX INFO: renamed from: n */
        public C22421c<List<T>> m208678n(final boolean z) {
            final wzh0<T>.C21216d c21216d = wzh0.this.f191763g.get(this.f191768a);
            if (c21216d == null) {
                c21216d = new C21216d(this);
                wzh0.this.f191763g.put(this.f191768a, c21216d);
                Filter<T> filter = this.f191769b;
                if (filter instanceof spq) {
                    spq spqVar = (spq) filter;
                    wzh0.this.f191764h.put(this.f191768a, spqVar);
                    spqVar.mo187439g().f191765i.put(this.f191768a, spqVar);
                }
            }
            return c21216d.f191790d.doOnSubscribe(new x20() { // from class: l.tzh0
                @Override // p153l.x20
                public final void call() {
                    this.f176760a.m208671g(c21216d, z);
                }
            }).doOnUnsubscribe(new x20() { // from class: l.uzh0
                @Override // p153l.x20
                public final void call() {
                    this.f181791a.m208673i();
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.wzh0$b */
    public class C21214b {

        /* JADX INFO: renamed from: a */
        public final wzh0<T>.C21213a f191778a;

        /* JADX INFO: renamed from: b */
        public final C22507a<Integer> f191779b;

        /* JADX INFO: renamed from: c */
        public boolean f191780c;

        /* JADX INFO: renamed from: d */
        public int f191781d;

        /* JADX INFO: renamed from: a */
        public void m208680a(T t) {
            if (m208683d() == -99 || !this.f191778a.f191769b.filter(t)) {
                return;
            }
            this.f191780c = true;
            this.f191781d = m208683d() - 1;
        }

        /* JADX INFO: renamed from: b */
        public void m208681b(T t) {
            if (m208683d() == -99 || !this.f191778a.f191769b.filter(t)) {
                return;
            }
            this.f191780c = true;
            this.f191781d = m208683d() + 1;
        }

        /* JADX INFO: renamed from: c */
        public void m208682c(T t, T t2) {
            if (m208683d() != -99) {
                if (this.f191778a.f191769b.filter(t) && !this.f191778a.f191769b.filter(t2)) {
                    this.f191781d = m208683d() - 1;
                    this.f191780c = true;
                } else {
                    if (this.f191778a.f191769b.filter(t) || !this.f191778a.f191769b.filter(t2)) {
                        return;
                    }
                    this.f191781d = m208683d() + 1;
                    this.f191780c = true;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public int m208683d() {
            return (this.f191779b.m222761e() == null || this.f191781d != -99) ? this.f191781d : this.f191779b.m222761e().intValue();
        }

        /* JADX INFO: renamed from: e */
        public void m208684e() {
            if (this.f191780c) {
                this.f191779b.onNext(Integer.valueOf(m208683d()));
                this.f191781d = -99;
                this.f191780c = false;
            }
        }
    }

    /* JADX INFO: renamed from: l.wzh0$c */
    public class C21215c {

        /* JADX INFO: renamed from: a */
        public final String f191782a;

        /* JADX INFO: renamed from: c */
        public AtomicInteger f191784c = new AtomicInteger(0);

        /* JADX INFO: renamed from: d */
        public boolean f191785d = false;

        /* JADX INFO: renamed from: b */
        public final C22507a<T> f191783b = C22507a.m222758b();

        public C21215c(String str) {
            this.f191782a = str;
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ DbObject m208688d() {
            return wzh0.this.query(this.f191782a);
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m208689e(DbObject dbObject) {
            this.f191784c.set(2);
            if (dbObject != null) {
                wzh0.this.cache(dbObject.f56859id, dbObject);
            }
            this.f191783b.onNext(dbObject);
        }

        /* JADX INFO: renamed from: f */
        public void m208690f() {
            if (this.f191785d) {
                this.f191783b.onNext((T) wzh0.this.queryCache(this.f191782a));
                wzh0.m208642n("triggered get " + this.f191782a);
                this.f191785d = false;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: g */
        public void m208691g(boolean z) {
            if (this.f191784c.compareAndSet(0, 1)) {
                DbObject dbObject = (DbObject) wzh0.this.cached(this.f191782a);
                if (dbObject != null) {
                    this.f191784c.set(2);
                    this.f191783b.onNext((T) dbObject);
                    return;
                }
                if (!z || wzh0.f191756l) {
                    this.f191784c.set(2);
                    this.f191783b.onNext((T) wzh0.this.queryCache(this.f191782a));
                    return;
                }
                wzh0.this.m208651j(false, new pcj() { // from class: l.xzh0
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return this.f196875a.m208688d();
                    }
                }, new y20() { // from class: l.yzh0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f202196a.m208689e((DbObject) obj);
                    }
                }, null, true, "uiget_" + wzh0.this.f191760d + "_" + this.f191782a);
            }
        }
    }

    public wzh0(h9c h9cVar, String str, vzf0<T> vzf0Var, List<Index> list, int i) {
        super(i);
        this.f191759c = null;
        this.f191761e = null;
        this.f191762f = true;
        this.f191763g = new ConcurrentHashMap<>();
        this.f191764h = new ConcurrentHashMap<>();
        this.f191765i = new ConcurrentHashMap<>();
        this.f191766j = new ConcurrentHashMap<>();
        this.f191767k = new ConcurrentHashMap<>();
        this.f191760d = str;
        this.f191758b = vzf0Var;
        list = list == null ? new ArrayList<>() : list;
        this.f191757a = list;
        list.add(new Index(DbObject.f56857ID));
        if (h9cVar != null) {
            h9cVar.mo134045f().add(this);
        }
    }

    /* JADX INFO: renamed from: q */
    public static String m208643q(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
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
    public TransactionOpt m208645A() {
        return l9c.m153394o().m153409q();
    }

    /* JADX INFO: renamed from: B */
    public final void m208646B(T t, T t2) {
        ConcurrentHashMap<String, spq> concurrentHashMap = this.f191764h;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<String, spq>> it = this.f191764h.entrySet().iterator();
        while (it.hasNext()) {
            spq value = it.next().getValue();
            DbObject dbObjectQuery = value.mo187439g().query(t2.f56859id);
            if (dbObjectQuery != null) {
                value.mo187439g().cache(dbObjectQuery.f56859id, dbObjectQuery);
                if (t != null) {
                    t.addExtraData(dbObjectQuery);
                }
                t2.addExtraData(dbObjectQuery);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    public final void m208647C(T t, T t2) {
        ConcurrentHashMap<String, spq> concurrentHashMap = this.f191765i;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<String, spq>> it = this.f191765i.entrySet().iterator();
        while (it.hasNext()) {
            spq value = it.next().getValue();
            DbObject dbObjectQuery = value.mo187436d().query(t2.f56859id);
            if (m208654m(value.mo187438f(), t) || m208654m(value.mo187438f(), t2)) {
                if (dbObjectQuery != null && (value.baseFilter() == null || value.baseFilter().filter(dbObjectQuery))) {
                    try {
                        DbObject dbObject = (DbObject) dbObjectQuery.mo225055clone();
                        dbObjectQuery.addExtraData(t2);
                        dbObject.addExtraData(t);
                        m208645A().update(value.mo187436d(), dbObject, dbObjectQuery);
                    } catch (Exception e) {
                        CrashHelper.m82479c(e);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D */
    public final void m208648D(T t) {
        ConcurrentHashMap<String, spq> concurrentHashMap = this.f191765i;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<String, spq>> it = this.f191765i.entrySet().iterator();
        while (it.hasNext()) {
            spq value = it.next().getValue();
            DbObject dbObjectQuery = (DbObject) value.mo187436d().cached(t.f56859id);
            if (dbObjectQuery == null) {
                dbObjectQuery = value.mo187436d().query(t.f56859id);
            }
            if (dbObjectQuery != null && (value.baseFilter() == null || value.baseFilter().filter(dbObjectQuery))) {
                try {
                    DbObject dbObject = (DbObject) dbObjectQuery.mo225055clone();
                    DbObject dbObject2 = (DbObject) dbObjectQuery.mo225055clone();
                    dbObject.setExtList(dbObjectQuery.getExtList());
                    dbObject2.setExtList(dbObjectQuery.getExtList());
                    dbObject2.removeExtTable(t);
                    m208645A().joinUpdate(value.mo187436d(), dbObject, dbObject2);
                } catch (Exception e) {
                    CrashHelper.m82479c(e);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public final void m208649E(T t) {
        DbObject dbObject;
        if (this.f191764h.size() > 0) {
            for (spq spqVar : this.f191764h.values()) {
                if (spqVar.baseFilter() == null || spqVar.baseFilter().filter(t)) {
                    if (!TextUtils.isEmpty((String) spqVar.foreignC().get(t)) && (dbObject = (DbObject) spqVar.mo187436d().cached(t.f56859id)) != null) {
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
        if (this.f191764h.size() > 0) {
            Iterator<Map.Entry<String, spq>> it = this.f191764h.entrySet().iterator();
            while (it.hasNext()) {
                spq value = it.next().getValue();
                if (value.baseFilter() == null || value.baseFilter().filter(t)) {
                    if (!TextUtils.isEmpty((String) value.foreignC().get(t)) && (dbObjectQuery = value.mo187439g().query((String) value.foreignC().get(t))) != null) {
                        t.addExtraData(dbObjectQuery);
                        value.mo187439g().cache(dbObjectQuery.f56859id, dbObjectQuery);
                    }
                }
            }
            for (spq spqVar : this.f191764h.values()) {
            }
        }
    }

    public int count(Filter<T> filter, int i) {
        String str;
        Cursor cursorRawQuery;
        System.nanoTime();
        SqlSegment sqlSegmentEmit = filter == null ? SqlSegment.NULL : filter.emit();
        if (filter instanceof spq) {
            cursorRawQuery = m208655o().rawQuery(((spq) filter).countSql(), sqlSegmentEmit.args);
        } else {
            SQLiteDatabase sQLiteDatabaseM208655o = m208655o();
            StringBuilder sb = new StringBuilder("select count(_id) from ");
            sb.append(this.f191760d);
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            if (sqlSegmentEmit.part == null) {
                str = "";
            } else {
                str = " WHERE " + sqlSegmentEmit.part;
            }
            sb.append(str);
            cursorRawQuery = sQLiteDatabaseM208655o.rawQuery(sb.toString(), sqlSegmentEmit.args);
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
        Cursor cursorRawQuery = filter instanceof spq ? m208655o().rawQuery(((spq) filter).querySql(null, -1), sqlSegmentEmit.args) : m208655o().query(this.f191760d, null, sqlSegmentEmit.part, sqlSegmentEmit.args, null, null, null);
        ArrayList<DbObject> arrayList = new ArrayList();
        while (cursorRawQuery.moveToNext()) {
            try {
                arrayList.add(this.f191758b.read(cursorRawQuery, 0));
            } catch (Throwable th) {
                cursorRawQuery.close();
                throw th;
            }
        }
        cursorRawQuery.close();
        m208655o().delete(this.f191760d, sqlSegmentEmit.part, sqlSegmentEmit.args);
        for (DbObject dbObject : arrayList) {
            m208648D(dbObject);
            m208649E(dbObject);
            m208645A().delete(this, dbObject);
        }
    }

    public void deleteAll() {
        delete(Filter.TRUE);
    }

    /* JADX INFO: renamed from: i */
    public <T> void m208650i(boolean z, pcj<T> pcjVar, y20<T> y20Var, x20 x20Var, String str) {
        l9c.m153394o().m153399d(z, pcjVar, y20Var, x20Var, str);
    }

    public void insert(T t) {
        m208657s(t, false);
    }

    /* JADX INFO: renamed from: j */
    public <T> void m208651j(boolean z, pcj<T> pcjVar, y20<T> y20Var, x20 x20Var, boolean z2, String str) {
        l9c.m153394o().m153400e(z, pcjVar, y20Var, x20Var, z2, str);
    }

    /* JADX INFO: renamed from: k */
    public final <K extends DbObject> int m208652k(List<K> list, K k, Order<K> order) {
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
    public void m208653l(T t) {
        ConcurrentHashMap<String, spq> concurrentHashMap = this.f191765i;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<String, spq>> it = this.f191765i.entrySet().iterator();
        while (it.hasNext()) {
            spq value = it.next().getValue();
            DbObject dbObjectQuery = (DbObject) value.mo187436d().cached(t.f56859id);
            if (dbObjectQuery == null) {
                dbObjectQuery = value.mo187436d().query(t.f56859id);
            }
            if (dbObjectQuery != null && (value.baseFilter() == null || value.baseFilter().filter(dbObjectQuery))) {
                try {
                    DbObject dbObject = (DbObject) dbObjectQuery.mo225055clone();
                    DbObject dbObject2 = (DbObject) dbObjectQuery.mo225055clone();
                    dbObject.setExtList(dbObjectQuery.getExtList());
                    dbObject2.setExtList(dbObjectQuery.getExtList());
                    dbObject2.addExtraData(t);
                    m208645A().update(value.mo187436d(), dbObject, dbObject2);
                } catch (Exception e) {
                    CrashHelper.m82479c(e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m208654m(Filter filter, T t) {
        if (filter == null) {
            return true;
        }
        if (t == null) {
            return false;
        }
        return filter.filter(t);
    }

    /* JADX INFO: renamed from: o */
    public SQLiteDatabase m208655o() {
        return l9c.m153394o().m153402h();
    }

    /* JADX INFO: renamed from: p */
    public void m208656p() {
        l9c.m153394o().m153407m();
    }

    public T query(String str) {
        u11.m193894h(str != null);
        List<T> listQuery = query(DbObject.f56857ID.mo61359EQ(str), null, 1);
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
        m208656p();
        if (filter instanceof spq) {
            cursorQuery = m208655o().rawQuery(((spq) filter).querySql(order, i), sqlSegmentEmit.args);
        } else {
            cursorQuery = m208655o().query(this.f191760d, null, sqlSegmentEmit.part, sqlSegmentEmit.args, null, null, order != null ? order.emit() : null, str);
        }
        ArrayList arrayList = new ArrayList(10);
        try {
            int columnIndex = cursorQuery.getColumnIndex(DbObject.f56857ID.NAME);
            if (columnIndex >= 0) {
                while (cursorQuery.moveToNext()) {
                    if (!cursorQuery.isNull(columnIndex)) {
                        String string = cursorQuery.getString(columnIndex);
                        T tCached = cached(string);
                        if (tCached == null) {
                            tCached = this.f191758b.read(cursorQuery, 0);
                            if (filter instanceof spq) {
                                spq spqVar = (spq) filter;
                                T t = spqVar.mo187439g().f191758b.read(cursorQuery, this.f191758b.getReadIndex());
                                if (!spqVar.mo187439g().f191758b.init().equals(t)) {
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
    public void m208657s(T t, boolean z) {
        if (z) {
            ArrayList<ValueObject> extList = t.getExtList();
            if (!jyb.m147479J(extList)) {
                for (ValueObject valueObject : extList) {
                    wzh0 wzh0VarM153408n = l9c.m153394o().m153408n(this.f191760d, valueObject);
                    if (wzh0VarM153408n != 0 && (valueObject instanceof DbObject)) {
                        wzh0VarM153408n.insert((DbObject) valueObject);
                    }
                }
            }
        }
        System.nanoTime();
        ContentValues contentValues = new ContentValues();
        this.f191758b.write(t, contentValues);
        t._id = m208655o().insert(this.f191760d, null, contentValues);
        m208653l(t);
        m208645A().insert(this, t);
        cacheQueryJoinData(t);
    }

    public <E extends Comparable<E>> int sum(Filter<T> filter, OrderedColumn<T, E> orderedColumn) {
        String str;
        System.nanoTime();
        SqlSegment sqlSegmentEmit = filter == null ? SqlSegment.NULL : filter.emit();
        SQLiteDatabase sQLiteDatabaseM208655o = m208655o();
        StringBuilder sb = new StringBuilder("SELECT SUM(");
        sb.append(orderedColumn.NAME);
        sb.append(") FROM ");
        sb.append(this.f191760d);
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        if (sqlSegmentEmit.part == null) {
            str = "";
        } else {
            str = " WHERE " + sqlSegmentEmit.part;
        }
        sb.append(str);
        Cursor cursorRawQuery = sQLiteDatabaseM208655o.rawQuery(sb.toString(), sqlSegmentEmit.args);
        try {
            return cursorRawQuery.moveToFirst() ? cursorRawQuery.getInt(0) : -1;
        } finally {
            cursorRawQuery.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void syncUiCache(List<ds4> list) {
        DbObject dbObject;
        wzh0<T>.C21215c c21215c;
        DbObject dbObject2;
        if (list != null) {
            try {
                for (ds4 ds4Var : list) {
                    m208642n("syncing " + this.f191760d + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ds4Var.f90453a);
                    int i = ds4Var.f90453a;
                    if (i == 0) {
                        DbObject dbObject3 = ds4Var.f90454b;
                        Iterator<wzh0<T>.C21216d> it = this.f191763g.values().iterator();
                        while (it.hasNext()) {
                            it.next().m208706o(dbObject3);
                        }
                        Iterator<wzh0<T>.C21214b> it2 = this.f191767k.values().iterator();
                        while (it2.hasNext()) {
                            it2.next().m208680a(dbObject3);
                        }
                        remove(dbObject3.f56859id);
                    } else if (i == 1) {
                        DbObject dbObject4 = ds4Var.f90454b;
                        Iterator<wzh0<T>.C21216d> it3 = this.f191763g.values().iterator();
                        while (it3.hasNext()) {
                            it3.next().m208707p(dbObject4);
                        }
                        Iterator<wzh0<T>.C21214b> it4 = this.f191767k.values().iterator();
                        while (it4.hasNext()) {
                            it4.next().m208681b(dbObject4);
                        }
                        cache(dbObject4.f56859id, dbObject4);
                    } else if (i == 2) {
                        DbObject dbObject5 = ds4Var.f90454b;
                        DbObject dbObject6 = ds4Var.f90455c;
                        Iterator<wzh0<T>.C21216d> it5 = this.f191763g.values().iterator();
                        while (it5.hasNext()) {
                            it5.next().m208708q(dbObject5, dbObject6);
                        }
                        Iterator<wzh0<T>.C21214b> it6 = this.f191767k.values().iterator();
                        while (it6.hasNext()) {
                            it6.next().m208682c(dbObject5, dbObject6);
                        }
                        if (NullChecker.m82486a(dbObject5) && TextUtils.isEmpty(dbObject5.f56859id)) {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("update table id error :" + this.f191760d);
                            stringBuffer.append(", detail: " + dbObject5.toJson());
                            stringBuffer.append(" , new id: ");
                            stringBuffer.append(dbObject6.f56859id);
                            CrashHelper.m82479c(new RuntimeException(stringBuffer.toString()));
                        }
                        if (TextUtils.isEmpty(dbObject5.f56859id) || dbObject5.f56859id.equals(dbObject6.f56859id)) {
                            cache(dbObject6.f56859id, dbObject6);
                        } else {
                            remove(dbObject5.f56859id);
                        }
                    } else if (i == 3) {
                        DbObject dbObject7 = ds4Var.f90454b;
                        DbObject dbObject8 = ds4Var.f90455c;
                        Iterator<wzh0<T>.C21216d> it7 = this.f191763g.values().iterator();
                        while (it7.hasNext()) {
                            it7.next().m208708q(dbObject7, dbObject8);
                        }
                        Iterator<wzh0<T>.C21214b> it8 = this.f191767k.values().iterator();
                        while (it8.hasNext()) {
                            it8.next().m208682c(dbObject7, dbObject8);
                        }
                        if (!dbObject7.f56859id.equals(dbObject8.f56859id)) {
                            remove(dbObject7.f56859id);
                        } else if (cached(dbObject8.f56859id) != null) {
                            cache(dbObject8.f56859id, dbObject8);
                        }
                    }
                    DbObject dbObject9 = ds4Var.f90454b;
                    if (dbObject9 != null && !TextUtils.isEmpty(dbObject9.f56859id) && (c21215c = this.f191766j.get(ds4Var.f90454b.f56859id)) != null && ((dbObject2 = ds4Var.f90455c) == null || !ds4Var.f90454b.equals(dbObject2))) {
                        c21215c.f191785d = true;
                    }
                    DbObject dbObject10 = ds4Var.f90455c;
                    if (dbObject10 != null && ((dbObject = ds4Var.f90454b) == null || !TextUtils.equals(dbObject.f56859id, dbObject10.f56859id))) {
                        wzh0<T>.C21215c c21215c2 = this.f191766j.get(ds4Var.f90455c.f56859id);
                        if (c21215c2 != null) {
                            DbObject dbObject11 = ds4Var.f90454b;
                            if (dbObject11 == null) {
                                c21215c2.f191785d = true;
                            } else if (!ds4Var.f90455c.equals(dbObject11)) {
                                c21215c2.f191785d = true;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                CrashHelper.m82479c(th);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m208658t(String str, C21215c c21215c, boolean z) {
        this.f191766j.put(str, c21215c);
        c21215c.m208691g(z);
    }

    public void triggerMergeUpdates() {
        Iterator<wzh0<T>.C21216d> it = this.f191763g.values().iterator();
        while (it.hasNext()) {
            it.next().m208709r();
        }
        Iterator<wzh0<T>.C21214b> it2 = this.f191767k.values().iterator();
        while (it2.hasNext()) {
            it2.next().m208684e();
        }
        Iterator<wzh0<T>.C21215c> it3 = this.f191766j.values().iterator();
        while (it3.hasNext()) {
            it3.next().m208690f();
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m208659u(String str) {
        wzh0<T>.C21215c c21215c = this.f191766j.get(str);
        if (c21215c == null || c21215c.f191783b.m222764h()) {
            return;
        }
        this.f191766j.remove(str);
    }

    public C22421c<T> uiGet(final String str, final boolean z) {
        u11.m193894h(str != null);
        final wzh0<T>.C21215c c21215c = this.f191766j.get(str);
        if (c21215c == null) {
            c21215c = new C21215c(str);
            this.f191766j.put(str, c21215c);
        }
        return c21215c.f191783b.doOnSubscribe(new x20() { // from class: l.nzh0
            @Override // p153l.x20
            public final void call() {
                this.f144433a.m208658t(str, c21215c, z);
            }
        }).doOnUnsubscribe(new x20() { // from class: l.ozh0
            @Override // p153l.x20
            public final void call() {
                this.f149917a.m208660v(str);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void update(List<pf60<Column, Object>> list, Filter filter) {
        System.nanoTime();
        SqlSegment sqlSegmentEmit = filter == null ? SqlSegment.NULL : filter.emit();
        Cursor cursorRawQuery = filter instanceof spq ? m208655o().rawQuery(((spq) filter).querySql(null, -1), sqlSegmentEmit.args) : m208655o().query(this.f191760d, null, sqlSegmentEmit.part, sqlSegmentEmit.args, null, null, null);
        ArrayList<DbObject> arrayList = new ArrayList();
        while (cursorRawQuery.moveToNext()) {
            try {
                arrayList.add(this.f191758b.read(cursorRawQuery, 0));
            } catch (Throwable th) {
                cursorRawQuery.close();
                throw th;
            }
        }
        cursorRawQuery.close();
        if (arrayList.size() > 0) {
            ContentValues contentValues = new ContentValues();
            for (pf60<Column, Object> pf60Var : list) {
                pf60Var.f152156a.put(contentValues, pf60Var.f152157b);
            }
            m208655o().update(this.f191760d, contentValues, sqlSegmentEmit.part, sqlSegmentEmit.args);
            for (DbObject dbObject : arrayList) {
                try {
                    DbObject dbObject2 = (DbObject) dbObject.mo225055clone();
                    for (pf60<Column, Object> pf60Var2 : list) {
                        pf60Var2.f152156a.set(dbObject2, pf60Var2.f152157b);
                    }
                    m208646B(dbObject, dbObject2);
                    m208647C(dbObject, dbObject2);
                    m208645A().update(this, dbObject, dbObject2);
                } catch (CloneNotSupportedException e) {
                    CrashHelper.m82479c(e);
                }
            }
        }
    }

    public void updateBy_id(T t) {
        System.nanoTime();
        SQLiteDatabase sQLiteDatabaseM208655o = m208655o();
        String str = this.f191760d;
        StringBuilder sb = new StringBuilder();
        LongColumn<DbObject> longColumn = DbObject._ID;
        sb.append(longColumn);
        sb.append(" = ?");
        Cursor cursorQuery = sQLiteDatabaseM208655o.query(str, null, sb.toString(), new String[]{Long.toString(t._id)}, null, null, null);
        try {
            T t2 = cursorQuery.moveToNext() ? this.f191758b.read(cursorQuery, 0) : null;
            cursorQuery.close();
            if (t2 != null) {
                ContentValues contentValues = new ContentValues();
                this.f191758b.write(t, contentValues);
                m208655o().update(this.f191760d, contentValues, longColumn + " = ?", new String[]{Long.toString(t._id)});
                m208645A().update(this, t2, t);
            }
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    public T upsert(T t, z20<T, T> z20Var) {
        System.nanoTime();
        SQLiteDatabase sQLiteDatabaseM208655o = m208655o();
        String str = this.f191760d;
        StringBuilder sb = new StringBuilder();
        StringColumn stringColumn = DbObject.f56857ID;
        sb.append(stringColumn);
        sb.append(" = ?");
        Cursor cursorQuery = sQLiteDatabaseM208655o.query(str, null, sb.toString(), new String[]{t.f56859id}, null, null, null);
        try {
            T t2 = cursorQuery.moveToNext() ? this.f191758b.read(cursorQuery, 0) : null;
            cursorQuery.close();
            if (t2 == null) {
                if (z20Var != null) {
                    z20Var.call(t, null);
                }
                ContentValues contentValues = new ContentValues();
                this.f191758b.write(t, contentValues);
                t._id = m208655o().insert(this.f191760d, null, contentValues);
                m208653l(t);
                m208645A().insert(this, t);
                cacheQueryJoinData(t);
                return t;
            }
            t._id = t2._id;
            if (z20Var != null) {
                z20Var.call(t, t2);
            }
            t.mergeData(t2);
            if (!t2.equals(t)) {
                ContentValues contentValues2 = new ContentValues();
                this.f191758b.write(t, contentValues2);
                if (m208655o().update(this.f191760d, contentValues2, stringColumn + " = ?", new String[]{t.f56859id}) > 0) {
                    m208646B(t2, t);
                    m208647C(t2, t);
                    m208645A().update(this, t2, t);
                }
            }
            return t;
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m208660v(final String str) {
        ThreadUtil.m82496h(new Runnable() { // from class: l.qzh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f160265a.m208659u(str);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ List m208661w(int i) {
        return query(null, null, i);
    }

    public void warmUp(final int i, int i2) {
        ThreadUtil.m82496h(new Runnable() { // from class: l.pzh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f154848a.m208663y(i);
            }
        }, i2);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m208662x(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DbObject dbObject = (DbObject) it.next();
            cache(dbObject.f56859id, dbObject);
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m208663y(final int i) {
        l9c.m153394o().m153399d(false, new pcj() { // from class: l.rzh0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f165536a.m208661w(i);
            }
        }, new y20() { // from class: l.szh0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171390a.m208662x((List) obj);
            }
        }, null, "warmUp_" + this.f191760d);
    }

    /* JADX INFO: renamed from: z */
    public List<T> m208664z(Filter<T> filter, Order<T> order, int i, boolean z) {
        String str;
        Cursor cursorQuery;
        String str2;
        if (z && !l9c.m153394o().m153410r()) {
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
        boolean z2 = filter instanceof spq;
        if (z2) {
            cursorQuery = m208655o().rawQuery(((spq) filter).querySql(order, i), sqlSegmentEmit.args);
        } else {
            cursorQuery = m208655o().query(this.f191760d, null, sqlSegmentEmit.part, sqlSegmentEmit.args, null, null, order != null ? order.emit() : null, str);
        }
        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
        if (z2) {
            ((spq) filter).querySql(order, i);
        } else {
            SQLiteDatabase sQLiteDatabaseM208655o = m208655o();
            StringBuilder sb = new StringBuilder("SELECT * FROM ");
            sb.append(this.f191760d);
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
            m208643q(sQLiteDatabaseM208655o, sb.toString(), sqlSegmentEmit.args);
        }
        while (cursorQuery.moveToNext()) {
            try {
                T t = this.f191758b.read(cursorQuery, 0);
                arrayList.add(t);
                if (filter instanceof spq) {
                    spq spqVar = (spq) filter;
                    T t2 = spqVar.mo187439g().f191758b.read(cursorQuery, this.f191758b.getReadIndex());
                    if (spqVar.mo187439g().f191758b.init().equals(t2)) {
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

    /* JADX INFO: renamed from: l.wzh0$d */
    public class C21216d {

        /* JADX INFO: renamed from: a */
        public final wzh0<T>.C21213a f191787a;

        /* JADX INFO: renamed from: b */
        public wzh0<T>.C21216d.a f191788b = null;

        /* JADX INFO: renamed from: c */
        public boolean f191789c = false;

        /* JADX INFO: renamed from: e */
        public AtomicInteger f191791e = new AtomicInteger(0);

        /* JADX INFO: renamed from: d */
        public C22507a<wzh0<T>.C21216d.a> f191790d = C22507a.m222758b();

        public C21216d(wzh0<T>.C21213a c21213a) {
            this.f191787a = c21213a;
            if (c21213a.f191770c instanceof DoubleOrder) {
                wzh0.this.m208656p();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: c */
        public static /* synthetic */ String m208694c(spq spqVar, DbObject dbObject) {
            return (String) spqVar.foreignC().get(dbObject);
        }

        /* JADX INFO: renamed from: h */
        public final boolean m208699h(T t) {
            return m208700i(t, false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: i */
        public final boolean m208700i(T t, boolean z) {
            Filter<T> filter = this.f191787a.f191769b;
            if (!(filter instanceof spq)) {
                return filter == null || filter.filter(t);
            }
            spq spqVar = (spq) filter;
            if (TextUtils.isEmpty((String) spqVar.foreignC().get(t))) {
                return false;
            }
            DbObject dbObject = (DbObject) t.getExtTabData(spqVar.mo187439g().f191758b.getDataClass());
            spqVar.mo187437e();
            if (!z) {
                return spqVar.filter(t, dbObject);
            }
            if (spqVar.baseFilter() == null) {
                return true;
            }
            return spqVar.baseFilter().filter(t);
        }

        /* JADX INFO: renamed from: j */
        public wzh0<T>.C21216d.a m208701j() {
            wzh0<T>.C21216d.a aVar = this.f191788b;
            return aVar == null ? this.f191790d.m222761e() : aVar;
        }

        /* JADX INFO: renamed from: k */
        public wzh0<T>.C21216d.a m208702k() {
            if (this.f191788b == null && this.f191790d.m222761e() != null) {
                this.f191788b = new a(this.f191790d.m222761e());
                wzh0.m208642n(this.f191787a.f191768a + " temp items created for write");
            }
            return this.f191788b;
        }

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ bkj0 m208703l() {
            ArrayList arrayList;
            wzh0<T>.C21213a c21213a = this.f191787a;
            int i = c21213a.f191771d;
            if (i <= 0) {
                i = c21213a.f191772e;
            }
            u11.m193894h(i > 0);
            wzh0 wzh0Var = wzh0.this;
            wzh0<T>.C21213a c21213a2 = this.f191787a;
            List<T> listQuery = wzh0Var.query(c21213a2.f191769b, c21213a2.f191770c, i);
            int size = listQuery.size() < i ? listQuery.size() : this.f191787a.m208669e();
            if (size == 0) {
                arrayList = new ArrayList();
            } else {
                ArrayList arrayList2 = new ArrayList();
                pf60<wzh0, bkj0<qcj<List<T>, Filter>, pcj<Order>, Integer>> pf60Var = wzh0.this.f191759c;
                if (pf60Var != null) {
                    arrayList2.add(jyb.m147494Y(wzh0.this.f191759c.f152156a, pf60Var.f152156a.query(pf60Var.f152157b.f77081a.call(listQuery), wzh0.this.f191759c.f152157b.f77082b.call(), wzh0.this.f191759c.f152157b.f77083c.intValue())));
                }
                pf60<wzh0, List> pf60VarM208705n = m208705n(listQuery);
                if (pf60VarM208705n != null) {
                    arrayList2.add(pf60VarM208705n);
                }
                arrayList = arrayList2;
            }
            return bkj0.m104818a(Integer.valueOf(size), listQuery, arrayList);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: m */
        public final /* synthetic */ void m208704m(bkj0 bkj0Var) {
            this.f191791e.set(2);
            for (DbObject dbObject : (List) bkj0Var.f77082b) {
                wzh0.this.cache(dbObject.f56859id, dbObject);
            }
            m208710s((List) bkj0Var.f77083c);
            if (this.f191790d.m222761e() == null) {
                wzh0<T>.C21216d.a aVar = new a();
                aVar.f191794b = (List) bkj0Var.f77082b;
                aVar.f191793a = ((Integer) bkj0Var.f77081a).intValue();
                aVar.f191795c = aVar.f191794b.size() == aVar.f191793a;
                this.f191790d.onNext(aVar);
            }
        }

        /* JADX INFO: renamed from: n */
        public final pf60<wzh0, List> m208705n(List<T> list) {
            Filter<T> filter = this.f191787a.f191769b;
            if (filter instanceof spq) {
                final spq spqVar = (spq) filter;
                pf60<wzh0, bkj0<qcj<List<T>, Filter>, pcj<Order>, Integer>> pf60Var = wzh0.this.f191759c;
                if (pf60Var == null || pf60Var.f152156a != spqVar.mo187439g()) {
                    List<String> listM147489T = jyb.m147489T(jyb.m147522n(list, new qcj() { // from class: l.b0i0
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return Boolean.valueOf(!TextUtils.isEmpty((String) spqVar.foreignC().get((DbObject) obj)));
                        }
                    }), new qcj() { // from class: l.c0i0
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return wzh0.C21216d.m208694c(spqVar, (DbObject) obj);
                        }
                    });
                    wzh0.m208642n("cache join ids -> ids= " + TextUtils.join(Constants.SEPARATOR_COMMA, listM147489T));
                    List<T> listQuery = spqVar.mo187439g().query(DbObject.f56857ID.m82451IN(listM147489T), null, -1);
                    wzh0.m208642n("cache join data size -> size " + listQuery.size());
                    return jyb.m147494Y(spqVar.mo187439g(), listQuery);
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: o */
        public void m208706o(T t) {
            int iBinarySearchUsingLocalId;
            wzh0<T>.C21216d.a aVarM208701j = m208701j();
            wzh0.m208642n(this.f191787a.f191768a + " sync cache delete");
            Filter<T> filter = this.f191787a.f191769b;
            if (filter instanceof spq) {
                ((spq) filter).mo187439g().queryCache(t.f56859id);
            }
            if (aVarM208701j == null || !m208700i(t, true)) {
                return;
            }
            aVarM208701j.m208716h("sync cache delete inside");
            this.f191789c = true;
            List<T> list = aVarM208701j.f191794b;
            if (list != null) {
                Order<T> order = this.f191787a.f191770c;
                if (order instanceof tpq) {
                    iBinarySearchUsingLocalId = wzh0.this.m208652k(aVarM208701j.f191794b, t, ((tpq) order).m192203h());
                } else {
                    iBinarySearchUsingLocalId = wzh0.this.binarySearchUsingLocalId(list, t, order);
                }
                if (iBinarySearchUsingLocalId >= 0) {
                    aVarM208701j = m208702k();
                    aVarM208701j.f191794b.remove(iBinarySearchUsingLocalId);
                    if (aVarM208701j.f191794b.isEmpty() && !aVarM208701j.f191795c) {
                        aVarM208701j.f191795c = true;
                    }
                }
                aVarM208701j.m208716h("item removed");
            }
            if (aVarM208701j.f191793a >= 0) {
                wzh0<T>.C21216d.a aVarM208702k = m208702k();
                int i = aVarM208702k.f191793a - 1;
                aVarM208702k.f191793a = i;
                if (i == -1) {
                    aVarM208702k.f191795c = false;
                }
                aVarM208702k.m208716h("size changed");
            }
        }

        /* JADX INFO: renamed from: p */
        public boolean m208707p(T t) {
            wzh0<T>.C21216d.a aVarM208701j = m208701j();
            wzh0.m208642n(this.f191787a.f191768a + " sync cache insert");
            if (aVarM208701j != null && m208699h(t)) {
                this.f191789c = true;
                List<T> list = aVarM208701j.f191794b;
                if (list == null && aVarM208701j.f191793a <= 0 && !aVarM208701j.f191795c) {
                    aVarM208701j.m208716h("sync cache insert nothing");
                    return false;
                }
                if (list != null && !aVarM208701j.f191795c) {
                    aVarM208701j.m208716h("sync cache insert partial");
                    int iBinarySearchUsingLocalId = wzh0.this.binarySearchUsingLocalId(aVarM208701j.f191794b, t, this.f191787a.f191770c);
                    if (iBinarySearchUsingLocalId < 0) {
                        iBinarySearchUsingLocalId = (-iBinarySearchUsingLocalId) - 1;
                    }
                    if (aVarM208701j.f191793a >= 0) {
                        aVarM208701j = m208702k();
                        aVarM208701j.f191793a++;
                        aVarM208701j.m208716h("size updated");
                    }
                    if (iBinarySearchUsingLocalId >= aVarM208701j.f191794b.size()) {
                        return false;
                    }
                    wzh0<T>.C21216d.a aVarM208702k = m208702k();
                    aVarM208702k.f191794b.add(iBinarySearchUsingLocalId, t);
                    aVarM208702k.m208716h("item inserted");
                    return true;
                }
                if (list == null && aVarM208701j.f191793a >= 0 && !aVarM208701j.f191795c) {
                    aVarM208701j.m208716h("sync cache insert size");
                    wzh0<T>.C21216d.a aVarM208702k2 = m208702k();
                    aVarM208702k2.f191793a++;
                    aVarM208702k2.m208716h("size updated");
                    return false;
                }
                if (list != null && aVarM208701j.f191793a >= 0 && aVarM208701j.f191795c) {
                    aVarM208701j.m208716h("sync cache insert full");
                    int iBinarySearchUsingLocalId2 = wzh0.this.binarySearchUsingLocalId(aVarM208701j.f191794b, t, this.f191787a.f191770c);
                    if (iBinarySearchUsingLocalId2 < 0) {
                        iBinarySearchUsingLocalId2 = (-iBinarySearchUsingLocalId2) - 1;
                    }
                    wzh0<T>.C21216d.a aVarM208702k3 = m208702k();
                    boolean z = iBinarySearchUsingLocalId2 == aVarM208702k3.f191794b.size();
                    aVarM208702k3.f191793a++;
                    if (!z || aVarM208702k3.f191796d + (this.f191787a.f191772e * 2) > aVarM208702k3.f191794b.size()) {
                        aVarM208702k3.f191794b.add(iBinarySearchUsingLocalId2, t);
                    } else {
                        aVarM208702k3.f191795c = false;
                    }
                    aVarM208702k3.m208716h("sync cache insert full end");
                    return true;
                }
                aVarM208701j.m208716h("what??");
                StringBuilder sb = new StringBuilder("syncCacheInsert IllegalStateException == ");
                sb.append(wzh0.this.f191760d);
                sb.append("/");
                sb.append(this.f191787a.f191768a);
                sb.append("\n\t\t\t\tbase:");
                List<T> list2 = aVarM208701j.f191794b;
                sb.append(list2 == null ? "null" : Integer.valueOf(list2.size()));
                sb.append(", size: ");
                sb.append(aVarM208701j.f191793a);
                sb.append(", full: ");
                sb.append(aVarM208701j.f191795c);
                sb.append("\nnewItem:");
                sb.append(t.toJson());
                CrashHelper.m82479c(new Exception(sb.toString()));
                wpg0.m207458a();
            }
            return false;
        }

        /* JADX INFO: renamed from: q */
        public boolean m208708q(T t, T t2) {
            Order<T> order;
            int iBinarySearchUsingLocalId;
            wzh0<T>.C21216d.a aVarM208701j = m208701j();
            if ((this.f191787a.f191769b instanceof spq) && !jyb.m147479J(t.getExtList())) {
                jyb.m147479J(t2.getExtList());
            }
            if (aVarM208701j == null || !((this.f191787a.f191769b == null || (m208699h(t) && m208699h(t2))) && (order = this.f191787a.f191770c) != null && order.compare(t, t2) == 0)) {
                m208706o(t);
                return m208707p(t2);
            }
            this.f191789c = true;
            List<T> list = aVarM208701j.f191794b;
            if (list == null || (iBinarySearchUsingLocalId = wzh0.this.binarySearchUsingLocalId(list, t, this.f191787a.f191770c)) < 0) {
                return false;
            }
            m208702k().f191794b.set(iBinarySearchUsingLocalId, t2);
            return true;
        }

        /* JADX INFO: renamed from: r */
        public void m208709r() {
            if (this.f191789c) {
                wzh0<T>.C21216d.a aVarM208701j = m208701j();
                if (aVarM208701j != null) {
                    this.f191790d.onNext(aVarM208701j);
                }
                wzh0.m208642n("triggered query " + this.f191787a.f191768a);
                this.f191788b = null;
                this.f191789c = false;
            }
        }

        /* JADX INFO: renamed from: s */
        public final void m208710s(List<pf60<wzh0, List>> list) {
            String str;
            if (list.size() > 0) {
                for (pf60<wzh0, List> pf60Var : list) {
                    for (DbObject dbObject : pf60Var.f152157b) {
                        if (dbObject != null && (str = dbObject.f56859id) != null) {
                            pf60Var.f152156a.cache(str, dbObject);
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: t */
        public void m208711t(boolean z) {
            if (!z || wzh0.f191756l) {
                this.f191791e.set(2);
                this.f191790d.onNext(new a());
            } else if (this.f191791e.compareAndSet(0, 1)) {
                wzh0.this.m208651j(false, new pcj() { // from class: l.zzh0
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return this.f206707a.m208703l();
                    }
                }, new y20() { // from class: l.a0i0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f67721a.m208704m((bkj0) obj);
                    }
                }, null, true, "uiquery_" + wzh0.this.f191760d + "_" + this.f191787a.f191768a);
            }
        }

        /* JADX INFO: renamed from: l.wzh0$d$a */
        public class a extends AbstractList<T> {

            /* JADX INFO: renamed from: a */
            public int f191793a;

            /* JADX INFO: renamed from: b */
            public List<T> f191794b;

            /* JADX INFO: renamed from: c */
            public boolean f191795c;

            /* JADX INFO: renamed from: d */
            public int f191796d;

            /* JADX INFO: renamed from: e */
            public long f191797e;

            public a(wzh0<T>.C21216d.a aVar) {
                this.f191793a = -1;
                this.f191794b = null;
                this.f191795c = false;
                this.f191796d = -1;
                this.f191797e = -1L;
                this.f191793a = aVar.f191793a;
                this.f191794b = aVar.f191794b != null ? new ArrayList(aVar.f191794b) : null;
                this.f191795c = aVar.f191795c;
                this.f191796d = aVar.f191796d;
            }

            @Override // java.util.AbstractList, java.util.Collection, java.util.List
            public boolean equals(@Nullable Object obj) {
                return super.equals(obj);
            }

            /* JADX INFO: renamed from: h */
            public void m208716h(String str) {
                StringBuilder sb = new StringBuilder();
                sb.append(wzh0.this.f191760d);
                sb.append("/");
                sb.append(C21216d.this.f191787a.f191768a);
                sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                sb.append(str);
                sb.append("\n\t\t\t\tbase:");
                List<T> list = this.f191794b;
                sb.append(list == null ? "null" : Integer.valueOf(list.size()));
                sb.append(", size: ");
                sb.append(this.f191793a);
                sb.append(", full: ");
                sb.append(this.f191795c);
                wzh0.m208642n(sb.toString());
            }

            @Override // java.util.AbstractList, java.util.List
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public T get(int i) {
                int iMin = Math.min(i, this.f191796d - 1);
                this.f191796d = iMin;
                if (iMin < -1) {
                    this.f191796d = -1;
                }
                m208723s(i);
                if (i >= C21216d.this.f191787a.f191771d) {
                    m208724v(i);
                }
                return this.f191794b.get(i);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public boolean isEmpty() {
                if (this.f191794b == null) {
                    m208723s(0);
                }
                return size() <= 0;
            }

            @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
            @NonNull
            public Iterator<T> iterator() {
                return super.iterator();
            }

            /* JADX INFO: renamed from: j */
            public void m208718j(String str) {
                StringBuilder sb = new StringBuilder();
                sb.append(wzh0.this.f191760d);
                sb.append("/");
                sb.append(C21216d.this.f191787a.f191768a);
                sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                sb.append(str);
                sb.append("\n\t\t\t\tbase:");
                List<T> list = this.f191794b;
                sb.append(list == null ? "null" : Integer.valueOf(list.size()));
                sb.append(", size: ");
                sb.append(this.f191793a);
                sb.append(", full: ");
                sb.append(this.f191795c);
                wzh0.m208644r(sb.toString());
            }

            /* JADX INFO: renamed from: l */
            public final /* synthetic */ pf60 m208719l(Filter filter, int i) {
                C21216d c21216d = C21216d.this;
                List<T> listQuery = wzh0.this.query(filter, c21216d.f191787a.f191770c, i);
                ArrayList arrayList = new ArrayList();
                pf60<wzh0, bkj0<qcj<List<T>, Filter>, pcj<Order>, Integer>> pf60Var = wzh0.this.f191759c;
                if (pf60Var != null) {
                    arrayList.add(jyb.m147494Y(wzh0.this.f191759c.f152156a, pf60Var.f152156a.query(pf60Var.f152157b.f77081a.call(listQuery), wzh0.this.f191759c.f152157b.f77082b.call(), wzh0.this.f191759c.f152157b.f77083c.intValue())));
                }
                pf60 pf60VarM208705n = C21216d.this.m208705n(listQuery);
                if (pf60VarM208705n != null) {
                    arrayList.add(pf60VarM208705n);
                }
                return jyb.m147494Y(listQuery, arrayList);
            }

            /* JADX INFO: renamed from: o */
            public final /* synthetic */ void m208720o(a aVar, int i, int i2, pf60 pf60Var) {
                C21216d.this.f191791e.set(2);
                for (DbObject dbObject : (List) pf60Var.f152156a) {
                    wzh0.this.cache(dbObject.f56859id, dbObject);
                }
                C21216d.this.m208710s((List) pf60Var.f152157b);
                wzh0<T>.C21216d.a aVarM208701j = C21216d.this.m208701j();
                if (aVarM208701j != null && aVarM208701j == aVar && aVarM208701j.size() == i) {
                    this.f191794b.addAll((Collection) pf60Var.f152156a);
                    if (((List) pf60Var.f152156a).size() != i2) {
                        this.f191793a = this.f191794b.size();
                        this.f191795c = true;
                    }
                }
            }

            /* JADX INFO: renamed from: p */
            public final /* synthetic */ void m208721p() {
                C21216d.this.f191791e.set(2);
            }

            /* JADX INFO: renamed from: r */
            public void m208722r() {
                if (ThreadUtil.m82494f()) {
                    m208716h("query size called");
                }
                wzh0.this.m208656p();
                int iM208669e = C21216d.this.f191787a.m208669e();
                this.f191793a = iM208669e;
                List<T> list = this.f191794b;
                if (list != null) {
                    this.f191795c = iM208669e == list.size();
                } else if (iM208669e == 0) {
                    this.f191794b = new ArrayList(0);
                    this.f191795c = true;
                }
            }

            /* JADX INFO: renamed from: s */
            public void m208723s(int i) {
                if (this.f191794b == null) {
                    this.f191794b = new ArrayList();
                }
                if (i >= this.f191794b.size()) {
                    m208715g(i);
                    int size = this.f191794b.size();
                    wzh0<T>.C21213a c21213a = C21216d.this.f191787a;
                    int i2 = c21213a.f191771d;
                    if (i >= i2) {
                        i2 = c21213a.f191772e;
                    }
                    Filter<T> filterM208675k = c21213a.m208675k(this.f191794b);
                    int iMin = Math.min(C21216d.this.f191787a.m208676l(this.f191794b, i, i2), this.f191793a - this.f191794b.size());
                    m208716h("query cache called " + iMin);
                    C21216d c21216d = C21216d.this;
                    this.f191794b.addAll(wzh0.this.queryCache(filterM208675k, c21216d.f191787a.f191770c, iMin));
                    if (this.f191794b.size() < iMin + size) {
                        this.f191795c = true;
                        this.f191793a = this.f191794b.size();
                    }
                    if (ThreadUtil.m82494f()) {
                        m208716h("status updated");
                    }
                }
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                wzh0.m208642n("size called with " + this.f191793a);
                if (this.f191793a == -1) {
                    m208722r();
                }
                return this.f191793a;
            }

            @Override // java.util.AbstractCollection
            public String toString() {
                StringBuilder sb = new StringBuilder("size: ");
                sb.append(this.f191793a);
                sb.append("\nfull: ");
                sb.append(this.f191795c);
                sb.append("\nbase: ");
                if (this.f191794b == null) {
                    sb.append("null");
                } else {
                    sb.append("size ");
                    sb.append(this.f191794b.size());
                    sb.append("\n[");
                    sb.append(jyb.m147490U(this.f191794b, "; "));
                    sb.append(Constants.AES_SUFFIX);
                }
                return sb.toString();
            }

            /* JADX INFO: renamed from: v */
            public final void m208724v(int i) {
                List<T> list = this.f191794b;
                if (list == null || i < C21216d.this.f191787a.f191771d || this.f191795c || list.size() - i > C21216d.this.f191787a.f191772e / 2 || SystemClock.uptimeMillis() - this.f191797e <= 1) {
                    return;
                }
                this.f191797e = SystemClock.uptimeMillis();
                final int size = this.f191794b.size();
                wzh0<T>.C21213a c21213a = C21216d.this.f191787a;
                int i2 = c21213a.f191771d;
                if (i >= i2) {
                    i2 = c21213a.f191772e;
                }
                final Filter<T> filterM208675k = c21213a.m208675k(this.f191794b);
                final int iM208676l = C21216d.this.f191787a.m208676l(this.f191794b, i, i2);
                if (!C21216d.this.f191791e.compareAndSet(2, 1) || wzh0.f191756l) {
                    return;
                }
                m208718j("preloading");
                wzh0.this.m208650i(true, new pcj() { // from class: l.d0i0
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return this.f84563a.m208719l(filterM208675k, iM208676l);
                    }
                }, new y20() { // from class: l.e0i0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f91464a.m208720o(this, size, iM208676l, (pf60) obj);
                    }
                }, new x20() { // from class: l.f0i0
                    @Override // p153l.x20
                    public final void call() {
                        this.f96687a.m208721p();
                    }
                }, "uiquery_tryPreload_" + wzh0.this.f191760d + "_" + C21216d.this.f191787a.f191768a);
            }

            /* JADX INFO: renamed from: g */
            public void m208715g(int i) {
            }

            public a() {
                this.f191794b = null;
                this.f191795c = false;
                this.f191796d = -1;
                this.f191797e = -1L;
                this.f191793a = -1;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m208642n(String str) {
    }

    /* JADX INFO: renamed from: r */
    public static void m208644r(String str) {
    }

    public T query(long j) {
        List<T> listQuery = query(DbObject._ID.mo61359EQ(Long.valueOf(j)), null, 1);
        if (listQuery.isEmpty()) {
            return null;
        }
        return listQuery.get(0);
    }

    public List<T> query(Filter<T> filter, Order<T> order, int i) {
        return m208664z(filter, order, i, true);
    }

    public C22421c<T> uiGet(String str) {
        return uiGet(str, true);
    }

    public wzh0(String str, vzf0<T> vzf0Var, List<Index> list, int i) {
        super(i);
        this.f191759c = null;
        this.f191761e = null;
        this.f191762f = true;
        this.f191763g = new ConcurrentHashMap<>();
        this.f191764h = new ConcurrentHashMap<>();
        this.f191765i = new ConcurrentHashMap<>();
        this.f191766j = new ConcurrentHashMap<>();
        this.f191767k = new ConcurrentHashMap<>();
        this.f191760d = str;
        this.f191758b = vzf0Var;
        list = list == null ? new ArrayList<>() : list;
        this.f191757a = list;
        list.add(new Index(DbObject.f56857ID));
    }

    public void delete(String str) {
        delete(DbObject.f56857ID.mo61359EQ(str));
    }

    public void delete(long j) {
        delete(DbObject._ID.mo61359EQ(Long.valueOf(j)));
    }

    public void upsert(T t) {
        upsert(t, null);
    }

    public T queryCache(String str) {
        u11.m193894h(str != null);
        T tCached = cached(str);
        if (tCached == null) {
            m208656p();
            tCached = null;
            List<T> listQueryCache = queryCache(DbObject.f56857ID.mo61359EQ(str), null, 1);
            if (listQueryCache != null && listQueryCache.size() != 0) {
                return listQueryCache.get(0);
            }
        }
        return tCached;
    }
}
