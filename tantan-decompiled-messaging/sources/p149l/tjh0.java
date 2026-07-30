package p149l;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.p069ss.android.ttvecamera.AbstractC13324c;
import com.p069ss.android.ttvecamera.C13333f;
import com.p069ss.android.ttvecamera.TECameraFrame;
import com.p069ss.android.ttvecamera.TEFrameSizei;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class tjh0 extends bjh0 {

    /* JADX INFO: renamed from: k */
    private Surface f170724k;

    /* JADX INFO: renamed from: l */
    private Surface f170725l;

    /* JADX INFO: renamed from: m */
    private SurfaceTexture f170726m;

    /* JADX INFO: renamed from: n */
    private float[] f170727n;

    /* JADX INFO: renamed from: o */
    int f170728o;

    /* JADX INFO: renamed from: l.tjh0$a */
    public class C20190a implements SurfaceTexture.OnFrameAvailableListener {
        public C20190a() {
        }

        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            tjh0 tjh0Var = tjh0.this;
            if (tjh0Var.f75908d == null) {
                return;
            }
            surfaceTexture.getTransformMatrix(tjh0Var.f170727n);
            TEFrameSizei tEFrameSizei = tjh0.this.f75907c;
            TECameraFrame tECameraFrame = new TECameraFrame(tEFrameSizei.width, tEFrameSizei.height, surfaceTexture.getTimestamp());
            tjh0 tjh0Var2 = tjh0.this;
            int i = tjh0Var2.f170728o;
            int iM80642D = tjh0Var2.f75908d.m80642D();
            float[] fArr = tjh0.this.f170727n;
            tjh0 tjh0Var3 = tjh0.this;
            tECameraFrame.m80488e(i, iM80642D, fArr, tjh0Var3.f75906b, tjh0Var3.f75908d.m80665y());
            tjh0.this.m102177k(tECameraFrame);
        }
    }

    public tjh0(cjh0.C16167a c16167a, AbstractC13324c abstractC13324c) {
        super(c16167a, abstractC13324c);
        this.f170727n = new float[16];
        this.f170726m = c16167a.f81185d;
        this.f170728o = c16167a.f81186e;
        this.f170725l = new Surface(c16167a.f81185d);
        this.f170724k = c16167a.f81188g;
    }

    /* JADX INFO: renamed from: q */
    private void m189333q(@NonNull SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
        this.f170726m.setOnFrameAvailableListener(onFrameAvailableListener, this.f75908d.m80643E());
    }

    @Override // p149l.bjh0
    /* JADX INFO: renamed from: b */
    public Surface mo102168b() {
        return this.f170724k;
    }

    @Override // p149l.bjh0
    /* JADX INFO: renamed from: d */
    public Surface mo102170d() {
        return this.f170725l;
    }

    @Override // p149l.bjh0
    /* JADX INFO: renamed from: e */
    public SurfaceTexture mo102171e() {
        return this.f170726m;
    }

    @Override // p149l.bjh0
    /* JADX INFO: renamed from: g */
    public int mo102173g() {
        return 16;
    }

    @Override // p149l.bjh0
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: h */
    public int mo102174h(@NonNull StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        return mo102175i(bjh0.m102167a(streamConfigurationMap.getOutputSizes(SurfaceTexture.class)), tEFrameSizei);
    }

    @Override // p149l.bjh0
    /* JADX INFO: renamed from: i */
    public int mo102175i(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        if (list != null && list.size() > 0) {
            this.f75907c = C13333f.m80700b(list, this.f75907c);
        }
        SurfaceTexture surfaceTexture = this.f170726m;
        TEFrameSizei tEFrameSizei2 = this.f75907c;
        surfaceTexture.setDefaultBufferSize(tEFrameSizei2.width, tEFrameSizei2.height);
        m189333q(new C20190a());
        return 0;
    }

    @Override // p149l.bjh0
    /* JADX INFO: renamed from: l */
    public void mo102178l() {
        Surface surface = this.f170725l;
        if (surface != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture = this.f170726m;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.f170726m = new SurfaceTexture(this.f170728o);
        this.f170725l = new Surface(this.f170726m);
        this.f75905a.onNewSurfaceTexture(this.f170726m);
    }

    @Override // p149l.bjh0
    /* JADX INFO: renamed from: m */
    public void mo102179m() {
        super.mo102179m();
        Surface surface = this.f170725l;
        if (surface != null) {
            surface.release();
            this.f170725l = null;
        }
        Surface surface2 = this.f170724k;
        if (surface2 != null) {
            surface2.release();
            this.f170724k = null;
        }
    }
}
