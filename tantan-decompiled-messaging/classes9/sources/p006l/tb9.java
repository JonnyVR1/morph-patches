package p006l;

import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.IntlVisitor;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import l.e30;
import l.j760;
import l.jo0;
import l.roj0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class tb9 extends ax6 {

    /* JADX INFO: renamed from: R */
    public int f21988R;

    /* JADX INFO: renamed from: S */
    public int f21989S;

    /* JADX INFO: renamed from: T */
    public HashMap<String, User> f21990T;

    /* JADX INFO: renamed from: U */
    public HashSet<String> f21991U;

    /* JADX INFO: renamed from: V */
    public a<j760<List<IntlVisitor>, Boolean>> f21992V;

    /* JADX INFO: renamed from: W */
    public a<Integer> f21993W;

    /* JADX INFO: renamed from: X */
    public a<Integer> f21994X;

    public tb9(C0158c c0158c) {
        super(c0158c);
        this.f21988R = 1;
        this.f21989S = 20;
        this.f21990T = new HashMap<>();
        this.f21991U = new HashSet<>();
        this.f21992V = a.b();
        this.f21993W = a.b();
        this.f21994X = a.b();
    }

    /* JADX INFO: renamed from: A3 */
    public final /* synthetic */ c m24580A3() {
        return new la20(new v9j() { // from class: l.lb9
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3286u0()).f().b();
            }
        }).compose(C0154a.m3182T2()).map(new w9j() { // from class: l.mb9
            public final Object call(Object obj) {
                return this.f16887a.m24581B3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ roj0 m24581B3(Envelope envelope) {
        this.f21993W.onNext(Integer.valueOf(envelope.getModuleData(CoreData.class).count));
        return roj0.a;
    }

    /* JADX INFO: renamed from: C3 */
    public c<roj0> m24582C3() {
        final String str = "pageNum=" + this.f21988R + "&limit=" + this.f21989S;
        return this.f8580Q.scheduled("intl_visitor" + CoreModule.m1850H().userId(), 0, new v9j() { // from class: l.ob9
            public final Object call() {
                return this.f18130a.m24596x3(str);
            }
        });
    }

    /* JADX INFO: renamed from: D3 */
    public void m24583D3(String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("targetId", str);
        } catch (JSONException e) {
            App.d.k(e);
        }
        scheduled("intl_visitor_access", -1, new v9j() { // from class: l.db9
            public final Object call() {
                return new la20(new v9j() { // from class: l.nb9
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3278s0()).l(utc0.create(Network.JSON, jSONObject.toString())).b();
                    }
                }).compose(C0154a.m3182T2());
            }
        });
    }

    /* JADX INFO: renamed from: E3 */
    public c<roj0> m24584E3() {
        return scheduled("intl_visitor_all_count", 0, new v9j() { // from class: l.pb9
            public final Object call() {
                return this.f18666a.m24598z3();
            }
        });
    }

    /* JADX INFO: renamed from: F3 */
    public Integer m24585F3() {
        return (Integer) this.f21994X.e();
    }

    /* JADX INFO: renamed from: G3 */
    public c<roj0> m24586G3() {
        if (CoreModule.f1534c.f3661p0.m21963g3()) {
            m24584E3();
        }
        return scheduled("intl_visitor_count", 0, new v9j() { // from class: l.kb9
            public final Object call() {
                return this.f15685a.m24580A3();
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public c<Integer> m24587H3() {
        return this.f21993W.asObservable();
    }

    /* JADX INFO: renamed from: I3 */
    public c<j760<List<IntlVisitor>, Boolean>> m24588I3() {
        return this.f21992V.asObservable();
    }

    /* JADX INFO: renamed from: q3 */
    public void m24589q3() {
        this.f21988R = 1;
        this.f21990T.clear();
        this.f21991U.clear();
        this.f21992V.onNext((Object) null);
    }

    /* JADX INFO: renamed from: r3 */
    public boolean m24590r3() {
        return NullChecker.a(this.f21992V.e()) && !vwb.J((Collection) ((j760) this.f21992V.e()).a);
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ Envelope m24591s3(Envelope envelope) {
        if (!vwb.J(envelope.getModuleData(CommonData.class).users)) {
            this.f8580Q.m3422w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ void m24592t3(User user) {
        this.f21990T.put(((DbObject) user).id, user);
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ void m24593u3(List list, List list2, IntlVisitor intlVisitor) {
        User user = this.f21990T.get(intlVisitor.id);
        if (this.f21991U.contains(intlVisitor.id) || !NullChecker.a(user) || user.isBanedOrInactivated()) {
            return;
        }
        this.f21991U.add(intlVisitor.id);
        if (this.f21988R > 1) {
            list.add(intlVisitor);
        } else {
            list2.add(intlVisitor);
        }
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ Boolean m24594v3(IntlVisitor intlVisitor) {
        User user = this.f21990T.get(intlVisitor.id);
        return Boolean.valueOf(NullChecker.a(user) && !user.isBanedOrInactivated());
    }

    /* JADX INFO: renamed from: w3 */
    public final /* synthetic */ roj0 m24595w3(Envelope envelope) {
        final List listN;
        this.f21990T.clear();
        List list = envelope.getModuleData(CommonData.class).users;
        ArrayList arrayList = new ArrayList();
        List list2 = envelope.getModuleData(CoreData.class).intlVisitorInfo;
        if (NullChecker.a(list)) {
            vwb.z(list, new e30() { // from class: l.gb9
                public final void call(Object obj) {
                    this.f13201a.m24592t3((User) obj);
                }
            });
        }
        if (this.f21990T.isEmpty()) {
            this.f21992V.onNext(new j760(arrayList, Boolean.FALSE));
            return roj0.a;
        }
        Boolean boolValueOf = Boolean.valueOf(envelope.getModuleData(CoreData.class).next);
        if (NullChecker.a(this.f21992V.e()) && !this.f21991U.isEmpty() && !vwb.J(list2)) {
            listN = (List) ((j760) this.f21992V.e()).a;
            final ArrayList arrayList2 = new ArrayList();
            vwb.z(list2, new e30() { // from class: l.hb9
                public final void call(Object obj) {
                    this.f13782a.m24593u3(listN, arrayList2, (IntlVisitor) obj);
                }
            });
            if (arrayList2.size() > 0) {
                listN.addAll(0, arrayList2);
            }
            this.f21988R++;
        } else {
            if (NullChecker.a(this.f21992V.e()) && !this.f21991U.isEmpty() && vwb.J(envelope.getModuleData(CommonData.class).users)) {
                return roj0.a;
            }
            if (NullChecker.a(this.f21992V.e()) && this.f21991U.isEmpty() && vwb.J(list2)) {
                listN = new ArrayList();
            } else {
                this.f21991U.addAll(vwb.Q(list2, new w9j() { // from class: l.ib9
                    public final Object call(Object obj) {
                        return ((IntlVisitor) obj).id;
                    }
                }));
                listN = vwb.n(list2, new w9j() { // from class: l.jb9
                    public final Object call(Object obj) {
                        return this.f15100a.m24594v3((IntlVisitor) obj);
                    }
                });
            }
        }
        this.f21992V.onNext(new j760(listN, boolValueOf));
        return roj0.a;
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ c m24596x3(final String str) {
        return ia20.m16571e(new v9j() { // from class: l.qb9
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3274r0(str)).b();
            }
        }).map(new w9j() { // from class: l.rb9
            public final Object call(Object obj) {
                return this.f20473a.m24591s3((Envelope) obj);
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.sb9
            public final Object call(Object obj) {
                return this.f21236a.m24595w3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ roj0 m24597y3(Envelope envelope) {
        this.f21994X.onNext(Integer.valueOf(envelope.getModuleData(CoreData.class).visitorAllCount));
        return roj0.a;
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ c m24598z3() {
        return new la20(new v9j() { // from class: l.eb9
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3282t0()).f().b();
            }
        }).compose(C0154a.m3182T2()).map(new w9j() { // from class: l.fb9
            public final Object call(Object obj) {
                return this.f12635a.m24597y3((Envelope) obj);
            }
        });
    }
}
