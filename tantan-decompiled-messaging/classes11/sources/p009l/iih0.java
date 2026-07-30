package p009l;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Range;
import android.view.Surface;
import androidx.annotation.NonNull;
import com.p008ss.android.ttvecamera.C0725b;
import com.p008ss.android.ttvecamera.C0743g;
import com.p008ss.android.ttvecamera.framework.TECameraModeBase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@TargetApi(21)
public class iih0 extends TECameraModeBase {

    /* JADX INFO: renamed from: Y */
    private static final String f14647Y = "iih0";

    /* JADX INFO: renamed from: X */
    private uy0 f14648X;

    public iih0(@NonNull C0725b c0725b, @NonNull Context context, @NonNull CameraManager cameraManager, Handler handler) {
        super(c0725b, context, handler);
        this.f14648X = null;
        this.f9140e = cameraManager;
        this.f9144i = new bkh0(this);
    }

    /* JADX INFO: renamed from: B0 */
    public void m16570B0() {
        C0743g.m11165a(f14647Y, "closeARSession not supported");
    }

    /* JADX INFO: renamed from: C0 */
    public void m16571C0(Context context, Handler handler) {
        if (this.f9137b.m23390k()) {
            uy0 uy0VarM23186a = uy0.m23186a();
            this.f14648X = uy0VarM23186a;
            uy0VarM23186a.m23187b(context, null);
            this.f14648X.m23188c(handler);
        }
    }

    @Override // com.p008ss.android.ttvecamera.framework.TECameraModeBase, p009l.z3m.InterfaceC1341a
    /* JADX INFO: renamed from: a */
    public int mo11114a() {
        CaptureRequest.Builder builder = this.f9138c;
        if (builder == null) {
            this.f9141f.mo10846c(this.f9143h.f8935b, -100, "rollbackNormalSessionRequest : param is null.", this.f9145j);
            return -100;
        }
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        this.f9138c.set(CaptureRequest.CONTROL_AF_MODE, 3);
        this.f9138c.set(CaptureRequest.CONTROL_AE_MODE, 1);
        m11152v0(this.f9138c);
        return 0;
    }

    @Override // p009l.y3m
    /* JADX INFO: renamed from: c */
    public void mo11499c(int i) {
        CaptureRequest.Builder builder = this.f9138c;
        if (builder == null) {
            String str = f14647Y;
            C0743g.m11166b(str, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: mCaptureRequestBuilder is null");
            C0743g.m11166b(str, "switchFlashMode: CaptureRequest.Builder is null");
            this.f9141f.mo10846c(this.f9143h.f8935b, -100, "switchFlashMode:CaptureRequest.Builder is null", this.f9145j);
            return;
        }
        if (i == 0) {
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.f9138c.set(CaptureRequest.FLASH_MODE, 0);
        } else {
            if (i != 2) {
                C0743g.m11174j(f14647Y, "Video Mode not support this mode : " + i);
                return;
            }
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.f9138c.set(CaptureRequest.FLASH_MODE, 2);
        }
        this.f9143h.f8940d0 = i;
        TECameraModeBase.C0742f c0742fM11152v0 = m11152v0(this.f9138c);
        if (c0742fM11152v0.m11164c()) {
            return;
        }
        C0743g.m11166b(f14647Y, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -418. Reason: " + c0742fM11152v0.m11162a());
        this.f9141f.mo10848e(-418, -418, "switch flash failed." + c0742fM11152v0.m11162a(), this.f9145j);
    }

    @Override // com.p008ss.android.ttvecamera.framework.TECameraModeBase, p009l.z3m.InterfaceC1341a
    /* JADX INFO: renamed from: d */
    public int mo11118d() {
        if (this.f9138c == null) {
            this.f9141f.mo10846c(this.f9143h.f8935b, -100, "rollbackNormalSessionRequest : param is null.", this.f9145j);
            return -100;
        }
        m11158y0(this.f9160y);
        this.f9138c.set(CaptureRequest.CONTROL_AE_MODE, 1);
        m11152v0(this.f9138c);
        return 0;
    }

    @Override // com.p008ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: m0 */
    public int mo11135m0() throws Exception {
        cjh0 cjh0VarM10996K = this.f9142g.m10996K();
        if (this.f9145j == null || cjh0VarM10996K == null) {
            C0743g.m11165a(f14647Y, "CameraDevice or ProviderManager is null!");
            return -100;
        }
        int iM11105R = super.m11105R();
        if (iM11105R != 0) {
            return iM11105R;
        }
        this.f9138c = this.f9145j.createCaptureRequest(3);
        ArrayList arrayList = new ArrayList();
        if (cjh0VarM10996K.m12619f().mo12042g() == 8) {
            arrayList.addAll(Arrays.asList(cjh0VarM10996K.m12618e()));
        } else {
            arrayList.add(cjh0VarM10996K.m12617d());
        }
        Iterator<Surface> it = arrayList.iterator();
        while (it.hasNext()) {
            this.f9138c.addTarget(it.next());
        }
        this.f9138c.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, mo11144r(new Range<>(Integer.valueOf(this.f9114B.min / this.f9143h.f8937c.fpsUnitFactor), Integer.valueOf(this.f9114B.max / this.f9143h.f8937c.fpsUnitFactor))));
        this.f9119G = false;
        this.f9120H = System.currentTimeMillis();
        Handler handlerM11091D = this.f9143h.f8953k ? m11091D() : this.f9146k;
        this.f9139d = null;
        mo11148t(arrayList, this.f9134V, handlerM11091D);
        if (this.f9139d == null) {
            m11160z0();
        }
        return 0;
    }

    /* JADX INFO: renamed from: D0 */
    public void m16572D0(CameraDevice cameraDevice, int i, int i2) {
    }
}
