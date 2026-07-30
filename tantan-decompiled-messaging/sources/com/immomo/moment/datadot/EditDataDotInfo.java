package com.immomo.moment.datadot;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import p149l.upq;

/* JADX INFO: loaded from: classes7.dex */
public class EditDataDotInfo implements Serializable {

    @SerializedName("video_IFrame_only")
    private boolean iFrameOnly;

    @SerializedName("video_bg_changer")
    private boolean videoBgChanger;

    @SerializedName("video_codec_render_time")
    private int videoCodecRenderTime;

    @SerializedName("video_crf_constant")
    private int videoCrfConstant;

    @SerializedName("video_edit_audio_bitrate")
    private int videoEditAudioBitrate;

    @SerializedName("video_edit_audio_channels")
    private int videoEditAudioChannels;

    @SerializedName("video_edit_audio_encode")
    private String videoEditAudioEncode;

    @SerializedName("video_edit_audio_sampleRate")
    private int videoEditAudioSampleRate;

    @SerializedName("video_edit_cq")
    private boolean videoEditCq;

    @SerializedName("video_edit_video_bitrate")
    private int videoEditVideoBitrate;

    @SerializedName("video_edit_video_encode")
    private String videoEditVideoEncode;

    @SerializedName("video_edit_video_extension")
    private String videoEditVideoExtension;

    @SerializedName("video_edit_video_framerate")
    private int videoEditVideoFrameRate;

    @SerializedName("video_edit_video_gop_size")
    private int videoEditVideoGopSize;

    @SerializedName("video_edit_video_height")
    private int videoEditVideoHeight;

    @SerializedName("video_edit_video_rotation")
    private int videoEditVideoRotation;

    @SerializedName("video_edit_video_width")
    private int videoEditVideoWidth;

    @SerializedName("video_encode_type")
    private int videoEncodeType = 1;

    @SerializedName("video_file_bitrate")
    private int videoFileBitrate;

    @SerializedName("video_file_duration")
    private long videoFileDuration;

    @SerializedName("video_file_fps")
    private int videoFileFps;

    @SerializedName("video_file_height")
    private int videoFileHeight;

    @SerializedName("video_file_size")
    private long videoFileSize;

    @SerializedName("video_file_width")
    private int videoFileWidth;

    @SerializedName("video_is_edited")
    private boolean videoIsEdited;

    @SerializedName("video_origin_audio_bitrate")
    private int videoOriginAudioBitrate;

    @SerializedName("video_origin_audio_channels")
    private int videoOriginAudioChannels;

    @SerializedName("video_origin_audio_samplerate")
    private int videoOriginAudioSamplerate;

    @SerializedName("video_origin_bitrate")
    private int videoOriginBitrate;

    @SerializedName("video_origin_duration")
    private long videoOriginDuration;

    @SerializedName("video_origin_size")
    private long videoOriginSize;

    @SerializedName("video_origin_video_fps")
    private int videoOriginVideoFps;

    @SerializedName("video_original_natural_height")
    private int videoOriginalNaturalHeight;

    @SerializedName("video_original_natural_width")
    private int videoOriginalNaturalWidth;

    @SerializedName("video_process_time")
    private long videoProcessTime;

    @SerializedName("video_rate_control_method")
    private int videoRateControlMethod;

    @SerializedName("video_screen_render_time")
    private int videoScreenRenderTime;

    @SerializedName("video_source_pitch_shift")
    private boolean videoSourcePitchShift;

    @SerializedName("video_speedvary_value")
    private Float[] videoSpeedvaryValue;

    @SerializedName("video_use_background_music")
    private boolean videoUseBgMusic;

    @SerializedName("video_use_speedvary")
    private boolean videoUseSpeedvary;

    public static EditDataDotInfo getEditDataDot(String str) {
        return (EditDataDotInfo) upq.m194907b().m194908a(str, EditDataDotInfo.class);
    }

    public static String toEditDataDot(EditDataDotInfo editDataDotInfo) {
        return upq.m194907b().m194910d(editDataDotInfo);
    }

    public int getVideoCodecRenderTime() {
        return this.videoCodecRenderTime;
    }

    public int getVideoCrfConstant() {
        return this.videoCrfConstant;
    }

    public int getVideoEditAudioBitrate() {
        return this.videoEditAudioBitrate;
    }

    public int getVideoEditAudioChannels() {
        return this.videoEditAudioChannels;
    }

    public String getVideoEditAudioEncode() {
        return this.videoEditAudioEncode;
    }

    public int getVideoEditAudioSampleRate() {
        return this.videoEditAudioSampleRate;
    }

    public int getVideoEditVideoBitrate() {
        return this.videoEditVideoBitrate;
    }

    public String getVideoEditVideoEncode() {
        return this.videoEditVideoEncode;
    }

    public String getVideoEditVideoExtension() {
        return this.videoEditVideoExtension;
    }

    public int getVideoEditVideoFrameRate() {
        return this.videoEditVideoFrameRate;
    }

    public int getVideoEditVideoGopSize() {
        return this.videoEditVideoGopSize;
    }

    public int getVideoEditVideoHeight() {
        return this.videoEditVideoHeight;
    }

    public int getVideoEditVideoRotation() {
        return this.videoEditVideoRotation;
    }

    public int getVideoEditVideoWidth() {
        return this.videoEditVideoWidth;
    }

    public int getVideoEncodeType() {
        return this.videoEncodeType;
    }

    public int getVideoFileBitrate() {
        return this.videoFileBitrate;
    }

    public long getVideoFileDuration() {
        return this.videoFileDuration;
    }

    public int getVideoFileFps() {
        return this.videoFileFps;
    }

    public int getVideoFileHeight() {
        return this.videoFileHeight;
    }

    public long getVideoFileSize() {
        return this.videoFileSize;
    }

    public int getVideoFileWidth() {
        return this.videoFileWidth;
    }

    public int getVideoOriginAudioBitrate() {
        return this.videoOriginAudioBitrate;
    }

    public int getVideoOriginAudioChannels() {
        return this.videoOriginAudioChannels;
    }

    public int getVideoOriginAudioSamplerate() {
        return this.videoOriginAudioSamplerate;
    }

    public int getVideoOriginBitrate() {
        return this.videoOriginBitrate;
    }

    public long getVideoOriginDuration() {
        return this.videoOriginDuration;
    }

    public long getVideoOriginSize() {
        return this.videoOriginSize;
    }

    public int getVideoOriginVideoFps() {
        return this.videoOriginVideoFps;
    }

    public int getVideoOriginalNaturalHeight() {
        return this.videoOriginalNaturalHeight;
    }

    public int getVideoOriginalNaturalWidth() {
        return this.videoOriginalNaturalWidth;
    }

    public long getVideoProcessTime() {
        return this.videoProcessTime;
    }

    public int getVideoRateControlMethod() {
        return this.videoRateControlMethod;
    }

    public int getVideoScreenRenderTime() {
        return this.videoScreenRenderTime;
    }

    public Float[] getVideoSpeedvaryValue() {
        return this.videoSpeedvaryValue;
    }

    public boolean isVideoBgChanger() {
        return this.videoBgChanger;
    }

    public boolean isVideoEditCq() {
        return this.videoEditCq;
    }

    public boolean isVideoIsEdited() {
        return this.videoIsEdited;
    }

    public boolean isVideoSourcePitchShift() {
        return this.videoSourcePitchShift;
    }

    public boolean isVideoUseBgMusic() {
        return this.videoUseBgMusic;
    }

    public boolean isVideoUseSpeedvary() {
        return this.videoUseSpeedvary;
    }

    public boolean isiFrameOnly() {
        return this.iFrameOnly;
    }

    public void setVideoBgChanger(boolean z) {
        this.videoBgChanger = z;
    }

    public void setVideoCodecRenderTime(int i) {
        this.videoCodecRenderTime = i;
    }

    public void setVideoCrfConstant(int i) {
        this.videoCrfConstant = i;
    }

    public void setVideoEditAudioBitrate(int i) {
        this.videoEditAudioBitrate = i;
    }

    public void setVideoEditAudioChannels(int i) {
        this.videoEditAudioChannels = i;
    }

    public void setVideoEditAudioEncode(String str) {
        this.videoEditAudioEncode = str;
    }

    public void setVideoEditAudioSampleRate(int i) {
        this.videoEditAudioSampleRate = i;
    }

    public void setVideoEditCq(boolean z) {
        this.videoEditCq = z;
    }

    public void setVideoEditVideoBitrate(int i) {
        this.videoEditVideoBitrate = i;
    }

    public void setVideoEditVideoEncode(String str) {
        this.videoEditVideoEncode = str;
    }

    public void setVideoEditVideoExtension(String str) {
        this.videoEditVideoExtension = str;
    }

    public void setVideoEditVideoFrameRate(int i) {
        this.videoEditVideoFrameRate = i;
    }

    public void setVideoEditVideoGopSize(int i) {
        this.videoEditVideoGopSize = i;
    }

    public void setVideoEditVideoHeight(int i) {
        this.videoEditVideoHeight = i;
    }

    public void setVideoEditVideoRotation(int i) {
        this.videoEditVideoRotation = i;
    }

    public void setVideoEditVideoWidth(int i) {
        this.videoEditVideoWidth = i;
    }

    public void setVideoEncodeType(int i) {
        this.videoEncodeType = i;
    }

    public void setVideoFileBitrate(int i) {
        this.videoFileBitrate = i;
    }

    public void setVideoFileDuration(long j) {
        this.videoFileDuration = j;
    }

    public void setVideoFileFps(int i) {
        this.videoFileFps = i;
    }

    public void setVideoFileHeight(int i) {
        this.videoFileHeight = i;
    }

    public void setVideoFileSize(long j) {
        this.videoFileSize = j;
    }

    public void setVideoFileWidth(int i) {
        this.videoFileWidth = i;
    }

    public void setVideoIsEdited(boolean z) {
        this.videoIsEdited = z;
    }

    public void setVideoOriginAudioBitrate(int i) {
        this.videoOriginAudioBitrate = i;
    }

    public void setVideoOriginAudioChannels(int i) {
        this.videoOriginAudioChannels = i;
    }

    public void setVideoOriginAudioSamplerate(int i) {
        this.videoOriginAudioSamplerate = i;
    }

    public void setVideoOriginBitrate(int i) {
        this.videoOriginBitrate = i;
    }

    public void setVideoOriginDuration(long j) {
        this.videoOriginDuration = j;
    }

    public void setVideoOriginSize(long j) {
        this.videoOriginSize = j;
    }

    public void setVideoOriginVideoFps(int i) {
        this.videoOriginVideoFps = i;
    }

    public void setVideoOriginalNaturalHeight(int i) {
        this.videoOriginalNaturalHeight = i;
    }

    public void setVideoOriginalNaturalWidth(int i) {
        this.videoOriginalNaturalWidth = i;
    }

    public void setVideoProcessTime(long j) {
        this.videoProcessTime = j;
    }

    public void setVideoRateControlMethod(int i) {
        this.videoRateControlMethod = i;
    }

    public void setVideoScreenRenderTime(int i) {
        this.videoScreenRenderTime = i;
    }

    public void setVideoSourcePitchShift(boolean z) {
        this.videoSourcePitchShift = z;
    }

    public void setVideoSpeedvaryValue(Float[] fArr) {
        this.videoSpeedvaryValue = fArr;
    }

    public void setVideoUseBgMusic(boolean z) {
        this.videoUseBgMusic = z;
    }

    public void setVideoUseSpeedvary(boolean z) {
        this.videoUseSpeedvary = z;
    }

    public void setiFrameOnly(boolean z) {
        this.iFrameOnly = z;
    }
}
