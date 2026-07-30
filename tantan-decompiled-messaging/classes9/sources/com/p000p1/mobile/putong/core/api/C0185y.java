package com.p000p1.mobile.putong.core.api;

import android.text.TextUtils;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0185y;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.tantanapp.common.data.JsonAdapter;
import java.util.HashMap;
import java.util.Map;
import l.e30;
import l.jo0;
import l.roj0;
import l.stc0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w85;
import l.w9j;
import p006l.ka20;
import p006l.la20;
import p006l.qib0;
import p006l.rb20;
import p006l.ura;
import p006l.xma;
import rx.c;
import rx.schedulers.Schedulers;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.y */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0185y extends C0154a {

    /* JADX INFO: renamed from: Q */
    public static boolean f4127Q = false;

    /* JADX INFO: renamed from: R */
    public static boolean f4128R = false;

    /* JADX INFO: renamed from: S */
    public static int f4129S;

    /* JADX INFO: renamed from: Z2 */
    public static /* synthetic */ void m6829Z2(boolean z, boolean z2, boolean z3, Relationship relationship, Relationship relationship2, Envelope envelope) {
        if (z) {
            if (z2) {
                CoreModule.f1534c.f3562I0.m17379Q3(envelope);
            } else {
                CoreModule.f1534c.f3559H0.m27538l5(envelope);
            }
        } else if (z3) {
            if ("coin".equals(relationship.consumeType)) {
                CoreModule.f1534c.f3559H0.m27538l5(envelope);
            } else {
                CoreModule.f1534c.f3544C0.m27411n3();
                CoreModule.f1534c.m3422w3(envelope, null);
            }
        }
        HashMap map = new HashMap();
        if (TextUtils.equals(relationship2.state.toString(), "disliked")) {
            map.put("Action", "Dislike");
            w85.INSTANCE.m("Action on Swipe page", map);
            return;
        }
        if (z || TextUtils.equals(relationship2.state.toString(), "superliked")) {
            map.put("Action", "Superlike");
            w85.INSTANCE.m("Action on Swipe page", map);
            return;
        }
        if (TextUtils.equals(relationship2.state.toString(), "liked")) {
            map.put("Action", "Like");
            w85.INSTANCE.m("Action on Swipe page", map);
        } else if (TextUtils.equals(relationship2.state.toString(), CameraSticker.CATEGORY_DEFAULT_FILTER)) {
            map.put("Action", "Return to the previous");
            w85.INSTANCE.m("Action on Swipe page", map);
        } else if (TextUtils.equals(relationship2.state.toString(), "blocked")) {
            w85.INSTANCE.m("Unmatch", (Map) null);
        }
    }

    /* JADX INFO: renamed from: f3 */
    public static stc0.a m6835f3(Relationship relationship, Map<String, String> map) {
        int i;
        boolean z;
        boolean z2;
        long jGuessedCurrentServerTime = qib0.f19784H.guessedCurrentServerTime();
        if (f4129S == 0) {
            f4129S = (rb20.m22788c() & Integer.MIN_VALUE) != 0 ? 1 : 2;
        }
        while (true) {
            if (jGuessedCurrentServerTime % 47 != 1 && ((((i = f4129S) == 1 && jGuessedCurrentServerTime % 7 == 1) || (i == 2 && jGuessedCurrentServerTime % 7 != 1)) && ((((z = f4127Q) && jGuessedCurrentServerTime % 11 == 1) || (!z && jGuessedCurrentServerTime % 11 != 1)) && (((z2 = f4128R) && jGuessedCurrentServerTime % 19 == 1) || (!z2 && jGuessedCurrentServerTime % 19 != 1))))) {
                break;
            }
            jGuessedCurrentServerTime++;
        }
        relationship.createdTime = jGuessedCurrentServerTime;
        stc0.a aVarAuth = C0154a.f3483P.auth();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                aVarAuth.a(entry.getKey(), entry.getValue());
            }
        }
        return aVarAuth;
    }

    /* JADX INFO: renamed from: g3 */
    public static c<roj0> m6836g3(String str) {
        return m6840k3(str, RelationshipStatus.get("blocked"), null).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: h3 */
    public static c<roj0> m6837h3(String str) {
        return m6840k3(str, RelationshipStatus.get("liked"), null);
    }

    /* JADX INFO: renamed from: i3 */
    public static c<roj0> m6838i3(String str, Relationship relationship) {
        return m6840k3(str, RelationshipStatus.get("liked"), relationship);
    }

    /* JADX INFO: renamed from: j3 */
    public static c<roj0> m6839j3(final String str) {
        final Relationship relationship = new Relationship();
        relationship.state = RelationshipStatus.get("liked");
        return m6837h3(str).observeOn(Schedulers.io()).flatMap(new w9j() { // from class: l.sua
            public final Object call(Object obj) {
                return C0185y.m6841l3(str, relationship).observeOn(jo0.a()).map(new w9j() { // from class: l.wua
                    public final Object call(Object obj2) {
                        return roj0.a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public static c<roj0> m6840k3(final String str, RelationshipStatus relationshipStatus, Relationship relationship) {
        final Relationship relationship2 = new Relationship();
        relationship2.state = relationshipStatus;
        if (relationship != null) {
            relationship2.status = relationship.status;
            relationship2.scene = relationship.scene;
            relationship2.kankanId = relationship.kankanId;
            relationship2.otherKankanId = relationship.otherKankanId;
        }
        return new ka20(new v9j() { // from class: l.rua
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0("/relationships/" + CoreModule.m1850H().userId() + "?user_id=" + str)).m(utc0.create(Network.JSON, relationship2.toJson())).b();
            }
        }, JsonAdapter.UNIT_ADAPTER).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: l3 */
    public static c<Envelope> m6841l3(String str, Relationship relationship) {
        return m6842m3(str, relationship, null);
    }

    /* JADX INFO: renamed from: m3 */
    public static c<Envelope> m6842m3(String str, Relationship relationship, Map<String, String> map) {
        return m6843n3(str, relationship, map, false);
    }

    /* JADX INFO: renamed from: n3 */
    public static c<Envelope> m6843n3(final String str, final Relationship relationship, final Map<String, String> map, boolean z) {
        final boolean z2 = !vwb.J(relationship.status) && relationship.status.contains(MatchFrom.get("superLiked"));
        boolean z3 = z2 && ura.m25555e().m25559d().m5788ig();
        final boolean z4 = !vwb.J(relationship.status) && relationship.status.contains(MatchFrom.get("letter"));
        final boolean zXf = CoreModule.m1851K().xf();
        if (z4) {
            if (xma.m27349D3()) {
                relationship.consumeType = "privilege";
            } else {
                relationship.consumeType = "coin";
            }
        } else if (z3 && zXf) {
            relationship.consumeType = "diamond";
        }
        return new la20(new v9j() { // from class: l.uua
            public final Object call() {
                Relationship relationship2 = relationship;
                return C0185y.m6835f3(relationship2, map).q(C0154a.m3143J0("/relationships/" + str)).m(utc0.create(Network.JSON, relationship2.toJson())).b();
            }
        }).doOnNext(new e30() { // from class: l.vua
            public final void call(Object obj) {
                C0185y.m6829Z2(z2, zXf, z4, relationship, relationship, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public static c<Envelope> m6844o3(String str) {
        return m6845p3(str, RelationshipStatus.get("disliked"), null);
    }

    /* JADX INFO: renamed from: p3 */
    public static c<Envelope> m6845p3(final String str, RelationshipStatus relationshipStatus, Relationship relationship) {
        final Relationship relationship2 = new Relationship();
        relationship2.state = relationshipStatus;
        if (relationship != null) {
            relationship2.status = relationship.status;
        }
        return new la20(new v9j() { // from class: l.tua
            public final Object call() {
                Relationship relationship3 = relationship2;
                return C0185y.m6835f3(relationship3, null).q(C0154a.m3296w2("/" + CoreModule.m1850H().userId() + "/special-relationships/" + str)).m(utc0.create(Network.JSON, relationship3.toJson())).b();
            }
        });
    }
}
