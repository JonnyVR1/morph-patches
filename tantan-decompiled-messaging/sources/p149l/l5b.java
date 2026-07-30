package p149l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.Dimensions;
import com.p046p1.mobile.putong.core.data.PrivateCustomCard;
import com.p046p1.mobile.putong.core.data.PrivateCustomResult;
import com.p046p1.mobile.putong.core.data.PrivateCustomSetting;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
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
public class l5b extends ax6 {

    /* JADX INFO: renamed from: R */
    public final C22392a<Pair<List<C18151a>, Boolean>> f126099R;

    /* JADX INFO: renamed from: S */
    public final C22392a<PrivateCustomSetting> f126100S;

    /* JADX INFO: renamed from: T */
    public final C22393b<Boolean> f126101T;

    /* JADX INFO: renamed from: U */
    public final C22393b<Throwable> f126102U;

    /* JADX INFO: renamed from: V */
    public final HashSet<String> f126103V;

    /* JADX INFO: renamed from: W */
    public final zpd0 f126104W;

    /* JADX INFO: renamed from: X */
    public final zpd0 f126105X;

    /* JADX INFO: renamed from: l.l5b$a */
    public static class C18151a {

        /* JADX INFO: renamed from: a */
        public User f126106a;

        /* JADX INFO: renamed from: b */
        public ArrayList<String> f126107b;
    }

    public l5b(C4732c c4732c) {
        super(c4732c);
        this.f126099R = C22392a.m221512b();
        this.f126100S = C22392a.m221512b();
        this.f126101T = C22393b.m221521b();
        this.f126102U = C22393b.m221521b();
        this.f126103V = new HashSet<>();
        this.f126104W = new zpd0("supreme_tab_show_red_dot_time_" + CoreModule.m29931H().userId(), 0L);
        this.f126105X = new zpd0("supreme_tab_show_first_custom_time_" + CoreModule.m29931H().userId(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E3 */
    public /* synthetic */ Envelope m148578E3(Envelope envelope) {
        this.f126101T.m132487l(Boolean.TRUE);
        return envelope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F3 */
    public /* synthetic */ C22306c m148579F3(List list, List list2) {
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
        return ia20.m135117a(new v9j() { // from class: l.a5b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31342q2("/privateCustom/setting")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).map(new w9j() { // from class: l.b5b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f73461a.m148578E3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f3 */
    public static /* synthetic */ void m148585f3(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ void m148591l3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x3 */
    public /* synthetic */ PrivateCustomSetting m148597x3(Envelope envelope) {
        this.f126100S.m132487l(((CoreData) envelope.getModuleData(CoreData.class)).privateCustomSetting);
        return ((CoreData) envelope.getModuleData(CoreData.class)).privateCustomSetting;
    }

    /* JADX INFO: renamed from: A3 */
    public final /* synthetic */ void m148598A3(Throwable th) {
        this.f126102U.m132487l(th);
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ void m148599B3(HashMap map, List list, User user) {
        if (this.f126103V.contains(user.f56011id)) {
            return;
        }
        this.f126103V.add(user.f56011id);
        C18151a c18151a = new C18151a();
        c18151a.f126106a = user;
        c18151a.f126107b = (ArrayList) map.get(user.f56011id);
        list.add(c18151a);
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ roj0 m148600C3(Envelope envelope) {
        int size;
        final ArrayList arrayList = new ArrayList();
        this.f126103V.clear();
        final HashMap map = new HashMap();
        PrivateCustomResult privateCustomResult = ((CoreData) envelope.getModuleData(CoreData.class)).privateCustomResults;
        if (NullChecker.m81303a(privateCustomResult)) {
            vwb.m200354z(privateCustomResult.cards, new e30() { // from class: l.w4b
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
        vwb.m200354z(((CommonData) envelope.getModuleData(CommonData.class)).users, new e30() { // from class: l.x4b
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f190960a.m148599B3(map, arrayList, (User) obj);
            }
        });
        if (ConnectivityReceiver.m81286i()) {
            vwb.m200354z(vwb.m200291E(((CommonData) envelope.getModuleData(CommonData.class)).users), new e30() { // from class: l.y4b
                @Override // p149l.e30
                public final void call(Object obj) {
                    qib0.f154691G.m102379z0(((User) obj).m60124fp().profileMiddle());
                }
            });
        }
        if (vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            C22392a<Pair<List<C18151a>, Boolean>> c22392a = this.f126099R;
            if (size > 0) {
                c22392a.m132487l(new Pair<>(arrayList, Boolean.TRUE));
            } else {
                c22392a.m132487l(new Pair<>(arrayList, Boolean.FALSE));
            }
        } else {
            this.f126099R.m132487l(new Pair<>(arrayList, Boolean.FALSE));
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ C22306c m148601D3() {
        return new la20(new v9j() { // from class: l.i5b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31338p2()).m185883b();
            }
        }).map(new w9j() { // from class: l.j5b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f116284a.m148617z3((Envelope) obj);
            }
        }).compose(mkd0.m154951C()).doOnError(new e30() { // from class: l.k5b
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121173a.m148598A3((Throwable) obj);
            }
        }).map(new w9j() { // from class: l.v4b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f179892a.m148600C3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: G3 */
    public C22306c<PrivateCustomSetting> m148602G3() {
        return this.f72126Q.scheduled("loadCustomSetting", 0, new v9j() { // from class: l.u4b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f173712a.m148616y3();
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public C22306c<roj0> m148603H3() {
        return this.f72126Q.scheduled("core_supreme_request", 0, new v9j() { // from class: l.e5b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f89360a.m148601D3();
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public boolean m148604I3() {
        return this.f126105X.get().longValue() == 0;
    }

    /* JADX INFO: renamed from: J3 */
    public C22306c<Envelope> m148605J3(final List<String> list, final List<Dimensions> list2) {
        return this.f72126Q.scheduled("privateCustom/setting", -1, new v9j() { // from class: l.z4b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f201450a.m148579F3(list2, list);
            }
        });
    }

    /* JADX INFO: renamed from: K3 */
    public void m148606K3(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Pair<List<C18151a>, Boolean> pairM221515e = this.f126099R.m221515e();
        if (NullChecker.m81303a(pairM221515e)) {
            int size = ((List) pairM221515e.first).size();
            Iterator it = ((List) pairM221515e.first).iterator();
            while (it.hasNext()) {
                if (str.equals(((C18151a) it.next()).f126106a.f56011id)) {
                    it.remove();
                    this.f126099R.m132487l(new Pair<>((List) pairM221515e.first, Boolean.valueOf(size + (-1) == 0)));
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: L3 */
    public void m148607L3(Act act, final d30 d30Var) {
        new xh0.C21150a(act).m208731j("您已完成私人定制，是否希望更新").m208739r("更新定制").m208736o(new View.OnClickListener() { // from class: l.f5b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        }).m208727f("不用了").m208724c(new View.OnClickListener() { // from class: l.g5b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l5b.m148591l3(view);
            }
        }).m208734m(new DialogInterface.OnDismissListener() { // from class: l.h5b
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                l5b.m148585f3(dialogInterface);
            }
        }).m208729h(true).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: M3 */
    public C22306c<Throwable> m148608M3() {
        return this.f126102U;
    }

    /* JADX INFO: renamed from: N3 */
    public C22306c<Pair<List<C18151a>, Boolean>> m148609N3() {
        return this.f126099R;
    }

    /* JADX INFO: renamed from: r3 */
    public void m148610r3() {
        this.f126105X.put(Long.valueOf(mqi0.m155944o()));
    }

    /* JADX INFO: renamed from: s3 */
    public void m148611s3() {
        this.f126104W.put(Long.valueOf(mqi0.m155944o()));
    }

    /* JADX INFO: renamed from: t3 */
    public C22306c<PrivateCustomSetting> m148612t3() {
        return this.f126100S.asObservable();
    }

    /* JADX INFO: renamed from: u3 */
    public PrivateCustomSetting m148613u3() {
        return this.f126100S.m221515e();
    }

    /* JADX INFO: renamed from: v3 */
    public C22306c<Boolean> m148614v3() {
        return this.f126101T.asObservable();
    }

    /* JADX INFO: renamed from: w3 */
    public void m148615w3(Context context) {
        context.startActivity(MkWebViewAct.m80238c2(context, "", juk.m143323e() ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/commerce/supreme-partner/index.html?speed=true&_bid=1004554&hideNavigationBar=1&hideNotch=1#/" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/commerce/supreme-partner/index.html?speed=true&_bid=1004554&hideNavigationBar=1&hideNotch=1#/", true, true, null));
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ C22306c m148616y3() {
        return ia20.m135117a(new v9j() { // from class: l.c5b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31342q2("/privateCustom/setting")).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.d5b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f84398a.m148597x3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ Envelope m148617z3(Envelope envelope) {
        this.f72126Q.m31493x3(envelope, null, true);
        return envelope;
    }
}
