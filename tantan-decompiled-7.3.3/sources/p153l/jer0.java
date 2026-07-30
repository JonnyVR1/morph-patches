package p153l;

import androidx.annotation.Nullable;
import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class jer0 {

    /* JADX INFO: renamed from: a */
    public final ier0 f120517a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f120518b = new AtomicBoolean(false);

    public jer0(ier0 ier0Var) {
        this.f120517a = ier0Var;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final per0 m144605a(Object... objArr) {
        Constructor constructorZza;
        synchronized (this.f120518b) {
            try {
                if (!this.f120518b.get()) {
                    try {
                        constructorZza = this.f120517a.zza();
                    } catch (ClassNotFoundException unused) {
                        this.f120518b.set(true);
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
            return (per0) constructorZza.newInstance(objArr);
        } catch (Exception e2) {
            yzv.m218057a("Unexpected error creating extractor", e2);
            return null;
        }
    }
}
