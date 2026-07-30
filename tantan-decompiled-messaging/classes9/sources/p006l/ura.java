package p006l;

import com.p000p1.mobile.putong.core.api.inject.provider.CoreGlobalServiceHolder;
import com.p000p1.mobile.putong.core.api.inject.provider.CoreInnovationProviderInterface;
import com.p000p1.mobile.putong.core.api.inject.provider.CoreMemberProviderInterface;
import com.p000p1.mobile.putong.core.api.inject.provider.CoreMessageProviderInterface;
import com.p000p1.mobile.putong.core.api.inject.provider.CoreProviderInterface;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ura {

    /* JADX INFO: renamed from: b */
    public static volatile ura f23719b;

    /* JADX INFO: renamed from: a */
    public CoreGlobalServiceHolder f23720a;

    public ura() {
        CoreGlobalServiceHolder coreGlobalServiceHolder = new CoreGlobalServiceHolder();
        this.f23720a = coreGlobalServiceHolder;
        coreGlobalServiceHolder.m28474a();
    }

    /* JADX INFO: renamed from: e */
    public static ura m25555e() {
        if (f23719b == null) {
            synchronized (ura.class) {
                try {
                    if (f23719b == null) {
                        f23719b = new ura();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f23719b;
    }

    /* JADX INFO: renamed from: a */
    public CoreInnovationProviderInterface m25556a() {
        return this.f23720a.m5578b();
    }

    /* JADX INFO: renamed from: b */
    public CoreMemberProviderInterface m25557b() {
        return this.f23720a.m5579c();
    }

    /* JADX INFO: renamed from: c */
    public CoreMessageProviderInterface m25558c() {
        return this.f23720a.m5580d();
    }

    /* JADX INFO: renamed from: d */
    public CoreProviderInterface m25559d() {
        return this.f23720a.m5581e();
    }
}
