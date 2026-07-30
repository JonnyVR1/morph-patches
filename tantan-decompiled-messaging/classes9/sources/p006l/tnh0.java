package p006l;

import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.view.SurfaceView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.camera.TTCameraConfig;
import com.p000p1.mobile.putong.camera.widget.TTFullScreenAutoFitSurfaceView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import l.d30;
import l.e30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class tnh0 implements i4m {

    /* JADX INFO: renamed from: b */
    public TTCameraConfig f22198b;

    /* JADX INFO: renamed from: c */
    public final Act f22199c;

    /* JADX INFO: renamed from: d */
    public MediaRecorder f22200d;

    /* JADX INFO: renamed from: a */
    public Camera f22197a = null;

    /* JADX INFO: renamed from: e */
    public boolean f22201e = false;

    /* JADX INFO: renamed from: f */
    public String f22202f = null;

    public tnh0(Act act) {
        this.f22199c = act;
    }

    @Override // p006l.i4m
    /* JADX INFO: renamed from: a */
    public void mo12814a(TTFullScreenAutoFitSurfaceView tTFullScreenAutoFitSurfaceView) {
        Camera camera = this.f22197a;
        if (camera == null || this.f22201e) {
            return;
        }
        this.f22201e = true;
        camera.unlock();
        m24753e(tTFullScreenAutoFitSurfaceView);
        this.f22200d.start();
    }

    @Override // p006l.i4m
    /* JADX INFO: renamed from: b */
    public void mo12815b(TTCameraConfig tTCameraConfig) {
        this.f22198b = tTCameraConfig;
    }

    @Override // p006l.i4m
    /* JADX INFO: renamed from: c */
    public String mo12816c() {
        return this.f22202f;
    }

    @Override // p006l.i4m
    /* JADX INFO: renamed from: d */
    public void mo12817d(TTFullScreenAutoFitSurfaceView tTFullScreenAutoFitSurfaceView, @Nullable d30 d30Var, @Nullable e30<Throwable> e30Var) {
        int height;
        int width;
        try {
            this.f22197a = Camera.open(this.f22198b.m1625c());
            if (tTFullScreenAutoFitSurfaceView.getWidth() > tTFullScreenAutoFitSurfaceView.getHeight()) {
                height = tTFullScreenAutoFitSurfaceView.getWidth();
                width = tTFullScreenAutoFitSurfaceView.getHeight();
            } else {
                height = tTFullScreenAutoFitSurfaceView.getHeight();
                width = tTFullScreenAutoFitSurfaceView.getWidth();
            }
            Camera.Parameters parameters = this.f22197a.getParameters();
            Camera.Size sizeM21583j = plh0.m21583j(parameters.getSupportedPreviewSizes(), height, width);
            tTFullScreenAutoFitSurfaceView.m1797a(sizeM21583j.width, sizeM21583j.height);
            parameters.setPreviewSize(sizeM21583j.width, sizeM21583j.height);
            parameters.setFocusMode("continuous-video");
            if (parameters.isVideoStabilizationSupported()) {
                parameters.setVideoStabilization(true);
            }
            this.f22197a.setParameters(parameters);
            plh0.m21587n(this.f22199c.getWindowManager(), this.f22198b.m1625c(), this.f22197a);
            this.f22197a.setPreviewDisplay(tTFullScreenAutoFitSurfaceView.getHolder());
            this.f22197a.startPreview();
            if (d30Var != null) {
                d30Var.call();
            }
        } catch (Exception e) {
            if (e30Var != null) {
                e30Var.call(e);
            }
        }
    }

    @Override // p006l.i4m
    public void destroy() {
        mo12818f();
        this.f22197a.release();
        this.f22197a = null;
    }

    /* JADX INFO: renamed from: e */
    public final void m24753e(SurfaceView surfaceView) {
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.f22200d = mediaRecorder;
        mediaRecorder.setCamera(this.f22197a);
        this.f22200d.setAudioSource(5);
        this.f22200d.setVideoSource(1);
        this.f22200d.setProfile(CamcorderProfile.get(this.f22198b.m1625c(), 5));
        String strM22289e = qlh0.m22289e(null, 2);
        this.f22202f = strM22289e;
        this.f22200d.setOutputFile(strM22289e);
        this.f22200d.setPreviewDisplay(surfaceView.getHolder().getSurface());
        this.f22200d.setOrientationHint(plh0.m21586m(this.f22199c.getWindowManager(), this.f22198b.m1625c()));
        try {
            this.f22200d.prepare();
        } catch (IOException e) {
            CrashHelper.c(e);
        }
    }

    @Override // p006l.i4m
    /* JADX INFO: renamed from: f */
    public void mo12818f() {
        MediaRecorder mediaRecorder = this.f22200d;
        if (mediaRecorder != null) {
            mediaRecorder.reset();
            this.f22200d.release();
            this.f22200d = null;
            this.f22197a.lock();
        }
        this.f22201e = false;
    }

    @Override // p006l.i4m
    /* JADX INFO: renamed from: h */
    public boolean mo12819h() {
        return this.f22201e;
    }
}
