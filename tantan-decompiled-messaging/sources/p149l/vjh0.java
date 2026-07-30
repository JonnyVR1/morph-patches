package p149l;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.p069ss.android.ttvecamera.AbstractC13324c;
import com.p069ss.android.ttvecamera.C13333f;
import com.p069ss.android.ttvecamera.TECameraFrame;
import com.p069ss.android.ttvecamera.TEFrameSizei;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class vjh0 extends bjh0 {

    /* JADX INFO: renamed from: k */
    SurfaceTexture f181705k;

    /* JADX INFO: renamed from: l */
    Surface f181706l;

    /* JADX INFO: renamed from: m */
    float[] f181707m;

    /* JADX INFO: renamed from: n */
    int f181708n;

    /* JADX INFO: renamed from: o */
    SurfaceTexture.OnFrameAvailableListener f181709o;

    /* JADX INFO: renamed from: l.vjh0$a */
    public class C20651a implements SurfaceTexture.OnFrameAvailableListener {
        public C20651a() {
        }

        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            vjh0 vjh0Var = vjh0.this;
            if (vjh0Var.f75908d == null) {
                return;
            }
            surfaceTexture.getTransformMatrix(vjh0Var.f181707m);
            TEFrameSizei tEFrameSizei = vjh0.this.f75907c;
            TECameraFrame tECameraFrame = new TECameraFrame(tEFrameSizei.width, tEFrameSizei.height, surfaceTexture.getTimestamp());
            vjh0 vjh0Var2 = vjh0.this;
            int i = vjh0Var2.f181708n;
            int iM80642D = vjh0Var2.f75908d.m80642D();
            vjh0 vjh0Var3 = vjh0.this;
            tECameraFrame.m80488e(i, iM80642D, vjh0Var3.f181707m, vjh0Var3.f75906b, vjh0Var3.f75908d.m80665y());
            tECameraFrame.m80490h(vjh0.this.f75911g);
            vjh0.this.m102177k(tECameraFrame);
        }
    }

    public vjh0(cjh0.C16167a c16167a, AbstractC13324c abstractC13324c) {
        super(c16167a, abstractC13324c);
        this.f181707m = new float[16];
        this.f181709o = new C20651a();
        this.f181705k = c16167a.f81185d;
        this.f181708n = c16167a.f81186e;
        this.f181706l = new Surface(this.f181705k);
    }

    /* JADX INFO: renamed from: p */
    private void m198652p(@NonNull SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
        this.f181705k.setOnFrameAvailableListener(onFrameAvailableListener, this.f75908d.m80643E());
    }

    @Override // p149l.bjh0
    /* JADX INFO: renamed from: d */
    public Surface mo102170d() {
        return this.f181706l;
    }

    @Override // p149l.bjh0
    /* JADX INFO: renamed from: e */
    public SurfaceTexture mo102171e() {
        return this.f181705k;
    }

    @Override // p149l.bjh0
    /* JADX INFO: renamed from: g */
    public int mo102173g() {
        return 1;
    }

    @Override // p149l.bjh0
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: h */
    public int mo102174h(@NonNull StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        if (!this.f75908d.m80663u().f55328a0) {
            return mo102175i(bjh0.m102167a(outputSizes), tEFrameSizei);
        }
        return mo102175i(C13333f.m80718t(bjh0.m102167a(outputSizes), bjh0.m102167a(streamConfigurationMap.getOutputSizes(MediaRecorder.class))), tEFrameSizei);
    }

    @Override // p149l.bjh0
    @RequiresApi(api = 15)
    /* JADX INFO: renamed from: i */
    public int mo102175i(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        TEFrameSizei previewSize;
        if (list != null && list.size() > 0) {
            AbstractC13324c.e eVar = this.f75912h;
            if (eVar == null || (previewSize = eVar.getPreviewSize(list)) == null) {
                this.f75907c = C13333f.m80700b(list, this.f75907c);
            } else {
                this.f75907c = previewSize;
            }
        }
        SurfaceTexture surfaceTexture = this.f181705k;
        TEFrameSizei tEFrameSizei2 = this.f75907c;
        surfaceTexture.setDefaultBufferSize(tEFrameSizei2.width, tEFrameSizei2.height);
        m198652p(this.f181709o);
        return 0;
    }

    @Override // p149l.bjh0
    /* JADX INFO: renamed from: l */
    public void mo102178l() {
        Surface surface = this.f181706l;
        if (surface != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture = this.f181705k;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.f181705k = new SurfaceTexture(this.f181708n);
        this.f181706l = new Surface(this.f181705k);
        this.f75905a.onNewSurfaceTexture(this.f181705k);
    }

    @Override // p149l.bjh0
    /* JADX INFO: renamed from: m */
    public void mo102179m() {
        super.mo102179m();
        Surface surface = this.f181706l;
        if (surface != null) {
            surface.release();
            this.f181706l = null;
        }
    }
}
