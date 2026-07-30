package p153l;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes6.dex */
public final class wvw0 {

    /* JADX INFO: renamed from: a */
    public final String f190996a;

    /* JADX INFO: renamed from: b */
    public volatile Logger f190997b;

    public wvw0(Class cls) {
        this.f190996a = cls.getName();
    }

    /* JADX INFO: renamed from: a */
    public final Logger m208109a() {
        Logger logger = this.f190997b;
        if (logger != null) {
            return logger;
        }
        synchronized (this) {
            try {
                Logger logger2 = this.f190997b;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f190996a);
                this.f190997b = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
