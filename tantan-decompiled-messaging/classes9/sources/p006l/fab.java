package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.IntlTopPickUserIdEnvelope;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.Set;
import l.e30;
import l.jo0;
import l.q860;
import l.roj0;
import l.v9j;
import l.vwb;
import l.w9j;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class fab extends ax6 {

    /* JADX INFO: renamed from: R */
    public a<q860<User>> f12616R;

    /* JADX INFO: renamed from: S */
    public Set<String> f12617S;

    /* JADX INFO: renamed from: T */
    public boolean f12618T;

    /* JADX INFO: renamed from: U */
    public String f12619U;

    public fab(C0158c c0158c) {
        super(c0158c);
        this.f12616R = a.b();
        this.f12617S = new HashSet();
        this.f12618T = false;
        this.f12619U = null;
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ void m15250b3(Throwable th) {
    }

    /* JADX INFO: renamed from: j3 */
    public boolean m15258j3() {
        return NullChecker.a(this.f12616R.e()) && !vwb.J(((q860) this.f12616R.e()).a);
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ Set m15259k3(IntlTopPickUserIdEnvelope intlTopPickUserIdEnvelope) {
        if (NullChecker.a(intlTopPickUserIdEnvelope.data) && NullChecker.a(intlTopPickUserIdEnvelope.data.users)) {
            this.f12617S.addAll(intlTopPickUserIdEnvelope.data.users);
        }
        return this.f12617S;
    }

    /* JADX INFO: renamed from: l3 */
    public final /* synthetic */ c m15260l3() {
        return ia20.m16572f(new v9j() { // from class: l.dab
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3262o0()).b();
            }
        }, IntlTopPickUserIdEnvelope.JSON_ADAPTER).observeOn(jo0.a()).map(new w9j() { // from class: l.eab
            public final Object call(Object obj) {
                return this.f11031a.m15259k3((IntlTopPickUserIdEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ Envelope m15261m3(Envelope envelope) {
        if (!vwb.J(envelope.getModuleData(CommonData.class).users)) {
            this.f8580Q.m3422w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ roj0 m15262n3(Envelope envelope) {
        q860 q860Var;
        DbLinks dbLinks = new DbLinks();
        dbLinks.links = envelope.pagination.links;
        if (vwb.J(envelope.getModuleData(CommonData.class).users)) {
            q860Var = q860.b();
        } else {
            dbLinks.total = envelope.pagination.total;
            q860Var = new q860(envelope.getModuleData(CommonData.class).users, dbLinks);
        }
        this.f12616R.onNext(q860Var);
        return roj0.a;
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ c m15263o3(final String str) {
        return ia20.m16571e(new v9j() { // from class: l.y9b
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3258n0(str)).b();
            }
        }).map(new w9j() { // from class: l.z9b
            public final Object call(Object obj) {
                return this.f28677a.m15261m3((Envelope) obj);
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.aab
            public final Object call(Object obj) {
                return this.f8176a.m15262n3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public void m15264p3() {
        if (vwb.J(this.f12617S)) {
            this.f8580Q.scheduled("top_picksUser_id", 0, new v9j() { // from class: l.bab
                public final Object call() {
                    return this.f8791a.m15260l3();
                }
            });
        }
    }

    /* JADX INFO: renamed from: q3 */
    public c<roj0> m15265q3() {
        return m15266r3(false);
    }

    /* JADX INFO: renamed from: r3 */
    public c<roj0> m15266r3(boolean z) {
        final String strUserId = CoreModule.m1850H().userId();
        return this.f8580Q.scheduled("top_picksUser", 0, new v9j() { // from class: l.w9b
            public final Object call() {
                return this.f25048a.m15263o3(strUserId);
            }
        }).doOnError(new e30() { // from class: l.x9b
            public final void call(Object obj) {
                fab.m15250b3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public int m15267s3() {
        if (this.f12616R.e() == null) {
            return 0;
        }
        return ((q860) this.f12616R.e()).d();
    }

    /* JADX INFO: renamed from: t3 */
    public c<q860<User>> m15268t3() {
        return this.f12616R.asObservable();
    }

    /* JADX INFO: renamed from: u3 */
    public void m15269u3(final String str) {
        q860 q860Var = (q860) this.f12616R.e();
        if (NullChecker.a(q860Var)) {
            if (vwb.e0(q860Var.a, new w9j() { // from class: l.cab
                public final Object call(Object obj) {
                    return Boolean.valueOf(((DbObject) ((User) obj)).id.equals(str));
                }
            })) {
                q860Var.b.total--;
            }
            this.f12616R.onNext(q860Var);
        }
    }
}
