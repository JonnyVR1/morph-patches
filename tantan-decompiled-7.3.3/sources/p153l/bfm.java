package p153l;

import android.content.Context;
import com.idv.identity.platform.config.CustomUIConfig;

/* JADX INFO: loaded from: classes7.dex */
public class bfm {

    /* JADX INFO: renamed from: a */
    private Context f76523a;

    /* JADX INFO: renamed from: b */
    private CustomUIConfig f76524b;

    /* JADX INFO: renamed from: l.bfm$b */
    public static final class C15981b {

        /* JADX INFO: renamed from: a */
        static final bfm f76525a = new bfm();
    }

    /* JADX INFO: renamed from: c */
    public static bfm m103928c() {
        return C15981b.f76525a;
    }

    /* JADX INFO: renamed from: a */
    public String m103929a(int i, String str) {
        CustomUIConfig customUIConfigM101061u = azb.m101061u(i, str);
        if (customUIConfigM101061u.isValid()) {
            this.f76524b = customUIConfigM101061u;
        }
        return customUIConfigM101061u.getErrMsg();
    }

    /* JADX INFO: renamed from: b */
    public Context m103930b() {
        if (this.f76523a == null) {
            m103931d(xrl.m212838a().m212839b());
        }
        return this.f76523a;
    }

    /* JADX INFO: renamed from: d */
    public bfm m103931d(Context context) {
        if (this.f76523a == null && context != null) {
            this.f76523a = context.getApplicationContext();
        }
        return this;
    }

    private bfm() {
    }
}
