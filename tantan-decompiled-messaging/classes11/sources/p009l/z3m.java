package p009l;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public interface z3m {

    /* JADX INFO: renamed from: a */
    public static final MeteringRectangle[] f23333a = {new MeteringRectangle(0, 0, 0, 0, 0)};

    /* JADX INFO: renamed from: l.z3m$a */
    public interface InterfaceC1341a {
        /* JADX INFO: renamed from: a */
        int mo11114a();

        /* JADX INFO: renamed from: b */
        void mo11116b(CameraCaptureSession cameraCaptureSession, CaptureRequest.Builder builder);

        /* JADX INFO: renamed from: d */
        int mo11118d();
    }

    /* JADX INFO: renamed from: a */
    void mo12076a(@NonNull CaptureRequest.Builder builder);

    /* JADX INFO: renamed from: b */
    CameraCaptureSession.CaptureCallback mo12077b(@NonNull CaptureRequest.Builder builder, AtomicBoolean atomicBoolean, boolean z);

    /* JADX INFO: renamed from: c */
    CameraCaptureSession.CaptureCallback mo12078c(@NonNull CaptureRequest.Builder builder, boolean z);

    /* JADX INFO: renamed from: d */
    int mo12079d();
}
