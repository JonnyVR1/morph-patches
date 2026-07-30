package p149l;

import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.Dimensions;
import com.p046p1.mobile.putong.core.data.IdealTypes;
import com.p046p1.mobile.putong.core.data.PrivateCustomCard;
import com.p046p1.mobile.putong.core.data.PrivateCustomResult;
import com.p046p1.mobile.putong.core.data.PrivateCustomSetting;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes9.dex */
public class mma extends ax6 {

    /* JADX INFO: renamed from: R */
    public final zpd0 f134581R;

    /* JADX INFO: renamed from: S */
    public final hpd0 f134582S;

    /* JADX INFO: renamed from: T */
    public final tpd0 f134583T;

    /* JADX INFO: renamed from: U */
    public final zpd0 f134584U;

    /* JADX INFO: renamed from: V */
    public final zpd0 f134585V;

    /* JADX INFO: renamed from: W */
    public boolean f134586W;

    /* JADX INFO: renamed from: X */
    public final C22392a<PrivateCustomSetting> f134587X;

    /* JADX INFO: renamed from: Y */
    public final C22393b<Boolean> f134588Y;

    /* JADX INFO: renamed from: Z */
    public final C22392a<Pair<List<C18499a>, Boolean>> f134589Z;

    /* JADX INFO: renamed from: a0 */
    public final C22393b<Throwable> f134590a0;

    /* JADX INFO: renamed from: b0 */
    public final HashSet<String> f134591b0;

    /* JADX INFO: renamed from: c0 */
    public final C22393b<roj0> f134592c0;

    /* JADX INFO: renamed from: d0 */
    public PrivateCustomSetting f134593d0;

    /* JADX INFO: renamed from: l.mma$a */
    public static class C18499a {

        /* JADX INFO: renamed from: a */
        public User f134594a;

        /* JADX INFO: renamed from: b */
        public ArrayList<String> f134595b;
    }

    public mma(C4732c c4732c) {
        super(c4732c);
        this.f134586W = false;
        this.f134587X = C22392a.m221512b();
        this.f134588Y = C22393b.m221521b();
        this.f134589Z = C22392a.m221512b();
        this.f134590a0 = C22393b.m221521b();
        this.f134591b0 = new HashSet<>();
        this.f134592c0 = C22393b.m221521b();
        this.f134581R = new zpd0("private_custom_tab_show_red_dot_time_" + CoreModule.m29931H().userId(), 0L);
        this.f134582S = new hpd0("private_custom_guide_dialog_shown_" + CoreModule.m29931H().userId(), Boolean.FALSE);
        this.f134583T = new tpd0("private_custom_tab_guide_tips_shown_count_" + CoreModule.m29931H().userId(), 0);
        this.f134584U = new zpd0("private_custom_tab_first_auto_enter_custom_time_" + CoreModule.m29931H().userId(), 0L);
        this.f134585V = new zpd0("has_private_custom_privilege_auto_enter_custom_time_" + CoreModule.m29931H().userId(), 0L);
    }

    /* JADX INFO: renamed from: A3 */
    public final int m155326A3() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("private_custom_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return 3;
            }
            return new JSONObject(strM79302F).optInt("home_tab_bubble_times", 3);
        } catch (Exception unused) {
            return 3;
        }
    }

    /* JADX INFO: renamed from: B3 */
    public C22393b<roj0> m155327B3() {
        return this.f134592c0;
    }

    /* JADX INFO: renamed from: C3 */
    public void m155328C3() {
        this.f134583T.put(Integer.valueOf(this.f134583T.get().intValue() + 1));
    }

    /* JADX INFO: renamed from: D3 */
    public final boolean m155329D3() {
        return this.f134582S.get().booleanValue();
    }

    /* JADX INFO: renamed from: E3 */
    public boolean m155330E3() {
        return this.f134586W;
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ PrivateCustomSetting m155331F3(Envelope envelope) {
        PrivateCustomSetting privateCustomSetting = ((CoreData) envelope.getModuleData(CoreData.class)).privateCustomSetting;
        boolean zM81303a = NullChecker.m81303a(privateCustomSetting);
        C22392a<PrivateCustomSetting> c22392a = this.f134587X;
        if (zM81303a) {
            c22392a.m132487l(privateCustomSetting);
            return privateCustomSetting;
        }
        if (c22392a.m221515e() == null) {
            this.f134587X.m132487l(PrivateCustomSetting.new_());
        }
        return privateCustomSetting;
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ void m155332G3(Throwable th) {
        if (this.f134587X.m221515e() == null) {
            this.f134587X.m132487l(PrivateCustomSetting.new_());
        }
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ C22306c m155333H3() {
        return ia20.m135117a(new v9j() { // from class: l.ema
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/private-custom-setting")).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.fma
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f98280a.m155331F3((Envelope) obj);
            }
        }).doOnError(new e30() { // from class: l.gma
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103433a.m155332G3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ void m155334I3(HashMap map, List list, User user) {
        if (this.f134591b0.contains(user.f56011id)) {
            return;
        }
        this.f134591b0.add(user.f56011id);
        C18499a c18499a = new C18499a();
        c18499a.f134594a = user;
        c18499a.f134595b = (ArrayList) map.get(user.f56011id);
        list.add(c18499a);
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ roj0 m155335J3(Envelope envelope) {
        int size;
        final ArrayList arrayList = new ArrayList();
        this.f134591b0.clear();
        final HashMap map = new HashMap();
        PrivateCustomResult privateCustomResult = ((CoreData) envelope.getModuleData(CoreData.class)).privateCustomResult;
        if (NullChecker.m81303a(privateCustomResult)) {
            vwb.m200354z(privateCustomResult.cards, new e30() { // from class: l.ama
                @Override // p149l.e30
                public final void call(Object obj) {
                    PrivateCustomCard privateCustomCard = (PrivateCustomCard) obj;
                    map.put(privateCustomCard.userId, new ArrayList(privateCustomCard.tags));
                }
            });
            size = privateCustomResult.mock ? privateCustomResult.cards.size() : privateCustomResult.total;
        } else {
            size = -1;
        }
        vwb.m200354z(((CommonData) envelope.getModuleData(CommonData.class)).users, new e30() { // from class: l.bma
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76252a.m155334I3(map, arrayList, (User) obj);
            }
        });
        if (ConnectivityReceiver.m81286i()) {
            vwb.m200354z(vwb.m200291E(((CommonData) envelope.getModuleData(CommonData.class)).users), new e30() { // from class: l.cma
                @Override // p149l.e30
                public final void call(Object obj) {
                    qib0.f154691G.m102379z0(((User) obj).m60124fp().profileMiddle());
                }
            });
        }
        if (vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            C22392a<Pair<List<C18499a>, Boolean>> c22392a = this.f134589Z;
            if (size > 0) {
                c22392a.m132487l(new Pair<>(arrayList, Boolean.TRUE));
            } else {
                c22392a.m132487l(new Pair<>(arrayList, Boolean.FALSE));
            }
        } else {
            this.f134589Z.m132487l(new Pair<>(arrayList, Boolean.FALSE));
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ C22306c m155336K3() {
        return new la20(new v9j() { // from class: l.ima
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/private-custom-result")).m185883b();
            }
        }).map(new w9j() { // from class: l.jma
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f118622a.m155337L3((Envelope) obj);
            }
        }).compose(mkd0.m154951C()).doOnError(new e30() { // from class: l.kma
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123781a.m155338M3((Throwable) obj);
            }
        }).map(new w9j() { // from class: l.lma
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f128777a.m155335J3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ Envelope m155337L3(Envelope envelope) {
        this.f72126Q.m31493x3(envelope, null, true);
        return envelope;
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m155338M3(Throwable th) {
        this.f134590a0.m132487l(th);
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ Envelope m155339N3(Envelope envelope) {
        m155356s3();
        this.f134588Y.m132487l(Boolean.TRUE);
        return envelope;
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ C22306c m155340O3(List list, List list2) {
        final JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Dimensions dimensions = (Dimensions) it.next();
                jSONObject2.put(dimensions.key, dimensions.value);
            }
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                jSONArray.put((String) it2.next());
            }
            jSONObject.put("idealTypes", jSONArray);
            jSONObject.put("dimension", jSONObject2);
        } catch (JSONException unused) {
        }
        return ia20.m135117a(new v9j() { // from class: l.yla
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/private-custom-setting")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).map(new w9j() { // from class: l.zla
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f203610a.m155339N3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P3 */
    public C22306c<PrivateCustomSetting> m155341P3() {
        return this.f72126Q.scheduled("loadCustomSetting", 0, new v9j() { // from class: l.xla
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f193401a.m155333H3();
            }
        });
    }

    /* JADX INFO: renamed from: Q3 */
    public C22306c<roj0> m155342Q3() {
        return this.f72126Q.scheduled("loadCustomizedResultDatas", 0, new v9j() { // from class: l.dma
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f86910a.m155336K3();
            }
        });
    }

    /* JADX INFO: renamed from: R3 */
    public boolean m155343R3() {
        return this.f134584U.get().longValue() == 0;
    }

    /* JADX INFO: renamed from: S3 */
    public boolean m155344S3() {
        return this.f134585V.get().longValue() == 0;
    }

    /* JADX INFO: renamed from: T3 */
    public boolean m155345T3() {
        return (m155355r3() || mqi0.m155929D(this.f134581R.get().longValue()) || !mqi0.m155955z(12, 0, 0)) ? false : true;
    }

    /* JADX INFO: renamed from: U3 */
    public void m155346U3() {
        this.f134592c0.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: V3 */
    public C22306c<Envelope> m155347V3(final List<String> list, final List<Dimensions> list2) {
        return this.f72126Q.scheduled("privateCustom/setting", -1, new v9j() { // from class: l.hma
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f108404a.m155340O3(list2, list);
            }
        });
    }

    /* JADX INFO: renamed from: W3 */
    public void m155348W3(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Pair<List<C18499a>, Boolean> pairM221515e = this.f134589Z.m221515e();
        if (NullChecker.m81303a(pairM221515e)) {
            int size = ((List) pairM221515e.first).size();
            Iterator it = ((List) pairM221515e.first).iterator();
            while (it.hasNext()) {
                if (str.equals(((C18499a) it.next()).f134594a.f56011id)) {
                    it.remove();
                    this.f134589Z.m132487l(new Pair<>((List) pairM221515e.first, Boolean.valueOf(size + (-1) == 0)));
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: X3 */
    public void m155349X3() {
        this.f134582S.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: Y3 */
    public void m155350Y3() {
        this.f134584U.put(Long.valueOf(mqi0.m155944o()));
    }

    /* JADX INFO: renamed from: Z3 */
    public void m155351Z3() {
        this.f134585V.put(Long.valueOf(mqi0.m155944o()));
    }

    /* JADX INFO: renamed from: a4 */
    public void m155352a4() {
        this.f134581R.put(Long.valueOf(mqi0.m155944o()));
    }

    /* JADX INFO: renamed from: p3 */
    public void m155353p3(List<IdealTypes> list, List<Dimensions> list2) {
        PrivateCustomSetting privateCustomSettingNew_ = PrivateCustomSetting.new_();
        this.f134593d0 = privateCustomSettingNew_;
        privateCustomSettingNew_.idealTypes = list;
        privateCustomSettingNew_.dimensions = list2;
    }

    /* JADX INFO: renamed from: q3 */
    public boolean m155354q3() {
        return xma.m210043F3() && !m155329D3();
    }

    /* JADX INFO: renamed from: r3 */
    public boolean m155355r3() {
        PrivateCustomSetting privateCustomSettingM155362y3 = m155362y3();
        if (this.f134583T.get().intValue() < m155326A3()) {
            return privateCustomSettingM155362y3 == null || !privateCustomSettingM155362y3.hasIdealTypesSelected();
        }
        return false;
    }

    /* JADX INFO: renamed from: s3 */
    public void m155356s3() {
        this.f134593d0 = null;
    }

    /* JADX INFO: renamed from: t3 */
    public C22306c<Pair<List<C18499a>, Boolean>> m155357t3() {
        return this.f134589Z;
    }

    /* JADX INFO: renamed from: u3 */
    public C22306c<Throwable> m155358u3() {
        return this.f134590a0;
    }

    /* JADX INFO: renamed from: v3 */
    public void m155359v3() {
        this.f134582S.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: w3 */
    public PrivateCustomSetting m155360w3() {
        return this.f134593d0;
    }

    /* JADX INFO: renamed from: x3 */
    public C22306c<PrivateCustomSetting> m155361x3() {
        return this.f134587X.asObservable();
    }

    /* JADX INFO: renamed from: y3 */
    public PrivateCustomSetting m155362y3() {
        return this.f134587X.m221515e();
    }

    /* JADX INFO: renamed from: z3 */
    public C22306c<Boolean> m155363z3() {
        return this.f134588Y.asObservable();
    }
}
