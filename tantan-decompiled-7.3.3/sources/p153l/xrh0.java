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
public class xrh0 extends irh0 {

    /* JADX INFO: renamed from: k */
    ImageReader f195910k;

    /* JADX INFO: renamed from: l.xrh0$a */
    public class C21430a implements ImageReader.OnImageAvailableListener {
        public C21430a() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Image imageAcquireLatestImage = imageReader.acquireLatestImage();
            try {
                if (imageAcquireLatestImage == null) {
                    return;
                }
                TECameraFrame tECameraFrame = new TECameraFrame(imageAcquireLatestImage.getWidth(), imageAcquireLatestImage.getHeight(), System.currentTimeMillis() * 1000);
                zrh0 zrh0Var = new zrh0(imageAcquireLatestImage.getPlanes());
                int iM81825D = xrh0.this.f116564d.m81825D();
                xrh0 xrh0Var = xrh0.this;
                tECameraFrame.m81672f(zrh0Var, iM81825D, xrh0Var.f116562b, xrh0Var.f116564d.m81848y());
                xrh0.this.m141825k(tECameraFrame);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                imageAcquireLatestImage.close();
            }
        }
    }

    public xrh0(jrh0.C18019a c18019a, AbstractC13487c abstractC13487c) {
        super(c18019a, abstractC13487c);
    }

    @Override // p153l.irh0
    /* JADX INFO: renamed from: d */
    public Surface mo99911d() {
        ImageReader imageReader = this.f195910k;
        if (imageReader != null) {
            return imageReader.getSurface();
        }
        return null;
    }

    @Override // p153l.irh0
    /* JADX INFO: renamed from: e */
    public SurfaceTexture mo99912e() {
        return null;
    }

    @Override // p153l.irh0
    /* JADX INFO: renamed from: g */
    public int mo99913g() {
        return 2;
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
        ImageReader imageReader = this.f195910k;
        if (imageReader != null) {
            imageReader.close();
        }
        TEFrameSizei tEFrameSizei2 = this.f116563c;
        ImageReader imageReaderNewInstance = ImageReader.newInstance(tEFrameSizei2.width, tEFrameSizei2.height, TECameraFrame.m81666g(this.f116562b), 1);
        this.f195910k = imageReaderNewInstance;
        imageReaderNewInstance.setOnImageAvailableListener(new C21430a(), this.f116564d.m81826E());
        return 0;
    }

    @Override // p153l.irh0
    /* JADX INFO: renamed from: m */
    public void mo99917m() {
        super.mo99917m();
        ImageReader imageReader = this.f195910k;
        if (imageReader != null) {
            imageReader.close();
            this.f195910k = null;
        }
    }

    @Override // p153l.irh0
    /* JADX INFO: renamed from: l */
    public void mo99916l() {
    }
}
