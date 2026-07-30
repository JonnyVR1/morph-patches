package com.p051p1.mobile.putong.live.livingroom.voice.call.api;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p051p1.mobile.putong.live.base.data.BLiveUserRightResource;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCallInvite;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCallSummary;
import com.p051p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import java.util.List;
import p137rx.C22421c;
import p153l.ado0;
import p153l.eqn0;
import p153l.jyb;
import p153l.ovn0;
import p153l.qcj;
import p153l.rnl;
import p153l.vrv;
import p153l.wft;
import p153l.wg3;
import p153l.zvr;

/* JADX INFO: loaded from: classes5.dex */
public class VCallApiProvider {
    /* JADX INFO: renamed from: E */
    public static /* synthetic */ ado0 m78981E(boolean z, boolean z2, int i, BLiveEnvelope bLiveEnvelope) {
        return new ado0(bLiveEnvelope.data, z, bLiveEnvelope.pagination.total, z2, i);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ ovn0 m78987K(boolean z, BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new ovn0(bLiveData.voiceCalls, bLiveData.users, bLiveData.masks, z, bLiveData.starlightHierarchies);
    }

    public static C22421c<BLiveVoiceCall> agreeVoiceCall(String str) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/voice-calls/" + str)).m182288p().m182300c("action", "anchor-voice-approved").m182301d(), "voice-agreeVoiceCall", "").filter(new qcj() { // from class: l.zsk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(VCallApiProvider.checkDataSize(((BLiveEnvelope) obj).data.voiceCalls));
            }
        }).map(new qcj() { // from class: l.atk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCalls.get(0);
            }
        });
    }

    public static C22421c<BLiveVoiceCall> applyCallInvite(BLiveVoiceCall bLiveVoiceCall) {
        return vrv.m202555p(rnl.m182263l(zvr.m221802b("/voice-calls")).m182288p().m182301d(), "voice-applyCallInvite", bLiveVoiceCall.toJson()).filter(new qcj() { // from class: l.gsk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(VCallApiProvider.checkDataSize(((BLiveEnvelope) obj).data.voiceCalls));
            }
        }).map(new qcj() { // from class: l.rsk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCalls.get(0);
            }
        });
    }

    public static C22421c<ovn0> callApplyList(String str, final boolean z, String str2) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/voice-calls")).m182288p().m182300c("with", "users,voice-live-user-mask").m182300c("state", "created").m182300c("voiceLiveId", str).m182300c("liveMode", str2).m182301d(), "callApplyList").map(new qcj() { // from class: l.ask0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VCallApiProvider.m79010w(z, (BLiveEnvelope) obj);
            }
        });
    }

    public static C22421c<BLiveVoiceCallInvite> callInvite(String str, String str2, int i) {
        String strM221802b = zvr.m221802b("/voice-call-invites");
        BLiveVoiceCallInvite bLiveVoiceCallInvite = new BLiveVoiceCallInvite();
        bLiveVoiceCallInvite.voiceLiveId = str;
        bLiveVoiceCallInvite.f45335to = str2;
        bLiveVoiceCallInvite.intendPosition = i;
        return vrv.m202555p(rnl.m182263l(strM221802b), "voice-callInvite", bLiveVoiceCallInvite.toJson()).filter(new qcj() { // from class: l.hsk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(VCallApiProvider.checkDataSize(((BLiveEnvelope) obj).data.voiceCallInvites));
            }
        }).map(new qcj() { // from class: l.isk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCallInvites.get(0);
            }
        });
    }

    public static C22421c<eqn0> callInviteList(String str, final boolean z) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/voice-call-invites")).m182288p().m182300c("with", "users,voice-live-user-mask").m182300c("voiceLiveId", str).m182301d(), "voice-callInviteList").map(new qcj() { // from class: l.vrk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VCallApiProvider.m79000m(z, (BLiveEnvelope) obj);
            }
        });
    }

    public static C22421c<BLiveVoiceCallSummary> callSummary(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/voice-calls/" + str + "/summaries")), "voice-callSummary").map(new qcj() { // from class: l.bsk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCallSummaries.get(0);
            }
        });
    }

    public static C22421c<BLiveVoiceCall> cancelCallApply(String str) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/voice-calls/" + str)).m182288p().m182300c("action", "user-voice-canceled").m182301d(), "voice-cancelCallApply", "").filter(new qcj() { // from class: l.ssk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(VCallApiProvider.checkDataSize(((BLiveEnvelope) obj).data.voiceCalls));
            }
        }).map(new qcj() { // from class: l.tsk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCalls.get(0);
            }
        });
    }

    private static boolean checkDataSize(List list) {
        if (list != null && list.size() != 0) {
            return true;
        }
        wg3.m206174a("data is null");
        return false;
    }

    public static C22421c<BLiveVoiceCall> deputyGoAway(String str) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/voice-calls/" + str)).m182288p().m182300c("action", "user-go-away").m182301d(), "voice-deputyGoAway", "").filter(new qcj() { // from class: l.yrk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(VCallApiProvider.checkDataSize(((BLiveEnvelope) obj).data.voiceCalls));
            }
        }).map(new qcj() { // from class: l.zrk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCalls.get(0);
            }
        });
    }

    public static C22421c<BLiveVoiceCall> deputyGoBack(String str) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/voice-calls/" + str)).m182288p().m182300c("action", "user-come-back").m182301d(), "voice-deputyGoBack", "").filter(new qcj() { // from class: l.ftk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(VCallApiProvider.checkDataSize(((BLiveEnvelope) obj).data.voiceCalls));
            }
        }).map(new qcj() { // from class: l.wrk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCalls.get(0);
            }
        });
    }

    public static C22421c<List<BLiveUserRightResource>> getEnterRoomEffect(String str, String str2) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/voiceRoom/enterRoom")).m182288p().m182300c("liveId", str2).m182300c("roomId", str).m182301d(), "getEnterRoomEffect" + str2).map(new qcj() { // from class: l.fsk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.userLiveRightResources;
            }
        });
    }

    public static C22421c<ado0> getRoomMembers(String str, final boolean z, String str2, final boolean z2, final int i) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/voice-rooms/" + str + "/members")).m182288p().m182300c("type", "summary").m182300c("with", "users,medal").m182300c("liveId", str2).m182301d(), "getRoomMembers" + str).map(new qcj() { // from class: l.ysk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VCallApiProvider.m78981E(z, z2, i, (BLiveEnvelope) obj);
            }
        });
    }

    public static C22421c<BLiveVoiceCall> getSelfCallInfo(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/voice-calls")).m182288p().m182300c("state", "on-voice").m182300c("voiceLiveId", str).m182301d(), "getSelfCallInfo").filter(new qcj() { // from class: l.usk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.voiceCalls.size() > 0);
            }
        }).map(new qcj() { // from class: l.vsk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VCallApiProvider.m79008u((BLiveEnvelope) obj);
            }
        });
    }

    public static C22421c<List<BLiveVoiceCall>> hangUpVoiceCall(String str, boolean z, String str2) {
        String str3 = (z || "voice-manager".equals(str2)) ? "anchor-hang-up" : "user-hang-up";
        if ("voice-manager".equals(str2)) {
            str2 = "";
        }
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/voice-calls/" + str)).m182288p().m182300c("action", str3).m182300c("hangupReason", str2).m182301d(), "voice-hangUpVoiceCall", "").filter(new qcj() { // from class: l.wsk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(VCallApiProvider.checkDataSize(((BLiveEnvelope) obj).data.voiceCalls));
            }
        }).map(new qcj() { // from class: l.xsk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCalls;
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ eqn0 m79000m(boolean z, BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new eqn0(bLiveData.voiceCallInvites, bLiveData.users, bLiveData.masks, z);
    }

    public static C22421c<BLiveEnvelope> openBonusGifts(String str, String str2) {
        String str3 = "{\n\t\"callId\": \"" + str2 + "\"\n}";
        return vrv.m202555p(rnl.m182263l(zvr.m221809i("/" + str + "/bonus-gifts")), "callSummaryBonusGifts" + str, str3);
    }

    public static C22421c<BLiveVoiceCall> refuseVoiceCall(String str) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/voice-calls/" + str)).m182288p().m182300c("action", "reject").m182301d(), "voice-voice-refuseVoiceCall", "").filter(new qcj() { // from class: l.psk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(VCallApiProvider.checkDataSize(((BLiveEnvelope) obj).data.voiceCalls));
            }
        }).map(new qcj() { // from class: l.qsk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCalls.get(0);
            }
        });
    }

    public static C22421c<BLiveVoiceCall> reportConnect(String str, boolean z) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/voice-calls/" + str)).m182288p().m182300c("state", "voice-".concat(z ? "success" : "fail")).m182301d(), "reportConnect", "").filter(new qcj() { // from class: l.dsk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(VCallApiProvider.checkDataSize(((BLiveEnvelope) obj).data.voiceCalls));
            }
        }).map(new qcj() { // from class: l.esk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCalls.get(0);
            }
        });
    }

    public static C22421c<BLiveVoiceCall> requestChangeCallPosition(String str, int i) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/voice-calls/" + str)).m182288p().m182300c("action", "user-change-size").m182300c("wantSize", String.valueOf(i)).m182301d(), "requestChangeCallPosition", "").filter(new qcj() { // from class: l.jsk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(VCallApiProvider.checkDataSize(((BLiveEnvelope) obj).data.voiceCalls));
            }
        }).map(new qcj() { // from class: l.ksk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCalls.get(0);
            }
        });
    }

    private static C22421c<BLiveRtcToken> requestRtcSdkToken(String str, String str2, String str3) {
        if (wft.m206159b(3)) {
            return vrv.m202555p(rnl.m182263l(str), "requestSdkToken", str2).filter(new qcj() { // from class: l.nsk0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(VCallApiProvider.checkDataSize(((BLiveEnvelope) obj).data.rtcTokens));
                }
            }).map(new qcj() { // from class: l.osk0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveEnvelope) obj).data.rtcTokens.get(0);
                }
            });
        }
        return vrv.m202557r(rnl.m182263l(str), "requestSdkToken" + str3, str2).filter(new qcj() { // from class: l.lsk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(VCallApiProvider.checkDataSize(((BLiveEnvelope) obj).data.rtcTokens));
            }
        }).map(new qcj() { // from class: l.msk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.rtcTokens.get(0);
            }
        });
    }

    public static C22421c<BLiveRtcToken> requestSdkToken(String str, String str2, String str3) {
        return requestRtcSdkToken(zvr.m221802b("/rtc-tokens"), "{\"channel\": \"" + str + "\", \"usage\":\"" + str2 + "\", \"rtcProvider\":\"" + str3 + "\" }", str);
    }

    public static C22421c<BLiveVoiceCall> setMuteDeputy(String str, boolean z, boolean z2) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/voice-calls/" + str)).m182288p().m182300c("action", (z2 ? "anchor" : "user").concat(z ? "-mute" : "-unmute")).m182301d(), "voice-setMuteDeputy", "").filter(new qcj() { // from class: l.dtk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(VCallApiProvider.checkDataSize(((BLiveEnvelope) obj).data.voiceCalls));
            }
        }).map(new qcj() { // from class: l.etk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCalls.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ BLiveVoiceCall m79008u(BLiveEnvelope bLiveEnvelope) {
        return (BLiveVoiceCall) jyb.m147529r(bLiveEnvelope.data.voiceCalls, new qcj() { // from class: l.csk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveVoiceCall) obj).user, zrv.f205799a.m207631D0()));
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ ovn0 m79010w(boolean z, BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new ovn0(bLiveData.voiceCalls, bLiveData.users, bLiveData.masks, z, bLiveData.starlightHierarchies);
    }

    public static C22421c<BLiveRtcToken> requestSdkToken(String str, String str2) {
        return requestRtcSdkToken(zvr.m221802b("/rtc-tokens"), "{\"channel\": \"" + str + "\", \"usage\":\"voice-live\", \"rtcProvider\":\"" + str2 + "\" }", str);
    }

    public static C22421c<BLiveVoiceCallInvite> callInvite(String str, String str2) {
        String strM221802b = zvr.m221802b("/voice-call-invites");
        BLiveVoiceCallInvite bLiveVoiceCallInvite = new BLiveVoiceCallInvite();
        bLiveVoiceCallInvite.voiceLiveId = str;
        bLiveVoiceCallInvite.f45335to = str2;
        return vrv.m202555p(rnl.m182263l(strM221802b), "voice-callInvite", bLiveVoiceCallInvite.toJson()).filter(new qcj() { // from class: l.btk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(VCallApiProvider.checkDataSize(((BLiveEnvelope) obj).data.voiceCallInvites));
            }
        }).map(new qcj() { // from class: l.ctk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCallInvites.get(0);
            }
        });
    }

    public static C22421c<ovn0> callApplyList(String str, final boolean z) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/voice-calls")).m182288p().m182300c("with", "users,voice-live-user-mask").m182300c("state", "created").m182300c("voiceLiveId", str).m182301d(), "callApplyList").map(new qcj() { // from class: l.xrk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VCallApiProvider.m78987K(z, (BLiveEnvelope) obj);
            }
        });
    }
}
