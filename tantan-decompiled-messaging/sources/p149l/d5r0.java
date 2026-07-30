package p149l;

import androidx.annotation.Nullable;
import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class d5r0 {

    /* JADX INFO: renamed from: a */
    public final c5r0 f84553a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f84554b = new AtomicBoolean(false);

    public d5r0(c5r0 c5r0Var) {
        this.f84553a = c5r0Var;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final j5r0 m110069a(Object... objArr) {
        Constructor constructorZza;
        synchronized (this.f84554b) {
            try {
                if (!this.f84554b.get()) {
                    try {
                        constructorZza = this.f84553a.zza();
                    } catch (ClassNotFoundException unused) {
                        this.f84554b.set(true);
                        constructorZza = null;
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating extension", e);
                    }
                }
                constructorZza = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (constructorZza == null) {
            return null;
        }
        try {
            return (j5r0) constructorZza.newInstance(objArr);
        } catch (Exception e2) {
            byv.m104511a("Unexpected error creating extractor", e2);
            return null;
        }
    }
}
