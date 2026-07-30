package p153l;

import com.p051p1.mobile.putong.core.api.inject.provider.CoreGlobalServiceHolder;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreInnovationProviderInterface;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreMemberProviderInterface;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreMessageProviderInterface;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface;

/* JADX INFO: loaded from: classes9.dex */
public class gta {

    /* JADX INFO: renamed from: b */
    public static volatile gta f106392b;

    /* JADX INFO: renamed from: a */
    public CoreGlobalServiceHolder f106393a;

    public gta() {
        CoreGlobalServiceHolder coreGlobalServiceHolder = new CoreGlobalServiceHolder();
        this.f106393a = coreGlobalServiceHolder;
        coreGlobalServiceHolder.m101410a();
    }

    /* JADX INFO: renamed from: e */
    public static gta m132210e() {
        if (f106392b == null) {
            synchronized (gta.class) {
                try {
                    if (f106392b == null) {
                        f106392b = new gta();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f106392b;
    }

    /* JADX INFO: renamed from: a */
    public CoreInnovationProviderInterface m132211a() {
        return this.f106393a.m34644b();
    }

    /* JADX INFO: renamed from: b */
    public CoreMemberProviderInterface m132212b() {
        return this.f106393a.m34645c();
    }

    /* JADX INFO: renamed from: c */
    public CoreMessageProviderInterface m132213c() {
        return this.f106393a.m34646d();
    }

    /* JADX INFO: renamed from: d */
    public CoreProviderInterface m132214d() {
        return this.f106393a.m34647e();
    }
}
