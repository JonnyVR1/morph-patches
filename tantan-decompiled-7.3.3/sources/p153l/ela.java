package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.Picks;
import com.p051p1.mobile.putong.core.data.PicksUser;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes9.dex */
public class ela extends dy6 {

    /* JADX INFO: renamed from: R */
    public final byd0 f94495R;

    /* JADX INFO: renamed from: S */
    public final C22507a<vg60<PicksUser>> f94496S;

    /* JADX INFO: renamed from: T */
    public final C22508b<uxj0> f94497T;

    /* JADX INFO: renamed from: U */
    public final HashSet<String> f94498U;

    /* JADX INFO: renamed from: V */
    public boolean f94499V;

    /* JADX INFO: renamed from: W */
    public String f94500W;

    /* JADX INFO: renamed from: X */
    public C22507a<Picks> f94501X;

    public ela(C4883c c4883c) {
        super(c4883c);
        this.f94495R = new byd0("last_privilege_banner_picks_item_clicked_time_" + CoreModule.m30929H().userId(), 0L);
        this.f94496S = C22507a.m222758b();
        this.f94497T = C22508b.m222767b();
        this.f94498U = new HashSet<>();
        this.f94499V = false;
        this.f94500W = null;
        this.f94501X = C22507a.m222758b();
    }

    /* JADX INFO: renamed from: B3 */
    public static int m121106B3() {
        UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get("picks"));
        int iM121122r3 = m121122r3();
        return NullChecker.m82486a(userPrivilegeM146426x4) ? iM121122r3 + userPrivilegeM146426x4.content.remaining : iM121122r3;
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ void m121109c3(List list, final Map.Entry entry) {
        jyb.m147503d0(list, new qcj() { // from class: l.uka
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((PicksUser) obj).f21210id, (CharSequence) entry.getKey()));
            }
        });
        CrashHelper.m82479c(new Exception("picksUser id is not found in users : " + ((String) entry.getKey())));
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ void m121111e3(Throwable th) {
    }

    /* JADX INFO: renamed from: r3 */
    public static int m121122r3() {
        UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.freePicks));
        if (NullChecker.m82486a(userPrivilegeM146426x4)) {
            return userPrivilegeM146426x4.content.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: A3 */
    public C22421c<uxj0> m121123A3() {
        final String strUserId = CoreModule.m30929H().userId();
        return this.f91137Q.scheduled("picksUser", 0, new pcj() { // from class: l.vka
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f184470a.m121139x3(strUserId);
            }
        }).doOnError(new y20() { // from class: l.wka
            @Override // p153l.y20
            public final void call(Object obj) {
                ela.m121111e3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C3 */
    public C22421c<uxj0> m121124C3() {
        return this.f94497T.asObservable();
    }

    /* JADX INFO: renamed from: D3 */
    public int m121125D3() {
        if (this.f94496S.m222761e() == null) {
            return 0;
        }
        return this.f94496S.m222761e().m201222d();
    }

    /* JADX INFO: renamed from: E3 */
    public C22421c<vg60<PicksUser>> m121126E3() {
        return this.f94496S.asObservable();
    }

    /* JADX INFO: renamed from: F3 */
    public vg60<PicksUser> m121127F3() {
        return this.f94496S.m222761e();
    }

    /* JADX INFO: renamed from: G3 */
    public void m121128G3() {
        C22507a<vg60<PicksUser>> c22507a = this.f94496S;
        c22507a.m137019l(c22507a.m222761e());
    }

    /* JADX INFO: renamed from: H3 */
    public C22421c<uxj0> m121129H3() {
        return this.f91137Q.scheduled("picks_user_info", 0, new pcj() { // from class: l.pka
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f152818a.m121141z3();
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public void m121130I3(final String str) {
        vg60<PicksUser> vg60VarM222761e = this.f94496S.m222761e();
        if (NullChecker.m82486a(vg60VarM222761e)) {
            if (jyb.m147505e0(vg60VarM222761e.f184001a, new qcj() { // from class: l.zka
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((PicksUser) obj).f21210id.equals(str));
                }
            })) {
                vg60VarM222761e.f184002b.total--;
            }
            this.f94496S.m137019l(vg60VarM222761e);
        }
    }

    /* JADX INFO: renamed from: J3 */
    public void m121131J3(String str) {
        this.f94500W = str;
    }

    /* JADX INFO: renamed from: p3 */
    public boolean m121132p3(String str) {
        return TextUtils.equals(this.f94500W, str);
    }

    /* JADX INFO: renamed from: q3 */
    public void m121133q3() {
        this.f94498U.clear();
        this.f94496S.m137019l(null);
    }

    /* JADX INFO: renamed from: s3 */
    public C22421c<Picks> m121134s3() {
        return this.f94501X.asObservable();
    }

    /* JADX INFO: renamed from: t3 */
    public String m121135t3(final String str) {
        vg60<PicksUser> vg60VarM222761e = this.f94496S.m222761e();
        PicksUser picksUser = (!NullChecker.m82486a(vg60VarM222761e) || jyb.m147479J(vg60VarM222761e.f184001a)) ? null : (PicksUser) jyb.m147529r(vg60VarM222761e.f184001a, new qcj() { // from class: l.tka
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((PicksUser) obj).f21210id, str));
            }
        });
        return NullChecker.m82486a(picksUser) ? picksUser.picksTracker : "";
    }

    /* JADX INFO: renamed from: u3 */
    public boolean m121136u3() {
        return NullChecker.m82486a(this.f94496S.m222761e()) && !jyb.m147479J(this.f94496S.m222761e().f184001a);
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ Envelope m121137v3(Envelope envelope) {
        List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
        final List<PicksUser> list2 = ((CoreData) envelope.getModuleData(CoreData.class)).picksUsers;
        if (!jyb.m147479J(list2) && !jyb.m147479J(list)) {
            final HashMap map = new HashMap(list.size() + list2.size());
            jyb.m147537z(list2, new y20() { // from class: l.dla
                @Override // p153l.y20
                public final void call(Object obj) {
                    map.put(((PicksUser) obj).f21210id, uxj0.f181467a);
                }
            });
            jyb.m147537z(list, new y20() { // from class: l.qka
                @Override // p153l.y20
                public final void call(Object obj) {
                    map.remove(((User) obj).f56859id);
                }
            });
            jyb.m147537z(map.entrySet(), new y20() { // from class: l.rka
                @Override // p153l.y20
                public final void call(Object obj) {
                    ela.m121109c3(list2, (Map.Entry) obj);
                }
            });
        }
        if (!jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            this.f91137Q.m32495w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: w3 */
    public final /* synthetic */ uxj0 m121138w3(Envelope envelope) {
        vg60<PicksUser> vg60Var;
        DbLinks dbLinks = new DbLinks();
        dbLinks.links = envelope.pagination.links;
        if (jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).picksUsers)) {
            vg60Var = vg60.m201220b();
        } else {
            this.f94498U.clear();
            dbLinks.total = envelope.pagination.total;
            this.f94498U.addAll(jyb.m147486Q(((CoreData) envelope.getModuleData(CoreData.class)).picksUsers, new qcj() { // from class: l.ska
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((PicksUser) obj).f21210id;
                }
            }));
            vg60Var = new vg60<>(((CoreData) envelope.getModuleData(CoreData.class)).picksUsers, dbLinks);
        }
        this.f94496S.m137019l(vg60Var);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ C22421c m121139x3(final String str) {
        return qi20.m176658e(new pcj() { // from class: l.ala
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32360u1(str)).m209028b();
            }
        }).map(new qcj() { // from class: l.bla
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f77177a.m121137v3((Envelope) obj);
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.cla
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f82355a.m121138w3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ uxj0 m121140y3(Envelope envelope) {
        Picks picksNew_ = ((CoreData) envelope.getModuleData(CoreData.class)).picks == null ? Picks.new_() : ((CoreData) envelope.getModuleData(CoreData.class)).picks;
        this.f94501X.m137019l(picksNew_);
        this.f94499V = picksNew_.todayPaidProps;
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ C22421c m121141z3() {
        return qi20.m176658e(new pcj() { // from class: l.xka
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32356t1()).m209028b();
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.yka
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f200381a.m121140y3((Envelope) obj);
            }
        });
    }
}
