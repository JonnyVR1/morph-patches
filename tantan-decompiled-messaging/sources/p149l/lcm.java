package p149l;

import android.content.Context;
import com.idv.identity.platform.config.CustomUIConfig;

/* JADX INFO: loaded from: classes7.dex */
public class lcm {

    /* JADX INFO: renamed from: a */
    private Context f127434a;

    /* JADX INFO: renamed from: b */
    private CustomUIConfig f127435b;

    /* JADX INFO: renamed from: l.lcm$b */
    public static final class C18190b {

        /* JADX INFO: renamed from: a */
        static final lcm f127436a = new lcm();
    }

    /* JADX INFO: renamed from: c */
    public static lcm m149335c() {
        return C18190b.f127436a;
    }

    /* JADX INFO: renamed from: a */
    public String m149336a(int i, String str) {
        CustomUIConfig customUIConfigM156868u = mxb.m156868u(i, str);
        if (customUIConfigM156868u.isValid()) {
            this.f127435b = customUIConfigM156868u;
        }
        return customUIConfigM156868u.getErrMsg();
    }

    /* JADX INFO: renamed from: b */
    public Context m149337b() {
        if (this.f127434a == null) {
            m149338d(kpl.m146872a().m146873b());
        }
        return this.f127434a;
    }

    /* JADX INFO: renamed from: d */
    public lcm m149338d(Context context) {
        if (this.f127434a == null && context != null) {
            this.f127434a = context.getApplicationContext();
        }
        return this;
    }

    private lcm() {
    }
}
