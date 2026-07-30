package io.agora.rtc2.audio;

/* JADX INFO: loaded from: classes2.dex */
public class AdvancedAudioOptions {
    public AudioProcessingChannelsEnum audioProcessingChannels;

    public enum AudioProcessingChannelsEnum {
        AGORA_AUDIO_MONO_PROCESSING(1),
        AGORA_AUDIO_STEREO_PROCESSING(2);

        private int value;

        AudioProcessingChannelsEnum(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public AdvancedAudioOptions() {
        this.audioProcessingChannels = AudioProcessingChannelsEnum.AGORA_AUDIO_MONO_PROCESSING;
    }

    public AdvancedAudioOptions(AudioProcessingChannelsEnum audioProcessingChannelsEnum) {
        this.audioProcessingChannels = audioProcessingChannelsEnum;
    }
}
