package p153l;

import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.IntlVisitor;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class cd9 extends dy6 {

    /* JADX INFO: renamed from: R */
    public int f81113R;

    /* JADX INFO: renamed from: S */
    public int f81114S;

    /* JADX INFO: renamed from: T */
    public HashMap<String, User> f81115T;

    /* JADX INFO: renamed from: U */
    public HashSet<String> f81116U;

    /* JADX INFO: renamed from: V */
    public C22507a<pf60<List<IntlVisitor>, Boolean>> f81117V;

    /* JADX INFO: renamed from: W */
    public C22507a<Integer> f81118W;

    /* JADX INFO: renamed from: X */
    public C22507a<Integer> f81119X;

    public cd9(C4883c c4883c) {
        super(c4883c);
        this.f81113R = 1;
        this.f81114S = 20;
        this.f81115T = new HashMap<>();
        this.f81116U = new HashSet<>();
        this.f81117V = C22507a.m222758b();
        this.f81118W = C22507a.m222758b();
        this.f81119X = C22507a.m222758b();
    }

    /* JADX INFO: renamed from: A3 */
    public final /* synthetic */ C22421c m109145A3() {
        return new ti20(new pcj() { // from class: l.uc9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32359u0()).m209032f().m209028b();
            }
        }).compose(C4879a.m32255T2()).map(new qcj() { // from class: l.vc9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f183348a.m109146B3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ uxj0 m109146B3(Envelope envelope) {
        this.f81118W.m137019l(Integer.valueOf(((CoreData) envelope.getModuleData(CoreData.class)).count));
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: C3 */
    public C22421c<uxj0> m109147C3() {
        final String str = "pageNum=" + this.f81113R + "&limit=" + this.f81114S;
        return this.f91137Q.scheduled(LikeFrom.intl_visitor + CoreModule.m30929H().userId(), 0, new pcj() { // from class: l.xc9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f193276a.m109161x3(str);
            }
        });
    }

    /* JADX INFO: renamed from: D3 */
    public void m109148D3(String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("targetId", str);
        } catch (JSONException e) {
            App.f16087d.m21432k(e);
        }
        scheduled("intl_visitor_access", -1, new pcj() { // from class: l.mc9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ti20(new pcj() { // from class: l.wc9
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32351s0()).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
                    }
                }).compose(C4879a.m32255T2());
            }
        });
    }

    /* JADX INFO: renamed from: E3 */
    public C22421c<uxj0> m109149E3() {
        return scheduled("intl_visitor_all_count", 0, new pcj() { // from class: l.yc9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f198396a.m109163z3();
            }
        });
    }

    /* JADX INFO: renamed from: F3 */
    public Integer m109150F3() {
        return this.f81119X.m222761e();
    }

    /* JADX INFO: renamed from: G3 */
    public C22421c<uxj0> m109151G3() {
        if (CoreModule.f18264c.f20414p0.m219062g3()) {
            m109149E3();
        }
        return scheduled("intl_visitor_count", 0, new pcj() { // from class: l.tc9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f173216a.m109145A3();
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public C22421c<Integer> m109152H3() {
        return this.f81118W.asObservable();
    }

    /* JADX INFO: renamed from: I3 */
    public C22421c<pf60<List<IntlVisitor>, Boolean>> m109153I3() {
        return this.f81117V.asObservable();
    }

    /* JADX INFO: renamed from: q3 */
    public void m109154q3() {
        this.f81113R = 1;
        this.f81115T.clear();
        this.f81116U.clear();
        this.f81117V.m137019l(null);
    }

    /* JADX INFO: renamed from: r3 */
    public boolean m109155r3() {
        return NullChecker.m82486a(this.f81117V.m222761e()) && !jyb.m147479J(this.f81117V.m222761e().f152156a);
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ Envelope m109156s3(Envelope envelope) {
        if (!jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            this.f91137Q.m32495w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ void m109157t3(User user) {
        this.f81115T.put(user.f56859id, user);
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ void m109158u3(List list, List list2, IntlVisitor intlVisitor) {
        User user = this.f81115T.get(intlVisitor.f21172id);
        if (this.f81116U.contains(intlVisitor.f21172id) || !NullChecker.m82486a(user) || user.isBanedOrInactivated()) {
            return;
        }
        this.f81116U.add(intlVisitor.f21172id);
        if (this.f81113R > 1) {
            list.add(intlVisitor);
        } else {
            list2.add(intlVisitor);
        }
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ Boolean m109159v3(IntlVisitor intlVisitor) {
        User user = this.f81115T.get(intlVisitor.f21172id);
        return Boolean.valueOf(NullChecker.m82486a(user) && !user.isBanedOrInactivated());
    }

    /* JADX INFO: renamed from: w3 */
    public final /* synthetic */ uxj0 m109160w3(Envelope envelope) {
        final List listM147522n;
        this.f81115T.clear();
        List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
        ArrayList arrayList = new ArrayList();
        List<IntlVisitor> list2 = ((CoreData) envelope.getModuleData(CoreData.class)).intlVisitorInfo;
        if (NullChecker.m82486a(list)) {
            jyb.m147537z(list, new y20() { // from class: l.pc9
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f151541a.m109157t3((User) obj);
                }
            });
        }
        if (this.f81115T.isEmpty()) {
            this.f81117V.m137019l(new pf60<>(arrayList, Boolean.FALSE));
            return uxj0.f181467a;
        }
        Boolean boolValueOf = Boolean.valueOf(((CoreData) envelope.getModuleData(CoreData.class)).next);
        if (NullChecker.m82486a(this.f81117V.m222761e()) && !this.f81116U.isEmpty() && !jyb.m147479J(list2)) {
            listM147522n = this.f81117V.m222761e().f152156a;
            final ArrayList arrayList2 = new ArrayList();
            jyb.m147537z(list2, new y20() { // from class: l.qc9
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f156561a.m109158u3(listM147522n, arrayList2, (IntlVisitor) obj);
                }
            });
            if (arrayList2.size() > 0) {
                listM147522n.addAll(0, arrayList2);
            }
            this.f81113R++;
        } else {
            if (NullChecker.m82486a(this.f81117V.m222761e()) && !this.f81116U.isEmpty() && jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
                return uxj0.f181467a;
            }
            if (NullChecker.m82486a(this.f81117V.m222761e()) && this.f81116U.isEmpty() && jyb.m147479J(list2)) {
                listM147522n = new ArrayList();
            } else {
                this.f81116U.addAll(jyb.m147486Q(list2, new qcj() { // from class: l.rc9
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((IntlVisitor) obj).f21172id;
                    }
                }));
                listM147522n = jyb.m147522n(list2, new qcj() { // from class: l.sc9
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return this.f167203a.m109159v3((IntlVisitor) obj);
                    }
                });
            }
        }
        this.f81117V.m137019l(new pf60<>(listM147522n, boolValueOf));
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ C22421c m109161x3(final String str) {
        return qi20.m176658e(new pcj() { // from class: l.zc9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32347r0(str)).m209028b();
            }
        }).map(new qcj() { // from class: l.ad9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f69797a.m109156s3((Envelope) obj);
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.bd9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f76232a.m109160w3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ uxj0 m109162y3(Envelope envelope) {
        this.f81119X.m137019l(Integer.valueOf(((CoreData) envelope.getModuleData(CoreData.class)).visitorAllCount));
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ C22421c m109163z3() {
        return new ti20(new pcj() { // from class: l.nc9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32355t0()).m209032f().m209028b();
            }
        }).compose(C4879a.m32255T2()).map(new qcj() { // from class: l.oc9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f146667a.m109162y3((Envelope) obj);
            }
        });
    }
}
