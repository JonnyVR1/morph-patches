package p153l;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class xhu0 extends qlu0 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<Bundle> f194403a = new AtomicReference<>();

    /* JADX INFO: renamed from: b */
    public boolean f194404b;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
    
        r2 = r2.get("r");
     */
    /* JADX INFO: renamed from: Y2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> T m211076Y2(Bundle bundle, Class<T> cls) {
        Object obj;
        if (bundle == null || obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName());
            throw e;
        }
    }

    /* JADX INFO: renamed from: P2 */
    public final Bundle m211077P2(long j) {
        Bundle bundle;
        synchronized (this.f194403a) {
            if (!this.f194404b) {
                try {
                    this.f194403a.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.f194403a.get();
        }
        return bundle;
    }

    /* JADX INFO: renamed from: P3 */
    public final Long m211078P3(long j) {
        return (Long) m211076Y2(m211077P2(j), Long.class);
    }

    /* JADX INFO: renamed from: m4 */
    public final String m211079m4(long j) {
        return (String) m211076Y2(m211077P2(j), String.class);
    }

    @Override // p153l.wmu0
    public final void zza(Bundle bundle) {
        synchronized (this.f194403a) {
            try {
                try {
                    this.f194403a.set(bundle);
                    this.f194404b = true;
                    this.f194403a.notify();
                } catch (Throwable th) {
                    this.f194403a.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
