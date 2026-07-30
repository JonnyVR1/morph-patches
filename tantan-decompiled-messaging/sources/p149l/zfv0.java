package p149l;

import com.google.android.gms.internal.play_billing.zzbg;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes6.dex */
public final class zfv0 {

    /* JADX INFO: renamed from: a */
    public final zzbg f202987a = new zzbg();

    /* JADX INFO: renamed from: b */
    public final String f202988b;

    /* JADX INFO: renamed from: c */
    public volatile Logger f202989c;

    public zfv0(Class cls) {
        this.f202988b = cls.getName();
    }

    /* JADX INFO: renamed from: a */
    public final Logger m218623a() {
        Logger logger = this.f202989c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f202987a) {
            try {
                Logger logger2 = this.f202989c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f202988b);
                this.f202989c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
