package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.Picks;
import com.p046p1.mobile.putong.core.data.PicksUser;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes9.dex */
public class sja extends ax6 {

    /* JADX INFO: renamed from: R */
    public final zpd0 f164817R;

    /* JADX INFO: renamed from: S */
    public final C22392a<q860<PicksUser>> f164818S;

    /* JADX INFO: renamed from: T */
    public final C22393b<roj0> f164819T;

    /* JADX INFO: renamed from: U */
    public final HashSet<String> f164820U;

    /* JADX INFO: renamed from: V */
    public boolean f164821V;

    /* JADX INFO: renamed from: W */
    public String f164822W;

    /* JADX INFO: renamed from: X */
    public C22392a<Picks> f164823X;

    public sja(C4732c c4732c) {
        super(c4732c);
        this.f164817R = new zpd0("last_privilege_banner_picks_item_clicked_time_" + CoreModule.m29931H().userId(), 0L);
        this.f164818S = C22392a.m221512b();
        this.f164819T = C22393b.m221521b();
        this.f164820U = new HashSet<>();
        this.f164821V = false;
        this.f164822W = null;
        this.f164823X = C22392a.m221512b();
    }

    /* JADX INFO: renamed from: B3 */
    public static int m184445B3() {
        UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get("picks"));
        int iM184461r3 = m184461r3();
        return NullChecker.m81303a(userPrivilegeM210113w4) ? iM184461r3 + userPrivilegeM210113w4.content.remaining : iM184461r3;
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ void m184448c3(List list, final Map.Entry entry) {
        vwb.m200320d0(list, new w9j() { // from class: l.ija
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((PicksUser) obj).f20468id, (CharSequence) entry.getKey()));
            }
        });
        CrashHelper.m81296c(new Exception("picksUser id is not found in users : " + ((String) entry.getKey())));
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ void m184450e3(Throwable th) {
    }

    /* JADX INFO: renamed from: r3 */
    public static int m184461r3() {
        UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.freePicks));
        if (NullChecker.m81303a(userPrivilegeM210113w4)) {
            return userPrivilegeM210113w4.content.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: A3 */
    public C22306c<roj0> m184462A3() {
        final String strUserId = CoreModule.m29931H().userId();
        return this.f72126Q.scheduled("picksUser", 0, new v9j() { // from class: l.jja
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f118251a.m184478x3(strUserId);
            }
        }).doOnError(new e30() { // from class: l.kja
            @Override // p149l.e30
            public final void call(Object obj) {
                sja.m184450e3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C3 */
    public C22306c<roj0> m184463C3() {
        return this.f164819T.asObservable();
    }

    /* JADX INFO: renamed from: D3 */
    public int m184464D3() {
        if (this.f164818S.m221515e() == null) {
            return 0;
        }
        return this.f164818S.m221515e().m173344d();
    }

    /* JADX INFO: renamed from: E3 */
    public C22306c<q860<PicksUser>> m184465E3() {
        return this.f164818S.asObservable();
    }

    /* JADX INFO: renamed from: F3 */
    public q860<PicksUser> m184466F3() {
        return this.f164818S.m221515e();
    }

    /* JADX INFO: renamed from: G3 */
    public void m184467G3() {
        C22392a<q860<PicksUser>> c22392a = this.f164818S;
        c22392a.m132487l(c22392a.m221515e());
    }

    /* JADX INFO: renamed from: H3 */
    public C22306c<roj0> m184468H3() {
        return this.f72126Q.scheduled("picks_user_info", 0, new v9j() { // from class: l.dja
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f86511a.m184480z3();
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public void m184469I3(final String str) {
        q860<PicksUser> q860VarM221515e = this.f164818S.m221515e();
        if (NullChecker.m81303a(q860VarM221515e)) {
            if (vwb.m200322e0(q860VarM221515e.f153135a, new w9j() { // from class: l.nja
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((PicksUser) obj).f20468id.equals(str));
                }
            })) {
                q860VarM221515e.f153136b.total--;
            }
            this.f164818S.m132487l(q860VarM221515e);
        }
    }

    /* JADX INFO: renamed from: J3 */
    public void m184470J3(String str) {
        this.f164822W = str;
    }

    /* JADX INFO: renamed from: p3 */
    public boolean m184471p3(String str) {
        return TextUtils.equals(this.f164822W, str);
    }

    /* JADX INFO: renamed from: q3 */
    public void m184472q3() {
        this.f164820U.clear();
        this.f164818S.m132487l(null);
    }

    /* JADX INFO: renamed from: s3 */
    public C22306c<Picks> m184473s3() {
        return this.f164823X.asObservable();
    }

    /* JADX INFO: renamed from: t3 */
    public String m184474t3(final String str) {
        q860<PicksUser> q860VarM221515e = this.f164818S.m221515e();
        PicksUser picksUser = (!NullChecker.m81303a(q860VarM221515e) || vwb.m200296J(q860VarM221515e.f153135a)) ? null : (PicksUser) vwb.m200346r(q860VarM221515e.f153135a, new w9j() { // from class: l.hja
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((PicksUser) obj).f20468id, str));
            }
        });
        return NullChecker.m81303a(picksUser) ? picksUser.picksTracker : "";
    }

    /* JADX INFO: renamed from: u3 */
    public boolean m184475u3() {
        return NullChecker.m81303a(this.f164818S.m221515e()) && !vwb.m200296J(this.f164818S.m221515e().f153135a);
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ Envelope m184476v3(Envelope envelope) {
        List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
        final List<PicksUser> list2 = ((CoreData) envelope.getModuleData(CoreData.class)).picksUsers;
        if (!vwb.m200296J(list2) && !vwb.m200296J(list)) {
            final HashMap map = new HashMap(list.size() + list2.size());
            vwb.m200354z(list2, new e30() { // from class: l.rja
                @Override // p149l.e30
                public final void call(Object obj) {
                    map.put(((PicksUser) obj).f20468id, roj0.f160388a);
                }
            });
            vwb.m200354z(list, new e30() { // from class: l.eja
                @Override // p149l.e30
                public final void call(Object obj) {
                    map.remove(((User) obj).f56011id);
                }
            });
            vwb.m200354z(map.entrySet(), new e30() { // from class: l.fja
                @Override // p149l.e30
                public final void call(Object obj) {
                    sja.m184448c3(list2, (Map.Entry) obj);
                }
            });
        }
        if (!vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            this.f72126Q.m31492w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: w3 */
    public final /* synthetic */ roj0 m184477w3(Envelope envelope) {
        q860<PicksUser> q860Var;
        DbLinks dbLinks = new DbLinks();
        dbLinks.links = envelope.pagination.links;
        if (vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).picksUsers)) {
            q860Var = q860.m173342b();
        } else {
            this.f164820U.clear();
            dbLinks.total = envelope.pagination.total;
            this.f164820U.addAll(vwb.m200303Q(((CoreData) envelope.getModuleData(CoreData.class)).picksUsers, new w9j() { // from class: l.gja
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((PicksUser) obj).f20468id;
                }
            }));
            q860Var = new q860<>(((CoreData) envelope.getModuleData(CoreData.class)).picksUsers, dbLinks);
        }
        this.f164818S.m132487l(q860Var);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ C22306c m184478x3(final String str) {
        return ia20.m135121e(new v9j() { // from class: l.oja
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31357u1(str)).m185883b();
            }
        }).map(new w9j() { // from class: l.pja
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f149740a.m184476v3((Envelope) obj);
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.qja
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f154908a.m184477w3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ roj0 m184479y3(Envelope envelope) {
        Picks picksNew_ = ((CoreData) envelope.getModuleData(CoreData.class)).picks == null ? Picks.new_() : ((CoreData) envelope.getModuleData(CoreData.class)).picks;
        this.f164823X.m132487l(picksNew_);
        this.f164821V = picksNew_.todayPaidProps;
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ C22306c m184480z3() {
        return ia20.m135121e(new v9j() { // from class: l.lja
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31353t1()).m185883b();
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.mja
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f134113a.m184479y3((Envelope) obj);
            }
        });
    }
}
