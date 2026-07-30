package p149l;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Range;
import android.view.Surface;
import androidx.annotation.NonNull;
import com.p069ss.android.ttvecamera.C13323b;
import com.p069ss.android.ttvecamera.C13341g;
import com.p069ss.android.ttvecamera.framework.TECameraModeBase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
@TargetApi(21)
public class iih0 extends TECameraModeBase {

    /* JADX INFO: renamed from: Y */
    private static final String f113410Y = "iih0";

    /* JADX INFO: renamed from: X */
    private uy0 f113411X;

    public iih0(@NonNull C13323b c13323b, @NonNull Context context, @NonNull CameraManager cameraManager, Handler handler) {
        super(c13323b, context, handler);
        this.f113411X = null;
        this.f55534e = cameraManager;
        this.f55538i = new bkh0(this);
    }

    /* JADX INFO: renamed from: B0 */
    public void m136394B0() {
        C13341g.m80814a(f113410Y, "closeARSession not supported");
    }

    /* JADX INFO: renamed from: C0 */
    public void m136395C0(Context context, Handler handler) {
        if (this.f55531b.m198571k()) {
            uy0 uy0VarM196238a = uy0.m196238a();
            this.f113411X = uy0VarM196238a;
            uy0VarM196238a.m196239b(context, null);
            this.f113411X.m196240c(handler);
        }
    }

    @Override // com.p069ss.android.ttvecamera.framework.TECameraModeBase, p149l.z3m.InterfaceC21616a
    /* JADX INFO: renamed from: a */
    public int mo80763a() {
        CaptureRequest.Builder builder = this.f55532c;
        if (builder == null) {
            this.f55535f.mo80495c(this.f55537h.f55329b, -100, "rollbackNormalSessionRequest : param is null.", this.f55539j);
            return -100;
        }
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        this.f55532c.set(CaptureRequest.CONTROL_AF_MODE, 3);
        this.f55532c.set(CaptureRequest.CONTROL_AE_MODE, 1);
        m80801v0(this.f55532c);
        return 0;
    }

    @Override // p149l.y3m
    /* JADX INFO: renamed from: c */
    public void mo97150c(int i) {
        CaptureRequest.Builder builder = this.f55532c;
        if (builder == null) {
            String str = f113410Y;
            C13341g.m80815b(str, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: mCaptureRequestBuilder is null");
            C13341g.m80815b(str, "switchFlashMode: CaptureRequest.Builder is null");
            this.f55535f.mo80495c(this.f55537h.f55329b, -100, "switchFlashMode:CaptureRequest.Builder is null", this.f55539j);
            return;
        }
        if (i == 0) {
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.f55532c.set(CaptureRequest.FLASH_MODE, 0);
        } else {
            if (i != 2) {
                C13341g.m80823j(f113410Y, "Video Mode not support this mode : " + i);
                return;
            }
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.f55532c.set(CaptureRequest.FLASH_MODE, 2);
        }
        this.f55537h.f55334d0 = i;
        TECameraModeBase.C13340f c13340fM80801v0 = m80801v0(this.f55532c);
        if (c13340fM80801v0.m80813c()) {
            return;
        }
        C13341g.m80815b(f113410Y, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -418. Reason: " + c13340fM80801v0.m80811a());
        this.f55535f.mo80497e(-418, -418, "switch flash failed." + c13340fM80801v0.m80811a(), this.f55539j);
    }

    @Override // com.p069ss.android.ttvecamera.framework.TECameraModeBase, p149l.z3m.InterfaceC21616a
    /* JADX INFO: renamed from: d */
    public int mo80767d() {
        if (this.f55532c == null) {
            this.f55535f.mo80495c(this.f55537h.f55329b, -100, "rollbackNormalSessionRequest : param is null.", this.f55539j);
            return -100;
        }
        m80807y0(this.f55554y);
        this.f55532c.set(CaptureRequest.CONTROL_AE_MODE, 1);
        m80801v0(this.f55532c);
        return 0;
    }

    @Override // com.p069ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: m0 */
    public int mo80784m0() throws Exception {
        cjh0 cjh0VarM80645K = this.f55536g.m80645K();
        if (this.f55539j == null || cjh0VarM80645K == null) {
            C13341g.m80814a(f113410Y, "CameraDevice or ProviderManager is null!");
            return -100;
        }
        int iM80754R = super.m80754R();
        if (iM80754R != 0) {
            return iM80754R;
        }
        this.f55532c = this.f55539j.createCaptureRequest(3);
        ArrayList arrayList = new ArrayList();
        if (cjh0VarM80645K.m107164f().mo102173g() == 8) {
            arrayList.addAll(Arrays.asList(cjh0VarM80645K.m107163e()));
        } else {
            arrayList.add(cjh0VarM80645K.m107162d());
        }
        Iterator<Surface> it = arrayList.iterator();
        while (it.hasNext()) {
            this.f55532c.addTarget(it.next());
        }
        this.f55532c.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, mo80793r(new Range<>(Integer.valueOf(this.f55508B.min / this.f55537h.f55331c.fpsUnitFactor), Integer.valueOf(this.f55508B.max / this.f55537h.f55331c.fpsUnitFactor))));
        this.f55513G = false;
        this.f55514H = System.currentTimeMillis();
        Handler handlerM80740D = this.f55537h.f55347k ? m80740D() : this.f55540k;
        this.f55533d = null;
        mo80797t(arrayList, this.f55528V, handlerM80740D);
        if (this.f55533d == null) {
            m80809z0();
        }
        return 0;
    }

    /* JADX INFO: renamed from: D0 */
    public void m136396D0(CameraDevice cameraDevice, int i, int i2) {
    }
}
