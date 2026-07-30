package com.tencent.iliveroom.p080a.p082b;

import com.google.firebase.FirebaseError;
import com.tencent.iliveroom.TXILiveRoomDefine;
import com.tencent.iliveroom.p080a.C13945a;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.trtc.impl.TRTCRoomInfo;
import com.tencent.trtc.TRTCStatistics;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.tencent.iliveroom.a.b.c */
/* JADX INFO: loaded from: classes2.dex */
public class C13955c {

    /* JADX INFO: renamed from: a */
    private WeakReference<C13945a> f57827a;

    public C13955c(C13945a c13945a) {
        this.f57827a = new WeakReference<>(c13945a);
    }

    /* JADX INFO: renamed from: a */
    private TXILiveRoomDefine.TXILiveRoomStatus m82615a(TRTCRoomInfo tRTCRoomInfo, TRTCStatistics tRTCStatistics, TRTCStatistics.TRTCRemoteStatistics tRTCRemoteStatistics) {
        TXILiveRoomDefine.TXILiveRoomStatus tXILiveRoomStatus = new TXILiveRoomDefine.TXILiveRoomStatus();
        try {
            long j = Long.parseLong(tRTCRemoteStatistics.userId);
            TRTCRoomInfo.UserInfo user = tRTCRoomInfo.getUser(tRTCRemoteStatistics.userId);
            if (user == null) {
                return null;
            }
            String str = user.tinyID + "";
            tXILiveRoomStatus.userId = j;
            tXILiveRoomStatus.videoFps = tRTCRemoteStatistics.frameRate;
            tXILiveRoomStatus.videoBitrate = tRTCRemoteStatistics.videoBitrate;
            tXILiveRoomStatus.audioBitrate = m82613a(tRTCRemoteStatistics.audioBitrate);
            tXILiveRoomStatus.videoWidth = tRTCRemoteStatistics.width;
            tXILiveRoomStatus.videoHeight = tRTCRemoteStatistics.height;
            tXILiveRoomStatus.videoGop = 1;
            tXILiveRoomStatus.audioTotalBytes = TXCStatus.m82999c(str, 16006);
            tXILiveRoomStatus.videoTotalBytes = TXCStatus.m82999c(str, 16005);
            tXILiveRoomStatus.rtt = tRTCStatistics.rtt;
            tXILiveRoomStatus.serverAddr = TXCStatus.m82996b("18446744073709551615", 10001);
            tXILiveRoomStatus.videoRecvFPS = (int) (TXCStatus.m83002d(str, 17003, 2) + 0.5d);
            tXILiveRoomStatus.netSpeed = TXCStatus.m83000c(str, 17001, 2) + TXCStatus.m82999c(str, 18001);
            tXILiveRoomStatus.videoFecRatio = TXCStatus.m83000c(str, FirebaseError.ERROR_OPERATION_NOT_ALLOWED, 2);
            tXILiveRoomStatus.audioFecRatio = TXCStatus.m82999c(str, 18008);
            tXILiveRoomStatus.audioLossRate = tRTCRemoteStatistics.audioPacketLoss;
            tXILiveRoomStatus.videoLossRate = tRTCRemoteStatistics.videoPacketLoss;
            tXILiveRoomStatus.point2PointDelay = tRTCRemoteStatistics.point2PointDelay;
            if (user.mainRender != null) {
                tXILiveRoomStatus.audioCacheDuration = TXCStatus.m82999c(str, 2007);
                tXILiveRoomStatus.videoCacheDuration = TXCStatus.m83000c(str, 6010, 2);
                int iM83000c = TXCStatus.m83000c(str, 6011, 2);
                int iM83000c2 = TXCStatus.m83000c(str, 6012, 2);
                if (iM83000c >= iM83000c2) {
                    iM83000c -= iM83000c2;
                }
                tXILiveRoomStatus.videoJitterCacheFrames = iM83000c;
                tXILiveRoomStatus.videoDecoderCacheFrames = iM83000c2;
                tXILiveRoomStatus.videoFramesDrop = TXCStatus.m83000c(str, 17013, 2);
                tXILiveRoomStatus.audioBlockCount = TXCStatus.m82999c(str, 18027);
            }
            return tXILiveRoomStatus;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0039  */
    /* JADX WARN: Code duplicated, block: B:26:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0033 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public ArrayList<TXILiveRoomDefine.TXILiveRoomStatus> m82616a(TRTCStatistics tRTCStatistics) {
        TRTCRoomInfo tRTCRoomInfoM82576a;
        ArrayList<TRTCStatistics.TRTCRemoteStatistics> arrayList;
        Iterator<TRTCStatistics.TRTCRemoteStatistics> it;
        TXILiveRoomDefine.TXILiveRoomStatus tXILiveRoomStatusM82615a;
        ArrayList<TXILiveRoomDefine.TXILiveRoomStatus> arrayList2 = new ArrayList<>();
        C13945a c13945a = this.f57827a.get();
        if (c13945a != null && (tRTCRoomInfoM82576a = c13945a.m82576a()) != null) {
            ArrayList<TRTCStatistics.TRTCLocalStatistics> arrayList3 = tRTCStatistics.localArray;
            if (arrayList3 != null && arrayList3.size() > 0) {
                TXILiveRoomDefine.TXILiveRoomStatus tXILiveRoomStatusM82614a = m82614a(tRTCRoomInfoM82576a, tRTCStatistics);
                if (tXILiveRoomStatusM82614a != null) {
                    arrayList2.add(tXILiveRoomStatusM82614a);
                    arrayList = tRTCStatistics.remoteArray;
                    if (arrayList != null) {
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            tXILiveRoomStatusM82615a = m82615a(tRTCRoomInfoM82576a, tRTCStatistics, it.next());
                            if (tXILiveRoomStatusM82615a != null) {
                                arrayList2.add(tXILiveRoomStatusM82615a);
                            }
                        }
                    }
                }
            } else {
                arrayList = tRTCStatistics.remoteArray;
                if (arrayList != null) {
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        tXILiveRoomStatusM82615a = m82615a(tRTCRoomInfoM82576a, tRTCStatistics, it.next());
                        if (tXILiveRoomStatusM82615a != null) {
                            arrayList2.add(tXILiveRoomStatusM82615a);
                        }
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: a */
    private int m82613a(int i) {
        return i < 10 ? (int) (((double) i) * 1.41d) : i + 26;
    }

    /* JADX INFO: renamed from: a */
    private TXILiveRoomDefine.TXILiveRoomStatus m82614a(TRTCRoomInfo tRTCRoomInfo, TRTCStatistics tRTCStatistics) {
        try {
            long j = Long.parseLong(tRTCRoomInfo.userId);
            TRTCStatistics.TRTCLocalStatistics tRTCLocalStatistics = tRTCStatistics.localArray.get(0);
            TXILiveRoomDefine.TXILiveRoomStatus tXILiveRoomStatus = new TXILiveRoomDefine.TXILiveRoomStatus();
            tXILiveRoomStatus.userId = j;
            tXILiveRoomStatus.appCpu = tRTCStatistics.appCpu;
            tXILiveRoomStatus.sysCpu = tRTCStatistics.systemCpu;
            tXILiveRoomStatus.rtt = tRTCStatistics.rtt;
            tXILiveRoomStatus.videoFps = tRTCLocalStatistics.frameRate;
            tXILiveRoomStatus.videoWidth = tRTCLocalStatistics.width;
            tXILiveRoomStatus.videoHeight = tRTCLocalStatistics.height;
            tXILiveRoomStatus.videoGop = TXCStatus.m83000c("18446744073709551615", TXILiveRoomDefine.TXILiveRoomEventStartVideoHardWareEncoder, 2) / 1000;
            tXILiveRoomStatus.netSpeed = TXCStatus.m82999c("18446744073709551615", TXILiveRoomDefine.TXILiveRoomWarningReconnect);
            tXILiveRoomStatus.videoBitrate = tRTCLocalStatistics.videoBitrate;
            tXILiveRoomStatus.audioBitrate = m82613a(tRTCLocalStatistics.audioBitrate);
            tXILiveRoomStatus.videoUpCacheFrames = 0;
            tXILiveRoomStatus.audioUpCacheFrames = 0;
            tXILiveRoomStatus.serverAddr = TXCStatus.m82996b("18446744073709551615", 10001);
            tXILiveRoomStatus.audioTotalBytes = TXCStatus.m82991a("18446744073709551615", TXILiveRoomDefine.TXILiveRoomWarningVideoDecodeFailed);
            tXILiveRoomStatus.videoTotalBytes = TXCStatus.m82991a("18446744073709551615", TXILiveRoomDefine.TXILiveRoomWarningAudioDecodeFailed);
            tXILiveRoomStatus.audioLossRate = TXCStatus.m82999c("18446744073709551615", TXILiveRoomDefine.TXILiveRoomWarningHWAcceFailed);
            tXILiveRoomStatus.videoLossRate = TXCStatus.m82999c("18446744073709551615", TXILiveRoomDefine.TXILiveRoomWarningHWAcceFailed);
            tXILiveRoomStatus.upLossRate = TXCStatus.m82999c("18446744073709551615", TXILiveRoomDefine.TXILiveRoomWarningHWAcceFailed);
            tXILiveRoomStatus.videoFecRatio = TXCStatus.m83000c("18446744073709551615", 13004, 2);
            tXILiveRoomStatus.audioFecRatio = TXCStatus.m82999c("18446744073709551615", 14006);
            tXILiveRoomStatus.audioCaptureBytes = C13954b.m82611a(0);
            tXILiveRoomStatus.audioEncodeBytes = C13954b.m82611a(1);
            tXILiveRoomStatus.videoEncodeBytes = C13954b.m82611a(2);
            return tXILiveRoomStatus;
        } catch (Exception unused) {
            return null;
        }
    }
}
