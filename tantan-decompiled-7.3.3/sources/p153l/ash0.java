package p153l;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.p074ss.android.ttvecamera.AbstractC13487c;
import com.p074ss.android.ttvecamera.C13496f;
import com.p074ss.android.ttvecamera.TECameraFrame;
import com.p074ss.android.ttvecamera.TEFrameSizei;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ash0 extends irh0 {

    /* JADX INFO: renamed from: k */
    private Surface f73118k;

    /* JADX INFO: renamed from: l */
    private Surface f73119l;

    /* JADX INFO: renamed from: m */
    private SurfaceTexture f73120m;

    /* JADX INFO: renamed from: n */
    private float[] f73121n;

    /* JADX INFO: renamed from: o */
    int f73122o;

    /* JADX INFO: renamed from: l.ash0$a */
    public class C15820a implements SurfaceTexture.OnFrameAvailableListener {
        public C15820a() {
        }

        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            ash0 ash0Var = ash0.this;
            if (ash0Var.f116564d == null) {
                return;
            }
            surfaceTexture.getTransformMatrix(ash0Var.f73121n);
            TEFrameSizei tEFrameSizei = ash0.this.f116563c;
            TECameraFrame tECameraFrame = new TECameraFrame(tEFrameSizei.width, tEFrameSizei.height, surfaceTexture.getTimestamp());
            ash0 ash0Var2 = ash0.this;
            int i = ash0Var2.f73122o;
            int iM81825D = ash0Var2.f116564d.m81825D();
            float[] fArr = ash0.this.f73121n;
            ash0 ash0Var3 = ash0.this;
            tECameraFrame.m81671e(i, iM81825D, fArr, ash0Var3.f116562b, ash0Var3.f116564d.m81848y());
            ash0.this.m141825k(tECameraFrame);
        }
    }

    public ash0(jrh0.C18019a c18019a, AbstractC13487c abstractC13487c) {
        super(c18019a, abstractC13487c);
        this.f73121n = new float[16];
        this.f73120m = c18019a.f122357d;
        this.f73122o = c18019a.f122358e;
        this.f73119l = new Surface(c18019a.f122357d);
        this.f73118k = c18019a.f122360g;
    }

    /* JADX INFO: renamed from: q */
    private void m99909q(@NonNull SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
        this.f73120m.setOnFrameAvailableListener(onFrameAvailableListener, this.f116564d.m81826E());
    }

    @Override // p153l.irh0
    /* JADX INFO: renamed from: b */
    public Surface mo99910b() {
        return this.f73118k;
    }

    @Override // p153l.irh0
    /* JADX INFO: renamed from: d */
    public Surface mo99911d() {
        return this.f73119l;
    }

    @Override // p153l.irh0
    /* JADX INFO: renamed from: e */
    public SurfaceTexture mo99912e() {
        return this.f73120m;
    }

    @Override // p153l.irh0
    /* JADX INFO: renamed from: g */
    public int mo99913g() {
        return 16;
    }

    @Override // p153l.irh0
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: h */
    public int mo99914h(@NonNull StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        return mo99915i(irh0.m141821a(streamConfigurationMap.getOutputSizes(SurfaceTexture.class)), tEFrameSizei);
    }

    @Override // p153l.irh0
    /* JADX INFO: renamed from: i */
    public int mo99915i(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        if (list != null && list.size() > 0) {
            this.f116563c = C13496f.m81883b(list, this.f116563c);
        }
        SurfaceTexture surfaceTexture = this.f73120m;
        TEFrameSizei tEFrameSizei2 = this.f116563c;
        surfaceTexture.setDefaultBufferSize(tEFrameSizei2.width, tEFrameSizei2.height);
        m99909q(new C15820a());
        return 0;
    }

    @Override // p153l.irh0
    /* JADX INFO: renamed from: l */
    public void mo99916l() {
        Surface surface = this.f73119l;
        if (surface != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture = this.f73120m;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.f73120m = new SurfaceTexture(this.f73122o);
        this.f73119l = new Surface(this.f73120m);
        this.f116561a.onNewSurfaceTexture(this.f73120m);
    }

    @Override // p153l.irh0
    /* JADX INFO: renamed from: m */
    public void mo99917m() {
        super.mo99917m();
        Surface surface = this.f73119l;
        if (surface != null) {
            surface.release();
            this.f73119l = null;
        }
        Surface surface2 = this.f73118k;
        if (surface2 != null) {
            surface2.release();
            this.f73118k = null;
        }
    }
}
