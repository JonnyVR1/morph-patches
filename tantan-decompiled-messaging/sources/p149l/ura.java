package p149l;

import com.p046p1.mobile.putong.core.api.inject.provider.CoreGlobalServiceHolder;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreInnovationProviderInterface;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreMemberProviderInterface;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreMessageProviderInterface;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface;

/* JADX INFO: loaded from: classes9.dex */
public class ura {

    /* JADX INFO: renamed from: b */
    public static volatile ura f177816b;

    /* JADX INFO: renamed from: a */
    public CoreGlobalServiceHolder f177817a;

    public ura() {
        CoreGlobalServiceHolder coreGlobalServiceHolder = new CoreGlobalServiceHolder();
        this.f177817a = coreGlobalServiceHolder;
        coreGlobalServiceHolder.m216596a();
    }

    /* JADX INFO: renamed from: e */
    public static ura m195053e() {
        if (f177816b == null) {
            synchronized (ura.class) {
                try {
                    if (f177816b == null) {
                        f177816b = new ura();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f177816b;
    }

    /* JADX INFO: renamed from: a */
    public CoreInnovationProviderInterface m195054a() {
        return this.f177817a.m33641b();
    }

    /* JADX INFO: renamed from: b */
    public CoreMemberProviderInterface m195055b() {
        return this.f177817a.m33642c();
    }

    /* JADX INFO: renamed from: c */
    public CoreMessageProviderInterface m195056c() {
        return this.f177817a.m33643d();
    }

    /* JADX INFO: renamed from: d */
    public CoreProviderInterface m195057d() {
        return this.f177817a.m33644e();
    }
}
