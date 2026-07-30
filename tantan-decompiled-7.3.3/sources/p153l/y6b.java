package p153l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.Dimensions;
import com.p051p1.mobile.putong.core.data.PrivateCustomCard;
import com.p051p1.mobile.putong.core.data.PrivateCustomResult;
import com.p051p1.mobile.putong.core.data.PrivateCustomSetting;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
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
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes9.dex */
public class y6b extends dy6 {

    /* JADX INFO: renamed from: R */
    public final C22507a<Pair<List<C21531a>, Boolean>> f197663R;

    /* JADX INFO: renamed from: S */
    public final C22507a<PrivateCustomSetting> f197664S;

    /* JADX INFO: renamed from: T */
    public final C22508b<Boolean> f197665T;

    /* JADX INFO: renamed from: U */
    public final C22508b<Throwable> f197666U;

    /* JADX INFO: renamed from: V */
    public final HashSet<String> f197667V;

    /* JADX INFO: renamed from: W */
    public final byd0 f197668W;

    /* JADX INFO: renamed from: X */
    public final byd0 f197669X;

    /* JADX INFO: renamed from: l.y6b$a */
    public static class C21531a {

        /* JADX INFO: renamed from: a */
        public User f197670a;

        /* JADX INFO: renamed from: b */
        public ArrayList<String> f197671b;
    }

    public y6b(C4883c c4883c) {
        super(c4883c);
        this.f197663R = C22507a.m222758b();
        this.f197664S = C22507a.m222758b();
        this.f197665T = C22508b.m222767b();
        this.f197666U = C22508b.m222767b();
        this.f197667V = new HashSet<>();
        this.f197668W = new byd0("supreme_tab_show_red_dot_time_" + CoreModule.m30929H().userId(), 0L);
        this.f197669X = new byd0("supreme_tab_show_first_custom_time_" + CoreModule.m30929H().userId(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E3 */
    public /* synthetic */ Envelope m214406E3(Envelope envelope) {
        this.f197665T.m137019l(Boolean.TRUE);
        return envelope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F3 */
    public /* synthetic */ C22421c m214407F3(List list, List list2) {
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
        return qi20.m176654a(new pcj() { // from class: l.n6b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32345q2("/privateCustom/setting")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).map(new qcj() { // from class: l.o6b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f145153a.m214406E3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f3 */
    public static /* synthetic */ void m214413f3(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ void m214419l3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x3 */
    public /* synthetic */ PrivateCustomSetting m214425x3(Envelope envelope) {
        this.f197664S.m137019l(((CoreData) envelope.getModuleData(CoreData.class)).privateCustomSetting);
        return ((CoreData) envelope.getModuleData(CoreData.class)).privateCustomSetting;
    }

    /* JADX INFO: renamed from: A3 */
    public final /* synthetic */ void m214426A3(Throwable th) {
        this.f197666U.m137019l(th);
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ void m214427B3(HashMap map, List list, User user) {
        if (this.f197667V.contains(user.f56859id)) {
            return;
        }
        this.f197667V.add(user.f56859id);
        C21531a c21531a = new C21531a();
        c21531a.f197670a = user;
        c21531a.f197671b = (ArrayList) map.get(user.f56859id);
        list.add(c21531a);
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ uxj0 m214428C3(Envelope envelope) {
        int size;
        final ArrayList arrayList = new ArrayList();
        this.f197667V.clear();
        final HashMap map = new HashMap();
        PrivateCustomResult privateCustomResult = ((CoreData) envelope.getModuleData(CoreData.class)).privateCustomResults;
        if (NullChecker.m82486a(privateCustomResult)) {
            jyb.m147537z(privateCustomResult.cards, new y20() { // from class: l.j6b
                @Override // p153l.y20
                public final void call(Object obj) {
                    PrivateCustomCard privateCustomCard = (PrivateCustomCard) obj;
                    map.put(privateCustomCard.userId, new ArrayList(privateCustomCard.tags));
                }
            });
            size = privateCustomResult.mock ? privateCustomResult.cards.size() : privateCustomResult.total;
        } else {
            size = -1;
        }
        jyb.m147537z(((CommonData) envelope.getModuleData(CommonData.class)).users, new y20() { // from class: l.k6b
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124165a.m214427B3(map, arrayList, (User) obj);
            }
        });
        if (ConnectivityReceiver.m82469i()) {
            jyb.m147537z(jyb.m147474E(((CommonData) envelope.getModuleData(CommonData.class)).users), new y20() { // from class: l.l6b
                @Override // p153l.y20
                public final void call(Object obj) {
                    uqb0.f180374G.m127162z0(((User) obj).m61308fp().profileMiddle());
                }
            });
        }
        if (jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            C22507a<Pair<List<C21531a>, Boolean>> c22507a = this.f197663R;
            if (size > 0) {
                c22507a.m137019l(new Pair<>(arrayList, Boolean.TRUE));
            } else {
                c22507a.m137019l(new Pair<>(arrayList, Boolean.FALSE));
            }
        } else {
            this.f197663R.m137019l(new Pair<>(arrayList, Boolean.FALSE));
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ C22421c m214429D3() {
        return new ti20(new pcj() { // from class: l.v6b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32341p2()).m209028b();
            }
        }).map(new qcj() { // from class: l.w6b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f187601a.m214445z3((Envelope) obj);
            }
        }).compose(psd0.m173592C()).doOnError(new y20() { // from class: l.x6b
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192566a.m214426A3((Throwable) obj);
            }
        }).map(new qcj() { // from class: l.i6b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f113154a.m214428C3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: G3 */
    public C22421c<PrivateCustomSetting> m214430G3() {
        return this.f91137Q.scheduled("loadCustomSetting", 0, new pcj() { // from class: l.h6b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f108020a.m214444y3();
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public C22421c<uxj0> m214431H3() {
        return this.f91137Q.scheduled("core_supreme_request", 0, new pcj() { // from class: l.r6b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f161462a.m214429D3();
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public boolean m214432I3() {
        return this.f197669X.get().longValue() == 0;
    }

    /* JADX INFO: renamed from: J3 */
    public C22421c<Envelope> m214433J3(final List<String> list, final List<Dimensions> list2) {
        return this.f91137Q.scheduled("privateCustom/setting", -1, new pcj() { // from class: l.m6b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f134982a.m214407F3(list2, list);
            }
        });
    }

    /* JADX INFO: renamed from: K3 */
    public void m214434K3(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Pair<List<C21531a>, Boolean> pairM222761e = this.f197663R.m222761e();
        if (NullChecker.m82486a(pairM222761e)) {
            int size = ((List) pairM222761e.first).size();
            Iterator it = ((List) pairM222761e.first).iterator();
            while (it.hasNext()) {
                if (str.equals(((C21531a) it.next()).f197670a.f56859id)) {
                    it.remove();
                    this.f197663R.m137019l(new Pair<>((List) pairM222761e.first, Boolean.valueOf(size + (-1) == 0)));
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: L3 */
    public void m214435L3(Act act, final x20 x20Var) {
        new th0.C20312a(act).m191151j("您已完成私人定制，是否希望更新").m191159r("更新定制").m191156o(new View.OnClickListener() { // from class: l.s6b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        }).m191147f("不用了").m191144c(new View.OnClickListener() { // from class: l.t6b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y6b.m214419l3(view);
            }
        }).m191154m(new DialogInterface.OnDismissListener() { // from class: l.u6b
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                y6b.m214413f3(dialogInterface);
            }
        }).m191149h(true).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: M3 */
    public C22421c<Throwable> m214436M3() {
        return this.f197666U;
    }

    /* JADX INFO: renamed from: N3 */
    public C22421c<Pair<List<C21531a>, Boolean>> m214437N3() {
        return this.f197663R;
    }

    /* JADX INFO: renamed from: r3 */
    public void m214438r3() {
        this.f197669X.put(Long.valueOf(pzi0.m174454o()));
    }

    /* JADX INFO: renamed from: s3 */
    public void m214439s3() {
        this.f197668W.put(Long.valueOf(pzi0.m174454o()));
    }

    /* JADX INFO: renamed from: t3 */
    public C22421c<PrivateCustomSetting> m214440t3() {
        return this.f197664S.asObservable();
    }

    /* JADX INFO: renamed from: u3 */
    public PrivateCustomSetting m214441u3() {
        return this.f197664S.m222761e();
    }

    /* JADX INFO: renamed from: v3 */
    public C22421c<Boolean> m214442v3() {
        return this.f197665T.asObservable();
    }

    /* JADX INFO: renamed from: w3 */
    public void m214443w3(Context context) {
        context.startActivity(MkWebViewAct.m81421d2(context, "", zwk.m221905e() ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/commerce/supreme-partner/index.html?speed=true&_bid=1004554&hideNavigationBar=1&hideNotch=1#/" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/commerce/supreme-partner/index.html?speed=true&_bid=1004554&hideNavigationBar=1&hideNotch=1#/", true, true, null));
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ C22421c m214444y3() {
        return qi20.m176654a(new pcj() { // from class: l.p6b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32345q2("/privateCustom/setting")).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.q6b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f155792a.m214425x3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ Envelope m214445z3(Envelope envelope) {
        this.f91137Q.m32496x3(envelope, null, true);
        return envelope;
    }
}
