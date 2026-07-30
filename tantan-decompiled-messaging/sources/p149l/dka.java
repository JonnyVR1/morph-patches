package p149l;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.PrivilegeTopChat;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserWithRelationShip;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class dka extends ax6 {

    /* JADX INFO: renamed from: R */
    public zpd0 f86629R;

    /* JADX INFO: renamed from: S */
    public tpd0 f86630S;

    /* JADX INFO: renamed from: T */
    public vqd0 f86631T;

    /* JADX INFO: renamed from: U */
    public List<UserWithRelationShip> f86632U;

    /* JADX INFO: renamed from: V */
    public List<UserWithRelationShip> f86633V;

    /* JADX INFO: renamed from: W */
    public int f86634W;

    /* JADX INFO: renamed from: X */
    public int f86635X;

    /* JADX INFO: renamed from: Y */
    public C22392a<roj0> f86636Y;

    /* JADX INFO: renamed from: Z */
    public zpd0 f86637Z;

    /* JADX INFO: renamed from: a0 */
    public tpd0 f86638a0;

    /* JADX INFO: renamed from: b0 */
    public final tpd0 f86639b0;

    /* JADX INFO: renamed from: c0 */
    public final C22392a<List<PrivilegeTopChat>> f86640c0;

    /* JADX INFO: renamed from: d0 */
    public Comparator<UserWithRelationShip> f86641d0;

    public dka(C4732c c4732c) {
        super(c4732c);
        this.f86634W = -1;
        this.f86635X = -1;
        this.f86636Y = C22392a.m221513c(roj0.f160388a);
        this.f86637Z = new zpd0("message_pin_guide_show_time" + CoreModule.m29931H().userId(), 0L);
        this.f86638a0 = new tpd0("message_pin_guide_total_time" + CoreModule.m29931H().userId(), 0);
        this.f86639b0 = new tpd0("pin_like_guide_anim_intro_count_" + CoreModule.m29931H().userId(), 0);
        this.f86640c0 = C22392a.m221512b();
        this.f86641d0 = new Comparator() { // from class: l.tja
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return dka.m112192a3((UserWithRelationShip) obj, (UserWithRelationShip) obj2);
            }
        };
        this.f86629R = new zpd0("pin_like_button_guide_last_show_time" + CoreModule.m29931H().userId(), 0L);
        this.f86630S = new tpd0("pin_like_button_guide_show_count" + CoreModule.m29931H().userId(), 0);
        this.f86631T = new vqd0("pin_like_hide_user_ids" + CoreModule.m29931H().userId(), new HashSet());
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ int m112192a3(UserWithRelationShip userWithRelationShip, UserWithRelationShip userWithRelationShip2) {
        Relationship relationship;
        Relationship relationship2;
        if (userWithRelationShip == null || userWithRelationShip2 == null || (relationship = userWithRelationShip.relationship) == null || (relationship2 = userWithRelationShip2.relationship) == null) {
            return 0;
        }
        double d = relationship2.updateTime - relationship.updateTime;
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return 1;
        }
        return d < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? -1 : 0;
    }

    /* JADX INFO: renamed from: f3 */
    public static /* synthetic */ stc0 m112197f3(boolean z, String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject.put("additional", jSONObject2);
            jSONObject2.put(SummarizedPrivilegesId.pinChat, jSONObject3);
            jSONObject3.put("pin", z);
        } catch (JSONException unused) {
        }
        return C4728a.f19494P.auth().m185898q(C4728a.m31207H2("/users/me/conversations/" + str)).m185892k(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ User m112198g3(User user) {
        return user;
    }

    /* JADX INFO: renamed from: k3 */
    public List<PrivilegeTopChat> m112202k3() {
        return this.f86640c0.m221515e();
    }

    /* JADX INFO: renamed from: l3 */
    public void m112203l3(String str) {
        HashSet<String> hashSet = CoreModule.f17545c.f19641e2.f86631T.get();
        hashSet.add(str);
        CoreModule.f17545c.f19641e2.f86631T.put(hashSet);
        m112212u3();
    }

    /* JADX INFO: renamed from: m3 */
    public void m112204m3() {
        this.f86639b0.m189988a(1);
    }

    /* JADX INFO: renamed from: n3 */
    public boolean m112205n3(UserWithRelationShip userWithRelationShip) {
        Relationship relationship;
        return (userWithRelationShip == null || TextUtils.isEmpty(userWithRelationShip.userId) || (relationship = userWithRelationShip.relationship) == null || vwb.m200296J(relationship.status) || !userWithRelationShip.relationship.status.contains(MatchFrom.get("pinLike")) || ((double) mqi0.m155944o()) > userWithRelationShip.relationship.updateTime + 8.64E7d) ? false : true;
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ List m112206o3(Envelope envelope) {
        List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
        List<Conversation> list2 = ((CoreData) envelope.getModuleData(CoreData.class)).conversations;
        ArrayList arrayList = new ArrayList();
        HashMap mapM200319d = vwb.m200319d(list, new w9j() { // from class: l.yja
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).f56011id;
            }
        }, new w9j() { // from class: l.zja
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return dka.m112198g3((User) obj);
            }
        });
        for (Conversation conversation : list2) {
            User user = (User) mapM200319d.get(conversation.otherUser);
            if (NullChecker.m81303a(user)) {
                PrivilegeTopChat privilegeTopChatNew_ = PrivilegeTopChat.new_();
                privilegeTopChatNew_.user = user;
                privilegeTopChatNew_.conversation = conversation;
                arrayList.add(privilegeTopChatNew_);
            }
        }
        this.f86640c0.m132487l(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ C22306c m112207p3() {
        return ia20.m135121e(new v9j() { // from class: l.vja
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31207H2("/users/me/conversations?search=pinChatSuggested&with=users")).m185883b();
            }
        }).map(new w9j() { // from class: l.wja
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f186622a.m112206o3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ void m112208q3(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ C22306c m112209r3(final boolean z, final String str) {
        return ia20.m135121e(new v9j() { // from class: l.aka
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return dka.m112197f3(z, str);
            }
        }).doOnNext(new e30() { // from class: l.bka
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75981a.m112208q3((Envelope) obj);
            }
        }).map(new w9j() { // from class: l.cka
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.TRUE;
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public C22306c<List<PrivilegeTopChat>> m112210s3() {
        return this.f72126Q.scheduled("loadPrivilegeTopChat", 0, new v9j() { // from class: l.uja
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f176749a.m112207p3();
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: t3 */
    public int m112211t3() {
        return this.f86639b0.get().intValue();
    }

    /* JADX INFO: renamed from: u3 */
    public synchronized void m112212u3() {
        try {
            this.f86633V = new ArrayList();
            if (vwb.m200296J(this.f86632U) || vwb.m200296J(this.f86631T.get())) {
                this.f86633V = this.f86632U;
            } else {
                HashSet<String> hashSet = this.f86631T.get();
                for (UserWithRelationShip userWithRelationShip : this.f86632U) {
                    if (!hashSet.contains(userWithRelationShip.userId) && m112205n3(userWithRelationShip)) {
                        this.f86633V.add(userWithRelationShip);
                    }
                }
            }
            this.f86636Y.m132487l(roj0.f160388a);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: v3 */
    public void m112213v3(String str) {
        if (vwb.m200296J(this.f86632U) || TextUtils.isEmpty(str)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (UserWithRelationShip userWithRelationShip : this.f86632U) {
            if (TextUtils.equals(str, userWithRelationShip.userId)) {
                arrayList.add(userWithRelationShip);
            }
        }
        this.f86632U.removeAll(arrayList);
        m112212u3();
    }

    /* JADX INFO: renamed from: w3 */
    public C22306c<Boolean> m112214w3(final String str, final boolean z) {
        return this.f72126Q.scheduled("setConversationTop" + str, -1, new v9j() { // from class: l.xja
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f193192a.m112209r3(z, str);
            }
        }).compose(mkd0.m154951C());
    }
}
