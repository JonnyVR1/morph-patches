package com.p069ss.bytertc.engine;

import com.p069ss.bytertc.engine.audio.IRangeAudio;
import com.p069ss.bytertc.engine.data.ReturnStatus;
import com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler;
import com.p069ss.bytertc.engine.handler.RTCRoomEventHandler;
import com.p069ss.bytertc.engine.utils.LogUtil;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes13.dex */
public class GameRoomImpl extends IGameRoom {
    protected static final String TAG = "GameRoom";
    private final ReentrantReadWriteLock.ReadLock mJniReadLock;
    private final ReentrantReadWriteLock.WriteLock mJniWriteLock;
    protected long mNativeGameRtcRoom;
    private long mNativeGameRtcRoomEventHandler = 0;
    private NativeRangeAudio mRangeAudio = null;
    private final ReentrantReadWriteLock mReadWriteLock;
    private String mRoom;
    private RTCRoomEventHandler mRtcRoomEventHandler;
    private IRTCRoomEventHandler mRtcRoomHandler;
    private String mUser;

    public GameRoomImpl(String str, long j) {
        this.mNativeGameRtcRoom = 0L;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWriteLock = reentrantReadWriteLock;
        this.mJniReadLock = reentrantReadWriteLock.readLock();
        this.mJniWriteLock = reentrantReadWriteLock.writeLock();
        this.mNativeGameRtcRoom = j;
        this.mRoom = str;
    }

    @Override // com.p069ss.bytertc.engine.IGameRoom
    public void destroy() {
        LogUtil.m80900d(TAG, "Destroy ");
        this.mJniWriteLock.lock();
        try {
            long j = this.mNativeGameRtcRoom;
            if (j == 0) {
                LogUtil.m80901e(TAG, "native rtcroom is invalid, Destroy failed.");
                this.mJniWriteLock.unlock();
                return;
            }
            this.mNativeGameRtcRoom = 0L;
            NativeRangeAudio nativeRangeAudio = this.mRangeAudio;
            if (nativeRangeAudio != null) {
                nativeRangeAudio.destroy();
            }
            this.mJniWriteLock.unlock();
            NativeGameRTCRoomFunctions.nativeDestory(j);
            long j2 = this.mNativeGameRtcRoomEventHandler;
            if (j2 != 0) {
                NativeGameRTCRoomFunctions.nativeReleaseRTCRoomEventHandler(j2);
                this.mNativeGameRtcRoomEventHandler = 0L;
            }
        } catch (Throwable th) {
            this.mJniWriteLock.unlock();
            throw th;
        }
    }

    @Override // com.p069ss.bytertc.engine.IGameRoom
    public int enableAudioReceive(String str, boolean z) {
        int iNativeEnableAudioReceive;
        LogUtil.m80900d(TAG, "enableAudioReceive. enable : " + z);
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeGameRtcRoom;
            if (j == 0) {
                LogUtil.m80901e(TAG, "native rtcroom is invalid, enableSpeakerphone failed.");
                iNativeEnableAudioReceive = ReturnStatus.RETURN_STATUS_ROOM_IS_DESTROY.value();
            } else {
                iNativeEnableAudioReceive = NativeGameRTCRoomFunctions.nativeEnableAudioReceive(j, str, z);
            }
            return iNativeEnableAudioReceive;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.engine.IGameRoom
    public int enableAudioSend(boolean z) {
        int iNativeEnableAudioSend;
        LogUtil.m80900d(TAG, "enableAudioSend. enable : " + z);
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeGameRtcRoom;
            if (j == 0) {
                LogUtil.m80901e(TAG, "native rtcroom is invalid, enableSpeakerphone failed.");
                iNativeEnableAudioSend = ReturnStatus.RETURN_STATUS_ROOM_IS_DESTROY.value();
            } else {
                iNativeEnableAudioSend = NativeGameRTCRoomFunctions.nativeEnableAudioSend(j, z);
            }
            return iNativeEnableAudioSend;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.engine.IGameRoom
    public int enableMicrophone(boolean z) {
        int iNativeEnableMicrophone;
        LogUtil.m80900d(TAG, "enableMicrophone. enable : " + z);
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeGameRtcRoom;
            if (j == 0) {
                LogUtil.m80901e(TAG, "native rtcroom is invalid, enableMicrophone failed.");
                iNativeEnableMicrophone = ReturnStatus.RETURN_STATUS_ROOM_IS_DESTROY.value();
            } else {
                iNativeEnableMicrophone = NativeGameRTCRoomFunctions.nativeEnableMicrophone(j, z);
            }
            return iNativeEnableMicrophone;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.engine.IGameRoom
    public int enableSpeakerphone(boolean z) {
        int iNativeEnableSpeakerphone;
        LogUtil.m80900d(TAG, "enableSpeakerphone. enable : " + z);
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeGameRtcRoom;
            if (j == 0) {
                LogUtil.m80901e(TAG, "native rtcroom is invalid, enableSpeakerphone failed.");
                iNativeEnableSpeakerphone = ReturnStatus.RETURN_STATUS_ROOM_IS_DESTROY.value();
            } else {
                iNativeEnableSpeakerphone = NativeGameRTCRoomFunctions.nativeEnableSpeakerphone(j, z);
            }
            return iNativeEnableSpeakerphone;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public long getNativeHandle() {
        this.mJniReadLock.lock();
        try {
            return this.mNativeGameRtcRoom;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.engine.IGameRoom
    public IRangeAudio getRangeAudio() {
        LogUtil.m80900d(TAG, "getRangeAudio...");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeGameRtcRoom;
            if (j != 0) {
                NativeRangeAudio nativeRangeAudio = this.mRangeAudio;
                if (nativeRangeAudio == null) {
                    long jNativeGetRangeAudio = NativeGameRTCRoomFunctions.nativeGetRangeAudio(j);
                    if (jNativeGetRangeAudio == 0) {
                        LogUtil.m80901e(TAG, "getRangeAudio failed");
                    } else {
                        nativeRangeAudio = new NativeRangeAudio(jNativeGetRangeAudio);
                        this.mRangeAudio = nativeRangeAudio;
                    }
                }
                return nativeRangeAudio;
            }
            LogUtil.m80901e(TAG, "native rtcroom is invalid, getRangeAudio failed.");
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public IRTCRoomEventHandler getRtcRoomHandler() {
        return this.mRtcRoomHandler;
    }

    public String getmRoom() {
        return this.mRoom;
    }

    public String getmUser() {
        return this.mUser;
    }

    @Override // com.p069ss.bytertc.engine.IGameRoom
    public int joinRoom(String str, UserInfo userInfo) {
        int iNativeJoinRoom;
        StringBuilder sb = new StringBuilder("joinRoom with token: ");
        sb.append(str);
        sb.append(",room");
        sb.append(this.mRoom);
        sb.append(" and uid: ");
        sb.append(userInfo == null ? "" : userInfo.getUid());
        LogUtil.m80900d(TAG, sb.toString());
        this.mJniReadLock.lock();
        try {
            if (this.mNativeGameRtcRoom == 0) {
                LogUtil.m80901e(TAG, "native room is invalid, joinRoom failed.");
                iNativeJoinRoom = ReturnStatus.RETURN_STATUS_ROOM_IS_DESTROY.value();
            } else if (userInfo == null || str == null) {
                iNativeJoinRoom = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                this.mUser = userInfo.getUid();
                iNativeJoinRoom = NativeGameRTCRoomFunctions.nativeJoinRoom(this.mNativeGameRtcRoom, str, userInfo);
            }
            return iNativeJoinRoom;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.engine.IGameRoom
    public int leaveRoom() {
        int iNativeLeaveRoom;
        LogUtil.m80900d(TAG, "leaveChannel");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeGameRtcRoom;
            if (j == 0) {
                LogUtil.m80901e(TAG, "native rtcroom is invalid, leaveChannel failed.");
                iNativeLeaveRoom = ReturnStatus.RETURN_STATUS_ROOM_IS_DESTROY.value();
            } else {
                this.mRoom = "";
                this.mUser = "";
                iNativeLeaveRoom = NativeGameRTCRoomFunctions.nativeLeaveRoom(j);
            }
            return iNativeLeaveRoom;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.engine.IGameRoom
    public int setRTCRoomEventHandler(IRTCRoomEventHandler iRTCRoomEventHandler) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeGameRtcRoom == 0) {
                LogUtil.m80901e(TAG, "native room is invalid, setRTCRoomEventHandler failed.");
                return ReturnStatus.RETURN_STATUS_ROOM_IS_DESTROY.value();
            }
            this.mRtcRoomHandler = iRTCRoomEventHandler;
            RTCRoomEventHandler rTCRoomEventHandler = new RTCRoomEventHandler(null, this);
            this.mRtcRoomEventHandler = rTCRoomEventHandler;
            long j = this.mNativeGameRtcRoomEventHandler;
            this.mNativeGameRtcRoomEventHandler = NativeGameRTCRoomFunctions.nativeSetRTCRoomEventHandler(this.mNativeGameRtcRoom, rTCRoomEventHandler);
            if (j != 0) {
                NativeGameRTCRoomFunctions.nativeReleaseRTCRoomEventHandler(j);
            }
            return 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.engine.IGameRoom
    public int setRemoteRoomAudioPlaybackVolume(int i) {
        int iNativeSetRemoteRoomAudioPlaybackVolume;
        LogUtil.m80900d(TAG, "setRemoteRoomAudioPlaybackVolume volume : " + i);
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeGameRtcRoom;
            if (j == 0) {
                LogUtil.m80901e(TAG, "native rtcroom is invalid, enableSpeakerphone failed.");
                iNativeSetRemoteRoomAudioPlaybackVolume = ReturnStatus.RETURN_STATUS_ROOM_IS_DESTROY.value();
            } else {
                iNativeSetRemoteRoomAudioPlaybackVolume = NativeGameRTCRoomFunctions.nativeSetRemoteRoomAudioPlaybackVolume(j, i);
            }
            return iNativeSetRemoteRoomAudioPlaybackVolume;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.engine.IGameRoom
    public int updateToken(String str) {
        int iNativeUpdateToken;
        LogUtil.m80900d(TAG, "updateToken. token : " + str);
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeGameRtcRoom;
            if (j == 0) {
                LogUtil.m80901e(TAG, "native rtcroom is invalid, updateToken failed.");
                iNativeUpdateToken = ReturnStatus.RETURN_STATUS_ROOM_IS_DESTROY.value();
            } else {
                iNativeUpdateToken = NativeGameRTCRoomFunctions.nativeUpdateToken(j, str);
            }
            return iNativeUpdateToken;
        } finally {
            this.mJniReadLock.unlock();
        }
    }
}
