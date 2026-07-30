package p153l;

import com.immomo.momo.mulog.exception.MULogIllegalStateException;

/* JADX INFO: loaded from: classes7.dex */
public class gzv {

    /* JADX INFO: renamed from: c */
    private static gzv f107240c;

    /* JADX INFO: renamed from: a */
    private zxl f107241a;

    /* JADX INFO: renamed from: b */
    private zxl f107242b;

    private gzv() {
    }

    /* JADX INFO: renamed from: b */
    private void m133123b() {
        if (!gqw.m131489m()) {
            throw new MULogIllegalStateException("mulog has not been init yet");
        }
    }

    /* JADX INFO: renamed from: c */
    private static boolean m133124c(fzv fzvVar) {
        nqw nqwVar;
        return (fzvVar == null || (nqwVar = fzvVar.f101550a) == null || !nqwVar.m164357c()) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public static gzv m133125e() {
        if (f107240c == null) {
            synchronized (gzv.class) {
                try {
                    if (f107240c == null) {
                        f107240c = new gzv();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f107240c;
    }

    /* JADX INFO: renamed from: f */
    private zxl m133126f() {
        if (this.f107241a == null) {
            this.f107241a = new lqw();
        }
        return this.f107241a;
    }

    /* JADX INFO: renamed from: g */
    private zxl m133127g() {
        if (this.f107242b == null) {
            this.f107242b = new qqw();
        }
        return this.f107242b;
    }

    /* JADX INFO: renamed from: a */
    public boolean m133128a(String str) {
        m133123b();
        return gqw.m131479c().containsKey(str);
    }

    /* JADX INFO: renamed from: d */
    public void m133129d(fzv fzvVar) {
        if (!m133124c(fzvVar)) {
            gqw.m131499w("invalid log request: " + fzvVar);
            return;
        }
        m133123b();
        ywl ywlVar = (ywl) gqw.m131479c().get(fzvVar.business);
        if (ywlVar == null) {
            gqw.m131495s(fzvVar.business + " not register");
            return;
        }
        if (!fzvVar.needRealtime) {
            m133126f().mo155510b(fzvVar);
            return;
        }
        if (ywlVar.mo175942a() && ui20.m196133a() != -1) {
            m133127g().mo155510b(fzvVar);
            return;
        }
        gqw.m131495s(fzvVar.business + " --> log failed cause enableRealtime = false");
    }

    /* JADX INFO: renamed from: h */
    public void m133130h() {
        if (gqw.m131493q()) {
            m133127g().mo105847c();
        }
        if (gqw.m131492p()) {
            m133126f().mo105847c();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m133131i() {
        if (gqw.m131493q()) {
            m133127g().mo105846a();
        }
        if (gqw.m131492p()) {
            m133126f().mo105846a();
        }
    }
}
