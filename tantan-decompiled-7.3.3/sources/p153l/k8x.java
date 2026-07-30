package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.newui.messages.C8291a;
import com.p051p1.mobile.putong.core.p058ui.match.C8618a;
import com.p051p1.mobile.putong.core.p058ui.match.C8619b;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p153l.qyl;

/* JADX INFO: loaded from: classes3.dex */
public class k8x<T extends qyl> extends ar2<T> {

    /* JADX INFO: renamed from: a */
    public int f124420a;

    /* JADX INFO: renamed from: b */
    public String f124421b;

    /* JADX INFO: renamed from: c */
    public User f124422c;

    public k8x(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m148765f0(Throwable th) {
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m148769j0(User user) {
        Conversation conversationQuery = CoreModule.f18272k.f115545m.query(user.f56859id);
        conversationQuery.convType = "default";
        CoreModule.f18264c.f20384f0.m34053mq(conversationQuery);
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m148772m0(Throwable th) {
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m148774A0(UserPrivilege userPrivilege) {
        if (joa.m146354D3()) {
            if (C8618a.m48771w().m48772A()) {
                final User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(this.f124421b);
                C8618a.m48771w().m48781J(act(), userM116503Pa, new x20() { // from class: l.g8x
                    @Override // p153l.x20
                    public final void call() {
                        this.f102722a.m148783z0(userM116503Pa);
                    }
                });
            } else {
                o1j0.m165624F(act(), act().getString(R$string.f19703u9));
                act().m68056e2();
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    public String m148775o0() {
        return this.f124421b;
    }

    /* JADX INFO: renamed from: p0 */
    public String m148776p0(String str) {
        if (gra.m131625S1() || gra.m131701j2()) {
            return TextUtils.equals(str, "tmp_from_home_swipe") ? "positive" : "negative";
        }
        return null;
    }

    /* JADX INFO: renamed from: q0 */
    public void mo96040q0(String str, int i, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        this.f124421b = str;
        this.f124420a = i;
    }

    /* JADX INFO: renamed from: r0 */
    public void m148777r0() {
        duringCreated(CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip")).distinctUntilChanged()).filter(new qcj() { // from class: l.a8x
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!joa.m146386f4());
            }
        }).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.b8x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75486a.m148782y0((UserPrivilege) obj);
            }
        }, new y20() { // from class: l.c8x
            @Override // p153l.y20
            public final void call(Object obj) {
                k8x.m148772m0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public void m148778s0() {
        duringCreated((C22421c<T>) CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.ultraPremium))).distinctUntilChanged().subscribe(psd0.m173597H(new y20() { // from class: l.d8x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85693a.m148774A0((UserPrivilege) obj);
            }
        }, new y20() { // from class: l.e8x
            @Override // p153l.y20
            public final void call(Object obj) {
                k8x.m148765f0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t0 */
    public void m148779t0(l4g0 l4g0Var, String str) {
        sfj0.C20032a c20032aM185616i;
        String strM148776p0 = m148776p0(str);
        if (TextUtils.isEmpty(this.f124421b) || !C8291a.m42842p(this.f124421b)) {
            if (gra.m131740r1()) {
                c20032aM185616i = sfj0.C20032a.m185616i("is_matched_longtimenosee", this.f124420a == 44);
            } else {
                c20032aM185616i = null;
            }
            l4g0Var.m152780o(sfj0.m185595b(sfj0.C20032a.m185615h("moments_user_id", this.f124421b), sfj0.C20032a.m185615h("match_source", strM148776p0), c20032aM185616i));
        } else {
            l4g0Var.m152780o(sfj0.m185595b(sfj0.C20032a.m185615h("other_user_id", this.f124421b)));
        }
        if (gra.m131701j2()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("match_source", strM148776p0);
                jSONObject.put("moments_user_id", this.f124421b);
                jSONObject.put("matched_received_page_type", "male");
                if (gra.m131740r1()) {
                    jSONObject.put("is_matched_longtimenosee", this.f124420a == 44 ? 1 : 0);
                }
                l4g0Var.m152780o(jSONObject);
            } catch (JSONException e) {
                CrashHelper.m82479c(e);
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m148780u0(User user) {
        C8619b.m48821r(act(), user);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m148781x0(final User user, Integer num) {
        l51.m152919y(new Runnable() { // from class: l.h8x
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.j8x
                    @Override // p153l.x20
                    public final void call() {
                        k8x.m148769j0(user);
                    }
                });
            }
        });
        qap.INSTANCE.m175967e();
        CoreModule.m30930K().pollConversation();
        l51.m152888H(act(), new Runnable() { // from class: l.i8x
            @Override // java.lang.Runnable
            public final void run() {
                this.f113380a.m148780u0(user);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m148782y0(UserPrivilege userPrivilege) {
        if (joa.m146386f4()) {
            return;
        }
        final User userById = CoreModule.m30930K().getUserById(this.f124421b);
        yie0.m216087t(act(), userById, new y20() { // from class: l.f8x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97782a.m148781x0(userById, (Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m148783z0(User user) {
        C8618a.m48771w().m48802z(act(), user);
        CoreModule.f18264c.f20337P1.f92199R.onNext(uxj0.f181467a);
        act().m68056e2();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
