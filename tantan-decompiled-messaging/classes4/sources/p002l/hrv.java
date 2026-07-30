package p002l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSONObject;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.putong.data.Followship;
import com.p1.mobile.putong.data.Pagination;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveUserDressUp;
import com.p1.mobile.putong.live.base.data.BLiveVoice;
import com.p1.mobile.putong.live.base.data.BLiveVoiceFanBaseDetail;
import com.p1.mobile.putong.live.base.data.BLiveVoiceFansMyJoin;
import com.p1.mobile.putong.live.base.data.BLiveVoiceMemberLb;
import com.p1.mobile.putong.live.base.data.BLiveVoicePlayModeAnchorItem;
import com.p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import l.bgv;
import l.cll;
import l.e30;
import l.fld0;
import l.idv;
import l.mt0;
import l.r8d0;
import l.upv;
import l.vwb;
import l.w9j;
import l.wq2;
import l.ypv;
import l.ytr;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import rx.Notification;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hrv {

    /* JADX INFO: renamed from: a */
    public static int f12252a = 30;

    /* JADX INFO: renamed from: A */
    public static c<BLiveEnvelope> m14754A(String str, String str2, String str3, int i, Pagination pagination, String str4) {
        return m14800z(str, str2, str3, i, pagination.links.next, false, str4);
    }

    /* JADX INFO: renamed from: B */
    public static c<List<BLiveUserDressUp>> m14755B(String str, String str2) {
        return upv.w(cll.l(ytr.b("/live/users/" + str + "/rights")).p().c("roomId", str2).d(), "getOtherUserDressUp" + str).map(new w9j() { // from class: l.tqv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.rights;
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public static c<BLiveData> m14756C() {
        return upv.w(cll.l(ytr.b("/voice-room-topics")), "getVoiceTopics").map(new w9j() { // from class: l.yqv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data;
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public static c<List<BLiveUserDressUp>> m14757D(String str, String str2) {
        return upv.w(cll.l(ytr.b("/live/rights/" + str)).p().c("type", str2).d(), "getUserDressUpByIdAndType" + str).map(new w9j() { // from class: l.vqv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.rights;
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public static c<BLiveVoiceFanBaseDetail> m14758E(String str) {
        return upv.w(cll.l(ytr.b("/voiceFanbase/detail")).p().c("anchorId", str).d(), "getVoiceFanBaseDetail" + str).map(new w9j() { // from class: l.drv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceFanbaseDetail;
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public static c<List<BLiveVoicePlayModeAnchorItem>> m14759F() {
        return upv.w(cll.l(ytr.b("/voiceFanbase/lb")).p().d(), "BLiveVoiceMemberLb").map(new w9j() { // from class: l.xqv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceFanbaseLbs;
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public static c<List<BLiveVoiceMemberLb>> m14760G(String str, String str2) {
        return upv.w(cll.l(ytr.b("/voiceFanbase/memberLb")).p().c("anchorId", str).c("lbType", str2).d(), "getVoiceFanBaseMemberLib" + str2 + str).map(new w9j() { // from class: l.wqv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.memberLbs;
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public static c<List<BLiveVoiceFansMyJoin>> m14761H() {
        return upv.w(cll.l(ytr.b("/voiceFanbase/myJoin")).p().d(), "getVoiceFanBaseMyJoin").map(new w9j() { // from class: l.pqv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.myJoins;
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public static c<BLiveVoiceRoom> m14762I(String str, BLiveVoiceRoom bLiveVoiceRoom) {
        return upv.m(cll.l(ytr.b("/voice-rooms/" + str)).p().c("fields", bLiveVoiceRoom.fields).d(), "patchRoom", bLiveVoiceRoom.toJson()).map(new w9j() { // from class: l.grv
            public final Object call(Object obj) {
                return hrv.m14790p((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public static c<BLiveVoiceRoom> m14763J(String str, String str2) {
        String strB = ytr.b("/voice-rooms/" + str + "?fields=cover");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("coverUrl", str2);
        return upv.m(cll.l(strB), "patchRoomCover" + str + str2, jSONObject.toString()).map(new w9j() { // from class: l.uqv
            public final Object call(Object obj) {
                return hrv.m14788n((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public static c<BLiveEnvelope> m14764K(ArrayList<String> arrayList) {
        cll cllVarL = cll.l(ytr.b("/voiceFanbase/quit"));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("anchorIds", new JSONArray((Collection) arrayList));
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        return upv.p(cllVarL, "quitVoiceFanbase" + arrayList, jSONObject.toString());
    }

    /* JADX INFO: renamed from: L */
    public static c<BLiveVoice> m14765L(String str) {
        return upv.w(cll.l(ytr.b("/voice-lives/" + str)), "refreshStreamAddress" + str).map(new w9j() { // from class: l.qqv
            public final Object call(Object obj) {
                return hrv.m14786l((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public static c<BLiveEnvelope> m14766M(String str) {
        return upv.b(LiveApiBuilder.u(ytr.b("/voice-call-invites/" + str + "?action=reject"), new mt0[0]), "refuseInvited" + str, "");
    }

    /* JADX INFO: renamed from: N */
    public static c<BLiveEnvelope> m14767N(ArrayList<String> arrayList) {
        cll cllVarL = cll.l(ytr.b("/voiceFanbase/remove"));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("userIds", new JSONArray((Collection) arrayList));
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        return upv.p(cllVarL, "removeVoiceFanbaseMember" + arrayList, jSONObject.toString());
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public static c<? extends Notification<User>> m14768O(r8d0 r8d0Var) {
        return LivingNormalApiProvider.m4940s7(ypv.a.D0(), ((wq2) r8d0Var).c.id).materialize().doOnNext(new e30() { // from class: l.rqv
            public final void call(Object obj) {
                hrv.m14785k((Notification) obj);
            }
        }).take(1);
    }

    /* JADX INFO: renamed from: P */
    public static c<BLiveEnvelope> m14769P(String str, @Nullable String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return upv.h(cll.l(ytr.b("/voice-live-users/" + str)).p().c("from", str3).c("to", str4).c("scene", str5).c("source", str6).c("voiceliveid", str2).c("voiceroomid", str7).c("with", str8).d(), "voice-live-users/" + str + str2 + str3 + str4 + str5 + str6);
    }

    /* JADX INFO: renamed from: Q */
    public static c<User> m14770Q(String str) {
        return LivingNormalApiProvider.m4940s7(ypv.a.D0(), str).materialize().take(1).map(new w9j() { // from class: l.zqv
            public final Object call(Object obj) {
                return hrv.m14777c((Notification) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public static c<BLiveEnvelope> m14771R(String str, String str2, String str3) {
        cll cllVarL = cll.l(ytr.b("/voice-lives/" + str + "/buttonChat"));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("action", str2);
            jSONObject.put("otherUserId", str3);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        return upv.p(cllVarL, "sendChatButtonReqeust" + str2 + str3, jSONObject.toString());
    }

    /* JADX INFO: renamed from: S */
    public static c<BLiveEnvelope> m14772S(String str) {
        cll cllVarL = cll.l(ytr.b("/voiceFanbase/sign"));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("anchorId", str);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        return upv.p(cllVarL, "signVoiceFanbase" + str, jSONObject.toString());
    }

    /* JADX INFO: renamed from: T */
    public static c<BLiveVoice> m14773T(String str) {
        return upv.m(cll.l(ytr.b("/voice-lives/" + str)).p().c("type", "stop-voice-live").d(), "stopLive", "").map(new w9j() { // from class: l.arv
            public final Object call(Object obj) {
                return hrv.m14775a((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public static c<BLiveEnvelope> m14774U(String str) {
        cll cllVarL = cll.l(ytr.b("/voiceFanbase/medalEquip"));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("anchorId", str);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        return upv.p(cllVarL, "VoiceFanbaseMedalEquip" + str, jSONObject.toString());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ BLiveVoice m14775a(BLiveEnvelope bLiveEnvelope) {
        return (BLiveVoice) bLiveEnvelope.data.voiceLives.get(0);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ BLiveVoice m14776b(BLiveEnvelope bLiveEnvelope) {
        return (BLiveVoice) bLiveEnvelope.data.voiceLives.get(0);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ User m14777c(Notification notification) {
        return notification.j() ? ypv.a.V() : (User) notification.f();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Boolean m14780f(boolean z, BLiveEnvelope bLiveEnvelope) {
        if (z) {
            return Boolean.valueOf((vwb.J(bLiveEnvelope.data.voiceLives) || vwb.J(bLiveEnvelope.data.users)) ? false : true);
        }
        return Boolean.valueOf(!vwb.J(bLiveEnvelope.data.voiceLives));
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m14785k(Notification notification) {
        if (notification.k()) {
            ((idv) ypv.l(fld0.b)).a((User) notification.f());
        } else if (notification.j()) {
            ((idv) ypv.l(fld0.b)).a(ypv.a.V());
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ BLiveVoice m14786l(BLiveEnvelope bLiveEnvelope) {
        return (BLiveVoice) bLiveEnvelope.data.voiceLives.get(0);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ BLiveVoiceRoom m14788n(BLiveEnvelope bLiveEnvelope) {
        return (BLiveVoiceRoom) bLiveEnvelope.data.voiceRooms.get(0);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ BLiveVoice m14789o(BLiveEnvelope bLiveEnvelope) {
        ((bgv) ypv.l(fld0.f)).C(bLiveEnvelope.data.intlConfig.switchStar);
        return (BLiveVoice) bLiveEnvelope.data.voiceLives.get(0);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ BLiveVoiceRoom m14790p(BLiveEnvelope bLiveEnvelope) {
        return (BLiveVoiceRoom) bLiveEnvelope.data.voiceRooms.get(0);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ BLiveVoiceRoom m14792r(BLiveEnvelope bLiveEnvelope) {
        return (BLiveVoiceRoom) bLiveEnvelope.data.voiceRooms.get(0);
    }

    /* JADX INFO: renamed from: s */
    public static c<BLiveVoice> m14793s(String str, boolean z, String str2, String str3) {
        cll.a aVarP = cll.l(ytr.b("/voice-rooms/" + str + "/voice-lives")).p();
        aVarP.c("push", String.valueOf(z));
        aVarP.c("entranceType", str2);
        if (!TextUtils.isEmpty(str3)) {
            aVarP.c("liveMode", str3);
        }
        return upv.p(aVarP.d(), "createLive", "").map(new w9j() { // from class: l.sqv
            public final Object call(Object obj) {
                return hrv.m14789o((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public static c<BLiveVoice> m14794t(String str, boolean z, String str2, String str3, String str4, String str5) {
        cll.a aVarC = cll.l(ytr.b("/voice-rooms/" + str + "/voice-lives")).p().c("push", String.valueOf(z)).c("entranceType", str2).c("liveMode", str3);
        if (!TextUtils.isEmpty(str4)) {
            aVarC.c("template", str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            aVarC.c("gameType", str5);
        }
        return upv.p(aVarC.d(), "createLive", "").map(new w9j() { // from class: l.frv
            public final Object call(Object obj) {
                return hrv.m14776b((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static c<BLiveVoiceRoom> m14795u(BLiveVoiceRoom bLiveVoiceRoom) {
        return upv.p(cll.l(ytr.b("/voice-rooms")), "createRoom", bLiveVoiceRoom.toJson()).map(new w9j() { // from class: l.erv
            public final Object call(Object obj) {
                return hrv.m14792r((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public static c<r8d0> m14796v(BLiveAbsData bLiveAbsData) {
        return m14798x(bLiveAbsData.id, true, true, "0", bLiveAbsData.callback);
    }

    /* JADX INFO: renamed from: w */
    public static c<r8d0> m14797w(String str) {
        return m14799y(str);
    }

    /* JADX INFO: renamed from: x */
    public static c<r8d0> m14798x(String str, final boolean z, boolean z2, String str2, String str3) {
        cll.a aVarC = cll.l(ytr.b("/voice-lives/" + str)).p().c("refresh", String.valueOf(z2)).c("errcode", String.valueOf(str2));
        if (z) {
            aVarC.c("with", "voice-rooms,users,followships,relationships,fanbases,fanbase-relations");
        }
        if (!TextUtils.isEmpty(str3)) {
            aVarC.c("callback", str3);
        }
        return upv.h(aVarC.d(), "getLiveInfo" + str).filter(new w9j() { // from class: l.brv
            public final Object call(Object obj) {
                return hrv.m14780f(z, (BLiveEnvelope) obj);
            }
        }).map(new w9j() { // from class: l.crv
            public final Object call(Object obj) {
                BLiveEnvelope bLiveEnvelope = (BLiveEnvelope) obj;
                return new r8d0(vwb.J(bLiveEnvelope.data.users) ? null : (User) bLiveEnvelope.data.users.get(0), vwb.J(bLiveEnvelope.data.voiceRooms) ? BLiveVoiceRoom.new_() : (BLiveAbsRoom) bLiveEnvelope.data.voiceRooms.get(0), (BLiveAbsData) bLiveEnvelope.data.voiceLives.get(0), vwb.J(bLiveEnvelope.data.followships) ? Followship.new_() : (Followship) bLiveEnvelope.data.followships.get(0), (BLiveAddStickerResult) null).d(bLiveEnvelope);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public static c<r8d0> m14799y(String str) {
        return m14798x(str, true, true, "0", null);
    }

    /* JADX INFO: renamed from: z */
    public static c<BLiveEnvelope> m14800z(String str, String str2, @Nullable String str3, int i, String str4, boolean z, @Nullable String str5) {
        String str6;
        cll.a aVarC = cll.l(ytr.b("/voice-lives")).p().c("search", str).c("source", str2).c("with", "voice-rooms,users");
        if (!TextUtils.isEmpty(str3)) {
            aVarC.c("action", str3);
        }
        if (i >= 0) {
            aVarC.c("limit", String.valueOf(i));
        }
        if (z) {
            aVarC.c("expand", "true");
        }
        if (TextUtils.isEmpty(str4)) {
            str6 = "";
        } else {
            str6 = "&" + str4;
        }
        if (!TextUtils.isEmpty(str5)) {
            str6 = str6 + "&" + str5;
        }
        return upv.h(cll.l(aVarC.toString() + str6), "getLiveList" + str + str2 + str6);
    }
}
