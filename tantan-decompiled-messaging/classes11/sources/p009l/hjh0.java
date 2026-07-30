package p009l;

import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.p008ss.android.ttvecamera.TECameraSettings;
import com.p008ss.android.ttvecamera.TEFocusSettings;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@RequiresApi(api = 21)
public abstract class hjh0 implements z3m {

    /* JADX INFO: renamed from: b */
    protected TEFocusSettings f14152b;

    /* JADX INFO: renamed from: c */
    protected TECameraSettings f14153c;

    /* JADX INFO: renamed from: d */
    protected boolean f14154d = true;

    /* JADX INFO: renamed from: e */
    public void mo14483e(@NonNull CaptureRequest.Builder builder, @NonNull Rect rect) {
        builder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
        builder.set(CaptureRequest.CONTROL_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        builder.setTag("FOCUS_TAG");
    }

    /* JADX INFO: renamed from: f */
    public void mo14484f(@NonNull CaptureRequest.Builder builder, @NonNull Rect rect) {
        builder.setTag("FOCUS_TAG");
        builder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
    }

    /* JADX INFO: renamed from: g */
    public void m15861g(TECameraSettings tECameraSettings) {
        this.f14153c = tECameraSettings;
        this.f14154d = tECameraSettings.f8951j;
    }

    /* JADX INFO: renamed from: h */
    public void m15862h(TEFocusSettings tEFocusSettings) {
        this.f14152b = tEFocusSettings;
    }
}
