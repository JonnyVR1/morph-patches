package p009l;

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
import com.p008ss.android.ttvecamera.C0725b;
import com.p008ss.android.ttvecamera.C0743g;
import com.p008ss.android.ttvecamera.TECameraSettings;
import com.p008ss.android.ttvecamera.framework.TECameraModeBase;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@TargetApi(21)
public class akh0 extends TECameraModeBase {

    /* JADX INFO: renamed from: X */
    private static final String f9558X = "akh0";

    /* JADX INFO: renamed from: l.akh0$a */
    public class RunnableC0765a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f9559a;

        public RunnableC0765a(int i) {
            this.f9559a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((TECameraModeBase) akh0.this).f9141f.mo10846c(((TECameraModeBase) akh0.this).f9143h.f8935b, this.f9559a, "updateCapture : something wrong.", ((TECameraModeBase) akh0.this).f9145j);
        }
    }

    public akh0(C0725b c0725b, Context context, CameraManager cameraManager, Handler handler) {
        super(c0725b, context, handler);
        this.f9140e = cameraManager;
        if (this.f9143h.f8957m) {
            this.f9144i = new ckh0(this);
        } else {
            this.f9144i = new bkh0(this);
        }
    }

    @Override // com.p008ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: E */
    public int mo11092E() {
        return 3;
    }

    @Override // p009l.y3m
    /* JADX INFO: renamed from: c */
    public void mo11499c(int i) {
        CaptureRequest.Builder builder = this.f9138c;
        if (builder == null) {
            String str = f9558X;
            C0743g.m11166b(str, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: mCaptureRequestBuilder is null");
            C0743g.m11166b(str, "switchFlashMode: CaptureRequest.Builder is null");
            this.f9141f.mo10846c(this.f9143h.f8935b, -100, "switchFlashMode:CaptureRequest.Builder is null", this.f9145j);
            this.f9141f.mo10850g(this.f9143h.f8935b, -100, i == 0 ? 0 : 1, "switchFlashMode:CaptureRequest.Builder is null", this.f9145j);
            return;
        }
        if (i == 0) {
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.f9138c.set(CaptureRequest.FLASH_MODE, 0);
        } else {
            if (i != 2) {
                String str2 = f9558X;
                C0743g.m11166b(str2, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: not support flash mode " + i);
                C0743g.m11174j(str2, "Video Mode not support this mode : " + i);
                this.f9141f.mo10850g(this.f9143h.f8935b, -100, -1, "Video Mode not support this mode : " + i, this.f9145j);
                return;
            }
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.f9138c.set(CaptureRequest.FLASH_MODE, 2);
        }
        this.f9143h.f8940d0 = i;
        this.f9141f.mo10848e(104, 0, "camera2 will change flash mode " + i, null);
        TECameraModeBase.C0742f c0742fM11152v0 = m11152v0(this.f9138c);
        this.f9141f.mo10848e(105, 0, "camera2 did change flash mode " + i, null);
        if (c0742fM11152v0.m11164c()) {
            this.f9141f.mo10851h(this.f9143h.f8935b, 0, i != 0 ? 1 : 0, "torch success", this.f9145j);
            return;
        }
        C0743g.m11166b(f9558X, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -418. Reason: " + c0742fM11152v0.m11162a());
        this.f9141f.mo10848e(-418, -418, "switch flash failed." + c0742fM11152v0.m11162a(), this.f9145j);
        this.f9141f.mo10850g(this.f9143h.f8935b, -418, i == 0 ? 0 : 1, "switch flash failed." + c0742fM11152v0.m11162a(), this.f9145j);
    }

    @Override // com.p008ss.android.ttvecamera.framework.TECameraModeBase
    @RequiresApi(api = 28)
    /* JADX INFO: renamed from: m0 */
    public int mo11135m0() throws Exception {
        cjh0 cjh0VarM10996K = this.f9142g.m10996K();
        if (this.f9145j == null || cjh0VarM10996K == null) {
            C0743g.m11165a(f9558X, "CameraDevice or ProviderManager is null!");
            return -100;
        }
        int iM11105R = super.m11105R();
        if (iM11105R != 0) {
            return iM11105R;
        }
        TECameraSettings tECameraSettings = this.f9143h;
        if (!tECameraSettings.f8962o0 || this.f9138c == null) {
            boolean z = tECameraSettings.f8911E.getBoolean("enablePreviewTemplate");
            CameraDevice cameraDevice = this.f9145j;
            if (z) {
                this.f9138c = cameraDevice.createCaptureRequest(1);
            } else {
                this.f9138c = cameraDevice.createCaptureRequest(3);
            }
        }
        ArrayList arrayList = new ArrayList();
        if (cjh0VarM10996K.m12619f().mo12042g() == 8) {
            arrayList.addAll(Arrays.asList(cjh0VarM10996K.m12618e()));
        } else if (cjh0VarM10996K.m12619f().mo12042g() == 16) {
            arrayList.add(cjh0VarM10996K.m12617d());
            arrayList.add(cjh0VarM10996K.m12619f().mo12037b());
        } else {
            arrayList.add(cjh0VarM10996K.m12617d());
        }
        boolean z2 = false;
        for (Surface surface : arrayList) {
            this.f9138c.addTarget(surface);
            if (!surface.isValid()) {
                z2 = true;
            }
        }
        this.f9138c.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, mo11144r(new Range<>(Integer.valueOf(this.f9114B.min / this.f9143h.f8937c.fpsUnitFactor), Integer.valueOf(this.f9114B.max / this.f9143h.f8937c.fpsUnitFactor))));
        if (z2) {
            C0743g.m11166b(f9558X, "start preview may be failed, surface invalid...");
        }
        this.f9119G = false;
        this.f9120H = System.currentTimeMillis();
        Handler handlerM11091D = this.f9143h.f8953k ? m11091D() : this.f9146k;
        if (this.f9143h.f8962o0) {
            if (!this.f9131S.isEmpty() && !this.f9130R) {
                for (int i = 0; i < arrayList.size(); i++) {
                    this.f9131S.get(i).addSurface(arrayList.get(i));
                    this.f9130R = true;
                }
            }
            if (Build.VERSION.SDK_INT >= 28 && this.f9139d != null) {
                this.f9139d.finalizeOutputConfigurations(this.f9131S);
                this.f9129Q = true;
                C0743g.m11165a(f9558X, "finalizeOutputConfigurations in startPreview");
                try {
                    int iMo11151u0 = mo11151u0();
                    if (iMo11151u0 != 0) {
                        m11104Q();
                        RunnableC0765a runnableC0765a = new RunnableC0765a(iMo11151u0);
                        if (this.f9143h.f8953k) {
                            this.f9146k.post(runnableC0765a);
                        } else {
                            runnableC0765a.run();
                        }
                    }
                } catch (Exception e) {
                    m11104Q();
                    e.printStackTrace();
                }
            }
        } else {
            this.f9139d = null;
            mo11148t(arrayList, this.f9134V, handlerM11091D);
        }
        if (this.f9139d == null) {
            m11160z0();
        }
        return 0;
    }

    @Override // com.p008ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: n0 */
    public int mo11137n0() {
        return super.mo11137n0();
    }

    @Override // com.p008ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: p0 */
    public int mo11141p0() {
        return super.mo11141p0();
    }
}
