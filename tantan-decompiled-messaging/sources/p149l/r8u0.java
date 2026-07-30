package p149l;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class r8u0 extends kcu0 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<Bundle> f158255a = new AtomicReference<>();

    /* JADX INFO: renamed from: b */
    public boolean f158256b;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
    
        r2 = r2.get("r");
     */
    /* JADX INFO: renamed from: Y2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> T m178282Y2(android.os.Bundle r2, java.lang.Class<T> r3) {
        /*
            r0 = 0
            if (r2 == 0) goto L27
            java.lang.String r1 = "r"
            java.lang.Object r2 = r2.get(r1)
            if (r2 == 0) goto L27
            java.lang.Object r2 = r3.cast(r2)     // Catch: java.lang.ClassCastException -> L10
            return r2
        L10:
            r0 = move-exception
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getCanonicalName()
            java.lang.String r1 = "Unexpected object type. Expected, Received: %s, %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2}
            java.lang.String.format(r1, r2)
            throw r0
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.r8u0.m178282Y2(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    /* JADX INFO: renamed from: P2 */
    public final Bundle m178283P2(long j) {
        Bundle bundle;
        synchronized (this.f158255a) {
            if (!this.f158256b) {
                try {
                    this.f158255a.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.f158255a.get();
        }
        return bundle;
    }

    /* JADX INFO: renamed from: P3 */
    public final Long m178284P3(long j) {
        return (Long) m178282Y2(m178283P2(j), Long.class);
    }

    /* JADX INFO: renamed from: m4 */
    public final String m178285m4(long j) {
        return (String) m178282Y2(m178283P2(j), String.class);
    }

    @Override // p149l.qdu0
    public final void zza(Bundle bundle) {
        synchronized (this.f158255a) {
            try {
                try {
                    this.f158255a.set(bundle);
                    this.f158256b = true;
                    this.f158255a.notify();
                } catch (Throwable th) {
                    this.f158255a.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
