package com.p074ss.bytertc.engine;

import com.p074ss.bytertc.engine.audio.IRangeAudio;
import com.p074ss.bytertc.engine.audio.ISpatialAudio;
import com.p074ss.bytertc.engine.data.ForwardStreamInfo;
import com.p074ss.bytertc.engine.data.RemoteVideoConfig;
import com.p074ss.bytertc.engine.data.ReturnStatus;
import com.p074ss.bytertc.engine.data.SimulcastStreamType;
import com.p074ss.bytertc.engine.data.StreamIndex;
import com.p074ss.bytertc.engine.handler.IRTCRoomEventHandler;
import com.p074ss.bytertc.engine.handler.IRTCRoomEventHandlerEx;
import com.p074ss.bytertc.engine.handler.IRTSRoomEventHandler;
import com.p074ss.bytertc.engine.handler.RTCRoomEventHandler;
import com.p074ss.bytertc.engine.handler.RTCRoomEventHandlerEx;
import com.p074ss.bytertc.engine.handler.RTCRoomEventHandlerRts;
import com.p074ss.bytertc.engine.type.AudioSelectionPriority;
import com.p074ss.bytertc.engine.type.MediaStreamType;
import com.p074ss.bytertc.engine.type.MessageConfig;
import com.p074ss.bytertc.engine.type.SubtitleConfig;
import com.p074ss.bytertc.engine.utils.LogUtil;
import com.p074ss.bytertc.engine.video.IPanoramicVideo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class RTCRoomImpl extends RTCRoomEx {
    protected static final String TAG = "RtcRoom";
    private final ReentrantReadWriteLock.ReadLock mJniReadLock;
    private final ReentrantReadWriteLock.WriteLock mJniWriteLock;
    protected long mNativeRtcRoom;
    private final ReentrantReadWriteLock mReadWriteLock;
    private String mRoom;
    protected int mRtcRoomCount;
    private RTCRoomEventHandler mRtcRoomEventHandler;
    private RTCRoomEventHandlerEx mRtcRoomEventHandlerEx;
    private RTCRoomEventHandlerRts mRtcRoomEventHandlerRts;
    private IRTCRoomEventHandler mRtcRoomHandler;
    private IRTCRoomEventHandlerEx mRtcRoomHandlerEx;
    private IRTSRoomEventHandler mRtcRoomHandlerRts;
    private String mUser;
    private long mNativeRtcRoomEventHandler = 0;
    private long mNativeRtcRoomEventHandlerEx = 0;
    private long mNativeRtcRoomEventHandlerRts = 0;
    private NativeRangeAudio mRangeAudio = null;
    private NativeSpatialAudio mSpatialAudio = null;
    private NativePanoramicVideo mPanoramicVideo = null;

    public RTCRoomImpl(String str, long j) {
        this.mNativeRtcRoom = 0L;
        this.mRtcRoomCount = 0;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWriteLock = reentrantReadWriteLock;
        this.mJniReadLock = reentrantReadWriteLock.readLock();
        this.mJniWriteLock = reentrantReadWriteLock.writeLock();
        this.mNativeRtcRoom = j;
        this.mRoom = str;
        this.mRtcRoomCount = 1;
    }

    public static String getCloudRenderingInfo(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str);
            jSONObject.put("externalService", "render");
            jSONObject.put("renderMeta", str2);
            return jSONObject.toString();
        } catch (Exception e) {
            LogUtil.m82084e(TAG, "getCloudRenderingInfo catch exception , e : " + e.getMessage());
            return null;
        }
    }

    public void addRtcRoomCount() {
        this.mRtcRoomCount++;
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom, com.p074ss.bytertc.engine.RTSRoom
    public void destroy() {
        LogUtil.m82083d(TAG, "Destroy ");
        this.mJniWriteLock.lock();
        int i = this.mRtcRoomCount - 1;
        this.mRtcRoomCount = i;
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native rtcroom is invalid, Destroy failed.");
                this.mJniWriteLock.unlock();
                return;
            }
            if (i <= 0) {
                this.mNativeRtcRoom = 0L;
            }
            NativeRangeAudio nativeRangeAudio = this.mRangeAudio;
            if (nativeRangeAudio != null) {
                nativeRangeAudio.destroy();
            }
            NativeSpatialAudio nativeSpatialAudio = this.mSpatialAudio;
            if (nativeSpatialAudio != null) {
                nativeSpatialAudio.destroy();
            }
            this.mJniWriteLock.unlock();
            NativeRTCRoomFunctions.nativeDestory(j);
            if (this.mRtcRoomCount <= 0) {
                long j2 = this.mNativeRtcRoomEventHandlerEx;
                if (j2 != 0) {
                    NativeRTCRoomFunctions.nativeReleaseRTCRoomEventHandlerEx(j2);
                    this.mNativeRtcRoomEventHandlerEx = 0L;
                }
                long j3 = this.mNativeRtcRoomEventHandler;
                if (j3 != 0) {
                    NativeRTCRoomFunctions.nativeReleaseRTCRoomEventHandler(j3);
                    this.mNativeRtcRoomEventHandler = 0L;
                }
            }
        } catch (Throwable th) {
            this.mJniWriteLock.unlock();
            throw th;
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public int enableSubscribeLocalStream(boolean z) {
        int iNativeEnableSubscribeLocalStream;
        LogUtil.m82083d(TAG, "enableSubscribeLocalStream: " + z);
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native rtcroom is invalid, EnableSubscribeLocalStream failed.");
                iNativeEnableSubscribeLocalStream = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeEnableSubscribeLocalStream = NativeRTCRoomFunctions.nativeEnableSubscribeLocalStream(j, z);
            }
            return iNativeEnableSubscribeLocalStream;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public String getCallId() {
        String strNativeGetCallId;
        LogUtil.m82083d(TAG, "getCallId");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native rtcroom is invalid, getCallId failed.");
                strNativeGetCallId = "";
            } else {
                strNativeGetCallId = NativeRTCRoomFunctions.nativeGetCallId(j);
            }
            return strNativeGetCallId;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public long getNativeHandle() {
        return this.mNativeRtcRoom;
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public IPanoramicVideo getPanoramicVideo() {
        LogUtil.m82083d(TAG, "getPanoramicVideo...");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j != 0) {
                NativePanoramicVideo nativePanoramicVideo = this.mPanoramicVideo;
                if (nativePanoramicVideo == null) {
                    long jNativeGetPanoramicVideo = NativeRTCRoomFunctions.nativeGetPanoramicVideo(j);
                    if (jNativeGetPanoramicVideo == 0) {
                        LogUtil.m82084e(TAG, "getPanoramicVideo failed");
                    } else {
                        nativePanoramicVideo = new NativePanoramicVideo(jNativeGetPanoramicVideo);
                        this.mPanoramicVideo = nativePanoramicVideo;
                    }
                }
                return nativePanoramicVideo;
            }
            LogUtil.m82084e(TAG, "native rtcroom is invalid, getPanoramicVideo failed.");
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public IRangeAudio getRangeAudio() {
        LogUtil.m82083d(TAG, "getRangeAudio...");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j != 0) {
                NativeRangeAudio nativeRangeAudio = this.mRangeAudio;
                if (nativeRangeAudio == null) {
                    long jNativeGetRangeAudio = NativeRTCRoomFunctions.nativeGetRangeAudio(j);
                    if (jNativeGetRangeAudio == 0) {
                        LogUtil.m82084e(TAG, "getRangeAudio failed");
                    } else {
                        nativeRangeAudio = new NativeRangeAudio(jNativeGetRangeAudio);
                        this.mRangeAudio = nativeRangeAudio;
                    }
                }
                return nativeRangeAudio;
            }
            LogUtil.m82084e(TAG, "native rtcroom is invalid, getRangeAudio failed.");
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public String getRoomId() {
        String strNativeGetRoomId;
        LogUtil.m82083d(TAG, "getRoomId");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native rtcroom is invalid, getRoomId failed.");
                strNativeGetRoomId = "";
            } else {
                strNativeGetRoomId = NativeRTCRoomFunctions.nativeGetRoomId(j);
            }
            return strNativeGetRoomId;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public IRTCRoomEventHandler getRtcRoomHandler() {
        return this.mRtcRoomHandler;
    }

    public IRTCRoomEventHandlerEx getRtcRoomHandlerEx() {
        return this.mRtcRoomHandlerEx;
    }

    public IRTSRoomEventHandler getRtcRoomHandlerRts() {
        return this.mRtcRoomHandlerRts;
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public ISpatialAudio getSpatialAudio() {
        LogUtil.m82083d(TAG, "getSpatialAudio...");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j != 0) {
                NativeSpatialAudio nativeSpatialAudio = this.mSpatialAudio;
                if (nativeSpatialAudio == null) {
                    long jNativeGetSpatialAudio = NativeRTCRoomFunctions.nativeGetSpatialAudio(j);
                    if (jNativeGetSpatialAudio == 0) {
                        LogUtil.m82084e(TAG, "getSpatialAudio failed");
                    } else {
                        nativeSpatialAudio = new NativeSpatialAudio(jNativeGetSpatialAudio);
                        this.mSpatialAudio = nativeSpatialAudio;
                    }
                }
                return nativeSpatialAudio;
            }
            LogUtil.m82084e(TAG, "native rtcroom is invalid, getSpatialAudio failed.");
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public String getmRoom() {
        return this.mRoom;
    }

    public String getmUser() {
        return this.mUser;
    }

    @Override // com.p074ss.bytertc.engine.RTSRoom
    public int joinRTSRoom(String str, UserInfo userInfo) {
        StringBuilder sb = new StringBuilder("joinRoom with token: ");
        sb.append(str);
        sb.append(",room");
        sb.append(this.mRoom);
        sb.append(" and uid: ");
        sb.append(userInfo == null ? "" : userInfo.getUid());
        LogUtil.m82083d(TAG, sb.toString());
        this.mJniReadLock.lock();
        return -1;
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public int joinRoom(String str, UserInfo userInfo, boolean z, RTCRoomConfig rTCRoomConfig) {
        int iNativeJoinRoomWithRoomConfig;
        StringBuilder sb = new StringBuilder("joinRoom with token: ");
        sb.append(str);
        sb.append(",room");
        sb.append(this.mRoom);
        sb.append(" and uid: ");
        sb.append(userInfo == null ? "" : userInfo.getUid());
        LogUtil.m82083d(TAG, sb.toString());
        this.mJniReadLock.lock();
        try {
            if (this.mNativeRtcRoom == 0) {
                LogUtil.m82084e(TAG, "native room is invalid, joinRoom failed.");
                iNativeJoinRoomWithRoomConfig = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (userInfo == null || str == null) {
                iNativeJoinRoomWithRoomConfig = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                this.mUser = userInfo.getUid();
                iNativeJoinRoomWithRoomConfig = NativeRTCRoomFunctions.nativeJoinRoomWithRoomConfig(this.mNativeRtcRoom, str, userInfo, z, rTCRoomConfig);
            }
            return iNativeJoinRoomWithRoomConfig;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTSRoom
    public int leaveRoom() {
        int iNativeLeaveRoom;
        LogUtil.m82083d(TAG, "leaveChannel");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native rtcroom is invalid, leaveChannel failed.");
                iNativeLeaveRoom = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                this.mRoom = "";
                this.mUser = "";
                iNativeLeaveRoom = NativeRTCRoomFunctions.nativeLeaveRoom(j);
            }
            return iNativeLeaveRoom;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public int pauseAllSubscribedStreamAudio() {
        int iNativePauseAllSubscribedStreamAudio;
        LogUtil.m82083d(TAG, "pauseAllSubscribedStreamAudio...");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native rtcroom is invalid, pauseAllSubscribedStreamAudio failed.");
                iNativePauseAllSubscribedStreamAudio = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativePauseAllSubscribedStreamAudio = NativeRTCRoomFunctions.nativePauseAllSubscribedStreamAudio(j);
            }
            return iNativePauseAllSubscribedStreamAudio;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public int pauseAllSubscribedStreamVideo() {
        int iNativePauseAllSubscribedStreamVideo;
        LogUtil.m82083d(TAG, "pauseAllSubscribedStreamVideo...");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native rtcroom is invalid, pauseAllSubscribedStreamVideo failed.");
                iNativePauseAllSubscribedStreamVideo = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativePauseAllSubscribedStreamVideo = NativeRTCRoomFunctions.nativePauseAllSubscribedStreamVideo(j);
            }
            return iNativePauseAllSubscribedStreamVideo;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public int pauseForwardStreamToAllRooms() {
        int iNativePauseForwardStreamToAllRooms;
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native rtcroom is invalid, pauseForwardStreamToAllRooms failed.");
                iNativePauseForwardStreamToAllRooms = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativePauseForwardStreamToAllRooms = NativeRTCRoomFunctions.nativePauseForwardStreamToAllRooms(j);
            }
            return iNativePauseForwardStreamToAllRooms;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public int publishScreenAudio(boolean z) {
        int iNativePublishScreenAudio;
        LogUtil.m82083d(TAG, "publishScreenAudio");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native rtcroom is invalid,publishScreenAudio failed.\"");
                iNativePublishScreenAudio = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativePublishScreenAudio = NativeRTCRoomFunctions.nativePublishScreenAudio(j, z);
            }
            return iNativePublishScreenAudio;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public int publishScreenVideo(boolean z) {
        int iNativePublishScreenVideo;
        LogUtil.m82083d(TAG, "publishScreenVideo");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native rtcroom is invalid,publishScreenVideo failed.\"");
                iNativePublishScreenVideo = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativePublishScreenVideo = NativeRTCRoomFunctions.nativePublishScreenVideo(j, z);
            }
            return iNativePublishScreenVideo;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoomEx
    public int publishStream(StreamIndex streamIndex, MediaStreamType mediaStreamType) {
        int iNativePublishStreamEx;
        LogUtil.m82083d(TAG, "publishStream: " + streamIndex);
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native rtcroom is invalid, publishStream failed.\"");
                iNativePublishStreamEx = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativePublishStreamEx = NativeRTCRoomFunctions.nativePublishStreamEx(j, streamIndex.value(), mediaStreamType.value);
            }
            return iNativePublishStreamEx;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public int publishStreamAudio(boolean z) {
        int iNativePublishStreamAudio;
        LogUtil.m82083d(TAG, "publishStreamAudio");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native rtcroom is invalid,publishStreamAudio failed.\"");
                iNativePublishStreamAudio = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativePublishStreamAudio = NativeRTCRoomFunctions.nativePublishStreamAudio(j, z);
            }
            return iNativePublishStreamAudio;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public int publishStreamVideo(boolean z) {
        int iNativePublishStreamVideo;
        LogUtil.m82083d(TAG, "publishStreamVideo");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native rtcroom is invalid,publishStreamVideo failed.\"");
                iNativePublishStreamVideo = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativePublishStreamVideo = NativeRTCRoomFunctions.nativePublishStreamVideo(j, z);
            }
            return iNativePublishStreamVideo;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public int resumeAllSubscribedStreamAudio() {
        int iNativeResumeAllSubscribedStreamAudio;
        LogUtil.m82083d(TAG, "resumeAllSubscribedStreamAudio...");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native rtcroom is invalid, resumeAllSubscribedStreamAudio failed.");
                iNativeResumeAllSubscribedStreamAudio = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeResumeAllSubscribedStreamAudio = NativeRTCRoomFunctions.nativeResumeAllSubscribedStreamAudio(j);
            }
            return iNativeResumeAllSubscribedStreamAudio;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public int resumeAllSubscribedStreamVideo() {
        int iNativeResumeAllSubscribedStreamVideo;
        LogUtil.m82083d(TAG, "resumeAllSubscribedStreamVideo...");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native rtcroom is invalid, resumeAllSubscribedStreamVideo failed.");
                iNativeResumeAllSubscribedStreamVideo = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeResumeAllSubscribedStreamVideo = NativeRTCRoomFunctions.nativeResumeAllSubscribedStreamVideo(j);
            }
            return iNativeResumeAllSubscribedStreamVideo;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public int resumeForwardStreamToAllRooms() {
        int iNativeResumeForwardStreamToAllRooms;
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native rtcroom is invalid, resumeForwardStreamToAllRooms failed.");
                iNativeResumeForwardStreamToAllRooms = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeResumeForwardStreamToAllRooms = NativeRTCRoomFunctions.nativeResumeForwardStreamToAllRooms(j);
            }
            return iNativeResumeForwardStreamToAllRooms;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTSRoom
    public long sendRoomBinaryMessage(byte[] bArr) {
        LogUtil.m82083d(TAG, "SendRoomBinaryMessage ");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j != 0) {
                return NativeRTCRoomFunctions.nativeSendRoomBinaryMessage(j, bArr);
            }
            LogUtil.m82084e(TAG, "native rtcroom is invalid, SendRoomBinaryMessage failed.");
            return -1L;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTSRoom
    public long sendRoomMessage(String str) {
        LogUtil.m82083d(TAG, "SendRoomMessage ");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j != 0) {
                return NativeRTCRoomFunctions.nativeSendRoomMessage(j, str);
            }
            LogUtil.m82084e(TAG, "native rtcroom is invalid, SendRoomMessage failed.");
            return -1L;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTSRoom
    public long sendUserBinaryMessage(String str, byte[] bArr, MessageConfig messageConfig) {
        LogUtil.m82083d(TAG, "SendUserBinaryMessage. uid : " + str + ", message length:" + bArr.length);
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j != 0) {
                return NativeRTCRoomFunctions.nativeSendUserBinaryMessage(j, str, bArr, messageConfig.value());
            }
            LogUtil.m82084e(TAG, "native rtcroom is invalid, SendUserBinaryMessage failed.");
            return -1L;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTSRoom
    public long sendUserMessage(String str, String str2, MessageConfig messageConfig) {
        LogUtil.m82083d(TAG, "SendUserMessage. uid : " + str + ", message" + str2);
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j != 0) {
                return NativeRTCRoomFunctions.nativeSendUserMessage(j, str, str2, messageConfig.value());
            }
            LogUtil.m82084e(TAG, "native rtcroom is invalid, SendUserMessage failed.");
            return -1L;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public int setAudioSelectionConfig(AudioSelectionPriority audioSelectionPriority) {
        int iNativeSetAudioSelectionConfig;
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native rtcroom is invalid, setAudioSelectionConfig failed.");
                iNativeSetAudioSelectionConfig = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetAudioSelectionConfig = NativeRTCRoomFunctions.nativeSetAudioSelectionConfig(j, audioSelectionPriority.value());
            }
            return iNativeSetAudioSelectionConfig;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public int setMultiDeviceAVSync(String str) {
        int iNativeSetMultiDeviceAVSync;
        LogUtil.m82083d(TAG, "setMultiDeviceAVSync ");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native rtcroom is invalid, setMultiDeviceAVSync failed.");
                iNativeSetMultiDeviceAVSync = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetMultiDeviceAVSync = NativeRTCRoomFunctions.nativeSetMultiDeviceAVSync(j, str);
            }
            return iNativeSetMultiDeviceAVSync;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public int setRTCRoomEventHandler(IRTCRoomEventHandler iRTCRoomEventHandler) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeRtcRoom == 0) {
                LogUtil.m82084e(TAG, "native room is invalid, setRTCRoomEventHandler failed.");
                return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            }
            this.mRtcRoomHandler = iRTCRoomEventHandler;
            RTCRoomEventHandler rTCRoomEventHandler = new RTCRoomEventHandler(this, null);
            this.mRtcRoomEventHandler = rTCRoomEventHandler;
            long j = this.mNativeRtcRoomEventHandler;
            this.mNativeRtcRoomEventHandler = NativeRTCRoomFunctions.nativeSetRTCRoomEventHandler(this.mNativeRtcRoom, rTCRoomEventHandler);
            if (j != 0) {
                NativeRTCRoomFunctions.nativeReleaseRTCRoomEventHandler(j);
            }
            return 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoomEx
    public int setRTCRoomEventHandlerEx(IRTCRoomEventHandlerEx iRTCRoomEventHandlerEx) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeRtcRoom == 0) {
                LogUtil.m82084e(TAG, "native room is invalid, setRTCRoomEventHandler failed.");
                return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            }
            this.mRtcRoomHandlerEx = iRTCRoomEventHandlerEx;
            RTCRoomEventHandlerEx rTCRoomEventHandlerEx = new RTCRoomEventHandlerEx(this);
            this.mRtcRoomEventHandlerEx = rTCRoomEventHandlerEx;
            long j = this.mNativeRtcRoomEventHandlerEx;
            this.mNativeRtcRoomEventHandlerEx = NativeRTCRoomFunctions.nativeSetRTCRoomEventHandlerEx(this.mNativeRtcRoom, rTCRoomEventHandlerEx);
            if (j != 0) {
                NativeRTCRoomFunctions.nativeReleaseRTCRoomEventHandlerEx(j);
            }
            return 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTSRoom
    public int setRTSRoomEventHandler(IRTSRoomEventHandler iRTSRoomEventHandler) {
        this.mJniReadLock.lock();
        return 0;
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public int setRemoteRoomAudioPlaybackVolume(int i) {
        int iNativeSetRemoteRoomAudioPlaybackVolume;
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native rtcroom is invalid, setRemoteRoomAudioPlaybackVolume failed.");
                iNativeSetRemoteRoomAudioPlaybackVolume = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetRemoteRoomAudioPlaybackVolume = NativeRTCRoomFunctions.nativeSetRemoteRoomAudioPlaybackVolume(j, i);
            }
            return iNativeSetRemoteRoomAudioPlaybackVolume;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public int setRemoteSimulcastStreamType(String str, SimulcastStreamType simulcastStreamType) {
        int iValue;
        LogUtil.m82083d(TAG, "setRemoteSimulcastStreamType");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0 || simulcastStreamType == null) {
                LogUtil.m82084e(TAG, "native rtcroom is invalid,setRemoteSimulcastStreamType  failed.\"");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iValue = NativeRTCRoomFunctions.nativeSetRemoteSimulcastStreamType(j, str, simulcastStreamType.value());
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoomEx
    public int setRemoteVideoConfig(String str, StreamIndex streamIndex, RemoteVideoConfig remoteVideoConfig) {
        int iNativeSetRemoteVideoConfigEx;
        LogUtil.m82083d(TAG, "setRemoteVideoConfig: userId: " + str + ", streamIndex: " + streamIndex);
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native rtcroom is invalid, setRemoteVideoConfig failed.\"");
                iNativeSetRemoteVideoConfigEx = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetRemoteVideoConfigEx = NativeRTCRoomFunctions.nativeSetRemoteVideoConfigEx(j, str, streamIndex.value(), remoteVideoConfig.getWidth(), remoteVideoConfig.getHeight(), remoteVideoConfig.getFrameRate());
            }
            return iNativeSetRemoteVideoConfigEx;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public long setRoomExtraInfo(String str, String str2) {
        this.mJniReadLock.lock();
        if (str == null) {
            this.mJniReadLock.unlock();
            return -2L;
        }
        if (str2 == null) {
            this.mJniReadLock.unlock();
            return -3L;
        }
        try {
            LogUtil.m82083d(TAG, "setRoomExtraInfo,key : " + str + ", value" + str2);
            long j = this.mNativeRtcRoom;
            if (j != 0) {
                return NativeRTCRoomFunctions.nativeSetRoomExtraInfo(j, str, str2);
            }
            LogUtil.m82084e(TAG, "native rtcroom is invalid, setRoomExtraInfo failed.");
            return -1L;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public int setUserVisibility(boolean z) {
        int iNativeSetUserVisibility;
        LogUtil.m82083d(TAG, "setUserVisibility. enable : " + z);
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native engine is invalid, setUserVisibility failed.");
                iNativeSetUserVisibility = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetUserVisibility = NativeRTCRoomFunctions.nativeSetUserVisibility(j, z);
            }
            return iNativeSetUserVisibility;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public int startForwardStreamToRooms(List<ForwardStreamInfo> list) {
        int iNativeStartForwardStreamToRooms;
        this.mJniReadLock.lock();
        try {
            if (this.mNativeRtcRoom == 0) {
                LogUtil.m82084e(TAG, "native rtcroom is invalid, startForwardStreamToRooms failed.");
                iNativeStartForwardStreamToRooms = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (list == null) {
                iNativeStartForwardStreamToRooms = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                LinkedList linkedList = new LinkedList();
                Iterator<ForwardStreamInfo> it = list.iterator();
                while (it.hasNext()) {
                    linkedList.add(new InternalForwardStreamInfo(it.next()));
                }
                iNativeStartForwardStreamToRooms = NativeRTCRoomFunctions.nativeStartForwardStreamToRooms(this.mNativeRtcRoom, linkedList);
            }
            return iNativeStartForwardStreamToRooms;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public int startSubtitle(SubtitleConfig subtitleConfig) {
        int iValue;
        this.mJniReadLock.lock();
        try {
            LogUtil.m82083d(TAG, "startSubtitle");
            long j = this.mNativeRtcRoom;
            if (j == 0 || subtitleConfig == null) {
                LogUtil.m82084e(TAG, "native rtcroom or config is invalid, startSubtitle failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iValue = NativeRTCRoomFunctions.nativeStartSubtitle(j, subtitleConfig.mode.value(), subtitleConfig.targetLanguage);
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public int stopForwardStreamToRooms() {
        int iNativeStopForwardStreamToRooms;
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native rtcroom is invalid, stopForwardStreamToRooms failed.");
                iNativeStopForwardStreamToRooms = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStopForwardStreamToRooms = NativeRTCRoomFunctions.nativeStopForwardStreamToRooms(j);
            }
            return iNativeStopForwardStreamToRooms;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public int stopSubtitle() {
        int iNativeStopSubtitle;
        this.mJniReadLock.lock();
        try {
            LogUtil.m82083d(TAG, "stopSubtitle");
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native rtcroom is invalid, stopSubtitle failed.");
                iNativeStopSubtitle = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStopSubtitle = NativeRTCRoomFunctions.nativeStopSubtitle(j);
            }
            return iNativeStopSubtitle;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public int subscribeAllStreamsAudio(boolean z) {
        int iNativeSubscribeAllStreamsAudio;
        LogUtil.m82083d(TAG, "subscribeStream, subscribe:" + z);
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native engine is invalid, subscribeAllStreamsAudio failed.");
                iNativeSubscribeAllStreamsAudio = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSubscribeAllStreamsAudio = NativeRTCRoomFunctions.nativeSubscribeAllStreamsAudio(j, z);
            }
            return iNativeSubscribeAllStreamsAudio;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public int subscribeAllStreamsVideo(boolean z) {
        int iNativeSubscribeAllStreamsVideo;
        LogUtil.m82083d(TAG, "subscribeStream, subscribe:" + z);
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native engine is invalid, subscribeAllStreamsVideo failed.");
                iNativeSubscribeAllStreamsVideo = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSubscribeAllStreamsVideo = NativeRTCRoomFunctions.nativeSubscribeAllStreamsVideo(j, z);
            }
            return iNativeSubscribeAllStreamsVideo;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public int subscribeScreenAudio(String str, boolean z) {
        int iNativeSubscribeScreenAudio;
        LogUtil.m82083d(TAG, "subscribeScreenAudio: userId: " + str + ", subscribe: " + z);
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native rtcroom is invalid, subscribeScreenAudio failed.\"");
                iNativeSubscribeScreenAudio = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSubscribeScreenAudio = NativeRTCRoomFunctions.nativeSubscribeScreenAudio(j, str, z);
            }
            return iNativeSubscribeScreenAudio;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public int subscribeScreenVideo(String str, boolean z) {
        int iNativeSubscribeScreenVideo;
        LogUtil.m82083d(TAG, "subscribeScreenVideo: userId: " + str + ", subscribe: " + z);
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native rtcroom is invalid, subscribeScreenVideo failed.\"");
                iNativeSubscribeScreenVideo = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSubscribeScreenVideo = NativeRTCRoomFunctions.nativeSubscribeScreenVideo(j, str, z);
            }
            return iNativeSubscribeScreenVideo;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoomEx
    public int subscribeStream(String str, StreamIndex streamIndex, MediaStreamType mediaStreamType) {
        int iNativeSubscribeStreamEx;
        LogUtil.m82083d(TAG, "subscribeStream: userId: " + str + ", streamIndex: " + streamIndex);
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native rtcroom is invalid, subscribeStream failed.\"");
                iNativeSubscribeStreamEx = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSubscribeStreamEx = NativeRTCRoomFunctions.nativeSubscribeStreamEx(j, str, streamIndex.value(), mediaStreamType.value);
            }
            return iNativeSubscribeStreamEx;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public int subscribeStreamAudio(String str, boolean z) {
        int iNativeSubscribeStreamAudio;
        LogUtil.m82083d(TAG, "subscribeStreamAudio: userId: " + str + ", subscribe: " + z);
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native rtcroom is invalid, subscribeStreamAudio failed.\"");
                iNativeSubscribeStreamAudio = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSubscribeStreamAudio = NativeRTCRoomFunctions.nativeSubscribeStreamAudio(j, str, z);
            }
            return iNativeSubscribeStreamAudio;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public int subscribeStreamVideo(String str, boolean z) {
        int iNativeSubscribeStreamVideo;
        LogUtil.m82083d(TAG, "subscribeStreamVideo: userId: " + str + ", subscribe: " + z);
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native rtcroom is invalid, subscribeStreamVideo failed.\"");
                iNativeSubscribeStreamVideo = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSubscribeStreamVideo = NativeRTCRoomFunctions.nativeSubscribeStreamVideo(j, str, z);
            }
            return iNativeSubscribeStreamVideo;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoomEx
    public int unpublishStream(StreamIndex streamIndex, MediaStreamType mediaStreamType) {
        int iNativeUnpublishStreamEx;
        LogUtil.m82083d(TAG, "unpublishStream: " + streamIndex);
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native rtcroom is invalid, unpublishStream failed.\"");
                iNativeUnpublishStreamEx = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeUnpublishStreamEx = NativeRTCRoomFunctions.nativeUnpublishStreamEx(j, streamIndex.value(), mediaStreamType.value);
            }
            return iNativeUnpublishStreamEx;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoomEx
    public int unsubscribeStream(String str, StreamIndex streamIndex, MediaStreamType mediaStreamType) {
        int iNativeUnsubscribeStreamEx;
        LogUtil.m82083d(TAG, "unsubscribeStream: userId: " + str + ", streamIndex: " + streamIndex);
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native rtcroom is invalid, unsubscribeStream failed.\"");
                iNativeUnsubscribeStreamEx = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeUnsubscribeStreamEx = NativeRTCRoomFunctions.nativeUnsubscribeStreamEx(j, str, streamIndex.value(), mediaStreamType.value);
            }
            return iNativeUnsubscribeStreamEx;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCRoom
    public int updateForwardStreamToRooms(List<ForwardStreamInfo> list) {
        int iNativeUpdateForwardStreamToRooms;
        this.mJniReadLock.lock();
        try {
            if (this.mNativeRtcRoom == 0) {
                LogUtil.m82084e(TAG, "native rtcroom is invalid, updateForwardStreamToRooms failed.");
                iNativeUpdateForwardStreamToRooms = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (list == null) {
                iNativeUpdateForwardStreamToRooms = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                LinkedList linkedList = new LinkedList();
                Iterator<ForwardStreamInfo> it = list.iterator();
                while (it.hasNext()) {
                    linkedList.add(new InternalForwardStreamInfo(it.next()));
                }
                iNativeUpdateForwardStreamToRooms = NativeRTCRoomFunctions.nativeUpdateForwardStreamToRooms(this.mNativeRtcRoom, linkedList);
            }
            return iNativeUpdateForwardStreamToRooms;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTSRoom
    public int updateToken(String str) {
        int iNativeUpdateToken;
        LogUtil.m82083d(TAG, "updateToken. token : " + str);
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native rtcroom is invalid, updateToken failed.");
                iNativeUpdateToken = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeUpdateToken = NativeRTCRoomFunctions.nativeUpdateToken(j, str);
            }
            return iNativeUpdateToken;
        } finally {
            this.mJniReadLock.unlock();
        }
    }
}
