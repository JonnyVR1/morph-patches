package p153l;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.os.SystemClock;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.TableProviderInfo;
import com.p051p1.mobile.putong.dbcenter.p062db.opt.TransactionOpt;
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
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
public class g8c implements DatabaseErrorHandler {

    /* JADX INFO: renamed from: s */
    public static final ReadWriteLock f102654s = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: t */
    public static boolean f102655t = false;

    /* JADX INFO: renamed from: u */
    public static boolean f102656u = false;

    /* JADX INFO: renamed from: b */
    public vxd0 f102658b;

    /* JADX INFO: renamed from: d */
    public final int f102660d;

    /* JADX INFO: renamed from: e */
    public final String f102661e;

    /* JADX INFO: renamed from: f */
    public final File f102662f;

    /* JADX INFO: renamed from: g */
    public volatile SQLiteDatabase f102663g;

    /* JADX INFO: renamed from: h */
    public volatile kcg0 f102664h;

    /* JADX INFO: renamed from: i */
    public final List<wzh0> f102665i;

    /* JADX INFO: renamed from: j */
    public final List<wzh0> f102666j;

    /* JADX INFO: renamed from: k */
    public C22421c<Boolean> f102667k;

    /* JADX INFO: renamed from: l */
    public pcj<Long> f102668l;

    /* JADX INFO: renamed from: m */
    public volatile boolean f102669m;

    /* JADX INFO: renamed from: n */
    public volatile boolean f102670n;

    /* JADX INFO: renamed from: o */
    public j7b0 f102671o;

    /* JADX INFO: renamed from: p */
    public boolean f102672p;

    /* JADX INFO: renamed from: q */
    public TransactionOpt f102673q;

    /* JADX INFO: renamed from: r */
    public boolean f102674r;

    /* JADX INFO: renamed from: a */
    public boolean f102657a = false;

    /* JADX INFO: renamed from: c */
    public int f102659c = 0;

    /* JADX INFO: renamed from: l.g8c$a */
    public class RunnableC17177a implements Runnable {

        /* JADX INFO: renamed from: a */
        public TransactionOpt f102675a;

        public RunnableC17177a() {
            this.f102675a = g8c.this.f102673q;
        }

        @Override // java.lang.Runnable
        public void run() {
            TransactionOpt transactionOpt;
            if (!g8c.this.m129392n() && (transactionOpt = this.f102675a) != null) {
                g8c.this.m129403y(transactionOpt);
            }
            this.f102675a = null;
        }
    }

    public g8c(String str, File file, int i, C22421c<Boolean> c22421c, pcj<Long> pcjVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f102665i = copyOnWriteArrayList;
        this.f102666j = copyOnWriteArrayList;
        this.f102669m = false;
        this.f102670n = false;
        this.f102671o = new j7b0();
        this.f102672p = false;
        this.f102674r = false;
        this.f102661e = str;
        this.f102662f = file;
        this.f102660d = i;
        this.f102667k = c22421c;
        this.f102668l = pcjVar;
        this.f102658b = new vxd0(str, this.f102671o.m143770m());
        this.f102671o.mo133948g();
        this.f102671o.mo133949h();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m129380d() {
    }

    /* JADX INFO: renamed from: l */
    private void m129384l(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder("PRAGMA wal_checkpoint(");
        sb.append(this.f102672p ? "PASSIVE" : "TRUNCATE");
        sb.append(");");
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
        this.f102672p = true;
        cursorRawQuery.getCount();
        cursorRawQuery.close();
    }

    /* JADX INFO: renamed from: A */
    public void m129385A(x20 x20Var) {
        if (m129392n()) {
            return;
        }
        SystemClock.uptimeMillis();
        f102654s.writeLock().lock();
        m129390k().beginTransactionDeferredWrite();
        try {
            this.f102673q = new TransactionOpt();
            if (l9c.m153394o().m153410r()) {
                x20Var.call();
            }
            m129390k().setTransactionSuccessful();
            m129390k().endTransaction();
            if (!f102656u) {
                ThreadUtil.m82495g(new RunnableC17177a());
            }
            this.f102673q = null;
        } finally {
            m129390k().endTransaction();
            this.f102673q = null;
            f102654s.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m129386B() {
        if (this.f102663g == null || !f102654s.writeLock().tryLock()) {
            return;
        }
        try {
            m129384l(m129390k());
        } finally {
            f102654s.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: h */
    public <T> void m129387h(final boolean z, final pcj<T> pcjVar, final y20<T> y20Var, final x20 x20Var, boolean z2, final String str) {
        l51.m152914t(new Runnable() { // from class: l.a8c
            @Override // java.lang.Runnable
            public final void run() throws Exception {
                this.f68895a.m129395q(z, pcjVar, y20Var, str, x20Var);
            }
        }, z2);
    }

    /* JADX INFO: renamed from: i */
    public <T> void m129388i(pcj<T> pcjVar, final y20<T> y20Var, String str) throws Exception {
        if (m129392n()) {
            return;
        }
        try {
            m129390k().beginTransactionDeferredReadOnly();
            try {
                final T tCall = pcjVar.call();
                ThreadUtil.m82495g(new Runnable() { // from class: l.e8c
                    @Override // java.lang.Runnable
                    public final void run() {
                        y20Var.call(tCall);
                    }
                });
                m129390k().setTransactionSuccessful();
            } finally {
                m129390k().endTransaction();
                f102654s.readLock().unlock();
            }
        } catch (Exception e) {
            CrashHelper.m82479c(new RuntimeException("queryFetchError:" + str, e));
            throw e;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m129389j(SQLiteDatabase sQLiteDatabase, h9c h9cVar) {
        ArrayList<wzh0> arrayListMo134045f = h9cVar.mo134045f();
        if (jyb.m147479J(arrayListMo134045f)) {
            return;
        }
        for (wzh0 wzh0Var : arrayListMo134045f) {
            tu2.m192703a(DatabaseStore.TAG, "初始化table " + wzh0Var.f191760d);
            sQLiteDatabase.execSQL(wzh0Var.f191758b.CREATE_TABLE(wzh0Var));
            for (int i = 0; i < wzh0Var.f191757a.size(); i++) {
                sQLiteDatabase.execSQL(wzh0Var.f191758b.CREATE_INDEX(wzh0Var, wzh0Var.f191757a.get(i)));
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public SQLiteDatabase m129390k() {
        if (this.f102663g != null) {
            return this.f102663g;
        }
        f102654s.writeLock().lock();
        try {
            if (this.f102663g == null) {
                tu2.m192703a("[common][DatabaseStore]", "inter create db");
                File file = this.f102662f;
                file.getParentFile().mkdirs();
                SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(file.getPath(), null, 805306368, true, this);
                tu2.m192703a("[common][DatabaseStore]", "SQLiteDatabase openDatabase");
                sQLiteDatabaseOpenDatabase.acquirePrimaryConnection();
                try {
                    int version = sQLiteDatabaseOpenDatabase.getVersion();
                    this.f102659c = version;
                    if (version == 0) {
                        this.f102658b.put(0);
                        sQLiteDatabaseOpenDatabase.beginTransaction();
                        try {
                            try {
                                this.f102671o.m143769l(sQLiteDatabaseOpenDatabase);
                            } catch (Exception e) {
                                CrashHelper.m82479c(e);
                                m129399u(sQLiteDatabaseOpenDatabase, "realDbVersion == 0");
                            }
                            tu2.m192703a("[common][DatabaseStore]", "SQLiteDatabase onCreate");
                            sQLiteDatabaseOpenDatabase.setVersion(this.f102671o.mo133945c());
                            sQLiteDatabaseOpenDatabase.setTransactionSuccessful();
                            sQLiteDatabaseOpenDatabase.endTransaction();
                            m129384l(sQLiteDatabaseOpenDatabase);
                        } catch (Throwable th) {
                            sQLiteDatabaseOpenDatabase.endTransaction();
                            throw th;
                        }
                    } else {
                        m129384l(sQLiteDatabaseOpenDatabase);
                        sQLiteDatabaseOpenDatabase.beginTransaction();
                        try {
                            if (version <= this.f102671o.m143770m()) {
                                try {
                                    this.f102671o.m143769l(sQLiteDatabaseOpenDatabase);
                                } catch (Exception e2) {
                                    CrashHelper.m82479c(e2);
                                    m129399u(sQLiteDatabaseOpenDatabase, "realDbVersion <= providerManager.getDbSplitVersion()");
                                }
                                tu2.m192703a("[common][DatabaseStore]", "SQLiteDatabase onCreate");
                            }
                            if (version < this.f102671o.mo133945c()) {
                                this.f102658b.put(Integer.valueOf(version));
                                try {
                                    yg50.m215837h(sQLiteDatabaseOpenDatabase, version, this.f102671o.mo133945c());
                                } catch (Exception e3) {
                                    CrashHelper.m82479c(e3);
                                    m129399u(sQLiteDatabaseOpenDatabase, "realDbVersion < providerManager.dbVersion()");
                                }
                                tu2.m192703a("[common][DatabaseStore]", "SQLiteDatabase onUpgrade");
                                sQLiteDatabaseOpenDatabase.setVersion(this.f102671o.mo133945c());
                            } else {
                                if (version > this.f102671o.mo133945c()) {
                                    m129399u(sQLiteDatabaseOpenDatabase, "realDbVersion > providerManager.dbVersion()");
                                    throw new DBCorruptException("new version is " + this.f102660d + ", while old is" + this.f102660d);
                                }
                                tu2.m192703a("[common][DatabaseStore]", "SQLiteDatabase 没有版本升级");
                            }
                            sQLiteDatabaseOpenDatabase.setTransactionSuccessful();
                            sQLiteDatabaseOpenDatabase.endTransaction();
                        } catch (Throwable th2) {
                            sQLiteDatabaseOpenDatabase.endTransaction();
                            throw th2;
                        }
                    }
                    sQLiteDatabaseOpenDatabase.releasePrimaryConnection();
                    this.f102663g = sQLiteDatabaseOpenDatabase;
                    ThreadUtil.m82496h(new Runnable() { // from class: l.z7c
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f203231a.m129398t();
                        }
                    }, 100L);
                } catch (Throwable th3) {
                    sQLiteDatabaseOpenDatabase.releasePrimaryConnection();
                    throw th3;
                }
            }
            f102654s.writeLock().unlock();
            return this.f102663g;
        } catch (Throwable th4) {
            f102654s.writeLock().unlock();
            throw th4;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m129391m(boolean z) {
        this.f102671o.m143768k();
        f102654s.writeLock().lock();
        this.f102670n = true;
        l9c.m153394o().m153418z();
        try {
            if (this.f102663g != null) {
                if (this.f102663g.inTransaction()) {
                    this.f102663g.endTransaction();
                }
                tu2.m192703a("[common][DatabaseStore]", "SQLiteDatabase close");
                this.f102663g.close();
                if (this.f102664h != null && !this.f102664h.isUnsubscribed()) {
                    this.f102664h.unsubscribe();
                }
                this.f102663g = null;
            }
            tu2.m192703a("[common][DatabaseStore]", "SQLiteDatabase before delete");
            if (z || !uqb0.f180367C0) {
                SQLiteDatabase.deleteDatabase(this.f102662f);
            }
            tu2.m192703a("[common][DatabaseStore]", "SQLiteDatabase after delete");
        } finally {
            f102654s.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m129392n() {
        return this.f102670n;
    }

    /* JADX INFO: renamed from: o */
    public void m129393o() {
        if (this.f102674r) {
            return;
        }
        m129390k().beginTransactionDeferredReadOnly();
        m129390k().getVersion();
        this.f102674r = true;
    }

    @Override // io.requery.android.database.DatabaseErrorHandler
    public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        if (!this.f102657a) {
            this.f102657a = true;
            String strReplace = this.f102661e.replace("core_v2_", "");
            String strUserId = uqb0.f180397c0.userId();
            tu2.m192703a("[common][DatabaseStore]", "oldUid.equals(newUid) : " + strReplace.equals(strUserId));
            if (strReplace.equals(strUserId)) {
                m129391m(true);
                tu2.m192703a("[common][DatabaseStore]", "delete database and throw DBCorruptException");
                throw new DBCorruptException("delete database when database maybe error");
            }
        }
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: p */
    public final int m129394p() {
        return Math.min(this.f102659c, this.f102658b.get().intValue());
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m129395q(boolean z, pcj pcjVar, y20 y20Var, String str, final x20 x20Var) throws Exception {
        try {
            if (m129390k() != null) {
                if (!z) {
                    f102654s.readLock().lock();
                    m129388i(pcjVar, y20Var, str);
                } else if (f102654s.readLock().tryLock()) {
                    m129388i(pcjVar, y20Var, str);
                } else if (x20Var != null) {
                    ThreadUtil.m82495g(new Runnable() { // from class: l.b8c
                        @Override // java.lang.Runnable
                        public final void run() {
                            x20Var.call();
                        }
                    });
                }
            }
        } catch (SQLiteDatabaseCorruptException e) {
            CrashHelper.m82480d(e, 20);
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m129396r() {
        m129385A(new x20() { // from class: l.f8c
            @Override // p153l.x20
            public final void call() {
                g8c.m129380d();
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m129397s(Boolean bool) {
        this.f102669m = bool.booleanValue();
        if (this.f102669m) {
            return;
        }
        l51.m152914t(new Runnable() { // from class: l.d8c
            @Override // java.lang.Runnable
            public final void run() {
                this.f85592a.m129396r();
            }
        }, false);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m129398t() {
        if (m129392n()) {
            return;
        }
        m129393o();
        this.f102664h = this.f102667k.subscribe(psd0.m173596G(new y20() { // from class: l.c8c
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f80194a.m129397s((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u */
    public void m129399u(SQLiteDatabase sQLiteDatabase, String str) {
        tu2.m192703a("[common][DatabaseStore]", "onCorruptionOpt: from:" + str);
        onCorruption(sQLiteDatabase);
    }

    /* JADX INFO: renamed from: v */
    public void m129400v() {
        this.f102671o.m143772o();
    }

    /* JADX INFO: renamed from: w */
    public void m129401w(h9c h9cVar) {
        if (this.f102670n) {
            tu2.m192703a(DatabaseStore.TAG, "registerProvider db has delete name: " + h9cVar.mo133947e());
            throw new DBCorruptException("registerProvider db has delete name: " + h9cVar.mo133947e());
        }
        SQLiteDatabase sQLiteDatabaseM129390k = m129390k();
        f102654s.writeLock().lock();
        sQLiteDatabaseM129390k.acquirePrimaryConnection();
        sQLiteDatabaseM129390k.beginTransaction();
        try {
            h9cVar.mo133949h();
            String strMo133947e = h9cVar.mo133947e();
            h9cVar.mo133948g();
            TableProviderInfo tableProviderInfoM143771n = this.f102671o.m143771n(strMo133947e);
            tu2.m192703a(DatabaseStore.TAG, "注册provider  " + strMo133947e);
            if (tableProviderInfoM143771n == null) {
                TableProviderInfo tableProviderInfo = new TableProviderInfo();
                tableProviderInfo.name = strMo133947e;
                tableProviderInfo.version = h9cVar.mo133945c();
                tableProviderInfo.f56859id = String.valueOf(h9cVar.mo133946d());
                try {
                    tu2.m192703a(DatabaseStore.TAG, "provider thread " + l51.m152884D());
                    if (m129394p() == 0) {
                        m129389j(sQLiteDatabaseM129390k, h9cVar);
                    } else if (h9cVar.mo133945c() > 1) {
                        h9cVar.mo133951j(sQLiteDatabaseM129390k, 1, h9cVar.mo133945c());
                    }
                    tu2.m192703a(DatabaseStore.TAG, "升级版本 " + strMo133947e);
                    this.f102671o.m143773p(sQLiteDatabaseM129390k, tableProviderInfo, true);
                } catch (Exception e) {
                    CrashHelper.m82479c(e);
                    m129399u(sQLiteDatabaseM129390k, "registerProvider Exception providerInfo == null");
                }
                tu2.m192703a(DatabaseStore.TAG, "db provider init" + h9cVar.mo133947e() + " db version " + sQLiteDatabaseM129390k.getVersion() + ": version old: 0, new: " + h9cVar.mo133945c());
            } else {
                tu2.m192703a(DatabaseStore.TAG, "provider thread " + l51.m152884D());
                int i = tableProviderInfoM143771n.version;
                int iMo133945c = h9cVar.mo133945c();
                if (iMo133945c > i) {
                    try {
                        h9cVar.mo133951j(sQLiteDatabaseM129390k, i, iMo133945c);
                        tableProviderInfoM143771n.version = h9cVar.mo133945c();
                        tu2.m192703a(DatabaseStore.TAG, "升级版本 " + strMo133947e);
                        this.f102671o.m143773p(sQLiteDatabaseM129390k, tableProviderInfoM143771n, false);
                    } catch (Exception e2) {
                        CrashHelper.m82479c(e2);
                        m129399u(sQLiteDatabaseM129390k, "registerProvider Exception providerInfo != null ");
                    }
                } else {
                    if (iMo133945c < i) {
                        m129399u(sQLiteDatabaseM129390k, "registerProvider newVersion < oldVersion)");
                        throw new DBCorruptException("db provider update" + h9cVar.mo133947e() + " version error new version must >= old version");
                    }
                    tu2.m192703a(DatabaseStore.TAG, h9cVar.mo133947e() + " version not change");
                }
                tu2.m192703a(DatabaseStore.TAG, "db provider " + h9cVar.mo133947e() + " db version " + sQLiteDatabaseM129390k.getVersion() + ": version old: " + i + ", new: " + iMo133945c);
            }
            sQLiteDatabaseM129390k.setTransactionSuccessful();
            m129402x(h9cVar);
            tu2.m192703a(DatabaseStore.TAG, h9cVar.mo133947e() + " deleted():" + m129392n());
            if (!m129392n()) {
                sQLiteDatabaseM129390k.endTransaction();
                sQLiteDatabaseM129390k.releasePrimaryConnection();
            }
            f102654s.writeLock().unlock();
        } catch (Throwable th) {
            tu2.m192703a(DatabaseStore.TAG, h9cVar.mo133947e() + " deleted():" + m129392n());
            if (!m129392n()) {
                sQLiteDatabaseM129390k.endTransaction();
                sQLiteDatabaseM129390k.releasePrimaryConnection();
            }
            f102654s.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m129402x(h9c h9cVar) {
        ArrayList<wzh0> arrayListMo134045f = h9cVar.mo134045f();
        if (jyb.m147479J(arrayListMo134045f)) {
            return;
        }
        Iterator<wzh0> it = arrayListMo134045f.iterator();
        while (it.hasNext()) {
            this.f102665i.add(it.next());
        }
    }

    /* JADX INFO: renamed from: y */
    public void m129403y(TransactionOpt transactionOpt) {
        Map<String, h0i0> map;
        if (this.f102674r) {
            try {
                m129390k().setTransactionSuccessful();
                m129390k().endTransaction();
                this.f102674r = false;
            } catch (Throwable th) {
                m129390k().endTransaction();
                this.f102674r = false;
                throw th;
            }
        }
        if (!this.f102669m && this.f102668l.call().longValue() > Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) {
            m129386B();
        }
        Iterator<pf60<x20, x20>> it = transactionOpt.tickSynced.iterator();
        while (it.hasNext()) {
            it.next().f152156a.call();
        }
        for (wzh0 wzh0Var : this.f102665i) {
            wzh0Var.syncUiCache(transactionOpt.get(wzh0Var.f191760d));
        }
        m129393o();
        Iterator<pf60<x20, x20>> it2 = transactionOpt.tickSynced.iterator();
        while (it2.hasNext()) {
            it2.next().f152157b.call();
        }
        for (wzh0 wzh0Var2 : this.f102665i) {
            if (transactionOpt.get(wzh0Var2.f191760d) != null && (map = wzh0Var2.f191761e) != null) {
                Iterator<String> it3 = map.keySet().iterator();
                while (it3.hasNext()) {
                    h0i0 h0i0Var = wzh0Var2.f191761e.get(it3.next());
                    if (h0i0Var.m133169a(transactionOpt.get(wzh0Var2.f191760d))) {
                        h0i0Var.f107303b.call();
                    }
                }
            }
            wzh0Var2.triggerMergeUpdates();
        }
    }

    /* JADX INFO: renamed from: z */
    public void m129404z(x20 x20Var, x20 x20Var2) {
        this.f102673q.tickSynced.add(jyb.m147494Y(x20Var, x20Var2));
    }
}
