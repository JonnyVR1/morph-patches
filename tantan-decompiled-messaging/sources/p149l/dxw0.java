package p149l;

import com.google.android.gms.internal.ads.zzgpl;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class dxw0 {

    /* JADX INFO: renamed from: b */
    public static final dxw0 f88325b = (dxw0) zzgpl.zza(new nyw0() { // from class: l.bxw0
        @Override // p149l.nyw0
        public final Object zza() throws GeneralSecurityException {
            dxw0 dxw0Var = new dxw0();
            dxw0Var.m114037h(new eww0(kww0.class, wxw0.class, new fww0() { // from class: l.cxw0
                @Override // p149l.fww0
                /* JADX INFO: renamed from: a */
                public final fyw0 mo99886a(rnw0 rnw0Var, uow0 uow0Var) {
                    return ((kww0) rnw0Var).m147666a(uow0Var);
                }
            }));
            return dxw0Var;
        }
    });

    /* JADX INFO: renamed from: a */
    public final AtomicReference f88326a = new AtomicReference(new myw0(new gyw0(), null));

    /* JADX INFO: renamed from: d */
    public static dxw0 m114030d() {
        return f88325b;
    }

    /* JADX INFO: renamed from: a */
    public final rnw0 m114031a(fyw0 fyw0Var, uow0 uow0Var) throws GeneralSecurityException {
        return ((myw0) this.f88326a.get()).m157097a(fyw0Var, uow0Var);
    }

    /* JADX INFO: renamed from: b */
    public final rnw0 m114032b(wxw0 wxw0Var, uow0 uow0Var) throws GeneralSecurityException {
        return !((myw0) this.f88326a.get()).m157101i(wxw0Var) ? new kww0(wxw0Var, uow0Var) : m114031a(wxw0Var, uow0Var);
    }

    /* JADX INFO: renamed from: c */
    public final fow0 m114033c(fyw0 fyw0Var) throws GeneralSecurityException {
        return ((myw0) this.f88326a.get()).m157098b(fyw0Var);
    }

    /* JADX INFO: renamed from: e */
    public final fyw0 m114034e(rnw0 rnw0Var, Class cls, uow0 uow0Var) throws GeneralSecurityException {
        return ((myw0) this.f88326a.get()).m157099c(rnw0Var, cls, uow0Var);
    }

    /* JADX INFO: renamed from: f */
    public final fyw0 m114035f(fow0 fow0Var, Class cls) throws GeneralSecurityException {
        return ((myw0) this.f88326a.get()).m157100d(fow0Var, cls);
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m114036g(dww0 dww0Var) throws GeneralSecurityException {
        gyw0 gyw0Var = new gyw0((myw0) this.f88326a.get());
        gyw0Var.m128782a(dww0Var);
        this.f88326a.set(new myw0(gyw0Var, null));
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m114037h(hww0 hww0Var) throws GeneralSecurityException {
        gyw0 gyw0Var = new gyw0((myw0) this.f88326a.get());
        gyw0Var.m128783b(hww0Var);
        this.f88326a.set(new myw0(gyw0Var, null));
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m114038i(hxw0 hxw0Var) throws GeneralSecurityException {
        gyw0 gyw0Var = new gyw0((myw0) this.f88326a.get());
        gyw0Var.m128784c(hxw0Var);
        this.f88326a.set(new myw0(gyw0Var, null));
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m114039j(lxw0 lxw0Var) throws GeneralSecurityException {
        gyw0 gyw0Var = new gyw0((myw0) this.f88326a.get());
        gyw0Var.m128785d(lxw0Var);
        this.f88326a.set(new myw0(gyw0Var, null));
    }

    /* JADX INFO: renamed from: k */
    public final boolean m114040k(fyw0 fyw0Var) {
        return ((myw0) this.f88326a.get()).m157102j(fyw0Var);
    }
}
