package p149l;

import com.immomo.momo.mulog.exception.MULogIllegalStateException;

/* JADX INFO: loaded from: classes7.dex */
public class hxv {

    /* JADX INFO: renamed from: c */
    private static hxv f109927c;

    /* JADX INFO: renamed from: a */
    private hvl f109928a;

    /* JADX INFO: renamed from: b */
    private hvl f109929b;

    private hxv() {
    }

    /* JADX INFO: renamed from: b */
    private void m133417b() {
        if (!inw.m137175m()) {
            throw new MULogIllegalStateException("mulog has not been init yet");
        }
    }

    /* JADX INFO: renamed from: c */
    private static boolean m133418c(gxv gxvVar) {
        pnw pnwVar;
        return (gxvVar == null || (pnwVar = gxvVar.f104928a) == null || !pnwVar.m170470c()) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public static hxv m133419e() {
        if (f109927c == null) {
            synchronized (hxv.class) {
                try {
                    if (f109927c == null) {
                        f109927c = new hxv();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f109927c;
    }

    /* JADX INFO: renamed from: f */
    private hvl m133420f() {
        if (this.f109928a == null) {
            this.f109928a = new nnw();
        }
        return this.f109928a;
    }

    /* JADX INFO: renamed from: g */
    private hvl m133421g() {
        if (this.f109929b == null) {
            this.f109929b = new snw();
        }
        return this.f109929b;
    }

    /* JADX INFO: renamed from: a */
    public boolean m133422a(String str) {
        m133417b();
        return inw.m137165c().containsKey(str);
    }

    /* JADX INFO: renamed from: d */
    public void m133423d(gxv gxvVar) {
        if (!m133418c(gxvVar)) {
            inw.m137185w("invalid log request: " + gxvVar);
            return;
        }
        m133417b();
        kul kulVar = (kul) inw.m137165c().get(gxvVar.business);
        if (kulVar == null) {
            inw.m137181s(gxvVar.business + " not register");
            return;
        }
        if (!gxvVar.needRealtime) {
            m133420f().mo133190a(gxvVar);
            return;
        }
        if (kulVar.mo129121a() && na20.m158570a() != -1) {
            m133421g().mo133190a(gxvVar);
            return;
        }
        inw.m137181s(gxvVar.business + " --> log failed cause enableRealtime = false");
    }

    /* JADX INFO: renamed from: h */
    public void m133424h() {
        if (inw.m137179q()) {
            m133421g().mo160374c();
        }
        if (inw.m137178p()) {
            m133420f().mo160374c();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m133425i() {
        if (inw.m137179q()) {
            m133421g().mo160373b();
        }
        if (inw.m137178p()) {
            m133420f().mo160373b();
        }
    }
}
