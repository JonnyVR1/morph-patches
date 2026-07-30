package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes9.dex */
public class qu6 {

    /* JADX INFO: renamed from: c */
    public static int f159523c = -1;

    /* JADX INFO: renamed from: d */
    public static int f159524d = 0;

    /* JADX INFO: renamed from: e */
    public static int f159525e = 1;

    /* JADX INFO: renamed from: a */
    public int f159526a;

    /* JADX INFO: renamed from: b */
    public int f159527b;

    public qu6() {
        int i = f159523c;
        this.f159526a = i;
        this.f159527b = i;
    }

    /* JADX INFO: renamed from: a */
    public boolean m178134a() {
        if (this.f159526a == f159523c) {
            this.f159526a = CoreModule.f18264c.f20340Q1.f20859R.m35764O() ? f159525e : f159524d;
        }
        return this.f159526a == f159525e;
    }

    /* JADX INFO: renamed from: b */
    public boolean m178135b() {
        if (this.f159527b == f159523c) {
            User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
            if (userM116593na == null) {
                this.f159527b = joa.m146364P3() ? f159525e : f159524d;
            } else {
                this.f159527b = (userM116593na.age.intValue() <= 22 || joa.m146364P3()) ? f159525e : f159524d;
            }
        }
        return this.f159527b == f159525e;
    }
}
