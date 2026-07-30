package com.p051p1.mobile.putong.core.api;

import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4910y;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.tantanapp.common.data.JsonAdapter;
import java.util.HashMap;
import java.util.Map;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p153l.ak20;
import p153l.gta;
import p153l.joa;
import p153l.jyb;
import p153l.pcj;
import p153l.qcj;
import p153l.si20;
import p153l.ti20;
import p153l.uqb0;
import p153l.uxj0;
import p153l.x1d0;
import p153l.x95;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.y */
/* JADX INFO: loaded from: classes9.dex */
public class C4910y extends C4879a {

    /* JADX INFO: renamed from: Q */
    public static boolean f20880Q = false;

    /* JADX INFO: renamed from: R */
    public static boolean f20881R = false;

    /* JADX INFO: renamed from: S */
    public static int f20882S;

    /* JADX INFO: renamed from: Z2 */
    public static /* synthetic */ void m35895Z2(boolean z, boolean z2, boolean z3, Relationship relationship, Relationship relationship2, Envelope envelope) {
        if (z) {
            if (z2) {
                CoreModule.f18264c.f20315I0.m144060Q3(envelope);
            } else {
                CoreModule.f18264c.f20312H0.m155451l5(envelope);
            }
        } else if (z3) {
            if ("coin".equals(relationship.consumeType)) {
                CoreModule.f18264c.f20312H0.m155451l5(envelope);
            } else {
                CoreModule.f18264c.f20297C0.m146416n3();
                CoreModule.f18264c.m32495w3(envelope, null);
            }
        }
        HashMap map = new HashMap();
        if (TextUtils.equals(relationship2.state.toString(), RelationshipStatus.disliked)) {
            map.put("Action", "Dislike");
            x95.INSTANCE.m209793m("Action on Swipe page", map);
            return;
        }
        if (z || TextUtils.equals(relationship2.state.toString(), "superliked")) {
            map.put("Action", "Superlike");
            x95.INSTANCE.m209793m("Action on Swipe page", map);
            return;
        }
        if (TextUtils.equals(relationship2.state.toString(), "liked")) {
            map.put("Action", "Like");
            x95.INSTANCE.m209793m("Action on Swipe page", map);
        } else if (TextUtils.equals(relationship2.state.toString(), "default")) {
            map.put("Action", "Return to the previous");
            x95.INSTANCE.m209793m("Action on Swipe page", map);
        } else if (TextUtils.equals(relationship2.state.toString(), "blocked")) {
            x95.INSTANCE.m209793m("Unmatch", null);
        }
    }

    /* JADX INFO: renamed from: f3 */
    public static x1d0.C21228a m35901f3(Relationship relationship, Map<String, String> map) {
        int i;
        boolean z;
        boolean z2;
        long jGuessedCurrentServerTime = uqb0.f180376H.guessedCurrentServerTime();
        if (f20882S == 0) {
            f20882S = (ak20.m98543c() & Integer.MIN_VALUE) != 0 ? 1 : 2;
        }
        while (true) {
            if (jGuessedCurrentServerTime % 47 != 1 && ((((i = f20882S) == 1 && jGuessedCurrentServerTime % 7 == 1) || (i == 2 && jGuessedCurrentServerTime % 7 != 1)) && ((((z = f20880Q) && jGuessedCurrentServerTime % 11 == 1) || (!z && jGuessedCurrentServerTime % 11 != 1)) && (((z2 = f20881R) && jGuessedCurrentServerTime % 19 == 1) || (!z2 && jGuessedCurrentServerTime % 19 != 1))))) {
                break;
            }
            jGuessedCurrentServerTime++;
        }
        relationship.createdTime = jGuessedCurrentServerTime;
        x1d0.C21228a c21228aAuth = C4879a.f20236P.auth();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                c21228aAuth.m209027a(entry.getKey(), entry.getValue());
            }
        }
        return c21228aAuth;
    }

    /* JADX INFO: renamed from: g3 */
    public static C22421c<uxj0> m35902g3(String str) {
        return m35906k3(str, RelationshipStatus.get("blocked"), null).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: h3 */
    public static C22421c<uxj0> m35903h3(String str) {
        return m35906k3(str, RelationshipStatus.get("liked"), null);
    }

    /* JADX INFO: renamed from: i3 */
    public static C22421c<uxj0> m35904i3(String str, Relationship relationship) {
        return m35906k3(str, RelationshipStatus.get("liked"), relationship);
    }

    /* JADX INFO: renamed from: j3 */
    public static C22421c<uxj0> m35905j3(final String str) {
        final Relationship relationship = new Relationship();
        relationship.state = RelationshipStatus.get("liked");
        return m35903h3(str).observeOn(Schedulers.m222739io()).flatMap(new qcj() { // from class: l.ewa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4910y.m35907l3(str, relationship).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.iwa
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return uxj0.f181467a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public static C22421c<uxj0> m35906k3(final String str, RelationshipStatus relationshipStatus, Relationship relationship) {
        final Relationship relationship2 = new Relationship();
        relationship2.state = relationshipStatus;
        if (relationship != null) {
            relationship2.status = relationship.status;
            relationship2.scene = relationship.scene;
            relationship2.kankanId = relationship.kankanId;
            relationship2.otherKankanId = relationship.otherKankanId;
        }
        return new si20(new pcj() { // from class: l.dwa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/relationships/" + CoreModule.m30929H().userId() + "?user_id=" + str)).m209039m(z1d0.create(Network.JSON, relationship2.toJson())).m209028b();
            }
        }, JsonAdapter.UNIT_ADAPTER).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: l3 */
    public static C22421c<Envelope> m35907l3(String str, Relationship relationship) {
        return m35908m3(str, relationship, null);
    }

    /* JADX INFO: renamed from: m3 */
    public static C22421c<Envelope> m35908m3(String str, Relationship relationship, Map<String, String> map) {
        return m35909n3(str, relationship, map, false);
    }

    /* JADX INFO: renamed from: n3 */
    public static C22421c<Envelope> m35909n3(final String str, final Relationship relationship, final Map<String, String> map, boolean z) {
        final boolean z2 = !jyb.m147479J(relationship.status) && relationship.status.contains(MatchFrom.get(MatchFrom.superLiked));
        boolean z3 = z2 && gta.m132210e().m132214d().mo34854ig();
        final boolean z4 = !jyb.m147479J(relationship.status) && relationship.status.contains(MatchFrom.get("letter"));
        final boolean zMo31838xf = CoreModule.m30930K().mo31838xf();
        if (z4) {
            if (joa.m146355E3()) {
                relationship.consumeType = "privilege";
            } else {
                relationship.consumeType = "coin";
            }
        } else if (z3 && zMo31838xf) {
            relationship.consumeType = "diamond";
        }
        return new ti20(new pcj() { // from class: l.gwa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                Relationship relationship2 = relationship;
                return C4910y.m35901f3(relationship2, map).m209043q(C4879a.m32216J0("/relationships/" + str)).m209039m(z1d0.create(Network.JSON, relationship2.toJson())).m209028b();
            }
        }).doOnNext(new y20() { // from class: l.hwa
            @Override // p153l.y20
            public final void call(Object obj) {
                C4910y.m35895Z2(z2, zMo31838xf, z4, relationship, relationship, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public static C22421c<Envelope> m35910o3(String str) {
        return m35911p3(str, RelationshipStatus.get(RelationshipStatus.disliked), null);
    }

    /* JADX INFO: renamed from: p3 */
    public static C22421c<Envelope> m35911p3(final String str, RelationshipStatus relationshipStatus, Relationship relationship) {
        final Relationship relationship2 = new Relationship();
        relationship2.state = relationshipStatus;
        if (relationship != null) {
            relationship2.status = relationship.status;
        }
        return new ti20(new pcj() { // from class: l.fwa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                Relationship relationship3 = relationship2;
                return C4910y.m35901f3(relationship3, null).m209043q(C4879a.m32369w2("/" + CoreModule.m30929H().userId() + "/special-relationships/" + str)).m209039m(z1d0.create(Network.JSON, relationship3.toJson())).m209028b();
            }
        });
    }
}
