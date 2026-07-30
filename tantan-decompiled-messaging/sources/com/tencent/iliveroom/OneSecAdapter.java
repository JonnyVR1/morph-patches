package com.tencent.iliveroom;

import android.content.Context;
import android.media.MediaCodecList;
import android.util.Log;
import android.view.SurfaceView;
import android.view.TextureView;
import com.tencent.iliveroom.p080a.C13945a;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.C14052f;
import com.tencent.liteav.basic.util.TXCCommonUtil;

/* JADX INFO: loaded from: classes2.dex */
public class OneSecAdapter implements IOneSecAdapter {
    private static final String TAG = "OneSecAdapter";
    private static boolean sIsLoadedSDKSuccess;
    private static OneSecAdapter sOneSecAdapterInstance;
    private IOneSecAdapter mSDKInstance;

    static {
        try {
            new Thread(new Runnable() { // from class: com.tencent.iliveroom.OneSecAdapter.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        MediaCodecList.getCodecCount();
                    } catch (Error e) {
                        e.printStackTrace();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }).start();
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private OneSecAdapter(Context context, TXILiveRoomDefine.TXILiveConfig tXILiveConfig, TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter) {
        boolean zM83056f = C14052f.m83056f();
        sIsLoadedSDKSuccess = zM83056f;
        if (!zM83056f) {
            Log.e(TAG, "initEngine: load liteavsdk.so failed! init engine error!");
            if (tXILiveRoomDelegateAdapter != null) {
                tXILiveRoomDelegateAdapter.onError(tXILiveConfig.userId, TXILiveRoomDefine.TXILiveRoomErrorLoadLiteAVSDKSOFail, "load LiteAVSDK.so failed");
                return;
            }
            return;
        }
        TXCLog.m82969i(TAG, "create: new OneSecAdapter");
        TXCLog.m82969i(TAG, "new adapter = " + this + " version = " + getSDKVersionStr() + " delegate = " + tXILiveRoomDelegateAdapter);
        this.mSDKInstance = new C13945a(context, null, tXILiveRoomDelegateAdapter);
    }

    public static OneSecAdapter create(Context context, TXILiveRoomDefine.TXILiveConfig tXILiveConfig, TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter) {
        synchronized (OneSecAdapter.class) {
            try {
                if (sOneSecAdapterInstance == null) {
                    sOneSecAdapterInstance = new OneSecAdapter(context.getApplicationContext(), tXILiveConfig, tXILiveRoomDelegateAdapter);
                } else {
                    TXCLog.m82969i(TAG, "create: use old OneSecAdapter.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sOneSecAdapterInstance;
    }

    public static String getSDKVersionStr() {
        boolean zM83056f = C14052f.m83056f();
        sIsLoadedSDKSuccess = zM83056f;
        return zM83056f ? TXCCommonUtil.getSDKVersionStr() : "0.0.0";
    }

    public static void setConsoleEnabled(boolean z) {
        boolean zM83056f = C14052f.m83056f();
        sIsLoadedSDKSuccess = zM83056f;
        if (zM83056f) {
            TXCLog.setConsoleEnabled(z);
        }
    }

    public static void setLibraryPath(String str) {
        C14052f.m83047b(str);
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void addDelegate(TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter) {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " addDelegate: ");
            this.mSDKInstance.addDelegate(tXILiveRoomDelegateAdapter);
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void clearDelegate() {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " clearDelegate: ");
            this.mSDKInstance.clearDelegate();
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void clearLocalMixConfig() {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " clearLocalMixConfig: ");
            this.mSDKInstance.clearLocalMixConfig();
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void clearMixTranscodingConfig() {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " clearMixTranscodingConfig: ");
            this.mSDKInstance.clearMixTranscodingConfig();
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void connectOtherRoom(String str, long j) {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " connectOtherRoom roomName = " + str + " userId = " + j);
            this.mSDKInstance.connectOtherRoom(str, j);
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void destroy() {
        synchronized (OneSecAdapter.class) {
            sOneSecAdapterInstance = null;
        }
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " destroy: ");
            this.mSDKInstance.destroy();
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void disconnectOtherRoom() {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " disconnectOtherRoom");
            this.mSDKInstance.disconnectOtherRoom();
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void enableAudioMessage(boolean z) {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " enableAudioMessage: " + z);
            this.mSDKInstance.enableAudioMessage(z);
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public int enableEncSmallVideoStream(boolean z, TXILiveRoomDefine.TXILiveSize tXILiveSize, int i, int i2) {
        if (this.mSDKInstance == null) {
            return 0;
        }
        TXCLog.m82969i(TAG, this + " enableEncSmallVideoStream: enable = " + z + " size = " + tXILiveSize + " fps = " + i + " videoBitrate = " + i2);
        this.mSDKInstance.enableEncSmallVideoStream(z, tXILiveSize, i, i2);
        return 0;
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public TXILiveRoomDefine.TXILiveRoomAVStatistic getAVStatistic() {
        IOneSecAdapter iOneSecAdapter = this.mSDKInstance;
        return iOneSecAdapter != null ? iOneSecAdapter.getAVStatistic() : new TXILiveRoomDefine.TXILiveRoomAVStatistic();
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public long getMusicCurrentPosition() {
        IOneSecAdapter iOneSecAdapter = this.mSDKInstance;
        if (iOneSecAdapter != null) {
            return iOneSecAdapter.getMusicCurrentPosition();
        }
        return 0L;
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public int getMusicDuration() {
        IOneSecAdapter iOneSecAdapter = this.mSDKInstance;
        if (iOneSecAdapter != null) {
            return iOneSecAdapter.getMusicDuration();
        }
        return 0;
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void joinRoom(OneSecAdapterParams oneSecAdapterParams, TXILiveRoomDefine.TXILiveRoomConfig tXILiveRoomConfig) {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " joinRoom, params = " + oneSecAdapterParams + ", config = " + tXILiveRoomConfig);
            this.mSDKInstance.joinRoom(oneSecAdapterParams, tXILiveRoomConfig);
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void muteAllRemoteAudio(boolean z) {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " muteAllRemoteAudio: mute = " + z);
            this.mSDKInstance.muteAllRemoteAudio(z);
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void muteAllRemoteVideo(boolean z) {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " muteAllRemoteVideo: mute = " + z);
            this.mSDKInstance.muteAllRemoteVideo(z);
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void muteLocalAudio(boolean z) {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " muteLocalAudio: enable = " + z);
            this.mSDKInstance.muteLocalAudio(z);
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void muteLocalVideo(boolean z) {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " muteLocalVideo: enable = " + z);
            this.mSDKInstance.muteLocalVideo(z);
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void muteRemoteAudio(long j, boolean z) {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " muteRemoteAudio: userId = " + j + " mute = " + z);
            this.mSDKInstance.muteRemoteAudio(j, z);
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void muteRemoteVideo(long j, boolean z) {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " muteRemoteVideo: userId = " + j + " mute = " + z);
            this.mSDKInstance.muteRemoteVideo(j, z);
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void pause() {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " pause: ");
            this.mSDKInstance.pause();
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void pauseMusic() {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " pauseMusic: ");
            this.mSDKInstance.pauseMusic();
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void playEffectWithId(int i, String str, boolean z, boolean z2) {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " playEffectWithId: effect id = " + i + " path = " + str + " loop = " + z2 + " loopback = " + z);
            this.mSDKInstance.playEffectWithId(i, str, z, z2);
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void playMusicWithUrl(String str, boolean z, int i) {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " playMusicWithUrl: url = " + str + " loopback = " + z + " repeat = " + i);
            this.mSDKInstance.playMusicWithUrl(str, z, i);
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void quitRoom() {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " quitRoom: ");
            this.mSDKInstance.quitRoom();
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void removeDelegate(TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter) {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " removeDelegate: ");
            this.mSDKInstance.removeDelegate(tXILiveRoomDelegateAdapter);
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void resume() {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " resume: ");
            this.mSDKInstance.resume();
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public boolean resumeMusic() {
        if (this.mSDKInstance == null) {
            return false;
        }
        TXCLog.m82969i(TAG, this + " resumeMusic: ");
        return this.mSDKInstance.resumeMusic();
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public int sendCustomVideoTexture(int i, int i2, int i3, int i4, int i5, boolean z, Object obj) {
        IOneSecAdapter iOneSecAdapter = this.mSDKInstance;
        if (iOneSecAdapter != null) {
            return iOneSecAdapter.sendCustomVideoTexture(i, i2, i3, i4, i5, z, obj);
        }
        return -1;
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public boolean sendMessageEx(byte[] bArr) {
        IOneSecAdapter iOneSecAdapter = this.mSDKInstance;
        if (iOneSecAdapter != null) {
            return iOneSecAdapter.sendMessageEx(bArr);
        }
        return false;
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public boolean sendStreamMessage(int i, byte[] bArr, boolean z, boolean z2) {
        IOneSecAdapter iOneSecAdapter = this.mSDKInstance;
        if (iOneSecAdapter != null) {
            return iOneSecAdapter.sendStreamMessage(i, bArr, z, z2);
        }
        return false;
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void setAudioDelegate(TXILiveRoomAudioDelegateAdapter tXILiveRoomAudioDelegateAdapter) {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " setAudioDelegate: ");
            this.mSDKInstance.setAudioDelegate(tXILiveRoomAudioDelegateAdapter);
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void setAudioExpandBlockThreshold(int i) {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " setAudioExpandBlockThreshold: " + i);
            this.mSDKInstance.setAudioExpandBlockThreshold(i);
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void setAudioExpandCountPerBlock(int i) {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " setAudioExpandCountPerBlock: " + i);
            this.mSDKInstance.setAudioExpandCountPerBlock(i);
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void setAudioMode(int i) {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " setAudioRoute: mode = " + i);
            this.mSDKInstance.setAudioMode(i);
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void setAudioVolumeIndication(int i) {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " setAudioVolumeIndication: interval = " + i);
            this.mSDKInstance.setAudioVolumeIndication(i);
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void setCustomVideoParam(TXILiveRoomDefine.TXILiveSize tXILiveSize, int i) {
        if (this.mSDKInstance != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this);
            sb.append(" setVideoEncParams: size = ");
            sb.append(tXILiveSize == null ? "null" : tXILiveSize.toString());
            sb.append(" bitrate = ");
            sb.append(i);
            TXCLog.m82969i(TAG, sb.toString());
            this.mSDKInstance.setCustomVideoParam(tXILiveSize, i);
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public int setEffectsVolume(double d) {
        if (this.mSDKInstance == null) {
            return 0;
        }
        TXCLog.m82969i(TAG, this + " setEffectsVolume: volume = " + d);
        return this.mSDKInstance.setEffectsVolume(d);
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void setLocalMixConfig(TXILiveRoomDefine.TXILiveRoomLocalMixConfig tXILiveRoomLocalMixConfig) {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " setLocalMixConfig: config = " + tXILiveRoomLocalMixConfig);
            this.mSDKInstance.setLocalMixConfig(tXILiveRoomLocalMixConfig);
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void setLogPath(String str) {
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void setMicVolume(float f) {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " setMicVolume: volume = " + f);
            this.mSDKInstance.setMicVolume(f);
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void setMixTranscodingConfig(TXILiveRoomDefine.TXILiveRoomTranscodingConfig tXILiveRoomTranscodingConfig) {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " setMixTranscodingConfig: config = " + tXILiveRoomTranscodingConfig);
            this.mSDKInstance.setMixTranscodingConfig(tXILiveRoomTranscodingConfig);
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public int setMusicPitch(int i) {
        if (this.mSDKInstance == null) {
            return -2;
        }
        TXCLog.m82969i(TAG, this + " setMusicPitch: " + i);
        if (i > 12 || i < -12) {
            return -1;
        }
        return this.mSDKInstance.setMusicPitch(i);
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public int setMusicPosition(int i) {
        if (this.mSDKInstance == null) {
            return -1;
        }
        TXCLog.m82969i(TAG, this + " setMusicPosition: " + i);
        return this.mSDKInstance.setMusicPosition(i);
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void setMusicVolume(float f) {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " setMusicVolume: volume = " + f);
            this.mSDKInstance.setMusicVolume(f);
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void setPlaybackVolume(float f) {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " setPlaybackVolume: " + f);
            if (f >= 0.0f && f <= 4.0f) {
                this.mSDKInstance.setPlaybackVolume(f);
                return;
            }
            TXCLog.m82966e(TAG, this + "setPlaybackVolume: invalid volume = " + f);
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public int setPriorRemoteVideoStreamType(int i) {
        if (this.mSDKInstance == null) {
            return 0;
        }
        TXCLog.m82969i(TAG, this + " setPriorRemoteVideoStreamType: streamType = " + i);
        this.mSDKInstance.setPriorRemoteVideoStreamType(i);
        return 0;
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public int setRemoteVideoStreamType(String str, int i) {
        if (this.mSDKInstance == null) {
            return 0;
        }
        TXCLog.m82969i(TAG, this + " setRemoteVideoStreamType: userId = " + str + " streamType = " + i);
        this.mSDKInstance.setRemoteVideoStreamType(str, i);
        return 0;
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void setSurfaceSize(long j, int i, int i2) {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " setSurfaceSize: userId = " + j + " w = " + i + " h = " + i2);
            this.mSDKInstance.setSurfaceSize(j, i, i2);
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void setVideoRenderDelegate(long j, TXILiveRoomVideoRenderDelegate tXILiveRoomVideoRenderDelegate) {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " setVideoRenderDelegate: userId = " + j + " delegate = " + tXILiveRoomVideoRenderDelegate);
            this.mSDKInstance.setVideoRenderDelegate(j, tXILiveRoomVideoRenderDelegate);
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public int setVolumeOfEffect(int i, double d) {
        if (this.mSDKInstance == null) {
            return 0;
        }
        TXCLog.m82969i(TAG, this + " setVolumeOfEffect: effectId = " + i + " volume = " + d);
        return this.mSDKInstance.setVolumeOfEffect(i, d);
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void setVolumeType(int i) {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " setVolumeType: " + i);
            this.mSDKInstance.setVolumeType(i);
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void startPublishCDNStream(String str) {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " startPublishCDNStream:");
            this.mSDKInstance.startPublishCDNStream(str);
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void startRemoteRender(long j, SurfaceView surfaceView) {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " startRemoteRender: userId " + j + " surface view = " + surfaceView);
            this.mSDKInstance.startRemoteRender(j, surfaceView);
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void stopAllEffect() {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " stopAllEffect: ");
            this.mSDKInstance.stopAllEffect();
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void stopAllRemoteRender() {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " stopAllRemoteRender: ");
            this.mSDKInstance.stopAllRemoteRender();
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void stopEffectWithId(int i) {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " stopEffectWithId: effectId = " + i);
            this.mSDKInstance.stopEffectWithId(i);
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void stopMusic() {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " stopMusic: ");
            this.mSDKInstance.stopMusic();
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void stopPublishCDNStream() {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " stopPublishCDNStream: ");
            this.mSDKInstance.stopPublishCDNStream();
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void stopRemoteRender(long j) {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " stopRemoteRender: userId = " + j);
            this.mSDKInstance.stopRemoteRender(j);
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void switchRole(int i) {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " switchRole: role " + i);
            this.mSDKInstance.switchRole(i);
        }
    }

    public String toString() {
        return Integer.toHexString(hashCode());
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void startRemoteRender(long j, TextureView textureView) {
        if (this.mSDKInstance != null) {
            TXCLog.m82969i(TAG, this + " startRemoteRender: userId " + j + " textureView = " + textureView);
            this.mSDKInstance.startRemoteRender(j, textureView);
        }
    }
}
