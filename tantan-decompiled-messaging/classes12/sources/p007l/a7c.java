package p007l;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.os.SystemClock;
import com.p000p1.mobile.putong.data.TableProviderInfo;
import com.p000p1.mobile.putong.dbcenter.p002db.opt.TransactionOpt;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.DBCorruptException;
import com.tantanapp.common.utils.ThreadUtil;
import io.requery.android.database.DatabaseErrorHandler;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import l.c4g0;
import l.d30;
import l.du2;
import l.e30;
import l.e51;
import l.j760;
import l.mkd0;
import l.qib0;
import l.tpd0;
import l.v9j;
import l.vwb;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class a7c implements DatabaseErrorHandler {

    /* JADX INFO: renamed from: s */
    public static final ReadWriteLock f5599s = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: t */
    public static boolean f5600t = false;

    /* JADX INFO: renamed from: u */
    public static boolean f5601u = false;

    /* JADX INFO: renamed from: b */
    public tpd0 f5603b;

    /* JADX INFO: renamed from: d */
    public final int f5605d;

    /* JADX INFO: renamed from: e */
    public final String f5606e;

    /* JADX INFO: renamed from: f */
    public final File f5607f;

    /* JADX INFO: renamed from: g */
    public volatile SQLiteDatabase f5608g;

    /* JADX INFO: renamed from: h */
    public volatile c4g0 f5609h;

    /* JADX INFO: renamed from: i */
    public final List<orh0> f5610i;

    /* JADX INFO: renamed from: j */
    public final List<orh0> f5611j;

    /* JADX INFO: renamed from: k */
    public c<Boolean> f5612k;

    /* JADX INFO: renamed from: l */
    public v9j<Long> f5613l;

    /* JADX INFO: renamed from: m */
    public volatile boolean f5614m;

    /* JADX INFO: renamed from: n */
    public volatile boolean f5615n;

    /* JADX INFO: renamed from: o */
    public fza0 f5616o;

    /* JADX INFO: renamed from: p */
    public boolean f5617p;

    /* JADX INFO: renamed from: q */
    public TransactionOpt f5618q;

    /* JADX INFO: renamed from: r */
    public boolean f5619r;

    /* JADX INFO: renamed from: a */
    public boolean f5602a = false;

    /* JADX INFO: renamed from: c */
    public int f5604c = 0;

    /* JADX INFO: renamed from: l.a7c$a */
    public class RunnableC2316a implements Runnable {

        /* JADX INFO: renamed from: a */
        public TransactionOpt f5620a;

        public RunnableC2316a() {
            this.f5620a = a7c.this.f5618q;
        }

        @Override // java.lang.Runnable
        public void run() {
            TransactionOpt transactionOpt;
            if (!a7c.this.m8438n() && (transactionOpt = this.f5620a) != null) {
                a7c.this.m8449y(transactionOpt);
            }
            this.f5620a = null;
        }
    }

    public a7c(String str, File file, int i, c<Boolean> cVar, v9j<Long> v9jVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f5610i = copyOnWriteArrayList;
        this.f5611j = copyOnWriteArrayList;
        this.f5614m = false;
        this.f5615n = false;
        this.f5616o = new fza0();
        this.f5617p = false;
        this.f5619r = false;
        this.f5606e = str;
        this.f5607f = file;
        this.f5605d = i;
        this.f5612k = cVar;
        this.f5613l = v9jVar;
        this.f5603b = new tpd0(str, this.f5616o.m10334m());
        this.f5616o.mo8749g();
        this.f5616o.mo8750h();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m8426d() {
    }

    /* JADX INFO: renamed from: l */
    private void m8430l(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder("PRAGMA wal_checkpoint(");
        sb.append(this.f5617p ? "PASSIVE" : "TRUNCATE");
        sb.append(");");
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery(sb.toString(), (String[]) null);
        this.f5617p = true;
        cursorRawQuery.getCount();
        cursorRawQuery.close();
    }

    /* JADX INFO: renamed from: A */
    public void m8431A(d30 d30Var) {
        if (m8438n()) {
            return;
        }
        SystemClock.uptimeMillis();
        f5599s.writeLock().lock();
        m8436k().beginTransactionDeferredWrite();
        try {
            this.f5618q = new TransactionOpt();
            if (f8c.m10082o().m10098r()) {
                d30Var.call();
            }
            m8436k().setTransactionSuccessful();
            m8436k().endTransaction();
            if (!f5601u) {
                ThreadUtil.g(new RunnableC2316a());
            }
            this.f5618q = null;
        } finally {
            m8436k().endTransaction();
            this.f5618q = null;
            f5599s.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m8432B() {
        if (this.f5608g == null || !f5599s.writeLock().tryLock()) {
            return;
        }
        try {
            m8430l(m8436k());
        } finally {
            f5599s.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: h */
    public <T> void m8433h(final boolean z, final v9j<T> v9jVar, final e30<T> e30Var, final d30 d30Var, boolean z2, final String str) {
        e51.t(new Runnable() { // from class: l.u6c
            @Override // java.lang.Runnable
            public final void run() throws Exception {
                this.f13562a.m8441q(z, v9jVar, e30Var, str, d30Var);
            }
        }, z2);
    }

    /* JADX INFO: renamed from: i */
    public <T> void m8434i(v9j<T> v9jVar, final e30<T> e30Var, String str) throws Exception {
        if (m8438n()) {
            return;
        }
        try {
            m8436k().beginTransactionDeferredReadOnly();
            try {
                final Object objCall = v9jVar.call();
                ThreadUtil.g(new Runnable() { // from class: l.y6c
                    @Override // java.lang.Runnable
                    public final void run() {
                        e30Var.call(objCall);
                    }
                });
                m8436k().setTransactionSuccessful();
            } finally {
                m8436k().endTransaction();
                f5599s.readLock().unlock();
            }
        } catch (Exception e) {
            CrashHelper.c(new RuntimeException("queryFetchError:" + str, e));
            throw e;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m8435j(SQLiteDatabase sQLiteDatabase, b8c b8cVar) {
        ArrayList<orh0> arrayListMo8748f = b8cVar.mo8748f();
        if (vwb.J(arrayListMo8748f)) {
            return;
        }
        for (orh0 orh0Var : arrayListMo8748f) {
            du2.a("DatabaseStore", "初始化table " + orh0Var.f11572d);
            sQLiteDatabase.execSQL(orh0Var.f11570b.CREATE_TABLE(orh0Var));
            for (int i = 0; i < orh0Var.f11569a.size(); i++) {
                sQLiteDatabase.execSQL(orh0Var.f11570b.CREATE_INDEX(orh0Var, orh0Var.f11569a.get(i)));
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public SQLiteDatabase m8436k() {
        if (this.f5608g != null) {
            return this.f5608g;
        }
        f5599s.writeLock().lock();
        try {
            if (this.f5608g == null) {
                du2.a("[common][DatabaseStore]", "inter create db");
                File file = this.f5607f;
                file.getParentFile().mkdirs();
                SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(file.getPath(), (SQLiteDatabase.CursorFactory) null, 805306368, true, this);
                du2.a("[common][DatabaseStore]", "SQLiteDatabase openDatabase");
                sQLiteDatabaseOpenDatabase.acquirePrimaryConnection();
                try {
                    int version = sQLiteDatabaseOpenDatabase.getVersion();
                    this.f5604c = version;
                    if (version == 0) {
                        this.f5603b.put(0);
                        sQLiteDatabaseOpenDatabase.beginTransaction();
                        try {
                            try {
                                this.f5616o.m10333l(sQLiteDatabaseOpenDatabase);
                            } catch (Exception e) {
                                CrashHelper.c(e);
                                m8445u(sQLiteDatabaseOpenDatabase, "realDbVersion == 0");
                            }
                            du2.a("[common][DatabaseStore]", "SQLiteDatabase onCreate");
                            sQLiteDatabaseOpenDatabase.setVersion(this.f5616o.mo8745c());
                            sQLiteDatabaseOpenDatabase.setTransactionSuccessful();
                            sQLiteDatabaseOpenDatabase.endTransaction();
                            m8430l(sQLiteDatabaseOpenDatabase);
                        } catch (Throwable th) {
                            sQLiteDatabaseOpenDatabase.endTransaction();
                            throw th;
                        }
                    } else {
                        m8430l(sQLiteDatabaseOpenDatabase);
                        sQLiteDatabaseOpenDatabase.beginTransaction();
                        try {
                            if (version <= this.f5616o.m10334m()) {
                                try {
                                    this.f5616o.m10333l(sQLiteDatabaseOpenDatabase);
                                } catch (Exception e2) {
                                    CrashHelper.c(e2);
                                    m8445u(sQLiteDatabaseOpenDatabase, "realDbVersion <= providerManager.getDbSplitVersion()");
                                }
                                du2.a("[common][DatabaseStore]", "SQLiteDatabase onCreate");
                            }
                            if (version < this.f5616o.mo8745c()) {
                                this.f5603b.put(Integer.valueOf(version));
                                try {
                                    r850.m13860h(sQLiteDatabaseOpenDatabase, version, this.f5616o.mo8745c());
                                } catch (Exception e3) {
                                    CrashHelper.c(e3);
                                    m8445u(sQLiteDatabaseOpenDatabase, "realDbVersion < providerManager.dbVersion()");
                                }
                                du2.a("[common][DatabaseStore]", "SQLiteDatabase onUpgrade");
                                sQLiteDatabaseOpenDatabase.setVersion(this.f5616o.mo8745c());
                            } else {
                                if (version > this.f5616o.mo8745c()) {
                                    m8445u(sQLiteDatabaseOpenDatabase, "realDbVersion > providerManager.dbVersion()");
                                    throw new DBCorruptException("new version is " + this.f5605d + ", while old is" + this.f5605d);
                                }
                                du2.a("[common][DatabaseStore]", "SQLiteDatabase 没有版本升级");
                            }
                            sQLiteDatabaseOpenDatabase.setTransactionSuccessful();
                            sQLiteDatabaseOpenDatabase.endTransaction();
                        } catch (Throwable th2) {
                            sQLiteDatabaseOpenDatabase.endTransaction();
                            throw th2;
                        }
                    }
                    sQLiteDatabaseOpenDatabase.releasePrimaryConnection();
                    this.f5608g = sQLiteDatabaseOpenDatabase;
                    ThreadUtil.h(new Runnable() { // from class: l.t6c
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f13201a.m8444t();
                        }
                    }, 100L);
                } catch (Throwable th3) {
                    sQLiteDatabaseOpenDatabase.releasePrimaryConnection();
                    throw th3;
                }
            }
            f5599s.writeLock().unlock();
            return this.f5608g;
        } catch (Throwable th4) {
            f5599s.writeLock().unlock();
            throw th4;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m8437m(boolean z) {
        this.f5616o.m10332k();
        f5599s.writeLock().lock();
        this.f5615n = true;
        f8c.m10082o().m10106z();
        try {
            if (this.f5608g != null) {
                if (this.f5608g.inTransaction()) {
                    this.f5608g.endTransaction();
                }
                du2.a("[common][DatabaseStore]", "SQLiteDatabase close");
                this.f5608g.close();
                if (this.f5609h != null && !this.f5609h.isUnsubscribed()) {
                    this.f5609h.unsubscribe();
                }
                this.f5608g = null;
            }
            du2.a("[common][DatabaseStore]", "SQLiteDatabase before delete");
            if (z || !qib0.C0) {
                SQLiteDatabase.deleteDatabase(this.f5607f);
            }
            du2.a("[common][DatabaseStore]", "SQLiteDatabase after delete");
        } finally {
            f5599s.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m8438n() {
        return this.f5615n;
    }

    /* JADX INFO: renamed from: o */
    public void m8439o() {
        if (this.f5619r) {
            return;
        }
        m8436k().beginTransactionDeferredReadOnly();
        m8436k().getVersion();
        this.f5619r = true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.tantanapp.common.utils.DBCorruptException */
    public void onCorruption(SQLiteDatabase sQLiteDatabase) throws DBCorruptException {
        if (!this.f5602a) {
            this.f5602a = true;
            String strReplace = this.f5606e.replace("core_v2_", "");
            String strUserId = qib0.c0.userId();
            du2.a("[common][DatabaseStore]", "oldUid.equals(newUid) : " + strReplace.equals(strUserId));
            if (strReplace.equals(strUserId)) {
                m8437m(true);
                du2.a("[common][DatabaseStore]", "delete database and throw DBCorruptException");
                throw new DBCorruptException("delete database when database maybe error");
            }
        }
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: p */
    public final int m8440p() {
        return Math.min(this.f5604c, ((Integer) this.f5603b.get()).intValue());
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m8441q(boolean z, v9j v9jVar, e30 e30Var, String str, final d30 d30Var) throws Exception {
        try {
            if (m8436k() != null) {
                if (!z) {
                    f5599s.readLock().lock();
                    m8434i(v9jVar, e30Var, str);
                } else if (f5599s.readLock().tryLock()) {
                    m8434i(v9jVar, e30Var, str);
                } else if (d30Var != null) {
                    ThreadUtil.g(new Runnable() { // from class: l.v6c
                        @Override // java.lang.Runnable
                        public final void run() {
                            d30Var.call();
                        }
                    });
                }
            }
        } catch (SQLiteDatabaseCorruptException e) {
            CrashHelper.d(e, 20);
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m8442r() {
        m8431A(new d30() { // from class: l.z6c
            public final void call() {
                a7c.m8426d();
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m8443s(Boolean bool) {
        this.f5614m = bool.booleanValue();
        if (this.f5614m) {
            return;
        }
        e51.t(new Runnable() { // from class: l.x6c
            @Override // java.lang.Runnable
            public final void run() {
                this.f14780a.m8442r();
            }
        }, false);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m8444t() {
        if (m8438n()) {
            return;
        }
        m8439o();
        this.f5609h = this.f5612k.subscribe(mkd0.G(new e30() { // from class: l.w6c
            public final void call(Object obj) {
                this.f14431a.m8443s((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.tantanapp.common.utils.DBCorruptException */
    /* JADX INFO: renamed from: u */
    public void m8445u(SQLiteDatabase sQLiteDatabase, String str) throws DBCorruptException {
        du2.a("[common][DatabaseStore]", "onCorruptionOpt: from:" + str);
        onCorruption(sQLiteDatabase);
    }

    /* JADX INFO: renamed from: v */
    public void m8446v() {
        this.f5616o.m10336o();
    }

    /* JADX INFO: renamed from: w */
    public void m8447w(b8c b8cVar) {
        if (this.f5615n) {
            du2.a("DatabaseStore", "registerProvider db has delete name: " + b8cVar.mo8747e());
            throw new DBCorruptException("registerProvider db has delete name: " + b8cVar.mo8747e());
        }
        SQLiteDatabase sQLiteDatabaseM8436k = m8436k();
        f5599s.writeLock().lock();
        sQLiteDatabaseM8436k.acquirePrimaryConnection();
        sQLiteDatabaseM8436k.beginTransaction();
        try {
            b8cVar.mo8750h();
            String strMo8747e = b8cVar.mo8747e();
            b8cVar.mo8749g();
            TableProviderInfo tableProviderInfoM10335n = this.f5616o.m10335n(strMo8747e);
            du2.a("DatabaseStore", "注册provider  " + strMo8747e);
            if (tableProviderInfoM10335n == null) {
                TableProviderInfo tableProviderInfo = new TableProviderInfo();
                tableProviderInfo.name = strMo8747e;
                tableProviderInfo.version = b8cVar.mo8745c();
                ((DbObject) tableProviderInfo).id = String.valueOf(b8cVar.mo8746d());
                try {
                    du2.a("DatabaseStore", "provider thread " + e51.D());
                    if (m8440p() == 0) {
                        m8435j(sQLiteDatabaseM8436k, b8cVar);
                    } else if (b8cVar.mo8745c() > 1) {
                        b8cVar.mo8752j(sQLiteDatabaseM8436k, 1, b8cVar.mo8745c());
                    }
                    du2.a("DatabaseStore", "升级版本 " + strMo8747e);
                    this.f5616o.m10337p(sQLiteDatabaseM8436k, tableProviderInfo, true);
                } catch (Exception e) {
                    CrashHelper.c(e);
                    m8445u(sQLiteDatabaseM8436k, "registerProvider Exception providerInfo == null");
                }
                du2.a("DatabaseStore", "db provider init" + b8cVar.mo8747e() + " db version " + sQLiteDatabaseM8436k.getVersion() + ": version old: 0, new: " + b8cVar.mo8745c());
            } else {
                du2.a("DatabaseStore", "provider thread " + e51.D());
                int i = tableProviderInfoM10335n.version;
                int iMo8745c = b8cVar.mo8745c();
                if (iMo8745c > i) {
                    try {
                        b8cVar.mo8752j(sQLiteDatabaseM8436k, i, iMo8745c);
                        tableProviderInfoM10335n.version = b8cVar.mo8745c();
                        du2.a("DatabaseStore", "升级版本 " + strMo8747e);
                        this.f5616o.m10337p(sQLiteDatabaseM8436k, tableProviderInfoM10335n, false);
                    } catch (Exception e2) {
                        CrashHelper.c(e2);
                        m8445u(sQLiteDatabaseM8436k, "registerProvider Exception providerInfo != null ");
                    }
                } else {
                    if (iMo8745c < i) {
                        m8445u(sQLiteDatabaseM8436k, "registerProvider newVersion < oldVersion)");
                        throw new DBCorruptException("db provider update" + b8cVar.mo8747e() + " version error new version must >= old version");
                    }
                    du2.a("DatabaseStore", b8cVar.mo8747e() + " version not change");
                }
                du2.a("DatabaseStore", "db provider " + b8cVar.mo8747e() + " db version " + sQLiteDatabaseM8436k.getVersion() + ": version old: " + i + ", new: " + iMo8745c);
            }
            sQLiteDatabaseM8436k.setTransactionSuccessful();
            m8448x(b8cVar);
            du2.a("DatabaseStore", b8cVar.mo8747e() + " deleted():" + m8438n());
            if (!m8438n()) {
                sQLiteDatabaseM8436k.endTransaction();
                sQLiteDatabaseM8436k.releasePrimaryConnection();
            }
            f5599s.writeLock().unlock();
        } catch (Throwable th) {
            du2.a("DatabaseStore", b8cVar.mo8747e() + " deleted():" + m8438n());
            if (!m8438n()) {
                sQLiteDatabaseM8436k.endTransaction();
                sQLiteDatabaseM8436k.releasePrimaryConnection();
            }
            f5599s.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m8448x(b8c b8cVar) {
        ArrayList<orh0> arrayListMo8748f = b8cVar.mo8748f();
        if (vwb.J(arrayListMo8748f)) {
            return;
        }
        Iterator<orh0> it = arrayListMo8748f.iterator();
        while (it.hasNext()) {
            this.f5610i.add(it.next());
        }
    }

    /* JADX INFO: renamed from: y */
    public void m8449y(TransactionOpt transactionOpt) {
        Map<String, zrh0> map;
        if (this.f5619r) {
            try {
                m8436k().setTransactionSuccessful();
                m8436k().endTransaction();
                this.f5619r = false;
            } catch (Throwable th) {
                m8436k().endTransaction();
                this.f5619r = false;
                throw th;
            }
        }
        if (!this.f5614m && ((Long) this.f5613l.call()).longValue() > 5000) {
            m8432B();
        }
        Iterator<j760<d30, d30>> it = transactionOpt.tickSynced.iterator();
        while (it.hasNext()) {
            ((d30) it.next().a).call();
        }
        for (orh0 orh0Var : this.f5610i) {
            orh0Var.syncUiCache(transactionOpt.get(orh0Var.f11572d));
        }
        m8439o();
        Iterator<j760<d30, d30>> it2 = transactionOpt.tickSynced.iterator();
        while (it2.hasNext()) {
            ((d30) it2.next().b).call();
        }
        for (orh0 orh0Var2 : this.f5610i) {
            if (transactionOpt.get(orh0Var2.f11572d) != null && (map = orh0Var2.f11573e) != null) {
                Iterator<String> it3 = map.keySet().iterator();
                while (it3.hasNext()) {
                    zrh0 zrh0Var = orh0Var2.f11573e.get(it3.next());
                    if (zrh0Var.m17536a(transactionOpt.get(orh0Var2.f11572d))) {
                        zrh0Var.f15850b.call();
                    }
                }
            }
            orh0Var2.triggerMergeUpdates();
        }
    }

    /* JADX INFO: renamed from: z */
    public void m8450z(d30 d30Var, d30 d30Var2) {
        this.f5618q.tickSynced.add(vwb.Y(d30Var, d30Var2));
    }
}
