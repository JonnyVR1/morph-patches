package p149l;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.annotation.NonNull;
import com.p069ss.android.ttvecamera.C13333f;
import com.p069ss.android.ttvecamera.C13341g;
import com.p069ss.android.ttvecamera.TEFocusSettings;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
@TargetApi(21)
public class ojh0 extends hjh0 {

    /* JADX INFO: renamed from: e */
    private AtomicBoolean f144285e;

    /* JADX INFO: renamed from: f */
    protected z3m.InterfaceC21616a f144286f;

    /* JADX INFO: renamed from: g */
    private boolean f144287g = true;

    /* JADX INFO: renamed from: l.ojh0$a */
    public class C18960a extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a */
        private int f144288a = -1;

        /* JADX INFO: renamed from: b */
        private boolean f144289b = false;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f144290c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ CaptureRequest.Builder f144291d;

        public C18960a(boolean z, CaptureRequest.Builder builder) {
            this.f144290c = z;
            this.f144291d = builder;
        }

        /* JADX INFO: renamed from: a */
        private void m164652a() {
            if (ojh0.this.f144285e != null) {
                ojh0.this.f144285e.set(false);
            }
        }

        /* JADX INFO: renamed from: b */
        private void m164653b(CameraCaptureSession cameraCaptureSession) {
            if (this.f144290c) {
                this.f144291d.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                ojh0.this.f144286f.mo80765b(cameraCaptureSession, this.f144291d);
            }
            m164652a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull Surface surface, long j) {
            super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
            C13341g.m80815b("TEImageFocus", "Manual Focus capture buffer lost ");
            TEFocusSettings tEFocusSettings = ojh0.this.f108082b;
            if (tEFocusSettings != null) {
                tEFocusSettings.m80520g().mo80534a(-411, ojh0.this.f108083c.f55333d, "Manual Focus capture buffer lost ");
            }
            m164653b(cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            if (captureRequest == null || !"FOCUS_TAG".equals(captureRequest.getTag())) {
                C13341g.m80823j("TEImageFocus", "Not focus request!");
                return;
            }
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num == null) {
                C13341g.m80823j("TEImageFocus", "Focus failed.");
                m164652a();
                return;
            }
            if (this.f144288a != num.intValue() && (num.intValue() == 4 || num.intValue() == 5)) {
                if (this.f144290c) {
                    this.f144291d.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    ojh0.this.f144286f.mo80765b(cameraCaptureSession, this.f144291d);
                } else {
                    ojh0 ojh0Var = ojh0.this;
                    if (!ojh0Var.f108083c.f55353n) {
                        ojh0Var.f144286f.mo80763a();
                    }
                }
                if (!this.f144289b) {
                    this.f144289b = true;
                    TEFocusSettings tEFocusSettings = ojh0.this.f108082b;
                    if (tEFocusSettings != null) {
                        tEFocusSettings.m80520g().mo80534a(ojh0.this.f108082b.m80521h(), ojh0.this.f108083c.f55333d, "Done");
                    }
                }
                m164652a();
                C13341g.m80818e("TEImageFocus", "Focus done, isLock = " + this.f144290c + ", afState = " + num);
            }
            if (this.f144289b && num.intValue() != 4 && num.intValue() != 5) {
                C13341g.m80815b("TEImageFocus", "afState error!!!, may be re-auto-focus in some device, switch to caf");
                ojh0 ojh0Var2 = ojh0.this;
                if (!ojh0Var2.f108083c.f55353n) {
                    ojh0Var2.f144286f.mo80763a();
                }
            }
            this.f144288a = num.intValue();
            if (ojh0.this.f144287g) {
                ojh0.this.f144287g = C13333f.m80709k(totalCaptureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            C13341g.m80815b("TEImageFocus", "Manual Focus Failed: " + captureFailure);
            TEFocusSettings tEFocusSettings = ojh0.this.f108082b;
            if (tEFocusSettings != null) {
                tEFocusSettings.m80520g().mo80534a(-411, ojh0.this.f108083c.f55333d, captureFailure.toString());
            }
            m164653b(cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(@NonNull CameraCaptureSession cameraCaptureSession, int i) {
            super.onCaptureSequenceAborted(cameraCaptureSession, i);
            C13341g.m80815b("TEImageFocus", "Manual Focus capture abort ");
            TEFocusSettings tEFocusSettings = ojh0.this.f108082b;
            if (tEFocusSettings != null) {
                tEFocusSettings.m80520g().mo80534a(-438, ojh0.this.f108083c.f55333d, "Manual Focus capture abort ");
            }
            m164653b(cameraCaptureSession);
        }
    }

    /* JADX INFO: renamed from: l.ojh0$b */
    public class C18961b extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f144293a;

        public C18961b(boolean z) {
            this.f144293a = z;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            TEFocusSettings tEFocusSettings;
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
            if (num == null) {
                C13341g.m80823j("TEImageFocus", "metering failed.");
                return;
            }
            if (num.intValue() == 3 || num.intValue() == 2) {
                if (!this.f144293a && (tEFocusSettings = ojh0.this.f108082b) != null) {
                    tEFocusSettings.m80520g().mo80534a(ojh0.this.f108082b.m80521h(), ojh0.this.f108083c.f55333d, "Done");
                }
                ojh0 ojh0Var = ojh0.this;
                if (!ojh0Var.f108083c.f55353n) {
                    ojh0Var.f144286f.mo80767d();
                }
            }
            if (ojh0.this.f144287g) {
                ojh0.this.f144287g = C13333f.m80709k(totalCaptureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            TEFocusSettings tEFocusSettings;
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            if (!this.f144293a && (tEFocusSettings = ojh0.this.f108082b) != null) {
                tEFocusSettings.m80520g().mo80534a(-411, ojh0.this.f108083c.f55333d, captureFailure.toString());
            }
            C13341g.m80815b("TEImageFocus", "Manual Metering Failed: " + captureFailure);
        }
    }

    public ojh0(@NonNull z3m.InterfaceC21616a interfaceC21616a) {
        this.f144286f = interfaceC21616a;
    }

    @Override // p149l.z3m
    /* JADX INFO: renamed from: a */
    public void mo102389a(@NonNull CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 4);
    }

    @Override // p149l.z3m
    /* JADX INFO: renamed from: b */
    public CameraCaptureSession.CaptureCallback mo102390b(@NonNull CaptureRequest.Builder builder, AtomicBoolean atomicBoolean, boolean z) {
        this.f144285e = atomicBoolean;
        return new C18960a(z, builder);
    }

    @Override // p149l.z3m
    /* JADX INFO: renamed from: c */
    public CameraCaptureSession.CaptureCallback mo102391c(@NonNull CaptureRequest.Builder builder, boolean z) {
        return new C18961b(z);
    }

    @Override // p149l.z3m
    /* JADX INFO: renamed from: d */
    public int mo102392d() {
        return this.f144286f.mo80763a();
    }

    @Override // p149l.hjh0
    /* JADX INFO: renamed from: f */
    public void mo121597f(@NonNull CaptureRequest.Builder builder, @NonNull Rect rect) {
        builder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
        super.mo121597f(builder, rect);
    }
}
