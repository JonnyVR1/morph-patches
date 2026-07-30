package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class SpatialAudioParams {
    public Boolean enable_air_absorb;
    public Boolean enable_blur;
    public Boolean enable_doppler;
    public Double speaker_attenuation;
    public Double speaker_azimuth;
    public Double speaker_distance;
    public Double speaker_elevation;
    public Integer speaker_orientation;

    @CalledByNative
    public Boolean getAirAbsorbFlag() {
        return this.enable_air_absorb;
    }

    @CalledByNative
    public Boolean getBlurFlag() {
        return this.enable_blur;
    }

    @CalledByNative
    public Boolean getDopplerFlag() {
        return this.enable_doppler;
    }

    @CalledByNative
    public Double getSpeakerAttenuation() {
        return this.speaker_attenuation;
    }

    @CalledByNative
    public Double getSpeakerAzimuth() {
        return this.speaker_azimuth;
    }

    @CalledByNative
    public Double getSpeakerDistance() {
        return this.speaker_distance;
    }

    @CalledByNative
    public Double getSpeakerElevation() {
        return this.speaker_elevation;
    }

    @CalledByNative
    public Integer getSpeakerOrientation() {
        return this.speaker_orientation;
    }
}
