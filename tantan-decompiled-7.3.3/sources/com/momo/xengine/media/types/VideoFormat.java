package com.momo.xengine.media.types;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public class VideoFormat {
    private int audioSampleChannels;
    private int audioSampleRate;
    private String filename;
    private String path;
    private int videoHeight;
    private int videoWidth;
    private long duration = 0;
    private long bitrate = 0;
    private int frameRate = 0;
    private double rotation = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    private PixelFormat video_format = PixelFormat.VIDEO_FORMAT_NONE;
    private boolean full_range = false;
    private VideoRangeType range = VideoRangeType.VIDEO_RANGE_DEFAULT;
    private ColorSpace colorspace = ColorSpace.VIDEO_CS_DEFAULT;
    private VideoTrc color_trc = VideoTrc.VIDEO_TRC_DEFAULT;
    private SampleFormat audio_format = SampleFormat.AUDIO_FORMAT_UNKNOWN;
    private AudioChannelLayout audio_channel = AudioChannelLayout.CHANNELS_UNKNOWN;

    @NotNull
    public SampleFormat getAudioFormat() {
        return this.audio_format;
    }

    public int getAudioSampleChannels() {
        return this.audioSampleChannels;
    }

    public int getAudioSampleRate() {
        return this.audioSampleRate;
    }

    @NotNull
    public AudioChannelLayout getAudio_channel() {
        return this.audio_channel;
    }

    public long getBitrate() {
        return this.bitrate;
    }

    @NotNull
    public VideoTrc getColor_trc() {
        return this.color_trc;
    }

    @NotNull
    public ColorSpace getColorspace() {
        return this.colorspace;
    }

    public long getDuration() {
        return this.duration;
    }

    @Nullable
    public String getFilename() {
        return this.filename;
    }

    public int getFrameRate() {
        return this.frameRate;
    }

    @NotNull
    public String getPath() {
        return this.path;
    }

    @NotNull
    public VideoRangeType getRange() {
        return this.range;
    }

    public double getRotation() {
        return this.rotation;
    }

    @NotNull
    public PixelFormat getVideoFormat() {
        return this.video_format;
    }

    public int getVideoHeight() {
        return this.videoHeight;
    }

    public int getVideoWidth() {
        return this.videoWidth;
    }

    public boolean isFull_range() {
        return this.full_range;
    }

    public void setAudioFormat(int i) {
        this.audio_format = SampleFormat.getAudioFormat(i);
    }

    public void setAudioSampleChannels(int i) {
        this.audioSampleChannels = i;
    }

    public void setAudioSampleRate(int i) {
        this.audioSampleRate = i;
    }

    public void setAudio_channel(int i) {
        this.audio_channel = AudioChannelLayout.valueOf(i);
    }

    public void setBitrate(long j) {
        this.bitrate = j;
    }

    public void setColor_trc(int i) {
        this.color_trc = VideoTrc.getVideoTrc(i);
    }

    public void setColorspace(int i) {
        this.colorspace = ColorSpace.valueOf(i);
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public void setFilename(@Nullable String str) {
        this.filename = str;
    }

    public void setFrameRate(int i) {
        this.frameRate = i;
    }

    public void setFull_range(boolean z) {
        this.full_range = z;
    }

    public void setPath(@Nullable String str) {
        this.path = str;
    }

    public void setRange(int i) {
        this.range = VideoRangeType.getVideoRange(i);
    }

    public void setRotation(double d) {
        this.rotation = d;
    }

    public void setVideoFormat(int i) {
        this.video_format = PixelFormat.valueOf(i);
    }

    public void setVideoHeight(int i) {
        this.videoHeight = i;
    }

    public void setVideoWidth(int i) {
        this.videoWidth = i;
    }
}
