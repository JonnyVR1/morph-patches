package com.p000p1.mobile.putong.core.api;

import android.text.TextUtils;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0182v;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.Note;
import com.p1.mobile.putong.core.data.QuickChatBellData;
import com.p1.mobile.putong.core.data.QuickChatCardInfo;
import com.p1.mobile.putong.core.data.QuickChatOneside;
import com.p1.mobile.putong.core.data.RecentConversation;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchPushUser;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.hpd0;
import l.j760;
import l.jo0;
import l.mkd0;
import l.roj0;
import l.stc0;
import l.tpd0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.zpd0;
import org.json.JSONException;
import org.json.JSONObject;
import p006l.ax6;
import p006l.ia20;
import p006l.la20;
import p006l.xob;
import rx.c;
import rx.subjects.a;
import rx.subjects.b;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.v */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0182v extends ax6 {

    /* JADX INFO: renamed from: Z */
    public static a<String> f4111Z = a.b();

    /* JADX INFO: renamed from: a0 */
    public static b<j760<String, Object>> f4112a0 = b.b();

    /* JADX INFO: renamed from: b0 */
    public static final j760<String, Object> f4113b0 = vwb.Y((Object) null, (Object) null);

    /* JADX INFO: renamed from: c0 */
    public static final j760<String, Object> f4114c0 = vwb.Y((Object) null, (Object) null);

    /* JADX INFO: renamed from: d0 */
    public static final j760<String, Object> f4115d0 = vwb.Y((Object) null, (Object) null);

    /* JADX INFO: renamed from: R */
    public final a<Note> f4116R;

    /* JADX INFO: renamed from: S */
    public b<roj0> f4117S;

    /* JADX INFO: renamed from: T */
    public hpd0 f4118T;

    /* JADX INFO: renamed from: U */
    public zpd0 f4119U;

    /* JADX INFO: renamed from: V */
    public tpd0 f4120V;

    /* JADX INFO: renamed from: W */
    public zpd0 f4121W;

    /* JADX INFO: renamed from: X */
    public tpd0 f4122X;

    /* JADX INFO: renamed from: Y */
    public boolean f4123Y;

    public C0182v(C0158c c0158c) {
        super(c0158c);
        this.f4116R = a.b();
        this.f4117S = b.b();
        this.f4118T = new hpd0("close_qc_broadcast" + CoreModule.m1850H().userId(), Boolean.FALSE);
        this.f4119U = new zpd0("today_insert_card_date" + CoreModule.m1850H().userId(), 0L);
        this.f4120V = new tpd0("today_insert_card_count" + CoreModule.m1850H().userId(), 0);
        this.f4121W = new zpd0("last_insert_card_count" + CoreModule.m1850H().userId(), 0L);
        this.f4122X = new tpd0("male_polltime" + CoreModule.m1850H().userId(), Integer.MAX_VALUE);
        this.f4123Y = false;
    }

    /* JADX INFO: renamed from: C3 */
    public static /* synthetic */ stc0 m6706C3(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("secretKey", str);
        } catch (JSONException unused) {
        }
        return C0154a.f3483P.auth().q(C0154a.m3156M1("/card?action=reject")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ c m6714K3(String str, String str2, String str3, String str4, boolean z, String str5) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str + "-" + str2);
            jSONObject.put("tracker", str3);
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("consumeType", str4);
            }
            if (z) {
                jSONObject.put("bellType", "male");
                jSONObject.put("senderID", str5);
            }
        } catch (JSONException unused) {
        }
        return ia20.m16567a(new v9j() { // from class: l.k4a
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3160N1()).l(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).map(new w9j() { // from class: l.l4a
            public final Object call(Object obj) {
                return Optional.fromNullable(((Envelope) obj).getModuleData(CoreData.class).bell);
            }
        });
    }

    /* JADX INFO: renamed from: a4 */
    public static /* synthetic */ stc0 m6731a4(boolean z, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("consumeType", z ? "coin" : "privilege");
            jSONObject.put("secretKey", str);
        } catch (JSONException unused) {
        }
        return C0154a.f3483P.auth().q(C0154a.m3156M1("/card?action=accept")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
    }

    /* JADX INFO: renamed from: d4 */
    public static /* synthetic */ c m6737d4(boolean z) {
        final JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("status", z ? "on" : "off");
            jSONObject.put("speedUpCard", jSONObject2);
        } catch (JSONException unused) {
        }
        return ia20.m16571e(new v9j() { // from class: l.u4a
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3166P1()).l(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.v4a
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ c m6738e3(String str, String str2, String str3) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str);
            jSONObject.put("tracker", str2);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("consumeType", str3);
            }
        } catch (JSONException unused) {
        }
        return ia20.m16567a(new v9j() { // from class: l.e4a
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3169Q1()).l(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        });
    }

    /* JADX INFO: renamed from: A4 */
    public c<QuickChatCardInfo> m6762A4() {
        return this.f8580Q.scheduled("poll_quickchat_card", 0, new v9j() { // from class: l.z3a
            public final Object call() {
                return this.f28604a.m6795u4();
            }
        });
    }

    /* JADX INFO: renamed from: B4 */
    public c<roj0> m6763B4(String str, String str2) {
        return m6766E4("push", str, "", "", str2).map(new w9j() { // from class: l.o4a
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: C4 */
    public c<roj0> m6764C4(String str) {
        return m6767F4("push", str, "").map(new w9j() { // from class: l.h3a
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: D4 */
    public final c<Optional<QuickChatBellData>> m6765D4(boolean z, final String str, final String str2, final String str3, final boolean z2, final String str4) {
        String str5 = z ? "accept_quickchat_bell" : "reject_quickchat_bell";
        final String str6 = z ? "accept" : "reject";
        return this.f8580Q.scheduled(str5, -1, new v9j() { // from class: l.m5a
            public final Object call() {
                return C0182v.m6714K3(str6, str2, str, str3, z2, str4);
            }
        });
    }

    /* JADX INFO: renamed from: E4 */
    public c<Envelope> m6766E4(String str, String str2, String str3, String str4, String str5) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str);
            jSONObject.put("tracker", str2);
            jSONObject.put("consumeType", str3);
            jSONObject.put("biz", str4);
            if (str5 == null) {
                str5 = "";
            }
            jSONObject.put("stage", str5);
        } catch (JSONException unused) {
        }
        return m6800z4(jSONObject.toString());
    }

    /* JADX INFO: renamed from: F4 */
    public final c<Envelope> m6767F4(final String str, final String str2, final String str3) {
        return this.f8580Q.scheduled(str + "_quickchat_speed_match", -1, new v9j() { // from class: l.q3a
            public final Object call() {
                return C0182v.m6738e3(str, str2, str3);
            }
        });
    }

    /* JADX INFO: renamed from: G4 */
    public c<List<RecentConversation>> m6768G4() {
        return this.f8580Q.scheduled("quickchat_conversations", -1, new v9j() { // from class: l.n3a
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.i4a
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3163O1()).b();
                    }
                }).map(new w9j() { // from class: l.j4a
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CoreData.class).recentConversations;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: H4 */
    public c<roj0> m6769H4() {
        return this.f8580Q.scheduled("quickchat_me", 0, new v9j() { // from class: l.c4a
            public final Object call() {
                return this.f9346a.m6797w4();
            }
        });
    }

    /* JADX INFO: renamed from: I4 */
    public c<roj0> m6770I4(String str, String str2) {
        return m6766E4("reject", str, "", "", str2).map(new w9j() { // from class: l.m3a
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: J4 */
    public c<Optional<QuickChatBellData>> m6771J4(String str, String str2, boolean z) {
        return m6765D4(false, str, str2, "", z, "");
    }

    /* JADX INFO: renamed from: K4 */
    public c<roj0> m6772K4(final String str) {
        return this.f8580Q.scheduled("reject_quickchat_card", -1, new v9j() { // from class: l.i3a
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.u3a
                    public final Object call() {
                        return C0182v.m6706C3(str);
                    }
                });
            }
        }).map(new w9j() { // from class: l.j3a
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: L4 */
    public c<roj0> m6773L4(OnlineMatchPushUser onlineMatchPushUser) {
        if (onlineMatchPushUser == null) {
            return c.just(roj0.a);
        }
        if (onlineMatchPushUser.isSpeedMatch) {
            return m6774M4(onlineMatchPushUser.tracker);
        }
        if (onlineMatchPushUser.oneside) {
            return m6770I4(onlineMatchPushUser.tracker, onlineMatchPushUser.stage);
        }
        if (onlineMatchPushUser.isBell) {
            return m6771J4(onlineMatchPushUser.tracker, onlineMatchPushUser.isGreet ? "answer" : "greet", onlineMatchPushUser.isMaleQuickChatRing).map(new w9j() { // from class: l.s3a
                public final Object call(Object obj) {
                    return roj0.a;
                }
            });
        }
        return !TextUtils.isEmpty(onlineMatchPushUser.secretKey) ? m6772K4(onlineMatchPushUser.secretKey) : this.f8580Q.scheduled("quick_chat_reject", -1, new v9j() { // from class: l.d4a
            public final Object call() {
                return new la20(new v9j() { // from class: l.k3a
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3247k1()).k(utc0.create(Network.JSON, "")).b();
                    }
                }).map(new w9j() { // from class: l.l3a
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                }).compose(mkd0.C());
            }
        });
    }

    /* JADX INFO: renamed from: M4 */
    public c<roj0> m6774M4(String str) {
        return m6767F4("reject", str, "").map(new w9j() { // from class: l.k5a
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: N4 */
    public c<roj0> m6775N4(final String str) {
        return this.f8580Q.scheduled("report_quickchat_bell", -1, new v9j() { // from class: l.f4a
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.q4a
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3160N1()).l(utc0.create(Network.JSON, "{\"action\":\"report\",\"tracker\":\"" + str + "\"}")).b();
                    }
                }).map(new w9j() { // from class: l.r4a
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: O4 */
    public c<roj0> m6776O4(String str) {
        return m6767F4("report", str, "").map(new w9j() { // from class: l.x3a
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: P4 */
    public c<roj0> m6777P4(String str, String str2) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("poolID", "gt");
            jSONObject.put("sessionID", str);
            jSONObject.put("senderID", str2);
            jSONObject.put("receiverID", ((DbObject) CoreModule.m1851K().me_()).id);
            jSONObject.put("isShown", true);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        return this.f8580Q.scheduled("adbroadcast", 0, new v9j() { // from class: l.t3a
            public final Object call() {
                return new la20(new v9j() { // from class: l.w4a
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3243j1()).k(utc0.create(Network.JSON, jSONObject.toString())).b();
                    }
                }).map(new w9j() { // from class: l.x4a
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                }).compose(mkd0.C());
            }
        });
    }

    /* JADX INFO: renamed from: Q4 */
    public c<User> m6778Q4(final boolean z) {
        return this.f8580Q.scheduled("onlinematch_start", 0, new v9j() { // from class: l.n4a
            public final Object call() {
                return this.f17473a.m6798x4(z);
            }
        });
    }

    /* JADX INFO: renamed from: R4 */
    public c<roj0> m6779R4() {
        return this.f8580Q.scheduled("start_quickchat_bell", -1, new v9j() { // from class: l.b4a
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.s4a
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3160N1()).l(utc0.create(Network.JSON, "{\"action\":\"start\"}")).b();
                    }
                }).map(new w9j() { // from class: l.t4a
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: S4 */
    public c<roj0> m6780S4() {
        return this.f8580Q.scheduled("onlinematch_stop", 0, new v9j() { // from class: l.l5a
            public final Object call() {
                return new la20(new v9j() { // from class: l.g4a
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3239i1("10", "stop")).k(utc0.create(Network.JSON, "")).b();
                    }
                }).map(new w9j() { // from class: l.h4a
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                }).compose(mkd0.C());
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public c<roj0> m6781g4(final String str, final boolean z) {
        return this.f8580Q.scheduled("onlinematch_create_conversation", -1, new v9j() { // from class: l.o3a
            public final Object call() {
                return this.f18001a.m6791q4(str, z);
            }
        });
    }

    /* JADX INFO: renamed from: h4 */
    public c<QuickChatOneside> m6782h4(String str, boolean z, String str2, String str3) {
        return m6766E4("accept", str, z ? "coin" : "privilege", str2, str3).map(new w9j() { // from class: l.p4a
            public final Object call(Object obj) {
                return ((Envelope) obj).getModuleData(CoreData.class).oneside;
            }
        });
    }

    /* JADX INFO: renamed from: i4 */
    public c<Optional<QuickChatBellData>> m6783i4(String str, String str2, String str3, boolean z, String str4) {
        return m6765D4(true, str, str2, str3, z, str4);
    }

    /* JADX INFO: renamed from: j4 */
    public c<Boolean> m6784j4(final String str, final boolean z) {
        return this.f8580Q.scheduled("accept_quickchat_card", -1, new v9j() { // from class: l.m4a
            public final Object call() {
                return this.f16791a.m6793s4(z, str);
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public c<roj0> m6785k4(String str, String str2) {
        return m6767F4("accept", str, str2).map(new w9j() { // from class: l.r3a
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: l4 */
    public final User m6786l4(Envelope envelope) {
        User user;
        if (envelope.getModuleData(CommonData.class).users.size() > 0) {
            user = (User) envelope.getModuleData(CommonData.class).users.get(0);
            Relationship relationshipNew_ = Relationship.new_();
            relationshipNew_.convType = "quickchat";
            ArrayList arrayList = new ArrayList();
            arrayList.add(MatchFrom.get("quickchat"));
            relationshipNew_.status = arrayList;
            user.localRelationship = relationshipNew_;
        } else {
            user = null;
        }
        this.f8580Q.m3422w3(envelope, null);
        this.f8580Q.f3559H0.m27538l5(envelope);
        return user;
    }

    /* JADX INFO: renamed from: m4 */
    public c<roj0> m6787m4(final boolean z) {
        return this.f8580Q.scheduled("changeSpeedUpCardStatus", 0, new v9j() { // from class: l.a4a
            public final Object call() {
                return C0182v.m6737d4(z);
            }
        });
    }

    /* JADX INFO: renamed from: n4 */
    public c<Note> m6788n4() {
        return this.f4116R.asObservable();
    }

    /* JADX INFO: renamed from: o4 */
    public Note m6789o4() {
        return (Note) this.f4116R.e();
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ roj0 m6790p4(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        if (envelope.meta.code == 200) {
            this.f8580Q.f3559H0.m27538l5(envelope);
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ c m6791q4(String str, boolean z) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("secretKey", str);
            jSONObject.put("consumeType", xob.m27475i4(z));
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.c(e);
            string = "";
        }
        final utc0 utc0VarCreate = utc0.create(Network.JSON, string);
        return new la20(new v9j() { // from class: l.v3a
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3235h1()).k(utc0VarCreate).b();
            }
        }).map(new w9j() { // from class: l.w3a
            public final Object call(Object obj) {
                return this.f24910a.m6790p4((Envelope) obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ Boolean m6792r4(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        if (envelope.meta.code != 200) {
            return Boolean.FALSE;
        }
        this.f8580Q.f3559H0.m27538l5(envelope);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ c m6793s4(final boolean z, final String str) {
        return ia20.m16571e(new v9j() { // from class: l.g5a
            public final Object call() {
                return C0182v.m6731a4(z, str);
            }
        }).map(new w9j() { // from class: l.h5a
            public final Object call(Object obj) {
                return this.f13678a.m6792r4((Envelope) obj);
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ CoreData m6794t4(Envelope envelope) {
        CoreData moduleData = envelope.getModuleData(CoreData.class);
        if (NullChecker.a(moduleData.quickchatCard)) {
            this.f8580Q.m3422w3(envelope, null);
        }
        return moduleData;
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ c m6795u4() {
        return ia20.m16571e(new v9j() { // from class: l.y4a
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3156M1("/card")).f().b();
            }
        }).map(new w9j() { // from class: l.a5a
            public final Object call(Object obj) {
                return this.f8111a.m6794t4((Envelope) obj);
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.b5a
            public final Object call(Object obj) {
                return ((CoreData) obj).quickchatCard;
            }
        });
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ roj0 m6796v4(Envelope envelope) {
        this.f4116R.onNext(envelope.getModuleData(CoreData.class).speedUpCard);
        return roj0.a;
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ c m6797w4() {
        return ia20.m16571e(new v9j() { // from class: l.c5a
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3166P1()).b();
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.d5a
            public final Object call(Object obj) {
                return this.f10020a.m6796v4((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ c m6798x4(final boolean z) {
        return new la20(new v9j() { // from class: l.e5a
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3239i1("10", "start")).k(utc0.create(Network.JSON, "{\"consumeType\": \"" + xob.m27475i4(z) + "\"}")).b();
            }
        }).map(new w9j() { // from class: l.f5a
            public final Object call(Object obj) {
                return this.f11673a.m6786l4((Envelope) obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: y4 */
    public c<roj0> m6799y4(final String str) {
        return this.f8580Q.scheduled("notify_bell_greeting", -1, new v9j() { // from class: l.z4a
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.i5a
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3160N1()).l(utc0.create(Network.JSON, "{\"action\":\"push-greet\",\"tracker\":\"" + str + "\"}")).b();
                    }
                }).map(new w9j() { // from class: l.j5a
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: z4 */
    public c<Envelope> m6800z4(final String str) {
        return this.f8580Q.scheduled("notify_oneside_chat", -1, new v9j() { // from class: l.p3a
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.y3a
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3136H1()).l(utc0.create(Network.JSON, str)).b();
                    }
                });
            }
        });
    }
}
