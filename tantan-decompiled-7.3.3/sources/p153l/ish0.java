package p153l;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.p074ss.android.ttvecamera.C13496f;
import com.p074ss.android.ttvecamera.C13504g;
import com.p074ss.android.ttvecamera.TEFocusSettings;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
@RequiresApi(api = 21)
public class ish0 extends orh0 {

    /* JADX INFO: renamed from: e */
    private final p6m.InterfaceC19309a f116662e;

    /* JADX INFO: renamed from: f */
    private AtomicBoolean f116663f;

    /* JADX INFO: renamed from: l.ish0$a */
    public class C17791a extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a */
        private int f116664a = -1;

        /* JADX INFO: renamed from: b */
        private boolean f116665b = false;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f116666c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ CaptureRequest.Builder f116667d;

        public C17791a(boolean z, CaptureRequest.Builder builder) {
            this.f116666c = z;
            this.f116667d = builder;
        }

        /* JADX INFO: renamed from: a */
        private void m141884a() {
            if (ish0.this.f116663f != null) {
                ish0.this.f116663f.set(false);
            }
        }

        /* JADX INFO: renamed from: b */
        private void m141885b(CameraCaptureSession cameraCaptureSession) {
            if (this.f116666c) {
                this.f116667d.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                ish0.this.f116662e.mo81948b(cameraCaptureSession, this.f116667d);
            }
            m141884a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull Surface surface, long j) {
            super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
            C13504g.m81998b("TEVideoFocus", "Manual Focus capture buffer lost ");
            TEFocusSettings tEFocusSettings = ish0.this.f148703b;
            if (tEFocusSettings != null) {
                tEFocusSettings.m81703g().mo81717a(-411, ish0.this.f148703b.m81704h(), "Manual Focus capture buffer lost ");
            }
            m141885b(cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            if (captureRequest == null || !"FOCUS_TAG".equals(captureRequest.getTag())) {
                C13504g.m82006j("TEVideoFocus", "Not focus request!");
                m141884a();
                return;
            }
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
            CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
            C13504g.m81997a("TEVideoFocus", "Manual Focus onCaptureCompleted: afState = " + num + ", triggerState = " + ((Integer) captureRequest.get(key)));
            if (num == null) {
                C13504g.m82006j("TEVideoFocus", "Focus failed.");
                m141884a();
                return;
            }
            if (this.f116664a != num.intValue() && (num.intValue() == 4 || num.intValue() == 5)) {
                if (this.f116666c) {
                    this.f116667d.set(key, 2);
                    ish0.this.f116662e.mo81948b(cameraCaptureSession, this.f116667d);
                } else {
                    ish0 ish0Var = ish0.this;
                    if (!ish0Var.f148704c.f56201n) {
                        ish0Var.f116662e.mo81946a();
                    }
                }
                if (!this.f116665b) {
                    this.f116665b = true;
                    TEFocusSettings tEFocusSettings = ish0.this.f148703b;
                    if (tEFocusSettings != null) {
                        tEFocusSettings.m81703g().mo81717a(ish0.this.f148703b.m81704h(), ish0.this.f148704c.f56181d, "Done");
                    }
                }
                m141884a();
                C13504g.m82001e("TEVideoFocus", "Focus done, isLock = " + this.f116666c + ", afState = " + num);
            }
            if (this.f116665b && num.intValue() != 4 && num.intValue() != 5) {
                C13504g.m81998b("TEVideoFocus", "afState error!!!, may be re-auto-focus in some device, switch to caf");
                ish0 ish0Var2 = ish0.this;
                if (!ish0Var2.f148704c.f56201n) {
                    ish0Var2.f116662e.mo81946a();
                }
            }
            this.f116664a = num.intValue();
            ish0 ish0Var3 = ish0.this;
            if (ish0Var3.f148705d) {
                ish0Var3.f148705d = C13496f.m81892k(totalCaptureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            C13504g.m81998b("TEVideoFocus", "Manual Focus Failed: " + captureFailure);
            TEFocusSettings tEFocusSettings = ish0.this.f148703b;
            if (tEFocusSettings != null) {
                tEFocusSettings.m81703g().mo81717a(-411, ish0.this.f148704c.f56181d, captureFailure.toString());
            }
            m141885b(cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
            super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
            C13504g.m81997a("TEVideoFocus", "Focus onCaptureProgressed!");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(@NonNull CameraCaptureSession cameraCaptureSession, int i) {
            super.onCaptureSequenceAborted(cameraCaptureSession, i);
            C13504g.m81998b("TEVideoFocus", "Manual Focus capture abort ");
            TEFocusSettings tEFocusSettings = ish0.this.f148703b;
            if (tEFocusSettings != null) {
                tEFocusSettings.m81703g().mo81717a(-438, ish0.this.f148704c.f56181d, "Manual Focus capture abort ");
            }
            m141885b(cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(@NonNull CameraCaptureSession cameraCaptureSession, int i, long j) {
            super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
            C13504g.m81997a("TEVideoFocus", "Focus onCaptureSequenceCompleted!");
            m141884a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, long j, long j2) {
            super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
            C13504g.m81997a("TEVideoFocus", "Focus onCaptureStarted!");
        }
    }

    /* JADX INFO: renamed from: l.ish0$b */
    public class C17792b extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a */
        private boolean f116669a = false;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f116670b;

        public C17792b(boolean z) {
            this.f116670b = z;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            TEFocusSettings tEFocusSettings;
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
            if (num == null) {
                C13504g.m82006j("TEVideoFocus", "metering failed.");
                return;
            }
            if (num.intValue() == 3 || num.intValue() == 2) {
                if (!this.f116670b && (tEFocusSettings = ish0.this.f148703b) != null && !this.f116669a) {
                    tEFocusSettings.m81703g().mo81717a(ish0.this.f148703b.m81704h(), ish0.this.f148704c.f56181d, "Done");
                    this.f116669a = true;
                }
                ish0 ish0Var = ish0.this;
                if (!ish0Var.f148704c.f56201n) {
                    ish0Var.f116662e.mo81950d();
                }
                C13504g.m81997a("TEVideoFocus", "Manual Metering success");
            }
            ish0 ish0Var2 = ish0.this;
            if (ish0Var2.f148705d) {
                ish0Var2.f148705d = C13496f.m81892k(totalCaptureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            TEFocusSettings tEFocusSettings;
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            if (!this.f116670b && (tEFocusSettings = ish0.this.f148703b) != null) {
                tEFocusSettings.m81703g().mo81717a(-411, ish0.this.f148704c.f56181d, captureFailure.toString());
            }
            C13504g.m81998b("TEVideoFocus", "Manual Metering Failed: " + captureFailure);
        }
    }

    public ish0(@NonNull p6m.InterfaceC19309a interfaceC19309a) {
        this.f116662e = interfaceC19309a;
    }

    @Override // p153l.p6m
    /* JADX INFO: renamed from: a */
    public void mo141880a(@NonNull CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
    }

    @Override // p153l.p6m
    /* JADX INFO: renamed from: b */
    public CameraCaptureSession.CaptureCallback mo141881b(@NonNull CaptureRequest.Builder builder, AtomicBoolean atomicBoolean, boolean z) {
        this.f116663f = atomicBoolean;
        return new C17791a(z, builder);
    }

    @Override // p153l.p6m
    /* JADX INFO: renamed from: c */
    public CameraCaptureSession.CaptureCallback mo141882c(@NonNull CaptureRequest.Builder builder, boolean z) {
        return new C17792b(z);
    }

    @Override // p153l.p6m
    /* JADX INFO: renamed from: d */
    public int mo141883d() {
        return this.f116662e.mo81946a();
    }
}
