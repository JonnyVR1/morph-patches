package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.camera.TTCameraConfig;
import com.p051p1.mobile.putong.camera.widget.TTFullScreenAutoFitSurfaceView;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.util.ArrayList;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
@RequiresApi(api = 23)
public class ith0 extends ush0 implements y6m {

    /* JADX INFO: renamed from: n */
    public boolean f116834n;

    /* JADX INFO: renamed from: o */
    public Surface f116835o;

    /* JADX INFO: renamed from: p */
    public MediaRecorder f116836p;

    /* JADX INFO: renamed from: q */
    public String f116837q;

    public ith0(Act act) {
        super(act);
        this.f116834n = false;
        this.f116835o = MediaCodec.createPersistentInputSurface();
    }

    @Override // p153l.y6m
    /* JADX INFO: renamed from: a */
    public void mo100637a(TTFullScreenAutoFitSurfaceView tTFullScreenAutoFitSurfaceView) {
        CameraCaptureSession cameraCaptureSession;
        if (this.f116834n || (cameraCaptureSession = this.f180828i) == null || this.f180827h == null) {
            return;
        }
        try {
            CaptureRequest.Builder builderCreateCaptureRequest = cameraCaptureSession.getDevice().createCaptureRequest(3);
            builderCreateCaptureRequest.addTarget(this.f116835o);
            builderCreateCaptureRequest.addTarget(tTFullScreenAutoFitSurfaceView.getHolder().getSurface());
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(this.f180829j.m30715e()), Integer.valueOf(this.f180829j.m30715e())));
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 3);
            this.f180828i.setRepeatingRequest(builderCreateCaptureRequest.build(), null, this.f180824e);
            this.f116834n = true;
            this.f116836p.start();
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            this.f116834n = false;
        }
    }

    @Override // p153l.ush0, p153l.y6m
    /* JADX INFO: renamed from: b */
    public void mo100638b(TTCameraConfig tTCameraConfig) {
        super.mo100638b(tTCameraConfig);
    }

    @Override // p153l.y6m
    /* JADX INFO: renamed from: c */
    public String mo100639c() {
        return this.f116837q;
    }

    @Override // p153l.y6m
    /* JADX INFO: renamed from: d */
    public void mo100640d(final TTFullScreenAutoFitSurfaceView tTFullScreenAutoFitSurfaceView, @Nullable final x20 x20Var, @Nullable final y20<Throwable> y20Var) {
        CameraCharacteristics cameraCharacteristics;
        if (this.f180830k == null || (cameraCharacteristics = this.f180831l) == null) {
            if (y20Var != null) {
                y20Var.call(new RuntimeException("cameraDevice not found"));
                return;
            }
            return;
        }
        this.f180820a = ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        wth0.C21176a c21176aM207883k = wth0.m207883k(tTFullScreenAutoFitSurfaceView.getDisplay(), this.f180831l, SurfaceHolder.class);
        Size size = c21176aM207883k.f190781a;
        tTFullScreenAutoFitSurfaceView.m30883a(size.getWidth(), size.getHeight());
        Size size2 = wth0.m207884l(this.f180831l, c21176aM207883k).f190781a;
        try {
            m142045l(size2.getWidth(), size2.getHeight());
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        final String str = this.f180830k;
        tTFullScreenAutoFitSurfaceView.post(new Runnable() { // from class: l.dth0
            @Override // java.lang.Runnable
            public final void run() {
                this.f90592a.m142050q(str, tTFullScreenAutoFitSurfaceView, x20Var, y20Var);
            }
        });
    }

    @Override // p153l.y6m
    public void destroy() {
        this.f116835o.release();
        m142049p();
        this.f180823d.quitSafely();
    }

    @Override // p153l.y6m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void m142049p() {
        MediaRecorder mediaRecorder = this.f116836p;
        if (mediaRecorder != null) {
            mediaRecorder.reset();
            this.f116836p.release();
            this.f116836p = null;
        }
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
        this.f116834n = false;
    }

    @Override // p153l.y6m
    /* JADX INFO: renamed from: h */
    public boolean mo100643h() {
        return this.f116834n;
    }

    /* JADX INFO: renamed from: l */
    public final void m142045l(int i, int i2) throws IOException {
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.f116836p = mediaRecorder;
        mediaRecorder.setAudioSource(1);
        this.f116836p.setVideoSource(2);
        this.f116836p.setOutputFormat(2);
        String strM213085e = xth0.m213085e(null, 2);
        this.f116837q = strM213085e;
        this.f116836p.setOutputFile(strM213085e);
        this.f116836p.setVideoEncoder(2);
        this.f116836p.setAudioEncoder(3);
        this.f116836p.setInputSurface(this.f116835o);
        this.f116836p.setVideoFrameRate(this.f180829j.m30715e());
        this.f116836p.setVideoSize(i, i2);
        this.f116836p.setVideoEncodingBitRate(((this.f180829j.m30715e() * i) * i2) / 4);
        this.f116836p.setOrientationHint(wth0.m207885m(this.f180822c.getWindowManager(), this.f180829j.m30713c()));
        this.f116836p.prepare();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C22421c m142046m(TTFullScreenAutoFitSurfaceView tTFullScreenAutoFitSurfaceView, CameraDevice cameraDevice) {
        this.f180827h = cameraDevice;
        ArrayList arrayList = new ArrayList();
        arrayList.add(tTFullScreenAutoFitSurfaceView.getHolder().getSurface());
        arrayList.add(this.f116835o);
        return brd0.m106123a(cameraDevice, arrayList, this.f180824e);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m142047n(TTFullScreenAutoFitSurfaceView tTFullScreenAutoFitSurfaceView, x20 x20Var, y20 y20Var, CameraCaptureSession cameraCaptureSession) {
        this.f180828i = cameraCaptureSession;
        try {
            CaptureRequest.Builder builderCreateCaptureRequest = this.f180827h.createCaptureRequest(1);
            builderCreateCaptureRequest.addTarget(tTFullScreenAutoFitSurfaceView.getHolder().getSurface());
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

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m142048o(y20 y20Var, Throwable th) {
        if (y20Var != null) {
            y20Var.call(th);
        }
        m142049p();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m142050q(String str, final TTFullScreenAutoFitSurfaceView tTFullScreenAutoFitSurfaceView, final x20 x20Var, final y20 y20Var) {
        brd0.m106124b(this.f180825f, str, this.f180824e).flatMap(new qcj() { // from class: l.eth0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f95755a.m142046m(tTFullScreenAutoFitSurfaceView, (CameraDevice) obj);
            }
        }).subscribe(psd0.m173598I(new y20() { // from class: l.fth0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100736a.m142047n(tTFullScreenAutoFitSurfaceView, x20Var, y20Var, (CameraCaptureSession) obj);
            }
        }, new y20() { // from class: l.gth0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106418a.m142048o(y20Var, (Throwable) obj);
            }
        }, new x20() { // from class: l.hth0
            @Override // p153l.x20
            public final void call() {
                this.f111541a.m142049p();
            }
        }));
    }
}
