package p002l;

import com.p1.mobile.putong.live.base.data.BLiveConfig;
import l.j760;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wwi {

    /* JADX INFO: renamed from: c */
    public static final wwi f22021c = new wwi();

    /* JADX INFO: renamed from: a */
    public j760<Boolean, String> f22022a;

    /* JADX INFO: renamed from: b */
    public int f22023b;

    public wwi() {
        BLiveConfig bLiveConfigB4 = ypv.k().b4();
        if (bLiveConfigB4 != null) {
            this.f22023b = bLiveConfigB4.followGuide.showNoticeTimes;
        }
    }

    /* JADX INFO: renamed from: a */
    public static wwi m25538a() {
        return f22021c;
    }

    /* JADX INFO: renamed from: b */
    public j760<Boolean, String> m25539b() {
        return this.f22022a;
    }

    /* JADX INFO: renamed from: c */
    public int m25540c() {
        return this.f22023b;
    }

    /* JADX INFO: renamed from: d */
    public void m25541d(j760<Boolean, String> j760Var) {
        this.f22022a = j760Var;
    }

    /* JADX INFO: renamed from: e */
    public void m25542e(int i) {
        this.f22023b = i;
    }
}
