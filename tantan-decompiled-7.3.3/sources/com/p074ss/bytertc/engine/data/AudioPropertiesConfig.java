package com.p074ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes11.dex */
public class AudioPropertiesConfig {
    public AudioPropertiesMode audioReportMode;
    public boolean enableSpectrum;
    public boolean enableVad;
    public boolean enableVoicePitch;
    public int interval;
    public AudioReportMode localMainReportMode;
    public float smooth;

    public AudioPropertiesConfig(int i, boolean z, boolean z2, AudioReportMode audioReportMode) {
        this.enableSpectrum = false;
        this.enableVad = false;
        this.localMainReportMode = AudioReportMode.AUDIO_REPORT_MODE_NORMAL;
        this.audioReportMode = AudioPropertiesMode.AUDIO_PROPERTIES_MODE_MICROPHONE;
        this.smooth = 1.0f;
        this.enableVoicePitch = false;
        this.interval = i;
        this.enableSpectrum = z;
        this.enableVad = z2;
        this.localMainReportMode = audioReportMode;
    }

    public String toString() {
        return "AudioPropertiesConfig{interval='" + this.interval + "'enable_spectrum='" + this.enableSpectrum + "'enable_vad='" + this.enableVad + "'local_main_report_mode='" + this.localMainReportMode + "'audio_report_mode='" + this.audioReportMode.toString() + "'enable_voice_pitch='" + this.enableVoicePitch + "'}";
    }

    public AudioPropertiesConfig(int i, boolean z, boolean z2) {
        this.enableSpectrum = false;
        this.enableVad = false;
        this.localMainReportMode = AudioReportMode.AUDIO_REPORT_MODE_NORMAL;
        AudioPropertiesMode audioPropertiesMode = AudioPropertiesMode.AUDIO_PROPERTIES_MODE_MICROPHONE;
        this.smooth = 1.0f;
        this.enableVoicePitch = false;
        this.interval = i;
        this.enableSpectrum = z;
        this.enableVad = z2;
        this.audioReportMode = audioPropertiesMode;
    }

    public AudioPropertiesConfig(int i, boolean z, boolean z2, AudioReportMode audioReportMode, float f, AudioPropertiesMode audioPropertiesMode) {
        this.enableSpectrum = false;
        this.enableVad = false;
        this.localMainReportMode = AudioReportMode.AUDIO_REPORT_MODE_NORMAL;
        AudioPropertiesMode audioPropertiesMode2 = AudioPropertiesMode.AUDIO_PROPERTIES_MODE_MICROPHONE;
        this.enableVoicePitch = false;
        this.interval = i;
        this.enableSpectrum = z;
        this.enableVad = z2;
        this.localMainReportMode = audioReportMode;
        this.smooth = f;
        this.audioReportMode = audioPropertiesMode;
    }

    public AudioPropertiesConfig(int i) {
        this.enableSpectrum = false;
        this.enableVad = false;
        this.localMainReportMode = AudioReportMode.AUDIO_REPORT_MODE_NORMAL;
        this.audioReportMode = AudioPropertiesMode.AUDIO_PROPERTIES_MODE_MICROPHONE;
        this.smooth = 1.0f;
        this.enableVoicePitch = false;
        this.interval = i;
    }

    public AudioPropertiesConfig(int i, boolean z, boolean z2, AudioReportMode audioReportMode, float f) {
        this.enableSpectrum = false;
        this.enableVad = false;
        this.localMainReportMode = AudioReportMode.AUDIO_REPORT_MODE_NORMAL;
        this.audioReportMode = AudioPropertiesMode.AUDIO_PROPERTIES_MODE_MICROPHONE;
        this.enableVoicePitch = false;
        this.interval = i;
        this.enableSpectrum = z;
        this.enableVad = z2;
        this.localMainReportMode = audioReportMode;
        this.smooth = f;
    }
}
