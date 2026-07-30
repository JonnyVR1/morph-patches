package p153l;

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
public class mxh0 {

    /* JADX INFO: renamed from: h */
    public static int f139241h;

    /* JADX INFO: renamed from: b */
    public ImageReader f139243b;

    /* JADX INFO: renamed from: c */
    public final HandlerThread f139244c;

    /* JADX INFO: renamed from: d */
    public final Handler f139245d;

    /* JADX INFO: renamed from: f */
    public InterfaceC18741b f139247f;

    /* JADX INFO: renamed from: g */
    public final cth0 f139248g;

    /* JADX INFO: renamed from: a */
    public final String f139242a = getClass().getSimpleName();

    /* JADX INFO: renamed from: e */
    public ft5 f139246e = new ft5();

    /* JADX INFO: renamed from: l.mxh0$a */
    public class C18740a implements ImageReader.OnImageAvailableListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cth0 f139249a;

        public C18740a(cth0 cth0Var) {
            this.f139249a = cth0Var;
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m160678c(String str) {
            String unused = mxh0.this.f139242a;
            Thread.currentThread().getName();
            if (mxh0.this.f139247f != null) {
                mxh0.this.f139247f.onSuccess(str);
            }
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m160679d(Throwable th) {
            String unused = mxh0.this.f139242a;
            if (mxh0.this.f139247f != null) {
                mxh0.this.f139247f.onError(th);
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
            Iterator<qcj<Bitmap, Bitmap>> it = this.f139249a.m112478n().iterator();
            while (it.hasNext()) {
                bitmapDecodeByteArray = it.next().call(bitmapDecodeByteArray);
            }
            mxh0.this.f139246e.m127297a(brd0.m106125c(bitmapDecodeByteArray, Bitmap.CompressFormat.JPEG, null).subscribe(psd0.m173597H(new y20() { // from class: l.kxh0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f129207a.m160678c((String) obj);
                }
            }, new y20() { // from class: l.lxh0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f133958a.m160679d((Throwable) obj);
                }
            })));
        }
    }

    /* JADX INFO: renamed from: l.mxh0$b */
    public interface InterfaceC18741b {
        void onError(Throwable th);

        void onSuccess(String str);
    }

    public mxh0(cth0 cth0Var, int i, int i2, int i3, int i4) {
        this.f139243b = ImageReader.newInstance(i, i2, i3, i4);
        this.f139248g = cth0Var;
        StringBuilder sb = new StringBuilder("TTImageReader");
        int i5 = f139241h;
        f139241h = i5 + 1;
        sb.append(i5);
        HandlerThread handlerThread = new HandlerThread(sb.toString());
        this.f139244c = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f139245d = handler;
        this.f139243b.setOnImageAvailableListener(new C18740a(cth0Var), handler);
    }

    /* JADX INFO: renamed from: d */
    public void m160672d() {
        this.f139247f = null;
        this.f139246e.m127299c();
        ImageReader imageReader = this.f139243b;
        if (imageReader != null) {
            imageReader.close();
        }
        this.f139244c.quitSafely();
        this.f139243b = null;
    }

    /* JADX INFO: renamed from: e */
    public Surface m160673e() {
        return this.f139243b.getSurface();
    }

    /* JADX INFO: renamed from: f */
    public void m160674f(InterfaceC18741b interfaceC18741b) {
        this.f139247f = interfaceC18741b;
    }

    /* JADX INFO: renamed from: g */
    public void m160675g(CameraDevice cameraDevice, CameraCaptureSession cameraCaptureSession) {
        if (cameraDevice == null || cameraCaptureSession == null) {
            InterfaceC18741b interfaceC18741b = this.f139247f;
            if (interfaceC18741b != null) {
                interfaceC18741b.onError(new RuntimeException("CameraSession not created"));
                return;
            }
            return;
        }
        try {
            CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(2);
            builderCreateCaptureRequest.addTarget(this.f139243b.getSurface());
            cameraCaptureSession.capture(builderCreateCaptureRequest.build(), null, this.f139245d);
        } catch (CameraAccessException e) {
            CrashHelper.m82479c(e);
        }
    }
}
