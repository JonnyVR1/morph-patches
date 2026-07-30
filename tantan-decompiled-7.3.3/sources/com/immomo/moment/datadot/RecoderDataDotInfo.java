package com.immomo.moment.datadot;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import p153l.vrq;

/* JADX INFO: loaded from: classes7.dex */
public class RecoderDataDotInfo implements Serializable {

    @SerializedName("camera_audio_bitrate")
    private int cameraAudioBitrate;

    @SerializedName("camera_audio_bits")
    private int cameraAudioBits;

    @SerializedName("camera_audio_channel")
    private int cameraAudioChannel;

    @SerializedName("camera_audio_encode")
    private String cameraAudioEncode;

    @SerializedName("camera_audio_mediaformat_input_size")
    private int cameraAudioMediaformatInputSize;

    @SerializedName("camera_audio_samplerate")
    private int cameraAudioSampleRate;

    @SerializedName("camera_beauty_bigeye")
    public float cameraBeautyBigeye;

    @SerializedName("camera_beauty_bodythin")
    public float cameraBeautyBodythin;

    @SerializedName("camera_beauty_legLenght")
    public float cameraBeautyLegLenght;

    @SerializedName("camera_beauty_skinsmooth")
    public float cameraBeautySkinSmooth;

    @SerializedName("camera_beauty_skinwhiten")
    public float cameraBeautySkinwhiten;

    @SerializedName("camera_beauty_thinface")
    public float cameraBeautyThinFace;

    @SerializedName("camera_beauty_use_doki")
    private boolean cameraBeautyUseDoki;

    @SerializedName("camera_codec_render_time")
    private long cameraCodecRenderTime;

    @SerializedName("camera_detect_body_joint")
    private boolean cameraDetectBody;

    @SerializedName("camera_detect_expression")
    private boolean cameraDetectExpression;

    @SerializedName("camera_detect_face")
    private boolean cameraDetectFace;

    @SerializedName("camera_encoder_time")
    private long cameraEncoderTime;

    @SerializedName("camera_fps")
    private int cameraFps;

    @SerializedName("camera_position_state")
    private int cameraPositionState;

    @SerializedName("camera_preview_video_height")
    private int cameraPreviewVideoHeight;

    @SerializedName("camera_preview_video_width")
    private int cameraPreviewVideoWidth;

    @SerializedName("camera_render_fps")
    private int cameraRenderFps;

    @SerializedName("camera_rotation")
    private int cameraRotation;

    @SerializedName("camera_screen_render_time")
    private long cameraScreenRenderTime;

    @SerializedName("camera_size_height")
    private int cameraSizeHeight;

    @SerializedName("camera_size_width")
    private int cameraSizeWidth;

    @SerializedName("camera_source_fps")
    private int[] cameraSourceFps;

    @SerializedName("camera_take_photo")
    private boolean cameraTakePhoto;

    @SerializedName("camera_type")
    private int cameraType;

    @SerializedName("camera_use_background_music")
    private boolean cameraUseBgMusic;

    @SerializedName("camera_use_flash")
    private boolean cameraUseFlash;

    @SerializedName("camera_use_focus")
    private boolean cameraUseFocus;

    @SerializedName("camera_use_speedvary")
    private boolean cameraUseSpeedvary;

    @SerializedName("camera_use_sticker")
    public boolean cameraUseSticker;

    @SerializedName("camera_video_bitrate")
    private int cameraVideoBitrate;

    @SerializedName("camera_video_cq")
    private boolean cameraVideoCq;

    @SerializedName("camera_video_encode")
    private String cameraVideoEncode;

    @SerializedName("camera_video_encode_fps")
    private int cameraVideoEncodeFps;

    @SerializedName("camera_video_encode_height")
    private int cameraVideoEncodeHeight;

    @SerializedName("camera_video_encode_width")
    private int cameraVideoEncodeWidth;

    @SerializedName("camera_video_extension")
    private String cameraVideoExtension;

    @SerializedName("camera_video_file_bitrate")
    private int cameraVideoFileBitrate;

    @SerializedName("camera_video_file_duration")
    private long cameraVideoFileDuration;

    @SerializedName("camera_video_file_fps")
    private int cameraVideoFileFps;

    @SerializedName("camera_video_file_height")
    private int cameraVideoFileHeight;

    @SerializedName("camera_video_file_size")
    private long cameraVideoFileSize;

    @SerializedName("camera_video_file_width")
    private int cameraVideoFileWidth;

    @SerializedName("camera_video_gop_size")
    private int cameraVideoGopSize;

    @SerializedName("camera_video_rotation")
    private int cameraVideoRotation;

    @SerializedName("camera_video_segments")
    private int cameraVideoSegments;

    public static RecoderDataDotInfo getRecoderDataDot(String str) {
        return (RecoderDataDotInfo) vrq.m202514b().m202515a(str, RecoderDataDotInfo.class);
    }

    public static String toRecoderDataDot(RecoderDataDotInfo recoderDataDotInfo) {
        return vrq.m202514b().m202517d(recoderDataDotInfo);
    }

    public int getCameraAudioBitrate() {
        return this.cameraAudioBitrate;
    }

    public int getCameraAudioBits() {
        return this.cameraAudioBits;
    }

    public int getCameraAudioChannel() {
        return this.cameraAudioChannel;
    }

    public String getCameraAudioEncode() {
        return this.cameraAudioEncode;
    }

    public int getCameraAudioMediaformatInputSize() {
        return this.cameraAudioMediaformatInputSize;
    }

    public int getCameraAudioSampleRate() {
        return this.cameraAudioSampleRate;
    }

    public float getCameraBeautyBigeye() {
        return this.cameraBeautyBigeye;
    }

    public float getCameraBeautyBodythin() {
        return this.cameraBeautyBodythin;
    }

    public float getCameraBeautyLegLenght() {
        return this.cameraBeautyLegLenght;
    }

    public float getCameraBeautySkinSmooth() {
        return this.cameraBeautySkinSmooth;
    }

    public float getCameraBeautySkinwhiten() {
        return this.cameraBeautySkinwhiten;
    }

    public float getCameraBeautyThinFace() {
        return this.cameraBeautyThinFace;
    }

    public long getCameraCodecRenderTime() {
        return this.cameraCodecRenderTime;
    }

    public long getCameraEncoderTime() {
        return this.cameraEncoderTime;
    }

    public int getCameraFps() {
        return this.cameraFps;
    }

    public int getCameraPositionState() {
        return this.cameraPositionState;
    }

    public int getCameraPreviewVideoHeight() {
        return this.cameraPreviewVideoHeight;
    }

    public int getCameraPreviewVideoWidth() {
        return this.cameraPreviewVideoWidth;
    }

    public int getCameraRenderFps() {
        return this.cameraRenderFps;
    }

    public int getCameraRotation() {
        return this.cameraRotation;
    }

    public long getCameraScreenRenderTime() {
        return this.cameraScreenRenderTime;
    }

    public int getCameraSizeHeight() {
        return this.cameraSizeHeight;
    }

    public int getCameraSizeWidth() {
        return this.cameraSizeWidth;
    }

    public int[] getCameraSourceFps() {
        return this.cameraSourceFps;
    }

    public int getCameraType() {
        return this.cameraType;
    }

    public int getCameraVideoBitrate() {
        return this.cameraVideoBitrate;
    }

    public String getCameraVideoEncode() {
        return this.cameraVideoEncode;
    }

    public int getCameraVideoEncodeFps() {
        return this.cameraVideoEncodeFps;
    }

    public int getCameraVideoEncodeHeight() {
        return this.cameraVideoEncodeHeight;
    }

    public int getCameraVideoEncodeWidth() {
        return this.cameraVideoEncodeWidth;
    }

    public String getCameraVideoExtension() {
        return this.cameraVideoExtension;
    }

    public int getCameraVideoFileBitrate() {
        return this.cameraVideoFileBitrate;
    }

    public long getCameraVideoFileDuration() {
        return this.cameraVideoFileDuration;
    }

    public int getCameraVideoFileFps() {
        return this.cameraVideoFileFps;
    }

    public int getCameraVideoFileHeight() {
        return this.cameraVideoFileHeight;
    }

    public long getCameraVideoFileSize() {
        return this.cameraVideoFileSize;
    }

    public int getCameraVideoFileWidth() {
        return this.cameraVideoFileWidth;
    }

    public int getCameraVideoGopSize() {
        return this.cameraVideoGopSize;
    }

    public int getCameraVideoRotation() {
        return this.cameraVideoRotation;
    }

    public int getCameraVideoSegments() {
        return this.cameraVideoSegments;
    }

    public boolean isCameraBeautyUseDoki() {
        return this.cameraBeautyUseDoki;
    }

    public boolean isCameraDetectBody() {
        return this.cameraDetectBody;
    }

    public boolean isCameraDetectExpression() {
        return this.cameraDetectExpression;
    }

    public boolean isCameraDetectFace() {
        return this.cameraDetectFace;
    }

    public boolean isCameraTakePhoto() {
        return this.cameraTakePhoto;
    }

    public boolean isCameraUseBgMusic() {
        return this.cameraUseBgMusic;
    }

    public boolean isCameraUseFlash() {
        return this.cameraUseFlash;
    }

    public boolean isCameraUseFocus() {
        return this.cameraUseFocus;
    }

    public boolean isCameraUseSpeedvary() {
        return this.cameraUseSpeedvary;
    }

    public boolean isCameraUseSticker() {
        return this.cameraUseSticker;
    }

    public boolean isCameraVideoCq() {
        return this.cameraVideoCq;
    }

    public void setCameraAudioBitrate(int i) {
        this.cameraAudioBitrate = i;
    }

    public void setCameraAudioBits(int i) {
        this.cameraAudioBits = i;
    }

    public void setCameraAudioChannel(int i) {
        this.cameraAudioChannel = i;
    }

    public void setCameraAudioEncode(String str) {
        this.cameraAudioEncode = str;
    }

    public void setCameraAudioMediaformatInputSize(int i) {
        this.cameraAudioMediaformatInputSize = i;
    }

    public void setCameraAudioSampleRate(int i) {
        this.cameraAudioSampleRate = i;
    }

    public void setCameraBeautyBigeye(float f) {
        this.cameraBeautyBigeye = f;
    }

    public void setCameraBeautyBodythin(float f) {
        this.cameraBeautyBodythin = f;
    }

    public void setCameraBeautyLegLenght(float f) {
        this.cameraBeautyLegLenght = f;
    }

    public void setCameraBeautySkinSmooth(float f) {
        this.cameraBeautySkinSmooth = f;
    }

    public void setCameraBeautySkinwhiten(float f) {
        this.cameraBeautySkinwhiten = f;
    }

    public void setCameraBeautyThinFace(float f) {
        this.cameraBeautyThinFace = f;
    }

    public void setCameraBeautyUseDoki(boolean z) {
        this.cameraBeautyUseDoki = z;
    }

    public void setCameraCodecRenderTime(long j) {
        this.cameraCodecRenderTime = j;
    }

    public void setCameraDetectBody(boolean z) {
        this.cameraDetectBody = z;
    }

    public void setCameraDetectExpression(boolean z) {
        this.cameraDetectExpression = z;
    }

    public void setCameraDetectFace(boolean z) {
        this.cameraDetectFace = z;
    }

    public void setCameraEncoderTime(long j) {
        this.cameraEncoderTime = j;
    }

    public void setCameraFps(int i) {
        this.cameraFps = i;
    }

    public void setCameraPositionState(int i) {
        this.cameraPositionState = i;
    }

    public void setCameraPreviewVideoHeight(int i) {
        this.cameraPreviewVideoHeight = i;
    }

    public void setCameraPreviewVideoWidth(int i) {
        this.cameraPreviewVideoWidth = i;
    }

    public void setCameraRenderFps(int i) {
        this.cameraRenderFps = i;
    }

    public void setCameraRotation(int i) {
        this.cameraRotation = i;
    }

    public void setCameraScreenRenderTime(long j) {
        this.cameraScreenRenderTime = j;
    }

    public void setCameraSizeHeight(int i) {
        this.cameraSizeHeight = i;
    }

    public void setCameraSizeWidth(int i) {
        this.cameraSizeWidth = i;
    }

    public void setCameraSourceFps(int[] iArr) {
        this.cameraSourceFps = iArr;
    }

    public void setCameraTakePhoto(boolean z) {
        this.cameraTakePhoto = z;
    }

    public void setCameraType(int i) {
        this.cameraType = i;
    }

    public void setCameraUseBgMusic(boolean z) {
        this.cameraUseBgMusic = z;
    }

    public void setCameraUseFlash(boolean z) {
        this.cameraUseFlash = z;
    }

    public void setCameraUseFocus(boolean z) {
        this.cameraUseFocus = z;
    }

    public void setCameraUseSpeedvary(boolean z) {
        this.cameraUseSpeedvary = z;
    }

    public void setCameraUseSticker(boolean z) {
        this.cameraUseSticker = z;
    }

    public void setCameraVideoBitrate(int i) {
        this.cameraVideoBitrate = i;
    }

    public void setCameraVideoCq(boolean z) {
        this.cameraVideoCq = z;
    }

    public void setCameraVideoEncode(String str) {
        this.cameraVideoEncode = str;
    }

    public void setCameraVideoEncodeFps(int i) {
        this.cameraVideoEncodeFps = i;
    }

    public void setCameraVideoEncodeHeight(int i) {
        this.cameraVideoEncodeHeight = i;
    }

    public void setCameraVideoEncodeWidth(int i) {
        this.cameraVideoEncodeWidth = i;
    }

    public void setCameraVideoExtension(String str) {
        this.cameraVideoExtension = str;
    }

    public void setCameraVideoFileBitrate(int i) {
        this.cameraVideoFileBitrate = i;
    }

    public void setCameraVideoFileDuration(long j) {
        this.cameraVideoFileDuration = j;
    }

    public void setCameraVideoFileFps(int i) {
        this.cameraVideoFileFps = i;
    }

    public void setCameraVideoFileHeight(int i) {
        this.cameraVideoFileHeight = i;
    }

    public void setCameraVideoFileSize(long j) {
        this.cameraVideoFileSize = j;
    }

    public void setCameraVideoFileWidth(int i) {
        this.cameraVideoFileWidth = i;
    }

    public void setCameraVideoGopSize(int i) {
        this.cameraVideoGopSize = i;
    }

    public void setCameraVideoRotation(int i) {
        this.cameraVideoRotation = i;
    }

    public void setCameraVideoSegments(int i) {
        this.cameraVideoSegments = i;
    }
}
