package com.p069ss.bytertc.engine;

import com.p069ss.bytertc.engine.data.ReturnStatus;
import com.p069ss.bytertc.engine.handler.IRTSRoomEventHandler;
import com.p069ss.bytertc.engine.handler.RTCRoomEventHandlerRts;
import com.p069ss.bytertc.engine.type.MessageConfig;
import com.p069ss.bytertc.engine.utils.LogUtil;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes13.dex */
public class RTSRoomImpl extends RTSRoom {
    protected static final String TAG = "RTSRoom";
    private final ReentrantReadWriteLock.ReadLock mJniReadLock;
    private final ReentrantReadWriteLock.WriteLock mJniWriteLock;
    protected long mNativeRtcRoom;
    private long mNativeRtcRoomEventHandlerRts = 0;
    private final ReentrantReadWriteLock mReadWriteLock;
    private String mRoom;
    private RTCRoomEventHandlerRts mRtcRoomEventHandlerRts;
    private IRTSRoomEventHandler mRtcRoomHandlerRts;
    private String mUser;

    public RTSRoomImpl(String str, long j) {
        this.mNativeRtcRoom = 0L;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWriteLock = reentrantReadWriteLock;
        this.mJniReadLock = reentrantReadWriteLock.readLock();
        this.mJniWriteLock = reentrantReadWriteLock.writeLock();
        this.mNativeRtcRoom = j;
        this.mRoom = str;
    }

    @Override // com.p069ss.bytertc.engine.RTSRoom
    public void destroy() {
        LogUtil.m80900d(TAG, "Destroy ");
        this.mJniWriteLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m80901e(TAG, "native rtcroom is invalid, Destroy failed.");
                this.mJniWriteLock.unlock();
                return;
            }
            this.mNativeRtcRoom = 0L;
            this.mJniWriteLock.unlock();
            NativeRTCRoomFunctions.nativeDestroyRTSRoom(j);
            long j2 = this.mNativeRtcRoomEventHandlerRts;
            if (j2 != 0) {
                NativeRTCRoomFunctions.nativeReleaseRTCRoomEventHandlerRts(j2);
                this.mNativeRtcRoomEventHandlerRts = 0L;
            }
        } catch (Throwable th) {
            this.mJniWriteLock.unlock();
            throw th;
        }
    }

    public long getNativeHandle() {
        return this.mNativeRtcRoom;
    }

    public IRTSRoomEventHandler getRtcRoomHandlerRts() {
        return this.mRtcRoomHandlerRts;
    }

    public String getmRoom() {
        return this.mRoom;
    }

    public String getmUser() {
        return this.mUser;
    }

    @Override // com.p069ss.bytertc.engine.RTSRoom
    public int joinRTSRoom(String str, UserInfo userInfo) {
        int iNativeJoinRTSRoom;
        StringBuilder sb = new StringBuilder("joinRoom with token: ");
        sb.append(str);
        sb.append(",room");
        sb.append(this.mRoom);
        sb.append(" and uid: ");
        sb.append(userInfo == null ? "" : userInfo.getUid());
        LogUtil.m80900d(TAG, sb.toString());
        this.mJniReadLock.lock();
        try {
            if (this.mNativeRtcRoom == 0) {
                LogUtil.m80901e(TAG, "native room is invalid, joinRoom failed.");
                iNativeJoinRTSRoom = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (userInfo == null || str == null) {
                iNativeJoinRTSRoom = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                this.mUser = userInfo.getUid();
                iNativeJoinRTSRoom = NativeRTCRoomFunctions.nativeJoinRTSRoom(this.mNativeRtcRoom, str, userInfo);
            }
            return iNativeJoinRTSRoom;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.engine.RTSRoom
    public int leaveRoom() {
        int iNativeLeaveRTSRoom;
        LogUtil.m80900d(TAG, "leaveChannel");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m80901e(TAG, "native rtcroom is invalid, leaveChannel failed.");
                iNativeLeaveRTSRoom = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                this.mRoom = "";
                this.mUser = "";
                iNativeLeaveRTSRoom = NativeRTCRoomFunctions.nativeLeaveRTSRoom(j);
            }
            return iNativeLeaveRTSRoom;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.engine.RTSRoom
    public long sendRoomBinaryMessage(byte[] bArr) {
        LogUtil.m80900d(TAG, "SendRoomBinaryMessage ");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j != 0) {
                return NativeRTCRoomFunctions.nativeSendRTSRoomBinaryMessage(j, bArr);
            }
            LogUtil.m80901e(TAG, "native rtcroom is invalid, SendRoomBinaryMessage failed.");
            return -1L;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.engine.RTSRoom
    public long sendRoomMessage(String str) {
        LogUtil.m80900d(TAG, "SendRoomMessage ");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j != 0) {
                return NativeRTCRoomFunctions.nativeSendRTSRoomMessage(j, str);
            }
            LogUtil.m80901e(TAG, "native rtcroom is invalid, SendRoomMessage failed.");
            return -1L;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.engine.RTSRoom
    public long sendUserBinaryMessage(String str, byte[] bArr, MessageConfig messageConfig) {
        LogUtil.m80900d(TAG, "SendUserBinaryMessage. uid : " + str + ", message length:" + bArr.length);
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j != 0) {
                return NativeRTCRoomFunctions.nativeSendRTSUserBinaryMessage(j, str, bArr, messageConfig.value());
            }
            LogUtil.m80901e(TAG, "native rtcroom is invalid, SendUserBinaryMessage failed.");
            return -1L;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.engine.RTSRoom
    public long sendUserMessage(String str, String str2, MessageConfig messageConfig) {
        LogUtil.m80900d(TAG, "SendUserMessage. uid : " + str + ", message" + str2);
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j != 0) {
                return NativeRTCRoomFunctions.nativeSendRTSUserMessage(j, str, str2, messageConfig.value());
            }
            LogUtil.m80901e(TAG, "native rtcroom is invalid, SendUserMessage failed.");
            return -1L;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.engine.RTSRoom
    public int setRTSRoomEventHandler(IRTSRoomEventHandler iRTSRoomEventHandler) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeRtcRoom == 0) {
                LogUtil.m80901e(TAG, "native room is invalid, setRTCRoomEventHandler failed.");
                return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            }
            this.mRtcRoomHandlerRts = iRTSRoomEventHandler;
            RTCRoomEventHandlerRts rTCRoomEventHandlerRts = new RTCRoomEventHandlerRts(this);
            this.mRtcRoomEventHandlerRts = rTCRoomEventHandlerRts;
            long j = this.mNativeRtcRoomEventHandlerRts;
            this.mNativeRtcRoomEventHandlerRts = NativeRTCRoomFunctions.nativeSetRTCRoomEventHandlerRts(this.mNativeRtcRoom, rTCRoomEventHandlerRts);
            if (j != 0) {
                NativeRTCRoomFunctions.nativeReleaseRTCRoomEventHandlerRts(j);
            }
            return 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.engine.RTSRoom
    public int updateToken(String str) {
        int iNativeUpdateRTSToken;
        LogUtil.m80900d(TAG, "updateToken. token : " + str);
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.m80901e(TAG, "native rtcroom is invalid, updateToken failed.");
                iNativeUpdateRTSToken = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeUpdateRTSToken = NativeRTCRoomFunctions.nativeUpdateRTSToken(j, str);
            }
            return iNativeUpdateRTSToken;
        } finally {
            this.mJniReadLock.unlock();
        }
    }
}
