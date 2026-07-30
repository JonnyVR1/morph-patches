package io.agora.rtc2;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class LocalAudioMixerConfiguration {
    public ArrayList<MixedAudioStream> audioInputStreams = new ArrayList<>();
    public boolean syncWithLocalMic = true;

    public static class MixedAudioStream {
        public Constants.AudioSourceType sourceType = Constants.AudioSourceType.AUDIO_SOURCE_UNKNOWN;
        public int remoteUserUid = 0;
        public String channelId = "";
        public int trackId = 0;
    }
}
