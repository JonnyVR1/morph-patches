package com.p074ss.bytertc.base.media.camera;

import android.media.MediaRecorder;
import com.bytedance.realx.base.RXLogging;
import com.p074ss.bytertc.base.media.SurfaceTextureHelper;
import com.p074ss.bytertc.base.media.VideoCapturer;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes11.dex */
public interface CameraVideoCapturer extends VideoCapturer {

    public interface CameraEventsHandler {
        void onCameraClosed();

        void onCameraConfig(int i, int i2, CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange);

        void onCameraDisconnected();

        void onCameraError(String str);

        void onCameraFreezed(String str);

        void onCameraOpening(String str);

        void onFirstFrameAvailable();
    }

    public static class CameraStatistics {
        private static final int CAMERA_FREEZE_REPORT_TIMOUT_MS = 4000;
        private static final int CAMERA_OBSERVER_PERIOD_MS = 2000;
        private static final String TAG = "CameraStatistics";
        private final Runnable cameraObserver;
        private final CameraEventsHandler eventsHandler;
        private int frameCount;
        private int freezePeriodCount;
        private final SurfaceTextureHelper surfaceTextureHelper;

        public CameraStatistics(SurfaceTextureHelper surfaceTextureHelper, CameraEventsHandler cameraEventsHandler) {
            Runnable runnable = new Runnable() { // from class: com.ss.bytertc.base.media.camera.CameraVideoCapturer.CameraStatistics.1
                @Override // java.lang.Runnable
                public void run() {
                    RXLogging.m5744i(CameraStatistics.TAG, "Camera fps: " + Math.round((CameraStatistics.this.frameCount * 1000.0f) / 2000.0f) + ".");
                    int i = CameraStatistics.this.frameCount;
                    CameraStatistics cameraStatistics = CameraStatistics.this;
                    if (i == 0) {
                        CameraStatistics.access$104(cameraStatistics);
                        if (CameraStatistics.this.freezePeriodCount * 2000 >= 4000 && CameraStatistics.this.eventsHandler != null) {
                            RXLogging.m5742e(CameraStatistics.TAG, "Camera freezed.");
                            boolean zIsTextureInUse = CameraStatistics.this.surfaceTextureHelper.isTextureInUse();
                            CameraStatistics cameraStatistics2 = CameraStatistics.this;
                            if (zIsTextureInUse) {
                                cameraStatistics2.eventsHandler.onCameraFreezed("Camera failure. Client must return video buffers.");
                                return;
                            } else {
                                cameraStatistics2.eventsHandler.onCameraFreezed("Camera failure.");
                                return;
                            }
                        }
                    } else {
                        cameraStatistics.freezePeriodCount = 0;
                    }
                    CameraStatistics.this.frameCount = 0;
                    CameraStatistics.this.surfaceTextureHelper.getHandler().postDelayed(this, 2000L);
                }
            };
            this.cameraObserver = runnable;
            if (surfaceTextureHelper == null) {
                wg3.m206174a("SurfaceTextureHelper is null");
                throw null;
            }
            this.surfaceTextureHelper = surfaceTextureHelper;
            this.eventsHandler = cameraEventsHandler;
            this.frameCount = 0;
            this.freezePeriodCount = 0;
            surfaceTextureHelper.getHandler().postDelayed(runnable, 2000L);
        }

        public static /* synthetic */ int access$104(CameraStatistics cameraStatistics) {
            int i = cameraStatistics.freezePeriodCount + 1;
            cameraStatistics.freezePeriodCount = i;
            return i;
        }

        private void checkThread() {
            if (Thread.currentThread() == this.surfaceTextureHelper.getHandler().getLooper().getThread()) {
                return;
            }
            wtq0.m207906a("Wrong thread");
        }

        public void addFrame() {
            checkThread();
            this.frameCount++;
        }

        public void release() {
            this.surfaceTextureHelper.getHandler().removeCallbacks(this.cameraObserver);
        }
    }

    public interface CameraSwitchHandler {
        void onCameraSwitchDone(boolean z);

        void onCameraSwitchError(String str);
    }

    @Deprecated
    public interface MediaRecorderHandler {
        void onMediaRecorderError(String str);

        void onMediaRecorderSuccess();
    }

    public enum ORIENTATION_MODE {
        ORIENTATION_MODE_ADAPTIVE(0),
        ORIENTATION_MODE_FIXED_LANDSCAPE(1),
        ORIENTATION_MODE_FIXED_PORTRAIT(2);

        private int value;

        ORIENTATION_MODE(int i) {
            this.value = i;
        }

        public static ORIENTATION_MODE convertFromInt(int i) {
            return values()[i];
        }

        public int getValue() {
            return this.value;
        }
    }

    @Deprecated
    default void addMediaRecorderToCamera(MediaRecorder mediaRecorder, MediaRecorderHandler mediaRecorderHandler) {
        throw new UnsupportedOperationException("Deprecated and not implemented.");
    }

    @Deprecated
    default void removeMediaRecorderFromCamera(MediaRecorderHandler mediaRecorderHandler) {
        throw new UnsupportedOperationException("Deprecated and not implemented.");
    }

    void setOrientationMode(ORIENTATION_MODE orientation_mode);

    void switchCamera(CameraSwitchHandler cameraSwitchHandler);
}
