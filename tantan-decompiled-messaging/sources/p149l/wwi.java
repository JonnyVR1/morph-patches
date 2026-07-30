package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveConfig;

/* JADX INFO: loaded from: classes4.dex */
public class wwi {

    /* JADX INFO: renamed from: c */
    public static final wwi f188374c = new wwi();

    /* JADX INFO: renamed from: a */
    public j760<Boolean, String> f188375a;

    /* JADX INFO: renamed from: b */
    public int f188376b;

    public wwi() {
        BLiveConfig bLiveConfigM195799b4 = ypv.m215672k().m195799b4();
        if (bLiveConfigM195799b4 != null) {
            this.f188376b = bLiveConfigM195799b4.followGuide.showNoticeTimes;
        }
    }

    /* JADX INFO: renamed from: a */
    public static wwi m205868a() {
        return f188374c;
    }

    /* JADX INFO: renamed from: b */
    public j760<Boolean, String> m205869b() {
        return this.f188375a;
    }

    /* JADX INFO: renamed from: c */
    public int m205870c() {
        return this.f188376b;
    }

    /* JADX INFO: renamed from: d */
    public void m205871d(j760<Boolean, String> j760Var) {
        this.f188375a = j760Var;
    }

    /* JADX INFO: renamed from: e */
    public void m205872e(int i) {
        this.f188376b = i;
    }
}
