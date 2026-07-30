package p153l;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.os.Handler;
import android.util.Range;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import com.p074ss.android.ttvecamera.C13486b;
import com.p074ss.android.ttvecamera.C13504g;
import com.p074ss.android.ttvecamera.TECameraSettings;
import com.p074ss.android.ttvecamera.framework.TECameraModeBase;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
@TargetApi(21)
public class hsh0 extends TECameraModeBase {

    /* JADX INFO: renamed from: X */
    private static final String f111444X = "hsh0";

    /* JADX INFO: renamed from: l.hsh0$a */
    public class RunnableC17570a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f111445a;

        public RunnableC17570a(int i) {
            this.f111445a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((TECameraModeBase) hsh0.this).f56383f.mo81678c(((TECameraModeBase) hsh0.this).f56385h.f56177b, this.f111445a, "updateCapture : something wrong.", ((TECameraModeBase) hsh0.this).f56387j);
        }
    }

    public hsh0(C13486b c13486b, Context context, CameraManager cameraManager, Handler handler) {
        super(c13486b, context, handler);
        this.f56382e = cameraManager;
        if (this.f56385h.f56199m) {
            this.f56386i = new jsh0(this);
        } else {
            this.f56386i = new ish0(this);
        }
    }

    @Override // com.p074ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: E */
    public int mo81924E() {
        return 3;
    }

    @Override // p153l.o6m
    /* JADX INFO: renamed from: c */
    public void mo136976c(int i) {
        CaptureRequest.Builder builder = this.f56380c;
        if (builder == null) {
            String str = f111444X;
            C13504g.m81998b(str, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: mCaptureRequestBuilder is null");
            C13504g.m81998b(str, "switchFlashMode: CaptureRequest.Builder is null");
            this.f56383f.mo81678c(this.f56385h.f56177b, -100, "switchFlashMode:CaptureRequest.Builder is null", this.f56387j);
            this.f56383f.mo81682g(this.f56385h.f56177b, -100, i == 0 ? 0 : 1, "switchFlashMode:CaptureRequest.Builder is null", this.f56387j);
            return;
        }
        if (i == 0) {
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.f56380c.set(CaptureRequest.FLASH_MODE, 0);
        } else {
            if (i != 2) {
                String str2 = f111444X;
                C13504g.m81998b(str2, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: not support flash mode " + i);
                C13504g.m82006j(str2, "Video Mode not support this mode : " + i);
                this.f56383f.mo81682g(this.f56385h.f56177b, -100, -1, "Video Mode not support this mode : " + i, this.f56387j);
                return;
            }
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.f56380c.set(CaptureRequest.FLASH_MODE, 2);
        }
        this.f56385h.f56182d0 = i;
        this.f56383f.mo81680e(104, 0, "camera2 will change flash mode " + i, null);
        TECameraModeBase.C13503f c13503fM81984v0 = m81984v0(this.f56380c);
        this.f56383f.mo81680e(105, 0, "camera2 did change flash mode " + i, null);
        if (c13503fM81984v0.m81996c()) {
            this.f56383f.mo81683h(this.f56385h.f56177b, 0, i != 0 ? 1 : 0, "torch success", this.f56387j);
            return;
        }
        C13504g.m81998b(f111444X, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -418. Reason: " + c13503fM81984v0.m81994a());
        this.f56383f.mo81680e(-418, -418, "switch flash failed." + c13503fM81984v0.m81994a(), this.f56387j);
        this.f56383f.mo81682g(this.f56385h.f56177b, -418, i == 0 ? 0 : 1, "switch flash failed." + c13503fM81984v0.m81994a(), this.f56387j);
    }

    @Override // com.p074ss.android.ttvecamera.framework.TECameraModeBase
    @RequiresApi(api = 28)
    /* JADX INFO: renamed from: m0 */
    public int mo81967m0() throws Exception {
        jrh0 jrh0VarM81828K = this.f56384g.m81828K();
        if (this.f56387j == null || jrh0VarM81828K == null) {
            C13504g.m81997a(f111444X, "CameraDevice or ProviderManager is null!");
            return -100;
        }
        int iM81937R = super.m81937R();
        if (iM81937R != 0) {
            return iM81937R;
        }
        TECameraSettings tECameraSettings = this.f56385h;
        if (!tECameraSettings.f56204o0 || this.f56380c == null) {
            boolean z = tECameraSettings.f56153E.getBoolean("enablePreviewTemplate");
            CameraDevice cameraDevice = this.f56387j;
            if (z) {
                this.f56380c = cameraDevice.createCaptureRequest(1);
            } else {
                this.f56380c = cameraDevice.createCaptureRequest(3);
            }
        }
        ArrayList arrayList = new ArrayList();
        if (jrh0VarM81828K.m146742f().mo99913g() == 8) {
            arrayList.addAll(Arrays.asList(jrh0VarM81828K.m146741e()));
        } else if (jrh0VarM81828K.m146742f().mo99913g() == 16) {
            arrayList.add(jrh0VarM81828K.m146740d());
            arrayList.add(jrh0VarM81828K.m146742f().mo99910b());
        } else {
            arrayList.add(jrh0VarM81828K.m146740d());
        }
        boolean z2 = false;
        for (Surface surface : arrayList) {
            this.f56380c.addTarget(surface);
            if (!surface.isValid()) {
                z2 = true;
            }
        }
        this.f56380c.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, mo81976r(new Range<>(Integer.valueOf(this.f56356B.min / this.f56385h.f56179c.fpsUnitFactor), Integer.valueOf(this.f56356B.max / this.f56385h.f56179c.fpsUnitFactor))));
        if (z2) {
            C13504g.m81998b(f111444X, "start preview may be failed, surface invalid...");
        }
        this.f56361G = false;
        this.f56362H = System.currentTimeMillis();
        Handler handlerM81923D = this.f56385h.f56195k ? m81923D() : this.f56388k;
        if (this.f56385h.f56204o0) {
            if (!this.f56373S.isEmpty() && !this.f56372R) {
                for (int i = 0; i < arrayList.size(); i++) {
                    this.f56373S.get(i).addSurface(arrayList.get(i));
                    this.f56372R = true;
                }
            }
            if (Build.VERSION.SDK_INT >= 28 && this.f56381d != null) {
                this.f56381d.finalizeOutputConfigurations(this.f56373S);
                this.f56371Q = true;
                C13504g.m81997a(f111444X, "finalizeOutputConfigurations in startPreview");
                try {
                    int iMo81983u0 = mo81983u0();
                    if (iMo81983u0 != 0) {
                        m81936Q();
                        RunnableC17570a runnableC17570a = new RunnableC17570a(iMo81983u0);
                        if (this.f56385h.f56195k) {
                            this.f56388k.post(runnableC17570a);
                        } else {
                            runnableC17570a.run();
                        }
                    }
                } catch (Exception e) {
                    m81936Q();
                    e.printStackTrace();
                }
            }
        } else {
            this.f56381d = null;
            mo81980t(arrayList, this.f56376V, handlerM81923D);
        }
        if (this.f56381d == null) {
            m81992z0();
        }
        return 0;
    }

    @Override // com.p074ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: n0 */
    public int mo81969n0() {
        return super.mo81969n0();
    }

    @Override // com.p074ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: p0 */
    public int mo81973p0() {
        return super.mo81973p0();
    }
}
