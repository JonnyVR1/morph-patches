package com.tencent.iliveroom.p085a.p087b;

import com.google.firebase.FirebaseError;
import com.tencent.iliveroom.TXILiveRoomDefine;
import com.tencent.iliveroom.p085a.C14108a;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.trtc.impl.TRTCRoomInfo;
import com.tencent.trtc.TRTCStatistics;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.tencent.iliveroom.a.b.c */
/* JADX INFO: loaded from: classes12.dex */
public class C14118c {

    /* JADX INFO: renamed from: a */
    private WeakReference<C14108a> f58675a;

    public C14118c(C14108a c14108a) {
        this.f58675a = new WeakReference<>(c14108a);
    }

    /* JADX INFO: renamed from: a */
    private TXILiveRoomDefine.TXILiveRoomStatus m83798a(TRTCRoomInfo tRTCRoomInfo, TRTCStatistics tRTCStatistics, TRTCStatistics.TRTCRemoteStatistics tRTCRemoteStatistics) {
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
            tXILiveRoomStatus.audioBitrate = m83796a(tRTCRemoteStatistics.audioBitrate);
            tXILiveRoomStatus.videoWidth = tRTCRemoteStatistics.width;
            tXILiveRoomStatus.videoHeight = tRTCRemoteStatistics.height;
            tXILiveRoomStatus.videoGop = 1;
            tXILiveRoomStatus.audioTotalBytes = TXCStatus.m84182c(str, 16006);
            tXILiveRoomStatus.videoTotalBytes = TXCStatus.m84182c(str, 16005);
            tXILiveRoomStatus.rtt = tRTCStatistics.rtt;
            tXILiveRoomStatus.serverAddr = TXCStatus.m84179b("18446744073709551615", 10001);
            tXILiveRoomStatus.videoRecvFPS = (int) (TXCStatus.m84185d(str, 17003, 2) + 0.5d);
            tXILiveRoomStatus.netSpeed = TXCStatus.m84183c(str, 17001, 2) + TXCStatus.m84182c(str, 18001);
            tXILiveRoomStatus.videoFecRatio = TXCStatus.m84183c(str, FirebaseError.ERROR_OPERATION_NOT_ALLOWED, 2);
            tXILiveRoomStatus.audioFecRatio = TXCStatus.m84182c(str, 18008);
            tXILiveRoomStatus.audioLossRate = tRTCRemoteStatistics.audioPacketLoss;
            tXILiveRoomStatus.videoLossRate = tRTCRemoteStatistics.videoPacketLoss;
            tXILiveRoomStatus.point2PointDelay = tRTCRemoteStatistics.point2PointDelay;
            if (user.mainRender != null) {
                tXILiveRoomStatus.audioCacheDuration = TXCStatus.m84182c(str, 2007);
                tXILiveRoomStatus.videoCacheDuration = TXCStatus.m84183c(str, 6010, 2);
                int iM84183c = TXCStatus.m84183c(str, 6011, 2);
                int iM84183c2 = TXCStatus.m84183c(str, 6012, 2);
                if (iM84183c >= iM84183c2) {
                    iM84183c -= iM84183c2;
                }
                tXILiveRoomStatus.videoJitterCacheFrames = iM84183c;
                tXILiveRoomStatus.videoDecoderCacheFrames = iM84183c2;
                tXILiveRoomStatus.videoFramesDrop = TXCStatus.m84183c(str, 17013, 2);
                tXILiveRoomStatus.audioBlockCount = TXCStatus.m84182c(str, 18027);
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
    public ArrayList<TXILiveRoomDefine.TXILiveRoomStatus> m83799a(TRTCStatistics tRTCStatistics) {
        TRTCRoomInfo tRTCRoomInfoM83759a;
        ArrayList<TRTCStatistics.TRTCRemoteStatistics> arrayList;
        Iterator<TRTCStatistics.TRTCRemoteStatistics> it;
        TXILiveRoomDefine.TXILiveRoomStatus tXILiveRoomStatusM83798a;
        ArrayList<TXILiveRoomDefine.TXILiveRoomStatus> arrayList2 = new ArrayList<>();
        C14108a c14108a = this.f58675a.get();
        if (c14108a != null && (tRTCRoomInfoM83759a = c14108a.m83759a()) != null) {
            ArrayList<TRTCStatistics.TRTCLocalStatistics> arrayList3 = tRTCStatistics.localArray;
            if (arrayList3 != null && arrayList3.size() > 0) {
                TXILiveRoomDefine.TXILiveRoomStatus tXILiveRoomStatusM83797a = m83797a(tRTCRoomInfoM83759a, tRTCStatistics);
                if (tXILiveRoomStatusM83797a != null) {
                    arrayList2.add(tXILiveRoomStatusM83797a);
                    arrayList = tRTCStatistics.remoteArray;
                    if (arrayList != null) {
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            tXILiveRoomStatusM83798a = m83798a(tRTCRoomInfoM83759a, tRTCStatistics, it.next());
                            if (tXILiveRoomStatusM83798a != null) {
                                arrayList2.add(tXILiveRoomStatusM83798a);
                            }
                        }
                    }
                }
            } else {
                arrayList = tRTCStatistics.remoteArray;
                if (arrayList != null) {
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        tXILiveRoomStatusM83798a = m83798a(tRTCRoomInfoM83759a, tRTCStatistics, it.next());
                        if (tXILiveRoomStatusM83798a != null) {
                            arrayList2.add(tXILiveRoomStatusM83798a);
                        }
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: a */
    private int m83796a(int i) {
        return i < 10 ? (int) (((double) i) * 1.41d) : i + 26;
    }

    /* JADX INFO: renamed from: a */
    private TXILiveRoomDefine.TXILiveRoomStatus m83797a(TRTCRoomInfo tRTCRoomInfo, TRTCStatistics tRTCStatistics) {
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
            tXILiveRoomStatus.videoGop = TXCStatus.m84183c("18446744073709551615", TXILiveRoomDefine.TXILiveRoomEventStartVideoHardWareEncoder, 2) / 1000;
            tXILiveRoomStatus.netSpeed = TXCStatus.m84182c("18446744073709551615", TXILiveRoomDefine.TXILiveRoomWarningReconnect);
            tXILiveRoomStatus.videoBitrate = tRTCLocalStatistics.videoBitrate;
            tXILiveRoomStatus.audioBitrate = m83796a(tRTCLocalStatistics.audioBitrate);
            tXILiveRoomStatus.videoUpCacheFrames = 0;
            tXILiveRoomStatus.audioUpCacheFrames = 0;
            tXILiveRoomStatus.serverAddr = TXCStatus.m84179b("18446744073709551615", 10001);
            tXILiveRoomStatus.audioTotalBytes = TXCStatus.m84174a("18446744073709551615", TXILiveRoomDefine.TXILiveRoomWarningVideoDecodeFailed);
            tXILiveRoomStatus.videoTotalBytes = TXCStatus.m84174a("18446744073709551615", TXILiveRoomDefine.TXILiveRoomWarningAudioDecodeFailed);
            tXILiveRoomStatus.audioLossRate = TXCStatus.m84182c("18446744073709551615", TXILiveRoomDefine.TXILiveRoomWarningHWAcceFailed);
            tXILiveRoomStatus.videoLossRate = TXCStatus.m84182c("18446744073709551615", TXILiveRoomDefine.TXILiveRoomWarningHWAcceFailed);
            tXILiveRoomStatus.upLossRate = TXCStatus.m84182c("18446744073709551615", TXILiveRoomDefine.TXILiveRoomWarningHWAcceFailed);
            tXILiveRoomStatus.videoFecRatio = TXCStatus.m84183c("18446744073709551615", 13004, 2);
            tXILiveRoomStatus.audioFecRatio = TXCStatus.m84182c("18446744073709551615", 14006);
            tXILiveRoomStatus.audioCaptureBytes = C14117b.m83794a(0);
            tXILiveRoomStatus.audioEncodeBytes = C14117b.m83794a(1);
            tXILiveRoomStatus.videoEncodeBytes = C14117b.m83794a(2);
            return tXILiveRoomStatus;
        } catch (Exception unused) {
            return null;
        }
    }
}
