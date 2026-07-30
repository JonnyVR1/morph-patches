package com.p051p1.mobile.putong.live.livingroom.voice.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.data.GiftAction;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p051p1.mobile.putong.live.base.apibean.IntlLiveOperationItemBean;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p051p1.mobile.putong.live.base.data.BLiveBossCall;
import com.p051p1.mobile.putong.live.base.data.BLiveBossGiftRecord;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlMedalWall;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationActionAfterCountdown;
import com.p051p1.mobile.putong.live.base.data.BLiveState;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceHeartBeat;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceHeatBoxEntrance;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceManager;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceManagerInvite;
import com.p051p1.mobile.putong.live.base.data.BLiveVoicePkInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoicePopTotal;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTopic;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p153l.civ;
import p153l.h9t;
import p153l.htd0;
import p153l.j7u;
import p153l.jyb;
import p153l.o1j0;
import p153l.qcj;
import p153l.rnl;
import p153l.st0;
import p153l.ugd0;
import p153l.upq;
import p153l.uxj0;
import p153l.vrv;
import p153l.wg3;
import p153l.y20;
import p153l.yvr;
import p153l.zrv;
import p153l.zvr;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceRoomApiProvider {
    /* JADX INFO: renamed from: E */
    public static /* synthetic */ C22421c m78823E(String str, String str2, BLiveEnvelope bLiveEnvelope) {
        o1j0.m165636j(str);
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/voice-lives/" + str2 + "/managers")), "updateManager");
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ ArrayList m78824F(BLiveEnvelope bLiveEnvelope) {
        return new ArrayList(jyb.m147486Q(bLiveEnvelope.data.voiceManagers, new qcj() { // from class: l.tlo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveVoiceManager) obj).userId;
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ BLiveVoiceRoom m78829K(BLiveEnvelope bLiveEnvelope) {
        return jyb.m147479J(bLiveEnvelope.data.voiceRooms) ? BLiveVoiceRoom.EMPTY_ROOM : bLiveEnvelope.data.voiceRooms.get(0);
    }

    public static C22421c<BLiveEnvelope> addDeFriendWithUserId(String str, String str2) {
        return vrv.m202555p(rnl.m182263l(zvr.m221802b("/voice-rooms/" + str + "/blacklist/" + str2 + "?method=put")).m182288p().m182301d(), "deFriendWithUserId", "");
    }

    public static C22421c<uxj0> bossAnchorAway(String str) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/voice-calls/" + str)).m182288p().m182300c("action", "boss-anchor-away").m182301d(), "bossAnchorAway" + str, "").map(new qcj() { // from class: l.kko0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    private static C22421c<BLiveEnvelope> buildRoomPutReq(rnl rnlVar, String str) {
        return vrv.m202560u(rnlVar, "getInRoom" + str, "");
    }

    private static boolean checkDataSize(List list) {
        if (list != null && list.size() != 0) {
            return true;
        }
        wg3.m206174a("data is null");
        return false;
    }

    public static C22421c<uxj0> closeFreeCall(String str) {
        return vrv.m202549j(rnl.m182263l(zvr.m221802b("/voice-rooms/" + str + "/free-call")), "closeFreeCall" + str, "").map(new qcj() { // from class: l.sko0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    public static C22421c<uxj0> deleteManager(String str, String str2) {
        return vrv.m202540a(rnl.m182263l(zvr.m221802b("/voice-lives/" + str + "/managers/" + str2)).m182288p().m182301d(), "deleteManager" + str2 + str, "").map(new qcj() { // from class: l.iko0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Boolean m78838e(boolean z, BLiveEnvelope bLiveEnvelope) {
        if (z) {
            return Boolean.valueOf((jyb.m147479J(bLiveEnvelope.data.voiceLives) || jyb.m147479J(bLiveEnvelope.data.users)) ? false : true);
        }
        return Boolean.valueOf(!jyb.m147479J(bLiveEnvelope.data.voiceLives));
    }

    public static C22421c<uxj0> forbiddenWords(String str, String str2) {
        return vrv.m202559t(rnl.m182263l(zvr.m221802b("/voice-rooms/" + str + "/jailedlist/" + str2)), "forbiddenWords", "").map(new qcj() { // from class: l.lko0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    public static C22421c<BLiveAnchor> getAnchorInfo(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/anchors/" + str)).m182288p().m182300c("source", "voice").m182301d(), "anchorInfo" + str).filter(new qcj() { // from class: l.jlo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J(((BLiveEnvelope) obj).data.anchors));
            }
        }).map(new qcj() { // from class: l.klo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.anchors.get(0);
            }
        });
    }

    public static C22421c<BLiveBossCall> getBossCall(String str, String str2) {
        return vrv.m202547h(rnl.m182263l(zvr.m221802b("/voice-live-boss/calls")).m182288p().m182300c("liveId", str2).m182300c("userId", str).m182301d(), "getVoiceGiftDetail" + str).map(new qcj() { // from class: l.yko0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.bossCall;
            }
        });
    }

    public static C22421c<BLiveAbsData> getCurrentLiveInfoWithoutUsers(String str) {
        return getLiveInfo(str, false, false, "0", null).map(new qcj() { // from class: l.mlo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((ugd0) obj).f138293c;
            }
        });
    }

    public static C22421c<List<BLiveVoiceManager>> getCurrentLiveManagers(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/voice-lives/" + str + "/managers")).m182288p().m182301d(), "getCurrentLiveManagers" + str).map(new qcj() { // from class: l.plo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceManagers;
            }
        });
    }

    public static C22421c<BLiveBossGiftRecord> getGiftRecord(String str, String str2, int i, int i2) {
        return vrv.m202547h(rnl.m182263l(zvr.m221802b("/voice-live-boss/giftRecord")).m182288p().m182300c("liveId", str).m182300c("otherUserId", str2).m182300c(OMSTemplateModeType.page, i + "").m182300c("pageSize", i2 + "").m182301d(), "getVoiceGiftDetail" + str2).map(new qcj() { // from class: l.qlo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.bossGiftRecord;
            }
        });
    }

    public static C22421c<BLiveVoiceHeatBoxEntrance> getHeatBoxData(String str) {
        return vrv.m202547h(rnl.m182263l(zvr.m221805e("/heat-box/client/entrance?roomId=" + str)).m182288p().m182301d(), "getHeatBoxData").map(new qcj() { // from class: l.ilo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.heatBoxEntrance;
            }
        });
    }

    public static C22421c<BLiveEnvelope> getInRoom(String str, String str2, String str3, String str4, String str5) {
        return buildRoomPutReq(LiveApiBuilder.m68498u(zvr.m221802b("/voice-rooms/" + str + "/members/" + str2), st0.m187803a("source", str3), st0.m187803a("userId", str4), st0.m187803a("sessionId", str5), st0.m187803a("with", "voice-room-taginfo")), "getInRoom" + str);
    }

    public static C22421c<BaseLiveListBean<IntlLiveOperationItemBean>> getIntlLiveOperations(String str, String str2, String str3) {
        return vrv.m202561v(LiveApiBuilder.m68498u(zvr.m221802b("/intl-live-operations"), st0.m187803a("roomId", str), st0.m187803a("liveMode", str2), st0.m187803a("userType", str3)), "getIntlLiveOperations" + str + str3, h9t.m134084a(IntlLiveOperationItemBean.class, "operations"));
    }

    public static C22421c<List<BLiveVoice>> getLatestLive(String str, String str2) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/users/" + str + "/voice-lives")).m182288p().m182300c("state", "latest").m182300c("voiceRoomId", str2).m182301d(), "getLatestLive").map(new qcj() { // from class: l.olo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceLives;
            }
        });
    }

    public static C22421c<ugd0> getLiveInfo(String str, final boolean z, boolean z2, String str2, String str3) {
        rnl.C19886a c19886aM182300c = rnl.m182263l(zvr.m221802b("/voice-lives/" + str)).m182288p().m182300c(BLiveOperationActionAfterCountdown.refresh, String.valueOf(z2)).m182300c("errcode", String.valueOf(str2));
        if (z) {
            c19886aM182300c.m182300c("with", "voice-rooms,users,relationships");
        }
        if (!TextUtils.isEmpty(str3)) {
            c19886aM182300c.m182300c("callback", str3);
        }
        return vrv.m202547h(c19886aM182300c.m182301d(), "getLiveInfo" + str).filter(new qcj() { // from class: l.nko0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VoiceRoomApiProvider.m78838e(z, (BLiveEnvelope) obj);
            }
        }).map(new qcj() { // from class: l.oko0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                BLiveEnvelope bLiveEnvelope = (BLiveEnvelope) obj;
                return new ugd0(jyb.m147479J(bLiveEnvelope.data.users) ? null : bLiveEnvelope.data.users.get(0), jyb.m147479J(bLiveEnvelope.data.voiceRooms) ? BLiveVoiceRoom.new_() : bLiveEnvelope.data.voiceRooms.get(0), bLiveEnvelope.data.voiceLives.get(0), jyb.m147479J(bLiveEnvelope.data.followships) ? Followship.new_() : bLiveEnvelope.data.followships.get(0), null).m195901d(bLiveEnvelope).m195902e(bLiveEnvelope);
            }
        });
    }

    public static C22421c<ugd0> getLiveInfoForError(BLiveAbsData bLiveAbsData, String str) {
        return getLiveInfo(bLiveAbsData.f45171id, true, true, str, bLiveAbsData.callback);
    }

    public static C22421c<ugd0> getLiveInfoWithUses(String str) {
        return getLiveInfo(str, true, true, "0", null);
    }

    public static C22421c<BLiveEnvelope> getLiveVoiceHeartBeatReward(String str, String str2, String str3) {
        return vrv.m202562w(rnl.m182263l(rnl.m182263l(zvr.m221802b("/voice-lives/" + str + "/heartbeat-reward-list")).m182288p().m182300c(Constants.KEY_LIMIT, str2).m182300c("paged", str3).m182300c("with", "voice-live-user-mask").toString()), "getLiveVoiceHeartBeatReward" + str);
    }

    public static C22421c<List<BLiveVoiceManagerInvite>> getManagerInvites(String str, String str2, String str3) {
        rnl.C19886a c19886aM182300c = rnl.m182263l(zvr.m221802b("/voice-lives/" + str + "/manager-invites")).m182288p().m182300c("tab", str2);
        if (!TextUtils.isEmpty(str3)) {
            c19886aM182300c.m182300c("lastEntryTime", str3);
        }
        return vrv.m202562w(c19886aM182300c.m182301d(), "getManagerInvites" + str + str2).map(new qcj() { // from class: l.elo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceManagerInvites;
            }
        });
    }

    public static C22421c<BLiveIntlMedalWall> getMedalWallData(String str) {
        return vrv.m202547h(rnl.m182263l(zvr.m221802b("/intl/medal-wall/") + str).m182288p().m182301d(), "getMedalWallData" + str).map(new qcj() { // from class: l.dlo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.medalWall;
            }
        });
    }

    public static C22421c<List<BLiveVoice>> getOnGoingLive(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/users/" + str + "/voice-lives")).m182288p().m182300c("state", "ongoing").m182301d(), "onGoingLive").map(new qcj() { // from class: l.qko0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VoiceRoomApiProvider.m78848o((BLiveEnvelope) obj);
            }
        });
    }

    public static void getOutRoom(String str, String str2, String str3) {
        rnl rnlVarM68498u = LiveApiBuilder.m68498u(zvr.m221802b("/voice-rooms/" + str + "/members/" + str2), new st0("sessionId", str3));
        StringBuilder sb = new StringBuilder("getOutRoom");
        sb.append(str);
        vrv.m202549j(rnlVarM68498u, sb.toString(), "");
    }

    public static C22421c<BLiveVoiceRoom> getRoomInfo(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/users/" + str + "/voice-rooms")), "getRoomInfo").map(new qcj() { // from class: l.rlo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VoiceRoomApiProvider.m78829K((BLiveEnvelope) obj);
            }
        });
    }

    public static C22421c<List<BLiveVoiceTopic>> getRoomTopics(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/voice-rooms/" + str + "/voice-room-topics")), "getRoomTopics" + str).map(new qcj() { // from class: l.hlo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.topics;
            }
        });
    }

    public static C22421c<String> getShareUrl(String str, String str2, String str3) {
        return vrv.m202547h(rnl.m182263l(zvr.m221805e("/share-room-config")).m182288p().m182300c("shareType", str).m182300c("roomType", "voice").m182300c("roomId", str2).m182300c("scene", str3).m182301d(), "getShareUrl" + str).map(new qcj() { // from class: l.slo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.shareRoomConfig.url;
            }
        });
    }

    public static C22421c<BLiveUserMask> getUserMask(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/users/" + str + "/voiceLiveUserMasks")), "getUserMask" + str).filter(new qcj() { // from class: l.tko0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(VoiceRoomApiProvider.checkDataSize(((BLiveEnvelope) obj).data.masks));
            }
        }).map(new qcj() { // from class: l.uko0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.masks.get(0);
            }
        });
    }

    public static C22421c<Boolean> getVoiceCommerCialAssert(String str) {
        return vrv.m202547h(rnl.m182263l(zvr.m221809i("/" + str + "/voice-live-assert")), "getVoiceCommerCialAssert" + str).map(new qcj() { // from class: l.blo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.voiceLiveAssert.canCreateCommercialRoom);
            }
        });
    }

    public static C22421c<BLiveVoiceHeartBeat> getVoiceLiveHeartBeat(String str) {
        return vrv.m202562w(LiveApiBuilder.m68490m(zvr.m221802b("/voice-lives/" + str + "/heartbeat")).m182301d(), "getVoiceLiveHeartBeat" + str).map(new qcj() { // from class: l.ulo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceLiveHeartBeat;
            }
        });
    }

    public static C22421c<BLiveVoicePopTotal> getVoiceLivePopTotalValue(String str, String str2) {
        rnl.C19886a c19886aM68490m = LiveApiBuilder.m68490m(zvr.m221802b("/voice-lives/" + str + "/pop"));
        c19886aM68490m.m182300c("anchorId", str2);
        return vrv.m202562w(c19886aM68490m.m182301d(), "getVoiceRoomPopValue" + str).map(new qcj() { // from class: l.jko0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceLivePopsTotal;
            }
        });
    }

    public static C22421c<BLiveEnvelope> getVoiceLiveSummaries(String str, boolean z) {
        rnl.C19886a c19886aM68490m = LiveApiBuilder.m68490m(zvr.m221802b("/voice-lives/" + str + "/summaries"));
        if (z) {
            c19886aM68490m.m182300c("with", "voice-live-user-mask");
        }
        return vrv.m202562w(c19886aM68490m.m182301d(), "getLiveSummaries" + str);
    }

    public static C22421c<BLiveVoicePkInfo> getVoicePkDetail(String str) {
        return vrv.m202547h(rnl.m182263l(zvr.m221802b("/voice-pk/pkInfo")).m182288p().m182300c("roomId", str).m182301d(), "getVoicePkDetail" + str).map(new qcj() { // from class: l.rko0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voicePkInfo;
            }
        });
    }

    public static C22421c<BLiveEnvelope> getVoiceRoomShareList(String str, String str2) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/voice-rooms/" + str + "/share-users")).m182288p().m182300c("scene", str2).m182301d(), "getVoiceRoomShareList" + str);
    }

    public static C22421c<uxj0> inviteBecomeManager(String str, String str2, String str3) {
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221802b("/voice-lives/" + str + "/manager-invites")).m182288p().m182301d();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userId", str2);
            jSONObject.put("type", str3);
        } catch (JSONException unused) {
        }
        return vrv.m202555p(rnlVarM182301d, "inviteBecomeManager" + str + str2 + str3, jSONObject.toString()).map(new qcj() { // from class: l.mko0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    public static C22421c<uxj0> kickOffPerson(String str, String str2) {
        return vrv.m202549j(rnl.m182263l(zvr.m221802b("/voice-rooms/" + str + "/members/" + str2)), "kickOffPerson", "").map(new qcj() { // from class: l.llo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m78846m(String str, Throwable th) {
        if (yvr.m217556b(51025, th) || yvr.m217556b(51027, th)) {
            o1j0.m165636j(((TantanException.Client.CoreService) th).metaMessage);
        } else {
            o1j0.m165636j(str);
        }
    }

    public static C22421c<ArrayList<String>> manageRoomManager(final String str, String str2, boolean z) {
        C22421c<BLiveEnvelope> c22421cM202540a;
        final String string;
        final String string2;
        rnl rnlVarM182263l = rnl.m182263l(zvr.m221802b("/voice-lives/" + str + "/managers/" + str2));
        if (z) {
            c22421cM202540a = vrv.m202546g(rnlVarM182263l, "manageRoomManager", "");
            string = zrv.f205803e.getString(R$string.f48072f0);
            string2 = zrv.f205803e.getString(R$string.f48094g0);
        } else {
            c22421cM202540a = vrv.m202540a(rnlVarM182263l, "manageRoomManager", "");
            string = zrv.f205803e.getString(R$string.f47910Xb);
            string2 = zrv.f205803e.getString(R$string.f47931Yb);
        }
        return c22421cM202540a.doOnError(new y20() { // from class: l.vko0
            @Override // p153l.y20
            public final void call(Object obj) {
                VoiceRoomApiProvider.m78846m(string, (Throwable) obj);
            }
        }).flatMap(new qcj() { // from class: l.wko0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VoiceRoomApiProvider.m78823E(string2, str, (BLiveEnvelope) obj);
            }
        }).map(new qcj() { // from class: l.xko0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VoiceRoomApiProvider.m78854u((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ List m78848o(BLiveEnvelope bLiveEnvelope) {
        ((civ) zrv.m221194l(htd0.f111524f)).m109951C(bLiveEnvelope.data.intlConfig.switchStar);
        return bLiveEnvelope.data.voiceLives;
    }

    public static C22421c<uxj0> openFreeCall(String str) {
        return vrv.m202559t(rnl.m182263l(zvr.m221802b("/voice-rooms/" + str + "/free-call")), "openFreeCall" + str, "").map(new qcj() { // from class: l.flo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    public static C22421c<uxj0> operationManagerInvite(String str, String str2, String str3) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/voice-lives/" + str + "/manager-invites/" + str2)).m182288p().m182300c("action", str3).m182301d(), "operationManagerInvite" + str + str2 + str3, "").map(new qcj() { // from class: l.clo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    public static C22421c<BLiveEnvelope> postSelectedShareItem(String str, List<String> list, String str2) {
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221802b("/voice-rooms/" + str + "/share-users")).m182288p().m182300c("scene", str2).m182301d();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            jSONObject.put("userIds", jSONArray);
        } catch (JSONException unused) {
        }
        return vrv.m202555p(rnlVarM182301d, "getVoiceRoomShareList" + str, jSONObject.toString());
    }

    public static C22421c<BLiveExtraResponse> publicVoiceRoom(String str) {
        rnl.C19886a c19886aM68490m = LiveApiBuilder.m68490m(zvr.m221802b("/voice-lives/" + str));
        c19886aM68490m.m182300c("type", "public");
        return vrv.m202542c(c19886aM68490m.m182301d(), "voice-lives/public", BLiveExtraResponse.JSON_ADAPTER);
    }

    public static C22421c<List<j7u>> queryCurrentLivesInfo(@NonNull List<String> list) {
        String strM197179d = upq.m197175h(Constants.SEPARATOR_COMMA).m197179d(list);
        return vrv.m202547h(rnl.m182263l(rnl.m182263l(zvr.m221802b("/voice-lives")).m182288p().m182300c(FirebaseAnalytics.Event.SEARCH, GiftAction.given).m182300c("ids", strM197179d).toString()), "livesInfo" + strM197179d).map(new qcj() { // from class: l.vlo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jyb.m147486Q(((BLiveEnvelope) obj).data.voiceRoomFeeds, new qcj() { // from class: l.pko0
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return VoiceRoomApiProvider.m78856w((BLiveVoiceRoomFeed) obj2);
                    }
                });
            }
        });
    }

    public static C22421c<ArrayList<String>> refreshManager(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/voice-lives/" + str + "/managers")), "refreshRoomManager").map(new qcj() { // from class: l.alo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VoiceRoomApiProvider.m78824F((BLiveEnvelope) obj);
            }
        });
    }

    public static C22421c<BLiveVoice> refreshStreamAddress(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/voice-lives/" + str)), "refreshStreamAddress" + str).map(new qcj() { // from class: l.glo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceLives.get(0);
            }
        });
    }

    public static C22421c<BLiveEnvelope> requestBottomButtons(String str, boolean z, boolean z2, String str2, String str3) {
        String strConcat = (z ? "anchor" : "audience").concat(z2 ? "-caller" : "");
        return vrv.m202562w(rnl.m182265r(zvr.m221802b("/voice-live-bottomMenu")).m182288p().m182300c("roomId", str).m182300c("userType", strConcat).m182300c("liveMode", str2).m182300c("anchorId", str3).m182301d(), "requestBottomButtons" + str + strConcat);
    }

    public static C22421c<BLiveEnvelope> requestHistoryMessages(String str, String str2, long j, long j2) {
        rnl.C19886a c19886aM182300c = rnl.m182263l(zvr.m221802b("/voice-rooms/" + str2 + "/messages/history")).m182288p().m182300c("live", String.valueOf(str)).m182300c("templateType", "profit");
        if (j >= 0) {
            c19886aM182300c.m182300c("lastSeq", String.valueOf(j));
        }
        if (j2 >= 0) {
            c19886aM182300c.m182300c("currentSeq", String.valueOf(j2));
        }
        return vrv.m202562w(c19886aM182300c.m182301d(), "voice-requestHistoryMessages" + str + "_" + str2 + "_" + j + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + j2);
    }

    public static C22421c<BLiveEnvelope> requestMembers(String str, int i, String str2) {
        rnl.C19886a c19886aM182300c = rnl.m182263l(zvr.m221802b("/voice-rooms/" + str + "/members")).m182288p().m182300c("with", "users,followships,voice-live-user-mask,medal,hierarchy").m182300c(Constants.KEY_LIMIT, String.valueOf(i)).m182300c("type", "summary");
        if (!TextUtils.isEmpty(str2)) {
            c19886aM182300c.m182300c("lastEntryTime", str2);
        }
        return vrv.m202562w(c19886aM182300c.m182301d(), "requestMembers").doOnNext(new y20() { // from class: l.nlo0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((jfv) zrv.m221194l(htd0.f111520b)).m144725l(((BLiveEnvelope) obj).data.users);
            }
        });
    }

    public static C22421c<BLiveEnvelope> requestMessages(String str, String str2) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/voice-rooms/" + str2 + "/messages")).m182288p().m182300c("live", String.valueOf(str)).m182300c("templateType", "profit").m182301d(), "voice-requestMessages");
    }

    public static C22421c<BLiveEnvelope> resetPopularity(String str) {
        return vrv.m202555p(rnl.m182263l(zvr.m221802b("/voicelive/reset-popularity/" + str)).m182288p().m182301d(), "deFriendWithUserId", "");
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ ArrayList m78854u(BLiveEnvelope bLiveEnvelope) {
        return new ArrayList(jyb.m147486Q(bLiveEnvelope.data.voiceManagers, new qcj() { // from class: l.zko0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveVoiceManager) obj).userId;
            }
        }));
    }

    public static C22421c<uxj0> unMuteWords(String str, String str2) {
        return vrv.m202549j(rnl.m182263l(zvr.m221802b("/voice-rooms/" + str + "/jailedlist/" + str2)), "unMuteWords", "").map(new qcj() { // from class: l.hko0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ j7u m78856w(BLiveVoiceRoomFeed bLiveVoiceRoomFeed) {
        return new j7u(bLiveVoiceRoomFeed.liveId, BLiveState.get(bLiveVoiceRoomFeed.state));
    }

    public static C22421c<BLiveEnvelope> getVoiceRoomShareList(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/voice-rooms/" + str + "/share-users")).m182288p().m182301d(), "getVoiceRoomShareList" + str);
    }

    public static C22421c<BLiveEnvelope> postSelectedShareItem(String str, List<String> list) {
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221802b("/voice-rooms/" + str + "/share-users")).m182288p().m182301d();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            jSONObject.put("userIds", jSONArray);
        } catch (JSONException unused) {
        }
        return vrv.m202555p(rnlVarM182301d, "getVoiceRoomShareList" + str, jSONObject.toString());
    }

    public static C22421c<ugd0> getLiveInfo(String str) {
        return getLiveInfoWithUses(str);
    }

    public static C22421c<ugd0> getLiveInfo(BLiveAbsData bLiveAbsData) {
        return getLiveInfo(bLiveAbsData.f45171id, true, true, "0", bLiveAbsData.callback);
    }

    public static C22421c<BLiveEnvelope> requestHistoryMessages(String str, String str2) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/voice-rooms/" + str2 + "/messages/history")).m182288p().m182300c("live", String.valueOf(str)).m182300c("templateType", "profit").m182301d(), "voice-requestMessages");
    }

    public static C22421c<BLiveEnvelope> requestHistoryMessages(String str, String str2, String str3) {
        return vrv.m202562w(rnl.m182263l(rnl.m182263l(zvr.m221802b("/voice-rooms/" + str2 + "/messages/history")).m182288p().m182300c("live", String.valueOf(str)).m182300c("templateType", "profit").m182301d().toString() + "&" + str3), "voice-requestHistoryMessages" + str + "_" + str2 + "_" + str3);
    }
}
