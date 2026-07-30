package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.camera.TTCameraConfig;
import com.p046p1.mobile.putong.camera.widget.TTFullScreenAutoFitSurfaceView;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.util.ArrayList;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
@RequiresApi(api = 23)
public class blh0 extends nkh0 implements i4m {

    /* JADX INFO: renamed from: n */
    public boolean f76187n;

    /* JADX INFO: renamed from: o */
    public Surface f76188o;

    /* JADX INFO: renamed from: p */
    public MediaRecorder f76189p;

    /* JADX INFO: renamed from: q */
    public String f76190q;

    public blh0(Act act) {
        super(act);
        this.f76187n = false;
        this.f76188o = MediaCodec.createPersistentInputSurface();
    }

    @Override // p149l.i4m
    /* JADX INFO: renamed from: a */
    public void mo102530a(TTFullScreenAutoFitSurfaceView tTFullScreenAutoFitSurfaceView) {
        CameraCaptureSession cameraCaptureSession;
        if (this.f76187n || (cameraCaptureSession = this.f139424i) == null || this.f139423h == null) {
            return;
        }
        try {
            CaptureRequest.Builder builderCreateCaptureRequest = cameraCaptureSession.getDevice().createCaptureRequest(3);
            builderCreateCaptureRequest.addTarget(this.f76188o);
            builderCreateCaptureRequest.addTarget(tTFullScreenAutoFitSurfaceView.getHolder().getSurface());
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(this.f139425j.m29717e()), Integer.valueOf(this.f139425j.m29717e())));
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 3);
            this.f139424i.setRepeatingRequest(builderCreateCaptureRequest.build(), null, this.f139420e);
            this.f76187n = true;
            this.f76189p.start();
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            this.f76187n = false;
        }
    }

    @Override // p149l.nkh0, p149l.i4m
    /* JADX INFO: renamed from: b */
    public void mo102531b(TTCameraConfig tTCameraConfig) {
        super.mo102531b(tTCameraConfig);
    }

    @Override // p149l.i4m
    /* JADX INFO: renamed from: c */
    public String mo102532c() {
        return this.f76190q;
    }

    @Override // p149l.i4m
    /* JADX INFO: renamed from: d */
    public void mo102533d(final TTFullScreenAutoFitSurfaceView tTFullScreenAutoFitSurfaceView, @Nullable final d30 d30Var, @Nullable final e30<Throwable> e30Var) {
        CameraCharacteristics cameraCharacteristics;
        if (this.f139426k == null || (cameraCharacteristics = this.f139427l) == null) {
            if (e30Var != null) {
                e30Var.call(new RuntimeException("cameraDevice not found"));
                return;
            }
            return;
        }
        this.f139416a = ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        plh0.C19269a c19269aM170193k = plh0.m170193k(tTFullScreenAutoFitSurfaceView.getDisplay(), this.f139427l, SurfaceHolder.class);
        Size size = c19269aM170193k.f150135a;
        tTFullScreenAutoFitSurfaceView.m29885a(size.getWidth(), size.getHeight());
        Size size2 = plh0.m170194l(this.f139427l, c19269aM170193k).f150135a;
        try {
            m102536l(size2.getWidth(), size2.getHeight());
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        final String str = this.f139426k;
        tTFullScreenAutoFitSurfaceView.post(new Runnable() { // from class: l.wkh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f186763a.m102541q(str, tTFullScreenAutoFitSurfaceView, d30Var, e30Var);
            }
        });
    }

    @Override // p149l.i4m
    public void destroy() {
        this.f76188o.release();
        m102540p();
        this.f139419d.quitSafely();
    }

    @Override // p149l.i4m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void m102540p() {
        MediaRecorder mediaRecorder = this.f76189p;
        if (mediaRecorder != null) {
            mediaRecorder.reset();
            this.f76189p.release();
            this.f76189p = null;
        }
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
        this.f76187n = false;
    }

    @Override // p149l.i4m
    /* JADX INFO: renamed from: h */
    public boolean mo102535h() {
        return this.f76187n;
    }

    /* JADX INFO: renamed from: l */
    public final void m102536l(int i, int i2) throws IOException {
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.f76189p = mediaRecorder;
        mediaRecorder.setAudioSource(1);
        this.f76189p.setVideoSource(2);
        this.f76189p.setOutputFormat(2);
        String strM175486e = qlh0.m175486e(null, 2);
        this.f76190q = strM175486e;
        this.f76189p.setOutputFile(strM175486e);
        this.f76189p.setVideoEncoder(2);
        this.f76189p.setAudioEncoder(3);
        this.f76189p.setInputSurface(this.f76188o);
        this.f76189p.setVideoFrameRate(this.f139425j.m29717e());
        this.f76189p.setVideoSize(i, i2);
        this.f76189p.setVideoEncodingBitRate(((this.f139425j.m29717e() * i) * i2) / 4);
        this.f76189p.setOrientationHint(plh0.m170195m(this.f139418c.getWindowManager(), this.f139425j.m29715c()));
        this.f76189p.prepare();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C22306c m102537m(TTFullScreenAutoFitSurfaceView tTFullScreenAutoFitSurfaceView, CameraDevice cameraDevice) {
        this.f139423h = cameraDevice;
        ArrayList arrayList = new ArrayList();
        arrayList.add(tTFullScreenAutoFitSurfaceView.getHolder().getSurface());
        arrayList.add(this.f76188o);
        return yid0.m214888a(cameraDevice, arrayList, this.f139420e);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m102538n(TTFullScreenAutoFitSurfaceView tTFullScreenAutoFitSurfaceView, d30 d30Var, e30 e30Var, CameraCaptureSession cameraCaptureSession) {
        this.f139424i = cameraCaptureSession;
        try {
            CaptureRequest.Builder builderCreateCaptureRequest = this.f139423h.createCaptureRequest(1);
            builderCreateCaptureRequest.addTarget(tTFullScreenAutoFitSurfaceView.getHolder().getSurface());
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

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m102539o(e30 e30Var, Throwable th) {
        if (e30Var != null) {
            e30Var.call(th);
        }
        m102540p();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m102541q(String str, final TTFullScreenAutoFitSurfaceView tTFullScreenAutoFitSurfaceView, final d30 d30Var, final e30 e30Var) {
        yid0.m214889b(this.f139421f, str, this.f139420e).flatMap(new w9j() { // from class: l.xkh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f193300a.m102537m(tTFullScreenAutoFitSurfaceView, (CameraDevice) obj);
            }
        }).subscribe(mkd0.m154957I(new e30() { // from class: l.ykh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198752a.m102538n(tTFullScreenAutoFitSurfaceView, d30Var, e30Var, (CameraCaptureSession) obj);
            }
        }, new e30() { // from class: l.zkh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203540a.m102539o(e30Var, (Throwable) obj);
            }
        }, new d30() { // from class: l.alh0
            @Override // p149l.d30
            public final void call() {
                this.f70435a.m102540p();
            }
        }));
    }
}
