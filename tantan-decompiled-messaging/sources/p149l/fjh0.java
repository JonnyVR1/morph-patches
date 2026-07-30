package p149l;

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
import androidx.room.RoomDatabase;
import com.p069ss.android.ttvecamera.C13333f;
import com.p069ss.android.ttvecamera.C13341g;
import com.p069ss.android.ttvecamera.TEFocusSettings;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
@RequiresApi(api = 21)
public class fjh0 extends hjh0 {

    /* JADX INFO: renamed from: e */
    private final z3m.InterfaceC21616a f97779e;

    /* JADX INFO: renamed from: f */
    private AtomicBoolean f97780f;

    /* JADX INFO: renamed from: l.fjh0$a */
    public class C16851a extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a */
        private int f97781a = -1;

        /* JADX INFO: renamed from: b */
        private boolean f97782b = false;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f97783c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ CaptureRequest.Builder f97784d;

        public C16851a(boolean z, CaptureRequest.Builder builder) {
            this.f97783c = z;
            this.f97784d = builder;
        }

        /* JADX INFO: renamed from: a */
        private void m121598a() {
            if (fjh0.this.f97780f != null) {
                fjh0.this.f97780f.set(false);
            }
        }

        /* JADX INFO: renamed from: b */
        private void m121599b(CameraCaptureSession cameraCaptureSession) {
            if (this.f97783c) {
                this.f97784d.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                fjh0.this.f97779e.mo80765b(cameraCaptureSession, this.f97784d);
            }
            m121598a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull Surface surface, long j) {
            super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
            C13341g.m80815b("TEFocusAndMeterStrategy", "Manual Focus capture buffer lost , session: " + cameraCaptureSession);
            TEFocusSettings tEFocusSettings = fjh0.this.f108082b;
            if (tEFocusSettings != null) {
                tEFocusSettings.m80520g().mo80534a(-411, fjh0.this.f108082b.m80521h(), "Manual Focus capture buffer lost ");
            }
            m121599b(cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            boolean z;
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num == null) {
                C13341g.m80823j("TEFocusAndMeterStrategy", "Focus failed.");
                m121598a();
                return;
            }
            if (this.f97781a != num.intValue()) {
                C13341g.m80818e("TEFocusAndMeterStrategy", "Focus onCaptureCompleted! afState = " + num);
                z = true;
            } else {
                z = false;
            }
            this.f97781a = num.intValue();
            if (z && (num.intValue() == 4 || num.intValue() == 5)) {
                boolean z2 = this.f97783c;
                fjh0 fjh0Var = fjh0.this;
                if (z2) {
                    fjh0Var.f97779e.mo80765b(cameraCaptureSession, this.f97784d);
                } else {
                    fjh0Var.f97779e.mo80763a();
                }
                if (!this.f97782b) {
                    this.f97782b = true;
                    TEFocusSettings tEFocusSettings = fjh0.this.f108082b;
                    if (tEFocusSettings != null) {
                        tEFocusSettings.m80520g().mo80534a(fjh0.this.f108082b.m80521h(), fjh0.this.f108083c.f55333d, "Done");
                    }
                }
                m121598a();
                C13341g.m80818e("TEFocusAndMeterStrategy", "Focus done, isLock = " + this.f97783c + ", afState = " + num);
            }
            if (this.f97782b && num.intValue() != 4 && num.intValue() != 5) {
                C13341g.m80815b("TEFocusAndMeterStrategy", "afState error!!!, may be re-auto-focus in some device, switch to caf");
                fjh0.this.f97779e.mo80763a();
            }
            fjh0 fjh0Var2 = fjh0.this;
            if (fjh0Var2.f108084d) {
                fjh0Var2.f108084d = C13333f.m80709k(totalCaptureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            C13341g.m80815b("TEFocusAndMeterStrategy", "Manual Focus Failed: " + captureFailure + ", session: " + cameraCaptureSession);
            TEFocusSettings tEFocusSettings = fjh0.this.f108082b;
            if (tEFocusSettings != null) {
                tEFocusSettings.m80520g().mo80534a(-411, fjh0.this.f108083c.f55333d, captureFailure.toString());
            }
            m121599b(cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
            super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
            C13341g.m80814a("TEFocusAndMeterStrategy", "Focus onCaptureProgressed!");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(@NonNull CameraCaptureSession cameraCaptureSession, int i) {
            super.onCaptureSequenceAborted(cameraCaptureSession, i);
            C13341g.m80815b("TEFocusAndMeterStrategy", "Manual Focus capture abort ");
            TEFocusSettings tEFocusSettings = fjh0.this.f108082b;
            if (tEFocusSettings != null) {
                tEFocusSettings.m80520g().mo80534a(-438, fjh0.this.f108083c.f55333d, "Manual Focus capture abort ");
            }
            m121599b(cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(@NonNull CameraCaptureSession cameraCaptureSession, int i, long j) {
            super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
            C13341g.m80814a("TEFocusAndMeterStrategy", "Focus onCaptureSequenceCompleted!");
            m121598a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, long j, long j2) {
            super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
            C13341g.m80814a("TEFocusAndMeterStrategy", "Focus onCaptureStarted!");
        }
    }

    /* JADX INFO: renamed from: l.fjh0$b */
    public class C16852b extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a */
        private boolean f97786a = false;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f97787b;

        public C16852b(boolean z) {
            this.f97787b = z;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            TEFocusSettings tEFocusSettings;
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
            if (num == null) {
                C13341g.m80823j("TEFocusAndMeterStrategy", "metering failed.");
                return;
            }
            if (num.intValue() == 3 || num.intValue() == 2) {
                if (!this.f97787b && (tEFocusSettings = fjh0.this.f108082b) != null && !this.f97786a) {
                    tEFocusSettings.m80520g().mo80534a(fjh0.this.f108082b.m80521h(), fjh0.this.f108083c.f55333d, "Done");
                    this.f97786a = true;
                }
                fjh0.this.f97779e.mo80767d();
            }
            fjh0 fjh0Var = fjh0.this;
            if (fjh0Var.f108084d) {
                fjh0Var.f108084d = C13333f.m80709k(totalCaptureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            TEFocusSettings tEFocusSettings;
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            if (!this.f97787b && (tEFocusSettings = fjh0.this.f108082b) != null) {
                tEFocusSettings.m80520g().mo80534a(-411, fjh0.this.f108083c.f55333d, captureFailure.toString());
            }
            C13341g.m80815b("TEFocusAndMeterStrategy", "Manual Metering Failed: " + captureFailure);
        }
    }

    public fjh0(@NonNull z3m.InterfaceC21616a interfaceC21616a) {
        this.f97779e = interfaceC21616a;
    }

    @Override // p149l.z3m
    /* JADX INFO: renamed from: b */
    public CameraCaptureSession.CaptureCallback mo102390b(@NonNull CaptureRequest.Builder builder, AtomicBoolean atomicBoolean, boolean z) {
        this.f97780f = atomicBoolean;
        return new C16851a(z, builder);
    }

    @Override // p149l.z3m
    /* JADX INFO: renamed from: c */
    public CameraCaptureSession.CaptureCallback mo102391c(@NonNull CaptureRequest.Builder builder, boolean z) {
        return new C16852b(z);
    }

    @Override // p149l.z3m
    /* JADX INFO: renamed from: d */
    public int mo102392d() {
        return this.f97779e.mo80763a();
    }

    @Override // p149l.hjh0
    /* JADX INFO: renamed from: e */
    public void mo121596e(@NonNull CaptureRequest.Builder builder, @NonNull Rect rect) {
        builder.set(CaptureRequest.CONTROL_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, RoomDatabase.MAX_BIND_PARAMETER_CNT)});
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
    }

    @Override // p149l.hjh0
    /* JADX INFO: renamed from: f */
    public void mo121597f(@NonNull CaptureRequest.Builder builder, @NonNull Rect rect) {
        builder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, RoomDatabase.MAX_BIND_PARAMETER_CNT)});
    }
}
