package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes9.dex */
public class nt6 {

    /* JADX INFO: renamed from: c */
    public static int f140438c = -1;

    /* JADX INFO: renamed from: d */
    public static int f140439d = 0;

    /* JADX INFO: renamed from: e */
    public static int f140440e = 1;

    /* JADX INFO: renamed from: a */
    public int f140441a;

    /* JADX INFO: renamed from: b */
    public int f140442b;

    public nt6() {
        int i = f140438c;
        this.f140441a = i;
        this.f140442b = i;
    }

    /* JADX INFO: renamed from: a */
    public boolean m161357a() {
        if (this.f140441a == f140438c) {
            this.f140441a = CoreModule.f17545c.f19598Q1.f20117R.m34761O() ? f140440e : f140439d;
        }
        return this.f140441a == f140440e;
    }

    /* JADX INFO: renamed from: b */
    public boolean m161358b() {
        if (this.f140442b == f140438c) {
            User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
            if (userM169520na == null) {
                this.f140442b = xma.m210050O3() ? f140440e : f140439d;
            } else {
                this.f140442b = (userM169520na.age.intValue() <= 22 || xma.m210050O3()) ? f140440e : f140439d;
            }
        }
        return this.f140442b == f140440e;
    }
}
