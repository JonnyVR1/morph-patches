package p149l;

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
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class yid0 {

    /* JADX INFO: renamed from: l.yid0$a */
    public class C21407a implements C22306c.a<CameraDevice> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CameraManager f198462a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f198463b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Handler f198464c;

        /* JADX INFO: renamed from: l.yid0$a$a */
        public class a extends CameraDevice.StateCallback {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ z3g0 f198465a;

            public a(z3g0 z3g0Var) {
                this.f198465a = z3g0Var;
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onClosed(@NonNull CameraDevice cameraDevice) {
                this.f198465a.onCompleted();
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onDisconnected(@NonNull CameraDevice cameraDevice) {
                this.f198465a.onCompleted();
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onError(@NonNull CameraDevice cameraDevice, int i) {
                this.f198465a.onError(new RuntimeException("Error occurs while open camera" + C21407a.this.f198463b + " code = " + i));
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onOpened(@NonNull CameraDevice cameraDevice) {
                this.f198465a.onNext(cameraDevice);
            }
        }

        public C21407a(CameraManager cameraManager, String str, Handler handler) {
            this.f198462a = cameraManager;
            this.f198463b = str;
            this.f198464c = handler;
        }

        @Override // p149l.e30
        @SuppressLint({"MissingPermission"})
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super CameraDevice> z3g0Var) {
            try {
                this.f198462a.openCamera(this.f198463b, new a(z3g0Var), this.f198464c);
            } catch (CameraAccessException e) {
                z3g0Var.onError(e);
            }
        }
    }

    /* JADX INFO: renamed from: l.yid0$b */
    public class C21408b implements C22306c.a<CameraCaptureSession> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CameraDevice f198467a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f198468b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Handler f198469c;

        /* JADX INFO: renamed from: l.yid0$b$a */
        public class a extends CameraCaptureSession.StateCallback {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ z3g0 f198470a;

            public a(z3g0 z3g0Var) {
                this.f198470a = z3g0Var;
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
                this.f198470a.onError(new RuntimeException("session create failed!"));
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
                this.f198470a.onNext(cameraCaptureSession);
            }
        }

        public C21408b(CameraDevice cameraDevice, List list, Handler handler) {
            this.f198467a = cameraDevice;
            this.f198468b = list;
            this.f198469c = handler;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super CameraCaptureSession> z3g0Var) {
            try {
                this.f198467a.createCaptureSession(this.f198468b, new a(z3g0Var), this.f198469c);
            } catch (CameraAccessException e) {
                z3g0Var.onError(e);
            }
        }
    }

    /* JADX INFO: renamed from: l.yid0$c */
    public class C21409c implements C22306c.a<String> {
        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super String> z3g0Var) {
            z3g0Var.onCompleted();
        }
    }

    /* JADX INFO: renamed from: l.yid0$d */
    public class C21410d implements C22306c.a<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f198472a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Bitmap.CompressFormat f198473b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Bitmap f198474c;

        public C21410d(String str, Bitmap.CompressFormat compressFormat, Bitmap bitmap) {
            this.f198472a = str;
            this.f198473b = compressFormat;
            this.f198474c = bitmap;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super String> z3g0Var) throws Throwable {
            File file = new File(qlh0.m175485d(this.f198472a, this.f198473b));
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        this.f198474c.compress(this.f198473b, 100, fileOutputStream2);
                        fileOutputStream2.flush();
                        z3g0Var.onNext(file.getAbsolutePath());
                        t95.m187604b(fileOutputStream2);
                    } catch (Exception e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        z3g0Var.onError(e);
                        t95.m187604b(fileOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        t95.m187604b(fileOutputStream);
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
    public static C22306c<CameraCaptureSession> m214888a(CameraDevice cameraDevice, List<Surface> list, Handler handler) {
        return C22306c.create(new C21408b(cameraDevice, list, handler));
    }

    /* JADX INFO: renamed from: b */
    public static C22306c<CameraDevice> m214889b(CameraManager cameraManager, String str, Handler handler) {
        return C22306c.create(new C21407a(cameraManager, str, handler));
    }

    /* JADX INFO: renamed from: c */
    public static C22306c<String> m214890c(Bitmap bitmap, Bitmap.CompressFormat compressFormat, @Nullable String str) {
        return bitmap == null ? C22306c.create(new C21409c()) : C22306c.create(new C21410d(str, compressFormat, bitmap));
    }
}
