package com.p006ss.bytertc.base.media.camera;

import android.content.Context;
import android.graphics.Matrix;
import android.view.WindowManager;
import com.bytedance.realx.video.TextureBufferImpl;
import com.bytedance.realx.video.VideoFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public interface CameraSession {

    public interface CreateSessionCallback {
        void onDone(CameraSession cameraSession);

        void onFailure(FailureType failureType, String str);
    }

    public interface Events {
        void onCameraClosed(CameraSession cameraSession);

        void onCameraConfig(int i, int i2, CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange);

        void onCameraDisconnected(CameraSession cameraSession);

        void onCameraError(CameraSession cameraSession, String str);

        void onCameraOpening();

        void onFrameCaptured(CameraSession cameraSession, VideoFrame videoFrame);
    }

    public enum FailureType {
        ERROR,
        DISCONNECTED
    }

    public enum UIDeviceOrientation {
        Portrait(0),
        LandscapeLeft(90),
        PortraitUpsideDown(180),
        LandscapeRight(270);

        private int value;

        UIDeviceOrientation(int i) {
            this.value = i;
        }

        public int value() {
            return this.value;
        }
    }

    static VideoFrame.TextureBuffer createTextureBufferWithModifiedTransformMatrix(TextureBufferImpl textureBufferImpl, boolean z, int i) {
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        if (z) {
            matrix.preScale(-1.0f, 1.0f);
        }
        matrix.preRotate(i);
        matrix.preTranslate(-0.5f, -0.5f);
        return textureBufferImpl.applyTransformMatrix(matrix, textureBufferImpl.getWidth(), textureBufferImpl.getHeight());
    }

    static int getDeviceUIOrientation(Context context) {
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return UIDeviceOrientation.LandscapeRight.value();
        }
        if (rotation != 2) {
            return rotation != 3 ? UIDeviceOrientation.Portrait.value() : UIDeviceOrientation.LandscapeLeft.value();
        }
        return UIDeviceOrientation.PortraitUpsideDown.value();
    }

    int enableFollowGravity(boolean z);

    float getCameraZoomMaxRatio();

    int getDeviceOrientation();

    boolean isCameraTorchSupported();

    boolean isCameraZoomSupported();

    int setCameraZoomRatio(float f);

    void setOrientationMode(CameraVideoCapturer.ORIENTATION_MODE orientation_mode);

    void stop();

    void turnOffFlashLight();

    void turnOnFlashLight();
}
