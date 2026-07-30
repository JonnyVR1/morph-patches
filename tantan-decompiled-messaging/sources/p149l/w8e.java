package p149l;

import com.immomo.mmutil.log.Log4Android;
import org.greenrobot.greendao.database.Database;

/* JADX INFO: loaded from: classes7.dex */
public class w8e {

    /* JADX INFO: renamed from: c */
    public static w8e f185204c = new w8e();

    /* JADX INFO: renamed from: a */
    private Database f185205a = null;

    /* JADX INFO: renamed from: b */
    private m2c f185206b;

    /* JADX INFO: renamed from: d */
    public static w8e m202156d() {
        return f185204c;
    }

    /* JADX INFO: renamed from: a */
    public synchronized boolean m202157a() {
        if (this.f185206b != null) {
            return true;
        }
        try {
            Database writableDb = new h5j(ev0.m118233a(), "framework_db").getWritableDb();
            this.f185205a = writableDb;
            try {
                writableDb.execSQL("PRAGMA cache_size=100;");
            } catch (Throwable th) {
                Log4Android.m18417f().m18422e(th);
            }
            m202160e(new k2c(this.f185205a).newSession());
            return true;
        } catch (Throwable th2) {
            Log4Android.m18417f().m18422e(th2);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public void m202158b(Object obj) {
        if (m202157a()) {
            this.f185206b.getDao(obj.getClass()).delete(obj);
        }
    }

    /* JADX INFO: renamed from: c */
    public <T> T m202159c(Object obj, Class<T> cls) {
        if (m202157a()) {
            return (T) this.f185206b.getDao(cls).load(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public void m202160e(m2c m2cVar) {
        this.f185206b = m2cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public void m202161f(Object obj) {
        if (m202157a()) {
            this.f185206b.getDao(obj.getClass()).insertOrReplace(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public void m202162g(Object obj) {
        if (m202157a()) {
            this.f185206b.getDao(obj.getClass()).update(obj);
        }
    }
}
