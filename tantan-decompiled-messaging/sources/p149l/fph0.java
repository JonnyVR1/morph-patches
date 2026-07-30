package p149l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.tantanapp.common.utils.CrashHelper;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class fph0 {

    /* JADX INFO: renamed from: h */
    public static int f98698h;

    /* JADX INFO: renamed from: b */
    public ImageReader f98700b;

    /* JADX INFO: renamed from: c */
    public final HandlerThread f98701c;

    /* JADX INFO: renamed from: d */
    public final Handler f98702d;

    /* JADX INFO: renamed from: f */
    public InterfaceC16902b f98704f;

    /* JADX INFO: renamed from: g */
    public final vkh0 f98705g;

    /* JADX INFO: renamed from: a */
    public final String f98699a = getClass().getSimpleName();

    /* JADX INFO: renamed from: e */
    public bs5 f98703e = new bs5();

    /* JADX INFO: renamed from: l.fph0$a */
    public class C16901a implements ImageReader.OnImageAvailableListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vkh0 f98706a;

        public C16901a(vkh0 vkh0Var) {
            this.f98706a = vkh0Var;
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m122600c(String str) {
            String unused = fph0.this.f98699a;
            Thread.currentThread().getName();
            if (fph0.this.f98704f != null) {
                fph0.this.f98704f.onSuccess(str);
            }
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m122601d(Throwable th) {
            String unused = fph0.this.f98699a;
            if (fph0.this.f98704f != null) {
                fph0.this.f98704f.onError(th);
            }
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Image imageAcquireLatestImage = imageReader.acquireLatestImage();
            if (imageAcquireLatestImage == null) {
                return;
            }
            ByteBuffer buffer = imageAcquireLatestImage.getPlanes()[0].getBuffer();
            int iRemaining = buffer.remaining();
            byte[] bArr = new byte[iRemaining];
            buffer.get(bArr);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iRemaining);
            Iterator<w9j<Bitmap, Bitmap>> it = this.f98706a.m198729n().iterator();
            while (it.hasNext()) {
                bitmapDecodeByteArray = it.next().call(bitmapDecodeByteArray);
            }
            fph0.this.f98703e.m103655a(yid0.m214890c(bitmapDecodeByteArray, Bitmap.CompressFormat.JPEG, null).subscribe(mkd0.m154956H(new e30() { // from class: l.dph0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f87279a.m122600c((String) obj);
                }
            }, new e30() { // from class: l.eph0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f92655a.m122601d((Throwable) obj);
                }
            })));
        }
    }

    /* JADX INFO: renamed from: l.fph0$b */
    public interface InterfaceC16902b {
        void onError(Throwable th);

        void onSuccess(String str);
    }

    public fph0(vkh0 vkh0Var, int i, int i2, int i3, int i4) {
        this.f98700b = ImageReader.newInstance(i, i2, i3, i4);
        this.f98705g = vkh0Var;
        StringBuilder sb = new StringBuilder("TTImageReader");
        int i5 = f98698h;
        f98698h = i5 + 1;
        sb.append(i5);
        HandlerThread handlerThread = new HandlerThread(sb.toString());
        this.f98701c = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f98702d = handler;
        this.f98700b.setOnImageAvailableListener(new C16901a(vkh0Var), handler);
    }

    /* JADX INFO: renamed from: d */
    public void m122594d() {
        this.f98704f = null;
        this.f98703e.m103657c();
        ImageReader imageReader = this.f98700b;
        if (imageReader != null) {
            imageReader.close();
        }
        this.f98701c.quitSafely();
        this.f98700b = null;
    }

    /* JADX INFO: renamed from: e */
    public Surface m122595e() {
        return this.f98700b.getSurface();
    }

    /* JADX INFO: renamed from: f */
    public void m122596f(InterfaceC16902b interfaceC16902b) {
        this.f98704f = interfaceC16902b;
    }

    /* JADX INFO: renamed from: g */
    public void m122597g(CameraDevice cameraDevice, CameraCaptureSession cameraCaptureSession) {
        if (cameraDevice == null || cameraCaptureSession == null) {
            InterfaceC16902b interfaceC16902b = this.f98704f;
            if (interfaceC16902b != null) {
                interfaceC16902b.onError(new RuntimeException("CameraSession not created"));
                return;
            }
            return;
        }
        try {
            CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(2);
            builderCreateCaptureRequest.addTarget(this.f98700b.getSurface());
            cameraCaptureSession.capture(builderCreateCaptureRequest.build(), null, this.f98702d);
        } catch (CameraAccessException e) {
            CrashHelper.m81296c(e);
        }
    }
}
