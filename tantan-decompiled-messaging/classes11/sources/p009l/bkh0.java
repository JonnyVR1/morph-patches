package p009l;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.p008ss.android.ttvecamera.C0735f;
import com.p008ss.android.ttvecamera.C0743g;
import com.p008ss.android.ttvecamera.TEFocusSettings;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@RequiresApi(api = 21)
public class bkh0 extends hjh0 {

    /* JADX INFO: renamed from: e */
    private final z3m.InterfaceC1341a f10152e;

    /* JADX INFO: renamed from: f */
    private AtomicBoolean f10153f;

    /* JADX INFO: renamed from: l.bkh0$a */
    public class C0785a extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a */
        private int f10154a = -1;

        /* JADX INFO: renamed from: b */
        private boolean f10155b = false;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f10156c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ CaptureRequest.Builder f10157d;

        public C0785a(boolean z, CaptureRequest.Builder builder) {
            this.f10156c = z;
            this.f10157d = builder;
        }

        /* JADX INFO: renamed from: a */
        private void m12080a() {
            if (bkh0.this.f10153f != null) {
                bkh0.this.f10153f.set(false);
            }
        }

        /* JADX INFO: renamed from: b */
        private void m12081b(CameraCaptureSession cameraCaptureSession) {
            if (this.f10156c) {
                this.f10157d.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                bkh0.this.f10152e.mo11116b(cameraCaptureSession, this.f10157d);
            }
            m12080a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull Surface surface, long j) {
            super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
            C0743g.m11166b("TEVideoFocus", "Manual Focus capture buffer lost ");
            TEFocusSettings tEFocusSettings = bkh0.this.f14152b;
            if (tEFocusSettings != null) {
                tEFocusSettings.m10871g().mo10885a(-411, bkh0.this.f14152b.m10872h(), "Manual Focus capture buffer lost ");
            }
            m12081b(cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            if (captureRequest == null || !"FOCUS_TAG".equals(captureRequest.getTag())) {
                C0743g.m11174j("TEVideoFocus", "Not focus request!");
                m12080a();
                return;
            }
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
            CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
            C0743g.m11165a("TEVideoFocus", "Manual Focus onCaptureCompleted: afState = " + num + ", triggerState = " + ((Integer) captureRequest.get(key)));
            if (num == null) {
                C0743g.m11174j("TEVideoFocus", "Focus failed.");
                m12080a();
                return;
            }
            if (this.f10154a != num.intValue() && (num.intValue() == 4 || num.intValue() == 5)) {
                if (this.f10156c) {
                    this.f10157d.set(key, 2);
                    bkh0.this.f10152e.mo11116b(cameraCaptureSession, this.f10157d);
                } else {
                    bkh0 bkh0Var = bkh0.this;
                    if (!bkh0Var.f14153c.f8959n) {
                        bkh0Var.f10152e.mo11114a();
                    }
                }
                if (!this.f10155b) {
                    this.f10155b = true;
                    TEFocusSettings tEFocusSettings = bkh0.this.f14152b;
                    if (tEFocusSettings != null) {
                        tEFocusSettings.m10871g().mo10885a(bkh0.this.f14152b.m10872h(), bkh0.this.f14153c.f8939d, "Done");
                    }
                }
                m12080a();
                C0743g.m11169e("TEVideoFocus", "Focus done, isLock = " + this.f10156c + ", afState = " + num);
            }
            if (this.f10155b && num.intValue() != 4 && num.intValue() != 5) {
                C0743g.m11166b("TEVideoFocus", "afState error!!!, may be re-auto-focus in some device, switch to caf");
                bkh0 bkh0Var2 = bkh0.this;
                if (!bkh0Var2.f14153c.f8959n) {
                    bkh0Var2.f10152e.mo11114a();
                }
            }
            this.f10154a = num.intValue();
            bkh0 bkh0Var3 = bkh0.this;
            if (bkh0Var3.f14154d) {
                bkh0Var3.f14154d = C0735f.m11060k(totalCaptureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            C0743g.m11166b("TEVideoFocus", "Manual Focus Failed: " + captureFailure);
            TEFocusSettings tEFocusSettings = bkh0.this.f14152b;
            if (tEFocusSettings != null) {
                tEFocusSettings.m10871g().mo10885a(-411, bkh0.this.f14153c.f8939d, captureFailure.toString());
            }
            m12081b(cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
            super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
            C0743g.m11165a("TEVideoFocus", "Focus onCaptureProgressed!");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(@NonNull CameraCaptureSession cameraCaptureSession, int i) {
            super.onCaptureSequenceAborted(cameraCaptureSession, i);
            C0743g.m11166b("TEVideoFocus", "Manual Focus capture abort ");
            TEFocusSettings tEFocusSettings = bkh0.this.f14152b;
            if (tEFocusSettings != null) {
                tEFocusSettings.m10871g().mo10885a(-438, bkh0.this.f14153c.f8939d, "Manual Focus capture abort ");
            }
            m12081b(cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(@NonNull CameraCaptureSession cameraCaptureSession, int i, long j) {
            super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
            C0743g.m11165a("TEVideoFocus", "Focus onCaptureSequenceCompleted!");
            m12080a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, long j, long j2) {
            super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
            C0743g.m11165a("TEVideoFocus", "Focus onCaptureStarted!");
        }
    }

    /* JADX INFO: renamed from: l.bkh0$b */
    public class C0786b extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a */
        private boolean f10159a = false;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f10160b;

        public C0786b(boolean z) {
            this.f10160b = z;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            TEFocusSettings tEFocusSettings;
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
            if (num == null) {
                C0743g.m11174j("TEVideoFocus", "metering failed.");
                return;
            }
            if (num.intValue() == 3 || num.intValue() == 2) {
                if (!this.f10160b && (tEFocusSettings = bkh0.this.f14152b) != null && !this.f10159a) {
                    tEFocusSettings.m10871g().mo10885a(bkh0.this.f14152b.m10872h(), bkh0.this.f14153c.f8939d, "Done");
                    this.f10159a = true;
                }
                bkh0 bkh0Var = bkh0.this;
                if (!bkh0Var.f14153c.f8959n) {
                    bkh0Var.f10152e.mo11118d();
                }
                C0743g.m11165a("TEVideoFocus", "Manual Metering success");
            }
            bkh0 bkh0Var2 = bkh0.this;
            if (bkh0Var2.f14154d) {
                bkh0Var2.f14154d = C0735f.m11060k(totalCaptureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            TEFocusSettings tEFocusSettings;
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            if (!this.f10160b && (tEFocusSettings = bkh0.this.f14152b) != null) {
                tEFocusSettings.m10871g().mo10885a(-411, bkh0.this.f14153c.f8939d, captureFailure.toString());
            }
            C0743g.m11166b("TEVideoFocus", "Manual Metering Failed: " + captureFailure);
        }
    }

    public bkh0(@NonNull z3m.InterfaceC1341a interfaceC1341a) {
        this.f10152e = interfaceC1341a;
    }

    @Override // p009l.z3m
    /* JADX INFO: renamed from: a */
    public void mo12076a(@NonNull CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
    }

    @Override // p009l.z3m
    /* JADX INFO: renamed from: b */
    public CameraCaptureSession.CaptureCallback mo12077b(@NonNull CaptureRequest.Builder builder, AtomicBoolean atomicBoolean, boolean z) {
        this.f10153f = atomicBoolean;
        return new C0785a(z, builder);
    }

    @Override // p009l.z3m
    /* JADX INFO: renamed from: c */
    public CameraCaptureSession.CaptureCallback mo12078c(@NonNull CaptureRequest.Builder builder, boolean z) {
        return new C0786b(z);
    }

    @Override // p009l.z3m
    /* JADX INFO: renamed from: d */
    public int mo12079d() {
        return this.f10152e.mo11114a();
    }
}
