package p153l;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class brd0 {

    /* JADX INFO: renamed from: l.brd0$a */
    public class C16093a implements C22421c.a<CameraDevice> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CameraManager f78007a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f78008b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Handler f78009c;

        /* JADX INFO: renamed from: l.brd0$a$a */
        public class a extends CameraDevice.StateCallback {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ gcg0 f78010a;

            public a(gcg0 gcg0Var) {
                this.f78010a = gcg0Var;
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onClosed(@NonNull CameraDevice cameraDevice) {
                this.f78010a.onCompleted();
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onDisconnected(@NonNull CameraDevice cameraDevice) {
                this.f78010a.onCompleted();
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onError(@NonNull CameraDevice cameraDevice, int i) {
                this.f78010a.onError(new RuntimeException("Error occurs while open camera" + C16093a.this.f78008b + " code = " + i));
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onOpened(@NonNull CameraDevice cameraDevice) {
                this.f78010a.onNext(cameraDevice);
            }
        }

        public C16093a(CameraManager cameraManager, String str, Handler handler) {
            this.f78007a = cameraManager;
            this.f78008b = str;
            this.f78009c = handler;
        }

        @Override // p153l.y20
        @SuppressLint({"MissingPermission"})
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(gcg0<? super CameraDevice> gcg0Var) {
            try {
                this.f78007a.openCamera(this.f78008b, new a(gcg0Var), this.f78009c);
            } catch (CameraAccessException e) {
                gcg0Var.onError(e);
            }
        }
    }

    /* JADX INFO: renamed from: l.brd0$b */
    public class C16094b implements C22421c.a<CameraCaptureSession> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CameraDevice f78012a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f78013b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Handler f78014c;

        /* JADX INFO: renamed from: l.brd0$b$a */
        public class a extends CameraCaptureSession.StateCallback {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ gcg0 f78015a;

            public a(gcg0 gcg0Var) {
                this.f78015a = gcg0Var;
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
                this.f78015a.onError(new RuntimeException("session create failed!"));
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
                this.f78015a.onNext(cameraCaptureSession);
            }
        }

        public C16094b(CameraDevice cameraDevice, List list, Handler handler) {
            this.f78012a = cameraDevice;
            this.f78013b = list;
            this.f78014c = handler;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(gcg0<? super CameraCaptureSession> gcg0Var) {
            try {
                this.f78012a.createCaptureSession(this.f78013b, new a(gcg0Var), this.f78014c);
            } catch (CameraAccessException e) {
                gcg0Var.onError(e);
            }
        }
    }

    /* JADX INFO: renamed from: l.brd0$c */
    public class C16095c implements C22421c.a<String> {
        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(gcg0<? super String> gcg0Var) {
            gcg0Var.onCompleted();
        }
    }

    /* JADX INFO: renamed from: l.brd0$d */
    public class C16096d implements C22421c.a<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f78017a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Bitmap.CompressFormat f78018b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Bitmap f78019c;

        public C16096d(String str, Bitmap.CompressFormat compressFormat, Bitmap bitmap) {
            this.f78017a = str;
            this.f78018b = compressFormat;
            this.f78019c = bitmap;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(gcg0<? super String> gcg0Var) throws Throwable {
            File file = new File(xth0.m213084d(this.f78017a, this.f78018b));
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        this.f78019c.compress(this.f78018b, 100, fileOutputStream2);
                        fileOutputStream2.flush();
                        gcg0Var.onNext(file.getAbsolutePath());
                        ua5.m195158b(fileOutputStream2);
                    } catch (Exception e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        gcg0Var.onError(e);
                        ua5.m195158b(fileOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        ua5.m195158b(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C22421c<CameraCaptureSession> m106123a(CameraDevice cameraDevice, List<Surface> list, Handler handler) {
        return C22421c.create(new C16094b(cameraDevice, list, handler));
    }

    /* JADX INFO: renamed from: b */
    public static C22421c<CameraDevice> m106124b(CameraManager cameraManager, String str, Handler handler) {
        return C22421c.create(new C16093a(cameraManager, str, handler));
    }

    /* JADX INFO: renamed from: c */
    public static C22421c<String> m106125c(Bitmap bitmap, Bitmap.CompressFormat compressFormat, @Nullable String str) {
        return bitmap == null ? C22421c.create(new C16095c()) : C22421c.create(new C16096d(str, compressFormat, bitmap));
    }
}
