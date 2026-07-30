package p009l;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.p008ss.android.ttvecamera.AbstractC0726c;
import com.p008ss.android.ttvecamera.C0735f;
import com.p008ss.android.ttvecamera.TECameraFrame;
import com.p008ss.android.ttvecamera.TEFrameSizei;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@RequiresApi(api = 19)
public class rjh0 extends bjh0 {

    /* JADX INFO: renamed from: k */
    SurfaceTexture f19871k;

    /* JADX INFO: renamed from: l */
    float[] f19872l;

    /* JADX INFO: renamed from: m */
    int f19873m;

    /* JADX INFO: renamed from: n */
    ImageReader[] f19874n;

    /* JADX INFO: renamed from: o */
    Surface[] f19875o;

    /* JADX INFO: renamed from: l.rjh0$a */
    public class C1176a implements ImageReader.OnImageAvailableListener {
        public C1176a() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Image imageAcquireNextImage = imageReader.acquireNextImage();
            if (imageAcquireNextImage == null) {
                return;
            }
            TECameraFrame tECameraFrame = new TECameraFrame(imageAcquireNextImage.getWidth(), imageAcquireNextImage.getHeight(), System.currentTimeMillis() * 1000);
            sjh0 sjh0Var = new sjh0(imageAcquireNextImage.getPlanes());
            int iM10993D = rjh0.this.f10131d.m10993D();
            rjh0 rjh0Var = rjh0.this;
            tECameraFrame.m10840f(sjh0Var, iM10993D, rjh0Var.f10129b, rjh0Var.f10131d.m11016y());
            rjh0.this.m12046k(tECameraFrame);
            imageAcquireNextImage.close();
        }
    }

    public rjh0(cjh0.C0813a c0813a, AbstractC0726c abstractC0726c) {
        super(c0813a, abstractC0726c);
        this.f19872l = new float[16];
        SurfaceTexture surfaceTexture = c0813a.f10629d;
        this.f19871k = surfaceTexture;
        this.f19873m = c0813a.f10630e;
        int i = this.f10133f;
        this.f19874n = new ImageReader[i];
        Surface[] surfaceArr = new Surface[surfaceTexture != null ? i + 1 : i];
        this.f19875o = surfaceArr;
        if (surfaceTexture != null) {
            surfaceArr[0] = new Surface(this.f19871k);
        }
    }

    @Override // p009l.bjh0
    /* JADX INFO: renamed from: d */
    public Surface mo12039d() {
        Surface[] surfaceArr = this.f19875o;
        if (surfaceArr != null) {
            return surfaceArr[0];
        }
        return null;
    }

    @Override // p009l.bjh0
    /* JADX INFO: renamed from: e */
    public SurfaceTexture mo12040e() {
        return this.f19871k;
    }

    @Override // p009l.bjh0
    /* JADX INFO: renamed from: f */
    public Surface[] mo12041f() {
        return this.f19875o;
    }

    @Override // p009l.bjh0
    /* JADX INFO: renamed from: g */
    public int mo12042g() {
        return 8;
    }

    @Override // p009l.bjh0
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: h */
    public int mo12043h(@NonNull StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        int[] outputFormats = streamConfigurationMap.getOutputFormats();
        int iM10834g = TECameraFrame.m10834g(this.f10129b);
        int i = 0;
        for (int i2 : outputFormats) {
            if (i2 == iM10834g) {
                i = i2;
                break;
            }
        }
        if (i == 0) {
            this.f10129b = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_YUV420;
            i = 35;
        }
        return mo12044i(bjh0.m12036a(streamConfigurationMap.getOutputSizes(i)), tEFrameSizei);
    }

    @Override // p009l.bjh0
    /* JADX INFO: renamed from: i */
    public int mo12044i(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        if (list != null && list.size() > 0) {
            this.f10130c = C0735f.m11051b(list, this.f10130c);
        }
        SurfaceTexture surfaceTexture = this.f19871k;
        if (surfaceTexture != null) {
            TEFrameSizei tEFrameSizei2 = this.f10130c;
            surfaceTexture.setDefaultBufferSize(tEFrameSizei2.width, tEFrameSizei2.height);
        }
        for (int i = 0; i < this.f10133f; i++) {
            ImageReader[] imageReaderArr = this.f19874n;
            TEFrameSizei tEFrameSizei3 = this.f10130c;
            imageReaderArr[i] = ImageReader.newInstance(tEFrameSizei3.width, tEFrameSizei3.height, TECameraFrame.m10834g(this.f10129b), 1);
            this.f19874n[i].setOnImageAvailableListener(new C1176a(), this.f10131d.m10994E());
            SurfaceTexture surfaceTexture2 = this.f19871k;
            Surface[] surfaceArr = this.f19875o;
            if (surfaceTexture2 != null) {
                surfaceArr[i + 1] = this.f19874n[i].getSurface();
            } else {
                surfaceArr[i] = this.f19874n[i].getSurface();
            }
        }
        return 0;
    }

    @Override // p009l.bjh0
    /* JADX INFO: renamed from: m */
    public void mo12048m() {
        Surface[] surfaceArr;
        Surface surface;
        super.mo12048m();
        ImageReader[] imageReaderArr = this.f19874n;
        if (imageReaderArr != null) {
            for (ImageReader imageReader : imageReaderArr) {
                if (imageReader != null) {
                    imageReader.close();
                }
            }
            this.f19874n = null;
        }
        if (this.f19871k == null || (surfaceArr = this.f19875o) == null || (surface = surfaceArr[0]) == null) {
            return;
        }
        surface.release();
    }

    @Override // p009l.bjh0
    /* JADX INFO: renamed from: l */
    public void mo12047l() {
    }
}
