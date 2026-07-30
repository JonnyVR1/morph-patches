package p153l;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public interface p6m {

    /* JADX INFO: renamed from: a */
    public static final MeteringRectangle[] f150864a = {new MeteringRectangle(0, 0, 0, 0, 0)};

    /* JADX INFO: renamed from: l.p6m$a */
    public interface InterfaceC19309a {
        /* JADX INFO: renamed from: a */
        int mo81946a();

        /* JADX INFO: renamed from: b */
        void mo81948b(CameraCaptureSession cameraCaptureSession, CaptureRequest.Builder builder);

        /* JADX INFO: renamed from: d */
        int mo81950d();
    }

    /* JADX INFO: renamed from: a */
    void mo141880a(@NonNull CaptureRequest.Builder builder);

    /* JADX INFO: renamed from: b */
    CameraCaptureSession.CaptureCallback mo141881b(@NonNull CaptureRequest.Builder builder, AtomicBoolean atomicBoolean, boolean z);

    /* JADX INFO: renamed from: c */
    CameraCaptureSession.CaptureCallback mo141882c(@NonNull CaptureRequest.Builder builder, boolean z);

    /* JADX INFO: renamed from: d */
    int mo141883d();
}
