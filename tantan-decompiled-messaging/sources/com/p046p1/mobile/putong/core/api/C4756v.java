package com.p046p1.mobile.putong.core.api;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Api;
import com.google.common.base.Optional;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4756v;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.Note;
import com.p046p1.mobile.putong.core.data.QuickChatBellData;
import com.p046p1.mobile.putong.core.data.QuickChatCardInfo;
import com.p046p1.mobile.putong.core.data.QuickChatOneside;
import com.p046p1.mobile.putong.core.data.RecentConversation;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchPushUser;
import com.p046p1.mobile.putong.data.Answer;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;
import p149l.ax6;
import p149l.hpd0;
import p149l.ia20;
import p149l.j760;
import p149l.jo0;
import p149l.la20;
import p149l.mkd0;
import p149l.roj0;
import p149l.stc0;
import p149l.tpd0;
import p149l.utc0;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;
import p149l.xob;
import p149l.zpd0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.v */
/* JADX INFO: loaded from: classes9.dex */
public class C4756v extends ax6 {

    /* JADX INFO: renamed from: Z */
    public static C22392a<String> f20122Z = C22392a.m221512b();

    /* JADX INFO: renamed from: a0 */
    public static C22393b<j760<String, Object>> f20123a0 = C22393b.m221521b();

    /* JADX INFO: renamed from: b0 */
    public static final j760<String, Object> f20124b0 = vwb.m200311Y(null, null);

    /* JADX INFO: renamed from: c0 */
    public static final j760<String, Object> f20125c0 = vwb.m200311Y(null, null);

    /* JADX INFO: renamed from: d0 */
    public static final j760<String, Object> f20126d0 = vwb.m200311Y(null, null);

    /* JADX INFO: renamed from: R */
    public final C22392a<Note> f20127R;

    /* JADX INFO: renamed from: S */
    public C22393b<roj0> f20128S;

    /* JADX INFO: renamed from: T */
    public hpd0 f20129T;

    /* JADX INFO: renamed from: U */
    public zpd0 f20130U;

    /* JADX INFO: renamed from: V */
    public tpd0 f20131V;

    /* JADX INFO: renamed from: W */
    public zpd0 f20132W;

    /* JADX INFO: renamed from: X */
    public tpd0 f20133X;

    /* JADX INFO: renamed from: Y */
    public boolean f20134Y;

    public C4756v(C4732c c4732c) {
        super(c4732c);
        this.f20127R = C22392a.m221512b();
        this.f20128S = C22393b.m221521b();
        this.f20129T = new hpd0("close_qc_broadcast" + CoreModule.m29931H().userId(), Boolean.FALSE);
        this.f20130U = new zpd0("today_insert_card_date" + CoreModule.m29931H().userId(), 0L);
        this.f20131V = new tpd0("today_insert_card_count" + CoreModule.m29931H().userId(), 0);
        this.f20132W = new zpd0("last_insert_card_count" + CoreModule.m29931H().userId(), 0L);
        this.f20133X = new tpd0("male_polltime" + CoreModule.m29931H().userId(), Api.BaseClientBuilder.API_PRIORITY_OTHER);
        this.f20134Y = false;
    }

    /* JADX INFO: renamed from: C3 */
    public static /* synthetic */ stc0 m34769C3(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("secretKey", str);
        } catch (JSONException unused) {
        }
        return C4728a.f19494P.auth().m185898q(C4728a.m31226M1("/card?action=reject")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ C22306c m34777K3(String str, String str2, String str3, String str4, boolean z, String str5) {
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
        return ia20.m135117a(new v9j() { // from class: l.k4a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31230N1()).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).map(new w9j() { // from class: l.l4a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Optional.fromNullable(((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).bell);
            }
        });
    }

    /* JADX INFO: renamed from: a4 */
    public static /* synthetic */ stc0 m34794a4(boolean z, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("consumeType", z ? "coin" : "privilege");
            jSONObject.put("secretKey", str);
        } catch (JSONException unused) {
        }
        return C4728a.f19494P.auth().m185898q(C4728a.m31226M1("/card?action=accept")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
    }

    /* JADX INFO: renamed from: d4 */
    public static /* synthetic */ C22306c m34800d4(boolean z) {
        final JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(NotificationCompat.CATEGORY_STATUS, z ? "on" : BLiveOperationTitleShowType.off);
            jSONObject.put("speedUpCard", jSONObject2);
        } catch (JSONException unused) {
        }
        return ia20.m135121e(new v9j() { // from class: l.u4a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31236P1()).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.v4a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ C22306c m34801e3(String str, String str2, String str3) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str);
            jSONObject.put("tracker", str2);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("consumeType", str3);
            }
        } catch (JSONException unused) {
        }
        return ia20.m135117a(new v9j() { // from class: l.e4a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31239Q1()).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        });
    }

    /* JADX INFO: renamed from: A4 */
    public C22306c<QuickChatCardInfo> m34825A4() {
        return this.f72126Q.scheduled("poll_quickchat_card", 0, new v9j() { // from class: l.z3a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f201326a.m34858u4();
            }
        });
    }

    /* JADX INFO: renamed from: B4 */
    public C22306c<roj0> m34826B4(String str, String str2) {
        return m34829E4("push", str, "", "", str2).map(new w9j() { // from class: l.o4a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: C4 */
    public C22306c<roj0> m34827C4(String str) {
        return m34830F4("push", str, "").map(new w9j() { // from class: l.h3a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: D4 */
    public final C22306c<Optional<QuickChatBellData>> m34828D4(boolean z, final String str, final String str2, final String str3, final boolean z2, final String str4) {
        String str5 = z ? "accept_quickchat_bell" : "reject_quickchat_bell";
        final String str6 = z ? "accept" : "reject";
        return this.f72126Q.scheduled(str5, -1, new v9j() { // from class: l.m5a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4756v.m34777K3(str6, str2, str, str3, z2, str4);
            }
        });
    }

    /* JADX INFO: renamed from: E4 */
    public C22306c<Envelope> m34829E4(String str, String str2, String str3, String str4, String str5) {
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
        return m34863z4(jSONObject.toString());
    }

    /* JADX INFO: renamed from: F4 */
    public final C22306c<Envelope> m34830F4(final String str, final String str2, final String str3) {
        return this.f72126Q.scheduled(str + "_quickchat_speed_match", -1, new v9j() { // from class: l.q3a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4756v.m34801e3(str, str2, str3);
            }
        });
    }

    /* JADX INFO: renamed from: G4 */
    public C22306c<List<RecentConversation>> m34831G4() {
        return this.f72126Q.scheduled("quickchat_conversations", -1, new v9j() { // from class: l.n3a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.i4a
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31233O1()).m185883b();
                    }
                }).map(new w9j() { // from class: l.j4a
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).recentConversations;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: H4 */
    public C22306c<roj0> m34832H4() {
        return this.f72126Q.scheduled("quickchat_me", 0, new v9j() { // from class: l.c4a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f79163a.m34860w4();
            }
        });
    }

    /* JADX INFO: renamed from: I4 */
    public C22306c<roj0> m34833I4(String str, String str2) {
        return m34829E4("reject", str, "", "", str2).map(new w9j() { // from class: l.m3a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: J4 */
    public C22306c<Optional<QuickChatBellData>> m34834J4(String str, String str2, boolean z) {
        return m34828D4(false, str, str2, "", z, "");
    }

    /* JADX INFO: renamed from: K4 */
    public C22306c<roj0> m34835K4(final String str) {
        return this.f72126Q.scheduled("reject_quickchat_card", -1, new v9j() { // from class: l.i3a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.u3a
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4756v.m34769C3(str);
                    }
                });
            }
        }).map(new w9j() { // from class: l.j3a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: L4 */
    public C22306c<roj0> m34836L4(OnlineMatchPushUser onlineMatchPushUser) {
        if (onlineMatchPushUser == null) {
            return C22306c.just(roj0.f160388a);
        }
        if (onlineMatchPushUser.isSpeedMatch) {
            return m34837M4(onlineMatchPushUser.tracker);
        }
        if (onlineMatchPushUser.oneside) {
            return m34833I4(onlineMatchPushUser.tracker, onlineMatchPushUser.stage);
        }
        if (onlineMatchPushUser.isBell) {
            return m34834J4(onlineMatchPushUser.tracker, onlineMatchPushUser.isGreet ? Answer.TYPE : "greet", onlineMatchPushUser.isMaleQuickChatRing).map(new w9j() { // from class: l.s3a
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return roj0.f160388a;
                }
            });
        }
        return !TextUtils.isEmpty(onlineMatchPushUser.secretKey) ? m34835K4(onlineMatchPushUser.secretKey) : this.f72126Q.scheduled("quick_chat_reject", -1, new v9j() { // from class: l.d4a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new la20(new v9j() { // from class: l.k3a
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31317k1()).m185892k(utc0.create(Network.JSON, "")).m185883b();
                    }
                }).map(new w9j() { // from class: l.l3a
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                }).compose(mkd0.m154951C());
            }
        });
    }

    /* JADX INFO: renamed from: M4 */
    public C22306c<roj0> m34837M4(String str) {
        return m34830F4("reject", str, "").map(new w9j() { // from class: l.k5a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: N4 */
    public C22306c<roj0> m34838N4(final String str) {
        return this.f72126Q.scheduled("report_quickchat_bell", -1, new v9j() { // from class: l.f4a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.q4a
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31230N1()).m185893l(utc0.create(Network.JSON, "{\"action\":\"report\",\"tracker\":\"" + str + "\"}")).m185883b();
                    }
                }).map(new w9j() { // from class: l.r4a
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: O4 */
    public C22306c<roj0> m34839O4(String str) {
        return m34830F4("report", str, "").map(new w9j() { // from class: l.x3a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: P4 */
    public C22306c<roj0> m34840P4(String str, String str2) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("poolID", "gt");
            jSONObject.put("sessionID", str);
            jSONObject.put("senderID", str2);
            jSONObject.put("receiverID", CoreModule.m29932K().me_().f56011id);
            jSONObject.put("isShown", true);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return this.f72126Q.scheduled("adbroadcast", 0, new v9j() { // from class: l.t3a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new la20(new v9j() { // from class: l.w4a
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31313j1()).m185892k(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
                    }
                }).map(new w9j() { // from class: l.x4a
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                }).compose(mkd0.m154951C());
            }
        });
    }

    /* JADX INFO: renamed from: Q4 */
    public C22306c<User> m34841Q4(final boolean z) {
        return this.f72126Q.scheduled("onlinematch_start", 0, new v9j() { // from class: l.n4a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f137053a.m34861x4(z);
            }
        });
    }

    /* JADX INFO: renamed from: R4 */
    public C22306c<roj0> m34842R4() {
        return this.f72126Q.scheduled("start_quickchat_bell", -1, new v9j() { // from class: l.b4a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.s4a
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31230N1()).m185893l(utc0.create(Network.JSON, "{\"action\":\"start\"}")).m185883b();
                    }
                }).map(new w9j() { // from class: l.t4a
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: S4 */
    public C22306c<roj0> m34843S4() {
        return this.f72126Q.scheduled("onlinematch_stop", 0, new v9j() { // from class: l.l5a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new la20(new v9j() { // from class: l.g4a
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31309i1(Constants.VIA_REPORT_TYPE_SHARE_TO_QQ, "stop")).m185892k(utc0.create(Network.JSON, "")).m185883b();
                    }
                }).map(new w9j() { // from class: l.h4a
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                }).compose(mkd0.m154951C());
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public C22306c<roj0> m34844g4(final String str, final boolean z) {
        return this.f72126Q.scheduled("onlinematch_create_conversation", -1, new v9j() { // from class: l.o3a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f141642a.m34854q4(str, z);
            }
        });
    }

    /* JADX INFO: renamed from: h4 */
    public C22306c<QuickChatOneside> m34845h4(String str, boolean z, String str2, String str3) {
        return m34829E4("accept", str, z ? "coin" : "privilege", str2, str3).map(new w9j() { // from class: l.p4a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).oneside;
            }
        });
    }

    /* JADX INFO: renamed from: i4 */
    public C22306c<Optional<QuickChatBellData>> m34846i4(String str, String str2, String str3, boolean z, String str4) {
        return m34828D4(true, str, str2, str3, z, str4);
    }

    /* JADX INFO: renamed from: j4 */
    public C22306c<Boolean> m34847j4(final String str, final boolean z) {
        return this.f72126Q.scheduled("accept_quickchat_card", -1, new v9j() { // from class: l.m4a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f131265a.m34856s4(z, str);
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public C22306c<roj0> m34848k4(String str, String str2) {
        return m34830F4("accept", str, str2).map(new w9j() { // from class: l.r3a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: l4 */
    public final User m34849l4(Envelope envelope) {
        User user;
        if (((CommonData) envelope.getModuleData(CommonData.class)).users.size() > 0) {
            user = ((CommonData) envelope.getModuleData(CommonData.class)).users.get(0);
            Relationship relationshipNew_ = Relationship.new_();
            relationshipNew_.convType = "quickchat";
            ArrayList arrayList = new ArrayList();
            arrayList.add(MatchFrom.get("quickchat"));
            relationshipNew_.status = arrayList;
            user.localRelationship = relationshipNew_;
        } else {
            user = null;
        }
        this.f72126Q.m31492w3(envelope, null);
        this.f72126Q.f19570H0.m210363l5(envelope);
        return user;
    }

    /* JADX INFO: renamed from: m4 */
    public C22306c<roj0> m34850m4(final boolean z) {
        return this.f72126Q.scheduled("changeSpeedUpCardStatus", 0, new v9j() { // from class: l.a4a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4756v.m34800d4(z);
            }
        });
    }

    /* JADX INFO: renamed from: n4 */
    public C22306c<Note> m34851n4() {
        return this.f20127R.asObservable();
    }

    /* JADX INFO: renamed from: o4 */
    public Note m34852o4() {
        return this.f20127R.m221515e();
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ roj0 m34853p4(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        if (envelope.meta.code == 200) {
            this.f72126Q.f19570H0.m210363l5(envelope);
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ C22306c m34854q4(String str, boolean z) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("secretKey", str);
            jSONObject.put("consumeType", xob.m210300i4(z));
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            string = "";
        }
        final utc0 utc0VarCreate = utc0.create(Network.JSON, string);
        return new la20(new v9j() { // from class: l.v3a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31305h1()).m185892k(utc0VarCreate).m185883b();
            }
        }).map(new w9j() { // from class: l.w3a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f184324a.m34853p4((Envelope) obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ Boolean m34855r4(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        if (envelope.meta.code != 200) {
            return Boolean.FALSE;
        }
        this.f72126Q.f19570H0.m210363l5(envelope);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ C22306c m34856s4(final boolean z, final String str) {
        return ia20.m135121e(new v9j() { // from class: l.g5a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4756v.m34794a4(z, str);
            }
        }).map(new w9j() { // from class: l.h5a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f105938a.m34855r4((Envelope) obj);
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ CoreData m34857t4(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        if (NullChecker.m81303a(coreData.quickchatCard)) {
            this.f72126Q.m31492w3(envelope, null);
        }
        return coreData;
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ C22306c m34858u4() {
        return ia20.m135121e(new v9j() { // from class: l.y4a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31226M1("/card")).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.a5a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f67642a.m34857t4((Envelope) obj);
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.b5a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((CoreData) obj).quickchatCard;
            }
        });
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ roj0 m34859v4(Envelope envelope) {
        this.f20127R.m132487l(((CoreData) envelope.getModuleData(CoreData.class)).speedUpCard);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ C22306c m34860w4() {
        return ia20.m135121e(new v9j() { // from class: l.c5a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31236P1()).m185883b();
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.d5a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f84396a.m34859v4((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ C22306c m34861x4(final boolean z) {
        return new la20(new v9j() { // from class: l.e5a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31309i1(Constants.VIA_REPORT_TYPE_SHARE_TO_QQ, "start")).m185892k(utc0.create(Network.JSON, "{\"consumeType\": \"" + xob.m210300i4(z) + "\"}")).m185883b();
            }
        }).map(new w9j() { // from class: l.f5a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f94974a.m34849l4((Envelope) obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: y4 */
    public C22306c<roj0> m34862y4(final String str) {
        return this.f72126Q.scheduled("notify_bell_greeting", -1, new v9j() { // from class: l.z4a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.i5a
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31230N1()).m185893l(utc0.create(Network.JSON, "{\"action\":\"push-greet\",\"tracker\":\"" + str + "\"}")).m185883b();
                    }
                }).map(new w9j() { // from class: l.j5a
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: z4 */
    public C22306c<Envelope> m34863z4(final String str) {
        return this.f72126Q.scheduled("notify_oneside_chat", -1, new v9j() { // from class: l.p3a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.y3a
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31206H1()).m185893l(utc0.create(Network.JSON, str)).m185883b();
                    }
                });
            }
        });
    }
}
