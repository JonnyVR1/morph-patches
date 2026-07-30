package p002l;

import android.app.Application;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import java.util.HashMap;
import java.util.Map;
import l.bgv;
import l.fld0;
import l.vdt;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fdg {

    /* JADX INFO: renamed from: a */
    public int f10298a = 0;

    /* JADX INFO: renamed from: b */
    public Map<Integer, C0564a> f10299b = new HashMap();

    /* JADX INFO: renamed from: l.fdg$a */
    public static class C0564a {

        /* JADX INFO: renamed from: a */
        public final String f10300a;

        /* JADX INFO: renamed from: b */
        public final String f10301b;

        /* JADX INFO: renamed from: c */
        public final int f10302c;

        public C0564a(String str, String str2, int i) {
            this.f10300a = str;
            this.f10301b = str2;
            this.f10302c = i;
        }
    }

    public fdg(boolean z) {
        if (z && vdt.b(2)) {
            m13129d();
        } else {
            m13130e();
        }
    }

    /* JADX INFO: renamed from: a */
    public C0564a m13126a() {
        return this.f10299b.get(Integer.valueOf(this.f10298a));
    }

    /* JADX INFO: renamed from: b */
    public Map<Integer, C0564a> m13127b() {
        return this.f10299b;
    }

    /* JADX INFO: renamed from: c */
    public int m13128c() {
        return this.f10298a;
    }

    /* JADX INFO: renamed from: d */
    public final void m13129d() {
        Application application = ypv.e;
        this.f10299b.put(0, new C0564a(application.getString(R$string.f3378k3), "leaderboard_id_fans_recall", 0));
        this.f10299b.put(1, new C0564a(application.getString(R$string.f2602A3), "fanBaseScore-audience-day-fanbaseuserscore", 1));
        this.f10299b.put(2, new C0564a(application.getString(R$string.f2690E3), "business-audience-month-fanbaseuseractive", 2));
        this.f10299b.put(3, new C0564a(application.getString(((bgv) ypv.l(fld0.f)).n() ? R$string.f3445n4 : R$string.f2865M3), "gift-audience-day-fanbaseusergift", 3));
    }

    /* JADX INFO: renamed from: e */
    public final void m13130e() {
        Application application = ypv.e;
        this.f10299b.put(0, new C0564a(application.getString(R$string.f2602A3), "fanBaseScore-audience-day-fanbaseuserscore", 0));
        this.f10299b.put(1, new C0564a(application.getString(R$string.f2690E3), "business-audience-month-fanbaseuseractive", 1));
        this.f10299b.put(2, new C0564a(application.getString(((bgv) ypv.l(fld0.f)).n() ? R$string.f3445n4 : R$string.f2865M3), "gift-audience-day-fanbaseusergift", 2));
    }

    /* JADX INFO: renamed from: f */
    public void m13131f(int i) {
        this.f10298a = i;
    }
}
