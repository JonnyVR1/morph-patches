package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSONObject;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationActionAfterCountdown;
import com.p051p1.mobile.putong.live.base.data.BLiveUserDressUp;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceFanBaseDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceFansMyJoin;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceMemberLb;
import com.p051p1.mobile.putong.live.base.data.BLiveVoicePlayModeAnchorItem;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import p137rx.C22421c;
import p137rx.Notification;

/* JADX INFO: loaded from: classes4.dex */
public class itv {

    /* JADX INFO: renamed from: a */
    public static int f116876a = 30;

    /* JADX INFO: renamed from: A */
    public static C22421c<BLiveEnvelope> m142077A(String str, String str2, String str3, int i, Pagination pagination, String str4) {
        return m142123z(str, str2, str3, i, pagination.links.next, false, str4);
    }

    /* JADX INFO: renamed from: B */
    public static C22421c<List<BLiveUserDressUp>> m142078B(String str, String str2) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/live/users/" + str + "/rights")).m182288p().m182300c("roomId", str2).m182301d(), "getOtherUserDressUp" + str).map(new qcj() { // from class: l.usv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.rights;
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public static C22421c<BLiveData> m142079C() {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/voice-room-topics")), "getVoiceTopics").map(new qcj() { // from class: l.zsv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data;
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public static C22421c<List<BLiveUserDressUp>> m142080D(String str, String str2) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/live/rights/" + str)).m182288p().m182300c("type", str2).m182301d(), "getUserDressUpByIdAndType" + str).map(new qcj() { // from class: l.wsv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.rights;
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public static C22421c<BLiveVoiceFanBaseDetail> m142081E(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/voiceFanbase/detail")).m182288p().m182300c("anchorId", str).m182301d(), "getVoiceFanBaseDetail" + str).map(new qcj() { // from class: l.etv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceFanbaseDetail;
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public static C22421c<List<BLiveVoicePlayModeAnchorItem>> m142082F() {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/voiceFanbase/lb")).m182288p().m182301d(), "BLiveVoiceMemberLb").map(new qcj() { // from class: l.ysv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceFanbaseLbs;
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public static C22421c<List<BLiveVoiceMemberLb>> m142083G(String str, String str2) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/voiceFanbase/memberLb")).m182288p().m182300c("anchorId", str).m182300c("lbType", str2).m182301d(), "getVoiceFanBaseMemberLib" + str2 + str).map(new qcj() { // from class: l.xsv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.memberLbs;
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public static C22421c<List<BLiveVoiceFansMyJoin>> m142084H() {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/voiceFanbase/myJoin")).m182288p().m182301d(), "getVoiceFanBaseMyJoin").map(new qcj() { // from class: l.qsv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.myJoins;
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public static C22421c<BLiveVoiceRoom> m142085I(String str, BLiveVoiceRoom bLiveVoiceRoom) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/voice-rooms/" + str)).m182288p().m182300c("fields", bLiveVoiceRoom.fields).m182301d(), "patchRoom", bLiveVoiceRoom.toJson()).map(new qcj() { // from class: l.htv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceRooms.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public static C22421c<BLiveVoiceRoom> m142086J(String str, String str2) {
        String strM221802b = zvr.m221802b("/voice-rooms/" + str + "?fields=cover");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("coverUrl", (Object) str2);
        return vrv.m202552m(rnl.m182263l(strM221802b), "patchRoomCover" + str + str2, jSONObject.toString()).map(new qcj() { // from class: l.vsv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceRooms.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public static C22421c<BLiveEnvelope> m142087K(ArrayList<String> arrayList) {
        rnl rnlVarM182263l = rnl.m182263l(zvr.m221802b("/voiceFanbase/quit"));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("anchorIds", new JSONArray((Collection) arrayList));
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return vrv.m202555p(rnlVarM182263l, "quitVoiceFanbase" + arrayList, jSONObject.toString());
    }

    /* JADX INFO: renamed from: L */
    public static C22421c<BLiveVoice> m142088L(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/voice-lives/" + str)), "refreshStreamAddress" + str).map(new qcj() { // from class: l.rsv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceLives.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public static C22421c<BLiveEnvelope> m142089M(String str) {
        return vrv.m202541b(LiveApiBuilder.m68498u(zvr.m221802b("/voice-call-invites/" + str + "?action=reject"), new st0[0]), "refuseInvited" + str, "");
    }

    /* JADX INFO: renamed from: N */
    public static C22421c<BLiveEnvelope> m142090N(ArrayList<String> arrayList) {
        rnl rnlVarM182263l = rnl.m182263l(zvr.m221802b("/voiceFanbase/remove"));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("userIds", new JSONArray((Collection) arrayList));
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return vrv.m202555p(rnlVarM182263l, "removeVoiceFanbaseMember" + arrayList, jSONObject.toString());
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public static C22421c<? extends Notification<User>> m142091O(ugd0 ugd0Var) {
        return LivingNormalApiProvider.m72757s7(zrv.f205799a.m207631D0(), ugd0Var.f138293c.f45171id).materialize().doOnNext(new y20() { // from class: l.ssv
            @Override // p153l.y20
            public final void call(Object obj) {
                itv.m142108k((Notification) obj);
            }
        }).take(1);
    }

    /* JADX INFO: renamed from: P */
    public static C22421c<BLiveEnvelope> m142092P(String str, @Nullable String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return vrv.m202547h(rnl.m182263l(zvr.m221802b("/voice-live-users/" + str)).m182288p().m182300c("from", str3).m182300c("to", str4).m182300c("scene", str5).m182300c("source", str6).m182300c("voiceliveid", str2).m182300c("voiceroomid", str7).m182300c("with", str8).m182301d(), "voice-live-users/" + str + str2 + str3 + str4 + str5 + str6);
    }

    /* JADX INFO: renamed from: Q */
    public static C22421c<User> m142093Q(String str) {
        return LivingNormalApiProvider.m72757s7(zrv.f205799a.m207631D0(), str).materialize().take(1).map(new qcj() { // from class: l.atv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return itv.m142100c((Notification) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public static C22421c<BLiveEnvelope> m142094R(String str, String str2, String str3) {
        rnl rnlVarM182263l = rnl.m182263l(zvr.m221802b("/voice-lives/" + str + "/buttonChat"));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("action", str2);
            jSONObject.put("otherUserId", str3);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return vrv.m202555p(rnlVarM182263l, "sendChatButtonReqeust" + str2 + str3, jSONObject.toString());
    }

    /* JADX INFO: renamed from: S */
    public static C22421c<BLiveEnvelope> m142095S(String str) {
        rnl rnlVarM182263l = rnl.m182263l(zvr.m221802b("/voiceFanbase/sign"));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("anchorId", str);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return vrv.m202555p(rnlVarM182263l, "signVoiceFanbase" + str, jSONObject.toString());
    }

    /* JADX INFO: renamed from: T */
    public static C22421c<BLiveVoice> m142096T(String str) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/voice-lives/" + str)).m182288p().m182300c("type", "stop-voice-live").m182301d(), "stopLive", "").map(new qcj() { // from class: l.btv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceLives.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public static C22421c<BLiveEnvelope> m142097U(String str) {
        rnl rnlVarM182263l = rnl.m182263l(zvr.m221802b("/voiceFanbase/medalEquip"));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("anchorId", str);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return vrv.m202555p(rnlVarM182263l, "VoiceFanbaseMedalEquip" + str, jSONObject.toString());
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ User m142100c(Notification notification) {
        return notification.m222545j() ? zrv.f205799a.m207651V() : (User) notification.m222541f();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Boolean m142103f(boolean z, BLiveEnvelope bLiveEnvelope) {
        if (z) {
            return Boolean.valueOf((jyb.m147479J(bLiveEnvelope.data.voiceLives) || jyb.m147479J(bLiveEnvelope.data.users)) ? false : true);
        }
        return Boolean.valueOf(!jyb.m147479J(bLiveEnvelope.data.voiceLives));
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m142108k(Notification notification) {
        if (notification.m222546k()) {
            ((jfv) zrv.m221194l(htd0.f111520b)).m144714a((User) notification.m222541f());
        } else if (notification.m222545j()) {
            ((jfv) zrv.m221194l(htd0.f111520b)).m144714a(zrv.f205799a.m207651V());
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ BLiveVoice m142112o(BLiveEnvelope bLiveEnvelope) {
        ((civ) zrv.m221194l(htd0.f111524f)).m109951C(bLiveEnvelope.data.intlConfig.switchStar);
        return bLiveEnvelope.data.voiceLives.get(0);
    }

    /* JADX INFO: renamed from: s */
    public static C22421c<BLiveVoice> m142116s(String str, boolean z, String str2, String str3) {
        rnl.C19886a c19886aM182288p = rnl.m182263l(zvr.m221802b("/voice-rooms/" + str + "/voice-lives")).m182288p();
        c19886aM182288p.m182300c("push", String.valueOf(z));
        c19886aM182288p.m182300c("entranceType", str2);
        if (!TextUtils.isEmpty(str3)) {
            c19886aM182288p.m182300c("liveMode", str3);
        }
        return vrv.m202555p(c19886aM182288p.m182301d(), "createLive", "").map(new qcj() { // from class: l.tsv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return itv.m142112o((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public static C22421c<BLiveVoice> m142117t(String str, boolean z, String str2, String str3, String str4, String str5) {
        rnl.C19886a c19886aM182300c = rnl.m182263l(zvr.m221802b("/voice-rooms/" + str + "/voice-lives")).m182288p().m182300c("push", String.valueOf(z)).m182300c("entranceType", str2).m182300c("liveMode", str3);
        if (!TextUtils.isEmpty(str4)) {
            c19886aM182300c.m182300c("template", str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            c19886aM182300c.m182300c("gameType", str5);
        }
        return vrv.m202555p(c19886aM182300c.m182301d(), "createLive", "").map(new qcj() { // from class: l.gtv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceLives.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static C22421c<BLiveVoiceRoom> m142118u(BLiveVoiceRoom bLiveVoiceRoom) {
        return vrv.m202555p(rnl.m182263l(zvr.m221802b("/voice-rooms")), "createRoom", bLiveVoiceRoom.toJson()).map(new qcj() { // from class: l.ftv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceRooms.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public static C22421c<ugd0> m142119v(BLiveAbsData bLiveAbsData) {
        return m142121x(bLiveAbsData.f45171id, true, true, "0", bLiveAbsData.callback);
    }

    /* JADX INFO: renamed from: w */
    public static C22421c<ugd0> m142120w(String str) {
        return m142122y(str);
    }

    /* JADX INFO: renamed from: x */
    public static C22421c<ugd0> m142121x(String str, final boolean z, boolean z2, String str2, String str3) {
        rnl.C19886a c19886aM182300c = rnl.m182263l(zvr.m221802b("/voice-lives/" + str)).m182288p().m182300c(BLiveOperationActionAfterCountdown.refresh, String.valueOf(z2)).m182300c("errcode", String.valueOf(str2));
        if (z) {
            c19886aM182300c.m182300c("with", "voice-rooms,users,followships,relationships,fanbases,fanbase-relations");
        }
        if (!TextUtils.isEmpty(str3)) {
            c19886aM182300c.m182300c("callback", str3);
        }
        return vrv.m202547h(c19886aM182300c.m182301d(), "getLiveInfo" + str).filter(new qcj() { // from class: l.ctv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return itv.m142103f(z, (BLiveEnvelope) obj);
            }
        }).map(new qcj() { // from class: l.dtv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                BLiveEnvelope bLiveEnvelope = (BLiveEnvelope) obj;
                return new ugd0(jyb.m147479J(bLiveEnvelope.data.users) ? null : bLiveEnvelope.data.users.get(0), jyb.m147479J(bLiveEnvelope.data.voiceRooms) ? BLiveVoiceRoom.new_() : bLiveEnvelope.data.voiceRooms.get(0), bLiveEnvelope.data.voiceLives.get(0), jyb.m147479J(bLiveEnvelope.data.followships) ? Followship.new_() : bLiveEnvelope.data.followships.get(0), null).m195901d(bLiveEnvelope);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public static C22421c<ugd0> m142122y(String str) {
        return m142121x(str, true, true, "0", null);
    }

    /* JADX INFO: renamed from: z */
    public static C22421c<BLiveEnvelope> m142123z(String str, String str2, @Nullable String str3, int i, String str4, boolean z, @Nullable String str5) {
        String str6;
        rnl.C19886a c19886aM182300c = rnl.m182263l(zvr.m221802b("/voice-lives")).m182288p().m182300c(FirebaseAnalytics.Event.SEARCH, str).m182300c("source", str2).m182300c("with", "voice-rooms,users");
        if (!TextUtils.isEmpty(str3)) {
            c19886aM182300c.m182300c("action", str3);
        }
        if (i >= 0) {
            c19886aM182300c.m182300c(Constants.KEY_LIMIT, String.valueOf(i));
        }
        if (z) {
            c19886aM182300c.m182300c("expand", "true");
        }
        if (TextUtils.isEmpty(str4)) {
            str6 = "";
        } else {
            str6 = "&" + str4;
        }
        if (!TextUtils.isEmpty(str5)) {
            str6 = str6 + "&" + str5;
        }
        return vrv.m202547h(rnl.m182263l(c19886aM182300c.toString() + str6), "getLiveList" + str + str2 + str6);
    }
}
