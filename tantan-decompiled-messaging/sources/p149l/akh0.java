package p149l;

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
import com.p069ss.android.ttvecamera.C13323b;
import com.p069ss.android.ttvecamera.C13341g;
import com.p069ss.android.ttvecamera.TECameraSettings;
import com.p069ss.android.ttvecamera.framework.TECameraModeBase;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
@TargetApi(21)
public class akh0 extends TECameraModeBase {

    /* JADX INFO: renamed from: X */
    private static final String f70276X = "akh0";

    /* JADX INFO: renamed from: l.akh0$a */
    public class RunnableC15646a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f70277a;

        public RunnableC15646a(int i) {
            this.f70277a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((TECameraModeBase) akh0.this).f55535f.mo80495c(((TECameraModeBase) akh0.this).f55537h.f55329b, this.f70277a, "updateCapture : something wrong.", ((TECameraModeBase) akh0.this).f55539j);
        }
    }

    public akh0(C13323b c13323b, Context context, CameraManager cameraManager, Handler handler) {
        super(c13323b, context, handler);
        this.f55534e = cameraManager;
        if (this.f55537h.f55351m) {
            this.f55538i = new ckh0(this);
        } else {
            this.f55538i = new bkh0(this);
        }
    }

    @Override // com.p069ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: E */
    public int mo80741E() {
        return 3;
    }

    @Override // p149l.y3m
    /* JADX INFO: renamed from: c */
    public void mo97150c(int i) {
        CaptureRequest.Builder builder = this.f55532c;
        if (builder == null) {
            String str = f70276X;
            C13341g.m80815b(str, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: mCaptureRequestBuilder is null");
            C13341g.m80815b(str, "switchFlashMode: CaptureRequest.Builder is null");
            this.f55535f.mo80495c(this.f55537h.f55329b, -100, "switchFlashMode:CaptureRequest.Builder is null", this.f55539j);
            this.f55535f.mo80499g(this.f55537h.f55329b, -100, i == 0 ? 0 : 1, "switchFlashMode:CaptureRequest.Builder is null", this.f55539j);
            return;
        }
        if (i == 0) {
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.f55532c.set(CaptureRequest.FLASH_MODE, 0);
        } else {
            if (i != 2) {
                String str2 = f70276X;
                C13341g.m80815b(str2, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: not support flash mode " + i);
                C13341g.m80823j(str2, "Video Mode not support this mode : " + i);
                this.f55535f.mo80499g(this.f55537h.f55329b, -100, -1, "Video Mode not support this mode : " + i, this.f55539j);
                return;
            }
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.f55532c.set(CaptureRequest.FLASH_MODE, 2);
        }
        this.f55537h.f55334d0 = i;
        this.f55535f.mo80497e(104, 0, "camera2 will change flash mode " + i, null);
        TECameraModeBase.C13340f c13340fM80801v0 = m80801v0(this.f55532c);
        this.f55535f.mo80497e(105, 0, "camera2 did change flash mode " + i, null);
        if (c13340fM80801v0.m80813c()) {
            this.f55535f.mo80500h(this.f55537h.f55329b, 0, i != 0 ? 1 : 0, "torch success", this.f55539j);
            return;
        }
        C13341g.m80815b(f70276X, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -418. Reason: " + c13340fM80801v0.m80811a());
        this.f55535f.mo80497e(-418, -418, "switch flash failed." + c13340fM80801v0.m80811a(), this.f55539j);
        this.f55535f.mo80499g(this.f55537h.f55329b, -418, i == 0 ? 0 : 1, "switch flash failed." + c13340fM80801v0.m80811a(), this.f55539j);
    }

    @Override // com.p069ss.android.ttvecamera.framework.TECameraModeBase
    @RequiresApi(api = 28)
    /* JADX INFO: renamed from: m0 */
    public int mo80784m0() throws Exception {
        cjh0 cjh0VarM80645K = this.f55536g.m80645K();
        if (this.f55539j == null || cjh0VarM80645K == null) {
            C13341g.m80814a(f70276X, "CameraDevice or ProviderManager is null!");
            return -100;
        }
        int iM80754R = super.m80754R();
        if (iM80754R != 0) {
            return iM80754R;
        }
        TECameraSettings tECameraSettings = this.f55537h;
        if (!tECameraSettings.f55356o0 || this.f55532c == null) {
            boolean z = tECameraSettings.f55305E.getBoolean("enablePreviewTemplate");
            CameraDevice cameraDevice = this.f55539j;
            if (z) {
                this.f55532c = cameraDevice.createCaptureRequest(1);
            } else {
                this.f55532c = cameraDevice.createCaptureRequest(3);
            }
        }
        ArrayList arrayList = new ArrayList();
        if (cjh0VarM80645K.m107164f().mo102173g() == 8) {
            arrayList.addAll(Arrays.asList(cjh0VarM80645K.m107163e()));
        } else if (cjh0VarM80645K.m107164f().mo102173g() == 16) {
            arrayList.add(cjh0VarM80645K.m107162d());
            arrayList.add(cjh0VarM80645K.m107164f().mo102168b());
        } else {
            arrayList.add(cjh0VarM80645K.m107162d());
        }
        boolean z2 = false;
        for (Surface surface : arrayList) {
            this.f55532c.addTarget(surface);
            if (!surface.isValid()) {
                z2 = true;
            }
        }
        this.f55532c.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, mo80793r(new Range<>(Integer.valueOf(this.f55508B.min / this.f55537h.f55331c.fpsUnitFactor), Integer.valueOf(this.f55508B.max / this.f55537h.f55331c.fpsUnitFactor))));
        if (z2) {
            C13341g.m80815b(f70276X, "start preview may be failed, surface invalid...");
        }
        this.f55513G = false;
        this.f55514H = System.currentTimeMillis();
        Handler handlerM80740D = this.f55537h.f55347k ? m80740D() : this.f55540k;
        if (this.f55537h.f55356o0) {
            if (!this.f55525S.isEmpty() && !this.f55524R) {
                for (int i = 0; i < arrayList.size(); i++) {
                    this.f55525S.get(i).addSurface(arrayList.get(i));
                    this.f55524R = true;
                }
            }
            if (Build.VERSION.SDK_INT >= 28 && this.f55533d != null) {
                this.f55533d.finalizeOutputConfigurations(this.f55525S);
                this.f55523Q = true;
                C13341g.m80814a(f70276X, "finalizeOutputConfigurations in startPreview");
                try {
                    int iMo80800u0 = mo80800u0();
                    if (iMo80800u0 != 0) {
                        m80753Q();
                        RunnableC15646a runnableC15646a = new RunnableC15646a(iMo80800u0);
                        if (this.f55537h.f55347k) {
                            this.f55540k.post(runnableC15646a);
                        } else {
                            runnableC15646a.run();
                        }
                    }
                } catch (Exception e) {
                    m80753Q();
                    e.printStackTrace();
                }
            }
        } else {
            this.f55533d = null;
            mo80797t(arrayList, this.f55528V, handlerM80740D);
        }
        if (this.f55533d == null) {
            m80809z0();
        }
        return 0;
    }

    @Override // com.p069ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: n0 */
    public int mo80786n0() {
        return super.mo80786n0();
    }

    @Override // com.p069ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: p0 */
    public int mo80790p0() {
        return super.mo80790p0();
    }
}
