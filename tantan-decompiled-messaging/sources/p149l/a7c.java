package p149l;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.os.SystemClock;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.TableProviderInfo;
import com.p046p1.mobile.putong.dbcenter.p057db.opt.TransactionOpt;
import com.tantanapp.common.data.orm.DatabaseStore;
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
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class a7c implements DatabaseErrorHandler {

    /* JADX INFO: renamed from: s */
    public static final ReadWriteLock f67869s = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: t */
    public static boolean f67870t = false;

    /* JADX INFO: renamed from: u */
    public static boolean f67871u = false;

    /* JADX INFO: renamed from: b */
    public tpd0 f67873b;

    /* JADX INFO: renamed from: d */
    public final int f67875d;

    /* JADX INFO: renamed from: e */
    public final String f67876e;

    /* JADX INFO: renamed from: f */
    public final File f67877f;

    /* JADX INFO: renamed from: g */
    public volatile SQLiteDatabase f67878g;

    /* JADX INFO: renamed from: h */
    public volatile c4g0 f67879h;

    /* JADX INFO: renamed from: i */
    public final List<orh0> f67880i;

    /* JADX INFO: renamed from: j */
    public final List<orh0> f67881j;

    /* JADX INFO: renamed from: k */
    public C22306c<Boolean> f67882k;

    /* JADX INFO: renamed from: l */
    public v9j<Long> f67883l;

    /* JADX INFO: renamed from: m */
    public volatile boolean f67884m;

    /* JADX INFO: renamed from: n */
    public volatile boolean f67885n;

    /* JADX INFO: renamed from: o */
    public fza0 f67886o;

    /* JADX INFO: renamed from: p */
    public boolean f67887p;

    /* JADX INFO: renamed from: q */
    public TransactionOpt f67888q;

    /* JADX INFO: renamed from: r */
    public boolean f67889r;

    /* JADX INFO: renamed from: a */
    public boolean f67872a = false;

    /* JADX INFO: renamed from: c */
    public int f67874c = 0;

    /* JADX INFO: renamed from: l.a7c$a */
    public class RunnableC15536a implements Runnable {

        /* JADX INFO: renamed from: a */
        public TransactionOpt f67890a;

        public RunnableC15536a() {
            this.f67890a = a7c.this.f67888q;
        }

        @Override // java.lang.Runnable
        public void run() {
            TransactionOpt transactionOpt;
            if (!a7c.this.m95272n() && (transactionOpt = this.f67890a) != null) {
                a7c.this.m95283y(transactionOpt);
            }
            this.f67890a = null;
        }
    }

    public a7c(String str, File file, int i, C22306c<Boolean> c22306c, v9j<Long> v9jVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f67880i = copyOnWriteArrayList;
        this.f67881j = copyOnWriteArrayList;
        this.f67884m = false;
        this.f67885n = false;
        this.f67886o = new fza0();
        this.f67887p = false;
        this.f67889r = false;
        this.f67876e = str;
        this.f67877f = file;
        this.f67875d = i;
        this.f67882k = c22306c;
        this.f67883l = v9jVar;
        this.f67873b = new tpd0(str, this.f67886o.m123820m());
        this.f67886o.mo100765g();
        this.f67886o.mo100766h();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m95260d() {
    }

    /* JADX INFO: renamed from: l */
    private void m95264l(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder("PRAGMA wal_checkpoint(");
        sb.append(this.f67887p ? "PASSIVE" : "TRUNCATE");
        sb.append(");");
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
        this.f67887p = true;
        cursorRawQuery.getCount();
        cursorRawQuery.close();
    }

    /* JADX INFO: renamed from: A */
    public void m95265A(d30 d30Var) {
        if (m95272n()) {
            return;
        }
        SystemClock.uptimeMillis();
        f67869s.writeLock().lock();
        m95270k().beginTransactionDeferredWrite();
        try {
            this.f67888q = new TransactionOpt();
            if (f8c.m119878o().m119894r()) {
                d30Var.call();
            }
            m95270k().setTransactionSuccessful();
            m95270k().endTransaction();
            if (!f67871u) {
                ThreadUtil.m81312g(new RunnableC15536a());
            }
            this.f67888q = null;
        } finally {
            m95270k().endTransaction();
            this.f67888q = null;
            f67869s.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m95266B() {
        if (this.f67878g == null || !f67869s.writeLock().tryLock()) {
            return;
        }
        try {
            m95264l(m95270k());
        } finally {
            f67869s.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: h */
    public <T> void m95267h(final boolean z, final v9j<T> v9jVar, final e30<T> e30Var, final d30 d30Var, boolean z2, final String str) {
        e51.m114769t(new Runnable() { // from class: l.u6c
            @Override // java.lang.Runnable
            public final void run() throws Exception {
                this.f174820a.m95275q(z, v9jVar, e30Var, str, d30Var);
            }
        }, z2);
    }

    /* JADX INFO: renamed from: i */
    public <T> void m95268i(v9j<T> v9jVar, final e30<T> e30Var, String str) throws Exception {
        if (m95272n()) {
            return;
        }
        try {
            m95270k().beginTransactionDeferredReadOnly();
            try {
                final T tCall = v9jVar.call();
                ThreadUtil.m81312g(new Runnable() { // from class: l.y6c
                    @Override // java.lang.Runnable
                    public final void run() {
                        e30Var.call(tCall);
                    }
                });
                m95270k().setTransactionSuccessful();
            } finally {
                m95270k().endTransaction();
                f67869s.readLock().unlock();
            }
        } catch (Exception e) {
            CrashHelper.m81296c(new RuntimeException("queryFetchError:" + str, e));
            throw e;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m95269j(SQLiteDatabase sQLiteDatabase, b8c b8cVar) {
        ArrayList<orh0> arrayListMo100764f = b8cVar.mo100764f();
        if (vwb.m200296J(arrayListMo100764f)) {
            return;
        }
        for (orh0 orh0Var : arrayListMo100764f) {
            du2.m113670a(DatabaseStore.TAG, "初始化table " + orh0Var.f145283d);
            sQLiteDatabase.execSQL(orh0Var.f145281b.CREATE_TABLE(orh0Var));
            for (int i = 0; i < orh0Var.f145280a.size(); i++) {
                sQLiteDatabase.execSQL(orh0Var.f145281b.CREATE_INDEX(orh0Var, orh0Var.f145280a.get(i)));
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public SQLiteDatabase m95270k() {
        if (this.f67878g != null) {
            return this.f67878g;
        }
        f67869s.writeLock().lock();
        try {
            if (this.f67878g == null) {
                du2.m113670a("[common][DatabaseStore]", "inter create db");
                File file = this.f67877f;
                file.getParentFile().mkdirs();
                SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(file.getPath(), null, 805306368, true, this);
                du2.m113670a("[common][DatabaseStore]", "SQLiteDatabase openDatabase");
                sQLiteDatabaseOpenDatabase.acquirePrimaryConnection();
                try {
                    int version = sQLiteDatabaseOpenDatabase.getVersion();
                    this.f67874c = version;
                    if (version == 0) {
                        this.f67873b.put(0);
                        sQLiteDatabaseOpenDatabase.beginTransaction();
                        try {
                            try {
                                this.f67886o.m123819l(sQLiteDatabaseOpenDatabase);
                            } catch (Exception e) {
                                CrashHelper.m81296c(e);
                                m95279u(sQLiteDatabaseOpenDatabase, "realDbVersion == 0");
                            }
                            du2.m113670a("[common][DatabaseStore]", "SQLiteDatabase onCreate");
                            sQLiteDatabaseOpenDatabase.setVersion(this.f67886o.mo100761c());
                            sQLiteDatabaseOpenDatabase.setTransactionSuccessful();
                            sQLiteDatabaseOpenDatabase.endTransaction();
                            m95264l(sQLiteDatabaseOpenDatabase);
                        } catch (Throwable th) {
                            sQLiteDatabaseOpenDatabase.endTransaction();
                            throw th;
                        }
                    } else {
                        m95264l(sQLiteDatabaseOpenDatabase);
                        sQLiteDatabaseOpenDatabase.beginTransaction();
                        try {
                            if (version <= this.f67886o.m123820m()) {
                                try {
                                    this.f67886o.m123819l(sQLiteDatabaseOpenDatabase);
                                } catch (Exception e2) {
                                    CrashHelper.m81296c(e2);
                                    m95279u(sQLiteDatabaseOpenDatabase, "realDbVersion <= providerManager.getDbSplitVersion()");
                                }
                                du2.m113670a("[common][DatabaseStore]", "SQLiteDatabase onCreate");
                            }
                            if (version < this.f67886o.mo100761c()) {
                                this.f67873b.put(Integer.valueOf(version));
                                try {
                                    r850.m178239h(sQLiteDatabaseOpenDatabase, version, this.f67886o.mo100761c());
                                } catch (Exception e3) {
                                    CrashHelper.m81296c(e3);
                                    m95279u(sQLiteDatabaseOpenDatabase, "realDbVersion < providerManager.dbVersion()");
                                }
                                du2.m113670a("[common][DatabaseStore]", "SQLiteDatabase onUpgrade");
                                sQLiteDatabaseOpenDatabase.setVersion(this.f67886o.mo100761c());
                            } else {
                                if (version > this.f67886o.mo100761c()) {
                                    m95279u(sQLiteDatabaseOpenDatabase, "realDbVersion > providerManager.dbVersion()");
                                    throw new DBCorruptException("new version is " + this.f67875d + ", while old is" + this.f67875d);
                                }
                                du2.m113670a("[common][DatabaseStore]", "SQLiteDatabase 没有版本升级");
                            }
                            sQLiteDatabaseOpenDatabase.setTransactionSuccessful();
                            sQLiteDatabaseOpenDatabase.endTransaction();
                        } catch (Throwable th2) {
                            sQLiteDatabaseOpenDatabase.endTransaction();
                            throw th2;
                        }
                    }
                    sQLiteDatabaseOpenDatabase.releasePrimaryConnection();
                    this.f67878g = sQLiteDatabaseOpenDatabase;
                    ThreadUtil.m81313h(new Runnable() { // from class: l.t6c
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f167958a.m95278t();
                        }
                    }, 100L);
                } catch (Throwable th3) {
                    sQLiteDatabaseOpenDatabase.releasePrimaryConnection();
                    throw th3;
                }
            }
            f67869s.writeLock().unlock();
            return this.f67878g;
        } catch (Throwable th4) {
            f67869s.writeLock().unlock();
            throw th4;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m95271m(boolean z) {
        this.f67886o.m123818k();
        f67869s.writeLock().lock();
        this.f67885n = true;
        f8c.m119878o().m119902z();
        try {
            if (this.f67878g != null) {
                if (this.f67878g.inTransaction()) {
                    this.f67878g.endTransaction();
                }
                du2.m113670a("[common][DatabaseStore]", "SQLiteDatabase close");
                this.f67878g.close();
                if (this.f67879h != null && !this.f67879h.isUnsubscribed()) {
                    this.f67879h.unsubscribe();
                }
                this.f67878g = null;
            }
            du2.m113670a("[common][DatabaseStore]", "SQLiteDatabase before delete");
            if (z || !qib0.f154684C0) {
                SQLiteDatabase.deleteDatabase(this.f67877f);
            }
            du2.m113670a("[common][DatabaseStore]", "SQLiteDatabase after delete");
        } finally {
            f67869s.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m95272n() {
        return this.f67885n;
    }

    /* JADX INFO: renamed from: o */
    public void m95273o() {
        if (this.f67889r) {
            return;
        }
        m95270k().beginTransactionDeferredReadOnly();
        m95270k().getVersion();
        this.f67889r = true;
    }

    @Override // io.requery.android.database.DatabaseErrorHandler
    public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        if (!this.f67872a) {
            this.f67872a = true;
            String strReplace = this.f67876e.replace("core_v2_", "");
            String strUserId = qib0.f154714c0.userId();
            du2.m113670a("[common][DatabaseStore]", "oldUid.equals(newUid) : " + strReplace.equals(strUserId));
            if (strReplace.equals(strUserId)) {
                m95271m(true);
                du2.m113670a("[common][DatabaseStore]", "delete database and throw DBCorruptException");
                throw new DBCorruptException("delete database when database maybe error");
            }
        }
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: p */
    public final int m95274p() {
        return Math.min(this.f67874c, this.f67873b.get().intValue());
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m95275q(boolean z, v9j v9jVar, e30 e30Var, String str, final d30 d30Var) throws Exception {
        try {
            if (m95270k() != null) {
                if (!z) {
                    f67869s.readLock().lock();
                    m95268i(v9jVar, e30Var, str);
                } else if (f67869s.readLock().tryLock()) {
                    m95268i(v9jVar, e30Var, str);
                } else if (d30Var != null) {
                    ThreadUtil.m81312g(new Runnable() { // from class: l.v6c
                        @Override // java.lang.Runnable
                        public final void run() {
                            d30Var.call();
                        }
                    });
                }
            }
        } catch (SQLiteDatabaseCorruptException e) {
            CrashHelper.m81297d(e, 20);
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m95276r() {
        m95265A(new d30() { // from class: l.z6c
            @Override // p149l.d30
            public final void call() {
                a7c.m95260d();
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m95277s(Boolean bool) {
        this.f67884m = bool.booleanValue();
        if (this.f67884m) {
            return;
        }
        e51.m114769t(new Runnable() { // from class: l.x6c
            @Override // java.lang.Runnable
            public final void run() {
                this.f191227a.m95276r();
            }
        }, false);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m95278t() {
        if (m95272n()) {
            return;
        }
        m95273o();
        this.f67879h = this.f67882k.subscribe(mkd0.m154955G(new e30() { // from class: l.w6c
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f184827a.m95277s((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u */
    public void m95279u(SQLiteDatabase sQLiteDatabase, String str) {
        du2.m113670a("[common][DatabaseStore]", "onCorruptionOpt: from:" + str);
        onCorruption(sQLiteDatabase);
    }

    /* JADX INFO: renamed from: v */
    public void m95280v() {
        this.f67886o.m123822o();
    }

    /* JADX INFO: renamed from: w */
    public void m95281w(b8c b8cVar) {
        if (this.f67885n) {
            du2.m113670a(DatabaseStore.TAG, "registerProvider db has delete name: " + b8cVar.mo100763e());
            throw new DBCorruptException("registerProvider db has delete name: " + b8cVar.mo100763e());
        }
        SQLiteDatabase sQLiteDatabaseM95270k = m95270k();
        f67869s.writeLock().lock();
        sQLiteDatabaseM95270k.acquirePrimaryConnection();
        sQLiteDatabaseM95270k.beginTransaction();
        try {
            b8cVar.mo100766h();
            String strMo100763e = b8cVar.mo100763e();
            b8cVar.mo100765g();
            TableProviderInfo tableProviderInfoM123821n = this.f67886o.m123821n(strMo100763e);
            du2.m113670a(DatabaseStore.TAG, "注册provider  " + strMo100763e);
            if (tableProviderInfoM123821n == null) {
                TableProviderInfo tableProviderInfo = new TableProviderInfo();
                tableProviderInfo.name = strMo100763e;
                tableProviderInfo.version = b8cVar.mo100761c();
                tableProviderInfo.f56011id = String.valueOf(b8cVar.mo100762d());
                try {
                    du2.m113670a(DatabaseStore.TAG, "provider thread " + e51.m114739D());
                    if (m95274p() == 0) {
                        m95269j(sQLiteDatabaseM95270k, b8cVar);
                    } else if (b8cVar.mo100761c() > 1) {
                        b8cVar.mo100768j(sQLiteDatabaseM95270k, 1, b8cVar.mo100761c());
                    }
                    du2.m113670a(DatabaseStore.TAG, "升级版本 " + strMo100763e);
                    this.f67886o.m123823p(sQLiteDatabaseM95270k, tableProviderInfo, true);
                } catch (Exception e) {
                    CrashHelper.m81296c(e);
                    m95279u(sQLiteDatabaseM95270k, "registerProvider Exception providerInfo == null");
                }
                du2.m113670a(DatabaseStore.TAG, "db provider init" + b8cVar.mo100763e() + " db version " + sQLiteDatabaseM95270k.getVersion() + ": version old: 0, new: " + b8cVar.mo100761c());
            } else {
                du2.m113670a(DatabaseStore.TAG, "provider thread " + e51.m114739D());
                int i = tableProviderInfoM123821n.version;
                int iMo100761c = b8cVar.mo100761c();
                if (iMo100761c > i) {
                    try {
                        b8cVar.mo100768j(sQLiteDatabaseM95270k, i, iMo100761c);
                        tableProviderInfoM123821n.version = b8cVar.mo100761c();
                        du2.m113670a(DatabaseStore.TAG, "升级版本 " + strMo100763e);
                        this.f67886o.m123823p(sQLiteDatabaseM95270k, tableProviderInfoM123821n, false);
                    } catch (Exception e2) {
                        CrashHelper.m81296c(e2);
                        m95279u(sQLiteDatabaseM95270k, "registerProvider Exception providerInfo != null ");
                    }
                } else {
                    if (iMo100761c < i) {
                        m95279u(sQLiteDatabaseM95270k, "registerProvider newVersion < oldVersion)");
                        throw new DBCorruptException("db provider update" + b8cVar.mo100763e() + " version error new version must >= old version");
                    }
                    du2.m113670a(DatabaseStore.TAG, b8cVar.mo100763e() + " version not change");
                }
                du2.m113670a(DatabaseStore.TAG, "db provider " + b8cVar.mo100763e() + " db version " + sQLiteDatabaseM95270k.getVersion() + ": version old: " + i + ", new: " + iMo100761c);
            }
            sQLiteDatabaseM95270k.setTransactionSuccessful();
            m95282x(b8cVar);
            du2.m113670a(DatabaseStore.TAG, b8cVar.mo100763e() + " deleted():" + m95272n());
            if (!m95272n()) {
                sQLiteDatabaseM95270k.endTransaction();
                sQLiteDatabaseM95270k.releasePrimaryConnection();
            }
            f67869s.writeLock().unlock();
        } catch (Throwable th) {
            du2.m113670a(DatabaseStore.TAG, b8cVar.mo100763e() + " deleted():" + m95272n());
            if (!m95272n()) {
                sQLiteDatabaseM95270k.endTransaction();
                sQLiteDatabaseM95270k.releasePrimaryConnection();
            }
            f67869s.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m95282x(b8c b8cVar) {
        ArrayList<orh0> arrayListMo100764f = b8cVar.mo100764f();
        if (vwb.m200296J(arrayListMo100764f)) {
            return;
        }
        Iterator<orh0> it = arrayListMo100764f.iterator();
        while (it.hasNext()) {
            this.f67880i.add(it.next());
        }
    }

    /* JADX INFO: renamed from: y */
    public void m95283y(TransactionOpt transactionOpt) {
        Map<String, zrh0> map;
        if (this.f67889r) {
            try {
                m95270k().setTransactionSuccessful();
                m95270k().endTransaction();
                this.f67889r = false;
            } catch (Throwable th) {
                m95270k().endTransaction();
                this.f67889r = false;
                throw th;
            }
        }
        if (!this.f67884m && this.f67883l.call().longValue() > Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) {
            m95266B();
        }
        Iterator<j760<d30, d30>> it = transactionOpt.tickSynced.iterator();
        while (it.hasNext()) {
            it.next().f116564a.call();
        }
        for (orh0 orh0Var : this.f67880i) {
            orh0Var.syncUiCache(transactionOpt.get(orh0Var.f145283d));
        }
        m95273o();
        Iterator<j760<d30, d30>> it2 = transactionOpt.tickSynced.iterator();
        while (it2.hasNext()) {
            it2.next().f116565b.call();
        }
        for (orh0 orh0Var2 : this.f67880i) {
            if (transactionOpt.get(orh0Var2.f145283d) != null && (map = orh0Var2.f145284e) != null) {
                Iterator<String> it3 = map.keySet().iterator();
                while (it3.hasNext()) {
                    zrh0 zrh0Var = orh0Var2.f145284e.get(it3.next());
                    if (zrh0Var.m219950a(transactionOpt.get(orh0Var2.f145283d))) {
                        zrh0Var.f204516b.call();
                    }
                }
            }
            orh0Var2.triggerMergeUpdates();
        }
    }

    /* JADX INFO: renamed from: z */
    public void m95284z(d30 d30Var, d30 d30Var2) {
        this.f67888q.tickSynced.add(vwb.m200311Y(d30Var, d30Var2));
    }
}
