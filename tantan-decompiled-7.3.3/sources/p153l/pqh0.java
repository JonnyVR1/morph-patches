package p153l;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Range;
import android.view.Surface;
import androidx.annotation.NonNull;
import com.p074ss.android.ttvecamera.C13486b;
import com.p074ss.android.ttvecamera.C13504g;
import com.p074ss.android.ttvecamera.framework.TECameraModeBase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
@TargetApi(21)
public class pqh0 extends TECameraModeBase {

    /* JADX INFO: renamed from: Y */
    private static final String f153674Y = "pqh0";

    /* JADX INFO: renamed from: X */
    private bz0 f153675X;

    public pqh0(@NonNull C13486b c13486b, @NonNull Context context, @NonNull CameraManager cameraManager, Handler handler) {
        super(c13486b, context, handler);
        this.f153675X = null;
        this.f56382e = cameraManager;
        this.f56386i = new ish0(this);
    }

    /* JADX INFO: renamed from: B0 */
    public void m173352B0() {
        C13504g.m81997a(f153674Y, "closeARSession not supported");
    }

    /* JADX INFO: renamed from: C0 */
    public void m173353C0(Context context, Handler handler) {
        if (this.f56379b.m112061k()) {
            bz0 bz0VarM107103a = bz0.m107103a();
            this.f153675X = bz0VarM107103a;
            bz0VarM107103a.m107104b(context, null);
            this.f153675X.m107105c(handler);
        }
    }

    @Override // com.p074ss.android.ttvecamera.framework.TECameraModeBase, p153l.p6m.InterfaceC19309a
    /* JADX INFO: renamed from: a */
    public int mo81946a() {
        CaptureRequest.Builder builder = this.f56380c;
        if (builder == null) {
            this.f56383f.mo81678c(this.f56385h.f56177b, -100, "rollbackNormalSessionRequest : param is null.", this.f56387j);
            return -100;
        }
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        this.f56380c.set(CaptureRequest.CONTROL_AF_MODE, 3);
        this.f56380c.set(CaptureRequest.CONTROL_AE_MODE, 1);
        m81984v0(this.f56380c);
        return 0;
    }

    @Override // p153l.o6m
    /* JADX INFO: renamed from: c */
    public void mo136976c(int i) {
        CaptureRequest.Builder builder = this.f56380c;
        if (builder == null) {
            String str = f153674Y;
            C13504g.m81998b(str, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: mCaptureRequestBuilder is null");
            C13504g.m81998b(str, "switchFlashMode: CaptureRequest.Builder is null");
            this.f56383f.mo81678c(this.f56385h.f56177b, -100, "switchFlashMode:CaptureRequest.Builder is null", this.f56387j);
            return;
        }
        if (i == 0) {
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.f56380c.set(CaptureRequest.FLASH_MODE, 0);
        } else {
            if (i != 2) {
                C13504g.m82006j(f153674Y, "Video Mode not support this mode : " + i);
                return;
            }
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.f56380c.set(CaptureRequest.FLASH_MODE, 2);
        }
        this.f56385h.f56182d0 = i;
        TECameraModeBase.C13503f c13503fM81984v0 = m81984v0(this.f56380c);
        if (c13503fM81984v0.m81996c()) {
            return;
        }
        C13504g.m81998b(f153674Y, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -418. Reason: " + c13503fM81984v0.m81994a());
        this.f56383f.mo81680e(-418, -418, "switch flash failed." + c13503fM81984v0.m81994a(), this.f56387j);
    }

    @Override // com.p074ss.android.ttvecamera.framework.TECameraModeBase, p153l.p6m.InterfaceC19309a
    /* JADX INFO: renamed from: d */
    public int mo81950d() {
        if (this.f56380c == null) {
            this.f56383f.mo81678c(this.f56385h.f56177b, -100, "rollbackNormalSessionRequest : param is null.", this.f56387j);
            return -100;
        }
        m81990y0(this.f56402y);
        this.f56380c.set(CaptureRequest.CONTROL_AE_MODE, 1);
        m81984v0(this.f56380c);
        return 0;
    }

    @Override // com.p074ss.android.ttvecamera.framework.TECameraModeBase
    /* JADX INFO: renamed from: m0 */
    public int mo81967m0() throws Exception {
        jrh0 jrh0VarM81828K = this.f56384g.m81828K();
        if (this.f56387j == null || jrh0VarM81828K == null) {
            C13504g.m81997a(f153674Y, "CameraDevice or ProviderManager is null!");
            return -100;
        }
        int iM81937R = super.m81937R();
        if (iM81937R != 0) {
            return iM81937R;
        }
        this.f56380c = this.f56387j.createCaptureRequest(3);
        ArrayList arrayList = new ArrayList();
        if (jrh0VarM81828K.m146742f().mo99913g() == 8) {
            arrayList.addAll(Arrays.asList(jrh0VarM81828K.m146741e()));
        } else {
            arrayList.add(jrh0VarM81828K.m146740d());
        }
        Iterator<Surface> it = arrayList.iterator();
        while (it.hasNext()) {
            this.f56380c.addTarget(it.next());
        }
        this.f56380c.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, mo81976r(new Range<>(Integer.valueOf(this.f56356B.min / this.f56385h.f56179c.fpsUnitFactor), Integer.valueOf(this.f56356B.max / this.f56385h.f56179c.fpsUnitFactor))));
        this.f56361G = false;
        this.f56362H = System.currentTimeMillis();
        Handler handlerM81923D = this.f56385h.f56195k ? m81923D() : this.f56388k;
        this.f56381d = null;
        mo81980t(arrayList, this.f56376V, handlerM81923D);
        if (this.f56381d == null) {
            m81992z0();
        }
        return 0;
    }

    /* JADX INFO: renamed from: D0 */
    public void m173354D0(CameraDevice cameraDevice, int i, int i2) {
    }
}
