package p149l;

import android.graphics.Bitmap;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Size;
import android.view.SurfaceHolder;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.camera.TTCameraConfig;
import com.p046p1.mobile.putong.camera.widget.TTFullScreenAutoFitSurfaceView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes9.dex */
public class vkh0 extends nkh0 implements fph0.InterfaceC16902b {

    /* JADX INFO: renamed from: n */
    public fph0 f181801n;

    /* JADX INFO: renamed from: o */
    public C22393b<vuh0> f181802o;

    /* JADX INFO: renamed from: p */
    public l95 f181803p;

    /* JADX INFO: renamed from: q */
    public List<w9j<Bitmap, Bitmap>> f181804q;

    public vkh0(Act act) {
        super(act);
        this.f181802o = C22393b.m221521b();
        ArrayList arrayList = new ArrayList();
        this.f181804q = arrayList;
        arrayList.add(new w9j() { // from class: l.okh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f144435a.m198731p((Bitmap) obj);
            }
        });
        this.f181804q.add(new w9j() { // from class: l.pkh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f149996a.m198732q((Bitmap) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public void m198728d(final TTFullScreenAutoFitSurfaceView tTFullScreenAutoFitSurfaceView, @Nullable final d30 d30Var, @Nullable final e30<Throwable> e30Var) {
        if (this.f139426k == null || this.f139427l == null) {
            if (e30Var != null) {
                e30Var.call(new RuntimeException("cameraDevice not found"));
                return;
            }
            return;
        }
        Size size = plh0.m170193k(tTFullScreenAutoFitSurfaceView.getDisplay(), this.f139427l, SurfaceHolder.class).f150135a;
        tTFullScreenAutoFitSurfaceView.m29885a(size.getWidth(), size.getHeight());
        fph0 fph0Var = new fph0(this, size.getWidth(), size.getHeight(), 256, this.f139425j.m29718f() + 1);
        this.f181801n = fph0Var;
        fph0Var.m122596f(this);
        final String str = this.f139426k;
        tTFullScreenAutoFitSurfaceView.post(new Runnable() { // from class: l.qkh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f155123a.m198737v(str, tTFullScreenAutoFitSurfaceView, d30Var, e30Var);
            }
        });
    }

    public void destroy() {
        m198736u();
        this.f139419d.quitSafely();
    }

    /* JADX INFO: renamed from: n */
    public List<w9j<Bitmap, Bitmap>> m198729n() {
        return Collections.unmodifiableList(this.f181804q);
    }

    /* JADX INFO: renamed from: o */
    public C22393b<vuh0> m198730o() {
        return this.f181802o;
    }

    @Override // p149l.fph0.InterfaceC16902b
    public void onError(Throwable th) {
        this.f181802o.onNext(vuh0.m200072b(th));
    }

    @Override // p149l.fph0.InterfaceC16902b
    public void onSuccess(String str) {
        this.f181802o.onNext(vuh0.m200071a(str));
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Bitmap m198731p(Bitmap bitmap) {
        return flh0.m122069b(bitmap, this.f139416a - this.f139417b);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Bitmap m198732q(Bitmap bitmap) {
        return flh0.m122068a(bitmap, this.f181803p);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C22306c m198733r(TTFullScreenAutoFitSurfaceView tTFullScreenAutoFitSurfaceView, CameraDevice cameraDevice) {
        this.f139423h = cameraDevice;
        ArrayList arrayList = new ArrayList();
        arrayList.add(tTFullScreenAutoFitSurfaceView.getHolder().getSurface());
        arrayList.add(this.f181801n.m122595e());
        return yid0.m214888a(cameraDevice, arrayList, this.f139420e);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m198734s(TTFullScreenAutoFitSurfaceView tTFullScreenAutoFitSurfaceView, d30 d30Var, e30 e30Var, CameraCaptureSession cameraCaptureSession) {
        this.f139424i = cameraCaptureSession;
        try {
            CaptureRequest.Builder builderCreateCaptureRequest = this.f139423h.createCaptureRequest(1);
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 4);
            builderCreateCaptureRequest.addTarget(tTFullScreenAutoFitSurfaceView.getHolder().getSurface());
            if (this.f139425j.m29720h().equals(TTCameraConfig.TYPE_ID_CARD_HAND)) {
                builderCreateCaptureRequest.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 1);
            }
            cameraCaptureSession.setRepeatingRequest(builderCreateCaptureRequest.build(), null, this.f139420e);
            if (d30Var != null) {
                d30Var.call();
            }
        } catch (CameraAccessException e) {
            if (e30Var != null) {
                e30Var.call(e);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m198735t(e30 e30Var, Throwable th) {
        m198736u();
        if (e30Var != null) {
            e30Var.call(th);
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m198737v(String str, final TTFullScreenAutoFitSurfaceView tTFullScreenAutoFitSurfaceView, final d30 d30Var, final e30 e30Var) {
        yid0.m214889b(this.f139421f, str, this.f139420e).flatMap(new w9j() { // from class: l.rkh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f159840a.m198733r(tTFullScreenAutoFitSurfaceView, (CameraDevice) obj);
            }
        }).subscribe(mkd0.m154957I(new e30() { // from class: l.skh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164971a.m198734s(tTFullScreenAutoFitSurfaceView, d30Var, e30Var, (CameraCaptureSession) obj);
            }
        }, new e30() { // from class: l.tkh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170869a.m198735t(e30Var, (Throwable) obj);
            }
        }, new d30() { // from class: l.ukh0
            @Override // p149l.d30
            public final void call() {
                this.f176925a.m198736u();
            }
        }));
    }

    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void m198736u() {
        CameraCaptureSession cameraCaptureSession = this.f139424i;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.f139424i = null;
        }
        CameraDevice cameraDevice = this.f139423h;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.f139423h = null;
        }
        fph0 fph0Var = this.f181801n;
        if (fph0Var != null) {
            fph0Var.m122594d();
        }
    }

    /* JADX INFO: renamed from: x */
    public void m198739x(l95 l95Var) {
        this.f181803p = l95Var;
    }

    /* JADX INFO: renamed from: y */
    public void m198740y() {
        fph0 fph0Var = this.f181801n;
        if (fph0Var != null) {
            fph0Var.m122597g(this.f139423h, this.f139424i);
        } else {
            this.f181802o.onNext(vuh0.m200072b(new RuntimeException("TTImageReader is not ready")));
        }
    }
}
