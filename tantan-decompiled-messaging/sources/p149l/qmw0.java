package p149l;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes6.dex */
public final class qmw0 {

    /* JADX INFO: renamed from: a */
    public final String f155347a;

    /* JADX INFO: renamed from: b */
    public volatile Logger f155348b;

    public qmw0(Class cls) {
        this.f155347a = cls.getName();
    }

    /* JADX INFO: renamed from: a */
    public final Logger m175582a() {
        Logger logger = this.f155348b;
        if (logger != null) {
            return logger;
        }
        synchronized (this) {
            try {
                Logger logger2 = this.f155348b;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f155347a);
                this.f155348b = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
