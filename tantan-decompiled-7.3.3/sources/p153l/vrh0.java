package p153l;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.annotation.NonNull;
import com.p074ss.android.ttvecamera.C13496f;
import com.p074ss.android.ttvecamera.C13504g;
import com.p074ss.android.ttvecamera.TEFocusSettings;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
@TargetApi(21)
public class vrh0 extends orh0 {

    /* JADX INFO: renamed from: e */
    private AtomicBoolean f185469e;

    /* JADX INFO: renamed from: f */
    protected p6m.InterfaceC19309a f185470f;

    /* JADX INFO: renamed from: g */
    private boolean f185471g = true;

    /* JADX INFO: renamed from: l.vrh0$a */
    public class C20911a extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a */
        private int f185472a = -1;

        /* JADX INFO: renamed from: b */
        private boolean f185473b = false;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f185474c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ CaptureRequest.Builder f185475d;

        public C20911a(boolean z, CaptureRequest.Builder builder) {
            this.f185474c = z;
            this.f185475d = builder;
        }

        /* JADX INFO: renamed from: a */
        private void m202498a() {
            if (vrh0.this.f185469e != null) {
                vrh0.this.f185469e.set(false);
            }
        }

        /* JADX INFO: renamed from: b */
        private void m202499b(CameraCaptureSession cameraCaptureSession) {
            if (this.f185474c) {
                this.f185475d.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                vrh0.this.f185470f.mo81948b(cameraCaptureSession, this.f185475d);
            }
            m202498a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull Surface surface, long j) {
            super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
            C13504g.m81998b("TEImageFocus", "Manual Focus capture buffer lost ");
            TEFocusSettings tEFocusSettings = vrh0.this.f148703b;
            if (tEFocusSettings != null) {
                tEFocusSettings.m81703g().mo81717a(-411, vrh0.this.f148704c.f56181d, "Manual Focus capture buffer lost ");
            }
            m202499b(cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            if (captureRequest == null || !"FOCUS_TAG".equals(captureRequest.getTag())) {
                C13504g.m82006j("TEImageFocus", "Not focus request!");
                return;
            }
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num == null) {
                C13504g.m82006j("TEImageFocus", "Focus failed.");
                m202498a();
                return;
            }
            if (this.f185472a != num.intValue() && (num.intValue() == 4 || num.intValue() == 5)) {
                if (this.f185474c) {
                    this.f185475d.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    vrh0.this.f185470f.mo81948b(cameraCaptureSession, this.f185475d);
                } else {
                    vrh0 vrh0Var = vrh0.this;
                    if (!vrh0Var.f148704c.f56201n) {
                        vrh0Var.f185470f.mo81946a();
                    }
                }
                if (!this.f185473b) {
                    this.f185473b = true;
                    TEFocusSettings tEFocusSettings = vrh0.this.f148703b;
                    if (tEFocusSettings != null) {
                        tEFocusSettings.m81703g().mo81717a(vrh0.this.f148703b.m81704h(), vrh0.this.f148704c.f56181d, "Done");
                    }
                }
                m202498a();
                C13504g.m82001e("TEImageFocus", "Focus done, isLock = " + this.f185474c + ", afState = " + num);
            }
            if (this.f185473b && num.intValue() != 4 && num.intValue() != 5) {
                C13504g.m81998b("TEImageFocus", "afState error!!!, may be re-auto-focus in some device, switch to caf");
                vrh0 vrh0Var2 = vrh0.this;
                if (!vrh0Var2.f148704c.f56201n) {
                    vrh0Var2.f185470f.mo81946a();
                }
            }
            this.f185472a = num.intValue();
            if (vrh0.this.f185471g) {
                vrh0.this.f185471g = C13496f.m81892k(totalCaptureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            C13504g.m81998b("TEImageFocus", "Manual Focus Failed: " + captureFailure);
            TEFocusSettings tEFocusSettings = vrh0.this.f148703b;
            if (tEFocusSettings != null) {
                tEFocusSettings.m81703g().mo81717a(-411, vrh0.this.f148704c.f56181d, captureFailure.toString());
            }
            m202499b(cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(@NonNull CameraCaptureSession cameraCaptureSession, int i) {
            super.onCaptureSequenceAborted(cameraCaptureSession, i);
            C13504g.m81998b("TEImageFocus", "Manual Focus capture abort ");
            TEFocusSettings tEFocusSettings = vrh0.this.f148703b;
            if (tEFocusSettings != null) {
                tEFocusSettings.m81703g().mo81717a(-438, vrh0.this.f148704c.f56181d, "Manual Focus capture abort ");
            }
            m202499b(cameraCaptureSession);
        }
    }

    /* JADX INFO: renamed from: l.vrh0$b */
    public class C20912b extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f185477a;

        public C20912b(boolean z) {
            this.f185477a = z;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            TEFocusSettings tEFocusSettings;
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
            if (num == null) {
                C13504g.m82006j("TEImageFocus", "metering failed.");
                return;
            }
            if (num.intValue() == 3 || num.intValue() == 2) {
                if (!this.f185477a && (tEFocusSettings = vrh0.this.f148703b) != null) {
                    tEFocusSettings.m81703g().mo81717a(vrh0.this.f148703b.m81704h(), vrh0.this.f148704c.f56181d, "Done");
                }
                vrh0 vrh0Var = vrh0.this;
                if (!vrh0Var.f148704c.f56201n) {
                    vrh0Var.f185470f.mo81950d();
                }
            }
            if (vrh0.this.f185471g) {
                vrh0.this.f185471g = C13496f.m81892k(totalCaptureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            TEFocusSettings tEFocusSettings;
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            if (!this.f185477a && (tEFocusSettings = vrh0.this.f148703b) != null) {
                tEFocusSettings.m81703g().mo81717a(-411, vrh0.this.f148704c.f56181d, captureFailure.toString());
            }
            C13504g.m81998b("TEImageFocus", "Manual Metering Failed: " + captureFailure);
        }
    }

    public vrh0(@NonNull p6m.InterfaceC19309a interfaceC19309a) {
        this.f185470f = interfaceC19309a;
    }

    @Override // p153l.p6m
    /* JADX INFO: renamed from: a */
    public void mo141880a(@NonNull CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 4);
    }

    @Override // p153l.p6m
    /* JADX INFO: renamed from: b */
    public CameraCaptureSession.CaptureCallback mo141881b(@NonNull CaptureRequest.Builder builder, AtomicBoolean atomicBoolean, boolean z) {
        this.f185469e = atomicBoolean;
        return new C20911a(z, builder);
    }

    @Override // p153l.p6m
    /* JADX INFO: renamed from: c */
    public CameraCaptureSession.CaptureCallback mo141882c(@NonNull CaptureRequest.Builder builder, boolean z) {
        return new C20912b(z);
    }

    @Override // p153l.p6m
    /* JADX INFO: renamed from: d */
    public int mo141883d() {
        return this.f185470f.mo81946a();
    }

    @Override // p153l.orh0
    /* JADX INFO: renamed from: f */
    public void mo159704f(@NonNull CaptureRequest.Builder builder, @NonNull Rect rect) {
        builder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
        super.mo159704f(builder, rect);
    }
}
