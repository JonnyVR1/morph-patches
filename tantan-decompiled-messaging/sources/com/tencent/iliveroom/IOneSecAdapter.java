package com.tencent.iliveroom;

import android.view.SurfaceView;
import android.view.TextureView;

/* JADX INFO: loaded from: classes2.dex */
public interface IOneSecAdapter {
    void addDelegate(TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter);

    void clearDelegate();

    void clearLocalMixConfig();

    void clearMixTranscodingConfig();

    void connectOtherRoom(String str, long j);

    void destroy();

    void disconnectOtherRoom();

    void enableAudioMessage(boolean z);

    int enableEncSmallVideoStream(boolean z, TXILiveRoomDefine.TXILiveSize tXILiveSize, int i, int i2);

    TXILiveRoomDefine.TXILiveRoomAVStatistic getAVStatistic();

    long getMusicCurrentPosition();

    int getMusicDuration();

    void joinRoom(OneSecAdapterParams oneSecAdapterParams, TXILiveRoomDefine.TXILiveRoomConfig tXILiveRoomConfig);

    void muteAllRemoteAudio(boolean z);

    void muteAllRemoteVideo(boolean z);

    void muteLocalAudio(boolean z);

    void muteLocalVideo(boolean z);

    void muteRemoteAudio(long j, boolean z);

    void muteRemoteVideo(long j, boolean z);

    void pause();

    void pauseMusic();

    void playEffectWithId(int i, String str, boolean z, boolean z2);

    void playMusicWithUrl(String str, boolean z, int i);

    void quitRoom();

    void removeDelegate(TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter);

    void resume();

    boolean resumeMusic();

    int sendCustomVideoTexture(int i, int i2, int i3, int i4, int i5, boolean z, Object obj);

    boolean sendMessageEx(byte[] bArr);

    boolean sendStreamMessage(int i, byte[] bArr, boolean z, boolean z2);

    void setAudioDelegate(TXILiveRoomAudioDelegateAdapter tXILiveRoomAudioDelegateAdapter);

    void setAudioExpandBlockThreshold(int i);

    void setAudioExpandCountPerBlock(int i);

    void setAudioMode(int i);

    void setAudioVolumeIndication(int i);

    void setCustomVideoParam(TXILiveRoomDefine.TXILiveSize tXILiveSize, int i);

    int setEffectsVolume(double d);

    void setLocalMixConfig(TXILiveRoomDefine.TXILiveRoomLocalMixConfig tXILiveRoomLocalMixConfig);

    void setLogPath(String str);

    void setMicVolume(float f);

    void setMixTranscodingConfig(TXILiveRoomDefine.TXILiveRoomTranscodingConfig tXILiveRoomTranscodingConfig);

    int setMusicPitch(int i);

    int setMusicPosition(int i);

    void setMusicVolume(float f);

    void setPlaybackVolume(float f);

    int setPriorRemoteVideoStreamType(int i);

    int setRemoteVideoStreamType(String str, int i);

    void setSurfaceSize(long j, int i, int i2);

    void setVideoRenderDelegate(long j, TXILiveRoomVideoRenderDelegate tXILiveRoomVideoRenderDelegate);

    int setVolumeOfEffect(int i, double d);

    void setVolumeType(int i);

    void startPublishCDNStream(String str);

    void startRemoteRender(long j, SurfaceView surfaceView);

    void startRemoteRender(long j, TextureView textureView);

    void stopAllEffect();

    void stopAllRemoteRender();

    void stopEffectWithId(int i);

    void stopMusic();

    void stopPublishCDNStream();

    void stopRemoteRender(long j);

    void switchRole(int i);
}
