package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.live.base.data.BLiveBeautyFilterConfig;
import com.p1.mobile.putong.live.base.data.BLiveBeautyItem;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.tantanapp.common.network.RunnerProxy;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.cll;
import l.e30;
import l.ffw;
import l.fgf0;
import l.gkh0;
import l.hfw;
import l.hpd0;
import l.jo0;
import l.qiq;
import l.qnd;
import l.roj0;
import l.twr;
import l.upv;
import l.uvr;
import l.v9j;
import l.w9j;
import l.ypv;
import l.ytr;
import rx.c;
import rx.schedulers.Schedulers;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class swr extends fgf0<BLiveBeautyFilterConfig> {

    /* JADX INFO: renamed from: k */
    public static ArrayList<String> f19311k;

    /* JADX INFO: renamed from: l */
    public static String f19312l;

    /* JADX INFO: renamed from: h */
    public hpd0 f19313h;

    /* JADX INFO: renamed from: i */
    public a<roj0> f19314i;

    /* JADX INFO: renamed from: j */
    public boolean f19315j;

    public swr() {
        super(new RunnerProxy(), "LiveBeautyConfigApi", new qiq(new qnd("LiveBeautyConfigApi", "V3", (String) null), -1, BLiveBeautyFilterConfig.JSON_ADAPTER, new v9j() { // from class: l.iwr
            public final Object call() {
                return swr.m22722B();
            }
        }), new v9j() { // from class: l.jwr
            public final Object call() {
                return upv.h(cll.l(ytr.b("/live-beauty-config?bundleID=com.tantantribe.tribe")), "load-live-beauty-config").map(new w9j() { // from class: l.kwr
                    public final Object call(Object obj) {
                        return ((BLiveEnvelope) obj).data.liveBeautyConfig;
                    }
                });
            }
        }, true);
        this.f19313h = new hpd0(twr.d(ypv.a.D0()), Boolean.FALSE);
        this.f19314i = a.b();
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ BLiveBeautyFilterConfig m22722B() {
        return null;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m22724D(Throwable th) {
        StringBuilder sb = new StringBuilder("filter download error:");
        sb.append(th == null ? "null" : th.getMessage());
        hfw.a("[live]beauty_filter", sb.toString());
    }

    /* JADX INFO: renamed from: T */
    public static void m22731T(String str) {
        f19312l = str;
    }

    /* JADX INFO: renamed from: U */
    public static void m22732U(String str, String str2) {
        ArrayList<String> arrayList = new ArrayList<>();
        f19311k = arrayList;
        arrayList.add(str);
        f19311k.add(str2);
    }

    /* JADX INFO: renamed from: K */
    public List<BLiveBeautyItem> m22733K() {
        BLiveBeautyFilterConfig bLiveBeautyFilterConfig = (BLiveBeautyFilterConfig) n();
        if (bLiveBeautyFilterConfig == null) {
            return null;
        }
        return bLiveBeautyFilterConfig.beautyConfig;
    }

    /* JADX INFO: renamed from: L */
    public final Boolean m22734L(BLiveBeautyFilterConfig bLiveBeautyFilterConfig) {
        boolean z = false;
        boolean z2 = NullChecker.a(bLiveBeautyFilterConfig) && (!uvr.d().F1() ? TextUtils.isEmpty(bLiveBeautyFilterConfig.resourcesUrl) : TextUtils.isEmpty(bLiveBeautyFilterConfig.momoResourcesUrl));
        boolean z3 = NullChecker.a(bLiveBeautyFilterConfig) && !TextUtils.isEmpty(bLiveBeautyFilterConfig.licenseUrl);
        gkh0.j("[live]beauty_filter", "check beauty data result: res " + z2 + ", lic " + z3);
        if (z2 && z3) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: M */
    public void m22735M() {
        if (this.f19315j) {
            return;
        }
        this.f19315j = true;
        k().filter(new w9j() { // from class: l.mwr
            public final Object call(Object obj) {
                return this.f15729a.m22734L((BLiveBeautyFilterConfig) obj);
            }
        }).take(1).observeOn(Schedulers.io()).flatMap(new w9j() { // from class: l.nwr
            public final Object call(Object obj) {
                return gli.m13890m((BLiveBeautyFilterConfig) obj);
            }
        }).observeOn(jo0.a()).doOnNext(new e30() { // from class: l.owr
            public final void call(Object obj) {
                this.f16815a.m22737O((roj0) obj);
            }
        }).doOnError(new e30() { // from class: l.pwr
            public final void call(Object obj) {
                this.f17709a.m22738P((Throwable) obj);
            }
        }).subscribe(ffw.e(new e30() { // from class: l.qwr
            public final void call(Object obj) {
                this.f18260a.m22739Q((roj0) obj);
            }
        }, new e30() { // from class: l.rwr
            public final void call(Object obj) {
                swr.m22724D((Throwable) obj);
            }
        }));
        z();
    }

    /* JADX INFO: renamed from: N */
    public boolean m22736N() {
        return this.f19314i.i();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m22737O(roj0 roj0Var) {
        this.f19315j = false;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m22738P(Throwable th) {
        this.f19315j = false;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m22739Q(roj0 roj0Var) {
        this.f19314i.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ BLiveBeautyFilterConfig m22740R(roj0 roj0Var) {
        return (BLiveBeautyFilterConfig) n();
    }

    /* JADX INFO: renamed from: S */
    public c<BLiveBeautyFilterConfig> m22741S() {
        if (!m22736N()) {
            ypv.c.m22735M();
        }
        return this.f19314i.map(new w9j() { // from class: l.lwr
            public final Object call(Object obj) {
                return this.f15099a.m22740R((roj0) obj);
            }
        });
    }
}
