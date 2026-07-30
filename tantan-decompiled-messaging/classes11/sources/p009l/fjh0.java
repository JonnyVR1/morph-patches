package p009l;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.p008ss.android.ttvecamera.C0735f;
import com.p008ss.android.ttvecamera.C0743g;
import com.p008ss.android.ttvecamera.TEFocusSettings;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@RequiresApi(api = 21)
public class fjh0 extends hjh0 {

    /* JADX INFO: renamed from: e */
    private final z3m.InterfaceC1341a f13056e;

    /* JADX INFO: renamed from: f */
    private AtomicBoolean f13057f;

    /* JADX INFO: renamed from: l.fjh0$a */
    public class C0898a extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a */
        private int f13058a = -1;

        /* JADX INFO: renamed from: b */
        private boolean f13059b = false;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f13060c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ CaptureRequest.Builder f13061d;

        public C0898a(boolean z, CaptureRequest.Builder builder) {
            this.f13060c = z;
            this.f13061d = builder;
        }

        /* JADX INFO: renamed from: a */
        private void m14485a() {
            if (fjh0.this.f13057f != null) {
                fjh0.this.f13057f.set(false);
            }
        }

        /* JADX INFO: renamed from: b */
        private void m14486b(CameraCaptureSession cameraCaptureSession) {
            if (this.f13060c) {
                this.f13061d.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                fjh0.this.f13056e.mo11116b(cameraCaptureSession, this.f13061d);
            }
            m14485a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull Surface surface, long j) {
            super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
            C0743g.m11166b("TEFocusAndMeterStrategy", "Manual Focus capture buffer lost , session: " + cameraCaptureSession);
            TEFocusSettings tEFocusSettings = fjh0.this.f14152b;
            if (tEFocusSettings != null) {
                tEFocusSettings.m10871g().mo10885a(-411, fjh0.this.f14152b.m10872h(), "Manual Focus capture buffer lost ");
            }
            m14486b(cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            boolean z;
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num == null) {
                C0743g.m11174j("TEFocusAndMeterStrategy", "Focus failed.");
                m14485a();
                return;
            }
            if (this.f13058a != num.intValue()) {
                C0743g.m11169e("TEFocusAndMeterStrategy", "Focus onCaptureCompleted! afState = " + num);
                z = true;
            } else {
                z = false;
            }
            this.f13058a = num.intValue();
            if (z && (num.intValue() == 4 || num.intValue() == 5)) {
                boolean z2 = this.f13060c;
                fjh0 fjh0Var = fjh0.this;
                if (z2) {
                    fjh0Var.f13056e.mo11116b(cameraCaptureSession, this.f13061d);
                } else {
                    fjh0Var.f13056e.mo11114a();
                }
                if (!this.f13059b) {
                    this.f13059b = true;
                    TEFocusSettings tEFocusSettings = fjh0.this.f14152b;
                    if (tEFocusSettings != null) {
                        tEFocusSettings.m10871g().mo10885a(fjh0.this.f14152b.m10872h(), fjh0.this.f14153c.f8939d, "Done");
                    }
                }
                m14485a();
                C0743g.m11169e("TEFocusAndMeterStrategy", "Focus done, isLock = " + this.f13060c + ", afState = " + num);
            }
            if (this.f13059b && num.intValue() != 4 && num.intValue() != 5) {
                C0743g.m11166b("TEFocusAndMeterStrategy", "afState error!!!, may be re-auto-focus in some device, switch to caf");
                fjh0.this.f13056e.mo11114a();
            }
            fjh0 fjh0Var2 = fjh0.this;
            if (fjh0Var2.f14154d) {
                fjh0Var2.f14154d = C0735f.m11060k(totalCaptureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            C0743g.m11166b("TEFocusAndMeterStrategy", "Manual Focus Failed: " + captureFailure + ", session: " + cameraCaptureSession);
            TEFocusSettings tEFocusSettings = fjh0.this.f14152b;
            if (tEFocusSettings != null) {
                tEFocusSettings.m10871g().mo10885a(-411, fjh0.this.f14153c.f8939d, captureFailure.toString());
            }
            m14486b(cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
            super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
            C0743g.m11165a("TEFocusAndMeterStrategy", "Focus onCaptureProgressed!");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(@NonNull CameraCaptureSession cameraCaptureSession, int i) {
            super.onCaptureSequenceAborted(cameraCaptureSession, i);
            C0743g.m11166b("TEFocusAndMeterStrategy", "Manual Focus capture abort ");
            TEFocusSettings tEFocusSettings = fjh0.this.f14152b;
            if (tEFocusSettings != null) {
                tEFocusSettings.m10871g().mo10885a(-438, fjh0.this.f14153c.f8939d, "Manual Focus capture abort ");
            }
            m14486b(cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(@NonNull CameraCaptureSession cameraCaptureSession, int i, long j) {
            super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
            C0743g.m11165a("TEFocusAndMeterStrategy", "Focus onCaptureSequenceCompleted!");
            m14485a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, long j, long j2) {
            super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
            C0743g.m11165a("TEFocusAndMeterStrategy", "Focus onCaptureStarted!");
        }
    }

    /* JADX INFO: renamed from: l.fjh0$b */
    public class C0899b extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a */
        private boolean f13063a = false;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f13064b;

        public C0899b(boolean z) {
            this.f13064b = z;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            TEFocusSettings tEFocusSettings;
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
            if (num == null) {
                C0743g.m11174j("TEFocusAndMeterStrategy", "metering failed.");
                return;
            }
            if (num.intValue() == 3 || num.intValue() == 2) {
                if (!this.f13064b && (tEFocusSettings = fjh0.this.f14152b) != null && !this.f13063a) {
                    tEFocusSettings.m10871g().mo10885a(fjh0.this.f14152b.m10872h(), fjh0.this.f14153c.f8939d, "Done");
                    this.f13063a = true;
                }
                fjh0.this.f13056e.mo11118d();
            }
            fjh0 fjh0Var = fjh0.this;
            if (fjh0Var.f14154d) {
                fjh0Var.f14154d = C0735f.m11060k(totalCaptureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            TEFocusSettings tEFocusSettings;
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            if (!this.f13064b && (tEFocusSettings = fjh0.this.f14152b) != null) {
                tEFocusSettings.m10871g().mo10885a(-411, fjh0.this.f14153c.f8939d, captureFailure.toString());
            }
            C0743g.m11166b("TEFocusAndMeterStrategy", "Manual Metering Failed: " + captureFailure);
        }
    }

    public fjh0(@NonNull z3m.InterfaceC1341a interfaceC1341a) {
        this.f13056e = interfaceC1341a;
    }

    @Override // p009l.z3m
    /* JADX INFO: renamed from: b */
    public CameraCaptureSession.CaptureCallback mo12077b(@NonNull CaptureRequest.Builder builder, AtomicBoolean atomicBoolean, boolean z) {
        this.f13057f = atomicBoolean;
        return new C0898a(z, builder);
    }

    @Override // p009l.z3m
    /* JADX INFO: renamed from: c */
    public CameraCaptureSession.CaptureCallback mo12078c(@NonNull CaptureRequest.Builder builder, boolean z) {
        return new C0899b(z);
    }

    @Override // p009l.z3m
    /* JADX INFO: renamed from: d */
    public int mo12079d() {
        return this.f13056e.mo11114a();
    }

    @Override // p009l.hjh0
    /* JADX INFO: renamed from: e */
    public void mo14483e(@NonNull CaptureRequest.Builder builder, @NonNull Rect rect) {
        builder.set(CaptureRequest.CONTROL_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
    }

    @Override // p009l.hjh0
    /* JADX INFO: renamed from: f */
    public void mo14484f(@NonNull CaptureRequest.Builder builder, @NonNull Rect rect) {
        builder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
    }
}
