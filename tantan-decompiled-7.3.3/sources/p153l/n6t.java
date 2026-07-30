package p153l;

import com.p051p1.mobile.putong.live.livingroom.util.pref.NDayCountedValue;

/* JADX INFO: loaded from: classes5.dex */
public class n6t {

    /* JADX INFO: renamed from: a */
    public String f140484a;

    /* JADX INFO: renamed from: b */
    public NDayCountedValue f140485b;

    /* JADX INFO: renamed from: l.n6t$a */
    public static final class C18814a {

        /* JADX INFO: renamed from: a */
        public static final n6t f140486a = new n6t();
    }

    public n6t() {
        this.f140484a = "";
    }

    /* JADX INFO: renamed from: a */
    public static n6t m161798a() {
        String strM207631D0 = zrv.f205799a.m207631D0();
        if (!C18814a.f140486a.f140484a.equals(strM207631D0) || C18814a.f140486a.f140485b == null) {
            C18814a.f140486a.f140485b = new NDayCountedValue("live_sider_anim_show_count", false);
            C18814a.f140486a.f140484a = strM207631D0;
        }
        return C18814a.f140486a;
    }

    /* JADX INFO: renamed from: b */
    public int m161799b(int i) {
        return this.f140485b.m77529b(i);
    }

    /* JADX INFO: renamed from: c */
    public int m161800c() {
        return this.f140485b.m77530c();
    }

    /* JADX INFO: renamed from: d */
    public int m161801d() {
        return this.f140485b.m77531d();
    }

    /* JADX INFO: renamed from: e */
    public void m161802e() {
        this.f140485b.m77528a();
    }
}
