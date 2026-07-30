package p149l;

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
import com.p069ss.android.ttvecamera.C13323b;
import com.p069ss.android.ttvecamera.C13333f;
import com.p069ss.android.ttvecamera.C13341g;
import com.p069ss.android.ttvecamera.TECameraSettings;
import com.p069ss.android.ttvecamera.TEFocusSettings;
import com.p069ss.android.ttvecamera.TEFrameSizei;
import com.p069ss.android.ttvecamera.framework.TECameraModeBase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes11.dex */
@TargetApi(21)
public class njh0 extends TECameraModeBase {

    /* JADX INFO: renamed from: X */
    private long f139237X;

    /* JADX INFO: renamed from: Y */
    private final HandlerC18714i f139238Y;

    /* JADX INFO: renamed from: Z */
    private final Handler f139239Z;

    /* JADX INFO: renamed from: a0 */
    protected ImageReader f139240a0;

    /* JADX INFO: renamed from: b0 */
    protected ImageReader f139241b0;

    /* JADX INFO: renamed from: c0 */
    private int f139242c0;

    /* JADX INFO: renamed from: d0 */
    private TotalCaptureResult[] f139243d0;

    /* JADX INFO: renamed from: e0 */
    private TotalCaptureResult f139244e0;

    /* JADX INFO: renamed from: f0 */
    private volatile boolean f139245f0;

    /* JADX INFO: renamed from: g0 */
    private List<CaptureRequest.Key<?>> f139246g0;

    /* JADX INFO: renamed from: h0 */
    private int f139247h0;

    /* JADX INFO: renamed from: i0 */
    private int f139248i0;

    /* JADX INFO: renamed from: j0 */
    private boolean f139249j0;

    /* JADX INFO: renamed from: k0 */
    private boolean f139250k0;

    /* JADX INFO: renamed from: l0 */
    private boolean f139251l0;

    /* JADX INFO: renamed from: m0 */
    private boolean f139252m0;

    /* JADX INFO: renamed from: n0 */
    private int f139253n0;

    /* JADX INFO: renamed from: o0 */
    private int f139254o0;

    /* JADX INFO: renamed from: p0 */
    private long f139255p0;

    /* JADX INFO: renamed from: q0 */
    private ConditionVariable f139256q0;

    /* JADX INFO: renamed from: r0 */
    private int f139257r0;

    /* JADX INFO: renamed from: s0 */
    private int f139258s0;

    /* JADX INFO: renamed from: t0 */
    private int f139259t0;

    /* JADX INFO: renamed from: u0 */
    private long f139260u0;

    /* JADX INFO: renamed from: l.njh0$a */
    public class C18706a extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a */
        private Integer f139261a = -1;

        /* JADX INFO: renamed from: b */
        private Integer f139262b = -1;

        /* JADX INFO: renamed from: c */
        private Integer f139263c = -1;

        /* JADX INFO: renamed from: d */
        private Integer f139264d = -1;

        public C18706a() {
        }

        /* JADX INFO: renamed from: a */
        private void m159740a(CaptureResult captureResult) {
            int i = njh0.this.f139247h0;
            boolean z = true;
            if (i == 0) {
                Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                int iIntValue = num != null ? num.intValue() : -1;
                njh0.this.f139252m0 = iIntValue == -1 || iIntValue == 2 || iIntValue == 4;
                CaptureRequest.Builder builder = ((TECameraModeBase) njh0.this).f55532c;
                if (builder != null) {
                    CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
                    Integer num2 = (Integer) builder.get(key);
                    if (num2 == null || num2.intValue() != 1) {
                        return;
                    }
                    if (4 == iIntValue || 5 == iIntValue || -1 == iIntValue) {
                        builder.set(key, 2);
                        if (njh0.this.f139238Y != null) {
                            njh0.this.f139238Y.sendEmptyMessage(1004);
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
                njh0.this.f139250k0 = true;
                C13341g.m80818e("TEImage2Mode", "ae trigger start...");
            }
            if (njh0.this.f139250k0) {
                if (num4 == null || num4.intValue() == 2 || num4.intValue() == 4) {
                    njh0.this.f139250k0 = false;
                    C13341g.m80818e("TEImage2Mode", "ae converge, is shot can do");
                } else {
                    z = false;
                }
                if (!this.f139264d.equals(num4)) {
                    C13341g.m80818e("TEImage2Mode", "ae state:" + num4);
                }
                this.f139264d = num4;
            } else {
                z = false;
            }
            if (z) {
                long jCurrentTimeMillis = System.currentTimeMillis() - njh0.this.f139237X;
                njh0.this.f139247h0 = 0;
                njh0.this.f139250k0 = false;
                if (njh0.this.f139238Y != null) {
                    njh0.this.f139238Y.removeMessages(1007);
                    njh0.this.f139238Y.sendEmptyMessage(1006);
                    njh0.this.f139238Y.sendEmptyMessage(1005);
                }
                C13341g.m80818e("TEImage2Mode", "send-capture-command consume = " + jCurrentTimeMillis);
            }
        }

        /* JADX INFO: renamed from: b */
        private void m159741b(CaptureResult captureResult) {
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
            if (!this.f139261a.equals(numValueOf) || !this.f139262b.equals(numValueOf2) || !this.f139263c.equals(numValueOf3) || !this.f139264d.equals(numValueOf4)) {
                C13341g.m80814a("TEImage2Mode", "[afMode=" + numValueOf + ", afState=" + numValueOf2 + ",aeMode=" + numValueOf3 + ", aeState=" + numValueOf4 + Constants.AES_SUFFIX);
            }
            this.f139261a = numValueOf;
            this.f139262b = numValueOf2;
            this.f139263c = numValueOf3;
            this.f139264d = numValueOf4;
            if ("CAPTURE_REQUEST_TAG_FOR_SHOT".equals(captureResult.getRequest().getTag())) {
                njh0.this.f139251l0 = true;
                C13341g.m80818e("TEImage2Mode", "is shot can do");
            }
            if (!njh0.this.f139251l0) {
                C13341g.m80814a("TEImage2Mode", "discard previous callback");
                return;
            }
            if (iIntValue == -1 || iIntValue == 4 || iIntValue == 5 || iIntValue == 2) {
                if (iIntValue2 == -1 || iIntValue2 == 4 || iIntValue2 == 2) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - njh0.this.f139237X;
                    njh0.this.f139238Y.removeMessages(1001);
                    njh0.this.f139238Y.sendEmptyMessage(1000);
                    njh0.this.f139251l0 = false;
                    C13341g.m80818e("TEImage2Mode", "send-capture-command consume = " + jCurrentTimeMillis);
                    ajh0.m96973b("te_record_send_capture_command_cost", jCurrentTimeMillis);
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull Surface surface, long j) {
            if (njh0.this.f139247h0 == 2 && "CAPTURE_REQUEST_TAG_FOR_SHOT".equals(captureRequest.getTag())) {
                njh0.this.f139251l0 = true;
                C13341g.m80815b("TEImage2Mode", "onCaptureBufferLost: ");
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - njh0.this.f139260u0;
            njh0 njh0Var = njh0.this;
            if (j > 1000) {
                C13341g.m80814a("TEImage2Mode", "on frame arrived fps: " + njh0Var.f139259t0);
                njh0.this.f139259t0 = 0;
                njh0.this.f139260u0 = jCurrentTimeMillis;
            } else {
                njh0.m159677I1(njh0Var);
            }
            m159740a(totalCaptureResult);
            if (!((TECameraModeBase) njh0.this).f55513G) {
                njh0.this.m80753Q();
                ((TECameraModeBase) njh0.this).f55513G = true;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - ((TECameraModeBase) njh0.this).f55516J;
                C13341g.m80818e("TEImage2Mode", "first preview frame callback arrived! consume = " + jCurrentTimeMillis2 + ", session consume: " + ((TECameraModeBase) njh0.this).f55515I);
                ajh0.m96973b("te_record_camera2_set_repeating_request_cost", jCurrentTimeMillis2);
                C13341g.m80819f("te_record_camera2_set_repeating_request_cost", Long.valueOf(jCurrentTimeMillis2));
            }
            if (njh0.this.f139247h0 == 2) {
                m159741b(totalCaptureResult);
            }
            njh0.m159680K0(njh0.this);
            if (njh0.this.f139254o0 != 0 && njh0.this.f139253n0 > njh0.this.f139254o0) {
                njh0.this.f139253n0 = 0;
                Runtime.getRuntime().gc();
            }
            njh0.m159687O0(njh0.this);
            if (njh0.this.f139242c0 % 5 == 0) {
                njh0.this.f139242c0 = 0;
            }
            if (njh0.this.f139243d0 != null) {
                njh0.this.f139243d0[njh0.this.f139242c0] = totalCaptureResult;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            if (njh0.this.f139247h0 == 2 && "CAPTURE_REQUEST_TAG_FOR_SHOT".equals(captureRequest.getTag())) {
                njh0.this.f139251l0 = true;
                C13341g.m80815b("TEImage2Mode", "onCaptureFailed: ");
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
            m159740a(captureResult);
        }
    }

    /* JADX INFO: renamed from: l.njh0$b */
    public class C18707b extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f139266a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f139267b;

        public C18707b(int i, int i2) {
            this.f139266a = i;
            this.f139267b = i2;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull Surface surface, long j) {
            C13341g.m80818e("TEImage2Mode", "capture burst buffer last...");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            C13341g.m80818e("TEImage2Mode", "onCaptureCompleted, aeExposure: " + ((Integer) totalCaptureResult.get(TotalCaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION)) + ", iso: " + ((Integer) totalCaptureResult.get(TotalCaptureResult.SENSOR_SENSITIVITY)) + ", exposureTime: " + ((Long) totalCaptureResult.get(TotalCaptureResult.SENSOR_EXPOSURE_TIME)));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            new StringBuilder("capture burst failed: ").append(captureFailure.getReason());
            int unused = njh0.this.f139248i0;
            njh0.m159693R0(njh0.this);
            throw null;
        }
    }

    /* JADX INFO: renamed from: l.njh0$c */
    public class C18708c extends CameraCaptureSession.CaptureCallback {
        public C18708c() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            if (((TECameraModeBase) njh0.this).f55532c == null) {
                return;
            }
            njh0.this.f139244e0 = totalCaptureResult;
            CaptureRequest.Builder builder = ((TECameraModeBase) njh0.this).f55532c;
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
            Integer num = (Integer) builder.get(key);
            CaptureRequest.Builder builder2 = ((TECameraModeBase) njh0.this).f55532c;
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_AF_TRIGGER;
            Integer num2 = (Integer) builder2.get(key2);
            if ((num != null && num.intValue() == 1) || (num2 != null && num2.intValue() == 1)) {
                C13341g.m80818e("TEImage2Mode", "need cancel ae af trigger");
                ((TECameraModeBase) njh0.this).f55532c.set(key, 2);
                ((TECameraModeBase) njh0.this).f55532c.set(key2, 2);
                njh0 njh0Var = njh0.this;
                TECameraModeBase.C13340f c13340fM80782l = njh0Var.m80782l(((TECameraModeBase) njh0Var).f55532c, null, null);
                if (!c13340fM80782l.m80813c()) {
                    C13341g.m80823j("TEImage2Mode", "onCaptureSequenceCompleted: error = " + c13340fM80782l.m80811a());
                    return;
                }
                ((TECameraModeBase) njh0.this).f55532c.set(key, 0);
                ((TECameraModeBase) njh0.this).f55532c.set(key2, 0);
            }
            njh0 njh0Var2 = njh0.this;
            njh0Var2.m80801v0(((TECameraModeBase) njh0Var2).f55532c);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            C13341g.m80815b("TEImage2Mode", "captureStillPicture, capture failed");
            if (((TECameraModeBase) njh0.this).f55537h.f55360q0) {
                ((TECameraModeBase) njh0.this).f55537h.f55360q0 = false;
            }
            if (((TECameraModeBase) njh0.this).f55537h.f55341h) {
                ((TECameraModeBase) njh0.this).f55537h.f55341h = false;
            }
            njh0.this.f139238Y.sendMessage(njh0.this.f139238Y.obtainMessage(1003, new Exception("Capture failed: " + captureFailure.getReason())));
            njh0.this.f139238Y.sendEmptyMessage(1002);
        }
    }

    /* JADX INFO: renamed from: l.njh0$d */
    public class C18709d extends CameraCaptureSession.CaptureCallback {
        public C18709d() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            C13341g.m80814a("TEImage2Mode", "onCaptureCompleted, do capture done");
            njh0.this.f139238Y.sendEmptyMessage(1002);
            njh0.this.f139244e0 = totalCaptureResult;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            C13341g.m80815b("TEImage2Mode", "onCaptureCompleted, do capture failed");
            if (((TECameraModeBase) njh0.this).f55537h.f55360q0) {
                ((TECameraModeBase) njh0.this).f55537h.f55360q0 = false;
            }
            if (((TECameraModeBase) njh0.this).f55537h.f55341h) {
                ((TECameraModeBase) njh0.this).f55537h.f55341h = false;
            }
            njh0.this.f139238Y.sendMessage(njh0.this.f139238Y.obtainMessage(1003, new Exception("Capture failed: " + captureFailure.getReason())));
            njh0.this.f139238Y.sendEmptyMessage(1002);
        }
    }

    /* JADX INFO: renamed from: l.njh0$e */
    public class ExecutorC18710e implements Executor {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Handler f139271a;

        public ExecutorC18710e(Handler handler) {
            this.f139271a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            Handler handler = this.f139271a;
            if (handler != null) {
                handler.post(runnable);
            } else {
                C13341g.m80815b("TEImage2Mode", "executor run, handler is null");
            }
        }
    }

    /* JADX INFO: renamed from: l.njh0$f */
    public class C18711f implements ImageReader.OnImageAvailableListener {
        public C18711f() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            TotalCaptureResult totalCaptureResult;
            Image imageAcquireNextImage = imageReader.acquireNextImage();
            if (njh0.this.f139245f0) {
                int i = 0;
                njh0.this.f139245f0 = false;
                if (imageAcquireNextImage != null) {
                    long timestamp = imageAcquireNextImage.getTimestamp();
                    TotalCaptureResult[] totalCaptureResultArr = njh0.this.f139243d0;
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
                    njh0.this.m159702V1(imageAcquireNextImage, totalCaptureResult);
                } else {
                    njh0.this.m159700U1(new Exception("no image data"), -1000);
                }
            }
            if (imageAcquireNextImage != null) {
                imageAcquireNextImage.close();
            }
        }
    }

    /* JADX INFO: renamed from: l.njh0$g */
    public class C18712g implements ImageReader.OnImageAvailableListener {
        public C18712g() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Image imageAcquireNextImage = imageReader.acquireNextImage();
            njh0 njh0Var = njh0.this;
            if (imageAcquireNextImage == null) {
                njh0Var.m159700U1(new Exception("no image data"), -1000);
                return;
            }
            njh0Var.m159702V1(imageAcquireNextImage, imageAcquireNextImage.getFormat() != 256 ? njh0.this.f139244e0 : null);
            njh0.this.f139244e0 = null;
            imageAcquireNextImage.close();
        }
    }

    /* JADX INFO: renamed from: l.njh0$h */
    public class C18713h extends CameraCaptureSession.CaptureCallback {
        public C18713h() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull Surface surface, long j) {
            njh0.this.f139256q0.open();
            C13341g.m80815b("TEImage2Mode", "set flash request abort");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            njh0.this.f139256q0.open();
            C13341g.m80818e("TEImage2Mode", "onCaptureCompleted");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            njh0.this.f139256q0.open();
            C13341g.m80815b("TEImage2Mode", "set flash failed");
        }
    }

    /* JADX INFO: renamed from: l.njh0$i */
    public class HandlerC18714i extends Handler {
        public HandlerC18714i(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            super.dispatchMessage(message);
            C13341g.m80818e("TEImage2Mode", "dispatch msg = " + message.what);
            switch (message.what) {
                case 1000:
                case 1001:
                    njh0.this.m159692Q1();
                    break;
                case 1002:
                    njh0.this.m159704W1();
                    break;
                case 1003:
                    njh0.this.m159700U1((Exception) message.obj, -1000);
                    break;
                case 1004:
                    njh0 njh0Var = njh0.this;
                    njh0Var.m80801v0(((TECameraModeBase) njh0Var).f55532c);
                    break;
                case 1005:
                    njh0.this.m159736N1();
                    break;
                case 1006:
                case 1007:
                    njh0.this.m159688O1();
                    break;
            }
        }
    }

    public njh0(C13323b c13323b, Context context, CameraManager cameraManager, Handler handler) {
        super(c13323b, context, handler);
        this.f139237X = 0L;
        this.f139239Z = new Handler(Looper.getMainLooper());
        this.f139241b0 = null;
        this.f139242c0 = -1;
        this.f139244e0 = null;
        this.f139245f0 = false;
        this.f139246g0 = null;
        this.f139247h0 = 0;
        this.f139249j0 = false;
        this.f139250k0 = false;
        this.f139251l0 = false;
        this.f139252m0 = false;
        this.f139253n0 = 0;
        this.f139254o0 = 0;
        this.f139255p0 = 0L;
        this.f139256q0 = null;
        this.f139257r0 = -1;
        this.f139258s0 = 0;
        this.f139259t0 = 0;
        this.f139260u0 = 0L;
        this.f55534e = cameraManager;
        if (this.f55537h.f55351m) {
            this.f55538i = new pjh0(this);
        } else {
            this.f55538i = new ojh0(this);
        }
        this.f139238Y = new HandlerC18714i(handler.getLooper());
        m159698T1();
    }

    /* JADX INFO: renamed from: I1 */
    public static /* synthetic */ int m159677I1(njh0 njh0Var) {
        int i = njh0Var.f139259t0;
        njh0Var.f139259t0 = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ int m159680K0(njh0 njh0Var) {
        int i = njh0Var.f139253n0;
        njh0Var.f139253n0 = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: K1 */
    private void m159681K1() {
        CameraCharacteristics cameraCharacteristics;
        if (this.f55537h.f55326Z && (cameraCharacteristics = this.f55530a) != null) {
            Range<Integer> rangeM159694R1 = m159694R1((Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
            CaptureRequest.Builder builder = this.f55532c;
            if (builder != null && rangeM159694R1 != null) {
                builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeM159694R1);
                m80801v0(this.f55532c);
                C13341g.m80818e("TEImage2Mode", "apply capture scene: " + rangeM159694R1);
            }
        }
        m159685M1();
    }

    /* JADX INFO: renamed from: L1 */
    private void m159683L1() {
        CameraCharacteristics cameraCharacteristics;
        if (this.f55537h.f55326Z && (cameraCharacteristics = this.f55530a) != null) {
            Range<Integer> rangeM159696S1 = m159696S1((Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
            CaptureRequest.Builder builder = this.f55532c;
            if (builder != null && rangeM159696S1 != null) {
                builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeM159696S1);
                m80801v0(this.f55532c);
                C13341g.m80818e("TEImage2Mode", "apply record scene: " + rangeM159696S1);
            }
        }
        m159690P1();
    }

    /* JADX INFO: renamed from: M1 */
    private void m159685M1() {
        Surface surface;
        ImageReader imageReader = this.f139241b0;
        if (imageReader == null || (surface = imageReader.getSurface()) == null || !surface.isValid()) {
            return;
        }
        CaptureRequest.Builder builder = this.f55532c;
        if (builder != null) {
            try {
                builder.removeTarget(surface);
                this.f55532c.addTarget(surface);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        m80801v0(this.f55532c);
    }

    /* JADX INFO: renamed from: O0 */
    public static /* synthetic */ int m159687O0(njh0 njh0Var) {
        int i = njh0Var.f139242c0;
        njh0Var.f139242c0 = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O1 */
    public void m159688O1() {
        this.f139255p0 = System.currentTimeMillis();
        this.f139247h0 = 0;
        CaptureRequest.Builder builderM80795s = m80795s(2);
        if (builderM80795s == null) {
            m159700U1(new Exception("capture build is null"), -1001);
            return;
        }
        ImageReader imageReader = this.f139240a0;
        if (imageReader == null) {
            m159700U1(new Exception("image reader is null"), -1001);
            return;
        }
        builderM80795s.addTarget(imageReader.getSurface());
        m159710a2(builderM80795s);
        TECameraModeBase.C13340f c13340fM80782l = m80782l(builderM80795s, new C18708c(), this.f55540k);
        if (c13340fM80782l.m80813c()) {
            return;
        }
        m159700U1(c13340fM80782l.m80812b(), -1001);
    }

    /* JADX INFO: renamed from: P1 */
    private void m159690P1() {
        Surface surface;
        ImageReader imageReader = this.f139241b0;
        if (imageReader == null || (surface = imageReader.getSurface()) == null || !surface.isValid()) {
            return;
        }
        CaptureRequest.Builder builder = this.f55532c;
        if (builder != null) {
            try {
                builder.removeTarget(surface);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        m80801v0(this.f55532c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q1 */
    public void m159692Q1() {
        this.f139255p0 = System.currentTimeMillis();
        this.f139247h0 = 0;
        CaptureRequest.Builder builderM80795s = m80795s(2);
        if (builderM80795s == null) {
            m159700U1(new Exception("capture build is null"), -1001);
            return;
        }
        ImageReader imageReader = this.f139240a0;
        if (imageReader == null) {
            m159700U1(new Exception("image reader is null"), -1001);
            return;
        }
        builderM80795s.addTarget(imageReader.getSurface());
        m159710a2(builderM80795s);
        TECameraModeBase.C13340f c13340fM80782l = m80782l(builderM80795s, new C18709d(), null);
        if (c13340fM80782l.m80813c()) {
            return;
        }
        m159700U1(c13340fM80782l.m80812b(), -1001);
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ TECameraSettings.InterfaceC13302c m159693R0(njh0 njh0Var) {
        njh0Var.getClass();
        return null;
    }

    /* JADX INFO: renamed from: R1 */
    private Range<Integer> m159694R1(Range<Integer>[] rangeArr) {
        int i;
        int i2;
        Range<Integer> range = null;
        if (rangeArr != null) {
            TECameraSettings tECameraSettings = this.f55537h;
            if (tECameraSettings == null || (i = tECameraSettings.f55325Y) < 30) {
                i = 30;
            }
            int i3 = 0;
            int i4 = 0;
            for (Range<Integer> range2 : rangeArr) {
                C13341g.m80814a("TEImage2Mode", "fps: " + range2.toString());
                int iIntValue = ((Integer) range2.getUpper()).intValue();
                int iIntValue2 = ((Integer) range2.getLower()).intValue();
                if (iIntValue2 < 5) {
                    C13341g.m80818e("TEImage2Mode", "discard fps: " + range2.toString());
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
                ajh0.m96973b("te_record_camera_max_fps", i3);
            }
        }
        return range;
    }

    /* JADX INFO: renamed from: S1 */
    private Range<Integer> m159696S1(Range<Integer>[] rangeArr) {
        int i;
        Range<Integer> range = null;
        if (rangeArr != null) {
            TECameraSettings tECameraSettings = this.f55537h;
            int i2 = 30;
            if (tECameraSettings != null && (i = tECameraSettings.f55325Y) >= 30) {
                i2 = i;
            }
            int i3 = 0;
            int i4 = 0;
            for (Range<Integer> range2 : rangeArr) {
                C13341g.m80814a("TEImage2Mode", "fps: " + range2.toString());
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
    private void m159698T1() {
        this.f55529W = new C18706a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U1 */
    public void m159700U1(Exception exc, int i) {
        this.f139247h0 = 0;
        C13341g.m80823j("TEImage2Mode", "onCaptureFailed, err = " + exc + ", errCode = " + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V1 */
    public void m159702V1(Image image, TotalCaptureResult totalCaptureResult) {
        C13341g.m80818e("TEImage2Mode", "on image available, consume: " + (System.currentTimeMillis() - this.f139255p0) + ", size: " + image.getWidth() + BaseSei.f13930X + image.getHeight() + ", format: " + image.getFormat() + ", rotation: " + (this.f139248i0 == 1 ? 270 : 90));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W1 */
    public void m159704W1() {
        TECameraSettings tECameraSettings = this.f55537h;
        if (tECameraSettings.f55333d != 0) {
            return;
        }
        CaptureRequest.Builder builder = this.f55532c;
        if (builder == null) {
            C13341g.m80815b("TEImage2Mode", "resetPreviewAfterFlashCapture failed, no builder");
            return;
        }
        int i = tECameraSettings.f55338f0;
        if (i == 3) {
            if (this.f55518L) {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 3);
                this.f55532c.set(CaptureRequest.FLASH_MODE, 1);
            }
        } else if (i == 2 && this.f139249j0) {
            builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            m80782l(this.f55532c, null, null);
        }
        if (this.f139249j0) {
            this.f55532c.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        }
        this.f55532c.set(CaptureRequest.CONTROL_AF_MODE, 4);
        this.f55532c.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
        m80801v0(this.f55532c);
    }

    /* JADX INFO: renamed from: X1 */
    private TEFrameSizei m159706X1(int i, int i2, int i3, int i4) {
        TECameraSettings tECameraSettings = this.f55537h;
        if (tECameraSettings.f55301A) {
            tECameraSettings.f55301A = false;
            return tECameraSettings.f55361r;
        }
        if (this.f55541l == null) {
            this.f55541l = (StreamConfigurationMap) this.f55530a.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        }
        StreamConfigurationMap streamConfigurationMap = this.f55541l;
        TEFrameSizei tEFrameSizeiMo80503a = null;
        if (streamConfigurationMap == null) {
            C13341g.m80815b("TEImage2Mode", "no stream configuration map...");
            return null;
        }
        if (!streamConfigurationMap.isOutputSupportedFor(i)) {
            C13341g.m80815b("TEImage2Mode", "Output format is not supported");
            return null;
        }
        Size[] outputSizes = this.f55541l.getOutputSizes(i);
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            arrayList.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        TECameraSettings tECameraSettings2 = this.f55537h;
        if (tECameraSettings2.f55377z) {
            return C13333f.m80713o(arrayList, tECameraSettings2.m80504a(), i4, this.f55537h.f55375y);
        }
        if (this.f55550u != null) {
            if (!StreamConfigurationMap.isOutputSupportedFor(SurfaceTexture.class)) {
                C13341g.m80815b("TEImage2Mode", "Output SurfaceTexture is not supported");
                return null;
            }
            Size[] outputSizes2 = this.f55541l.getOutputSizes(SurfaceTexture.class);
            ArrayList arrayList2 = new ArrayList();
            for (Size size2 : outputSizes2) {
                arrayList2.add(new TEFrameSizei(size2.getWidth(), size2.getHeight()));
            }
            try {
                tEFrameSizeiMo80503a = this.f55550u.mo80503a(arrayList, arrayList2);
            } catch (Exception e) {
                C13341g.m80815b("TEImage2Mode", "select pic size from client err: " + e.getMessage());
            }
        }
        if (tEFrameSizeiMo80503a != null) {
            return tEFrameSizeiMo80503a;
        }
        TEFrameSizei tEFrameSizeiM80714p = C13333f.m80714p(arrayList, this.f55537h.m80504a(), new TEFrameSizei(i2, i3));
        C13341g.m80818e("TEImage2Mode", "select pic size is null, get closest size: " + tEFrameSizeiM80714p);
        return tEFrameSizeiM80714p;
    }

    /* JADX INFO: renamed from: a2 */
    private void m159710a2(CaptureRequest.Builder builder) {
        if (builder == null) {
            C13341g.m80815b("TEImage2Mode", "syncPreviewParam failed, no capture builder");
            return;
        }
        CaptureRequest.Builder builder2 = this.f55532c;
        if (builder2 == null) {
            C13341g.m80815b("TEImage2Mode", "syncPreviewParam failed, no preview builder");
            return;
        }
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
        Integer num = (Integer) builder2.get(key);
        if (num != null) {
            builder.set(key, num);
            C13341g.m80814a("TEImage2Mode", "sync afMode: " + num);
        }
        CaptureRequest.Builder builder3 = this.f55532c;
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_REGIONS;
        MeteringRectangle[] meteringRectangleArr = (MeteringRectangle[]) builder3.get(key2);
        if (meteringRectangleArr != null) {
            builder.set(key2, meteringRectangleArr);
            C13341g.m80814a("TEImage2Mode", "sync aeRect: " + Arrays.toString(meteringRectangleArr));
        }
        CaptureRequest.Builder builder4 = this.f55532c;
        CaptureRequest.Key key3 = CaptureRequest.CONTROL_AF_REGIONS;
        MeteringRectangle[] meteringRectangleArr2 = (MeteringRectangle[]) builder4.get(key3);
        if (meteringRectangleArr != null) {
            builder.set(key3, meteringRectangleArr2);
            C13341g.m80814a("TEImage2Mode", "sync afRect: " + Arrays.toString(meteringRectangleArr2));
        }
        m159737Y1(this.f55532c, builder);
        CaptureRequest.Builder builder5 = this.f55532c;
        CaptureRequest.Key key4 = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
        Range range = (Range) builder5.get(key4);
        if (range != null) {
            builder.set(key4, range);
            C13341g.m80814a("TEImage2Mode", "sync fpsRange: " + range);
        }
        Rect rect = this.f55549t;
        if (rect != null) {
            builder.set(CaptureRequest.SCALER_CROP_REGION, rect);
            C13341g.m80814a("TEImage2Mode", "sync crop region: " + this.f55549t);
        }
        vih0 vih0Var = this.f55531b;
        if (vih0Var != null) {
            vih0Var.m198564a(this.f55530a, builder, false);
        }
        builder.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f55548s));
    }

    @Override // com.p069ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: B */
    public int[] mo80738B() {
        ImageReader imageReader = this.f139240a0;
        if (imageReader == null) {
            return null;
        }
        int width = imageReader.getWidth();
        int height = this.f139240a0.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        return new int[]{width, height};
    }

    @Override // com.p069ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: E */
    public int mo80741E() {
        return 4;
    }

    @Override // com.p069ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: G */
    public int mo80743G() {
        return this.f139257r0;
    }

    @Override // com.p069ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: K */
    public int[] mo80747K() {
        ImageReader imageReader = this.f139240a0;
        if (imageReader == null) {
            return null;
        }
        return new int[]{imageReader.getWidth(), this.f139240a0.getHeight()};
    }

    /* JADX INFO: renamed from: N1 */
    public void m159736N1() {
        CaptureRequest.Builder builder = this.f55532c;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
        Integer num = (Integer) builder.get(key);
        if (num == null || num.intValue() != 1) {
            return;
        }
        C13341g.m80818e("TEImage2Mode", "need cancel af trigger");
        this.f55532c.set(key, 2);
        m80782l(this.f55532c, null, null);
        this.f55532c.set(key, 0);
        m80801v0(this.f55532c);
    }

    @Override // com.p069ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: P */
    public int mo80752P(String str, int i) throws CameraAccessException {
        this.f139258s0 = 0;
        this.f139246g0 = null;
        if (this.f139257r0 == -1) {
            this.f139257r0 = 0;
        }
        return super.mo80752P(str, i);
    }

    /* JADX INFO: renamed from: Y1 */
    public void m159737Y1(CaptureRequest.Builder builder, CaptureRequest.Builder builder2) {
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
    public void m159738Z1(int i, int i2) {
        boolean z;
        Size size;
        TECameraSettings tECameraSettings = this.f55537h;
        int i3 = 256;
        int i4 = (tECameraSettings.f55360q0 || tECameraSettings.f55341h) ? 35 : 256;
        TEFrameSizei tEFrameSizeiM159706X1 = m159706X1(i4, i, i2, tECameraSettings.f55367u);
        if (tEFrameSizeiM159706X1 == null) {
            C13341g.m80815b("TEImage2Mode", "select picture size failed...format: " + i4);
            return;
        }
        TECameraSettings tECameraSettings2 = this.f55537h;
        tECameraSettings2.f55361r = tEFrameSizeiM159706X1;
        int width = tEFrameSizeiM159706X1.width;
        int height = tEFrameSizeiM159706X1.height;
        int i5 = 0;
        if (tECameraSettings2.f55341h && width <= 4096 && i4 == 35) {
            this.f139243d0 = new TotalCaptureResult[5];
            ImageReader imageReaderNewInstance = ImageReader.newInstance(width, height, i4, 3);
            this.f139241b0 = imageReaderNewInstance;
            imageReaderNewInstance.setOnImageAvailableListener(new C18711f(), this.f139239Z);
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Size[] outputSizes = this.f55541l.getOutputSizes(256);
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
                this.f139243d0 = null;
                this.f139241b0.setOnImageAvailableListener(null, null);
                this.f139241b0.close();
                this.f139241b0 = null;
                i3 = i4;
            } else {
                width = size.getWidth();
                height = size.getHeight();
            }
        } else {
            i3 = i4;
        }
        this.f139240a0 = ImageReader.newInstance(width, height, i3, 1);
        C13341g.m80818e("TEImage2Mode", "image reader width: " + this.f139240a0.getWidth() + ", height = " + this.f139240a0.getHeight() + ", format: " + i3 + ", maxWidth: " + this.f55537h.f55367u + ", hasZslYuvSurface: " + z);
        this.f139240a0.setOnImageAvailableListener(new C18712g(), this.f139239Z);
    }

    /* JADX INFO: renamed from: b2 */
    public void m159739b2(int i) {
        C13341g.m80818e("TEImage2Mode", "updateFlashModeParam: " + i);
        this.f139257r0 = i;
        CaptureRequest.Builder builder = this.f55532c;
        if (builder == null) {
            C13341g.m80815b("TEImage2Mode", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: mCaptureRequestBuilder is null");
            this.f55535f.mo80495c(this.f55537h.f55329b, -100, "switchFlashMode : CaptureRequest.Builder is null", this.f55539j);
            return;
        }
        CaptureRequest.Key key = CaptureRequest.FLASH_MODE;
        Integer num = (Integer) builder.get(key);
        int iIntValue = num == null ? 0 : num.intValue();
        if (i == 1) {
            if (this.f55537h.f55333d == 1) {
                C13341g.m80815b("TEImage2Mode", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -416. Reason: not support torch");
                C13341g.m80823j("TEImage2Mode", "flash on is not supported in front camera!");
                return;
            } else {
                this.f55532c.set(CaptureRequest.CONTROL_AE_MODE, 3);
                this.f55532c.set(key, 1);
                this.f55518L = true;
                return;
            }
        }
        if (i == 0) {
            this.f55518L = false;
            if (iIntValue == 0) {
                C13341g.m80818e("TEImage2Mode", "switchFlashMode flashStatus == FLASH_MODE_OFF");
                return;
            } else {
                this.f55532c.set(CaptureRequest.CONTROL_AE_MODE, 1);
                this.f55532c.set(key, 0);
                return;
            }
        }
        if (i == 2) {
            this.f55518L = false;
            if (iIntValue == 2) {
                C13341g.m80818e("TEImage2Mode", "switchFlashMode flashStatus == FLASH_MODE_TORCH");
                return;
            } else {
                this.f55532c.set(CaptureRequest.CONTROL_AE_MODE, 1);
                this.f55532c.set(key, 2);
                return;
            }
        }
        C13341g.m80815b("TEImage2Mode", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -416. Reason: not support flash mode " + i);
        C13341g.m80815b("TEImage2Mode", "not support flash mode: " + i);
    }

    @Override // p149l.y3m
    /* JADX INFO: renamed from: c */
    public void mo97150c(int i) {
        TECameraModeBase.C13340f c13340fM80801v0;
        if (this.f55532c == null) {
            C13341g.m80815b("TEImage2Mode", "switchFlashMode failed, mode: " + i);
            return;
        }
        int i2 = this.f139257r0;
        boolean z = (i2 == -1 || i2 == 0 || i != 0) ? false : true;
        m159739b2(i);
        if (z) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.f139256q0 == null) {
                this.f139256q0 = new ConditionVariable();
            }
            this.f139256q0.close();
            c13340fM80801v0 = m80805x0(this.f55532c, new C18713h(), this.f139239Z);
            if (!this.f139256q0.block(33L)) {
                C13341g.m80818e("TEImage2Mode", "close flash: " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
            }
            m80801v0(this.f55532c);
        } else {
            c13340fM80801v0 = m80801v0(this.f55532c);
        }
        if (c13340fM80801v0.m80813c()) {
            return;
        }
        C13341g.m80815b("TEImage2Mode", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: " + c13340fM80801v0.m80811a());
        this.f55535f.mo80497e(-100, -100, c13340fM80801v0.m80811a(), this.f55539j);
    }

    @Override // com.p069ss.android.ttvecamera.framework.TECameraModeBase, p149l.z3m.InterfaceC21616a
    /* JADX INFO: renamed from: d */
    public int mo80767d() {
        CaptureRequest.Builder builder = this.f55532c;
        if (builder == null) {
            this.f55535f.mo80495c(this.f55537h.f55329b, -100, "rollbackMeteringSessionRequest : param is null.", this.f55539j);
            return -100;
        }
        builder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
        return super.mo80767d();
    }

    @Override // com.p069ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: f0 */
    public int mo80772f0(int i, int i2) {
        TECameraSettings tECameraSettings = this.f55537h;
        tECameraSettings.f55301A = true;
        TEFrameSizei tEFrameSizei = tECameraSettings.f55361r;
        tEFrameSizei.width = i;
        tEFrameSizei.height = i2;
        mo80791q();
        try {
            return mo80784m0();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override // com.p069ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: i0 */
    public void mo80777i0(int i) {
        this.f139258s0 = i;
        C13341g.m80818e("TEImage2Mode", "setSceneMode: " + i);
        if (i == 0) {
            m159681K1();
        } else if (i == 1) {
            m159683L1();
        } else {
            ig3.m135964a("un support scene");
        }
    }

    @Override // com.p069ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: m0 */
    public int mo80784m0() throws Exception {
        wjh0.m203445a("TEImage2Mode-startPreview");
        this.f55518L = false;
        Float f = (Float) this.f55530a.get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        int iIntValue = f == null ? 0 : f.intValue();
        C13341g.m80814a("TEImage2Mode", "lensInfoMinFocusDistance = " + iIntValue);
        boolean z = true;
        this.f139249j0 = iIntValue != 0;
        cjh0 cjh0VarM80645K = this.f55536g.m80645K();
        if (this.f55539j == null || cjh0VarM80645K == null) {
            C13341g.m80815b("TEImage2Mode", "CameraDevice or ProviderManager is null!");
            return -100;
        }
        if (this.f55537h.f55358p0) {
            if (cjh0VarM80645K.m107164f() != null) {
                cjh0VarM80645K.m107164f().mo102178l();
                C13341g.m80818e("TEImage2Mode", "reallocate st...");
            } else {
                C13341g.m80815b("TEImage2Mode", "reallocate st...err");
            }
        }
        int iM80754R = super.m80754R();
        if (iM80754R != 0) {
            return iM80754R;
        }
        TEFrameSizei tEFrameSizei = this.f55537h.f55361r;
        m159738Z1(tEFrameSizei.width, tEFrameSizei.height);
        CaptureRequest.Builder builderCreateCaptureRequest = this.f55539j.createCaptureRequest(1);
        this.f55532c = builderCreateCaptureRequest;
        Rect rect = this.f55549t;
        if (rect != null) {
            builderCreateCaptureRequest.set(CaptureRequest.SCALER_CROP_REGION, rect);
        }
        ArrayList arrayList = new ArrayList();
        if (cjh0VarM80645K.m107164f().mo102173g() == 8) {
            arrayList.addAll(Arrays.asList(cjh0VarM80645K.m107163e()));
        } else {
            arrayList.add(cjh0VarM80645K.m107162d());
        }
        ImageReader imageReader = this.f139241b0;
        if (imageReader != null) {
            arrayList.add(imageReader.getSurface());
        }
        Iterator<Surface> it = arrayList.iterator();
        while (it.hasNext()) {
            this.f55532c.addTarget(it.next());
        }
        ImageReader imageReader2 = this.f139240a0;
        if (imageReader2 != null) {
            arrayList.add(imageReader2.getSurface());
        }
        this.f55532c.set(CaptureRequest.CONTROL_AF_MODE, 4);
        TECameraSettings tECameraSettings = this.f55537h;
        if (tECameraSettings.f55326Z) {
            if (Build.VERSION.SDK_INT >= 28) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                CameraCharacteristics cameraCharacteristics = this.f55530a;
                if (cameraCharacteristics != null && this.f139246g0 == null) {
                    this.f139246g0 = cameraCharacteristics.getAvailableSessionKeys();
                }
                List<CaptureRequest.Key<?>> list = this.f139246g0;
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
                        this.f55537h.f55326Z = false;
                        break;
                    }
                }
                C13341g.m80818e("TEImage2Mode", "check aeTargetFpsRange is session key: " + z + ", consume: " + (System.currentTimeMillis() - jCurrentTimeMillis));
            } else {
                tECameraSettings.f55326Z = false;
            }
        }
        this.f139260u0 = 0L;
        this.f139259t0 = 0;
        this.f139253n0 = 0;
        this.f139242c0 = -1;
        int i = this.f55537h.f55324X;
        this.f139254o0 = i;
        if (i > 0) {
            C13341g.m80818e("TEImage2Mode", "release camera metadata threshold: " + this.f139254o0);
        }
        this.f139252m0 = false;
        this.f139247h0 = 0;
        this.f55514H = System.currentTimeMillis();
        Handler handlerM80740D = this.f55537h.f55347k ? m80740D() : this.f55540k;
        this.f55533d = null;
        mo80797t(arrayList, this.f55528V, handlerM80740D);
        if (this.f55533d == null) {
            m80809z0();
        }
        wjh0.m203446b();
        return 0;
    }

    @Override // com.p069ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: o */
    public void mo80787o(ti3 ti3Var, int i, TECameraSettings.InterfaceC13302c interfaceC13302c) {
        int i2;
        int i3;
        int i4 = ti3Var.f170523c;
        if ((i4 != 0 && i4 != this.f139240a0.getWidth()) || ((i2 = ti3Var.f170524d) != 0 && i2 != this.f139240a0.getHeight())) {
            C13341g.m80815b("TEImage2Mode", "restart preview for burst capture");
            this.f55537h.f55347k = true;
            mo80772f0(ti3Var.f170523c, ti3Var.f170524d);
        }
        this.f139248i0 = i;
        this.f139255p0 = System.currentTimeMillis();
        int width = this.f139240a0.getWidth();
        int height = this.f139240a0.getHeight();
        List<Integer> list = ti3Var.f170522b;
        C18707b c18707b = new C18707b(width, height);
        int i5 = ti3Var.f170521a;
        if (i5 == 1) {
            ArrayList arrayList = new ArrayList(list.size());
            for (Integer num : list) {
                CaptureRequest.Builder builderM80795s = m80795s(2);
                m159710a2(builderM80795s);
                builderM80795s.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, num);
                builderM80795s.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.TRUE);
                builderM80795s.addTarget(this.f139240a0.getSurface());
                arrayList.add(builderM80795s.build());
            }
            m80785n(arrayList, c18707b, null);
            return;
        }
        if (i5 == 0) {
            if (ti3Var.f170526f) {
                m80792q0();
            }
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                Integer num2 = list.get(i6);
                CaptureRequest.Builder builderM80795s2 = m80795s(2);
                m159710a2(builderM80795s2);
                builderM80795s2.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, num2);
                builderM80795s2.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.TRUE);
                builderM80795s2.addTarget(this.f139240a0.getSurface());
                m80783m(builderM80795s2.build(), c18707b, null);
                if (i6 > 0 && i6 < size - 1 && (i3 = ti3Var.f170525e) > 0) {
                    try {
                        Thread.sleep(i3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (ti3Var.f170526f) {
                m80801v0(this.f55532c);
            }
        }
    }

    @Override // com.p069ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: q */
    public void mo80791q() {
        this.f139247h0 = 0;
        this.f139238Y.removeCallbacksAndMessages(null);
        Handler handler = this.f55510D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f139237X = 0L;
        this.f139251l0 = false;
        this.f139253n0 = 0;
        this.f139257r0 = -1;
        this.f139244e0 = null;
        this.f55518L = false;
        ImageReader imageReader = this.f139240a0;
        if (imageReader != null) {
            imageReader.close();
            this.f139240a0 = null;
        }
        ImageReader imageReader2 = this.f139241b0;
        if (imageReader2 != null) {
            imageReader2.close();
            this.f139241b0 = null;
        }
        this.f139243d0 = null;
        this.f55532c = null;
        super.mo80791q();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0064  */
    @Override // com.p069ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: r */
    public Range<Integer> mo80793r(Range<Integer> range) {
        Range<Integer> range2;
        CameraCharacteristics cameraCharacteristics = this.f55530a;
        if (cameraCharacteristics != null && range != null && this.f55537h.f55372w0) {
            Range<Integer>[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            if (rangeArr == null) {
                return range;
            }
            Range<Integer> rangeM159696S1 = null;
            if (this.f55552w != null) {
                ArrayList arrayList = new ArrayList(rangeArr.length);
                for (Range<Integer> range3 : rangeArr) {
                    arrayList.add(new int[]{((Integer) range3.getLower()).intValue(), ((Integer) range3.getUpper()).intValue()});
                }
                int[] iArrMo80502a = this.f55552w.mo80502a(arrayList);
                if (iArrMo80502a != null) {
                    range2 = new Range<>(Integer.valueOf(iArrMo80502a[0]), Integer.valueOf(iArrMo80502a[1]));
                } else {
                    range2 = null;
                }
            } else {
                range2 = null;
            }
            if (range2 != null) {
                C13341g.m80818e("TEImage2Mode", "select fps from user callback: " + range2);
                return range2;
            }
            if (this.f55537h.f55315O == 4) {
                Range<Integer> range4 = new Range<>(Integer.valueOf(this.f55537h.f55331c.min), Integer.valueOf(this.f55537h.f55331c.max));
                for (Range<Integer> range5 : rangeArr) {
                    if (range4.equals(range5)) {
                        range2 = range4;
                        break;
                    }
                }
            }
            if (range2 != null) {
                C13341g.m80818e("TEImage2Mode", "select fps from user direct set: " + range2);
                return range2;
            }
            int i = this.f139258s0;
            if (i == 0) {
                rangeM159696S1 = m159694R1(rangeArr);
            } else if (i == 1) {
                rangeM159696S1 = m159696S1(rangeArr);
            }
            if (rangeM159696S1 != null) {
                range2 = rangeM159696S1;
            }
            if (range2 != null) {
                range = range2;
            }
            C13341g.m80818e("TEImage2Mode", "select fps: " + range);
        }
        return range;
    }

    @Override // com.p069ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: r0 */
    public void mo80794r0(int i, int i2, TECameraSettings.InterfaceC13311l interfaceC13311l) {
        mo80796s0(interfaceC13311l, this.f55537h.f55333d);
    }

    @Override // com.p069ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: s0 */
    public void mo80796s0(TECameraSettings.InterfaceC13311l interfaceC13311l, int i) {
        super.mo80796s0(interfaceC13311l, i);
        this.f139248i0 = i;
        this.f139251l0 = false;
        this.f139255p0 = System.currentTimeMillis();
        if (this.f139241b0 != null && !this.f55518L) {
            this.f139247h0 = 1;
            this.f139245f0 = true;
            C13341g.m80818e("TEImage2Mode", "takePicture...use zsl buffer");
            return;
        }
        C13341g.m80818e("TEImage2Mode", "takePicture...flash strategy: " + this.f55537h.f55338f0);
        boolean z = this.f55518L;
        long j = z ? 1600L : 800L;
        TECameraSettings tECameraSettings = this.f55537h;
        if (tECameraSettings.f55333d != 0) {
            this.f139247h0 = 1;
            m159692Q1();
            return;
        }
        int i2 = tECameraSettings.f55338f0;
        if (i2 == 3) {
            if (!z) {
                m159692Q1();
                return;
            }
            this.f139237X = System.currentTimeMillis();
            this.f139247h0 = 2;
            this.f139238Y.sendEmptyMessageDelayed(1001, j);
            this.f55532c.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.f55532c.set(CaptureRequest.FLASH_MODE, 2);
            if (!this.f139249j0) {
                this.f139238Y.sendEmptyMessageDelayed(1000, 300L);
                return;
            }
            this.f55532c.set(CaptureRequest.CONTROL_AF_MODE, 1);
            CaptureRequest.Builder builder = this.f55532c;
            CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
            builder.set(key, 1);
            this.f55532c.setTag("CAPTURE_REQUEST_TAG_FOR_SHOT");
            m80780k(this.f55532c);
            this.f55532c.setTag(null);
            this.f55532c.set(key, 0);
            this.f55532c.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
            m80801v0(this.f55532c);
            TECameraModeBase.C13340f c13340fM80801v0 = m80801v0(this.f55532c);
            if (c13340fM80801v0.m80813c()) {
                return;
            }
            HandlerC18714i handlerC18714i = this.f139238Y;
            handlerC18714i.sendMessage(handlerC18714i.obtainMessage(1003, c13340fM80801v0.m80812b()));
            return;
        }
        if (i2 == 2) {
            if (!z && this.f139252m0) {
                C13341g.m80818e("TEImage2Mode", "af converge, do capture...");
                m159692Q1();
                return;
            }
            this.f139237X = System.currentTimeMillis();
            this.f139247h0 = 2;
            this.f139238Y.sendEmptyMessageDelayed(1001, j);
            if (this.f139249j0) {
                this.f55532c.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            }
            CaptureRequest.Builder builder2 = this.f55532c;
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
            builder2.set(key2, 1);
            this.f55532c.setTag("CAPTURE_REQUEST_TAG_FOR_SHOT");
            m80780k(this.f55532c);
            this.f55532c.setTag(null);
            this.f55532c.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
            this.f55532c.set(key2, 0);
            TECameraModeBase.C13340f c13340fM80801v1 = m80801v0(this.f55532c);
            if (c13340fM80801v1.m80813c()) {
                return;
            }
            HandlerC18714i handlerC18714i2 = this.f139238Y;
            handlerC18714i2.sendMessage(handlerC18714i2.obtainMessage(1003, c13340fM80801v1.m80812b()));
            return;
        }
        if (i2 != 0) {
            if (i2 != 1) {
                this.f139247h0 = 1;
                m159692Q1();
                return;
            }
            this.f139247h0 = 1;
            if (z) {
                this.f55532c.set(CaptureRequest.CONTROL_AE_MODE, 1);
                this.f55532c.set(CaptureRequest.FLASH_MODE, 2);
            }
            m159688O1();
            return;
        }
        if (!z && this.f139252m0) {
            C13341g.m80818e("TEImage2Mode", "af converge, do capture...");
            m159688O1();
            return;
        }
        this.f139237X = System.currentTimeMillis();
        this.f139247h0 = 1;
        this.f139238Y.sendEmptyMessageDelayed(1007, j);
        if (this.f139249j0) {
            this.f55532c.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        }
        this.f55532c.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        TECameraModeBase.C13340f c13340fM80782l = m80782l(this.f55532c, this.f55529W, this.f55540k);
        if (c13340fM80782l.m80813c()) {
            return;
        }
        HandlerC18714i handlerC18714i3 = this.f139238Y;
        handlerC18714i3.sendMessage(handlerC18714i3.obtainMessage(1003, c13340fM80782l.m80812b()));
    }

    @Override // com.p069ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: t */
    public void mo80797t(List<Surface> list, CameraCaptureSession.StateCallback stateCallback, Handler handler) throws CameraAccessException {
        wjh0.m203445a("TEImage2Mode-createSession");
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList arrayList = new ArrayList();
            Iterator<Surface> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new OutputConfiguration(it.next()));
            }
            mjh0.m154806a();
            SessionConfiguration sessionConfigurationM149980a = ljh0.m149980a(m80749M(list), arrayList, new ExecutorC18710e(handler), stateCallback);
            this.f55532c.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, mo80793r(new Range<>(Integer.valueOf(this.f55508B.min / this.f55537h.f55331c.fpsUnitFactor), Integer.valueOf(this.f55508B.max / this.f55537h.f55331c.fpsUnitFactor))));
            m159739b2(this.f139257r0);
            sessionConfigurationM149980a.setSessionParameters(this.f55532c.build());
            C13341g.m80818e("TEImage2Mode", "createSession by sessionConfiguration");
            this.f55539j.createCaptureSession(sessionConfigurationM149980a);
        } else {
            C13341g.m80818e("TEImage2Mode", "createSession by normally");
            this.f55539j.createCaptureSession(list, stateCallback, handler);
        }
        wjh0.m203446b();
    }

    @Override // com.p069ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: t0 */
    public int mo80798t0(boolean z) {
        mo97150c(z ? 2 : 0);
        return 0;
    }

    @Override // com.p069ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: u0 */
    public int mo80800u0() throws CameraAccessException {
        m159739b2(this.f139257r0);
        return super.mo80800u0();
    }

    @Override // com.p069ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: z */
    public int mo80808z(TEFocusSettings tEFocusSettings) {
        if (this.f139247h0 == 0) {
            return super.mo80808z(tEFocusSettings);
        }
        C13341g.m80815b("TEImage2Mode", "focus action discard, state = " + this.f139247h0);
        return -108;
    }
}
