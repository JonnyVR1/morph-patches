package p153l;

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
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p074ss.android.ttvecamera.C13486b;
import com.p074ss.android.ttvecamera.C13496f;
import com.p074ss.android.ttvecamera.C13504g;
import com.p074ss.android.ttvecamera.TECameraSettings;
import com.p074ss.android.ttvecamera.TEFocusSettings;
import com.p074ss.android.ttvecamera.TEFrameSizei;
import com.p074ss.android.ttvecamera.framework.TECameraModeBase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes11.dex */
@TargetApi(21)
public class urh0 extends TECameraModeBase {

    /* JADX INFO: renamed from: X */
    private long f180615X;

    /* JADX INFO: renamed from: Y */
    private final HandlerC20646i f180616Y;

    /* JADX INFO: renamed from: Z */
    private final Handler f180617Z;

    /* JADX INFO: renamed from: a0 */
    protected ImageReader f180618a0;

    /* JADX INFO: renamed from: b0 */
    protected ImageReader f180619b0;

    /* JADX INFO: renamed from: c0 */
    private int f180620c0;

    /* JADX INFO: renamed from: d0 */
    private TotalCaptureResult[] f180621d0;

    /* JADX INFO: renamed from: e0 */
    private TotalCaptureResult f180622e0;

    /* JADX INFO: renamed from: f0 */
    private volatile boolean f180623f0;

    /* JADX INFO: renamed from: g0 */
    private List<CaptureRequest.Key<?>> f180624g0;

    /* JADX INFO: renamed from: h0 */
    private int f180625h0;

    /* JADX INFO: renamed from: i0 */
    private int f180626i0;

    /* JADX INFO: renamed from: j0 */
    private boolean f180627j0;

    /* JADX INFO: renamed from: k0 */
    private boolean f180628k0;

    /* JADX INFO: renamed from: l0 */
    private boolean f180629l0;

    /* JADX INFO: renamed from: m0 */
    private boolean f180630m0;

    /* JADX INFO: renamed from: n0 */
    private int f180631n0;

    /* JADX INFO: renamed from: o0 */
    private int f180632o0;

    /* JADX INFO: renamed from: p0 */
    private long f180633p0;

    /* JADX INFO: renamed from: q0 */
    private ConditionVariable f180634q0;

    /* JADX INFO: renamed from: r0 */
    private int f180635r0;

    /* JADX INFO: renamed from: s0 */
    private int f180636s0;

    /* JADX INFO: renamed from: t0 */
    private int f180637t0;

    /* JADX INFO: renamed from: u0 */
    private long f180638u0;

    /* JADX INFO: renamed from: l.urh0$a */
    public class C20638a extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a */
        private Integer f180639a = -1;

        /* JADX INFO: renamed from: b */
        private Integer f180640b = -1;

        /* JADX INFO: renamed from: c */
        private Integer f180641c = -1;

        /* JADX INFO: renamed from: d */
        private Integer f180642d = -1;

        public C20638a() {
        }

        /* JADX INFO: renamed from: a */
        private void m197600a(CaptureResult captureResult) {
            int i = urh0.this.f180625h0;
            boolean z = true;
            if (i == 0) {
                Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                int iIntValue = num != null ? num.intValue() : -1;
                urh0.this.f180630m0 = iIntValue == -1 || iIntValue == 2 || iIntValue == 4;
                CaptureRequest.Builder builder = ((TECameraModeBase) urh0.this).f56380c;
                if (builder != null) {
                    CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
                    Integer num2 = (Integer) builder.get(key);
                    if (num2 == null || num2.intValue() != 1) {
                        return;
                    }
                    if (4 == iIntValue || 5 == iIntValue || -1 == iIntValue) {
                        builder.set(key, 2);
                        if (urh0.this.f180616Y != null) {
                            urh0.this.f180616Y.sendEmptyMessage(1004);
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
                urh0.this.f180628k0 = true;
                C13504g.m82001e("TEImage2Mode", "ae trigger start...");
            }
            if (urh0.this.f180628k0) {
                if (num4 == null || num4.intValue() == 2 || num4.intValue() == 4) {
                    urh0.this.f180628k0 = false;
                    C13504g.m82001e("TEImage2Mode", "ae converge, is shot can do");
                } else {
                    z = false;
                }
                if (!this.f180642d.equals(num4)) {
                    C13504g.m82001e("TEImage2Mode", "ae state:" + num4);
                }
                this.f180642d = num4;
            } else {
                z = false;
            }
            if (z) {
                long jCurrentTimeMillis = System.currentTimeMillis() - urh0.this.f180615X;
                urh0.this.f180625h0 = 0;
                urh0.this.f180628k0 = false;
                if (urh0.this.f180616Y != null) {
                    urh0.this.f180616Y.removeMessages(1007);
                    urh0.this.f180616Y.sendEmptyMessage(1006);
                    urh0.this.f180616Y.sendEmptyMessage(1005);
                }
                C13504g.m82001e("TEImage2Mode", "send-capture-command consume = " + jCurrentTimeMillis);
            }
        }

        /* JADX INFO: renamed from: b */
        private void m197601b(CaptureResult captureResult) {
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
            if (!this.f180639a.equals(numValueOf) || !this.f180640b.equals(numValueOf2) || !this.f180641c.equals(numValueOf3) || !this.f180642d.equals(numValueOf4)) {
                C13504g.m81997a("TEImage2Mode", "[afMode=" + numValueOf + ", afState=" + numValueOf2 + ",aeMode=" + numValueOf3 + ", aeState=" + numValueOf4 + Constants.AES_SUFFIX);
            }
            this.f180639a = numValueOf;
            this.f180640b = numValueOf2;
            this.f180641c = numValueOf3;
            this.f180642d = numValueOf4;
            if ("CAPTURE_REQUEST_TAG_FOR_SHOT".equals(captureResult.getRequest().getTag())) {
                urh0.this.f180629l0 = true;
                C13504g.m82001e("TEImage2Mode", "is shot can do");
            }
            if (!urh0.this.f180629l0) {
                C13504g.m81997a("TEImage2Mode", "discard previous callback");
                return;
            }
            if (iIntValue == -1 || iIntValue == 4 || iIntValue == 5 || iIntValue == 2) {
                if (iIntValue2 == -1 || iIntValue2 == 4 || iIntValue2 == 2) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - urh0.this.f180615X;
                    urh0.this.f180616Y.removeMessages(1001);
                    urh0.this.f180616Y.sendEmptyMessage(1000);
                    urh0.this.f180629l0 = false;
                    C13504g.m82001e("TEImage2Mode", "send-capture-command consume = " + jCurrentTimeMillis);
                    hrh0.m136853b("te_record_send_capture_command_cost", jCurrentTimeMillis);
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull Surface surface, long j) {
            if (urh0.this.f180625h0 == 2 && "CAPTURE_REQUEST_TAG_FOR_SHOT".equals(captureRequest.getTag())) {
                urh0.this.f180629l0 = true;
                C13504g.m81998b("TEImage2Mode", "onCaptureBufferLost: ");
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - urh0.this.f180638u0;
            urh0 urh0Var = urh0.this;
            if (j > 1000) {
                C13504g.m81997a("TEImage2Mode", "on frame arrived fps: " + urh0Var.f180637t0);
                urh0.this.f180637t0 = 0;
                urh0.this.f180638u0 = jCurrentTimeMillis;
            } else {
                urh0.m197537I1(urh0Var);
            }
            m197600a(totalCaptureResult);
            if (!((TECameraModeBase) urh0.this).f56361G) {
                urh0.this.m81936Q();
                ((TECameraModeBase) urh0.this).f56361G = true;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - ((TECameraModeBase) urh0.this).f56364J;
                C13504g.m82001e("TEImage2Mode", "first preview frame callback arrived! consume = " + jCurrentTimeMillis2 + ", session consume: " + ((TECameraModeBase) urh0.this).f56363I);
                hrh0.m136853b("te_record_camera2_set_repeating_request_cost", jCurrentTimeMillis2);
                C13504g.m82002f("te_record_camera2_set_repeating_request_cost", Long.valueOf(jCurrentTimeMillis2));
            }
            if (urh0.this.f180625h0 == 2) {
                m197601b(totalCaptureResult);
            }
            urh0.m197540K0(urh0.this);
            if (urh0.this.f180632o0 != 0 && urh0.this.f180631n0 > urh0.this.f180632o0) {
                urh0.this.f180631n0 = 0;
                Runtime.getRuntime().gc();
            }
            urh0.m197547O0(urh0.this);
            if (urh0.this.f180620c0 % 5 == 0) {
                urh0.this.f180620c0 = 0;
            }
            if (urh0.this.f180621d0 != null) {
                urh0.this.f180621d0[urh0.this.f180620c0] = totalCaptureResult;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            if (urh0.this.f180625h0 == 2 && "CAPTURE_REQUEST_TAG_FOR_SHOT".equals(captureRequest.getTag())) {
                urh0.this.f180629l0 = true;
                C13504g.m81998b("TEImage2Mode", "onCaptureFailed: ");
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
            m197600a(captureResult);
        }
    }

    /* JADX INFO: renamed from: l.urh0$b */
    public class C20639b extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f180644a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f180645b;

        public C20639b(int i, int i2) {
            this.f180644a = i;
            this.f180645b = i2;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull Surface surface, long j) {
            C13504g.m82001e("TEImage2Mode", "capture burst buffer last...");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            C13504g.m82001e("TEImage2Mode", "onCaptureCompleted, aeExposure: " + ((Integer) totalCaptureResult.get(TotalCaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION)) + ", iso: " + ((Integer) totalCaptureResult.get(TotalCaptureResult.SENSOR_SENSITIVITY)) + ", exposureTime: " + ((Long) totalCaptureResult.get(TotalCaptureResult.SENSOR_EXPOSURE_TIME)));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            new StringBuilder("capture burst failed: ").append(captureFailure.getReason());
            int unused = urh0.this.f180626i0;
            urh0.m197553R0(urh0.this);
            throw null;
        }
    }

    /* JADX INFO: renamed from: l.urh0$c */
    public class C20640c extends CameraCaptureSession.CaptureCallback {
        public C20640c() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            if (((TECameraModeBase) urh0.this).f56380c == null) {
                return;
            }
            urh0.this.f180622e0 = totalCaptureResult;
            CaptureRequest.Builder builder = ((TECameraModeBase) urh0.this).f56380c;
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
            Integer num = (Integer) builder.get(key);
            CaptureRequest.Builder builder2 = ((TECameraModeBase) urh0.this).f56380c;
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_AF_TRIGGER;
            Integer num2 = (Integer) builder2.get(key2);
            if ((num != null && num.intValue() == 1) || (num2 != null && num2.intValue() == 1)) {
                C13504g.m82001e("TEImage2Mode", "need cancel ae af trigger");
                ((TECameraModeBase) urh0.this).f56380c.set(key, 2);
                ((TECameraModeBase) urh0.this).f56380c.set(key2, 2);
                urh0 urh0Var = urh0.this;
                TECameraModeBase.C13503f c13503fM81965l = urh0Var.m81965l(((TECameraModeBase) urh0Var).f56380c, null, null);
                if (!c13503fM81965l.m81996c()) {
                    C13504g.m82006j("TEImage2Mode", "onCaptureSequenceCompleted: error = " + c13503fM81965l.m81994a());
                    return;
                }
                ((TECameraModeBase) urh0.this).f56380c.set(key, 0);
                ((TECameraModeBase) urh0.this).f56380c.set(key2, 0);
            }
            urh0 urh0Var2 = urh0.this;
            urh0Var2.m81984v0(((TECameraModeBase) urh0Var2).f56380c);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            C13504g.m81998b("TEImage2Mode", "captureStillPicture, capture failed");
            if (((TECameraModeBase) urh0.this).f56385h.f56208q0) {
                ((TECameraModeBase) urh0.this).f56385h.f56208q0 = false;
            }
            if (((TECameraModeBase) urh0.this).f56385h.f56189h) {
                ((TECameraModeBase) urh0.this).f56385h.f56189h = false;
            }
            urh0.this.f180616Y.sendMessage(urh0.this.f180616Y.obtainMessage(1003, new Exception("Capture failed: " + captureFailure.getReason())));
            urh0.this.f180616Y.sendEmptyMessage(1002);
        }
    }

    /* JADX INFO: renamed from: l.urh0$d */
    public class C20641d extends CameraCaptureSession.CaptureCallback {
        public C20641d() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            C13504g.m81997a("TEImage2Mode", "onCaptureCompleted, do capture done");
            urh0.this.f180616Y.sendEmptyMessage(1002);
            urh0.this.f180622e0 = totalCaptureResult;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            C13504g.m81998b("TEImage2Mode", "onCaptureCompleted, do capture failed");
            if (((TECameraModeBase) urh0.this).f56385h.f56208q0) {
                ((TECameraModeBase) urh0.this).f56385h.f56208q0 = false;
            }
            if (((TECameraModeBase) urh0.this).f56385h.f56189h) {
                ((TECameraModeBase) urh0.this).f56385h.f56189h = false;
            }
            urh0.this.f180616Y.sendMessage(urh0.this.f180616Y.obtainMessage(1003, new Exception("Capture failed: " + captureFailure.getReason())));
            urh0.this.f180616Y.sendEmptyMessage(1002);
        }
    }

    /* JADX INFO: renamed from: l.urh0$e */
    public class ExecutorC20642e implements Executor {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Handler f180649a;

        public ExecutorC20642e(Handler handler) {
            this.f180649a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            Handler handler = this.f180649a;
            if (handler != null) {
                handler.post(runnable);
            } else {
                C13504g.m81998b("TEImage2Mode", "executor run, handler is null");
            }
        }
    }

    /* JADX INFO: renamed from: l.urh0$f */
    public class C20643f implements ImageReader.OnImageAvailableListener {
        public C20643f() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            TotalCaptureResult totalCaptureResult;
            Image imageAcquireNextImage = imageReader.acquireNextImage();
            if (urh0.this.f180623f0) {
                int i = 0;
                urh0.this.f180623f0 = false;
                if (imageAcquireNextImage != null) {
                    long timestamp = imageAcquireNextImage.getTimestamp();
                    TotalCaptureResult[] totalCaptureResultArr = urh0.this.f180621d0;
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
                    urh0.this.m197562V1(imageAcquireNextImage, totalCaptureResult);
                } else {
                    urh0.this.m197560U1(new Exception("no image data"), -1000);
                }
            }
            if (imageAcquireNextImage != null) {
                imageAcquireNextImage.close();
            }
        }
    }

    /* JADX INFO: renamed from: l.urh0$g */
    public class C20644g implements ImageReader.OnImageAvailableListener {
        public C20644g() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Image imageAcquireNextImage = imageReader.acquireNextImage();
            urh0 urh0Var = urh0.this;
            if (imageAcquireNextImage == null) {
                urh0Var.m197560U1(new Exception("no image data"), -1000);
                return;
            }
            urh0Var.m197562V1(imageAcquireNextImage, imageAcquireNextImage.getFormat() != 256 ? urh0.this.f180622e0 : null);
            urh0.this.f180622e0 = null;
            imageAcquireNextImage.close();
        }
    }

    /* JADX INFO: renamed from: l.urh0$h */
    public class C20645h extends CameraCaptureSession.CaptureCallback {
        public C20645h() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull Surface surface, long j) {
            urh0.this.f180634q0.open();
            C13504g.m81998b("TEImage2Mode", "set flash request abort");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            urh0.this.f180634q0.open();
            C13504g.m82001e("TEImage2Mode", "onCaptureCompleted");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            urh0.this.f180634q0.open();
            C13504g.m81998b("TEImage2Mode", "set flash failed");
        }
    }

    /* JADX INFO: renamed from: l.urh0$i */
    public class HandlerC20646i extends Handler {
        public HandlerC20646i(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            super.dispatchMessage(message);
            C13504g.m82001e("TEImage2Mode", "dispatch msg = " + message.what);
            switch (message.what) {
                case 1000:
                case 1001:
                    urh0.this.m197552Q1();
                    break;
                case 1002:
                    urh0.this.m197564W1();
                    break;
                case 1003:
                    urh0.this.m197560U1((Exception) message.obj, -1000);
                    break;
                case 1004:
                    urh0 urh0Var = urh0.this;
                    urh0Var.m81984v0(((TECameraModeBase) urh0Var).f56380c);
                    break;
                case 1005:
                    urh0.this.m197596N1();
                    break;
                case 1006:
                case 1007:
                    urh0.this.m197548O1();
                    break;
            }
        }
    }

    public urh0(C13486b c13486b, Context context, CameraManager cameraManager, Handler handler) {
        super(c13486b, context, handler);
        this.f180615X = 0L;
        this.f180617Z = new Handler(Looper.getMainLooper());
        this.f180619b0 = null;
        this.f180620c0 = -1;
        this.f180622e0 = null;
        this.f180623f0 = false;
        this.f180624g0 = null;
        this.f180625h0 = 0;
        this.f180627j0 = false;
        this.f180628k0 = false;
        this.f180629l0 = false;
        this.f180630m0 = false;
        this.f180631n0 = 0;
        this.f180632o0 = 0;
        this.f180633p0 = 0L;
        this.f180634q0 = null;
        this.f180635r0 = -1;
        this.f180636s0 = 0;
        this.f180637t0 = 0;
        this.f180638u0 = 0L;
        this.f56382e = cameraManager;
        if (this.f56385h.f56199m) {
            this.f56386i = new wrh0(this);
        } else {
            this.f56386i = new vrh0(this);
        }
        this.f180616Y = new HandlerC20646i(handler.getLooper());
        m197558T1();
    }

    /* JADX INFO: renamed from: I1 */
    public static /* synthetic */ int m197537I1(urh0 urh0Var) {
        int i = urh0Var.f180637t0;
        urh0Var.f180637t0 = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ int m197540K0(urh0 urh0Var) {
        int i = urh0Var.f180631n0;
        urh0Var.f180631n0 = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: K1 */
    private void m197541K1() {
        CameraCharacteristics cameraCharacteristics;
        if (this.f56385h.f56174Z && (cameraCharacteristics = this.f56378a) != null) {
            Range<Integer> rangeM197554R1 = m197554R1((Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
            CaptureRequest.Builder builder = this.f56380c;
            if (builder != null && rangeM197554R1 != null) {
                builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeM197554R1);
                m81984v0(this.f56380c);
                C13504g.m82001e("TEImage2Mode", "apply capture scene: " + rangeM197554R1);
            }
        }
        m197545M1();
    }

    /* JADX INFO: renamed from: L1 */
    private void m197543L1() {
        CameraCharacteristics cameraCharacteristics;
        if (this.f56385h.f56174Z && (cameraCharacteristics = this.f56378a) != null) {
            Range<Integer> rangeM197556S1 = m197556S1((Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
            CaptureRequest.Builder builder = this.f56380c;
            if (builder != null && rangeM197556S1 != null) {
                builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeM197556S1);
                m81984v0(this.f56380c);
                C13504g.m82001e("TEImage2Mode", "apply record scene: " + rangeM197556S1);
            }
        }
        m197550P1();
    }

    /* JADX INFO: renamed from: M1 */
    private void m197545M1() {
        Surface surface;
        ImageReader imageReader = this.f180619b0;
        if (imageReader == null || (surface = imageReader.getSurface()) == null || !surface.isValid()) {
            return;
        }
        CaptureRequest.Builder builder = this.f56380c;
        if (builder != null) {
            try {
                builder.removeTarget(surface);
                this.f56380c.addTarget(surface);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        m81984v0(this.f56380c);
    }

    /* JADX INFO: renamed from: O0 */
    public static /* synthetic */ int m197547O0(urh0 urh0Var) {
        int i = urh0Var.f180620c0;
        urh0Var.f180620c0 = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O1 */
    public void m197548O1() {
        this.f180633p0 = System.currentTimeMillis();
        this.f180625h0 = 0;
        CaptureRequest.Builder builderM81978s = m81978s(2);
        if (builderM81978s == null) {
            m197560U1(new Exception("capture build is null"), -1001);
            return;
        }
        ImageReader imageReader = this.f180618a0;
        if (imageReader == null) {
            m197560U1(new Exception("image reader is null"), -1001);
            return;
        }
        builderM81978s.addTarget(imageReader.getSurface());
        m197570a2(builderM81978s);
        TECameraModeBase.C13503f c13503fM81965l = m81965l(builderM81978s, new C20640c(), this.f56388k);
        if (c13503fM81965l.m81996c()) {
            return;
        }
        m197560U1(c13503fM81965l.m81995b(), -1001);
    }

    /* JADX INFO: renamed from: P1 */
    private void m197550P1() {
        Surface surface;
        ImageReader imageReader = this.f180619b0;
        if (imageReader == null || (surface = imageReader.getSurface()) == null || !surface.isValid()) {
            return;
        }
        CaptureRequest.Builder builder = this.f56380c;
        if (builder != null) {
            try {
                builder.removeTarget(surface);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        m81984v0(this.f56380c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q1 */
    public void m197552Q1() {
        this.f180633p0 = System.currentTimeMillis();
        this.f180625h0 = 0;
        CaptureRequest.Builder builderM81978s = m81978s(2);
        if (builderM81978s == null) {
            m197560U1(new Exception("capture build is null"), -1001);
            return;
        }
        ImageReader imageReader = this.f180618a0;
        if (imageReader == null) {
            m197560U1(new Exception("image reader is null"), -1001);
            return;
        }
        builderM81978s.addTarget(imageReader.getSurface());
        m197570a2(builderM81978s);
        TECameraModeBase.C13503f c13503fM81965l = m81965l(builderM81978s, new C20641d(), null);
        if (c13503fM81965l.m81996c()) {
            return;
        }
        m197560U1(c13503fM81965l.m81995b(), -1001);
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ TECameraSettings.InterfaceC13465c m197553R0(urh0 urh0Var) {
        urh0Var.getClass();
        return null;
    }

    /* JADX INFO: renamed from: R1 */
    private Range<Integer> m197554R1(Range<Integer>[] rangeArr) {
        int i;
        int i2;
        Range<Integer> range = null;
        if (rangeArr != null) {
            TECameraSettings tECameraSettings = this.f56385h;
            if (tECameraSettings == null || (i = tECameraSettings.f56173Y) < 30) {
                i = 30;
            }
            int i3 = 0;
            int i4 = 0;
            for (Range<Integer> range2 : rangeArr) {
                C13504g.m81997a("TEImage2Mode", "fps: " + range2.toString());
                int iIntValue = ((Integer) range2.getUpper()).intValue();
                int iIntValue2 = ((Integer) range2.getLower()).intValue();
                if (iIntValue2 < 5) {
                    C13504g.m82001e("TEImage2Mode", "discard fps: " + range2.toString());
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
                hrh0.m136853b("te_record_camera_max_fps", i3);
            }
        }
        return range;
    }

    /* JADX INFO: renamed from: S1 */
    private Range<Integer> m197556S1(Range<Integer>[] rangeArr) {
        int i;
        Range<Integer> range = null;
        if (rangeArr != null) {
            TECameraSettings tECameraSettings = this.f56385h;
            int i2 = 30;
            if (tECameraSettings != null && (i = tECameraSettings.f56173Y) >= 30) {
                i2 = i;
            }
            int i3 = 0;
            int i4 = 0;
            for (Range<Integer> range2 : rangeArr) {
                C13504g.m81997a("TEImage2Mode", "fps: " + range2.toString());
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
    private void m197558T1() {
        this.f56377W = new C20638a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U1 */
    public void m197560U1(Exception exc, int i) {
        this.f180625h0 = 0;
        C13504g.m82006j("TEImage2Mode", "onCaptureFailed, err = " + exc + ", errCode = " + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V1 */
    public void m197562V1(Image image, TotalCaptureResult totalCaptureResult) {
        C13504g.m82001e("TEImage2Mode", "on image available, consume: " + (System.currentTimeMillis() - this.f180633p0) + ", size: " + image.getWidth() + BaseSei.f14624X + image.getHeight() + ", format: " + image.getFormat() + ", rotation: " + (this.f180626i0 == 1 ? 270 : 90));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W1 */
    public void m197564W1() {
        TECameraSettings tECameraSettings = this.f56385h;
        if (tECameraSettings.f56181d != 0) {
            return;
        }
        CaptureRequest.Builder builder = this.f56380c;
        if (builder == null) {
            C13504g.m81998b("TEImage2Mode", "resetPreviewAfterFlashCapture failed, no builder");
            return;
        }
        int i = tECameraSettings.f56186f0;
        if (i == 3) {
            if (this.f56366L) {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 3);
                this.f56380c.set(CaptureRequest.FLASH_MODE, 1);
            }
        } else if (i == 2 && this.f180627j0) {
            builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            m81965l(this.f56380c, null, null);
        }
        if (this.f180627j0) {
            this.f56380c.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        }
        this.f56380c.set(CaptureRequest.CONTROL_AF_MODE, 4);
        this.f56380c.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
        m81984v0(this.f56380c);
    }

    /* JADX INFO: renamed from: X1 */
    private TEFrameSizei m197566X1(int i, int i2, int i3, int i4) {
        TECameraSettings tECameraSettings = this.f56385h;
        if (tECameraSettings.f56149A) {
            tECameraSettings.f56149A = false;
            return tECameraSettings.f56209r;
        }
        if (this.f56389l == null) {
            this.f56389l = (StreamConfigurationMap) this.f56378a.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        }
        StreamConfigurationMap streamConfigurationMap = this.f56389l;
        TEFrameSizei tEFrameSizeiMo81686a = null;
        if (streamConfigurationMap == null) {
            C13504g.m81998b("TEImage2Mode", "no stream configuration map...");
            return null;
        }
        if (!streamConfigurationMap.isOutputSupportedFor(i)) {
            C13504g.m81998b("TEImage2Mode", "Output format is not supported");
            return null;
        }
        Size[] outputSizes = this.f56389l.getOutputSizes(i);
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            arrayList.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        TECameraSettings tECameraSettings2 = this.f56385h;
        if (tECameraSettings2.f56225z) {
            return C13496f.m81896o(arrayList, tECameraSettings2.m81687a(), i4, this.f56385h.f56223y);
        }
        if (this.f56398u != null) {
            if (!StreamConfigurationMap.isOutputSupportedFor(SurfaceTexture.class)) {
                C13504g.m81998b("TEImage2Mode", "Output SurfaceTexture is not supported");
                return null;
            }
            Size[] outputSizes2 = this.f56389l.getOutputSizes(SurfaceTexture.class);
            ArrayList arrayList2 = new ArrayList();
            for (Size size2 : outputSizes2) {
                arrayList2.add(new TEFrameSizei(size2.getWidth(), size2.getHeight()));
            }
            try {
                tEFrameSizeiMo81686a = this.f56398u.mo81686a(arrayList, arrayList2);
            } catch (Exception e) {
                C13504g.m81998b("TEImage2Mode", "select pic size from client err: " + e.getMessage());
            }
        }
        if (tEFrameSizeiMo81686a != null) {
            return tEFrameSizeiMo81686a;
        }
        TEFrameSizei tEFrameSizeiM81897p = C13496f.m81897p(arrayList, this.f56385h.m81687a(), new TEFrameSizei(i2, i3));
        C13504g.m82001e("TEImage2Mode", "select pic size is null, get closest size: " + tEFrameSizeiM81897p);
        return tEFrameSizeiM81897p;
    }

    /* JADX INFO: renamed from: a2 */
    private void m197570a2(CaptureRequest.Builder builder) {
        if (builder == null) {
            C13504g.m81998b("TEImage2Mode", "syncPreviewParam failed, no capture builder");
            return;
        }
        CaptureRequest.Builder builder2 = this.f56380c;
        if (builder2 == null) {
            C13504g.m81998b("TEImage2Mode", "syncPreviewParam failed, no preview builder");
            return;
        }
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
        Integer num = (Integer) builder2.get(key);
        if (num != null) {
            builder.set(key, num);
            C13504g.m81997a("TEImage2Mode", "sync afMode: " + num);
        }
        CaptureRequest.Builder builder3 = this.f56380c;
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_REGIONS;
        MeteringRectangle[] meteringRectangleArr = (MeteringRectangle[]) builder3.get(key2);
        if (meteringRectangleArr != null) {
            builder.set(key2, meteringRectangleArr);
            C13504g.m81997a("TEImage2Mode", "sync aeRect: " + Arrays.toString(meteringRectangleArr));
        }
        CaptureRequest.Builder builder4 = this.f56380c;
        CaptureRequest.Key key3 = CaptureRequest.CONTROL_AF_REGIONS;
        MeteringRectangle[] meteringRectangleArr2 = (MeteringRectangle[]) builder4.get(key3);
        if (meteringRectangleArr != null) {
            builder.set(key3, meteringRectangleArr2);
            C13504g.m81997a("TEImage2Mode", "sync afRect: " + Arrays.toString(meteringRectangleArr2));
        }
        m197597Y1(this.f56380c, builder);
        CaptureRequest.Builder builder5 = this.f56380c;
        CaptureRequest.Key key4 = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
        Range range = (Range) builder5.get(key4);
        if (range != null) {
            builder.set(key4, range);
            C13504g.m81997a("TEImage2Mode", "sync fpsRange: " + range);
        }
        Rect rect = this.f56397t;
        if (rect != null) {
            builder.set(CaptureRequest.SCALER_CROP_REGION, rect);
            C13504g.m81997a("TEImage2Mode", "sync crop region: " + this.f56397t);
        }
        crh0 crh0Var = this.f56379b;
        if (crh0Var != null) {
            crh0Var.m112052a(this.f56378a, builder, false);
        }
        builder.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f56396s));
    }

    @Override // com.p074ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: B */
    public int[] mo81921B() {
        ImageReader imageReader = this.f180618a0;
        if (imageReader == null) {
            return null;
        }
        int width = imageReader.getWidth();
        int height = this.f180618a0.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        return new int[]{width, height};
    }

    @Override // com.p074ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: E */
    public int mo81924E() {
        return 4;
    }

    @Override // com.p074ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: G */
    public int mo81926G() {
        return this.f180635r0;
    }

    @Override // com.p074ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: K */
    public int[] mo81930K() {
        ImageReader imageReader = this.f180618a0;
        if (imageReader == null) {
            return null;
        }
        return new int[]{imageReader.getWidth(), this.f180618a0.getHeight()};
    }

    /* JADX INFO: renamed from: N1 */
    public void m197596N1() {
        CaptureRequest.Builder builder = this.f56380c;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
        Integer num = (Integer) builder.get(key);
        if (num == null || num.intValue() != 1) {
            return;
        }
        C13504g.m82001e("TEImage2Mode", "need cancel af trigger");
        this.f56380c.set(key, 2);
        m81965l(this.f56380c, null, null);
        this.f56380c.set(key, 0);
        m81984v0(this.f56380c);
    }

    @Override // com.p074ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: P */
    public int mo81935P(String str, int i) throws CameraAccessException {
        this.f180636s0 = 0;
        this.f180624g0 = null;
        if (this.f180635r0 == -1) {
            this.f180635r0 = 0;
        }
        return super.mo81935P(str, i);
    }

    /* JADX INFO: renamed from: Y1 */
    public void m197597Y1(CaptureRequest.Builder builder, CaptureRequest.Builder builder2) {
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
    public void m197598Z1(int i, int i2) {
        boolean z;
        Size size;
        TECameraSettings tECameraSettings = this.f56385h;
        int i3 = 256;
        int i4 = (tECameraSettings.f56208q0 || tECameraSettings.f56189h) ? 35 : 256;
        TEFrameSizei tEFrameSizeiM197566X1 = m197566X1(i4, i, i2, tECameraSettings.f56215u);
        if (tEFrameSizeiM197566X1 == null) {
            C13504g.m81998b("TEImage2Mode", "select picture size failed...format: " + i4);
            return;
        }
        TECameraSettings tECameraSettings2 = this.f56385h;
        tECameraSettings2.f56209r = tEFrameSizeiM197566X1;
        int width = tEFrameSizeiM197566X1.width;
        int height = tEFrameSizeiM197566X1.height;
        int i5 = 0;
        if (tECameraSettings2.f56189h && width <= 4096 && i4 == 35) {
            this.f180621d0 = new TotalCaptureResult[5];
            ImageReader imageReaderNewInstance = ImageReader.newInstance(width, height, i4, 3);
            this.f180619b0 = imageReaderNewInstance;
            imageReaderNewInstance.setOnImageAvailableListener(new C20643f(), this.f180617Z);
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Size[] outputSizes = this.f56389l.getOutputSizes(256);
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
                this.f180621d0 = null;
                this.f180619b0.setOnImageAvailableListener(null, null);
                this.f180619b0.close();
                this.f180619b0 = null;
                i3 = i4;
            } else {
                width = size.getWidth();
                height = size.getHeight();
            }
        } else {
            i3 = i4;
        }
        this.f180618a0 = ImageReader.newInstance(width, height, i3, 1);
        C13504g.m82001e("TEImage2Mode", "image reader width: " + this.f180618a0.getWidth() + ", height = " + this.f180618a0.getHeight() + ", format: " + i3 + ", maxWidth: " + this.f56385h.f56215u + ", hasZslYuvSurface: " + z);
        this.f180618a0.setOnImageAvailableListener(new C20644g(), this.f180617Z);
    }

    /* JADX INFO: renamed from: b2 */
    public void m197599b2(int i) {
        C13504g.m82001e("TEImage2Mode", "updateFlashModeParam: " + i);
        this.f180635r0 = i;
        CaptureRequest.Builder builder = this.f56380c;
        if (builder == null) {
            C13504g.m81998b("TEImage2Mode", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: mCaptureRequestBuilder is null");
            this.f56383f.mo81678c(this.f56385h.f56177b, -100, "switchFlashMode : CaptureRequest.Builder is null", this.f56387j);
            return;
        }
        CaptureRequest.Key key = CaptureRequest.FLASH_MODE;
        Integer num = (Integer) builder.get(key);
        int iIntValue = num == null ? 0 : num.intValue();
        if (i == 1) {
            if (this.f56385h.f56181d == 1) {
                C13504g.m81998b("TEImage2Mode", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -416. Reason: not support torch");
                C13504g.m82006j("TEImage2Mode", "flash on is not supported in front camera!");
                return;
            } else {
                this.f56380c.set(CaptureRequest.CONTROL_AE_MODE, 3);
                this.f56380c.set(key, 1);
                this.f56366L = true;
                return;
            }
        }
        if (i == 0) {
            this.f56366L = false;
            if (iIntValue == 0) {
                C13504g.m82001e("TEImage2Mode", "switchFlashMode flashStatus == FLASH_MODE_OFF");
                return;
            } else {
                this.f56380c.set(CaptureRequest.CONTROL_AE_MODE, 1);
                this.f56380c.set(key, 0);
                return;
            }
        }
        if (i == 2) {
            this.f56366L = false;
            if (iIntValue == 2) {
                C13504g.m82001e("TEImage2Mode", "switchFlashMode flashStatus == FLASH_MODE_TORCH");
                return;
            } else {
                this.f56380c.set(CaptureRequest.CONTROL_AE_MODE, 1);
                this.f56380c.set(key, 2);
                return;
            }
        }
        C13504g.m81998b("TEImage2Mode", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -416. Reason: not support flash mode " + i);
        C13504g.m81998b("TEImage2Mode", "not support flash mode: " + i);
    }

    @Override // p153l.o6m
    /* JADX INFO: renamed from: c */
    public void mo136976c(int i) {
        TECameraModeBase.C13503f c13503fM81984v0;
        if (this.f56380c == null) {
            C13504g.m81998b("TEImage2Mode", "switchFlashMode failed, mode: " + i);
            return;
        }
        int i2 = this.f180635r0;
        boolean z = (i2 == -1 || i2 == 0 || i != 0) ? false : true;
        m197599b2(i);
        if (z) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.f180634q0 == null) {
                this.f180634q0 = new ConditionVariable();
            }
            this.f180634q0.close();
            c13503fM81984v0 = m81988x0(this.f56380c, new C20645h(), this.f180617Z);
            if (!this.f180634q0.block(33L)) {
                C13504g.m82001e("TEImage2Mode", "close flash: " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
            }
            m81984v0(this.f56380c);
        } else {
            c13503fM81984v0 = m81984v0(this.f56380c);
        }
        if (c13503fM81984v0.m81996c()) {
            return;
        }
        C13504g.m81998b("TEImage2Mode", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: " + c13503fM81984v0.m81994a());
        this.f56383f.mo81680e(-100, -100, c13503fM81984v0.m81994a(), this.f56387j);
    }

    @Override // com.p074ss.android.ttvecamera.framework.TECameraModeBase, p153l.p6m.InterfaceC19309a
    /* JADX INFO: renamed from: d */
    public int mo81950d() {
        CaptureRequest.Builder builder = this.f56380c;
        if (builder == null) {
            this.f56383f.mo81678c(this.f56385h.f56177b, -100, "rollbackMeteringSessionRequest : param is null.", this.f56387j);
            return -100;
        }
        builder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
        return super.mo81950d();
    }

    @Override // com.p074ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: f0 */
    public int mo81955f0(int i, int i2) {
        TECameraSettings tECameraSettings = this.f56385h;
        tECameraSettings.f56149A = true;
        TEFrameSizei tEFrameSizei = tECameraSettings.f56209r;
        tEFrameSizei.width = i;
        tEFrameSizei.height = i2;
        mo81974q();
        try {
            return mo81967m0();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override // com.p074ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: i0 */
    public void mo81960i0(int i) {
        this.f180636s0 = i;
        C13504g.m82001e("TEImage2Mode", "setSceneMode: " + i);
        if (i == 0) {
            m197541K1();
        } else if (i == 1) {
            m197543L1();
        } else {
            wg3.m206174a("un support scene");
        }
    }

    @Override // com.p074ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: m0 */
    public int mo81967m0() throws Exception {
        dsh0.m117758a("TEImage2Mode-startPreview");
        this.f56366L = false;
        Float f = (Float) this.f56378a.get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        int iIntValue = f == null ? 0 : f.intValue();
        C13504g.m81997a("TEImage2Mode", "lensInfoMinFocusDistance = " + iIntValue);
        boolean z = true;
        this.f180627j0 = iIntValue != 0;
        jrh0 jrh0VarM81828K = this.f56384g.m81828K();
        if (this.f56387j == null || jrh0VarM81828K == null) {
            C13504g.m81998b("TEImage2Mode", "CameraDevice or ProviderManager is null!");
            return -100;
        }
        if (this.f56385h.f56206p0) {
            if (jrh0VarM81828K.m146742f() != null) {
                jrh0VarM81828K.m146742f().mo99916l();
                C13504g.m82001e("TEImage2Mode", "reallocate st...");
            } else {
                C13504g.m81998b("TEImage2Mode", "reallocate st...err");
            }
        }
        int iM81937R = super.m81937R();
        if (iM81937R != 0) {
            return iM81937R;
        }
        TEFrameSizei tEFrameSizei = this.f56385h.f56209r;
        m197598Z1(tEFrameSizei.width, tEFrameSizei.height);
        CaptureRequest.Builder builderCreateCaptureRequest = this.f56387j.createCaptureRequest(1);
        this.f56380c = builderCreateCaptureRequest;
        Rect rect = this.f56397t;
        if (rect != null) {
            builderCreateCaptureRequest.set(CaptureRequest.SCALER_CROP_REGION, rect);
        }
        ArrayList arrayList = new ArrayList();
        if (jrh0VarM81828K.m146742f().mo99913g() == 8) {
            arrayList.addAll(Arrays.asList(jrh0VarM81828K.m146741e()));
        } else {
            arrayList.add(jrh0VarM81828K.m146740d());
        }
        ImageReader imageReader = this.f180619b0;
        if (imageReader != null) {
            arrayList.add(imageReader.getSurface());
        }
        Iterator<Surface> it = arrayList.iterator();
        while (it.hasNext()) {
            this.f56380c.addTarget(it.next());
        }
        ImageReader imageReader2 = this.f180618a0;
        if (imageReader2 != null) {
            arrayList.add(imageReader2.getSurface());
        }
        this.f56380c.set(CaptureRequest.CONTROL_AF_MODE, 4);
        TECameraSettings tECameraSettings = this.f56385h;
        if (tECameraSettings.f56174Z) {
            if (Build.VERSION.SDK_INT >= 28) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                CameraCharacteristics cameraCharacteristics = this.f56378a;
                if (cameraCharacteristics != null && this.f180624g0 == null) {
                    this.f180624g0 = cameraCharacteristics.getAvailableSessionKeys();
                }
                List<CaptureRequest.Key<?>> list = this.f180624g0;
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
                        this.f56385h.f56174Z = false;
                        break;
                    }
                }
                C13504g.m82001e("TEImage2Mode", "check aeTargetFpsRange is session key: " + z + ", consume: " + (System.currentTimeMillis() - jCurrentTimeMillis));
            } else {
                tECameraSettings.f56174Z = false;
            }
        }
        this.f180638u0 = 0L;
        this.f180637t0 = 0;
        this.f180631n0 = 0;
        this.f180620c0 = -1;
        int i = this.f56385h.f56172X;
        this.f180632o0 = i;
        if (i > 0) {
            C13504g.m82001e("TEImage2Mode", "release camera metadata threshold: " + this.f180632o0);
        }
        this.f180630m0 = false;
        this.f180625h0 = 0;
        this.f56362H = System.currentTimeMillis();
        Handler handlerM81923D = this.f56385h.f56195k ? m81923D() : this.f56388k;
        this.f56381d = null;
        mo81980t(arrayList, this.f56376V, handlerM81923D);
        if (this.f56381d == null) {
            m81992z0();
        }
        dsh0.m117759b();
        return 0;
    }

    @Override // com.p074ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: o */
    public void mo81970o(hj3 hj3Var, int i, TECameraSettings.InterfaceC13465c interfaceC13465c) {
        int i2;
        int i3;
        int i4 = hj3Var.f110152c;
        if ((i4 != 0 && i4 != this.f180618a0.getWidth()) || ((i2 = hj3Var.f110153d) != 0 && i2 != this.f180618a0.getHeight())) {
            C13504g.m81998b("TEImage2Mode", "restart preview for burst capture");
            this.f56385h.f56195k = true;
            mo81955f0(hj3Var.f110152c, hj3Var.f110153d);
        }
        this.f180626i0 = i;
        this.f180633p0 = System.currentTimeMillis();
        int width = this.f180618a0.getWidth();
        int height = this.f180618a0.getHeight();
        List<Integer> list = hj3Var.f110151b;
        C20639b c20639b = new C20639b(width, height);
        int i5 = hj3Var.f110150a;
        if (i5 == 1) {
            ArrayList arrayList = new ArrayList(list.size());
            for (Integer num : list) {
                CaptureRequest.Builder builderM81978s = m81978s(2);
                m197570a2(builderM81978s);
                builderM81978s.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, num);
                builderM81978s.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.TRUE);
                builderM81978s.addTarget(this.f180618a0.getSurface());
                arrayList.add(builderM81978s.build());
            }
            m81968n(arrayList, c20639b, null);
            return;
        }
        if (i5 == 0) {
            if (hj3Var.f110155f) {
                m81975q0();
            }
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                Integer num2 = list.get(i6);
                CaptureRequest.Builder builderM81978s2 = m81978s(2);
                m197570a2(builderM81978s2);
                builderM81978s2.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, num2);
                builderM81978s2.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.TRUE);
                builderM81978s2.addTarget(this.f180618a0.getSurface());
                m81966m(builderM81978s2.build(), c20639b, null);
                if (i6 > 0 && i6 < size - 1 && (i3 = hj3Var.f110154e) > 0) {
                    try {
                        Thread.sleep(i3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (hj3Var.f110155f) {
                m81984v0(this.f56380c);
            }
        }
    }

    @Override // com.p074ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: q */
    public void mo81974q() {
        this.f180625h0 = 0;
        this.f180616Y.removeCallbacksAndMessages(null);
        Handler handler = this.f56358D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f180615X = 0L;
        this.f180629l0 = false;
        this.f180631n0 = 0;
        this.f180635r0 = -1;
        this.f180622e0 = null;
        this.f56366L = false;
        ImageReader imageReader = this.f180618a0;
        if (imageReader != null) {
            imageReader.close();
            this.f180618a0 = null;
        }
        ImageReader imageReader2 = this.f180619b0;
        if (imageReader2 != null) {
            imageReader2.close();
            this.f180619b0 = null;
        }
        this.f180621d0 = null;
        this.f56380c = null;
        super.mo81974q();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0064  */
    @Override // com.p074ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: r */
    public Range<Integer> mo81976r(Range<Integer> range) {
        Range<Integer> range2;
        CameraCharacteristics cameraCharacteristics = this.f56378a;
        if (cameraCharacteristics != null && range != null && this.f56385h.f56220w0) {
            Range<Integer>[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            if (rangeArr == null) {
                return range;
            }
            Range<Integer> rangeM197556S1 = null;
            if (this.f56400w != null) {
                ArrayList arrayList = new ArrayList(rangeArr.length);
                for (Range<Integer> range3 : rangeArr) {
                    arrayList.add(new int[]{((Integer) range3.getLower()).intValue(), ((Integer) range3.getUpper()).intValue()});
                }
                int[] iArrMo81685a = this.f56400w.mo81685a(arrayList);
                if (iArrMo81685a != null) {
                    range2 = new Range<>(Integer.valueOf(iArrMo81685a[0]), Integer.valueOf(iArrMo81685a[1]));
                } else {
                    range2 = null;
                }
            } else {
                range2 = null;
            }
            if (range2 != null) {
                C13504g.m82001e("TEImage2Mode", "select fps from user callback: " + range2);
                return range2;
            }
            if (this.f56385h.f56163O == 4) {
                Range<Integer> range4 = new Range<>(Integer.valueOf(this.f56385h.f56179c.min), Integer.valueOf(this.f56385h.f56179c.max));
                for (Range<Integer> range5 : rangeArr) {
                    if (range4.equals(range5)) {
                        range2 = range4;
                        break;
                    }
                }
            }
            if (range2 != null) {
                C13504g.m82001e("TEImage2Mode", "select fps from user direct set: " + range2);
                return range2;
            }
            int i = this.f180636s0;
            if (i == 0) {
                rangeM197556S1 = m197554R1(rangeArr);
            } else if (i == 1) {
                rangeM197556S1 = m197556S1(rangeArr);
            }
            if (rangeM197556S1 != null) {
                range2 = rangeM197556S1;
            }
            if (range2 != null) {
                range = range2;
            }
            C13504g.m82001e("TEImage2Mode", "select fps: " + range);
        }
        return range;
    }

    @Override // com.p074ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: r0 */
    public void mo81977r0(int i, int i2, TECameraSettings.InterfaceC13474l interfaceC13474l) {
        mo81979s0(interfaceC13474l, this.f56385h.f56181d);
    }

    @Override // com.p074ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: s0 */
    public void mo81979s0(TECameraSettings.InterfaceC13474l interfaceC13474l, int i) {
        super.mo81979s0(interfaceC13474l, i);
        this.f180626i0 = i;
        this.f180629l0 = false;
        this.f180633p0 = System.currentTimeMillis();
        if (this.f180619b0 != null && !this.f56366L) {
            this.f180625h0 = 1;
            this.f180623f0 = true;
            C13504g.m82001e("TEImage2Mode", "takePicture...use zsl buffer");
            return;
        }
        C13504g.m82001e("TEImage2Mode", "takePicture...flash strategy: " + this.f56385h.f56186f0);
        boolean z = this.f56366L;
        long j = z ? 1600L : 800L;
        TECameraSettings tECameraSettings = this.f56385h;
        if (tECameraSettings.f56181d != 0) {
            this.f180625h0 = 1;
            m197552Q1();
            return;
        }
        int i2 = tECameraSettings.f56186f0;
        if (i2 == 3) {
            if (!z) {
                m197552Q1();
                return;
            }
            this.f180615X = System.currentTimeMillis();
            this.f180625h0 = 2;
            this.f180616Y.sendEmptyMessageDelayed(1001, j);
            this.f56380c.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.f56380c.set(CaptureRequest.FLASH_MODE, 2);
            if (!this.f180627j0) {
                this.f180616Y.sendEmptyMessageDelayed(1000, 300L);
                return;
            }
            this.f56380c.set(CaptureRequest.CONTROL_AF_MODE, 1);
            CaptureRequest.Builder builder = this.f56380c;
            CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
            builder.set(key, 1);
            this.f56380c.setTag("CAPTURE_REQUEST_TAG_FOR_SHOT");
            m81963k(this.f56380c);
            this.f56380c.setTag(null);
            this.f56380c.set(key, 0);
            this.f56380c.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
            m81984v0(this.f56380c);
            TECameraModeBase.C13503f c13503fM81984v0 = m81984v0(this.f56380c);
            if (c13503fM81984v0.m81996c()) {
                return;
            }
            HandlerC20646i handlerC20646i = this.f180616Y;
            handlerC20646i.sendMessage(handlerC20646i.obtainMessage(1003, c13503fM81984v0.m81995b()));
            return;
        }
        if (i2 == 2) {
            if (!z && this.f180630m0) {
                C13504g.m82001e("TEImage2Mode", "af converge, do capture...");
                m197552Q1();
                return;
            }
            this.f180615X = System.currentTimeMillis();
            this.f180625h0 = 2;
            this.f180616Y.sendEmptyMessageDelayed(1001, j);
            if (this.f180627j0) {
                this.f56380c.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            }
            CaptureRequest.Builder builder2 = this.f56380c;
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
            builder2.set(key2, 1);
            this.f56380c.setTag("CAPTURE_REQUEST_TAG_FOR_SHOT");
            m81963k(this.f56380c);
            this.f56380c.setTag(null);
            this.f56380c.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
            this.f56380c.set(key2, 0);
            TECameraModeBase.C13503f c13503fM81984v1 = m81984v0(this.f56380c);
            if (c13503fM81984v1.m81996c()) {
                return;
            }
            HandlerC20646i handlerC20646i2 = this.f180616Y;
            handlerC20646i2.sendMessage(handlerC20646i2.obtainMessage(1003, c13503fM81984v1.m81995b()));
            return;
        }
        if (i2 != 0) {
            if (i2 != 1) {
                this.f180625h0 = 1;
                m197552Q1();
                return;
            }
            this.f180625h0 = 1;
            if (z) {
                this.f56380c.set(CaptureRequest.CONTROL_AE_MODE, 1);
                this.f56380c.set(CaptureRequest.FLASH_MODE, 2);
            }
            m197548O1();
            return;
        }
        if (!z && this.f180630m0) {
            C13504g.m82001e("TEImage2Mode", "af converge, do capture...");
            m197548O1();
            return;
        }
        this.f180615X = System.currentTimeMillis();
        this.f180625h0 = 1;
        this.f180616Y.sendEmptyMessageDelayed(1007, j);
        if (this.f180627j0) {
            this.f56380c.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        }
        this.f56380c.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        TECameraModeBase.C13503f c13503fM81965l = m81965l(this.f56380c, this.f56377W, this.f56388k);
        if (c13503fM81965l.m81996c()) {
            return;
        }
        HandlerC20646i handlerC20646i3 = this.f180616Y;
        handlerC20646i3.sendMessage(handlerC20646i3.obtainMessage(1003, c13503fM81965l.m81995b()));
    }

    @Override // com.p074ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: t */
    public void mo81980t(List<Surface> list, CameraCaptureSession.StateCallback stateCallback, Handler handler) throws CameraAccessException {
        dsh0.m117758a("TEImage2Mode-createSession");
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList arrayList = new ArrayList();
            Iterator<Surface> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new OutputConfiguration(it.next()));
            }
            trh0.m192500a();
            SessionConfiguration sessionConfigurationM187617a = srh0.m187617a(m81932M(list), arrayList, new ExecutorC20642e(handler), stateCallback);
            this.f56380c.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, mo81976r(new Range<>(Integer.valueOf(this.f56356B.min / this.f56385h.f56179c.fpsUnitFactor), Integer.valueOf(this.f56356B.max / this.f56385h.f56179c.fpsUnitFactor))));
            m197599b2(this.f180635r0);
            sessionConfigurationM187617a.setSessionParameters(this.f56380c.build());
            C13504g.m82001e("TEImage2Mode", "createSession by sessionConfiguration");
            this.f56387j.createCaptureSession(sessionConfigurationM187617a);
        } else {
            C13504g.m82001e("TEImage2Mode", "createSession by normally");
            this.f56387j.createCaptureSession(list, stateCallback, handler);
        }
        dsh0.m117759b();
    }

    @Override // com.p074ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: t0 */
    public int mo81981t0(boolean z) {
        mo136976c(z ? 2 : 0);
        return 0;
    }

    @Override // com.p074ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: u0 */
    public int mo81983u0() throws CameraAccessException {
        m197599b2(this.f180635r0);
        return super.mo81983u0();
    }

    @Override // com.p074ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: z */
    public int mo81991z(TEFocusSettings tEFocusSettings) {
        if (this.f180625h0 == 0) {
            return super.mo81991z(tEFocusSettings);
        }
        C13504g.m81998b("TEImage2Mode", "focus action discard, state = " + this.f180625h0);
        return -108;
    }
}
