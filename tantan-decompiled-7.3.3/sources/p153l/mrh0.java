package p153l;

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
import com.p074ss.android.ttvecamera.C13496f;
import com.p074ss.android.ttvecamera.C13504g;
import com.p074ss.android.ttvecamera.TEFocusSettings;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
@RequiresApi(api = 21)
public class mrh0 extends orh0 {

    /* JADX INFO: renamed from: e */
    private final p6m.InterfaceC19309a f138371e;

    /* JADX INFO: renamed from: f */
    private AtomicBoolean f138372f;

    /* JADX INFO: renamed from: l.mrh0$a */
    public class C18689a extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a */
        private int f138373a = -1;

        /* JADX INFO: renamed from: b */
        private boolean f138374b = false;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f138375c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ CaptureRequest.Builder f138376d;

        public C18689a(boolean z, CaptureRequest.Builder builder) {
            this.f138375c = z;
            this.f138376d = builder;
        }

        /* JADX INFO: renamed from: a */
        private void m159705a() {
            if (mrh0.this.f138372f != null) {
                mrh0.this.f138372f.set(false);
            }
        }

        /* JADX INFO: renamed from: b */
        private void m159706b(CameraCaptureSession cameraCaptureSession) {
            if (this.f138375c) {
                this.f138376d.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                mrh0.this.f138371e.mo81948b(cameraCaptureSession, this.f138376d);
            }
            m159705a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull Surface surface, long j) {
            super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
            C13504g.m81998b("TEFocusAndMeterStrategy", "Manual Focus capture buffer lost , session: " + cameraCaptureSession);
            TEFocusSettings tEFocusSettings = mrh0.this.f148703b;
            if (tEFocusSettings != null) {
                tEFocusSettings.m81703g().mo81717a(-411, mrh0.this.f148703b.m81704h(), "Manual Focus capture buffer lost ");
            }
            m159706b(cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            boolean z;
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num == null) {
                C13504g.m82006j("TEFocusAndMeterStrategy", "Focus failed.");
                m159705a();
                return;
            }
            if (this.f138373a != num.intValue()) {
                C13504g.m82001e("TEFocusAndMeterStrategy", "Focus onCaptureCompleted! afState = " + num);
                z = true;
            } else {
                z = false;
            }
            this.f138373a = num.intValue();
            if (z && (num.intValue() == 4 || num.intValue() == 5)) {
                boolean z2 = this.f138375c;
                mrh0 mrh0Var = mrh0.this;
                if (z2) {
                    mrh0Var.f138371e.mo81948b(cameraCaptureSession, this.f138376d);
                } else {
                    mrh0Var.f138371e.mo81946a();
                }
                if (!this.f138374b) {
                    this.f138374b = true;
                    TEFocusSettings tEFocusSettings = mrh0.this.f148703b;
                    if (tEFocusSettings != null) {
                        tEFocusSettings.m81703g().mo81717a(mrh0.this.f148703b.m81704h(), mrh0.this.f148704c.f56181d, "Done");
                    }
                }
                m159705a();
                C13504g.m82001e("TEFocusAndMeterStrategy", "Focus done, isLock = " + this.f138375c + ", afState = " + num);
            }
            if (this.f138374b && num.intValue() != 4 && num.intValue() != 5) {
                C13504g.m81998b("TEFocusAndMeterStrategy", "afState error!!!, may be re-auto-focus in some device, switch to caf");
                mrh0.this.f138371e.mo81946a();
            }
            mrh0 mrh0Var2 = mrh0.this;
            if (mrh0Var2.f148705d) {
                mrh0Var2.f148705d = C13496f.m81892k(totalCaptureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            C13504g.m81998b("TEFocusAndMeterStrategy", "Manual Focus Failed: " + captureFailure + ", session: " + cameraCaptureSession);
            TEFocusSettings tEFocusSettings = mrh0.this.f148703b;
            if (tEFocusSettings != null) {
                tEFocusSettings.m81703g().mo81717a(-411, mrh0.this.f148704c.f56181d, captureFailure.toString());
            }
            m159706b(cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
            super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
            C13504g.m81997a("TEFocusAndMeterStrategy", "Focus onCaptureProgressed!");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(@NonNull CameraCaptureSession cameraCaptureSession, int i) {
            super.onCaptureSequenceAborted(cameraCaptureSession, i);
            C13504g.m81998b("TEFocusAndMeterStrategy", "Manual Focus capture abort ");
            TEFocusSettings tEFocusSettings = mrh0.this.f148703b;
            if (tEFocusSettings != null) {
                tEFocusSettings.m81703g().mo81717a(-438, mrh0.this.f148704c.f56181d, "Manual Focus capture abort ");
            }
            m159706b(cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(@NonNull CameraCaptureSession cameraCaptureSession, int i, long j) {
            super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
            C13504g.m81997a("TEFocusAndMeterStrategy", "Focus onCaptureSequenceCompleted!");
            m159705a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, long j, long j2) {
            super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
            C13504g.m81997a("TEFocusAndMeterStrategy", "Focus onCaptureStarted!");
        }
    }

    /* JADX INFO: renamed from: l.mrh0$b */
    public class C18690b extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a */
        private boolean f138378a = false;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f138379b;

        public C18690b(boolean z) {
            this.f138379b = z;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            TEFocusSettings tEFocusSettings;
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
            if (num == null) {
                C13504g.m82006j("TEFocusAndMeterStrategy", "metering failed.");
                return;
            }
            if (num.intValue() == 3 || num.intValue() == 2) {
                if (!this.f138379b && (tEFocusSettings = mrh0.this.f148703b) != null && !this.f138378a) {
                    tEFocusSettings.m81703g().mo81717a(mrh0.this.f148703b.m81704h(), mrh0.this.f148704c.f56181d, "Done");
                    this.f138378a = true;
                }
                mrh0.this.f138371e.mo81950d();
            }
            mrh0 mrh0Var = mrh0.this;
            if (mrh0Var.f148705d) {
                mrh0Var.f148705d = C13496f.m81892k(totalCaptureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            TEFocusSettings tEFocusSettings;
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            if (!this.f138379b && (tEFocusSettings = mrh0.this.f148703b) != null) {
                tEFocusSettings.m81703g().mo81717a(-411, mrh0.this.f148704c.f56181d, captureFailure.toString());
            }
            C13504g.m81998b("TEFocusAndMeterStrategy", "Manual Metering Failed: " + captureFailure);
        }
    }

    public mrh0(@NonNull p6m.InterfaceC19309a interfaceC19309a) {
        this.f138371e = interfaceC19309a;
    }

    @Override // p153l.p6m
    /* JADX INFO: renamed from: b */
    public CameraCaptureSession.CaptureCallback mo141881b(@NonNull CaptureRequest.Builder builder, AtomicBoolean atomicBoolean, boolean z) {
        this.f138372f = atomicBoolean;
        return new C18689a(z, builder);
    }

    @Override // p153l.p6m
    /* JADX INFO: renamed from: c */
    public CameraCaptureSession.CaptureCallback mo141882c(@NonNull CaptureRequest.Builder builder, boolean z) {
        return new C18690b(z);
    }

    @Override // p153l.p6m
    /* JADX INFO: renamed from: d */
    public int mo141883d() {
        return this.f138371e.mo81946a();
    }

    @Override // p153l.orh0
    /* JADX INFO: renamed from: e */
    public void mo159703e(@NonNull CaptureRequest.Builder builder, @NonNull Rect rect) {
        builder.set(CaptureRequest.CONTROL_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, RoomDatabase.MAX_BIND_PARAMETER_CNT)});
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
    }

    @Override // p153l.orh0
    /* JADX INFO: renamed from: f */
    public void mo159704f(@NonNull CaptureRequest.Builder builder, @NonNull Rect rect) {
        builder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, RoomDatabase.MAX_BIND_PARAMETER_CNT)});
    }
}
