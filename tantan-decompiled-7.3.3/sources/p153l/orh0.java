package p153l;

import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.room.RoomDatabase;
import com.p074ss.android.ttvecamera.TECameraSettings;
import com.p074ss.android.ttvecamera.TEFocusSettings;

/* JADX INFO: loaded from: classes11.dex */
@RequiresApi(api = 21)
public abstract class orh0 implements p6m {

    /* JADX INFO: renamed from: b */
    protected TEFocusSettings f148703b;

    /* JADX INFO: renamed from: c */
    protected TECameraSettings f148704c;

    /* JADX INFO: renamed from: d */
    protected boolean f148705d = true;

    /* JADX INFO: renamed from: e */
    public void mo159703e(@NonNull CaptureRequest.Builder builder, @NonNull Rect rect) {
        builder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, RoomDatabase.MAX_BIND_PARAMETER_CNT)});
        builder.set(CaptureRequest.CONTROL_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        builder.setTag("FOCUS_TAG");
    }

    /* JADX INFO: renamed from: f */
    public void mo159704f(@NonNull CaptureRequest.Builder builder, @NonNull Rect rect) {
        builder.setTag("FOCUS_TAG");
        builder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, RoomDatabase.MAX_BIND_PARAMETER_CNT)});
    }

    /* JADX INFO: renamed from: g */
    public void m168921g(TECameraSettings tECameraSettings) {
        this.f148704c = tECameraSettings;
        this.f148705d = tECameraSettings.f56193j;
    }

    /* JADX INFO: renamed from: h */
    public void m168922h(TEFocusSettings tEFocusSettings) {
        this.f148703b = tEFocusSettings;
    }
}
