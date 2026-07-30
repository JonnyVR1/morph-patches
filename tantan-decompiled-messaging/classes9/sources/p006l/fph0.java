package p006l;

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
import l.bs5;
import l.e30;
import l.mkd0;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class fph0 {

    /* JADX INFO: renamed from: h */
    public static int f12838h;

    /* JADX INFO: renamed from: b */
    public ImageReader f12840b;

    /* JADX INFO: renamed from: c */
    public final HandlerThread f12841c;

    /* JADX INFO: renamed from: d */
    public final Handler f12842d;

    /* JADX INFO: renamed from: f */
    public InterfaceC0729b f12844f;

    /* JADX INFO: renamed from: g */
    public final vkh0 f12845g;

    /* JADX INFO: renamed from: a */
    public final String f12839a = getClass().getSimpleName();

    /* JADX INFO: renamed from: e */
    public bs5 f12843e = new bs5();

    /* JADX INFO: renamed from: l.fph0$a */
    public class C0728a implements ImageReader.OnImageAvailableListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vkh0 f12846a;

        public C0728a(vkh0 vkh0Var) {
            this.f12846a = vkh0Var;
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m15445c(String str) {
            String unused = fph0.this.f12839a;
            Thread.currentThread().getName();
            if (fph0.this.f12844f != null) {
                fph0.this.f12844f.onSuccess(str);
            }
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m15446d(Throwable th) {
            String unused = fph0.this.f12839a;
            if (fph0.this.f12844f != null) {
                fph0.this.f12844f.onError(th);
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
            Iterator<w9j<Bitmap, Bitmap>> it = this.f12846a.m25841n().iterator();
            while (it.hasNext()) {
                bitmapDecodeByteArray = (Bitmap) it.next().call(bitmapDecodeByteArray);
            }
            fph0.this.f12843e.a(yid0.m28249c(bitmapDecodeByteArray, Bitmap.CompressFormat.JPEG, null).subscribe(mkd0.H(new e30() { // from class: l.dph0
                public final void call(Object obj) {
                    this.f10513a.m15445c((String) obj);
                }
            }, new e30() { // from class: l.eph0
                public final void call(Object obj) {
                    this.f11389a.m15446d((Throwable) obj);
                }
            })));
        }
    }

    /* JADX INFO: renamed from: l.fph0$b */
    public interface InterfaceC0729b {
        void onError(Throwable th);

        void onSuccess(String str);
    }

    public fph0(vkh0 vkh0Var, int i, int i2, int i3, int i4) {
        this.f12840b = ImageReader.newInstance(i, i2, i3, i4);
        this.f12845g = vkh0Var;
        StringBuilder sb = new StringBuilder("TTImageReader");
        int i5 = f12838h;
        f12838h = i5 + 1;
        sb.append(i5);
        HandlerThread handlerThread = new HandlerThread(sb.toString());
        this.f12841c = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f12842d = handler;
        this.f12840b.setOnImageAvailableListener(new C0728a(vkh0Var), handler);
    }

    /* JADX INFO: renamed from: d */
    public void m15439d() {
        this.f12844f = null;
        this.f12843e.c();
        ImageReader imageReader = this.f12840b;
        if (imageReader != null) {
            imageReader.close();
        }
        this.f12841c.quitSafely();
        this.f12840b = null;
    }

    /* JADX INFO: renamed from: e */
    public Surface m15440e() {
        return this.f12840b.getSurface();
    }

    /* JADX INFO: renamed from: f */
    public void m15441f(InterfaceC0729b interfaceC0729b) {
        this.f12844f = interfaceC0729b;
    }

    /* JADX INFO: renamed from: g */
    public void m15442g(CameraDevice cameraDevice, CameraCaptureSession cameraCaptureSession) {
        if (cameraDevice == null || cameraCaptureSession == null) {
            InterfaceC0729b interfaceC0729b = this.f12844f;
            if (interfaceC0729b != null) {
                interfaceC0729b.onError(new RuntimeException("CameraSession not created"));
                return;
            }
            return;
        }
        try {
            CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(2);
            builderCreateCaptureRequest.addTarget(this.f12840b.getSurface());
            cameraCaptureSession.capture(builderCreateCaptureRequest.build(), null, this.f12842d);
        } catch (CameraAccessException e) {
            CrashHelper.c(e);
        }
    }
}
