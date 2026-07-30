package p009l;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.annotation.NonNull;
import com.p008ss.android.ttvecamera.C0735f;
import com.p008ss.android.ttvecamera.C0743g;
import com.p008ss.android.ttvecamera.TEFocusSettings;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@TargetApi(21)
public class ojh0 extends hjh0 {

    /* JADX INFO: renamed from: e */
    private AtomicBoolean f18109e;

    /* JADX INFO: renamed from: f */
    protected z3m.InterfaceC1341a f18110f;

    /* JADX INFO: renamed from: g */
    private boolean f18111g = true;

    /* JADX INFO: renamed from: l.ojh0$a */
    public class C1082a extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a */
        private int f18112a = -1;

        /* JADX INFO: renamed from: b */
        private boolean f18113b = false;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f18114c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ CaptureRequest.Builder f18115d;

        public C1082a(boolean z, CaptureRequest.Builder builder) {
            this.f18114c = z;
            this.f18115d = builder;
        }

        /* JADX INFO: renamed from: a */
        private void m19855a() {
            if (ojh0.this.f18109e != null) {
                ojh0.this.f18109e.set(false);
            }
        }

        /* JADX INFO: renamed from: b */
        private void m19856b(CameraCaptureSession cameraCaptureSession) {
            if (this.f18114c) {
                this.f18115d.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                ojh0.this.f18110f.mo11116b(cameraCaptureSession, this.f18115d);
            }
            m19855a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull Surface surface, long j) {
            super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
            C0743g.m11166b("TEImageFocus", "Manual Focus capture buffer lost ");
            TEFocusSettings tEFocusSettings = ojh0.this.f14152b;
            if (tEFocusSettings != null) {
                tEFocusSettings.m10871g().mo10885a(-411, ojh0.this.f14153c.f8939d, "Manual Focus capture buffer lost ");
            }
            m19856b(cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            if (captureRequest == null || !"FOCUS_TAG".equals(captureRequest.getTag())) {
                C0743g.m11174j("TEImageFocus", "Not focus request!");
                return;
            }
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num == null) {
                C0743g.m11174j("TEImageFocus", "Focus failed.");
                m19855a();
                return;
            }
            if (this.f18112a != num.intValue() && (num.intValue() == 4 || num.intValue() == 5)) {
                if (this.f18114c) {
                    this.f18115d.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    ojh0.this.f18110f.mo11116b(cameraCaptureSession, this.f18115d);
                } else {
                    ojh0 ojh0Var = ojh0.this;
                    if (!ojh0Var.f14153c.f8959n) {
                        ojh0Var.f18110f.mo11114a();
                    }
                }
                if (!this.f18113b) {
                    this.f18113b = true;
                    TEFocusSettings tEFocusSettings = ojh0.this.f14152b;
                    if (tEFocusSettings != null) {
                        tEFocusSettings.m10871g().mo10885a(ojh0.this.f14152b.m10872h(), ojh0.this.f14153c.f8939d, "Done");
                    }
                }
                m19855a();
                C0743g.m11169e("TEImageFocus", "Focus done, isLock = " + this.f18114c + ", afState = " + num);
            }
            if (this.f18113b && num.intValue() != 4 && num.intValue() != 5) {
                C0743g.m11166b("TEImageFocus", "afState error!!!, may be re-auto-focus in some device, switch to caf");
                ojh0 ojh0Var2 = ojh0.this;
                if (!ojh0Var2.f14153c.f8959n) {
                    ojh0Var2.f18110f.mo11114a();
                }
            }
            this.f18112a = num.intValue();
            if (ojh0.this.f18111g) {
                ojh0.this.f18111g = C0735f.m11060k(totalCaptureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            C0743g.m11166b("TEImageFocus", "Manual Focus Failed: " + captureFailure);
            TEFocusSettings tEFocusSettings = ojh0.this.f14152b;
            if (tEFocusSettings != null) {
                tEFocusSettings.m10871g().mo10885a(-411, ojh0.this.f14153c.f8939d, captureFailure.toString());
            }
            m19856b(cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(@NonNull CameraCaptureSession cameraCaptureSession, int i) {
            super.onCaptureSequenceAborted(cameraCaptureSession, i);
            C0743g.m11166b("TEImageFocus", "Manual Focus capture abort ");
            TEFocusSettings tEFocusSettings = ojh0.this.f14152b;
            if (tEFocusSettings != null) {
                tEFocusSettings.m10871g().mo10885a(-438, ojh0.this.f14153c.f8939d, "Manual Focus capture abort ");
            }
            m19856b(cameraCaptureSession);
        }
    }

    /* JADX INFO: renamed from: l.ojh0$b */
    public class C1083b extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f18117a;

        public C1083b(boolean z) {
            this.f18117a = z;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            TEFocusSettings tEFocusSettings;
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
            if (num == null) {
                C0743g.m11174j("TEImageFocus", "metering failed.");
                return;
            }
            if (num.intValue() == 3 || num.intValue() == 2) {
                if (!this.f18117a && (tEFocusSettings = ojh0.this.f14152b) != null) {
                    tEFocusSettings.m10871g().mo10885a(ojh0.this.f14152b.m10872h(), ojh0.this.f14153c.f8939d, "Done");
                }
                ojh0 ojh0Var = ojh0.this;
                if (!ojh0Var.f14153c.f8959n) {
                    ojh0Var.f18110f.mo11118d();
                }
            }
            if (ojh0.this.f18111g) {
                ojh0.this.f18111g = C0735f.m11060k(totalCaptureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            TEFocusSettings tEFocusSettings;
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            if (!this.f18117a && (tEFocusSettings = ojh0.this.f14152b) != null) {
                tEFocusSettings.m10871g().mo10885a(-411, ojh0.this.f14153c.f8939d, captureFailure.toString());
            }
            C0743g.m11166b("TEImageFocus", "Manual Metering Failed: " + captureFailure);
        }
    }

    public ojh0(@NonNull z3m.InterfaceC1341a interfaceC1341a) {
        this.f18110f = interfaceC1341a;
    }

    @Override // p009l.z3m
    /* JADX INFO: renamed from: a */
    public void mo12076a(@NonNull CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 4);
    }

    @Override // p009l.z3m
    /* JADX INFO: renamed from: b */
    public CameraCaptureSession.CaptureCallback mo12077b(@NonNull CaptureRequest.Builder builder, AtomicBoolean atomicBoolean, boolean z) {
        this.f18109e = atomicBoolean;
        return new C1082a(z, builder);
    }

    @Override // p009l.z3m
    /* JADX INFO: renamed from: c */
    public CameraCaptureSession.CaptureCallback mo12078c(@NonNull CaptureRequest.Builder builder, boolean z) {
        return new C1083b(z);
    }

    @Override // p009l.z3m
    /* JADX INFO: renamed from: d */
    public int mo12079d() {
        return this.f18110f.mo11114a();
    }

    @Override // p009l.hjh0
    /* JADX INFO: renamed from: f */
    public void mo14484f(@NonNull CaptureRequest.Builder builder, @NonNull Rect rect) {
        builder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
        super.mo14484f(builder, rect);
    }
}
