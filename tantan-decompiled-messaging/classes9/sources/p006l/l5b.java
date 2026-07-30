package p006l;

import android.content.Context;
import android.content.DialogInterface;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.Dimensions;
import com.p1.mobile.putong.core.data.PrivateCustomCard;
import com.p1.mobile.putong.core.data.PrivateCustomResult;
import com.p1.mobile.putong.core.data.PrivateCustomSetting;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import l.d30;
import l.e30;
import l.juk;
import l.mkd0;
import l.mqi0;
import l.roj0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.xh0;
import l.zpd0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;
import rx.subjects.a;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class l5b extends ax6 {

    /* JADX INFO: renamed from: R */
    public final a<Pair<List<C0964a>, Boolean>> f16233R;

    /* JADX INFO: renamed from: S */
    public final a<PrivateCustomSetting> f16234S;

    /* JADX INFO: renamed from: T */
    public final b<Boolean> f16235T;

    /* JADX INFO: renamed from: U */
    public final b<Throwable> f16236U;

    /* JADX INFO: renamed from: V */
    public final HashSet<String> f16237V;

    /* JADX INFO: renamed from: W */
    public final zpd0 f16238W;

    /* JADX INFO: renamed from: X */
    public final zpd0 f16239X;

    /* JADX INFO: renamed from: l.l5b$a */
    public static class C0964a {

        /* JADX INFO: renamed from: a */
        public User f16240a;

        /* JADX INFO: renamed from: b */
        public ArrayList<String> f16241b;
    }

    public l5b(C0158c c0158c) {
        super(c0158c);
        this.f16233R = a.b();
        this.f16234S = a.b();
        this.f16235T = b.b();
        this.f16236U = b.b();
        this.f16237V = new HashSet<>();
        this.f16238W = new zpd0("supreme_tab_show_red_dot_time_" + CoreModule.m1850H().userId(), 0L);
        this.f16239X = new zpd0("supreme_tab_show_first_custom_time_" + CoreModule.m1850H().userId(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E3 */
    public /* synthetic */ Envelope m18564E3(Envelope envelope) {
        this.f16235T.onNext(Boolean.TRUE);
        return envelope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F3 */
    public /* synthetic */ c m18565F3(List list, List list2) {
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
        return ia20.m16567a(new v9j() { // from class: l.a5b
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3272q2("/privateCustom/setting")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).map(new w9j() { // from class: l.b5b
            public final Object call(Object obj) {
                return this.f8733a.m18564E3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f3 */
    public static /* synthetic */ void m18571f3(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ void m18577l3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x3 */
    public /* synthetic */ PrivateCustomSetting m18583x3(Envelope envelope) {
        this.f16234S.onNext(envelope.getModuleData(CoreData.class).privateCustomSetting);
        return envelope.getModuleData(CoreData.class).privateCustomSetting;
    }

    /* JADX INFO: renamed from: A3 */
    public final /* synthetic */ void m18584A3(Throwable th) {
        this.f16236U.onNext(th);
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ void m18585B3(HashMap map, List list, User user) {
        if (this.f16237V.contains(((DbObject) user).id)) {
            return;
        }
        this.f16237V.add(((DbObject) user).id);
        C0964a c0964a = new C0964a();
        c0964a.f16240a = user;
        c0964a.f16241b = (ArrayList) map.get(((DbObject) user).id);
        list.add(c0964a);
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ roj0 m18586C3(Envelope envelope) {
        int size;
        final ArrayList arrayList = new ArrayList();
        this.f16237V.clear();
        final HashMap map = new HashMap();
        PrivateCustomResult privateCustomResult = envelope.getModuleData(CoreData.class).privateCustomResults;
        if (NullChecker.a(privateCustomResult)) {
            vwb.z(privateCustomResult.cards, new e30() { // from class: l.w4b
                public final void call(Object obj) {
                    PrivateCustomCard privateCustomCard = (PrivateCustomCard) obj;
                    map.put(privateCustomCard.userId, new ArrayList(privateCustomCard.tags));
                }
            });
            size = privateCustomResult.mock ? privateCustomResult.cards.size() : privateCustomResult.total;
        } else {
            size = -1;
        }
        vwb.z(envelope.getModuleData(CommonData.class).users, new e30() { // from class: l.x4b
            public final void call(Object obj) {
                this.f27345a.m18585B3(map, arrayList, (User) obj);
            }
        });
        if (ConnectivityReceiver.i()) {
            vwb.z(vwb.E(envelope.getModuleData(CommonData.class).users), new e30() { // from class: l.y4b
                public final void call(Object obj) {
                    qib0.f19782G.m12792z0(((User) obj).fp().profileMiddle());
                }
            });
        }
        if (vwb.J(envelope.getModuleData(CommonData.class).users)) {
            a<Pair<List<C0964a>, Boolean>> aVar = this.f16233R;
            if (size > 0) {
                aVar.onNext(new Pair(arrayList, Boolean.TRUE));
            } else {
                aVar.onNext(new Pair(arrayList, Boolean.FALSE));
            }
        } else {
            this.f16233R.onNext(new Pair(arrayList, Boolean.FALSE));
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ c m18587D3() {
        return new la20(new v9j() { // from class: l.i5b
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3268p2()).b();
            }
        }).map(new w9j() { // from class: l.j5b
            public final Object call(Object obj) {
                return this.f15003a.m18603z3((Envelope) obj);
            }
        }).compose(mkd0.C()).doOnError(new e30() { // from class: l.k5b
            public final void call(Object obj) {
                this.f15621a.m18584A3((Throwable) obj);
            }
        }).map(new w9j() { // from class: l.v4b
            public final Object call(Object obj) {
                return this.f24121a.m18586C3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: G3 */
    public c<PrivateCustomSetting> m18588G3() {
        return this.f8580Q.scheduled("loadCustomSetting", 0, new v9j() { // from class: l.u4b
            public final Object call() {
                return this.f22463a.m18602y3();
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public c<roj0> m18589H3() {
        return this.f8580Q.scheduled("core_supreme_request", 0, new v9j() { // from class: l.e5b
            public final Object call() {
                return this.f10771a.m18587D3();
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public boolean m18590I3() {
        return ((Long) this.f16239X.get()).longValue() == 0;
    }

    /* JADX INFO: renamed from: J3 */
    public c<Envelope> m18591J3(final List<String> list, final List<Dimensions> list2) {
        return this.f8580Q.scheduled("privateCustom/setting", -1, new v9j() { // from class: l.z4b
            public final Object call() {
                return this.f28619a.m18565F3(list2, list);
            }
        });
    }

    /* JADX INFO: renamed from: K3 */
    public void m18592K3(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Pair pair = (Pair) this.f16233R.e();
        if (NullChecker.a(pair)) {
            int size = ((List) pair.first).size();
            Iterator it = ((List) pair.first).iterator();
            while (it.hasNext()) {
                if (str.equals(((DbObject) ((C0964a) it.next()).f16240a).id)) {
                    it.remove();
                    this.f16233R.onNext(new Pair((List) pair.first, Boolean.valueOf(size + (-1) == 0)));
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: L3 */
    public void m18593L3(Act act, final d30 d30Var) {
        new xh0.a(act).j("您已完成私人定制，是否希望更新").r("更新定制").o(new View.OnClickListener() { // from class: l.f5b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        }).f("不用了").c(new View.OnClickListener() { // from class: l.g5b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l5b.m18577l3(view);
            }
        }).m(new DialogInterface.OnDismissListener() { // from class: l.h5b
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                l5b.m18571f3(dialogInterface);
            }
        }).h(true).a().g();
    }

    /* JADX INFO: renamed from: M3 */
    public c<Throwable> m18594M3() {
        return this.f16236U;
    }

    /* JADX INFO: renamed from: N3 */
    public c<Pair<List<C0964a>, Boolean>> m18595N3() {
        return this.f16233R;
    }

    /* JADX INFO: renamed from: r3 */
    public void m18596r3() {
        this.f16239X.put(Long.valueOf(mqi0.o()));
    }

    /* JADX INFO: renamed from: s3 */
    public void m18597s3() {
        this.f16238W.put(Long.valueOf(mqi0.o()));
    }

    /* JADX INFO: renamed from: t3 */
    public c<PrivateCustomSetting> m18598t3() {
        return this.f16234S.asObservable();
    }

    /* JADX INFO: renamed from: u3 */
    public PrivateCustomSetting m18599u3() {
        return (PrivateCustomSetting) this.f16234S.e();
    }

    /* JADX INFO: renamed from: v3 */
    public c<Boolean> m18600v3() {
        return this.f16235T.asObservable();
    }

    /* JADX INFO: renamed from: w3 */
    public void m18601w3(Context context) {
        context.startActivity(MkWebViewAct.c2(context, "", juk.e() ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/commerce/supreme-partner/index.html?speed=true&_bid=1004554&hideNavigationBar=1&hideNotch=1#/" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/commerce/supreme-partner/index.html?speed=true&_bid=1004554&hideNavigationBar=1&hideNotch=1#/", true, true, (ResultReceiver) null));
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ c m18602y3() {
        return ia20.m16567a(new v9j() { // from class: l.c5b
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3272q2("/privateCustom/setting")).f().b();
            }
        }).map(new w9j() { // from class: l.d5b
            public final Object call(Object obj) {
                return this.f10021a.m18583x3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ Envelope m18603z3(Envelope envelope) {
        this.f8580Q.m3423x3(envelope, null, true);
        return envelope;
    }
}
