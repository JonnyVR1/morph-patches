package p009l;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import com.p008ss.android.ttvecamera.C0725b;
import com.p008ss.android.ttvecamera.C0735f;
import com.p008ss.android.ttvecamera.C0743g;
import com.p008ss.android.ttvecamera.TECameraSettings;
import com.p008ss.android.ttvecamera.TEFocusSettings;
import com.p008ss.android.ttvecamera.TEFrameSizei;
import com.p008ss.android.ttvecamera.framework.TECameraModeBase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import l.ig3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@TargetApi(21)
public class njh0 extends TECameraModeBase {

    /* JADX INFO: renamed from: X */
    private long f17503X;

    /* JADX INFO: renamed from: Y */
    private final HandlerC1056i f17504Y;

    /* JADX INFO: renamed from: Z */
    private final Handler f17505Z;

    /* JADX INFO: renamed from: a0 */
    protected ImageReader f17506a0;

    /* JADX INFO: renamed from: b0 */
    protected ImageReader f17507b0;

    /* JADX INFO: renamed from: c0 */
    private int f17508c0;

    /* JADX INFO: renamed from: d0 */
    private TotalCaptureResult[] f17509d0;

    /* JADX INFO: renamed from: e0 */
    private TotalCaptureResult f17510e0;

    /* JADX INFO: renamed from: f0 */
    private volatile boolean f17511f0;

    /* JADX INFO: renamed from: g0 */
    private List<CaptureRequest.Key<?>> f17512g0;

    /* JADX INFO: renamed from: h0 */
    private int f17513h0;

    /* JADX INFO: renamed from: i0 */
    private int f17514i0;

    /* JADX INFO: renamed from: j0 */
    private boolean f17515j0;

    /* JADX INFO: renamed from: k0 */
    private boolean f17516k0;

    /* JADX INFO: renamed from: l0 */
    private boolean f17517l0;

    /* JADX INFO: renamed from: m0 */
    private boolean f17518m0;

    /* JADX INFO: renamed from: n0 */
    private int f17519n0;

    /* JADX INFO: renamed from: o0 */
    private int f17520o0;

    /* JADX INFO: renamed from: p0 */
    private long f17521p0;

    /* JADX INFO: renamed from: q0 */
    private ConditionVariable f17522q0;

    /* JADX INFO: renamed from: r0 */
    private int f17523r0;

    /* JADX INFO: renamed from: s0 */
    private int f17524s0;

    /* JADX INFO: renamed from: t0 */
    private int f17525t0;

    /* JADX INFO: renamed from: u0 */
    private long f17526u0;

    /* JADX INFO: renamed from: l.njh0$a */
    public class C1048a extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a */
        private Integer f17527a = -1;

        /* JADX INFO: renamed from: b */
        private Integer f17528b = -1;

        /* JADX INFO: renamed from: c */
        private Integer f17529c = -1;

        /* JADX INFO: renamed from: d */
        private Integer f17530d = -1;

        public C1048a() {
        }

        /* JADX INFO: renamed from: a */
        private void m18988a(CaptureResult captureResult) {
            int i = njh0.this.f17513h0;
            boolean z = true;
            if (i == 0) {
                Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                int iIntValue = num != null ? num.intValue() : -1;
                njh0.this.f17518m0 = iIntValue == -1 || iIntValue == 2 || iIntValue == 4;
                CaptureRequest.Builder builder = ((TECameraModeBase) njh0.this).f9138c;
                if (builder != null) {
                    CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
                    Integer num2 = (Integer) builder.get(key);
                    if (num2 == null || num2.intValue() != 1) {
                        return;
                    }
                    if (4 == iIntValue || 5 == iIntValue || -1 == iIntValue) {
                        builder.set(key, 2);
                        if (njh0.this.f17504Y != null) {
                            njh0.this.f17504Y.sendEmptyMessage(1004);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (i != 1) {
                return;
            }
            Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER);
            Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
            if (num3 != null && num3.intValue() == 1) {
                njh0.this.f17516k0 = true;
                C0743g.m11169e("TEImage2Mode", "ae trigger start...");
            }
            if (njh0.this.f17516k0) {
                if (num4 == null || num4.intValue() == 2 || num4.intValue() == 4) {
                    njh0.this.f17516k0 = false;
                    C0743g.m11169e("TEImage2Mode", "ae converge, is shot can do");
                } else {
                    z = false;
                }
                if (!this.f17530d.equals(num4)) {
                    C0743g.m11169e("TEImage2Mode", "ae state:" + num4);
                }
                this.f17530d = num4;
            } else {
                z = false;
            }
            if (z) {
                long jCurrentTimeMillis = System.currentTimeMillis() - njh0.this.f17503X;
                njh0.this.f17513h0 = 0;
                njh0.this.f17516k0 = false;
                if (njh0.this.f17504Y != null) {
                    njh0.this.f17504Y.removeMessages(1007);
                    njh0.this.f17504Y.sendEmptyMessage(1006);
                    njh0.this.f17504Y.sendEmptyMessage(1005);
                }
                C0743g.m11169e("TEImage2Mode", "send-capture-command consume = " + jCurrentTimeMillis);
            }
        }

        /* JADX INFO: renamed from: b */
        private void m18989b(CaptureResult captureResult) {
            Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_MODE);
            Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
            Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_MODE);
            Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
            Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : -1);
            int iIntValue = num2 != null ? num2.intValue() : -1;
            Integer numValueOf2 = Integer.valueOf(iIntValue);
            Integer numValueOf3 = Integer.valueOf(num3 != null ? num3.intValue() : -1);
            int iIntValue2 = num4 != null ? num4.intValue() : -1;
            Integer numValueOf4 = Integer.valueOf(iIntValue2);
            if (!this.f17527a.equals(numValueOf) || !this.f17528b.equals(numValueOf2) || !this.f17529c.equals(numValueOf3) || !this.f17530d.equals(numValueOf4)) {
                C0743g.m11165a("TEImage2Mode", "[afMode=" + numValueOf + ", afState=" + numValueOf2 + ",aeMode=" + numValueOf3 + ", aeState=" + numValueOf4 + "]");
            }
            this.f17527a = numValueOf;
            this.f17528b = numValueOf2;
            this.f17529c = numValueOf3;
            this.f17530d = numValueOf4;
            if ("CAPTURE_REQUEST_TAG_FOR_SHOT".equals(captureResult.getRequest().getTag())) {
                njh0.this.f17517l0 = true;
                C0743g.m11169e("TEImage2Mode", "is shot can do");
            }
            if (!njh0.this.f17517l0) {
                C0743g.m11165a("TEImage2Mode", "discard previous callback");
                return;
            }
            if (iIntValue == -1 || iIntValue == 4 || iIntValue == 5 || iIntValue == 2) {
                if (iIntValue2 == -1 || iIntValue2 == 4 || iIntValue2 == 2) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - njh0.this.f17503X;
                    njh0.this.f17504Y.removeMessages(1001);
                    njh0.this.f17504Y.sendEmptyMessage(1000);
                    njh0.this.f17517l0 = false;
                    C0743g.m11169e("TEImage2Mode", "send-capture-command consume = " + jCurrentTimeMillis);
                    ajh0.m11494b("te_record_send_capture_command_cost", jCurrentTimeMillis);
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull Surface surface, long j) {
            if (njh0.this.f17513h0 == 2 && "CAPTURE_REQUEST_TAG_FOR_SHOT".equals(captureRequest.getTag())) {
                njh0.this.f17517l0 = true;
                C0743g.m11166b("TEImage2Mode", "onCaptureBufferLost: ");
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - njh0.this.f17526u0;
            njh0 njh0Var = njh0.this;
            if (j > 1000) {
                C0743g.m11165a("TEImage2Mode", "on frame arrived fps: " + njh0Var.f17525t0);
                njh0.this.f17525t0 = 0;
                njh0.this.f17526u0 = jCurrentTimeMillis;
            } else {
                njh0.m18925I1(njh0Var);
            }
            m18988a(totalCaptureResult);
            if (!((TECameraModeBase) njh0.this).f9119G) {
                njh0.this.m11104Q();
                ((TECameraModeBase) njh0.this).f9119G = true;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - ((TECameraModeBase) njh0.this).f9122J;
                C0743g.m11169e("TEImage2Mode", "first preview frame callback arrived! consume = " + jCurrentTimeMillis2 + ", session consume: " + ((TECameraModeBase) njh0.this).f9121I);
                ajh0.m11494b("te_record_camera2_set_repeating_request_cost", jCurrentTimeMillis2);
                C0743g.m11170f("te_record_camera2_set_repeating_request_cost", Long.valueOf(jCurrentTimeMillis2));
            }
            if (njh0.this.f17513h0 == 2) {
                m18989b(totalCaptureResult);
            }
            njh0.m18928K0(njh0.this);
            if (njh0.this.f17520o0 != 0 && njh0.this.f17519n0 > njh0.this.f17520o0) {
                njh0.this.f17519n0 = 0;
                Runtime.getRuntime().gc();
            }
            njh0.m18935O0(njh0.this);
            if (njh0.this.f17508c0 % 5 == 0) {
                njh0.this.f17508c0 = 0;
            }
            if (njh0.this.f17509d0 != null) {
                njh0.this.f17509d0[njh0.this.f17508c0] = totalCaptureResult;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            if (njh0.this.f17513h0 == 2 && "CAPTURE_REQUEST_TAG_FOR_SHOT".equals(captureRequest.getTag())) {
                njh0.this.f17517l0 = true;
                C0743g.m11166b("TEImage2Mode", "onCaptureFailed: ");
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
            m18988a(captureResult);
        }
    }

    /* JADX INFO: renamed from: l.njh0$b */
    public class C1049b extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f17532a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f17533b;

        public C1049b(int i, int i2) {
            this.f17532a = i;
            this.f17533b = i2;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull Surface surface, long j) {
            C0743g.m11169e("TEImage2Mode", "capture burst buffer last...");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            C0743g.m11169e("TEImage2Mode", "onCaptureCompleted, aeExposure: " + ((Integer) totalCaptureResult.get(TotalCaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION)) + ", iso: " + ((Integer) totalCaptureResult.get(TotalCaptureResult.SENSOR_SENSITIVITY)) + ", exposureTime: " + ((Long) totalCaptureResult.get(TotalCaptureResult.SENSOR_EXPOSURE_TIME)));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            new StringBuilder("capture burst failed: ").append(captureFailure.getReason());
            int unused = njh0.this.f17514i0;
            njh0.m18941R0(njh0.this);
            throw null;
        }
    }

    /* JADX INFO: renamed from: l.njh0$c */
    public class C1050c extends CameraCaptureSession.CaptureCallback {
        public C1050c() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            if (((TECameraModeBase) njh0.this).f9138c == null) {
                return;
            }
            njh0.this.f17510e0 = totalCaptureResult;
            CaptureRequest.Builder builder = ((TECameraModeBase) njh0.this).f9138c;
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
            Integer num = (Integer) builder.get(key);
            CaptureRequest.Builder builder2 = ((TECameraModeBase) njh0.this).f9138c;
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_AF_TRIGGER;
            Integer num2 = (Integer) builder2.get(key2);
            if ((num != null && num.intValue() == 1) || (num2 != null && num2.intValue() == 1)) {
                C0743g.m11169e("TEImage2Mode", "need cancel ae af trigger");
                ((TECameraModeBase) njh0.this).f9138c.set(key, 2);
                ((TECameraModeBase) njh0.this).f9138c.set(key2, 2);
                njh0 njh0Var = njh0.this;
                TECameraModeBase.C0742f c0742fM11133l = njh0Var.m11133l(((TECameraModeBase) njh0Var).f9138c, null, null);
                if (!c0742fM11133l.m11164c()) {
                    C0743g.m11174j("TEImage2Mode", "onCaptureSequenceCompleted: error = " + c0742fM11133l.m11162a());
                    return;
                }
                ((TECameraModeBase) njh0.this).f9138c.set(key, 0);
                ((TECameraModeBase) njh0.this).f9138c.set(key2, 0);
            }
            njh0 njh0Var2 = njh0.this;
            njh0Var2.m11152v0(((TECameraModeBase) njh0Var2).f9138c);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            C0743g.m11166b("TEImage2Mode", "captureStillPicture, capture failed");
            if (((TECameraModeBase) njh0.this).f9143h.f8966q0) {
                ((TECameraModeBase) njh0.this).f9143h.f8966q0 = false;
            }
            if (((TECameraModeBase) njh0.this).f9143h.f8947h) {
                ((TECameraModeBase) njh0.this).f9143h.f8947h = false;
            }
            njh0.this.f17504Y.sendMessage(njh0.this.f17504Y.obtainMessage(1003, new Exception("Capture failed: " + captureFailure.getReason())));
            njh0.this.f17504Y.sendEmptyMessage(1002);
        }
    }

    /* JADX INFO: renamed from: l.njh0$d */
    public class C1051d extends CameraCaptureSession.CaptureCallback {
        public C1051d() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            C0743g.m11165a("TEImage2Mode", "onCaptureCompleted, do capture done");
            njh0.this.f17504Y.sendEmptyMessage(1002);
            njh0.this.f17510e0 = totalCaptureResult;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            C0743g.m11166b("TEImage2Mode", "onCaptureCompleted, do capture failed");
            if (((TECameraModeBase) njh0.this).f9143h.f8966q0) {
                ((TECameraModeBase) njh0.this).f9143h.f8966q0 = false;
            }
            if (((TECameraModeBase) njh0.this).f9143h.f8947h) {
                ((TECameraModeBase) njh0.this).f9143h.f8947h = false;
            }
            njh0.this.f17504Y.sendMessage(njh0.this.f17504Y.obtainMessage(1003, new Exception("Capture failed: " + captureFailure.getReason())));
            njh0.this.f17504Y.sendEmptyMessage(1002);
        }
    }

    /* JADX INFO: renamed from: l.njh0$e */
    public class ExecutorC1052e implements Executor {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Handler f17537a;

        public ExecutorC1052e(Handler handler) {
            this.f17537a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            Handler handler = this.f17537a;
            if (handler != null) {
                handler.post(runnable);
            } else {
                C0743g.m11166b("TEImage2Mode", "executor run, handler is null");
            }
        }
    }

    /* JADX INFO: renamed from: l.njh0$f */
    public class C1053f implements ImageReader.OnImageAvailableListener {
        public C1053f() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            TotalCaptureResult totalCaptureResult;
            Image imageAcquireNextImage = imageReader.acquireNextImage();
            if (njh0.this.f17511f0) {
                int i = 0;
                njh0.this.f17511f0 = false;
                if (imageAcquireNextImage != null) {
                    long timestamp = imageAcquireNextImage.getTimestamp();
                    TotalCaptureResult[] totalCaptureResultArr = njh0.this.f17509d0;
                    int length = totalCaptureResultArr.length;
                    while (true) {
                        if (i >= length) {
                            totalCaptureResult = null;
                            break;
                        }
                        totalCaptureResult = totalCaptureResultArr[i];
                        Long l2 = (Long) totalCaptureResult.get(TotalCaptureResult.SENSOR_TIMESTAMP);
                        if (l2 != null && timestamp >= l2.longValue()) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    njh0.this.m18950V1(imageAcquireNextImage, totalCaptureResult);
                } else {
                    njh0.this.m18948U1(new Exception("no image data"), -1000);
                }
            }
            if (imageAcquireNextImage != null) {
                imageAcquireNextImage.close();
            }
        }
    }

    /* JADX INFO: renamed from: l.njh0$g */
    public class C1054g implements ImageReader.OnImageAvailableListener {
        public C1054g() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Image imageAcquireNextImage = imageReader.acquireNextImage();
            njh0 njh0Var = njh0.this;
            if (imageAcquireNextImage == null) {
                njh0Var.m18948U1(new Exception("no image data"), -1000);
                return;
            }
            njh0Var.m18950V1(imageAcquireNextImage, imageAcquireNextImage.getFormat() != 256 ? njh0.this.f17510e0 : null);
            njh0.this.f17510e0 = null;
            imageAcquireNextImage.close();
        }
    }

    /* JADX INFO: renamed from: l.njh0$h */
    public class C1055h extends CameraCaptureSession.CaptureCallback {
        public C1055h() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull Surface surface, long j) {
            njh0.this.f17522q0.open();
            C0743g.m11166b("TEImage2Mode", "set flash request abort");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            njh0.this.f17522q0.open();
            C0743g.m11169e("TEImage2Mode", "onCaptureCompleted");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            njh0.this.f17522q0.open();
            C0743g.m11166b("TEImage2Mode", "set flash failed");
        }
    }

    /* JADX INFO: renamed from: l.njh0$i */
    public class HandlerC1056i extends Handler {
        public HandlerC1056i(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            super.dispatchMessage(message);
            C0743g.m11169e("TEImage2Mode", "dispatch msg = " + message.what);
            switch (message.what) {
                case 1000:
                case 1001:
                    njh0.this.m18940Q1();
                    break;
                case 1002:
                    njh0.this.m18952W1();
                    break;
                case 1003:
                    njh0.this.m18948U1((Exception) message.obj, -1000);
                    break;
                case 1004:
                    njh0 njh0Var = njh0.this;
                    njh0Var.m11152v0(((TECameraModeBase) njh0Var).f9138c);
                    break;
                case 1005:
                    njh0.this.m18984N1();
                    break;
                case 1006:
                case 1007:
                    njh0.this.m18936O1();
                    break;
            }
        }
    }

    public njh0(C0725b c0725b, Context context, CameraManager cameraManager, Handler handler) {
        super(c0725b, context, handler);
        this.f17503X = 0L;
        this.f17505Z = new Handler(Looper.getMainLooper());
        this.f17507b0 = null;
        this.f17508c0 = -1;
        this.f17510e0 = null;
        this.f17511f0 = false;
        this.f17512g0 = null;
        this.f17513h0 = 0;
        this.f17515j0 = false;
        this.f17516k0 = false;
        this.f17517l0 = false;
        this.f17518m0 = false;
        this.f17519n0 = 0;
        this.f17520o0 = 0;
        this.f17521p0 = 0L;
        this.f17522q0 = null;
        this.f17523r0 = -1;
        this.f17524s0 = 0;
        this.f17525t0 = 0;
        this.f17526u0 = 0L;
        this.f9140e = cameraManager;
        if (this.f9143h.f8957m) {
            this.f9144i = new pjh0(this);
        } else {
            this.f9144i = new ojh0(this);
        }
        this.f17504Y = new HandlerC1056i(handler.getLooper());
        m18946T1();
    }

    /* JADX INFO: renamed from: I1 */
    public static /* synthetic */ int m18925I1(njh0 njh0Var) {
        int i = njh0Var.f17525t0;
        njh0Var.f17525t0 = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ int m18928K0(njh0 njh0Var) {
        int i = njh0Var.f17519n0;
        njh0Var.f17519n0 = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: K1 */
    private void m18929K1() {
        CameraCharacteristics cameraCharacteristics;
        if (this.f9143h.f8932Z && (cameraCharacteristics = this.f9136a) != null) {
            Range<Integer> rangeM18942R1 = m18942R1((Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
            CaptureRequest.Builder builder = this.f9138c;
            if (builder != null && rangeM18942R1 != null) {
                builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeM18942R1);
                m11152v0(this.f9138c);
                C0743g.m11169e("TEImage2Mode", "apply capture scene: " + rangeM18942R1);
            }
        }
        m18933M1();
    }

    /* JADX INFO: renamed from: L1 */
    private void m18931L1() {
        CameraCharacteristics cameraCharacteristics;
        if (this.f9143h.f8932Z && (cameraCharacteristics = this.f9136a) != null) {
            Range<Integer> rangeM18944S1 = m18944S1((Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
            CaptureRequest.Builder builder = this.f9138c;
            if (builder != null && rangeM18944S1 != null) {
                builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeM18944S1);
                m11152v0(this.f9138c);
                C0743g.m11169e("TEImage2Mode", "apply record scene: " + rangeM18944S1);
            }
        }
        m18938P1();
    }

    /* JADX INFO: renamed from: M1 */
    private void m18933M1() {
        Surface surface;
        ImageReader imageReader = this.f17507b0;
        if (imageReader == null || (surface = imageReader.getSurface()) == null || !surface.isValid()) {
            return;
        }
        CaptureRequest.Builder builder = this.f9138c;
        if (builder != null) {
            try {
                builder.removeTarget(surface);
                this.f9138c.addTarget(surface);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        m11152v0(this.f9138c);
    }

    /* JADX INFO: renamed from: O0 */
    public static /* synthetic */ int m18935O0(njh0 njh0Var) {
        int i = njh0Var.f17508c0;
        njh0Var.f17508c0 = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O1 */
    public void m18936O1() {
        this.f17521p0 = System.currentTimeMillis();
        this.f17513h0 = 0;
        CaptureRequest.Builder builderM11146s = m11146s(2);
        if (builderM11146s == null) {
            m18948U1(new Exception("capture build is null"), -1001);
            return;
        }
        ImageReader imageReader = this.f17506a0;
        if (imageReader == null) {
            m18948U1(new Exception("image reader is null"), -1001);
            return;
        }
        builderM11146s.addTarget(imageReader.getSurface());
        m18958a2(builderM11146s);
        TECameraModeBase.C0742f c0742fM11133l = m11133l(builderM11146s, new C1050c(), this.f9146k);
        if (c0742fM11133l.m11164c()) {
            return;
        }
        m18948U1(c0742fM11133l.m11163b(), -1001);
    }

    /* JADX INFO: renamed from: P1 */
    private void m18938P1() {
        Surface surface;
        ImageReader imageReader = this.f17507b0;
        if (imageReader == null || (surface = imageReader.getSurface()) == null || !surface.isValid()) {
            return;
        }
        CaptureRequest.Builder builder = this.f9138c;
        if (builder != null) {
            try {
                builder.removeTarget(surface);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        m11152v0(this.f9138c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q1 */
    public void m18940Q1() {
        this.f17521p0 = System.currentTimeMillis();
        this.f17513h0 = 0;
        CaptureRequest.Builder builderM11146s = m11146s(2);
        if (builderM11146s == null) {
            m18948U1(new Exception("capture build is null"), -1001);
            return;
        }
        ImageReader imageReader = this.f17506a0;
        if (imageReader == null) {
            m18948U1(new Exception("image reader is null"), -1001);
            return;
        }
        builderM11146s.addTarget(imageReader.getSurface());
        m18958a2(builderM11146s);
        TECameraModeBase.C0742f c0742fM11133l = m11133l(builderM11146s, new C1051d(), null);
        if (c0742fM11133l.m11164c()) {
            return;
        }
        m18948U1(c0742fM11133l.m11163b(), -1001);
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ TECameraSettings.InterfaceC0704c m18941R0(njh0 njh0Var) {
        njh0Var.getClass();
        return null;
    }

    /* JADX INFO: renamed from: R1 */
    private Range<Integer> m18942R1(Range<Integer>[] rangeArr) {
        int i;
        int i2;
        Range<Integer> range = null;
        if (rangeArr != null) {
            TECameraSettings tECameraSettings = this.f9143h;
            if (tECameraSettings == null || (i = tECameraSettings.f8931Y) < 30) {
                i = 30;
            }
            int i3 = 0;
            int i4 = 0;
            for (Range<Integer> range2 : rangeArr) {
                C0743g.m11165a("TEImage2Mode", "fps: " + range2.toString());
                int iIntValue = ((Integer) range2.getUpper()).intValue();
                int iIntValue2 = ((Integer) range2.getLower()).intValue();
                if (iIntValue2 < 5) {
                    C0743g.m11169e("TEImage2Mode", "discard fps: " + range2.toString());
                } else {
                    if (iIntValue > i3) {
                        i3 = iIntValue;
                    }
                    if (iIntValue <= i && (i2 = iIntValue - iIntValue2) > i4) {
                        range = range2;
                        i4 = i2;
                    }
                }
            }
            if (i3 > 30) {
                ajh0.m11494b("te_record_camera_max_fps", i3);
            }
        }
        return range;
    }

    /* JADX INFO: renamed from: S1 */
    private Range<Integer> m18944S1(Range<Integer>[] rangeArr) {
        int i;
        Range<Integer> range = null;
        if (rangeArr != null) {
            TECameraSettings tECameraSettings = this.f9143h;
            int i2 = 30;
            if (tECameraSettings != null && (i = tECameraSettings.f8931Y) >= 30) {
                i2 = i;
            }
            int i3 = 0;
            int i4 = 0;
            for (Range<Integer> range2 : rangeArr) {
                C0743g.m11165a("TEImage2Mode", "fps: " + range2.toString());
                int iIntValue = ((Integer) range2.getUpper()).intValue();
                if (iIntValue > i3) {
                    i3 = iIntValue;
                }
                if (iIntValue <= i2 && iIntValue == ((Integer) range2.getLower()).intValue() && iIntValue > i4) {
                    range = range2;
                    i4 = iIntValue;
                }
            }
        }
        return range;
    }

    /* JADX INFO: renamed from: T1 */
    private void m18946T1() {
        this.f9135W = new C1048a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U1 */
    public void m18948U1(Exception exc, int i) {
        this.f17513h0 = 0;
        C0743g.m11174j("TEImage2Mode", "onCaptureFailed, err = " + exc + ", errCode = " + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V1 */
    public void m18950V1(Image image, TotalCaptureResult totalCaptureResult) {
        C0743g.m11169e("TEImage2Mode", "on image available, consume: " + (System.currentTimeMillis() - this.f17521p0) + ", size: " + image.getWidth() + "x" + image.getHeight() + ", format: " + image.getFormat() + ", rotation: " + (this.f17514i0 == 1 ? 270 : 90));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W1 */
    public void m18952W1() {
        TECameraSettings tECameraSettings = this.f9143h;
        if (tECameraSettings.f8939d != 0) {
            return;
        }
        CaptureRequest.Builder builder = this.f9138c;
        if (builder == null) {
            C0743g.m11166b("TEImage2Mode", "resetPreviewAfterFlashCapture failed, no builder");
            return;
        }
        int i = tECameraSettings.f8944f0;
        if (i == 3) {
            if (this.f9124L) {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 3);
                this.f9138c.set(CaptureRequest.FLASH_MODE, 1);
            }
        } else if (i == 2 && this.f17515j0) {
            builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            m11133l(this.f9138c, null, null);
        }
        if (this.f17515j0) {
            this.f9138c.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        }
        this.f9138c.set(CaptureRequest.CONTROL_AF_MODE, 4);
        this.f9138c.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
        m11152v0(this.f9138c);
    }

    /* JADX INFO: renamed from: X1 */
    private TEFrameSizei m18954X1(int i, int i2, int i3, int i4) {
        TECameraSettings tECameraSettings = this.f9143h;
        if (tECameraSettings.f8907A) {
            tECameraSettings.f8907A = false;
            return tECameraSettings.f8967r;
        }
        if (this.f9147l == null) {
            this.f9147l = (StreamConfigurationMap) this.f9136a.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        }
        StreamConfigurationMap streamConfigurationMap = this.f9147l;
        TEFrameSizei tEFrameSizeiMo10854a = null;
        if (streamConfigurationMap == null) {
            C0743g.m11166b("TEImage2Mode", "no stream configuration map...");
            return null;
        }
        if (!streamConfigurationMap.isOutputSupportedFor(i)) {
            C0743g.m11166b("TEImage2Mode", "Output format is not supported");
            return null;
        }
        Size[] outputSizes = this.f9147l.getOutputSizes(i);
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            arrayList.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        TECameraSettings tECameraSettings2 = this.f9143h;
        if (tECameraSettings2.f8983z) {
            return C0735f.m11064o(arrayList, tECameraSettings2.m10855a(), i4, this.f9143h.f8981y);
        }
        if (this.f9156u != null) {
            if (!StreamConfigurationMap.isOutputSupportedFor(SurfaceTexture.class)) {
                C0743g.m11166b("TEImage2Mode", "Output SurfaceTexture is not supported");
                return null;
            }
            Size[] outputSizes2 = this.f9147l.getOutputSizes(SurfaceTexture.class);
            ArrayList arrayList2 = new ArrayList();
            for (Size size2 : outputSizes2) {
                arrayList2.add(new TEFrameSizei(size2.getWidth(), size2.getHeight()));
            }
            try {
                tEFrameSizeiMo10854a = this.f9156u.mo10854a(arrayList, arrayList2);
            } catch (Exception e) {
                C0743g.m11166b("TEImage2Mode", "select pic size from client err: " + e.getMessage());
            }
        }
        if (tEFrameSizeiMo10854a != null) {
            return tEFrameSizeiMo10854a;
        }
        TEFrameSizei tEFrameSizeiM11065p = C0735f.m11065p(arrayList, this.f9143h.m10855a(), new TEFrameSizei(i2, i3));
        C0743g.m11169e("TEImage2Mode", "select pic size is null, get closest size: " + tEFrameSizeiM11065p);
        return tEFrameSizeiM11065p;
    }

    /* JADX INFO: renamed from: a2 */
    private void m18958a2(CaptureRequest.Builder builder) {
        if (builder == null) {
            C0743g.m11166b("TEImage2Mode", "syncPreviewParam failed, no capture builder");
            return;
        }
        CaptureRequest.Builder builder2 = this.f9138c;
        if (builder2 == null) {
            C0743g.m11166b("TEImage2Mode", "syncPreviewParam failed, no preview builder");
            return;
        }
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
        Integer num = (Integer) builder2.get(key);
        if (num != null) {
            builder.set(key, num);
            C0743g.m11165a("TEImage2Mode", "sync afMode: " + num);
        }
        CaptureRequest.Builder builder3 = this.f9138c;
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_REGIONS;
        MeteringRectangle[] meteringRectangleArr = (MeteringRectangle[]) builder3.get(key2);
        if (meteringRectangleArr != null) {
            builder.set(key2, meteringRectangleArr);
            C0743g.m11165a("TEImage2Mode", "sync aeRect: " + Arrays.toString(meteringRectangleArr));
        }
        CaptureRequest.Builder builder4 = this.f9138c;
        CaptureRequest.Key key3 = CaptureRequest.CONTROL_AF_REGIONS;
        MeteringRectangle[] meteringRectangleArr2 = (MeteringRectangle[]) builder4.get(key3);
        if (meteringRectangleArr != null) {
            builder.set(key3, meteringRectangleArr2);
            C0743g.m11165a("TEImage2Mode", "sync afRect: " + Arrays.toString(meteringRectangleArr2));
        }
        m18985Y1(this.f9138c, builder);
        CaptureRequest.Builder builder5 = this.f9138c;
        CaptureRequest.Key key4 = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
        Range range = (Range) builder5.get(key4);
        if (range != null) {
            builder.set(key4, range);
            C0743g.m11165a("TEImage2Mode", "sync fpsRange: " + range);
        }
        Rect rect = this.f9155t;
        if (rect != null) {
            builder.set(CaptureRequest.SCALER_CROP_REGION, rect);
            C0743g.m11165a("TEImage2Mode", "sync crop region: " + this.f9155t);
        }
        vih0 vih0Var = this.f9137b;
        if (vih0Var != null) {
            vih0Var.m23383a(this.f9136a, builder, false);
        }
        builder.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f9154s));
    }

    @Override // com.p008ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: B */
    public int[] mo11089B() {
        ImageReader imageReader = this.f17506a0;
        if (imageReader == null) {
            return null;
        }
        int width = imageReader.getWidth();
        int height = this.f17506a0.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        return new int[]{width, height};
    }

    @Override // com.p008ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: E */
    public int mo11092E() {
        return 4;
    }

    @Override // com.p008ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: G */
    public int mo11094G() {
        return this.f17523r0;
    }

    @Override // com.p008ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: K */
    public int[] mo11098K() {
        ImageReader imageReader = this.f17506a0;
        if (imageReader == null) {
            return null;
        }
        return new int[]{imageReader.getWidth(), this.f17506a0.getHeight()};
    }

    /* JADX INFO: renamed from: N1 */
    public void m18984N1() {
        CaptureRequest.Builder builder = this.f9138c;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
        Integer num = (Integer) builder.get(key);
        if (num == null || num.intValue() != 1) {
            return;
        }
        C0743g.m11169e("TEImage2Mode", "need cancel af trigger");
        this.f9138c.set(key, 2);
        m11133l(this.f9138c, null, null);
        this.f9138c.set(key, 0);
        m11152v0(this.f9138c);
    }

    @Override // com.p008ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: P */
    public int mo11103P(String str, int i) throws CameraAccessException {
        this.f17524s0 = 0;
        this.f17512g0 = null;
        if (this.f17523r0 == -1) {
            this.f17523r0 = 0;
        }
        return super.mo11103P(str, i);
    }

    /* JADX INFO: renamed from: Y1 */
    public void m18985Y1(CaptureRequest.Builder builder, CaptureRequest.Builder builder2) {
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
        Integer num = (Integer) builder.get(key);
        if (num != null && num.intValue() == 3) {
            builder2.set(key, 3);
            builder2.set(CaptureRequest.FLASH_MODE, 1);
        } else {
            if (num == null || num.intValue() != 1) {
                return;
            }
            CaptureRequest.Key key2 = CaptureRequest.FLASH_MODE;
            Integer num2 = (Integer) builder.get(key2);
            if (num2 == null || num2.intValue() != 2) {
                return;
            }
            builder2.set(key, 1);
            builder2.set(key2, 2);
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public void m18986Z1(int i, int i2) {
        boolean z;
        Size size;
        TECameraSettings tECameraSettings = this.f9143h;
        int i3 = 256;
        int i4 = (tECameraSettings.f8966q0 || tECameraSettings.f8947h) ? 35 : 256;
        TEFrameSizei tEFrameSizeiM18954X1 = m18954X1(i4, i, i2, tECameraSettings.f8973u);
        if (tEFrameSizeiM18954X1 == null) {
            C0743g.m11166b("TEImage2Mode", "select picture size failed...format: " + i4);
            return;
        }
        TECameraSettings tECameraSettings2 = this.f9143h;
        tECameraSettings2.f8967r = tEFrameSizeiM18954X1;
        int width = tEFrameSizeiM18954X1.width;
        int height = tEFrameSizeiM18954X1.height;
        int i5 = 0;
        if (tECameraSettings2.f8947h && width <= 4096 && i4 == 35) {
            this.f17509d0 = new TotalCaptureResult[5];
            ImageReader imageReaderNewInstance = ImageReader.newInstance(width, height, i4, 3);
            this.f17507b0 = imageReaderNewInstance;
            imageReaderNewInstance.setOnImageAvailableListener(new C1053f(), this.f17505Z);
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Size[] outputSizes = this.f9147l.getOutputSizes(256);
            if (outputSizes == null) {
                size = null;
                break;
            }
            int length = outputSizes.length;
            while (true) {
                if (i5 >= length) {
                    size = null;
                    break;
                }
                size = outputSizes[i5];
                if (size.getWidth() == width && size.getHeight() == height) {
                    break;
                } else {
                    i5++;
                }
            }
            if (size == null) {
                this.f17509d0 = null;
                this.f17507b0.setOnImageAvailableListener(null, null);
                this.f17507b0.close();
                this.f17507b0 = null;
                i3 = i4;
            } else {
                width = size.getWidth();
                height = size.getHeight();
            }
        } else {
            i3 = i4;
        }
        this.f17506a0 = ImageReader.newInstance(width, height, i3, 1);
        C0743g.m11169e("TEImage2Mode", "image reader width: " + this.f17506a0.getWidth() + ", height = " + this.f17506a0.getHeight() + ", format: " + i3 + ", maxWidth: " + this.f9143h.f8973u + ", hasZslYuvSurface: " + z);
        this.f17506a0.setOnImageAvailableListener(new C1054g(), this.f17505Z);
    }

    /* JADX INFO: renamed from: b2 */
    public void m18987b2(int i) {
        C0743g.m11169e("TEImage2Mode", "updateFlashModeParam: " + i);
        this.f17523r0 = i;
        CaptureRequest.Builder builder = this.f9138c;
        if (builder == null) {
            C0743g.m11166b("TEImage2Mode", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: mCaptureRequestBuilder is null");
            this.f9141f.mo10846c(this.f9143h.f8935b, -100, "switchFlashMode : CaptureRequest.Builder is null", this.f9145j);
            return;
        }
        CaptureRequest.Key key = CaptureRequest.FLASH_MODE;
        Integer num = (Integer) builder.get(key);
        int iIntValue = num == null ? 0 : num.intValue();
        if (i == 1) {
            if (this.f9143h.f8939d == 1) {
                C0743g.m11166b("TEImage2Mode", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -416. Reason: not support torch");
                C0743g.m11174j("TEImage2Mode", "flash on is not supported in front camera!");
                return;
            } else {
                this.f9138c.set(CaptureRequest.CONTROL_AE_MODE, 3);
                this.f9138c.set(key, 1);
                this.f9124L = true;
                return;
            }
        }
        if (i == 0) {
            this.f9124L = false;
            if (iIntValue == 0) {
                C0743g.m11169e("TEImage2Mode", "switchFlashMode flashStatus == FLASH_MODE_OFF");
                return;
            } else {
                this.f9138c.set(CaptureRequest.CONTROL_AE_MODE, 1);
                this.f9138c.set(key, 0);
                return;
            }
        }
        if (i == 2) {
            this.f9124L = false;
            if (iIntValue == 2) {
                C0743g.m11169e("TEImage2Mode", "switchFlashMode flashStatus == FLASH_MODE_TORCH");
                return;
            } else {
                this.f9138c.set(CaptureRequest.CONTROL_AE_MODE, 1);
                this.f9138c.set(key, 2);
                return;
            }
        }
        C0743g.m11166b("TEImage2Mode", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -416. Reason: not support flash mode " + i);
        C0743g.m11166b("TEImage2Mode", "not support flash mode: " + i);
    }

    @Override // p009l.y3m
    /* JADX INFO: renamed from: c */
    public void mo11499c(int i) {
        TECameraModeBase.C0742f c0742fM11152v0;
        if (this.f9138c == null) {
            C0743g.m11166b("TEImage2Mode", "switchFlashMode failed, mode: " + i);
            return;
        }
        int i2 = this.f17523r0;
        boolean z = (i2 == -1 || i2 == 0 || i != 0) ? false : true;
        m18987b2(i);
        if (z) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.f17522q0 == null) {
                this.f17522q0 = new ConditionVariable();
            }
            this.f17522q0.close();
            c0742fM11152v0 = m11156x0(this.f9138c, new C1055h(), this.f17505Z);
            if (!this.f17522q0.block(33L)) {
                C0743g.m11169e("TEImage2Mode", "close flash: " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
            }
            m11152v0(this.f9138c);
        } else {
            c0742fM11152v0 = m11152v0(this.f9138c);
        }
        if (c0742fM11152v0.m11164c()) {
            return;
        }
        C0743g.m11166b("TEImage2Mode", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: " + c0742fM11152v0.m11162a());
        this.f9141f.mo10848e(-100, -100, c0742fM11152v0.m11162a(), this.f9145j);
    }

    @Override // com.p008ss.android.ttvecamera.framework.TECameraModeBase, p009l.z3m.InterfaceC1341a
    /* JADX INFO: renamed from: d */
    public int mo11118d() {
        CaptureRequest.Builder builder = this.f9138c;
        if (builder == null) {
            this.f9141f.mo10846c(this.f9143h.f8935b, -100, "rollbackMeteringSessionRequest : param is null.", this.f9145j);
            return -100;
        }
        builder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
        return super.mo11118d();
    }

    @Override // com.p008ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: f0 */
    public int mo11123f0(int i, int i2) {
        TECameraSettings tECameraSettings = this.f9143h;
        tECameraSettings.f8907A = true;
        TEFrameSizei tEFrameSizei = tECameraSettings.f8967r;
        tEFrameSizei.width = i;
        tEFrameSizei.height = i2;
        mo11142q();
        try {
            return mo11135m0();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override // com.p008ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: i0 */
    public void mo11128i0(int i) {
        this.f17524s0 = i;
        C0743g.m11169e("TEImage2Mode", "setSceneMode: " + i);
        if (i == 0) {
            m18929K1();
        } else if (i == 1) {
            m18931L1();
        } else {
            ig3.a("un support scene");
        }
    }

    @Override // com.p008ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: m0 */
    public int mo11135m0() throws Exception {
        wjh0.m24289a("TEImage2Mode-startPreview");
        this.f9124L = false;
        Float f = (Float) this.f9136a.get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        int iIntValue = f == null ? 0 : f.intValue();
        C0743g.m11165a("TEImage2Mode", "lensInfoMinFocusDistance = " + iIntValue);
        boolean z = true;
        this.f17515j0 = iIntValue != 0;
        cjh0 cjh0VarM10996K = this.f9142g.m10996K();
        if (this.f9145j == null || cjh0VarM10996K == null) {
            C0743g.m11166b("TEImage2Mode", "CameraDevice or ProviderManager is null!");
            return -100;
        }
        if (this.f9143h.f8964p0) {
            if (cjh0VarM10996K.m12619f() != null) {
                cjh0VarM10996K.m12619f().mo12047l();
                C0743g.m11169e("TEImage2Mode", "reallocate st...");
            } else {
                C0743g.m11166b("TEImage2Mode", "reallocate st...err");
            }
        }
        int iM11105R = super.m11105R();
        if (iM11105R != 0) {
            return iM11105R;
        }
        TEFrameSizei tEFrameSizei = this.f9143h.f8967r;
        m18986Z1(tEFrameSizei.width, tEFrameSizei.height);
        CaptureRequest.Builder builderCreateCaptureRequest = this.f9145j.createCaptureRequest(1);
        this.f9138c = builderCreateCaptureRequest;
        Rect rect = this.f9155t;
        if (rect != null) {
            builderCreateCaptureRequest.set(CaptureRequest.SCALER_CROP_REGION, rect);
        }
        ArrayList arrayList = new ArrayList();
        if (cjh0VarM10996K.m12619f().mo12042g() == 8) {
            arrayList.addAll(Arrays.asList(cjh0VarM10996K.m12618e()));
        } else {
            arrayList.add(cjh0VarM10996K.m12617d());
        }
        ImageReader imageReader = this.f17507b0;
        if (imageReader != null) {
            arrayList.add(imageReader.getSurface());
        }
        Iterator<Surface> it = arrayList.iterator();
        while (it.hasNext()) {
            this.f9138c.addTarget(it.next());
        }
        ImageReader imageReader2 = this.f17506a0;
        if (imageReader2 != null) {
            arrayList.add(imageReader2.getSurface());
        }
        this.f9138c.set(CaptureRequest.CONTROL_AF_MODE, 4);
        TECameraSettings tECameraSettings = this.f9143h;
        if (tECameraSettings.f8932Z) {
            if (Build.VERSION.SDK_INT >= 28) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                CameraCharacteristics cameraCharacteristics = this.f9136a;
                if (cameraCharacteristics != null && this.f17512g0 == null) {
                    this.f17512g0 = cameraCharacteristics.getAvailableSessionKeys();
                }
                List<CaptureRequest.Key<?>> list = this.f17512g0;
                if (list == null) {
                    z = false;
                    break;
                }
                Iterator<CaptureRequest.Key<?>> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = false;
                        break;
                    }
                    if (CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE.getName().equals(it2.next().getName())) {
                        this.f9143h.f8932Z = false;
                        break;
                    }
                }
                C0743g.m11169e("TEImage2Mode", "check aeTargetFpsRange is session key: " + z + ", consume: " + (System.currentTimeMillis() - jCurrentTimeMillis));
            } else {
                tECameraSettings.f8932Z = false;
            }
        }
        this.f17526u0 = 0L;
        this.f17525t0 = 0;
        this.f17519n0 = 0;
        this.f17508c0 = -1;
        int i = this.f9143h.f8930X;
        this.f17520o0 = i;
        if (i > 0) {
            C0743g.m11169e("TEImage2Mode", "release camera metadata threshold: " + this.f17520o0);
        }
        this.f17518m0 = false;
        this.f17513h0 = 0;
        this.f9120H = System.currentTimeMillis();
        Handler handlerM11091D = this.f9143h.f8953k ? m11091D() : this.f9146k;
        this.f9139d = null;
        mo11148t(arrayList, this.f9134V, handlerM11091D);
        if (this.f9139d == null) {
            m11160z0();
        }
        wjh0.m24290b();
        return 0;
    }

    @Override // com.p008ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: o */
    public void mo11138o(ti3 ti3Var, int i, TECameraSettings.InterfaceC0704c interfaceC0704c) {
        int i2;
        int i3;
        int i4 = ti3Var.f20710c;
        if ((i4 != 0 && i4 != this.f17506a0.getWidth()) || ((i2 = ti3Var.f20711d) != 0 && i2 != this.f17506a0.getHeight())) {
            C0743g.m11166b("TEImage2Mode", "restart preview for burst capture");
            this.f9143h.f8953k = true;
            mo11123f0(ti3Var.f20710c, ti3Var.f20711d);
        }
        this.f17514i0 = i;
        this.f17521p0 = System.currentTimeMillis();
        int width = this.f17506a0.getWidth();
        int height = this.f17506a0.getHeight();
        List<Integer> list = ti3Var.f20709b;
        C1049b c1049b = new C1049b(width, height);
        int i5 = ti3Var.f20708a;
        if (i5 == 1) {
            ArrayList arrayList = new ArrayList(list.size());
            for (Integer num : list) {
                CaptureRequest.Builder builderM11146s = m11146s(2);
                m18958a2(builderM11146s);
                builderM11146s.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, num);
                builderM11146s.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.TRUE);
                builderM11146s.addTarget(this.f17506a0.getSurface());
                arrayList.add(builderM11146s.build());
            }
            m11136n(arrayList, c1049b, null);
            return;
        }
        if (i5 == 0) {
            if (ti3Var.f20713f) {
                m11143q0();
            }
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                Integer num2 = list.get(i6);
                CaptureRequest.Builder builderM11146s2 = m11146s(2);
                m18958a2(builderM11146s2);
                builderM11146s2.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, num2);
                builderM11146s2.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.TRUE);
                builderM11146s2.addTarget(this.f17506a0.getSurface());
                m11134m(builderM11146s2.build(), c1049b, null);
                if (i6 > 0 && i6 < size - 1 && (i3 = ti3Var.f20712e) > 0) {
                    try {
                        Thread.sleep(i3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (ti3Var.f20713f) {
                m11152v0(this.f9138c);
            }
        }
    }

    @Override // com.p008ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: q */
    public void mo11142q() {
        this.f17513h0 = 0;
        this.f17504Y.removeCallbacksAndMessages(null);
        Handler handler = this.f9116D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f17503X = 0L;
        this.f17517l0 = false;
        this.f17519n0 = 0;
        this.f17523r0 = -1;
        this.f17510e0 = null;
        this.f9124L = false;
        ImageReader imageReader = this.f17506a0;
        if (imageReader != null) {
            imageReader.close();
            this.f17506a0 = null;
        }
        ImageReader imageReader2 = this.f17507b0;
        if (imageReader2 != null) {
            imageReader2.close();
            this.f17507b0 = null;
        }
        this.f17509d0 = null;
        this.f9138c = null;
        super.mo11142q();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0064  */
    @Override // com.p008ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: r */
    public Range<Integer> mo11144r(Range<Integer> range) {
        Range<Integer> range2;
        CameraCharacteristics cameraCharacteristics = this.f9136a;
        if (cameraCharacteristics != null && range != null && this.f9143h.f8978w0) {
            Range<Integer>[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            if (rangeArr == null) {
                return range;
            }
            Range<Integer> rangeM18944S1 = null;
            if (this.f9158w != null) {
                ArrayList arrayList = new ArrayList(rangeArr.length);
                for (Range<Integer> range3 : rangeArr) {
                    arrayList.add(new int[]{((Integer) range3.getLower()).intValue(), ((Integer) range3.getUpper()).intValue()});
                }
                int[] iArrMo10853a = this.f9158w.mo10853a(arrayList);
                if (iArrMo10853a != null) {
                    range2 = new Range<>(Integer.valueOf(iArrMo10853a[0]), Integer.valueOf(iArrMo10853a[1]));
                } else {
                    range2 = null;
                }
            } else {
                range2 = null;
            }
            if (range2 != null) {
                C0743g.m11169e("TEImage2Mode", "select fps from user callback: " + range2);
                return range2;
            }
            if (this.f9143h.f8921O == 4) {
                Range<Integer> range4 = new Range<>(Integer.valueOf(this.f9143h.f8937c.min), Integer.valueOf(this.f9143h.f8937c.max));
                for (Range<Integer> range5 : rangeArr) {
                    if (range4.equals(range5)) {
                        range2 = range4;
                        break;
                    }
                }
            }
            if (range2 != null) {
                C0743g.m11169e("TEImage2Mode", "select fps from user direct set: " + range2);
                return range2;
            }
            int i = this.f17524s0;
            if (i == 0) {
                rangeM18944S1 = m18942R1(rangeArr);
            } else if (i == 1) {
                rangeM18944S1 = m18944S1(rangeArr);
            }
            if (rangeM18944S1 != null) {
                range2 = rangeM18944S1;
            }
            if (range2 != null) {
                range = range2;
            }
            C0743g.m11169e("TEImage2Mode", "select fps: " + range);
        }
        return range;
    }

    @Override // com.p008ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: r0 */
    public void mo11145r0(int i, int i2, TECameraSettings.InterfaceC0713l interfaceC0713l) {
        mo11147s0(interfaceC0713l, this.f9143h.f8939d);
    }

    @Override // com.p008ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: s0 */
    public void mo11147s0(TECameraSettings.InterfaceC0713l interfaceC0713l, int i) {
        super.mo11147s0(interfaceC0713l, i);
        this.f17514i0 = i;
        this.f17517l0 = false;
        this.f17521p0 = System.currentTimeMillis();
        if (this.f17507b0 != null && !this.f9124L) {
            this.f17513h0 = 1;
            this.f17511f0 = true;
            C0743g.m11169e("TEImage2Mode", "takePicture...use zsl buffer");
            return;
        }
        C0743g.m11169e("TEImage2Mode", "takePicture...flash strategy: " + this.f9143h.f8944f0);
        boolean z = this.f9124L;
        long j = z ? 1600L : 800L;
        TECameraSettings tECameraSettings = this.f9143h;
        if (tECameraSettings.f8939d != 0) {
            this.f17513h0 = 1;
            m18940Q1();
            return;
        }
        int i2 = tECameraSettings.f8944f0;
        if (i2 == 3) {
            if (!z) {
                m18940Q1();
                return;
            }
            this.f17503X = System.currentTimeMillis();
            this.f17513h0 = 2;
            this.f17504Y.sendEmptyMessageDelayed(1001, j);
            this.f9138c.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.f9138c.set(CaptureRequest.FLASH_MODE, 2);
            if (!this.f17515j0) {
                this.f17504Y.sendEmptyMessageDelayed(1000, 300L);
                return;
            }
            this.f9138c.set(CaptureRequest.CONTROL_AF_MODE, 1);
            CaptureRequest.Builder builder = this.f9138c;
            CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
            builder.set(key, 1);
            this.f9138c.setTag("CAPTURE_REQUEST_TAG_FOR_SHOT");
            m11131k(this.f9138c);
            this.f9138c.setTag(null);
            this.f9138c.set(key, 0);
            this.f9138c.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
            m11152v0(this.f9138c);
            TECameraModeBase.C0742f c0742fM11152v0 = m11152v0(this.f9138c);
            if (c0742fM11152v0.m11164c()) {
                return;
            }
            HandlerC1056i handlerC1056i = this.f17504Y;
            handlerC1056i.sendMessage(handlerC1056i.obtainMessage(1003, c0742fM11152v0.m11163b()));
            return;
        }
        if (i2 == 2) {
            if (!z && this.f17518m0) {
                C0743g.m11169e("TEImage2Mode", "af converge, do capture...");
                m18940Q1();
                return;
            }
            this.f17503X = System.currentTimeMillis();
            this.f17513h0 = 2;
            this.f17504Y.sendEmptyMessageDelayed(1001, j);
            if (this.f17515j0) {
                this.f9138c.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            }
            CaptureRequest.Builder builder2 = this.f9138c;
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
            builder2.set(key2, 1);
            this.f9138c.setTag("CAPTURE_REQUEST_TAG_FOR_SHOT");
            m11131k(this.f9138c);
            this.f9138c.setTag(null);
            this.f9138c.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
            this.f9138c.set(key2, 0);
            TECameraModeBase.C0742f c0742fM11152v1 = m11152v0(this.f9138c);
            if (c0742fM11152v1.m11164c()) {
                return;
            }
            HandlerC1056i handlerC1056i2 = this.f17504Y;
            handlerC1056i2.sendMessage(handlerC1056i2.obtainMessage(1003, c0742fM11152v1.m11163b()));
            return;
        }
        if (i2 != 0) {
            if (i2 != 1) {
                this.f17513h0 = 1;
                m18940Q1();
                return;
            }
            this.f17513h0 = 1;
            if (z) {
                this.f9138c.set(CaptureRequest.CONTROL_AE_MODE, 1);
                this.f9138c.set(CaptureRequest.FLASH_MODE, 2);
            }
            m18936O1();
            return;
        }
        if (!z && this.f17518m0) {
            C0743g.m11169e("TEImage2Mode", "af converge, do capture...");
            m18936O1();
            return;
        }
        this.f17503X = System.currentTimeMillis();
        this.f17513h0 = 1;
        this.f17504Y.sendEmptyMessageDelayed(1007, j);
        if (this.f17515j0) {
            this.f9138c.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        }
        this.f9138c.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        TECameraModeBase.C0742f c0742fM11133l = m11133l(this.f9138c, this.f9135W, this.f9146k);
        if (c0742fM11133l.m11164c()) {
            return;
        }
        HandlerC1056i handlerC1056i3 = this.f17504Y;
        handlerC1056i3.sendMessage(handlerC1056i3.obtainMessage(1003, c0742fM11133l.m11163b()));
    }

    @Override // com.p008ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: t */
    public void mo11148t(List<Surface> list, CameraCaptureSession.StateCallback stateCallback, Handler handler) throws CameraAccessException {
        wjh0.m24289a("TEImage2Mode-createSession");
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList arrayList = new ArrayList();
            Iterator<Surface> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new OutputConfiguration(it.next()));
            }
            mjh0.m18513a();
            SessionConfiguration sessionConfigurationM17895a = ljh0.m17895a(m11100M(list), arrayList, new ExecutorC1052e(handler), stateCallback);
            this.f9138c.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, mo11144r(new Range<>(Integer.valueOf(this.f9114B.min / this.f9143h.f8937c.fpsUnitFactor), Integer.valueOf(this.f9114B.max / this.f9143h.f8937c.fpsUnitFactor))));
            m18987b2(this.f17523r0);
            sessionConfigurationM17895a.setSessionParameters(this.f9138c.build());
            C0743g.m11169e("TEImage2Mode", "createSession by sessionConfiguration");
            this.f9145j.createCaptureSession(sessionConfigurationM17895a);
        } else {
            C0743g.m11169e("TEImage2Mode", "createSession by normally");
            this.f9145j.createCaptureSession(list, stateCallback, handler);
        }
        wjh0.m24290b();
    }

    @Override // com.p008ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: t0 */
    public int mo11149t0(boolean z) {
        mo11499c(z ? 2 : 0);
        return 0;
    }

    @Override // com.p008ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: u0 */
    public int mo11151u0() throws CameraAccessException {
        m18987b2(this.f17523r0);
        return super.mo11151u0();
    }

    @Override // com.p008ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: z */
    public int mo11159z(TEFocusSettings tEFocusSettings) {
        if (this.f17513h0 == 0) {
            return super.mo11159z(tEFocusSettings);
        }
        C0743g.m11166b("TEImage2Mode", "focus action discard, state = " + this.f17513h0);
        return -108;
    }
}
