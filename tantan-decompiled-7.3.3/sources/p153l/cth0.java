package p153l;

import android.graphics.Bitmap;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Size;
import android.view.SurfaceHolder;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.camera.TTCameraConfig;
import com.p051p1.mobile.putong.camera.widget.TTFullScreenAutoFitSurfaceView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes9.dex */
public class cth0 extends ush0 implements mxh0.InterfaceC18741b {

    /* JADX INFO: renamed from: n */
    public mxh0 f83698n;

    /* JADX INFO: renamed from: o */
    public C22508b<d3i0> f83699o;

    /* JADX INFO: renamed from: p */
    public ma5 f83700p;

    /* JADX INFO: renamed from: q */
    public List<qcj<Bitmap, Bitmap>> f83701q;

    public cth0(Act act) {
        super(act);
        this.f83699o = C22508b.m222767b();
        ArrayList arrayList = new ArrayList();
        this.f83701q = arrayList;
        arrayList.add(new qcj() { // from class: l.vsh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f185607a.m112480p((Bitmap) obj);
            }
        });
        this.f83701q.add(new qcj() { // from class: l.wsh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f190652a.m112481q((Bitmap) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public void m112477d(final TTFullScreenAutoFitSurfaceView tTFullScreenAutoFitSurfaceView, @Nullable final x20 x20Var, @Nullable final y20<Throwable> y20Var) {
        if (this.f180830k == null || this.f180831l == null) {
            if (y20Var != null) {
                y20Var.call(new RuntimeException("cameraDevice not found"));
                return;
            }
            return;
        }
        Size size = wth0.m207883k(tTFullScreenAutoFitSurfaceView.getDisplay(), this.f180831l, SurfaceHolder.class).f190781a;
        tTFullScreenAutoFitSurfaceView.m30883a(size.getWidth(), size.getHeight());
        mxh0 mxh0Var = new mxh0(this, size.getWidth(), size.getHeight(), 256, this.f180829j.m30716f() + 1);
        this.f83698n = mxh0Var;
        mxh0Var.m160674f(this);
        final String str = this.f180830k;
        tTFullScreenAutoFitSurfaceView.post(new Runnable() { // from class: l.xsh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f196109a.m112486v(str, tTFullScreenAutoFitSurfaceView, x20Var, y20Var);
            }
        });
    }

    public void destroy() {
        m112485u();
        this.f180823d.quitSafely();
    }

    /* JADX INFO: renamed from: n */
    public List<qcj<Bitmap, Bitmap>> m112478n() {
        return Collections.unmodifiableList(this.f83701q);
    }

    /* JADX INFO: renamed from: o */
    public C22508b<d3i0> m112479o() {
        return this.f83699o;
    }

    @Override // p153l.mxh0.InterfaceC18741b
    public void onError(Throwable th) {
        this.f83699o.onNext(d3i0.m113832b(th));
    }

    @Override // p153l.mxh0.InterfaceC18741b
    public void onSuccess(String str) {
        this.f83699o.onNext(d3i0.m113831a(str));
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Bitmap m112480p(Bitmap bitmap) {
        return mth0.m160018b(bitmap, this.f180820a - this.f180821b);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Bitmap m112481q(Bitmap bitmap) {
        return mth0.m160017a(bitmap, this.f83700p);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C22421c m112482r(TTFullScreenAutoFitSurfaceView tTFullScreenAutoFitSurfaceView, CameraDevice cameraDevice) {
        this.f180827h = cameraDevice;
        ArrayList arrayList = new ArrayList();
        arrayList.add(tTFullScreenAutoFitSurfaceView.getHolder().getSurface());
        arrayList.add(this.f83698n.m160673e());
        return brd0.m106123a(cameraDevice, arrayList, this.f180824e);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m112483s(TTFullScreenAutoFitSurfaceView tTFullScreenAutoFitSurfaceView, x20 x20Var, y20 y20Var, CameraCaptureSession cameraCaptureSession) {
        this.f180828i = cameraCaptureSession;
        try {
            CaptureRequest.Builder builderCreateCaptureRequest = this.f180827h.createCaptureRequest(1);
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 4);
            builderCreateCaptureRequest.addTarget(tTFullScreenAutoFitSurfaceView.getHolder().getSurface());
            if (this.f180829j.m30718h().equals(TTCameraConfig.TYPE_ID_CARD_HAND)) {
                builderCreateCaptureRequest.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 1);
            }
            cameraCaptureSession.setRepeatingRequest(builderCreateCaptureRequest.build(), null, this.f180824e);
            if (x20Var != null) {
                x20Var.call();
            }
        } catch (CameraAccessException e) {
            if (y20Var != null) {
                y20Var.call(e);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m112484t(y20 y20Var, Throwable th) {
        m112485u();
        if (y20Var != null) {
            y20Var.call(th);
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m112486v(String str, final TTFullScreenAutoFitSurfaceView tTFullScreenAutoFitSurfaceView, final x20 x20Var, final y20 y20Var) {
        brd0.m106124b(this.f180825f, str, this.f180824e).flatMap(new qcj() { // from class: l.ysh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f201406a.m112482r(tTFullScreenAutoFitSurfaceView, (CameraDevice) obj);
            }
        }).subscribe(psd0.m173598I(new y20() { // from class: l.zsh0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205876a.m112483s(tTFullScreenAutoFitSurfaceView, x20Var, y20Var, (CameraCaptureSession) obj);
            }
        }, new y20() { // from class: l.ath0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73364a.m112484t(y20Var, (Throwable) obj);
            }
        }, new x20() { // from class: l.bth0
            @Override // p153l.x20
            public final void call() {
                this.f78356a.m112485u();
            }
        }));
    }

    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void m112485u() {
        CameraCaptureSession cameraCaptureSession = this.f180828i;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.f180828i = null;
        }
        CameraDevice cameraDevice = this.f180827h;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.f180827h = null;
        }
        mxh0 mxh0Var = this.f83698n;
        if (mxh0Var != null) {
            mxh0Var.m160672d();
        }
    }

    /* JADX INFO: renamed from: x */
    public void m112488x(ma5 ma5Var) {
        this.f83700p = ma5Var;
    }

    /* JADX INFO: renamed from: y */
    public void m112489y() {
        mxh0 mxh0Var = this.f83698n;
        if (mxh0Var != null) {
            mxh0Var.m160675g(this.f180827h, this.f180828i);
        } else {
            this.f83699o.onNext(d3i0.m113832b(new RuntimeException("TTImageReader is not ready")));
        }
    }
}
