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
public class qjh0 extends bjh0 {

    /* JADX INFO: renamed from: k */
    ImageReader f154926k;

    /* JADX INFO: renamed from: l.qjh0$a */
    public class C19522a implements ImageReader.OnImageAvailableListener {
        public C19522a() {
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
                int iM80642D = qjh0.this.f75908d.m80642D();
                qjh0 qjh0Var = qjh0.this;
                tECameraFrame.m80489f(sjh0Var, iM80642D, qjh0Var.f75906b, qjh0Var.f75908d.m80665y());
                qjh0.this.m102177k(tECameraFrame);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                imageAcquireLatestImage.close();
            }
        }
    }

    public qjh0(cjh0.C16167a c16167a, AbstractC13324c abstractC13324c) {
        super(c16167a, abstractC13324c);
    }

    @Override // p149l.bjh0
    /* JADX INFO: renamed from: d */
    public Surface mo102170d() {
        ImageReader imageReader = this.f154926k;
        if (imageReader != null) {
            return imageReader.getSurface();
        }
        return null;
    }

    @Override // p149l.bjh0
    /* JADX INFO: renamed from: e */
    public SurfaceTexture mo102171e() {
        return null;
    }

    @Override // p149l.bjh0
    /* JADX INFO: renamed from: g */
    public int mo102173g() {
        return 2;
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
        ImageReader imageReader = this.f154926k;
        if (imageReader != null) {
            imageReader.close();
        }
        TEFrameSizei tEFrameSizei2 = this.f75907c;
        ImageReader imageReaderNewInstance = ImageReader.newInstance(tEFrameSizei2.width, tEFrameSizei2.height, TECameraFrame.m80483g(this.f75906b), 1);
        this.f154926k = imageReaderNewInstance;
        imageReaderNewInstance.setOnImageAvailableListener(new C19522a(), this.f75908d.m80643E());
        return 0;
    }

    @Override // p149l.bjh0
    /* JADX INFO: renamed from: m */
    public void mo102179m() {
        super.mo102179m();
        ImageReader imageReader = this.f154926k;
        if (imageReader != null) {
            imageReader.close();
            this.f154926k = null;
        }
    }

    @Override // p149l.bjh0
    /* JADX INFO: renamed from: l */
    public void mo102178l() {
    }
}
