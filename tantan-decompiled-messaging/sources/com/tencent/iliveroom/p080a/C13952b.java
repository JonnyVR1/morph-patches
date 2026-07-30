package com.tencent.iliveroom.p080a;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.SurfaceView;
import com.clevertap.android.sdk.Constants;
import com.tencent.iliveroom.OneSecAdapterParams;
import com.tencent.iliveroom.TXIAudioVolumeInfo;
import com.tencent.iliveroom.TXILiveRoomAudioDelegateAdapter;
import com.tencent.iliveroom.TXILiveRoomDefine;
import com.tencent.iliveroom.p080a.p082b.C13955c;
import com.tencent.iliveroom.p080a.p083c.C13961e;
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
/* JADX INFO: loaded from: classes2.dex */
public class C13952b extends TRTCCloudListener {

    /* JADX INFO: renamed from: a */
    private WeakReference<C13945a> f57812a;

    /* JADX INFO: renamed from: b */
    private boolean f57813b;

    /* JADX INFO: renamed from: c */
    private C13955c f57814c;

    public C13952b(C13945a c13945a) {
        this.f57812a = new WeakReference<>(c13945a);
        this.f57814c = new C13955c(c13945a);
    }

    /* JADX INFO: renamed from: a */
    public void m82601a(String str, int i, Bundle bundle) {
        String string = bundle != null ? bundle.getString(TXLiveConstants.EVT_DESCRIPTION) : "";
        TXLog.m84527i("TRTCAdapter-callback", "onEvent: userId = " + str + " eventCode = " + i + " eventParam = " + bundle + " msg = " + string);
        C13945a c13945aM82600a = m82600a();
        if (c13945aM82600a == null || bundle == null || TextUtils.isEmpty(str) || c13945aM82600a.m82576a() == null) {
            return;
        }
        try {
            long j = Long.parseLong(str);
            String str2 = string + " [" + i + Constants.AES_SUFFIX;
            if (i == 1008) {
                c13945aM82600a.f57612c.onEvent(j, bundle.getInt("EVT_PARAM1", 1) == 1 ? TXILiveRoomDefine.TXILiveRoomEventStartVideoHardWareEncoder : 13004, str2);
            } else {
                if (i != 2008) {
                    return;
                }
                c13945aM82600a.f57612c.onEvent(j, bundle.getInt("EVT_PARAM1", 1) == 1 ? TXILiveRoomDefine.TXILiveRoomEventStartVideoHardWareDecoder : 13006, str2);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onAudioEffectFinished(final int i, int i2) {
        final C13945a c13945aM82600a = m82600a();
        if (c13945aM82600a != null) {
            c13945aM82600a.runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.b.1
                @Override // java.lang.Runnable
                public void run() {
                    c13945aM82600a.f57615f.remove(Integer.valueOf(i));
                }
            });
            TXILiveRoomAudioDelegateAdapter tXILiveRoomAudioDelegateAdapter = c13945aM82600a.f57613d;
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
        C13945a c13945aM82600a = m82600a();
        if (c13945aM82600a == null || (oneSecAdapterParams = c13945aM82600a.f57610a) == null) {
            return;
        }
        c13945aM82600a.f57612c.onEvent(oneSecAdapterParams.userId, TXILiveRoomDefine.TXILiveRoomEventOpenCameraSucc, "打开摄像头成功");
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onConnectOtherRoom(String str, int i, String str2) {
        try {
            long j = Long.parseLong(str);
            C13945a c13945aM82600a = m82600a();
            if (c13945aM82600a == null || c13945aM82600a.f57614e.m82630a(i, str2)) {
                return;
            }
            c13945aM82600a.f57612c.onConnectOtherRoom(j, i, str2);
        } catch (Exception unused) {
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onConnectionRecovery() {
        OneSecAdapterParams oneSecAdapterParams;
        C13945a c13945aM82600a = m82600a();
        if (c13945aM82600a == null || (oneSecAdapterParams = c13945aM82600a.f57610a) == null) {
            return;
        }
        c13945aM82600a.f57612c.onEvent(oneSecAdapterParams.userId, 13001, "连接服务器成功");
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onDisConnectOtherRoom(int i, String str) {
        C13945a c13945aM82600a = m82600a();
        if (c13945aM82600a != null) {
            c13945aM82600a.f57612c.onDisconnectOtherRoom(i, str);
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onEnterRoom(long j) {
        OneSecAdapterParams oneSecAdapterParams;
        C13945a c13945aM82600a = m82600a();
        if (c13945aM82600a == null || (oneSecAdapterParams = c13945aM82600a.f57610a) == null) {
            return;
        }
        TXCLog.m82969i("TRTCAdapter-callback", "onEnterRoom -> elapsed = " + j);
        if (j < 0) {
            if (c13945aM82600a.f57621l) {
                TXCLog.m82966e("TRTCAdapter-callback", "onEnterRoom -> reenter room fail. code:" + j);
                return;
            } else {
                c13945aM82600a.f57612c.onJoinRoomFailed(oneSecAdapterParams.roomName, 11103, "进房失败 [" + j + Constants.AES_SUFFIX);
                return;
            }
        }
        c13945aM82600a.f57621l = true;
        c13945aM82600a.f57612c.onEvent(oneSecAdapterParams.userId, 6602, "获取接口机地址成功");
        c13945aM82600a.f57612c.onEvent(oneSecAdapterParams.userId, 13001, "连接服务器成功");
        c13945aM82600a.f57612c.onEvent(oneSecAdapterParams.userId, 13013, "" + TXCStatus.m82996b("18446744073709551615", 10001));
        if (this.f57813b) {
            return;
        }
        this.f57813b = true;
        c13945aM82600a.f57612c.onJoinRoomSuccess(oneSecAdapterParams.roomName);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onError(int i, String str, Bundle bundle) {
        TRTCRoomInfo tRTCRoomInfoM82576a;
        super.onError(i, str, bundle);
        TXLog.m84526e("TRTCAdapter-callback", "onError: errCode = " + i + " errMsg = " + str + " extraInfo = " + bundle);
        C13945a c13945aM82600a = m82600a();
        if (c13945aM82600a == null || bundle == null || (tRTCRoomInfoM82576a = c13945aM82600a.m82576a()) == null) {
            return;
        }
        try {
            long j = Long.parseLong(tRTCRoomInfoM82576a.getUserIdByTinyId(Long.parseLong(bundle.getString("EVT_USERID"))));
            String str2 = str + " [" + str + Constants.AES_SUFFIX;
            if (i == -1319) {
                c13945aM82600a.f57612c.onWarning(j, TXILiveRoomDefine.TXILiveRoomWarningMICOccupy, str2);
            } else if (i == -1317) {
                c13945aM82600a.f57612c.onWarning(j, TXILiveRoomDefine.TXILiveRoomWarningMICNotAuthorized, str2);
            } else {
                if (i != -1302) {
                    return;
                }
                c13945aM82600a.f57612c.onError(j, TXILiveRoomDefine.TXILiveRoomErrorOpenMicFailed, str2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onExitRoom(int i) {
        OneSecAdapterParams oneSecAdapterParams;
        C13945a c13945aM82600a = m82600a();
        if (c13945aM82600a == null || (oneSecAdapterParams = c13945aM82600a.f57610a) == null) {
            return;
        }
        if (i == 0) {
            c13945aM82600a.f57612c.onQuitRoomSuccess(oneSecAdapterParams.roomName);
        } else if (i == 1) {
            c13945aM82600a.f57612c.onKickOut(oneSecAdapterParams.roomName, oneSecAdapterParams.userId);
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onFirstAudioFrame(String str) {
        try {
            long j = Long.parseLong(str);
            C13945a c13945aM82600a = m82600a();
            if (c13945aM82600a != null) {
                c13945aM82600a.f57612c.onEvent(j, TXILiveRoomDefine.TXILiveRoomEventStartPlayAudioFrame, "播放首个音频帧");
            }
        } catch (Exception e) {
            TXCLog.m82967e("TRTCAdapter-callback", "parse user id failed.", e);
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onMicDidReady() {
        OneSecAdapterParams oneSecAdapterParams;
        C13945a c13945aM82600a = m82600a();
        if (c13945aM82600a == null || (oneSecAdapterParams = c13945aM82600a.f57610a) == null) {
            return;
        }
        c13945aM82600a.f57612c.onEvent(oneSecAdapterParams.userId, 13015, "打开麦克风成功");
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onMissCustomCmdMsg(String str, int i, int i2, int i3) {
        OneSecAdapterParams oneSecAdapterParams;
        try {
            long j = Long.parseLong(str);
            C13945a c13945aM82600a = m82600a();
            if (c13945aM82600a == null || (oneSecAdapterParams = c13945aM82600a.f57610a) == null) {
                return;
            }
            c13945aM82600a.f57612c.onStreamMessageError(oneSecAdapterParams.roomName, j, i, i2, i3);
        } catch (Exception unused) {
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onRecvCustomCmdMsg(String str, int i, int i2, byte[] bArr) {
        OneSecAdapterParams oneSecAdapterParams;
        try {
            long j = Long.parseLong(str);
            C13945a c13945aM82600a = m82600a();
            if (c13945aM82600a == null || (oneSecAdapterParams = c13945aM82600a.f57610a) == null) {
                return;
            }
            c13945aM82600a.f57612c.onRecvStreamMessage(oneSecAdapterParams.roomName, j, i, bArr);
        } catch (Exception unused) {
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onRecvSEIMsg(String str, byte[] bArr) {
        OneSecAdapterParams oneSecAdapterParams;
        try {
            long j = Long.parseLong(str);
            C13945a c13945aM82600a = m82600a();
            if (c13945aM82600a == null || (oneSecAdapterParams = c13945aM82600a.f57610a) == null) {
                return;
            }
            c13945aM82600a.f57612c.onRecvMessage(oneSecAdapterParams.roomName, j, bArr);
        } catch (Exception unused) {
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onSetMixTranscodingConfig(int i, String str) {
        super.onSetMixTranscodingConfig(i, str);
        C13945a c13945aM82600a = m82600a();
        if (c13945aM82600a != null) {
            c13945aM82600a.f57612c.onSetMixTranscodingConfig(i, str);
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onStartPublishCDNStream(int i, String str) {
        C13945a c13945aM82600a = m82600a();
        if (c13945aM82600a != null) {
            c13945aM82600a.f57612c.onStartPublishCDNStream(i, str);
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onStatistics(TRTCStatistics tRTCStatistics) {
        OneSecAdapterParams oneSecAdapterParams;
        C13945a c13945aM82600a = m82600a();
        if (c13945aM82600a == null || (oneSecAdapterParams = c13945aM82600a.f57610a) == null) {
            return;
        }
        c13945aM82600a.f57612c.onStatus(oneSecAdapterParams.roomName, this.f57814c.m82616a(tRTCStatistics));
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onStopPublishCDNStream(int i, String str) {
        C13945a c13945aM82600a = m82600a();
        if (c13945aM82600a != null) {
            c13945aM82600a.f57612c.onStopPublishCDNStream(i, str);
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onSwitchRole(int i, String str) {
        OneSecAdapterParams oneSecAdapterParams;
        C13945a c13945aM82600a = m82600a();
        if (c13945aM82600a == null || (oneSecAdapterParams = c13945aM82600a.f57610a) == null) {
            return;
        }
        boolean z = c13945aM82600a.f57611b;
        int i2 = z ? 2 : 1;
        int i3 = z ? 1 : 2;
        C13961e c13961e = c13945aM82600a.f57612c;
        String str2 = oneSecAdapterParams.roomName;
        if (i != 0) {
            i3 = i2;
        }
        c13961e.onRoomRoleChanged(str2, i2, i3);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onTryToReconnect() {
        OneSecAdapterParams oneSecAdapterParams;
        C13945a c13945aM82600a = m82600a();
        if (c13945aM82600a == null || (oneSecAdapterParams = c13945aM82600a.f57610a) == null) {
            return;
        }
        c13945aM82600a.f57612c.onWarning(oneSecAdapterParams.userId, TXILiveRoomDefine.TXILiveRoomWarningReconnect, "网络断开连接，正在重新进房");
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onUserEnter(String str) {
        super.onUserEnter(str);
        try {
            long j = Long.parseLong(str);
            C13945a c13945aM82600a = m82600a();
            if (c13945aM82600a != null) {
                if (c13945aM82600a.f57616g) {
                    c13945aM82600a.startRemoteRender(j, (SurfaceView) null);
                }
                OneSecAdapterParams oneSecAdapterParams = c13945aM82600a.f57610a;
                if (oneSecAdapterParams != null) {
                    c13945aM82600a.f57612c.onRoomBroadcasterIn(oneSecAdapterParams.roomName, j);
                }
            }
        } catch (Exception e) {
            TXCLog.m82967e("TRTCAdapter-callback", "parse user id failed.", e);
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onUserExit(String str, int i) {
        super.onUserExit(str, i);
        try {
            long j = Long.parseLong(str);
            C13945a c13945aM82600a = m82600a();
            if (c13945aM82600a != null) {
                if (c13945aM82600a.f57616g) {
                    c13945aM82600a.stopRemoteRender(j);
                }
                if (c13945aM82600a.f57618i == j) {
                    c13945aM82600a.f57619j = null;
                    c13945aM82600a.f57620k.m82634b();
                }
                OneSecAdapterParams oneSecAdapterParams = c13945aM82600a.f57610a;
                if (oneSecAdapterParams != null) {
                    c13945aM82600a.f57612c.onRoomBroadcasterOut(oneSecAdapterParams.roomName, j, 0);
                }
            }
        } catch (Exception e) {
            TXCLog.m82967e("TRTCAdapter-callback", "parse user id failed.", e);
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onUserVideoAvailable(String str, boolean z) {
        OneSecAdapterParams oneSecAdapterParams;
        try {
            long j = Long.parseLong(str);
            C13945a c13945aM82600a = m82600a();
            if (c13945aM82600a == null || !z || c13945aM82600a.f57617h.contains(Long.valueOf(j)) || (oneSecAdapterParams = c13945aM82600a.f57610a) == null) {
                return;
            }
            c13945aM82600a.f57617h.add(Long.valueOf(j));
            c13945aM82600a.f57612c.onEvent(j, 13010, "渲染首个视频帧(IDR)");
            c13945aM82600a.f57612c.onRoomHasVideo(oneSecAdapterParams.roomName, j);
        } catch (Exception e) {
            TXCLog.m82967e("TRTCAdapter-callback", "parse user id failed.", e);
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onUserVoiceVolume(ArrayList<TRTCCloudDef.TRTCVolumeInfo> arrayList, int i) {
        TXILiveRoomAudioDelegateAdapter tXILiveRoomAudioDelegateAdapter;
        C13945a c13945aM82600a = m82600a();
        if (c13945aM82600a == null || (tXILiveRoomAudioDelegateAdapter = c13945aM82600a.f57613d) == null) {
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
        TRTCRoomInfo tRTCRoomInfoM82576a;
        super.onWarning(i, str, bundle);
        TXLog.m84528w("TRTCAdapter-callback", "onWarning: warningCode = " + i + " warningMsg = " + str + " extraInfo = " + bundle);
        C13945a c13945aM82600a = m82600a();
        if (c13945aM82600a == null || bundle == null || (tRTCRoomInfoM82576a = c13945aM82600a.m82576a()) == null) {
            return;
        }
        try {
            long j = Long.parseLong(tRTCRoomInfoM82576a.getUserIdByTinyId(Long.parseLong(bundle.getString("EVT_USERID"))));
            String str2 = str + " [" + i + Constants.AES_SUFFIX;
            if (i == 1103) {
                c13945aM82600a.f57612c.onWarning(j, TXILiveRoomDefine.TXILiveRoomWarningHWAcceFailed, str2);
            } else {
                if (i != 2105) {
                    return;
                }
                c13945aM82600a.f57612c.onEvent(j, TXILiveRoomDefine.TXILiveRoomEventVideoPlayLag, str2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public C13945a m82600a() {
        return this.f57812a.get();
    }
}
