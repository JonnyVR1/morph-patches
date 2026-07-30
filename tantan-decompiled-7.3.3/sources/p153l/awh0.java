package p153l;

import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.view.SurfaceView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.camera.TTCameraConfig;
import com.p051p1.mobile.putong.camera.widget.TTFullScreenAutoFitSurfaceView;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class awh0 implements y6m {

    /* JADX INFO: renamed from: b */
    public TTCameraConfig f73736b;

    /* JADX INFO: renamed from: c */
    public final Act f73737c;

    /* JADX INFO: renamed from: d */
    public MediaRecorder f73738d;

    /* JADX INFO: renamed from: a */
    public Camera f73735a = null;

    /* JADX INFO: renamed from: e */
    public boolean f73739e = false;

    /* JADX INFO: renamed from: f */
    public String f73740f = null;

    public awh0(Act act) {
        this.f73737c = act;
    }

    @Override // p153l.y6m
    /* JADX INFO: renamed from: a */
    public void mo100637a(TTFullScreenAutoFitSurfaceView tTFullScreenAutoFitSurfaceView) {
        Camera camera = this.f73735a;
        if (camera == null || this.f73739e) {
            return;
        }
        this.f73739e = true;
        camera.unlock();
        m100641e(tTFullScreenAutoFitSurfaceView);
        this.f73738d.start();
    }

    @Override // p153l.y6m
    /* JADX INFO: renamed from: b */
    public void mo100638b(TTCameraConfig tTCameraConfig) {
        this.f73736b = tTCameraConfig;
    }

    @Override // p153l.y6m
    /* JADX INFO: renamed from: c */
    public String mo100639c() {
        return this.f73740f;
    }

    @Override // p153l.y6m
    /* JADX INFO: renamed from: d */
    public void mo100640d(TTFullScreenAutoFitSurfaceView tTFullScreenAutoFitSurfaceView, @Nullable x20 x20Var, @Nullable y20<Throwable> y20Var) {
        int height;
        int width;
        try {
            this.f73735a = Camera.open(this.f73736b.m30713c());
            if (tTFullScreenAutoFitSurfaceView.getWidth() > tTFullScreenAutoFitSurfaceView.getHeight()) {
                height = tTFullScreenAutoFitSurfaceView.getWidth();
                width = tTFullScreenAutoFitSurfaceView.getHeight();
            } else {
                height = tTFullScreenAutoFitSurfaceView.getHeight();
                width = tTFullScreenAutoFitSurfaceView.getWidth();
            }
            Camera.Parameters parameters = this.f73735a.getParameters();
            Camera.Size sizeM207882j = wth0.m207882j(parameters.getSupportedPreviewSizes(), height, width);
            tTFullScreenAutoFitSurfaceView.m30883a(sizeM207882j.width, sizeM207882j.height);
            parameters.setPreviewSize(sizeM207882j.width, sizeM207882j.height);
            parameters.setFocusMode("continuous-video");
            if (parameters.isVideoStabilizationSupported()) {
                parameters.setVideoStabilization(true);
            }
            this.f73735a.setParameters(parameters);
            wth0.m207886n(this.f73737c.getWindowManager(), this.f73736b.m30713c(), this.f73735a);
            this.f73735a.setPreviewDisplay(tTFullScreenAutoFitSurfaceView.getHolder());
            this.f73735a.startPreview();
            if (x20Var != null) {
                x20Var.call();
            }
        } catch (Exception e) {
            if (y20Var != null) {
                y20Var.call(e);
            }
        }
    }

    @Override // p153l.y6m
    public void destroy() {
        m142049p();
        this.f73735a.release();
        this.f73735a = null;
    }

    /* JADX INFO: renamed from: e */
    public final void m100641e(SurfaceView surfaceView) {
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.f73738d = mediaRecorder;
        mediaRecorder.setCamera(this.f73735a);
        this.f73738d.setAudioSource(5);
        this.f73738d.setVideoSource(1);
        this.f73738d.setProfile(CamcorderProfile.get(this.f73736b.m30713c(), 5));
        String strM213085e = xth0.m213085e(null, 2);
        this.f73740f = strM213085e;
        this.f73738d.setOutputFile(strM213085e);
        this.f73738d.setPreviewDisplay(surfaceView.getHolder().getSurface());
        this.f73738d.setOrientationHint(wth0.m207885m(this.f73737c.getWindowManager(), this.f73736b.m30713c()));
        try {
            this.f73738d.prepare();
        } catch (IOException e) {
            CrashHelper.m82479c(e);
        }
    }

    @Override // p153l.y6m
    /* JADX INFO: renamed from: f */
    public void m142049p() {
        MediaRecorder mediaRecorder = this.f73738d;
        if (mediaRecorder != null) {
            mediaRecorder.reset();
            this.f73738d.release();
            this.f73738d = null;
            this.f73735a.lock();
        }
        this.f73739e = false;
    }

    @Override // p153l.y6m
    /* JADX INFO: renamed from: h */
    public boolean mo100643h() {
        return this.f73739e;
    }
}
