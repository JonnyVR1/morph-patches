package p149l;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.p069ss.android.ttvecamera.AbstractC13324c;
import com.p069ss.android.ttvecamera.C13333f;
import com.p069ss.android.ttvecamera.TECameraFrame;
import com.p069ss.android.ttvecamera.TEFrameSizei;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
@RequiresApi(api = 19)
public class rjh0 extends bjh0 {

    /* JADX INFO: renamed from: k */
    SurfaceTexture f159689k;

    /* JADX INFO: renamed from: l */
    float[] f159690l;

    /* JADX INFO: renamed from: m */
    int f159691m;

    /* JADX INFO: renamed from: n */
    ImageReader[] f159692n;

    /* JADX INFO: renamed from: o */
    Surface[] f159693o;

    /* JADX INFO: renamed from: l.rjh0$a */
    public class C19713a implements ImageReader.OnImageAvailableListener {
        public C19713a() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Image imageAcquireNextImage = imageReader.acquireNextImage();
            if (imageAcquireNextImage == null) {
                return;
            }
            TECameraFrame tECameraFrame = new TECameraFrame(imageAcquireNextImage.getWidth(), imageAcquireNextImage.getHeight(), System.currentTimeMillis() * 1000);
            sjh0 sjh0Var = new sjh0(imageAcquireNextImage.getPlanes());
            int iM80642D = rjh0.this.f75908d.m80642D();
            rjh0 rjh0Var = rjh0.this;
            tECameraFrame.m80489f(sjh0Var, iM80642D, rjh0Var.f75906b, rjh0Var.f75908d.m80665y());
            rjh0.this.m102177k(tECameraFrame);
            imageAcquireNextImage.close();
        }
    }

    public rjh0(cjh0.C16167a c16167a, AbstractC13324c abstractC13324c) {
        super(c16167a, abstractC13324c);
        this.f159690l = new float[16];
        SurfaceTexture surfaceTexture = c16167a.f81185d;
        this.f159689k = surfaceTexture;
        this.f159691m = c16167a.f81186e;
        int i = this.f75910f;
        this.f159692n = new ImageReader[i];
        Surface[] surfaceArr = new Surface[surfaceTexture != null ? i + 1 : i];
        this.f159693o = surfaceArr;
        if (surfaceTexture != null) {
            surfaceArr[0] = new Surface(this.f159689k);
        }
    }

    @Override // p149l.bjh0
    /* JADX INFO: renamed from: d */
    public Surface mo102170d() {
        Surface[] surfaceArr = this.f159693o;
        if (surfaceArr != null) {
            return surfaceArr[0];
        }
        return null;
    }

    @Override // p149l.bjh0
    /* JADX INFO: renamed from: e */
    public SurfaceTexture mo102171e() {
        return this.f159689k;
    }

    @Override // p149l.bjh0
    /* JADX INFO: renamed from: f */
    public Surface[] mo102172f() {
        return this.f159693o;
    }

    @Override // p149l.bjh0
    /* JADX INFO: renamed from: g */
    public int mo102173g() {
        return 8;
    }

    @Override // p149l.bjh0
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: h */
    public int mo102174h(@NonNull StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        int[] outputFormats = streamConfigurationMap.getOutputFormats();
        int iM80483g = TECameraFrame.m80483g(this.f75906b);
        int i = 0;
        for (int i2 : outputFormats) {
            if (i2 == iM80483g) {
                i = i2;
                break;
            }
        }
        if (i == 0) {
            this.f75906b = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_YUV420;
            i = 35;
        }
        return mo102175i(bjh0.m102167a(streamConfigurationMap.getOutputSizes(i)), tEFrameSizei);
    }

    @Override // p149l.bjh0
    /* JADX INFO: renamed from: i */
    public int mo102175i(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        if (list != null && list.size() > 0) {
            this.f75907c = C13333f.m80700b(list, this.f75907c);
        }
        SurfaceTexture surfaceTexture = this.f159689k;
        if (surfaceTexture != null) {
            TEFrameSizei tEFrameSizei2 = this.f75907c;
            surfaceTexture.setDefaultBufferSize(tEFrameSizei2.width, tEFrameSizei2.height);
        }
        for (int i = 0; i < this.f75910f; i++) {
            ImageReader[] imageReaderArr = this.f159692n;
            TEFrameSizei tEFrameSizei3 = this.f75907c;
            imageReaderArr[i] = ImageReader.newInstance(tEFrameSizei3.width, tEFrameSizei3.height, TECameraFrame.m80483g(this.f75906b), 1);
            this.f159692n[i].setOnImageAvailableListener(new C19713a(), this.f75908d.m80643E());
            SurfaceTexture surfaceTexture2 = this.f159689k;
            Surface[] surfaceArr = this.f159693o;
            if (surfaceTexture2 != null) {
                surfaceArr[i + 1] = this.f159692n[i].getSurface();
            } else {
                surfaceArr[i] = this.f159692n[i].getSurface();
            }
        }
        return 0;
    }

    @Override // p149l.bjh0
    /* JADX INFO: renamed from: m */
    public void mo102179m() {
        Surface[] surfaceArr;
        Surface surface;
        super.mo102179m();
        ImageReader[] imageReaderArr = this.f159692n;
        if (imageReaderArr != null) {
            for (ImageReader imageReader : imageReaderArr) {
                if (imageReader != null) {
                    imageReader.close();
                }
            }
            this.f159692n = null;
        }
        if (this.f159689k == null || (surfaceArr = this.f159693o) == null || (surface = surfaceArr[0]) == null) {
            return;
        }
        surface.release();
    }

    @Override // p149l.bjh0
    /* JADX INFO: renamed from: l */
    public void mo102178l() {
    }
}
