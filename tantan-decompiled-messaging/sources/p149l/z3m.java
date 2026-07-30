package p149l;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public interface z3m {

    /* JADX INFO: renamed from: a */
    public static final MeteringRectangle[] f201382a = {new MeteringRectangle(0, 0, 0, 0, 0)};

    /* JADX INFO: renamed from: l.z3m$a */
    public interface InterfaceC21616a {
        /* JADX INFO: renamed from: a */
        int mo80763a();

        /* JADX INFO: renamed from: b */
        void mo80765b(CameraCaptureSession cameraCaptureSession, CaptureRequest.Builder builder);

        /* JADX INFO: renamed from: d */
        int mo80767d();
    }

    /* JADX INFO: renamed from: a */
    void mo102389a(@NonNull CaptureRequest.Builder builder);

    /* JADX INFO: renamed from: b */
    CameraCaptureSession.CaptureCallback mo102390b(@NonNull CaptureRequest.Builder builder, AtomicBoolean atomicBoolean, boolean z);

    /* JADX INFO: renamed from: c */
    CameraCaptureSession.CaptureCallback mo102391c(@NonNull CaptureRequest.Builder builder, boolean z);

    /* JADX INFO: renamed from: d */
    int mo102392d();
}
