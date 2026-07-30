package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.IntlTopPickUserIdEnvelope;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.Set;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class fab extends ax6 {

    /* JADX INFO: renamed from: R */
    public C22392a<q860<User>> f96585R;

    /* JADX INFO: renamed from: S */
    public Set<String> f96586S;

    /* JADX INFO: renamed from: T */
    public boolean f96587T;

    /* JADX INFO: renamed from: U */
    public String f96588U;

    public fab(C4732c c4732c) {
        super(c4732c);
        this.f96585R = C22392a.m221512b();
        this.f96586S = new HashSet();
        this.f96587T = false;
        this.f96588U = null;
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ void m120164b3(Throwable th) {
    }

    /* JADX INFO: renamed from: j3 */
    public boolean m120172j3() {
        return NullChecker.m81303a(this.f96585R.m221515e()) && !vwb.m200296J(this.f96585R.m221515e().f153135a);
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ Set m120173k3(IntlTopPickUserIdEnvelope intlTopPickUserIdEnvelope) {
        if (NullChecker.m81303a(intlTopPickUserIdEnvelope.data) && NullChecker.m81303a(intlTopPickUserIdEnvelope.data.users)) {
            this.f96586S.addAll(intlTopPickUserIdEnvelope.data.users);
        }
        return this.f96586S;
    }

    /* JADX INFO: renamed from: l3 */
    public final /* synthetic */ C22306c m120174l3() {
        return ia20.m135122f(new v9j() { // from class: l.dab
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31332o0()).m185883b();
            }
        }, IntlTopPickUserIdEnvelope.JSON_ADAPTER).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.eab
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f90186a.m120173k3((IntlTopPickUserIdEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ Envelope m120175m3(Envelope envelope) {
        if (!vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            this.f72126Q.m31492w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ roj0 m120176n3(Envelope envelope) {
        q860<User> q860Var;
        DbLinks dbLinks = new DbLinks();
        dbLinks.links = envelope.pagination.links;
        if (vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            q860Var = q860.m173342b();
        } else {
            dbLinks.total = envelope.pagination.total;
            q860Var = new q860<>(((CommonData) envelope.getModuleData(CommonData.class)).users, dbLinks);
        }
        this.f96585R.m132487l(q860Var);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ C22306c m120177o3(final String str) {
        return ia20.m135121e(new v9j() { // from class: l.y9b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31328n0(str)).m185883b();
            }
        }).map(new w9j() { // from class: l.z9b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f202283a.m120175m3((Envelope) obj);
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.aab
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f68287a.m120176n3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public void m120178p3() {
        if (vwb.m200296J(this.f96586S)) {
            this.f72126Q.scheduled("top_picksUser_id", 0, new v9j() { // from class: l.bab
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f74668a.m120174l3();
                }
            });
        }
    }

    /* JADX INFO: renamed from: q3 */
    public C22306c<roj0> m120179q3() {
        return m120180r3(false);
    }

    /* JADX INFO: renamed from: r3 */
    public C22306c<roj0> m120180r3(boolean z) {
        final String strUserId = CoreModule.m29931H().userId();
        return this.f72126Q.scheduled("top_picksUser", 0, new v9j() { // from class: l.w9b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f185329a.m120177o3(strUserId);
            }
        }).doOnError(new e30() { // from class: l.x9b
            @Override // p149l.e30
            public final void call(Object obj) {
                fab.m120164b3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public int m120181s3() {
        if (this.f96585R.m221515e() == null) {
            return 0;
        }
        return this.f96585R.m221515e().m173344d();
    }

    /* JADX INFO: renamed from: t3 */
    public C22306c<q860<User>> m120182t3() {
        return this.f96585R.asObservable();
    }

    /* JADX INFO: renamed from: u3 */
    public void m120183u3(final String str) {
        q860<User> q860VarM221515e = this.f96585R.m221515e();
        if (NullChecker.m81303a(q860VarM221515e)) {
            if (vwb.m200322e0(q860VarM221515e.f153135a, new w9j() { // from class: l.cab
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((User) obj).f56011id.equals(str));
                }
            })) {
                q860VarM221515e.f153136b.total--;
            }
            this.f96585R.m132487l(q860VarM221515e);
        }
    }
}
