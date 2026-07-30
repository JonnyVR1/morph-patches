package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class nt6 {

    /* JADX INFO: renamed from: c */
    public static int f17841c = -1;

    /* JADX INFO: renamed from: d */
    public static int f17842d = 0;

    /* JADX INFO: renamed from: e */
    public static int f17843e = 1;

    /* JADX INFO: renamed from: a */
    public int f17844a;

    /* JADX INFO: renamed from: b */
    public int f17845b;

    public nt6() {
        int i = f17841c;
        this.f17844a = i;
        this.f17845b = i;
    }

    /* JADX INFO: renamed from: a */
    public boolean m20200a() {
        if (this.f17844a == f17841c) {
            this.f17844a = CoreModule.f1534c.f3587Q1.f4106R.m6698O() ? f17843e : f17842d;
        }
        return this.f17844a == f17843e;
    }

    /* JADX INFO: renamed from: b */
    public boolean m20201b() {
        if (this.f17845b == f17841c) {
            User userM21483na = CoreModule.f1534c.f3628e0.m21483na();
            if (userM21483na == null) {
                this.f17845b = xma.m27358O3() ? f17843e : f17842d;
            } else {
                this.f17845b = (userM21483na.age.intValue() <= 22 || xma.m27358O3()) ? f17843e : f17842d;
            }
        }
        return this.f17845b == f17843e;
    }
}
