package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.IntlTopPickUserIdEnvelope;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.Set;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class sbb extends dy6 {

    /* JADX INFO: renamed from: R */
    public C22507a<vg60<User>> f167126R;

    /* JADX INFO: renamed from: S */
    public Set<String> f167127S;

    /* JADX INFO: renamed from: T */
    public boolean f167128T;

    /* JADX INFO: renamed from: U */
    public String f167129U;

    public sbb(C4883c c4883c) {
        super(c4883c);
        this.f167126R = C22507a.m222758b();
        this.f167127S = new HashSet();
        this.f167128T = false;
        this.f167129U = null;
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ void m185303b3(Throwable th) {
    }

    /* JADX INFO: renamed from: j3 */
    public boolean m185311j3() {
        return NullChecker.m82486a(this.f167126R.m222761e()) && !jyb.m147479J(this.f167126R.m222761e().f184001a);
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ Set m185312k3(IntlTopPickUserIdEnvelope intlTopPickUserIdEnvelope) {
        if (NullChecker.m82486a(intlTopPickUserIdEnvelope.data) && NullChecker.m82486a(intlTopPickUserIdEnvelope.data.users)) {
            this.f167127S.addAll(intlTopPickUserIdEnvelope.data.users);
        }
        return this.f167127S;
    }

    /* JADX INFO: renamed from: l3 */
    public final /* synthetic */ C22421c m185313l3() {
        return qi20.m176659f(new pcj() { // from class: l.qbb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32335o0()).m209028b();
            }
        }, IntlTopPickUserIdEnvelope.JSON_ADAPTER).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.rbb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f162007a.m185312k3((IntlTopPickUserIdEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ Envelope m185314m3(Envelope envelope) {
        if (!jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            this.f91137Q.m32495w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ uxj0 m185315n3(Envelope envelope) {
        vg60<User> vg60Var;
        DbLinks dbLinks = new DbLinks();
        dbLinks.links = envelope.pagination.links;
        if (jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            vg60Var = vg60.m201220b();
        } else {
            dbLinks.total = envelope.pagination.total;
            vg60Var = new vg60<>(((CommonData) envelope.getModuleData(CommonData.class)).users, dbLinks);
        }
        this.f167126R.m137019l(vg60Var);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ C22421c m185316o3(final String str) {
        return qi20.m176658e(new pcj() { // from class: l.lbb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32331n0(str)).m209028b();
            }
        }).map(new qcj() { // from class: l.mbb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f135638a.m185314m3((Envelope) obj);
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.nbb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f141083a.m185315n3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public void m185317p3() {
        if (jyb.m147479J(this.f167127S)) {
            this.f91137Q.scheduled("top_picksUser_id", 0, new pcj() { // from class: l.obb
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f145963a.m185313l3();
                }
            });
        }
    }

    /* JADX INFO: renamed from: q3 */
    public C22421c<uxj0> m185318q3() {
        return m185319r3(false);
    }

    /* JADX INFO: renamed from: r3 */
    public C22421c<uxj0> m185319r3(boolean z) {
        final String strUserId = CoreModule.m30929H().userId();
        return this.f91137Q.scheduled("top_picksUser", 0, new pcj() { // from class: l.jbb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f119140a.m185316o3(strUserId);
            }
        }).doOnError(new y20() { // from class: l.kbb
            @Override // p153l.y20
            public final void call(Object obj) {
                sbb.m185303b3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public int m185320s3() {
        if (this.f167126R.m222761e() == null) {
            return 0;
        }
        return this.f167126R.m222761e().m201222d();
    }

    /* JADX INFO: renamed from: t3 */
    public C22421c<vg60<User>> m185321t3() {
        return this.f167126R.asObservable();
    }

    /* JADX INFO: renamed from: u3 */
    public void m185322u3(final String str) {
        vg60<User> vg60VarM222761e = this.f167126R.m222761e();
        if (NullChecker.m82486a(vg60VarM222761e)) {
            if (jyb.m147505e0(vg60VarM222761e.f184001a, new qcj() { // from class: l.pbb
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((User) obj).f56859id.equals(str));
                }
            })) {
                vg60VarM222761e.f184002b.total--;
            }
            this.f167126R.m137019l(vg60VarM222761e);
        }
    }
}
