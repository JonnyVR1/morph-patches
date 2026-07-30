package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveBeautyFilterConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveBeautyItem;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.tantanapp.common.network.RunnerProxy;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes4.dex */
public class swr extends fgf0<BLiveBeautyFilterConfig> {

    /* JADX INFO: renamed from: k */
    public static ArrayList<String> f166714k;

    /* JADX INFO: renamed from: l */
    public static String f166715l;

    /* JADX INFO: renamed from: h */
    public hpd0 f166716h;

    /* JADX INFO: renamed from: i */
    public C22392a<roj0> f166717i;

    /* JADX INFO: renamed from: j */
    public boolean f166718j;

    public swr() {
        super(new RunnerProxy(), "LiveBeautyConfigApi", new qiq(new qnd("LiveBeautyConfigApi", "V3", null), -1, BLiveBeautyFilterConfig.JSON_ADAPTER, new v9j() { // from class: l.iwr
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return swr.m186335B();
            }
        }), new v9j() { // from class: l.jwr
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return upv.m194920h(cll.m107499l(ytr.m216073b("/live-beauty-config?bundleID=com.tantantribe.tribe")), "load-live-beauty-config").map(new w9j() { // from class: l.kwr
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((BLiveEnvelope) obj).data.liveBeautyConfig;
                    }
                });
            }
        }, true);
        this.f166716h = new hpd0(twr.m190887d(ypv.f199493a.m199309D0()), Boolean.FALSE);
        this.f166717i = C22392a.m221512b();
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ BLiveBeautyFilterConfig m186335B() {
        return null;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m186337D(Throwable th) {
        StringBuilder sb = new StringBuilder("filter download error:");
        sb.append(th == null ? "null" : th.getMessage());
        hfw.m130790a("[live]beauty_filter", sb.toString());
    }

    /* JADX INFO: renamed from: T */
    public static void m186344T(String str) {
        f166715l = str;
    }

    /* JADX INFO: renamed from: U */
    public static void m186345U(String str, String str2) {
        ArrayList<String> arrayList = new ArrayList<>();
        f166714k = arrayList;
        arrayList.add(str);
        f166714k.add(str2);
    }

    /* JADX INFO: renamed from: K */
    public List<BLiveBeautyItem> m186346K() {
        BLiveBeautyFilterConfig bLiveBeautyFilterConfigM121233n = m121233n();
        if (bLiveBeautyFilterConfigM121233n == null) {
            return null;
        }
        return bLiveBeautyFilterConfigM121233n.beautyConfig;
    }

    /* JADX INFO: renamed from: L */
    public final Boolean m186347L(BLiveBeautyFilterConfig bLiveBeautyFilterConfig) {
        boolean z = false;
        boolean z2 = NullChecker.m81303a(bLiveBeautyFilterConfig) && (!uvr.m196087d().m162668F1() ? TextUtils.isEmpty(bLiveBeautyFilterConfig.resourcesUrl) : TextUtils.isEmpty(bLiveBeautyFilterConfig.momoResourcesUrl));
        boolean z3 = NullChecker.m81303a(bLiveBeautyFilterConfig) && !TextUtils.isEmpty(bLiveBeautyFilterConfig.licenseUrl);
        gkh0.m126627j("[live]beauty_filter", "check beauty data result: res " + z2 + ", lic " + z3);
        if (z2 && z3) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: M */
    public void m186348M() {
        if (this.f166718j) {
            return;
        }
        this.f166718j = true;
        m121230k().filter(new w9j() { // from class: l.mwr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f136083a.m186347L((BLiveBeautyFilterConfig) obj);
            }
        }).take(1).observeOn(Schedulers.m221493io()).flatMap(new w9j() { // from class: l.nwr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return gli.m126763m((BLiveBeautyFilterConfig) obj);
            }
        }).observeOn(jo0.m142408a()).doOnNext(new e30() { // from class: l.owr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146079a.m186350O((roj0) obj);
            }
        }).doOnError(new e30() { // from class: l.pwr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151593a.m186351P((Throwable) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.qwr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156758a.m186352Q((roj0) obj);
            }
        }, new e30() { // from class: l.rwr
            @Override // p149l.e30
            public final void call(Object obj) {
                swr.m186337D((Throwable) obj);
            }
        }));
        m121236q();
    }

    /* JADX INFO: renamed from: N */
    public boolean m186349N() {
        return this.f166717i.m221519i();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m186350O(roj0 roj0Var) {
        this.f166718j = false;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m186351P(Throwable th) {
        this.f166718j = false;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m186352Q(roj0 roj0Var) {
        this.f166717i.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ BLiveBeautyFilterConfig m186353R(roj0 roj0Var) {
        return m121233n();
    }

    /* JADX INFO: renamed from: S */
    public C22306c<BLiveBeautyFilterConfig> m186354S() {
        if (!m186349N()) {
            ypv.f199495c.m186348M();
        }
        return this.f166717i.map(new w9j() { // from class: l.lwr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f130297a.m186353R((roj0) obj);
            }
        });
    }
}
