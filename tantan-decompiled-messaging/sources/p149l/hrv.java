package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSONObject;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationActionAfterCountdown;
import com.p046p1.mobile.putong.live.base.data.BLiveUserDressUp;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceFanBaseDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceFansMyJoin;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceMemberLb;
import com.p046p1.mobile.putong.live.base.data.BLiveVoicePlayModeAnchorItem;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import p133rx.C22306c;
import p133rx.Notification;

/* JADX INFO: loaded from: classes4.dex */
public class hrv {

    /* JADX INFO: renamed from: a */
    public static int f109265a = 30;

    /* JADX INFO: renamed from: A */
    public static C22306c<BLiveEnvelope> m132718A(String str, String str2, String str3, int i, Pagination pagination, String str4) {
        return m132764z(str, str2, str3, i, pagination.links.next, false, str4);
    }

    /* JADX INFO: renamed from: B */
    public static C22306c<List<BLiveUserDressUp>> m132719B(String str, String str2) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/live/users/" + str + "/rights")).m107524p().m107536c("roomId", str2).m107537d(), "getOtherUserDressUp" + str).map(new w9j() { // from class: l.tqv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.rights;
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public static C22306c<BLiveData> m132720C() {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/voice-room-topics")), "getVoiceTopics").map(new w9j() { // from class: l.yqv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data;
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public static C22306c<List<BLiveUserDressUp>> m132721D(String str, String str2) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/live/rights/" + str)).m107524p().m107536c("type", str2).m107537d(), "getUserDressUpByIdAndType" + str).map(new w9j() { // from class: l.vqv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.rights;
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public static C22306c<BLiveVoiceFanBaseDetail> m132722E(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/voiceFanbase/detail")).m107524p().m107536c("anchorId", str).m107537d(), "getVoiceFanBaseDetail" + str).map(new w9j() { // from class: l.drv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceFanbaseDetail;
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public static C22306c<List<BLiveVoicePlayModeAnchorItem>> m132723F() {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/voiceFanbase/lb")).m107524p().m107537d(), "BLiveVoiceMemberLb").map(new w9j() { // from class: l.xqv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceFanbaseLbs;
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public static C22306c<List<BLiveVoiceMemberLb>> m132724G(String str, String str2) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/voiceFanbase/memberLb")).m107524p().m107536c("anchorId", str).m107536c("lbType", str2).m107537d(), "getVoiceFanBaseMemberLib" + str2 + str).map(new w9j() { // from class: l.wqv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.memberLbs;
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public static C22306c<List<BLiveVoiceFansMyJoin>> m132725H() {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/voiceFanbase/myJoin")).m107524p().m107537d(), "getVoiceFanBaseMyJoin").map(new w9j() { // from class: l.pqv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.myJoins;
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public static C22306c<BLiveVoiceRoom> m132726I(String str, BLiveVoiceRoom bLiveVoiceRoom) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/voice-rooms/" + str)).m107524p().m107536c("fields", bLiveVoiceRoom.fields).m107537d(), "patchRoom", bLiveVoiceRoom.toJson()).map(new w9j() { // from class: l.grv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceRooms.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public static C22306c<BLiveVoiceRoom> m132727J(String str, String str2) {
        String strM216073b = ytr.m216073b("/voice-rooms/" + str + "?fields=cover");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("coverUrl", (Object) str2);
        return upv.m194925m(cll.m107499l(strM216073b), "patchRoomCover" + str + str2, jSONObject.toString()).map(new w9j() { // from class: l.uqv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceRooms.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public static C22306c<BLiveEnvelope> m132728K(ArrayList<String> arrayList) {
        cll cllVarM107499l = cll.m107499l(ytr.m216073b("/voiceFanbase/quit"));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("anchorIds", new JSONArray((Collection) arrayList));
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return upv.m194928p(cllVarM107499l, "quitVoiceFanbase" + arrayList, jSONObject.toString());
    }

    /* JADX INFO: renamed from: L */
    public static C22306c<BLiveVoice> m132729L(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/voice-lives/" + str)), "refreshStreamAddress" + str).map(new w9j() { // from class: l.qqv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceLives.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public static C22306c<BLiveEnvelope> m132730M(String str) {
        return upv.m194914b(LiveApiBuilder.m67315u(ytr.m216073b("/voice-call-invites/" + str + "?action=reject"), new mt0[0]), "refuseInvited" + str, "");
    }

    /* JADX INFO: renamed from: N */
    public static C22306c<BLiveEnvelope> m132731N(ArrayList<String> arrayList) {
        cll cllVarM107499l = cll.m107499l(ytr.m216073b("/voiceFanbase/remove"));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("userIds", new JSONArray((Collection) arrayList));
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return upv.m194928p(cllVarM107499l, "removeVoiceFanbaseMember" + arrayList, jSONObject.toString());
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public static C22306c<? extends Notification<User>> m132732O(r8d0 r8d0Var) {
        return LivingNormalApiProvider.m71574s7(ypv.f199493a.m199309D0(), r8d0Var.f187610c.f44323id).materialize().doOnNext(new e30() { // from class: l.rqv
            @Override // p149l.e30
            public final void call(Object obj) {
                hrv.m132749k((Notification) obj);
            }
        }).take(1);
    }

    /* JADX INFO: renamed from: P */
    public static C22306c<BLiveEnvelope> m132733P(String str, @Nullable String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return upv.m194920h(cll.m107499l(ytr.m216073b("/voice-live-users/" + str)).m107524p().m107536c("from", str3).m107536c("to", str4).m107536c("scene", str5).m107536c("source", str6).m107536c("voiceliveid", str2).m107536c("voiceroomid", str7).m107536c("with", str8).m107537d(), "voice-live-users/" + str + str2 + str3 + str4 + str5 + str6);
    }

    /* JADX INFO: renamed from: Q */
    public static C22306c<User> m132734Q(String str) {
        return LivingNormalApiProvider.m71574s7(ypv.f199493a.m199309D0(), str).materialize().take(1).map(new w9j() { // from class: l.zqv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return hrv.m132741c((Notification) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public static C22306c<BLiveEnvelope> m132735R(String str, String str2, String str3) {
        cll cllVarM107499l = cll.m107499l(ytr.m216073b("/voice-lives/" + str + "/buttonChat"));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("action", str2);
            jSONObject.put("otherUserId", str3);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return upv.m194928p(cllVarM107499l, "sendChatButtonReqeust" + str2 + str3, jSONObject.toString());
    }

    /* JADX INFO: renamed from: S */
    public static C22306c<BLiveEnvelope> m132736S(String str) {
        cll cllVarM107499l = cll.m107499l(ytr.m216073b("/voiceFanbase/sign"));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("anchorId", str);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return upv.m194928p(cllVarM107499l, "signVoiceFanbase" + str, jSONObject.toString());
    }

    /* JADX INFO: renamed from: T */
    public static C22306c<BLiveVoice> m132737T(String str) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/voice-lives/" + str)).m107524p().m107536c("type", "stop-voice-live").m107537d(), "stopLive", "").map(new w9j() { // from class: l.arv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceLives.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public static C22306c<BLiveEnvelope> m132738U(String str) {
        cll cllVarM107499l = cll.m107499l(ytr.m216073b("/voiceFanbase/medalEquip"));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("anchorId", str);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return upv.m194928p(cllVarM107499l, "VoiceFanbaseMedalEquip" + str, jSONObject.toString());
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ User m132741c(Notification notification) {
        return notification.m221299j() ? ypv.f199493a.m199329V() : (User) notification.m221295f();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Boolean m132744f(boolean z, BLiveEnvelope bLiveEnvelope) {
        if (z) {
            return Boolean.valueOf((vwb.m200296J(bLiveEnvelope.data.voiceLives) || vwb.m200296J(bLiveEnvelope.data.users)) ? false : true);
        }
        return Boolean.valueOf(!vwb.m200296J(bLiveEnvelope.data.voiceLives));
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m132749k(Notification notification) {
        if (notification.m221300k()) {
            ((idv) ypv.m215673l(fld0.f98147b)).m135629a((User) notification.m221295f());
        } else if (notification.m221299j()) {
            ((idv) ypv.m215673l(fld0.f98147b)).m135629a(ypv.f199493a.m199329V());
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ BLiveVoice m132753o(BLiveEnvelope bLiveEnvelope) {
        ((bgv) ypv.m215673l(fld0.f98151f)).m101715C(bLiveEnvelope.data.intlConfig.switchStar);
        return bLiveEnvelope.data.voiceLives.get(0);
    }

    /* JADX INFO: renamed from: s */
    public static C22306c<BLiveVoice> m132757s(String str, boolean z, String str2, String str3) {
        cll.C16188a c16188aM107524p = cll.m107499l(ytr.m216073b("/voice-rooms/" + str + "/voice-lives")).m107524p();
        c16188aM107524p.m107536c("push", String.valueOf(z));
        c16188aM107524p.m107536c("entranceType", str2);
        if (!TextUtils.isEmpty(str3)) {
            c16188aM107524p.m107536c("liveMode", str3);
        }
        return upv.m194928p(c16188aM107524p.m107537d(), "createLive", "").map(new w9j() { // from class: l.sqv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return hrv.m132753o((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public static C22306c<BLiveVoice> m132758t(String str, boolean z, String str2, String str3, String str4, String str5) {
        cll.C16188a c16188aM107536c = cll.m107499l(ytr.m216073b("/voice-rooms/" + str + "/voice-lives")).m107524p().m107536c("push", String.valueOf(z)).m107536c("entranceType", str2).m107536c("liveMode", str3);
        if (!TextUtils.isEmpty(str4)) {
            c16188aM107536c.m107536c("template", str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            c16188aM107536c.m107536c("gameType", str5);
        }
        return upv.m194928p(c16188aM107536c.m107537d(), "createLive", "").map(new w9j() { // from class: l.frv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceLives.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static C22306c<BLiveVoiceRoom> m132759u(BLiveVoiceRoom bLiveVoiceRoom) {
        return upv.m194928p(cll.m107499l(ytr.m216073b("/voice-rooms")), "createRoom", bLiveVoiceRoom.toJson()).map(new w9j() { // from class: l.erv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceRooms.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public static C22306c<r8d0> m132760v(BLiveAbsData bLiveAbsData) {
        return m132762x(bLiveAbsData.f44323id, true, true, "0", bLiveAbsData.callback);
    }

    /* JADX INFO: renamed from: w */
    public static C22306c<r8d0> m132761w(String str) {
        return m132763y(str);
    }

    /* JADX INFO: renamed from: x */
    public static C22306c<r8d0> m132762x(String str, final boolean z, boolean z2, String str2, String str3) {
        cll.C16188a c16188aM107536c = cll.m107499l(ytr.m216073b("/voice-lives/" + str)).m107524p().m107536c(BLiveOperationActionAfterCountdown.refresh, String.valueOf(z2)).m107536c("errcode", String.valueOf(str2));
        if (z) {
            c16188aM107536c.m107536c("with", "voice-rooms,users,followships,relationships,fanbases,fanbase-relations");
        }
        if (!TextUtils.isEmpty(str3)) {
            c16188aM107536c.m107536c("callback", str3);
        }
        return upv.m194920h(c16188aM107536c.m107537d(), "getLiveInfo" + str).filter(new w9j() { // from class: l.brv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return hrv.m132744f(z, (BLiveEnvelope) obj);
            }
        }).map(new w9j() { // from class: l.crv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                BLiveEnvelope bLiveEnvelope = (BLiveEnvelope) obj;
                return new r8d0(vwb.m200296J(bLiveEnvelope.data.users) ? null : bLiveEnvelope.data.users.get(0), vwb.m200296J(bLiveEnvelope.data.voiceRooms) ? BLiveVoiceRoom.new_() : bLiveEnvelope.data.voiceRooms.get(0), bLiveEnvelope.data.voiceLives.get(0), vwb.m200296J(bLiveEnvelope.data.followships) ? Followship.new_() : bLiveEnvelope.data.followships.get(0), null).m178246d(bLiveEnvelope);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public static C22306c<r8d0> m132763y(String str) {
        return m132762x(str, true, true, "0", null);
    }

    /* JADX INFO: renamed from: z */
    public static C22306c<BLiveEnvelope> m132764z(String str, String str2, @Nullable String str3, int i, String str4, boolean z, @Nullable String str5) {
        String str6;
        cll.C16188a c16188aM107536c = cll.m107499l(ytr.m216073b("/voice-lives")).m107524p().m107536c(FirebaseAnalytics.Event.SEARCH, str).m107536c("source", str2).m107536c("with", "voice-rooms,users");
        if (!TextUtils.isEmpty(str3)) {
            c16188aM107536c.m107536c("action", str3);
        }
        if (i >= 0) {
            c16188aM107536c.m107536c(Constants.KEY_LIMIT, String.valueOf(i));
        }
        if (z) {
            c16188aM107536c.m107536c("expand", "true");
        }
        if (TextUtils.isEmpty(str4)) {
            str6 = "";
        } else {
            str6 = "&" + str4;
        }
        if (!TextUtils.isEmpty(str5)) {
            str6 = str6 + "&" + str5;
        }
        return upv.m194920h(cll.m107499l(c16188aM107536c.toString() + str6), "getLiveList" + str + str2 + str6);
    }
}
