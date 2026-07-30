package p149l;

import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.view.SurfaceView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.camera.TTCameraConfig;
import com.p046p1.mobile.putong.camera.widget.TTFullScreenAutoFitSurfaceView;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class tnh0 implements i4m {

    /* JADX INFO: renamed from: b */
    public TTCameraConfig f171241b;

    /* JADX INFO: renamed from: c */
    public final Act f171242c;

    /* JADX INFO: renamed from: d */
    public MediaRecorder f171243d;

    /* JADX INFO: renamed from: a */
    public Camera f171240a = null;

    /* JADX INFO: renamed from: e */
    public boolean f171244e = false;

    /* JADX INFO: renamed from: f */
    public String f171245f = null;

    public tnh0(Act act) {
        this.f171242c = act;
    }

    @Override // p149l.i4m
    /* JADX INFO: renamed from: a */
    public void mo102530a(TTFullScreenAutoFitSurfaceView tTFullScreenAutoFitSurfaceView) {
        Camera camera = this.f171240a;
        if (camera == null || this.f171244e) {
            return;
        }
        this.f171244e = true;
        camera.unlock();
        m189776e(tTFullScreenAutoFitSurfaceView);
        this.f171243d.start();
    }

    @Override // p149l.i4m
    /* JADX INFO: renamed from: b */
    public void mo102531b(TTCameraConfig tTCameraConfig) {
        this.f171241b = tTCameraConfig;
    }

    @Override // p149l.i4m
    /* JADX INFO: renamed from: c */
    public String mo102532c() {
        return this.f171245f;
    }

    @Override // p149l.i4m
    /* JADX INFO: renamed from: d */
    public void mo102533d(TTFullScreenAutoFitSurfaceView tTFullScreenAutoFitSurfaceView, @Nullable d30 d30Var, @Nullable e30<Throwable> e30Var) {
        int height;
        int width;
        try {
            this.f171240a = Camera.open(this.f171241b.m29715c());
            if (tTFullScreenAutoFitSurfaceView.getWidth() > tTFullScreenAutoFitSurfaceView.getHeight()) {
                height = tTFullScreenAutoFitSurfaceView.getWidth();
                width = tTFullScreenAutoFitSurfaceView.getHeight();
            } else {
                height = tTFullScreenAutoFitSurfaceView.getHeight();
                width = tTFullScreenAutoFitSurfaceView.getWidth();
            }
            Camera.Parameters parameters = this.f171240a.getParameters();
            Camera.Size sizeM170192j = plh0.m170192j(parameters.getSupportedPreviewSizes(), height, width);
            tTFullScreenAutoFitSurfaceView.m29885a(sizeM170192j.width, sizeM170192j.height);
            parameters.setPreviewSize(sizeM170192j.width, sizeM170192j.height);
            parameters.setFocusMode("continuous-video");
            if (parameters.isVideoStabilizationSupported()) {
                parameters.setVideoStabilization(true);
            }
            this.f171240a.setParameters(parameters);
            plh0.m170196n(this.f171242c.getWindowManager(), this.f171241b.m29715c(), this.f171240a);
            this.f171240a.setPreviewDisplay(tTFullScreenAutoFitSurfaceView.getHolder());
            this.f171240a.startPreview();
            if (d30Var != null) {
                d30Var.call();
            }
        } catch (Exception e) {
            if (e30Var != null) {
                e30Var.call(e);
            }
        }
    }

    @Override // p149l.i4m
    public void destroy() {
        m102540p();
        this.f171240a.release();
        this.f171240a = null;
    }

    /* JADX INFO: renamed from: e */
    public final void m189776e(SurfaceView surfaceView) {
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.f171243d = mediaRecorder;
        mediaRecorder.setCamera(this.f171240a);
        this.f171243d.setAudioSource(5);
        this.f171243d.setVideoSource(1);
        this.f171243d.setProfile(CamcorderProfile.get(this.f171241b.m29715c(), 5));
        String strM175486e = qlh0.m175486e(null, 2);
        this.f171245f = strM175486e;
        this.f171243d.setOutputFile(strM175486e);
        this.f171243d.setPreviewDisplay(surfaceView.getHolder().getSurface());
        this.f171243d.setOrientationHint(plh0.m170195m(this.f171242c.getWindowManager(), this.f171241b.m29715c()));
        try {
            this.f171243d.prepare();
        } catch (IOException e) {
            CrashHelper.m81296c(e);
        }
    }

    @Override // p149l.i4m
    /* JADX INFO: renamed from: f */
    public void m102540p() {
        MediaRecorder mediaRecorder = this.f171243d;
        if (mediaRecorder != null) {
            mediaRecorder.reset();
            this.f171243d.release();
            this.f171243d = null;
            this.f171240a.lock();
        }
        this.f171244e = false;
    }

    @Override // p149l.i4m
    /* JADX INFO: renamed from: h */
    public boolean mo102535h() {
        return this.f171244e;
    }
}
