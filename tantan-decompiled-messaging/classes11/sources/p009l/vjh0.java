package p009l;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p008ss.android.ttvecamera.AbstractC0726c;
import com.p008ss.android.ttvecamera.C0735f;
import com.p008ss.android.ttvecamera.TECameraFrame;
import com.p008ss.android.ttvecamera.TEFrameSizei;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class vjh0 extends bjh0 {

    /* JADX INFO: renamed from: k */
    SurfaceTexture f21622k;

    /* JADX INFO: renamed from: l */
    Surface f21623l;

    /* JADX INFO: renamed from: m */
    float[] f21624m;

    /* JADX INFO: renamed from: n */
    int f21625n;

    /* JADX INFO: renamed from: o */
    SurfaceTexture.OnFrameAvailableListener f21626o;

    /* JADX INFO: renamed from: l.vjh0$a */
    public class C1233a implements SurfaceTexture.OnFrameAvailableListener {
        public C1233a() {
        }

        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            vjh0 vjh0Var = vjh0.this;
            if (vjh0Var.f10131d == null) {
                return;
            }
            surfaceTexture.getTransformMatrix(vjh0Var.f21624m);
            TEFrameSizei tEFrameSizei = vjh0.this.f10130c;
            TECameraFrame tECameraFrame = new TECameraFrame(tEFrameSizei.width, tEFrameSizei.height, surfaceTexture.getTimestamp());
            vjh0 vjh0Var2 = vjh0.this;
            int i = vjh0Var2.f21625n;
            int iM10993D = vjh0Var2.f10131d.m10993D();
            vjh0 vjh0Var3 = vjh0.this;
            tECameraFrame.m10839e(i, iM10993D, vjh0Var3.f21624m, vjh0Var3.f10129b, vjh0Var3.f10131d.m11016y());
            tECameraFrame.m10841h(vjh0.this.f10134g);
            vjh0.this.m12046k(tECameraFrame);
        }
    }

    public vjh0(cjh0.C0813a c0813a, AbstractC0726c abstractC0726c) {
        super(c0813a, abstractC0726c);
        this.f21624m = new float[16];
        this.f21626o = new C1233a();
        this.f21622k = c0813a.f10629d;
        this.f21625n = c0813a.f10630e;
        this.f21623l = new Surface(this.f21622k);
    }

    /* JADX INFO: renamed from: p */
    private void m23435p(@NonNull SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
        this.f21622k.setOnFrameAvailableListener(onFrameAvailableListener, this.f10131d.m10994E());
    }

    @Override // p009l.bjh0
    /* JADX INFO: renamed from: d */
    public Surface mo12039d() {
        return this.f21623l;
    }

    @Override // p009l.bjh0
    /* JADX INFO: renamed from: e */
    public SurfaceTexture mo12040e() {
        return this.f21622k;
    }

    @Override // p009l.bjh0
    /* JADX INFO: renamed from: g */
    public int mo12042g() {
        return 1;
    }

    @Override // p009l.bjh0
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: h */
    public int mo12043h(@NonNull StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        if (!this.f10131d.m11014u().f8934a0) {
            return mo12044i(bjh0.m12036a(outputSizes), tEFrameSizei);
        }
        return mo12044i(C0735f.m11069t(bjh0.m12036a(outputSizes), bjh0.m12036a(streamConfigurationMap.getOutputSizes(MediaRecorder.class))), tEFrameSizei);
    }

    @Override // p009l.bjh0
    @RequiresApi(api = MediaPickerParamsObject.FROM_PROFILE_GAME)
    /* JADX INFO: renamed from: i */
    public int mo12044i(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        TEFrameSizei previewSize;
        if (list != null && list.size() > 0) {
            AbstractC0726c.e eVar = this.f10135h;
            if (eVar == null || (previewSize = eVar.getPreviewSize(list)) == null) {
                this.f10130c = C0735f.m11051b(list, this.f10130c);
            } else {
                this.f10130c = previewSize;
            }
        }
        SurfaceTexture surfaceTexture = this.f21622k;
        TEFrameSizei tEFrameSizei2 = this.f10130c;
        surfaceTexture.setDefaultBufferSize(tEFrameSizei2.width, tEFrameSizei2.height);
        m23435p(this.f21626o);
        return 0;
    }

    @Override // p009l.bjh0
    /* JADX INFO: renamed from: l */
    public void mo12047l() {
        Surface surface = this.f21623l;
        if (surface != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture = this.f21622k;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.f21622k = new SurfaceTexture(this.f21625n);
        this.f21623l = new Surface(this.f21622k);
        this.f10128a.onNewSurfaceTexture(this.f21622k);
    }

    @Override // p009l.bjh0
    /* JADX INFO: renamed from: m */
    public void mo12048m() {
        super.mo12048m();
        Surface surface = this.f21623l;
        if (surface != null) {
            surface.release();
            this.f21623l = null;
        }
    }
}
