package p153l;

import android.app.Application;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class teg {

    /* JADX INFO: renamed from: a */
    public int f173810a = 0;

    /* JADX INFO: renamed from: b */
    public Map<Integer, C20297a> f173811b = new HashMap();

    /* JADX INFO: renamed from: l.teg$a */
    public static class C20297a {

        /* JADX INFO: renamed from: a */
        public final String f173812a;

        /* JADX INFO: renamed from: b */
        public final String f173813b;

        /* JADX INFO: renamed from: c */
        public final int f173814c;

        public C20297a(String str, String str2, int i) {
            this.f173812a = str;
            this.f173813b = str2;
            this.f173814c = i;
        }
    }

    public teg(boolean z) {
        if (z && wft.m206159b(2)) {
            m190697d();
        } else {
            m190698e();
        }
    }

    /* JADX INFO: renamed from: a */
    public C20297a m190694a() {
        return this.f173811b.get(Integer.valueOf(this.f173810a));
    }

    /* JADX INFO: renamed from: b */
    public Map<Integer, C20297a> m190695b() {
        return this.f173811b;
    }

    /* JADX INFO: renamed from: c */
    public int m190696c() {
        return this.f173810a;
    }

    /* JADX INFO: renamed from: d */
    public final void m190697d() {
        Application application = zrv.f205803e;
        this.f173811b.put(0, new C20297a(application.getString(R$string.f48184k3), "leaderboard_id_fans_recall", 0));
        this.f173811b.put(1, new C20297a(application.getString(R$string.f47408A3), "fanBaseScore-audience-day-fanbaseuserscore", 1));
        this.f173811b.put(2, new C20297a(application.getString(R$string.f47496E3), "business-audience-month-fanbaseuseractive", 2));
        this.f173811b.put(3, new C20297a(application.getString(((civ) zrv.m221194l(htd0.f111524f)).m109970n() ? R$string.f48251n4 : R$string.f47671M3), "gift-audience-day-fanbaseusergift", 3));
    }

    /* JADX INFO: renamed from: e */
    public final void m190698e() {
        Application application = zrv.f205803e;
        this.f173811b.put(0, new C20297a(application.getString(R$string.f47408A3), "fanBaseScore-audience-day-fanbaseuserscore", 0));
        this.f173811b.put(1, new C20297a(application.getString(R$string.f47496E3), "business-audience-month-fanbaseuseractive", 1));
        this.f173811b.put(2, new C20297a(application.getString(((civ) zrv.m221194l(htd0.f111524f)).m109970n() ? R$string.f48251n4 : R$string.f47671M3), "gift-audience-day-fanbaseusergift", 2));
    }

    /* JADX INFO: renamed from: f */
    public void m190699f(int i) {
        this.f173810a = i;
    }
}
