package p009l;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.p008ss.android.ttvecamera.AbstractC0726c;
import com.p008ss.android.ttvecamera.C0735f;
import com.p008ss.android.ttvecamera.TECameraFrame;
import com.p008ss.android.ttvecamera.TEFrameSizei;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class tjh0 extends bjh0 {

    /* JADX INFO: renamed from: k */
    private Surface f20733k;

    /* JADX INFO: renamed from: l */
    private Surface f20734l;

    /* JADX INFO: renamed from: m */
    private SurfaceTexture f20735m;

    /* JADX INFO: renamed from: n */
    private float[] f20736n;

    /* JADX INFO: renamed from: o */
    int f20737o;

    /* JADX INFO: renamed from: l.tjh0$a */
    public class C1201a implements SurfaceTexture.OnFrameAvailableListener {
        public C1201a() {
        }

        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            tjh0 tjh0Var = tjh0.this;
            if (tjh0Var.f10131d == null) {
                return;
            }
            surfaceTexture.getTransformMatrix(tjh0Var.f20736n);
            TEFrameSizei tEFrameSizei = tjh0.this.f10130c;
            TECameraFrame tECameraFrame = new TECameraFrame(tEFrameSizei.width, tEFrameSizei.height, surfaceTexture.getTimestamp());
            tjh0 tjh0Var2 = tjh0.this;
            int i = tjh0Var2.f20737o;
            int iM10993D = tjh0Var2.f10131d.m10993D();
            float[] fArr = tjh0.this.f20736n;
            tjh0 tjh0Var3 = tjh0.this;
            tECameraFrame.m10839e(i, iM10993D, fArr, tjh0Var3.f10129b, tjh0Var3.f10131d.m11016y());
            tjh0.this.m12046k(tECameraFrame);
        }
    }

    public tjh0(cjh0.C0813a c0813a, AbstractC0726c abstractC0726c) {
        super(c0813a, abstractC0726c);
        this.f20736n = new float[16];
        this.f20735m = c0813a.f10629d;
        this.f20737o = c0813a.f10630e;
        this.f20734l = new Surface(c0813a.f10629d);
        this.f20733k = c0813a.f10632g;
    }

    /* JADX INFO: renamed from: q */
    private void m22548q(@NonNull SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
        this.f20735m.setOnFrameAvailableListener(onFrameAvailableListener, this.f10131d.m10994E());
    }

    @Override // p009l.bjh0
    /* JADX INFO: renamed from: b */
    public Surface mo12037b() {
        return this.f20733k;
    }

    @Override // p009l.bjh0
    /* JADX INFO: renamed from: d */
    public Surface mo12039d() {
        return this.f20734l;
    }

    @Override // p009l.bjh0
    /* JADX INFO: renamed from: e */
    public SurfaceTexture mo12040e() {
        return this.f20735m;
    }

    @Override // p009l.bjh0
    /* JADX INFO: renamed from: g */
    public int mo12042g() {
        return 16;
    }

    @Override // p009l.bjh0
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: h */
    public int mo12043h(@NonNull StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        return mo12044i(bjh0.m12036a(streamConfigurationMap.getOutputSizes(SurfaceTexture.class)), tEFrameSizei);
    }

    @Override // p009l.bjh0
    /* JADX INFO: renamed from: i */
    public int mo12044i(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        if (list != null && list.size() > 0) {
            this.f10130c = C0735f.m11051b(list, this.f10130c);
        }
        SurfaceTexture surfaceTexture = this.f20735m;
        TEFrameSizei tEFrameSizei2 = this.f10130c;
        surfaceTexture.setDefaultBufferSize(tEFrameSizei2.width, tEFrameSizei2.height);
        m22548q(new C1201a());
        return 0;
    }

    @Override // p009l.bjh0
    /* JADX INFO: renamed from: l */
    public void mo12047l() {
        Surface surface = this.f20734l;
        if (surface != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture = this.f20735m;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.f20735m = new SurfaceTexture(this.f20737o);
        this.f20734l = new Surface(this.f20735m);
        this.f10128a.onNewSurfaceTexture(this.f20735m);
    }

    @Override // p009l.bjh0
    /* JADX INFO: renamed from: m */
    public void mo12048m() {
        super.mo12048m();
        Surface surface = this.f20734l;
        if (surface != null) {
            surface.release();
            this.f20734l = null;
        }
        Surface surface2 = this.f20733k;
        if (surface2 != null) {
            surface2.release();
            this.f20733k = null;
        }
    }
}
