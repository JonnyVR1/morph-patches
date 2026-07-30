package p006l;

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
import l.t95;
import l.z3g0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class yid0 {

    /* JADX INFO: renamed from: l.yid0$a */
    public class C1482a implements c.a<CameraDevice> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CameraManager f28221a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f28222b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Handler f28223c;

        /* JADX INFO: renamed from: l.yid0$a$a */
        public class a extends CameraDevice.StateCallback {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ z3g0 f28224a;

            public a(z3g0 z3g0Var) {
                this.f28224a = z3g0Var;
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onClosed(@NonNull CameraDevice cameraDevice) {
                this.f28224a.onCompleted();
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onDisconnected(@NonNull CameraDevice cameraDevice) {
                this.f28224a.onCompleted();
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onError(@NonNull CameraDevice cameraDevice, int i) {
                this.f28224a.onError(new RuntimeException("Error occurs while open camera" + C1482a.this.f28222b + " code = " + i));
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onOpened(@NonNull CameraDevice cameraDevice) {
                this.f28224a.onNext(cameraDevice);
            }
        }

        public C1482a(CameraManager cameraManager, String str, Handler handler) {
            this.f28221a = cameraManager;
            this.f28222b = str;
            this.f28223c = handler;
        }

        @SuppressLint({"MissingPermission"})
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super CameraDevice> z3g0Var) {
            try {
                this.f28221a.openCamera(this.f28222b, new a(z3g0Var), this.f28223c);
            } catch (CameraAccessException e) {
                z3g0Var.onError(e);
            }
        }
    }

    /* JADX INFO: renamed from: l.yid0$b */
    public class C1483b implements c.a<CameraCaptureSession> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CameraDevice f28226a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f28227b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Handler f28228c;

        /* JADX INFO: renamed from: l.yid0$b$a */
        public class a extends CameraCaptureSession.StateCallback {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ z3g0 f28229a;

            public a(z3g0 z3g0Var) {
                this.f28229a = z3g0Var;
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
                this.f28229a.onError(new RuntimeException("session create failed!"));
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
                this.f28229a.onNext(cameraCaptureSession);
            }
        }

        public C1483b(CameraDevice cameraDevice, List list, Handler handler) {
            this.f28226a = cameraDevice;
            this.f28227b = list;
            this.f28228c = handler;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super CameraCaptureSession> z3g0Var) {
            try {
                this.f28226a.createCaptureSession(this.f28227b, new a(z3g0Var), this.f28228c);
            } catch (CameraAccessException e) {
                z3g0Var.onError(e);
            }
        }
    }

    /* JADX INFO: renamed from: l.yid0$c */
    public class C1484c implements c.a<String> {
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super String> z3g0Var) {
            z3g0Var.onCompleted();
        }
    }

    /* JADX INFO: renamed from: l.yid0$d */
    public class C1485d implements c.a<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f28231a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Bitmap.CompressFormat f28232b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Bitmap f28233c;

        public C1485d(String str, Bitmap.CompressFormat compressFormat, Bitmap bitmap) {
            this.f28231a = str;
            this.f28232b = compressFormat;
            this.f28233c = bitmap;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super String> z3g0Var) throws Throwable {
            File file = new File(qlh0.m22288d(this.f28231a, this.f28232b));
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        this.f28233c.compress(this.f28232b, 100, fileOutputStream2);
                        fileOutputStream2.flush();
                        z3g0Var.onNext(file.getAbsolutePath());
                        t95.b(fileOutputStream2);
                    } catch (Exception e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        z3g0Var.onError(e);
                        t95.b(fileOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        t95.b(fileOutputStream);
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
    public static c<CameraCaptureSession> m28247a(CameraDevice cameraDevice, List<Surface> list, Handler handler) {
        return c.create(new C1483b(cameraDevice, list, handler));
    }

    /* JADX INFO: renamed from: b */
    public static c<CameraDevice> m28248b(CameraManager cameraManager, String str, Handler handler) {
        return c.create(new C1482a(cameraManager, str, handler));
    }

    /* JADX INFO: renamed from: c */
    public static c<String> m28249c(Bitmap bitmap, Bitmap.CompressFormat compressFormat, @Nullable String str) {
        return bitmap == null ? c.create(new C1484c()) : c.create(new C1485d(str, compressFormat, bitmap));
    }
}
