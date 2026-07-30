package p149l;

import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.room.RoomDatabase;
import com.p069ss.android.ttvecamera.TECameraSettings;
import com.p069ss.android.ttvecamera.TEFocusSettings;

/* JADX INFO: loaded from: classes11.dex */
@RequiresApi(api = 21)
public abstract class hjh0 implements z3m {

    /* JADX INFO: renamed from: b */
    protected TEFocusSettings f108082b;

    /* JADX INFO: renamed from: c */
    protected TECameraSettings f108083c;

    /* JADX INFO: renamed from: d */
    protected boolean f108084d = true;

    /* JADX INFO: renamed from: e */
    public void mo121596e(@NonNull CaptureRequest.Builder builder, @NonNull Rect rect) {
        builder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, RoomDatabase.MAX_BIND_PARAMETER_CNT)});
        builder.set(CaptureRequest.CONTROL_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        builder.setTag("FOCUS_TAG");
    }

    /* JADX INFO: renamed from: f */
    public void mo121597f(@NonNull CaptureRequest.Builder builder, @NonNull Rect rect) {
        builder.setTag("FOCUS_TAG");
        builder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, RoomDatabase.MAX_BIND_PARAMETER_CNT)});
    }

    /* JADX INFO: renamed from: g */
    public void m131374g(TECameraSettings tECameraSettings) {
        this.f108083c = tECameraSettings;
        this.f108084d = tECameraSettings.f55345j;
    }

    /* JADX INFO: renamed from: h */
    public void m131375h(TEFocusSettings tEFocusSettings) {
        this.f108082b = tEFocusSettings;
    }
}
