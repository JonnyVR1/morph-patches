package com.immomo.mediacore.sink;

import com.immomo.mediacore.audio.NonBlockingAudioTrack;
import com.immomo.mediacore.coninf.MRtcAudioHandler;
import com.immomo.mediacore.coninf.MRtcAudioHandlerEx;
import com.immomo.mediacore.coninf.MRtcChannelHandler;
import com.immomo.mediacore.coninf.MRtcEventHandler;
import com.immomo.mediacore.model.PathModel;
import java.nio.ByteBuffer;
import javax.microedition.khronos.egl.EGLContext;
import org.eclipse.jetty.util.StringUtil;
import p149l.n8c;

/* JADX INFO: loaded from: classes7.dex */
public abstract class SinkBase {
    private static final String CLASS_LABEL = "ConferenceHandle";
    private static final String LOG_TAG = "ConferenceHandle";
    private String mRtmpPath = "";
    private String mChannalName = "";
    private long mUserID = 0;
    private String serverIP = "";
    private int serverPort = 8899;
    private long mSessionId = 555;
    private boolean mIsHost = false;
    private String mSecId = "aaaa";
    private String mJsonForPos = null;
    private int mAvFlag = 1;
    private int mBusinessType = -1;
    private int mRoomType = 0;
    private boolean mMuteStatus = false;
    private boolean mVoicebackwardsEnable = false;
    private boolean Headsetpluged = false;
    private Object mAudioTrackLock = new Object();
    private NonBlockingAudioTrack mAudioTrack = null;
    private int mSampleRate = 44100;
    private int mChannelCount = 1;
    private int mErrorCode = 0;

    public interface ExtPcmDateCallback {
        void onPcmDateCallback(byte[] bArr, int i, long j);
    }

    public interface PcmDateCallback {
        void onPcmDateCallback(long j, byte[] bArr, int i, boolean z);
    }

    public interface PlaybackDateCallback {
        void onPlaybackFrame(long j, byte[] bArr, int i, boolean z);
    }

    public interface RecordDateCallback {
        void onRecordFrame(byte[] bArr, int i, boolean z);
    }

    public static short byteToShort(byte[] bArr) {
        return (short) (((short) (((short) (bArr[1] & 255)) << 8)) | ((short) (bArr[0] & 255)));
    }

    public static byte[] shortToByte(short s) {
        byte[] bArr = new byte[2];
        int i = 0;
        int i2 = s;
        while (i < 2) {
            bArr[i] = Integer.valueOf(i2 & 255).byteValue();
            i++;
            i2 >>= 8;
        }
        return bArr;
    }

    public void DeinitAudioTracks() {
        synchronized (this.mAudioTrackLock) {
            try {
                NonBlockingAudioTrack nonBlockingAudioTrack = this.mAudioTrack;
                if (nonBlockingAudioTrack != null) {
                    nonBlockingAudioTrack.stop();
                    this.mAudioTrack.release();
                    this.mAudioTrack = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void SabineEffectReset() {
    }

    public void SabineEffectSet(int i, int i2, float f) {
    }

    public void SetSubVideoPos(long j, int i, int i2, int i3, int i4) {
    }

    public void addEventHandler(MRtcEventHandler mRtcEventHandler) {
    }

    public void addMRtcAudioHandler(MRtcAudioHandler mRtcAudioHandler) {
    }

    public void addMRtcAudioHandlerEx(MRtcAudioHandlerEx mRtcAudioHandlerEx) {
    }

    public void addMRtcChannelHandler(MRtcChannelHandler mRtcChannelHandler) {
    }

    public void adjustEQ(int i, boolean z) {
    }

    public void adjustEf(int i, int i2) {
    }

    public void adjustTune(int i, boolean z) {
    }

    public int changeRole(int i) {
        return 0;
    }

    public void enableAudio(boolean z) {
    }

    public void enableAudioVolumeIndication(int i, int i2) {
    }

    public void enableCommMode(boolean z) {
    }

    public void enableVideo(boolean z) {
    }

    public long getAVDiff() {
        return 0L;
    }

    public long getAcodecSendSize() {
        return 0L;
    }

    public Object getAgoraEngine() {
        return null;
    }

    public int getAudioBitRate() {
        return 0;
    }

    public long getAudioCacheSize() {
        return 0L;
    }

    public long getAudioRxbytes() {
        return 0L;
    }

    public long getAudioTxbytes() {
        return 0L;
    }

    public String getAudioVideoStatics() {
        return "[(0)]";
    }

    public int getAvFlag() {
        return this.mAvFlag;
    }

    public long getAverageSendBitRateB() {
        return 0L;
    }

    public int getBusinessType() {
        return this.mBusinessType;
    }

    public String getChannalName() {
        return this.mChannalName;
    }

    public int getDefaultAecParam() {
        return 0;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public boolean getHeadsetStatus() {
        return this.Headsetpluged;
    }

    public String getJsonForPostion() {
        return this.mJsonForPos;
    }

    public float getMasterAudioLevel() {
        return 0.5f;
    }

    public boolean getMuteStatus() {
        return this.mMuteStatus;
    }

    public float getPropertyFloat(int i, float f) {
        return 0.0f;
    }

    public long getPropertyLong(int i, long j) {
        return 0L;
    }

    public int getPublisherVideoHigh() {
        return 0;
    }

    public int getPublisherVideoWidth() {
        return 0;
    }

    public int getRoomType() {
        return this.mRoomType;
    }

    public String getRtmpPath() {
        return this.mRtmpPath;
    }

    public String getRtmpPathJson(boolean z) {
        PathModel pathModel = new PathModel(this.mRtmpPath, z);
        n8c.m158485c("ConferenceHandle", "getRtmpPath:" + this.mRtmpPath);
        return pathModel.toJson();
    }

    public long getRtmpSendSize() {
        return 0L;
    }

    public long getRxbytes() {
        return 0L;
    }

    public String getSecId() {
        return this.mSecId;
    }

    public String getServerIP() {
        return this.serverIP;
    }

    public String getServerIpAddr() {
        return StringUtil.ALL_INTERFACES;
    }

    public int getServerPort() {
        return this.serverPort;
    }

    public long getSessionID() {
        return this.mSessionId;
    }

    public float getSlaveAudioLevel() {
        return 0.5f;
    }

    public int getStreamerType() {
        return 0;
    }

    public long getSurroundMusicDuration() {
        return 0L;
    }

    public long getSurroundMusicPos() {
        return 0L;
    }

    public long getTxbytes() {
        return 0L;
    }

    public long getUserID() {
        return this.mUserID;
    }

    public long getVcodecSendSize() {
        return 0L;
    }

    public int getVideoBitRate() {
        return 500000;
    }

    public long getVideoCacheSize() {
        return 0L;
    }

    public int getVideoFrameRate() {
        return 20;
    }

    public int getVideoFreezeCount() {
        return 0;
    }

    public long getVideoPacketCache() {
        return 0L;
    }

    public long getVideoPts() {
        return 0L;
    }

    public long getVideoRxbytes() {
        return 0L;
    }

    public long getVideoTxbytes() {
        return 0L;
    }

    public boolean getVoicebackwardsEnable() {
        return this.mVoicebackwardsEnable;
    }

    public long getWriteByte() {
        return 0L;
    }

    public void ignoreWriterSEI(boolean z) {
    }

    public void initAudioTracks(int i, int i2) {
        this.mSampleRate = i;
        this.mChannelCount = i2;
        synchronized (this.mAudioTrackLock) {
            try {
                if (this.mAudioTrack == null && this.Headsetpluged && this.mVoicebackwardsEnable) {
                    NonBlockingAudioTrack nonBlockingAudioTrack = new NonBlockingAudioTrack(i, i2);
                    this.mAudioTrack = nonBlockingAudioTrack;
                    nonBlockingAudioTrack.play();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void initConfApi(String str, int i, long j, long j2, boolean z, String str2, String str3) {
        this.serverIP = str;
        this.serverPort = i;
        this.mUserID = j;
        this.mSessionId = j2;
        this.mIsHost = z;
        this.mRtmpPath = str2;
        this.mSecId = str3;
        this.mErrorCode = 0;
        if (str2 == null) {
            this.mRtmpPath = "";
        }
        if (str3 == null) {
            this.mSecId = "aaaa";
        }
        if (str == null) {
            this.serverIP = "";
        }
    }

    public boolean isHost() {
        return this.mIsHost;
    }

    public boolean isPlaying() {
        return true;
    }

    public void mixAndSetSubVideoPos(long j, String str, boolean z) {
    }

    public byte[] monoToStereo(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i * 2];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = i3 * 4;
            byte b = bArr[i2];
            bArr2[i4 + 2] = b;
            bArr2[i4] = b;
            byte b2 = bArr[i2 + 1];
            bArr2[i4 + 3] = b2;
            bArr2[i4 + 1] = b2;
            i2 += 2;
            i3++;
        }
        return bArr2;
    }

    public byte[] monoToStereo_backup(byte[] bArr, int i) {
        int i2 = i / 2;
        short[] sArr = new short[i2];
        short[] sArr2 = new short[i];
        byte[] bArr2 = new byte[i * 2];
        for (int i3 = 0; i3 < i2; i3++) {
            sArr[i3] = 0;
            int i4 = i3 * 2;
            sArr[i3] = (short) (((short) (((short) (bArr[i4 + 1] & 255)) << 8)) | ((short) (bArr[i4] & 255)));
        }
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = i5 * 2;
            sArr2[i6] = sArr[i5];
            sArr2[i6 + 1] = sArr[i5];
        }
        for (int i7 = 0; i7 < i; i7++) {
            int i8 = 0;
            int i9 = sArr2[i7];
            while (i8 < 2) {
                bArr2[(i7 * 2) + i8] = new Integer(i9 & 255).byteValue();
                i8++;
                i9 >>= 8;
            }
        }
        return bArr2;
    }

    public void muteAllRemoteAudioStream(boolean z) {
    }

    public void muteAllRemoteVideoStream(boolean z) {
    }

    public void muteLocalAudioStream(boolean z) {
    }

    public void muteLocalAudioStreamForGame(boolean z) {
    }

    public void muteLocalVideoStream(boolean z) {
    }

    public void muteRemoteAudioStream(long j, boolean z) {
    }

    public void muteRemoteVideoStream(long j, boolean z) {
    }

    public void notifyUpdateResolution() {
    }

    public abstract void pause();

    public void pausePlaying() {
    }

    public void pauseRecording() {
    }

    public void pauseSurroundMusic() {
    }

    public void postDrawImage(int i) {
    }

    public boolean prepare() {
        return true;
    }

    public abstract void release();

    public abstract void resume();

    public void resumePlaying() {
    }

    public void resumeRecording() {
    }

    public void resumeSurroundMusic() {
    }

    public void seekToSurroundMusic(long j) {
    }

    public void sendAecParam(int i) {
    }

    public void setAudioChannelNum(int i) {
    }

    public void setAudioEncoder(int i) {
    }

    public void setAudioEncodingBitRate(int i) {
    }

    public void setAudioHighQualityParameters(boolean z) {
    }

    public void setAudioSamplingRate(int i) {
    }

    public void setAudioSource(int i) {
    }

    public void setAvFlag(int i) {
        this.mAvFlag = i;
    }

    public void setBusinessType(int i) {
        this.mBusinessType = i;
    }

    public void setChannalName(String str) {
        this.mChannalName = str;
    }

    public void setChannelkey(String str) {
    }

    public void setDefaultAudioRoutetoSpeakerphone(boolean z) {
    }

    public void setDelayoffset(int i) {
    }

    public int setEnableSpeakerphone(boolean z) {
        return 0;
    }

    public void setEncryptionMode(String str) {
    }

    public void setEncryptionSecret(String str) {
    }

    public void setErrorCode(int i) {
        this.mErrorCode = i;
    }

    public void setHeadsetStatus(boolean z) {
        this.Headsetpluged = z;
        if (z) {
            return;
        }
        DeinitAudioTracks();
    }

    public void setHost(boolean z) {
        this.mIsHost = z;
    }

    public void setJsonForPostion(String str) {
        this.mJsonForPos = str;
    }

    public void setMasterAudioLevel(float f) {
    }

    public void setMuteStatus(boolean z) {
        this.mMuteStatus = z;
    }

    public void setOnSurroundMusicStatusListener(Object obj) {
    }

    public void setParameters(String str) {
    }

    public void setPcmDataCallback(PcmDateCallback pcmDateCallback) {
    }

    public void setPlayBackAudioLevel(float f) {
    }

    public void setPlaybackDateCallback(PlaybackDateCallback playbackDateCallback) {
    }

    public void setPropertyFloat(int i, float f) {
    }

    public void setPropertyLong(int i, long j) {
    }

    public void setRecordDateCallback(RecordDateCallback recordDateCallback) {
    }

    public void setRole(int i) {
    }

    public void setRoomMode(int i) {
    }

    public void setRoomType(int i) {
        this.mRoomType = i;
    }

    public void setRtmpPath(String str) {
        this.mRtmpPath = str;
        if (str == null) {
            this.mRtmpPath = "";
        }
        this.mErrorCode = 0;
        n8c.m158485c("ConferenceHandle", "setRtmpPath:" + this.mRtmpPath);
    }

    public void setSei(String str) {
    }

    public void setSessionID(long j) {
        this.mSessionId = j;
    }

    public void setSlaveAudioLevel(float f) {
    }

    public void setStreamerInOutAndType(int i, String str, String str2) {
    }

    public void setUserID(int i) {
        this.mUserID = i;
    }

    public void setVideoChannellistener(Object obj) {
    }

    public void setVideoEncoder(int i) {
    }

    public void setVideoEncodingBitRate(int i) {
    }

    public void setVideoFrameRate(int i) {
    }

    public void setVideoSize(int i, int i2) {
    }

    public void setVideoSource(int i) {
    }

    public void setVoicebackwardsEnable(boolean z) {
        this.mVoicebackwardsEnable = z;
        if (z) {
            return;
        }
        DeinitAudioTracks();
    }

    public void startAttachStreamer() {
    }

    public void startPlaying() {
    }

    public void startRecording() {
    }

    public void startSurroundMusic(String str, int i, long j) {
    }

    public void startSurroundMusicEx(String str, boolean z, boolean z2, int i) {
    }

    public byte[] stereotomono(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i / 2];
        for (int i2 = 0; i2 < i / 4; i2 += 4) {
            int i3 = i2 * 2;
            bArr2[i3] = bArr[i2];
            bArr2[i3 + 1] = bArr[i2 + 3];
        }
        return bArr2;
    }

    public void stop() {
    }

    public void stopPlaying() {
    }

    public void stopRecording() {
    }

    public void stopSurroundMusic() {
    }

    public void updateChannelkey(String str) {
    }

    public void uploadLocalVideo(boolean z) {
    }

    public void writeAudio(long j, ByteBuffer byteBuffer, long j2) {
    }

    public void writeAudioExtradata(ByteBuffer byteBuffer, long j) {
    }

    public void writeAudioPacket(long j, ByteBuffer byteBuffer, int i, int i2) {
    }

    public void writeLoopBack(byte[] bArr, int i) {
        if (this.Headsetpluged && this.mVoicebackwardsEnable) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            synchronized (this.mAudioTrackLock) {
                try {
                    NonBlockingAudioTrack nonBlockingAudioTrack = this.mAudioTrack;
                    if (nonBlockingAudioTrack != null) {
                        nonBlockingAudioTrack.write(bArr2, i);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void writeVideo(long j, ByteBuffer byteBuffer, long j2) {
    }

    public void writeVideoExtradata(ByteBuffer byteBuffer, long j) {
    }

    public void writeVideoPacket(long j, ByteBuffer byteBuffer, int i, int i2) {
    }

    public void writeVideoTexture(int i, EGLContext eGLContext, int i2, int i3, long j) {
    }

    public void setRoomMode(int i, boolean z) {
    }
}
