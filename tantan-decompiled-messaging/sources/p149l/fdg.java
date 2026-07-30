package p149l;

import android.app.Application;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class fdg {

    /* JADX INFO: renamed from: a */
    public int f97036a = 0;

    /* JADX INFO: renamed from: b */
    public Map<Integer, C16810a> f97037b = new HashMap();

    /* JADX INFO: renamed from: l.fdg$a */
    public static class C16810a {

        /* JADX INFO: renamed from: a */
        public final String f97038a;

        /* JADX INFO: renamed from: b */
        public final String f97039b;

        /* JADX INFO: renamed from: c */
        public final int f97040c;

        public C16810a(String str, String str2, int i) {
            this.f97038a = str;
            this.f97039b = str2;
            this.f97040c = i;
        }
    }

    public fdg(boolean z) {
        if (z && vdt.m198092b(2)) {
            m120977d();
        } else {
            m120978e();
        }
    }

    /* JADX INFO: renamed from: a */
    public C16810a m120974a() {
        return this.f97037b.get(Integer.valueOf(this.f97036a));
    }

    /* JADX INFO: renamed from: b */
    public Map<Integer, C16810a> m120975b() {
        return this.f97037b;
    }

    /* JADX INFO: renamed from: c */
    public int m120976c() {
        return this.f97036a;
    }

    /* JADX INFO: renamed from: d */
    public final void m120977d() {
        Application application = ypv.f199497e;
        this.f97037b.put(0, new C16810a(application.getString(R$string.f47336k3), "leaderboard_id_fans_recall", 0));
        this.f97037b.put(1, new C16810a(application.getString(R$string.f46560A3), "fanBaseScore-audience-day-fanbaseuserscore", 1));
        this.f97037b.put(2, new C16810a(application.getString(R$string.f46648E3), "business-audience-month-fanbaseuseractive", 2));
        this.f97037b.put(3, new C16810a(application.getString(((bgv) ypv.m215673l(fld0.f98151f)).m101734n() ? R$string.f47403n4 : R$string.f46823M3), "gift-audience-day-fanbaseusergift", 3));
    }

    /* JADX INFO: renamed from: e */
    public final void m120978e() {
        Application application = ypv.f199497e;
        this.f97037b.put(0, new C16810a(application.getString(R$string.f46560A3), "fanBaseScore-audience-day-fanbaseuserscore", 0));
        this.f97037b.put(1, new C16810a(application.getString(R$string.f46648E3), "business-audience-month-fanbaseuseractive", 1));
        this.f97037b.put(2, new C16810a(application.getString(((bgv) ypv.m215673l(fld0.f98151f)).m101734n() ? R$string.f47403n4 : R$string.f46823M3), "gift-audience-day-fanbaseusergift", 2));
    }

    /* JADX INFO: renamed from: f */
    public void m120979f(int i) {
        this.f97036a = i;
    }
}
