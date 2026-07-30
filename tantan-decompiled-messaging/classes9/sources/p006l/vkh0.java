package p006l;

import android.graphics.Bitmap;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Size;
import android.view.SurfaceHolder;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.camera.TTCameraConfig;
import com.p000p1.mobile.putong.camera.widget.TTFullScreenAutoFitSurfaceView;
import com.p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l.d30;
import l.e30;
import l.mkd0;
import l.w9j;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class vkh0 extends nkh0 implements fph0.InterfaceC0729b {

    /* JADX INFO: renamed from: n */
    public fph0 f24354n;

    /* JADX INFO: renamed from: o */
    public b<vuh0> f24355o;

    /* JADX INFO: renamed from: p */
    public l95 f24356p;

    /* JADX INFO: renamed from: q */
    public List<w9j<Bitmap, Bitmap>> f24357q;

    public vkh0(Act act) {
        super(act);
        this.f24355o = b.b();
        ArrayList arrayList = new ArrayList();
        this.f24357q = arrayList;
        arrayList.add(new w9j() { // from class: l.okh0
            public final Object call(Object obj) {
                return this.f18267a.m25843p((Bitmap) obj);
            }
        });
        this.f24357q.add(new w9j() { // from class: l.pkh0
            public final Object call(Object obj) {
                return this.f19174a.m25844q((Bitmap) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public void m25840d(final TTFullScreenAutoFitSurfaceView tTFullScreenAutoFitSurfaceView, @Nullable final d30 d30Var, @Nullable final e30<Throwable> e30Var) {
        if (this.f17733k == null || this.f17734l == null) {
            if (e30Var != null) {
                e30Var.call(new RuntimeException("cameraDevice not found"));
                return;
            }
            return;
        }
        Size size = plh0.m21584k(tTFullScreenAutoFitSurfaceView.getDisplay(), this.f17734l, SurfaceHolder.class).f19189a;
        tTFullScreenAutoFitSurfaceView.m1797a(size.getWidth(), size.getHeight());
        fph0 fph0Var = new fph0(this, size.getWidth(), size.getHeight(), 256, this.f17732j.m1628f() + 1);
        this.f24354n = fph0Var;
        fph0Var.m15441f(this);
        final String str = this.f17733k;
        tTFullScreenAutoFitSurfaceView.post(new Runnable() { // from class: l.qkh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f19866a.m25849v(str, tTFullScreenAutoFitSurfaceView, d30Var, e30Var);
            }
        });
    }

    public void destroy() {
        m25848u();
        this.f17726d.quitSafely();
    }

    /* JADX INFO: renamed from: n */
    public List<w9j<Bitmap, Bitmap>> m25841n() {
        return Collections.unmodifiableList(this.f24357q);
    }

    /* JADX INFO: renamed from: o */
    public b<vuh0> m25842o() {
        return this.f24355o;
    }

    @Override // p006l.fph0.InterfaceC0729b
    public void onError(Throwable th) {
        this.f24355o.onNext(vuh0.m25901b(th));
    }

    @Override // p006l.fph0.InterfaceC0729b
    public void onSuccess(String str) {
        this.f24355o.onNext(vuh0.m25900a(str));
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Bitmap m25843p(Bitmap bitmap) {
        return flh0.m15352b(bitmap, this.f17723a - this.f17724b);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Bitmap m25844q(Bitmap bitmap) {
        return flh0.m15351a(bitmap, this.f24356p);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ c m25845r(TTFullScreenAutoFitSurfaceView tTFullScreenAutoFitSurfaceView, CameraDevice cameraDevice) {
        this.f17730h = cameraDevice;
        ArrayList arrayList = new ArrayList();
        arrayList.add(tTFullScreenAutoFitSurfaceView.getHolder().getSurface());
        arrayList.add(this.f24354n.m15440e());
        return yid0.m28247a(cameraDevice, arrayList, this.f17727e);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m25846s(TTFullScreenAutoFitSurfaceView tTFullScreenAutoFitSurfaceView, d30 d30Var, e30 e30Var, CameraCaptureSession cameraCaptureSession) {
        this.f17731i = cameraCaptureSession;
        try {
            CaptureRequest.Builder builderCreateCaptureRequest = this.f17730h.createCaptureRequest(1);
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 4);
            builderCreateCaptureRequest.addTarget(tTFullScreenAutoFitSurfaceView.getHolder().getSurface());
            if (this.f17732j.m1630h().equals(TTCameraConfig.TYPE_ID_CARD_HAND)) {
                builderCreateCaptureRequest.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 1);
            }
            cameraCaptureSession.setRepeatingRequest(builderCreateCaptureRequest.build(), null, this.f17727e);
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
    public final /* synthetic */ void m25847t(e30 e30Var, Throwable th) {
        m25848u();
        if (e30Var != null) {
            e30Var.call(th);
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m25849v(String str, final TTFullScreenAutoFitSurfaceView tTFullScreenAutoFitSurfaceView, final d30 d30Var, final e30 e30Var) {
        yid0.m28248b(this.f17728f, str, this.f17727e).flatMap(new w9j() { // from class: l.rkh0
            public final Object call(Object obj) {
                return this.f20592a.m25845r(tTFullScreenAutoFitSurfaceView, (CameraDevice) obj);
            }
        }).subscribe(mkd0.I(new e30() { // from class: l.skh0
            public final void call(Object obj) {
                this.f21394a.m25846s(tTFullScreenAutoFitSurfaceView, d30Var, e30Var, (CameraCaptureSession) obj);
            }
        }, new e30() { // from class: l.tkh0
            public final void call(Object obj) {
                this.f22152a.m25847t(e30Var, (Throwable) obj);
            }
        }, new d30() { // from class: l.ukh0
            public final void call() {
                this.f23588a.m25848u();
            }
        }));
    }

    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void m25848u() {
        CameraCaptureSession cameraCaptureSession = this.f17731i;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.f17731i = null;
        }
        CameraDevice cameraDevice = this.f17730h;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.f17730h = null;
        }
        fph0 fph0Var = this.f24354n;
        if (fph0Var != null) {
            fph0Var.m15439d();
        }
    }

    /* JADX INFO: renamed from: x */
    public void m25851x(l95 l95Var) {
        this.f24356p = l95Var;
    }

    /* JADX INFO: renamed from: y */
    public void m25852y() {
        fph0 fph0Var = this.f24354n;
        if (fph0Var != null) {
            fph0Var.m15442g(this.f17730h, this.f17731i);
        } else {
            this.f24355o.onNext(vuh0.m25901b(new RuntimeException("TTImageReader is not ready")));
        }
    }
}
