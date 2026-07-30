package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveConfig;

/* JADX INFO: loaded from: classes4.dex */
public class szi {

    /* JADX INFO: renamed from: c */
    public static final szi f171391c = new szi();

    /* JADX INFO: renamed from: a */
    public pf60<Boolean, String> f171392a;

    /* JADX INFO: renamed from: b */
    public int f171393b;

    public szi() {
        BLiveConfig bLiveConfigM203586b4 = zrv.m221193k().m203586b4();
        if (bLiveConfigM203586b4 != null) {
            this.f171393b = bLiveConfigM203586b4.followGuide.showNoticeTimes;
        }
    }

    /* JADX INFO: renamed from: a */
    public static szi m188648a() {
        return f171391c;
    }

    /* JADX INFO: renamed from: b */
    public pf60<Boolean, String> m188649b() {
        return this.f171392a;
    }

    /* JADX INFO: renamed from: c */
    public int m188650c() {
        return this.f171393b;
    }

    /* JADX INFO: renamed from: d */
    public void m188651d(pf60<Boolean, String> pf60Var) {
        this.f171392a = pf60Var;
    }

    /* JADX INFO: renamed from: e */
    public void m188652e(int i) {
        this.f171393b = i;
    }
}
