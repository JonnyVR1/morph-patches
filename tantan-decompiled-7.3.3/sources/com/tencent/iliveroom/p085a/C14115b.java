package com.tencent.iliveroom.p085a;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.SurfaceView;
import com.clevertap.android.sdk.Constants;
import com.tencent.iliveroom.OneSecAdapterParams;
import com.tencent.iliveroom.TXIAudioVolumeInfo;
import com.tencent.iliveroom.TXILiveRoomAudioDelegateAdapter;
import com.tencent.iliveroom.TXILiveRoomDefine;
import com.tencent.iliveroom.p085a.p087b.C14118c;
import com.tencent.iliveroom.p085a.p088c.C14124e;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.trtc.impl.TRTCRoomInfo;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.rtmp.TXLog;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.trtc.TRTCCloudListener;
import com.tencent.trtc.TRTCStatistics;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.tencent.iliveroom.a.b */
/* JADX INFO: loaded from: classes12.dex */
public class C14115b extends TRTCCloudListener {

    /* JADX INFO: renamed from: a */
    private WeakReference<C14108a> f58660a;

    /* JADX INFO: renamed from: b */
    private boolean f58661b;

    /* JADX INFO: renamed from: c */
    private C14118c f58662c;

    public C14115b(C14108a c14108a) {
        this.f58660a = new WeakReference<>(c14108a);
        this.f58662c = new C14118c(c14108a);
    }

    /* JADX INFO: renamed from: a */
    public void m83784a(String str, int i, Bundle bundle) {
        String string = bundle != null ? bundle.getString(TXLiveConstants.EVT_DESCRIPTION) : "";
        TXLog.m85710i("TRTCAdapter-callback", "onEvent: userId = " + str + " eventCode = " + i + " eventParam = " + bundle + " msg = " + string);
        C14108a c14108aM83783a = m83783a();
        if (c14108aM83783a == null || bundle == null || TextUtils.isEmpty(str) || c14108aM83783a.m83759a() == null) {
            return;
        }
        try {
            long j = Long.parseLong(str);
            String str2 = string + " [" + i + Constants.AES_SUFFIX;
            if (i == 1008) {
                c14108aM83783a.f58460c.onEvent(j, bundle.getInt("EVT_PARAM1", 1) == 1 ? TXILiveRoomDefine.TXILiveRoomEventStartVideoHardWareEncoder : 13004, str2);
            } else {
                if (i != 2008) {
                    return;
                }
                c14108aM83783a.f58460c.onEvent(j, bundle.getInt("EVT_PARAM1", 1) == 1 ? TXILiveRoomDefine.TXILiveRoomEventStartVideoHardWareDecoder : 13006, str2);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onAudioEffectFinished(final int i, int i2) {
        final C14108a c14108aM83783a = m83783a();
        if (c14108aM83783a != null) {
            c14108aM83783a.runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.b.1
                @Override // java.lang.Runnable
                public void run() {
                    c14108aM83783a.f58463f.remove(Integer.valueOf(i));
                }
            });
            TXILiveRoomAudioDelegateAdapter tXILiveRoomAudioDelegateAdapter = c14108aM83783a.f58461d;
            if (tXILiveRoomAudioDelegateAdapter != null) {
                if (i2 == 0) {
                    tXILiveRoomAudioDelegateAdapter.onEffectPlayFinish(i);
                } else {
                    tXILiveRoomAudioDelegateAdapter.onEffectPlayError(i, i2);
                }
            }
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onCameraDidReady() {
        OneSecAdapterParams oneSecAdapterParams;
        C14108a c14108aM83783a = m83783a();
        if (c14108aM83783a == null || (oneSecAdapterParams = c14108aM83783a.f58458a) == null) {
            return;
        }
        c14108aM83783a.f58460c.onEvent(oneSecAdapterParams.userId, TXILiveRoomDefine.TXILiveRoomEventOpenCameraSucc, "打开摄像头成功");
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onConnectOtherRoom(String str, int i, String str2) {
        try {
            long j = Long.parseLong(str);
            C14108a c14108aM83783a = m83783a();
            if (c14108aM83783a == null || c14108aM83783a.f58462e.m83813a(i, str2)) {
                return;
            }
            c14108aM83783a.f58460c.onConnectOtherRoom(j, i, str2);
        } catch (Exception unused) {
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onConnectionRecovery() {
        OneSecAdapterParams oneSecAdapterParams;
        C14108a c14108aM83783a = m83783a();
        if (c14108aM83783a == null || (oneSecAdapterParams = c14108aM83783a.f58458a) == null) {
            return;
        }
        c14108aM83783a.f58460c.onEvent(oneSecAdapterParams.userId, 13001, "连接服务器成功");
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onDisConnectOtherRoom(int i, String str) {
        C14108a c14108aM83783a = m83783a();
        if (c14108aM83783a != null) {
            c14108aM83783a.f58460c.onDisconnectOtherRoom(i, str);
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onEnterRoom(long j) {
        OneSecAdapterParams oneSecAdapterParams;
        C14108a c14108aM83783a = m83783a();
        if (c14108aM83783a == null || (oneSecAdapterParams = c14108aM83783a.f58458a) == null) {
            return;
        }
        TXCLog.m84152i("TRTCAdapter-callback", "onEnterRoom -> elapsed = " + j);
        if (j < 0) {
            if (c14108aM83783a.f58469l) {
                TXCLog.m84149e("TRTCAdapter-callback", "onEnterRoom -> reenter room fail. code:" + j);
                return;
            } else {
                c14108aM83783a.f58460c.onJoinRoomFailed(oneSecAdapterParams.roomName, 11103, "进房失败 [" + j + Constants.AES_SUFFIX);
                return;
            }
        }
        c14108aM83783a.f58469l = true;
        c14108aM83783a.f58460c.onEvent(oneSecAdapterParams.userId, 6602, "获取接口机地址成功");
        c14108aM83783a.f58460c.onEvent(oneSecAdapterParams.userId, 13001, "连接服务器成功");
        c14108aM83783a.f58460c.onEvent(oneSecAdapterParams.userId, 13013, "" + TXCStatus.m84179b("18446744073709551615", 10001));
        if (this.f58661b) {
            return;
        }
        this.f58661b = true;
        c14108aM83783a.f58460c.onJoinRoomSuccess(oneSecAdapterParams.roomName);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onError(int i, String str, Bundle bundle) {
        TRTCRoomInfo tRTCRoomInfoM83759a;
        super.onError(i, str, bundle);
        TXLog.m85709e("TRTCAdapter-callback", "onError: errCode = " + i + " errMsg = " + str + " extraInfo = " + bundle);
        C14108a c14108aM83783a = m83783a();
        if (c14108aM83783a == null || bundle == null || (tRTCRoomInfoM83759a = c14108aM83783a.m83759a()) == null) {
            return;
        }
        try {
            long j = Long.parseLong(tRTCRoomInfoM83759a.getUserIdByTinyId(Long.parseLong(bundle.getString("EVT_USERID"))));
            String str2 = str + " [" + str + Constants.AES_SUFFIX;
            if (i == -1319) {
                c14108aM83783a.f58460c.onWarning(j, TXILiveRoomDefine.TXILiveRoomWarningMICOccupy, str2);
            } else if (i == -1317) {
                c14108aM83783a.f58460c.onWarning(j, TXILiveRoomDefine.TXILiveRoomWarningMICNotAuthorized, str2);
            } else {
                if (i != -1302) {
                    return;
                }
                c14108aM83783a.f58460c.onError(j, TXILiveRoomDefine.TXILiveRoomErrorOpenMicFailed, str2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onExitRoom(int i) {
        OneSecAdapterParams oneSecAdapterParams;
        C14108a c14108aM83783a = m83783a();
        if (c14108aM83783a == null || (oneSecAdapterParams = c14108aM83783a.f58458a) == null) {
            return;
        }
        if (i == 0) {
            c14108aM83783a.f58460c.onQuitRoomSuccess(oneSecAdapterParams.roomName);
        } else if (i == 1) {
            c14108aM83783a.f58460c.onKickOut(oneSecAdapterParams.roomName, oneSecAdapterParams.userId);
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onFirstAudioFrame(String str) {
        try {
            long j = Long.parseLong(str);
            C14108a c14108aM83783a = m83783a();
            if (c14108aM83783a != null) {
                c14108aM83783a.f58460c.onEvent(j, TXILiveRoomDefine.TXILiveRoomEventStartPlayAudioFrame, "播放首个音频帧");
            }
        } catch (Exception e) {
            TXCLog.m84150e("TRTCAdapter-callback", "parse user id failed.", e);
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onMicDidReady() {
        OneSecAdapterParams oneSecAdapterParams;
        C14108a c14108aM83783a = m83783a();
        if (c14108aM83783a == null || (oneSecAdapterParams = c14108aM83783a.f58458a) == null) {
            return;
        }
        c14108aM83783a.f58460c.onEvent(oneSecAdapterParams.userId, 13015, "打开麦克风成功");
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onMissCustomCmdMsg(String str, int i, int i2, int i3) {
        OneSecAdapterParams oneSecAdapterParams;
        try {
            long j = Long.parseLong(str);
            C14108a c14108aM83783a = m83783a();
            if (c14108aM83783a == null || (oneSecAdapterParams = c14108aM83783a.f58458a) == null) {
                return;
            }
            c14108aM83783a.f58460c.onStreamMessageError(oneSecAdapterParams.roomName, j, i, i2, i3);
        } catch (Exception unused) {
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onRecvCustomCmdMsg(String str, int i, int i2, byte[] bArr) {
        OneSecAdapterParams oneSecAdapterParams;
        try {
            long j = Long.parseLong(str);
            C14108a c14108aM83783a = m83783a();
            if (c14108aM83783a == null || (oneSecAdapterParams = c14108aM83783a.f58458a) == null) {
                return;
            }
            c14108aM83783a.f58460c.onRecvStreamMessage(oneSecAdapterParams.roomName, j, i, bArr);
        } catch (Exception unused) {
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onRecvSEIMsg(String str, byte[] bArr) {
        OneSecAdapterParams oneSecAdapterParams;
        try {
            long j = Long.parseLong(str);
            C14108a c14108aM83783a = m83783a();
            if (c14108aM83783a == null || (oneSecAdapterParams = c14108aM83783a.f58458a) == null) {
                return;
            }
            c14108aM83783a.f58460c.onRecvMessage(oneSecAdapterParams.roomName, j, bArr);
        } catch (Exception unused) {
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onSetMixTranscodingConfig(int i, String str) {
        super.onSetMixTranscodingConfig(i, str);
        C14108a c14108aM83783a = m83783a();
        if (c14108aM83783a != null) {
            c14108aM83783a.f58460c.onSetMixTranscodingConfig(i, str);
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onStartPublishCDNStream(int i, String str) {
        C14108a c14108aM83783a = m83783a();
        if (c14108aM83783a != null) {
            c14108aM83783a.f58460c.onStartPublishCDNStream(i, str);
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onStatistics(TRTCStatistics tRTCStatistics) {
        OneSecAdapterParams oneSecAdapterParams;
        C14108a c14108aM83783a = m83783a();
        if (c14108aM83783a == null || (oneSecAdapterParams = c14108aM83783a.f58458a) == null) {
            return;
        }
        c14108aM83783a.f58460c.onStatus(oneSecAdapterParams.roomName, this.f58662c.m83799a(tRTCStatistics));
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onStopPublishCDNStream(int i, String str) {
        C14108a c14108aM83783a = m83783a();
        if (c14108aM83783a != null) {
            c14108aM83783a.f58460c.onStopPublishCDNStream(i, str);
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onSwitchRole(int i, String str) {
        OneSecAdapterParams oneSecAdapterParams;
        C14108a c14108aM83783a = m83783a();
        if (c14108aM83783a == null || (oneSecAdapterParams = c14108aM83783a.f58458a) == null) {
            return;
        }
        boolean z = c14108aM83783a.f58459b;
        int i2 = z ? 2 : 1;
        int i3 = z ? 1 : 2;
        C14124e c14124e = c14108aM83783a.f58460c;
        String str2 = oneSecAdapterParams.roomName;
        if (i != 0) {
            i3 = i2;
        }
        c14124e.onRoomRoleChanged(str2, i2, i3);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onTryToReconnect() {
        OneSecAdapterParams oneSecAdapterParams;
        C14108a c14108aM83783a = m83783a();
        if (c14108aM83783a == null || (oneSecAdapterParams = c14108aM83783a.f58458a) == null) {
            return;
        }
        c14108aM83783a.f58460c.onWarning(oneSecAdapterParams.userId, TXILiveRoomDefine.TXILiveRoomWarningReconnect, "网络断开连接，正在重新进房");
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onUserEnter(String str) {
        super.onUserEnter(str);
        try {
            long j = Long.parseLong(str);
            C14108a c14108aM83783a = m83783a();
            if (c14108aM83783a != null) {
                if (c14108aM83783a.f58464g) {
                    c14108aM83783a.startRemoteRender(j, (SurfaceView) null);
                }
                OneSecAdapterParams oneSecAdapterParams = c14108aM83783a.f58458a;
                if (oneSecAdapterParams != null) {
                    c14108aM83783a.f58460c.onRoomBroadcasterIn(oneSecAdapterParams.roomName, j);
                }
            }
        } catch (Exception e) {
            TXCLog.m84150e("TRTCAdapter-callback", "parse user id failed.", e);
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onUserExit(String str, int i) {
        super.onUserExit(str, i);
        try {
            long j = Long.parseLong(str);
            C14108a c14108aM83783a = m83783a();
            if (c14108aM83783a != null) {
                if (c14108aM83783a.f58464g) {
                    c14108aM83783a.stopRemoteRender(j);
                }
                if (c14108aM83783a.f58466i == j) {
                    c14108aM83783a.f58467j = null;
                    c14108aM83783a.f58468k.m83817b();
                }
                OneSecAdapterParams oneSecAdapterParams = c14108aM83783a.f58458a;
                if (oneSecAdapterParams != null) {
                    c14108aM83783a.f58460c.onRoomBroadcasterOut(oneSecAdapterParams.roomName, j, 0);
                }
            }
        } catch (Exception e) {
            TXCLog.m84150e("TRTCAdapter-callback", "parse user id failed.", e);
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onUserVideoAvailable(String str, boolean z) {
        OneSecAdapterParams oneSecAdapterParams;
        try {
            long j = Long.parseLong(str);
            C14108a c14108aM83783a = m83783a();
            if (c14108aM83783a == null || !z || c14108aM83783a.f58465h.contains(Long.valueOf(j)) || (oneSecAdapterParams = c14108aM83783a.f58458a) == null) {
                return;
            }
            c14108aM83783a.f58465h.add(Long.valueOf(j));
            c14108aM83783a.f58460c.onEvent(j, 13010, "渲染首个视频帧(IDR)");
            c14108aM83783a.f58460c.onRoomHasVideo(oneSecAdapterParams.roomName, j);
        } catch (Exception e) {
            TXCLog.m84150e("TRTCAdapter-callback", "parse user id failed.", e);
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onUserVoiceVolume(ArrayList<TRTCCloudDef.TRTCVolumeInfo> arrayList, int i) {
        TXILiveRoomAudioDelegateAdapter tXILiveRoomAudioDelegateAdapter;
        C14108a c14108aM83783a = m83783a();
        if (c14108aM83783a == null || (tXILiveRoomAudioDelegateAdapter = c14108aM83783a.f58461d) == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (TRTCCloudDef.TRTCVolumeInfo tRTCVolumeInfo : arrayList) {
            TXIAudioVolumeInfo tXIAudioVolumeInfo = new TXIAudioVolumeInfo();
            try {
                tXIAudioVolumeInfo.userId = Long.parseLong(tRTCVolumeInfo.userId);
                tXIAudioVolumeInfo.volume = tRTCVolumeInfo.volume / 100.0f;
                arrayList2.add(tXIAudioVolumeInfo);
            } catch (Exception unused) {
            }
        }
        tXILiveRoomAudioDelegateAdapter.onReportAudioVolumeIndicationOfSpeakers(arrayList2);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onWarning(int i, String str, Bundle bundle) {
        TRTCRoomInfo tRTCRoomInfoM83759a;
        super.onWarning(i, str, bundle);
        TXLog.m85711w("TRTCAdapter-callback", "onWarning: warningCode = " + i + " warningMsg = " + str + " extraInfo = " + bundle);
        C14108a c14108aM83783a = m83783a();
        if (c14108aM83783a == null || bundle == null || (tRTCRoomInfoM83759a = c14108aM83783a.m83759a()) == null) {
            return;
        }
        try {
            long j = Long.parseLong(tRTCRoomInfoM83759a.getUserIdByTinyId(Long.parseLong(bundle.getString("EVT_USERID"))));
            String str2 = str + " [" + i + Constants.AES_SUFFIX;
            if (i == 1103) {
                c14108aM83783a.f58460c.onWarning(j, TXILiveRoomDefine.TXILiveRoomWarningHWAcceFailed, str2);
            } else {
                if (i != 2105) {
                    return;
                }
                c14108aM83783a.f58460c.onEvent(j, TXILiveRoomDefine.TXILiveRoomEventVideoPlayLag, str2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public C14108a m83783a() {
        return this.f58660a.get();
    }
}
