package com.p074ss.bytertc.engine;

import com.p074ss.bytertc.engine.audio.IRangeAudio;
import com.p074ss.bytertc.engine.handler.IRTCRoomEventHandler;

/* JADX INFO: loaded from: classes11.dex */
public abstract class IGameRoom {
    public abstract void destroy();

    public abstract int enableAudioReceive(String str, boolean z);

    public abstract int enableAudioSend(boolean z);

    public abstract int enableMicrophone(boolean z);

    public abstract int enableSpeakerphone(boolean z);

    public abstract IRangeAudio getRangeAudio();

    public abstract int joinRoom(String str, UserInfo userInfo);

    public abstract int leaveRoom();

    public abstract int setRTCRoomEventHandler(IRTCRoomEventHandler iRTCRoomEventHandler);

    public abstract int setRemoteRoomAudioPlaybackVolume(int i);

    public abstract int updateToken(String str);
}
