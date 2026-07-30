package p153l;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.PrivilegeTopChat;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserWithRelationShip;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class pla extends dy6 {

    /* JADX INFO: renamed from: R */
    public byd0 f153003R;

    /* JADX INFO: renamed from: S */
    public vxd0 f153004S;

    /* JADX INFO: renamed from: T */
    public xyd0 f153005T;

    /* JADX INFO: renamed from: U */
    public List<UserWithRelationShip> f153006U;

    /* JADX INFO: renamed from: V */
    public List<UserWithRelationShip> f153007V;

    /* JADX INFO: renamed from: W */
    public int f153008W;

    /* JADX INFO: renamed from: X */
    public int f153009X;

    /* JADX INFO: renamed from: Y */
    public C22507a<uxj0> f153010Y;

    /* JADX INFO: renamed from: Z */
    public byd0 f153011Z;

    /* JADX INFO: renamed from: a0 */
    public vxd0 f153012a0;

    /* JADX INFO: renamed from: b0 */
    public final vxd0 f153013b0;

    /* JADX INFO: renamed from: c0 */
    public final C22507a<List<PrivilegeTopChat>> f153014c0;

    /* JADX INFO: renamed from: d0 */
    public Comparator<UserWithRelationShip> f153015d0;

    public pla(C4883c c4883c) {
        super(c4883c);
        this.f153008W = -1;
        this.f153009X = -1;
        this.f153010Y = C22507a.m222759c(uxj0.f181467a);
        this.f153011Z = new byd0("message_pin_guide_show_time" + CoreModule.m30929H().userId(), 0L);
        this.f153012a0 = new vxd0("message_pin_guide_total_time" + CoreModule.m30929H().userId(), 0);
        this.f153013b0 = new vxd0("pin_like_guide_anim_intro_count_" + CoreModule.m30929H().userId(), 0);
        this.f153014c0 = C22507a.m222758b();
        this.f153015d0 = new Comparator() { // from class: l.fla
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return pla.m172801a3((UserWithRelationShip) obj, (UserWithRelationShip) obj2);
            }
        };
        this.f153003R = new byd0("pin_like_button_guide_last_show_time" + CoreModule.m30929H().userId(), 0L);
        this.f153004S = new vxd0("pin_like_button_guide_show_count" + CoreModule.m30929H().userId(), 0);
        this.f153005T = new xyd0("pin_like_hide_user_ids" + CoreModule.m30929H().userId(), new HashSet());
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ int m172801a3(UserWithRelationShip userWithRelationShip, UserWithRelationShip userWithRelationShip2) {
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
    public static /* synthetic */ x1d0 m172806f3(boolean z, String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject.put("additional", jSONObject2);
            jSONObject2.put(SummarizedPrivilegesId.pinChat, jSONObject3);
            jSONObject3.put("pin", z);
        } catch (JSONException unused) {
        }
        return C4879a.f20236P.auth().m209043q(C4879a.m32210H2("/users/me/conversations/" + str)).m209037k(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ User m172807g3(User user) {
        return user;
    }

    /* JADX INFO: renamed from: k3 */
    public List<PrivilegeTopChat> m172811k3() {
        return this.f153014c0.m222761e();
    }

    /* JADX INFO: renamed from: l3 */
    public void m172812l3(String str) {
        HashSet<String> hashSet = CoreModule.f18264c.f20383e2.f153005T.get();
        hashSet.add(str);
        CoreModule.f18264c.f20383e2.f153005T.put(hashSet);
        m172821u3();
    }

    /* JADX INFO: renamed from: m3 */
    public void m172813m3() {
        this.f153013b0.m203841a(1);
    }

    /* JADX INFO: renamed from: n3 */
    public boolean m172814n3(UserWithRelationShip userWithRelationShip) {
        Relationship relationship;
        return (userWithRelationShip == null || TextUtils.isEmpty(userWithRelationShip.userId) || (relationship = userWithRelationShip.relationship) == null || jyb.m147479J(relationship.status) || !userWithRelationShip.relationship.status.contains(MatchFrom.get("pinLike")) || ((double) pzi0.m174454o()) > userWithRelationShip.relationship.updateTime + 8.64E7d) ? false : true;
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ List m172815o3(Envelope envelope) {
        List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
        List<Conversation> list2 = ((CoreData) envelope.getModuleData(CoreData.class)).conversations;
        ArrayList arrayList = new ArrayList();
        HashMap mapM147502d = jyb.m147502d(list, new qcj() { // from class: l.kla
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).f56859id;
            }
        }, new qcj() { // from class: l.lla
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return pla.m172807g3((User) obj);
            }
        });
        for (Conversation conversation : list2) {
            User user = (User) mapM147502d.get(conversation.otherUser);
            if (NullChecker.m82486a(user)) {
                PrivilegeTopChat privilegeTopChatNew_ = PrivilegeTopChat.new_();
                privilegeTopChatNew_.user = user;
                privilegeTopChatNew_.conversation = conversation;
                arrayList.add(privilegeTopChatNew_);
            }
        }
        this.f153014c0.m137019l(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ C22421c m172816p3() {
        return qi20.m176658e(new pcj() { // from class: l.hla
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32210H2("/users/me/conversations?search=pinChatSuggested&with=users")).m209028b();
            }
        }).map(new qcj() { // from class: l.ila
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f115560a.m172815o3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ void m172817q3(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ C22421c m172818r3(final boolean z, final String str) {
        return qi20.m176658e(new pcj() { // from class: l.mla
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return pla.m172806f3(z, str);
            }
        }).doOnNext(new y20() { // from class: l.nla
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142520a.m172817q3((Envelope) obj);
            }
        }).map(new qcj() { // from class: l.ola
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.TRUE;
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public C22421c<List<PrivilegeTopChat>> m172819s3() {
        return this.f91137Q.scheduled("loadPrivilegeTopChat", 0, new pcj() { // from class: l.gla
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f104832a.m172816p3();
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: t3 */
    public int m172820t3() {
        return this.f153013b0.get().intValue();
    }

    /* JADX INFO: renamed from: u3 */
    public synchronized void m172821u3() {
        try {
            this.f153007V = new ArrayList();
            if (jyb.m147479J(this.f153006U) || jyb.m147479J(this.f153005T.get())) {
                this.f153007V = this.f153006U;
            } else {
                HashSet<String> hashSet = this.f153005T.get();
                for (UserWithRelationShip userWithRelationShip : this.f153006U) {
                    if (!hashSet.contains(userWithRelationShip.userId) && m172814n3(userWithRelationShip)) {
                        this.f153007V.add(userWithRelationShip);
                    }
                }
            }
            this.f153010Y.m137019l(uxj0.f181467a);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: v3 */
    public void m172822v3(String str) {
        if (jyb.m147479J(this.f153006U) || TextUtils.isEmpty(str)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (UserWithRelationShip userWithRelationShip : this.f153006U) {
            if (TextUtils.equals(str, userWithRelationShip.userId)) {
                arrayList.add(userWithRelationShip);
            }
        }
        this.f153006U.removeAll(arrayList);
        m172821u3();
    }

    /* JADX INFO: renamed from: w3 */
    public C22421c<Boolean> m172823w3(final String str, final boolean z) {
        return this.f91137Q.scheduled("setConversationTop" + str, -1, new pcj() { // from class: l.jla
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f121536a.m172818r3(z, str);
            }
        }).compose(psd0.m173592C());
    }
}
