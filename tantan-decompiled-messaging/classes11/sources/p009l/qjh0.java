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
public class qjh0 extends bjh0 {

    /* JADX INFO: renamed from: k */
    ImageReader f19361k;

    /* JADX INFO: renamed from: l.qjh0$a */
    public class C1149a implements ImageReader.OnImageAvailableListener {
        public C1149a() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Image imageAcquireLatestImage = imageReader.acquireLatestImage();
            try {
                if (imageAcquireLatestImage == null) {
                    return;
                }
                TECameraFrame tECameraFrame = new TECameraFrame(imageAcquireLatestImage.getWidth(), imageAcquireLatestImage.getHeight(), System.currentTimeMillis() * 1000);
                sjh0 sjh0Var = new sjh0(imageAcquireLatestImage.getPlanes());
                int iM10993D = qjh0.this.f10131d.m10993D();
                qjh0 qjh0Var = qjh0.this;
                tECameraFrame.m10840f(sjh0Var, iM10993D, qjh0Var.f10129b, qjh0Var.f10131d.m11016y());
                qjh0.this.m12046k(tECameraFrame);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                imageAcquireLatestImage.close();
            }
        }
    }

    public qjh0(cjh0.C0813a c0813a, AbstractC0726c abstractC0726c) {
        super(c0813a, abstractC0726c);
    }

    @Override // p009l.bjh0
    /* JADX INFO: renamed from: d */
    public Surface mo12039d() {
        ImageReader imageReader = this.f19361k;
        if (imageReader != null) {
            return imageReader.getSurface();
        }
        return null;
    }

    @Override // p009l.bjh0
    /* JADX INFO: renamed from: e */
    public SurfaceTexture mo12040e() {
        return null;
    }

    @Override // p009l.bjh0
    /* JADX INFO: renamed from: g */
    public int mo12042g() {
        return 2;
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
        ImageReader imageReader = this.f19361k;
        if (imageReader != null) {
            imageReader.close();
        }
        TEFrameSizei tEFrameSizei2 = this.f10130c;
        ImageReader imageReaderNewInstance = ImageReader.newInstance(tEFrameSizei2.width, tEFrameSizei2.height, TECameraFrame.m10834g(this.f10129b), 1);
        this.f19361k = imageReaderNewInstance;
        imageReaderNewInstance.setOnImageAvailableListener(new C1149a(), this.f10131d.m10994E());
        return 0;
    }

    @Override // p009l.bjh0
    /* JADX INFO: renamed from: m */
    public void mo12048m() {
        super.mo12048m();
        ImageReader imageReader = this.f19361k;
        if (imageReader != null) {
            imageReader.close();
            this.f19361k = null;
        }
    }

    @Override // p009l.bjh0
    /* JADX INFO: renamed from: l */
    public void mo12047l() {
    }
}
