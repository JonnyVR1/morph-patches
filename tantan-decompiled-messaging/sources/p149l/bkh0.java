package p149l;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.p069ss.android.ttvecamera.C13333f;
import com.p069ss.android.ttvecamera.C13341g;
import com.p069ss.android.ttvecamera.TEFocusSettings;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
@RequiresApi(api = 21)
public class bkh0 extends hjh0 {

    /* JADX INFO: renamed from: e */
    private final z3m.InterfaceC21616a f76022e;

    /* JADX INFO: renamed from: f */
    private AtomicBoolean f76023f;

    /* JADX INFO: renamed from: l.bkh0$a */
    public class C15889a extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a */
        private int f76024a = -1;

        /* JADX INFO: renamed from: b */
        private boolean f76025b = false;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f76026c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ CaptureRequest.Builder f76027d;

        public C15889a(boolean z, CaptureRequest.Builder builder) {
            this.f76026c = z;
            this.f76027d = builder;
        }

        /* JADX INFO: renamed from: a */
        private void m102393a() {
            if (bkh0.this.f76023f != null) {
                bkh0.this.f76023f.set(false);
            }
        }

        /* JADX INFO: renamed from: b */
        private void m102394b(CameraCaptureSession cameraCaptureSession) {
            if (this.f76026c) {
                this.f76027d.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                bkh0.this.f76022e.mo80765b(cameraCaptureSession, this.f76027d);
            }
            m102393a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull Surface surface, long j) {
            super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
            C13341g.m80815b("TEVideoFocus", "Manual Focus capture buffer lost ");
            TEFocusSettings tEFocusSettings = bkh0.this.f108082b;
            if (tEFocusSettings != null) {
                tEFocusSettings.m80520g().mo80534a(-411, bkh0.this.f108082b.m80521h(), "Manual Focus capture buffer lost ");
            }
            m102394b(cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            if (captureRequest == null || !"FOCUS_TAG".equals(captureRequest.getTag())) {
                C13341g.m80823j("TEVideoFocus", "Not focus request!");
                m102393a();
                return;
            }
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
            CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
            C13341g.m80814a("TEVideoFocus", "Manual Focus onCaptureCompleted: afState = " + num + ", triggerState = " + ((Integer) captureRequest.get(key)));
            if (num == null) {
                C13341g.m80823j("TEVideoFocus", "Focus failed.");
                m102393a();
                return;
            }
            if (this.f76024a != num.intValue() && (num.intValue() == 4 || num.intValue() == 5)) {
                if (this.f76026c) {
                    this.f76027d.set(key, 2);
                    bkh0.this.f76022e.mo80765b(cameraCaptureSession, this.f76027d);
                } else {
                    bkh0 bkh0Var = bkh0.this;
                    if (!bkh0Var.f108083c.f55353n) {
                        bkh0Var.f76022e.mo80763a();
                    }
                }
                if (!this.f76025b) {
                    this.f76025b = true;
                    TEFocusSettings tEFocusSettings = bkh0.this.f108082b;
                    if (tEFocusSettings != null) {
                        tEFocusSettings.m80520g().mo80534a(bkh0.this.f108082b.m80521h(), bkh0.this.f108083c.f55333d, "Done");
                    }
                }
                m102393a();
                C13341g.m80818e("TEVideoFocus", "Focus done, isLock = " + this.f76026c + ", afState = " + num);
            }
            if (this.f76025b && num.intValue() != 4 && num.intValue() != 5) {
                C13341g.m80815b("TEVideoFocus", "afState error!!!, may be re-auto-focus in some device, switch to caf");
                bkh0 bkh0Var2 = bkh0.this;
                if (!bkh0Var2.f108083c.f55353n) {
                    bkh0Var2.f76022e.mo80763a();
                }
            }
            this.f76024a = num.intValue();
            bkh0 bkh0Var3 = bkh0.this;
            if (bkh0Var3.f108084d) {
                bkh0Var3.f108084d = C13333f.m80709k(totalCaptureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            C13341g.m80815b("TEVideoFocus", "Manual Focus Failed: " + captureFailure);
            TEFocusSettings tEFocusSettings = bkh0.this.f108082b;
            if (tEFocusSettings != null) {
                tEFocusSettings.m80520g().mo80534a(-411, bkh0.this.f108083c.f55333d, captureFailure.toString());
            }
            m102394b(cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
            super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
            C13341g.m80814a("TEVideoFocus", "Focus onCaptureProgressed!");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(@NonNull CameraCaptureSession cameraCaptureSession, int i) {
            super.onCaptureSequenceAborted(cameraCaptureSession, i);
            C13341g.m80815b("TEVideoFocus", "Manual Focus capture abort ");
            TEFocusSettings tEFocusSettings = bkh0.this.f108082b;
            if (tEFocusSettings != null) {
                tEFocusSettings.m80520g().mo80534a(-438, bkh0.this.f108083c.f55333d, "Manual Focus capture abort ");
            }
            m102394b(cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(@NonNull CameraCaptureSession cameraCaptureSession, int i, long j) {
            super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
            C13341g.m80814a("TEVideoFocus", "Focus onCaptureSequenceCompleted!");
            m102393a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, long j, long j2) {
            super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
            C13341g.m80814a("TEVideoFocus", "Focus onCaptureStarted!");
        }
    }

    /* JADX INFO: renamed from: l.bkh0$b */
    public class C15890b extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a */
        private boolean f76029a = false;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f76030b;

        public C15890b(boolean z) {
            this.f76030b = z;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            TEFocusSettings tEFocusSettings;
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
            if (num == null) {
                C13341g.m80823j("TEVideoFocus", "metering failed.");
                return;
            }
            if (num.intValue() == 3 || num.intValue() == 2) {
                if (!this.f76030b && (tEFocusSettings = bkh0.this.f108082b) != null && !this.f76029a) {
                    tEFocusSettings.m80520g().mo80534a(bkh0.this.f108082b.m80521h(), bkh0.this.f108083c.f55333d, "Done");
                    this.f76029a = true;
                }
                bkh0 bkh0Var = bkh0.this;
                if (!bkh0Var.f108083c.f55353n) {
                    bkh0Var.f76022e.mo80767d();
                }
                C13341g.m80814a("TEVideoFocus", "Manual Metering success");
            }
            bkh0 bkh0Var2 = bkh0.this;
            if (bkh0Var2.f108084d) {
                bkh0Var2.f108084d = C13333f.m80709k(totalCaptureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            TEFocusSettings tEFocusSettings;
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            if (!this.f76030b && (tEFocusSettings = bkh0.this.f108082b) != null) {
                tEFocusSettings.m80520g().mo80534a(-411, bkh0.this.f108083c.f55333d, captureFailure.toString());
            }
            C13341g.m80815b("TEVideoFocus", "Manual Metering Failed: " + captureFailure);
        }
    }

    public bkh0(@NonNull z3m.InterfaceC21616a interfaceC21616a) {
        this.f76022e = interfaceC21616a;
    }

    @Override // p149l.z3m
    /* JADX INFO: renamed from: a */
    public void mo102389a(@NonNull CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
    }

    @Override // p149l.z3m
    /* JADX INFO: renamed from: b */
    public CameraCaptureSession.CaptureCallback mo102390b(@NonNull CaptureRequest.Builder builder, AtomicBoolean atomicBoolean, boolean z) {
        this.f76023f = atomicBoolean;
        return new C15889a(z, builder);
    }

    @Override // p149l.z3m
    /* JADX INFO: renamed from: c */
    public CameraCaptureSession.CaptureCallback mo102391c(@NonNull CaptureRequest.Builder builder, boolean z) {
        return new C15890b(z);
    }

    @Override // p149l.z3m
    /* JADX INFO: renamed from: d */
    public int mo102392d() {
        return this.f76022e.mo80763a();
    }
}
