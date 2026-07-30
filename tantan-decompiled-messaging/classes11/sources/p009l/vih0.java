package p009l;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.Range;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.p008ss.android.ttvecamera.C0735f;
import com.p008ss.android.ttvecamera.C0743g;
import com.p008ss.android.ttvecamera.TEFrameRateRange;
import java.text.DecimalFormat;
import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@RequiresApi(api = 21)
public class vih0 {

    /* JADX INFO: renamed from: b */
    protected static String f21594b = "-1";

    /* JADX INFO: renamed from: c */
    public static int f21595c = 1;

    /* JADX INFO: renamed from: a */
    protected Context f21596a;

    public vih0(Context context) {
        this.f21596a = context;
    }

    /* JADX INFO: renamed from: c */
    public static vih0 m23382c(Context context, int i) {
        vih0 vih0Var;
        C0743g.m11169e("TECameraHardware2Proxy", "getDeviceProxy, cameraType: " + i);
        f21595c = i;
        synchronized (vih0.class) {
            try {
                if (i == 6) {
                    vih0Var = new rih0(context);
                } else if (tih0.m22546d()) {
                    vih0Var = new ejh0(context);
                } else if (tih0.m22545c()) {
                    vih0Var = new djh0(context);
                } else if (tih0.m22544b()) {
                    vih0Var = new wih0(context);
                } else if (tih0.m22543a()) {
                    vih0Var = new sih0(context);
                } else {
                    C0743g.m11166b("TECameraHardware2Proxy", "Unknown platform");
                    vih0Var = new vih0(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vih0Var;
    }

    /* JADX INFO: renamed from: a */
    public int m23383a(@NonNull CameraCharacteristics cameraCharacteristics, @NonNull CaptureRequest.Builder builder, boolean z) {
        if (cameraCharacteristics == null || builder == null) {
            return -100;
        }
        if (!z) {
            C0743g.m11169e("TECameraHardware2Proxy", "configStabilization not toggle");
            builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
            return 0;
        }
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i : iArr) {
                C0743g.m11169e("TECameraHardware2Proxy", "EIS mode: " + i);
                if (i == 1) {
                    builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                    builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
                    C0743g.m11169e("TECameraHardware2Proxy", "Enable EIS");
                    return 0;
                }
            }
        } else {
            C0743g.m11169e("TECameraHardware2Proxy", "Don't supported EIS");
        }
        int[] iArr2 = (int[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
        if (iArr2 == null) {
            C0743g.m11169e("TECameraHardware2Proxy", "Don't supported OIS");
            return -200;
        }
        for (int i2 : iArr2) {
            C0743g.m11169e("TECameraHardware2Proxy", "OIS mode: " + i2);
            if (i2 == 1) {
                builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
                builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
                C0743g.m11169e("TECameraHardware2Proxy", "Enable OIS");
                return 0;
            }
        }
        return -200;
    }

    /* JADX INFO: renamed from: b */
    public void mo21668b(int i, CameraManager cameraManager) {
        try {
            f21594b = m23388i(cameraManager.getCameraIdList(), cameraManager);
            C0743g.m11169e("TECameraHardware2Proxy", "fillWideCameraID mWideCameraID = " + f21594b);
        } catch (CameraAccessException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: d */
    public TEFrameRateRange m23384d(CameraCharacteristics cameraCharacteristics, int i, int i2, int i3, int i4) {
        Range[] rangeArr;
        TEFrameRateRange tEFrameRateRange = new TEFrameRateRange(i, i2);
        if (cameraCharacteristics == null || (rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES)) == null) {
            return tEFrameRateRange;
        }
        ArrayList arrayList = new ArrayList(rangeArr.length);
        int i5 = tEFrameRateRange.fpsUnitFactor;
        int i6 = 0;
        for (Range range : rangeArr) {
            int[] iArr = {((Integer) range.getLower()).intValue() * i5, ((Integer) range.getUpper()).intValue() * i5};
            arrayList.add(iArr);
            int i7 = iArr[1];
            if (i6 < i7) {
                i6 = i7;
            }
        }
        ajh0.m11494b("te_record_camera_max_fps", i6);
        int[] iArrM11068s = C0735f.m11068s(i3, i4, tEFrameRateRange.m10887b(), arrayList);
        tEFrameRateRange.min = iArrM11068s[0];
        tEFrameRateRange.max = iArrM11068s[1];
        return tEFrameRateRange;
    }

    /* JADX INFO: renamed from: e */
    public float m23385e(@NonNull CameraCharacteristics cameraCharacteristics, int i, float f) {
        Float f2 = (Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f2 == null) {
            return 0.0f;
        }
        float fFloatValue = f2.floatValue();
        if (f == -1.0f) {
            return i != 6 ? fFloatValue / 2.0f : fFloatValue;
        }
        return fFloatValue * f;
    }

    /* JADX INFO: renamed from: f */
    public float m23386f(@NonNull CameraCharacteristics cameraCharacteristics) {
        float fFloatValue = ((Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        try {
            return Float.valueOf(new DecimalFormat("0.00").format(((rect.width() - ((int) (rect.width() / fFloatValue))) / fFloatValue) / rect.width()).trim()).floatValue();
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0.01f;
        }
    }

    /* JADX INFO: renamed from: g */
    public String m23387g(String[] strArr, CameraManager cameraManager) {
        String str = "0";
        try {
            float f = Float.MIN_VALUE;
            for (String str2 : strArr) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str2);
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if (num == null || num.intValue() != 0) {
                    float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                    if (fArr == null || fArr.length == 0) {
                        fArr = new float[]{0.0f};
                    }
                    float f2 = fArr[0];
                    if (f2 > f) {
                        str = str2;
                        f = f2;
                    }
                }
            }
            return str;
        } catch (CameraAccessException e) {
            e = e;
            e.printStackTrace();
            return str;
        } catch (IllegalArgumentException e2) {
            e = e2;
            e.printStackTrace();
            return str;
        }
    }

    /* JADX INFO: renamed from: h */
    public String mo21669h() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        CameraManager cameraManager = (CameraManager) this.f21596a.getSystemService("camera");
        try {
            String strM23388i = m23388i(cameraManager.getCameraIdList(), cameraManager);
            C0743g.m11169e("TECameraHardware2Proxy", "getWideAngleID, cost time = " + (System.currentTimeMillis() - jCurrentTimeMillis));
            return strM23388i;
        } catch (Throwable th) {
            C0743g.m11167c("TECameraHardware2Proxy", "exception occurs when getWideAngleID", th);
            return "0";
        }
    }

    /* JADX INFO: renamed from: i */
    public String m23388i(String[] strArr, CameraManager cameraManager) {
        String str = "0";
        try {
            float f = Float.MAX_VALUE;
            for (String str2 : strArr) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str2);
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if (num == null || num.intValue() != 0) {
                    float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                    float f2 = (fArr == null || fArr.length <= 0) ? -1.0f : fArr[0];
                    if (f2 != -1.0f && f2 <= f) {
                        str = str2;
                        f = f2;
                    }
                }
            }
            return str;
        } catch (Throwable th) {
            C0743g.m11167c("TECameraHardware2Proxy", "exception occurs when getWideAngleID: ", th);
            return str;
        }
    }

    /* JADX INFO: renamed from: j */
    public Range<Float> m23389j(@NonNull CameraCharacteristics cameraCharacteristics) {
        Range<Float> range;
        return (Build.VERSION.SDK_INT < 30 || (range = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE)) == null) ? new Range<>(Float.valueOf(0.0f), (Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)) : range;
    }

    /* JADX INFO: renamed from: k */
    public boolean m23390k() {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public boolean m23391l(@NonNull CameraCharacteristics cameraCharacteristics) {
        int[] iArr;
        return (cameraCharacteristics == null || (iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) == null || iArr.length <= 0) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public boolean m23392m(@NonNull CameraCharacteristics cameraCharacteristics) {
        return cameraCharacteristics != null && ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() >= 1;
    }

    /* JADX INFO: renamed from: n */
    public boolean m23393n(CameraCharacteristics cameraCharacteristics, int i) {
        if (cameraCharacteristics == null) {
            return false;
        }
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        int iIntValue = num != null ? num.intValue() : -1;
        if (iIntValue < 0 || iIntValue > 4) {
            C0743g.m11166b("TECameraHardware2Proxy", "Invalid hardware level = " + iIntValue);
            return false;
        }
        int i2 = tih0.f20722b[iIntValue];
        ajh0.m11494b("te_record_camera_hardware_level", i2);
        if (i2 >= i) {
            C0743g.m11169e("TECameraHardware2Proxy", "Camera hardware level supported, deviceLevel = " + i2 + ", require = " + i);
            return true;
        }
        C0743g.m11166b("TECameraHardware2Proxy", "Camera hardware level not supported, deviceLevel = " + i2 + ", require = " + i);
        return false;
    }

    /* JADX INFO: renamed from: o */
    public boolean m23394o(@NonNull CameraCharacteristics cameraCharacteristics) {
        if (cameraCharacteristics == null) {
            return false;
        }
        for (int i : (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES)) {
            if (i == 11) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public boolean m23395p(@NonNull CameraCharacteristics cameraCharacteristics) {
        return cameraCharacteristics != null && ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() >= 1;
    }

    /* JADX INFO: renamed from: q */
    public boolean m23396q(@NonNull CameraCharacteristics cameraCharacteristics) {
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX INFO: renamed from: r */
    public boolean m23397r(@NonNull CameraCharacteristics cameraCharacteristics) {
        boolean zM23391l = m23391l(cameraCharacteristics);
        ?? r0 = zM23391l;
        if (m23396q(cameraCharacteristics)) {
            r0 = (zM23391l ? 1 : 0) | 2;
        }
        C0743g.m11169e("TECameraHardware2Proxy", "Stabilization type: " + Integer.toBinaryString(r0));
        ajh0.m11494b("te_record_camera_stabilization", (long) r0);
        return r0 > 0;
    }

    /* JADX INFO: renamed from: s */
    public boolean mo21670s() {
        return !mo21669h().equals("0");
    }

    /* JADX INFO: renamed from: t */
    public boolean m23398t(CameraCharacteristics cameraCharacteristics) {
        return ((Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE)).booleanValue();
    }
}
