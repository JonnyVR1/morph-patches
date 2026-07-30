package p153l;

import android.app.Application;
import com.cosmos.mdlog.MDLog;
import com.immomo.components.interfaces.IProcessOutput;

/* JADX INFO: loaded from: classes7.dex */
public class lrw {

    /* JADX INFO: renamed from: b */
    private static final String f133372b = "lrw";

    /* JADX INFO: renamed from: c */
    private static volatile lrw f133373c;

    /* JADX INFO: renamed from: a */
    private cyl f133374a;

    private lrw() {
        m155654l();
    }

    /* JADX INFO: renamed from: j */
    public static synchronized lrw m155653j() {
        try {
            if (f133373c == null) {
                synchronized (lrw.class) {
                    try {
                        if (f133373c == null) {
                            f133373c = new lrw();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f133373c;
    }

    /* JADX INFO: renamed from: l */
    private void m155654l() {
        if (this.f133374a == null) {
            try {
                this.f133374a = (cyl) Class.forName("com.mm.MagicEffectRegisterProvider").newInstance();
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                MDLog.printErrStackTrace(f133372b, e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m155655a() {
        return this.f133374a != null;
    }

    /* JADX INFO: renamed from: b */
    public opl m155656b() {
        cyl cylVar = this.f133374a;
        if (cylVar != null) {
            cylVar.m113198f();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public tpl m155657c() {
        cyl cylVar = this.f133374a;
        if (cylVar != null) {
            cylVar.m113201i();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public upl m155658d() {
        cyl cylVar = this.f133374a;
        if (cylVar != null) {
            cylVar.m113200h();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public p3m m155659e() {
        cyl cylVar = this.f133374a;
        if (cylVar != null) {
            cylVar.m113196d();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public awl m155660f() {
        cyl cylVar = this.f133374a;
        if (cylVar != null) {
            cylVar.m113194b();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public o3m m155661g() {
        cyl cylVar = this.f133374a;
        if (cylVar != null) {
            cylVar.m113199g();
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public IProcessOutput m155662h() {
        cyl cylVar = this.f133374a;
        if (cylVar != null) {
            return cylVar.m113193a();
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public cam m155663i() {
        cyl cylVar = this.f133374a;
        if (cylVar != null) {
            cylVar.m113197e();
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public String m155664k() {
        cyl cylVar = this.f133374a;
        if (cylVar != null) {
            return cylVar.m113202j();
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public void m155665m(Application application) {
        cyl cylVar = this.f133374a;
        if (cylVar != null) {
            cylVar.m113195c(application);
        }
    }
}
