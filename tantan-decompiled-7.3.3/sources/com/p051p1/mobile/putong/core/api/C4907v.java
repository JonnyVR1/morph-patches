package com.p051p1.mobile.putong.core.api;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Api;
import com.google.common.base.Optional;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4907v;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.Note;
import com.p051p1.mobile.putong.core.data.QuickChatBellData;
import com.p051p1.mobile.putong.core.data.QuickChatCardInfo;
import com.p051p1.mobile.putong.core.data.QuickChatOneside;
import com.p051p1.mobile.putong.core.data.RecentConversation;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchPushUser;
import com.p051p1.mobile.putong.data.Answer;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;
import p153l.byd0;
import p153l.dy6;
import p153l.fo0;
import p153l.jxd0;
import p153l.jyb;
import p153l.lqb;
import p153l.pcj;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.qi20;
import p153l.ti20;
import p153l.uxj0;
import p153l.vxd0;
import p153l.x1d0;
import p153l.z1d0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.v */
/* JADX INFO: loaded from: classes9.dex */
public class C4907v extends dy6 {

    /* JADX INFO: renamed from: Z */
    public static C22507a<String> f20864Z = C22507a.m222758b();

    /* JADX INFO: renamed from: a0 */
    public static C22508b<pf60<String, Object>> f20865a0 = C22508b.m222767b();

    /* JADX INFO: renamed from: b0 */
    public static final pf60<String, Object> f20866b0 = jyb.m147494Y(null, null);

    /* JADX INFO: renamed from: c0 */
    public static final pf60<String, Object> f20867c0 = jyb.m147494Y(null, null);

    /* JADX INFO: renamed from: d0 */
    public static final pf60<String, Object> f20868d0 = jyb.m147494Y(null, null);

    /* JADX INFO: renamed from: R */
    public final C22507a<Note> f20869R;

    /* JADX INFO: renamed from: S */
    public C22508b<uxj0> f20870S;

    /* JADX INFO: renamed from: T */
    public jxd0 f20871T;

    /* JADX INFO: renamed from: U */
    public byd0 f20872U;

    /* JADX INFO: renamed from: V */
    public vxd0 f20873V;

    /* JADX INFO: renamed from: W */
    public byd0 f20874W;

    /* JADX INFO: renamed from: X */
    public vxd0 f20875X;

    /* JADX INFO: renamed from: Y */
    public boolean f20876Y;

    public C4907v(C4883c c4883c) {
        super(c4883c);
        this.f20869R = C22507a.m222758b();
        this.f20870S = C22508b.m222767b();
        this.f20871T = new jxd0("close_qc_broadcast" + CoreModule.m30929H().userId(), Boolean.FALSE);
        this.f20872U = new byd0("today_insert_card_date" + CoreModule.m30929H().userId(), 0L);
        this.f20873V = new vxd0("today_insert_card_count" + CoreModule.m30929H().userId(), 0);
        this.f20874W = new byd0("last_insert_card_count" + CoreModule.m30929H().userId(), 0L);
        this.f20875X = new vxd0("male_polltime" + CoreModule.m30929H().userId(), Api.BaseClientBuilder.API_PRIORITY_OTHER);
        this.f20876Y = false;
    }

    /* JADX INFO: renamed from: C3 */
    public static /* synthetic */ x1d0 m35772C3(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("secretKey", str);
        } catch (JSONException unused) {
        }
        return C4879a.f20236P.auth().m209043q(C4879a.m32229M1("/card?action=reject")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ C22421c m35780K3(String str, String str2, String str3, String str4, boolean z, String str5) {
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
        return qi20.m176654a(new pcj() { // from class: l.w5a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32233N1()).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).map(new qcj() { // from class: l.x5a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Optional.fromNullable(((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).bell);
            }
        });
    }

    /* JADX INFO: renamed from: a4 */
    public static /* synthetic */ x1d0 m35797a4(boolean z, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("consumeType", z ? "coin" : "privilege");
            jSONObject.put("secretKey", str);
        } catch (JSONException unused) {
        }
        return C4879a.f20236P.auth().m209043q(C4879a.m32229M1("/card?action=accept")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
    }

    /* JADX INFO: renamed from: d4 */
    public static /* synthetic */ C22421c m35803d4(boolean z) {
        final JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(NotificationCompat.CATEGORY_STATUS, z ? "on" : BLiveOperationTitleShowType.off);
            jSONObject.put("speedUpCard", jSONObject2);
        } catch (JSONException unused) {
        }
        return qi20.m176658e(new pcj() { // from class: l.g6a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32239P1()).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.h6a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ C22421c m35804e3(String str, String str2, String str3) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str);
            jSONObject.put("tracker", str2);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("consumeType", str3);
            }
        } catch (JSONException unused) {
        }
        return qi20.m176654a(new pcj() { // from class: l.q5a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32242Q1()).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        });
    }

    /* JADX INFO: renamed from: A4 */
    public C22421c<QuickChatCardInfo> m35828A4() {
        return this.f91137Q.scheduled("poll_quickchat_card", 0, new pcj() { // from class: l.l5a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f130086a.m35861u4();
            }
        });
    }

    /* JADX INFO: renamed from: B4 */
    public C22421c<uxj0> m35829B4(String str, String str2) {
        return m35832E4("push", str, "", "", str2).map(new qcj() { // from class: l.a6a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: C4 */
    public C22421c<uxj0> m35830C4(String str) {
        return m35833F4("push", str, "").map(new qcj() { // from class: l.t4a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: D4 */
    public final C22421c<Optional<QuickChatBellData>> m35831D4(boolean z, final String str, final String str2, final String str3, final boolean z2, final String str4) {
        String str5 = z ? "accept_quickchat_bell" : "reject_quickchat_bell";
        final String str6 = z ? "accept" : "reject";
        return this.f91137Q.scheduled(str5, -1, new pcj() { // from class: l.y6a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4907v.m35780K3(str6, str2, str, str3, z2, str4);
            }
        });
    }

    /* JADX INFO: renamed from: E4 */
    public C22421c<Envelope> m35832E4(String str, String str2, String str3, String str4, String str5) {
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
        return m35866z4(jSONObject.toString());
    }

    /* JADX INFO: renamed from: F4 */
    public final C22421c<Envelope> m35833F4(final String str, final String str2, final String str3) {
        return this.f91137Q.scheduled(str + "_quickchat_speed_match", -1, new pcj() { // from class: l.c5a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4907v.m35804e3(str, str2, str3);
            }
        });
    }

    /* JADX INFO: renamed from: G4 */
    public C22421c<List<RecentConversation>> m35834G4() {
        return this.f91137Q.scheduled("quickchat_conversations", -1, new pcj() { // from class: l.z4a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.u5a
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32236O1()).m209028b();
                    }
                }).map(new qcj() { // from class: l.v5a
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).recentConversations;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: H4 */
    public C22421c<uxj0> m35835H4() {
        return this.f91137Q.scheduled("quickchat_me", 0, new pcj() { // from class: l.o5a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f145043a.m35863w4();
            }
        });
    }

    /* JADX INFO: renamed from: I4 */
    public C22421c<uxj0> m35836I4(String str, String str2) {
        return m35832E4("reject", str, "", "", str2).map(new qcj() { // from class: l.y4a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: J4 */
    public C22421c<Optional<QuickChatBellData>> m35837J4(String str, String str2, boolean z) {
        return m35831D4(false, str, str2, "", z, "");
    }

    /* JADX INFO: renamed from: K4 */
    public C22421c<uxj0> m35838K4(final String str) {
        return this.f91137Q.scheduled("reject_quickchat_card", -1, new pcj() { // from class: l.u4a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.g5a
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4907v.m35772C3(str);
                    }
                });
            }
        }).map(new qcj() { // from class: l.v4a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: L4 */
    public C22421c<uxj0> m35839L4(OnlineMatchPushUser onlineMatchPushUser) {
        if (onlineMatchPushUser == null) {
            return C22421c.just(uxj0.f181467a);
        }
        if (onlineMatchPushUser.isSpeedMatch) {
            return m35840M4(onlineMatchPushUser.tracker);
        }
        if (onlineMatchPushUser.oneside) {
            return m35836I4(onlineMatchPushUser.tracker, onlineMatchPushUser.stage);
        }
        if (onlineMatchPushUser.isBell) {
            return m35837J4(onlineMatchPushUser.tracker, onlineMatchPushUser.isGreet ? Answer.TYPE : "greet", onlineMatchPushUser.isMaleQuickChatRing).map(new qcj() { // from class: l.e5a
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return uxj0.f181467a;
                }
            });
        }
        return !TextUtils.isEmpty(onlineMatchPushUser.secretKey) ? m35838K4(onlineMatchPushUser.secretKey) : this.f91137Q.scheduled("quick_chat_reject", -1, new pcj() { // from class: l.p5a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ti20(new pcj() { // from class: l.w4a
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32320k1()).m209037k(z1d0.create(Network.JSON, "")).m209028b();
                    }
                }).map(new qcj() { // from class: l.x4a
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                }).compose(psd0.m173592C());
            }
        });
    }

    /* JADX INFO: renamed from: M4 */
    public C22421c<uxj0> m35840M4(String str) {
        return m35833F4("reject", str, "").map(new qcj() { // from class: l.w6a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: N4 */
    public C22421c<uxj0> m35841N4(final String str) {
        return this.f91137Q.scheduled("report_quickchat_bell", -1, new pcj() { // from class: l.r5a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.c6a
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32233N1()).m209038l(z1d0.create(Network.JSON, "{\"action\":\"report\",\"tracker\":\"" + str + "\"}")).m209028b();
                    }
                }).map(new qcj() { // from class: l.d6a
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: O4 */
    public C22421c<uxj0> m35842O4(String str) {
        return m35833F4("report", str, "").map(new qcj() { // from class: l.j5a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: P4 */
    public C22421c<uxj0> m35843P4(String str, String str2) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("poolID", "gt");
            jSONObject.put("sessionID", str);
            jSONObject.put("senderID", str2);
            jSONObject.put("receiverID", CoreModule.m30930K().me_().f56859id);
            jSONObject.put("isShown", true);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return this.f91137Q.scheduled("adbroadcast", 0, new pcj() { // from class: l.f5a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ti20(new pcj() { // from class: l.i6a
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32316j1()).m209037k(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
                    }
                }).map(new qcj() { // from class: l.j6a
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                }).compose(psd0.m173592C());
            }
        });
    }

    /* JADX INFO: renamed from: Q4 */
    public C22421c<User> m35844Q4(final boolean z) {
        return this.f91137Q.scheduled("onlinematch_start", 0, new pcj() { // from class: l.z5a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f203015a.m35864x4(z);
            }
        });
    }

    /* JADX INFO: renamed from: R4 */
    public C22421c<uxj0> m35845R4() {
        return this.f91137Q.scheduled("start_quickchat_bell", -1, new pcj() { // from class: l.n5a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.e6a
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32233N1()).m209038l(z1d0.create(Network.JSON, "{\"action\":\"start\"}")).m209028b();
                    }
                }).map(new qcj() { // from class: l.f6a
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: S4 */
    public C22421c<uxj0> m35846S4() {
        return this.f91137Q.scheduled("onlinematch_stop", 0, new pcj() { // from class: l.x6a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ti20(new pcj() { // from class: l.s5a
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32312i1(Constants.VIA_REPORT_TYPE_SHARE_TO_QQ, "stop")).m209037k(z1d0.create(Network.JSON, "")).m209028b();
                    }
                }).map(new qcj() { // from class: l.t5a
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                }).compose(psd0.m173592C());
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public C22421c<uxj0> m35847g4(final String str, final boolean z) {
        return this.f91137Q.scheduled("onlinematch_create_conversation", -1, new pcj() { // from class: l.a5a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f68522a.m35857q4(str, z);
            }
        });
    }

    /* JADX INFO: renamed from: h4 */
    public C22421c<QuickChatOneside> m35848h4(String str, boolean z, String str2, String str3) {
        return m35832E4("accept", str, z ? "coin" : "privilege", str2, str3).map(new qcj() { // from class: l.b6a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).oneside;
            }
        });
    }

    /* JADX INFO: renamed from: i4 */
    public C22421c<Optional<QuickChatBellData>> m35849i4(String str, String str2, String str3, boolean z, String str4) {
        return m35831D4(true, str, str2, str3, z, str4);
    }

    /* JADX INFO: renamed from: j4 */
    public C22421c<Boolean> m35850j4(final String str, final boolean z) {
        return this.f91137Q.scheduled("accept_quickchat_card", -1, new pcj() { // from class: l.y5a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f197547a.m35859s4(z, str);
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public C22421c<uxj0> m35851k4(String str, String str2) {
        return m35833F4("accept", str, str2).map(new qcj() { // from class: l.d5a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: l4 */
    public final User m35852l4(Envelope envelope) {
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
        this.f91137Q.m32495w3(envelope, null);
        this.f91137Q.f20312H0.m155451l5(envelope);
        return user;
    }

    /* JADX INFO: renamed from: m4 */
    public C22421c<uxj0> m35853m4(final boolean z) {
        return this.f91137Q.scheduled("changeSpeedUpCardStatus", 0, new pcj() { // from class: l.m5a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4907v.m35803d4(z);
            }
        });
    }

    /* JADX INFO: renamed from: n4 */
    public C22421c<Note> m35854n4() {
        return this.f20869R.asObservable();
    }

    /* JADX INFO: renamed from: o4 */
    public Note m35855o4() {
        return this.f20869R.m222761e();
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ uxj0 m35856p4(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        if (envelope.meta.code == 200) {
            this.f91137Q.f20312H0.m155451l5(envelope);
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ C22421c m35857q4(String str, boolean z) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("secretKey", str);
            jSONObject.put("consumeType", lqb.m155388i4(z));
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            string = "";
        }
        final z1d0 z1d0VarCreate = z1d0.create(Network.JSON, string);
        return new ti20(new pcj() { // from class: l.h5a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32308h1()).m209037k(z1d0VarCreate).m209028b();
            }
        }).map(new qcj() { // from class: l.i5a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f113021a.m35856p4((Envelope) obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ Boolean m35858r4(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        if (envelope.meta.code != 200) {
            return Boolean.FALSE;
        }
        this.f91137Q.f20312H0.m155451l5(envelope);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ C22421c m35859s4(final boolean z, final String str) {
        return qi20.m176658e(new pcj() { // from class: l.s6a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4907v.m35797a4(z, str);
            }
        }).map(new qcj() { // from class: l.t6a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f172321a.m35858r4((Envelope) obj);
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ CoreData m35860t4(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        if (NullChecker.m82486a(coreData.quickchatCard)) {
            this.f91137Q.m32495w3(envelope, null);
        }
        return coreData;
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ C22421c m35861u4() {
        return qi20.m176658e(new pcj() { // from class: l.k6a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32229M1("/card")).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.m6a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f134980a.m35860t4((Envelope) obj);
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.n6a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((CoreData) obj).quickchatCard;
            }
        });
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ uxj0 m35862v4(Envelope envelope) {
        this.f20869R.m137019l(((CoreData) envelope.getModuleData(CoreData.class)).speedUpCard);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ C22421c m35863w4() {
        return qi20.m176658e(new pcj() { // from class: l.o6a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32239P1()).m209028b();
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.p6a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f150753a.m35862v4((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ C22421c m35864x4(final boolean z) {
        return new ti20(new pcj() { // from class: l.q6a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32312i1(Constants.VIA_REPORT_TYPE_SHARE_TO_QQ, "start")).m209037k(z1d0.create(Network.JSON, "{\"consumeType\": \"" + lqb.m155388i4(z) + "\"}")).m209028b();
            }
        }).map(new qcj() { // from class: l.r6a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f161460a.m35852l4((Envelope) obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: y4 */
    public C22421c<uxj0> m35865y4(final String str) {
        return this.f91137Q.scheduled("notify_bell_greeting", -1, new pcj() { // from class: l.l6a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.u6a
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32233N1()).m209038l(z1d0.create(Network.JSON, "{\"action\":\"push-greet\",\"tracker\":\"" + str + "\"}")).m209028b();
                    }
                }).map(new qcj() { // from class: l.v6a
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: z4 */
    public C22421c<Envelope> m35866z4(final String str) {
        return this.f91137Q.scheduled("notify_oneside_chat", -1, new pcj() { // from class: l.b5a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.k5a
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32209H1()).m209038l(z1d0.create(Network.JSON, str)).m209028b();
                    }
                });
            }
        });
    }
}
