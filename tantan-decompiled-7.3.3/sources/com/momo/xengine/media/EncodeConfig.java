package com.momo.xengine.media;

import android.util.Size;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.momo.xengine.media.types.AudioChannelLayout;
import com.momo.xengine.media.types.SampleFormat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public class EncodeConfig {
    private String path;
    private String videoCodec = "H264";
    private Size videoResolution = new Size(720, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
    private int videoFrameRate = 30;
    private long videoBitrate = 7340032;
    private int gopSize = 30;
    private boolean hdr = false;
    private float rotation = 0.0f;
    private float speed = 1.0f;
    private String audioCodec = "AAC";
    private int audioBitrate = 12800;
    private AudioChannelLayout audioChannels = AudioChannelLayout.CHANNELS_STEREO;
    private int audioSamplesRate = 44100;
    private SampleFormat audioFormat = SampleFormat.AUDIO_FORMAT_FLOAT_PLANAR;

    public int getAudioBitrate() {
        return this.audioBitrate;
    }

    public AudioChannelLayout getAudioChannels() {
        return this.audioChannels;
    }

    @NotNull
    public String getAudioCodec() {
        return this.audioCodec;
    }

    @NotNull
    public SampleFormat getAudioFormat() {
        return this.audioFormat;
    }

    public int getAudioSamplesRate() {
        return this.audioSamplesRate;
    }

    public long getBitrate() {
        return this.videoBitrate;
    }

    public int getFrameRate() {
        return this.videoFrameRate;
    }

    public int getGopSize() {
        return this.gopSize;
    }

    @Nullable
    public String getPath() {
        return this.path;
    }

    public float getRotation() {
        return this.rotation;
    }

    @NotNull
    public Size getSize() {
        return this.videoResolution;
    }

    public float getSpeed() {
        return this.speed;
    }

    @NotNull
    public String getVideoCodec() {
        return this.videoCodec;
    }

    public int getVideoFrameRate() {
        return this.videoFrameRate;
    }

    public boolean isHdr() {
        return this.hdr;
    }

    public void setAudioBitrate(int i) {
        this.audioBitrate = i;
    }

    public void setAudioChannels(AudioChannelLayout audioChannelLayout) {
        this.audioChannels = audioChannelLayout;
    }

    public void setAudioCodec(@NotNull String str) {
        this.audioCodec = str;
    }

    public void setAudioFormat(@NotNull SampleFormat sampleFormat) {
        this.audioFormat = sampleFormat;
    }

    public void setAudioSamplesRate(int i) {
        this.audioSamplesRate = i;
    }

    public void setBitrate(long j) {
        this.videoBitrate = j;
    }

    public void setFrameRate(int i) {
        this.videoFrameRate = i;
    }

    public void setGopSize(int i) {
        this.gopSize = i;
    }

    public void setHdr(boolean z) {
        this.hdr = z;
    }

    public void setPath(@NotNull String str) {
        this.path = str;
    }

    public void setRotation(float f) {
        this.rotation = f;
    }

    public void setSize(@NotNull Size size) {
        this.videoResolution = size;
    }

    public void setSpeed(float f) {
        this.speed = f;
    }

    public void setVideoCodec(@NotNull String str) {
        this.videoCodec = str;
    }

    public void setVideoFrameRate(int i) {
        this.videoFrameRate = i;
    }
}
