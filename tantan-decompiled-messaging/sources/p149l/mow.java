package p149l;

import android.app.Application;
import com.cosmos.mdlog.MDLog;
import com.immomo.components.interfaces.IProcessOutput;

/* JADX INFO: loaded from: classes7.dex */
public class mow {

    /* JADX INFO: renamed from: b */
    private static final String f134956b = "mow";

    /* JADX INFO: renamed from: c */
    private static volatile mow f134957c;

    /* JADX INFO: renamed from: a */
    private kvl f134958a;

    private mow() {
        m155710l();
    }

    /* JADX INFO: renamed from: j */
    public static synchronized mow m155709j() {
        try {
            if (f134957c == null) {
                synchronized (mow.class) {
                    try {
                        if (f134957c == null) {
                            f134957c = new mow();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f134957c;
    }

    /* JADX INFO: renamed from: l */
    private void m155710l() {
        if (this.f134958a == null) {
            try {
                this.f134958a = (kvl) Class.forName("com.mm.MagicEffectRegisterProvider").newInstance();
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                MDLog.printErrStackTrace(f134956b, e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m155711a() {
        return this.f134958a != null;
    }

    /* JADX INFO: renamed from: b */
    public dnl m155712b() {
        kvl kvlVar = this.f134958a;
        if (kvlVar != null) {
            kvlVar.m147379f();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public inl m155713c() {
        kvl kvlVar = this.f134958a;
        if (kvlVar != null) {
            kvlVar.m147382i();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public jnl m155714d() {
        kvl kvlVar = this.f134958a;
        if (kvlVar != null) {
            kvlVar.m147381h();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public v0m m155715e() {
        kvl kvlVar = this.f134958a;
        if (kvlVar != null) {
            kvlVar.m147377d();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public mtl m155716f() {
        kvl kvlVar = this.f134958a;
        if (kvlVar != null) {
            kvlVar.m147375b();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public u0m m155717g() {
        kvl kvlVar = this.f134958a;
        if (kvlVar != null) {
            kvlVar.m147380g();
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public IProcessOutput m155718h() {
        kvl kvlVar = this.f134958a;
        if (kvlVar != null) {
            return kvlVar.m147374a();
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public m7m m155719i() {
        kvl kvlVar = this.f134958a;
        if (kvlVar != null) {
            kvlVar.m147378e();
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public String m155720k() {
        kvl kvlVar = this.f134958a;
        if (kvlVar != null) {
            return kvlVar.m147383j();
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public void m155721m(Application application) {
        kvl kvlVar = this.f134958a;
        if (kvlVar != null) {
            kvlVar.m147376c(application);
        }
    }
}
