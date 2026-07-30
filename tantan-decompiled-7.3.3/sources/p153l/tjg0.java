package p153l;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class tjg0 {

    /* JADX INFO: renamed from: a */
    public static final File f174587a = new File("");

    /* JADX INFO: renamed from: a */
    public abstract String mo100392a();

    /* JADX INFO: renamed from: b */
    public final boolean m191442b(aug0 aug0Var) {
        if (mo100396i().equals(aug0Var.f73494c) && !mo100396i().equals("") && !mo100393f().equals(f174587a)) {
            if (mo100395h().equals(aug0Var.f73511t)) {
                return true;
            }
            if (!mo100393f().equals(aug0Var.f73512u)) {
                return false;
            }
            String strMo100392a = mo100392a();
            String str = aug0Var.f73510s.f136848a;
            if (str != null && strMo100392a != null && str.equals(strMo100392a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract File mo100393f();

    /* JADX INFO: renamed from: g */
    public abstract int mo100394g();

    /* JADX INFO: renamed from: h */
    public abstract File mo100395h();

    /* JADX INFO: renamed from: i */
    public abstract String mo100396i();
}
