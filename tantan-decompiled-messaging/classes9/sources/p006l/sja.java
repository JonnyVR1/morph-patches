package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.Picks;
import com.p1.mobile.putong.core.data.PicksUser;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import l.e30;
import l.jo0;
import l.q860;
import l.roj0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.zpd0;
import rx.c;
import rx.subjects.a;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class sja extends ax6 {

    /* JADX INFO: renamed from: R */
    public final zpd0 f21355R;

    /* JADX INFO: renamed from: S */
    public final a<q860<PicksUser>> f21356S;

    /* JADX INFO: renamed from: T */
    public final b<roj0> f21357T;

    /* JADX INFO: renamed from: U */
    public final HashSet<String> f21358U;

    /* JADX INFO: renamed from: V */
    public boolean f21359V;

    /* JADX INFO: renamed from: W */
    public String f21360W;

    /* JADX INFO: renamed from: X */
    public a<Picks> f21361X;

    public sja(C0158c c0158c) {
        super(c0158c);
        this.f21355R = new zpd0("last_privilege_banner_picks_item_clicked_time_" + CoreModule.m1850H().userId(), 0L);
        this.f21356S = a.b();
        this.f21357T = b.b();
        this.f21358U = new HashSet<>();
        this.f21359V = false;
        this.f21360W = null;
        this.f21361X = a.b();
    }

    /* JADX INFO: renamed from: B3 */
    public static int m23825B3() {
        UserPrivilege userPrivilegeM27421w4 = CoreModule.f1534c.f3544C0.m27421w4(SummarizedPrivilegesId.get("picks"));
        int iM23841r3 = m23841r3();
        return NullChecker.a(userPrivilegeM27421w4) ? iM23841r3 + userPrivilegeM27421w4.content.remaining : iM23841r3;
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ void m23828c3(List list, final Map.Entry entry) {
        vwb.d0(list, new w9j() { // from class: l.ija
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((PicksUser) obj).id, (CharSequence) entry.getKey()));
            }
        });
        CrashHelper.c(new Exception("picksUser id is not found in users : " + ((String) entry.getKey())));
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ void m23830e3(Throwable th) {
    }

    /* JADX INFO: renamed from: r3 */
    public static int m23841r3() {
        UserPrivilege userPrivilegeM27421w4 = CoreModule.f1534c.f3544C0.m27421w4(SummarizedPrivilegesId.get("freePicks"));
        if (NullChecker.a(userPrivilegeM27421w4)) {
            return userPrivilegeM27421w4.content.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: A3 */
    public c<roj0> m23842A3() {
        final String strUserId = CoreModule.m1850H().userId();
        return this.f8580Q.scheduled("picksUser", 0, new v9j() { // from class: l.jja
            public final Object call() {
                return this.f15178a.m23858x3(strUserId);
            }
        }).doOnError(new e30() { // from class: l.kja
            public final void call(Object obj) {
                sja.m23830e3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C3 */
    public c<roj0> m23843C3() {
        return this.f21357T.asObservable();
    }

    /* JADX INFO: renamed from: D3 */
    public int m23844D3() {
        if (this.f21356S.e() == null) {
            return 0;
        }
        return ((q860) this.f21356S.e()).d();
    }

    /* JADX INFO: renamed from: E3 */
    public c<q860<PicksUser>> m23845E3() {
        return this.f21356S.asObservable();
    }

    /* JADX INFO: renamed from: F3 */
    public q860<PicksUser> m23846F3() {
        return (q860) this.f21356S.e();
    }

    /* JADX INFO: renamed from: G3 */
    public void m23847G3() {
        a<q860<PicksUser>> aVar = this.f21356S;
        aVar.onNext((q860) aVar.e());
    }

    /* JADX INFO: renamed from: H3 */
    public c<roj0> m23848H3() {
        return this.f8580Q.scheduled("picks_user_info", 0, new v9j() { // from class: l.dja
            public final Object call() {
                return this.f10424a.m23860z3();
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public void m23849I3(final String str) {
        q860 q860Var = (q860) this.f21356S.e();
        if (NullChecker.a(q860Var)) {
            if (vwb.e0(q860Var.a, new w9j() { // from class: l.nja
                public final Object call(Object obj) {
                    return Boolean.valueOf(((PicksUser) obj).id.equals(str));
                }
            })) {
                q860Var.b.total--;
            }
            this.f21356S.onNext(q860Var);
        }
    }

    /* JADX INFO: renamed from: J3 */
    public void m23850J3(String str) {
        this.f21360W = str;
    }

    /* JADX INFO: renamed from: p3 */
    public boolean m23851p3(String str) {
        return TextUtils.equals(this.f21360W, str);
    }

    /* JADX INFO: renamed from: q3 */
    public void m23852q3() {
        this.f21358U.clear();
        this.f21356S.onNext((Object) null);
    }

    /* JADX INFO: renamed from: s3 */
    public c<Picks> m23853s3() {
        return this.f21361X.asObservable();
    }

    /* JADX INFO: renamed from: t3 */
    public String m23854t3(final String str) {
        q860 q860Var = (q860) this.f21356S.e();
        PicksUser picksUser = (!NullChecker.a(q860Var) || vwb.J(q860Var.a)) ? null : (PicksUser) vwb.r(q860Var.a, new w9j() { // from class: l.hja
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((PicksUser) obj).id, str));
            }
        });
        return NullChecker.a(picksUser) ? picksUser.picksTracker : "";
    }

    /* JADX INFO: renamed from: u3 */
    public boolean m23855u3() {
        return NullChecker.a(this.f21356S.e()) && !vwb.J(((q860) this.f21356S.e()).a);
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ Envelope m23856v3(Envelope envelope) {
        List list = envelope.getModuleData(CommonData.class).users;
        final List list2 = envelope.getModuleData(CoreData.class).picksUsers;
        if (!vwb.J(list2) && !vwb.J(list)) {
            final HashMap map = new HashMap(list.size() + list2.size());
            vwb.z(list2, new e30() { // from class: l.rja
                public final void call(Object obj) {
                    map.put(((PicksUser) obj).id, roj0.a);
                }
            });
            vwb.z(list, new e30() { // from class: l.eja
                public final void call(Object obj) {
                    map.remove(((DbObject) ((User) obj)).id);
                }
            });
            vwb.z(map.entrySet(), new e30() { // from class: l.fja
                public final void call(Object obj) {
                    sja.m23828c3(list2, (Map.Entry) obj);
                }
            });
        }
        if (!vwb.J(envelope.getModuleData(CommonData.class).users)) {
            this.f8580Q.m3422w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: w3 */
    public final /* synthetic */ roj0 m23857w3(Envelope envelope) {
        q860 q860Var;
        DbLinks dbLinks = new DbLinks();
        dbLinks.links = envelope.pagination.links;
        if (vwb.J(envelope.getModuleData(CoreData.class).picksUsers)) {
            q860Var = q860.b();
        } else {
            this.f21358U.clear();
            dbLinks.total = envelope.pagination.total;
            this.f21358U.addAll(vwb.Q(envelope.getModuleData(CoreData.class).picksUsers, new w9j() { // from class: l.gja
                public final Object call(Object obj) {
                    return ((PicksUser) obj).id;
                }
            }));
            q860Var = new q860(envelope.getModuleData(CoreData.class).picksUsers, dbLinks);
        }
        this.f21356S.onNext(q860Var);
        return roj0.a;
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ c m23858x3(final String str) {
        return ia20.m16571e(new v9j() { // from class: l.oja
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3287u1(str)).b();
            }
        }).map(new w9j() { // from class: l.pja
            public final Object call(Object obj) {
                return this.f19153a.m23856v3((Envelope) obj);
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.qja
            public final Object call(Object obj) {
                return this.f19852a.m23857w3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ roj0 m23859y3(Envelope envelope) {
        Picks picksNew_ = envelope.getModuleData(CoreData.class).picks == null ? Picks.new_() : envelope.getModuleData(CoreData.class).picks;
        this.f21361X.onNext(picksNew_);
        this.f21359V = picksNew_.todayPaidProps;
        return roj0.a;
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ c m23860z3() {
        return ia20.m16571e(new v9j() { // from class: l.lja
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3283t1()).b();
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.mja
            public final Object call(Object obj) {
                return this.f16998a.m23859y3((Envelope) obj);
            }
        });
    }
}
