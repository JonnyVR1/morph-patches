package p006l;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.media.MediaCodec;
import android.media.MediaRecorder;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.p000p1.mobile.putong.camera.TTCameraConfig;
import com.p000p1.mobile.putong.camera.widget.TTFullScreenAutoFitSurfaceView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.util.ArrayList;
import l.d30;
import l.e30;
import l.mkd0;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@RequiresApi(api = 23)
public class blh0 extends nkh0 implements i4m {

    /* JADX INFO: renamed from: n */
    public boolean f8972n;

    /* JADX INFO: renamed from: o */
    public Surface f8973o;

    /* JADX INFO: renamed from: p */
    public MediaRecorder f8974p;

    /* JADX INFO: renamed from: q */
    public String f8975q;

    public blh0(Act act) {
        super(act);
        this.f8972n = false;
        this.f8973o = MediaCodec.createPersistentInputSurface();
    }

    @Override // p006l.i4m
    /* JADX INFO: renamed from: a */
    public void mo12814a(TTFullScreenAutoFitSurfaceView tTFullScreenAutoFitSurfaceView) {
        CameraCaptureSession cameraCaptureSession;
        if (this.f8972n || (cameraCaptureSession = this.f17731i) == null || this.f17730h == null) {
            return;
        }
        try {
            CaptureRequest.Builder builderCreateCaptureRequest = cameraCaptureSession.getDevice().createCaptureRequest(3);
            builderCreateCaptureRequest.addTarget(this.f8973o);
            builderCreateCaptureRequest.addTarget(tTFullScreenAutoFitSurfaceView.getHolder().getSurface());
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(this.f17732j.m1627e()), Integer.valueOf(this.f17732j.m1627e())));
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 3);
            this.f17731i.setRepeatingRequest(builderCreateCaptureRequest.build(), null, this.f17727e);
            this.f8972n = true;
            this.f8974p.start();
        } catch (Exception e) {
            CrashHelper.c(e);
            this.f8972n = false;
        }
    }

    @Override // p006l.nkh0, p006l.i4m
    /* JADX INFO: renamed from: b */
    public void mo12815b(TTCameraConfig tTCameraConfig) {
        super.mo12815b(tTCameraConfig);
    }

    @Override // p006l.i4m
    /* JADX INFO: renamed from: c */
    public String mo12816c() {
        return this.f8975q;
    }

    @Override // p006l.i4m
    /* JADX INFO: renamed from: d */
    public void mo12817d(final TTFullScreenAutoFitSurfaceView tTFullScreenAutoFitSurfaceView, @Nullable final d30 d30Var, @Nullable final e30<Throwable> e30Var) {
        CameraCharacteristics cameraCharacteristics;
        if (this.f17733k == null || (cameraCharacteristics = this.f17734l) == null) {
            if (e30Var != null) {
                e30Var.call(new RuntimeException("cameraDevice not found"));
                return;
            }
            return;
        }
        this.f17723a = ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        plh0.C1139a c1139aM21584k = plh0.m21584k(tTFullScreenAutoFitSurfaceView.getDisplay(), this.f17734l, SurfaceHolder.class);
        Size size = c1139aM21584k.f19189a;
        tTFullScreenAutoFitSurfaceView.m1797a(size.getWidth(), size.getHeight());
        Size size2 = plh0.m21585l(this.f17734l, c1139aM21584k).f19189a;
        try {
            m12820l(size2.getWidth(), size2.getHeight());
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        final String str = this.f17733k;
        tTFullScreenAutoFitSurfaceView.post(new Runnable() { // from class: l.wkh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f25194a.m12825q(str, tTFullScreenAutoFitSurfaceView, d30Var, e30Var);
            }
        });
    }

    @Override // p006l.i4m
    public void destroy() {
        this.f8973o.release();
        m12824p();
        this.f17726d.quitSafely();
    }

    @Override // p006l.i4m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void m12824p() {
        MediaRecorder mediaRecorder = this.f8974p;
        if (mediaRecorder != null) {
            mediaRecorder.reset();
            this.f8974p.release();
            this.f8974p = null;
        }
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
        this.f8972n = false;
    }

    @Override // p006l.i4m
    /* JADX INFO: renamed from: h */
    public boolean mo12819h() {
        return this.f8972n;
    }

    /* JADX INFO: renamed from: l */
    public final void m12820l(int i, int i2) throws IOException {
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.f8974p = mediaRecorder;
        mediaRecorder.setAudioSource(1);
        this.f8974p.setVideoSource(2);
        this.f8974p.setOutputFormat(2);
        String strM22289e = qlh0.m22289e(null, 2);
        this.f8975q = strM22289e;
        this.f8974p.setOutputFile(strM22289e);
        this.f8974p.setVideoEncoder(2);
        this.f8974p.setAudioEncoder(3);
        this.f8974p.setInputSurface(this.f8973o);
        this.f8974p.setVideoFrameRate(this.f17732j.m1627e());
        this.f8974p.setVideoSize(i, i2);
        this.f8974p.setVideoEncodingBitRate(((this.f17732j.m1627e() * i) * i2) / 4);
        this.f8974p.setOrientationHint(plh0.m21586m(this.f17725c.getWindowManager(), this.f17732j.m1625c()));
        this.f8974p.prepare();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ c m12821m(TTFullScreenAutoFitSurfaceView tTFullScreenAutoFitSurfaceView, CameraDevice cameraDevice) {
        this.f17730h = cameraDevice;
        ArrayList arrayList = new ArrayList();
        arrayList.add(tTFullScreenAutoFitSurfaceView.getHolder().getSurface());
        arrayList.add(this.f8973o);
        return yid0.m28247a(cameraDevice, arrayList, this.f17727e);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m12822n(TTFullScreenAutoFitSurfaceView tTFullScreenAutoFitSurfaceView, d30 d30Var, e30 e30Var, CameraCaptureSession cameraCaptureSession) {
        this.f17731i = cameraCaptureSession;
        try {
            CaptureRequest.Builder builderCreateCaptureRequest = this.f17730h.createCaptureRequest(1);
            builderCreateCaptureRequest.addTarget(tTFullScreenAutoFitSurfaceView.getHolder().getSurface());
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

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m12823o(e30 e30Var, Throwable th) {
        if (e30Var != null) {
            e30Var.call(th);
        }
        m12824p();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m12825q(String str, final TTFullScreenAutoFitSurfaceView tTFullScreenAutoFitSurfaceView, final d30 d30Var, final e30 e30Var) {
        yid0.m28248b(this.f17728f, str, this.f17727e).flatMap(new w9j() { // from class: l.xkh0
            public final Object call(Object obj) {
                return this.f27565a.m12821m(tTFullScreenAutoFitSurfaceView, (CameraDevice) obj);
            }
        }).subscribe(mkd0.I(new e30() { // from class: l.ykh0
            public final void call(Object obj) {
                this.f28265a.m12822n(tTFullScreenAutoFitSurfaceView, d30Var, e30Var, (CameraCaptureSession) obj);
            }
        }, new e30() { // from class: l.zkh0
            public final void call(Object obj) {
                this.f28792a.m12823o(e30Var, (Throwable) obj);
            }
        }, new d30() { // from class: l.alh0
            public final void call() {
                this.f8318a.m12824p();
            }
        }));
    }
}
