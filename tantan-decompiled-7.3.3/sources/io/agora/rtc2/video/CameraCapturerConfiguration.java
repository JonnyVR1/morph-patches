package io.agora.rtc2.video;

import com.tencent.liteav.audio.TXEAudioDef;
import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class CameraCapturerConfiguration {
    public CAMERA_DIRECTION cameraDirection;
    public CAMERA_FOCAL_LENGTH_TYPE cameraFocalLengthType;
    public String cameraId;
    public CaptureFormat captureFormat;
    public Boolean followEncodeDimensionRatio;

    public enum CAMERA_DIRECTION {
        CAMERA_REAR(0),
        CAMERA_FRONT(1),
        CAMERA_EXTRAL(2);

        private int value;

        CAMERA_DIRECTION(int i) {
            this.value = i;
        }

        @CalledByNative("CAMERA_DIRECTION")
        public int getValue() {
            return this.value;
        }
    }

    public enum CAMERA_FOCAL_LENGTH_TYPE {
        CAMERA_FOCAL_LENGTH_DEFAULT(0),
        CAMERA_FOCAL_LENGTH_WIDE_ANGLE(1),
        CAMERA_FOCAL_LENGTH_ULTRA_WIDE(2),
        CAMERA_FOCAL_LENGTH_TELEPHOTO(3);

        private int value;

        CAMERA_FOCAL_LENGTH_TYPE(int i) {
            this.value = i;
        }

        @CalledByNative("CAMERA_FOCAL_LENGTH_TYPE")
        public int getValue() {
            return this.value;
        }
    }

    public static class CaptureFormat {
        public int fps;
        public int height;
        public int width;

        public CaptureFormat() {
            this.width = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
            this.height = 540;
            this.fps = 15;
        }

        @CalledByNative("CaptureFormat")
        public int getFps() {
            return this.fps;
        }

        @CalledByNative("CaptureFormat")
        public int getHeight() {
            return this.height;
        }

        @CalledByNative("CaptureFormat")
        public int getWidth() {
            return this.width;
        }

        public String toString() {
            return "CaptureFormat{width=" + this.width + ", height=" + this.height + ", fps=" + this.fps + '}';
        }

        public CaptureFormat(int i, int i2, int i3) {
            this.width = i;
            this.height = i2;
            this.fps = i3;
        }
    }

    public CameraCapturerConfiguration(CAMERA_DIRECTION camera_direction) {
        this.cameraId = null;
        this.cameraFocalLengthType = null;
        this.followEncodeDimensionRatio = null;
        this.cameraDirection = camera_direction;
        this.captureFormat = new CaptureFormat(0, 0, 0);
    }

    @CalledByNative
    public CAMERA_DIRECTION getCameraDirection() {
        return this.cameraDirection;
    }

    @CalledByNative
    public CAMERA_FOCAL_LENGTH_TYPE getCameraFocalLengthType() {
        return this.cameraFocalLengthType;
    }

    @CalledByNative
    public String getCameraId() {
        return this.cameraId;
    }

    @CalledByNative
    public CaptureFormat getCaptureFormat() {
        return this.captureFormat;
    }

    @CalledByNative
    public Boolean isFollowEncodeDimensionRatio() {
        return this.followEncodeDimensionRatio;
    }

    public String toString() {
        return "CameraCapturerConfiguration{cameraDirection=" + this.cameraDirection + ", captureDimensions=" + this.captureFormat + ", cameraId=" + this.cameraId + ", followEncodeDimensionRatio=" + this.followEncodeDimensionRatio + ", cameraFocalLengthType=" + this.cameraFocalLengthType + '}';
    }

    public CameraCapturerConfiguration(CAMERA_DIRECTION camera_direction, CAMERA_FOCAL_LENGTH_TYPE camera_focal_length_type) {
        this.cameraId = null;
        this.followEncodeDimensionRatio = null;
        this.cameraDirection = camera_direction;
        this.cameraFocalLengthType = camera_focal_length_type;
        this.captureFormat = new CaptureFormat(0, 0, 0);
    }

    public CameraCapturerConfiguration(CAMERA_DIRECTION camera_direction, CAMERA_FOCAL_LENGTH_TYPE camera_focal_length_type, CaptureFormat captureFormat) {
        this.cameraId = null;
        this.followEncodeDimensionRatio = null;
        this.cameraDirection = camera_direction;
        this.cameraFocalLengthType = camera_focal_length_type;
        this.captureFormat = captureFormat;
    }

    public CameraCapturerConfiguration(CAMERA_DIRECTION camera_direction, CaptureFormat captureFormat) {
        this.cameraId = null;
        this.cameraFocalLengthType = null;
        this.followEncodeDimensionRatio = null;
        this.cameraDirection = camera_direction;
        this.captureFormat = captureFormat;
    }

    public CameraCapturerConfiguration(CaptureFormat captureFormat) {
        this.cameraDirection = null;
        this.cameraId = null;
        this.cameraFocalLengthType = null;
        this.followEncodeDimensionRatio = null;
        this.captureFormat = captureFormat;
    }
}
