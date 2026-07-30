package com.p046p1.mobile.putong.live.livingroom.voice.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.data.GiftAction;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p046p1.mobile.putong.live.base.apibean.IntlLiveOperationItemBean;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p046p1.mobile.putong.live.base.data.BLiveBossCall;
import com.p046p1.mobile.putong.live.base.data.BLiveBossGiftRecord;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlMedalWall;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationActionAfterCountdown;
import com.p046p1.mobile.putong.live.base.data.BLiveState;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceHeartBeat;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceHeatBoxEntrance;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceManager;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceManagerInvite;
import com.p046p1.mobile.putong.live.base.data.BLiveVoicePkInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoicePopTotal;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceTopic;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p149l.bgv;
import p149l.cll;
import p149l.e30;
import p149l.fld0;
import p149l.g7t;
import p149l.i5u;
import p149l.ig3;
import p149l.lsi0;
import p149l.mt0;
import p149l.r8d0;
import p149l.roj0;
import p149l.upv;
import p149l.vnq;
import p149l.vwb;
import p149l.w9j;
import p149l.xtr;
import p149l.ypv;
import p149l.ytr;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceRoomApiProvider {
    /* JADX INFO: renamed from: E */
    public static /* synthetic */ C22306c m77640E(String str, String str2, BLiveEnvelope bLiveEnvelope) {
        lsi0.m151580j(str);
        return upv.m194935w(cll.m107499l(ytr.m216073b("/voice-lives/" + str2 + "/managers")), "updateManager");
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ ArrayList m77641F(BLiveEnvelope bLiveEnvelope) {
        return new ArrayList(vwb.m200303Q(bLiveEnvelope.data.voiceManagers, new w9j() { // from class: l.pco0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveVoiceManager) obj).userId;
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ BLiveVoiceRoom m77646K(BLiveEnvelope bLiveEnvelope) {
        return vwb.m200296J(bLiveEnvelope.data.voiceRooms) ? BLiveVoiceRoom.EMPTY_ROOM : bLiveEnvelope.data.voiceRooms.get(0);
    }

    public static C22306c<BLiveEnvelope> addDeFriendWithUserId(String str, String str2) {
        return upv.m194928p(cll.m107499l(ytr.m216073b("/voice-rooms/" + str + "/blacklist/" + str2 + "?method=put")).m107524p().m107537d(), "deFriendWithUserId", "");
    }

    public static C22306c<roj0> bossAnchorAway(String str) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/voice-calls/" + str)).m107524p().m107536c("action", "boss-anchor-away").m107537d(), "bossAnchorAway" + str, "").map(new w9j() { // from class: l.gbo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    private static C22306c<BLiveEnvelope> buildRoomPutReq(cll cllVar, String str) {
        return upv.m194933u(cllVar, "getInRoom" + str, "");
    }

    private static boolean checkDataSize(List list) {
        if (list != null && list.size() != 0) {
            return true;
        }
        ig3.m135964a("data is null");
        return false;
    }

    public static C22306c<roj0> closeFreeCall(String str) {
        return upv.m194922j(cll.m107499l(ytr.m216073b("/voice-rooms/" + str + "/free-call")), "closeFreeCall" + str, "").map(new w9j() { // from class: l.obo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    public static C22306c<roj0> deleteManager(String str, String str2) {
        return upv.m194913a(cll.m107499l(ytr.m216073b("/voice-lives/" + str + "/managers/" + str2)).m107524p().m107537d(), "deleteManager" + str2 + str, "").map(new w9j() { // from class: l.ebo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Boolean m77655e(boolean z, BLiveEnvelope bLiveEnvelope) {
        if (z) {
            return Boolean.valueOf((vwb.m200296J(bLiveEnvelope.data.voiceLives) || vwb.m200296J(bLiveEnvelope.data.users)) ? false : true);
        }
        return Boolean.valueOf(!vwb.m200296J(bLiveEnvelope.data.voiceLives));
    }

    public static C22306c<roj0> forbiddenWords(String str, String str2) {
        return upv.m194932t(cll.m107499l(ytr.m216073b("/voice-rooms/" + str + "/jailedlist/" + str2)), "forbiddenWords", "").map(new w9j() { // from class: l.hbo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    public static C22306c<BLiveAnchor> getAnchorInfo(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/anchors/" + str)).m107524p().m107536c("source", "voice").m107537d(), "anchorInfo" + str).filter(new w9j() { // from class: l.fco0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J(((BLiveEnvelope) obj).data.anchors));
            }
        }).map(new w9j() { // from class: l.gco0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.anchors.get(0);
            }
        });
    }

    public static C22306c<BLiveBossCall> getBossCall(String str, String str2) {
        return upv.m194920h(cll.m107499l(ytr.m216073b("/voice-live-boss/calls")).m107524p().m107536c("liveId", str2).m107536c("userId", str).m107537d(), "getVoiceGiftDetail" + str).map(new w9j() { // from class: l.ubo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.bossCall;
            }
        });
    }

    public static C22306c<BLiveAbsData> getCurrentLiveInfoWithoutUsers(String str) {
        return getLiveInfo(str, false, false, "0", null).map(new w9j() { // from class: l.ico0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((r8d0) obj).f187610c;
            }
        });
    }

    public static C22306c<List<BLiveVoiceManager>> getCurrentLiveManagers(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/voice-lives/" + str + "/managers")).m107524p().m107537d(), "getCurrentLiveManagers" + str).map(new w9j() { // from class: l.lco0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceManagers;
            }
        });
    }

    public static C22306c<BLiveBossGiftRecord> getGiftRecord(String str, String str2, int i, int i2) {
        return upv.m194920h(cll.m107499l(ytr.m216073b("/voice-live-boss/giftRecord")).m107524p().m107536c("liveId", str).m107536c("otherUserId", str2).m107536c(OMSTemplateModeType.page, i + "").m107536c("pageSize", i2 + "").m107537d(), "getVoiceGiftDetail" + str2).map(new w9j() { // from class: l.mco0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.bossGiftRecord;
            }
        });
    }

    public static C22306c<BLiveVoiceHeatBoxEntrance> getHeatBoxData(String str) {
        return upv.m194920h(cll.m107499l(ytr.m216076e("/heat-box/client/entrance?roomId=" + str)).m107524p().m107537d(), "getHeatBoxData").map(new w9j() { // from class: l.eco0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.heatBoxEntrance;
            }
        });
    }

    public static C22306c<BLiveEnvelope> getInRoom(String str, String str2, String str3, String str4, String str5) {
        return buildRoomPutReq(LiveApiBuilder.m67315u(ytr.m216073b("/voice-rooms/" + str + "/members/" + str2), mt0.m156174a("source", str3), mt0.m156174a("userId", str4), mt0.m156174a("sessionId", str5), mt0.m156174a("with", "voice-room-taginfo")), "getInRoom" + str);
    }

    public static C22306c<BaseLiveListBean<IntlLiveOperationItemBean>> getIntlLiveOperations(String str, String str2, String str3) {
        return upv.m194934v(LiveApiBuilder.m67315u(ytr.m216073b("/intl-live-operations"), mt0.m156174a("roomId", str), mt0.m156174a("liveMode", str2), mt0.m156174a("userType", str3)), "getIntlLiveOperations" + str + str3, g7t.m124728a(IntlLiveOperationItemBean.class, "operations"));
    }

    public static C22306c<List<BLiveVoice>> getLatestLive(String str, String str2) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/users/" + str + "/voice-lives")).m107524p().m107536c("state", "latest").m107536c("voiceRoomId", str2).m107537d(), "getLatestLive").map(new w9j() { // from class: l.kco0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceLives;
            }
        });
    }

    public static C22306c<r8d0> getLiveInfo(String str, final boolean z, boolean z2, String str2, String str3) {
        cll.C16188a c16188aM107536c = cll.m107499l(ytr.m216073b("/voice-lives/" + str)).m107524p().m107536c(BLiveOperationActionAfterCountdown.refresh, String.valueOf(z2)).m107536c("errcode", String.valueOf(str2));
        if (z) {
            c16188aM107536c.m107536c("with", "voice-rooms,users,relationships");
        }
        if (!TextUtils.isEmpty(str3)) {
            c16188aM107536c.m107536c("callback", str3);
        }
        return upv.m194920h(c16188aM107536c.m107537d(), "getLiveInfo" + str).filter(new w9j() { // from class: l.jbo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VoiceRoomApiProvider.m77655e(z, (BLiveEnvelope) obj);
            }
        }).map(new w9j() { // from class: l.kbo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                BLiveEnvelope bLiveEnvelope = (BLiveEnvelope) obj;
                return new r8d0(vwb.m200296J(bLiveEnvelope.data.users) ? null : bLiveEnvelope.data.users.get(0), vwb.m200296J(bLiveEnvelope.data.voiceRooms) ? BLiveVoiceRoom.new_() : bLiveEnvelope.data.voiceRooms.get(0), bLiveEnvelope.data.voiceLives.get(0), vwb.m200296J(bLiveEnvelope.data.followships) ? Followship.new_() : bLiveEnvelope.data.followships.get(0), null).m178246d(bLiveEnvelope).m178247e(bLiveEnvelope);
            }
        });
    }

    public static C22306c<r8d0> getLiveInfoForError(BLiveAbsData bLiveAbsData, String str) {
        return getLiveInfo(bLiveAbsData.f44323id, true, true, str, bLiveAbsData.callback);
    }

    public static C22306c<r8d0> getLiveInfoWithUses(String str) {
        return getLiveInfo(str, true, true, "0", null);
    }

    public static C22306c<BLiveEnvelope> getLiveVoiceHeartBeatReward(String str, String str2, String str3) {
        return upv.m194935w(cll.m107499l(cll.m107499l(ytr.m216073b("/voice-lives/" + str + "/heartbeat-reward-list")).m107524p().m107536c(Constants.KEY_LIMIT, str2).m107536c("paged", str3).m107536c("with", "voice-live-user-mask").toString()), "getLiveVoiceHeartBeatReward" + str);
    }

    public static C22306c<List<BLiveVoiceManagerInvite>> getManagerInvites(String str, String str2, String str3) {
        cll.C16188a c16188aM107536c = cll.m107499l(ytr.m216073b("/voice-lives/" + str + "/manager-invites")).m107524p().m107536c("tab", str2);
        if (!TextUtils.isEmpty(str3)) {
            c16188aM107536c.m107536c("lastEntryTime", str3);
        }
        return upv.m194935w(c16188aM107536c.m107537d(), "getManagerInvites" + str + str2).map(new w9j() { // from class: l.aco0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceManagerInvites;
            }
        });
    }

    public static C22306c<BLiveIntlMedalWall> getMedalWallData(String str) {
        return upv.m194920h(cll.m107499l(ytr.m216073b("/intl/medal-wall/") + str).m107524p().m107537d(), "getMedalWallData" + str).map(new w9j() { // from class: l.zbo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.medalWall;
            }
        });
    }

    public static C22306c<List<BLiveVoice>> getOnGoingLive(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/users/" + str + "/voice-lives")).m107524p().m107536c("state", "ongoing").m107537d(), "onGoingLive").map(new w9j() { // from class: l.mbo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VoiceRoomApiProvider.m77665o((BLiveEnvelope) obj);
            }
        });
    }

    public static void getOutRoom(String str, String str2, String str3) {
        cll cllVarM67315u = LiveApiBuilder.m67315u(ytr.m216073b("/voice-rooms/" + str + "/members/" + str2), new mt0("sessionId", str3));
        StringBuilder sb = new StringBuilder("getOutRoom");
        sb.append(str);
        upv.m194922j(cllVarM67315u, sb.toString(), "");
    }

    public static C22306c<BLiveVoiceRoom> getRoomInfo(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/users/" + str + "/voice-rooms")), "getRoomInfo").map(new w9j() { // from class: l.nco0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VoiceRoomApiProvider.m77646K((BLiveEnvelope) obj);
            }
        });
    }

    public static C22306c<List<BLiveVoiceTopic>> getRoomTopics(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/voice-rooms/" + str + "/voice-room-topics")), "getRoomTopics" + str).map(new w9j() { // from class: l.dco0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.topics;
            }
        });
    }

    public static C22306c<String> getShareUrl(String str, String str2, String str3) {
        return upv.m194920h(cll.m107499l(ytr.m216076e("/share-room-config")).m107524p().m107536c("shareType", str).m107536c("roomType", "voice").m107536c("roomId", str2).m107536c("scene", str3).m107537d(), "getShareUrl" + str).map(new w9j() { // from class: l.oco0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.shareRoomConfig.url;
            }
        });
    }

    public static C22306c<BLiveUserMask> getUserMask(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/users/" + str + "/voiceLiveUserMasks")), "getUserMask" + str).filter(new w9j() { // from class: l.pbo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(VoiceRoomApiProvider.checkDataSize(((BLiveEnvelope) obj).data.masks));
            }
        }).map(new w9j() { // from class: l.qbo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.masks.get(0);
            }
        });
    }

    public static C22306c<Boolean> getVoiceCommerCialAssert(String str) {
        return upv.m194920h(cll.m107499l(ytr.m216080i("/" + str + "/voice-live-assert")), "getVoiceCommerCialAssert" + str).map(new w9j() { // from class: l.xbo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.voiceLiveAssert.canCreateCommercialRoom);
            }
        });
    }

    public static C22306c<BLiveVoiceHeartBeat> getVoiceLiveHeartBeat(String str) {
        return upv.m194935w(LiveApiBuilder.m67307m(ytr.m216073b("/voice-lives/" + str + "/heartbeat")).m107537d(), "getVoiceLiveHeartBeat" + str).map(new w9j() { // from class: l.qco0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceLiveHeartBeat;
            }
        });
    }

    public static C22306c<BLiveVoicePopTotal> getVoiceLivePopTotalValue(String str, String str2) {
        cll.C16188a c16188aM67307m = LiveApiBuilder.m67307m(ytr.m216073b("/voice-lives/" + str + "/pop"));
        c16188aM67307m.m107536c("anchorId", str2);
        return upv.m194935w(c16188aM67307m.m107537d(), "getVoiceRoomPopValue" + str).map(new w9j() { // from class: l.fbo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceLivePopsTotal;
            }
        });
    }

    public static C22306c<BLiveEnvelope> getVoiceLiveSummaries(String str, boolean z) {
        cll.C16188a c16188aM67307m = LiveApiBuilder.m67307m(ytr.m216073b("/voice-lives/" + str + "/summaries"));
        if (z) {
            c16188aM67307m.m107536c("with", "voice-live-user-mask");
        }
        return upv.m194935w(c16188aM67307m.m107537d(), "getLiveSummaries" + str);
    }

    public static C22306c<BLiveVoicePkInfo> getVoicePkDetail(String str) {
        return upv.m194920h(cll.m107499l(ytr.m216073b("/voice-pk/pkInfo")).m107524p().m107536c("roomId", str).m107537d(), "getVoicePkDetail" + str).map(new w9j() { // from class: l.nbo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voicePkInfo;
            }
        });
    }

    public static C22306c<BLiveEnvelope> getVoiceRoomShareList(String str, String str2) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/voice-rooms/" + str + "/share-users")).m107524p().m107536c("scene", str2).m107537d(), "getVoiceRoomShareList" + str);
    }

    public static C22306c<roj0> inviteBecomeManager(String str, String str2, String str3) {
        cll cllVarM107537d = cll.m107499l(ytr.m216073b("/voice-lives/" + str + "/manager-invites")).m107524p().m107537d();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userId", str2);
            jSONObject.put("type", str3);
        } catch (JSONException unused) {
        }
        return upv.m194928p(cllVarM107537d, "inviteBecomeManager" + str + str2 + str3, jSONObject.toString()).map(new w9j() { // from class: l.ibo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    public static C22306c<roj0> kickOffPerson(String str, String str2) {
        return upv.m194922j(cll.m107499l(ytr.m216073b("/voice-rooms/" + str + "/members/" + str2)), "kickOffPerson", "").map(new w9j() { // from class: l.hco0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m77663m(String str, Throwable th) {
        if (xtr.m211022b(51025, th) || xtr.m211022b(51027, th)) {
            lsi0.m151580j(((TantanException.Client.CoreService) th).metaMessage);
        } else {
            lsi0.m151580j(str);
        }
    }

    public static C22306c<ArrayList<String>> manageRoomManager(final String str, String str2, boolean z) {
        C22306c<BLiveEnvelope> c22306cM194913a;
        final String string;
        final String string2;
        cll cllVarM107499l = cll.m107499l(ytr.m216073b("/voice-lives/" + str + "/managers/" + str2));
        if (z) {
            c22306cM194913a = upv.m194919g(cllVarM107499l, "manageRoomManager", "");
            string = ypv.f199497e.getString(R$string.f47224f0);
            string2 = ypv.f199497e.getString(R$string.f47246g0);
        } else {
            c22306cM194913a = upv.m194913a(cllVarM107499l, "manageRoomManager", "");
            string = ypv.f199497e.getString(R$string.f47062Xb);
            string2 = ypv.f199497e.getString(R$string.f47083Yb);
        }
        return c22306cM194913a.doOnError(new e30() { // from class: l.rbo0
            @Override // p149l.e30
            public final void call(Object obj) {
                VoiceRoomApiProvider.m77663m(string, (Throwable) obj);
            }
        }).flatMap(new w9j() { // from class: l.sbo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VoiceRoomApiProvider.m77640E(string2, str, (BLiveEnvelope) obj);
            }
        }).map(new w9j() { // from class: l.tbo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VoiceRoomApiProvider.m77671u((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ List m77665o(BLiveEnvelope bLiveEnvelope) {
        ((bgv) ypv.m215673l(fld0.f98151f)).m101715C(bLiveEnvelope.data.intlConfig.switchStar);
        return bLiveEnvelope.data.voiceLives;
    }

    public static C22306c<roj0> openFreeCall(String str) {
        return upv.m194932t(cll.m107499l(ytr.m216073b("/voice-rooms/" + str + "/free-call")), "openFreeCall" + str, "").map(new w9j() { // from class: l.bco0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    public static C22306c<roj0> operationManagerInvite(String str, String str2, String str3) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/voice-lives/" + str + "/manager-invites/" + str2)).m107524p().m107536c("action", str3).m107537d(), "operationManagerInvite" + str + str2 + str3, "").map(new w9j() { // from class: l.ybo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    public static C22306c<BLiveEnvelope> postSelectedShareItem(String str, List<String> list, String str2) {
        cll cllVarM107537d = cll.m107499l(ytr.m216073b("/voice-rooms/" + str + "/share-users")).m107524p().m107536c("scene", str2).m107537d();
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
        return upv.m194928p(cllVarM107537d, "getVoiceRoomShareList" + str, jSONObject.toString());
    }

    public static C22306c<BLiveExtraResponse> publicVoiceRoom(String str) {
        cll.C16188a c16188aM67307m = LiveApiBuilder.m67307m(ytr.m216073b("/voice-lives/" + str));
        c16188aM67307m.m107536c("type", "public");
        return upv.m194915c(c16188aM67307m.m107537d(), "voice-lives/public", BLiveExtraResponse.JSON_ADAPTER);
    }

    public static C22306c<List<i5u>> queryCurrentLivesInfo(@NonNull List<String> list) {
        String strM199044d = vnq.m199040h(Constants.SEPARATOR_COMMA).m199044d(list);
        return upv.m194920h(cll.m107499l(cll.m107499l(ytr.m216073b("/voice-lives")).m107524p().m107536c(FirebaseAnalytics.Event.SEARCH, GiftAction.given).m107536c("ids", strM199044d).toString()), "livesInfo" + strM199044d).map(new w9j() { // from class: l.rco0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vwb.m200303Q(((BLiveEnvelope) obj).data.voiceRoomFeeds, new w9j() { // from class: l.lbo0
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return VoiceRoomApiProvider.m77673w((BLiveVoiceRoomFeed) obj2);
                    }
                });
            }
        });
    }

    public static C22306c<ArrayList<String>> refreshManager(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/voice-lives/" + str + "/managers")), "refreshRoomManager").map(new w9j() { // from class: l.wbo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VoiceRoomApiProvider.m77641F((BLiveEnvelope) obj);
            }
        });
    }

    public static C22306c<BLiveVoice> refreshStreamAddress(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/voice-lives/" + str)), "refreshStreamAddress" + str).map(new w9j() { // from class: l.cco0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceLives.get(0);
            }
        });
    }

    public static C22306c<BLiveEnvelope> requestBottomButtons(String str, boolean z, boolean z2, String str2, String str3) {
        String strConcat = (z ? "anchor" : "audience").concat(z2 ? "-caller" : "");
        return upv.m194935w(cll.m107501r(ytr.m216073b("/voice-live-bottomMenu")).m107524p().m107536c("roomId", str).m107536c("userType", strConcat).m107536c("liveMode", str2).m107536c("anchorId", str3).m107537d(), "requestBottomButtons" + str + strConcat);
    }

    public static C22306c<BLiveEnvelope> requestHistoryMessages(String str, String str2, long j, long j2) {
        cll.C16188a c16188aM107536c = cll.m107499l(ytr.m216073b("/voice-rooms/" + str2 + "/messages/history")).m107524p().m107536c("live", String.valueOf(str)).m107536c("templateType", "profit");
        if (j >= 0) {
            c16188aM107536c.m107536c("lastSeq", String.valueOf(j));
        }
        if (j2 >= 0) {
            c16188aM107536c.m107536c("currentSeq", String.valueOf(j2));
        }
        return upv.m194935w(c16188aM107536c.m107537d(), "voice-requestHistoryMessages" + str + "_" + str2 + "_" + j + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + j2);
    }

    public static C22306c<BLiveEnvelope> requestMembers(String str, int i, String str2) {
        cll.C16188a c16188aM107536c = cll.m107499l(ytr.m216073b("/voice-rooms/" + str + "/members")).m107524p().m107536c("with", "users,followships,voice-live-user-mask,medal,hierarchy").m107536c(Constants.KEY_LIMIT, String.valueOf(i)).m107536c("type", "summary");
        if (!TextUtils.isEmpty(str2)) {
            c16188aM107536c.m107536c("lastEntryTime", str2);
        }
        return upv.m194935w(c16188aM107536c.m107537d(), "requestMembers").doOnNext(new e30() { // from class: l.jco0
            @Override // p149l.e30
            public final void call(Object obj) {
                ((idv) ypv.m215673l(fld0.f98147b)).m135640l(((BLiveEnvelope) obj).data.users);
            }
        });
    }

    public static C22306c<BLiveEnvelope> requestMessages(String str, String str2) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/voice-rooms/" + str2 + "/messages")).m107524p().m107536c("live", String.valueOf(str)).m107536c("templateType", "profit").m107537d(), "voice-requestMessages");
    }

    public static C22306c<BLiveEnvelope> resetPopularity(String str) {
        return upv.m194928p(cll.m107499l(ytr.m216073b("/voicelive/reset-popularity/" + str)).m107524p().m107537d(), "deFriendWithUserId", "");
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ ArrayList m77671u(BLiveEnvelope bLiveEnvelope) {
        return new ArrayList(vwb.m200303Q(bLiveEnvelope.data.voiceManagers, new w9j() { // from class: l.vbo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveVoiceManager) obj).userId;
            }
        }));
    }

    public static C22306c<roj0> unMuteWords(String str, String str2) {
        return upv.m194922j(cll.m107499l(ytr.m216073b("/voice-rooms/" + str + "/jailedlist/" + str2)), "unMuteWords", "").map(new w9j() { // from class: l.dbo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ i5u m77673w(BLiveVoiceRoomFeed bLiveVoiceRoomFeed) {
        return new i5u(bLiveVoiceRoomFeed.liveId, BLiveState.get(bLiveVoiceRoomFeed.state));
    }

    public static C22306c<BLiveEnvelope> getVoiceRoomShareList(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/voice-rooms/" + str + "/share-users")).m107524p().m107537d(), "getVoiceRoomShareList" + str);
    }

    public static C22306c<BLiveEnvelope> postSelectedShareItem(String str, List<String> list) {
        cll cllVarM107537d = cll.m107499l(ytr.m216073b("/voice-rooms/" + str + "/share-users")).m107524p().m107537d();
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
        return upv.m194928p(cllVarM107537d, "getVoiceRoomShareList" + str, jSONObject.toString());
    }

    public static C22306c<r8d0> getLiveInfo(String str) {
        return getLiveInfoWithUses(str);
    }

    public static C22306c<r8d0> getLiveInfo(BLiveAbsData bLiveAbsData) {
        return getLiveInfo(bLiveAbsData.f44323id, true, true, "0", bLiveAbsData.callback);
    }

    public static C22306c<BLiveEnvelope> requestHistoryMessages(String str, String str2) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/voice-rooms/" + str2 + "/messages/history")).m107524p().m107536c("live", String.valueOf(str)).m107536c("templateType", "profit").m107537d(), "voice-requestMessages");
    }

    public static C22306c<BLiveEnvelope> requestHistoryMessages(String str, String str2, String str3) {
        return upv.m194935w(cll.m107499l(cll.m107499l(ytr.m216073b("/voice-rooms/" + str2 + "/messages/history")).m107524p().m107536c("live", String.valueOf(str)).m107536c("templateType", "profit").m107537d().toString() + "&" + str3), "voice-requestHistoryMessages" + str + "_" + str2 + "_" + str3);
    }
}
