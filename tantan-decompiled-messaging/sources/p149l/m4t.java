package p149l;

import com.p046p1.mobile.putong.live.livingroom.util.pref.NDayCountedValue;

/* JADX INFO: loaded from: classes5.dex */
public class m4t {

    /* JADX INFO: renamed from: a */
    public String f131324a;

    /* JADX INFO: renamed from: b */
    public NDayCountedValue f131325b;

    /* JADX INFO: renamed from: l.m4t$a */
    public static final class C18395a {

        /* JADX INFO: renamed from: a */
        public static final m4t f131326a = new m4t();
    }

    public m4t() {
        this.f131324a = "";
    }

    /* JADX INFO: renamed from: a */
    public static m4t m153098a() {
        String strM199309D0 = ypv.f199493a.m199309D0();
        if (!C18395a.f131326a.f131324a.equals(strM199309D0) || C18395a.f131326a.f131325b == null) {
            C18395a.f131326a.f131325b = new NDayCountedValue("live_sider_anim_show_count", false);
            C18395a.f131326a.f131324a = strM199309D0;
        }
        return C18395a.f131326a;
    }

    /* JADX INFO: renamed from: b */
    public int m153099b(int i) {
        return this.f131325b.m76346b(i);
    }

    /* JADX INFO: renamed from: c */
    public int m153100c() {
        return this.f131325b.m76347c();
    }

    /* JADX INFO: renamed from: d */
    public int m153101d() {
        return this.f131325b.m76348d();
    }

    /* JADX INFO: renamed from: e */
    public void m153102e() {
        this.f131325b.m76345a();
    }
}
