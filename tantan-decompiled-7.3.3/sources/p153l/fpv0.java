package p153l;

import com.google.android.gms.internal.play_billing.zzbg;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes6.dex */
public final class fpv0 {

    /* JADX INFO: renamed from: a */
    public final zzbg f100225a = new zzbg();

    /* JADX INFO: renamed from: b */
    public final String f100226b;

    /* JADX INFO: renamed from: c */
    public volatile Logger f100227c;

    public fpv0(Class cls) {
        this.f100226b = cls.getName();
    }

    /* JADX INFO: renamed from: a */
    public final Logger m126720a() {
        Logger logger = this.f100227c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f100225a) {
            try {
                Logger logger2 = this.f100227c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f100226b);
                this.f100227c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
