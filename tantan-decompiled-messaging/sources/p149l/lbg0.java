package p149l;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class lbg0 {

    /* JADX INFO: renamed from: a */
    public static final File f127293a = new File("");

    /* JADX INFO: renamed from: a */
    public abstract String mo149223a();

    /* JADX INFO: renamed from: b */
    public final boolean m149224b(slg0 slg0Var) {
        if (mo149228i().equals(slg0Var.f165191c) && !mo149228i().equals("") && !mo149225f().equals(f127293a)) {
            if (mo149227h().equals(slg0Var.f165208t)) {
                return true;
            }
            if (!mo149225f().equals(slg0Var.f165209u)) {
                return false;
            }
            String strMo149223a = mo149223a();
            String str = slg0Var.f165207s.f90099a;
            if (str != null && strMo149223a != null && str.equals(strMo149223a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract File mo149225f();

    /* JADX INFO: renamed from: g */
    public abstract int mo149226g();

    /* JADX INFO: renamed from: h */
    public abstract File mo149227h();

    /* JADX INFO: renamed from: i */
    public abstract String mo149228i();
}
