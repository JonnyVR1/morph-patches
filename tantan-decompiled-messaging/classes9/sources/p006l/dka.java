package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.PrivilegeTopChat;
import com.p1.mobile.putong.core.data.UserWithRelationShip;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import l.e30;
import l.mkd0;
import l.mqi0;
import l.roj0;
import l.stc0;
import l.tpd0;
import l.utc0;
import l.v9j;
import l.vqd0;
import l.vwb;
import l.w9j;
import l.zpd0;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class dka extends ax6 {

    /* JADX INFO: renamed from: R */
    public zpd0 f10437R;

    /* JADX INFO: renamed from: S */
    public tpd0 f10438S;

    /* JADX INFO: renamed from: T */
    public vqd0 f10439T;

    /* JADX INFO: renamed from: U */
    public List<UserWithRelationShip> f10440U;

    /* JADX INFO: renamed from: V */
    public List<UserWithRelationShip> f10441V;

    /* JADX INFO: renamed from: W */
    public int f10442W;

    /* JADX INFO: renamed from: X */
    public int f10443X;

    /* JADX INFO: renamed from: Y */
    public a<roj0> f10444Y;

    /* JADX INFO: renamed from: Z */
    public zpd0 f10445Z;

    /* JADX INFO: renamed from: a0 */
    public tpd0 f10446a0;

    /* JADX INFO: renamed from: b0 */
    public final tpd0 f10447b0;

    /* JADX INFO: renamed from: c0 */
    public final a<List<PrivilegeTopChat>> f10448c0;

    /* JADX INFO: renamed from: d0 */
    public Comparator<UserWithRelationShip> f10449d0;

    public dka(C0158c c0158c) {
        super(c0158c);
        this.f10442W = -1;
        this.f10443X = -1;
        this.f10444Y = a.c(roj0.a);
        this.f10445Z = new zpd0("message_pin_guide_show_time" + CoreModule.m1850H().userId(), 0L);
        this.f10446a0 = new tpd0("message_pin_guide_total_time" + CoreModule.m1850H().userId(), 0);
        this.f10447b0 = new tpd0("pin_like_guide_anim_intro_count_" + CoreModule.m1850H().userId(), 0);
        this.f10448c0 = a.b();
        this.f10449d0 = new Comparator() { // from class: l.tja
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return dka.m14057a3((UserWithRelationShip) obj, (UserWithRelationShip) obj2);
            }
        };
        this.f10437R = new zpd0("pin_like_button_guide_last_show_time" + CoreModule.m1850H().userId(), 0L);
        this.f10438S = new tpd0("pin_like_button_guide_show_count" + CoreModule.m1850H().userId(), 0);
        this.f10439T = new vqd0("pin_like_hide_user_ids" + CoreModule.m1850H().userId(), new HashSet());
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ int m14057a3(UserWithRelationShip userWithRelationShip, UserWithRelationShip userWithRelationShip2) {
        Relationship relationship;
        Relationship relationship2;
        if (userWithRelationShip == null || userWithRelationShip2 == null || (relationship = userWithRelationShip.relationship) == null || (relationship2 = userWithRelationShip2.relationship) == null) {
            return 0;
        }
        double d = relationship2.updateTime - relationship.updateTime;
        if (d > 0.0d) {
            return 1;
        }
        return d < 0.0d ? -1 : 0;
    }

    /* JADX INFO: renamed from: f3 */
    public static /* synthetic */ stc0 m14062f3(boolean z, String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject.put("additional", jSONObject2);
            jSONObject2.put("pinChat", jSONObject3);
            jSONObject3.put("pin", z);
        } catch (JSONException unused) {
        }
        return C0154a.f3483P.auth().q(C0154a.m3137H2("/users/me/conversations/" + str)).k(utc0.create(Network.JSON, jSONObject.toString())).b();
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ User m14063g3(User user) {
        return user;
    }

    /* JADX INFO: renamed from: k3 */
    public List<PrivilegeTopChat> m14067k3() {
        return (List) this.f10448c0.e();
    }

    /* JADX INFO: renamed from: l3 */
    public void m14068l3(String str) {
        HashSet hashSet = (HashSet) CoreModule.f1534c.f3630e2.f10439T.get();
        hashSet.add(str);
        CoreModule.f1534c.f3630e2.f10439T.put(hashSet);
        m14077u3();
    }

    /* JADX INFO: renamed from: m3 */
    public void m14069m3() {
        this.f10447b0.a(1);
    }

    /* JADX INFO: renamed from: n3 */
    public boolean m14070n3(UserWithRelationShip userWithRelationShip) {
        Relationship relationship;
        return (userWithRelationShip == null || TextUtils.isEmpty(userWithRelationShip.userId) || (relationship = userWithRelationShip.relationship) == null || vwb.J(relationship.status) || !userWithRelationShip.relationship.status.contains(MatchFrom.get("pinLike")) || ((double) mqi0.o()) > userWithRelationShip.relationship.updateTime + 8.64E7d) ? false : true;
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ List m14071o3(Envelope envelope) {
        List list = envelope.getModuleData(CommonData.class).users;
        List<Conversation> list2 = envelope.getModuleData(CoreData.class).conversations;
        ArrayList arrayList = new ArrayList();
        HashMap mapD = vwb.d(list, new w9j() { // from class: l.yja
            public final Object call(Object obj) {
                return ((DbObject) ((User) obj)).id;
            }
        }, new w9j() { // from class: l.zja
            public final Object call(Object obj) {
                return dka.m14063g3((User) obj);
            }
        });
        for (Conversation conversation : list2) {
            User user = (User) mapD.get(conversation.otherUser);
            if (NullChecker.a(user)) {
                PrivilegeTopChat privilegeTopChatNew_ = PrivilegeTopChat.new_();
                privilegeTopChatNew_.user = user;
                privilegeTopChatNew_.conversation = conversation;
                arrayList.add(privilegeTopChatNew_);
            }
        }
        this.f10448c0.onNext(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ c m14072p3() {
        return ia20.m16571e(new v9j() { // from class: l.vja
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3137H2("/users/me/conversations?search=pinChatSuggested&with=users")).b();
            }
        }).map(new w9j() { // from class: l.wja
            public final Object call(Object obj) {
                return this.f25181a.m14071o3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ void m14073q3(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ c m14074r3(final boolean z, final String str) {
        return ia20.m16571e(new v9j() { // from class: l.aka
            public final Object call() {
                return dka.m14062f3(z, str);
            }
        }).doOnNext(new e30() { // from class: l.bka
            public final void call(Object obj) {
                this.f8937a.m14073q3((Envelope) obj);
            }
        }).map(new w9j() { // from class: l.cka
            public final Object call(Object obj) {
                return Boolean.TRUE;
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public c<List<PrivilegeTopChat>> m14075s3() {
        return this.f8580Q.scheduled("loadPrivilegeTopChat", 0, new v9j() { // from class: l.uja
            public final Object call() {
                return this.f23572a.m14072p3();
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: t3 */
    public int m14076t3() {
        return ((Integer) this.f10447b0.get()).intValue();
    }

    /* JADX INFO: renamed from: u3 */
    public synchronized void m14077u3() {
        try {
            this.f10441V = new ArrayList();
            if (vwb.J(this.f10440U) || vwb.J((Collection) this.f10439T.get())) {
                this.f10441V = this.f10440U;
            } else {
                HashSet hashSet = (HashSet) this.f10439T.get();
                for (UserWithRelationShip userWithRelationShip : this.f10440U) {
                    if (!hashSet.contains(userWithRelationShip.userId) && m14070n3(userWithRelationShip)) {
                        this.f10441V.add(userWithRelationShip);
                    }
                }
            }
            this.f10444Y.onNext(roj0.a);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: v3 */
    public void m14078v3(String str) {
        if (vwb.J(this.f10440U) || TextUtils.isEmpty(str)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (UserWithRelationShip userWithRelationShip : this.f10440U) {
            if (TextUtils.equals(str, userWithRelationShip.userId)) {
                arrayList.add(userWithRelationShip);
            }
        }
        this.f10440U.removeAll(arrayList);
        m14077u3();
    }

    /* JADX INFO: renamed from: w3 */
    public c<Boolean> m14079w3(final String str, final boolean z) {
        return this.f8580Q.scheduled("setConversationTop" + str, -1, new v9j() { // from class: l.xja
            public final Object call() {
                return this.f27549a.m14074r3(z, str);
            }
        }).compose(mkd0.C());
    }
}
