package com.p069ss.bytertc.engine;

import com.p069ss.bytertc.engine.audio.IRangeAudio;
import com.p069ss.bytertc.engine.audio.ISpatialAudio;
import com.p069ss.bytertc.engine.data.ForwardStreamInfo;
import com.p069ss.bytertc.engine.data.SimulcastStreamType;
import com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler;
import com.p069ss.bytertc.engine.type.AudioSelectionPriority;
import com.p069ss.bytertc.engine.type.SubtitleConfig;
import com.p069ss.bytertc.engine.video.IPanoramicVideo;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class RTCRoom extends RTSRoom {
    @Override // com.p069ss.bytertc.engine.RTSRoom
    public abstract void destroy();

    public abstract int enableSubscribeLocalStream(boolean z);

    public abstract String getCallId();

    public abstract IPanoramicVideo getPanoramicVideo();

    public abstract IRangeAudio getRangeAudio();

    public abstract String getRoomId();

    public abstract ISpatialAudio getSpatialAudio();

    public abstract int joinRoom(String str, UserInfo userInfo, boolean z, RTCRoomConfig rTCRoomConfig);

    public abstract int pauseAllSubscribedStreamAudio();

    public abstract int pauseAllSubscribedStreamVideo();

    public abstract int pauseForwardStreamToAllRooms();

    public abstract int publishScreenAudio(boolean z);

    public abstract int publishScreenVideo(boolean z);

    public abstract int publishStreamAudio(boolean z);

    public abstract int publishStreamVideo(boolean z);

    public abstract int resumeAllSubscribedStreamAudio();

    public abstract int resumeAllSubscribedStreamVideo();

    public abstract int resumeForwardStreamToAllRooms();

    public abstract int setAudioSelectionConfig(AudioSelectionPriority audioSelectionPriority);

    public abstract int setMultiDeviceAVSync(String str);

    public abstract int setRTCRoomEventHandler(IRTCRoomEventHandler iRTCRoomEventHandler);

    public abstract int setRemoteRoomAudioPlaybackVolume(int i);

    public abstract int setRemoteSimulcastStreamType(String str, SimulcastStreamType simulcastStreamType);

    public abstract long setRoomExtraInfo(String str, String str2);

    public abstract int setUserVisibility(boolean z);

    public abstract int startForwardStreamToRooms(List<ForwardStreamInfo> list);

    public abstract int startSubtitle(SubtitleConfig subtitleConfig);

    public abstract int stopForwardStreamToRooms();

    public abstract int stopSubtitle();

    public abstract int subscribeAllStreamsAudio(boolean z);

    public abstract int subscribeAllStreamsVideo(boolean z);

    public abstract int subscribeScreenAudio(String str, boolean z);

    public abstract int subscribeScreenVideo(String str, boolean z);

    public abstract int subscribeStreamAudio(String str, boolean z);

    public abstract int subscribeStreamVideo(String str, boolean z);

    public abstract int updateForwardStreamToRooms(List<ForwardStreamInfo> list);
}
