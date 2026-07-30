package p153l;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.p074ss.android.ttvecamera.AbstractC13487c;
import com.p074ss.android.ttvecamera.C13496f;
import com.p074ss.android.ttvecamera.TECameraFrame;
import com.p074ss.android.ttvecamera.TEFrameSizei;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class csh0 extends irh0 {

    /* JADX INFO: renamed from: k */
    SurfaceTexture f83457k;

    /* JADX INFO: renamed from: l */
    Surface f83458l;

    /* JADX INFO: renamed from: m */
    float[] f83459m;

    /* JADX INFO: renamed from: n */
    int f83460n;

    /* JADX INFO: renamed from: o */
    SurfaceTexture.OnFrameAvailableListener f83461o;

    /* JADX INFO: renamed from: l.csh0$a */
    public class C16351a implements SurfaceTexture.OnFrameAvailableListener {
        public C16351a() {
        }

        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            csh0 csh0Var = csh0.this;
            if (csh0Var.f116564d == null) {
                return;
            }
            surfaceTexture.getTransformMatrix(csh0Var.f83459m);
            TEFrameSizei tEFrameSizei = csh0.this.f116563c;
            TECameraFrame tECameraFrame = new TECameraFrame(tEFrameSizei.width, tEFrameSizei.height, surfaceTexture.getTimestamp());
            csh0 csh0Var2 = csh0.this;
            int i = csh0Var2.f83460n;
            int iM81825D = csh0Var2.f116564d.m81825D();
            csh0 csh0Var3 = csh0.this;
            tECameraFrame.m81671e(i, iM81825D, csh0Var3.f83459m, csh0Var3.f116562b, csh0Var3.f116564d.m81848y());
            tECameraFrame.m81673h(csh0.this.f116567g);
            csh0.this.m141825k(tECameraFrame);
        }
    }

    public csh0(jrh0.C18019a c18019a, AbstractC13487c abstractC13487c) {
        super(c18019a, abstractC13487c);
        this.f83459m = new float[16];
        this.f83461o = new C16351a();
        this.f83457k = c18019a.f122357d;
        this.f83460n = c18019a.f122358e;
        this.f83458l = new Surface(this.f83457k);
    }

    /* JADX INFO: renamed from: p */
    private void m112181p(@NonNull SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
        this.f83457k.setOnFrameAvailableListener(onFrameAvailableListener, this.f116564d.m81826E());
    }

    @Override // p153l.irh0
    /* JADX INFO: renamed from: d */
    public Surface mo99911d() {
        return this.f83458l;
    }

    @Override // p153l.irh0
    /* JADX INFO: renamed from: e */
    public SurfaceTexture mo99912e() {
        return this.f83457k;
    }

    @Override // p153l.irh0
    /* JADX INFO: renamed from: g */
    public int mo99913g() {
        return 1;
    }

    @Override // p153l.irh0
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: h */
    public int mo99914h(@NonNull StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        if (!this.f116564d.m81846u().f56176a0) {
            return mo99915i(irh0.m141821a(outputSizes), tEFrameSizei);
        }
        return mo99915i(C13496f.m81901t(irh0.m141821a(outputSizes), irh0.m141821a(streamConfigurationMap.getOutputSizes(MediaRecorder.class))), tEFrameSizei);
    }

    @Override // p153l.irh0
    @RequiresApi(api = 15)
    /* JADX INFO: renamed from: i */
    public int mo99915i(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        TEFrameSizei previewSize;
        if (list != null && list.size() > 0) {
            AbstractC13487c.e eVar = this.f116568h;
            if (eVar == null || (previewSize = eVar.getPreviewSize(list)) == null) {
                this.f116563c = C13496f.m81883b(list, this.f116563c);
            } else {
                this.f116563c = previewSize;
            }
        }
        SurfaceTexture surfaceTexture = this.f83457k;
        TEFrameSizei tEFrameSizei2 = this.f116563c;
        surfaceTexture.setDefaultBufferSize(tEFrameSizei2.width, tEFrameSizei2.height);
        m112181p(this.f83461o);
        return 0;
    }

    @Override // p153l.irh0
    /* JADX INFO: renamed from: l */
    public void mo99916l() {
        Surface surface = this.f83458l;
        if (surface != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture = this.f83457k;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.f83457k = new SurfaceTexture(this.f83460n);
        this.f83458l = new Surface(this.f83457k);
        this.f116561a.onNewSurfaceTexture(this.f83457k);
    }

    @Override // p153l.irh0
    /* JADX INFO: renamed from: m */
    public void mo99917m() {
        super.mo99917m();
        Surface surface = this.f83458l;
        if (surface != null) {
            surface.release();
            this.f83458l = null;
        }
    }
}
