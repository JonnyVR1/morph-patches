package p153l;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.p074ss.android.ttvecamera.AbstractC13487c;
import com.p074ss.android.ttvecamera.C13496f;
import com.p074ss.android.ttvecamera.TECameraFrame;
import com.p074ss.android.ttvecamera.TEFrameSizei;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
@RequiresApi(api = 19)
public class yrh0 extends irh0 {

    /* JADX INFO: renamed from: k */
    SurfaceTexture f201320k;

    /* JADX INFO: renamed from: l */
    float[] f201321l;

    /* JADX INFO: renamed from: m */
    int f201322m;

    /* JADX INFO: renamed from: n */
    ImageReader[] f201323n;

    /* JADX INFO: renamed from: o */
    Surface[] f201324o;

    /* JADX INFO: renamed from: l.yrh0$a */
    public class C21670a implements ImageReader.OnImageAvailableListener {
        public C21670a() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Image imageAcquireNextImage = imageReader.acquireNextImage();
            if (imageAcquireNextImage == null) {
                return;
            }
            TECameraFrame tECameraFrame = new TECameraFrame(imageAcquireNextImage.getWidth(), imageAcquireNextImage.getHeight(), System.currentTimeMillis() * 1000);
            zrh0 zrh0Var = new zrh0(imageAcquireNextImage.getPlanes());
            int iM81825D = yrh0.this.f116564d.m81825D();
            yrh0 yrh0Var = yrh0.this;
            tECameraFrame.m81672f(zrh0Var, iM81825D, yrh0Var.f116562b, yrh0Var.f116564d.m81848y());
            yrh0.this.m141825k(tECameraFrame);
            imageAcquireNextImage.close();
        }
    }

    public yrh0(jrh0.C18019a c18019a, AbstractC13487c abstractC13487c) {
        super(c18019a, abstractC13487c);
        this.f201321l = new float[16];
        SurfaceTexture surfaceTexture = c18019a.f122357d;
        this.f201320k = surfaceTexture;
        this.f201322m = c18019a.f122358e;
        int i = this.f116566f;
        this.f201323n = new ImageReader[i];
        Surface[] surfaceArr = new Surface[surfaceTexture != null ? i + 1 : i];
        this.f201324o = surfaceArr;
        if (surfaceTexture != null) {
            surfaceArr[0] = new Surface(this.f201320k);
        }
    }

    @Override // p153l.irh0
    /* JADX INFO: renamed from: d */
    public Surface mo99911d() {
        Surface[] surfaceArr = this.f201324o;
        if (surfaceArr != null) {
            return surfaceArr[0];
        }
        return null;
    }

    @Override // p153l.irh0
    /* JADX INFO: renamed from: e */
    public SurfaceTexture mo99912e() {
        return this.f201320k;
    }

    @Override // p153l.irh0
    /* JADX INFO: renamed from: f */
    public Surface[] mo141823f() {
        return this.f201324o;
    }

    @Override // p153l.irh0
    /* JADX INFO: renamed from: g */
    public int mo99913g() {
        return 8;
    }

    @Override // p153l.irh0
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: h */
    public int mo99914h(@NonNull StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        int[] outputFormats = streamConfigurationMap.getOutputFormats();
        int iM81666g = TECameraFrame.m81666g(this.f116562b);
        int i = 0;
        for (int i2 : outputFormats) {
            if (i2 == iM81666g) {
                i = i2;
                break;
            }
        }
        if (i == 0) {
            this.f116562b = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_YUV420;
            i = 35;
        }
        return mo99915i(irh0.m141821a(streamConfigurationMap.getOutputSizes(i)), tEFrameSizei);
    }

    @Override // p153l.irh0
    /* JADX INFO: renamed from: i */
    public int mo99915i(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        if (list != null && list.size() > 0) {
            this.f116563c = C13496f.m81883b(list, this.f116563c);
        }
        SurfaceTexture surfaceTexture = this.f201320k;
        if (surfaceTexture != null) {
            TEFrameSizei tEFrameSizei2 = this.f116563c;
            surfaceTexture.setDefaultBufferSize(tEFrameSizei2.width, tEFrameSizei2.height);
        }
        for (int i = 0; i < this.f116566f; i++) {
            ImageReader[] imageReaderArr = this.f201323n;
            TEFrameSizei tEFrameSizei3 = this.f116563c;
            imageReaderArr[i] = ImageReader.newInstance(tEFrameSizei3.width, tEFrameSizei3.height, TECameraFrame.m81666g(this.f116562b), 1);
            this.f201323n[i].setOnImageAvailableListener(new C21670a(), this.f116564d.m81826E());
            SurfaceTexture surfaceTexture2 = this.f201320k;
            Surface[] surfaceArr = this.f201324o;
            if (surfaceTexture2 != null) {
                surfaceArr[i + 1] = this.f201323n[i].getSurface();
            } else {
                surfaceArr[i] = this.f201323n[i].getSurface();
            }
        }
        return 0;
    }

    @Override // p153l.irh0
    /* JADX INFO: renamed from: m */
    public void mo99917m() {
        Surface[] surfaceArr;
        Surface surface;
        super.mo99917m();
        ImageReader[] imageReaderArr = this.f201323n;
        if (imageReaderArr != null) {
            for (ImageReader imageReader : imageReaderArr) {
                if (imageReader != null) {
                    imageReader.close();
                }
            }
            this.f201323n = null;
        }
        if (this.f201320k == null || (surfaceArr = this.f201324o) == null || (surface = surfaceArr[0]) == null) {
            return;
        }
        surface.release();
    }

    @Override // p153l.irh0
    /* JADX INFO: renamed from: l */
    public void mo99916l() {
    }
}
