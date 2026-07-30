package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveBeautyFilterConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveBeautyItem;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.tantanapp.common.network.RunnerProxy;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes4.dex */
public class tyr extends mof0<BLiveBeautyFilterConfig> {

    /* JADX INFO: renamed from: k */
    public static ArrayList<String> f176695k;

    /* JADX INFO: renamed from: l */
    public static String f176696l;

    /* JADX INFO: renamed from: h */
    public jxd0 f176697h;

    /* JADX INFO: renamed from: i */
    public C22507a<uxj0> f176698i;

    /* JADX INFO: renamed from: j */
    public boolean f176699j;

    public tyr() {
        super(new RunnerProxy(), "LiveBeautyConfigApi", new pkq(new vod("LiveBeautyConfigApi", "V3", null), -1, BLiveBeautyFilterConfig.JSON_ADAPTER, new pcj() { // from class: l.jyr
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return tyr.m193600B();
            }
        }), new pcj() { // from class: l.kyr
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return vrv.m202547h(rnl.m182263l(zvr.m221802b("/live-beauty-config?bundleID=com.tantantribe.tribe")), "load-live-beauty-config").map(new qcj() { // from class: l.lyr
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((BLiveEnvelope) obj).data.liveBeautyConfig;
                    }
                });
            }
        }, true);
        this.f176697h = new jxd0(uyr.m198693d(zrv.f205799a.m207631D0()), Boolean.FALSE);
        this.f176698i = C22507a.m222758b();
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ BLiveBeautyFilterConfig m193600B() {
        return null;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m193602D(Throwable th) {
        StringBuilder sb = new StringBuilder("filter download error:");
        sb.append(th == null ? "null" : th.getMessage());
        fhw.m125605a("[live]beauty_filter", sb.toString());
    }

    /* JADX INFO: renamed from: T */
    public static void m193609T(String str) {
        f176696l = str;
    }

    /* JADX INFO: renamed from: U */
    public static void m193610U(String str, String str2) {
        ArrayList<String> arrayList = new ArrayList<>();
        f176695k = arrayList;
        arrayList.add(str);
        f176695k.add(str2);
    }

    /* JADX INFO: renamed from: K */
    public List<BLiveBeautyItem> m193611K() {
        BLiveBeautyFilterConfig bLiveBeautyFilterConfigM159277n = m159277n();
        if (bLiveBeautyFilterConfigM159277n == null) {
            return null;
        }
        return bLiveBeautyFilterConfigM159277n.beautyConfig;
    }

    /* JADX INFO: renamed from: L */
    public final Boolean m193612L(BLiveBeautyFilterConfig bLiveBeautyFilterConfig) {
        boolean z = false;
        boolean z2 = NullChecker.m82486a(bLiveBeautyFilterConfig) && (!vxr.m203876d().m170975F1() ? TextUtils.isEmpty(bLiveBeautyFilterConfig.resourcesUrl) : TextUtils.isEmpty(bLiveBeautyFilterConfig.momoResourcesUrl));
        boolean z3 = NullChecker.m82486a(bLiveBeautyFilterConfig) && !TextUtils.isEmpty(bLiveBeautyFilterConfig.licenseUrl);
        nsh0.m164608j("[live]beauty_filter", "check beauty data result: res " + z2 + ", lic " + z3);
        if (z2 && z3) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: M */
    public void m193613M() {
        if (this.f176699j) {
            return;
        }
        this.f176699j = true;
        m159274k().filter(new qcj() { // from class: l.nyr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f144352a.m193612L((BLiveBeautyFilterConfig) obj);
            }
        }).take(1).observeOn(Schedulers.m222739io()).flatMap(new qcj() { // from class: l.oyr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return coi.m111652m((BLiveBeautyFilterConfig) obj);
            }
        }).observeOn(fo0.m126432a()).doOnNext(new y20() { // from class: l.pyr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154686a.m193615O((uxj0) obj);
            }
        }).doOnError(new y20() { // from class: l.qyr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160180a.m193616P((Throwable) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.ryr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165455a.m193617Q((uxj0) obj);
            }
        }, new y20() { // from class: l.syr
            @Override // p153l.y20
            public final void call(Object obj) {
                tyr.m193602D((Throwable) obj);
            }
        }));
        m159280q();
    }

    /* JADX INFO: renamed from: N */
    public boolean m193614N() {
        return this.f176698i.m222765i();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m193615O(uxj0 uxj0Var) {
        this.f176699j = false;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m193616P(Throwable th) {
        this.f176699j = false;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m193617Q(uxj0 uxj0Var) {
        this.f176698i.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ BLiveBeautyFilterConfig m193618R(uxj0 uxj0Var) {
        return m159277n();
    }

    /* JADX INFO: renamed from: S */
    public C22421c<BLiveBeautyFilterConfig> m193619S() {
        if (!m193614N()) {
            zrv.f205801c.m193613M();
        }
        return this.f176698i.map(new qcj() { // from class: l.myr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f139431a.m193618R((uxj0) obj);
            }
        });
    }
}
