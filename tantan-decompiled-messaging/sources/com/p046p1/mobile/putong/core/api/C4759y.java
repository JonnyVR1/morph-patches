package com.p046p1.mobile.putong.core.api;

import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4759y;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.tantanapp.common.data.JsonAdapter;
import java.util.HashMap;
import java.util.Map;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p149l.e30;
import p149l.ka20;
import p149l.la20;
import p149l.qib0;
import p149l.rb20;
import p149l.roj0;
import p149l.stc0;
import p149l.ura;
import p149l.v9j;
import p149l.vwb;
import p149l.w85;
import p149l.w9j;
import p149l.xma;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.y */
/* JADX INFO: loaded from: classes9.dex */
public class C4759y extends C4728a {

    /* JADX INFO: renamed from: Q */
    public static boolean f20138Q = false;

    /* JADX INFO: renamed from: R */
    public static boolean f20139R = false;

    /* JADX INFO: renamed from: S */
    public static int f20140S;

    /* JADX INFO: renamed from: Z2 */
    public static /* synthetic */ void m34892Z2(boolean z, boolean z2, boolean z3, Relationship relationship, Relationship relationship2, Envelope envelope) {
        if (z) {
            if (z2) {
                CoreModule.f17545c.f19573I0.m140263Q3(envelope);
            } else {
                CoreModule.f17545c.f19570H0.m210363l5(envelope);
            }
        } else if (z3) {
            if ("coin".equals(relationship.consumeType)) {
                CoreModule.f17545c.f19570H0.m210363l5(envelope);
            } else {
                CoreModule.f17545c.f19555C0.m210103n3();
                CoreModule.f17545c.m31492w3(envelope, null);
            }
        }
        HashMap map = new HashMap();
        if (TextUtils.equals(relationship2.state.toString(), RelationshipStatus.disliked)) {
            map.put("Action", "Dislike");
            w85.INSTANCE.m202145m("Action on Swipe page", map);
            return;
        }
        if (z || TextUtils.equals(relationship2.state.toString(), "superliked")) {
            map.put("Action", "Superlike");
            w85.INSTANCE.m202145m("Action on Swipe page", map);
            return;
        }
        if (TextUtils.equals(relationship2.state.toString(), "liked")) {
            map.put("Action", "Like");
            w85.INSTANCE.m202145m("Action on Swipe page", map);
        } else if (TextUtils.equals(relationship2.state.toString(), "default")) {
            map.put("Action", "Return to the previous");
            w85.INSTANCE.m202145m("Action on Swipe page", map);
        } else if (TextUtils.equals(relationship2.state.toString(), "blocked")) {
            w85.INSTANCE.m202145m("Unmatch", null);
        }
    }

    /* JADX INFO: renamed from: f3 */
    public static stc0.C20027a m34898f3(Relationship relationship, Map<String, String> map) {
        int i;
        boolean z;
        boolean z2;
        long jGuessedCurrentServerTime = qib0.f154693H.guessedCurrentServerTime();
        if (f20140S == 0) {
            f20140S = (rb20.m178554c() & Integer.MIN_VALUE) != 0 ? 1 : 2;
        }
        while (true) {
            if (jGuessedCurrentServerTime % 47 != 1 && ((((i = f20140S) == 1 && jGuessedCurrentServerTime % 7 == 1) || (i == 2 && jGuessedCurrentServerTime % 7 != 1)) && ((((z = f20138Q) && jGuessedCurrentServerTime % 11 == 1) || (!z && jGuessedCurrentServerTime % 11 != 1)) && (((z2 = f20139R) && jGuessedCurrentServerTime % 19 == 1) || (!z2 && jGuessedCurrentServerTime % 19 != 1))))) {
                break;
            }
            jGuessedCurrentServerTime++;
        }
        relationship.createdTime = jGuessedCurrentServerTime;
        stc0.C20027a c20027aAuth = C4728a.f19494P.auth();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                c20027aAuth.m185882a(entry.getKey(), entry.getValue());
            }
        }
        return c20027aAuth;
    }

    /* JADX INFO: renamed from: g3 */
    public static C22306c<roj0> m34899g3(String str) {
        return m34903k3(str, RelationshipStatus.get("blocked"), null).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: h3 */
    public static C22306c<roj0> m34900h3(String str) {
        return m34903k3(str, RelationshipStatus.get("liked"), null);
    }

    /* JADX INFO: renamed from: i3 */
    public static C22306c<roj0> m34901i3(String str, Relationship relationship) {
        return m34903k3(str, RelationshipStatus.get("liked"), relationship);
    }

    /* JADX INFO: renamed from: j3 */
    public static C22306c<roj0> m34902j3(final String str) {
        final Relationship relationship = new Relationship();
        relationship.state = RelationshipStatus.get("liked");
        return m34900h3(str).observeOn(Schedulers.m221493io()).flatMap(new w9j() { // from class: l.sua
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4759y.m34904l3(str, relationship).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.wua
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return roj0.f160388a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public static C22306c<roj0> m34903k3(final String str, RelationshipStatus relationshipStatus, Relationship relationship) {
        final Relationship relationship2 = new Relationship();
        relationship2.state = relationshipStatus;
        if (relationship != null) {
            relationship2.status = relationship.status;
            relationship2.scene = relationship.scene;
            relationship2.kankanId = relationship.kankanId;
            relationship2.otherKankanId = relationship.otherKankanId;
        }
        return new ka20(new v9j() { // from class: l.rua
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/relationships/" + CoreModule.m29931H().userId() + "?user_id=" + str)).m185894m(utc0.create(Network.JSON, relationship2.toJson())).m185883b();
            }
        }, JsonAdapter.UNIT_ADAPTER).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: l3 */
    public static C22306c<Envelope> m34904l3(String str, Relationship relationship) {
        return m34905m3(str, relationship, null);
    }

    /* JADX INFO: renamed from: m3 */
    public static C22306c<Envelope> m34905m3(String str, Relationship relationship, Map<String, String> map) {
        return m34906n3(str, relationship, map, false);
    }

    /* JADX INFO: renamed from: n3 */
    public static C22306c<Envelope> m34906n3(final String str, final Relationship relationship, final Map<String, String> map, boolean z) {
        final boolean z2 = !vwb.m200296J(relationship.status) && relationship.status.contains(MatchFrom.get(MatchFrom.superLiked));
        boolean z3 = z2 && ura.m195053e().m195057d().mo33851ig();
        final boolean z4 = !vwb.m200296J(relationship.status) && relationship.status.contains(MatchFrom.get("letter"));
        final boolean zMo30835xf = CoreModule.m29932K().mo30835xf();
        if (z4) {
            if (xma.m210041D3()) {
                relationship.consumeType = "privilege";
            } else {
                relationship.consumeType = "coin";
            }
        } else if (z3 && zMo30835xf) {
            relationship.consumeType = "diamond";
        }
        return new la20(new v9j() { // from class: l.uua
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                Relationship relationship2 = relationship;
                return C4759y.m34898f3(relationship2, map).m185898q(C4728a.m31213J0("/relationships/" + str)).m185894m(utc0.create(Network.JSON, relationship2.toJson())).m185883b();
            }
        }).doOnNext(new e30() { // from class: l.vua
            @Override // p149l.e30
            public final void call(Object obj) {
                C4759y.m34892Z2(z2, zMo30835xf, z4, relationship, relationship, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public static C22306c<Envelope> m34907o3(String str) {
        return m34908p3(str, RelationshipStatus.get(RelationshipStatus.disliked), null);
    }

    /* JADX INFO: renamed from: p3 */
    public static C22306c<Envelope> m34908p3(final String str, RelationshipStatus relationshipStatus, Relationship relationship) {
        final Relationship relationship2 = new Relationship();
        relationship2.state = relationshipStatus;
        if (relationship != null) {
            relationship2.status = relationship.status;
        }
        return new la20(new v9j() { // from class: l.tua
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                Relationship relationship3 = relationship2;
                return C4759y.m34898f3(relationship3, null).m185898q(C4728a.m31366w2("/" + CoreModule.m29931H().userId() + "/special-relationships/" + str)).m185894m(utc0.create(Network.JSON, relationship3.toJson())).m185883b();
            }
        });
    }
}
