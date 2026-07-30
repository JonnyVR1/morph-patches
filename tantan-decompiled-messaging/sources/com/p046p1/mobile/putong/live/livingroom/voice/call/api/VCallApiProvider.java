package com.p046p1.mobile.putong.live.livingroom.voice.call.api;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p046p1.mobile.putong.live.base.data.BLiveUserRightResource;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCallInvite;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCallSummary;
import com.p046p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import java.util.List;
import p133rx.C22306c;
import p149l.ahn0;
import p149l.cll;
import p149l.ig3;
import p149l.kmn0;
import p149l.upv;
import p149l.vdt;
import p149l.vwb;
import p149l.w3o0;
import p149l.w9j;
import p149l.ytr;

/* JADX INFO: loaded from: classes5.dex */
public class VCallApiProvider {
    /* JADX INFO: renamed from: E */
    public static /* synthetic */ w3o0 m77798E(boolean z, boolean z2, int i, BLiveEnvelope bLiveEnvelope) {
        return new w3o0(bLiveEnvelope.data, z, bLiveEnvelope.pagination.total, z2, i);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ kmn0 m77804K(boolean z, BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new kmn0(bLiveData.voiceCalls, bLiveData.users, bLiveData.masks, z, bLiveData.starlightHierarchies);
    }

    public static C22306c<BLiveVoiceCall> agreeVoiceCall(String str) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/voice-calls/" + str)).m107524p().m107536c("action", "anchor-voice-approved").m107537d(), "voice-agreeVoiceCall", "").filter(new w9j() { // from class: l.tjk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(VCallApiProvider.checkDataSize(((BLiveEnvelope) obj).data.voiceCalls));
            }
        }).map(new w9j() { // from class: l.ujk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCalls.get(0);
            }
        });
    }

    public static C22306c<BLiveVoiceCall> applyCallInvite(BLiveVoiceCall bLiveVoiceCall) {
        return upv.m194928p(cll.m107499l(ytr.m216073b("/voice-calls")).m107524p().m107537d(), "voice-applyCallInvite", bLiveVoiceCall.toJson()).filter(new w9j() { // from class: l.ajk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(VCallApiProvider.checkDataSize(((BLiveEnvelope) obj).data.voiceCalls));
            }
        }).map(new w9j() { // from class: l.ljk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCalls.get(0);
            }
        });
    }

    public static C22306c<kmn0> callApplyList(String str, final boolean z, String str2) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/voice-calls")).m107524p().m107536c("with", "users,voice-live-user-mask").m107536c("state", "created").m107536c("voiceLiveId", str).m107536c("liveMode", str2).m107537d(), "callApplyList").map(new w9j() { // from class: l.uik0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VCallApiProvider.m77827w(z, (BLiveEnvelope) obj);
            }
        });
    }

    public static C22306c<BLiveVoiceCallInvite> callInvite(String str, String str2, int i) {
        String strM216073b = ytr.m216073b("/voice-call-invites");
        BLiveVoiceCallInvite bLiveVoiceCallInvite = new BLiveVoiceCallInvite();
        bLiveVoiceCallInvite.voiceLiveId = str;
        bLiveVoiceCallInvite.f44487to = str2;
        bLiveVoiceCallInvite.intendPosition = i;
        return upv.m194928p(cll.m107499l(strM216073b), "voice-callInvite", bLiveVoiceCallInvite.toJson()).filter(new w9j() { // from class: l.bjk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(VCallApiProvider.checkDataSize(((BLiveEnvelope) obj).data.voiceCallInvites));
            }
        }).map(new w9j() { // from class: l.cjk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCallInvites.get(0);
            }
        });
    }

    public static C22306c<ahn0> callInviteList(String str, final boolean z) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/voice-call-invites")).m107524p().m107536c("with", "users,voice-live-user-mask").m107536c("voiceLiveId", str).m107537d(), "voice-callInviteList").map(new w9j() { // from class: l.pik0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VCallApiProvider.m77817m(z, (BLiveEnvelope) obj);
            }
        });
    }

    public static C22306c<BLiveVoiceCallSummary> callSummary(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/voice-calls/" + str + "/summaries")), "voice-callSummary").map(new w9j() { // from class: l.vik0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCallSummaries.get(0);
            }
        });
    }

    public static C22306c<BLiveVoiceCall> cancelCallApply(String str) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/voice-calls/" + str)).m107524p().m107536c("action", "user-voice-canceled").m107537d(), "voice-cancelCallApply", "").filter(new w9j() { // from class: l.mjk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(VCallApiProvider.checkDataSize(((BLiveEnvelope) obj).data.voiceCalls));
            }
        }).map(new w9j() { // from class: l.njk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCalls.get(0);
            }
        });
    }

    private static boolean checkDataSize(List list) {
        if (list != null && list.size() != 0) {
            return true;
        }
        ig3.m135964a("data is null");
        return false;
    }

    public static C22306c<BLiveVoiceCall> deputyGoAway(String str) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/voice-calls/" + str)).m107524p().m107536c("action", "user-go-away").m107537d(), "voice-deputyGoAway", "").filter(new w9j() { // from class: l.sik0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(VCallApiProvider.checkDataSize(((BLiveEnvelope) obj).data.voiceCalls));
            }
        }).map(new w9j() { // from class: l.tik0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCalls.get(0);
            }
        });
    }

    public static C22306c<BLiveVoiceCall> deputyGoBack(String str) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/voice-calls/" + str)).m107524p().m107536c("action", "user-come-back").m107537d(), "voice-deputyGoBack", "").filter(new w9j() { // from class: l.zjk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(VCallApiProvider.checkDataSize(((BLiveEnvelope) obj).data.voiceCalls));
            }
        }).map(new w9j() { // from class: l.qik0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCalls.get(0);
            }
        });
    }

    public static C22306c<List<BLiveUserRightResource>> getEnterRoomEffect(String str, String str2) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/voiceRoom/enterRoom")).m107524p().m107536c("liveId", str2).m107536c("roomId", str).m107537d(), "getEnterRoomEffect" + str2).map(new w9j() { // from class: l.zik0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.userLiveRightResources;
            }
        });
    }

    public static C22306c<w3o0> getRoomMembers(String str, final boolean z, String str2, final boolean z2, final int i) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/voice-rooms/" + str + "/members")).m107524p().m107536c("type", "summary").m107536c("with", "users,medal").m107536c("liveId", str2).m107537d(), "getRoomMembers" + str).map(new w9j() { // from class: l.sjk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VCallApiProvider.m77798E(z, z2, i, (BLiveEnvelope) obj);
            }
        });
    }

    public static C22306c<BLiveVoiceCall> getSelfCallInfo(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/voice-calls")).m107524p().m107536c("state", "on-voice").m107536c("voiceLiveId", str).m107537d(), "getSelfCallInfo").filter(new w9j() { // from class: l.ojk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.voiceCalls.size() > 0);
            }
        }).map(new w9j() { // from class: l.pjk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VCallApiProvider.m77825u((BLiveEnvelope) obj);
            }
        });
    }

    public static C22306c<List<BLiveVoiceCall>> hangUpVoiceCall(String str, boolean z, String str2) {
        String str3 = (z || "voice-manager".equals(str2)) ? "anchor-hang-up" : "user-hang-up";
        if ("voice-manager".equals(str2)) {
            str2 = "";
        }
        return upv.m194925m(cll.m107499l(ytr.m216073b("/voice-calls/" + str)).m107524p().m107536c("action", str3).m107536c("hangupReason", str2).m107537d(), "voice-hangUpVoiceCall", "").filter(new w9j() { // from class: l.qjk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(VCallApiProvider.checkDataSize(((BLiveEnvelope) obj).data.voiceCalls));
            }
        }).map(new w9j() { // from class: l.rjk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCalls;
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ ahn0 m77817m(boolean z, BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new ahn0(bLiveData.voiceCallInvites, bLiveData.users, bLiveData.masks, z);
    }

    public static C22306c<BLiveEnvelope> openBonusGifts(String str, String str2) {
        String str3 = "{\n\t\"callId\": \"" + str2 + "\"\n}";
        return upv.m194928p(cll.m107499l(ytr.m216080i("/" + str + "/bonus-gifts")), "callSummaryBonusGifts" + str, str3);
    }

    public static C22306c<BLiveVoiceCall> refuseVoiceCall(String str) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/voice-calls/" + str)).m107524p().m107536c("action", "reject").m107537d(), "voice-voice-refuseVoiceCall", "").filter(new w9j() { // from class: l.jjk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(VCallApiProvider.checkDataSize(((BLiveEnvelope) obj).data.voiceCalls));
            }
        }).map(new w9j() { // from class: l.kjk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCalls.get(0);
            }
        });
    }

    public static C22306c<BLiveVoiceCall> reportConnect(String str, boolean z) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/voice-calls/" + str)).m107524p().m107536c("state", "voice-".concat(z ? "success" : "fail")).m107537d(), "reportConnect", "").filter(new w9j() { // from class: l.xik0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(VCallApiProvider.checkDataSize(((BLiveEnvelope) obj).data.voiceCalls));
            }
        }).map(new w9j() { // from class: l.yik0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCalls.get(0);
            }
        });
    }

    public static C22306c<BLiveVoiceCall> requestChangeCallPosition(String str, int i) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/voice-calls/" + str)).m107524p().m107536c("action", "user-change-size").m107536c("wantSize", String.valueOf(i)).m107537d(), "requestChangeCallPosition", "").filter(new w9j() { // from class: l.djk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(VCallApiProvider.checkDataSize(((BLiveEnvelope) obj).data.voiceCalls));
            }
        }).map(new w9j() { // from class: l.ejk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCalls.get(0);
            }
        });
    }

    private static C22306c<BLiveRtcToken> requestRtcSdkToken(String str, String str2, String str3) {
        if (vdt.m198092b(3)) {
            return upv.m194928p(cll.m107499l(str), "requestSdkToken", str2).filter(new w9j() { // from class: l.hjk0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(VCallApiProvider.checkDataSize(((BLiveEnvelope) obj).data.rtcTokens));
                }
            }).map(new w9j() { // from class: l.ijk0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveEnvelope) obj).data.rtcTokens.get(0);
                }
            });
        }
        return upv.m194930r(cll.m107499l(str), "requestSdkToken" + str3, str2).filter(new w9j() { // from class: l.fjk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(VCallApiProvider.checkDataSize(((BLiveEnvelope) obj).data.rtcTokens));
            }
        }).map(new w9j() { // from class: l.gjk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.rtcTokens.get(0);
            }
        });
    }

    public static C22306c<BLiveRtcToken> requestSdkToken(String str, String str2, String str3) {
        return requestRtcSdkToken(ytr.m216073b("/rtc-tokens"), "{\"channel\": \"" + str + "\", \"usage\":\"" + str2 + "\", \"rtcProvider\":\"" + str3 + "\" }", str);
    }

    public static C22306c<BLiveVoiceCall> setMuteDeputy(String str, boolean z, boolean z2) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/voice-calls/" + str)).m107524p().m107536c("action", (z2 ? "anchor" : "user").concat(z ? "-mute" : "-unmute")).m107537d(), "voice-setMuteDeputy", "").filter(new w9j() { // from class: l.xjk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(VCallApiProvider.checkDataSize(((BLiveEnvelope) obj).data.voiceCalls));
            }
        }).map(new w9j() { // from class: l.yjk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCalls.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ BLiveVoiceCall m77825u(BLiveEnvelope bLiveEnvelope) {
        return (BLiveVoiceCall) vwb.m200346r(bLiveEnvelope.data.voiceCalls, new w9j() { // from class: l.wik0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveVoiceCall) obj).user, ypv.f199493a.m199309D0()));
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ kmn0 m77827w(boolean z, BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new kmn0(bLiveData.voiceCalls, bLiveData.users, bLiveData.masks, z, bLiveData.starlightHierarchies);
    }

    public static C22306c<BLiveRtcToken> requestSdkToken(String str, String str2) {
        return requestRtcSdkToken(ytr.m216073b("/rtc-tokens"), "{\"channel\": \"" + str + "\", \"usage\":\"voice-live\", \"rtcProvider\":\"" + str2 + "\" }", str);
    }

    public static C22306c<BLiveVoiceCallInvite> callInvite(String str, String str2) {
        String strM216073b = ytr.m216073b("/voice-call-invites");
        BLiveVoiceCallInvite bLiveVoiceCallInvite = new BLiveVoiceCallInvite();
        bLiveVoiceCallInvite.voiceLiveId = str;
        bLiveVoiceCallInvite.f44487to = str2;
        return upv.m194928p(cll.m107499l(strM216073b), "voice-callInvite", bLiveVoiceCallInvite.toJson()).filter(new w9j() { // from class: l.vjk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(VCallApiProvider.checkDataSize(((BLiveEnvelope) obj).data.voiceCallInvites));
            }
        }).map(new w9j() { // from class: l.wjk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCallInvites.get(0);
            }
        });
    }

    public static C22306c<kmn0> callApplyList(String str, final boolean z) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/voice-calls")).m107524p().m107536c("with", "users,voice-live-user-mask").m107536c("state", "created").m107536c("voiceLiveId", str).m107537d(), "callApplyList").map(new w9j() { // from class: l.rik0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VCallApiProvider.m77804K(z, (BLiveEnvelope) obj);
            }
        });
    }
}
