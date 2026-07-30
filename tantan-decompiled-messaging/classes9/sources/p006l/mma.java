package p006l;

import android.text.TextUtils;
import android.util.Pair;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.Dimensions;
import com.p1.mobile.putong.core.data.IdealTypes;
import com.p1.mobile.putong.core.data.PrivateCustomCard;
import com.p1.mobile.putong.core.data.PrivateCustomResult;
import com.p1.mobile.putong.core.data.PrivateCustomSetting;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import l.e30;
import l.hpd0;
import l.mkd0;
import l.mqi0;
import l.roj0;
import l.tpd0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.zpd0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;
import rx.subjects.a;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class mma extends ax6 {

    /* JADX INFO: renamed from: R */
    public final zpd0 f17081R;

    /* JADX INFO: renamed from: S */
    public final hpd0 f17082S;

    /* JADX INFO: renamed from: T */
    public final tpd0 f17083T;

    /* JADX INFO: renamed from: U */
    public final zpd0 f17084U;

    /* JADX INFO: renamed from: V */
    public final zpd0 f17085V;

    /* JADX INFO: renamed from: W */
    public boolean f17086W;

    /* JADX INFO: renamed from: X */
    public final a<PrivateCustomSetting> f17087X;

    /* JADX INFO: renamed from: Y */
    public final b<Boolean> f17088Y;

    /* JADX INFO: renamed from: Z */
    public final a<Pair<List<C1021a>, Boolean>> f17089Z;

    /* JADX INFO: renamed from: a0 */
    public final b<Throwable> f17090a0;

    /* JADX INFO: renamed from: b0 */
    public final HashSet<String> f17091b0;

    /* JADX INFO: renamed from: c0 */
    public final b<roj0> f17092c0;

    /* JADX INFO: renamed from: d0 */
    public PrivateCustomSetting f17093d0;

    /* JADX INFO: renamed from: l.mma$a */
    public static class C1021a {

        /* JADX INFO: renamed from: a */
        public User f17094a;

        /* JADX INFO: renamed from: b */
        public ArrayList<String> f17095b;
    }

    public mma(C0158c c0158c) {
        super(c0158c);
        this.f17086W = false;
        this.f17087X = a.b();
        this.f17088Y = b.b();
        this.f17089Z = a.b();
        this.f17090a0 = b.b();
        this.f17091b0 = new HashSet<>();
        this.f17092c0 = b.b();
        this.f17081R = new zpd0("private_custom_tab_show_red_dot_time_" + CoreModule.m1850H().userId(), 0L);
        this.f17082S = new hpd0("private_custom_guide_dialog_shown_" + CoreModule.m1850H().userId(), Boolean.FALSE);
        this.f17083T = new tpd0("private_custom_tab_guide_tips_shown_count_" + CoreModule.m1850H().userId(), 0);
        this.f17084U = new zpd0("private_custom_tab_first_auto_enter_custom_time_" + CoreModule.m1850H().userId(), 0L);
        this.f17085V = new zpd0("has_private_custom_privilege_auto_enter_custom_time_" + CoreModule.m1850H().userId(), 0L);
    }

    /* JADX INFO: renamed from: A3 */
    public final int m19343A3() {
        try {
            String strF = RemoteConfig.x().F("private_custom_config");
            if (TextUtils.isEmpty(strF)) {
                return 3;
            }
            return new JSONObject(strF).optInt("home_tab_bubble_times", 3);
        } catch (Exception unused) {
            return 3;
        }
    }

    /* JADX INFO: renamed from: B3 */
    public b<roj0> m19344B3() {
        return this.f17092c0;
    }

    /* JADX INFO: renamed from: C3 */
    public void m19345C3() {
        this.f17083T.put(Integer.valueOf(((Integer) this.f17083T.get()).intValue() + 1));
    }

    /* JADX INFO: renamed from: D3 */
    public final boolean m19346D3() {
        return ((Boolean) this.f17082S.get()).booleanValue();
    }

    /* JADX INFO: renamed from: E3 */
    public boolean m19347E3() {
        return this.f17086W;
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ PrivateCustomSetting m19348F3(Envelope envelope) {
        PrivateCustomSetting privateCustomSetting = envelope.getModuleData(CoreData.class).privateCustomSetting;
        boolean zA = NullChecker.a(privateCustomSetting);
        a<PrivateCustomSetting> aVar = this.f17087X;
        if (zA) {
            aVar.onNext(privateCustomSetting);
            return privateCustomSetting;
        }
        if (aVar.e() == null) {
            this.f17087X.onNext(PrivateCustomSetting.new_());
        }
        return privateCustomSetting;
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ void m19349G3(Throwable th) {
        if (this.f17087X.e() == null) {
            this.f17087X.onNext(PrivateCustomSetting.new_());
        }
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ c m19350H3() {
        return ia20.m16567a(new v9j() { // from class: l.ema
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G("/private-custom-setting")).f().b();
            }
        }).map(new w9j() { // from class: l.fma
            public final Object call(Object obj) {
                return this.f12777a.m19348F3((Envelope) obj);
            }
        }).doOnError(new e30() { // from class: l.gma
            public final void call(Object obj) {
                this.f13387a.m19349G3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ void m19351I3(HashMap map, List list, User user) {
        if (this.f17091b0.contains(((DbObject) user).id)) {
            return;
        }
        this.f17091b0.add(((DbObject) user).id);
        C1021a c1021a = new C1021a();
        c1021a.f17094a = user;
        c1021a.f17095b = (ArrayList) map.get(((DbObject) user).id);
        list.add(c1021a);
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ roj0 m19352J3(Envelope envelope) {
        int size;
        final ArrayList arrayList = new ArrayList();
        this.f17091b0.clear();
        final HashMap map = new HashMap();
        PrivateCustomResult privateCustomResult = envelope.getModuleData(CoreData.class).privateCustomResult;
        if (NullChecker.a(privateCustomResult)) {
            vwb.z(privateCustomResult.cards, new e30() { // from class: l.ama
                public final void call(Object obj) {
                    PrivateCustomCard privateCustomCard = (PrivateCustomCard) obj;
                    map.put(privateCustomCard.userId, new ArrayList(privateCustomCard.tags));
                }
            });
            size = privateCustomResult.mock ? privateCustomResult.cards.size() : privateCustomResult.total;
        } else {
            size = -1;
        }
        vwb.z(envelope.getModuleData(CommonData.class).users, new e30() { // from class: l.bma
            public final void call(Object obj) {
                this.f8985a.m19351I3(map, arrayList, (User) obj);
            }
        });
        if (ConnectivityReceiver.i()) {
            vwb.z(vwb.E(envelope.getModuleData(CommonData.class).users), new e30() { // from class: l.cma
                public final void call(Object obj) {
                    qib0.f19782G.m12792z0(((User) obj).fp().profileMiddle());
                }
            });
        }
        if (vwb.J(envelope.getModuleData(CommonData.class).users)) {
            a<Pair<List<C1021a>, Boolean>> aVar = this.f17089Z;
            if (size > 0) {
                aVar.onNext(new Pair(arrayList, Boolean.TRUE));
            } else {
                aVar.onNext(new Pair(arrayList, Boolean.FALSE));
            }
        } else {
            this.f17089Z.onNext(new Pair(arrayList, Boolean.FALSE));
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ c m19353K3() {
        return new la20(new v9j() { // from class: l.ima
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G("/private-custom-result")).b();
            }
        }).map(new w9j() { // from class: l.jma
            public final Object call(Object obj) {
                return this.f15267a.m19354L3((Envelope) obj);
            }
        }).compose(mkd0.C()).doOnError(new e30() { // from class: l.kma
            public final void call(Object obj) {
                this.f15901a.m19355M3((Throwable) obj);
            }
        }).map(new w9j() { // from class: l.lma
            public final Object call(Object obj) {
                return this.f16521a.m19352J3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ Envelope m19354L3(Envelope envelope) {
        this.f8580Q.m3423x3(envelope, null, true);
        return envelope;
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m19355M3(Throwable th) {
        this.f17090a0.onNext(th);
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ Envelope m19356N3(Envelope envelope) {
        m19373s3();
        this.f17088Y.onNext(Boolean.TRUE);
        return envelope;
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ c m19357O3(List list, List list2) {
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
        return ia20.m16567a(new v9j() { // from class: l.yla
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G("/private-custom-setting")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).map(new w9j() { // from class: l.zla
            public final Object call(Object obj) {
                return this.f28805a.m19356N3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P3 */
    public c<PrivateCustomSetting> m19358P3() {
        return this.f8580Q.scheduled("loadCustomSetting", 0, new v9j() { // from class: l.xla
            public final Object call() {
                return this.f27582a.m19350H3();
            }
        });
    }

    /* JADX INFO: renamed from: Q3 */
    public c<roj0> m19359Q3() {
        return this.f8580Q.scheduled("loadCustomizedResultDatas", 0, new v9j() { // from class: l.dma
            public final Object call() {
                return this.f10477a.m19353K3();
            }
        });
    }

    /* JADX INFO: renamed from: R3 */
    public boolean m19360R3() {
        return ((Long) this.f17084U.get()).longValue() == 0;
    }

    /* JADX INFO: renamed from: S3 */
    public boolean m19361S3() {
        return ((Long) this.f17085V.get()).longValue() == 0;
    }

    /* JADX INFO: renamed from: T3 */
    public boolean m19362T3() {
        return (m19372r3() || mqi0.D(((Long) this.f17081R.get()).longValue()) || !mqi0.z(12, 0, 0)) ? false : true;
    }

    /* JADX INFO: renamed from: U3 */
    public void m19363U3() {
        this.f17092c0.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: V3 */
    public c<Envelope> m19364V3(final List<String> list, final List<Dimensions> list2) {
        return this.f8580Q.scheduled("privateCustom/setting", -1, new v9j() { // from class: l.hma
            public final Object call() {
                return this.f13939a.m19357O3(list2, list);
            }
        });
    }

    /* JADX INFO: renamed from: W3 */
    public void m19365W3(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Pair pair = (Pair) this.f17089Z.e();
        if (NullChecker.a(pair)) {
            int size = ((List) pair.first).size();
            Iterator it = ((List) pair.first).iterator();
            while (it.hasNext()) {
                if (str.equals(((DbObject) ((C1021a) it.next()).f17094a).id)) {
                    it.remove();
                    this.f17089Z.onNext(new Pair((List) pair.first, Boolean.valueOf(size + (-1) == 0)));
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: X3 */
    public void m19366X3() {
        this.f17082S.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: Y3 */
    public void m19367Y3() {
        this.f17084U.put(Long.valueOf(mqi0.o()));
    }

    /* JADX INFO: renamed from: Z3 */
    public void m19368Z3() {
        this.f17085V.put(Long.valueOf(mqi0.o()));
    }

    /* JADX INFO: renamed from: a4 */
    public void m19369a4() {
        this.f17081R.put(Long.valueOf(mqi0.o()));
    }

    /* JADX INFO: renamed from: p3 */
    public void m19370p3(List<IdealTypes> list, List<Dimensions> list2) {
        PrivateCustomSetting privateCustomSettingNew_ = PrivateCustomSetting.new_();
        this.f17093d0 = privateCustomSettingNew_;
        privateCustomSettingNew_.idealTypes = list;
        privateCustomSettingNew_.dimensions = list2;
    }

    /* JADX INFO: renamed from: q3 */
    public boolean m19371q3() {
        return xma.m27351F3() && !m19346D3();
    }

    /* JADX INFO: renamed from: r3 */
    public boolean m19372r3() {
        PrivateCustomSetting privateCustomSettingM19379y3 = m19379y3();
        if (((Integer) this.f17083T.get()).intValue() < m19343A3()) {
            return privateCustomSettingM19379y3 == null || !privateCustomSettingM19379y3.hasIdealTypesSelected();
        }
        return false;
    }

    /* JADX INFO: renamed from: s3 */
    public void m19373s3() {
        this.f17093d0 = null;
    }

    /* JADX INFO: renamed from: t3 */
    public c<Pair<List<C1021a>, Boolean>> m19374t3() {
        return this.f17089Z;
    }

    /* JADX INFO: renamed from: u3 */
    public c<Throwable> m19375u3() {
        return this.f17090a0;
    }

    /* JADX INFO: renamed from: v3 */
    public void m19376v3() {
        this.f17082S.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: w3 */
    public PrivateCustomSetting m19377w3() {
        return this.f17093d0;
    }

    /* JADX INFO: renamed from: x3 */
    public c<PrivateCustomSetting> m19378x3() {
        return this.f17087X.asObservable();
    }

    /* JADX INFO: renamed from: y3 */
    public PrivateCustomSetting m19379y3() {
        return (PrivateCustomSetting) this.f17087X.e();
    }

    /* JADX INFO: renamed from: z3 */
    public c<Boolean> m19380z3() {
        return this.f17088Y.asObservable();
    }
}
